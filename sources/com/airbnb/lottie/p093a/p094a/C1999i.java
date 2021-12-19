package com.airbnb.lottie.p093a.p094a;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.p025c.C0489d;
import com.airbnb.lottie.C2122g;
import com.airbnb.lottie.p093a.p095b.AbstractC2012a;
import com.airbnb.lottie.p099e.p101b.C2065c;
import com.airbnb.lottie.p099e.p101b.C2067e;
import com.airbnb.lottie.p099e.p101b.EnumC2068f;
import com.airbnb.lottie.p099e.p102c.AbstractC2088a;
import com.bytedance.covode.number.Covode;

/* renamed from: com.airbnb.lottie.a.a.i */
public final class C1999i extends AbstractC1990a {

    /* renamed from: c */
    private final String f5997c;

    /* renamed from: d */
    private final C0489d<LinearGradient> f5998d = new C0489d<>();

    /* renamed from: e */
    private final C0489d<RadialGradient> f5999e = new C0489d<>();

    /* renamed from: f */
    private final RectF f6000f = new RectF();

    /* renamed from: g */
    private final EnumC2068f f6001g;

    /* renamed from: h */
    private final int f6002h;

    /* renamed from: i */
    private final AbstractC2012a<C2065c, C2065c> f6003i;

    /* renamed from: j */
    private final AbstractC2012a<PointF, PointF> f6004j;

    /* renamed from: k */
    private final AbstractC2012a<PointF, PointF> f6005k;

    static {
        Covode.recordClassIndex(2194);
    }

    @Override // com.airbnb.lottie.p093a.p094a.AbstractC1993c
    /* renamed from: b */
    public final String mo5903b() {
        return this.f5997c;
    }

    /* renamed from: c */
    private int m6351c() {
        int i;
        int round = Math.round(this.f6004j.f6066c * ((float) this.f6002h));
        int round2 = Math.round(this.f6005k.f6066c * ((float) this.f6002h));
        int round3 = Math.round(this.f6003i.f6066c * ((float) this.f6002h));
        if (round != 0) {
            i = round * 527;
        } else {
            i = 17;
        }
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        if (round3 != 0) {
            return i * 31 * round3;
        }
        return i;
    }

    public C1999i(C2122g gVar, AbstractC2088a aVar, C2067e eVar) {
        super(gVar, aVar, eVar.f6203h.toPaintCap(), eVar.f6204i.toPaintJoin(), eVar.f6205j, eVar.f6199d, eVar.f6202g, eVar.f6206k, eVar.f6207l);
        this.f5997c = eVar.f6196a;
        this.f6001g = eVar.f6197b;
        this.f6002h = (int) (gVar.f6396a.mo5941a() / 32.0f);
        AbstractC2012a<C2065c, C2065c> a = eVar.f6198c.mo5947a();
        this.f6003i = a;
        a.mo5912a(this);
        aVar.mo5964a(a);
        AbstractC2012a<PointF, PointF> a2 = eVar.f6200e.mo5947a();
        this.f6004j = a2;
        a2.mo5912a(this);
        aVar.mo5964a(a2);
        AbstractC2012a<PointF, PointF> a3 = eVar.f6201f.mo5947a();
        this.f6005k = a3;
        a3.mo5912a(this);
        aVar.mo5964a(a3);
    }

    @Override // com.airbnb.lottie.p093a.p094a.AbstractC1990a, com.airbnb.lottie.p093a.p094a.AbstractC1995e
    /* renamed from: a */
    public final void mo5896a(Canvas canvas, Matrix matrix, int i) {
        mo5897a(this.f6000f, matrix);
        if (this.f6001g == EnumC2068f.Linear) {
            Paint paint = this.f5938b;
            long c = (long) m6351c();
            LinearGradient a = this.f5998d.mo2078a(c, null);
            if (a == null) {
                PointF f = this.f6004j.mo5918f();
                PointF f2 = this.f6005k.mo5918f();
                C2065c f3 = this.f6003i.mo5918f();
                a = new LinearGradient((float) ((int) (this.f6000f.left + (this.f6000f.width() / 2.0f) + f.x)), (float) ((int) (this.f6000f.top + (this.f6000f.height() / 2.0f) + f.y)), (float) ((int) (this.f6000f.left + (this.f6000f.width() / 2.0f) + f2.x)), (float) ((int) (this.f6000f.top + (this.f6000f.height() / 2.0f) + f2.y)), f3.f6186b, f3.f6185a, Shader.TileMode.CLAMP);
                this.f5998d.mo2083b(c, a);
            }
            paint.setShader(a);
        } else {
            Paint paint2 = this.f5938b;
            long c2 = (long) m6351c();
            RadialGradient a2 = this.f5999e.mo2077a(c2);
            if (a2 == null) {
                PointF f4 = this.f6004j.mo5918f();
                PointF f5 = this.f6005k.mo5918f();
                C2065c f6 = this.f6003i.mo5918f();
                int[] iArr = f6.f6186b;
                float[] fArr = f6.f6185a;
                int width = (int) (this.f6000f.left + (this.f6000f.width() / 2.0f) + f4.x);
                int height = (int) (this.f6000f.top + (this.f6000f.height() / 2.0f) + f4.y);
                a2 = new RadialGradient((float) width, (float) height, (float) Math.hypot((double) (((int) ((this.f6000f.left + (this.f6000f.width() / 2.0f)) + f5.x)) - width), (double) (((int) ((this.f6000f.top + (this.f6000f.height() / 2.0f)) + f5.y)) - height)), iArr, fArr, Shader.TileMode.CLAMP);
                this.f5999e.mo2083b(c2, a2);
            }
            paint2.setShader(a2);
        }
        super.mo5896a(canvas, matrix, i);
    }
}
