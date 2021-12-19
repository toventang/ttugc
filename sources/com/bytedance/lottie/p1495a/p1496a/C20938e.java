package com.bytedance.lottie.p1495a.p1496a;

import android.graphics.Path;
import android.graphics.PointF;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.AbstractC21121m;
import com.bytedance.lottie.C21106i;
import com.bytedance.lottie.p1495a.p1497b.AbstractC20954a;
import com.bytedance.lottie.p1499c.C21033e;
import com.bytedance.lottie.p1499c.p1501b.C20992a;
import com.bytedance.lottie.p1499c.p1501b.C21014q;
import com.bytedance.lottie.p1499c.p1502c.AbstractC21017a;
import com.bytedance.lottie.p1505f.C21084f;
import com.bytedance.lottie.p1505f.C21087h;
import com.bytedance.lottie.p1506g.C21091c;
import java.util.List;

/* renamed from: com.bytedance.lottie.a.a.e */
public final class C20938e implements AbstractC20943j, AbstractC20946l, AbstractC20954a.AbstractC20955a {

    /* renamed from: a */
    private final Path f49558a = new Path();

    /* renamed from: b */
    private final String f49559b;

    /* renamed from: c */
    private final C21106i f49560c;

    /* renamed from: d */
    private final AbstractC20954a<?, PointF> f49561d;

    /* renamed from: e */
    private final AbstractC20954a<?, PointF> f49562e;

    /* renamed from: f */
    private final C20992a f49563f;

    /* renamed from: g */
    private C20953r f49564g;

    /* renamed from: h */
    private boolean f49565h;

    static {
        Covode.recordClassIndex(24554);
    }

    @Override // com.bytedance.lottie.p1495a.p1496a.AbstractC20935b
    /* renamed from: b */
    public final String mo34457b() {
        return this.f49559b;
    }

    @Override // com.bytedance.lottie.p1495a.p1497b.AbstractC20954a.AbstractC20955a
    /* renamed from: a */
    public final void mo34451a() {
        this.f49565h = false;
        this.f49560c.invalidateSelf();
    }

    @Override // com.bytedance.lottie.p1495a.p1496a.AbstractC20946l
    /* renamed from: e */
    public final Path mo34460e() {
        if (this.f49565h) {
            return this.f49558a;
        }
        this.f49558a.reset();
        PointF d = this.f49561d.mo34470d();
        float f = d.x / 2.0f;
        float f2 = d.y / 2.0f;
        float f3 = f * 0.55228f;
        float f4 = 0.55228f * f2;
        this.f49558a.reset();
        if (this.f49563f.f49741d) {
            float f5 = -f2;
            this.f49558a.moveTo(0.0f, f5);
            float f6 = 0.0f - f3;
            float f7 = -f;
            float f8 = 0.0f - f4;
            this.f49558a.cubicTo(f6, f5, f7, f8, f7, 0.0f);
            float f9 = f4 + 0.0f;
            this.f49558a.cubicTo(f7, f9, f6, f2, 0.0f, f2);
            float f10 = f3 + 0.0f;
            this.f49558a.cubicTo(f10, f2, f, f9, f, 0.0f);
            this.f49558a.cubicTo(f, f8, f10, f5, 0.0f, f5);
        } else {
            float f11 = -f2;
            this.f49558a.moveTo(0.0f, f11);
            float f12 = f3 + 0.0f;
            float f13 = 0.0f - f4;
            this.f49558a.cubicTo(f12, f11, f, f13, f, 0.0f);
            float f14 = f4 + 0.0f;
            this.f49558a.cubicTo(f, f14, f12, f2, 0.0f, f2);
            float f15 = 0.0f - f3;
            float f16 = -f;
            this.f49558a.cubicTo(f15, f2, f16, f14, f16, 0.0f);
            this.f49558a.cubicTo(f16, f13, f15, f11, 0.0f, f11);
        }
        PointF d2 = this.f49562e.mo34470d();
        this.f49558a.offset(d2.x, d2.y);
        this.f49558a.close();
        C21087h.m39718a(this.f49558a, this.f49564g);
        this.f49565h = true;
        return this.f49558a;
    }

    @Override // com.bytedance.lottie.p1499c.AbstractC21034f
    /* renamed from: a */
    public final <T> void mo34455a(T t, C21091c<T> cVar) {
        if (t == AbstractC21121m.f50082g) {
            this.f49561d.mo34467a(cVar);
        } else if (t == AbstractC21121m.f50083h) {
            this.f49562e.mo34467a(cVar);
        }
    }

    @Override // com.bytedance.lottie.p1495a.p1496a.AbstractC20935b
    /* renamed from: a */
    public final void mo34456a(List<AbstractC20935b> list, List<AbstractC20935b> list2) {
        for (int i = 0; i < list.size(); i++) {
            AbstractC20935b bVar = list.get(i);
            if (bVar instanceof C20953r) {
                C20953r rVar = (C20953r) bVar;
                if (rVar.f49650a == C21014q.EnumC21015a.Simultaneously) {
                    this.f49564g = rVar;
                    rVar.mo34462a(this);
                }
            }
        }
    }

    public C20938e(C21106i iVar, AbstractC21017a aVar, C20992a aVar2) {
        this.f49559b = aVar2.f49738a;
        this.f49560c = iVar;
        AbstractC20954a<PointF, PointF> a = aVar2.f49740c.mo34480a();
        this.f49561d = a;
        AbstractC20954a<PointF, PointF> a2 = aVar2.f49739b.mo34480a();
        this.f49562e = a2;
        this.f49563f = aVar2;
        aVar.mo34496a(a);
        aVar.mo34496a(a2);
        a.mo34466a(this);
        a2.mo34466a(this);
    }

    @Override // com.bytedance.lottie.p1499c.AbstractC21034f
    /* renamed from: a */
    public final void mo34454a(C21033e eVar, int i, List<C21033e> list, C21033e eVar2) {
        C21084f.m39710a(eVar, i, list, eVar2, this);
    }
}
