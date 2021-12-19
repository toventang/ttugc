package com.google.android.gms.common.api.internal;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.common.api.AbstractC25357i;
import com.google.android.gms.common.api.AbstractC25478k;
import com.google.android.gms.common.api.AbstractC25485p;
import com.google.android.gms.common.api.AbstractC25486q;
import com.google.android.gms.common.api.AbstractC25487r;
import com.google.android.gms.common.api.AbstractC25488s;
import com.google.android.gms.common.api.AbstractC25489t;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C25565r;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.api.internal.bv */
public final class C25412bv<R extends AbstractC25485p> extends AbstractC25489t<R> implements AbstractC25486q<R> {

    /* renamed from: a */
    AbstractC25488s<? super R, ? extends AbstractC25485p> f60293a;

    /* renamed from: b */
    C25412bv<? extends AbstractC25485p> f60294b;

    /* renamed from: c */
    volatile AbstractC25487r<? super R> f60295c;

    /* renamed from: d */
    AbstractC25478k<R> f60296d;

    /* renamed from: e */
    final Object f60297e;

    /* renamed from: f */
    Status f60298f;

    /* renamed from: g */
    final WeakReference<AbstractC25357i> f60299g;

    /* renamed from: h */
    final HandlerC25413bw f60300h;

    /* renamed from: i */
    boolean f60301i;

    static {
        Covode.recordClassIndex(30811);
    }

    /* renamed from: a */
    private final boolean m48952a() {
        AbstractC25357i iVar = this.f60299g.get();
        if (this.f60295c == null || iVar == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo41632a(Status status) {
        MethodCollector.m26663i(10032);
        synchronized (this.f60297e) {
            try {
                this.f60298f = status;
                mo41633b(status);
            } finally {
                MethodCollector.m26664o(10032);
            }
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC25486q
    /* renamed from: a */
    public final void mo34357a(R r) {
        MethodCollector.m26663i(9877);
        synchronized (this.f60297e) {
            try {
                if (!r.mo41384D_().mo41477c()) {
                    mo41632a(r.mo41384D_());
                } else if (this.f60293a != null) {
                    C25405bo.f60279a.submit(new RunnableC25414bx(this, r));
                } else {
                    m48952a();
                }
            } finally {
                MethodCollector.m26664o(9877);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo41633b(Status status) {
        MethodCollector.m26663i(10188);
        synchronized (this.f60297e) {
            try {
                if (this.f60293a != null) {
                    C25565r.m49315a(status, "onFailure must not return null");
                    this.f60294b.mo41632a(status);
                } else {
                    m48952a();
                }
            } finally {
                MethodCollector.m26664o(10188);
            }
        }
    }
}
