package com.p2082ss.android.ugc.aweme.account.login.recover;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.login.AbstractC32818x;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32592i;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32594j;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.C32407x;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.AbstractC32779d;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.AccountKeyBoardHelper;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.C32775b;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.C32776c;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.InputResultIndicator;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a;
import com.p2082ss.android.ugc.aweme.account.login.recover.p2264a.C32004b;
import com.p2082ss.android.ugc.aweme.account.login.recover.p2264a.p2266b.C32007a;
import com.p2082ss.android.ugc.aweme.account.login.recover.p2264a.p2266b.C32009c;
import com.p2082ss.android.ugc.aweme.account.p2274n.C32847a;
import com.p2082ss.android.ugc.aweme.account.p2280ui.InputWithIndicator;
import com.p2082ss.android.ugc.aweme.account.p2280ui.LoadingButton;
import com.p2082ss.android.ugc.aweme.account.util.C33038h;
import com.p2082ss.android.ugc.aweme.base.p2379ui.C34699o;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.recover.a */
public final class View$OnClickListenerC31993a extends AbstractC32613a implements View.OnClickListener, AbstractC32779d, AbstractC32818x {

    /* renamed from: j */
    public static final C31994a f76389j = new C31994a((byte) 0);

    /* renamed from: a */
    public EditText f76390a;

    /* renamed from: b */
    public boolean f76391b;

    /* renamed from: c */
    public boolean f76392c;

    /* renamed from: d */
    public C32007a f76393d;

    /* renamed from: e */
    public String f76394e;

    /* renamed from: k */
    private String f76395k = "";

    /* renamed from: l */
    private boolean f76396l = true;

    /* renamed from: m */
    private boolean f76397m;

    /* renamed from: n */
    private boolean f76398n;

    /* renamed from: o */
    private HashMap f76399o;

