	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.io.UnsupportedEncodingException;
	import java.util.Locale;
	import java.util.Scanner;
	import java.io.*;
	import java.util.Locale;
	import java.util.Scanner;
	import java.io.*;
	public class ClassLab2 {
		static String file = "04.txt";
		static String file1 = "book1.txt";
		
		public static String[] TextToRowMas (String str) throws FileNotFoundException 
		{
			FileReader fin = new FileReader(str);
			//BufferedReader br = new BufferedReader(new InputStreamReader(System.in,"UTF-8"));
			//String string = new String(bytes.toArray(new Byte[0]), Charset.forName("UTF-8")); 
			
			Scanner text = new Scanner(fin);
			text.useLocale(new Locale("Russian"));
			
			int k=0;
			
			String []mas;
			mas = new String [530];
		
			while (text.hasNext()) {
				String print = text.nextLine();
				mas[k] = print;
				k++;
				//break;
			}
			int s=0;
			for(int i = 0;i<mas.length;i++)
				{
					if (mas[i]!=null) s++;
				}
			String []mas1;
			mas1 = new String[s];
			for(int i=0;i<s;i++)
			{
				mas1[i] = mas[i];
			}
			return mas1;
		}
		public static String[] SplitAndGlue (String mas[])
		{
			int s=0; 							//������� ��� ���� � �������� ��� ������ �� ������������ ������
			for(int i=0;i<mas.length;i++)
			{
				s=s+mas[i].length();
			}
			
			String []masGen;
			masGen = new String[s];	
			
			int fn=0;
			for(int j=0;j<mas.length;j++)
			{
				fn = 0;
				for(int i=0;i<s;i++)
						{
							if (masGen[i] != null)  fn++;
						};
				for(int i=0;i<mas[j].length();i++)
						{
							masGen[fn+i] = mas[j].substring(i,i+1);
						};
			}
			return masGen;
		}
		public static int[] LetToNum (String[] mas)
		{
			int[] mas1;
			mas1 = new int [mas.length];
			
			for(int i=0;i<mas.length;i++)
			{
				if(mas[i].equals("�")) mas1[i] = 0;
				if(mas[i].equals("�")) mas1[i] = 1;
				if(mas[i].equals("�")) mas1[i] = 2;
				if(mas[i].equals("�")) mas1[i] = 3;
				if(mas[i].equals("�")) mas1[i] = 4;
				if(mas[i].equals("�")) mas1[i] = 5;
				if(mas[i].equals("�")) mas1[i] = 6;
				if(mas[i].equals("�")) mas1[i] = 7;
				if(mas[i].equals("�")) mas1[i] = 8;
				if(mas[i].equals("�")) mas1[i] = 9;
				if(mas[i].equals("�")) mas1[i] = 10;
				if(mas[i].equals("�")) mas1[i] = 11;
				if(mas[i].equals("�")) mas1[i] = 12;
				if(mas[i].equals("�")) mas1[i] = 13;
				if(mas[i].equals("�")) mas1[i] = 14;
				if(mas[i].equals("�")) mas1[i] = 15;
				if(mas[i].equals("�")) mas1[i] = 16;
				if(mas[i].equals("�")) mas1[i] = 17;
				if(mas[i].equals("�")) mas1[i] = 18;
				if(mas[i].equals("�")) mas1[i] = 19;
				if(mas[i].equals("�")) mas1[i] = 20;
				if(mas[i].equals("�")) mas1[i] = 21;
				if(mas[i].equals("�")) mas1[i] = 22;
				if(mas[i].equals("�")) mas1[i] = 23;
				if(mas[i].equals("�")) mas1[i] = 24;
				if(mas[i].equals("�")) mas1[i] = 25;
				if(mas[i].equals("�")) mas1[i] = 27;
				if(mas[i].equals("�")) mas1[i] = 26;
				if(mas[i].equals("�")) mas1[i] = 28;
				if(mas[i].equals("�")) mas1[i] = 29;
				if(mas[i].equals("�")) mas1[i] = 30;
			}
			return mas1;
		}
		public static String[] NumToLet (int[] mas)
		{
			String[] mas1;
			mas1 = new String [mas.length];
			
			for(int i=0;i<mas.length;i++)
			{
				if(mas[i]==0) mas1[i] = "�";
				if(mas[i]==1) mas1[i] = "�";
				if(mas[i]==2) mas1[i] = "�";
				if(mas[i]==3) mas1[i] = "�";
				if(mas[i]==4) mas1[i] = "�";
				if(mas[i]==5) mas1[i] = "�";
				if(mas[i]==6) mas1[i] = "�";
				if(mas[i]==7) mas1[i] = "�";
				if(mas[i]==8) mas1[i] = "�";
				if(mas[i]==9) mas1[i] = "�";
				if(mas[i]==10) mas1[i] = "�";
				if(mas[i]==11) mas1[i] = "�";
				if(mas[i]==12) mas1[i] = "�";
				if(mas[i]==13) mas1[i] = "�";
				if(mas[i]==14) mas1[i] = "�";
				if(mas[i]==15) mas1[i] = "�";
				if(mas[i]==16) mas1[i] = "�";
				if(mas[i]==17) mas1[i] = "�";
				if(mas[i]==18) mas1[i] = "�";
				if(mas[i]==19) mas1[i] = "�";
				if(mas[i]==20) mas1[i] = "�";
				if(mas[i]==21) mas1[i] = "�";
				if(mas[i]==22) mas1[i] = "�";
				if(mas[i]==23) mas1[i] = "�";
				if(mas[i]==24) mas1[i] = "�";
				if(mas[i]==25) mas1[i] = "�";
				if(mas[i]==27) mas1[i] = "�";
				if(mas[i]==26) mas1[i] = "�";
				if(mas[i]==28) mas1[i] = "�";
				if(mas[i]==29) mas1[i] = "�";
				if(mas[i]==30) mas1[i] = "�";
			}
			return mas1;
		}
		public static int[] CutZero (int[] mas)
		{
			int s=0;
			for (int i=mas.length-1;i>=0;i--)
			{
				if(mas[i]!=0) break;
				s++;
			}
			int maswithoutzero[];
			maswithoutzero = new int[mas.length-s];
			for(int i=0;i<maswithoutzero.length;i++)
			{
				maswithoutzero[i] = mas[i];
			}
			return maswithoutzero;
		}
		public static int gsd (int a, int n)
		{
			int [] r;
			r = new int [n];
			
			r[0] = a;
			r[1] = n;
			for(int i = 2; i<r.length;i++)
			{
					r[i] = r[i-2] - r[i-1]*Math.abs(r[i-2]/r[i-1]);
					if(r[i] == 0) break;
			}	
			r = CutZero(r);
			int [] q;
			q = new int [r.length];
			q[0] = 0;
			
			for(int i=1; i<q.length;i++)
			{
				q[i] = Math.abs(r[i-1]/r[i]);
				
			}
			q = CutZero(q);
			int[] u;
			u = new int[r.length];
			u[0] = 1;
			u[1] = 0;
			for(int i=2;i<u.length;i++)
			{
				u[i] = u[i-2] - q[i-1]*u[i-1];
			}
			//System.out.println("gsd (" + r[0] + ", " + r[1] + ") = " + r[r.length-1]);
			return r[r.length-1];
		}
		public static int Inversed (int a, int n)
		{
			int [] r;
			r = new int [n];
			
			r[0] = a;
			r[1] = n;
			for(int i = 2; i<r.length;i++)
			{
					r[i] = r[i-2] - r[i-1]*Math.abs(r[i-2]/r[i-1]);
					if(r[i] == 0) break;
			}	
			r = CutZero(r);
			int [] q;
			q = new int [r.length];
			q[0] = 0;
			
			for(int i=1; i<q.length;i++)
			{
				q[i] = Math.abs(r[i-1]/r[i]);
				
			}
			q = CutZero(q);
			int[] u;
			u = new int[r.length];
			u[0] = 1;
			u[1] = 0;
			for(int i=2;i<u.length;i++)
			{
				u[i] = u[i-2] - q[i-1]*u[i-1];
			}
		
			if(r[r.length-1]==1)
			{
				//System.out.println("Inversed to "+ r[0] +" za mod " + r[1] + " is " + u[u.length-1]);
				return u[u.length-1];
			}
			else
				{
				//System.out.println("Inversed to "+ r[0] +" za mod " + r[1] + " doesn't exist");
				return 0;
				}
		}
		public static int[] LinComp (int a, int b, int n)
		{
			if(gsd(a,n)==1)
				{
					int[] mas;
					mas = new int[1];
					mas[0] = Inversed(a,n)*b % n;
					if(mas[0]<0) mas[0] = mas[0] + n;
					return mas;
				}
			else 
				{
					int d = gsd(a,n);
					if (b % d !=0) 
						{
							System.out.println("\nrozv nema");
							return null;
						}
					else {
						int[] x;
						x = new int [d];
						int a1 = a/d;
						int b1 = b/d;
						int n1 = n/d;
						x[0] = LinComp(a1,b1,n1)[0];
						if(x[0]<0) x[0] = x[0] + n1;
						for(int i=1;i<x.length;i++)
						{
							x[i] = x[0] + i*n1;
						}
						return x;
					}
				}
		}
		public static int[] PrintInt (int[] mas)
		{
			if(mas!=null)
			{
			for(int i=0;i<mas.length;i++)
			{
				System.out.println("mas[" + i + "] = " + mas[i]);
			}
			return mas;
			}
			else 
				{
					//System.out.println("mas is null");
					return null;
				}
		}
		public static String[] PrintStr (String[] mas)
		{
			if(mas!=null)
			{
			for(int i=0;i<mas.length;i++)
			{
				System.out.println("mas[" + i + "] = " + mas[i]);
			}
			return mas;
			}
			else 
				{
					//System.out.println("mas is null");
					return null;
				}
		}
		public static int MasX(int i)
		{
			int [] masX;
			masX = new int[5];
			masX[0] = 545;				//��
			masX[1] = 417;				//��
			masX[2] = 572;				//��
			masX[3] = 403;				//��
			masX[4] = 168;				//��

			return masX[i];
		}
		public static int MasY(int i)
		{
			int [] masY;
			masY = new int[5];
			masY[0] = 179;				//��
			masY[1] = 774;				//��
			masY[2] = 181;				//��
			masY[3] = 138;				//��
			masY[4] = 537;				//��
				
			return masY[i];
		}
		public static int[] RetA (int Y1,  int Y2, int X1, int X2)
		{
			int[] a;
			//a = new int [gsd(Xr,961)];
			a = new int[100];
			
			int X= X1-X2;
			if(X<0) X = X+961; 
			int Y= Y1-Y2;
			if(Y<0) Y = Y+961;
			a = LinComp(X, Y, 961);
			//System.out.println("\nY1 = " + Y1 + "\nY2 = " + Y2 + "\nX1 = " + X1 + "\nX2 = " + X2+"X="+X);
			if(a==null) 
				{
					System.out.println("can't return a");
					return null;
				}
			return CutZero(a);
		}
		public static int[] RetB (int Y1, int X1, int[]a)
		{
			if(a==null) 
			{
				System.out.println("can't return B");
				return null;
			}
			else
			{
			int[] b;
			b = new int[a.length];
			
			for(int i = 0;i<b.length;i++)
			{
				b[i] = (Y1 - a[i]*X1) % 961;
				if(b[i]<0) b[i] = b[i] + 961;
			}
			return b;
			}
		}
		public static int[] MasBigr(int[] mas)
		{
			int[] newmas;
			newmas = new int [mas.length/2];
			for(int i=0;i<newmas.length;i++)
			{
				newmas[i] = mas[2*i]*31 + mas[2*i+1];
			}
			return newmas;
		}
		public static int[] Decipher (int[] mas, int a, int b)
		{
			int[] newmas;
			newmas = new int [mas.length];
			if(Inversed(a,961)==0) 
				{
					System.out.println("Decipher is impossible");
					return null;
				}
			else{
					for(int i=0;i<mas.length;i++)
						{
							newmas[i] = Inversed(a,961)*(mas[i]-b) % 961;
							if(newmas[i]<0) newmas[i] = newmas[i] + 961;
						}
					return newmas;
				}
		}
		public static int[] BigrToText(int[] mas)
		{
			int[] text;
			text = new int[mas.length*2];
			
			for(int i=0;i<mas.length;i++)
			{
				text[2*i] = Math.abs(mas[i]/31);
				text[2*i+1] = mas[i] - 31*text[2*i];
			}
			return text;
		}
		public static String ToStr(String mas[])
		{
			String a = "";
			for(int i=0;i<mas.length;i++)
				{
					a = a + mas[i];
				}
			//System.out.println(a);
			return a;
		}
		public static double Freq1 (int[] mas, int l)
		{
			double s=0;
			for(int i=0;i<mas.length;i++)
			{
				if (mas[i] == l) s++;
			}
			//s = s/mas.length;
			return s;
		}
		public static double[] FreqLet (int[]mas)
		{
			double [] masFreq;
			masFreq = new double [31];
			for(int i=0;i<31;i++)
			{
				masFreq[i] = Freq1(mas, i);
				//System.out.println("masFreq[" + i + "] = " + masFreq[i]);
			}
			return masFreq;
		}
		public static double Max (double mas[])
		{
			double max = mas[0];
			int ii=0;
			for(int i=0;i<mas.length;i++)
				{
					if(mas[i]>max) 
						{
							max = mas[i];
							ii = i;
						}
				}
			System.out.println("max = [" + ii + "]" + max);
			return ii;
		}
		public static double[] PrintMasDouble (double mas[])
		{
			for(int i = 0;i<mas.length;i++)
			{
				System.out.println("mas[" + i + "] = " + mas[i]);
			}
			return mas;
		}
		public static void Recog(int [] mas)
		{
			double a = FreqLet(mas)[14]+FreqLet(mas)[5]+FreqLet(mas)[0];
			double b = FreqLet(mas)[20]+FreqLet(mas)[29]+FreqLet(mas)[25];
			if(a>Math.abs(mas.length/7) && Math.abs(b/mas.length)<0.02) 
				{
				System.out.println("good text");
				}
			System.out.println("a = " + a + "\nlength = " + mas.length + "\nb = " + b);
		}
		public static String[] Filtr( String[] mas )
		{
			for(int i=0;i<mas.length;i++)
			{
				if ("�".equals(mas[i])){
					mas[i] = "�";
				}
				if ("�".equals(mas[i])){
					mas[i] = "�";
				}
				if ("�".equals(mas[i])){
					mas[i] = "�";
				}
				if ("�".equals(mas[i])){
					mas[i] = "�";
				}
				if ("�".equals(mas[i])){
					mas[i] = "�";
				}
				if ("�".equals(mas[i])){
					mas[i] = "�";
				}
				if ("�".equals(mas[i])){
					mas[i] = "�";
				}
				if ("�".equals(mas[i])){
					mas[i] = "�";
				}
				if ("�".equals(mas[i])){
					mas[i] = "�";
				}
				if ("�".equals(mas[i])){
					mas[i] = "�";
				}
				if ("�".equals(mas[i])){
					mas[i] = "�";
				}
				if ("�".equals(mas[i])){
					mas[i] = "�";
				}
				if ("�".equals(mas[i])){
					mas[i] = "�";
				}
				if ("�".equals(mas[i])){
					mas[i] = "�";
				}
				if ("�".equals(mas[i])){
					mas[i] = "�";
				}
				if ("�".equals(mas[i])){
					mas[i] = "�";
				}
				if ("�".equals(mas[i])){
					mas[i] = "�";
				}
				if ("�".equals(mas[i])){
					mas[i] = "�";
				}
				if ("�".equals(mas[i])){
					mas[i] = "�";
				}
				if ("�".equals(mas[i])){
					mas[i] = "�";
				}
				if ("�".equals(mas[i])){
					mas[i] = "�";
				}
				if ("�".equals(mas[i])){
					mas[i] = "�";
				}
				if ("�".equals(mas[i])){
					mas[i] = "�";
				}
				if ("�".equals(mas[i])){
					mas[i] = "�";
				}
				if ("�".equals(mas[i])){
					mas[i] = "�";
				}
				if ("�".equals(mas[i])){
					mas[i] = "�";
				}
				if ("�".equals(mas[i])){
					mas[i] = "�";
				}
				if ("�".equals(mas[i])){
					mas[i] = "�";
				}
				if ("�".equals(mas[i])){
					mas[i] = "�";
				}
				if ("�".equals(mas[i])){
					mas[i] = "�";
				}
			}
			for(int i=0;i<mas.length;i++)
				{
				
					if(
						(mas[i].equals("�") == false) && 
						(mas[i].equals("�") == false) && 
						(mas[i].equals("�") == false) && 
						(mas[i].equals("�") == false) && 
						(mas[i].equals("�") == false) && 
						(mas[i].equals("�") == false) && 
						(mas[i].equals("�") == false) && 
						(mas[i].equals("�") == false) && 
						(mas[i].equals("�") == false) &&
						(mas[i].equals("�") == false) && 
						(mas[i].equals("�") == false) && 
						(mas[i].equals("�") == false) && 
						(mas[i].equals("�") == false) && 
						(mas[i].equals("�") == false) && 
						(mas[i].equals("�") == false) && 
						(mas[i].equals("�") == false) && 
						(mas[i].equals("�") == false) && 
						(mas[i].equals("�") == false) && 
						(mas[i].equals("�") == false) && 
						(mas[i].equals("�") == false) && 
						(mas[i].equals("�") == false) && 
						(mas[i].equals("�") == false) && 
						(mas[i].equals("�") == false) && 
						(mas[i].equals("�") == false) && 
						(mas[i].equals("�") == false) && 
						(mas[i].equals("�") == false) && 
						(mas[i].equals("�") == false) && 
						(mas[i].equals("�") == false) && 
						(mas[i].equals("�") == false) && 
						(mas[i].equals("�") == false) && 
						(mas[i].equals("�") == false) && 
						(mas[i].equals("�") == false) && 
						(mas[i].equals("�") == false) &&
						(mas[i].equals(" ") == false))
					{
						mas = Del(mas, i);
						i--;
					}	;
			for(int k=0;(k+1)<mas.length;k++)
					{
						if(mas[k].equals(" ") && mas[k+1].equals(" "))
						{
							mas = Del(mas, k);
							k--;
						}
					}
			}
			return mas;	
		}
		public static String[] Del (String[] mas, int i)
		{
			String masnew[];
			masnew = new String[mas.length-1];
			for(int j=0;j<i;j++)
			{
				masnew[j] = mas[j];
			}
			for(int j=i+1;j<mas.length;j++)
			{
				masnew[j-1] = mas[j];
			}
			return masnew;
		}
		public static void main(String[] args) throws FileNotFoundException
			{
				String mas[] = TextToRowMas(file);
				String mas1[] = TextToRowMas(file1);
				//PrintInt(LetToNum(SplitAndGlue(mas)));
				//System.out.println(LetToNum(SplitAndGlue(mas))[0] + "+" + LetToNum(SplitAndGlue(mas))[1] + "+" + MasBigr(LetToNum(SplitAndGlue(mas)))[0]);
				//System.out.println(Inversed(2,961));
				//PrintInt(Decipher(MasBigr(LetToNum(SplitAndGlue(mas))), 2, 3));
				
				//System.out.println(ToStr(NumToLet(BigrToText(Decipher(MasBigr(LetToNum(SplitAndGlue(mas))),390, 10)))));
				//PrintMasDouble(FreqLet(BigrToText(Decipher(MasBigr(LetToNum(SplitAndGlue(mas))),390, 10))));
				Recog(BigrToText(Decipher(MasBigr(LetToNum(SplitAndGlue(mas))),390, 10)));
				
				Recog(LetToNum(Filtr(SplitAndGlue(mas1))));
				//PrintInt(RetA(MasY(0),MasY(3),MasX(4),MasX(3)));
				//PrintInt(RetB(MasY(0), MasX(4), RetA(MasY(0),MasY(3),MasX(4),MasX(3))));
				
			}
}
