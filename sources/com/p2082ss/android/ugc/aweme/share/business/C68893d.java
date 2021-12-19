package com.p2082ss.android.ugc.aweme.share.business;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.business.d */
public final class C68893d {
    static {
        Covode.recordClassIndex(81198);
    }

    /* renamed from: a */
    public static final Aweme m121577a(SharePackage sharePackage) {
        String str = "";
        C89219l.m154721d(sharePackage, str);
        String string = sharePackage.f155492i.getString("aid", str);
        if (string != null) {
            str = string;
        }
        return AwemeService.m70060b().mo60690d(str);
    }
}
