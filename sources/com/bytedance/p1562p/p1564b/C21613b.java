package com.bytedance.p1562p.p1564b;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.bytedance.p.b.b */
public final class C21613b {

    /* renamed from: a */
    public static long f51252a = 600000;

    /* renamed from: b */
    public static int f51253b = 10;

    /* renamed from: c */
    public static int f51254c = 3;

    /* renamed from: d */
    public static LinkedBlockingQueue<C21612a> f51255d = new LinkedBlockingQueue<>(f51253b);

    static {
        Covode.recordClassIndex(25254);
    }

    /* renamed from: a */
    public static String m40560a(C21612a aVar) {
        LinkedBlockingQueue<C21612a> linkedBlockingQueue = f51255d;
        if (linkedBlockingQueue == null || linkedBlockingQueue.isEmpty()) {
            return aVar.f51250a;
        }
        StringBuilder sb = new StringBuilder(aVar.f51250a);
        ArrayList arrayList = new ArrayList();
        Iterator<C21612a> it = f51255d.iterator();
        while (it.hasNext()) {
            C21612a next = it.next();
            if (next != null) {
                arrayList.add(next);
            }
        }
        Collections.sort(arrayList);
        int min = Math.min(f51254c, arrayList.size());
        for (int i = 0; i < min - 1; i++) {
            if (arrayList.get(i) != null) {
                sb.append("\n").append(((C21612a) arrayList.get(i)).f51250a);
            }
        }
        return sb.toString();
    }
}
