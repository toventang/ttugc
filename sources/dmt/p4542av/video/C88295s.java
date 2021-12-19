package dmt.p4542av.video;

import com.bytedance.covode.number.Covode;

/* renamed from: dmt.av.video.s */
public final class C88295s {

    /* renamed from: a */
    public int f200362a;

    /* renamed from: b */
    public int f200363b;

    /* renamed from: c */
    public boolean f200364c;

    /* renamed from: d */
    public boolean f200365d;

    static {
        Covode.recordClassIndex(104330);
    }

    public final String toString() {
        return "VEMusicStartChangeOp{mStartMillis=" + this.f200362a + ", mDuration=" + this.f200363b + ", isSoundLoop=" + this.f200364c + ", isFinishMusicAdjust=" + this.f200365d + '}';
    }

    /* renamed from: a */
    public static C88295s m153434a(int i, int i2, boolean z) {
        return new C88295s(i, i2, z);
    }

    private C88295s(int i, int i2, boolean z) {
        this.f200362a = i;
        this.f200363b = i2;
        this.f200364c = z;
    }
}
