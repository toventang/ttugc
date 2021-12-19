package com.p2082ss.android.ugc.aweme.profile.p3576ui.p3579c;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0952i;
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
import com.bytedance.tux.sheet.sheet.C23226a;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.profile.p3571e.C63511a;
import com.p2082ss.android.ugc.aweme.profile.p3575f.C63801x;
import com.p2082ss.android.ugc.aweme.profile.widgets.View$OnClickListenerC64894k;
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

/* renamed from: com.ss.android.ugc.aweme.profile.ui.c.d */
public final class C64082d extends Fragment implements AbstractC23185a, View$OnClickListenerC64894k.AbstractC64896b {

    /* renamed from: b */
    public static final C64083a f145395b = new C64083a((byte) 0);

    /* renamed from: a */
    public C64079c f145396a;

    /* renamed from: c */
    private MultiProfilesViewModel f145397c;

    /* renamed from: d */
    private final AbstractC89244h f145398d = C89250i.m154773a((AbstractC89171a) new C64085c(this));

    /* renamed from: e */
    private SparseArray f145399e;

    static {
        Covode.recordClassIndex(75526);
    }

    /* renamed from: b */
    public final C63511a mo103712b() {
        return (C63511a) this.f145398d.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.c.d$a */
    public static final class C64083a {
        static {
            Covode.recordClassIndex(75527);
        }

        private C64083a() {
        }

        public /* synthetic */ C64083a(byte b) {
            this();
        }

        /* renamed from: a */
        private static C64082d m115994a(C63511a aVar) {
            C64082d dVar = new C64082d();
            Bundle bundle = new Bundle();
            if (aVar != null) {
                bundle.putString("enter_from", aVar.f144137a);
                bundle.putString("enter_method", aVar.f144138b);
            }
            dVar.setArguments(bundle);
            return dVar;
        }

        /* renamed from: a */
        public static void m115995a(AbstractC0952i iVar, C63511a aVar, String str) {
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(str, "");
            new C23226a.C23227a().mo37817a(m115994a(aVar)).mo37812a(1).mo37819a(true).mo37822b(false).f55057a.show(iVar, str);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.c.d$b */
    static final class C64084b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C64082d f145400a;

        static {
            Covode.recordClassIndex(75528);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64084b(C64082d dVar) {
            super(0);
            this.f145400a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
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
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ p4600h.C89391z invoke() {
            /*
                r1 = this;
                com.ss.android.ugc.aweme.profile.ui.c.d r0 = r1.f145400a
                com.bytedance.tux.sheet.sheet.C23226a.C23228b.m43788a(r0)
                h.z r0 = p4600h.C89391z.f203057a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.p3576ui.p3579c.C64082d.C64084b.invoke():java.lang.Object");
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
    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.View$OnClickListenerC64894k.AbstractC64896b
    /* renamed from: c */
    public final void mo103713c() {
        /*
            r1 = this;
            r0 = r1
            com.bytedance.tux.sheet.sheet.C23226a.C23228b.m43788a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.p3576ui.p3579c.C64082d.mo103713c():void");
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f145399e;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.c.d$c */
    static final class C64085c extends AbstractC89220m implements AbstractC89171a<C63511a> {

        /* renamed from: a */
        final /* synthetic */ C64082d f145401a;

        static {
            Covode.recordClassIndex(75529);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64085c(C64082d dVar) {
            super(0);
            this.f145401a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C63511a invoke() {
            String str;
            String str2;
            Bundle arguments = this.f145401a.getArguments();
            if (arguments == null || (str = arguments.getString("enter_from")) == null) {
                str = "";
            }
            C89219l.m154716b(str, "");
            Bundle arguments2 = this.f145401a.getArguments();
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
        String string = getString(R.string.apc);
        C89219l.m154716b(string, "");
        return aVar.mo37731a(gVar.mo37753a(string)).mo37733b(new C23187b().mo37738a(R.raw.icon_x_mark_small).mo37741a((AbstractC89171a<C89391z>) new C64084b(this)));
    }

    /* renamed from: a */
    public static final /* synthetic */ C64079c m115990a(C64082d dVar) {
        C64079c cVar = dVar.f145396a;
        if (cVar == null) {
            C89219l.m154710a("adapter");
        }
        return cVar;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActivityC0945e activity = getActivity();
        if (activity != null) {
            AbstractC1174ac a = C1181ae.m3881a(activity, (C1175ad.AbstractC1177b) null).mo3983a(MultiProfilesViewModel.class);
            C89219l.m154716b(a, "");
            this.f145397c = (MultiProfilesViewModel) a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.c.d$d */
    static final class C64086d<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C64082d f145402a;

        /* renamed from: b */
        final /* synthetic */ RecyclerView f145403b;

        static {
            Covode.recordClassIndex(75530);
        }

        C64086d(C64082d dVar, RecyclerView recyclerView) {
            this.f145402a = dVar;
            this.f145403b = recyclerView;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            List list = (List) obj;
            RecyclerView recyclerView = this.f145403b;
            this.f145402a.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager());
            this.f145403b.setAdapter(C64082d.m115990a(this.f145402a));
            C64079c a = C64082d.m115990a(this.f145402a);
            C89219l.m154716b(list, "");
            C89219l.m154721d(list, "");
            a.f145386a.clear();
            a.f145386a.addAll(list);
            a.notifyDataSetChanged();
            C39162r.m79460a("account_list_unfold", new C33744d().mo59982a("detail_info", C63801x.m115394a(list)).mo59980a("account_cnt", list.size()).mo59983a("enter_method", this.f145402a.mo103712b().f144138b).mo59983a("enter_from", this.f145402a.mo103712b().f144137a).f79943a);
        }
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
            WeakReference weakReference = new WeakReference(this);
            C63511a b = mo103712b();
            C89219l.m154716b(activity, "");
            this.f145396a = new C64079c(weakReference, b, activity);
            MultiProfilesViewModel multiProfilesViewModel = this.f145397c;
            if (multiProfilesViewModel == null) {
                C89219l.m154710a("profilesViewModel");
            }
            LiveData a = C1169aa.m3869a(multiProfilesViewModel.f179480b, new MultiProfilesViewModel.C80102b(multiProfilesViewModel));
            C89219l.m154716b(a, "");
            a.observe(getViewLifecycleOwner(), new C64086d(this, recyclerView));
        }
        return recyclerView;
    }
}
