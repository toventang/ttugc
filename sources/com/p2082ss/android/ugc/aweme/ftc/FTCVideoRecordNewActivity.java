package com.p2082ss.android.ugc.aweme.ftc;

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
import com.bytedance.common.utility.C13617h;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.filter.p942a.AbstractC14210a;
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
import com.bytedance.ies.dmt.p1194ui.p1200f.C17233a;
import com.bytedance.p1559o.AbstractC21603p;
import com.bytedance.p1559o.C21582f;
import com.bytedance.scene.AbstractC22233n;
import com.bytedance.scene.C22217i;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ttve.monitor.TEMonitorInvoker;
import com.p2082ss.android.ugc.asve.recorder.C31217m;
import com.p2082ss.android.ugc.asve.recorder.camera.C31165b;
import com.p2082ss.android.ugc.aweme.adaptation.C33398a;
import com.p2082ss.android.ugc.aweme.beauty.C34806c;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.experiment.C46981gn;
import com.p2082ss.android.ugc.aweme.experiment.C46982go;
import com.p2082ss.android.ugc.aweme.ftc.C51838ab;
import com.p2082ss.android.ugc.aweme.ftc.p3027b.AbstractC51869a;
import com.p2082ss.android.ugc.aweme.ftc.p3032d.AbstractC52502a;
import com.p2082ss.android.ugc.aweme.ftc.p3036h.AbstractC52568a;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.p3290j.C56813a;
import com.p2082ss.android.ugc.aweme.port.internal.AbstractC63281h;
import com.p2082ss.android.ugc.aweme.port.internal.IVideoRecordPreferences;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.property.C65356az;
import com.p2082ss.android.ugc.aweme.property.C65493p;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.C70643dn;
import com.p2082ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.cutmusic.C70612k;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C71518t;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C71529w;
import com.p2082ss.android.ugc.aweme.shortvideo.p3833f.C71833a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3835h.AbstractC71864a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3837j.C71897c;
import com.p2082ss.android.ugc.aweme.shortvideo.p3839l.C71922a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.AbstractActivityC73487ba;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.AudioFocusManager;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.C73481b;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.C73657f;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.C73754h;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.TimeSpeedModelExtension;
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
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.task.C73806f;
import com.p2082ss.android.ugc.aweme.shortvideo.p3889w.AbstractC74227m;
import com.p2082ss.android.ugc.aweme.shortvideo.p3889w.C74228n;
import com.p2082ss.android.ugc.aweme.shortvideo.p3892x.AbstractC74319k;
import com.p2082ss.android.ugc.aweme.shortvideo.p3892x.C74322m;
import com.p2082ss.android.ugc.aweme.shortvideo.record.C72783c;
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
import com.p2082ss.android.ugc.aweme.tools.EnumC78601i;
import com.p2082ss.android.ugc.aweme.tools.p4099d.C78104a;
import com.p2082ss.android.ugc.aweme.tools.p4099d.C78105b;
import com.p2082ss.android.ugc.aweme.utils.C80296ce;
import com.p2082ss.android.ugc.aweme.utils.C80510gr;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.gamora.recorder.p4298e.AbstractC83634a;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4309a.C83950a;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84089j;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.C84025h;
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
import com.p2082ss.ugc.aweme.performance.p4431a.C86654a;
import dmt.p4542av.video.C88151a;
import dmt.p4542av.video.p4547d.C88249a;
import dmt.p4542av.video.p4549f.C88258a;
import dmt.p4542av.video.p4549f.C88260b;
import dmt.p4542av.video.p4549f.C88264d;
import dmt.p4542av.video.p4549f.C88265e;
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

/* renamed from: com.ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity */
public class FTCVideoRecordNewActivity extends AbstractActivityC73487ba implements AbstractC63281h, AbstractC84919c, AbstractC90252i, AbstractC90253j {

    /* renamed from: A */
    public AbstractC14209z f119401A;

    /* renamed from: B */
    public AbstractC14193m f119402B;

    /* renamed from: C */
    public AbstractC73411i f119403C;

    /* renamed from: D */
    public AbstractC14099a f119404D;

    /* renamed from: E */
    AbstractC84089j f119405E;

    /* renamed from: F */
    private List<AbstractC84918b> f119406F = new ArrayList();

    /* renamed from: G */
    private List<AbstractC84917a> f119407G = new ArrayList();

    /* renamed from: H */
    private AbstractC22233n f119408H;

    /* renamed from: I */
    private boolean f119409I = false;

    /* renamed from: J */
    private boolean f119410J = false;

