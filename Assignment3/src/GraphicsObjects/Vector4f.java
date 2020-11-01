package GraphicsObjects;



public class Vector4f {

	public float x=0;
	public float y=0;
	public float z=0;
	public float a=0;
	
	public Vector4f() {  
		x = 0.0f;
		y = 0.0f;
		z = 0.0f;
		a = 0.0f;
	}
	 
	public Vector4f(float x, float y, float z,float a) { 
		this.x = x;
		this.y = y;
		this.z = z;
		this.a = a;
	}
	
	 //implement Vector plus a Vector 
	//Vector plus Vector equals Vector and it x and y value equal original plus to each other.
	public Vector4f PlusVector(Vector4f Additonal) { 
		Vector4f plus = new Vector4f(this.x + Additonal.x,this.y + Additonal.y,this.z + Additonal.z,this.a + Additonal.a);
		return plus;
	} 
	
	 //implement Vector minus a Vector 
	//vector minus vector is similarity as the plus condition.
	public Vector4f MinusVector(Vector4f Minus) { 
		Vector4f minus = new Vector4f(this.x - Minus.x,this.y - Minus.y,this.z - Minus.z,this.a - Minus.a);
		return minus;
	}
	
	//implement Vector plus a Point 
	//vector minus vector is similarity as the plus condition.
	public Point4f PlusPoint(Point4f Additonal) { 
		Point4f plus = new Point4f(this.x + Additonal.x,this.y + Additonal.y,this.z + Additonal.z,this.a - Additonal.a);
		return plus;
	} 
	//Do not implement Vector minus a Point as it is undefined 
	
	//Implement a Vector * Scalar 
	//vector plus a point equals a point ,the same as a point plus a vector. 
	//Implement a Vector * Scalar  and comment what the method does    ( we wont create Scalar * Vector due to expediency ) 
	public Vector4f byScalar(float scale ){
		Vector4f mult = new Vector4f(this.x * scale,this.y * scale,this.z * scale,this.a * scale);
		return mult;
	}
	
	//implement returning the negative of a  Vector  
	//Vector a = (x,y,z),its negate vector is -a(-x,-y,-z) 
	public Vector4f  NegateVector(){
		Vector4f reverse = new Vector4f(0 - this.x,0 - this.y,0 - this.z,0 - this.a);
		return reverse;
	}
	
	//implement getting the length of a Vector  
	//The length of a vector is the square root of the sum of the squares of its X, y, Z values
	//the length of a(x,y,z) is (x*x+y*y+z*z)^2
	public float length(){
		   float distance = (float) Math.sqrt((this.x * this.x) + (this.y * this.y) + (this.z * this.z) + (this.a * this.a)); 
		   return distance;
	}
	
	//implement getting the Normal  of a Vector  
	//Normal Vector is just a unit vector of this vector.
	public Vector4f Normal(){
		 Vector4f normal3D = new Vector4f((float) this.x / this.length(),(float)this.y / this.length(),(float)this.z / this.length(),(float)this.a / this.length()); 
		 return normal3D;
	} 
	
	//implement getting the dot product of Vector.Vector  
	//a(x1,y1) dot b(x2,y2) equals a constant number x1*x2+y1*y2.
	public float dot(Vector4f v){ 
		return ( this.x*v.x + this.y*v.y + this.z*v.z+ this.a*v.a);
	}
	
	// Implemented this for you to avoid confusion 
	// as we will not normally  be using 4 float vector  
	public Vector4f cross(Vector4f v)  { 
    float u0 = (this.y*v.z - z*v.y);
    float u1 = (z*v.x - x*v.z);
    float u2 = (x*v.y - y*v.x);
    float u3 = 0; //ignoring this for now  
    return new Vector4f(u0,u1,u2,u3);
	}
	//cross means using the matrix to express two vector and
	//a(x1,y1,z1) x b(x2,y2,z2)=  | i  j  k |(i)     =   (y1z2-y2z1,z1x2-z2x1,x1y2-x2y1)
	//                            | x1 y1 z1|(x1)
	//                            | x2 y2,z2|(x2)
}
	 
	   

/*

										MMMM                                        
										MMMMMM                                      
 										MM MMMM                                    
 										MMI  MMMM                                  
 										MMM    MMMM                                
 										MMM      MMMM                              
  										MM        MMMMM                           
  										MMM         MMMMM                         
  										MMM           OMMMM                       
   										MM             .MMMM                     
MMMMMMMMMMMMMMM                        MMM              .MMMM                   
MM   IMMMMMMMMMMMMMMMMMMMMMMMM         MMM                 MMMM                 
MM                  ~MMMMMMMMMMMMMMMMMMMMM                   MMMM               
MM                                  OMMMMM                     MMMMM            
MM                                                               MMMMM          
MM                                                                 MMMMM        
MM                                                                   ~MMMM      
MM                                                                     =MMMM    
MM                                                                        MMMM  
MM                                                                       MMMMMM 
MM                                                                     MMMMMMMM 
MM                                                                  :MMMMMMMM   
MM                                                                MMMMMMMMM     
MM                                                              MMMMMMMMM       
MM                             ,MMMMMMMMMM                    MMMMMMMMM         
MM              IMMMMMMMMMMMMMMMMMMMMMMMMM                  MMMMMMMM            
MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM               ZMMMMMMMM              
MMMMMMMMMMMMMMMMMMMMMMMMMMMMM          MM$             MMMMMMMMM                
MMMMMMMMMMMMMM                       MMM            MMMMMMMMM                  
  									MMM          MMMMMMMM                     
  									MM~       IMMMMMMMM                       
  									MM      DMMMMMMMM                         
 								MMM    MMMMMMMMM                           
 								MMD  MMMMMMMM                              
								MMM MMMMMMMM                                
								MMMMMMMMMM                                  
								MMMMMMMM                                    
  								MMMM                                      
  								MM                                        
                             GlassGiant.com */