package com.p2082ss.android.ugc.aweme.kids.choosemusic.p3323e;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.arch.C33935b;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3325g.C57269d;
import com.p2082ss.android.ugc.aweme.music.model.CollectedMusicList;
import java.util.List;
import p077b.AbstractC1729g;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.kids.choosemusic.e.l */
public final /* synthetic */ class C57250l implements AbstractC1729g {

    /* renamed from: a */
    private final C57238a f130408a;

    static {
        Covode.recordClassIndex(67155);
    }

    public C57250l(C57238a aVar) {
        this.f130408a = aVar;
    }

    @Override // p077b.AbstractC1729g
    public final Object then(C1731i iVar) {
        C57238a aVar = this.f130408a;
        aVar.f130384f = false;
        if (iVar.mo5544c()) {
            aVar.f130380b.mo60191a("loadmore_status_user_collected_music", (Object) 1);
            return null;
        } else if (!iVar.mo5535a()) {
            return null;
        } else {
            CollectedMusicList collectedMusicList = (CollectedMusicList) iVar.mo5545d();
            List list = (List) ((C33935b) aVar.f130380b.mo60192a("user_collected_music_list")).mo60174a("list_data");
            list.addAll(C57269d.m103831a(collectedMusicList.items));
            C33935b bVar = new C33935b();
            bVar.mo60173a("loadmore_status_user_collected_music", 0).mo60173a("list_cursor", Integer.valueOf(collectedMusicList.cursor)).mo60173a("list_hasmore", Integer.valueOf(collectedMusicList.hasMore)).mo60173a("action_type", 2).mo60173a("list_data", list);
            aVar.f130380b.mo60191a("user_collected_music_list", bVar);
            return null;
        }
    }
}
