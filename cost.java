import java.util.Scanner;
import java.io.OutputStreamWriter;

public class cost
{
    static
    {
	float area,nsf,cost;
	int option;
	Scanner scan = new Scanner(System.in);
	area = scan.nextFloat();
	
	nsf=area/10.76;
	OutputStreamWriter streamWriter = new OutputStreamWriter(System.out);
      	streamWriter.write("1.Standard materials\n 2. above standard materials 3.high standard material\n4.high standard and fully automated home");
option=scan.nextInt();
if(option==1)
cost=1200*nsf;
else if(option==2)
cost=1500*nsf;
else if(option==3)
cost=1800*nsf;
else if(option==4)
cost=2500*nsf;

streamWriter.write("Cost to constuct house is "+cost);
	streamWriter.flush();
}
}
	
