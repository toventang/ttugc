package com.p2082ss.android.ugc.aweme.utils;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.deeplink.C41050m;
import com.p2082ss.android.ugc.aweme.journey.C57055x;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: com.ss.android.ugc.aweme.utils.l */
public class C80599l implements AbstractC90252i, AbstractC90253j {

    /* renamed from: a */
    public boolean f180224a;

    /* renamed from: b */
    public Uri f180225b;

    /* renamed from: c */
    public String f180226c;

    static {
        Covode.recordClassIndex(93872);
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(182, new RunnableC90250g(C80599l.class, "onEvent", C57055x.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    private C80599l() {
        this.f180226c = "";
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.l$a */
    public static class C80600a {

        /* renamed from: a */
        public static C80599l f180227a = new C80599l((byte) 0);

        static {
            Covode.recordClassIndex(93873);
        }
    }

    /* renamed from: a */
    public final void mo123798a() {
        if (this.f180225b != null) {
            m139741a(C17867d.m33078a(), mo123799b());
        }
    }

    /* renamed from: b */
    public final Intent mo123799b() {
        if (this.f180225b == null) {
            return null;
        }
        Intent intent = new Intent();
        intent.setData(this.f180225b);
        intent.setFlags(268435456);
        intent.putExtra("dl_from", "af");
        if (C41050m.f95959a.mo70174a(this.f180226c)) {
            intent.putExtra("is_from_self", true);
        }
        return intent;
    }

    /* synthetic */ C80599l(byte b) {
        this();
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public void onEvent(C57055x xVar) {
        if (this.f180224a) {
            mo123798a();
            this.f180224a = false;
        }
    }

    /* renamed from: a */
    private static void m139741a(Context context, Intent intent) {
        C84349a.m145093a(intent, context);
        context.startActivity(intent);
    }
}
