package com.p2082ss.android.ugc.aweme.comment.p2490d;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;

/* renamed from: com.ss.android.ugc.aweme.comment.d.a */
public final class C36401a {

    /* renamed from: a */
    public static final C36401a f86091a = new C36401a();

    private C36401a() {
    }

    static {
        Covode.recordClassIndex(43696);
    }

    /* renamed from: a */
    public static final boolean m74098a() {
        int a = C16048b.m29633a().mo25412a(false, "add_comments_to_favorites", 0);
        if (a == 3 || a == 1 || a == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m74099b() {
        int a = C16048b.m29633a().mo25412a(false, "add_comments_to_favorites", 0);
        if (a == 3 || a == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static final boolean m74100c() {
        int a = C16048b.m29633a().mo25412a(false, "add_comments_to_favorites", 0);
        if (a == 2 || a == 1) {
            return true;
        }
        return false;
    }
}
