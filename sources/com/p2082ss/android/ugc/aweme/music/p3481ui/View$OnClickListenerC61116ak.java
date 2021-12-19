package com.p2082ss.android.ugc.aweme.music.p3481ui;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.discover.mob.C42464l;
import com.p2082ss.android.ugc.aweme.discover.mob.ISearchResultStatistics;
import com.p2082ss.android.ugc.aweme.legacy.SearchResultStatisticsImpl;
import com.p2082ss.android.ugc.aweme.login.C58957c;
import com.p2082ss.android.ugc.aweme.music.presenter.C60860n;
import com.p2082ss.android.ugc.aweme.music.presenter.C60863o;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.music.ui.ak */
public final /* synthetic */ class View$OnClickListenerC61116ak implements View.OnClickListener {

    /* renamed from: a */
    private final C61100ah f138788a;

    static {
        Covode.recordClassIndex(71719);
    }

    View$OnClickListenerC61116ak(C61100ah ahVar) {
        this.f138788a = ahVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C61100ah ahVar = this.f138788a;
        if (ahVar.f138754q != null) {
            ahVar.f138754q.mo98607b();
        }
        C60860n nVar = ahVar.f138716ag;
        ActivityC0945e activity = ahVar.getActivity();
        nVar.f138314v = true;
        String str = "";
        if (!nVar.f138311s) {
            C39162r.m79460a("favourite_song", new C33744d().mo59983a("enter_from", nVar.f138306n).mo59983a("process_id", nVar.f138315w).mo59983a("music_id", nVar.f138301f != null ? nVar.f138301f.getMusicId() : str).mo59983a("group_id", nVar.f138307o).f79943a);
        } else {
            C39162r.m79460a("cancel_favourite_song", new C33744d().mo59983a("enter_from", nVar.f138306n).mo59983a("process_id", nVar.f138315w).mo59983a("music_id", nVar.f138301f != null ? nVar.f138301f.getMusicId() : str).mo59983a("group_id", nVar.f138307o).f79943a);
        }
        if ((TextUtils.equals(nVar.f138304l, "search_result") || TextUtils.equals(nVar.f138304l, "general_search")) && !nVar.f138311s) {
            ISearchResultStatistics a = SearchResultStatisticsImpl.m104992a();
            if (nVar.f138301f != null && !TextUtils.isEmpty(nVar.f138301f.getMusicId())) {
                str = nVar.f138301f.getMusicId();
            }
            a.mo71656a(new C42464l("search_favourite", "single_song", str, TextUtils.equals(nVar.f138304l, "search_result")));
        }
        if (!C31575b.m65865g().isLogin()) {
            C58957c.m108320a(activity, "single_song", "click_favorite_music", (Bundle) null, new C60863o(nVar, activity));
        } else {
            nVar.mo98500a(activity);
        }
    }
}
