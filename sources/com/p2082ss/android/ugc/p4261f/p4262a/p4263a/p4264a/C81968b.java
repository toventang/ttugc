package com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.f.a.a.a.b */
public final class C81968b extends Exception {

    /* renamed from: a */
    private final int f183438a;

    /* renamed from: b */
    private C81983d f183439b;

    static {
        Covode.recordClassIndex(95783);
    }

    public final int getCode() {
        return this.f183438a;
    }

    public final C81983d getShiftInfo() {
        return this.f183439b;
    }

    public final void setShiftInfo(C81983d dVar) {
        this.f183439b = dVar;
    }

    public C81968b(int i, String str) {
        super(str);
        this.f183438a = i;
    }
}
