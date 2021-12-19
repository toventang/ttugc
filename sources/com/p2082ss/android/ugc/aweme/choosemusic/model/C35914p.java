package com.p2082ss.android.ugc.aweme.choosemusic.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.arch.C33935b;
import com.p2082ss.android.ugc.aweme.choosemusic.utils.C35937c;
import com.p2082ss.android.ugc.aweme.music.model.MusicList;
import p077b.AbstractC1729g;
import p077b.C1731i;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.choosemusic.model.p */
public final /* synthetic */ class C35914p implements AbstractC1729g {

    /* renamed from: a */
    private final C35899b f84765a;

    static {
        Covode.recordClassIndex(43154);
    }

    C35914p(C35899b bVar) {
        this.f84765a = bVar;
    }

    @Override // p077b.AbstractC1729g
    public final Object then(C1731i iVar) {
        C35899b bVar = this.f84765a;
        bVar.f84733f = false;
        if (iVar.mo5544c()) {
            bVar.f84729b.mo60191a("refresh_status_music_list", (Object) 1);
            return null;
        } else if (!iVar.mo5535a()) {
            return null;
        } else {
            bVar.f84729b.mo60191a("refresh_status_music_list", (Object) 0);
            MusicList musicList = (MusicList) iVar.mo5545d();
            C33935b bVar2 = new C33935b();
            bVar2.mo60173a("list_cursor", Integer.valueOf(musicList.getCursor())).mo60173a("list_hasmore", Integer.valueOf(musicList.hasMore)).mo60173a("action_type", 1).mo60173a("list_data", C35937c.m73326a(musicList.items));
            bVar.f84729b.mo60191a("music_list", bVar2);
            bVar.f84729b.mo60191a("data_share_info", musicList.mcInfo.shareInfo);
            return null;
        }
    }
}
