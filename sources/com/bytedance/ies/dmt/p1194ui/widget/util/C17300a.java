package com.bytedance.ies.dmt.p1194ui.widget.util;

import android.content.Context;
import android.graphics.Typeface;
import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.ies.dmt.ui.widget.util.a */
public class C17300a {

    /* renamed from: a */
    static volatile C17300a f41551a;

    /* renamed from: b */
    static volatile Map<String, Integer> f41552b;

    /* renamed from: f */
    private static volatile SparseArray<String> f41553f;

    /* renamed from: c */
    SparseArray<Typeface> f41554c = new SparseArray<>();

    /* renamed from: d */
    Map<String, String> f41555d = new HashMap();

    /* renamed from: e */
    Context f41556e;

    private C17300a() {
    }

    /* renamed from: a */
    public static C17300a m32029a() {
        MethodCollector.m26663i(8339);
        if (f41551a == null) {
            synchronized (C17300a.class) {
                try {
                    if (f41551a == null) {
                        f41551a = new C17300a();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(8339);
                    throw th;
                }
            }
        }
        C17300a aVar = f41551a;
        MethodCollector.m26664o(8339);
        return aVar;
    }

    static {
        Covode.recordClassIndex(19784);
        SparseArray<String> sparseArray = new SparseArray<>();
        f41553f = sparseArray;
        sparseArray.put(1, C17303d.f41567a);
        f41553f.put(2, C17303d.f41568b);
        f41553f.put(3, C17303d.f41569c);
        f41553f.put(4, C17303d.f41570d);
        f41553f.put(5, C17303d.f41571e);
        f41553f.put(6, C17303d.f41572f);
        f41553f.put(7, C17303d.f41573g);
        f41553f.put(8, C17303d.f41574h);
        HashMap hashMap = new HashMap();
        f41552b = hashMap;
        hashMap.put(C17303d.f41567a, 1);
        f41552b.put(C17303d.f41568b, 2);
        f41552b.put(C17303d.f41569c, 3);
        f41552b.put(C17303d.f41570d, 4);
        f41552b.put(C17303d.f41571e, 5);
        f41552b.put(C17303d.f41572f, 6);
        f41552b.put(C17303d.f41573g, 7);
        f41552b.put(C17303d.f41574h, 8);
    }

    /* renamed from: a */
    public final Typeface mo27609a(int i) {
        Typeface typeface = this.f41554c.get(i, null);
        if (typeface != null) {
            return typeface;
        }
        Typeface b = m32030b(i);
        this.f41554c.put(i, b);
        return b;
    }

    /* renamed from: b */
    private Typeface m32030b(int i) {
        String str = this.f41555d.get(f41553f.get(i));
        Context context = this.f41556e;
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), str);
            } catch (Exception e) {
                e.getMessage();
            }
        }
        return null;
    }

    /* renamed from: a */
    public final Typeface mo27610a(String str) {
        if (this.f41555d.containsKey(str)) {
            return mo27609a(f41552b.get(str).intValue());
        }
        return null;
    }
}
