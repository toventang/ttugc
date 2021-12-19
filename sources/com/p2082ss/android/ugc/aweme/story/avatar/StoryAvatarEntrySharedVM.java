package com.p2082ss.android.ugc.aweme.story.avatar;

import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.C14515a;
import com.bytedance.ies.powerlist.page.AbstractC17700f;
import com.p2082ss.android.ugc.aweme.detail.p2755vm.BaseDetailShareVM;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import p4600h.p4601a.C89070n;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.avatar.StoryAvatarEntrySharedVM */
public final class StoryAvatarEntrySharedVM extends BaseDetailShareVM<C76503b, C76589r, Integer> {

    /* renamed from: m */
    public static final C76491a f171776m = new C76491a((byte) 0);

    static {
        Covode.recordClassIndex(89473);
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.p2755vm.BaseDetailShareVM
    /* renamed from: a */
    public final int mo70711a(String str) {
        C89219l.m154721d(str, "");
        return -1;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final int getPageType(int i) {
        return 40;
    }

    /* renamed from: com.ss.android.ugc.aweme.story.avatar.StoryAvatarEntrySharedVM$a */
    public static final class C76491a {
        static {
            Covode.recordClassIndex(89474);
        }

        private C76491a() {
        }

        public /* synthetic */ C76491a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    /* renamed from: f */
    public final /* synthetic */ AbstractC12853j mo20674f() {
        return new C76503b();
    }

    /* renamed from: com.ss.android.ugc.aweme.story.avatar.StoryAvatarEntrySharedVM$c */
    static final class C76493c extends AbstractC89220m implements AbstractC89172b<C76503b, C76503b> {

        /* renamed from: a */
        final /* synthetic */ C14515a f171778a;

        static {
            Covode.recordClassIndex(89476);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76493c(C14515a aVar) {
            super(1);
            this.f171778a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C76503b invoke(C76503b bVar) {
            C89219l.m154721d(bVar, "");
            return C76503b.m134090a(this.f171778a);
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.p2082ss.android.ugc.aweme.detail.p2755vm.BaseDetailShareVM
    /* renamed from: a */
    public final /* synthetic */ Integer mo70712a(C49812b bVar) {
        C89219l.m154721d(bVar, "");
        return 1;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a] */
    @Override // com.p2082ss.android.ugc.aweme.detail.p2755vm.BaseDetailShareVM
    /* renamed from: b */
    public final /* synthetic */ Aweme mo70713b(C76589r rVar) {
        C76589r rVar2 = rVar;
        C89219l.m154721d(rVar2, "");
        return rVar2.f171909a;
    }

    /* renamed from: com.ss.android.ugc.aweme.story.avatar.StoryAvatarEntrySharedVM$b */
    static final class C76492b extends AbstractC89220m implements AbstractC89172b<C76503b, C76503b> {

        /* renamed from: a */
        final /* synthetic */ Aweme f171777a;

        static {
            Covode.recordClassIndex(89475);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76492b(Aweme aweme) {
            super(1);
            this.f171777a = aweme;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C76503b invoke(C76503b bVar) {
            C89219l.m154721d(bVar, "");
            return C76503b.m134090a(new C14515a(null, null, null, C89070n.m154516a(new C76589r(this.f171777a)), 7));
        }
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /* renamed from: a */
    public final Object mo23330a(AbstractC89124d<? super AbstractC17700f<Integer>> dVar) {
        return AbstractC17700f.C17701a.m32839a(new IllegalStateException("should never do refresh in AvatarEntrySharedVM"));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /* renamed from: a */
    public final void mo23334a(C14515a<C76589r> aVar) {
        C89219l.m154721d(aVar, "");
        mo20662a((AbstractC89172b) new C76493c(aVar));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /* renamed from: a */
    public final /* synthetic */ Object mo23331a(Object obj, AbstractC89124d dVar) {
        ((Number) obj).intValue();
        return AbstractC17700f.C17701a.m32839a(new IllegalStateException("should never load more in AvatarEntrySharedVM"));
    }
}
