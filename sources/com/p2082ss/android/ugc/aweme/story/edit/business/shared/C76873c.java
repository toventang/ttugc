package com.p2082ss.android.ugc.aweme.story.edit.business.shared;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.AbstractC1214u;
import com.C1764a;
import com.bytedance.als.AlsLogicContainer;
import com.bytedance.als.dsl.C2551b;
import com.bytedance.als.dsl.C2552c;
import com.bytedance.als.dsl.C2553d;
import com.bytedance.als.dsl.C2556g;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.AbstractC21603p;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.C21597n;
import com.bytedance.p1559o.p1561b.C21572a;
import com.bytedance.p969f.p970a.p971a.AbstractC14552j;
import com.bytedance.scene.group.AbstractC22186b;
import com.p2082ss.android.ugc.aweme.commentStickerPanel.CommentAndQuestionAndQuestionStickerPanelViewModel;
import com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45899e;
import com.p2082ss.android.ugc.aweme.effect.EffectPointModel;
import com.p2082ss.android.ugc.aweme.filter.FilterBean;
import com.p2082ss.android.ugc.aweme.filter.p2984d.AbstractC50651a;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50703k;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.p2987a.C50691c;
import com.p2082ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70968bl;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.p3850p.C72477c;
import com.p2082ss.android.ugc.aweme.shortvideo.p3850p.C72479d;
import com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a;
import com.p2082ss.android.ugc.aweme.story.edit.C76748b;
import com.p2082ss.android.ugc.aweme.story.edit.C77138d;
import com.p2082ss.android.ugc.aweme.story.edit.business.p4030a.AbstractC76833b;
import com.p2082ss.android.ugc.aweme.story.edit.business.p4030a.C76834c;
import com.p2082ss.android.ugc.aweme.story.edit.business.shared.effect.AbstractC76981a;
import com.p2082ss.android.ugc.aweme.story.edit.business.shared.effect.C76982b;
import com.p2082ss.android.ugc.aweme.story.edit.business.shared.effect.StoryEditEffectPanelViewModel;
import com.p2082ss.android.ugc.aweme.story.edit.business.shared.p4032a.AbstractC76842a;
import com.p2082ss.android.ugc.aweme.story.edit.business.shared.p4032a.C76843b;
import com.p2082ss.android.ugc.aweme.story.edit.business.shared.p4033b.p4034a.AbstractC76855a;
import com.p2082ss.android.ugc.aweme.story.edit.business.shared.p4033b.p4034a.C76856b;
import com.p2082ss.android.ugc.aweme.story.edit.business.shared.p4033b.p4035b.AbstractC76863a;
import com.p2082ss.android.ugc.aweme.story.edit.business.shared.p4033b.p4035b.C76864b;
import com.p2082ss.android.ugc.aweme.story.edit.business.shared.p4036c.C76913a;
import com.p2082ss.android.ugc.aweme.story.edit.business.shared.p4038e.p4039a.C76969a;
import com.p2082ss.android.ugc.aweme.story.edit.business.shared.p4040f.AbstractC77024e;
import com.p2082ss.android.ugc.aweme.story.edit.business.shared.p4040f.C77025f;
import com.p2082ss.android.ugc.aweme.story.edit.business.shared.toolbar.AbstractC77066d;
import com.p2082ss.android.ugc.aweme.story.edit.business.shared.toolbar.C77067e;
import com.p2082ss.android.ugc.aweme.story.edit.business.shared.toolbar.C77092n;
import com.p2082ss.android.ugc.aweme.story.edit.business.shared.toolbar.StoryEditToolbarViewModel;
import com.p2082ss.android.ugc.aweme.story.edit.canvas.C77114b;
import com.p2082ss.android.ugc.aweme.story.edit.canvas.EditPhotoCanvasViewModel;
import com.p2082ss.android.ugc.aweme.story.edit.clip.impl.AbstractC77135b;
import com.p2082ss.android.ugc.aweme.story.edit.clip.impl.C77134a;
import com.p2082ss.android.ugc.aweme.story.edit.clip.impl.VEEditClip;
import com.p2082ss.android.ugc.aweme.story.edit.clip.impl.VEEditClipCluster;
import com.p2082ss.android.ugc.aweme.story.edit.clip.p4042a.C77118b;
import com.p2082ss.android.ugc.aweme.story.edit.model.C77148a;
import com.p2082ss.android.ugc.aweme.story.edit.model.StoryEditClipModel;
import com.p2082ss.android.ugc.aweme.story.edit.model.StoryEditModel;
import com.p2082ss.android.ugc.aweme.story.edit.p4029b.AbstractC76760e;
import com.p2082ss.android.ugc.gamora.editor.AbstractC82563s;
import com.p2082ss.android.ugc.gamora.editor.C83386w;
import com.p2082ss.android.ugc.gamora.editor.cutmusic.C82105b;
import com.p2082ss.android.ugc.gamora.editor.cutmusic.EditMusicCutViewModel;
import com.p2082ss.android.ugc.gamora.editor.filter.core.AbstractC82208b;
import com.p2082ss.android.ugc.gamora.editor.filter.indicator.AbstractC82237a;
import com.p2082ss.android.ugc.gamora.editor.filter.indicator.C82239b;
import com.p2082ss.android.ugc.gamora.editor.filter.indicator.EditFilterIndicatorViewModel;
import com.p2082ss.android.ugc.gamora.editor.music.AbstractC82427a;
import com.p2082ss.android.ugc.gamora.editor.music.EditMusicViewModel;
import com.p2082ss.android.ugc.gamora.editor.sticker.core.AbstractC82610a;
import com.p2082ss.android.ugc.gamora.editor.sticker.p4286a.C82566a;
import com.p2082ss.android.ugc.gamora.editor.sticker.panel.AbstractC82905a;
import com.p2082ss.android.ugc.gamora.editor.sticker.panel.EditStickerPanelViewModel;
import com.p2082ss.android.ugc.gamora.editor.toolbar.AbstractC83251y;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89386u;
import p4600h.C89391z;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.c */
public final class C76873c extends AbstractC22186b implements AbstractC21566a, AbstractC77135b, AbstractC82563s {

