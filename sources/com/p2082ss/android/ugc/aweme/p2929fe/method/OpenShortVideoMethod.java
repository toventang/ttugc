package com.p2082ss.android.ugc.aweme.p2929fe.method;

import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.C18288a;
import com.p2082ss.android.common.util.C29844g;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.p2479ck.C36125t;
import com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONArray;
import org.json.JSONObject;
import p4600h.p4601a.AbstractC89040af;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89269g;
import p4600h.p4619j.C89271h;

/* renamed from: com.ss.android.ugc.aweme.fe.method.OpenShortVideoMethod */
public final class OpenShortVideoMethod extends BaseCommonJavaMethod implements AbstractC33974au, AbstractC90252i, AbstractC90253j {

    /* renamed from: a */
    public static final C47873a f110885a = new C47873a((byte) 0);

    /* renamed from: b */
    private String f110886b;

    static {
        Covode.recordClassIndex(56543);
    }

    private OpenShortVideoMethod(byte b) {
        this();
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(14, new RunnableC90250g(OpenShortVideoMethod.class, "onEvent", C47965o.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.OpenShortVideoMethod$a */
    public static final class C47873a {
        static {
            Covode.recordClassIndex(56544);
        }

        private C47873a() {
        }

        public /* synthetic */ C47873a(byte b) {
            this();
        }
    }

    private /* synthetic */ OpenShortVideoMethod() {
        this((C18288a) null);
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void onDestroy() {
        EventBus.m156962a().mo145395b(this);
    }

    public OpenShortVideoMethod(C18288a aVar) {
        super(aVar);
        this.f110886b = "";
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
        if (TextUtils.equals(oVar.f111084a, this.f110886b)) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("play_state", oVar.f111085b);
            jSONObject2.put("current_time", Float.valueOf(((float) C89271h.m154764a(oVar.f111086c, 0L)) / 1000.0f));
            jSONObject2.put("current_item_id", oVar.f111087d);
            jSONObject2.put("react_id", this.f110886b);
            jSONObject.put("data", jSONObject2);
            jSONObject.put("eventName", "video_state_change");
            sendEvent("notification", jSONObject, 3);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.AbstractC47813a aVar) {
        if (jSONObject != null && jSONObject.has("current_item_id") && jSONObject.has("item_ids") && jSONObject.has("react_id") && 1 != 0) {
            this.f110886b = jSONObject.optString("react_id");
            String optString = jSONObject.optString("current_item_id");
            JSONArray optJSONArray = jSONObject.optJSONArray("item_ids");
            String optString2 = jSONObject.optString("enter_from");
            C29844g gVar = new C29844g("aweme://aweme/detaillist/".concat(String.valueOf(optString)));
            gVar.mo52130a("react_session_id", this.f110886b);
            int length = optJSONArray.length();
            if (length > 0) {
                C89269g a = C89271h.m154766a(0, length);
                ArrayList arrayList = new ArrayList(C89070n.m154526a(a, 10));
                Iterator it = a.iterator();
                while (it.hasNext()) {
                    arrayList.add(optJSONArray.get(((AbstractC89040af) it).mo143429a()));
                }
                gVar.mo52130a("ids", C89070n.m154551a(arrayList, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (AbstractC89172b) null, 62));
            }
            if (jSONObject.has("current_time")) {
                gVar.mo52128a("video_current_position", (int) (jSONObject.optDouble("current_time") * 1000.0d));
            }
            if (optString2 != null) {
                gVar.mo52130a("enter_from", optString2);
            }
            if (jSONObject.has("tracker_data")) {
                gVar.mo52130a("tracker_data", jSONObject.optString("tracker_data"));
            }
            gVar.mo52130a("video_from", "commerce_general");
            gVar.mo52130a("from_group_id", jSONObject.optString("from_group_id"));
            gVar.mo52130a("carrier_type", jSONObject.optString("carrier_type"));
            gVar.mo52130a("refer_commodity_id", jSONObject.optString("refer_commodity_id"));
            gVar.mo52130a("data_type", jSONObject.optString("data_type"));
            gVar.mo52130a("previous_page", jSONObject.optString("previous_page"));
            gVar.mo52130a("enter_method", jSONObject.optString("enter_method"));
            gVar.mo52130a("auto_route_schema", jSONObject.optString("auto_route_schema"));
            C36125t.m73598a(C36125t.m73591a(), gVar.toString());
        }
        if (aVar != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("code", 1);
            aVar.mo79888a(jSONObject2);
        }
    }
}
