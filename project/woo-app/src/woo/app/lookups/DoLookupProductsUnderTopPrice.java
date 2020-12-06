package woo.app.lookups;

import pt.tecnico.po.ui.Command;                                                                                                              import pt.tecnico.po.ui.DialogException;                                                                                                      import pt.tecnico.po.ui.Input;                                                                                                                import woo.Storefront;                                                                                                                        //FIXME import other classes

/**
 * Lookup products cheaper than a given price.
 */
public class DoLookupProductsUnderTopPrice extends Command<Storefront> {

  //FIXME add input fields
  private Storefront _receiver;
  private Input<Integer> _price;

  public DoLookupProductsUnderTopPrice(Storefront storefront) {
    super(Label.PRODUCTS_UNDER_PRICE, storefront);
    //FIXME init input fields
    _receiver = storefront;
    _price = _form.addIntegerInput(Message.requestPriceLimit());
  }

  @Override
  public void execute() throws DialogException {
    //FIXME implement command
    _form.parse();
    _display.addLine(_receiver.showProductsUnderTopPrice(_price.value()));
    _display.display();
  }
}
