package com.p2082ss.android.ugc.aweme.commercialize.preview.manager;

import com.bytedance.covode.number.Covode;
import com.bytedance.tux.dialog.C23013a;
import com.bytedance.tux.dialog.p1713b.C23024a;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.preview.manager.a */
public final class C38324a {

    /* renamed from: a */
    public static C23013a f90568a;

    /* renamed from: b */
    public static final C38324a f90569b = new C38324a();

    private C38324a() {
    }

    static {
        Covode.recordClassIndex(45815);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.preview.manager.a$b */
    public static final class C38327b extends AbstractC89220m implements AbstractC89172b<C23013a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f90572a;

        static {
            Covode.recordClassIndex(45818);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C38327b(AbstractC89171a aVar) {
            super(1);
            this.f90572a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23013a aVar) {
            C89219l.m154721d(aVar, "");
            AbstractC89171a aVar2 = this.f90572a;
            if (aVar2 != null) {
                aVar2.invoke();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.preview.manager.a$a */
    public static final class C38325a extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f90570a;

        static {
            Covode.recordClassIndex(45816);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C38325a(AbstractC89171a aVar) {
            super(1);
            this.f90570a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23025b bVar) {
            C23025b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            bVar2.mo37416a(R.string.pr, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.commercialize.preview.manager.C38324a.C38325a.C383261 */

                /* renamed from: a */
                final /* synthetic */ C38325a f90571a;

                static {
                    Covode.recordClassIndex(45817);
                }

                {
                    this.f90571a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C23024a aVar2 = aVar;
                    C89219l.m154721d(aVar2, "");
                    aVar2.f54509b = true;
                    AbstractC89171a aVar3 = this.f90571a.f90570a;
                    if (aVar3 != null) {
                        aVar3.invoke();
                    }
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }
}
