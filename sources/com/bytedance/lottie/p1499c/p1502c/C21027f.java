package com.bytedance.lottie.p1499c.p1502c;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.C21106i;
import com.bytedance.lottie.p1495a.p1496a.C20936c;
import com.bytedance.lottie.p1499c.C21033e;
import com.bytedance.lottie.p1499c.p1501b.C21008n;
import java.util.Collections;
import java.util.List;

/* renamed from: com.bytedance.lottie.c.c.f */
public final class C21027f extends AbstractC21017a {

    /* renamed from: g */
    private final C20936c f49886g;

    static {
        Covode.recordClassIndex(24643);
    }

    @Override // com.bytedance.lottie.p1495a.p1496a.AbstractC20937d, com.bytedance.lottie.p1499c.p1502c.AbstractC21017a
    /* renamed from: a */
    public final void mo34453a(RectF rectF, Matrix matrix) {
        super.mo34453a(rectF, matrix);
        this.f49886g.mo34453a(rectF, this.f49828a);
    }

    C21027f(C21106i iVar, C21023d dVar) {
        super(iVar, dVar);
        C20936c cVar = new C20936c(iVar, this, new C21008n("__container", dVar.f49863a));
        this.f49886g = cVar;
        cVar.mo34456a(Collections.emptyList(), Collections.emptyList());
    }

    /* access modifiers changed from: package-private */
    @Override // com.bytedance.lottie.p1499c.p1502c.AbstractC21017a
    /* renamed from: b */
    public final void mo34498b(Canvas canvas, Matrix matrix, int i) {
        this.f49886g.mo34452a(canvas, matrix, i);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.lottie.p1499c.p1502c.AbstractC21017a
    /* renamed from: b */
    public final void mo34499b(C21033e eVar, int i, List<C21033e> list, C21033e eVar2) {
        this.f49886g.mo34454a(eVar, i, list, eVar2);
    }
}
