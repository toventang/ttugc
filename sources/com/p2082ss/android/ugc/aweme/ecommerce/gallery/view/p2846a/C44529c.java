package com.p2082ss.android.ugc.aweme.ecommerce.gallery.view.p2846a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.drawee.p1855f.C24246a;
import com.facebook.drawee.p1855f.C24247b;
import com.facebook.drawee.p1857h.AbstractC24255a;
import com.facebook.drawee.view.C24261b;
import com.p2082ss.android.ugc.aweme.lancet.C58030k;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.gallery.view.a.c */
public final class C44529c extends C44517b {

    /* renamed from: H */
    public int f103896H;

    /* renamed from: I */
    public int f103897I;

    /* renamed from: J */
    public int f103898J;

    /* renamed from: K */
    public int f103899K;

    /* renamed from: L */
    public int f103900L;

    /* renamed from: M */
    public int f103901M;

    /* renamed from: N */
    public int f103902N;

    /* renamed from: O */
    public C44537c f103903O;

    /* renamed from: P */
    public AbstractC44536b f103904P;

    /* renamed from: Q */
    private C24261b<C24246a> f103905Q;

    /* renamed from: R */
    private long f103906R;

    /* renamed from: S */
    private boolean f103907S;

    /* renamed from: T */
    private Paint f103908T;

    /* renamed from: U */
    private Matrix f103909U;

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.gallery.view.a.c$b */
    public interface AbstractC44536b {
        static {
            Covode.recordClassIndex(52886);
        }

        /* renamed from: a */
        void mo75541a();

        /* renamed from: a */
        void mo75542a(int i, float f);

        /* renamed from: a */
        void mo75543a(int i, int i2, int i3);
    }

    static {
        Covode.recordClassIndex(52879);
    }

    public final long getDuration() {
        return this.f103906R;
    }

