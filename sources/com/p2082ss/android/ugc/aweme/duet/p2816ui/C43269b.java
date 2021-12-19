package com.p2082ss.android.ugc.aweme.duet.p2816ui;

import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.challenge.AbstractC35500d;
import com.p2082ss.android.ugc.aweme.challenge.p2445a.C35487c;
import com.p2082ss.android.ugc.aweme.challenge.p2454ui.C35658s;
import com.p2082ss.android.ugc.aweme.common.AbstractC39085b;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.common.p2633e.C39101b;
import com.p2082ss.android.ugc.aweme.duet.p2814a.C43254b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import java.lang.ref.WeakReference;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.duet.ui.b */
public final class C43269b implements C35658s.AbstractC35663b {

    /* renamed from: a */
    private WeakReference<ActivityC0945e> f101014a;

    /* renamed from: b */
    private final String f101015b;

    static {
        Covode.recordClassIndex(51474);
    }

    @Override // com.p2082ss.android.ugc.aweme.challenge.p2454ui.C35658s.AbstractC35663b
    public final void onJumpToDetail(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.challenge.p2454ui.C35658s.AbstractC35663b
    public final boolean sendCustomRequest(C39101b<? extends AbstractC39100a<?, ?>> bVar, int i) {
        return false;
    }

    public final WeakReference<ActivityC0945e> getActivity() {
        return this.f101014a;
    }

    public final void setActivity(WeakReference<ActivityC0945e> weakReference) {
        this.f101014a = weakReference;
    }

    public C43269b(String str) {
        C89219l.m154721d(str, "");
        this.f101015b = str;
    }

    @Override // com.p2082ss.android.ugc.aweme.challenge.p2454ui.C35658s.AbstractC35663b
    public final C39101b<? extends AbstractC39100a<?, ?>> getPresenter(int i, ActivityC0945e eVar) {
        C39101b<? extends AbstractC39100a<?, ?>> bVar = new C39101b<>();
        bVar.mo67838a((AbstractC39085b) new C43254b());
        return bVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.challenge.p2454ui.C35658s.AbstractC35663b
    public final C35658s.C35664c getJumpToVideoParam(C35658s.C35664c cVar, Aweme aweme) {
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(aweme, "");
        cVar.f84147a = "from_duet_detail";
        cVar.f84148b = "duet_id";
        cVar.f84149c = "duet_page";
        return cVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.challenge.p2454ui.C35658s.AbstractC35663b
    public final C35487c onCreateDetailAwemeViewHolder(View view, String str, AbstractC35500d dVar) {
        C89219l.m154721d(view, "");
        return new C43270c(this.f101015b, view, str, dVar);
    }
}
