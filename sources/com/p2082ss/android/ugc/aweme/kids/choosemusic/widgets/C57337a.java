package com.p2082ss.android.ugc.aweme.kids.choosemusic.widgets;

import android.app.Activity;
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
/* renamed from: com.ss.android.ugc.aweme.kids.choosemusic.widgets.a */
public final /* synthetic */ class C57337a implements AbstractC57287k {

    /* renamed from: a */
    private final ChallengeMusicWidget f130708a;

    static {
        Covode.recordClassIndex(67248);
    }

    C57337a(ChallengeMusicWidget challengeMusicWidget) {
        this.f130708a = challengeMusicWidget;
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.choosemusic.p3326h.AbstractC57287k
    /* renamed from: a */
    public final void mo94379a(C57320o oVar, View view, MusicModel musicModel) {
        ChallengeMusicWidget challengeMusicWidget = this.f130708a;
        int id = view.getId();
        if (id == R.id.bxo) {
            Activity j = C17873f.m33102j();
            if (j != null) {
                j.getString(R.string.bs5);
            }
            oVar.mo94506d();
            boolean z = oVar.f130553s;
            String musicId = musicModel.getMusicId();
            C57171a aVar = challengeMusicWidget.f130664m;
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
                new C57171a("change_music_page", "attached_song", "click_button", C57268c.f130442a).f130165g = (String) challengeMusicWidget.f80273e.mo60195b("challenge_id", (Object) null);
            }
        } else if (id == R.id.cds) {
            if (challengeMusicWidget.f130661j == oVar.f130556v && ((Integer) challengeMusicWidget.f80273e.mo60195b("music_position", (Object) -1)).intValue() == -2) {
                challengeMusicWidget.f80273e.mo60191a("music_position", (Object) -1);
                challengeMusicWidget.f80273e.mo60191a("music_index", (Object) -1);
                oVar.mo94503a(false, false);
                challengeMusicWidget.mo94548e();
                return;
            }
            if (challengeMusicWidget.f130660i != null) {
                challengeMusicWidget.mo94548e();
                C57268c.f130443b = oVar.f130556v;
                C57171a aVar2 = new C57171a("change_music_page", "attached_song", "", C57268c.f130442a);
                aVar2.f130165g = (String) challengeMusicWidget.f80273e.mo60195b("challenge_id", (Object) null);
                challengeMusicWidget.f130660i.mo94417a(musicModel, aVar2);
                challengeMusicWidget.f130660i.mo94415a(new C57338b(challengeMusicWidget));
            }
            challengeMusicWidget.f80273e.mo60191a("music_position", (Object) -2);
            challengeMusicWidget.f80273e.mo60191a("music_index", Integer.valueOf(oVar.f130556v));
            challengeMusicWidget.f80273e.mo60191a("music_loading", (Object) true);
        } else if (id == R.id.cey) {
            if (challengeMusicWidget.f130666o != null) {
                challengeMusicWidget.f130666o.mo94433b(10);
            }
            if (challengeMusicWidget.f130660i != null) {
                challengeMusicWidget.f130660i.mo94419b(musicModel);
                C57171a aVar3 = challengeMusicWidget.f130664m;
                String musicId2 = musicModel.getMusicId();
                int i = oVar.f130556v;
                musicModel.getLogPb();
                C57268c.m103826a(aVar3, musicId2, i);
            }
        }
    }
}
