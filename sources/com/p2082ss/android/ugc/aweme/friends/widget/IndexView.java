package com.p2082ss.android.ugc.aweme.friends.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.friends.widget.IndexView */
public class IndexView extends View {

    /* renamed from: a */
    public List<String> f119286a = new ArrayList();

    /* renamed from: b */
    public List<Integer> f119287b = new ArrayList();

    /* renamed from: c */
    private int f119288c = -1;

    /* renamed from: d */
    private AbstractC51758a f119289d;

    /* renamed from: e */
    private Context f119290e;

    /* renamed from: f */
    private Resources f119291f;

    /* renamed from: g */
    private int f119292g;

    /* renamed from: h */
    private int f119293h;

    /* renamed from: i */
    private int f119294i;

    /* renamed from: j */
    private int f119295j;

    /* renamed from: k */
    private int f119296k;

    /* renamed from: l */
    private TextView f119297l;

    /* renamed from: m */
    private Paint f119298m;

    /* renamed from: n */
    private Paint f119299n;

    /* renamed from: o */
    private float f119300o;

    /* renamed from: p */
    private int f119301p;

    /* renamed from: q */
    private int f119302q;

    /* renamed from: r */
    private float f119303r;

    /* renamed from: s */
    private Rect f119304s;

    /* renamed from: t */
    private Rect f119305t;

    /* renamed from: u */
    private int f119306u = 0;

    /* renamed from: com.ss.android.ugc.aweme.friends.widget.IndexView$a */
    public interface AbstractC51758a {
        static {
            Covode.recordClassIndex(61122);
        }

        /* renamed from: a */
        void mo87461a(int i);
    }

    static {
        Covode.recordClassIndex(61121);
    }

    private int getSuggestedMinWidth() {
        String str = "";
        for (String str2 : this.f119286a) {
            if (str.length() < str2.length()) {
                str = str2;
            }
        }
        double measureText = (double) this.f119299n.measureText(str);
        Double.isNaN(measureText);
        return (int) (measureText + 0.5d);
    }

    public void setIndexLetterTv(TextView textView) {
        this.f119297l = textView;
    }

    public void setOnLetterTouchListener(AbstractC51758a aVar) {
        this.f119289d = aVar;
    }

    public void setCurrentIndex(String str) {
        int i = 0;
        while (true) {
            if (i >= this.f119286a.size()) {
                break;
            } else if (TextUtils.equals(str, this.f119286a.get(i))) {
                this.f119288c = i;
                break;
            } else {
                i++;
            }
        }
        invalidate();
    }

    public void setRecycleViewPos(int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < this.f119287b.size(); i3++) {
            i2 += this.f119287b.get(i3).intValue();
            if (i < i2) {
                if (this.f119288c != i3) {
                    this.f119288c = i3;
                    invalidate();
                    return;
                } else {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        MethodCollector.m26663i(12181);
        super.onDraw(canvas);
        List<String> list = this.f119286a;
        if (list == null || list.size() == 0) {
            MethodCollector.m26664o(12181);
            return;
        }
        this.f119295j = this.f119293h;
        this.f119306u = 0;
        int i = 0;
        while (i < this.f119286a.size()) {
            this.f119296k = (this.f119294i - (this.f119302q * this.f119306u)) / (this.f119286a.size() - this.f119306u);
            this.f119299n.getTextBounds(this.f119286a.get(i), 0, this.f119286a.get(i).length(), this.f119305t);
            float f = ((float) this.f119295j) / 2.0f;
            int i2 = this.f119302q;
            int i3 = this.f119306u;
            int i4 = i + 1;
            float height = ((float) ((i2 * i3) + (this.f119296k * (i4 - i3)))) - (((float) this.f119305t.height()) / 2.0f);
            if (this.f119288c == i) {
                canvas.drawText(this.f119286a.get(i), f, height, this.f119299n);
            } else {
                canvas.drawText(this.f119286a.get(i), f, height, this.f119298m);
            }
            i = i4;
        }
        MethodCollector.m26664o(12181);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        if (r3 != 2) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
        // Method dump skipped, instructions count: 188
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.friends.widget.IndexView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        MethodCollector.m26663i(12179);
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != 1073741824) {
            int suggestedMinWidth = getSuggestedMinWidth();
            if (mode == Integer.MIN_VALUE) {
                size = Math.min(suggestedMinWidth, size);
            } else {
                size = suggestedMinWidth;
            }
        }
        this.f119293h = size;
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 != 1073741824) {
            Paint.FontMetrics fontMetrics = this.f119299n.getFontMetrics();
            float f = fontMetrics.bottom - fontMetrics.top;
            this.f119300o = fontMetrics.bottom * 1.2f;
            int size3 = (int) (((float) this.f119286a.size()) * f * 1.2f);
            if (mode2 == Integer.MIN_VALUE) {
                size2 = Math.min(size3, size2);
            } else {
                size2 = size3;
            }
        }
        this.f119294i = size2;
        setMeasuredDimension(size, size2);
        MethodCollector.m26664o(12179);
    }

    public IndexView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(11905);
        this.f119290e = context;
        this.f119291f = context.getResources();
        Paint paint = new Paint(1);
        this.f119299n = paint;
        paint.setTextSize(C13628n.m24520b(this.f119290e, 11.0f));
        this.f119299n.setTextAlign(Paint.Align.CENTER);
        this.f119299n.setColor(this.f119291f.getColor(R.color.bx));
        Paint paint2 = new Paint(1);
        this.f119298m = paint2;
        paint2.setTextSize(C13628n.m24520b(this.f119290e, 11.0f));
        this.f119298m.setTextAlign(Paint.Align.CENTER);
        this.f119298m.setColor(this.f119291f.getColor(R.color.c6));
        this.f119303r = C13628n.m24520b(this.f119290e, 2.0f);
        this.f119301p = (int) C13628n.m24520b(this.f119290e, 16.0f);
        this.f119302q = (int) (C13628n.m24520b(this.f119290e, 16.0f) + this.f119303r);
        this.f119304s = new Rect(0, 0, this.f119301p, this.f119302q);
        this.f119305t = new Rect();
        MethodCollector.m26664o(11905);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }
}
