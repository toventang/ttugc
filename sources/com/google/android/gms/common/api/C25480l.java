package com.google.android.gms.common.api;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.C25467r;
import com.google.android.gms.common.internal.C25565r;

/* renamed from: com.google.android.gms.common.api.l */
public final class C25480l {
    static {
        Covode.recordClassIndex(30879);
    }

    /* renamed from: com.google.android.gms.common.api.l$a */
    public static final class C25481a<R extends AbstractC25485p> extends BasePendingResult<R> {

        /* renamed from: a */
        private final R f60472a;

        static {
            Covode.recordClassIndex(30880);
        }

        @Override // com.google.android.gms.common.api.internal.BasePendingResult
        /* renamed from: a */
        public final R mo41417a(Status status) {
            return this.f60472a;
        }

        public C25481a(R r) {
            super(null);
            this.f60472a = r;
        }
    }

    /* renamed from: a */
    public static AbstractC25478k<Status> m49160a(Status status, AbstractC25357i iVar) {
        C25565r.m49315a(status, "Result must not be null");
        C25467r rVar = new C25467r(iVar);
        rVar.mo41542a((AbstractC25485p) status);
        return rVar;
    }
}
