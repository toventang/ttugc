package com.p2082ss.android.ugc.aweme.authorize;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1181ae;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.sdk.p1625a.p1631b.p1633b.AbstractC22335a;
import com.bytedance.sdk.p1625a.p1631b.p1634c.p1635a.C22338b;
import com.bytedance.sdk.p1625a.p1638c.p1639a.C22349c;
import com.p2082ss.android.ugc.aweme.authorize.viewmodel.AuthCommonViewModel;
import com.p2082ss.android.ugc.aweme.authorize.viewmodel.C34038a;
import com.p2082ss.android.ugc.aweme.openauthorize.AbstractC62716h;
import com.p2082ss.android.ugc.aweme.views.AutoRTLImageView;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.authorize.e */
public final class C34014e extends Fragment implements AbstractC62716h {

    /* renamed from: b */
    public static final C34015a f80445b = new C34015a((byte) 0);

    /* renamed from: a */
    public C34024g f80446a;

    /* renamed from: c */
    private C22349c.C22350a f80447c;

    /* renamed from: d */
    private AuthCommonViewModel f80448d;

    /* renamed from: e */
    private AwemeAuthorizePlatformDepend f80449e;

    /* renamed from: f */
    private AbstractC22335a.AbstractC22336a f80450f;

    /* renamed from: g */
    private SparseArray f80451g;

    static {
        Covode.recordClassIndex(40946);
    }

    /* renamed from: a */
    public final View mo60299a(int i) {
        if (this.f80451g == null) {
            this.f80451g = new SparseArray();
        }
        View view = (View) this.f80451g.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f80451g.put(i, findViewById);
        return findViewById;
    }

    /* renamed from: com.ss.android.ugc.aweme.authorize.e$a */
    public static final class C34015a {
        static {
            Covode.recordClassIndex(40947);
        }

        private C34015a() {
        }

        public /* synthetic */ C34015a(byte b) {
            this();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f80451g;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.authorize.e$b */
    static final class View$OnClickListenerC34016b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C34014e f80452a;

        static {
            Covode.recordClassIndex(40948);
        }

        View$OnClickListenerC34016b(C34014e eVar) {
            this.f80452a = eVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            ((DmtStatusView) this.f80452a.mo60299a(R.id.e77)).mo27387h();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.authorize.e$c */
    static final class View$OnClickListenerC34017c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C34014e f80453a;

        static {
            Covode.recordClassIndex(40949);
        }

        View$OnClickListenerC34017c(C34014e eVar) {
            this.f80453a = eVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C34014e eVar = this.f80453a;
            if (eVar.getParentFragment() instanceof C33985b) {
                Fragment parentFragment = eVar.getParentFragment();
                Objects.requireNonNull(parentFragment, "null cannot be cast to non-null type com.ss.android.ugc.aweme.authorize.BaseI18nAuthorizedFragment");
                ((C33985b) parentFragment).mo60279b();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.authorize.e$d */
    static final class C34018d<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C34014e f80454a;

        static {
            Covode.recordClassIndex(40950);
        }

        C34018d(C34014e eVar) {
            this.f80454a = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            List list = (List) obj;
            C34024g gVar = this.f80454a.f80446a;
            if (gVar == null) {
                C89219l.m154710a("nameListAdapter");
            }
            C89219l.m154716b(list, "");
            C89219l.m154721d(list, "");
            gVar.f80471a.clear();
            gVar.f80471a.addAll(list);
            gVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f80447c = new C22349c.C22350a(getArguments());
        this.f80449e = new AwemeAuthorizePlatformDepend(this);
        Context context = getContext();
        AwemeAuthorizePlatformDepend awemeAuthorizePlatformDepend = this.f80449e;
        if (awemeAuthorizePlatformDepend == null) {
            C89219l.m154710a("depend");
        }
        this.f80450f = new C22338b(context, awemeAuthorizePlatformDepend);
        AwemeAuthorizePlatformDepend awemeAuthorizePlatformDepend2 = this.f80449e;
        if (awemeAuthorizePlatformDepend2 == null) {
            C89219l.m154710a("depend");
        }
        AbstractC22335a.AbstractC22336a aVar = this.f80450f;
        if (aVar == null) {
            C89219l.m154710a("model");
        }
        C22349c.C22350a aVar2 = this.f80447c;
        if (aVar2 == null) {
            C89219l.m154710a("request");
        }
        C34038a aVar3 = new C34038a(awemeAuthorizePlatformDepend2, aVar, aVar2);
        ActivityC0945e activity = getActivity();
        if (activity == null) {
            C89219l.m154715b();
        }
        AbstractC1174ac a = C1181ae.m3881a(activity, aVar3).mo3983a(AuthCommonViewModel.class);
        C89219l.m154716b(a, "");
        this.f80448d = (AuthCommonViewModel) a;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        ((DmtStatusView) mo60299a(R.id.e77)).setBuilder(DmtStatusView.C17269a.m31905a(getContext()).mo27397a().mo27400a(2131233181, R.string.gzs, R.string.gzr, R.string.gzy, new View$OnClickListenerC34016b(this)));
        this.f80446a = new C34024g();
        RecyclerView recyclerView = (RecyclerView) mo60299a(R.id.c_3);
        C89219l.m154716b(recyclerView, "");
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        RecyclerView recyclerView2 = (RecyclerView) mo60299a(R.id.c_3);
        C89219l.m154716b(recyclerView2, "");
        C34024g gVar = this.f80446a;
        if (gVar == null) {
            C89219l.m154710a("nameListAdapter");
        }
        recyclerView2.setAdapter(gVar);
        ((AutoRTLImageView) mo60299a(R.id.pg)).setOnClickListener(new View$OnClickListenerC34017c(this));
        AuthCommonViewModel authCommonViewModel = this.f80448d;
        if (authCommonViewModel == null) {
            C89219l.m154710a("viewModel");
        }
        authCommonViewModel.f80482c.observe(this, new C34018d(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        MethodCollector.m26663i(9413);
        C89219l.m154721d(layoutInflater, "");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.a0v, (ViewGroup) null);
        MethodCollector.m26664o(9413);
        return inflate;
    }
}
