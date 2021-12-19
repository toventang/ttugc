package com.p2082ss.android.ugc.aweme.infoSticker.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.infoSticker.customsticker.helper.Coordinate;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.shortvideo.C71812ep;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.infoSticker.widget.AnimationPathView */
public final class AnimationPathView extends View {

    /* renamed from: a */
    public static final C56729a f129279a = new C56729a((byte) 0);

    /* renamed from: b */
    private final ArrayList<Path> f129280b;

    /* renamed from: c */
    private final ArrayList<Path> f129281c;

    /* renamed from: d */
    private final ArrayList<PathMeasure> f129282d;

    /* renamed from: e */
    private final Paint f129283e;

    /* renamed from: f */
    private float f129284f;

    /* renamed from: g */
    private float f129285g;

    /* renamed from: h */
    private AbstractC56730b f129286h;

    /* renamed from: i */
    private List<? extends List<Coordinate>> f129287i;

    /* renamed from: j */
    private boolean f129288j;

    /* renamed from: k */
    private ValueAnimator f129289k;

    /* renamed from: l */
    private int f129290l;

    /* renamed from: m */
    private float f129291m;

    /* renamed from: n */
    private boolean f129292n;

    /* renamed from: com.ss.android.ugc.aweme.infoSticker.widget.AnimationPathView$b */
    public interface AbstractC56730b {
        static {
            Covode.recordClassIndex(66591);
        }

        /* renamed from: a */
        void mo93575a();
    }

    static {
        Covode.recordClassIndex(66587);
    }

    public AnimationPathView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: com.ss.android.ugc.aweme.infoSticker.widget.AnimationPathView$a */
    public static final class C56729a {
        static {
            Covode.recordClassIndex(66590);
        }

        private C56729a() {
        }

        public /* synthetic */ C56729a(byte b) {
            this();
        }
    }

    public final ValueAnimator getAnimator() {
        return this.f129289k;
    }

    public final AbstractC56730b getCompleteListener() {
        return this.f129286h;
    }

    public final boolean getDynamicLength() {
        return this.f129292n;
    }

