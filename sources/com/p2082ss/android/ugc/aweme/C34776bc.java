package com.p2082ss.android.ugc.aweme;

import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.C34397az;
import com.p2082ss.android.ugc.aweme.C34769bb;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.bc */
public final /* synthetic */ class C34776bc implements C34769bb.AbstractC34770a {

    /* renamed from: a */
    private final String f82115a;

    static {
        Covode.recordClassIndex(41772);
    }

    C34776bc(String str) {
        this.f82115a = str;
    }

    @Override // com.p2082ss.android.ugc.aweme.C34769bb.AbstractC34770a
    /* renamed from: a */
    public final void mo61485a(String str) {
        String str2 = this.f82115a;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(str2, str);
            if ("internal".equals(str2)) {
                C34397az.C34398a a = C34397az.m70386a();
                jSONObject.put("free", a.f81317a);
                jSONObject.put("total", a.f81318b);
                jSONObject.put("availPercent", a.f81319c);
            }
            C12290b.m22064a("tt_diskusage", jSONObject);
        } catch (Throwable unused) {
        }
    }
}
