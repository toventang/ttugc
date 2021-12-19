package com.bytedance.lottie;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.p1498b.C20972a;
import com.bytedance.lottie.p1498b.C20973b;
import com.bytedance.lottie.p1499c.C21033e;
import com.bytedance.lottie.p1499c.p1502c.C21020b;
import com.bytedance.lottie.p1504e.C21068q;
import com.bytedance.lottie.p1505f.Choreographer$FrameCallbackC21082d;
import com.bytedance.lottie.p1506g.C21091c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.bytedance.lottie.i */
public class C21106i extends Drawable implements Animatable, Drawable.Callback {

    /* renamed from: p */
    private static final String f50031p = C21106i.class.getSimpleName();

    /* renamed from: a */
    public C21088g f50032a;

    /* renamed from: b */
    public final Choreographer$FrameCallbackC21082d f50033b;

    /* renamed from: c */
    public float f50034c;

    /* renamed from: d */
    final ArrayList<AbstractC21117a> f50035d;

    /* renamed from: e */
    C20973b f50036e;

    /* renamed from: f */
    public String f50037f;

    /* renamed from: g */
    AbstractC20975c f50038g;

    /* renamed from: h */
    public C20972a f50039h;

    /* renamed from: i */
    public C20971b f50040i;

    /* renamed from: j */
    public C21132t f50041j;

    /* renamed from: k */
    public boolean f50042k;

    /* renamed from: l */
    public C21020b f50043l;

    /* renamed from: m */
    boolean f50044m;

    /* renamed from: n */
    public boolean f50045n;

    /* renamed from: o */
    boolean f50046o;

    /* renamed from: q */
    private final Matrix f50047q = new Matrix();

    /* renamed from: r */
    private final Set<Object> f50048r;

    /* renamed from: s */
    private int f50049s;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.lottie.i$a */
    public interface AbstractC21117a {
        static {
            Covode.recordClassIndex(24733);
        }

        /* renamed from: a */
        void mo34614a();
    }

