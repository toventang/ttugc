package com.lynx.tasm.behavior.p2052ui.list;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.p037h.C0792v;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.p2052ui.view.C28698a;
import com.lynx.tasm.behavior.p2052ui.view.UIComponent;

/* renamed from: com.lynx.tasm.behavior.ui.list.h */
public final class C28644h extends RecyclerView.ViewHolder {

    /* renamed from: a */
    final C28645a f67449a;

    static {
        Covode.recordClassIndex(34703);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo49586a() {
        if (this.f67449a.f67451b != null) {
            this.f67449a.removeAllViews();
            this.f67449a.f67451b = null;
        }
    }

    public C28644h(C28645a aVar) {
        super(aVar);
        this.f67449a = aVar;
    }

    /* renamed from: a */
    public final void mo49587a(int i) {
        if (i > 0) {
            this.f67449a.f67453d = i;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.tasm.behavior.ui.list.h$a */
    public static class C28645a extends FrameLayout {

        /* renamed from: a */
        int f67450a;

        /* renamed from: b */
        public UIComponent f67451b;

        /* renamed from: c */
        public int f67452c;

        /* renamed from: d */
        public int f67453d = 400;

        static {
            Covode.recordClassIndex(34704);
        }

        public C28645a(Context context) {
            super(context);
            MethodCollector.m26663i(4428);
            MethodCollector.m26664o(4428);
        }

        /* access modifiers changed from: protected */
        public final void onMeasure(int i, int i2) {
            int measuredWidth;
            int measuredHeight;
            if (this.f67450a == 0) {
                measuredWidth = View.MeasureSpec.getSize(i);
                measuredHeight = this.f67453d;
            } else {
                UIComponent uIComponent = this.f67451b;
                if (uIComponent != null) {
                    uIComponent.measure();
                    if (2 == this.f67450a) {
                        this.f67450a = 3;
                    }
                    measuredWidth = this.f67451b.getWidth() + this.f67451b.mMarginLeft + this.f67451b.mMarginRight;
                    measuredHeight = this.f67451b.getHeight() + this.f67451b.mMarginTop + this.f67451b.mMarginBottom;
                } else {
                    measuredWidth = getMeasuredWidth();
                    measuredHeight = getMeasuredHeight();
                }
            }
            setMeasuredDimension(measuredWidth, measuredHeight);
            if (UIList.f67360h) {
                LLog.m56856a(4, "UIList", C1764a.m5928a("WrapView %d (w %d, h %d), mLayoutStatus %d", new Object[]{Integer.valueOf(this.f67452c), Integer.valueOf(getMeasuredWidth()), Integer.valueOf(getMeasuredHeight()), Integer.valueOf(this.f67450a)}));
            }
        }

        /* access modifiers changed from: protected */
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            UIComponent uIComponent = this.f67451b;
            if (uIComponent != null) {
                uIComponent.setTop(0);
                this.f67451b.setLeft(0);
                this.f67451b.layout();
                int i5 = this.f67451b.mMarginLeft;
                int i6 = this.f67451b.mMarginTop;
                ((C28698a) this.f67451b.mView).layout(i5, i6, this.f67451b.getWidth() + i5, this.f67451b.getHeight() + i6);
                if (this.f67451b.getOverflow() != 0) {
                    ((ViewGroup) getParent()).setClipChildren(false);
                }
                Rect x = C0792v.m2790x(this.f67451b.mView);
                if (x != null) {
                    x.set(Math.min(x.left, i), Math.min(x.top, i2), Math.max(x.right, i3), Math.max(x.bottom, i4));
                    C0792v.m2745a(this, x);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo49588a(UIComponent uIComponent) {
        this.f67449a.f67451b = uIComponent;
        this.f67449a.addView(uIComponent.mView, new FrameLayout.LayoutParams(-1, -2));
        this.f67449a.f67452c = getAdapterPosition();
    }
}
