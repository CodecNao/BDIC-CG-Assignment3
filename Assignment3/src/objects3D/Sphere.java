package objects3D;

import org.lwjgl.opengl.GL11;

import GraphicsObjects.Point4f;

public class Sphere {

	
	public Sphere() {

	}
	// Implement using notes and examine Tetrahedron to aid in the coding  look at lecture  7 , 7b and 8 
	// 7b should be your primary source, we will cover more about circles in later lectures to understand why the code works 
	public void DrawSphere(float radius,float nSlices,float nSegments) {
		//using a theta and phi to judge the location of the sphere in the surface.
		
		float inctheta = (float) ((2.0f * Math.PI) / nSlices); 
		float incphi = (float) (Math.PI / nSegments); 
		
		
		
		
		for(float theta=(float)-Math.PI;theta < (float)Math.PI;theta += inctheta){
			//calculate the point
			for(float phi=-((float)Math.PI / 2.0f);phi < ((float)Math.PI/2.0f);phi += incphi){
				//set a vertex in a rectangle in a sphere surface (phi + incohi,theta + inctheta)
				float   x2 = (float) (radius * Math.cos(phi + incphi) * Math.cos(theta + inctheta)),
						y2 = (float) (radius * Math.cos(phi + incphi) * Math.sin(theta + inctheta)),
						z2 = (float) (radius * Math.sin(phi + incphi));
				//set a vertex in a rectangle in a sphere surface (phi + incohi,theta - inctheta)
				float   x3 = (float) (radius * Math.cos(phi + incphi) * Math.cos(theta - inctheta)),
						y3 = (float) (radius * Math.cos(phi + incphi) * Math.sin(theta - inctheta)),
						z3 = (float) (radius * Math.sin(phi + incphi));
				//set a vertex in a rectangle in a sphere surface (phi - incohi,theta + inctheta)
				float   x4 = (float) (radius * Math.cos(phi - incphi) * Math.cos(theta + inctheta)),
						y4 = (float) (radius * Math.cos(phi - incphi) * Math.sin(theta + inctheta)),
						z4 = (float) (radius * Math.sin(phi - incphi));
				//set a vertex in a rectangle in a sphere surface (phi - incohi,theta - inctheta)
				float   x1 =(float) ((float)radius * Math.cos(phi - incphi) * Math.cos(theta - inctheta)),
						y1 =(float) ((float)radius * Math.cos(phi - incphi) * Math.sin(theta - inctheta)),
						z1 = (float) (radius * Math.sin(phi - incphi));
				//  (phi-incphi,theta+inctheta)     (phi+incphi,theta+inctheta)
				//
				//  
				//                          (phi,theta)
				// 
				//
				//  (phi-incphi,theta+inctheta)     (phi+incphi,theta-inctheta)
				//draw the sphere
				//more nslices and nsegments,the sphere is more vivid. 
				GL11.glBegin(GL11.GL_QUADS);
				GL11.glNormal3f(x1, y1, z1);
				//set normal to retrace its light.
				GL11.glVertex3f(x1, y1, z1);
				GL11.glVertex3f(x2, y2, z2);
				GL11.glVertex3f(x3, y3, z3);
				GL11.glVertex3f(x4, y4, z4);
				GL11.glEnd();
			}
		}
		
		
		
	}
}
