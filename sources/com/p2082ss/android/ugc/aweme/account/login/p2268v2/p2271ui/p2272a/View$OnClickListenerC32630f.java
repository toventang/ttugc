package com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import com.bytedance.analytics.page.AbstractC2599d;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.login.AbstractC32818x;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.C32582d;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32592i;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32594j;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.C32407x;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.AbstractC32779d;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.AccountKeyBoardHelper;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.C32775b;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.C32776c;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.InputResultIndicator;
import com.p2082ss.android.ugc.aweme.account.login.recover.C32034f;
import com.p2082ss.android.ugc.aweme.account.p2274n.C32847a;
import com.p2082ss.android.ugc.aweme.account.p2280ui.LoadingButton;
import com.p2082ss.android.ugc.aweme.account.util.C33038h;
import com.p2082ss.android.ugc.aweme.base.p2379ui.C34699o;
import com.p2082ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p2082ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.HashMap;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.f */
public final class View$OnClickListenerC32630f extends AbstractC32613a implements View.OnClickListener, AbstractC2599d, AbstractC32779d, AbstractC32818x {

    /* renamed from: k */
    public static final C32631a f77827k = new C32631a((byte) 0);

    /* renamed from: a */
    public EditText f77828a;

    /* renamed from: b */
    public EditText f77829b;

    /* renamed from: c */
    public boolean f77830c;

    /* renamed from: d */
    public C32034f.C32036b f77831d;

    /* renamed from: e */
    String f77832e = "";

    /* renamed from: j */
    String f77833j = "";

    /* renamed from: l */
    private boolean f77834l;

    /* renamed from: m */
    private String f77835m = "";

    /* renamed from: n */
    private boolean f77836n = true;

    /* renamed from: o */
    private HashMap f77837o;

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.f$b */
    static final class C32632b<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C32632b f77838a = new C32632b();

        static {
            Covode.recordClassIndex(39411);
        }

