package com.p2082ss.android.ugc.gamora.editor;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1213t;
import com.bytedance.als.C2564l;
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
import com.bytedance.jedi.arch.C20521k;
import com.bytedance.jedi.arch.C20531t;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.bytedance.p969f.p970a.p971a.AbstractC14552j;
import com.bytedance.p969f.p970a.p971a.C14544f;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.scene.AbstractC22219j;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45898d;
import com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45899e;
import com.p2082ss.android.ugc.aweme.editSticker.interact.view.C45922g;
import com.p2082ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.p2082ss.android.ugc.aweme.editSticker.p2879c.AbstractC45857b;
import com.p2082ss.android.ugc.aweme.editSticker.p2879c.C45856a;
import com.p2082ss.android.ugc.aweme.editSticker.text.als.AbstractC46036a;
import com.p2082ss.android.ugc.aweme.effectplatforn.EffectPlatformFactory;
import com.p2082ss.android.ugc.aweme.infoSticker.C56724i;
import com.p2082ss.android.ugc.aweme.p4244z.AbstractC81787c;
import com.p2082ss.android.ugc.aweme.services.effectplatform.EffectPlatformBuilder;
import com.p2082ss.android.ugc.aweme.services.effectplatform.IEffectPlatformFactory;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C71073b;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.EnumC71088d;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3814a.C71065a;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3814a.C71068c;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3814a.C71069d;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3815b.C71076a;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3816c.AbstractC71087a;
import com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.p3863d.C72864a;
import com.p2082ss.android.ugc.aweme.shortvideo.util.ToolSafeHandler;
import com.p2082ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p2082ss.android.ugc.aweme.tools.p4115e.AbstractC78484a;
import com.p2082ss.android.ugc.aweme.tools.p4115e.AbstractC78486c;
import com.p2082ss.android.ugc.aweme.utils.C80322d;
import com.p2082ss.android.ugc.effectmanager.EffectConfiguration;
import com.p2082ss.android.ugc.gamora.editor.lightening.C82306a;
import com.p2082ss.android.ugc.gamora.editor.lightening.p4281a.C82307a;
import com.p2082ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel;
import com.p2082ss.android.ugc.gamora.editor.sticker.duet.AbstractC82814a;
import com.p2082ss.android.ugc.gamora.editor.sticker.info.EditInfoStickerViewModel;
import com.p2082ss.android.ugc.gamora.editor.sticker.poll.AbstractC82957a;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.vesdk.VESize;
import java.io.File;
import java.util.List;
import java.util.Objects;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4620k.AbstractC89286i;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.gamora.editor.h */
public final class C82273h extends AbstractC22219j implements AbstractC20382b, AbstractC21566a, AbstractC82034aa {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f184049a = {new C89232y(C82273h.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0), new C89232y(C82273h.class, "stickerChallengeManager", "getStickerChallengeManager()Lcom/ss/android/ugc/aweme/infoSticker/StickerChallengeManager;", 0), new C89232y(C82273h.class, "lighteningBottomComponent", "getLighteningBottomComponent()Lcom/ss/android/ugc/gamora/editor/lightening/bottom/LighteningBottomComponent;", 0)};

    /* renamed from: j */
    public static final C82279f f184050j = new C82279f((byte) 0);

    /* renamed from: A */
    private final AbstractC89244h f184051A;

    /* renamed from: B */
    private final C21582f f184052B;

    /* renamed from: b */
    final AbstractC89244h f184053b = C89250i.m154774a(EnumC89331m.NONE, new C82275b(this));

    /* renamed from: c */
    final AbstractC89244h f184054c = C89250i.m154774a(EnumC89331m.NONE, new C82276c(this));

    /* renamed from: d */
    public EditCommentStickerViewModel f184055d;

    /* renamed from: e */
    final AbstractC89248d f184056e = C21572a.m40504a(getDiContainer(), C56724i.class);

    /* renamed from: f */
    public ToolSafeHandler f184057f;

    /* renamed from: g */
    public FrameLayout f184058g;

    /* renamed from: h */
    public C1213t<Boolean> f184059h;

    /* renamed from: i */
    public AbstractC78486c<View> f184060i;

    /* renamed from: k */
    private AbstractC14552j f184061k;

    /* renamed from: l */
    private final AbstractC89244h f184062l = C89250i.m154773a((AbstractC89171a) new C82280g(this));

