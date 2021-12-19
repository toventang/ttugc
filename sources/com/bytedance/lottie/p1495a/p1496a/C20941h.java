package com.bytedance.lottie.p1495a.p1496a;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.p025c.C0489d;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.C21106i;
import com.bytedance.lottie.p1495a.p1497b.AbstractC20954a;
import com.bytedance.lottie.p1499c.p1501b.C20994c;
import com.bytedance.lottie.p1499c.p1501b.C20996e;
import com.bytedance.lottie.p1499c.p1501b.EnumC20997f;
import com.bytedance.lottie.p1499c.p1502c.AbstractC21017a;

/* renamed from: com.bytedance.lottie.a.a.h */
public final class C20941h extends AbstractC20933a {

    /* renamed from: b */
    private final String f49592b;

    /* renamed from: c */
    private final C0489d<LinearGradient> f49593c = new C0489d<>();

    /* renamed from: d */
    private final C0489d<RadialGradient> f49594d = new C0489d<>();

    /* renamed from: e */
    private final RectF f49595e = new RectF();

    /* renamed from: f */
    private final EnumC20997f f49596f;

    /* renamed from: g */
    private final int f49597g;

    /* renamed from: h */
    private final AbstractC20954a<C20994c, C20994c> f49598h;

    /* renamed from: i */
    private final AbstractC20954a<PointF, PointF> f49599i;

    /* renamed from: j */
    private final AbstractC20954a<PointF, PointF> f49600j;

    static {
        Covode.recordClassIndex(24557);
    }

    @Override // com.bytedance.lottie.p1495a.p1496a.AbstractC20935b
    /* renamed from: b */
    public final String mo34457b() {
        return this.f49592b;
    }

    /* renamed from: c */
    private int m39450c() {
        int i;
        int round = Math.round(this.f49599i.f49658c * ((float) this.f49597g));
        int round2 = Math.round(this.f49600j.f49658c * ((float) this.f49597g));
        int round3 = Math.round(this.f49598h.f49658c * ((float) this.f49597g));
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

    public C20941h(C21106i iVar, AbstractC21017a aVar, C20996e eVar) {
        super(iVar, aVar, eVar.f49760h.toPaintCap(), eVar.f49761i.toPaintJoin(), eVar.f49762j, eVar.f49756d, eVar.f49759g, eVar.f49763k, eVar.f49764l);
        this.f49592b = eVar.f49753a;
        this.f49596f = eVar.f49754b;
        this.f49597g = (int) (iVar.f50032a.mo34559a() / 32.0f);
        AbstractC20954a<C20994c, C20994c> a = eVar.f49755c.mo34480a();
        this.f49598h = a;
        a.mo34466a(this);
        aVar.mo34496a(a);
        AbstractC20954a<PointF, PointF> a2 = eVar.f49757e.mo34480a();
        this.f49599i = a2;
        a2.mo34466a(this);
        aVar.mo34496a(a2);
        AbstractC20954a<PointF, PointF> a3 = eVar.f49758f.mo34480a();
        this.f49600j = a3;
        a3.mo34466a(this);
        aVar.mo34496a(a3);
    }

    @Override // com.bytedance.lottie.p1495a.p1496a.AbstractC20933a, com.bytedance.lottie.p1495a.p1496a.AbstractC20937d
    /* renamed from: a */
    public final void mo34452a(Canvas canvas, Matrix matrix, int i) {
        mo34453a(this.f49595e, matrix);
        if (this.f49596f == EnumC20997f.Linear) {
            Paint paint = this.f49534a;
            long c = (long) m39450c();
            LinearGradient a = this.f49593c.mo2078a(c, null);
            if (a == null) {
                PointF d = this.f49599i.mo34470d();
                PointF d2 = this.f49600j.mo34470d();
                C20994c d3 = this.f49598h.mo34470d();
                a = new LinearGradient((float) ((int) (this.f49595e.left + (this.f49595e.width() / 2.0f) + d.x)), (float) ((int) (this.f49595e.top + (this.f49595e.height() / 2.0f) + d.y)), (float) ((int) (this.f49595e.left + (this.f49595e.width() / 2.0f) + d2.x)), (float) ((int) (this.f49595e.top + (this.f49595e.height() / 2.0f) + d2.y)), d3.f49743b, d3.f49742a, Shader.TileMode.CLAMP);
                this.f49593c.mo2083b(c, a);
            }
            paint.setShader(a);
        } else {
            Paint paint2 = this.f49534a;
            long c2 = (long) m39450c();
            RadialGradient a2 = this.f49594d.mo2077a(c2);
            if (a2 == null) {
                PointF d4 = this.f49599i.mo34470d();
                PointF d5 = this.f49600j.mo34470d();
                C20994c d6 = this.f49598h.mo34470d();
                int[] iArr = d6.f49743b;
                float[] fArr = d6.f49742a;
                int width = (int) (this.f49595e.left + (this.f49595e.width() / 2.0f) + d4.x);
                int height = (int) (this.f49595e.top + (this.f49595e.height() / 2.0f) + d4.y);
                a2 = new RadialGradient((float) width, (float) height, (float) Math.hypot((double) (((int) ((this.f49595e.left + (this.f49595e.width() / 2.0f)) + d5.x)) - width), (double) (((int) ((this.f49595e.top + (this.f49595e.height() / 2.0f)) + d5.y)) - height)), iArr, fArr, Shader.TileMode.CLAMP);
                this.f49594d.mo2083b(c2, a2);
            }
            paint2.setShader(a2);
        }
        super.mo34452a(canvas, matrix, i);
    }
}
