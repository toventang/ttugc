package com.p2082ss.android.ugc.aweme.choosemusic.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.arch.C33935b;
import com.p2082ss.android.ugc.aweme.choosemusic.utils.C35937c;
import com.p2082ss.android.ugc.aweme.music.model.MusicList;
import p077b.AbstractC1729g;
import p077b.C1731i;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.choosemusic.model.r */
public final /* synthetic */ class C35916r implements AbstractC1729g {

    /* renamed from: a */
    private final C35899b f84767a;

    /* renamed from: b */
    private final int f84768b;

    static {
        Covode.recordClassIndex(43156);
    }

    C35916r(C35899b bVar, int i) {
        this.f84767a = bVar;
        this.f84768b = i;
    }

    @Override // p077b.AbstractC1729g
    public final Object then(C1731i iVar) {
        C35899b bVar = this.f84767a;
        int i = this.f84768b;
        if (iVar.mo5544c()) {
            bVar.f84729b.mo60191a("status_second_level_music_list", (Object) 1);
            return null;
        } else if (!iVar.mo5535a()) {
            return null;
        } else {
            bVar.f84729b.mo60191a("status_second_level_music_list", (Object) 0);
            MusicList musicList = (MusicList) iVar.mo5545d();
            C33935b bVar2 = new C33935b();
            bVar2.mo60173a("list_cursor", Integer.valueOf(musicList.getCursor())).mo60173a("list_hasmore", Integer.valueOf(musicList.hasMore)).mo60173a("action_type", 1).mo60173a("list_level", Integer.valueOf(i)).mo60173a("list_collection_data", musicList.childCollections).mo60173a("list_data", C35937c.m73326a(musicList.items));
            bVar.f84729b.mo60191a("second_level_music_list", bVar2);
            return null;
        }
    }
}
