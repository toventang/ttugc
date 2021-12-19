package com.p2082ss.android.ugc.aweme.property;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;

/* renamed from: com.ss.android.ugc.aweme.property.cf */
public final class C65393cf {

    /* renamed from: a */
    public static final C65393cf f147537a = new C65393cf();

    private C65393cf() {
    }

    static {
        Covode.recordClassIndex(76880);
    }

    /* renamed from: a */
    public static int m117090a() {
        return C16048b.m29633a().mo25412a(true, "move_captions_position", 0);
    }

    /* renamed from: b */
    public static boolean m117091b() {
        int a = m117090a();
        if (a == 4 || a == 5) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m117092c() {
        if (m117090a() == 6) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m117093d() {
        if (m117090a() == 5) {
            return true;
        }
        return false;
    }
}
