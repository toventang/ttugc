package com.p2082ss.android.ugc.aweme.kids.choosemusic.p3323e;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.arch.C33935b;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3325g.C57269d;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3307e.C57111e;
import p077b.AbstractC1729g;
import p077b.C1731i;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.kids.choosemusic.e.j */
public final /* synthetic */ class C57248j implements AbstractC1729g {

    /* renamed from: a */
    private final C57238a f130404a;

    /* renamed from: b */
    private final int f130405b;

    static {
        Covode.recordClassIndex(67153);
    }

    C57248j(C57238a aVar, int i) {
        this.f130404a = aVar;
        this.f130405b = i;
    }

    @Override // p077b.AbstractC1729g
    public final Object then(C1731i iVar) {
        C57238a aVar = this.f130404a;
        int i = this.f130405b;
        if (iVar.mo5544c()) {
            aVar.f130380b.mo60191a("status_second_level_music_list", (Object) 1);
            return null;
        } else if (!iVar.mo5535a()) {
            return null;
        } else {
            aVar.f130380b.mo60191a("status_second_level_music_list", (Object) 0);
            C57111e eVar = (C57111e) iVar.mo5545d();
            C33935b bVar = new C33935b();
            bVar.mo60173a("list_cursor", Integer.valueOf(eVar.mo94260a())).mo60173a("list_hasmore", Integer.valueOf(eVar.f130034e)).mo60173a("action_type", 1).mo60173a("list_level", Integer.valueOf(i)).mo60173a("list_collection_data", eVar.f130037h).mo60173a("list_data", C57269d.m103831a(eVar.f130030a));
            aVar.f130380b.mo60191a("second_level_music_list", bVar);
            return null;
        }
    }
}