    /* renamed from: t */
    private final AbstractC89244h f184063t = C89250i.m154774a(EnumC89331m.NONE, new C82274a(this));

    /* renamed from: u */
    private final AbstractC89244h f184064u = C89250i.m154774a(EnumC89331m.NONE, new C82277d(this));

    /* renamed from: v */
    private final AbstractC89248d f184065v = C21572a.m40504a(getDiContainer(), VideoPublishEditModel.class);

    /* renamed from: w */
    private final AbstractC89248d f184066w = C21572a.m40505b(getDiContainer(), C82307a.class);

    /* renamed from: x */
    private final AbstractC89244h f184067x;

    /* renamed from: y */
    private Runnable f184068y;

    /* renamed from: z */
    private final AbstractC89244h f184069z;

    static {
        Covode.recordClassIndex(96107);
    }

    /* renamed from: O */
    private final EditStickerViewModel m142306O() {
        return (EditStickerViewModel) this.f184067x.getValue();
    }

    /* renamed from: P */
    private final C14544f m142307P() {
        return (C14544f) this.f184051A.getValue();
    }

    /* renamed from: C */
    public final VideoPublishEditModel mo127432C() {
        return (VideoPublishEditModel) this.f184065v.mo23374a(this, f184049a[0]);
    }

    /* renamed from: D */
    public final C82307a mo127433D() {
        return (C82307a) this.f184066w.mo23374a(this, f184049a[2]);
    }

    /* renamed from: E */
    public final C71065a mo127434E() {
        return (C71065a) this.f184069z.getValue();
    }

    /* renamed from: a */
    public final EditInfoStickerViewModel mo127436a() {
        return (EditInfoStickerViewModel) this.f184062l.getValue();
    }

    /* renamed from: b */
    public final AbstractC46036a mo127437b() {
        return (AbstractC46036a) this.f184063t.getValue();
    }

