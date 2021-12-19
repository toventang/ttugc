package com.bytedance.android.live.design.view;

import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.p030b.C0622a;
import androidx.core.p037h.C0792v;
import com.bytedance.android.live.design.C4079b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.live.design.view.g */
public final class C4093g extends FrameLayout {

    /* renamed from: A */
    private int f11308A;

    /* renamed from: B */
    private final PointF f11309B;

    /* renamed from: a */
    View f11310a;

    /* renamed from: b */
    int f11311b;

    /* renamed from: c */
    final Rect f11312c;

    /* renamed from: d */
    final Rect f11313d;

    /* renamed from: e */
    final Rect f11314e;

    /* renamed from: f */
    Rect f11315f;

    /* renamed from: g */
    int f11316g;

    /* renamed from: h */
    Rect f11317h;

    /* renamed from: i */
    Rect f11318i;

    /* renamed from: j */
    final PointF f11319j;

    /* renamed from: k */
    private Path f11320k;

    /* renamed from: l */
    private int f11321l;

    /* renamed from: m */
    private int f11322m;

    /* renamed from: n */
    private int f11323n;

    /* renamed from: o */
    private int f11324o;

    /* renamed from: p */
    private Paint f11325p;

    /* renamed from: q */
    private Paint f11326q;

    /* renamed from: r */
    private float f11327r;

    /* renamed from: s */
    private float f11328s;

    /* renamed from: t */
    private int f11329t;

    /* renamed from: u */
    private int f11330u;

    /* renamed from: v */
    private final RectF f11331v = new RectF();

    /* renamed from: w */
    private final RectF f11332w = new RectF();

    /* renamed from: x */
    private final RectF f11333x = new RectF();

    /* renamed from: y */
    private final RectF f11334y = new RectF();

    /* renamed from: z */
    private final Rect f11335z;

    static {
        Covode.recordClassIndex(4638);
    }

