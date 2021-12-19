package com.p2082ss.android.ugc.aweme.property;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;

/* renamed from: com.ss.android.ugc.aweme.property.dm */
public final class C65430dm {

    /* renamed from: a */
    public static final int f147591a = 2;

    /* renamed from: b */
    public static final C65430dm f147592b = new C65430dm();

    /* renamed from: c */
    private static final int f147593c = 1;

    private C65430dm() {
    }

    /* renamed from: a */
    public static int m117147a() {
        return C16048b.m29633a().mo25412a(true, "show_sheet_on_auto_generated_captions", 0);
    }

    /* renamed from: b */
    public static boolean m117148b() {
        if (m117147a() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m117149c() {
        if (m117147a() == f147593c) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(76917);
    }
}