    /* renamed from: d */
    public final AbstractC72510a mo127438d() {
        return (AbstractC72510a) this.f184064u.getValue();
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.h$f */
    public static final class C82279f {
        static {
            Covode.recordClassIndex(96113);
        }

        private C82279f() {
        }

        public /* synthetic */ C82279f(byte b) {
            this();
        }
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f184052B;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20367ae
    public final /* bridge */ /* synthetic */ AbstractC20477i getReceiver() {
        return this;
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.AbstractC82034aa
    /* renamed from: a */
    public final void mo127270a(String str) {
        C89219l.m154721d(str, "");
        mo127434E().mo112279a(str);
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.AbstractC82034aa
    /* renamed from: a */
    public final void mo127269a(VESize vESize) {
        C89219l.m154721d(vESize, "");
        mo127434E().f159187q = vESize;
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.AbstractC82034aa
    /* renamed from: a */
    public final void mo127271a(boolean z) {
        mo127434E().f159175e = z;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.h$p */
    public static final class RunnableC82290p implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C82273h f184088a;

        /* renamed from: b */
        private int f184089b = -1;

        /* renamed from: c */
        private Runnable f184090c = new RunnableC82291a(this);

        static {
            Covode.recordClassIndex(96124);
        }

        /* renamed from: com.ss.android.ugc.gamora.editor.h$p$a */
        static final class RunnableC82291a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ RunnableC82290p f184091a;

            static {
                Covode.recordClassIndex(96125);
            }

            RunnableC82291a(RunnableC82290p pVar) {
                this.f184091a = pVar;
            }

            public final void run() {
                int i = Build.VERSION.SDK_INT;
            }
        }

        public final void run() {
            int k;
            Runnable runnable = this.f184090c;
            if (runnable != null) {
                runnable.run();
                this.f184090c = null;
            }
            C82273h.m142308a(this.f184088a).postDelayed(this, 16);
            AbstractC31071f value = this.f184088a.mo127438d().mo114778C().getValue();
            if (value != null && this.f184088a.mo127434E().f159182l != null && (k = value.mo56370k()) != this.f184089b) {
                this.f184089b = k;
                C71065a E = this.f184088a.mo127434E();
                long j = (long) k;
                if (E.f159182l instanceof C71069d) {
                    ((C71069d) E.f159182l).setPlayPosition(j);
                    if (E.f159154c) {
                        ((C71069d) E.f159182l).mo112293s();
                    } else {
                        ((C71069d) E.f159182l).mo112298t();
                    }
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        RunnableC82290p(C82273h hVar) {
            this.f184088a = hVar;
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.AbstractC82034aa
    /* renamed from: G */
    public final void mo127256G() {
        mo127434E().mo112285d();
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.AbstractC82034aa
    /* renamed from: I */
    public final void mo127258I() {
        mo127434E().mo112321k();
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.AbstractC82034aa
    /* renamed from: J */
    public final void mo127259J() {
        mo127434E().mo112324n();
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.AbstractC82034aa
    /* renamed from: L */
    public final AbstractC45898d mo127261L() {
        return mo127434E();
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

    /* renamed from: com.ss.android.ugc.gamora.editor.h$a */
    public static final class C82274a extends AbstractC89220m implements AbstractC89171a<AbstractC46036a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f184070a;

        static {
            Covode.recordClassIndex(96108);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82274a(AbstractC21566a aVar) {
            super(0);
            this.f184070a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.editSticker.text.als.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.editSticker.text.als.AbstractC46036a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f184070a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.editSticker.text.als.a> r1 = com.p2082ss.android.ugc.aweme.editSticker.text.als.AbstractC46036a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.C82273h.C82274a.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.h$b */
    public static final class C82275b extends AbstractC89220m implements AbstractC89171a<AbstractC82957a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f184071a;

        static {
            Covode.recordClassIndex(96109);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82275b(AbstractC21566a aVar) {
            super(0);
            this.f184071a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.gamora.editor.sticker.poll.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.sticker.poll.AbstractC82957a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f184071a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.sticker.poll.a> r1 = com.p2082ss.android.ugc.gamora.editor.sticker.poll.AbstractC82957a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.C82273h.C82275b.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.h$c */
    public static final class C82276c extends AbstractC89220m implements AbstractC89171a<AbstractC82814a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f184072a;

        static {
            Covode.recordClassIndex(96110);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82276c(AbstractC21566a aVar) {
            super(0);
            this.f184072a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.gamora.editor.sticker.duet.a, com.bytedance.als.b] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.sticker.duet.AbstractC82814a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f184072a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.sticker.duet.a> r1 = com.p2082ss.android.ugc.gamora.editor.sticker.duet.AbstractC82814a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.C82273h.C82276c.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.h$d */
    public static final class C82277d extends AbstractC89220m implements AbstractC89171a<AbstractC72510a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f184073a;

        static {
            Covode.recordClassIndex(96111);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82277d(AbstractC21566a aVar) {
            super(0);
            this.f184073a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.shortvideo.preview.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f184073a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.preview.a> r1 = com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.C82273h.C82277d.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.h$i */
    public static final class C82282i implements AbstractC71087a {

        /* renamed from: a */
        final /* synthetic */ C82273h f184080a;

        static {
            Covode.recordClassIndex(96116);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3816c.AbstractC71087a
        /* renamed from: a */
        public final void mo112336a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3816c.AbstractC71087a
        /* renamed from: b */
        public final void mo112339b() {
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3816c.AbstractC71087a
        /* renamed from: c */
        public final void mo112341c() {
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3816c.AbstractC71087a
        /* renamed from: f */
        public final void mo112344f() {
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3816c.AbstractC71087a
        /* renamed from: e */
        public final void mo112343e() {
            this.f184080a.mo127432C().isCommentDeleted = false;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3816c.AbstractC71087a
        /* renamed from: d */
        public final void mo112342d() {
            if (this.f184080a.mo127434E().mo112283b()) {
                if (this.f184080a.mo127432C().commentVideoModel.isCommentFromPanel()) {
                    this.f184080a.f184059h.setValue(true);
                }
                C82273h hVar = this.f184080a;
                ((C56724i) hVar.f184056e.mo23374a(hVar, C82273h.f184049a[1])).mo93672a(this.f184080a.mo127434E().f159153b);
                this.f184080a.mo127432C().isCommentDeleted = true;
                C80322d.m139251a("prop_delete", new C84425b().mo129406a("shoot_way", "comment_reply").mo129406a("sticker_type", "comment_reply").f188764a);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C82282i(C82273h hVar) {
            this.f184080a = hVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3816c.AbstractC71087a
        /* renamed from: a */
        public final void mo112337a(View view) {
            C89219l.m154721d(view, "");
            EditCommentStickerViewModel editCommentStickerViewModel = this.f184080a.f184055d;
            if (editCommentStickerViewModel == null) {
                C89219l.m154710a("editCommentStickerViewModel");
            }
            editCommentStickerViewModel.mo127203b(true);
            if (this.f184080a.f184060i != null) {
                AbstractC78486c<View> cVar = this.f184080a.f184060i;
                if (cVar == null) {
                    C89219l.m154715b();
                }
                cVar.mo87979a(view);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3816c.AbstractC71087a
        /* renamed from: b */
        public final void mo112340b(boolean z) {
            if (z) {
                this.f184080a.mo127436a().mo127929i();
                ((AbstractC82957a) this.f184080a.f184053b.getValue()).mo128021b();
                ((AbstractC82814a) this.f184080a.f184054c.getValue()).mo127882b();
                this.f184080a.mo127437b().mo77639n();
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3816c.AbstractC71087a
        /* renamed from: a */
        public final void mo112338a(boolean z) {
            this.f184080a.mo127436a().mo127929i();
            this.f184080a.mo127437b().mo77639n();
            if (!z || this.f184080a.mo127262M()) {
                this.f184080a.mo127438d().mo114805a((AbstractC72510a) false, true, false);
            } else {
                this.f184080a.mo127438d().mo114805a((AbstractC72510a) true, true, true);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.h$q */
    static final class C82293q extends AbstractC89220m implements AbstractC89171a<C14544f> {

        /* renamed from: a */
        final /* synthetic */ C82273h f184093a;

        static {
            Covode.recordClassIndex(96127);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82293q(C82273h hVar) {
            super(0);
            this.f184093a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C14544f invoke() {
            return new C14544f(300, this.f184093a.mo127434E().f159188r);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.h$s */
    static final class C82295s extends AbstractC89220m implements AbstractC89171a<C71065a> {

        /* renamed from: a */
        final /* synthetic */ C82273h f184095a;

        static {
            Covode.recordClassIndex(96129);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82295s(C82273h hVar) {
            super(0);
            this.f184095a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C71065a invoke() {
            return new C71065a(this.f184095a.mo127432C());
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.AbstractC82034aa
    /* renamed from: H */
    public final InteractStickerStruct mo127257H() {
        return mo127434E().mo112284c();
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.AbstractC82034aa
    /* renamed from: K */
    public final boolean mo127260K() {
        return mo127434E().mo112283b();
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.AbstractC82034aa
    /* renamed from: N */
    public final void mo127263N() {
        this.f184059h.setValue(false);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.h$g */
    static final class C82280g extends AbstractC89220m implements AbstractC89171a<EditInfoStickerViewModel> {

        /* renamed from: a */
        final /* synthetic */ C82273h f184077a;

        static {
            Covode.recordClassIndex(96114);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82280g(C82273h hVar) {
            super(0);
            this.f184077a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ EditInfoStickerViewModel invoke() {
            Activity activity = this.f184077a.f52549m;
            Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            JediViewModel a = C20531t.m38716a((ActivityC0945e) activity).mo33800a(EditInfoStickerViewModel.class);
            C89219l.m154716b(a, "");
            return a;
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.AbstractC82034aa
    /* renamed from: M */
    public final boolean mo127262M() {
        EditCommentStickerViewModel editCommentStickerViewModel = this.f184055d;
        if (editCommentStickerViewModel == null) {
            C89219l.m154710a("editCommentStickerViewModel");
        }
        return ((EditCommentStickerState) editCommentStickerViewModel.mo33676a(getLifecycleOwner())).getInTimeEditView();
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: n_ */
    public final void mo22713n_() {
        super.mo22713n_();
        AbstractC14552j jVar = this.f184061k;
        if (jVar == null) {
            C89219l.m154710a("gestureService");
        }
        jVar.mo23385b(m142307P());
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: w */
    public final void mo36490w() {
        super.mo36490w();
        if (this.f184057f == null) {
            C89219l.m154710a("safeHandler");
        } else if (this.f184068y == null) {
            C89219l.m154710a("mNonInfoStickerPlayingRefreshTask");
        } else {
            ToolSafeHandler toolSafeHandler = this.f184057f;
            if (toolSafeHandler == null) {
                C89219l.m154710a("safeHandler");
            }
            Runnable runnable = this.f184068y;
            if (runnable == null) {
                C89219l.m154710a("mNonInfoStickerPlayingRefreshTask");
            }
            toolSafeHandler.postDelayed(runnable, 200);
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: x */
    public final void mo36491x() {
        super.mo36491x();
        if (this.f184057f == null) {
            C89219l.m154710a("safeHandler");
        } else if (this.f184068y == null) {
            C89219l.m154710a("mNonInfoStickerPlayingRefreshTask");
        } else {
            ToolSafeHandler toolSafeHandler = this.f184057f;
            if (toolSafeHandler == null) {
                C89219l.m154710a("safeHandler");
            }
            Runnable runnable = this.f184068y;
            if (runnable == null) {
                C89219l.m154710a("mNonInfoStickerPlayingRefreshTask");
            }
            toolSafeHandler.removeCallbacks(runnable);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.h$e */
    public static final class C82278e extends AbstractC89220m implements AbstractC89171a<EditStickerViewModel> {

        /* renamed from: a */
        final /* synthetic */ AbstractC22219j f184074a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f184075b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f184076c;

        static {
            Covode.recordClassIndex(96112);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82278e(AbstractC22219j jVar, AbstractC89277c cVar, AbstractC89277c cVar2) {
            super(0);
            this.f184074a = jVar;
            this.f184075b = cVar;
            this.f184076c = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel] */
        /* JADX WARN: Type inference failed for: r0v15, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel] */
        /* JADX WARNING: Unknown variable types count: 2 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel invoke() {
            /*
                r6 = this;
                com.bytedance.scene.j r0 = r6.f184074a
                com.bytedance.scene.j r5 = r0.f52551o
                h.k.c r0 = r6.f184076c
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                java.lang.String r3 = r0.getCanonicalName()
                java.lang.String r4 = ""
                p4600h.p4611f.p4613b.C89219l.m154716b(r3, r4)
            L_0x0013:
                if (r5 == 0) goto L_0x003a
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ad r2 = com.bytedance.scene.C22267s.m41934a(r5, r0)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.f184076c     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)     // Catch:{ as -> 0x0035 }
                java.lang.String r1 = r0.getCanonicalName()     // Catch:{ as -> 0x0035 }
                p4600h.p4611f.p4613b.C89219l.m154716b(r1, r4)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.f184075b     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ac r0 = m142340x97ed4318(r2, r1, r0)     // Catch:{ as -> 0x0035 }
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0     // Catch:{ as -> 0x0035 }
                goto L_0x0038
            L_0x0035:
                com.bytedance.scene.j r5 = r5.f52551o
                goto L_0x0013
            L_0x0038:
                if (r0 != 0) goto L_0x0052
            L_0x003a:
                com.bytedance.scene.j r0 = r6.f184074a
                androidx.fragment.app.e r1 = com.bytedance.scene.ktx.C22228c.m41832b(r0)
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a
                androidx.lifecycle.ad r1 = androidx.lifecycle.C1181ae.m3881a(r1, r0)
                h.k.c r0 = r6.f184075b
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                androidx.lifecycle.ac r0 = m142340x97ed4318(r1, r3, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0052:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.C82273h.C82278e.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_gamora_editor_EditCommentStickerScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m142340x97ed4318(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.AbstractC82034aa
    /* renamed from: F */
    public final void mo127255F() {
        mo127434E().mo112306a(mo127438d().mo114778C().getValue(), mo127438d());
        List<InteractStickerStruct> a = C71073b.m125565a(mo127432C().getMainBusinessContext(), 2, EnumC71088d.TRACK_PAGE_EDIT);
        if (a == null || a.isEmpty() || mo127432C().commentVideoModel == null) {
            List<InteractStickerStruct> a2 = C71073b.m125565a(mo127432C().getMainBusinessContext(), 5, EnumC71088d.TRACK_PAGE_EDIT);
            if (a2 != null && !a2.isEmpty() && mo127432C().commentVideoModel != null) {
                mo127434E().mo112278a(a2.get(0), mo127432C().commentVideoModel);
                return;
            }
            return;
        }
        mo127434E().mo112278a(a.get(0), mo127432C().commentVideoModel);
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.AbstractC82034aa
    /* renamed from: a */
    public final void mo127264a(AbstractC14552j jVar) {
        C89219l.m154721d(jVar, "");
        this.f184061k = jVar;
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.AbstractC82034aa
    /* renamed from: b */
    public final void mo127273b(boolean z) {
        mo127434E().f159154c = z;
    }

    /* renamed from: a */
    public static final /* synthetic */ ToolSafeHandler m142308a(C82273h hVar) {
        ToolSafeHandler toolSafeHandler = hVar.f184057f;
        if (toolSafeHandler == null) {
            C89219l.m154710a("safeHandler");
        }
        return toolSafeHandler;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af> S1 getState(VM1 vm1) {
        C89219l.m154721d(vm1, "");
        return (S1) AbstractC20382b.C20383a.m38582a(this, vm1);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.h$k */
    static final class C82284k<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C82273h f184082a;

        static {
            Covode.recordClassIndex(96118);
        }

        C82284k(C82273h hVar) {
            this.f184082a = hVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Float f = (Float) obj;
            if (f != null) {
                this.f184082a.mo127434E().mo112305a(f.floatValue());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.h$l */
    static final class C82285l<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C82273h f184083a;

        static {
            Covode.recordClassIndex(96119);
        }

        C82285l(C82273h hVar) {
            this.f184083a = hVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            AbstractC31071f fVar = (AbstractC31071f) obj;
            if (fVar != null) {
                this.f184083a.mo127434E().mo112306a(fVar, this.f184083a.mo127438d());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.h$r */
    static final class C82294r<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C82273h f184094a;

        static {
            Covode.recordClassIndex(96128);
        }

        C82294r(C82273h hVar) {
            this.f184094a = hVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            EditCommentStickerViewModel editCommentStickerViewModel = this.f184094a.f184055d;
            if (editCommentStickerViewModel == null) {
                C89219l.m154710a("editCommentStickerViewModel");
            }
            if (bool == null) {
                C89219l.m154715b();
            }
            editCommentStickerViewModel.mo127203b(bool.booleanValue());
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.AbstractC82034aa
    /* renamed from: b */
    public final void mo127272b(String str) {
        C89219l.m154721d(str, "");
        mo127434E().f159153b = str;
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.AbstractC82034aa
    /* renamed from: a */
    public final void mo127266a(AbstractC45899e eVar) {
        C89219l.m154721d(eVar, "");
        mo127434E().f159176f = eVar;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.h$h */
    static final class C82281h<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ AbstractC31071f f184078a;

        /* renamed from: b */
        final /* synthetic */ AbstractC82035ab f184079b;

        static {
            Covode.recordClassIndex(96115);
        }

        C82281h(AbstractC31071f fVar, AbstractC82035ab abVar) {
            this.f184078a = fVar;
            this.f184079b = abVar;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            CommentVideoModel commentVideoModel;
            int i;
            C89219l.m154716b(iVar, "");
            C71076a aVar = (C71076a) iVar.mo5545d();
            if (aVar != null) {
                C72864a aVar2 = aVar.f159169a;
                if (aVar2 != null) {
                    commentVideoModel = aVar2.f163494a;
                } else {
                    commentVideoModel = null;
                }
                int j = this.f184078a.mo56368j();
                if (commentVideoModel == null || !commentVideoModel.hasTimeData()) {
                    i = 0;
                } else {
                    i = commentVideoModel.getStartTime();
                    j = commentVideoModel.getEndTime();
                }
                StickerItemModel stickerItemModel = new StickerItemModel(UGCMonitor.EVENT_COMMENT, aVar.stickerPath, "", aVar.index, false, i, j, 4);
                stickerItemModel.isImageStickerLayer = true;
                this.f184079b.mo87638a(stickerItemModel);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.h$n */
    static final class C82288n<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C82273h f184086a;

        static {
            Covode.recordClassIndex(96122);
        }

        C82288n(C82273h hVar) {
            this.f184086a = hVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            boolean z;
            Boolean bool = (Boolean) obj;
            C89219l.m154716b(bool, "");
            if (bool.booleanValue()) {
                C82307a D = this.f184086a.mo127433D();
                if (D != null) {
                    C2564l<Boolean> lVar = D.f184115d;
                    if (C82306a.m142362c(D.mo127443b()) || D.mo127443b().hasQaSticker.booleanValue()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    lVar.mo7019b(Boolean.valueOf(z));
                    return;
                }
                return;
            }
            C82307a D2 = this.f184086a.mo127433D();
            if (D2 != null) {
                D2.mo127447f();
            }
        }
    }

    public C82273h(C21582f fVar) {
        C89219l.m154721d(fVar, "");
        this.f184052B = fVar;
        AbstractC89277c a = C89204ab.m154669a(EditStickerViewModel.class);
        this.f184067x = C89250i.m154773a((AbstractC89171a) new C82278e(this, a, a));
        this.f184059h = new C1213t<>();
        this.f184069z = C89250i.m154773a((AbstractC89171a) new C82295s(this));
        this.f184051A = C89250i.m154773a((AbstractC89171a) new C82293q(this));
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo22704a(Bundle bundle) {
        super.mo22704a(bundle);
        Activity activity = this.f52549m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a = C20531t.m38716a((ActivityC0945e) activity).mo33800a(EditCommentStickerViewModel.class);
        C89219l.m154716b(a, "");
        EditCommentStickerViewModel editCommentStickerViewModel = (EditCommentStickerViewModel) a;
        this.f184055d = editCommentStickerViewModel;
        if (editCommentStickerViewModel == null) {
            C89219l.m154710a("editCommentStickerViewModel");
        } else {
            AbstractC20382b.C20383a.m38603b(this, editCommentStickerViewModel, C82296i.f184096a, new C82283j(this));
        }
        EditCommentStickerViewModel editCommentStickerViewModel2 = this.f184055d;
        if (editCommentStickerViewModel2 == null) {
            C89219l.m154710a("editCommentStickerViewModel");
        } else {
            C1213t<Float> b = editCommentStickerViewModel2.mo127202b();
            if (b != null) {
                b.observe(this, new C82284k(this));
            }
        }
        mo127438d().mo114778C().observe(this, new C82285l(this));
        selectNonNullSubscribe(m142306O(), C82297j.f184097a, new C20370ah(), new C82286m(this));
        this.f184059h.observe(this, new C82288n(this));
        EditCommentStickerViewModel editCommentStickerViewModel3 = this.f184055d;
        if (editCommentStickerViewModel3 == null) {
            C89219l.m154710a("editCommentStickerViewModel");
        }
        AbstractC20382b.C20383a.m38603b(this, editCommentStickerViewModel3, C82298k.f184098a, new C82289o(this));
        mo127434E().f159184n = new C82282i(this);
        m142306O().mo127691n().observe(this, new C82294r(this));
        EditCommentStickerViewModel editCommentStickerViewModel4 = this.f184055d;
        if (editCommentStickerViewModel4 == null) {
            C89219l.m154710a("editCommentStickerViewModel");
        }
        C1213t<Boolean> n = m142306O().mo127691n();
        C89219l.m154721d(n, "");
        editCommentStickerViewModel4.f183542a = n;
        Activity activity2 = this.f52549m;
        Objects.requireNonNull(activity2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        this.f184057f = new ToolSafeHandler((ActivityC0945e) activity2);
        this.f184068y = new RunnableC82290p(this);
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.AbstractC82034aa
    /* renamed from: a */
    public final void mo127267a(AbstractC78484a<C45922g, C45922g> aVar) {
        C89219l.m154721d(aVar, "");
        mo127434E().f159195y = aVar;
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.AbstractC82034aa
    /* renamed from: a */
    public final void mo127268a(AbstractC78486c<View> cVar) {
        C89219l.m154721d(cVar, "");
        this.f184060i = cVar;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20382b.C20383a.m38593a(this, vm1, bVar);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.h$j */
    static final class C82283j extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82273h f184081a;

        static {
            Covode.recordClassIndex(96117);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82283j(C82273h hVar) {
            super(2);
            this.f184081a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C89391z zVar) {
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(zVar, "");
            this.f184081a.mo127434E().mo112324n();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.h$o */
    static final class C82289o extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82273h f184087a;

        static {
            Covode.recordClassIndex(96123);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82289o(C82273h hVar) {
            super(2);
            this.f184087a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C89391z zVar) {
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(zVar, "");
            this.f184087a.mo127434E().mo112285d();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.h$m */
    static final class C82286m extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C20521k, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82273h f184084a;

        static {
            Covode.recordClassIndex(96120);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82286m(C82273h hVar) {
            super(2);
            this.f184084a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C20521k kVar) {
            C20521k kVar2 = kVar;
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(kVar2, "");
            boolean booleanValue = kVar2.f48283b.booleanValue();
            this.f184084a.mo127434E().f159194x = !booleanValue;
            if (booleanValue) {
                this.f184084a.mo127434E().mo112307a(new AbstractC45857b(this) {
                    /* class com.p2082ss.android.ugc.gamora.editor.C82273h.C82286m.C822871 */

                    /* renamed from: a */
                    final /* synthetic */ C82286m f184085a;

                    static {
                        Covode.recordClassIndex(96121);
                    }

                    @Override // com.p2082ss.android.ugc.aweme.editSticker.p2879c.AbstractC45857b
                    /* renamed from: a */
                    public final boolean mo77208a() {
                        this.f184085a.f184084a.mo127434E().mo112319i();
                        return true;
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f184085a = r1;
                    }
                });
            } else {
                this.f184084a.mo127434E().mo112307a(C45856a.f106824a);
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        MethodCollector.m26663i(12406);
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        FrameLayout frameLayout = (FrameLayout) viewGroup;
        mo127434E().f159189s = false;
        AbstractC31071f value = mo127438d().mo114778C().getValue();
        if (value != null) {
            mo127434E().f159187q = value.mo56330b();
            mo127434E().mo112276a(this.f52549m, frameLayout);
            AbstractC14552j jVar = this.f184061k;
            if (jVar == null) {
                C89219l.m154710a("gestureService");
            }
            jVar.mo23383a(m142307P());
        }
        this.f184058g = frameLayout;
        View view = new View(frameLayout.getContext());
        MethodCollector.m26664o(12406);
        return view;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af> AbstractC88412b subscribe(JediViewModel<S> jediViewModel, C20370ah<S> ahVar, AbstractC89183m<? super AbstractC20477i, ? super S, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20382b.C20383a.m38583a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.AbstractC82581b
    /* renamed from: a */
    public final C1731i<C89391z> mo127435a(AbstractC31071f fVar, AbstractC82035ab abVar, AbstractC89172b<? super String, String> bVar) {
        String str;
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(abVar, "");
        if (mo127434E().mo112283b()) {
            if (bVar == null || (str = bVar.invoke("comment_sticker")) == null) {
                str = mo127434E().mo112326p();
                C89219l.m154716b(str, "");
            }
            int a = abVar.mo87631T().mo112106a();
            int b = abVar.mo87631T().mo112109b();
            int i = fVar.mo56330b().width;
            int i2 = fVar.mo56330b().height;
            C89219l.m154721d(str, "");
            C71065a E = mo127434E();
            if (E.f159182l instanceof C71069d) {
                ((C71069d) E.f159182l).mo112293s();
            }
            C1731i<TContinuationResult> c = E.mo112304a(str, a, b, i, i2).mo5542c(new C71068c(E));
            C89219l.m154716b(c, "");
            C1731i<TContinuationResult> c2 = c.mo5543c(new C82281h(fVar, abVar), C1731i.f5564c);
            C89219l.m154716b(c2, "");
            return c2;
        }
        C1731i<C89391z> a2 = C1731i.m5633a((Object) null);
        C89219l.m154716b(a2, "");
        return a2;
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.AbstractC82034aa
    /* renamed from: a */
    public final void mo127265a(CommentVideoModel commentVideoModel, boolean z, boolean z2) {
        C89219l.m154721d(commentVideoModel, "");
        IEffectPlatformFactory a = EffectPlatformFactory.m89604a();
        EffectPlatformBuilder context = new EffectPlatformBuilder().setContext(mo36483q());
        C89219l.m154716b(context, "");
        EffectConfiguration build = a.createEffectConfigurationBuilder(context).build();
        mo127434E().mo112306a(mo127438d().mo114778C().getValue(), mo127438d());
        C71065a E = mo127434E();
        StringBuilder sb = new StringBuilder();
        C89219l.m154716b(build, "");
        File effectDir = build.getEffectDir();
        C89219l.m154716b(effectDir, "");
        E.mo112279a(sb.append(effectDir.getAbsolutePath()).append("/comment_sticker").toString());
        mo127434E().mo112277a(commentVideoModel, z, z2);
        C71065a E2 = mo127434E();
        if (E2.f159182l instanceof C71069d) {
            ((C71069d) E2.f159182l).mo112290a(E2.f159152a, (AbstractC81787c) null);
        }
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
