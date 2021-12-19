package com.p2082ss.android.ugc.aweme.feed.adapter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewPropertyAnimator;
import android.widget.RelativeLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.WidgetContainerMonitorView */
public final class WidgetContainerMonitorView extends RelativeLayout {

    /* renamed from: a */
    public boolean f111524a;

    static {
        Covode.recordClassIndex(56876);
    }

    public WidgetContainerMonitorView(Context context) {
        this(context, (AttributeSet) null, 6);
    }

    public WidgetContainerMonitorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final ViewPropertyAnimator animate() {
        this.f111524a = true;
        ViewPropertyAnimator animate = super.animate();
        C89219l.m154716b(animate, "");
        return animate;
    }

    public final void setAnimate(boolean z) {
        this.f111524a = z;
    }

    public final void setAlpha(float f) {
        super.setAlpha(f);
        if (f == 0.0f) {
            C48245ck.m91654a(-1, 0.0f, false);
        }
    }

    public final void setHasTransientState(boolean z) {
        super.setHasTransientState(z);
        if (z && this.f111524a) {
            C48245ck.m91654a(getVisibility(), getAlpha(), this.f111524a);
        }
    }

    public final void setVisibility(int i) {
        if (i != 0) {
            try {
                C48245ck.m91654a(i, -1.0f, false);
            } catch (Exception unused) {
            }
        } else if (getAlpha() == 0.0f) {
            C48245ck.m91654a(i, getAlpha(), false);
        }
        super.setVisibility(i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private WidgetContainerMonitorView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(5121);
        MethodCollector.m26664o(5121);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private /* synthetic */ WidgetContainerMonitorView(Context context, AttributeSet attributeSet, int i) {
        this(context, (i & 2) != 0 ? null : attributeSet, (byte) 0);
    }
}
