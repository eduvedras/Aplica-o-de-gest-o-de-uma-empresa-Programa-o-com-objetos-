package woo.app.main;

import pt.tecnico.po.ui.Command;  
import pt.tecnico.po.ui.DialogException;
import pt.tecnico.po.ui.Input;
import woo.Storefront;
import woo.app.exceptions.FileOpenFailedException;
import woo.exceptions.MissingFileAssociationException;   
import java.io.IOException;
import java.io.FileNotFoundException;                                                                                                         import pt.tecnico.po.ui.DialogException;                                                                                                      import pt.tecnico.po.ui.Input;                                                                                                                import woo.Storefront;                                                                                                                        //FIXME import other classes

/**
 * Save current state to file under current name (if unnamed, query for name).
 */
public class DoSave extends Command<Storefront> {

  //FIXME add input fields
  private Input<String> _filename;
  private Storefront _receiver;

  /** @param receiver */
  public DoSave(Storefront receiver) {
    super(Label.SAVE, receiver);
    _receiver = receiver;
    //FIXME init input fields
    if(receiver.getFilename() == null){
      _filename = _form.addStringInput(Message.newSaveAs());
    }
  }

  /** @see pt.tecnico.po.ui.Command#execute() */
  @Override
  public final void execute() throws DialogException {
    //FIXME implement command
    try{
      if(_receiver.getFilename() == null){
        _form.parse();
        _receiver.setFilename(_filename.value());
        _receiver.saveAs(_filename.value());
      }
      _receiver.save();
    }
    
    catch(MissingFileAssociationException e){
      e.printStackTrace();
    }
    catch(FileNotFoundException e){
      e.printStackTrace();
    }
    catch(IOException e){
      e.printStackTrace();
    }
  }
}
