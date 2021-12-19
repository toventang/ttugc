package dmt.p4542av.video;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.vesdk.VEVideoEncodeSettings;

/* renamed from: dmt.av.video.c */
public final class C88241c {
    static {
        Covode.recordClassIndex(104276);
    }

    /* renamed from: a */
    public static int m153350a(float f) {
        return (int) (f * 4.0f * 1000.0f * 1000.0f);
    }

    /* renamed from: a */
    public static VEVideoEncodeSettings.ENCODE_PRESET m153351a(int i) {
        VEVideoEncodeSettings.ENCODE_PRESET[] values = VEVideoEncodeSettings.ENCODE_PRESET.values();
        if (i < 0 || i >= values.length) {
            return null;
        }
        return values[i];
    }
}
