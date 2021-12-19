package com.p2082ss.android.ugc.aweme.setting.page.backgroundaudio;

import android.app.Activity;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.ies.powerpage.p1235a.AbstractC17735a;
import com.p2082ss.android.ugc.aweme.C43047dm;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.experiment.C49510c;
import com.p2082ss.android.ugc.aweme.p2386be.C34797e;
import com.p2082ss.android.ugc.aweme.p2727db.C40937d;
import com.p2082ss.android.ugc.aweme.setting.page.AbstractC68195a;
import com.p2082ss.android.ugc.aweme.setting.page.base.C68256b;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

@AbstractC17735a
/* renamed from: com.ss.android.ugc.aweme.setting.page.backgroundaudio.BackgroundAudioPage */
public final class BackgroundAudioPage extends AbstractC68195a {

    /* renamed from: e */
    private final AbstractC89244h f152769e = C89250i.m154773a((AbstractC89171a) new C68239b(this));

    /* renamed from: f */
    private final AbstractC89244h f152770f = C89250i.m154773a((AbstractC89171a) new C68238a(this));

    /* renamed from: g */
    private SparseArray f152771g;

    static {
        Covode.recordClassIndex(80441);
    }

    /* renamed from: d */
    private final BGAudioViewModel m120495d() {
        return (BGAudioViewModel) this.f152769e.getValue();
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, com.p2082ss.android.ugc.aweme.setting.page.AbstractC68195a
    /* renamed from: a */
    public final View mo27715a(int i) {
        if (this.f152771g == null) {
            this.f152771g = new SparseArray();
        }
        View view = (View) this.f152771g.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f152771g.put(i, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, com.p2082ss.android.ugc.aweme.setting.page.AbstractC68195a
    public final void bx_() {
        SparseArray sparseArray = this.f152771g;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, com.p2082ss.android.ugc.aweme.setting.page.AbstractC68195a
    /* renamed from: c */
    public final int mo64296c() {
        return R.layout.ay9;
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.setting.page.AbstractC68195a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        bx_();
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.page.backgroundaudio.BackgroundAudioPage$a */
    static final class C68238a extends AbstractC89220m implements AbstractC89171a<C43047dm> {

        /* renamed from: a */
        final /* synthetic */ BackgroundAudioPage f152772a;

        static {
            Covode.recordClassIndex(80442);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C68238a(BackgroundAudioPage backgroundAudioPage) {
            super(0);
            this.f152772a = backgroundAudioPage;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C43047dm invoke() {
            PowerList powerList = (PowerList) this.f152772a.mo27715a(R.id.c_1);
            C89219l.m154716b(powerList, "");
            return new C43047dm(powerList);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.page.backgroundaudio.BackgroundAudioPage$b */
    static final class C68239b extends AbstractC89220m implements AbstractC89171a<BGAudioViewModel> {

        /* renamed from: a */
        final /* synthetic */ BackgroundAudioPage f152773a;

        static {
            Covode.recordClassIndex(80443);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C68239b(BackgroundAudioPage backgroundAudioPage) {
            super(0);
            this.f152773a = backgroundAudioPage;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ BGAudioViewModel invoke() {
            AbstractC1174ac a = C1181ae.m3879a(this.f152773a, (C1175ad.AbstractC1177b) null).mo3983a(BGAudioViewModel.class);
            C89219l.m154716b(a, "");
            return a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.page.AbstractC68195a
    /* renamed from: h */
    public final void mo108725h() {
        String str;
        String str2;
        super.mo108725h();
        Boolean value = m120495d().f152767a.getValue();
        C49510c.EnumC49511a value2 = m120495d().f152768b.getValue();
        if (value != null) {
            if (value.booleanValue()) {
                str = "on";
            } else {
                str = "off";
            }
            C33744d a = new C33744d().mo59983a("enter_from", "settings_page").mo59983a("status", str);
            if (value2 != null) {
                str2 = value2.toMobString();
            } else {
                str2 = null;
            }
            C39162r.m79460a("background_audio_status", a.mo59983a("play_order", str2).f79943a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.page.AbstractC68195a
    /* renamed from: a */
    public final void mo108724a(Activity activity) {
        C89219l.m154721d(activity, "");
        C43047dm dmVar = (C43047dm) this.f152770f.getValue();
        dmVar.mo73247a(new C68240a(this));
        String string = activity.getString(R.string.vm);
        C89219l.m154716b(string, "");
        dmVar.mo73247a(new C40937d(new C34797e(string, false, false, 14)));
        dmVar.mo73247a(new C68246c(this, EnumC68245b.PLAY_IN_ORDER));
        dmVar.mo73247a(new C68246c(this, EnumC68245b.REPEAT));
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.setting.page.AbstractC68195a
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        C68256b.m120520a(this, "", new C68256b.C68257a(this));
    }
}
