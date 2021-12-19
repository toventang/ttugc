package com.p2082ss.android.ugc.aweme.commercialize.util.adrouter.p2619a;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commercialize.util.adrouter.AbstractC38578e;
import com.p2082ss.android.ugc.aweme.commercialize.util.adrouter.C38554a;
import com.p2082ss.android.ugc.aweme.commercialize.util.adrouter.C38565b;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.util.adrouter.a.a */
public abstract class AbstractC38555a implements AbstractC38578e {

    /* renamed from: b */
    public Context f91084b;

    /* renamed from: c */
    public C38565b f91085c;

    static {
        Covode.recordClassIndex(46087);
    }

    /* renamed from: a */
    public void mo65609a(boolean z, C38565b bVar) {
        C89219l.m154721d(bVar, "");
    }

    /* renamed from: c */
    public final Context mo67075c() {
        Context context = this.f91084b;
        if (context == null) {
            C89219l.m154710a("context");
        }
        return context;
    }

    /* renamed from: d */
    public final C38565b mo67076d() {
        C38565b bVar = this.f91085c;
        if (bVar == null) {
            C89219l.m154710a("params");
        }
        return bVar;
    }

    /* renamed from: a */
    public static boolean m78188a(Context context, Intent intent) {
        C38554a.f91082a.mo65603a("ad_lynx_download_WebUrlHandler_startActivity", (JSONObject) null, "begin", (String) null);
        if (context == null || intent == null) {
            return false;
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        try {
            C38554a.f91082a.mo65603a("ad_lynx_download_WebUrlHandler_startActivity", (JSONObject) null, "try", (String) null);
            C84349a.m145093a(intent, context);
            context.startActivity(intent);
            return true;
        } catch (ActivityNotFoundException | SecurityException unused) {
            C38554a.f91082a.mo65603a("ad_lynx_download_WebUrlHandler_startActivity", (JSONObject) null, "fail", (String) null);
            return false;
        }
    }
}
