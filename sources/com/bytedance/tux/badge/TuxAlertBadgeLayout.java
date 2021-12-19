package com.bytedance.tux.badge;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

public final class TuxAlertBadgeLayout extends FrameLayout implements AbstractC22994b {

    /* renamed from: c */
    public static final int f54387c;

    /* renamed from: d */
    public static final C22992a f54388d = new C22992a((byte) 0);

    /* renamed from: a */
    public boolean f54389a;

    /* renamed from: b */
    public boolean f54390b;

    /* renamed from: e */
    private final C22995c f54391e;

    /* renamed from: f */
    private int f54392f;

    /* renamed from: g */
    private int f54393g;

    /* renamed from: h */
    private int f54394h;

    /* renamed from: i */
    private int f54395i;

    /* renamed from: j */
    private int f54396j;

    /* renamed from: k */
    private int f54397k;

    /* renamed from: l */
    private View f54398l;

    /* renamed from: m */
    private int f54399m;

    /* renamed from: n */
    private int f54400n;

    public TuxAlertBadgeLayout(Context context) {
        this(context, (AttributeSet) null, 6);
    }

    public TuxAlertBadgeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    /* renamed from: com.bytedance.tux.badge.TuxAlertBadgeLayout$a */
    public static final class C22992a {
        static {
            Covode.recordClassIndex(26911);
        }

        private C22992a() {
        }

        public /* synthetic */ C22992a(byte b) {
            this();
        }
    }

    public final int getAttachTo() {
        return this.f54395i;
    }

    public final int getCount() {
        return this.f54393g;
    }

    public final int getMaxCount() {
        return this.f54394h;
    }

    public final int getOffsetX() {
        return this.f54396j;
    }

    public final int getOffsetY() {
        return this.f54397k;
    }

    public final int getVariant() {
        return this.f54392f;
    }

    /* renamed from: a */
    public final void mo37319a() {
        this.f54390b = true;
        invalidate();
    }

    /* renamed from: b */
    public final void mo37320b() {
        this.f54390b = false;
        invalidate();
    }

    public final int getDotSize() {
        return this.f54391e.f54410i;
    }

    /* renamed from: c */
    private final void m43366c() {
        this.f54391e.mo37337a(C22993a.m43371a(getVariant(), getMaxCount(), getCount()));
        this.f54391e.mo37336a();
        requestLayout();
    }

    static {
        Covode.recordClassIndex(26910);
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        f54387c = C89241a.m154730a(TypedValue.applyDimension(1, 8.0f, system.getDisplayMetrics()));
    }

    @Override // com.bytedance.tux.badge.AbstractC22994b
    public final void setCount(int i) {
        this.f54393g = i;
        m43366c();
    }

    @Override // com.bytedance.tux.badge.AbstractC22994b
    public final void setMaxCount(int i) {
        this.f54394h = i;
        m43366c();
    }

    public final void setOffsetX(int i) {
        this.f54396j = i;
        requestLayout();
    }

    public final void setOffsetY(int i) {
        this.f54397k = i;
        requestLayout();
    }

    public final void setTopmost(boolean z) {
        this.f54389a = z;
        invalidate();
    }

    @Override // com.bytedance.tux.badge.AbstractC22994b
    public final void setVariant(int i) {
        this.f54392f = i;
        m43366c();
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(Canvas canvas) {
        C89219l.m154719c(canvas, "");
        super.dispatchDraw(canvas);
        if (this.f54389a) {
            m43365a(canvas);
        }
    }

    /* renamed from: a */
    private final void m43365a(Canvas canvas) {
        if (this.f54390b) {
            canvas.save();
            canvas.translate((float) this.f54399m, (float) this.f54400n);
            this.f54391e.draw(canvas);
            canvas.restore();
        }
    }

    public final void setAttachTo(int i) {
        View findViewById;
        this.f54395i = i;
        if (i == -1) {
            findViewById = null;
        } else {
            findViewById = findViewById(i);
        }
        this.f54398l = findViewById;
        requestLayout();
    }

    @Override // com.bytedance.tux.badge.AbstractC22994b
    public final void setDotSize(int i) {
        this.f54391e.f54410i = i;
        if (this.f54391e.f54405d.length() == 0) {
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        MethodCollector.m26663i(10298);
        this.f54391e.mo37336a();
        super.onMeasure(i, i2);
        MethodCollector.m26664o(10298);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private /* synthetic */ TuxAlertBadgeLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, (i & 2) != 0 ? null : attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public final boolean drawChild(Canvas canvas, View view, long j) {
        C89219l.m154719c(canvas, "");
        boolean drawChild = super.drawChild(canvas, view, j);
        if (!this.f54389a && C89219l.m154714a(view, this.f54398l)) {
            m43365a(canvas);
        }
        return drawChild;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private TuxAlertBadgeLayout(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        C89219l.m154719c(context, "");
        MethodCollector.m26663i(10449);
        this.f54395i = -1;
        this.f54390b = true;
        this.f54391e = C22993a.m43369a(context, attributeSet, 0, 0, 0, 60);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.aob, R.attr.aoc, R.attr.aod, R.attr.aoe, R.attr.aof, R.attr.aog, R.attr.aoh, R.attr.aoi}, 0, 0);
        setVariant(obtainStyledAttributes.getInt(7, 0));
        setCount(obtainStyledAttributes.getInt(1, 0));
        setMaxCount(obtainStyledAttributes.getInt(3, 0));
        setAttachTo(obtainStyledAttributes.getResourceId(0, -1));
        setTopmost(obtainStyledAttributes.getBoolean(6, false));
        setOffsetX(obtainStyledAttributes.getDimensionPixelOffset(4, 0));
        setOffsetY(obtainStyledAttributes.getDimensionPixelOffset(5, 0));
        obtainStyledAttributes.recycle();
        MethodCollector.m26664o(10449);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onLayout(boolean r8, int r9, int r10, int r11, int r12) {
        /*
        // Method dump skipped, instructions count: 201
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.tux.badge.TuxAlertBadgeLayout.onLayout(boolean, int, int, int, int):void");
    }
}
