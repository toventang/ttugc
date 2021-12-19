package com.p2082ss.android.ugc.aweme.ttep;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.content.C0643b;
import androidx.fragment.app.AbstractC0976n;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.als.AlsLogicContainer;
import com.bytedance.als.ApiCenter;
import com.bytedance.als.dsl.C2551b;
import com.bytedance.als.dsl.C2552c;
import com.bytedance.als.dsl.C2553d;
import com.bytedance.als.dsl.C2556g;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.common.utility.C13617h;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.filter.p942a.AbstractC14210a;
import com.bytedance.creativex.recorder.filter.p942a.AbstractC14217g;
import com.bytedance.creativex.recorder.filter.p943b.C14225c;
import com.bytedance.creativex.recorder.filter.p945d.C14243a;
import com.bytedance.creativex.recorder.p938a.C14117i;
import com.bytedance.creativex.recorder.p938a.p939a.AbstractC14099a;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14209z;
import com.bytedance.creativex.recorder.p940b.p941a.C14201t;
import com.bytedance.creativex.recorder.sticker.p947a.AbstractC14333c;
import com.bytedance.cukaie.closet.C14401a;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.dmt.p1194ui.p1200f.C17233a;
import com.bytedance.p1559o.AbstractC21603p;
import com.bytedance.p1559o.C21582f;
import com.bytedance.scene.AbstractC22233n;
import com.bytedance.scene.C22217i;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ttve.monitor.TEMonitorInvoker;
import com.p2082ss.android.ugc.asve.recorder.C31217m;
import com.p2082ss.android.ugc.asve.recorder.camera.C31165b;
import com.p2082ss.android.ugc.asve.recorder.view.ASCameraView;
import com.p2082ss.android.ugc.aweme.adaptation.C33398a;
import com.p2082ss.android.ugc.aweme.beauty.C34806c;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.experiment.C46981gn;
import com.p2082ss.android.ugc.aweme.experiment.C46982go;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p2082ss.android.ugc.aweme.internal.AVCommerceServiceImpl;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.p3290j.C56813a;
import com.p2082ss.android.ugc.aweme.port.internal.AbstractC63281h;
import com.p2082ss.android.ugc.aweme.port.internal.IVideoRecordPreferences;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.property.AbstractC65488n;
import com.p2082ss.android.ugc.aweme.property.C65356az;
import com.p2082ss.android.ugc.aweme.property.C65366bf;
import com.p2082ss.android.ugc.aweme.property.C65402co;
import com.p2082ss.android.ugc.aweme.property.C65476i;
import com.p2082ss.android.ugc.aweme.property.C65493p;
import com.p2082ss.android.ugc.aweme.setting.p3721i.C68106m;
import com.p2082ss.android.ugc.aweme.shortvideo.AbstractC70630dc;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.C69926ch;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.C70643dn;
import com.p2082ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.cutmusic.C70612k;
import com.p2082ss.android.ugc.aweme.shortvideo.duet.C70659a;
import com.p2082ss.android.ugc.aweme.shortvideo.duet.C70660aa;
import com.p2082ss.android.ugc.aweme.shortvideo.duet.C70692n;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C71518t;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C71529w;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AbstractC72264w;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C72084ao;
import com.p2082ss.android.ugc.aweme.shortvideo.p3833f.C71833a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3837j.C71902h;
import com.p2082ss.android.ugc.aweme.shortvideo.p3837j.C71903i;
import com.p2082ss.android.ugc.aweme.shortvideo.p3839l.C71922a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3848n.C72454b;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.AbstractActivityC73487ba;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.AbstractC73758l;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.AbstractC73759m;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.AbstractC73760n;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.AudioFocusManager;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.C73481b;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.C73657f;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.C73754h;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.TimeSpeedModelExtension;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.p3877a.AbstractC73376c;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.p3877a.AbstractC73377d;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.p3877a.AbstractC73411i;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.p3877a.C73378e;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.p3877a.C73392h;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.p3877a.C73412j;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.p3877a.C73438r;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.permissionmanager.C73773g;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.permissionmanager.C73786h;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.task.C73800b;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.task.C73802c;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.task.C73806f;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.task.CacheChooseMediaViewHolderTask;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.task.PreloadMediaDataTask;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.task.PreloadMusicListTask;
import com.p2082ss.android.ugc.aweme.shortvideo.p3889w.AbstractC74227m;
import com.p2082ss.android.ugc.aweme.shortvideo.p3889w.C74228n;
import com.p2082ss.android.ugc.aweme.shortvideo.p3892x.AbstractC74319k;
import com.p2082ss.android.ugc.aweme.shortvideo.p3892x.C74322m;
import com.p2082ss.android.ugc.aweme.shortvideo.record.C72770ar;
import com.p2082ss.android.ugc.aweme.shortvideo.record.C72783c;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73936aa;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73963aq;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73964ar;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73968au;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73975b;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73980bc;
import com.p2082ss.android.ugc.aweme.sticker.AbstractC75314e;
import com.p2082ss.android.ugc.aweme.sticker.StickerWrapper;
import com.p2082ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p2082ss.android.ugc.aweme.sticker.p3954d.AbstractC75301e;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75593g;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75618a;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75621d;
import com.p2082ss.android.ugc.aweme.sticker.types.unlock.C76108c;
import com.p2082ss.android.ugc.aweme.tools.C77804a;
import com.p2082ss.android.ugc.aweme.tools.EnumC78601i;
import com.p2082ss.android.ugc.aweme.tools.p4099d.C78104a;
import com.p2082ss.android.ugc.aweme.tools.p4099d.C78105b;
import com.p2082ss.android.ugc.aweme.ttep.C79168ab;
import com.p2082ss.android.ugc.aweme.utils.C80510gr;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.gamora.recorder.choosemusic.AbstractC83490a;
import com.p2082ss.android.ugc.gamora.recorder.choosemusic.recommend.AbstractC83566a;
import com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83406b;
import com.p2082ss.android.ugc.gamora.recorder.p4298e.AbstractC83634a;
import com.p2082ss.android.ugc.gamora.recorder.p4300g.AbstractC83678a;
import com.p2082ss.android.ugc.gamora.recorder.p4304k.AbstractC83746a;
import com.p2082ss.android.ugc.gamora.recorder.p4306m.AbstractC83881a;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4309a.C83950a;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84089j;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.C84025h;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.tools.p4341d.p4342a.C84412c;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.utils.C84904k;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84917a;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84918b;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84919c;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.vesdk.C85315al;
import com.p2082ss.android.vesdk.runtime.C85555d;
import com.p2082ss.ugc.aweme.performance.p4431a.C86654a;
import dmt.p4542av.video.C88151a;
import dmt.p4542av.video.p4547d.C88249a;
import dmt.p4542av.video.p4549f.C88258a;
import dmt.p4542av.video.p4549f.C88260b;
import dmt.p4542av.video.p4549f.C88264d;
import dmt.p4542av.video.p4549f.C88265e;
import dmt.p4542av.video.p4549f.C88266f;
import dmt.p4542av.video.p4549f.C88268h;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ttep.TTEPEffectPreviewActivity */
public class TTEPEffectPreviewActivity extends AbstractActivityC73487ba implements AbstractC63281h, AbstractC72264w, AbstractC73758l, AbstractC73759m, AbstractC73760n, AbstractC84919c, AbstractC90252i, AbstractC90253j {

