package com.google.android.material.transformation;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.p037h.C0792v;
import com.bytedance.covode.number.Covode;
import com.google.android.material.p1951a.C26562h;
import com.google.android.material.p1951a.C26564j;
import com.google.android.material.transformation.FabTransformationBehavior;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;

public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: c */
    private Map<View, Integer> f63351c;

    static {
        Covode.recordClassIndex(32205);
    }

    public FabTransformationSheetBehavior() {
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.material.transformation.FabTransformationBehavior
    /* renamed from: a */
    public final FabTransformationBehavior.C26732a mo44377a(Context context, boolean z) {
        int i;
        if (z) {
            i = R.animator.j;
        } else {
            i = R.animator.i;
        }
        FabTransformationBehavior.C26732a aVar = new FabTransformationBehavior.C26732a();
        aVar.f63344a = C26562h.m52582a(context, i);
        aVar.f63345b = new C26564j();
        return aVar;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.material.transformation.ExpandableBehavior, com.google.android.material.transformation.ExpandableTransformationBehavior
    /* renamed from: a */
    public final boolean mo44373a(View view, View view2, boolean z, boolean z2) {
        boolean z3;
        ViewParent parent = view2.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            int i = Build.VERSION.SDK_INT;
            if (z) {
                this.f63351c = new HashMap(childCount);
            }
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = coordinatorLayout.getChildAt(i2);
                if (!(childAt.getLayoutParams() instanceof CoordinatorLayout.C0560e) || !(((CoordinatorLayout.C0560e) childAt.getLayoutParams()).f2416a instanceof FabTransformationScrimBehavior)) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (childAt != view2 && !z3) {
                    if (!z) {
                        Map<View, Integer> map = this.f63351c;
                        if (map != null && map.containsKey(childAt)) {
                            C0792v.m2740a(childAt, this.f63351c.get(childAt).intValue());
                        }
                    } else {
                        int i3 = Build.VERSION.SDK_INT;
                        this.f63351c.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        C0792v.m2740a(childAt, 4);
                    }
                }
            }
            if (!z) {
                this.f63351c = null;
            }
        }
        return super.mo44373a(view, view2, z, z2);
    }
}
