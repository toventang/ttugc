package com.bytedance.ies.xbridge.p1313h.p1314a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18400b;
import com.bytedance.ies.xbridge.AbstractC18754n;
import com.bytedance.ies.xbridge.C18586i;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.model.p1342c.C18745b;
import com.bytedance.ies.xbridge.p1296c.AbstractC18468a;
import com.bytedance.ies.xbridge.p1313h.p1316c.C18576a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.h.a.a */
public abstract class AbstractC18557a extends AbstractC18468a {

    /* renamed from: com.bytedance.ies.xbridge.h.a.a$a */
    public interface AbstractC18558a {
        static {
            Covode.recordClassIndex(21252);
        }

        /* renamed from: a */
        void mo29659a(int i, String str);

        /* renamed from: a */
        void mo29660a(C18745b bVar, String str);
    }

    static {
        Covode.recordClassIndex(21251);
    }

    /* renamed from: a */
    public abstract void mo29658a(C18576a aVar, AbstractC18558a aVar2, EnumC18483e eVar);

    @Override // com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: b */
    public final String mo7341b() {
        return "x.reportADLog";
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: c */
    public final AbstractC18400b.EnumC18401a mo7346c() {
        return AbstractC18400b.EnumC18401a.PROTECT;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: d */
    public final Class<C18576a> mo29415d() {
        return C18576a.class;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: e */
    public final Class<C18745b> mo29416e() {
        return C18745b.class;
    }

    /* renamed from: com.bytedance.ies.xbridge.h.a.a$b */
    public static final class C18559b implements AbstractC18558a {

        /* renamed from: a */
        final /* synthetic */ AbstractC18557a f44238a;

        /* renamed from: b */
        final /* synthetic */ AbstractC18400b.AbstractC18402b f44239b;

        static {
            Covode.recordClassIndex(21253);
        }

        C18559b(AbstractC18557a aVar, AbstractC18400b.AbstractC18402b bVar) {
            this.f44238a = aVar;
            this.f44239b = bVar;
        }

        @Override // com.bytedance.ies.xbridge.p1313h.p1314a.AbstractC18557a.AbstractC18558a
        /* renamed from: a */
        public final void mo29659a(int i, String str) {
            C89219l.m154719c(str, "");
            AbstractC18468a.m34357a(this.f44239b, i, str, null, 8);
        }

        @Override // com.bytedance.ies.xbridge.p1313h.p1314a.AbstractC18557a.AbstractC18558a
        /* renamed from: a */
        public final void mo29660a(C18745b bVar, String str) {
            C89219l.m154719c(bVar, "");
            C89219l.m154719c(str, "");
            AbstractC18557a.m34358a(this.f44239b, C18745b.C18746a.m34815a(bVar), str);
        }
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: a */
    public final void mo7340a(AbstractC18754n nVar, AbstractC18400b.AbstractC18402b bVar, EnumC18483e eVar) {
        boolean z;
        C89219l.m154719c(nVar, "");
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(eVar, "");
        C89219l.m154719c(nVar, "");
        String str = C18586i.m34539a(nVar, "label", "");
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            String str2 = C18586i.m34539a(nVar, "tag", "");
            if (str2.length() != 0) {
                String str3 = C18586i.m34539a(nVar, "refer", "");
                String str4 = C18586i.m34539a(nVar, "groupID", "");
                String str5 = C18586i.m34539a(nVar, "creativeID", "");
                String str6 = C18586i.m34539a(nVar, "logExtra", "");
                AbstractC18754n b = C18586i.m34543b(nVar, "extraParams");
                C18576a aVar = new C18576a();
                C89219l.m154719c(str, "");
                aVar.f44256a = str;
                C89219l.m154719c(str2, "");
                aVar.f44257b = str2;
                if (str3.length() > 0) {
                    aVar.f44258c = str3;
                }
                if (str4.length() > 0) {
                    aVar.f44259d = str4;
                }
                if (str5.length() > 0) {
                    aVar.f44260e = str5;
                }
                if (str6.length() > 0) {
                    aVar.f44261f = str6;
                }
                if (b != null) {
                    aVar.f44262g = b;
                }
                mo29658a(aVar, new C18559b(this, bVar), eVar);
                return;
            }
        }
        AbstractC18468a.m34357a(bVar, -3, null, null, 12);
    }
}
