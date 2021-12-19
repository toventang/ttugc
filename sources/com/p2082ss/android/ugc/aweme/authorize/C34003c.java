package com.p2082ss.android.ugc.aweme.authorize;

import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.C0643b;
import androidx.fragment.app.AbstractC0976n;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1181ae;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.widget.DmtButton;
import com.bytedance.sdk.p1625a.p1631b.p1633b.AbstractC22335a;
import com.bytedance.sdk.p1625a.p1631b.p1634c.p1635a.C22338b;
import com.bytedance.sdk.p1625a.p1638c.p1639a.C22349c;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.authorize.network.C34029a;
import com.p2082ss.android.ugc.aweme.authorize.p2342a.C33979a;
import com.p2082ss.android.ugc.aweme.authorize.p2343b.C34001a;
import com.p2082ss.android.ugc.aweme.authorize.viewmodel.AuthCommonViewModel;
import com.p2082ss.android.ugc.aweme.authorize.viewmodel.C34038a;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.openauthorize.AbstractC62716h;
import com.p2082ss.android.ugc.aweme.openauthorize.p3539a.C62699c;
import com.p2082ss.android.ugc.aweme.openauthorize.p3539a.C62700d;
import com.p2082ss.android.ugc.aweme.openauthorize.p3539a.C62701e;
import com.p2082ss.android.ugc.aweme.openauthorize.p3539a.C62702f;
import com.p2082ss.android.ugc.aweme.openauthorize.p3539a.C62703g;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4601a.C89036ab;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.authorize.c */
public final class C34003c extends Fragment implements AbstractC62716h {

    /* renamed from: g */
    public static final C34004a f80419g = new C34004a((byte) 0);

    /* renamed from: a */
    public String f80420a;

    /* renamed from: b */
    public C22349c.C22350a f80421b;

    /* renamed from: c */
    public AuthCommonViewModel f80422c;

    /* renamed from: d */
    public C62700d f80423d;

    /* renamed from: e */
    public boolean f80424e;

    /* renamed from: f */
    public String f80425f = "";

    /* renamed from: h */
    private int f80426h;

    /* renamed from: i */
    private AwemeAuthorizePlatformDepend f80427i;

    /* renamed from: j */
    private AbstractC22335a.AbstractC22336a f80428j;

    /* renamed from: k */
    private String f80429k;

    /* renamed from: l */
    private SparseArray f80430l;

    static {
        Covode.recordClassIndex(40935);
    }

    /* renamed from: a */
    private View m69593a(int i) {
        if (this.f80430l == null) {
            this.f80430l = new SparseArray();
        }
        View view = (View) this.f80430l.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f80430l.put(i, findViewById);
        return findViewById;
    }

    /* renamed from: com.ss.android.ugc.aweme.authorize.c$a */
    public static final class C34004a {
        static {
            Covode.recordClassIndex(40936);
        }

        private C34004a() {
        }

