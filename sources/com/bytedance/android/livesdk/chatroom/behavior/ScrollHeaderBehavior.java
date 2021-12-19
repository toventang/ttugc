package com.bytedance.android.livesdk.chatroom.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

public final class ScrollHeaderBehavior extends CoordinatorLayout.AbstractC0557b<View> {

    /* renamed from: a */
    public AbstractC89172b<? super View, C89391z> f18250a;

    /* renamed from: b */
    private float f18251b;

    static {
        Covode.recordClassIndex(8129);
    }

    public ScrollHeaderBehavior() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScrollHeaderBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C89219l.m154721d(context, "");
        C89219l.m154721d(attributeSet, "");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: a */
    public final boolean mo2529a(CoordinatorLayout coordinatorLayout, View view, View view2) {
        C89219l.m154721d(coordinatorLayout, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(view2, "");
        return C89219l.m154714a(view2, coordinatorLayout.findViewWithTag("suctionBottomView"));
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: b */
    public final boolean mo2533b(CoordinatorLayout coordinatorLayout, View view, View view2) {
        C89219l.m154721d(coordinatorLayout, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(view2, "");
        if (this.f18251b == view2.getTranslationY()) {
            return false;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = (int) (((float) coordinatorLayout.getMeasuredHeight()) + view2.getTranslationY());
        view.setLayoutParams(layoutParams);
        AbstractC89172b<? super View, C89391z> bVar = this.f18250a;
        if (bVar == null) {
            return false;
        }
        bVar.invoke(view2);
        return false;
    }
}