    public final int getState() {
        return this.f103896H;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.gallery.view.a.c$a */
    class C44535a implements Cloneable {

        /* renamed from: a */
        float f103915a;

        /* renamed from: b */
        float f103916b;

        /* renamed from: c */
        float f103917c;

        /* renamed from: d */
        float f103918d;

        static {
            Covode.recordClassIndex(52885);
        }

        @Override // java.lang.Object
        public final Object clone() {
            return super.clone();
        }

        public final String toString() {
            return "[left:" + this.f103915a + " top:" + this.f103916b + " width:" + this.f103917c + " height:" + this.f103918d + "]";
        }

        private C44535a() {
        }

        /* synthetic */ C44535a(C44529c cVar, byte b) {
            this();
        }
    }

    public final AbstractC24255a getController() {
        return this.f103905Q.f57519b;
    }

    /* renamed from: d */
    public final void mo75599d() {
        this.f103897I = 100;
        this.f103896H = 1;
        this.f103907S = true;
        invalidate();
    }

    /* renamed from: e */
    public final void mo75600e() {
        this.f103897I = 100;
        this.f103896H = 2;
        this.f103907S = true;
        invalidate();
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f103905Q.mo40003b();
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f103905Q.mo40005c();
        C58030k.m104850a(this);
    }

    public final void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        this.f103905Q.mo40003b();
    }

    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        this.f103905Q.mo40005c();
    }

    public final void setDuration(long j) {
        this.f103906R = j;
    }

    public final void setOnTransferListener(AbstractC44536b bVar) {
        this.f103904P = bVar;
    }

    public final void setState(int i) {
        this.f103896H = i;
    }

    public C44529c(Context context) {
        this(context, (byte) 0);
    }

    public final void setController(AbstractC24255a aVar) {
        this.f103905Q.mo40001a(aVar);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f103905Q.mo40002a(motionEvent) || super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final boolean verifyDrawable(Drawable drawable) {
        super.verifyDrawable(drawable);
        if (drawable == this.f103905Q.mo40006d().f57471b) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        PropertyValuesHolder propertyValuesHolder;
        PropertyValuesHolder propertyValuesHolder2;
        PropertyValuesHolder propertyValuesHolder3;
        PropertyValuesHolder propertyValuesHolder4;
        PropertyValuesHolder propertyValuesHolder5;
        C44537c cVar;
        boolean z;
        if (getDrawable() != null) {
            int i = this.f103896H;
            if (i != 0) {
                if (this.f103907S) {
                    if (i == 2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    Drawable drawable = getDrawable();
                    if (!(drawable == null || getWidth() == 0 || getHeight() == 0)) {
                        this.f103903O = new C44537c(z);
                        float intrinsicWidth = ((float) this.f103899K) / ((float) drawable.getIntrinsicWidth());
                        float intrinsicHeight = ((float) this.f103900L) / ((float) drawable.getIntrinsicHeight());
                        if (intrinsicWidth <= intrinsicHeight) {
                            intrinsicWidth = intrinsicHeight;
                        }
                        this.f103903O.f103920a = intrinsicWidth;
                        float width = ((float) getWidth()) / ((float) drawable.getIntrinsicWidth());
                        float height = ((float) getHeight()) / ((float) drawable.getIntrinsicHeight());
                        if (width >= height) {
                            width = height;
                        }
                        if (this.f103897I == 200 && this.f103898J == 201) {
                            this.f103903O.f103921b = intrinsicWidth;
                        } else {
                            this.f103903O.f103921b = width;
                        }
                        this.f103903O.f103924e = new C44535a(this, (byte) 0);
                        this.f103903O.f103924e.f103915a = (float) this.f103901M;
                        this.f103903O.f103924e.f103916b = (float) this.f103902N;
                        this.f103903O.f103924e.f103917c = (float) this.f103899K;
                        this.f103903O.f103924e.f103918d = (float) this.f103900L;
                        this.f103903O.f103925f = new C44535a(this, (byte) 0);
                        float intrinsicWidth2 = ((float) drawable.getIntrinsicWidth()) * this.f103903O.f103921b;
                        float intrinsicHeight2 = ((float) drawable.getIntrinsicHeight()) * this.f103903O.f103921b;
                        this.f103903O.f103925f.f103915a = (((float) getWidth()) - intrinsicWidth2) / 2.0f;
                        this.f103903O.f103925f.f103916b = (((float) getHeight()) - intrinsicHeight2) / 2.0f;
                        this.f103903O.f103925f.f103917c = intrinsicWidth2;
                        this.f103903O.f103925f.f103918d = intrinsicHeight2;
                        this.f103903O.f103926g = new C44535a(this, (byte) 0);
                    }
                }
                C44537c cVar2 = this.f103903O;
                if (cVar2 == null) {
                    super.onDraw(canvas);
                    return;
                }
                if (this.f103907S) {
                    int i2 = this.f103896H;
                    if (i2 == 1) {
                        cVar2.f103922c = cVar2.f103920a;
                        try {
                            cVar2.f103926g = (C44535a) cVar2.f103924e.clone();
                        } catch (CloneNotSupportedException e) {
                            e.printStackTrace();
                        }
                    } else if (i2 == 2) {
                        cVar2.f103922c = cVar2.f103921b;
                        try {
                            cVar2.f103926g = (C44535a) cVar2.f103925f.clone();
                        } catch (CloneNotSupportedException e2) {
                            e2.printStackTrace();
                        }
                    } else if (i2 == 3) {
                        cVar2.f103922c = cVar2.f103920a;
                        try {
                            cVar2.f103926g = (C44535a) cVar2.f103925f.clone();
                        } catch (CloneNotSupportedException e3) {
                            e3.printStackTrace();
                        }
                    }
                }
                canvas.drawPaint(this.f103908T);
                int saveCount = canvas.getSaveCount();
                canvas.save();
                Drawable drawable2 = getDrawable();
                if (!(drawable2 == null || (cVar = this.f103903O) == null)) {
                    this.f103909U.setScale(cVar.f103922c, this.f103903O.f103922c);
                    this.f103909U.postTranslate(-(((this.f103903O.f103922c * ((float) drawable2.getIntrinsicWidth())) / 2.0f) - (this.f103903O.f103926g.f103917c / 2.0f)), -(((this.f103903O.f103922c * ((float) drawable2.getIntrinsicHeight())) / 2.0f) - (this.f103903O.f103926g.f103918d / 2.0f)));
                }
                canvas.translate(this.f103903O.f103926g.f103915a, this.f103903O.f103926g.f103916b);
                canvas.clipRect(0.0f, 0.0f, this.f103903O.f103926g.f103917c, this.f103903O.f103926g.f103918d);
                canvas.concat(this.f103909U);
                getDrawable().draw(canvas);
                canvas.restoreToCount(saveCount);
                if (this.f103907S && this.f103896H != 3) {
                    this.f103907S = false;
                    int i3 = this.f103897I;
                    if (i3 != 100) {
                        if (i3 == 200 && this.f103903O != null) {
                            ValueAnimator valueAnimator = new ValueAnimator();
                            valueAnimator.setDuration(this.f103906R);
                            valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
                            if (this.f103898J == 201) {
                                valueAnimator.setValues(PropertyValuesHolder.ofFloat("left", this.f103903O.f103924e.f103915a, this.f103903O.f103925f.f103915a), PropertyValuesHolder.ofFloat("top", this.f103903O.f103924e.f103916b, this.f103903O.f103925f.f103916b), PropertyValuesHolder.ofFloat("width", this.f103903O.f103924e.f103917c, this.f103903O.f103925f.f103917c), PropertyValuesHolder.ofFloat("height", this.f103903O.f103924e.f103918d, this.f103903O.f103925f.f103918d));
                                valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                                    /* class com.p2082ss.android.ugc.aweme.ecommerce.gallery.view.p2846a.C44529c.C445301 */

                                    static {
                                        Covode.recordClassIndex(52880);
                                    }

                                    public final synchronized void onAnimationUpdate(ValueAnimator valueAnimator) {
                                        MethodCollector.m26663i(8744);
                                        if (C44529c.this.f103904P != null) {
                                            C44529c.this.f103904P.mo75542a(C44529c.this.f103896H, valueAnimator.getAnimatedFraction());
                                        }
                                        C44529c.this.f103903O.f103926g.f103915a = ((Float) valueAnimator.getAnimatedValue("left")).floatValue();
                                        C44529c.this.f103903O.f103926g.f103916b = ((Float) valueAnimator.getAnimatedValue("top")).floatValue();
                                        C44529c.this.f103903O.f103926g.f103917c = ((Float) valueAnimator.getAnimatedValue("width")).floatValue();
                                        C44529c.this.f103903O.f103926g.f103918d = ((Float) valueAnimator.getAnimatedValue("height")).floatValue();
                                        C44529c.this.invalidate();
                                        MethodCollector.m26664o(8744);
                                    }
                                });
                            } else {
                                valueAnimator.setValues(PropertyValuesHolder.ofFloat("scale", this.f103903O.f103920a, this.f103903O.f103921b), PropertyValuesHolder.ofFloat("left", this.f103903O.f103924e.f103915a, this.f103903O.f103925f.f103915a), PropertyValuesHolder.ofFloat("top", this.f103903O.f103924e.f103916b, this.f103903O.f103925f.f103916b), PropertyValuesHolder.ofFloat("width", this.f103903O.f103924e.f103917c, this.f103903O.f103925f.f103917c), PropertyValuesHolder.ofFloat("height", this.f103903O.f103924e.f103918d, this.f103903O.f103925f.f103918d));
                                valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                                    /* class com.p2082ss.android.ugc.aweme.ecommerce.gallery.view.p2846a.C44529c.C445312 */

                                    static {
                                        Covode.recordClassIndex(52881);
                                    }

                                    public final synchronized void onAnimationUpdate(ValueAnimator valueAnimator) {
                                        MethodCollector.m26663i(8594);
                                        C44529c.this.f103903O.f103926g.f103915a = ((Float) valueAnimator.getAnimatedValue("left")).floatValue();
                                        C44529c.this.f103903O.f103926g.f103916b = ((Float) valueAnimator.getAnimatedValue("top")).floatValue();
                                        C44529c.this.f103903O.f103926g.f103917c = ((Float) valueAnimator.getAnimatedValue("width")).floatValue();
                                        C44529c.this.f103903O.f103926g.f103918d = ((Float) valueAnimator.getAnimatedValue("height")).floatValue();
                                        C44529c.this.f103903O.f103922c = ((Float) valueAnimator.getAnimatedValue("scale")).floatValue();
                                        C44529c.this.invalidate();
                                        MethodCollector.m26664o(8594);
                                    }
                                });
                            }
                            valueAnimator.addListener(new AnimatorListenerAdapter() {
                                /* class com.p2082ss.android.ugc.aweme.ecommerce.gallery.view.p2846a.C44529c.C445323 */

                                static {
                                    Covode.recordClassIndex(52882);
                                }

                                public final void onAnimationStart(Animator animator) {
                                    if (C44529c.this.f103904P != null) {
                                        C44529c.this.f103904P.mo75541a();
                                    }
                                }

                                public final void onAnimationEnd(Animator animator) {
                                    if (C44529c.this.f103898J == 201) {
                                        C44529c cVar = C44529c.this;
                                        cVar.f103901M = (int) cVar.f103903O.f103925f.f103915a;
                                        C44529c cVar2 = C44529c.this;
                                        cVar2.f103902N = (int) cVar2.f103903O.f103925f.f103916b;
                                        C44529c cVar3 = C44529c.this;
                                        cVar3.f103899K = (int) cVar3.f103903O.f103925f.f103917c;
                                        C44529c cVar4 = C44529c.this;
                                        cVar4.f103900L = (int) cVar4.f103903O.f103925f.f103918d;
                                    }
                                    if (C44529c.this.f103896H == 1 && C44529c.this.f103898J == 202) {
                                        C44529c.this.f103896H = 0;
                                    }
                                    if (C44529c.this.f103904P != null) {
                                        C44529c.this.f103904P.mo75543a(C44529c.this.f103896H, C44529c.this.f103897I, C44529c.this.f103898J);
                                    }
                                }
                            });
                            if (this.f103896H == 1) {
                                valueAnimator.start();
                            } else {
                                valueAnimator.reverse();
                            }
                        }
                    } else if (this.f103903O != null) {
                        ValueAnimator valueAnimator2 = new ValueAnimator();
                        valueAnimator2.setDuration(this.f103906R);
                        valueAnimator2.setInterpolator(new AccelerateDecelerateInterpolator());
                        if (this.f103903O.f103924e.f103917c == 0.0f || this.f103903O.f103924e.f103918d == 0.0f) {
                            propertyValuesHolder = PropertyValuesHolder.ofFloat("scale", this.f103903O.f103921b, this.f103903O.f103921b);
                            propertyValuesHolder2 = PropertyValuesHolder.ofFloat("left", this.f103903O.f103925f.f103915a, this.f103903O.f103925f.f103915a);
                            propertyValuesHolder3 = PropertyValuesHolder.ofFloat("top", this.f103903O.f103925f.f103916b, this.f103903O.f103925f.f103916b);
                            propertyValuesHolder4 = PropertyValuesHolder.ofFloat("width", this.f103903O.f103925f.f103917c, this.f103903O.f103925f.f103917c);
                            propertyValuesHolder5 = PropertyValuesHolder.ofFloat("height", this.f103903O.f103925f.f103918d, this.f103903O.f103925f.f103918d);
                        } else if (this.f103903O.f103925f.f103917c == 0.0f || this.f103903O.f103925f.f103918d == 0.0f) {
                            propertyValuesHolder = PropertyValuesHolder.ofFloat("scale", this.f103903O.f103920a, this.f103903O.f103920a);
                            propertyValuesHolder2 = PropertyValuesHolder.ofFloat("left", this.f103903O.f103924e.f103915a, this.f103903O.f103924e.f103915a);
                            propertyValuesHolder3 = PropertyValuesHolder.ofFloat("top", this.f103903O.f103924e.f103916b, this.f103903O.f103924e.f103916b);
                            propertyValuesHolder4 = PropertyValuesHolder.ofFloat("width", this.f103903O.f103924e.f103917c, this.f103903O.f103924e.f103917c);
                            propertyValuesHolder5 = PropertyValuesHolder.ofFloat("height", this.f103903O.f103924e.f103918d, this.f103903O.f103924e.f103918d);
                        } else {
                            propertyValuesHolder = PropertyValuesHolder.ofFloat("scale", this.f103903O.f103920a, this.f103903O.f103921b);
                            propertyValuesHolder2 = PropertyValuesHolder.ofFloat("left", this.f103903O.f103924e.f103915a, this.f103903O.f103925f.f103915a);
                            propertyValuesHolder3 = PropertyValuesHolder.ofFloat("top", this.f103903O.f103924e.f103916b, this.f103903O.f103925f.f103916b);
                            propertyValuesHolder4 = PropertyValuesHolder.ofFloat("width", this.f103903O.f103924e.f103917c, this.f103903O.f103925f.f103917c);
                            propertyValuesHolder5 = PropertyValuesHolder.ofFloat("height", this.f103903O.f103924e.f103918d, this.f103903O.f103925f.f103918d);
                        }
                        valueAnimator2.setValues(propertyValuesHolder, propertyValuesHolder2, propertyValuesHolder3, propertyValuesHolder4, propertyValuesHolder5);
                        valueAnimator2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            /* class com.p2082ss.android.ugc.aweme.ecommerce.gallery.view.p2846a.C44529c.C445334 */

                            static {
                                Covode.recordClassIndex(52883);
                            }

                            public final synchronized void onAnimationUpdate(ValueAnimator valueAnimator) {
                                MethodCollector.m26663i(8437);
                                if (C44529c.this.f103904P != null) {
                                    C44529c.this.f103904P.mo75542a(C44529c.this.f103896H, valueAnimator.getAnimatedFraction());
                                }
                                C44529c.this.f103903O.f103922c = ((Float) valueAnimator.getAnimatedValue("scale")).floatValue();
                                C44529c.this.f103903O.f103926g.f103915a = ((Float) valueAnimator.getAnimatedValue("left")).floatValue();
                                C44529c.this.f103903O.f103926g.f103916b = ((Float) valueAnimator.getAnimatedValue("top")).floatValue();
                                C44529c.this.f103903O.f103926g.f103917c = ((Float) valueAnimator.getAnimatedValue("width")).floatValue();
                                C44529c.this.f103903O.f103926g.f103918d = ((Float) valueAnimator.getAnimatedValue("height")).floatValue();
                                C44529c.this.invalidate();
                                MethodCollector.m26664o(8437);
                            }
                        });
                        valueAnimator2.addListener(new AnimatorListenerAdapter() {
                            /* class com.p2082ss.android.ugc.aweme.ecommerce.gallery.view.p2846a.C44529c.C445345 */

                            static {
                                Covode.recordClassIndex(52884);
                            }

                            public final void onAnimationStart(Animator animator) {
                                if (C44529c.this.f103904P != null) {
                                    C44529c.this.f103904P.mo75541a();
                                }
                            }

                            public final void onAnimationEnd(Animator animator) {
                                if (C44529c.this.f103904P != null) {
                                    C44529c.this.f103904P.mo75543a(C44529c.this.f103896H, C44529c.this.f103897I, C44529c.this.f103898J);
                                }
                                if (C44529c.this.f103896H == 1) {
                                    C44529c.this.f103896H = 0;
                                }
                            }
                        });
                        if (this.f103896H == 1) {
                            valueAnimator2.start();
                        } else {
                            valueAnimator2.reverse();
                        }
                    }
                }
            } else {
                canvas.drawPaint(this.f103908T);
                try {
                    super.onDraw(canvas);
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.gallery.view.a.c$c */
    class C44537c {

        /* renamed from: a */
        float f103920a;

        /* renamed from: b */
        float f103921b;

        /* renamed from: c */
        float f103922c;

        /* renamed from: d */
        int f103923d;

        /* renamed from: e */
        C44535a f103924e;

        /* renamed from: f */
        C44535a f103925f;

        /* renamed from: g */
        C44535a f103926g;

        static {
            Covode.recordClassIndex(52887);
        }

        C44537c(boolean z) {
            int i;
            if (z) {
                i = 255;
            } else {
                i = 0;
            }
            this.f103923d = i;
        }
    }

    private C44529c(Context context, byte b) {
        this(context, (char) 0);
    }

    private C44529c(Context context, char c) {
        super(context, null);
        this.f103897I = 100;
        this.f103898J = 201;
        this.f103906R = 300;
        this.f103909U = new Matrix();
        Paint paint = new Paint();
        this.f103908T = paint;
        paint.setAlpha(0);
        if (this.f103905Q == null) {
            C24246a a = new C24247b(getResources()).mo39973a();
            getContext();
            this.f103905Q = C24261b.m46095a(a);
        }
    }

    /* renamed from: a */
    public final void mo75598a(int i, int i2, int i3, int i4) {
        this.f103901M = i;
        this.f103902N = i2;
        this.f103899K = i3;
        this.f103900L = i4;
    }
}