    public final void addView(View view) {
        MethodCollector.m26663i(9543);
        if (getChildCount() <= 0) {
            super.addView(view);
            MethodCollector.m26664o(9543);
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("TooltipOutlineLayout can host only one direct child");
        MethodCollector.m26664o(9543);
        throw illegalStateException;
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        MethodCollector.m26663i(9707);
        super.onDraw(canvas);
        canvas.save();
        canvas.translate((float) this.f11314e.left, (float) (this.f11314e.top + this.f11329t));
        Paint paint = this.f11326q;
        if (paint != null) {
            canvas.drawPath(this.f11320k, paint);
        }
        canvas.translate(0.0f, (float) (-this.f11329t));
        canvas.drawPath(this.f11320k, this.f11325p);
        canvas.restore();
        MethodCollector.m26664o(9707);
    }

    public C4093g(Context context) {
        super(context);
        MethodCollector.m26663i(9398);
        Rect rect = new Rect();
        this.f11335z = rect;
        Rect rect2 = new Rect();
        this.f11312c = rect2;
        Rect rect3 = new Rect();
        this.f11313d = rect3;
        this.f11314e = new Rect();
        this.f11309B = new PointF();
        this.f11319j = new PointF();
        Paint paint = new Paint(1);
        this.f11325p = paint;
        paint.setColor(C4079b.m9889a(this, (int) R.attr.amh));
        setWillNotDraw(false);
        this.f11320k = new Path();
        this.f11321l = getContext().getResources().getDimensionPixelSize(R.dimen.z4);
        this.f11322m = getContext().getResources().getDimensionPixelSize(R.dimen.z9);
        this.f11323n = getContext().getResources().getDimensionPixelSize(R.dimen.z3);
        this.f11324o = getContext().getResources().getDimensionPixelSize(R.dimen.z1);
        this.f11327r = getContext().getResources().getDimension(R.dimen.z0);
        this.f11328s = getContext().getResources().getDimension(R.dimen.z2);
        this.f11329t = getContext().getResources().getDimensionPixelSize(R.dimen.zb);
        this.f11330u = getContext().getResources().getDimensionPixelSize(R.dimen.za);
        this.f11308A = getContext().getResources().getDimensionPixelSize(R.dimen.z7);
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.z6);
        rect2.set(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        rect.left = this.f11330u;
        rect.top = this.f11330u - this.f11329t;
        rect.right = this.f11330u;
        rect.bottom = this.f11330u + this.f11329t;
        rect3.left = Math.max(rect.left, rect2.left);
        rect3.top = Math.max(rect.top, rect2.top);
        rect3.right = Math.max(rect.right, rect2.right);
        rect3.bottom = Math.max(rect.bottom, rect2.bottom);
        if (this.f11330u > 0) {
            Paint paint2 = new Paint(1);
            this.f11326q = paint2;
            paint2.setColor(-16777216);
            TypedValue typedValue = new TypedValue();
            getContext().getResources().getValue(R.dimen.z_, typedValue, true);
            this.f11326q.setAlpha((int) (typedValue.getFloat() * 255.0f));
            this.f11326q.setMaskFilter(new BlurMaskFilter((float) this.f11330u, BlurMaskFilter.Blur.NORMAL));
        }
        setLayerType(1, null);
        MethodCollector.m26664o(9398);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        MethodCollector.m26663i(9545);
        if (getChildCount() <= 0) {
            super.addView(view, i);
            MethodCollector.m26664o(9545);
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("TooltipOutlineLayout can host only one direct child");
        MethodCollector.m26664o(9545);
        throw illegalStateException;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        MethodCollector.m26663i(9547);
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            MethodCollector.m26664o(9547);
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("TooltipOutlineLayout can host only one direct child");
        MethodCollector.m26664o(9547);
        throw illegalStateException;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        Rect rect;
        Rect rect2;
        int i4;
        Rect rect3;
        Rect rect4;
        int i5;
        int i6;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        float f22;
        float f23;
        int i7;
        int i8;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i9 = this.f11311b;
        boolean z2 = true;
        if (i9 == 8388611 || i9 == 8388613) {
            z = true;
            i3 = Math.max((this.f11321l * 2) + this.f11323n, this.f11322m * 2);
        } else {
            z = false;
            i3 = Math.max(this.f11321l * 2, this.f11322m * 2) + this.f11324o;
        }
        if (this.f11317h.left == -1) {
            rect = this.f11312c;
        } else {
            rect = this.f11317h;
        }
        int i10 = size - rect.left;
        if (this.f11317h.right == -1) {
            rect2 = this.f11312c;
        } else {
            rect2 = this.f11317h;
        }
        int i11 = this.f11322m;
        int i12 = (i10 - rect2.right) - (i11 * 2);
        if (z) {
            i12 -= this.f11324o;
        }
        int i13 = this.f11316g - (i11 * 2);
        if (z) {
            i4 = this.f11324o;
        } else {
            i4 = 0;
        }
        int max = Math.max(0, Math.min(i12, i13 - i4));
        if (this.f11317h.top == -1) {
            rect3 = this.f11312c;
        } else {
            rect3 = this.f11317h;
        }
        int i14 = size2 - rect3.top;
        if (this.f11317h.bottom == -1) {
            rect4 = this.f11312c;
        } else {
            rect4 = this.f11317h;
        }
        int i15 = (i14 - rect4.bottom) - (this.f11322m * 2);
        if (!z) {
            i15 -= this.f11324o;
        }
        int max2 = Math.max(0, i15);
        View childAt = getChildAt(0);
        childAt.measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(max2, Integer.MIN_VALUE));
        int measuredWidth = childAt.getMeasuredWidth() + (this.f11322m * 2);
        if (z) {
            i5 = this.f11324o;
        } else {
            i5 = 0;
        }
        int max3 = Math.max(measuredWidth + i5, this.f11308A);
        int measuredHeight = childAt.getMeasuredHeight() + (this.f11322m * 2);
        if (z) {
            i6 = 0;
        } else {
            i6 = this.f11324o;
        }
        int max4 = Math.max(i3, measuredHeight + i6);
        this.f11309B.x = 0.0f;
        this.f11309B.y = 0.0f;
        if (this.f11317h.left == -1 && this.f11317h.right == -1) {
            int width = this.f11318i.left - ((max3 - this.f11310a.getWidth()) / 2);
            if (width - this.f11315f.left <= this.f11315f.left + this.f11312c.left) {
                width = this.f11315f.left + this.f11312c.left;
                i8 = width + max3;
            } else {
                i8 = width + max3;
                if (i8 >= this.f11315f.right - this.f11312c.right) {
                    i8 = this.f11315f.right - this.f11312c.right;
                    width = i8 - max3;
                }
            }
            PointF pointF = this.f11309B;
            int i16 = this.f11321l;
            int i17 = this.f11323n;
            pointF.x = C0622a.m2311a(((float) (this.f11318i.right + this.f11318i.left)) / 2.0f, ((float) (width + i16)) + (((float) i17) / 2.0f), ((float) (i8 - i16)) - (((float) i17) / 2.0f)) - (((float) (i8 + width)) / 2.0f);
            this.f11314e.left = Math.min(width - this.f11315f.left, this.f11313d.left);
            this.f11314e.right = Math.min(this.f11315f.right - i8, this.f11313d.right);
            if (this.f11317h.top != -1) {
                this.f11314e.top = this.f11317h.top;
                if (this.f11318i.bottom + max4 + this.f11312c.bottom > this.f11315f.bottom) {
                    this.f11314e.bottom = this.f11312c.bottom;
                } else {
                    this.f11314e.bottom = Math.min(Math.min(this.f11315f.bottom - this.f11318i.bottom, this.f11315f.height() - this.f11314e.top) - max4, this.f11313d.bottom);
                }
            } else {
                this.f11314e.bottom = this.f11317h.bottom;
                if ((this.f11318i.top - max4) - this.f11312c.top < this.f11315f.top) {
                    this.f11314e.top = this.f11312c.top;
                } else {
                    this.f11314e.top = Math.min(Math.min(this.f11318i.top - this.f11315f.top, this.f11315f.height() - this.f11314e.bottom) - max4, this.f11313d.top);
                }
            }
        } else {
            int height = this.f11318i.top - ((max4 - this.f11310a.getHeight()) / 2);
            if (height - this.f11315f.top <= this.f11315f.top + this.f11312c.top) {
                height = this.f11315f.top + this.f11312c.top;
                i7 = height + max4;
            } else {
                i7 = height + max4;
                if (i7 >= this.f11315f.bottom - this.f11312c.bottom) {
                    i7 = this.f11315f.bottom - this.f11312c.bottom;
                    height = i7 - max4;
                }
            }
            PointF pointF2 = this.f11309B;
            int i18 = this.f11321l;
            int i19 = this.f11323n;
            pointF2.y = C0622a.m2311a(((float) (this.f11318i.bottom + this.f11318i.top)) / 2.0f, ((float) (height + i18)) + (((float) i19) / 2.0f), ((float) (i7 - i18)) - (((float) i19) / 2.0f)) - (((float) (i7 + height)) / 2.0f);
            this.f11314e.top = Math.min(height - this.f11315f.top, this.f11313d.top);
            this.f11314e.bottom = Math.min(this.f11315f.bottom - i7, this.f11313d.bottom);
            if (this.f11317h.left != -1) {
                this.f11314e.left = this.f11317h.left;
                if (this.f11318i.right + max3 + this.f11312c.right > this.f11315f.right) {
                    this.f11314e.right = this.f11312c.right;
                } else {
                    this.f11314e.right = Math.min(Math.min(this.f11315f.right - this.f11318i.right, this.f11315f.width() - this.f11314e.left) - max3, this.f11313d.right);
                }
            } else {
                this.f11314e.right = this.f11317h.right;
                if ((this.f11318i.left - max3) - this.f11312c.left < this.f11315f.left) {
                    this.f11314e.left = this.f11312c.left;
                } else {
                    this.f11314e.left = Math.min(Math.min(this.f11318i.left - this.f11315f.left, this.f11315f.width() - this.f11314e.right) - max3, this.f11313d.left);
                }
            }
        }
        setMeasuredDimension(max3 + this.f11314e.left + this.f11314e.right, max4 + this.f11314e.top + this.f11314e.bottom);
        int measuredWidth2 = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        int i20 = (measuredWidth2 - this.f11314e.left) - this.f11314e.right;
        int i21 = (measuredHeight2 - this.f11314e.top) - this.f11314e.bottom;
        if (C0792v.m2768e(this.f11310a) != 1) {
            z2 = false;
        }
        this.f11320k.reset();
        int i22 = this.f11311b;
        if (i22 == 48) {
            f22 = (float) this.f11321l;
            m9909a(this.f11331v, 0.0f, 0.0f);
            int i23 = this.f11324o;
            int i24 = this.f11321l;
            f3 = (float) ((i21 - i23) - i24);
            m9909a(this.f11332w, 0.0f, (float) ((i21 - i23) - (i24 * 2)));
            f23 = (((float) (i20 - this.f11323n)) / 2.0f) + this.f11309B.x;
            f5 = ((float) (i21 - this.f11324o)) + this.f11309B.y;
            f4 = this.f11327r + f23;
            f17 = (float) i20;
            f18 = (f17 / 2.0f) + this.f11309B.x;
            f9 = ((float) i21) + this.f11309B.y;
            float f24 = this.f11328s;
            f21 = f18 - f24;
            f7 = f24 + f18;
            f20 = (((float) (this.f11323n + i20)) / 2.0f) + this.f11309B.x;
            f12 = ((float) (i21 - this.f11324o)) + this.f11309B.y;
            f11 = f20 - this.f11327r;
            int i25 = this.f11321l;
            f14 = (float) (i20 - i25);
            int i26 = this.f11324o;
            f15 = (float) (i21 - i26);
            m9909a(this.f11333x, (float) (i20 - (i25 * 2)), (float) ((i21 - i26) - (i25 * 2)));
            int i27 = this.f11321l;
            f16 = (float) i27;
            m9909a(this.f11334y, (float) (i20 - (i27 * 2)), 0.0f);
            f8 = f9;
            f19 = 270.0f;
            f = 0.0f;
            f10 = f8;
            f6 = f5;
            f13 = f12;
            f2 = 0.0f;
        } else if (i22 == 80) {
            int i28 = this.f11321l;
            f22 = (float) (i20 - i28);
            f = (float) i21;
            m9909a(this.f11331v, (float) (i20 - (i28 * 2)), (float) (i21 - (i28 * 2)));
            f2 = (float) i20;
            int i29 = this.f11324o;
            int i30 = this.f11321l;
            f3 = (float) (i29 + i30);
            m9909a(this.f11332w, (float) (i20 - (i30 * 2)), (float) i29);
            f23 = (((float) (this.f11323n + i20)) / 2.0f) + this.f11309B.x;
            f5 = ((float) this.f11324o) + this.f11309B.y;
            f4 = f23 - this.f11327r;
            f18 = (f2 / 2.0f) + this.f11309B.x;
            f9 = this.f11309B.y;
            float f25 = this.f11328s;
            f21 = f18 + f25;
            f7 = f18 - f25;
            f20 = (((float) (i20 - this.f11323n)) / 2.0f) + this.f11309B.x;
            f13 = ((float) this.f11324o) + this.f11309B.y;
            f11 = this.f11327r + f20;
            f14 = (float) this.f11321l;
            int i31 = this.f11324o;
            f15 = (float) i31;
            m9909a(this.f11333x, 0.0f, (float) i31);
            int i32 = this.f11321l;
            f16 = (float) (i21 - i32);
            m9909a(this.f11334y, 0.0f, (float) (i21 - (i32 * 2)));
            f12 = f13;
            f8 = f9;
            f19 = 90.0f;
            f17 = 0.0f;
            f6 = f5;
            f10 = f8;
        } else if (i22 != 8388611 ? i22 != 8388613 || !z2 : z2) {
            f22 = (float) i20;
            int i33 = this.f11321l;
            f = (float) i33;
            m9909a(this.f11331v, (float) (i20 - (i33 * 2)), 0.0f);
            int i34 = this.f11324o;
            f2 = (float) (this.f11321l + i34);
            m9909a(this.f11332w, (float) i34, 0.0f);
            f4 = ((float) this.f11324o) + this.f11309B.x;
            f5 = (((float) (i21 - this.f11323n)) / 2.0f) + this.f11309B.y;
            f6 = this.f11327r + f5;
            f7 = this.f11309B.x + 0.0f;
            f16 = (float) i21;
            f8 = (f16 / 2.0f) + this.f11309B.y;
            float f26 = this.f11328s;
            f9 = f8 - f26;
            f10 = f26 + f8;
            f20 = this.f11309B.x + ((float) this.f11324o);
            f12 = this.f11309B.y + (((float) (this.f11323n + i21)) / 2.0f);
            f13 = f12 - this.f11327r;
            int i35 = this.f11324o;
            f14 = (float) i35;
            int i36 = this.f11321l;
            f15 = (float) (i21 - i36);
            m9909a(this.f11333x, (float) i35, (float) (i21 - (i36 * 2)));
            int i37 = this.f11321l;
            f17 = (float) (i20 - i37);
            m9909a(this.f11334y, (float) (i20 - (i37 * 2)), (float) (i21 - (i37 * 2)));
            f19 = 0.0f;
            f11 = f20;
            f18 = f7;
            f3 = 0.0f;
            f21 = f18;
            f23 = f4;
        } else {
            int i38 = this.f11321l;
            f = (float) (i21 - i38);
            m9909a(this.f11331v, 0.0f, (float) (i21 - (i38 * 2)));
            int i39 = this.f11321l;
            int i40 = this.f11324o;
            f2 = (float) ((i20 - i39) - i40);
            f3 = (float) i21;
            m9909a(this.f11332w, (float) ((i20 - (i39 * 2)) - i40), (float) (i21 - (i39 * 2)));
            f4 = ((float) (i20 - this.f11324o)) + this.f11309B.x;
            f5 = (((float) (this.f11323n + i21)) / 2.0f) + this.f11309B.y;
            f6 = f5 - this.f11327r;
            f7 = ((float) i20) + this.f11309B.x;
            f8 = (f3 / 2.0f) + this.f11309B.y;
            float f27 = this.f11328s;
            f9 = f8 + f27;
            f10 = f8 - f27;
            f11 = ((float) (i20 - this.f11324o)) + this.f11309B.x;
            f12 = this.f11309B.y + (((float) (i21 - this.f11323n)) / 2.0f);
            f13 = this.f11327r + f12;
            int i41 = this.f11324o;
            f14 = (float) (i20 - i41);
            int i42 = this.f11321l;
            f15 = (float) i42;
            f16 = 0.0f;
            m9909a(this.f11333x, (float) ((i20 - i41) - (i42 * 2)), 0.0f);
            f17 = (float) this.f11321l;
            m9909a(this.f11334y, 0.0f, 0.0f);
            f18 = f7;
            f19 = 180.0f;
            f20 = f11;
            f21 = f18;
            f22 = 0.0f;
            f23 = f4;
        }
        this.f11320k.moveTo(f22, f);
        this.f11320k.arcTo(this.f11331v, f19, -90.0f);
        this.f11320k.lineTo(f2, f3);
        this.f11320k.arcTo(this.f11332w, f19 - 90.0f, -90.0f);
        this.f11320k.lineTo(f23, f5);
        this.f11320k.cubicTo(f4, f6, f21, f9, f18, f8);
        this.f11320k.cubicTo(f7, f10, f11, f13, f20, f12);
        this.f11320k.lineTo(f14, f15);
        this.f11320k.arcTo(this.f11333x, f19 - 180.0f, -90.0f);
        this.f11320k.lineTo(f17, f16);
        this.f11320k.arcTo(this.f11334y, f19 - 270.0f, -90.0f);
        this.f11320k.close();
        this.f11319j.x = ((float) this.f11314e.left) + f18;
        this.f11319j.y = ((float) this.f11314e.top) + f8;
        setPivotX(this.f11319j.x);
        setPivotY(this.f11319j.y);
    }

    /* renamed from: a */
    private void m9909a(RectF rectF, float f, float f2) {
        int i = this.f11321l;
        rectF.set(f, f2, ((float) (i * 2)) + f, ((float) (i * 2)) + f2);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        MethodCollector.m26663i(9696);
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            MethodCollector.m26664o(9696);
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("TooltipOutlineLayout can host only one direct child");
        MethodCollector.m26664o(9696);
        throw illegalStateException;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0080, code lost:
        if (r7 != false) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0082, code lost:
        r3 = r3 + r8.f11324o;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0087, code lost:
        if (r7 != false) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008c, code lost:
        if (r7 != false) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0032, code lost:
        if (r7 != false) goto L_0x0034;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x003b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onLayout(boolean r9, int r10, int r11, int r12, int r13) {
        /*
        // Method dump skipped, instructions count: 146
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.design.view.C4093g.onLayout(boolean, int, int, int, int):void");
    }
}