    /* renamed from: A */
    public String f177912A;

    /* renamed from: B */
    public ArrayList<StickerWrapper> f177913B = new ArrayList<>();

    /* renamed from: C */
    public AbstractC14209z f177914C;

    /* renamed from: D */
    public AbstractC14193m f177915D;

    /* renamed from: E */
    public AbstractC73411i f177916E;

    /* renamed from: F */
    public AbstractC14099a f177917F;

    /* renamed from: G */
    public AbstractC84089j f177918G;

    /* renamed from: H */
    private List<AbstractC84918b> f177919H = new ArrayList();

    /* renamed from: I */
    private List<AbstractC84917a> f177920I = new ArrayList();

    /* renamed from: J */
    private FrameLayout f177921J;

    /* renamed from: K */
    private AbstractC22233n f177922K;

    /* renamed from: L */
    private boolean f177923L = false;

    /* renamed from: M */
    private boolean f177924M = false;

    /* renamed from: N */
    private int f177925N;

    /* renamed from: O */
    private C70692n f177926O;

    /* renamed from: P */
    private boolean f177927P = false;

    /* renamed from: e */
    public final AbstractC89244h<ApiCenter> f177928e = C89250i.m154773a((AbstractC89171a) new C79237b(this));

    /* renamed from: f */
    public C21582f f177929f;

    /* renamed from: g */
    public ShortVideoContext f177930g;

    /* renamed from: h */
    public SafeHandler f177931h = new SafeHandler(this);

    /* renamed from: i */
    public C74322m f177932i;

    /* renamed from: j */
    public FrameLayout f177933j;

    /* renamed from: k */
    public SurfaceView f177934k;

    /* renamed from: l */
    public FrameLayout f177935l;

    /* renamed from: m */
    public List<String> f177936m;

    /* renamed from: n */
    public Effect f177937n;

    /* renamed from: o */
    boolean f177938o;

    /* renamed from: p */
    public String f177939p;

    /* renamed from: q */
    public String f177940q;

    /* renamed from: r */
    public C71922a f177941r = new C71922a();

    /* renamed from: s */
    public C69926ch f177942s;

    /* renamed from: t */
    public C72084ao f177943t;

    /* renamed from: u */
    Effect f177944u;

    /* renamed from: v */
    FrameLayout f177945v;

    /* renamed from: w */
    public volatile boolean f177946w = true;

    /* renamed from: x */
    boolean f177947x;

    /* renamed from: y */
    public boolean f177948y = false;

    /* renamed from: z */
    AbstractC83566a f177949z;

    static {
        Covode.recordClassIndex(92345);
    }

