package com.bytedance.android.live.broadcast.widget;

import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.app.ActivityC0218d;
import androidx.fragment.app.AbstractC0952i;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.broadcast.C3016ah;
import com.bytedance.android.live.broadcast.api.C3066h;
import com.bytedance.android.live.broadcast.api.StickerReportApi;
import com.bytedance.android.live.broadcast.api.model.C3069b;
import com.bytedance.android.live.broadcast.api.model.C3071d;
import com.bytedance.android.live.broadcast.api.p185c.C3051c;
import com.bytedance.android.live.broadcast.api.p186d.AbstractC3055a;
import com.bytedance.android.live.broadcast.p192c.AbstractC3185a;
import com.bytedance.android.live.broadcast.p192c.C3215b;
import com.bytedance.android.live.broadcast.p192c.C3216c;
import com.bytedance.android.live.broadcast.p192c.C3217d;
import com.bytedance.android.live.broadcast.p192c.p193a.AbstractC3186a;
import com.bytedance.android.live.broadcast.p192c.p193a.C3200g;
import com.bytedance.android.live.broadcast.p196e.C3227a;
import com.bytedance.android.live.broadcast.stream.C3656a;
import com.bytedance.android.live.broadcast.stream.C3666b;
import com.bytedance.android.live.broadcast.stream.capture.AbstractC3688a;
import com.bytedance.android.live.broadcast.stream.capture.AbstractC3697f;
import com.bytedance.android.live.broadcast.stream.capture.C3691b;
import com.bytedance.android.live.broadcast.stream.capture.C3693c;
import com.bytedance.android.live.broadcast.stream.capture.p208a.C3689a;
import com.bytedance.android.live.broadcast.stream.p206b.AbstractC3677a;
import com.bytedance.android.live.broadcast.utils.C3719d;
import com.bytedance.android.live.broadcast.utils.StickerImageUploader;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p218f.C3905ae;
import com.bytedance.android.live.core.p218f.C3958s;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.core.p218f.p220b.C3922b;
import com.bytedance.android.live.effect.C4217d;
import com.bytedance.android.live.effect.api.AbstractC4169e;
import com.bytedance.android.live.effect.api.AbstractC4170f;
import com.bytedance.android.live.effect.api.C4147a;
import com.bytedance.android.live.effect.api.C4174h;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.effect.api.p240a.AbstractC4149b;
import com.bytedance.android.live.effect.api.p240a.AbstractC4150c;
import com.bytedance.android.live.effect.api.p240a.AbstractC4151d;
import com.bytedance.android.live.effect.api.p240a.AbstractC4152e;
import com.bytedance.android.live.effect.api.p240a.AbstractC4154g;
import com.bytedance.android.live.effect.api.p240a.C4163l;
import com.bytedance.android.live.liveinteract.api.AbstractC4409b;
import com.bytedance.android.live.p209c.AbstractC3807b;
import com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f;
import com.bytedance.android.live.p385p.EnumC5847l;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.p408u.C6203g;
import com.bytedance.android.livesdk.AbstractC11293v;
import com.bytedance.android.livesdk.chatroom.interact.AbstractC7601b;
import com.bytedance.android.livesdk.chatroom.p488c.C7400q;
import com.bytedance.android.livesdk.chatroom.p488c.C7404u;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastForceUploadVideoImageSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastUploadVideoImageSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCaptureVideoRecordDurationSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.StreamHardwareEncodeSetting;
import com.bytedance.android.livesdk.livesetting.effect.LiveNewEffectPanelSetting;
import com.bytedance.android.livesdk.p425aa.C6497a;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p425aa.C6558k;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p450an.C6800c;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6805b;
import com.bytedance.android.livesdk.p452ao.C6806c;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.p561j.C9105dq;
import com.bytedance.android.livesdk.p561j.C9106dr;
import com.bytedance.android.livesdk.performance.LivePerformanceManager;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.util.rxutils.C11191f;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdkapi.depend.model.C11672a;
import com.bytedance.android.livesdkapi.depend.model.live.C11738s;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11679c;
import com.bytedance.android.livesdkapi.host.AbstractC11819n;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.android.livesdkapi.p700m.C11833f;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.avframework.effect.IVideoEffectProcessor;
import com.p2082ss.avframework.livestreamv2.core.Client;
import com.p2082ss.avframework.livestreamv2.core.LiveCore;
import com.p2082ss.avframework.opengl.GlUtil;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.p4611f.p4613b.C89219l;

public class VideoWidget2 extends CaptureWidget2 implements AbstractC3186a, AbstractC3677a, AbstractC4154g, AbstractC7601b, WeakHandler.IHandler, AbstractC33974au {

    /* renamed from: e */
    public static final String f10429e = VideoWidget2.class.getSimpleName();

    /* renamed from: A */
    private Dialog f10430A;

    /* renamed from: B */
    private C11738s f10431B;

    /* renamed from: C */
    private IVideoEffectProcessor.FaceDetectListener f10432C;

    /* renamed from: D */
    private Map<String, Runnable> f10433D = new HashMap();

    /* renamed from: E */
    private C3666b f10434E;

    /* renamed from: F */
    private AbstractC4170f f10435F;

