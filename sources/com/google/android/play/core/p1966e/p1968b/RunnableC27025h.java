package com.google.android.play.core.p1966e.p1968b;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.p1966e.AbstractC27034f;
import java.util.List;

/* renamed from: com.google.android.play.core.e.b.h */
final /* synthetic */ class RunnableC27025h implements Runnable {

    /* renamed from: a */
    private final C27018a f63965a;

    /* renamed from: b */
    private final long f63966b;

    /* renamed from: c */
    private final List f63967c;

    /* renamed from: d */
    private final List f63968d;

    /* renamed from: e */
    private final List f63969e;

    static {
        Covode.recordClassIndex(32501);
    }

    RunnableC27025h(C27018a aVar, long j, List list, List list2, List list3) {
        this.f63965a = aVar;
        this.f63966b = j;
        this.f63967c = list;
        this.f63968d = list2;
        this.f63969e = list3;
    }

    public final void run() {
        C27018a aVar = this.f63965a;
        long j = this.f63966b;
        List list = this.f63967c;
        List list2 = this.f63968d;
        List list3 = this.f63969e;
        long j2 = j / 3;
        long j3 = 0;
        int i = 0;
        do {
            j3 = Math.min(j, j3 + j2);
            aVar.mo44723a(2, 0, Long.valueOf(j3), Long.valueOf(j), null, null, null);
            SystemClock.sleep(C27018a.f63936a);
            AbstractC27034f c = aVar.mo44724c();
            if (c.mo44735b() != 9 && c.mo44735b() != 7 && c.mo44735b() != 6) {
                i++;
            } else {
                return;
            }
        } while (i < 3);
        aVar.f63939d.execute(new RunnableC27026i(aVar, list, list2, list3, j));
    }
}
