
package quickfix.fix40;
import quickfix.FieldNotFound;


public class OrderStatusRequest extends Message
{

  static final long serialVersionUID = 20050617;
  public static final String MSGTYPE = "H";
  

  public OrderStatusRequest()
  {
    super();
    getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
  }
  
  public OrderStatusRequest(quickfix.field.ClOrdID clOrdID, quickfix.field.Symbol symbol, quickfix.field.Side side) {
    this();
    setField(clOrdID);
    setField(symbol);
    setField(side);
  }
    
  public void set(quickfix.field.OrderID value)
  {
    setField(value);
  }

  public quickfix.field.OrderID get(quickfix.field.OrderID  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.OrderID getOrderID() throws FieldNotFound
  {
    quickfix.field.OrderID value = new quickfix.field.OrderID();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.OrderID field)
  {
    return isSetField(field);
  }

  public boolean isSetOrderID()
  {
    return isSetField(37);
  }
  
  public void set(quickfix.field.ClOrdID value)
  {
    setField(value);
  }

  public quickfix.field.ClOrdID get(quickfix.field.ClOrdID  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.ClOrdID getClOrdID() throws FieldNotFound
  {
    quickfix.field.ClOrdID value = new quickfix.field.ClOrdID();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.ClOrdID field)
  {
    return isSetField(field);
  }

  public boolean isSetClOrdID()
  {
    return isSetField(11);
  }
  
  public void set(quickfix.field.ClientID value)
  {
    setField(value);
  }

  public quickfix.field.ClientID get(quickfix.field.ClientID  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.ClientID getClientID() throws FieldNotFound
  {
    quickfix.field.ClientID value = new quickfix.field.ClientID();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.ClientID field)
  {
    return isSetField(field);
  }

  public boolean isSetClientID()
  {
    return isSetField(109);
  }
  
  public void set(quickfix.field.ExecBroker value)
  {
    setField(value);
  }

  public quickfix.field.ExecBroker get(quickfix.field.ExecBroker  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.ExecBroker getExecBroker() throws FieldNotFound
  {
    quickfix.field.ExecBroker value = new quickfix.field.ExecBroker();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.ExecBroker field)
  {
    return isSetField(field);
  }

  public boolean isSetExecBroker()
  {
    return isSetField(76);
  }
  
  public void set(quickfix.field.Symbol value)
  {
    setField(value);
  }

  public quickfix.field.Symbol get(quickfix.field.Symbol  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.Symbol getSymbol() throws FieldNotFound
  {
    quickfix.field.Symbol value = new quickfix.field.Symbol();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.Symbol field)
  {
    return isSetField(field);
  }

  public boolean isSetSymbol()
  {
    return isSetField(55);
  }
  
  public void set(quickfix.field.SymbolSfx value)
  {
    setField(value);
  }

  public quickfix.field.SymbolSfx get(quickfix.field.SymbolSfx  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.SymbolSfx getSymbolSfx() throws FieldNotFound
  {
    quickfix.field.SymbolSfx value = new quickfix.field.SymbolSfx();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.SymbolSfx field)
  {
    return isSetField(field);
  }

  public boolean isSetSymbolSfx()
  {
    return isSetField(65);
  }
  
  public void set(quickfix.field.Issuer value)
  {
    setField(value);
  }

  public quickfix.field.Issuer get(quickfix.field.Issuer  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.Issuer getIssuer() throws FieldNotFound
  {
    quickfix.field.Issuer value = new quickfix.field.Issuer();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.Issuer field)
  {
    return isSetField(field);
  }

  public boolean isSetIssuer()
  {
    return isSetField(106);
  }
  
  public void set(quickfix.field.SecurityDesc value)
  {
    setField(value);
  }

  public quickfix.field.SecurityDesc get(quickfix.field.SecurityDesc  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.SecurityDesc getSecurityDesc() throws FieldNotFound
  {
    quickfix.field.SecurityDesc value = new quickfix.field.SecurityDesc();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.SecurityDesc field)
  {
    return isSetField(field);
  }

  public boolean isSetSecurityDesc()
  {
    return isSetField(107);
  }
  
  public void set(quickfix.field.Side value)
  {
    setField(value);
  }

  public quickfix.field.Side get(quickfix.field.Side  value) throws FieldNotFound
  {
    getField(value);
    return value;
  }

  public quickfix.field.Side getSide() throws FieldNotFound
  {
    quickfix.field.Side value = new quickfix.field.Side();
    getField(value);
    return value;
  }

  public boolean isSet(quickfix.field.Side field)
  {
    return isSetField(field);
  }

  public boolean isSetSide()
  {
    return isSetField(54);
  }
  
}
  