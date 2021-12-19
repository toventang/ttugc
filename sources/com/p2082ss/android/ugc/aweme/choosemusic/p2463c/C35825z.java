package com.p2082ss.android.ugc.aweme.choosemusic.p2463c;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.arch.AbstractC33936c;
import com.p2082ss.android.ugc.aweme.arch.C33935b;
import com.p2082ss.android.ugc.aweme.choosemusic.C35754b;
import com.p2082ss.android.ugc.aweme.choosemusic.model.C35899b;
import com.p2082ss.android.ugc.aweme.choosemusic.model.C35906h;
import com.p2082ss.android.ugc.aweme.choosemusic.utils.C35936b;
import com.p2082ss.android.ugc.aweme.choosemusic.view.C35991u;
import com.p2082ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h;
import com.p2082ss.android.ugc.trill.R;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.c.z */
public final class C35825z extends AbstractC35794i implements AbstractC39063h.AbstractC39067a, AbstractC39063h.AbstractC39067a {
    static {
        Covode.recordClassIndex(43064);
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.C33933a.AbstractC33934a
    /* renamed from: b */
    public final String mo60169b() {
        return "hot_music_list_data";
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo62930b(Object obj) {
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
    @Override // com.p2082ss.android.ugc.aweme.choosemusic.p2463c.AbstractC35794i
    /* renamed from: o */
    public final int mo62834o() {
        return 0;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.choosemusic.p2463c.AbstractC35794i
    /* renamed from: p */
    public final String mo62835p() {
        return "";
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.choosemusic.p2463c.AbstractC35794i
    /* renamed from: q */
    public final int mo62836q() {
        return R.layout.a19;
    }

    /* renamed from: t */
    public final void mo62932t() {
    }

    @Override // com.p2082ss.android.ugc.aweme.choosemusic.p2463c.AbstractC35794i, com.p2082ss.android.ugc.aweme.arch.C33933a.AbstractC33934a
    /* renamed from: a */
    public final void mo60168a() {
        super.mo60168a();
        this.f84492d.mo63028c(this.f84495k);
    }

    /* renamed from: u */
    public final void mo62933u() {
        if (this.f84492d != null) {
            this.f84492d.mo63028c(this.f84495k);
        }
    }

    /* renamed from: v */
    public final void mo62934v() {
        if (getActivity() != null) {
            getActivity().onBackPressed();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h.AbstractC39067a
    /* renamed from: l */
    public final void mo62931m() {
        if (this.f84494j != null) {
            this.f84494j.mo60175a();
        }
        if (this.f84492d != null && this.f84493e != null) {
            C35899b bVar = this.f84492d;
            int intValue = ((Integer) ((C33935b) this.f84493e.mo60192a("hot_music_list_data")).mo60174a("list_cursor")).intValue();
            int i = this.f84495k;
            if (!bVar.f84735h) {
                bVar.f84735h = true;
                bVar.f84728a.getHotMusicList(intValue, 20, false, i).mo5534a(new C35906h(bVar), C1731i.f5564c, null);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.choosemusic.p2463c.AbstractC35794i
    /* renamed from: b */
    public final AbstractC33936c mo62831b(View view) {
        C35991u uVar;
        if (CommerceMediaServiceImpl.m77578f().mo66513b() || CommerceMediaServiceImpl.m77578f().mo66517e()) {
            uVar = new C35991u(getContext(), view, this, R.string.anc, this, this, this.f84496l);
        } else {
            uVar = new C35991u(getContext(), view, this, R.string.dg5, this, this, this.f84496l);
        }
        uVar.mo63140a(R.string.f70);
        uVar.mo63143a(this);
        if (getContext() != null) {
            C35754b bVar = new C35754b("change_music_page_detail", getContext().getString(R.string.f70), "click_more", C35936b.f84812a);
            bVar.mo62804a("recommend_mc_id");
            uVar.mo63142a(bVar);
        }
        uVar.mo63135a(new C35766aa(this));
        return uVar;
    }

    /* renamed from: a */
    public static Fragment m73190a(int i, int i2) {
        C35825z zVar = new C35825z();
        Bundle bundle = new Bundle();
        bundle.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i);
        bundle.putInt("sound_page_scene", i2);
        zVar.setArguments(bundle);
        return zVar;
    }
}
