package com.p2082ss.android.ugc.aweme.comment.p2484a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;

/* renamed from: com.ss.android.ugc.aweme.comment.a.a */
public final class C36173a {

    /* renamed from: a */
    public static final C36173a f85450a = new C36173a();

    private C36173a() {
    }

    static {
        Covode.recordClassIndex(43433);
    }

    /* renamed from: a */
    public static final boolean m73724a() {
        if (C16048b.m29633a().mo25412a(true, "comment_reply_style", 0) == 1 || C16048b.m29633a().mo25412a(true, "comment_reply_style", 0) == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m73725b() {
        if (C16048b.m29633a().mo25412a(true, "comment_reply_style", 0) >= 2) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static final boolean m73726c() {
        if (C16048b.m29633a().mo25412a(true, "comment_reply_style", 0) == 3) {
            return true;
        }
        return false;
    }
}
