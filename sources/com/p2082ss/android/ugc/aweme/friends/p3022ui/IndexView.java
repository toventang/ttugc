package com.p2082ss.android.ugc.aweme.friends.p3022ui;

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
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.IndexView */
public class IndexView extends View {

    /* renamed from: a */
    List<String> f119028a = new ArrayList();

    /* renamed from: b */
    List<Integer> f119029b = new ArrayList();

    /* renamed from: c */
    private int f119030c = -1;

    /* renamed from: d */
    private AbstractC51664a f119031d;

    /* renamed from: e */
    private Context f119032e;

    /* renamed from: f */
    private Resources f119033f;

    /* renamed from: g */
    private int f119034g;

    /* renamed from: h */
    private int f119035h;

    /* renamed from: i */
    private int f119036i;

    /* renamed from: j */
    private int f119037j;

    /* renamed from: k */
    private int f119038k;

    /* renamed from: l */
    private TextView f119039l;

    /* renamed from: m */
    private Paint f119040m;

    /* renamed from: n */
    private Paint f119041n;

    /* renamed from: o */
    private float f119042o;

    /* renamed from: p */
    private int f119043p;

    /* renamed from: q */
    private int f119044q;

    /* renamed from: r */
    private float f119045r;

    /* renamed from: s */
    private Bitmap f119046s;

    /* renamed from: t */
    private Bitmap f119047t;

    /* renamed from: u */
    private Bitmap f119048u;

    /* renamed from: v */
    private Bitmap f119049v;

    /* renamed from: w */
    private Rect f119050w;

    /* renamed from: x */
    private Rect f119051x;

    /* renamed from: y */
    private int f119052y = 0;

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.IndexView$a */
    public interface AbstractC51664a {
        static {
            Covode.recordClassIndex(61021);
        }

        /* renamed from: a */
        void mo87400a(int i);
    }

    static {
        Covode.recordClassIndex(61020);
    }

    private int getSuggestedMinWidth() {
        String str = "";
        for (String str2 : this.f119028a) {
            if (str.length() < str2.length()) {
                str = str2;
            }
        }
        double measureText = (double) this.f119041n.measureText(str);
        Double.isNaN(measureText);
        return (int) (measureText + 0.5d);
    }

    public void setIndexLetterTv(TextView textView) {
        this.f119039l = textView;
    }

    public void setOnLetterTouchListener(AbstractC51664a aVar) {
        this.f119031d = aVar;
    }

    public void setCurrentIndex(String str) {
        int i = 0;
        while (true) {
            if (i >= this.f119028a.size()) {
                break;
            } else if (TextUtils.equals(str, this.f119028a.get(i))) {
                this.f119030c = i;
                break;
            } else {
                i++;
            }
        }
        invalidate();
    }

    public void setRecycleViewPos(int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < this.f119029b.size(); i3++) {
            i2 += this.f119029b.get(i3).intValue();
            if (i < i2) {
                if (this.f119030c != i3) {
                    this.f119030c = i3;
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
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.friends.p3022ui.IndexView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        MethodCollector.m26663i(7454);
        super.onDraw(canvas);
        List<String> list = this.f119028a;
        if (list == null || list.size() == 0) {
            MethodCollector.m26664o(7454);
            return;
        }
        this.f119037j = this.f119035h;
        this.f119052y = 0;
        for (int i = 0; i < this.f119028a.size(); i++) {
            if (this.f119028a.get(i).equals("Recent")) {
                this.f119052y++;
                Rect rect = this.f119050w;
                int i2 = this.f119043p;
                rect.set(0, 0, i2, i2);
                if (this.f119030c == i) {
                    canvas.drawBitmap(this.f119047t, (Rect) null, this.f119050w, this.f119041n);
                } else {
                    canvas.drawBitmap(this.f119046s, (Rect) null, this.f119050w, this.f119041n);
                }
            } else if (this.f119028a.get(i).equals("Friend")) {
                this.f119052y++;
                Rect rect2 = this.f119050w;
                int i3 = this.f119044q;
                int i4 = this.f119043p;
                rect2.set(0, i3 * i, i4, (i3 * i) + i4);
                if (this.f119030c == i) {
                    canvas.drawBitmap(this.f119049v, (Rect) null, this.f119050w, this.f119041n);
                } else {
                    canvas.drawBitmap(this.f119048u, (Rect) null, this.f119050w, this.f119041n);
                }
            } else {
                this.f119038k = (this.f119036i - (this.f119044q * this.f119052y)) / (this.f119028a.size() - this.f119052y);
                this.f119041n.getTextBounds(this.f119028a.get(i), 0, this.f119028a.get(i).length(), this.f119051x);
                float f = ((float) this.f119037j) / 2.0f;
                int i5 = this.f119044q;
                int i6 = this.f119052y;
                float height = ((float) ((i5 * i6) + (this.f119038k * ((i + 1) - i6)))) - (((float) this.f119051x.height()) / 2.0f);
                if (this.f119030c == i) {
                    canvas.drawText(this.f119028a.get(i), f, height, this.f119041n);
                } else {
                    canvas.drawText(this.f119028a.get(i), f, height, this.f119040m);
                }
            }
        }
        MethodCollector.m26664o(7454);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        MethodCollector.m26663i(7300);
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
        this.f119035h = size;
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 != 1073741824) {
            Paint.FontMetrics fontMetrics = this.f119041n.getFontMetrics();
            float f = fontMetrics.bottom - fontMetrics.top;
            this.f119042o = fontMetrics.bottom * 1.2f;
            int size3 = (int) (((float) this.f119028a.size()) * f * 1.2f);
            if (mode2 == Integer.MIN_VALUE) {
                size2 = Math.min(size3, size2);
            } else {
                size2 = size3;
            }
        }
        this.f119036i = size2;
        setMeasuredDimension(size, size2);
        MethodCollector.m26664o(7300);
    }

    public IndexView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(7296);
        this.f119032e = context;
        this.f119033f = context.getResources();
        Paint paint = new Paint(1);
        this.f119041n = paint;
        paint.setTextSize(C13628n.m24520b(this.f119032e, 11.0f));
        this.f119041n.setTextAlign(Paint.Align.CENTER);
        this.f119041n.setColor(this.f119033f.getColor(R.color.bx));
        Paint paint2 = new Paint(1);
        this.f119040m = paint2;
        paint2.setTextSize(C13628n.m24520b(this.f119032e, 11.0f));
        this.f119040m.setTextAlign(Paint.Align.CENTER);
        this.f119040m.setColor(this.f119033f.getColor(R.color.c5));
        this.f119046s = ((BitmapDrawable) this.f119033f.getDrawable(2131232230)).getBitmap();
        this.f119047t = ((BitmapDrawable) this.f119033f.getDrawable(2131232231)).getBitmap();
        this.f119049v = ((BitmapDrawable) this.f119033f.getDrawable(2131232310)).getBitmap();
        this.f119048u = ((BitmapDrawable) this.f119033f.getDrawable(2131232309)).getBitmap();
        this.f119045r = C13628n.m24520b(this.f119032e, 2.0f);
        this.f119043p = (int) C13628n.m24520b(this.f119032e, 16.0f);
        this.f119044q = (int) (C13628n.m24520b(this.f119032e, 16.0f) + this.f119045r);
        this.f119050w = new Rect(0, 0, this.f119043p, this.f119044q);
        this.f119051x = new Rect();
        MethodCollector.m26664o(7296);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }
}
