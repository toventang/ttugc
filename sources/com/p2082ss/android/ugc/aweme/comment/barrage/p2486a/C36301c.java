package com.p2082ss.android.ugc.aweme.comment.barrage.p2486a;

import android.content.Context;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.comment.barrage.view.CommentRichTagView;
import com.p2082ss.android.ugc.aweme.commercialize.depend.AdCommentDependImpl;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.commercialize.p2571j.AbstractC38029b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.p2282ad.comment.depend.IAdCommentDepend;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.barrage.a.c */
public final class C36301c {

    /* renamed from: a */
    public static final C36301c f85820a = new C36301c();

    private C36301c() {
    }

    static {
        Covode.recordClassIndex(43578);
    }

    /* renamed from: a */
    public static boolean m73998a(Aweme aweme) {
        if (!aweme.isAd()) {
            return false;
        }
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd == null) {
            C89219l.m154715b();
        }
        C89219l.m154716b(awemeRawAd, "");
        if (awemeRawAd.isRightStyle()) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.barrage.a.c$a */
    public static final class View$OnClickListenerC36302a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CommentRichTagView f85821a;

        /* renamed from: b */
        final /* synthetic */ Aweme f85822b;

        static {
            Covode.recordClassIndex(43579);
        }

        public View$OnClickListenerC36302a(CommentRichTagView commentRichTagView, Aweme aweme) {
            this.f85821a = commentRichTagView;
            this.f85822b = aweme;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            boolean E = C37699a.m76202E(this.f85822b);
            if (C37699a.m76314s(this.f85822b) || !E) {
                IAdCommentDepend b = AdCommentDependImpl.m75903b();
                Context context = this.f85821a.getContext();
                C89219l.m154716b(context, "");
                b.mo59066a(context, this.f85822b, 1, new AbstractC38029b() {
                    /* class com.p2082ss.android.ugc.aweme.comment.barrage.p2486a.C36301c.View$OnClickListenerC36302a.C363031 */

                    static {
                        Covode.recordClassIndex(43580);
                    }
                });
                return;
            }
            new C23144b(this.f85821a).mo37640e(R.string.o6).mo37637b();
        }
    }
}
