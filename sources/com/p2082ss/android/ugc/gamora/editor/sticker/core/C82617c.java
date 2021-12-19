package com.p2082ss.android.ugc.gamora.editor.sticker.core;

import android.app.Activity;
import android.content.ClipboardManager;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.lifecycle.LiveData;
import com.C1764a;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.als.AlsLogicContainer;
import com.bytedance.als.C2563k;
import com.bytedance.als.dsl.C2551b;
import com.bytedance.als.dsl.C2552c;
import com.bytedance.als.dsl.C2553d;
import com.bytedance.als.dsl.C2554e;
import com.bytedance.als.dsl.C2555f;
import com.bytedance.als.dsl.C2556g;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.xelement.pickview.p1392b.C19386b;
import com.bytedance.jedi.arch.AbstractC20362a;
import com.bytedance.jedi.arch.AbstractC20367ae;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.AbstractC20382b;
import com.bytedance.jedi.arch.AbstractC20468h;
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
import com.bytedance.jedi.arch.C20523m;
import com.bytedance.jedi.arch.C20524n;
import com.bytedance.jedi.arch.C20526p;
import com.bytedance.jedi.arch.C20531t;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.keva.Keva;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.AbstractC21603p;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.C21597n;
import com.bytedance.p969f.p970a.p971a.AbstractC14552j;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.scene.AbstractC22219j;
import com.bytedance.scene.group.AbstractC22186b;
import com.bytedance.scene.ktx.C22226a;
import com.bytedance.ttnet.p1703d.C22944d;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.p2082ss.android.ugc.aweme.commentStickerPanel.CommentAndQuestionAndQuestionStickerPanelViewModel;
import com.p2082ss.android.ugc.aweme.commentStickerPanel.itemview.CommentStickerView;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.editSticker.compile.TextStickerCompileResult;
import com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45899e;
import com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45904h;
import com.p2082ss.android.ugc.aweme.editSticker.interact.C45902g;
import com.p2082ss.android.ugc.aweme.editSticker.interact.hit.C45906b;
import com.p2082ss.android.ugc.aweme.editSticker.interact.view.C45922g;
import com.p2082ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.p2082ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.p2082ss.android.ugc.aweme.editSticker.p2880d.AbstractC45872e;
import com.p2082ss.android.ugc.aweme.editSticker.p2880d.AbstractC45873f;
import com.p2082ss.android.ugc.aweme.editSticker.text.C45997ab;
import com.p2082ss.android.ugc.aweme.editSticker.text.als.AbstractC46036a;
import com.p2082ss.android.ugc.aweme.editSticker.text.als.AbstractC46043d;
import com.p2082ss.android.ugc.aweme.editSticker.text.als.C46037b;
import com.p2082ss.android.ugc.aweme.editSticker.text.als.EditTextStickerViewModel;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.C46110t;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap;
import com.p2082ss.android.ugc.aweme.editSticker.text.p2885a.C45995c;
import com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46118d;
import com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46119e;
import com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46122h;
import com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.C46123i;
import com.p2082ss.android.ugc.aweme.editSticker.text.view.C46224i;
import com.p2082ss.android.ugc.aweme.editSticker.text.view.C46239q;
import com.p2082ss.android.ugc.aweme.infoSticker.AbstractC56722g;
import com.p2082ss.android.ugc.aweme.infoSticker.C56724i;
import com.p2082ss.android.ugc.aweme.internal.AVUIUXBugsExperimentServiceDiff;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63253l;
import com.p2082ss.android.ugc.aweme.property.C65387c;
import com.p2082ss.android.ugc.aweme.property.C65399cl;
import com.p2082ss.android.ugc.aweme.setting.p3721i.C68093f;
import com.p2082ss.android.ugc.aweme.shortvideo.C71817eu;
import com.p2082ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70968bl;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70976bp;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C71025g;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C71513p;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C71073b;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.EnumC71088d;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.EditDonationStickerViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.DuetEditStickerLayout;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.LiveCDEditStickerLayout;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3814a.C71069d;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3819qa.QaStickerEditLayout;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.PollingStickerLayout;
import com.p2082ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.p2082ss.android.ugc.aweme.shortvideo.model.ShortVideoCommonParams;
import com.p2082ss.android.ugc.aweme.shortvideo.p3858s.C72829c;
import com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a;
import com.p2082ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p2082ss.android.ugc.aweme.sticker.data.QaStruct;
import com.p2082ss.android.ugc.aweme.story.p4047g.C77263b;
import com.p2082ss.android.ugc.aweme.tools.p4115e.AbstractC78484a;
import com.p2082ss.android.ugc.aweme.tools.p4115e.AbstractC78486c;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80322d;
import com.p2082ss.android.ugc.aweme.view.ProgressDialogC81146b;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.gamora.editor.AbstractC82018a;
import com.p2082ss.android.ugc.gamora.editor.AbstractC82034aa;
import com.p2082ss.android.ugc.gamora.editor.AbstractC82035ab;
import com.p2082ss.android.ugc.gamora.editor.C82273h;
import com.p2082ss.android.ugc.gamora.editor.C82299l;
import com.p2082ss.android.ugc.gamora.editor.C82468o;
import com.p2082ss.android.ugc.gamora.editor.C83253u;
import com.p2082ss.android.ugc.gamora.editor.multiedit.AbstractC82403a;
import com.p2082ss.android.ugc.gamora.editor.progressbar.AbstractC82503a;
import com.p2082ss.android.ugc.gamora.editor.sticker.AbstractC82564a;
import com.p2082ss.android.ugc.gamora.editor.sticker.donation.AbstractC82791h;
import com.p2082ss.android.ugc.gamora.editor.sticker.donation.C82747c;
import com.p2082ss.android.ugc.gamora.editor.sticker.duet.AbstractC82814a;
import com.p2082ss.android.ugc.gamora.editor.sticker.duet.C82815b;
import com.p2082ss.android.ugc.gamora.editor.sticker.duet.EditDuetStickerViewModel;
import com.p2082ss.android.ugc.gamora.editor.sticker.info.AbstractC82839a;
import com.p2082ss.android.ugc.gamora.editor.sticker.info.C82840b;
import com.p2082ss.android.ugc.gamora.editor.sticker.info.EditInfoStickerViewModel;
import com.p2082ss.android.ugc.gamora.editor.sticker.livecd.AbstractC82878a;
import com.p2082ss.android.ugc.gamora.editor.sticker.livecd.C82879b;
import com.p2082ss.android.ugc.gamora.editor.sticker.livecd.EditLiveCDStickerViewModel;
import com.p2082ss.android.ugc.gamora.editor.sticker.p4290qa.AbstractC82982a;
import com.p2082ss.android.ugc.gamora.editor.sticker.p4290qa.C82983b;
import com.p2082ss.android.ugc.gamora.editor.sticker.p4290qa.EditPageQaStickerViewModel;
import com.p2082ss.android.ugc.gamora.editor.sticker.poll.AbstractC82957a;
import com.p2082ss.android.ugc.gamora.editor.sticker.poll.C82958b;
import com.p2082ss.android.ugc.gamora.editor.sticker.poll.EditPollStickerViewModel;
import com.p2082ss.android.ugc.gamora.editor.sticker.read.C83031d;
import com.p2082ss.android.ugc.gamora.editor.sticker.read.C83064h;
import com.p2082ss.android.ugc.gamora.editor.sticker.read.C83065i;
import com.p2082ss.android.ugc.gamora.editor.sticker.read.C83066j;
import com.p2082ss.android.ugc.gamora.editor.sticker.read.C83067k;
import com.p2082ss.android.ugc.gamora.editor.sticker.read.ReadTextApi;
import com.p2082ss.android.ugc.gamora.editor.sticker.read.ReadTextViewModel;
import com.p2082ss.android.ugc.gamora.editor.sticker.read.p4291a.AbstractC83015b;
import com.p2082ss.android.ugc.gamora.editor.sticker.read.p4291a.C83016c;
import com.p2082ss.android.ugc.gamora.editor.subtitle.C83076b;
import com.p2082ss.android.ugc.gamora.editor.toolbar.EditToolbarViewModel;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.vesdk.C85581w;
import com.p2082ss.android.vesdk.VESize;
import dmt.p4542av.video.AbstractC88302y;
import dmt.p4542av.video.C88297u;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89386u;
import p4600h.C89391z;
import p4600h.EnumC89331m;
import p4600h.p4601a.C89070n;
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

/* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.c */
public class C82617c extends AbstractC22186b implements AbstractC20382b, AbstractC21566a, AbstractC56722g, AbstractC82564a {

    /* renamed from: P */
    public static final C82688l f184741P = new C82688l((byte) 0);

    /* renamed from: A */
    public FrameLayout f184742A;

    /* renamed from: B */
    public FrameLayout f184743B;

    /* renamed from: C */
    public FrameLayout f184744C;

    /* renamed from: D */
    public FrameLayout f184745D;

    /* renamed from: E */
    public FrameLayout f184746E;

    /* renamed from: F */
    public FrameLayout f184747F;

    /* renamed from: G */
    public AbstractC88302y f184748G;

    /* renamed from: H */
    public InfoStickerViewModel f184749H;

    /* renamed from: I */
    public ReadTextViewModel f184750I;

    /* renamed from: J */
    public boolean f184751J;

    /* renamed from: K */
    public AbstractC82035ab f184752K;

    /* renamed from: L */
    public ProgressDialogC81146b f184753L;

    /* renamed from: M */
    public AbstractC46036a f184754M;

    /* renamed from: N */
    public C46239q f184755N;

    /* renamed from: O */
    public final C21582f f184756O;

    /* renamed from: Q */
    private final AbstractC89244h f184757Q;

    /* renamed from: R */
    private final AbstractC89244h f184758R;

    /* renamed from: S */
    private final AbstractC89244h f184759S;

    /* renamed from: T */
    private final AbstractC89244h f184760T;

    /* renamed from: U */
    private final AbstractC89244h f184761U;

    /* renamed from: V */
    private final AbstractC89244h f184762V;

    /* renamed from: W */
    private List<InteractStickerStruct> f184763W;

    /* renamed from: X */
    private final AbstractC89244h f184764X;

    /* renamed from: Y */
    private boolean f184765Y;

    /* renamed from: Z */
    private final SafeHandler f184766Z;

    /* renamed from: aa */
    private final AbstractC89244h f184767aa;

    /* renamed from: ab */
    private final AbstractC89244h f184768ab;

    /* renamed from: ac */
    private boolean f184769ac;

    /* renamed from: ad */
    private boolean f184770ad;

    /* renamed from: b */
    private final AbstractC89244h f184771b = C89250i.m154774a(EnumC89331m.NONE, new C82618a(this));

    /* renamed from: c */
    private final AbstractC89244h f184772c = C89250i.m154773a((AbstractC89171a) new C82662bp(this));

    /* renamed from: d */
    private final AbstractC89244h f184773d = C89250i.m154773a((AbstractC89171a) new C82675bz(this));

    /* renamed from: e */
    private final AbstractC89244h f184774e;

    /* renamed from: f */
    private final AbstractC89244h f184775f;

    /* renamed from: g */
    public AbstractC14552j f184776g;

    /* renamed from: h */
    public AbstractC45899e f184777h;

    /* renamed from: i */
    public AbstractC82791h f184778i;

    /* renamed from: j */
    final AbstractC89244h f184779j;

    /* renamed from: k */
    public AbstractC82034aa f184780k;

    /* renamed from: l */
    public C45906b f184781l;

    /* renamed from: t */
    public C82468o f184782t;

    /* renamed from: u */
    public C82299l f184783u;

    /* renamed from: v */
    public C83076b f184784v;

    /* renamed from: w */
    public EditDonationStickerViewModel f184785w;

    /* renamed from: x */
    public EditTextStickerViewModel f184786x;

    /* renamed from: y */
    public EditToolbarViewModel f184787y;

    /* renamed from: z */
    public FrameLayout f184788z;

    static {
        Covode.recordClassIndex(96464);
    }

