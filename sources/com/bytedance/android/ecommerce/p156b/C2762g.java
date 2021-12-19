package com.bytedance.android.ecommerce.p156b;

import com.bytedance.android.ecommerce.p159e.C2778c;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18400b;
import com.bytedance.ies.xbridge.AbstractC18754n;
import com.bytedance.ies.xbridge.EnumC18483e;
import java.util.HashMap;

/* renamed from: com.bytedance.android.ecommerce.b.g */
public class C2762g extends AbstractC2753a {

    /* renamed from: a */
    private final String f8309a = "OpenWebViewMethod";

    /* renamed from: b */
    private final String f8310b = "url";

    static {
        Covode.recordClassIndex(3188);
    }

    @Override // com.bytedance.android.ecommerce.p156b.AbstractC2753a
    /* renamed from: a */
    public final String mo7339a() {
        return "pipo.openWebView";
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18400b, com.bytedance.android.ecommerce.p156b.AbstractC2753a
    /* renamed from: a */
    public final void mo7340a(AbstractC18754n nVar, AbstractC18400b.AbstractC18402b bVar, EnumC18483e eVar) {
        String str;
        super.mo7340a(nVar, bVar, eVar);
        if (nVar.mo29757a("url")) {
            str = nVar.mo29763f("url");
        } else {
            str = "";
        }
        bVar.mo13405a(new HashMap());
        C2778c.f8362a.mo7378j().mo7407a(str);
        bVar.mo13405a(null);
    }
}
