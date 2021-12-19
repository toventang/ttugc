package com.p2082ss.android.ugc.aweme.profile.widgets.p3587e;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.core.content.C0643b;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.core.AbstractC12748a;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.extensions.C12777b;
import com.bytedance.assem.arch.extensions.C12786i;
import com.bytedance.assem.arch.p797d.AbstractC12769a;
import com.bytedance.assem.arch.service.C12801d;
import com.bytedance.common.utility.C13628n;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.dialog.C23048e;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.commerce.C37495f;
import com.p2082ss.android.ugc.aweme.commerce.C37499j;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.experiment.BioLinkReportConfig;
import com.p2082ss.android.ugc.aweme.profile.experiment.C63735a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.EnterpriseTransformLayout;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.AbstractC64206ab;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.AbstractC64313x;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.C64207ac;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.C64312w;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.C64314y;
import com.p2082ss.android.ugc.aweme.profile.service.C63867b;
import com.p2082ss.android.ugc.aweme.profile.widgets.common.AbstractC64616j;
import com.p2082ss.android.ugc.aweme.profile.widgets.common.C64615i;
import com.p2082ss.android.ugc.aweme.profile.widgets.p3594h.p3595a.C64871b;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.e.a */
public class C64668a extends AbstractC12769a {

    /* renamed from: o */
    public static final C64670b f146392o = new C64670b((byte) 0);

    /* renamed from: j */
    public EnterpriseTransformLayout f146393j;

    /* renamed from: k */
    public TextView f146394k;

    /* renamed from: l */
    public View f146395l;

    /* renamed from: m */
    public TextView f146396m;

    /* renamed from: n */
    public TextView f146397n;

    /* renamed from: p */
    private final C12786i f146398p = new C12786i(bW_(), new C64669a(this, null));

    static {
        Covode.recordClassIndex(76134);
    }

