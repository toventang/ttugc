package com.p2082ss.android.ugc.aweme.bullet.bridge.framework;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50529ae;
import com.p2082ss.android.ugc.aweme.p2479ck.C36125t;
import com.p2082ss.android.ugc.aweme.p2479ck.C36131u;
import com.p2082ss.android.ugc.aweme.p2929fe.method.C47965o;
import com.p2082ss.android.ugc.aweme.p2929fe.method.feeds.C47951b;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4619j.C89271h;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.OpenAwemeDetailMethod */
public final class OpenAwemeDetailMethod extends BaseBridgeMethod implements AbstractC33974au, AbstractC90252i, AbstractC90253j {

    /* renamed from: b */
    public static final C35069a f82745b = new C35069a((byte) 0);

    /* renamed from: c */
    private final String f82746c = "openAwemeDetail";

    /* renamed from: d */
    private String f82747d = "";

    static {
        Covode.recordClassIndex(42192);
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(14, new RunnableC90250g(OpenAwemeDetailMethod.class, "onEvent", C47965o.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.OpenAwemeDetailMethod$a */
    public static final class C35069a {
        static {
            Covode.recordClassIndex(42193);
        }

        private C35069a() {
        }

        public /* synthetic */ C35069a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f82746c;
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16164e, com.bytedance.ies.bullet.p1129c.p1136e.AbstractC16246a
    /* renamed from: a */
    public final void mo25721a() {
        super.mo25721a();
        EventBus.m156962a().mo145395b(this);
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.OpenAwemeDetailMethod$b */
    static final class CallableC35070b<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C36131u f82748a;

        /* renamed from: b */
        final /* synthetic */ OpenAwemeDetailMethod f82749b;

        /* renamed from: c */
        final /* synthetic */ C89233z.C89234a f82750c;

        static {
            Covode.recordClassIndex(42194);
        }

        CallableC35070b(C36131u uVar, OpenAwemeDetailMethod openAwemeDetailMethod, C89233z.C89234a aVar) {
            this.f82748a = uVar;
            this.f82749b = openAwemeDetailMethod;
            this.f82750c = aVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            C47951b bVar;
            Context e = this.f82749b.mo26893e();
            if (!(e instanceof Activity)) {
                e = null;
            }
            Activity activity = (Activity) e;
            if (activity != null) {
                bVar = (C47951b) activity.findViewById(16908290).getTag(R.id.w0);
            } else {
                bVar = null;
            }
            C50529ae.f116790a = bVar;
            Context e2 = this.f82749b.mo26893e();
            if (!(e2 instanceof Activity)) {
                e2 = null;
            }
            Activity activity2 = (Activity) e2;
            if (activity2 != null) {
                return Boolean.valueOf(C36125t.m73596a(C36125t.m73591a(), activity2, this.f82748a.f85356a.mo52126a()));
            }
            return null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OpenAwemeDetailMethod(C16248b bVar) {
        super(bVar);
        AbstractC1196i lifecycle;
        C89219l.m154721d(bVar, "");
        Context e = mo26893e();
        AbstractC1204m mVar = (AbstractC1204m) (!(e instanceof AbstractC1204m) ? null : e);
        if (!(mVar == null || (lifecycle = mVar.getLifecycle()) == null)) {
            lifecycle.mo4012a(this);
        }
        EventBus.m156966a(EventBus.m156962a(), this);
    }

    @AbstractC90264r
    public final void onEvent(C47965o oVar) {
        C89219l.m154721d(oVar, "");
        if (TextUtils.equals(oVar.f111084a, this.f82747d)) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("play_state", oVar.f111085b);
            jSONObject2.put("current_time", Float.valueOf(((float) C89271h.m154764a(oVar.f111086c, 0L)) / 1000.0f));
            jSONObject2.put("current_item_id", oVar.f111087d);
            jSONObject2.put("react_id", this.f82747d);
            jSONObject.put("data", jSONObject2);
            jSONObject.put("eventName", "video_state_change");
            mo61865a("notification", jSONObject);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    public final void mo61866a(JSONObject jSONObject, BaseBridgeMethod.AbstractC34965a aVar) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aVar, "");
        C89233z.C89234a aVar2 = new C89233z.C89234a();
        aVar2.element = false;
        int i = 1;
        if (jSONObject.has("react_id") && jSONObject.has("aweme_id") && jSONObject.has("enter_from") && 1 != 0) {
            String optString = jSONObject.optString("react_id");
            C89219l.m154716b(optString, "");
            this.f82747d = optString;
            String optString2 = jSONObject.optString("aweme_id");
            String optString3 = jSONObject.optString("enter_from");
            C36131u a = C36131u.m73602a("aweme://aweme/detail/".concat(String.valueOf(optString2))).mo63248a("react_session_id", this.f82747d).mo63248a("page_type", optString3).mo63248a("refer", optString3).mo63248a("video_from", "from_feeds_operate_optimized").mo63248a("entrance_info", jSONObject.optString("entrance_info"));
            if (jSONObject.has("log_extra")) {
                JSONObject jSONObject2 = new JSONObject(jSONObject.optString("log_extra"));
                a.mo63248a("carrier_type", jSONObject2.optString("carrier_type")).mo63248a("from_group_id", jSONObject2.optString("from_group_id")).mo63248a("refer_commodity_id", jSONObject2.optString("refer_commodity_id")).mo63248a("data_type", jSONObject2.optString("data_type")).mo63248a("previous_page", jSONObject2.optString("previous_page")).mo63248a("enter_from", jSONObject2.optString("enter_from")).mo63248a("tab_name", jSONObject2.optString("tab_name"));
            }
            if (jSONObject.has("current_time")) {
                a.mo63247a("video_current_position", (int) (jSONObject.optDouble("current_time") * 1000.0d));
            }
            C1731i.m5640b(new CallableC35070b(a, this, aVar2), C1731i.f5564c);
            aVar2.element = true;
        }
        JSONObject jSONObject3 = new JSONObject();
        if (!aVar2.element) {
            i = -1;
        }
        jSONObject3.put("code", i);
        aVar.mo61874a(jSONObject3);
    }
}
