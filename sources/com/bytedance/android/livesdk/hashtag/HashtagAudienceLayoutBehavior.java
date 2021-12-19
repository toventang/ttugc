package com.bytedance.android.livesdk.hashtag;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.bytedance.covode.number.Covode;
import com.google.android.material.appbar.AppBarLayout;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

public final class HashtagAudienceLayoutBehavior extends AppBarLayout.ScrollingViewBehavior {
    static {
        Covode.recordClassIndex(9814);
    }

    public HashtagAudienceLayoutBehavior() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HashtagAudienceLayoutBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C89219l.m154721d(context, "");
        C89219l.m154721d(attributeSet, "");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b, com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior
    /* renamed from: b */
    public final boolean mo2533b(CoordinatorLayout coordinatorLayout, View view, View view2) {
        C89219l.m154721d(coordinatorLayout, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(view2, "");
        if (!(view2 instanceof AppBarLayout)) {
            return super.mo2533b(coordinatorLayout, view, view2);
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        CoordinatorLayout.C0560e eVar = (CoordinatorLayout.C0560e) layoutParams;
        eVar.height = coordinatorLayout.getHeight() - ((AppBarLayout) view2).getBottom();
        view.setLayoutParams(eVar);
        return super.mo2533b(coordinatorLayout, view, view2);
    }
}
