package com.p2082ss.android.ugc.aweme.shortvideo.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.core.content.C0643b;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.TimeSpeedModelExtension;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.vesdk.VERecordData;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.CircleProgressSegmentView */
public class CircleProgressSegmentView extends ProgressSegmentView {

    /* renamed from: a */
    public static final C74244a f166784a = new C74244a((byte) 0);

    /* renamed from: v */
    private final AbstractC89244h f166785v;

    /* renamed from: w */
    private final float f166786w;

    /* renamed from: x */
    private final float f166787x;

    static {
        Covode.recordClassIndex(87006);
    }

    public CircleProgressSegmentView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private final RectF getMArcRectF() {
        return (RectF) this.f166785v.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.CircleProgressSegmentView$a */
    public static final class C74244a {
        static {
            Covode.recordClassIndex(87007);
        }

        private C74244a() {
        }

        public /* synthetic */ C74244a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.CircleProgressSegmentView$b */
    static final class C74245b extends AbstractC89220m implements AbstractC89171a<RectF> {

        /* renamed from: a */
        final /* synthetic */ CircleProgressSegmentView f166788a;

        static {
            Covode.recordClassIndex(87008);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74245b(CircleProgressSegmentView circleProgressSegmentView) {
            super(0);
            this.f166788a = circleProgressSegmentView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ RectF invoke() {
            return new RectF(0.0f, 0.0f, (float) this.f166788a.getMeasuredWidth(), (float) this.f166788a.getMeasuredHeight());
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.shortvideo.widget.ProgressSegmentView
    /* renamed from: a */
    public final void mo116743a(Canvas canvas) {
        m130521c(canvas);
        m130522d(canvas);
    }

    /* renamed from: a */
    private final float m130518a(long j) {
        return Math.min((((float) j) / ((float) this.f166882m)) * 360.0f, 360.0f);
    }

    /* renamed from: a */
    private static float m130519a(List<VERecordData.VERecordSegmentData> list) {
        long j = 0;
        for (VERecordData.VERecordSegmentData vERecordSegmentData : list) {
            j += vERecordSegmentData.f190800c;
        }
        return 360.0f / ((float) j);
    }

    public void setCircleRadius(float f) {
        float measuredWidth = ((float) getMeasuredWidth()) / 2.0f;
        float measuredHeight = ((float) getMeasuredHeight()) / 2.0f;
        getMArcRectF().left = (measuredWidth - f) + this.f166787x;
        getMArcRectF().top = (measuredHeight - f) + this.f166787x;
        getMArcRectF().right = (measuredWidth + f) - this.f166787x;
        getMArcRectF().bottom = (measuredHeight + f) - this.f166787x;
        invalidate();
    }

    /* renamed from: c */
    private final void m130521c(Canvas canvas) {
        Paint paint = this.f166874e;
        C89219l.m154716b(paint, "");
        paint.setStrokeCap(Paint.Cap.BUTT);
        List list = this.f166887r;
        C89219l.m154716b(list, "");
        float a = m130519a(list);
        List<VERecordData.VERecordSegmentData> list2 = this.f166887r;
        C89219l.m154716b(list2, "");
        float f = -90.0f;
        int i = 0;
        for (VERecordData.VERecordSegmentData vERecordSegmentData : list2) {
            float f2 = ((float) vERecordSegmentData.f190800c) * a;
            if (i == this.f166888s) {
                if (this.f166890u != null && this.f166889t >= 0) {
                    m130520a(canvas, f, f2, 1000.0f * a);
                }
                if (this.f166885p) {
                    Paint paint2 = this.f166881l;
                    C89219l.m154716b(paint2, "");
                    paint2.setAlpha((int) (this.f166884o * 255.0f));
                    if (canvas != null) {
                        canvas.drawArc(getMArcRectF(), f, f2, false, this.f166881l);
                    }
                }
            } else if (canvas != null) {
                canvas.drawArc(getMArcRectF(), f, f2, false, this.f166876g);
            }
            f += f2;
            i++;
        }
    }

    /* renamed from: d */
    private final void m130522d(Canvas canvas) {
        List list = this.f166887r;
        C89219l.m154716b(list, "");
        float a = m130519a(list);
        List<VERecordData.VERecordSegmentData> list2 = this.f166887r;
        C89219l.m154716b(list2, "");
        float f = -90.0f;
        int i = 0;
        for (VERecordData.VERecordSegmentData vERecordSegmentData : list2) {
            float f2 = ((float) vERecordSegmentData.f190800c) * a;
            if (i == this.f166888s) {
                Paint paint = this.f166880k;
                C89219l.m154716b(paint, "");
                paint.setAlpha((int) (this.f166883n * 255.0f));
                if (canvas != null) {
                    canvas.drawArc(getMArcRectF(), f - 2.0f, 4.0f, false, this.f166880k);
                }
            } else if (canvas != null) {
                canvas.drawArc(getMArcRectF(), f - 2.0f, 4.0f, false, this.f166877h);
            }
            f += f2;
            i++;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.shortvideo.widget.ProgressSegmentView
    public void onDraw(Canvas canvas) {
        if (this.f166886q == 2) {
            mo116743a(canvas);
            return;
        }
        float a = m130518a(this.f166873d);
        if (this.f166872c != null) {
            TimeSpeedModelExtension timeSpeedModelExtension = this.f166872c;
            C89219l.m154716b(timeSpeedModelExtension, "");
            float a2 = m130518a((long) timeSpeedModelExtension.getDuration());
            if (canvas != null) {
                canvas.drawArc(getMArcRectF(), -90.0f, a2, false, this.f166878i);
                if (a > a2) {
                    canvas.drawArc(getMArcRectF(), a2 - 90.0f, a - a2, false, this.f166879j);
                }
            }
        } else if (canvas != null) {
            canvas.drawArc(getMArcRectF(), -90.0f, a, false, this.f166875f);
        }
        mo116744b(canvas);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.shortvideo.widget.ProgressSegmentView
    /* renamed from: b */
    public final void mo116744b(Canvas canvas) {
        TimeSpeedModelExtension timeSpeedModelExtension = this.f166872c;
        long j = 0;
        if (timeSpeedModelExtension != null) {
            long duration = ((long) timeSpeedModelExtension.getDuration()) + 0;
            float a = m130518a(duration);
            if (a < 360.0f) {
                if (canvas != null) {
                    canvas.drawArc(getMArcRectF(), a - 90.0f, 4.0f, false, this.f166877h);
                }
            } else if (canvas != null) {
                canvas.drawArc(getMArcRectF(), (a - 90.0f) - 2.0f, 4.0f, false, this.f166877h);
            }
            j = duration;
        }
        if (this.f166871b != null) {
            List list = this.f166871b;
            C89219l.m154716b(list, "");
            int size = list.size();
            for (int i = 0; i < size; i++) {
                TimeSpeedModelExtension timeSpeedModelExtension2 = (TimeSpeedModelExtension) this.f166871b.get(i);
                C89219l.m154716b(timeSpeedModelExtension2, "");
                j += (long) TimeSpeedModelExtension.calculateRealTime(timeSpeedModelExtension2.getDuration(), timeSpeedModelExtension2.getSpeed());
                float a2 = m130518a(j);
                if (a2 < 360.0f) {
                    if (canvas != null) {
                        canvas.drawArc(getMArcRectF(), a2 - 90.0f, 4.0f, false, this.f166877h);
                    }
                } else if (canvas != null) {
                    canvas.drawArc(getMArcRectF(), (a2 - 90.0f) - 2.0f, 4.0f, false, this.f166877h);
                }
            }
        }
    }

    private /* synthetic */ CircleProgressSegmentView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private CircleProgressSegmentView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        this.f166785v = C89250i.m154773a((AbstractC89171a) new C74245b(this));
        float b = C13628n.m24520b(context, 6.0f);
        this.f166786w = b;
        this.f166787x = b / 2.0f;
        Paint paint = this.f166875f;
        if (paint != null) {
            paint.setStrokeWidth(b);
            paint.setStyle(Paint.Style.STROKE);
            paint.setColor(C0643b.m2378c(getContext(), R.color.bh));
        }
        Paint paint2 = this.f166877h;
        if (paint2 != null) {
            paint2.setStrokeWidth(b);
            paint2.setStyle(Paint.Style.STROKE);
        }
        Paint paint3 = this.f166874e;
        if (paint3 != null) {
            paint3.setStrokeWidth(b);
            paint3.setStyle(Paint.Style.STROKE);
        }
        Paint paint4 = this.f166876g;
        if (paint4 != null) {
            paint4.setStrokeWidth(b);
            paint4.setStyle(Paint.Style.STROKE);
            paint4.setColor(C0643b.m2378c(getContext(), R.color.bh));
            paint4.setAlpha(86);
        }
        Paint paint5 = this.f166880k;
        if (paint5 != null) {
            paint5.setStrokeWidth(b);
            paint5.setStyle(Paint.Style.STROKE);
        }
        Paint paint6 = this.f166881l;
        if (paint6 != null) {
            paint6.setStrokeWidth(b);
            paint6.setStyle(Paint.Style.STROKE);
            paint6.setColor(C0643b.m2378c(getContext(), R.color.bh));
        }
        Paint paint7 = this.f166878i;
        if (paint7 != null) {
            paint7.setStrokeWidth(b);
            paint7.setStyle(Paint.Style.STROKE);
            paint7.setColor(C0643b.m2378c(getContext(), R.color.bh));
        }
        Paint paint8 = this.f166879j;
        if (paint8 != null) {
            paint8.setStrokeWidth(b);
            paint8.setStyle(Paint.Style.STROKE);
            paint8.setColor(C0643b.m2378c(getContext(), R.color.bm));
        }
    }

    /* renamed from: a */
    private final void m130520a(Canvas canvas, float f, float f2, float f3) {
        Paint paint = this.f166875f;
        C89219l.m154716b(paint, "");
        paint.setStrokeCap(Paint.Cap.BUTT);
        float min = Math.min(((float) this.f166889t) * f3, f2);
        if (canvas != null) {
            canvas.drawArc(getMArcRectF(), f, min, false, this.f166875f);
        }
        if (this.f166890u != null) {
            float f4 = f;
            for (TimeSpeedModelExtension timeSpeedModelExtension : this.f166890u) {
                C89219l.m154716b(timeSpeedModelExtension, "");
                f4 += ((float) ((long) TimeSpeedModelExtension.calculateRealTime(timeSpeedModelExtension.getDuration(), timeSpeedModelExtension.getSpeed()))) * f3;
                if (f4 < f2 + f && canvas != null) {
                    canvas.drawArc(getMArcRectF(), f4 - 2.0f, 4.0f, false, this.f166877h);
                }
            }
        }
    }
}
