package com.p2082ss.android.ugc.aweme.favorites.p2928ui;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.tux.sheet.sheet.C23226a;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.favorites.p2924f.AbstractC47430d;
import com.p2082ss.android.ugc.aweme.favorites.p2924f.C47426a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.favorites.ui.r */
public final class C47732r extends Fragment implements AbstractC47430d {

    /* renamed from: d */
    public static final C47733a f110641d = new C47733a((byte) 0);

    /* renamed from: a */
    public String f110642a;

    /* renamed from: b */
    public Aweme f110643b;

    /* renamed from: c */
    final C47426a f110644c = new C47426a();

    /* renamed from: e */
    private SparseArray f110645e;

    static {
        Covode.recordClassIndex(56354);
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.r$a */
    public static final class C47733a {
        static {
            Covode.recordClassIndex(56355);
        }

        private C47733a() {
        }

        public /* synthetic */ C47733a(byte b) {
            this();
        }

        /* renamed from: a */
        public static void m90789a(ActivityC0945e eVar, Aweme aweme, String str) {
            C89219l.m154721d(eVar, "");
            C47732r rVar = new C47732r();
            rVar.f110642a = str;
            rVar.f110643b = aweme;
            new C23226a.C23227a().mo37817a(rVar).mo37819a(false).mo37812a(1).f55057a.show(eVar.getSupportFragmentManager(), "UnFavouritesFragment");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f110645e;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.r$c */
    static final class View$OnClickListenerC47735c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C47732r f110647a;

        static {
            Covode.recordClassIndex(56357);
        }

        View$OnClickListenerC47735c(C47732r rVar) {
            this.f110647a = rVar;
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
                com.ss.android.ugc.aweme.favorites.ui.r r0 = r1.f110647a
                com.bytedance.tux.sheet.sheet.C23226a.C23228b.m43788a(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.favorites.p2928ui.C47732r.View$OnClickListenerC47735c.onClick(android.view.View):void");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.favorites.p2924f.AbstractC47430d
    /* renamed from: a */
    public final void mo62587a(BaseResponse baseResponse) {
        String aid;
        Aweme aweme = this.f110643b;
        if (aweme != null) {
            aweme.setCollectStatus(0);
        }
        Aweme aweme2 = this.f110643b;
        if (aweme2 != null && (aid = aweme2.getAid()) != null) {
            AwemeService.m70060b().mo60689c(aid, 0);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.favorites.p2924f.AbstractC47430d
    /* renamed from: e_ */
    public final void mo62592e_(Exception exc) {
        new C23144b(this).mo37640e(R.string.a92).mo37637b();
    }

    @Override // com.p2082ss.android.ugc.aweme.favorites.p2924f.AbstractC47430d
    /* renamed from: a */
    public final void mo62589a(String str) {
        if (str != null) {
            new C23144b(this).mo37635a(str).mo37637b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.r$b */
    static final class View$OnClickListenerC47734b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C47732r f110646a;

        static {
            Covode.recordClassIndex(56356);
        }

        View$OnClickListenerC47734b(C47732r rVar) {
            this.f110646a = rVar;
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
                com.ss.android.ugc.aweme.favorites.ui.r r1 = r7.f110646a
                com.ss.android.ugc.aweme.feed.model.Aweme r0 = r1.f110643b
                if (r0 == 0) goto L_0x000f
                java.lang.String r6 = r0.getAid()
                if (r6 != 0) goto L_0x0015
            L_0x000f:
                com.ss.android.ugc.aweme.favorites.ui.r r0 = r7.f110646a
                com.bytedance.tux.sheet.sheet.C23226a.C23228b.m43788a(r0)
                return
            L_0x0015:
                java.lang.String r5 = r1.f110642a
                if (r5 != 0) goto L_0x001a
                goto L_0x000f
            L_0x001a:
                com.ss.android.ugc.aweme.favorites.f.a r4 = r1.f110644c
                r0 = 3
                java.lang.Object[] r3 = new java.lang.Object[r0]
                r2 = 2
                java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
                r1 = 0
                r3[r1] = r0
                r0 = 1
                r3[r0] = r6
                java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
                r3[r2] = r0
                r4.mo57616a(r3)
                com.ss.android.ugc.aweme.app.f.d r1 = new com.ss.android.ugc.aweme.app.f.d
                r1.<init>()
                java.lang.String r0 = "enter_from"
                com.ss.android.ugc.aweme.app.f.d r1 = r1.mo59983a(r0, r5)
                java.lang.String r0 = "group_id"
                com.ss.android.ugc.aweme.app.f.d r0 = r1.mo59983a(r0, r6)
                java.util.Map<java.lang.String, java.lang.String> r1 = r0.f79943a
                java.lang.String r0 = "cancel_favourite_video"
                com.p2082ss.android.ugc.aweme.common.C39162r.m79460a(r0, r1)
                goto L_0x000f
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.favorites.p2928ui.C47732r.View$OnClickListenerC47734b.onClick(android.view.View):void");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        this.f110644c.mo67839a_(this);
        view.findViewById(R.id.f97).setOnClickListener(new View$OnClickListenerC47734b(this));
        view.findViewById(R.id.f94).setOnClickListener(new View$OnClickListenerC47735c(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.rx, viewGroup, false);
    }
}
