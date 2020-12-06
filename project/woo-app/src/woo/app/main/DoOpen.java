package woo.app.main;

import pt.tecnico.po.ui.Command;
import pt.tecnico.po.ui.DialogException;
import pt.tecnico.po.ui.Input;
import woo.Storefront;
import woo.app.exceptions.FileOpenFailedException;
import woo.exceptions.UnavailableFileException;
import java.io.IOException;
//FIXME import other classes

/**
 * Open existing saved state.
 */
public class DoOpen extends Command<Storefront> {

  //FIXME add input fields
  private Input<String> _filename;
  private Storefront _receiver;

  /** @param receiver */
  public DoOpen(Storefront receiver) {
    super(Label.OPEN, receiver);
    _receiver = receiver;
    //FIXME init input fields
    _filename = _form.addStringInput(Message.openFile());
  }

  /** @see pt.tecnico.po.ui.Command#execute() */
  @Override
  public final void execute() throws DialogException,FileOpenFailedException {
    
    try {
      //FIXME implement command
      _form.parse();
      _receiver.load(_filename.value());
    } 
    catch (UnavailableFileException ufe) {
      throw new FileOpenFailedException(ufe.getFilename());
    }
    
  }

}
