package com.p2082ss.android.ugc.aweme.account.agegate.p2238c;

import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1626a.AbstractC22329e;
import com.bytedance.sdk.p1625a.p1626a.p1627a.C22289b;
import com.bytedance.sdk.p1625a.p1626a.p1627a.C22291d;
import com.bytedance.sdk.p1625a.p1645h.p1646a.C22421p;
import com.bytedance.sdk.p1625a.p1645h.p1647b.C22449l;
import com.bytedance.sdk.p1625a.p1645h.p1647b.p1648a.AbstractC22435m;
import com.bytedance.sdk.p1625a.p1645h.p1647b.p1648a.AbstractC22437o;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.agegate.c.e */
public final class C31522e {

    /* renamed from: b */
    public static final C31523a f75406b = new C31523a((byte) 0);

    /* renamed from: a */
    final AbstractC22329e f75407a;

    static {
        Covode.recordClassIndex(38239);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.c.e$a */
    public static final class C31523a {
        static {
            Covode.recordClassIndex(38240);
        }

        private C31523a() {
        }

        public /* synthetic */ C31523a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.c.e$b */
    public static final class C31524b extends AbstractC22437o {

        /* renamed from: c */
        final /* synthetic */ AbstractC89172b f75408c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89172b f75409d;

        static {
            Covode.recordClassIndex(38241);
        }

        @Override // com.bytedance.sdk.p1625a.AbstractC22358e, com.bytedance.sdk.p1625a.AbstractC22346c
        /* renamed from: e */
        public final /* synthetic */ void mo36686e(C22289b bVar) {
            mo36686e((C22291d) bVar);
        }

        @Override // com.bytedance.sdk.p1625a.AbstractC22358e
        /* renamed from: a */
        public final void mo36711a(C22291d<C22421p> dVar) {
            if (dVar == null || dVar.f52723j == null || ((C22421p) dVar.f52723j).f53058c == null) {
                this.f75409d.invoke(dVar);
            } else {
                this.f75408c.invoke(dVar);
            }
        }

        C31524b(AbstractC89172b bVar, AbstractC89172b bVar2) {
            this.f75408c = bVar;
            this.f75409d = bVar2;
        }

        @Override // com.bytedance.sdk.p1625a.AbstractC22358e, com.bytedance.sdk.p1625a.AbstractC22346c
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo36681a(C22289b bVar, int i) {
            mo36681a((C22291d) bVar, i);
        }

        @Override // com.bytedance.sdk.p1625a.AbstractC22358e
        /* renamed from: a */
        public final void mo36712a(C22291d<C22421p> dVar, int i) {
            this.f75409d.invoke(dVar);
        }
    }

    public C31522e(AbstractC22329e eVar) {
        C89219l.m154721d(eVar, "");
        this.f75407a = eVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.c.e$c */
    public static final class C31525c extends AbstractC22435m {

        /* renamed from: c */
        final /* synthetic */ AbstractC89171a f75410c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89172b f75411d;

        static {
            Covode.recordClassIndex(38242);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
        @Override // com.bytedance.sdk.p1625a.p1626a.p1627a.AbstractC22288a
        /* renamed from: a */
        public final /* synthetic */ void mo36605a(C22291d<C22449l.C22450a> dVar) {
            String str;
            C22291d<C22449l.C22450a> dVar2 = dVar;
            if (dVar2 == null || !dVar2.f52713b) {
                AbstractC89172b bVar = this.f75411d;
                if (dVar2 != null) {
                    str = dVar2.f52717f;
                } else {
                    str = null;
                }
                bVar.invoke(str);
                return;
            }
            this.f75410c.invoke();
        }

        C31525c(AbstractC89171a aVar, AbstractC89172b bVar) {
            this.f75410c = aVar;
            this.f75411d = bVar;
        }
    }
}
