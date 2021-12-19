package com.p2082ss.android.p2092ad.splash.core;

import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ad.splash.core.e */
final class C29453e {

    /* renamed from: a */
    private static final List<WeakReference<AbstractC29502i>> f69971a = new ArrayList();

    static {
        Covode.recordClassIndex(35847);
    }

    /* renamed from: a */
    static List<WeakReference<AbstractC29502i>> m58995a() {
        ArrayList arrayList = new ArrayList();
        List<WeakReference<AbstractC29502i>> list = f69971a;
        if (list != null) {
            arrayList.addAll(list);
        }
        return arrayList;
    }

    /* renamed from: a */
    static void m58996a(AbstractC29502i iVar) {
        if (iVar != null) {
            f69971a.add(new WeakReference<>(iVar));
        }
    }
}
