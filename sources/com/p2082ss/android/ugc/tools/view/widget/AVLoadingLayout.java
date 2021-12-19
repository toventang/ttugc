package com.p2082ss.android.ugc.tools.view.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.C70636dh;
import com.p2082ss.android.ugc.tools.view.p4365d.AbstractC84953a;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.tools.view.widget.AVLoadingLayout */
public class AVLoadingLayout extends FrameLayout implements AbstractC84953a, AbstractC85057l {

    /* renamed from: a */
    private View f190037a;

    /* renamed from: b */
    private FrameLayout f190038b;

    /* renamed from: c */
    private int f190039c;

    /* renamed from: d */
    private boolean f190040d;

    /* renamed from: e */
    private int f190041e;

    static {
        Covode.recordClassIndex(98995);
    }

    /* renamed from: a */
    private void m146065a() {
        if (this.f190040d) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f190038b.getLayoutParams();
            int i = layoutParams.height;
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            layoutParams.gravity = 49;
            layoutParams.topMargin = (((C70636dh.m124828a(getContext()) - this.f190041e) - iArr[1]) / 2) - (i / 2);
            this.f190038b.setLayoutParams(layoutParams);
        }
    }

    public AVLoadingLayout(Context context) {
        this(context, null);
    }

    @Override // com.p2082ss.android.ugc.tools.view.p4365d.AbstractC84953a
    /* renamed from: a */
    public final void mo129712a(int i) {
        if (this.f190039c != i) {
            this.f190039c = i;
        }
    }

    @Override // com.p2082ss.android.ugc.tools.view.widget.AbstractC85057l
    public void setUseScreenHeight(int i) {
        this.f190040d = true;
        this.f190041e = i;
        m146065a();
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        View view = this.f190037a;
        if (view != null) {
            view.setVisibility(i);
        }
    }

    public void setProgressBarInfo(int i) {
        if (i > 0) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f190037a.getLayoutParams();
            layoutParams.width = i;
            layoutParams.height = i;
            this.f190037a.setLayoutParams(layoutParams);
        }
    }

    public AVLoadingLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private AVLoadingLayout(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(898);
        this.f190039c = C63244g.m114602a().mo73259E().mo93881a();
        View a = C1764a.m5927a(LayoutInflater.from(context), R.layout.b3t, this, true);
        this.f190037a = a.findViewById(R.id.anz);
        this.f190038b = (FrameLayout) a.findViewById(R.id.d_5);
        MethodCollector.m26664o(898);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m146065a();
    }
}
