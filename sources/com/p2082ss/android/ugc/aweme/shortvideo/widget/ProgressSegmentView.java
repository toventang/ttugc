package com.p2082ss.android.ugc.aweme.shortvideo.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.core.content.C0643b;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17301b;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17303d;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.shortvideo.C70636dh;
import com.p2082ss.android.ugc.aweme.shortvideo.RetakeVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.TimeSpeedModelExtension;
import com.p2082ss.android.ugc.aweme.tools.C78099c;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.vesdk.VERecordData;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.ProgressSegmentView */
public class ProgressSegmentView extends FrameLayout {

    /* renamed from: a */
    private static final int f166864a;

    /* renamed from: A */
    private long f166865A;

    /* renamed from: B */
    private boolean f166866B;

    /* renamed from: C */
    private String f166867C;

    /* renamed from: D */
    private ValueAnimator f166868D;

    /* renamed from: E */
    private ValueAnimator f166869E;

    /* renamed from: F */
    private boolean f166870F;

    /* renamed from: b */
    protected List<TimeSpeedModelExtension> f166871b;

    /* renamed from: c */
    protected TimeSpeedModelExtension f166872c;

    /* renamed from: d */
    protected long f166873d;

    /* renamed from: e */
    protected Paint f166874e;

    /* renamed from: f */
    protected Paint f166875f;

    /* renamed from: g */
    protected Paint f166876g;

    /* renamed from: h */
    protected Paint f166877h;

    /* renamed from: i */
    protected Paint f166878i;

    /* renamed from: j */
    protected Paint f166879j;

    /* renamed from: k */
    protected Paint f166880k;

    /* renamed from: l */
    protected Paint f166881l;

    /* renamed from: m */
    protected long f166882m;

    /* renamed from: n */
    protected float f166883n;

    /* renamed from: o */
    protected float f166884o;

    /* renamed from: p */
    protected boolean f166885p;

    /* renamed from: q */
    protected int f166886q;

    /* renamed from: r */
    protected List<VERecordData.VERecordSegmentData> f166887r;

    /* renamed from: s */
    protected int f166888s;

    /* renamed from: t */
    protected long f166889t;

    /* renamed from: u */
    protected List<TimeSpeedModelExtension> f166890u;

    /* renamed from: v */
    private Paint f166891v;

    /* renamed from: w */
    private long f166892w;

    /* renamed from: x */
    private long f166893x;

    /* renamed from: y */
    private long f166894y;

    /* renamed from: z */
    private long f166895z;

    /* renamed from: b */
    public static void m130582b() {
        throw new IllegalAccessException("NOT Implement, please tell to CHENWEI");
    }

    private long getLongVideoAnchorPosition() {
        return m130581a(this.f166895z);
    }

    /* renamed from: a */
    public final void mo116782a() {
        this.f166885p = true;
        this.f166869E.start();
        mo116787a(false);
    }

    static {
        Covode.recordClassIndex(87020);
        Context applicationContext = C63247i.f143610a.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        f166864a = (int) C13628n.m24520b(applicationContext, 3.0f);
    }

