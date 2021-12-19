package com.p2082ss.android.ugc.aweme.relation.viewmodel;

import android.os.Bundle;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.assem.arch.extensions.C12786i;
import com.bytedance.assem.arch.p794a.AbstractC12644a;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.ext_power_list.C14515a;
import com.bytedance.ies.powerlist.page.AbstractC17700f;
import com.p2082ss.android.ugc.aweme.metrics.C59256u;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.relation.C66865b;
import com.p2082ss.android.ugc.aweme.relation.api.AbstractC66862c;
import com.p2082ss.android.ugc.aweme.relation.p3674c.C66895d;
import com.p2082ss.android.ugc.aweme.relation.recommend.C66936f;
import com.p2082ss.android.ugc.aweme.relation.recommend.C66989j;
import java.util.LinkedHashSet;
import java.util.Set;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89110d;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.relation.viewmodel.RecFriendsListViewModel */
public final class RecFriendsListViewModel extends AssemListViewModel<C67100b, C66989j, C67099a> {

    /* renamed from: k */
    public final Set<String> f150386k = new LinkedHashSet();

    /* renamed from: l */
    private final C12786i f150387l = new C12786i(true, new C67038a(this, null));

    /* renamed from: m */
    private final Set<String> f150388m = new LinkedHashSet();

    /* renamed from: n */
    private final AbstractC89244h f150389n = C89250i.m154773a((AbstractC89171a) C67044g.f150410a);

    /* renamed from: o */
    private final AbstractC12644a<AbstractC66862c> f150390o;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.relation.viewmodel.RecFriendsListViewModel$b */
    public static final class C67039b extends AbstractC89110d {

        /* renamed from: a */
        /* synthetic */ Object f150393a;

        /* renamed from: b */
        int f150394b;

        /* renamed from: c */
        final /* synthetic */ RecFriendsListViewModel f150395c;

