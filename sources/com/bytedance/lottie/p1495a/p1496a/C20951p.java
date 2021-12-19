package com.bytedance.lottie.p1495a.p1496a;

import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.C21106i;
import com.bytedance.lottie.p1495a.p1497b.AbstractC20954a;
import com.bytedance.lottie.p1499c.p1501b.C21006l;
import com.bytedance.lottie.p1499c.p1501b.C21009o;
import com.bytedance.lottie.p1499c.p1501b.C21014q;
import com.bytedance.lottie.p1499c.p1502c.AbstractC21017a;
import com.bytedance.lottie.p1505f.C21087h;
import java.util.List;

/* renamed from: com.bytedance.lottie.a.a.p */
public final class C20951p implements AbstractC20946l, AbstractC20954a.AbstractC20955a {

    /* renamed from: a */
    private final Path f49640a = new Path();

    /* renamed from: b */
    private final String f49641b;

    /* renamed from: c */
    private final C21106i f49642c;

    /* renamed from: d */
    private final AbstractC20954a<?, Path> f49643d;

    /* renamed from: e */
    private boolean f49644e;

    /* renamed from: f */
    private C20953r f49645f;

    static {
        Covode.recordClassIndex(24567);
    }

    @Override // com.bytedance.lottie.p1495a.p1496a.AbstractC20935b
    /* renamed from: b */
    public final String mo34457b() {
        return this.f49641b;
    }

    @Override // com.bytedance.lottie.p1495a.p1497b.AbstractC20954a.AbstractC20955a
    /* renamed from: a */
    public final void mo34451a() {
        this.f49644e = false;
        this.f49642c.invalidateSelf();
    }

    @Override // com.bytedance.lottie.p1495a.p1496a.AbstractC20946l
    /* renamed from: e */
    public final Path mo34460e() {
        if (this.f49644e) {
            return this.f49640a;
        }
        this.f49640a.reset();
        this.f49640a.set(this.f49643d.mo34470d());
        this.f49640a.setFillType(Path.FillType.EVEN_ODD);
        C21087h.m39718a(this.f49640a, this.f49645f);
        this.f49644e = true;
        return this.f49640a;
    }

    @Override // com.bytedance.lottie.p1495a.p1496a.AbstractC20935b
    /* renamed from: a */
    public final void mo34456a(List<AbstractC20935b> list, List<AbstractC20935b> list2) {
        for (int i = 0; i < list.size(); i++) {
            AbstractC20935b bVar = list.get(i);
            if (bVar instanceof C20953r) {
                C20953r rVar = (C20953r) bVar;
                if (rVar.f49650a == C21014q.EnumC21015a.Simultaneously) {
                    this.f49645f = rVar;
                    rVar.mo34462a(this);
                }
            }
        }
    }

    public C20951p(C21106i iVar, AbstractC21017a aVar, C21009o oVar) {
        this.f49641b = oVar.f49802a;
        this.f49642c = iVar;
        AbstractC20954a<C21006l, Path> a = oVar.f49803b.mo34480a();
        this.f49643d = a;
        aVar.mo34496a(a);
        a.mo34466a(this);
    }
}
