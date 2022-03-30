import java.util.*;
public class KeyValueStore {
	static Map<String,List<Attribute>> hMap = new HashMap<>();
	public static void main(String[] args) throws Exception {
	
	
		generateDataStore();
		 KeyValueStore keyValueStore =	new KeyValueStore();
	//	List<String> highPopulationLevel = 	keyValueStore.search("population_level", "high");
		List<String> highPopulation =  keyValueStore.search("population", new Double(100000))   ;
		
		
		

}
	
	
		static void generateDataStore(){
		hMap.put("delhi", getAttributeList(null,null,"high",Boolean.FALSE,new String(),new Double(100000),"",""));
		hMap.put("jakarta", getAttributeList(new Double(-0.6), new Double(106), "high", Boolean.FALSE, "", null, "", ""));
		hMap.put("Bangalore", getAttributeList(new Double(12.94), new Double(77.64), "moderate", Boolean.TRUE, "", null, "", ""));
		hMap.put("India", getAttributeList(null, null, "", Boolean.FALSE, "delhi", new Double(100000), "", ""));
		hMap.put("Crocin", getAttributeList(null, null, "", Boolean.FALSE, "delhi", new Double(100000), "Cold & Flu", "GSK"));
	}
	
	static List<Attribute> getAttributeList(Double longitude,Double latitude,String population_level,Boolean freeFood,String capital,Double population,String category, String manufacturer  ){
		List<Attribute> attrList = new ArrayList<>();
		attrList.add(new Attribute("longitude",longitude));
		attrList.add(new Attribute("latitude",latitude));
		attrList.add(new Attribute("population_level",population_level));
		
		attrList.add(new Attribute("free_food",freeFood));
		attrList.add(new Attribute("capital",capital));
		attrList.add(new Attribute("population",population));
		attrList.add(new Attribute("category",category));
		attrList.add(new Attribute("manufacturer",manufacturer));
		
		return attrList;
	}
	
	
	List<String> search(String attributeKey,Object attributeValue) throws Exception{
		List<String> searchResult = new ArrayList<>();
	    for(Map.Entry<String, List<Attribute>> entry : hMap.entrySet()){
	    	String key = entry.getKey();
	    	
	    	List<Attribute> atrrbValues = entry.getValue();
	    	for(Attribute attribute : atrrbValues){
	    		if(attribute.attributeKey != null && attribute.attributeValue !=null){
	    		if(attribute.attributeKey.equals(attributeKey) && attribute.attributeValue.equals(attributeValue)){
	    			
	    			searchResult.add(key);
	    		}
	    	}
	    	
	    }
	    }

			return searchResult;
	}
	
}




class Attribute{
	String attributeKey;
	Object attributeValue;
	public Attribute(String attributeKey, Object attributeValue) {
		super();
		this.attributeKey = attributeKey;
		this.attributeValue = attributeValue;
	}
	
	
}