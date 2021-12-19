package com.bytedance.ies.dmt.p1194ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.common.AbstractC17178d;
import com.bytedance.ies.dmt.p1194ui.common.C17175b;
import com.bytedance.ies.dmt.p1194ui.p1200f.C17234b;
import com.p084a.p088b.C1862a;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.ies.dmt.ui.widget.DmtLoadingLayout */
public class DmtLoadingLayout extends FrameLayout implements AbstractC17178d, AbstractC17279h {

    /* renamed from: a */
    private View f41288a;

    /* renamed from: b */
    private FrameLayout f41289b;

    /* renamed from: c */
    private int f41290c;

    /* renamed from: d */
    private boolean f41291d;

    /* renamed from: e */
    private int f41292e;

    static {
        Covode.recordClassIndex(19740);
    }

    /* renamed from: a */
    private void m31887a() {
        if (this.f41291d) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f41289b.getLayoutParams();
            int i = layoutParams.height;
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            layoutParams.gravity = 49;
            layoutParams.topMargin = (((C17234b.m31808b(getContext()) - this.f41292e) - iArr[1]) / 2) - (i / 2);
            this.f41289b.setLayoutParams(layoutParams);
        }
    }

    public DmtLoadingLayout(Context context) {
        this(context, null);
    }

    @Override // com.bytedance.ies.dmt.p1194ui.common.AbstractC17178d
    /* renamed from: a */
    public final void mo27128a(int i) {
        if (this.f41290c != i) {
            this.f41290c = i;
        }
    }

    @Override // com.bytedance.ies.dmt.p1194ui.widget.AbstractC17279h
    public void setUseScreenHeight(int i) {
        this.f41291d = true;
        this.f41292e = i;
        m31887a();
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        View view = this.f41288a;
        if (view != null) {
            view.setVisibility(i);
        }
    }

    public void setProgressBarInfo(int i) {
        if (i > 0) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f41288a.getLayoutParams();
            layoutParams.width = i;
            layoutParams.height = i;
            this.f41288a.setLayoutParams(layoutParams);
        }
    }

    public DmtLoadingLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public DmtLoadingLayout(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(7202);
        this.f41290c = C17175b.C17176a.f40922a.f40921a;
        View a = C1862a.m6032a(context, R.layout.ag1, this, true);
        this.f41288a = a.findViewById(R.id.anz);
        this.f41289b = (FrameLayout) a.findViewById(R.id.d_5);
        MethodCollector.m26664o(7202);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m31887a();
    }
}
