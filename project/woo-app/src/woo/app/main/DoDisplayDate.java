package woo.app.main;

import pt.tecnico.po.ui.Command;
import pt.tecnico.po.ui.DialogException;                                                                                  
import pt.tecnico.po.ui.Input;              
import woo.Storefront;                                                                                                                    

/**
 * Show current date.
 */
public class DoDisplayDate extends Command<Storefront> {

  //FIXME add input fields
  private Storefront _receiver;

  public DoDisplayDate(Storefront receiver) {
    super(Label.SHOW_DATE, receiver);
    //FIXME init input fields
    _receiver = receiver;
  }

  @Override
  public final void execute() throws DialogException {
    //FIXME implement command
    _display.addLine(Message.currentDate(_receiver.currentDate()));
    _display.display();
  }
}
