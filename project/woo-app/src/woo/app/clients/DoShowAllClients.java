package woo.app.clients;

import pt.tecnico.po.ui.Command;
import pt.tecnico.po.ui.DialogException;
import woo.Storefront;                                                                                                             import pt.tecnico.po.ui.DialogException;                                                                                                      import pt.tecnico.po.ui.Input;                                                                                                                import woo.Storefront;                                                                                                                        //FIXME import other classes

/**
 * Show all clients.
 */
public class DoShowAllClients extends Command<Storefront> {

  //FIXME add input fields
  private Storefront _storefront;

  public DoShowAllClients(Storefront storefront) {
    super(Label.SHOW_ALL_CLIENTS, storefront);
    _storefront = storefront;
                //FIXME init input fields
  }

  @Override
  public void execute() throws DialogException {
    //FIXME implement command
    _display.addLine(_storefront.showAllClients());
    _display.display();
  }
}
