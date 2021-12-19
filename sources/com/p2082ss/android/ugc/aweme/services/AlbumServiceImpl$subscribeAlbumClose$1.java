package com.p2082ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaState;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.services.AlbumServiceImpl$subscribeAlbumClose$1 */
final /* synthetic */ class AlbumServiceImpl$subscribeAlbumClose$1 extends C89232y {
    public static final AbstractC89290k INSTANCE = new AlbumServiceImpl$subscribeAlbumClose$1();

    static {
        Covode.recordClassIndex(79577);
    }

    AlbumServiceImpl$subscribeAlbumClose$1() {
        super(ChooseMediaState.class, "closingChooseMediaPageState", "getClosingChooseMediaPageState()Lcom/ss/android/ugc/aweme/shortvideo/mvtemplate/choosemedia/ClosingChooseMediaPageState;", 0);
    }

    @Override // p4600h.p4620k.AbstractC89290k, p4600h.p4611f.p4613b.C89232y
    public final Object get(Object obj) {
        return ((ChooseMediaState) obj).getClosingChooseMediaPageState();
    }
}
