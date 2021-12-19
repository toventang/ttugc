package com.p2082ss.android.ugc.gamora.editor.sticker.panel;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
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
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.scene.AbstractC22219j;
import com.bytedance.scene.ktx.C22228c;
import com.bytedance.tux.dialog.C23013a;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.p1713b.C23024a;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.bytedance.tux.dialog.p1713b.C23028c;
import com.facebook.imagepipeline.p1880e.C24413h;
import com.facebook.imagepipeline.p1880e.C24428k;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.commentStickerPanel.CommentAndQuestionAndQuestionStickerPanelViewModel;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.effect.C46381v;
import com.p2082ss.android.ugc.aweme.effect.C46391x;
import com.p2082ss.android.ugc.aweme.effect.CallbackAPI;
import com.p2082ss.android.ugc.aweme.infoSticker.AbstractC56722g;
import com.p2082ss.android.ugc.aweme.infoSticker.C56719e;
import com.p2082ss.android.ugc.aweme.infoSticker.C56721f;
import com.p2082ss.android.ugc.aweme.infoSticker.C56723h;
import com.p2082ss.android.ugc.aweme.infoSticker.customsticker.model.CustomStickerExtra;
import com.p2082ss.android.ugc.aweme.out.AVServiceImpl;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.property.C65426di;
import com.p2082ss.android.ugc.aweme.setting.p3721i.C68087b;
import com.p2082ss.android.ugc.aweme.shortvideo.C70747dv;
import com.p2082ss.android.ugc.aweme.shortvideo.C71817eu;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70968bl;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.model.ShortVideoCommonParams;
import com.p2082ss.android.ugc.aweme.shortvideo.p3854r.C72724a;
import com.p2082ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p2082ss.android.ugc.aweme.sticker.data.QaStruct;
import com.p2082ss.android.ugc.aweme.utils.C80322d;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.p2082ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.p2082ss.android.ugc.gamora.editor.C83389x;
import com.p2082ss.android.ugc.gamora.editor.EditCommentStickerViewModel;
import com.p2082ss.android.ugc.gamora.editor.sticker.p4290qa.EditPageQaStickerViewModel;
import com.p2082ss.android.ugc.gamora.editor.sticker.panel.EditStickerPanelViewModel;
import com.p2082ss.android.ugc.tools.infosticker.p4354a.p4356b.C84606n;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84694f;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84701l;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.main.InfoStickerViewModel;
import com.p2082ss.android.ugc.tools.infosticker.view.p4360a.AbstractC84635f;
import com.p2082ss.android.ugc.tools.infosticker.view.p4360a.C84636g;
import com.p2082ss.android.ugc.tools.infosticker.view.p4360a.EnumC84638i;
import com.p2082ss.android.ugc.tools.infosticker.view.p4360a.EnumC84639j;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.utils.C84909p;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84917a;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84919c;
import com.p2082ss.android.ugc.tools.view.widget.C85052j;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import okhttp3.AbstractC90025ab;
import okhttp3.C90022aa;
import okhttp3.C90208y;
import okhttp3.Request;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
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

/* renamed from: com.ss.android.ugc.gamora.editor.sticker.panel.c */
public class C82910c extends AbstractC22219j implements AbstractC20382b, AbstractC21566a {

