package com.p2082ss.android.ugc.aweme.tools.mvtemplate.thumbnail;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.DoubleColorBallAnimationView;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.thumbnail.NoDisappearDoubleColorBallAnimationView */
public final class NoDisappearDoubleColorBallAnimationView extends DoubleColorBallAnimationView {
    static {
        Covode.recordClassIndex(92159);
    }

    public NoDisappearDoubleColorBallAnimationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getVisibility() == 0) {
            mo27419a();
        }
    }

    private /* synthetic */ NoDisappearDoubleColorBallAnimationView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private NoDisappearDoubleColorBallAnimationView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
    }
}
