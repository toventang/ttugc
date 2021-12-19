package com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3602b.p3604b;

import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.service.C12801d;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.navigation.p1723a.C23194g;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.widgets.common.AbstractC64616j;
import com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3601a.AbstractC64962i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.b.b.i */
public final class C65072i extends AbstractC64962i {
    static {
        Covode.recordClassIndex(76540);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3601a.AbstractC64962i, com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3601a.AbstractC64941c, com.bytedance.assem.arch.core.AbstractC12748a
    /* renamed from: f */
    public final void mo20518f() {
        super.mo20518f();
        C12801d.m23020a(this, C89204ab.m154669a(AbstractC64616j.class), C65075j.f146927a, new C65073a(this));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.tux.navigation.a.c] */
    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3601a.AbstractC64941c
    /* renamed from: a */
    public final /* synthetic */ void mo104269a(C23194g gVar) {
        C23194g gVar2 = gVar;
        C89219l.m154721d(gVar2, "");
        gVar2.mo37753a("");
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.b.b.i$a */
    static final class C65073a extends AbstractC89220m implements AbstractC89172b<C12776a<? extends User>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C65072i f146924a;

        static {
            Covode.recordClassIndex(76541);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65073a(C65072i iVar) {
            super(1);
            this.f146924a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C12776a<? extends User> aVar) {
            final T t;
            C12776a<? extends User> aVar2 = aVar;
            if (aVar2 != null) {
                t = aVar2.f31085a;
            } else {
                t = null;
            }
            this.f146924a.mo104291a(new AbstractC89172b<C23194g, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3602b.p3604b.C65072i.C65073a.C650741 */

                /* renamed from: a */
                final /* synthetic */ C65073a f146925a;

                static {
                    Covode.recordClassIndex(76542);
                }

                {
                    this.f146925a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23194g gVar) {
                    C23194g gVar2 = gVar;
                    C89219l.m154721d(gVar2, "");
                    gVar2.mo37751a(C65072i.m116720a(t)).mo37754b(C65072i.m116721b(t));
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }
}
