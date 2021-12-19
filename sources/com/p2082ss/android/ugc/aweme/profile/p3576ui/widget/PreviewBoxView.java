package com.p2082ss.android.ugc.aweme.profile.p3576ui.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.FloatEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.content.C0643b;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.PreviewBoxView */
public class PreviewBoxView extends View {

    /* renamed from: a */
    public boolean f145834a;

    /* renamed from: b */
    public ValueAnimator f145835b;

    /* renamed from: c */
    public int f145836c;

    /* renamed from: d */
    public int f145837d;

    /* renamed from: e */
    public float f145838e = 0.5625f;

    /* renamed from: f */
    public float f145839f;

    /* renamed from: g */
    public AbstractC64340a f145840g;

    /* renamed from: h */
    private Paint f145841h;

    /* renamed from: i */
    private RectF f145842i;

    /* renamed from: j */
    private Bitmap f145843j;

    /* renamed from: k */
    private Context f145844k;

    /* renamed from: l */
    private int f145845l = -1;

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.PreviewBoxView$a */
    public interface AbstractC64340a {
        static {
            Covode.recordClassIndex(75791);
        }
    }

    static {
        Covode.recordClassIndex(75788);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public Rect getVisibleRect() {
        Rect rect = new Rect();
        rect.set((int) this.f145842i.left, (int) this.f145842i.top, (int) this.f145842i.right, (int) this.f145842i.bottom);
        return rect;
    }

    /* renamed from: a */
    public final void mo103877a() {
        if (Math.abs(this.f145839f - 0.85f) >= Float.MIN_NORMAL && !this.f145834a) {
            this.f145834a = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.5f, 0.85f);
            this.f145835b = ofFloat;
            ofFloat.setEvaluator(new FloatEvaluator());
            this.f145835b.setDuration(300L);
            this.f145835b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                /* class com.p2082ss.android.ugc.aweme.profile.p3576ui.widget.PreviewBoxView.C643381 */

                static {
                    Covode.recordClassIndex(75789);
                }

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    PreviewBoxView.this.f145839f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    PreviewBoxView previewBoxView = PreviewBoxView.this;
                    previewBoxView.setAlpha(previewBoxView.f145839f);
                    if (PreviewBoxView.this.f145840g != null) {
                        valueAnimator.getAnimatedFraction();
                    }
                }
            });
            this.f145835b.addListener(new AnimatorListenerAdapter() {
                /* class com.p2082ss.android.ugc.aweme.profile.p3576ui.widget.PreviewBoxView.C643392 */

                static {
                    Covode.recordClassIndex(75790);
                }

                public final void onAnimationEnd(Animator animator) {
                    PreviewBoxView.this.f145839f = 0.85f;
                    PreviewBoxView.this.f145834a = false;
                }
            });
            this.f145835b.setStartDelay(300);
            this.f145835b.start();
        }
    }

    public void setTopOffset(int i) {
        this.f145845l = i;
    }

    public void onDraw(Canvas canvas) {
        int parseColor;
        boolean z;
        MethodCollector.m26663i(7478);
        if (this.f145842i == null) {
            MethodCollector.m26664o(7478);
            return;
        }
        if (this.f145843j == null) {
            int width = getWidth();
            int height = getHeight();
            RectF rectF = this.f145842i;
            Context context = this.f145844k;
            if (context != null) {
                parseColor = C0643b.m2378c(context, R.color.bk);
            } else {
                parseColor = Color.parseColor("#d9161823");
            }
            if (this.f145837d == 1) {
                z = true;
            } else {
                z = false;
            }
            Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_4444);
            Canvas canvas2 = new Canvas(createBitmap);
            canvas2.drawColor(parseColor);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            if (z) {
                canvas2.drawOval(rectF, paint);
            } else {
                canvas2.drawRect(rectF, paint);
            }
            this.f145843j = createBitmap;
        }
        canvas.drawBitmap(this.f145843j, 0.0f, 0.0f, this.f145841h);
        MethodCollector.m26664o(7478);
    }

    public PreviewBoxView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(7476);
        this.f145844k = context;
        Paint paint = new Paint();
        this.f145841h = paint;
        paint.setAntiAlias(true);
        this.f145836c = (int) C13628n.m24520b(context, 16.0f);
        this.f145839f = 0.5f;
        setAlpha(0.5f);
        MethodCollector.m26664o(7476);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int width = getWidth() - (this.f145836c * 2);
        int i5 = (int) (((float) width) * this.f145838e);
        int i6 = this.f145845l;
        if (i6 < 0) {
            i6 = Math.max(0, (getHeight() - i5) / 2);
        }
        int i7 = this.f145836c;
        this.f145842i = new RectF((float) i7, (float) i6, (float) (i7 + width), (float) (i6 + i5));
    }
}
