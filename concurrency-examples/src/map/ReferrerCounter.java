package map;
/**
*
* @author chintanpa
* 
*/
public interface ReferrerCounter
{

	void add(String referrer);

	Long get(String referrer);
}
