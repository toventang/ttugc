package com.p2082ss.android.ugc.aweme.choosemusic.activity;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.activity.MusicBottomSheetBehavior */
public final class MusicBottomSheetBehavior<V extends View> extends ViewPagerBottomSheetBehavior<V> {

    /* renamed from: n */
    public boolean f84278n;

    static {
        Covode.recordClassIndex(42956);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MusicBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C89219l.m154721d(context, "");
        C89219l.m154721d(attributeSet, "");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b, com.p2082ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior
    /* renamed from: a */
    public final boolean mo2528a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        C89219l.m154721d(coordinatorLayout, "");
        C89219l.m154721d(v, "");
        C89219l.m154721d(motionEvent, "");
        if (this.f84278n) {
            return false;
        }
        return super.mo2528a(coordinatorLayout, (View) v, motionEvent);
    }
}
