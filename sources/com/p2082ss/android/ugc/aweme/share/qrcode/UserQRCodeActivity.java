package com.p2082ss.android.ugc.aweme.share.qrcode;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.p1710c.C23005c;
import com.bytedance.tux.p1717e.C23073a;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.p2379ui.SmartAvatarBorderView;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.qrcode.C66416k;
import com.p2082ss.android.ugc.aweme.share.ShareDependService;
import com.p2082ss.android.ugc.aweme.share.improve.p3755a.C69011av;
import com.p2082ss.android.ugc.aweme.share.improve.p3758c.C69125c;
import com.p2082ss.android.ugc.aweme.share.improve.p3760e.C69190a;
import com.p2082ss.android.ugc.aweme.share.improve.p3761f.C69200d;
import com.p2082ss.android.ugc.aweme.share.p3748f.C68926c;
import com.p2082ss.android.ugc.aweme.share.p3754i.C68960a;
import com.p2082ss.android.ugc.aweme.share.qrcode.p3772a.C69389a;
import com.p2082ss.android.ugc.aweme.share.qrcode.p3773b.C69393a;
import com.p2082ss.android.ugc.aweme.share.qrcode.pkg.QRCodeSharePackage;
import com.p2082ss.android.ugc.aweme.share.qrcode.view.C69412a;
import com.p2082ss.android.ugc.aweme.share.qrcode.view.QRCodeBackgroundLayout;
import com.p2082ss.android.ugc.aweme.share.qrcode.view.QRCodeSquareView;
import com.p2082ss.android.ugc.aweme.share.qrcode.view.UserQRCodeControlView;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b;
import com.p2082ss.android.ugc.aweme.sharer.C69583c;
import com.p2082ss.android.ugc.aweme.sharer.C69584d;
import com.p2082ss.android.ugc.aweme.sharer.C69651l;
import com.p2082ss.android.ugc.aweme.sharer.p3779a.AbstractC69575a;
import com.p2082ss.android.ugc.aweme.sharer.p3779a.C69580d;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.C69684e;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80397em;
import com.p2082ss.android.ugc.aweme.utils.C80567ic;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.aweme.utils.C80630u;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p078c.p083d.C1762a;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.share.qrcode.UserQRCodeActivity */
public final class UserQRCodeActivity extends ActivityC17312a {

    /* renamed from: b */
    public static final C69361a f154943b = new C69361a((byte) 0);

    /* renamed from: a */
    final C69371j f154944a = new C69371j(this);

    /* renamed from: c */
    private View f154945c;

    /* renamed from: d */
    private ImageView f154946d;

    /* renamed from: e */
    private View f154947e;

    /* renamed from: f */
    private TextView f154948f;

    /* renamed from: g */
    private TextView f154949g;

    /* renamed from: h */
    private TextView f154950h;

    /* renamed from: i */
    private SmartAvatarBorderView f154951i;

    /* renamed from: j */
    private UserQRCodeControlView f154952j;

    /* renamed from: k */
    private FrameLayout f154953k;

    /* renamed from: l */
    private QRCodeSquareView f154954l;

    /* renamed from: m */
    private QRCodeBackgroundLayout f154955m;

    /* renamed from: n */
    private final C69363c f154956n = new C69363c(this);

    /* renamed from: o */
    private final View.OnClickListener f154957o = new View$OnClickListenerC69366f(this);

    /* renamed from: p */
    private final View.OnClickListener f154958p = new View$OnClickListenerC69367g(this);

    /* renamed from: q */
    private SparseArray f154959q;

    /* renamed from: com.ss.android.ugc.aweme.share.qrcode.UserQRCodeActivity$b */
    public interface AbstractC69362b {
        static {
            Covode.recordClassIndex(81695);
        }

