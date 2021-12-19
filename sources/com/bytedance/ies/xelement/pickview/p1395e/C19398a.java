package com.bytedance.ies.xelement.pickview.p1395e;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.xelement.p1366c.AbstractC19054a;
import com.bytedance.ies.xelement.pickview.p1391a.AbstractC19383b;
import com.bytedance.ies.xelement.pickview.p1391a.AbstractC19384c;
import com.bytedance.ies.xelement.pickview.p1393c.AbstractC19394b;
import com.bytedance.ies.xelement.pickview.p1393c.C19393a;
import com.bytedance.ies.xelement.pickview.p1394d.C19397c;
import com.bytedance.ies.xelement.pickview.p1394d.HandlerC19396b;
import com.lynx.tasm.base.LLog;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import com.p2082ss.android.ugc.trill.R;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.ies.xelement.pickview.e.a */
public final class C19398a extends View {

    /* renamed from: g */
    private static final String[] f45914g = {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09"};

    /* renamed from: A */
    private int f45915A;

    /* renamed from: B */
    private int f45916B;

    /* renamed from: C */
    private int f45917C;

    /* renamed from: D */
    private float f45918D;

    /* renamed from: E */
    private float f45919E;

    /* renamed from: F */
    private float f45920F;

    /* renamed from: G */
    private float f45921G;

    /* renamed from: H */
    private float f45922H;

    /* renamed from: I */
    private int f45923I;

    /* renamed from: J */
    private int f45924J;

    /* renamed from: K */
    private int f45925K;

    /* renamed from: L */
    private int f45926L;

    /* renamed from: M */
    private int f45927M;

    /* renamed from: N */
    private int f45928N;

    /* renamed from: O */
    private int f45929O;

    /* renamed from: P */
    private int f45930P;

    /* renamed from: Q */
    private float f45931Q;

    /* renamed from: R */
    private long f45932R;

    /* renamed from: S */
    private int f45933S;

    /* renamed from: T */
    private int f45934T;

    /* renamed from: U */
    private int f45935U;

    /* renamed from: V */
    private int f45936V;

    /* renamed from: W */
    private int f45937W;

    /* renamed from: a */
    public AbstractC19394b f45938a;

    /* renamed from: aa */
    private float f45939aa;

    /* renamed from: ab */
    private boolean f45940ab;

    /* renamed from: ac */
    private AbstractC19054a f45941ac;

    /* renamed from: b */
    public boolean f45942b;

    /* renamed from: c */
    public ScheduledExecutorService f45943c;

    /* renamed from: d */
    public ScheduledFuture<?> f45944d;

    /* renamed from: e */
    public boolean f45945e;

    /* renamed from: f */
    public Handler f45946f;

    /* renamed from: h */
    private EnumC19401b f45947h;

    /* renamed from: i */
    private Context f45948i;

    /* renamed from: j */
    private Handler f45949j;

    /* renamed from: k */
    private GestureDetector f45950k;

    /* renamed from: l */
    private boolean f45951l;

    /* renamed from: m */
    private Paint f45952m;

    /* renamed from: n */
    private Paint f45953n;

    /* renamed from: o */
    private Paint f45954o;

    /* renamed from: p */
    private Paint f45955p;

    /* renamed from: q */
    private AbstractC19384c f45956q;

    /* renamed from: r */
    private String f45957r;

    /* renamed from: s */
    private int f45958s;

    /* renamed from: t */
    private int f45959t;

    /* renamed from: u */
    private int f45960u;

    /* renamed from: v */
    private int f45961v;

    /* renamed from: w */
    private float f45962w;

    /* renamed from: x */
    private float f45963x;

    /* renamed from: y */
    private Typeface f45964y;

    /* renamed from: z */
    private int f45965z;

    public final AbstractC19384c getAdapter() {
        return this.f45956q;
    }

    public final Handler getHandler() {
        return this.f45949j;
    }

    public final int getInitPosition() {
        return this.f45923I;
    }

    public final float getItemHeight() {
        return this.f45962w;
    }

    public final float getTotalScrollY() {
        return this.f45922H;
    }

    public final int getItemDefaultOrUserHeight() {
        float f = this.f45963x;
        if (f > 0.0f) {
            return (int) f;
        }
        return (int) this.f45962w;
    }

    public final int getItemsCount() {
        AbstractC19384c cVar = this.f45956q;
        if (cVar != null) {
            return cVar.mo30908a();
        }
        return 0;
    }

    static {
        Covode.recordClassIndex(22193);
    }

    /* renamed from: b */
    private void m36201b() {
        float f = this.f45918D;
        if (f < 1.0f) {
            this.f45918D = 1.0f;
        } else if (f > 4.0f) {
            this.f45918D = 4.0f;
        }
    }

    /* renamed from: a */
    public final void mo30915a() {
        ScheduledFuture<?> scheduledFuture = this.f45944d;
        if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
            this.f45944d.cancel(true);
            this.f45944d = null;
        }
    }

