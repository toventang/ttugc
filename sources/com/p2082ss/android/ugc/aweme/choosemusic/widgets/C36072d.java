package com.p2082ss.android.ugc.aweme.choosemusic.widgets;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.p2082ss.android.ugc.aweme.AccountService;
import com.p2082ss.android.ugc.aweme.choosemusic.C35699a;
import com.p2082ss.android.ugc.aweme.choosemusic.activity.MusicDetailListActivity;
import com.p2082ss.android.ugc.aweme.choosemusic.utils.C35936b;
import com.p2082ss.android.ugc.aweme.choosemusic.utils.C35937c;
import com.p2082ss.android.ugc.aweme.choosemusic.view.AbstractC35989s;
import com.p2082ss.android.ugc.aweme.choosemusic.viewholder.C36050s;
import com.p2082ss.android.ugc.aweme.music.model.MusicCollectionItem;
import com.p2082ss.android.ugc.aweme.music.p3476k.C60826d;
import com.p2082ss.android.ugc.aweme.p2479ck.C36125t;
import com.p2082ss.android.ugc.aweme.p2479ck.C36131u;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;
import java.util.UUID;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.choosemusic.widgets.d */
public final /* synthetic */ class C36072d implements AbstractC35989s {

    /* renamed from: a */
    private final MusicBoardWidget f85236a;

    /* renamed from: b */
    private final MusicCollectionItem f85237b;

    static {
        Covode.recordClassIndex(43325);
    }

    C36072d(MusicBoardWidget musicBoardWidget, MusicCollectionItem musicCollectionItem) {
        this.f85236a = musicBoardWidget;
        this.f85237b = musicCollectionItem;
    }

    @Override // com.p2082ss.android.ugc.aweme.choosemusic.view.AbstractC35989s
    /* renamed from: a */
    public final void mo62753a(C36050s sVar, View view, MusicModel musicModel, int i) {
        MusicBoardWidget musicBoardWidget = this.f85236a;
        MusicCollectionItem musicCollectionItem = this.f85237b;
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
            C35936b.m73320a(sVar.f85025u, musicModel.getMusicId(), musicBoardWidget.f85205n, sVar.f85028x, musicModel.getLogPb());
        } else if (id != R.id.bxq) {
            String str = "";
            if (id == R.id.f67) {
                Intent intent = new Intent(musicBoardWidget.f80270b, MusicDetailListActivity.class);
                if (musicBoardWidget.f85202k == 0) {
                    intent.putExtra("music_type", 1);
                    intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", musicBoardWidget.f85204m);
                    intent.putExtra("sound_page_scene", musicBoardWidget.f85210s);
                } else {
                    intent.putExtra("music_class_id", musicCollectionItem.mcId);
                    intent.putExtra("music_class_name", musicCollectionItem.mcName);
                    intent.putExtra("music_type", 2);
                    intent.putExtra("music_category_is_hot", musicCollectionItem.isHot);
                    intent.putExtra("music_class_enter_method", "click_more");
                    intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", musicBoardWidget.f85204m);
                    intent.putExtra("music_class_level", musicCollectionItem.level);
                    intent.putExtra("sound_page_scene", musicBoardWidget.f85210s);
                }
                musicBoardWidget.mo60205a(intent, musicBoardWidget.f85203l);
                C35936b.m73319a(musicCollectionItem.mcName, "click_more", str, "change_music_page", musicCollectionItem.mcId);
            } else if (id == R.id.cds) {
                if (sVar != null && musicModel != null) {
                    if (musicBoardWidget.f85201j == sVar.f85028x && ((Integer) musicBoardWidget.f80273e.mo60195b("music_position", (Object) -1)).intValue() == musicBoardWidget.f85202k) {
                        musicBoardWidget.f80273e.mo60191a("music_position", (Object) -1);
                        musicBoardWidget.f80273e.mo60191a("music_index", (Object) -1);
                        sVar.mo63155a(false, false);
                        musicBoardWidget.mo63221g();
                        return;
                    }
                    if (musicBoardWidget.f85199h != null) {
                        musicBoardWidget.mo63221g();
                        musicBoardWidget.f85199h.mo62874a(new C36073e(musicBoardWidget));
                        musicBoardWidget.f85199h.mo62877a(musicModel, musicBoardWidget.f85205n);
                        C35936b.f84814c = sVar.f85028x;
                    }
                    musicBoardWidget.f80273e.mo60191a("music_position", Integer.valueOf(musicBoardWidget.f85202k));
                    musicBoardWidget.f80273e.mo60191a("music_index", Integer.valueOf(sVar.f85028x));
                    musicBoardWidget.f80273e.mo60191a("music_loading", (Object) true);
                }
            } else if (id == R.id.cey && musicBoardWidget.f85199h != null && musicModel != null) {
                String str2 = musicBoardWidget.f85205n.f84351e;
                if (!C13627m.m24498a(str2)) {
                    str = str2;
                }
                musicModel.setCategoryID(str);
                musicBoardWidget.f85199h.mo62881b(musicModel);
                C35936b.m73313a(musicBoardWidget.f85205n, musicModel.getMusicId(), sVar.f85028x, musicModel.getLogPb());
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
                C36125t.m73598a(C36125t.m73591a(), C36131u.m73602a("aweme://music/detail/" + musicModel.getMusicId()).mo63248a("process_id", uuid).mo63249a());
                C35936b.m73315a(musicBoardWidget.f85205n, musicModel.getMusicId(), false, uuid);
            }
        }
    }
}
