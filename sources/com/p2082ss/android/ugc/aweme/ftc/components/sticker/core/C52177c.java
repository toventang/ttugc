package com.p2082ss.android.ugc.aweme.ftc.components.sticker.core;

import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import com.C1764a;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.als.AlsLogicContainer;
import com.bytedance.als.C2563k;
import com.bytedance.als.dsl.C2551b;
import com.bytedance.als.dsl.C2552c;
import com.bytedance.als.dsl.C2553d;
import com.bytedance.als.dsl.C2556g;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.jedi.arch.AbstractC20362a;
import com.bytedance.jedi.arch.AbstractC20367ae;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.AbstractC20382b;
import com.bytedance.jedi.arch.AbstractC20477i;
import com.bytedance.jedi.arch.AbstractC20534v;
import com.bytedance.jedi.arch.C20365ac;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.C20373ak;
import com.bytedance.jedi.arch.C20374al;
import com.bytedance.jedi.arch.C20375am;
import com.bytedance.jedi.arch.C20376an;
import com.bytedance.jedi.arch.C20391d;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.AbstractC21603p;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.C21597n;
import com.bytedance.p969f.p970a.p971a.AbstractC14552j;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.scene.AbstractC22219j;
import com.bytedance.scene.group.AbstractC22186b;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.editSticker.compile.TextStickerCompileResult;
import com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45899e;
import com.p2082ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.p2082ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.p2082ss.android.ugc.aweme.editSticker.p2880d.AbstractC45872e;
import com.p2082ss.android.ugc.aweme.editSticker.p2880d.AbstractC45873f;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap;
import com.p2082ss.android.ugc.aweme.editSticker.text.p2885a.C45995c;
import com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46118d;
import com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46119e;
import com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46122h;
import com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.C46123i;
import com.p2082ss.android.ugc.aweme.editSticker.text.view.C46224i;
import com.p2082ss.android.ugc.aweme.editSticker.text.view.C46239q;
import com.p2082ss.android.ugc.aweme.ftc.C52526e;
import com.p2082ss.android.ugc.aweme.ftc.C52534f;
import com.p2082ss.android.ugc.aweme.ftc.components.sticker.hint.C52216b;
import com.p2082ss.android.ugc.aweme.ftc.components.sticker.info.AbstractC52231a;
import com.p2082ss.android.ugc.aweme.ftc.components.sticker.info.C52241b;
import com.p2082ss.android.ugc.aweme.ftc.components.sticker.info.FTCEditInfoStickerViewModel;
import com.p2082ss.android.ugc.aweme.ftc.components.sticker.text.AbstractC52309a;
import com.p2082ss.android.ugc.aweme.ftc.components.sticker.text.AbstractC52360s;
import com.p2082ss.android.ugc.aweme.ftc.components.sticker.text.C52311b;
import com.p2082ss.android.ugc.aweme.ftc.components.sticker.text.FTCEditTextStickerViewModel;
import com.p2082ss.android.ugc.aweme.ftc.components.toolbar.FTCEditToolbarViewModel;
import com.p2082ss.android.ugc.aweme.infoSticker.AbstractC56722g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63253l;
import com.p2082ss.android.ugc.aweme.shortvideo.C71817eu;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70968bl;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70976bp;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a;
import com.p2082ss.android.ugc.aweme.story.p4047g.C77263b;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.gamora.editor.AbstractC82035ab;
import com.p2082ss.android.ugc.gamora.editor.C83253u;
import com.p2082ss.android.ugc.gamora.editor.sticker.AbstractC82564a;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.vesdk.VESize;
import dmt.p4542av.video.AbstractC88302y;
import dmt.p4542av.video.C88297u;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89386u;
import p4600h.C89391z;
import p4600h.EnumC89331m;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.core.c */
public final class C52177c extends AbstractC22186b implements AbstractC20382b, AbstractC21566a, AbstractC56722g, AbstractC82564a {

    /* renamed from: t */
    public static final C52191f f120206t = new C52191f((byte) 0);

    /* renamed from: A */
    private boolean f120207A;

    /* renamed from: b */
    public AbstractC14552j f120208b;

    /* renamed from: c */
    public AbstractC45899e f120209c;

    /* renamed from: d */
    final AbstractC89244h f120210d;

    /* renamed from: e */
    public final AbstractC89244h f120211e;

    /* renamed from: f */
    public FrameLayout f120212f;

    /* renamed from: g */
    public boolean f120213g;

    /* renamed from: h */
    public AbstractC82035ab f120214h;

    /* renamed from: i */
    public AbstractC52309a f120215i;

    /* renamed from: j */
    final AbstractC89244h f120216j;

    /* renamed from: k */
    public boolean f120217k;

    /* renamed from: l */
    public final C21582f f120218l;

    /* renamed from: u */
    private final AbstractC89244h f120219u = C89250i.m154774a(EnumC89331m.NONE, new C52178a(this));

    /* renamed from: v */
    private C52216b f120220v;

    /* renamed from: w */
    private final AbstractC89244h f120221w = C89250i.m154773a((AbstractC89171a) new C52211z(this));

    /* renamed from: x */
    private final AbstractC89244h f120222x;

    /* renamed from: y */
    private AbstractC88302y f120223y;

    /* renamed from: z */
    private final AbstractC89244h f120224z;

    static {
        Covode.recordClassIndex(61560);
    }

    /* renamed from: E */
    public final AbstractC72510a mo62771E() {
        return (AbstractC72510a) this.f120219u.getValue();
    }

