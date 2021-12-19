package androidx.media;

import androidx.versionedparcelable.AbstractC1567a;
import com.bytedance.covode.number.Covode;

public final class AudioAttributesCompatParcelizer {
    static {
        Covode.recordClassIndex(1380);
    }

    public static AudioAttributesCompat read(AbstractC1567a aVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.f4189a = (AbstractC1270a) aVar.mo5226c(audioAttributesCompat.f4189a);
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, AbstractC1567a aVar) {
        aVar.mo5209a(audioAttributesCompat.f4189a);
    }
}
