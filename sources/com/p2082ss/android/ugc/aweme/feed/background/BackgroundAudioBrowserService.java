package com.p2082ss.android.ugc.aweme.feed.background;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import androidx.p051h.p052a.C0998a;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.utils.ServiceLifecycle;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.C19194c;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.EnumC19170o;
import com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.MediaSessionReceiver;
import com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.p1380a.C19221b;
import com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.session.C19242a;
import com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.session.MediaSessionService;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.lighten.p1477a.p1480c.AbstractC20737n;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2944e.C49421a;
import com.p2082ss.android.ugc.aweme.feed.p2944e.C49427b;
import com.p2082ss.android.ugc.aweme.feed.p2944e.C49430c;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.lang.reflect.Field;
import java.util.Objects;
import kotlinx.coroutines.AbstractC89516am;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.C89134h;
import p4600h.p4603c.p4604a.C89099b;
import p4600h.p4603c.p4604a.EnumC89098a;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.feed.background.BackgroundAudioBrowserService */
public final class BackgroundAudioBrowserService extends MediaSessionService {

    /* renamed from: m */
    public static final C49271b f113255m = new C49271b((byte) 0);

    /* renamed from: g */
    public final C49421a f113256g;

    /* renamed from: h */
    final C49430c f113257h;

    /* renamed from: i */
    final C49427b f113258i;

    /* renamed from: j */
    public C19221b f113259j;

    /* renamed from: k */
    public C19242a f113260k;

    /* renamed from: l */
    public final C88411a f113261l;

    /* renamed from: n */
    private final int f113262n = 2131232359;

    /* renamed from: o */
    private AudioManager f113263o;

    /* renamed from: p */
    private AudioFocusRequest f113264p;

    /* renamed from: q */
    private AudioManager.OnAudioFocusChangeListener f113265q;

    /* renamed from: r */
    private final C49270a f113266r;

    /* renamed from: s */
    private final AbstractC89244h f113267s;

    /* renamed from: t */
    private final AbstractC89244h f113268t;

    /* renamed from: u */
    private final AbstractC89244h f113269u;

    /* renamed from: v */
    private final AbstractC89244h f113270v;

    /* renamed from: w */
    private final AbstractC89244h f113271w;

    static {
        Covode.recordClassIndex(58067);
    }

