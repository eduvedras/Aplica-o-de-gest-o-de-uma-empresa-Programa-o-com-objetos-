#!/bin/zsh

CLASSPATH=/home/eduvedras/PO/po-uuilib-201708311009/po-uuilib.jar:/home/eduvedras/PO/project/woo-core/woo-core.jar:/home/eduvedras/PO/project/woo-app/woo-app.jar

for x in auto-tests/*.in; do
    if [ -e $x:r.import ]; then
        java -cp $CLASSPATH -Dimport=$x:r.import -Din=$x -Dout=$x:r.outhyp woo.app.App
    else
        java -cp $CLASSPATH                      -Din=$x -Dout=$x:r.outhyp woo.app.App
    fi

    diff -cBb -w $x:r.out $x:r.outhyp > $x:r.diff
    if [ -s $x:r.diff ]; then
        echo "FAIL: $x. See file $x:r.diff"
    else
        echo -n "."
        rm -f $x:r.diff $x:r.outhyp 
    fi
done

rm -f saved*

echo "Done."

