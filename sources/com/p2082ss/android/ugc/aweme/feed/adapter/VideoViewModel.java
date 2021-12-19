package com.p2082ss.android.ugc.aweme.feed.adapter;

import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.p795b.AbstractC12656g;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.C12815c;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.VideoCaptionUpdateParams;
import com.p2082ss.android.ugc.aweme.feed.model.VideoItemParams;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoViewModel */
public final class VideoViewModel extends AssemViewModel<C48244cj> {

    /* renamed from: j */
    public static final C48118a f111508j = new C48118a((byte) 0);

    /* renamed from: k */
    private final boolean f111509k = true;

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoViewModel$a */
    public static final class C48118a {

        /* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoViewModel$a$a */
        public static final class C48119a extends AbstractC89220m implements AbstractC89172b<C48244cj, C48244cj> {
            public static final C48119a INSTANCE = new C48119a();

            static {
                Covode.recordClassIndex(56860);
            }

            public C48119a() {
                super(1);
            }

            public final C48244cj invoke(C48244cj cjVar) {
                C89219l.m154719c(cjVar, "");
                return cjVar;
            }
        }

        static {
            Covode.recordClassIndex(56859);
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoViewModel$a$d */
        public static final class C48122d extends AbstractC89220m implements AbstractC89171a<AbstractC12656g> {

            /* renamed from: a */
            final /* synthetic */ AbstractC12656g f111512a;

            static {
                Covode.recordClassIndex(56863);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C48122d(AbstractC12656g gVar) {
                super(0);
                this.f111512a = gVar;
            }

            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final AbstractC12656g invoke() {
                return this.f111512a;
            }
        }

        private C48118a() {
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoViewModel$a$c */
        public static final class C48121c extends AbstractC89220m implements AbstractC89171a<C12874b<C48244cj>> {
            public static final C48121c INSTANCE = new C48121c();

            static {
                Covode.recordClassIndex(56862);
            }

            public C48121c() {
                super(0);
            }

            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final C12874b<C48244cj> invoke() {
                return new C12874b<>();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoViewModel$a$e */
        public static final class C48123e extends AbstractC89220m implements AbstractC89171a<C12815c> {
            public static final C48123e INSTANCE = new C48123e();

            static {
                Covode.recordClassIndex(56864);
            }

            public C48123e() {
                super(0);
            }

            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final C12815c invoke() {
                return new C12815c();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoViewModel$a$b */
        public static final class C48120b extends AbstractC89220m implements AbstractC89171a<String> {

            /* renamed from: a */
            final /* synthetic */ AbstractC12656g f111510a;

            /* renamed from: b */
            final /* synthetic */ AbstractC89277c f111511b;

            static {
                Covode.recordClassIndex(56861);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C48120b(AbstractC12656g gVar, AbstractC89277c cVar) {
                super(0);
                this.f111510a = gVar;
                this.f111511b = cVar;
            }

            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final String invoke() {
                return C89219l.m154704a(this.f111511b.mo143613b(), (Object) String.valueOf(this.f111510a.hashCode()));
            }
        }

        public /* synthetic */ C48118a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(56858);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final boolean bR_() {
        return this.f111509k;
    }

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    /* renamed from: f */
    public final /* synthetic */ C48244cj mo20674f() {
        return new C48244cj();
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoViewModel$c */
    static final class C48125c extends AbstractC89220m implements AbstractC89172b<C48244cj, C48244cj> {

        /* renamed from: a */
        final /* synthetic */ VideoCaptionUpdateParams f111514a;

        static {
            Covode.recordClassIndex(56866);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48125c(VideoCaptionUpdateParams videoCaptionUpdateParams) {
            super(1);
            this.f111514a = videoCaptionUpdateParams;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C48244cj invoke(C48244cj cjVar) {
            C48244cj cjVar2 = cjVar;
            C89219l.m154721d(cjVar2, "");
            return C48244cj.m91653a(cjVar2, null, null, null, null, null, null, null, null, new C12776a(this.f111514a), null, null, 1791);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoViewModel$d */
    static final class C48126d extends AbstractC89220m implements AbstractC89172b<C48244cj, C48244cj> {

        /* renamed from: a */
        final /* synthetic */ Aweme f111515a;

        static {
            Covode.recordClassIndex(56867);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48126d(Aweme aweme) {
            super(1);
            this.f111515a = aweme;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C48244cj invoke(C48244cj cjVar) {
            C48244cj cjVar2 = cjVar;
            C89219l.m154721d(cjVar2, "");
            return C48244cj.m91653a(cjVar2, null, null, null, null, new C12776a(this.f111515a), null, null, null, null, null, null, 2031);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoViewModel$e */
    static final class C48127e extends AbstractC89220m implements AbstractC89172b<C48244cj, C48244cj> {

        /* renamed from: a */
        public static final C48127e f111516a = new C48127e();

        static {
            Covode.recordClassIndex(56868);
        }

        C48127e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C48244cj invoke(C48244cj cjVar) {
            C48244cj cjVar2 = cjVar;
            C89219l.m154721d(cjVar2, "");
            return C48244cj.m91653a(cjVar2, null, null, null, new C12776a(C89391z.f203057a), null, null, null, null, null, null, null, 2039);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoViewModel$g */
    public static final class C48129g extends AbstractC89220m implements AbstractC89172b<C48244cj, C48244cj> {

        /* renamed from: a */
        final /* synthetic */ String f111518a;

        static {
            Covode.recordClassIndex(56870);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48129g(String str) {
            super(1);
            this.f111518a = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C48244cj invoke(C48244cj cjVar) {
            C48244cj cjVar2 = cjVar;
            C89219l.m154721d(cjVar2, "");
            return C48244cj.m91653a(cjVar2, null, new C12776a(this.f111518a), null, null, null, null, null, null, null, null, null, 2045);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoViewModel$i */
    public static final class C48131i extends AbstractC89220m implements AbstractC89172b<C48244cj, C48244cj> {

        /* renamed from: a */
        public static final C48131i f111520a = new C48131i();

        static {
            Covode.recordClassIndex(56872);
        }

        C48131i() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C48244cj invoke(C48244cj cjVar) {
            C48244cj cjVar2 = cjVar;
            C89219l.m154721d(cjVar2, "");
            return C48244cj.m91653a(cjVar2, null, null, new C12776a(C89391z.f203057a), null, null, null, null, null, null, null, null, 2043);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoViewModel$k */
    static final class C48133k extends AbstractC89220m implements AbstractC89172b<C48244cj, C48244cj> {

        /* renamed from: a */
        final /* synthetic */ VideoItemParams f111522a;

        static {
            Covode.recordClassIndex(56874);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48133k(VideoItemParams videoItemParams) {
            super(1);
            this.f111522a = videoItemParams;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C48244cj invoke(C48244cj cjVar) {
            C48244cj cjVar2 = cjVar;
            C89219l.m154721d(cjVar2, "");
            return C48244cj.m91653a(cjVar2, null, null, null, null, null, null, new C12776a(this.f111522a), null, null, null, null, 1983);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoViewModel$l */
    static final class C48134l extends AbstractC89220m implements AbstractC89172b<C48244cj, C48244cj> {

        /* renamed from: a */
        final /* synthetic */ VideoItemParams f111523a;

        static {
            Covode.recordClassIndex(56875);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48134l(VideoItemParams videoItemParams) {
            super(1);
            this.f111523a = videoItemParams;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C48244cj invoke(C48244cj cjVar) {
            C48244cj cjVar2 = cjVar;
            C89219l.m154721d(cjVar2, "");
            return C48244cj.m91653a(cjVar2, null, null, null, null, null, new C12776a(this.f111523a), null, null, null, null, null, 2015);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoViewModel$b */
    public static final class C48124b extends AbstractC89220m implements AbstractC89172b<C48244cj, C48244cj> {

        /* renamed from: a */
        final /* synthetic */ boolean f111513a = true;

        static {
            Covode.recordClassIndex(56865);
        }

        C48124b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C48244cj invoke(C48244cj cjVar) {
            C48244cj cjVar2 = cjVar;
            C89219l.m154721d(cjVar2, "");
            return C48244cj.m91653a(cjVar2, null, null, null, null, null, null, null, null, null, null, new C12776a(Boolean.valueOf(this.f111513a)), 1023);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoViewModel$f */
    public static final class C48128f extends AbstractC89220m implements AbstractC89172b<C48244cj, C48244cj> {

        /* renamed from: a */
        final /* synthetic */ int f111517a;

        static {
            Covode.recordClassIndex(56869);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48128f(int i) {
            super(1);
            this.f111517a = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C48244cj invoke(C48244cj cjVar) {
            C48244cj cjVar2 = cjVar;
            C89219l.m154721d(cjVar2, "");
            return C48244cj.m91653a(cjVar2, null, null, null, null, null, null, null, new C12776a(Integer.valueOf(this.f111517a)), null, null, null, 1919);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoViewModel$h */
    static final class C48130h extends AbstractC89220m implements AbstractC89172b<C48244cj, C48244cj> {

        /* renamed from: a */
        final /* synthetic */ int f111519a;

        static {
            Covode.recordClassIndex(56871);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48130h(int i) {
            super(1);
            this.f111519a = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C48244cj invoke(C48244cj cjVar) {
            C48244cj cjVar2 = cjVar;
            C89219l.m154721d(cjVar2, "");
            return C48244cj.m91653a(cjVar2, new C12776a(Integer.valueOf(this.f111519a)), null, null, null, null, null, null, null, null, null, null, 2046);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoViewModel$j */
    static final class C48132j extends AbstractC89220m implements AbstractC89172b<C48244cj, C48244cj> {

        /* renamed from: a */
        final /* synthetic */ boolean f111521a;

        static {
            Covode.recordClassIndex(56873);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48132j(boolean z) {
            super(1);
            this.f111521a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C48244cj invoke(C48244cj cjVar) {
            C48244cj cjVar2 = cjVar;
            C89219l.m154721d(cjVar2, "");
            return C48244cj.m91653a(cjVar2, null, null, null, null, null, null, null, null, null, new C12776a(Boolean.valueOf(this.f111521a)), null, 1535);
        }
    }
}
