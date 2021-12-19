package com.p2082ss.android.ugc.aweme.profile.widgets.p3597j;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.core.AbstractC12748a;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.extensions.C12786i;
import com.bytedance.assem.arch.p797d.AbstractC12769a;
import com.bytedance.assem.arch.service.C12801d;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.AbstractC64206ab;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.AbstractC64313x;
import com.p2082ss.android.ugc.aweme.profile.widgets.common.AbstractC64616j;
import com.p2082ss.android.ugc.aweme.profile.widgets.common.C64615i;
import com.p2082ss.android.ugc.aweme.profile.widgets.p3594h.p3595a.C64870a;
import com.p2082ss.android.ugc.aweme.shoutouts.p3902b.C74387a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80422fe;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.j.a */
public final class C64884a extends AbstractC12769a {

    /* renamed from: k */
    public static final C64886b f146691k = new C64886b((byte) 0);

    /* renamed from: j */
    public TuxTextView f146692j;

    /* renamed from: l */
    private final C12786i f146693l = new C12786i(bW_(), new C64885a(this, null));

    static {
        Covode.recordClassIndex(76351);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.j.a$b */
    public static final class C64886b {
        static {
            Covode.recordClassIndex(76353);
        }

        private C64886b() {
        }

        public /* synthetic */ C64886b(byte b) {
            this();
        }
    }

    /* renamed from: v */
    public final boolean mo104252v() {
        if (this.f146693l.getValue() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.j.a$a */
    public static final class C64885a extends AbstractC89220m implements AbstractC89171a<C64870a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f146694a;

        /* renamed from: b */
        final /* synthetic */ String f146695b;

        static {
            Covode.recordClassIndex(76352);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64885a(AbstractC12748a aVar, String str) {
            super(0);
            this.f146694a = aVar;
            this.f146695b = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.profile.widgets.h.a.a, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.profile.widgets.p3594h.p3595a.C64870a invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.core.a r0 = r3.f146694a
                com.bytedance.assem.arch.core.AssemSupervisor r0 = r0.bD_()
                com.bytedance.assem.arch.core.d r2 = r0.f30984f
                java.lang.Class<com.ss.android.ugc.aweme.profile.widgets.h.a.a> r1 = com.p2082ss.android.ugc.aweme.profile.widgets.p3594h.p3595a.C64870a.class
                java.lang.String r0 = r3.f146695b
                java.lang.Object r0 = r2.mo20606b(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.widgets.p3597j.C64884a.C64885a.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.j.a$e */
    static final class C64889e extends AbstractC89220m implements AbstractC89172b<C12776a<? extends C89391z>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C64884a f146698a;

        static {
            Covode.recordClassIndex(76356);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64889e(C64884a aVar) {
            super(1);
            this.f146698a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C12776a<? extends C89391z> aVar) {
            TuxTextView tuxTextView;
            if (!(aVar == null || (tuxTextView = this.f146698a.f146692j) == null)) {
                tuxTextView.setVisibility(8);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.j.a$d */
    static final class C64888d extends AbstractC89220m implements AbstractC89172b<C12776a<? extends User>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C64884a f146697a;

        static {
            Covode.recordClassIndex(76355);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64888d(C64884a aVar) {
            super(1);
            this.f146697a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C12776a<? extends User> aVar) {
            T t;
            C12776a<? extends User> aVar2 = aVar;
            if (!(aVar2 == null || (t = aVar2.f31085a) == null)) {
                this.f146697a.mo104251a((User) t);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.j.a$c */
    static final class View$OnClickListenerC64887c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C64884a f146696a;

        static {
            Covode.recordClassIndex(76354);
        }

        View$OnClickListenerC64887c(C64884a aVar) {
            this.f146696a = aVar;
        }

        public final void onClick(View view) {
            User user;
            ClickAgent.onClick(view);
            C64884a aVar = this.f146696a;
            C64615i iVar = (C64615i) C12801d.m23029f(aVar, C89204ab.m154669a(AbstractC64616j.class));
            if (iVar != null && (user = iVar.f146329a) != null) {
                Context az_ = aVar.az_();
                if (az_ == null) {
                    C89219l.m154715b();
                }
                if (!C80422fe.m139425a(az_)) {
                    new C79459a(aVar.az_()).mo123050a(R.string.dcq).mo123053a();
                    return;
                }
                Context az_2 = aVar.az_();
                if (az_2 == null) {
                    C89219l.m154715b();
                }
                C74387a.m130853a(az_2, user.getUid());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.j.a$f */
    static final class C64890f extends AbstractC89220m implements AbstractC89172b<C12776a<? extends User>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C64884a f146699a;

        static {
            Covode.recordClassIndex(76357);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64890f(C64884a aVar) {
            super(1);
            this.f146699a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C12776a<? extends User> aVar) {
            T t;
            C12776a<? extends User> aVar2 = aVar;
            if (!(aVar2 == null || (t = aVar2.f31085a) == null)) {
                Context az_ = this.f146699a.az_();
                if (!(az_ instanceof Activity)) {
                    az_ = null;
                }
                Activity activity = (Activity) az_;
                if (activity != null && this.f146699a.mo104252v() && activity.getIntent().getBooleanExtra("extra.from.shoutouts.opt.out", false)) {
                    activity.getIntent().removeExtra("extra.from.shoutouts.opt.out");
                    new C79459a(activity).mo123050a(R.string.fwk).mo123053a();
                    t.shoutoutsStatus = 404;
                    this.f146699a.mo104251a((User) t);
                }
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: b */
    public final void mo20630b(View view) {
        C89219l.m154721d(view, "");
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.e0h);
        this.f146692j = tuxTextView;
        if (tuxTextView != null) {
            tuxTextView.setOnClickListener(new View$OnClickListenerC64887c(this));
        }
        C12801d.m23020a(this, C89204ab.m154669a(AbstractC64616j.class), C64891b.f146700a, new C64888d(this));
        C12801d.m23020a(this, C89204ab.m154669a(AbstractC64206ab.class), C64892c.f146701a, new C64889e(this));
        C12801d.m23020a(this, C89204ab.m154669a(AbstractC64313x.class), C64893d.f146702a, new C64890f(this));
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo104251a(com.p2082ss.android.ugc.aweme.profile.model.User r8) {
        /*
        // Method dump skipped, instructions count: 138
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.widgets.p3597j.C64884a.mo104251a(com.ss.android.ugc.aweme.profile.model.User):void");
    }
}
