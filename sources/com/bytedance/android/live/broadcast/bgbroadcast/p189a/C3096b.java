package com.bytedance.android.live.broadcast.bgbroadcast.p189a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.android.live.broadcast.api.C3059e;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.api.p185c.C3047a;
import com.bytedance.android.live.broadcast.api.p185c.C3051c;
import com.bytedance.android.live.broadcast.api.p186d.AbstractC3055a;
import com.bytedance.android.live.broadcast.api.p186d.AbstractC3057b;
import com.bytedance.android.live.broadcast.api.p186d.C3058c;
import com.bytedance.android.live.broadcast.bgbroadcast.AbstractC3089a;
import com.bytedance.android.live.broadcast.stream.C3708f;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p518e.p519a.C8424a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p700m.C11832e;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.p2082ss.avframework.livestreamv2.ILiveStream;
import p4560f.p4561a.p4565b.AbstractC88412b;

/* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.a.b */
public final class C3096b extends AbstractC3089a implements AbstractC3057b, ILiveStream.ILiveStreamErrorListener {

    /* renamed from: j */
    private static final int[][] f8985j = {new int[]{200, 500, 800, 1}, new int[]{200, 800, 1200, 3}};

    /* renamed from: b */
    final Context f8986b;

    /* renamed from: c */
    public AbstractC3055a f8987c;

    /* renamed from: d */
    public AbstractC3057b f8988d;

    /* renamed from: e */
    private final Handler f8989e = new Handler(Looper.getMainLooper());

    /* renamed from: f */
    private final Room f8990f;

    /* renamed from: g */
    private boolean f8991g = false;

    /* renamed from: h */
    private AbstractC88412b f8992h;

    /* renamed from: i */
    private int f8993i = 0;

    @Override // com.bytedance.android.live.broadcast.api.p186d.AbstractC3057b
    public final void onNetworkStatus(int i) {
    }

    @Override // com.bytedance.android.live.broadcast.api.p186d.AbstractC3057b
    public final void connected() {
        m8444e();
    }

    @Override // com.bytedance.android.live.broadcast.bgbroadcast.AbstractC3089a
    /* renamed from: d */
    public final AbstractC3055a mo8391d() {
        return this.f8987c;
    }

    @Override // com.bytedance.android.live.broadcast.api.p186d.AbstractC3057b
    public final void beforeLiveCoreStartStream() {
        AbstractC3057b bVar = this.f8988d;
        if (bVar != null) {
            bVar.beforeLiveCoreStartStream();
        }
    }

    @Override // com.bytedance.android.live.broadcast.api.p186d.AbstractC3057b
    public final void onStreamStart() {
        AbstractC3057b bVar = this.f8988d;
        if (bVar != null) {
            bVar.onStreamStart();
        }
    }

    /* renamed from: e */
    private static void m8444e() {
        C11832e.f28190a = 1;
        C6779a.m14563a().mo13053a(new C8424a(1));
    }

    @Override // com.bytedance.android.live.broadcast.api.p186d.AbstractC3057b
    public final void onCaptureFirstFrame() {
        C3047a.m8356a("capture_first_frame", String.valueOf(System.currentTimeMillis()));
    }

    @Override // com.bytedance.android.live.broadcast.api.p186d.AbstractC3057b
    public final void onReconnected() {
        this.f8989e.post(new RunnableC3099d(this));
        m8444e();
    }

    @Override // com.bytedance.android.live.broadcast.api.p186d.AbstractC3057b
    public final void onFirstRTMPConnect() {
        C3047a.m8356a("rtmp_connected", String.valueOf(System.currentTimeMillis()));
        C3047a.m8355a();
        ((IBroadcastService) C6193a.m13435a(IBroadcastService.class)).startLiveManager().mo8695a();
    }

    @Override // com.bytedance.android.live.broadcast.api.p186d.AbstractC3057b
    public final void onNetworkLow() {
        if (this.f8991g) {
            C11832e.f28190a = 2;
            C6779a.m14563a().mo13053a(new C8424a(2));
        }
        this.f8991g = true;
    }

    @Override // com.bytedance.android.live.broadcast.api.p186d.AbstractC3057b
    public final void onReconnect() {
        this.f8989e.post(new RunnableC3098c(this));
        C11832e.f28190a = 0;
        C6779a.m14563a().mo13053a(new C8424a(0));
    }

    static {
        Covode.recordClassIndex(3577);
    }

