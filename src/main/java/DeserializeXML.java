import com.thoughtworks.xstream.XStream;


public class DeserializeXML {
    public ValCurs convert(String s){
        XStream xstream = new XStream();
        xstream.addImplicitCollection(ValCurs.class, "Valutes");
        xstream.useAttributeFor(ValCurs.class, "Date");
        xstream.useAttributeFor(ValCurs.class, "name");
        xstream.useAttributeFor(Valute.class, "ID");

        ValCurs ValCurs = (ValCurs) xstream.fromXML(s);
        return ValCurs;

    }
}
