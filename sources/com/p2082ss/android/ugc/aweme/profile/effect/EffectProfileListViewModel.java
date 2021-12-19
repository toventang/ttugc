package com.p2082ss.android.ugc.aweme.profile.effect;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.ext.list.C20465o;
import com.bytedance.jedi.arch.ext.list.CommonListViewModel;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.sticker.model.C75445g;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p4560f.p4561a.AbstractC88979t;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.effect.EffectProfileListViewModel */
public final class EffectProfileListViewModel extends CommonListViewModel<C75445g, EffectProfileState> implements AbstractC63734h {

    /* renamed from: a */
    public static final C63682a f144388a = new C63682a((byte) 0);

    /* renamed from: b */
    private boolean f144389b;

    /* renamed from: c */
    private String f144390c;

    /* renamed from: d */
    private String f144391d;

    /* renamed from: e */
    private final AbstractC89172b<EffectProfileState, AbstractC88979t<C89378p<List<C75445g>, C20465o>>> f144392e = new C63688f(this);

    /* renamed from: f */
    private final AbstractC89172b<EffectProfileState, AbstractC88979t<C89378p<List<C75445g>, C20465o>>> f144393f = new C63684c(this);

    /* renamed from: g */
    private final AbstractC89183m<List<? extends C75445g>, List<? extends C75445g>, List<C75445g>> f144394g = C63690g.f144404a;

    /* renamed from: k */
    private final AbstractC89183m<List<? extends C75445g>, List<? extends C75445g>, List<C75445g>> f144395k = C63686d.f144399a;

