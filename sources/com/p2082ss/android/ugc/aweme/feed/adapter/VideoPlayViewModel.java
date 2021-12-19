package com.p2082ss.android.ugc.aweme.feed.adapter;

import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.p795b.AbstractC12656g;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.C12815c;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel */
public final class VideoPlayViewModel extends AssemViewModel<C48200bc> {

    /* renamed from: j */
    public static final C48082a f111355j = new C48082a((byte) 0);

    /* renamed from: k */
    private final boolean f111356k = true;

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel$a */
    public static final class C48082a {

        /* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel$a$a */
        public static final class C48083a extends AbstractC89220m implements AbstractC89172b<C48200bc, C48200bc> {
            public static final C48083a INSTANCE = new C48083a();

            static {
                Covode.recordClassIndex(56822);
            }

            public C48083a() {
                super(1);
            }

            public final C48200bc invoke(C48200bc bcVar) {
                C89219l.m154719c(bcVar, "");
                return bcVar;
            }
        }

        static {
            Covode.recordClassIndex(56821);
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel$a$d */
        public static final class C48086d extends AbstractC89220m implements AbstractC89171a<AbstractC12656g> {

            /* renamed from: a */
            final /* synthetic */ AbstractC12656g f111359a;

            static {
                Covode.recordClassIndex(56825);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C48086d(AbstractC12656g gVar) {
                super(0);
                this.f111359a = gVar;
            }

            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final AbstractC12656g invoke() {
                return this.f111359a;
            }
        }

        private C48082a() {
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel$a$c */
        public static final class C48085c extends AbstractC89220m implements AbstractC89171a<C12874b<C48200bc>> {
            public static final C48085c INSTANCE = new C48085c();

            static {
                Covode.recordClassIndex(56824);
            }

            public C48085c() {
                super(0);
            }

            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final C12874b<C48200bc> invoke() {
                return new C12874b<>();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel$a$e */
        public static final class C48087e extends AbstractC89220m implements AbstractC89171a<C12815c> {
            public static final C48087e INSTANCE = new C48087e();

            static {
                Covode.recordClassIndex(56826);
            }

            public C48087e() {
                super(0);
            }

            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final C12815c invoke() {
                return new C12815c();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel$a$b */
        public static final class C48084b extends AbstractC89220m implements AbstractC89171a<String> {

            /* renamed from: a */
            final /* synthetic */ AbstractC12656g f111357a;

            /* renamed from: b */
            final /* synthetic */ AbstractC89277c f111358b;

            static {
                Covode.recordClassIndex(56823);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C48084b(AbstractC12656g gVar, AbstractC89277c cVar) {
                super(0);
                this.f111357a = gVar;
                this.f111358b = cVar;
            }

            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final String invoke() {
                return C89219l.m154704a(this.f111358b.mo143613b(), (Object) String.valueOf(this.f111357a.hashCode()));
            }
        }

        public /* synthetic */ C48082a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(56820);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final boolean bR_() {
        return this.f111356k;
    }

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    /* renamed from: f */
    public final /* synthetic */ C48200bc mo20674f() {
        return new C48200bc();
    }

    /* renamed from: g */
    public final void mo23342g() {
        mo20662a(new C48097k());
    }

    /* renamed from: a */
    public final void mo80147a(int i) {
        mo20662a(new C48094h(i));
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel$b */
    static final class C48088b extends AbstractC89220m implements AbstractC89172b<C48200bc, C48200bc> {

        /* renamed from: a */
        final /* synthetic */ double f111360a;

        static {
            Covode.recordClassIndex(56827);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48088b(double d) {
            super(1);
            this.f111360a = d;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C48200bc invoke(C48200bc bcVar) {
            C48200bc bcVar2 = bcVar;
            C89219l.m154721d(bcVar2, "");
            return C48200bc.m91541a(bcVar2, null, null, null, null, null, null, null, null, Double.valueOf(this.f111360a), null, 767);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel$d */
    static final class C48090d extends AbstractC89220m implements AbstractC89172b<C48200bc, C48200bc> {

        /* renamed from: a */
        public static final C48090d f111362a = new C48090d();

        static {
            Covode.recordClassIndex(56829);
        }

        C48090d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C48200bc invoke(C48200bc bcVar) {
            C48200bc bcVar2 = bcVar;
            C89219l.m154721d(bcVar2, "");
            return C48200bc.m91541a(bcVar2, null, null, null, null, null, new C12776a(C89391z.f203057a), null, null, null, null, 991);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel$e */
    public static final class C48091e extends AbstractC89220m implements AbstractC89172b<C48200bc, C48200bc> {

        /* renamed from: a */
        public static final C48091e f111363a = new C48091e();

        static {
            Covode.recordClassIndex(56830);
        }

        C48091e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C48200bc invoke(C48200bc bcVar) {
            C48200bc bcVar2 = bcVar;
            C89219l.m154721d(bcVar2, "");
            return C48200bc.m91541a(bcVar2, null, null, null, null, new C12776a(C89391z.f203057a), null, null, null, null, null, 1007);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel$f */
    static final class C48092f extends AbstractC89220m implements AbstractC89172b<C48200bc, C48200bc> {

        /* renamed from: a */
        public static final C48092f f111364a = new C48092f();

        static {
            Covode.recordClassIndex(56831);
        }

        C48092f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C48200bc invoke(C48200bc bcVar) {
            C48200bc bcVar2 = bcVar;
            C89219l.m154721d(bcVar2, "");
            return C48200bc.m91541a(bcVar2, null, null, null, new C12776a(C89391z.f203057a), null, null, null, null, null, null, 1015);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel$g */
    static final class C48093g extends AbstractC89220m implements AbstractC89172b<C48200bc, C48200bc> {

        /* renamed from: a */
        public static final C48093g f111365a = new C48093g();

        static {
            Covode.recordClassIndex(56832);
        }

        C48093g() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C48200bc invoke(C48200bc bcVar) {
            C48200bc bcVar2 = bcVar;
            C89219l.m154721d(bcVar2, "");
            return C48200bc.m91541a(bcVar2, null, null, null, null, null, null, new C12776a(C89391z.f203057a), null, null, null, 959);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel$i */
    static final class C48095i extends AbstractC89220m implements AbstractC89172b<C48200bc, C48200bc> {

        /* renamed from: a */
        final /* synthetic */ Aweme f111367a;

        static {
            Covode.recordClassIndex(56834);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48095i(Aweme aweme) {
            super(1);
            this.f111367a = aweme;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C48200bc invoke(C48200bc bcVar) {
            C48200bc bcVar2 = bcVar;
            C89219l.m154721d(bcVar2, "");
            return C48200bc.m91541a(bcVar2, null, null, null, null, null, null, null, null, null, new C12776a(this.f111367a), 511);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel$c */
    static final class C48089c extends AbstractC89220m implements AbstractC89172b<C48200bc, C48200bc> {

        /* renamed from: a */
        final /* synthetic */ float f111361a;

        static {
            Covode.recordClassIndex(56828);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48089c(float f) {
            super(1);
            this.f111361a = f;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C48200bc invoke(C48200bc bcVar) {
            C48200bc bcVar2 = bcVar;
            C89219l.m154721d(bcVar2, "");
            return C48200bc.m91541a(bcVar2, null, null, null, null, null, null, null, new C12776a(Float.valueOf(this.f111361a)), null, null, 895);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel$h */
    public static final class C48094h extends AbstractC89220m implements AbstractC89172b<C48200bc, C48200bc> {

        /* renamed from: a */
        final /* synthetic */ int f111366a;

        static {
            Covode.recordClassIndex(56833);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48094h(int i) {
            super(1);
            this.f111366a = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C48200bc invoke(C48200bc bcVar) {
            C48200bc bcVar2 = bcVar;
            C89219l.m154721d(bcVar2, "");
            return C48200bc.m91541a(bcVar2, null, new C12776a(Integer.valueOf(this.f111366a)), null, null, null, null, null, null, null, null, 1021);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel$j */
    public static final class C48096j extends AbstractC89220m implements AbstractC89172b<C48200bc, C48200bc> {

        /* renamed from: a */
        final /* synthetic */ boolean f111368a = true;

        static {
            Covode.recordClassIndex(56835);
        }

        C48096j() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C48200bc invoke(C48200bc bcVar) {
            C48200bc bcVar2 = bcVar;
            C89219l.m154721d(bcVar2, "");
            return C48200bc.m91541a(bcVar2, new C12776a(Boolean.valueOf(this.f111368a)), null, null, null, null, null, null, null, null, null, 1022);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel$k */
    public static final class C48097k extends AbstractC89220m implements AbstractC89172b<C48200bc, C48200bc> {

        /* renamed from: a */
        final /* synthetic */ boolean f111369a = true;

        static {
            Covode.recordClassIndex(56836);
        }

        C48097k() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C48200bc invoke(C48200bc bcVar) {
            C48200bc bcVar2 = bcVar;
            C89219l.m154721d(bcVar2, "");
            return C48200bc.m91541a(bcVar2, null, null, new C12776a(Boolean.valueOf(this.f111369a)), null, null, null, null, null, null, null, 1019);
        }
    }
}
