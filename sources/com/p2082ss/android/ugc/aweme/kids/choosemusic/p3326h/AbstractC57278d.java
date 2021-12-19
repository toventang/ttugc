package com.p2082ss.android.ugc.aweme.kids.choosemusic.p3326h;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.C57171a;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3319a.C57174b;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3320b.C57192b;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3322d.AbstractC57233a;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3322d.AbstractC57234b;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3303a.AbstractC57080c;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.kids.choosemusic.h.d */
public abstract class AbstractC57278d extends AbstractC57279e<MusicModel> {
    static {
        Covode.recordClassIndex(67183);
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.choosemusic.p3326h.AbstractC57279e
    /* renamed from: e */
    public void mo94482e() {
        super.mo94482e();
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.kids.choosemusic.p3326h.AbstractC57279e
    /* renamed from: d */
    public final AbstractC39060f mo94481d() {
        C57174b bVar = new C57174b(this.f130490g);
        bVar.f130188h = this.f130491h;
        return bVar;
    }

    /* renamed from: a */
    public final void mo94478a(C57171a aVar) {
        if (this.f130488e instanceof C57174b) {
            ((C57174b) this.f130488e).f130185e = aVar;
        }
    }

    /* renamed from: a */
    public final void mo94479a(AbstractC57234b bVar) {
        if (this.f130488e instanceof C57174b) {
            ((C57174b) this.f130488e).f130181a = bVar;
        }
    }

    /* renamed from: a */
    public final void mo94480a(boolean z) {
        if (this.f130488e instanceof C57174b) {
            ((C57174b) this.f130488e).f130187g = z;
        }
    }

    public AbstractC57278d(Context context, View view, AbstractC57233a aVar, AbstractC39063h.AbstractC39067a aVar2, AbstractC57080c<C57192b> cVar, int i) {
        super(context, view, aVar, R.string.dfs, aVar2, cVar, i);
        this.f130484a.setVisibility(8);
        ((ViewGroup.MarginLayoutParams) this.f130485b.getLayoutParams()).topMargin = (int) C13628n.m24520b(this.f130485b.getContext(), 10.0f);
        this.f130485b.setOverScrollMode(2);
    }
}
