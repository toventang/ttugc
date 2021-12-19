package com.p1795d.p1796a.p1797a.p1798a.p1800b;

import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.d.a.a.a.b.d */
public final class C23773d {

    /* renamed from: a */
    public final C23779j f56235a;

    /* renamed from: b */
    public final WebView f56236b;

    /* renamed from: c */
    public final List<C23780k> f56237c;

    /* renamed from: d */
    public final Map<String, C23780k> f56238d = new HashMap();

    /* renamed from: e */
    public final String f56239e;

    /* renamed from: f */
    public final String f56240f;

    /* renamed from: g */
    public final String f56241g;

    /* renamed from: h */
    public final EnumC23774e f56242h;

    static {
        Covode.recordClassIndex(27881);
    }

    public C23773d(C23779j jVar, String str, List<C23780k> list, String str2, EnumC23774e eVar) {
        ArrayList arrayList = new ArrayList();
        this.f56237c = arrayList;
        this.f56235a = jVar;
        this.f56236b = null;
        this.f56239e = str;
        this.f56242h = eVar;
        if (list != null) {
            arrayList.addAll(list);
            for (C23780k kVar : list) {
                this.f56238d.put(UUID.randomUUID().toString(), kVar);
            }
        }
        this.f56241g = str2;
        this.f56240f = null;
    }
}
