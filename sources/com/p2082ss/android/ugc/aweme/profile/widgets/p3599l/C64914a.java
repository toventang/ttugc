package com.p2082ss.android.ugc.aweme.profile.widgets.p3599l;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.core.AbstractC12748a;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.extensions.C12786i;
import com.bytedance.assem.arch.p797d.AbstractC12769a;
import com.bytedance.assem.arch.service.C12801d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.base.p1291a.C18411b;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.p1710c.C23005c;
import com.bytedance.tux.p1719f.C23137c;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.AbstractC64206ab;
import com.p2082ss.android.ugc.aweme.profile.widgets.common.AbstractC64616j;
import com.p2082ss.android.ugc.aweme.profile.widgets.common.C64615i;
import com.p2082ss.android.ugc.aweme.profile.widgets.p3594h.p3595a.C64870a;
import com.p2082ss.android.ugc.trill.R;
import java.util.Arrays;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.l.a */
public final class C64914a extends AbstractC12769a {

    /* renamed from: k */
    public static final C64916b f146732k = new C64916b((byte) 0);

    /* renamed from: j */
    public TextView f146733j;

    /* renamed from: l */
    private final C12786i f146734l = new C12786i(bW_(), new C64915a(this, null));

    static {
        Covode.recordClassIndex(76381);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.l.a$b */
    public static final class C64916b {
        static {
            Covode.recordClassIndex(76383);
        }

        private C64916b() {
        }

        public /* synthetic */ C64916b(byte b) {
            this();
        }
    }

    /* renamed from: v */
    public final boolean mo104261v() {
        C64870a aVar = (C64870a) this.f146734l.getValue();
        if (aVar != null) {
            return aVar.f146660c;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.l.a$a */
    public static final class C64915a extends AbstractC89220m implements AbstractC89171a<C64870a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f146735a;

        /* renamed from: b */
        final /* synthetic */ String f146736b;

        static {
            Covode.recordClassIndex(76382);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64915a(AbstractC12748a aVar, String str) {
            super(0);
            this.f146735a = aVar;
            this.f146736b = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.profile.widgets.h.a.a, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.profile.widgets.p3594h.p3595a.C64870a invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.core.a r0 = r3.f146735a
                com.bytedance.assem.arch.core.AssemSupervisor r0 = r0.bD_()
                com.bytedance.assem.arch.core.d r2 = r0.f30984f
                java.lang.Class<com.ss.android.ugc.aweme.profile.widgets.h.a.a> r1 = com.p2082ss.android.ugc.aweme.profile.widgets.p3594h.p3595a.C64870a.class
                java.lang.String r0 = r3.f146736b
                java.lang.Object r0 = r2.mo20606b(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.widgets.p3599l.C64914a.C64915a.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.l.a$e */
    static final class C64919e extends AbstractC89220m implements AbstractC89172b<C12776a<? extends C89391z>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C64914a f146739a;

        static {
            Covode.recordClassIndex(76386);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64919e(C64914a aVar) {
            super(1);
            this.f146739a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C12776a<? extends C89391z> aVar) {
            TextView textView;
            if (!(aVar == null || (textView = this.f146739a.f146733j) == null)) {
                textView.setVisibility(8);
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: b */
    public final void mo20630b(View view) {
        CharSequence charSequence;
        C89219l.m154721d(view, "");
        TextView textView = (TextView) view.findViewById(R.id.f61);
        this.f146733j = textView;
        if (textView != null) {
            Context az_ = az_();
            if (az_ != null) {
                C23137c cVar = new C23137c();
                cVar.f54758a = C23005c.m43393a(new C23137c.C23141c());
                C23137c a = cVar.mo37623a(R.string.geq);
                a.f54762e = true;
                a.f54760c = 52;
                a.f54759b = false;
                a.f54761d = 0;
                charSequence = a.mo37625a(az_);
            } else {
                charSequence = null;
            }
            textView.setText(charSequence);
        }
        TextView textView2 = this.f146733j;
        if (textView2 != null) {
            textView2.setOnClickListener(new View$OnClickListenerC64917c(this));
        }
        C12801d.m23020a(this, C89204ab.m154669a(AbstractC64616j.class), C64920b.f146740a, new C64918d(this));
        C12801d.m23020a(this, C89204ab.m154669a(AbstractC64206ab.class), C64921c.f146741a, new C64919e(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.l.a$c */
    static final class View$OnClickListenerC64917c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C64914a f146737a;

        static {
            Covode.recordClassIndex(76384);
        }

        View$OnClickListenerC64917c(C64914a aVar) {
            this.f146737a = aVar;
        }

        public final void onClick(View view) {
            User user;
            Context az_;
            String str;
            ClickAgent.onClick(view);
            C64914a aVar = this.f146737a;
            C64615i iVar = (C64615i) C12801d.m23029f(aVar, C89204ab.m154669a(AbstractC64616j.class));
            if (iVar != null && (user = iVar.f146329a) != null && (az_ = aVar.az_()) != null) {
                C18411b.m34269a(az_).mo29435a("tip_uid", user.getUid());
                if (aVar.mo104261v()) {
                    str = "personal_homepage";
                } else {
                    str = "others_homepage";
                }
                C33744d a = new C33744d().mo59983a("enter_from", str).mo59983a("to_user_id", user.getUid()).mo59983a("enter_method", "click_button");
                IAccountUserService g = C31575b.m65865g();
                C89219l.m154716b(g, "");
                C39162r.m79460a("click_tips_button", a.mo59983a("from_user_id", g.getCurUserId()).f79943a);
                if (!C89361p.m154870a((CharSequence) C64922d.f146742a)) {
                    SmartRouter.buildRoute(az_, C64922d.f146742a).open();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.l.a$d */
    static final class C64918d extends AbstractC89220m implements AbstractC89172b<C12776a<? extends User>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C64914a f146738a;

        static {
            Covode.recordClassIndex(76385);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64918d(C64914a aVar) {
            super(1);
            this.f146738a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C12776a<? extends User> aVar) {
            T t;
            Resources resources;
            String str;
            TextView textView;
            Resources resources2;
            String string;
            C12776a<? extends User> aVar2 = aVar;
            if (!(aVar2 == null || (t = aVar2.f31085a) == null)) {
                String str2 = null;
                boolean z = true;
                int i = 0;
                if (!this.f146738a.mo104261v()) {
                    String uniqueId = t.getUniqueId();
                    if (!(uniqueId == null || (textView = this.f146738a.f146733j) == null)) {
                        Context az_ = this.f146738a.az_();
                        if (!(az_ == null || (resources2 = az_.getResources()) == null || (string = resources2.getString(R.string.l2)) == null)) {
                            str2 = C1764a.m5928a(string, Arrays.copyOf(new Object[]{uniqueId}, 1));
                            C89219l.m154716b(str2, "");
                        }
                        textView.setContentDescription(str2);
                    }
                } else {
                    TextView textView2 = this.f146738a.f146733j;
                    if (textView2 != null) {
                        Context az_2 = this.f146738a.az_();
                        if (!(az_2 == null || (resources = az_2.getResources()) == null)) {
                            str2 = resources.getString(R.string.l1);
                        }
                        textView2.setContentDescription(str2);
                    }
                }
                C64914a aVar3 = this.f146738a;
                if (!t.getShowTipEntry() || t.isBlock) {
                    z = false;
                } else {
                    if (aVar3.mo104261v()) {
                        str = "personal_homepage";
                    } else {
                        str = "others_homepage";
                    }
                    C33744d a = new C33744d().mo59983a("enter_from", str).mo59983a("to_user_id", t.getUid());
                    IAccountUserService g = C31575b.m65865g();
                    C89219l.m154716b(g, "");
                    C39162r.m79460a("show_tips_button", a.mo59983a("from_user_id", g.getCurUserId()).f79943a);
                }
                TextView textView3 = aVar3.f146733j;
                if (textView3 != null) {
                    if (!z) {
                        i = 8;
                    }
                    textView3.setVisibility(i);
                }
            }
            return C89391z.f203057a;
        }
    }
}
