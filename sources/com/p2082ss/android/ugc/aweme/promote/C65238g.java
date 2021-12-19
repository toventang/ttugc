package com.p2082ss.android.ugc.aweme.promote;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;

/* renamed from: com.ss.android.ugc.aweme.promote.g */
public final class C65238g {

    /* renamed from: a */
    public static DialogC65233e f147189a;

    /* renamed from: b */
    private static SharedPreferences f147190b;

    static {
        Covode.recordClassIndex(76714);
    }

    /* renamed from: a */
    public static SharedPreferences m116896a() {
        if (f147190b == null) {
            f147190b = C34822d.m71158a(C17867d.m33078a(), "aweme-promote-dialog", 0);
        }
        return f147190b;
    }
}