    /* renamed from: K */
    private int f119411K;

    /* renamed from: L */
    private boolean f119412L;

    /* renamed from: e */
    public final AbstractC89244h<ApiCenter> f119413e = C89250i.m154773a((AbstractC89171a) new C52546g(this));

    /* renamed from: f */
    public C21582f f119414f;

    /* renamed from: g */
    public ShortVideoContext f119415g;

    /* renamed from: h */
    public SafeHandler f119416h = new SafeHandler(this);

    /* renamed from: i */
    public C74322m f119417i;

    /* renamed from: j */
    public FrameLayout f119418j;

    /* renamed from: k */
    public FrameLayout f119419k;

    /* renamed from: l */
    public SurfaceView f119420l;

    /* renamed from: m */
    public FrameLayout f119421m;

    /* renamed from: n */
    public List<String> f119422n;

    /* renamed from: o */
    public Effect f119423o;

    /* renamed from: p */
    boolean f119424p;

    /* renamed from: q */
    public String f119425q;

    /* renamed from: r */
    public String f119426r;

    /* renamed from: s */
    public C71922a f119427s = new C71922a();

    /* renamed from: t */
    public C51913c f119428t;

    /* renamed from: u */
    Effect f119429u;

    /* renamed from: v */
    FrameLayout f119430v;

    /* renamed from: w */
    public volatile boolean f119431w = true;

    /* renamed from: x */
    boolean f119432x;

    /* renamed from: y */
    public String f119433y;

    /* renamed from: z */
    public ArrayList<StickerWrapper> f119434z = new ArrayList<>();

