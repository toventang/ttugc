package com.p2082ss.android.ugc.aweme.feed.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;

/* renamed from: com.ss.android.ugc.aweme.feed.experiment.z */
public final class C49537z {

    /* renamed from: a */
    public static final C49537z f113921a = new C49537z();

    private C49537z() {
    }

    static {
        Covode.recordClassIndex(58351);
    }

    /* renamed from: a */
    public static final boolean m92775a() {
        if ((m92778d() & 4) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m92776b() {
        if ((m92778d() & 2) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static final boolean m92777c() {
        if ((m92778d() & 1) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private static int m92778d() {
        return C16048b.m29633a().mo25412a(true, "ui_down_grade_strategy", 0);
    }
}
