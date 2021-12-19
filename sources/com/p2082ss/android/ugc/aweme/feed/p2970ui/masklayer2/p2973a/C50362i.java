package com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.p2973a;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.AbstractC50382f;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.C50345a;
import com.p2082ss.android.ugc.aweme.share.C68863ah;
import com.p2082ss.android.ugc.aweme.share.C68900c;
import com.p2082ss.android.ugc.aweme.share.ShareExtService;
import com.p2082ss.android.ugc.aweme.share.improve.p3758c.C69124b;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.a.i */
public final class C50362i extends AbstractC50367m {

    /* renamed from: a */
    public SharePackage f116290a;

    static {
        Covode.recordClassIndex(59490);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.p2973a.AbstractC50357e
    /* renamed from: a */
    public final void mo85530a(View view) {
        C89219l.m154721d(view, "");
        C89219l.m154721d("long_press_download", "");
        C68900c.f154110a = "long_press_download";
        String str = this.f116297g;
        C89219l.m154721d(str, "");
        C68900c.f154111b = str;
        Context context = view.getContext();
        C89219l.m154716b(context, "");
        Activity a = C69124b.m122223a(context);
        if (a != null) {
            ShareExtService shareExtService = C68863ah.f154028b;
            Aweme aweme = this.f116296f;
            if (aweme == null) {
                C89219l.m154715b();
            }
            AbstractC69693h hVar = shareExtService.mo109356a(a, aweme, this.f116297g, "long_press_download");
            if (hVar != null) {
                Context context2 = view.getContext();
                C89219l.m154716b(context2, "");
                hVar.mo61915a(context2, this.f116290a);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C50362i(C50345a aVar, AbstractC50382f fVar) {
        super(aVar, fVar);
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(fVar, "");
        this.f116290a = aVar.f116263a;
    }
}
