package com.p2082ss.android.ugc.aweme.web.jsbridge;

import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.C18288a;
import com.bytedance.sdk.p1625a.p1638c.p1639a.C22349c;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.p2355ax.p2356a.AbstractC34340m;
import com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.OpenAuthPageMethod */
public final class OpenAuthPageMethod extends BaseCommonJavaMethod implements AbstractC33974au, AbstractC81603d {
    public static final C81561a Companion = new C81561a((byte) 0);

    /* renamed from: a */
    private BaseCommonJavaMethod.AbstractC47813a f182378a;

    /* renamed from: b */
    private final C18288a f182379b;

    static {
        Covode.recordClassIndex(94951);
    }

    @Override // androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.web.jsbridge.OpenAuthPageMethod$a */
    public static final class C81561a {
        static {
            Covode.recordClassIndex(94952);
        }

        private C81561a() {
        }

        public /* synthetic */ C81561a(byte b) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OpenAuthPageMethod(C18288a aVar) {
        super(aVar);
        C89219l.m154721d(aVar, "");
        this.f182379b = aVar;
    }

    public final void onClick(String str) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("ticket", str);
        jSONObject.put("code", 1);
        jSONObject.put("response", jSONObject2);
        BaseCommonJavaMethod.AbstractC47813a aVar = this.f182378a;
        if (aVar != null) {
            aVar.mo79888a(jSONObject);
        }
    }

    public final void onError(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("code", 0);
        jSONObject.put("errorCode", str);
        jSONObject.put("errorMsg", str2);
        BaseCommonJavaMethod.AbstractC47813a aVar = this.f182378a;
        if (aVar != null) {
            aVar.mo79888a(jSONObject);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.AbstractC47813a aVar) {
        String str;
        String str2;
        String str3;
        this.f182378a = aVar;
        AbstractC34340m mVar = (AbstractC34340m) mo79881b().mo60793a(AbstractC34340m.class);
        if (mVar != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(StringSet.type, "jsb");
            jSONObject2.put("bridge_name", "jumpOpenAuthPage");
            jSONObject2.put("bridge_access", "true");
            jSONObject2.put("stage", "open_jsb_auth");
            mVar.mo60779a("open_jsb_monitor", "open_jsb_invoke", jSONObject2, null, null);
        }
        String str4 = null;
        if (jSONObject != null) {
            str = jSONObject.getString("client_key");
            jSONObject.getString("response_type");
            str2 = jSONObject.getString("scope");
            str3 = jSONObject.getString("state");
            str4 = jSONObject.getString("redirect_uri");
        } else {
            str = null;
            str2 = null;
            str3 = null;
        }
        C22349c.C22350a aVar2 = new C22349c.C22350a();
        aVar2.f52812f = str2;
        aVar2.f52807a = str3;
        aVar2.f52810d = "wap_to_native";
        aVar2.f52808b = str4;
        Bundle bundle = new Bundle();
        aVar2.toBundle(bundle);
        bundle.putString("_bytedance_params_client_key", str);
        bundle.putString("__bytedance_base_caller_version", "1");
        Context actContext = getActContext();
        C89219l.m154716b(actContext, "");
        bundle.putString("_bytedance_params_type_caller_package", actContext.getPackageName());
        bundle.putString("_aweme_params_enter_from_flag", "ENTER_FROM_INNER_WEB");
    }
}
