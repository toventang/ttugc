package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.api.AbstractC25357i;
import com.google.android.gms.common.api.AbstractC25485p;
import com.google.android.gms.common.api.C25335a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C25565r;
import com.google.android.gms.common.internal.C25566s;

/* renamed from: com.google.android.gms.common.api.internal.d */
public final class C25446d {

    /* renamed from: com.google.android.gms.common.api.internal.d$b */
    public interface AbstractC25448b<R> {
        static {
            Covode.recordClassIndex(30847);
        }

        /* renamed from: a */
        void mo41419a(R r);
    }

    static {
        Covode.recordClassIndex(30845);
    }

    /* renamed from: com.google.android.gms.common.api.internal.d$a */
    public static abstract class AbstractC25447a<R extends AbstractC25485p, A extends C25335a.AbstractC25337b> extends BasePendingResult<R> implements AbstractC25448b<R> {

        /* renamed from: a */
        public final C25335a.C25338c<A> f60401a;

        /* renamed from: b */
        public final C25335a<?> f60402b;

        static {
            Covode.recordClassIndex(30846);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo41418a(A a);

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.google.android.gms.common.api.internal.d$a<R extends com.google.android.gms.common.api.p, A extends com.google.android.gms.common.api.a$b> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.gms.common.api.internal.C25446d.AbstractC25448b
        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo41419a(Object obj) {
            super.mo41542a((AbstractC25485p) obj);
        }

        /* renamed from: a */
        private void m49069a(RemoteException remoteException) {
            mo41682b(new Status(8, remoteException.getLocalizedMessage(), null));
        }

        /* renamed from: b */
        public final void mo41682b(Status status) {
            C25565r.m49325b(!status.mo41477c(), "Failed result must not be success");
            mo41542a((AbstractC25485p) mo41417a(status));
        }

        /* renamed from: b */
        public final void mo41683b(A a) {
            if (a instanceof C25566s) {
                a = ((C25566s) a).f60636a;
            }
            try {
                mo41418a((C25335a.AbstractC25337b) a);
            } catch (DeadObjectException e) {
                m49069a((RemoteException) e);
                throw e;
            } catch (RemoteException e2) {
                m49069a(e2);
            }
        }

        public AbstractC25447a(C25335a<?> aVar, AbstractC25357i iVar) {
            super((AbstractC25357i) C25565r.m49315a(iVar, "GoogleApiClient must not be null"));
            C25565r.m49315a(aVar, "Api must not be null");
            this.f60401a = (C25335a.C25338c<A>) aVar.mo41483b();
            this.f60402b = aVar;
        }
    }
}
