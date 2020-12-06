package woo.app.suppliers;

import pt.tecnico.po.ui.Command;    
import pt.tecnico.po.ui.DialogException;
import woo.Storefront;                                                                                                          import pt.tecnico.po.ui.DialogException;                                                                                                      import pt.tecnico.po.ui.Input;                                                                                                                import woo.Storefront;                                                                                                                        //FIXME import other classes

/**
 * Show all suppliers.
 */
public class DoShowSuppliers extends Command<Storefront> {

  private Storefront _receiver;

  public DoShowSuppliers(Storefront receiver) {
    super(Label.SHOW_ALL_SUPPLIERS, receiver);
    _receiver = receiver;
  }

  @Override
  public void execute() throws DialogException {
    _display.addLine(_receiver.showSuppliers());
    _display.display();
  }
}
