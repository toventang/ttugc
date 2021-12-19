package com.p2082ss.android.ugc.aweme.web.jsbridge;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.C18288a;
import com.bytedance.sdk.p1625a.p1638c.p1639a.C22349c;
import com.google.gson.C27910f;
import com.google.gson.p2019b.C27895a;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.p2355ax.p2356a.AbstractC34340m;
import com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.ShowOpenAuthHalf */
public final class ShowOpenAuthHalf extends BaseCommonJavaMethod implements AbstractC33974au {

    /* renamed from: a */
    public final String f182397a = "_aweme_params_verify_scope";

    /* renamed from: b */
    private BaseCommonJavaMethod.AbstractC47813a f182398b;

    /* renamed from: d */
    private String f182399d;

    /* renamed from: e */
    private String f182400e;

    /* renamed from: f */
    private String f182401f;

    /* renamed from: g */
    private final C18288a f182402g;

    static {
        Covode.recordClassIndex(94964);
    }

    @Override // androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.web.jsbridge.ShowOpenAuthHalf$a */
    public static final class C81569a extends C27895a<HashMap<String, Integer>> {
        static {
            Covode.recordClassIndex(94965);
        }

        C81569a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShowOpenAuthHalf(C18288a aVar) {
        super(aVar);
        C89219l.m154721d(aVar, "");
        this.f182402g = aVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.AbstractC47813a aVar) {
        AbstractC34340m mVar = (AbstractC34340m) mo79881b().mo60793a(AbstractC34340m.class);
        if (mVar != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(StringSet.type, "jsb");
            jSONObject2.put("bridge_name", "showOpenAuth");
            jSONObject2.put("bridge_access", "true");
            jSONObject2.put("stage", "open_jsb_auth");
            mVar.mo60779a("open_jsb_monitor", "open_jsb_invoke", jSONObject2, null, null);
        }
        this.f182398b = aVar;
        StringBuilder sb = new StringBuilder();
        String str = null;
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        if (jSONObject != null) {
            if (jSONObject.has("client_key")) {
                this.f182399d = jSONObject.getString("client_key");
            }
            if (jSONObject.has("scopes")) {
                Object a = new C27910f().mo46671a(jSONObject.getString("scopes"), new C81569a().type);
                C89219l.m154716b(a, "");
                for (Map.Entry entry : ((HashMap) a).entrySet()) {
                    String str2 = (String) entry.getKey();
                    int intValue = ((Number) entry.getValue()).intValue();
                    if (intValue == 0) {
                        if (sb.length() > 0) {
                            sb.append(",");
                        }
                        sb.append(str2);
                    } else if (intValue == 1) {
                        if (sb2.length() > 0) {
                            sb2.append(",");
                        }
                        sb2.append(str2);
                    } else if (intValue == 2) {
                        if (sb3.length() > 0) {
                            sb3.append(",");
                        }
                        sb3.append(str2);
                    }
                }
            }
            if (jSONObject.has("state")) {
                this.f182400e = jSONObject.getString("state");
            }
            if (jSONObject.has("redirect_uri")) {
                this.f182401f = jSONObject.getString("redirect_uri");
            }
            if (jSONObject.has("certificationInfo")) {
                str = jSONObject.getString("certificationInfo");
            }
        }
        C22349c.C22350a aVar2 = new C22349c.C22350a();
        aVar2.f52807a = this.f182400e;
        aVar2.f52808b = this.f182401f;
        if (sb.length() > 0) {
            aVar2.f52812f = sb.toString();
        }
        if (sb2.length() > 0) {
            aVar2.f52813g = sb2.toString();
        }
        if (sb3.length() > 0) {
            aVar2.f52814h = sb3.toString();
        }
        aVar2.f52809c = this.f182399d;
        aVar2.f52810d = "wap_to_native";
        Bundle bundle = new Bundle();
        aVar2.toBundle(bundle);
        if (str != null) {
            bundle.putString(this.f182397a, str);
        }
    }
}
