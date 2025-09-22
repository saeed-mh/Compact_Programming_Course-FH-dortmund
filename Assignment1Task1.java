package assignmentFirst;

public class Main {

	public static void main(String[] args) {

		double sunDiameter = 865000;
		double earthDiameter = 7600;
		
		// the radius calculations for both sun and earth
		
		double sunRadius = sunDiameter/2;
		double earthRadius = earthDiameter/2;
		
		// the volume calculations for sun and earth
		
		double sunVolume = (4.0/3.0)*Math.PI*Math.pow(sunRadius, 3);
		double earthVolume = (4.0/3.0)*Math.PI*Math.pow(earthRadius, 3);
		
		// the ratio of sun's volume to the volume of earth's volume
		
		double ratio = sunVolume/earthVolume;
		
		// the results print
		
		System.out.println("the Volume of the Sun is "+sunVolume+" cubic miles");
		System.out.println("the Volume of the Earth is "+earthVolume+" cubic miles");
		System.out.println("the ratio of the Sun's volume to the Earth's volume is "+ratio);
		
		
		
	}
}
