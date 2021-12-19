package com.p2082ss.android.ugc.aweme.setting.page.authmanager;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.ies.dmt.p1194ui.widget.DmtButton;
import com.bytedance.keva.Keva;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.tux.status.TuxStatusView;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.base.arch.AbstractC34488b;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.setting.api.AuthListApi;
import com.p2082ss.android.ugc.aweme.setting.model.C68173c;
import com.p2082ss.android.ugc.aweme.setting.model.C68177g;
import com.p2082ss.android.ugc.aweme.setting.p3725m.C68169c;
import com.p2082ss.android.ugc.aweme.setting.viewmodel.AuthListViewModel;
import com.p2082ss.android.ugc.aweme.views.AutoRTLImageView;
import com.p2082ss.android.ugc.trill.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88406ae;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.ss.android.ugc.aweme.setting.page.authmanager.a */
public final class C68212a extends AbstractC34488b {

    /* renamed from: b */
    public static String f152720b = "";

    /* renamed from: c */
    public static String f152721c = "";

    /* renamed from: d */
    public static String f152722d = "";

    /* renamed from: e */
    public static String f152723e;

    /* renamed from: j */
    public static final C68214b f152724j = new C68214b((byte) 0);

    /* renamed from: k */
    private final AbstractC89244h f152725k;

    /* renamed from: l */
    private final AbstractC89244h f152726l = C89250i.m154773a((AbstractC89171a) new C68221g(this));

    /* renamed from: m */
    private SparseArray f152727m;

