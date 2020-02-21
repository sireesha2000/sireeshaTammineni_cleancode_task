import java.util.*;
import java.io.OutputStreamWriter;
import java.lang.Math.*;
class SiCi
{
	static
	{
		Scanner sca=new Scanner(System.in);
		OutputStreamWriter streamWriter = new OutputStreamWriter(System.out);
		streamWriter.write("Hello");
		streamWriter.write("Principal Amount: ");
		int p=sca.nextInt();
		streamWriter.write("Interest Rate: ");
		double r=sca.nextInt();
		streamWriter.write("Time Period(in years): ");
		double t=sca.nextInt();
		Main obj=new Main();
		streamWriter.write("Simple interest: "+(p*t*r)/100);
		streamWriter.write("Compound interest: "+p*Math.pow(1.0+r/100.0,t)-p);
		streamWriter.flush();	
	}
	
}