    /* renamed from: v */
    private final C64871b m116553v() {
        return (C64871b) this.f146398p.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.e.a$b */
    public static final class C64670b {
        static {
            Covode.recordClassIndex(76136);
        }

        private C64670b() {
        }

        public /* synthetic */ C64670b(byte b) {
            this();
        }
    }

    /* renamed from: w */
    private final String m116554w() {
        String str;
        C64871b v = m116553v();
        if (v == null || (str = v.f146665c) == null) {
            return "";
        }
        return str;
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.e.a$a */
    public static final class C64669a extends AbstractC89220m implements AbstractC89171a<C64871b> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f146399a;

        /* renamed from: b */
        final /* synthetic */ String f146400b;

        static {
            Covode.recordClassIndex(76135);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64669a(AbstractC12748a aVar, String str) {
            super(0);
            this.f146399a = aVar;
            this.f146400b = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.profile.widgets.h.a.b, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.profile.widgets.p3594h.p3595a.C64871b invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.core.a r0 = r3.f146399a
                com.bytedance.assem.arch.core.AssemSupervisor r0 = r0.bD_()
                com.bytedance.assem.arch.core.d r2 = r0.f30984f
                java.lang.Class<com.ss.android.ugc.aweme.profile.widgets.h.a.b> r1 = com.p2082ss.android.ugc.aweme.profile.widgets.p3594h.p3595a.C64871b.class
                java.lang.String r0 = r3.f146400b
                java.lang.Object r0 = r2.mo20606b(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.widgets.p3587e.C64668a.C64669a.invoke():java.lang.Object");
        }
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12748a
    /* renamed from: n */
    public final void mo20526n() {
        EnterpriseTransformLayout enterpriseTransformLayout = this.f146393j;
        if (enterpriseTransformLayout != null) {
            enterpriseTransformLayout.setHasShownDownloadLink(false);
        }
        EnterpriseTransformLayout enterpriseTransformLayout2 = this.f146393j;
        if (enterpriseTransformLayout2 != null) {
            enterpriseTransformLayout2.setIsVisibleToUser(false);
        }
        super.mo20526n();
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12748a
    /* renamed from: j */
    public final void mo20525j() {
        User user;
        String str;
        super.mo20525j();
        C64312w wVar = (C64312w) C12801d.m23029f(this, C89204ab.m154669a(AbstractC64313x.class));
        if (wVar != null && wVar.f145777e) {
            C64615i iVar = (C64615i) C12801d.m23029f(this, C89204ab.m154669a(AbstractC64616j.class));
            String str2 = null;
            if (iVar != null) {
                user = iVar.f146329a;
                if (user != null) {
                    str = user.getBioEmail();
                }
                str = null;
            } else {
                user = null;
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                C64314y.m116183a("personal_homepage", "email", user);
            }
            if (user != null) {
                str2 = user.getBioUrl();
            }
            if (!TextUtils.isEmpty(str2)) {
                C64314y.m116183a("personal_homepage", "weblink", user);
            }
        }
        EnterpriseTransformLayout enterpriseTransformLayout = this.f146393j;
        if (!(enterpriseTransformLayout == null || enterpriseTransformLayout.f144951h == null || enterpriseTransformLayout.f144956m)) {
            if (enterpriseTransformLayout.f144951h.getBizAccountInfo() != null && !TextUtils.isEmpty(enterpriseTransformLayout.f144951h.getBizAccountInfo().getAndroidDownloadAppLink())) {
                enterpriseTransformLayout.mo103482a();
            } else if (enterpriseTransformLayout.f144951h.getCommerceInfo() != null && !C13603b.m24435a((Collection) enterpriseTransformLayout.f144951h.getCommerceInfo().getOfflineInfoList())) {
                for (C37499j jVar : enterpriseTransformLayout.f144951h.getCommerceInfo().getOfflineInfoList()) {
                    if (jVar != null && jVar.getOfflineInfoType() == 2) {
                        enterpriseTransformLayout.mo103482a();
                    }
                }
            }
        }
        EnterpriseTransformLayout enterpriseTransformLayout2 = this.f146393j;
        if (enterpriseTransformLayout2 != null) {
            enterpriseTransformLayout2.setIsVisibleToUser(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.e.a$j */
    static final class View$OnClickListenerC64679j implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C64668a f146410a;

        /* renamed from: b */
        final /* synthetic */ User f146411b;

        static {
            Covode.recordClassIndex(76145);
        }

        View$OnClickListenerC64679j(C64668a aVar, User user) {
            this.f146410a = aVar;
            this.f146411b = user;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f146410a.mo104164a(this.f146411b);
            C64314y.m116180a("weblink", this.f146411b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.e.a$c */
    static final class View$OnClickListenerC64671c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C64668a f146401a;

        static {
            Covode.recordClassIndex(76137);
        }

        View$OnClickListenerC64671c(C64668a aVar) {
            this.f146401a = aVar;
        }

        public final void onClick(View view) {
            User user;
            ClickAgent.onClick(view);
            C64615i iVar = (C64615i) C12801d.m23029f(this.f146401a, C89204ab.m154669a(AbstractC64616j.class));
            if (iVar != null) {
                user = iVar.f146329a;
            } else {
                user = null;
            }
            this.f146401a.mo104164a(user);
            C64314y.m116180a("weblink", user);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.e.a$g */
    static final class C64675g extends AbstractC89220m implements AbstractC89172b<C12776a<? extends C89391z>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C64668a f146405a;

        static {
            Covode.recordClassIndex(76141);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64675g(C64668a aVar) {
            super(1);
            this.f146405a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C12776a<? extends C89391z> aVar) {
            if (aVar != null) {
                TextView textView = this.f146405a.f146396m;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                TextView textView2 = this.f146405a.f146397n;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
                TextView textView3 = this.f146405a.f146394k;
                if (textView3 != null) {
                    textView3.setVisibility(8);
                }
                View view = this.f146405a.f146395l;
                if (view != null) {
                    view.setVisibility(8);
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.e.a$i */
    static final class View$OnClickListenerC64677i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C64668a f146407a;

        /* renamed from: b */
        final /* synthetic */ User f146408b;

        static {
            Covode.recordClassIndex(76143);
        }

        View$OnClickListenerC64677i(C64668a aVar, User user) {
            this.f146407a = aVar;
            this.f146408b = user;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            Context az_ = this.f146407a.az_();
            if (az_ != null) {
                ((C23048e) new C23048e(az_).mo37479a(R.string.cvb).mo37483b(R.string.cv_)).mo37443a(R.string.cva, new DialogInterface$OnClickListenerC64678a(this)).mo37442a().mo37396b().show();
            }
            C64314y.m116180a("weblink", this.f146408b);
        }

        /* renamed from: com.ss.android.ugc.aweme.profile.widgets.e.a$i$a */
        static final class DialogInterface$OnClickListenerC64678a implements DialogInterface.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ View$OnClickListenerC64677i f146409a;

            static {
                Covode.recordClassIndex(76144);
            }

            DialogInterface$OnClickListenerC64678a(View$OnClickListenerC64677i iVar) {
                this.f146409a = iVar;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                ActivityC0945e b = C12777b.m23004b(this.f146409a.f146407a);
                if (b != null) {
                    C63867b.f144793a.switchToBioUrl(b, this.f146409a.f146408b.getBioUrl());
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.e.a$d */
    static final class C64672d extends AbstractC89220m implements AbstractC89172b<C12776a<? extends Boolean>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C64668a f146402a;

        static {
            Covode.recordClassIndex(76138);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64672d(C64668a aVar) {
            super(1);
            this.f146402a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C12776a<? extends Boolean> aVar) {
            User user;
            String str;
            C12776a<? extends Boolean> aVar2 = aVar;
            if (aVar2 != null) {
                C64668a aVar3 = this.f146402a;
                if (!aVar2.f31085a.booleanValue()) {
                    C64615i iVar = (C64615i) C12801d.m23029f(aVar3, C89204ab.m154669a(AbstractC64616j.class));
                    String str2 = null;
                    if (iVar != null) {
                        user = iVar.f146329a;
                        if (user != null) {
                            str = user.getBioEmail();
                        }
                        str = null;
                    } else {
                        user = null;
                        str = null;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        C64314y.m116183a("personal_homepage", "email", user);
                    }
                    if (user != null) {
                        str2 = user.getBioUrl();
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        C64314y.m116183a("personal_homepage", "weblink", user);
                    }
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.e.a$e */
    static final class View$OnClickListenerC64673e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C64668a f146403a;

        static {
            Covode.recordClassIndex(76139);
        }

        View$OnClickListenerC64673e(C64668a aVar) {
            this.f146403a = aVar;
        }

        public final void onClick(View view) {
            User user;
            ClickAgent.onClick(view);
            C64615i iVar = (C64615i) C12801d.m23029f(this.f146403a, C89204ab.m154669a(AbstractC64616j.class));
            if (iVar != null) {
                user = iVar.f146329a;
            } else {
                user = null;
            }
            C64668a aVar = this.f146403a;
            if (user != null) {
                String bioEmail = user.getBioEmail();
                C89219l.m154716b(bioEmail, "");
                if (!TextUtils.isEmpty(bioEmail)) {
                    Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("mailto:".concat(String.valueOf(bioEmail))));
                    try {
                        Context az_ = aVar.az_();
                        if (az_ != null) {
                            C84349a.m145093a(intent, az_);
                            az_.startActivity(intent);
                        }
                    } catch (Exception e) {
                        C51423a.m95792b("ProfileEnterpriseAssem", e.getMessage());
                    }
                }
            }
            C64314y.m116180a("email", user);
        }
    }

    /* renamed from: a */
    public final void mo104164a(User user) {
        String str;
        int i;
        Aweme aweme;
        if (user != null) {
            String bioSecureUrl = user.getBioSecureUrl();
            if (!TextUtils.isEmpty(bioSecureUrl)) {
                SmartRoute withParam = SmartRouter.buildRoute(az_(), "aweme://webview/").withParam(Uri.parse(bioSecureUrl));
                BioLinkReportConfig a = C63735a.m115265a();
                if (a == null || a.isBioLinkReportShow()) {
                    C64207ac acVar = (C64207ac) C12801d.m23029f(this, C89204ab.m154669a(AbstractC64206ab.class));
                    if (acVar == null || (aweme = acVar.f145632g) == null) {
                        str = null;
                    } else {
                        str = aweme.getAid();
                    }
                    withParam.withParam("aweme_id", str);
                    withParam.withParam("owner_id", user.getUid());
                    withParam.withParam("enter_from", "biolink_profile_page");
                    withParam.withParam("report_type", "bio_link");
                    BioLinkReportConfig a2 = C63735a.m115265a();
                    if (a2 != null) {
                        i = a2.getShowReportJumpTime();
                    } else {
                        i = 0;
                    }
                    withParam.withParam("page_depth_of_report_show", i);
                }
                withParam.open();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.e.a$h */
    static final class C64676h extends AbstractC89220m implements AbstractC89172b<C12776a<? extends Boolean>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C64668a f146406a;

        static {
            Covode.recordClassIndex(76142);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64676h(C64668a aVar) {
            super(1);
            this.f146406a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C12776a<? extends Boolean> aVar) {
            User user;
            String str;
            C12776a<? extends Boolean> aVar2 = aVar;
            if (aVar2 != null) {
                boolean booleanValue = aVar2.f31085a.booleanValue();
                Context az_ = this.f146406a.az_();
                String str2 = null;
                if (!(az_ instanceof Activity)) {
                    az_ = null;
                }
                Activity activity = (Activity) az_;
                if (activity != null) {
                    C34729o.m70953a(activity);
                    C64615i iVar = (C64615i) C12801d.m23029f(this.f146406a, C89204ab.m154669a(AbstractC64616j.class));
                    if (iVar != null) {
                        user = iVar.f146329a;
                    } else {
                        user = null;
                    }
                    if (booleanValue) {
                        C34729o.m70958b(activity);
                        if (user != null) {
                            str = user.getBioEmail();
                        } else {
                            str = null;
                        }
                        if (!TextUtils.isEmpty(str)) {
                            C64314y.m116183a("others_homepage", "email", user);
                        }
                        if (user != null) {
                            str2 = user.getBioUrl();
                        }
                        if (!TextUtils.isEmpty(str2)) {
                            C64314y.m116183a("others_homepage", "weblink", user);
                        }
                        EnterpriseTransformLayout enterpriseTransformLayout = this.f146406a.f146393j;
                        if (enterpriseTransformLayout != null) {
                            enterpriseTransformLayout.setIsVisibleToUser(true);
                        }
                    } else {
                        if (Build.VERSION.SDK_INT >= 23) {
                            Window window = activity.getWindow();
                            C89219l.m154716b(window, "");
                            View decorView = window.getDecorView();
                            C89219l.m154716b(decorView, "");
                            decorView.setSystemUiVisibility(1024);
                        }
                        EnterpriseTransformLayout enterpriseTransformLayout2 = this.f146406a.f146393j;
                        if (enterpriseTransformLayout2 != null) {
                            enterpriseTransformLayout2.setHasShownDownloadLink(false);
                        }
                        EnterpriseTransformLayout enterpriseTransformLayout3 = this.f146406a.f146393j;
                        if (enterpriseTransformLayout3 != null) {
                            enterpriseTransformLayout3.setIsVisibleToUser(false);
                        }
                    }
                }
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: b */
    public final void mo20630b(View view) {
        String str;
        String str2 = "";
        C89219l.m154721d(view, str2);
        this.f146396m = (TextView) view.findViewById(R.id.faf);
        EnterpriseTransformLayout enterpriseTransformLayout = (EnterpriseTransformLayout) view.findViewById(R.id.d9t);
        this.f146393j = enterpriseTransformLayout;
        if (enterpriseTransformLayout != null) {
            if (TextUtils.isEmpty(m116554w())) {
                str2 = m116554w();
            } else if (m116553v() == null) {
                str2 = null;
            } else {
                C64207ac acVar = (C64207ac) C12801d.m23029f(this, C89204ab.m154669a(AbstractC64206ab.class));
                if (!(acVar == null || (str = acVar.f145628c) == null)) {
                    str2 = str;
                }
            }
            enterpriseTransformLayout.setEnterFrom(str2);
        }
        TextView textView = this.f146396m;
        if (textView != null) {
            textView.setOnClickListener(new View$OnClickListenerC64671c(this));
        }
        this.f146394k = (TextView) view.findViewById(R.id.evo);
        this.f146395l = view.findViewById(R.id.c9p);
        this.f146397n = (TextView) view.findViewById(R.id.en0);
        TextView textView2 = this.f146394k;
        if (textView2 != null) {
            textView2.setOnClickListener(new View$OnClickListenerC64673e(this));
        }
        C12801d.m23020a(this, C89204ab.m154669a(AbstractC64616j.class), C64680b.f146412a, new C64674f(this));
        C12801d.m23020a(this, C89204ab.m154669a(AbstractC64206ab.class), C64681c.f146413a, new C64675g(this));
        C12801d.m23020a(this, C89204ab.m154669a(AbstractC64206ab.class), C64682d.f146414a, new C64676h(this));
        C12801d.m23020a(this, C89204ab.m154669a(AbstractC64313x.class), C64683e.f146415a, new C64672d(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.e.a$f */
    static final class C64674f extends AbstractC89220m implements AbstractC89172b<C12776a<? extends User>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C64668a f146404a;

        static {
            Covode.recordClassIndex(76140);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64674f(C64668a aVar) {
            super(1);
            this.f146404a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C12776a<? extends User> aVar) {
            T t;
            TextView textView;
            TextView textView2;
            TextView textView3;
            TextView textView4;
            TextView textView5;
            C12776a<? extends User> aVar2 = aVar;
            if (!(aVar2 == null || (t = aVar2.f31085a) == null || t.isBlock)) {
                C64668a aVar3 = this.f146404a;
                if (aVar3.az_() != null && aVar3.f31048h) {
                    if (TextUtils.isEmpty(t.getBioEmail()) || C80580in.m139685b(t, C80580in.m139694g(t)) || (EnterpriseTransformLayout.m115620a((User) t) && !TextUtils.isEmpty(t.getBioEmail()))) {
                        TextView textView6 = aVar3.f146394k;
                        if (textView6 != null) {
                            textView6.setVisibility(8);
                        }
                    } else {
                        TextView textView7 = aVar3.f146394k;
                        if (textView7 != null) {
                            textView7.setVisibility(0);
                        }
                    }
                    if (TextUtils.isEmpty(t.getBioUrl())) {
                        TextView textView8 = aVar3.f146396m;
                        if (textView8 != null) {
                            textView8.setVisibility(8);
                        }
                    } else {
                        TextView textView9 = aVar3.f146396m;
                        if (textView9 != null) {
                            textView9.setVisibility(0);
                        }
                        int i = Build.VERSION.SDK_INT;
                        TextView textView10 = aVar3.f146396m;
                        if (textView10 != null) {
                            textView10.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, 0, 0);
                        }
                        IAccountUserService g = C31575b.m65865g();
                        C89219l.m154716b(g, "");
                        if (!g.isLogin() || !C80580in.m139694g(t) || !TextUtils.isEmpty(t.getBioSecureUrl())) {
                            int i2 = Build.VERSION.SDK_INT;
                            TextView textView11 = aVar3.f146396m;
                            if (textView11 != null) {
                                textView11.setCompoundDrawablesRelativeWithIntrinsicBounds(2131233464, 0, 0, 0);
                            }
                            TextView textView12 = aVar3.f146396m;
                            if (textView12 != null) {
                                textView12.setCompoundDrawablePadding((int) C13628n.m24520b(aVar3.az_(), 4.0f));
                            }
                            TextView textView13 = aVar3.f146396m;
                            if (textView13 != null) {
                                textView13.setText(t.getBioUrl());
                            }
                            TextView textView14 = aVar3.f146396m;
                            if (textView14 != null) {
                                Context az_ = aVar3.az_();
                                if (az_ == null) {
                                    C89219l.m154715b();
                                }
                                textView14.setTextColor(C0643b.m2378c(az_, R.color.bx));
                            }
                            TextView textView15 = aVar3.f146396m;
                            if (textView15 != null) {
                                textView15.setOnClickListener(new View$OnClickListenerC64679j(aVar3, t));
                            }
                        } else {
                            int i3 = Build.VERSION.SDK_INT;
                            TextView textView16 = aVar3.f146396m;
                            if (textView16 != null) {
                                textView16.setCompoundDrawablesRelativeWithIntrinsicBounds(2131233365, 0, 0, 0);
                            }
                            TextView textView17 = aVar3.f146396m;
                            if (textView17 != null) {
                                textView17.setCompoundDrawablePadding((int) C13628n.m24520b(aVar3.az_(), 4.0f));
                            }
                            TextView textView18 = aVar3.f146396m;
                            if (textView18 != null) {
                                textView18.setText(R.string.cvb);
                            }
                            TextView textView19 = aVar3.f146396m;
                            if (textView19 != null) {
                                Context az_2 = aVar3.az_();
                                if (az_2 == null) {
                                    C89219l.m154715b();
                                }
                                textView19.setTextColor(C0643b.m2378c(az_2, R.color.ly));
                            }
                            TextView textView20 = aVar3.f146396m;
                            if (textView20 != null) {
                                textView20.setOnClickListener(new View$OnClickListenerC64677i(aVar3, t));
                            }
                        }
                    }
                    if (aVar3.f146395l != null) {
                        if (aVar3.f146394k == null || (textView4 = aVar3.f146394k) == null || textView4.getVisibility() != 0 || aVar3.f146396m == null || (textView5 = aVar3.f146396m) == null || textView5.getVisibility() != 0) {
                            View view = aVar3.f146395l;
                            if (view != null) {
                                view.setVisibility(8);
                            }
                        } else {
                            View view2 = aVar3.f146395l;
                            if (view2 != null) {
                                view2.setVisibility(0);
                            }
                        }
                    }
                    if (!C80580in.m139694g(t)) {
                        if (!(aVar3.f146394k == null || (textView3 = aVar3.f146394k) == null || textView3.getVisibility() != 0)) {
                            C64314y.m116183a("others_homepage", "email", (User) t);
                        }
                        if (!(aVar3.f146396m == null || (textView2 = aVar3.f146396m) == null || textView2.getVisibility() != 0)) {
                            C64314y.m116183a("others_homepage", "weblink", (User) t);
                        }
                    }
                }
                EnterpriseTransformLayout enterpriseTransformLayout = aVar3.f146393j;
                if (enterpriseTransformLayout != null) {
                    enterpriseTransformLayout.f144951h = t;
                    enterpriseTransformLayout.setVisibility(8);
                    enterpriseTransformLayout.f144944a.setVisibility(8);
                    enterpriseTransformLayout.f144945b.setVisibility(8);
                    enterpriseTransformLayout.f144946c.setVisibility(8);
                    enterpriseTransformLayout.f144947d.setVisibility(8);
                    enterpriseTransformLayout.f144951h = t;
                    enterpriseTransformLayout.f144953j = null;
                    ArrayList arrayList = new ArrayList();
                    if (EnterpriseTransformLayout.m115620a((User) t)) {
                        if (enterpriseTransformLayout.f144951h != null && !TextUtils.isEmpty(enterpriseTransformLayout.f144951h.getBioEmail())) {
                            String string = enterpriseTransformLayout.getResources().getString(R.string.bls);
                            String bioEmail = enterpriseTransformLayout.f144951h.getBioEmail();
                            EnterpriseTransformLayout.C63931a aVar4 = new EnterpriseTransformLayout.C63931a(enterpriseTransformLayout, (byte) 0);
                            aVar4.f144960b = string;
                            aVar4.f144959a = 1;
                            aVar4.f144961c = bioEmail;
                            arrayList.add(aVar4);
                        }
                        enterpriseTransformLayout.mo103484a(arrayList);
                    } else {
                        C37495f commerceInfo = t.getCommerceInfo();
                        if (!(commerceInfo == null || commerceInfo.getOfflineInfoList() == null)) {
                            for (C37499j jVar : commerceInfo.getOfflineInfoList()) {
                                arrayList.add(enterpriseTransformLayout.mo103481a(jVar));
                            }
                        }
                    }
                    if (!C13603b.m24435a((Collection) arrayList)) {
                        enterpriseTransformLayout.setVisibility(0);
                        if (arrayList.size() > 0) {
                            enterpriseTransformLayout.mo103483a(enterpriseTransformLayout.f144944a, arrayList.get(0), 0);
                            new Paint().setTextSize(enterpriseTransformLayout.f144944a.getTextSize());
                            if (arrayList.size() > 1) {
                                TextView textView21 = enterpriseTransformLayout.f144945b;
                                EnterpriseTransformLayout.C63931a aVar5 = arrayList.get(1);
                                if (!(textView21 == null || aVar5 == null)) {
                                    String str = aVar5.f144960b;
                                    if (!TextUtils.isEmpty(str)) {
                                        Paint paint = new Paint();
                                        paint.setTextSize(textView21.getTextSize());
                                        if (paint.measureText(str) > C13628n.m24520b(enterpriseTransformLayout.getContext(), 250.0f)) {
                                            textView = enterpriseTransformLayout.f144946c;
                                            enterpriseTransformLayout.mo103483a(textView, arrayList.get(1), 1);
                                        }
                                    }
                                }
                                textView = enterpriseTransformLayout.f144945b;
                                enterpriseTransformLayout.mo103483a(textView, arrayList.get(1), 1);
                            }
                        }
                        if (enterpriseTransformLayout.f144944a.getVisibility() == 0 && enterpriseTransformLayout.f144945b.getVisibility() == 0) {
                            EnterpriseTransformLayout.m115619a(enterpriseTransformLayout.f144945b, 0);
                            enterpriseTransformLayout.f144947d.setVisibility(0);
                        }
                    }
                }
            }
            return C89391z.f203057a;
        }
    }
}
