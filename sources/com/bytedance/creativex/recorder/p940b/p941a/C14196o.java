package com.bytedance.creativex.recorder.p940b.p941a;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.creativex.recorder.b.a.o */
public final class C14196o {

    /* renamed from: a */
    public final int f34469a;

    /* renamed from: b */
    public final int f34470b;

    /* renamed from: c */
    public final boolean f34471c;

    static {
        Covode.recordClassIndex(16265);
    }

    public C14196o(int i) {
        this(i, 0, 6);
    }

    public final String toString() {
        return "StartRecordingCommandEvent{recordType=" + this.f34469a + '}';
    }

    private C14196o(int i, int i2) {
        this.f34469a = i;
        this.f34470b = i2;
        this.f34471c = false;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14196o(int i, int i2, int i3) {
        this(i, (i3 & 2) != 0 ? 0 : i2);
    }
}
