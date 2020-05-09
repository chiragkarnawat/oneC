import java.io.File;
import java.util.List;
import java.util.Map;
 
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
 
public class Main {
 
public static void main(String[] args) throws Exception {
File csvFile = new File("data.csv") ;
File jsonFile = new File("data.json");
         CsvSchema bootstrap = CsvSchema.builder()
                .addColumn("person_id", CsvSchema.ColumnType.STRING)
                .addColumn("datetime", CsvSchema.ColumnType.STRING)
                .addColumn("floor_level", CsvSchema.ColumnType.NUMBER)
                .addColumn("building", CsvSchema.ColumnType.STRING).build().withHeader();
        CsvMapper csvMapper = new CsvMapper();
        MappingIterator<FloorAccessEvent> FloorAccessEvents = csvMapper.readerFor(FloorAccessEvent.class)
            .with(bootstrap)
            .readValues(csvFile);
        
        new ObjectMapper()
            .configure(SerializationFeature.INDENT_OUTPUT, true)
            .writeValue(jsonFile, FloorAccessEvents.readAll());

}
}