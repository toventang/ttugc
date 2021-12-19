package com.p2082ss.android.ugc.aweme.deeplink;

import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.deeplink.u */
public final class C41065u {

    /* renamed from: a */
    static C41064t f95991a;

    /* renamed from: b */
    static String f95992b = "";

    /* renamed from: c */
    static boolean f95993c;

    /* renamed from: d */
    static AbstractC88412b f95994d;

    /* renamed from: e */
    static C41022c f95995e = new C41022c();

    /* renamed from: f */
    static C41035d f95996f;

    /* renamed from: g */
    public static final C41065u f95997g = new C41065u();

    private C41065u() {
    }

    /* renamed from: a */
    public static C41063s m82723a() {
        C41064t tVar = f95991a;
        if (tVar != null) {
            return tVar.f95990b;
        }
        return null;
    }

    static {
        Covode.recordClassIndex(48935);
    }

    /* renamed from: a */
    public static void m82724a(String str) {
        C89219l.m154721d(str, "");
        f95992b = str;
    }

    /* renamed from: com.ss.android.ugc.aweme.deeplink.u$a */
    static final class C41066a extends AbstractC89220m implements AbstractC89172b<C41069w, C89391z> {

        /* renamed from: a */
        public static final C41066a f95998a = new C41066a();

        static {
            Covode.recordClassIndex(48936);
        }

        C41066a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C41069w wVar) {
            Integer num;
            C41069w wVar2 = wVar;
            C89219l.m154721d(wVar2, "");
            String str = wVar2.f96002a;
            C41064t tVar = C41065u.f95991a;
            if (!(tVar == null || (num = tVar.f95989a.get(str)) == null)) {
                tVar.f95990b.f95987a = num.intValue();
            }
            C41063s a = C41065u.m82723a();
            if (a != null) {
                C41035d dVar = C41065u.f95996f;
                if (dVar == null) {
                    C89219l.m154715b();
                }
                a.mo70275a(dVar, a);
            }
            return C89391z.f203057a;
        }
    }
}
