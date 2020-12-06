package woo.app.clients;

import pt.tecnico.po.ui.Command;   
import pt.tecnico.po.ui.Input;
import pt.tecnico.po.ui.DialogException;
import woo.app.exceptions.UnknownClientKeyException;  
import woo.exceptions.NoSuchClientKeyException;
import woo.Storefront;                                                                                                           import pt.tecnico.po.ui.DialogException;                                                                                                      import pt.tecnico.po.ui.Input;                                                                                                                import woo.Storefront;                                                                                                                        //FIXME import other classes

/**
 * Show client.
 */
public class DoShowClient extends Command<Storefront> {

  //FIXME add input fields
  private Input<String> _key;
  private Storefront _storefront;

  public DoShowClient(Storefront storefront) {
    super(Label.SHOW_CLIENT, storefront);
    _storefront = storefront;
    //FIXME init input fields
    _key = _form.addStringInput(Message.requestClientKey());
  }

  @Override
  public void execute() throws DialogException,UnknownClientKeyException {
    //FIXME implement command
    _form.parse();
    try{
      _display.addLine(_storefront.showClient(_key.value()));
      _display.display();
    }
    catch(NoSuchClientKeyException e){
      throw new UnknownClientKeyException(_key.value());
    }
  }

}