    /* renamed from: c */
    private boolean m130583c() {
        if (this.f166882m <= 30000 || this.f166873d >= this.f166895z) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f166868D;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f166868D.removeAllUpdateListeners();
            this.f166868D = null;
        }
        ValueAnimator valueAnimator2 = this.f166869E;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            this.f166869E.removeAllUpdateListeners();
            this.f166869E = null;
        }
    }

    public void setAnchorDuration(long j) {
        this.f166895z = j;
    }

    public void setNeedDrawAnchor(boolean z) {
        this.f166866B = z;
    }

    public void setMaxDuration(long j) {
        this.f166882m = j;
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo116788b(ValueAnimator valueAnimator) {
        this.f166883n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
    }

    public void setAnchorString(String str) {
        this.f166867C = str;
        this.f166865A = (long) this.f166891v.measureText(str);
    }

    /* renamed from: a */
    private float m130580a(List<VERecordData.VERecordSegmentData> list) {
        long j = 0;
        for (int i = 0; i < list.size(); i++) {
            j += list.get(i).f190800c;
        }
        return ((float) this.f166892w) / ((float) j);
    }

    /* renamed from: a */
    private long m130581a(long j) {
        double d = (double) j;
        Double.isNaN(d);
        double d2 = (double) this.f166892w;
        Double.isNaN(d2);
        double d3 = d * 1.0d * d2;
        double d4 = (double) this.f166882m;
        Double.isNaN(d4);
        return (long) (d3 / d4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo116783a(ValueAnimator valueAnimator) {
        this.f166884o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
    }

    /* renamed from: a */
    public final void mo116784a(RetakeVideoContext retakeVideoContext) {
        if (retakeVideoContext.f155734d != null) {
            this.f166887r = retakeVideoContext.f155734d.f190794b;
            this.f166888s = retakeVideoContext.f155733c;
            this.f166886q = 2;
            if (this.f166890u != null) {
                this.f166890u = null;
            }
            this.f166889t = 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo116744b(Canvas canvas) {
        TimeSpeedModelExtension timeSpeedModelExtension = this.f166872c;
        long j = 0;
        if (timeSpeedModelExtension != null) {
            j = 0 + ((long) timeSpeedModelExtension.getDuration());
            int a = (int) m130581a(j);
            if (((long) a) < this.f166892w) {
                canvas.drawRect((float) (a - f166864a), 0.0f, (float) a, (float) this.f166893x, this.f166877h);
            }
        }
        if (this.f166871b != null) {
            for (int i = 0; i < this.f166871b.size(); i++) {
                TimeSpeedModelExtension timeSpeedModelExtension2 = this.f166871b.get(i);
                j += (long) TimeSpeedModelExtension.calculateRealTime(timeSpeedModelExtension2.getDuration(), timeSpeedModelExtension2.getSpeed());
                int a2 = (int) m130581a(j);
                if (((long) a2) < this.f166892w) {
                    canvas.drawRect((float) (a2 - f166864a), 0.0f, (float) a2, (float) this.f166893x, this.f166877h);
                }
            }
            if (this.f166866B && m130583c()) {
                long longVideoAnchorPosition = getLongVideoAnchorPosition();
                long j2 = longVideoAnchorPosition - 2;
                canvas.drawRect((float) j2, 0.0f, (float) (longVideoAnchorPosition + 2), (float) this.f166893x, this.f166877h);
                canvas.drawText(this.f166867C, (float) (j2 - (this.f166865A / 2)), (getY() + ((float) (this.f166893x * 2))) - ((float) C70636dh.m124833c(getContext())), this.f166891v);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo116743a(Canvas canvas) {
        float f;
        float a = m130580a(this.f166887r);
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i = 0;
        while (i < this.f166887r.size()) {
            int i2 = (int) (((float) this.f166887r.get(i).f190800c) * a);
            if (i == this.f166888s) {
                this.f166874e.setStrokeCap(Paint.Cap.BUTT);
                long j = this.f166894y;
                float f4 = ((float) i2) + f3;
                canvas.drawLine(f3, (float) j, f4, (float) j, this.f166874e);
                if (this.f166890u != null) {
                    long j2 = this.f166889t;
                    if (j2 >= 0) {
                        float f5 = a * 1000.0f;
                        if (j2 > 0) {
                            float f6 = (((float) j2) * f5) + f3;
                            float min = Math.min(f6, f4);
                            int i3 = this.f166888s;
                            if (i3 == 0) {
                                canvas.save();
                                canvas.clipRect(f2, f2, (float) this.f166894y, (float) this.f166893x);
                                long j3 = this.f166894y;
                                canvas.drawCircle((float) j3, (float) j3, (float) j3, this.f166875f);
                                canvas.restore();
                                f = ((float) this.f166894y) + f3;
                            } else {
                                if (f6 >= f4 && i3 == this.f166887r.size() - 1) {
                                    canvas.save();
                                    canvas.clipRect(f4 - ((float) this.f166894y), f2, f4, (float) this.f166893x);
                                    long j4 = this.f166894y;
                                    canvas.drawCircle(f4 - ((float) j4), (float) j4, (float) j4, this.f166875f);
                                    canvas.restore();
                                    min = f4 - ((float) this.f166894y);
                                }
                                f = f3;
                            }
                            canvas.drawRect(f, 0.0f, min, (float) this.f166893x, this.f166875f);
                        }
                        if (this.f166890u != null) {
                            float f7 = f3;
                            for (int i4 = 0; i4 < this.f166890u.size(); i4++) {
                                TimeSpeedModelExtension timeSpeedModelExtension = this.f166890u.get(i4);
                                f7 += ((float) ((long) TimeSpeedModelExtension.calculateRealTime(timeSpeedModelExtension.getDuration(), timeSpeedModelExtension.getSpeed()))) * f5;
                                if (this.f166888s != this.f166887r.size() - 1 || f7 < f4) {
                                    float min2 = Math.min(f7, f4);
                                    canvas.drawRect(min2 - ((float) f166864a), 0.0f, min2, (float) this.f166893x, this.f166877h);
                                }
                            }
                        }
                    }
                }
                if (this.f166885p) {
                    this.f166881l.setAlpha((int) (this.f166884o * 255.0f));
                    canvas.drawRect(f3, 0.0f, f4, (float) this.f166893x, this.f166881l);
                }
                f3 = f4;
            } else {
                if (i == 0) {
                    canvas.save();
                    canvas.clipRect(0.0f, 0.0f, (float) this.f166894y, (float) this.f166893x);
                    long j5 = this.f166894y;
                    canvas.drawCircle((float) j5, (float) j5, (float) j5, this.f166876g);
                    canvas.restore();
                    long j6 = this.f166894y;
                    canvas.drawRect((float) j6, 0.0f, (float) Math.min((long) i2, this.f166892w - j6), (float) this.f166893x, this.f166876g);
                } else if (i == this.f166887r.size() - 1) {
                    canvas.save();
                    long j7 = this.f166892w;
                    canvas.clipRect((float) (j7 - this.f166894y), 0.0f, (float) j7, (float) this.f166893x);
                    long j8 = this.f166892w;
                    long j9 = this.f166894y;
                    canvas.drawCircle((float) (j8 - j9), (float) j9, (float) j9, this.f166876g);
                    canvas.restore();
                    canvas.drawRect(f3, 0.0f, (float) (this.f166892w - this.f166894y), (float) this.f166893x, this.f166876g);
                } else {
                    canvas.drawRect(f3, 0.0f, f3 + ((float) i2), (float) this.f166893x, this.f166876g);
                }
                f3 += (float) i2;
                if (i == this.f166888s - 1) {
                    this.f166880k.setAlpha((int) (this.f166883n * 255.0f));
                    canvas.drawRect(f3 - ((float) f166864a), 0.0f, f3, (float) this.f166893x, this.f166880k);
                } else if (i != this.f166887r.size() - 1) {
                    canvas.drawRect(f3 - ((float) f166864a), 0.0f, f3, (float) this.f166893x, this.f166877h);
                }
            }
            i++;
            f2 = 0.0f;
        }
    }

    /* renamed from: a */
    public final void mo116787a(boolean z) {
        ValueAnimator valueAnimator = this.f166868D;
        if (valueAnimator != null) {
            if (z) {
                valueAnimator.start();
                return;
            }
            valueAnimator.end();
            this.f166883n = 1.0f;
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        long j;
        float f;
        long j2 = 0;
        Canvas canvas2 = canvas;
        if (this.f166886q != 2) {
            long a = m130581a(this.f166873d);
            if (this.f166873d <= this.f166882m) {
                if (this.f166870F) {
                    float f2 = (float) (this.f166892w - a);
                    long j3 = this.f166894y;
                    canvas2 = canvas2;
                    canvas2.drawLine(f2, (float) j3, 0.0f, (float) j3, this.f166874e);
                } else {
                    long j4 = this.f166894y;
                    canvas2 = canvas2;
                    canvas2.drawLine((float) a, (float) j4, (float) this.f166892w, (float) j4, this.f166874e);
                }
            }
            if (this.f166870F) {
                TimeSpeedModelExtension timeSpeedModelExtension = this.f166872c;
                if (timeSpeedModelExtension == null) {
                    if (a > 0) {
                        canvas2.save();
                        long j5 = this.f166892w;
                        canvas2.clipRect((float) (j5 - this.f166894y), 0.0f, (float) j5, (float) this.f166893x);
                        long j6 = this.f166892w;
                        long j7 = this.f166894y;
                        canvas2.drawCircle((float) (j6 - j7), (float) j7, (float) j7, this.f166875f);
                        canvas2.restore();
                        long j8 = this.f166892w;
                        long j9 = this.f166894y;
                        canvas2 = canvas2;
                        canvas2.drawRect((float) (j8 - j9), 0.0f, (float) Math.max(j9, j8 - a), (float) this.f166893x, this.f166875f);
                    }
                    if (this.f166873d > this.f166882m) {
                        canvas2.save();
                        canvas2.clipRect(0.0f, 0.0f, (float) this.f166894y, (float) this.f166893x);
                        long j10 = this.f166894y;
                        canvas2.drawCircle((float) j10, (float) j10, (float) j10, this.f166875f);
                        canvas2.restore();
                    }
                } else {
                    long a2 = m130581a((long) timeSpeedModelExtension.getDuration());
                    canvas2.save();
                    long j11 = this.f166892w;
                    canvas2.clipRect((float) (j11 - this.f166894y), 0.0f, (float) j11, (float) this.f166893x);
                    long j12 = this.f166892w;
                    long j13 = this.f166894y;
                    canvas2.drawCircle((float) (j12 - j13), (float) j13, (float) j13, this.f166878i);
                    canvas2.restore();
                    long j14 = this.f166892w;
                    canvas2.drawRect((float) (j14 - this.f166894y), 0.0f, (float) (j14 - a2), (float) this.f166893x, this.f166878i);
                    if (a > a2) {
                        long j15 = this.f166892w;
                        canvas2 = canvas2;
                        canvas2.drawRect((float) (j15 - a2), 0.0f, (float) Math.max(this.f166894y, j15 - a), (float) this.f166893x, this.f166879j);
                    }
                    if (this.f166873d > this.f166882m) {
                        canvas2.save();
                        canvas2.clipRect(0.0f, 0.0f, (float) this.f166894y, (float) this.f166893x);
                        long j16 = this.f166894y;
                        canvas2.drawCircle((float) j16, (float) j16, (float) j16, this.f166879j);
                        canvas2.restore();
                    }
                }
                TimeSpeedModelExtension timeSpeedModelExtension2 = this.f166872c;
                if (timeSpeedModelExtension2 != null) {
                    j = ((long) timeSpeedModelExtension2.getDuration()) + 0;
                    long a3 = (long) ((int) m130581a(j));
                    long j17 = this.f166892w;
                    if (a3 < j17) {
                        canvas2 = canvas2;
                        canvas2.drawRect((float) (j17 - a3), 0.0f, (float) ((j17 - a3) - ((long) f166864a)), (float) this.f166893x, this.f166877h);
                    }
                } else {
                    j = 0;
                }
                if (this.f166871b != null) {
                    for (int i = 0; i < this.f166871b.size(); i++) {
                        TimeSpeedModelExtension timeSpeedModelExtension3 = this.f166871b.get(i);
                        j += (long) TimeSpeedModelExtension.calculateRealTime(timeSpeedModelExtension3.getDuration(), timeSpeedModelExtension3.getSpeed());
                        long a4 = (long) ((int) m130581a(j));
                        long j18 = this.f166892w;
                        if (a4 < j18) {
                            canvas2 = canvas2;
                            canvas2.drawRect((float) (j18 - a4), 0.0f, (float) ((j18 - a4) - ((long) f166864a)), (float) this.f166893x, this.f166877h);
                        }
                    }
                    if (this.f166866B && m130583c()) {
                        long longVideoAnchorPosition = getLongVideoAnchorPosition();
                        long j19 = this.f166892w;
                        canvas2.drawRect((float) ((j19 - longVideoAnchorPosition) - 2), 0.0f, (float) ((j19 - longVideoAnchorPosition) + 2), (float) this.f166893x, this.f166877h);
                        canvas2.drawText(this.f166867C, (float) (((this.f166892w - longVideoAnchorPosition) - 2) - (this.f166865A / 2)), (getY() + ((float) (this.f166893x * 2))) - ((float) C70636dh.m124833c(getContext())), this.f166891v);
                        return;
                    }
                    return;
                }
                return;
            }
            TimeSpeedModelExtension timeSpeedModelExtension4 = this.f166872c;
            if (timeSpeedModelExtension4 == null) {
                if (a > 0) {
                    canvas2.save();
                    canvas2.clipRect(0.0f, 0.0f, (float) this.f166894y, (float) this.f166893x);
                    long j20 = this.f166894y;
                    canvas2.drawCircle((float) j20, (float) j20, (float) j20, this.f166875f);
                    canvas2.restore();
                    long j21 = this.f166894y;
                    canvas2 = canvas2;
                    canvas2.drawRect((float) j21, 0.0f, (float) Math.min(a, this.f166892w - j21), (float) this.f166893x, this.f166875f);
                }
                if (this.f166873d > this.f166882m) {
                    canvas2.save();
                    long j22 = this.f166892w;
                    canvas2.clipRect((float) (j22 - this.f166894y), 0.0f, (float) j22, (float) this.f166893x);
                    long j23 = this.f166892w;
                    long j24 = this.f166894y;
                    canvas2.drawCircle((float) (j23 - j24), (float) j24, (float) j24, this.f166875f);
                    canvas2.restore();
                }
            } else {
                long a5 = m130581a((long) timeSpeedModelExtension4.getDuration());
                canvas2.save();
                canvas2.clipRect(0.0f, 0.0f, (float) this.f166894y, (float) this.f166893x);
                long j25 = this.f166894y;
                canvas2.drawCircle((float) j25, (float) j25, (float) j25, this.f166878i);
                canvas2.restore();
                float f3 = (float) a5;
                canvas2 = canvas2;
                canvas2.drawRect((float) this.f166894y, 0.0f, f3, (float) this.f166893x, this.f166878i);
                if (a > a5) {
                    canvas2.drawRect(f3, 0.0f, (float) Math.min(a, this.f166892w - this.f166894y), (float) this.f166893x, this.f166879j);
                }
                if (this.f166873d > this.f166882m) {
                    canvas2.save();
                    long j26 = this.f166892w;
                    canvas2.clipRect((float) (j26 - this.f166894y), 0.0f, (float) j26, (float) this.f166893x);
                    long j27 = this.f166892w;
                    long j28 = this.f166894y;
                    canvas2.drawCircle((float) (j27 - j28), (float) j28, (float) j28, this.f166879j);
                    canvas2.restore();
                }
            }
            mo116744b(canvas2);
        } else if (this.f166870F) {
            float a6 = m130580a(this.f166887r);
            int i2 = 0;
            float f4 = 0.0f;
            while (i2 < this.f166887r.size()) {
                int i3 = (int) (((float) this.f166887r.get(i2).f190800c) * a6);
                if (i2 == this.f166888s) {
                    this.f166874e.setStrokeCap(Paint.Cap.BUTT);
                    long j29 = this.f166892w;
                    float f5 = (float) i3;
                    long j30 = this.f166894y;
                    canvas2.drawLine((((float) j29) - f4) - f5, (float) j30, ((float) j29) - f4, (float) j30, this.f166874e);
                    if (this.f166890u != null) {
                        long j31 = this.f166889t;
                        if (j31 >= j2) {
                            float f6 = f4 + f5;
                            float f7 = a6 * 1000.0f;
                            if (j31 > j2) {
                                float f8 = (((float) j31) * f7) + f4;
                                float min = Math.min(f8, f6);
                                int i4 = this.f166888s;
                                if (i4 == 0) {
                                    canvas2.save();
                                    long j32 = this.f166892w;
                                    canvas2.clipRect((float) (j32 - this.f166894y), 0.0f, (float) j32, (float) this.f166893x);
                                    long j33 = this.f166892w;
                                    long j34 = this.f166894y;
                                    canvas2.drawCircle((float) (j33 - j34), (float) j34, (float) j34, this.f166875f);
                                    canvas2.restore();
                                    f = ((float) this.f166894y) + f4;
                                } else {
                                    if (f8 >= f6 && i4 == this.f166887r.size() - 1) {
                                        canvas2.save();
                                        canvas2.clipRect(0.0f, 0.0f, (float) this.f166894y, (float) this.f166893x);
                                        long j35 = this.f166894y;
                                        canvas2.drawCircle((float) j35, (float) j35, (float) j35, this.f166875f);
                                        canvas2.restore();
                                        min = f6 - ((float) this.f166894y);
                                    }
                                    f = f4;
                                }
                                long j36 = this.f166892w;
                                canvas2.drawRect(((float) j36) - f, 0.0f, ((float) j36) - min, (float) this.f166893x, this.f166875f);
                            }
                            if (this.f166890u != null) {
                                float f9 = f4;
                                for (int i5 = 0; i5 < this.f166890u.size(); i5++) {
                                    TimeSpeedModelExtension timeSpeedModelExtension5 = this.f166890u.get(i5);
                                    f9 += ((float) ((long) TimeSpeedModelExtension.calculateRealTime(timeSpeedModelExtension5.getDuration(), timeSpeedModelExtension5.getSpeed()))) * f7;
                                    if (this.f166888s != this.f166887r.size() - 1 || f9 < f6) {
                                        float min2 = Math.min(f9, f6);
                                        long j37 = this.f166892w;
                                        canvas2.drawRect(((float) j37) - (min2 - ((float) f166864a)), 0.0f, ((float) j37) - min2, (float) this.f166893x, this.f166877h);
                                    }
                                }
                            }
                        }
                    }
                    if (this.f166885p) {
                        this.f166881l.setAlpha((int) (this.f166884o * 255.0f));
                        long j38 = this.f166892w;
                        canvas2.drawRect((((float) j38) - f4) - f5, 0.0f, ((float) j38) - f4, (float) this.f166893x, this.f166881l);
                    }
                    f4 += f5;
                } else {
                    if (i2 == 0) {
                        canvas2.save();
                        long j39 = this.f166892w;
                        canvas2.clipRect((float) (j39 - this.f166894y), 0.0f, (float) j39, (float) this.f166893x);
                        long j40 = this.f166892w;
                        long j41 = this.f166894y;
                        canvas2.drawCircle((float) (j40 - j41), (float) j41, (float) j41, this.f166876g);
                        canvas2.restore();
                        long j42 = this.f166892w;
                        long j43 = this.f166894y;
                        canvas2.drawRect((float) (j42 - j43), 0.0f, (float) Math.max(j43, j42 - ((long) i3)), (float) this.f166893x, this.f166876g);
                    } else if (i2 == this.f166887r.size() - 1) {
                        canvas2.save();
                        canvas2.clipRect(0.0f, 0.0f, (float) this.f166894y, (float) this.f166893x);
                        long j44 = this.f166894y;
                        canvas2.drawCircle((float) j44, (float) j44, (float) j44, this.f166876g);
                        canvas2.restore();
                        canvas2.drawRect(((float) this.f166892w) - f4, 0.0f, (float) this.f166894y, (float) this.f166893x, this.f166876g);
                    } else {
                        long j45 = this.f166892w;
                        canvas2.drawRect(((float) j45) - f4, 0.0f, (((float) j45) - f4) - ((float) i3), (float) this.f166893x, this.f166876g);
                    }
                    f4 += (float) i3;
                    if (i2 == this.f166888s - 1) {
                        this.f166880k.setAlpha((int) (this.f166883n * 255.0f));
                        long j46 = this.f166892w;
                        canvas2 = canvas2;
                        canvas2.drawRect(((float) j46) - (f4 - ((float) f166864a)), 0.0f, ((float) j46) - f4, (float) this.f166893x, this.f166880k);
                    } else if (i2 != this.f166887r.size() - 1) {
                        long j47 = this.f166892w;
                        canvas2 = canvas2;
                        canvas2.drawRect(((float) j47) - (f4 - ((float) f166864a)), 0.0f, ((float) j47) - f4, (float) this.f166893x, this.f166877h);
                    }
                }
                i2++;
                j2 = 0;
            }
        } else {
            mo116743a(canvas2);
        }
    }

    public ProgressSegmentView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: b */
    public final void mo116789b(List<TimeSpeedModelExtension> list, long j) {
        this.f166890u = list;
        this.f166889t = j;
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        MethodCollector.m26663i(9551);
        super.onMeasure(i, i2);
        this.f166892w = (long) getMeasuredWidth();
        long measuredHeight = (long) (getMeasuredHeight() / 3);
        this.f166893x = measuredHeight;
        this.f166894y = measuredHeight >> 1;
        MethodCollector.m26664o(9551);
    }

    /* renamed from: a */
    public final void mo116785a(List<TimeSpeedModelExtension> list, long j) {
        this.f166871b = list;
        TimeSpeedModelExtension timeSpeedModelExtension = this.f166872c;
        if (timeSpeedModelExtension != null) {
            this.f166873d = j + ((long) timeSpeedModelExtension.getDuration());
        } else {
            this.f166873d = j;
        }
        this.f166886q = 1;
        postInvalidate();
    }

    /* renamed from: a */
    public final void mo116786a(List<TimeSpeedModelExtension> list, long j, TimeSpeedModelExtension timeSpeedModelExtension) {
        this.f166872c = timeSpeedModelExtension;
        mo116785a(list, j);
    }

    public ProgressSegmentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(9546);
        this.f166895z = 15000;
        this.f166882m = 15000;
        this.f166866B = true;
        this.f166867C = "15s";
        this.f166886q = 1;
        setWillNotDraw(false);
        if (C78099c.m136517a(context)) {
            this.f166870F = true;
        }
        Paint paint = new Paint(1);
        this.f166874e = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f166874e.setStrokeCap(Paint.Cap.ROUND);
        this.f166874e.setStrokeWidth(C13628n.m24520b(context, 6.0f));
        this.f166874e.setColor(C0643b.m2378c(getContext(), R.color.n1));
        Paint paint2 = new Paint(1);
        this.f166876g = paint2;
        paint2.setColor(C0643b.m2378c(getContext(), R.color.bm));
        this.f166876g.setAlpha(86);
        Paint paint3 = new Paint(1);
        this.f166875f = paint3;
        paint3.setColor(C0643b.m2378c(getContext(), R.color.bm));
        Paint paint4 = new Paint(1);
        this.f166878i = paint4;
        paint4.setColor(C0643b.m2378c(getContext(), R.color.bh));
        Paint paint5 = new Paint(1);
        this.f166879j = paint5;
        paint5.setColor(C0643b.m2378c(getContext(), R.color.bm));
        Paint paint6 = new Paint(1);
        this.f166877h = paint6;
        paint6.setStyle(Paint.Style.FILL);
        this.f166877h.setColor(C0643b.m2378c(getContext(), R.color.l));
        Paint paint7 = new Paint(1);
        this.f166880k = paint7;
        paint7.setStyle(Paint.Style.FILL);
        this.f166880k.setColor(C0643b.m2378c(getContext(), R.color.l));
        Paint paint8 = new Paint(1);
        this.f166881l = paint8;
        paint8.setStyle(Paint.Style.FILL);
        this.f166881l.setColor(C0643b.m2378c(getContext(), R.color.l));
        Paint paint9 = new Paint(1);
        this.f166891v = paint9;
        paint9.setStyle(Paint.Style.FILL);
        this.f166891v.setColor(C0643b.m2378c(getContext(), R.color.l));
        this.f166891v.setTextSize(C13628n.m24503a(getContext(), 12.0f));
        this.f166891v.setShadowLayer(4.0f, 0.0f, 2.0f, C0643b.m2378c(getContext(), R.color.bl));
        Typeface a = C17301b.m32033a().mo27611a(C17303d.f41573g);
        if (a != null) {
            this.f166891v.setTypeface(a);
        }
        this.f166865A = (long) this.f166891v.measureText(this.f166867C);
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(350L);
        this.f166868D = duration;
        duration.setRepeatCount(-1);
        this.f166868D.setRepeatMode(2);
        this.f166868D.addUpdateListener(new C74284g(this));
        ValueAnimator duration2 = ValueAnimator.ofFloat(0.0f, 1.0f, 0.0f).setDuration(700L);
        this.f166869E = duration2;
        duration2.addUpdateListener(new C74285h(this));
        MethodCollector.m26664o(9546);
    }
}
