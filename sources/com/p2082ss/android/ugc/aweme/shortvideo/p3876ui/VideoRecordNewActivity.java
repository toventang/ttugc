package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

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
import androidx.p022b.p023a.C0464a;
import com.bytedance.als.AlsLogicContainer;
import com.bytedance.als.ApiCenter;
import com.bytedance.als.dsl.C2551b;
import com.bytedance.als.dsl.C2552c;
import com.bytedance.als.dsl.C2553d;
import com.bytedance.als.dsl.C2555f;
import com.bytedance.als.dsl.C2556g;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.bpea.basics.C13349j;
import com.bytedance.bpea.basics.C13350k;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.p878a.C13401b;
import com.bytedance.common.utility.C13617h;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.filter.p942a.AbstractC14217g;
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
import com.bytedance.ies.abmock.C16048b;
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
import com.p2082ss.android.ugc.aweme.adaptation.analysis.Analysis;
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
import com.p2082ss.android.ugc.aweme.poi_api.service.C63134c;
import com.p2082ss.android.ugc.aweme.port.internal.AbstractC63281h;
import com.p2082ss.android.ugc.aweme.port.internal.IVideoRecordPreferences;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.property.AbstractC65488n;
import com.p2082ss.android.ugc.aweme.property.C65356az;
import com.p2082ss.android.ugc.aweme.property.C65360bc;
import com.p2082ss.android.ugc.aweme.property.C65366bf;
import com.p2082ss.android.ugc.aweme.property.C65476i;
import com.p2082ss.android.ugc.aweme.property.C65493p;
import com.p2082ss.android.ugc.aweme.setting.p3721i.C68106m;
import com.p2082ss.android.ugc.aweme.sharedar.SharedARModel;
import com.p2082ss.android.ugc.aweme.shortvideo.AbstractC70630dc;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.C69926ch;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.C70636dh;
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
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.model.GreenScreenMaterial;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AbstractC72264w;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C72084ao;
import com.p2082ss.android.ugc.aweme.shortvideo.p3833f.C71833a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3837j.C71902h;
import com.p2082ss.android.ugc.aweme.shortvideo.p3837j.C71903i;
import com.p2082ss.android.ugc.aweme.shortvideo.p3839l.C71922a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3848n.C72454b;
import com.p2082ss.android.ugc.aweme.shortvideo.p3850p.C72477c;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.AudioFocusManager;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.C73657f;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.C73698ge;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.p3877a.AbstractC73359ac;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.p3877a.AbstractC73376c;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.p3877a.AbstractC73377d;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.p3877a.AbstractC73389f;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.p3877a.AbstractC73411i;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.p3877a.C73360ad;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.p3877a.C73378e;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.p3877a.C73390g;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.p3877a.C73392h;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.p3877a.C73412j;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.p3877a.C73438r;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.permissionmanager.C73773g;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.permissionmanager.C73787i;
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
import com.p2082ss.android.ugc.aweme.sticker.p3954d.AbstractC75301e;
import com.p2082ss.android.ugc.aweme.sticker.p3970p.C75466g;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75593g;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75618a;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75621d;
import com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.backgroundvideo.C75938j;
import com.p2082ss.android.ugc.aweme.sticker.types.unlock.C76108c;
import com.p2082ss.android.ugc.aweme.tools.EnumC78601i;
import com.p2082ss.android.ugc.aweme.tools.p4099d.C78104a;
import com.p2082ss.android.ugc.aweme.tools.p4099d.C78105b;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80296ce;
import com.p2082ss.android.ugc.aweme.utils.C80461fw;
import com.p2082ss.android.ugc.aweme.utils.C80510gr;
import com.p2082ss.android.ugc.aweme.utils.C80571if;
import com.p2082ss.android.ugc.aweme.view.ProgressDialogC81146b;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.gamora.recorder.choosemusic.AbstractC83490a;
import com.p2082ss.android.ugc.gamora.recorder.choosemusic.recommend.AbstractC83566a;
import com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83406b;
import com.p2082ss.android.ugc.gamora.recorder.p4298e.AbstractC83634a;
import com.p2082ss.android.ugc.gamora.recorder.p4300g.AbstractC83678a;
import com.p2082ss.android.ugc.gamora.recorder.p4302i.AbstractC83727a;
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
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity */
public class VideoRecordNewActivity extends AbstractActivityC73487ba implements AbstractC63281h, AbstractC72264w, AbstractC73758l, AbstractC73759m, AbstractC73760n, AbstractC84919c, AbstractC90252i, AbstractC90253j {

    /* renamed from: A */
    public boolean f164787A = false;

    /* renamed from: B */
    AbstractC83566a f164788B;

    /* renamed from: C */
    public String f164789C;

    /* renamed from: D */
    public ArrayList<StickerWrapper> f164790D = new ArrayList<>();

    /* renamed from: E */
    public long f164791E;

    /* renamed from: F */
    public AbstractC14209z f164792F;

    /* renamed from: G */
    public AbstractC14193m f164793G;

    /* renamed from: H */
    public AbstractC73411i f164794H;

    /* renamed from: I */
    public AbstractC14099a f164795I;

    /* renamed from: J */
    public AbstractC84089j f164796J;

    /* renamed from: K */
    private List<AbstractC84918b> f164797K = new ArrayList();

    /* renamed from: L */
    private List<AbstractC84917a> f164798L = new ArrayList();

    /* renamed from: M */
    private FrameLayout f164799M;

    /* renamed from: N */
    private AbstractC22233n f164800N;

    /* renamed from: O */
    private boolean f164801O = false;

    /* renamed from: P */
    private boolean f164802P = false;

    /* renamed from: Q */
    private int f164803Q;

    /* renamed from: R */
    private boolean f164804R;

    /* renamed from: S */
    private boolean f164805S;

    /* renamed from: T */
    private C70692n f164806T;

    /* renamed from: U */
    private AbstractC83678a f164807U;

    /* renamed from: V */
    private final C80571if f164808V = new C80571if();

    /* renamed from: W */
    private boolean f164809W = false;

    /* renamed from: e */
    public final AbstractC89244h<ApiCenter> f164810e = C89250i.m154773a((AbstractC89171a) new C73666fc(this));

    /* renamed from: f */
    public C21582f f164811f;

    /* renamed from: g */
    public ShortVideoContext f164812g;

    /* renamed from: h */
    public SafeHandler f164813h = new SafeHandler(this);

    /* renamed from: i */
    public C74322m f164814i;

    /* renamed from: j */
    public FrameLayout f164815j;

    /* renamed from: k */
    public SurfaceView f164816k;

