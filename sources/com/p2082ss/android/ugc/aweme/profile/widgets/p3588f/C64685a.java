package com.p2082ss.android.ugc.aweme.profile.widgets.p3588f;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.core.AbstractC12748a;
import com.bytedance.assem.arch.extensions.C12777b;
import com.bytedance.assem.arch.extensions.C12786i;
import com.bytedance.assem.arch.p797d.AbstractC12769a;
import com.bytedance.assem.arch.service.C12801d;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.SharePrefCache;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.service.C63867b;
import com.p2082ss.android.ugc.aweme.profile.widgets.common.AbstractC64616j;
import com.p2082ss.android.ugc.aweme.profile.widgets.common.C64615i;
import com.p2082ss.android.ugc.aweme.profile.widgets.p3594h.p3595a.C64870a;
import com.p2082ss.android.ugc.aweme.utils.C80222ap;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.f.a */
public final class C64685a extends AbstractC12769a {

    /* renamed from: j */
    public View f146417j;

    /* renamed from: k */
    private final C12786i f146418k = new C12786i(bW_(), new C64686a(this, null));

    /* renamed from: l */
    private View f146419l;

    static {
        Covode.recordClassIndex(76151);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.f.a$a */
    public static final class C64686a extends AbstractC89220m implements AbstractC89171a<C64870a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f146420a;

        /* renamed from: b */
        final /* synthetic */ String f146421b;

        static {
            Covode.recordClassIndex(76152);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64686a(AbstractC12748a aVar, String str) {
            super(0);
            this.f146420a = aVar;
            this.f146421b = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.profile.widgets.h.a.a, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.profile.widgets.p3594h.p3595a.C64870a invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.core.a r0 = r3.f146420a
                com.bytedance.assem.arch.core.AssemSupervisor r0 = r0.bD_()
                com.bytedance.assem.arch.core.d r2 = r0.f30984f
                java.lang.Class<com.ss.android.ugc.aweme.profile.widgets.h.a.a> r1 = com.p2082ss.android.ugc.aweme.profile.widgets.p3594h.p3595a.C64870a.class
                java.lang.String r0 = r3.f146421b
                java.lang.Object r0 = r2.mo20606b(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.widgets.p3588f.C64685a.C64686a.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.f.a$b */
    static final class View$OnClickListenerC64687b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C64685a f146422a;

        static {
            Covode.recordClassIndex(76153);
        }

        View$OnClickListenerC64687b(C64685a aVar) {
            this.f146422a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            ActivityC0945e b = C12777b.m23004b(this.f146422a);
            if (b != null) {
                C63867b bVar = C63867b.f144793a;
                Bundle bundle = new C80222ap().mo123649a("enter_from", "personal_homepage").mo123649a("enter_method", "click_button").f179700a;
                C89219l.m154716b(bundle, "");
                bVar.enterMyFavorites(b, bundle);
                SharePrefCache inst = SharePrefCache.inst();
                C89219l.m154716b(inst, "");
                inst.getShouldShowFavouriteTip().mo59940b(false);
                View view2 = this.f146422a.f146417j;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
            }
        }
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: b */
    public final void mo20630b(View view) {
        View view2;
        User user;
        Drawable drawable;
        Resources resources;
        C89219l.m154721d(view, "");
        this.f146419l = view.findViewById(R.id.cpc);
        this.f146417j = view.findViewById(R.id.azl);
        View findViewById = view.findViewById(R.id.azk);
        String str = null;
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                C89219l.m154716b(findViewById, "");
                Context az_ = az_();
                if (az_ == null || (resources = az_.getResources()) == null) {
                    drawable = null;
                } else {
                    drawable = resources.getDrawable(R.drawable.b7m);
                }
                findViewById.setForeground(drawable);
            } catch (NullPointerException unused) {
            }
        }
        findViewById.setOnClickListener(new View$OnClickListenerC64687b(this));
        if (C80580in.m139687c()) {
            C34729o.m70956a(false, this.f146419l, this.f146417j);
        }
        C64870a aVar = (C64870a) this.f146418k.getValue();
        if (aVar == null || !aVar.f146660c) {
            C64615i iVar = (C64615i) C12801d.m23029f(this, C89204ab.m154669a(AbstractC64616j.class));
            if (!(iVar == null || (user = iVar.f146329a) == null)) {
                str = user.getUid();
            }
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            if (TextUtils.equals(str, g.getCurUserId()) && (view2 = this.f146419l) != null) {
                view2.setVisibility(0);
            }
        }
    }
}