    /* renamed from: b */
    static final /* synthetic */ AbstractC89286i[] f172516b = {new C89232y(C76873c.class, "editStickerApi", "getEditStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/EditStickerApi;", 0), new C89232y(C76873c.class, "filterService", "getFilterService()Lcom/ss/android/ugc/aweme/filter/services/IFilterComponentService;", 0), new C89232y(C76873c.class, "gestureService", "getGestureService()Lcom/bytedance/createx/editor/gesture/IGestureService;", 0), new C89232y(C76873c.class, "clipCluster", "getClipCluster()Lcom/ss/android/ugc/aweme/story/edit/clip/impl/VEEditClipCluster;", 0), new C89232y(C76873c.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/story/edit/model/StoryEditModel;", 0), new C89232y(C76873c.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0)};

    /* renamed from: i */
    public static final C76897l f172517i = new C76897l((byte) 0);

    /* renamed from: A */
    private final AbstractC89244h f172518A;

    /* renamed from: B */
    private final C21582f f172519B;

    /* renamed from: c */
    final AbstractC89244h f172520c = C89250i.m154774a(EnumC89331m.NONE, new C76887b(this));

    /* renamed from: d */
    final AbstractC89244h f172521d = C89250i.m154774a(EnumC89331m.NONE, new C76888c(this));

    /* renamed from: e */
    final AbstractC89244h f172522e = C89250i.m154774a(EnumC89331m.NONE, new C76891f(this));

    /* renamed from: f */
    final AbstractC89244h f172523f = C89250i.m154774a(EnumC89331m.NONE, new C76893h(this));

    /* renamed from: g */
    final AbstractC89244h f172524g = C89250i.m154773a((AbstractC89171a) new C76886aj(this));

    /* renamed from: h */
    final AbstractC89244h f172525h;

    /* renamed from: j */
    private final AbstractC89244h f172526j = C89250i.m154774a(EnumC89331m.NONE, new C76874a(this));

    /* renamed from: k */
    private final AbstractC89244h f172527k = C89250i.m154774a(EnumC89331m.NONE, new C76889d(this));

    /* renamed from: l */
    private final AbstractC89248d f172528l = new C76896k(this);

    /* renamed from: t */
    private final AbstractC89244h f172529t = C89250i.m154774a(EnumC89331m.NONE, new C76890e(this));

    /* renamed from: u */
    private final AbstractC89244h f172530u = C89250i.m154774a(EnumC89331m.NONE, new C76892g(this));

    /* renamed from: v */
    private final AbstractC89248d f172531v;

    /* renamed from: w */
    private final AbstractC89248d f172532w;

    /* renamed from: x */
    private final AbstractC89248d f172533x;

    /* renamed from: y */
    private final AbstractC89248d f172534y;

    /* renamed from: z */
    private final AbstractC89248d f172535z;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.c$s */
    public static final class DialogInterface$OnClickListenerC76904s implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC76904s f172572a = new DialogInterface$OnClickListenerC76904s();

        static {
            Covode.recordClassIndex(89900);
        }

        DialogInterface$OnClickListenerC76904s() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.c$u */
    public static final class DialogInterface$OnClickListenerC76906u implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC76906u f172574a = new DialogInterface$OnClickListenerC76906u();

        static {
            Covode.recordClassIndex(89902);
        }

        DialogInterface$OnClickListenerC76906u() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    static {
        Covode.recordClassIndex(89869);
    }

    /* renamed from: F */
    public final AbstractC76760e mo120473F() {
        return (AbstractC76760e) this.f172526j.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public final AbstractC77066d mo120474G() {
        return (AbstractC77066d) this.f172527k.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public final AbstractC82610a mo120475H() {
        return (AbstractC82610a) this.f172528l.mo23374a(this, f172516b[0]);
    }

    /* renamed from: I */
    public final AbstractC82905a mo120476I() {
        return (AbstractC82905a) this.f172529t.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public final AbstractC82427a mo120477J() {
        return (AbstractC82427a) this.f172530u.getValue();
    }

    /* renamed from: K */
    public final AbstractC50651a mo120478K() {
        return (AbstractC50651a) this.f172531v.mo23374a(this, f172516b[1]);
    }

    /* renamed from: L */
    public final AbstractC14552j mo120479L() {
        return (AbstractC14552j) this.f172532w.mo23374a(this, f172516b[2]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public final StoryEditModel mo120480M() {
        return (StoryEditModel) this.f172534y.mo23374a(this, f172516b[4]);
    }

    /* renamed from: N */
    public final VideoPublishEditModel mo120481N() {
        return (VideoPublishEditModel) this.f172535z.mo23374a(this, f172516b[5]);
    }

    /* renamed from: O */
    public final C83386w mo120482O() {
        return (C83386w) this.f172518A.getValue();
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.AbstractC82563s
    /* renamed from: a */
    public final void mo87641a(String str, int i, int i2, int i3, boolean z) {
        C89219l.m154721d(str, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.c$l */
    public static final class C76897l {
        static {
            Covode.recordClassIndex(89893);
        }

        private C76897l() {
        }

        public /* synthetic */ C76897l(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.c$a */
    public static final class C76874a extends AbstractC89220m implements AbstractC89171a<AbstractC76760e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f172536a;

        static {
            Covode.recordClassIndex(89870);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C76874a(AbstractC21566a aVar) {
            super(0);
            this.f172536a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.story.edit.b.e] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.story.edit.p4029b.AbstractC76760e invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f172536a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.story.edit.b.e> r1 = com.p2082ss.android.ugc.aweme.story.edit.p4029b.AbstractC76760e.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.story.edit.business.shared.C76873c.C76874a.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.c$ai */
    static final class C76885ai extends AbstractC89220m implements AbstractC89171a<C83386w> {

        /* renamed from: a */
        final /* synthetic */ C76873c f172554a;

        static {
            Covode.recordClassIndex(89881);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76885ai(C76873c cVar) {
            super(0);
            this.f172554a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C83386w invoke() {
            C83386w wVar = new C83386w();
            this.f172554a.mo36387a(R.id.ase, wVar, "EditStickerDeleteScene");
            return wVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.c$aj */
    static final class C76886aj extends AbstractC89220m implements AbstractC89171a<C77138d> {

        /* renamed from: a */
        final /* synthetic */ C76873c f172555a;

        static {
            Covode.recordClassIndex(89882);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76886aj(C76873c cVar) {
            super(0);
            this.f172555a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C77138d invoke() {
            return new C77138d(this.f172555a.getDiContainer());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.c$b */
    public static final class C76887b extends AbstractC89220m implements AbstractC89171a<AbstractC82237a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f172556a;

        static {
            Covode.recordClassIndex(89883);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C76887b(AbstractC21566a aVar) {
            super(0);
            this.f172556a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.gamora.editor.filter.indicator.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.filter.indicator.AbstractC82237a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f172556a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.filter.indicator.a> r1 = com.p2082ss.android.ugc.gamora.editor.filter.indicator.AbstractC82237a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.story.edit.business.shared.C76873c.C76887b.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.c$c */
    public static final class C76888c extends AbstractC89220m implements AbstractC89171a<AbstractC76863a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f172557a;

        static {
            Covode.recordClassIndex(89884);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C76888c(AbstractC21566a aVar) {
            super(0);
            this.f172557a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.story.edit.business.shared.b.b.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.story.edit.business.shared.p4033b.p4035b.AbstractC76863a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f172557a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.story.edit.business.shared.b.b.a> r1 = com.p2082ss.android.ugc.aweme.story.edit.business.shared.p4033b.p4035b.AbstractC76863a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.story.edit.business.shared.C76873c.C76888c.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.c$d */
    public static final class C76889d extends AbstractC89220m implements AbstractC89171a<AbstractC77066d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f172558a;

        static {
            Covode.recordClassIndex(89885);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C76889d(AbstractC21566a aVar) {
            super(0);
            this.f172558a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.d] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.story.edit.business.shared.toolbar.AbstractC77066d invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f172558a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.d> r1 = com.p2082ss.android.ugc.aweme.story.edit.business.shared.toolbar.AbstractC77066d.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.story.edit.business.shared.C76873c.C76889d.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.c$e */
    public static final class C76890e extends AbstractC89220m implements AbstractC89171a<AbstractC82905a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f172559a;

        static {
            Covode.recordClassIndex(89886);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C76890e(AbstractC21566a aVar) {
            super(0);
            this.f172559a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.gamora.editor.sticker.panel.a, com.bytedance.als.b] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.sticker.panel.AbstractC82905a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f172559a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.sticker.panel.a> r1 = com.p2082ss.android.ugc.gamora.editor.sticker.panel.AbstractC82905a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.story.edit.business.shared.C76873c.C76890e.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.c$f */
    public static final class C76891f extends AbstractC89220m implements AbstractC89171a<AbstractC77024e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f172560a;

        static {
            Covode.recordClassIndex(89887);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C76891f(AbstractC21566a aVar) {
            super(0);
            this.f172560a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.story.edit.business.shared.f.e] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.story.edit.business.shared.p4040f.AbstractC77024e invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f172560a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.story.edit.business.shared.f.e> r1 = com.p2082ss.android.ugc.aweme.story.edit.business.shared.p4040f.AbstractC77024e.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.story.edit.business.shared.C76873c.C76891f.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.c$g */
    public static final class C76892g extends AbstractC89220m implements AbstractC89171a<AbstractC82427a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f172561a;

        static {
            Covode.recordClassIndex(89888);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C76892g(AbstractC21566a aVar) {
            super(0);
            this.f172561a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.gamora.editor.music.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.music.AbstractC82427a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f172561a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.music.a> r1 = com.p2082ss.android.ugc.gamora.editor.music.AbstractC82427a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.story.edit.business.shared.C76873c.C76892g.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.c$h */
    public static final class C76893h extends AbstractC89220m implements AbstractC89171a<AbstractC76981a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f172562a;

        static {
            Covode.recordClassIndex(89889);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C76893h(AbstractC21566a aVar) {
            super(0);
            this.f172562a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.story.edit.business.shared.effect.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.story.edit.business.shared.effect.AbstractC76981a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f172562a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.story.edit.business.shared.effect.a> r1 = com.p2082ss.android.ugc.aweme.story.edit.business.shared.effect.AbstractC76981a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.story.edit.business.shared.C76873c.C76893h.invoke():com.bytedance.als.b");
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.AbstractC82563s
    /* renamed from: X */
    public final void mo87635X() {
        mo120477J().mo127542b(false);
        mo120473F().mo114805a((AbstractC72510a) false, false, false);
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.story.edit.clip.a.h' to match base method */
    @Override // com.p2082ss.android.ugc.aweme.story.edit.clip.p4042a.AbstractC77117a
    public final /* synthetic */ VEEditClipCluster cF_() {
        return (VEEditClipCluster) this.f172533x.mo23374a(this, f172516b[3]);
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        C21582f b = C2552c.m7464b(this);
        if (b == null) {
            C89219l.m154715b();
        }
        return b;
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.c$n */
    static final class C76899n extends AbstractC89220m implements AbstractC89171a<AbstractC50703k> {

        /* renamed from: a */
        final /* synthetic */ C76873c f172567a;

        static {
            Covode.recordClassIndex(89895);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76899n(C76873c cVar) {
            super(0);
            this.f172567a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC50703k invoke() {
            AbstractC50703k value = this.f172567a.mo120473F().mo114823l().getValue();
            if (value == null) {
                C89219l.m154715b();
            }
            return value;
        }
    }

    /* renamed from: Q */
    public final void mo120484Q() {
        C72479d.m127866a(C72477c.f162474a).mo114742d();
        Activity activity = this.f52549m;
        if (activity != null) {
            activity.finish();
        }
        C77148a.m134758c(mo120480M());
    }

    /* renamed from: P */
    public final void mo120483P() {
        ArrayList<EffectPointModel> arrayList;
        if (mo120480M().getOrigin() == 1) {
            new C17197a.C17200a(mo36486t()).mo27189a(R.string.g5n).mo27194b(R.string.g5m).mo27195b(R.string.bc3, (DialogInterface.OnClickListener) DialogInterface$OnClickListenerC76904s.f172572a, false).mo27190a(R.string.b0b, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC76905t(this), false).mo27193a().mo27185c();
            return;
        }
        AbstractC82610a H = mo120475H();
        if ((H == null || !H.mo127683f()) && !mo120481N().hasInfoStickers() && (((arrayList = mo120481N().mEffectList) == null || arrayList.isEmpty()) && !C77148a.m134756b(mo120480M()) && !C77148a.m134754a(mo120480M()))) {
            mo120484Q();
        } else {
            new C17197a.C17200a(mo36486t()).mo27194b(R.string.h8m).mo27195b(R.string.a8y, (DialogInterface.OnClickListener) DialogInterface$OnClickListenerC76906u.f172574a, false).mo27190a(R.string.as0, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC76907v(this), false).mo27193a().mo27185c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.c$ah */
    static final class C76882ah extends AbstractC89220m implements AbstractC89172b<C21597n, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C76873c f172551a;

        static {
            Covode.recordClassIndex(89878);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76882ah(C76873c cVar) {
            super(1);
            this.f172551a = cVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.c$ah$a */
        public static final class C76883a extends AbstractC21603p<C83386w> {

            /* renamed from: a */
            final /* synthetic */ C76882ah f172552a;

            static {
                Covode.recordClassIndex(89879);
            }

            public C76883a(C76882ah ahVar) {
                this.f172552a = ahVar;
            }

            @Override // com.bytedance.p1559o.AbstractC21603p
            public final C83386w get(C21582f fVar) {
                C89219l.m154721d(fVar, "");
                return this.f172552a.f172551a.mo120482O();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.c$ah$b */
        public static final class C76884b extends AbstractC21603p<C76873c> {

            /* renamed from: a */
            final /* synthetic */ C76882ah f172553a;

            static {
                Covode.recordClassIndex(89880);
            }

            public C76884b(C76882ah ahVar) {
                this.f172553a = ahVar;
            }

            @Override // com.bytedance.p1559o.AbstractC21603p
            public final C76873c get(C21582f fVar) {
                C89219l.m154721d(fVar, "");
                return this.f172553a.f172551a;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C21597n nVar) {
            C21597n nVar2 = nVar;
            C89219l.m154721d(nVar2, "");
            C21597n.C21600a a = nVar2.mo35260a(C83386w.class, (String) null, (AbstractC21603p) new C76883a(this));
            C89219l.m154716b(a, "");
            a.mo35263a(AbstractC45899e.class);
            C21597n.C21600a a2 = nVar2.mo35260a(C76873c.class, (String) null, (AbstractC21603p) new C76884b(this));
            C89219l.m154716b(a2, "");
            a2.mo35263a(AbstractC82563s.class);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.c$i */
    public static final class C76894i extends AbstractC21603p<C76856b> {

        /* renamed from: a */
        final /* synthetic */ C2553d f172563a;

        static {
            Covode.recordClassIndex(89890);
        }

        public C76894i(C2553d dVar) {
            this.f172563a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C76856b get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C76856b(fVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.c$j */
    public static final class C76895j extends AbstractC21603p<C77025f> {

        /* renamed from: a */
        final /* synthetic */ C2553d f172564a;

        static {
            Covode.recordClassIndex(89891);
        }

        public C76895j(C2553d dVar) {
            this.f172564a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C77025f get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C77025f(fVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.c$k */
    public static final class C76896k implements AbstractC89248d<Object, AbstractC82610a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f172565a;

        static {
            Covode.recordClassIndex(89892);
        }

        public C76896k(AbstractC21566a aVar) {
            this.f172565a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [com.ss.android.ugc.gamora.editor.sticker.core.a, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4616h.AbstractC89248d
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.sticker.core.AbstractC82610a mo23374a(java.lang.Object r3, p4600h.p4620k.AbstractC89286i<?> r4) {
            /*
                r2 = this;
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154721d(r3, r0)
                p4600h.p4611f.p4613b.C89219l.m154721d(r4, r0)
                com.bytedance.o.a r0 = r2.f172565a
                com.ss.android.ugc.aweme.story.edit.business.a.b r1 = com.p2082ss.android.ugc.aweme.story.edit.business.p4030a.C76814a.m134431a(r0)
                if (r1 == 0) goto L_0x0017
                java.lang.Class<com.ss.android.ugc.gamora.editor.sticker.core.a> r0 = com.p2082ss.android.ugc.gamora.editor.sticker.core.AbstractC82610a.class
                java.lang.Object r0 = r1.mo120461a(r0)
                return r0
            L_0x0017:
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.story.edit.business.shared.C76873c.C76896k.mo23374a(java.lang.Object, h.k.i):java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.c$m */
    public static final class C76898m implements AbstractC82208b {

        /* renamed from: a */
        final /* synthetic */ C76873c f172566a;

        static {
            Covode.recordClassIndex(89894);
        }

        @Override // com.p2082ss.android.ugc.gamora.editor.filter.core.AbstractC82208b
        /* renamed from: a */
        public final void mo88315a(float f) {
        }

        @Override // com.p2082ss.android.ugc.gamora.editor.filter.core.AbstractC82208b
        /* renamed from: a */
        public final void mo88317a(String str) {
            C89219l.m154721d(str, "");
        }

        @Override // com.p2082ss.android.ugc.gamora.editor.filter.core.AbstractC82208b
        /* renamed from: a */
        public final void mo88318a(boolean z, FilterBean filterBean) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C76898m(C76873c cVar) {
            this.f172566a = cVar;
        }

        @Override // com.p2082ss.android.ugc.gamora.editor.filter.core.AbstractC82208b
        /* renamed from: a */
        public final void mo88316a(FilterBean filterBean, boolean z, Context context) {
            StoryEditClipModel d = C77134a.m134739d(this.f172566a);
            if (d == null) {
                return;
            }
            if (filterBean != null) {
                d.setMSelectedFilterIntensity(((AbstractC50703k) this.f172566a.f172525h.getValue()).mo23007a(filterBean));
                d.setSelectFilterIndex(C50691c.m94985a(this.f172566a.mo120478K().mo86006d().mo86071f(), filterBean));
                d.setMCurFilterLabels(filterBean.getEnName());
                d.setMSelectedFilterId(String.valueOf(filterBean.getId()));
                d.setMSelectedFilterLabel(filterBean.getEnName());
                d.setMSelectedFilterResId(filterBean.getResId());
                C70968bl.m125259a(this.f172566a.mo120481N(), "slide", filterBean.getEnName(), filterBean.getId());
                return;
            }
            d.setSelectFilterIndex(0);
            d.setMSelectedFilterId("");
            d.setMSelectedFilterLabel("");
            d.setMSelectedFilterResId("");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.c$ac */
    public static final class C76877ac extends AbstractC21603p<C76864b> {

        /* renamed from: a */
        final /* synthetic */ C2553d f172541a;

        /* renamed from: b */
        final /* synthetic */ C76873c f172542b;

        static {
            Covode.recordClassIndex(89873);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C76864b get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C76864b(fVar, this.f172542b);
        }

        public C76877ac(C2553d dVar, C76873c cVar) {
            this.f172541a = dVar;
            this.f172542b = cVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.c$ad */
    public static final class C76878ad extends AbstractC21603p<C82105b> {

        /* renamed from: a */
        final /* synthetic */ C2553d f172543a;

        /* renamed from: b */
        final /* synthetic */ C76873c f172544b;

        static {
            Covode.recordClassIndex(89874);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C82105b get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C82105b(fVar, this.f172544b);
        }

        public C76878ad(C2553d dVar, C76873c cVar) {
            this.f172543a = dVar;
            this.f172544b = cVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.c$ae */
    public static final class C76879ae extends AbstractC21603p<C76913a> {

        /* renamed from: a */
        final /* synthetic */ C2553d f172545a;

        /* renamed from: b */
        final /* synthetic */ C76873c f172546b;

        static {
            Covode.recordClassIndex(89875);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C76913a get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C76913a(fVar, this.f172546b);
        }

        public C76879ae(C2553d dVar, C76873c cVar) {
            this.f172545a = dVar;
            this.f172546b = cVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.c$af */
    public static final class C76880af extends AbstractC21603p<C76982b> {

        /* renamed from: a */
        final /* synthetic */ C2553d f172547a;

        /* renamed from: b */
        final /* synthetic */ C76873c f172548b;

        static {
            Covode.recordClassIndex(89876);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C76982b get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C76982b(fVar, this.f172548b);
        }

        public C76880af(C2553d dVar, C76873c cVar) {
            this.f172547a = dVar;
            this.f172548b = cVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.c$ag */
    public static final class C76881ag extends AbstractC21603p<C76969a> {

        /* renamed from: a */
        final /* synthetic */ C2553d f172549a;

        /* renamed from: b */
        final /* synthetic */ C76873c f172550b;

        static {
            Covode.recordClassIndex(89877);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C76969a get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C76969a(fVar, this.f172550b);
        }

        public C76881ag(C2553d dVar, C76873c cVar) {
            this.f172549a = dVar;
            this.f172550b = cVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.c$w */
    public static final class C76908w extends AbstractC21603p<C76834c> {

        /* renamed from: a */
        final /* synthetic */ C2553d f172576a;

        /* renamed from: b */
        final /* synthetic */ C76873c f172577b;

        static {
            Covode.recordClassIndex(89904);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C76834c get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C76834c(fVar, this.f172577b);
        }

        public C76908w(C2553d dVar, C76873c cVar) {
            this.f172576a = dVar;
            this.f172577b = cVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.c$z */
    public static final class C76912z extends AbstractC21603p<C77067e> {

        /* renamed from: a */
        final /* synthetic */ C2553d f172583a;

        /* renamed from: b */
        final /* synthetic */ C76873c f172584b;

        static {
            Covode.recordClassIndex(89908);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C77067e get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C77067e(fVar, this.f172584b);
        }

        public C76912z(C2553d dVar, C76873c cVar) {
            this.f172583a = dVar;
            this.f172584b = cVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.c$r */
    static final class C76903r<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C76873c f172571a;

        static {
            Covode.recordClassIndex(89899);
        }

        C76903r(C76873c cVar) {
            this.f172571a = cVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            C76873c cVar = this.f172571a;
            cVar.mo36417e(cVar.mo120482O());
            ((AbstractC82237a) cVar.f172520c.getValue()).mo127416a();
            ((AbstractC76863a) cVar.f172521d.getValue()).mo120470a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.c$x */
    public static final class C76909x extends AbstractC21603p<C77114b> {

        /* renamed from: a */
        final /* synthetic */ C2553d f172578a;

        /* renamed from: b */
        final /* synthetic */ C76873c f172579b;

        static {
            Covode.recordClassIndex(89905);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C77114b get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C77114b(fVar, this.f172579b, new AbstractC89171a<AbstractC14552j>(this) {
                /* class com.p2082ss.android.ugc.aweme.story.edit.business.shared.C76873c.C76909x.C769101 */

                /* renamed from: a */
                final /* synthetic */ C76909x f172580a;

                static {
                    Covode.recordClassIndex(89906);
                }

                {
                    this.f172580a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ AbstractC14552j invoke() {
                    return this.f172580a.f172579b.mo120479L();
                }
            });
        }

        public C76909x(C2553d dVar, C76873c cVar) {
            this.f172578a = dVar;
            this.f172579b = cVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.c$y */
    public static final class C76911y extends AbstractC21603p<C82566a> {

        /* renamed from: a */
        final /* synthetic */ C2553d f172581a;

        /* renamed from: b */
        final /* synthetic */ C76873c f172582b;

        static {
            Covode.recordClassIndex(89907);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C82566a get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            C76873c cVar = this.f172582b;
            return new C82566a(fVar, cVar, R.id.c7m, cVar.mo120481N());
        }

        public C76911y(C2553d dVar, C76873c cVar) {
            this.f172581a = dVar;
            this.f172582b = cVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.c$aa */
    public static final class C76875aa extends AbstractC21603p<C82239b> {

        /* renamed from: a */
        final /* synthetic */ C2553d f172537a;

        /* renamed from: b */
        final /* synthetic */ C76873c f172538b;

        static {
            Covode.recordClassIndex(89871);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C82239b get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            C76873c cVar = this.f172538b;
            C82239b bVar = new C82239b(fVar, cVar, cVar.mo120478K().mo86005c().mo86019a(0), this.f172538b.mo120478K().mo86006d());
            bVar.f183978a = false;
            return bVar;
        }

        public C76875aa(C2553d dVar, C76873c cVar) {
            this.f172537a = dVar;
            this.f172538b = cVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.c$ab */
    public static final class C76876ab extends AbstractC21603p<C76843b> {

        /* renamed from: a */
        final /* synthetic */ C2553d f172539a;

        /* renamed from: b */
        final /* synthetic */ C76873c f172540b;

        static {
            Covode.recordClassIndex(89872);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C76843b get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C76843b(fVar, this.f172540b.mo120479L(), this.f172540b.mo120478K().mo86006d(), new C76898m(this.f172540b));
        }

        public C76876ab(C2553d dVar, C76873c cVar) {
            this.f172539a = dVar;
            this.f172540b = cVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.c$o */
    static final class C76900o<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C76873c f172568a;

        static {
            Covode.recordClassIndex(89896);
        }

        C76900o(C76873c cVar) {
            this.f172568a = cVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            C89386u uVar = (C89386u) obj;
            ((AbstractC83251y) this.f172568a.f172524g.getValue()).mo88191a(((Boolean) uVar.component1()).booleanValue(), ((Boolean) uVar.component2()).booleanValue(), ((Boolean) uVar.component3()).booleanValue());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.c$q */
    static final class C76902q<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C76873c f172570a;

        static {
            Covode.recordClassIndex(89898);
        }

        C76902q(C76873c cVar) {
            this.f172570a = cVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            View c = this.f172570a.mo36475c(R.id.c7m);
            C89219l.m154716b(c, "");
            FrameLayout frameLayout = (FrameLayout) c;
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams != null) {
                C89219l.m154716b(num, "");
                marginLayoutParams.topMargin = num.intValue();
                frameLayout.setLayoutParams(marginLayoutParams);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.c$p */
    static final class C76901p<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C76873c f172569a;

        static {
            Covode.recordClassIndex(89897);
        }

        C76901p(C76873c cVar) {
            this.f172569a = cVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            C77092n nVar = (C77092n) obj;
            C76873c cVar = this.f172569a;
            C89219l.m154716b(nVar, "");
            int i = nVar.f172924a;
            if (i == 0) {
                cVar.mo120483P();
            } else if (i == 1) {
                cVar.mo120477J().mo127542b(true);
                cVar.mo120473F().mo114805a((AbstractC72510a) false, false, false);
            } else if (i == 2) {
                cVar.mo120473F().mo114805a((AbstractC72510a) false, false, false);
                ((AbstractC76981a) cVar.f172523f.getValue()).mo120529a();
                C70968bl.m125260a(cVar.mo120481N(), false);
            } else if (i == 3) {
                AbstractC82610a H = cVar.mo120475H();
                if (H != null) {
                    H.mo127679b();
                }
                C70968bl.m125254a(cVar.mo120481N(), nVar.f172925b);
            } else if (i == 4) {
                cVar.mo120476I().mo127989a(true, nVar.f172925b);
                cVar.mo120473F().mo114805a((AbstractC72510a) false, false, false);
            } else if (i == 5) {
                VEEditClip vEEditClip = (VEEditClip) C77118b.m134706a(cVar.cF_());
                if (vEEditClip != null) {
                    boolean f = C77148a.m134761f(vEEditClip.f172984g);
                    if (f) {
                        vEEditClip.f172984g.setVoiceVolume(1.0f);
                    } else {
                        vEEditClip.f172984g.setVoiceVolume(0.0f);
                    }
                    cVar.mo120474G().mo120603d(!f);
                    cVar.mo120477J().mo127536a(vEEditClip.f172984g.getVoiceVolume());
                    AbstractC76760e F = cVar.mo120473F();
                    VEVolumeChangeOp ofVoice = VEVolumeChangeOp.ofVoice(vEEditClip.f172984g.getVoiceVolume());
                    C89219l.m154716b(ofVoice, "");
                    F.mo114800a(ofVoice);
                    StoryEditModel M = cVar.mo120480M();
                    C89219l.m154721d(M, "");
                    C76748b.m134344a("click_mute", M, new C76748b.C76753e(!f));
                }
            } else if (i == 100) {
                ((AbstractC77024e) cVar.f172522e.getValue()).mo120562a();
                StoryEditModel M2 = cVar.mo120480M();
                String str = nVar.f172925b;
                C89219l.m154721d(M2, "");
                C89219l.m154721d(str, "");
                C76748b.m134344a("click_share_to_story", M2, new C76748b.C76749a(M2, !C89219l.m154714a((Object) str, (Object) "click_button")));
            }
        }
    }

    public C76873c(C21582f fVar) {
        C89219l.m154721d(fVar, "");
        this.f172519B = fVar;
        this.f172531v = C21572a.m40504a(fVar, AbstractC50651a.class);
        this.f172532w = C21572a.m40504a(fVar, AbstractC14552j.class);
        this.f172533x = C21572a.m40504a(fVar, VEEditClipCluster.class);
        this.f172534y = C21572a.m40504a(fVar, StoryEditModel.class);
        this.f172535z = C21572a.m40504a(fVar, VideoPublishEditModel.class);
        this.f172525h = C89250i.m154773a((AbstractC89171a) new C76899n(this));
        this.f172518A = C89250i.m154773a((AbstractC89171a) new C76885ai(this));
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo22704a(Bundle bundle) {
        super.mo22704a(bundle);
        C2556g.m7472a(this, new C76882ah(this));
        C2551b bVar = new C2551b(C2552c.m7462a(this));
        C2553d dVar = new C2553d();
        AlsLogicContainer alsLogicContainer = bVar.f7720a;
        alsLogicContainer.f7696d.mo35260a(C76834c.class, (String) null, (AbstractC21603p) new C76908w(dVar, this));
        alsLogicContainer.mo7005a(AbstractC76833b.class, C76834c.class);
        C2553d dVar2 = new C2553d();
        AlsLogicContainer alsLogicContainer2 = bVar.f7720a;
        alsLogicContainer2.f7696d.mo35260a(C77067e.class, (String) null, (AbstractC21603p) new C76912z(dVar2, this));
        alsLogicContainer2.mo7005a(StoryEditToolbarViewModel.class, C77067e.class);
        C2553d dVar3 = new C2553d();
        AlsLogicContainer alsLogicContainer3 = bVar.f7720a;
        alsLogicContainer3.f7696d.mo35260a(C82239b.class, (String) null, (AbstractC21603p) new C76875aa(dVar3, this));
        alsLogicContainer3.mo7005a(EditFilterIndicatorViewModel.class, C82239b.class);
        C2553d dVar4 = new C2553d();
        AlsLogicContainer alsLogicContainer4 = bVar.f7720a;
        alsLogicContainer4.f7696d.mo35260a(C76843b.class, (String) null, (AbstractC21603p) new C76876ab(dVar4, this));
        alsLogicContainer4.mo7005a(AbstractC76842a.class, C76843b.class);
        C2553d dVar5 = new C2553d();
        AlsLogicContainer alsLogicContainer5 = bVar.f7720a;
        alsLogicContainer5.f7696d.mo35260a(C76864b.class, (String) null, (AbstractC21603p) new C76877ac(dVar5, this));
        alsLogicContainer5.mo7005a(AbstractC76863a.class, C76864b.class);
        C2553d dVar6 = new C2553d();
        AlsLogicContainer alsLogicContainer6 = bVar.f7720a;
        alsLogicContainer6.f7696d.mo35260a(C82105b.class, (String) null, (AbstractC21603p) new C76878ad(dVar6, this));
        alsLogicContainer6.mo7005a(EditMusicCutViewModel.class, C82105b.class);
        C2553d dVar7 = new C2553d();
        AlsLogicContainer alsLogicContainer7 = bVar.f7720a;
        alsLogicContainer7.f7696d.mo35260a(C76913a.class, (String) null, (AbstractC21603p) new C76879ae(dVar7, this));
        alsLogicContainer7.mo7005a(EditMusicViewModel.class, C76913a.class);
        C2553d dVar8 = new C2553d();
        AlsLogicContainer alsLogicContainer8 = bVar.f7720a;
        alsLogicContainer8.f7696d.mo35260a(C76982b.class, (String) null, (AbstractC21603p) new C76880af(dVar8, this));
        alsLogicContainer8.mo7005a(StoryEditEffectPanelViewModel.class, C76982b.class);
        C2553d dVar9 = new C2553d();
        AlsLogicContainer alsLogicContainer9 = bVar.f7720a;
        alsLogicContainer9.f7696d.mo35260a(C76969a.class, (String) null, (AbstractC21603p) new C76881ag(dVar9, this));
        alsLogicContainer9.mo7005a(EditStickerPanelViewModel.class, C76969a.class);
        C2553d dVar10 = new C2553d();
        AlsLogicContainer alsLogicContainer10 = bVar.f7720a;
        alsLogicContainer10.f7696d.mo35260a(C76856b.class, (String) null, (AbstractC21603p) new C76894i(dVar10));
        alsLogicContainer10.mo7005a(AbstractC76855a.class, C76856b.class);
        C2553d dVar11 = new C2553d();
        AlsLogicContainer alsLogicContainer11 = bVar.f7720a;
        alsLogicContainer11.f7696d.mo35260a(C77025f.class, (String) null, (AbstractC21603p) new C76895j(dVar11));
        alsLogicContainer11.mo7005a(AbstractC77024e.class, C77025f.class);
        C2553d dVar12 = new C2553d();
        AlsLogicContainer alsLogicContainer12 = bVar.f7720a;
        alsLogicContainer12.f7696d.mo35260a(C77114b.class, (String) null, (AbstractC21603p) new C76909x(dVar12, this));
        alsLogicContainer12.mo7005a(EditPhotoCanvasViewModel.class, C77114b.class);
        C2553d dVar13 = new C2553d();
        AlsLogicContainer alsLogicContainer13 = bVar.f7720a;
        alsLogicContainer13.f7696d.mo35260a(C82566a.class, (String) null, (AbstractC21603p) new C76911y(dVar13, this));
        alsLogicContainer13.mo7005a(CommentAndQuestionAndQuestionStickerPanelViewModel.class, C82566a.class);
        bVar.mo7031a();
        mo120473F().mo114781F().observe(this, new C76900o(this));
        mo120474G().mo120595a().observe(this, new C76901p(this));
        mo120473F().mo114792Q().observe(this, new C76902q(this));
        mo120473F().mo114817f().observe(this, new C76903r(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.c$t */
    public static final class DialogInterface$OnClickListenerC76905t implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C76873c f172573a;

        static {
            Covode.recordClassIndex(89901);
        }

        DialogInterface$OnClickListenerC76905t(C76873c cVar) {
            this.f172573a = cVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f172573a.mo120484Q();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.c$v */
    public static final class DialogInterface$OnClickListenerC76907v implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C76873c f172575a;

        static {
            Covode.recordClassIndex(89903);
        }

        DialogInterface$OnClickListenerC76907v(C76873c cVar) {
            this.f172575a = cVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f172575a.mo120484Q();
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j, com.bytedance.scene.group.AbstractC22186b
    /* renamed from: a */
    public final /* synthetic */ View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return mo22702a(layoutInflater, viewGroup);
    }

    @Override // com.bytedance.scene.group.AbstractC22186b
    /* renamed from: b */
    public final ViewGroup mo36393b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.b1z, viewGroup, false);
        Objects.requireNonNull(a, "null cannot be cast to non-null type android.view.ViewGroup");
        return (ViewGroup) a;
    }
}
