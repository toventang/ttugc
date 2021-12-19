package com.p2082ss.android.ugc.aweme.mix.mixdetail;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.n */
public final class C59697n extends Fragment {

    /* renamed from: b */
    public static final C59698a f136078b = new C59698a((byte) 0);

    /* renamed from: a */
    public Aweme f136079a;

    /* renamed from: c */
    private LinearLayout f136080c;

    /* renamed from: d */
    private SparseArray f136081d;

    static {
        Covode.recordClassIndex(70098);
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.n$a */
    public static final class C59698a {
        static {
            Covode.recordClassIndex(70099);
        }

        private C59698a() {
        }

        public /* synthetic */ C59698a(byte b) {
            this();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f136081d;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.n$c */
    static final class View$OnClickListenerC59700c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C59697n f136084a;

        static {
            Covode.recordClassIndex(70101);
        }

        View$OnClickListenerC59700c(C59697n nVar) {
            this.f136084a = nVar;
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
        public final void onClick(android.view.View r2) {
            /*
                r1 = this;
                com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent.onClick(r2)
                com.ss.android.ugc.aweme.mix.mixdetail.n r0 = r1.f136084a
                com.bytedance.tux.sheet.sheet.C23226a.C23228b.m43788a(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.mix.mixdetail.C59697n.View$OnClickListenerC59700c.onClick(android.view.View):void");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Serializable serializable;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            serializable = arguments.getSerializable("key_current_aweme");
        } else {
            serializable = null;
        }
        Objects.requireNonNull(serializable, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.model.Aweme");
        this.f136079a = (Aweme) serializable;
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.n$b */
    static final class View$OnClickListenerC59699b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C59697n f136082a;

        /* renamed from: b */
        final /* synthetic */ View f136083b;

        static {
            Covode.recordClassIndex(70100);
        }

        View$OnClickListenerC59699b(C59697n nVar, View view) {
            this.f136082a = nVar;
            this.f136083b = view;
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
        public final void onClick(android.view.View r8) {
            /*
                r7 = this;
                com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent.onClick(r8)
                com.ss.android.ugc.aweme.share.ShareDependService r1 = com.p2082ss.android.ugc.aweme.share.ShareDependService.C68822a.m121324a()
                com.ss.android.ugc.aweme.mix.mixdetail.n r0 = r7.f136082a
                com.ss.android.ugc.aweme.feed.model.Aweme r2 = r0.f136079a
                if (r2 != 0) goto L_0x0012
                java.lang.String r0 = "aweme"
                p4600h.p4611f.p4613b.C89219l.m154710a(r0)
            L_0x0012:
                android.view.View r0 = r7.f136083b
                android.content.Context r4 = r0.getContext()
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154716b(r4, r0)
                java.lang.String r3 = ""
                java.lang.String r5 = "long_press"
                java.lang.String r6 = ""
                r1.mo109339a(r2, r3, r4, r5, r6)
                com.ss.android.ugc.aweme.mix.mixdetail.n r0 = r7.f136082a
                com.bytedance.tux.sheet.sheet.C23226a.C23228b.m43788a(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.mix.mixdetail.C59697n.View$OnClickListenerC59699b.onClick(android.view.View):void");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.dnm);
        C89219l.m154716b(findViewById, "");
        this.f136080c = (LinearLayout) findViewById;
        View findViewById2 = view.findViewById(R.id.dim);
        C89219l.m154716b(findViewById2, "");
        LinearLayout linearLayout = (LinearLayout) findViewById2;
        Aweme aweme = this.f136079a;
        if (aweme == null) {
            C89219l.m154710a("aweme");
        }
        aweme.setAwemeType(300);
        linearLayout.setOnClickListener(new View$OnClickListenerC59699b(this, view));
        View findViewById3 = view.findViewById(R.id.a0w);
        C89219l.m154716b(findViewById3, "");
        ((TuxTextView) findViewById3).setOnClickListener(new View$OnClickListenerC59700c(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.ako, viewGroup, false);
        if (a == null) {
            C89219l.m154715b();
        }
        return a;
    }
}
