package androidx.media;

import android.util.SparseIntArray;
import androidx.versionedparcelable.AbstractC1569c;
import com.bytedance.covode.number.Covode;

public class AudioAttributesCompat implements AbstractC1569c {

    /* renamed from: b */
    private static final SparseIntArray f4187b;

    /* renamed from: c */
    private static final int[] f4188c = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16};

    /* renamed from: a */
    AbstractC1270a f4189a;

    AudioAttributesCompat() {
    }

    public int hashCode() {
        return this.f4189a.hashCode();
    }

    public String toString() {
        return this.f4189a.toString();
    }

    static {
        Covode.recordClassIndex(1379);
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4187b = sparseIntArray;
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;
        AbstractC1270a aVar = this.f4189a;
        if (aVar != null) {
            return aVar.equals(audioAttributesCompat.f4189a);
        }
        if (audioAttributesCompat.f4189a == null) {
            return true;
        }
        return false;
    }
}
