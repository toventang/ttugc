package com.bytedance.ies.xbridge.p1313h.p1314a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18400b;
import com.bytedance.ies.xbridge.AbstractC18659k;
import com.bytedance.ies.xbridge.AbstractC18754n;
import com.bytedance.ies.xbridge.C18586i;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.model.p1342c.C18745b;
import com.bytedance.ies.xbridge.p1296c.AbstractC18468a;
import com.bytedance.ies.xbridge.p1313h.p1316c.C18583d;
import com.bytedance.ies.xbridge.p1313h.p1316c.C18585e;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.h.a.d */
public abstract class AbstractC18566d extends AbstractC18468a {

    /* renamed from: a */
    private final String f44248a = "x.reportMonitorLog";

    /* renamed from: b */
    private final AbstractC18400b.EnumC18401a f44249b = AbstractC18400b.EnumC18401a.PROTECT;

    /* renamed from: com.bytedance.ies.xbridge.h.a.d$a */
    public interface AbstractC18567a {
        static {
            Covode.recordClassIndex(21261);
        }

        /* renamed from: a */
        void mo29667a(C18745b bVar, String str);

        /* renamed from: a */
        void mo29668a(String str);
    }

    static {
        Covode.recordClassIndex(21260);
    }

    /* renamed from: a */
    public abstract void mo29666a(C18583d dVar, AbstractC18567a aVar, EnumC18483e eVar);

    @Override // com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: b */
    public final String mo7341b() {
        return this.f44248a;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: c */
    public final AbstractC18400b.EnumC18401a mo7346c() {
        return this.f44249b;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: d */
    public final Class<C18583d> mo29415d() {
        return C18583d.class;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: e */
    public final Class<C18745b> mo29416e() {
        return C18745b.class;
    }

    /* renamed from: com.bytedance.ies.xbridge.h.a.d$b */
    public static final class C18568b implements AbstractC18567a {

        /* renamed from: a */
        final /* synthetic */ AbstractC18566d f44250a;

        /* renamed from: b */
        final /* synthetic */ AbstractC18400b.AbstractC18402b f44251b;

        static {
            Covode.recordClassIndex(21262);
        }

        @Override // com.bytedance.ies.xbridge.p1313h.p1314a.AbstractC18566d.AbstractC18567a
        /* renamed from: a */
        public final void mo29668a(String str) {
            C89219l.m154719c(str, "");
            AbstractC18468a.m34357a(this.f44251b, -3, str, null, 8);
        }

        C18568b(AbstractC18566d dVar, AbstractC18400b.AbstractC18402b bVar) {
            this.f44250a = dVar;
            this.f44251b = bVar;
        }

        @Override // com.bytedance.ies.xbridge.p1313h.p1314a.AbstractC18566d.AbstractC18567a
        /* renamed from: a */
        public final void mo29667a(C18745b bVar, String str) {
            C89219l.m154719c(bVar, "");
            C89219l.m154719c(str, "");
            AbstractC18566d.m34358a(this.f44251b, C18745b.C18746a.m34815a(bVar), str);
        }
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: a */
    public final void mo7340a(AbstractC18754n nVar, AbstractC18400b.AbstractC18402b bVar, EnumC18483e eVar) {
        boolean z;
        double d;
        C89219l.m154719c(nVar, "");
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(eVar, "");
        C89219l.m154719c(nVar, "");
        String str = C18586i.m34539a(nVar, "logType", "");
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            String str2 = C18586i.m34539a(nVar, "service", "");
            if (nVar.mo29757a("status")) {
                AbstractC18659k i = nVar.mo29766i("status");
                int i2 = C18585e.f44279a[i.mo29707a().ordinal()];
                if (i2 == 1) {
                    d = i.mo29709c();
                } else if (i2 == 2) {
                    d = i.mo29709c();
                }
                int i3 = (int) d;
                AbstractC18754n b = C18586i.m34543b(nVar, "value");
                if (b != null) {
                    C18583d dVar = new C18583d();
                    C89219l.m154719c(str, "");
                    dVar.f44275a = str;
                    C89219l.m154719c(str2, "");
                    dVar.f44276b = str2;
                    dVar.f44277c = i3;
                    C89219l.m154719c(b, "");
                    dVar.f44278d = b;
                    mo29666a(dVar, new C18568b(this, bVar), eVar);
                    return;
                }
            }
        }
        AbstractC18468a.m34357a(bVar, -3, null, null, 12);
    }
}
