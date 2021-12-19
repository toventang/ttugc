package com.p2082ss.android.ugc.aweme.choosemusic.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.arch.C33935b;
import com.p2082ss.android.ugc.aweme.choosemusic.utils.C35937c;
import com.p2082ss.android.ugc.aweme.music.model.CollectedMusicList;
import java.util.List;
import p077b.AbstractC1729g;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.model.f */
public final /* synthetic */ class C35904f implements AbstractC1729g {

    /* renamed from: a */
    private final C35899b f84746a;

    static {
        Covode.recordClassIndex(43144);
    }

    public C35904f(C35899b bVar) {
        this.f84746a = bVar;
    }

    @Override // p077b.AbstractC1729g
    public final Object then(C1731i iVar) {
        C35899b bVar = this.f84746a;
        bVar.f84734g = false;
        if (iVar.mo5544c()) {
            bVar.f84729b.mo60191a("loadmore_status_user_collected_music", (Object) 1);
            return null;
        } else if (!iVar.mo5535a()) {
            return null;
        } else {
            CollectedMusicList collectedMusicList = (CollectedMusicList) iVar.mo5545d();
            List list = (List) ((C33935b) bVar.f84729b.mo60192a("user_collected_music_list")).mo60174a("list_data");
            list.addAll(C35937c.m73326a(collectedMusicList.items));
            C33935b bVar2 = new C33935b();
            bVar2.mo60173a("loadmore_status_user_collected_music", 0).mo60173a("list_cursor", Integer.valueOf(collectedMusicList.cursor)).mo60173a("list_hasmore", Integer.valueOf(collectedMusicList.hasMore)).mo60173a("action_type", 2).mo60173a("list_data", list);
            bVar.f84729b.mo60191a("user_collected_music_list", bVar2);
            return null;
        }
    }
}
