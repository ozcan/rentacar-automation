

package KiralamaBackend;

import KiralamaDomain.Arac;
import KiralamaDomain.Musteri;
import KiralamaDomain.Personel;
import KiralamaDomain.Servis;
import KiralamaDomain.Sube;
import KiralamaUI.AracKiralama;


public class Facade {
    public IMapper getMapper(Object object) {
        if (object.getClass() == Arac.class)
            return new AracMapper();
        if (object.getClass() == AracKiralama.class)
            return new KiralamaMapper();
        if (object.getClass() == Musteri.class)
            return new MusteriMapper();
        if (object.getClass() == Personel.class)
            return new PersonelMapper();
        if (object.getClass() == Servis.class)
            return new ServisMapper();
        if (object.getClass() == Sube.class)
            return new SubeMapper();
        
        return null;
    }

}
