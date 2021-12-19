package com.p2082ss.android.ugc.aweme.ftc.p3035g;

import android.content.Context;
import com.bytedance.als.dsl.C2553d;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.AbstractC21603p;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.C21597n;
import com.bytedance.p969f.p970a.p971a.AbstractC14552j;
import com.bytedance.scene.group.AbstractC22186b;
import com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45899e;
import com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f;
import com.p2082ss.android.ugc.aweme.filter.FilterBean;
import com.p2082ss.android.ugc.aweme.filter.p2983c.C50649a;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50703k;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50706n;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50707o;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.p2987a.C50691c;
import com.p2082ss.android.ugc.aweme.ftc.components.C51918a;
import com.p2082ss.android.ugc.aweme.ftc.components.audioeffect.C51987f;
import com.p2082ss.android.ugc.aweme.ftc.components.audiorecord.C52017d;
import com.p2082ss.android.ugc.aweme.ftc.components.corner.C52057b;
import com.p2082ss.android.ugc.aweme.ftc.components.cutmusic.C52072b;
import com.p2082ss.android.ugc.aweme.ftc.components.effect.C52112b;
import com.p2082ss.android.ugc.aweme.ftc.components.p3029a.C51954a;
import com.p2082ss.android.ugc.aweme.ftc.components.sticker.core.C52174b;
import com.p2082ss.android.ugc.aweme.ftc.components.toolbar.C52434r;
import com.p2082ss.android.ugc.aweme.ftc.components.volume.C52440b;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63253l;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70968bl;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a;
import com.p2082ss.android.ugc.aweme.utils.C80209ad;
import com.p2082ss.android.ugc.gamora.editor.AbstractC82035ab;
import com.p2082ss.android.ugc.gamora.editor.AbstractC82563s;
import com.p2082ss.android.ugc.gamora.editor.C83386w;
import com.p2082ss.android.ugc.gamora.editor.filter.core.AbstractC82208b;
import com.p2082ss.android.ugc.gamora.editor.filter.core.C82209c;
import com.p2082ss.android.ugc.gamora.editor.filter.core.C82211d;
import com.p2082ss.android.ugc.gamora.editor.filter.core.EnumC82234j;
import com.p2082ss.android.ugc.gamora.editor.filter.indicator.C82239b;
import com.p2082ss.android.ugc.gamora.editor.gesture.C82255b;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ftc.g.a */
public final class C52547a {

    /* renamed from: a */
    public final AbstractC14552j f120980a;

    /* renamed from: b */
    public final C83386w f120981b;

    /* renamed from: c */
    public final VideoPublishEditModel f120982c;

