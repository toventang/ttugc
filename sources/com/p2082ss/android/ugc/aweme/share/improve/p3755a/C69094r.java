package com.p2082ss.android.ugc.aweme.share.improve.p3755a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.share.ShareDependService;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.r */
public final class C69094r extends C69037c {
    static {
        Covode.recordClassIndex(81408);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C69094r(String str) {
        super(str, true);
        C89219l.m154721d(str, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.share.improve.p3755a.C69037c, com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: a */
    public final void mo61915a(Context context, SharePackage sharePackage) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(sharePackage, "");
        Aweme d = AwemeService.m70060b().mo60690d(sharePackage.f155492i.getString("aweme_id"));
        if (d != null) {
            ShareDependService.C68822a.m121324a().mo109347b(context, d);
            super.mo61915a(context, sharePackage);
        }
    }
}
