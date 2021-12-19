package com.bytedance.ies.xbridge.p1343n.p1344a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18400b;
import com.bytedance.ies.xbridge.AbstractC18754n;
import com.bytedance.ies.xbridge.C18586i;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.EnumC18805o;
import com.bytedance.ies.xbridge.model.p1342c.C18745b;
import com.bytedance.ies.xbridge.p1296c.AbstractC18468a;
import com.bytedance.ies.xbridge.p1343n.p1348d.C18803f;
import com.kakao.usermgmt.StringSet;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.n.a.f */
public abstract class AbstractC18772f extends AbstractC18468a {

    /* renamed from: a */
    private final String f44550a = "x.showToast";

    /* renamed from: b */
    private final AbstractC18400b.EnumC18401a f44551b = AbstractC18400b.EnumC18401a.PROTECT;

    /* renamed from: com.bytedance.ies.xbridge.n.a.f$a */
    public interface AbstractC18773a {
        static {
            Covode.recordClassIndex(21469);
        }

        /* renamed from: a */
        void mo29814a(C18745b bVar, String str);

        /* renamed from: a */
        void mo29815a(String str);
    }

    static {
        Covode.recordClassIndex(21468);
    }

    /* renamed from: a */
    public abstract void mo29813a(C18803f fVar, AbstractC18773a aVar, EnumC18483e eVar);

    @Override // com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: b */
    public final String mo7341b() {
        return this.f44550a;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: c */
    public final AbstractC18400b.EnumC18401a mo7346c() {
        return this.f44551b;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: d */
    public final Class<C18803f> mo29415d() {
        return C18803f.class;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: e */
    public final Class<C18745b> mo29416e() {
        return C18745b.class;
    }

    /* renamed from: com.bytedance.ies.xbridge.n.a.f$b */
    public static final class C18774b implements AbstractC18773a {

        /* renamed from: a */
        final /* synthetic */ AbstractC18772f f44552a;

        /* renamed from: b */
        final /* synthetic */ AbstractC18400b.AbstractC18402b f44553b;

        static {
            Covode.recordClassIndex(21470);
        }

        @Override // com.bytedance.ies.xbridge.p1343n.p1344a.AbstractC18772f.AbstractC18773a
        /* renamed from: a */
        public final void mo29815a(String str) {
            C89219l.m154719c(str, "");
            AbstractC18468a.m34357a(this.f44553b, 0, str, null, 8);
        }

        C18774b(AbstractC18772f fVar, AbstractC18400b.AbstractC18402b bVar) {
            this.f44552a = fVar;
            this.f44553b = bVar;
        }

        @Override // com.bytedance.ies.xbridge.p1343n.p1344a.AbstractC18772f.AbstractC18773a
        /* renamed from: a */
        public final void mo29814a(C18745b bVar, String str) {
            C89219l.m154719c(bVar, "");
            C89219l.m154719c(str, "");
            AbstractC18772f.m34358a(this.f44553b, C18745b.C18746a.m34815a(bVar), str);
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
        String str = C18586i.m34539a(nVar, "message", "");
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            String str2 = C18586i.m34539a(nVar, StringSet.type, "");
            if (str2.length() != 0) {
                int i = 3000;
                if (nVar.mo29757a("duration")) {
                    if (nVar.mo29766i("duration").mo29707a() == EnumC18805o.Int) {
                        i = C18586i.m34537a(nVar, "duration", 3000);
                    } else if (nVar.mo29766i("duration").mo29707a() == EnumC18805o.Number) {
                        i = (int) C18586i.m34536a(nVar, "duration", 3000.0d);
                    }
                }
                C18803f fVar = new C18803f();
                C89219l.m154719c(str, "");
                fVar.f44590a = str;
                C89219l.m154719c(str2, "");
                fVar.f44591b = str2;
                fVar.f44592c = Integer.valueOf(i);
                mo29813a(fVar, new C18774b(this, bVar), eVar);
                return;
            }
        }
        AbstractC18468a.m34357a(bVar, -3, null, null, 12);
    }
}