    /* renamed from: H */
    public final AbstractC72510a mo127693H() {
        return (AbstractC72510a) this.f184771b.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public final VideoPublishEditModel mo127694I() {
        return (VideoPublishEditModel) this.f184772c.getValue();
    }

    /* renamed from: J */
    public final CommentAndQuestionAndQuestionStickerPanelViewModel mo127695J() {
        return (CommentAndQuestionAndQuestionStickerPanelViewModel) this.f184774e.getValue();
    }

    /* renamed from: P */
    public final AbstractC82403a mo127696P() {
        return (AbstractC82403a) this.f184775f.getValue();
    }

    /* renamed from: Q */
    public final AbstractC82957a mo127697Q() {
        return (AbstractC82957a) this.f184757Q.getValue();
    }

    /* renamed from: R */
    public final AbstractC82878a mo127698R() {
        return (AbstractC82878a) this.f184758R.getValue();
    }

    /* renamed from: S */
    public final AbstractC82814a mo127699S() {
        return (AbstractC82814a) this.f184759S.getValue();
    }

    /* renamed from: T */
    public final AbstractC83015b mo127700T() {
        return (AbstractC83015b) this.f184760T.getValue();
    }

    /* renamed from: U */
    public final AbstractC82982a mo127701U() {
        return (AbstractC82982a) this.f184761U.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public final EditStickerViewModel mo127702V() {
        return (EditStickerViewModel) this.f184762V.getValue();
    }

    /* renamed from: X */
    public final C83031d mo127704X() {
        return (C83031d) this.f184764X.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: Z */
    public final AbstractC82839a mo127706Z() {
        return (AbstractC82839a) this.f184767aa.getValue();
    }

    /* renamed from: aa */
    public final C46224i mo127713aa() {
        return (C46224i) this.f184768ab.getValue();
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.c$bm */
    public static final class C82659bm implements AbstractC46118d {
        static {
            Covode.recordClassIndex(96506);
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

        C82659bm() {
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46118d
        /* renamed from: a */
        public final PointF mo77565a(C46239q qVar, float f, float f2) {
            C89219l.m154721d(qVar, "");
            return new PointF();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.c$l */
    public static final class C82688l {
        static {
            Covode.recordClassIndex(96535);
        }

        private C82688l() {
        }

        public /* synthetic */ C82688l(byte b) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.c$n */
    public static final class CallableC82690n<V> implements Callable {

        /* renamed from: a */
        public static final CallableC82690n f184870a = new CallableC82690n();

        static {
            Covode.recordClassIndex(96537);
        }

        CallableC82690n() {
        }

        @Override // java.util.concurrent.Callable
        public final /* bridge */ /* synthetic */ Object call() {
            return C89086z.INSTANCE;
        }
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20367ae
    public /* bridge */ /* synthetic */ AbstractC20477i getReceiver() {
        return this;
    }

    /* renamed from: a */
    public final void mo127711a(AbstractC82035ab abVar) {
        C89219l.m154721d(abVar, "");
        this.f184752K = abVar;
    }

    /* renamed from: a */
    public final void mo127712a(boolean z) {
        AbstractC82034aa aaVar = this.f184780k;
        if (aaVar != null) {
            aaVar.mo127273b(z);
        }
        AbstractC82791h hVar = this.f184778i;
        if (hVar != null) {
            hVar.mo127771b(z);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.c$bh */
    public static final class C82653bh implements C46224i.AbstractC46229a {

        /* renamed from: a */
        final /* synthetic */ C82617c f184824a;

        static {
            Covode.recordClassIndex(96500);
        }

        /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.c$bh$a */
        static final class C82654a extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ C82653bh f184825a;

            static {
                Covode.recordClassIndex(96501);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C82654a(C82653bh bhVar) {
                super(0);
                this.f184825a = bhVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                mo127726a();
                return C89391z.f203057a;
            }

            /* renamed from: a */
            public final void mo127726a() {
                View currentFocus;
                Object obj;
                C82617c.m142803b(this.f184825a.f184824a).f107128a = true;
                Activity activity = this.f184825a.f184824a.f52549m;
                if (!(activity == null || (currentFocus = activity.getCurrentFocus()) == null)) {
                    Activity t = this.f184825a.f184824a.mo36486t();
                    Boolean bool = null;
                    if (t != null) {
                        obj = m142851a(t, "input_method");
                    } else {
                        obj = null;
                    }
                    Objects.requireNonNull(obj, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                    InputMethodManager inputMethodManager = (InputMethodManager) obj;
                    if (inputMethodManager != null) {
                        C89219l.m154716b(currentFocus, "");
                        bool = Boolean.valueOf(inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 2));
                    }
                    bool.booleanValue();
                }
                C83066j.m143417a(new ShortVideoCommonParams(this.f184825a.f184824a.mo127694I().mShootWay, C71817eu.m126790a(this.f184825a.f184824a.mo127694I()), C71817eu.m126792c(this.f184825a.f184824a.mo127694I()), this.f184825a.f184824a.mo127694I().creationId), "manual", "text_edit_panel");
            }

            /* renamed from: a */
            private static Object m142851a(Activity activity, String str) {
                Object obj;
                MethodCollector.m26663i(9873);
                if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
                    if (!C58027i.f132247b && "connectivity".equals(str)) {
                        try {
                            new C21708b().mo35361a();
                            C58027i.f132247b = true;
                            obj = activity.getSystemService(str);
                        } catch (Throwable unused) {
                        }
                    }
                    obj = activity.getSystemService(str);
                } else if (C58027i.f132246a) {
                    synchronized (ClipboardManager.class) {
                        try {
                            obj = activity.getSystemService(str);
                            if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                                try {
                                    Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                                    declaredField.setAccessible(true);
                                    declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                                } catch (Exception e) {
                                    C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                                }
                            }
                            C58027i.f132246a = false;
                        } finally {
                            MethodCollector.m26664o(9873);
                        }
                    }
                } else {
                    obj = activity.getSystemService(str);
                }
                return obj;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C82653bh(C82617c cVar) {
            this.f184824a = cVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.text.view.C46224i.AbstractC46229a
        /* renamed from: a */
        public final void mo78528a(String str, C46239q qVar) {
            TextStickerData textStickerData;
            C89219l.m154721d(str, "");
            C82654a aVar = new C82654a(this);
            new C45902g().mo77278a(true);
            if (((qVar != null && (textStickerData = qVar.getData()) != null) || (textStickerData = C82617c.m142803b(this.f184824a).f107130c) != null) && textStickerData.getHasReadTextAudio()) {
                aVar.mo127726a();
            } else if (qVar == null) {
                if (!C83067k.m143424b() || this.f184824a.mo127700T().mo128104b()) {
                    aVar.mo127726a();
                } else if (!C83065i.m143413a(str)) {
                    Activity activity = this.f184824a.f52549m;
                    if (activity != null) {
                        C89219l.m154716b(activity, "");
                        new C23144b(activity).mo37640e(R.string.ay1).mo37637b();
                    }
                } else {
                    C83066j.m143417a(new ShortVideoCommonParams(this.f184824a.mo127694I().mShootWay, C71817eu.m126790a(this.f184824a.mo127694I()), C71817eu.m126792c(this.f184824a.mo127694I()), this.f184824a.mo127694I().creationId), "auto", "text_edit_panel");
                    AbstractC46036a aVar2 = this.f184824a.f184754M;
                    if (aVar2 != null) {
                        aVar2.mo77630f();
                    }
                    AbstractC46036a aVar3 = this.f184824a.f184754M;
                    if (aVar3 != null) {
                        aVar3.mo77633h();
                    }
                }
            } else if (!C83067k.m143424b()) {
                aVar.mo127726a();
            } else if (qVar.getData() == null) {
            } else {
                if (!C83065i.m143413a(str)) {
                    Activity activity2 = this.f184824a.f52549m;
                    if (activity2 != null) {
                        C89219l.m154716b(activity2, "");
                        new C23144b(activity2).mo37640e(R.string.ay1).mo37637b();
                        return;
                    }
                    return;
                }
                EditTextStickerViewModel b = C82617c.m142803b(this.f184824a);
                TextStickerData data = qVar.getData();
                if (data == null) {
                    C89219l.m154715b();
                }
                C89219l.m154716b(data, "");
                b.mo77612a(data, str);
            }
        }
    }

    /* renamed from: ah */
    public final void mo127720ah() {
        mo127706Z().mo127925e();
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

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.c$a */
    public static final class C82618a extends AbstractC89220m implements AbstractC89171a<AbstractC72510a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f184789a;

        static {
            Covode.recordClassIndex(96465);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82618a(AbstractC21566a aVar) {
            super(0);
            this.f184789a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.shortvideo.preview.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f184789a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.preview.a> r1 = com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.sticker.core.C82617c.C82618a.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.c$b */
    public static final class C82645b extends AbstractC89220m implements AbstractC89171a<AbstractC82957a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f184816a;

        static {
            Covode.recordClassIndex(96492);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82645b(AbstractC21566a aVar) {
            super(0);
            this.f184816a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.gamora.editor.sticker.poll.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.sticker.poll.AbstractC82957a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f184816a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.sticker.poll.a> r1 = com.p2082ss.android.ugc.gamora.editor.sticker.poll.AbstractC82957a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.sticker.core.C82617c.C82645b.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.c$bn */
    public static final class C82660bn implements AbstractC45872e {

        /* renamed from: a */
        final /* synthetic */ C82617c f184830a;

        static {
            Covode.recordClassIndex(96507);
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.p2880d.AbstractC45872e
        /* renamed from: a */
        public final void mo77232a() {
            C70968bl.m125254a(this.f184830a.mo127694I(), "click_text");
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.p2880d.AbstractC45872e
        /* renamed from: b */
        public final void mo77234b() {
            VideoPublishEditModel I = this.f184830a.mo127694I();
            C89219l.m154721d(I, "");
            C39162r.m79460a("text_time_set", C70968bl.m125247a(I, false, false, 6).f188764a);
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.p2880d.AbstractC45872e
        /* renamed from: c */
        public final void mo77235c() {
            VideoPublishEditModel I = this.f184830a.mo127694I();
            C89219l.m154721d(I, "");
            C39162r.m79460a("text_more_click", C70968bl.m125247a(I, false, false, 6).f188764a);
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.p2880d.AbstractC45872e
        /* renamed from: d */
        public final void mo77236d() {
            VideoPublishEditModel I = this.f184830a.mo127694I();
            C89219l.m154721d(I, "");
            C39162r.m79460a("long_video_edit_text_guide_show", new C84425b().mo129406a("creation_id", I.creationId).mo129403a("creation_duration", I.getPreviewInfo().getPreviewVideoLength()).f188764a);
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.p2880d.AbstractC45872e
        /* renamed from: e */
        public final void mo77237e() {
            VideoPublishEditModel I = this.f184830a.mo127694I();
            C89219l.m154721d(I, "");
            C39162r.m79460a("text_to_question_sticker", new C84425b().mo129406a("enter_from", "video_edit_page").mo129406a("creation_id", I.creationId).mo129406a("enter_method", "click_text").mo129406a("shoot_way", I.mShootWay).mo129406a("shoot_entrance", I.mShootWay).f188764a);
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.p2880d.AbstractC45872e
        /* renamed from: f */
        public final void mo77238f() {
            VideoPublishEditModel I = this.f184830a.mo127694I();
            C89219l.m154721d(I, "");
            C39162r.m79460a("question_prompt_show", new C84425b().mo129406a("creation_id", I.creationId).mo129406a("shoot_way", I.mShootWay).mo129406a("user_id", C63244g.m114602a().mo73255A().mo93904c()).f188764a);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C82660bn(C82617c cVar) {
            this.f184830a = cVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.p2880d.AbstractC45872e
        /* renamed from: a */
        public final void mo77233a(int i, String str) {
            C89219l.m154721d(str, "");
            C70968bl.m125255a(this.f184830a.mo127694I(), "move_to_top", 0, i, str);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.c$c */
    public static final class C82676c extends AbstractC89220m implements AbstractC89171a<AbstractC82878a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f184853a;

        static {
            Covode.recordClassIndex(96523);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82676c(AbstractC21566a aVar) {
            super(0);
            this.f184853a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.gamora.editor.sticker.livecd.a, com.bytedance.als.b] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.sticker.livecd.AbstractC82878a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f184853a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.sticker.livecd.a> r1 = com.p2082ss.android.ugc.gamora.editor.sticker.livecd.AbstractC82878a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.sticker.core.C82617c.C82676c.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.c$d */
    public static final class C82680d extends AbstractC89220m implements AbstractC89171a<AbstractC82814a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f184857a;

        static {
            Covode.recordClassIndex(96527);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82680d(AbstractC21566a aVar) {
            super(0);
            this.f184857a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.gamora.editor.sticker.duet.a, com.bytedance.als.b] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.sticker.duet.AbstractC82814a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f184857a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.sticker.duet.a> r1 = com.p2082ss.android.ugc.gamora.editor.sticker.duet.AbstractC82814a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.sticker.core.C82617c.C82680d.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.c$e */
    public static final class C82681e extends AbstractC89220m implements AbstractC89171a<AbstractC83015b> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f184858a;

        static {
            Covode.recordClassIndex(96528);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82681e(AbstractC21566a aVar) {
            super(0);
            this.f184858a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.gamora.editor.sticker.read.a.b, com.bytedance.als.b] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.sticker.read.p4291a.AbstractC83015b invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f184858a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.sticker.read.a.b> r1 = com.p2082ss.android.ugc.gamora.editor.sticker.read.p4291a.AbstractC83015b.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.sticker.core.C82617c.C82681e.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.c$f */
    public static final class C82682f extends AbstractC89220m implements AbstractC89171a<AbstractC82982a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f184859a;

        static {
            Covode.recordClassIndex(96529);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82682f(AbstractC21566a aVar) {
            super(0);
            this.f184859a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.gamora.editor.sticker.qa.a, com.bytedance.als.b] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.sticker.p4290qa.AbstractC82982a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f184859a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.sticker.qa.a> r1 = com.p2082ss.android.ugc.gamora.editor.sticker.p4290qa.AbstractC82982a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.sticker.core.C82617c.C82682f.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.c$g */
    public static final class C82683g extends AbstractC89220m implements AbstractC89171a<AbstractC82839a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f184860a;

        static {
            Covode.recordClassIndex(96530);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82683g(AbstractC21566a aVar) {
            super(0);
            this.f184860a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.gamora.editor.sticker.info.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.sticker.info.AbstractC82839a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f184860a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.sticker.info.a> r1 = com.p2082ss.android.ugc.gamora.editor.sticker.info.AbstractC82839a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.sticker.core.C82617c.C82683g.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.c$j */
    public static final class C82686j extends AbstractC89220m implements AbstractC89171a<AbstractC82403a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f184867a;

        static {
            Covode.recordClassIndex(96533);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82686j(AbstractC21566a aVar) {
            super(0);
            this.f184867a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.gamora.editor.multiedit.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.multiedit.AbstractC82403a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f184867a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.multiedit.a> r1 = com.p2082ss.android.ugc.gamora.editor.multiedit.AbstractC82403a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35252b(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.sticker.core.C82617c.C82686j.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.c$k */
    public static final class C82687k extends AbstractC89220m implements AbstractC89171a<AbstractC82503a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f184868a;

        static {
            Covode.recordClassIndex(96534);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82687k(AbstractC21566a aVar) {
            super(0);
            this.f184868a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.gamora.editor.progressbar.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.progressbar.AbstractC82503a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f184868a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.progressbar.a> r1 = com.p2082ss.android.ugc.gamora.editor.progressbar.AbstractC82503a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35252b(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.sticker.core.C82617c.C82687k.invoke():com.bytedance.als.b");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.infoSticker.AbstractC56722g
    /* renamed from: L */
    public final void mo87911L() {
        mo127693H().mo114805a((AbstractC72510a) false, false, false);
    }

    /* renamed from: W */
    public final FrameLayout mo127703W() {
        FrameLayout frameLayout = this.f184742A;
        if (frameLayout == null) {
            C89219l.m154710a("pollLayout");
        }
        return frameLayout;
    }

    /* renamed from: Y */
    public final AbstractC82035ab mo127705Y() {
        AbstractC82035ab abVar = this.f184752K;
        if (abVar == null) {
            C89219l.m154710a("compileCallback");
        }
        return abVar;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public C21582f getDiContainer() {
        C21582f b = C2552c.m7464b(this);
        if (b == null) {
            C89219l.m154715b();
        }
        return b;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.c$ca */
    static final class C82677ca extends AbstractC89220m implements AbstractC89171a<C46224i> {

        /* renamed from: a */
        final /* synthetic */ C82617c f184854a;

        static {
            Covode.recordClassIndex(96524);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82677ca(C82617c cVar) {
            super(0);
            this.f184854a = cVar;
        }

        /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.c$ca$b */
        public static final class C82679b implements AbstractC45873f {

            /* renamed from: a */
            final /* synthetic */ C82677ca f184856a;

            static {
                Covode.recordClassIndex(96526);
            }

            @Override // com.p2082ss.android.ugc.aweme.editSticker.p2880d.AbstractC45873f
            /* renamed from: b */
            public final Map<String, String> mo77240b() {
                Map<String, String> map = C77263b.m135059a(this.f184856a.f184854a.mo127694I().getAvetParameter()).f188764a;
                C89219l.m154716b(map, "");
                return map;
            }

            @Override // com.p2082ss.android.ugc.aweme.editSticker.p2880d.AbstractC45873f
            /* renamed from: a */
            public final void mo77239a() {
                String str;
                String str2;
                String str3;
                String str4;
                AVETParameter avetParameter = this.f184856a.f184854a.mo127694I().getAvetParameter();
                C84425b bVar = new C84425b();
                if (avetParameter == null || (str = avetParameter.getCreationId()) == null) {
                    str = "";
                }
                C84425b a = bVar.mo129406a("creation_id", str);
                if (avetParameter == null || (str2 = avetParameter.getShootWay()) == null) {
                    str2 = "";
                }
                C84425b a2 = a.mo129406a("shoot_way", str2);
                if (avetParameter == null || (str3 = avetParameter.getContentSource()) == null) {
                    str3 = "";
                }
                C84425b a3 = a2.mo129406a("content_source", str3);
                if (avetParameter == null || (str4 = avetParameter.getContentType()) == null) {
                    str4 = "";
                }
                C84425b a4 = a3.mo129406a("content_type", str4).mo129406a("enter_from", "video_edit_page");
                C89219l.m154716b(a4, "");
                C80322d.m139251a("click_wiki_entrance", a4.f188764a);
            }

            C82679b(C82677ca caVar) {
                this.f184856a = caVar;
            }
        }

        /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.c$ca$a */
        public static final class C82678a implements AbstractC46122h {

            /* renamed from: a */
            final /* synthetic */ C82677ca f184855a;

            static {
                Covode.recordClassIndex(96525);
            }

            @Override // com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46122h
            /* renamed from: a */
            public final void mo78312a() {
                C83066j.m143416a(new ShortVideoCommonParams(this.f184855a.f184854a.mo127694I().mShootWay, C71817eu.m126790a(this.f184855a.f184854a.mo127694I()), C71817eu.m126792c(this.f184855a.f184854a.mo127694I()), this.f184855a.f184854a.mo127694I().creationId));
            }

            C82678a(C82677ca caVar) {
                this.f184855a = caVar;
            }

            @Override // com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46122h
            /* renamed from: a */
            public final void mo78315a(String str) {
                C89219l.m154721d(str, "");
                C39162r.m79460a("select_text_paragraph", this.f184855a.f184854a.mo127714ab().mo129406a("paragraph_style", str).f188764a);
            }

            @Override // com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46122h
            /* renamed from: b */
            public final void mo78317b(int i) {
                C39162r.m79460a("select_text_style", this.f184855a.f184854a.mo127714ab().mo129406a("text_style", String.valueOf(i)).mo129403a("is_subtitle", 0).f188764a);
            }

            @Override // com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46122h
            /* renamed from: a */
            public final void mo78313a(int i) {
                C39162r.m79460a("select_text_color", this.f184855a.f184854a.mo127714ab().mo129406a(C19386b.f45894a, Integer.toHexString(i)).mo129403a("is_subtitle", 0).f188764a);
            }

            @Override // com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46122h
            /* renamed from: a */
            public final void mo78314a(C45995c cVar) {
                C89219l.m154721d(cVar, "");
                C39162r.m79460a("select_text_font", this.f184855a.f184854a.mo127714ab().mo129406a("font", cVar.f107118b).mo129403a("is_subtitle", 0).f188764a);
            }

            @Override // com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46122h
            /* renamed from: a */
            public final void mo78316a(List<TextStickerTextWrap> list) {
                C89219l.m154721d(list, "");
                boolean h = C46110t.m88972h(list);
                boolean g = C46110t.m88971g(list);
                C84425b ab = this.f184855a.f184854a.mo127714ab();
                if (h) {
                    ab.mo129406a("text_added", "1");
                    if (g) {
                        ab.mo129406a("anchor_added", "1");
                        ab.mo129406a("anchor_type", "wiki");
                    }
                }
                C39162r.m79460a("text_complete", ab.f188764a);
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C46224i invoke() {
            MethodCollector.m26663i(9852);
            View inflate = ((ViewStub) this.f184854a.mo36475c(R.id.fgf)).inflate();
            if (inflate != null) {
                C46224i iVar = (C46224i) inflate;
                if (C83064h.m143409b()) {
                    iVar.setOnReadTextClickListener(new C82653bh(this.f184854a));
                }
                iVar.mo78490a(this.f184854a.mo127694I().mShootWay, this.f184854a.mo127694I().creationId, C70976bp.m125301a(this.f184854a.mo127694I()));
                iVar.setTextStickerInputMobListener(new C82678a(this));
                iVar.setWikiTextStickerMob(new C82679b(this));
                MethodCollector.m26664o(9852);
                return iVar;
            }
            NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.editSticker.text.view.TextStickerInputLayout");
            MethodCollector.m26664o(9852);
            throw nullPointerException;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.c$bp */
    static final class C82662bp extends AbstractC89220m implements AbstractC89171a<VideoPublishEditModel> {

        /* renamed from: a */
        final /* synthetic */ C82617c f184832a;

        static {
            Covode.recordClassIndex(96509);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82662bp(C82617c cVar) {
            super(0);
            this.f184832a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ VideoPublishEditModel invoke() {
            Object a = this.f184832a.f184756O.mo35249a((Type) VideoPublishEditModel.class, (String) null);
            C89219l.m154716b(a, "");
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.c$bz */
    static final class C82675bz extends AbstractC89220m implements AbstractC89171a<C56724i> {

        /* renamed from: a */
        final /* synthetic */ C82617c f184852a;

        static {
            Covode.recordClassIndex(96522);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82675bz(C82617c cVar) {
            super(0);
            this.f184852a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C56724i invoke() {
            Object a = this.f184852a.f184756O.mo35249a((Type) C56724i.class, (String) null);
            C89219l.m154716b(a, "");
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.c$o */
    public static final class C82691o implements ProgressDialogC81146b.AbstractC81149c {

        /* renamed from: a */
        final /* synthetic */ C82617c f184871a;

        static {
            Covode.recordClassIndex(96538);
        }

        @Override // com.p2082ss.android.ugc.aweme.view.ProgressDialogC81146b.AbstractC81149c
        /* renamed from: a */
        public final void mo113366a() {
            ReadTextViewModel readTextViewModel = this.f184871a.f184750I;
            if (readTextViewModel == null) {
                C89219l.m154710a("readTextViewModel");
            }
            readTextViewModel.f185460b.mo142944a();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C82691o(C82617c cVar) {
            this.f184871a = cVar;
        }
    }

    /* renamed from: al */
    private final void m142802al() {
        if (mo127694I().qaStruct != null) {
            mo127701U();
            AbstractC82982a U = mo127701U();
            QaStruct qaStruct = mo127694I().qaStruct;
            C89219l.m154716b(qaStruct, "");
            U.mo128040a(qaStruct);
        }
    }

    /* renamed from: ad */
    public final void mo127716ad() {
        if (!this.f184769ac) {
            this.f184769ac = true;
            mo127706Z().mo127913a();
            mo127693H().mo114780E().observe(this, new C82694r(this));
        }
    }

    /* renamed from: aj */
    public final void mo127722aj() {
        this.f184766Z.removeCallbacksAndMessages(null);
        this.f184766Z.postDelayed(new RunnableC82689m(this), 100);
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: w */
    public final void mo36490w() {
        super.mo36490w();
        m142797E();
        AbstractC46036a aVar = this.f184754M;
        if (aVar != null) {
            aVar.mo77635j();
        }
        this.f184751J = false;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.c$bi */
    public static final class C82655bi implements AbstractC46119e {

        /* renamed from: a */
        final /* synthetic */ C82617c f184826a;

        static {
            Covode.recordClassIndex(96502);
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46119e
        /* renamed from: c */
        public final void mo78311c(C46239q qVar) {
            C89219l.m154721d(qVar, "");
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46119e
        /* renamed from: a */
        public final void mo78307a() {
            C83066j.m143416a(new ShortVideoCommonParams(this.f184826a.mo127694I().mShootWay, C71817eu.m126790a(this.f184826a.mo127694I()), C71817eu.m126792c(this.f184826a.mo127694I()), this.f184826a.mo127694I().creationId));
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C82655bi(C82617c cVar) {
            this.f184826a = cVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46119e
        /* renamed from: b */
        public final void mo78310b(C46239q qVar) {
            C89219l.m154721d(qVar, "");
            this.f184826a.f184755N = qVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46119e
        /* renamed from: a */
        public final void mo78308a(C46239q qVar) {
            String speakerID;
            C83031d X;
            C89219l.m154721d(qVar, "");
            TextStickerData data = qVar.getData();
            if (data != null && (speakerID = data.getSpeakerID()) != null && (X = this.f184826a.mo127704X()) != null) {
                X.mo128134e(speakerID);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46119e
        /* renamed from: a */
        public final void mo78309a(C46239q qVar, C46123i iVar) {
            C89219l.m154721d(qVar, "");
            C89219l.m154721d(iVar, "");
            if (iVar.f107377c) {
                if (!iVar.f107379e) {
                    this.f184826a.mo127693H().mo114805a((AbstractC72510a) true, true, true);
                }
                this.f184826a.f184751J = false;
                return;
            }
            if (!this.f184826a.f184751J) {
                this.f184826a.mo127693H().mo114805a((AbstractC72510a) false, true, false);
                this.f184826a.mo127706Z().mo127929i();
                AbstractC46036a aVar = this.f184826a.f184754M;
                if (aVar != null) {
                    aVar.mo77639n();
                }
                this.f184826a.mo127716ad();
                AbstractC82839a Z = this.f184826a.mo127706Z();
                if (Z.mo127924c() != null) {
                    Z.mo127922b();
                }
            }
            this.f184826a.f184751J = true;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.c$bo */
    static final class C82661bo extends AbstractC89220m implements AbstractC89171a<C83031d> {

        /* renamed from: a */
        final /* synthetic */ C82617c f184831a;

        static {
            Covode.recordClassIndex(96508);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82661bo(C82617c cVar) {
            super(0);
            this.f184831a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C83031d invoke() {
            if (!C83064h.m143408a()) {
                return null;
            }
            C83031d dVar = new C83031d(this.f184831a.f184756O, this.f184831a.mo127700T());
            if (this.f184831a.mo36386a("ReadTextEffectScene") == null) {
                C22226a.m41822a(this.f184831a, R.id.dey, dVar, "ReadTextEffectScene");
            }
            return dVar;
        }
    }

    /* renamed from: F */
    private final void mo120457F() {
        m142797E();
        mo127697Q().mo128025f();
        mo127699S().mo127886f();
        mo127698R().mo127951a();
        AbstractC82034aa aaVar = this.f184780k;
        if (aaVar != null) {
            aaVar.mo127255F();
        }
        mo127701U().mo128048f();
        AbstractC82791h hVar = this.f184778i;
        if (hVar != null) {
            hVar.mo127752G();
        }
        C82468o oVar = this.f184782t;
        if (oVar != null) {
            oVar.mo127233G();
        }
        C82299l lVar = this.f184783u;
        if (lVar != null) {
            lVar.mo127233G();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.infoSticker.AbstractC56722g
    /* renamed from: M */
    public final void mo87912M() {
        if (!mo127697Q().mo128027h() && !this.f184765Y) {
            mo127693H().mo114805a((AbstractC72510a) true, false, true);
        }
        if (!mo127698R().mo127965k() && !this.f184765Y) {
            mo127693H().mo114805a((AbstractC72510a) true, false, true);
        }
    }

    /* renamed from: ac */
    public final void mo127715ac() {
        if (!C63244g.m114602a().mo73295w().mo93784m()) {
            AbstractC31071f value = mo127693H().mo114778C().getValue();
            if (value != null) {
                value.mo56311a(true);
            }
            AbstractC31071f value2 = mo127693H().mo114778C().getValue();
            if (value2 != null) {
                value2.mo56388t();
            }
        }
    }

    /* renamed from: af */
    public final void mo127718af() {
        if (C65399cl.m117099a()) {
            Keva repo = Keva.getRepo("text_max_size_repo", 0);
            if (repo.getFloat("max_size_key", -1.0f) == -1.0f) {
                repo.storeFloat("max_size_key", C45997ab.m88786a());
            }
        }
        if (!this.f184770ad) {
            AbstractC46036a aVar = this.f184754M;
            if (aVar != null) {
                aVar.mo77632g();
            }
            m142801ak();
            mo120458G();
            this.f184770ad = true;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.c$h */
    public static final class C82684h extends AbstractC89220m implements AbstractC89171a<CommentAndQuestionAndQuestionStickerPanelViewModel> {

        /* renamed from: a */
        final /* synthetic */ AbstractC22219j f184861a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f184862b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f184863c;

        static {
            Covode.recordClassIndex(96531);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82684h(AbstractC22219j jVar, AbstractC89277c cVar, AbstractC89277c cVar2) {
            super(0);
            this.f184861a = jVar;
            this.f184862b = cVar;
            this.f184863c = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [com.ss.android.ugc.aweme.commentStickerPanel.CommentAndQuestionAndQuestionStickerPanelViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v15, types: [com.ss.android.ugc.aweme.commentStickerPanel.CommentAndQuestionAndQuestionStickerPanelViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 2 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.commentStickerPanel.CommentAndQuestionAndQuestionStickerPanelViewModel invoke() {
            /*
                r6 = this;
                com.bytedance.scene.j r0 = r6.f184861a
                com.bytedance.scene.j r5 = r0.f52551o
                h.k.c r0 = r6.f184863c
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                java.lang.String r3 = r0.getCanonicalName()
                java.lang.String r4 = ""
                p4600h.p4611f.p4613b.C89219l.m154716b(r3, r4)
            L_0x0013:
                if (r5 == 0) goto L_0x003a
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ad r2 = com.bytedance.scene.C22267s.m41934a(r5, r0)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.f184863c     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)     // Catch:{ as -> 0x0035 }
                java.lang.String r1 = r0.getCanonicalName()     // Catch:{ as -> 0x0035 }
                p4600h.p4611f.p4613b.C89219l.m154716b(r1, r4)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.f184862b     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ac r0 = m142884xbeffcf8b(r2, r1, r0)     // Catch:{ as -> 0x0035 }
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0     // Catch:{ as -> 0x0035 }
                goto L_0x0038
            L_0x0035:
                com.bytedance.scene.j r5 = r5.f52551o
                goto L_0x0013
            L_0x0038:
                if (r0 != 0) goto L_0x0052
            L_0x003a:
                com.bytedance.scene.j r0 = r6.f184861a
                androidx.fragment.app.e r1 = com.bytedance.scene.ktx.C22228c.m41832b(r0)
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a
                androidx.lifecycle.ad r1 = androidx.lifecycle.C1181ae.m3881a(r1, r0)
                h.k.c r0 = r6.f184862b
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                androidx.lifecycle.ac r0 = m142884xbeffcf8b(r1, r3, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0052:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.sticker.core.C82617c.C82684h.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_gamora_editor_sticker_core_EditStickerScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m142884xbeffcf8b(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.c$i */
    public static final class C82685i extends AbstractC89220m implements AbstractC89171a<EditStickerViewModel> {

        /* renamed from: a */
        final /* synthetic */ AbstractC22219j f184864a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f184865b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f184866c;

        static {
            Covode.recordClassIndex(96532);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82685i(AbstractC22219j jVar, AbstractC89277c cVar, AbstractC89277c cVar2) {
            super(0);
            this.f184864a = jVar;
            this.f184865b = cVar;
            this.f184866c = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel] */
        /* JADX WARN: Type inference failed for: r0v15, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel] */
        /* JADX WARNING: Unknown variable types count: 2 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel invoke() {
            /*
                r6 = this;
                com.bytedance.scene.j r0 = r6.f184864a
                com.bytedance.scene.j r5 = r0.f52551o
                h.k.c r0 = r6.f184866c
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                java.lang.String r3 = r0.getCanonicalName()
                java.lang.String r4 = ""
                p4600h.p4611f.p4613b.C89219l.m154716b(r3, r4)
            L_0x0013:
                if (r5 == 0) goto L_0x003a
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ad r2 = com.bytedance.scene.C22267s.m41934a(r5, r0)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.f184866c     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)     // Catch:{ as -> 0x0035 }
                java.lang.String r1 = r0.getCanonicalName()     // Catch:{ as -> 0x0035 }
                p4600h.p4611f.p4613b.C89219l.m154716b(r1, r4)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.f184865b     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ac r0 = m142885xd2a7a30c(r2, r1, r0)     // Catch:{ as -> 0x0035 }
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0     // Catch:{ as -> 0x0035 }
                goto L_0x0038
            L_0x0035:
                com.bytedance.scene.j r5 = r5.f52551o
                goto L_0x0013
            L_0x0038:
                if (r0 != 0) goto L_0x0052
            L_0x003a:
                com.bytedance.scene.j r0 = r6.f184864a
                androidx.fragment.app.e r1 = com.bytedance.scene.ktx.C22228c.m41832b(r0)
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a
                androidx.lifecycle.ad r1 = androidx.lifecycle.C1181ae.m3881a(r1, r0)
                h.k.c r0 = r6.f184865b
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                androidx.lifecycle.ac r0 = m142885xd2a7a30c(r1, r3, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0052:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.sticker.core.C82617c.C82685i.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_gamora_editor_sticker_core_EditStickerScene$$special$$inlined$hostViewModel$2_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m142885xd2a7a30c(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.c$m */
    public static final class RunnableC82689m implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C82617c f184869a;

        static {
            Covode.recordClassIndex(96536);
        }

        RunnableC82689m(C82617c cVar) {
            this.f184869a = cVar;
        }

        public final void run() {
            Boolean bool;
            LiveData<Boolean> e;
            C82617c cVar = this.f184869a;
            if (cVar.mo127694I().commentVideoModel != null) {
                AbstractC82403a P = cVar.mo127696P();
                if (P == null || (e = P.mo127499e()) == null) {
                    bool = null;
                } else {
                    bool = e.getValue();
                }
                if (!C89219l.m154714a((Object) bool, (Object) true)) {
                    AbstractC82034aa aaVar = cVar.f184780k;
                    if (aaVar != null) {
                        aaVar.mo127263N();
                    }
                    AbstractC82034aa aaVar2 = cVar.f184780k;
                    if (aaVar2 != null) {
                        CommentVideoModel commentVideoModel = cVar.mo127694I().commentVideoModel;
                        C89219l.m154716b(commentVideoModel, "");
                        aaVar2.mo127265a(commentVideoModel, false, false);
                    }
                }
            }
        }
    }

    /* renamed from: E */
    private final void m142797E() {
        List<StickerItemModel> list;
        C82299l lVar;
        InfoStickerModel infoStickerModel = mo127694I().infoStickerModel;
        if (infoStickerModel != null && (list = infoStickerModel.stickers) != null) {
            Iterator<StickerItemModel> it = list.iterator();
            while (it.hasNext()) {
                StickerItemModel next = it.next();
                int i = next.type;
                if (i == 4) {
                    AbstractC82034aa aaVar = this.f184780k;
                    if (aaVar != null) {
                        String str = next.path;
                        C89219l.m154716b(str, "");
                        aaVar.mo127270a(str);
                        String str2 = next.stickerId;
                        C89219l.m154716b(str2, "");
                        aaVar.mo127272b(str2);
                        it.remove();
                    }
                } else if (i == 19) {
                    mo127701U();
                    it.remove();
                } else if (i == 8) {
                    C82468o oVar = this.f184782t;
                    if (oVar != null) {
                        String str3 = next.path;
                        C89219l.m154716b(str3, "");
                        oVar.mo127246a(str3);
                        String str4 = next.stickerId;
                        C89219l.m154716b(str4, "");
                        oVar.mo127249b(str4);
                        it.remove();
                    }
                } else if (i == 9 && (lVar = this.f184783u) != null) {
                    String str5 = next.path;
                    C89219l.m154716b(str5, "");
                    lVar.mo127246a(str5);
                    String str6 = next.stickerId;
                    C89219l.m154716b(str6, "");
                    lVar.mo127249b(str6);
                    it.remove();
                }
            }
        }
    }

    /* renamed from: G */
    private final void mo120458G() {
        AbstractC46036a aVar = this.f184754M;
        if (aVar != null) {
            aVar.mo77614a(new C82655bi(this));
        }
        AbstractC46036a aVar2 = this.f184754M;
        if (aVar2 != null) {
            aVar2.mo77616a(new C82656bj(this));
        }
        AbstractC46036a aVar3 = this.f184754M;
        if (aVar3 != null) {
            aVar3.mo77617a(new C82657bk(this));
        }
        AbstractC46036a aVar4 = this.f184754M;
        if (aVar4 != null) {
            aVar4.mo77622b(new C82658bl(this));
        }
        AbstractC46036a aVar5 = this.f184754M;
        if (aVar5 != null) {
            aVar5.mo77613a(new C82659bm());
        }
        AbstractC46036a aVar6 = this.f184754M;
        if (aVar6 != null) {
            aVar6.mo77610a(new C82660bn(this));
        }
    }

    /* renamed from: ak */
    private final void m142801ak() {
        C89378p<Integer, Integer> pVar;
        C45906b bVar;
        VESize b;
        AbstractC31071f value = mo127693H().mo114778C().getValue();
        if (value == null || (b = value.mo56330b()) == null) {
            pVar = null;
        } else {
            pVar = new C89378p<>(Integer.valueOf(b.width), Integer.valueOf(b.height));
        }
        AbstractC46036a aVar = this.f184754M;
        if (aVar != null) {
            aVar.mo77618a(pVar);
        }
        if (AVUIUXBugsExperimentServiceDiff.m103001b().mo93971a() && (bVar = this.f184781l) != null) {
            bVar.mo77290a(pVar);
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.AbstractC82564a
    /* renamed from: K */
    public final void mo87910K() {
        mo127697Q().mo128021b();
        mo127699S().mo127882b();
        C83076b bVar = this.f184784v;
        if (bVar != null) {
            bVar.mo128177C().mo112324n();
        }
        mo127698R().mo127962h();
        mo127701U().mo128044b();
        AbstractC82034aa aaVar = this.f184780k;
        if (aaVar != null) {
            aaVar.mo127259J();
        }
        AbstractC82791h hVar = this.f184778i;
        if (hVar != null) {
            hVar.mo127755J();
        }
        C82468o oVar = this.f184782t;
        if (oVar != null) {
            ((AbstractC82018a) oVar).f183561b.mo112324n();
        }
        C82299l lVar = this.f184783u;
        if (lVar != null) {
            ((AbstractC82018a) lVar).f183561b.mo112324n();
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.AbstractC82564a
    /* renamed from: N */
    public final boolean mo87913N() {
        AbstractC82034aa aaVar;
        AbstractC82791h hVar;
        C82468o oVar;
        C82299l lVar;
        C83076b bVar;
        AbstractC46036a aVar = this.f184754M;
        if ((aVar == null || !aVar.mo77640o()) && !mo127697Q().mo128030k() && !mo127698R().mo127963i() && (((aaVar = this.f184780k) == null || !aaVar.mo127260K()) && !mo127701U().mo128051i() && (((hVar = this.f184778i) == null || !hVar.mo127751F()) && (((oVar = this.f184782t) == null || !((AbstractC82018a) oVar).f183561b.mo112283b()) && (((lVar = this.f184783u) == null || !((AbstractC82018a) lVar).f183561b.mo112283b()) && ((bVar = this.f184784v) == null || !bVar.mo128177C().mo112283b())))))) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.AbstractC82564a
    /* renamed from: O */
    public final void mo87914O() {
        mo127697Q().mo128024e();
        mo127699S().mo127885e();
        mo127698R().mo127959e();
        mo127701U().mo128047e();
        C83076b bVar = this.f184784v;
        if (bVar != null) {
            bVar.mo128177C().mo112285d();
            mo127694I().captionStruct = null;
        }
        AbstractC82034aa aaVar = this.f184780k;
        if (aaVar != null) {
            aaVar.mo127256G();
            CommentVideoModel commentVideoModel = mo127694I().commentVideoModel;
            if (commentVideoModel != null) {
                commentVideoModel.setStartTime(0);
            }
            CommentVideoModel commentVideoModel2 = mo127694I().commentVideoModel;
            if (commentVideoModel2 != null) {
                commentVideoModel2.setEndTime(0);
            }
        }
        AbstractC82791h hVar = this.f184778i;
        if (hVar != null) {
            hVar.mo127753H();
        }
        C82468o oVar = this.f184782t;
        if (oVar != null) {
            ((AbstractC82018a) oVar).f183561b.mo112447r();
        }
        C82299l lVar = this.f184783u;
        if (lVar != null) {
            ((AbstractC82018a) lVar).f183561b.mo112447r();
        }
        mo127721ai();
    }

    /* renamed from: ab */
    public final C84425b mo127714ab() {
        C84425b a = C70968bl.m125280l(mo127694I()).mo129406a("creation_id", mo127694I().creationId).mo129406a("shoot_way", mo127694I().mShootWay).mo129406a("content_type", C70968bl.m125249a(mo127694I())).mo129406a("content_source", C70968bl.m125262b(mo127694I())).mo129406a("enter_from", "video_edit_page");
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: ag */
    public final void mo127719ag() {
        if (C65387c.m117084a()) {
            EditTextStickerViewModel editTextStickerViewModel = this.f184786x;
            if (editTextStickerViewModel == null) {
                C89219l.m154710a("textStickerViewModel");
            }
            if (editTextStickerViewModel.mo77650y() != null) {
                EditTextStickerViewModel editTextStickerViewModel2 = this.f184786x;
                if (editTextStickerViewModel2 == null) {
                    C89219l.m154710a("textStickerViewModel");
                }
                EditTextStickerViewModel editTextStickerViewModel3 = this.f184786x;
                if (editTextStickerViewModel3 == null) {
                    C89219l.m154710a("textStickerViewModel");
                }
                editTextStickerViewModel2.mo77625c(editTextStickerViewModel3.mo77650y());
                return;
            }
        }
        m142801ak();
        AbstractC46036a aVar = this.f184754M;
        if (aVar != null) {
            aVar.mo77637l();
        }
        EditToolbarViewModel editToolbarViewModel = this.f184787y;
        if (editToolbarViewModel == null) {
            C89219l.m154710a("editToolbarViewModel");
        }
        editToolbarViewModel.mo128251c(2, false);
        mo127713aa().setReadTextIcon(false);
        mo127713aa().mo78494d();
    }

    /* renamed from: ae */
    public final void mo127717ae() {
        C83076b bVar;
        mo127697Q().mo128016a();
        mo127699S().mo127877a();
        mo127698R().mo127956b();
        if (this.f184778i == null) {
            C82747c cVar = new C82747c(getDiContainer());
            this.f184778i = cVar;
            AbstractC14552j jVar = this.f184776g;
            if (jVar == null) {
                C89219l.m154710a("gestureService");
            }
            cVar.mo127760a(jVar);
            AbstractC82791h hVar = this.f184778i;
            if (hVar != null) {
                AbstractC45899e eVar = this.f184777h;
                if (eVar == null) {
                    C89219l.m154710a("deleteComponent");
                }
                hVar.mo127761a(eVar);
            }
            AbstractC82791h hVar2 = this.f184778i;
            if (hVar2 != null) {
                AbstractC82035ab abVar = this.f184752K;
                if (abVar == null) {
                    C89219l.m154710a("compileCallback");
                }
                hVar2.mo127764a(abVar);
            }
            AbstractC82791h hVar3 = this.f184778i;
            if (!(hVar3 instanceof AbstractC22219j)) {
                hVar3 = null;
            }
            AbstractC22219j jVar2 = (AbstractC22219j) hVar3;
            if (jVar2 != null) {
                mo36387a(R.id.egs, jVar2, "EditDonationStickerScene");
            }
            AbstractC82791h hVar4 = this.f184778i;
            if (hVar4 != null) {
                hVar4.mo127763a(new C82695s(this));
            }
            AbstractC82791h hVar5 = this.f184778i;
            if (hVar5 != null) {
                hVar5.mo127762a(new C82696t(this));
            }
        }
        if (this.f184784v == null) {
            C83076b bVar2 = new C83076b(getDiContainer());
            this.f184784v = bVar2;
            AbstractC14552j jVar3 = this.f184776g;
            if (jVar3 == null) {
                C89219l.m154710a("gestureService");
            }
            bVar2.mo128180a(jVar3);
            C83076b bVar3 = this.f184784v;
            if (bVar3 == null) {
                C89219l.m154715b();
            }
            mo36387a(R.id.b3q, bVar3, "CaptionStickerScene");
        }
        if (this.f184780k == null) {
            C82273h hVar6 = new C82273h(getDiContainer());
            this.f184780k = hVar6;
            AbstractC14552j jVar4 = this.f184776g;
            if (jVar4 == null) {
                C89219l.m154710a("gestureService");
            }
            hVar6.mo127264a(jVar4);
            AbstractC82034aa aaVar = this.f184780k;
            if (aaVar != null) {
                AbstractC45899e eVar2 = this.f184777h;
                if (eVar2 == null) {
                    C89219l.m154710a("deleteComponent");
                }
                aaVar.mo127266a(eVar2);
            }
            AbstractC82034aa aaVar2 = this.f184780k;
            if (aaVar2 instanceof AbstractC22219j) {
                Objects.requireNonNull(aaVar2, "null cannot be cast to non-null type com.bytedance.scene.Scene");
                mo36387a(R.id.egs, (AbstractC22219j) aaVar2, "EditCommentStickerScene");
            }
            AbstractC82034aa aaVar3 = this.f184780k;
            if (aaVar3 != null) {
                aaVar3.mo127268a(new C82697u(this));
            }
            AbstractC82034aa aaVar4 = this.f184780k;
            if (aaVar4 != null) {
                aaVar4.mo127267a(new C82698v(this));
            }
        }
        mo127701U().mo128038a();
        if (this.f184782t == null) {
            C82468o oVar = new C82468o(getDiContainer());
            this.f184782t = oVar;
            AbstractC14552j jVar5 = this.f184776g;
            if (jVar5 == null) {
                C89219l.m154710a("gestureService");
            }
            oVar.mo127243a(jVar5);
            C82468o oVar2 = this.f184782t;
            if (oVar2 != null) {
                AbstractC45899e eVar3 = this.f184777h;
                if (eVar3 == null) {
                    C89219l.m154710a("deleteComponent");
                }
                oVar2.mo127244a(eVar3);
            }
            C82468o oVar3 = this.f184782t;
            Objects.requireNonNull(oVar3, "null cannot be cast to non-null type com.bytedance.scene.Scene");
            mo36387a(R.id.egu, oVar3, "EditMentionStickerScene");
        }
        if (this.f184783u == null) {
            C82299l lVar = new C82299l(getDiContainer());
            this.f184783u = lVar;
            AbstractC14552j jVar6 = this.f184776g;
            if (jVar6 == null) {
                C89219l.m154710a("gestureService");
            }
            lVar.mo127243a(jVar6);
            C82299l lVar2 = this.f184783u;
            if (lVar2 != null) {
                AbstractC45899e eVar4 = this.f184777h;
                if (eVar4 == null) {
                    C89219l.m154710a("deleteComponent");
                }
                lVar2.mo127244a(eVar4);
            }
            C82299l lVar3 = this.f184783u;
            Objects.requireNonNull(lVar3, "null cannot be cast to non-null type com.bytedance.scene.Scene");
            mo36387a(R.id.egu, lVar3, "EditHashTagStickerScene");
        }
        mo120457F();
        if (!(mo127694I().captionStruct == null || (bVar = this.f184784v) == null)) {
            bVar.mo128181a(mo127694I().captionStruct);
        }
        if (!mo127694I().mIsFromDraft) {
            mo127722aj();
            m142802al();
        }
    }

    /* renamed from: ai */
    public final void mo127721ai() {
        List<String> list;
        List<String> list2;
        List<InteractStickerStruct> list3;
        List<StickerItemModel> list4;
        AbstractC46036a aVar;
        InteractStickerStruct E;
        List<InteractStickerStruct> H;
        InteractStickerStruct H2;
        InteractStickerStruct D;
        this.f184763W.clear();
        AbstractC31071f value = mo127693H().mo114778C().getValue();
        if (value != null) {
            mo127697Q().mo128018a(value.mo56330b());
            mo127699S().mo127879a(value.mo56330b());
            mo127698R().mo127953a(value.mo56330b());
            C83076b bVar = this.f184784v;
            if (bVar != null) {
                bVar.mo128182a(value.mo56330b());
            }
            AbstractC82034aa aaVar = this.f184780k;
            if (aaVar != null) {
                aaVar.mo127269a(value.mo56330b());
            }
            mo127701U().mo128041a(value.mo56330b());
            AbstractC82791h hVar = this.f184778i;
            if (hVar != null) {
                hVar.mo127765a(value.mo56330b());
            }
            C82468o oVar = this.f184782t;
            if (oVar != null) {
                oVar.mo127245a(value.mo56330b());
            }
            C82299l lVar = this.f184783u;
            if (lVar != null) {
                lVar.mo127245a(value.mo56330b());
            }
        }
        InteractStickerStruct g = mo127697Q().mo128026g();
        if (g != null) {
            this.f184763W.add(g);
        }
        InteractStickerStruct g2 = mo127699S().mo127887g();
        if (g2 != null) {
            this.f184763W.add(g2);
        }
        InteractStickerStruct f = mo127698R().mo127960f();
        if (f != null) {
            this.f184763W.add(f);
        }
        C83076b bVar2 = this.f184784v;
        if (!(bVar2 == null || (D = bVar2.mo128178D()) == null)) {
            this.f184763W.add(D);
        }
        AbstractC82034aa aaVar2 = this.f184780k;
        List<InteractStickerStruct> list5 = null;
        if (!(aaVar2 == null || (H2 = aaVar2.mo127257H()) == null)) {
            this.f184763W.add(H2);
        }
        InteractStickerStruct h = mo127701U().mo128050h();
        if (h != null) {
            this.f184763W.add(h);
        }
        C82468o oVar2 = this.f184782t;
        if (oVar2 != null) {
            list5 = oVar2.mo127234H();
        }
        if (list5 != null && !list5.isEmpty()) {
            this.f184763W.addAll(list5);
        }
        C82299l lVar2 = this.f184783u;
        if (!(lVar2 == null || (H = lVar2.mo127234H()) == null || H.isEmpty())) {
            this.f184763W.addAll(H);
        }
        AbstractC82791h hVar2 = this.f184778i;
        if (!(hVar2 == null || (E = hVar2.mo127750E()) == null)) {
            this.f184763W.add(E);
        }
        InfoStickerModel infoStickerModel = mo127694I().infoStickerModel;
        if (!((infoStickerModel == null || (list4 = infoStickerModel.stickers) == null || list4.isEmpty() || (aVar = this.f184754M) == null || (list3 = aVar.mo77605a(mo36484r(), list4, C63244g.m114602a().mo73261G())) == null) && (list3 = C89086z.INSTANCE) == null) && !list3.isEmpty()) {
            this.f184763W.addAll(list3);
        }
        mo127694I().setMainBusinessData(C71073b.m125561a(mo127694I().getMainBusinessContext(), this.f184763W, EnumC71088d.TRACK_PAGE_EDIT));
        VideoPublishEditModel I = mo127694I();
        C82468o oVar3 = this.f184782t;
        if (oVar3 == null || (list = oVar3.mo127235I()) == null) {
            list = C89086z.INSTANCE;
        }
        I.mentionTextList = list;
        VideoPublishEditModel I2 = mo127694I();
        C82299l lVar3 = this.f184783u;
        if (lVar3 == null || (list2 = lVar3.mo127235I()) == null) {
            list2 = C89086z.INSTANCE;
        }
        I2.hashTagTextList = list2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.c$p */
    public static final class C82692p<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        public static final C82692p f184872a = new C82692p();

        static {
            Covode.recordClassIndex(96539);
        }

        C82692p() {
        }

        @Override // p077b.AbstractC1729g
        public final /* bridge */ /* synthetic */ Object then(C1731i iVar) {
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.c$by */
    public static final class C82672by extends AbstractC89220m implements AbstractC89172b<C21597n, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82617c f184849a;

        static {
            Covode.recordClassIndex(96519);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82672by(C82617c cVar) {
            super(1);
            this.f184849a = cVar;
        }

        /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.c$by$a */
        public static final class C82673a extends AbstractC21603p<C46224i> {

            /* renamed from: a */
            final /* synthetic */ C82672by f184850a;

            static {
                Covode.recordClassIndex(96520);
            }

            public C82673a(C82672by byVar) {
                this.f184850a = byVar;
            }

            @Override // com.bytedance.p1559o.AbstractC21603p
            public final C46224i get(C21582f fVar) {
                C89219l.m154721d(fVar, "");
                return this.f184850a.f184849a.mo127713aa();
            }
        }

        /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.c$by$b */
        public static final class C82674b extends AbstractC21603p<VideoPublishEditModel> {

            /* renamed from: a */
            final /* synthetic */ C82672by f184851a;

            static {
                Covode.recordClassIndex(96521);
            }

            public C82674b(C82672by byVar) {
                this.f184851a = byVar;
            }

            @Override // com.bytedance.p1559o.AbstractC21603p
            public final VideoPublishEditModel get(C21582f fVar) {
                C89219l.m154721d(fVar, "");
                return this.f184851a.f184849a.mo127694I();
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C21597n nVar) {
            C21597n nVar2 = nVar;
            C89219l.m154721d(nVar2, "");
            C89219l.m154716b(nVar2.mo35260a(C46224i.class, (String) null, (AbstractC21603p) new C82673a(this)), "");
            C89219l.m154716b(nVar2.mo35260a(VideoPublishEditModel.class, (String) null, (AbstractC21603p) new C82674b(this)), "");
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.c$ad */
    public static final class C82622ad<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C82617c f184793a;

        static {
            Covode.recordClassIndex(96469);
        }

        C82622ad(C82617c cVar) {
            this.f184793a = cVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                this.f184793a.mo127723b(bool.booleanValue());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.c$ae */
    public static final class C82623ae<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C82617c f184794a;

        static {
            Covode.recordClassIndex(96470);
        }

        C82623ae(C82617c cVar) {
            this.f184794a = cVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                this.f184794a.mo127724c(bool.booleanValue());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.c$af */
    public static final class C82624af<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C82617c f184795a;

        static {
            Covode.recordClassIndex(96471);
        }

        C82624af(C82617c cVar) {
            this.f184795a = cVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                this.f184795a.mo127725d(bool.booleanValue());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.c$au */
    public static final class C82639au<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C82617c f184810a;

        static {
            Covode.recordClassIndex(96486);
        }

        C82639au(C82617c cVar) {
            this.f184810a = cVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            if (obj != null) {
                this.f184810a.mo127706Z().mo127929i();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.c$bf */
    public static final class C82651bf<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C82617c f184822a;

        static {
            Covode.recordClassIndex(96498);
        }

        C82651bf(C82617c cVar) {
            this.f184822a = cVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            C83031d X = this.f184822a.mo127704X();
            if (X != null) {
                X.getDiContainer();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.c$bw */
    public static final class C82670bw extends AbstractC21603p<C83016c> {

        /* renamed from: a */
        final /* synthetic */ C2553d f184846a;

        /* renamed from: b */
        final /* synthetic */ C82617c f184847b;

        static {
            Covode.recordClassIndex(96517);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C83016c get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C83016c(fVar, this.f184847b);
        }

        public C82670bw(C2553d dVar, C82617c cVar) {
            this.f184846a = dVar;
            this.f184847b = cVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.c$bx */
    public static final class C82671bx extends AbstractC89220m implements AbstractC89172b<C2554e, C89391z> {

        /* renamed from: a */
        public static final C82671bx f184848a = new C82671bx();

        static {
            Covode.recordClassIndex(96518);
        }

        C82671bx() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C2554e eVar) {
            C2554e eVar2 = eVar;
            C89219l.m154721d(eVar2, "");
            eVar2.f7721a = C68093f.m120394a();
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ FrameLayout m142800a(C82617c cVar) {
        FrameLayout frameLayout = cVar.f184788z;
        if (frameLayout == null) {
            C89219l.m154710a("textPStickerLayout");
        }
        return frameLayout;
    }

    /* renamed from: b */
    public static final /* synthetic */ EditTextStickerViewModel m142803b(C82617c cVar) {
        EditTextStickerViewModel editTextStickerViewModel = cVar.f184786x;
        if (editTextStickerViewModel == null) {
            C89219l.m154710a("textStickerViewModel");
        }
        return editTextStickerViewModel;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af> S1 getState(VM1 vm1) {
        C89219l.m154721d(vm1, "");
        return (S1) AbstractC20382b.C20383a.m38582a(this, vm1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.c$av */
    public static final class C82640av<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C82617c f184811a;

        static {
            Covode.recordClassIndex(96487);
        }

        C82640av(C82617c cVar) {
            this.f184811a = cVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                AbstractC46036a aVar = this.f184811a.f184754M;
                if (aVar != null) {
                    aVar.mo77623b(booleanValue);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.c$ax */
    public static final class C82642ax<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C82617c f184813a;

        static {
            Covode.recordClassIndex(96489);
        }

        C82642ax(C82617c cVar) {
            this.f184813a = cVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                this.f184813a.mo127693H().mo114815d(bool.booleanValue());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.c$bj */
    public static final class C82656bj extends AbstractC89220m implements AbstractC89172b<C46239q, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82617c f184827a;

        static {
            Covode.recordClassIndex(96503);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82656bj(C82617c cVar) {
            super(1);
            this.f184827a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C46239q qVar) {
            C46239q qVar2 = qVar;
            C89219l.m154721d(qVar2, "");
            this.f184827a.mo127716ad();
            this.f184827a.mo127706Z().mo127916a(qVar2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.c$bq */
    public static final class C82663bq extends AbstractC21603p<C82840b> {

        /* renamed from: a */
        final /* synthetic */ C2553d f184833a;

        /* renamed from: b */
        final /* synthetic */ C82617c f184834b;

        static {
            Covode.recordClassIndex(96510);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C82840b get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            C82617c cVar = this.f184834b;
            return new C82840b(fVar, cVar, C82617c.m142800a(cVar));
        }

        public C82663bq(C2553d dVar, C82617c cVar) {
            this.f184833a = dVar;
            this.f184834b = cVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.c$bs */
    public static final class C82666bs extends AbstractC21603p<C82958b> {

        /* renamed from: a */
        final /* synthetic */ C2553d f184838a;

        /* renamed from: b */
        final /* synthetic */ C82617c f184839b;

        static {
            Covode.recordClassIndex(96513);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C82958b get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            C82617c cVar = this.f184839b;
            View c = cVar.mo36475c(R.id.c5g);
            C89219l.m154716b(c, "");
            return new C82958b(fVar, cVar, (PollingStickerLayout) c);
        }

        public C82666bs(C2553d dVar, C82617c cVar) {
            this.f184838a = dVar;
            this.f184839b = cVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.c$bt */
    public static final class C82667bt extends AbstractC21603p<C82983b> {

        /* renamed from: a */
        final /* synthetic */ C2553d f184840a;

        /* renamed from: b */
        final /* synthetic */ C82617c f184841b;

        static {
            Covode.recordClassIndex(96514);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C82983b get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            C82617c cVar = this.f184841b;
            View c = cVar.mo36475c(R.id.c5k);
            C89219l.m154716b(c, "");
            return new C82983b(fVar, cVar, (QaStickerEditLayout) c, this.f184841b.mo127694I());
        }

        public C82667bt(C2553d dVar, C82617c cVar) {
            this.f184840a = dVar;
            this.f184841b = cVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.c$bu */
    public static final class C82668bu extends AbstractC21603p<C82879b> {

        /* renamed from: a */
        final /* synthetic */ C2553d f184842a;

        /* renamed from: b */
        final /* synthetic */ C82617c f184843b;

        static {
            Covode.recordClassIndex(96515);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C82879b get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            C82617c cVar = this.f184843b;
            View c = cVar.mo36475c(R.id.c4r);
            C89219l.m154716b(c, "");
            return new C82879b(fVar, cVar, (LiveCDEditStickerLayout) c);
        }

        public C82668bu(C2553d dVar, C82617c cVar) {
            this.f184842a = dVar;
            this.f184843b = cVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.c$bv */
    public static final class C82669bv extends AbstractC21603p<C82815b> {

        /* renamed from: a */
        final /* synthetic */ C2553d f184844a;

        /* renamed from: b */
        final /* synthetic */ C82617c f184845b;

        static {
            Covode.recordClassIndex(96516);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C82815b get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            C82617c cVar = this.f184845b;
            View c = cVar.mo36475c(R.id.c3w);
            C89219l.m154716b(c, "");
            return new C82815b(fVar, cVar, (DuetEditStickerLayout) c);
        }

        public C82669bv(C2553d dVar, C82617c cVar) {
            this.f184844a = dVar;
            this.f184845b = cVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.c$r */
    public static final class C82694r<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C82617c f184875a;

        static {
            Covode.recordClassIndex(96541);
        }

        C82694r(C82617c cVar) {
            this.f184875a = cVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            C88297u uVar = (C88297u) obj;
            if (uVar == null) {
                return;
            }
            if (uVar.f200378j == 1) {
                this.f184875a.mo127693H().mo114805a((AbstractC72510a) false, false, false);
            } else {
                this.f184875a.mo127693H().mo114805a((AbstractC72510a) true, false, true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.c$u */
    public static final class C82697u<T> implements AbstractC78486c {

        /* renamed from: a */
        final /* synthetic */ C82617c f184878a;

        static {
            Covode.recordClassIndex(96544);
        }

        C82697u(C82617c cVar) {
            this.f184878a = cVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.tools.p4115e.AbstractC78486c
        /* renamed from: a */
        public final /* synthetic */ void mo87979a(Object obj) {
            View view = (View) obj;
            this.f184878a.mo127716ad();
            if (view instanceof CommentStickerView) {
                this.f184878a.mo127706Z().mo127916a((AbstractC45904h) view);
            }
        }
    }

    /* renamed from: a */
    public final void mo127708a(AbstractC14552j jVar) {
        C89219l.m154721d(jVar, "");
        this.f184776g = jVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.c$aw */
    public static final class C82641aw<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C82617c f184812a;

        static {
            Covode.recordClassIndex(96488);
        }

        C82641aw(C82617c cVar) {
            this.f184812a = cVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            AbstractC46036a aVar;
            boolean booleanValue;
            C89378p pVar = (C89378p) obj;
            if (pVar != null && (aVar = this.f184812a.f184754M) != null && !aVar.mo77629e()) {
                this.f184812a.mo127693H().mo114805a((AbstractC72510a) ((Boolean) pVar.getFirst()).booleanValue(), ((Boolean) pVar.getSecond()).booleanValue(), booleanValue);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.c$s */
    public static final class C82695s<T> implements AbstractC78486c {

        /* renamed from: a */
        final /* synthetic */ C82617c f184876a;

        static {
            Covode.recordClassIndex(96542);
        }

        C82695s(C82617c cVar) {
            this.f184876a = cVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.tools.p4115e.AbstractC78486c
        /* renamed from: a */
        public final /* synthetic */ void mo87979a(Object obj) {
            View view = (View) obj;
            this.f184876a.mo127716ad();
            AbstractC82791h hVar = this.f184876a.f184778i;
            if (hVar != null) {
                C89219l.m154716b(view, "");
                if (hVar.mo127768a(view)) {
                    this.f184876a.mo127706Z().mo127916a((AbstractC45904h) view);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.c$t */
    public static final class C82696t<T, U> implements AbstractC78484a {

        /* renamed from: a */
        final /* synthetic */ C82617c f184877a;

        static {
            Covode.recordClassIndex(96543);
        }

        C82696t(C82617c cVar) {
            this.f184877a = cVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.tools.p4115e.AbstractC78484a
        /* renamed from: a */
        public final /* synthetic */ void mo122407a(Object obj) {
            AbstractC82791h hVar;
            C45922g gVar = (C45922g) obj;
            AbstractC82791h hVar2 = this.f184877a.f184778i;
            if (hVar2 != null && hVar2.mo127757L() && (hVar = this.f184877a.f184778i) != null) {
                C89219l.m154716b(gVar, "");
                if (hVar.mo127772b(gVar)) {
                    AbstractC82839a Z = this.f184877a.mo127706Z();
                    View drawView = gVar.getDrawView();
                    Objects.requireNonNull(drawView, "null cannot be cast to non-null type com.ss.android.ugc.aweme.editSticker.interact.TimeEditable<*>");
                    Z.mo127923b((AbstractC45904h) drawView);
                    this.f184877a.mo127706Z().mo127922b();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.c$v */
    public static final class C82698v<T, U> implements AbstractC78484a {

        /* renamed from: a */
        final /* synthetic */ C82617c f184879a;

        static {
            Covode.recordClassIndex(96545);
        }

        C82698v(C82617c cVar) {
            this.f184879a = cVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.tools.p4115e.AbstractC78484a
        /* renamed from: a */
        public final /* synthetic */ void mo122407a(Object obj) {
            C45922g gVar = (C45922g) obj;
            AbstractC82034aa aaVar = this.f184879a.f184780k;
            if (aaVar != null && aaVar.mo127262M() && (gVar instanceof C71069d)) {
                AbstractC82839a Z = this.f184879a.mo127706Z();
                View drawView = gVar.getDrawView();
                Objects.requireNonNull(drawView, "null cannot be cast to non-null type com.ss.android.ugc.aweme.commentStickerPanel.itemview.CommentStickerView");
                Z.mo127923b((CommentStickerView) drawView);
                this.f184879a.mo127706Z().mo127922b();
            }
        }
    }

    /* renamed from: b */
    public final void mo127723b(boolean z) {
        AbstractC82839a Z = mo127706Z();
        if (!Z.mo127926f()) {
            Z.mo127920a(z);
        }
        mo127697Q().mo128020a(z);
        mo127699S().mo127881a(z);
        mo127698R().mo127955a(z);
        mo127701U().mo128043a(z);
        C83076b bVar = this.f184784v;
        if (bVar != null) {
            bVar.mo128183a(z);
        }
        C82299l lVar = this.f184783u;
        if (lVar != null) {
            lVar.mo127247a(z);
        }
        C82468o oVar = this.f184782t;
        if (oVar != null) {
            oVar.mo127247a(z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.c$bd */
    public static final class C82649bd<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C82617c f184820a;

        static {
            Covode.recordClassIndex(96496);
        }

        C82649bd(C82617c cVar) {
            this.f184820a = cVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            boolean z;
            C88297u uVar = (C88297u) obj;
            if (uVar != null) {
                C82617c cVar = this.f184820a;
                if (uVar.f200378j == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (uVar.f200375g) {
                    cVar.mo127702V().mo127690m().setValue(Boolean.valueOf(z));
                } else {
                    cVar.mo127702V().mo127689l().setValue(Boolean.valueOf(z));
                }
                if (z) {
                    cVar.mo127702V().mo127691n().setValue(false);
                    cVar.mo127702V().mo127692o().setValue(false);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.c$be */
    public static final class C82650be<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C82617c f184821a;

        static {
            Covode.recordClassIndex(96497);
        }

        C82650be(C82617c cVar) {
            this.f184821a = cVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool;
            LiveData<Boolean> e;
            Boolean bool2 = (Boolean) obj;
            C89219l.m154716b(bool2, "");
            if (bool2.booleanValue()) {
                this.f184821a.mo127695J().mo64944b();
                AbstractC82034aa aaVar = this.f184821a.f184780k;
                if (aaVar != null) {
                    CommentVideoModel commentVideoModel = this.f184821a.mo127694I().commentVideoModel;
                    aaVar.mo127256G();
                    this.f184821a.mo127694I().commentVideoModel = commentVideoModel;
                    aaVar.mo127263N();
                    if (this.f184821a.mo127694I().commentVideoModel != null) {
                        AbstractC82403a P = this.f184821a.mo127696P();
                        if (P == null || (e = P.mo127499e()) == null) {
                            bool = null;
                        } else {
                            bool = e.getValue();
                        }
                        if (!C89219l.m154714a((Object) bool, (Object) true)) {
                            CommentVideoModel commentVideoModel2 = this.f184821a.mo127694I().commentVideoModel;
                            C89219l.m154716b(commentVideoModel2, "");
                            aaVar.mo127265a(commentVideoModel2, true, true);
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.c$q */
    public static final class C82693q<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ AbstractC31071f f184873a;

        /* renamed from: b */
        final /* synthetic */ AbstractC82035ab f184874b;

        static {
            Covode.recordClassIndex(96540);
        }

        C82693q(AbstractC31071f fVar, AbstractC82035ab abVar) {
            this.f184873a = fVar;
            this.f184874b = abVar;
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
                    j = this.f184873a.mo56368j();
                }
                StickerItemModel stickerItemModel = new StickerItemModel("text_sticker_" + textStickerCompileResult.index, textStickerCompileResult.stickerPath, b, textStickerCompileResult.index, false, i, j, 2);
                stickerItemModel.isImageStickerLayer = true;
                stickerItemModel.viewHash = textStickerCompileResult.viewHash;
                this.f184874b.mo87638a(stickerItemModel);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: c */
    public final void mo127724c(boolean z) {
        AbstractC46036a aVar = this.f184754M;
        if (aVar != null) {
            aVar.mo77626c(z);
        }
        AbstractC82839a Z = mo127706Z();
        if (!Z.mo127927g()) {
            Z.mo127920a(z);
        }
        mo127697Q().mo128020a(z);
        mo127699S().mo127881a(z);
        mo127698R().mo127955a(z);
        mo127701U().mo128043a(z);
        C83076b bVar = this.f184784v;
        if (bVar != null) {
            bVar.mo128183a(z);
        }
        AbstractC82034aa aaVar = this.f184780k;
        if (aaVar != null) {
            aaVar.mo127271a(z);
        }
        AbstractC82791h hVar = this.f184778i;
        if (hVar != null) {
            hVar.mo127767a(z);
        }
        C82468o oVar = this.f184782t;
        if (oVar != null) {
            oVar.mo127247a(z);
        }
        C82299l lVar = this.f184783u;
        if (lVar != null) {
            lVar.mo127247a(z);
        }
    }

    /* renamed from: d */
    public final void mo127725d(boolean z) {
        mo127697Q().mo128020a(z);
        mo127699S().mo127881a(z);
        C83076b bVar = this.f184784v;
        if (bVar != null) {
            bVar.mo128183a(z);
        }
        mo127698R().mo127955a(z);
        mo127701U().mo128043a(z);
        AbstractC82034aa aaVar = this.f184780k;
        if (aaVar != null) {
            aaVar.mo127271a(z);
        }
        AbstractC82791h hVar = this.f184778i;
        if (hVar != null) {
            hVar.mo127767a(z);
        }
        AbstractC46036a aVar = this.f184754M;
        if (aVar != null) {
            aVar.mo77626c(z);
        }
        mo127706Z().mo127920a(z);
        C82299l lVar = this.f184783u;
        if (lVar != null) {
            lVar.mo127247a(z);
        }
        C82468o oVar = this.f184782t;
        if (oVar != null) {
            oVar.mo127247a(z);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.c$br */
    public static final class C82664br extends AbstractC21603p<C46037b> {

        /* renamed from: a */
        final /* synthetic */ C2553d f184835a;

        /* renamed from: b */
        final /* synthetic */ C82617c f184836b;

        static {
            Covode.recordClassIndex(96511);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C46037b get(C21582f fVar) {
            Integer num;
            Integer num2;
            boolean z;
            C89219l.m154721d(fVar, "");
            Integer a = C63253l.f143623a.mo73323s().mo93859f().mo93860a();
            if (a != null && a.intValue() == 0) {
                num = 30;
            } else {
                num = C63253l.f143623a.mo73323s().mo93859f().mo93860a();
            }
            C82617c cVar = this.f184836b;
            C826651 r6 = new AbstractC46043d(this) {
                /* class com.p2082ss.android.ugc.gamora.editor.sticker.core.C82617c.C82664br.C826651 */

                /* renamed from: a */
                final /* synthetic */ C82664br f184837a;

                static {
                    Covode.recordClassIndex(96512);
                }

                @Override // com.p2082ss.android.ugc.aweme.editSticker.text.als.AbstractC46043d
                /* renamed from: a */
                public final InfoStickerModel mo77723a() {
                    return this.f184837a.f184836b.mo127694I().infoStickerModel;
                }

                {
                    this.f184837a = r1;
                }
            };
            boolean a2 = C71513p.m126385a();
            C89219l.m154716b(num, "");
            int intValue = num.intValue();
            boolean isReverse = this.f184836b.mo127694I().isReverse();
            C82617c cVar2 = this.f184836b;
            VideoPublishEditModel I = cVar2.mo127694I();
            AbstractC31071f value = cVar2.mo127693H().mo114778C().getValue();
            if (value != null) {
                num2 = Integer.valueOf(value.mo56368j());
            } else {
                num2 = null;
            }
            if (!C65387c.m117084a() || I.isCommentReply() || I.mIsFromDraft || I.isRetakeVideo() || num2 == null || num2.intValue() < 60000) {
                z = false;
            } else {
                z = true;
            }
            return new C46037b(fVar, cVar, r6, a2, intValue, isReverse, z);
        }

        public C82664br(C2553d dVar, C82617c cVar) {
            this.f184835a = dVar;
            this.f184836b = cVar;
        }
    }

    public C82617c(C21582f fVar) {
        C89219l.m154721d(fVar, "");
        this.f184756O = fVar;
        AbstractC89277c a = C89204ab.m154669a(CommentAndQuestionAndQuestionStickerPanelViewModel.class);
        this.f184774e = C89250i.m154773a((AbstractC89171a) new C82684h(this, a, a));
        this.f184775f = C89250i.m154774a(EnumC89331m.NONE, new C82686j(this));
        this.f184757Q = C89250i.m154774a(EnumC89331m.NONE, new C82645b(this));
        this.f184758R = C89250i.m154774a(EnumC89331m.NONE, new C82676c(this));
        this.f184759S = C89250i.m154774a(EnumC89331m.NONE, new C82680d(this));
        this.f184779j = C89250i.m154774a(EnumC89331m.NONE, new C82687k(this));
        this.f184760T = C89250i.m154774a(EnumC89331m.NONE, new C82681e(this));
        this.f184761U = C89250i.m154774a(EnumC89331m.NONE, new C82682f(this));
        AbstractC89277c a2 = C89204ab.m154669a(EditStickerViewModel.class);
        this.f184762V = C89250i.m154773a((AbstractC89171a) new C82685i(this, a2, a2));
        this.f184763W = new ArrayList();
        this.f184764X = C89250i.m154773a((AbstractC89171a) new C82661bo(this));
        this.f184766Z = new SafeHandler(getLifecycleOwner());
        this.f184767aa = C89250i.m154774a(EnumC89331m.NONE, new C82683g(this));
        this.f184768ab = C89250i.m154773a((AbstractC89171a) new C82677ca(this));
    }

    /* renamed from: a */
    public final void mo127709a(AbstractC45899e eVar) {
        C89219l.m154721d(eVar, "");
        this.f184777h = eVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.c$bl */
    public static final class C82658bl extends AbstractC89220m implements AbstractC89172b<C46239q, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82617c f184829a;

        static {
            Covode.recordClassIndex(96505);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82658bl(C82617c cVar) {
            super(1);
            this.f184829a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C46239q qVar) {
            String audioText;
            C46239q qVar2 = qVar;
            C89219l.m154721d(qVar2, "");
            TextStickerData data = qVar2.getData();
            if (data != null) {
                C82617c cVar = this.f184829a;
                C89219l.m154716b(data, "");
                AbstractC82503a aVar = (AbstractC82503a) cVar.f184779j.getValue();
                if (aVar != null) {
                    aVar.mo127587a(1, -1);
                }
                if (C83064h.m143408a()) {
                    if (cVar.mo127704X() != null) {
                        if (!C83067k.m143424b() || data.getHasReadTextAudio()) {
                            if (data.getHasReadTextAudio()) {
                                new C45902g().f106891a.storeInt("change_text_toast_shown", 4);
                            }
                            ShortVideoCommonParams shortVideoCommonParams = new ShortVideoCommonParams(cVar.mo127694I().mShootWay, C71817eu.m126790a(cVar.mo127694I()), C71817eu.m126792c(cVar.mo127694I()), cVar.mo127694I().creationId);
                            C89219l.m154721d(shortVideoCommonParams, "");
                            C39162r.m79460a("click_change_voice", new C84425b().mo129406a("shoot_way", shortVideoCommonParams.shootWay).mo129406a("content_source", shortVideoCommonParams.contentSource).mo129406a("content_type", shortVideoCommonParams.contentType).mo129406a("creation_id", shortVideoCommonParams.creationId).f188764a);
                            C83031d X = cVar.mo127704X();
                            if (X == null) {
                                C89219l.m154715b();
                            }
                            X.mo128126a(true, false, qVar2);
                        } else {
                            C83066j.m143417a(new ShortVideoCommonParams(cVar.mo127694I().mShootWay, C71817eu.m126790a(cVar.mo127694I()), C71817eu.m126792c(cVar.mo127694I()), cVar.mo127694I().creationId), "auto", "bubble");
                            C83031d X2 = cVar.mo127704X();
                            if (X2 == null) {
                                C89219l.m154715b();
                            }
                            X2.mo128125a(C46110t.m88973i(data.getTextWrapList()), C83067k.m143425c(), data);
                        }
                    }
                } else if (!C72829c.m128602a(cVar.mo36485s())) {
                    new C79459a(cVar.f52549m).mo123052a(cVar.mo36476c_(R.string.axx)).mo123053a();
                } else if (data.getHasReadTextAudio()) {
                    C83066j.m143418b(new ShortVideoCommonParams(cVar.mo127694I().mShootWay, C71817eu.m126790a(cVar.mo127694I()), C71817eu.m126792c(cVar.mo127694I()), cVar.mo127694I().creationId));
                    if (data.getAudioTrackIndex() >= 0) {
                        AbstractC31071f value = cVar.mo127693H().mo114778C().getValue();
                        if (value != null) {
                            value.mo56351e(data.getAudioTrackIndex());
                            value.mo56265a(data.getStartTime(), C85581w.EnumC85607f.EDITOR_SEEK_FLAG_LastSeek);
                        }
                        data.setHasReadTextAudio(false);
                        data.setAudioTrackIndex(-1);
                    }
                    AbstractC31071f value2 = cVar.mo127693H().mo114778C().getValue();
                    if (value2 != null) {
                        value2.mo56388t();
                    }
                } else {
                    C83066j.m143417a(new ShortVideoCommonParams(cVar.mo127694I().mShootWay, C71817eu.m126790a(cVar.mo127694I()), C71817eu.m126792c(cVar.mo127694I()), cVar.mo127694I().creationId), "", "");
                    String audioTrackFilePath = data.getAudioTrackFilePath();
                    if (audioTrackFilePath != null && audioTrackFilePath.length() > 0 && new File(data.getAudioTrackFilePath()).exists() && (audioText = data.getAudioText()) != null && audioText.length() > 0 && (!data.getTextWrapList().isEmpty()) && C89219l.m154714a((Object) data.getAudioText(), (Object) C46110t.m88973i(data.getTextWrapList()))) {
                        cVar.mo127710a(data);
                        cVar.mo127715ac();
                    } else if (C83065i.m143413a(qVar2.getText())) {
                        cVar.mo127693H().mo114812c(true);
                        ProgressDialogC81146b bVar = cVar.f184753L;
                        if (bVar != null) {
                            bVar.cancel();
                        }
                        Activity t = cVar.mo36486t();
                        C89219l.m154716b(t, "");
                        cVar.f184753L = ProgressDialogC81146b.C81148b.m140903a(t, ProgressDialogC81146b.EnumC81147a.VISIBLE, new C82691o(cVar));
                        ProgressDialogC81146b bVar2 = cVar.f184753L;
                        if (bVar2 == null) {
                            C89219l.m154715b();
                        }
                        bVar2.setMessage(cVar.mo36486t().getString(R.string.g1j));
                        ProgressDialogC81146b bVar3 = cVar.f184753L;
                        if (bVar3 == null) {
                            C89219l.m154715b();
                        }
                        bVar3.show();
                        AbstractC31071f value3 = cVar.mo127693H().mo114778C().getValue();
                        if (value3 != null) {
                            value3.mo56390u();
                        }
                        ReadTextViewModel readTextViewModel = cVar.f184750I;
                        if (readTextViewModel == null) {
                            C89219l.m154710a("readTextViewModel");
                        }
                        String text = qVar2.getText();
                        C89219l.m154716b(text, "");
                        String c_ = cVar.mo36476c_(R.string.ay3);
                        C89219l.m154716b(c_, "");
                        C89219l.m154721d(data, "");
                        C89219l.m154721d(text, "");
                        C89219l.m154721d(c_, "");
                        if (C63244g.m114602a().mo73255A().mo93903b() && !C63244g.m114602a().mo73255A().mo93901a()) {
                            readTextViewModel.f185461c = System.currentTimeMillis();
                            readTextViewModel.f185460b.mo142944a();
                            C22944d dVar = new C22944d();
                            dVar.f35401d = 30000;
                            dVar.f35400c = 30000;
                            dVar.f35402e = 30000;
                            readTextViewModel.f185460b.mo142945a(((ReadTextApi.Api) ((ReadTextApi) readTextViewModel.f185459a.getValue()).f185456a.getValue()).submitText(text, dVar).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new ReadTextViewModel.C83009d(readTextViewModel, data, text, c_), new ReadTextViewModel.C83010e(readTextViewModel, c_)));
                        }
                    } else {
                        new C79459a(cVar.f52549m).mo123052a(cVar.mo36476c_(R.string.ay1)).mo123053a();
                    }
                }
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public void mo22704a(Bundle bundle) {
        C2563k<Boolean> c;
        C2563k<C89378p<Boolean, Boolean>> b;
        C2563k<C89391z> a;
        super.mo22704a(bundle);
        C84911q.m145921a("EditStickerScene onActivityCreated");
        C2555f.m7466a(this, C82671bx.f184848a);
        C2556g.m7472a(this, new C82672by(this));
        C2551b bVar = new C2551b(C2552c.m7462a(this));
        C2553d dVar = new C2553d();
        AlsLogicContainer alsLogicContainer = bVar.f7720a;
        alsLogicContainer.f7696d.mo35260a(C82840b.class, (String) null, (AbstractC21603p) new C82663bq(dVar, this));
        alsLogicContainer.mo7005a(EditInfoStickerViewModel.class, C82840b.class);
        C2553d dVar2 = new C2553d();
        AlsLogicContainer alsLogicContainer2 = bVar.f7720a;
        alsLogicContainer2.f7696d.mo35260a(C46037b.class, (String) null, (AbstractC21603p) new C82664br(dVar2, this));
        alsLogicContainer2.mo7005a(EditTextStickerViewModel.class, C46037b.class);
        C2553d dVar3 = new C2553d();
        AlsLogicContainer alsLogicContainer3 = bVar.f7720a;
        alsLogicContainer3.f7696d.mo35260a(C82958b.class, (String) null, (AbstractC21603p) new C82666bs(dVar3, this));
        alsLogicContainer3.mo7005a(EditPollStickerViewModel.class, C82958b.class);
        C2553d dVar4 = new C2553d();
        AlsLogicContainer alsLogicContainer4 = bVar.f7720a;
        alsLogicContainer4.f7696d.mo35260a(C82983b.class, (String) null, (AbstractC21603p) new C82667bt(dVar4, this));
        alsLogicContainer4.mo7005a(EditPageQaStickerViewModel.class, C82983b.class);
        C2553d dVar5 = new C2553d();
        AlsLogicContainer alsLogicContainer5 = bVar.f7720a;
        alsLogicContainer5.f7696d.mo35260a(C82879b.class, (String) null, (AbstractC21603p) new C82668bu(dVar5, this));
        alsLogicContainer5.mo7005a(EditLiveCDStickerViewModel.class, C82879b.class);
        C2553d dVar6 = new C2553d();
        AlsLogicContainer alsLogicContainer6 = bVar.f7720a;
        alsLogicContainer6.f7696d.mo35260a(C82815b.class, (String) null, (AbstractC21603p) new C82669bv(dVar6, this));
        alsLogicContainer6.mo7005a(EditDuetStickerViewModel.class, C82815b.class);
        C2553d dVar7 = new C2553d();
        AlsLogicContainer alsLogicContainer7 = bVar.f7720a;
        alsLogicContainer7.f7696d.mo35260a(C83016c.class, (String) null, (AbstractC21603p) new C82670bw(dVar7, this));
        alsLogicContainer7.mo7005a(AbstractC83015b.class, C83016c.class);
        bVar.mo7031a();
        this.f184754M = (AbstractC46036a) getDiContainer().mo35249a(AbstractC46036a.class, (String) null);
        Activity activity = this.f52549m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a2 = C20531t.m38716a((ActivityC0945e) activity).mo33800a(EditDonationStickerViewModel.class);
        C89219l.m154716b(a2, "");
        this.f184785w = (EditDonationStickerViewModel) a2;
        Activity activity2 = this.f52549m;
        Objects.requireNonNull(activity2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a3 = C20531t.m38716a((ActivityC0945e) activity2).mo33800a(EditToolbarViewModel.class);
        C89219l.m154716b(a3, "");
        this.f184787y = (EditToolbarViewModel) a3;
        this.f184748G = new C71025g();
        Activity activity3 = this.f52549m;
        Objects.requireNonNull(activity3, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        AbstractC1174ac a4 = C1181ae.m3881a((ActivityC0945e) activity3, (C1175ad.AbstractC1177b) null).mo3983a(InfoStickerViewModel.class);
        C89219l.m154716b(a4, "");
        this.f184749H = (InfoStickerViewModel) a4;
        Activity activity4 = this.f52549m;
        Objects.requireNonNull(activity4, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a5 = C20531t.m38716a((ActivityC0945e) activity4).mo33800a(ReadTextViewModel.class);
        C89219l.m154716b(a5, "");
        this.f184750I = (ReadTextViewModel) a5;
        Activity activity5 = this.f52549m;
        Objects.requireNonNull(activity5, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a6 = C20531t.m38716a((ActivityC0945e) activity5).mo33800a(EditTextStickerViewModel.class);
        C89219l.m154716b(a6, "");
        EditTextStickerViewModel editTextStickerViewModel = (EditTextStickerViewModel) a6;
        this.f184786x = editTextStickerViewModel;
        if (editTextStickerViewModel == null) {
            C89219l.m154710a("textStickerViewModel");
        }
        selectNonNullSubscribe(editTextStickerViewModel, C82703d.f184884a, new C20370ah(), new C82620ab(this));
        EditTextStickerViewModel editTextStickerViewModel2 = this.f184786x;
        if (editTextStickerViewModel2 == null) {
            C89219l.m154710a("textStickerViewModel");
        }
        selectNonNullSubscribe(editTextStickerViewModel2, C82712m.f184893a, new C20370ah(), new C82633ao(this));
        EditTextStickerViewModel editTextStickerViewModel3 = this.f184786x;
        if (editTextStickerViewModel3 == null) {
            C89219l.m154710a("textStickerViewModel");
        }
        selectNonNullSubscribe(editTextStickerViewModel3, C82723x.f184904a, new C20370ah(), new C82647bb(this));
        EditTextStickerViewModel editTextStickerViewModel4 = this.f184786x;
        if (editTextStickerViewModel4 == null) {
            C89219l.m154710a("textStickerViewModel");
        }
        selectNonNullSubscribe(editTextStickerViewModel4, C82612ab.f184731a, new C20370ah(), new C82652bg(this));
        EditTextStickerViewModel editTextStickerViewModel5 = this.f184786x;
        if (editTextStickerViewModel5 == null) {
            C89219l.m154710a("textStickerViewModel");
        }
        selectNonNullSubscribe(editTextStickerViewModel5, C82613ac.f184732a, new C20370ah(), new C82699w(this));
        EditTextStickerViewModel editTextStickerViewModel6 = this.f184786x;
        if (editTextStickerViewModel6 == null) {
            C89219l.m154710a("textStickerViewModel");
        }
        selectNonNullSubscribe(editTextStickerViewModel6, C82704e.f184885a, new C20370ah(), new C82700x(this));
        selectNonNullSubscribe(mo127702V(), C82705f.f184886a, new C20370ah(), new C82701y(this));
        selectNonNullSubscribe(mo127702V(), C82706g.f184887a, new C20370ah(), new C82702z(this));
        selectNonNullSubscribe(mo127702V(), C82707h.f184888a, new C20370ah(), new C82619aa(this));
        selectNonNullSubscribe(mo127702V(), C82708i.f184889a, new C20370ah(), new C82621ac(this));
        mo127702V().mo127689l().observe(this, new C82622ad<>(this));
        mo127702V().mo127690m().observe(this, new C82623ae<>(this));
        mo127702V().mo127684g().observe(this, new C82624af<>(this));
        AbstractC88412b unused = selectSubscribe(mo127702V(), C82709j.f184890a, new C20370ah(), new C82625ag(this));
        AbstractC20382b.C20383a.m38603b(this, mo127702V(), C82710k.f184891a, new C82626ah(this));
        AbstractC20382b.C20383a.m38603b(this, mo127702V(), C82711l.f184892a, new C82627ai(this));
        AbstractC20382b.C20383a.m38603b(this, mo127702V(), C82713n.f184894a, new C82628aj(this));
        AbstractC20382b.C20383a.m38603b(this, mo127702V(), C82714o.f184895a, new C82629ak(this));
        AbstractC20382b.C20383a.m38603b(this, mo127702V(), C82715p.f184896a, new C82630al(this));
        selectNonNullSubscribe(mo127702V(), C82716q.f184897a, new C20370ah(), new C82631am(this));
        selectNonNullSubscribe(mo127702V(), C82717r.f184898a, new C20370ah(), new C82632an(this));
        selectNonNullSubscribe(mo127702V(), C82718s.f184899a, new C20370ah(), new C82634ap(this));
        selectNonNullSubscribe(mo127702V(), C82719t.f184900a, new C20370ah(), new C82635aq(this));
        selectNonNullSubscribe(mo127702V(), C82720u.f184901a, new C20370ah(), new C82636ar(this));
        selectNonNullSubscribe(mo127702V(), C82721v.f184902a, new C20370ah(), new C82637as(this));
        selectNonNullSubscribe(mo127702V(), C82722w.f184903a, new C20370ah(), new C82638at(this));
        AbstractC46036a aVar = this.f184754M;
        if (!(aVar == null || (a = aVar.mo77604a()) == null)) {
            a.mo6997a(getLifecycleOwner(), new C82639au(this));
        }
        mo127702V().mo127691n().observe(this, new C82640av<>(this));
        AbstractC46036a aVar2 = this.f184754M;
        if (aVar2 != null) {
            aVar2.mo77609a(mo127702V().mo127691n());
        }
        AbstractC46036a aVar3 = this.f184754M;
        if (!(aVar3 == null || (b = aVar3.mo77620b()) == null)) {
            b.mo6997a(this, new C82641aw(this));
        }
        AbstractC46036a aVar4 = this.f184754M;
        if (!(aVar4 == null || (c = aVar4.mo77624c()) == null)) {
            c.mo6997a(this, new C82642ax(this));
        }
        ReadTextViewModel readTextViewModel = this.f184750I;
        if (readTextViewModel == null) {
            C89219l.m154710a("readTextViewModel");
        }
        AbstractC20468h.C20469a.m38667a(this, readTextViewModel, C82724y.f184905a, (C20370ah) null, new C82643ay(this), (AbstractC89172b) null, new C82644az(this), 10);
        ReadTextViewModel readTextViewModel2 = this.f184750I;
        if (readTextViewModel2 == null) {
            C89219l.m154710a("readTextViewModel");
        }
        AbstractC20382b.C20383a.m38603b(this, readTextViewModel2, C82725z.f184906a, new C82646ba(this));
        ReadTextViewModel readTextViewModel3 = this.f184750I;
        if (readTextViewModel3 == null) {
            C89219l.m154710a("readTextViewModel");
        }
        selectNonNullSubscribe(readTextViewModel3, C82611aa.f184730a, new C20370ah(), new C82648bc(this));
        mo127693H().mo114780E().observe(this, new C82649bd<>(this));
        mo127695J().f88079l.observe(this, new C82650be(this));
        mo127693H().mo114817f().observe(this, new C82651bf<>(this));
        if (this.f184781l == null) {
            C45906b bVar2 = new C45906b();
            this.f184781l = bVar2;
            mo36387a(R.id.f4j, bVar2, "StickerHintTextScene");
        }
    }

    /* renamed from: a */
    public final void mo127710a(TextStickerData textStickerData) {
        AbstractC31071f value;
        String audioTrackFilePath = textStickerData.getAudioTrackFilePath();
        if (audioTrackFilePath != null && (value = mo127693H().mo114778C().getValue()) != null && audioTrackFilePath.length() > 0) {
            value.mo56265a(textStickerData.getStartTime(), C85581w.EnumC85607f.EDITOR_SEEK_FLAG_LastSeek);
            int a = value.mo56285a(audioTrackFilePath, 0, textStickerData.getAudioTrackDuration(), textStickerData.getStartTime(), textStickerData.getStartTime() + textStickerData.getAudioTrackDuration(), false);
            if (a >= 0) {
                textStickerData.setAudioTrackIndex(a);
                textStickerData.setHasReadTextAudio(true);
                value.mo56313a(a, 1, 1.0f);
            }
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j, com.bytedance.scene.group.AbstractC22186b
    /* renamed from: a */
    public final /* synthetic */ View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return mo22702a(layoutInflater, viewGroup);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.c$aa */
    public static final class C82619aa extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C20526p, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82617c f184790a;

        static {
            Covode.recordClassIndex(96466);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82619aa(C82617c cVar) {
            super(2);
            this.f184790a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C20526p pVar) {
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(pVar, "");
            this.f184790a.mo87911L();
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.c$ac */
    public static final class C82621ac extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C20526p, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82617c f184792a;

        static {
            Covode.recordClassIndex(96468);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82621ac(C82617c cVar) {
            super(2);
            this.f184792a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C20526p pVar) {
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(pVar, "");
            this.f184792a.mo87912M();
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.c$y */
    public static final class C82701y extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C20526p, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82617c f184882a;

        static {
            Covode.recordClassIndex(96548);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82701y(C82617c cVar) {
            super(2);
            this.f184882a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C20526p pVar) {
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(pVar, "");
            this.f184882a.mo127719ag();
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20382b.C20383a.m38593a(this, vm1, bVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.c$ab */
    public static final class C82620ab extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C20391d<? extends C46239q>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82617c f184791a;

        static {
            Covode.recordClassIndex(96467);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82620ab(C82617c cVar) {
            super(2);
            this.f184791a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C20391d<? extends C46239q> dVar) {
            C20391d<? extends C46239q> dVar2 = dVar;
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(dVar2, "");
            T t = dVar2.f48283b;
            C83031d X = this.f184791a.mo127704X();
            if (X != null) {
                X.mo128126a(true, true, (C46239q) t);
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.c$ap */
    public static final class C82634ap extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C20524n<Integer, Integer>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82617c f184805a;

        static {
            Covode.recordClassIndex(96481);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82634ap(C82617c cVar) {
            super(2);
            this.f184805a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C20524n<Integer, Integer> nVar) {
            C20524n<Integer, Integer> nVar2 = nVar;
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(nVar2, "");
            this.f184805a.mo127706Z().mo127917a((C89378p<Integer, Integer>) nVar2.f48283b);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.c$aq */
    public static final class C82635aq extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C20526p, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82617c f184806a;

        static {
            Covode.recordClassIndex(96482);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82635aq(C82617c cVar) {
            super(2);
            this.f184806a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C20526p pVar) {
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(pVar, "");
            this.f184806a.mo127706Z().mo127930j();
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.c$as */
    public static final class C82637as extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C20526p, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82617c f184808a;

        static {
            Covode.recordClassIndex(96484);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82637as(C82617c cVar) {
            super(2);
            this.f184808a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C20526p pVar) {
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(pVar, "");
            AbstractC46036a aVar = this.f184808a.f184754M;
            if (aVar != null) {
                aVar.mo77645t();
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.c$bb */
    public static final class C82647bb extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C20521k, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82617c f184818a;

        static {
            Covode.recordClassIndex(96494);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82647bb(C82617c cVar) {
            super(2);
            this.f184818a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C20521k kVar) {
            C20521k kVar2 = kVar;
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(kVar2, "");
            this.f184818a.mo127713aa().f107687J = kVar2.f48283b.booleanValue();
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.c$x */
    public static final class C82700x extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C20521k, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82617c f184881a;

        static {
            Covode.recordClassIndex(96547);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82700x(C82617c cVar) {
            super(2);
            this.f184881a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C20521k kVar) {
            C20521k kVar2 = kVar;
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(kVar2, "");
            this.f184881a.mo127713aa().setReadTextIcon(kVar2.f48283b.booleanValue());
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.scene.group.AbstractC22186b
    /* renamed from: b */
    public final ViewGroup mo36393b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.ash, viewGroup, false);
        Objects.requireNonNull(a, "null cannot be cast to non-null type android.widget.FrameLayout");
        return (FrameLayout) a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.c$ag */
    public static final class C82625ag extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82617c f184796a;

        static {
            Covode.recordClassIndex(96472);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82625ag(C82617c cVar) {
            super(2);
            this.f184796a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Integer num) {
            Integer num2 = num;
            C89219l.m154721d(iVar, "");
            if (num2 != null) {
                int intValue = num2.intValue();
                View b = this.f184796a.mo36474b(R.id.ey9);
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

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.c$ak */
    public static final class C82629ak extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C89386u<? extends Float, ? extends Float, ? extends Float>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82617c f184800a;

        static {
            Covode.recordClassIndex(96476);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82629ak(C82617c cVar) {
            super(2);
            this.f184800a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C89386u<? extends Float, ? extends Float, ? extends Float> uVar) {
            C89386u<? extends Float, ? extends Float, ? extends Float> uVar2 = uVar;
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(uVar2, "");
            FrameLayout frameLayout = this.f184800a.f184743B;
            if (frameLayout == null) {
                C89219l.m154710a("commentLayout");
            }
            C83253u.m143651a(frameLayout, ((Number) uVar2.getFirst()).floatValue(), ((Number) uVar2.getSecond()).floatValue(), ((Number) uVar2.getThird()).floatValue());
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.c$al */
    public static final class C82630al extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C89386u<? extends Float, ? extends Float, ? extends Float>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82617c f184801a;

        static {
            Covode.recordClassIndex(96477);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82630al(C82617c cVar) {
            super(2);
            this.f184801a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C89386u<? extends Float, ? extends Float, ? extends Float> uVar) {
            C89386u<? extends Float, ? extends Float, ? extends Float> uVar2 = uVar;
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(uVar2, "");
            FrameLayout frameLayout = this.f184801a.f184747F;
            if (frameLayout == null) {
                C89219l.m154710a("captionLayout");
            }
            C83253u.m143651a(frameLayout, ((Number) uVar2.getFirst()).floatValue(), ((Number) uVar2.getSecond()).floatValue(), ((Number) uVar2.getThird()).floatValue());
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.c$an */
    public static final class C82632an extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C20521k, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82617c f184803a;

        static {
            Covode.recordClassIndex(96479);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82632an(C82617c cVar) {
            super(2);
            this.f184803a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C20521k kVar) {
            boolean z;
            C20521k kVar2 = kVar;
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(kVar2, "");
            Boolean bool = (Boolean) kVar2.mo33723a();
            int i = 0;
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            View view = this.f184803a.f52550n;
            C89219l.m154716b(view, "");
            if (!z) {
                i = 8;
            }
            view.setVisibility(i);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.c$ao */
    public static final class C82633ao extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C20526p, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82617c f184804a;

        static {
            Covode.recordClassIndex(96480);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82633ao(C82617c cVar) {
            super(2);
            this.f184804a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C20526p pVar) {
            ProgressDialogC81146b bVar2;
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(pVar, "");
            C83031d X = this.f184804a.mo127704X();
            if (!(X == null || (bVar2 = X.f185509B) == null || !bVar2.isShowing())) {
                ProgressDialogC81146b bVar3 = X.f185509B;
                if (bVar3 != null) {
                    bVar3.dismiss();
                }
                X.mo128120a().mo114812c(false);
                X.f185508A = true;
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.c$ar */
    public static final class C82636ar extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C20524n<Integer, Boolean>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82617c f184807a;

        static {
            Covode.recordClassIndex(96483);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82636ar(C82617c cVar) {
            super(2);
            this.f184807a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C20524n<Integer, Boolean> nVar) {
            C20524n<Integer, Boolean> nVar2 = nVar;
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(nVar2, "");
            T t = nVar2.f48283b;
            int intValue = ((Number) t.component1()).intValue();
            this.f184807a.mo127706Z().mo127915a(intValue, ((Boolean) t.component2()).booleanValue());
            AbstractC46036a aVar = this.f184807a.f184754M;
            if (aVar != null) {
                aVar.mo77607a(intValue);
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.c$at */
    public static final class C82638at extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C20523m, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82617c f184809a;

        static {
            Covode.recordClassIndex(96485);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82638at(C82617c cVar) {
            super(2);
            this.f184809a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C20523m mVar) {
            C20523m mVar2 = mVar;
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(mVar2, "");
            Integer num = (Integer) mVar2.mo33723a();
            if (num != null && num.intValue() == 8) {
                this.f184809a.mo127699S().mo127885e();
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.c$ay */
    public static final class C82643ay extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82617c f184814a;

        static {
            Covode.recordClassIndex(96490);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82643ay(C82617c cVar) {
            super(2);
            this.f184814a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Throwable th) {
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(th, "");
            this.f184814a.mo127693H().mo114812c(false);
            ProgressDialogC81146b bVar = this.f184814a.f184753L;
            if (bVar != null) {
                bVar.cancel();
            }
            this.f184814a.mo127715ac();
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.c$az */
    public static final class C82644az extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, TextStickerData, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82617c f184815a;

        static {
            Covode.recordClassIndex(96491);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82644az(C82617c cVar) {
            super(2);
            this.f184815a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, TextStickerData textStickerData) {
            TextStickerData textStickerData2 = textStickerData;
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(textStickerData2, "");
            this.f184815a.mo127693H().mo114812c(false);
            ProgressDialogC81146b bVar = this.f184815a.f184753L;
            if (bVar != null) {
                bVar.cancel();
            }
            this.f184815a.mo127710a(textStickerData2);
            this.f184815a.mo127715ac();
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.c$bg */
    public static final class C82652bg extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C20391d<? extends String>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82617c f184823a;

        static {
            Covode.recordClassIndex(96499);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82652bg(C82617c cVar) {
            super(2);
            this.f184823a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C20391d<? extends String> dVar) {
            C20391d<? extends String> dVar2 = dVar;
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(dVar2, "");
            T t = dVar2.f48283b;
            C83031d X = this.f184823a.mo127704X();
            if (X != null) {
                X.mo128125a(t, C83067k.m143429e(), (TextStickerData) null);
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.c$bk */
    public static final class C82657bk extends AbstractC89220m implements AbstractC89183m<C46239q, C46239q, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82617c f184828a;

        static {
            Covode.recordClassIndex(96504);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82657bk(C82617c cVar) {
            super(2);
            this.f184828a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C46239q qVar, C46239q qVar2) {
            C46239q qVar3 = qVar2;
            C89219l.m154721d(qVar, "");
            C89219l.m154721d(qVar3, "");
            AbstractC46036a aVar = this.f184828a.f184754M;
            if (aVar != null && aVar.mo77634i()) {
                this.f184828a.mo127706Z().mo127923b(qVar3);
                this.f184828a.mo127706Z().mo127922b();
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.c$z */
    public static final class C82702z extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C20524n<Effect, String>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82617c f184883a;

        static {
            Covode.recordClassIndex(96549);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82702z(C82617c cVar) {
            super(2);
            this.f184883a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C20524n<Effect, String> nVar) {
            C20524n<Effect, String> nVar2 = nVar;
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(nVar2, "");
            T t = nVar2.f48283b;
            this.f184883a.mo87916a((Effect) t.getFirst(), (String) t.getSecond());
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.c$ah */
    public static final class C82626ah extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C89378p<? extends Float, ? extends Long>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82617c f184797a;

        static {
            Covode.recordClassIndex(96473);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82626ah(C82617c cVar) {
            super(2);
            this.f184797a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C89378p<? extends Float, ? extends Long> pVar) {
            C89378p<? extends Float, ? extends Long> pVar2 = pVar;
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(pVar2, "");
            C83253u.m143652a(this.f184797a.mo127703W(), ((Number) pVar2.getFirst()).floatValue(), ((Number) pVar2.getSecond()).longValue());
            C83253u.m143652a(C82617c.m142800a(this.f184797a), ((Number) pVar2.getFirst()).floatValue(), ((Number) pVar2.getSecond()).longValue());
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.c$ai */
    public static final class C82627ai extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C89386u<? extends Float, ? extends Float, ? extends Float>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82617c f184798a;

        static {
            Covode.recordClassIndex(96474);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82627ai(C82617c cVar) {
            super(2);
            this.f184798a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C89386u<? extends Float, ? extends Float, ? extends Float> uVar) {
            C89386u<? extends Float, ? extends Float, ? extends Float> uVar2 = uVar;
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(uVar2, "");
            C83253u.m143651a(this.f184798a.mo127703W(), ((Number) uVar2.getFirst()).floatValue(), ((Number) uVar2.getSecond()).floatValue(), ((Number) uVar2.getThird()).floatValue());
            C83253u.m143651a(C82617c.m142800a(this.f184798a), ((Number) uVar2.getFirst()).floatValue(), ((Number) uVar2.getSecond()).floatValue(), ((Number) uVar2.getThird()).floatValue());
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.c$ba */
    public static final class C82646ba extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C89378p<? extends String, ? extends Integer>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82617c f184817a;

        static {
            Covode.recordClassIndex(96493);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82646ba(C82617c cVar) {
            super(2);
            this.f184817a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C89378p<? extends String, ? extends Integer> pVar) {
            C89378p<? extends String, ? extends Integer> pVar2 = pVar;
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(pVar2, "");
            this.f184817a.mo127693H().mo114812c(false);
            ProgressDialogC81146b bVar2 = this.f184817a.f184753L;
            if (bVar2 != null) {
                bVar2.cancel();
            }
            this.f184817a.mo127715ac();
            if (C72829c.m128602a(this.f184817a.mo36485s())) {
                new C79459a(this.f184817a.f52549m).mo123052a((CharSequence) pVar2.getFirst()).mo123053a();
            } else {
                new C79459a(this.f184817a.f52549m).mo123052a(this.f184817a.mo36476c_(R.string.axx)).mo123053a();
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.c$bc */
    public static final class C82648bc extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C20391d<? extends TextStickerData>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82617c f184819a;

        static {
            Covode.recordClassIndex(96495);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82648bc(C82617c cVar) {
            super(2);
            this.f184819a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C20391d<? extends TextStickerData> dVar) {
            C20391d<? extends TextStickerData> dVar2 = dVar;
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(dVar2, "");
            T t = dVar2.f48283b;
            if (t.getAudioTrackIndex() >= 0) {
                AbstractC31071f value = this.f184819a.mo127693H().mo114778C().getValue();
                if (value != null) {
                    value.mo56351e(t.getAudioTrackIndex());
                }
                t.setHasReadTextAudio(false);
                t.setAudioTrackIndex(-1);
            }
            this.f184819a.mo127710a((TextStickerData) t);
            this.f184819a.mo127715ac();
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.c$w */
    public static final class C82699w extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C20391d<? extends C89378p<? extends TextStickerData, ? extends String>>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82617c f184880a;

        static {
            Covode.recordClassIndex(96546);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82699w(C82617c cVar) {
            super(2);
            this.f184880a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C20391d<? extends C89378p<? extends TextStickerData, ? extends String>> dVar) {
            TextStickerData textStickerData;
            String str;
            C20391d<? extends C89378p<? extends TextStickerData, ? extends String>> dVar2 = dVar;
            String str2 = "";
            C89219l.m154721d(bVar, str2);
            C89219l.m154721d(dVar2, str2);
            T t = dVar2.f48283b;
            if (!(t == null || (textStickerData = (TextStickerData) t.getFirst()) == null)) {
                if (t == null || (str = (String) t.getSecond()) == null) {
                    str = C46110t.m88973i(textStickerData.getTextWrapList());
                }
                C83031d X = this.f184880a.mo127704X();
                if (X != null) {
                    String speakerID = textStickerData.getSpeakerID();
                    if (speakerID != null) {
                        str2 = speakerID;
                    }
                    X.mo128125a(str, str2, textStickerData);
                }
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
        this.f184788z = (FrameLayout) c;
        View c2 = mo36475c(R.id.egw);
        C89219l.m154716b(c2, "");
        this.f184742A = (FrameLayout) c2;
        View c3 = mo36475c(R.id.egs);
        C89219l.m154716b(c3, "");
        this.f184743B = (FrameLayout) c3;
        View c4 = mo36475c(R.id.egv);
        C89219l.m154716b(c4, "");
        this.f184744C = (FrameLayout) c4;
        View c5 = mo36475c(R.id.dbl);
        C89219l.m154716b(c5, "");
        this.f184745D = (FrameLayout) c5;
        View c6 = mo36475c(R.id.apz);
        C89219l.m154716b(c6, "");
        this.f184746E = (FrameLayout) c6;
        View c7 = mo36475c(R.id.b3q);
        C89219l.m154716b(c7, "");
        this.f184747F = (FrameLayout) c7;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.c$aj */
    public static final class C82628aj extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C89386u<? extends Float, ? extends Float, ? extends Float>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82617c f184799a;

        static {
            Covode.recordClassIndex(96475);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82628aj(C82617c cVar) {
            super(2);
            this.f184799a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C89386u<? extends Float, ? extends Float, ? extends Float> uVar) {
            C89386u<? extends Float, ? extends Float, ? extends Float> uVar2 = uVar;
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(uVar2, "");
            FrameLayout frameLayout = this.f184799a.f184744C;
            if (frameLayout == null) {
                C89219l.m154710a("liveCDLayout");
            }
            C83253u.m143651a(frameLayout, ((Number) uVar2.getFirst()).floatValue(), ((Number) uVar2.getSecond()).floatValue(), ((Number) uVar2.getThird()).floatValue());
            FrameLayout frameLayout2 = this.f184799a.f184745D;
            if (frameLayout2 == null) {
                C89219l.m154710a("qaLayout");
            }
            C83253u.m143651a(frameLayout2, ((Number) uVar2.getFirst()).floatValue(), ((Number) uVar2.getSecond()).floatValue(), ((Number) uVar2.getThird()).floatValue());
            FrameLayout frameLayout3 = this.f184799a.f184746E;
            if (frameLayout3 == null) {
                C89219l.m154710a("duetLayout");
            }
            C83253u.m143651a(frameLayout3, ((Number) uVar2.getFirst()).floatValue(), ((Number) uVar2.getSecond()).floatValue(), ((Number) uVar2.getThird()).floatValue());
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.c$am */
    public static final class C82631am extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C20523m, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82617c f184802a;

        static {
            Covode.recordClassIndex(96478);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82631am(C82617c cVar) {
            super(2);
            this.f184802a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0039, code lost:
            r0.mo77639n();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x003c, code lost:
            if (r2 != null) goto L_0x0094;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x003e, code lost:
            r3.f184802a.mo127698R().mo127962h();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0047, code lost:
            if (r2 != null) goto L_0x009c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0049, code lost:
            r1 = r3.f184802a.f184785w;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x004d, code lost:
            if (r1 != null) goto L_0x0054;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x004f, code lost:
            p4600h.p4611f.p4613b.C89219l.m154710a("donationStickerViewModel");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0054, code lost:
            r1.mo112370b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0057, code lost:
            if (r2 != null) goto L_0x00a4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0059, code lost:
            r0 = r3.f184802a.f184782t;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x005d, code lost:
            if (r0 == null) goto L_0x0064;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x005f, code lost:
            ((com.p2082ss.android.ugc.gamora.editor.AbstractC82018a) r0).f183561b.mo112324n();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0064, code lost:
            if (r2 != null) goto L_0x00ac;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0066, code lost:
            r0 = r3.f184802a.f184783u;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x006a, code lost:
            if (r0 == null) goto L_0x0071;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x006c, code lost:
            ((com.p2082ss.android.ugc.gamora.editor.AbstractC82018a) r0).f183561b.mo112324n();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0073, code lost:
            return p4600h.C89391z.f203057a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0081, code lost:
            if (r2.intValue() != 8) goto L_0x001d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x0089, code lost:
            if (r2.intValue() == 1) goto L_0x008c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x0091, code lost:
            if (r2.intValue() == 2) goto L_0x0094;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x0099, code lost:
            if (r2.intValue() == 3) goto L_0x009c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a1, code lost:
            if (r2.intValue() == 4) goto L_0x00a4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:3:0x001b, code lost:
            if (r2 == null) goto L_0x001d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a9, code lost:
            if (r2.intValue() == 6) goto L_0x00ac;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b1, code lost:
            if (r2.intValue() == 7) goto L_0x0071;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:4:0x001d, code lost:
            r3.f184802a.mo127699S().mo127882b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0026, code lost:
            if (r2 != null) goto L_0x0084;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0028, code lost:
            r3.f184802a.mo127706Z().mo127929i();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0031, code lost:
            if (r2 != null) goto L_0x008c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0033, code lost:
            r0 = r3.f184802a.f184754M;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0037, code lost:
            if (r0 == null) goto L_0x003c;
         */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ p4600h.C89391z invoke(com.bytedance.jedi.arch.AbstractC20382b r4, com.bytedance.jedi.arch.C20523m r5) {
            /*
            // Method dump skipped, instructions count: 180
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.sticker.core.C82617c.C82631am.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v25, types: [android.app.Activity] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.p2082ss.android.ugc.aweme.infoSticker.AbstractC56722g
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo87916a(com.p2082ss.android.ugc.effectmanager.effect.model.Effect r10, java.lang.String r11) {
        /*
        // Method dump skipped, instructions count: 793
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.sticker.core.C82617c.mo87916a(com.ss.android.ugc.effectmanager.effect.model.Effect, java.lang.String):void");
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public <S extends AbstractC20368af> AbstractC88412b subscribe(JediViewModel<S> jediViewModel, C20370ah<S> ahVar, AbstractC89183m<? super AbstractC20477i, ? super S, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20382b.C20383a.m38583a(this, jediViewModel, ahVar, mVar);
    }

    /* renamed from: a */
    public final void mo127707a(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        C89219l.m154721d(marginLayoutParams, "");
        AbstractC46036a aVar = this.f184754M;
        if (aVar != null) {
            aVar.mo77636k();
        }
        AbstractC82034aa aaVar = this.f184780k;
        if (aaVar != null) {
            aaVar.mo127258I();
        }
        AbstractC82791h hVar = this.f184778i;
        if (hVar != null) {
            hVar.mo127754I();
        }
        mo127706Z().mo127914a(i, i2, new int[]{marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin});
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.AbstractC82564a
    /* renamed from: a */
    public final C1731i<C89391z> mo87915a(AbstractC31071f fVar, AbstractC82035ab abVar, AbstractC89172b<? super String, String> bVar) {
        C1731i<C89391z> iVar;
        C1731i<C89391z> iVar2;
        C1731i<C89391z> iVar3;
        C1731i<C89391z> iVar4;
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(abVar, "");
        C1731i[] iVarArr = new C1731i[5];
        AbstractC82034aa aaVar = this.f184780k;
        if (aaVar == null || (iVar = aaVar.mo127435a(fVar, abVar, bVar)) == null) {
            iVar = C1731i.m5633a(C89391z.f203057a);
            C89219l.m154716b(iVar, "");
        }
        iVarArr[0] = iVar;
        AbstractC82791h hVar = this.f184778i;
        if (hVar == null || (iVar2 = hVar.mo127435a(fVar, abVar, bVar)) == null) {
            iVar2 = C1731i.m5633a(C89391z.f203057a);
            C89219l.m154716b(iVar2, "");
        }
        iVarArr[1] = iVar2;
        C82468o oVar = this.f184782t;
        if (oVar == null || (iVar3 = oVar.mo127435a(fVar, abVar, bVar)) == null) {
            iVar3 = C1731i.m5633a(C89391z.f203057a);
            C89219l.m154716b(iVar3, "");
        }
        iVarArr[2] = iVar3;
        C82299l lVar = this.f184783u;
        if (lVar == null || (iVar4 = lVar.mo127435a(fVar, abVar, bVar)) == null) {
            iVar4 = C1731i.m5633a(C89391z.f203057a);
            C89219l.m154716b(iVar4, "");
        }
        iVarArr[3] = iVar4;
        iVarArr[4] = mo127701U().mo128037a(fVar, abVar, bVar);
        C1731i<Void> b = C1731i.m5638b((Collection<? extends C1731i<?>>) C89070n.m154522b(iVarArr));
        C89219l.m154716b(b, "");
        if (b.mo5535a()) {
            C1731i<C89391z> a = C1731i.m5633a(C89391z.f203057a);
            C89219l.m154716b(a, "");
            return a;
        }
        C1731i<TContinuationResult> a2 = b.mo5532a(C82692p.f184872a);
        C89219l.m154716b(a2, "");
        return a2;
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
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.sticker.core.C82617c.mo87917b(com.ss.android.ugc.asve.editor.f, com.ss.android.ugc.gamora.editor.ab, h.f.a.b):b.i");
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
