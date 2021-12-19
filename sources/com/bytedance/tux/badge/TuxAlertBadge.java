package com.bytedance.tux.badge;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

public final class TuxAlertBadge extends View implements AbstractC22994b {

    /* renamed from: a */
    public static final C22991a f54382a = new C22991a((byte) 0);

    /* renamed from: b */
    private final C22995c f54383b;

    /* renamed from: c */
    private int f54384c;

    /* renamed from: d */
    private int f54385d;

    /* renamed from: e */
    private int f54386e;

    static {
        Covode.recordClassIndex(26908);
    }

    public TuxAlertBadge(Context context) {
        this(context, null, 0, 6);
    }

    public TuxAlertBadge(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4);
    }

    /* renamed from: com.bytedance.tux.badge.TuxAlertBadge$a */
    public static final class C22991a {
        static {
            Covode.recordClassIndex(26909);
        }

        private C22991a() {
        }

        public /* synthetic */ C22991a(byte b) {
            this();
        }
    }

    public final int getCount() {
        return this.f54385d;
    }

    public final int getMaxCount() {
        return this.f54386e;
    }

    public final int getVariant() {
        return this.f54384c;
    }

    public final int getDotSize() {
        return this.f54383b.f54410i;
    }

    /* renamed from: a */
    private final void m43364a() {
        this.f54383b.mo37337a(C22993a.m43371a(getVariant(), getMaxCount(), getCount()));
        requestLayout();
    }

    @Override // com.bytedance.tux.badge.AbstractC22994b
    public final void setCount(int i) {
        this.f54385d = i;
        m43364a();
    }

    @Override // com.bytedance.tux.badge.AbstractC22994b
    public final void setMaxCount(int i) {
        this.f54386e = i;
        m43364a();
    }

    @Override // com.bytedance.tux.badge.AbstractC22994b
    public final void setVariant(int i) {
        this.f54384c = i;
        m43364a();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        C89219l.m154719c(canvas, "");
        this.f54383b.draw(canvas);
    }

    @Override // com.bytedance.tux.badge.AbstractC22994b
    public final void setDotSize(int i) {
        this.f54383b.f54410i = i;
        if (this.f54383b.f54405d.length() == 0) {
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        MethodCollector.m26663i(9970);
        this.f54383b.mo37336a();
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f54383b.f54404c, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f54383b.f54403b, 1073741824));
        MethodCollector.m26664o(9970);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private TuxAlertBadge(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C89219l.m154719c(context, "");
        MethodCollector.m26663i(10121);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.cr, R.attr.cs, R.attr.ct, R.attr.aoc, R.attr.aod, R.attr.aoe, R.attr.aoi}, i, 0);
        C89219l.m154709a((Object) obtainStyledAttributes, "");
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        this.f54383b = C22993a.m43370a(obtainStyledAttributes, -1, -16777216, C89241a.m154730a(TypedValue.applyDimension(1, 8.0f, system.getDisplayMetrics())));
        setVariant(obtainStyledAttributes.getInt(6, 0));
        setCount(obtainStyledAttributes.getInt(3, 0));
        setMaxCount(obtainStyledAttributes.getInt(5, 0));
        obtainStyledAttributes.recycle();
        m43364a();
        MethodCollector.m26664o(10121);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TuxAlertBadge(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R.attr.bn : i);
    }
}
