package com.p2082ss.android.ugc.aweme.kids.choosemusic.p3323e;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.C27252o;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3325g.C57269d;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p077b.AbstractC1729g;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.kids.choosemusic.e.c */
public final /* synthetic */ class C57241c implements AbstractC1729g {

    /* renamed from: a */
    private final C57238a f130392a;

    /* renamed from: b */
    private final C27252o f130393b;

    static {
        Covode.recordClassIndex(67146);
    }

    public C57241c(C57238a aVar, C27252o oVar) {
        this.f130392a = aVar;
        this.f130393b = oVar;
    }

    @Override // p077b.AbstractC1729g
    public final Object then(C1731i iVar) {
        C57238a aVar = this.f130392a;
        C27252o oVar = this.f130393b;
        aVar.f130381c = false;
        if (iVar.mo5539b()) {
            return null;
        }
        oVar.mo45339a(TimeUnit.MILLISECONDS);
        if (iVar.mo5544c()) {
            aVar.f130380b.mo60191a("collection_feed_status", (Object) 1);
            return null;
        } else if (!iVar.mo5535a()) {
            return null;
        } else {
            C57254p pVar = (C57254p) iVar.mo5545d();
            aVar.f130380b.mo60191a("collection_feed_cursor", Integer.valueOf(pVar.f130416b));
            aVar.f130380b.mo60191a("collection_feed_has_more", Integer.valueOf(pVar.f130417c));
            List list = (List) aVar.f130380b.mo60192a("list");
            if (list == null) {
                aVar.f130380b.mo60191a("collection_feed_status", (Object) 1);
                return null;
            }
            for (C57253o oVar2 : ((C57254p) iVar.mo5545d()).f130415a) {
                list.add(new C57252n(C57269d.m103831a(oVar2.f130414b), oVar2.f130413a, 2));
            }
            aVar.f130380b.mo60191a("list", list);
            aVar.f130380b.mo60191a("collection_feed_status", (Object) 0);
            return null;
        }
    }
}
