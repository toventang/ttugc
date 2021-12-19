package com.p2082ss.android.ugc.aweme.share.improve.p3755a;

import android.app.Activity;
import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f;
import com.p2082ss.android.ugc.aweme.login.C58957c;
import com.p2082ss.android.ugc.aweme.qainvitation.p3640e.EnumC65848e;
import com.p2082ss.android.ugc.aweme.qainvitation.service.IQAInvitationService;
import com.p2082ss.android.ugc.aweme.qainvitation.service.QAInvitationService;
import com.p2082ss.android.ugc.aweme.qna.model.C66289b;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.ah */
public final class C68989ah implements AbstractC69693h {

    /* renamed from: a */
    public static final C68990a f154327a = new C68990a((byte) 0);

    /* renamed from: b */
    private final AbstractC89244h f154328b = C89250i.m154773a((AbstractC89171a) C68992c.f154332a);

    /* renamed from: c */
    private final C66289b f154329c;

    static {
        Covode.recordClassIndex(81303);
    }

    /* renamed from: h */
    private final IQAInvitationService m121744h() {
        return (IQAInvitationService) this.f154328b.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: b */
    public final int mo61918b() {
        return R.string.a7c;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: c */
    public final String mo61919c() {
        return "qa_invite";
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    public final int co_() {
        return R.raw.icon_2pt_plus_person;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: d */
    public final boolean mo61921d() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: e */
    public final boolean mo61922e() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: f */
    public final boolean mo61923f() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.ah$a */
    public static final class C68990a {
        static {
            Covode.recordClassIndex(81304);
        }

        private C68990a() {
        }

        public /* synthetic */ C68990a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.ah$c */
    static final class C68992c extends AbstractC89220m implements AbstractC89171a<IQAInvitationService> {

        /* renamed from: a */
        public static final C68992c f154332a = new C68992c();

        static {
            Covode.recordClassIndex(81306);
        }

        C68992c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ IQAInvitationService invoke() {
            return QAInvitationService.m117786b();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: g */
    public final int mo61924g() {
        return co_();
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.ah$b */
    static final class C68991b implements AbstractC34543f {

        /* renamed from: a */
        final /* synthetic */ C68989ah f154330a;

        /* renamed from: b */
        final /* synthetic */ Context f154331b;

        static {
            Covode.recordClassIndex(81305);
        }

        C68991b(C68989ah ahVar, Context context) {
            this.f154330a = ahVar;
            this.f154331b = context;
        }

        @Override // com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f
        /* renamed from: b */
        public final void mo57674b() {
        }

        @Override // com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f
        /* renamed from: a */
        public final void mo57673a() {
            C68989ah ahVar = this.f154330a;
            Context context = this.f154331b;
            Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
            ahVar.mo109513a((Activity) context);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: a */
    public final void mo61914a(Context context) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(context, "");
    }

    public C68989ah(C66289b bVar) {
        C89219l.m154721d(bVar, "");
        this.f154329c = bVar;
    }

    /* renamed from: a */
    public final void mo109513a(Activity activity) {
        IQAInvitationService.C65856a.m117785a(m121744h(), activity, "click_share", "qa_detail", EnumC65848e.QUESTION_DETAIL, Long.valueOf(this.f154329c.f149023b), null, null, 224);
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: a */
    public final void mo61916a(ImageView imageView) {
        C89219l.m154721d(imageView, "");
        C89219l.m154721d(imageView, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: a */
    public final void mo61917a(TextView textView) {
        C89219l.m154721d(textView, "");
        AbstractC69693h.C69694a.m123110a(this, textView);
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: a */
    public final void mo61915a(Context context, SharePackage sharePackage) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(sharePackage, "");
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        if (!g.isLogin()) {
            C58957c.m108321a((Activity) context, "qa_detail", "click_share", new C68991b(this, context));
        } else {
            mo109513a((Activity) context);
        }
    }
}
