package com.bytedance.lottie.p1495a.p1496a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.AbstractC21121m;
import com.bytedance.lottie.C21106i;
import com.bytedance.lottie.p1495a.p1497b.AbstractC20954a;
import com.bytedance.lottie.p1495a.p1497b.C20969o;
import com.bytedance.lottie.p1499c.C21033e;
import com.bytedance.lottie.p1499c.p1501b.C21005k;
import com.bytedance.lottie.p1499c.p1502c.AbstractC21017a;
import com.bytedance.lottie.p1505f.C21084f;
import com.bytedance.lottie.p1506g.C21091c;
import java.util.List;

/* renamed from: com.bytedance.lottie.a.a.o */
public final class C20950o implements AbstractC20937d, AbstractC20942i, AbstractC20943j, AbstractC20946l, AbstractC20954a.AbstractC20955a {

    /* renamed from: a */
    private final Matrix f49631a = new Matrix();

    /* renamed from: b */
    private final Path f49632b = new Path();

    /* renamed from: c */
    private final C21106i f49633c;

    /* renamed from: d */
    private final AbstractC21017a f49634d;

    /* renamed from: e */
    private final String f49635e;

    /* renamed from: f */
    private final AbstractC20954a<Float, Float> f49636f;

    /* renamed from: g */
    private final AbstractC20954a<Float, Float> f49637g;

    /* renamed from: h */
    private final C20969o f49638h;

    /* renamed from: i */
    private C20936c f49639i;

    static {
        Covode.recordClassIndex(24566);
    }

    @Override // com.bytedance.lottie.p1495a.p1496a.AbstractC20935b
    /* renamed from: b */
    public final String mo34457b() {
        return this.f49635e;
    }

    @Override // com.bytedance.lottie.p1495a.p1497b.AbstractC20954a.AbstractC20955a
    /* renamed from: a */
    public final void mo34451a() {
        this.f49633c.invalidateSelf();
    }

    @Override // com.bytedance.lottie.p1495a.p1496a.AbstractC20946l
    /* renamed from: e */
    public final Path mo34460e() {
        Path e = this.f49639i.mo34460e();
        this.f49632b.reset();
        float floatValue = this.f49636f.mo34470d().floatValue();
        float floatValue2 = this.f49637g.mo34470d().floatValue();
        for (int i = ((int) floatValue) - 1; i >= 0; i--) {
            this.f49631a.set(this.f49638h.mo34472a(((float) i) + floatValue2));
            this.f49632b.addPath(e, this.f49631a);
        }
        return this.f49632b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0005 A[LOOP:0: B:3:0x0005->B:6:0x000f, LOOP_START] */
    @Override // com.bytedance.lottie.p1495a.p1496a.AbstractC20942i
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo34461a(java.util.ListIterator<com.bytedance.lottie.p1495a.p1496a.AbstractC20935b> r7) {
        /*
            r6 = this;
            com.bytedance.lottie.a.a.c r0 = r6.f49639i
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            boolean r0 = r7.hasPrevious()
            if (r0 == 0) goto L_0x0011
            java.lang.Object r0 = r7.previous()
            if (r0 != r6) goto L_0x0005
        L_0x0011:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L_0x0016:
            boolean r0 = r7.hasPrevious()
            if (r0 == 0) goto L_0x0027
            java.lang.Object r0 = r7.previous()
            r4.add(r0)
            r7.remove()
            goto L_0x0016
        L_0x0027:
            java.util.Collections.reverse(r4)
            com.bytedance.lottie.a.a.c r0 = new com.bytedance.lottie.a.a.c
            com.bytedance.lottie.i r1 = r6.f49633c
            com.bytedance.lottie.c.c.a r2 = r6.f49634d
            r5 = 0
            java.lang.String r3 = "Repeater"
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f49639i = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lottie.p1495a.p1496a.C20950o.mo34461a(java.util.ListIterator):void");
    }

    @Override // com.bytedance.lottie.p1495a.p1496a.AbstractC20937d
    /* renamed from: a */
    public final void mo34453a(RectF rectF, Matrix matrix) {
        this.f49639i.mo34453a(rectF, matrix);
    }

    @Override // com.bytedance.lottie.p1499c.AbstractC21034f
    /* renamed from: a */
    public final <T> void mo34455a(T t, C21091c<T> cVar) {
        if (!this.f49638h.mo34475a(t, cVar)) {
            if (t == AbstractC21121m.f50088m) {
                this.f49636f.mo34467a(cVar);
            } else if (t == AbstractC21121m.f50089n) {
                this.f49637g.mo34467a(cVar);
            }
        }
    }

    @Override // com.bytedance.lottie.p1495a.p1496a.AbstractC20935b
    /* renamed from: a */
    public final void mo34456a(List<AbstractC20935b> list, List<AbstractC20935b> list2) {
        this.f49639i.mo34456a(list, list2);
    }

    public C20950o(C21106i iVar, AbstractC21017a aVar, C21005k kVar) {
        this.f49633c = iVar;
        this.f49634d = aVar;
        this.f49635e = kVar.f49788a;
        AbstractC20954a<Float, Float> a = kVar.f49789b.mo34480a();
        this.f49636f = a;
        aVar.mo34496a(a);
        a.mo34466a(this);
        AbstractC20954a<Float, Float> a2 = kVar.f49790c.mo34480a();
        this.f49637g = a2;
        aVar.mo34496a(a2);
        a2.mo34466a(this);
        C20969o a3 = kVar.f49791d.mo34484a();
        this.f49638h = a3;
        a3.mo34474a(aVar);
        a3.mo34473a(this);
    }

    @Override // com.bytedance.lottie.p1495a.p1496a.AbstractC20937d
    /* renamed from: a */
    public final void mo34452a(Canvas canvas, Matrix matrix, int i) {
        float floatValue = this.f49636f.mo34470d().floatValue();
        float floatValue2 = this.f49637g.mo34470d().floatValue();
        float floatValue3 = this.f49638h.f49691f.mo34470d().floatValue() / 100.0f;
        float floatValue4 = this.f49638h.f49692g.mo34470d().floatValue() / 100.0f;
        for (int i2 = ((int) floatValue) - 1; i2 >= 0; i2--) {
            this.f49631a.set(matrix);
            float f = (float) i2;
            this.f49631a.preConcat(this.f49638h.mo34472a(f + floatValue2));
            this.f49639i.mo34452a(canvas, this.f49631a, (int) (((float) i) * (((f / floatValue) * (floatValue4 - floatValue3)) + floatValue3)));
        }
    }

    @Override // com.bytedance.lottie.p1499c.AbstractC21034f
    /* renamed from: a */
    public final void mo34454a(C21033e eVar, int i, List<C21033e> list, C21033e eVar2) {
        C21084f.m39710a(eVar, i, list, eVar2, this);
    }
}
