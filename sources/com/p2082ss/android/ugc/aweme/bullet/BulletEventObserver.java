package com.p2082ss.android.ugc.aweme.bullet;

import android.app.Activity;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i;
import com.bytedance.ies.bullet.p1129c.p1132c.C16238z;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.EnumC16723b;
import com.p2082ss.android.sdk.webview.C30244b;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.bullet.p2415c.C35130a;
import com.p2082ss.android.ugc.aweme.commerce.service.C37533a;
import com.p2082ss.android.ugc.aweme.commerce.service.ICommerceService;
import com.p2082ss.android.ugc.aweme.commerce.service.p2521a.C37534a;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.bullet.BulletEventObserver */
public final class BulletEventObserver implements AbstractC33974au, AbstractC90252i, AbstractC90253j {

    /* renamed from: a */
    public final C16248b f82449a;

    /* renamed from: b */
    public final Activity f82450b;

    /* renamed from: c */
    private boolean f82451c;

    /* renamed from: d */
    private long f82452d;

    static {
        Covode.recordClassIndex(41975);
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(179, new RunnableC90250g(BulletEventObserver.class, "onEvent", C30244b.class, ThreadMode.POSTING, 0, false));
        hashMap.put(78, new RunnableC90250g(BulletEventObserver.class, "onJsBroadcastEvent", C35130a.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_CREATE) {
            onCreate();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_RESUME) {
            onResume();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_PAUSE) {
            onPause();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.BulletEventObserver$a */
    public static final class C34951a implements AbstractC16191p {

        /* renamed from: a */
        public final JSONObject f82453a;

        /* renamed from: b */
        final /* synthetic */ String f82454b;

        /* renamed from: c */
        final /* synthetic */ JSONObject f82455c;

        /* renamed from: d */
        private final String f82456d;

        static {
            Covode.recordClassIndex(41976);
        }

        @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p
        /* renamed from: a */
        public final String mo25699a() {
            return this.f82456d;
        }

        @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p
        /* renamed from: b */
        public final /* bridge */ /* synthetic */ Object mo25700b() {
            return this.f82453a;
        }

        C34951a(String str, JSONObject jSONObject) {
            this.f82454b = str;
            this.f82455c = jSONObject;
            this.f82456d = str;
            this.f82453a = jSONObject;
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void onDestroy() {
        EventBus.m156962a().mo145395b(this);
    }

    /* renamed from: a */
    private final AbstractC16208i m71366a() {
        C16248b bVar = this.f82449a;
        if (bVar != null) {
            return (AbstractC16208i) bVar.mo25832c(AbstractC16208i.class);
        }
        return null;
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_CREATE)
    public final void onCreate() {
        EventBus.m156966a(EventBus.m156962a(), this);
        this.f82452d = System.currentTimeMillis();
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_PAUSE)
    public final void onPause() {
        EnumC16723b bVar;
        this.f82451c = false;
        AbstractC16208i a = m71366a();
        if (a != null) {
            bVar = a.mo25769b();
        } else {
            bVar = null;
        }
        if (bVar == EnumC16723b.WEB) {
            m71367a("viewDisappeared", null);
            m71367a("invisible", null);
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_RESUME)
    public final void onResume() {
        EnumC16723b bVar;
        this.f82451c = true;
        AbstractC16208i a = m71366a();
        if (a != null) {
            bVar = a.mo25769b();
        } else {
            bVar = null;
        }
        if (bVar == EnumC16723b.WEB) {
            m71367a("viewAppeared", null);
        }
    }

    @AbstractC90264r
    public final void onEvent(C30244b bVar) {
        String str;
        String str2;
        Activity activity;
        C16238z a;
        if (bVar != null && (str = bVar.f72160a) != null && str.length() != 0) {
            String str3 = bVar.f72160a;
            AbstractC16208i a2 = m71366a();
            if (a2 == null || (a = a2.mo25762a()) == null || (str2 = a.f39033a) == null) {
                str2 = "";
            }
            if (C89361p.m154872a(str3, str2, true) && 1 != 0 && (activity = this.f82450b) != null && (!activity.isFinishing())) {
                activity.finish();
            }
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onJsBroadcastEvent(C35130a aVar) {
        String str;
        JSONObject jSONObject;
        C89219l.m154721d(aVar, "");
        JSONObject jSONObject2 = aVar.f82923b;
        if (jSONObject2 != null) {
            jSONObject2.optString("eventName");
        }
        if (this.f82451c) {
            JSONObject jSONObject3 = aVar.f82923b;
            if (jSONObject3 != null) {
                str = jSONObject3.optString("eventName");
            } else {
                str = null;
            }
            if (TextUtils.equals("goods_rn_page_monitor", str)) {
                try {
                    JSONObject jSONObject4 = aVar.f82923b;
                    if (!(jSONObject4 == null || (jSONObject = jSONObject4.getJSONObject("data")) == null)) {
                        ICommerceService a = C37533a.m75656a();
                        C37534a aVar2 = new C37534a();
                        aVar2.f88692n = Long.valueOf(Long.valueOf(jSONObject.optString("interact_render_ts")).longValue() - this.f82452d);
                        aVar2.f88694p = jSONObject.optString("page_id");
                        aVar2.f88691m = Long.valueOf(Long.valueOf(jSONObject.optString("ender_render_ts")).longValue() - this.f82452d);
                        aVar2.f88693o = jSONObject.optString("session_id");
                        a.logCommerceEvents("commerce_page_render_time", aVar2);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        m71367a("notification", aVar.f82923b);
    }

    public BulletEventObserver(C16248b bVar, Activity activity) {
        this.f82449a = bVar;
        this.f82450b = activity;
    }

    /* renamed from: a */
    private final void m71367a(String str, JSONObject jSONObject) {
        AbstractC16208i a = m71366a();
        if (a != null) {
            a.onEvent(new C34951a(str, jSONObject));
        }
    }
}
