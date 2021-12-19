package com.p2082ss.android.ugc.aweme.account.login;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.account.login.g */
public final class C31928g {
    static {
        Covode.recordClassIndex(38672);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.g$a */
    static class C31929a extends ViewPager.C1582h {

        /* renamed from: a */
        private final ViewPager f76272a;

        /* renamed from: b */
        private final ViewPagerBottomSheetBehavior<View> f76273b;

        static {
            Covode.recordClassIndex(38673);
        }

        @Override // androidx.viewpager.widget.ViewPager.C1582h, androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageSelected(int i) {
            ViewPager viewPager = this.f76272a;
            ViewPagerBottomSheetBehavior<View> viewPagerBottomSheetBehavior = this.f76273b;
            viewPagerBottomSheetBehavior.getClass();
            viewPager.post(new RunnableC31939h(viewPagerBottomSheetBehavior));
        }

        private C31929a(ViewPager viewPager, View view) {
            this.f76272a = viewPager;
            this.f76273b = ViewPagerBottomSheetBehavior.m66141b(view);
        }

        /* synthetic */ C31929a(ViewPager viewPager, View view, byte b) {
            this(viewPager, view);
        }
    }

    /* renamed from: a */
    public static void m66295a(ViewPager viewPager) {
        View view = viewPager;
        while (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (!(layoutParams instanceof CoordinatorLayout.C0560e) || !(((CoordinatorLayout.C0560e) layoutParams).f2416a instanceof ViewPagerBottomSheetBehavior)) {
                ViewParent parent = view.getParent();
                if (parent != null && (parent instanceof View)) {
                    view = (View) parent;
                } else {
                    return;
                }
            } else {
                viewPager.addOnPageChangeListener(new C31929a(viewPager, view, (byte) 0));
                return;
            }
        }
    }
}