    static {
        Covode.recordClassIndex(38748);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: c */
    public final View mo57434c(int i) {
        if (this.f76399o == null) {
            this.f76399o = new HashMap();
        }
        View view = (View) this.f76399o.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f76399o.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: d */
    public final int mo57435d() {
        return R.layout.g6;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: h */
    public final void mo57438h() {
        HashMap hashMap = this.f76399o;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo57438h();
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.recover.a$a */
    public static final class C31994a {
        static {
            Covode.recordClassIndex(38749);
        }

        private C31994a() {
        }

        public /* synthetic */ C31994a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.AbstractC32818x
    /* renamed from: a */
    public final boolean mo57964a() {
        return this.f76396l;
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

    /* renamed from: g */
    private final void m66369g() {
        if (AccountKeyBoardHelper.C32598a.m67091a()) {
            EditText editText = this.f76390a;
            if (editText == null) {
                C89219l.m154710a("emailInput");
            }
            C32776c.m67375a(editText);
            return;
        }
        EditText editText2 = this.f76390a;
        if (editText2 == null) {
            C89219l.m154710a("emailInput");
        }
        editText2.requestFocus();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.AbstractC32779d
    /* renamed from: e */
    public final String mo57965e() {
        EditText editText = this.f76390a;
        if (editText == null) {
            C89219l.m154710a("emailInput");
        }
        return editText.getText().toString();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: p */
    public final C32775b mo57457p() {
        return new C32775b(null, null, false, null, null, false, null, false, true, 462);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.recover.a$d */
    public static final class C31997d extends C34699o {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC31993a f76404a;

        static {
            Covode.recordClassIndex(38752);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31997d(View$OnClickListenerC31993a aVar) {
            this.f76404a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.C34699o
        public final void afterTextChanged(Editable editable) {
            super.afterTextChanged(editable);
            if (this.f76404a.af_()) {
                LoadingButton loadingButton = (LoadingButton) this.f76404a.mo57434c(R.id.ati);
                C89219l.m154716b(loadingButton, "");
                loadingButton.setEnabled(!C32776c.m67377b(View$OnClickListenerC31993a.m66368a(this.f76404a)));
                View c = this.f76404a.mo57434c(R.id.ath);
                C89219l.m154716b(c, "");
                ((InputResultIndicator) c.findViewById(R.id.boo)).mo58481a();
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ EditText m66368a(View$OnClickListenerC31993a aVar) {
        EditText editText = aVar.f76390a;
        if (editText == null) {
            C89219l.m154710a("emailInput");
        }
        return editText;
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (!z) {
            return;
        }
        if (af_()) {
            m66369g();
        } else {
            this.f76391b = true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.recover.a$e */
    static final class C31998e<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC31993a f76405a;

        /* renamed from: b */
        final /* synthetic */ boolean f76406b;

        static {
            Covode.recordClassIndex(38753);
        }

        C31998e(View$OnClickListenerC31993a aVar, boolean z) {
            this.f76405a = aVar;
            this.f76406b = z;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C32009c cVar = (C32009c) obj;
            if (cVar != null) {
                this.f76405a.f76392c = cVar.f76420j;
                String str = cVar.f76421k;
                if (this.f76405a.f76394e != null) {
                    View$OnClickListenerC31993a aVar = this.f76405a;
                    String str2 = aVar.f76394e;
                    if (str2 == null) {
                        C89219l.m154715b();
                    }
                    C32407x.m66810b(aVar, str2, str, EnumC32592i.RECOVER_ACCOUNT, EnumC32594j.PHONE_EMAIL_USERNAME_RECOVER).mo143251d(new C31996c(aVar, this.f76406b)).mo143246c();
                }
                if (this.f76405a.f76394e != null) {
                    return;
                }
                if (this.f76406b) {
                    View$OnClickListenerC31993a aVar2 = this.f76405a;
                    String string = aVar2.getString(R.string.f8o);
                    C89219l.m154716b(string, "");
                    aVar2.mo57442a(0, string);
                    return;
                }
                View$OnClickListenerC31993a aVar3 = this.f76405a;
                String string2 = aVar3.getString(R.string.f8q);
                C89219l.m154716b(string2, "");
                aVar3.mo57442a(0, string2);
            } else if (this.f76406b) {
                View$OnClickListenerC31993a aVar4 = this.f76405a;
                String string3 = aVar4.getString(R.string.f8o);
                C89219l.m154716b(string3, "");
                aVar4.mo57442a(0, string3);
            } else {
                View$OnClickListenerC31993a aVar5 = this.f76405a;
                String string4 = aVar5.getString(R.string.f8q);
                C89219l.m154716b(string4, "");
                aVar5.mo57442a(0, string4);
            }
        }
    }

    public final void onClick(View view) {
        int i;
        String str;
        ClickAgent.onClick(view);
        this.f76397m = false;
        this.f76398n = false;
        String str2 = null;
        this.f76393d = null;
        this.f76392c = false;
        this.f76396l = false;
        C32847a.m67442a(getContext());
        EditText editText = this.f76390a;
        if (editText == null) {
            C89219l.m154710a("emailInput");
        }
        String obj = editText.getText().toString();
        boolean a = C33038h.m67672a(obj);
        if (a) {
            i = 4;
        } else {
            i = 1;
            str2 = obj;
            obj = null;
        }
        C32004b.C32006b bVar = new C32004b.C32006b(i, null, null, C13627m.m24501c(str2), C13627m.m24501c(obj));
        EnumC32592i iVar = EnumC32592i.RECOVER_ACCOUNT;
        EnumC32594j jVar = EnumC32594j.PHONE_EMAIL_USERNAME_RECOVER;
        if (a) {
            str = "email";
        } else {
            str = "username";
        }
        C32407x.m66786a(this, bVar, iVar, jVar, str).mo143251d(new C31995b(this, a)).mo143246c();
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.recover.a$b */
    static final class C31995b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC31993a f76400a;

        /* renamed from: b */
        final /* synthetic */ boolean f76401b;

        static {
            Covode.recordClassIndex(38750);
        }

        C31995b(View$OnClickListenerC31993a aVar, boolean z) {
            this.f76400a = aVar;
            this.f76401b = z;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0048  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0064  */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void accept(java.lang.Object r8) {
            /*
            // Method dump skipped, instructions count: 165
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.account.login.recover.View$OnClickListenerC31993a.C31995b.accept(java.lang.Object):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.recover.a$c */
    static final class C31996c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC31993a f76402a;

        /* renamed from: b */
        final /* synthetic */ boolean f76403b;

        static {
            Covode.recordClassIndex(38751);
        }

        C31996c(View$OnClickListenerC31993a aVar, boolean z) {
            this.f76402a = aVar;
            this.f76403b = z;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0037, code lost:
            if (r0.f52754m != false) goto L_0x0039;
         */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void accept(java.lang.Object r15) {
            /*
            // Method dump skipped, instructions count: 306
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.account.login.recover.View$OnClickListenerC31993a.C31996c.accept(java.lang.Object):void");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b
    /* renamed from: a */
    public final void mo57442a(int i, String str) {
        C89219l.m154721d(str, "");
        View c = mo57434c(R.id.ath);
        C89219l.m154716b(c, "");
        ((InputResultIndicator) c.findViewById(R.id.boo)).mo58482a(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        View c = mo57434c(R.id.ath);
        C89219l.m154716b(c, "");
        this.f76390a = ((InputWithIndicator) c.findViewById(R.id.bon)).getEditText();
        C31997d dVar = new C31997d(this);
        EditText editText = this.f76390a;
        if (editText == null) {
            C89219l.m154710a("emailInput");
        }
        editText.setInputType(32);
        editText.setHint(getString(R.string.any));
        editText.addTextChangedListener(dVar);
        if (!TextUtils.isEmpty(this.f76395k)) {
            editText.setText(this.f76395k);
            editText.setSelection(this.f76395k.length());
        }
        mo58495a(mo57434c(R.id.ati), this);
        if (this.f76391b) {
            m66369g();
        }
    }
}