    /* renamed from: l */
    ProgressDialogC81146b f164817l = null;

    /* renamed from: m */
    public FrameLayout f164818m;

    /* renamed from: n */
    public List<String> f164819n;

    /* renamed from: o */
    public Effect f164820o;

    /* renamed from: p */
    public ArrayList<GreenScreenMaterial> f164821p = new ArrayList<>();

    /* renamed from: q */
    boolean f164822q;

    /* renamed from: r */
    public String f164823r;

    /* renamed from: s */
    public String f164824s;

    /* renamed from: t */
    public C71922a f164825t = new C71922a();

    /* renamed from: u */
    public C69926ch f164826u;

    /* renamed from: v */
    public C72084ao f164827v;

    /* renamed from: w */
    Effect f164828w;

    /* renamed from: x */
    FrameLayout f164829x;

    /* renamed from: y */
    public volatile boolean f164830y = true;

    /* renamed from: z */
    boolean f164831z;

    static {
        Covode.recordClassIndex(86080);
    }

    @Override // com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b
    public final boolean bA_() {
        return true;
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(215, new RunnableC90250g(VideoRecordNewActivity.class, "receiveToast", C76108c.class, ThreadMode.POSTING, 0, true));
        hashMap.put(216, new RunnableC90250g(VideoRecordNewActivity.class, "onEvent", C71902h.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.AbstractC73760n
    /* renamed from: m */
    public final String mo115995m() {
        return "VideoRecordNewActivity";
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.AbstractC73758l
    /* renamed from: j */
    public final C21582f mo87538j() {
        return this.f164811f;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.AbstractC73759m
    /* renamed from: k */
    public final FrameLayout mo115993k() {
        return this.f164799M;
    }

    @Override // com.p2082ss.android.ugc.aweme.port.internal.AbstractC63281h
    /* renamed from: p */
    public final AbstractC74319k mo87547p() {
        return this.f164814i;
    }

    /* renamed from: a */
    public final void mo115991a(boolean z, boolean z2) {
        if (z) {
            SurfaceView surfaceView = this.f164816k;
            int i = this.f164812g.f155817b.f155647c;
            int i2 = this.f164812g.f155817b.f155648d;
            if (surfaceView != null) {
                Context context = surfaceView.getContext();
                int e = C70636dh.m124836e(context);
                int b = C70636dh.m124831b(context);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                if (e * 9 < b * 16 || i >= i2) {
                    layoutParams.width = b;
                    layoutParams.height = (i2 * b) / i;
                    layoutParams.topMargin = (e - layoutParams.height) / 2;
                    layoutParams.topMargin = layoutParams.topMargin >= 0 ? layoutParams.topMargin : 0;
                    layoutParams.leftMargin = 0;
                } else {
                    layoutParams.width = (i * e) / i2;
                    layoutParams.height = e;
                    layoutParams.leftMargin = (b - layoutParams.width) / 2;
                    layoutParams.topMargin = 0;
                }
                int i3 = Build.VERSION.SDK_INT;
                layoutParams.setMarginStart(layoutParams.leftMargin);
                surfaceView.setLayoutParams(layoutParams);
            }
            m129435c(false);
        }
        if (z2) {
            cB_();
            m129435c(true);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b
    public final int bB_() {
        return C0643b.m2378c(this, R.color.c9);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AbstractC72264w
    /* renamed from: g */
    public final void mo114266g() {
        C72084ao aoVar = this.f164827v;
        if (aoVar != null) {
            aoVar.f161599Z = false;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AbstractC72264w
    /* renamed from: i */
    public final boolean mo114267i() {
        C72084ao aoVar = this.f164827v;
        if (aoVar != null) {
            return aoVar.f161599Z;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.AbstractC73759m
    /* renamed from: l */
    public final FrameLayout.LayoutParams mo115994l() {
        SurfaceView surfaceView = this.f164816k;
        if (surfaceView == null) {
            return null;
        }
        return (FrameLayout.LayoutParams) surfaceView.getLayoutParams();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.f164812g.f155798ah) {
            m129438w();
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.adaptation.AbstractActivityC33414h, androidx.appcompat.app.ActivityC0218d
    public void onStart() {
        C15477a.m28473a(this);
        super.onStart();
        C73806f.m129872a(new C88264d());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final ShortVideoContextViewModel mo116005t() {
        return (ShortVideoContextViewModel) C1181ae.m3881a(this, (C1175ad.AbstractC1177b) null).mo3983a(ShortVideoContextViewModel.class);
    }

    /* renamed from: u */
    public final void mo116006u() {
        AbstractC14193m mVar = this.f164793G;
        if (mVar != null) {
            mVar.mo22890b(false);
        }
    }

    /* renamed from: z */
    private void m129441z() {
        IVideoRecordPreferences iVideoRecordPreferences = (IVideoRecordPreferences) new C14401a((byte) 0).mo23215a(this, IVideoRecordPreferences.class);
        if (iVideoRecordPreferences != null && iVideoRecordPreferences.isFirstEnterRecordPage(true)) {
            iVideoRecordPreferences.setFirstEnterRecordPage(false);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AbstractC72264w
    /* renamed from: a */
    public final AbstractC72264w.C72265a mo114263a() {
        C72084ao aoVar = this.f164827v;
        if (aoVar == null || aoVar.f52549m == null) {
            return new AbstractC72264w.C72265a(null, null);
        }
        return this.f164827v.mo114263a();
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
        C72084ao aoVar = this.f164827v;
        if (aoVar == null || aoVar.f52549m == null) {
            return new AbstractC72264w.C72265a(null, null);
        }
        return this.f164827v.mo114265e();
    }

    @Override // com.p2082ss.android.ugc.aweme.adaptation.AbstractActivityC33414h
    /* renamed from: h */
    public final void mo59496h() {
        C33398a.f79357a.mo59450a(this.f164816k, this.f164812g.f155817b.f155647c, this.f164812g.f155817b.f155648d);
        C69926ch chVar = this.f164826u;
        if (chVar != null) {
            chVar.mo110336F();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final void mo115996n() {
        if (!isFinishing() && getIntent().getBooleanExtra("auto_start_recording", false)) {
            this.f164793G.mo22919z();
        }
    }

    /* renamed from: r */
    public final AbstractC84089j mo116002r() {
        if (this.f164796J == null) {
            this.f164796J = (AbstractC84089j) this.f164811f.mo35252b(AbstractC84089j.class, null);
        }
        return this.f164796J;
    }

    /* renamed from: s */
    public final AbstractC14333c mo116004s() {
        return (AbstractC14333c) this.f164810e.getValue().mo7015b(AbstractC14333c.class);
    }

    /* renamed from: A */
    private boolean m129430A() {
        boolean z;
        if (this.f164812g.f155827l != null) {
            z = true;
        } else {
            z = false;
        }
        if (this.f164812g.f155798ah || this.f164812g.f155799ai || z || C68106m.m120397a()) {
            return false;
        }
        return true;
    }

    /* renamed from: v */
    private void m129437v() {
        this.f164792F.mo22747A().mo56913a(new C31217m(new C72783c(this.f164812g.f155817b.f155652h)), this.f164812g.f155817b.f155652h.mo110096e().getAbsolutePath());
        this.f164792F.mo22838z();
    }

    /* renamed from: w */
    private void m129438w() {
        if (this.f164812g.f155776aJ == null) {
            if (Build.VERSION.SDK_INT < 28 || getWindow().getDecorView().getRootWindowInsets() != null) {
                this.f164792F.mo22747A().getMediaController().mo56588a(0, C80296ce.m139203a((ViewGroup.MarginLayoutParams) this.f164816k.getLayoutParams(), getWindow(), this.f164804R));
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b, com.p2082ss.android.ugc.aweme.adaptation.analysis.AbstractC33401b
    /* renamed from: f */
    public final Analysis mo59474f() {
        if (super.mo59474f() == null) {
            return super.mo59474f();
        }
        HashMap hashMap = new HashMap();
        hashMap.put("creation_id", this.f164812g.f155830o);
        hashMap.put("is_story_shoot", "0");
        return super.mo59474f().setExtraMap(hashMap);
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public void onPause() {
        C15477a.m28477c(this);
        super.onPause();
        C17233a.f41165a = false;
        this.f164802P = false;
        C73964ar.f166038a.mo116394b();
        C73975b.C73976a.f166071a.pause(this, "record", this.f164812g.f155831p, this.f164812g.f155830o);
        C80461fw.m139466a("tool_record_enter");
        C86654a.C86655a.m150135a().mo137922b("tool_record");
        C85555d.m147448b().mo131523a(1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final void mo116001q() {
        if (this.f164817l == null) {
            this.f164817l = ProgressDialogC81146b.C81148b.m140903a(this, ProgressDialogC81146b.EnumC81147a.VISIBLE_AFTER_5S, C73670fg.f165504a);
        }
        this.f164817l.setMessage(getString(R.string.frj));
        this.f164817l.setCancelable(false);
        this.f164817l.setIndeterminate(true);
        this.f164817l.show();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final void mo115997o() {
        MethodCollector.m26663i(9829);
        if (isFinishing()) {
            MethodCollector.m26664o(9829);
            return;
        }
        C73975b.C73976a.f166071a.step("av_video_record_init", "addFragment");
        C84911q.m145921a("addFragment PlanC");
        AbstractC22233n nVar = this.f164800N;
        if (nVar != null) {
            nVar.mo36341b();
            this.f164800N = null;
            ((ViewGroup) findViewById(R.id.dgc)).removeAllViews();
        }
        C69926ch a = m129431a(getIntent());
        this.f164826u = a;
        ((AbstractC70630dc) a).f158093e = new RunnableC73697gd(this);
        C22217i.C22218a a2 = C22217i.m41761a(this, C69926ch.class);
        a2.f52533e = false;
        a2.f52534f = new C73668fe(this);
        a2.f52530b = false;
        a2.f52531c = false;
        a2.f52532d = R.id.dgc;
        this.f164800N = a2.mo36469a();
        MethodCollector.m26664o(9829);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b, androidx.appcompat.app.ActivityC0218d
    public void onStop() {
        C15477a.m28478d(this);
        super.onStop();
        mo116006u();
        AbstractC83678a aVar = this.f164807U;
        if (!(aVar == null || aVar.mo128663a() == -1)) {
            long currentTimeMillis = System.currentTimeMillis() - this.f164807U.mo128663a();
            if (currentTimeMillis < 10000) {
                this.f164808V.mo123790a("click_close_camera", currentTimeMillis);
            }
            this.f164807U.mo128665b();
        }
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

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003b, code lost:
        if (r5.equals("reuse_giphy_gif") == false) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005a, code lost:
        if (r5.equals("prop_reuse") == false) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005d, code lost:
        r6 = "prop_reuse";
     */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m129439x() {
        /*
        // Method dump skipped, instructions count: 134
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.VideoRecordNewActivity.m129439x():void");
    }

    /* renamed from: y */
    private void m129440y() {
        ArrayList<GreenScreenMaterial> arrayList;
        C73975b.C73976a.f166071a.step("av_video_record_init", "init stickerModule start");
        C84025h hVar = (C84025h) this.f164811f.mo35249a((Type) C84025h.class, (String) null);
        if (C75466g.m132347a("gs_enable_tt_effect_page_filter", this.f164820o) && C84904k.m145910b(this.f164821p) && (arrayList = this.f164821p) != null) {
            ArrayList<C75938j> arrayList2 = hVar.f187587J;
            ArrayList arrayList3 = new ArrayList(C89070n.m154526a((Iterable) arrayList, 10));
            for (T t : arrayList) {
                arrayList3.add(new C75938j(t.getLocalPath(), 0, t.getType(), t.getResId(), t.getAuthorName(), "prop_reuse"));
            }
            arrayList2.addAll(arrayList3);
        }
        hVar.mo128906a(new AbstractC75593g() {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.VideoRecordNewActivity.C733506 */

            static {
                Covode.recordClassIndex(86086);
            }

            @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75593g
            /* renamed from: b */
            public final void mo87554b() {
                VideoRecordNewActivity.this.f164793G.mo22885a("sticker stop record");
            }

            @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75593g
            /* renamed from: c */
            public final boolean mo87555c() {
                if (VideoRecordNewActivity.this.f164812g != null && !C84904k.m145909a(VideoRecordNewActivity.this.f164812g.f155817b.mo109891d())) {
                    return true;
                }
                return false;
            }

            @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75593g
            /* renamed from: a */
            public final boolean mo87553a() {
                if (VideoRecordNewActivity.this.f164826u == null || VideoRecordNewActivity.this.f164826u.mo111443G() == null || VideoRecordNewActivity.this.f164793G == null) {
                    return true;
                }
                return VideoRecordNewActivity.this.f164793G.mo22891c().f7727a.getValue().booleanValue();
            }
        });
        this.f164793G.mo22912s().mo6997a(this, new C73681fr(hVar));
        hVar.mo23168u().mo118615a(new AbstractC75301e() {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.VideoRecordNewActivity.C733495 */

            static {
                Covode.recordClassIndex(86085);
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
            List<Fragment> a = C73963aq.m130084a(f, C73673fj.f165507a);
            if (C13617h.m24466b(a)) {
                AbstractC0976n a2 = getSupportFragmentManager().mo3552a();
                for (Fragment fragment : a) {
                    a2.mo3455a(fragment);
                }
                a2.mo3473c();
            }
        }
        C73975b.C73976a.f166071a.step("av_video_record_init", "init stickerModule end");
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.AbstractActivityC73487ba
    public void finish() {
        String a = m129432a(getIntent(), "backurl");
        if (m129436c(getIntent())) {
            AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getMiniAppService().mo93846a(((C71518t) getIntent().getSerializableExtra("micro_app_info")).getAppId());
        }
        int intExtra = getIntent().getIntExtra("translation_type", 0);
        super.finish();
        if (this.f164826u != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                mo116006u();
            } else {
                runOnUiThread(new RunnableC73680fq(this));
            }
        }
        if (!TextUtils.isEmpty(a) && !m129436c(getIntent()) && !TextUtils.isEmpty(a) && !TextUtils.equals("__BACKURL__", a)) {
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
        if (intExtra == 3) {
            C56813a.m135921b(this, 3);
        } else if (intExtra == 7) {
            C56813a.m135921b(this, 7);
        } else if (intExtra == 8) {
            C56813a.m135921b(this, 8);
        } else if (intExtra == 9) {
            C56813a.m135921b(this, 9);
        } else if (intExtra == 5) {
            C56813a.m135921b(this, 5);
        }
        C70005cr.m123611a().mo110456f();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b, com.p2082ss.android.ugc.aweme.adaptation.AbstractActivityC33414h, androidx.appcompat.app.ActivityC0218d, com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.AbstractActivityC73487ba
    public void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
        C73754h.m129790a();
        m129441z();
        C72454b.f162433c.mo114728a();
        C63238c.f143581h.mo101552k().mo101566b();
        this.f164826u = null;
        EventBus.m156962a().mo145395b(this);
        C73964ar.f166038a.mo116392a();
        C63238c.f143592s.mo93844c();
        C80510gr.m139536b();
        AVExternalServiceImpl.m113114a().publishService().setFromCommercialSoundPage(false);
        AVExternalServiceImpl.m113114a().publishService().setHasOpenCommercialSoundPage(false);
        C63244g.m114602a().mo73287o().mo104782b();
        AVCommerceServiceImpl.m102988h().mo93966c();
        AVCommerceServiceImpl.m102988h().mo93970g();
        C73975b.C73976a.f166071a.leave(this, "record");
        C88151a.m153228a();
        if (!this.f164809W) {
            C70005cr.m123611a().mo110453c();
            this.f164809W = false;
        }
        C72477c.m127864a("normal").mo114738a("at_shoot_page");
        C70005cr.m123611a().f156490i = false;
        C70005cr.m123611a().f156491j = false;
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b, com.p2082ss.android.ugc.aweme.adaptation.AbstractActivityC33414h
    public void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity", "onResume", true);
        C84911q.m145921a("VideoRecordNewActivity => onResume start");
        super.onResume();
        if (this.f164812g.f155752M) {
            AbstractC81915c.m141874a(new C71903i());
        }
        C86654a.C86655a.m150135a().mo137921a("tool_record");
        C17233a.f41165a = true;
        this.f164802P = true;
        if (this.f164801O) {
            C63238c.f143568F.mo101711a(this, C63238c.f143568F.mo101709a());
            this.f164801O = false;
        }
        C39162r.m79460a("av_memory_log", new C84425b().mo129406a("scene", "resume_record").mo129406a("shoot_way", this.f164812g.f155831p).mo129406a("creation_id", this.f164812g.f155830o).mo129406a("enter_from", this.f164812g.f155837v).mo129404a("dalvikPss", C73964ar.f166038a.f166040c).mo129404a("nativePss", C73964ar.f166038a.f166041d).mo129404a("otherPss", C73964ar.f166038a.f166043f).mo129404a("totalPss", C73964ar.f166038a.f166042e).f188764a);
        C84911q.m145921a("VideoRecordNewActivity => onResume end");
        C73964ar.f166038a.mo116393a(this, this.f164799M);
        if (this.f164812g != null) {
            this.f164792F.mo22747A().mo56938f(this.f164812g.f155817b.mo109888a());
            this.f164792F.mo22747A().mo56941g(this.f164812g.f155817b.mo109888a());
        }
        boolean a = C46981gn.m90261a();
        boolean a2 = C46982go.m90262a();
        if (a || a2) {
            C73773g.m129834a(this, new C73676fm(this));
        } else {
            Context applicationContext = getApplicationContext();
            if (C58003a.f132201c && applicationContext == null) {
                applicationContext = C58003a.f132199a;
            }
            if (!C73787i.m129844a(applicationContext, true)) {
                C73980bc.m130118a(this, new C73677fn(this), new C73679fp(this));
            }
        }
        C85555d.m147448b().mo131523a(0);
        this.f164808V.mo123791a("click_plus", System.currentTimeMillis() - getIntent().getLongExtra("extra_start_record_time", 0), true);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity", "onResume", false);
    }

    /* renamed from: b */
    private static Bundle m129434b(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84919c
    /* renamed from: c */
    public final void mo87535c(AbstractC84917a aVar) {
        this.f164798L.remove(aVar);
    }

    /* renamed from: c */
    private void m129435c(boolean z) {
        AbstractC83727a aVar = (AbstractC83727a) mo115990a(AbstractC83727a.class);
        if (aVar != null) {
            aVar.mo128698a(z);
        }
    }

    /* renamed from: a */
    public final <T> T mo115990a(Class<T> cls) {
        C69926ch chVar = this.f164826u;
        if (chVar == null) {
            return null;
        }
        return (T) chVar.mo62771E().mo35252b(cls, null);
    }

    @Override // com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84919c
    /* renamed from: b */
    public final void mo87533b(AbstractC84917a aVar) {
        this.f164798L.add(aVar);
    }

    /* renamed from: c */
    private static boolean m129436c(Intent intent) {
        if (intent == null || intent.getSerializableExtra("micro_app_info") == null) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84919c
    /* renamed from: b */
    public final void mo87534b(AbstractC84918b bVar) {
        this.f164797K.remove(bVar);
    }

    /* renamed from: a */
    private C69926ch m129431a(Intent intent) {
        if (intent == null) {
            ShortVideoContext shortVideoContext = this.f164812g;
            Intent intent2 = getIntent();
            this.f164792F.mo22747A();
            return new C69926ch(shortVideoContext, intent2, this.f164811f, C73671fh.f165505a);
        }
        ShortVideoContext shortVideoContext2 = this.f164812g;
        this.f164792F.mo22747A();
        return new C69926ch(shortVideoContext2, intent, this.f164811f, C73672fi.f165506a);
    }

    @Override // com.p2082ss.android.ugc.aweme.adaptation.AbstractActivityC33414h
    /* renamed from: b */
    public final void mo59493b(boolean z) {
        this.f164804R = z;
        C69926ch chVar = this.f164826u;
        if (chVar != null) {
            chVar.mo110338b(z);
        }
        m129438w();
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f164791E = System.currentTimeMillis();
            AbstractC83634a aVar = (AbstractC83634a) mo115990a(AbstractC83634a.class);
            if (aVar != null) {
                aVar.dismissSuperEntranceEvent();
            }
            AbstractC83634a aVar2 = (AbstractC83634a) mo115990a(AbstractC83634a.class);
            if (aVar2 != null) {
                aVar2.dismissUploadPopEntranceEvent();
            }
            AbstractC83634a aVar3 = (AbstractC83634a) mo115990a(AbstractC83634a.class);
            if (aVar3 != null) {
                aVar3.dismissLivePopupEvent();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f164803Q != configuration.screenWidthDp) {
            this.f164803Q = configuration.screenWidthDp;
            C33398a.f79357a.mo59450a(this.f164816k, this.f164812g.f155817b.f155647c, this.f164812g.f155817b.f155648d);
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b, androidx.appcompat.app.ActivityC0218d
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.remove("android:fragments");
        if (C16048b.m29633a().mo25421a(true, "disable_remove_fragment_inrecord_page", true)) {
            bundle.remove("android:support:fragments");
        }
        this.f164809W = true;
        bundle.putParcelable("save_state_short_video_context", this.f164812g);
        getIntent();
        C84412c.m145203a(this, bundle);
    }

    @AbstractC90264r(mo145423b = true)
    public void receiveToast(C76108c cVar) {
        if (TextUtils.equals(cVar.f170995a, "sticker_unlocked")) {
            this.f164801O = true;
            this.f164828w = cVar.f170996b;
            if (this.f164802P && !cVar.f170998d) {
                C63238c.f143568F.mo101711a(this, C63238c.f143568F.mo101709a());
                this.f164801O = false;
            }
            EventBus.m156962a().mo145399f(cVar);
        }
    }

    @Override // com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84919c
    /* renamed from: a */
    public final void mo87531a(AbstractC84917a aVar) {
        this.f164798L.add(0, aVar);
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public void onEvent(C71902h hVar) {
        C69926ch chVar;
        if (C65366bf.m117062a() && this.f164812g.f155817b.mo109896h() > 0 && this.f164812g.f155817b.mo109896h() >= this.f164812g.f155817b.mo109899k() && (chVar = this.f164826u) != null && chVar.mo62771E().mo35249a((Type) AbstractC83406b.class, (String) null) != null && this.f164826u.mo62771E().mo35249a((Type) AbstractC83881a.class, (String) null) != null) {
            ((AbstractC83406b) this.f164826u.mo62771E().mo35249a((Type) AbstractC83406b.class, (String) null)).updateBottomTab();
            ((AbstractC83881a) this.f164826u.mo62771E().mo35249a((Type) AbstractC83881a.class, (String) null)).mo123013d();
        }
        if (hVar.f161103a != null) {
            this.f164812g.f155794ad.f155707c = hVar.f161103a;
        }
    }

    @Override // com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84919c
    /* renamed from: a */
    public final void mo87532a(AbstractC84918b bVar) {
        this.f164797K.add(bVar);
    }

    /* renamed from: a */
    private void m129433a(Bundle bundle) {
        List<String> list;
        boolean z;
        boolean z2;
        if (bundle != null) {
            ShortVideoContext shortVideoContext = (ShortVideoContext) bundle.getParcelable("save_state_short_video_context");
            this.f164812g = shortVideoContext;
            if (!(shortVideoContext == null || shortVideoContext.f155765Z == null)) {
                C70005cr.m123611a().mo110454d();
            }
            StringBuilder sb = new StringBuilder("initData with outState,shortVideoContext is NULL:");
            if (this.f164812g == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            C84911q.m145921a(sb.append(z2).toString());
        }
        if (this.f164812g == null) {
            C63244g.m114602a().mo73293u();
            this.f164812g = C70643dn.m124852a(getIntent(), this);
            StringBuilder sb2 = new StringBuilder("initData with intent,shortVideoContext is NULL:");
            if (this.f164812g == null) {
                z = true;
            } else {
                z = false;
            }
            C84911q.m145921a(sb2.append(z).toString());
        }
        if (getIntent().getBooleanExtra("reuse_mvtheme_enter", false)) {
            this.f164812g.f155827l = (Effect) getIntent().getParcelableExtra("extra_mv_effect");
        }
        this.f164823r = m129432a(getIntent(), "extra_sticker_from");
        this.f164824s = m129432a(getIntent(), "grade_key");
        m129439x();
        C70005cr.m123611a().f156486e = this.f164812g.f155831p;
        C71833a.m126847a(this.f164812g.f155830o);
        ShortVideoContextViewModel t = mo116005t();
        t.f155842a = this.f164812g;
        t.mo110047a(this.f164812g.f155763X);
        this.f164822q = getIntent().getBooleanExtra("sticker_pannel_show", false);
        this.f164819n = getIntent().getStringArrayListExtra("reuse_sticker_ids");
        Effect effect = (Effect) getIntent().getParcelableExtra("first_sticker");
        this.f164820o = effect;
        if (effect != null && C75466g.m132347a("gs_enable_tt_effect_page_filter", effect)) {
            ArrayList<GreenScreenMaterial> parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("green_screen_material_list");
            this.f164821p = parcelableArrayListExtra;
            this.f164812g.f155835t = VideoPublishEditModel.getGiphyGifIds(parcelableArrayListExtra);
        }
        this.f164789C = m129432a(getIntent(), "update_effect_id");
        this.f164790D = getIntent().getParcelableArrayListExtra("update_effect_extra");
        this.f164805S = getIntent().getBooleanExtra("draft_music_legal", true);
        if (C52912c.f121688a.f121689b.getStickerUpdateApp().booleanValue() && "direct_shoot".equals(this.f164812g.f155831p) && this.f164820o == null && ((list = this.f164819n) == null || list.size() == 0)) {
            String a = C63238c.f143593t.mo93788a((Context) this);
            if (!TextUtils.isEmpty(a)) {
                ArrayList arrayList = new ArrayList();
                this.f164819n = arrayList;
                arrayList.add(a);
            }
        }
        if (!TextUtils.isEmpty(m129432a(getIntent(), "star_atlas_object"))) {
            this.f164812g.f155794ad.f155707c = C63238c.f143585l.mo93817a(this.f164812g.f155794ad.f155707c, m129432a(getIntent(), "star_atlas_object"));
        }
        String a2 = m129432a(getIntent(), "music_origin");
        ShortVideoContext shortVideoContext2 = this.f164812g;
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
        MethodCollector.m26663i(9813);
        super.onNewIntent(intent);
        C84911q.m145921a("VideoRecordNewActivity onNewIntent");
        C84412c.m145202a(this, intent, (Bundle) null);
        if (this.f164812g == null || !C88249a.m153359a(this)) {
            C84911q.m145921a("close record page because of null shortVideoContext instance when invoking onNewIntent method");
            finish();
            MethodCollector.m26664o(9813);
            return;
        }
        int intExtra = intent.getIntExtra("retake_shoot_mode", -1);
        boolean z = false;
        if (intExtra == 1) {
            C70643dn.m124854a(intent, this.f164812g);
            m129437v();
            AbstractC83746a aVar2 = (AbstractC83746a) mo115990a(AbstractC83746a.class);
            if (aVar2 != null) {
                aVar2.mo128713a(this.f164812g.mo110038n());
                aVar2.mo128711a(0);
            }
            if (this.f164826u != null) {
                this.f164793G.mo22917x();
            }
            this.f164794H.mo116037a(true);
        } else if (intExtra == 2) {
            C70643dn.m124861b(intent, this.f164812g);
            m129437v();
            if (this.f164826u != null) {
                if (!this.f164812g.mo110022c() || this.f164812g.f155743D.f155847b == null) {
                    a = C14201t.m25948a((List<TimeSpeedModelExtension>) this.f164812g.f155817b.mo109891d(), this.f164812g.f155817b.mo109896h(), false);
                } else {
                    a = C14201t.m25947a(this.f164812g.f155817b.mo109891d(), this.f164812g.f155817b.mo109896h(), this.f164812g.f155743D.f155847b);
                }
                this.f164793G.mo22877a(a);
                AbstractC83490a aVar3 = (AbstractC83490a) this.f164810e.getValue().mo7015b(AbstractC83490a.class);
                if (aVar3 != null) {
                    aVar3.changeMusicUi();
                }
            }
            this.f164794H.mo116037a(false);
        }
        if (this.f164812g.f155817b.mo109893e() == null && (aVar = (AbstractC83490a) mo115990a(AbstractC83490a.class)) != null) {
            aVar.handleCancelMusicResultEvent();
        }
        m129441z();
        boolean booleanExtra = intent.getBooleanExtra("recreate_record_and_clear", false);
        this.f164822q = intent.getBooleanExtra("sticker_pannel_show", false);
        boolean booleanExtra2 = intent.getBooleanExtra("enter_record_from_other_platform", false);
        if (booleanExtra) {
            C84911q.m145921a("VideoRecordNewActivity isClear");
            setIntent(intent);
            int intExtra2 = getIntent().getIntExtra("translation_type", 0);
            if (intExtra2 == 3) {
                C56813a.m135920a(this, 3);
            } else if (intExtra2 == 7) {
                C56813a.m135920a(this, 7);
            } else if (intExtra2 == 8) {
                C56813a.m135920a(this, 8);
            } else if (intExtra2 == 9) {
                C56813a.m135920a(this, 9);
            }
            AbstractC14209z zVar = this.f164792F;
            if (zVar != null) {
                zVar.mo22781a(EnumC78601i.NORMAL);
            }
            this.f164793G.mo22895d(true);
            TEMonitorInvoker.nativeReset();
            if (mo116002r() != null) {
                mo116002r().mo23133o();
            }
            C63238c.f143565C.mo73290r().mo86005c().mo86020a();
            m129433a((Bundle) null);
            mo115997o();
        } else if (this.f164812g == null) {
            m129433a((Bundle) null);
        }
        ShortVideoContext shortVideoContext = this.f164812g;
        if (booleanExtra2 || shortVideoContext.f155796af != null) {
            z = true;
        }
        shortVideoContext.f155797ag = z;
        if (this.f164822q && mo116004s() != null) {
            mo116004s().mo23139a(true);
        }
        MethodCollector.m26664o(9813);
    }

    @Override // com.p2082ss.android.ugc.aweme.adaptation.AbstractActivityC33414h
    /* renamed from: a */
    public final void mo59491a(boolean z) {
        C69926ch chVar = this.f164826u;
        if (chVar != null) {
            chVar.mo110337a(z);
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b, com.p2082ss.android.ugc.aweme.adaptation.AbstractActivityC33414h, androidx.appcompat.app.ActivityC0218d, com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.AbstractActivityC73487ba
    public void onCreate(Bundle bundle) {
        long j;
        String str;
        int i;
        MethodCollector.m26663i(9825);
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity", "onCreate", true);
        C70005cr.m123611a().mo110453c();
        C73975b.C73976a.f166071a.enter(this, "record");
        C80461fw.m139467a("tool_record_enter", C65360bc.m117058b(), (long) C65360bc.m117059c());
        C84412c.m145202a(this, getIntent(), bundle);
        m129433a(bundle);
        C63244g.m114602a().mo73287o().mo104783c();
        C84911q.m145921a("VideoRecordNewActivity => onCreate start, creation: " + this.f164812g.f155830o + " shootway: " + this.f164812g.f155831p);
        C73975b.C73976a.f166071a.step("av_video_record_init", "init recorderModule start");
        C70612k.f158036f.mo111417a(this);
        C69905c cVar = C70005cr.m123611a().f156482a;
        if (cVar != null && cVar.getDuration() > 0) {
            this.f164812g.f155822g = cVar.getDuration();
        }
        C63238c.m114594d();
        C31165b.f74716b = C65493p.m117218a();
        C89219l.m154721d(this, "");
        C2555f.m7465a(this, C73698ge.C73710l.f165550a);
        C2556g.m7471a(this, new C73698ge.C73711m(this));
        C2551b bVar = new C2551b(C2552c.m7460a(this));
        C2553d dVar = new C2553d();
        AlsLogicContainer alsLogicContainer = bVar.f7720a;
        alsLogicContainer.f7696d.mo35260a(C73438r.class, (String) null, (AbstractC21603p) new C73698ge.C73708j(dVar, this));
        alsLogicContainer.mo7005a(AbstractC14209z.class, C73438r.class);
        C2553d dVar2 = new C2553d();
        AlsLogicContainer alsLogicContainer2 = bVar.f7720a;
        alsLogicContainer2.f7696d.mo35260a(C74228n.class, (String) null, (AbstractC21603p) new C73698ge.C73709k(dVar2, this));
        alsLogicContainer2.mo7005a(AbstractC74227m.class, C74228n.class);
        C2553d dVar3 = new C2553d();
        AlsLogicContainer alsLogicContainer3 = bVar.f7720a;
        alsLogicContainer3.f7696d.mo35260a(C73360ad.class, (String) null, (AbstractC21603p) new C73698ge.C73701c(dVar3));
        alsLogicContainer3.mo7005a(AbstractC73359ac.class, C73360ad.class);
        C2553d dVar4 = new C2553d();
        AlsLogicContainer alsLogicContainer4 = bVar.f7720a;
        alsLogicContainer4.f7696d.mo35260a(C14243a.class, (String) null, (AbstractC21603p) new C73698ge.C73702d(dVar4));
        alsLogicContainer4.mo7005a(AbstractC14217g.class, C14243a.class);
        C2553d dVar5 = new C2553d();
        AlsLogicContainer alsLogicContainer5 = bVar.f7720a;
        alsLogicContainer5.f7696d.mo35260a(C14117i.class, (String) null, (AbstractC21603p) new C73698ge.C73703e(dVar5));
        alsLogicContainer5.mo7005a(AbstractC14099a.class, C14117i.class);
        C2553d dVar6 = new C2553d();
        AlsLogicContainer alsLogicContainer6 = bVar.f7720a;
        alsLogicContainer6.f7696d.mo35260a(C84025h.class, (String) null, (AbstractC21603p) new C73698ge.C73704f(dVar6));
        alsLogicContainer6.mo7005a(AbstractC84089j.class, C84025h.class);
        C2553d dVar7 = new C2553d();
        AlsLogicContainer alsLogicContainer7 = bVar.f7720a;
        alsLogicContainer7.f7696d.mo35260a(C73392h.class, (String) null, (AbstractC21603p) new C73698ge.C73705g(dVar7));
        alsLogicContainer7.mo7005a(AbstractC73376c.class, C73392h.class);
        C2553d dVar8 = new C2553d();
        AlsLogicContainer alsLogicContainer8 = bVar.f7720a;
        alsLogicContainer8.f7696d.mo35260a(C73412j.class, (String) null, (AbstractC21603p) new C73698ge.C73706h(dVar8));
        alsLogicContainer8.mo7005a(AbstractC73411i.class, C73412j.class);
        C2553d dVar9 = new C2553d();
        AlsLogicContainer alsLogicContainer9 = bVar.f7720a;
        alsLogicContainer9.f7696d.mo35260a(C73378e.class, (String) null, (AbstractC21603p) new C73698ge.C73707i(dVar9));
        alsLogicContainer9.mo7005a(AbstractC73377d.class, C73378e.class);
        C2553d dVar10 = new C2553d();
        AlsLogicContainer alsLogicContainer10 = bVar.f7720a;
        alsLogicContainer10.f7696d.mo35260a(C83950a.class, (String) null, (AbstractC21603p) new C73698ge.C73699a(dVar10));
        alsLogicContainer10.mo7005a(AbstractC75314e.class, C83950a.class);
        C2553d dVar11 = new C2553d();
        AlsLogicContainer alsLogicContainer11 = bVar.f7720a;
        alsLogicContainer11.f7696d.mo35260a(C73390g.class, (String) null, (AbstractC21603p) new C73698ge.C73700b(dVar11));
        alsLogicContainer11.mo7005a(AbstractC73389f.class, C73390g.class);
        bVar.mo7031a();
        this.f164811f = C2552c.m7460a(this).f7697e;
        C63244g.m114602a();
        this.f164792F = (AbstractC14209z) this.f164811f.mo35247a(AbstractC14209z.class);
        this.f164793G = (AbstractC14193m) this.f164811f.mo35247a(AbstractC14193m.class);
        this.f164794H = (AbstractC73411i) this.f164811f.mo35247a(AbstractC73411i.class);
        this.f164814i = this.f164792F.mo22941an();
        this.f164816k = this.f164792F.mo22749C();
        boolean a = new C73936aa(this.f164812g).mo116384a();
        SafeHandler safeHandler = this.f164813h;
        RunnableC73678fo foVar = new RunnableC73678fo(this);
        if (a) {
            j = InteractFirstFrameTimeOutDurationSetting.DEFAULT;
        } else {
            j = 0;
        }
        safeHandler.postDelayed(foVar, j);
        if (a) {
            this.f164792F.mo22741a(false, new PrivacyCert(new C13349j("1005"), "Open the camera on the shooting page to preview and shoot the video.", new C13350k[]{C13401b.m24107a()}), true);
        }
        this.f164792F.mo22814e().mo7036a(this, new C73688fy(this));
        this.f164792F.mo22826n().mo6997a(this, new C73689fz(this));
        ASCameraView A = this.f164792F.mo22747A();
        if (this.f164812g.f155830o == null) {
            str = "";
        } else {
            str = this.f164812g.f155830o;
        }
        A.setControllerCallback(new C72770ar(str));
        this.f164795I = (AbstractC14099a) this.f164811f.mo35247a(AbstractC14099a.class);
        if (C70659a.m124890a(this.f164812g)) {
            C70692n nVar = new C70692n(this, this.f164792F.mo22747A(), mo116002r(), this.f164814i, new C70660aa(this, this.f164792F), this.f164811f);
            this.f164806T = nVar;
            nVar.mo111514a();
        }
        this.f164792F.mo22756J().mo6997a(this, new C73694ga(this));
        this.f164793G.mo22909p().mo6997a(this, new C73695gb(this));
        C73975b.C73976a.f166071a.step("av_video_record_init", "init recorderModule end");
        C63238c.f143565C.mo73276d().mo101836e();
        C70005cr.m123611a().f156493m = false;
        C73975b.C73976a.f166071a.step("av_video_record_init", "onCreate");
        C73806f.m129872a(new C88264d());
        C73806f.m129872a(new C88268h(this));
        C73806f.m129872a(new C88266f(this));
        C63244g.m114602a();
        C65476i.m117206a(this, AbstractC65488n.C65491c.f147706a);
        super.onCreate(bundle);
        C17233a.f41165a = true;
        int intExtra = getIntent().getIntExtra("translation_type", 0);
        byte b = 7;
        if (intExtra == 3) {
            C56813a.m135920a(this, 3);
        } else if (intExtra == 1) {
            C56813a.m135920a(this, 1);
        } else if (intExtra == 6) {
            C56813a.m135920a(this, 6);
        } else if (intExtra == 7) {
            C56813a.m135920a(this, 7);
        } else if (intExtra == 8) {
            C56813a.m135920a(this, 8);
        } else if (intExtra == 9) {
            C56813a.m135920a(this, 9);
        }
        getWindow().addFlags(128);
        setContentView(R.layout.cg);
        if (getResources().getConfiguration() != null) {
            i = getResources().getConfiguration().screenWidthDp;
        } else {
            i = 0;
        }
        this.f164803Q = i;
        if (!C88249a.m153359a(this)) {
            C84911q.m145921a("RecordConditionCheck.check() false");
            finish();
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity", "onCreate", false);
            MethodCollector.m26664o(9825);
            return;
        }
        if (C65356az.m117041a()) {
            b = 15;
        }
        C85315al.m146635a(b);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.dnb);
        this.f164799M = frameLayout;
        if (!this.f164805S) {
            frameLayout.post(new Runnable() {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.VideoRecordNewActivity.RunnableC733451 */

                static {
                    Covode.recordClassIndex(86081);
                }

                public final void run() {
                    new C79459a(VideoRecordNewActivity.this).mo123050a(R.string.dau).mo123053a();
                }
            });
        }
        FrameLayout frameLayout2 = (FrameLayout) findViewById(R.id.c73);
        this.f164815j = frameLayout2;
        frameLayout2.addView(this.f164792F.mo22747A());
        m129440y();
        this.f164812g.f155804an = getIntent().getIntExtra("tabs", 0);
        C73806f.m129872a(new C88260b());
        C73968au.m130095a(this.f164812g);
        C63238c.f143576c.mo93767a("SHOOT");
        getLifecycle().mo4012a(AudioFocusManager.C73302a.m129359a(this));
        this.f164829x = (FrameLayout) findViewById(R.id.c48);
        if (intExtra != 1 || !AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getStoryService().mo93871e()) {
            C73657f.m129768a(this, this.f164829x, m129430A(), !AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getStoryService().mo93871e());
        } else {
            FrameLayout frameLayout3 = this.f164829x;
            boolean A2 = m129430A();
            C89219l.m154721d(this, "");
            C89219l.m154721d(frameLayout3, "");
            if (A2) {
                C73657f.C73662e eVar = new C73657f.C73662e(new C73657f.C73660c(this));
                C0464a aVar = new C0464a(this);
                C73657f.f165488a = true;
                aVar.mo2025a(R.layout.f3, frameLayout3, new C73657f.C73663f(eVar, frameLayout3));
            }
        }
        this.f164813h.post(new RunnableC73667fd(this));
        C71529w.f160314l = true;
        C84911q.m145921a("VideoRecordNewActivity => onCreate end");
        C80510gr.m139526a();
        this.f164812g.f155821f = m129432a(getIntent(), "share_id");
        this.f164812g.f155841z = m129432a(getIntent(), "channel");
        C73806f.m129872a(new C88265e());
        C73806f.m129872a(new C73481b());
        C73806f.m129872a(new C88258a());
        C73806f.m129872a(new C73802c(this));
        C73806f.m129872a(new PreloadMediaDataTask(getLifecycle(), this, System.currentTimeMillis()));
        C73806f.m129872a(new PreloadMusicListTask(getLifecycle()));
        C73806f.m129872a(new C73800b(this));
        C73806f.m129872a(new CacheChooseMediaViewHolderTask(this, getLifecycle()));
        C73975b.C73976a.f166071a.step("av_video_record_init", "onCreate end");
        this.f164792F.mo22752F();
        if (C68106m.m120397a() && !getIntent().getBooleanExtra("auto_start_recording", false)) {
            mo115997o();
            this.f164830y = false;
        }
        this.f164812g.f155775aI = System.currentTimeMillis();
        C72477c.m127864a("normal").mo114739a("at_shoot_page", false);
        String a2 = m129432a(getIntent(), "session");
        String a3 = m129432a(getIntent(), "host_uid");
        String a4 = m129432a(getIntent(), "host_name");
        if (!(a2 == null || this.f164820o == null)) {
            mo116002r().mo128898F().mo109785a(this.f164820o);
            this.f164812g.mo110013a(true);
            SharedARModel sharedARModel = this.f164812g.f155756Q;
            if (sharedARModel != null) {
                sharedARModel.setSharedARSessionId(a2);
                sharedARModel.setSharedARMultiPlayerUserName(a4);
                sharedARModel.setSharedARMultiPlayerUserId(a3);
                mo116001q();
            }
        }
        mo116002r().mo128898F().mo109787b().observe(this, new C73669ff(this));
        C63134c.m114157a().mo101452a(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity", "onCreate", false);
        MethodCollector.m26664o(9825);
    }

    /* renamed from: a */
    private static String m129432a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // androidx.appcompat.app.ActivityC0218d
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        for (AbstractC84917a aVar : this.f164798L) {
            if (aVar.onKeyDown(i, keyEvent)) {
                return true;
            }
        }
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        if (this.f164826u != null) {
            AbstractC14193m mVar = this.f164793G;
            if (!(mVar == null || mVar.mo22891c().f7727a.getValue().booleanValue())) {
                return true;
            }
            AbstractC22233n nVar = this.f164800N;
            if (nVar != null && nVar.mo36340a()) {
                return true;
            }
            AbstractC83678a aVar2 = (AbstractC83678a) this.f164826u.mo62771E().mo35252b(AbstractC83678a.class, null);
            this.f164807U = aVar2;
            if (aVar2 != null) {
                aVar2.mo128664a("system_back_button", System.currentTimeMillis());
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
        for (AbstractC84918b bVar : this.f164797K) {
            if (bVar.mo62778a(i, i2, intent)) {
                return;
            }
        }
        super.onActivityResult(i, i2, intent);
        if (i == 1002 && i2 == -1) {
            ShortVideoContext shortVideoContext = this.f164812g;
            if (shortVideoContext == null || shortVideoContext.f155796af == null) {
                z = false;
            } else {
                z = true;
            }
            if (!(intent == null || m129434b(intent) == null || z)) {
                Intent intent2 = new Intent();
                intent2.setClass(this, C63238c.f143576c.mo93776e());
                intent2.addFlags(67108864);
                intent2.putExtras(m129434b(intent));
                C84349a.m145093a(intent2, this);
                startActivity(intent2);
            }
            finish();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AbstractC72264w
    /* renamed from: a */
    public final void mo114264a(boolean z, MusicModel musicModel, String str) {
        C72084ao aoVar = this.f164827v;
        if (aoVar != null) {
            aoVar.mo114264a(z, musicModel, str);
        }
    }
}
