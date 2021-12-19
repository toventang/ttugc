package com.p2082ss.android.ugc.aweme.choosemusic.model;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.C27252o;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.choosemusic.utils.C35937c;
import com.p2082ss.android.ugc.aweme.music.p3469d.AbstractC60751a;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p077b.AbstractC1729g;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.model.m */
public final /* synthetic */ class C35911m implements AbstractC1729g {

    /* renamed from: a */
    private final C35899b f84761a;

    /* renamed from: b */
    private final C27252o f84762b;

    static {
        Covode.recordClassIndex(43151);
    }

    public C35911m(C35899b bVar, C27252o oVar) {
        this.f84761a = bVar;
        this.f84762b = oVar;
    }

    @Override // p077b.AbstractC1729g
    public final Object then(C1731i iVar) {
        C35899b bVar = this.f84761a;
        C27252o oVar = this.f84762b;
        bVar.f84730c = false;
        if (iVar.mo5539b()) {
            return null;
        }
        long a = oVar.mo45339a(TimeUnit.MILLISECONDS);
        if (iVar.mo5544c()) {
            bVar.f84729b.mo60191a("collection_feed_status", (Object) 1);
            bVar.f84732e.onEventV3("tool_performance_api", new C33744d().mo59983a("api_type", "music_list").mo59981a("duration", a).mo59983a("scene", "discover").mo59980a("status", 1).mo59983a("error_domain", AbstractC60751a.f138050a).mo59983a("error_code", iVar.mo5546e().getMessage()).f79943a);
            return null;
        } else if (!iVar.mo5535a()) {
            return null;
        } else {
            C35886af afVar = (C35886af) iVar.mo5545d();
            bVar.f84729b.mo60191a("collection_feed_cursor", Integer.valueOf(afVar.f84685b));
            bVar.f84729b.mo60191a("collection_feed_has_more", Integer.valueOf(afVar.f84686c));
            List list = (List) bVar.f84729b.mo60192a("list");
            if (list == null) {
                bVar.f84729b.mo60191a("collection_feed_status", (Object) 1);
                return null;
            }
            for (C35885ae aeVar : ((C35886af) iVar.mo5545d()).f84684a) {
                list.add(new C35884ad(C35937c.m73326a(aeVar.f84683b), aeVar.f84682a, 2));
            }
            bVar.f84729b.mo60191a("list", list);
            bVar.f84729b.mo60191a("collection_feed_status", (Object) 0);
            bVar.f84732e.onEventV3("tool_performance_api", new C33744d().mo59983a("api_type", "music_list").mo59981a("duration", a).mo59983a("scene", "discover").mo59980a("status", 0).f79943a);
            return null;
        }
    }
}
