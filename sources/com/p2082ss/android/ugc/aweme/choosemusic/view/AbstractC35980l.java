package com.p2082ss.android.ugc.aweme.choosemusic.view;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.choosemusic.C35754b;
import com.p2082ss.android.ugc.aweme.choosemusic.p2461a.C35703b;
import com.p2082ss.android.ugc.aweme.choosemusic.p2462b.C35757c;
import com.p2082ss.android.ugc.aweme.choosemusic.p2464d.AbstractC35826a;
import com.p2082ss.android.ugc.aweme.choosemusic.p2464d.AbstractC35827b;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h;
import com.p2082ss.android.ugc.aweme.music.p3465b.AbstractC60731k;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.view.l */
public abstract class AbstractC35980l extends AbstractC35981m<MusicModel> {
    static {
        Covode.recordClassIndex(43226);
    }

    @Override // com.p2082ss.android.ugc.aweme.choosemusic.view.AbstractC35981m
    /* renamed from: e */
    public void mo63134e() {
        super.mo63134e();
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.choosemusic.view.AbstractC35981m
    /* renamed from: d */
    public final AbstractC39060f mo63133d() {
        C35703b bVar = new C35703b(this.f84957h);
        bVar.f84226i = this.f84958i;
        return bVar;
    }

    /* renamed from: a */
    public final void mo63130a(C35754b bVar) {
        if (this.f84955f instanceof C35703b) {
            ((C35703b) this.f84955f).f84222e = bVar;
        }
    }

    /* renamed from: a */
    public final void mo63131a(AbstractC35827b bVar) {
        if (this.f84955f instanceof C35703b) {
            ((C35703b) this.f84955f).f84218a = bVar;
        }
    }

    /* renamed from: a */
    public final void mo63132a(boolean z) {
        if (this.f84955f instanceof C35703b) {
            ((C35703b) this.f84955f).f84225h = z;
        }
    }

    public AbstractC35980l(Context context, View view, AbstractC35826a aVar, AbstractC39063h.AbstractC39067a aVar2, AbstractC60731k<C35757c> kVar, int i) {
        super(context, view, aVar, R.string.dfs, aVar2, kVar, i);
        this.f84950a.setVisibility(8);
        ((ViewGroup.MarginLayoutParams) this.f84951b.getLayoutParams()).topMargin = (int) C13628n.m24520b(this.f84951b.getContext(), 10.0f);
        this.f84951b.setOverScrollMode(2);
    }
}
