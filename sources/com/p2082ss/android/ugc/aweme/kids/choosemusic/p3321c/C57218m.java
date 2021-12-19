package com.p2082ss.android.ugc.aweme.kids.choosemusic.p3321c;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.arch.AbstractC33936c;
import com.p2082ss.android.ugc.aweme.arch.C33935b;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.C57171a;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3322d.AbstractC57233a;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3323e.C57238a;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3323e.C57242d;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3325g.C57268c;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3326h.C57289m;
import com.p2082ss.android.ugc.trill.R;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.kids.choosemusic.c.m */
public final class C57218m extends AbstractC57199d implements AbstractC39063h.AbstractC39067a, AbstractC57233a {
    static {
        Covode.recordClassIndex(67123);
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.C33933a.AbstractC33934a
    /* renamed from: b */
    public final String mo60169b() {
        return "hot_music_list_data";
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.choosemusic.p3322d.AbstractC57233a
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo94441b(Object obj) {
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.C33933a.AbstractC33934a
    /* renamed from: c */
    public final String mo60170c() {
        return "refresh_status_hot_music_list";
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.C33933a.AbstractC33934a
    /* renamed from: d */
    public final String mo60171d() {
        return "loadmore_status_hot_music_list";
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.kids.choosemusic.p3321c.AbstractC57199d
    /* renamed from: n */
    public final int mo94422n() {
        return 0;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.kids.choosemusic.p3321c.AbstractC57199d
    /* renamed from: o */
    public final String mo94423o() {
        return "";
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.choosemusic.p3321c.AbstractC57199d, com.p2082ss.android.ugc.aweme.arch.C33933a.AbstractC33934a
    /* renamed from: a */
    public final void mo60168a() {
        super.mo60168a();
        this.f130277d.mo94461c();
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.choosemusic.p3322d.AbstractC57233a
    /* renamed from: q */
    public final void mo94445q() {
        if (this.f130277d != null) {
            this.f130277d.mo94461c();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.choosemusic.p3322d.AbstractC57233a
    /* renamed from: r */
    public final void mo94446r() {
        if (getActivity() != null) {
            getActivity().onBackPressed();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h.AbstractC39067a
    /* renamed from: l */
    public final void mo94448m() {
        if (this.f130279j != null) {
            this.f130279j.mo60175a();
        }
        if (this.f130277d != null && this.f130278e != null) {
            C57238a aVar = this.f130277d;
            int intValue = ((Integer) ((C33935b) this.f130278e.mo60192a("hot_music_list_data")).mo60174a("list_cursor")).intValue();
            if (!aVar.f130385g) {
                aVar.f130385g = true;
                aVar.f130379a.getHotMusicList(intValue, 20, false).mo5534a(new C57242d(aVar), C1731i.f5564c, null);
            }
        }
    }

    /* renamed from: a */
    public static Fragment m103740a(int i) {
        C57218m mVar = new C57218m();
        Bundle bundle = new Bundle();
        bundle.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i);
        mVar.setArguments(bundle);
        return mVar;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.kids.choosemusic.p3321c.AbstractC57199d
    /* renamed from: b */
    public final AbstractC33936c mo94418b(View view) {
        C57289m mVar = new C57289m(getContext(), view, this, R.string.dg5, this, this, this.f130280k);
        mVar.f130484a.setTitle(R.string.f70);
        mVar.mo94490a(this);
        if (getContext() != null) {
            C57171a aVar = new C57171a("change_music_page_detail", getContext().getString(R.string.f70), "click_more", C57268c.f130442a);
            aVar.mo94370a("recommend_mc_id");
            mVar.mo94489a(aVar);
        }
        mVar.mo94483a(new C57219n(this));
        return mVar;
    }
}
