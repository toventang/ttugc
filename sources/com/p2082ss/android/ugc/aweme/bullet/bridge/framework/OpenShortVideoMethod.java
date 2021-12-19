package com.p2082ss.android.ugc.aweme.bullet.bridge.framework;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16183k;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.AbstractC16249c;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p2082ss.android.ugc.aweme.p2929fe.method.C47965o;
import com.p2082ss.android.ugc.aweme.search.p3700n.C67690d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.AbstractC89040af;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89269g;
import p4600h.p4619j.C89271h;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.OpenShortVideoMethod */
public final class OpenShortVideoMethod extends BaseBridgeMethod implements AbstractC33974au, AbstractC90252i, AbstractC90253j {

    /* renamed from: b */
    public static final C35080a f82777b = new C35080a((byte) 0);

    /* renamed from: c */
    private final Map<String, String> f82778c = new LinkedHashMap();

    /* renamed from: d */
    private final String f82779d = "open_short_video";

    /* renamed from: e */
    private AbstractC16183k.EnumC16184a f82780e = AbstractC16183k.EnumC16184a.PRIVATE;

    /* renamed from: f */
    private String f82781f = "";

    /* renamed from: g */
    private final AbstractC89244h f82782g;

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.OpenShortVideoMethod$b */
    public interface AbstractC35081b {
        static {
            Covode.recordClassIndex(42211);
        }

        /* renamed from: a */
        boolean mo61911a(JSONObject jSONObject);

        /* renamed from: a */
        boolean mo61912a(JSONObject jSONObject, Bundle bundle);
    }

    static {
        Covode.recordClassIndex(42209);
    }

