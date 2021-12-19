package androidx.media;

import android.media.AudioAttributes;
import androidx.versionedparcelable.AbstractC1567a;
import com.bytedance.covode.number.Covode;

public final class AudioAttributesImplApi21Parcelizer {
    static {
        Covode.recordClassIndex(1381);
    }

    public static C1273b read(AbstractC1567a aVar) {
        C1273b bVar = new C1273b();
        bVar.f4194a = (AudioAttributes) aVar.mo5217b(bVar.f4194a, 1);
        bVar.f4195b = aVar.mo5216b(bVar.f4195b, 2);
        return bVar;
    }

    public static void write(C1273b bVar, AbstractC1567a aVar) {
        aVar.mo5208a(bVar.f4194a, 1);
        aVar.mo5206a(bVar.f4195b, 2);
    }
}
