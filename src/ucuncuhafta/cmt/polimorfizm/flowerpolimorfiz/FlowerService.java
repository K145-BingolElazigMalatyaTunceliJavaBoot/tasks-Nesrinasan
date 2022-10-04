package ucuncuhafta.cmt.polimorfizm.flowerpolimorfiz;

import ikincihafta.pazar.oop.thissuper.bitkihiyerarsi.Flower;
import ikincihafta.pazar.oop.thissuper.bitkihiyerarsi.Karpuz;
import ikincihafta.pazar.oop.thissuper.bitkihiyerarsi.Rose;

public class FlowerService {

    public void smell(Flower flower){
        if(flower instanceof Rose){
            Rose roseFlower = (Rose) flower;
            roseFlower.smell();
        }else if(flower instanceof Karpuz){
            Karpuz karpuz = (Karpuz) flower;
            karpuz.setAdet(12);
        }
    }
}