    public final float getLength() {
        return this.f129284f;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends java.util.List<com.ss.android.ugc.aweme.infoSticker.customsticker.helper.Coordinate>>, java.util.List<java.util.List<com.ss.android.ugc.aweme.infoSticker.customsticker.helper.Coordinate>> */
    public final List<List<Coordinate>> getPoints() {
        return this.f129287i;
    }

    public final float getRatio() {
        return this.f129291m;
    }

    public final int getRepeatCount() {
        return this.f129290l;
    }

    public final boolean getShowAnimation() {
        return this.f129288j;
    }

    public final float getValue() {
        return this.f129285g;
    }

    /* renamed from: a */
    public final boolean mo93676a() {
        if (this.f129289k.isRunning() || this.f129289k.isStarted()) {
            return true;
        }
        return false;
    }

    public final void setCompleteListener(AbstractC56730b bVar) {
        this.f129286h = bVar;
    }

    public final void setDynamicLength(boolean z) {
        this.f129292n = z;
    }

    public final void setLength(float f) {
        this.f129284f = f;
    }

    public final void setValue(float f) {
        this.f129285g = f;
    }

    public final void setAnimator(ValueAnimator valueAnimator) {
        C89219l.m154721d(valueAnimator, "");
        this.f129289k = valueAnimator;
    }

    public final void setRepeatCount(int i) {
        this.f129290l = i;
        this.f129289k.setRepeatCount(i);
    }

    public final void setRatio(float f) {
        this.f129291m = f;
        this.f129283e.setStrokeWidth(((float) C71812ep.m126783a(2.0d, C63247i.f143610a)) / f);
    }

    public final void setShowAnimation(boolean z) {
        this.f129288j = z;
        if (z) {
            this.f129289k.start();
            C73991bj.m130133d("AnimationPathView# Start animation");
        } else {
            this.f129289k.cancel();
            C73991bj.m130133d("AnimationPathView# cancel animation");
        }
        invalidate();
    }

    public final void setPoints(List<? extends List<Coordinate>> list) {
        this.f129287i = list;
        if (list != null) {
            this.f129280b.clear();
            this.f129281c.clear();
            this.f129282d.clear();
            int i = 0;
            int size = list.size();
            if (size >= 0) {
                while (true) {
                    this.f129280b.add(new Path());
                    this.f129281c.add(new Path());
                    this.f129282d.add(new PathMeasure());
                    if (i != size) {
                        i++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        MethodCollector.m26663i(12669);
        super.onDraw(canvas);
        if (!this.f129288j) {
            MethodCollector.m26664o(12669);
            return;
        }
        List<? extends List<Coordinate>> list = this.f129287i;
        if (list != null) {
            int i = 0;
            for (T t : list) {
                int i2 = i + 1;
                if (i < 0) {
                    C89070n.m154520a();
                }
                T<Coordinate> t2 = t;
                Path path = this.f129280b.get(i);
                C89219l.m154716b(path, "");
                Path path2 = path;
                Path path3 = this.f129281c.get(i);
                C89219l.m154716b(path3, "");
                Path path4 = path3;
                PathMeasure pathMeasure = this.f129282d.get(i);
                C89219l.m154716b(pathMeasure, "");
                PathMeasure pathMeasure2 = pathMeasure;
                path2.moveTo(((Coordinate) t2.get(0)).getX(), ((Coordinate) t2.get(0)).getY());
                for (Coordinate coordinate : t2) {
                    path2.lineTo(coordinate.getX(), coordinate.getY());
                }
                path2.close();
                pathMeasure2.setPath(path2, true);
                this.f129284f = pathMeasure2.getLength();
                path4.reset();
                path4.lineTo(0.0f, 0.0f);
                float f = 0.2f;
                if (this.f129292n) {
                    float f2 = this.f129284f;
                    float f3 = this.f129285g;
                    float f4 = f2 * f3;
                    float f5 = 0.4f;
                    if (f3 >= 0.0f && f3 <= 0.2f) {
                        f5 = f3 * 2.0f;
                    } else if (f3 < 0.2f || f3 > 0.4f) {
                        f5 = ((1.0f - f3) * 2.0f) / 3.0f;
                    }
                    pathMeasure2.getSegment(f4, (f2 * f5) + f4, path4, true);
                } else {
                    float f6 = this.f129284f;
                    float f7 = this.f129285g;
                    float f8 = f6 * f7;
                    if (f7 >= 0.0f && f7 <= 0.2f) {
                        f = f7;
                    } else if (f7 < 0.2f || f7 > 0.8f) {
                        f = 1.0f - f7;
                    }
                    pathMeasure2.getSegment(f8, (f6 * f) + f8, path4, true);
                }
                if (canvas != null) {
                    canvas.drawPath(path4, this.f129283e);
                }
                i = i2;
            }
            MethodCollector.m26664o(12669);
            return;
        }
        MethodCollector.m26664o(12669);
    }

    private /* synthetic */ AnimationPathView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private AnimationPathView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(12787);
        this.f129280b = new ArrayList<>();
        this.f129281c = new ArrayList<>();
        this.f129282d = new ArrayList<>();
        Paint paint = new Paint();
        this.f129283e = paint;
        this.f129291m = 1.0f;
        paint.setAntiAlias(true);
        paint.setColor(C0643b.m2378c(context, R.color.l));
        paint.setStrokeWidth((float) C71812ep.m126783a(2.0d, C63247i.f143610a));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        C89219l.m154716b(ofFloat, "");
        this.f129289k = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            /* class com.p2082ss.android.ugc.aweme.infoSticker.widget.AnimationPathView.C567271 */

            /* renamed from: a */
            final /* synthetic */ AnimationPathView f129293a;

            static {
                Covode.recordClassIndex(66588);
            }

            {
                this.f129293a = r1;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AnimationPathView animationPathView = this.f129293a;
                C89219l.m154716b(valueAnimator, "");
                Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                animationPathView.setValue(((Float) animatedValue).floatValue());
                this.f129293a.invalidate();
            }
        });
        this.f129289k.setDuration(1200L);
        this.f129289k.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f129289k.setRepeatCount(this.f129290l);
        this.f129289k.addListener(new Animator.AnimatorListener(this) {
            /* class com.p2082ss.android.ugc.aweme.infoSticker.widget.AnimationPathView.C567282 */

            /* renamed from: a */
            final /* synthetic */ AnimationPathView f129294a;

            static {
                Covode.recordClassIndex(66589);
            }

            public final void onAnimationCancel(Animator animator) {
            }

            public final void onAnimationStart(Animator animator) {
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f129294a = r1;
            }

            public final void onAnimationEnd(Animator animator) {
                AbstractC56730b completeListener = this.f129294a.getCompleteListener();
                if (completeListener != null) {
                    completeListener.mo93575a();
                }
            }

            public final void onAnimationRepeat(Animator animator) {
                AbstractC56730b completeListener = this.f129294a.getCompleteListener();
                if (completeListener != null) {
                    completeListener.mo93575a();
                }
            }
        });
        MethodCollector.m26664o(12787);
    }
}
