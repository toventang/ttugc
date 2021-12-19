package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.AbstractC18334e;
import com.bytedance.ies.web.jsbridge2.C18338g;
import com.bytedance.ies.web.jsbridge2.EnumC18323ah;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.aq */
public final class C7097aq extends AbstractC18334e<JSONObject, JSONObject> {

    /* renamed from: a */
    public boolean f17704a;

    static {
        Covode.recordClassIndex(7843);
    }

    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18334e
    public final void onTerminate() {
    }

    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18332c
    public final EnumC18323ah getPermissionGroup() {
        return EnumC18323ah.PRIVATE;
    }

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.aq$a */
    public static final class C7098a implements IHostAction.AbstractC11787b {

        /* renamed from: a */
        final /* synthetic */ C7097aq f17705a;

        static {
            Covode.recordClassIndex(7844);
        }

        @Override // com.bytedance.android.livesdkapi.host.IHostAction.AbstractC11787b
        /* renamed from: a */
        public final void mo13358a() {
            if (!this.f17705a.f17704a) {
                this.f17705a.finishWithFailure();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C7098a(C7097aq aqVar) {
            this.f17705a = aqVar;
        }

        @Override // com.bytedance.android.livesdkapi.host.IHostAction.AbstractC11787b
        /* renamed from: a */
        public final void mo13359a(String str, String str2) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("phoneCode", str);
            jSONObject.put("shortCountryName", str2);
            this.f17705a.f17704a = true;
            this.f17705a.finishWithResult(jSONObject);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.web.jsbridge2.g] */
    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18334e
    public final /* synthetic */ void invoke(JSONObject jSONObject, C18338g gVar) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(gVar, "");
        ((IHostAction) C6193a.m13435a(IHostAction.class)).openRegionListPage(C11279p.m20001a(gVar.f43859a), new C7098a(this));
    }
}
