package com.p2082ss.android.ugc.aweme.feed.assem;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.C12759i;
import com.bytedance.assem.arch.core.C12764n;
import com.bytedance.assem.arch.core.EnumC12758h;
import com.bytedance.assem.arch.core.EnumC12762l;
import com.bytedance.assem.arch.extensions.AbstractC12779c;
import com.bytedance.assem.arch.extensions.AbstractC12789k;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.extensions.C12777b;
import com.bytedance.assem.arch.extensions.C12787j;
import com.bytedance.assem.arch.p795b.AbstractC12658i;
import com.bytedance.assem.arch.p795b.AbstractC12695v;
import com.bytedance.assem.arch.p795b.C12661l;
import com.bytedance.assem.arch.p795b.C12690t;
import com.bytedance.assem.arch.viewModel.AbstractC12818f;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.C12815c;
import com.bytedance.assem.arch.viewModel.C12854k;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.C14524g;
import com.p2082ss.android.ugc.aweme.base.utils.C34727m;
import com.p2082ss.android.ugc.aweme.feed.adapter.C48244cj;
import com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.p2082ss.android.ugc.aweme.feed.assem.addiction.C48361b;
import com.p2082ss.android.ugc.aweme.feed.assem.addiction.VideoAntiAddictionVM;
import com.p2082ss.android.ugc.aweme.feed.assem.avatar.C48383a;
import com.p2082ss.android.ugc.aweme.feed.assem.caution.C48497a;
import com.p2082ss.android.ugc.aweme.feed.assem.desc.C48593c;
import com.p2082ss.android.ugc.aweme.feed.assem.digg.C48665a;
import com.p2082ss.android.ugc.aweme.feed.assem.digg.C48700j;
import com.p2082ss.android.ugc.aweme.feed.assem.generalmask.C48716a;
import com.p2082ss.android.ugc.aweme.feed.assem.more.C48739a;
import com.p2082ss.android.ugc.aweme.feed.assem.multitag.C48750a;
import com.p2082ss.android.ugc.aweme.feed.assem.music.C48782b;
import com.p2082ss.android.ugc.aweme.feed.assem.music.C48824n;
import com.p2082ss.android.ugc.aweme.feed.assem.p2939b.C48481a;
import com.p2082ss.android.ugc.aweme.feed.assem.p2939b.C48482b;
import com.p2082ss.android.ugc.aweme.feed.assem.photosensitivevideomask.C48868a;
import com.p2082ss.android.ugc.aweme.feed.assem.progressbar.C48902a;
import com.p2082ss.android.ugc.aweme.feed.assem.report.C48957b;
import com.p2082ss.android.ugc.aweme.feed.assem.report.C48959c;
import com.p2082ss.android.ugc.aweme.feed.assem.report.C48981i;
import com.p2082ss.android.ugc.aweme.feed.assem.review.C48990b;
import com.p2082ss.android.ugc.aweme.feed.assem.share.View$OnClickListenerC49022h;
import com.p2082ss.android.ugc.aweme.feed.assem.sharer.C49075a;
import com.p2082ss.android.ugc.aweme.feed.assem.videoauthorinfo.C49113a;
import com.p2082ss.android.ugc.aweme.feed.assem.videocomment.C49179b;
import com.p2082ss.android.ugc.aweme.feed.assem.vpainfobar.C49219a;
import com.p2082ss.android.ugc.aweme.feed.assem.vpaoptedoutmask.C49248a;
import com.p2082ss.android.ugc.aweme.feed.experiment.C49531u;
import com.p2082ss.android.ugc.aweme.feed.experiment.C49536y;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.VideoDiggWidget;
import com.p2082ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.p2082ss.android.ugc.aweme.feed.model.ExposeSharer;
import com.p2082ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50539g;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import com.p2082ss.android.ugc.aweme.language.C58071d;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3252c.C56216k;
import com.p2082ss.android.ugc.aweme.upvote.p4188b.C79705a;
import com.p2082ss.android.ugc.aweme.upvote.publish.C80022g;
import com.p2082ss.android.ugc.aweme.upvote.service.C80034a;
import com.p2082ss.android.ugc.aweme.utils.C80635y;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.assem.b */
public final class C48442b extends AbstractC12695v<C48442b> implements AbstractC12658i<VideoItemParams> {

    /* renamed from: r */
    public final BaseFeedPageParams f112176r;

    /* renamed from: s */
    public final AbstractC89171a<Long> f112177s;

    /* renamed from: t */
    public final boolean f112178t;

    /* renamed from: u */
    private final AbstractC89244h f112179u = new C14524g(C89204ab.m154669a(VideoViewModel.class), this, C48444b.INSTANCE, C48445c.INSTANCE, C48443a.INSTANCE);

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.b$a */
    public static final class C48443a extends AbstractC89220m implements AbstractC89172b<C48244cj, C48244cj> {
        public static final C48443a INSTANCE = new C48443a();

        static {
            Covode.recordClassIndex(57217);
        }

        public C48443a() {
            super(1);
        }