        C32632b() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(39409);
    }

    @Override // com.bytedance.analytics.page.AbstractC2599d
    public final String ah_() {
        return "PhoneEmailLoginStep";
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: c */
    public final View mo57434c(int i) {
        if (this.f77837o == null) {
            this.f77837o = new HashMap();
        }
        View view = (View) this.f77837o.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f77837o.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: d */
    public final int mo57435d() {
        return R.layout.hi;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: h */
    public final void mo57438h() {
        HashMap hashMap = this.f77837o;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.f$a */
    public static final class C32631a {
        static {
            Covode.recordClassIndex(39410);
        }

        private C32631a() {
        }

        public /* synthetic */ C32631a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.AbstractC32818x
    /* renamed from: a */
    public final boolean mo57964a() {
        return this.f77836n;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.f77834l) {
            m67164g();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: r */
    public final void mo57459r() {
        LoadingButton loadingButton = (LoadingButton) mo57434c(R.id.ati);
        if (loadingButton != null) {
            loadingButton.mo58777b(true);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: s */
    public final void mo57460s() {
        LoadingButton loadingButton = (LoadingButton) mo57434c(R.id.ati);
        if (loadingButton != null) {
            loadingButton.mo58776a(true);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.AbstractC32779d
    /* renamed from: e */
    public final String mo57965e() {
        EditText editText = this.f77828a;
        if (editText == null) {
            C89219l.m154710a("emailInput");
        }
        return editText.getText().toString();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        EditText editText = this.f77828a;
        if (editText == null) {
            C89219l.m154710a("emailInput");
        }
        KeyboardUtils.m70897c(editText);
        EditText editText2 = this.f77829b;
        if (editText2 == null) {
            C89219l.m154710a("passwordInput");
        }
        KeyboardUtils.m70897c(editText2);
        mo57438h();
    }

    /* renamed from: g */
    private final void m67164g() {
        EditText editText;
        EditText editText2 = this.f77828a;
        if (editText2 == null) {
            C89219l.m154710a("emailInput");
        }
        if (C32776c.m67377b(editText2)) {
            editText = this.f77828a;
            if (editText == null) {
                C89219l.m154710a("emailInput");
            }
        } else {
            editText = this.f77829b;
            if (editText == null) {
                C89219l.m154710a("passwordInput");
            }
        }
        if (AccountKeyBoardHelper.C32598a.m67091a()) {
            C32776c.m67375a(editText);
        } else {
            editText.requestFocus();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: p */
    public final C32775b mo57457p() {
        if (this.f77834l) {
            return new C32775b(getString(R.string.anz), null, false, getString(R.string.apl), getString(R.string.apk), false, "email_sign_up_to_login_enter_password_page", false, true, 718);
        }
        return new C32775b(null, null, false, null, null, false, "email_login_homepage", false, true, 767);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.f$c */
    public static final class C32633c extends C34699o {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC32630f f77839a;

        static {
            Covode.recordClassIndex(39412);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32633c(View$OnClickListenerC32630f fVar) {
            this.f77839a = fVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x0066  */
        /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
        @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.C34699o
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void afterTextChanged(android.text.Editable r4) {
            /*
            // Method dump skipped, instructions count: 108
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.View$OnClickListenerC32630f.C32633c.afterTextChanged(android.text.Editable):void");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (!z) {
            return;
        }
        if (af_()) {
            m67164g();
        } else {
            this.f77830c = true;
        }
    }

    public final void onClick(View view) {
        boolean z;
        Boolean bool;
        ClickAgent.onClick(view);
        boolean z2 = false;
        this.f77836n = false;
        C32847a.m67442a(getContext());
        EditText editText = this.f77828a;
        if (editText == null) {
            C89219l.m154710a("emailInput");
        }
        String obj = editText.getText().toString();
        EditText editText2 = this.f77829b;
        if (editText2 == null) {
            C89219l.m154710a("passwordInput");
        }
        String obj2 = editText2.getText().toString();
        if (TextUtils.isEmpty(obj) || TextUtils.isEmpty(obj2) || !C89219l.m154714a((Object) obj, (Object) this.f77832e) || !C89219l.m154714a((Object) obj2, (Object) this.f77833j)) {
            z = false;
        } else {
            z = true;
        }
        boolean a = C33038h.m67672a(obj);
        String str = null;
        if (getArguments() != null) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                bool = Boolean.valueOf(arguments.getBoolean("email_should_add_email", false));
            } else {
                bool = null;
            }
        } else {
            bool = false;
        }
        C32034f.C32036b bVar = this.f77831d;
        if (bVar != null) {
            z2 = bVar.getSafe();
        }
        String str2 = "email";
        if (mo58458A() == EnumC32592i.RECOVER_ACCOUNT) {
            if (bool == null) {
                C89219l.m154715b();
            }
            if (bool.booleanValue() && z2) {
                if (!a) {
                    str2 = "handle";
                }
                C32034f.C32036b bVar2 = this.f77831d;
                if (bVar2 != null) {
                    str = bVar2.getTicket();
                }
                C32407x.m66801a(this, obj, obj2, str2, str).mo143251d(C32632b.f77838a).mo143246c();
                return;
            }
        }
        if (!a) {
            str2 = "handle";
        }
        C32407x.m66803a(this, obj, obj2, str2, z, (AbstractC89172b) null, 32).mo143246c();
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        boolean z;
        C32034f.C32036b bVar;
        Serializable serializable;
        super.onCreate(bundle);
        Boolean bool = null;
        if (mo58458A() == EnumC32592i.RECOVER_ACCOUNT) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                serializable = arguments.getSerializable("recover_account_data");
            } else {
                serializable = null;
            }
            this.f77831d = (C32034f.C32036b) serializable;
        }
        boolean z2 = false;
        if (mo58460Z_() == EnumC32594j.EMAIL_PASSWORD_LOGIN) {
            z = true;
        } else {
            z = false;
        }
        this.f77834l = z;
        if (z) {
            this.f77835m = C32582d.m67060a(this);
            return;
        }
        if (getArguments() != null) {
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                bool = Boolean.valueOf(arguments2.getBoolean("email_should_add_email", false));
            }
        } else {
            bool = false;
        }
        C32034f.C32036b bVar2 = this.f77831d;
        if (bVar2 != null) {
            z2 = bVar2.getSafe();
        }
        if (mo58458A() == EnumC32592i.RECOVER_ACCOUNT) {
            if (bool == null) {
                C89219l.m154715b();
            }
            if (bool.booleanValue()) {
                if (z2 && (bVar = this.f77831d) != null && bVar.getEmail() != null) {
                    C32034f.C32036b bVar3 = this.f77831d;
                    if (bVar3 == null) {
                        C89219l.m154715b();
                    }
                    this.f77835m = String.valueOf(bVar3.getEmail());
                    return;
                }
                return;
            }
        }
        Bundle arguments3 = getArguments();
        if (arguments3 == null) {
            C89219l.m154715b();
        }
        String string = arguments3.getString("auto_fill_account_name", "");
        C89219l.m154716b(string, "");
        this.f77835m = string;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b
    /* renamed from: a */
    public final void mo57442a(int i, String str) {
        InputResultIndicator inputResultIndicator;
        C89219l.m154721d(str, "");
        View c = mo57434c(R.id.ath);
        if (!(c == null || (inputResultIndicator = (InputResultIndicator) c.findViewById(R.id.boo)) == null)) {
            inputResultIndicator.f77765a.setVisibility(0);
            inputResultIndicator.f77765a.setBackgroundColor(inputResultIndicator.f77767c);
            inputResultIndicator.f77766b.setVisibility(8);
        }
        InputResultIndicator inputResultIndicator2 = (InputResultIndicator) mo57434c(R.id.atk);
        if (inputResultIndicator2 != null) {
            inputResultIndicator2.mo58482a(str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00e8, code lost:
        if (r7 != false) goto L_0x00ea;
     */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r10, android.os.Bundle r11) {
        /*
        // Method dump skipped, instructions count: 348
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.View$OnClickListenerC32630f.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
