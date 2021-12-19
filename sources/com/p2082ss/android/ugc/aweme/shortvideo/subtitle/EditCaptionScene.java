package com.p2082ss.android.ugc.aweme.shortvideo.subtitle;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.C0643b;
import androidx.core.p036g.AbstractC0688a;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.AbstractC1391ab;
import androidx.recyclerview.widget.C1481r;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.jedi.arch.C20531t;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.bytedance.scene.AbstractC22219j;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.p1713b.C23024a;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.bytedance.tux.dialog.p1713b.C23028c;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.adaptation.C33398a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.effect.AbstractC46263a;
import com.p2082ss.android.ugc.aweme.effect.C46371s;
import com.p2082ss.android.ugc.aweme.language.AbstractC58069b;
import com.p2082ss.android.ugc.aweme.p2724cz.C40903b;
import com.p2082ss.android.ugc.aweme.p2730de.C40970e;
import com.p2082ss.android.ugc.aweme.property.C65339ai;
import com.p2082ss.android.ugc.aweme.property.C65350at;
import com.p2082ss.android.ugc.aweme.property.C65413cw;
import com.p2082ss.android.ugc.aweme.property.C65438du;
import com.p2082ss.android.ugc.aweme.services.IAVSettingServiceImpl;
import com.p2082ss.android.ugc.aweme.shortvideo.C70636dh;
import com.p2082ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70968bl;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.p3858s.AbstractC72827a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3858s.C72828b;
import com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a;
import com.p2082ss.android.ugc.aweme.shortvideo.subtitle.C73266t;
import com.p2082ss.android.ugc.aweme.sticker.data.C75308c;
import com.p2082ss.android.ugc.aweme.sticker.data.C75309d;
import com.p2082ss.android.ugc.aweme.sticker.data.C75313h;
import com.p2082ss.android.ugc.aweme.sticker.data.EnumC75306a;
import com.p2082ss.android.ugc.aweme.themechange.base.AVDmtPanelRecycleView;
import com.p2082ss.android.ugc.aweme.themechange.base.C77795c;
import com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d;
import com.p2082ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel;
import com.p2082ss.android.ugc.gamora.editor.subtitle.EditSubtitleViewModel;
import com.p2082ss.android.ugc.gamora.editor.toolbar.EditToolbarViewModel;
import com.p2082ss.android.ugc.tools.utils.C84892d;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84917a;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84919c;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.vesdk.AbstractC85541q;
import com.p2082ss.android.vesdk.C85581w;
import com.p2082ss.android.vesdk.VEListener;
import dmt.p4542av.video.C88296t;
import dmt.p4542av.video.C88297u;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.EnumC89331m;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4602b.C89090a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene */
public class EditCaptionScene extends AbstractC22219j implements AbstractC21566a, AbstractC73232k, AbstractC73257o {

