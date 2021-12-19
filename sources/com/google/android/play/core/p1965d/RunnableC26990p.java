package com.google.android.play.core.p1965d;

import com.bytedance.covode.number.Covode;
import java.util.Set;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.d.p */
public final class RunnableC26990p implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Set f63886a;

    /* renamed from: b */
    final /* synthetic */ C26975a f63887b;

    static {
        Covode.recordClassIndex(32466);
    }

    RunnableC26990p(C26975a aVar, Set set) {
        this.f63887b = aVar;
        this.f63886a = set;
    }

    public final void run() {
        try {
            for (String str : this.f63886a) {
                this.f63887b.f63861b.mo44687e(str);
            }
        } catch (Exception unused) {
        }
    }
}
