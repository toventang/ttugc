package com.p2082ss.android.ugc.aweme.p2433ca;

import com.bytedance.common.jato.Jato;
import com.bytedance.common.jato.boost.C13546g;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.experiment.C46824dc;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.ca.e */
public final class C35347e {

    /* renamed from: a */
    public static boolean f83385a;

    /* renamed from: b */
    public static int f83386b;

    /* renamed from: c */
    public static HashMap<String, HashSet<Integer>> f83387c = new HashMap<>();

    static {
        Covode.recordClassIndex(42515);
    }

    /* renamed from: a */
    public static HashSet<Integer> m72340a(String str) {
        try {
            HashSet<Integer> hashSet = f83387c.get(str);
            if (hashSet != null) {
                return hashSet;
            }
        } catch (Throwable unused) {
        }
        return new HashSet<>();
    }

    /* renamed from: a */
    public static void m72341a(HashSet<Integer> hashSet) {
        Iterator<Integer> it = hashSet.iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            try {
                if (C46824dc.f109081d) {
                    Jato.bindBigCore(next.intValue());
                }
                C13546g.m24338a(next.intValue(), -20);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    public static HashSet<Integer> m72342b(String str) {
        HashSet<Integer> value;
        HashSet<Integer> hashSet = new HashSet<>();
        try {
            for (Map.Entry<String, HashSet<Integer>> entry : f83387c.entrySet()) {
                if (entry.getKey().startsWith(str) && (value = entry.getValue()) != null) {
                    hashSet.addAll(value);
                }
            }
        } catch (Throwable unused) {
        }
        return hashSet;
    }

    /* renamed from: b */
    public static void m72343b(HashSet<Integer> hashSet) {
        Iterator<Integer> it = hashSet.iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            try {
                if (C46824dc.f109084g) {
                    Jato.bindLittleCore(next.intValue());
                }
                C13546g.m24338a(next.intValue(), 19);
            } catch (Throwable unused) {
            }
        }
    }
}
