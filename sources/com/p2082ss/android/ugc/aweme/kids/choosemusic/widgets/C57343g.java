package com.p2082ss.android.ugc.aweme.kids.choosemusic.widgets;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.C57171a;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3325g.C57268c;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3326h.AbstractC57287k;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3327i.C57320o;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3312i.C57147c;
import com.p2082ss.android.ugc.aweme.p2479ck.C36125t;
import com.p2082ss.android.ugc.aweme.p2479ck.C36131u;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;
import java.util.UUID;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.kids.choosemusic.widgets.g */
public final /* synthetic */ class C57343g implements AbstractC57287k {

    /* renamed from: a */
    private final StickerMusicWidget f130715a;

    static {
        Covode.recordClassIndex(67254);
    }

    C57343g(StickerMusicWidget stickerMusicWidget) {
        this.f130715a = stickerMusicWidget;
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.choosemusic.p3326h.AbstractC57287k
    /* renamed from: a */
    public final void mo94379a(C57320o oVar, View view, MusicModel musicModel) {
        StickerMusicWidget stickerMusicWidget = this.f130715a;
        int id = view.getId();
        if (id == R.id.bxo) {
            C17873f.m33102j();
            oVar.mo94506d();
            boolean z = oVar.f130553s;
            String musicId = musicModel.getMusicId();
            C57171a aVar = stickerMusicWidget.f130703l;
            musicModel.getLogPb();
            C57268c.m103830a(z, musicId, aVar);
        } else if (id == R.id.bxq) {
            if (musicModel == null) {
                return;
            }
            if (musicModel.getMusicStatus() == 0 && musicModel.getMusic() != null) {
                String offlineDesc = musicModel.getMusic().getOfflineDesc();
                if (TextUtils.isEmpty(offlineDesc)) {
                    offlineDesc = view.getContext().getString(R.string.dau);
                }
                new C79459a(view.getContext()).mo123052a(offlineDesc).mo123053a();
            } else if (C57147c.m103544a(musicModel, view.getContext(), true)) {
                C36125t.m73598a(C36125t.m73591a(), C36131u.m73602a("aweme://music/detail/" + musicModel.getMusicId()).mo63248a("process_id", UUID.randomUUID().toString()).mo63249a());
            }
        } else if (id == R.id.cds) {
            if (stickerMusicWidget.f130700i == oVar.f130556v && ((Integer) stickerMusicWidget.f80273e.mo60195b("music_position", (Object) -1)).intValue() == -2) {
                stickerMusicWidget.f80273e.mo60191a("music_position", (Object) -1);
                stickerMusicWidget.f80273e.mo60191a("music_index", (Object) -1);
                stickerMusicWidget.mo94555e();
                return;
            }
            if (stickerMusicWidget.f130699h != null) {
                stickerMusicWidget.mo94555e();
                C57268c.f130443b = oVar.f130556v;
                C57171a aVar2 = new C57171a("change_music_page", "prop", "", C57268c.f130442a);
                aVar2.f130164f = (String) stickerMusicWidget.f80273e.mo60195b("sticker_id", (Object) null);
                stickerMusicWidget.f130699h.mo94415a(new C57344h(stickerMusicWidget));
                stickerMusicWidget.f130699h.mo94417a(musicModel, aVar2);
            }
            stickerMusicWidget.f80273e.mo60191a("music_position", (Object) -2);
            stickerMusicWidget.f80273e.mo60191a("music_index", Integer.valueOf(oVar.f130556v));
            stickerMusicWidget.f80273e.mo60191a("music_loading", (Object) true);
        } else if (id == R.id.cey) {
            if (stickerMusicWidget.f130705n != null) {
                stickerMusicWidget.f130705n.mo94433b(9);
            }
            if (stickerMusicWidget.f130699h != null) {
                stickerMusicWidget.f130699h.mo94419b(musicModel);
                C57171a aVar3 = stickerMusicWidget.f130703l;
                String musicId2 = musicModel.getMusicId();
                int i = oVar.f130556v;
                musicModel.getLogPb();
                C57268c.m103826a(aVar3, musicId2, i);
            }
        }
    }
}
