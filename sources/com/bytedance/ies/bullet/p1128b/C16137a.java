package com.bytedance.ies.bullet.p1128b;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.kit.lynx.ILynxKitApi;
import com.bytedance.ies.bullet.kit.p1148a.C16350j;
import com.bytedance.ies.bullet.p1125a.AbstractC16114a;
import com.bytedance.ies.bullet.p1125a.AbstractC16133g;
import com.bytedance.ies.bullet.p1125a.AbstractC16134h;
import com.bytedance.ies.bullet.p1125a.C16117b;
import com.bytedance.ies.bullet.p1129c.AbstractC16239d;
import com.bytedance.ies.bullet.p1129c.AbstractC16245e;
import com.bytedance.ies.bullet.p1129c.C16139a;
import com.bytedance.ies.bullet.p1129c.C16156c;
import com.bytedance.ies.bullet.p1129c.p1130a.C16148a;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.bullet.service.base.AbstractC16593ad;
import com.bytedance.ies.bullet.service.base.AbstractC16595af;
import com.bytedance.ies.bullet.service.base.AbstractC16654o;
import com.bytedance.ies.bullet.service.base.AbstractC16656q;
import com.bytedance.ies.bullet.service.base.AbstractC16670u;
import com.bytedance.ies.bullet.service.base.IResourceLoaderService;
import com.bytedance.ies.bullet.service.base.p1164b.C16622e;
import com.bytedance.ies.bullet.service.base.p1164b.C16624f;
import com.bytedance.ies.bullet.service.base.p1165c.AbstractC16628b;
import com.bytedance.ies.bullet.service.p1162b.C16560a;
import com.bytedance.ies.bullet.service.p1169c.C16705b;
import com.bytedance.ies.bullet.service.p1171e.C16712b;
import com.bytedance.ies.bullet.service.p1172f.C16863g;
import com.bytedance.ies.bullet.service.popup.C16977h;
import com.bytedance.p1436j.p1437a.C20087d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.b.a */
public final class C16137a extends AbstractC16114a {

    /* renamed from: c */
    private AbstractC16134h f38827c;

    static {
        Covode.recordClassIndex(18430);
    }

    /* renamed from: com.bytedance.ies.bullet.b.a$a */
    public static final class C16138a implements AbstractC16245e {

        /* renamed from: a */
        public final /* synthetic */ C16117b f38828a;

        static {
            Covode.recordClassIndex(18431);
        }

        @Override // com.bytedance.ies.bullet.p1129c.AbstractC16245e
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ AbstractC16239d.AbstractC16241b mo25652a() {
            return this.f38828a;
        }

        C16138a(C16117b bVar) {
            this.f38828a = bVar;
        }
    }

    @Override // com.bytedance.ies.bullet.p1125a.AbstractC16114a
    /* renamed from: a */
    public final C16117b.C16118a mo25650a() {
        Application application = this.f38827c.mo25672a().f38893c;
        C16117b.C16118a aVar = this.f38809b;
        C16624f.C16625a a = aVar.f38814a.mo26383a(AbstractC16593ad.class, new C16712b(application)).mo26383a(AbstractC16595af.class, new C16863g(this.f38827c.mo25673b())).mo26383a(AbstractC16656q.class, new C16705b(this.f38827c.mo25678g())).mo26383a(AbstractC16670u.class, new C16977h(this.f38827c.mo25679h())).mo26383a(AbstractC16628b.class, new C20087d(this.f38827c.mo25677f()));
        C16350j jVar = new C16350j(application);
        jVar.init(this.f38827c.mo25674c());
        a.mo26383a(IResourceLoaderService.class, jVar).mo26383a(AbstractC16654o.class, new C16560a(this.f38827c.mo25675d(), this.f38827c.mo25676e()));
        return aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16137a(AbstractC16134h hVar) {
        super(hVar);
        C89219l.m154719c(hVar, "");
        this.f38827c = hVar;
    }

    @Override // com.bytedance.ies.bullet.p1125a.AbstractC16114a
    /* renamed from: a */
    public final C16117b mo25651a(String str) {
        C89219l.m154719c(str, "");
        Application application = this.f38827c.mo25672a().f38893c;
        C16148a aVar = new C16148a(this.f38827c.mo25672a().f38893c);
        if (str.length() == 0) {
            str = this.f38827c.mo25672a().f38891a;
        }
        C89219l.m154719c(str, "");
        aVar.f38891a = str;
        aVar.mo25697a(this.f38827c.mo25672a().f38892b);
        C16117b.C16118a a = mo25650a();
        C16622e.C16623a.m30858a().mo26349a(aVar.f38891a, a.f38814a.mo26384a(aVar.f38891a).mo26385a());
        C16117b.C16118a aVar2 = (C16117b.C16118a) a.mo25661a(ILynxKitApi.class);
        C89219l.m154719c(application, "");
        C16139a.C16140a aVar3 = aVar2.f38815b;
        C16248b bVar = new C16248b();
        bVar.mo25831b(Application.class, application);
        C89219l.m154719c(bVar, "");
        aVar3.f38842a = bVar;
        C89219l.m154719c(aVar, "");
        C16139a.C16140a aVar4 = aVar2.f38815b;
        C89219l.m154719c(aVar, "");
        aVar4.f38843b = aVar;
        AbstractC16133g gVar = this.f38808a;
        if (gVar != null) {
            gVar.mo25671a(aVar2, aVar);
        }
        C16117b a2 = aVar2.mo25660a();
        C16156c.m29998a(aVar.f38891a, new C16138a(a2));
        return a2;
    }
}
