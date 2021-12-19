package com.airbnb.lottie.p093a.p094a;

import android.graphics.Path;
import com.airbnb.lottie.C2122g;
import com.airbnb.lottie.p093a.p095b.AbstractC2012a;
import com.airbnb.lottie.p099e.p101b.C2077l;
import com.airbnb.lottie.p099e.p101b.C2080o;
import com.airbnb.lottie.p099e.p101b.C2085q;
import com.airbnb.lottie.p099e.p102c.AbstractC2088a;
import com.airbnb.lottie.p104g.C2144d;
import com.airbnb.lottie.p106i.C2194g;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.a.q */
public final class C2009q implements AbstractC2004m, AbstractC2012a.AbstractC2013a {

    /* renamed from: a */
    private final Path f6047a = new Path();

    /* renamed from: b */
    private final String f6048b;

    /* renamed from: c */
    private final C2122g f6049c;

    /* renamed from: d */
    private final AbstractC2012a<?, Path> f6050d;

    /* renamed from: e */
    private boolean f6051e;

    /* renamed from: f */
    private C2011s f6052f;

    /* renamed from: g */
    private C1992b f6053g;

    static {
        Covode.recordClassIndex(2204);
    }

    @Override // com.airbnb.lottie.p093a.p094a.AbstractC1993c
    /* renamed from: b */
    public final String mo5903b() {
        return this.f6048b;
    }

    @Override // com.airbnb.lottie.p093a.p095b.AbstractC2012a.AbstractC2013a
    /* renamed from: a */
    public final void mo5895a() {
        this.f6051e = false;
        this.f6049c.invalidateSelf();
    }

    @Override // com.airbnb.lottie.p093a.p094a.AbstractC2004m
    /* renamed from: e */
    public final Path mo5906e() {
        C1992b bVar;
        if (this.f6051e) {
            return this.f6047a;
        }
        this.f6047a.reset();
        this.f6047a.set(this.f6050d.mo5918f());
        this.f6047a.setFillType(Path.FillType.EVEN_ODD);
        if (!C2144d.C2145a.f6479a || (bVar = this.f6053g) == null) {
            C2194g.m6797a(this.f6047a, this.f6052f);
        } else {
            bVar.mo5901a(this.f6047a);
        }
        this.f6051e = true;
        return this.f6047a;
    }

    @Override // com.airbnb.lottie.p093a.p094a.AbstractC1993c
    /* renamed from: a */
    public final void mo5900a(List<AbstractC1993c> list, List<AbstractC1993c> list2) {
        C1992b bVar;
        for (int i = 0; i < list.size(); i++) {
            AbstractC1993c cVar = list.get(i);
            if (cVar instanceof C2011s) {
                C2011s sVar = (C2011s) cVar;
                if (sVar.f6058a == C2085q.EnumC2086a.Simultaneously) {
                    if (!C2144d.C2145a.f6479a || (bVar = this.f6053g) == null) {
                        this.f6052f = sVar;
                        sVar.mo5908a(this);
                    } else {
                        bVar.mo5902a(sVar);
                        sVar.mo5908a(this);
                    }
                }
            }
        }
    }

    public C2009q(C2122g gVar, AbstractC2088a aVar, C2080o oVar) {
        if (C2144d.C2145a.f6479a) {
            this.f6053g = new C1992b();
        }
        this.f6048b = oVar.f6245a;
        this.f6049c = gVar;
        AbstractC2012a<C2077l, Path> a = oVar.f6246b.mo5947a();
        this.f6050d = a;
        aVar.mo5964a(a);
        a.mo5912a(this);
    }
}
