package com.google.android.datatransport.runtime.p1928e;

import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.EnumC25111d;
import java.util.EnumMap;

/* renamed from: com.google.android.datatransport.runtime.e.a */
public final class C25154a {

    /* renamed from: a */
    private static SparseArray<EnumC25111d> f59597a = new SparseArray<>();

    /* renamed from: b */
    private static EnumMap<EnumC25111d, Integer> f59598b;

    static {
        Covode.recordClassIndex(30520);
        EnumMap<EnumC25111d, Integer> enumMap = new EnumMap<>(EnumC25111d.class);
        f59598b = enumMap;
        enumMap.put(EnumC25111d.DEFAULT, (Integer) 0);
        f59598b.put(EnumC25111d.VERY_LOW, (Integer) 1);
        f59598b.put(EnumC25111d.HIGHEST, (Integer) 2);
        for (EnumC25111d dVar : f59598b.keySet()) {
            f59597a.append(f59598b.get(dVar).intValue(), dVar);
        }
    }

    /* renamed from: a */
    public static int m48224a(EnumC25111d dVar) {
        Integer num = f59598b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value ".concat(String.valueOf(dVar)));
    }

    /* renamed from: a */
    public static EnumC25111d m48225a(int i) {
        EnumC25111d dVar = f59597a.get(i);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException("Unknown Priority for value ".concat(String.valueOf(i)));
    }
}
