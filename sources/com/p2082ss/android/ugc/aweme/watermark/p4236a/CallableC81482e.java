package com.p2082ss.android.ugc.aweme.watermark.p4236a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.watermark.a.e */
final /* synthetic */ class CallableC81482e implements Callable {

    /* renamed from: a */
    private final C81480d f182171a;

    /* renamed from: b */
    private final boolean f182172b;

    /* renamed from: c */
    private final boolean f182173c;

    /* renamed from: d */
    private final boolean f182174d;

    static {
        Covode.recordClassIndex(94855);
    }

    CallableC81482e(C81480d dVar, boolean z, boolean z2, boolean z3) {
        this.f182171a = dVar;
        this.f182172b = z;
        this.f182173c = z2;
        this.f182174d = z3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C81480d dVar = this.f182171a;
        boolean z = this.f182172b;
        boolean z2 = this.f182173c;
        boolean z3 = this.f182174d;
        if (dVar.f182162a == null) {
            C84911q.m145923a("WaterMarkComposer", new Throwable("context is null"));
            if (dVar.f182163b.f182241g != null) {
                dVar.f182163b.f182241g.mo125228b(-1);
            }
            return null;
        }
        dVar.f182164c = System.currentTimeMillis();
        int width = dVar.f182163b.f182238d.getWidth();
        int height = dVar.f182163b.f182238d.getHeight();
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(width));
        arrayList.add(Integer.valueOf(height));
        C63244g.m114602a().mo73288p().mo125206a(arrayList, dVar.f182163b.f182235a, dVar.f182163b.f182237c, new C81483f(dVar, z, z2, z3, width, height, arrayList), new C81484g(dVar));
        return null;
    }
}
