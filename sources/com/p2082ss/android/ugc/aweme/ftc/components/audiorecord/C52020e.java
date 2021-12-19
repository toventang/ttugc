package com.p2082ss.android.ugc.aweme.ftc.components.audiorecord;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.core.content.C0643b;
import androidx.core.p036g.AbstractC0688a;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1213t;
import com.C1764a;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.bpea.basics.C13349j;
import com.bytedance.bpea.basics.C13350k;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.p878a.C13401b;
import com.bytedance.common.utility.C13628n;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
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
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.scene.AbstractC22219j;
import com.bytedance.scene.group.AbstractC22186b;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.adaptation.C33398a;
import com.p2082ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.p2082ss.android.ugc.aweme.audiorecord.Point;
import com.p2082ss.android.ugc.aweme.effect.C46371s;
import com.p2082ss.android.ugc.aweme.ftc.components.audiorecord.C52013b;
import com.p2082ss.android.ugc.aweme.ftc.components.audiorecord.FTCAudioRecordStartButton;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.property.C65374bn;
import com.p2082ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.p2082ss.android.ugc.aweme.shortvideo.C70636dh;
import com.p2082ss.android.ugc.aweme.shortvideo.C70638dj;
import com.p2082ss.android.ugc.aweme.shortvideo.cover.VEVideoCoverGeneratorImpl;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.audiorecord.C70926h;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.p3810c.C70982a;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.p3841a.AbstractC72001h;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.p3841a.C71991a;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.p3841a.C71993c;
import com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a;
import com.p2082ss.android.ugc.aweme.shortvideo.widget.C74297p;
import com.p2082ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverView;
import com.p2082ss.android.ugc.aweme.themechange.base.AVDmtTextView;
import com.p2082ss.android.ugc.aweme.themechange.base.C77795c;
import com.p2082ss.android.ugc.aweme.tools.C78099c;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d;
import com.p2082ss.android.ugc.aweme.widgetcompat.WrapLinearLayoutManager;
import com.p2082ss.android.ugc.gamora.editor.p4279f.C82185a;
import com.p2082ss.android.ugc.tools.view.C84916a;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84917a;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84919c;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.vesdk.C85581w;
import com.p2082ss.android.vesdk.VEAudioEncodeSettings;
import dmt.p4542av.video.C88296t;
import dmt.p4542av.video.C88297u;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
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
import p4600h.p4615g.C89241a;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4620k.AbstractC89286i;
import p4600h.p4620k.AbstractC89290k;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.ftc.components.audiorecord.e */
public final class C52020e extends AbstractC22219j implements WeakHandler.IHandler, AbstractC20382b, AbstractC21566a {

    /* renamed from: F */
    public static final C52023c f119844F = new C52023c((byte) 0);

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f119845a = {new C89232y(C52020e.class, "mVideoPublishEditModel", "getMVideoPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0)};

    /* renamed from: A */
    public C52046f f119846A;

    /* renamed from: B */
    public AudioRecorderParam f119847B;

    /* renamed from: C */
    public volatile boolean f119848C;

    /* renamed from: D */
    public final WeakHandler f119849D;

    /* renamed from: E */
    public final C52039s f119850E;

    /* renamed from: G */
    private final AbstractC89244h f119851G = C89250i.m154773a((AbstractC89171a) C52040t.f119912a);

    /* renamed from: H */
    private final AbstractC89244h f119852H = C89250i.m154773a((AbstractC89171a) C52036p.f119908a);

    /* renamed from: I */
    private AbstractC84919c f119853I;

    /* renamed from: J */
    private final AbstractC89248d f119854J;

    /* renamed from: K */
    private final AbstractC89244h f119855K;

    /* renamed from: L */
    private final AbstractC89244h f119856L;

    /* renamed from: M */
    private View f119857M;

    /* renamed from: N */
    private DmtStatusView f119858N;

    /* renamed from: O */
    private View f119859O;

    /* renamed from: P */
    private FrameLayout f119860P;

    /* renamed from: Q */
    private ChooseVideoCoverView f119861Q;

    /* renamed from: R */
    private View f119862R;

    /* renamed from: S */
    private ViewGroup f119863S;

    /* renamed from: T */
    private LottieAnimationView f119864T;

    /* renamed from: U */
    private CheckBox f119865U;

    /* renamed from: V */
    private VEVideoCoverGeneratorImpl f119866V;

    /* renamed from: W */
    private C74297p f119867W;

    /* renamed from: X */
    private C1213t<Bitmap> f119868X;

    /* renamed from: Y */
    private C1213t<Boolean> f119869Y;

    /* renamed from: Z */
    private final C52035o f119870Z;

    /* renamed from: aa */
    private final C52026f f119871aa;

    /* renamed from: ab */
    private final C21582f f119872ab;

    /* renamed from: b */
    public AbstractC31071f f119873b;

    /* renamed from: c */
    public int f119874c = 1;

    /* renamed from: d */
    public float f119875d;

    /* renamed from: e */
    public final ValueAnimator f119876e;

    /* renamed from: f */
    public boolean f119877f;

    /* renamed from: g */
    public boolean f119878g;

    /* renamed from: h */
    public boolean f119879h;

    /* renamed from: i */
    public Point f119880i;

    /* renamed from: j */
    public C1213t<C88296t> f119881j;

    /* renamed from: k */
    public View f119882k;

    /* renamed from: l */
    public View f119883l;

    /* renamed from: t */
    public View f119884t;

    /* renamed from: u */
    public C52013b f119885u;

    /* renamed from: v */
    public FTCAudioRecordStartButton f119886v;

    /* renamed from: w */
    public boolean f119887w;

    /* renamed from: x */
    public boolean f119888x;

    /* renamed from: y */
    public View f119889y;

    /* renamed from: z */
    public AVDmtTextView f119890z;

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.audiorecord.e$q */
    static final class View$OnClickListenerC52037q implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC52037q f119909a = new View$OnClickListenerC52037q();

        static {
            Covode.recordClassIndex(61412);
        }

        View$OnClickListenerC52037q() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
        }
    }

