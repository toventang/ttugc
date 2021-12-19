package com.p2082ss.android.ugc.aweme.xsearch;

import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.xsearch.d */
public final class C81689d {

    /* renamed from: a */
    public static int f182657a = -1;

    /* renamed from: b */
    public static final C81689d f182658b = new C81689d();

    /* renamed from: c */
    private static int f182659c;

    /* renamed from: d */
    private static final SparseArray<C81688c> f182660d = new SparseArray<>();

    /* renamed from: e */
    private static final SparseArray<List<Integer>> f182661e = new SparseArray<>();

    private C81689d() {
    }

    static {
        Covode.recordClassIndex(95093);
    }

    /* renamed from: b */
    public final synchronized C81688c mo125341b(int i) {
        C81688c cVar;
        MethodCollector.m26663i(7874);
        cVar = f182660d.get(i);
        MethodCollector.m26664o(7874);
        return cVar;
    }

    /* renamed from: a */
    public final synchronized int mo125339a(C81688c cVar) {
        MethodCollector.m26663i(7724);
        C89219l.m154721d(cVar, "");
        if (f182657a == -1) {
            MethodCollector.m26664o(7724);
            return -1;
        }
        int i = f182659c;
        f182659c = i + 1;
        f182660d.put(i, cVar);
        cVar.f182647a = Integer.valueOf(i);
        SparseArray<List<Integer>> sparseArray = f182661e;
        List<Integer> list = sparseArray.get(f182657a);
        if (list == null) {
            list = new ArrayList<>();
        }
        list.add(Integer.valueOf(i));
        sparseArray.put(f182657a, list);
        MethodCollector.m26664o(7724);
        return i;
    }

    /* renamed from: a */
    public final synchronized boolean mo125340a(int i) {
        MethodCollector.m26663i(7873);
        if (f182657a == -1) {
            MethodCollector.m26664o(7873);
            return false;
        }
        SparseArray<C81688c> sparseArray = f182660d;
        C81688c cVar = sparseArray.get(i);
        if (cVar == null) {
            MethodCollector.m26664o(7873);
            return false;
        }
        cVar.f182647a = null;
        sparseArray.remove(i);
        SparseArray<List<Integer>> sparseArray2 = f182661e;
        List<Integer> list = sparseArray2.get(f182657a);
        if (list != null) {
            list.remove(Integer.valueOf(i));
            sparseArray2.put(f182657a, list);
        }
        MethodCollector.m26664o(7873);
        return true;
    }
}
