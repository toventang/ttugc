package com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.account.login.p2260e.C31915f;
import com.p2082ss.android.ugc.aweme.account.login.p2267ui.C32308a;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.C32407x;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.C32776c;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.InputResultIndicator;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.View$OnClickListenerC32647j;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.timer.TimerHolder;
import com.p2082ss.android.ugc.aweme.account.loginsetting.AbstractC32830a;
import com.p2082ss.android.ugc.aweme.account.loginsetting.C32833d;
import com.p2082ss.android.ugc.aweme.account.p2233a.p2235b.C31376a;
import com.p2082ss.android.ugc.aweme.account.p2280ui.CodeInputView;
import com.p2082ss.android.ugc.aweme.account.p2280ui.LoadingCircleView;
import com.p2082ss.android.ugc.aweme.account.p2280ui.TimerTextView;
import com.p2082ss.android.ugc.aweme.account.views.AbstractC33066c;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.m */
public abstract class AbstractView$OnClickListenerC32681m extends AbstractC32613a implements View.OnClickListener, CodeInputView.AbstractC32959a {

    /* renamed from: e */
    public static final C32682a f77925e = new C32682a((byte) 0);

    /* renamed from: a */
    private TimerHolder.C32597b f77926a;

    /* renamed from: b */
    private C32308a f77927b;

    /* renamed from: c */
    public C32680l f77928c;

    /* renamed from: d */
    public boolean f77929d;

    /* renamed from: j */
    private C31915f f77930j;

    /* renamed from: k */
    private boolean f77931k;

    /* renamed from: l */
    private boolean f77932l;

    /* renamed from: m */
    private boolean f77933m = true;

    /* renamed from: n */
    private final C32686e f77934n = new C32686e(this);

    /* renamed from: o */
    private HashMap f77935o;

    static {
        Covode.recordClassIndex(39460);
    }

