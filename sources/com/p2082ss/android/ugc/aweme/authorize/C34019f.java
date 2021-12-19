package com.p2082ss.android.ugc.aweme.authorize;

import android.content.Context;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.C0643b;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1181ae;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sdk.p1625a.p1631b.p1633b.AbstractC22335a;
import com.bytedance.sdk.p1625a.p1631b.p1634c.p1635a.C22338b;
import com.bytedance.sdk.p1625a.p1638c.p1639a.C22349c;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.authorize.network.C34029a;
import com.p2082ss.android.ugc.aweme.authorize.p2342a.C33979a;
import com.p2082ss.android.ugc.aweme.authorize.p2343b.C34001a;
import com.p2082ss.android.ugc.aweme.authorize.viewmodel.AuthCommonViewModel;
import com.p2082ss.android.ugc.aweme.authorize.viewmodel.C34038a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.openauthorize.AbstractC62716h;
import com.p2082ss.android.ugc.aweme.openauthorize.p3539a.C62700d;
import com.p2082ss.android.ugc.aweme.openauthorize.p3539a.C62701e;
import com.p2082ss.android.ugc.aweme.openauthorize.p3539a.C62703g;
import com.p2082ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.List;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.authorize.f */
public final class C34019f extends Fragment implements AbstractC62716h {

    /* renamed from: f */
    public static final C34020a f80455f = new C34020a((byte) 0);

    /* renamed from: a */
    public String f80456a;

    /* renamed from: b */
    public AuthCommonViewModel f80457b;

    /* renamed from: c */
    public C62700d f80458c;

    /* renamed from: d */
    public String f80459d;

    /* renamed from: e */
    public String f80460e;

    /* renamed from: g */
    private C22349c.C22350a f80461g;

    /* renamed from: h */
    private int f80462h;

    /* renamed from: i */
    private AwemeAuthorizePlatformDepend f80463i;

    /* renamed from: j */
    private AbstractC22335a.AbstractC22336a f80464j;

    /* renamed from: k */
    private String f80465k;

    /* renamed from: l */
    private SparseArray f80466l;

    static {
        Covode.recordClassIndex(40951);
    }

    /* renamed from: a */
    private View m69600a(int i) {
        if (this.f80466l == null) {
            this.f80466l = new SparseArray();
        }
        View view = (View) this.f80466l.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f80466l.put(i, findViewById);
        return findViewById;
    }

    /* renamed from: com.ss.android.ugc.aweme.authorize.f$a */
    public static final class C34020a {
        static {
            Covode.recordClassIndex(40952);
        }

        private C34020a() {
        }

