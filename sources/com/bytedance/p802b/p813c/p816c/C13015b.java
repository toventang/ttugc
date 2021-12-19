package com.bytedance.p802b.p813c.p816c;

import com.bytedance.covode.number.Covode;
import com.bytedance.p802b.p813c.C12978a;
import com.bytedance.p802b.p813c.p815b.C13001c;
import java.util.Iterator;

/* renamed from: com.bytedance.b.c.c.b */
public final class C13015b {

    /* renamed from: a */
    public static String f31709a;

    static {
        Covode.recordClassIndex(14851);
    }

    /* renamed from: a */
    public static boolean m23362a() {
        String b = C12978a.m23302a().mo20832b();
        boolean z = !b.equals(f31709a);
        f31709a = b;
        return z;
    }

    /* renamed from: a */
    public static boolean m23363a(C13001c cVar, double d, boolean z) {
        if (z) {
            if (!cVar.f31676g.isEmpty()) {
                Iterator<String> it = C12978a.m23302a().f31607a.iterator();
                while (it.hasNext()) {
                    String next = it.next();
                    if (cVar.f31676g.containsKey(next)) {
                        double doubleValue = cVar.f31676g.get(next).doubleValue();
                        if (doubleValue < 0.0d) {
                            continue;
                        } else if (d > doubleValue) {
                            return true;
                        }
                    }
                }
            }
            if (d > cVar.f31672c) {
                return true;
            }
            return false;
        }
        if (!cVar.f31677h.isEmpty()) {
            Iterator<String> it2 = C12978a.m23302a().f31607a.iterator();
            while (it2.hasNext()) {
                String next2 = it2.next();
                if (cVar.f31677h.containsKey(next2)) {
                    double doubleValue2 = cVar.f31677h.get(next2).doubleValue();
                    if (doubleValue2 < 0.0d) {
                        continue;
                    } else if (d > doubleValue2) {
                        return true;
                    }
                }
            }
        }
        if (d > cVar.f31673d) {
            return true;
        }
        return false;
    }
}
