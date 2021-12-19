package com.bytedance.android.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import p4600h.p4611f.p4613b.C89219l;

public final class WidgetContainer extends View {

    /* renamed from: a */
    C12237a f29492a;

    static {
        Covode.recordClassIndex(13970);
    }

    public WidgetContainer(Context context) {
        this(context, (AttributeSet) null, 6);
    }

    public WidgetContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    /* renamed from: a */
    static boolean m22021a(int i) {
        return (i == -1 || i == -2) ? false : true;
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(Canvas canvas) {
        C89219l.m154719c(canvas, "");
    }

    public final void draw(Canvas canvas) {
        C89219l.m154719c(canvas, "");
    }

    /* renamed from: a */
    public final void mo19713a(View view) {
        ViewParent viewParent;
        MethodCollector.m26663i(1992);
        if (getParent() != null) {
            MethodCollector.m26664o(1992);
            return;
        }
        ViewGroup viewGroup = null;
        if (view != null) {
            viewParent = view.getParent();
        } else {
            viewParent = null;
        }
        if (!(viewParent instanceof ViewGroup)) {
            viewParent = null;
        }
        ViewGroup viewGroup2 = (ViewGroup) viewParent;
        if (viewGroup2 != null) {
            viewGroup2.removeView(view);
        }
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            viewGroup = parent;
        }
        ViewGroup viewGroup3 = viewGroup;
        if (viewGroup3 != null) {
            viewGroup3.removeView(this);
        }
        C12237a aVar = this.f29492a;
        if (aVar == null) {
            MethodCollector.m26664o(1992);
            return;
        }
        setId(aVar.f29496d);
        if (view != null) {
            view.setId(-1);
        }
        setVisibility(aVar.f29497e);
        ViewGroup viewGroup4 = aVar.f29498f;
        int i = aVar.f29495c;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = aVar.f29494b;
        layoutParams.height = aVar.f29493a;
        viewGroup4.addView(this, i, layoutParams);
        MethodCollector.m26664o(1992);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    private WidgetContainer(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(1995);
        setWillNotDraw(true);
        MethodCollector.m26664o(1995);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private /* synthetic */ WidgetContainer(Context context, AttributeSet attributeSet, int i) {
        this(context, (i & 2) != 0 ? null : attributeSet, (byte) 0);
    }

    /* renamed from: com.bytedance.android.widget.WidgetContainer$a */
    static final class C12237a {

        /* renamed from: a */
        public int f29493a;

        /* renamed from: b */
        public int f29494b;

        /* renamed from: c */
        public int f29495c;

        /* renamed from: d */
        public int f29496d;

        /* renamed from: e */
        public int f29497e;

        /* renamed from: f */
        public ViewGroup f29498f;

        static {
            Covode.recordClassIndex(13971);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C12237a) {
                    C12237a aVar = (C12237a) obj;
                    if (!(this.f29493a == aVar.f29493a && this.f29494b == aVar.f29494b && this.f29495c == aVar.f29495c && this.f29496d == aVar.f29496d && this.f29497e == aVar.f29497e && C89219l.m154714a(this.f29498f, aVar.f29498f))) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            int i = ((((((((this.f29493a * 31) + this.f29494b) * 31) + this.f29495c) * 31) + this.f29496d) * 31) + this.f29497e) * 31;
            ViewGroup viewGroup = this.f29498f;
            return i + (viewGroup != null ? viewGroup.hashCode() : 0);
        }

        public final String toString() {
            return "OriginLayoutParam(height=" + this.f29493a + ", width=" + this.f29494b + ", index=" + this.f29495c + ", id=" + this.f29496d + ", visibility=" + this.f29497e + ", parent=" + this.f29498f + ")";
        }

        public C12237a(int i, int i2, int i3, int i4, int i5, ViewGroup viewGroup) {
            C89219l.m154719c(viewGroup, "");
            this.f29493a = i;
            this.f29494b = i2;
            this.f29495c = i3;
            this.f29496d = i4;
            this.f29497e = i5;
            this.f29498f = viewGroup;
        }
    }
}
