package com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1642e.C22359a;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.C36085cj;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.C32586h;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.C32360ad;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.C32380d;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.C32407x;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.AccountKeyBoardHelper;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.C32775b;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.C32776c;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.C32783f;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.InputResultIndicator;
import com.p2082ss.android.ugc.aweme.account.network.NetworkProxyAccount;
import com.p2082ss.android.ugc.aweme.account.p2233a.p2235b.C31376a;
import com.p2082ss.android.ugc.aweme.account.p2274n.C32853e;
import com.p2082ss.android.ugc.aweme.account.p2280ui.InputWithIndicator;
import com.p2082ss.android.ugc.aweme.account.p2280ui.LoadingButton;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.base.p2379ui.C34699o;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.AbstractC88924h;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88428a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88437j;
import p4560f.p4561a.p4568e.p4570b.C88446a;
import p4560f.p4561a.p4568e.p4570b.C88466b;
import p4560f.p4561a.p4568e.p4573e.p4575b.C88533c;
import p4560f.p4561a.p4568e.p4573e.p4575b.C88539e;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4592m.AbstractC88971a;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.v */
public final class C32758v extends AbstractC32613a {

    /* renamed from: a */
    public C32783f f78054a;

    /* renamed from: b */
    public C32360ad f78055b = new C32360ad();

    /* renamed from: c */
    public EditText f78056c;

    /* renamed from: d */
    public final C32586h f78057d = new C32586h();

    /* renamed from: e */
    public boolean f78058e;

    /* renamed from: j */
    public String f78059j = "";

    /* renamed from: k */
    public C32380d f78060k;

    /* renamed from: l */
    public String f78061l = "";

    /* renamed from: m */
    private boolean f78062m = true;

    /* renamed from: n */
    private HashMap f78063n;

