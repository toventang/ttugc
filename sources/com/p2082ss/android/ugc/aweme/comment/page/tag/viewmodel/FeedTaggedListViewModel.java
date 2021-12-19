package com.p2082ss.android.ugc.aweme.comment.page.tag.viewmodel;

import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.extensions.C12786i;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.comment.page.tag.C36864d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.language.C58071d;
import java.util.LinkedHashSet;
import java.util.Set;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.page.tag.viewmodel.FeedTaggedListViewModel */
public final class FeedTaggedListViewModel extends AssemViewModel<C36945f> {

    /* renamed from: j */
    public final Set<String> f86901j = new LinkedHashSet();

    /* renamed from: k */
    public boolean f86902k;

    /* renamed from: l */
    private final C12786i f86903l = new C12786i(true, new C36900a(this, null));

    /* renamed from: m */
    private final AbstractC89244h f86904m = C89250i.m154773a((AbstractC89171a) C36902c.f86908a);

    static {
        Covode.recordClassIndex(44238);
    }

    /* renamed from: g */
    public final C36864d.C36878n mo23342g() {
        return (C36864d.C36878n) this.f86903l.getValue();
    }

    /* renamed from: h */
    public final boolean mo23343h() {
        return ((Boolean) this.f86904m.getValue()).booleanValue();
    }

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    /* renamed from: f */
    public final /* synthetic */ C36945f mo20674f() {
        return new C36945f();
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.viewmodel.FeedTaggedListViewModel$c */
    static final class C36902c extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C36902c f86908a = new C36902c();

        static {
            Covode.recordClassIndex(44241);
        }

        C36902c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(C58071d.m104909c());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.viewmodel.FeedTaggedListViewModel$a */
    public static final class C36900a extends AbstractC89220m implements AbstractC89171a<C36864d.C36878n> {

        /* renamed from: a */
        final /* synthetic */ AssemViewModel f86905a;

        /* renamed from: b */
        final /* synthetic */ String f86906b;

        static {
            Covode.recordClassIndex(44239);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36900a(AssemViewModel assemViewModel, String str) {
            super(0);
            this.f86905a = assemViewModel;
            this.f86906b = str;
        }

        /* JADX WARN: Type inference failed for: r0v10, types: [com.ss.android.ugc.aweme.comment.page.tag.d$n, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.comment.page.tag.C36864d.C36878n invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.viewModel.AssemViewModel r0 = r3.f86905a
                com.bytedance.assem.arch.core.d r0 = r0.f31150d
                if (r0 == 0) goto L_0x0018
                com.bytedance.assem.arch.viewModel.AssemViewModel r0 = r3.f86905a
                com.bytedance.assem.arch.core.d r2 = r0.f31150d
                if (r2 != 0) goto L_0x000f
                p4600h.p4611f.p4613b.C89219l.m154707a()
            L_0x000f:
                java.lang.Class<com.ss.android.ugc.aweme.comment.page.tag.d$n> r1 = com.p2082ss.android.ugc.aweme.comment.page.tag.C36864d.C36878n.class
                java.lang.String r0 = r3.f86906b
                java.lang.Object r0 = r2.mo20603a(r1, r0)
                return r0
            L_0x0018:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r0 = "HierarchyData has not inject to "
                r1.<init>(r0)
                com.bytedance.assem.arch.viewModel.AssemViewModel r0 = r3.f86905a
                java.lang.StringBuilder r1 = r1.append(r0)
                java.lang.String r0 = ", you can't get hierarchyData"
                java.lang.StringBuilder r0 = r1.append(r0)
                java.lang.String r0 = r0.toString()
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r0 = r0.toString()
                r1.<init>(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.comment.page.tag.viewmodel.FeedTaggedListViewModel.C36900a.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.viewmodel.FeedTaggedListViewModel$b */
    public static final class C36901b extends AbstractC89220m implements AbstractC89172b<C36945f, C36945f> {

        /* renamed from: a */
        public static final C36901b f86907a = new C36901b();

        static {
            Covode.recordClassIndex(44240);
        }

        C36901b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C36945f invoke(C36945f fVar) {
            C36945f fVar2 = fVar;
            C89219l.m154721d(fVar2, "");
            return new C36945f(fVar2.f86989a, new C12776a(EnumC36944e.EDIT_CLICK));
        }
    }

    /* renamed from: a */
    public final void mo64381a(String str, String str2) {
        String str3;
        String authorUid;
        String str4 = "";
        C89219l.m154721d(str, str4);
        C89219l.m154721d(str2, str4);
        C33744d a = new C33744d().mo59983a("to_user_id", str);
        Aweme aweme = mo23342g().f86865a;
        if (aweme == null || (str3 = aweme.getAid()) == null) {
            str3 = str4;
        }
        C33744d a2 = a.mo59983a("group_id", str3);
        Aweme aweme2 = mo23342g().f86865a;
        if (!(aweme2 == null || (authorUid = aweme2.getAuthorUid()) == null)) {
            str4 = authorUid;
        }
        C39162r.m79460a("click_tagged_user", a2.mo59983a("author_id", str4).mo59983a("enter_from", mo23342g().f86867c).mo59983a("click_type", str2).mo59983a("anchor_type", mo23342g().f86868d).f79943a);
    }
}
