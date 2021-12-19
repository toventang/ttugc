package androidx.media;

import androidx.versionedparcelable.AbstractC1567a;
import com.bytedance.covode.number.Covode;

public final class AudioAttributesImplBaseParcelizer {
    static {
        Covode.recordClassIndex(1382);
    }

    public static C1276c read(AbstractC1567a aVar) {
        C1276c cVar = new C1276c();
        cVar.f4200a = aVar.mo5216b(cVar.f4200a, 1);
        cVar.f4201b = aVar.mo5216b(cVar.f4201b, 2);
        cVar.f4202c = aVar.mo5216b(cVar.f4202c, 3);
        cVar.f4203d = aVar.mo5216b(cVar.f4203d, 4);
        return cVar;
    }

    public static void write(C1276c cVar, AbstractC1567a aVar) {
        aVar.mo5206a(cVar.f4200a, 1);
        aVar.mo5206a(cVar.f4201b, 2);
        aVar.mo5206a(cVar.f4202c, 3);
        aVar.mo5206a(cVar.f4203d, 4);
    }
}
