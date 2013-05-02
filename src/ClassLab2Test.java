import static org.junit.Assert.*;

import org.junit.Test;


public class ClassLab2Test {
	
	@Test
	public void testgsd() {
		int a = 120;
		int b = 23;
		assertEquals(ClassLab2.gsd(a,b), 1);
	}
	@Test
	public void testInversed() {
		int a = 2;
		int b = 5;
		assertEquals(ClassLab2.Inversed(a,b), -2);
	}
	@Test
	public void testLinComp1() {
		int a = 1215;
		int b = 560;
		int n = 2755;
		int mas[] = {200,751,1302,1853,2404};
		assertArrayEquals(ClassLab2.LinComp(a,b,n), mas);
	}
	@Test
	public void testLinComp2() {
		int a = 111;
		int b = 75;
		int n = 321;
		int mas[] = {99,206,313};
		assertArrayEquals(ClassLab2.LinComp(a,b,n), mas);
	}
	@Test
	public void testRetA() {
		int Y1 = 5;
		int Y2 = 4;
		int X1 = 3;
		int X2 = 2;
		int mas[] = {1};
		assertArrayEquals(ClassLab2.RetA(Y1, Y2, X1,X2), mas);
	}
	@Test
	public void testRetB() {
		int Y1 = 5;
		int Y2 = 4;
		int X1 = 3;
		int X2 = 2;
		int mas[] = {2};
		assertArrayEquals(ClassLab2.RetB(Y1,X1,ClassLab2.RetA(Y1,Y2,X1,X2)), mas);
	}
	
}
