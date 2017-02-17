import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.io.json.JsonHierarchicalStreamDriver;
import com.thoughtworks.xstream.io.json.JsonWriter;

import java.io.Writer;


public class ConverttoJSON {
    public String convert(ValCurs ValCurs) {
        XStream xstreamforJSON = new XStream(new JsonHierarchicalStreamDriver() {

            public HierarchicalStreamWriter createWriter(Writer writer) {
                return new JsonWriter(writer, JsonWriter.DROP_ROOT_MODE);
            }
        });
        return  xstreamforJSON.toXML(ValCurs);

    }

}