    /* renamed from: g */
    private final AbstractC35081b m71717g() {
        return (AbstractC35081b) this.f82782g.getValue();
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(14, new RunnableC90250g(OpenShortVideoMethod.class, "onEvent", C47965o.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.OpenShortVideoMethod$a */
    public static final class C35080a {
        static {
            Covode.recordClassIndex(42210);
        }

        private C35080a() {
        }

        public /* synthetic */ C35080a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q, com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16164e
    /* renamed from: b */
    public final AbstractC16183k.EnumC16184a mo25723b() {
        return this.f82780e;
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f82779d;
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16164e, com.bytedance.ies.bullet.p1129c.p1136e.AbstractC16246a
    /* renamed from: a */
    public final void mo25721a() {
        EventBus.m156962a().mo145395b(this);
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.OpenShortVideoMethod$c */
    static final class C35082c extends AbstractC89220m implements AbstractC89171a<AbstractC35081b> {

        /* renamed from: a */
        final /* synthetic */ C16248b f82783a;

        static {
            Covode.recordClassIndex(42212);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35082c(C16248b bVar) {
            super(0);
            this.f82783a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC35081b invoke() {
            AbstractC16249c b = this.f82783a.mo25830b(AbstractC35081b.class);
            if (b != null) {
                return b.mo25823b();
            }
            return null;
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16164e
    /* renamed from: a */
    public final void mo25722a(AbstractC16183k.EnumC16184a aVar) {
        C89219l.m154721d(aVar, "");
        this.f82780e = aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OpenShortVideoMethod(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
        this.f82782g = C89250i.m154773a((AbstractC89171a) new C35082c(bVar));
        EventBus.m156966a(EventBus.m156962a(), this);
    }

    /* renamed from: b */
    private static Map<String, String> m71716b(JSONObject jSONObject) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            C89219l.m154716b(next, "");
            String string = jSONObject.getString(next);
            C89219l.m154716b(string, "");
            linkedHashMap.put(next, string);
        }
        return linkedHashMap;
    }

    @AbstractC90264r
    public final void onEvent(C47965o oVar) {
        C89219l.m154721d(oVar, "");
        if (TextUtils.equals(oVar.f111084a, this.f82781f)) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("play_state", oVar.f111085b);
            jSONObject2.put("current_time", Float.valueOf(((float) C89271h.m154764a(oVar.f111086c, 0L)) / 1000.0f));
            jSONObject2.put("current_item_id", oVar.f111087d);
            jSONObject2.put("react_id", this.f82781f);
            jSONObject.put("data", jSONObject2);
            jSONObject.put("eventName", "video_state_change");
            mo61865a("notification", jSONObject);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    public final void mo61866a(JSONObject jSONObject, BaseBridgeMethod.AbstractC34965a aVar) {
        Context e;
        AbstractC35081b g;
        JSONObject jSONObject2 = jSONObject;
        C89219l.m154721d(jSONObject2, "");
        C89219l.m154721d(aVar, "");
        if (((jSONObject2.has("current_item_id") && jSONObject2.has("item_ids") && jSONObject2.has("react_id")) || ((g = m71717g()) != null && g.mo61911a(jSONObject2))) && 1 != 0) {
            this.f82781f = jSONObject2.optString("react_id");
            String optString = jSONObject2.optString("current_item_id");
            JSONArray optJSONArray = jSONObject2.optJSONArray("item_ids");
            String optString2 = jSONObject2.optString("enter_from");
            Bundle bundle = new Bundle();
            bundle.putString("id", optString);
            bundle.putString("react_session_id", this.f82781f);
            int length = optJSONArray.length();
            if (length > 0) {
                C89269g a = C89271h.m154766a(0, length);
                ArrayList arrayList = new ArrayList(C89070n.m154526a(a, 10));
                Iterator it = a.iterator();
                while (it.hasNext()) {
                    arrayList.add(optJSONArray.get(((AbstractC89040af) it).mo143429a()));
                }
                bundle.putString("ids", C89070n.m154551a(arrayList, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (AbstractC89172b) null, 62));
            }
            if (jSONObject2.has("current_time")) {
                jSONObject2 = jSONObject2;
                bundle.putString("video_current_position", String.valueOf(jSONObject2.optDouble("current_time") * 1000.0d));
            }
            if (optString2 != null) {
                bundle.putString("enter_from", optString2);
            }
            if (jSONObject2.has("tracker_data")) {
                bundle.putString("tracker_data", jSONObject2.optString("tracker_data"));
                try {
                    this.f82778c.putAll(m71716b(new JSONObject(jSONObject2.optString("tracker_data"))));
                } catch (JSONException e2) {
                    String.valueOf(e2.getStackTrace());
                }
            }
            bundle.putString("video_from", "general_search");
            bundle.putString("from_group_id", jSONObject2.optString("from_group_id"));
            bundle.putString("carrier_type", jSONObject2.optString("carrier_type"));
            bundle.putString("refer_commodity_id", jSONObject2.optString("refer_commodity_id"));
            bundle.putString("data_type", jSONObject2.optString("data_type"));
            bundle.putString("previous_page", jSONObject2.optString("previous_page"));
            bundle.putString("enter_method", jSONObject2.optString("enter_method"));
            bundle.putString("enter_method", jSONObject2.optString("enter_method"));
            bundle.putString("auto_route_schema", jSONObject2.optString("auto_route_schema"));
            JSONObject optJSONObject = jSONObject2.optJSONObject("log");
            if (optJSONObject != null) {
                bundle.putString("search_result_id", optJSONObject.optString("search_result_id"));
                bundle.putString("impr_id", optJSONObject.optString("impr_id"));
                bundle.putString("playlist_search_id", optJSONObject.optString("search_id"));
                bundle.putInt("is_from_video", optJSONObject.optInt("is_from_video"));
                bundle.putString("key_search_type", optJSONObject.optString("search_type"));
                bundle.putInt("item_size", length);
                if (optJSONObject.has("token_type")) {
                    HashMap hashMap = new HashMap();
                    String optString3 = optJSONObject.optString("token_type");
                    C89219l.m154716b(optString3, "");
                    hashMap.put("token_type", optString3);
                    bundle.putSerializable("feed_param_extra", hashMap);
                }
                this.f82778c.putAll(m71716b(optJSONObject));
            }
            AbstractC35081b g2 = m71717g();
            if ((g2 == null || !g2.mo61912a(jSONObject2, bundle)) && (e = mo26893e()) != null) {
                SmartRouter.buildRoute(e, "aweme://aweme/detaillist/".concat(String.valueOf(optString))).withParam(bundle).open();
            }
            C67690d.C67691a.m119848a(this.f82778c);
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("code", 1);
        aVar.mo61874a(jSONObject3);
    }
}
