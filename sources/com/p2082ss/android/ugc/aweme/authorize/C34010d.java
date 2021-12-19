package com.p2082ss.android.ugc.aweme.authorize;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1181ae;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sdk.p1625a.p1631b.p1633b.AbstractC22335a;
import com.bytedance.sdk.p1625a.p1631b.p1634c.p1635a.C22338b;
import com.bytedance.sdk.p1625a.p1638c.p1639a.C22349c;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.authorize.viewmodel.AuthCommonViewModel;
import com.p2082ss.android.ugc.aweme.authorize.viewmodel.C34038a;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.openauthorize.AbstractC62716h;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.utils.C80581io;
import com.p2082ss.android.ugc.trill.R;
import java.util.Arrays;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.authorize.d */
public final class C34010d extends Fragment implements AbstractC62716h {

    /* renamed from: c */
    public static final C34011a f80436c = new C34011a((byte) 0);

    /* renamed from: a */
    public AuthCommonViewModel f80437a;

    /* renamed from: b */
    public C22349c.C22350a f80438b;

    /* renamed from: d */
    private AwemeAuthorizePlatformDepend f80439d;

    /* renamed from: e */
    private AbstractC22335a.AbstractC22336a f80440e;

    /* renamed from: f */
    private String f80441f;

    /* renamed from: g */
    private SparseArray f80442g;

    static {
        Covode.recordClassIndex(40942);
    }

    /* renamed from: a */
    private View m69597a(int i) {
        if (this.f80442g == null) {
            this.f80442g = new SparseArray();
        }
        View view = (View) this.f80442g.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f80442g.put(i, findViewById);
        return findViewById;
    }

    /* renamed from: com.ss.android.ugc.aweme.authorize.d$a */
    public static final class C34011a {
        static {
            Covode.recordClassIndex(40943);
        }

        private C34011a() {
        }

        public /* synthetic */ C34011a(byte b) {
            this();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f80442g;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.authorize.d$c */
    static final class View$OnClickListenerC34013c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C34010d f80444a;

        static {
            Covode.recordClassIndex(40945);
        }

        View$OnClickListenerC34013c(C34010d dVar) {
            this.f80444a = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C34010d.m69598a(this.f80444a).mo60316a(false, true);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ AuthCommonViewModel m69598a(C34010d dVar) {
        AuthCommonViewModel authCommonViewModel = dVar.f80437a;
        if (authCommonViewModel == null) {
            C89219l.m154710a("viewModel");
        }
        return authCommonViewModel;
    }

    /* renamed from: com.ss.android.ugc.aweme.authorize.d$b */
    static final class View$OnClickListenerC34012b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C34010d f80443a;

        static {
            Covode.recordClassIndex(40944);
        }

        View$OnClickListenerC34012b(C34010d dVar) {
            this.f80443a = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AuthCommonViewModel a = C34010d.m69598a(this.f80443a);
            C22349c.C22350a aVar = this.f80443a.f80438b;
            if (aVar == null) {
                C89219l.m154710a("request");
            }
            a.mo60314a(aVar);
            C34010d.m69598a(this.f80443a).mo60316a(true, false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        this.f80438b = new C22349c.C22350a(getArguments());
        this.f80439d = new AwemeAuthorizePlatformDepend(this);
        Context context = getContext();
        AwemeAuthorizePlatformDepend awemeAuthorizePlatformDepend = this.f80439d;
        if (awemeAuthorizePlatformDepend == null) {
            C89219l.m154710a("depend");
        }
        this.f80440e = new C22338b(context, awemeAuthorizePlatformDepend);
        AwemeAuthorizePlatformDepend awemeAuthorizePlatformDepend2 = this.f80439d;
        if (awemeAuthorizePlatformDepend2 == null) {
            C89219l.m154710a("depend");
        }
        AbstractC22335a.AbstractC22336a aVar = this.f80440e;
        if (aVar == null) {
            C89219l.m154710a("model");
        }
        C22349c.C22350a aVar2 = this.f80438b;
        if (aVar2 == null) {
            C89219l.m154710a("request");
        }
        C34038a aVar3 = new C34038a(awemeAuthorizePlatformDepend2, aVar, aVar2);
        ActivityC0945e activity = getActivity();
        if (activity == null) {
            C89219l.m154715b();
        }
        AbstractC1174ac a = C1181ae.m3881a(activity, aVar3).mo3983a(AuthCommonViewModel.class);
        String str = "";
        C89219l.m154716b(a, str);
        this.f80437a = (AuthCommonViewModel) a;
        Bundle arguments = getArguments();
        if (!(arguments == null || (string = arguments.getString("ticket_response")) == null)) {
            str = string;
        }
        this.f80441f = str;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        if (getContext() != null) {
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            User curUser = g.getCurUser();
            if (curUser != null) {
                C34577e.m70592a((RemoteImageView) m69597a(R.id.c_k), curUser.getAvatarThumb());
                TuxTextView tuxTextView = (TuxTextView) m69597a(R.id.c_l);
                C89219l.m154716b(tuxTextView, "");
                tuxTextView.setText(curUser.getNickname());
                String uniqueId = curUser.getUniqueId();
                TuxTextView tuxTextView2 = (TuxTextView) m69597a(R.id.c_n);
                C89219l.m154716b(tuxTextView2, "");
                tuxTextView2.setText("@".concat(String.valueOf(uniqueId)));
                C80581io.m139704a(getContext(), curUser.getCustomVerify(), curUser.getEnterpriseVerifyReason(), (TextView) m69597a(R.id.c_n));
                TuxTextView tuxTextView3 = (TuxTextView) m69597a(R.id.c_j);
                C89219l.m154716b(tuxTextView3, "");
                String string = getResources().getString(R.string.gcj);
                C89219l.m154716b(string, "");
                String a = C1764a.m5928a(string, Arrays.copyOf(new Object[]{curUser.getUniqueId()}, 1));
                C89219l.m154716b(a, "");
                tuxTextView3.setText(a);
                ((TuxTextView) m69597a(R.id.c_j)).setOnClickListener(new View$OnClickListenerC34012b(this));
                ((TuxTextView) m69597a(R.id.c_i)).setOnClickListener(new View$OnClickListenerC34013c(this));
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        MethodCollector.m26663i(9571);
        C89219l.m154721d(layoutInflater, "");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.bi, (ViewGroup) null);
        MethodCollector.m26664o(9571);
        return inflate;
    }
}