    @Override // com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84919c
    /* renamed from: a */
    public final void mo87531a(AbstractC84917a aVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b
    public final boolean bA_() {
        return true;
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(215, new RunnableC90250g(TTEPEffectPreviewActivity.class, "receiveToast", C76108c.class, ThreadMode.POSTING, 0, true));
        hashMap.put(216, new RunnableC90250g(TTEPEffectPreviewActivity.class, "onEvent", C71902h.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.AbstractC73760n
    /* renamed from: m */
    public final String mo115995m() {
        return "TTEPEffectPreviewActivity";
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ttep.TTEPEffectPreviewActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.AbstractC73758l
    /* renamed from: j */
    public final C21582f mo87538j() {
        return this.f177929f;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.AbstractC73759m
    /* renamed from: k */
    public final FrameLayout mo115993k() {
        return this.f177921J;
    }

    @Override // com.p2082ss.android.ugc.aweme.port.internal.AbstractC63281h
    /* renamed from: p */
    public final AbstractC74319k mo87547p() {
        return this.f177932i;
    }

    @Override // com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b
    public final int bB_() {
        return C0643b.m2378c(this, R.color.c9);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AbstractC72264w
    /* renamed from: g */
    public final void mo114266g() {
        C72084ao aoVar = this.f177943t;
        if (aoVar != null) {
            aoVar.f161599Z = false;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AbstractC72264w
    /* renamed from: i */
    public final boolean mo114267i() {
        C72084ao aoVar = this.f177943t;
        if (aoVar != null) {
            return aoVar.f161599Z;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.AbstractC73759m
    /* renamed from: l */
    public final FrameLayout.LayoutParams mo115994l() {
        SurfaceView surfaceView = this.f177934k;
        if (surfaceView == null) {
            return null;
        }
        return (FrameLayout.LayoutParams) surfaceView.getLayoutParams();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.adaptation.AbstractActivityC33414h, androidx.appcompat.app.ActivityC0218d
    public void onStart() {
        C15477a.m28473a(this);
        super.onStart();
        C73806f.m129872a(new C88264d());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final ShortVideoContextViewModel mo122957s() {
        return (ShortVideoContextViewModel) C1181ae.m3881a(this, (C1175ad.AbstractC1177b) null).mo3983a(ShortVideoContextViewModel.class);
    }

    /* renamed from: t */
    public final void mo122958t() {
        AbstractC14193m mVar = this.f177915D;
        if (mVar != null) {
            mVar.mo22890b(false);
        }
    }

    /* renamed from: w */
    private void m138001w() {
        IVideoRecordPreferences iVideoRecordPreferences = (IVideoRecordPreferences) new C14401a((byte) 0).mo23215a(this, IVideoRecordPreferences.class);
        if (iVideoRecordPreferences != null && iVideoRecordPreferences.isFirstEnterRecordPage(true)) {
            iVideoRecordPreferences.setFirstEnterRecordPage(false);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AbstractC72264w
    /* renamed from: a */
    public final AbstractC72264w.C72265a mo114263a() {
        C72084ao aoVar = this.f177943t;
        if (aoVar == null || aoVar.f52549m == null) {
            return new AbstractC72264w.C72265a(null, null);
        }
        return this.f177943t.mo114263a();
    }

    @Override // com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b
    /* renamed from: d */
    public final void mo59480d() {
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().setFlags(0, Integer.MIN_VALUE);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AbstractC72264w
    /* renamed from: e */
    public final AbstractC72264w.C72265a mo114265e() {
        C72084ao aoVar = this.f177943t;
        if (aoVar == null || aoVar.f52549m == null) {
            return new AbstractC72264w.C72265a(null, null);
        }
        return this.f177943t.mo114265e();
    }

    @Override // com.p2082ss.android.ugc.aweme.adaptation.AbstractActivityC33414h
    /* renamed from: h */
    public final void mo59496h() {
        C33398a.f79357a.mo59450a(this.f177934k, this.f177930g.f155817b.f155647c, this.f177930g.f155817b.f155648d);
        C69926ch chVar = this.f177942s;
        if (chVar != null) {
            chVar.mo110336F();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final void mo122950n() {
        if (!isFinishing() && getIntent().getBooleanExtra("auto_start_recording", false)) {
            this.f177915D.mo22919z();
        }
    }

    /* renamed from: q */
    public final AbstractC84089j mo122954q() {
        if (this.f177918G == null) {
            this.f177918G = (AbstractC84089j) this.f177929f.mo35252b(AbstractC84089j.class, null);
        }
        return this.f177918G;
    }

    /* renamed from: r */
    public final AbstractC14333c mo122955r() {
        return (AbstractC14333c) this.f177928e.getValue().mo7015b(AbstractC14333c.class);
    }

    /* renamed from: u */
    private void m137999u() {
        this.f177914C.mo22747A().mo56913a(new C31217m(new C72783c(this.f177930g.f155817b.f155652h)), this.f177930g.f155817b.f155652h.mo110096e().getAbsolutePath());
        this.f177914C.mo22838z();
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public void onPause() {
        C15477a.m28477c(this);
        super.onPause();
        C17233a.f41165a = false;
        this.f177924M = false;
        C73964ar.f166038a.mo116394b();
        C73975b.C73976a.f166071a.pause(this, "record", this.f177930g.f155831p, this.f177930g.f155830o);
        C86654a.C86655a.m150135a().mo137922b("tool_record");
        C85555d.m147448b().mo131523a(1);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b, androidx.appcompat.app.ActivityC0218d
    public void onStop() {
        C15477a.m28478d(this);
        super.onStop();
        mo122958t();
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused2) {
            }
        }
    }

    /* renamed from: v */
    private void m138000v() {
        if (this.f177930g.f155831p != null) {
            String str = FaceStickerBean.sCurPropSource;
            String str2 = this.f177930g.f155831p;
            str2.hashCode();
            switch (str2.hashCode()) {
                case -1731750228:
                    if (str2.equals("single_song")) {
                        str = "single_song";
                        break;
                    }
                    break;
                case -1098262888:
                    if (str2.equals("prop_reuse")) {
                        str = "prop_reuse";
                        break;
                    }
                    break;
                case 3449699:
                    if (str2.equals("prop")) {
                        str = "homepage_prop_maker";
                        break;
                    }
                    break;
                case 3524221:
                    if (str2.equals("scan")) {
                        str = "qr_code";
                        break;
                    }
                    break;
                case 669986889:
                    if (str2.equals("direct_shoot")) {
                        str = "direct_shoot";
                        break;
                    }
                    break;
                case 1402633315:
                    if (str2.equals("challenge")) {
                        str = "challenge";
                        break;
                    }
                    break;
            }
            FaceStickerBean.sCurPropSource = str;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final void mo122951o() {
        MethodCollector.m26663i(8349);
        if (isFinishing()) {
            MethodCollector.m26664o(8349);
            return;
        }
        C73975b.C73976a.f166071a.step("av_video_record_init", "addFragment");
        C84911q.m145921a("addFragment PlanC");
        AbstractC22233n nVar = this.f177922K;
        if (nVar != null) {
            nVar.mo36341b();
            this.f177922K = null;
            ((ViewGroup) findViewById(R.id.dgc)).removeAllViews();
        }
        C69926ch a = m137994a(getIntent());
        this.f177942s = a;
        ((AbstractC70630dc) a).f158093e = new RunnableC79167aa(this);
        C22217i.C22218a a2 = C22217i.m41761a(this, C69926ch.class);
        a2.f52533e = false;
        a2.f52534f = new C79254d(this);
        a2.f52530b = false;
        a2.f52531c = false;
        a2.f52532d = R.id.dgc;
        this.f177922K = a2.mo36469a();
        MethodCollector.m26664o(8349);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b, com.p2082ss.android.ugc.aweme.adaptation.AbstractActivityC33414h, androidx.appcompat.app.ActivityC0218d, com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.AbstractActivityC73487ba
    public void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
        C73754h.m129790a();
        m138001w();
        C72454b.f162433c.mo114728a();
        C63238c.f143581h.mo101552k().mo101566b();
        this.f177942s = null;
        EventBus.m156962a().mo145395b(this);
        C73964ar.f166038a.mo116392a();
        C80510gr.m139536b();
        AVExternalServiceImpl.m113114a().publishService().setFromCommercialSoundPage(false);
        AVExternalServiceImpl.m113114a().publishService().setHasOpenCommercialSoundPage(false);
        AVCommerceServiceImpl.m102988h().mo93966c();
        AVCommerceServiceImpl.m102988h().mo93970g();
        C73975b.C73976a.f166071a.leave(this, "record");
        C88151a.m153228a();
        if (!this.f177927P) {
            C70005cr.m123611a().mo110453c();
            this.f177927P = false;
        }
        C84412c.m145200a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.AbstractActivityC73487ba
    public void finish() {
        String a = m137995a(getIntent(), "backurl");
        if (m137998c(getIntent())) {
            AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getMiniAppService().mo93846a(((C71518t) getIntent().getSerializableExtra("micro_app_info")).getAppId());
        }
        super.finish();
        if (this.f177942s != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                mo122958t();
            } else {
                runOnUiThread(new RunnableC79267m(this));
            }
        }
        if (!TextUtils.isEmpty(a) && !m137998c(getIntent()) && !TextUtils.isEmpty(a) && !TextUtils.equals("__BACKURL__", a)) {
            try {
                Uri parse = Uri.parse(a);
                Intent intent = new Intent();
                intent.setData(parse);
                intent.setAction("android.intent.action.VIEW");
                intent.addCategory("android.intent.category.BROWSABLE");
                intent.setComponent(null);
                intent.setSelector(null);
                startActivityIfNeeded(intent, -1);
                moveTaskToBack(true);
            } catch (Exception unused) {
            }
        }
        C56813a.m135921b(this, 3);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b, com.p2082ss.android.ugc.aweme.adaptation.AbstractActivityC33414h
    public void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ttep.TTEPEffectPreviewActivity", "onResume", true);
        C84911q.m145921a("TTEPEffectPreviewActivity => onResume start");
        super.onResume();
        if (this.f177930g.f155752M) {
            AbstractC81915c.m141874a(new C71903i());
        }
        C86654a.C86655a.m150135a().mo137921a("tool_record");
        C17233a.f41165a = true;
        this.f177924M = true;
        if (this.f177923L) {
            C63238c.f143568F.mo101711a(this, C63238c.f143568F.mo101709a());
            this.f177923L = false;
        }
        C39162r.m79460a("av_memory_log", new C84425b().mo129406a("scene", "resume_record").mo129406a("shoot_way", this.f177930g.f155831p).mo129406a("creation_id", this.f177930g.f155830o).mo129406a("enter_from", this.f177930g.f155837v).mo129404a("dalvikPss", C73964ar.f166038a.f166040c).mo129404a("nativePss", C73964ar.f166038a.f166041d).mo129404a("otherPss", C73964ar.f166038a.f166043f).mo129404a("totalPss", C73964ar.f166038a.f166042e).f188764a);
        C84911q.m145921a("TTEPEffectPreviewActivity => onResume end");
        C73964ar.f166038a.mo116393a(this, this.f177921J);
        if (this.f177930g != null) {
            this.f177914C.mo22747A().mo56938f(this.f177930g.f155817b.mo109888a());
            this.f177914C.mo22747A().mo56941g(this.f177930g.f155817b.mo109888a());
        }
        boolean a = C46981gn.m90261a();
        boolean a2 = C46982go.m90262a();
        if (a || a2) {
            C73773g.m129834a(this, new C79264j(this));
        } else {
            Context applicationContext = getApplicationContext();
            if (C58003a.f132201c && applicationContext == null) {
                applicationContext = C58003a.f132199a;
            }
            if (!C73786h.m129841a(applicationContext, true)) {
                C73980bc.m130118a(this, new C79265k(this), new C79266l(this));
            }
        }
        C85555d.m147448b().mo131523a(0);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ttep.TTEPEffectPreviewActivity", "onResume", false);
    }

    /* renamed from: b */
    private static Bundle m137997b(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84919c
    /* renamed from: c */
    public final void mo87535c(AbstractC84917a aVar) {
        this.f177920I.remove(aVar);
    }

    /* renamed from: c */
    private static boolean m137998c(Intent intent) {
        if (intent == null || intent.getSerializableExtra("micro_app_info") == null) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84919c
    /* renamed from: a */
    public final void mo87532a(AbstractC84918b bVar) {
        this.f177919H.add(bVar);
    }

    @Override // com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84919c
    /* renamed from: b */
    public final void mo87533b(AbstractC84917a aVar) {
        this.f177920I.add(aVar);
    }

    @Override // com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84919c
    /* renamed from: b */
    public final void mo87534b(AbstractC84918b bVar) {
        this.f177919H.remove(bVar);
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b, androidx.appcompat.app.ActivityC0218d
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.remove("android:fragments");
        this.f177927P = true;
        bundle.putParcelable("save_state_short_video_context", this.f177930g);
        getIntent();
        C84412c.m145203a(this, bundle);
    }

    /* renamed from: a */
    private C69926ch m137994a(Intent intent) {
        if (intent == null) {
            ShortVideoContext shortVideoContext = this.f177930g;
            Intent intent2 = getIntent();
            this.f177914C.mo22747A();
            return new C69926ch(shortVideoContext, intent2, this.f177929f, C79257e.f178076a);
        }
        ShortVideoContext shortVideoContext2 = this.f177930g;
        this.f177914C.mo22747A();
        return new C69926ch(shortVideoContext2, intent, this.f177929f, C79260f.f178082a);
    }

    @Override // com.p2082ss.android.ugc.aweme.adaptation.AbstractActivityC33414h
    /* renamed from: b */
    public final void mo59493b(boolean z) {
        C69926ch chVar = this.f177942s;
        if (chVar != null) {
            chVar.mo110338b(z);
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            AbstractC83634a aVar = (AbstractC83634a) ApiCenter.C2545a.m7450a(this).mo7015b(AbstractC83634a.class);
            if (aVar != null) {
                aVar.dismissSuperEntranceEvent();
            }
            AbstractC83634a aVar2 = (AbstractC83634a) ApiCenter.C2545a.m7450a(this).mo7015b(AbstractC83634a.class);
            if (aVar2 != null) {
                aVar2.dismissUploadPopEntranceEvent();
            }
            AbstractC83634a aVar3 = (AbstractC83634a) ApiCenter.C2545a.m7450a(this).mo7015b(AbstractC83634a.class);
            if (aVar3 != null) {
                aVar3.dismissLivePopupEvent();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f177925N != configuration.screenWidthDp) {
            this.f177925N = configuration.screenWidthDp;
            C33398a.f79357a.mo59450a(this.f177934k, this.f177930g.f155817b.f155647c, this.f177930g.f155817b.f155648d);
        }
    }

    @AbstractC90264r(mo145423b = true)
    public void receiveToast(C76108c cVar) {
        if (TextUtils.equals(cVar.f170995a, "sticker_unlocked")) {
            this.f177923L = true;
            this.f177944u = cVar.f170996b;
            if (this.f177924M && !cVar.f170998d) {
                C63238c.f143568F.mo101711a(this, C63238c.f143568F.mo101709a());
                this.f177923L = false;
            }
            EventBus.m156962a().mo145399f(cVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.adaptation.AbstractActivityC33414h
    /* renamed from: a */
    public final void mo59491a(boolean z) {
        C69926ch chVar = this.f177942s;
        if (chVar != null) {
            chVar.mo110337a(z);
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public void onEvent(C71902h hVar) {
        C69926ch chVar;
        if (!(!C65366bf.m117062a() || (chVar = this.f177942s) == null || chVar.mo62771E() == null || this.f177942s.mo62771E().mo35249a((Type) AbstractC83406b.class, (String) null) == null || this.f177942s.mo62771E().mo35249a((Type) AbstractC83881a.class, (String) null) == null)) {
            ((AbstractC83406b) this.f177942s.mo62771E().mo35249a((Type) AbstractC83406b.class, (String) null)).updateBottomTab();
            ((AbstractC83881a) this.f177942s.mo62771E().mo35249a((Type) AbstractC83881a.class, (String) null)).mo123013d();
        }
        if (hVar.f161103a != null) {
            this.f177930g.f155794ad.f155707c = hVar.f161103a;
        }
    }

    /* renamed from: a */
    private void m137996a(Bundle bundle) {
        List<String> list;
        boolean z;
        boolean z2 = true;
        if (bundle != null) {
            ShortVideoContext shortVideoContext = (ShortVideoContext) bundle.getParcelable("save_state_short_video_context");
            this.f177930g = shortVideoContext;
            if (!(shortVideoContext == null || shortVideoContext.f155765Z == null)) {
                C70005cr.m123611a().mo110454d();
            }
            StringBuilder sb = new StringBuilder("initData with outState,shortVideoContext is NULL:");
            if (this.f177930g == null) {
                z = true;
            } else {
                z = false;
            }
            C84911q.m145921a(sb.append(z).toString());
        }
        if (this.f177930g == null) {
            C63244g.m114602a().mo73293u();
            this.f177930g = C70643dn.m124852a(getIntent(), this);
            StringBuilder sb2 = new StringBuilder("initData with intent,shortVideoContext is NULL:");
            if (this.f177930g != null) {
                z2 = false;
            }
            C84911q.m145921a(sb2.append(z2).toString());
        }
        if (getIntent().getBooleanExtra("reuse_mvtheme_enter", false)) {
            this.f177930g.f155827l = (Effect) getIntent().getParcelableExtra("extra_mv_effect");
        }
        this.f177939p = m137995a(getIntent(), "extra_sticker_from");
        this.f177940q = m137995a(getIntent(), "grade_key");
        m138000v();
        C70005cr.m123611a().f156486e = this.f177930g.f155831p;
        C71833a.m126847a(this.f177930g.f155830o);
        ShortVideoContextViewModel s = mo122957s();
        s.f155842a = this.f177930g;
        s.mo110047a(this.f177930g.f155763X);
        this.f177938o = getIntent().getBooleanExtra("sticker_pannel_show", false);
        this.f177936m = getIntent().getStringArrayListExtra("reuse_sticker_ids");
        this.f177937n = (Effect) getIntent().getParcelableExtra("first_sticker");
        this.f177912A = m137995a(getIntent(), "update_effect_id");
        this.f177913B = getIntent().getParcelableArrayListExtra("update_effect_extra");
        if (C52912c.f121688a.f121689b.getStickerUpdateApp().booleanValue() && "direct_shoot".equals(this.f177930g.f155831p) && this.f177937n == null && ((list = this.f177936m) == null || list.size() == 0)) {
            String a = C63238c.f143593t.mo93788a((Context) this);
            if (!TextUtils.isEmpty(a)) {
                ArrayList arrayList = new ArrayList();
                this.f177936m = arrayList;
                arrayList.add(a);
            }
        }
        if (!TextUtils.isEmpty(m137995a(getIntent(), "star_atlas_object"))) {
            this.f177930g.f155794ad.f155707c = C63238c.f143585l.mo93817a(this.f177930g.f155794ad.f155707c, m137995a(getIntent(), "star_atlas_object"));
        }
        String a2 = m137995a(getIntent(), "music_origin");
        ShortVideoContext shortVideoContext2 = this.f177930g;
        if (a2 == null) {
            a2 = "original";
        }
        shortVideoContext2.f155823h = a2;
        C34806c.m71112a();
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public void onNewIntent(Intent intent) {
        C14201t a;
        AbstractC83490a aVar;
        MethodCollector.m26663i(8114);
        super.onNewIntent(intent);
        C84911q.m145921a("TTEPEffectPreviewActivity onNewIntent");
        C84412c.m145202a(this, intent, (Bundle) null);
        if (this.f177930g == null || !C88249a.m153359a(this)) {
            C84911q.m145921a("close record page because of null shortVideoContext instance when invoking onNewIntent method");
            finish();
            MethodCollector.m26664o(8114);
            return;
        }
        int intExtra = intent.getIntExtra("retake_shoot_mode", -1);
        boolean z = false;
        if (intExtra == 1) {
            C70643dn.m124854a(intent, this.f177930g);
            m137999u();
            AbstractC83746a aVar2 = (AbstractC83746a) ApiCenter.C2545a.m7450a(this).mo7015b(AbstractC83746a.class);
            if (aVar2 != null) {
                aVar2.mo128713a(this.f177930g.mo110038n());
                aVar2.mo128711a(0);
            }
            if (this.f177942s != null) {
                this.f177915D.mo22917x();
            }
            this.f177916E.mo116037a(true);
        } else if (intExtra == 2) {
            C70643dn.m124861b(intent, this.f177930g);
            m137999u();
            if (this.f177942s != null) {
                if (!this.f177930g.mo110022c() || this.f177930g.f155743D.f155847b == null) {
                    a = C14201t.m25948a((List<TimeSpeedModelExtension>) this.f177930g.f155817b.mo109891d(), this.f177930g.f155817b.mo109896h(), false);
                } else {
                    a = C14201t.m25947a(this.f177930g.f155817b.mo109891d(), this.f177930g.f155817b.mo109896h(), this.f177930g.f155743D.f155847b);
                }
                this.f177915D.mo22877a(a);
                AbstractC83490a aVar3 = (AbstractC83490a) this.f177928e.getValue().mo7015b(AbstractC83490a.class);
                if (aVar3 != null) {
                    aVar3.changeMusicUi();
                }
            }
            this.f177916E.mo116037a(false);
        }
        if (this.f177930g.f155817b.mo109893e() == null && (aVar = (AbstractC83490a) ApiCenter.C2545a.m7450a(this).mo7015b(AbstractC83490a.class)) != null) {
            aVar.handleCancelMusicResultEvent();
        }
        m138001w();
        boolean booleanExtra = intent.getBooleanExtra("recreate_record_and_clear", false);
        this.f177938o = intent.getBooleanExtra("sticker_pannel_show", false);
        boolean booleanExtra2 = intent.getBooleanExtra("enter_record_from_other_platform", false);
        if (booleanExtra) {
            C84911q.m145921a("TTEPEffectPreviewActivity isClear");
            setIntent(intent);
            if (getIntent().getIntExtra("translation_type", 0) == 3) {
                C77804a.m135920a(this, 3);
            }
            AbstractC14209z zVar = this.f177914C;
            if (zVar != null) {
                zVar.mo22781a(EnumC78601i.NORMAL);
            }
            this.f177915D.mo22895d(true);
            TEMonitorInvoker.nativeReset();
            if (mo122954q() != null) {
                mo122954q().mo23133o();
            }
            C63238c.f143565C.mo73290r().mo86005c().mo86020a();
            m137996a((Bundle) null);
            mo122951o();
        } else if (this.f177930g == null) {
            m137996a((Bundle) null);
        }
        ShortVideoContext shortVideoContext = this.f177930g;
        if (booleanExtra2 || shortVideoContext.f155796af != null) {
            z = true;
        }
        shortVideoContext.f155797ag = z;
        if (this.f177938o && mo122955r() != null) {
            mo122955r().mo23139a(true);
        }
        MethodCollector.m26664o(8114);
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b, com.p2082ss.android.ugc.aweme.adaptation.AbstractActivityC33414h, androidx.appcompat.app.ActivityC0218d, com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.AbstractActivityC73487ba
    public void onCreate(Bundle bundle) {
        long j;
        int i;
        byte b;
        boolean z;
        boolean z2;
        MethodCollector.m26663i(8209);
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ttep.TTEPEffectPreviewActivity", "onCreate", true);
        C65402co.C65403a.m117104a();
        C70005cr.m123611a().mo110453c();
        C73975b.C73976a.f166071a.enter(this, "record");
        C84412c.m145202a(this, getIntent(), bundle);
        m137996a(bundle);
        C73975b.C73976a.f166071a.step("av_video_record_init", "init recorderModule start");
        C70612k.f158036f.mo111417a(this);
        C69905c cVar = C70005cr.m123611a().f156482a;
        if (cVar != null && cVar.getDuration() > 0) {
            this.f177930g.f155822g = cVar.getDuration();
        }
        C63238c.m114594d();
        C31165b.f74716b = C65493p.m117218a();
        String str = "";
        C89219l.m154721d(this, str);
        C2556g.m7471a(this, new C79168ab.C79182k(this));
        C2551b bVar = new C2551b(C2552c.m7460a(this));
        C2553d dVar = new C2553d();
        AlsLogicContainer alsLogicContainer = bVar.f7720a;
        alsLogicContainer.f7696d.mo35260a(C73438r.class, (String) null, (AbstractC21603p) new C79168ab.C79180i(dVar, this));
        alsLogicContainer.mo7005a(AbstractC14209z.class, C73438r.class);
        C2553d dVar2 = new C2553d();
        AlsLogicContainer alsLogicContainer2 = bVar.f7720a;
        alsLogicContainer2.f7696d.mo35260a(C74228n.class, (String) null, (AbstractC21603p) new C79168ab.C79181j(dVar2, this));
        alsLogicContainer2.mo7005a(AbstractC74227m.class, C74228n.class);
        C2553d dVar3 = new C2553d();
        AlsLogicContainer alsLogicContainer3 = bVar.f7720a;
        alsLogicContainer3.f7696d.mo35260a(C14225c.class, (String) null, (AbstractC21603p) new C79168ab.C79170b(dVar3));
        alsLogicContainer3.mo7005a(AbstractC14210a.class, C14225c.class);
        C2553d dVar4 = new C2553d();
        AlsLogicContainer alsLogicContainer4 = bVar.f7720a;
        alsLogicContainer4.f7696d.mo35260a(C14243a.class, (String) null, (AbstractC21603p) new C79168ab.C79171c(dVar4));
        alsLogicContainer4.mo7005a(AbstractC14217g.class, C14243a.class);
        C2553d dVar5 = new C2553d();
        AlsLogicContainer alsLogicContainer5 = bVar.f7720a;
        alsLogicContainer5.f7696d.mo35260a(C14117i.class, (String) null, (AbstractC21603p) new C79168ab.C79172d(dVar5));
        alsLogicContainer5.mo7005a(AbstractC14099a.class, C14117i.class);
        C2553d dVar6 = new C2553d();
        AlsLogicContainer alsLogicContainer6 = bVar.f7720a;
        alsLogicContainer6.f7696d.mo35260a(C84025h.class, (String) null, (AbstractC21603p) new C79168ab.C79173e(dVar6));
        alsLogicContainer6.mo7005a(AbstractC84089j.class, C84025h.class);
        C2553d dVar7 = new C2553d();
        AlsLogicContainer alsLogicContainer7 = bVar.f7720a;
        alsLogicContainer7.f7696d.mo35260a(C73392h.class, (String) null, (AbstractC21603p) new C79168ab.C79177f(dVar7));
        alsLogicContainer7.mo7005a(AbstractC73376c.class, C73392h.class);
        C2553d dVar8 = new C2553d();
        AlsLogicContainer alsLogicContainer8 = bVar.f7720a;
        alsLogicContainer8.f7696d.mo35260a(C73412j.class, (String) null, (AbstractC21603p) new C79168ab.C79178g(dVar8));
        alsLogicContainer8.mo7005a(AbstractC73411i.class, C73412j.class);
        C2553d dVar9 = new C2553d();
        AlsLogicContainer alsLogicContainer9 = bVar.f7720a;
        alsLogicContainer9.f7696d.mo35260a(C73378e.class, (String) null, (AbstractC21603p) new C79168ab.C79179h(dVar9));
        alsLogicContainer9.mo7005a(AbstractC73377d.class, C73378e.class);
        C2553d dVar10 = new C2553d();
        AlsLogicContainer alsLogicContainer10 = bVar.f7720a;
        alsLogicContainer10.f7696d.mo35260a(C83950a.class, (String) null, (AbstractC21603p) new C79168ab.C79169a(dVar10));
        alsLogicContainer10.mo7005a(AbstractC75314e.class, C83950a.class);
        bVar.mo7031a();
        this.f177929f = C2552c.m7460a(this).f7697e;
        C63244g.m114602a();
        this.f177914C = (AbstractC14209z) this.f177929f.mo35249a((Type) AbstractC14209z.class, (String) null);
        this.f177915D = (AbstractC14193m) this.f177929f.mo35249a((Type) AbstractC14193m.class, (String) null);
        this.f177916E = (AbstractC73411i) this.f177929f.mo35249a((Type) AbstractC73411i.class, (String) null);
        this.f177932i = this.f177914C.mo22941an();
        this.f177934k = this.f177914C.mo22749C();
        boolean a = new C73936aa(this.f177930g).mo116384a();
        SafeHandler safeHandler = this.f177931h;
        RunnableC79268n nVar = new RunnableC79268n(this);
        if (a) {
            j = InteractFirstFrameTimeOutDurationSetting.DEFAULT;
        } else {
            j = 0;
        }
        safeHandler.postDelayed(nVar, j);
        if (a) {
            this.f177914C.mo22741a(false, PrivacyCert.Builder.with("bpea-131").usage(str).tag("TTEP preview function").policies(PrivacyPolicyStore.getVideoPrivacyPolicy()).build(), true);
        }
        this.f177914C.mo22814e().mo7036a(this, new C79330v(this));
        this.f177914C.mo22826n().mo6997a(this, new C79331w(this));
        ASCameraView A = this.f177914C.mo22747A();
        if (this.f177930g.f155830o != null) {
            str = this.f177930g.f155830o;
        }
        A.setControllerCallback(new C72770ar(str));
        this.f177917F = (AbstractC14099a) this.f177929f.mo35249a((Type) AbstractC14099a.class, (String) null);
        if (C70659a.m124890a(this.f177930g)) {
            C70692n nVar2 = new C70692n(this, this.f177914C.mo22747A(), mo122954q(), this.f177932i, new C70660aa(this, this.f177914C), this.f177929f);
            this.f177926O = nVar2;
            nVar2.mo111514a();
        }
        this.f177914C.mo22756J().mo6997a(this, new C79332x(this));
        this.f177915D.mo22909p().mo6997a(this, new C79333y(this));
        C73975b.C73976a.f166071a.step("av_video_record_init", "init recorderModule end");
        C84911q.m145921a("TTEPEffectPreviewActivity => onCreate start");
        C70005cr.m123611a().f156498r = false;
        C70005cr.m123611a().f156493m = false;
        C73975b.C73976a.f166071a.step("av_video_record_init", "onCreate");
        C73806f.m129872a(new C88264d());
        C73806f.m129872a(new C88268h(this));
        C73806f.m129872a(new C88266f(this));
        C63244g.m114602a();
        C65476i.m117206a(this, AbstractC65488n.C65491c.f147706a);
        super.onCreate(bundle);
        C17233a.f41165a = true;
        if (getIntent().getIntExtra("translation_type", 0) == 3) {
            C56813a.m135920a(this, 3);
        }
        getWindow().addFlags(128);
        setContentView(R.layout.cg);
        if (getResources().getConfiguration() != null) {
            i = getResources().getConfiguration().screenWidthDp;
        } else {
            i = 0;
        }
        this.f177925N = i;
        if (!C88249a.m153359a(this)) {
            C84911q.m145921a("RecordConditionCheck.check() false");
            finish();
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.ttep.TTEPEffectPreviewActivity", "onCreate", false);
            MethodCollector.m26664o(8209);
            return;
        }
        if (C65356az.m117041a()) {
            b = 15;
        } else {
            b = 7;
        }
        C85315al.m146635a(b);
        this.f177921J = (FrameLayout) findViewById(R.id.dnb);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.c73);
        this.f177933j = frameLayout;
        frameLayout.addView(this.f177914C.mo22747A());
        C73975b.C73976a.f166071a.step("av_video_record_init", "init stickerModule start");
        C84025h hVar = (C84025h) this.f177929f.mo35249a((Type) C84025h.class, (String) null);
        hVar.mo128906a(new AbstractC75593g() {
            /* class com.p2082ss.android.ugc.aweme.ttep.TTEPEffectPreviewActivity.C791635 */

            static {
                Covode.recordClassIndex(92350);
            }

            @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75593g
            /* renamed from: b */
            public final void mo87554b() {
                TTEPEffectPreviewActivity.this.f177915D.mo22885a("sticker stop record");
            }

            @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75593g
            /* renamed from: c */
            public final boolean mo87555c() {
                if (TTEPEffectPreviewActivity.this.f177930g != null && !C84904k.m145909a(TTEPEffectPreviewActivity.this.f177930g.f155817b.mo109891d())) {
                    return true;
                }
                return false;
            }

            @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75593g
            /* renamed from: a */
            public final boolean mo87553a() {
                if (TTEPEffectPreviewActivity.this.f177942s == null || TTEPEffectPreviewActivity.this.f177942s.mo111443G() == null || TTEPEffectPreviewActivity.this.f177915D == null) {
                    return true;
                }
                return TTEPEffectPreviewActivity.this.f177915D.mo22891c().f7727a.getValue().booleanValue();
            }
        });
        this.f177915D.mo22912s().mo6997a(this, new C79269o(hVar));
        hVar.mo23168u().mo118615a(new AbstractC75301e() {
            /* class com.p2082ss.android.ugc.aweme.ttep.TTEPEffectPreviewActivity.C791624 */

            static {
                Covode.recordClassIndex(92349);
            }

            @Override // com.p2082ss.android.ugc.aweme.sticker.p3954d.AbstractC75301e
            /* renamed from: a */
            public final void mo87552a(C75621d dVar) {
                C78105b.m136529a(C78104a.f175370a);
            }

            @Override // com.p2082ss.android.ugc.aweme.sticker.p3954d.AbstractC75301e
            /* renamed from: a */
            public final void mo87551a(C75618a aVar) {
                C78105b.m136530a(C78104a.f175370a, aVar.f170022a.getName());
            }
        });
        List<Fragment> f = getSupportFragmentManager().mo3565f();
        if (C13617h.m24466b(f)) {
            List<Fragment> a2 = C73963aq.m130084a(f, C79261g.f178083a);
            if (C13617h.m24466b(a2)) {
                AbstractC0976n a3 = getSupportFragmentManager().mo3552a();
                for (Fragment fragment : a2) {
                    a3.mo3455a(fragment);
                }
                a3.mo3473c();
            }
        }
        C73975b.C73976a.f166071a.step("av_video_record_init", "init stickerModule end");
        this.f177930g.f155804an = getIntent().getIntExtra("tabs", 0);
        C73806f.m129872a(new C88260b());
        C73968au.m130095a(this.f177930g);
        C63238c.f143576c.mo93767a("SHOOT");
        getLifecycle().mo4012a(AudioFocusManager.C73302a.m129359a(this));
        FrameLayout frameLayout2 = (FrameLayout) findViewById(R.id.c48);
        this.f177945v = frameLayout2;
        if (this.f177930g.f155827l != null) {
            z = true;
        } else {
            z = false;
        }
        if (this.f177930g.f155798ah || this.f177930g.f155799ai || z || C68106m.m120397a()) {
            z2 = false;
        } else {
            z2 = true;
        }
        C73657f.m129768a(this, frameLayout2, z2, true);
        this.f177931h.post(new RunnableC79252c(this));
        C71529w.f160314l = true;
        C84911q.m145921a("TTEPEffectPreviewActivity => onCreate end");
        C80510gr.m139526a();
        this.f177930g.f155821f = m137995a(getIntent(), "share_id");
        this.f177930g.f155841z = m137995a(getIntent(), "channel");
        C73806f.m129872a(new C88265e());
        C73806f.m129872a(new C73481b());
        C73806f.m129872a(new C88258a());
        C73806f.m129872a(new C73802c(this));
        C73806f.m129872a(new PreloadMediaDataTask(getLifecycle(), this, System.currentTimeMillis()));
        C73806f.m129872a(new PreloadMusicListTask(getLifecycle()));
        C73806f.m129872a(new C73800b(this));
        C73806f.m129872a(new CacheChooseMediaViewHolderTask(this, getLifecycle()));
        C73975b.C73976a.f166071a.step("av_video_record_init", "onCreate end");
        this.f177914C.mo22752F();
        if (C68106m.m120397a() && !getIntent().getBooleanExtra("auto_start_recording", false)) {
            mo122951o();
            this.f177946w = false;
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ttep.TTEPEffectPreviewActivity", "onCreate", false);
        MethodCollector.m26664o(8209);
    }

    /* renamed from: a */
    private static String m137995a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // androidx.appcompat.app.ActivityC0218d
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        AbstractC83678a aVar;
        for (AbstractC84917a aVar2 : this.f177920I) {
            if (aVar2.onKeyDown(i, keyEvent)) {
                return true;
            }
        }
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        if (this.f177942s != null) {
            AbstractC14193m mVar = this.f177915D;
            if (!(mVar == null || mVar.mo22891c().f7727a.getValue().booleanValue())) {
                return true;
            }
            AbstractC22233n nVar = this.f177922K;
            if ((nVar == null || !nVar.mo36340a()) && (aVar = (AbstractC83678a) this.f177942s.mo62771E().mo35252b(AbstractC83678a.class, null)) != null) {
                aVar.mo128664a("system_back_button", System.currentTimeMillis());
            }
            return true;
        } else if (getIntent().hasExtra("stitch_params")) {
            return true;
        } else {
            return super.onKeyDown(i, keyEvent);
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public void onActivityResult(int i, int i2, Intent intent) {
        boolean z;
        for (AbstractC84918b bVar : this.f177919H) {
            if (bVar.mo62778a(i, i2, intent)) {
                return;
            }
        }
        super.onActivityResult(i, i2, intent);
        if (i == 1002 && i2 == -1) {
            ShortVideoContext shortVideoContext = this.f177930g;
            if (shortVideoContext == null || shortVideoContext.f155796af == null) {
                z = false;
            } else {
                z = true;
            }
            if (!(intent == null || m137997b(intent) == null || z)) {
                Intent intent2 = new Intent();
                intent2.setClass(this, C63238c.f143576c.mo93776e());
                intent2.addFlags(67108864);
                intent2.putExtras(m137997b(intent));
                C84349a.m145093a(intent2, this);
                startActivity(intent2);
            }
            finish();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AbstractC72264w
    /* renamed from: a */
    public final void mo114264a(boolean z, MusicModel musicModel, String str) {
        C72084ao aoVar = this.f177943t;
        if (aoVar != null) {
            aoVar.mo114264a(z, musicModel, str);
        }
    }
}
