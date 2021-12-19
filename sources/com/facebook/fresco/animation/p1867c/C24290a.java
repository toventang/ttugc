package com.facebook.fresco.animation.p1867c;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.facebook.common.p1833e.C24099a;
import com.facebook.drawee.p1854e.C24214d;
import com.facebook.fresco.animation.p1862a.AbstractC24270a;
import com.facebook.fresco.animation.p1869d.AbstractC24298b;
import com.facebook.fresco.animation.p1869d.AbstractC24299c;
import com.facebook.fresco.animation.p1869d.C24300d;
import com.facebook.p1860f.p1861a.AbstractC24269a;

/* renamed from: com.facebook.fresco.animation.c.a */
public class C24290a extends Drawable implements Animatable, AbstractC24269a {

    /* renamed from: c */
    public static AbstractC24299c f57583c;

    /* renamed from: j */
    private static final Class<?> f57584j = C24290a.class;

    /* renamed from: k */
    private static final AbstractC24295b f57585k = new C24296c();

    /* renamed from: a */
    public int f57586a;

    /* renamed from: b */
    public boolean f57587b;

    /* renamed from: d */
    public AbstractC24270a f57588d;

    /* renamed from: e */
    public long f57589e;

    /* renamed from: f */
    public long f57590f;

    /* renamed from: g */
    public long f57591g;

    /* renamed from: h */
    public volatile AbstractC24292a f57592h;

    /* renamed from: i */
    public final Runnable f57593i;

    /* renamed from: l */
    private AbstractC24298b f57594l;

    /* renamed from: m */
    private volatile boolean f57595m;

    /* renamed from: n */
    private long f57596n;

    /* renamed from: o */
    private long f57597o;

    /* renamed from: p */
    private int f57598p;

    /* renamed from: q */
    private int f57599q;

    /* renamed from: r */
    private volatile AbstractC24295b f57600r;

    /* renamed from: s */
    private C24214d f57601s;

    /* renamed from: com.facebook.fresco.animation.c.a$a */
    public interface AbstractC24292a {
        static {
            Covode.recordClassIndex(28424);
        }
    }

    public int getOpacity() {
        return -3;
    }

    public boolean isRunning() {
        return this.f57595m;
    }

    public C24290a() {
        this(null, null);
    }

    @Override // com.facebook.p1860f.p1861a.AbstractC24269a
    /* renamed from: a */
    public final void mo40040a() {
        AbstractC24270a aVar = this.f57588d;
        if (aVar != null) {
            aVar.mo40048d();
        }
    }

    /* renamed from: c */
    public final int mo40072c() {
        AbstractC24270a aVar = this.f57588d;
        if (aVar == null) {
            return 0;
        }
        return aVar.mo40050e();
    }

    public int getIntrinsicHeight() {
        AbstractC24270a aVar = this.f57588d;
        if (aVar == null) {
            return super.getIntrinsicHeight();
        }
        return aVar.mo40047c();
    }

    public int getIntrinsicWidth() {
        AbstractC24270a aVar = this.f57588d;
        if (aVar == null) {
            return super.getIntrinsicWidth();
        }
        return aVar.mo40045b();
    }

    static {
        Covode.recordClassIndex(28422);
    }

    public void stop() {
        if (this.f57595m) {
            this.f57595m = false;
            this.f57589e = 0;
            this.f57597o = 0;
            this.f57596n = -1;
            this.f57598p = -1;
            unscheduleSelf(this.f57593i);
            this.f57600r.mo9285b(this);
        }
    }

    /* renamed from: b */
    public final long mo40071b() {
        if (this.f57588d == null) {
            return 0;
        }
        AbstractC24298b bVar = this.f57594l;
        if (bVar != null) {
            return bVar.mo34221a();
        }
        int i = 0;
        for (int i2 = 0; i2 < this.f57588d.mo40050e(); i2++) {
            i += this.f57588d.mo40049c(i2);
        }
        return (long) i;
    }

    public void start() {
        AbstractC24270a aVar;
        if (!this.f57595m && (aVar = this.f57588d) != null && aVar.mo40050e() > 1) {
            this.f57595m = true;
            long uptimeMillis = SystemClock.uptimeMillis();
            this.f57589e = uptimeMillis;
            this.f57597o = uptimeMillis;
            this.f57596n = -1;
            this.f57598p = -1;
            invalidateSelf();
            this.f57600r.mo9283a(this);
        }
    }

