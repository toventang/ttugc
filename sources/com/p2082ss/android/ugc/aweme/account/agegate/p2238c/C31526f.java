package com.p2082ss.android.ugc.aweme.account.agegate.p2238c;

import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1626a.AbstractC22329e;
import com.bytedance.sdk.p1625a.p1626a.p1627a.C22291d;
import com.bytedance.sdk.p1625a.p1645h.p1646a.C22421p;
import com.bytedance.sdk.p1625a.p1663n.C22507a;
import com.p2082ss.android.ugc.aweme.C36085cj;
import com.p2082ss.android.ugc.aweme.account.login.C32306u;
import com.p2082ss.android.ugc.aweme.account.util.C33048q;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.agegate.c.f */
public final class C31526f {

    /* renamed from: a */
    public final C31522e f75412a;

    /* renamed from: b */
    public final AbstractC31533h f75413b;

    /* renamed from: c */
    public final boolean f75414c;

    /* renamed from: d */
    public final String f75415d;

    static {
        Covode.recordClassIndex(38243);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.c.f$a */
    static final class C31527a extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C31526f f75416a;

        static {
            Covode.recordClassIndex(38244);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31527a(C31526f fVar) {
            super(0);
            this.f75416a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C32306u.m66677a(true, this.f75416a.f75415d, null);
            this.f75416a.f75413b.mo57517e();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.c.f$b */
    static final class C31528b extends AbstractC89220m implements AbstractC89172b<String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C31526f f75417a;

        static {
            Covode.recordClassIndex(38245);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31528b(C31526f fVar) {
            super(1);
            this.f75417a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(String str) {
            String str2;
            String str3 = str;
            String str4 = this.f75417a.f75415d;
            if (str3 == null) {
                str2 = "response is null";
            } else {
                str2 = str3;
            }
            C32306u.m66677a(false, str4, str2);
            if (str3 == null || str3.length() == 0) {
                this.f75417a.f75413b.mo57511a(Integer.valueOf((int) R.string.d9x));
            } else {
                this.f75417a.f75413b.mo57512a(str3);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.c.f$c */
    static final class C31529c extends AbstractC89220m implements AbstractC89172b<C22291d<C22421p>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C31526f f75418a;

        static {
            Covode.recordClassIndex(38246);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31529c(C31526f fVar) {
            super(1);
            this.f75418a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22291d<C22421p> dVar) {
            final C22291d<C22421p> dVar2 = dVar;
            C32306u.m66676a(true, this.f75418a.f75415d, dVar2, "");
            if (this.f75418a.f75414c) {
                C33048q.m67693c(false);
            }
            C39223a.m79603q().mo68627a(true, new Runnable(this) {
                /* class com.p2082ss.android.ugc.aweme.account.agegate.p2238c.C31526f.C31529c.RunnableC315301 */

                /* renamed from: a */
                final /* synthetic */ C31529c f75419a;

                static {
                    Covode.recordClassIndex(38247);
                }

                {
                    this.f75419a = r1;
                }

                public final void run() {
                    C22507a aVar;
                    C22421p pVar;
                    C22291d dVar = dVar2;
                    if (dVar == null || (pVar = (C22421p) dVar.f52723j) == null) {
                        aVar = null;
                    } else {
                        aVar = pVar.f53058c;
                    }
                    C36085cj.m73542a(aVar);
                    this.f75419a.f75418a.f75413b.mo57437g();
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.c.f$d */
    static final class C31531d extends AbstractC89220m implements AbstractC89172b<C22291d<C22421p>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C31526f f75421a;

        static {
            Covode.recordClassIndex(38248);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31531d(C31526f fVar) {
            super(1);
            this.f75421a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22291d<C22421p> dVar) {
            String str;
            String str2;
            C22291d<C22421p> dVar2 = dVar;
            String str3 = this.f75421a.f75415d;
            String str4 = null;
            if (dVar2 != null) {
                str = dVar2.f52717f;
            } else {
                str = null;
            }
            C32306u.m66676a(false, str3, dVar2, str);
            if (dVar2 == null || (str2 = dVar2.f52717f) == null || str2.length() == 0) {
                this.f75421a.f75413b.mo57511a(Integer.valueOf((int) R.string.d9x));
            } else {
                AbstractC31533h hVar = this.f75421a.f75413b;
                if (dVar2 != null) {
                    str4 = dVar2.f52717f;
                }
                hVar.mo57512a(str4);
            }
            return C89391z.f203057a;
        }
    }

    public C31526f(AbstractC31533h hVar, boolean z, AbstractC22329e eVar, String str) {
        C89219l.m154721d(hVar, "");
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(str, "");
        this.f75413b = hVar;
        this.f75414c = z;
        this.f75415d = str;
        this.f75412a = new C31522e(eVar);
    }
}