    public int getOpacity() {
        return -3;
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public int getAlpha() {
        return this.f50049s;
    }

    public void start() {
        mo34591d();
    }

    /* renamed from: a */
    public final void mo34580a() {
        C20973b bVar = this.f50036e;
        if (bVar != null) {
            bVar.mo34478a();
        }
    }

    public boolean isRunning() {
        return this.f50033b.isRunning();
    }

    static {
        Covode.recordClassIndex(24722);
    }

    /* renamed from: h */
    public final void mo34602h() {
        this.f50035d.clear();
        this.f50033b.cancel();
    }

    /* renamed from: i */
    public final void mo34603i() {
        this.f50035d.clear();
        this.f50033b.mo34546g();
    }

    public void invalidateSelf() {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo34585b() {
        this.f50043l = new C21020b(this, C21068q.m39666a(this.f50032a), this.f50032a.f49975g, this.f50032a);
    }

    /* renamed from: d */
    public final void mo34591d() {
        if (this.f50043l == null) {
            this.f50035d.add(new AbstractC21117a() {
                /* class com.bytedance.lottie.C21106i.C211125 */

                static {
                    Covode.recordClassIndex(24728);
                }

                @Override // com.bytedance.lottie.C21106i.AbstractC21117a
                /* renamed from: a */
                public final void mo34614a() {
                    C21106i.this.mo34591d();
                }
            });
        } else {
            this.f50033b.mo34545f();
        }
    }

    /* renamed from: e */
    public final void mo34595e() {
        if (this.f50043l == null) {
            this.f50035d.add(new AbstractC21117a() {
                /* class com.bytedance.lottie.C21106i.C211136 */

                static {
                    Covode.recordClassIndex(24729);
                }

                @Override // com.bytedance.lottie.C21106i.AbstractC21117a
                /* renamed from: a */
                public final void mo34614a() {
                    C21106i.this.mo34595e();
                }
            });
        } else {
            this.f50033b.mo34550h();
        }
    }

    /* renamed from: f */
    public final boolean mo34596f() {
        if (this.f50041j != null || this.f50032a.f49973e.mo2184b() <= 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo34597g() {
        C21088g gVar = this.f50032a;
        if (gVar != null) {
            float f = this.f50034c;
            setBounds(0, 0, (int) (((float) gVar.f49976h.width()) * f), (int) (((float) this.f50032a.f49976h.height()) * f));
        }
    }

    public int getIntrinsicHeight() {
        C21088g gVar = this.f50032a;
        if (gVar == null) {
            return -1;
        }
        return (int) (((float) gVar.f49976h.height()) * this.f50034c);
    }

    public int getIntrinsicWidth() {
        C21088g gVar = this.f50032a;
        if (gVar == null) {
            return -1;
        }
        return (int) (((float) gVar.f49976h.width()) * this.f50034c);
    }

    public void stop() {
        this.f50035d.clear();
        Choreographer$FrameCallbackC21082d dVar = this.f50033b;
        dVar.mo34540c(true);
        dVar.mo34526b(dVar.mo34551i());
    }

    public C21106i() {
        Choreographer$FrameCallbackC21082d dVar = new Choreographer$FrameCallbackC21082d();
        this.f50033b = dVar;
        this.f50034c = 1.0f;
        this.f50048r = new HashSet();
        this.f50035d = new ArrayList<>();
        this.f50049s = 255;
        this.f50045n = true;
        this.f50046o = false;
        dVar.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.bytedance.lottie.C21106i.C211071 */

            static {
                Covode.recordClassIndex(24723);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (C21106i.this.f50043l != null) {
                    C21106i.this.f50043l.mo34495a(C21106i.this.f50033b.mo34542d());
                }
            }
        });
    }

    /* renamed from: c */
    public final void mo34588c() {
        if (this.f50045n) {
            mo34580a();
        }
        if (this.f50033b.isRunning()) {
            this.f50033b.cancel();
        }
        this.f50032a = null;
        this.f50043l = null;
        this.f50036e = null;
        this.f50033b.mo34544e();
        invalidateSelf();
    }

    public void setAlpha(int i) {
        this.f50049s = i;
    }

    /* renamed from: d */
    public final void mo34592d(float f) {
        this.f50034c = f;
        mo34597g();
    }

    /* renamed from: d */
    public final void mo34593d(int i) {
        this.f50033b.setRepeatCount(i);
    }

    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    /* renamed from: a */
    public final void mo34581a(final float f) {
        C21088g gVar = this.f50032a;
        if (gVar == null) {
            this.f50035d.add(new AbstractC21117a() {
                /* class com.bytedance.lottie.C21106i.C211158 */

                static {
                    Covode.recordClassIndex(24731);
                }

                @Override // com.bytedance.lottie.C21106i.AbstractC21117a
                /* renamed from: a */
                public final void mo34614a() {
                    C21106i.this.mo34581a(f);
                }
            });
            return;
        }
        float f2 = gVar.f49977i;
        mo34582a((int) (f2 + (f * (this.f50032a.f49978j - f2))));
    }

    /* renamed from: c */
    public final void mo34589c(final float f) {
        C21088g gVar = this.f50032a;
        if (gVar == null) {
            this.f50035d.add(new AbstractC21117a() {
                /* class com.bytedance.lottie.C21106i.C211103 */

                static {
                    Covode.recordClassIndex(24726);
                }

                @Override // com.bytedance.lottie.C21106i.AbstractC21117a
                /* renamed from: a */
                public final void mo34614a() {
                    C21106i.this.mo34589c(f);
                }
            });
            return;
        }
        float f2 = gVar.f49977i;
        mo34590c((int) (f2 + (f * (this.f50032a.f49978j - f2))));
    }

    /* renamed from: a */
    public final void mo34582a(final int i) {
        if (this.f50032a == null) {
            this.f50035d.add(new AbstractC21117a() {
                /* class com.bytedance.lottie.C21106i.C211147 */

                static {
                    Covode.recordClassIndex(24730);
                }

                @Override // com.bytedance.lottie.C21106i.AbstractC21117a
                /* renamed from: a */
                public final void mo34614a() {
                    C21106i.this.mo34582a(i);
                }
            });
        } else {
            this.f50033b.mo34538b(i);
        }
    }

    /* renamed from: b */
    public final void mo34586b(final float f) {
        C21088g gVar = this.f50032a;
        if (gVar == null) {
            this.f50035d.add(new AbstractC21117a() {
                /* class com.bytedance.lottie.C21106i.C2110810 */

                static {
                    Covode.recordClassIndex(24724);
                }

                @Override // com.bytedance.lottie.C21106i.AbstractC21117a
                /* renamed from: a */
                public final void mo34614a() {
                    C21106i.this.mo34586b(f);
                }
            });
            return;
        }
        float f2 = gVar.f49977i;
        mo34587b((int) (f2 + (f * (this.f50032a.f49978j - f2))));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
        if (r1 == null) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        if (r2.f49702a != null) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0028, code lost:
        if (r2.f49702a.equals(r1) == false) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005e, code lost:
        if (r6.f50046o != false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0060, code lost:
        r6.f50036e.mo34478a();
        r6.f50036e = null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap mo34579a(java.lang.String r7) {
        /*
        // Method dump skipped, instructions count: 106
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lottie.C21106i.mo34579a(java.lang.String):android.graphics.Bitmap");
    }

    /* renamed from: b */
    public final void mo34587b(final int i) {
        if (this.f50032a == null) {
            this.f50035d.add(new AbstractC21117a() {
                /* class com.bytedance.lottie.C21106i.C211169 */

                static {
                    Covode.recordClassIndex(24732);
                }

                @Override // com.bytedance.lottie.C21106i.AbstractC21117a
                /* renamed from: a */
                public final void mo34614a() {
                    C21106i.this.mo34587b(i);
                }
            });
        } else {
            this.f50033b.mo34539c(i);
        }
    }

    /* renamed from: c */
    public final void mo34590c(final int i) {
        if (this.f50032a == null) {
            this.f50035d.add(new AbstractC21117a() {
                /* class com.bytedance.lottie.C21106i.C211092 */

                static {
                    Covode.recordClassIndex(24725);
                }

                @Override // com.bytedance.lottie.C21106i.AbstractC21117a
                /* renamed from: a */
                public final void mo34614a() {
                    C21106i.this.mo34590c(i);
                }
            });
        } else {
            this.f50033b.mo34536a(i);
        }
    }

    public void draw(Canvas canvas) {
        float f;
        C21044e.m39621b("Drawable#draw");
        if (this.f50043l != null) {
            float f2 = this.f50034c;
            float min = Math.min(((float) canvas.getWidth()) / ((float) this.f50032a.f49976h.width()), ((float) canvas.getHeight()) / ((float) this.f50032a.f49976h.height()));
            if (f2 > min) {
                f = this.f50034c / min;
                if (f > 1.0f) {
                    canvas.save();
                    float width = ((float) this.f50032a.f49976h.width()) / 2.0f;
                    float height = ((float) this.f50032a.f49976h.height()) / 2.0f;
                    float f3 = width * min;
                    float f4 = height * min;
                    float f5 = this.f50034c;
                    canvas.translate((width * f5) - f3, (f5 * height) - f4);
                    canvas.scale(f, f, f3, f4);
                }
            } else {
                min = f2;
                f = 1.0f;
            }
            this.f50047q.reset();
            this.f50047q.preScale(min, min);
            this.f50043l.mo34452a(canvas, this.f50047q, this.f50049s);
            C21044e.m39622c("Drawable#draw");
            if (f > 1.0f) {
                canvas.restore();
            }
        }
    }

    /* renamed from: a */
    public final void mo34584a(boolean z) {
        if (this.f50042k != z) {
            int i = Build.VERSION.SDK_INT;
            this.f50042k = z;
            if (this.f50032a != null) {
                mo34585b();
            }
        }
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    /* renamed from: a */
    public final <T> void mo34583a(final C21033e eVar, final T t, final C21091c<T> cVar) {
        List<C21033e> arrayList;
        if (this.f50043l == null) {
            this.f50035d.add(new AbstractC21117a() {
                /* class com.bytedance.lottie.C21106i.C211114 */

                static {
                    Covode.recordClassIndex(24727);
                }

                @Override // com.bytedance.lottie.C21106i.AbstractC21117a
                /* renamed from: a */
                public final void mo34614a() {
                    C21106i.this.mo34583a(eVar, t, cVar);
                }
            });
            return;
        }
        if (eVar.f49914a != null) {
            eVar.f49914a.mo34455a(t, cVar);
        } else {
            if (this.f50043l == null) {
                arrayList = Collections.emptyList();
            } else {
                arrayList = new ArrayList<>();
                this.f50043l.mo34454a(eVar, 0, arrayList, new C21033e(new String[0]));
            }
            for (int i = 0; i < arrayList.size(); i++) {
                arrayList.get(i).f49914a.mo34455a(t, cVar);
            }
            if (arrayList.isEmpty()) {
                return;
            }
        }
        invalidateSelf();
        if (t == AbstractC21121m.f50098w) {
            mo34589c(this.f50033b.mo34542d());
        }
    }
}
