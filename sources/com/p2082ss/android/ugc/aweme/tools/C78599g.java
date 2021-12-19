package com.p2082ss.android.ugc.aweme.tools;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.tools.g */
public final class C78599g {

    /* renamed from: a */
    public boolean f176643a;

    /* renamed from: b */
    public boolean f176644b = true;

    static {
        Covode.recordClassIndex(91733);
    }

    /* renamed from: a */
    public static C78599g m137207a() {
        return new C78599g(true);
    }

    /* renamed from: b */
    public static C78599g m137208b() {
        return new C78599g(false);
    }

    public final String toString() {
        return "FrontRearChangeEvent{toFront=" + this.f176643a + '}';
    }

    private C78599g(boolean z) {
        this.f176643a = z;
    }
}