    /* renamed from: F */
    public final VideoPublishEditModel mo87905F() {
        return (VideoPublishEditModel) this.f120221w.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public final FTCEditStickerViewModel mo87906G() {
        return (FTCEditStickerViewModel) this.f120222x.getValue();
    }

    /* renamed from: H */
    public final AbstractC52231a mo87907H() {
        return (AbstractC52231a) this.f120224z.getValue();
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.AbstractC82564a
    /* renamed from: K */
    public final void mo87910K() {
    }

    @Override // com.p2082ss.android.ugc.aweme.infoSticker.AbstractC56722g
    /* renamed from: M */
    public final void mo87912M() {
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.AbstractC82564a
    /* renamed from: O */
    public final void mo87914O() {
    }

    @Override // com.p2082ss.android.ugc.aweme.infoSticker.AbstractC56722g
    /* renamed from: a */
    public final void mo87916a(Effect effect, String str) {
        C89219l.m154721d(effect, "");
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.core.c$f */
    public static final class C52191f {
        static {
            Covode.recordClassIndex(61574);
        }

        private C52191f() {
        }

        public /* synthetic */ C52191f(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.core.c$g */
    static final class CallableC52192g<V> implements Callable {

        /* renamed from: a */
        public static final CallableC52192g f120246a = new CallableC52192g();

        static {
            Covode.recordClassIndex(61575);
        }

        CallableC52192g() {
        }

        @Override // java.util.concurrent.Callable
        public final /* bridge */ /* synthetic */ Object call() {
            return C89086z.INSTANCE;
        }
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20367ae
    public final /* bridge */ /* synthetic */ AbstractC20477i getReceiver() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20534v
    public final AbstractC1204m getLifecycleOwner() {
        return AbstractC20382b.C20383a.m38581a(this);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final AbstractC20534v getLifecycleOwnerHolder() {
        return AbstractC20382b.C20383a.m38601b(this);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final AbstractC20367ae<AbstractC20477i> getReceiverHolder() {
        return AbstractC20382b.C20383a.m38604c(this);
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.core.c$a */
    public static final class C52178a extends AbstractC89220m implements AbstractC89171a<AbstractC72510a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f120225a;

        static {
            Covode.recordClassIndex(61561);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C52178a(AbstractC21566a aVar) {
            super(0);
            this.f120225a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.shortvideo.preview.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f120225a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.preview.a> r1 = com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ftc.components.sticker.core.C52177c.C52178a.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.core.c$b */
    public static final class C52187b extends AbstractC89220m implements AbstractC89171a<AbstractC52231a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f120236a;

        static {
            Covode.recordClassIndex(61570);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C52187b(AbstractC21566a aVar) {
            super(0);
            this.f120236a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.ftc.components.sticker.info.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.ftc.components.sticker.info.AbstractC52231a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f120236a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.ftc.components.sticker.info.a> r1 = com.p2082ss.android.ugc.aweme.ftc.components.sticker.info.AbstractC52231a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ftc.components.sticker.core.C52177c.C52187b.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.core.c$y */
    public static final class C52210y implements AbstractC45872e {

        /* renamed from: a */
        final /* synthetic */ C52177c f120264a;

        static {
            Covode.recordClassIndex(61593);
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.p2880d.AbstractC45872e
        /* renamed from: b */
        public final void mo77234b() {
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.p2880d.AbstractC45872e
        /* renamed from: c */
        public final void mo77235c() {
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.p2880d.AbstractC45872e
        /* renamed from: d */
        public final void mo77236d() {
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.p2880d.AbstractC45872e
        /* renamed from: e */
        public final void mo77237e() {
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.p2880d.AbstractC45872e
        /* renamed from: f */
        public final void mo77238f() {
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.p2880d.AbstractC45872e
        /* renamed from: a */
        public final void mo77232a() {
            C52534f.m97451a(this.f120264a.mo87905F());
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C52210y(C52177c cVar) {
            this.f120264a = cVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.p2880d.AbstractC45872e
        /* renamed from: a */
        public final void mo77233a(int i, String str) {
            C89219l.m154721d(str, "");
            C70968bl.m125255a(this.f120264a.mo87905F(), "move_to_top", 0, i, str);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.infoSticker.AbstractC56722g
    /* renamed from: L */
    public final void mo87911L() {
        mo62771E().mo114805a((AbstractC72510a) false, false, false);
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.AbstractC82564a
    /* renamed from: N */
    public final boolean mo87913N() {
        AbstractC52309a aVar = this.f120215i;
        if (aVar == null || !aVar.mo88061l()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        C21582f b = C2552c.m7464b(this);
        if (b == null) {
            C89219l.m154715b();
        }
        return b;
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: w */
    public final void mo36490w() {
        super.mo36490w();
        AbstractC52309a aVar = this.f120215i;
        if (aVar != null) {
            aVar.mo88056g();
        }
        this.f120213g = false;
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.core.c$ad */
    static final class C52184ad extends AbstractC89220m implements AbstractC89171a<C46224i> {

        /* renamed from: a */
        final /* synthetic */ C52177c f120233a;

        static {
            Covode.recordClassIndex(61567);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52184ad(C52177c cVar) {
            super(0);
            this.f120233a = cVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.core.c$ad$b */
        public static final class C52186b implements AbstractC45873f {

            /* renamed from: a */
            final /* synthetic */ C52184ad f120235a;

            static {
                Covode.recordClassIndex(61569);
            }

            @Override // com.p2082ss.android.ugc.aweme.editSticker.p2880d.AbstractC45873f
            /* renamed from: a */
            public final void mo77239a() {
            }

            @Override // com.p2082ss.android.ugc.aweme.editSticker.p2880d.AbstractC45873f
            /* renamed from: b */
            public final Map<String, String> mo77240b() {
                Map<String, String> map = C77263b.m135059a(this.f120235a.f120233a.mo87905F().getAvetParameter()).f188764a;
                C89219l.m154716b(map, "");
                return map;
            }

            C52186b(C52184ad adVar) {
                this.f120235a = adVar;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C46224i invoke() {
            MethodCollector.m26663i(12172);
            View inflate = ((ViewStub) this.f120233a.mo36475c(R.id.fgf)).inflate();
            if (inflate != null) {
                C46224i iVar = (C46224i) inflate;
                iVar.mo78490a(this.f120233a.mo87905F().mShootWay, this.f120233a.mo87905F().creationId, C70976bp.m125301a(this.f120233a.mo87905F()));
                iVar.setTextStickerInputMobListener(new C52185a(this));
                iVar.setWikiTextStickerMob(new C52186b(this));
                MethodCollector.m26664o(12172);
                return iVar;
            }
            NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.editSticker.text.view.TextStickerInputLayout");
            MethodCollector.m26664o(12172);
            throw nullPointerException;
        }

        /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.core.c$ad$a */
        public static final class C52185a implements AbstractC46122h {

            /* renamed from: a */
            final /* synthetic */ C52184ad f120234a;

            static {
                Covode.recordClassIndex(61568);
            }

            @Override // com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46122h
            /* renamed from: a */
            public final void mo78312a() {
            }

            @Override // com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46122h
            /* renamed from: a */
            public final void mo78313a(int i) {
            }

            @Override // com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46122h
            /* renamed from: a */
            public final void mo78314a(C45995c cVar) {
                C89219l.m154721d(cVar, "");
            }

            @Override // com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46122h
            /* renamed from: a */
            public final void mo78315a(String str) {
                C89219l.m154721d(str, "");
            }

            @Override // com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46122h
            /* renamed from: b */
            public final void mo78317b(int i) {
            }

            C52185a(C52184ad adVar) {
                this.f120234a = adVar;
            }

            @Override // com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46122h
            /* renamed from: a */
            public final void mo78316a(List<TextStickerTextWrap> list) {
                C89219l.m154721d(list, "");
                VideoPublishEditModel F = this.f120234a.f120233a.mo87905F();
                C89219l.m154721d(F, "");
                C39162r.m79460a("text_complete", new C84425b().mo129406a("creation_id", F.creationId).mo129406a("shoot_way", F.mShootWay).mo129406a("enter_from", F.enterFrom).mo129406a("content_source", C71817eu.m126790a(F)).f188764a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.core.c$z */
    static final class C52211z extends AbstractC89220m implements AbstractC89171a<VideoPublishEditModel> {

        /* renamed from: a */
        final /* synthetic */ C52177c f120265a;

        static {
            Covode.recordClassIndex(61594);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52211z(C52177c cVar) {
            super(0);
            this.f120265a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ VideoPublishEditModel invoke() {
            Object a = this.f120265a.f120218l.mo35249a((Type) VideoPublishEditModel.class, (String) null);
            C89219l.m154716b(a, "");
            return a;
        }
    }

    /* renamed from: I */
    public final void mo87908I() {
        if (!this.f120207A) {
            this.f120207A = true;
            mo87907H().mo87939a();
            mo62771E().mo114780E().observe(this, new C52194i(this));
        }
    }

    /* renamed from: J */
    public final void mo87909J() {
        C89378p<Integer, Integer> pVar;
        VESize b;
        AbstractC31071f value = mo62771E().mo114778C().getValue();
        if (value == null || (b = value.mo56330b()) == null) {
            pVar = null;
        } else {
            pVar = new C89378p<>(Integer.valueOf(b.width), Integer.valueOf(b.height));
        }
        AbstractC52309a aVar = this.f120215i;
        if (aVar != null) {
            aVar.mo88049a(pVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.core.c$c */
    public static final class C52188c extends AbstractC89220m implements AbstractC89171a<FTCEditTextStickerViewModel> {

        /* renamed from: a */
        final /* synthetic */ AbstractC22219j f120237a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f120238b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f120239c;

        static {
            Covode.recordClassIndex(61571);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C52188c(AbstractC22219j jVar, AbstractC89277c cVar, AbstractC89277c cVar2) {
            super(0);
            this.f120237a = jVar;
            this.f120238b = cVar;
            this.f120239c = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.ftc.components.sticker.text.FTCEditTextStickerViewModel] */
        /* JADX WARN: Type inference failed for: r0v15, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.ftc.components.sticker.text.FTCEditTextStickerViewModel] */
        /* JADX WARNING: Unknown variable types count: 2 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.ftc.components.sticker.text.FTCEditTextStickerViewModel invoke() {
            /*
                r6 = this;
                com.bytedance.scene.j r0 = r6.f120237a
                com.bytedance.scene.j r5 = r0.f52551o
                h.k.c r0 = r6.f120239c
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                java.lang.String r3 = r0.getCanonicalName()
                java.lang.String r4 = ""
                p4600h.p4611f.p4613b.C89219l.m154716b(r3, r4)
            L_0x0013:
                if (r5 == 0) goto L_0x003a
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ad r2 = com.bytedance.scene.C22267s.m41934a(r5, r0)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.f120239c     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)     // Catch:{ as -> 0x0035 }
                java.lang.String r1 = r0.getCanonicalName()     // Catch:{ as -> 0x0035 }
                p4600h.p4611f.p4613b.C89219l.m154716b(r1, r4)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.f120238b     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ac r0 = m96976x90d74369(r2, r1, r0)     // Catch:{ as -> 0x0035 }
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0     // Catch:{ as -> 0x0035 }
                goto L_0x0038
            L_0x0035:
                com.bytedance.scene.j r5 = r5.f52551o
                goto L_0x0013
            L_0x0038:
                if (r0 != 0) goto L_0x0052
            L_0x003a:
                com.bytedance.scene.j r0 = r6.f120237a
                androidx.fragment.app.e r1 = com.bytedance.scene.ktx.C22228c.m41832b(r0)
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a
                androidx.lifecycle.ad r1 = androidx.lifecycle.C1181ae.m3881a(r1, r0)
                h.k.c r0 = r6.f120238b
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                androidx.lifecycle.ac r0 = m96976x90d74369(r1, r3, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0052:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ftc.components.sticker.core.C52177c.C52188c.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_ftc_components_sticker_core_FTCEditStickerScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m96976x90d74369(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.core.c$d */
    public static final class C52189d extends AbstractC89220m implements AbstractC89171a<FTCEditToolbarViewModel> {

        /* renamed from: a */
        final /* synthetic */ AbstractC22219j f120240a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f120241b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f120242c;

        static {
            Covode.recordClassIndex(61572);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C52189d(AbstractC22219j jVar, AbstractC89277c cVar, AbstractC89277c cVar2) {
            super(0);
            this.f120240a = jVar;
            this.f120241b = cVar;
            this.f120242c = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [com.ss.android.ugc.aweme.ftc.components.toolbar.FTCEditToolbarViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v15, types: [com.ss.android.ugc.aweme.ftc.components.toolbar.FTCEditToolbarViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 2 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.ftc.components.toolbar.FTCEditToolbarViewModel invoke() {
            /*
                r6 = this;
                com.bytedance.scene.j r0 = r6.f120240a
                com.bytedance.scene.j r5 = r0.f52551o
                h.k.c r0 = r6.f120242c
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                java.lang.String r3 = r0.getCanonicalName()
                java.lang.String r4 = ""
                p4600h.p4611f.p4613b.C89219l.m154716b(r3, r4)
            L_0x0013:
                if (r5 == 0) goto L_0x003a
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ad r2 = com.bytedance.scene.C22267s.m41934a(r5, r0)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.f120242c     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)     // Catch:{ as -> 0x0035 }
                java.lang.String r1 = r0.getCanonicalName()     // Catch:{ as -> 0x0035 }
                p4600h.p4611f.p4613b.C89219l.m154716b(r1, r4)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.f120241b     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ac r0 = m96977xa47f16ea(r2, r1, r0)     // Catch:{ as -> 0x0035 }
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0     // Catch:{ as -> 0x0035 }
                goto L_0x0038
            L_0x0035:
                com.bytedance.scene.j r5 = r5.f52551o
                goto L_0x0013
            L_0x0038:
                if (r0 != 0) goto L_0x0052
            L_0x003a:
                com.bytedance.scene.j r0 = r6.f120240a
                androidx.fragment.app.e r1 = com.bytedance.scene.ktx.C22228c.m41832b(r0)
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a
                androidx.lifecycle.ad r1 = androidx.lifecycle.C1181ae.m3881a(r1, r0)
                h.k.c r0 = r6.f120241b
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                androidx.lifecycle.ac r0 = m96977xa47f16ea(r1, r3, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0052:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ftc.components.sticker.core.C52177c.C52189d.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_ftc_components_sticker_core_FTCEditStickerScene$$special$$inlined$hostViewModel$2_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m96977xa47f16ea(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.core.c$e */
    public static final class C52190e extends AbstractC89220m implements AbstractC89171a<FTCEditStickerViewModel> {

        /* renamed from: a */
        final /* synthetic */ AbstractC22219j f120243a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f120244b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f120245c;

        static {
            Covode.recordClassIndex(61573);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C52190e(AbstractC22219j jVar, AbstractC89277c cVar, AbstractC89277c cVar2) {
            super(0);
            this.f120243a = jVar;
            this.f120244b = cVar;
            this.f120245c = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.ftc.components.sticker.core.FTCEditStickerViewModel] */
        /* JADX WARN: Type inference failed for: r0v15, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.ftc.components.sticker.core.FTCEditStickerViewModel] */
        /* JADX WARNING: Unknown variable types count: 2 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.ftc.components.sticker.core.FTCEditStickerViewModel invoke() {
            /*
                r6 = this;
                com.bytedance.scene.j r0 = r6.f120243a
                com.bytedance.scene.j r5 = r0.f52551o
                h.k.c r0 = r6.f120245c
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                java.lang.String r3 = r0.getCanonicalName()
                java.lang.String r4 = ""
                p4600h.p4611f.p4613b.C89219l.m154716b(r3, r4)
            L_0x0013:
                if (r5 == 0) goto L_0x003a
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ad r2 = com.bytedance.scene.C22267s.m41934a(r5, r0)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.f120245c     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)     // Catch:{ as -> 0x0035 }
                java.lang.String r1 = r0.getCanonicalName()     // Catch:{ as -> 0x0035 }
                p4600h.p4611f.p4613b.C89219l.m154716b(r1, r4)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.f120244b     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ac r0 = m96978xb826ea6b(r2, r1, r0)     // Catch:{ as -> 0x0035 }
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0     // Catch:{ as -> 0x0035 }
                goto L_0x0038
            L_0x0035:
                com.bytedance.scene.j r5 = r5.f52551o
                goto L_0x0013
            L_0x0038:
                if (r0 != 0) goto L_0x0052
            L_0x003a:
                com.bytedance.scene.j r0 = r6.f120243a
                androidx.fragment.app.e r1 = com.bytedance.scene.ktx.C22228c.m41832b(r0)
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a
                androidx.lifecycle.ad r1 = androidx.lifecycle.C1181ae.m3881a(r1, r0)
                h.k.c r0 = r6.f120244b
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                androidx.lifecycle.ac r0 = m96978xb826ea6b(r1, r3, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0052:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ftc.components.sticker.core.C52177c.C52190e.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_ftc_components_sticker_core_FTCEditStickerScene$$special$$inlined$hostViewModel$3_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m96978xb826ea6b(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.core.c$ac */
    static final class C52182ac extends AbstractC89220m implements AbstractC89172b<C21597n, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C52177c f120231a;

        static {
            Covode.recordClassIndex(61565);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52182ac(C52177c cVar) {
            super(1);
            this.f120231a = cVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.core.c$ac$a */
        public static final class C52183a extends AbstractC21603p<C46224i> {

            /* renamed from: a */
            final /* synthetic */ C52182ac f120232a;

            static {
                Covode.recordClassIndex(61566);
            }

            public C52183a(C52182ac acVar) {
                this.f120232a = acVar;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, com.ss.android.ugc.aweme.editSticker.text.view.i] */
            /* JADX WARNING: Unknown variable types count: 1 */
            @Override // com.bytedance.p1559o.AbstractC21603p
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final com.p2082ss.android.ugc.aweme.editSticker.text.view.C46224i get(com.bytedance.p1559o.C21582f r2) {
                /*
                    r1 = this;
                    java.lang.String r0 = ""
                    p4600h.p4611f.p4613b.C89219l.m154721d(r2, r0)
                    com.ss.android.ugc.aweme.ftc.components.sticker.core.c$ac r0 = r1.f120232a
                    com.ss.android.ugc.aweme.ftc.components.sticker.core.c r0 = r0.f120231a
                    h.h r0 = r0.f120216j
                    java.lang.Object r0 = r0.getValue()
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ftc.components.sticker.core.C52177c.C52182ac.C52183a.get(com.bytedance.o.f):java.lang.Object");
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C21597n nVar) {
            C21597n nVar2 = nVar;
            C89219l.m154721d(nVar2, "");
            C89219l.m154716b(nVar2.mo35260a(C46224i.class, (String) null, (AbstractC21603p) new C52183a(this)), "");
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.core.c$u */
    public static final class C52206u implements AbstractC46119e {

        /* renamed from: a */
        final /* synthetic */ C52177c f120261a;

        static {
            Covode.recordClassIndex(61589);
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46119e
        /* renamed from: a */
        public final void mo78307a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46119e
        /* renamed from: a */
        public final void mo78308a(C46239q qVar) {
            C89219l.m154721d(qVar, "");
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46119e
        /* renamed from: b */
        public final void mo78310b(C46239q qVar) {
            C89219l.m154721d(qVar, "");
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46119e
        /* renamed from: c */
        public final void mo78311c(C46239q qVar) {
            C89219l.m154721d(qVar, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C52206u(C52177c cVar) {
            this.f120261a = cVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46119e
        /* renamed from: a */
        public final void mo78309a(C46239q qVar, C46123i iVar) {
            C89219l.m154721d(qVar, "");
            C89219l.m154721d(iVar, "");
            if (iVar.f107377c) {
                if (!iVar.f107379e) {
                    this.f120261a.mo62771E().mo114805a((AbstractC72510a) true, true, true);
                }
                this.f120261a.f120213g = false;
                return;
            }
            if (!this.f120261a.f120213g) {
                this.f120261a.mo62771E().mo114805a((AbstractC72510a) false, true, false);
                this.f120261a.mo87907H().mo87950i();
                ((FTCEditTextStickerViewModel) this.f120261a.f120210d.getValue()).mo88060k();
                this.f120261a.mo87908I();
                AbstractC52231a H = this.f120261a.mo87907H();
                if (H.mo87945c() != null) {
                    H.mo87943b();
                }
            }
            this.f120261a.f120213g = true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.core.c$k */
    static final class C52196k<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C52177c f120251a;

        static {
            Covode.recordClassIndex(61579);
        }

        C52196k(C52177c cVar) {
            this.f120251a = cVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            if (obj != null) {
                this.f120251a.mo87907H().mo87950i();
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ FrameLayout m96947a(C52177c cVar) {
        FrameLayout frameLayout = cVar.f120212f;
        if (frameLayout == null) {
            C89219l.m154710a("textLayout");
        }
        return frameLayout;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af> S1 getState(VM1 vm1) {
        C89219l.m154721d(vm1, "");
        return (S1) AbstractC20382b.C20383a.m38582a(this, vm1);
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.core.c$aa */
    public static final class C52179aa extends AbstractC21603p<C52241b> {

        /* renamed from: a */
        final /* synthetic */ C2553d f120226a;

        /* renamed from: b */
        final /* synthetic */ C52177c f120227b;

        static {
            Covode.recordClassIndex(61562);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C52241b get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            C52177c cVar = this.f120227b;
            return new C52241b(fVar, cVar, C52177c.m96947a(cVar));
        }

        public C52179aa(C2553d dVar, C52177c cVar) {
            this.f120226a = dVar;
            this.f120227b = cVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.core.c$i */
    public static final class C52194i<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C52177c f120249a;

        static {
            Covode.recordClassIndex(61577);
        }

        C52194i(C52177c cVar) {
            this.f120249a = cVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            C88297u uVar = (C88297u) obj;
            if (uVar == null) {
                return;
            }
            if (uVar.f200378j == 1) {
                this.f120249a.mo62771E().mo114805a((AbstractC72510a) false, false, false);
            } else {
                this.f120249a.mo62771E().mo114805a((AbstractC72510a) true, false, true);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.core.c$j */
    static final class C52195j<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C52177c f120250a;

        static {
            Covode.recordClassIndex(61578);
        }

        C52195j(C52177c cVar) {
            this.f120250a = cVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                AbstractC52231a H = this.f120250a.mo87907H();
                if (!H.mo87947f()) {
                    H.mo87942a(booleanValue);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.core.c$l */
    static final class C52197l<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C52177c f120252a;

        static {
            Covode.recordClassIndex(61580);
        }

        C52197l(C52177c cVar) {
            this.f120252a = cVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                AbstractC52309a aVar = this.f120252a.f120215i;
                if (aVar != null) {
                    aVar.mo88050a(booleanValue);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.core.c$n */
    static final class C52199n<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C52177c f120254a;

        static {
            Covode.recordClassIndex(61582);
        }

        C52199n(C52177c cVar) {
            this.f120254a = cVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                this.f120254a.mo62771E().mo114815d(bool.booleanValue());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.core.c$p */
    static final class C52201p<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C52177c f120256a;

        static {
            Covode.recordClassIndex(61584);
        }

        C52201p(C52177c cVar) {
            this.f120256a = cVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                C52177c cVar = this.f120256a;
                AbstractC52309a aVar = cVar.f120215i;
                if (aVar != null) {
                    aVar.mo88052b(booleanValue);
                }
                AbstractC52231a H = cVar.mo87907H();
                if (!H.mo87948g()) {
                    H.mo87942a(booleanValue);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.core.c$q */
    static final class C52202q<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C52177c f120257a;

        static {
            Covode.recordClassIndex(61585);
        }

        C52202q(C52177c cVar) {
            this.f120257a = cVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                C52177c cVar = this.f120257a;
                AbstractC52309a aVar = cVar.f120215i;
                if (aVar != null) {
                    aVar.mo88052b(booleanValue);
                }
                cVar.mo87907H().mo87942a(booleanValue);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.core.c$v */
    public static final class C52207v extends AbstractC89220m implements AbstractC89172b<C46239q, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C52177c f120262a;

        static {
            Covode.recordClassIndex(61590);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C52207v(C52177c cVar) {
            super(1);
            this.f120262a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C46239q qVar) {
            C46239q qVar2 = qVar;
            C89219l.m154721d(qVar2, "");
            this.f120262a.mo87908I();
            this.f120262a.mo87907H().mo87941a(qVar2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.core.c$m */
    static final class C52198m<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C52177c f120253a;

        static {
            Covode.recordClassIndex(61581);
        }

        C52198m(C52177c cVar) {
            this.f120253a = cVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            boolean booleanValue;
            C89378p pVar = (C89378p) obj;
            if (pVar != null) {
                this.f120253a.mo62771E().mo114805a((AbstractC72510a) ((Boolean) pVar.getFirst()).booleanValue(), ((Boolean) pVar.getSecond()).booleanValue(), booleanValue);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.core.c$ab */
    public static final class C52180ab extends AbstractC21603p<C52311b> {

        /* renamed from: a */
        final /* synthetic */ C2553d f120228a;

        /* renamed from: b */
        final /* synthetic */ C52177c f120229b;

        static {
            Covode.recordClassIndex(61563);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C52311b get(C21582f fVar) {
            Integer num;
            C89219l.m154721d(fVar, "");
            Integer a = C63253l.f143623a.mo73323s().mo93859f().mo93860a();
            if (a != null && a.intValue() == 0) {
                num = 30;
            } else {
                num = C63253l.f143623a.mo73323s().mo93859f().mo93860a();
            }
            C52177c cVar = this.f120229b;
            C521811 r1 = new AbstractC52360s(this) {
                /* class com.p2082ss.android.ugc.aweme.ftc.components.sticker.core.C52177c.C52180ab.C521811 */

                /* renamed from: a */
                final /* synthetic */ C52180ab f120230a;

                static {
                    Covode.recordClassIndex(61564);
                }

                @Override // com.p2082ss.android.ugc.aweme.ftc.components.sticker.text.AbstractC52360s
                /* renamed from: a */
                public final InfoStickerModel mo87918a() {
                    return this.f120230a.f120229b.mo87905F().infoStickerModel;
                }

                {
                    this.f120230a = r1;
                }
            };
            C89219l.m154716b(num, "");
            return new C52311b(fVar, cVar, r1, num.intValue());
        }

        public C52180ab(C2553d dVar, C52177c cVar) {
            this.f120228a = dVar;
            this.f120229b = cVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.core.c$h */
    static final class C52193h<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ AbstractC31071f f120247a;

        /* renamed from: b */
        final /* synthetic */ AbstractC82035ab f120248b;

        static {
            Covode.recordClassIndex(61576);
        }

        C52193h(AbstractC31071f fVar, AbstractC82035ab abVar) {
            this.f120247a = fVar;
            this.f120248b = abVar;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            int i;
            int j;
            C89219l.m154716b(iVar, "");
            for (TextStickerCompileResult textStickerCompileResult : (List) iVar.mo5545d()) {
                TextStickerData textStickerData = textStickerCompileResult.textStickerData;
                String b = C63244g.m114602a().mo73261G().mo46674b(textStickerData);
                if (textStickerData.hasTimeData()) {
                    i = textStickerData.getStartTime();
                } else {
                    i = 0;
                }
                if (textStickerData.hasTimeData()) {
                    j = textStickerData.getEndTime();
                } else {
                    j = this.f120247a.mo56368j();
                }
                StickerItemModel stickerItemModel = new StickerItemModel("text_sticker_" + textStickerCompileResult.index, textStickerCompileResult.stickerPath, b, textStickerCompileResult.index, false, i, j, 2);
                stickerItemModel.isImageStickerLayer = true;
                stickerItemModel.viewHash = textStickerCompileResult.viewHash;
                this.f120248b.mo87638a(stickerItemModel);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.core.c$o */
    static final class C52200o<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C52177c f120255a;

        static {
            Covode.recordClassIndex(61583);
        }

        C52200o(C52177c cVar) {
            this.f120255a = cVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            boolean z;
            C88297u uVar = (C88297u) obj;
            if (uVar != null) {
                C52177c cVar = this.f120255a;
                if (uVar.f200378j == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (uVar.f200375g) {
                    cVar.mo87906G().mo87902h().setValue(Boolean.valueOf(z));
                } else {
                    cVar.mo87906G().mo87901g().setValue(Boolean.valueOf(z));
                }
                if (z) {
                    cVar.mo87906G().mo87903i().setValue(false);
                    cVar.mo87906G().mo87904j().setValue(false);
                }
            }
        }
    }

    public C52177c(C21582f fVar) {
        C89219l.m154721d(fVar, "");
        this.f120218l = fVar;
        AbstractC89277c a = C89204ab.m154669a(FTCEditTextStickerViewModel.class);
        this.f120210d = C89250i.m154773a((AbstractC89171a) new C52188c(this, a, a));
        AbstractC89277c a2 = C89204ab.m154669a(FTCEditToolbarViewModel.class);
        this.f120211e = C89250i.m154773a((AbstractC89171a) new C52189d(this, a2, a2));
        AbstractC89277c a3 = C89204ab.m154669a(FTCEditStickerViewModel.class);
        this.f120222x = C89250i.m154773a((AbstractC89171a) new C52190e(this, a3, a3));
        this.f120224z = C89250i.m154774a(EnumC89331m.NONE, new C52187b(this));
        this.f120216j = C89250i.m154773a((AbstractC89171a) new C52184ad(this));
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo22704a(Bundle bundle) {
        C2563k<Boolean> c;
        C2563k<C89378p<Boolean, Boolean>> b;
        C2563k<C89391z> a;
        super.mo22704a(bundle);
        C2556g.m7472a(this, new C52182ac(this));
        C2551b bVar = new C2551b(C2552c.m7462a(this));
        C2553d dVar = new C2553d();
        AlsLogicContainer alsLogicContainer = bVar.f7720a;
        alsLogicContainer.f7696d.mo35260a(C52241b.class, (String) null, (AbstractC21603p) new C52179aa(dVar, this));
        alsLogicContainer.mo7005a(FTCEditInfoStickerViewModel.class, C52241b.class);
        C2553d dVar2 = new C2553d();
        AlsLogicContainer alsLogicContainer2 = bVar.f7720a;
        alsLogicContainer2.f7696d.mo35260a(C52311b.class, (String) null, (AbstractC21603p) new C52180ab(dVar2, this));
        alsLogicContainer2.mo7005a(FTCEditTextStickerViewModel.class, C52311b.class);
        bVar.mo7031a();
        this.f120215i = (AbstractC52309a) getDiContainer().mo35249a(AbstractC52309a.class, (String) null);
        this.f120223y = new C52526e();
        mo87906G().mo87901g().observe(this, new C52195j<>(this));
        mo87906G().mo87902h().observe(this, new C52201p<>(this));
        mo87906G().mo87900b().observe(this, new C52202q<>(this));
        AbstractC20382b.C20383a.m38603b(this, mo87906G(), C52212d.f120266a, new C52203r(this));
        AbstractC20382b.C20383a.m38603b(this, mo87906G(), C52213e.f120267a, new C52204s(this));
        AbstractC88412b unused = selectSubscribe(mo87906G(), C52214f.f120268a, new C20370ah(), new C52205t(this));
        AbstractC52309a aVar = this.f120215i;
        if (!(aVar == null || (a = aVar.mo88039a()) == null)) {
            a.mo6997a(getLifecycleOwner(), new C52196k(this));
        }
        mo87906G().mo87903i().observe(this, new C52197l<>(this));
        AbstractC52309a aVar2 = this.f120215i;
        if (aVar2 != null) {
            aVar2.mo88041a(mo87906G().mo87903i());
        }
        AbstractC52309a aVar3 = this.f120215i;
        if (!(aVar3 == null || (b = aVar3.mo88051b()) == null)) {
            b.mo6997a(this, new C52198m(this));
        }
        AbstractC52309a aVar4 = this.f120215i;
        if (!(aVar4 == null || (c = aVar4.mo88053c()) == null)) {
            c.mo6997a(this, new C52199n(this));
        }
        mo62771E().mo114780E().observe(this, new C52200o<>(this));
        if (this.f120220v == null) {
            C52216b bVar2 = new C52216b();
            this.f120220v = bVar2;
            mo36387a(R.id.f4j, bVar2, "StickerHintTextScene");
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j, com.bytedance.scene.group.AbstractC22186b
    /* renamed from: a */
    public final /* synthetic */ View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return mo22702a(layoutInflater, viewGroup);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20382b.C20383a.m38593a(this, vm1, bVar);
    }

    @Override // com.bytedance.scene.group.AbstractC22186b
    /* renamed from: b */
    public final ViewGroup mo36393b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.asy, viewGroup, false);
        Objects.requireNonNull(a, "null cannot be cast to non-null type android.widget.FrameLayout");
        return (FrameLayout) a;
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.core.c$r */
    static final class C52203r extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C89378p<? extends Float, ? extends Long>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C52177c f120258a;

        static {
            Covode.recordClassIndex(61586);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52203r(C52177c cVar) {
            super(2);
            this.f120258a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C89378p<? extends Float, ? extends Long> pVar) {
            C89378p<? extends Float, ? extends Long> pVar2 = pVar;
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(pVar2, "");
            C83253u.m143652a(C52177c.m96947a(this.f120258a), ((Number) pVar2.getFirst()).floatValue(), ((Number) pVar2.getSecond()).longValue());
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.core.c$s */
    static final class C52204s extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C89386u<? extends Float, ? extends Float, ? extends Float>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C52177c f120259a;

        static {
            Covode.recordClassIndex(61587);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52204s(C52177c cVar) {
            super(2);
            this.f120259a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C89386u<? extends Float, ? extends Float, ? extends Float> uVar) {
            C89386u<? extends Float, ? extends Float, ? extends Float> uVar2 = uVar;
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(uVar2, "");
            C83253u.m143651a(C52177c.m96947a(this.f120259a), ((Number) uVar2.getFirst()).floatValue(), ((Number) uVar2.getSecond()).floatValue(), ((Number) uVar2.getThird()).floatValue());
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.core.c$t */
    static final class C52205t extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C52177c f120260a;

        static {
            Covode.recordClassIndex(61588);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52205t(C52177c cVar) {
            super(2);
            this.f120260a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Integer num) {
            Integer num2 = num;
            C89219l.m154721d(iVar, "");
            if (num2 != null) {
                int intValue = num2.intValue();
                View b = this.f120260a.mo36474b(R.id.ey9);
                if (b != null) {
                    ViewGroup.LayoutParams layoutParams = b.getLayoutParams();
                    Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.topMargin = intValue;
                    b.setLayoutParams(marginLayoutParams);
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.core.c$w */
    public static final class C52208w extends AbstractC89220m implements AbstractC89183m<C46239q, C46239q, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C52177c f120263a;

        static {
            Covode.recordClassIndex(61591);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C52208w(C52177c cVar) {
            super(2);
            this.f120263a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C46239q qVar, C46239q qVar2) {
            C46239q qVar3 = qVar2;
            C89219l.m154721d(qVar, "");
            C89219l.m154721d(qVar3, "");
            AbstractC52309a aVar = this.f120263a.f120215i;
            if (aVar != null && aVar.mo88055f()) {
                this.f120263a.mo87907H().mo87944b(qVar3);
                this.f120263a.mo87907H().mo87943b();
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo36473a(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.mo36473a(view, bundle);
        View c = mo36475c(R.id.egu);
        C89219l.m154716b(c, "");
        this.f120212f = (FrameLayout) c;
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.core.c$x */
    public static final class C52209x implements AbstractC46118d {
        static {
            Covode.recordClassIndex(61592);
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46118d
        /* renamed from: a */
        public final float mo77563a(float f) {
            return 0.0f;
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46118d
        /* renamed from: a */
        public final int mo77564a(C46239q qVar, boolean z, boolean z2) {
            C89219l.m154721d(qVar, "");
            return 0;
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46118d
        /* renamed from: a */
        public final void mo77566a(C46239q qVar) {
            C89219l.m154721d(qVar, "");
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46118d
        /* renamed from: a */
        public final void mo77567a(C46239q qVar, RectF rectF, C46123i iVar) {
            C89219l.m154721d(qVar, "");
            C89219l.m154721d(rectF, "");
            C89219l.m154721d(iVar, "");
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46118d
        /* renamed from: a */
        public final void mo77568a(C46239q qVar, boolean z) {
            C89219l.m154721d(qVar, "");
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46118d
        /* renamed from: b */
        public final void mo77569b(C46239q qVar) {
            C89219l.m154721d(qVar, "");
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46118d
        /* renamed from: c */
        public final void mo77570c(C46239q qVar) {
            C89219l.m154721d(qVar, "");
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46118d
        /* renamed from: d */
        public final void mo77571d(C46239q qVar) {
            C89219l.m154721d(qVar, "");
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46118d
        /* renamed from: e */
        public final void mo77572e(C46239q qVar) {
            C89219l.m154721d(qVar, "");
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46118d
        /* renamed from: a */
        public final PointF mo77565a(C46239q qVar, float f, float f2) {
            C89219l.m154721d(qVar, "");
            return new PointF();
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af> AbstractC88412b subscribe(JediViewModel<S> jediViewModel, C20370ah<S> ahVar, AbstractC89183m<? super AbstractC20477i, ? super S, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20382b.C20383a.m38583a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.AbstractC82564a
    /* renamed from: a */
    public final C1731i<C89391z> mo87915a(AbstractC31071f fVar, AbstractC82035ab abVar, AbstractC89172b<? super String, String> bVar) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(abVar, "");
        C1731i<C89391z> a = C1731i.m5633a(C89391z.f203057a);
        C89219l.m154716b(a, "");
        return a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x009f, code lost:
        if (r3 == null) goto L_0x00a1;
     */
    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.AbstractC82564a
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p077b.C1731i<p4600h.C89391z> mo87917b(com.p2082ss.android.ugc.asve.editor.AbstractC31071f r11, com.p2082ss.android.ugc.gamora.editor.AbstractC82035ab r12, p4600h.p4611f.p4612a.AbstractC89172b<? super java.lang.String, java.lang.String> r13) {
        /*
        // Method dump skipped, instructions count: 197
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ftc.components.sticker.core.C52177c.mo87917b(com.ss.android.ugc.asve.editor.f, com.ss.android.ugc.gamora.editor.ab, h.f.a.b):b.i");
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <S extends AbstractC20368af, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        AbstractC20382b.C20383a.m38599a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20382b.C20383a.m38606d(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <S extends AbstractC20368af, A> void subscribeEvent(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends C20391d<? extends A>> kVar, C20370ah<C20373ak<C20391d<A>>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        AbstractC20382b.C20383a.m38602b(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <S extends AbstractC20368af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends C20365ac<? extends A>> kVar, C20370ah<C20373ak<C20365ac<A>>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        AbstractC20382b.C20383a.m38605c(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, C20370ah<C20374al<A, B>> ahVar, AbstractC89187q<? super AbstractC20477i, ? super A, ? super B, C89391z> qVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(qVar, "");
        return AbstractC20382b.C20383a.m38585a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, T> AbstractC88412b asyncSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends AbstractC20362a<? extends T>> kVar, C20370ah<C20373ak<AbstractC20362a<T>>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super Throwable, C89391z> mVar, AbstractC89172b<? super AbstractC20477i, C89391z> bVar, AbstractC89183m<? super AbstractC20477i, ? super T, C89391z> mVar2) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        return AbstractC20382b.C20383a.m38584a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B, C> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, C20370ah<C20375am<A, B, C>> ahVar, AbstractC89188r<? super AbstractC20477i, ? super A, ? super B, ? super C, C89391z> rVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(rVar, "");
        return AbstractC20382b.C20383a.m38586a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B, C, D> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, AbstractC89290k<S, ? extends D> kVar4, C20370ah<C20376an<A, B, C, D>> ahVar, AbstractC89189s<? super AbstractC20477i, ? super A, ? super B, ? super C, ? super D, C89391z> sVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(kVar4, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(sVar, "");
        return AbstractC20382b.C20383a.m38587a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}
