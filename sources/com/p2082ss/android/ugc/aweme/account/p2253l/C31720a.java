package com.p2082ss.android.ugc.aweme.account.p2253l;

import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1626a.p1627a.C22291d;
import com.bytedance.sdk.p1625a.p1645h.p1646a.C22408c;
import com.bytedance.sdk.p1625a.p1663n.C22507a;
import com.p2082ss.android.ugc.aweme.AccountService;
import com.p2082ss.android.ugc.aweme.C31291a;
import com.p2082ss.android.ugc.aweme.C36085cj;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.C32582d;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32592i;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32594j;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.C32390l;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.C32403u;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.C32407x;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.C32555z;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.p2270a.C32334a;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.C32775b;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.C32776c;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.InputResultIndicator;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a;
import com.p2082ss.android.ugc.aweme.account.p2233a.p2235b.C31376a;
import com.p2082ss.android.ugc.aweme.account.p2280ui.ChecklistItemView;
import com.p2082ss.android.ugc.aweme.account.p2280ui.InputWithIndicator;
import com.p2082ss.android.ugc.aweme.account.p2280ui.LoadingButton;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.services.LoginService;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p4560f.p4561a.AbstractC88973n;
import p4560f.p4561a.AbstractC88976q;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.l.a */
public class C31720a extends AbstractC32613a {

    /* renamed from: a */
    private final AbstractC89244h f75867a = C89250i.m154773a((AbstractC89171a) new C31732l(this));

    /* renamed from: b */
    private final AbstractC89244h f75868b = C89250i.m154773a((AbstractC89171a) new C31731k(this));

    /* renamed from: c */
    public final Map<AbstractC31743f, ChecklistItemView> f75869c = new LinkedHashMap();

    /* renamed from: d */
    public final Map<AbstractC31743f, String> f75870d = new LinkedHashMap();

    /* renamed from: e */
    private final AbstractC89244h f75871e = C89250i.m154773a((AbstractC89171a) new C31724d(this));

    /* renamed from: j */
    private final AbstractC89244h f75872j = C89250i.m154773a((AbstractC89171a) new C31721a(this));

    /* renamed from: k */
    private final AbstractC89244h f75873k = C89250i.m154773a((AbstractC89171a) new C31730j(this));

    /* renamed from: l */
    private String f75874l;

    /* renamed from: m */
    private HashMap f75875m;

    static {
        Covode.recordClassIndex(38454);
    }

    /* renamed from: k */
    private String m66049k() {
        return (String) this.f75868b.getValue();
    }

