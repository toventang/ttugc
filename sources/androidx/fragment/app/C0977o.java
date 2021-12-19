package androidx.fragment.app;

import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import androidx.core.app.AbstractC0618p;
import androidx.core.p037h.C0792v;
import androidx.p025c.AbstractC0491f;
import androidx.p025c.C0484a;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.o */
public final class C0977o {

    /* renamed from: a */
    private static final int[] f3467a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8};

    /* renamed from: b */
    private static final AbstractC0988q f3468b;

    /* renamed from: c */
    private static final AbstractC0988q f3469c = m3392a();

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.o$a */
    public static class C0982a {

        /* renamed from: a */
        public Fragment f3498a;

        /* renamed from: b */
        public boolean f3499b;

        /* renamed from: c */
        public C0942c f3500c;

        /* renamed from: d */
        public Fragment f3501d;

        /* renamed from: e */
        public boolean f3502e;

        /* renamed from: f */
        public C0942c f3503f;

        static {
            Covode.recordClassIndex(1075);
        }

        C0982a() {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0094, code lost:
        r11 = m3393a((r14 = r13.f3501d), (r0 = r13.f3498a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0203, code lost:
        r0 = r13.f3498a;
        r6 = m3393a((r14 = r13.f3501d), r0);
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0104 A[ADDED_TO_REGION] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m3403a(androidx.fragment.app.LayoutInflater$Factory2C0956j r42, java.util.ArrayList<androidx.fragment.app.C0942c> r43, java.util.ArrayList<java.lang.Boolean> r44, int r45, int r46, boolean r47) {
        /*
        // Method dump skipped, instructions count: 814
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0977o.m3403a(androidx.fragment.app.j, java.util.ArrayList, java.util.ArrayList, int, int, boolean):void");
    }

    /* renamed from: a */
    private static boolean m3407a(AbstractC0988q qVar, List<Object> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!qVar.mo3662a(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static void m3406a(ArrayList<View> arrayList, C0484a<String, View> aVar, Collection<String> collection) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View c = aVar.mo2163c(size);
            if (collection.contains(C0792v.m2778l(c))) {
                arrayList.add(c);
            }
        }
    }

    /* renamed from: a */
    private static String m3397a(C0484a<String, String> aVar, String str) {
        int size = aVar.size();
        for (int i = 0; i < size; i++) {
            if (str.equals(aVar.mo2163c(i))) {
                return aVar.mo2162b(i);
            }
        }
        return null;
    }

    /* renamed from: a */
    private static void m3404a(AbstractC0988q qVar, Object obj, Object obj2, C0484a<String, View> aVar, boolean z, C0942c cVar) {
        String str;
        if (cVar.f3365r != null && !cVar.f3365r.isEmpty()) {
            if (z) {
                str = cVar.f3366s.get(0);
            } else {
                str = cVar.f3365r.get(0);
            }
            View view = aVar.get(str);
            qVar.mo3657a(obj, view);
            if (obj2 != null) {
                qVar.mo3657a(obj2, view);
            }
        }
    }

    /* renamed from: a */
    static void m3399a(Fragment fragment, Fragment fragment2, boolean z, C0484a<String, View> aVar) {
        AbstractC0618p enterTransitionCallback;
        if (z) {
            enterTransitionCallback = fragment2.getEnterTransitionCallback();
        } else {
            enterTransitionCallback = fragment.getEnterTransitionCallback();
        }
        if (enterTransitionCallback != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (aVar != null) {
                int size = aVar.size();
                for (int i = 0; i < size; i++) {
                    arrayList2.add(aVar.mo2162b(i));
                    arrayList.add(aVar.mo2163c(i));
                }
            }
        }
    }

    /* renamed from: a */
    static ArrayList<View> m3398a(AbstractC0988q qVar, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View view2 = fragment.getView();
        if (view2 != null) {
            qVar.mo3683a(arrayList2, view2);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        qVar.mo3660a(obj, arrayList2);
        return arrayList2;
    }

    /* renamed from: a */
    static void m3405a(ArrayList<View> arrayList, int i) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).setVisibility(i);
            }
        }
    }

    /* renamed from: a */
    private static Object m3396a(AbstractC0988q qVar, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z) {
        boolean allowEnterTransitionOverlap;
        if (!(obj == null || obj2 == null || fragment == null)) {
            if (z) {
                allowEnterTransitionOverlap = fragment.getAllowReturnTransitionOverlap();
            } else {
                allowEnterTransitionOverlap = fragment.getAllowEnterTransitionOverlap();
            }
            if (!allowEnterTransitionOverlap) {
                return qVar.mo3664b(obj2, obj, obj3);
            }
        }
        return qVar.mo3654a(obj2, obj, obj3);
    }

    /* renamed from: a */
    private static void m3400a(C0942c cVar, SparseArray<C0982a> sparseArray, boolean z) {
        int size = cVar.f3349b.size();
        for (int i = 0; i < size; i++) {
            m3401a(cVar, cVar.f3349b.get(i), sparseArray, false, z);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0086, code lost:
        if (r3.mAdded != false) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x00bd, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x00da, code lost:
        if (r3.mHidden == false) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x00dc, code lost:
        r4 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x006f A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:96:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m3401a(androidx.fragment.app.C0942c r8, androidx.fragment.app.C0942c.C0943a r9, android.util.SparseArray<androidx.fragment.app.C0977o.C0982a> r10, boolean r11, boolean r12) {
        /*
        // Method dump skipped, instructions count: 228
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0977o.m3401a(androidx.fragment.app.c, androidx.fragment.app.c$a, android.util.SparseArray, boolean, boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x009e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m3402a(androidx.fragment.app.LayoutInflater$Factory2C0956j r13, androidx.fragment.app.Fragment r14) {
        /*
        // Method dump skipped, instructions count: 172
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0977o.m3402a(androidx.fragment.app.j, androidx.fragment.app.Fragment):void");
    }

    /* renamed from: a */
    private static AbstractC0988q m3392a() {
        try {
            return (AbstractC0988q) Class.forName("androidx.l.e").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    static {
        C0983p pVar;
        Covode.recordClassIndex(1070);
        if (Build.VERSION.SDK_INT >= 21) {
            pVar = new C0983p();
        } else {
            pVar = null;
        }
        f3468b = pVar;
    }

    /* renamed from: a */
    private static AbstractC0988q m3393a(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object exitTransition = fragment.getExitTransition();
            if (exitTransition != null) {
                arrayList.add(exitTransition);
            }
            Object returnTransition = fragment.getReturnTransition();
            if (returnTransition != null) {
                arrayList.add(returnTransition);
            }
            Object sharedElementReturnTransition = fragment.getSharedElementReturnTransition();
            if (sharedElementReturnTransition != null) {
                arrayList.add(sharedElementReturnTransition);
            }
        }
        if (fragment2 != null) {
            Object enterTransition = fragment2.getEnterTransition();
            if (enterTransition != null) {
                arrayList.add(enterTransition);
            }
            Object reenterTransition = fragment2.getReenterTransition();
            if (reenterTransition != null) {
                arrayList.add(reenterTransition);
            }
            Object sharedElementEnterTransition = fragment2.getSharedElementEnterTransition();
            if (sharedElementEnterTransition != null) {
                arrayList.add(sharedElementEnterTransition);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        AbstractC0988q qVar = f3468b;
        if (qVar != null && m3407a(qVar, arrayList)) {
            return qVar;
        }
        AbstractC0988q qVar2 = f3469c;
        if (qVar2 != null && m3407a(qVar2, arrayList)) {
            return qVar2;
        }
        if (qVar == null && qVar2 == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    /* renamed from: a */
    private static C0982a m3391a(C0982a aVar, SparseArray<C0982a> sparseArray, int i) {
        if (aVar != null) {
            return aVar;
        }
        C0982a aVar2 = new C0982a();
        sparseArray.put(i, aVar2);
        return aVar2;
    }

    /* renamed from: b */
    private static Object m3409b(AbstractC0988q qVar, Fragment fragment, boolean z) {
        Object exitTransition;
        if (fragment == null) {
            return null;
        }
        if (z) {
            exitTransition = fragment.getReturnTransition();
        } else {
            exitTransition = fragment.getExitTransition();
        }
        return qVar.mo3663b(exitTransition);
    }

    /* renamed from: b */
    private static void m3410b(C0942c cVar, SparseArray<C0982a> sparseArray, boolean z) {
        if (cVar.f3348a.f3410n.mo3432a()) {
            for (int size = cVar.f3349b.size() - 1; size >= 0; size--) {
                m3401a(cVar, cVar.f3349b.get(size), sparseArray, true, z);
            }
        }
    }

    /* renamed from: a */
    private static Object m3395a(AbstractC0988q qVar, Fragment fragment, boolean z) {
        Object enterTransition;
        if (fragment == null) {
            return null;
        }
        if (z) {
            enterTransition = fragment.getReenterTransition();
        } else {
            enterTransition = fragment.getEnterTransition();
        }
        return qVar.mo3663b(enterTransition);
    }

    /* renamed from: a */
    static View m3388a(C0484a<String, View> aVar, C0982a aVar2, Object obj, boolean z) {
        String str;
        C0942c cVar = aVar2.f3500c;
        if (obj == null || aVar == null || cVar.f3365r == null || cVar.f3365r.isEmpty()) {
            return null;
        }
        if (z) {
            str = cVar.f3365r.get(0);
        } else {
            str = cVar.f3366s.get(0);
        }
        return aVar.get(str);
    }

    /* renamed from: b */
    private static C0484a<String, View> m3408b(AbstractC0988q qVar, C0484a<String, String> aVar, Object obj, C0982a aVar2) {
        AbstractC0618p exitTransitionCallback;
        ArrayList<String> arrayList;
        if (aVar.isEmpty() || obj == null) {
            aVar.clear();
            return null;
        }
        Fragment fragment = aVar2.f3501d;
        C0484a<String, View> aVar3 = new C0484a<>();
        qVar.mo3684a((Map<String, View>) aVar3, fragment.getView());
        C0942c cVar = aVar2.f3503f;
        if (aVar2.f3502e) {
            exitTransitionCallback = fragment.getEnterTransitionCallback();
            arrayList = cVar.f3366s;
        } else {
            exitTransitionCallback = fragment.getExitTransitionCallback();
            arrayList = cVar.f3365r;
        }
        AbstractC0491f.m1777a((Map) aVar3, (Collection<?>) arrayList);
        if (exitTransitionCallback != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view = aVar3.get(str);
                if (view == null) {
                    aVar.remove(str);
                } else if (!str.equals(C0792v.m2778l(view))) {
                    aVar.put(C0792v.m2778l(view), aVar.remove(str));
                }
            }
        } else {
            AbstractC0491f.m1777a((Map) aVar, (Collection<?>) aVar3.keySet());
        }
        return aVar3;
    }

    /* renamed from: a */
    static C0484a<String, View> m3390a(AbstractC0988q qVar, C0484a<String, String> aVar, Object obj, C0982a aVar2) {
        AbstractC0618p enterTransitionCallback;
        ArrayList<String> arrayList;
        String a;
        Fragment fragment = aVar2.f3498a;
        View view = fragment.getView();
        if (aVar.isEmpty() || obj == null || view == null) {
            aVar.clear();
            return null;
        }
        C0484a<String, View> aVar3 = new C0484a<>();
        qVar.mo3684a((Map<String, View>) aVar3, view);
        C0942c cVar = aVar2.f3500c;
        if (aVar2.f3499b) {
            enterTransitionCallback = fragment.getExitTransitionCallback();
            arrayList = cVar.f3365r;
        } else {
            enterTransitionCallback = fragment.getEnterTransitionCallback();
            arrayList = cVar.f3366s;
        }
        if (arrayList != null) {
            AbstractC0491f.m1777a((Map) aVar3, (Collection<?>) arrayList);
            AbstractC0491f.m1777a((Map) aVar3, (Collection<?>) aVar.values());
        }
        if (enterTransitionCallback != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view2 = aVar3.get(str);
                if (view2 == null) {
                    String a2 = m3397a(aVar, str);
                    if (a2 != null) {
                        aVar.remove(a2);
                    }
                } else if (!str.equals(C0792v.m2778l(view2)) && (a = m3397a(aVar, str)) != null) {
                    aVar.put(a, C0792v.m2778l(view2));
                }
            }
        } else {
            for (int size2 = aVar.size() - 1; size2 >= 0; size2--) {
                if (!aVar3.containsKey(aVar.mo2163c(size2))) {
                    aVar.mo2167d(size2);
                }
            }
        }
        return aVar3;
    }

    /* renamed from: a */
    private static Object m3394a(AbstractC0988q qVar, Fragment fragment, Fragment fragment2, boolean z) {
        Object sharedElementEnterTransition;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        if (z) {
            sharedElementEnterTransition = fragment2.getSharedElementReturnTransition();
        } else {
            sharedElementEnterTransition = fragment.getSharedElementEnterTransition();
        }
        return qVar.mo3668c(qVar.mo3663b(sharedElementEnterTransition));
    }

    /* renamed from: a */
    private static C0484a<String, String> m3389a(int i, ArrayList<C0942c> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        C0484a<String, String> aVar = new C0484a<>();
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            C0942c cVar = arrayList.get(i4);
            if (cVar.mo3472b(i)) {
                boolean booleanValue = arrayList2.get(i4).booleanValue();
                if (cVar.f3365r != null) {
                    int size = cVar.f3365r.size();
                    if (booleanValue) {
                        arrayList4 = cVar.f3365r;
                        arrayList3 = cVar.f3366s;
                    } else {
                        arrayList3 = cVar.f3365r;
                        arrayList4 = cVar.f3366s;
                    }
                    for (int i5 = 0; i5 < size; i5++) {
                        String str = arrayList3.get(i5);
                        String str2 = arrayList4.get(i5);
                        String remove = aVar.remove(str2);
                        if (remove != null) {
                            aVar.put(str, remove);
                        } else {
                            aVar.put(str, str2);
                        }
                    }
                }
            }
        }
        return aVar;
    }
}
