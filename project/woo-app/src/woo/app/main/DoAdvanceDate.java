package woo.app.main;

import pt.tecnico.po.ui.Command; 
import pt.tecnico.po.ui.Input;
import pt.tecnico.po.ui.DialogException;
import woo.app.exceptions.InvalidDateException;  
import woo.exceptions.NoSuchDateException;
import woo.Storefront;                                                                                                             import pt.tecnico.po.ui.DialogException;                                                                                                      import pt.tecnico.po.ui.Input;                                                                                                                import woo.Storefront;                                                                                                                        //FIXME import other classes

/**
 * Advance current date.
 */
public class DoAdvanceDate extends Command<Storefront> {
  
  //FIXME add input fields
  private Input<Integer> _date;
  private Storefront _receiver;

  public DoAdvanceDate(Storefront receiver) {
    super(Label.ADVANCE_DATE, receiver);
    _receiver = receiver;
    //FIXME init input fields
    _date = _form.addIntegerInput(Message.requestDaysToAdvance());
  }

  @Override
  public final void execute() throws DialogException,InvalidDateException {
    //FIXME implement command
    try{
      _form.parse();
      _receiver.advanceDate(_date.value());
    }
    catch(NoSuchDateException e){
      throw new InvalidDateException(_date.value());
    }
  }
}
