package objects3D;

import org.lwjgl.opengl.GL11;
import GraphicsObjects.Point4f;
import GraphicsObjects.Vector4f;
import java.math.*;

public class Cylinder {

	
	public Cylinder() { 
	}
	
	// remember to use Math.PI isntead PI 
	// Implement using notes and examine Tetrahedron to aid in the coding  look at lecture  7 , 7b and 8 
	public void DrawCylinder(float radius, float height, int nSegments ) {
		for (float i = (float) 0.0; i < nSegments; i += 1.0){ 
			/* a loop around circumference of a tube */
			float angle = (float) (Math.PI * i * 2.0 / nSegments);
			float nextAngle = (float) (Math.PI * (i + 1.0) * 2.0 / nSegments);
			/* compute sin & cosine */
			float x1 = (float) ((float) radius * Math.sin(angle)), y1 = (float) ((float) radius * Math.cos(angle));
			float x2 = (float) ((float) radius * Math.sin(nextAngle)), y2 = (float) ((float) radius * Math.cos(nextAngle));
			/* draw bottom plate */
			GL11.glBegin(GL11.GL_TRIANGLES);
			Vector4f v1 = new Vector4f(x1-x2,y1-y2,(float)0.0,(float)0.0); 
			Vector4f w1 = new Vector4f(x1,y1,(float)0.0,(float)0.0);
			Vector4f normal1 = v1.cross(w1).Normal();
			GL11.glNormal3f(normal1.x, normal1.y, normal1.z);
			//set normal to retrace its light.
			GL11.glVertex3f(x1,y1,(float) 0.0);
			GL11.glVertex3f(x2,y2,(float) 0.0);
			GL11.glVertex3f((float)0.0,(float) 0.0,(float) 0.0);
			GL11.glEnd();
			
			/* draw top plate */
			GL11.glBegin(GL11.GL_TRIANGLES);
			Vector4f v3 = new Vector4f(x1-x2,y1-y2,(float)0.0,(float)0.0); 
			Vector4f w3 = new Vector4f(x1,y1,(float)0.0,(float)0.0);
			Vector4f normal3 = v3.cross(w3).Normal();
			GL11.glNormal3f(normal3.x, normal3.y, normal3.z);
			//set normal to retrace its light.
			GL11.glVertex3f(x1,y1,height);
			GL11.glVertex3f(x2,y2,height);
			GL11.glVertex3f((float)0.0,(float) 0.0,height);
			GL11.glEnd();
			/* draw top (green) triangle */
			GL11.glBegin(GL11.GL_TRIANGLES);
			Vector4f v2 = new Vector4f(x1-x2,y1-y2,(0 - height),(float)0.0); 
			Vector4f w2 = new Vector4f((float)0.0,(float)0.0,(0 - height),(float)0.0);
			Vector4f normal2 = v2.cross(w2).Normal();
			GL11.glNormal3f(normal2.x, normal2.y, normal2.z);
		 	//GL11.glNormal3f(normal.x, normal.y, normal.z);
			GL11.glVertex3f(x1,y1,(float) 0.0);
			//VertexAt(x1, y1, 0.0);
			GL11.glVertex3f(x2,y2,height);
			//VertexAt(x2, y2, 1.0);
			GL11.glVertex3f(x1,y1,height);
			GL11.glEnd();
			//VertexAt(x1, y1, 1.0);
			/* draw bottom (red) triangle */
			GL11.glBegin(GL11.GL_TRIANGLES);
			Vector4f v4= new Vector4f(x1-x2,y1-y2,(float)0.0,(float)0.0); 
			Vector4f w4 = new Vector4f(x1-x2,y1-y2,(0 -height),(float)0.0);
			Vector4f normal4 = v4.cross(w4).Normal();
			GL11.glNormal3f(normal4.x, normal4.y, normal4.z);
			//set normal to retrace its light.
			GL11.glVertex3f(x1,y1,(float) 0.0);
			//VertexAt(x1, y1, 0.0);
			GL11.glVertex3f(x2,y2,(float) 0.0);
			//VertexAt(x2, y2, 0.0);
			GL11.glVertex3f(x2,y2,height);
			GL11.glEnd();
			//VertexAt(x2, y2, 1.0);
		} /* a loop around circumference of a tube */
	}
}