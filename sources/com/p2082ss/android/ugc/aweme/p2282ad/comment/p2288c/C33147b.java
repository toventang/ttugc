package com.p2082ss.android.ugc.aweme.p2282ad.comment.p2288c;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38214ac;
import com.p2082ss.android.ugc.aweme.commercialize_ad_api.p2627b.AbstractC39047b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.p2282ad.comment.C33148d;
import com.p2082ss.android.ugc.aweme.p2282ad.comment.View$OnClickListenerC33170f;
import com.p2082ss.android.ugc.aweme.p2282ad.comment.p2286a.AbstractC33138c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ad.comment.c.b */
public final class C33147b extends AbstractC39047b<C33148d> {

    /* renamed from: a */
    private View$OnClickListenerC33170f f78737a;

    static {
        Covode.recordClassIndex(39965);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33147b(View view) {
        super(view);
        C89219l.m154721d(view, "");
        this.f78737a = (View$OnClickListenerC33170f) view;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.content.Context, com.ss.android.ugc.aweme.commercialize_ad_api.a.c] */
    @Override // com.p2082ss.android.ugc.aweme.commercialize_ad_api.p2627b.AbstractC39047b
    /* renamed from: a */
    public final /* synthetic */ void mo59005a(Context context, C33148d dVar) {
        C33148d dVar2 = dVar;
        C89219l.m154721d(context, "");
        C89219l.m154721d(dVar2, "");
        View$OnClickListenerC33170f fVar = this.f78737a;
        if (fVar != null) {
            fVar.setDataCenter(dVar2.f78741d);
        }
        View$OnClickListenerC33170f fVar2 = this.f78737a;
        if (fVar2 != null) {
            C38214ac acVar = dVar2.f78738a;
            C89219l.m154716b(acVar, "");
            Aweme aweme = dVar2.f78739b;
            C89219l.m154716b(aweme, "");
            fVar2.mo59071a(acVar, aweme);
        }
        View$OnClickListenerC33170f fVar3 = this.f78737a;
        if (fVar3 != null) {
            AbstractC33138c cVar = dVar2.f78740c;
            C89219l.m154716b(cVar, "");
            fVar3.setOnDislikeCommentAdListener(cVar);
        }
    }
}