    static {
        Covode.recordClassIndex(61395);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public final AbstractC72510a mo87755C() {
        return (AbstractC72510a) this.f119855K.getValue();
    }

    /* renamed from: a */
    public final C1213t<Long> mo87757a() {
        return (C1213t) this.f119851G.getValue();
    }

    /* renamed from: b */
    public final C1213t<Boolean> mo87762b() {
        return (C1213t) this.f119852H.getValue();
    }

    /* renamed from: d */
    public final VideoPublishEditModel mo87764d() {
        return (VideoPublishEditModel) this.f119854J.mo23374a(this, f119845a[0]);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.audiorecord.e$c */
    public static final class C52023c {
        static {
            Covode.recordClassIndex(61398);
        }

        private C52023c() {
        }

        public /* synthetic */ C52023c(byte b) {
            this();
        }
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f119872ab;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20367ae
    public final /* bridge */ /* synthetic */ AbstractC20477i getReceiver() {
        return this;
    }

    /* renamed from: a */
    public final void mo87760a(boolean z) {
        AbstractC22186b bVar;
        if (z && (bVar = (AbstractC22186b) this.f52551o) != null) {
            bVar.mo36417e(this);
        }
        ViewGroup viewGroup = this.f119863S;
        if (viewGroup == null) {
            C89219l.m154710a("contentLayout");
        }
        C46371s.m89467a(viewGroup, z, (int) C13628n.m24520b(this.f52549m, 282.0f), mo36474b(R.id.b9f), new C52045y(this, z));
        if (z) {
            if (mo87764d().veAudioRecorderParam != null) {
                mo87764d().veAudioRecorderParam.setNeedDel(true);
                AbstractC72510a C = mo87755C();
                AudioRecorderParam audioRecorderParam = mo87764d().veAudioRecorderParam;
                C89219l.m154716b(audioRecorderParam, "");
                C70926h.m125230a(C, audioRecorderParam);
            } else {
                this.f119847B = new AudioRecorderParam();
            }
            this.f119847B.copyFrom(mo87764d().veAudioRecorderParam);
            if (this.f119847B.getNeedOriginalSound()) {
                this.f119847B.setVoiceVolume(mo87764d().voiceVolume);
            }
            this.f119880i = null;
            CheckBox checkBox = this.f119865U;
            if (checkBox == null) {
                C89219l.m154710a("checkBox");
            }
            checkBox.setChecked(this.f119847B.getNeedOriginalSound());
            mo87762b().setValue(Boolean.valueOf(this.f119847B.getNeedOriginalSound()));
            View view = this.f119884t;
            if (view == null) {
                C89219l.m154710a("mPlayView");
            }
            view.setVisibility(0);
            this.f119850E.mo87772a(0.0f, true);
            C52013b bVar2 = this.f119885u;
            if (bVar2 == null) {
                C89219l.m154710a("audioRecordSeekBar");
            }
            bVar2.setStack(this.f119847B.getMStack());
            C52013b bVar3 = this.f119885u;
            if (bVar3 == null) {
                C89219l.m154710a("audioRecordSeekBar");
            }
            bVar3.mo87747a(0.0f);
            mo87757a().setValue(0L);
            if (this.f119847B.getMStack().isEmpty()) {
                View view2 = this.f119889y;
                if (view2 == null) {
                    C89219l.m154710a("backView");
                }
                view2.setVisibility(8);
            } else {
                View view3 = this.f119889y;
                if (view3 == null) {
                    C89219l.m154710a("backView");
                }
                view3.setVisibility(0);
            }
            AbstractC84919c cVar = this.f119853I;
            if (cVar != null) {
                cVar.mo87533b(this.f119870Z);
            }
            m96766E();
            if (mo87764d().veAudioEffectParam != null) {
                new C79459a(this.f52549m).mo123050a(R.string.ay6).mo123053a();
            }
            mo87755C().mo114803a(C88297u.C88298a.m153448a(C77795c.m135910a(true, false, false, false), ((int) C13628n.m24520b(this.f52549m, 52.0f)) + C70636dh.m124833c(this.f52549m), (int) C13628n.m24520b(this.f52549m, 282.0f), m96767F(), C33398a.f79357a.mo59453d(), false, false, 960));
            return;
        }
        View view4 = this.f119882k;
        if (view4 == null) {
            C89219l.m154710a("mSaveView");
        }
        view4.setVisibility(8);
        View view5 = this.f119883l;
        if (view5 == null) {
            C89219l.m154710a("mCancelView");
        }
        view5.setVisibility(8);
        AbstractC84919c cVar2 = this.f119853I;
        if (cVar2 != null) {
            cVar2.mo87535c(this.f119870Z);
        }
        this.f119876e.cancel();
        AbstractC72510a C2 = mo87755C();
        View view6 = this.f119882k;
        if (view6 == null) {
            C89219l.m154710a("mSaveView");
        }
        C2.mo114803a(C88297u.C88298a.m153445a(C0643b.m2378c(view6.getContext(), R.color.a2), ((int) C13628n.m24520b(this.f52549m, 52.0f)) + C70636dh.m124833c(this.f52549m), (int) C13628n.m24520b(this.f52549m, 282.0f), m96767F(), C33398a.f79357a.mo59453d()));
    }

    /* renamed from: a */
    public final void mo87761a(boolean z, int i) {
        C1213t<C88296t> tVar = this.f119881j;
        if (tVar == null) {
            C89219l.m154710a("mPreviewControlOpLiveData");
        }
        tVar.setValue(C88296t.m153437b());
        AbstractC31071f fVar = this.f119873b;
        if (fVar != null) {
            fVar.mo56392w();
            mo87757a().setValue(Long.valueOf((long) fVar.mo56370k()));
        }
        this.f119876e.cancel();
        View view = this.f119884t;
        if (view == null) {
            C89219l.m154710a("mPlayView");
        }
        view.setVisibility(0);
        if (this.f119887w) {
            this.f119887w = false;
            FTCAudioRecordStartButton fTCAudioRecordStartButton = this.f119886v;
            if (fTCAudioRecordStartButton == null) {
                C89219l.m154710a("audioRecordStartButton");
            }
            fTCAudioRecordStartButton.mo87723a();
        }
        if (this.f119888x) {
            this.f119888x = false;
            FTCAudioRecordStartButton fTCAudioRecordStartButton2 = this.f119886v;
            if (fTCAudioRecordStartButton2 == null) {
                C89219l.m154710a("audioRecordStartButton");
            }
            fTCAudioRecordStartButton2.mo87724b();
        }
        if (this.f119877f) {
            C52046f fVar2 = this.f119846A;
            if (fVar2 != null) {
                if (z) {
                    Point point = this.f119880i;
                    if (point != null) {
                        point.setY(this.f119874c);
                    }
                    fVar2.f119919a.mo130152a(null);
                } else {
                    int a = (int) fVar2.f119919a.mo130152a(null);
                    if (i == -1) {
                        i = a;
                    }
                    Point point2 = this.f119880i;
                    if (point2 != null) {
                        point2.setY(i);
                    }
                    C1213t<C88296t> tVar2 = this.f119881j;
                    if (tVar2 == null) {
                        C89219l.m154710a("mPreviewControlOpLiveData");
                    }
                    tVar2.setValue(C88296t.m153438b((long) i));
                    C52013b bVar = this.f119885u;
                    if (bVar == null) {
                        C89219l.m154710a("audioRecordSeekBar");
                    }
                    bVar.mo87747a(((float) i) / ((float) this.f119874c));
                }
                C52013b bVar2 = this.f119885u;
                if (bVar2 == null) {
                    C89219l.m154710a("audioRecordSeekBar");
                }
                bVar2.f119823b.invalidate();
            }
            this.f119877f = false;
            Point point3 = this.f119880i;
            if (point3 != null) {
                mo87757a().setValue(Long.valueOf((long) point3.getY()));
            }
        }
        this.f119878g = false;
        AudioRecorderParam audioRecorderParam = this.f119847B;
        C52013b bVar3 = this.f119885u;
        if (bVar3 == null) {
            C89219l.m154710a("audioRecordSeekBar");
        }
        audioRecorderParam.setMStack(bVar3.getStack());
        if (this.f119847B.getMStack().isEmpty()) {
            View view2 = this.f119889y;
            if (view2 == null) {
                C89219l.m154710a("backView");
            }
            view2.setVisibility(8);
        } else {
            View view3 = this.f119889y;
            if (view3 == null) {
                C89219l.m154710a("backView");
            }
            view3.setVisibility(0);
        }
        AVDmtTextView aVDmtTextView = this.f119890z;
        if (aVDmtTextView == null) {
            C89219l.m154710a("tvMsg");
        }
        aVDmtTextView.setVisibility(0);
        LottieAnimationView lottieAnimationView = this.f119864T;
        if (lottieAnimationView == null) {
            C89219l.m154710a("lottieAnimationView");
        }
        lottieAnimationView.setVisibility(4);
        LottieAnimationView lottieAnimationView2 = this.f119864T;
        if (lottieAnimationView2 == null) {
            C89219l.m154710a("lottieAnimationView");
        }
        lottieAnimationView2.mo5836d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ftc.components.audiorecord.e$d */
    public static final class CallableC52024d<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ Runnable f119895a;

        static {
            Covode.recordClassIndex(61399);
        }

        CallableC52024d(Runnable runnable) {
            this.f119895a = runnable;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            this.f119895a.run();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.audiorecord.e$p */
    static final class C52036p extends AbstractC89220m implements AbstractC89171a<C1213t<Boolean>> {

        /* renamed from: a */
        public static final C52036p f119908a = new C52036p();

        static {
            Covode.recordClassIndex(61411);
        }

        C52036p() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<Boolean> invoke() {
            return new C1213t();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.audiorecord.e$t */
    static final class C52040t extends AbstractC89220m implements AbstractC89171a<C1213t<Long>> {

        /* renamed from: a */
        public static final C52040t f119912a = new C52040t();

        static {
            Covode.recordClassIndex(61415);
        }

        C52040t() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<Long> invoke() {
            return new C1213t();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ftc.components.audiorecord.e$u */
    public static final class CallableC52041u<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ Runnable f119913a;

        static {
            Covode.recordClassIndex(61416);
        }

        CallableC52041u(Runnable runnable) {
            this.f119913a = runnable;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            this.f119913a.run();
            return C89391z.f203057a;
        }
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

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: w */
    public final void mo36490w() {
        this.f119879h = false;
        super.mo36490w();
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: n_ */
    public final void mo22713n_() {
        super.mo22713n_();
        this.f119876e.cancel();
        this.f119849D.removeCallbacksAndMessages(null);
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.audiorecord.e$a */
    public static final class C52021a extends AbstractC89220m implements AbstractC89171a<AbstractC72510a> {

        /* renamed from: a */
        final /* synthetic */ C52020e f119891a;

        static {
            Covode.recordClassIndex(61396);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C52021a(C52020e eVar) {
            super(0);
            this.f119891a = eVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.shortvideo.preview.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a invoke() {
            /*
                r2 = this;
                com.ss.android.ugc.aweme.ftc.components.audiorecord.e r0 = r2.f119891a
                androidx.fragment.app.e r0 = com.bytedance.scene.ktx.C22228c.m41832b(r0)
                com.bytedance.als.ApiCenter r1 = com.bytedance.als.ApiCenter.C2545a.m7450a(r0)
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.preview.a> r0 = com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a.class
                com.bytedance.als.b r0 = r1.mo7013a(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ftc.components.audiorecord.C52020e.C52021a.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: E */
    private final void m96766E() {
        RunnableC52042v vVar = new RunnableC52042v(this);
        this.f119846A = new C52046f();
        C1731i.m5640b(new CallableC52041u(vVar), C40780g.m82241a());
    }

    /* renamed from: F */
    private final int m96767F() {
        return ((C70636dh.m124836e(this.f52549m) - ((int) C13628n.m24520b(this.f52549m, 334.0f))) - C70636dh.m124833c(this.f52549m)) - C70636dh.m124835d(this.f52549m);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ftc.components.audiorecord.e$e */
    public static final class RunnableC52025e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C52020e f119896a;

        /* renamed from: b */
        final /* synthetic */ String f119897b;

        static {
            Covode.recordClassIndex(61400);
        }

        RunnableC52025e(C52020e eVar, String str) {
            this.f119896a = eVar;
            this.f119897b = str;
        }

        public final void run() {
            this.f119896a.f119848C = false;
            this.f119896a.f119849D.sendEmptyMessage(1);
            if (!C89361p.m154876c(this.f119897b, "df", false)) {
                C80720e.m139931c(this.f119897b);
            }
            this.f119896a.f119849D.sendEmptyMessage(4);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public final void mo87756D() {
        AudioRecorderParam audioRecorderParam = this.f119847B;
        C52013b bVar = this.f119885u;
        if (bVar == null) {
            C89219l.m154710a("audioRecordSeekBar");
        }
        audioRecorderParam.setMStack(bVar.getStack());
        Boolean value = mo87762b().getValue();
        if (value != null) {
            AudioRecorderParam audioRecorderParam2 = this.f119847B;
            C89219l.m154716b(value, "");
            audioRecorderParam2.setNeedOriginalSound(value.booleanValue());
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: x */
    public final void mo36491x() {
        super.mo36491x();
        if (this.f119877f) {
            new PrivacyCert(new C13349j("1085"), "Dubbing when editing a video.", new C13350k[]{C13401b.m24108b()});
            m96769a(this, false, 0, 3);
        }
        this.f119879h = true;
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.audiorecord.e$b */
    public static final class C52022b extends AbstractC89220m implements AbstractC89171a<FTCEditAudioRecordViewModel> {

        /* renamed from: a */
        final /* synthetic */ AbstractC22219j f119892a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f119893b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f119894c;

        static {
            Covode.recordClassIndex(61397);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C52022b(AbstractC22219j jVar, AbstractC89277c cVar, AbstractC89277c cVar2) {
            super(0);
            this.f119892a = jVar;
            this.f119893b = cVar;
            this.f119894c = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [com.ss.android.ugc.aweme.ftc.components.audiorecord.FTCEditAudioRecordViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v15, types: [com.ss.android.ugc.aweme.ftc.components.audiorecord.FTCEditAudioRecordViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 2 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.ftc.components.audiorecord.FTCEditAudioRecordViewModel invoke() {
            /*
                r6 = this;
                com.bytedance.scene.j r0 = r6.f119892a
                com.bytedance.scene.j r5 = r0.f52551o
                h.k.c r0 = r6.f119894c
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                java.lang.String r3 = r0.getCanonicalName()
                java.lang.String r4 = ""
                p4600h.p4611f.p4613b.C89219l.m154716b(r3, r4)
            L_0x0013:
                if (r5 == 0) goto L_0x003a
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ad r2 = com.bytedance.scene.C22267s.m41934a(r5, r0)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.f119894c     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)     // Catch:{ as -> 0x0035 }
                java.lang.String r1 = r0.getCanonicalName()     // Catch:{ as -> 0x0035 }
                p4600h.p4611f.p4613b.C89219l.m154716b(r1, r4)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.f119893b     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ac r0 = m96793xa91062d5(r2, r1, r0)     // Catch:{ as -> 0x0035 }
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0     // Catch:{ as -> 0x0035 }
                goto L_0x0038
            L_0x0035:
                com.bytedance.scene.j r5 = r5.f52551o
                goto L_0x0013
            L_0x0038:
                if (r0 != 0) goto L_0x0052
            L_0x003a:
                com.bytedance.scene.j r0 = r6.f119892a
                androidx.fragment.app.e r1 = com.bytedance.scene.ktx.C22228c.m41832b(r0)
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a
                androidx.lifecycle.ad r1 = androidx.lifecycle.C1181ae.m3881a(r1, r0)
                h.k.c r0 = r6.f119893b
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                androidx.lifecycle.ac r0 = m96793xa91062d5(r1, r3, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0052:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ftc.components.audiorecord.C52020e.C52022b.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_ftc_components_audiorecord_FTCEditAudioRecordScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m96793xa91062d5(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ftc.components.audiorecord.e$v */
    public static final class RunnableC52042v implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C52020e f119914a;

        static {
            Covode.recordClassIndex(61417);
        }

        RunnableC52042v(C52020e eVar) {
            this.f119914a = eVar;
        }

        public final void run() {
            this.f119914a.f119849D.sendEmptyMessage(1);
            new File(C70638dj.f158111n).mkdirs();
            String str = C70638dj.f158111n + System.currentTimeMillis() + ".wav";
            String str2 = C70638dj.f158111n;
            C89219l.m154716b(str2, "");
            C52020e.m96770a(str2, this.f119914a.f119847B.getAudioUrl());
            if (this.f119914a.f119847B.hasRecord()) {
                C80720e.m139932c(this.f119914a.f119847B.getAudioUrl(), str);
                C52046f fVar = this.f119914a.f119846A;
                if (fVar != null) {
                    VEAudioEncodeSettings a = new VEAudioEncodeSettings.C85194a().mo130147a();
                    C89219l.m154716b(a, "");
                    C89219l.m154721d(str, "");
                    C89219l.m154721d(a, "");
                    fVar.f119919a.mo130150a(str, a);
                }
                AudioRecorderParam audioRecorderParam = this.f119914a.f119847B;
                C52046f fVar2 = this.f119914a.f119846A;
                if (fVar2 == null) {
                    C89219l.m154715b();
                }
                audioRecorderParam.setAudioUrl(fVar2.mo87777a());
            } else {
                AbstractC31071f fVar3 = this.f119914a.f119873b;
                if (fVar3 != null) {
                    new File(C70638dj.f158111n).mkdirs();
                    String str3 = C70638dj.f158111n + System.currentTimeMillis() + ".wav";
                    C52046f fVar4 = this.f119914a.f119846A;
                    if (fVar4 != null) {
                        int j = fVar3.mo56368j();
                        VEAudioEncodeSettings a2 = new VEAudioEncodeSettings.C85194a().mo130147a();
                        C89219l.m154716b(a2, "");
                        C89219l.m154721d(str3, "");
                        C89219l.m154721d(a2, "");
                        fVar4.f119919a.mo130151a(str3, a2, j);
                    }
                    AudioRecorderParam audioRecorderParam2 = this.f119914a.f119847B;
                    C52046f fVar5 = this.f119914a.f119846A;
                    if (fVar5 == null) {
                        C89219l.m154715b();
                    }
                    audioRecorderParam2.setAudioUrl(fVar5.mo87777a());
                }
            }
            this.f119914a.f119849D.sendEmptyMessage(2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.audiorecord.e$f */
    public static final class C52026f extends AbstractView$OnClickListenerC81432d {

        /* renamed from: a */
        final /* synthetic */ C52020e f119898a;

        static {
            Covode.recordClassIndex(61401);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52026f(C52020e eVar) {
            this.f119898a = eVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d
        /* renamed from: a */
        public final void mo77200a(View view) {
            String audioUrl;
            String str = "";
            C89219l.m154721d(view, str);
            if (this.f119898a.f119848C) {
                int id = view.getId();
                if (id == R.id.et8) {
                    C52020e eVar = this.f119898a;
                    if (eVar.f119877f || eVar.f119878g) {
                        new PrivacyCert(new C13349j("1079"), "Dubbing when editing a video.", new C13350k[]{C13401b.m24108b()});
                        C52020e.m96769a(eVar, false, 0, 3);
                    }
                    eVar.mo87756D();
                    if (eVar.f119847B.hasChange(eVar.mo87764d().veAudioRecorderParam)) {
                        C17197a.C17200a aVar = new C17197a.C17200a(eVar.f52549m);
                        aVar.mo27189a(R.string.awy).mo27195b(R.string.ax3, (DialogInterface.OnClickListener) DialogInterface$OnClickListenerC52043w.f119915a, false).mo27190a(R.string.ax2, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC52044x(eVar), false);
                        aVar.mo27193a().mo27184b();
                        return;
                    }
                    eVar.mo87758a(eVar.mo87764d().musicVolume, eVar.mo87764d().voiceVolume);
                    eVar.mo87759a(eVar.f119847B.getAudioUrl());
                    if (eVar.mo87764d().veAudioRecorderParam != null && eVar.mo87764d().veAudioRecorderParam.hasRecord() && eVar.mo87764d().veAudioRecorderParam.getAudioRecordIndex() == -2) {
                        AbstractC72510a C = eVar.mo87755C();
                        AudioRecorderParam audioRecorderParam = eVar.mo87764d().veAudioRecorderParam;
                        C89219l.m154716b(audioRecorderParam, str);
                        C70926h.m125230a(C, audioRecorderParam);
                    }
                } else if (id == R.id.f2x) {
                    C52020e eVar2 = this.f119898a;
                    if (eVar2.f119877f || eVar2.f119878g) {
                        new PrivacyCert(new C13349j("1080"), "Dubbing when editing a video.", new C13350k[]{C13401b.m24108b()});
                        C52020e.m96769a(eVar2, false, 0, 3);
                    }
                    eVar2.mo87756D();
                    if (eVar2.f119846A != null) {
                        eVar2.mo87758a(eVar2.mo87764d().musicVolume, eVar2.mo87764d().voiceVolume);
                        if (eVar2.f119847B.getAudioRecordIndex() < 0 && eVar2.f119847B.hasRecord()) {
                            C70926h.m125230a(eVar2.mo87755C(), eVar2.f119847B);
                        }
                    }
                    if (eVar2.mo87764d().veAudioRecorderParam == null) {
                        eVar2.mo87764d().veAudioRecorderParam = new AudioRecorderParam();
                        audioUrl = str;
                    } else {
                        audioUrl = eVar2.mo87764d().veAudioRecorderParam.getAudioUrl();
                    }
                    eVar2.mo87764d().veAudioRecorderParam.copyFrom(eVar2.f119847B);
                    if (C89361p.m154876c(audioUrl, "df", false)) {
                        eVar2.mo87764d().veAudioRecorderParam.setExtraUrl(audioUrl);
                    } else {
                        str = audioUrl;
                    }
                    eVar2.f119847B.getNeedOriginalSound();
                    eVar2.mo87759a(str);
                } else if (id == R.id.fea) {
                    C52020e eVar3 = this.f119898a;
                    new PrivacyCert(new C13349j("1083"), "Dubbing when editing a video.", new C13350k[]{C13401b.m24108b()});
                    C52020e.m96769a(eVar3, false, 0, 3);
                } else if (id == R.id.pv) {
                    C52020e eVar4 = this.f119898a;
                    if (eVar4.f119877f || eVar4.f119878g) {
                        new PrivacyCert(new C13349j("1084"), "Dubbing when editing a video.", new C13350k[]{C13401b.m24108b()});
                        C52020e.m96769a(eVar4, false, 0, 3);
                    }
                    eVar4.f119847B.setNeedDel(true);
                    C70926h.m125230a(eVar4.mo87755C(), eVar4.f119847B);
                    C52013b bVar = eVar4.f119885u;
                    if (bVar == null) {
                        C89219l.m154710a("audioRecordSeekBar");
                    }
                    if (!bVar.f119823b.getMStack().empty()) {
                        Point pop = bVar.f119823b.getMStack().pop();
                        bVar.f119823b.invalidate();
                        if (pop != null) {
                            float x = ((float) pop.getX()) / ((float) eVar4.f119874c);
                            pop.setY(pop.getY() + 100);
                            if (pop.getY() > eVar4.f119874c) {
                                pop.setY(eVar4.f119874c);
                            }
                            C52046f fVar = eVar4.f119846A;
                            if (fVar != null) {
                                fVar.f119919a.mo130148a(pop.getX(), pop.getY());
                            }
                            eVar4.f119850E.mo87772a(x, true);
                            C52013b bVar2 = eVar4.f119885u;
                            if (bVar2 == null) {
                                C89219l.m154710a("audioRecordSeekBar");
                            }
                            bVar2.mo87747a(x);
                            AudioRecorderParam audioRecorderParam2 = eVar4.f119847B;
                            C52013b bVar3 = eVar4.f119885u;
                            if (bVar3 == null) {
                                C89219l.m154710a("audioRecordSeekBar");
                            }
                            audioRecorderParam2.setMStack(bVar3.getStack());
                            if (eVar4.f119847B.getMStack().isEmpty()) {
                                View view2 = eVar4.f119889y;
                                if (view2 == null) {
                                    C89219l.m154710a("backView");
                                }
                                view2.setVisibility(8);
                            }
                        }
                    }
                } else if (id == R.id.byg) {
                    this.f119898a.mo87763b(false);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.audiorecord.e$g */
    public static final class C52027g extends AbstractView$OnClickListenerC81432d {

        /* renamed from: a */
        final /* synthetic */ C52020e f119899a;

        static {
            Covode.recordClassIndex(61402);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52027g(C52020e eVar) {
            this.f119899a = eVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d
        /* renamed from: a */
        public final void mo77200a(View view) {
            C89219l.m154721d(view, "");
            if (this.f119899a.f119888x) {
                this.f119899a.f119888x = false;
                C52020e.m96772b(this.f119899a).mo87724b();
                C52020e eVar = this.f119899a;
                new PrivacyCert(new C13349j("1081"), "Dubbing when editing a video.", new C13350k[]{C13401b.m24108b()});
                C52020e.m96769a(eVar, false, 0, 3);
            } else if (!this.f119899a.f119879h) {
                this.f119899a.f119888x = true;
                FTCAudioRecordStartButton.C52004a aVar = C52020e.m96772b(this.f119899a).f119799b;
                if (aVar == null) {
                    C89219l.m154710a("centerView");
                }
                aVar.f119803b.end();
                aVar.f119804c.start();
                C52020e eVar2 = this.f119899a;
                new PrivacyCert(new C13349j("1075"), "Dubbing when editing a video.", new C13350k[]{C13401b.m24108b()});
                eVar2.mo87763b(true);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.audiorecord.e$k */
    static final class C52031k implements AbstractC72001h {

        /* renamed from: a */
        final /* synthetic */ C71991a f119903a;

        static {
            Covode.recordClassIndex(61406);
        }

        C52031k(C71991a aVar) {
            this.f119903a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.p3841a.AbstractC72001h
        /* renamed from: a */
        public final void mo78808a(List<Bitmap> list) {
            this.f119903a.mo114165a(list);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.audiorecord.e$o */
    public static final class C52035o implements AbstractC84917a {

        /* renamed from: a */
        final /* synthetic */ C52020e f119907a;

        static {
            Covode.recordClassIndex(61410);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52035o(C52020e eVar) {
            this.f119907a = eVar;
        }

        @Override // com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84917a
        public final boolean onKeyDown(int i, KeyEvent keyEvent) {
            if (i != 4 || !this.f119907a.mo36460z()) {
                return false;
            }
            C52020e.m96775e(this.f119907a).performClick();
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.audiorecord.e$s */
    public static final class C52039s implements AbstractC52047g {

        /* renamed from: a */
        final /* synthetic */ C52020e f119911a;

        static {
            Covode.recordClassIndex(61414);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52039s(C52020e eVar) {
            this.f119911a = eVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.ftc.components.audiorecord.AbstractC52047g
        /* renamed from: a */
        public final void mo87772a(float f, boolean z) {
            int i;
            long j;
            long j2 = (long) (((float) this.f119911a.f119874c) * f);
            AbstractC31071f fVar = this.f119911a.f119873b;
            if (fVar != null) {
                i = fVar.mo56246G();
            } else {
                i = 0;
            }
            int i2 = (int) (((float) i) * f);
            AbstractC31071f fVar2 = this.f119911a.f119873b;
            if (fVar2 != null) {
                j = (long) fVar2.mo56386s(i2);
            } else {
                j = 0;
            }
            this.f119911a.f119875d = f;
            if (z) {
                this.f119911a.f119880i = null;
                C52020e.m96776f(this.f119911a).setValue(C88296t.m153438b(j));
                C52020e.m96776f(this.f119911a).setValue(C88296t.m153437b());
                C52020e.m96777g(this.f119911a).setVisibility(0);
            } else {
                C52020e.m96776f(this.f119911a).setValue(C88296t.m153436a(j));
                C52020e.m96776f(this.f119911a).setValue(C88296t.m153437b());
                C52020e.m96777g(this.f119911a).setVisibility(4);
            }
            this.f119911a.mo87757a().setValue(Long.valueOf(j2));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.audiorecord.e$j */
    static final class C52030j implements C71993c.AbstractC71996b {

        /* renamed from: a */
        public static final C52030j f119902a = new C52030j();

        static {
            Covode.recordClassIndex(61405);
        }

        C52030j() {
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.p3841a.C71993c.AbstractC71996b
        /* renamed from: a */
        public final void mo78807a(String str) {
            C63244g.m114602a().mo73263I().mo101628a(str);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C52013b m96768a(C52020e eVar) {
        C52013b bVar = eVar.f119885u;
        if (bVar == null) {
            C89219l.m154710a("audioRecordSeekBar");
        }
        return bVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ FTCAudioRecordStartButton m96772b(C52020e eVar) {
        FTCAudioRecordStartButton fTCAudioRecordStartButton = eVar.f119886v;
        if (fTCAudioRecordStartButton == null) {
            C89219l.m154710a("audioRecordStartButton");
        }
        return fTCAudioRecordStartButton;
    }

    /* renamed from: c */
    public static final /* synthetic */ AVDmtTextView m96773c(C52020e eVar) {
        AVDmtTextView aVDmtTextView = eVar.f119890z;
        if (aVDmtTextView == null) {
            C89219l.m154710a("tvMsg");
        }
        return aVDmtTextView;
    }

    /* renamed from: d */
    public static final /* synthetic */ View m96774d(C52020e eVar) {
        View view = eVar.f119889y;
        if (view == null) {
            C89219l.m154710a("backView");
        }
        return view;
    }

    /* renamed from: e */
    public static final /* synthetic */ View m96775e(C52020e eVar) {
        View view = eVar.f119883l;
        if (view == null) {
            C89219l.m154710a("mCancelView");
        }
        return view;
    }

    /* renamed from: f */
    public static final /* synthetic */ C1213t m96776f(C52020e eVar) {
        C1213t<C88296t> tVar = eVar.f119881j;
        if (tVar == null) {
            C89219l.m154710a("mPreviewControlOpLiveData");
        }
        return tVar;
    }

    /* renamed from: g */
    public static final /* synthetic */ View m96777g(C52020e eVar) {
        View view = eVar.f119884t;
        if (view == null) {
            C89219l.m154710a("mPlayView");
        }
        return view;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af> S1 getState(VM1 vm1) {
        C89219l.m154721d(vm1, "");
        return (S1) AbstractC20382b.C20383a.m38582a(this, vm1);
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.audiorecord.e$h */
    static final class View$OnLongClickListenerC52028h implements View.OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ C52020e f119900a;

        static {
            Covode.recordClassIndex(61403);
        }

        View$OnLongClickListenerC52028h(C52020e eVar) {
            this.f119900a = eVar;
        }

        public final boolean onLongClick(View view) {
            this.f119900a.f119887w = true;
            FTCAudioRecordStartButton b = C52020e.m96772b(this.f119900a);
            b.f119801d.end();
            b.f119800c.start();
            C52020e eVar = this.f119900a;
            new PrivacyCert(new C13349j("1076"), "Dubbing when editing a video.", new C13350k[]{C13401b.m24108b()});
            eVar.mo87763b(true);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ftc.components.audiorecord.e$y */
    public static final class C52045y<T> implements AbstractC0688a {

        /* renamed from: a */
        final /* synthetic */ C52020e f119917a;

        /* renamed from: b */
        final /* synthetic */ boolean f119918b;

        static {
            Covode.recordClassIndex(61420);
        }

        C52045y(C52020e eVar, boolean z) {
            this.f119917a = eVar;
            this.f119918b = z;
        }

        @Override // androidx.core.p036g.AbstractC0688a
        /* renamed from: a */
        public final /* synthetic */ void mo2720a(Object obj) {
            if (this.f119918b) {
                View view = this.f119917a.f119882k;
                if (view == null) {
                    C89219l.m154710a("mSaveView");
                }
                view.setVisibility(0);
                C52020e.m96775e(this.f119917a).setVisibility(0);
                return;
            }
            AbstractC22186b bVar = (AbstractC22186b) this.f119917a.f52551o;
            if (bVar != null) {
                bVar.mo36413d(this.f119917a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.audiorecord.e$l */
    static final class C52032l<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C52020e f119904a;

        static {
            Covode.recordClassIndex(61407);
        }

        C52032l(C52020e eVar) {
            this.f119904a = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Long l = (Long) obj;
            if (l != null) {
                l.longValue();
                C52013b a = C52020e.m96768a(this.f119904a);
                int longValue = (int) l.longValue();
                if (longValue < a.f119829h - 1) {
                    Iterator<T> it = a.f119823b.getMStack().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        T next = it.next();
                        if (longValue >= next.getX() && longValue < next.getY()) {
                            longValue = next.getX();
                            break;
                        }
                    }
                }
                if (-1 != longValue) {
                    if (!this.f119904a.f119877f) {
                        FTCAudioRecordStartButton b = C52020e.m96772b(this.f119904a);
                        b.setAlpha(0.5f);
                        b.setEnabled(false);
                        C52020e.m96773c(this.f119904a).setText(R.string.awx);
                        return;
                    }
                    return;
                }
                FTCAudioRecordStartButton b2 = C52020e.m96772b(this.f119904a);
                b2.setAlpha(1.0f);
                b2.setEnabled(true);
                C52020e.m96773c(this.f119904a).setText(R.string.axt);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.audiorecord.e$m */
    static final class C52033m<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C52020e f119905a;

        static {
            Covode.recordClassIndex(61408);
        }

        C52033m(C52020e eVar) {
            this.f119905a = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                bool.booleanValue();
                if (bool.booleanValue()) {
                    this.f119905a.mo87764d().voiceVolume = this.f119905a.f119847B.getVoiceVolume();
                } else {
                    this.f119905a.mo87764d().voiceVolume = 0.0f;
                }
                this.f119905a.f119847B.setNeedOriginalSound(bool.booleanValue());
                if (this.f119905a.f119878g && !this.f119905a.f119877f) {
                    C52020e eVar = this.f119905a;
                    eVar.mo87758a(-1.0f, eVar.mo87764d().voiceVolume);
                }
            }
        }
    }

    public C52020e(C21582f fVar) {
        C89219l.m154721d(fVar, "");
        this.f119872ab = fVar;
        ValueAnimator ofInt = ValueAnimator.ofInt(1, 10);
        C89219l.m154716b(ofInt, "");
        this.f119876e = ofInt;
        this.f119879h = true;
        this.f119854J = C21572a.m40504a(getDiContainer(), VideoPublishEditModel.class);
        this.f119855K = C89250i.m154774a(EnumC89331m.NONE, new C52021a(this));
        AbstractC89277c a = C89204ab.m154669a(FTCEditAudioRecordViewModel.class);
        this.f119856L = C89250i.m154773a((AbstractC89171a) new C52022b(this, a, a));
        this.f119847B = new AudioRecorderParam();
        this.f119848C = true;
        this.f119849D = new WeakHandler(this);
        this.f119850E = new C52039s(this);
        this.f119870Z = new C52035o(this);
        this.f119871aa = new C52026f(this);
    }

    /* renamed from: a */
    private static boolean m96771a(File file) {
        MethodCollector.m26663i(12092);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(12092);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(12092);
        return delete;
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        C89219l.m154721d(message, "");
        int i = message.what;
        if (i == 1) {
            this.f119848C = false;
            View view = this.f119859O;
            if (view == null) {
                C89219l.m154710a("mLoadingStatusViewLayout");
            }
            view.setVisibility(0);
            DmtStatusView dmtStatusView = this.f119858N;
            if (dmtStatusView == null) {
                C89219l.m154710a("mLoadingStatusView");
            }
            DmtStatusView.C17269a a = DmtStatusView.C17269a.m31905a(this.f52549m);
            a.f41304g = 1;
            dmtStatusView.setBuilder(a);
            DmtStatusView dmtStatusView2 = this.f119858N;
            if (dmtStatusView2 == null) {
                C89219l.m154710a("mLoadingStatusView");
            }
            dmtStatusView2.mo27384f();
        } else if (i == 2) {
            this.f119848C = true;
            DmtStatusView dmtStatusView3 = this.f119858N;
            if (dmtStatusView3 == null) {
                C89219l.m154710a("mLoadingStatusView");
            }
            dmtStatusView3.mo27379a(true);
            View view2 = this.f119859O;
            if (view2 == null) {
                C89219l.m154710a("mLoadingStatusViewLayout");
            }
            view2.setVisibility(8);
        } else if (i == 4) {
            this.f119848C = true;
            DmtStatusView dmtStatusView4 = this.f119858N;
            if (dmtStatusView4 == null) {
                C89219l.m154710a("mLoadingStatusView");
            }
            dmtStatusView4.mo27379a(true);
            View view3 = this.f119859O;
            if (view3 == null) {
                C89219l.m154710a("mLoadingStatusViewLayout");
            }
            view3.setVisibility(8);
            ((FTCEditAudioRecordViewModel) this.f119856L.getValue()).f119813a.setValue(false);
            AbstractC31071f fVar = this.f119873b;
            if (fVar != null) {
                fVar.mo56311a(true);
            }
            C1213t<C88296t> tVar = this.f119881j;
            if (tVar == null) {
                C89219l.m154710a("mPreviewControlOpLiveData");
            }
            tVar.setValue(C88296t.m153435a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.audiorecord.e$n */
    static final class C52034n implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C52020e f119906a;

        static {
            Covode.recordClassIndex(61409);
        }

        C52034n(C52020e eVar) {
            this.f119906a = eVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            int i;
            int i2;
            AbstractC31071f fVar = this.f119906a.f119873b;
            if (fVar != null) {
                this.f119906a.mo87757a().setValue(Long.valueOf((long) fVar.mo56370k()));
                C52020e.m96768a(this.f119906a).mo87747a(((float) fVar.mo56370k()) / ((float) fVar.mo56368j()));
                if (this.f119906a.f119877f) {
                    C52013b a = C52020e.m96768a(this.f119906a);
                    int k = fVar.mo56370k();
                    Point point = this.f119906a.f119880i;
                    if (point != null) {
                        i = point.getX();
                    } else {
                        i = k;
                    }
                    Iterator<T> it = a.f119823b.getMStack().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            i2 = -1;
                            break;
                        }
                        T next = it.next();
                        int x = next.getX();
                        if (i <= x && k >= x && k <= next.getY() && (!C89219l.m154714a((Object) next, (Object) point))) {
                            i2 = next.getX();
                            break;
                        }
                    }
                    C52020e.m96768a(this.f119906a).f119823b.invalidate();
                    if (i2 == -1) {
                        Point point2 = this.f119906a.f119880i;
                        if (point2 != null) {
                            point2.setY(fVar.mo56370k());
                        }
                        C52020e.m96768a(this.f119906a).f119823b.invalidate();
                    } else {
                        Point point3 = this.f119906a.f119880i;
                        if (point3 != null) {
                            point3.setY(i2);
                        }
                        C52020e.m96768a(this.f119906a).f119823b.invalidate();
                        C52020e eVar = this.f119906a;
                        new PrivacyCert(new C13349j("1077"), "Dubbing when editing a video.", new C13350k[]{C13401b.m24108b()});
                        eVar.mo87761a(false, i2);
                    }
                } else {
                    this.f119906a.f119880i = null;
                }
                if (fVar.mo56370k() < this.f119906a.f119874c) {
                    return;
                }
                if (this.f119906a.f119877f) {
                    C52020e eVar2 = this.f119906a;
                    new PrivacyCert(new C13349j("1078"), "Dubbing when editing a video.", new C13350k[]{C13401b.m24108b()});
                    C52020e.m96769a(eVar2, true, 0, 2);
                    return;
                }
                this.f119906a.f119876e.cancel();
                this.f119906a.f119850E.mo87772a(0.0f, true);
                C52020e.m96768a(this.f119906a).mo87747a(0.0f);
                this.f119906a.f119847B.setMStack(C52020e.m96768a(this.f119906a).getStack());
                if (this.f119906a.f119847B.getMStack().isEmpty()) {
                    C52020e.m96774d(this.f119906a).setVisibility(8);
                } else {
                    C52020e.m96774d(this.f119906a).setVisibility(0);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo87763b(boolean z) {
        float f;
        AbstractC31071f fVar = this.f119873b;
        if (fVar != null) {
            View view = this.f119884t;
            if (view == null) {
                C89219l.m154710a("mPlayView");
            }
            view.setVisibility(4);
            int i = 0;
            float f2 = 0.0f;
            if (z) {
                this.f119847B.setNeedDel(true);
                C70926h.m125230a(mo87755C(), this.f119847B);
                AVDmtTextView aVDmtTextView = this.f119890z;
                if (aVDmtTextView == null) {
                    C89219l.m154710a("tvMsg");
                }
                aVDmtTextView.setVisibility(4);
                View view2 = this.f119889y;
                if (view2 == null) {
                    C89219l.m154710a("backView");
                }
                view2.setVisibility(4);
                LottieAnimationView lottieAnimationView = this.f119864T;
                if (lottieAnimationView == null) {
                    C89219l.m154710a("lottieAnimationView");
                }
                lottieAnimationView.mo5826a();
                LottieAnimationView lottieAnimationView2 = this.f119864T;
                if (lottieAnimationView2 == null) {
                    C89219l.m154710a("lottieAnimationView");
                }
                lottieAnimationView2.setVisibility(0);
                f = 0.0f;
            } else {
                this.f119878g = true;
                AudioRecorderParam audioRecorderParam = this.f119847B;
                C52013b bVar = this.f119885u;
                if (bVar == null) {
                    C89219l.m154710a("audioRecordSeekBar");
                }
                audioRecorderParam.setMStack(bVar.getStack());
                if ((!this.f119847B.getMStack().isEmpty()) && this.f119846A != null && this.f119847B.getAudioRecordIndex() < 0) {
                    C70926h.m125230a(mo87755C(), this.f119847B);
                }
                f = mo87764d().voiceVolume;
                f2 = mo87764d().musicVolume;
            }
            mo87758a(f2, f);
            if (z) {
                if (this.f119880i != null) {
                    C1213t<C88296t> tVar = this.f119881j;
                    if (tVar == null) {
                        C89219l.m154710a("mPreviewControlOpLiveData");
                    }
                    Point point = this.f119880i;
                    if (point == null) {
                        C89219l.m154715b();
                    }
                    tVar.setValue(C88296t.m153438b((long) point.getY()));
                    C52013b bVar2 = this.f119885u;
                    if (bVar2 == null) {
                        C89219l.m154710a("audioRecordSeekBar");
                    }
                    Point point2 = this.f119880i;
                    if (point2 == null) {
                        C89219l.m154715b();
                    }
                    this.f119880i = bVar2.mo87750b(point2.getY());
                } else {
                    int k = fVar.mo56370k();
                    if (k >= 50) {
                        i = k;
                    }
                    C52013b bVar3 = this.f119885u;
                    if (bVar3 == null) {
                        C89219l.m154710a("audioRecordSeekBar");
                    }
                    this.f119880i = bVar3.mo87750b(i);
                }
                this.f119877f = true;
                C52046f fVar2 = this.f119846A;
                if (fVar2 != null) {
                    int i2 = this.f119874c;
                    fVar2.f119919a.mo130149a(fVar.mo56370k() + 50, i2, (PrivacyCert) null);
                }
            }
            C1213t<C88296t> tVar2 = this.f119881j;
            if (tVar2 == null) {
                C89219l.m154710a("mPreviewControlOpLiveData");
            }
            tVar2.setValue(C88296t.m153435a());
            this.f119876e.start();
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo22704a(Bundle bundle) {
        C85581w.EnumC85602a aVar;
        MethodCollector.m26663i(11950);
        super.mo22704a(bundle);
        this.f119881j = mo87755C().mo114833v();
        AbstractC31071f value = mo87755C().mo114778C().getValue();
        this.f119873b = value;
        if (value != null) {
            this.f119874c = value.mo56368j();
        }
        View b = mo36474b(R.id.f2x);
        if (b == null) {
            C89219l.m154715b();
        }
        this.f119882k = b;
        View b2 = mo36474b(R.id.et8);
        if (b2 == null) {
            C89219l.m154715b();
        }
        this.f119883l = b2;
        View b3 = mo36474b(R.id.byg);
        if (b3 == null) {
            C89219l.m154715b();
        }
        this.f119884t = b3;
        View b4 = mo36474b(R.id.dtv);
        if (b4 == null) {
            C89219l.m154715b();
        }
        this.f119860P = (FrameLayout) b4;
        View b5 = mo36474b(R.id.fea);
        if (b5 == null) {
            C89219l.m154715b();
        }
        this.f119862R = b5;
        View b6 = mo36474b(R.id.ade);
        if (b6 == null) {
            C89219l.m154715b();
        }
        this.f119863S = (ViewGroup) b6;
        View b7 = mo36474b(R.id.e6m);
        if (b7 == null) {
            C89219l.m154715b();
        }
        this.f119886v = (FTCAudioRecordStartButton) b7;
        View b8 = mo36474b(R.id.pv);
        if (b8 == null) {
            C89219l.m154715b();
        }
        this.f119889y = b8;
        View b9 = mo36474b(R.id.ezl);
        if (b9 == null) {
            C89219l.m154715b();
        }
        AVDmtTextView aVDmtTextView = (AVDmtTextView) b9;
        this.f119890z = aVDmtTextView;
        if (aVDmtTextView == null) {
            C89219l.m154710a("tvMsg");
        }
        aVDmtTextView.mo121359b();
        View b10 = mo36474b(R.id.a26);
        if (b10 == null) {
            C89219l.m154715b();
        }
        CheckBox checkBox = (CheckBox) b10;
        this.f119865U = checkBox;
        if (checkBox == null) {
            C89219l.m154710a("checkBox");
        }
        checkBox.setText("  " + mo36476c_(R.string.awz));
        View b11 = mo36474b(R.id.cfy);
        if (b11 == null) {
            C89219l.m154715b();
        }
        this.f119858N = (DmtStatusView) b11;
        View b12 = mo36474b(R.id.cg0);
        if (b12 == null) {
            C89219l.m154715b();
        }
        this.f119859O = b12;
        if (b12 == null) {
            C89219l.m154710a("mLoadingStatusViewLayout");
        }
        b12.setOnClickListener(View$OnClickListenerC52037q.f119909a);
        View b13 = mo36474b(R.id.che);
        if (b13 == null) {
            C89219l.m154715b();
        }
        LottieAnimationView lottieAnimationView = (LottieAnimationView) b13;
        this.f119864T = lottieAnimationView;
        if (lottieAnimationView == null) {
            C89219l.m154710a("lottieAnimationView");
        }
        lottieAnimationView.setAnimation("tool_recording_dark_lottie.json");
        LottieAnimationView lottieAnimationView2 = this.f119864T;
        if (lottieAnimationView2 == null) {
            C89219l.m154710a("lottieAnimationView");
        }
        lottieAnimationView2.setRepeatCount(-1);
        C70982a.m125336a(this);
        View view = this.f119889y;
        if (view == null) {
            C89219l.m154710a("backView");
        }
        view.setBackgroundResource(R.drawable.d0);
        Activity activity = this.f52549m;
        if (activity != null) {
            C52013b bVar = new C52013b((ActivityC0945e) activity, this);
            this.f119885u = bVar;
            int b14 = (int) C13628n.m24520b(this.f52549m, 16.0f);
            int b15 = (int) C13628n.m24520b(this.f52549m, 6.0f);
            int i = this.f119874c;
            C52039s sVar = this.f119850E;
            bVar.f119824c = b14;
            bVar.f119825d = b15;
            bVar.f119826e = ((int) C13628n.m24520b(this.f52549m, 4.0f)) * 5;
            bVar.f119829h = i;
            bVar.f119830i = sVar;
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.bottomMargin = b15;
            layoutParams.topMargin = b15;
            layoutParams.rightMargin = b14;
            layoutParams.leftMargin = b14;
            C52011a aVar2 = bVar.f119823b;
            aVar2.f119817a = Color.parseColor("#ccfe2c55");
            aVar2.f119818b.setColor(aVar2.f119817a);
            aVar2.f119818b.setStyle(Paint.Style.FILL);
            aVar2.f119819c = i;
            aVar2.f119820d = C13628n.m24520b(aVar2.getContext(), 0.0f);
            bVar.addView(bVar.f119823b, layoutParams);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(bVar.f119826e, -1);
            if (C78099c.m136517a(bVar.getContext())) {
                layoutParams2.addRule(21);
                layoutParams2.setMarginEnd(b14 - (bVar.f119826e / 2));
            } else {
                layoutParams2.leftMargin = b14 - (bVar.f119826e / 2);
            }
            bVar.f119822a.setImageDrawable(C84916a.m145947a(0, -1, 1, (int) C13628n.m24520b(bVar.getContext(), 2.0f)));
            bVar.f119822a.setPadding((int) (((float) bVar.f119826e) * 0.4f), 0, (int) (((float) bVar.f119826e) * 0.4f), 0);
            bVar.addView(bVar.f119822a, layoutParams2);
            bVar.f119822a.setOnTouchListener(new C52013b.View$OnTouchListenerC52014a(bVar));
            FrameLayout frameLayout = this.f119860P;
            if (frameLayout == null) {
                C89219l.m154710a("seekLayout");
            }
            C52013b bVar2 = this.f119885u;
            if (bVar2 == null) {
                C89219l.m154710a("audioRecordSeekBar");
            }
            frameLayout.addView(bVar2, new FrameLayout.LayoutParams(-1, -1));
            View b16 = mo36474b(R.id.a5c);
            if (b16 == null) {
                C89219l.m154715b();
            }
            this.f119861Q = (ChooseVideoCoverView) b16;
            if (this.f52549m instanceof AbstractC84919c) {
                Activity activity2 = this.f52549m;
                if (activity2 != null) {
                    this.f119853I = (AbstractC84919c) activity2;
                } else {
                    NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.tools.view.activity.AVListenableActivityRegistry");
                    MethodCollector.m26664o(11950);
                    throw nullPointerException;
                }
            }
            this.f119869Y = mo87755C().mo114819h();
            this.f119868X = mo87755C().mo114820i();
            this.f119876e.setDuration(1000L);
            this.f119876e.setRepeatCount(-1);
            this.f119876e.addUpdateListener(new C52034n(this));
            View view2 = this.f119882k;
            if (view2 == null) {
                C89219l.m154710a("mSaveView");
            }
            view2.setOnClickListener(this.f119871aa);
            View view3 = this.f119883l;
            if (view3 == null) {
                C89219l.m154710a("mCancelView");
            }
            view3.setOnClickListener(this.f119871aa);
            View view4 = this.f119884t;
            if (view4 == null) {
                C89219l.m154710a("mPlayView");
            }
            view4.setOnClickListener(this.f119871aa);
            View view5 = this.f119862R;
            if (view5 == null) {
                C89219l.m154710a("videoLayout");
            }
            view5.setOnClickListener(this.f119871aa);
            View view6 = this.f119889y;
            if (view6 == null) {
                C89219l.m154710a("backView");
            }
            view6.setOnClickListener(this.f119871aa);
            FTCAudioRecordStartButton fTCAudioRecordStartButton = this.f119886v;
            if (fTCAudioRecordStartButton == null) {
                C89219l.m154710a("audioRecordStartButton");
            }
            fTCAudioRecordStartButton.setOnClickListener(new C52027g(this));
            FTCAudioRecordStartButton fTCAudioRecordStartButton2 = this.f119886v;
            if (fTCAudioRecordStartButton2 == null) {
                C89219l.m154710a("audioRecordStartButton");
            }
            fTCAudioRecordStartButton2.setOnLongClickListener(new View$OnLongClickListenerC52028h(this));
            FTCAudioRecordStartButton fTCAudioRecordStartButton3 = this.f119886v;
            if (fTCAudioRecordStartButton3 == null) {
                C89219l.m154710a("audioRecordStartButton");
            }
            fTCAudioRecordStartButton3.setOnTouchListener(new View$OnTouchListenerC52029i(this));
            mo87757a().observe(this, new C52032l(this));
            mo87762b().observe(this, new C52033m(this));
            CheckBox checkBox2 = this.f119865U;
            if (checkBox2 == null) {
                C89219l.m154710a("checkBox");
            }
            checkBox2.setOnCheckedChangeListener(new C52038r(this));
            AbstractC31071f fVar = this.f119873b;
            if (fVar == null) {
                MethodCollector.m26664o(11950);
                return;
            }
            ChooseVideoCoverView chooseVideoCoverView = this.f119861Q;
            if (chooseVideoCoverView == null) {
                C89219l.m154710a("mChooseVideoCoverView");
            }
            chooseVideoCoverView.mo116701a();
            ChooseVideoCoverView chooseVideoCoverView2 = this.f119861Q;
            if (chooseVideoCoverView2 == null) {
                C89219l.m154710a("mChooseVideoCoverView");
            }
            chooseVideoCoverView2.setLayoutManager(new WrapLinearLayoutManager((byte) 0));
            ChooseVideoCoverView chooseVideoCoverView3 = this.f119861Q;
            if (chooseVideoCoverView3 == null) {
                C89219l.m154710a("mChooseVideoCoverView");
            }
            int frameHeight = chooseVideoCoverView3.getFrameHeight();
            ChooseVideoCoverView chooseVideoCoverView4 = this.f119861Q;
            if (chooseVideoCoverView4 == null) {
                C89219l.m154710a("mChooseVideoCoverView");
            }
            int frameWidth = chooseVideoCoverView4.getFrameWidth();
            int ceil = (int) Math.ceil((double) (((float) (C13628n.m24504a(this.f52549m) - (C89241a.m154730a(C13628n.m24520b(this.f52549m, 16.0f)) * 2))) / (((float) frameWidth) * 1.0f)));
            ChooseVideoCoverView chooseVideoCoverView5 = this.f119861Q;
            if (chooseVideoCoverView5 == null) {
                C89219l.m154710a("mChooseVideoCoverView");
            }
            chooseVideoCoverView5.setCoverSize(ceil);
            if (C65374bn.m117070a()) {
                aVar = C85581w.EnumC85602a.GET_FRAMES_MODE_NORMAL;
            } else {
                aVar = C85581w.EnumC85602a.GET_FRAMES_MODE_NOEFFECT;
            }
            Activity activity3 = this.f52549m;
            if (activity3 != null) {
                ActivityC0945e eVar = (ActivityC0945e) activity3;
                ChooseVideoCoverView chooseVideoCoverView6 = this.f119861Q;
                if (chooseVideoCoverView6 == null) {
                    C89219l.m154710a("mChooseVideoCoverView");
                }
                this.f119866V = new VEVideoCoverGeneratorImpl(fVar, eVar, chooseVideoCoverView6.getCoverSize(), aVar, "ai_music");
                VEVideoCoverGeneratorImpl vEVideoCoverGeneratorImpl = this.f119866V;
                if (vEVideoCoverGeneratorImpl == null) {
                    C89219l.m154710a("mEffectVideoCoverGenerator");
                }
                this.f119867W = new C74297p(vEVideoCoverGeneratorImpl, frameWidth, frameHeight, ceil);
                if (mo87764d().isMvThemeVideoType()) {
                    C71991a aVar3 = new C71991a(frameWidth, frameHeight);
                    ChooseVideoCoverView chooseVideoCoverView7 = this.f119861Q;
                    if (chooseVideoCoverView7 == null) {
                        C89219l.m154710a("mChooseVideoCoverView");
                    }
                    chooseVideoCoverView7.setAdapter(aVar3);
                    C71993c cVar = new C71993c();
                    cVar.f161328b = C52030j.f119902a;
                    C1213t<Boolean> tVar = this.f119869Y;
                    if (tVar == null) {
                        C89219l.m154710a("firstFrameVisible");
                    }
                    cVar.f161339m = tVar;
                    C1213t<Bitmap> tVar2 = this.f119868X;
                    if (tVar2 == null) {
                        C89219l.m154710a("firstFrameBitmap");
                    }
                    cVar.f161338l = tVar2;
                    cVar.mo114167a(frameWidth, frameHeight).mo114168a(this.f52549m, this.f119873b, ceil, new C52031k(aVar3));
                    ChooseVideoCoverView chooseVideoCoverView8 = this.f119861Q;
                    if (chooseVideoCoverView8 == null) {
                        C89219l.m154710a("mChooseVideoCoverView");
                    }
                    chooseVideoCoverView8.setAdapter(aVar3);
                    MethodCollector.m26664o(11950);
                    return;
                }
                C74297p pVar = this.f119867W;
                if (pVar == null) {
                    C89219l.m154710a("mSharedVideoCoverDataSource");
                }
                ChooseVideoCoverView.C74231a aVar4 = new ChooseVideoCoverView.C74231a(pVar, frameWidth, frameHeight);
                ChooseVideoCoverView chooseVideoCoverView9 = this.f119861Q;
                if (chooseVideoCoverView9 == null) {
                    C89219l.m154710a("mChooseVideoCoverView");
                }
                chooseVideoCoverView9.setAdapter(aVar4);
                MethodCollector.m26664o(11950);
                return;
            }
            NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            MethodCollector.m26664o(11950);
            throw nullPointerException2;
        }
        NullPointerException nullPointerException3 = new NullPointerException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        MethodCollector.m26664o(11950);
        throw nullPointerException3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo87759a(String str) {
        C52046f fVar = this.f119846A;
        if (fVar != null) {
            fVar.f119919a.destory();
        }
        C1731i.m5640b(new CallableC52024d(new RunnableC52025e(this, str)), C40780g.m82241a());
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.audiorecord.e$w */
    static final class DialogInterface$OnClickListenerC52043w implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC52043w f119915a = new DialogInterface$OnClickListenerC52043w();

        static {
            Covode.recordClassIndex(61418);
        }

        DialogInterface$OnClickListenerC52043w() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.audiorecord.e$r */
    static final class C52038r implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ C52020e f119910a;

        static {
            Covode.recordClassIndex(61413);
        }

        C52038r(C52020e eVar) {
            this.f119910a = eVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            this.f119910a.mo87762b().setValue(Boolean.valueOf(z));
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20382b.C20383a.m38593a(this, vm1, bVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.audiorecord.e$i */
    static final class View$OnTouchListenerC52029i implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ C52020e f119901a;

        static {
            Covode.recordClassIndex(61404);
        }

        View$OnTouchListenerC52029i(C52020e eVar) {
            this.f119901a = eVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent != null && ((motionEvent.getAction() == 3 || motionEvent.getAction() == 1) && this.f119901a.f119887w)) {
                this.f119901a.f119887w = false;
                C52020e.m96772b(this.f119901a).mo87723a();
                C52020e eVar = this.f119901a;
                new PrivacyCert(new C13349j("1082"), "Dubbing when editing a video.", new C13350k[]{C13401b.m24108b()});
                C52020e.m96769a(eVar, false, 0, 3);
            }
            return false;
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.asp, viewGroup, false);
        C89219l.m154716b(a, "");
        this.f119857M = a;
        if (a == null) {
            C89219l.m154710a("parentLayout");
        }
        return a;
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.audiorecord.e$x */
    static final class DialogInterface$OnClickListenerC52044x implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C52020e f119916a;

        static {
            Covode.recordClassIndex(61419);
        }

        DialogInterface$OnClickListenerC52044x(C52020e eVar) {
            this.f119916a = eVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            C52020e eVar = this.f119916a;
            AudioRecorderParam audioRecorderParam = eVar.mo87764d().veAudioRecorderParam;
            if (eVar.f119847B.getAudioRecordIndex() >= 0 && eVar.f119847B.hasRecord()) {
                eVar.f119847B.setNeedDel(true);
                C70926h.m125230a(eVar.mo87755C(), eVar.f119847B);
            }
            if (audioRecorderParam != null) {
                if (audioRecorderParam.getAudioRecordIndex() < 0 && audioRecorderParam.hasRecord()) {
                    C70926h.m125230a(eVar.mo87755C(), audioRecorderParam);
                }
                if (audioRecorderParam.getNeedOriginalSound()) {
                    eVar.mo87764d().voiceVolume = audioRecorderParam.getVoiceVolume();
                } else {
                    eVar.mo87764d().voiceVolume = 0.0f;
                }
            } else {
                eVar.mo87764d().voiceVolume = eVar.f119847B.getVoiceVolume();
            }
            eVar.mo87758a(eVar.mo87764d().musicVolume, eVar.mo87764d().voiceVolume);
            eVar.mo87759a(eVar.f119847B.getAudioUrl());
        }
    }

    /* renamed from: a */
    public static void m96770a(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (file.exists() && file.isDirectory()) {
                File[] listFiles = file.listFiles();
                for (File file2 : listFiles) {
                    C89219l.m154716b(file2, "");
                    String path = file2.getPath();
                    C89219l.m154716b(path, "");
                    if (!C89361p.m154876c(path, "df", false) && !path.equals(str2)) {
                        m96771a(file2);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo87758a(float f, float f2) {
        if (mo87764d().isStitchMode()) {
            if (mo87764d().isMuted) {
                C82185a.m142209a(0.0f, f, mo87764d(), mo87755C());
            } else {
                C82185a.m142209a(f2, f, mo87764d(), mo87755C());
            }
        } else if ((mo87764d().isFastImport || mo87764d().hasOriginalSound()) && !mo87764d().isMuted) {
            if (f2 != -1.0f) {
                AbstractC72510a C = mo87755C();
                VEVolumeChangeOp ofVoice = VEVolumeChangeOp.ofVoice(f2);
                C89219l.m154716b(ofVoice, "");
                C.mo114800a(ofVoice);
            }
            if (mo87764d().mMusicPath != null && f != -1.0f) {
                AbstractC72510a C2 = mo87755C();
                VEVolumeChangeOp ofMusic = VEVolumeChangeOp.ofMusic(f);
                C89219l.m154716b(ofMusic, "");
                C2.mo114800a(ofMusic);
            }
        } else if (f != -1.0f) {
            AbstractC72510a C3 = mo87755C();
            VEVolumeChangeOp ofMusic2 = VEVolumeChangeOp.ofMusic(f);
            C89219l.m154716b(ofMusic2, "");
            C3.mo114800a(ofMusic2);
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af> AbstractC88412b subscribe(JediViewModel<S> jediViewModel, C20370ah<S> ahVar, AbstractC89183m<? super AbstractC20477i, ? super S, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20382b.C20383a.m38583a(this, jediViewModel, ahVar, mVar);
    }

    /* renamed from: a */
    static /* synthetic */ void m96769a(C52020e eVar, boolean z, int i, int i2) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        if ((i2 & 2) != 0) {
            i = -1;
        }
        eVar.mo87761a(z, i);
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
