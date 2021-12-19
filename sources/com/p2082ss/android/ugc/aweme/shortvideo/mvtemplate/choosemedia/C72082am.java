package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter;
import com.p2082ss.android.ugc.tools.utils.C84902i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.am */
final /* synthetic */ class C72082am implements MvImageChooseAdapter.AbstractC72049d {

    /* renamed from: a */
    private final C72080al f161569a;

    static {
        Covode.recordClassIndex(84747);
    }

    C72082am(C72080al alVar) {
        this.f161569a = alVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.AbstractC72049d
    /* renamed from: a */
    public final void mo114294a(View view, MediaModel mediaModel) {
        C72080al alVar = this.f161569a;
        if (mediaModel != null) {
            C84902i.m145889a(mediaModel.f134662b, new C72083an(alVar, view, mediaModel));
        }
    }
}
