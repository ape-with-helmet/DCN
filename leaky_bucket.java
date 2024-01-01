import java.math.*;
import java.util.*;
import java.util.Random;
import java.io.*;
import java.lang.*;
public class leak{
	public static void main(String[]args){
		int drop=0,mini,i,o_rate,b_size,nsec,p_remain=0;
		int packet[]=new int[100];
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Bucket Size: ");
		b_size=sc.nextInt();
		System.out.print("Enter output rate: ");
		o_rate=sc.nextInt();
		System.out.print("Enter the no of seconds to simulate: ");
		nsec=sc.nextInt();
		Random rand=new Random();
		for(i=0;i<nsec;i++){
			packet[i]=(rand.nextInt(1000));
		}
		System.out.println("------------------------");
		System.out.println("Seconds\tPacket recieved\tPacket sent\tPackets left\tPackets dropped");
		for(i=0;i<nsec;i++){
			p_remain+=packet[i];
			if(p_remain>b_size){
				drop=p_remain-b_size;
				p_remain=b_size;
				System.out.print(i+1+"\t");
				System.out.print(packet[i]+"\t\t");
				mini=Math.min(p_remain,o_rate);
				System.out.print(mini+"\t\t");
				p_remain=p_remain-mini;
				System.out.print(p_remain+"\t\t");
				System.out.println(drop+"\t\t");
				drop=0;
			}
		}
		while(p_remain!=0){
			if(p_remain>b_size){
				drop=p_remain-b_size;
			}
			mini=Math.min(p_remain,o_rate);
			System.out.print("\t"+p_remain+"\t"+mini);
			p_remain=p_remain-mini;
			System.out.print("\t"+p_remain+"\t"+drop);
			drop=0;
		}
	}
}