    /* renamed from: T */
    public static final C73171c f164270T = new C73171c((byte) 0);

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f164271a = {new C89232y(EditCaptionScene.class, "mModel", "getMModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0)};

    /* renamed from: A */
    public RelativeLayout f164272A;

    /* renamed from: B */
    public FrameLayout f164273B;

    /* renamed from: C */
    public TextView f164274C;

    /* renamed from: D */
    public TextView f164275D;

    /* renamed from: E */
    public LinearLayout f164276E;

    /* renamed from: F */
    public DmtStatusView f164277F;

    /* renamed from: G */
    public LinearLayout f164278G;

    /* renamed from: H */
    public AVDmtPanelRecycleView f164279H;

    /* renamed from: I */
    public View f164280I;

    /* renamed from: J */
    public ImageView f164281J;

    /* renamed from: K */
    public ImageView f164282K;

    /* renamed from: L */
    public TextView f164283L;

    /* renamed from: M */
    public TextView f164284M;

    /* renamed from: N */
    public ImageView f164285N;

    /* renamed from: O */
    public View f164286O;

    /* renamed from: P */
    public View f164287P;

    /* renamed from: Q */
    public TuxTextView f164288Q;

    /* renamed from: R */
    final AbstractC89244h f164289R = C89250i.m154773a((AbstractC89171a) new C73184p(this));

    /* renamed from: S */
    final ValueAnimator f164290S;

    /* renamed from: U */
    private long f164291U;

    /* renamed from: V */
    private C85581w f164292V;

    /* renamed from: W */
    private long f164293W;

    /* renamed from: X */
    private volatile long f164294X;

    /* renamed from: Y */
    private final AbstractC89244h f164295Y = C89250i.m154773a((AbstractC89171a) new C73186r(this));

    /* renamed from: Z */
    private AbstractView$OnClickListenerC81432d f164296Z;

    /* renamed from: aa */
    private View f164297aa;

    /* renamed from: ab */
    private View f164298ab;

    /* renamed from: ac */
    private final AbstractC89244h f164299ac = C89250i.m154774a(EnumC89331m.NONE, new C73163a(this));

    /* renamed from: ad */
    private final AbstractC89248d f164300ad = C21572a.m40504a(getDiContainer(), VideoPublishEditModel.class);

    /* renamed from: ae */
    private EditStickerViewModel f164301ae;

    /* renamed from: af */
    private int f164302af;

    /* renamed from: ag */
    private final AbstractC89244h f164303ag = C89250i.m154773a((AbstractC89171a) new C73187s(this));

    /* renamed from: ah */
    private List<C75313h> f164304ah;

    /* renamed from: ai */
    private String f164305ai;

    /* renamed from: aj */
    private AbstractC72827a f164306aj;

    /* renamed from: ak */
    private long f164307ak;

    /* renamed from: al */
    private AbstractC84919c f164308al;

    /* renamed from: am */
    private final AbstractC84917a f164309am = new C73185q(this);

    /* renamed from: an */
    private final AbstractC89244h f164310an = C89250i.m154773a((AbstractC89171a) new C73176h(this));

    /* renamed from: ao */
    private C75308c f164311ao;

    /* renamed from: ap */
    private final C21582f f164312ap;

    /* renamed from: b */
    public C73218h f164313b;

    /* renamed from: c */
    public final long f164314c = C65413cw.m117132a();

    /* renamed from: d */
    public float f164315d = 0.004f;

    /* renamed from: e */
    RunnableC73175g f164316e;

    /* renamed from: f */
    public boolean f164317f;

    /* renamed from: g */
    public HighLightLayoutManager f164318g;

    /* renamed from: h */
    public C73266t f164319h;

    /* renamed from: i */
    public ActivityC0945e f164320i;

    /* renamed from: j */
    public AbstractC31071f f164321j;

    /* renamed from: k */
    public ViewGroup f164322k;

    /* renamed from: l */
    public AbstractC46263a f164323l;

    /* renamed from: t */
    public C1213t<C88296t> f164324t;

    /* renamed from: u */
    public SafeHandler f164325u;

    /* renamed from: v */
    public SafeHandler f164326v;

    /* renamed from: w */
    ArrayList<C75313h> f164327w = new ArrayList<>();

    /* renamed from: x */
    public ArrayList<C75313h> f164328x;

    /* renamed from: y */
    public boolean f164329y;

    /* renamed from: z */
    String f164330z;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene$z */
    static final class C73197z<T> implements AbstractC0688a {

        /* renamed from: a */
        public static final C73197z f164377a = new C73197z();

        static {
            Covode.recordClassIndex(85914);
        }

        C73197z() {
        }

        @Override // androidx.core.p036g.AbstractC0688a
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo2720a(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(85877);
    }

    /* renamed from: N */
    private final AbstractC72510a m129182N() {
        return (AbstractC72510a) this.f164299ac.getValue();
    }

    /* renamed from: C */
    public final EditSubtitleViewModel mo115692C() {
        return (EditSubtitleViewModel) this.f164310an.getValue();
    }

    /* renamed from: a */
    public final RunnableC73172d mo115703a() {
        return (RunnableC73172d) this.f164295Y.getValue();
    }

    /* renamed from: b */
    public final VideoPublishEditModel mo115708b() {
        return (VideoPublishEditModel) this.f164300ad.mo23374a(this, f164271a[0]);
    }

    /* renamed from: d */
    public final RunnableC73173e mo115710d() {
        return (RunnableC73173e) this.f164303ag.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene$c */
    public static final class C73171c {
        static {
            Covode.recordClassIndex(85888);
        }

        private C73171c() {
        }

        public /* synthetic */ C73171c(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene$i */
    public static final class C73177i implements AbstractC46263a {

        /* renamed from: a */
        final /* synthetic */ EditCaptionScene f164353a;

        /* renamed from: b */
        private boolean f164354b;

        static {
            Covode.recordClassIndex(85894);
        }

        @Override // com.p2082ss.android.ugc.aweme.effect.AbstractC46263a
        /* renamed from: d */
        public final long mo78737d() {
            return 0;
        }

        @Override // com.p2082ss.android.ugc.aweme.effect.AbstractC46263a
        /* renamed from: c */
        public final boolean mo78736c() {
            return this.f164354b;
        }

        @Override // com.p2082ss.android.ugc.aweme.effect.AbstractC46263a
        /* renamed from: a */
        public final long mo78732a() {
            long j;
            AbstractC31071f fVar = this.f164353a.f164321j;
            if (fVar != null) {
                j = (long) fVar.mo56370k();
            } else {
                j = 0;
            }
            return mo78733a(j);
        }

        @Override // com.p2082ss.android.ugc.aweme.effect.AbstractC46263a
        /* renamed from: b */
        public final boolean mo78735b() {
            Integer num;
            long a = mo78732a();
            if (!this.f164354b) {
                AbstractC31071f fVar = this.f164353a.f164321j;
                if (fVar != null) {
                    num = Integer.valueOf(fVar.mo56368j());
                }
                return false;
            }
            num = 0;
            if (num == null || a != ((long) num.intValue())) {
                return false;
            }
            return true;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C73177i(EditCaptionScene editCaptionScene) {
            this.f164353a = editCaptionScene;
        }

        @Override // com.p2082ss.android.ugc.aweme.effect.AbstractC46263a
        /* renamed from: a */
        public final void mo78734a(boolean z) {
            this.f164354b = z;
            AbstractC31071f fVar = this.f164353a.f164321j;
            if (fVar != null) {
                fVar.mo56338c(z);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.effect.AbstractC46263a
        /* renamed from: a */
        public final long mo78733a(long j) {
            if (!this.f164354b) {
                return j;
            }
            AbstractC31071f fVar = this.f164353a.f164321j;
            if (fVar != null) {
                return ((long) fVar.mo56368j()) - j;
            }
            return 0;
        }
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public C21582f getDiContainer() {
        return this.f164312ap;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene$r */
    static final class C73186r extends AbstractC89220m implements AbstractC89171a<RunnableC73172d> {

        /* renamed from: a */
        final /* synthetic */ EditCaptionScene f164365a;

        static {
            Covode.recordClassIndex(85903);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C73186r(EditCaptionScene editCaptionScene) {
            super(0);
            this.f164365a = editCaptionScene;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ RunnableC73172d invoke() {
            return new RunnableC73172d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene$s */
    static final class C73187s extends AbstractC89220m implements AbstractC89171a<RunnableC73173e> {

        /* renamed from: a */
        final /* synthetic */ EditCaptionScene f164366a;

        static {
            Covode.recordClassIndex(85904);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C73187s(EditCaptionScene editCaptionScene) {
            super(0);
            this.f164366a = editCaptionScene;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ RunnableC73173e invoke() {
            return new RunnableC73173e();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene$a */
    public static final class C73163a extends AbstractC89220m implements AbstractC89171a<AbstractC72510a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f164333a;

        static {
            Covode.recordClassIndex(85880);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C73163a(AbstractC21566a aVar) {
            super(0);
            this.f164333a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.shortvideo.preview.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f164333a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.preview.a> r1 = com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene.C73163a.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: D */
    public final AVDmtPanelRecycleView mo115693D() {
        AVDmtPanelRecycleView aVDmtPanelRecycleView = this.f164279H;
        if (aVDmtPanelRecycleView == null) {
            C89219l.m154710a("mRecyclerView");
        }
        return aVDmtPanelRecycleView;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene$t */
    public static final class C73188t implements AbstractC85541q {

        /* renamed from: a */
        final /* synthetic */ EditCaptionScene f164367a;

        /* renamed from: b */
        final /* synthetic */ int f164368b;

        static {
            Covode.recordClassIndex(85905);
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene$t$a */
        static final class C73189a implements VEListener.AbstractC85250s {

            /* renamed from: a */
            final /* synthetic */ C73188t f164369a;

            static {
                Covode.recordClassIndex(85906);
            }

            C73189a(C73188t tVar) {
                this.f164369a = tVar;
            }

            @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85250s
            /* renamed from: a */
            public final void mo87822a() {
                if (C65339ai.m117025a() && this.f164369a.f164367a.f164329y) {
                    this.f164369a.f164367a.mo115698I();
                }
            }
        }

        C73188t(EditCaptionScene editCaptionScene, int i) {
            this.f164367a = editCaptionScene;
            this.f164368b = i;
        }

        @Override // com.p2082ss.android.vesdk.AbstractC85541q
        public final void onCallback(int i, int i2, float f, String str) {
            if (i == 4116) {
                C40970e.m82485a("receive prepare done event in backToPlayLayout");
                AbstractC31071f fVar = this.f164367a.f164321j;
                if (fVar != null) {
                    fVar.mo56266a(this.f164368b, C85581w.EnumC85607f.EDITOR_SEEK_FLAG_LastSeek, new C73189a(this));
                }
                AbstractC31071f fVar2 = this.f164367a.f164321j;
                if (fVar2 != null) {
                    fVar2.mo56392w();
                }
                AbstractC31071f fVar3 = this.f164367a.f164321j;
                if (fVar3 != null) {
                    fVar3.mo56349d(this);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene$h */
    static final class C73176h extends AbstractC89220m implements AbstractC89171a<EditSubtitleViewModel> {

        /* renamed from: a */
        final /* synthetic */ EditCaptionScene f164352a;

        static {
            Covode.recordClassIndex(85893);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C73176h(EditCaptionScene editCaptionScene) {
            super(0);
            this.f164352a = editCaptionScene;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ EditSubtitleViewModel invoke() {
            Activity activity = this.f164352a.f52549m;
            Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            JediViewModel a = C20531t.m38716a((ActivityC0945e) activity).mo33800a(EditSubtitleViewModel.class);
            C89219l.m154716b(a, "");
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene$p */
    static final class C73184p extends AbstractC89220m implements AbstractC89171a<EditToolbarViewModel> {

        /* renamed from: a */
        final /* synthetic */ EditCaptionScene f164363a;

        static {
            Covode.recordClassIndex(85901);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C73184p(EditCaptionScene editCaptionScene) {
            super(0);
            this.f164363a = editCaptionScene;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ EditToolbarViewModel invoke() {
            Activity activity = this.f164363a.f52549m;
            Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            return C20531t.m38716a((ActivityC0945e) activity).mo33800a(EditToolbarViewModel.class);
        }
    }

    /* renamed from: O */
    private final int m129183O() {
        ActivityC0945e eVar = this.f164320i;
        if (eVar == null) {
            C89219l.m154710a("mActivity");
        }
        return (int) C13628n.m24520b(eVar, 52.0f);
    }

    /* renamed from: P */
    private final int m129184P() {
        ActivityC0945e eVar = this.f164320i;
        if (eVar == null) {
            C89219l.m154710a("mActivity");
        }
        return (int) C13628n.m24520b(eVar, 282.0f);
    }

    /* renamed from: I */
    public final void mo115698I() {
        C1213t<C88296t> tVar = this.f164324t;
        if (tVar == null) {
            C89219l.m154710a("mPreviewControlOpLiveData");
        }
        tVar.setValue(C88296t.m153435a());
        View view = this.f164286O;
        if (view == null) {
            C89219l.m154710a("mIvPlay");
        }
        view.setVisibility(8);
    }

    /* renamed from: J */
    public final void mo115699J() {
        C1213t<C88296t> tVar = this.f164324t;
        if (tVar == null) {
            C89219l.m154710a("mPreviewControlOpLiveData");
        }
        tVar.setValue(C88296t.m153437b());
        View view = this.f164286O;
        if (view == null) {
            C89219l.m154710a("mIvPlay");
        }
        view.setVisibility(0);
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: o */
    public final void mo36481o() {
        super.mo36481o();
        AbstractC73198a aVar = mo115692C().f185622c;
        if (aVar != null) {
            aVar.mo115743g();
            aVar.mo115744h();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene$g */
    public final class RunnableC73175g implements Runnable {

        /* renamed from: b */
        private int f164350b;

        /* renamed from: c */
        private final String[] f164351c;

        static {
            Covode.recordClassIndex(85892);
        }

        public final void run() {
            TextView textView = EditCaptionScene.this.f164284M;
            if (textView == null) {
                C89219l.m154710a("mLoadingHint");
            }
            String[] strArr = this.f164351c;
            int i = this.f164350b;
            this.f164350b = i + 1;
            textView.setText(strArr[i]);
            this.f164350b %= 3;
            EditCaptionScene.m129187a(EditCaptionScene.this).postDelayed(this, 5000);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public RunnableC73175g() {
            AbstractC58069b currentI18nItem = IAVSettingServiceImpl.createIAVSettingServicebyMonsterPlugin(false).getCurrentI18nItem(EditCaptionScene.this.mo36483q());
            C89219l.m154716b(currentI18nItem, "");
            this.f164351c = new String[]{EditCaptionScene.this.mo36472a(R.string.xf, currentI18nItem.mo90021e()), EditCaptionScene.this.mo36476c_(R.string.xg), EditCaptionScene.this.mo36476c_(R.string.xh)};
        }
    }

    /* renamed from: Q */
    private final int m129185Q() {
        ActivityC0945e eVar = this.f164320i;
        if (eVar == null) {
            C89219l.m154710a("mActivity");
        }
        int e = (C70636dh.m124836e(eVar) - m129183O()) - m129184P();
        ActivityC0945e eVar2 = this.f164320i;
        if (eVar2 == null) {
            C89219l.m154710a("mActivity");
        }
        int c = e - C70636dh.m124833c(eVar2);
        ActivityC0945e eVar3 = this.f164320i;
        if (eVar3 == null) {
            C89219l.m154710a("mActivity");
        }
        return c - C70636dh.m124835d(eVar3);
    }

    /* renamed from: R */
    private final void m129186R() {
        SafeHandler safeHandler = this.f164325u;
        if (safeHandler == null) {
            C89219l.m154710a("mSafeHandler");
        }
        safeHandler.removeCallbacksAndMessages(null);
        this.f164290S.cancel();
        this.f164316e = null;
        SafeHandler safeHandler2 = this.f164326v;
        if (safeHandler2 == null) {
            C89219l.m154710a("mTipsHandler");
        }
        safeHandler2.removeCallbacksAndMessages(null);
        DmtStatusView dmtStatusView = this.f164277F;
        if (dmtStatusView == null) {
            C89219l.m154710a("mLoadingStatusView");
        }
        dmtStatusView.mo27382d();
        LinearLayout linearLayout = this.f164276E;
        if (linearLayout == null) {
            C89219l.m154710a("mLoadingArea");
        }
        linearLayout.setVisibility(8);
    }

    /* renamed from: G */
    public final boolean mo115696G() {
        String text;
        C73266t tVar = this.f164319h;
        if (tVar == null) {
            C89219l.m154710a("mSubtitleAdapter");
        }
        if (tVar == null) {
            return false;
        }
        C73266t tVar2 = this.f164319h;
        if (tVar2 == null) {
            C89219l.m154710a("mSubtitleAdapter");
        }
        int i = tVar2.f164522a;
        int i2 = -1;
        if (i == -1) {
            return false;
        }
        C73266t tVar3 = this.f164319h;
        if (tVar3 == null) {
            C89219l.m154710a("mSubtitleAdapter");
        }
        C75313h hVar = (C75313h) C89070n.m154561b((List) tVar3.f164528g, i);
        if (!(hVar == null || (text = hVar.getText()) == null)) {
            i2 = text.length();
        }
        mo115704a(i, i2, "click_adjust_icon");
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene$e */
    public final class RunnableC73173e implements Runnable {
        static {
            Covode.recordClassIndex(85890);
        }

        public final void run() {
            EditCaptionScene editCaptionScene;
            int K;
            if (EditCaptionScene.this.mo115693D().getAdapter() != null && (K = (editCaptionScene = EditCaptionScene.this).mo115700K()) >= 0) {
                C73266t tVar = editCaptionScene.f164319h;
                if (tVar == null) {
                    C89219l.m154710a("mSubtitleAdapter");
                }
                if (tVar.f164522a != K) {
                    if (K == 0) {
                        editCaptionScene.f164315d = 0.004f;
                    } else {
                        editCaptionScene.f164315d = 400.0f;
                    }
                    C73266t tVar2 = editCaptionScene.f164319h;
                    if (tVar2 == null) {
                        C89219l.m154710a("mSubtitleAdapter");
                    }
                    if (!TextUtils.isEmpty(tVar2.f164528g.get(K).getText()) || K == 0) {
                        HighLightLayoutManager highLightLayoutManager = editCaptionScene.f164318g;
                        if (highLightLayoutManager == null) {
                            C89219l.m154710a("mHighLightLayoutManager");
                        }
                        AVDmtPanelRecycleView aVDmtPanelRecycleView = editCaptionScene.f164279H;
                        if (aVDmtPanelRecycleView == null) {
                            C89219l.m154710a("mRecyclerView");
                        }
                        highLightLayoutManager.mo4354a(aVDmtPanelRecycleView, new RecyclerView.C1378s(), K);
                        C73266t tVar3 = editCaptionScene.f164319h;
                        if (tVar3 == null) {
                            C89219l.m154710a("mSubtitleAdapter");
                        }
                        tVar3.mo115778a(K);
                    }
                }
            }
            EditCaptionScene.m129188b(EditCaptionScene.this).post(this);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public RunnableC73173e() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public final void mo115694E() {
        if (!(!this.f164327w.equals(this.f164304ah))) {
            mo115697H();
        } else if (C65438du.m117156a()) {
            ActivityC0945e eVar = this.f164320i;
            if (eVar == null) {
                C89219l.m154710a("mActivity");
            }
            C23028c.m43435a((C23023b) new C23023b(eVar).mo37483b(R.string.xj), new C73191v(this)).mo37405a().mo37396b().show();
        } else {
            ActivityC0945e eVar2 = this.f164320i;
            if (eVar2 == null) {
                C89219l.m154710a("mActivity");
            }
            new C17197a.C17200a(eVar2).mo27194b(R.string.xj).mo27195b(R.string.a8y, (DialogInterface.OnClickListener) null, false).mo27190a(R.string.wz, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC73193w(this), false).mo27193a().mo27184b().show();
        }
    }

    /* renamed from: F */
    public final void mo115695F() {
        if (C65438du.m117156a()) {
            ActivityC0945e eVar = this.f164320i;
            if (eVar == null) {
                C89219l.m154710a("mActivity");
            }
            C23028c.m43435a((C23023b) new C23023b(eVar).mo37479a(R.string.f5c).mo37483b(R.string.f5a), new C73194x(this)).mo37405a().mo37396b().show();
            return;
        }
        ActivityC0945e eVar2 = this.f164320i;
        if (eVar2 == null) {
            C89219l.m154710a("mActivity");
        }
        new C17197a.C17200a(eVar2).mo27194b(R.string.xa).mo27195b(R.string.yc, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC73196y(this), false).mo27190a(R.string.xc, (DialogInterface.OnClickListener) null, false).mo27193a().mo27184b().show();
    }

    /* renamed from: H */
    public final void mo115697H() {
        AbstractC73198a aVar = mo115692C().f185622c;
        if (aVar != null) {
            aVar.mo115743g();
        }
        SafeHandler safeHandler = this.f164325u;
        if (safeHandler == null) {
            C89219l.m154710a("mSafeHandler");
        }
        safeHandler.removeCallbacksAndMessages(null);
        this.f164290S.cancel();
        this.f164316e = null;
        SafeHandler safeHandler2 = this.f164326v;
        if (safeHandler2 == null) {
            C89219l.m154710a("mTipsHandler");
        }
        safeHandler2.removeCallbacksAndMessages(null);
        mo115692C().mo128165a(false);
        if (mo115708b().captionStruct == null) {
            mo115692C().mo128164a((List<C75313h>) null);
        } else {
            mo115692C().mo128164a(mo115708b().captionStruct.getUtterances());
        }
        C85581w wVar = this.f164292V;
        if (wVar != null) {
            wVar.mo131703j();
        }
        this.f164292V = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public final int mo115700K() {
        long j = this.f164307ak;
        AbstractC46263a aVar = this.f164323l;
        if (aVar == null) {
            C89219l.m154710a("mCurrentPositionSource");
        }
        if (j == aVar.mo78732a()) {
            return -1;
        }
        AbstractC46263a aVar2 = this.f164323l;
        if (aVar2 == null) {
            C89219l.m154710a("mCurrentPositionSource");
        }
        this.f164307ak = aVar2.mo78732a();
        AVDmtPanelRecycleView aVDmtPanelRecycleView = this.f164279H;
        if (aVDmtPanelRecycleView == null) {
            C89219l.m154710a("mRecyclerView");
        }
        if (aVDmtPanelRecycleView.getAdapter() == null) {
            return -1;
        }
        C73266t tVar = this.f164319h;
        if (tVar == null) {
            C89219l.m154710a("mSubtitleAdapter");
        }
        ArrayList<C75313h> arrayList = tVar.f164528g;
        Iterator<C75313h> it = arrayList.iterator();
        while (it.hasNext()) {
            C75313h next = it.next();
            if (((int) next.getStartTime()) != 0 || ((int) next.getEndTime()) != this.f164302af) {
                long startTime = next.getStartTime();
                long j2 = this.f164307ak;
                if (startTime <= j2 && j2 < next.getEndTime()) {
                    return arrayList.indexOf(next);
                }
            }
        }
        return arrayList.size() - 1;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.subtitle.AbstractC73232k
    /* renamed from: L */
    public final void mo115701L() {
        m129186R();
        FrameLayout frameLayout = this.f164273B;
        if (frameLayout == null) {
            C89219l.m154710a("mContentLayout");
        }
        LinearLayout linearLayout = this.f164276E;
        if (linearLayout == null) {
            C89219l.m154710a("mLoadingArea");
        }
        View view = this.f164297aa;
        if (view == null) {
            C89219l.m154710a("mRetryView");
        }
        C73289v vVar = new C73289v(frameLayout, linearLayout, view);
        View view2 = this.f164297aa;
        if (view2 == null) {
            C89219l.m154710a("mRetryView");
        }
        ((TextView) view2.findViewById(R.id.eb5)).setOnClickListener(new View$OnClickListenerC73167ad(this, vVar));
        View view3 = this.f164297aa;
        if (view3 == null) {
            C89219l.m154710a("mRetryView");
        }
        view3.findViewById(R.id.yp).setOnClickListener(new View$OnClickListenerC73168ae(this, vVar));
        vVar.mo115798c(new C40903b());
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.subtitle.AbstractC73232k
    /* renamed from: M */
    public final void mo115702M() {
        m129186R();
        SafeHandler safeHandler = this.f164325u;
        if (safeHandler == null) {
            C89219l.m154710a("mSafeHandler");
        }
        safeHandler.removeCallbacksAndMessages(null);
        FrameLayout frameLayout = this.f164273B;
        if (frameLayout == null) {
            C89219l.m154710a("mContentLayout");
        }
        LinearLayout linearLayout = this.f164276E;
        if (linearLayout == null) {
            C89219l.m154710a("mLoadingArea");
        }
        View view = this.f164298ab;
        if (view == null) {
            C89219l.m154710a("mExitView");
        }
        C73289v vVar = new C73289v(frameLayout, linearLayout, view);
        View view2 = this.f164298ab;
        if (view2 == null) {
            C89219l.m154710a("mExitView");
        }
        view2.findViewById(R.id.a0w).setOnClickListener(new View$OnClickListenerC73165ab(this, vVar));
        vVar.mo115798c(new C40903b());
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: n_ */
    public final void mo22713n_() {
        super.mo22713n_();
        SafeHandler safeHandler = this.f164325u;
        if (safeHandler == null) {
            C89219l.m154710a("mSafeHandler");
        }
        safeHandler.removeCallbacksAndMessages(null);
        this.f164290S.cancel();
        this.f164316e = null;
        SafeHandler safeHandler2 = this.f164326v;
        if (safeHandler2 == null) {
            C89219l.m154710a("mTipsHandler");
        }
        safeHandler2.removeCallbacksAndMessages(null);
        if (this.f164306aj != null) {
            ActivityC0945e eVar = this.f164320i;
            if (eVar == null) {
                C89219l.m154710a("mActivity");
            }
            C72828b.m128597b(eVar);
            this.f164306aj = null;
        }
        View view = this.f164286O;
        if (view == null) {
            C89219l.m154710a("mIvPlay");
        }
        view.setVisibility(8);
        AVDmtPanelRecycleView aVDmtPanelRecycleView = this.f164279H;
        if (aVDmtPanelRecycleView == null) {
            C89219l.m154710a("mRecyclerView");
        }
        aVDmtPanelRecycleView.mo4479i();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene$d */
    public final class RunnableC73172d implements Runnable {
        static {
            Covode.recordClassIndex(85889);
        }

        public final void run() {
            int l;
            int i;
            if (!(!EditCaptionScene.this.mo115693D().isShown() || EditCaptionScene.this.mo115693D().getAdapter() == null || (l = EditCaptionScene.m129190c(EditCaptionScene.this).mo4372l()) == -1)) {
                if (l == 0 || l == 1) {
                    View c = EditCaptionScene.m129190c(EditCaptionScene.this).mo4358c(l);
                    if (c != null) {
                        i = c.getBottom();
                    } else {
                        i = 0;
                    }
                    if (i < ((int) C13628n.m24520b(EditCaptionScene.m129191d(EditCaptionScene.this), 52.0f))) {
                        l = Math.min(l + 2, EditCaptionScene.m129190c(EditCaptionScene.this).mo4685A() - 1);
                    }
                } else {
                    l = Math.min(l + 2, EditCaptionScene.m129190c(EditCaptionScene.this).mo4685A() - 1);
                }
                if (!TextUtils.isEmpty(EditCaptionScene.m129192e(EditCaptionScene.this).f164528g.get(l).getText())) {
                    EditCaptionScene.m129192e(EditCaptionScene.this).mo115778a(l);
                }
            }
            EditCaptionScene.m129188b(EditCaptionScene.this).post(this);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public RunnableC73172d() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene$HighLightLayoutManager */
    public final class HighLightLayoutManager extends LinearLayoutManager {
        static {
            Covode.recordClassIndex(85878);
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene$HighLightLayoutManager$a */
        public final class C73162a extends C1481r {
            static {
                Covode.recordClassIndex(85879);
            }

            @Override // androidx.recyclerview.widget.C1481r
            /* renamed from: c */
            public final int mo5016c() {
                return -1;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1375r
            /* renamed from: c */
            public final PointF mo4778c(int i) {
                return HighLightLayoutManager.this.mo4360d(i);
            }

            /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
                if (r0 == null) goto L_0x0010;
             */
            @Override // androidx.recyclerview.widget.C1481r
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final float mo4862a(android.util.DisplayMetrics r3) {
                /*
                    r2 = this;
                    com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene$HighLightLayoutManager r0 = com.p2082ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene.HighLightLayoutManager.this
                    com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene r0 = com.p2082ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene.this
                    float r1 = r0.f164315d
                    if (r3 == 0) goto L_0x001a
                    int r0 = r3.densityDpi
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                    if (r0 != 0) goto L_0x0013
                L_0x0010:
                    p4600h.p4611f.p4613b.C89219l.m154715b()
                L_0x0013:
                    int r0 = r0.intValue()
                    float r0 = (float) r0
                    float r1 = r1 / r0
                    return r1
                L_0x001a:
                    r0 = 0
                    goto L_0x0010
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene.HighLightLayoutManager.C73162a.mo4862a(android.util.DisplayMetrics):float");
            }

            public C73162a(Context context) {
                super(context);
            }

            @Override // androidx.recyclerview.widget.C1481r
            /* renamed from: a */
            public final int mo5011a(int i, int i2, int i3, int i4, int i5) {
                return (i3 - i) + ((int) C13628n.m24520b(EditCaptionScene.m129191d(EditCaptionScene.this), 52.0f));
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public HighLightLayoutManager() {
            super(1, false);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1362i
        /* renamed from: a */
        public final void mo4354a(RecyclerView recyclerView, RecyclerView.C1378s sVar, int i) {
            Context context;
            if (recyclerView != null) {
                context = recyclerView.getContext();
            } else {
                context = null;
            }
            C73162a aVar = new C73162a(context);
            aVar.f4515g = i;
            mo4695a(aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene$j */
    static final class C73178j<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ EditCaptionScene f164355a;

        static {
            Covode.recordClassIndex(85895);
        }

        C73178j(EditCaptionScene editCaptionScene) {
            this.f164355a = editCaptionScene;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
            this.f164355a.f164328x = null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene$k */
    static final class C73179k<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ EditCaptionScene f164356a;

        static {
            Covode.recordClassIndex(85896);
        }

        C73179k(EditCaptionScene editCaptionScene) {
            this.f164356a = editCaptionScene;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            this.f164356a.mo115696G();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene$m */
    public static final class C73181m extends AbstractView$OnClickListenerC81432d {

        /* renamed from: a */
        final /* synthetic */ EditCaptionScene f164358a;

        static {
            Covode.recordClassIndex(85898);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C73181m(EditCaptionScene editCaptionScene) {
            this.f164358a = editCaptionScene;
        }

        @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d
        /* renamed from: a */
        public final void mo77200a(View view) {
            String str;
            String str2 = "";
            C89219l.m154721d(view, str2);
            EditCaptionScene editCaptionScene = this.f164358a;
            TextView textView = editCaptionScene.f164274C;
            if (textView == null) {
                C89219l.m154710a("mCancelView");
            }
            if (C89219l.m154714a(view, textView)) {
                editCaptionScene.mo115694E();
                return;
            }
            TextView textView2 = editCaptionScene.f164275D;
            if (textView2 == null) {
                C89219l.m154710a("mSaveView");
            }
            if (C89219l.m154714a(view, textView2)) {
                SafeHandler safeHandler = editCaptionScene.f164325u;
                if (safeHandler == null) {
                    C89219l.m154710a("mSafeHandler");
                }
                safeHandler.removeCallbacksAndMessages(null);
                editCaptionScene.f164290S.cancel();
                editCaptionScene.f164316e = null;
                SafeHandler safeHandler2 = editCaptionScene.f164326v;
                if (safeHandler2 == null) {
                    C89219l.m154710a("mTipsHandler");
                }
                safeHandler2.removeCallbacksAndMessages(null);
                editCaptionScene.mo115692C().mo128165a(true);
                VideoPublishEditModel b = editCaptionScene.mo115708b();
                C89219l.m154721d(b, str2);
                C39162r.m79460a("save_subtitle", C70968bl.m125268d(b).f188764a);
                if (C84892d.m145850a(editCaptionScene.mo115692C().f185620a.f7727a.getValue())) {
                    editCaptionScene.mo115708b().captionStruct = null;
                    editCaptionScene.mo115692C().mo128164a((List<C75313h>) null);
                    return;
                }
                ArrayList arrayList = new ArrayList();
                T value = editCaptionScene.mo115692C().f185620a.f7727a.getValue();
                if (value == null) {
                    value = (T) C89086z.INSTANCE;
                }
                arrayList.addAll(value);
                if (editCaptionScene.mo115708b().captionStruct == null) {
                    editCaptionScene.mo115708b().captionStruct = new C75309d(editCaptionScene.f164330z, arrayList, EnumC75306a.LEFT_BOTTOM.getValue(), null, null, 0, 48, null);
                    C75309d dVar = editCaptionScene.mo115708b().captionStruct;
                    if (dVar == null) {
                        C89219l.m154715b();
                    }
                    AbstractC73198a aVar = editCaptionScene.mo115692C().f185622c;
                    if (!(aVar == null || (str = aVar.f164382d) == null)) {
                        str2 = str;
                    }
                    dVar.setTaskId(str2);
                } else {
                    C75309d dVar2 = editCaptionScene.mo115708b().captionStruct;
                    dVar2.setAudioUri(editCaptionScene.f164330z);
                    dVar2.setUtterances(arrayList);
                }
                if (C65350at.m117036a() && (!arrayList.isEmpty())) {
                    ((EditToolbarViewModel) editCaptionScene.f164289R.getValue()).mo128252c(true);
                    return;
                }
                return;
            }
            ImageView imageView = editCaptionScene.f164282K;
            if (imageView == null) {
                C89219l.m154710a("mIvDelete");
            }
            if (C89219l.m154714a(view, imageView)) {
                ActivityC0945e eVar = editCaptionScene.f164320i;
                if (eVar == null) {
                    C89219l.m154710a("mActivity");
                }
                new C17197a.C17200a(eVar).mo27194b(R.string.wy).mo27195b(R.string.a8y, (DialogInterface.OnClickListener) null, false).mo27190a(R.string.as0, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC73190u(editCaptionScene), false).mo27193a().mo27184b().show();
                return;
            }
            ImageView imageView2 = editCaptionScene.f164285N;
            if (imageView2 == null) {
                C89219l.m154710a("mIvEdit");
            }
            if (C89219l.m154714a(view, imageView2)) {
                editCaptionScene.mo115696G();
                return;
            }
            View view2 = editCaptionScene.f164287P;
            if (view2 == null) {
                C89219l.m154710a("mFlPlay");
            }
            if (C89219l.m154714a(view, view2)) {
                View view3 = editCaptionScene.f164286O;
                if (view3 == null) {
                    C89219l.m154710a("mIvPlay");
                }
                if (view3.getVisibility() == 0) {
                    editCaptionScene.mo115698I();
                } else {
                    editCaptionScene.mo115699J();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene$n */
    public static final class C73182n implements C73266t.AbstractC73267a {

        /* renamed from: a */
        final /* synthetic */ EditCaptionScene f164359a;

        static {
            Covode.recordClassIndex(85899);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C73182n(EditCaptionScene editCaptionScene) {
            this.f164359a = editCaptionScene;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.subtitle.C73266t.AbstractC73267a
        /* renamed from: a */
        public final void mo115722a(int i, int i2) {
            this.f164359a.mo115704a(i, i2, "click_subtitle");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene$o */
    public static final class C73183o extends RecyclerView.AbstractC1371n {

        /* renamed from: a */
        public boolean f164360a;

        /* renamed from: b */
        public boolean f164361b;

        /* renamed from: c */
        final /* synthetic */ EditCaptionScene f164362c;

        static {
            Covode.recordClassIndex(85900);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C73183o(EditCaptionScene editCaptionScene) {
            this.f164362c = editCaptionScene;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4753a(RecyclerView recyclerView, int i) {
            C89219l.m154721d(recyclerView, "");
            if (i != 0) {
                if (i == 1) {
                    if (this.f164362c.f164317f) {
                        this.f164360a = true;
                    }
                    this.f164362c.mo115699J();
                    this.f164361b = true;
                    EditCaptionScene.m129188b(this.f164362c).post(this.f164362c.mo115703a());
                }
            } else if (this.f164361b) {
                this.f164361b = false;
                EditCaptionScene editCaptionScene = this.f164362c;
                SafeHandler safeHandler = editCaptionScene.f164325u;
                if (safeHandler == null) {
                    C89219l.m154710a("mSafeHandler");
                }
                safeHandler.removeCallbacksAndMessages(editCaptionScene.mo115703a());
                int i2 = EditCaptionScene.m129192e(this.f164362c).f164522a;
                if (i2 != -1) {
                    EditCaptionScene.m129190c(this.f164362c).mo4354a(this.f164362c.mo115693D(), new RecyclerView.C1378s(), i2);
                    C1213t<C88296t> tVar = this.f164362c.f164324t;
                    if (tVar == null) {
                        C89219l.m154710a("mPreviewControlOpLiveData");
                    }
                    AbstractC46263a aVar = this.f164362c.f164323l;
                    if (aVar == null) {
                        C89219l.m154710a("mCurrentPositionSource");
                    }
                    tVar.setValue(C88296t.m153438b(aVar.mo78733a(EditCaptionScene.m129192e(this.f164362c).f164528g.get(i2).getStartTime() + 30)));
                }
                if (this.f164360a) {
                    this.f164360a = false;
                    this.f164362c.mo115698I();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene$ac */
    public static final class View$OnClickListenerC73166ac implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EditCaptionScene f164336a;

        static {
            Covode.recordClassIndex(85883);
        }

        View$OnClickListenerC73166ac(EditCaptionScene editCaptionScene) {
            this.f164336a = editCaptionScene;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f164336a.mo115695F();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ SafeHandler m129187a(EditCaptionScene editCaptionScene) {
        SafeHandler safeHandler = editCaptionScene.f164326v;
        if (safeHandler == null) {
            C89219l.m154710a("mTipsHandler");
        }
        return safeHandler;
    }

    /* renamed from: b */
    public static final /* synthetic */ SafeHandler m129188b(EditCaptionScene editCaptionScene) {
        SafeHandler safeHandler = editCaptionScene.f164325u;
        if (safeHandler == null) {
            C89219l.m154710a("mSafeHandler");
        }
        return safeHandler;
    }

    /* renamed from: c */
    public static final /* synthetic */ HighLightLayoutManager m129190c(EditCaptionScene editCaptionScene) {
        HighLightLayoutManager highLightLayoutManager = editCaptionScene.f164318g;
        if (highLightLayoutManager == null) {
            C89219l.m154710a("mHighLightLayoutManager");
        }
        return highLightLayoutManager;
    }

    /* renamed from: d */
    public static final /* synthetic */ ActivityC0945e m129191d(EditCaptionScene editCaptionScene) {
        ActivityC0945e eVar = editCaptionScene.f164320i;
        if (eVar == null) {
            C89219l.m154710a("mActivity");
        }
        return eVar;
    }

    /* renamed from: e */
    public static final /* synthetic */ C73266t m129192e(EditCaptionScene editCaptionScene) {
        C73266t tVar = editCaptionScene.f164319h;
        if (tVar == null) {
            C89219l.m154710a("mSubtitleAdapter");
        }
        return tVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene$ab */
    static final class View$OnClickListenerC73165ab implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EditCaptionScene f164334a;

        /* renamed from: b */
        final /* synthetic */ C73289v f164335b;

        static {
            Covode.recordClassIndex(85882);
        }

        View$OnClickListenerC73165ab(EditCaptionScene editCaptionScene, C73289v vVar) {
            this.f164334a = editCaptionScene;
            this.f164335b = vVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f164335b.mo70112b(new C40903b());
            this.f164334a.mo115697H();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene$ad */
    static final class View$OnClickListenerC73167ad implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EditCaptionScene f164337a;

        /* renamed from: b */
        final /* synthetic */ C73289v f164338b;

        static {
            Covode.recordClassIndex(85884);
        }

        View$OnClickListenerC73167ad(EditCaptionScene editCaptionScene, C73289v vVar) {
            this.f164337a = editCaptionScene;
            this.f164338b = vVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f164338b.mo70112b(new C40903b());
            this.f164337a.mo115697H();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene$v */
    public static final class C73191v extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ EditCaptionScene f164371a;

        static {
            Covode.recordClassIndex(85908);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C73191v(EditCaptionScene editCaptionScene) {
            super(1);
            this.f164371a = editCaptionScene;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23025b bVar) {
            C23025b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            bVar2.mo37420c(R.string.wz, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene.C73191v.C731921 */

                /* renamed from: a */
                final /* synthetic */ C73191v f164372a;

                static {
                    Covode.recordClassIndex(85909);
                }

                {
                    this.f164372a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C89219l.m154721d(aVar, "");
                    this.f164372a.f164371a.mo115697H();
                    return C89391z.f203057a;
                }
            });
            bVar2.mo37418b(R.string.b7f, (AbstractC89172b<? super C23024a, C89391z>) null);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene$x */
    public static final class C73194x extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ EditCaptionScene f164374a;

        static {
            Covode.recordClassIndex(85911);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C73194x(EditCaptionScene editCaptionScene) {
            super(1);
            this.f164374a = editCaptionScene;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23025b bVar) {
            C23025b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            bVar2.mo37420c(R.string.f5b, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene.C73194x.C731951 */

                /* renamed from: a */
                final /* synthetic */ C73194x f164375a;

                static {
                    Covode.recordClassIndex(85912);
                }

                {
                    this.f164375a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C89219l.m154721d(aVar, "");
                    this.f164375a.f164374a.mo115697H();
                    return C89391z.f203057a;
                }
            });
            bVar2.mo37418b(R.string.f5_, (AbstractC89172b<? super C23024a, C89391z>) null);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene$ae */
    static final class View$OnClickListenerC73168ae implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EditCaptionScene f164339a;

        /* renamed from: b */
        final /* synthetic */ C73289v f164340b;

        static {
            Covode.recordClassIndex(85885);
        }

        View$OnClickListenerC73168ae(EditCaptionScene editCaptionScene, C73289v vVar) {
            this.f164339a = editCaptionScene;
            this.f164340b = vVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f164340b.mo70112b(new C40903b());
            this.f164339a.mo115706a(true);
            AbstractC73198a aVar = this.f164339a.mo115692C().f185622c;
            if (aVar != null) {
                aVar.mo115742f();
            }
            C39162r.m79460a("retry_auto_subtitle", C70968bl.m125268d(this.f164339a.mo115708b()).f188764a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene$l */
    static final class C73180l<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ EditCaptionScene f164357a;

        static {
            Covode.recordClassIndex(85897);
        }

        C73180l(EditCaptionScene editCaptionScene) {
            this.f164357a = editCaptionScene;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            C88296t tVar = (C88296t) obj;
            if (tVar == null) {
                return;
            }
            if (tVar.f200366a == 0) {
                this.f164357a.f164317f = true;
                if (this.f164357a.mo115693D().getAdapter() != null) {
                    EditCaptionScene.m129188b(this.f164357a).post(this.f164357a.mo115710d());
                    return;
                }
                return;
            }
            this.f164357a.f164317f = false;
            EditCaptionScene.m129188b(this.f164357a).removeCallbacks(this.f164357a.mo115710d());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene$b */
    static final class C73169b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ ValueAnimator f164341a;

        /* renamed from: b */
        final /* synthetic */ EditCaptionScene f164342b;

        static {
            Covode.recordClassIndex(85886);
        }

        C73169b(ValueAnimator valueAnimator, EditCaptionScene editCaptionScene) {
            this.f164341a = valueAnimator;
            this.f164342b = editCaptionScene;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            final C89233z.C89236c cVar = new C89233z.C89236c();
            C89219l.m154716b(valueAnimator, "");
            int animatedFraction = (int) (valueAnimator.getAnimatedFraction() * ((float) this.f164341a.getDuration()));
            if (animatedFraction >= 0 && 6000 >= animatedFraction) {
                cVar.element = animatedFraction / 100;
            } else if (6000 <= animatedFraction && 10000 >= animatedFraction) {
                cVar.element = ((animatedFraction - 6000) / 200) + 60;
            } else {
                cVar.element = ((animatedFraction - 10000) / 300) + 80;
            }
            EditCaptionScene.m129187a(this.f164342b).post(new Runnable(this) {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene.C73169b.RunnableC731701 */

                /* renamed from: a */
                final /* synthetic */ C73169b f164343a;

                static {
                    Covode.recordClassIndex(85887);
                }

                {
                    this.f164343a = r1;
                }

                public final void run() {
                    TextView textView = this.f164343a.f164342b.f164283L;
                    if (textView == null) {
                        C89219l.m154710a("mLoadingProgress");
                    }
                    textView.setText(this.f164343a.f164342b.mo36486t().getResources().getString(R.string.x9, Integer.valueOf(cVar.element)));
                }
            });
        }
    }

    public EditCaptionScene(C21582f fVar) {
        C89219l.m154721d(fVar, "");
        this.f164312ap = fVar;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(15400L);
        ofFloat.addUpdateListener(new C73169b(ofFloat, this));
        this.f164290S = ofFloat;
    }

    /* renamed from: b */
    private final void m129189b(List<C75313h> list) {
        this.f164311ao = new C75308c(list);
        if (this.f164306aj != null) {
            ActivityC0945e eVar = this.f164320i;
            if (eVar == null) {
                C89219l.m154710a("mActivity");
            }
            C72828b.m128597b(eVar);
            C72828b.m128598b(this.f164306aj);
            this.f164306aj = null;
        }
        LinearLayout linearLayout = this.f164278G;
        if (linearLayout == null) {
            C89219l.m154710a("mSubtitleLayout");
        }
        int i = 0;
        linearLayout.setVisibility(0);
        LinearLayout linearLayout2 = this.f164278G;
        if (linearLayout2 == null) {
            C89219l.m154710a("mSubtitleLayout");
        }
        linearLayout2.setAlpha(1.0f);
        TextView textView = this.f164275D;
        if (textView == null) {
            C89219l.m154710a("mSaveView");
        }
        textView.setVisibility(0);
        TextView textView2 = this.f164274C;
        if (textView2 == null) {
            C89219l.m154710a("mCancelView");
        }
        textView2.setVisibility(0);
        if (!list.isEmpty()) {
            this.f164327w.clear();
            this.f164327w.addAll(list);
            ArrayList<C75313h> a = C73207c.m129259a(list, this.f164302af);
            C73266t tVar = this.f164319h;
            if (tVar == null) {
                C89219l.m154710a("mSubtitleAdapter");
            }
            tVar.mo115779a(a);
            int K = mo115700K();
            if (K != -1) {
                i = K;
            }
            HighLightLayoutManager highLightLayoutManager = this.f164318g;
            if (highLightLayoutManager == null) {
                C89219l.m154710a("mHighLightLayoutManager");
            }
            AVDmtPanelRecycleView aVDmtPanelRecycleView = this.f164279H;
            if (aVDmtPanelRecycleView == null) {
                C89219l.m154710a("mRecyclerView");
            }
            highLightLayoutManager.mo4354a(aVDmtPanelRecycleView, new RecyclerView.C1378s(), i);
            AbstractC31071f fVar = this.f164321j;
            if (fVar != null) {
                fVar.mo56311a(true);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.subtitle.AbstractC73257o
    /* renamed from: d */
    public final void mo115711d(int i) {
        C73188t tVar = new C73188t(this, i);
        AbstractC31071f fVar = this.f164321j;
        if (fVar != null) {
            fVar.mo56344c(tVar);
        }
        AbstractC31071f fVar2 = this.f164321j;
        if (fVar2 != null) {
            fVar2.mo56259a(0, this.f164302af, C85581w.EnumC85608g.EDITOR_TIMERANGE_FLAG_BEFORE_SPEED);
        }
        AbstractC31071f fVar3 = this.f164321j;
        if (fVar3 != null) {
            fVar3.mo56311a(true);
        }
        AVDmtPanelRecycleView aVDmtPanelRecycleView = this.f164279H;
        if (aVDmtPanelRecycleView == null) {
            C89219l.m154710a("mRecyclerView");
        }
        if (aVDmtPanelRecycleView.getAdapter() != null) {
            C73266t tVar2 = this.f164319h;
            if (tVar2 == null) {
                C89219l.m154710a("mSubtitleAdapter");
            }
            ArrayList<C75313h> arrayList = tVar2.f164528g;
            int size = arrayList.size() - 1;
            Iterator<C75313h> it = arrayList.iterator();
            while (it.hasNext()) {
                C75313h next = it.next();
                if (((int) next.getStartTime()) != 0 || ((int) next.getEndTime()) != this.f164302af) {
                    long j = (long) i;
                    if (next.getStartTime() <= j && j <= next.getEndTime()) {
                        size = arrayList.indexOf(next);
                    }
                }
            }
            if (size >= 0) {
                C73266t tVar3 = this.f164319h;
                if (tVar3 == null) {
                    C89219l.m154710a("mSubtitleAdapter");
                }
                if (!TextUtils.isEmpty(tVar3.f164528g.get(size).getText()) || size == 0) {
                    HighLightLayoutManager highLightLayoutManager = this.f164318g;
                    if (highLightLayoutManager == null) {
                        C89219l.m154710a("mHighLightLayoutManager");
                    }
                    ActivityC0945e eVar = this.f164320i;
                    if (eVar == null) {
                        C89219l.m154710a("mActivity");
                    }
                    highLightLayoutManager.mo4347a(size, (int) C13628n.m24520b(eVar, 52.0f));
                    C73266t tVar4 = this.f164319h;
                    if (tVar4 == null) {
                        C89219l.m154710a("mSubtitleAdapter");
                    }
                    tVar4.mo115778a(size);
                }
            }
        }
        if (C65339ai.m117025a() && !this.f164329y) {
            mo115699J();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.subtitle.AbstractC73232k
    /* renamed from: a */
    public final void mo115705a(List<C75313h> list) {
        String str;
        long j;
        int i;
        C89219l.m154721d(list, "");
        AbstractC73198a aVar = mo115692C().f185622c;
        if (aVar != null) {
            str = aVar.f164381c;
        } else {
            str = null;
        }
        this.f164330z = str;
        mo115708b().mSubtitleMusicChangeChecker.getData(mo115708b());
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        if (arrayList.size() > 1) {
            C89070n.m154530a((List) arrayList, (Comparator) new C73164aa());
        }
        mo115692C().mo128164a(arrayList);
        mo115699J();
        C1213t<C88296t> tVar = this.f164324t;
        if (tVar == null) {
            C89219l.m154710a("mPreviewControlOpLiveData");
        }
        AbstractC46263a aVar2 = this.f164323l;
        if (aVar2 == null) {
            C89219l.m154710a("mCurrentPositionSource");
        }
        if (aVar2.mo78736c()) {
            AbstractC31071f fVar = this.f164321j;
            if (fVar != null) {
                i = fVar.mo56368j();
            } else {
                i = 0;
            }
            j = (long) i;
        } else {
            j = 0;
        }
        tVar.setValue(C88296t.m153439c(j));
        mo115706a(false);
        ArrayList<C75313h> arrayList2 = new ArrayList<>();
        this.f164328x = arrayList2;
        arrayList2.addAll(arrayList);
        m129189b(arrayList);
        mo115698I();
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo22704a(Bundle bundle) {
        int i;
        super.mo22704a(bundle);
        Activity activity = this.f52549m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        ActivityC0945e eVar = (ActivityC0945e) activity;
        this.f164320i = eVar;
        if (eVar == null) {
            C89219l.m154710a("mActivity");
        }
        Objects.requireNonNull(eVar, "null cannot be cast to non-null type com.ss.android.ugc.tools.view.activity.AVListenableActivityRegistry");
        this.f164308al = (AbstractC84919c) eVar;
        ActivityC0945e eVar2 = this.f164320i;
        if (eVar2 == null) {
            C89219l.m154710a("mActivity");
        }
        JediViewModel a = C20531t.m38716a(eVar2).mo33800a(EditStickerViewModel.class);
        C89219l.m154716b(a, "");
        this.f164301ae = (EditStickerViewModel) a;
        AbstractC31071f value = m129182N().mo114778C().getValue();
        this.f164321j = value;
        if (value != null) {
            i = value.mo56368j();
        } else {
            i = 0;
        }
        this.f164302af = i;
        this.f164325u = new SafeHandler(this);
        this.f164326v = new SafeHandler(this);
        View c = mo36475c(R.id.dpk);
        C89219l.m154716b(c, "");
        ViewGroup viewGroup = (ViewGroup) c;
        this.f164322k = viewGroup;
        if (viewGroup == null) {
            C89219l.m154710a("mSubtitleView");
        }
        viewGroup.setVisibility(8);
        ViewGroup viewGroup2 = this.f164322k;
        if (viewGroup2 == null) {
            C89219l.m154710a("mSubtitleView");
        }
        View findViewById = viewGroup2.findViewById(R.id.at_);
        C89219l.m154716b(findViewById, "");
        this.f164272A = (RelativeLayout) findViewById;
        ViewGroup viewGroup3 = this.f164322k;
        if (viewGroup3 == null) {
            C89219l.m154710a("mSubtitleView");
        }
        View findViewById2 = viewGroup3.findViewById(R.id.ady);
        C89219l.m154716b(findViewById2, "");
        this.f164273B = (FrameLayout) findViewById2;
        ViewGroup viewGroup4 = this.f164322k;
        if (viewGroup4 == null) {
            C89219l.m154710a("mSubtitleView");
        }
        View findViewById3 = viewGroup4.findViewById(R.id.et6);
        C89219l.m154716b(findViewById3, "");
        this.f164274C = (TextView) findViewById3;
        ViewGroup viewGroup5 = this.f164322k;
        if (viewGroup5 == null) {
            C89219l.m154710a("mSubtitleView");
        }
        View findViewById4 = viewGroup5.findViewById(R.id.f2x);
        C89219l.m154716b(findViewById4, "");
        this.f164275D = (TextView) findViewById4;
        ViewGroup viewGroup6 = this.f164322k;
        if (viewGroup6 == null) {
            C89219l.m154710a("mSubtitleView");
        }
        View findViewById5 = viewGroup6.findViewById(R.id.cfd);
        C89219l.m154716b(findViewById5, "");
        this.f164276E = (LinearLayout) findViewById5;
        ViewGroup viewGroup7 = this.f164322k;
        if (viewGroup7 == null) {
            C89219l.m154710a("mSubtitleView");
        }
        View findViewById6 = viewGroup7.findViewById(R.id.cfy);
        C89219l.m154716b(findViewById6, "");
        this.f164277F = (DmtStatusView) findViewById6;
        ViewGroup viewGroup8 = this.f164322k;
        if (viewGroup8 == null) {
            C89219l.m154710a("mSubtitleView");
        }
        View findViewById7 = viewGroup8.findViewById(R.id.eb9);
        C89219l.m154716b(findViewById7, "");
        this.f164278G = (LinearLayout) findViewById7;
        ViewGroup viewGroup9 = this.f164322k;
        if (viewGroup9 == null) {
            C89219l.m154710a("mSubtitleView");
        }
        View findViewById8 = viewGroup9.findViewById(R.id.dgw);
        C89219l.m154716b(findViewById8, "");
        this.f164279H = (AVDmtPanelRecycleView) findViewById8;
        ViewGroup viewGroup10 = this.f164322k;
        if (viewGroup10 == null) {
            C89219l.m154710a("mSubtitleView");
        }
        View findViewById9 = viewGroup10.findViewById(R.id.bez);
        C89219l.m154716b(findViewById9, "");
        this.f164280I = findViewById9;
        ViewGroup viewGroup11 = this.f164322k;
        if (viewGroup11 == null) {
            C89219l.m154710a("mSubtitleView");
        }
        View findViewById10 = viewGroup11.findViewById(R.id.bi_);
        C89219l.m154716b(findViewById10, "");
        this.f164281J = (ImageView) findViewById10;
        ViewGroup viewGroup12 = this.f164322k;
        if (viewGroup12 == null) {
            C89219l.m154710a("mSubtitleView");
        }
        View findViewById11 = viewGroup12.findViewById(R.id.bi8);
        C89219l.m154716b(findViewById11, "");
        this.f164282K = (ImageView) findViewById11;
        ViewGroup viewGroup13 = this.f164322k;
        if (viewGroup13 == null) {
            C89219l.m154710a("mSubtitleView");
        }
        View findViewById12 = viewGroup13.findViewById(R.id.cfv);
        C89219l.m154716b(findViewById12, "");
        this.f164283L = (TextView) findViewById12;
        ViewGroup viewGroup14 = this.f164322k;
        if (viewGroup14 == null) {
            C89219l.m154710a("mSubtitleView");
        }
        View findViewById13 = viewGroup14.findViewById(R.id.cfo);
        C89219l.m154716b(findViewById13, "");
        this.f164284M = (TextView) findViewById13;
        ViewGroup viewGroup15 = this.f164322k;
        if (viewGroup15 == null) {
            C89219l.m154710a("mSubtitleView");
        }
        View findViewById14 = viewGroup15.findViewById(R.id.bi9);
        C89219l.m154716b(findViewById14, "");
        this.f164285N = (ImageView) findViewById14;
        LinearLayout linearLayout = this.f164276E;
        if (linearLayout == null) {
            C89219l.m154710a("mLoadingArea");
        }
        View findViewById15 = linearLayout.findViewById(R.id.a0z);
        C89219l.m154716b(findViewById15, "");
        this.f164288Q = (TuxTextView) findViewById15;
        if (C65438du.m117156a()) {
            TuxTextView tuxTextView = this.f164288Q;
            if (tuxTextView == null) {
                C89219l.m154710a("mLoadingCancelBtn");
            }
            tuxTextView.setText(R.string.f59);
            TextView textView = this.f164274C;
            if (textView == null) {
                C89219l.m154710a("mCancelView");
            }
            textView.setText(R.string.b8u);
        }
        this.f164296Z = new C73181m(this);
        View c2 = mo36475c(R.id.byg);
        C89219l.m154716b(c2, "");
        this.f164286O = c2;
        View c3 = mo36475c(R.id.b56);
        C89219l.m154716b(c3, "");
        this.f164287P = c3;
        ActivityC0945e eVar3 = this.f164320i;
        if (eVar3 == null) {
            C89219l.m154710a("mActivity");
        }
        LayoutInflater from = LayoutInflater.from(eVar3);
        LinearLayout linearLayout2 = this.f164276E;
        if (linearLayout2 == null) {
            C89219l.m154710a("mLoadingArea");
        }
        View a2 = C1764a.m5927a(from, R.layout.b2k, linearLayout2, false);
        C89219l.m154716b(a2, "");
        this.f164297aa = a2;
        ActivityC0945e eVar4 = this.f164320i;
        if (eVar4 == null) {
            C89219l.m154710a("mActivity");
        }
        LayoutInflater from2 = LayoutInflater.from(eVar4);
        LinearLayout linearLayout3 = this.f164276E;
        if (linearLayout3 == null) {
            C89219l.m154710a("mLoadingArea");
        }
        View a3 = C1764a.m5927a(from2, R.layout.b2j, linearLayout3, false);
        C89219l.m154716b(a3, "");
        this.f164298ab = a3;
        TextView textView2 = this.f164274C;
        if (textView2 == null) {
            C89219l.m154710a("mCancelView");
        }
        AbstractView$OnClickListenerC81432d dVar = this.f164296Z;
        if (dVar == null) {
            C89219l.m154710a("debounceOnClickListener");
        }
        textView2.setOnClickListener(dVar);
        TextView textView3 = this.f164275D;
        if (textView3 == null) {
            C89219l.m154710a("mSaveView");
        }
        AbstractView$OnClickListenerC81432d dVar2 = this.f164296Z;
        if (dVar2 == null) {
            C89219l.m154710a("debounceOnClickListener");
        }
        textView3.setOnClickListener(dVar2);
        ImageView imageView = this.f164281J;
        if (imageView == null) {
            C89219l.m154710a("mIvFont");
        }
        AbstractView$OnClickListenerC81432d dVar3 = this.f164296Z;
        if (dVar3 == null) {
            C89219l.m154710a("debounceOnClickListener");
        }
        imageView.setOnClickListener(dVar3);
        ImageView imageView2 = this.f164282K;
        if (imageView2 == null) {
            C89219l.m154710a("mIvDelete");
        }
        AbstractView$OnClickListenerC81432d dVar4 = this.f164296Z;
        if (dVar4 == null) {
            C89219l.m154710a("debounceOnClickListener");
        }
        imageView2.setOnClickListener(dVar4);
        ImageView imageView3 = this.f164285N;
        if (imageView3 == null) {
            C89219l.m154710a("mIvEdit");
        }
        AbstractView$OnClickListenerC81432d dVar5 = this.f164296Z;
        if (dVar5 == null) {
            C89219l.m154710a("debounceOnClickListener");
        }
        imageView3.setOnClickListener(dVar5);
        View view = this.f164287P;
        if (view == null) {
            C89219l.m154710a("mFlPlay");
        }
        AbstractView$OnClickListenerC81432d dVar6 = this.f164296Z;
        if (dVar6 == null) {
            C89219l.m154710a("debounceOnClickListener");
        }
        view.setOnClickListener(dVar6);
        DmtStatusView dmtStatusView = this.f164277F;
        if (dmtStatusView == null) {
            C89219l.m154710a("mLoadingStatusView");
        }
        ActivityC0945e eVar5 = this.f164320i;
        if (eVar5 == null) {
            C89219l.m154710a("mActivity");
        }
        DmtStatusView.C17269a a4 = DmtStatusView.C17269a.m31905a(eVar5);
        a4.f41304g = 1;
        dmtStatusView.setBuilder(a4);
        if (this.f164320i == null) {
            C89219l.m154710a("mActivity");
        }
        this.f164318g = new HighLightLayoutManager();
        C73266t tVar = new C73266t(new ArrayList());
        this.f164319h = tVar;
        C73182n nVar = new C73182n(this);
        C89219l.m154721d(nVar, "");
        tVar.f164524c = nVar;
        AVDmtPanelRecycleView aVDmtPanelRecycleView = this.f164279H;
        if (aVDmtPanelRecycleView == null) {
            C89219l.m154710a("mRecyclerView");
        }
        HighLightLayoutManager highLightLayoutManager = this.f164318g;
        if (highLightLayoutManager == null) {
            C89219l.m154710a("mHighLightLayoutManager");
        }
        aVDmtPanelRecycleView.setLayoutManager(highLightLayoutManager);
        C73266t tVar2 = this.f164319h;
        if (tVar2 == null) {
            C89219l.m154710a("mSubtitleAdapter");
        }
        aVDmtPanelRecycleView.setAdapter(tVar2);
        aVDmtPanelRecycleView.mo4415b(new C73174f((int) C13628n.m24520b(aVDmtPanelRecycleView.getContext(), 52.0f), (int) C13628n.m24520b(aVDmtPanelRecycleView.getContext(), 163.0f)));
        RecyclerView.AbstractC1356f itemAnimator = aVDmtPanelRecycleView.getItemAnimator();
        Objects.requireNonNull(itemAnimator, "null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
        ((AbstractC1391ab) itemAnimator).f4621m = false;
        AVDmtPanelRecycleView aVDmtPanelRecycleView2 = this.f164279H;
        if (aVDmtPanelRecycleView2 == null) {
            C89219l.m154710a("mRecyclerView");
        }
        aVDmtPanelRecycleView2.mo4405a(new C73183o(this));
        ActivityC0945e eVar6 = this.f164320i;
        if (eVar6 == null) {
            C89219l.m154710a("mActivity");
        }
        LayoutInflater from3 = LayoutInflater.from(eVar6);
        ViewGroup viewGroup16 = this.f164322k;
        if (viewGroup16 == null) {
            C89219l.m154710a("mSubtitleView");
        }
        View a5 = C1764a.m5927a(from3, R.layout.b2g, viewGroup16, false);
        Objects.requireNonNull(a5, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout linearLayout4 = (LinearLayout) a5;
        ViewGroup viewGroup17 = this.f164322k;
        if (viewGroup17 == null) {
            C89219l.m154710a("mSubtitleView");
        }
        C73218h hVar = new C73218h(linearLayout4, viewGroup17, this, mo115708b(), m129182N());
        this.f164313b = hVar;
        C89219l.m154721d(this, "");
        hVar.f164438c = this;
        this.f164323l = new C73177i(this);
        EditStickerViewModel editStickerViewModel = this.f164301ae;
        if (editStickerViewModel == null) {
            C89219l.m154710a("mEditStickerViewModel");
        }
        ((LiveData) editStickerViewModel.f184682a.getValue()).observe(this, new C73179k(this));
        C1213t<C88296t> v = m129182N().mo114833v();
        this.f164324t = v;
        if (v == null) {
            C89219l.m154710a("mPreviewControlOpLiveData");
        }
        v.observe(this, new C73180l(this));
        mo115692C().f185621b.mo6997a(this, new C73178j(this));
        AbstractC73198a aVar = mo115692C().f185622c;
        if (aVar != null) {
            C89219l.m154721d(this, "");
            aVar.f164384f = this;
        }
    }

    /* renamed from: b */
    public final void mo115709b(boolean z) {
        long j;
        boolean z2;
        int i;
        MethodCollector.m26663i(11724);
        if (!z) {
            TextView textView = this.f164275D;
            if (textView == null) {
                C89219l.m154710a("mSaveView");
            }
            textView.setVisibility(4);
            TextView textView2 = this.f164274C;
            if (textView2 == null) {
                C89219l.m154710a("mCancelView");
            }
            textView2.setVisibility(4);
            View view = this.f164286O;
            if (view == null) {
                C89219l.m154710a("mIvPlay");
            }
            view.setVisibility(8);
        }
        FrameLayout frameLayout = this.f164273B;
        if (frameLayout == null) {
            C89219l.m154710a("mContentLayout");
        }
        int P = m129184P();
        ViewGroup viewGroup = this.f164322k;
        if (viewGroup == null) {
            C89219l.m154710a("mSubtitleView");
        }
        C46371s.m89467a(frameLayout, z, P, viewGroup, C73197z.f164377a);
        if (z) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f164293W = elapsedRealtime;
            this.f164294X = elapsedRealtime;
            FrameLayout frameLayout2 = this.f164273B;
            if (frameLayout2 == null) {
                C89219l.m154710a("mContentLayout");
            }
            View view2 = this.f164297aa;
            if (view2 == null) {
                C89219l.m154710a("mRetryView");
            }
            frameLayout2.removeView(view2);
            FrameLayout frameLayout3 = this.f164273B;
            if (frameLayout3 == null) {
                C89219l.m154710a("mContentLayout");
            }
            View view3 = this.f164298ab;
            if (view3 == null) {
                C89219l.m154710a("mExitView");
            }
            frameLayout3.removeView(view3);
            this.f164315d = 0.004f;
            mo115699J();
            C1213t<C88296t> tVar = this.f164324t;
            if (tVar == null) {
                C89219l.m154710a("mPreviewControlOpLiveData");
            }
            AbstractC46263a aVar = this.f164323l;
            if (aVar == null) {
                C89219l.m154710a("mCurrentPositionSource");
            }
            if (aVar.mo78736c()) {
                AbstractC31071f fVar = this.f164321j;
                if (fVar != null) {
                    i = fVar.mo56368j();
                } else {
                    i = 0;
                }
                j = (long) i;
            } else {
                j = 0;
            }
            tVar.setValue(C88296t.m153439c(j));
            AbstractC84919c cVar = this.f164308al;
            if (cVar == null) {
                C89219l.m154710a("mListenableActivityRegistry");
            }
            cVar.mo87533b(this.f164309am);
            AbstractC72510a N = m129182N();
            int a = C77795c.m135910a(true, false, false, false);
            int O = m129183O();
            ActivityC0945e eVar = this.f164320i;
            if (eVar == null) {
                C89219l.m154710a("mActivity");
            }
            N.mo114803a(C88297u.C88298a.m153448a(a, O + C70636dh.m124833c(eVar), m129184P(), m129185Q(), C33398a.f79357a.mo59453d(), false, false, 960));
            if (mo115708b().mSubtitleMusicChangeChecker.hasChanged(mo115708b()) || (this.f164328x == null && mo115708b().captionStruct == null)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                this.f164327w.clear();
                mo115692C().mo128164a((List<C75313h>) null);
                mo115708b().captionStruct = null;
                mo115706a(true);
                this.f164327w.clear();
                ImageView imageView = this.f164285N;
                if (imageView == null) {
                    C89219l.m154710a("mIvEdit");
                }
                imageView.setVisibility(0);
                this.f164305ai = null;
                this.f164304ah = null;
                AbstractC73198a aVar2 = mo115692C().f185622c;
                if (aVar2 != null) {
                    aVar2.mo115744h();
                    aVar2.mo115742f();
                    MethodCollector.m26664o(11724);
                    return;
                }
                MethodCollector.m26664o(11724);
                return;
            }
            C75309d dVar = mo115708b().captionStruct;
            if (dVar == null || dVar.getUtterances() == null) {
                List<C75313h> list = this.f164328x;
                if (list == null) {
                    list = C89086z.INSTANCE;
                }
                m129189b(list);
                this.f164304ah = null;
            } else {
                C75309d dVar2 = mo115708b().captionStruct;
                if (dVar2 == null) {
                    C89219l.m154715b();
                }
                List<C75313h> utterances = dVar2.getUtterances();
                if (utterances == null) {
                    C89219l.m154715b();
                }
                m129189b(utterances);
                C75309d dVar3 = mo115708b().captionStruct;
                if (dVar3 == null) {
                    C89219l.m154715b();
                }
                List<C75313h> utterances2 = dVar3.getUtterances();
                if (utterances2 == null) {
                    C89219l.m154715b();
                }
                this.f164304ah = utterances2;
            }
            mo115706a(false);
            mo115698I();
            mo115692C().mo128164a(this.f164327w);
            MethodCollector.m26664o(11724);
            return;
        }
        EditStickerViewModel editStickerViewModel = this.f164301ae;
        if (editStickerViewModel == null) {
            C89219l.m154710a("mEditStickerViewModel");
        }
        editStickerViewModel.mo127691n().setValue(false);
        AbstractC84919c cVar2 = this.f164308al;
        if (cVar2 == null) {
            C89219l.m154710a("mListenableActivityRegistry");
        }
        cVar2.mo87535c(this.f164309am);
        AbstractC72510a N2 = m129182N();
        ActivityC0945e eVar2 = this.f164320i;
        if (eVar2 == null) {
            C89219l.m154710a("mActivity");
        }
        int c = C0643b.m2378c(eVar2, R.color.a2);
        int O2 = m129183O();
        ActivityC0945e eVar3 = this.f164320i;
        if (eVar3 == null) {
            C89219l.m154710a("mActivity");
        }
        N2.mo114803a(C88297u.C88298a.m153445a(c, O2 + C70636dh.m124833c(eVar3), m129184P(), m129185Q(), C33398a.f79357a.mo59453d()));
        View view4 = this.f164286O;
        if (view4 == null) {
            C89219l.m154710a("mIvPlay");
        }
        view4.setVisibility(8);
        MethodCollector.m26664o(11724);
    }

    /* renamed from: a */
    public final void mo115706a(boolean z) {
        if (z) {
            this.f164316e = new RunnableC73175g();
            SafeHandler safeHandler = this.f164326v;
            if (safeHandler == null) {
                C89219l.m154710a("mTipsHandler");
            }
            RunnableC73175g gVar = this.f164316e;
            if (gVar == null) {
                C89219l.m154715b();
            }
            safeHandler.post(gVar);
            this.f164290S.start();
            LinearLayout linearLayout = this.f164276E;
            if (linearLayout == null) {
                C89219l.m154710a("mLoadingArea");
            }
            linearLayout.setVisibility(0);
            LinearLayout linearLayout2 = this.f164278G;
            if (linearLayout2 == null) {
                C89219l.m154710a("mSubtitleLayout");
            }
            linearLayout2.setVisibility(8);
            DmtStatusView dmtStatusView = this.f164277F;
            if (dmtStatusView == null) {
                C89219l.m154710a("mLoadingStatusView");
            }
            dmtStatusView.mo27384f();
            LinearLayout linearLayout3 = this.f164276E;
            if (linearLayout3 == null) {
                C89219l.m154710a("mLoadingArea");
            }
            linearLayout3.findViewById(R.id.a0z).setOnClickListener(new View$OnClickListenerC73166ac(this));
            return;
        }
        this.f164290S.cancel();
        this.f164316e = null;
        SafeHandler safeHandler2 = this.f164326v;
        if (safeHandler2 == null) {
            C89219l.m154710a("mTipsHandler");
        }
        safeHandler2.removeCallbacksAndMessages(null);
        DmtStatusView dmtStatusView2 = this.f164277F;
        if (dmtStatusView2 == null) {
            C89219l.m154710a("mLoadingStatusView");
        }
        dmtStatusView2.mo27382d();
        LinearLayout linearLayout4 = this.f164276E;
        if (linearLayout4 == null) {
            C89219l.m154710a("mLoadingArea");
        }
        linearLayout4.setVisibility(8);
        LinearLayout linearLayout5 = this.f164278G;
        if (linearLayout5 == null) {
            C89219l.m154710a("mSubtitleLayout");
        }
        linearLayout5.setVisibility(0);
        LinearLayout linearLayout6 = this.f164278G;
        if (linearLayout6 == null) {
            C89219l.m154710a("mSubtitleLayout");
        }
        linearLayout6.setAlpha(1.0f);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene$f */
    public static final class C73174f extends RecyclerView.AbstractC1361h {

        /* renamed from: a */
        private final int f164347a;

        /* renamed from: b */
        private final int f164348b;

        static {
            Covode.recordClassIndex(85891);
        }

        public C73174f(int i, int i2) {
            this.f164347a = i;
            this.f164348b = i2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1361h
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1378s sVar) {
            RecyclerView.AbstractC1362i layoutManager;
            C89219l.m154721d(rect, "");
            C89219l.m154721d(view, "");
            C89219l.m154721d(recyclerView, "");
            C89219l.m154721d(sVar, "");
            int d = RecyclerView.m4277d(view);
            if (d == 0) {
                rect.top = this.f164347a;
            }
            RecyclerView.AbstractC1362i layoutManager2 = recyclerView.getLayoutManager();
            if (layoutManager2 != null && Integer.valueOf(layoutManager2.mo4685A() - 1) != null && (layoutManager = recyclerView.getLayoutManager()) != null && d == layoutManager.mo4685A() - 1) {
                rect.bottom = this.f164348b;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene$w */
    public static final class DialogInterface$OnClickListenerC73193w implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EditCaptionScene f164373a;

        static {
            Covode.recordClassIndex(85910);
        }

        DialogInterface$OnClickListenerC73193w(EditCaptionScene editCaptionScene) {
            this.f164373a = editCaptionScene;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f164373a.mo115697H();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene$y */
    public static final class DialogInterface$OnClickListenerC73196y implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EditCaptionScene f164376a;

        static {
            Covode.recordClassIndex(85913);
        }

        DialogInterface$OnClickListenerC73196y(EditCaptionScene editCaptionScene) {
            this.f164376a = editCaptionScene;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f164376a.mo115697H();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene$u */
    static final class DialogInterface$OnClickListenerC73190u implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EditCaptionScene f164370a;

        static {
            Covode.recordClassIndex(85907);
        }

        DialogInterface$OnClickListenerC73190u(EditCaptionScene editCaptionScene) {
            this.f164370a = editCaptionScene;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f164370a.mo115697H();
            this.f164370a.f164327w.clear();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene$aa */
    public static final class C73164aa<T> implements Comparator {
        static {
            Covode.recordClassIndex(85881);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C89090a.m154604a(Long.valueOf(t.getStartTime()), Long.valueOf(t2.getStartTime()));
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.ask, viewGroup, false);
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene$q */
    static final class C73185q implements AbstractC84917a {

        /* renamed from: a */
        final /* synthetic */ EditCaptionScene f164364a;

        static {
            Covode.recordClassIndex(85902);
        }

        C73185q(EditCaptionScene editCaptionScene) {
            this.f164364a = editCaptionScene;
        }

        @Override // com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84917a
        public final boolean onKeyDown(int i, KeyEvent keyEvent) {
            TextView textView;
            if (i != 4) {
                return false;
            }
            C73218h hVar = this.f164364a.f164313b;
            if (hVar == null || !hVar.f164445j) {
                ViewGroup viewGroup = this.f164364a.f164322k;
                if (viewGroup == null) {
                    C89219l.m154710a("mSubtitleView");
                }
                if (viewGroup.isShown()) {
                    EditCaptionScene editCaptionScene = this.f164364a;
                    LinearLayout linearLayout = editCaptionScene.f164276E;
                    if (linearLayout == null) {
                        C89219l.m154710a("mLoadingArea");
                    }
                    if (linearLayout.getVisibility() == 0) {
                        editCaptionScene.mo115695F();
                    } else {
                        editCaptionScene.mo115694E();
                    }
                }
            } else {
                C73218h hVar2 = this.f164364a.f164313b;
                if (!(hVar2 == null || (textView = hVar2.f164441f) == null)) {
                    textView.performClick();
                }
            }
            return true;
        }
    }

    /* renamed from: a */
    public final void mo115704a(int i, int i2, String str) {
        boolean z;
        C89219l.m154721d(str, "");
        if (C65339ai.m117025a()) {
            View view = this.f164286O;
            if (view == null) {
                C89219l.m154710a("mIvPlay");
            }
            if (view.getVisibility() != 0) {
                z = true;
            } else {
                z = false;
            }
            this.f164329y = z;
            C1213t<C88296t> tVar = this.f164324t;
            if (tVar == null) {
                C89219l.m154710a("mPreviewControlOpLiveData");
            }
            tVar.setValue(C88296t.m153437b());
        } else {
            mo115699J();
        }
        AbstractC46263a aVar = this.f164323l;
        if (aVar == null) {
            C89219l.m154710a("mCurrentPositionSource");
        }
        this.f164291U = aVar.mo78732a();
        AbstractC31071f fVar = this.f164321j;
        if (fVar != null) {
            fVar.mo56311a(false);
        }
        C70968bl.m125267c(mo115708b(), str);
        C73218h hVar = this.f164313b;
        if (hVar != null) {
            hVar.mo115759a(str);
        }
        ArrayList<C75313h> arrayList = this.f164327w;
        C73266t tVar2 = this.f164319h;
        if (tVar2 == null) {
            C89219l.m154710a("mSubtitleAdapter");
        }
        int a = C89070n.m154546a((List) arrayList, C89070n.m154561b((List) tVar2.f164528g, i));
        C84911q.m145928d("EditCaptionScene enterEditView showPos " + a + " selectIndex " + i2);
        C73218h hVar2 = this.f164313b;
        if (hVar2 != null) {
            hVar2.mo115760a(this.f164327w, a, i2, (int) this.f164291U);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.subtitle.AbstractC73257o
    /* renamed from: a */
    public final void mo115707a(boolean z, int i, List<C75313h> list) {
        C89219l.m154721d(list, "");
        if (z) {
            this.f164327w.clear();
            this.f164327w.addAll(list);
            C73266t tVar = this.f164319h;
            if (tVar == null) {
                C89219l.m154710a("mSubtitleAdapter");
            }
            tVar.mo115779a(C73207c.m129259a(this.f164327w, this.f164302af));
            C73266t tVar2 = this.f164319h;
            if (tVar2 == null) {
                C89219l.m154710a("mSubtitleAdapter");
            }
            int a = C89070n.m154546a((List) tVar2.f164528g, C89070n.m154561b((List) this.f164327w, i));
            C73266t tVar3 = this.f164319h;
            if (tVar3 == null) {
                C89219l.m154710a("mSubtitleAdapter");
            }
            if (a == -1) {
                a = 0;
            }
            tVar3.mo115778a(a);
            ArrayList arrayList = new ArrayList();
            C73266t tVar4 = this.f164319h;
            if (tVar4 == null) {
                C89219l.m154710a("mSubtitleAdapter");
            }
            ArrayList<C75313h> arrayList2 = tVar4.f164528g;
            int size = arrayList2.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (arrayList2.get(i2).getText().length() > 0) {
                    C75313h hVar = arrayList2.get(i2);
                    C89219l.m154716b(hVar, "");
                    arrayList.add(new C75313h(hVar));
                }
            }
            mo115692C().mo128164a(arrayList);
            AbstractC31071f fVar = this.f164321j;
            if (fVar != null) {
                fVar.mo56392w();
            }
        }
        C39162r.m79460a("save_edit_subtitle", C70968bl.m125268d(mo115708b()).mo129403a("is_changed", z ? 1 : 0).f188764a);
    }
}
