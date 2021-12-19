package com.p2082ss.android.ugc.aweme.account.login.recover;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1777x.p1780c.C23697c;
import com.p2082ss.android.ugc.aweme.account.C31685i;
import com.p2082ss.android.ugc.aweme.account.login.AbstractC32818x;
import com.p2082ss.android.ugc.aweme.account.login.p2260e.C31910a;
import com.p2082ss.android.ugc.aweme.account.login.p2263h.C31940a;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32592i;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32594j;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.C32407x;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.C32775b;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.C32776c;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.InputResultIndicator;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a;
import com.p2082ss.android.ugc.aweme.account.login.recover.p2264a.C32004b;
import com.p2082ss.android.ugc.aweme.account.login.recover.p2264a.p2266b.C32007a;
import com.p2082ss.android.ugc.aweme.account.login.recover.p2264a.p2266b.C32008b;
import com.p2082ss.android.ugc.aweme.account.login.recover.p2264a.p2266b.C32009c;
import com.p2082ss.android.ugc.aweme.account.p2233a.p2235b.C31376a;
import com.p2082ss.android.ugc.aweme.account.p2280ui.LoadingButton;
import com.p2082ss.android.ugc.aweme.account.p2280ui.PhoneInputView;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.recover.c */
public final class C32024c extends AbstractC32613a implements AbstractC32818x {

    /* renamed from: j */
    public static final C32025a f76441j = new C32025a((byte) 0);

    /* renamed from: a */
    public boolean f76442a;

    /* renamed from: b */
    public C32007a f76443b;

    /* renamed from: c */
    boolean f76444c;

    /* renamed from: d */
    boolean f76445d;

    /* renamed from: e */
    public String f76446e;

    /* renamed from: k */
    private boolean f76447k = true;

    /* renamed from: l */
    private boolean f76448l;

    /* renamed from: m */
    private boolean f76449m;

    /* renamed from: n */
    private final AbstractC89244h f76450n = C89250i.m154773a((AbstractC89171a) new C32030e(this));

    /* renamed from: o */
    private HashMap f76451o;

    static {
        Covode.recordClassIndex(38779);
    }