        public final C48244cj invoke(C48244cj cjVar) {
            C89219l.m154719c(cjVar, "");
            return cjVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.assem.b$h */
    public final /* synthetic */ class RunnableC48478h implements Runnable {

        /* renamed from: a */
        private final /* synthetic */ AbstractC89171a f112216a;

        static {
            Covode.recordClassIndex(57252);
        }

        RunnableC48478h(AbstractC89171a aVar) {
            this.f112216a = aVar;
        }

        public final /* synthetic */ void run() {
            C89219l.m154716b(this.f112216a.invoke(), "");
        }
    }

    static {
        Covode.recordClassIndex(57216);
    }

    /* renamed from: C */
    public final VideoViewModel mo80543C() {
        return (VideoViewModel) this.f112179u.getValue();
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12658i
    /* renamed from: a */
    public final void mo20466a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.b$b */
    public static final class C48444b extends AbstractC89220m implements AbstractC89171a<C12874b<C48244cj>> {
        public static final C48444b INSTANCE = new C48444b();

        static {
            Covode.recordClassIndex(57218);
        }

        public C48444b() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C48244cj> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.b$c */
    public static final class C48445c extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C48445c INSTANCE = new C48445c();

        static {
            Covode.recordClassIndex(57219);
        }

        public C48445c() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.assem.b$i */
    public static final /* synthetic */ class C48479i extends C89217j implements AbstractC89171a<C89391z> {
        static {
            Covode.recordClassIndex(57253);
        }

        C48479i(C48442b bVar) {
            super(0, bVar, C48442b.class, "subscribeUpvotePublishEvent", "subscribeUpvotePublishEvent()V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            ((C48442b) this.receiver).mo80544D();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.b$d */
    static final class C48446d extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C48442b f112180a;

        /* renamed from: b */
        final /* synthetic */ Assembler f112181b;

        static {
            Covode.recordClassIndex(57220);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48446d(C48442b bVar, Assembler assembler) {
            super(0);
            this.f112180a = bVar;
            this.f112181b = assembler;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            String str;
            Assembler assembler = this.f112181b;
            if (this.f112180a.f112178t) {
                if (C49531u.f113911a) {
                    assembler.mo20575a(this.f112180a, (AbstractC89172b<? super C12764n, C89391z>) new C48447a(this));
                }
                assembler.mo20575a(this.f112180a, (AbstractC89172b<? super C12764n, C89391z>) new C48448b(this));
                C49812b bVar = this.f112180a.f112176r.param;
                if (bVar != null) {
                    str = bVar.getFrom();
                } else {
                    str = null;
                }
                if (!C89219l.m154714a((Object) "from_publish_add_video", (Object) str)) {
                    assembler.mo20575a(this.f112180a, (AbstractC89172b<? super C12764n, C89391z>) new C48449c(this));
                }
                assembler.mo20575a(this.f112180a, (AbstractC89172b<? super C12764n, C89391z>) new C48450d(this));
                assembler.mo20575a(this.f112180a, (AbstractC89172b<? super C12764n, C89391z>) new C48451e(this));
            }
            return C89391z.f203057a;
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.assem.b$d$a */
        static final class C48447a extends AbstractC89220m implements AbstractC89172b<C12764n, C89391z> {

            /* renamed from: a */
            final /* synthetic */ C48446d f112182a;

            static {
                Covode.recordClassIndex(57221);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C48447a(C48446d dVar) {
                super(1);
                this.f112182a = dVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(C12764n nVar) {
                C12764n nVar2 = nVar;
                C89219l.m154721d(nVar2, "");
                nVar2.mo20623a(EnumC12762l.ASYNC_X2C);
                nVar2.f31042d = R.id.fe_;
                nVar2.mo20624a(C89204ab.m154669a(C48593c.class));
                nVar2.f31040b = new C48593c();
                return C89391z.f203057a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.assem.b$d$b */
        static final class C48448b extends AbstractC89220m implements AbstractC89172b<C12764n, C89391z> {

            /* renamed from: a */
            final /* synthetic */ C48446d f112183a;

            static {
                Covode.recordClassIndex(57222);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C48448b(C48446d dVar) {
                super(1);
                this.f112183a = dVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(C12764n nVar) {
                C12764n nVar2 = nVar;
                C89219l.m154721d(nVar2, "");
                nVar2.mo20623a(EnumC12762l.ASYNC_X2C);
                nVar2.mo20624a(C89204ab.m154669a(C48824n.class));
                nVar2.f31040b = new C48824n();
                nVar2.f31042d = R.id.fec;
                return C89391z.f203057a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.assem.b$d$c */
        static final class C48449c extends AbstractC89220m implements AbstractC89172b<C12764n, C89391z> {

            /* renamed from: a */
            final /* synthetic */ C48446d f112184a;

            static {
                Covode.recordClassIndex(57223);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C48449c(C48446d dVar) {
                super(1);
                this.f112184a = dVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(C12764n nVar) {
                C12764n nVar2 = nVar;
                C89219l.m154721d(nVar2, "");
                nVar2.mo20623a(EnumC12762l.ASYNC_X2C);
                nVar2.mo20624a(C89204ab.m154669a(C48782b.class));
                nVar2.f31040b = new C48782b();
                nVar2.f31042d = R.id.feb;
                return C89391z.f203057a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.assem.b$d$d */
        static final class C48450d extends AbstractC89220m implements AbstractC89172b<C12764n, C89391z> {

            /* renamed from: a */
            final /* synthetic */ C48446d f112185a;

            static {
                Covode.recordClassIndex(57224);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C48450d(C48446d dVar) {
                super(1);
                this.f112185a = dVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(C12764n nVar) {
                C12764n nVar2 = nVar;
                C89219l.m154721d(nVar2, "");
                nVar2.mo20623a(EnumC12762l.ASYNC_X2C);
                nVar2.mo20624a(C89204ab.m154669a(C49113a.class));
                nVar2.f31040b = new C49113a();
                nVar2.f31042d = R.id.c34;
                return C89391z.f203057a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.assem.b$d$e */
        static final class C48451e extends AbstractC89220m implements AbstractC89172b<C12764n, C89391z> {

            /* renamed from: a */
            final /* synthetic */ C48446d f112186a;

            static {
                Covode.recordClassIndex(57225);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C48451e(C48446d dVar) {
                super(1);
                this.f112186a = dVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(C12764n nVar) {
                C12764n nVar2 = nVar;
                C89219l.m154721d(nVar2, "");
                nVar2.mo20623a(EnumC12762l.ASYNC_X2C);
                nVar2.mo20624a(C89204ab.m154669a(C48902a.class));
                nVar2.f31040b = new C48902a();
                nVar2.f31042d = R.id.dhe;
                return C89391z.f203057a;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.b$g */
    static final class C48470g extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C48442b f112207a;

        /* renamed from: b */
        final /* synthetic */ Assembler f112208b;

        static {
            Covode.recordClassIndex(57244);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48470g(C48442b bVar, Assembler assembler) {
            super(0);
            this.f112207a = bVar;
            this.f112208b = assembler;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            Assembler assembler = this.f112208b;
            AbstractC12789k kVar = C12787j.f31108b;
            if (kVar != null) {
                kVar.mo20640a("AssemList", "reusedUiSlotAssem triggerAssemCreated");
            }
            if (this.f112207a.f112178t) {
                assembler.mo20575a(this.f112207a, (AbstractC89172b<? super C12764n, C89391z>) new C48471a(this));
                assembler.mo20581a(this.f112207a, (AbstractC89172b<? super C12759i<AbstractC12779c>, C89391z>) new C48472b(this));
                AbstractC12789k kVar2 = C12787j.f31108b;
                if (kVar2 != null) {
                    kVar2.mo20640a("AssemList", "reusedUiSlotAssem diggAssem: " + C12787j.f31109c);
                }
                assembler.mo20575a(this.f112207a, (AbstractC89172b<? super C12764n, C89391z>) new C48474c(this));
                assembler.mo20575a(this.f112207a, (AbstractC89172b<? super C12764n, C89391z>) new C48475d(this));
                assembler.mo20575a(this.f112207a, (AbstractC89172b<? super C12764n, C89391z>) new C48476e(this));
                if (C56216k.m102133c()) {
                    assembler.mo20575a(this.f112207a, (AbstractC89172b<? super C12764n, C89391z>) C48477f.f112215a);
                }
            }
            return C89391z.f203057a;
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.assem.b$g$a */
        static final class C48471a extends AbstractC89220m implements AbstractC89172b<C12764n, C89391z> {

            /* renamed from: a */
            final /* synthetic */ C48470g f112209a;

            static {
                Covode.recordClassIndex(57245);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C48471a(C48470g gVar) {
                super(1);
                this.f112209a = gVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(C12764n nVar) {
                C12764n nVar2 = nVar;
                C89219l.m154721d(nVar2, "");
                nVar2.mo20623a(EnumC12762l.ASYNC_X2C);
                nVar2.f31042d = R.id.oo;
                nVar2.mo20624a(C89204ab.m154669a(C48383a.class));
                nVar2.f31040b = new C48383a();
                return C89391z.f203057a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.assem.b$g$c */
        static final class C48474c extends AbstractC89220m implements AbstractC89172b<C12764n, C89391z> {

            /* renamed from: a */
            final /* synthetic */ C48470g f112212a;

            static {
                Covode.recordClassIndex(57248);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C48474c(C48470g gVar) {
                super(1);
                this.f112212a = gVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(C12764n nVar) {
                C12764n nVar2 = nVar;
                C89219l.m154721d(nVar2, "");
                nVar2.mo20623a(EnumC12762l.ASYNC_X2C);
                nVar2.f31042d = R.id.alb;
                nVar2.mo20624a(C89204ab.m154669a(C48665a.class));
                nVar2.f31040b = new C48665a();
                return C89391z.f203057a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.assem.b$g$d */
        static final class C48475d extends AbstractC89220m implements AbstractC89172b<C12764n, C89391z> {

            /* renamed from: a */
            final /* synthetic */ C48470g f112213a;

            static {
                Covode.recordClassIndex(57249);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C48475d(C48470g gVar) {
                super(1);
                this.f112213a = gVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(C12764n nVar) {
                C12764n nVar2 = nVar;
                C89219l.m154721d(nVar2, "");
                nVar2.mo20623a(EnumC12762l.ASYNC_X2C);
                nVar2.mo20624a(C89204ab.m154669a(C49179b.class));
                nVar2.f31040b = new C49179b();
                nVar2.f31042d = R.id.a9t;
                return C89391z.f203057a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.assem.b$g$e */
        static final class C48476e extends AbstractC89220m implements AbstractC89172b<C12764n, C89391z> {

            /* renamed from: a */
            final /* synthetic */ C48470g f112214a;

            static {
                Covode.recordClassIndex(57250);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C48476e(C48470g gVar) {
                super(1);
                this.f112214a = gVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(C12764n nVar) {
                C12764n nVar2 = nVar;
                C89219l.m154721d(nVar2, "");
                nVar2.mo20623a(EnumC12762l.ASYNC_X2C);
                nVar2.f31042d = R.id.dxw;
                nVar2.mo20624a(C89204ab.m154669a(View$OnClickListenerC49022h.class));
                nVar2.f31040b = new View$OnClickListenerC49022h();
                return C89391z.f203057a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.assem.b$g$f */
        static final class C48477f extends AbstractC89220m implements AbstractC89172b<C12764n, C89391z> {

            /* renamed from: a */
            public static final C48477f f112215a = new C48477f();

            static {
                Covode.recordClassIndex(57251);
            }

            C48477f() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(C12764n nVar) {
                C12764n nVar2 = nVar;
                C89219l.m154721d(nVar2, "");
                nVar2.mo20623a(EnumC12762l.ASYNC_X2C);
                nVar2.f31042d = R.id.cm0;
                nVar2.mo20624a(C89204ab.m154669a(C48739a.class));
                nVar2.f31040b = new C48739a();
                return C89391z.f203057a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.assem.b$g$b */
        static final class C48472b extends AbstractC89220m implements AbstractC89172b<C12759i<AbstractC12779c>, C89391z> {

            /* renamed from: a */
            final /* synthetic */ C48470g f112210a;

            static {
                Covode.recordClassIndex(57246);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C48472b(C48470g gVar) {
                super(1);
                this.f112210a = gVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(C12759i<AbstractC12779c> iVar) {
                String str;
                String parentTagId;
                C12759i<AbstractC12779c> iVar2 = iVar;
                String str2 = "";
                C89219l.m154721d(iVar2, str2);
                String previousPage = this.f112210a.f112207a.f112176r.getPreviousPage();
                if (previousPage == null) {
                    previousPage = str2;
                }
                String fromGroupId = this.f112210a.f112207a.f112176r.getFromGroupId();
                if (fromGroupId == null) {
                    fromGroupId = str2;
                }
                String previousPagePosition = this.f112210a.f112207a.f112176r.getPreviousPagePosition();
                if (previousPagePosition == null) {
                    previousPagePosition = str2;
                }
                C49812b bVar = this.f112210a.f112207a.f112176r.param;
                if (bVar == null || (str = bVar.getCreationId()) == null) {
                    str = str2;
                }
                String str3 = this.f112210a.f112207a.f112176r.challengeId;
                if (str3 == null) {
                    str3 = str2;
                }
                C49812b bVar2 = this.f112210a.f112207a.f112176r.param;
                if (!(bVar2 == null || (parentTagId = bVar2.getParentTagId()) == null)) {
                    str2 = parentTagId;
                }
                iVar2.mo20617a(new C48700j(previousPage, fromGroupId, previousPagePosition, str, str3, str2, new VideoDiggWidget.AbstractC49543a(this) {
                    /* class com.p2082ss.android.ugc.aweme.feed.assem.C48442b.C48470g.C48472b.C484731 */

                    /* renamed from: a */
                    final /* synthetic */ C48472b f112211a;

                    static {
                        Covode.recordClassIndex(57247);
                    }

                    {
                        this.f112211a = r1;
                    }

                    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.VideoDiggWidget.AbstractC49543a
                    /* renamed from: a */
                    public final long mo80546a() {
                        return this.f112211a.f112210a.f112207a.f112177s.invoke().longValue();
                    }
                }));
                return C89391z.f203057a;
            }
        }
    }

    /* renamed from: D */
    public final void mo80544D() {
        AssemViewModel<C80022g> a;
        if (C79705a.m138533a()) {
            Thread currentThread = Thread.currentThread();
            Handler a2 = C34727m.m70943a();
            C89219l.m154716b(a2, "");
            Looper looper = a2.getLooper();
            C89219l.m154716b(looper, "");
            if (!currentThread.equals(looper.getThread())) {
                C34727m.m70944a(new RunnableC48478h(new C48479i(this)));
                return;
            }
            ActivityC0945e b = C12777b.m23004b(this);
            if (b != null && this.f112176r.pageType == 0 && (a = C80034a.f179347a.mo123475a(b)) != null) {
                AbstractC12818f.C12819a.m23063a(this, a, C48703e.f112564a, (C12854k) null, C48480j.f112217a, 6);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.b$e */
    static final class C48452e extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C48442b f112187a;

        /* renamed from: b */
        final /* synthetic */ Assembler f112188b;

        static {
            Covode.recordClassIndex(57226);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48452e(C48442b bVar, Assembler assembler) {
            super(0);
            this.f112187a = bVar;
            this.f112188b = assembler;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            String str;
            Assembler assembler = this.f112188b;
            if (this.f112187a.f112178t) {
                C49812b bVar = this.f112187a.f112176r.param;
                if (bVar != null) {
                    str = bVar.getFrom();
                } else {
                    str = null;
                }
                if (!C89219l.m154714a((Object) "from_publish_add_video", (Object) str)) {
                    assembler.mo20575a(this.f112187a, (AbstractC89172b<? super C12764n, C89391z>) new C48453a(this));
                }
                assembler.mo20575a(this.f112187a, (AbstractC89172b<? super C12764n, C89391z>) new C48454b(this));
                assembler.mo20575a(this.f112187a, (AbstractC89172b<? super C12764n, C89391z>) new C48455c(this));
                if (TextUtils.equals(((VideoItemParams) C12661l.m22797a(this.f112187a)).mEventType, "homepage_hot")) {
                    C58071d.m104907a();
                    if (C48957b.m92140a()) {
                        assembler.mo20575a(this.f112187a, (AbstractC89172b<? super C12764n, C89391z>) C48463k.f112199a);
                    }
                }
                assembler.mo20575a(this.f112187a, (AbstractC89172b<? super C12764n, C89391z>) new C48456d(this));
                assembler.mo20575a(this.f112187a, (AbstractC89172b<? super C12764n, C89391z>) new C48457e(this));
                assembler.mo20575a(this.f112187a, (AbstractC89172b<? super C12764n, C89391z>) new C48458f(this));
                assembler.mo20575a(this.f112187a, (AbstractC89172b<? super C12764n, C89391z>) new C48459g(this));
                assembler.mo20575a(this.f112187a, (AbstractC89172b<? super C12764n, C89391z>) new C48460h(this));
                assembler.mo20575a(this.f112187a, (AbstractC89172b<? super C12764n, C89391z>) new C48461i(this));
                C48442b bVar2 = this.f112187a;
                AbstractC12818f.C12819a.m23063a(bVar2, bVar2.mo80543C(), C48492c.f112238a, (C12854k) null, C48462j.f112198a, 6);
            }
            return C89391z.f203057a;
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.assem.b$e$a */
        static final class C48453a extends AbstractC89220m implements AbstractC89172b<C12764n, C89391z> {

            /* renamed from: a */
            final /* synthetic */ C48452e f112189a;

            static {
                Covode.recordClassIndex(57227);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C48453a(C48452e eVar) {
                super(1);
                this.f112189a = eVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(C12764n nVar) {
                C12764n nVar2 = nVar;
                C89219l.m154721d(nVar2, "");
                nVar2.mo20623a(EnumC12762l.ASYNC_X2C);
                nVar2.mo20624a(C89204ab.m154669a(C48750a.class));
                nVar2.f31040b = new C48750a();
                nVar2.f31042d = R.id.b17;
                nVar2.mo20622a(C48442b.m91882a(EnumC12758h.LAZY));
                return C89391z.f203057a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.assem.b$e$b */
        static final class C48454b extends AbstractC89220m implements AbstractC89172b<C12764n, C89391z> {

            /* renamed from: a */
            final /* synthetic */ C48452e f112190a;

            static {
                Covode.recordClassIndex(57228);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C48454b(C48452e eVar) {
                super(1);
                this.f112190a = eVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(C12764n nVar) {
                C12764n nVar2 = nVar;
                C89219l.m154721d(nVar2, "");
                nVar2.mo20623a(EnumC12762l.ASYNC_X2C);
                nVar2.mo20624a(C89204ab.m154669a(C48959c.class));
                nVar2.f31040b = new C48959c();
                nVar2.f31042d = R.id.ffz;
                nVar2.mo20622a(C48442b.m91882a(EnumC12758h.LAZY));
                return C89391z.f203057a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.assem.b$e$c */
        static final class C48455c extends AbstractC89220m implements AbstractC89172b<C12764n, C89391z> {

            /* renamed from: a */
            final /* synthetic */ C48452e f112191a;

            static {
                Covode.recordClassIndex(57229);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C48455c(C48452e eVar) {
                super(1);
                this.f112191a = eVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(C12764n nVar) {
                C12764n nVar2 = nVar;
                C89219l.m154721d(nVar2, "");
                nVar2.mo20623a(EnumC12762l.ASYNC_X2C);
                nVar2.f31042d = R.id.u2;
                nVar2.mo20624a(C89204ab.m154669a(C48361b.class));
                nVar2.f31040b = new C48361b();
                nVar2.mo20622a(C48442b.m91882a(EnumC12758h.LAZY));
                return C89391z.f203057a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.assem.b$e$d */
        static final class C48456d extends AbstractC89220m implements AbstractC89172b<C12764n, C89391z> {

            /* renamed from: a */
            final /* synthetic */ C48452e f112192a;

            static {
                Covode.recordClassIndex(57230);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C48456d(C48452e eVar) {
                super(1);
                this.f112192a = eVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(C12764n nVar) {
                C12764n nVar2 = nVar;
                C89219l.m154721d(nVar2, "");
                nVar2.mo20623a(EnumC12762l.ASYNC_X2C);
                nVar2.mo20624a(C89204ab.m154669a(C48716a.class));
                nVar2.f31040b = new C48716a();
                nVar2.f31042d = R.id.ffz;
                nVar2.mo20622a(C48442b.m91882a(EnumC12758h.LAZY));
                return C89391z.f203057a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.assem.b$e$e */
        static final class C48457e extends AbstractC89220m implements AbstractC89172b<C12764n, C89391z> {

            /* renamed from: a */
            final /* synthetic */ C48452e f112193a;

            static {
                Covode.recordClassIndex(57231);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C48457e(C48452e eVar) {
                super(1);
                this.f112193a = eVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(C12764n nVar) {
                C12764n nVar2 = nVar;
                C89219l.m154721d(nVar2, "");
                nVar2.mo20623a(EnumC12762l.ASYNC_X2C);
                nVar2.mo20624a(C89204ab.m154669a(C48868a.class));
                nVar2.f31040b = new C48868a();
                nVar2.f31042d = R.id.ffz;
                nVar2.mo20622a(C48442b.m91882a(EnumC12758h.LAZY));
                return C89391z.f203057a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.assem.b$e$f */
        static final class C48458f extends AbstractC89220m implements AbstractC89172b<C12764n, C89391z> {

            /* renamed from: a */
            final /* synthetic */ C48452e f112194a;

            static {
                Covode.recordClassIndex(57232);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C48458f(C48452e eVar) {
                super(1);
                this.f112194a = eVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(C12764n nVar) {
                C12764n nVar2 = nVar;
                C89219l.m154721d(nVar2, "");
                nVar2.mo20623a(EnumC12762l.ASYNC_X2C);
                nVar2.mo20624a(C89204ab.m154669a(C48990b.class));
                nVar2.f31040b = new C48990b();
                nVar2.f31042d = R.id.u2;
                nVar2.mo20622a(C48442b.m91882a(EnumC12758h.LAZY));
                return C89391z.f203057a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.assem.b$e$g */
        static final class C48459g extends AbstractC89220m implements AbstractC89172b<C12764n, C89391z> {

            /* renamed from: a */
            final /* synthetic */ C48452e f112195a;

            static {
                Covode.recordClassIndex(57233);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C48459g(C48452e eVar) {
                super(1);
                this.f112195a = eVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(C12764n nVar) {
                C12764n nVar2 = nVar;
                C89219l.m154721d(nVar2, "");
                nVar2.mo20623a(EnumC12762l.ASYNC_X2C);
                nVar2.f31042d = R.id.u2;
                nVar2.mo20624a(C89204ab.m154669a(C49219a.class));
                nVar2.f31040b = new C49219a();
                nVar2.mo20622a(C48442b.m91882a(EnumC12758h.LAZY));
                return C89391z.f203057a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.assem.b$e$h */
        static final class C48460h extends AbstractC89220m implements AbstractC89172b<C12764n, C89391z> {

            /* renamed from: a */
            final /* synthetic */ C48452e f112196a;

            static {
                Covode.recordClassIndex(57234);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C48460h(C48452e eVar) {
                super(1);
                this.f112196a = eVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(C12764n nVar) {
                C12764n nVar2 = nVar;
                C89219l.m154721d(nVar2, "");
                nVar2.mo20623a(EnumC12762l.ASYNC_X2C);
                nVar2.f31042d = R.id.ffz;
                nVar2.mo20624a(C89204ab.m154669a(C48497a.class));
                nVar2.f31040b = new C48497a();
                nVar2.mo20622a(C48442b.m91882a(EnumC12758h.LAZY));
                return C89391z.f203057a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.assem.b$e$i */
        static final class C48461i extends AbstractC89220m implements AbstractC89172b<C12764n, C89391z> {

            /* renamed from: a */
            final /* synthetic */ C48452e f112197a;

            static {
                Covode.recordClassIndex(57235);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C48461i(C48452e eVar) {
                super(1);
                this.f112197a = eVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(C12764n nVar) {
                C12764n nVar2 = nVar;
                C89219l.m154721d(nVar2, "");
                nVar2.mo20623a(EnumC12762l.ASYNC_X2C);
                nVar2.mo20624a(C89204ab.m154669a(C49075a.class));
                nVar2.f31040b = new C49075a();
                nVar2.f31042d = R.id.ay1;
                nVar2.mo20622a(C48442b.m91882a(EnumC12758h.LAZY));
                return C89391z.f203057a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.assem.b$e$k */
        static final class C48463k extends AbstractC89220m implements AbstractC89172b<C12764n, C89391z> {

            /* renamed from: a */
            public static final C48463k f112199a = new C48463k();

            static {
                Covode.recordClassIndex(57237);
            }

            C48463k() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(C12764n nVar) {
                C12764n nVar2 = nVar;
                C89219l.m154721d(nVar2, "");
                nVar2.mo20623a(EnumC12762l.ASYNC_X2C);
                nVar2.f31042d = R.id.diq;
                nVar2.mo20624a(C89204ab.m154669a(C48981i.class));
                nVar2.f31040b = new C48981i();
                return C89391z.f203057a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.assem.b$e$j */
        static final class C48462j extends AbstractC89220m implements AbstractC89183m<C48442b, C12776a<? extends Integer>, C89391z> {

            /* renamed from: a */
            public static final C48462j f112198a = new C48462j();

            static {
                Covode.recordClassIndex(57236);
            }

            C48462j() {
                super(2);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89183m
            public final /* synthetic */ C89391z invoke(C48442b bVar, C12776a<? extends Integer> aVar) {
                List<AnchorCommonStruct> anchors;
                C48442b bVar2 = bVar;
                C89219l.m154721d(bVar2, "");
                if (aVar != null && C49536y.f113919a) {
                    if (C80635y.m139813h(((VideoItemParams) C12661l.m22797a(bVar2)).mAweme)) {
                        C12690t.m22848a(bVar2, C89204ab.m154669a(C48716a.class));
                    }
                    if (C80635y.m139812g(((VideoItemParams) C12661l.m22797a(bVar2)).mAweme)) {
                        C12690t.m22848a(bVar2, C89204ab.m154669a(C48959c.class));
                    }
                    if (C80635y.m139814i(((VideoItemParams) C12661l.m22797a(bVar2)).mAweme)) {
                        C12690t.m22848a(bVar2, C89204ab.m154669a(C48868a.class));
                    }
                    if (C50539g.m94746b(((VideoItemParams) C12661l.m22797a(bVar2)).mAweme)) {
                        C12690t.m22848a(bVar2, C89204ab.m154669a(C48497a.class));
                    }
                    Aweme aweme = ((VideoItemParams) C12661l.m22797a(bVar2)).mAweme;
                    if (!(aweme == null || (anchors = aweme.getAnchors()) == null || anchors.isEmpty())) {
                        C12690t.m22848a(bVar2, C89204ab.m154669a(C48750a.class));
                    }
                }
                return C89391z.f203057a;
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.assem.arch.p795b.AbstractC12658i
    /* renamed from: b */
    public final /* synthetic */ void mo20469b(VideoItemParams videoItemParams) {
        C89219l.m154721d(videoItemParams, "");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.assem.arch.p795b.AbstractC12658i
    /* renamed from: c */
    public final /* synthetic */ boolean mo20470c(VideoItemParams videoItemParams) {
        C89219l.m154721d(videoItemParams, "");
        return true;
    }

    /* renamed from: a */
    public static EnumC12758h m91882a(EnumC12758h hVar) {
        if (hVar != EnumC12758h.LAZY || !C49536y.f113919a) {
            return EnumC12758h.IMMEDIATE;
        }
        return EnumC12758h.LAZY;
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12693u
    /* renamed from: c */
    public final void mo20517c(View view) {
        C89219l.m154721d(view, "");
        AbstractC12789k kVar = C12787j.f31108b;
        if (kVar != null) {
            kVar.mo20640a("AssemList", "reusedUiSlotAssem onViewCreated: " + C12787j.f31109c);
        }
        C12690t.m22847a(this, new C48464f(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.b$f */
    static final class C48464f extends AbstractC89220m implements AbstractC89172b<Assembler, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C48442b f112200a;

        static {
            Covode.recordClassIndex(57238);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48464f(C48442b bVar) {
            super(1);
            this.f112200a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Assembler assembler) {
            final Assembler assembler2 = assembler;
            C89219l.m154721d(assembler2, "");
            new C48470g(this.f112200a, assembler2).invoke();
            new C48446d(this.f112200a, assembler2).invoke();
            new C48452e(this.f112200a, assembler2).invoke();
            if (this.f112200a.f112178t) {
                assembler2.mo20575a(this.f112200a, (AbstractC89172b<? super C12764n, C89391z>) new AbstractC89172b<C12764n, C89391z>(this) {
                    /* class com.p2082ss.android.ugc.aweme.feed.assem.C48442b.C48464f.C484651 */

                    /* renamed from: a */
                    final /* synthetic */ C48464f f112201a;

                    static {
                        Covode.recordClassIndex(57239);
                    }

                    {
                        this.f112201a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C89391z invoke(C12764n nVar) {
                        C12764n nVar2 = nVar;
                        C89219l.m154721d(nVar2, "");
                        nVar2.mo20623a(EnumC12762l.ASYNC_X2C);
                        nVar2.f31042d = R.id.ffz;
                        nVar2.mo20624a(C89204ab.m154669a(C49248a.class));
                        nVar2.f31040b = new C49248a();
                        return C89391z.f203057a;
                    }
                });
                assembler2.mo20575a(this.f112200a, (AbstractC89172b<? super C12764n, C89391z>) C484662.f112202a);
            }
            if (C79705a.m138533a()) {
                assembler2.mo20575a(this.f112200a, (AbstractC89172b<? super C12764n, C89391z>) new AbstractC89172b<C12764n, C89391z>(this) {
                    /* class com.p2082ss.android.ugc.aweme.feed.assem.C48442b.C48464f.C484673 */

                    /* renamed from: a */
                    final /* synthetic */ C48464f f112203a;

                    static {
                        Covode.recordClassIndex(57241);
                    }

                    {
                        this.f112203a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C89391z invoke(C12764n nVar) {
                        C12764n nVar2 = nVar;
                        C89219l.m154721d(nVar2, "");
                        assembler2.mo20581a(this.f112203a.f112200a, (AbstractC89172b<? super C12759i<AbstractC12779c>, C89391z>) new AbstractC89172b<C12759i<AbstractC12779c>, C89391z>(this) {
                            /* class com.p2082ss.android.ugc.aweme.feed.assem.C48442b.C48464f.C484673.C484681 */

                            /* renamed from: a */
                            final /* synthetic */ C484673 f112205a;

                            static {
                                Covode.recordClassIndex(57242);
                            }

                            {
                                this.f112205a = r2;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // p4600h.p4611f.p4612a.AbstractC89172b
                            public final /* synthetic */ C89391z invoke(C12759i<AbstractC12779c> iVar) {
                                C12759i<AbstractC12779c> iVar2 = iVar;
                                C89219l.m154721d(iVar2, "");
                                C49812b bVar = this.f112205a.f112203a.f112200a.f112176r.param;
                                C89219l.m154716b(bVar, "");
                                iVar2.mo20617a(new C48481a(bVar.getUpvoteId()));
                                return C89391z.f203057a;
                            }
                        });
                        nVar2.mo20623a(EnumC12762l.ASYNC_X2C);
                        nVar2.f31042d = R.id.b5q;
                        nVar2.mo20624a(C89204ab.m154669a(C48482b.class));
                        nVar2.f31040b = new C48482b();
                        nVar2.mo20622a(EnumC12758h.LAZY);
                        return C89391z.f203057a;
                    }
                });
                this.f112200a.mo80544D();
            }
            C48442b bVar = this.f112200a;
            AbstractC12818f.C12819a.m23063a(bVar, bVar.mo80543C(), C48584d.f112360a, (C12854k) null, C484694.f112206a, 6);
            return C89391z.f203057a;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.assem.arch.p795b.AbstractC12658i
    /* renamed from: a */
    public final /* synthetic */ void mo20467a(VideoItemParams videoItemParams) {
        ExposeSharer exposeSharer;
        VideoItemParams videoItemParams2 = videoItemParams;
        C89219l.m154721d(videoItemParams2, "");
        if (this.f112178t && C49536y.f113919a) {
            if (VideoAntiAddictionVM.C48358a.m91812a(videoItemParams2)) {
                C12690t.m22848a(this, C89204ab.m154669a(C48361b.class));
            }
            if (C50539g.m94744a(videoItemParams2.mAweme)) {
                C12690t.m22848a(this, C89204ab.m154669a(C49219a.class));
            }
            C89219l.m154721d(videoItemParams2, "");
            Aweme aweme = videoItemParams2.mAweme;
            C89219l.m154716b(aweme, "");
            if (aweme.isProhibitedAndShouldTell()) {
                C12690t.m22848a(this, C89204ab.m154669a(C48990b.class));
            }
            C89219l.m154721d(videoItemParams2, "");
            Aweme aweme2 = videoItemParams2.mAweme;
            if (aweme2 != null && (exposeSharer = aweme2.getExposeSharer()) != null && exposeSharer.isShowed()) {
                C12690t.m22848a(this, C89204ab.m154669a(C49075a.class));
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.util.List] */
    @Override // com.bytedance.assem.arch.p795b.AbstractC12658i
    /* renamed from: a */
    public final /* synthetic */ void mo20468a(VideoItemParams videoItemParams, List list) {
        C89219l.m154721d(videoItemParams, "");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.assem.b$j */
    public static final class C48480j extends AbstractC89220m implements AbstractC89183m<C48442b, C12776a<? extends C89378p<? extends Integer, ? extends String>>, C89391z> {

        /* renamed from: a */
        public static final C48480j f112217a = new C48480j();

        static {
            Covode.recordClassIndex(57254);
        }

        C48480j() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C48442b bVar, C12776a<? extends C89378p<? extends Integer, ? extends String>> aVar) {
            C48442b bVar2 = bVar;
            C12776a<? extends C89378p<? extends Integer, ? extends String>> aVar2 = aVar;
            C89219l.m154721d(bVar2, "");
            if (!(aVar2 == null || aVar2.f31085a == null)) {
                C12690t.m22848a(bVar2, C89204ab.m154669a(C48482b.class));
            }
            return C89391z.f203057a;
        }
    }

    public C48442b(BaseFeedPageParams baseFeedPageParams, AbstractC89171a<Long> aVar, boolean z) {
        C89219l.m154721d(baseFeedPageParams, "");
        C89219l.m154721d(aVar, "");
        this.f112176r = baseFeedPageParams;
        this.f112177s = aVar;
        this.f112178t = z;
    }
}
