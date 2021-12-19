package com.p2082ss.android.ugc.aweme.story.edit.business.shared.p4036c;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.app.ActivityC0218d;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1213t;
import com.C1764a;
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
import com.bytedance.jedi.arch.C20522l;
import com.bytedance.jedi.arch.C20526p;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.scene.AbstractC22219j;
import com.bytedance.scene.ktx.C22228c;
import com.p2082ss.android.ugc.aweme.p2722cy.p2723a.AbstractC40892g;
import com.p2082ss.android.ugc.aweme.p2722cy.p2723a.AbstractC40895j;
import com.p2082ss.android.ugc.aweme.p2722cy.p2723a.AbstractC40896k;
import com.p2082ss.android.ugc.aweme.p2722cy.p2723a.AbstractC40897l;
import com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40906e;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.C71812ep;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70968bl;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70976bp;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.p3853q.View$OnClickListenerC72712e;
import com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a;
import com.p2082ss.android.ugc.aweme.story.edit.C76740a;
import com.p2082ss.android.ugc.aweme.story.edit.business.shared.p4036c.C76943g;
import com.p2082ss.android.ugc.aweme.story.edit.business.shared.toolbar.AbstractC77066d;
import com.p2082ss.android.ugc.aweme.story.edit.business.shared.toolbar.C77092n;
import com.p2082ss.android.ugc.aweme.story.edit.clip.impl.AbstractC77135b;
import com.p2082ss.android.ugc.aweme.story.edit.clip.impl.C77134a;
import com.p2082ss.android.ugc.aweme.story.edit.clip.impl.VEEditClipCluster;
import com.p2082ss.android.ugc.aweme.story.edit.model.C77148a;
import com.p2082ss.android.ugc.aweme.story.edit.model.StoryEditClipModel;
import com.p2082ss.android.ugc.aweme.themechange.base.AVDmtSeekBar;
import com.p2082ss.android.ugc.aweme.tools.C78099c;
import com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d;
import com.p2082ss.android.ugc.gamora.editor.AbstractC82563s;
import com.p2082ss.android.ugc.gamora.editor.C82180f;
import com.p2082ss.android.ugc.gamora.editor.cutmusic.AbstractC82104a;
import com.p2082ss.android.ugc.gamora.editor.music.EditMusicState;
import com.p2082ss.android.ugc.gamora.editor.music.EditMusicViewModel;
import com.p2082ss.android.ugc.gamora.editor.sticker.core.AbstractC82610a;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84919c;
import com.p2082ss.android.ugc.trill.R;
import dmt.p4542av.video.C88296t;
import java.util.Objects;
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
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4620k.AbstractC89286i;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.c.b */
public final class C76918b extends AbstractC22219j implements AbstractC20382b, AbstractC21566a, AbstractC40895j, AbstractC40896k, View$OnClickListenerC72712e.AbstractC72715b, AbstractC77135b {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f172599a = {new C89232y(C76918b.class, "editMusicControllerCallback", "getEditMusicControllerCallback()Lcom/ss/android/ugc/gamora/editor/EditMusicControllerCallback;", 0), new C89232y(C76918b.class, "clipCluster", "getClipCluster()Lcom/ss/android/ugc/aweme/story/edit/clip/impl/VEEditClipCluster;", 0), new C89232y(C76918b.class, "editStickerApi", "getEditStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/EditStickerApi;", 0), new C89232y(C76918b.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0)};

    /* renamed from: f */
    public static final C76924f f172600f = new C76924f((byte) 0);

    /* renamed from: b */
    public boolean f172601b;

    /* renamed from: c */
    final AbstractC89248d f172602c = C21572a.m40504a(getDiContainer(), AbstractC82563s.class);

    /* renamed from: d */
    final AbstractC89244h f172603d;

    /* renamed from: e */
    public boolean f172604e;

    /* renamed from: g */
    private final AbstractC89244h f172605g = C89250i.m154773a((AbstractC89171a) new C76931m(this));

    /* renamed from: h */
    private final AbstractC89244h f172606h = C89250i.m154773a((AbstractC89171a) new C76938r(this));

