package com.p2082ss.android.ugc.aweme.account.agegate.activity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import androidx.core.content.C0643b;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.C36085cj;
import com.p2082ss.android.ugc.aweme.account.bean.AgeGateResponse;
import com.p2082ss.android.ugc.aweme.account.p2233a.p2235b.C31376a;
import com.p2082ss.android.ugc.aweme.account.view.DialogC33061a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.account.agegate.activity.DeleteAccountAlertActivity */
public final class DeleteAccountAlertActivity extends ActivityC17312a {

    /* renamed from: b */
    public static final C31391a f75182b = new C31391a((byte) 0);

    /* renamed from: a */
    AgeGateResponse f75183a;

    /* renamed from: c */
    private final AbstractC89244h f75184c = C89250i.m154773a((AbstractC89171a) new C31394d(this));

    /* renamed from: d */
    private HashMap f75185d;

    static {
        Covode.recordClassIndex(38100);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f75185d;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f75185d == null) {
            this.f75185d = new HashMap();
        }
        View view = (View) this.f75185d.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f75185d.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onBackPressed() {
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.DeleteAccountAlertActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.DeleteAccountAlertActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.DeleteAccountAlertActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.activity.DeleteAccountAlertActivity$a */
    public static final class C31391a {
        static {
            Covode.recordClassIndex(38101);
        }

        private C31391a() {
        }

        public /* synthetic */ C31391a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.activity.DeleteAccountAlertActivity$d */
    static final class C31394d extends AbstractC89220m implements AbstractC89171a<DialogC33061a> {

        /* renamed from: a */
        final /* synthetic */ DeleteAccountAlertActivity f75190a;

        static {
            Covode.recordClassIndex(38104);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31394d(DeleteAccountAlertActivity deleteAccountAlertActivity) {
            super(0);
            this.f75190a = deleteAccountAlertActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ DialogC33061a invoke() {
            DeleteAccountAlertActivity deleteAccountAlertActivity = this.f75190a;
            return new DialogC33061a(deleteAccountAlertActivity, deleteAccountAlertActivity.getString(R.string.a40));
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
    private final SpannableStringBuilder m65614a() {
        String string = getString(R.string.beg);
        C89219l.m154716b(string, "");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getString(R.string.bef, new Object[]{string}));
        List<Object> b = C89070n.m154522b(new C31392b(this, spannableStringBuilder, string), new ForegroundColorSpan(C0643b.m2378c(this, R.color.bx)), new StyleSpan(1));
        int a = C89361p.m154888a((CharSequence) spannableStringBuilder, string, 0, false, 6);
        int length = string.length() + a;
        List b2 = C89070n.m154522b(Integer.valueOf(a), Integer.valueOf(length));
        if (!(b2 instanceof Collection) || !b2.isEmpty()) {
            Iterator it = b2.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((Number) it.next()).intValue() < 0) {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        for (Object obj : b) {
            spannableStringBuilder.setSpan(obj, a, length, 18);
        }
        return spannableStringBuilder;
    }

    /* renamed from: a */
    private static Bundle m65613a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.activity.DeleteAccountAlertActivity$b */
    public static final class C31392b extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ DeleteAccountAlertActivity f75186a;

        /* renamed from: b */
        final /* synthetic */ SpannableStringBuilder f75187b;

        /* renamed from: c */
        final /* synthetic */ String f75188c;

        static {
            Covode.recordClassIndex(38102);
        }

        public final void updateDrawState(TextPaint textPaint) {
            C89219l.m154721d(textPaint, "");
            textPaint.setUnderlineText(false);
        }

        public final void onClick(View view) {
            C89219l.m154721d(view, "");
            SmartRouter.buildRoute(this.f75186a, "//webview").withParam("url", "https://www.tiktok.com/web-inapp/download-your-data?enter_from=banned&hide_nav_bar=1&banned=1").withParam("hide_nav_bar", true).open();
        }

        C31392b(DeleteAccountAlertActivity deleteAccountAlertActivity, SpannableStringBuilder spannableStringBuilder, String str) {
            this.f75186a = deleteAccountAlertActivity;
            this.f75187b = spannableStringBuilder;
            this.f75188c = str;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.activity.DeleteAccountAlertActivity$c */
    static final class View$OnClickListenerC31393c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DeleteAccountAlertActivity f75189a;

        static {
            Covode.recordClassIndex(38103);
        }

        View$OnClickListenerC31393c(DeleteAccountAlertActivity deleteAccountAlertActivity) {
            this.f75189a = deleteAccountAlertActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C39162r.m79460a("age_gate_click_next", new C31376a().f75156a);
            DeleteAccountAlertActivity deleteAccountAlertActivity = this.f75189a;
            SmartRouter.buildRoute(deleteAccountAlertActivity, "//account/video/deleted/alert").withParam("age_gate_response", deleteAccountAlertActivity.f75183a).withParam("enter_from", "from_delete_account").open();
            deleteAccountAlertActivity.finish();
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        Object obj;
        int i;
        Bundle a;
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.DeleteAccountAlertActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.fh);
        Intent intent = getIntent();
        if (intent == null || (a = m65613a(intent)) == null) {
            obj = null;
        } else {
            obj = m65615a(a, "age_gate_response");
        }
        this.f75183a = (AgeGateResponse) obj;
        TuxTextView tuxTextView = (TuxTextView) _$_findCachedViewById(R.id.acq);
        C89219l.m154716b(tuxTextView, "");
        String string = getString(R.string.a5o);
        C89219l.m154716b(string, "");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getString(R.string.a5n, new Object[]{string}));
        int a2 = C89361p.m154888a((CharSequence) spannableStringBuilder, string, 0, false, 6);
        int length = string.length() + a2;
        if (!(a2 == -1 || length == -1)) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(C0643b.m2378c(this, R.color.bx)), a2, length, 18);
            spannableStringBuilder.setSpan(new StyleSpan(1), a2, length, 18);
        }
        tuxTextView.setText(spannableStringBuilder);
        ((TuxTextView) _$_findCachedViewById(R.id.button)).setOnClickListener(new View$OnClickListenerC31393c(this));
        TuxTextView tuxTextView2 = (TuxTextView) _$_findCachedViewById(R.id.aof);
        tuxTextView2.setText(m65614a());
        tuxTextView2.setMovementMethod(LinkMovementMethod.getInstance());
        User f = C36085cj.m73552f();
        C89219l.m154716b(f, "");
        if ((new Date().getTime() - f.getAgeGateTime()) / 86400000 <= 20) {
            i = 0;
        } else {
            i = 8;
        }
        tuxTextView2.setVisibility(i);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.DeleteAccountAlertActivity", "onCreate", false);
    }

    /* renamed from: a */
    private static Object m65615a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }
}