        static {
            Covode.recordClassIndex(78618);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C67039b(RecFriendsListViewModel recFriendsListViewModel, AbstractC89124d dVar) {
            super(dVar);
            this.f150395c = recFriendsListViewModel;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            this.f150393a = obj;
            this.f150394b |= Integer.MIN_VALUE;
            return this.f150395c.mo23331a((C67099a) null, (AbstractC89124d<? super AbstractC17700f<C67099a>>) this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.relation.viewmodel.RecFriendsListViewModel$c */
    public static final class C67040c extends AbstractC89110d {

        /* renamed from: a */
        /* synthetic */ Object f150396a;

        /* renamed from: b */
        int f150397b;

        /* renamed from: c */
        final /* synthetic */ RecFriendsListViewModel f150398c;

        /* renamed from: d */
        Object f150399d;

        /* renamed from: e */
        Object f150400e;

        static {
            Covode.recordClassIndex(78619);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C67040c(RecFriendsListViewModel recFriendsListViewModel, AbstractC89124d dVar) {
            super(dVar);
            this.f150398c = recFriendsListViewModel;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            this.f150396a = obj;
            this.f150397b |= Integer.MIN_VALUE;
            return this.f150398c.mo105892a(null, null, this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.relation.viewmodel.RecFriendsListViewModel$d */
    public static final class C67041d extends AbstractC89110d {

        /* renamed from: a */
        /* synthetic */ Object f150401a;

        /* renamed from: b */
        int f150402b;

        /* renamed from: c */
        final /* synthetic */ RecFriendsListViewModel f150403c;

        /* renamed from: d */
        Object f150404d;

        /* renamed from: e */
        Object f150405e;

        static {
            Covode.recordClassIndex(78620);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C67041d(RecFriendsListViewModel recFriendsListViewModel, AbstractC89124d dVar) {
            super(dVar);
            this.f150403c = recFriendsListViewModel;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            this.f150401a = obj;
            this.f150402b |= Integer.MIN_VALUE;
            return this.f150403c.mo105894c(null, this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.relation.viewmodel.RecFriendsListViewModel$e */
    public static final class C67042e extends AbstractC89110d {

        /* renamed from: a */
        /* synthetic */ Object f150406a;

        /* renamed from: b */
        int f150407b;

        /* renamed from: c */
        final /* synthetic */ RecFriendsListViewModel f150408c;

        static {
            Covode.recordClassIndex(78621);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C67042e(RecFriendsListViewModel recFriendsListViewModel, AbstractC89124d dVar) {
            super(dVar);
            this.f150408c = recFriendsListViewModel;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            this.f150406a = obj;
            this.f150407b |= Integer.MIN_VALUE;
            return this.f150408c.mo105893b(null, this);
        }
    }

    static {
        Covode.recordClassIndex(78616);
    }

    /* renamed from: j */
    private C66936f m118730j() {
        return (C66936f) this.f150387l.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    /* renamed from: f */
    public final /* synthetic */ AbstractC12853j mo20674f() {
        return new C67100b();
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.viewmodel.RecFriendsListViewModel$g */
    static final class C67044g extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C67044g f150410a = new C67044g();

        static {
            Covode.recordClassIndex(78623);
        }

        C67044g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if (C66865b.m118576d() || C66865b.m118575c()) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.viewmodel.RecFriendsListViewModel$a */
    public static final class C67038a extends AbstractC89220m implements AbstractC89171a<C66936f> {

        /* renamed from: a */
        final /* synthetic */ AssemViewModel f150391a;

        /* renamed from: b */
        final /* synthetic */ String f150392b;

        static {
            Covode.recordClassIndex(78617);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C67038a(AssemViewModel assemViewModel, String str) {
            super(0);
            this.f150391a = assemViewModel;
            this.f150392b = str;
        }

        /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, com.ss.android.ugc.aweme.relation.recommend.f] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.relation.recommend.C66936f invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.viewModel.AssemViewModel r0 = r3.f150391a
                com.bytedance.assem.arch.core.d r0 = r0.f31150d
                if (r0 == 0) goto L_0x0018
                com.bytedance.assem.arch.viewModel.AssemViewModel r0 = r3.f150391a
                com.bytedance.assem.arch.core.d r2 = r0.f31150d
                if (r2 != 0) goto L_0x000f
                p4600h.p4611f.p4613b.C89219l.m154707a()
            L_0x000f:
                java.lang.Class<com.ss.android.ugc.aweme.relation.recommend.f> r1 = com.p2082ss.android.ugc.aweme.relation.recommend.C66936f.class
                java.lang.String r0 = r3.f150392b
                java.lang.Object r0 = r2.mo20603a(r1, r0)
                return r0
            L_0x0018:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r0 = "HierarchyData has not inject to "
                r1.<init>(r0)
                com.bytedance.assem.arch.viewModel.AssemViewModel r0 = r3.f150391a
                java.lang.StringBuilder r1 = r1.append(r0)
                java.lang.String r0 = ", you can't get hierarchyData"
                java.lang.StringBuilder r0 = r1.append(r0)
                java.lang.String r0 = r0.toString()
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r0 = r0.toString()
                r1.<init>(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.relation.viewmodel.RecFriendsListViewModel.C67038a.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.viewmodel.RecFriendsListViewModel$f */
    static final class C67043f extends AbstractC89220m implements AbstractC89172b<C67100b, C67100b> {

        /* renamed from: a */
        final /* synthetic */ C14515a f150409a;

        static {
            Covode.recordClassIndex(78622);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C67043f(C14515a aVar) {
            super(1);
            this.f150409a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C67100b invoke(C67100b bVar) {
            C89219l.m154721d(bVar, "");
            C14515a aVar = this.f150409a;
            C89219l.m154721d(aVar, "");
            return new C67100b(aVar);
        }
    }

    /* renamed from: a */
    public static void m118729a(String str) {
        C89219l.m154721d(str, "");
        C66895d.m118642a("follow_rec", str);
    }

    /* renamed from: a */
    public static void m118727a(ActivityC0945e eVar) {
        if (eVar != null) {
            ((SocialRecFlowModel) C1181ae.m3881a(eVar, (C1175ad.AbstractC1177b) null).mo3983a(SocialRecFlowModel.class)).f150412b.postValue(new Bundle());
        }
    }

    public RecFriendsListViewModel(AbstractC12644a<AbstractC66862c> aVar) {
        C89219l.m154721d(aVar, "");
        this.f150390o = aVar;
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /* renamed from: a */
    public final Object mo23330a(AbstractC89124d<? super AbstractC17700f<C67099a>> dVar) {
        this.f150388m.clear();
        return mo23331a(new C67099a(true, 0), dVar);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /* renamed from: a */
    public final void mo23334a(C14515a<C66989j> aVar) {
        C89219l.m154721d(aVar, "");
        mo20662a((AbstractC89172b) new C67043f(aVar));
    }

    /* renamed from: a */
    public static void m118728a(User user, C59256u.EnumC59257a aVar) {
        String str;
        C89219l.m154721d(aVar, "");
        C59256u o = new C59256u().mo96834a("version_update").mo96837o("");
        o.f135350a = C59256u.EnumC59259c.CARD;
        o.f135352b = aVar;
        C59256u a = o.mo96832a(user);
        if (user != null) {
            str = user.getRequestId();
        } else {
            str = null;
        }
        a.mo96841s(str).mo96792f();
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo23331a(com.p2082ss.android.ugc.aweme.relation.viewmodel.C67099a r7, p4600h.p4603c.AbstractC89124d<? super com.bytedance.ies.powerlist.page.AbstractC17700f<com.p2082ss.android.ugc.aweme.relation.viewmodel.C67099a>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.p2082ss.android.ugc.aweme.relation.viewmodel.RecFriendsListViewModel.C67039b
            if (r0 == 0) goto L_0x0048
            r5 = r8
            com.ss.android.ugc.aweme.relation.viewmodel.RecFriendsListViewModel$b r5 = (com.p2082ss.android.ugc.aweme.relation.viewmodel.RecFriendsListViewModel.C67039b) r5
            int r0 = r5.f150394b
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0048
            int r0 = r5.f150394b
            int r0 = r0 - r1
            r5.f150394b = r0
        L_0x0013:
            java.lang.Object r4 = r5.f150393a
            h.c.a.a r3 = p4600h.p4603c.p4604a.EnumC89098a.COROUTINE_SUSPENDED
            int r0 = r5.f150394b
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L_0x0025
            if (r0 == r1) goto L_0x0056
            if (r0 != r2) goto L_0x004e
            p4600h.C89382r.m154942a(r4)
        L_0x0024:
            return r4
        L_0x0025:
            p4600h.C89382r.m154942a(r4)
            h.h r0 = r6.f150389n
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x003f
            r5.f150394b = r1
            java.lang.Object r4 = r6.mo105893b(r7, r5)
            if (r4 != r3) goto L_0x0059
            return r3
        L_0x003f:
            r5.f150394b = r2
            java.lang.Object r4 = r6.mo105894c(r7, r5)
            if (r4 != r3) goto L_0x0024
            return r3
        L_0x0048:
            com.ss.android.ugc.aweme.relation.viewmodel.RecFriendsListViewModel$b r5 = new com.ss.android.ugc.aweme.relation.viewmodel.RecFriendsListViewModel$b
            r5.<init>(r6, r8)
            goto L_0x0013
        L_0x004e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L_0x0056:
            p4600h.C89382r.m154942a(r4)
        L_0x0059:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.relation.viewmodel.RecFriendsListViewModel.mo23331a(com.ss.android.ugc.aweme.relation.viewmodel.a, h.c.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0079 A[Catch:{ Exception -> 0x00b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0091 A[Catch:{ Exception -> 0x00b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b2 A[Catch:{ Exception -> 0x00b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo105893b(com.p2082ss.android.ugc.aweme.relation.viewmodel.C67099a r9, p4600h.p4603c.AbstractC89124d<? super com.bytedance.ies.powerlist.page.AbstractC17700f<com.p2082ss.android.ugc.aweme.relation.viewmodel.C67099a>> r10) {
        /*
        // Method dump skipped, instructions count: 194
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.relation.viewmodel.RecFriendsListViewModel.mo105893b(com.ss.android.ugc.aweme.relation.viewmodel.a, h.c.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo105894c(com.p2082ss.android.ugc.aweme.relation.viewmodel.C67099a r15, p4600h.p4603c.AbstractC89124d<? super com.bytedance.ies.powerlist.page.AbstractC17700f<com.p2082ss.android.ugc.aweme.relation.viewmodel.C67099a>> r16) {
        /*
        // Method dump skipped, instructions count: 280
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.relation.viewmodel.RecFriendsListViewModel.mo105894c(com.ss.android.ugc.aweme.relation.viewmodel.a, h.c.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0083 A[Catch:{ Exception -> 0x00d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009b A[Catch:{ Exception -> 0x00d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d4 A[Catch:{ Exception -> 0x00d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo105892a(java.util.ArrayList<com.p2082ss.android.ugc.aweme.relation.recommend.C66989j> r11, com.p2082ss.android.ugc.aweme.relation.viewmodel.C67099a r12, p4600h.p4603c.AbstractC89124d<? super com.bytedance.ies.powerlist.page.AbstractC17700f<com.p2082ss.android.ugc.aweme.relation.viewmodel.C67099a>> r13) {
        /*
        // Method dump skipped, instructions count: 228
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.relation.viewmodel.RecFriendsListViewModel.mo105892a(java.util.ArrayList, com.ss.android.ugc.aweme.relation.viewmodel.a, h.c.d):java.lang.Object");
    }
}
