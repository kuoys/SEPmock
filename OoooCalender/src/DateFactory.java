import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFactory {
	private Date date=null;
	public Date create(){
		if(date!=null)
			return date;
		return new Date();	
		
	}
	
	public void set(String format){
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		try {
			this.date=sdf.parse(format);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