    /* renamed from: b */
    static final /* synthetic */ AbstractC89286i[] f185278b = {new C89232y(C82910c.class, "mModel", "getMModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0)};

    /* renamed from: j */
    public static final int f185279j = C65426di.m117144a();

    /* renamed from: k */
    public static final C82915e f185280k = new C82915e((byte) 0);

    /* renamed from: a */
    private final AbstractC89244h f185281a;

    /* renamed from: c */
    public String f185282c = "click_button";

    /* renamed from: d */
    public boolean f185283d;

    /* renamed from: e */
    public long f185284e;

    /* renamed from: f */
    final AbstractC89244h f185285f;

    /* renamed from: g */
    final Set<String> f185286g;

    /* renamed from: h */
    public AbstractC56722g f185287h;

    /* renamed from: i */
    public final C88411a f185288i;

    /* renamed from: l */
    private final AbstractC89244h f185289l;

    /* renamed from: t */
    private final AbstractC89244h f185290t;

    /* renamed from: u */
    private final AbstractC89244h f185291u;

    /* renamed from: v */
    private final AbstractC89248d f185292v;

    /* renamed from: w */
    private final AbstractC89244h f185293w;

    /* renamed from: x */
    private final C21582f f185294x;

    /* renamed from: C */
    public final EditPageQaStickerViewModel mo127991C() {
        return (EditPageQaStickerViewModel) this.f185291u.getValue();
    }

    /* renamed from: D */
    public final VideoPublishEditModel mo127992D() {
        return (VideoPublishEditModel) this.f185292v.mo23374a(this, f185278b[0]);
    }

    /* renamed from: E */
    public final AbstractC84635f mo127993E() {
        return (AbstractC84635f) this.f185293w.getValue();
    }

    /* renamed from: a */
    public final EditStickerPanelViewModel mo127994a() {
        return (EditStickerPanelViewModel) this.f185281a.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo120520a(Effect effect) {
        C89219l.m154721d(effect, "");
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo120521a(EffectCategoryResponse effectCategoryResponse) {
        C89219l.m154721d(effectCategoryResponse, "");
        return false;
    }

    /* renamed from: b */
    public final CommentAndQuestionAndQuestionStickerPanelViewModel mo127998b() {
        return (CommentAndQuestionAndQuestionStickerPanelViewModel) this.f185289l.getValue();
    }

    /* renamed from: d */
    public final EditCommentStickerViewModel mo127999d() {
        return (EditCommentStickerViewModel) this.f185290t.getValue();
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.panel.c$e */
    public static final class C82915e {
        static {
            Covode.recordClassIndex(96775);
        }

        private C82915e() {
        }

        public /* synthetic */ C82915e(byte b) {
            this();
        }
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public C21582f getDiContainer() {
        return this.f185294x;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20367ae
    public /* bridge */ /* synthetic */ AbstractC20477i getReceiver() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20534v
    public AbstractC1204m getLifecycleOwner() {
        return AbstractC20382b.C20383a.m38581a(this);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public AbstractC20534v getLifecycleOwnerHolder() {
        return AbstractC20382b.C20383a.m38601b(this);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public AbstractC20367ae<AbstractC20477i> getReceiverHolder() {
        return AbstractC20382b.C20383a.m38604c(this);
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: n_ */
    public final void mo22713n_() {
        super.mo22713n_();
        if (!this.f185288i.isDisposed()) {
            this.f185288i.dispose();
        }
    }

    static {
        Covode.recordClassIndex(96770);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.panel.c$a */
    public static final class C82911a extends AbstractC89220m implements AbstractC89171a<EditStickerPanelViewModel> {

        /* renamed from: a */
        final /* synthetic */ AbstractC22219j f185295a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f185296b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f185297c;

        static {
            Covode.recordClassIndex(96771);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82911a(AbstractC22219j jVar, AbstractC89277c cVar, AbstractC89277c cVar2) {
            super(0);
            this.f185295a = jVar;
            this.f185296b = cVar;
            this.f185297c = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.gamora.editor.sticker.panel.EditStickerPanelViewModel] */
        /* JADX WARN: Type inference failed for: r0v15, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.gamora.editor.sticker.panel.EditStickerPanelViewModel] */
        /* JADX WARNING: Unknown variable types count: 2 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.sticker.panel.EditStickerPanelViewModel invoke() {
            /*
                r6 = this;
                com.bytedance.scene.j r0 = r6.f185295a
                com.bytedance.scene.j r5 = r0.f52551o
                h.k.c r0 = r6.f185297c
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                java.lang.String r3 = r0.getCanonicalName()
                java.lang.String r4 = ""
                p4600h.p4611f.p4613b.C89219l.m154716b(r3, r4)
            L_0x0013:
                if (r5 == 0) goto L_0x003a
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ad r2 = com.bytedance.scene.C22267s.m41934a(r5, r0)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.f185297c     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)     // Catch:{ as -> 0x0035 }
                java.lang.String r1 = r0.getCanonicalName()     // Catch:{ as -> 0x0035 }
                p4600h.p4611f.p4613b.C89219l.m154716b(r1, r4)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.f185296b     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ac r0 = m143209xc7aee552(r2, r1, r0)     // Catch:{ as -> 0x0035 }
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0     // Catch:{ as -> 0x0035 }
                goto L_0x0038
            L_0x0035:
                com.bytedance.scene.j r5 = r5.f52551o
                goto L_0x0013
            L_0x0038:
                if (r0 != 0) goto L_0x0052
            L_0x003a:
                com.bytedance.scene.j r0 = r6.f185295a
                androidx.fragment.app.e r1 = com.bytedance.scene.ktx.C22228c.m41832b(r0)
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a
                androidx.lifecycle.ad r1 = androidx.lifecycle.C1181ae.m3881a(r1, r0)
                h.k.c r0 = r6.f185296b
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                androidx.lifecycle.ac r0 = m143209xc7aee552(r1, r3, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0052:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.sticker.panel.C82910c.C82911a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_gamora_editor_sticker_panel_EditStickerPanelScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m143209xc7aee552(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.panel.c$b */
    public static final class C82912b extends AbstractC89220m implements AbstractC89171a<CommentAndQuestionAndQuestionStickerPanelViewModel> {

        /* renamed from: a */
        final /* synthetic */ AbstractC22219j f185298a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f185299b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f185300c;

        static {
            Covode.recordClassIndex(96772);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82912b(AbstractC22219j jVar, AbstractC89277c cVar, AbstractC89277c cVar2) {
            super(0);
            this.f185298a = jVar;
            this.f185299b = cVar;
            this.f185300c = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [com.ss.android.ugc.aweme.commentStickerPanel.CommentAndQuestionAndQuestionStickerPanelViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v15, types: [com.ss.android.ugc.aweme.commentStickerPanel.CommentAndQuestionAndQuestionStickerPanelViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 2 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.commentStickerPanel.CommentAndQuestionAndQuestionStickerPanelViewModel invoke() {
            /*
                r6 = this;
                com.bytedance.scene.j r0 = r6.f185298a
                com.bytedance.scene.j r5 = r0.f52551o
                h.k.c r0 = r6.f185300c
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                java.lang.String r3 = r0.getCanonicalName()
                java.lang.String r4 = ""
                p4600h.p4611f.p4613b.C89219l.m154716b(r3, r4)
            L_0x0013:
                if (r5 == 0) goto L_0x003a
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ad r2 = com.bytedance.scene.C22267s.m41934a(r5, r0)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.f185300c     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)     // Catch:{ as -> 0x0035 }
                java.lang.String r1 = r0.getCanonicalName()     // Catch:{ as -> 0x0035 }
                p4600h.p4611f.p4613b.C89219l.m154716b(r1, r4)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.f185299b     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ac r0 = m143210xdb56b8d3(r2, r1, r0)     // Catch:{ as -> 0x0035 }
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0     // Catch:{ as -> 0x0035 }
                goto L_0x0038
            L_0x0035:
                com.bytedance.scene.j r5 = r5.f52551o
                goto L_0x0013
            L_0x0038:
                if (r0 != 0) goto L_0x0052
            L_0x003a:
                com.bytedance.scene.j r0 = r6.f185298a
                androidx.fragment.app.e r1 = com.bytedance.scene.ktx.C22228c.m41832b(r0)
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a
                androidx.lifecycle.ad r1 = androidx.lifecycle.C1181ae.m3881a(r1, r0)
                h.k.c r0 = r6.f185299b
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                androidx.lifecycle.ac r0 = m143210xdb56b8d3(r1, r3, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0052:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.sticker.panel.C82910c.C82912b.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_gamora_editor_sticker_panel_EditStickerPanelScene$$special$$inlined$hostViewModel$2_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m143210xdb56b8d3(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.panel.c$c */
    public static final class C82913c extends AbstractC89220m implements AbstractC89171a<EditCommentStickerViewModel> {

        /* renamed from: a */
        final /* synthetic */ AbstractC22219j f185301a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f185302b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f185303c;

        static {
            Covode.recordClassIndex(96773);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82913c(AbstractC22219j jVar, AbstractC89277c cVar, AbstractC89277c cVar2) {
            super(0);
            this.f185301a = jVar;
            this.f185302b = cVar;
            this.f185303c = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [com.ss.android.ugc.gamora.editor.EditCommentStickerViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v15, types: [com.ss.android.ugc.gamora.editor.EditCommentStickerViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 2 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.EditCommentStickerViewModel invoke() {
            /*
                r6 = this;
                com.bytedance.scene.j r0 = r6.f185301a
                com.bytedance.scene.j r5 = r0.f52551o
                h.k.c r0 = r6.f185303c
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                java.lang.String r3 = r0.getCanonicalName()
                java.lang.String r4 = ""
                p4600h.p4611f.p4613b.C89219l.m154716b(r3, r4)
            L_0x0013:
                if (r5 == 0) goto L_0x003a
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ad r2 = com.bytedance.scene.C22267s.m41934a(r5, r0)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.f185303c     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)     // Catch:{ as -> 0x0035 }
                java.lang.String r1 = r0.getCanonicalName()     // Catch:{ as -> 0x0035 }
                p4600h.p4611f.p4613b.C89219l.m154716b(r1, r4)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.f185302b     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ac r0 = m143211xeefe8c54(r2, r1, r0)     // Catch:{ as -> 0x0035 }
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0     // Catch:{ as -> 0x0035 }
                goto L_0x0038
            L_0x0035:
                com.bytedance.scene.j r5 = r5.f52551o
                goto L_0x0013
            L_0x0038:
                if (r0 != 0) goto L_0x0052
            L_0x003a:
                com.bytedance.scene.j r0 = r6.f185301a
                androidx.fragment.app.e r1 = com.bytedance.scene.ktx.C22228c.m41832b(r0)
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a
                androidx.lifecycle.ad r1 = androidx.lifecycle.C1181ae.m3881a(r1, r0)
                h.k.c r0 = r6.f185302b
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                androidx.lifecycle.ac r0 = m143211xeefe8c54(r1, r3, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0052:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.sticker.panel.C82910c.C82913c.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_gamora_editor_sticker_panel_EditStickerPanelScene$$special$$inlined$hostViewModel$3_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m143211xeefe8c54(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.panel.c$d */
    public static final class C82914d extends AbstractC89220m implements AbstractC89171a<EditPageQaStickerViewModel> {

        /* renamed from: a */
        final /* synthetic */ AbstractC22219j f185304a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f185305b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f185306c;

        static {
            Covode.recordClassIndex(96774);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82914d(AbstractC22219j jVar, AbstractC89277c cVar, AbstractC89277c cVar2) {
            super(0);
            this.f185304a = jVar;
            this.f185305b = cVar;
            this.f185306c = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [com.ss.android.ugc.gamora.editor.sticker.qa.EditPageQaStickerViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v15, types: [com.ss.android.ugc.gamora.editor.sticker.qa.EditPageQaStickerViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 2 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.sticker.p4290qa.EditPageQaStickerViewModel invoke() {
            /*
                r6 = this;
                com.bytedance.scene.j r0 = r6.f185304a
                com.bytedance.scene.j r5 = r0.f52551o
                h.k.c r0 = r6.f185306c
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                java.lang.String r3 = r0.getCanonicalName()
                java.lang.String r4 = ""
                p4600h.p4611f.p4613b.C89219l.m154716b(r3, r4)
            L_0x0013:
                if (r5 == 0) goto L_0x003a
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ad r2 = com.bytedance.scene.C22267s.m41934a(r5, r0)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.f185306c     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)     // Catch:{ as -> 0x0035 }
                java.lang.String r1 = r0.getCanonicalName()     // Catch:{ as -> 0x0035 }
                p4600h.p4611f.p4613b.C89219l.m154716b(r1, r4)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.f185305b     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ac r0 = m143212x2a65fd5(r2, r1, r0)     // Catch:{ as -> 0x0035 }
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0     // Catch:{ as -> 0x0035 }
                goto L_0x0038
            L_0x0035:
                com.bytedance.scene.j r5 = r5.f52551o
                goto L_0x0013
            L_0x0038:
                if (r0 != 0) goto L_0x0052
            L_0x003a:
                com.bytedance.scene.j r0 = r6.f185304a
                androidx.fragment.app.e r1 = com.bytedance.scene.ktx.C22228c.m41832b(r0)
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a
                androidx.lifecycle.ad r1 = androidx.lifecycle.C1181ae.m3881a(r1, r0)
                h.k.c r0 = r6.f185305b
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                androidx.lifecycle.ac r0 = m143212x2a65fd5(r1, r3, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0052:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.sticker.panel.C82910c.C82914d.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_gamora_editor_sticker_panel_EditStickerPanelScene$$special$$inlined$hostViewModel$4_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m143212x2a65fd5(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.panel.c$r */
    static final class C82937r extends AbstractC89220m implements AbstractC89171a<AbstractC84635f> {

        /* renamed from: a */
        final /* synthetic */ C82910c f185336a;

        static {
            Covode.recordClassIndex(96797);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82937r(C82910c cVar) {
            super(0);
            this.f185336a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC84635f invoke() {
            boolean z;
            View view = this.f185336a.f52550n;
            Objects.requireNonNull(view, "null cannot be cast to non-null type android.widget.FrameLayout");
            FrameLayout frameLayout = (FrameLayout) view;
            C82910c cVar = this.f185336a;
            AbstractC84701l lVar = (AbstractC84701l) cVar.f185285f.getValue();
            if (!C16048b.m29633a().mo25421a(true, "enable_search_gif", false) || C63244g.m114602a().mo73255A().mo93901a()) {
                z = false;
            } else {
                z = true;
            }
            boolean a = C68087b.m120389a();
            boolean a2 = C68087b.m120389a();
            C89219l.m154721d(frameLayout, "");
            C89219l.m154721d(cVar, "");
            C89219l.m154721d(lVar, "");
            return new C83389x.C83390a(frameLayout, cVar, lVar, z, a, a2, frameLayout, cVar, lVar, new C83389x.C83393b(z, a, a2));
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.panel.c$s */
    static final class C82938s extends AbstractC89220m implements AbstractC89171a<InfoStickerViewModel> {

        /* renamed from: a */
        final /* synthetic */ C82910c f185337a;

        static {
            Covode.recordClassIndex(96798);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82938s(C82910c cVar) {
            super(0);
            this.f185337a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX WARNING: Code restructure failed: missing block: B:74:0x019e, code lost:
            if (com.p2082ss.android.ugc.tools.utils.C84912r.m145934b(r3, (float) com.p2082ss.android.ugc.aweme.shortvideo.C70636dh.m124836e(r18.f185337a.f52549m)) <= com.p2082ss.android.ugc.gamora.editor.sticker.panel.C82910c.f185279j) goto L_0x01a0;
         */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ com.p2082ss.android.ugc.tools.infosticker.view.internal.main.InfoStickerViewModel invoke() {
            /*
            // Method dump skipped, instructions count: 636
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.sticker.panel.C82910c.C82938s.invoke():java.lang.Object");
        }

        /* renamed from: com.ss.android.ugc.gamora.editor.sticker.panel.c$s$a */
        static final class C82941a extends AbstractC89220m implements AbstractC89172b<EffectCategoryResponse, Boolean> {

            /* renamed from: a */
            final /* synthetic */ C82938s f185341a;

            static {
                Covode.recordClassIndex(96801);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C82941a(C82938s sVar) {
                super(1);
                this.f185341a = sVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ Boolean invoke(EffectCategoryResponse effectCategoryResponse) {
                EffectCategoryResponse effectCategoryResponse2 = effectCategoryResponse;
                C89219l.m154721d(effectCategoryResponse2, "");
                return Boolean.valueOf(!this.f185341a.f185337a.mo120521a(effectCategoryResponse2));
            }
        }

        /* renamed from: com.ss.android.ugc.gamora.editor.sticker.panel.c$s$b */
        static final class C82942b extends AbstractC89220m implements AbstractC89172b<Effect, Boolean> {

            /* renamed from: a */
            final /* synthetic */ C82938s f185342a;

            /* renamed from: b */
            final /* synthetic */ boolean f185343b;

            /* renamed from: c */
            final /* synthetic */ boolean f185344c;

            /* renamed from: d */
            final /* synthetic */ boolean f185345d;

            /* renamed from: e */
            final /* synthetic */ boolean f185346e;

            /* renamed from: f */
            final /* synthetic */ boolean f185347f;

            /* renamed from: g */
            final /* synthetic */ boolean f185348g;

            /* renamed from: h */
            final /* synthetic */ C89233z.C89234a f185349h;

            /* renamed from: i */
            final /* synthetic */ boolean f185350i;

            static {
                Covode.recordClassIndex(96802);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C82942b(C82938s sVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, C89233z.C89234a aVar, boolean z7) {
                super(1);
                this.f185342a = sVar;
                this.f185343b = z;
                this.f185344c = z2;
                this.f185345d = z3;
                this.f185346e = z4;
                this.f185347f = z5;
                this.f185348g = z6;
                this.f185349h = aVar;
                this.f185350i = z7;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX WARNING: Code restructure failed: missing block: B:28:0x006c, code lost:
                if (com.p2082ss.android.ugc.aweme.port.p3561in.C63244g.m114602a().mo73255A().mo93901a() != false) goto L_0x0013;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:34:0x007d, code lost:
                if (com.p2082ss.android.ugc.aweme.infoSticker.C56723h.m102737e(r5) != false) goto L_0x0013;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:38:0x0090, code lost:
                if (r4.f185348g == false) goto L_0x0092;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:40:0x0096, code lost:
                if (com.p2082ss.android.ugc.aweme.infoSticker.C56723h.m102741i(r5) != false) goto L_0x0013;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:42:0x009e, code lost:
                if (r4.f185349h.element != false) goto L_0x00a8;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a4, code lost:
                if (com.p2082ss.android.ugc.aweme.infoSticker.C56723h.m102735c(r5) == false) goto L_0x00a8;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:46:0x00aa, code lost:
                if (r4.f185350i != false) goto L_0x0014;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b0, code lost:
                if (com.p2082ss.android.ugc.aweme.infoSticker.C56723h.m102734b(r5) == false) goto L_0x0014;
             */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final /* synthetic */ java.lang.Boolean invoke(com.p2082ss.android.ugc.effectmanager.effect.model.Effect r5) {
                /*
                // Method dump skipped, instructions count: 180
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.sticker.panel.C82910c.C82938s.C82942b.invoke(java.lang.Object):java.lang.Object");
            }
        }
    }

    /* renamed from: a */
    public final void mo127995a(AbstractC56722g gVar) {
        C89219l.m154721d(gVar, "");
        this.f185287h = gVar;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af> S1 getState(VM1 vm1) {
        C89219l.m154721d(vm1, "");
        return (S1) AbstractC20382b.C20383a.m38582a(this, vm1);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.panel.c$p */
    static final class C82935p extends AbstractC89220m implements AbstractC89172b<C20521k, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82910c f185334a;

        static {
            Covode.recordClassIndex(96795);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82935p(C82910c cVar) {
            super(1);
            this.f185334a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C20521k kVar) {
            boolean z;
            T t;
            C20521k kVar2 = kVar;
            C82910c cVar = this.f185334a;
            if (kVar2 == null || (t = kVar2.f48283b) == null) {
                z = false;
            } else {
                z = t.booleanValue();
            }
            cVar.f185283d = z;
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.panel.c$k */
    static final class C82930k<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C82910c f185327a;

        static {
            Covode.recordClassIndex(96790);
        }

        C82930k(C82910c cVar) {
            this.f185327a = cVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C89378p pVar = (C89378p) obj;
            if (((Boolean) pVar.getSecond()).booleanValue()) {
                EditStickerPanelViewModel a = this.f185327a.mo127994a();
                ProviderEffect providerEffect = (ProviderEffect) pVar.getFirst();
                C89219l.m154721d(providerEffect, "");
                Effect a2 = C56721f.m102728a(providerEffect);
                C89219l.m154716b(a2, "");
                a.mo127988a(a2, (String) null);
                return;
            }
            C85052j.C85053a.m146245a(this.f185327a.mo36484r(), (int) R.string.bop, 0).mo129996a();
        }
    }

    /* renamed from: d */
    public final void mo128000d(int i) {
        if (this.f185284e > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.f185284e;
            this.f185284e = -1;
            if (currentTimeMillis > 0) {
                C80322d.m139251a("tool_performance_enter_sticker_tab", C70968bl.m125280l(mo127992D()).mo129404a("duration", currentTimeMillis).mo129406a("status", String.valueOf(i)).f188764a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.panel.c$n */
    static final class C82933n<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C82910c f185332a;

        static {
            Covode.recordClassIndex(96793);
        }

        C82933n(C82910c cVar) {
            this.f185332a = cVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C82910c cVar = this.f185332a;
            C84425b a = C70968bl.m125280l(cVar.mo127992D()).mo129403a("scene_id", 1002).mo129406a("creation_id", cVar.mo127992D().creationId).mo129406a("shoot_way", cVar.mo127992D().mShootWay).mo129406a("tab_name", ((AbstractC84694f.C84695a) ((C89378p) obj).component1()).f189221b).mo129406a("enter_from", "video_edit_page");
            if (cVar.mo127992D().draftId != 0) {
                a.mo129403a("draft_id", cVar.mo127992D().draftId);
            }
            String str = cVar.mo127992D().newDraftId;
            C89219l.m154716b(str, "");
            if (str.length() > 0) {
                a.mo129406a("new_draft_id", cVar.mo127992D().newDraftId);
            }
            C80322d.m139251a("click_prop_tab", a.f188764a);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.panel.c$f */
    static final class C82916f<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C82910c f185307a;

        static {
            Covode.recordClassIndex(96776);
        }

        C82916f(C82910c cVar) {
            this.f185307a = cVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            String valueOf;
            C89378p pVar = (C89378p) obj;
            if (((Boolean) pVar.getSecond()).booleanValue()) {
                EditStickerPanelViewModel a = this.f185307a.mo127994a();
                Effect effect = (Effect) pVar.getFirst();
                C89219l.m154721d(effect, "");
                if (effect.getTags().contains("weather")) {
                    return;
                }
                if (C56723h.m102739g(effect)) {
                    a.mo33689c(new EditStickerPanelViewModel.C82901a(effect));
                    return;
                }
                if (!effect.getTags().contains("weather")) {
                    if (effect.getTags().contains("time") || effect.getTags().contains("date")) {
                        valueOf = String.valueOf(System.currentTimeMillis() / 1000);
                        a.mo127988a(effect, valueOf);
                        return;
                    } else if (C56723h.m102739g(effect)) {
                    }
                }
                valueOf = null;
                a.mo127988a(effect, valueOf);
                return;
            }
            C85052j.C85053a.m146245a(this.f185307a.mo36484r(), (int) R.string.bop, 0).mo129996a();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.panel.c$l */
    static final class C82931l<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C82910c f185328a;

        /* renamed from: b */
        final /* synthetic */ AbstractC84919c f185329b;

        /* renamed from: c */
        final /* synthetic */ AbstractC84917a f185330c;

        static {
            Covode.recordClassIndex(96791);
        }

        C82931l(C82910c cVar, AbstractC84919c cVar2, AbstractC84917a aVar) {
            this.f185328a = cVar;
            this.f185329b = cVar2;
            this.f185330c = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Boolean bool = (Boolean) obj;
            C89219l.m154716b(bool, "");
            if (bool.booleanValue()) {
                C82910c cVar = this.f185328a;
                C84425b a = C70968bl.m125280l(cVar.mo127992D()).mo129403a("scene_id", 1002).mo129406a("creation_id", cVar.mo127992D().creationId).mo129406a("shoot_way", cVar.mo127992D().mShootWay).mo129406a("enter_from", "video_edit_page").mo129406a("content_type", cVar.mo127992D().getAvetParameter().getContentType()).mo129406a("content_source", cVar.mo127992D().getAvetParameter().getContentSource()).mo129403a("is_multi_content", C70968bl.m125279k(cVar.mo127992D())).mo129406a("enter_method", cVar.f185282c).mo129406a("from_group_id", C70747dv.m124972a());
                if (cVar.mo127992D().draftId != 0) {
                    a.mo129403a("draft_id", cVar.mo127992D().draftId);
                }
                if (!TextUtils.isEmpty(cVar.mo127992D().newDraftId)) {
                    a.mo129406a("new_draft_id", cVar.mo127992D().newDraftId);
                }
                C80322d.m139251a("click_prop_entrance", a.f188764a);
            }
            if (bool.booleanValue()) {
                AbstractC84919c cVar2 = this.f185329b;
                if (cVar2 != null) {
                    cVar2.mo87533b(this.f185330c);
                }
                AbstractC56722g gVar = this.f185328a.f185287h;
                if (gVar != null) {
                    gVar.mo87911L();
                    return;
                }
                return;
            }
            AbstractC84919c cVar3 = this.f185329b;
            if (cVar3 != null) {
                cVar3.mo87535c(this.f185330c);
            }
            AbstractC56722g gVar2 = this.f185328a.f185287h;
            if (gVar2 != null) {
                gVar2.mo87912M();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.panel.c$m */
    static final class C82932m<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C82910c f185331a;

        static {
            Covode.recordClassIndex(96792);
        }

        C82932m(C82910c cVar) {
            this.f185331a = cVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            boolean z;
            C89378p pVar = (C89378p) obj;
            if (((Boolean) pVar.getFirst()).booleanValue()) {
                C82910c cVar = this.f185331a;
                String str = (String) pVar.getSecond();
                if (str == null || str.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                String str2 = null;
                if (z) {
                    Context r = cVar.mo36484r();
                    if (r != null) {
                        str2 = r.getString(R.string.fg1);
                    }
                } else {
                    Context r2 = cVar.mo36484r();
                    if (r2 != null) {
                        str2 = r2.getString(R.string.fg0);
                    }
                }
                C63244g.m114602a().mo73263I().mo101634a("sticker_search_keyword", C70968bl.m125280l(cVar.mo127992D()).mo129406a("creation_id", cVar.mo127992D().creationId).mo129406a("shoot_way", cVar.mo127992D().mShootWay).mo129406a("content_source", cVar.mo127992D().getAvetParameter().getContentSource()).mo129406a("content_type", cVar.mo127992D().getAvetParameter().getContentType()).mo129406a("enter_from", "video_edit_page").mo129406a("tab_name", str2).f188764a);
            }
        }
    }

    public C82910c(C21582f fVar) {
        C89219l.m154721d(fVar, "");
        this.f185294x = fVar;
        AbstractC89277c a = C89204ab.m154669a(EditStickerPanelViewModel.class);
        this.f185281a = C89250i.m154773a((AbstractC89171a) new C82911a(this, a, a));
        AbstractC89277c a2 = C89204ab.m154669a(CommentAndQuestionAndQuestionStickerPanelViewModel.class);
        this.f185289l = C89250i.m154773a((AbstractC89171a) new C82912b(this, a2, a2));
        AbstractC89277c a3 = C89204ab.m154669a(EditCommentStickerViewModel.class);
        this.f185290t = C89250i.m154773a((AbstractC89171a) new C82913c(this, a3, a3));
        AbstractC89277c a4 = C89204ab.m154669a(EditPageQaStickerViewModel.class);
        this.f185291u = C89250i.m154773a((AbstractC89171a) new C82914d(this, a4, a4));
        this.f185284e = -1;
        this.f185292v = C21572a.m40504a(getDiContainer(), VideoPublishEditModel.class);
        this.f185285f = C89250i.m154773a((AbstractC89171a) new C82938s(this));
        this.f185293w = C89250i.m154773a((AbstractC89171a) new C82937r(this));
        this.f185286g = new LinkedHashSet();
        this.f185288i = new C88411a();
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo22704a(Bundle bundle) {
        super.mo22704a(bundle);
        Activity activity = this.f52549m;
        if (!(activity instanceof AbstractC84919c)) {
            activity = null;
        }
        C82936q qVar = new C82936q(this);
        this.f185288i.mo142945a(mo127993E().mo129548e().mo143254a(new C82916f(this), C84909p.f189747a));
        this.f185288i.mo142945a(mo127993E().mo129549f().mo143254a(new C82930k(this), C84909p.f189747a));
        this.f185288i.mo142945a(mo127993E().mo129546c().mo143254a(new C82931l(this, (AbstractC84919c) activity, qVar), C84909p.f189747a));
        this.f185288i.mo142945a(mo127993E().mo129550g().mo143254a(new C82932m(this), C84909p.f189747a));
        this.f185288i.mo142945a(mo127993E().mo129547d().mo143254a(new C82933n(this), C84909p.f189747a));
        this.f185288i.mo142945a(mo127993E().mo129551h().mo143254a(new C82934o(this), C84909p.f189747a));
        EditCommentStickerViewModel d = mo127999d();
        Activity activity2 = this.f52549m;
        Objects.requireNonNull(activity2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        AbstractC88412b unused = d.m38548b((ActivityC0945e) activity2, C82947h.f185356a, new C20370ah(), new C82935p(this));
        AbstractC20382b.C20383a.m38603b(this, mo127994a(), C82948i.f185357a, new C82917g(this));
        AbstractC20382b.C20383a.m38603b(this, mo127994a(), C82944e.f185353a, new C82919h(this));
        AbstractC20382b.C20383a.m38603b(this, mo127994a(), C82945f.f185354a, new C82928i(this));
        AbstractC20382b.C20383a.m38603b(this, mo127994a(), C82946g.f185355a, new C82929j(this));
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.panel.c$o */
    static final class C82934o<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C82910c f185333a;

        static {
            Covode.recordClassIndex(96794);
        }

        C82934o(C82910c cVar) {
            this.f185333a = cVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            String str;
            Effect effect;
            Effect effect2;
            List<ProviderEffect> list;
            ProviderEffect providerEffect;
            int i;
            EnumC84638i iVar;
            C84636g gVar = (C84636g) obj;
            int i2 = C82943d.f185352b[gVar.f189102a.ordinal()];
            int i3 = 0;
            if (i2 == 1) {
                EnumC84639j jVar = gVar.f189103b;
                if (jVar != null && jVar == EnumC84639j.MAIN) {
                    C82910c cVar = this.f185333a;
                    List<Effect> list2 = gVar.f189104c;
                    if (!(list2 == null || list2.isEmpty())) {
                        ArrayList arrayList = new ArrayList();
                        for (T t : list2) {
                            if (!cVar.f185286g.contains(t.getEffectId())) {
                                arrayList.add(t);
                            }
                        }
                        int i4 = 0;
                        for (T t2 : arrayList) {
                            int i5 = i4 + 1;
                            if (i4 < 0) {
                                C89070n.m154520a();
                            }
                            T t3 = t2;
                            String effectId = t3.getEffectId();
                            com.p2082ss.ugc.effectplatform.model.EffectCategoryResponse effectCategoryResponse = (com.p2082ss.ugc.effectplatform.model.EffectCategoryResponse) C84606n.m145426b().mo129424a((Effect) t3);
                            if (effectCategoryResponse == null || (str = effectCategoryResponse.getId()) == null) {
                                str = "";
                            }
                            C84425b a = C70968bl.m125280l(cVar.mo127992D()).mo129403a("scene_id", 1002).mo129406a("prop_id", effectId).mo129406a("prop_index", t3.getGradeKey()).mo129406a("enter_method", "click_main_panel").mo129406a("creation_id", cVar.mo127992D().creationId).mo129406a("shoot_way", cVar.mo127992D().mShootWay).mo129406a("enter_from", "video_edit_page").mo129406a("category_name", "sticker").mo129406a("tab_id", str).mo129403a("is_giphy", 0).mo129403a("impr_position", i4);
                            if (cVar.mo127992D().draftId != 0) {
                                a.mo129403a("draft_id", cVar.mo127992D().draftId);
                            }
                            String str2 = cVar.mo127992D().newDraftId;
                            C89219l.m154716b(str2, "");
                            if (str2.length() > 0) {
                                a.mo129406a("new_draft_id", cVar.mo127992D().newDraftId);
                            }
                            C80322d.m139251a("prop_show", a.f188764a);
                            cVar.f185286g.add(effectId);
                            i4 = i5;
                        }
                    }
                }
            } else if (i2 == 2) {
                EffectCategoryResponse effectCategoryResponse2 = gVar.f189108g;
                if (effectCategoryResponse2 != null) {
                    VideoPublishEditModel D = this.f185333a.mo127992D();
                    String id = effectCategoryResponse2.getId();
                    C89219l.m154721d(D, "");
                    C89219l.m154721d("sticker", "");
                    C89219l.m154721d(id, "");
                    C80322d.m139251a("click_infosticker_tab", new C84425b().mo129406a("shoot_way", D.mShootWay).mo129406a("creation_id", D.creationId).mo129406a("content_type", C71817eu.m126792c(D)).mo129406a("content_source", C71817eu.m126790a(D)).mo129406a("enter_from", "video_edit_page").mo129406a("category_name", "sticker").mo129406a("tab_id", id).f188764a);
                }
            } else if (i2 == 3) {
                EnumC84639j jVar2 = gVar.f189103b;
                if (jVar2 != null) {
                    int i6 = C82943d.f185351a[jVar2.ordinal()];
                    if (i6 == 1) {
                        List<Effect> list3 = gVar.f189104c;
                        if (!(list3 == null || (effect = (Effect) C89070n.m154583g((List) list3)) == null)) {
                            C82910c cVar2 = this.f185333a;
                            Integer num = gVar.f189109h;
                            if (num != null) {
                                i3 = num.intValue();
                            }
                            cVar2.mo127996a(effect, "sticker", i3);
                        }
                    } else if (i6 == 2) {
                        List<Effect> list4 = gVar.f189104c;
                        if (!(list4 == null || (effect2 = (Effect) C89070n.m154583g((List) list4)) == null)) {
                            C82910c cVar3 = this.f185333a;
                            Integer num2 = gVar.f189109h;
                            if (num2 != null) {
                                i3 = num2.intValue();
                            }
                            cVar3.mo127996a(effect2, "emoji", i3);
                        }
                    } else if (i6 == 3 && (list = gVar.f189105d) != null && (providerEffect = (ProviderEffect) C89070n.m154583g((List) list)) != null) {
                        C82910c cVar4 = this.f185333a;
                        String str3 = gVar.f189111j;
                        Integer num3 = gVar.f189109h;
                        if (num3 != null) {
                            i = num3.intValue();
                        } else {
                            i = 0;
                        }
                        cVar4.mo127997a(providerEffect, str3, i);
                        this.f185333a.mo127994a();
                        C89219l.m154721d(providerEffect, "");
                        C89219l.m154721d(providerEffect, "");
                        String clickUrl = providerEffect.getClickUrl();
                        if (clickUrl == null) {
                            return;
                        }
                        if (C46391x.m89499a()) {
                            ((CallbackAPI) C63244g.m114602a().mo73257C().retrofitCreate(clickUrl, CallbackAPI.class)).sendCallback(clickUrl).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143255a(C46381v.C46382a.f108098a, C46381v.C46383b.f108099a, C46381v.C46384c.f108100a);
                            return;
                        }
                        Request.C90016a aVar = new Request.C90016a();
                        aVar.mo144693a("GET", (AbstractC90025ab) null).mo144691a(clickUrl);
                        C90022aa.m156235a(new C90208y().mo145086b().mo145103d(), aVar.mo144698a(), false).mo144708a(new C46381v.C46385d());
                    }
                }
            } else if (i2 == 4 && (iVar = gVar.f189115n) != null && gVar.f189103b == EnumC84639j.MAIN) {
                this.f185333a.mo128000d(iVar.ordinal());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.panel.c$q */
    static final class C82936q implements AbstractC84917a {

        /* renamed from: a */
        final /* synthetic */ C82910c f185335a;

        static {
            Covode.recordClassIndex(96796);
        }

        C82936q(C82910c cVar) {
            this.f185335a = cVar;
        }

        @Override // com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84917a
        public final boolean onKeyDown(int i, KeyEvent keyEvent) {
            if (i != 4) {
                return false;
            }
            this.f185335a.mo127994a().mo127989a((AbstractC82905a) false, (boolean) "click_button");
            return true;
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20382b.C20383a.m38593a(this, vm1, bVar);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.panel.c$j */
    static final class C82929j extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82910c f185326a;

        static {
            Covode.recordClassIndex(96789);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82929j(C82910c cVar) {
            super(2);
            this.f185326a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C89391z zVar) {
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(zVar, "");
            C85052j.C85053a.m146245a(this.f185326a.mo36484r(), (int) R.string.yx, 0).mo129996a();
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.as6, viewGroup, false);
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.panel.c$g */
    static final class C82917g extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82910c f185308a;

        static {
            Covode.recordClassIndex(96777);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82917g(C82910c cVar) {
            super(2);
            this.f185308a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, Boolean bool) {
            AbstractC20382b bVar2 = bVar;
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(bVar2, "");
            bVar2.withState(this.f185308a.mo127994a(), new AbstractC89172b<EditStickerPanelState, C89391z>(this) {
                /* class com.p2082ss.android.ugc.gamora.editor.sticker.panel.C82910c.C82917g.C829181 */

                /* renamed from: a */
                final /* synthetic */ C82917g f185309a;

                static {
                    Covode.recordClassIndex(96778);
                }

                {
                    this.f185309a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(EditStickerPanelState editStickerPanelState) {
                    EditStickerPanelState editStickerPanelState2 = editStickerPanelState;
                    C89219l.m154721d(editStickerPanelState2, "");
                    String enterMethod = editStickerPanelState2.getEnterMethod();
                    if (enterMethod == null) {
                        return null;
                    }
                    this.f185309a.f185308a.f185282c = enterMethod;
                    return C89391z.f203057a;
                }
            });
            if (booleanValue) {
                this.f185308a.mo127993E().mo129544a();
                this.f185308a.f185284e = System.currentTimeMillis();
            } else {
                this.f185308a.mo127993E().mo129545b();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.panel.c$h */
    static final class C82919h extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C89378p<? extends Effect, ? extends String>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82910c f185310a;

        static {
            Covode.recordClassIndex(96779);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82919h(C82910c cVar) {
            super(2);
            this.f185310a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C89378p<? extends Effect, ? extends String> pVar) {
            InteractStickerStruct c;
            QaStruct qaStruct;
            final C89378p<? extends Effect, ? extends String> pVar2 = pVar;
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(pVar2, "");
            final Effect effect = (Effect) pVar2.getFirst();
            AVServiceImpl.m113116a().setLastStickerId(this.f185310a.f52549m, effect.getEffectId(), 5);
            if (C56723h.m102736d(effect)) {
                C39162r.m79460a("click_video_at", new C33744d().mo59983a("enter_from", "video_edit_page").mo59983a("enter_method", "sticker").f79943a);
            }
            if (C56723h.m102734b(effect) && this.f185310a.f185283d) {
                this.f185310a.mo127998b().mo64933a(1);
                Context r = this.f185310a.mo36484r();
                if (r == null) {
                    C89219l.m154715b();
                }
                C89219l.m154716b(r, "");
                C23028c.m43435a((C23023b) C23013a.C23015a.m43405a(r).mo37479a(R.string.f49).mo37483b(R.string.f44), new AbstractC89172b<C23025b, C89391z>(this) {
                    /* class com.p2082ss.android.ugc.gamora.editor.sticker.panel.C82910c.C82919h.C829201 */

                    /* renamed from: a */
                    final /* synthetic */ C82919h f185311a;

                    /* renamed from: b */
                    final /* synthetic */ int f185312b = 1;

                    static {
                        Covode.recordClassIndex(96780);
                    }

                    {
                        this.f185311a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C89391z invoke(C23025b bVar) {
                        C23025b bVar2 = bVar;
                        C89219l.m154721d(bVar2, "");
                        bVar2.mo37416a(R.string.f47, new AbstractC89172b<C23024a, C89391z>(this) {
                            /* class com.p2082ss.android.ugc.gamora.editor.sticker.panel.C82910c.C82919h.C829201.C829211 */

                            /* renamed from: a */
                            final /* synthetic */ C829201 f185315a;

                            static {
                                Covode.recordClassIndex(96781);
                            }

                            /* renamed from: com.ss.android.ugc.gamora.editor.sticker.panel.c$h$1$1$a */
                            static final class RunnableC82922a implements Runnable {

                                /* renamed from: a */
                                final /* synthetic */ C829211 f185316a;

                                static {
                                    Covode.recordClassIndex(96782);
                                }

                                RunnableC82922a(C829211 r1) {
                                    this.f185316a = r1;
                                }

                                public final void run() {
                                    this.f185316a.f185315a.f185311a.f185310a.mo127993E().mo129545b();
                                    this.f185316a.f185315a.f185311a.f185310a.mo127999d().mo127204g();
                                    this.f185316a.f185315a.f185311a.f185310a.mo127998b().mo64941a("replace", this.f185316a.f185315a.f185312b);
                                    AbstractC56722g gVar = this.f185316a.f185315a.f185311a.f185310a.f185287h;
                                    if (gVar != null) {
                                        gVar.mo87916a(effect, (String) pVar2.getSecond());
                                    }
                                }
                            }

                            /* JADX WARN: Incorrect args count in method signature: ()V */
                            {
                                this.f185315a = r1;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // p4600h.p4611f.p4612a.AbstractC89172b
                            public final /* synthetic */ C89391z invoke(C23024a aVar) {
                                C89219l.m154721d(aVar, "");
                                C22228c.m41831a(this.f185315a.f185311a.f185310a, new RunnableC82922a(this), 200);
                                return C89391z.f203057a;
                            }
                        });
                        bVar2.mo37418b(R.string.a8y, new AbstractC89172b<C23024a, C89391z>(this) {
                            /* class com.p2082ss.android.ugc.gamora.editor.sticker.panel.C82910c.C82919h.C829201.C829232 */

                            /* renamed from: a */
                            final /* synthetic */ C829201 f185317a;

                            static {
                                Covode.recordClassIndex(96783);
                            }

                            /* JADX WARN: Incorrect args count in method signature: ()V */
                            {
                                this.f185317a = r1;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // p4600h.p4611f.p4612a.AbstractC89172b
                            public final /* synthetic */ C89391z invoke(C23024a aVar) {
                                C89219l.m154721d(aVar, "");
                                this.f185317a.f185311a.f185310a.mo127998b().mo64941a("cancel", this.f185317a.f185312b);
                                return C89391z.f203057a;
                            }
                        });
                        return C89391z.f203057a;
                    }
                }).mo37405a().mo37396b().show();
            } else if (C56723h.m102734b(effect) && (c = this.f185310a.mo127991C().mo128053k().mo128071d().mo112284c()) != null && (qaStruct = c.getQaStruct()) != null && qaStruct.getQuestionId() != 0) {
                this.f185310a.mo127998b().mo64933a(3);
                Context r2 = this.f185310a.mo36484r();
                if (r2 == null) {
                    C89219l.m154715b();
                }
                C89219l.m154716b(r2, "");
                C23028c.m43435a((C23023b) C23013a.C23015a.m43405a(r2).mo37479a(R.string.f49).mo37483b(R.string.f44), new AbstractC89172b<C23025b, C89391z>(this) {
                    /* class com.p2082ss.android.ugc.gamora.editor.sticker.panel.C82910c.C82919h.C829242 */

                    /* renamed from: a */
                    final /* synthetic */ C82919h f185318a;

                    /* renamed from: b */
                    final /* synthetic */ int f185319b = 3;

                    static {
                        Covode.recordClassIndex(96784);
                    }

                    {
                        this.f185318a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C89391z invoke(C23025b bVar) {
                        C23025b bVar2 = bVar;
                        C89219l.m154721d(bVar2, "");
                        bVar2.mo37416a(R.string.f47, new AbstractC89172b<C23024a, C89391z>(this) {
                            /* class com.p2082ss.android.ugc.gamora.editor.sticker.panel.C82910c.C82919h.C829242.C829251 */

                            /* renamed from: a */
                            final /* synthetic */ C829242 f185322a;

                            static {
                                Covode.recordClassIndex(96785);
                            }

                            /* renamed from: com.ss.android.ugc.gamora.editor.sticker.panel.c$h$2$1$a */
                            static final class RunnableC82926a implements Runnable {

                                /* renamed from: a */
                                final /* synthetic */ C829251 f185323a;

                                static {
                                    Covode.recordClassIndex(96786);
                                }

                                RunnableC82926a(C829251 r1) {
                                    this.f185323a = r1;
                                }

                                public final void run() {
                                    this.f185323a.f185322a.f185318a.f185310a.mo127993E().mo129545b();
                                    this.f185323a.f185322a.f185318a.f185310a.mo127991C().mo128053k().mo128071d().mo112285d();
                                    this.f185323a.f185322a.f185318a.f185310a.mo127998b().mo64941a("replace", this.f185323a.f185322a.f185319b);
                                    AbstractC56722g gVar = this.f185323a.f185322a.f185318a.f185310a.f185287h;
                                    if (gVar != null) {
                                        gVar.mo87916a(effect, (String) pVar2.getSecond());
                                    }
                                }
                            }

                            /* JADX WARN: Incorrect args count in method signature: ()V */
                            {
                                this.f185322a = r1;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // p4600h.p4611f.p4612a.AbstractC89172b
                            public final /* synthetic */ C89391z invoke(C23024a aVar) {
                                C89219l.m154721d(aVar, "");
                                C22228c.m41831a(this.f185322a.f185318a.f185310a, new RunnableC82926a(this), 200);
                                return C89391z.f203057a;
                            }
                        });
                        bVar2.mo37418b(R.string.a8y, new AbstractC89172b<C23024a, C89391z>(this) {
                            /* class com.p2082ss.android.ugc.gamora.editor.sticker.panel.C82910c.C82919h.C829242.C829272 */

                            /* renamed from: a */
                            final /* synthetic */ C829242 f185324a;

                            static {
                                Covode.recordClassIndex(96787);
                            }

                            /* JADX WARN: Incorrect args count in method signature: ()V */
                            {
                                this.f185324a = r1;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // p4600h.p4611f.p4612a.AbstractC89172b
                            public final /* synthetic */ C89391z invoke(C23024a aVar) {
                                C89219l.m154721d(aVar, "");
                                this.f185324a.f185318a.f185310a.mo127998b().mo64941a("cancel", this.f185324a.f185319b);
                                return C89391z.f203057a;
                            }
                        });
                        return C89391z.f203057a;
                    }
                }).mo37405a().mo37396b().show();
            } else if (C56723h.m102738f(effect)) {
                AbstractC56722g gVar = this.f185310a.f185287h;
                if (gVar != null) {
                    gVar.mo87916a(effect, (String) pVar2.getSecond());
                }
            } else {
                this.f185310a.mo127993E().mo129545b();
                AbstractC56722g gVar2 = this.f185310a.f185287h;
                if (gVar2 != null) {
                    gVar2.mo87916a(effect, (String) pVar2.getSecond());
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.panel.c$i */
    static final class C82928i extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C89378p<? extends Effect, ? extends String>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82910c f185325a;

        static {
            Covode.recordClassIndex(96788);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82928i(C82910c cVar) {
            super(2);
            this.f185325a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C89378p<? extends Effect, ? extends String> pVar) {
            C89378p<? extends Effect, ? extends String> pVar2 = pVar;
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(pVar2, "");
            String str = this.f185325a.mo127992D().mShootWay;
            String a = C71817eu.m126790a(this.f185325a.mo127992D());
            String c = C71817eu.m126792c(this.f185325a.mo127992D());
            C39162r.m79460a("click_diy_prop_entrance", new C84425b().mo129406a("enter_from", "video_edit_page").mo129406a("shoot_way", str).mo129406a("content_source", a).mo129406a("content_type", c).mo129406a("creation_id", this.f185325a.mo127992D().creationId).f188764a);
            Activity activity = this.f185325a.f52549m;
            Effect effect = (Effect) pVar2.getFirst();
            ShortVideoCommonParams shortVideoCommonParams = new ShortVideoCommonParams(this.f185325a.mo127992D().mShootWay, C71817eu.m126790a(this.f185325a.mo127992D()), C71817eu.m126792c(this.f185325a.mo127992D()), this.f185325a.mo127992D().creationId);
            C89219l.m154721d(effect, "");
            C24413h e = C24428k.m46551a().mo40247e();
            C89219l.m154716b(e, "");
            e.f57868a.mo40200a(C56719e.C56720a.f129273a);
            if (activity != null) {
                C89219l.m154721d(effect, "");
                CustomStickerExtra customStickerExtra = (CustomStickerExtra) C63244g.m114602a().mo73261G().mo46670a(effect.getExtra(), CustomStickerExtra.class);
                Bundle bundle = new Bundle();
                bundle.putInt("key_choose_scene", 10);
                bundle.putParcelable("key_custom_effect_sticker", effect);
                bundle.putInt("key_photo_select_min_count", 1);
                bundle.putInt("key_photo_select_max_count", 1);
                bundle.putInt("key_video_select_min_count", 0);
                bundle.putInt("key_max_gif_size", customStickerExtra.getGifSizeLimit());
                bundle.putInt("key_max_compress_width", customStickerExtra.getUploadWidthLimit());
                bundle.putInt("key_max_compress_height", customStickerExtra.getUploadHeightLimit());
                bundle.putInt("key_support_flag", 1);
                bundle.putString("shoot_way", shortVideoCommonParams.shootWay);
                bundle.putString("content_source", shortVideoCommonParams.contentSource);
                bundle.putString("content_type", shortVideoCommonParams.contentType);
                bundle.putString("creation_id", shortVideoCommonParams.creationId);
                C72724a.m128203a().mo62193a(activity, bundle, 10004, 10004);
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public <S extends AbstractC20368af> AbstractC88412b subscribe(JediViewModel<S> jediViewModel, C20370ah<S> ahVar, AbstractC89183m<? super AbstractC20477i, ? super S, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20382b.C20383a.m38583a(this, jediViewModel, ahVar, mVar);
    }

    /* renamed from: a */
    public final void mo127996a(Effect effect, String str, int i) {
        String str2;
        String effectId = effect.getEffectId();
        com.p2082ss.ugc.effectplatform.model.EffectCategoryResponse effectCategoryResponse = (com.p2082ss.ugc.effectplatform.model.EffectCategoryResponse) C84606n.m145426b().mo129425a(effectId);
        if (effectCategoryResponse == null || (str2 = effectCategoryResponse.getId()) == null) {
            str2 = "";
        }
        C84425b a = C70968bl.m125280l(mo127992D()).mo129403a("scene_id", 1002).mo129406a("tab_name", (String) null).mo129406a("prop_id", effectId).mo129406a("prop_index", effect.getGradeKey()).mo129406a("enter_method", "click_main_panel").mo129406a("creation_id", mo127992D().creationId).mo129406a("shoot_way", mo127992D().mShootWay).mo129406a("enter_from", "video_edit_page").mo129406a("category_name", str).mo129406a("tab_id", str2).mo129403a("is_giphy", 0).mo129403a("impr_position", i);
        if (mo127992D().draftId != 0) {
            a.mo129403a("draft_id", mo127992D().draftId);
        }
        String str3 = mo127992D().newDraftId;
        C89219l.m154716b(str3, "");
        if (str3.length() > 0) {
            a.mo129406a("new_draft_id", mo127992D().newDraftId);
        }
        C80322d.m139251a("prop_click", a.f188764a);
    }

    /* renamed from: a */
    public final void mo127997a(ProviderEffect providerEffect, String str, int i) {
        boolean z;
        String str2;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = !z;
        String str3 = null;
        if (z2) {
            Context r = mo36484r();
            if (r != null) {
                str3 = r.getString(R.string.fg0);
            }
        } else {
            Context r2 = mo36484r();
            if (r2 != null) {
                str3 = r2.getString(R.string.fg1);
            }
        }
        C84425b a = C70968bl.m125280l(mo127992D()).mo129403a("scene_id", 1002).mo129406a("tab_name", str3).mo129406a("prop_id", providerEffect.getId()).mo129406a("enter_method", "click_main_panel").mo129406a("creation_id", mo127992D().creationId).mo129406a("shoot_way", mo127992D().mShootWay).mo129406a("enter_from", "video_edit_page").mo129403a("impr_position", i);
        if (z2) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        C84425b a2 = a.mo129406a("after_search", str2).mo129406a("category_name", "sticker").mo129406a("tab_id", "giphy").mo129403a("is_giphy", 1);
        if (mo127992D().draftId != 0) {
            a2.mo129403a("draft_id", mo127992D().draftId);
        }
        String str4 = mo127992D().newDraftId;
        C89219l.m154716b(str4, "");
        if (str4.length() > 0) {
            a2.mo129406a("new_draft_id", mo127992D().newDraftId);
        }
        C80322d.m139251a("prop_click", a2.f188764a);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public <S extends AbstractC20368af, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        AbstractC20382b.C20383a.m38599a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public <S extends AbstractC20368af, A> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20382b.C20383a.m38606d(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public <S extends AbstractC20368af, A> void subscribeEvent(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends C20391d<? extends A>> kVar, C20370ah<C20373ak<C20391d<A>>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        AbstractC20382b.C20383a.m38602b(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public <S extends AbstractC20368af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends C20365ac<? extends A>> kVar, C20370ah<C20373ak<C20365ac<A>>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        AbstractC20382b.C20383a.m38605c(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public <S extends AbstractC20368af, A, B> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, C20370ah<C20374al<A, B>> ahVar, AbstractC89187q<? super AbstractC20477i, ? super A, ? super B, C89391z> qVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(qVar, "");
        return AbstractC20382b.C20383a.m38585a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public <S extends AbstractC20368af, T> AbstractC88412b asyncSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends AbstractC20362a<? extends T>> kVar, C20370ah<C20373ak<AbstractC20362a<T>>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super Throwable, C89391z> mVar, AbstractC89172b<? super AbstractC20477i, C89391z> bVar, AbstractC89183m<? super AbstractC20477i, ? super T, C89391z> mVar2) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        return AbstractC20382b.C20383a.m38584a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public <S extends AbstractC20368af, A, B, C> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, C20370ah<C20375am<A, B, C>> ahVar, AbstractC89188r<? super AbstractC20477i, ? super A, ? super B, ? super C, C89391z> rVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(rVar, "");
        return AbstractC20382b.C20383a.m38586a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public <S extends AbstractC20368af, A, B, C, D> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, AbstractC89290k<S, ? extends D> kVar4, C20370ah<C20376an<A, B, C, D>> ahVar, AbstractC89189s<? super AbstractC20477i, ? super A, ? super B, ? super C, ? super D, C89391z> sVar) {
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
