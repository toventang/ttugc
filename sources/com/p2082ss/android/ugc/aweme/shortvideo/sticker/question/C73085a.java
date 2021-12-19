package com.p2082ss.android.ugc.aweme.shortvideo.sticker.question;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.p1097d.C15401f;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.tux.tooltip.p1727a.p1728a.C23322d;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.comment.util.C37218u;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.i18n.language.C53438a;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.question.api.QuestionApi;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72921b;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.AbstractC72946a;
import com.p2082ss.android.ugc.aweme.sticker.C75384i;
import com.p2082ss.android.ugc.aweme.sticker.C75391j;
import com.p2082ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p2082ss.android.ugc.aweme.sticker.data.QaStruct;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;
import java.util.UUID;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.question.a */
public final class C73085a extends AbstractC72946a {

    /* renamed from: a */
    public final Long f164015a;

    /* renamed from: l */
    public final Long f164016l;

    /* renamed from: m */
    private final long f164017m;

    /* renamed from: n */
    private final AbstractC89244h f164018n;

    /* renamed from: o */
    private final C73090b f164019o;

    static {
        Covode.recordClassIndex(85792);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.AbstractC72946a
    /* renamed from: f */
    public final void mo115229f() {
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72923d
    /* renamed from: h */
    public final void mo115230h() {
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72923d
    /* renamed from: a */
    public final View mo115223a() {
        return (FrameLayout) this.f164018n.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72924e
    /* renamed from: b */
    public final int mo115226b() {
        InteractStickerStruct interactStickerStruct = this.f163692f;
        if (interactStickerStruct != null) {
            return interactStickerStruct.getType();
        }
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.AbstractC72946a
    /* renamed from: e */
    public final View mo115228e() {
        MethodCollector.m26663i(8506);
        View view = new View(this.f163695i);
        MethodCollector.m26664o(8506);
        return view;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.question.a$d */
    static final class C73089d extends AbstractC89220m implements AbstractC89171a<FrameLayout> {

        /* renamed from: a */
        final /* synthetic */ Context f164025a;

        static {
            Covode.recordClassIndex(85796);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C73089d(Context context) {
            super(0);
            this.f164025a = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ FrameLayout invoke() {
            MethodCollector.m26663i(8012);
            FrameLayout frameLayout = new FrameLayout(this.f164025a);
            frameLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            MethodCollector.m26664o(8012);
            return frameLayout;
        }
    }

    /* renamed from: c */
    public final boolean mo115507c() {
        if (!AVExternalServiceImpl.m113114a().configService().avsettingsConfig().enableQaSticker() || !m129025o()) {
            return false;
        }
        return true;
    }

    /* renamed from: o */
    private final boolean m129025o() {
        QaStruct qaStruct;
        Long valueOf;
        InteractStickerStruct interactStickerStruct = this.f163692f;
        if (interactStickerStruct == null || (qaStruct = interactStickerStruct.getQaStruct()) == null || (valueOf = Long.valueOf(qaStruct.getQuestionId())) == null || valueOf.longValue() == 0) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.AbstractC72946a
    /* renamed from: d */
    public final void mo115227d() {
        C75384i iVar;
        C75391j jVar = this.f163697k;
        if (jVar != null && (iVar = jVar.f169463r) != null) {
            C33744d a = new C33744d().mo59983a("enter_from", iVar.f169427a).mo59983a("group_id", iVar.f169429c).mo59983a("author_id", iVar.f169428b).mo59982a("question_id", this.f164016l);
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            C39162r.m79460a("sticker_click", a.mo59983a("user_id", g.getCurUserId()).mo59983a("sticker_type", "question").mo59982a("question_user_id", this.f164015a).mo59983a("options_show", "both_for_q").f79943a);
        }
    }

    /* renamed from: g */
    public final void mo115508g() {
        String str;
        String str2;
        String str3;
        C75391j jVar = this.f163697k;
        if (jVar != null) {
            SmartRoute buildRoute = SmartRouter.buildRoute(this.f163695i, "aweme://qna/detail/");
            Long l = this.f164016l;
            String str4 = null;
            if (l != null) {
                str = String.valueOf(l.longValue());
            } else {
                str = null;
            }
            SmartRoute withParam = buildRoute.withParam("id", str);
            C75384i iVar = jVar.f169463r;
            if (iVar != null) {
                str2 = iVar.f169427a;
            } else {
                str2 = null;
            }
            SmartRoute withParam2 = withParam.withParam("extra_question_from", str2).withParam("aweme_id", jVar.f169449d);
            Long l2 = this.f164016l;
            if (l2 != null) {
                str3 = String.valueOf(l2.longValue());
            } else {
                str3 = null;
            }
            SmartRoute withParam3 = withParam2.withParam("qid", str3);
            C75384i iVar2 = jVar.f169463r;
            if (iVar2 != null) {
                str4 = iVar2.f169427a;
            }
            withParam3.withParam("enter_from", str4).withParam("process_id", UUID.randomUUID().toString()).withParam("enter_method", "click_sticker").withParam("question_type", "video").open();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.question.a$c */
    static final class CallableC73088c<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C73085a f164024a;

        static {
            Covode.recordClassIndex(85795);
        }

        CallableC73088c(C73085a aVar) {
            this.f164024a = aVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            long j;
            String str;
            String str2;
            QaStruct qaStruct;
            C75384i iVar;
            C75384i iVar2;
            C75384i iVar3;
            Long l = this.f164024a.f164016l;
            if (l != null) {
                j = l.longValue();
            } else {
                j = 0;
            }
            if (QuestionApi.m118251b(j).status_code == 0) {
                this.f164024a.mo115506a("answer_with_video");
                C33744d a = new C33744d().mo59983a("enter_method", "question_sticker");
                IAccountUserService g = C31575b.m65865g();
                C89219l.m154716b(g, "");
                C33744d a2 = a.mo59983a("reply_user_id", g.getCurUserId());
                C75391j jVar = this.f164024a.f163697k;
                String str3 = null;
                if (jVar == null || (iVar3 = jVar.f169463r) == null) {
                    str = null;
                } else {
                    str = iVar3.f169428b;
                }
                C33744d a3 = a2.mo59983a("author_id", str).mo59982a("question_user_id", this.f164024a.f164015a).mo59982a("question_id", this.f164024a.f164016l);
                C75391j jVar2 = this.f164024a.f163697k;
                if (jVar2 == null || (iVar2 = jVar2.f169463r) == null) {
                    str2 = null;
                } else {
                    str2 = iVar2.f169429c;
                }
                C39162r.m79460a("reply_question_via_video", a3.mo59983a("group_id", str2).f79943a);
                Context context = this.f164024a.f163695i;
                InteractStickerStruct interactStickerStruct = this.f164024a.f163692f;
                if (interactStickerStruct != null) {
                    qaStruct = interactStickerStruct.getQaStruct();
                } else {
                    qaStruct = null;
                }
                C75391j jVar3 = this.f164024a.f163697k;
                if (!(jVar3 == null || (iVar = jVar3.f169463r) == null)) {
                    str3 = iVar.f169427a;
                }
                C37218u.m75213a(context, qaStruct, str3, "click_sticker", "answer");
            } else {
                new C23144b(this.f164024a.f163696j).mo37640e(R.string.f46).mo37637b();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.question.a$a */
    static final class View$OnClickListenerC73086a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C73085a f164020a;

        /* renamed from: b */
        final /* synthetic */ C23322d f164021b;

        static {
            Covode.recordClassIndex(85793);
        }

        View$OnClickListenerC73086a(C73085a aVar, C23322d dVar) {
            this.f164020a = aVar;
            this.f164021b = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f164020a.mo115357n();
            this.f164020a.mo115506a("view_more_answers");
            this.f164020a.mo115508g();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.question.a$b */
    static final class View$OnClickListenerC73087b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C73085a f164022a;

        /* renamed from: b */
        final /* synthetic */ C23322d f164023b;

        static {
            Covode.recordClassIndex(85794);
        }

        View$OnClickListenerC73087b(C73085a aVar, C23322d dVar) {
            this.f164022a = aVar;
            this.f164023b = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f164022a.mo115357n();
            C1731i.m5640b(new CallableC73088c(this.f164022a), C1731i.f5562a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72922c, com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.AbstractC72946a
    /* renamed from: a */
    public final void mo115236a(C75391j jVar) {
        C89219l.m154721d(jVar, "");
        super.mo115236a(jVar);
        this.f164019o.mo115236a(jVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.AbstractC72946a
    /* renamed from: a */
    public final int mo115233a(C23322d dVar) {
        int i;
        C89219l.m154721d(dVar, "");
        if (!mo115507c()) {
            new C79459a(dVar.f55273b).mo123050a(R.string.f46).mo123053a();
            return 0;
        }
        C23322d.C23324b bVar = new C23322d.C23324b();
        String string = dVar.f55273b.getString(R.string.f14);
        C89219l.m154716b(string, "");
        bVar.mo38017a(string);
        if (TextUtils.equals(C53438a.m98623b(), C15401f.f37600a)) {
            i = 2131232503;
        } else {
            i = 2131232502;
        }
        bVar.f55280a = i;
        bVar.f55285f = new View$OnClickListenerC73086a(this, dVar);
        C23322d.C23324b bVar2 = new C23322d.C23324b();
        String string2 = dVar.f55273b.getString(R.string.c9);
        C89219l.m154716b(string2, "");
        bVar2.mo38017a(string2);
        TextUtils.equals(C53438a.m98623b(), C15401f.f37600a);
        bVar2.f55280a = 2131232497;
        bVar2.f55285f = new View$OnClickListenerC73087b(this, dVar);
        dVar.mo38015a(bVar);
        dVar.mo38015a(bVar2);
        return 2;
    }

    /* renamed from: a */
    public final void mo115506a(String str) {
        C75384i iVar;
        C75391j jVar = this.f163697k;
        if (jVar != null && (iVar = jVar.f169463r) != null) {
            C33744d a = new C33744d().mo59983a("enter_from", iVar.f169427a).mo59983a("group_id", iVar.f169429c).mo59983a("author_id", iVar.f169428b).mo59982a("question_id", this.f164016l);
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            C39162r.m79460a("click_question_bubble", a.mo59983a("user_id", g.getCurUserId()).mo59982a("question_user_id", this.f164015a).mo59983a("target", str).f79943a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72922c
    /* renamed from: a */
    public final boolean mo115224a(long j, int i, float f, float f2) {
        return this.f164019o.mo115224a(j, i, f, f2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73085a(int i, Context context, View view, InteractStickerStruct interactStickerStruct, C75391j jVar) {
        super(i, context, view, interactStickerStruct, jVar);
        Long l;
        QaStruct qaStruct;
        QaStruct qaStruct2;
        C89219l.m154721d(context, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(interactStickerStruct, "");
        InteractStickerStruct interactStickerStruct2 = this.f163692f;
        Long l2 = null;
        if (interactStickerStruct2 == null || (qaStruct2 = interactStickerStruct2.getQaStruct()) == null) {
            l = null;
        } else {
            l = Long.valueOf(qaStruct2.getUserId());
        }
        this.f164015a = l;
        InteractStickerStruct interactStickerStruct3 = this.f163692f;
        if (!(interactStickerStruct3 == null || (qaStruct = interactStickerStruct3.getQaStruct()) == null)) {
            l2 = Long.valueOf(qaStruct.getQuestionId());
        }
        this.f164016l = l2;
        this.f164017m = 300;
        this.f164018n = C89250i.m154773a((AbstractC89171a) new C73089d(context));
        this.f164019o = new C73090b(context, this, interactStickerStruct, jVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72922c
    /* renamed from: a */
    public final boolean mo115225a(long j, int i, float f, float f2, AbstractC72921b bVar) {
        C89219l.m154721d(bVar, "");
        mo115227d();
        return this.f164019o.mo115225a(j, i, f, f2, bVar);
    }
}