    /* renamed from: com.bytedance.ies.xelement.pickview.e.a$a */
    public enum EnumC19400a {
        CLICK,
        FLING,
        DAGGLE;

        static {
            Covode.recordClassIndex(22195);
        }
    }

    /* renamed from: com.bytedance.ies.xelement.pickview.e.a$b */
    public enum EnumC19401b {
        FILL,
        WRAP,
        CIRCLE;

        static {
            Covode.recordClassIndex(22196);
        }
    }

    public final int getCurrentItem() {
        int i;
        AbstractC19384c cVar = this.f45956q;
        if (cVar == null) {
            return 0;
        }
        if (!this.f45945e || ((i = this.f45924J) >= 0 && i < cVar.mo30908a())) {
            return Math.max(0, Math.min(this.f45924J, this.f45956q.mo30908a() - 1));
        }
        return Math.max(0, Math.min(Math.abs(Math.abs(this.f45924J) - this.f45956q.mo30908a()), this.f45956q.mo30908a() - 1));
    }

    /* renamed from: c */
    private void m36202c() {
        String str;
        if (this.f45956q != null) {
            Rect rect = new Rect();
            for (int i = 0; i < this.f45956q.mo30908a(); i++) {
                String a = m36197a(this.f45956q.mo30909a(i));
                this.f45953n.getTextBounds(a, 0, a.length(), rect);
                int width = rect.width();
                if (width > this.f45959t) {
                    this.f45959t = width;
                }
            }
            AbstractC19054a aVar = this.f45941ac;
            String str2 = "Week";
            if (!(aVar == null || (str = aVar.mo16277a().get("wheel_text_bound_text")) == null || str.isEmpty())) {
                str2 = str;
            }
            this.f45953n.getTextBounds(str2, 0, 2, rect);
            int height = rect.height() + 2;
            this.f45960u = height;
            this.f45962w = this.f45918D * ((float) height);
            float f = this.f45963x;
            if (f > 0.0f) {
                this.f45962w = f;
            }
            int i2 = (int) (this.f45962w * ((float) (this.f45926L - 1)));
            double d = (double) (i2 * 2);
            Double.isNaN(d);
            this.f45927M = (int) (d / 3.141592653589793d);
            double d2 = (double) i2;
            Double.isNaN(d2);
            this.f45929O = (int) (d2 / 3.141592653589793d);
            this.f45928N = View.MeasureSpec.getSize(this.f45933S);
            int i3 = this.f45927M;
            float f2 = this.f45962w;
            this.f45919E = (((float) i3) - f2) / 2.0f;
            float f3 = (((float) i3) + f2) / 2.0f;
            this.f45920F = f3;
            this.f45921G = (f3 - ((f2 - ((float) this.f45960u)) / 2.0f)) - this.f45939aa;
            if (this.f45923I == -1) {
                if (this.f45945e) {
                    this.f45923I = (this.f45956q.mo30908a() + 1) / 2;
                } else {
                    this.f45923I = 0;
                }
            }
            this.f45925K = this.f45923I;
        }
    }

    public final void setAlphaGradient(boolean z) {
        this.f45940ab = z;
    }

    public final void setCyclic(boolean z) {
        this.f45945e = z;
    }

    public final void setDividerType(EnumC19401b bVar) {
        this.f45947h = bVar;
    }

    public final void setGravity(int i) {
        this.f45935U = i;
    }

    public final void setIsOptions(boolean z) {
        this.f45951l = z;
    }

    public final void setLabel(String str) {
        this.f45957r = str;
    }

