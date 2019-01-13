package montyhallproblem;
import java.util.Random;
public class MontyHallProblem {
    static double noSwitchCount=0,switchCount=0;

    public static void main(String[] args) {
        System.out.println("NOSWITCH: "+noSwitch());
        System.out.println("SWITCH:"+switchG());
        
    }
    
    public static int setCar(int ar[]){
        int i=new Random().nextInt(3);
        //System.out.println("Random set: "+i);
        ar[i]=5;
        return i;
        
    }
    
    public static int firstGuess(){
        int r = new Random().nextInt(3);
        //System.out.println("First Guess: "+r);
        return r;
    }
    
    public static int switchGuess(int i,int j){
        int k=0;
        if(i==1&&j==2){}
        else if(i==2&&j==1){}
        else if(i==1&&j==0){k=2;}
        else if(i==0&&j==1){k=2;}
        else {k=1;}
        //System.out.println("Switched Guess: "+k);
        return k;
    }
    
    public static double noSwitch(){
        for(int i=0;i<100;i++){
        int ar[]=new int[3];
        setCar(ar);
        int x=firstGuess();
        if(ar[x]==5){
            noSwitchCount++;
        }
        }    
        System.out.println(noSwitchCount);
        return (noSwitchCount/100);
    }
    
    public static double switchG(){
        for(int i=0;i<100;i++){
            int ar[]=new int[3];
            int w=setCar(ar);
            int x=firstGuess();
            int open;
            while(true){
                open=new Random().nextInt(3);
                if(open!=x && open!=w){
                    break;
                }
            }
            //System.out.println("Open: "+open);
            int y=switchGuess(x,open);
            if(ar[y]==5){
                switchCount++;
            }
        }
        System.out.println(switchCount);
        return (switchCount/100);
    
}
    
}
