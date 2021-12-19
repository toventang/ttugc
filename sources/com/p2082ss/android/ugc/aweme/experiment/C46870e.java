package com.p2082ss.android.ugc.aweme.experiment;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.ugc.appcontext.C17867d;

/* renamed from: com.ss.android.ugc.aweme.experiment.e */
public final class C46870e {

    /* renamed from: a */
    public static final int f109213a = 1;

    /* renamed from: b */
    public static boolean f109214b;

    /* renamed from: c */
    public static final C46870e f109215c = new C46870e();

    private C46870e() {
    }

    static {
        Covode.recordClassIndex(55471);
        boolean z = true;
        if (C16048b.m29633a().mo25412a(true, "ad_opt_webview_preload", 0) != 1 && !TextUtils.equals(C17867d.f42595s, "local_test")) {
            z = false;
        }
        f109214b = z;
    }
}