        /* renamed from: a */
        void mo109630a(QRCodeSquareView qRCodeSquareView, QRCodeBackgroundLayout qRCodeBackgroundLayout, C69412a aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.share.qrcode.UserQRCodeActivity$d */
    static final class View$OnClickListenerC69364d implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC69364d f154961a = new View$OnClickListenerC69364d();

        static {
            Covode.recordClassIndex(81697);
        }

        View$OnClickListenerC69364d() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
        }
    }

    static {
        Covode.recordClassIndex(81693);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f154959q;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f154959q == null) {
            this.f154959q = new SparseArray();
        }
        View view = (View) this.f154959q.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f154959q.put(i, findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.share.qrcode.UserQRCodeActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.share.qrcode.UserQRCodeActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.share.qrcode.UserQRCodeActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.share.qrcode.UserQRCodeActivity$a */
    public static final class C69361a {
        static {
            Covode.recordClassIndex(81694);
        }

        private C69361a() {
        }

        public /* synthetic */ C69361a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.qrcode.UserQRCodeActivity$m */
    public static final class C69375m implements AbstractC69575a {

        /* renamed from: a */
        final /* synthetic */ UserQRCodeActivity f154978a;

        static {
            Covode.recordClassIndex(81708);
        }

        @Override // com.p2082ss.android.ugc.aweme.sharer.p3779a.AbstractC69575a
        /* renamed from: a */
        public final Activity mo81451a() {
            return this.f154978a;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C69375m(UserQRCodeActivity userQRCodeActivity) {
            this.f154978a = userQRCodeActivity;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.share.qrcode.UserQRCodeActivity$h */
    public static final class C69368h extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ UserQRCodeActivity f154965a;

        /* renamed from: b */
        final /* synthetic */ View f154966b;

        static {
            Covode.recordClassIndex(81701);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C69368h(UserQRCodeActivity userQRCodeActivity, View view) {
            super(0);
            this.f154965a = userQRCodeActivity;
            this.f154966b = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f154965a.mo109627a(new AbstractC69362b(this) {
                /* class com.p2082ss.android.ugc.aweme.share.qrcode.UserQRCodeActivity.C69368h.C693691 */

                /* renamed from: a */
                final /* synthetic */ C69368h f154967a;

                static {
                    Covode.recordClassIndex(81702);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f154967a = r1;
                }

                @Override // com.p2082ss.android.ugc.aweme.share.qrcode.UserQRCodeActivity.AbstractC69362b
                /* renamed from: a */
                public final void mo109630a(QRCodeSquareView qRCodeSquareView, QRCodeBackgroundLayout qRCodeBackgroundLayout, C69412a aVar) {
                    C89219l.m154721d(qRCodeSquareView, "");
                    C89219l.m154721d(qRCodeBackgroundLayout, "");
                    C89219l.m154721d(aVar, "");
                    Context baseContext = this.f154967a.f154965a.getBaseContext();
                    C89219l.m154716b(baseContext, "");
                    C69393a.C69394a.m122585a(baseContext, qRCodeSquareView, this.f154967a.f154966b, qRCodeBackgroundLayout, aVar, true, false, null);
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.qrcode.UserQRCodeActivity$i */
    public static final class C69370i implements C69412a.AbstractC69414b {

        /* renamed from: a */
        final /* synthetic */ QRCodeSquareView f154968a;

        /* renamed from: b */
        final /* synthetic */ C69412a f154969b;

        /* renamed from: c */
        final /* synthetic */ QRCodeBackgroundLayout f154970c;

        /* renamed from: d */
        final /* synthetic */ UserQRCodeActivity f154971d;

        /* renamed from: e */
        final /* synthetic */ AbstractC69362b f154972e;

        static {
            Covode.recordClassIndex(81703);
        }

        @Override // com.p2082ss.android.ugc.aweme.share.qrcode.view.C69412a.AbstractC69414b
        /* renamed from: a */
        public final void mo109637a() {
            this.f154972e.mo109630a(this.f154968a, this.f154970c, this.f154969b);
        }

        C69370i(QRCodeSquareView qRCodeSquareView, C69412a aVar, QRCodeBackgroundLayout qRCodeBackgroundLayout, UserQRCodeActivity userQRCodeActivity, AbstractC69362b bVar) {
            this.f154968a = qRCodeSquareView;
            this.f154969b = aVar;
            this.f154970c = qRCodeBackgroundLayout;
            this.f154971d = userQRCodeActivity;
            this.f154972e = bVar;
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStop() {
        C15477a.m28478d(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused2) {
            }
        }
    }

    /* renamed from: a */
    public final void mo109626a() {
        if (MSAdaptionService.m97895c().mo89375b((Context) this)) {
            Toast makeText = Toast.makeText(this, getString(R.string.bed), 0);
            if (Build.VERSION.SDK_INT == 25) {
                C80567ic.m139657a(makeText);
            }
            makeText.show();
            return;
        }
        C39162r.m79460a("qr_code_scan_enter", new C33744d().mo59983a("enter_from", "qr_code_detail").mo59983a("previous_page", "personal_homepage").f79943a);
        C66416k.f149319a.mo105291a((Context) this, false, true);
    }

    /* renamed from: com.ss.android.ugc.aweme.share.qrcode.UserQRCodeActivity$k */
    public static final class C69372k implements AbstractC69362b {

        /* renamed from: a */
        final /* synthetic */ Context f154974a;

        /* renamed from: b */
        final /* synthetic */ AbstractC69581b f154975b;

        static {
            Covode.recordClassIndex(81705);
        }

        /* renamed from: com.ss.android.ugc.aweme.share.qrcode.UserQRCodeActivity$k$a */
        public static final class C69373a implements C69393a.C69394a.AbstractC69395a {

            /* renamed from: a */
            final /* synthetic */ C69372k f154976a;

            static {
                Covode.recordClassIndex(81706);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C69373a(C69372k kVar) {
                this.f154976a = kVar;
            }

            @Override // com.p2082ss.android.ugc.aweme.share.qrcode.p3773b.C69393a.C69394a.AbstractC69395a
            /* renamed from: a */
            public final void mo109639a(Uri uri, String str, boolean z) {
                C69651l lVar;
                String str2 = "";
                if (z) {
                    if (str != null) {
                        lVar = new C69651l(C69125c.m122230a(str, C17867d.m33078a()), str, null, 60);
                    } else {
                        return;
                    }
                } else if (uri != null) {
                    String a = C1762a.m5918a(this.f154976a.f154974a, uri);
                    C89219l.m154716b(a, str2);
                    lVar = new C69651l(uri, a, null, 60);
                } else {
                    return;
                }
                AbstractC69581b bVar = this.f154976a.f154975b;
                String str3 = lVar.f155477g;
                if (str3 != null) {
                    str2 = str3;
                }
                lVar.mo109799a("content_url", str2);
                lVar.mo109799a("media_type", "image/png");
                bVar.mo109550a(lVar, this.f154976a.f154974a);
            }
        }

        C69372k(Context context, AbstractC69581b bVar) {
            this.f154974a = context;
            this.f154975b = bVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.share.qrcode.UserQRCodeActivity.AbstractC69362b
        /* renamed from: a */
        public final void mo109630a(QRCodeSquareView qRCodeSquareView, QRCodeBackgroundLayout qRCodeBackgroundLayout, C69412a aVar) {
            C89219l.m154721d(qRCodeSquareView, "");
            C89219l.m154721d(qRCodeBackgroundLayout, "");
            C89219l.m154721d(aVar, "");
            C69393a.C69394a.m122585a(this.f154974a, qRCodeSquareView, null, qRCodeBackgroundLayout, aVar, false, true, new C69373a(this));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.qrcode.UserQRCodeActivity$c */
    public static final class C69363c implements UserQRCodeControlView.AbstractC69408a {

        /* renamed from: a */
        final /* synthetic */ UserQRCodeActivity f154960a;

        static {
            Covode.recordClassIndex(81696);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C69363c(UserQRCodeActivity userQRCodeActivity) {
            this.f154960a = userQRCodeActivity;
        }

        @Override // com.p2082ss.android.ugc.aweme.share.qrcode.view.UserQRCodeControlView.AbstractC69408a
        /* renamed from: a */
        public final void mo109631a(View view) {
            C89219l.m154721d(view, "");
            this.f154960a.saveToDevice(view);
        }

        @Override // com.p2082ss.android.ugc.aweme.share.qrcode.view.UserQRCodeControlView.AbstractC69408a
        /* renamed from: b */
        public final void mo109633b(View view) {
            C89219l.m154721d(view, "");
            this.f154960a.mo109626a();
        }

        @Override // com.p2082ss.android.ugc.aweme.share.qrcode.view.UserQRCodeControlView.AbstractC69408a
        /* renamed from: a */
        public final void mo109632a(AbstractC69581b bVar) {
            C89219l.m154721d(bVar, "");
            if (bVar instanceof C69389a) {
                this.f154960a.saveToDevice(null);
                return;
            }
            UserQRCodeActivity userQRCodeActivity = this.f154960a;
            userQRCodeActivity.mo109628a(bVar, userQRCodeActivity);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.qrcode.UserQRCodeActivity$j */
    public static final class C69371j implements QRCodeSharePackage.AbstractC69396a {

        /* renamed from: a */
        final /* synthetic */ UserQRCodeActivity f154973a;

        static {
            Covode.recordClassIndex(81704);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C69371j(UserQRCodeActivity userQRCodeActivity) {
            this.f154973a = userQRCodeActivity;
        }

        @Override // com.p2082ss.android.ugc.aweme.share.qrcode.pkg.QRCodeSharePackage.AbstractC69396a
        /* renamed from: a */
        public final void mo109638a(AbstractC69581b bVar, Context context) {
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(context, "");
            if (bVar instanceof C69389a) {
                this.f154973a.saveToDevice(null);
            } else {
                this.f154973a.mo109628a(bVar, context);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.qrcode.UserQRCodeActivity$f */
    static final class View$OnClickListenerC69366f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ UserQRCodeActivity f154963a;

        static {
            Covode.recordClassIndex(81699);
        }

        View$OnClickListenerC69366f(UserQRCodeActivity userQRCodeActivity) {
            this.f154963a = userQRCodeActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f154963a.finish();
        }
    }

    public final void saveToDevice(View view) {
        C69011av.m121890a(this, new C69368h(this, view));
    }

    /* renamed from: com.ss.android.ugc.aweme.share.qrcode.UserQRCodeActivity$l */
    static final class C69374l extends AbstractC89220m implements AbstractC89172b<AbstractC69581b, Boolean> {

        /* renamed from: a */
        public static final C69374l f154977a = new C69374l();

        static {
            Covode.recordClassIndex(81707);
        }

        C69374l() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(AbstractC69581b bVar) {
            boolean z;
            AbstractC69581b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            if (C69190a.C69191a.m122288a().isEmpty() || C89219l.m154714a((Object) bVar2.mo109548a(), (Object) "download") || C89219l.m154714a((Object) bVar2.mo109548a(), (Object) "qr_code_save")) {
                z = true;
            } else {
                z = C69190a.C69191a.m122288a().contains(bVar2.mo109548a());
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.qrcode.UserQRCodeActivity$e */
    static final class C69365e extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        public static final C69365e f154962a = new C69365e();

        static {
            Covode.recordClassIndex(81698);
        }

        C69365e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            int i;
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            if (C68926c.m121627b()) {
                i = R.raw.icon_scan;
            } else {
                i = R.raw.icon_arrow_turn_up_right;
            }
            aVar2.f54431a = i;
            aVar2.f54435e = Integer.valueOf((int) R.attr.m);
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            aVar2.f54432b = C89241a.m154730a(TypedValue.applyDimension(1, 24.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            C89219l.m154709a((Object) system2, "");
            aVar2.f54433c = C89241a.m154730a(TypedValue.applyDimension(1, 24.0f, system2.getDisplayMetrics()));
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo109627a(AbstractC69362b bVar) {
        QRCodeSquareView qRCodeSquareView;
        QRCodeSquareView qRCodeSquareView2 = this.f154954l;
        if (qRCodeSquareView2 == null || qRCodeSquareView2.f155027b) {
            QRCodeBackgroundLayout qRCodeBackgroundLayout = this.f154955m;
            if (qRCodeBackgroundLayout != null && (qRCodeSquareView = this.f154954l) != null) {
                C69412a aVar = new C69412a(this, (byte) 0);
                aVar.setCallback(new C69370i(qRCodeSquareView, aVar, qRCodeBackgroundLayout, this, bVar));
                aVar.mo109662a(qRCodeSquareView.getQrCodeUrl());
                return;
            }
            return;
        }
        Context a = C17867d.m33078a();
        new C79459a(a).mo123052a(a.getString(R.string.bb4)).mo123053a();
    }

    /* renamed from: com.ss.android.ugc.aweme.share.qrcode.UserQRCodeActivity$g */
    static final class View$OnClickListenerC69367g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ UserQRCodeActivity f154964a;

        static {
            Covode.recordClassIndex(81700);
        }

        View$OnClickListenerC69367g(UserQRCodeActivity userQRCodeActivity) {
            this.f154964a = userQRCodeActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (C68926c.m121627b()) {
                this.f154964a.mo109626a();
                return;
            }
            UserQRCodeActivity userQRCodeActivity = this.f154964a;
            C69684e.C69686b bVar = new C69684e.C69686b();
            C69371j jVar = userQRCodeActivity.f154944a;
            C89219l.m154721d(jVar, "");
            QRCodeSharePackage qRCodeSharePackage = new QRCodeSharePackage(new SharePackage.C69654a().mo109803a("qr_code"));
            qRCodeSharePackage.f155007a = jVar;
            C69684e.C69686b a = bVar.mo109824a(qRCodeSharePackage);
            C69375m mVar = new C69375m(userQRCodeActivity);
            int a2 = C68926c.m121626a();
            if (a2 == 2 || a2 == 3) {
                a.mo109823a(new C69389a());
            }
            Drawable drawable = null;
            AbstractC69581b a3 = C69583c.m122807a("whatsapp", null);
            if (a3 != null) {
                drawable = a3.mo109547a(userQRCodeActivity.getBaseContext());
            }
            C69584d dVar = new C69584d("www.tiktokv.com", mVar, drawable, C17867d.m33078a().getString(R.string.cb5));
            C69583c.m122808a("snapchat", dVar, a);
            C69583c.m122808a("instagram", dVar, a);
            C69583c.m122808a("instagram_story", dVar, a);
            C69583c.m122808a("whatsapp_status", dVar, a);
            C69583c.m122808a("zalo", dVar, a);
            C69583c.m122808a("kakaotalk", dVar, a);
            if (C69580d.m122792a(userQRCodeActivity, "com.facebook.katana")) {
                C69583c.m122808a("facebook", dVar, a);
            }
            C69583c.m122808a("facebook_lite", dVar, a);
            C69583c.m122808a("messenger", dVar, a);
            C69583c.m122808a("messenger_lite", dVar, a);
            C69583c.m122808a("sms", dVar, a);
            C69583c.m122808a("twitter", dVar, a);
            C69583c.m122808a("viber", dVar, a);
            C69583c.m122808a("vk", dVar, a);
            C69583c.m122808a("whatsapp", dVar, a);
            C69583c.m122808a("line", dVar, a);
            C69583c.m122808a("email", dVar, a);
            C69583c.m122808a("imgur", dVar, a);
            C69583c.m122808a("kakao_story", dVar, a);
            C69583c.m122808a("naver_blog", dVar, a);
            C69583c.m122808a("more", dVar, a);
            C69200d.C69201a.m122303a();
            a.f155584o = false;
            a.f155579j = R.string.fr9;
            a.f155582m = R.string.a8y;
            a.f155574e = true;
            a.mo109832b(new C69200d()).mo109828a(C69374l.f154977a);
            ShareDependService.C68822a.m121324a().mo109326a(userQRCodeActivity, a.mo109831a(), R.style.wi).show();
            C39162r.m79460a("click_share_personal_qr_code", new C33744d().mo59983a("qr_code_type", "general").mo59983a("enter_from", "personal_homepage").f79943a);
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        User user;
        String str;
        float b;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.LayoutParams layoutParams3;
        String str2;
        User user2;
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.share.qrcode.UserQRCodeActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.ayk);
        this.f154945c = findViewById(R.id.dcm);
        this.f154946d = (ImageView) findViewById(R.id.dcn);
        this.f154947e = findViewById(R.id.dc9);
        this.f154948f = (TextView) findViewById(R.id.dcr);
        this.f154949g = (TextView) findViewById(R.id.dcd);
        this.f154950h = (TextView) findViewById(R.id.dck);
        this.f154951i = (SmartAvatarBorderView) findViewById(R.id.dcp);
        this.f154952j = (UserQRCodeControlView) findViewById(R.id.dc_);
        this.f154953k = (FrameLayout) findViewById(R.id.dce);
        this.f154954l = (QRCodeSquareView) findViewById(R.id.dcf);
        this.f154955m = (QRCodeBackgroundLayout) findViewById(R.id.dcq);
        View view = this.f154945c;
        if (view != null) {
            view.setOnClickListener(this.f154957o);
        }
        ImageView imageView = this.f154946d;
        if (imageView != null) {
            imageView.setOnClickListener(this.f154958p);
        }
        UserQRCodeControlView userQRCodeControlView = this.f154952j;
        if (userQRCodeControlView != null) {
            userQRCodeControlView.setCallback(this.f154956n);
        }
        QRCodeSquareView qRCodeSquareView = this.f154954l;
        ViewGroup.LayoutParams layoutParams4 = null;
        if (qRCodeSquareView != null) {
            IAccountUserService g = C31575b.m65865g();
            if (g != null) {
                user2 = g.getCurUser();
            } else {
                user2 = null;
            }
            qRCodeSquareView.mo109654a(4, C80580in.m139696i(user2), "personal_homepage");
        }
        View view2 = this.f154947e;
        if (view2 != null) {
            view2.setOnClickListener(View$OnClickListenerC69364d.f154961a);
        }
        ImageView imageView2 = this.f154946d;
        if (imageView2 != null) {
            imageView2.setImageDrawable(C23005c.m43393a(C69365e.f154962a).mo37368a(this));
        }
        C23073a.C23074a.m43508a(this).mo37493a().f54627a.mo33415d();
        IAccountUserService g2 = C31575b.m65865g();
        if (g2 != null) {
            user = g2.getCurUser();
        } else {
            user = null;
        }
        TextView textView = this.f154948f;
        if (textView != null) {
            if (user != null) {
                str2 = user.getNickname();
            } else {
                str2 = null;
            }
            textView.setText(str2);
        }
        SmartAvatarBorderView smartAvatarBorderView = this.f154951i;
        if (smartAvatarBorderView != null) {
            smartAvatarBorderView.setBorderColor(R.color.l);
        }
        SmartAvatarBorderView smartAvatarBorderView2 = this.f154951i;
        if (smartAvatarBorderView2 != null) {
            smartAvatarBorderView2.setBorderWidth(4);
        }
        StringBuilder sb = new StringBuilder("UserQRCodeActivity_");
        if (user == null || (str = user.getUid()) == null) {
            str = "no_uid";
        }
        String sb2 = sb.append(str).toString();
        int dimension = (int) getResources().getDimension(R.dimen.sl);
        SmartAvatarBorderView smartAvatarBorderView3 = this.f154951i;
        if (smartAvatarBorderView3 != null) {
            smartAvatarBorderView3.mo61310a(C80630u.m139797a(user), C80397em.m139369a(101), dimension, dimension, sb2);
        }
        int c = C13628n.m24522c(this, (float) C13628n.m24521b(this));
        if (c < 654) {
            View view3 = this.f154947e;
            if (view3 != null) {
                layoutParams = view3.getLayoutParams();
            } else {
                layoutParams = null;
            }
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = (int) C13628n.m24520b(this, 18.0f);
            View view4 = this.f154947e;
            if (view4 != null) {
                view4.setLayoutParams(marginLayoutParams);
            }
            int b2 = (int) C13628n.m24520b(this, 130.0f);
            FrameLayout frameLayout = this.f154953k;
            if (frameLayout != null) {
                layoutParams2 = frameLayout.getLayoutParams();
            } else {
                layoutParams2 = null;
            }
            Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            layoutParams2.width = b2;
            layoutParams2.height = b2;
            FrameLayout frameLayout2 = this.f154953k;
            if (frameLayout2 != null) {
                frameLayout2.setLayoutParams(layoutParams2);
            }
            int b3 = (int) C13628n.m24520b(this, 115.0f);
            QRCodeSquareView qRCodeSquareView2 = this.f154954l;
            if (qRCodeSquareView2 != null) {
                layoutParams3 = qRCodeSquareView2.getLayoutParams();
            } else {
                layoutParams3 = null;
            }
            Objects.requireNonNull(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            layoutParams3.width = b3;
            layoutParams3.height = b3;
            QRCodeSquareView qRCodeSquareView3 = this.f154954l;
            if (qRCodeSquareView3 != null) {
                qRCodeSquareView3.setLayoutParams(layoutParams3);
            }
        }
        if (C68926c.m121626a() != 4) {
            UserQRCodeControlView userQRCodeControlView2 = this.f154952j;
            if (userQRCodeControlView2 != null) {
                layoutParams4 = userQRCodeControlView2.getLayoutParams();
            }
            Objects.requireNonNull(layoutParams4, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams4;
            if (c < 700) {
                b = C13628n.m24520b(this, 20.0f);
            } else {
                b = C13628n.m24520b(this, 57.0f);
            }
            marginLayoutParams2.bottomMargin = (int) b;
            UserQRCodeControlView userQRCodeControlView3 = this.f154952j;
            if (userQRCodeControlView3 != null) {
                userQRCodeControlView3.setLayoutParams(marginLayoutParams2);
            }
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.share.qrcode.UserQRCodeActivity", "onCreate", false);
    }

    /* renamed from: a */
    public final void mo109628a(AbstractC69581b bVar, Context context) {
        C68960a.m121644a().mo109504a(bVar.mo109548a(), 0);
        mo109627a(new C69372k(context, bVar));
        C39162r.m79460a("share_personal_qr_code", new C33744d().mo59983a("qr_code_type", "general").mo59983a("enter_from", "personal_homepage").mo59983a("platform", bVar.mo109548a()).f79943a);
    }

    @Override // androidx.fragment.app.ActivityC0945e, androidx.core.app.C0569a.AbstractC0571a
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C89219l.m154721d(strArr, "");
        C89219l.m154721d(iArr, "");
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 1) {
            for (int i2 : iArr) {
                if (i2 == -1) {
                    Context baseContext = getBaseContext();
                    C89219l.m154716b(baseContext, "");
                    C69125c.m122233a(baseContext);
                    return;
                }
            }
            Context baseContext2 = getBaseContext();
            C89219l.m154716b(baseContext2, "");
            C69393a.C69394a.m122582a(baseContext2, (View) this.f154955m, this.f154954l, true, false, (C69393a.C69394a.AbstractC69395a) null);
        }
    }
}