    /* renamed from: e */
    private final C31910a m66415e() {
        return (C31910a) this.f76450n.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: c */
    public final View mo57434c(int i) {
        if (this.f76451o == null) {
            this.f76451o = new HashMap();
        }
        View view = (View) this.f76451o.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f76451o.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: d */
    public final int mo57435d() {
        return R.layout.gc;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: h */
    public final void mo57438h() {
        HashMap hashMap = this.f76451o;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo57438h();
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.recover.c$a */
    public static final class C32025a {
        static {
            Covode.recordClassIndex(38780);
        }

        private C32025a() {
        }

        public /* synthetic */ C32025a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.AbstractC32818x
    /* renamed from: a */
    public final boolean mo57964a() {
        return this.f76447k;
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.recover.c$e */
    static final class C32030e extends AbstractC89220m implements AbstractC89171a<C31910a> {

        /* renamed from: a */
        final /* synthetic */ C32024c f76456a;

        static {
            Covode.recordClassIndex(38785);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32030e(C32024c cVar) {
            super(0);
            this.f76456a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C31910a invoke() {
            C32024c cVar = this.f76456a;
            return new C31910a(cVar, cVar.mo58467x());
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        m66415e().mo57846b();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: r */
    public final void mo57459r() {
        ((LoadingButton) mo57434c(R.id.d1g)).mo58777b(true);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: s */
    public final void mo57460s() {
        ((LoadingButton) mo57434c(R.id.d1g)).mo58776a(true);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: p */
    public final C32775b mo57457p() {
        return new C32775b(null, null, false, null, null, true, null, false, false, 1358);
    }

    /* renamed from: g */
    private final void m66416g() {
        if (((PhoneInputView) mo57434c(R.id.d1i)).getPhoneNumber() <= 0 && !this.f76449m) {
            m66415e().mo57845a(((PhoneInputView) mo57434c(R.id.d1i)).getEditText());
        }
        this.f76449m = true;
        C32776c.m67375a(((PhoneInputView) mo57434c(R.id.d1i)).getInputView().getEditText());
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.recover.c$d */
    public static final class C32029d extends C31685i {

        /* renamed from: a */
        final /* synthetic */ C32024c f76455a;

        static {
            Covode.recordClassIndex(38784);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32029d(C32024c cVar) {
            this.f76455a = cVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.account.C31685i
        public final void afterTextChanged(Editable editable) {
            String obj;
            InputResultIndicator inputResultIndicator = (InputResultIndicator) this.f76455a.mo57434c(R.id.d1h);
            if (inputResultIndicator != null) {
                inputResultIndicator.mo58481a();
            }
            LoadingButton loadingButton = (LoadingButton) this.f76455a.mo57434c(R.id.d1g);
            C89219l.m154716b(loadingButton, "");
            boolean z = false;
            if (!(editable == null || (obj = editable.toString()) == null || obj.length() <= 0)) {
                z = true;
            }
            loadingButton.setEnabled(z);
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m66415e().mo57843a();
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (!z) {
            return;
        }
        if (af_()) {
            m66416g();
        } else {
            this.f76448l = true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.recover.c$f */
    static final class C32031f<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C32024c f76457a;

        static {
            Covode.recordClassIndex(38786);
        }

        C32031f(C32024c cVar) {
            this.f76457a = cVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C32009c cVar = (C32009c) obj;
            if (cVar != null) {
                this.f76457a.f76442a = cVar.f76420j;
                String str = cVar.f76421k;
                if (this.f76457a.f76446e != null) {
                    C32024c cVar2 = this.f76457a;
                    String str2 = cVar2.f76446e;
                    if (str2 == null) {
                        C89219l.m154715b();
                    }
                    C32407x.m66810b(cVar2, str2, str, EnumC32592i.RECOVER_ACCOUNT, EnumC32594j.PHONE_EMAIL_USERNAME_RECOVER).mo143251d(new C32026b(cVar2)).mo143246c();
                }
                if (this.f76457a.f76446e == null) {
                    C32024c cVar3 = this.f76457a;
                    String string = cVar3.getString(R.string.f8p);
                    C89219l.m154716b(string, "");
                    cVar3.mo57442a(0, string);
                    return;
                }
                return;
            }
            C32024c cVar4 = this.f76457a;
            String string2 = cVar4.getString(R.string.f8p);
            C89219l.m154716b(string2, "");
            cVar4.mo57442a(0, string2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.recover.c$c */
    static final class View$OnClickListenerC32027c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C32024c f76453a;

        static {
            Covode.recordClassIndex(38782);
        }

        View$OnClickListenerC32027c(C32024c cVar) {
            this.f76453a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C32024c cVar = this.f76453a;
            cVar.f76444c = false;
            cVar.f76445d = false;
            cVar.f76443b = null;
            cVar.f76442a = false;
            if (!C31940a.m66308a(((PhoneInputView) this.f76453a.mo57434c(R.id.d1i)).getCountryCodeString(), ((PhoneInputView) this.f76453a.mo57434c(R.id.d1i)).getPhoneNumberString())) {
                String x = this.f76453a.mo58467x();
                C89219l.m154716b(x, "");
                C89219l.m154721d(x, "");
                C39162r.m79460a("login_click_next_result", new C31376a().mo57399a("platform", "phone").mo57399a("enter_method", x).mo57397a("is_success", 0).mo57397a("is_register", 0).f75156a);
                C32024c cVar2 = this.f76453a;
                String string = cVar2.getString(R.string.aqb);
                C89219l.m154716b(string, "");
                cVar2.mo57442a(0, string);
                return;
            }
            C32407x.m66786a(this.f76453a, new C32004b.C32006b(0, C13627m.m24501c(((PhoneInputView) this.f76453a.mo57434c(R.id.d1i)).getCountryCodeString()), C13627m.m24501c(((PhoneInputView) this.f76453a.mo57434c(R.id.d1i)).getPhoneNumberString()), null, null), EnumC32592i.RECOVER_ACCOUNT, EnumC32594j.PHONE_EMAIL_USERNAME_RECOVER, "phone").mo143251d(new AbstractC88433f(this) {
                /* class com.p2082ss.android.ugc.aweme.account.login.recover.C32024c.View$OnClickListenerC32027c.C320281 */

                /* renamed from: a */
                final /* synthetic */ View$OnClickListenerC32027c f76454a;

                static {
                    Covode.recordClassIndex(38783);
                }

                {
                    this.f76454a = r1;
                }

                @Override // p4560f.p4561a.p4567d.AbstractC88433f
                public final /* synthetic */ void accept(Object obj) {
                    int i;
                    C32008b bVar = (C32008b) obj;
                    if (bVar != null) {
                        if (bVar.f76419j == null || C23697c.m44781a(bVar.f76419j)) {
                            C32024c cVar = this.f76454a.f76453a;
                            String string = this.f76454a.f76453a.getString(R.string.f8p);
                            C89219l.m154716b(string, "");
                            cVar.mo57442a(0, string);
                        } else {
                            this.f76454a.f76453a.f76446e = bVar.f76419j;
                            C32024c cVar2 = this.f76454a.f76453a;
                            String str = bVar.f76419j;
                            if (str == null) {
                                C89219l.m154715b();
                            }
                            C32407x.m66791a(cVar2, str, EnumC32592i.RECOVER_ACCOUNT, EnumC32594j.PHONE_EMAIL_USERNAME_RECOVER).mo143251d(new C32031f(cVar2)).mo143246c();
                            i = 1;
                            C39162r.m79460a("find_account_check_result", new C31376a().mo57399a("platform", "phone").mo57397a("status", i).mo57397a("aid", 1180).mo57397a("error_code", 0).f75156a);
                        }
                    }
                    i = 0;
                    if (bVar == null) {
                        C32024c cVar3 = this.f76454a.f76453a;
                        String string2 = this.f76454a.f76453a.getString(R.string.f8p);
                        C89219l.m154716b(string2, "");
                        cVar3.mo57442a(0, string2);
                    }
                    C39162r.m79460a("find_account_check_result", new C31376a().mo57399a("platform", "phone").mo57397a("status", i).mo57397a("aid", 1180).mo57397a("error_code", 0).f75156a);
                }
            }).mo143246c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.recover.c$b */
    static final class C32026b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C32024c f76452a;

        static {
            Covode.recordClassIndex(38781);
        }

        C32026b(C32024c cVar) {
            this.f76452a = cVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:0x003b, code lost:
            if (r0.f52754m != false) goto L_0x003d;
         */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void accept(java.lang.Object r16) {
            /*
            // Method dump skipped, instructions count: 340
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.account.login.recover.C32024c.C32026b.accept(java.lang.Object):void");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b
    /* renamed from: a */
    public final void mo57442a(int i, String str) {
        C89219l.m154721d(str, "");
        ((InputResultIndicator) mo57434c(R.id.d1h)).mo58482a(str);
        ((LoadingButton) mo57434c(R.id.d1g)).mo58777b(true);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        mo58495a(mo57434c(R.id.d1g), new View$OnClickListenerC32027c(this));
        ((PhoneInputView) mo57434c(R.id.d1i)).getInputView().setTextWatcher(new C32029d(this));
        if (((PhoneInputView) mo57434c(R.id.d1i)).getCountryCodeString().length() == 0 && ((PhoneInputView) mo57434c(R.id.d1i)).getCountryName().length() == 0) {
            ((PhoneInputView) mo57434c(R.id.d1i)).mo58790a();
        }
        if (this.f76448l) {
            m66416g();
            this.f76448l = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        m66415e().mo57844a(i, i2, intent);
    }
}
