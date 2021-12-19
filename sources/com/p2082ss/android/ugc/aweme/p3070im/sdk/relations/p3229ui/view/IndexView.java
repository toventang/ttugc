package com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17301b;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17303d;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.ui.view.IndexView */
public class IndexView extends View {

    /* renamed from: a */
    private int f127475a = -1;

    /* renamed from: b */
    private AbstractC55911a f127476b;

    /* renamed from: c */
    private List<String> f127477c = new ArrayList();

    /* renamed from: d */
    private List<Integer> f127478d = new ArrayList();

    /* renamed from: e */
    private Context f127479e;

    /* renamed from: f */
    private Resources f127480f;

    /* renamed from: g */
    private int f127481g;

    /* renamed from: h */
    private int f127482h;

    /* renamed from: i */
    private int f127483i;

    /* renamed from: j */
    private int f127484j;

    /* renamed from: k */
    private int f127485k;

    /* renamed from: l */
    private TextView f127486l;

    /* renamed from: m */
    private Paint f127487m;

    /* renamed from: n */
    private Paint f127488n;

    /* renamed from: o */
    private int f127489o;

    /* renamed from: p */
    private int f127490p;

    /* renamed from: q */
    private float f127491q;

    /* renamed from: r */
    private Bitmap f127492r;

    /* renamed from: s */
    private Bitmap f127493s;

    /* renamed from: t */
    private Bitmap f127494t;

    /* renamed from: u */
    private Bitmap f127495u;

    /* renamed from: v */
    private Rect f127496v;

    /* renamed from: w */
    private Rect f127497w;

    /* renamed from: x */
    private int f127498x = 0;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.ui.view.IndexView$a */
    public interface AbstractC55911a {
        static {
            Covode.recordClassIndex(65703);
        }

        /* renamed from: a */
        void mo92778a(int i);
    }

    static {
        Covode.recordClassIndex(65702);
    }

    private int getSuggestedMinWidth() {
        String str = "";
        for (String str2 : this.f127477c) {
            if (str.length() < str2.length()) {
                str = str2;
            }
        }
        double measureText = (double) this.f127488n.measureText(str);
        Double.isNaN(measureText);
        return (int) (measureText + 0.5d);
    }

    public void setIndexLetterTv(TextView textView) {
        this.f127486l = textView;
    }

    public void setOnLetterTouchListener(AbstractC55911a aVar) {
        this.f127476b = aVar;
    }

    public void setCurrentIndex(int i) {
        this.f127475a = i;
        invalidate();
    }

    public void setIndexLetters(List<String> list) {
        this.f127477c.clear();
        this.f127477c.addAll(list);
        requestLayout();
    }

    public void setCurrentIndex(String str) {
        int i = 0;
        while (true) {
            if (i >= this.f127477c.size()) {
                break;
            } else if (TextUtils.equals(str, this.f127477c.get(i))) {
                this.f127475a = i;
                break;
            } else {
                i++;
            }
        }
        invalidate();
    }

