package com.lynx.p2032b.p2033a.p2041h;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.bytedance.covode.number.Covode;
import com.google.android.material.appbar.AppBarLayout;
import com.lynx.p2032b.p2033a.p2034a.AbstractC28219h;
import com.lynx.p2032b.p2033a.p2040g.AbstractC28234a;

/* renamed from: com.lynx.b.a.h.a */
public final class C28241a {
    static {
        Covode.recordClassIndex(34187);
    }

    /* renamed from: a */
    public static void m56414a(View view, AbstractC28219h hVar, final AbstractC28234a aVar) {
        try {
            if (view instanceof CoordinatorLayout) {
                hVar.mo48283a().mo48224a();
                ViewGroup viewGroup = (ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    View childAt = viewGroup.getChildAt(childCount);
                    if (childAt instanceof AppBarLayout) {
                        ((AppBarLayout) childAt).mo43717a(new AppBarLayout.AbstractC26571c() {
                            /* class com.lynx.p2032b.p2033a.p2041h.C28241a.C282421 */

                            static {
                                Covode.recordClassIndex(34188);
                            }

                            @Override // com.google.android.material.appbar.AppBarLayout.AbstractC26569a
                            /* renamed from: a */
                            public final void mo15197a(AppBarLayout appBarLayout, int i) {
                                boolean z;
                                AbstractC28234a aVar = aVar;
                                boolean z2 = true;
                                if (i >= 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (appBarLayout.getTotalScrollRange() + i > 0) {
                                    z2 = false;
                                }
                                aVar.mo48308a(z, z2);
                            }
                        });
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }
}