    /* renamed from: a */
    public abstract void mo57581a(String str);

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: c */
    public View mo57434c(int i) {
        if (this.f77935o == null) {
            this.f77935o = new HashMap();
        }
        View view = (View) this.f77935o.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f77935o.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: d */
    public int mo57435d() {
        return R.layout.g5;
    }

    /* renamed from: e */
    public abstract C32680l mo57582e();

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: h */
    public void mo57438h() {
        HashMap hashMap = this.f77935o;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: i */
    public abstract void mo57583i();

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.m$a */
    public static final class C32682a {
        static {
            Covode.recordClassIndex(39461);
        }

        private C32682a() {
        }

        public /* synthetic */ C32682a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: s */
    public final void mo57460s() {
        mo58275l();
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.m$e */
    public static final class C32686e extends C32308a.C32310b {

        /* renamed from: a */
        final /* synthetic */ AbstractView$OnClickListenerC32681m f77939a;

        static {
            Covode.recordClassIndex(39465);
        }

        @Override // com.p2082ss.android.ugc.aweme.account.login.p2267ui.C32308a.C32310b, com.p2082ss.android.ugc.aweme.account.login.p2267ui.C32308a.AbstractC32309a
        /* renamed from: a */
        public final void mo58205a() {
            this.f77939a.mo58529n();
        }

        @Override // com.p2082ss.android.ugc.aweme.account.login.p2267ui.C32308a.C32310b, com.p2082ss.android.ugc.aweme.account.login.p2267ui.C32308a.AbstractC32309a
        /* renamed from: b */
        public final void mo58206b() {
            if (this.f77939a.af_()) {
                this.f77939a.mo58530o();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32686e(AbstractView$OnClickListenerC32681m mVar) {
            this.f77939a = mVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.account.login.p2267ui.C32308a.C32310b, com.p2082ss.android.ugc.aweme.account.login.p2267ui.C32308a.AbstractC32309a
        /* renamed from: a */
        public final void mo58389a(long j) {
            if (this.f77939a.af_()) {
                this.f77939a.mo58528a(j);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onDestroyView() {
        C31915f fVar = this.f77930j;
        if (fVar != null) {
            fVar.mo57852c();
        }
        super.onDestroyView();
        mo57438h();
    }

    /* renamed from: t */
    public final void mo58532t() {
        if (af_()) {
            mo57437g();
        } else {
            this.f77933m = true;
        }
    }

    /* renamed from: l */
    private void mo58275l() {
        LoadingCircleView loadingCircleView = (LoadingCircleView) mo57434c(R.id.bo0);
        C89219l.m154716b(loadingCircleView, "");
        loadingCircleView.setVisibility(0);
        ((LoadingCircleView) mo57434c(R.id.bo0)).mo58783a();
    }

    /* renamed from: E */
    public final void mo58527E() {
        C39162r.m79460a("auto_fill_sms_verification", new C31376a().mo57399a("enter_method", mo58467x()).f75156a);
    }

    /* renamed from: n */
    public final void mo58529n() {
        TimerTextView timerTextView = (TimerTextView) mo57434c(R.id.bo4);
        C89219l.m154716b(timerTextView, "");
        if (timerTextView.getVisibility() != 0) {
            TimerTextView timerTextView2 = (TimerTextView) mo57434c(R.id.bo4);
            C89219l.m154716b(timerTextView2, "");
            timerTextView2.setVisibility(0);
        }
        TuxTextView tuxTextView = (TuxTextView) mo57434c(R.id.bo1);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setEnabled(false);
    }

    /* renamed from: o */
    public final void mo58530o() {
        TimerTextView timerTextView = (TimerTextView) mo57434c(R.id.bo4);
        C89219l.m154716b(timerTextView, "");
        if (timerTextView.getVisibility() != 8) {
            TimerTextView timerTextView2 = (TimerTextView) mo57434c(R.id.bo4);
            C89219l.m154716b(timerTextView2, "");
            timerTextView2.setVisibility(8);
        }
        TuxTextView tuxTextView = (TuxTextView) mo57434c(R.id.bo1);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setEnabled(true);
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        C32680l lVar = this.f77928c;
        if (lVar == null) {
            C89219l.m154710a("config");
        }
        if (lVar.f77924f) {
            CodeInputView codeInputView = (CodeInputView) mo57434c(R.id.bo5);
            C89219l.m154716b(codeInputView, "");
            C32776c.m67375a(codeInputView);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: r */
    public final void mo57459r() {
        CodeInputView codeInputView = (CodeInputView) mo57434c(R.id.bo5);
        C89219l.m154716b(codeInputView, "");
        codeInputView.setEnabled(true);
        LoadingCircleView loadingCircleView = (LoadingCircleView) mo57434c(R.id.bo0);
        C89219l.m154716b(loadingCircleView, "");
        loadingCircleView.setVisibility(8);
        ((LoadingCircleView) mo57434c(R.id.bo0)).mo58784b();
    }

    /* renamed from: g */
    private final void mo57437g() {
        TuxTextView tuxTextView = (TuxTextView) mo57434c(R.id.bo1);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setEnabled(false);
        ((TimerTextView) mo57434c(R.id.bo4)).setCallback(this.f77934n);
        C32308a c = ((TimerTextView) mo57434c(R.id.bo4)).mo58808c();
        ActivityC0945e activity = getActivity();
        C32680l lVar = this.f77928c;
        if (lVar == null) {
            C89219l.m154710a("config");
        }
        TimerHolder.C32596a.m67089a(activity, lVar.mo58525a(), new TimerHolder.C32597b(c), mo58458A());
        C32680l lVar2 = this.f77928c;
        if (lVar2 == null) {
            C89219l.m154710a("config");
        }
        if (lVar2.f77920b) {
            C32680l lVar3 = this.f77928c;
            if (lVar3 == null) {
                C89219l.m154710a("config");
            }
            if (C89219l.m154714a((Object) lVar3.f77921c, (Object) true)) {
                mo58274k();
            }
        }
    }

    /* renamed from: k */
    private final void mo58274k() {
        HashMap<String, Boolean> a = View$OnClickListenerC32647j.C32648a.m67220a();
        C32680l lVar = this.f77928c;
        if (lVar == null) {
            C89219l.m154710a("config");
        }
        if (a.containsKey(lVar.mo58525a())) {
            HashMap<String, Boolean> a2 = View$OnClickListenerC32647j.C32648a.m67220a();
            C32680l lVar2 = this.f77928c;
            if (lVar2 == null) {
                C89219l.m154710a("config");
            }
            if (a2.get(lVar2.mo58525a()) != null) {
                HashMap<String, Boolean> a3 = View$OnClickListenerC32647j.C32648a.m67220a();
                C32680l lVar3 = this.f77928c;
                if (lVar3 == null) {
                    C89219l.m154710a("config");
                }
                Boolean bool = a3.get(lVar3.mo58525a());
                if (bool == null) {
                    C89219l.m154715b();
                }
                this.f77929d = bool.booleanValue();
                return;
            }
        }
        C32680l lVar4 = this.f77928c;
        if (lVar4 == null) {
            C89219l.m154710a("config");
        }
        C32833d.m67400a(lVar4.mo58525a(), new C32683b(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.m$b */
    public static final class C32683b implements AbstractC32830a {

        /* renamed from: a */
        final /* synthetic */ AbstractView$OnClickListenerC32681m f77936a;

        static {
            Covode.recordClassIndex(39462);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32683b(AbstractView$OnClickListenerC32681m mVar) {
            this.f77936a = mVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.account.loginsetting.AbstractC32830a
        /* renamed from: a */
        public final void mo58523a(boolean z) {
            HashMap<String, Boolean> a = View$OnClickListenerC32647j.C32648a.m67220a();
            C32680l lVar = this.f77936a.f77928c;
            if (lVar == null) {
                C89219l.m154710a("config");
            }
            a.put(lVar.mo58525a(), Boolean.valueOf(z));
            this.f77936a.f77929d = z;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.m$c */
    static final class C32684c<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ AbstractView$OnClickListenerC32681m f77937a;

        static {
            Covode.recordClassIndex(39463);
        }

        C32684c(AbstractView$OnClickListenerC32681m mVar) {
            this.f77937a = mVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            ((CodeInputView) this.f77937a.mo57434c(R.id.bo5)).setTextAndAutoCheck((String) obj);
            this.f77937a.mo58527E();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.m$d */
    public static final class C32685d extends AbstractC33066c {

        /* renamed from: a */
        final /* synthetic */ AbstractView$OnClickListenerC32681m f77938a;

        static {
            Covode.recordClassIndex(39464);
        }

        public final void onClick(View view) {
            C89219l.m154721d(view, "");
            if (!C58001a.m104815a(view, 1200) && this.f77938a.mo58493C()) {
                this.f77938a.onClick(view);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32685d(AbstractView$OnClickListenerC32681m mVar, int i, int i2) {
            super(i, i2);
            this.f77938a = mVar;
        }
    }

    /* renamed from: a */
    public final void mo58528a(long j) {
        if (this.f77929d && j <= 50000) {
            TuxTextView tuxTextView = (TuxTextView) mo57434c(R.id.bo6);
            C89219l.m154716b(tuxTextView, "");
            if (tuxTextView.getVisibility() != 0) {
                TuxTextView tuxTextView2 = (TuxTextView) mo57434c(R.id.bo6);
                C89219l.m154716b(tuxTextView2, "");
                tuxTextView2.setVisibility(0);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.p2280ui.CodeInputView.AbstractC32959a
    /* renamed from: a_ */
    public final void mo58199a_(String str) {
        C89219l.m154721d(str, "");
        CodeInputView codeInputView = (CodeInputView) mo57434c(R.id.bo5);
        C89219l.m154716b(codeInputView, "");
        C32680l lVar = this.f77928c;
        if (lVar == null) {
            C89219l.m154710a("config");
        }
        codeInputView.setEnabled(!lVar.f77923e);
        this.f77932l = false;
        mo57581a(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.p2280ui.CodeInputView.AbstractC32959a
    /* renamed from: b */
    public final void mo58201b(String str) {
        C89219l.m154721d(str, "");
        if (af_()) {
            if (this.f77932l) {
                ((CodeInputView) mo57434c(R.id.bo5)).setText("");
                this.f77932l = false;
            }
            ((InputResultIndicator) mo57434c(R.id.bny)).mo58481a();
            ((CodeInputView) mo57434c(R.id.bo5)).mo58743d();
        }
    }

    public void onClick(View view) {
        Integer valueOf;
        ClickAgent.onClick(view);
        if (view != null && (valueOf = Integer.valueOf(view.getId())) != null) {
            if (valueOf.intValue() == R.id.bo1) {
                mo57583i();
            } else if (valueOf.intValue() == R.id.bo6 && this.f77929d) {
                this.f77931k = true;
                C32680l lVar = this.f77928c;
                if (lVar == null) {
                    C89219l.m154710a("config");
                }
                C32407x.m66808b(this, lVar.mo58525a(), mo58458A(), mo58460Z_(), "user_click").mo143246c();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C32680l e = mo57582e();
        this.f77928c = e;
        if (e == null) {
            C89219l.m154710a("config");
        }
        this.f77933m = e.f77922d;
        C32680l lVar = this.f77928c;
        if (lVar == null) {
            C89219l.m154710a("config");
        }
        if (lVar.f77920b) {
            if (this.f77930j == null) {
                Context context = getContext();
                if (context == null) {
                    C89219l.m154715b();
                }
                this.f77930j = new C31915f(context);
            }
            C31915f fVar = this.f77930j;
            if (fVar == null) {
                C89219l.m154715b();
            }
            fVar.mo57851b();
            C31915f fVar2 = this.f77930j;
            if (fVar2 == null) {
                C89219l.m154715b();
            }
            fVar2.mo57850a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b
    /* renamed from: a */
    public final void mo57442a(int i, String str) {
        String str2;
        C89219l.m154721d(str, "");
        if (!this.f77931k || i != 1206) {
            this.f77932l = true;
            CodeInputView codeInputView = (CodeInputView) mo57434c(R.id.bo5);
            C89219l.m154716b(codeInputView, "");
            codeInputView.setEnabled(true);
            ((CodeInputView) mo57434c(R.id.bo5)).mo58742c();
            ((InputResultIndicator) mo57434c(R.id.bny)).mo58482a(str);
            return;
        }
        this.f77931k = false;
        C17197a.C17200a aVar = new C17197a.C17200a(getContext());
        Context context = getContext();
        if (context != null) {
            str2 = context.getString(R.string.aql);
        } else {
            str2 = null;
        }
        aVar.f41070a = str2;
        aVar.mo27190a(R.string.as_, (DialogInterface.OnClickListener) null, false).mo27193a().mo27185c().setCancelable(false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01e6  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01eb  */
    /* JADX WARNING: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onViewCreated(android.view.View r12, android.os.Bundle r13) {
        /*
        // Method dump skipped, instructions count: 517
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
