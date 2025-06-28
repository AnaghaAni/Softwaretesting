package Abstraction;

interface Camera
{
	void takephoto();
	void recordvideos();
}

interface Zoom
{
	//Interface Methods Are Public and Abstract by Default
	void zoomIn();
	void zoomOut();
}

interface NightMode
{
	default void enableNightMode()
	{
		System.out.println("Enabled Night mode");
	}
	
	
	default void disableNightMode()
	{
		System.out.println("Disabled Night mode");
	}
}

interface CameraBrand
{
	//While writing methods in java only one of the following is only possible
	//Static or default or abstract
	static void showBrand()
	{
		System.out.println("Brand: SnapCam Pro");
	}
}

class SmartCamersChoosing implements Camera  
{
	//So when a class implements this interface,
	//it must override the method with at least the same visibility
	
	public void takephoto()
	{
		System.out.println("Photo taken");
	}
	
	public void recordvideos()
	{
		System.out.println("Video taken");
	}
	
}

class CamerCaputringAdjustment implements Zoom
{
	public void zoomIn()
	{
		System.out.println("Zooming In while capturing");
	}
	
	public void zoomOut()
	{
		System.out.println("Zooming out while capturing");
	}


}

class CamerCaputredAdjustment implements Zoom, NightMode {
    public void showOn() {
    	   NightMode.super.enableNightMode();
    }

    public void showOff() {
        NightMode.super.disableNightMode();
    }

    public void zoomIn() {
        System.out.println("Zooming In captured");
    }

    public void zoomOut() {
        System.out.println("Zooming out while captured");
    }
    
}

public class UnderstandingInterfaces2 {

	public static void main(String[] args) {
		
        CamerCaputredAdjustment cca = new CamerCaputredAdjustment();
		Zoom z = new CamerCaputringAdjustment();
		CameraBrand.showBrand();
		Camera c1 = new  SmartCamersChoosing();
		c1.takephoto();
		z.zoomIn();
		z.zoomOut();
		cca.showOn();
		cca.zoomIn();
		cca.zoomOut();
		cca.showOff();
		
		
	
		
		
		
		
	}

}
