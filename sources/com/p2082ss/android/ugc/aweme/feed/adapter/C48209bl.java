package com.p2082ss.android.ugc.aweme.feed.adapter;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.tux.tooltip.AbstractC23332b;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.base.p2377h.C34597d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewCell;
import com.p2082ss.android.ugc.aweme.feed.api.FeedBubbleAckApi;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.share.C69508y;
import p4560f.p4561a.AbstractC88410b;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4586g.AbstractC88921a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.feed.adapter.bl */
public final /* synthetic */ class C48209bl implements AbstractC23332b.AbstractC23333a {

    /* renamed from: a */
    private final VideoViewCell f111691a;

    /* renamed from: b */
    private final Aweme f111692b;

    static {
        Covode.recordClassIndex(56951);
    }

    C48209bl(VideoViewCell videoViewCell, Aweme aweme) {
        this.f111691a = videoViewCell;
        this.f111692b = aweme;
    }

    @Override // com.bytedance.tux.tooltip.AbstractC23332b.AbstractC23333a
    /* renamed from: a */
    public final void mo38047a() {
        VideoViewCell videoViewCell = this.f111691a;
        Aweme aweme = this.f111692b;
        if (aweme.getBubbleInfo() != null) {
            int biz = aweme.getBubbleInfo().getBiz();
            int type = aweme.getBubbleInfo().getType();
            if (biz != 0 && type != 0 && type != 3) {
                C69508y.f155283a = true;
                C69508y.f155284b = true;
                StringBuilder sb = new StringBuilder("promote_guide_shown_history_");
                IAccountUserService g = C31575b.m65865g();
                C89219l.m154716b(g, "");
                C34597d.m70636c().mo61053a(sb.append(g.getCurUserId()).toString(), System.currentTimeMillis());
                C88411a aVar = videoViewCell.f111405aI;
                Object a = RetrofitFactory.m33635a().mo28817b(C29736b.f70924e).mo28832d().mo28858a(FeedBubbleAckApi.class);
                C89219l.m154716b(a, "");
                AbstractC88410b a2 = ((FeedBubbleAckApi) a).sendBubbleAck(biz, type).mo142941b(C88925a.m154180b(C88946a.f201991c)).mo142937a(C88391a.m153580a(C88392a.f200660a));
                VideoViewCell.C481094 r0 = new AbstractC88921a() {
                    /* class com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewCell.C481094 */

                    static {
                        Covode.recordClassIndex(56849);
                    }

                    @Override // p4560f.p4561a.AbstractC88427d
                    public final void onComplete() {
                    }

                    @Override // p4560f.p4561a.AbstractC88427d
                    public final void onError(Throwable th) {
                        th.getMessage();
                    }
                };
                a2.mo17931a(r0);
                aVar.mo142945a(r0);
                C89219l.m154721d(aweme, "");
                C39162r.m79460a("Promote_bubble_show", C69508y.m122722b(aweme).f79943a);
            }
        }
    }
}
