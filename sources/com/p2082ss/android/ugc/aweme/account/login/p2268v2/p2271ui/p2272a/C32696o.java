package com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.login.p2263h.C31940a;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.C32582d;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32592i;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.C32407x;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.C32775b;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.C32776c;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.C32780e;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.InputResultIndicator;
import com.p2082ss.android.ugc.aweme.account.login.recover.C32034f;
import com.p2082ss.android.ugc.aweme.account.p2233a.p2235b.C31376a;
import com.p2082ss.android.ugc.aweme.account.p2280ui.InputWithIndicator;
import com.p2082ss.android.ugc.aweme.account.p2280ui.LoadingButton;
import com.p2082ss.android.ugc.aweme.base.p2379ui.C34699o;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.HashMap;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.o */
public final class C32696o extends AbstractC32613a {

    /* renamed from: a */
    public EditText f77951a;

    /* renamed from: b */
    public C32034f.C32036b f77952b;

    /* renamed from: c */
    public String f77953c = "";

    /* renamed from: d */
    private boolean f77954d;

    /* renamed from: e */
    private String f77955e = "";

    /* renamed from: j */
    private HashMap f77956j;

    static {
        Covode.recordClassIndex(39475);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: c */
    public final View mo57434c(int i) {
        if (this.f77956j == null) {
            this.f77956j = new HashMap();
        }
        View view = (View) this.f77956j.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f77956j.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: d */
    public final int mo57435d() {
        return R.layout.hm;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: h */
    public final void mo57438h() {
        HashMap hashMap = this.f77956j;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo57438h();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        EditText editText = this.f77951a;
        if (editText == null) {
            C89219l.m154710a("passwordInput");
        }
        C32776c.m67375a(editText);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: r */
    public final void mo57459r() {
        ((LoadingButton) mo57434c(R.id.bod)).mo58777b(true);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: s */
    public final void mo57460s() {
        ((LoadingButton) mo57434c(R.id.bod)).mo58776a(true);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: p */
    public final C32775b mo57457p() {
        boolean z;
        if (this.f77954d || mo58458A() == EnumC32592i.RECOVER_ACCOUNT) {
            z = false;
        } else {
            z = true;
        }
        return new C32775b(" ", null, false, getString(R.string.aon), " ", false, "phone_login_enter_password_page", z, false, 1230);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.o$a */
    public static final class C32697a extends C34699o {

        /* renamed from: a */
        final /* synthetic */ C32696o f77957a;

        static {
            Covode.recordClassIndex(39476);
        }

        C32697a(C32696o oVar) {
            this.f77957a = oVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.C34699o
        public final void afterTextChanged(Editable editable) {
            LoadingButton loadingButton = (LoadingButton) this.f77957a.mo57434c(R.id.bod);
            if (loadingButton != null) {
                loadingButton.setEnabled(!C32776c.m67377b(C32696o.m67263a(this.f77957a)));
            }
            InputResultIndicator inputResultIndicator = (InputResultIndicator) this.f77957a.mo57434c(R.id.boo);
            if (inputResultIndicator != null) {
                inputResultIndicator.mo58481a();
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ EditText m67263a(C32696o oVar) {
        EditText editText = oVar.f77951a;
        if (editText == null) {
            C89219l.m154710a("passwordInput");
        }
        return editText;
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Serializable serializable;
        String str;
        super.onCreate(bundle);
        C39162r.m79460a("phone_login_enter_password", new C31376a().mo57399a("enter_method", mo58467x()).mo57399a("enter_type", mo58468y()).f75156a);
        Bundle arguments = getArguments();
        boolean z = false;
        if (arguments != null) {
            z = arguments.getBoolean("recover_mobile_code", false);
        }
        this.f77954d = z;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            serializable = arguments2.getSerializable("recover_account_data");
        } else {
            serializable = null;
        }
        this.f77952b = (C32034f.C32036b) serializable;
        Bundle arguments3 = getArguments();
        if (arguments3 == null || (str = arguments3.getString("gms_phone_pwd")) == null) {
            str = "";
        }
        this.f77953c = str;
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.o$b */
    static final class View$OnClickListenerC32698b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C32696o f77958a;

        static {
            Covode.recordClassIndex(39477);
        }

        View$OnClickListenerC32698b(C32696o oVar) {
            this.f77958a = oVar;
        }

        public final void onClick(View view) {
            boolean z;
            String str;
            ClickAgent.onClick(view);
            if (this.f77958a.mo58458A() == EnumC32592i.RECOVER_ACCOUNT) {
                C32696o oVar = this.f77958a;
                String obj = C32696o.m67263a(oVar).getText().toString();
                C32034f.C32036b bVar = this.f77958a.f77952b;
                if (bVar != null) {
                    str = bVar.getTicket();
                } else {
                    str = null;
                }
                C32407x.m66801a(oVar, "", obj, "phone", str).mo143251d(C326991.f77959a).mo143246c();
                return;
            }
            if (TextUtils.isEmpty(C32696o.m67263a(this.f77958a).getText().toString()) || !C89219l.m154714a((Object) C32696o.m67263a(this.f77958a).getText().toString(), (Object) this.f77958a.f77953c)) {
                z = false;
            } else {
                z = true;
            }
            C32696o oVar2 = this.f77958a;
            String a = C31940a.m66306a(C32582d.m67066b(oVar2));
            C89219l.m154716b(a, "");
            C32407x.m66803a(oVar2, a, C32696o.m67263a(this.f77958a).getText().toString(), "phone", z, (AbstractC89172b) null, 32).mo143246c();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b
    /* renamed from: a */
    public final void mo57442a(int i, String str) {
        C89219l.m154721d(str, "");
        InputResultIndicator inputResultIndicator = (InputResultIndicator) mo57434c(R.id.boo);
        if (inputResultIndicator != null) {
            inputResultIndicator.mo58482a(str);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        EditText editText = ((InputWithIndicator) mo57434c(R.id.bon)).getEditText();
        this.f77951a = editText;
        if (editText == null) {
            C89219l.m154710a("passwordInput");
        }
        editText.setHint(getString(R.string.d9d));
        editText.addTextChangedListener(new C32697a(this));
        if (mo58458A() == EnumC32592i.RECOVER_ACCOUNT) {
            z = true;
        } else {
            z = false;
        }
        View c = mo57434c(R.id.bob);
        C89219l.m154716b(c, "");
        C32775b bVar = this.f77799v;
        if (bVar == null) {
            C89219l.m154715b();
        }
        String str = bVar.f78110i;
        if (str == null) {
            C89219l.m154715b();
        }
        C32780e.m67379a(c, this, str, z);
        mo58495a(mo57434c(R.id.bod), new View$OnClickListenerC32698b(this));
        if (!TextUtils.isEmpty(this.f77953c)) {
            EditText editText2 = this.f77951a;
            if (editText2 == null) {
                C89219l.m154710a("passwordInput");
            }
            editText2.setText(this.f77953c);
            EditText editText3 = this.f77951a;
            if (editText3 == null) {
                C89219l.m154710a("passwordInput");
            }
            editText3.setSelection(this.f77953c.length());
        }
    }
}
