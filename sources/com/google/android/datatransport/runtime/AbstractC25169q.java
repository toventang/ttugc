package com.google.android.datatransport.runtime;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.runtime.scheduling.p1929a.AbstractC25182c;
import java.io.Closeable;

/* renamed from: com.google.android.datatransport.runtime.q */
abstract class AbstractC25169q implements Closeable {

    /* renamed from: com.google.android.datatransport.runtime.q$a */
    interface AbstractC25170a {
        static {
            Covode.recordClassIndex(30536);
        }

        /* renamed from: a */
        AbstractC25170a mo41132a(Context context);

        /* renamed from: a */
        AbstractC25169q mo41133a();
    }

    static {
        Covode.recordClassIndex(30535);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract C25168p mo41130a();

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract AbstractC25182c mo41131b();

    AbstractC25169q() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        mo41131b().close();
    }
}
