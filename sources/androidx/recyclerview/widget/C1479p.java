package androidx.recyclerview.widget;

import android.os.Build;
import android.view.View;
import androidx.core.p037h.C0792v;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* access modifiers changed from: package-private */
/* renamed from: androidx.recyclerview.widget.p */
public final class C1479p implements AbstractC1478o {

    /* renamed from: a */
    static final AbstractC1478o f4901a = new C1479p();

    C1479p() {
    }

    static {
        Covode.recordClassIndex(1617);
    }

    @Override // androidx.recyclerview.widget.AbstractC1478o
    /* renamed from: a */
    public final void mo5005a(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            Object tag = view.getTag(R.id.brq);
            if (tag instanceof Float) {
                C0792v.m2739a(view, ((Float) tag).floatValue());
            }
            view.setTag(R.id.brq, null);
        }
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    @Override // androidx.recyclerview.widget.AbstractC1478o
    /* renamed from: a */
    public final void mo5006a(RecyclerView recyclerView, View view, float f, float f2, boolean z) {
        if (Build.VERSION.SDK_INT >= 21 && z && view.getTag(R.id.brq) == null) {
            Float valueOf = Float.valueOf(C0792v.m2777k(view));
            int childCount = recyclerView.getChildCount();
            float f3 = 0.0f;
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                if (childAt != view) {
                    float k = C0792v.m2777k(childAt);
                    if (k > f3) {
                        f3 = k;
                    }
                }
            }
            C0792v.m2739a(view, 1.0f + f3);
            view.setTag(R.id.brq, valueOf);
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
    }
}
