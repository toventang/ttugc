package com.p2082ss.android.ugc.aweme.mvtemplate.view;

import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.challenge.AbstractC35500d;
import com.p2082ss.android.ugc.aweme.challenge.p2445a.C35487c;
import com.p2082ss.android.ugc.aweme.challenge.p2454ui.C35658s;
import com.p2082ss.android.ugc.aweme.common.AbstractC39085b;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.common.p2633e.C39101b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.mvtemplate.p3486a.C61245b;
import java.lang.ref.WeakReference;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.mvtemplate.view.d */
public final class C61265d implements C35658s.AbstractC35663b {

    /* renamed from: a */
    private WeakReference<ActivityC0945e> f139137a;

    static {
        Covode.recordClassIndex(71882);
    }

    @Override // com.p2082ss.android.ugc.aweme.challenge.p2454ui.C35658s.AbstractC35663b
    public final void onJumpToDetail(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.challenge.p2454ui.C35658s.AbstractC35663b
    public final boolean sendCustomRequest(C39101b<? extends AbstractC39100a<?, ?>> bVar, int i) {
        return false;
    }

    public final WeakReference<ActivityC0945e> getActivity() {
        return this.f139137a;
    }

    public final void setActivity(WeakReference<ActivityC0945e> weakReference) {
        this.f139137a = weakReference;
    }

    @Override // com.p2082ss.android.ugc.aweme.challenge.p2454ui.C35658s.AbstractC35663b
    public final C39101b<? extends AbstractC39100a<?, ?>> getPresenter(int i, ActivityC0945e eVar) {
        C39101b<? extends AbstractC39100a<?, ?>> bVar = new C39101b<>();
        bVar.mo67838a((AbstractC39085b) new C61245b());
        return bVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.challenge.p2454ui.C35658s.AbstractC35663b
    public final C35658s.C35664c getJumpToVideoParam(C35658s.C35664c cVar, Aweme aweme) {
        String str;
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(aweme, "");
        cVar.f84147a = "from_detail_activity";
        cVar.f84148b = "movie_id";
        if (aweme.getUploadMiscInfoStruct().mvType == 1) {
            str = "jianying_mv_page";
        } else {
            str = "mv_page";
        }
        cVar.f84149c = str;
        return cVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.challenge.p2454ui.C35658s.AbstractC35663b
    public final C35487c onCreateDetailAwemeViewHolder(View view, String str, AbstractC35500d dVar) {
        return new C61266e(view, str, dVar);
    }
}
