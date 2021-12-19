package com.bytedance.ies.xbridge.p1326k.p1327a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18400b;
import com.bytedance.ies.xbridge.AbstractC18659k;
import com.bytedance.ies.xbridge.AbstractC18754n;
import com.bytedance.ies.xbridge.C18586i;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.EnumC18805o;
import com.bytedance.ies.xbridge.model.p1342c.AbstractC18744a;
import com.bytedance.ies.xbridge.model.params.AbstractC18749a;
import com.bytedance.ies.xbridge.p1296c.AbstractC18468a;
import com.bytedance.ies.xbridge.p1326k.p1329c.C18683e;
import com.bytedance.ies.xbridge.p1326k.p1329c.C18685f;
import java.util.LinkedHashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.k.a.c */
public abstract class AbstractC18666c extends AbstractC18468a {

    /* renamed from: a */
    private final String f44445a = "x.updateGecko";

    /* renamed from: b */
    private final AbstractC18400b.EnumC18401a f44446b = AbstractC18400b.EnumC18401a.PRIVATE;

    /* renamed from: com.bytedance.ies.xbridge.k.a.c$a */
    public interface AbstractC18667a {
        static {
            Covode.recordClassIndex(21361);
        }

        /* renamed from: a */
        void mo29721a(C18685f fVar, String str);

        /* renamed from: a */
        void mo29722a(String str);
    }

    static {
        Covode.recordClassIndex(21360);
    }

    /* renamed from: a */
    public abstract void mo29720a(C18683e eVar, AbstractC18667a aVar, EnumC18483e eVar2);

    @Override // com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: b */
    public final String mo7341b() {
        return this.f44445a;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: c */
    public final AbstractC18400b.EnumC18401a mo7346c() {
        return this.f44446b;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: d */
    public final Class<? extends AbstractC18749a> mo29415d() {
        return C18683e.class;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: e */
    public final Class<? extends AbstractC18744a> mo29416e() {
        return C18685f.class;
    }

    /* renamed from: com.bytedance.ies.xbridge.k.a.c$b */
    public static final class C18668b implements AbstractC18667a {

        /* renamed from: a */
        final /* synthetic */ AbstractC18666c f44447a;

        /* renamed from: b */
        final /* synthetic */ AbstractC18400b.AbstractC18402b f44448b;

        static {
            Covode.recordClassIndex(21362);
        }

        @Override // com.bytedance.ies.xbridge.p1326k.p1327a.AbstractC18666c.AbstractC18667a
        /* renamed from: a */
        public final void mo29722a(String str) {
            C89219l.m154719c(str, "");
            AbstractC18468a.m34357a(this.f44448b, 0, str, null, 8);
        }

        C18668b(AbstractC18666c cVar, AbstractC18400b.AbstractC18402b bVar) {
            this.f44447a = cVar;
            this.f44448b = bVar;
        }

        @Override // com.bytedance.ies.xbridge.p1326k.p1327a.AbstractC18666c.AbstractC18667a
        /* renamed from: a */
        public final void mo29721a(C18685f fVar, String str) {
            C89219l.m154719c(fVar, "");
            C89219l.m154719c(str, "");
            C89219l.m154719c(fVar, "");
            Integer num = fVar.f44468a;
            if (num != null) {
                num.intValue();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Integer num2 = fVar.f44468a;
                if (num2 != null) {
                    linkedHashMap.put("statusCode", Integer.valueOf(num2.intValue()));
                }
                AbstractC18666c.m34358a(this.f44448b, linkedHashMap, str);
                return;
            }
            AbstractC18468a.m34357a(this.f44448b, -5, null, null, 12);
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
        String str = C18586i.m34539a(nVar, "channel", "");
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        Boolean bool = null;
        if (!z) {
            String str2 = C18586i.m34539a(nVar, "accessKey", "");
            if (str2.length() != 0) {
                AbstractC18659k i = nVar.mo29766i("enableDownloadAutoRetry");
                if (i.mo29707a() == EnumC18805o.Boolean) {
                    bool = Boolean.valueOf(i.mo29708b());
                }
                C18683e eVar2 = new C18683e();
                C89219l.m154719c(str, "");
                eVar2.f44464a = str;
                C89219l.m154719c(str2, "");
                eVar2.f44465b = str2;
                if (bool != null) {
                    eVar2.f44466c = bool.booleanValue();
                }
                mo29720a(eVar2, new C18668b(this, bVar), eVar);
                return;
            }
        }
        AbstractC18468a.m34357a(bVar, -3, null, null, 12);
    }
}
