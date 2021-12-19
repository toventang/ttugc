package com.bytedance.lottie.p1495a.p1496a;

import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.p1495a.p1497b.AbstractC20954a;
import com.bytedance.lottie.p1499c.p1501b.C21014q;
import com.bytedance.lottie.p1499c.p1502c.AbstractC21017a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.lottie.a.a.r */
public final class C20953r implements AbstractC20935b, AbstractC20954a.AbstractC20955a {

    /* renamed from: a */
    public final C21014q.EnumC21015a f49650a;

    /* renamed from: b */
    public final AbstractC20954a<?, Float> f49651b;

    /* renamed from: c */
    public final AbstractC20954a<?, Float> f49652c;

    /* renamed from: d */
    public final AbstractC20954a<?, Float> f49653d;

    /* renamed from: e */
    private final String f49654e;

    /* renamed from: f */
    private final List<AbstractC20954a.AbstractC20955a> f49655f = new ArrayList();

    static {
        Covode.recordClassIndex(24569);
    }

    @Override // com.bytedance.lottie.p1495a.p1496a.AbstractC20935b
    /* renamed from: a */
    public final void mo34456a(List<AbstractC20935b> list, List<AbstractC20935b> list2) {
    }

    @Override // com.bytedance.lottie.p1495a.p1496a.AbstractC20935b
    /* renamed from: b */
    public final String mo34457b() {
        return this.f49654e;
    }

    @Override // com.bytedance.lottie.p1495a.p1497b.AbstractC20954a.AbstractC20955a
    /* renamed from: a */
    public final void mo34451a() {
        for (int i = 0; i < this.f49655f.size(); i++) {
            this.f49655f.get(i).mo34451a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo34462a(AbstractC20954a.AbstractC20955a aVar) {
        this.f49655f.add(aVar);
    }

    public C20953r(AbstractC21017a aVar, C21014q qVar) {
        this.f49654e = qVar.f49818a;
        this.f49650a = qVar.f49819b;
        AbstractC20954a<Float, Float> a = qVar.f49820c.mo34480a();
        this.f49651b = a;
        AbstractC20954a<Float, Float> a2 = qVar.f49821d.mo34480a();
        this.f49652c = a2;
        AbstractC20954a<Float, Float> a3 = qVar.f49822e.mo34480a();
        this.f49653d = a3;
        aVar.mo34496a(a);
        aVar.mo34496a(a2);
        aVar.mo34496a(a3);
        a.mo34466a(this);
        a2.mo34466a(this);
        a3.mo34466a(this);
    }
}
