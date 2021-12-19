package com.p2082ss.android.ugc.aweme.music.p3481ui;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1121b.p1122a.C16105a;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.p122a.C2541b;
import com.bytedance.router.SmartRoute;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.challenge.p2454ui.C35658s;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39054a;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39059e;
import com.p2082ss.android.ugc.aweme.detail.AbstractC41246l;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.music.p3472g.AbstractC60800a;
import com.p2082ss.android.ugc.aweme.p2436cc.C35434c;
import com.p2082ss.android.ugc.aweme.p2436cc.EnumC35431b;

/* renamed from: com.ss.android.ugc.aweme.music.ui.u */
public final class C61202u extends C35658s {

    /* renamed from: I */
    public Music f138954I;

    /* renamed from: J */
    private AbstractC60800a f138955J;

    static {
        Covode.recordClassIndex(71807);
    }

    @Override // com.p2082ss.android.ugc.aweme.challenge.p2454ui.AbstractC35557a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.challenge.p2454ui.C35658s
    public final void onDestroyView() {
        super.onDestroyView();
        this.f138955J.mo98209a(false);
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.challenge.p2454ui.C35658s
    public final void onStop() {
        super.onStop();
        if (C17873f.m33102j() == null) {
            C2541b.m7432a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.challenge.p2454ui.C35658s
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo62665a(RecyclerView.ViewHolder viewHolder) {
        mo62665a((AbstractC39059e) viewHolder);
    }

    @Override // com.p2082ss.android.ugc.aweme.challenge.p2454ui.C35658s
    /* renamed from: a */
    public final void mo62663a(Bundle bundle) {
        super.mo62663a(bundle);
        if (bundle != null) {
            this.f138954I = (Music) bundle.getSerializable("detail_music_data");
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f84138v = new AbstractC41246l() {
            /* class com.p2082ss.android.ugc.aweme.music.p3481ui.C61202u.C612042 */

            static {
                Covode.recordClassIndex(71809);
            }

            @Override // com.p2082ss.android.ugc.aweme.detail.AbstractC41246l
            /* renamed from: b */
            public final void mo70563b() {
                C2541b.m7437b("music", "list");
            }

            @Override // com.p2082ss.android.ugc.aweme.detail.AbstractC41246l
            /* renamed from: a */
            public final void mo70560a() {
                C2541b.m7437b("music", "list");
                C35434c.m72464b("single_song");
            }

            @Override // com.p2082ss.android.ugc.aweme.detail.AbstractC41246l
            /* renamed from: a */
            public final void mo70562a(boolean z) {
                C2541b.m7438b("music", "list", z ? 1 : 0);
            }

            @Override // com.p2082ss.android.ugc.aweme.detail.AbstractC41246l
            /* renamed from: a */
            public final void mo70561a(Exception exc) {
                C2541b.m7435a("music", "list", C16105a.m29902a(C17867d.m33078a(), exc));
                C35434c.m72462a("single_song", EnumC35431b.FAIL);
            }
        };
    }

    @Override // com.p2082ss.android.ugc.aweme.challenge.p2454ui.C35658s
    /* renamed from: a */
    public final void mo62666a(AbstractC39059e eVar) {
        super.mo62665a(eVar);
        AbstractC39054a aVar = (AbstractC39054a) eVar;
        if (aVar != null && aVar.f92231m != null) {
            Aweme aweme = (Aweme) aVar.f92231m;
            String str = this.f84123c;
            String str2 = this.f84125e;
            String aid = aweme.getAid();
            String authorUid = aweme.getAuthorUid();
            int adapterPosition = aVar.getAdapterPosition();
            if (adapterPosition >= 0) {
                adapterPosition++;
            }
            C39162r.m79460a("show_video", new C33744d().mo59983a("enter_from", "single_song").mo59983a("music_id", str).mo59983a("process_id", str2).mo59983a("group_id", aid).mo59983a("author_id", authorUid).mo59980a("order", adapterPosition).f79943a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.challenge.p2454ui.C35658s
    /* renamed from: a */
    public final SmartRoute mo62661a(Aweme aweme, C35658s.C35664c cVar) {
        SmartRoute a = super.mo62661a(aweme, cVar);
        Music music = this.f138954I;
        if (music != null) {
            a.withParam("feed_data_music", music);
        }
        a.withParam("feed_data_author_id", aweme.getAuthorUid());
        a.withParam("feed_data_is_ad", aweme.isAd());
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.challenge.p2454ui.C35658s
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C612031 r1 = new AbstractC60800a(requireActivity()) {
            /* class com.p2082ss.android.ugc.aweme.music.p3481ui.C61202u.C612031 */

            static {
                Covode.recordClassIndex(71808);
            }

            @Override // com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34466a
            public final boolean onKeyDown(int i, KeyEvent keyEvent) {
                if (i == 4) {
                    C2541b.m7439c("music", "list");
                }
                return false;
            }
        };
        this.f138955J = r1;
        r1.mo98209a(true);
    }
}