    /* renamed from: i */
    private final AbstractC89244h f172607i = C89250i.m154773a((AbstractC89171a) new C76926h(this));

    /* renamed from: j */
    private final AbstractC89248d f172608j = C21572a.m40504a(getDiContainer(), VEEditClipCluster.class);

    /* renamed from: k */
    private final AbstractC89244h f172609k;

    /* renamed from: l */
    private final AbstractC89244h f172610l;

    /* renamed from: t */
    private final AbstractC89248d f172611t;

    /* renamed from: u */
    private final AbstractC89244h f172612u;

    /* renamed from: v */
    private final AbstractC89248d f172613v;

    /* renamed from: w */
    private final C21582f f172614w;

    static {
        Covode.recordClassIndex(89914);
    }

    /* renamed from: L */
    private final C82180f m134524L() {
        return (C82180f) this.f172607i.getValue();
    }

    /* renamed from: C */
    public final View$OnClickListenerC72712e mo120491C() {
        return (View$OnClickListenerC72712e) this.f172605g.getValue();
    }

    /* renamed from: D */
    public final C76943g mo120492D() {
        return (C76943g) this.f172606h.getValue();
    }

    /* renamed from: F */
    public final VEEditClipCluster cF_() {
        return (VEEditClipCluster) this.f172608j.mo23374a(this, f172599a[1]);
    }

    /* renamed from: G */
    public final EditMusicViewModel mo120494G() {
        return (EditMusicViewModel) this.f172609k.getValue();
    }

    /* renamed from: H */
    public final AbstractC72510a mo120495H() {
        return (AbstractC72510a) this.f172610l.getValue();
    }

    /* renamed from: I */
    public final AbstractC77066d mo120496I() {
        return (AbstractC77066d) this.f172612u.getValue();
    }

