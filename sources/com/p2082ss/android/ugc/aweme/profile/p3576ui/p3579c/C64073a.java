package com.p2082ss.android.ugc.aweme.profile.p3576ui.p3579c;

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
import androidx.lifecycle.C1169aa;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.navigation.AbstractC23185a;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.navigation.p1723a.C23187b;
import com.bytedance.tux.navigation.p1723a.C23194g;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.profile.p3571e.C63511a;
import com.p2082ss.android.ugc.aweme.profile.p3575f.C63801x;
import com.p2082ss.android.ugc.aweme.profile.widgets.View$OnClickListenerC64881j;
import com.p2082ss.android.ugc.aweme.user.C80053c;
import com.p2082ss.android.ugc.aweme.user.viewmodel.CheckMultiAccountViewModel;
import com.p2082ss.android.ugc.aweme.user.viewmodel.MultiProfilesViewModel;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.c.a */
public final class C64073a extends Fragment implements AbstractC23185a, View$OnClickListenerC64881j.AbstractC64883b {

    /* renamed from: c */
    public static final C64074a f145370c = new C64074a((byte) 0);

    /* renamed from: a */
    public C64078b f145371a;

    /* renamed from: b */
    public List<C80053c> f145372b;

    /* renamed from: d */
    private CheckMultiAccountViewModel f145373d;

    /* renamed from: e */
    private MultiProfilesViewModel f145374e;

    /* renamed from: f */
    private final AbstractC89244h f145375f = C89250i.m154773a((AbstractC89171a) new C64076c(this));

    /* renamed from: g */
    private SparseArray f145376g;

    static {
        Covode.recordClassIndex(75517);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.c.a$a */
    public static final class C64074a {
        static {
            Covode.recordClassIndex(75518);
        }

        private C64074a() {
        }

        public /* synthetic */ C64074a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.c.a$b */
    static final class C64075b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C64073a f145377a;

        static {
            Covode.recordClassIndex(75519);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64075b(C64073a aVar) {
            super(0);
            this.f145377a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f145377a.mo103711a((Boolean) null);
            return C89391z.f203057a;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f145376g;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.c.a$c */
    static final class C64076c extends AbstractC89220m implements AbstractC89171a<C63511a> {

        /* renamed from: a */
        final /* synthetic */ C64073a f145378a;

        static {
            Covode.recordClassIndex(75520);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64076c(C64073a aVar) {
            super(0);
            this.f145378a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C63511a invoke() {
            String str;
            String str2;
            Bundle arguments = this.f145378a.getArguments();
            if (arguments == null || (str = arguments.getString("enter_from")) == null) {
                str = "";
            }
            C89219l.m154716b(str, "");
            Bundle arguments2 = this.f145378a.getArguments();
            if (arguments2 == null || (str2 = arguments2.getString("enter_method")) == null) {
                str2 = "";
            }
            C89219l.m154716b(str2, "");
            return new C63511a(str, str2);
        }
    }

    @Override // com.bytedance.tux.navigation.AbstractC23185a
    /* renamed from: a */
    public final TuxNavBar.C23179a mo37737a() {
        TuxNavBar.C23179a aVar = new TuxNavBar.C23179a();
        C23194g gVar = new C23194g();
        String string = getString(R.string.d5e);
        C89219l.m154716b(string, "");
        return aVar.mo37731a(gVar.mo37753a(string)).mo37733b(new C23187b().mo37738a(R.raw.icon_x_mark_small).mo37741a((AbstractC89171a<C89391z>) new C64075b(this)));
    }

    /* renamed from: a */
    public static final /* synthetic */ C64078b m115985a(C64073a aVar) {
        C64078b bVar = aVar.f145371a;
        if (bVar == null) {
            C89219l.m154710a("adapter");
        }
        return bVar;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActivityC0945e activity = getActivity();
        if (activity != null) {
            AbstractC1174ac a = C1181ae.m3881a(activity, (C1175ad.AbstractC1177b) null).mo3983a(CheckMultiAccountViewModel.class);
            C89219l.m154716b(a, "");
            this.f145373d = (CheckMultiAccountViewModel) a;
            AbstractC1174ac a2 = C1181ae.m3881a(activity, (C1175ad.AbstractC1177b) null).mo3983a(MultiProfilesViewModel.class);
            C89219l.m154716b(a2, "");
            this.f145374e = (MultiProfilesViewModel) a2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.c.a$d */
    static final class C64077d<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C64073a f145379a;

        /* renamed from: b */
        final /* synthetic */ RecyclerView f145380b;

        static {
            Covode.recordClassIndex(75521);
        }

        C64077d(C64073a aVar, RecyclerView recyclerView) {
            this.f145379a = aVar;
            this.f145380b = recyclerView;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            List<C80053c> list = (List) obj;
            RecyclerView recyclerView = this.f145380b;
            this.f145379a.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager());
            this.f145380b.setAdapter(C64073a.m115985a(this.f145379a));
            this.f145379a.f145372b = list;
            C64078b a = C64073a.m115985a(this.f145379a);
            C89219l.m154716b(list, "");
            C89219l.m154721d(list, "");
            a.f145381a.clear();
            a.f145381a.addAll(list);
            a.notifyDataSetChanged();
            C39162r.m79460a("account_list_unfold", new C33744d().mo59982a("detail_info", C63801x.m115394a(list)).mo59980a("account_cnt", list.size()).mo59983a("enter_method", "auto").mo59983a("enter_from", "login_page").f79943a);
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
        java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        	at java.base/java.util.Objects.checkIndex(Objects.java:359)
        	at java.base/java.util.ArrayList.get(ArrayList.java:427)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
        */
    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.View$OnClickListenerC64881j.AbstractC64883b
    /* renamed from: a */
    public final void mo103711a(java.lang.Boolean r5) {
        /*
        // Method dump skipped, instructions count: 123
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.p3576ui.p3579c.C64073a.mo103711a(java.lang.Boolean):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        Context context = getContext();
        if (context == null) {
            C89219l.m154715b();
        }
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        ActivityC0945e activity = getActivity();
        if (activity != null) {
            C89219l.m154716b(activity, "");
            this.f145371a = new C64078b(new WeakReference(this), (C63511a) this.f145375f.getValue(), activity);
            CheckMultiAccountViewModel checkMultiAccountViewModel = this.f145373d;
            if (checkMultiAccountViewModel == null) {
                C89219l.m154710a("checkMultiAccountViewModel");
            }
            LiveData a = C1169aa.m3869a(checkMultiAccountViewModel.f179477a, CheckMultiAccountViewModel.C80100a.f179478a);
            C89219l.m154716b(a, "");
            a.observe(getViewLifecycleOwner(), new C64077d(this, recyclerView));
        }
        return recyclerView;
    }
}
