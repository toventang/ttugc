package androidx.media;

import android.media.AudioAttributes;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.media.b */
class C1273b implements AbstractC1270a {

    /* renamed from: a */
    AudioAttributes f4194a;

    /* renamed from: b */
    int f4195b = -1;

    static {
        Covode.recordClassIndex(1386);
    }

    C1273b() {
    }

    public int hashCode() {
        return this.f4194a.hashCode();
    }

    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f4194a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1273b)) {
            return false;
        }
        return this.f4194a.equals(((C1273b) obj).f4194a);
    }
}
