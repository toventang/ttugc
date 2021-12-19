package com.facebook.fresco.animation.p1863b;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import com.facebook.common.p1833e.C24099a;
import com.facebook.common.p1836h.C24117a;
import com.facebook.fresco.animation.p1862a.AbstractC24270a;
import com.facebook.fresco.animation.p1862a.AbstractC24275d;
import com.facebook.fresco.animation.p1862a.C24272c;
import com.facebook.fresco.animation.p1863b.p1865b.AbstractC24281a;
import com.facebook.fresco.animation.p1863b.p1865b.AbstractC24282b;
import com.facebook.imagepipeline.p1878c.AbstractC24357f;

/* renamed from: com.facebook.fresco.animation.b.a */
public class C24276a implements AbstractC24270a, C24272c.AbstractC24274a {

    /* renamed from: c */
    private static final Class<?> f57543c = C24276a.class;

    /* renamed from: a */
    public AbstractC24281a f57544a;

    /* renamed from: b */
    public Bitmap.Config f57545b = Bitmap.Config.ARGB_8888;

    /* renamed from: d */
    private final AbstractC24357f f57546d;

    /* renamed from: e */
    private final AbstractC24280b f57547e;

    /* renamed from: f */
    private final AbstractC24275d f57548f;

    /* renamed from: g */
    private final AbstractC24286c f57549g;

    /* renamed from: h */
    private final AbstractC24282b f57550h;

    /* renamed from: i */
    private final Paint f57551i;

    /* renamed from: j */
    private Rect f57552j;

    /* renamed from: k */
    private int f57553k;

    /* renamed from: l */
    private int f57554l;

    @Override // com.facebook.fresco.animation.p1862a.AbstractC24270a
    /* renamed from: b */
    public final int mo40045b() {
        return this.f57553k;
    }

    @Override // com.facebook.fresco.animation.p1862a.AbstractC24270a
    /* renamed from: c */
    public final int mo40047c() {
        return this.f57554l;
    }

    @Override // com.facebook.fresco.animation.p1862a.C24272c.AbstractC24274a
    /* renamed from: f */
    public final void mo40053f() {
        mo40048d();
    }

    @Override // com.facebook.fresco.animation.p1862a.AbstractC24275d
    /* renamed from: a */
    public final int mo9308a() {
        return this.f57548f.mo9308a();
    }

    @Override // com.facebook.fresco.animation.p1862a.AbstractC24270a
    /* renamed from: d */
    public final void mo40048d() {
        this.f57547e.mo40060c();
    }

    @Override // com.facebook.fresco.animation.p1862a.AbstractC24275d
    /* renamed from: e */
    public final int mo40050e() {
        return this.f57548f.mo40050e();
    }

    static {
        Covode.recordClassIndex(28408);
    }

    /* renamed from: g */
    private void m46150g() {
        int width;
        int a = this.f57549g.mo40063a();
        this.f57553k = a;
        int i = -1;
        if (a == -1) {
            Rect rect = this.f57552j;
            if (rect == null) {
                width = -1;
            } else {
                width = rect.width();
            }
            this.f57553k = width;
        }
        int b = this.f57549g.mo40066b();
        this.f57554l = b;
        if (b == -1) {
            Rect rect2 = this.f57552j;
            if (rect2 != null) {
                i = rect2.height();
            }
            this.f57554l = i;
        }
    }

    @Override // com.facebook.fresco.animation.p1862a.AbstractC24270a
    /* renamed from: b */
    public final boolean mo40046b(int i) {
        return this.f57547e.mo40059b(i);
    }

    @Override // com.facebook.fresco.animation.p1862a.AbstractC24275d
    /* renamed from: c */
    public final int mo40049c(int i) {
        return this.f57548f.mo40049c(i);
    }

    @Override // com.facebook.fresco.animation.p1862a.AbstractC24270a
    /* renamed from: a */
    public final void mo40041a(int i) {
        this.f57551i.setAlpha(i);
    }

