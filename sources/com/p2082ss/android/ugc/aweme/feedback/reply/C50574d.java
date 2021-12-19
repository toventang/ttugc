package com.p2082ss.android.ugc.aweme.feedback.reply;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;

/* renamed from: com.ss.android.ugc.aweme.feedback.reply.d */
public final class C50574d {

    /* renamed from: a */
    public static final C50574d f116873a = new C50574d();

    /* renamed from: b */
    private static Keva f116874b;

    private C50574d() {
    }

    static {
        Covode.recordClassIndex(59723);
    }

    /* renamed from: a */
    public static Keva m94806a() {
        if (f116874b == null) {
            f116874b = Keva.getRepo("HasFeedbackKeva");
        }
        return f116874b;
    }
}
