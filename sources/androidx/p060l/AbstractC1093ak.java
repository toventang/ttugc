package androidx.p060l;

import android.view.View;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.l.ak */
public abstract class AbstractC1093ak extends AbstractC1145p {

    /* renamed from: a */
    private static final String[] f3758a = {"android:visibilityPropagation:visibility", "android:visibilityPropagation:center"};

    @Override // androidx.p060l.AbstractC1145p
    /* renamed from: a */
    public final String[] mo3874a() {
        return f3758a;
    }

    static {
        Covode.recordClassIndex(1186);
    }

    /* renamed from: b */
    public static int m3681b(C1150s sVar) {
        return m3680a(sVar, 0);
    }

    /* renamed from: c */
    public static int m3682c(C1150s sVar) {
        return m3680a(sVar, 1);
    }

    @Override // androidx.p060l.AbstractC1145p
    /* renamed from: a */
    public final void mo3873a(C1150s sVar) {
        View view = sVar.f3900b;
        Object obj = sVar.f3899a.get("android:visibility:visibility");
        if (obj == null) {
            obj = Integer.valueOf(view.getVisibility());
        }
        sVar.f3899a.put("android:visibilityPropagation:visibility", obj);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        iArr[0] = iArr[0] + Math.round(view.getTranslationX());
        iArr[0] = iArr[0] + (view.getWidth() / 2);
        iArr[1] = iArr[1] + Math.round(view.getTranslationY());
        iArr[1] = iArr[1] + (view.getHeight() / 2);
        sVar.f3899a.put("android:visibilityPropagation:center", iArr);
    }

    /* renamed from: a */
    private static int m3680a(C1150s sVar, int i) {
        int[] iArr;
        if (sVar == null || (iArr = (int[]) sVar.f3899a.get("android:visibilityPropagation:center")) == null) {
            return -1;
        }
        return iArr[i];
    }
}