    /* renamed from: l */
    private final String m66050l() {
        return (String) this.f75872j.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: c */
    public View mo57434c(int i) {
        if (this.f75875m == null) {
            this.f75875m = new HashMap();
        }
        View view = (View) this.f75875m.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f75875m.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: d */
    public final int mo57435d() {
        return R.layout.hh;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final String mo57437g() {
        return (String) this.f75867a.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: h */
    public void mo57438h() {
        HashMap hashMap = this.f75875m;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final boolean mo57692i() {
        return ((Boolean) this.f75871e.getValue()).booleanValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo57438h();
    }

    /* renamed from: com.ss.android.ugc.aweme.account.l.a$l */
    static final class C31732l extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ C31720a f75889a;

        static {
            Covode.recordClassIndex(38466);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31732l(C31720a aVar) {
            super(0);
            this.f75889a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            return C32582d.m67074e(this.f75889a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: r */
    public final void mo57459r() {
        LoadingButton loadingButton = (LoadingButton) mo57434c(R.id.ag1);
        if (loadingButton != null) {
            loadingButton.mo58777b(true);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: s */
    public final void mo57460s() {
        LoadingButton loadingButton = (LoadingButton) mo57434c(R.id.ag1);
        if (loadingButton != null) {
            loadingButton.mo58776a(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.l.a$a */
    static final class C31721a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ C31720a f75876a;

        static {
            Covode.recordClassIndex(38455);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31721a(C31720a aVar) {
            super(0);
            this.f75876a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            Bundle arguments = this.f75876a.getArguments();
            if (arguments != null) {
                return arguments.getString("conditional_login_ticket");
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.l.a$j */
    static final class C31730j extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ C31720a f75887a;

        static {
            Covode.recordClassIndex(38464);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31730j(C31720a aVar) {
            super(0);
            this.f75887a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            Bundle arguments = this.f75887a.getArguments();
            if (arguments != null) {
                return arguments.getString("otp_type");
            }
            return null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        C32776c.m67375a(((InputWithIndicator) mo57434c(R.id.ag2)).getEditText());
    }

    /* renamed from: com.ss.android.ugc.aweme.account.l.a$d */
    static final class C31724d extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C31720a f75881a;

        static {
            Covode.recordClassIndex(38458);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31724d(C31720a aVar) {
            super(0);
            this.f75881a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            int i = C31733b.f75891b[this.f75881a.mo58460Z_().ordinal()];
            boolean z = true;
            if (!(i == 1 || i == 2 || i == 3)) {
                z = (i == 4 || i == 5) ? false : AccountService.m65215a().mo57069e().hasCurUserSetPassword();
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.l.a$k */
    static final class C31731k extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ C31720a f75888a;

        static {
            Covode.recordClassIndex(38465);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31731k(C31720a aVar) {
            super(0);
            this.f75888a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            String string;
            Bundle arguments = this.f75888a.getArguments();
            if (arguments != null && (string = arguments.getString("platForm")) != null) {
                return string;
            }
            int i = C31733b.f75890a[this.f75888a.mo58460Z_().ordinal()];
            if (i == 1) {
                return "email";
            }
            if (i != 2) {
                return "";
            }
            return "phone";
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: p */
    public C32775b mo57457p() {
        int i;
        C32775b bVar = new C32775b(null, null, false, null, null, false, null, false, false, 2047);
        if (!mo57692i() || m66050l() != null) {
            i = R.string.aq9;
        } else {
            i = R.string.h2s;
        }
        bVar.f78106e = getString(i);
        bVar.f78102a = " ";
        bVar.f78111j = false;
        return bVar;
    }

    /* renamed from: e */
    public void mo57691e() {
        ((LoadingButton) mo57434c(R.id.ag1)).mo58776a(true);
        String text = ((InputWithIndicator) mo57434c(R.id.ag2)).getText();
        if (!mo57689b(text)) {
            if (TextUtils.isEmpty(mo57437g())) {
                C32407x.m66787a(this, text).mo143251d(new C31727g(this)).mo143246c();
            } else if (TextUtils.equals(m66049k(), "email")) {
                String g = mo57437g();
                C89219l.m154721d(this, "");
                C89219l.m154721d(g, "");
                C89219l.m154721d(text, "");
                AbstractC88973n b = AbstractC88973n.m154243a((AbstractC88976q) new C32407x.C32532k(this, g, text)).mo143251d(new C32407x.C32534l(this)).mo143244b(new C32407x.C32535m(this));
                C89219l.m154716b(b, "");
                C32555z.m67011a(this, b).mo143251d(new C31725e(this)).mo143246c();
            } else {
                String g2 = mo57437g();
                C89219l.m154721d(this, "");
                C89219l.m154721d(g2, "");
                C89219l.m154721d(text, "");
                AbstractC88973n b2 = AbstractC88973n.m154243a((AbstractC88976q) new C32407x.C32536n(this, g2, text)).mo143251d(new C32407x.C32538o(this)).mo143244b(new C32407x.C32539p(this));
                C89219l.m154716b(b2, "");
                C32555z.m67011a(this, b2).mo143251d(new C31726f(this)).mo143246c();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.l.a$c */
    public static final class C31723c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C31720a f75879a;

        /* renamed from: b */
        final /* synthetic */ String f75880b;

        static {
            Covode.recordClassIndex(38457);
        }

        C31723c(C31720a aVar, String str) {
            this.f75879a = aVar;
            this.f75880b = str;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f75879a.mo57690c(this.f75880b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.l.a$h */
    public static final class C31728h implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ C31720a f75885a;

        static {
            Covode.recordClassIndex(38462);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31728h(C31720a aVar) {
            this.f75885a = aVar;
        }

        public final void afterTextChanged(Editable editable) {
            String str;
            boolean z;
            String str2;
            String obj;
            if (this.f75885a.af_()) {
                Iterator<Map.Entry<AbstractC31743f, ChecklistItemView>> it = this.f75885a.f75869c.entrySet().iterator();
                boolean z2 = true;
                boolean z3 = true;
                while (true) {
                    str = "";
                    if (!it.hasNext()) {
                        break;
                    }
                    Map.Entry<AbstractC31743f, ChecklistItemView> next = it.next();
                    AbstractC31743f key = next.getKey();
                    ChecklistItemView value = next.getValue();
                    if (!(editable == null || (obj = editable.toString()) == null)) {
                        str = obj;
                    }
                    if (key.mo57697a(str)) {
                        value.setVariant(ChecklistItemView.EnumC32958b.Success);
                    } else {
                        value.setVariant(ChecklistItemView.EnumC32958b.None);
                        z3 = false;
                    }
                }
                Iterator<Map.Entry<AbstractC31743f, String>> it2 = this.f75885a.f75870d.entrySet().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z = true;
                        ((InputResultIndicator) this.f75885a.mo57434c(R.id.ag3)).mo58481a();
                        break;
                    }
                    Map.Entry<AbstractC31743f, String> next2 = it2.next();
                    AbstractC31743f key2 = next2.getKey();
                    String value2 = next2.getValue();
                    if (editable == null || (str2 = editable.toString()) == null) {
                        str2 = str;
                    }
                    if (!key2.mo57697a(str2)) {
                        this.f75885a.mo57442a(0, value2);
                        z = false;
                        break;
                    }
                }
                LoadingButton loadingButton = (LoadingButton) this.f75885a.mo57434c(R.id.ag1);
                C89219l.m154716b(loadingButton, str);
                if (!z3 || !z) {
                    z2 = false;
                }
                loadingButton.setEnabled(z2);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.l.a$i */
    static final class View$OnClickListenerC31729i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C31720a f75886a;

        static {
            Covode.recordClassIndex(38463);
        }

        View$OnClickListenerC31729i(C31720a aVar) {
            this.f75886a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f75886a.mo57691e();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.l.a$b */
    public static final class C31722b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C31720a f75877a;

        /* renamed from: b */
        final /* synthetic */ String f75878b;

        static {
            Covode.recordClassIndex(38456);
        }

        C31722b(C31720a aVar, String str) {
            this.f75877a = aVar;
            this.f75878b = str;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            EnumC32594j jVar;
            C32403u uVar = (C32403u) obj;
            new C79459a(C31291a.f74991a).mo123052a(this.f75877a.requireActivity().getString(R.string.ab7)).mo123053a();
            C31720a aVar = this.f75877a;
            EnumC32592i iVar = EnumC32592i.LOGIN;
            if (C89219l.m154714a((Object) this.f75878b, (Object) "phone")) {
                jVar = EnumC32594j.RESET_PASSWORD_FOR_PHONE;
            } else {
                jVar = EnumC32594j.RESET_PASSWORD_FOR_EMAIL;
            }
            C22507a aVar2 = uVar.f77256p;
            if (aVar2 == null) {
                C89219l.m154715b();
            }
            C32334a.m66709a(aVar, iVar, jVar, aVar2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.l.a$e */
    public static final class C31725e<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C31720a f75882a;

        static {
            Covode.recordClassIndex(38459);
        }

        C31725e(C31720a aVar) {
            this.f75882a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C36085cj.m73540a(8, 1, (Object) ((C32390l) ((C22291d) obj).f52723j).f77228b);
            new C79459a(C31291a.f74991a).mo123052a(this.f75882a.getString(R.string.ab7)).mo123053a();
            ActivityC0945e activity = this.f75882a.getActivity();
            if (activity == null) {
                C89219l.m154715b();
            }
            activity.finish();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.l.a$f */
    public static final class C31726f<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C31720a f75883a;

        static {
            Covode.recordClassIndex(38460);
        }

        C31726f(C31720a aVar) {
            this.f75883a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C36085cj.m73540a(8, 1, (Object) ((C22408c) ((C22291d) obj).f52723j).f52979b);
            new C79459a(C31291a.f74991a).mo123052a(this.f75883a.getString(R.string.ab7)).mo123053a();
            ActivityC0945e activity = this.f75883a.getActivity();
            if (activity == null) {
                C89219l.m154715b();
            }
            activity.finish();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.l.a$g */
    public static final class C31727g<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C31720a f75884a;

        static {
            Covode.recordClassIndex(38461);
        }

        C31727g(C31720a aVar) {
            this.f75884a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            new C79459a(C31291a.f74991a).mo123052a(this.f75884a.getString(R.string.aas)).mo123053a();
            ActivityC0945e activity = this.f75884a.getActivity();
            if (activity == null) {
                C89219l.m154715b();
            }
            activity.finish();
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C39162r.m79460a("set_password_show", new C31376a().mo57399a("platform", m66049k()).mo57399a("enter_from", mo58466w()).mo57399a("enter_method", mo58467x()).f75156a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo57689b(String str) {
        C89219l.m154721d(str, "");
        if (m66050l() != null) {
            String l = m66050l();
            if (l == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(l, "");
            if (l.length() != 0) {
                if (!C89219l.m154714a((Object) this.f75874l, (Object) str)) {
                    this.f75874l = str;
                    String l2 = m66050l();
                    if (l2 == null) {
                        C89219l.m154715b();
                    }
                    C89219l.m154716b(l2, "");
                    C32407x.m66798a(this, str, l2).mo143251d(new C31723c(this, str)).mo143246c();
                } else {
                    mo57690c(str);
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public final void mo57690c(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        IAccountUserService e = AccountService.m65215a().mo57069e();
        C89219l.m154716b(e, "");
        if (e.isLogin()) {
            LoginService g = C36085cj.m73553g();
            C89219l.m154716b(g, "");
            if (g.isEnableMultiAccountLogin()) {
                String encode = Uri.encode("1");
                C89219l.m154716b(encode, "");
                linkedHashMap.put("multi_login", encode);
            }
        }
        String str2 = "mobile";
        if (!C89219l.m154714a((Object) m66049k(), (Object) "phone") && !C89219l.m154714a((Object) m66049k(), (Object) str2)) {
            str2 = "email";
        }
        String l = m66050l();
        if (l == null) {
            C89219l.m154715b();
        }
        C89219l.m154716b(l, "");
        C32407x.m66802a(this, str2, str, l, mo57437g(), linkedHashMap).mo143251d(new C31722b(this, str2)).mo143246c();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b
    /* renamed from: a */
    public final void mo57442a(int i, String str) {
        C89219l.m154721d(str, "");
        ((InputResultIndicator) mo57434c(R.id.ag3)).mo58482a(str);
        ((LoadingButton) mo57434c(R.id.ag1)).mo58777b(true);
        LoadingButton loadingButton = (LoadingButton) mo57434c(R.id.ag1);
        C89219l.m154716b(loadingButton, "");
        loadingButton.setEnabled(false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Map<com.ss.android.ugc.aweme.account.l.f, com.ss.android.ugc.aweme.account.ui.ChecklistItemView> */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: java.util.Map<com.ss.android.ugc.aweme.account.l.f, com.ss.android.ugc.aweme.account.ui.ChecklistItemView> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        this.f75869c.clear();
        Map<AbstractC31743f, ChecklistItemView> map = this.f75869c;
        C31741e eVar = new C31741e();
        View c = mo57434c(R.id.a4q);
        C89219l.m154716b(c, "");
        map.put(eVar, c);
        Map<AbstractC31743f, ChecklistItemView> map2 = this.f75869c;
        C31739d dVar = new C31739d();
        View c2 = mo57434c(R.id.a4p);
        C89219l.m154716b(c2, "");
        map2.put(dVar, c2);
        this.f75870d.clear();
        Map<AbstractC31743f, String> map3 = this.f75870d;
        C31749h hVar = new C31749h();
        String string = getResources().getString(R.string.aw6);
        C89219l.m154716b(string, "");
        map3.put(hVar, string);
        String string2 = getString(R.string.aw8);
        C89219l.m154716b(string2, "");
        ((ChecklistItemView) mo57434c(R.id.a4q)).setDesc(string2);
        String string3 = getString(R.string.aw7);
        C89219l.m154716b(string3, "");
        ((ChecklistItemView) mo57434c(R.id.a4p)).setDesc(string3);
        ((InputWithIndicator) mo57434c(R.id.ag2)).getEditText().addTextChangedListener(new C31728h(this));
        mo58495a(mo57434c(R.id.ag1), new View$OnClickListenerC31729i(this));
    }
}
