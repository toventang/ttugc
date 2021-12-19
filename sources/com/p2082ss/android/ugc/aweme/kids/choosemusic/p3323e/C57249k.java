package com.p2082ss.android.ugc.aweme.kids.choosemusic.p3323e;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.C27252o;
import com.p2082ss.android.ugc.aweme.arch.C33935b;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3325g.C57269d;
import com.p2082ss.android.ugc.aweme.music.model.CollectedMusicList;
import java.util.concurrent.TimeUnit;
import p077b.AbstractC1729g;
import p077b.C1731i;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.kids.choosemusic.e.k */
public final /* synthetic */ class C57249k implements AbstractC1729g {

    /* renamed from: a */
    private final C57238a f130406a;

    /* renamed from: b */
    private final C27252o f130407b;

    static {
        Covode.recordClassIndex(67154);
    }

    C57249k(C57238a aVar, C27252o oVar) {
        this.f130406a = aVar;
        this.f130407b = oVar;
    }

    @Override // p077b.AbstractC1729g
    public final Object then(C1731i iVar) {
        C57238a aVar = this.f130406a;
        C27252o oVar = this.f130407b;
        aVar.f130384f = false;
        oVar.mo45339a(TimeUnit.MILLISECONDS);
        if (iVar.mo5544c()) {
            aVar.f130380b.mo60191a("refresh_status_user_collected_music", (Object) 1);
            return null;
        } else if (!iVar.mo5535a()) {
            return null;
        } else {
            CollectedMusicList collectedMusicList = (CollectedMusicList) iVar.mo5545d();
            C33935b bVar = new C33935b();
            bVar.mo60173a("refresh_status_user_collected_music", 0).mo60173a("list_cursor", Integer.valueOf(collectedMusicList.cursor)).mo60173a("list_hasmore", Integer.valueOf(collectedMusicList.hasMore)).mo60173a("action_type", 1).mo60173a("list_data", C57269d.m103831a(collectedMusicList.items));
            aVar.f130380b.mo60191a("user_collected_music_list", bVar);
            return null;
        }
    }
}
