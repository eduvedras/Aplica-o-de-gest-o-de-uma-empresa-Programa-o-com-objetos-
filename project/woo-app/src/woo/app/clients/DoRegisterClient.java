package woo.app.clients;

import pt.tecnico.po.ui.Command;
import pt.tecnico.po.ui.Input;
import pt.tecnico.po.ui.DialogException;
import woo.app.exceptions.DuplicateClientKeyException;  
import woo.exceptions.NonUniqueClientKeyException;
import woo.Storefront;                                                                                                           import pt.tecnico.po.ui.DialogException;                                                                                                      import pt.tecnico.po.ui.Input;                                                                                                                import woo.Storefront;                                                                                                                        //FIXME import other classes

/**
 * Register new client.
 */
public class DoRegisterClient extends Command<Storefront> {

  //FIXME add input fields
  private Input<String> _key;
  private Input<String> _name;
  private Input<String> _address;
  private Storefront _storefront;

  public DoRegisterClient(Storefront storefront) {
    super(Label.REGISTER_CLIENT, storefront);
    _storefront = storefront;
    //FIXME init input fields
    _key = _form.addStringInput(Message.requestClientKey());
    _name = _form.addStringInput(Message.requestClientName());
    _address = _form.addStringInput(Message.requestClientAddress());
  }

  @Override
  public void execute() throws DialogException,DuplicateClientKeyException {
    //FIXME implement command
    _form.parse();
    try{
      _storefront.registerClient(_key.value(),_name.value(),_address.value());
    }
    catch(NonUniqueClientKeyException e){
      throw new DuplicateClientKeyException(_key.value());
    }
  }

}
