package com.p2082ss.android.ugc.aweme.prop.p3606b;

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
import com.p2082ss.android.ugc.aweme.prop.p3607c.C65311c;
import com.p2082ss.android.ugc.aweme.sticker.model.C75445g;

/* renamed from: com.ss.android.ugc.aweme.prop.b.f */
public final class C65277f implements C35658s.AbstractC35663b {

    /* renamed from: a */
    String f147286a;

    /* renamed from: b */
    C75445g f147287b;

    static {
        Covode.recordClassIndex(76756);
    }

    @Override // com.p2082ss.android.ugc.aweme.challenge.p2454ui.C35658s.AbstractC35663b
    public final void onJumpToDetail(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.challenge.p2454ui.C35658s.AbstractC35663b
    public final boolean sendCustomRequest(C39101b bVar, int i) {
        return false;
    }

    public C65277f() {
    }

    public final void setFaceStickerBean(C75445g gVar) {
        this.f147287b = gVar;
    }

    public C65277f(String str) {
        this.f147286a = str;
    }

    @Override // com.p2082ss.android.ugc.aweme.challenge.p2454ui.C35658s.AbstractC35663b
    public final C39101b getPresenter(int i, ActivityC0945e eVar) {
        C39101b bVar = new C39101b();
        bVar.mo67838a((AbstractC39085b) new C65311c(this.f147286a));
        return bVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.challenge.p2454ui.C35658s.AbstractC35663b
    public final C35658s.C35664c getJumpToVideoParam(C35658s.C35664c cVar, Aweme aweme) {
        C39162r.m79460a("feed_enter", new C33744d().mo59983a("enter_from", "prop_page").mo59983a("group_id", aweme.getAid()).mo59983a("tag_id", cVar.f84150d).mo59980a("rank_index", cVar.f84152f).mo59983a("process_id", cVar.f84151e).f79943a);
        cVar.f84147a = "from_sticker";
        cVar.f84148b = "sticker_id";
        cVar.f84149c = "prop_page";
        return cVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.challenge.p2454ui.C35658s.AbstractC35663b
    public final C35487c onCreateDetailAwemeViewHolder(View view, String str, AbstractC35500d dVar) {
        return new C65281i(view, str, dVar, new C65278g(this));
    }
}
