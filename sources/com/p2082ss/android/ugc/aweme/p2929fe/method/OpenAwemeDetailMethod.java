package com.p2082ss.android.ugc.aweme.p2929fe.method;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.C18288a;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50529ae;
import com.p2082ss.android.ugc.aweme.p2479ck.C36125t;
import com.p2082ss.android.ugc.aweme.p2479ck.C36131u;
import com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod;
import com.p2082ss.android.ugc.aweme.p2929fe.method.feeds.C47951b;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
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

/* renamed from: com.ss.android.ugc.aweme.fe.method.OpenAwemeDetailMethod */
public final class OpenAwemeDetailMethod extends BaseCommonJavaMethod implements AbstractC33974au, AbstractC90252i, AbstractC90253j {

    /* renamed from: a */
    public static final C47856a f110857a = new C47856a((byte) 0);

    /* renamed from: b */
    private String f110858b;

    static {
        Covode.recordClassIndex(56518);
    }

    private OpenAwemeDetailMethod(byte b) {
        this();
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(14, new RunnableC90250g(OpenAwemeDetailMethod.class, "onEvent", C47965o.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.OpenAwemeDetailMethod$a */
    public static final class C47856a {
        static {
            Covode.recordClassIndex(56519);
        }

        private C47856a() {
        }

        public /* synthetic */ C47856a(byte b) {
            this();
        }
    }

    private /* synthetic */ OpenAwemeDetailMethod() {
        this((C18288a) null);
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void onDestroy() {
        EventBus.m156962a().mo145395b(this);
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.OpenAwemeDetailMethod$b */
    static final class CallableC47857b<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C36131u f110859a;

        /* renamed from: b */
        final /* synthetic */ OpenAwemeDetailMethod f110860b;

        /* renamed from: c */
        final /* synthetic */ C89233z.C89234a f110861c;

        static {
            Covode.recordClassIndex(56520);
        }

        CallableC47857b(C36131u uVar, OpenAwemeDetailMethod openAwemeDetailMethod, C89233z.C89234a aVar) {
            this.f110859a = uVar;
            this.f110860b = openAwemeDetailMethod;
            this.f110861c = aVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            C47951b bVar;
            Activity activity = (Activity) this.f110860b.getActContext();
            if (activity != null) {
                bVar = (C47951b) activity.findViewById(16908290).getTag(R.id.w0);
            } else {
                bVar = null;
            }
            C50529ae.f116790a = bVar;
            C36125t a = C36125t.m73591a();
            Object obj = this.f110860b.mContextRef.get();
            Objects.requireNonNull(obj, "null cannot be cast to non-null type android.app.Activity");
            return Boolean.valueOf(C36125t.m73596a(a, (Activity) obj, this.f110859a.mo63249a()));
        }
    }

    public OpenAwemeDetailMethod(C18288a aVar) {
        super(aVar);
        this.f110858b = "";
        EventBus.m156966a(EventBus.m156962a(), this);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final BaseCommonJavaMethod attach(WeakReference<Context> weakReference) {
        C89219l.m154721d(weakReference, "");
        Context context = weakReference.get();
        if (context instanceof AbstractC1204m) {
            ((AbstractC1204m) context).getLifecycle().mo4012a(this);
        }
        BaseCommonJavaMethod attach = super.attach(weakReference);
        C89219l.m154716b(attach, "");
        return attach;
    }

    @AbstractC90264r
    public final void onEvent(C47965o oVar) {
        C89219l.m154721d(oVar, "");
        if (TextUtils.equals(oVar.f111084a, this.f110858b)) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("play_state", oVar.f111085b);
            jSONObject2.put("current_time", Float.valueOf(((float) C89271h.m154764a(oVar.f111086c, 0L)) / 1000.0f));
            jSONObject2.put("current_item_id", oVar.f111087d);
            jSONObject2.put("react_id", this.f110858b);
            jSONObject.put("data", jSONObject2);
            jSONObject.put("eventName", "video_state_change");
            sendEvent("notification", jSONObject, 3);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.AbstractC47813a aVar) {
        C89233z.C89234a aVar2 = new C89233z.C89234a();
        aVar2.element = false;
        int i = 1;
        if (jSONObject != null && jSONObject.has("react_id") && jSONObject.has("aweme_id") && jSONObject.has("enter_from") && 1 != 0) {
            String optString = jSONObject.optString("react_id");
            C89219l.m154716b(optString, "");
            this.f110858b = optString;
            String optString2 = jSONObject.optString("aweme_id");
            String optString3 = jSONObject.optString("enter_from");
            C36131u a = C36131u.m73602a("aweme://aweme/detail/".concat(String.valueOf(optString2))).mo63248a("react_session_id", this.f110858b).mo63248a("page_type", optString3).mo63248a("refer", optString3).mo63248a("video_from", "from_feeds_operate_optimized").mo63248a("entrance_info", jSONObject.optString("entrance_info"));
            if (jSONObject.has("log_extra")) {
                JSONObject jSONObject2 = new JSONObject(jSONObject.optString("log_extra"));
                a.mo63248a("carrier_type", jSONObject2.optString("carrier_type")).mo63248a("from_group_id", jSONObject2.optString("from_group_id")).mo63248a("refer_commodity_id", jSONObject2.optString("refer_commodity_id")).mo63248a("data_type", jSONObject2.optString("data_type")).mo63248a("previous_page", jSONObject2.optString("previous_page")).mo63248a("enter_from", jSONObject2.optString("enter_from")).mo63248a("tab_name", jSONObject2.optString("tab_name")).mo63248a("enter_method", jSONObject2.optString("enter_method"));
            }
            if (jSONObject.has("current_time")) {
                a.mo63247a("video_current_position", (int) (jSONObject.optDouble("current_time") * 1000.0d));
            }
            if (jSONObject.has("report_reason")) {
                a.mo63248a("ad_report_reason", jSONObject.optString("report_reason"));
            }
            if (jSONObject.has("report_reason_type")) {
                a.mo63248a("ad_report_reason_type", jSONObject.optString("report_reason_type"));
            }
            C1731i.m5640b(new CallableC47857b(a, this, aVar2), C1731i.f5564c);
            aVar2.element = true;
        }
        if (aVar != null) {
            JSONObject jSONObject3 = new JSONObject();
            if (!aVar2.element) {
                i = -1;
            }
            jSONObject3.put("code", i);
            aVar.mo79888a(jSONObject3);
        }
    }
}