    /* renamed from: J */
    public final VideoPublishEditModel mo120497J() {
        return (VideoPublishEditModel) this.f172613v.mo23374a(this, f172599a[3]);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3853q.View$OnClickListenerC72712e.AbstractC72715b
    /* renamed from: a */
    public final void mo114983a(boolean z, C69905c cVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3853q.View$OnClickListenerC72712e.AbstractC72715b
    /* renamed from: f */
    public final void mo114987f() {
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.c.b$f */
    public static final class C76924f {
        static {
            Covode.recordClassIndex(89920);
        }

        private C76924f() {
        }

        public /* synthetic */ C76924f(byte b) {
            this();
        }
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f172614w;
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

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.c.b$a */
    public static final class C76919a extends AbstractC89220m implements AbstractC89171a<AbstractC72510a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f172615a;

        static {
            Covode.recordClassIndex(89915);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C76919a(AbstractC21566a aVar) {
            super(0);
            this.f172615a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.shortvideo.preview.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f172615a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.preview.a> r1 = com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.story.edit.business.shared.p4036c.C76918b.C76919a.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.c.b$b */
    public static final class C76920b extends AbstractC89220m implements AbstractC89171a<AbstractC82104a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f172616a;

        static {
            Covode.recordClassIndex(89916);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C76920b(AbstractC21566a aVar) {
            super(0);
            this.f172616a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.gamora.editor.cutmusic.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.cutmusic.AbstractC82104a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f172616a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.cutmusic.a> r1 = com.p2082ss.android.ugc.gamora.editor.cutmusic.AbstractC82104a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.story.edit.business.shared.p4036c.C76918b.C76920b.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.c.b$c */
    public static final class C76921c extends AbstractC89220m implements AbstractC89171a<AbstractC77066d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f172617a;

        static {
            Covode.recordClassIndex(89917);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C76921c(AbstractC21566a aVar) {
            super(0);
            this.f172617a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.d] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.story.edit.business.shared.toolbar.AbstractC77066d invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f172617a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.d> r1 = com.p2082ss.android.ugc.aweme.story.edit.business.shared.toolbar.AbstractC77066d.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.story.edit.business.shared.p4036c.C76918b.C76921c.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.c.b$m */
    static final class C76931m extends AbstractC89220m implements AbstractC89171a<View$OnClickListenerC72712e> {

        /* renamed from: a */
        final /* synthetic */ C76918b f172628a;

        static {
            Covode.recordClassIndex(89927);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76931m(C76918b bVar) {
            super(0);
            this.f172628a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ View$OnClickListenerC72712e invoke() {
            return new View$OnClickListenerC72712e(new AbstractC89171a<String>(this) {
                /* class com.p2082ss.android.ugc.aweme.story.edit.business.shared.p4036c.C76918b.C76931m.C769321 */

                /* renamed from: a */
                final /* synthetic */ C76931m f172629a;

                static {
                    Covode.recordClassIndex(89928);
                }

                {
                    this.f172629a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ String invoke() {
                    StoryEditClipModel d = C77134a.m134739d(this.f172629a.f172628a);
                    if (d != null) {
                        return d.getAiMusicRequestTaskId();
                    }
                    return null;
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.c.b$n */
    public static final class C76933n implements AbstractC40892g {

        /* renamed from: a */
        final /* synthetic */ C76918b f172630a;

        static {
            Covode.recordClassIndex(89929);
        }

        @Override // com.p2082ss.android.ugc.aweme.p2722cy.p2723a.AbstractC40892g
        /* renamed from: a */
        public final void mo70085a() {
            C70968bl.m125274g(this.f172630a.mo120497J());
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C76933n(C76918b bVar) {
            this.f172630a = bVar;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3853q.View$OnClickListenerC72712e.AbstractC72715b
    /* renamed from: d */
    public final void mo114985d() {
        C70968bl.m125271e(mo120497J(), mo36476c_(R.string.yj));
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: n_ */
    public final void mo22713n_() {
        super.mo22713n_();
        mo120491C().mo114976b();
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.c.b$r */
    static final class C76938r extends AbstractC89220m implements AbstractC89171a<C76943g> {

        /* renamed from: a */
        final /* synthetic */ C76918b f172635a;

        static {
            Covode.recordClassIndex(89934);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76938r(C76918b bVar) {
            super(0);
            this.f172635a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C76943g invoke() {
            Activity activity = this.f172635a.f52549m;
            if (!(activity instanceof AbstractC84919c)) {
                activity = null;
            }
            return new C76943g((AbstractC84919c) activity);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3853q.View$OnClickListenerC72712e.AbstractC72715b
    /* renamed from: a */
    public final void mo114981a() {
        mo120495H().mo114833v().setValue(C88296t.m153437b());
        m134524L().mo127281h();
        C70968bl.m125272f(mo120497J());
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.c.b$h */
    static final class C76926h extends AbstractC89220m implements AbstractC89171a<C82180f> {

        /* renamed from: a */
        final /* synthetic */ C76918b f172623a;

        static {
            Covode.recordClassIndex(89922);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76926h(C76918b bVar) {
            super(0);
            this.f172623a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C82180f invoke() {
            ActivityC0945e b = C22228c.m41832b(this.f172623a);
            C76918b bVar = this.f172623a;
            return new C82180f(b, (AbstractC82563s) bVar.f172602c.mo23374a(bVar, C76918b.f172599a[0]), this.f172623a.getDiContainer());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.c.b$p */
    public static final class C76935p extends AbstractC40906e.C40907a {

        /* renamed from: a */
        final /* synthetic */ C76918b f172632a;

        static {
            Covode.recordClassIndex(89931);
        }

        @Override // com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40904c, com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40906e.C40907a
        /* renamed from: d */
        public final void mo70109d() {
            StoryEditClipModel d = C77134a.m134739d(this.f172632a);
            if (d != null) {
                C76740a.m134320a(this.f172632a.mo120497J(), d);
            }
            if (this.f172632a.f172601b) {
                this.f172632a.f172601b = false;
                ((AbstractC82104a) this.f172632a.f172603d.getValue()).mo127330a();
                return;
            }
            this.f172632a.mo120495H().mo114805a((AbstractC72510a) true, false, true);
        }

        @Override // com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40904c, com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40906e.C40907a
        /* renamed from: a */
        public final void mo70104a() {
            MethodCollector.m26663i(6456);
            super.mo70104a();
            if (!this.f172632a.f172604e) {
                this.f172632a.f172604e = true;
                View inflate = LayoutInflater.from(this.f172632a.mo36486t()).inflate(R.layout.b2c, (ViewGroup) null);
                inflate.setOnClickListener(new C76936a(this));
                View$OnClickListenerC72712e C = this.f172632a.mo120491C();
                C89219l.m154716b(inflate, "");
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, C71812ep.m126783a(44.0d, C63247i.f143610a), 8388613);
                if (C78099c.m136517a(this.f172632a.mo36486t())) {
                    layoutParams.leftMargin = C71812ep.m126783a(16.0d, C63247i.f143610a);
                } else {
                    layoutParams.rightMargin = C71812ep.m126783a(16.0d, C63247i.f143610a);
                }
                layoutParams.bottomMargin = C71812ep.m126783a(16.0d, C63247i.f143610a);
                C89219l.m154721d(inflate, "");
                if (C.f163032n == null || inflate.getParent() != null) {
                    MethodCollector.m26664o(6456);
                    return;
                }
                FrameLayout frameLayout = C.f163032n;
                if (frameLayout != null) {
                    frameLayout.addView(inflate, layoutParams);
                    MethodCollector.m26664o(6456);
                    return;
                }
            }
            MethodCollector.m26664o(6456);
        }

        /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.c.b$p$a */
        public static final class C76936a extends AbstractView$OnClickListenerC81432d {

            /* renamed from: a */
            final /* synthetic */ C76935p f172633a;

            static {
                Covode.recordClassIndex(89932);
            }

            C76936a(C76935p pVar) {
                this.f172633a = pVar;
            }

            @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d
            /* renamed from: a */
            public final void mo77200a(View view) {
                StoryEditClipModel d = C77134a.m134739d(this.f172633a.f172632a);
                if (d != null) {
                    C76740a.m134320a(this.f172633a.f172632a.mo120497J(), d);
                }
                this.f172633a.f172632a.mo120496I().mo120597a(new C77092n(100, "click_panel"));
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C76935p(C76918b bVar) {
            this.f172632a = bVar;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3853q.View$OnClickListenerC72712e.AbstractC72715b
    /* renamed from: e */
    public final void mo114986e() {
        C1213t<Boolean> g;
        if (C70976bp.m125317m(mo120497J())) {
            this.f172601b = true;
            mo120494G().mo127540b();
            AbstractC82610a aVar = (AbstractC82610a) this.f172611t.mo23374a(this, f172599a[2]);
            if (aVar != null && (g = aVar.mo127684g()) != null) {
                g.setValue(false);
            }
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: w */
    public final void mo36490w() {
        super.mo36490w();
        if (mo120491C().f163029k) {
            AbstractC63154aa.AbstractC63159d dVar = mo120491C().f163024f;
            if (dVar != null) {
                dVar.mo101584b();
            }
            AbstractC63154aa.AbstractC63159d dVar2 = mo120491C().f163024f;
            if (dVar2 != null) {
                dVar2.mo101589g();
            }
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: x */
    public final void mo36491x() {
        super.mo36491x();
        if (mo120491C().f163029k) {
            AbstractC63154aa.AbstractC63159d dVar = mo120491C().f163024f;
            if (dVar != null) {
                dVar.mo101574a();
            }
            AbstractC63154aa.AbstractC63159d dVar2 = mo120491C().f163024f;
            if (dVar2 != null) {
                dVar2.mo101588f();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.c.b$d */
    public static final class C76922d extends AbstractC89220m implements AbstractC89171a<EditMusicViewModel> {

        /* renamed from: a */
        final /* synthetic */ AbstractC22219j f172618a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f172619b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f172620c;

        static {
            Covode.recordClassIndex(89918);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C76922d(AbstractC22219j jVar, AbstractC89277c cVar, AbstractC89277c cVar2) {
            super(0);
            this.f172618a = jVar;
            this.f172619b = cVar;
            this.f172620c = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [com.ss.android.ugc.gamora.editor.music.EditMusicViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v15, types: [com.ss.android.ugc.gamora.editor.music.EditMusicViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 2 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.music.EditMusicViewModel invoke() {
            /*
                r6 = this;
                com.bytedance.scene.j r0 = r6.f172618a
                com.bytedance.scene.j r5 = r0.f52551o
                h.k.c r0 = r6.f172620c
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                java.lang.String r3 = r0.getCanonicalName()
                java.lang.String r4 = ""
                p4600h.p4611f.p4613b.C89219l.m154716b(r3, r4)
            L_0x0013:
                if (r5 == 0) goto L_0x003a
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ad r2 = com.bytedance.scene.C22267s.m41934a(r5, r0)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.f172620c     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)     // Catch:{ as -> 0x0035 }
                java.lang.String r1 = r0.getCanonicalName()     // Catch:{ as -> 0x0035 }
                p4600h.p4611f.p4613b.C89219l.m154716b(r1, r4)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.f172619b     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ac r0 = m134547xc95e176e(r2, r1, r0)     // Catch:{ as -> 0x0035 }
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0     // Catch:{ as -> 0x0035 }
                goto L_0x0038
            L_0x0035:
                com.bytedance.scene.j r5 = r5.f52551o
                goto L_0x0013
            L_0x0038:
                if (r0 != 0) goto L_0x0052
            L_0x003a:
                com.bytedance.scene.j r0 = r6.f172618a
                androidx.fragment.app.e r1 = com.bytedance.scene.ktx.C22228c.m41832b(r0)
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a
                androidx.lifecycle.ad r1 = androidx.lifecycle.C1181ae.m3881a(r1, r0)
                h.k.c r0 = r6.f172619b
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                androidx.lifecycle.ac r0 = m134547xc95e176e(r1, r3, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0052:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.story.edit.business.shared.p4036c.C76918b.C76922d.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_story_edit_business_shared_music_StoryEditMusicScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m134547xc95e176e(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    /* renamed from: K */
    public final void mo120498K() {
        boolean z;
        mo120492D().mo120501a((int) (mo120497J().musicVolume * 100.0f));
        mo120492D().mo120503b((int) (mo120497J().voiceVolume * 100.0f));
        C76943g D = mo120492D();
        StoryEditClipModel d = C77134a.m134739d(this);
        boolean z2 = true;
        if (d == null || C77148a.m134760e(d)) {
            z = false;
        } else {
            z = true;
        }
        D.mo120502a(z);
        C76943g D2 = mo120492D();
        if (C70005cr.m123611a().f156482a == null) {
            z2 = false;
        }
        D2.mo120504b(z2);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3853q.View$OnClickListenerC72712e.AbstractC72715b
    /* renamed from: b */
    public final void mo114984b() {
        if (!mo120492D().f172648h) {
            C76943g D = mo120492D();
            ViewGroup viewGroup = mo120491C().f163035q;
            if (!D.f172648h && viewGroup != null) {
                D.f172643c = viewGroup;
                View findViewById = viewGroup.findViewById(R.id.dtr);
                C89219l.m154716b(findViewById, "");
                D.f172644d = (AVDmtSeekBar) findViewById;
                View findViewById2 = viewGroup.findViewById(R.id.dts);
                C89219l.m154716b(findViewById2, "");
                D.f172645e = (AVDmtSeekBar) findViewById2;
                View findViewById3 = viewGroup.findViewById(R.id.f0t);
                C89219l.m154716b(findViewById3, "");
                D.f172641a = (TextView) findViewById3;
                View findViewById4 = viewGroup.findViewById(R.id.f0u);
                C89219l.m154716b(findViewById4, "");
                D.f172642b = (TextView) findViewById4;
                AVDmtSeekBar aVDmtSeekBar = D.f172644d;
                if (aVDmtSeekBar == null) {
                    C89219l.m154710a("mVoiceSeekBar");
                }
                aVDmtSeekBar.setDisplayPercent(true);
                AVDmtSeekBar aVDmtSeekBar2 = D.f172645e;
                if (aVDmtSeekBar2 == null) {
                    C89219l.m154710a("mMusicSeekBar");
                }
                aVDmtSeekBar2.setDisplayPercent(true);
                AVDmtSeekBar aVDmtSeekBar3 = D.f172644d;
                if (aVDmtSeekBar3 == null) {
                    C89219l.m154710a("mVoiceSeekBar");
                }
                aVDmtSeekBar3.setMax(200);
                AVDmtSeekBar aVDmtSeekBar4 = D.f172645e;
                if (aVDmtSeekBar4 == null) {
                    C89219l.m154710a("mMusicSeekBar");
                }
                aVDmtSeekBar4.setMax(200);
                AVDmtSeekBar aVDmtSeekBar5 = D.f172645e;
                if (aVDmtSeekBar5 == null) {
                    C89219l.m154710a("mMusicSeekBar");
                }
                aVDmtSeekBar5.setOnSeekBarChangeListener(new C76943g.C76947d(D));
                AVDmtSeekBar aVDmtSeekBar6 = D.f172644d;
                if (aVDmtSeekBar6 == null) {
                    C89219l.m154710a("mVoiceSeekBar");
                }
                aVDmtSeekBar6.setOnSeekBarChangeListener(new C76943g.C76948e(D));
                View view = D.f172643c;
                if (view != null) {
                    view.setOnClickListener(new C76943g.View$OnClickListenerC76949f(D));
                }
                D.f172648h = true;
            }
            mo120492D().f172649i = new C76925g(this);
        }
        mo120498K();
        C70968bl.m125269d(mo120497J(), mo36476c_(R.string.z_));
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.c.b$e */
    public static final class C76923e implements AbstractC89248d<Object, AbstractC82610a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f172621a;

        static {
            Covode.recordClassIndex(89919);
        }

        public C76923e(AbstractC21566a aVar) {
            this.f172621a = aVar;
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
                com.bytedance.o.a r0 = r2.f172621a
                com.ss.android.ugc.aweme.story.edit.business.a.b r1 = com.p2082ss.android.ugc.aweme.story.edit.business.p4030a.C76814a.m134431a(r0)
                if (r1 == 0) goto L_0x0017
                java.lang.Class<com.ss.android.ugc.gamora.editor.sticker.core.a> r0 = com.p2082ss.android.ugc.gamora.editor.sticker.core.AbstractC82610a.class
                java.lang.Object r0 = r1.mo120461a(r0)
                return r0
            L_0x0017:
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.story.edit.business.shared.p4036c.C76918b.C76923e.mo23374a(java.lang.Object, h.k.i):java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.c.b$g */
    public static final class C76925g implements C76943g.AbstractC76945b {

        /* renamed from: a */
        final /* synthetic */ C76918b f172622a;

        static {
            Covode.recordClassIndex(89921);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C76925g(C76918b bVar) {
            this.f172622a = bVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.story.edit.business.shared.p4036c.C76943g.AbstractC76945b
        /* renamed from: a */
        public final void mo120499a(float f) {
            boolean z;
            AbstractC72510a H = this.f172622a.mo120495H();
            VEVolumeChangeOp ofVoice = VEVolumeChangeOp.ofVoice(f);
            C89219l.m154716b(ofVoice, "");
            H.mo114800a(ofVoice);
            this.f172622a.mo120497J().voiceVolume = f;
            AbstractC77066d I = this.f172622a.mo120496I();
            if (f == 0.0f) {
                z = true;
            } else {
                z = false;
            }
            I.mo120603d(z);
        }

        @Override // com.p2082ss.android.ugc.aweme.story.edit.business.shared.p4036c.C76943g.AbstractC76945b
        /* renamed from: b */
        public final void mo120500b(float f) {
            if (this.f172622a.mo120497J().mMusicPath != null) {
                AbstractC72510a H = this.f172622a.mo120495H();
                VEVolumeChangeOp ofMusic = VEVolumeChangeOp.ofMusic(f);
                C89219l.m154716b(ofMusic, "");
                H.mo114800a(ofMusic);
            }
            this.f172622a.mo120497J().musicVolume = f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.c.b$o */
    public static final class C76934o implements AbstractC40897l {

        /* renamed from: a */
        final /* synthetic */ C76918b f172631a;

        static {
            Covode.recordClassIndex(89930);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C76934o(C76918b bVar) {
            this.f172631a = bVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.p2722cy.p2723a.AbstractC40897l
        /* renamed from: a */
        public final void mo70094a(boolean z) {
            String str;
            VideoPublishEditModel J = this.f172631a.mo120497J();
            if (z) {
                str = "recommend";
            } else {
                str = "favorite";
            }
            C70968bl.m125273f(J, str);
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af> S1 getState(VM1 vm1) {
        C89219l.m154721d(vm1, "");
        return (S1) AbstractC20382b.C20383a.m38582a(this, vm1);
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.c.b$q */
    static final class C76937q extends AbstractC89220m implements AbstractC89172b<EditMusicState, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C89233z.C89234a f172634a;

        static {
            Covode.recordClassIndex(89933);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76937q(C89233z.C89234a aVar) {
            super(1);
            this.f172634a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(EditMusicState editMusicState) {
            EditMusicState editMusicState2 = editMusicState;
            C89219l.m154721d(editMusicState2, "");
            this.f172634a.element = editMusicState2.getNeedMob();
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2722cy.p2723a.AbstractC40896k
    /* renamed from: a */
    public final void mo70093a(int i) {
        String str;
        String str2;
        C69905c a = mo120491C().mo114972a(i);
        VideoPublishEditModel J = mo120497J();
        if (a == null || (str = a.getMusicId()) == null) {
            str = "";
        }
        mo120491C();
        int a2 = View$OnClickListenerC72712e.m128171a();
        if (mo120491C().mo114979e() == 0) {
            str2 = "recommend";
        } else {
            str2 = "favorite";
        }
        C70968bl.m125257a(J, str, a2, str2, i);
    }

    public C76918b(C21582f fVar) {
        C89219l.m154721d(fVar, "");
        this.f172614w = fVar;
        AbstractC89277c a = C89204ab.m154669a(EditMusicViewModel.class);
        this.f172609k = C89250i.m154773a((AbstractC89171a) new C76922d(this, a, a));
        this.f172610l = C89250i.m154774a(EnumC89331m.NONE, new C76919a(this));
        this.f172603d = C89250i.m154774a(EnumC89331m.NONE, new C76920b(this));
        this.f172611t = new C76923e(this);
        this.f172612u = C89250i.m154774a(EnumC89331m.NONE, new C76921c(this));
        this.f172613v = C21572a.m40504a(getDiContainer(), VideoPublishEditModel.class);
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo22704a(Bundle bundle) {
        super.mo22704a(bundle);
        mo120491C().f163036r = this;
        mo120491C().f163037s = this;
        mo120491C().f163028j = this;
        mo120491C().f163023e = new C76933n(this);
        mo120491C().f163026h = new C76934o(this);
        mo120491C().mo114975a(new C76935p(this));
        selectNonNullSubscribe(mo120494G(), C76939c.f172636a, new C20370ah(), new C76927i(this));
        AbstractC20382b.C20383a.m38603b(this, mo120494G(), C76940d.f172637a, new C76928j(this));
        selectNonNullSubscribe(mo120494G(), C76941e.f172638a, new C20370ah(), new C76929k(this));
        selectNonNullSubscribe(mo120494G(), C76942f.f172639a, new C20370ah(), new C76930l(this));
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20382b.C20383a.m38593a(this, vm1, bVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.c.b$j */
    static final class C76928j extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C76918b f172625a;

        static {
            Covode.recordClassIndex(89924);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76928j(C76918b bVar) {
            super(2);
            this.f172625a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, Integer num) {
            num.intValue();
            C89219l.m154721d(bVar, "");
            this.f172625a.mo120491C();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.c.b$i */
    static final class C76927i extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C76918b f172624a;

        static {
            Covode.recordClassIndex(89923);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76927i(C76918b bVar) {
            super(2);
            this.f172624a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(bVar, "");
            this.f172624a.mo120491C().f163027i = booleanValue;
            AbstractC63154aa.AbstractC63159d dVar = this.f172624a.mo120491C().f163024f;
            if (dVar != null) {
                dVar.mo101582a(booleanValue);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.c.b$k */
    static final class C76929k extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C20526p, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C76918b f172626a;

        static {
            Covode.recordClassIndex(89925);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76929k(C76918b bVar) {
            super(2);
            this.f172626a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C20526p pVar) {
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(pVar, "");
            this.f172626a.mo120494G().mo127539a(C70976bp.m125317m(this.f172626a.mo120497J()));
            this.f172626a.mo120498K();
            this.f172626a.mo120491C().mo114973a(1, true);
            AbstractC63154aa.AbstractC63159d dVar = this.f172626a.mo120491C().f163024f;
            if (dVar != null) {
                dVar.mo101590k();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.c.b$l */
    static final class C76930l extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C20522l, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C76918b f172627a;

        static {
            Covode.recordClassIndex(89926);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76930l(C76918b bVar) {
            super(2);
            this.f172627a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C20522l lVar) {
            C20522l lVar2 = lVar;
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(lVar2, "");
            Float f = (Float) lVar2.mo33723a();
            if (f != null) {
                this.f172627a.mo120497J().voiceVolume = f.floatValue();
                this.f172627a.mo120492D().mo120503b((int) (this.f172627a.mo120497J().voiceVolume * 100.0f));
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View$OnClickListenerC72712e C = mo120491C();
        Activity activity = this.f52549m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        C.mo114974a((ActivityC0218d) activity);
        View$OnClickListenerC72712e C2 = mo120491C();
        Activity activity2 = this.f52549m;
        if (!(activity2 instanceof AbstractC84919c)) {
            activity2 = null;
        }
        C2.f163021c = (AbstractC84919c) activity2;
        View$OnClickListenerC72712e C3 = mo120491C();
        View a = C1764a.m5927a(layoutInflater, R.layout.as8, viewGroup, false);
        Objects.requireNonNull(a, "null cannot be cast to non-null type android.widget.FrameLayout");
        C3.f163020b = (FrameLayout) a;
        FrameLayout frameLayout = mo120491C().f163020b;
        if (frameLayout == null) {
            C89219l.m154715b();
        }
        return frameLayout;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2722cy.p2723a.AbstractC40895j
    /* renamed from: a */
    public final void mo70092a(View view, int i) {
        String str;
        String str2;
        C89219l.m154721d(view, "");
        C69905c a = mo120491C().mo114972a(i);
        VideoPublishEditModel J = mo120497J();
        if (a == null || (str = a.getMusicId()) == null) {
            str = "";
        }
        C89219l.m154716b(str, "");
        int i2 = i + 1;
        mo120491C();
        int a2 = View$OnClickListenerC72712e.m128171a();
        if (mo120491C().mo114979e() == 0) {
            str2 = "recommend";
        } else {
            str2 = "favorite";
        }
        C70968bl.m125256a(J, str, i2, a2, str2, false);
        mo120497J().mMusicShowRank = i2;
        VideoPublishEditModel J2 = mo120497J();
        mo120491C();
        J2.mMusicRecType = View$OnClickListenerC72712e.m128171a();
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af> AbstractC88412b subscribe(JediViewModel<S> jediViewModel, C20370ah<S> ahVar, AbstractC89183m<? super AbstractC20477i, ? super S, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20382b.C20383a.m38583a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3853q.View$OnClickListenerC72712e.AbstractC72715b
    /* renamed from: a */
    public final void mo114982a(String str, C69905c cVar, boolean z) {
        if (this.f52549m != null) {
            Activity activity = this.f52549m;
            if (activity == null || !activity.isFinishing()) {
                m134524L().mo127276a(str, cVar, z);
            }
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
