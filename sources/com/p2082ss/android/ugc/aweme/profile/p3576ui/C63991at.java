package com.p2082ss.android.ugc.aweme.profile.p3576ui;

import android.os.Bundle;
import android.os.Handler;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.navigation.AbstractC23185a;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.navigation.p1723a.C23187b;
import com.bytedance.tux.navigation.p1723a.C23194g;
import com.p2082ss.android.ugc.aweme.profile.model.LiveEventStruct;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3565a.C63380q;
import com.p2082ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.at */
public final class C63991at extends Fragment implements AbstractC23185a {

    /* renamed from: b */
    public static final C63992a f145118b = new C63992a((byte) 0);

    /* renamed from: a */
    public Handler f145119a = new Handler();

    /* renamed from: c */
    private final AbstractC89244h f145120c = C89250i.m154773a((AbstractC89171a) new C63994c(this));

    /* renamed from: d */
    private final AbstractC89244h f145121d = C89250i.m154773a((AbstractC89171a) new C63996e(this));

    /* renamed from: e */
    private SparseArray f145122e;

    static {
        Covode.recordClassIndex(75435);
    }

    /* renamed from: b */
    private View m115731b() {
        if (this.f145122e == null) {
            this.f145122e = new SparseArray();
        }
        View view = (View) this.f145122e.get(R.id.dgn);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(R.id.dgn);
        this.f145122e.put(R.id.dgn, findViewById);
        return findViewById;
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.at$a */
    public static final class C63992a {
        static {
            Covode.recordClassIndex(75436);
        }

        private C63992a() {
        }

        public /* synthetic */ C63992a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.at$b */
    static final class C63993b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C63991at f145123a;

        static {
            Covode.recordClassIndex(75437);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C63993b(C63991at atVar) {
            super(0);
            this.f145123a = atVar;
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
                com.ss.android.ugc.aweme.profile.ui.at r0 = r1.f145123a
                com.bytedance.tux.sheet.sheet.C23226a.C23228b.m43788a(r0)
                h.z r0 = p4600h.C89391z.f203057a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.p3576ui.C63991at.C63993b.invoke():java.lang.Object");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f145119a.removeCallbacksAndMessages(null);
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f145122e;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.at$e */
    static final class C63996e extends AbstractC89220m implements AbstractC89171a<User> {

        /* renamed from: a */
        final /* synthetic */ C63991at f145126a;

        static {
            Covode.recordClassIndex(75440);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C63996e(C63991at atVar) {
            super(0);
            this.f145126a = atVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ User invoke() {
            Serializable serializable;
            Bundle arguments = this.f145126a.getArguments();
            if (arguments != null) {
                serializable = arguments.getSerializable("live_event_user");
            } else {
                serializable = null;
            }
            if (!(serializable instanceof User)) {
                return null;
            }
            return serializable;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.at$c */
    static final class C63994c extends AbstractC89220m implements AbstractC89171a<List<? extends LiveEventStruct>> {

        /* renamed from: a */
        final /* synthetic */ C63991at f145124a;

        static {
            Covode.recordClassIndex(75438);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C63994c(C63991at atVar) {
            super(0);
            this.f145124a = atVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ List<? extends LiveEventStruct> invoke() {
            Serializable serializable;
            Bundle arguments = this.f145124a.getArguments();
            if (arguments != null) {
                serializable = arguments.getSerializable("live_event_list");
            } else {
                serializable = null;
            }
            List list = (List) serializable;
            if (list == null) {
                return C89086z.INSTANCE;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof LiveEventStruct) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
    }

    @Override // com.bytedance.tux.navigation.AbstractC23185a
    /* renamed from: a */
    public final TuxNavBar.C23179a mo37737a() {
        TuxNavBar.C23179a aVar = new TuxNavBar.C23179a();
        C23194g gVar = new C23194g();
        String string = getString(R.string.bpc);
        C89219l.m154716b(string, "");
        TuxNavBar.C23179a a = aVar.mo37731a(gVar.mo37753a(string));
        C23187b a2 = new C23187b().mo37738a(R.raw.icon_x_mark_small);
        a2.f54930b = true;
        return a.mo37733b(a2.mo37741a((AbstractC89171a<C89391z>) new C63993b(this)));
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.at$d */
    public static final class C63995d implements C63380q.AbstractC63382b {

        /* renamed from: a */
        final /* synthetic */ C63991at f145125a;

        static {
            Covode.recordClassIndex(75439);
        }

        C63995d(C63991at atVar) {
            this.f145125a = atVar;
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
        @Override // com.p2082ss.android.ugc.aweme.profile.p3565a.C63380q.AbstractC63382b
        /* renamed from: a */
        public final void mo102014a(com.p2082ss.android.ugc.aweme.profile.model.LiveEventStruct r2) {
            /*
                r1 = this;
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154721d(r2, r0)
                com.ss.android.ugc.aweme.profile.ui.at r0 = r1.f145125a
                android.content.Context r0 = r0.getContext()
                com.p2082ss.android.ugc.aweme.profile.p3575f.C63800w.m115393a(r0, r2)
                com.ss.android.ugc.aweme.profile.ui.at r0 = r1.f145125a
                com.bytedance.tux.sheet.sheet.C23226a.C23228b.m43788a(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.p3576ui.C63991at.C63995d.mo102014a(com.ss.android.ugc.aweme.profile.model.LiveEventStruct):void");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) m115731b();
        C89219l.m154716b(recyclerView, "");
        getActivity();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        RecyclerView recyclerView2 = (RecyclerView) m115731b();
        C89219l.m154716b(recyclerView2, "");
        C63380q qVar = new C63380q((List) this.f145120c.getValue());
        C63995d dVar = new C63995d(this);
        C89219l.m154721d(dVar, "");
        qVar.f143908a = dVar;
        recyclerView2.setAdapter(qVar);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.aoh, viewGroup, false);
    }
}
