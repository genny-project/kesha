package life.genny.map.task;

import life.genny.qwanda.attribute.Attribute;

public class AttributeMapTask extends EntityMapTask<String,Attribute> {


  public AttributeMapTask() {
    super(MapName.ATTRIBUTE); 
  }

  @Override
  public Attribute create(Attribute value) {
    return getMap().put(value.getCode(), value);

  }


}