    public final void setLocalizeAdapter(AbstractC19054a aVar) {
        this.f45941ac = aVar;
    }

    public final void setOnItemSelectedListener(AbstractC19394b bVar) {
        this.f45938a = bVar;
    }

    public final void setTotalScrollY(float f) {
        this.f45922H = f;
    }

    public final void setUserItemHeight(int i) {
        this.f45963x = (float) i;
    }

    public C19398a(Context context) {
        this(context, (byte) 0);
    }

    public final void setDividerColor(int i) {
        this.f45916B = i;
        this.f45954o.setColor(i);
    }

    public final void setTextColorCenter(int i) {
        this.f45915A = i;
        this.f45953n.setColor(i);
    }

    public final void setTextColorOut(int i) {
        this.f45965z = i;
        this.f45952m.setColor(i);
    }

    /* renamed from: b */
    private static String m36200b(int i) {
        if (i < 0 || i >= 10) {
            return String.valueOf(i);
        }
        return f45914g[i];
    }

    public final void setCenterWeight(String str) {
        if (str.contains("bold")) {
            this.f45953n.setFakeBoldText(true);
        }
    }

    public final void setCurrentIndex(int i) {
        this.f45924J = i;
        this.f45923I = i;
        this.f45922H = 0.0f;
        invalidate();
    }

    public final void setDividerWidth(int i) {
        this.f45917C = i;
        this.f45954o.setStrokeWidth((float) i);
    }

    public final void setLineSpacingMultiplier(float f) {
        if (f != 0.0f) {
            this.f45918D = f;
            m36201b();
        }
    }

    public final void setTextXOffset(int i) {
        this.f45961v = i;
        if (i != 0) {
            this.f45953n.setTextScaleX(1.0f);
        }
    }

    public final void setTypeface(Typeface typeface) {
        this.f45964y = typeface;
        this.f45952m.setTypeface(typeface);
        this.f45953n.setTypeface(this.f45964y);
    }

    public final void setItemsVisibleCount(int i) {
        if (i % 2 == 0) {
            i++;
        }
        int i2 = i + 2;
        if (this.f45926L != i2) {
            this.f45926L = i2;
            m36202c();
            invalidate();
        }
    }

    public final void setMaskColor(int i) {
        if (this.f45955p == null) {
            this.f45955p = new Paint();
        }
        this.f45955p.setColor(i);
    }

    public final void setTextSizePx(int i) {
        if (((float) i) > 0.0f) {
            this.f45958s = i;
            this.f45952m.setTextSize((float) i);
            this.f45953n.setTextSize((float) this.f45958s);
        }
    }

    /* renamed from: a */
    private int m36196a(int i) {
        if (i < 0) {
            return m36196a(i + this.f45956q.mo30908a());
        }
        if (i > this.f45956q.mo30908a() - 1) {
            return m36196a(i - this.f45956q.mo30908a());
        }
        return i;
    }

    public final void setAdapter(AbstractC19384c cVar) {
        this.f45956q = cVar;
        int a = cVar.mo30908a();
        if (a == 0) {
            setCurrentIndex(0);
        } else {
            int i = this.f45924J;
            int i2 = a - 1;
            if (i > i2) {
                setCurrentIndex(i2);
            } else if (i < 0) {
                setCurrentIndex(0);
            }
        }
        m36202c();
        invalidate();
    }

    public final void setTextSize(float f) {
        if (f > 0.0f) {
            int i = (int) (this.f45948i.getResources().getDisplayMetrics().density * f);
            this.f45958s = i;
            this.f45952m.setTextSize((float) i);
            this.f45953n.setTextSize((float) this.f45958s);
        }
    }

