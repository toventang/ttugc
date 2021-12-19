package com.bytedance.sdk.p1625a.p1643f;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1626a.AbstractC22331g;
import com.bytedance.sdk.p1625a.p1626a.C22306c;
import com.bytedance.sdk.p1625a.p1626a.p1627a.AbstractC22288a;
import com.bytedance.sdk.p1625a.p1626a.p1630d.C22317d;
import com.bytedance.sdk.p1625a.p1641d.C22355a;
import com.bytedance.sdk.p1625a.p1644g.C22395d;
import java.util.Map;

/* renamed from: com.bytedance.sdk.a.f.i */
public final class C22389i implements AbstractC22331g {

    /* renamed from: a */
    private Context f52940a;

    static {
        Covode.recordClassIndex(26205);
    }

    public C22389i(Context context) {
        this.f52940a = context;
    }

    @Override // com.bytedance.sdk.p1625a.p1626a.AbstractC22331g
    /* renamed from: a */
    public final void mo36671a(String str, Map<String, String> map, AbstractC22288a<C22317d> aVar) {
        Context context = this.f52940a;
        String a = C22306c.C22307a.m41972a(str);
        C22355a.C22356a aVar2 = new C22355a.C22356a();
        aVar2.f52826a = a;
        new C22395d(context, aVar2.mo36707a(map).mo36710c(), aVar).mo36736d();
    }
}
