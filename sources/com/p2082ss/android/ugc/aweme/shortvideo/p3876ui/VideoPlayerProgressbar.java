package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.ProgressBar;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.VideoPlayerProgressbar */
public class VideoPlayerProgressbar extends ProgressBar {

    /* renamed from: a */
    public int f164756a;

    /* renamed from: b */
    public boolean f164757b;

    /* renamed from: c */
    public Runnable f164758c;

    /* renamed from: d */
    private Paint f164759d;

    /* renamed from: e */
    private float f164760e;

    /* renamed from: f */
    private int f164761f;

    /* renamed from: g */
    private int f164762g;

    /* renamed from: h */
    private boolean f164763h;

    /* renamed from: i */
    private boolean f164764i;

    /* renamed from: j */
    private int f164765j;

    /* renamed from: k */
    private long f164766k;

    static {
        Covode.recordClassIndex(86075);
    }

    private long getProgressbarThreshold() {
        return this.f164766k;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f164758c);
    }

    public ObjectAnimator getHideAnim() {
        return ObjectAnimator.ofFloat(this, "alpha", getAlpha(), 0.0f).setDuration(0L);
    }

    public ObjectAnimator getShowAnim() {
        return ObjectAnimator.ofFloat(this, "alpha", getAlpha(), 1.0f).setDuration(150L);
    }

    public void setProgressbarThreshold(long j) {
        this.f164766k = j;
    }

    public void setReachedBarColor(int i) {
        this.f164762g = i;
    }

    public void setReachedProgressBarHeight(float f) {
        this.f164760e = f;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        canvas.save();
        float progress = (float) ((int) (((float) this.f164761f) * ((((float) getProgress()) * 1.0f) / ((float) getMax()))));
        if (progress > 0.0f) {
            this.f164759d.setColor(this.f164762g);
            this.f164759d.setStrokeWidth(this.f164760e);
            canvas.drawLine(0.0f, (float) (getHeight() / 2), progress, (float) (getHeight() / 2), this.f164759d);
        }
        canvas.restore();
    }

    public VideoPlayerProgressbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824) {
            int paddingTop = (int) (((float) (getPaddingTop() + getPaddingBottom())) + Math.max(this.f164760e, Math.abs(this.f164759d.descent() - this.f164759d.ascent())));
            if (mode == Integer.MIN_VALUE) {
                size2 = Math.min(paddingTop, size2);
            } else {
                size2 = paddingTop;
            }
        }
        setMeasuredDimension(size, size2);
        this.f164761f = (getMeasuredWidth() - getPaddingRight()) - getPaddingLeft();
    }

    private VideoPlayerProgressbar(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(4352);
        this.f164759d = new Paint();
        this.f164760e = (float) ((int) TypedValue.applyDimension(1, 6.0f, getResources().getDisplayMetrics()));
        this.f164763h = true;
        this.f164764i = true;
        this.f164765j = 0;
        this.f164766k = AVExternalServiceImpl.m113114a().configService().avsettingsConfig().progressBarThreshold();
        this.f164758c = new Runnable() {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.VideoPlayerProgressbar.RunnableC733431 */

            static {
                Covode.recordClassIndex(86076);
            }

            public final void run() {
                if (!VideoPlayerProgressbar.this.f164757b) {
                    VideoPlayerProgressbar.this.incrementProgressBy(50);
                    VideoPlayerProgressbar videoPlayerProgressbar = VideoPlayerProgressbar.this;
                    videoPlayerProgressbar.f164756a = videoPlayerProgressbar.getProgress();
                    if (VideoPlayerProgressbar.this.getMax() < VideoPlayerProgressbar.this.f164756a) {
                        VideoPlayerProgressbar videoPlayerProgressbar2 = VideoPlayerProgressbar.this;
                        videoPlayerProgressbar2.removeCallbacks(videoPlayerProgressbar2.f164758c);
                        return;
                    }
                    long uptimeMillis = SystemClock.uptimeMillis();
                    long j = uptimeMillis + (50 - (uptimeMillis % 50));
                    VideoPlayerProgressbar videoPlayerProgressbar3 = VideoPlayerProgressbar.this;
                    if (videoPlayerProgressbar3.getHandler() != null) {
                        videoPlayerProgressbar3.getHandler().postAtTime(videoPlayerProgressbar3.f164758c, j);
                    }
                }
            }
        };
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.a9h, R.attr.a9i});
        this.f164762g = obtainStyledAttributes.getColor(0, -261935);
        this.f164760e = obtainStyledAttributes.getDimension(1, this.f164760e);
        obtainStyledAttributes.recycle();
        MethodCollector.m26664o(4352);
    }
}
