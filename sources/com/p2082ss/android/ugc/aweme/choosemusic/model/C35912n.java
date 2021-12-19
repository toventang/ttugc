package com.p2082ss.android.ugc.aweme.choosemusic.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.arch.C33935b;
import com.p2082ss.android.ugc.aweme.music.model.MusicCollection;
import p077b.AbstractC1729g;
import p077b.C1731i;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.choosemusic.model.n */
public final /* synthetic */ class C35912n implements AbstractC1729g {

    /* renamed from: a */
    private final C35899b f84763a;

    static {
        Covode.recordClassIndex(43152);
    }

    C35912n(C35899b bVar) {
        this.f84763a = bVar;
    }

    @Override // p077b.AbstractC1729g
    public final Object then(C1731i iVar) {
        C35899b bVar = this.f84763a;
        if (iVar.mo5544c()) {
            bVar.f84729b.mo60191a("refresh_status_music_sheet", (Object) 1);
            return null;
        } else if (!iVar.mo5535a()) {
            return null;
        } else {
            bVar.f84729b.mo60191a("refresh_status_music_sheet", (Object) 0);
            MusicCollection musicCollection = (MusicCollection) iVar.mo5545d();
            C33935b bVar2 = new C33935b();
            bVar2.mo60173a("list_cursor", Long.valueOf(musicCollection.cursor)).mo60173a("list_hasmore", Boolean.valueOf(musicCollection.hasMore)).mo60173a("action_type", 1).mo60173a("list_data", musicCollection.getItems());
            bVar.f84729b.mo60191a("music_sheet_list", bVar2);
            return null;
        }
    }
}
