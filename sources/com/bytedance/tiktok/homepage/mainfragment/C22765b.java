package com.bytedance.tiktok.homepage.mainfragment;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.services.video.IAVPublishService;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.bytedance.tiktok.homepage.mainfragment.b */
final /* synthetic */ class C22765b implements AbstractC89172b {

    /* renamed from: a */
    private final C22764a f53765a;

    /* renamed from: b */
    private final IAVPublishService f53766b;

    /* renamed from: c */
    private final boolean f53767c;

    /* renamed from: d */
    private final String f53768d;

    /* renamed from: e */
    private final String f53769e;

    /* renamed from: f */
    private final String f53770f;

    static {
        Covode.recordClassIndex(26658);
    }

    C22765b(C22764a aVar, IAVPublishService iAVPublishService, boolean z, String str, String str2, String str3) {
        this.f53765a = aVar;
        this.f53766b = iAVPublishService;
        this.f53767c = z;
        this.f53768d = str;
        this.f53769e = str2;
        this.f53770f = str3;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        C22764a aVar = this.f53765a;
        IAVPublishService iAVPublishService = this.f53766b;
        boolean z = this.f53767c;
        String str = this.f53768d;
        String str2 = this.f53769e;
        String str3 = this.f53770f;
        if (((Boolean) obj).booleanValue()) {
            return null;
        }
        iAVPublishService.showUploadRecoverIfNeed(z, aVar.f53764a.getActivity(), str, str2, str3);
        return null;
    }
}
