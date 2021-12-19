package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.sheet.sheet.C23226a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2949i.AbstractC49691s;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49672ag;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.j */
public final class C50318j extends Fragment {

    /* renamed from: c */
    public static final C50319a f116191c = new C50319a((byte) 0);

    /* renamed from: a */
    public Aweme f116192a;

    /* renamed from: b */
    public AbstractC49691s<C49672ag> f116193b;

    /* renamed from: d */
    private SparseArray f116194d;

    static {
        Covode.recordClassIndex(59446);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.j$a */
    public static final class C50319a {
        static {
            Covode.recordClassIndex(59447);
        }

        private C50319a() {
        }

        public /* synthetic */ C50319a(byte b) {
            this();
        }

        /* renamed from: a */
        public static void m94417a(ActivityC0945e eVar, Aweme aweme, AbstractC49691s<C49672ag> sVar) {
            C89219l.m154721d(eVar, "");
            C89219l.m154721d(sVar, "");
            C50318j jVar = new C50318j();
            jVar.f116192a = aweme;
            jVar.f116193b = sVar;
            new C23226a.C23227a().mo37817a(jVar).mo37819a(false).mo37812a(1).f55057a.show(eVar.getSupportFragmentManager(), "DeleteFragment");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f116194d;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.j$c */
    static final class View$OnClickListenerC50321c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C50318j f116196a;

        static {
            Covode.recordClassIndex(59449);
        }

        View$OnClickListenerC50321c(C50318j jVar) {
            this.f116196a = jVar;
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
                com.ss.android.ugc.aweme.feed.ui.j r0 = r1.f116196a
                com.bytedance.tux.sheet.sheet.C23226a.C23228b.m43788a(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.p2970ui.C50318j.View$OnClickListenerC50321c.onClick(android.view.View):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.j$b */
    static final class View$OnClickListenerC50320b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C50318j f116195a;

        static {
            Covode.recordClassIndex(59448);
        }

        View$OnClickListenerC50320b(C50318j jVar) {
            this.f116195a = jVar;
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
        public final void onClick(android.view.View r5) {
            /*
                r4 = this;
                com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent.onClick(r5)
                com.ss.android.ugc.aweme.feed.ui.j r3 = r4.f116195a
                android.content.Context r2 = r3.getContext()
                if (r2 != 0) goto L_0x0011
            L_0x000b:
                com.ss.android.ugc.aweme.feed.ui.j r0 = r4.f116195a
                com.bytedance.tux.sheet.sheet.C23226a.C23228b.m43788a(r0)
                return
            L_0x0011:
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154716b(r2, r0)
                com.bytedance.tux.dialog.e r1 = new com.bytedance.tux.dialog.e
                r1.<init>(r2)
                r0 = 2131823170(0x7f110a42, float:1.9279132E38)
                com.bytedance.tux.dialog.internal.b r1 = r1.mo37479a(r0)
                r0 = 1
                com.bytedance.tux.dialog.internal.b r2 = r1.mo37482a(r0)
                com.bytedance.tux.dialog.e r2 = (com.bytedance.tux.dialog.C23048e) r2
                r1 = 2131823167(0x7f110a3f, float:1.9279126E38)
                com.ss.android.ugc.aweme.feed.ui.j$d r0 = new com.ss.android.ugc.aweme.feed.ui.j$d
                r0.<init>(r3)
                com.bytedance.tux.dialog.e r1 = r2.mo37443a(r1, r0)
                r0 = 0
                com.bytedance.tux.dialog.e r0 = r1.mo37444a(r0)
                com.bytedance.tux.dialog.d r0 = r0.mo37442a()
                android.app.Dialog r0 = r0.mo37396b()
                r0.show()
                goto L_0x000b
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.p2970ui.C50318j.View$OnClickListenerC50320b.onClick(android.view.View):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.j$d */
    static final class DialogInterface$OnClickListenerC50322d implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C50318j f116197a;

        static {
            Covode.recordClassIndex(59450);
        }

        DialogInterface$OnClickListenerC50322d(C50318j jVar) {
            this.f116197a = jVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            AbstractC49691s<C49672ag> sVar = this.f116197a.f116193b;
            if (sVar != null) {
                sVar.mo63634a(new C49672ag(2, this.f116197a.f116192a));
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        ((ImageView) view.findViewById(R.id.f95)).setImageResource(2131233177);
        ((TextView) view.findViewById(R.id.f96)).setText(R.string.b4w);
        view.findViewById(R.id.f97).setOnClickListener(new View$OnClickListenerC50320b(this));
        view.findViewById(R.id.f94).setOnClickListener(new View$OnClickListenerC50321c(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.rx, viewGroup, false);
    }
}
