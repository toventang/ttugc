package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.mediachoose.C59179f;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.bf */
public final /* synthetic */ class C72171bf implements AbstractC89172b {

    /* renamed from: a */
    private final MvImageChooseAdapter f161784a;

    /* renamed from: b */
    private final MvImageChooseAdapter.AbstractC72046a f161785b;

    /* renamed from: c */
    private final MediaModel f161786c;

    static {
        Covode.recordClassIndex(84836);
    }

    C72171bf(MvImageChooseAdapter mvImageChooseAdapter, MvImageChooseAdapter.AbstractC72046a aVar, MediaModel mediaModel) {
        this.f161784a = mvImageChooseAdapter;
        this.f161785b = aVar;
        this.f161786c = mediaModel;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        return MvImageChooseAdapter.m127140a(this.f161785b, this.f161786c, (C59179f) obj);
    }
}