    @Override // com.p2082ss.android.ugc.aweme.base.arch.AbstractC34488b
    /* renamed from: a */
    public final View mo60929a(int i) {
        if (this.f152727m == null) {
            this.f152727m = new SparseArray();
        }
        View view = (View) this.f152727m.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f152727m.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.arch.AbstractC34488b
    /* renamed from: a */
    public final void mo60930a() {
        SparseArray sparseArray = this.f152727m;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: b */
    public final AuthListViewModel mo108735b() {
        return (AuthListViewModel) this.f152725k.getValue();
    }

    /* renamed from: c */
    public final TuxStatusView mo108736c() {
        return (TuxStatusView) this.f152726l.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.arch.AbstractC34488b
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo60930a();
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.page.authmanager.a$b */
    public static final class C68214b {
        static {
            Covode.recordClassIndex(80416);
        }

        private C68214b() {
        }

        public /* synthetic */ C68214b(byte b) {
            this();
        }

        /* renamed from: a */
        public static void m120478a(String str) {
            C89219l.m154721d(str, "");
            C68212a.f152721c = str;
        }

        /* renamed from: b */
        public static void m120479b(String str) {
            C89219l.m154721d(str, "");
            C68212a.f152722d = str;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.page.authmanager.a$g */
    static final class C68221g extends AbstractC89220m implements AbstractC89171a<TuxStatusView> {

        /* renamed from: a */
        final /* synthetic */ C68212a f152739a;

        static {
            Covode.recordClassIndex(80423);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C68221g(C68212a aVar) {
            super(0);
            this.f152739a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxStatusView invoke() {
            return this.f152739a.mo60929a(R.id.e7i);
        }
    }

    static {
        Covode.recordClassIndex(80414);
    }

    public C68212a() {
        AbstractC89277c a = C89204ab.m154669a(AuthListViewModel.class);
        this.f152725k = C89250i.m154773a((AbstractC89171a) new C68213a(this, a, a));
    }

    /* renamed from: e */
    public static boolean m120472e() {
        try {
            IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
            C89219l.m154716b(iESSettingsProxy, "");
            UgAwemeActivitySetting awemeActivitySetting = iESSettingsProxy.getAwemeActivitySetting();
            C89219l.m154716b(awemeActivitySetting, "");
            Boolean isNewUser = awemeActivitySetting.getIsNewUser();
            C89219l.m154716b(isNewUser, "");
            return isNewUser.booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.page.authmanager.a$a */
    public static final class C68213a extends AbstractC89220m implements AbstractC89171a<AuthListViewModel> {

        /* renamed from: a */
        final /* synthetic */ Fragment f152728a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f152729b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f152730c;

        static {
            Covode.recordClassIndex(80415);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C68213a(Fragment fragment, AbstractC89277c cVar, AbstractC89277c cVar2) {
            super(0);
            this.f152728a = fragment;
            this.f152729b = cVar;
            this.f152730c = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [com.ss.android.ugc.aweme.setting.viewmodel.AuthListViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.setting.viewmodel.AuthListViewModel invoke() {
            /*
                r3 = this;
                androidx.fragment.app.Fragment r0 = r3.f152728a
                androidx.fragment.app.Fragment r1 = r0.getParentFragment()
                if (r1 != 0) goto L_0x000b
                p4600h.p4611f.p4613b.C89219l.m154707a()
            L_0x000b:
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a
                androidx.lifecycle.ad r2 = androidx.lifecycle.C1181ae.m3879a(r1, r0)
                h.k.c r0 = r3.f152730c
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                java.lang.String r1 = r0.getName()
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154709a(r1, r0)
                h.k.c r0 = r3.f152729b
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                androidx.lifecycle.ac r0 = m120477x38cd6a92(r2, r1, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.setting.page.authmanager.C68212a.C68213a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_setting_page_authmanager_AuthAppInfoFragment$$special$$inlined$parentFragmentViewModel$1_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m120477x38cd6a92(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.page.authmanager.a$c */
    static final class View$OnClickListenerC68215c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C68212a f152731a;

        static {
            Covode.recordClassIndex(80417);
        }

        View$OnClickListenerC68215c(C68212a aVar) {
            this.f152731a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (this.f152731a.getParentFragment() != null && (this.f152731a.getParentFragment() instanceof AuthManagementPage)) {
                Fragment parentFragment = this.f152731a.getParentFragment();
                Objects.requireNonNull(parentFragment, "null cannot be cast to non-null type com.ss.android.ugc.aweme.setting.page.authmanager.AuthManagementPage");
                ((AuthManagementPage) parentFragment).mo108732e();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.page.authmanager.a$f */
    public static final class C68220f implements AbstractC88406ae<BaseResponse> {

        /* renamed from: a */
        final /* synthetic */ String f152737a;

        /* renamed from: b */
        final /* synthetic */ C68212a f152738b;

        static {
            Covode.recordClassIndex(80422);
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onSubscribe(AbstractC88412b bVar) {
            C89219l.m154721d(bVar, "");
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onError(Throwable th) {
            C89219l.m154721d(th, "");
            new C23144b(this.f152738b).mo37640e(R.string.dcq).mo37637b();
            this.f152738b.mo108736c().setVisibility(8);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.AbstractC88406ae
        public final /* synthetic */ void onSuccess(BaseResponse baseResponse) {
            Integer num;
            C89219l.m154721d(baseResponse, "");
            this.f152738b.mo108736c().setVisibility(8);
            AuthListViewModel b = this.f152738b.mo108735b();
            String str = this.f152737a;
            C89219l.m154721d(str, "");
            b.mo33689c(new AuthListViewModel.C68716f(str));
            Keva repo = Keva.getRepo("setting_repo_safe_view");
            C68177g gVar = AuthListApi.C67988a.m120301a().getAuthAppCount().get().f152623a;
            if (gVar != null) {
                num = gVar.getCount();
            } else {
                num = null;
            }
            if (num != null && num.intValue() == 0) {
                repo.storeBoolean("authorized_apps_entrance", false);
                ActivityC0945e activity = this.f152738b.getActivity();
                if (activity != null) {
                    activity.onBackPressed();
                }
            } else {
                repo.storeBoolean("authorized_apps_entrance", true);
            }
            if (this.f152738b.getParentFragment() != null && (this.f152738b.getParentFragment() instanceof AuthManagementPage)) {
                Fragment parentFragment = this.f152738b.getParentFragment();
                Objects.requireNonNull(parentFragment, "null cannot be cast to non-null type com.ss.android.ugc.aweme.setting.page.authmanager.AuthManagementPage");
                ((AuthManagementPage) parentFragment).mo108732e();
            }
        }

        C68220f(String str, C68212a aVar) {
            this.f152737a = str;
            this.f152738b = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.page.authmanager.a$d */
    static final class View$OnClickListenerC68216d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C68212a f152732a;

        static {
            Covode.recordClassIndex(80418);
        }

        View$OnClickListenerC68216d(C68212a aVar) {
            this.f152732a = aVar;
        }

        public final void onClick(final View view) {
            ClickAgent.onClick(view);
            C39162r.m79460a("settings_auth_click", new C33744d().mo59983a("auth_app", C68212a.f152720b).mo59983a("channel", C68212a.f152723e).f79943a);
            if (this.f152732a.getContext() != null) {
                C17197a.C17200a aVar = new C17197a.C17200a(this.f152732a.getContext());
                aVar.f41070a = C68212a.f152721c;
                aVar.f41071b = C68212a.f152722d;
                aVar.mo27190a(R.string.f_7, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(this) {
                    /* class com.p2082ss.android.ugc.aweme.setting.page.authmanager.C68212a.View$OnClickListenerC68216d.DialogInterface$OnClickListenerC682171 */

                    /* renamed from: a */
                    final /* synthetic */ View$OnClickListenerC68216d f152733a;

                    static {
                        Covode.recordClassIndex(80419);
                    }

                    {
                        this.f152733a = r1;
                    }

                    /* renamed from: a */
                    private static boolean m120480a() {
                        try {
                            return C34719f.C34720a.f82009a.mo61395c();
                        } catch (Exception unused) {
                            return false;
                        }
                    }

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                        View view = view;
                        C89219l.m154716b(view, "");
                        view.getContext();
                        if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
                            C58029j.f132256h = m120480a();
                        }
                        if (!C58029j.f132256h) {
                            new C23144b(this.f152733a.f152732a).mo37640e(R.string.dcq).mo37637b();
                            return;
                        }
                        C68212a aVar = this.f152733a.f152732a;
                        View view2 = view;
                        C89219l.m154716b(view2, "");
                        C89219l.m154716b(view2.getContext(), "");
                        String str = C68212a.f152723e;
                        if (str != null) {
                            AuthListViewModel b = aVar.mo108735b();
                            C89219l.m154721d(str, "");
                            C68169c cVar = b.f153716a;
                            C89219l.m154721d(str, "");
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            linkedHashMap.put("client_key", str);
                            AbstractC88403ab a = AbstractC88403ab.m153601a((AbstractC88984x) cVar.f152618c.mo33487c(linkedHashMap));
                            C89219l.m154716b(a, "");
                            a.mo142909a(C88391a.m153580a(C88392a.f200660a)).mo116431a_(new C68220f(str, aVar));
                        }
                        C39162r.m79460a("auth_out", new C33744d().mo59983a("auth_app", C68212a.f152720b).mo59983a("channel", C68212a.f152723e).mo59980a("is_register", C68212a.m120472e() ? 1 : 0).f79943a);
                    }
                }, false).mo27195b(R.string.a8y, (DialogInterface.OnClickListener) DialogInterface$OnClickListenerC682182.f152735a, false).mo27193a().mo27185c();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.page.authmanager.a$e */
    static final class C68219e<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C68212a f152736a;

        static {
            Covode.recordClassIndex(80421);
        }

        C68219e(C68212a aVar) {
            this.f152736a = aVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            MethodCollector.m26663i(2879);
            C68173c cVar = (C68173c) obj;
            C68212a.f152723e = cVar.getClientKey();
            TuxTextView tuxTextView = (TuxTextView) this.f152736a.mo60929a(R.id.mw);
            C89219l.m154716b(tuxTextView, "");
            tuxTextView.setText(cVar.getName());
            TuxTextView tuxTextView2 = (TuxTextView) this.f152736a.mo60929a(R.id.title_tv);
            C89219l.m154716b(tuxTextView2, "");
            tuxTextView2.setText(cVar.getName());
            TuxTextView tuxTextView3 = (TuxTextView) this.f152736a.mo60929a(R.id.mt);
            C89219l.m154716b(tuxTextView3, "");
            tuxTextView3.setText(cVar.getDesc());
            TuxTextView tuxTextView4 = (TuxTextView) this.f152736a.mo60929a(R.id.ms);
            C89219l.m154716b(tuxTextView4, "");
            tuxTextView4.setMovementMethod(LinkMovementMethod.getInstance());
            TuxTextView tuxTextView5 = (TuxTextView) this.f152736a.mo60929a(R.id.ms);
            C89219l.m154716b(tuxTextView5, "");
            String accessMsg = cVar.getAccessMsg();
            if (accessMsg == null) {
                accessMsg = "";
            }
            tuxTextView5.setText(new SpannableStringBuilder(Html.fromHtml(accessMsg)));
            C34577e.m70608b((RemoteImageView) this.f152736a.mo60929a(R.id.mv), cVar.getIcon(), -1, -1);
            TuxTextView tuxTextView6 = (TuxTextView) this.f152736a.mo60929a(R.id.kp);
            C89219l.m154716b(tuxTextView6, "");
            tuxTextView6.setText(cVar.getAuthorizedTimeText());
            if (!TextUtils.isEmpty(cVar.getStatus())) {
                TuxTextView tuxTextView7 = (TuxTextView) this.f152736a.mo60929a(R.id.mu);
                C89219l.m154716b(tuxTextView7, "");
                tuxTextView7.setText(cVar.getStatus());
                TuxTextView tuxTextView8 = (TuxTextView) this.f152736a.mo60929a(R.id.mu);
                C89219l.m154716b(tuxTextView8, "");
                tuxTextView8.setVisibility(0);
            } else {
                TuxTextView tuxTextView9 = (TuxTextView) this.f152736a.mo60929a(R.id.mu);
                C89219l.m154716b(tuxTextView9, "");
                tuxTextView9.setVisibility(8);
            }
            List<String> scopeNames = cVar.getScopeNames();
            if (scopeNames != null) {
                Iterator<T> it = scopeNames.iterator();
                while (it.hasNext()) {
                    View inflate = LayoutInflater.from(this.f152736a.getContext()).inflate(R.layout.ay5, (ViewGroup) null);
                    TextView textView = (TextView) inflate.findViewById(R.id.esi);
                    C89219l.m154716b(textView, "");
                    textView.setText(it.next());
                    ((LinearLayout) this.f152736a.mo60929a(R.id.dpu)).addView(inflate);
                }
            }
            String name = cVar.getName();
            if (name != null) {
                C89219l.m154721d(name, "");
                C68212a.f152720b = name;
            }
            String string = this.f152736a.getString(R.string.wi, cVar.getName());
            C89219l.m154716b(string, "");
            C68214b.m120479b(string);
            String removalPopupContent = cVar.getRemovalPopupContent();
            if (removalPopupContent != null && !TextUtils.isEmpty(removalPopupContent)) {
                C68214b.m120479b(removalPopupContent);
            }
            String string2 = this.f152736a.getString(R.string.wg, cVar.getName());
            C89219l.m154716b(string2, "");
            C68214b.m120478a(string2);
            String removalPopupTitle = cVar.getRemovalPopupTitle();
            if (removalPopupTitle != null) {
                if (!TextUtils.isEmpty(removalPopupTitle)) {
                    C68214b.m120478a(removalPopupTitle);
                }
                MethodCollector.m26664o(2879);
                return;
            }
            MethodCollector.m26664o(2879);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        ((AutoRTLImageView) mo60929a(R.id.pi)).setOnClickListener(new View$OnClickListenerC68215c(this));
        ((DmtButton) mo60929a(R.id.wt)).setOnClickListener(new View$OnClickListenerC68216d(this));
        mo108735b().f153717b.observe(this, new C68219e(this));
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.axy, viewGroup, false);
    }
}
