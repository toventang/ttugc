package com.bytedance.android.livesdk.container.custom;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.livesdk.container.custom.p506a.AbstractC8233a;
import com.bytedance.android.livesdk.container.custom.p506a.AbstractC8234b;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

public final class ContainerCoordinatorLayout extends CoordinatorLayout implements AbstractC8233a {

    /* renamed from: h */
    private final List<AbstractC8234b> f20449h;

    /* renamed from: i */
    private final int f20450i;

    /* renamed from: j */
    private final int f20451j;

    /* renamed from: k */
    private int f20452k;

    /* renamed from: l */
    private int f20453l;

    /* renamed from: m */
    private final int f20454m;

    /* renamed from: n */
    private Rect f20455n;

    /* renamed from: o */
    private Window f20456o;

    static {
        Covode.recordClassIndex(9067);
    }

    public ContainerCoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final int getLastHeightMeasureSpec() {
        return this.f20453l;
    }

    public final Rect getRect() {
        return this.f20455n;
    }

    @Override // com.bytedance.android.livesdk.container.custom.p506a.AbstractC8233a
    /* renamed from: a */
    public final void mo14580a() {
        this.f20449h.clear();
    }

    public final void setLastHeightMeasureSpec(int i) {
        this.f20453l = i;
    }

    public final void setOwnerWindow(Window window) {
        this.f20456o = window;
    }

    public final void setRect(Rect rect) {
        C89219l.m154721d(rect, "");
        this.f20455n = rect;
    }

    @Override // com.bytedance.android.livesdk.container.custom.p506a.AbstractC8233a
    /* renamed from: a */
    public final void mo14581a(AbstractC8234b bVar) {
        C89219l.m154721d(bVar, "");
        this.f20449h.add(bVar);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout
    public final void onMeasure(int i, int i2) {
        int i3;
        this.f20453l = i2;
        Window window = this.f20456o;
        if (window == null) {
            super.onMeasure(i, i2);
            return;
        }
        View decorView = window.getDecorView();
        C89219l.m154716b(decorView, "");
        boolean z = false;
        this.f20455n.set(0, 0, 0, 0);
        decorView.getWindowVisibleDisplayFrame(this.f20455n);
        int i4 = this.f20455n.bottom;
        int i5 = this.f20454m;
        if (i5 - i4 > i5 / 6) {
            z = true;
            i3 = this.f20451j;
        } else {
            i3 = this.f20450i;
        }
        if (i3 != this.f20452k) {
            if (z) {
                Iterator<T> it = this.f20449h.iterator();
                while (it.hasNext()) {
                    it.next().mo14587a(this);
                }
            } else {
                Iterator<T> it2 = this.f20449h.iterator();
                while (it2.hasNext()) {
                    it2.next().mo14588b(this);
                }
            }
            this.f20452k = i3;
        }
        super.onMeasure(i, i2);
    }

    private /* synthetic */ ContainerCoordinatorLayout(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private ContainerCoordinatorLayout(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        this.f20449h = new ArrayList();
        this.f20450i = 2;
        this.f20451j = 1;
        this.f20452k = 2;
        this.f20454m = C3966y.m9662b() - C3966y.m9666d();
        this.f20455n = new Rect();
    }
}
