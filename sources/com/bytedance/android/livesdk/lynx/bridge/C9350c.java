package com.bytedance.android.livesdk.lynx.bridge;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.p1165c.AbstractC16629c;
import com.bytedance.ies.web.jsbridge2.AbstractC18329b;
import com.bytedance.ies.web.jsbridge2.C18345k;
import com.bytedance.ies.web.jsbridge2.C18362v;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.WritableMap;
import org.json.JSONObject;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.lynx.bridge.c */
public final class C9350c extends AbstractC18329b {

    /* renamed from: d */
    public static final C9351a f22823d = new C9351a((byte) 0);

    /* renamed from: a */
    public TTLiveLynxBridgeModule f22824a;

    /* renamed from: b */
    public AbstractC16629c f22825b;

    /* renamed from: c */
    public AbstractC89172b<? super TTLiveLynxBridgeModule, C89391z> f22826c;

    /* renamed from: n */
    private final Context f22827n;

    /* renamed from: o */
    private final AbstractC89171a<String> f22828o;

    static {
        Covode.recordClassIndex(10855);
    }

    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18329b
    /* renamed from: a */
    public final void mo16235a(C18345k kVar) {
    }

    /* renamed from: com.bytedance.android.livesdk.lynx.bridge.c$a */
    public static final class C9351a {
        static {
            Covode.recordClassIndex(10856);
        }

        private C9351a() {
        }

        public /* synthetic */ C9351a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18329b
    /* renamed from: a */
    public final String mo16233a() {
        return this.f22828o.invoke();
    }

    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18329b
    /* renamed from: b */
    public final View mo16240b() {
        AbstractC16629c cVar = this.f22825b;
        if (cVar != null) {
            return cVar.mo26408a();
        }
        return null;
    }

    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18329b
    /* renamed from: b */
    public final Context mo16239b(C18345k kVar) {
        return this.f22827n;
    }

    /* renamed from: a */
    public final void mo16234a(TTLiveLynxBridgeModule tTLiveLynxBridgeModule) {
        C89219l.m154721d(tTLiveLynxBridgeModule, "");
        this.f22824a = tTLiveLynxBridgeModule;
    }

    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18329b
    /* renamed from: a */
    public final void mo16236a(String str) {
        Object remove;
        JSONObject jSONObject = new JSONObject(str);
        Object remove2 = jSONObject.remove("__event_id");
        if (!(remove2 instanceof String)) {
            remove2 = null;
        }
        String str2 = (String) remove2;
        if (str2 != null && (remove = jSONObject.remove("__params")) != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("code", 1);
            jSONObject2.put("data", remove);
            WritableMap a = C9348a.m17620a(jSONObject2);
            AbstractC16629c cVar = this.f22825b;
            if (cVar != null) {
                cVar.mo26410a(str2, JavaOnlyArray.m56670of(a));
            }
        }
    }

    public C9350c(Context context, AbstractC89171a<String> aVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(aVar, "");
        this.f22827n = context;
        this.f22828o = aVar;
    }

    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18329b
    /* renamed from: a */
    public final void mo16237a(String str, C18362v vVar) {
        if (vVar != null) {
            TTLiveLynxBridgeModule tTLiveLynxBridgeModule = this.f22824a;
            if (tTLiveLynxBridgeModule == null) {
                C89219l.m154710a("lynxBridgeModule");
            }
            tTLiveLynxBridgeModule.invokeCallback$livehybrid_impl_release(new JSONObject(str), vVar);
        }
    }

    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18329b
    /* renamed from: a */
    public final void mo16238a(JSONObject jSONObject, C18362v vVar) {
        C89219l.m154721d(jSONObject, "");
        if (vVar != null) {
            TTLiveLynxBridgeModule tTLiveLynxBridgeModule = this.f22824a;
            if (tTLiveLynxBridgeModule == null) {
                C89219l.m154710a("lynxBridgeModule");
            }
            tTLiveLynxBridgeModule.invokeCallback$livehybrid_impl_release(jSONObject, vVar);
        }
    }

    /* renamed from: a */
    public final C18362v mo16232a(String str, String str2, String str3, String str4) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        C18362v.C18363a a = C18362v.m34176a();
        a.f43923c = str;
        a.f43924d = str2;
        a.f43925e = str4;
        a.f43926f = str3;
        C18362v a2 = a.mo29399a();
        mo29335a(a2);
        C89219l.m154716b(a2, "");
        return a2;
    }
}
