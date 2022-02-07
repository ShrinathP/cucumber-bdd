package stepdefinitions;

import java.util.List;
import java.util.Locale;
import java.util.Map;

import io.cucumber.core.api.TypeRegistry;
import io.cucumber.core.api.TypeRegistryConfigurer;
import io.cucumber.datatable.DataTableType;
import io.cucumber.datatable.TableCellTransformer;
import io.cucumber.datatable.TableEntryTransformer;
import io.cucumber.datatable.TableRowTransformer;

@SuppressWarnings("deprecation")
public class DataTableConfigurator implements TypeRegistryConfigurer{

	/*TypeRegistryConfigurer is deprecated
	 * for DatatableType, DocStringType and Parameter type use annotations
	 * from io.cucumber.java
	 * 
	 *****IMPORTANT***** Cucumber version 4 and Version 5 custom datatables and Parametertypes
	 * http://grasshopper.tech/1586/
	 * 
	 * Example using Annotations here:
	 * https://github.com/cucumber/cucumber-jvm/blob/master/examples/java-calculator/src/test/java/io/cucumber/examples/java/ShoppingSteps.java
	 * 
	 * Example using Lambdas here:
	 * https://github.com/cucumber/cucumber-jvm/blob/master/examples/java8-calculator/src/test/java/io/cucumber/examples/java8/ShoppingSteps.java
	 *  
	*/
	
	
	public Locale locale(){
		return Locale.ENGLISH;	
	}
	
	public void configureTypeRegistry(TypeRegistry typeregistry) {
		// TODO Auto-generated method stub
		
		//Transforming an entry
		TableEntryTransformer<Credentials> credd = new TableEntryTransformer<Credentials>() {
			public Credentials transform(Map<String, String> entry) throws Throwable {
					System.out.println(entry.toString());
					return new Credentials(entry.get("Username"), entry.get("Password"));	
			}	
		};
		
		
		DataTableType tabletype = new DataTableType(Credentials.class, credd);
		
		typeregistry.defineDataTableType(tabletype);
		

		//***1 Transforming a Single cell
		typeregistry.defineDataTableType(new DataTableType(Airport.class, new TableCellTransformer<Airport>() {
			public Airport transform(String cell) throws Throwable {
				return new Airport(cell);
			}
		}));
		
		///***2 Transforming an Entry
		//If the table does not include a header row, then a TableRowTransformer must be used. As both the the table row and entry transformer create a list of Geolocation
		typeregistry.defineDataTableType(new DataTableType(Geolocation2.class, new TableEntryTransformer<Geolocation2>() {
			public Geolocation2 transform(Map<String, String> entry) throws Throwable {
				return new Geolocation2(Double.parseDouble(entry.get("lat")), Double.parseDouble(entry.get("lon")));
			}
		}));
		
		//***3 Transforming a TableRow
		typeregistry.defineDataTableType(new DataTableType(Geolocation.class, new TableRowTransformer<Geolocation>() {
			public Geolocation transform(List<String> tableRow) throws Throwable {
				// TODO Auto-generated method stub
				return new Geolocation(Double.parseDouble(tableRow.get(0)), Double.parseDouble(tableRow.get(1)));
			}
		}));
		
	}

}
