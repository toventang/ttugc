package com.airbnb.lottie.p093a.p094a;

import com.airbnb.lottie.p093a.p095b.AbstractC2012a;
import com.airbnb.lottie.p099e.p101b.C2085q;
import com.airbnb.lottie.p099e.p102c.AbstractC2088a;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.a.s */
public final class C2011s implements AbstractC1993c, AbstractC2012a.AbstractC2013a {

    /* renamed from: a */
    public final C2085q.EnumC2086a f6058a;

    /* renamed from: b */
    public final AbstractC2012a<?, Float> f6059b;

    /* renamed from: c */
    public final AbstractC2012a<?, Float> f6060c;

    /* renamed from: d */
    public final AbstractC2012a<?, Float> f6061d;

    /* renamed from: e */
    private final String f6062e;

    /* renamed from: f */
    private final List<AbstractC2012a.AbstractC2013a> f6063f = new ArrayList();

    static {
        Covode.recordClassIndex(2206);
    }

    @Override // com.airbnb.lottie.p093a.p094a.AbstractC1993c
    /* renamed from: a */
    public final void mo5900a(List<AbstractC1993c> list, List<AbstractC1993c> list2) {
    }

    @Override // com.airbnb.lottie.p093a.p094a.AbstractC1993c
    /* renamed from: b */
    public final String mo5903b() {
        return this.f6062e;
    }

    @Override // com.airbnb.lottie.p093a.p095b.AbstractC2012a.AbstractC2013a
    /* renamed from: a */
    public final void mo5895a() {
        for (int i = 0; i < this.f6063f.size(); i++) {
            this.f6063f.get(i).mo5895a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo5908a(AbstractC2012a.AbstractC2013a aVar) {
        this.f6063f.add(aVar);
    }

    public C2011s(AbstractC2088a aVar, C2085q qVar) {
        this.f6062e = qVar.f6261a;
        this.f6058a = qVar.f6262b;
        AbstractC2012a<Float, Float> a = qVar.f6263c.mo5947a();
        this.f6059b = a;
        AbstractC2012a<Float, Float> a2 = qVar.f6264d.mo5947a();
        this.f6060c = a2;
        AbstractC2012a<Float, Float> a3 = qVar.f6265e.mo5947a();
        this.f6061d = a3;
        aVar.mo5964a(a);
        aVar.mo5964a(a2);
        aVar.mo5964a(a3);
        a.mo5912a(this);
        a2.mo5912a(this);
        a3.mo5912a(this);
    }
}
