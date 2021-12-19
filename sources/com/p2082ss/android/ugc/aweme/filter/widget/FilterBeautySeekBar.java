package com.p2082ss.android.ugc.aweme.filter.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import androidx.appcompat.widget.C0441p;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import com.p2082ss.android.ugc.tools.view.style.AbstractC84968c;
import com.p2082ss.android.ugc.tools.view.style.C84980f;
import com.p2082ss.android.ugc.tools.view.style.EnumC84965a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.filter.widget.FilterBeautySeekBar */
public class FilterBeautySeekBar extends C0441p {

    /* renamed from: a */
    protected String f117531a;

    /* renamed from: b */
    protected String f117532b;

    /* renamed from: c */
    protected Paint f117533c;

    /* renamed from: d */
    public float f117534d;

    /* renamed from: e */
    public float f117535e;

    /* renamed from: f */
    public float f117536f;

    /* renamed from: g */
    public float f117537g;

    /* renamed from: h */
    private float f117538h;

    /* renamed from: i */
    private float f117539i;

    /* renamed from: j */
    private float f117540j;

    /* renamed from: k */
    private boolean f117541k;

    /* renamed from: l */
    private int f117542l;

    /* renamed from: m */
    private int f117543m;

    /* renamed from: n */
    private float f117544n;

    /* renamed from: o */
    private Paint f117545o;

    /* renamed from: p */
    private boolean f117546p;

    /* renamed from: q */
    private boolean f117547q;

    static {
        Covode.recordClassIndex(60113);
    }

    public synchronized int getProgress() {
        int progress;
        MethodCollector.m26663i(8955);
        progress = super.getProgress();
        String valueOf = String.valueOf(progress);
        this.f117531a = valueOf;
        if (!"0".equals(valueOf) && this.f117546p) {
            this.f117531a += "%";
        }
        Paint paint = this.f117533c;
        if (paint != null) {
            this.f117539i = paint.measureText(this.f117531a);
        }
        MethodCollector.m26664o(8955);
        return progress;
    }

    public void setDisplayPercent(boolean z) {
        this.f117546p = z;
    }

    public void setShowText(boolean z) {
        this.f117547q = z;
    }

    public void setDefaultDotProgress(int i) {
        this.f117542l = i;
        invalidate();
    }

    public void setTextColor(int i) {
        this.f117533c.setColor(i);
        invalidate();
    }

    @Override // androidx.appcompat.widget.C0441p
    public synchronized void onDraw(Canvas canvas) {
        MethodCollector.m26663i(8954);
        super.onDraw(canvas);
        Rect bounds = getProgressDrawable().getBounds();
        float progress = ((float) getProgress()) / ((float) getMax());
        float f = ((float) this.f117542l) / 100.0f;
        if (C84912r.m145932a(this)) {
            progress = 1.0f - progress;
            f = 1.0f - f;
        }
        if (this.f117547q) {
            float f2 = this.f117540j;
            canvas.drawText(this.f117531a, ((((float) bounds.width()) * progress) - (this.f117539i / 2.0f)) + this.f117534d, f2, this.f117533c);
        }
        if (this.f117542l != -1 && this.f117541k) {
            canvas.drawCircle((((float) bounds.width()) * f) + m95356a(getContext(), this.f117544n) + this.f117534d, ((((float) getHeight()) + this.f117536f) - this.f117537g) / 2.0f, m95356a(getContext(), this.f117544n), this.f117545o);
        }
        MethodCollector.m26664o(8954);
    }