    /* renamed from: G */
    private AbstractC4149b f10436G = new AbstractC4149b() {
        /* class com.bytedance.android.live.broadcast.widget.VideoWidget2.C37712 */

        static {
            Covode.recordClassIndex(4297);
        }

        @Override // com.bytedance.android.live.effect.api.p240a.AbstractC4149b
        /* renamed from: a */
        public final int mo9078a() {
            VideoWidget2.this.f10441h.mo8971a();
            return 1;
        }

        @Override // com.bytedance.android.live.effect.api.p240a.AbstractC4149b
        /* renamed from: b */
        public final int mo9085b(String[] strArr) {
            VideoWidget2.this.f10441h.mo8980b(strArr);
            return 1;
        }

        @Override // com.bytedance.android.live.effect.api.p240a.AbstractC4149b
        /* renamed from: c */
        public final int mo9087c(String[] strArr) {
            VideoWidget2.this.f10441h.mo8982c(strArr);
            return 0;
        }

        @Override // com.bytedance.android.live.effect.api.p240a.AbstractC4149b
        /* renamed from: a */
        public final int mo9082a(boolean z) {
            VideoWidget2.this.f10441h.mo8977a(z);
            return 1;
        }

        @Override // com.bytedance.android.live.effect.api.p240a.AbstractC4149b
        /* renamed from: a */
        public final int mo9083a(String[] strArr) {
            VideoWidget2.this.f10441h.mo8978a(strArr);
            return 1;
        }

        @Override // com.bytedance.android.live.effect.api.p240a.AbstractC4149b
        /* renamed from: b */
        public final int mo9086b(String[] strArr, String[] strArr2) {
            VideoWidget2.this.f10441h.mo8981b(strArr, strArr2);
            return 0;
        }

        @Override // com.bytedance.android.live.effect.api.p240a.AbstractC4149b
        /* renamed from: a */
        public final int mo9081a(String str, boolean z) {
            try {
                VideoWidget2.this.f10441h.mo8976a(str, z);
                return 1;
            } catch (FileNotFoundException e) {
                C3854a.m9458a(VideoWidget2.f10429e, e);
                return -1;
            }
        }

        @Override // com.bytedance.android.live.effect.api.p240a.AbstractC4149b
        /* renamed from: a */
        public final int mo9084a(String[] strArr, String[] strArr2) {
            VideoWidget2.this.f10441h.mo8979a(strArr, strArr2);
            return 1;
        }

        @Override // com.bytedance.android.live.effect.api.p240a.AbstractC4149b
        /* renamed from: a */
        public final int mo9079a(String str, String str2, float f) {
            VideoWidget2.this.f10441h.mo8974a(str, str2, f);
            return 1;
        }

        @Override // com.bytedance.android.live.effect.api.p240a.AbstractC4149b
        /* renamed from: a */
        public final int mo9080a(String str, String str2, int[] iArr) {
            VideoWidget2.this.f10441h.mo8975a(str, str2, iArr);
            return 0;
        }
    };

    /* renamed from: H */
    private AbstractC4151d f10437H = new AbstractC4151d() {
        /* class com.bytedance.android.live.broadcast.widget.VideoWidget2.C37723 */

        static {
            Covode.recordClassIndex(4298);
        }

        @Override // com.bytedance.android.live.effect.api.p240a.AbstractC4151d
        /* renamed from: a */
        public final void mo8787a(boolean z, String str, C11672a aVar) {
            AbstractC88412b bVar;
            if (C4147a.f11583a.equals(str) && z && aVar != null) {
                C6501b.C6502a.m13948a("live_take_gesture_select").mo12643a(VideoWidget2.this.dataChannel).mo12654b("live_take").mo12656c("click").mo12646a("gesture_id", aVar.f27893a).mo12655b();
            }
            Map<String, Map<String, C11672a>> a = C4217d.m10322e().mo9841a();
            if (!a.containsKey(C4147a.f11584b) || a.get(C4147a.f11584b).size() <= 0) {
                VideoWidget2.this.f10448o = false;
                VideoWidget2.this.f10447n.removeMessages(101);
                if (VideoWidget2.this.f10444k != null) {
                    VideoWidget2.this.f10444k.mo14237a(false);
                }
            } else {
                VideoWidget2.this.f10448o = true;
            }
            if ((aVar != null && aVar.f27913u) || LiveBroadcastForceUploadVideoImageSetting.INSTANCE.isEnable()) {
                if (z) {
                    C3656a aVar2 = VideoWidget2.this.f10454u;
                    AbstractC3055a aVar3 = VideoWidget2.this.f10368b;
                    long id = VideoWidget2.this.f10446m.getId();
                    C89219l.m154721d(aVar3, "");
                    aVar2.f10087i++;
                    if (!LiveBroadcastUploadVideoImageSetting.INSTANCE.isDisable()) {
                        AbstractC88412b bVar2 = aVar2.f10079a;
                        if (!(bVar2 == null || bVar2.isDisposed() || (bVar = aVar2.f10079a) == null)) {
                            bVar.dispose();
                        }
                        if (!aVar2.f10082d) {
                            aVar2.f10082d = true;
                            C3854a.m9453a(3, "CaptureImageUploadController", "start");
                            aVar2.f10084f = aVar3;
                            aVar2.f10085g = id;
                            aVar2.mo8940a();
                            return;
                        }
                        return;
                    }
                    return;
                }
                VideoWidget2.this.f10454u.mo8941b();
            }
        }
    };

    /* renamed from: I */
    private AbstractC4150c f10438I = new AbstractC4150c() {
        /* class com.bytedance.android.live.broadcast.widget.VideoWidget2.C37734 */

        static {
            Covode.recordClassIndex(4299);
        }
    };

    /* renamed from: f */
    public AbstractC3688a f10439f;

    /* renamed from: g */
    public AbstractC4169e f10440g;

    /* renamed from: h */
    public C3689a f10441h;

    /* renamed from: i */
    public C3200g f10442i;

    /* renamed from: j */
    public AbstractC11679c.AbstractC11681b f10443j;

