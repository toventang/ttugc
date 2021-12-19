package com.squareup.p2081b;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.squareup.p2081b.AbstractC29315y;
import com.squareup.p2081b.C29299t;

/* access modifiers changed from: package-private */
/* renamed from: com.squareup.b.z */
public final class C29317z extends AbstractC29315y {

    /* renamed from: a */
    private final Context f69609a;

    static {
        Covode.recordClassIndex(35666);
    }

    C29317z(Context context) {
        this.f69609a = context;
    }

    @Override // com.squareup.p2081b.AbstractC29315y
    /* renamed from: a */
    public final boolean mo51062a(C29312w wVar) {
        if (wVar.f69563e != 0) {
            return true;
        }
        return "android.resource".equals(wVar.f69562d.getScheme());
    }

    @Override // com.squareup.p2081b.AbstractC29315y
    /* renamed from: b */
    public final AbstractC29315y.C29316a mo51063b(C29312w wVar) {
        MethodCollector.m26663i(9080);
        Resources a = C29262ae.m58602a(this.f69609a, wVar);
        int a2 = C29262ae.m58599a(a, wVar);
        BitmapFactory.Options d = m58718d(wVar);
        if (m58717a(d)) {
            BitmapFactory.decodeResource(a, a2, d);
            m58716a(wVar.f69566h, wVar.f69567i, d, wVar);
        }
        AbstractC29315y.C29316a aVar = new AbstractC29315y.C29316a(BitmapFactory.decodeResource(a, a2, d), C29299t.EnumC29305d.DISK);
        MethodCollector.m26664o(9080);
        return aVar;
    }
}