    /* renamed from: a */
    public final void mo40070a(AbstractC24295b bVar) {
        if (bVar == null) {
            bVar = f57585k;
        }
        this.f57600r = bVar;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        AbstractC24270a aVar = this.f57588d;
        if (aVar != null) {
            aVar.mo40043a(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        if (this.f57595m) {
            return false;
        }
        long j = (long) i;
        if (this.f57596n == j) {
            return false;
        }
        this.f57596n = j;
        invalidateSelf();
        return true;
    }

    public void setAlpha(int i) {
        if (this.f57601s == null) {
            this.f57601s = new C24214d();
        }
        this.f57601s.f57358a = i;
        AbstractC24270a aVar = this.f57588d;
        if (aVar != null) {
            aVar.mo40041a(i);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f57601s == null) {
            this.f57601s = new C24214d();
        }
        this.f57601s.mo39870a(colorFilter);
        AbstractC24270a aVar = this.f57588d;
        if (aVar != null) {
            aVar.mo40042a(colorFilter);
        }
    }

    /* renamed from: a */
    public final void mo40068a(int i) {
        AbstractC24298b bVar;
        if (this.f57588d != null && (bVar = this.f57594l) != null) {
            this.f57596n = bVar.mo34222a(i);
            long uptimeMillis = SystemClock.uptimeMillis() - this.f57596n;
            this.f57589e = uptimeMillis;
            this.f57597o = uptimeMillis;
            invalidateSelf();
        }
    }

    /* renamed from: a */
    public final void mo40069a(AbstractC24270a aVar) {
        this.f57588d = aVar;
        if (aVar != null) {
            this.f57594l = new C24300d(this.f57588d);
            this.f57588d.mo40043a(getBounds());
            C24214d dVar = this.f57601s;
            if (dVar != null) {
                dVar.mo39871a(this);
            }
        }
        this.f57594l = m46213a(this.f57588d, null);
        stop();
    }

    public void draw(Canvas canvas) {
        long max;
        if (this.f57588d != null && this.f57594l != null) {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (this.f57595m) {
                max = (uptimeMillis - this.f57589e) + this.f57591g;
            } else {
                max = Math.max(this.f57596n, 0L);
            }
            int a = this.f57594l.mo34220a(max, this.f57596n);
            if (a == -1) {
                a = this.f57588d.mo40050e() - 1;
                this.f57600r.mo9285b(this);
                this.f57595m = false;
            } else if (a == 0 && this.f57598p != -1 && uptimeMillis >= this.f57597o) {
                this.f57600r.mo9286c(this);
            }
            if (this.f57588d.mo40044a(this, canvas, a)) {
                this.f57600r.mo9284a(this, a);
                this.f57598p = a;
            } else {
                this.f57599q++;
                if (C24099a.m45645a(2)) {
                    C24099a.m45635a(f57584j, "Dropped a frame. Count: %s", Integer.valueOf(this.f57599q));
                }
            }
            long uptimeMillis2 = SystemClock.uptimeMillis();
            if (this.f57595m) {
                long a2 = this.f57594l.mo34223a(uptimeMillis2 - this.f57589e);
                if (a2 != -1) {
                    long j = this.f57589e + a2 + this.f57590f;
                    this.f57597o = j;
                    scheduleSelf(this.f57593i, j);
                }
            }
            AbstractC24292a aVar = this.f57592h;
            this.f57596n = max;
        }
    }

    public C24290a(AbstractC24270a aVar, Object obj) {
        this.f57586a = -1000;
        this.f57590f = 8;
        this.f57600r = f57585k;
        this.f57593i = new Runnable() {
            /* class com.facebook.fresco.animation.p1867c.C24290a.RunnableC242911 */

            static {
                Covode.recordClassIndex(28423);
            }

            public final void run() {
                C24290a aVar = C24290a.this;
                aVar.unscheduleSelf(aVar.f57593i);
                C24290a.this.invalidateSelf();
            }
        };
        this.f57588d = aVar;
        this.f57594l = m46213a(aVar, obj);
    }

    /* renamed from: a */
    private static AbstractC24298b m46213a(AbstractC24270a aVar, Object obj) {
        AbstractC24298b a;
        if (aVar == null) {
            return null;
        }
        AbstractC24299c cVar = f57583c;
        if (cVar == null || (a = cVar.mo34257a(aVar, obj)) == null) {
            return new C24300d(aVar);
        }
        return a;
    }
}