    static {
        Covode.recordClassIndex(61176);
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
        hashMap.put(215, new RunnableC90250g(FTCVideoRecordNewActivity.class, "receiveToast", C76108c.class, ThreadMode.POSTING, 0, true));
        hashMap.put(204, new RunnableC90250g(FTCVideoRecordNewActivity.class, "onEvent", C71897c.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.p2082ss.android.ugc.aweme.port.internal.AbstractC63281h
    /* renamed from: p */
    public final AbstractC74319k mo87547p() {
        return this.f119417i;
    }

    @Override // com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b
    public final int bB_() {
        return C0643b.m2378c(this, R.color.c9);
    }

    /* renamed from: l */
    public final AbstractC14210a mo87540l() {
        return (AbstractC14210a) this.f119414f.mo35249a((Type) AbstractC14210a.class, (String) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final ShortVideoContextViewModel mo87543o() {
        return (ShortVideoContextViewModel) C1181ae.m3881a(this, (C1175ad.AbstractC1177b) null).mo3983a(ShortVideoContextViewModel.class);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.adaptation.AbstractActivityC33414h, androidx.appcompat.app.ActivityC0218d
    public void onStart() {
        C15477a.m28473a(this);
        super.onStart();
        C73806f.m129872a(new C88264d());
    }

    /* renamed from: q */
    public final void mo87548q() {
        AbstractC14193m mVar = this.f119402B;
        if (mVar != null) {
            mVar.mo22890b(false);
        }
    }

    /* renamed from: t */
    private void m96501t() {
        IVideoRecordPreferences iVideoRecordPreferences = (IVideoRecordPreferences) new C14401a((byte) 0).mo23215a(this, IVideoRecordPreferences.class);
        if (iVideoRecordPreferences != null && iVideoRecordPreferences.isFirstEnterRecordPage(true)) {
            iVideoRecordPreferences.setFirstEnterRecordPage(false);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b
    /* renamed from: d */
    public final void mo59480d() {
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().setFlags(0, Integer.MIN_VALUE);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.adaptation.AbstractActivityC33414h
    /* renamed from: h */
    public final void mo59496h() {
        C33398a.f79357a.mo59450a(this.f119420l, this.f119415g.f155817b.f155647c, this.f119415g.f155817b.f155648d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo87538j() {
        if (!isFinishing() && getIntent().getBooleanExtra("auto_start_recording", false)) {
            this.f119402B.mo22919z();
        }
    }

    /* renamed from: m */
    public final AbstractC84089j mo87541m() {
        if (this.f119405E == null) {
            this.f119405E = (AbstractC84089j) this.f119414f.mo35252b(AbstractC84089j.class, null);
        }
        return this.f119405E;
    }

    /* renamed from: n */
    public final AbstractC14333c mo87542n() {
        return (AbstractC14333c) this.f119413e.getValue().mo7015b(AbstractC14333c.class);
    }

    /* renamed from: r */
    private void m96499r() {
        this.f119401A.mo22747A().mo56913a(new C31217m(new C72783c(this.f119415g.f155817b.f155652h)), this.f119415g.f155817b.f155652h.mo110096e().getAbsolutePath());
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b, com.p2082ss.android.ugc.aweme.adaptation.AbstractActivityC33414h, androidx.appcompat.app.ActivityC0218d, com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.AbstractActivityC73487ba
    public void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
        C73754h.m129790a();
        m96501t();
        C63238c.f143581h.mo101552k().mo101566b();
        this.f119428t = null;
        EventBus.m156962a().mo145395b(this);
        C73964ar.f166038a.mo116392a();
        C80510gr.m139536b();
        C70005cr.m123611a().mo110456f();
        C73975b.C73976a.f166071a.leave(this, "record");
        C88151a.m153228a();
        C84412c.m145200a(this);
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public void onPause() {
        C15477a.m28477c(this);
        super.onPause();
        C17233a.f41165a = false;
        this.f119410J = false;
        C73964ar.f166038a.mo116394b();
        C73975b.C73976a.f166071a.pause(this, "record", this.f119415g.f155831p, this.f119415g.f155830o);
        C86654a.C86655a.m150135a().mo137922b("tool_record");
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b, androidx.appcompat.app.ActivityC0218d
    public void onStop() {
        C15477a.m28478d(this);
        super.onStop();
        mo87548q();
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

    /* renamed from: s */
    private void m96500s() {
        if (this.f119415g.f155831p != null) {
            String str = FaceStickerBean.sCurPropSource;
            String str2 = this.f119415g.f155831p;
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
    /* renamed from: k */
    public final void mo87539k() {
        MethodCollector.m26663i(11887);
        if (isFinishing()) {
            MethodCollector.m26664o(11887);
            return;
        }
        C73975b.C73976a.f166071a.step("av_video_record_init", "addFragment");
        C84911q.m145921a("addFragment PlanC");
        AbstractC22233n nVar = this.f119408H;
        if (nVar != null) {
            nVar.mo36341b();
            this.f119408H = null;
            ((ViewGroup) findViewById(R.id.dgc)).removeAllViews();
        }
        C51913c a = m96494a(getIntent());
        this.f119428t = a;
        ((AbstractC52500d) a).f120898e = new RunnableC52814x(this);
        C22217i.C22218a a2 = C22217i.m41761a(this, C51913c.class);
        a2.f52533e = false;
        a2.f52534f = new C52815y(this);
        a2.f52530b = false;
        a2.f52531c = false;
        a2.f52532d = R.id.dgc;
        this.f119408H = a2.mo36469a();
        MethodCollector.m26664o(11887);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.f119415g.f155798ah && this.f119415g.f155776aJ == null) {
            if (Build.VERSION.SDK_INT < 28 || getWindow().getDecorView().getRootWindowInsets() != null) {
                this.f119401A.mo22747A().getMediaController().mo56588a(0, C80296ce.m139203a((ViewGroup.MarginLayoutParams) this.f119420l.getLayoutParams(), getWindow(), this.f119412L));
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.AbstractActivityC73487ba
    public void finish() {
        String a = m96495a(getIntent(), "backurl");
        if (m96498c(getIntent())) {
            AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getMiniAppService().mo93846a(((C71518t) getIntent().getSerializableExtra("micro_app_info")).getAppId());
        }
        super.finish();
        if (this.f119428t != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                mo87548q();
            } else {
                runOnUiThread(new RunnableC52742n(this));
            }
        }
        if (!TextUtils.isEmpty(a) && !m96498c(getIntent()) && !TextUtils.isEmpty(a) && !TextUtils.equals("__BACKURL__", a)) {
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity", "onResume", true);
        C84911q.m145921a("VideoRecordNewActivity => onResume start");
        super.onResume();
        C86654a.C86655a.m150135a().mo137921a("tool_record");
        C17233a.f41165a = true;
        this.f119410J = true;
        if (this.f119409I) {
            C63238c.f143568F.mo101711a(this, C63238c.f143568F.mo101709a());
            this.f119409I = false;
        }
        C39162r.m79460a("av_memory_log", new C84425b().mo129406a("scene", "resume_record").mo129406a("shoot_way", this.f119415g.f155831p).mo129406a("creation_id", this.f119415g.f155830o).mo129406a("enter_from", this.f119415g.f155837v).mo129404a("dalvikPss", C73964ar.f166038a.f166040c).mo129404a("nativePss", C73964ar.f166038a.f166041d).mo129404a("otherPss", C73964ar.f166038a.f166043f).mo129404a("totalPss", C73964ar.f166038a.f166042e).f188764a);
        C84911q.m145921a("VideoRecordNewActivity => onResume end");
        C73964ar.f166038a.mo116393a(this, this.f119418j);
        if (this.f119415g != null) {
            this.f119401A.mo22747A().mo56938f(this.f119415g.f155817b.mo109888a());
        }
        boolean a = C46981gn.m90261a();
        boolean a2 = C46982go.m90262a();
        if (a || a2) {
            C73773g.m129834a(this, new C52643k(this));
        } else {
            Context applicationContext = getApplicationContext();
            if (C58003a.f132201c && applicationContext == null) {
                applicationContext = C58003a.f132199a;
            }
            if (!C73787i.m129844a(applicationContext, true)) {
                C73980bc.m130118a(this, new C52654l(this), new C52740m(this));
            }
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity", "onResume", false);
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public void onEvent(C71897c cVar) {
        finish();
    }

    /* renamed from: b */
    private static Bundle m96497b(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84919c
    /* renamed from: c */
    public final void mo87535c(AbstractC84917a aVar) {
        this.f119407G.remove(aVar);
    }

    /* renamed from: c */
    private static boolean m96498c(Intent intent) {
        if (intent == null || intent.getSerializableExtra("micro_app_info") == null) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84919c
    /* renamed from: a */
    public final void mo87532a(AbstractC84918b bVar) {
        this.f119406F.add(bVar);
    }

    @Override // com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84919c
    /* renamed from: b */
    public final void mo87533b(AbstractC84917a aVar) {
        this.f119407G.add(aVar);
    }

    /* renamed from: a */
    private C51913c m96494a(Intent intent) {
        if (intent == null) {
            ShortVideoContext shortVideoContext = this.f119415g;
            Intent intent2 = getIntent();
            this.f119401A.mo22747A();
            return new C51913c(shortVideoContext, intent2);
        }
        ShortVideoContext shortVideoContext2 = this.f119415g;
        this.f119401A.mo22747A();
        return new C51913c(shortVideoContext2, intent);
    }

    @Override // com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84919c
    /* renamed from: b */
    public final void mo87534b(AbstractC84918b bVar) {
        this.f119406F.remove(bVar);
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b, androidx.appcompat.app.ActivityC0218d
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.remove("android:fragments");
        bundle.putParcelable("save_state_short_video_context", this.f119415g);
        getIntent();
        C84412c.m145203a(this, bundle);
    }

    @Override // com.p2082ss.android.ugc.aweme.adaptation.AbstractActivityC33414h
    /* renamed from: a */
    public final void mo59491a(boolean z) {
        AbstractC71864a F;
        C51913c cVar = this.f119428t;
        if (cVar != null && (F = cVar.mo87612F()) != null) {
            F.mo113516d(z);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.adaptation.AbstractActivityC33414h
    /* renamed from: b */
    public final void mo59493b(boolean z) {
        AbstractC71864a F;
        this.f119412L = z;
        C51913c cVar = this.f119428t;
        if (cVar != null && (F = cVar.mo87612F()) != null) {
            F.mo113514c(z);
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
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f119411K != configuration.screenWidthDp) {
            this.f119411K = configuration.screenWidthDp;
            C33398a.f79357a.mo59450a(this.f119420l, this.f119415g.f155817b.f155647c, this.f119415g.f155817b.f155648d);
        }
    }

    @AbstractC90264r(mo145423b = true)
    public void receiveToast(C76108c cVar) {
        if (TextUtils.equals(cVar.f170995a, "sticker_unlocked")) {
            this.f119409I = true;
            this.f119429u = cVar.f170996b;
            if (this.f119410J && !cVar.f170998d) {
                C63238c.f143568F.mo101711a(this, C63238c.f143568F.mo101709a());
                this.f119409I = false;
            }
            EventBus.m156962a().mo145399f(cVar);
        }
    }

    /* renamed from: a */
    private void m96496a(Bundle bundle) {
        List<String> list;
        boolean z;
        boolean z2 = true;
        if (bundle != null) {
            this.f119415g = (ShortVideoContext) bundle.getParcelable("save_state_short_video_context");
            StringBuilder sb = new StringBuilder("initData with outState,shortVideoContext is NULL:");
            if (this.f119415g == null) {
                z = true;
            } else {
                z = false;
            }
            C84911q.m145921a(sb.append(z).toString());
        }
        if (this.f119415g == null) {
            C63244g.m114602a().mo73293u();
            this.f119415g = C70643dn.m124852a(getIntent(), this);
            StringBuilder sb2 = new StringBuilder("initData with intent,shortVideoContext is NULL:");
            if (this.f119415g != null) {
                z2 = false;
            }
            C84911q.m145921a(sb2.append(z2).toString());
        }
        this.f119425q = m96495a(getIntent(), "extra_sticker_from");
        this.f119426r = m96495a(getIntent(), "grade_key");
        m96500s();
        C70005cr.m123611a().f156486e = this.f119415g.f155831p;
        C71833a.m126847a(this.f119415g.f155830o);
        ShortVideoContextViewModel o = mo87543o();
        o.f155842a = this.f119415g;
        o.mo110047a(this.f119415g.f155763X);
        this.f119424p = getIntent().getBooleanExtra("sticker_pannel_show", false);
        this.f119422n = getIntent().getStringArrayListExtra("reuse_sticker_ids");
        this.f119423o = (Effect) getIntent().getParcelableExtra("first_sticker");
        this.f119433y = m96495a(getIntent(), "update_effect_id");
        this.f119434z = getIntent().getParcelableArrayListExtra("update_effect_extra");
        if (C52912c.f121688a.f121689b.getStickerUpdateApp().booleanValue() && "direct_shoot".equals(this.f119415g.f155831p) && this.f119423o == null && ((list = this.f119422n) == null || list.size() == 0)) {
            String a = C63238c.f143593t.mo93788a((Context) this);
            if (!TextUtils.isEmpty(a)) {
                ArrayList arrayList = new ArrayList();
                this.f119422n = arrayList;
                arrayList.add(a);
            }
        }
        if (!TextUtils.isEmpty(m96495a(getIntent(), "star_atlas_object"))) {
            this.f119415g.f155794ad.f155707c = C63238c.f143585l.mo93817a(this.f119415g.f155794ad.f155707c, m96495a(getIntent(), "star_atlas_object"));
        }
        String a2 = m96495a(getIntent(), "music_origin");
        ShortVideoContext shortVideoContext = this.f119415g;
        if (a2 == null) {
            a2 = "original";
        }
        shortVideoContext.f155823h = a2;
        C34806c.m71112a();
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public void onNewIntent(Intent intent) {
        C14201t a;
        AbstractC51869a aVar;
        MethodCollector.m26663i(11551);
        super.onNewIntent(intent);
        C84911q.m145921a("VideoRecordNewActivity onNewIntent");
        C84412c.m145202a(this, intent, (Bundle) null);
        if (this.f119415g == null || !C88249a.m153359a(this)) {
            C84911q.m145921a("close record page because of null shortVideoContext instance when invoking onNewIntent method");
            finish();
            MethodCollector.m26664o(11551);
            return;
        }
        int intExtra = intent.getIntExtra("retake_shoot_mode", -1);
        boolean z = false;
        if (intExtra == 1) {
            C70643dn.m124854a(intent, this.f119415g);
            m96499r();
            AbstractC52568a aVar2 = (AbstractC52568a) ApiCenter.C2545a.m7450a(this).mo7015b(AbstractC52568a.class);
            if (aVar2 != null) {
                aVar2.mo88322a(this.f119415g.mo110038n());
                aVar2.mo88321a(0);
            }
            if (this.f119428t != null) {
                this.f119402B.mo22917x();
            }
            this.f119403C.mo116037a(true);
        } else if (intExtra == 2) {
            C70643dn.m124861b(intent, this.f119415g);
            m96499r();
            if (this.f119428t != null) {
                if (!this.f119415g.mo110022c() || this.f119415g.f155743D.f155847b == null) {
                    a = C14201t.m25948a((List<TimeSpeedModelExtension>) this.f119415g.f155817b.mo109891d(), this.f119415g.f155817b.mo109896h(), false);
                } else {
                    a = C14201t.m25947a(this.f119415g.f155817b.mo109891d(), this.f119415g.f155817b.mo109896h(), this.f119415g.f155743D.f155847b);
                }
                this.f119402B.mo22877a(a);
                AbstractC51869a aVar3 = (AbstractC51869a) this.f119413e.getValue().mo7015b(AbstractC51869a.class);
                if (aVar3 != null) {
                    aVar3.mo87577d();
                }
            }
            this.f119403C.mo116037a(false);
        }
        if (this.f119415g.f155817b.mo109893e() == null && (aVar = (AbstractC51869a) ApiCenter.C2545a.m7450a(this).mo7015b(AbstractC51869a.class)) != null) {
            aVar.mo87576c();
        }
        m96501t();
        boolean booleanExtra = intent.getBooleanExtra("recreate_record_and_clear", false);
        this.f119424p = intent.getBooleanExtra("sticker_pannel_show", false);
        boolean booleanExtra2 = intent.getBooleanExtra("enter_record_from_other_platform", false);
        if (booleanExtra) {
            C84911q.m145921a("VideoRecordNewActivity isClear");
            setIntent(intent);
            if (getIntent().getIntExtra("translation_type", 0) == 3) {
                C56813a.m135920a(this, 3);
            }
            AbstractC14209z zVar = this.f119401A;
            if (zVar != null) {
                zVar.mo22781a(EnumC78601i.NORMAL);
            }
            this.f119402B.mo22895d(true);
            TEMonitorInvoker.nativeReset();
            if (mo87541m() != null) {
                mo87541m().mo23133o();
            }
            C63238c.f143565C.mo73290r().mo86005c().mo86020a();
            m96496a((Bundle) null);
            mo87539k();
        } else if (this.f119415g == null) {
            m96496a((Bundle) null);
        }
        this.f119401A.mo22752F();
        ShortVideoContext shortVideoContext = this.f119415g;
        if (booleanExtra2 || shortVideoContext.f155796af != null) {
            z = true;
        }
        shortVideoContext.f155797ag = z;
        if (this.f119424p && mo87542n() != null) {
            mo87542n().mo23139a(true);
        }
        MethodCollector.m26664o(11551);
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b, com.p2082ss.android.ugc.aweme.adaptation.AbstractActivityC33414h, androidx.appcompat.app.ActivityC0218d, com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.AbstractActivityC73487ba
    public void onCreate(Bundle bundle) {
        int i;
        byte b;
        boolean z;
        boolean z2;
        MethodCollector.m26663i(11713);
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity", "onCreate", true);
        C73975b.C73976a.f166071a.enter(this, "record");
        C84412c.m145202a(this, getIntent(), bundle);
        m96496a(bundle);
        C70612k.f158036f.mo111417a(this);
        C69905c cVar = C70005cr.m123611a().f156482a;
        if (cVar != null && cVar.getDuration() > 0) {
            this.f119415g.f155822g = cVar.getDuration();
        }
        C31165b.f74716b = C65493p.m117218a();
        C89219l.m154721d(this, "");
        C2556g.m7471a(this, new C51838ab.C51850l(this));
        C2551b bVar = new C2551b(C2552c.m7460a(this));
        C2553d dVar = new C2553d();
        AlsLogicContainer alsLogicContainer = bVar.f7720a;
        alsLogicContainer.f7696d.mo35260a(C73438r.class, (String) null, (AbstractC21603p) new C51838ab.C51848j(dVar, this));
        alsLogicContainer.mo7005a(AbstractC14209z.class, C73438r.class);
        C2553d dVar2 = new C2553d();
        AlsLogicContainer alsLogicContainer2 = bVar.f7720a;
        alsLogicContainer2.f7696d.mo35260a(C74228n.class, (String) null, (AbstractC21603p) new C51838ab.C51849k(dVar2, this));
        alsLogicContainer2.mo7005a(AbstractC74227m.class, C74228n.class);
        C2553d dVar3 = new C2553d();
        AlsLogicContainer alsLogicContainer3 = bVar.f7720a;
        alsLogicContainer3.f7696d.mo35260a(C73360ad.class, (String) null, (AbstractC21603p) new C51838ab.C51841c(dVar3));
        alsLogicContainer3.mo7005a(AbstractC73359ac.class, C73360ad.class);
        C2553d dVar4 = new C2553d();
        AlsLogicContainer alsLogicContainer4 = bVar.f7720a;
        alsLogicContainer4.f7696d.mo35260a(C14243a.class, (String) null, (AbstractC21603p) new C51838ab.C51842d(dVar4));
        alsLogicContainer4.mo7005a(AbstractC14217g.class, C14243a.class);
        C2553d dVar5 = new C2553d();
        AlsLogicContainer alsLogicContainer5 = bVar.f7720a;
        alsLogicContainer5.f7696d.mo35260a(C14117i.class, (String) null, (AbstractC21603p) new C51838ab.C51843e(dVar5));
        alsLogicContainer5.mo7005a(AbstractC14099a.class, C14117i.class);
        C2553d dVar6 = new C2553d();
        AlsLogicContainer alsLogicContainer6 = bVar.f7720a;
        alsLogicContainer6.f7696d.mo35260a(C84025h.class, (String) null, (AbstractC21603p) new C51838ab.C51844f(dVar6));
        alsLogicContainer6.mo7005a(AbstractC84089j.class, C84025h.class);
        C2553d dVar7 = new C2553d();
        AlsLogicContainer alsLogicContainer7 = bVar.f7720a;
        alsLogicContainer7.f7696d.mo35260a(C73392h.class, (String) null, (AbstractC21603p) new C51838ab.C51845g(dVar7));
        alsLogicContainer7.mo7005a(AbstractC73376c.class, C73392h.class);
        C2553d dVar8 = new C2553d();
        AlsLogicContainer alsLogicContainer8 = bVar.f7720a;
        alsLogicContainer8.f7696d.mo35260a(C73412j.class, (String) null, (AbstractC21603p) new C51838ab.C51846h(dVar8));
        alsLogicContainer8.mo7005a(AbstractC73411i.class, C73412j.class);
        C2553d dVar9 = new C2553d();
        AlsLogicContainer alsLogicContainer9 = bVar.f7720a;
        alsLogicContainer9.f7696d.mo35260a(C73378e.class, (String) null, (AbstractC21603p) new C51838ab.C51847i(dVar9));
        alsLogicContainer9.mo7005a(AbstractC73377d.class, C73378e.class);
        C2553d dVar10 = new C2553d();
        AlsLogicContainer alsLogicContainer10 = bVar.f7720a;
        alsLogicContainer10.f7696d.mo35260a(C83950a.class, (String) null, (AbstractC21603p) new C51838ab.C51839a(dVar10));
        alsLogicContainer10.mo7005a(AbstractC75314e.class, C83950a.class);
        C2553d dVar11 = new C2553d();
        AlsLogicContainer alsLogicContainer11 = bVar.f7720a;
        alsLogicContainer11.f7696d.mo35260a(C73390g.class, (String) null, (AbstractC21603p) new C51838ab.C51840b(dVar11));
        alsLogicContainer11.mo7005a(AbstractC73389f.class, C73390g.class);
        bVar.mo7031a();
        this.f119414f = C2552c.m7460a(this).f7697e;
        C63244g.m114602a();
        this.f119401A = (AbstractC14209z) this.f119414f.mo35249a((Type) AbstractC14209z.class, (String) null);
        this.f119402B = (AbstractC14193m) this.f119414f.mo35249a((Type) AbstractC14193m.class, (String) null);
        this.f119403C = (AbstractC73411i) this.f119414f.mo35249a((Type) AbstractC73411i.class, (String) null);
        this.f119417i = this.f119401A.mo22941an();
        this.f119420l = this.f119401A.mo22749C();
        this.f119416h.postDelayed(new RunnableC52799s(this), InteractFirstFrameTimeOutDurationSetting.DEFAULT);
        this.f119401A.mo22814e().mo7036a(this, new C52800t(this));
        this.f119401A.mo22826n().mo6997a(this, new C52801u(this));
        this.f119402B.mo22909p().mo6997a(this, new C52802v(this));
        this.f119404D = (AbstractC14099a) this.f119414f.mo35249a((Type) AbstractC14099a.class, (String) null);
        C84911q.m145921a("VideoRecordNewActivity => onCreate start");
        C70005cr.m123611a().f156498r = false;
        C73975b.C73976a.f166071a.step("av_video_record_init", "onCreate");
        C73806f.m129872a(new C88264d());
        C73806f.m129872a(new C88268h(this));
        super.onCreate(bundle);
        C17233a.f41165a = true;
        if (getIntent().getIntExtra("translation_type", 0) == 3) {
            C56813a.m135920a(this, 3);
        }
        getWindow().addFlags(128);
        setContentView(R.layout.a2v);
        if (getResources().getConfiguration() != null) {
            i = getResources().getConfiguration().screenWidthDp;
        } else {
            i = 0;
        }
        this.f119411K = i;
        if (!C88249a.m153359a(this)) {
            C84911q.m145921a("RecordConditionCheck.check() false");
            finish();
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity", "onCreate", false);
            MethodCollector.m26664o(11713);
            return;
        }
        if (C65356az.m117041a()) {
            b = 15;
        } else {
            b = 7;
        }
        C85315al.m146635a(b);
        this.f119418j = (FrameLayout) findViewById(R.id.dnb);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.c73);
        this.f119419k = frameLayout;
        frameLayout.addView(this.f119401A.mo22747A());
        C84025h hVar = (C84025h) this.f119414f.mo35249a((Type) C84025h.class, (String) null);
        hVar.mo128906a(new AbstractC75593g() {
            /* class com.p2082ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity.C518103 */

            static {
                Covode.recordClassIndex(61179);
            }

            @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75593g
            /* renamed from: b */
            public final void mo87554b() {
                FTCVideoRecordNewActivity.this.f119402B.mo22885a("ftc sticker stop record");
            }

            @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75593g
            /* renamed from: c */
            public final boolean mo87555c() {
                if (FTCVideoRecordNewActivity.this.f119415g != null && !C84904k.m145909a(FTCVideoRecordNewActivity.this.f119415g.f155817b.mo109891d())) {
                    return true;
                }
                return false;
            }

            @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75593g
            /* renamed from: a */
            public final boolean mo87553a() {
                if (FTCVideoRecordNewActivity.this.f119428t == null || FTCVideoRecordNewActivity.this.f119428t.mo88278G() == null || FTCVideoRecordNewActivity.this.f119402B == null) {
                    return true;
                }
                return FTCVideoRecordNewActivity.this.f119402B.mo22891c().f7727a.getValue().booleanValue();
            }
        });
        this.f119402B.mo22912s().mo6997a(this, new C52743o(hVar));
        hVar.mo23168u().mo118615a(new AbstractC75301e() {
            /* class com.p2082ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity.C518092 */

            static {
                Covode.recordClassIndex(61178);
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
            List<Fragment> a = C73963aq.m130084a(f, C52816z.f121521a);
            if (C13617h.m24466b(a)) {
                AbstractC0976n a2 = getSupportFragmentManager().mo3552a();
                for (Fragment fragment : a) {
                    a2.mo3455a(fragment);
                }
                a2.mo3473c();
            }
        }
        C73806f.m129872a(new C88260b());
        C73968au.m130095a(this.f119415g);
        C63238c.f143576c.mo93767a("SHOOT");
        getLifecycle().mo4012a(AudioFocusManager.C73302a.m129359a(this));
        FrameLayout frameLayout2 = (FrameLayout) findViewById(R.id.c48);
        this.f119430v = frameLayout2;
        if (this.f119415g.f155827l != null) {
            z = true;
        } else {
            z = false;
        }
        if (this.f119415g.f155798ah || this.f119415g.f155799ai || z) {
            z2 = false;
        } else {
            z2 = true;
        }
        C73657f.m129768a(this, frameLayout2, z2, true);
        this.f119416h.post(new RunnableC52567h(this));
        C71529w.f160314l = true;
        C84911q.m145921a("VideoRecordNewActivity => onCreate end");
        C80510gr.m139526a();
        C73806f.m129872a(new C88265e());
        C73806f.m129872a(new C73481b());
        C73806f.m129872a(new C88258a());
        this.f119416h.postDelayed(new RunnableC52744p(this), InteractFirstFrameTimeOutDurationSetting.DEFAULT);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity", "onCreate", false);
        MethodCollector.m26664o(11713);
    }

    /* renamed from: a */
    private static String m96495a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // androidx.appcompat.app.ActivityC0218d
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        AbstractC52502a aVar;
        for (AbstractC84917a aVar2 : this.f119407G) {
            if (aVar2.onKeyDown(i, keyEvent)) {
                return true;
            }
        }
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        if (this.f119428t == null) {
            return super.onKeyDown(i, keyEvent);
        }
        AbstractC14193m mVar = this.f119402B;
        if (!(mVar == null || mVar.mo22891c().f7727a.getValue().booleanValue())) {
            return true;
        }
        AbstractC22233n nVar = this.f119408H;
        if ((nVar == null || !nVar.mo36340a()) && (aVar = (AbstractC52502a) this.f119428t.mo62771E().mo35252b(AbstractC52502a.class, null)) != null) {
            aVar.mo88294a();
        }
        return true;
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public void onActivityResult(int i, int i2, Intent intent) {
        boolean z;
        for (AbstractC84918b bVar : this.f119406F) {
            if (bVar.mo62778a(i, i2, intent)) {
                return;
            }
        }
        super.onActivityResult(i, i2, intent);
        if (i == 1002 && i2 == -1) {
            ShortVideoContext shortVideoContext = this.f119415g;
            if (shortVideoContext == null || shortVideoContext.f155796af == null) {
                z = false;
            } else {
                z = true;
            }
            if (!(intent == null || m96497b(intent) == null || z)) {
                Intent intent2 = new Intent();
                intent2.setClass(this, C63238c.f143576c.mo93776e());
                intent2.addFlags(67108864);
                intent2.putExtras(m96497b(intent));
                C84349a.m145093a(intent2, this);
                startActivity(intent2);
            }
            finish();
        }
    }
}
