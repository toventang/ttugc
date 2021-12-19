package com.p2082ss.android.ugc.aweme.profile.widgets.p3596i;

import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.core.AbstractC12748a;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.extensions.C12777b;
import com.bytedance.assem.arch.extensions.C12786i;
import com.bytedance.assem.arch.p797d.AbstractC12769a;
import com.bytedance.assem.arch.service.C12801d;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.AbstractC64206ab;
import com.p2082ss.android.ugc.aweme.profile.widgets.common.AbstractC64616j;
import com.p2082ss.android.ugc.aweme.profile.widgets.common.C64615i;
import com.p2082ss.android.ugc.aweme.profile.widgets.p3594h.p3595a.C64870a;
import com.p2082ss.android.ugc.aweme.qna.services.QnaService;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.i.a */
public final class C64873a extends AbstractC12769a {

    /* renamed from: l */
    public static final C64875b f146672l = new C64875b((byte) 0);

    /* renamed from: j */
    final C12786i f146673j = new C12786i(bW_(), new C64874a(this, null));

    /* renamed from: k */
    TextView f146674k;

    static {
        Covode.recordClassIndex(76340);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.i.a$b */
    public static final class C64875b {
        static {
            Covode.recordClassIndex(76342);
        }

        private C64875b() {
        }

        public /* synthetic */ C64875b(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.i.a$e */
    static final class C64878e extends AbstractC89220m implements AbstractC89172b<C12776a<? extends C89391z>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C64873a f146679a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89238e f146680b;

        static {
            Covode.recordClassIndex(76345);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64878e(C64873a aVar, C89233z.C89238e eVar) {
            super(1);
            this.f146679a = aVar;
            this.f146680b = eVar;
        }

        /* renamed from: a */
        private static boolean m116664a() {
            try {
                return C34719f.C34720a.f82009a.mo61395c();
            } catch (Exception unused) {
                return false;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C12776a<? extends C89391z> aVar) {
            if (aVar != null) {
                this.f146679a.az_();
                if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
                    C58029j.f132256h = m116664a();
                }
                if (!C58029j.f132256h) {
                    new C23144b((Fragment) this.f146680b.element).mo37640e(R.string.dcq).mo37637b();
                } else {
                    AbstractC64616j.C64617a.m116533a((AbstractC64616j) C12801d.m23018a(this.f146679a, C89204ab.m154669a(AbstractC64616j.class)), null, 3);
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.i.a$a */
    public static final class C64874a extends AbstractC89220m implements AbstractC89171a<C64870a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f146675a;

        /* renamed from: b */
        final /* synthetic */ String f146676b;

        static {
            Covode.recordClassIndex(76341);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64874a(AbstractC12748a aVar, String str) {
            super(0);
            this.f146675a = aVar;
            this.f146676b = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.profile.widgets.h.a.a, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.profile.widgets.p3594h.p3595a.C64870a invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.core.a r0 = r3.f146675a
                com.bytedance.assem.arch.core.AssemSupervisor r0 = r0.bD_()
                com.bytedance.assem.arch.core.d r2 = r0.f30984f
                java.lang.Class<com.ss.android.ugc.aweme.profile.widgets.h.a.a> r1 = com.p2082ss.android.ugc.aweme.profile.widgets.p3594h.p3595a.C64870a.class
                java.lang.String r0 = r3.f146676b
                java.lang.Object r0 = r2.mo20606b(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.widgets.p3596i.C64873a.C64874a.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.i.a$d */
    static final class C64877d extends AbstractC89220m implements AbstractC89172b<C12776a<? extends User>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C64873a f146678a;

        static {
            Covode.recordClassIndex(76344);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64877d(C64873a aVar) {
            super(1);
            this.f146678a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C12776a<? extends User> aVar) {
            T t;
            TextView textView;
            int i;
            Integer displayQnaOnProfile;
            C12776a<? extends User> aVar2 = aVar;
            if (!(aVar2 == null || (t = aVar2.f31085a) == null)) {
                C64873a aVar3 = this.f146678a;
                if (!(aVar3.f146674k == null || (textView = aVar3.f146674k) == null)) {
                    if (!QnaService.m117969a().enablePublicQna() || (displayQnaOnProfile = t.getDisplayQnaOnProfile()) == null || displayQnaOnProfile.intValue() != 1) {
                        i = 8;
                    } else {
                        i = 0;
                    }
                    textView.setVisibility(i);
                }
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: b */
    public final void mo20630b(View view) {
        C89219l.m154721d(view, "");
        C89233z.C89238e eVar = new C89233z.C89238e();
        T t = (T) C12777b.m22999a((AbstractC1204m) this);
        if (t != null) {
            eVar.element = t;
            TextView textView = (TextView) view.findViewById(R.id.f1t);
            this.f146674k = textView;
            if (textView != null) {
                textView.setOnClickListener(new View$OnClickListenerC64876c(this));
            }
            C12801d.m23020a(this, C89204ab.m154669a(AbstractC64616j.class), C64879b.f146681a, new C64877d(this));
            C12801d.m23020a(this, C89204ab.m154669a(AbstractC64206ab.class), C64880c.f146682a, new C64878e(this, eVar));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.i.a$c */
    static final class View$OnClickListenerC64876c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C64873a f146677a;

        static {
            Covode.recordClassIndex(76343);
        }

        View$OnClickListenerC64876c(C64873a aVar) {
            this.f146677a = aVar;
        }

        public final void onClick(View view) {
            User user;
            String str;
            ClickAgent.onClick(view);
            C64873a aVar = this.f146677a;
            C64615i iVar = (C64615i) C12801d.m23029f(aVar, C89204ab.m154669a(AbstractC64616j.class));
            if (iVar != null && (user = iVar.f146329a) != null) {
                if (aVar.f146673j.getValue() != null) {
                    str = "personal_homepage";
                } else {
                    str = "others_homepage";
                }
                C33744d a = new C33744d().mo59983a("enter_from", str).mo59983a("to_user_id", user.getUid());
                IAccountUserService g = C31575b.m65865g();
                C89219l.m154716b(g, "");
                C39162r.m79460a("click_qa_entrance", a.mo59983a("from_user_id", g.getCurUserId()).f79943a);
                SmartRouter.buildRoute(aVar.az_(), "aweme://user/qna/profile/" + user.getUid()).withParam("enter_from", str).withParam("enter_method", "click_qa_entrance").open();
            }
        }
    }
}
