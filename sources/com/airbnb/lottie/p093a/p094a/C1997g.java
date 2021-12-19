package com.airbnb.lottie.p093a.p094a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.AbstractC2206k;
import com.airbnb.lottie.C2041d;
import com.airbnb.lottie.C2122g;
import com.airbnb.lottie.p093a.p095b.AbstractC2012a;
import com.airbnb.lottie.p093a.p095b.C2032p;
import com.airbnb.lottie.p099e.C2104e;
import com.airbnb.lottie.p099e.p101b.C2078m;
import com.airbnb.lottie.p099e.p102c.AbstractC2088a;
import com.airbnb.lottie.p104g.C2144d;
import com.airbnb.lottie.p106i.C2192f;
import com.airbnb.lottie.p107j.C2204c;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.a.g */
public final class C1997g implements AbstractC1995e, AbstractC2001k, AbstractC2012a.AbstractC2013a {

    /* renamed from: a */
    private final Path f5971a;

    /* renamed from: b */
    private final Paint f5972b = new Paint(1);

    /* renamed from: c */
    private final AbstractC2088a f5973c;

    /* renamed from: d */
    private final String f5974d;

    /* renamed from: e */
    private final List<AbstractC2004m> f5975e = new ArrayList();

    /* renamed from: f */
    private final AbstractC2012a<Integer, Integer> f5976f;

    /* renamed from: g */
    private final AbstractC2012a<Integer, Integer> f5977g;

    /* renamed from: h */
    private AbstractC2012a<ColorFilter, ColorFilter> f5978h;

    /* renamed from: i */
    private final C2122g f5979i;

    static {
        Covode.recordClassIndex(2192);
    }

    @Override // com.airbnb.lottie.p093a.p094a.AbstractC1993c
    /* renamed from: b */
    public final String mo5903b() {
        return this.f5974d;
    }

    @Override // com.airbnb.lottie.p093a.p095b.AbstractC2012a.AbstractC2013a
    /* renamed from: a */
    public final void mo5895a() {
        this.f5979i.invalidateSelf();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: java.util.List<com.airbnb.lottie.a.a.m> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.p093a.p094a.AbstractC1993c
    /* renamed from: a */
    public final void mo5900a(List<AbstractC1993c> list, List<AbstractC1993c> list2) {
        for (int i = 0; i < list2.size(); i++) {
            AbstractC1993c cVar = list2.get(i);
            if (cVar instanceof AbstractC2004m) {
                this.f5975e.add(cVar);
            }
        }
    }

    @Override // com.airbnb.lottie.p093a.p094a.AbstractC1995e
    /* renamed from: a */
    public final void mo5897a(RectF rectF, Matrix matrix) {
        this.f5971a.reset();
        for (int i = 0; i < this.f5975e.size(); i++) {
            this.f5971a.addPath(this.f5975e.get(i).mo5906e(), matrix);
        }
        this.f5971a.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // com.airbnb.lottie.p099e.AbstractC2105f
    /* renamed from: a */
    public final <T> void mo5899a(T t, C2204c<T> cVar) {
        AbstractC2012a<ColorFilter, ColorFilter> aVar;
        if (t == AbstractC2206k.f6595a) {
            this.f5976f.mo5913a(cVar);
        } else if (t == AbstractC2206k.f6598d) {
            this.f5977g.mo5913a(cVar);
        } else if (t == AbstractC2206k.f6593C) {
            if (C2144d.C2145a.f6479a && (aVar = this.f5978h) != null) {
                this.f5973c.mo5968b(aVar);
            }
            if (cVar == null) {
                this.f5978h = null;
                return;
            }
            C2032p pVar = new C2032p(cVar);
            this.f5978h = pVar;
            pVar.mo5912a(this);
            this.f5973c.mo5964a(this.f5978h);
        }
    }

    public C1997g(C2122g gVar, AbstractC2088a aVar, C2078m mVar) {
        Path path = new Path();
        this.f5971a = path;
        this.f5973c = aVar;
        this.f5974d = mVar.f6239b;
        this.f5979i = gVar;
        if (mVar.f6240c == null || mVar.f6241d == null) {
            this.f5976f = null;
            this.f5977g = null;
            return;
        }
        path.setFillType(mVar.f6238a);
        AbstractC2012a<Integer, Integer> a = mVar.f6240c.mo5947a();
        this.f5976f = a;
        a.mo5912a(this);
        aVar.mo5964a(a);
        AbstractC2012a<Integer, Integer> a2 = mVar.f6241d.mo5947a();
        this.f5977g = a2;
        a2.mo5912a(this);
        aVar.mo5964a(a2);
    }

    @Override // com.airbnb.lottie.p093a.p094a.AbstractC1995e
    /* renamed from: a */
    public final void mo5896a(Canvas canvas, Matrix matrix, int i) {
        C2041d.m6462b("FillContent#draw");
        this.f5972b.setColor(this.f5976f.mo5918f().intValue());
        this.f5972b.setAlpha(C2192f.m6787a((int) ((((((float) i) / 255.0f) * ((float) this.f5977g.mo5918f().intValue())) / 100.0f) * 255.0f)));
        AbstractC2012a<ColorFilter, ColorFilter> aVar = this.f5978h;
        if (aVar != null) {
            this.f5972b.setColorFilter(aVar.mo5918f());
        }
        this.f5971a.reset();
        for (int i2 = 0; i2 < this.f5975e.size(); i2++) {
            this.f5971a.addPath(this.f5975e.get(i2).mo5906e(), matrix);
        }
        canvas.drawPath(this.f5971a, this.f5972b);
        C2041d.m6463c("FillContent#draw");
    }

    @Override // com.airbnb.lottie.p099e.AbstractC2105f
    /* renamed from: a */
    public final void mo5898a(C2104e eVar, int i, List<C2104e> list, C2104e eVar2) {
        C2192f.m6791a(eVar, i, list, eVar2, this);
    }
}
