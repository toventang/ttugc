package com.p2082ss.android.ugc.aweme.commerce.p2505a.p2506a.p2508b;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.ss.android.ugc.aweme.commerce.a.a.b.c */
public final class C37452c {

    /* renamed from: a */
    public static C37452c f88416a = new C37452c();

    /* renamed from: b */
    public final HashMap<String, ArrayList<C37453a>> f88417b = new HashMap<>();

    static {
        Covode.recordClassIndex(44837);
    }

    private C37452c() {
    }

    /* renamed from: a */
    public final boolean mo65165a(String str, long j) {
        ArrayList<C37453a> arrayList = this.f88417b.get(str);
        if (arrayList != null && !arrayList.isEmpty()) {
            long max = Math.max(j, arrayList.get(0).f88418a);
            Iterator<C37453a> it = arrayList.iterator();
            loop0:
            while (true) {
                long j2 = 0;
                boolean z = true;
                while (true) {
                    if (!it.hasNext()) {
                        break loop0;
                    }
                    C37453a next = it.next();
                    if (max <= next.f88418a) {
                        if (next.f88419b >= 0.5f) {
                            if (z) {
                                max = next.f88418a;
                                z = false;
                            }
                            j2 += next.f88418a - max;
                            max = next.f88418a;
                            if (j2 >= 2000000000) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.commerce.a.a.b.c$a */
    public static class C37453a {

        /* renamed from: a */
        final long f88418a;

        /* renamed from: b */
        final float f88419b;

        /* renamed from: c */
        public final String f88420c;

        static {
            Covode.recordClassIndex(44838);
        }

        public C37453a(long j, float f, String str) {
            this.f88418a = j;
            this.f88419b = f;
            this.f88420c = str;
        }
    }
}
