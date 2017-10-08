/**
 * Created by Harrison on 7/6/2017.
 */
public class Tester {
    public static void main(String[]args){
        for(int i = 0;i<ServerDispatcher.id.length;i++){
            while(ServerDispatcher.id[i] != null){
                System.out.println(ServerDispatcher.id[i]);
            }
        }
    }
}
