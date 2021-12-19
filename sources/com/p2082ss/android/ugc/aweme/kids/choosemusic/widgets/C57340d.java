package com.p2082ss.android.ugc.aweme.kids.choosemusic.widgets;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.C57171a;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.activity.MusicDetailListActivity;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3325g.C57268c;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3326h.AbstractC57287k;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3327i.C57320o;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3307e.C57110d;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3312i.C57147c;
import com.p2082ss.android.ugc.aweme.p2479ck.C36125t;
import com.p2082ss.android.ugc.aweme.p2479ck.C36131u;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;
import java.util.UUID;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.kids.choosemusic.widgets.d */
public final /* synthetic */ class C57340d implements AbstractC57287k {

    /* renamed from: a */
    private final MusicBoardWidget f130711a;

    /* renamed from: b */
    private final C57110d f130712b;

    static {
        Covode.recordClassIndex(67251);
    }

    C57340d(MusicBoardWidget musicBoardWidget, C57110d dVar) {
        this.f130711a = musicBoardWidget;
        this.f130712b = dVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.choosemusic.p3326h.AbstractC57287k
    /* renamed from: a */
    public final void mo94379a(C57320o oVar, View view, MusicModel musicModel) {
        MusicBoardWidget musicBoardWidget = this.f130711a;
        C57110d dVar = this.f130712b;
        int id = view.getId();
        if (id == R.id.bxo) {
            Activity j = C17873f.m33102j();
            if (j != null) {
                j.getString(R.string.bs5);
            }
            oVar.mo94506d();
            boolean z = oVar.f130553s;
            String musicId = musicModel.getMusicId();
            C57171a aVar = musicBoardWidget.f130676n;
            musicModel.getLogPb();
            C57268c.m103830a(z, musicId, aVar);
        } else if (id != R.id.bxq) {
            String str = "";
            if (id == R.id.f67) {
                Intent intent = new Intent(musicBoardWidget.f80270b, MusicDetailListActivity.class);
                if (musicBoardWidget.f130673k == 0) {
                    intent.putExtra("music_type", 1);
                    intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", musicBoardWidget.f130675m);
                } else {
                    intent.putExtra("music_class_id", dVar.f130024a);
                    intent.putExtra("music_class_name", dVar.f130025b);
                    intent.putExtra("music_type", 2);
                    intent.putExtra("music_category_is_hot", dVar.f130028e);
                    intent.putExtra("music_class_enter_method", "click_more");
                    intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", musicBoardWidget.f130675m);
                    intent.putExtra("music_class_level", dVar.f130029f);
                }
                musicBoardWidget.mo60205a(intent, musicBoardWidget.f130674l);
                C57268c.m103829a(dVar.f130025b, "click_more", str, "change_music_page", dVar.f130024a);
            } else if (id == R.id.cds) {
                if (oVar != null && musicModel != null) {
                    if (musicBoardWidget.f130672j == oVar.f130556v && ((Integer) musicBoardWidget.f80273e.mo60195b("music_position", (Object) -1)).intValue() == musicBoardWidget.f130673k) {
                        musicBoardWidget.f80273e.mo60191a("music_position", (Object) -1);
                        musicBoardWidget.f80273e.mo60191a("music_index", (Object) -1);
                        oVar.mo94503a(false, false);
                        musicBoardWidget.mo94552g();
                        return;
                    }
                    if (musicBoardWidget.f130670h != null) {
                        musicBoardWidget.mo94552g();
                        musicBoardWidget.f130670h.mo94415a(new C57341e(musicBoardWidget));
                        musicBoardWidget.f130670h.mo94417a(musicModel, musicBoardWidget.f130676n);
                        C57268c.f130443b = oVar.f130556v;
                    }
                    musicBoardWidget.f80273e.mo60191a("music_position", Integer.valueOf(musicBoardWidget.f130673k));
                    musicBoardWidget.f80273e.mo60191a("music_index", Integer.valueOf(oVar.f130556v));
                    musicBoardWidget.f80273e.mo60191a("music_loading", (Object) true);
                }
            } else if (id == R.id.cey && musicBoardWidget.f130670h != null && musicModel != null) {
                String str2 = musicBoardWidget.f130676n.f130163e;
                if (!C13627m.m24498a(str2)) {
                    str = str2;
                }
                musicModel.setCategoryID(str);
                musicBoardWidget.f130670h.mo94419b(musicModel);
                C57171a aVar2 = musicBoardWidget.f130676n;
                String musicId2 = musicModel.getMusicId();
                int i = oVar.f130556v;
                musicModel.getLogPb();
                C57268c.m103826a(aVar2, musicId2, i);
            }
        } else if (musicModel == null) {
        } else {
            if (musicModel.getMusicStatus() == 0 && musicModel.getMusic() != null) {
                String offlineDesc = musicModel.getMusic().getOfflineDesc();
                if (TextUtils.isEmpty(offlineDesc)) {
                    offlineDesc = view.getContext().getString(R.string.dau);
                }
                new C79459a(view.getContext()).mo123052a(offlineDesc).mo123053a();
            } else if (C57147c.m103544a(musicModel, view.getContext(), true)) {
                C36125t.m73598a(C36125t.m73591a(), C36131u.m73602a("aweme://music/detail/" + musicModel.getMusicId()).mo63248a("process_id", UUID.randomUUID().toString()).mo63249a());
            }
        }
    }
}
