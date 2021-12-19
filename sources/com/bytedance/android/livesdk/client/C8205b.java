package com.bytedance.android.livesdk.client;

import android.content.Context;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.C11603z;
import com.bytedance.android.livesdk.C6860as;
import com.bytedance.android.livesdk.MessageApi;
import com.bytedance.android.livesdk.livesetting.message.HotLiveMessageSizeSetting;
import com.bytedance.android.livesdk.util.GlobalContext;
import com.bytedance.android.message.IMessageService;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.ugc.live.sdk.message.interfaces.IMessageClient;

/* renamed from: com.bytedance.android.livesdk.client.b */
public final class C8205b extends AbstractC8200a {

    /* renamed from: c */
    private static final int f20333c = HotLiveMessageSizeSetting.INSTANCE.getValue();

    /* renamed from: b */
    public String f20334b;

    /* renamed from: d */
    private IMessageClient.Callback f20335d;

    /* renamed from: e */
    private long f20336e;

    /* renamed from: f */
    private long f20337f;

    /* renamed from: g */
    private Context f20338g;

    /* renamed from: h */
    private MessageApi f20339h = ((MessageApi) C5805e.m12718a().mo11572a(MessageApi.class));

    /* renamed from: i */
    private long f20340i;

    /* renamed from: j */
    private String f20341j;

    /* renamed from: k */
    private String f20342k;

    /* renamed from: l */
    private long f20343l;

    /* renamed from: m */
    private long f20344m;

    /* renamed from: n */
    private long f20345n;

    /* renamed from: o */
    private boolean f20346o = true;

    /* renamed from: p */
    private boolean f20347p = true;

    /* renamed from: q */
    private C2730f f20348q = new C2730f();

    /* renamed from: r */
    private int f20349r = 0;

    /* renamed from: s */
    private int f20350s = 0;

    /* renamed from: t */
    private int f20351t = 0;

    /* renamed from: u */
    private long f20352u = 0;

    /* renamed from: v */
    private final C6860as f20353v;

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.IMessageClient
    public final void connectToWebSocket() {
    }

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.IMessageClient
    public final void disconnectFromWebSocket() {
    }

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.IMessageClient
    public final long getUserId() {
        return this.f20337f;
    }

    static {
        Covode.recordClassIndex(9029);
    }

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.IMessageClient
    public final void onRelease() {
        C11603z.m20414a(this.f20349r, this.f20350s);
        C11603z.m20416a(this.f20352u, (long) this.f20351t);
    }

    /* renamed from: a */
    private void m16315a() {
        this.f20343l = -1;
        this.f20344m = 0;
        this.f20345n = 0;
    }

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.IMessageClient
    public final void setCallback(IMessageClient.Callback callback) {
        this.f20335d = callback;
    }

    /* renamed from: a */
    private static Context m16313a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 2 */
    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.IMessageClient
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void apiCall(java.util.Map<java.lang.String, java.lang.String> r7) {
        /*
        // Method dump skipped, instructions count: 452
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.client.C8205b.apiCall(java.util.Map):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x01f6 A[Catch:{ all -> 0x0283 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0275  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.p2082ss.ugc.live.sdk.message.data.ProtoApiResult m16314a(com.bytedance.android.p150e.p151a.p152a.C2726d.AbstractC2728b r19) {
        /*
        // Method dump skipped, instructions count: 720
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.client.C8205b.m16314a(com.bytedance.android.e.a.a.d$b):com.ss.ugc.live.sdk.message.data.ProtoApiResult");
    }

    public C8205b(boolean z, long j) {
        String str;
        if (z) {
            str = "anchor";
        } else {
            str = "audience";
        }
        this.f20341j = str;
        this.f20337f = j;
        this.f20353v = (C6860as) C6193a.m13435a(IMessageService.class);
    }

    /* renamed from: a */
    public final void mo14438a(long j, Context context) {
        Context applicationContext;
        this.f20336e = j;
        if (context != null) {
            applicationContext = m16313a(context);
        } else {
            applicationContext = GlobalContext.getApplicationContext();
        }
        this.f20338g = applicationContext;
    }
}
