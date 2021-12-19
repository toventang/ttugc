package com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.C32407x;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.C32555z;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.AbstractC32806p;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.C32775b;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.C32776c;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.InputResultIndicator;
import com.p2082ss.android.ugc.aweme.account.p2253l.C31741e;
import com.p2082ss.android.ugc.aweme.account.p2253l.C31749h;
import com.p2082ss.android.ugc.aweme.account.p2280ui.InputWithIndicator;
import com.p2082ss.android.ugc.aweme.account.p2280ui.LoadingButton;
import com.p2082ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4560f.p4561a.AbstractC88973n;
import p4560f.p4561a.AbstractC88976q;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.b */
public final class C32617b extends AbstractC32613a {

    /* renamed from: a */
    private final C32619b f77806a = new C32619b(this);

    /* renamed from: b */
    private HashMap f77807b;

    static {
        Covode.recordClassIndex(39396);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: c */
    public final View mo57434c(int i) {
        if (this.f77807b == null) {
            this.f77807b = new HashMap();
        }
        View view = (View) this.f77807b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f77807b.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: d */
    public final int mo57435d() {
        return R.layout.g4;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.AbstractC32793k
    /* renamed from: f */
    public final void mo58496f() {
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: h */
    public final void mo57438h() {
        HashMap hashMap = this.f77807b;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo57438h();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.AbstractC32793k
    /* renamed from: u */
    public final void mo58497u() {
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: r */
    public final void mo57459r() {
        ((LoadingButton) mo57434c(R.id.a4x)).mo58777b(true);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: s */
    public final void mo57460s() {
        ((LoadingButton) mo57434c(R.id.a4x)).mo58776a(true);
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        KeyboardUtils.m70897c(((InputWithIndicator) mo57434c(R.id.a4y)).getEditText());
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        C32776c.m67375a(((InputWithIndicator) mo57434c(R.id.a4y)).getEditText());
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: p */
    public final C32775b mo57457p() {
        return new C32775b(" ", null, true, getString(R.string.d5z), getString(R.string.d6_), true, null, false, false, 1354);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.b$b */
    public static final class C32619b implements AbstractC32806p {

        /* renamed from: a */
        final /* synthetic */ C32617b f77809a;

        static {
            Covode.recordClassIndex(39398);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32619b(C32617b bVar) {
            this.f77809a = bVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.AbstractC32806p
        /* renamed from: a */
        public final void mo58501a(int i, Editable editable) {
            InputResultIndicator inputResultIndicator;
            String text;
            String text2;
            String text3;
            int i2;
            String str;
            String str2;
            if (this.f77809a.af_()) {
                if (i == R.id.awx) {
                    if (editable != null) {
                        i2 = editable.length();
                    } else {
                        i2 = 0;
                    }
                    if (i2 < 8) {
                        LoadingButton loadingButton = (LoadingButton) this.f77809a.mo57434c(R.id.a4x);
                        if (loadingButton != null) {
                            loadingButton.setEnabled(false);
                        }
                    } else if (i2 > 20) {
                        C32617b bVar = this.f77809a;
                        String string = bVar.getString(R.string.d8u);
                        C89219l.m154716b(string, "");
                        bVar.mo57442a(0, string);
                        LoadingButton loadingButton2 = (LoadingButton) this.f77809a.mo57434c(R.id.a4x);
                        if (loadingButton2 != null) {
                            loadingButton2.setEnabled(false);
                        }
                    } else {
                        C31741e eVar = new C31741e();
                        if (editable == null || (str = editable.toString()) == null) {
                            str = "";
                        }
                        if (!eVar.mo57697a(str)) {
                            C32617b bVar2 = this.f77809a;
                            String string2 = bVar2.getString(R.string.aw4);
                            C89219l.m154716b(string2, "");
                            bVar2.mo57442a(0, string2);
                            LoadingButton loadingButton3 = (LoadingButton) this.f77809a.mo57434c(R.id.a4x);
                            if (loadingButton3 != null) {
                                loadingButton3.setEnabled(false);
                            }
                        } else {
                            C31749h hVar = new C31749h();
                            if (editable == null || (str2 = editable.toString()) == null) {
                                str2 = "";
                            }
                            if (!hVar.mo57697a(str2)) {
                                C32617b bVar3 = this.f77809a;
                                String string3 = bVar3.getString(R.string.aw6);
                                C89219l.m154716b(string3, "");
                                bVar3.mo57442a(0, string3);
                                LoadingButton loadingButton4 = (LoadingButton) this.f77809a.mo57434c(R.id.a4x);
                                if (loadingButton4 != null) {
                                    loadingButton4.setEnabled(false);
                                }
                            } else {
                                LoadingButton loadingButton5 = (LoadingButton) this.f77809a.mo57434c(R.id.a4x);
                                if (loadingButton5 != null) {
                                    loadingButton5.setEnabled(true);
                                }
                                InputResultIndicator inputResultIndicator2 = (InputResultIndicator) this.f77809a.mo57434c(R.id.a4v);
                                if (inputResultIndicator2 != null) {
                                    inputResultIndicator2.mo58481a();
                                }
                            }
                        }
                    }
                }
                InputWithIndicator inputWithIndicator = (InputWithIndicator) this.f77809a.mo57434c(R.id.a4y);
                if (inputWithIndicator == null || (text3 = inputWithIndicator.getText()) == null || text3.length() == 0) {
                    InputWithIndicator inputWithIndicator2 = (InputWithIndicator) this.f77809a.mo57434c(R.id.a4w);
                    if (inputWithIndicator2 == null || (text2 = inputWithIndicator2.getText()) == null || text2.length() == 0) {
                        InputWithIndicator inputWithIndicator3 = (InputWithIndicator) this.f77809a.mo57434c(R.id.a4u);
                        if ((inputWithIndicator3 == null || (text = inputWithIndicator3.getText()) == null || text.length() == 0) && (inputResultIndicator = (InputResultIndicator) this.f77809a.mo57434c(R.id.a4v)) != null) {
                            inputResultIndicator.mo58481a();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.b$a */
    static final class View$OnClickListenerC32618a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C32617b f77808a;

        static {
            Covode.recordClassIndex(39397);
        }

        View$OnClickListenerC32618a(C32617b bVar) {
            this.f77808a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!C89219l.m154714a((Object) ((InputWithIndicator) this.f77808a.mo57434c(R.id.a4w)).getText(), (Object) ((InputWithIndicator) this.f77808a.mo57434c(R.id.a4u)).getText())) {
                C32617b bVar = this.f77808a;
                String string = bVar.getString(R.string.d_5);
                C89219l.m154716b(string, "");
                bVar.mo57442a(0, string);
                return;
            }
            ((LoadingButton) this.f77808a.mo57434c(R.id.a4x)).mo58776a(true);
            C32617b bVar2 = this.f77808a;
            String text = ((InputWithIndicator) bVar2.mo57434c(R.id.a4y)).getText();
            String text2 = ((InputWithIndicator) this.f77808a.mo57434c(R.id.a4w)).getText();
            C89219l.m154721d(bVar2, "");
            C89219l.m154721d(text, "");
            C89219l.m154721d(text2, "");
            AbstractC88973n a = AbstractC88973n.m154243a((AbstractC88976q) new C32407x.C32505co(bVar2, text, text2));
            C89219l.m154716b(a, "");
            C32555z.m67011a(bVar2, a).mo143246c();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b
    /* renamed from: a */
    public final void mo57442a(int i, String str) {
        C89219l.m154721d(str, "");
        InputResultIndicator inputResultIndicator = (InputResultIndicator) mo57434c(R.id.a4v);
        if (inputResultIndicator != null) {
            inputResultIndicator.mo58482a(str);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        C32776c.m67376a(((InputWithIndicator) mo57434c(R.id.a4y)).getEditText(), this.f77806a);
        C32776c.m67376a(((InputWithIndicator) mo57434c(R.id.a4w)).getEditText(), this.f77806a);
        C32776c.m67376a(((InputWithIndicator) mo57434c(R.id.a4u)).getEditText(), this.f77806a);
        mo58495a(mo57434c(R.id.a4x), new View$OnClickListenerC32618a(this));
    }
}