    /* renamed from: k */
    public AbstractC11679c.AbstractC11680a f10444k;

    /* renamed from: l */
    public boolean f10445l;

    /* renamed from: m */
    public Room f10446m;

    /* renamed from: n */
    public WeakHandler f10447n = new WeakHandler(this);

    /* renamed from: o */
    public volatile boolean f10448o;

    /* renamed from: p */
    long f10449p;

    /* renamed from: q */
    public C3776c f10450q = new C3776c(this, (byte) 0);

    /* renamed from: r */
    public FrameLayout f10451r;

    /* renamed from: s */
    public AbstractC0952i f10452s;

    /* renamed from: t */
    public boolean f10453t = false;

    /* renamed from: u */
    public C3656a f10454u;

    /* renamed from: v */
    C3217d f10455v;

    /* renamed from: w */
    public long f10456w;

    /* renamed from: x */
    public long f10457x;

    /* renamed from: y */
    public boolean f10458y = true;

    /* renamed from: z */
    private AbstractC3185a f10459z;

    @Override // com.bytedance.android.live.broadcast.widget.CaptureWidget2, com.bytedance.android.live.broadcast.widget.AbsCaptureWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    static {
        Covode.recordClassIndex(4295);
    }

    /* renamed from: e */
    public static boolean m9289e() {
        return ((AbstractC4409b) C6193a.m13435a(AbstractC4409b.class)).isAnchorVideoEnable();
    }

    @Override // com.bytedance.android.live.broadcast.p192c.p193a.AbstractC3186a
    /* renamed from: d_ */
    public final void mo8540d_() {
        C4217d.m10322e().mo9845a("effect_gift");
    }

    /* renamed from: g */
    public final long mo9107g() {
        Room room = this.f10446m;
        if (room != null) {
            return room.getId();
        }
        return 0;
    }

    @Override // com.bytedance.android.widget.Widget
    public void onResume() {
        super.onResume();
        this.f10442i.mo8554a();
        C3656a aVar = this.f10454u;
        if (aVar != null) {
            aVar.mo8940a();
        }
    }

    /* renamed from: f */
    public static long m9290f() {
        if (C11115u.m19743a().mo17915b() != null) {
            return C11115u.m19743a().mo17915b().mo13161c();
        }
        return 0;
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.VideoWidget2$c */
    class C3776c implements AbstractView$OnClickListenerC5841f {

        /* renamed from: a */
        boolean f10468a;

        static {
            Covode.recordClassIndex(4302);
        }

        @Override // com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f
        /* renamed from: a */
        public final void mo8492a(boolean z) {
        }

        @Override // com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f
        /* renamed from: b */
        public final void mo8493b(View view, DataChannel dataChannel) {
        }

        /* renamed from: a */
        private void m9323a() {
            float f;
            View view = EnumC5847l.REVERSE_MIRROR.getView(VideoWidget2.this.dataChannel);
            float[] fArr = new float[2];
            boolean z = this.f10468a;
            float f2 = 0.4f;
            if (z) {
                f = 0.4f;
            } else {
                f = 1.0f;
            }
            fArr[0] = f;
            if (z) {
                f2 = 1.0f;
            }
            fArr[1] = f2;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", fArr);
            ofFloat.setDuration(100L);
            ofFloat.start();
        }

        private C3776c() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final void mo9114b(boolean z) {
            int i;
            int i2;
            if (C3958s.m9645a(VideoWidget2.this.dataChannel)) {
                EnumC5847l lVar = EnumC5847l.REVERSE_MIRROR;
                DataChannel dataChannel = VideoWidget2.this.dataChannel;
                if (VideoWidget2.this.f10445l) {
                    i2 = 2131234571;
                } else {
                    i2 = 2131234569;
                }
                lVar.setBackgroundResource(dataChannel, i2);
            } else {
                EnumC5847l lVar2 = EnumC5847l.REVERSE_MIRROR;
                DataChannel dataChannel2 = VideoWidget2.this.dataChannel;
                if (VideoWidget2.this.f10445l) {
                    i = R.drawable.ca3;
                } else {
                    i = R.drawable.ca4;
                }
                lVar2.setBackgroundResource(dataChannel2, i);
            }
            if (z) {
                m9323a();
            }
        }

        public final void onClick(View view) {
            String string;
            String str;
            if (this.f10468a && VideoWidget2.m9289e()) {
                VideoWidget2 videoWidget2 = VideoWidget2.this;
                videoWidget2.f10445l = !videoWidget2.f10445l;
                VideoWidget2.this.f10439f.mo8961a();
                Context context = VideoWidget2.this.context;
                if (VideoWidget2.this.f10445l) {
                    string = VideoWidget2.this.context.getResources().getString(R.string.e96);
                } else {
                    string = VideoWidget2.this.context.getResources().getString(R.string.e97);
                }
                C11226ao.m19883a(context, string, 0);
                C6558k.m14024a(VideoWidget2.this.context);
                C11115u.m19743a().mo17915b().mo13161c();
                VideoWidget2.this.f10446m.getId();
                C6501b.C6502a.m13948a("pm_live_mirror_click").mo12643a(VideoWidget2.this.dataChannel).mo12654b("live_take").mo12656c("click").mo12658d("live_take_detail").mo12655b();
                mo9114b(false);
                C6497a b = C3051c.C3052a.m8359a("ttlive_change_mirror").mo12633b("broadcast");
                if (VideoWidget2.this.f10445l) {
                    str = "close";
                } else {
                    str = "open";
                }
                b.mo12629a("isMirror", str).mo12632a();
            }
        }

        /* synthetic */ C3776c(VideoWidget2 videoWidget2, byte b) {
            this();
        }

        @Override // com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f
        /* renamed from: a */
        public final void mo8491a(View view, DataChannel dataChannel) {
            boolean z;
            if (AbstractC6804a.f17058i.mo13068b().intValue() != 1 || !VideoWidget2.m9289e()) {
                z = false;
            } else {
                z = true;
            }
            this.f10468a = z;
            if (!z) {
                VideoWidget2.this.f10445l = false;
                mo9114b(true);
                return;
            }
            mo9114b(false);
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public void onPause() {
        AbstractC88412b bVar;
        super.onPause();
        C3656a aVar = this.f10454u;
        if (aVar != null) {
            aVar.f10086h = true;
            C3854a.m9453a(3, "CaptureImageUploadController", "pause");
            AbstractC88412b bVar2 = aVar.f10080b;
            if (bVar2 != null && !bVar2.isDisposed() && (bVar = aVar.f10080b) != null) {
                bVar.dispose();
            }
        }
    }

    /* renamed from: d */
    public final void mo9106d() {
        HashMap hashMap = new HashMap();
        hashMap.put("sticker_id", String.valueOf(this.f10456w));
        hashMap.put("use_time", String.valueOf((SystemClock.elapsedRealtime() - this.f10457x) / 1000));
        C6501b.C6502a.m13948a("live_sticker_use_time").mo12643a(this.dataChannel).mo12654b("live_take").mo12656c("click").mo12651a("sticker_id", String.valueOf(this.f10456w)).mo12651a("use_time", String.valueOf((SystemClock.elapsedRealtime() - this.f10457x) / 1000)).mo12655b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00a1, code lost:
        if (r5 > 0.0f) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00cc, code lost:
        if (((com.bytedance.android.livesdk.p452ao.AbstractC6804a.f16890S.mo13066a().floatValue() + com.bytedance.android.livesdk.p452ao.AbstractC6804a.f16889R.mo13066a().floatValue()) + com.bytedance.android.livesdk.p452ao.AbstractC6804a.f16888Q.mo13066a().floatValue()) > 0.0f) goto L_0x00ce;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    @Override // com.bytedance.android.live.broadcast.widget.AbsCaptureWidget
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo9062b() {
        /*
        // Method dump skipped, instructions count: 246
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.widget.VideoWidget2.mo9062b():void");
    }

    @Override // com.bytedance.android.live.broadcast.widget.CaptureWidget2, com.bytedance.android.live.broadcast.widget.AbsCaptureWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void onDestroy() {
        MethodCollector.m26663i(8183);
        super.onDestroy();
        C3216c a = C3216c.m8707a();
        if (a.f9247a != null) {
            a.f9247a.mo8230a();
        }
        if (a.f9248b != null) {
            a.f9248b.mo9879a();
            a.f9248b = null;
        }
        C4217d.m10322e().mo9850b(this.f10437H);
        C4217d.m10322e().mo9849b(this.f10438I);
        C4217d.m10322e().mo9848b();
        C6806c.m14603a((C6800c) AbstractC6804a.f16944at, (Object) 0);
        this.f10439f.mo8965a(PrivacyCert.Builder.with("bpea-434").usage("").tag("stop video/audio capture when live ends").policies(PrivacyPolicyStore.getVideoPrivacyPolicy()).build());
        this.f10439f.mo8970b(this.f10432C);
        this.f10439f.f10154b = null;
        AbstractC4169e eVar = this.f10440g;
        if (eVar != null) {
            eVar.mo9879a();
        }
        this.f10442i.mo8558d();
        GlUtil.nativeDetachThreadToOpenGl();
        this.f10447n.removeCallbacksAndMessages(null);
        C3666b bVar = this.f10434E;
        if (bVar != null) {
            C3854a.m9453a(3, "CaptureVideoUploadController", "stop");
            if (!bVar.mo8949c().isDisposed()) {
                bVar.mo8949c().dispose();
            }
            try {
                C3666b.m9102a(new File(bVar.mo8946a()));
                C3666b.m9102a(new File(bVar.mo8948b()));
            } catch (Throwable th) {
                C3854a.m9458a("CaptureVideoUploadController", th);
            }
            this.f10434E = null;
        }
        StickerImageUploader stickerImageUploader = StickerImageUploader.C3711a.f10284a;
        if (stickerImageUploader.f10281b != null && !stickerImageUploader.f10281b.isDisposed()) {
            stickerImageUploader.f10281b.dispose();
        }
        if (stickerImageUploader.f10280a != null && !stickerImageUploader.f10280a.isDisposed()) {
            stickerImageUploader.f10280a.dispose();
        }
        stickerImageUploader.f10283d.f10285a.clear();
        MethodCollector.m26664o(8183);
    }

    /* renamed from: c */
    public final void mo9105c() {
        long j;
        if (this.f10441h == null) {
            C3689a aVar = new C3689a();
            this.f10441h = aVar;
            this.f10439f.mo8964a(aVar);
        }
        this.f10441h.mo8972a(LiveNewEffectPanelSetting.INSTANCE.useNewPanel() ? 1 : 0);
        AbstractC4152e e = C4217d.m10322e();
        e.mo9843a(this.f10437H);
        e.mo9842a(this.f10438I);
        C4163l.C4164a aVar2 = new C4163l.C4164a();
        aVar2.f11599b = Arrays.asList(C4147a.f11583a, C4147a.f11586d, "beauty");
        aVar2.f11600c = Collections.singletonList("effect_gift");
        aVar2.f11601d = this.f10436G;
        e.mo9844a(aVar2.mo9872a());
        C3216c.m8707a().mo8569b().mo8231a(C4147a.f11583a, null);
        C3216c.m8707a().mo8569b().mo8231a(C4147a.f11584b, null);
        if (this.f10459z == null) {
            this.f10459z = new C3215b();
        }
        if (this.f10440g == null) {
            AbstractC4169e f = C4217d.m10323f();
            this.f10440g = f;
            f.mo9882a(this.f10439f);
            this.f10435F.mo9892a(this.f10440g);
        }
        AbstractC4152e e2 = C4217d.m10322e();
        String d = e2.mo9853d();
        String e3 = e2.mo9855e();
        if (!TextUtils.isEmpty(d) && !TextUtils.isEmpty(e3) && this.f10368b != null && this.f10368b.mo8296b() != null) {
            this.f10368b.mo8296b().setCustomEffect(d, e3);
            Room room = this.f10446m;
            if (room != null) {
                j = room.getId();
            } else {
                j = 0;
            }
            StickerImageUploader.C3711a.f10284a.mo9025a(new StickerImageUploader.C3713c(d, e3, j, C11115u.m19743a().mo17915b().mo13161c()));
            e2.mo9852c(null);
            e2.mo9854d(null);
        }
        this.f10455v = new C3217d(this.f10439f);
        C4217d.m10320c().mo9871a(this.dataChannel, this, false);
        C4217d.m10324g().mo9875a(this.dataChannel, true);
        C4217d.m10324g().mo9874a(this.f10447n, this.dataChannel, true);
    }

    @Override // com.bytedance.android.live.broadcast.widget.CaptureWidget2, com.bytedance.android.live.broadcast.widget.AbsCaptureWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void onCreate() {
        boolean z;
        super.onCreate();
        m9288a(C3069b.class);
        m9288a(C7400q.class);
        m9288a(C7404u.class);
        this.f10446m = (Room) this.dataChannel.mo28318b(C9093de.class);
        C3691b bVar = new C3691b(this.f10370d, this.f10368b, true);
        this.f10439f = bVar;
        bVar.mo8963a(this.f10369c);
        C3798q qVar = new C3798q(this);
        this.f10432C = qVar;
        this.f10439f.mo8966a(qVar);
        this.f10439f.mo8962a((C3693c.AbstractC3694a) C11833f.m20836a(new C3693c.AbstractC3694a() {
            /* class com.bytedance.android.live.broadcast.widget.VideoWidget2.C37701 */

            static {
                Covode.recordClassIndex(4296);
            }

            @Override // com.bytedance.android.live.broadcast.stream.capture.C3693c.AbstractC3694a
            /* renamed from: a */
            public final void mo8837a() {
                if (!VideoWidget2.this.f10453t) {
                    VideoWidget2.this.f10453t = true;
                    if (C6203g.m13472d()) {
                        VideoWidget2.this.mo9105c();
                    } else {
                        VideoWidget2.this.f10447n.post(new RunnableC3801t(this));
                    }
                }
            }

            @Override // com.bytedance.android.live.broadcast.stream.capture.C3693c.AbstractC3694a
            /* renamed from: a */
            public final void mo8838a(int i, int i2) {
                C3854a.m9453a(6, VideoWidget2.f10429e, "CameraState onError status: " + i + ", ret: " + i2 + ", msg: " + ((String) null));
            }
        }));
        if (C3922b.m9559b() && C3922b.m9557a() == 0) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getView().getLayoutParams();
            layoutParams.width = (int) (((float) C3966y.m9662b()) * 0.5625f);
            layoutParams.gravity = 17;
        }
        int value = StreamHardwareEncodeSetting.INSTANCE.getValue();
        if (value <= 0) {
            z = this.f10431B.f28101i;
        } else if (value == 2) {
            z = true;
        } else {
            z = false;
        }
        C3666b bVar2 = new C3666b(this.f10368b, this.f10431B.mo18702b(), this.f10431B.mo18701a(), z);
        this.f10434E = bVar2;
        if (LiveCaptureVideoRecordDurationSetting.INSTANCE.getValue() <= 0.0f) {
            C6805b<Long> bVar3 = AbstractC6804a.f17075z;
            C89219l.m154716b(bVar3, "");
            C6806c.m14603a((C6800c) bVar3, (Object) 0L);
        } else {
            C6805b<Long> bVar4 = AbstractC6804a.f17075z;
            C89219l.m154716b(bVar4, "");
            Long a = bVar4.mo13066a();
            C89219l.m154716b(a, "");
            if (!C3905ae.f10795a.format(new Date(a.longValue())).equals(C3905ae.f10795a.format(new Date()))) {
                bVar2.f10099a = 0;
                bVar2.mo8949c().mo142945a(AbstractC88979t.m154310b((Object) 1).mo143295e(60, TimeUnit.SECONDS).mo143254a(new C3666b.C3673f(bVar2), C3666b.C3674g.f10113a));
            }
        }
        this.f10454u = new C3656a();
        List<C11672a> b = C4217d.m10322e().mo9847b(C4147a.f11584b);
        if (b.size() > 0) {
            long j = b.get(0).f27893a;
            mo9103a(j);
            this.f10456w = j;
            this.f10457x = SystemClock.elapsedRealtime();
        }
        this.f10442i = new C3200g(this);
        EnumC5847l.STICKER.load(this.dataChannel, new C3777d(this, (byte) 0));
        EnumC5847l.PROPS.load(this.dataChannel, new C3774a(this, (byte) 0));
        EnumC5847l.REVERSE_CAMERA.load(this.dataChannel, new C3775b(this, (byte) 0));
        EnumC5847l.REVERSE_MIRROR.load(this.dataChannel, this.f10450q);
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.VideoWidget2$a */
    class C3774a implements AbstractView$OnClickListenerC5841f {
        static {
            Covode.recordClassIndex(4300);
        }

        @Override // com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f
        /* renamed from: a */
        public final void mo8492a(boolean z) {
        }

        @Override // com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f
        /* renamed from: b */
        public final void mo8493b(View view, DataChannel dataChannel) {
        }

        private C3774a() {
        }

        public final void onClick(View view) {
            String str;
            AbstractC11293v propsStickerDialog = ((AbstractC3807b) C6193a.m13435a(AbstractC3807b.class)).getPropsStickerDialog();
            if (propsStickerDialog != null) {
                propsStickerDialog.show(VideoWidget2.this.f10452s, "PROPS");
                if (VideoWidget2.this.f10446m != null) {
                    str = String.valueOf(VideoWidget2.this.f10446m.getOwnerUserId());
                } else {
                    str = "";
                }
                C6501b.C6502a.m13948a("livesdk_anchor_prop_click").mo12643a(VideoWidget2.this.dataChannel).mo12651a("anchor_id", str).mo12655b();
                C6806c.m14603a((C6800c) AbstractC6804a.f17052cz, (Object) false);
                VideoWidget2.this.dataChannel.mo28319c(C4174h.class);
            }
        }

        /* synthetic */ C3774a(VideoWidget2 videoWidget2, byte b) {
            this();
        }

        @Override // com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f
        /* renamed from: a */
        public final void mo8491a(View view, DataChannel dataChannel) {
            EnumC5847l.PROPS.setRedDotVisible(dataChannel, AbstractC6804a.f17052cz.mo13066a().booleanValue());
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.VideoWidget2$b */
    class C3775b implements AbstractView$OnClickListenerC5841f {

        /* renamed from: b */
        private boolean f10466b;

        /* renamed from: c */
        private long f10467c;

        static {
            Covode.recordClassIndex(4301);
        }

        @Override // com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f
        /* renamed from: a */
        public final void mo8492a(boolean z) {
        }

        @Override // com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f
        /* renamed from: b */
        public final void mo8493b(View view, DataChannel dataChannel) {
        }

        private C3775b() {
        }

        public final void onClick(View view) {
            String str;
            if (VideoWidget2.m9289e()) {
                if (C3922b.m9559b()) {
                    C11226ao.m19882a(C3966y.m9669e(), (int) R.string.gl2);
                }
                if (this.f10467c == 0) {
                    this.f10467c = SystemClock.elapsedRealtime();
                } else {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (elapsedRealtime >= this.f10467c + 1500) {
                        this.f10467c = elapsedRealtime;
                    } else {
                        return;
                    }
                }
                this.f10466b = !this.f10466b;
                if (VideoWidget2.this.f10445l) {
                    VideoWidget2.this.f10439f.mo8961a();
                }
                VideoWidget2.this.f10439f.mo8969b(PrivacyCert.Builder.with("bpea-376").usage("").tag("reverse camera during live broadcast").policies(PrivacyPolicyStore.getVideoPrivacyPolicy()).build());
                VideoWidget2.this.dataChannel.mo28320c(C3066h.class, Float.valueOf(0.0f));
                C3776c cVar = VideoWidget2.this.f10450q;
                cVar.f10468a = this.f10466b;
                if (!cVar.f10468a) {
                    VideoWidget2.this.f10445l = false;
                }
                cVar.mo9114b(true);
                C4217d.m10322e().mo9851c();
                AbstractC6804a.f17058i.mo13069b(Integer.valueOf(this.f10466b ? 1 : 0));
                C6558k.m14024a(VideoWidget2.this.getContext());
                C6501b.C6502a.m13948a("pm_live_switch_camera_click").mo12643a(VideoWidget2.this.dataChannel).mo12654b("live_take").mo12656c("click").mo12655b();
                C6497a b = C3051c.C3052a.m8359a("ttlive_switch_camera").mo12633b("broadcast");
                if (this.f10466b) {
                    str = "front";
                } else {
                    str = "back";
                }
                b.mo12629a("select_camera_type", str).mo12632a();
            }
        }

        /* synthetic */ C3775b(VideoWidget2 videoWidget2, byte b) {
            this();
        }

        @Override // com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f
        /* renamed from: a */
        public final void mo8491a(View view, DataChannel dataChannel) {
            boolean z;
            float f;
            if (AbstractC6804a.f17058i.mo13068b().intValue() == 1) {
                z = true;
            } else {
                z = false;
            }
            this.f10466b = z;
            View view2 = EnumC5847l.REVERSE_CAMERA.getView(VideoWidget2.this.dataChannel);
            float[] fArr = new float[2];
            float f2 = 0.4f;
            if (VideoWidget2.m9289e()) {
                f = 0.4f;
            } else {
                f = 1.0f;
            }
            fArr[0] = f;
            if (VideoWidget2.m9289e()) {
                f2 = 1.0f;
            }
            fArr[1] = f2;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, "alpha", fArr);
            ofFloat.setDuration(100L);
            ofFloat.start();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.VideoWidget2$d */
    class C3777d implements AbstractView$OnClickListenerC5841f {
        static {
            Covode.recordClassIndex(4303);
        }

        @Override // com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f
        /* renamed from: a */
        public final void mo8491a(View view, DataChannel dataChannel) {
        }

        @Override // com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f
        /* renamed from: a */
        public final void mo8492a(boolean z) {
        }

        @Override // com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f
        /* renamed from: b */
        public final void mo8493b(View view, DataChannel dataChannel) {
        }

        private C3777d() {
        }

        public final void onClick(View view) {
            IHostApp iHostApp = (IHostApp) C6193a.m13435a(IHostApp.class);
            if (iHostApp != null && VideoWidget2.this.f10451r != null) {
                iHostApp.showStickerView((ActivityC0218d) C11279p.m20001a(VideoWidget2.this.getContext()), VideoWidget2.this.f10452s, "livestreaming", VideoWidget2.this.f10451r, new AbstractC11819n() {
                    /* class com.bytedance.android.live.broadcast.widget.VideoWidget2.C3777d.C37781 */

                    /* renamed from: b */
                    private String f10472b;

                    static {
                        Covode.recordClassIndex(4304);
                    }

                    @Override // com.bytedance.android.livesdkapi.host.AbstractC11819n
                    /* renamed from: a */
                    public final void mo8922a(String str) {
                    }

                    @Override // com.bytedance.android.livesdkapi.host.AbstractC11819n
                    /* renamed from: b */
                    public final void mo8924b(String str) {
                    }

                    @Override // com.bytedance.android.livesdkapi.host.AbstractC11819n
                    /* renamed from: c */
                    public final void mo8925c(String str) {
                        if (VideoWidget2.this.f10458y) {
                            VideoWidget2.this.f10458y = false;
                            return;
                        }
                        this.f10472b = str;
                        C6501b.C6502a.m13948a("livesdk_pm_live_sticker_tab_change").mo12643a(VideoWidget2.this.dataChannel).mo12651a("tab", str).mo12655b();
                    }

                    @Override // com.bytedance.android.livesdkapi.host.AbstractC11819n
                    /* renamed from: b */
                    public final void mo8923b(C11672a aVar) {
                        VideoWidget2.this.mo9103a(0L);
                        VideoWidget2.this.dataChannel.mo28320c(C3016ah.class, "");
                        C4217d.m10322e().mo9845a(C4147a.f11584b);
                        if (VideoWidget2.this.f10456w > 0) {
                            VideoWidget2.this.mo9106d();
                        }
                        VideoWidget2.this.f10456w = 0;
                        LivePerformanceManager.getInstance().onModuleStop("sticker");
                        C3227a.f9267a.remove("sticker_id");
                        VideoWidget2.this.dataChannel.mo28320c(C9105dq.class, true);
                    }

                    @Override // com.bytedance.android.livesdkapi.host.AbstractC11819n
                    /* renamed from: a */
                    public final void mo8921a(C11672a aVar) {
                        VideoWidget2.this.mo9103a(aVar.f27893a);
                        VideoWidget2.this.dataChannel.mo28320c(C3016ah.class, aVar.f27898f);
                        C4217d.m10322e().mo9845a(C4147a.f11584b);
                        C4217d.m10322e().mo9846a(C4147a.f11584b, aVar);
                        if (VideoWidget2.this.f10456w > 0 && VideoWidget2.this.f10456w != aVar.f27893a) {
                            VideoWidget2.this.mo9106d();
                        }
                        if (VideoWidget2.this.f10456w != aVar.f27893a) {
                            VideoWidget2.this.f10457x = SystemClock.elapsedRealtime();
                            VideoWidget2.this.dataChannel.mo28320c(C9106dr.class, new C3071d(C4147a.f11584b, aVar, this.f10472b));
                        }
                        VideoWidget2.this.f10456w = aVar.f27893a;
                        C3051c.C3052a.m8359a("ttlive_change_sticker").mo12633b("broadcast").mo12628a("select_sticker_id", Long.valueOf(aVar.f27893a)).mo12629a("select_sticker_name", aVar.f27897e).mo12632a();
                        HashMap hashMap = new HashMap();
                        hashMap.put("id", String.valueOf(aVar.f27893a));
                        hashMap.put(StringSet.name, aVar.f27897e);
                        LivePerformanceManager.getInstance().onModuleStart("sticker", hashMap);
                        C3227a.f9267a.put("sticker_id", String.valueOf(aVar.f27893a));
                        C3051c.C3052a.m8359a("ttlive_broadcast_action_all").mo12637b("action", "change_sticker").mo12636b("action_id", Long.valueOf(aVar.f27893a)).mo12636b("user_id", Long.valueOf(VideoWidget2.m9290f())).mo12636b("room_id", Long.valueOf(VideoWidget2.this.mo9107g())).mo12632a();
                    }

                    @Override // com.bytedance.android.livesdkapi.host.AbstractC11819n
                    /* renamed from: a */
                    public final int mo8920a(String str, String str2) {
                        long j;
                        if (VideoWidget2.this.f10368b == null || VideoWidget2.this.f10368b.mo8296b() == null) {
                            return -1;
                        }
                        int customEffect = VideoWidget2.this.f10368b.mo8296b().setCustomEffect(str, str2);
                        if (VideoWidget2.this.f10446m != null) {
                            j = VideoWidget2.this.f10446m.getId();
                        } else {
                            j = 0;
                        }
                        StickerImageUploader.C3711a.f10284a.mo9025a(new StickerImageUploader.C3713c(str, str2, j, C11115u.m19743a().mo17915b().mo13161c()));
                        return customEffect;
                    }
                });
                C6501b.C6502a.m13948a("pm_live_sticker_click").mo12643a(VideoWidget2.this.dataChannel).mo12656c("click").mo12654b("live_take").mo12655b();
            }
        }

        /* synthetic */ C3777d(VideoWidget2 videoWidget2, byte b) {
            this();
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.interact.AbstractC7601b
    /* renamed from: a */
    public final Client mo9069a(LiveCore.InteractConfig interactConfig) {
        return this.f10368b.mo8280a(interactConfig);
    }

    @Override // com.bytedance.android.live.effect.api.p240a.AbstractC4154g
    /* renamed from: a */
    public final void mo8874a(float f) {
        AbstractC3185a aVar = this.f10459z;
        if (aVar != null) {
            aVar.mo8531a(f);
        }
    }

    @Override // com.bytedance.android.live.effect.api.p240a.AbstractC4154g
    /* renamed from: b */
    public final void mo8875b(float f) {
        AbstractC3185a aVar = this.f10459z;
        if (aVar != null) {
            aVar.mo8533b(f);
        }
    }

    @Override // com.bytedance.android.live.effect.api.p240a.AbstractC4154g
    /* renamed from: c */
    public final void mo8876c(float f) {
        AbstractC3185a aVar = this.f10459z;
        if (aVar != null) {
            aVar.mo8534c(f);
        }
    }

    /* renamed from: a */
    private <T> void m9288a(Class<T> cls) {
        C6779a.m14563a().mo13052a((Class) cls).mo143271a(getAutoUnbindTransformer()).mo143289d(new C3797p(this));
    }

    @Override // com.bytedance.android.live.broadcast.p192c.p193a.AbstractC3186a
    /* renamed from: a */
    public final void mo8538a(C11672a aVar) {
        C4217d.m10322e().mo9846a("effect_gift", aVar);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        AbstractC11679c.AbstractC11680a aVar;
        boolean z;
        if (isViewValid() && message.what == 101 && (aVar = this.f10444k) != null) {
            if (!(message.obj instanceof Integer) || ((Integer) message.obj).intValue() != 0) {
                z = false;
            } else {
                z = true;
            }
            aVar.mo14237a(z);
        }
    }

    /* renamed from: a */
    public final void mo9103a(long j) {
        String valueOf;
        if (j != this.f10456w) {
            StickerReportApi d = C3719d.C3720a.m9229a().mo9042d();
            long g = mo9107g();
            String str = "";
            if (j == 0) {
                valueOf = str;
            } else {
                valueOf = String.valueOf(j);
            }
            long j2 = this.f10456w;
            if (j2 != 0) {
                str = String.valueOf(j2);
            }
            d.reportEffectChange(g, 1, valueOf, str).mo143271a(new C11191f()).mo143254a(C3799r.f10533a, C3800s.f10534a);
        }
    }

    public void onEvent(C3069b bVar) {
        if (this.f10440g != null) {
            if (bVar.f8907a == 1) {
                this.f10440g.mo9885c();
                mo9104a(true);
                C4217d.m10324g().mo9878b(this.dataChannel, false, this.f10440g.mo9887e(), false, this.f10440g.mo9888f() + 1);
            } else if (bVar.f8907a == 2) {
                this.f10440g.mo9886d();
                mo9104a(false);
                C4217d.m10324g().mo9878b(this.dataChannel, false, this.f10440g.mo9887e(), false, this.f10440g.mo9888f() + 1);
            }
            C4217d.m10323f().mo9881a(this.f10446m.getId());
            C3051c.C3052a.m8359a("ttlive_broadcast_action_all").mo12637b("action", "change_filter").mo12635b("action_id", Integer.valueOf(this.f10440g.mo9888f())).mo12636b("user_id", Long.valueOf(m9290f())).mo12636b("room_id", Long.valueOf(mo9107g())).mo12632a();
        }
    }

    /* renamed from: a */
    public final void mo9104a(boolean z) {
        AbstractC4169e eVar = this.f10440g;
        if (eVar != null) {
            String b = eVar.mo9884b();
            AbstractC11679c.AbstractC11681b bVar = this.f10443j;
            if (bVar != null) {
                bVar.mo14236a(b, z);
            }
        }
    }

    public void onEvent(C7400q qVar) {
        String string;
        int i = qVar.f18334a;
        if (i == 2) {
            this.f10439f.mo8969b(PrivacyCert.Builder.with("bpea-377").usage("").tag("reverse camera during social live").policies(PrivacyPolicyStore.getVideoPrivacyPolicy()).build());
            this.f10445l = false;
        } else if (i == 22) {
            this.f10445l = !this.f10445l;
            this.f10439f.mo8961a();
            Context context = this.context;
            if (this.f10445l) {
                string = this.context.getResources().getString(R.string.e96);
            } else {
                string = this.context.getResources().getString(R.string.e97);
            }
            C11226ao.m19883a(context, string, 0);
            C6558k.m14024a(this.context);
            C11115u.m19743a().mo17915b().mo13161c();
            this.f10446m.getId();
        } else if (i == 40) {
            this.f10439f.mo8967a(true, PrivacyCert.Builder.with("bpea-805").usage("").tag("multi live anchor open camera").policies(PrivacyPolicyStore.getVideoPrivacyPolicy()).build());
        } else if (i == 41) {
            this.f10439f.mo8967a(false, PrivacyCert.Builder.with("bpea-806").usage("").tag("multi live anchor close camera").policies(PrivacyPolicyStore.getVideoPrivacyPolicy()).build());
        }
    }

    @Override // com.bytedance.android.live.broadcast.p192c.p193a.AbstractC3186a
    /* renamed from: a */
    public final void mo8539a(String str, String str2) {
        C3854a.m9453a(3, f10429e, "set custom sticker image:".concat(String.valueOf(str2)));
        this.f10441h.mo8973a(str, str2);
    }

    public VideoWidget2(AbstractC3697f fVar, C11738s sVar, AbstractC3055a aVar) {
        super(fVar, aVar);
        this.f10431B = sVar;
        this.f10435F = ((IEffectService) C6193a.m13435a(IEffectService.class)).getLiveFilterManager();
    }
}
