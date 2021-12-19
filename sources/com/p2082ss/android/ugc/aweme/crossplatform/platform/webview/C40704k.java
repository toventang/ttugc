package com.p2082ss.android.ugc.aweme.crossplatform.platform.webview;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.crossplatform.p2709c.C40603d;
import com.p2082ss.android.ugc.aweme.p2355ax.p2356a.AbstractC34340m;
import com.p2082ss.android.ugc.aweme.p2355ax.p2356a.C34337k;
import com.p2082ss.android.ugc.aweme.p2355ax.p2356a.C34350v;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.k */
public final class C40704k {

    /* renamed from: a */
    public static final C40704k f95309a = new C40704k();

    private C40704k() {
    }

    static {
        Covode.recordClassIndex(48550);
    }

    /* renamed from: a */
    public static void m82113a(Context context, Intent intent) {
        C84349a.m145093a(intent, context);
        context.startActivity(intent);
    }

    /* renamed from: a */
    static void m82114a(String str, C34337k kVar) {
        AbstractC34340m mVar;
        if (str != null) {
            C40603d.C40604a.m81964a();
            if (kVar != null) {
                mVar = (AbstractC34340m) kVar.mo60793a(AbstractC34340m.class);
            } else {
                mVar = null;
            }
            Uri parse = Uri.parse(str);
            C89219l.m154716b(parse, "");
            C40603d.m81957a(mVar, "webview_safe_log", "filter_scheme", new C34350v(parse, "intent_scheme_", null, 4).getFormatData(), null, null);
        }
    }
}
