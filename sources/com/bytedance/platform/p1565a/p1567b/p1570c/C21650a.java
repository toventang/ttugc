package com.bytedance.platform.p1565a.p1567b.p1570c;

import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.platform.p1565a.p1567b.p1570c.p1571a.AbstractC21652b;

/* renamed from: com.bytedance.platform.a.b.c.a */
public final class C21650a implements AbstractC21652b {
    static {
        Covode.recordClassIndex(25291);
    }

    @Override // com.bytedance.platform.p1565a.p1567b.p1570c.p1571a.AbstractC21652b
    /* renamed from: a */
    public final void mo35299a() {
        if (!"main".equals(Thread.currentThread().getName())) {
            Log.getStackTraceString(new RuntimeException());
        } else {
            RunnableC21659d.m40607b().mo35320a();
        }
    }
}
