package com.p2082ss.android.ugc.aweme.choosemusic.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.arch.C33935b;
import com.p2082ss.android.ugc.aweme.music.model.MusicCollection;
import java.util.List;
import p077b.AbstractC1729g;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.model.o */
public final /* synthetic */ class C35913o implements AbstractC1729g {

    /* renamed from: a */
    private final C35899b f84764a;

    static {
        Covode.recordClassIndex(43153);
    }

    public C35913o(C35899b bVar) {
        this.f84764a = bVar;
    }

    @Override // p077b.AbstractC1729g
    public final Object then(C1731i iVar) {
        C35899b bVar = this.f84764a;
        if (iVar.mo5544c()) {
            bVar.f84729b.mo60191a("loadmore_status_music_sheet", (Object) 1);
            return null;
        } else if (!iVar.mo5535a()) {
            return null;
        } else {
            bVar.f84729b.mo60191a("loadmore_status_music_sheet", (Object) 0);
            MusicCollection musicCollection = (MusicCollection) iVar.mo5545d();
            List list = (List) ((C33935b) bVar.f84729b.mo60192a("music_sheet_list")).mo60174a("list_data");
            list.addAll(musicCollection.getItems());
            C33935b bVar2 = new C33935b();
            bVar2.mo60173a("list_cursor", Long.valueOf(musicCollection.cursor)).mo60173a("list_hasmore", Boolean.valueOf(musicCollection.hasMore)).mo60173a("action_type", 2).mo60173a("list_data", list);
            bVar.f84729b.mo60191a("music_sheet_list", bVar2);
            return null;
        }
    }
}
