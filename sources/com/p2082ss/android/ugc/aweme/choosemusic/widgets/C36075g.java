package com.p2082ss.android.ugc.aweme.choosemusic.widgets;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.p2082ss.android.ugc.aweme.AccountService;
import com.p2082ss.android.ugc.aweme.choosemusic.C35699a;
import com.p2082ss.android.ugc.aweme.choosemusic.C35754b;
import com.p2082ss.android.ugc.aweme.choosemusic.utils.C35936b;
import com.p2082ss.android.ugc.aweme.choosemusic.utils.C35937c;
import com.p2082ss.android.ugc.aweme.choosemusic.view.AbstractC35989s;
import com.p2082ss.android.ugc.aweme.choosemusic.viewholder.C36050s;
import com.p2082ss.android.ugc.aweme.music.p3476k.C60826d;
import com.p2082ss.android.ugc.aweme.p2479ck.C36125t;
import com.p2082ss.android.ugc.aweme.p2479ck.C36131u;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;
import java.util.UUID;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.choosemusic.widgets.g */
public final /* synthetic */ class C36075g implements AbstractC35989s {

    /* renamed from: a */
    private final StickerMusicWidget f85240a;

    static {
        Covode.recordClassIndex(43328);
    }

    C36075g(StickerMusicWidget stickerMusicWidget) {
        this.f85240a = stickerMusicWidget;
    }

    @Override // com.p2082ss.android.ugc.aweme.choosemusic.view.AbstractC35989s
    /* renamed from: a */
    public final void mo62753a(C36050s sVar, View view, MusicModel musicModel, int i) {
        StickerMusicWidget stickerMusicWidget = this.f85240a;
        int id = view.getId();
        if (id == R.id.bxo) {
            Activity j = C17873f.m33102j();
            if (j != null) {
                j.getString(R.string.bs5);
            }
            if (!AccountService.m65215a().mo57069e().isLogin()) {
                C35699a.m72864a(C17873f.m33102j(), C35937c.m73325a(i), "click_favorite_music");
                return;
            }
            sVar.mo63159e();
            C35936b.m73320a(sVar.f85025u, musicModel.getMusicId(), stickerMusicWidget.f85223l, sVar.f85028x, musicModel.getLogPb());
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
            } else if (C60826d.m110428a(musicModel, view.getContext(), true)) {
                String uuid = UUID.randomUUID().toString();
                C36125t.m73598a(C36125t.m73591a(), C36131u.m73602a("aweme://music/detail/" + musicModel.getMusicId()).mo63248a("process_id", uuid).mo63249a());
                C35936b.m73315a(new C35754b("change_music_page", "attached_song", "click_button", C35936b.f84812a), musicModel.getMusicId(), false, uuid);
            }
        } else if (id == R.id.cds) {
            if (stickerMusicWidget.f85220i == sVar.f85028x && ((Integer) stickerMusicWidget.f80273e.mo60195b("music_position", (Object) -1)).intValue() == -2) {
                stickerMusicWidget.f80273e.mo60191a("music_position", (Object) -1);
                stickerMusicWidget.f80273e.mo60191a("music_index", (Object) -1);
                stickerMusicWidget.mo63223e();
                return;
            }
            if (stickerMusicWidget.f85219h != null) {
                stickerMusicWidget.mo63223e();
                C35936b.f84814c = sVar.f85028x;
                C35754b bVar = new C35754b("change_music_page", "prop", "", C35936b.f84812a);
                bVar.f84352f = (String) stickerMusicWidget.f80273e.mo60195b("sticker_id", (Object) null);
                stickerMusicWidget.f85219h.mo62874a(new C36076h(stickerMusicWidget));
                stickerMusicWidget.f85219h.mo62877a(musicModel, bVar);
            }
            stickerMusicWidget.f80273e.mo60191a("music_position", (Object) -2);
            stickerMusicWidget.f80273e.mo60191a("music_index", Integer.valueOf(sVar.f85028x));
            stickerMusicWidget.f80273e.mo60191a("music_loading", (Object) true);
        } else if (id == R.id.cey) {
            if (stickerMusicWidget.f85225n != null) {
                stickerMusicWidget.f85225n.mo62918b(9);
            }
            if (stickerMusicWidget.f85219h != null) {
                stickerMusicWidget.f85219h.mo62881b(musicModel);
                C35936b.m73313a(stickerMusicWidget.f85223l, musicModel.getMusicId(), sVar.f85028x, musicModel.getLogPb());
            }
        }
    }
}