        public /* synthetic */ C34004a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C34003c m69596a(Bundle bundle, String str) {
            C34003c cVar = new C34003c();
            if (bundle != null) {
                bundle.putString("caller_signature_key", str);
            }
            cVar.setArguments(bundle);
            return cVar;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f80430l;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: a */
    public final String mo60288a() {
        C22349c.C22350a aVar = this.f80421b;
        if (aVar == null) {
            C89219l.m154710a("request");
        }
        return aVar.f52809c;
    }

    /* renamed from: com.ss.android.ugc.aweme.authorize.c$d */
    static final class View$OnClickListenerC34007d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C34003c f80434a;

        static {
            Covode.recordClassIndex(40939);
        }

        View$OnClickListenerC34007d(C34003c cVar) {
            this.f80434a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C34003c.m69594a(this.f80434a).mo60316a(false, true);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ AuthCommonViewModel m69594a(C34003c cVar) {
        AuthCommonViewModel authCommonViewModel = cVar.f80422c;
        if (authCommonViewModel == null) {
            C89219l.m154710a("viewModel");
        }
        return authCommonViewModel;
    }

    /* renamed from: com.ss.android.ugc.aweme.authorize.c$b */
    public static final class C34005b extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ C34003c f80431a;

        /* renamed from: b */
        final /* synthetic */ URLSpan f80432b;

        static {
            Covode.recordClassIndex(40937);
        }

        public final void onClick(View view) {
            C89219l.m154721d(view, "");
            Context context = this.f80431a.getContext();
            if (context == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(context, "");
            String url = this.f80432b.getURL();
            C89219l.m154716b(url, "");
            C34001a.m69591a(context, url);
        }

        public final void updateDrawState(TextPaint textPaint) {
            C89219l.m154721d(textPaint, "");
            Context context = this.f80431a.getContext();
            if (context == null) {
                C89219l.m154715b();
            }
            textPaint.setColor(C0643b.m2378c(context, R.color.bx));
            textPaint.setUnderlineText(false);
        }

        C34005b(C34003c cVar, URLSpan uRLSpan) {
            this.f80431a = cVar;
            this.f80432b = uRLSpan;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.authorize.c$e */
    static final class View$OnClickListenerC34008e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C34003c f80435a;

        static {
            Covode.recordClassIndex(40940);
        }

        View$OnClickListenerC34008e(C34003c cVar) {
            this.f80435a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (this.f80435a.getParentFragment() instanceof C33985b) {
                Fragment parentFragment = this.f80435a.getParentFragment();
                Objects.requireNonNull(parentFragment, "null cannot be cast to non-null type com.ss.android.ugc.aweme.authorize.BaseI18nAuthorizedFragment");
                C33985b bVar = (C33985b) parentFragment;
                C39162r.m79460a("edit_auth_access", new C33744d().mo59983a("channel", bVar.mo60275a()).mo59983a("enter_from", "authorize_screen").mo59983a("auth_app", bVar.f80388j).f79943a);
                Bundle arguments = bVar.getArguments();
                C34014e eVar = new C34014e();
                eVar.setArguments(arguments);
                C33985b.f80377q = eVar;
                AbstractC0976n a = bVar.getChildFragmentManager().mo3552a();
                Fragment fragment = C33985b.f80377q;
                if (fragment == null) {
                    C89219l.m154715b();
                }
                a.mo3469b(R.id.b8g, fragment).mo3467b();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.authorize.c$c */
    static final class View$OnClickListenerC34006c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C34003c f80433a;

        static {
            Covode.recordClassIndex(40938);
        }

        View$OnClickListenerC34006c(C34003c cVar) {
            this.f80433a = cVar;
        }

        public final void onClick(View view) {
            List<C62703g> list;
            C62701e pageDetail;
            ClickAgent.onClick(view);
            C39162r.m79460a("auth_submit", new C33744d().mo59983a("auth_app", this.f80433a.f80420a).mo59983a("channel", this.f80433a.mo60288a()).f79943a);
            C34003c.m69594a(this.f80433a).mo60316a(true, false);
            if (this.f80433a.f80424e) {
                C62700d dVar = this.f80433a.f80423d;
                if (dVar == null || (pageDetail = dVar.getPageDetail()) == null) {
                    list = null;
                } else {
                    list = pageDetail.getScopeList();
                }
                StringBuilder sb = new StringBuilder();
                if (list == null) {
                    C89219l.m154715b();
                }
                for (C62703g gVar : list) {
                    if (gVar.isEnabled() == null || C89219l.m154714a((Object) gVar.isEnabled(), (Object) true)) {
                        sb.append(gVar.getScopeName());
                        sb.append(",");
                    }
                }
                if (sb.length() > 0) {
                    sb.setLength(sb.length() - 1);
                }
                AuthCommonViewModel a = C34003c.m69594a(this.f80433a);
                String str = this.f80433a.f80425f;
                String sb2 = sb.toString();
                C89219l.m154716b(sb2, "");
                C89219l.m154721d(str, "");
                C89219l.m154721d(sb2, "");
                AuthCommonViewModel.C34031b bVar = new AuthCommonViewModel.C34031b(a);
                C89219l.m154721d(str, "");
                C89219l.m154721d(sb2, "");
                C89219l.m154721d(bVar, "");
                C89219l.m154721d(str, "");
                C89219l.m154721d(sb2, "");
                C34029a.f80478a.confirmQroceAuthorize(str, sb2).mo142918b(C88925a.m154180b(C88946a.f201991c)).mo142909a(C88391a.m153580a(C88392a.f200660a)).mo116431a_(new C33979a.C33982c(bVar));
                return;
            }
            AuthCommonViewModel a2 = C34003c.m69594a(this.f80433a);
            C22349c.C22350a aVar = this.f80433a.f80421b;
            if (aVar == null) {
                C89219l.m154710a("request");
            }
            a2.mo60314a(aVar);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Bundle bundle2;
        int i;
        String str;
        String string;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        Serializable serializable = null;
        if (arguments != null) {
            bundle2 = arguments.getBundle("_bytedance_params_extra");
        } else {
            bundle2 = null;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            serializable = arguments2.getSerializable("auth_page_info");
        }
        this.f80423d = (C62700d) serializable;
        this.f80421b = new C22349c.C22350a(getArguments());
        this.f80427i = new AwemeAuthorizePlatformDepend(this);
        Context context = getContext();
        AwemeAuthorizePlatformDepend awemeAuthorizePlatformDepend = this.f80427i;
        if (awemeAuthorizePlatformDepend == null) {
            C89219l.m154710a("depend");
        }
        this.f80428j = new C22338b(context, awemeAuthorizePlatformDepend);
        boolean z = false;
        if (bundle2 != null) {
            i = bundle2.getInt("authType");
        } else {
            i = 0;
        }
        this.f80426h = i;
        AwemeAuthorizePlatformDepend awemeAuthorizePlatformDepend2 = this.f80427i;
        if (awemeAuthorizePlatformDepend2 == null) {
            C89219l.m154710a("depend");
        }
        AbstractC22335a.AbstractC22336a aVar = this.f80428j;
        if (aVar == null) {
            C89219l.m154710a("model");
        }
        C22349c.C22350a aVar2 = this.f80421b;
        if (aVar2 == null) {
            C89219l.m154710a("request");
        }
        C34038a aVar3 = new C34038a(awemeAuthorizePlatformDepend2, aVar, aVar2);
        ActivityC0945e activity = getActivity();
        if (activity == null) {
            C89219l.m154715b();
        }
        AbstractC1174ac a = C1181ae.m3881a(activity, aVar3).mo3983a(AuthCommonViewModel.class);
        String str2 = "";
        C89219l.m154716b(a, str2);
        this.f80422c = (AuthCommonViewModel) a;
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            z = arguments3.getBoolean("key_qrcode_auth", false);
        }
        this.f80424e = z;
        Bundle arguments4 = getArguments();
        if (arguments4 == null || (str = arguments4.getString("key_qrcode_token")) == null) {
            str = str2;
        }
        this.f80425f = str;
        Bundle arguments5 = getArguments();
        if (!(arguments5 == null || (string = arguments5.getString("ticket_response")) == null)) {
            str2 = string;
        }
        this.f80429k = str2;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        List<C62702f> list;
        String str2;
        C62701e pageDetail;
        List<C62703g> scopeList;
        String str3;
        String textContent;
        String textContent2;
        String textContent3;
        String textContent4;
        String textContent5;
        String textContent6;
        C62701e pageDetail2;
        C62699c clientInfo;
        C62701e pageDetail3;
        C62701e pageDetail4;
        C62699c clientInfo2;
        MethodCollector.m26663i(9792);
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        C62700d dVar = this.f80423d;
        RelativeLayout relativeLayout = (RelativeLayout) m69593a(R.id.ad6);
        C89219l.m154716b(relativeLayout, "");
        relativeLayout.setVisibility(0);
        C34577e.m70591a((RemoteImageView) m69593a(R.id.ehk), 2131232137);
        RemoteImageView remoteImageView = (RemoteImageView) m69593a(R.id.bhc);
        if (dVar == null || (pageDetail4 = dVar.getPageDetail()) == null || (clientInfo2 = pageDetail4.getClientInfo()) == null) {
            str = null;
        } else {
            str = clientInfo2.getClientIcon();
        }
        C34577e.m70608b(remoteImageView, str, -1, -1);
        if (dVar == null || (pageDetail3 = dVar.getPageDetail()) == null) {
            list = null;
        } else {
            list = pageDetail3.getTextList();
        }
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        User curUser = g.getCurUser();
        C89219l.m154716b(curUser, "");
        if (curUser.getUniqueId() == null) {
            IAccountUserService g2 = C31575b.m65865g();
            C89219l.m154716b(g2, "");
            User curUser2 = g2.getCurUser();
            C89219l.m154716b(curUser2, "");
            curUser2.getShortId();
        }
        if (dVar == null || (pageDetail2 = dVar.getPageDetail()) == null || (clientInfo = pageDetail2.getClientInfo()) == null) {
            str2 = null;
        } else {
            str2 = clientInfo.getClientName();
        }
        this.f80420a = str2;
        C39162r.m79460a("auth_notify", new C33744d().mo59983a("auth_app", this.f80420a).mo59983a("channel", mo60288a()).mo59983a("enter_from", "developer").f79943a);
        int i = R.id.f8g;
        TuxTextView tuxTextView = (TuxTextView) m69593a(R.id.f8g);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setMovementMethod(LinkMovementMethod.getInstance());
        int i2 = R.id.x4;
        if (list != null) {
            for (C62702f fVar : list) {
                if (TextUtils.equals(fVar.getTextKey(), "key_authorized_pattern_desc")) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(Html.fromHtml(fVar.getTextContent()));
                    TuxTextView tuxTextView2 = (TuxTextView) m69593a(R.id.f89);
                    C89219l.m154716b(tuxTextView2, "");
                    tuxTextView2.setText(spannableStringBuilder);
                }
                if (TextUtils.equals(fVar.getTextKey(), "key_policy_title") && (textContent6 = fVar.getTextContent()) != null) {
                    TuxTextView tuxTextView3 = (TuxTextView) m69593a(R.id.f8f);
                    C89219l.m154716b(tuxTextView3, "");
                    tuxTextView3.setText(textContent6);
                }
                if (TextUtils.equals(fVar.getTextKey(), "key_authorized_scope_title") && (textContent5 = fVar.getTextContent()) != null) {
                    TuxTextView tuxTextView4 = (TuxTextView) m69593a(i);
                    C89219l.m154716b(tuxTextView4, "");
                    tuxTextView4.setText(new SpannableStringBuilder(Html.fromHtml(textContent5)));
                }
                if (TextUtils.equals(fVar.getTextKey(), "key_edit_access_desc") && (textContent4 = fVar.getTextContent()) != null) {
                    TuxTextView tuxTextView5 = (TuxTextView) m69593a(R.id.f7x);
                    C89219l.m154716b(tuxTextView5, "");
                    tuxTextView5.setText(new SpannableStringBuilder(textContent4));
                }
                if (TextUtils.equals(fVar.getTextKey(), "key_authorize_confirm") && (textContent3 = fVar.getTextContent()) != null) {
                    DmtButton dmtButton = (DmtButton) m69593a(R.id.y9);
                    C89219l.m154716b(dmtButton, "");
                    dmtButton.setText(new SpannableStringBuilder(textContent3));
                }
                if (TextUtils.equals(fVar.getTextKey(), "key_authorize_cancel") && (textContent2 = fVar.getTextContent()) != null) {
                    TuxTextView tuxTextView6 = (TuxTextView) m69593a(i2);
                    C89219l.m154716b(tuxTextView6, "");
                    tuxTextView6.setText(new SpannableStringBuilder(textContent2));
                }
                if (TextUtils.equals(fVar.getTextKey(), "key_policy_authorized_desc") && (textContent = fVar.getTextContent()) != null) {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(Html.fromHtml(textContent));
                    URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder2.getSpans(0, textContent.length(), URLSpan.class);
                    for (URLSpan uRLSpan : uRLSpanArr) {
                        C89219l.m154716b(uRLSpan, "");
                        spannableStringBuilder2.setSpan(new C34005b(this, uRLSpan), spannableStringBuilder2.getSpanStart(uRLSpan), spannableStringBuilder2.getSpanEnd(uRLSpan), spannableStringBuilder2.getSpanFlags(uRLSpan));
                        spannableStringBuilder2.removeSpan(uRLSpan);
                    }
                    TuxTextView tuxTextView7 = (TuxTextView) m69593a(R.id.f8m);
                    C89219l.m154716b(tuxTextView7, "");
                    Context context = getContext();
                    if (context == null) {
                        C89219l.m154715b();
                    }
                    tuxTextView7.setHighlightColor(C0643b.m2378c(context, R.color.c9));
                    TuxTextView tuxTextView8 = (TuxTextView) m69593a(R.id.f8m);
                    C89219l.m154716b(tuxTextView8, "");
                    tuxTextView8.setText(spannableStringBuilder2);
                    TuxTextView tuxTextView9 = (TuxTextView) m69593a(R.id.f8m);
                    C89219l.m154716b(tuxTextView9, "");
                    tuxTextView9.setMovementMethod(LinkMovementMethod.getInstance());
                }
                i = R.id.f8g;
                i2 = R.id.x4;
            }
        }
        if (!(dVar == null || (pageDetail = dVar.getPageDetail()) == null || (scopeList = pageDetail.getScopeList()) == null)) {
            for (C62703g gVar : scopeList) {
                String scopeName = gVar.getScopeName();
                String scopeDesc = gVar.getScopeDesc();
                Bundle arguments = getArguments();
                if (arguments != null) {
                    str3 = arguments.getString("_bytedance_params_scope");
                } else {
                    str3 = null;
                }
                Iterable iterable = C89036ab.INSTANCE;
                if (str3 != null) {
                    List<String> c = C89361p.m154921c(str3, new String[]{","});
                    ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) c, 10));
                    for (String str4 : c) {
                        if (str4 != null) {
                            arrayList.add(C89361p.m154910b((CharSequence) str4).toString());
                        } else {
                            NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                            MethodCollector.m26664o(9792);
                            throw nullPointerException;
                        }
                    }
                    iterable = C89070n.m154592l(arrayList);
                }
                if (!TextUtils.isEmpty(scopeName) && !TextUtils.isEmpty(scopeDesc) && C89070n.m154556a(iterable, scopeName)) {
                    View a = C1764a.m5927a(LayoutInflater.from(getContext()), R.layout.aan, (ViewGroup) m69593a(R.id.dpw), false);
                    TextView textView = (TextView) a.findViewById(R.id.esi);
                    C89219l.m154716b(textView, "");
                    textView.setText(scopeDesc);
                    ((LinearLayout) m69593a(R.id.dpw)).addView(a);
                }
            }
        }
        ((DmtButton) m69593a(R.id.y9)).setOnClickListener(new View$OnClickListenerC34006c(this));
        ((TuxTextView) m69593a(R.id.x4)).setOnClickListener(new View$OnClickListenerC34007d(this));
        ((LinearLayout) m69593a(R.id.aqw)).setOnClickListener(new View$OnClickListenerC34008e(this));
        MethodCollector.m26664o(9792);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        MethodCollector.m26663i(9646);
        C89219l.m154721d(layoutInflater, "");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.b1, (ViewGroup) null);
        MethodCollector.m26664o(9646);
        return inflate;
    }
}
