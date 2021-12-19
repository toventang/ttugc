package com.p2082ss.android.ugc.tools.infosticker.view.internal.main;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84641b;
import com.p2082ss.android.ugc.tools.view.widget.ViewPagerBottomSheetBehavior;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4591l.C88960c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.b */
public final class C84727b implements AbstractC84641b {

    /* renamed from: a */
    public final C88960c<AbstractC84641b.EnumC84642a> f189319a;

    /* renamed from: b */
    private final ViewPagerBottomSheetBehavior<View> f189320b;

    static {
        Covode.recordClassIndex(98703);
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84641b
    /* renamed from: a */
    public final AbstractC88979t<AbstractC84641b.EnumC84642a> mo129556a() {
        AbstractC88979t<AbstractC84641b.EnumC84642a> c = this.f189319a.mo143283c();
        C89219l.m154716b(c, "");
        return c;
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84641b
    /* renamed from: a */
    public final void mo129557a(boolean z) {
        int i;
        ViewPagerBottomSheetBehavior<View> viewPagerBottomSheetBehavior = this.f189320b;
        if (viewPagerBottomSheetBehavior != null) {
            if (z) {
                i = 3;
            } else {
                i = 5;
            }
            viewPagerBottomSheetBehavior.mo129924c(i);
        }
    }

    public C84727b(View view, ViewPager viewPager, boolean z) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(viewPager, "");
        C88960c<AbstractC84641b.EnumC84642a> cVar = new C88960c<>();
        C89219l.m154716b(cVar, "");
        this.f189319a = cVar;
        CoordinatorLayout.C0560e eVar = null;
        if (z) {
            ViewPagerBottomSheetBehavior<View> viewPagerBottomSheetBehavior = new ViewPagerBottomSheetBehavior<>(view.getContext());
            this.f189320b = viewPagerBottomSheetBehavior;
            viewPagerBottomSheetBehavior.mo129922b(0);
            viewPagerBottomSheetBehavior.f190138f = true;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            CoordinatorLayout.C0560e eVar2 = layoutParams instanceof CoordinatorLayout.C0560e ? layoutParams : eVar;
            if (eVar2 != null) {
                eVar2.mo2538a(viewPagerBottomSheetBehavior);
            }
            viewPagerBottomSheetBehavior.mo129919a(viewPager);
            viewPagerBottomSheetBehavior.f190145m = new ViewPagerBottomSheetBehavior.AbstractC85004a(this) {
                /* class com.p2082ss.android.ugc.tools.infosticker.view.internal.main.C84727b.C847281 */

                /* renamed from: a */
                final /* synthetic */ C84727b f189321a;

                static {
                    Covode.recordClassIndex(98704);
                }

                @Override // com.p2082ss.android.ugc.tools.view.widget.ViewPagerBottomSheetBehavior.AbstractC85004a
                /* renamed from: a */
                public final void mo114395a(View view) {
                    C89219l.m154721d(view, "");
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f189321a = r1;
                }

                @Override // com.p2082ss.android.ugc.tools.view.widget.ViewPagerBottomSheetBehavior.AbstractC85004a
                /* renamed from: a */
                public final void mo114396a(View view, int i) {
                    C89219l.m154721d(view, "");
                    if (i == 4) {
                        this.f189321a.f189319a.onNext(AbstractC84641b.EnumC84642a.CLOSE);
                    } else if (i == 1) {
                        this.f189321a.f189319a.onNext(AbstractC84641b.EnumC84642a.DRAGGING);
                    }
                }
            };
            return;
        }
        this.f189320b = null;
    }
}