    public FilterBeautySeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842875);
    }

    /* renamed from: a */
    private static float m95356a(Context context, float f) {
        return (f * context.getResources().getDisplayMetrics().density) + 0.5f;
    }

    public FilterBeautySeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 16842875);
        Typeface a;
        this.f117531a = "";
        this.f117532b = "";
        this.f117540j = m95356a(getContext(), 10.0f);
        this.f117547q = true;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{R.attr.kt, R.attr.qz, R.attr.r0, R.attr.r1, R.attr.a1s, R.attr.a8x, R.attr.a8y, R.attr.a90, R.attr.a_3, R.attr.abu, R.attr.ai6, R.attr.ajt}, 16842875, 0);
        int indexCount = obtainStyledAttributes.getIndexCount();
        int i2 = 0;
        for (int i3 = 0; i3 < indexCount; i3++) {
            int index = obtainStyledAttributes.getIndex(i3);
            if (index == 5) {
                i2 = obtainStyledAttributes.getColor(index, -1);
            } else if (index == 7) {
                this.f117538h = obtainStyledAttributes.getDimension(index, 15.0f);
            }
        }
        if (obtainStyledAttributes.hasValue(4)) {
            this.f117534d = obtainStyledAttributes.getDimension(4, 0.0f);
        } else {
            this.f117534d = m95356a(context, 10.0f);
        }
        if (obtainStyledAttributes.hasValue(8)) {
            this.f117535e = obtainStyledAttributes.getDimension(8, 0.0f);
        } else {
            this.f117535e = this.f117534d;
        }
        if (obtainStyledAttributes.hasValue(11)) {
            this.f117536f = obtainStyledAttributes.getDimension(11, 0.0f);
        } else {
            this.f117536f = m95356a(context, 13.0f);
        }
        if (obtainStyledAttributes.hasValue(0)) {
            this.f117537g = obtainStyledAttributes.getDimension(0, 0.0f);
        } else {
            this.f117537g = this.f117536f;
        }
        if (obtainStyledAttributes.hasValue(10)) {
            this.f117540j = obtainStyledAttributes.getDimension(10, 10.0f);
        }
        this.f117541k = obtainStyledAttributes.getBoolean(9, false);
        this.f117542l = obtainStyledAttributes.getInt(2, -1);
        this.f117543m = obtainStyledAttributes.getColor(1, -1);
        this.f117544n = obtainStyledAttributes.getFloat(3, 2.5f);
        this.f117532b = obtainStyledAttributes.getString(6);
        obtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.f117533c = paint;
        paint.setAntiAlias(true);
        this.f117533c.setColor(i2);
        if (!TextUtils.isEmpty(this.f117532b)) {
            Typeface a2 = C84980f.m146052a(this.f117532b);
            this.f117533c.setTypeface(a2 == null ? Typeface.defaultFromStyle(1) : a2);
        } else {
            EnumC84965a aVar = EnumC84965a.MEDIUM;
            C89219l.m154721d(aVar, "");
            AbstractC84968c cVar = C84980f.f190016a;
            if (!(cVar == null || (a = cVar.mo73253a(aVar.getVALUE())) == null)) {
                this.f117533c.setTypeface(a);
            }
        }
        this.f117533c.setTextSize(this.f117538h);
        Rect rect = new Rect();
        String valueOf = String.valueOf(getProgress());
        this.f117531a = valueOf;
        this.f117533c.getTextBounds(valueOf, 0, valueOf.length(), rect);
        Paint paint2 = new Paint();
        this.f117545o = paint2;
        paint2.setAntiAlias(true);
        this.f117545o.setColor(this.f117543m);
        setPadding((int) this.f117534d, (int) this.f117536f, (int) this.f117535e, (int) this.f117537g);
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            /* class com.p2082ss.android.ugc.aweme.filter.widget.FilterBeautySeekBar.ViewTreeObserver$OnGlobalLayoutListenerC509381 */

            static {
                Covode.recordClassIndex(60114);
            }

            public final void onGlobalLayout() {
                if (C84912r.m145932a(FilterBeautySeekBar.this)) {
                    float f = FilterBeautySeekBar.this.f117534d;
                    FilterBeautySeekBar filterBeautySeekBar = FilterBeautySeekBar.this;
                    filterBeautySeekBar.f117534d = filterBeautySeekBar.f117535e;
                    FilterBeautySeekBar.this.f117535e = f;
                    FilterBeautySeekBar filterBeautySeekBar2 = FilterBeautySeekBar.this;
                    filterBeautySeekBar2.setPadding((int) filterBeautySeekBar2.f117534d, (int) FilterBeautySeekBar.this.f117536f, (int) FilterBeautySeekBar.this.f117535e, (int) FilterBeautySeekBar.this.f117537g);
                }
                FilterBeautySeekBar.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        });
    }
}
