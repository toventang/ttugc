package com.google.android.play.core.p1966e.p1968b;

import android.content.Intent;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: com.google.android.play.core.e.b.i */
final /* synthetic */ class RunnableC27026i implements Runnable {

    /* renamed from: a */
    private final C27018a f63970a;

    /* renamed from: b */
    private final List f63971b;

    /* renamed from: c */
    private final List f63972c;

    /* renamed from: d */
    private final List f63973d;

    /* renamed from: e */
    private final long f63974e;

    static {
        Covode.recordClassIndex(32502);
    }

    RunnableC27026i(C27018a aVar, List list, List list2, List list3, long j) {
        this.f63970a = aVar;
        this.f63971b = list;
        this.f63972c = list2;
        this.f63973d = list3;
        this.f63974e = j;
    }

    public final void run() {
        C27018a aVar = this.f63970a;
        List<Intent> list = this.f63971b;
        List<String> list2 = this.f63972c;
        List<String> list3 = this.f63973d;
        long j = this.f63974e;
        if (aVar.f63943h.get()) {
            aVar.mo44725c(-6);
        } else {
            aVar.mo44722a(list, list2, list3, j, false);
        }
    }
}
