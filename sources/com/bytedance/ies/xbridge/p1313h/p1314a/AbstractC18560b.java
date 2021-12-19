package com.bytedance.ies.xbridge.p1313h.p1314a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18400b;
import com.bytedance.ies.xbridge.AbstractC18754n;
import com.bytedance.ies.xbridge.C18586i;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.model.p1342c.C18745b;
import com.bytedance.ies.xbridge.p1296c.AbstractC18468a;
import com.bytedance.ies.xbridge.p1313h.p1316c.C18578b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.h.a.b */
public abstract class AbstractC18560b extends AbstractC18468a {

    /* renamed from: a */
    private final String f44240a = "x.reportALog";

    /* renamed from: b */
    private final AbstractC18400b.EnumC18401a f44241b = AbstractC18400b.EnumC18401a.PROTECT;

    /* renamed from: com.bytedance.ies.xbridge.h.a.b$a */
    public interface AbstractC18561a {
        static {
            Covode.recordClassIndex(21255);
        }

        /* renamed from: a */
        void mo29662a(C18745b bVar, String str);

        /* renamed from: a */
        void mo29663a(String str);
    }

    static {
        Covode.recordClassIndex(21254);
    }

    /* renamed from: a */
    public abstract void mo29661a(C18578b bVar, AbstractC18561a aVar, EnumC18483e eVar);

    @Override // com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: b */
    public final String mo7341b() {
        return this.f44240a;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: c */
    public final AbstractC18400b.EnumC18401a mo7346c() {
        return this.f44241b;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: d */
    public final Class<C18578b> mo29415d() {
        return C18578b.class;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: e */
    public final Class<C18745b> mo29416e() {
        return C18745b.class;
    }

    /* renamed from: com.bytedance.ies.xbridge.h.a.b$b */
    public static final class C18562b implements AbstractC18561a {

        /* renamed from: a */
        final /* synthetic */ AbstractC18560b f44242a;

        /* renamed from: b */
        final /* synthetic */ AbstractC18400b.AbstractC18402b f44243b;

        static {
            Covode.recordClassIndex(21256);
        }

        @Override // com.bytedance.ies.xbridge.p1313h.p1314a.AbstractC18560b.AbstractC18561a
        /* renamed from: a */
        public final void mo29663a(String str) {
            C89219l.m154719c(str, "");
            AbstractC18468a.m34357a(this.f44243b, -3, str, null, 8);
        }

        C18562b(AbstractC18560b bVar, AbstractC18400b.AbstractC18402b bVar2) {
            this.f44242a = bVar;
            this.f44243b = bVar2;
        }

        @Override // com.bytedance.ies.xbridge.p1313h.p1314a.AbstractC18560b.AbstractC18561a
        /* renamed from: a */
        public final void mo29662a(C18745b bVar, String str) {
            C89219l.m154719c(bVar, "");
            C89219l.m154719c(str, "");
            AbstractC18560b.m34358a(this.f44243b, C18745b.C18746a.m34815a(bVar), str);
        }
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: a */
    public final void mo7340a(AbstractC18754n nVar, AbstractC18400b.AbstractC18402b bVar, EnumC18483e eVar) {
        boolean z;
        String str;
        String str2;
        C89219l.m154719c(nVar, "");
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(eVar, "");
        C89219l.m154719c(nVar, "");
        String str3 = C18586i.m34539a(nVar, "level", "");
        int i = 0;
        if (str3.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            String str4 = C18586i.m34539a(nVar, "message", "");
            if (str4.length() != 0) {
                String str5 = C18586i.m34539a(nVar, "tag", "");
                if (str5.length() != 0) {
                    AbstractC18754n b = C18586i.m34543b(nVar, "codePosition");
                    if (b != null) {
                        i = C18586i.m34537a(b, "line", 0);
                        str2 = C18586i.m34539a(b, "function", "");
                        str = C18586i.m34539a(b, "file", "");
                    } else {
                        str = "";
                        str2 = str;
                    }
                    C18578b.C18579a aVar = new C18578b.C18579a(str, str2, i);
                    C18578b bVar2 = new C18578b();
                    C89219l.m154719c(str3, "");
                    bVar2.f44264a = str3;
                    C89219l.m154719c(str4, "");
                    bVar2.f44265b = str4;
                    C89219l.m154719c(str5, "");
                    bVar2.f44266c = str5;
                    bVar2.f44267d = aVar;
                    mo29661a(bVar2, new C18562b(this, bVar), eVar);
                    return;
                }
            }
        }
        AbstractC18468a.m34357a(bVar, -3, null, null, 12);
    }
}
