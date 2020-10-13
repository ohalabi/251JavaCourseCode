package multiple_interfaces;

/**
 * Created by Osama Halabi on 2020/10/13.
 */
public interface Player {

    default public void start(){
        System.out.println("start from Player");
    }

    default public void pause(){
        System.out.println("pause from Player");
    }

    default public void stop(){
        System.out.println("stop form Player");
    };

}
