package com.bytedance.ies.uikit.progressview;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AnimationUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;

public class CircleProgress extends View {
    private int[] COLORS;
    private final double DEGREE = 0.017453292519943295d;
    private C18275a[] mArcPoint;
    private Point mCenter = new Point();
    private long mDuration = 3600;
    private TimeInterpolator mInterpolator = new C18276b();
    private Paint mPaint;
    private long mPlayTime;
    private int mPointRadius;
    private boolean mStartAnim = false;
    private long mStartTime;
    private int mViewSize;

    static {
        Covode.recordClassIndex(20935);
    }

    public void stopAnim() {
        this.mStartAnim = false;
    }

    /* renamed from: com.bytedance.ies.uikit.progressview.CircleProgress$b */
    static class C18276b implements TimeInterpolator {
        static {
            Covode.recordClassIndex(20937);
        }

        public final float getInterpolation(float f) {
            float f2 = f * 2.0f;
            if (f2 < 1.0f) {
                return 0.5f * f2 * f2 * f2;
            }
            float f3 = f2 - 2.0f;
            return (0.5f * f3 * f3 * f3) + 1.0f;
        }

        C18276b() {
        }
    }

    public void reset() {
        stopAnim();
        this.mPlayTime = 0;
        postInvalidate();
    }

    private float getFactor() {
        if (this.mStartAnim) {
            this.mPlayTime = AnimationUtils.currentAnimationTimeMillis() - this.mStartTime;
        }
        return (((float) this.mPlayTime) / ((float) this.mDuration)) % 5.0f;
    }

    public void startAnim() {
        this.mPlayTime %= this.mDuration;
        this.mStartTime = AnimationUtils.currentAnimationTimeMillis();
        this.mStartAnim = true;
        postInvalidate();
    }

    public void setDuration(long j) {
        this.mDuration = j;
    }

    public void setInterpolator(TimeInterpolator timeInterpolator) {
        this.mInterpolator = timeInterpolator;
    }

    public void setRadius(float f) {
        stopAnim();
        calPoints(f);
        startAnim();
    }

    public CircleProgress(Context context) {
        super(context);
        MethodCollector.m26663i(12497);
        init(null, 0);
        MethodCollector.m26664o(12497);
    }

    private void calPoints(float f) {
        int i = (int) (((float) (this.mViewSize / 3)) * f);
        this.mPointRadius = i / 6;
        int i2 = 0;
        do {
            float f2 = (float) i;
            double d = (double) i2;
            Double.isNaN(d);
            double d2 = d * 0.7853981633974483d;
            this.mArcPoint[i2] = new C18275a((-((float) Math.sin(d2))) * f2, f2 * (-((float) Math.cos(d2))), this.COLORS[i2 % 3]);
            i2++;
        } while (i2 < 8);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        canvas.save();
        canvas.translate((float) this.mCenter.x, (float) this.mCenter.y);
        float factor = getFactor();
        canvas.rotate(36.0f * factor);
        int i = 0;
        do {
            this.mPaint.setColor(this.mArcPoint[i].f43623c);
            float itemFactor = getItemFactor(i, factor);
            canvas.drawCircle(this.mArcPoint[i].f43621a - ((this.mArcPoint[i].f43621a * 2.0f) * itemFactor), this.mArcPoint[i].f43622b - ((this.mArcPoint[i].f43622b * 2.0f) * itemFactor), (float) this.mPointRadius, this.mPaint);
            i++;
        } while (i < 8);
        canvas.restore();
        if (this.mStartAnim) {
            postInvalidate();
        }
    }

    private float getItemFactor(int i, float f) {
        float f2 = (f - (((float) i) * 0.0825f)) * 3.0f;
        if (f2 < 0.0f) {
            f2 = 0.0f;
        } else if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        return this.mInterpolator.getInterpolation(f2);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.gt);
        int min = Math.min(getDefaultSize(dimensionPixelSize, i), getDefaultSize(dimensionPixelSize, i2));
        this.mViewSize = min;
        setMeasuredDimension(min, min);
        Point point = this.mCenter;
        int i3 = this.mViewSize;
        point.set(i3 / 2, i3 / 2);
        calPoints(1.0f);
    }

    public CircleProgress(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(12498);
        init(attributeSet, 0);
        MethodCollector.m26664o(12498);
    }

    private void init(AttributeSet attributeSet, int i) {
        this.mArcPoint = new C18275a[8];
        Paint paint = new Paint();
        this.mPaint = paint;
        paint.setAntiAlias(true);
        this.mPaint.setStyle(Paint.Style.FILL);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.o_, R.attr.oa, R.attr.ob}, i, 0);
        int color = obtainStyledAttributes.getColor(0, -1759188);
        int color2 = obtainStyledAttributes.getColor(1, -14708582);
        int color3 = obtainStyledAttributes.getColor(2, -221678);
        obtainStyledAttributes.recycle();
        this.COLORS = new int[]{color, color2, color3};
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.uikit.progressview.CircleProgress$a */
    public static class C18275a {

        /* renamed from: a */
        float f43621a;

        /* renamed from: b */
        float f43622b;

        /* renamed from: c */
        int f43623c;

        static {
            Covode.recordClassIndex(20936);
        }

        C18275a(float f, float f2, int i) {
            this.f43621a = f;
            this.f43622b = f2;
            this.f43623c = i;
        }
    }

    public CircleProgress(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        MethodCollector.m26663i(12499);
        init(attributeSet, i);
        MethodCollector.m26664o(12499);
    }
}
