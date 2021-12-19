package com.p2082ss.android.ugc.aweme.kids.choosemusic.p3323e;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.arch.C33935b;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3325g.C57269d;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3307e.C57111e;
import java.util.List;
import p077b.AbstractC1729g;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.kids.choosemusic.e.d */
public final /* synthetic */ class C57242d implements AbstractC1729g {

    /* renamed from: a */
    private final C57238a f130394a;

    static {
        Covode.recordClassIndex(67147);
    }

    public C57242d(C57238a aVar) {
        this.f130394a = aVar;
    }

    @Override // p077b.AbstractC1729g
    public final Object then(C1731i iVar) {
        C57238a aVar = this.f130394a;
        aVar.f130385g = false;
        if (iVar.mo5544c()) {
            aVar.f130380b.mo60191a("loadmore_status_hot_music_list", (Object) 1);
            return null;
        } else if (!iVar.mo5535a()) {
            return null;
        } else {
            C57111e eVar = (C57111e) iVar.mo5545d();
            List list = (List) ((C33935b) aVar.f130380b.mo60192a("hot_music_list_data")).mo60174a("list_data");
            list.addAll(C57269d.m103831a(eVar.f130030a));
            C33935b bVar = new C33935b();
            bVar.mo60173a("loadmore_status_hot_music_list", 0).mo60173a("list_cursor", Integer.valueOf(eVar.mo94260a())).mo60173a("list_hasmore", Integer.valueOf(eVar.f130034e)).mo60173a("action_type", 2).mo60173a("list_data", list);
            aVar.f130380b.mo60191a("hot_music_list_data", bVar);
            return null;
        }
    }
}
