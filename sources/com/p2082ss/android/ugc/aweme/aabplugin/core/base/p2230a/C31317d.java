package com.p2082ss.android.ugc.aweme.aabplugin.core.base.p2230a;

import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.aabplugin.core.base.AbstractC31339n;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.aabplugin.core.base.a.d */
public final class C31317d {

    /* renamed from: a */
    public static final C31317d f75041a = new C31317d();

    private C31317d() {
    }

    static {
        Covode.recordClassIndex(38017);
    }

    /* renamed from: a */
    public static void m65518a(AbstractC31339n nVar) {
        C89219l.m154721d(nVar, "");
        try {
            C12290b.m22066a("df_install_start", new JSONObject(nVar.mo57343c()), (JSONObject) null, (JSONObject) null);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static void m65519a(AbstractC31339n nVar, int i) {
        C89219l.m154721d(nVar, "");
        long currentTimeMillis = System.currentTimeMillis() - nVar.f75086j;
        try {
            JSONObject jSONObject = new JSONObject(nVar.mo57343c());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject.put("reason", i);
            jSONObject2.put("duration", currentTimeMillis);
            C12290b.m22066a("df_install_failed", jSONObject, jSONObject2, (JSONObject) null);
        } catch (Exception unused) {
        }
    }
}
