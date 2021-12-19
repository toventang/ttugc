package com.p2082ss.android.ugc.aweme.shoutouts;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.p1717e.C23073a;
import com.bytedance.tux.status.TuxStatusView;
import com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b;
import com.p2082ss.android.ugc.aweme.internal.ShoutOutServiceImpl;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.tools.C77804a;
import com.p2082ss.android.ugc.trill.R;
import java.util.Arrays;
import java.util.HashMap;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shoutouts.ShoutOutsEditSuccessActivity */
public final class ShoutOutsEditSuccessActivity extends ActivityC33402b {

    /* renamed from: d */
    private HashMap f167273d;

    static {
        Covode.recordClassIndex(87152);
    }

    @Override // com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b
    public final boolean cz_() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b
    /* renamed from: d_ */
    public final View mo59481d_(int i) {
        if (this.f167273d == null) {
            this.f167273d = new HashMap();
        }
        View view = (View) this.f167273d.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f167273d.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public final void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b
    public final void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shoutouts.ShoutOutsEditSuccessActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shoutouts.ShoutOutsEditSuccessActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shoutouts.ShoutOutsEditSuccessActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b
    public final void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
    }

    public final void finish() {
        super.finish();
        C77804a.m135921b(this, 3);
    }

    @Override // com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b
    /* renamed from: d */
    public final void mo59480d() {
        C23073a.C23074a.m43508a(this).mo37494a(R.color.l).mo37503d(R.color.l).mo37495a(true).f54627a.mo33415d();
    }

    @Override // androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b
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

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.ShoutOutsEditSuccessActivity$b */
    static final class View$OnClickListenerC74379b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ShoutOutsEditSuccessActivity f167276a;

        static {
            Covode.recordClassIndex(87155);
        }

        View$OnClickListenerC74379b(ShoutOutsEditSuccessActivity shoutOutsEditSuccessActivity) {
            this.f167276a = shoutOutsEditSuccessActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f167276a.finish();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.ShoutOutsEditSuccessActivity$a */
    static final class C74377a extends AbstractC89220m implements AbstractC89172b<TuxButton, C89391z> {

        /* renamed from: a */
        final /* synthetic */ ShoutOutsEditSuccessActivity f167274a;

        static {
            Covode.recordClassIndex(87153);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74377a(ShoutOutsEditSuccessActivity shoutOutsEditSuccessActivity) {
            super(1);
            this.f167274a = shoutOutsEditSuccessActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(TuxButton tuxButton) {
            TuxButton tuxButton2 = tuxButton;
            C89219l.m154721d(tuxButton2, "");
            tuxButton2.setButtonSize(3);
            tuxButton2.setText(this.f167274a.getString(R.string.fxe));
            tuxButton2.setOnClickListener(new View.OnClickListener(this) {
                /* class com.p2082ss.android.ugc.aweme.shoutouts.ShoutOutsEditSuccessActivity.C74377a.View$OnClickListenerC743781 */

                /* renamed from: a */
                final /* synthetic */ C74377a f167275a;

                static {
                    Covode.recordClassIndex(87154);
                }

                {
                    this.f167275a = r1;
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    SmartRouter.buildRoute(this.f167275a.f167274a, "//shoutouts/detail").withParam("enter_from", 1).open();
                    this.f167275a.f167274a.finish();
                }
            });
            return C89391z.f203057a;
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b
    public final void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shoutouts.ShoutOutsEditSuccessActivity", "onCreate", true);
        super.onCreate(bundle);
        boolean booleanExtra = getIntent().getBooleanExtra("shoutout_edit_price", false);
        boolean booleanExtra2 = getIntent().getBooleanExtra("shoutout_hide_button", false);
        ShoutOutServiceImpl.m103042b().mo93982a("shoutouts_edit_post_success_time_" + C63238c.f143594u.mo93904c(), System.currentTimeMillis());
        System.currentTimeMillis();
        String string = getString(R.string.cn9);
        String str = "";
        C89219l.m154716b(string, str);
        String string2 = getString(R.string.cn8);
        C89219l.m154716b(string2, str);
        String a = C1764a.m5928a(string2, Arrays.copyOf(new Object[]{AVExternalServiceImpl.m113114a().shoutOutsService().getShoutOutSettingsModel().mo117056a()}, 1));
        C89219l.m154716b(a, str);
        if (booleanExtra) {
            string = getString(R.string.fxg);
            C89219l.m154716b(string, str);
        } else {
            str = a;
        }
        setContentView(R.layout.b_);
        C77804a.m135920a(this, 3);
        TuxStatusView.C23263c b = new TuxStatusView.C23263c().mo37876a(0, 2131233834).mo37879a(string).mo37878a((CharSequence) str).mo37880b((int) C13628n.m24520b(this, 72.0f), (int) C13628n.m24520b(this, 72.0f));
        if (!booleanExtra2) {
            b.f55132j = new C74377a(this);
        }
        ((TuxStatusView) findViewById(R.id.e7i)).setStatus(b);
        findViewById(R.id.a6q).setOnClickListener(new View$OnClickListenerC74379b(this));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shoutouts.ShoutOutsEditSuccessActivity", "onCreate", false);
    }
}