    /* renamed from: b */
    public final ComponentName mo80884b() {
        return (ComponentName) this.f113270v.getValue();
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.session.MediaSessionService
    public final int onStartCommand(Intent intent, int i, int i2) {
        ServiceLifecycle.onStartCommand(this, intent, i, i2);
        return super.onStartCommand(intent, i, i2);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.background.BackgroundAudioBrowserService$b */
    public static final class C49271b {
        static {
            Covode.recordClassIndex(58069);
        }

        private C49271b() {
        }

        public /* synthetic */ C49271b(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.background.BackgroundAudioBrowserService$f */
    static final class C49275f extends AbstractC89220m implements AbstractC89171a<C492761> {

        /* renamed from: a */
        final /* synthetic */ BackgroundAudioBrowserService f113278a;

        static {
            Covode.recordClassIndex(58073);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C49275f(BackgroundAudioBrowserService backgroundAudioBrowserService) {
            super(0);
            this.f113278a = backgroundAudioBrowserService;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C492761 invoke() {
            return new BroadcastReceiver(this) {
                /* class com.p2082ss.android.ugc.aweme.feed.background.BackgroundAudioBrowserService.C49275f.C492761 */

                /* renamed from: a */
                final /* synthetic */ C49275f f113279a;

                static {
                    Covode.recordClassIndex(58074);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f113279a = r1;
                }

                public final void onReceive(Context context, Intent intent) {
                    Intent intent2;
                    if (intent != null && (intent2 = (Intent) intent.getParcelableExtra("EXTRA_MEDIA_BUTTON_DATA")) != null) {
                        C89219l.m154716b(intent2, "");
                        BackgroundAudioBrowserService.m92311b(this.f113279a.f113278a).mo30573a(intent2);
                        BackgroundAudioBrowserService.m92308a(this.f113279a.f113278a).mo30594a(intent2);
                    }
                }
            };
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.background.BackgroundAudioBrowserService$e */
    static final class C49274e extends AbstractC89220m implements AbstractC89171a<ComponentName> {

        /* renamed from: a */
        final /* synthetic */ BackgroundAudioBrowserService f113277a;

        static {
            Covode.recordClassIndex(58072);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C49274e(BackgroundAudioBrowserService backgroundAudioBrowserService) {
            super(0);
            this.f113277a = backgroundAudioBrowserService;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ComponentName invoke() {
            return new ComponentName(this.f113277a, MediaSessionReceiver.class);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.background.BackgroundAudioBrowserService$g */
    static final class C49277g extends AbstractC89220m implements AbstractC89171a<PendingIntent> {

        /* renamed from: a */
        final /* synthetic */ BackgroundAudioBrowserService f113280a;

        static {
            Covode.recordClassIndex(58075);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C49277g(BackgroundAudioBrowserService backgroundAudioBrowserService) {
            super(0);
            this.f113280a = backgroundAudioBrowserService;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ PendingIntent invoke() {
            BackgroundAudioBrowserService backgroundAudioBrowserService = this.f113280a;
            Intent intent = new Intent();
            intent.setComponent(this.f113280a.mo80884b());
            intent.putExtra("command_from_notification", 2);
            return PendingIntent.getBroadcast(backgroundAudioBrowserService, 2, intent, 134217728);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.background.BackgroundAudioBrowserService$h */
    static final class C49278h extends AbstractC89220m implements AbstractC89171a<PendingIntent> {

        /* renamed from: a */
        final /* synthetic */ BackgroundAudioBrowserService f113281a;

        static {
            Covode.recordClassIndex(58076);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C49278h(BackgroundAudioBrowserService backgroundAudioBrowserService) {
            super(0);
            this.f113281a = backgroundAudioBrowserService;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ PendingIntent invoke() {
            BackgroundAudioBrowserService backgroundAudioBrowserService = this.f113281a;
            Intent intent = new Intent();
            intent.setComponent(this.f113281a.mo80884b());
            intent.putExtra("command_from_notification", 1);
            return PendingIntent.getBroadcast(backgroundAudioBrowserService, 1, intent, 134217728);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.background.BackgroundAudioBrowserService$i */
    static final class C49279i extends AbstractC89220m implements AbstractC89171a<PendingIntent> {

        /* renamed from: a */
        final /* synthetic */ BackgroundAudioBrowserService f113282a;

        static {
            Covode.recordClassIndex(58077);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C49279i(BackgroundAudioBrowserService backgroundAudioBrowserService) {
            super(0);
            this.f113282a = backgroundAudioBrowserService;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ PendingIntent invoke() {
            BackgroundAudioBrowserService backgroundAudioBrowserService = this.f113282a;
            Intent intent = new Intent();
            intent.setComponent(this.f113282a.mo80884b());
            intent.putExtra("command_from_notification", 3);
            return PendingIntent.getBroadcast(backgroundAudioBrowserService, 3, intent, 134217728);
        }
    }

    public BackgroundAudioBrowserService() {
        C49421a aVar = new C49421a();
        this.f113256g = aVar;
        this.f113257h = new C49430c();
        this.f113258i = new C49427b();
        this.f113266r = new C49270a(aVar);
        this.f113261l = new C88411a();
        this.f113267s = C89250i.m154773a((AbstractC89171a) new C49278h(this));
        this.f113268t = C89250i.m154773a((AbstractC89171a) new C49277g(this));
        this.f113269u = C89250i.m154773a((AbstractC89171a) new C49279i(this));
        this.f113270v = C89250i.m154773a((AbstractC89171a) new C49274e(this));
        this.f113271w = C89250i.m154773a((AbstractC89171a) new C49275f(this));
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.session.MediaSessionService
    public final void onDestroy() {
        super.onDestroy();
        C19242a aVar = this.f113260k;
        if (aVar == null) {
            C89219l.m154710a("xAndroidSessionController");
        }
        aVar.mo30597a(false);
        C19221b bVar = this.f113259j;
        if (bVar == null) {
            C89219l.m154710a("xNotificationController");
        }
        bVar.mo30578a(false);
        stopForeground(true);
        this.f113261l.mo142944a();
        unregisterReceiver(this.f113266r);
        C19221b bVar2 = this.f113259j;
        if (bVar2 == null) {
            C89219l.m154710a("xNotificationController");
        }
        bVar2.mo30373a();
        C19242a aVar2 = this.f113260k;
        if (aVar2 == null) {
            C89219l.m154710a("xAndroidSessionController");
        }
        aVar2.mo30373a();
        C49286c.f113291a = false;
        if (Build.VERSION.SDK_INT >= 26) {
            AudioManager audioManager = this.f113263o;
            if (audioManager == null) {
                C89219l.m154710a("audioManager");
            }
            AudioFocusRequest audioFocusRequest = this.f113264p;
            if (audioFocusRequest == null) {
                C89219l.m154710a("audioFocusRequest");
            }
            audioManager.abandonAudioFocusRequest(audioFocusRequest);
            return;
        }
        AudioManager audioManager2 = this.f113263o;
        if (audioManager2 == null) {
            C89219l.m154710a("audioManager");
        }
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.f113265q;
        if (onAudioFocusChangeListener == null) {
            C89219l.m154710a("afChangeListener");
        }
        audioManager2.abandonAudioFocus(onAudioFocusChangeListener);
    }

    /* renamed from: a */
    public final void mo80883a() {
        C19242a aVar = this.f113260k;
        if (aVar == null) {
            C89219l.m154710a("xAndroidSessionController");
        }
        aVar.mo30597a(true);
        C19221b bVar = this.f113259j;
        if (bVar == null) {
            C89219l.m154710a("xNotificationController");
        }
        bVar.mo30578a(true);
        C19242a aVar2 = this.f113260k;
        if (aVar2 == null) {
            C89219l.m154710a("xAndroidSessionController");
        }
        aVar2.mo30600d();
        C19242a aVar3 = this.f113260k;
        if (aVar3 == null) {
            C89219l.m154710a("xAndroidSessionController");
        }
        aVar3.mo30598b();
        C19221b bVar2 = this.f113259j;
        if (bVar2 == null) {
            C89219l.m154710a("xNotificationController");
        }
        C19242a aVar4 = this.f113260k;
        if (aVar4 == null) {
            C89219l.m154710a("xAndroidSessionController");
        }
        bVar2.mo30575a(aVar4.f45453b.mo30387b());
    }

    @Override // androidx.media.AbstractServiceC1278e
    public final void onCreate() {
        int requestAudioFocus;
        super.onCreate();
        Context baseContext = getBaseContext();
        C89219l.m154716b(baseContext, "");
        C19242a aVar = new C19242a(baseContext, this.f113256g, this.f113257h, this.f113258i, mo80884b());
        this.f113259j = new C19221b(this, aVar.mo30599c(), aVar.f45454c, mo80884b(), new C49287d(), this.f113262n);
        this.f113260k = aVar;
        mo4258a(aVar.mo30599c());
        C0998a.m3454a(this).mo3693a((C49275f.C492761) this.f113271w.getValue(), new IntentFilter("intent.filter.X_ELEMENT_X_AUDIO_MEDIA_SESSION_BROADCAST"));
        m92310b(this, this.f113266r, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
        Context applicationContext = getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        Object a = m92309a(applicationContext, DataType.AUDIO);
        Objects.requireNonNull(a, "null cannot be cast to non-null type android.media.AudioManager");
        this.f113263o = (AudioManager) a;
        this.f113265q = new C49280j(this);
        if (Build.VERSION.SDK_INT >= 26) {
            AudioFocusRequest.Builder builder = new AudioFocusRequest.Builder(1);
            AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.f113265q;
            if (onAudioFocusChangeListener == null) {
                C89219l.m154710a("afChangeListener");
            }
            builder.setOnAudioFocusChangeListener(onAudioFocusChangeListener);
            builder.setWillPauseWhenDucked(true);
            AudioAttributes.Builder builder2 = new AudioAttributes.Builder();
            builder2.setContentType(2);
            builder.setAudioAttributes(builder2.build());
            AudioFocusRequest build = builder.build();
            C89219l.m154716b(build, "");
            this.f113264p = build;
            AudioManager audioManager = this.f113263o;
            if (audioManager == null) {
                C89219l.m154710a("audioManager");
            }
            AudioFocusRequest audioFocusRequest = this.f113264p;
            if (audioFocusRequest == null) {
                C89219l.m154710a("audioFocusRequest");
            }
            requestAudioFocus = audioManager.requestAudioFocus(audioFocusRequest);
        } else {
            AudioManager audioManager2 = this.f113263o;
            if (audioManager2 == null) {
                C89219l.m154710a("audioManager");
            }
            AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener2 = this.f113265q;
            if (onAudioFocusChangeListener2 == null) {
                C89219l.m154710a("afChangeListener");
            }
            requestAudioFocus = audioManager2.requestAudioFocus(onAudioFocusChangeListener2, 2, 1);
        }
        if (requestAudioFocus != 1) {
            stopSelf();
        }
        this.f113261l.mo142945a(C17873f.m33099g().mo143289d(new C49282l(this)));
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.background.BackgroundAudioBrowserService$j */
    public static final class C49280j implements AudioManager.OnAudioFocusChangeListener {

        /* renamed from: a */
        final /* synthetic */ BackgroundAudioBrowserService f113283a;

        static {
            Covode.recordClassIndex(58078);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C49280j(BackgroundAudioBrowserService backgroundAudioBrowserService) {
            this.f113283a = backgroundAudioBrowserService;
        }

        public final void onAudioFocusChange(int i) {
            if (i == -3 || i == -2) {
                if (C17873f.f42636l) {
                    this.f113283a.f113256g.mo30397d(new C19194c("PAUSE_FROM_LOSS_FOCUS_TRANSIENT"));
                }
            } else if (i == -1) {
                this.f113283a.f113256g.mo30397d(new C19194c("PAUSE_FROM_LOSS_FOCUS"));
            } else if (i == 2 || i == 3) {
                this.f113283a.f113256g.mo30399e(null);
            }
            if (this.f113283a.f113256g.mo81050i()) {
                this.f113283a.mo80883a();
            }
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.session.MediaSessionService, androidx.media.AbstractServiceC1278e
    public final IBinder onBind(Intent intent) {
        return new BinderC49272c(this, this);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.background.BackgroundAudioBrowserService$a */
    static final class C49270a extends BroadcastReceiver {

        /* renamed from: a */
        public final C49421a f113272a;

        static {
            Covode.recordClassIndex(58068);
        }

        public C49270a(C49421a aVar) {
            C89219l.m154721d(aVar, "");
            this.f113272a = aVar;
        }

        public final void onReceive(Context context, Intent intent) {
            C89219l.m154721d(context, "");
            C89219l.m154721d(intent, "");
            if (C89219l.m154714a((Object) intent.getAction(), (Object) "android.media.AUDIO_BECOMING_NOISY")) {
                this.f113272a.mo30397d(new C19194c("PAUSE_FROM_AUDIO_OUTPUT_CHANGED"));
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C19242a m92308a(BackgroundAudioBrowserService backgroundAudioBrowserService) {
        C19242a aVar = backgroundAudioBrowserService.f113260k;
        if (aVar == null) {
            C89219l.m154710a("xAndroidSessionController");
        }
        return aVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ C19221b m92311b(BackgroundAudioBrowserService backgroundAudioBrowserService) {
        C19221b bVar = backgroundAudioBrowserService.f113259j;
        if (bVar == null) {
            C89219l.m154710a("xNotificationController");
        }
        return bVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.background.BackgroundAudioBrowserService$d */
    public static final class C49273d implements AbstractC20737n {

        /* renamed from: a */
        final /* synthetic */ C89233z.C89234a f113275a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89124d f113276b;

        static {
            Covode.recordClassIndex(58071);
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20737n
        /* renamed from: a */
        public final void mo34150a() {
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20737n
        /* renamed from: a */
        public final void mo34165a(Bitmap bitmap) {
            if (!this.f113275a.element) {
                if (bitmap != null) {
                    this.f113276b.resumeWith(C89379q.m157068constructorimpl(bitmap));
                } else {
                    this.f113276b.resumeWith(C89379q.m157068constructorimpl(C89382r.m154941a((Throwable) new Exception("Bitmap is null"))));
                }
                this.f113275a.element = true;
            }
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20737n
        /* renamed from: a */
        public final void mo34166a(Throwable th) {
            if (!this.f113275a.element) {
                AbstractC89124d dVar = this.f113276b;
                if (th == null) {
                    th = new Exception("Failed to download bitmap; exception is null");
                }
                dVar.resumeWith(C89379q.m157068constructorimpl(C89382r.m154941a(th)));
                this.f113275a.element = true;
            }
        }

        C49273d(C89233z.C89234a aVar, AbstractC89124d dVar) {
            this.f113275a = aVar;
            this.f113276b = dVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.background.BackgroundAudioBrowserService$l */
    static final class C49282l<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ BackgroundAudioBrowserService f113287a;

        static {
            Covode.recordClassIndex(58080);
        }

        C49282l(BackgroundAudioBrowserService backgroundAudioBrowserService) {
            this.f113287a = backgroundAudioBrowserService;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            if (C89219l.m154714a(obj, (Object) true)) {
                this.f113287a.f113256g.mo81051j();
            } else if (C89219l.m154714a(obj, (Object) false)) {
                C49421a aVar = this.f113287a.f113256g;
                if (!aVar.mo81050i()) {
                    return;
                }
                if (aVar.mo30387b() == EnumC19170o.PLAYBACK_STATE_PLAYING || aVar.mo30387b() == EnumC19170o.PLAYBACK_STATE_START) {
                    this.f113287a.f113256g.mo81052k();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.background.BackgroundAudioBrowserService$k */
    public static final class C49281k extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f113284a;

        /* renamed from: b */
        final /* synthetic */ BackgroundAudioBrowserService f113285b;

        /* renamed from: c */
        final /* synthetic */ Aweme f113286c;

        static {
            Covode.recordClassIndex(58079);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C49281k(BackgroundAudioBrowserService backgroundAudioBrowserService, Aweme aweme, AbstractC89124d dVar) {
            super(2, dVar);
            this.f113285b = backgroundAudioBrowserService;
            this.f113286c = aweme;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C49281k(this.f113285b, this.f113286c, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C49281k) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
            int i = this.f113284a;
            if (i == 0) {
                C89382r.m154942a(obj);
                try {
                    User author = this.f113286c.getAuthor();
                    if (author != null) {
                        UrlModel avatarMedium = author.getAvatarMedium();
                        C89219l.m154716b(avatarMedium, "");
                        this.f113284a = 1;
                        C89134h hVar = new C89134h(C89099b.m154605a(this));
                        C89233z.C89234a aVar2 = new C89233z.C89234a();
                        aVar2.element = false;
                        C20766v a = C20761r.m39060a(C34735v.m70965a(avatarMedium));
                        C89219l.m154716b(a, "");
                        a.mo34182a(new C49273d(aVar2, hVar));
                        obj = hVar.mo143576a();
                        if (obj == EnumC89098a.COROUTINE_SUSPENDED) {
                            C89219l.m154721d(this, "");
                        }
                        if (obj == aVar) {
                            return aVar;
                        }
                    }
                    return C89391z.f203057a;
                } catch (Throwable th) {
                    th.getMessage();
                    return C89391z.f203057a;
                }
            } else if (i == 1) {
                C89382r.m154942a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Bitmap bitmap = (Bitmap) obj;
            BackgroundAudioBrowserService.m92308a(this.f113285b).mo30595a(bitmap);
            BackgroundAudioBrowserService.m92311b(this.f113285b).mo30574a(bitmap);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.background.BackgroundAudioBrowserService$c */
    public final class BinderC49272c extends MediaSessionService.BinderC19241b {

        /* renamed from: b */
        public final BackgroundAudioBrowserService f113273b;

        /* renamed from: c */
        final /* synthetic */ BackgroundAudioBrowserService f113274c;

        static {
            Covode.recordClassIndex(58070);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public BinderC49272c(BackgroundAudioBrowserService backgroundAudioBrowserService, BackgroundAudioBrowserService backgroundAudioBrowserService2) {
            super(backgroundAudioBrowserService2);
            C89219l.m154721d(backgroundAudioBrowserService2, "");
            this.f113274c = backgroundAudioBrowserService;
            this.f113273b = backgroundAudioBrowserService2;
        }
    }

    /* renamed from: a */
    private static Object m92309a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(6084);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
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
                    MethodCollector.m26664o(6084);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* renamed from: a */
    private static Intent m92307a(BackgroundAudioBrowserService backgroundAudioBrowserService, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return backgroundAudioBrowserService.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: java.lang.IllegalArgumentException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        r0 = r2.getMessage().contains("regist too many Broadcast Receivers");
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        if (r0 != false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        r2 = move-exception;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        com.bytedance.p890c.p891a.p892a.p893a.C13468b.m24211a(r2, "Register Receiver Exception");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        return com.p2082ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        r0 = r2.getMessage();
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        if (r0 != null) goto L_0x0018;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000c */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.Intent m92310b(com.p2082ss.android.ugc.aweme.feed.background.BackgroundAudioBrowserService r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
        /*
            android.app.Application r0 = com.bytedance.ies.ugc.appcontext.C17879g.m33104a()
            com.p2082ss.android.ugc.aweme.lancet.receiver.C58039a.m104863a(r0)
            android.content.Intent r0 = m92307a(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
            return r0
        L_0x000c:
            android.content.Intent r0 = com.p2082ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3)     // Catch:{ SecurityException -> 0x0026, IllegalArgumentException -> 0x0011 }
            return r0
        L_0x0011:
            r2 = move-exception
            java.lang.String r0 = r2.getMessage()
            if (r0 == 0) goto L_0x0027
            java.lang.String r1 = r2.getMessage()
            java.lang.String r0 = "regist too many Broadcast Receivers"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            throw r2
        L_0x0026:
            r2 = move-exception
        L_0x0027:
            java.lang.String r0 = "Register Receiver Exception"
            com.bytedance.p890c.p891a.p892a.p893a.C13468b.m24211a(r2, r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.background.BackgroundAudioBrowserService.m92310b(com.ss.android.ugc.aweme.feed.background.BackgroundAudioBrowserService, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }
}
