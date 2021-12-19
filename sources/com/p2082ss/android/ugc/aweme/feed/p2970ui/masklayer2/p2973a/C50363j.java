package com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.p2973a;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.favorites.p2924f.AbstractC47430d;
import com.p2082ss.android.ugc.aweme.favorites.p2924f.C47426a;
import com.p2082ss.android.ugc.aweme.feed.C48027ac;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.AbstractC50382f;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.C50345a;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50560y;
import com.p2082ss.android.ugc.aweme.feed.param.FeedParamProvider;
import com.p2082ss.android.ugc.aweme.login.C58957c;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.preload.p3564b.C63332a;
import com.p2082ss.android.ugc.aweme.upvote.event.C79900c;
import com.p2082ss.android.ugc.aweme.utils.C80222ap;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.a.j */
public final class C50363j extends AbstractC50367m implements AbstractC47430d {

    /* renamed from: a */
    private C47426a f116291a;

    /* renamed from: b */
    private final C50345a f116292b;

    /* renamed from: c */
    private final AbstractC50382f f116293c;

    static {
        Covode.recordClassIndex(59491);
    }

    @Override // com.p2082ss.android.ugc.aweme.favorites.p2924f.AbstractC47430d
    /* renamed from: e_ */
    public final void mo62592e_(Exception exc) {
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.a.j$a */
    static final class C50364a implements AbstractC34543f {

        /* renamed from: a */
        final /* synthetic */ C50363j f116294a;

        static {
            Covode.recordClassIndex(59492);
        }

        C50364a(C50363j jVar) {
            this.f116294a = jVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f
        /* renamed from: b */
        public final void mo57674b() {
        }

        @Override // com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f
        /* renamed from: a */
        public final void mo57673a() {
            this.f116294a.mo85541a();
        }
    }

    /* renamed from: a */
    public final void mo85541a() {
        String str;
        if (this.f116291a == null) {
            this.f116291a = new C47426a();
        }
        C47426a aVar = this.f116291a;
        if (aVar != null) {
            aVar.f110158c = this.f116297g;
        }
        C47426a aVar2 = this.f116291a;
        if (aVar2 != null) {
            aVar2.mo67839a_(this);
        }
        C47426a aVar3 = this.f116291a;
        if (aVar3 != null) {
            Object[] objArr = new Object[3];
            int i = 0;
            objArr[0] = 2;
            Aweme aweme = this.f116296f;
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            objArr[1] = str;
            Aweme aweme2 = this.f116296f;
            if (aweme2 == null || !aweme2.isCollected()) {
                i = 1;
            }
            objArr[2] = Integer.valueOf(i);
            aVar3.mo57616a(objArr);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.favorites.p2924f.AbstractC47430d
    /* renamed from: a */
    public final void mo62589a(String str) {
        AbstractC50382f fVar = this.f116293c;
        if (!(fVar instanceof Dialog)) {
            fVar = null;
        }
        Dialog dialog = (Dialog) fVar;
        if (dialog != null) {
            new C23144b(dialog).mo37635a(str).mo37637b();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.favorites.p2924f.AbstractC47430d
    /* renamed from: a */
    public final void mo62587a(BaseResponse baseResponse) {
        Aweme aweme = this.f116296f;
        if (aweme != null) {
            aweme.setCollectStatus(!aweme.isCollected());
            AwemeService.m70060b().mo60689c(aweme.getAid(), aweme.getCollectStatus());
            if (C89219l.m154714a((Object) "homepage_hot", (Object) this.f116297g)) {
                C63332a.C63333a.m114832a().mo101921a(6);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.p2973a.AbstractC50357e
    /* renamed from: a */
    public final void mo85530a(View view) {
        String str;
        String str2;
        String str3;
        Boolean bool;
        Integer num;
        String aid;
        Activity ownerActivity;
        String str4 = "";
        C89219l.m154721d(view, str4);
        C33744d dVar = new C33744d();
        Activity j = C17873f.m33102j();
        if (j != null) {
            dVar.mo59986a(C50560y.m94792b(FeedParamProvider.C49809a.m93270a(j).getPreviousPage(), FeedParamProvider.C49809a.m93270a(j).getFromGroupId()));
        }
        Aweme aweme = this.f116296f;
        if (aweme == null || !aweme.isCollected()) {
            str = "favourite_video";
        } else {
            str = "cancel_favourite_video";
        }
        C33744d a = dVar.mo59983a("enter_from", this.f116297g);
        Aweme aweme2 = this.f116296f;
        if (aweme2 != null) {
            str2 = aweme2.getAid();
        } else {
            str2 = null;
        }
        C33744d a2 = a.mo59983a("group_id", str2);
        Aweme aweme3 = this.f116296f;
        if (aweme3 != null) {
            str3 = aweme3.getAuthorUid();
        } else {
            str3 = null;
        }
        C33744d a3 = a2.mo59983a("author_id", str3).mo59983a("log_pb", C48027ac.C48028a.f111257a.mo80055a(C59208ac.m108763b(this.f116296f))).mo59983a("enter_method", "long_press");
        Aweme aweme4 = this.f116296f;
        if (aweme4 != null) {
            bool = Boolean.valueOf(aweme4.isHighlighted());
        } else {
            bool = null;
        }
        C33744d a4 = a3.mo59982a("is_highlighted", bool);
        Aweme aweme5 = this.f116296f;
        if (aweme5 != null) {
            num = Integer.valueOf(aweme5.getOriginalPos());
        } else {
            num = null;
        }
        C33744d a5 = a4.mo59982a("rank_index", num);
        Aweme aweme6 = this.f116296f;
        if (aweme6 == null || !aweme6.isCollected()) {
            C79900c.m138665a(a5, this.f116296f, this.f116297g);
        }
        C39162r.m79460a(str, a5.f79943a);
        if (C37699a.m76218U(this.f116296f)) {
            AbstractC50382f fVar = this.f116293c;
            if (!(fVar instanceof Dialog)) {
                fVar = null;
            }
            Dialog dialog = (Dialog) fVar;
            if (dialog != null && (ownerActivity = dialog.getOwnerActivity()) != null) {
                new C23144b(ownerActivity).mo37640e(R.string.o7).mo37637b();
                return;
            }
            return;
        }
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, str4);
        if (!g.isLogin()) {
            Aweme aweme7 = this.f116296f;
            if (!(aweme7 == null || (aid = aweme7.getAid()) == null)) {
                str4 = aid;
            }
            C58957c.m108320a(C17873f.m33102j(), this.f116297g, "click_favorite_video", new C80222ap().mo123649a("group_id", str4).mo123649a("log_pb", C59208ac.m108768c(str4)).f179700a, new C50364a(this));
            return;
        }
        mo85541a();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C50363j(C50345a aVar, AbstractC50382f fVar) {
        super(aVar, fVar);
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(fVar, "");
        this.f116292b = aVar;
        this.f116293c = fVar;
    }
}