    @Override // com.facebook.fresco.animation.p1862a.AbstractC24270a
    /* renamed from: a */
    public final void mo40042a(ColorFilter colorFilter) {
        this.f57551i.setColorFilter(colorFilter);
    }

    @Override // com.facebook.fresco.animation.p1862a.AbstractC24270a
    /* renamed from: a */
    public final void mo40043a(Rect rect) {
        this.f57552j = rect;
        this.f57549g.mo40064a(rect);
        m46150g();
    }

    /* renamed from: a */
    private boolean m46147a(int i, C24117a<Bitmap> aVar) {
        if (!C24117a.m45710a((C24117a<?>) aVar)) {
            return false;
        }
        boolean a = this.f57549g.mo40065a(i, aVar.mo39695a());
        if (!a) {
            C24117a.m45712c(aVar);
        }
        return a;
    }

    /* renamed from: a */
    private boolean m46149a(Canvas canvas, int i, int i2) {
        boolean z;
        while (true) {
            int i3 = 3;
            C24117a<Bitmap> aVar = null;
            z = false;
            if (i2 == 0) {
                aVar = this.f57547e.mo40055a(i);
                z = m46148a(i, aVar, canvas, 0);
                i3 = 1;
            } else if (i2 == 1) {
                aVar = this.f57547e.mo40057b();
                if (m46147a(i, aVar) && m46148a(i, aVar, canvas, 1)) {
                    z = true;
                }
                i3 = 2;
            } else if (i2 == 2) {
                try {
                    aVar = this.f57546d.mo40148a(this.f57553k, this.f57554l, this.f57545b);
                    if (m46147a(i, aVar) && m46148a(i, aVar, canvas, 2)) {
                        z = true;
                    }
                } catch (RuntimeException e) {
                    C24099a.m45639a(f57543c, "Failed to create frame bitmap", (Throwable) e);
                    C24117a.m45712c(null);
                    return false;
                }
            } else if (i2 != 3) {
                C24117a.m45712c(null);
                return false;
            } else {
                try {
                    aVar = this.f57547e.mo40054a();
                    z = m46148a(i, aVar, canvas, 3);
                    i3 = -1;
                } catch (Throwable th) {
                    C24117a.m45712c(aVar);
                    throw th;
                }
            }
            C24117a.m45712c(aVar);
            if (z || i3 == -1) {
                return z;
            }
            i2 = i3;
        }
        return z;
    }

    @Override // com.facebook.fresco.animation.p1862a.AbstractC24270a
    /* renamed from: a */
    public final boolean mo40044a(Drawable drawable, Canvas canvas, int i) {
        AbstractC24282b bVar;
        boolean a = m46149a(canvas, i, 0);
        AbstractC24281a aVar = this.f57544a;
        if (!(aVar == null || (bVar = this.f57550h) == null)) {
            aVar.mo34219a(bVar, this.f57547e, this, i);
        }
        return a;
    }

    /* renamed from: a */
    private boolean m46148a(int i, C24117a<Bitmap> aVar, Canvas canvas, int i2) {
        if (!C24117a.m45710a((C24117a<?>) aVar)) {
            return false;
        }
        if (this.f57552j == null) {
            canvas.drawBitmap(aVar.mo39695a(), 0.0f, 0.0f, this.f57551i);
        } else {
            canvas.drawBitmap(aVar.mo39695a(), (Rect) null, this.f57552j, this.f57551i);
        }
        if (i2 == 3) {
            return true;
        }
        this.f57547e.mo40056a(i, aVar);
        return true;
    }

    public C24276a(AbstractC24357f fVar, AbstractC24280b bVar, AbstractC24275d dVar, AbstractC24286c cVar, AbstractC24281a aVar, AbstractC24282b bVar2) {
        this.f57546d = fVar;
        this.f57547e = bVar;
        this.f57548f = dVar;
        this.f57549g = cVar;
        this.f57544a = aVar;
        this.f57550h = bVar2;
        this.f57551i = new Paint(6);
        m46150g();
    }
}
