package com.bytedance.android.ecommerce.p156b;

import android.text.TextUtils;
import com.bytedance.android.ecommerce.p159e.C2778c;
import com.bytedance.android.ecommerce.p162h.C2799a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18400b;
import com.bytedance.ies.xbridge.AbstractC18754n;
import com.bytedance.ies.xbridge.EnumC18483e;

/* renamed from: com.bytedance.android.ecommerce.b.c */
public class C2755c extends AbstractC2753a {

    /* renamed from: a */
    private final String f8292a = "LoadCyberScriptMethod";

    static {
        Covode.recordClassIndex(3181);
    }

    @Override // com.bytedance.android.ecommerce.p156b.AbstractC2753a
    /* renamed from: a */
    public final String mo7339a() {
        return "pipo.executeRiskJS";
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18400b, com.bytedance.android.ecommerce.p156b.AbstractC2753a
    /* renamed from: a */
    public final void mo7340a(AbstractC18754n nVar, AbstractC18400b.AbstractC18402b bVar, EnumC18483e eVar) {
        String str;
        super.mo7340a(nVar, bVar, eVar);
        if (nVar.mo29757a("session_id")) {
            str = nVar.mo29763f("session_id");
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            C2799a.m8036a("orgId/sessionId/merchantId is null!", bVar);
            return;
        }
        try {
            String a = C2778c.f8362a.mo7377i().mo7392a(str);
            if (TextUtils.equals(a, "success")) {
                C2799a.m8035a((Object) "success", bVar);
            } else {
                C2799a.m8036a(a, bVar);
            }
        } catch (Throwable th) {
            C2799a.m8036a(th.getMessage(), bVar);
        }
    }
}
