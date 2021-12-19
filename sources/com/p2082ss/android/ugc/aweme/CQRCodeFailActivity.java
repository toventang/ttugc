package com.p2082ss.android.ugc.aweme;

import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.core.content.C0643b;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.navigation.p1723a.C23187b;
import com.bytedance.tux.navigation.p1723a.C23194g;
import com.bytedance.tux.status.TuxStatusView;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.CQRCodeFailActivity */
public final class CQRCodeFailActivity extends ActivityC17312a {

    /* renamed from: a */
    public static final C31264a f74945a = new C31264a((byte) 0);

    /* renamed from: b */
    private SparseArray f74946b;

    static {
        Covode.recordClassIndex(37916);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f74946b;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f74946b == null) {
            this.f74946b = new SparseArray();
        }
        View view = (View) this.f74946b.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f74946b.put(i, findViewById);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.CQRCodeFailActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.CQRCodeFailActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.CQRCodeFailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.CQRCodeFailActivity$a */
    public static final class C31264a {
        static {
            Covode.recordClassIndex(37917);
        }

        private C31264a() {
        }

        public /* synthetic */ C31264a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.CQRCodeFailActivity$c */
    static final class C31267c extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ CQRCodeFailActivity f74949a;

        static {
            Covode.recordClassIndex(37920);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31267c(CQRCodeFailActivity cQRCodeFailActivity) {
            super(0);
            this.f74949a = cQRCodeFailActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C39162r.onEventV3("deeplink_preview_error_toast_click");
            this.f74949a.finish();
            return C89391z.f203057a;
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

    /* renamed from: com.ss.android.ugc.aweme.CQRCodeFailActivity$b */
    static final class C31265b extends AbstractC89220m implements AbstractC89172b<TuxButton, C89391z> {

        /* renamed from: a */
        final /* synthetic */ CQRCodeFailActivity f74947a;

        static {
            Covode.recordClassIndex(37918);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31265b(CQRCodeFailActivity cQRCodeFailActivity) {
            super(1);
            this.f74947a = cQRCodeFailActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(TuxButton tuxButton) {
            TuxButton tuxButton2 = tuxButton;
            C89219l.m154721d(tuxButton2, "");
            tuxButton2.setText(this.f74947a.getString(R.string.fcp));
            tuxButton2.setTextColor(C0643b.m2378c(this.f74947a, R.color.a9));
            tuxButton2.setButtonVariant(0);
            tuxButton2.setButtonSize(3);
            tuxButton2.setOnClickListener(new View.OnClickListener(this) {
                /* class com.p2082ss.android.ugc.aweme.CQRCodeFailActivity.C31265b.View$OnClickListenerC312661 */

                /* renamed from: a */
                final /* synthetic */ C31265b f74948a;

                static {
                    Covode.recordClassIndex(37919);
                }

                {
                    this.f74948a = r1;
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    C39162r.onEventV3("deeplink_preview_error_toast_click");
                    this.f74948a.f74947a.finish();
                }
            });
            return C89391z.f203057a;
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.CQRCodeFailActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.c0);
        TuxStatusView.C23263c a = new TuxStatusView.C23263c().mo37876a(0, R.drawable.bc3);
        String string = getString(R.string.fcr);
        C89219l.m154716b(string, "");
        TuxStatusView.C23263c a2 = a.mo37879a(string);
        String string2 = getString(R.string.fcq);
        C89219l.m154716b(string2, "");
        TuxStatusView.C23263c a3 = a2.mo37878a((CharSequence) string2);
        a3.f55132j = new C31265b(this);
        ((TuxStatusView) _$_findCachedViewById(R.id.e7i)).setStatus(a3);
        TuxNavBar.C23179a aVar = new TuxNavBar.C23179a();
        C23187b a4 = new C23187b().mo37738a(R.raw.icon_chevron_left_offset_ltr);
        a4.f54930b = true;
        TuxNavBar.C23179a a5 = aVar.mo37732a(a4.mo37741a((AbstractC89171a<C89391z>) new C31267c(this)));
        C23194g gVar = new C23194g();
        String string3 = getString(R.string.fcs);
        C89219l.m154716b(string3, "");
        ((TuxNavBar) _$_findCachedViewById(R.id.eiz)).setNavActions(a5.mo37731a(gVar.mo37753a(string3)));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.CQRCodeFailActivity", "onCreate", false);
    }
}