    @Override // com.bytedance.android.live.broadcast.bgbroadcast.AbstractC3089a
    /* renamed from: a */
    public final void mo8385a() {
        AbstractC3055a aVar = this.f8987c;
        if (aVar != null) {
            aVar.mo8295a(false, PrivacyCert.Builder.with("bpea-383").usage("").tag("screen record broadcast start audio").policies(PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
        }
    }

    @Override // com.bytedance.android.live.broadcast.bgbroadcast.AbstractC3089a
    /* renamed from: b */
    public final void mo8388b() {
        AbstractC3055a aVar = this.f8987c;
        if (aVar != null) {
            aVar.mo8295a(true, PrivacyCert.Builder.with("bpea-384").usage("").tag("screen record broadcast stop audio").policies(PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
        }
    }

    @Override // com.bytedance.android.live.broadcast.bgbroadcast.AbstractC3089a
    /* renamed from: c */
    public final void mo8390c() {
        AbstractC3055a aVar = this.f8987c;
        if (aVar != null) {
            aVar.mo8299c(PrivacyCert.Builder.with("bpea-488").usage("").tag("release when live ends").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
        }
        AbstractC88412b bVar = this.f8992h;
        if (bVar != null) {
            bVar.dispose();
        }
        DataChannelGlobal.f42558d.mo28327c(C3059e.class);
    }

    @Override // com.bytedance.android.live.broadcast.api.p186d.AbstractC3057b
    public final void onInfo(float f) {
        AbstractC3057b bVar = this.f8988d;
        if (bVar != null) {
            bVar.onInfo(f);
        }
    }

    @Override // com.bytedance.android.live.broadcast.bgbroadcast.AbstractC3089a
    /* renamed from: b */
    public final boolean mo8389b(PrivacyCert privacyCert) {
        AbstractC3055a aVar = this.f8987c;
        if (aVar == null) {
            return false;
        }
        aVar.mo8307i(privacyCert);
        C3708f.m9212a("release_audio");
        this.f8987c.mo8305g(privacyCert);
        C3708f.m9212a("release_screen");
        this.f8987c.mo8281a();
        return true;
    }

    @Override // com.bytedance.android.live.broadcast.bgbroadcast.AbstractC3089a
    /* renamed from: a */
    public final boolean mo8387a(PrivacyCert privacyCert) {
        AbstractC3055a aVar;
        if (this.f8990f.getStreamUrl() == null || this.f8990f.getStreamUrl().mo18682a() == null || (aVar = this.f8987c) == null) {
            return false;
        }
        aVar.mo8306h(privacyCert);
        C3708f.m9212a("capture_audio");
        this.f8987c.mo8304f(privacyCert);
        C3708f.m9212a("capture_screen");
        this.f8987c.mo8293a(this.f8990f.getStreamUrl().mo18682a());
        return true;
    }

    public C3096b(Context context, Room room) {
        this.f8986b = context;
        this.f8990f = room;
        C11832e.f28190a = 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d1 A[Catch:{ Exception -> 0x010b }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d3 A[Catch:{ Exception -> 0x010b }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d7 A[Catch:{ Exception -> 0x010b }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e1 A[Catch:{ Exception -> 0x010b }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e6 A[Catch:{ Exception -> 0x010b }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00fa A[Catch:{ Exception -> 0x010b }, LOOP:0: B:47:0x00f4->B:49:0x00fa, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0102 A[Catch:{ Exception -> 0x010b }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0265  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0268  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x026c  */
    @Override // com.bytedance.android.live.broadcast.bgbroadcast.AbstractC3089a
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8386a(android.content.Intent r19, boolean r20) {
        /*
        // Method dump skipped, instructions count: 624
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.bgbroadcast.p189a.C3096b.mo8386a(android.content.Intent, boolean):void");
    }

    @Override // com.p2082ss.avframework.livestreamv2.ILiveStream.ILiveStreamErrorListener
    public final void onError(int i, int i2, Exception exc) {
        ((IBroadcastService) C6193a.m13435a(IBroadcastService.class)).startLiveManager().mo8696a(i);
    }

    /* renamed from: a */
    private static Intent m8442a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter);
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
    private static android.content.Intent m8443b(android.content.Context r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
        /*
            android.app.Application r0 = com.bytedance.ies.ugc.appcontext.C17879g.m33104a()
            com.p2082ss.android.ugc.aweme.lancet.receiver.C58039a.m104863a(r0)
            android.content.Intent r0 = m8442a(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.bgbroadcast.p189a.C3096b.m8443b(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }

    @Override // com.bytedance.android.live.broadcast.api.p186d.AbstractC3057b
    public final void onStreamEnd(int i, int i2, String str) {
        if (C3058c.m8399a(i)) {
            this.f8989e.post(new RunnableC3100e(this));
            if (i <= 0) {
                return;
            }
        } else if (i > 0) {
            this.f8989e.post(new RunnableC3101f(this));
        } else {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = C3058c.m8400b(i);
        }
        C3051c.C3052a.m8361c("ttlive_obs_stream_end_error").mo12635b("error_code", Integer.valueOf(i)).mo12637b("error_msg", str).mo12632a();
        if (this.f8976a != null) {
            this.f8976a.mo8392a();
        }
    }
}
