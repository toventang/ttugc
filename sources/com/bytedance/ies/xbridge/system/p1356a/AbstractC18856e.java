package com.bytedance.ies.xbridge.system.p1356a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18400b;
import com.bytedance.ies.xbridge.AbstractC18754n;
import com.bytedance.ies.xbridge.C18586i;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.model.p1342c.C18745b;
import com.bytedance.ies.xbridge.p1296c.AbstractC18468a;
import com.bytedance.ies.xbridge.system.p1361c.C18904f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.system.a.e */
public abstract class AbstractC18856e extends AbstractC18468a {

    /* renamed from: a */
    private final String f44666a = "x.sendSMS";

    /* renamed from: b */
    private final AbstractC18400b.EnumC18401a f44667b = AbstractC18400b.EnumC18401a.PROTECT;

    /* renamed from: com.bytedance.ies.xbridge.system.a.e$a */
    public interface AbstractC18857a {
        static {
            Covode.recordClassIndex(21566);
        }

        /* renamed from: a */
        void mo29842a(C18745b bVar, String str);

        /* renamed from: a */
        void mo29843a(String str);
    }

    static {
        Covode.recordClassIndex(21565);
    }

    /* renamed from: a */
    public abstract void mo29841a(C18904f fVar, AbstractC18857a aVar, EnumC18483e eVar);

    @Override // com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: b */
    public final String mo7341b() {
        return this.f44666a;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: c */
    public final AbstractC18400b.EnumC18401a mo7346c() {
        return this.f44667b;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: d */
    public final Class<C18904f> mo29415d() {
        return C18904f.class;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: e */
    public final Class<C18745b> mo29416e() {
        return C18745b.class;
    }

    /* renamed from: com.bytedance.ies.xbridge.system.a.e$b */
    public static final class C18858b implements AbstractC18857a {

        /* renamed from: a */
        final /* synthetic */ AbstractC18856e f44668a;

        /* renamed from: b */
        final /* synthetic */ AbstractC18400b.AbstractC18402b f44669b;

        static {
            Covode.recordClassIndex(21567);
        }

        @Override // com.bytedance.ies.xbridge.system.p1356a.AbstractC18856e.AbstractC18857a
        /* renamed from: a */
        public final void mo29843a(String str) {
            C89219l.m154719c(str, "");
            AbstractC18468a.m34357a(this.f44669b, 0, str, null, 8);
        }

        C18858b(AbstractC18856e eVar, AbstractC18400b.AbstractC18402b bVar) {
            this.f44668a = eVar;
            this.f44669b = bVar;
        }

        @Override // com.bytedance.ies.xbridge.system.p1356a.AbstractC18856e.AbstractC18857a
        /* renamed from: a */
        public final void mo29842a(C18745b bVar, String str) {
            C89219l.m154719c(bVar, "");
            C89219l.m154719c(str, "");
            AbstractC18856e.m34358a(this.f44669b, C18745b.C18746a.m34815a(bVar), str);
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
        String str = C18586i.m34539a(nVar, "phoneNumber", "");
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            String str2 = C18586i.m34539a(nVar, "content", "");
            if (str2.length() != 0) {
                C18904f fVar = new C18904f();
                C89219l.m154719c(str, "");
                fVar.f44742a = str;
                C89219l.m154719c(str2, "");
                fVar.f44743b = str2;
                mo29841a(fVar, new C18858b(this, bVar), eVar);
                return;
            }
        }
        AbstractC18468a.m34357a(bVar, -3, null, null, 12);
    }
}