    public void setRecycleViewPos(int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < this.f127478d.size(); i3++) {
            i2 += this.f127478d.get(i3).intValue();
            if (i < i2) {
                if (this.f127475a != i3) {
                    this.f127475a = i3;
                    invalidate();
                    return;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        if (r3 != 2) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
        // Method dump skipped, instructions count: 188
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.view.IndexView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        MethodCollector.m26663i(3516);
        super.onDraw(canvas);
        List<String> list = this.f127477c;
        if (list == null || list.size() == 0) {
            MethodCollector.m26664o(3516);
            return;
        }
        this.f127484j = this.f127482h;
        this.f127498x = 0;
        for (int i = 0; i < this.f127477c.size(); i++) {
            if (this.f127477c.get(i).equals("recent")) {
                this.f127498x++;
                Rect rect = this.f127496v;
                int i2 = this.f127489o;
                rect.set(0, 0, i2, i2);
                if (this.f127475a == i) {
                    canvas.drawBitmap(this.f127493s, (Rect) null, this.f127496v, this.f127488n);
                } else {
                    canvas.drawBitmap(this.f127492r, (Rect) null, this.f127496v, this.f127488n);
                }
            } else if (this.f127477c.get(i).equals("Friend")) {
                this.f127498x++;
                Rect rect2 = this.f127496v;
                int i3 = this.f127490p;
                int i4 = this.f127489o;
                rect2.set(0, i3 * i, i4, (i3 * i) + i4);
                if (this.f127475a == i) {
                    canvas.drawBitmap(this.f127495u, (Rect) null, this.f127496v, this.f127488n);
                } else {
                    canvas.drawBitmap(this.f127494t, (Rect) null, this.f127496v, this.f127488n);
                }
            } else {
                this.f127485k = (this.f127483i - (this.f127490p * this.f127498x)) / (this.f127477c.size() - this.f127498x);
                this.f127488n.getTextBounds(this.f127477c.get(i), 0, this.f127477c.get(i).length(), this.f127497w);
                float f = ((float) this.f127484j) / 2.0f;
                int i5 = this.f127490p;
                int i6 = this.f127498x;
                float height = ((float) ((i5 * i6) + (this.f127485k * ((i + 1) - i6)))) - (((float) this.f127497w.height()) / 2.0f);
                if (this.f127475a == i) {
                    canvas.drawText(this.f127477c.get(i), f, height, this.f127488n);
                } else {
                    canvas.drawText(this.f127477c.get(i), f, height, this.f127487m);
                }
            }
        }
        MethodCollector.m26664o(3516);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        MethodCollector.m26663i(3494);
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
        this.f127482h = size;
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 != 1073741824) {
            Paint.FontMetrics fontMetrics = this.f127488n.getFontMetrics();
            int size3 = (int) (((float) this.f127477c.size()) * (fontMetrics.bottom - fontMetrics.top) * 1.2f);
            if (mode2 == Integer.MIN_VALUE) {
                size2 = Math.min(size3, size2);
            } else {
                size2 = size3;
            }
        }
        this.f127483i = size2;
        setMeasuredDimension(size, size2);
        MethodCollector.m26664o(3494);
    }

    public IndexView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(3469);
        this.f127479e = context;
        this.f127480f = context.getResources();
        Paint paint = new Paint(1);
        this.f127488n = paint;
        paint.setTextSize(C13628n.m24520b(this.f127479e, 11.0f));
        this.f127488n.setTextAlign(Paint.Align.CENTER);
        this.f127488n.setColor(this.f127480f.getColor(R.color.bx));
        this.f127488n.setTypeface(C17301b.m32033a().mo27611a(C17303d.f41567a));
        Paint paint2 = new Paint(1);
        this.f127487m = paint2;
        paint2.setTextSize(C13628n.m24520b(this.f127479e, 11.0f));
        this.f127487m.setTextAlign(Paint.Align.CENTER);
        this.f127487m.setColor(this.f127480f.getColor(R.color.bz));
        this.f127487m.setTypeface(C17301b.m32033a().mo27611a(C17303d.f41567a));
        this.f127492r = ((BitmapDrawable) this.f127480f.getDrawable(2131232874)).getBitmap();
        this.f127493s = ((BitmapDrawable) this.f127480f.getDrawable(2131232873)).getBitmap();
        this.f127494t = ((BitmapDrawable) this.f127480f.getDrawable(2131232886)).getBitmap();
        this.f127495u = ((BitmapDrawable) this.f127480f.getDrawable(2131232885)).getBitmap();
        this.f127491q = C13628n.m24520b(this.f127479e, 2.0f);
        this.f127489o = (int) C13628n.m24520b(this.f127479e, 16.0f);
        this.f127490p = (int) (C13628n.m24520b(this.f127479e, 16.0f) + this.f127491q);
        int i = this.f127489o;
        this.f127496v = new Rect(0, 0, i, i);
        this.f127497w = new Rect();
        MethodCollector.m26664o(3469);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }
}
