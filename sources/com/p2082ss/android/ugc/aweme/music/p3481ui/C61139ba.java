package com.p2082ss.android.ugc.aweme.music.p3481ui;

import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.challenge.AbstractC35500d;
import com.p2082ss.android.ugc.aweme.challenge.p2445a.C35487c;
import com.p2082ss.android.ugc.aweme.challenge.p2454ui.C35658s;
import com.p2082ss.android.ugc.aweme.common.AbstractC39085b;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.p2633e.C39101b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.music.presenter.C60849g;

/* renamed from: com.ss.android.ugc.aweme.music.ui.ba */
public final class C61139ba implements C35658s.AbstractC35663b {
    static {
        Covode.recordClassIndex(71744);
    }

    @Override // com.p2082ss.android.ugc.aweme.challenge.p2454ui.C35658s.AbstractC35663b
    public final void onJumpToDetail(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.challenge.p2454ui.C35658s.AbstractC35663b
    public final boolean sendCustomRequest(C39101b bVar, int i) {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.challenge.p2454ui.C35658s.AbstractC35663b
    public final C39101b getPresenter(int i, ActivityC0945e eVar) {
        C39101b bVar = new C39101b();
        C60849g gVar = new C60849g();
        gVar.f138267a = true;
        bVar.mo67838a((AbstractC39085b) gVar);
        return bVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.challenge.p2454ui.C35658s.AbstractC35663b
    public final C35658s.C35664c getJumpToVideoParam(C35658s.C35664c cVar, Aweme aweme) {
        C39162r.m79460a("feed_enter", new C33744d().mo59983a("enter_from", "single_song").mo59983a("group_id", aweme.getAid()).mo59983a("tag_id", cVar.f84150d).mo59980a("rank_index", cVar.f84152f).mo59980a("order", cVar.f84152f).mo59983a("process_id", cVar.f84151e).f79943a);
        cVar.f84147a = "from_music";
        cVar.f84148b = "music_id";
        return cVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.challenge.p2454ui.C35658s.AbstractC35663b
    public final C35487c onCreateDetailAwemeViewHolder(View view, String str, AbstractC35500d dVar) {
        return new C61205v(view, str, dVar);
    }
}