        public /* synthetic */ C34020a(byte b) {
            this();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f80466l;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: a */
    public final String mo60302a() {
        C22349c.C22350a aVar = this.f80461g;
        if (aVar == null) {
            C89219l.m154710a("request");
        }
        return aVar.f52809c;
    }

    /* renamed from: com.ss.android.ugc.aweme.authorize.f$d */
    static final class View$OnClickListenerC34023d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C34019f f80470a;

        static {
            Covode.recordClassIndex(40955);
        }

        View$OnClickListenerC34023d(C34019f fVar) {
            this.f80470a = fVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C34019f.m69601a(this.f80470a).mo60316a(false, true);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ AuthCommonViewModel m69601a(C34019f fVar) {
        AuthCommonViewModel authCommonViewModel = fVar.f80457b;
        if (authCommonViewModel == null) {
            C89219l.m154710a("viewModel");
        }
        return authCommonViewModel;
    }

    /* renamed from: com.ss.android.ugc.aweme.authorize.f$b */
    public static final class C34021b extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ C34019f f80467a;

        /* renamed from: b */
        final /* synthetic */ URLSpan f80468b;

        static {
            Covode.recordClassIndex(40953);
        }

        public final void onClick(View view) {
            C89219l.m154721d(view, "");
            Context context = this.f80467a.getContext();
            if (context == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(context, "");
            String url = this.f80468b.getURL();
            C89219l.m154716b(url, "");
            C34001a.m69591a(context, url);
        }

        public final void updateDrawState(TextPaint textPaint) {
            C89219l.m154721d(textPaint, "");
            Context context = this.f80467a.getContext();
            if (context == null) {
                C89219l.m154715b();
            }
            textPaint.setColor(C0643b.m2378c(context, R.color.bx));
            textPaint.setUnderlineText(false);
        }

        C34021b(C34019f fVar, URLSpan uRLSpan) {
            this.f80467a = fVar;
            this.f80468b = uRLSpan;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.authorize.f$c */
    static final class View$OnClickListenerC34022c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C34019f f80469a;

        static {
            Covode.recordClassIndex(40954);
        }

        View$OnClickListenerC34022c(C34019f fVar) {
            this.f80469a = fVar;
        }

        public final void onClick(View view) {
            List<C62703g> list;
            C62701e pageDetail;
            ClickAgent.onClick(view);
            C39162r.m79460a("auth_submit", new C33744d().mo59983a("auth_app", this.f80469a.f80456a).mo59983a("channel", this.f80469a.mo60302a()).f79943a);
            C34019f.m69601a(this.f80469a).mo60316a(true, false);
            C62700d dVar = this.f80469a.f80458c;
            if (dVar == null || (pageDetail = dVar.getPageDetail()) == null) {
                list = null;
            } else {
                list = pageDetail.getScopeList();
            }
            StringBuilder sb = new StringBuilder();
            if (list != null) {
                for (C62703g gVar : list) {
                    if (gVar.isEnabled() == null || C89219l.m154714a((Object) gVar.isEnabled(), (Object) true)) {
                        sb.append(gVar.getScopeName());
                        sb.append(",");
                    }
                }
                sb.setLength(sb.length() - 1);
            }
            AuthCommonViewModel a = C34019f.m69601a(this.f80469a);
            String str = this.f80469a.f80459d;
            if (str == null) {
                C89219l.m154710a("clientKey");
            }
            String sb2 = sb.toString();
            C89219l.m154716b(sb2, "");
            String str2 = this.f80469a.f80460e;
            C89219l.m154721d(str, "");
            C89219l.m154721d(sb2, "");
            C89219l.m154721d("web", "");
            AuthCommonViewModel.C34030a aVar = new AuthCommonViewModel.C34030a(a);
            C89219l.m154721d(str, "");
            C89219l.m154721d(sb2, "");
            C89219l.m154721d("web", "");
            C89219l.m154721d(aVar, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(sb2, "");
            C89219l.m154721d("web", "");
            C34029a.f80478a.confirmBCAuthorize(str, sb2, "web", str2).mo142918b(C88925a.m154180b(C88946a.f201991c)).mo142909a(C88391a.m153580a(C88392a.f200660a)).mo116431a_(new C33979a.C33981b(aVar));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Bundle bundle2;
        Serializable serializable;
        int i;
        String str;
        String string;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        String str2 = null;
        if (arguments != null) {
            bundle2 = arguments.getBundle("_bytedance_params_extra");
        } else {
            bundle2 = null;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            serializable = arguments2.getSerializable("auth_page_info");
        } else {
            serializable = null;
        }
        this.f80458c = (C62700d) serializable;
        this.f80461g = new C22349c.C22350a(getArguments());
        this.f80463i = new AwemeAuthorizePlatformDepend(this);
        Context context = getContext();
        AwemeAuthorizePlatformDepend awemeAuthorizePlatformDepend = this.f80463i;
        if (awemeAuthorizePlatformDepend == null) {
            C89219l.m154710a("depend");
        }
        this.f80464j = new C22338b(context, awemeAuthorizePlatformDepend);
        if (bundle2 != null) {
            i = bundle2.getInt("authType");
        } else {
            i = 0;
        }
        this.f80462h = i;
        AwemeAuthorizePlatformDepend awemeAuthorizePlatformDepend2 = this.f80463i;
        if (awemeAuthorizePlatformDepend2 == null) {
            C89219l.m154710a("depend");
        }
        AbstractC22335a.AbstractC22336a aVar = this.f80464j;
        if (aVar == null) {
            C89219l.m154710a("model");
        }
        C22349c.C22350a aVar2 = this.f80461g;
        if (aVar2 == null) {
            C89219l.m154710a("request");
        }
        C34038a aVar3 = new C34038a(awemeAuthorizePlatformDepend2, aVar, aVar2);
        ActivityC0945e activity = getActivity();
        if (activity == null) {
            C89219l.m154715b();
        }
        AbstractC1174ac a = C1181ae.m3881a(activity, aVar3).mo3983a(AuthCommonViewModel.class);
        String str3 = "";
        C89219l.m154716b(a, str3);
        this.f80457b = (AuthCommonViewModel) a;
        Bundle arguments3 = getArguments();
        if (arguments3 == null || (str = arguments3.getString("ticket_response")) == null) {
            str = str3;
        }
        this.f80465k = str;
        Bundle arguments4 = getArguments();
        if (arguments4 != null) {
            str2 = arguments4.getString("key_qrcode_redirect_uri");
        }
        this.f80460e = str2;
        Bundle arguments5 = getArguments();
        if (!(arguments5 == null || (string = arguments5.getString("client_key")) == null)) {
            str3 = string;
        }
        this.f80459d = str3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0274, code lost:
        if (r6 != null) goto L_0x0060;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0296  */
    @Override // androidx.fragment.app.Fragment
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r17, android.os.Bundle r18) {
        /*
        // Method dump skipped, instructions count: 886
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.authorize.C34019f.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        MethodCollector.m26663i(10860);
        C89219l.m154721d(layoutInflater, "");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.b1, (ViewGroup) null);
        MethodCollector.m26664o(10860);
        return inflate;
    }
}
