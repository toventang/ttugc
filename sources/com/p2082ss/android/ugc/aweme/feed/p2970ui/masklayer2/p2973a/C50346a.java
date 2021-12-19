package com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.p2973a;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.AbstractC50382f;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.C50345a;
import com.p2082ss.android.ugc.aweme.mix.p3447b.C59401a;
import com.p2082ss.android.ugc.aweme.mix.p3447b.C59409i;
import com.p2082ss.android.ugc.aweme.mix.services.IMixFeedService;
import com.p2082ss.android.ugc.aweme.mix.services.MixFeedService;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80636z;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.a.a */
public final class C50346a extends AbstractC50367m {

    /* renamed from: a */
    public final C50345a f116266a;

    static {
        Covode.recordClassIndex(59474);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.p2973a.AbstractC50357e
    /* renamed from: a */
    public final void mo85530a(View view) {
        C89219l.m154721d(view, "");
        if (this.f116296f != null) {
            Aweme aweme = this.f116296f;
            if (aweme == null) {
                C89219l.m154715b();
            }
            if (aweme.playlistBlocked) {
                IMixFeedService k = MixFeedService.m109435k();
                Context context = view.getContext();
                C89219l.m154716b(context, "");
                k.mo97310a(context);
            } else if (!C80636z.m139817b(this.f116296f)) {
                new C79459a(view.getContext()).mo123050a(R.string.gfy).mo123053a();
            } else if (MixFeedService.m109435k().mo97324a(this.f116296f)) {
                AbstractC81915c.m141874a(new C59409i(this.f116296f, this.f116266a.f116265c));
            } else {
                AbstractC81915c.m141874a(new C59401a(this.f116296f));
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C50346a(C50345a aVar, AbstractC50382f fVar) {
        super(aVar, fVar);
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(fVar, "");
        this.f116266a = aVar;
    }
}