    /* renamed from: a */
    private static String m36197a(Object obj) {
        if (obj == null) {
            return "";
        }
        if (obj instanceof AbstractC19383b) {
            return ((AbstractC19383b) obj).mo30910a();
        }
        if (obj instanceof Integer) {
            return m36200b(((Integer) obj).intValue());
        }
        return obj.toString();
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f45956q == null) {
            return false;
        }
        boolean onTouchEvent = this.f45950k.onTouchEvent(motionEvent);
        float f = ((float) (-this.f45923I)) * this.f45962w;
        float a = ((float) ((this.f45956q.mo30908a() - 1) - this.f45923I)) * this.f45962w;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f45932R = System.currentTimeMillis();
            mo30915a();
            this.f45931Q = motionEvent.getRawY();
        } else if (action == 2) {
            float rawY = this.f45931Q - motionEvent.getRawY();
            this.f45931Q = motionEvent.getRawY();
            float f2 = this.f45922H + rawY;
            this.f45922H = f2;
            if (!this.f45945e) {
                float f3 = this.f45962w;
                if ((f2 - (f3 * 0.25f) < f && rawY < 0.0f) || ((f3 * 0.25f) + f2 > a && rawY > 0.0f)) {
                    this.f45922H = f2 - rawY;
                    return true;
                }
            }
        } else if (!onTouchEvent) {
            float y = motionEvent.getY();
            int i = this.f45929O;
            double acos = Math.acos((double) ((((float) i) - y) / ((float) i)));
            double d = (double) this.f45929O;
            Double.isNaN(d);
            double d2 = acos * d;
            float f4 = this.f45962w;
            double d3 = (double) (f4 / 2.0f);
            Double.isNaN(d3);
            double d4 = d2 + d3;
            double d5 = (double) f4;
            Double.isNaN(d5);
            this.f45930P = (int) ((((float) (((int) (d4 / d5)) - (this.f45926L / 2))) * f4) - (((this.f45922H % f4) + f4) % f4));
            if (System.currentTimeMillis() - this.f45932R > 120) {
                mo30916a(EnumC19400a.DAGGLE);
            } else {
                mo30916a(EnumC19400a.CLICK);
            }
        }
        if (motionEvent.getAction() != 0) {
            invalidate();
        }
        return true;
    }

    /* renamed from: a */
    private void m36199a(String str) {
        Rect rect = new Rect();
        this.f45953n.getTextBounds(str, 0, str.length(), rect);
        int i = this.f45958s;
        for (int width = rect.width(); width > this.f45928N; width = rect.width()) {
            i--;
            this.f45953n.setTextSize((float) i);
            this.f45953n.getTextBounds(str, 0, str.length(), rect);
        }
        this.f45952m.setTextSize((float) i);
    }

    /* renamed from: a */
    public final void mo30916a(EnumC19400a aVar) {
        mo30915a();
        if (aVar == EnumC19400a.FLING || aVar == EnumC19400a.DAGGLE) {
            float f = this.f45922H;
            float f2 = this.f45962w;
            int i = (int) (((f % f2) + f2) % f2);
            this.f45930P = i;
            if (((float) i) > f2 / 2.0f) {
                this.f45930P = (int) (f2 - ((float) i));
            } else {
                this.f45930P = -i;
            }
        }
        this.f45944d = this.f45943c.scheduleWithFixedDelay(new C19397c(this, this.f45930P), 0, 10, TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        float f;
        Object obj;
        float f2;
        int i;
        String str;
        String str2;
        int i2;
        int i3;
        if (this.f45956q != null) {
            int i4 = 0;
            int min = Math.min(Math.max(0, this.f45923I), this.f45956q.mo30908a() - 1);
            this.f45923I = min;
            try {
                this.f45925K = min + (((int) (this.f45922H / this.f45962w)) % this.f45956q.mo30908a());
            } catch (ArithmeticException unused) {
                LLog.m56856a(6, "WheelView", "Error！adapter.getItemsCount() == 0，adapter data doesn't match");
            }
            if (!this.f45945e) {
                if (this.f45925K < 0) {
                    this.f45925K = 0;
                }
                if (this.f45925K > this.f45956q.mo30908a() - 1) {
                    this.f45925K = this.f45956q.mo30908a() - 1;
                }
            } else {
                if (this.f45925K < 0) {
                    this.f45925K = this.f45956q.mo30908a() + this.f45925K;
                }
                if (this.f45925K > this.f45956q.mo30908a() - 1) {
                    this.f45925K -= this.f45956q.mo30908a();
                }
            }
            float f3 = this.f45922H % this.f45962w;
            float f4 = 10.0f;
            if (this.f45947h == EnumC19401b.WRAP) {
                if (TextUtils.isEmpty(this.f45957r)) {
                    i3 = (this.f45928N - this.f45959t) / 2;
                } else {
                    i3 = (this.f45928N - this.f45959t) / 4;
                }
                float f5 = (float) (i3 - 12);
                if (f5 <= 0.0f) {
                    f5 = 10.0f;
                }
                float f6 = ((float) this.f45928N) - f5;
                float f7 = this.f45919E;
                canvas.drawLine(f5, f7, f6, f7, this.f45954o);
                float f8 = this.f45920F;
                canvas.drawLine(f5, f8, f6, f8, this.f45954o);
            } else if (this.f45947h == EnumC19401b.CIRCLE) {
                this.f45954o.setStyle(Paint.Style.STROKE);
                this.f45954o.setStrokeWidth((float) this.f45917C);
                if (TextUtils.isEmpty(this.f45957r)) {
                    f = ((float) (this.f45928N - this.f45959t)) / 2.0f;
                } else {
                    f = ((float) (this.f45928N - this.f45959t)) / 4.0f;
                }
                float f9 = f - 12.0f;
                if (f9 > 0.0f) {
                    f4 = f9;
                }
                canvas.drawCircle(((float) this.f45928N) / 2.0f, ((float) this.f45927M) / 2.0f, Math.max((((float) this.f45928N) - f4) - f4, this.f45962w) / 1.8f, this.f45954o);
            } else {
                float f10 = this.f45919E;
                canvas.drawLine(0.0f, f10, (float) this.f45928N, f10, this.f45954o);
                float f11 = this.f45920F;
                canvas.drawLine(0.0f, f11, (float) this.f45928N, f11, this.f45954o);
            }
            if (!TextUtils.isEmpty(this.f45957r) && this.f45942b) {
                int i5 = this.f45928N;
                Paint paint = this.f45953n;
                String str3 = this.f45957r;
                if (str3 == null || str3.length() <= 0) {
                    i2 = 0;
                } else {
                    int length = str3.length();
                    float[] fArr = new float[length];
                    paint.getTextWidths(str3, fArr);
                    i2 = 0;
                    for (int i6 = 0; i6 < length; i6++) {
                        i2 += (int) Math.ceil((double) fArr[i6]);
                    }
                }
                canvas.drawText(this.f45957r, ((float) (i5 - i2)) - this.f45939aa, this.f45921G, this.f45953n);
            }
            int i7 = 0;
            while (true) {
                int i8 = this.f45926L;
                if (i7 >= i8) {
                    break;
                }
                int i9 = this.f45925K - ((i8 / 2) - i7);
                if (this.f45945e) {
                    i9 = m36196a(i9);
                } else if (i9 < 0 || i9 > this.f45956q.mo30908a() - 1) {
                    obj = "";
                    canvas.save();
                    double d = (double) (((this.f45962w * ((float) i7)) - f3) / ((float) this.f45929O));
                    Double.isNaN(d);
                    f2 = (float) (90.0d - ((d / 3.141592653589793d) * 180.0d));
                    if (f2 <= 90.0f || f2 < -90.0f) {
                        canvas.restore();
                    } else {
                        String a = (this.f45942b || TextUtils.isEmpty(this.f45957r) || TextUtils.isEmpty(m36197a(obj))) ? m36197a(obj) : m36197a(obj) + this.f45957r;
                        float pow = (float) Math.pow((double) (Math.abs(f2) / 90.0f), 2.2d);
                        m36199a(a);
                        Rect rect = new Rect();
                        this.f45953n.getTextBounds(a, i4, a.length(), rect);
                        int i10 = this.f45935U;
                        if (i10 != 3) {
                            if (i10 == 5) {
                                this.f45936V = (this.f45928N - rect.width()) - ((int) this.f45939aa);
                            } else if (i10 == 17) {
                                if (this.f45951l || (str2 = this.f45957r) == null || str2.equals("") || !this.f45942b) {
                                    double width = (double) (this.f45928N - rect.width());
                                    Double.isNaN(width);
                                    this.f45936V = (int) (width * 0.5d);
                                } else {
                                    double width2 = (double) (this.f45928N - rect.width());
                                    Double.isNaN(width2);
                                    this.f45936V = (int) (width2 * 0.25d);
                                }
                            }
                            i = 0;
                        } else {
                            i = 0;
                            this.f45936V = 0;
                        }
                        Rect rect2 = new Rect();
                        this.f45952m.getTextBounds(a, i, a.length(), rect2);
                        int i11 = this.f45935U;
                        if (i11 == 3) {
                            this.f45937W = 0;
                        } else if (i11 == 5) {
                            this.f45937W = (this.f45928N - rect2.width()) - ((int) this.f45939aa);
                        } else if (i11 == 17) {
                            if (this.f45951l || (str = this.f45957r) == null || str.equals("") || !this.f45942b) {
                                double width3 = (double) (this.f45928N - rect2.width());
                                Double.isNaN(width3);
                                this.f45937W = (int) (width3 * 0.5d);
                            } else {
                                double width4 = (double) (this.f45928N - rect2.width());
                                Double.isNaN(width4);
                                this.f45937W = (int) (width4 * 0.25d);
                            }
                        }
                        double d2 = (double) this.f45929O;
                        double cos = Math.cos(d);
                        double d3 = (double) this.f45929O;
                        Double.isNaN(d3);
                        Double.isNaN(d2);
                        double d4 = d2 - (cos * d3);
                        double sin = Math.sin(d);
                        double d5 = (double) this.f45960u;
                        Double.isNaN(d5);
                        float f12 = (float) (d4 - ((sin * d5) / 2.0d));
                        canvas.translate(0.0f, f12);
                        float f13 = this.f45919E;
                        if (f12 > f13 || ((float) this.f45960u) + f12 < f13) {
                            float f14 = this.f45920F;
                            if (f12 > f14 || ((float) this.f45960u) + f12 < f14) {
                                if (f12 >= f13) {
                                    int i12 = this.f45960u;
                                    if (((float) i12) + f12 <= f14) {
                                        canvas.drawText(a, (float) this.f45936V, ((float) i12) - this.f45939aa, this.f45953n);
                                        this.f45924J = this.f45925K - ((this.f45926L / 2) - i7);
                                    }
                                }
                                canvas.save();
                                canvas.clipRect(0, 0, this.f45928N, (int) this.f45962w);
                                canvas.scale(1.0f, ((float) Math.sin(d)) * 0.8f);
                                m36198a(pow, f2);
                                canvas.drawText(a, ((float) this.f45937W) + (((float) this.f45961v) * pow), (float) this.f45960u, this.f45952m);
                                canvas.restore();
                            } else {
                                canvas.save();
                                canvas.clipRect(0.0f, 0.0f, (float) this.f45928N, this.f45920F - f12);
                                canvas.scale(1.0f, ((float) Math.sin(d)) * 1.0f);
                                canvas.drawText(a, (float) this.f45936V, ((float) this.f45960u) - this.f45939aa, this.f45953n);
                                canvas.restore();
                                canvas.save();
                                canvas.clipRect(0.0f, this.f45920F - f12, (float) this.f45928N, (float) ((int) this.f45962w));
                                canvas.scale(1.0f, ((float) Math.sin(d)) * 0.8f);
                                m36198a(pow, f2);
                                canvas.drawText(a, (float) this.f45937W, (float) this.f45960u, this.f45952m);
                                canvas.restore();
                            }
                        } else {
                            canvas.save();
                            canvas.clipRect(0.0f, 0.0f, (float) this.f45928N, this.f45919E - f12);
                            canvas.scale(1.0f, ((float) Math.sin(d)) * 0.8f);
                            m36198a(pow, f2);
                            canvas.drawText(a, (float) this.f45937W, (float) this.f45960u, this.f45952m);
                            canvas.restore();
                            canvas.save();
                            canvas.clipRect(0.0f, this.f45919E - f12, (float) this.f45928N, (float) ((int) this.f45962w));
                            canvas.scale(1.0f, ((float) Math.sin(d)) * 1.0f);
                            canvas.drawText(a, (float) this.f45936V, ((float) this.f45960u) - this.f45939aa, this.f45953n);
                            canvas.restore();
                        }
                        canvas.restore();
                        this.f45953n.setTextSize((float) this.f45958s);
                    }
                    i7++;
                    i4 = 0;
                }
                obj = this.f45956q.mo30909a(i9);
                canvas.save();
                double d6 = (double) (((this.f45962w * ((float) i7)) - f3) / ((float) this.f45929O));
                Double.isNaN(d6);
                f2 = (float) (90.0d - ((d6 / 3.141592653589793d) * 180.0d));
                if (f2 <= 90.0f) {
                }
                canvas.restore();
                i7++;
                i4 = 0;
            }
            Paint paint2 = this.f45955p;
            if (paint2 != null) {
                canvas.drawRect(0.0f, 0.0f, (float) this.f45928N, this.f45919E, paint2);
                canvas.drawRect(0.0f, this.f45920F, (float) this.f45928N, (float) this.f45927M, this.f45955p);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        this.f45933S = i;
        this.f45934T = i2;
        m36202c();
        setMeasuredDimension(this.f45928N, this.f45927M);
    }

    /* renamed from: a */
    private void m36198a(float f, float f2) {
        int i;
        int i2;
        int i3 = this.f45961v;
        int i4 = -1;
        if (i3 > 0) {
            i = 1;
        } else if (i3 < 0) {
            i = -1;
        } else {
            i = 0;
        }
        Paint paint = this.f45952m;
        if (f2 <= 0.0f) {
            i4 = 1;
        }
        paint.setTextSkewX(((float) (i * i4)) * 0.5f * f);
        if (this.f45940ab) {
            i2 = (int) (((90.0f - Math.abs(f2)) / 90.0f) * 255.0f);
        } else {
            i2 = 255;
        }
        this.f45952m.setAlpha(i2);
    }

    private C19398a(Context context, byte b) {
        super(context, null);
        MethodCollector.m26663i(7343);
        this.f45942b = true;
        C40787l.C40788a a = C40787l.m82269a(EnumC40793o.SCHEDULED);
        a.f95505c = 1;
        this.f45943c = (ScheduledExecutorService) C40780g.m82242a(a.mo70028a());
        this.f45964y = Typeface.MONOSPACE;
        this.f45918D = 1.6f;
        this.f45926L = 0;
        this.f45930P = 0;
        this.f45931Q = 0.0f;
        this.f45932R = 0;
        this.f45935U = 17;
        this.f45936V = 0;
        this.f45937W = 0;
        this.f45940ab = false;
        this.f45946f = new Handler(Looper.getMainLooper());
        this.f45958s = getResources().getDimensionPixelSize(R.dimen.of);
        float f = getResources().getDisplayMetrics().density;
        if (f < 1.0f) {
            this.f45939aa = 2.4f;
        } else if (1.0f <= f && f < 2.0f) {
            this.f45939aa = 4.0f;
        } else if (2.0f <= f && f < 3.0f) {
            this.f45939aa = 6.0f;
        } else if (f >= 3.0f) {
            this.f45939aa = f * 2.5f;
        }
        this.f45935U = 17;
        this.f45965z = -16777216;
        this.f45915A = -16777216;
        this.f45916B = -16777216;
        this.f45917C = 2;
        this.f45963x = context.getResources().getDimension(R.dimen.oe);
        m36201b();
        this.f45948i = context;
        this.f45949j = new HandlerC19396b(this);
        GestureDetector gestureDetector = new GestureDetector(context, new C19393a(this));
        this.f45950k = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        this.f45945e = true;
        this.f45922H = 0.0f;
        this.f45923I = -1;
        Paint paint = new Paint();
        this.f45952m = paint;
        paint.setColor(this.f45965z);
        this.f45952m.setAntiAlias(true);
        this.f45952m.setTypeface(this.f45964y);
        this.f45952m.setTextSize((float) this.f45958s);
        Paint paint2 = new Paint();
        this.f45953n = paint2;
        paint2.setColor(this.f45915A);
        this.f45953n.setAntiAlias(true);
        this.f45953n.setTextScaleX(1.1f);
        this.f45953n.setTypeface(this.f45964y);
        this.f45953n.setTextSize((float) this.f45958s);
        Paint paint3 = new Paint();
        this.f45954o = paint3;
        paint3.setColor(this.f45916B);
        this.f45954o.setAntiAlias(true);
        Paint paint4 = new Paint();
        this.f45955p = paint4;
        paint4.setColor(Integer.MAX_VALUE);
        setLayerType(1, null);
        MethodCollector.m26664o(7343);
    }
}
