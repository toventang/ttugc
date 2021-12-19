package dmt.p4542av.video;

import com.bytedance.covode.number.Covode;

/* renamed from: dmt.av.video.t */
public final class C88296t {

    /* renamed from: a */
    public final int f200366a;

    /* renamed from: b */
    public final long f200367b;

    static {
        Covode.recordClassIndex(104331);
    }

    /* renamed from: a */
    public static C88296t m153435a() {
        return new C88296t(0);
    }

    /* renamed from: b */
    public static C88296t m153437b() {
        return new C88296t(1);
    }

    public final String toString() {
        return "VEPreviewControlOp{mType=" + this.f200366a + ", mSeekTo=" + this.f200367b + '}';
    }

    private C88296t(int i) {
        this(i, 0);
    }

    /* renamed from: c */
    public static C88296t m153439c(long j) {
        return new C88296t(4, j);
    }

    /* renamed from: a */
    public static C88296t m153436a(long j) {
        return new C88296t(2, j);
    }

    /* renamed from: b */
    public static C88296t m153438b(long j) {
        return new C88296t(3, j);
    }

    private C88296t(int i, long j) {
        this.f200366a = i;
        this.f200367b = j;
    }
}
