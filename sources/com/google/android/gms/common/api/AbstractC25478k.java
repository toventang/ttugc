package com.google.android.gms.common.api;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.api.AbstractC25485p;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.common.api.k */
public abstract class AbstractC25478k<R extends AbstractC25485p> {

    /* renamed from: com.google.android.gms.common.api.k$a */
    public interface AbstractC25479a {
        static {
            Covode.recordClassIndex(30878);
        }

        /* renamed from: a */
        void mo41717a(Status status);
    }

    static {
        Covode.recordClassIndex(30877);
    }

    /* renamed from: a */
    public abstract R mo41538a(TimeUnit timeUnit);

    /* renamed from: a */
    public abstract void mo41539a();

    /* renamed from: a */
    public abstract void mo41543a(AbstractC25486q<? super R> qVar);

    /* renamed from: b */
    public abstract boolean mo41544b();

    /* renamed from: c */
    public Integer mo41545c() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public void mo41541a(AbstractC25479a aVar) {
        throw new UnsupportedOperationException();
    }
}
