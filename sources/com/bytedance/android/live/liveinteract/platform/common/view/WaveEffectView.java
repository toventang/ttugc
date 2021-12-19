package com.bytedance.android.live.liveinteract.platform.common.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WaveEffectView extends View {

    /* renamed from: a */
    public float f14576a;

    /* renamed from: b */
    public float f14577b;

    /* renamed from: c */
    public long f14578c;

    /* renamed from: d */
    public long f14579d;

    /* renamed from: e */
    public float f14580e;

    /* renamed from: f */
    public float f14581f;

    /* renamed from: g */
    public boolean f14582g;

    /* renamed from: h */
    long f14583h;

    /* renamed from: i */
    List<C5751a> f14584i;

    /* renamed from: j */
    public Interpolator f14585j;

    /* renamed from: k */
    public Runnable f14586k;

    /* renamed from: l */
    private Paint f14587l;

    /* renamed from: m */
    private int f14588m;

    /* renamed from: n */
    private ValueAnimator f14589n;

    static {
        Covode.recordClassIndex(6347);
    }

    /* renamed from: d */
    private void m12617d() {
        ValueAnimator valueAnimator = this.f14589n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo11491b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.platform.common.view.WaveEffectView$a */
    public class C5751a {

        /* renamed from: b */
        private long f14593b = System.currentTimeMillis();

        static {
            Covode.recordClassIndex(6350);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final float mo11499a() {
            return (((float) (System.currentTimeMillis() - this.f14593b)) * 1.0f) / ((float) WaveEffectView.this.f14578c);
        }

        C5751a() {
        }
    }

    /* renamed from: a */
    public final void mo11490a() {
        if (!this.f14582g) {
            this.f14582g = true;
            m12616c();
            post(this.f14586k);
        }
    }

    /* renamed from: b */
    public final void mo11491b() {
        if (this.f14582g) {
            this.f14582g = false;
            m12617d();
            this.f14584i.clear();
            removeCallbacks(this.f14586k);
        }
    }

    /* renamed from: c */
    private void m12616c() {
        if (this.f14589n == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 10.0f);
            this.f14589n = ofFloat;
            ofFloat.setDuration(this.f14578c);
            this.f14589n.setInterpolator(new LinearInterpolator());
            this.f14589n.setRepeatCount(-1);
            this.f14589n.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                /* class com.bytedance.android.live.liveinteract.platform.common.view.WaveEffectView.C57502 */

                static {
                    Covode.recordClassIndex(6349);
                }

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    WaveEffectView.this.invalidate();
                }
            });
        }
        if (!this.f14589n.isStarted()) {
            this.f14589n.start();
        }
    }

    public void setInterpolator(Interpolator interpolator) {
        this.f14585j = interpolator;
    }

    public void setWaveColor(int i) {
        this.f14588m = i;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        MethodCollector.m26663i(4582);
        super.onDraw(canvas);
        Iterator<C5751a> it = this.f14584i.iterator();
        while (it.hasNext()) {
            C5751a next = it.next();
            if (next.mo11499a() >= 1.0f) {
                it.remove();
            } else {
                this.f14587l.setAlpha((int) ((WaveEffectView.this.f14580e + (WaveEffectView.this.f14585j.getInterpolation(next.mo11499a()) * (WaveEffectView.this.f14581f - WaveEffectView.this.f14580e))) * 255.0f));
                canvas.drawCircle(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, WaveEffectView.this.f14576a + (WaveEffectView.this.f14585j.getInterpolation(next.mo11499a()) * (WaveEffectView.this.f14577b - WaveEffectView.this.f14576a)), this.f14587l);
            }
        }
        MethodCollector.m26664o(4582);
    }

    public WaveEffectView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private WaveEffectView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, -1);
        MethodCollector.m26663i(4478);
        this.f14578c = InteractFirstFrameTimeOutDurationSetting.DEFAULT;
        this.f14579d = 500;
        this.f14580e = 1.0f;
        this.f14584i = new ArrayList();
        this.f14585j = new LinearInterpolator();
        this.f14586k = new Runnable() {
            /* class com.bytedance.android.live.liveinteract.platform.common.view.WaveEffectView.RunnableC57491 */

            static {
                Covode.recordClassIndex(6348);
            }

            public final void run() {
                if (WaveEffectView.this.f14582g) {
                    WaveEffectView waveEffectView = WaveEffectView.this;
                    long currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis - waveEffectView.f14583h >= waveEffectView.f14579d) {
                        waveEffectView.f14584i.add(new C5751a());
                        waveEffectView.invalidate();
                        waveEffectView.f14583h = currentTimeMillis;
                    }
                    WaveEffectView waveEffectView2 = WaveEffectView.this;
                    waveEffectView2.postDelayed(waveEffectView2.f14586k, WaveEffectView.this.f14579d);
                }
            }
        };
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.at5, R.attr.at6, R.attr.at7, R.attr.at8, R.attr.at9, R.attr.at_, R.attr.ata}, -1, 0);
        this.f14588m = obtainStyledAttributes.getColor(0, -7829368);
        this.f14576a = obtainStyledAttributes.getDimension(3, 0.0f);
        this.f14577b = obtainStyledAttributes.getDimension(5, -1.0f);
        this.f14578c = (long) obtainStyledAttributes.getInt(1, LiveNetAdaptiveHurryTimeSetting.DEFAULT);
        this.f14579d = (long) obtainStyledAttributes.getInt(4, 500);
        this.f14580e = obtainStyledAttributes.getFloat(6, 1.0f);
        this.f14581f = obtainStyledAttributes.getFloat(2, 0.0f);
        obtainStyledAttributes.recycle();
        Paint paint = new Paint(1);
        this.f14587l = paint;
        paint.setColor(this.f14588m);
        MethodCollector.m26664o(4478);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int min = Math.min(i, i2) / 2;
        float f = this.f14577b;
        if (f == -1.0f || f > ((float) min)) {
            this.f14577b = (float) min;
        }
        if (this.f14576a > ((float) min)) {
            this.f14576a = this.f14577b / 2.0f;
        }
    }
}