    static {
        Covode.recordClassIndex(39537);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: c */
    public final View mo57434c(int i) {
        if (this.f78063n == null) {
            this.f78063n = new HashMap();
        }
        View view = (View) this.f78063n.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f78063n.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: d */
    public final int mo57435d() {
        return R.layout.hs;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: h */
    public final void mo57438h() {
        HashMap hashMap = this.f78063n;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: g */
    public final void mo57437g() {
        super.mo58494D();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: q */
    public final boolean mo57458q() {
        return this.f78062m;
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.v$a */
    public static final class C32759a implements C32853e.AbstractC32854a {

        /* renamed from: a */
        final /* synthetic */ C32758v f78064a;

        static {
            Covode.recordClassIndex(39538);
        }

        @Override // com.p2082ss.android.ugc.aweme.account.p2274n.C32853e.AbstractC32854a
        /* renamed from: a */
        public final void mo57639a() {
            this.f78064a.mo57437g();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32759a(C32758v vVar) {
            this.f78064a = vVar;
        }
    }

    /* renamed from: e */
    public final EditText mo58568e() {
        EditText editText = this.f78056c;
        if (editText == null) {
            C89219l.m154710a("etUserName");
        }
        return editText;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: r */
    public final void mo57459r() {
        LoadingButton loadingButton = (LoadingButton) mo57434c(R.id.dwe);
        if (loadingButton != null) {
            loadingButton.mo58777b(true);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: s */
    public final void mo57460s() {
        LoadingButton loadingButton = (LoadingButton) mo57434c(R.id.dwe);
        if (loadingButton != null) {
            loadingButton.mo58776a(true);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.AbstractC32793k
    /* renamed from: f */
    public final void mo58496f() {
        super.mo58496f();
        RecyclerView recyclerView = (RecyclerView) mo57434c(R.id.dwf);
        C89219l.m154716b(recyclerView, "");
        recyclerView.setVisibility(0);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f78060k = null;
        this.f78055b.mo58412b();
        this.f78057d.mo58470a();
        super.onDestroyView();
        mo57438h();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.AbstractC32793k
    /* renamed from: u */
    public final void mo58497u() {
        super.mo58497u();
        RecyclerView recyclerView = (RecyclerView) mo57434c(R.id.dwf);
        C89219l.m154716b(recyclerView, "");
        recyclerView.setVisibility(8);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (AccountKeyBoardHelper.C32598a.m67091a()) {
            EditText editText = this.f78056c;
            if (editText == null) {
                C89219l.m154710a("etUserName");
            }
            C32776c.m67375a(editText);
            return;
        }
        EditText editText2 = this.f78056c;
        if (editText2 == null) {
            C89219l.m154710a("etUserName");
        }
        editText2.requestFocus();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: p */
    public final C32775b mo57457p() {
        C32775b bVar = new C32775b(null, null, false, null, null, false, null, false, false, 2047);
        bVar.f78102a = getString(R.string.aqx);
        bVar.f78106e = getString(R.string.ar3);
        bVar.f78107f = getString(R.string.ar2);
        bVar.f78103b = getString(R.string.fj7);
        bVar.f78109h = true;
        bVar.f78110i = "set_username";
        bVar.f78112k = true;
        return bVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: D */
    public final void mo58494D() {
        this.f78062m = false;
        C39162r.m79460a("click_username_skip", new C31376a().mo57399a("platform", this.f78059j).f75156a);
        IAccountUserService e = C36085cj.f85262b.mo57069e();
        C89219l.m154716b(e, "");
        if (!e.isChildrenMode()) {
            C22359a a = C32853e.m67446a();
            if (a != null) {
                C32853e.m67447a(getActivity(), getArguments(), new C32759a(this), a);
            } else {
                super.mo58494D();
            }
        } else {
            super.mo58494D();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.v$e */
    public static final class C32763e implements C32586h.AbstractC32587a {

        /* renamed from: a */
        final /* synthetic */ C32758v f78068a;

        static {
            Covode.recordClassIndex(39542);
        }

        /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.v$e$a */
        public static final class C32764a extends AbstractC88971a<C32380d> {

            /* renamed from: a */
            final /* synthetic */ C32763e f78069a;

            static {
                Covode.recordClassIndex(39543);
            }

            @Override // org.p4663a.AbstractC90214c
            public final void onComplete() {
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C32764a(C32763e eVar) {
                this.f78069a = eVar;
            }

            @Override // org.p4663a.AbstractC90214c
            public final /* synthetic */ void onNext(Object obj) {
                C32380d dVar = (C32380d) obj;
                C89219l.m154721d(dVar, "");
                C32758v vVar = this.f78069a.f78068a;
                C89219l.m154721d(dVar, "");
                List<String> list = null;
                if (!C89219l.m154714a((Object) dVar.f77214a, (Object) false)) {
                    vVar.mo58567a(true, 3, null);
                    return;
                }
                vVar.mo58567a(false, 1, dVar.status_msg);
                C32783f fVar = vVar.f78054a;
                if (fVar == null) {
                    C89219l.m154715b();
                }
                List<String> list2 = dVar.f77215b;
                if (list2 != null) {
                    list = C89070n.m154580f((Iterable) list2);
                }
                fVar.mo58585a(list);
            }

            @Override // org.p4663a.AbstractC90214c
            public final void onError(Throwable th) {
                String str;
                List<String> list;
                List<String> list2;
                C89219l.m154721d(th, "");
                C32758v vVar = this.f78069a.f78068a;
                C89219l.m154721d(th, "");
                if (th instanceof C34485a) {
                    C34485a aVar = (C34485a) th;
                    if (aVar.getRawResponse() != null) {
                        Object rawResponse = aVar.getRawResponse();
                        if (rawResponse instanceof C32380d) {
                            C32380d dVar = (C32380d) rawResponse;
                            list = dVar.f77215b;
                            str = dVar.status_msg;
                        } else {
                            str = null;
                            list = null;
                        }
                        C32783f fVar = vVar.f78054a;
                        if (fVar == null) {
                            C89219l.m154715b();
                        }
                        if (list != null) {
                            list2 = C89070n.m154580f((Iterable) list);
                        } else {
                            list2 = null;
                        }
                        fVar.mo58585a(list2);
                    } else {
                        str = null;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        vVar.mo58567a(false, 1, str);
                        return;
                    }
                }
                vVar.mo58567a(true, 1, null);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32763e(C32758v vVar) {
            this.f78068a = vVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.C32586h.AbstractC32587a
        /* renamed from: a */
        public final void mo58473a(String str) {
            C89219l.m154721d(str, "");
            if (!TextUtils.isEmpty(str)) {
                View c = this.f78068a.mo57434c(R.id.dwd);
                C89219l.m154716b(c, "");
                ((InputWithIndicator) c.findViewById(R.id.bon)).mo58760a(2, 0);
                this.f78068a.f78055b.mo58411a(str, new C32764a(this));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.v$b */
    public static final class C32760b extends AbstractC88971a<C32380d> {

        /* renamed from: a */
        final /* synthetic */ C32758v f78065a;

        static {
            Covode.recordClassIndex(39539);
        }

        @Override // org.p4663a.AbstractC90214c
        public final void onComplete() {
        }

        @Override // org.p4663a.AbstractC90214c
        public final void onError(Throwable th) {
            C89219l.m154721d(th, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32760b(C32758v vVar) {
            this.f78065a = vVar;
        }

        @Override // org.p4663a.AbstractC90214c
        public final /* synthetic */ void onNext(Object obj) {
            C32380d dVar = (C32380d) obj;
            C89219l.m154721d(dVar, "");
            List<String> list = dVar.f77215b;
            if (list != null && (!list.isEmpty())) {
                if (this.f78065a.af_()) {
                    this.f78065a.mo58566a(dVar);
                } else {
                    this.f78065a.f78060k = dVar;
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.v$f */
    public static final class C32765f extends C34699o {

        /* renamed from: a */
        final /* synthetic */ C32758v f78070a;

        static {
            Covode.recordClassIndex(39544);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32765f(C32758v vVar) {
            this.f78070a = vVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.C34699o
        public final void afterTextChanged(Editable editable) {
            if (this.f78070a.af_()) {
                String obj = this.f78070a.mo58568e().getText().toString();
                boolean isEmpty = TextUtils.isEmpty(obj);
                if (isEmpty || this.f78070a.f78058e) {
                    this.f78070a.f78055b.mo58412b();
                    this.f78070a.f78057d.mo58472a("");
                }
                if (this.f78070a.f78058e) {
                    this.f78070a.mo58568e().setSelection(obj.length());
                    this.f78070a.mo58567a(true, 3, null);
                    this.f78070a.f78058e = false;
                    return;
                }
                C32783f fVar = this.f78070a.f78054a;
                if (fVar == null) {
                    C89219l.m154715b();
                }
                fVar.mo58585a(null);
                this.f78070a.mo58567a(false, 1, null);
                if (!isEmpty) {
                    this.f78070a.f78057d.mo58472a(obj);
                }
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.C34699o
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            super.onTextChanged(charSequence, i, i2, i3);
            if (!this.f78070a.f78058e) {
                if (i3 > 0) {
                    if (i2 == 0) {
                        C39162r.m79460a("type_username", new C31376a().mo57399a(StringSet.type, "write").mo57399a("platform", this.f78070a.f78059j).f75156a);
                        return;
                    }
                } else if (i3 == 0) {
                    if (i2 > 0) {
                        C39162r.m79460a("type_username", new C31376a().mo57399a(StringSet.type, "delete").mo57399a("platform", this.f78070a.f78059j).f75156a);
                        return;
                    }
                    return;
                } else if (i3 <= 0) {
                    return;
                }
                if (i2 > 0) {
                    C39162r.m79460a("type_username", new C31376a().mo57399a(StringSet.type, "replace").mo57399a("platform", this.f78070a.f78059j).f75156a);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.v$c */
    static final class C32761c extends AbstractC89220m implements AbstractC89172b<String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C32758v f78066a;

        static {
            Covode.recordClassIndex(39540);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32761c(C32758v vVar) {
            super(1);
            this.f78066a = vVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(String str) {
            String str2 = str;
            C89219l.m154721d(str2, "");
            if (!TextUtils.isEmpty(str2)) {
                this.f78066a.f78058e = true;
                this.f78066a.mo58568e().setText(str2);
                C39162r.m79460a("choose_recommend_username", new C31376a().mo57399a("enter_from", this.f78066a.mo58466w()).mo57399a("enter_method", this.f78066a.mo58467x()).mo57399a("platform", this.f78066a.f78059j).f75156a);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo58566a(C32380d dVar) {
        List f;
        C89219l.m154721d(dVar, "");
        List<String> list = dVar.f77215b;
        if (list != null && (f = C89070n.m154580f((Iterable) list)) != null && (!f.isEmpty())) {
            this.f78058e = true;
            EditText editText = this.f78056c;
            if (editText == null) {
                C89219l.m154710a("etUserName");
            }
            editText.setText((CharSequence) f.get(0));
            this.f78061l = (String) f.get(0);
            C32783f fVar = this.f78054a;
            if (fVar == null) {
                C89219l.m154715b();
            }
            fVar.mo58585a(f.subList(1, f.size()));
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null || (str = arguments.getString("set_username_platform", "")) == null) {
            str = "";
        }
        this.f78059j = str;
        C39162r.m79460a("set_username_show", new C31376a().mo57399a("enter_from", mo58466w()).mo57399a("enter_method", mo58467x()).mo57399a("platform", this.f78059j).f75156a);
        Bundle arguments2 = getArguments();
        if (arguments2 != null && arguments2.getBoolean("new_user_need_get_recommend_username")) {
            this.f78055b.mo58411a("", new C32760b(this));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.v$d */
    static final class View$OnClickListenerC32762d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C32758v f78067a;

        static {
            Covode.recordClassIndex(39541);
        }

        View$OnClickListenerC32762d(C32758v vVar) {
            this.f78067a = vVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C32360ad adVar = this.f78067a.f78055b;
            C32758v vVar = this.f78067a;
            String obj = vVar.mo58568e().getText().toString();
            String str = this.f78067a.f78059j;
            String str2 = this.f78067a.f78061l;
            C89219l.m154721d(vVar, "");
            C89219l.m154721d(obj, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            adVar.mo58412b();
            adVar.mo58410a().put("login_name", obj);
            HashMap<String, String> a = adVar.mo58410a();
            C89219l.m154721d(vVar, "");
            C89219l.m154721d(a, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            String str3 = a.get("login_name");
            AbstractC88924h<R> a2 = NetworkProxyAccount.m67480d("/passport/login_name/register/", a).mo143198a(new C32407x.C32549w(vVar)).mo143195a(C88391a.m153580a(C88392a.f200660a));
            C32407x.C32551x xVar = new C32407x.C32551x(vVar, str, str2, str3);
            AbstractC88433f<? super R> fVar = C88446a.f200698d;
            AbstractC88428a aVar = C88446a.f200697c;
            AbstractC88924h<R> a3 = a2.mo143197a(fVar, xVar, aVar, aVar).mo143196a(new C32407x.C32552y(vVar, str, str2, str3));
            C32407x.C32553z zVar = new C32407x.C32553z(vVar);
            C88466b.m153697a((Object) zVar, "onFinally is null");
            AbstractC88924h a4 = C88925a.m154168a(new C88533c(a3, zVar));
            C32407x.C32410aa aaVar = new C32407x.C32410aa(vVar);
            AbstractC88437j jVar = C88446a.f200701g;
            AbstractC88428a aVar2 = C88446a.f200697c;
            C88466b.m153697a((Object) aaVar, "onSubscribe is null");
            C88466b.m153697a((Object) jVar, "onRequest is null");
            C88466b.m153697a((Object) aVar2, "onCancel is null");
            AbstractC88924h a5 = C88925a.m154168a(new C88539e(a4, aaVar, jVar, aVar2));
            C89219l.m154716b(a5, "");
            adVar.f77184a = a5.mo143196a((AbstractC88433f) new C32360ad.C32363c(obj, vVar)).mo143190a(C32360ad.C32365d.f77194a, C32360ad.C32366e.f77195a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b
    /* renamed from: a */
    public final void mo57442a(int i, String str) {
        InputResultIndicator inputResultIndicator;
        C89219l.m154721d(str, "");
        View c = mo57434c(R.id.dwd);
        if (c != null && (inputResultIndicator = (InputResultIndicator) c.findViewById(R.id.boo)) != null) {
            inputResultIndicator.mo58482a(str);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        View c = mo57434c(R.id.dwd);
        C89219l.m154716b(c, "");
        EditText editText = ((InputWithIndicator) c.findViewById(R.id.bon)).getEditText();
        this.f78056c = editText;
        if (editText == null) {
            C89219l.m154710a("etUserName");
        }
        editText.setNextFocusDownId(editText.getId());
        editText.setHint(getString(R.string.ar0));
        RecyclerView recyclerView = (RecyclerView) mo57434c(R.id.dwf);
        C89219l.m154716b(recyclerView, "");
        C32783f fVar = new C32783f(recyclerView, null, new C32761c(this));
        this.f78054a = fVar;
        fVar.f78124a = true;
        mo58495a(mo57434c(R.id.dwe), new View$OnClickListenerC32762d(this));
        this.f78057d.mo58471a(new C32763e(this), TimeUnit.MILLISECONDS);
        EditText editText2 = this.f78056c;
        if (editText2 == null) {
            C89219l.m154710a("etUserName");
        }
        editText2.addTextChangedListener(new C32765f(this));
        C32380d dVar = this.f78060k;
        if (dVar != null) {
            mo58566a(dVar);
        }
    }

    /* renamed from: a */
    public final void mo58567a(boolean z, int i, String str) {
        LoadingButton loadingButton = (LoadingButton) mo57434c(R.id.dwe);
        C89219l.m154716b(loadingButton, "");
        loadingButton.setEnabled(z);
        if (str == null) {
            View c = mo57434c(R.id.dwd);
            C89219l.m154716b(c, "");
            ((InputResultIndicator) c.findViewById(R.id.boo)).mo58481a();
        } else {
            View c2 = mo57434c(R.id.dwd);
            C89219l.m154716b(c2, "");
            ((InputResultIndicator) c2.findViewById(R.id.boo)).mo58482a(str);
        }
        View c3 = mo57434c(R.id.dwd);
        C89219l.m154716b(c3, "");
        ((InputWithIndicator) c3.findViewById(R.id.bon)).mo58760a(i, 0);
    }
}
