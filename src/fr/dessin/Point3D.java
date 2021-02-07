package fr.dessin;

public class Point3D extends Point2D {
	private int z;

	public Point3D() {
		this(0, 0, 0);
	}

	public Point3D(int vX, int vY, int vZ) {
		super(vX, vY);
		this.setZ(vZ);
	}

	public int getZ() {
		return this.z;
	}

	public void setZ(int dZ) {
		this.z = dZ;
	}
	
    public void translater(int dX, int dY, int dZ) {
    		super.translater(dX, dY);
    		this.setZ(this.getZ() + dZ);
    	}
    
    public void afficher() {
		System.out.println("Point3D [" + this.getX() + ", " + this.getY() + ", " + this.getZ() + "]");
    	
    }
}
	