    static {
        Covode.recordClassIndex(75005);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.effect.EffectProfileListViewModel$a */
    public static final class C63682a {
        static {
            Covode.recordClassIndex(75006);
        }

        private C63682a() {
        }

        public /* synthetic */ C63682a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.jedi.arch.ext.list.CommonListViewModel
    /* renamed from: a */
    public final AbstractC89172b<EffectProfileState, AbstractC88979t<C89378p<List<C75445g>, C20465o>>> mo33725a() {
        return this.f144392e;
    }

    @Override // com.bytedance.jedi.arch.ext.list.CommonListViewModel
    /* renamed from: b */
    public final AbstractC89172b<EffectProfileState, AbstractC88979t<C89378p<List<C75445g>, C20465o>>> mo33726b() {
        return this.f144393f;
    }

    @Override // com.bytedance.jedi.arch.ext.list.ListViewModel
    /* renamed from: i */
    public final AbstractC89183m<List<? extends C75445g>, List<? extends C75445g>, List<C75445g>> mo33755i() {
        return this.f144394g;
    }

    @Override // com.bytedance.jedi.arch.ext.list.ListViewModel
    /* renamed from: j */
    public final AbstractC89183m<List<? extends C75445g>, List<? extends C75445g>, List<C75445g>> mo33756j() {
        return this.f144395k;
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ AbstractC20368af mo23027d() {
        return new EffectProfileState(null, null, 3, null);
    }

    /* renamed from: m */
    public final String mo102271m() {
        if (this.f144389b) {
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            String curUserId = g.getCurUserId();
            C89219l.m154716b(curUserId, "");
            return curUserId;
        }
        String str = this.f144390c;
        if (str == null) {
            return "";
        }
        return str;
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.effect.EffectProfileListViewModel$f */
    static final class C63688f extends AbstractC89220m implements AbstractC89172b<EffectProfileState, AbstractC88979t<C89378p<? extends List<? extends C75445g>, ? extends C20465o>>> {

        /* renamed from: a */
        final /* synthetic */ EffectProfileListViewModel f144402a;

        static {
            Covode.recordClassIndex(75012);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C63688f(EffectProfileListViewModel effectProfileListViewModel) {
            super(1);
            this.f144402a = effectProfileListViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AbstractC88979t<C89378p<? extends List<? extends C75445g>, ? extends C20465o>> invoke(EffectProfileState effectProfileState) {
            C89219l.m154721d(effectProfileState, "");
            AbstractC88979t<R> d = C63733g.m115263a(this.f144402a.mo102271m(), 0).mo143292d(C636891.f144403a);
            C89219l.m154716b(d, "");
            return d;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.effect.EffectProfileListViewModel$b */
    public static final class C63683b extends AbstractC89220m implements AbstractC89172b<EffectProfileState, EffectProfileState> {

        /* renamed from: a */
        public static final C63683b f144396a = new C63683b();

        static {
            Covode.recordClassIndex(75007);
        }

        C63683b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EffectProfileState invoke(EffectProfileState effectProfileState) {
            EffectProfileState effectProfileState2 = effectProfileState;
            C89219l.m154721d(effectProfileState2, "");
            return EffectProfileState.copy$default(effectProfileState2, null, new ListState(new C20465o(false, 0), C89086z.INSTANCE, null, null, null, 28, null), 1, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.effect.EffectProfileListViewModel$c */
    static final class C63684c extends AbstractC89220m implements AbstractC89172b<EffectProfileState, AbstractC88979t<C89378p<? extends List<? extends C75445g>, ? extends C20465o>>> {

        /* renamed from: a */
        final /* synthetic */ EffectProfileListViewModel f144397a;

        static {
            Covode.recordClassIndex(75008);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C63684c(EffectProfileListViewModel effectProfileListViewModel) {
            super(1);
            this.f144397a = effectProfileListViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AbstractC88979t<C89378p<? extends List<? extends C75445g>, ? extends C20465o>> invoke(EffectProfileState effectProfileState) {
            EffectProfileState effectProfileState2 = effectProfileState;
            C89219l.m154721d(effectProfileState2, "");
            AbstractC88979t<R> d = C63733g.m115263a(this.f144397a.mo102271m(), (long) effectProfileState2.getSubstate().getPayload().f48407b).mo143292d(C636851.f144398a);
            C89219l.m154716b(d, "");
            return d;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.effect.EffectProfileListViewModel$e */
    static final class C63687e extends AbstractC89220m implements AbstractC89172b<EffectProfileState, C89391z> {

        /* renamed from: a */
        final /* synthetic */ Aweme f144400a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89172b f144401b;

        static {
            Covode.recordClassIndex(75011);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C63687e(Aweme aweme, AbstractC89172b bVar) {
            super(1);
            this.f144400a = aweme;
            this.f144401b = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(EffectProfileState effectProfileState) {
            EffectProfileState effectProfileState2 = effectProfileState;
            C89219l.m154721d(effectProfileState2, "");
            Iterator<C75445g> it = effectProfileState2.getSubstate().getList().iterator();
            while (true) {
                if (!it.hasNext()) {
                    this.f144401b.invoke(null);
                    break;
                }
                C75445g next = it.next();
                if (!(next.relatedAweme == null || this.f144400a == null)) {
                    Aweme aweme = next.relatedAweme;
                    C89219l.m154716b(aweme, "");
                    if (C89219l.m154714a((Object) aweme.getAid(), (Object) this.f144400a.getAid())) {
                        this.f144401b.invoke(next);
                        break;
                    }
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.effect.EffectProfileListViewModel$g */
    static final class C63690g extends AbstractC89220m implements AbstractC89183m<List<? extends C75445g>, List<? extends C75445g>, List<? extends C75445g>> {

        /* renamed from: a */
        public static final C63690g f144404a = new C63690g();

        static {
            Covode.recordClassIndex(75014);
        }

        C63690g() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ List<? extends C75445g> invoke(List<? extends C75445g> list, List<? extends C75445g> list2) {
            C89219l.m154721d(list, "");
            C89219l.m154721d(list2, "");
            return list2;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.effect.AbstractC63734h
    /* renamed from: a */
    public final void mo102269a(Aweme aweme, AbstractC89172b<? super C75445g, C89391z> bVar) {
        C89219l.m154721d(bVar, "");
        mo33687b_(new C63687e(aweme, bVar));
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.effect.EffectProfileListViewModel$d */
    static final class C63686d extends AbstractC89220m implements AbstractC89183m<List<? extends C75445g>, List<? extends C75445g>, List<? extends C75445g>> {

        /* renamed from: a */
        public static final C63686d f144399a = new C63686d();

        static {
            Covode.recordClassIndex(75010);
        }

        C63686d() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ List<? extends C75445g> invoke(List<? extends C75445g> list, List<? extends C75445g> list2) {
            List<? extends C75445g> list3 = list;
            List<? extends C75445g> list4 = list2;
            C89219l.m154721d(list3, "");
            C89219l.m154721d(list4, "");
            return C89070n.m154572d((Collection) list3, (Iterable) list4);
        }
    }

    /* renamed from: a */
    public final void mo102270a(boolean z, String str, String str2) {
        this.f144389b = z;
        this.f144390c = str;
        this.f144391d = str2;
    }
}
