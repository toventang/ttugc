package com.p2082ss.android.ugc.aweme.choosemusic.viewholder.recycler;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.AccountService;
import com.p2082ss.android.ugc.aweme.choosemusic.C35699a;
import com.p2082ss.android.ugc.aweme.choosemusic.activity.MusicDetailListActivity;
import com.p2082ss.android.ugc.aweme.choosemusic.utils.C35936b;
import com.p2082ss.android.ugc.aweme.choosemusic.utils.C35937c;
import com.p2082ss.android.ugc.aweme.choosemusic.view.AbstractC35989s;
import com.p2082ss.android.ugc.aweme.choosemusic.viewholder.C36050s;
import com.p2082ss.android.ugc.aweme.music.model.MusicCollectionItem;
import com.p2082ss.android.ugc.aweme.music.p3476k.C60826d;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;
import java.util.UUID;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.recycler.g */
public final /* synthetic */ class C36047g implements AbstractC35989s {

    /* renamed from: a */
    private final RecyclerMusicBoardWidget f85154a;

    /* renamed from: b */
    private final MusicCollectionItem f85155b;

    static {
        Covode.recordClassIndex(43295);
    }

    C36047g(RecyclerMusicBoardWidget recyclerMusicBoardWidget, MusicCollectionItem musicCollectionItem) {
        this.f85154a = recyclerMusicBoardWidget;
        this.f85155b = musicCollectionItem;
    }

    @Override // com.p2082ss.android.ugc.aweme.choosemusic.view.AbstractC35989s
    /* renamed from: a */
    public final void mo62753a(C36050s sVar, View view, MusicModel musicModel, int i) {
        RecyclerMusicBoardWidget recyclerMusicBoardWidget = this.f85154a;
        MusicCollectionItem musicCollectionItem = this.f85155b;
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
            C35936b.m73320a(sVar.f85025u, musicModel.getMusicId(), recyclerMusicBoardWidget.f85110n, sVar.f85028x, musicModel.getLogPb());
        } else if (id != R.id.bxq) {
            String str = "";
            if (id == R.id.f67) {
                Intent intent = new Intent(recyclerMusicBoardWidget.f80270b, MusicDetailListActivity.class);
                if (recyclerMusicBoardWidget.f85107k == 0) {
                    intent.putExtra("music_type", 1);
                    intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", recyclerMusicBoardWidget.f85109m);
                } else {
                    intent.putExtra("music_class_id", musicCollectionItem.mcId);
                    intent.putExtra("music_class_name", musicCollectionItem.mcName);
                    intent.putExtra("music_type", 2);
                    intent.putExtra("music_category_is_hot", musicCollectionItem.isHot);
                    intent.putExtra("music_class_enter_method", "click_more");
                    intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", recyclerMusicBoardWidget.f85109m);
                    intent.putExtra("music_class_level", musicCollectionItem.level);
                    intent.putExtra("sound_page_scene", recyclerMusicBoardWidget.f85115s);
                }
                recyclerMusicBoardWidget.mo60205a(intent, recyclerMusicBoardWidget.f85108l);
                C35936b.m73319a(musicCollectionItem.mcName, "click_more", str, "change_music_page", musicCollectionItem.mcId);
            } else if (id == R.id.cds) {
                if (sVar != null && musicModel != null) {
                    if (recyclerMusicBoardWidget.f85106j == sVar.f85028x && ((Integer) recyclerMusicBoardWidget.f80273e.mo60195b("music_position", (Object) -1)).intValue() == recyclerMusicBoardWidget.f85107k) {
                        recyclerMusicBoardWidget.f80273e.mo60191a("music_position", (Object) -1);
                        recyclerMusicBoardWidget.f80273e.mo60191a("music_index", (Object) -1);
                        sVar.mo63155a(false, false);
                        recyclerMusicBoardWidget.mo63194g();
                        return;
                    }
                    if (recyclerMusicBoardWidget.f85104h != null) {
                        recyclerMusicBoardWidget.mo63194g();
                        recyclerMusicBoardWidget.f85104h.mo62874a(new C36048h(recyclerMusicBoardWidget));
                        recyclerMusicBoardWidget.f85104h.mo62877a(musicModel, recyclerMusicBoardWidget.f85110n);
                        C35936b.f84814c = sVar.f85028x;
                    }
                    recyclerMusicBoardWidget.f80273e.mo60191a("music_position", Integer.valueOf(recyclerMusicBoardWidget.f85107k));
                    recyclerMusicBoardWidget.f80273e.mo60191a("music_index", Integer.valueOf(sVar.f85028x));
                    recyclerMusicBoardWidget.f80273e.mo60191a("music_loading", (Object) true);
                }
            } else if (id == R.id.cey && recyclerMusicBoardWidget.f85104h != null && musicModel != null) {
                String str2 = recyclerMusicBoardWidget.f85110n.f84351e;
                if (!C13627m.m24498a(str2)) {
                    str = str2;
                }
                musicModel.setCategoryID(str);
                recyclerMusicBoardWidget.f85104h.mo62881b(musicModel);
                C35936b.m73313a(recyclerMusicBoardWidget.f85110n, musicModel.getMusicId(), sVar.f85028x, musicModel.getLogPb());
            }
        } else if (musicModel == null) {
        } else {
            if (musicModel.getMusicStatus() == 0 && musicModel.getMusic() != null) {
                String offlineDesc = musicModel.getMusic().getOfflineDesc();
                if (TextUtils.isEmpty(offlineDesc)) {
                    offlineDesc = view.getContext().getString(R.string.dau);
                }
                new C79459a(view.getContext()).mo123052a(offlineDesc).mo123053a();
            } else if (C60826d.m110428a(musicModel, view.getContext(), true)) {
                String uuid = UUID.randomUUID().toString();
                SmartRouter.buildRoute(view.getContext(), "aweme://music/detail/" + musicModel.getMusicId()).withParam("process_id", uuid).open();
                C35936b.m73315a(recyclerMusicBoardWidget.f85110n, musicModel.getMusicId(), false, uuid);
            }
        }
    }
}
