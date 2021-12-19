package com.bytedance.ies.xelement.picker.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.xelement.p1366c.AbstractC19054a;
import com.bytedance.ies.xelement.picker.p1384a.AbstractC19328d;
import com.bytedance.ies.xelement.picker.p1387d.AbstractC19336a;
import com.bytedance.ies.xelement.picker.p1388e.AbstractC19342f;
import com.bytedance.ies.xelement.picker.p1388e.C19340d;
import com.bytedance.ies.xelement.picker.p1389f.C19349c;
import com.bytedance.ies.xelement.picker.p1389f.HandlerC19348b;
import com.lynx.tasm.base.LLog;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import com.p2082ss.android.ugc.trill.R;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class WheelView extends View {

    /* renamed from: f */
    private static final String[] f45759f = {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09"};

    /* renamed from: A */
    private float f45760A;

    /* renamed from: B */
    private float f45761B;

    /* renamed from: C */
    private float f45762C;

    /* renamed from: D */
    private float f45763D;

    /* renamed from: E */
    private float f45764E;

    /* renamed from: F */
    private int f45765F;

    /* renamed from: G */
    private int f45766G;

    /* renamed from: H */
    private int f45767H;

    /* renamed from: I */
    private int f45768I;

    /* renamed from: J */
    private int f45769J;

    /* renamed from: K */
    private int f45770K;

    /* renamed from: L */
    private int f45771L;

    /* renamed from: M */
    private int f45772M;

    /* renamed from: N */
    private float f45773N;

    /* renamed from: O */
    private long f45774O;

    /* renamed from: P */
    private int f45775P;

    /* renamed from: Q */
    private int f45776Q;

    /* renamed from: R */
    private int f45777R;

    /* renamed from: S */
    private int f45778S;

    /* renamed from: T */
    private float f45779T;

    /* renamed from: U */
    private boolean f45780U;

    /* renamed from: V */
    private AbstractC19054a f45781V;

    /* renamed from: a */
    public AbstractC19342f f45782a;

    /* renamed from: b */
    public boolean f45783b;

    /* renamed from: c */
    public ScheduledExecutorService f45784c;

    /* renamed from: d */
    public ScheduledFuture<?> f45785d;

    /* renamed from: e */
    public boolean f45786e;

    /* renamed from: g */
    private EnumC19353b f45787g;

    /* renamed from: h */
    private Context f45788h;

    /* renamed from: i */
    private Handler f45789i;

    /* renamed from: j */
    private GestureDetector f45790j;

    /* renamed from: k */
    private boolean f45791k;

    /* renamed from: l */
    private Paint f45792l;

    /* renamed from: m */
    private Paint f45793m;

    /* renamed from: n */
    private Paint f45794n;

    /* renamed from: o */
    private AbstractC19328d f45795o;

    /* renamed from: p */
    private String f45796p;

    /* renamed from: q */
    private int f45797q;

    /* renamed from: r */
    private int f45798r;

    /* renamed from: s */
    private int f45799s;

    /* renamed from: t */
    private int f45800t;

    /* renamed from: u */
    private float f45801u;

    /* renamed from: v */
    private Typeface f45802v;

    /* renamed from: w */
    private int f45803w;

    /* renamed from: x */
    private int f45804x;

    /* renamed from: y */
    private int f45805y;

    /* renamed from: z */
    private int f45806z;

    public final AbstractC19328d getAdapter() {
        return this.f45795o;
    }

    public Handler getHandler() {
        return this.f45789i;
    }

    public int getInitPosition() {
        return this.f45765F;
    }

    public float getItemHeight() {
        return this.f45801u;
    }

    public float getTotalScrollY() {
        return this.f45764E;
    }

    public int getItemsCount() {
        AbstractC19328d dVar = this.f45795o;
        if (dVar != null) {
            return dVar.mo30777a();
        }
        return 0;
    }

    static {
        Covode.recordClassIndex(22139);
    }

    /* renamed from: b */
    private void m36109b() {
        float f = this.f45760A;
        if (f < 1.0f) {
            this.f45760A = 1.0f;
        } else if (f > 4.0f) {
            this.f45760A = 4.0f;
        }
    }

    /* renamed from: a */
    public final void mo30814a() {
        ScheduledFuture<?> scheduledFuture = this.f45785d;
        if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
            this.f45785d.cancel(true);
            this.f45785d = null;
        }
    }

    /* renamed from: com.bytedance.ies.xelement.picker.view.WheelView$a */
    public enum EnumC19352a {
        CLICK,
        FLING,
        DAGGLE;

        static {
            Covode.recordClassIndex(22141);
        }
    }

    /* renamed from: com.bytedance.ies.xelement.picker.view.WheelView$b */
    public enum EnumC19353b {
        FILL,
        WRAP,
        CIRCLE;

        static {
            Covode.recordClassIndex(22142);
        }
    }

    public final int getCurrentItem() {
        int i;
        AbstractC19328d dVar = this.f45795o;
        if (dVar == null) {
            return 0;
        }
        if (!this.f45786e || ((i = this.f45766G) >= 0 && i < dVar.mo30777a())) {
            return Math.max(0, Math.min(this.f45766G, this.f45795o.mo30777a() - 1));
        }
        return Math.max(0, Math.min(Math.abs(Math.abs(this.f45766G) - this.f45795o.mo30777a()), this.f45795o.mo30777a() - 1));
    }

    /* renamed from: c */
    private void m36110c() {
        String str;
        if (this.f45795o != null) {
            Rect rect = new Rect();
            for (int i = 0; i < this.f45795o.mo30777a(); i++) {
                String a = m36105a(this.f45795o.mo30778a(i));
                this.f45793m.getTextBounds(a, 0, a.length(), rect);
                int width = rect.width();
                if (width > this.f45798r) {
                    this.f45798r = width;
                }
            }
            AbstractC19054a aVar = this.f45781V;
            String str2 = "Week";
            if (!(aVar == null || (str = aVar.mo16277a().get("wheel_text_bound_text")) == null || str.isEmpty())) {
                str2 = str;
            }
            this.f45793m.getTextBounds(str2, 0, 2, rect);
            int height = rect.height() + 2;
            this.f45799s = height;
            float f = this.f45760A * ((float) height);
            this.f45801u = f;
            int i2 = (int) (f * ((float) (this.f45768I - 1)));
            double d = (double) (i2 * 2);
            Double.isNaN(d);
            this.f45769J = (int) (d / 3.141592653589793d);
            double d2 = (double) i2;
            Double.isNaN(d2);
            this.f45771L = (int) (d2 / 3.141592653589793d);
            this.f45770K = View.MeasureSpec.getSize(this.f45775P);
            int i3 = this.f45769J;
            float f2 = this.f45801u;
            this.f45761B = (((float) i3) - f2) / 2.0f;
            float f3 = (((float) i3) + f2) / 2.0f;
            this.f45762C = f3;
            this.f45763D = (f3 - ((f2 - ((float) this.f45799s)) / 2.0f)) - this.f45779T;
            if (this.f45765F == -1) {
                if (this.f45786e) {
                    this.f45765F = (this.f45795o.mo30777a() + 1) / 2;
                } else {
                    this.f45765F = 0;
                }
            }
            this.f45767H = this.f45765F;
        }
    }

    public void setAlphaGradient(boolean z) {
        this.f45780U = z;
    }

    public final void setCyclic(boolean z) {
        this.f45786e = z;
    }

    public void setDividerType(EnumC19353b bVar) {
        this.f45787g = bVar;
    }

    public void setGravity(int i) {
        this.f45776Q = i;
    }

    public void setIsOptions(boolean z) {
        this.f45791k = z;
    }

    public void setLabel(String str) {
        this.f45796p = str;
    }

    public void setLocalizeAdapter(AbstractC19054a aVar) {
        this.f45781V = aVar;
    }

    public final void setOnItemSelectedListener(AbstractC19342f fVar) {
        this.f45782a = fVar;
    }

    public void setTotalScrollY(float f) {
        this.f45764E = f;
    }

    public WheelView(Context context) {
        this(context, null);
    }

    public void setDividerColor(int i) {
        this.f45805y = i;
        this.f45794n.setColor(i);
    }

    public void setTextColorCenter(int i) {
        this.f45804x = i;
        this.f45793m.setColor(i);
    }

    public void setTextColorOut(int i) {
        this.f45803w = i;
        this.f45792l.setColor(i);
    }

    /* renamed from: b */
    private static String m36108b(int i) {
        if (i < 0 || i >= 10) {
            return String.valueOf(i);
        }
        return f45759f[i];
    }

    public final void setAdapter(AbstractC19328d dVar) {
        this.f45795o = dVar;
        m36110c();
        invalidate();
    }

    public final void setCurrentIndex(int i) {
        this.f45766G = i;
        this.f45765F = i;
        this.f45764E = 0.0f;
        invalidate();
    }

    public void setDividerWidth(int i) {
        this.f45806z = i;
        this.f45794n.setStrokeWidth((float) i);
    }

    public void setItemsVisibleCount(int i) {
        if (i % 2 == 0) {
            i++;
        }
        this.f45768I = i + 2;
    }

    public void setLineSpacingMultiplier(float f) {
        if (f != 0.0f) {
            this.f45760A = f;
            m36109b();
        }
    }

    public void setTextXOffset(int i) {
        this.f45800t = i;
        if (i != 0) {
            this.f45793m.setTextScaleX(1.0f);
        }
    }

    public final void setTypeface(Typeface typeface) {
        this.f45802v = typeface;
        this.f45792l.setTypeface(typeface);
        this.f45793m.setTypeface(this.f45802v);
    }

    /* renamed from: a */
    private int m36104a(int i) {
        if (i < 0) {
            return m36104a(i + this.f45795o.mo30777a());
        }
        if (i > this.f45795o.mo30777a() - 1) {
            return m36104a(i - this.f45795o.mo30777a());
        }
        return i;
    }

    public final void setTextSize(float f) {
        if (f > 0.0f) {
            int i = (int) (this.f45788h.getResources().getDisplayMetrics().density * f);
            this.f45797q = i;
            this.f45792l.setTextSize((float) i);
            this.f45793m.setTextSize((float) this.f45797q);
        }
    }

    /* renamed from: a */
    private static String m36105a(Object obj) {
        if (obj == null) {
            return "";
        }
        if (obj instanceof AbstractC19336a) {
            return ((AbstractC19336a) obj).mo30806a();
        }
        if (obj instanceof Integer) {
            return m36108b(((Integer) obj).intValue());
        }
        return obj.toString();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = this.f45790j.onTouchEvent(motionEvent);
        float f = ((float) (-this.f45765F)) * this.f45801u;
        float a = ((float) ((this.f45795o.mo30777a() - 1) - this.f45765F)) * this.f45801u;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f45774O = System.currentTimeMillis();
            mo30814a();
            this.f45773N = motionEvent.getRawY();
        } else if (action == 2) {
            float rawY = this.f45773N - motionEvent.getRawY();
            this.f45773N = motionEvent.getRawY();
            float f2 = this.f45764E + rawY;
            this.f45764E = f2;
            if (!this.f45786e) {
                float f3 = this.f45801u;
                if ((f2 - (f3 * 0.25f) < f && rawY < 0.0f) || ((f3 * 0.25f) + f2 > a && rawY > 0.0f)) {
                    this.f45764E = f2 - rawY;
                    return true;
                }
            }
        } else if (!onTouchEvent) {
            float y = motionEvent.getY();
            int i = this.f45771L;
            double acos = Math.acos((double) ((((float) i) - y) / ((float) i)));
            double d = (double) this.f45771L;
            Double.isNaN(d);
            double d2 = acos * d;
            float f4 = this.f45801u;
            double d3 = (double) (f4 / 2.0f);
            Double.isNaN(d3);
            double d4 = d2 + d3;
            double d5 = (double) f4;
            Double.isNaN(d5);
            this.f45772M = (int) ((((float) (((int) (d4 / d5)) - (this.f45768I / 2))) * f4) - (((this.f45764E % f4) + f4) % f4));
            if (System.currentTimeMillis() - this.f45774O > 120) {
                mo30815a(EnumC19352a.DAGGLE);
            } else {
                mo30815a(EnumC19352a.CLICK);
            }
        }
        if (motionEvent.getAction() != 0) {
            invalidate();
        }
        return true;
    }

    /* renamed from: a */
    private void m36107a(String str) {
        Rect rect = new Rect();
        this.f45793m.getTextBounds(str, 0, str.length(), rect);
        int i = this.f45797q;
        for (int width = rect.width(); width > this.f45770K; width = rect.width()) {
            i--;
            this.f45793m.setTextSize((float) i);
            this.f45793m.getTextBounds(str, 0, str.length(), rect);
        }
        this.f45792l.setTextSize((float) i);
    }

    /* renamed from: a */
    public final void mo30815a(EnumC19352a aVar) {
        mo30814a();
        if (aVar == EnumC19352a.FLING || aVar == EnumC19352a.DAGGLE) {
            float f = this.f45764E;
            float f2 = this.f45801u;
            int i = (int) (((f % f2) + f2) % f2);
            this.f45772M = i;
            if (((float) i) > f2 / 2.0f) {
                this.f45772M = (int) (f2 - ((float) i));
            } else {
                this.f45772M = -i;
            }
        }
        this.f45785d = this.f45784c.scheduleWithFixedDelay(new C19349c(this, this.f45772M), 0, 10, TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f;
        Object obj;
        float f2;
        int i;
        String str;
        String str2;
        int i2;
        int i3;
        if (this.f45795o != null) {
            int i4 = 0;
            int min = Math.min(Math.max(0, this.f45765F), this.f45795o.mo30777a() - 1);
            this.f45765F = min;
            try {
                this.f45767H = min + (((int) (this.f45764E / this.f45801u)) % this.f45795o.mo30777a());
            } catch (ArithmeticException unused) {
                LLog.m56856a(6, "WheelView", "Error！adapter.getItemsCount() == 0，adapter data doesn't match");
            }
            if (!this.f45786e) {
                if (this.f45767H < 0) {
                    this.f45767H = 0;
                }
                if (this.f45767H > this.f45795o.mo30777a() - 1) {
                    this.f45767H = this.f45795o.mo30777a() - 1;
                }
            } else {
                if (this.f45767H < 0) {
                    this.f45767H = this.f45795o.mo30777a() + this.f45767H;
                }
                if (this.f45767H > this.f45795o.mo30777a() - 1) {
                    this.f45767H -= this.f45795o.mo30777a();
                }
            }
            float f3 = this.f45764E % this.f45801u;
            float f4 = 10.0f;
            if (this.f45787g == EnumC19353b.WRAP) {
                if (TextUtils.isEmpty(this.f45796p)) {
                    i3 = (this.f45770K - this.f45798r) / 2;
                } else {
                    i3 = (this.f45770K - this.f45798r) / 4;
                }
                float f5 = (float) (i3 - 12);
                if (f5 <= 0.0f) {
                    f5 = 10.0f;
                }
                float f6 = ((float) this.f45770K) - f5;
                float f7 = this.f45761B;
                canvas.drawLine(f5, f7, f6, f7, this.f45794n);
                float f8 = this.f45762C;
                canvas.drawLine(f5, f8, f6, f8, this.f45794n);
            } else if (this.f45787g == EnumC19353b.CIRCLE) {
                this.f45794n.setStyle(Paint.Style.STROKE);
                this.f45794n.setStrokeWidth((float) this.f45806z);
                if (TextUtils.isEmpty(this.f45796p)) {
                    f = ((float) (this.f45770K - this.f45798r)) / 2.0f;
                } else {
                    f = ((float) (this.f45770K - this.f45798r)) / 4.0f;
                }
                float f9 = f - 12.0f;
                if (f9 > 0.0f) {
                    f4 = f9;
                }
                canvas.drawCircle(((float) this.f45770K) / 2.0f, ((float) this.f45769J) / 2.0f, Math.max((((float) this.f45770K) - f4) - f4, this.f45801u) / 1.8f, this.f45794n);
            } else {
                float f10 = this.f45761B;
                canvas.drawLine(0.0f, f10, (float) this.f45770K, f10, this.f45794n);
                float f11 = this.f45762C;
                canvas.drawLine(0.0f, f11, (float) this.f45770K, f11, this.f45794n);
            }
            if (!TextUtils.isEmpty(this.f45796p) && this.f45783b) {
                int i5 = this.f45770K;
                Paint paint = this.f45793m;
                String str3 = this.f45796p;
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
                canvas.drawText(this.f45796p, ((float) (i5 - i2)) - this.f45779T, this.f45763D, this.f45793m);
            }
            int i7 = 0;
            while (true) {
                int i8 = this.f45768I;
                if (i7 < i8) {
                    int i9 = this.f45767H - ((i8 / 2) - i7);
                    if (this.f45786e) {
                        i9 = m36104a(i9);
                    } else if (i9 < 0 || i9 > this.f45795o.mo30777a() - 1) {
                        obj = "";
                        canvas.save();
                        double d = (double) (((this.f45801u * ((float) i7)) - f3) / ((float) this.f45771L));
                        Double.isNaN(d);
                        f2 = (float) (90.0d - ((d / 3.141592653589793d) * 180.0d));
                        if (f2 <= 90.0f || f2 < -90.0f) {
                            canvas.restore();
                        } else {
                            String a = (this.f45783b || TextUtils.isEmpty(this.f45796p) || TextUtils.isEmpty(m36105a(obj))) ? m36105a(obj) : m36105a(obj) + this.f45796p;
                            float pow = (float) Math.pow((double) (Math.abs(f2) / 90.0f), 2.2d);
                            m36107a(a);
                            Rect rect = new Rect();
                            this.f45793m.getTextBounds(a, i4, a.length(), rect);
                            int i10 = this.f45776Q;
                            if (i10 != 3) {
                                if (i10 == 5) {
                                    this.f45777R = (this.f45770K - rect.width()) - ((int) this.f45779T);
                                } else if (i10 == 17) {
                                    if (this.f45791k || (str2 = this.f45796p) == null || str2.equals("") || !this.f45783b) {
                                        double width = (double) (this.f45770K - rect.width());
                                        Double.isNaN(width);
                                        this.f45777R = (int) (width * 0.5d);
                                    } else {
                                        double width2 = (double) (this.f45770K - rect.width());
                                        Double.isNaN(width2);
                                        this.f45777R = (int) (width2 * 0.25d);
                                    }
                                }
                                i = 0;
                            } else {
                                i = 0;
                                this.f45777R = 0;
                            }
                            Rect rect2 = new Rect();
                            this.f45792l.getTextBounds(a, i, a.length(), rect2);
                            int i11 = this.f45776Q;
                            if (i11 == 3) {
                                this.f45778S = 0;
                            } else if (i11 == 5) {
                                this.f45778S = (this.f45770K - rect2.width()) - ((int) this.f45779T);
                            } else if (i11 == 17) {
                                if (this.f45791k || (str = this.f45796p) == null || str.equals("") || !this.f45783b) {
                                    double width3 = (double) (this.f45770K - rect2.width());
                                    Double.isNaN(width3);
                                    this.f45778S = (int) (width3 * 0.5d);
                                } else {
                                    double width4 = (double) (this.f45770K - rect2.width());
                                    Double.isNaN(width4);
                                    this.f45778S = (int) (width4 * 0.25d);
                                }
                            }
                            double d2 = (double) this.f45771L;
                            double cos = Math.cos(d);
                            double d3 = (double) this.f45771L;
                            Double.isNaN(d3);
                            Double.isNaN(d2);
                            double d4 = d2 - (cos * d3);
                            double sin = Math.sin(d);
                            double d5 = (double) this.f45799s;
                            Double.isNaN(d5);
                            float f12 = (float) (d4 - ((sin * d5) / 2.0d));
                            canvas.translate(0.0f, f12);
                            float f13 = this.f45761B;
                            if (f12 > f13 || ((float) this.f45799s) + f12 < f13) {
                                float f14 = this.f45762C;
                                if (f12 > f14 || ((float) this.f45799s) + f12 < f14) {
                                    if (f12 >= f13) {
                                        int i12 = this.f45799s;
                                        if (((float) i12) + f12 <= f14) {
                                            canvas.drawText(a, (float) this.f45777R, ((float) i12) - this.f45779T, this.f45793m);
                                            this.f45766G = this.f45767H - ((this.f45768I / 2) - i7);
                                        }
                                    }
                                    canvas.save();
                                    canvas.clipRect(0, 0, this.f45770K, (int) this.f45801u);
                                    canvas.scale(1.0f, ((float) Math.sin(d)) * 0.8f);
                                    m36106a(pow, f2);
                                    canvas.drawText(a, ((float) this.f45778S) + (((float) this.f45800t) * pow), (float) this.f45799s, this.f45792l);
                                    canvas.restore();
                                } else {
                                    canvas.save();
                                    canvas.clipRect(0.0f, 0.0f, (float) this.f45770K, this.f45762C - f12);
                                    canvas.scale(1.0f, ((float) Math.sin(d)) * 1.0f);
                                    canvas.drawText(a, (float) this.f45777R, ((float) this.f45799s) - this.f45779T, this.f45793m);
                                    canvas.restore();
                                    canvas.save();
                                    canvas.clipRect(0.0f, this.f45762C - f12, (float) this.f45770K, (float) ((int) this.f45801u));
                                    canvas.scale(1.0f, ((float) Math.sin(d)) * 0.8f);
                                    m36106a(pow, f2);
                                    canvas.drawText(a, (float) this.f45778S, (float) this.f45799s, this.f45792l);
                                    canvas.restore();
                                }
                            } else {
                                canvas.save();
                                canvas.clipRect(0.0f, 0.0f, (float) this.f45770K, this.f45761B - f12);
                                canvas.scale(1.0f, ((float) Math.sin(d)) * 0.8f);
                                m36106a(pow, f2);
                                canvas.drawText(a, (float) this.f45778S, (float) this.f45799s, this.f45792l);
                                canvas.restore();
                                canvas.save();
                                canvas.clipRect(0.0f, this.f45761B - f12, (float) this.f45770K, (float) ((int) this.f45801u));
                                canvas.scale(1.0f, ((float) Math.sin(d)) * 1.0f);
                                canvas.drawText(a, (float) this.f45777R, ((float) this.f45799s) - this.f45779T, this.f45793m);
                                canvas.restore();
                            }
                            canvas.restore();
                            this.f45793m.setTextSize((float) this.f45797q);
                        }
                        i7++;
                        i4 = 0;
                    }
                    obj = this.f45795o.mo30778a(i9);
                    canvas.save();
                    double d6 = (double) (((this.f45801u * ((float) i7)) - f3) / ((float) this.f45771L));
                    Double.isNaN(d6);
                    f2 = (float) (90.0d - ((d6 / 3.141592653589793d) * 180.0d));
                    if (f2 <= 90.0f) {
                    }
                    canvas.restore();
                    i7++;
                    i4 = 0;
                } else {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        this.f45775P = i;
        m36110c();
        setMeasuredDimension(this.f45770K, this.f45769J);
    }

    /* renamed from: a */
    private void m36106a(float f, float f2) {
        int i;
        int i2;
        int i3 = this.f45800t;
        int i4 = -1;
        if (i3 > 0) {
            i = 1;
        } else if (i3 < 0) {
            i = -1;
        } else {
            i = 0;
        }
        Paint paint = this.f45792l;
        if (f2 <= 0.0f) {
            i4 = 1;
        }
        paint.setTextSkewX(((float) (i * i4)) * 0.5f * f);
        if (this.f45780U) {
            i2 = (int) (((90.0f - Math.abs(f2)) / 90.0f) * 255.0f);
        } else {
            i2 = 255;
        }
        this.f45792l.setAlpha(i2);
    }

    public WheelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(9108);
        this.f45783b = true;
        C40787l.C40788a a = C40787l.m82269a(EnumC40793o.SCHEDULED);
        a.f95505c = 1;
        this.f45784c = (ScheduledExecutorService) C40780g.m82242a(a.mo70028a());
        this.f45802v = Typeface.MONOSPACE;
        this.f45760A = 1.6f;
        this.f45768I = 11;
        this.f45772M = 0;
        this.f45773N = 0.0f;
        this.f45774O = 0;
        this.f45776Q = 17;
        this.f45777R = 0;
        this.f45778S = 0;
        this.f45780U = false;
        this.f45797q = getResources().getDimensionPixelSize(R.dimen.o_);
        float f = getResources().getDisplayMetrics().density;
        if (f < 1.0f) {
            this.f45779T = 2.4f;
        } else if (1.0f <= f && f < 2.0f) {
            this.f45779T = 4.0f;
        } else if (2.0f <= f && f < 3.0f) {
            this.f45779T = 6.0f;
        } else if (f >= 3.0f) {
            this.f45779T = f * 2.5f;
        }
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.a76, R.attr.a77, R.attr.a78, R.attr.a79, R.attr.a7_, R.attr.a7a, R.attr.a7b}, 0, 0);
            this.f45776Q = obtainStyledAttributes.getInt(2, 17);
            this.f45803w = obtainStyledAttributes.getColor(5, -5723992);
            this.f45804x = obtainStyledAttributes.getColor(4, -14013910);
            this.f45805y = obtainStyledAttributes.getColor(0, -2763307);
            this.f45806z = obtainStyledAttributes.getDimensionPixelSize(1, 2);
            this.f45797q = obtainStyledAttributes.getDimensionPixelOffset(6, this.f45797q);
            this.f45760A = obtainStyledAttributes.getFloat(3, this.f45760A);
            obtainStyledAttributes.recycle();
        }
        m36109b();
        this.f45788h = context;
        this.f45789i = new HandlerC19348b(this);
        GestureDetector gestureDetector = new GestureDetector(context, new C19340d(this));
        this.f45790j = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        this.f45786e = true;
        this.f45764E = 0.0f;
        this.f45765F = -1;
        Paint paint = new Paint();
        this.f45792l = paint;
        paint.setColor(this.f45803w);
        this.f45792l.setAntiAlias(true);
        this.f45792l.setTypeface(this.f45802v);
        this.f45792l.setTextSize((float) this.f45797q);
        Paint paint2 = new Paint();
        this.f45793m = paint2;
        paint2.setColor(this.f45804x);
        this.f45793m.setAntiAlias(true);
        this.f45793m.setTextScaleX(1.1f);
        this.f45793m.setTypeface(this.f45802v);
        this.f45793m.setTextSize((float) this.f45797q);
        Paint paint3 = new Paint();
        this.f45794n = paint3;
        paint3.setColor(this.f45805y);
        this.f45794n.setAntiAlias(true);
        setLayerType(1, null);
        MethodCollector.m26664o(9108);
    }
}
