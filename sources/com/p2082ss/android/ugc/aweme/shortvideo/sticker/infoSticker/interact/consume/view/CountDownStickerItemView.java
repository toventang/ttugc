package com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import androidx.core.content.C0643b;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17301b;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.CountDownStickerItemView */
public final class CountDownStickerItemView extends View implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final ObjectAnimator f163670a;

    /* renamed from: b */
    private int f163671b;

    /* renamed from: c */
    private int f163672c;

    /* renamed from: d */
    private int f163673d = 1;

    /* renamed from: e */
    private int f163674e = 1;

    /* renamed from: f */
    private float f163675f = 1.0f;

    /* renamed from: g */
    private float f163676g;

    /* renamed from: h */
    private float f163677h;

    /* renamed from: i */
    private float f163678i = 71.0f;

    /* renamed from: j */
    private Paint f163679j = new Paint();

    /* renamed from: k */
    private boolean f163680k = true;

    static {
        Covode.recordClassIndex(85642);
    }

    public final float getAnimProgress() {
        return this.f163675f;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.CountDownStickerItemView$a */
    static final class RunnableC72943a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CountDownStickerItemView f163682a;

        static {
            Covode.recordClassIndex(85644);
        }

        RunnableC72943a(CountDownStickerItemView countDownStickerItemView) {
            this.f163682a = countDownStickerItemView;
        }

        public final void run() {
            this.f163682a.f163670a.start();
        }
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        invalidate();
    }

    public final void setAnimProgress(float f) {
        this.f163675f = f;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x00cb, code lost:
        if (r10 != null) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0151, code lost:
        if (r10 != null) goto L_0x0126;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDraw(android.graphics.Canvas r10) {
        /*
        // Method dump skipped, instructions count: 416
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.CountDownStickerItemView.onDraw(android.graphics.Canvas):void");
    }

    /* renamed from: a */
    public final void mo115334a(int i, int i2) {
        if (i == this.f163673d && i2 == this.f163674e) {
            if (i != this.f163671b || i2 != this.f163672c) {
                this.f163671b = i;
                this.f163672c = i2;
            } else {
                return;
            }
        } else if (this.f163680k) {
            this.f163673d = i;
            this.f163671b = i;
            this.f163674e = i2;
            this.f163672c = i2;
            this.f163680k = false;
        } else {
            this.f163673d = this.f163671b;
            this.f163671b = i;
            this.f163674e = this.f163672c;
            this.f163672c = i2;
        }
        post(new RunnableC72943a(this));
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        MethodCollector.m26663i(7264);
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            if (mode2 == Integer.MIN_VALUE) {
                setMeasuredDimension((int) (this.f163679j.measureText("0") * 2.0f), (int) (this.f163679j.getFontMetrics().bottom - this.f163679j.getFontMetrics().top));
                MethodCollector.m26664o(7264);
                return;
            }
        } else if (mode != Integer.MIN_VALUE) {
            if (mode2 == Integer.MIN_VALUE) {
                setMeasuredDimension(size, (int) (this.f163679j.measureText("0") * 2.0f));
            }
            MethodCollector.m26664o(7264);
            return;
        }
        setMeasuredDimension((int) (this.f163679j.measureText("0") * 2.0f), size2);
        MethodCollector.m26664o(7264);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CountDownStickerItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(7409);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "animProgress", 0.0f, 1.0f);
        ofFloat.setDuration(500L);
        ofFloat.setInterpolator(new AccelerateInterpolator());
        C89219l.m154716b(ofFloat, "");
        this.f163670a = ofFloat;
        float b = C13628n.m24520b(getContext(), 37.0f);
        this.f163678i = b;
        this.f163679j.setTextSize(b);
        this.f163679j.setColor(-1);
        this.f163679j.setTextAlign(Paint.Align.LEFT);
        this.f163679j.setTypeface(C17301b.m32033a().mo27611a("bold"));
        this.f163679j.setShadowLayer(2.0f, -0.5f, 0.5f, C0643b.m2378c(getContext(), R.color.bl));
        this.f163679j.setAntiAlias(true);
        this.f163679j.setTextAlign(Paint.Align.CENTER);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.CountDownStickerItemView.C729421 */

            /* renamed from: a */
            final /* synthetic */ CountDownStickerItemView f163681a;

            static {
                Covode.recordClassIndex(85643);
            }

            {
                this.f163681a = r1;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f163681a.invalidate();
            }
        });
        this.f163676g = this.f163679j.measureText("0") * 0.5f;
        this.f163677h = this.f163679j.measureText("0") * 1.5f;
        MethodCollector.m26664o(7409);
    }
}