    static {
        Covode.recordClassIndex(61943);
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.g.a$b */
    public static final class C52553b extends AbstractC21603p<C52112b> {

        /* renamed from: a */
        final /* synthetic */ C2553d f120989a;

        /* renamed from: b */
        final /* synthetic */ C52547a f120990b;

        /* renamed from: c */
        final /* synthetic */ AbstractC22186b f120991c;

        static {
            Covode.recordClassIndex(61949);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C52112b get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C52112b(fVar, this.f120991c);
        }

        public C52553b(C2553d dVar, C52547a aVar, AbstractC22186b bVar) {
            this.f120989a = dVar;
            this.f120990b = aVar;
            this.f120991c = bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.g.a$c */
    public static final class C52554c extends AbstractC21603p<C52072b> {

        /* renamed from: a */
        final /* synthetic */ C2553d f120992a;

        /* renamed from: b */
        final /* synthetic */ C52547a f120993b;

        /* renamed from: c */
        final /* synthetic */ AbstractC22186b f120994c;

        static {
            Covode.recordClassIndex(61950);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C52072b get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C52072b(fVar, this.f120994c);
        }

        public C52554c(C2553d dVar, C52547a aVar, AbstractC22186b bVar) {
            this.f120992a = dVar;
            this.f120993b = aVar;
            this.f120994c = bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.g.a$d */
    public static final class C52555d extends AbstractC21603p<C51954a> {

        /* renamed from: a */
        final /* synthetic */ C2553d f120995a;

        /* renamed from: b */
        final /* synthetic */ C52547a f120996b;

        /* renamed from: c */
        final /* synthetic */ AbstractC22186b f120997c;

        static {
            Covode.recordClassIndex(61951);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C51954a get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C51954a(fVar, this.f120997c);
        }

        public C52555d(C2553d dVar, C52547a aVar, AbstractC22186b bVar) {
            this.f120995a = dVar;
            this.f120996b = aVar;
            this.f120997c = bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.g.a$e */
    public static final class C52556e extends AbstractC21603p<C52440b> {

        /* renamed from: a */
        final /* synthetic */ C2553d f120998a;

        /* renamed from: b */
        final /* synthetic */ C52547a f120999b;

        /* renamed from: c */
        final /* synthetic */ AbstractC22186b f121000c;

        static {
            Covode.recordClassIndex(61952);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C52440b get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C52440b(fVar, this.f121000c);
        }

        public C52556e(C2553d dVar, C52547a aVar, AbstractC22186b bVar) {
            this.f120998a = dVar;
            this.f120999b = aVar;
            this.f121000c = bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.g.a$f */
    public static final class C52557f extends AbstractC21603p<C82255b> {

        /* renamed from: a */
        final /* synthetic */ C2553d f121001a;

        /* renamed from: b */
        final /* synthetic */ C52547a f121002b;

        /* renamed from: c */
        final /* synthetic */ AbstractC22186b f121003c;

        static {
            Covode.recordClassIndex(61953);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C82255b get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C82255b(fVar, this.f121003c);
        }

        public C52557f(C2553d dVar, C52547a aVar, AbstractC22186b bVar) {
            this.f121001a = dVar;
            this.f121002b = aVar;
            this.f121003c = bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.g.a$g */
    public static final class C52558g extends AbstractC21603p<C52057b> {

        /* renamed from: a */
        final /* synthetic */ C2553d f121004a;

        /* renamed from: b */
        final /* synthetic */ C52547a f121005b;

        /* renamed from: c */
        final /* synthetic */ AbstractC22186b f121006c;

        static {
            Covode.recordClassIndex(61954);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C52057b get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C52057b(fVar, this.f121006c);
        }

        public C52558g(C2553d dVar, C52547a aVar, AbstractC22186b bVar) {
            this.f121004a = dVar;
            this.f121005b = aVar;
            this.f121006c = bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.g.a$h */
    public static final class C52559h extends AbstractC21603p<C52174b> {

        /* renamed from: a */
        final /* synthetic */ C2553d f121007a;

        /* renamed from: b */
        final /* synthetic */ C52547a f121008b;

        /* renamed from: c */
        final /* synthetic */ AbstractC22186b f121009c;

        static {
            Covode.recordClassIndex(61955);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C52174b get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C52174b(fVar, this.f121009c);
        }

        public C52559h(C2553d dVar, C52547a aVar, AbstractC22186b bVar) {
            this.f121007a = dVar;
            this.f121008b = aVar;
            this.f121009c = bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.g.a$k */
    public static final class C52562k extends AbstractC21603p<C52434r> {

        /* renamed from: a */
        final /* synthetic */ C2553d f121016a;

        /* renamed from: b */
        final /* synthetic */ C52547a f121017b;

        /* renamed from: c */
        final /* synthetic */ AbstractC22186b f121018c;

        static {
            Covode.recordClassIndex(61958);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C52434r get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C52434r(fVar, this.f121018c);
        }

        public C52562k(C2553d dVar, C52547a aVar, AbstractC22186b bVar) {
            this.f121016a = dVar;
            this.f121017b = aVar;
            this.f121018c = bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.g.a$l */
    public static final class C52563l extends AbstractC21603p<C52017d> {

        /* renamed from: a */
        final /* synthetic */ C2553d f121019a;

        /* renamed from: b */
        final /* synthetic */ C52547a f121020b;

        /* renamed from: c */
        final /* synthetic */ AbstractC22186b f121021c;

        static {
            Covode.recordClassIndex(61959);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C52017d get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C52017d(fVar, this.f121021c);
        }

        public C52563l(C2553d dVar, C52547a aVar, AbstractC22186b bVar) {
            this.f121019a = dVar;
            this.f121020b = aVar;
            this.f121021c = bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.g.a$m */
    public static final class C52564m extends AbstractC21603p<C51987f> {

        /* renamed from: a */
        final /* synthetic */ C2553d f121022a;

        /* renamed from: b */
        final /* synthetic */ C52547a f121023b;

        /* renamed from: c */
        final /* synthetic */ AbstractC22186b f121024c;

        static {
            Covode.recordClassIndex(61960);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C51987f get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C51987f(fVar, this.f121024c);
        }

        public C52564m(C2553d dVar, C52547a aVar, AbstractC22186b bVar) {
            this.f121022a = dVar;
            this.f121023b = aVar;
            this.f121024c = bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.g.a$n */
    static final class C52565n extends AbstractC89220m implements AbstractC89172b<C82211d, C89391z> {

        /* renamed from: a */
        public static final C52565n f121025a = new C52565n();

        static {
            Covode.recordClassIndex(61961);
        }

        C52565n() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C82211d dVar) {
            C82211d dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            dVar2.mo127398a(EnumC82234j.Circle);
            dVar2.f183931b = true;
            dVar2.f183932c = false;
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.g.a$i */
    public static final class C52560i extends AbstractC21603p<C82209c> {

        /* renamed from: a */
        final /* synthetic */ C2553d f121010a;

        /* renamed from: b */
        final /* synthetic */ C52547a f121011b;

        /* renamed from: c */
        final /* synthetic */ AbstractC22186b f121012c;

        static {
            Covode.recordClassIndex(61956);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C82209c get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            AbstractC22186b bVar = this.f121012c;
            AbstractC50707o d = C63244g.m114602a().mo73290r().mo86006d();
            AbstractC46415f e = C63244g.m114602a().mo73290r().mo86007e();
            C52547a aVar = this.f121011b;
            Object a = fVar.mo35247a(AbstractC72510a.class);
            C89219l.m154716b(a, "");
            return new C82209c(fVar, bVar, d, e, new C52566o(aVar, (AbstractC72510a) a), C52565n.f121025a);
        }

        public C52560i(C2553d dVar, C52547a aVar, AbstractC22186b bVar) {
            this.f121010a = dVar;
            this.f121011b = aVar;
            this.f121012c = bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.g.a$j */
    public static final class C52561j extends AbstractC21603p<C82239b> {

        /* renamed from: a */
        final /* synthetic */ C2553d f121013a;

        /* renamed from: b */
        final /* synthetic */ C52547a f121014b;

        /* renamed from: c */
        final /* synthetic */ AbstractC22186b f121015c;

        static {
            Covode.recordClassIndex(61957);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C82239b get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C82239b(fVar, this.f121015c, C63244g.m114602a().mo73290r().mo86005c().mo86019a(0), C63244g.m114602a().mo73290r().mo86006d());
        }

        public C52561j(C2553d dVar, C52547a aVar, AbstractC22186b bVar) {
            this.f121013a = dVar;
            this.f121014b = aVar;
            this.f121015c = bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.g.a$a */
    public static final class C52548a extends AbstractC89220m implements AbstractC89172b<C21597n, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C52547a f120983a;

        /* renamed from: b */
        final /* synthetic */ AbstractC22186b f120984b;

        static {
            Covode.recordClassIndex(61944);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C52548a(C52547a aVar, AbstractC22186b bVar) {
            super(1);
            this.f120983a = aVar;
            this.f120984b = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C21597n nVar) {
            C21597n nVar2 = nVar;
            C89219l.m154721d(nVar2, "");
            C89219l.m154716b(nVar2.mo35260a(AbstractC14552j.class, (String) null, (AbstractC21603p) new AbstractC21603p<AbstractC14552j>(this) {
                /* class com.p2082ss.android.ugc.aweme.ftc.p3035g.C52547a.C52548a.C525491 */

                /* renamed from: a */
                final /* synthetic */ C52548a f120985a;

                static {
                    Covode.recordClassIndex(61945);
                }

                {
                    this.f120985a = r1;
                }

                @Override // com.bytedance.p1559o.AbstractC21603p
                public final AbstractC14552j get(C21582f fVar) {
                    C89219l.m154721d(fVar, "");
                    return this.f120985a.f120983a.f120980a;
                }
            }), "");
            C21597n.C21600a a = nVar2.mo35260a(C83386w.class, (String) null, (AbstractC21603p) new AbstractC21603p<C83386w>(this) {
                /* class com.p2082ss.android.ugc.aweme.ftc.p3035g.C52547a.C52548a.C525502 */

                /* renamed from: a */
                final /* synthetic */ C52548a f120986a;

                static {
                    Covode.recordClassIndex(61946);
                }

                {
                    this.f120986a = r1;
                }

                @Override // com.bytedance.p1559o.AbstractC21603p
                public final C83386w get(C21582f fVar) {
                    C89219l.m154721d(fVar, "");
                    return this.f120986a.f120983a.f120981b;
                }
            });
            C89219l.m154716b(a, "");
            a.mo35263a(AbstractC45899e.class);
            C21597n.C21600a a2 = nVar2.mo35260a(C51918a.class, (String) null, (AbstractC21603p) new AbstractC21603p<C51918a>(this) {
                /* class com.p2082ss.android.ugc.aweme.ftc.p3035g.C52547a.C52548a.C525513 */

                /* renamed from: a */
                final /* synthetic */ C52548a f120987a;

                static {
                    Covode.recordClassIndex(61947);
                }

                {
                    this.f120987a = r1;
                }

                /* JADX WARN: Type inference failed for: r1v0, types: [com.ss.android.ugc.aweme.ftc.components.a, com.bytedance.scene.group.b, java.lang.Object] */
                /* JADX WARNING: Unknown variable types count: 1 */
                @Override // com.bytedance.p1559o.AbstractC21603p
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final com.p2082ss.android.ugc.aweme.ftc.components.C51918a get(com.bytedance.p1559o.C21582f r3) {
                    /*
                        r2 = this;
                        java.lang.String r0 = ""
                        p4600h.p4611f.p4613b.C89219l.m154721d(r3, r0)
                        com.ss.android.ugc.aweme.ftc.g.a$a r0 = r2.f120987a
                        com.bytedance.scene.group.b r1 = r0.f120984b
                        java.lang.String r0 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.ftc.components.FTCEditRootScene"
                        java.util.Objects.requireNonNull(r1, r0)
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ftc.p3035g.C52547a.C52548a.C525513.get(com.bytedance.o.f):java.lang.Object");
                }
            });
            C89219l.m154716b(a2, "");
            a2.mo35263a(AbstractC82035ab.class, AbstractC82563s.class);
            C89219l.m154716b(nVar2.mo35260a(VideoPublishEditModel.class, (String) null, (AbstractC21603p) new AbstractC21603p<VideoPublishEditModel>(this) {
                /* class com.p2082ss.android.ugc.aweme.ftc.p3035g.C52547a.C52548a.C525524 */

                /* renamed from: a */
                final /* synthetic */ C52548a f120988a;

                static {
                    Covode.recordClassIndex(61948);
                }

                {
                    this.f120988a = r1;
                }

                @Override // com.bytedance.p1559o.AbstractC21603p
                public final VideoPublishEditModel get(C21582f fVar) {
                    C89219l.m154721d(fVar, "");
                    return this.f120988a.f120983a.f120982c;
                }
            }), "");
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.g.a$o */
    public static final class C52566o implements AbstractC82208b {

        /* renamed from: a */
        final /* synthetic */ C52547a f121026a;

        /* renamed from: b */
        final /* synthetic */ AbstractC72510a f121027b;

        static {
            Covode.recordClassIndex(61962);
        }

        @Override // com.p2082ss.android.ugc.gamora.editor.filter.core.AbstractC82208b
        /* renamed from: a */
        public final void mo88317a(String str) {
            C89219l.m154721d(str, "");
        }

        @Override // com.p2082ss.android.ugc.gamora.editor.filter.core.AbstractC82208b
        /* renamed from: a */
        public final void mo88315a(float f) {
            FilterBean filterBean;
            C50649a value = this.f121027b.mo114821j().getValue();
            if (value != null && (filterBean = value.f116985b) != null) {
                AbstractC50706n value2 = this.f121027b.mo114822k().getValue();
                if (value2 == null) {
                    C89219l.m154715b();
                }
                C89219l.m154716b(value2, "");
                AbstractC50706n nVar = value2;
                AbstractC50703k value3 = this.f121027b.mo114823l().getValue();
                if (value3 == null) {
                    C89219l.m154715b();
                }
                C89219l.m154716b(value3, "");
                this.f121026a.f120982c.mSelectedFilterIntensity = ((float) nVar.mo86059a(filterBean, value3)) / 100.0f;
            }
        }

        C52566o(C52547a aVar, AbstractC72510a aVar2) {
            this.f121026a = aVar;
            this.f121027b = aVar2;
        }

        @Override // com.p2082ss.android.ugc.gamora.editor.filter.core.AbstractC82208b
        /* renamed from: a */
        public final void mo88318a(boolean z, FilterBean filterBean) {
            this.f121027b.mo114805a((AbstractC72510a) (!z), false, r1);
        }

        @Override // com.p2082ss.android.ugc.gamora.editor.filter.core.AbstractC82208b
        /* renamed from: a */
        public final void mo88316a(FilterBean filterBean, boolean z, Context context) {
            if (filterBean != null) {
                AbstractC50706n value = this.f121027b.mo114822k().getValue();
                if (value == null) {
                    C89219l.m154715b();
                }
                C89219l.m154716b(value, "");
                AbstractC50706n nVar = value;
                AbstractC50703k value2 = this.f121027b.mo114823l().getValue();
                if (value2 == null) {
                    C89219l.m154715b();
                }
                C89219l.m154716b(value2, "");
                this.f121026a.f120982c.mSelectedId = C50691c.m94985a(C63244g.m114602a().mo73290r().mo86006d().mo86071f(), filterBean);
                this.f121026a.f120982c.mCurFilterLabels = filterBean.getEnName();
                this.f121026a.f120982c.mSelectedFilterId = String.valueOf(filterBean.getId());
                this.f121026a.f120982c.mSelectedFilterResId = filterBean.getResId();
                this.f121026a.f120982c.mSelectedFilterIntensity = ((float) nVar.mo86059a(filterBean, value2)) / 100.0f;
                C80209ad.m139034a(context, String.valueOf(filterBean.getId()), 3);
                C63253l.f143623a.mo73310f().mo93769a(this.f121026a.f120982c.getAvetParameter().getContentType(), "mid_page", filterBean.getEnName());
                if (z) {
                    C70968bl.m125259a(this.f121026a.f120982c, "slide", filterBean.getEnName(), filterBean.getId());
                } else {
                    C70968bl.m125259a(this.f121026a.f120982c, "click", filterBean.getEnName(), filterBean.getId());
                }
            } else {
                this.f121026a.f120982c.mSelectedId = 0;
                this.f121026a.f120982c.mSelectedFilterId = "";
                this.f121026a.f120982c.mSelectedFilterResId = "";
            }
        }
    }

    public C52547a(AbstractC14552j jVar, C83386w wVar, VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(jVar, "");
        C89219l.m154721d(wVar, "");
        C89219l.m154721d(videoPublishEditModel, "");
        this.f120980a = jVar;
        this.f120981b = wVar;
        this.f120982c = videoPublishEditModel;
    }
}
