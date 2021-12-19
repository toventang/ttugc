package com.p2082ss.android.ugc.aweme.choosemusic.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.arch.C33935b;
import com.p2082ss.android.ugc.aweme.choosemusic.utils.C35937c;
import com.p2082ss.android.ugc.aweme.music.model.MusicList;
import java.util.List;
import p077b.AbstractC1729g;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.model.h */
public final /* synthetic */ class C35906h implements AbstractC1729g {

    /* renamed from: a */
    private final C35899b f84748a;

    static {
        Covode.recordClassIndex(43146);
    }

    public C35906h(C35899b bVar) {
        this.f84748a = bVar;
    }

    @Override // p077b.AbstractC1729g
    public final Object then(C1731i iVar) {
        C35899b bVar = this.f84748a;
        bVar.f84735h = false;
        if (iVar.mo5544c()) {
            bVar.f84729b.mo60191a("loadmore_status_hot_music_list", (Object) 1);
            return null;
        } else if (!iVar.mo5535a()) {
            return null;
        } else {
            MusicList musicList = (MusicList) iVar.mo5545d();
            List list = (List) ((C33935b) bVar.f84729b.mo60192a("hot_music_list_data")).mo60174a("list_data");
            list.addAll(C35937c.m73326a(musicList.items));
            C33935b bVar2 = new C33935b();
            bVar2.mo60173a("loadmore_status_hot_music_list", 0).mo60173a("list_cursor", Integer.valueOf(musicList.getCursor())).mo60173a("list_hasmore", Integer.valueOf(musicList.hasMore)).mo60173a("action_type", 2).mo60173a("list_data", list);
            bVar.f84729b.mo60191a("hot_music_list_data", bVar2);
            return null;
        }
    }
}
