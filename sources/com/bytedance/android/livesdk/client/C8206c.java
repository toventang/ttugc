package com.bytedance.android.livesdk.client;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.p180b.C2963a;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.live.core.performance.C4017b;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.network.C5809h;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.C11590y;
import com.bytedance.android.livesdk.C11603z;
import com.bytedance.android.livesdk.C6496aa;
import com.bytedance.android.livesdk.C6763ak;
import com.bytedance.android.livesdk.C6773al;
import com.bytedance.android.livesdk.C6860as;
import com.bytedance.android.livesdk.C8463f;
import com.bytedance.android.livesdk.MessageApi;
import com.bytedance.android.livesdk.livesetting.message.HotLiveMessageSizeSetting;
import com.bytedance.android.livesdk.livesetting.message.LiveMessageForceHttpSetting;
import com.bytedance.android.livesdk.livesetting.message.LiveWsMessageDecodeUploadLarkCloudSetting;
import com.bytedance.android.livesdk.p561j.C9095dg;
import com.bytedance.android.livesdk.p561j.C9100dl;
import com.bytedance.android.livesdk.util.GlobalContext;
import com.bytedance.android.livesdk.utils.C11225an;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.android.livesdkapi.host.IHostNetwork;
import com.bytedance.android.livesdkapi.p702ws.AbstractC11884a;
import com.bytedance.android.livesdkapi.p702ws.AbstractC11887d;
import com.bytedance.android.livesdkapi.p702ws.C11886c;
import com.bytedance.android.livesdkapi.p702ws.EnumC11885b;
import com.bytedance.android.livesdkapi.p702ws.LiveWsMessage;
import com.bytedance.android.message.IMessageService;
import com.bytedance.android.p150e.p151a.p152a.C2726d;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.C22099u;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.ugc.live.sdk.message.MessageApiConstant;
import com.p2082ss.ugc.live.sdk.message.data.PayloadItem;
import com.p2082ss.ugc.live.sdk.message.data.ProtoApiResult;
import com.p2082ss.ugc.live.sdk.message.interfaces.IMessageWsClient;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.client.c */
public final class C8206c implements IMessageWsClient {

    /* renamed from: f */
    private static final int f20354f = HotLiveMessageSizeSetting.INSTANCE.getValue();

    /* renamed from: a */
    public IMessageWsClient.Callback f20355a;

    /* renamed from: b */
    public long f20356b;

    /* renamed from: c */
    public String f20357c;

    /* renamed from: d */
    public C6763ak f20358d = new C6763ak();

    /* renamed from: e */
    public AbstractC11884a f20359e;

    /* renamed from: g */
    private long f20360g;

    /* renamed from: h */
    private Context f20361h;

    /* renamed from: i */
    private MessageApi f20362i = ((MessageApi) C5805e.m12718a().mo11572a(MessageApi.class));

    /* renamed from: j */
    private long f20363j;

    /* renamed from: k */
    private String f20364k;

    /* renamed from: l */
    private String f20365l;

    /* renamed from: m */
    private long f20366m;

    /* renamed from: n */
    private long f20367n;

    /* renamed from: o */
    private long f20368o;

    /* renamed from: p */
    private boolean f20369p = true;

    /* renamed from: q */
    private boolean f20370q = true;

    /* renamed from: r */
    private C2730f f20371r = new C2730f();

    /* renamed from: s */
    private boolean f20372s = true;

    /* renamed from: t */
    private C8463f f20373t = new C8463f();

    /* renamed from: u */
    private String f20374u;

    /* renamed from: v */
    private int f20375v = 0;

    /* renamed from: w */
    private int f20376w = 0;

    /* renamed from: x */
    private int f20377x = 0;

    /* renamed from: y */
    private long f20378y = 0;

    /* renamed from: z */
    private final C6860as f20379z;

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.IMessageWsClient
    public final void onStartMessage() {
    }

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.IMessageWsClient
    public final void onStopMessage() {
    }

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.IMessageWsClient
    public final long getUserId() {
        return this.f20360g;
    }

    static {
        Covode.recordClassIndex(9030);
    }

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.IMessageWsClient
    public final boolean isWsConnected() {
        AbstractC11884a aVar = this.f20359e;
        if (aVar != null) {
            return aVar.mo19043a();
        }
        return false;
    }

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.IMessageWsClient
    public final void onRelease() {
        C11603z.m20414a(this.f20375v, this.f20376w);
        C11603z.m20416a(this.f20378y, (long) this.f20377x);
    }

    /* renamed from: a */
    private void m16319a() {
        this.f20366m = -1;
        this.f20367n = 0;
        this.f20368o = 0;
    }

    /* renamed from: com.bytedance.android.livesdk.client.c$2 */
    static /* synthetic */ class C82082 {

        /* renamed from: a */
        static final /* synthetic */ int[] f20386a;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|(3:9|10|12)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0038 */
        static {
            /*
                r0 = 9032(0x2348, float:1.2657E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.bytedance.android.livesdkapi.ws.b[] r0 = com.bytedance.android.livesdkapi.p702ws.EnumC11885b.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.bytedance.android.livesdk.client.C8206c.C82082.f20386a = r2
                com.bytedance.android.livesdkapi.ws.b r0 = com.bytedance.android.livesdkapi.p702ws.EnumC11885b.CONNECTION_UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.bytedance.android.livesdk.client.C8206c.C82082.f20386a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.bytedance.android.livesdkapi.ws.b r0 = com.bytedance.android.livesdkapi.p702ws.EnumC11885b.CONNECTING     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = com.bytedance.android.livesdk.client.C8206c.C82082.f20386a     // Catch:{ NoSuchFieldError -> 0x002d }
                com.bytedance.android.livesdkapi.ws.b r0 = com.bytedance.android.livesdkapi.p702ws.EnumC11885b.CONNECT_FAILED     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                int[] r2 = com.bytedance.android.livesdk.client.C8206c.C82082.f20386a     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.bytedance.android.livesdkapi.ws.b r0 = com.bytedance.android.livesdkapi.p702ws.EnumC11885b.CONNECT_CLOSED     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                int[] r2 = com.bytedance.android.livesdk.client.C8206c.C82082.f20386a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.bytedance.android.livesdkapi.ws.b r0 = com.bytedance.android.livesdkapi.p702ws.EnumC11885b.CONNECTED     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r0 = 5
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.client.C8206c.C82082.<clinit>():void");
        }
    }

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.IMessageWsClient
    public final void setCallback(IMessageWsClient.Callback callback) {
        this.f20355a = callback;
    }

    /* renamed from: a */
    private static Context m16317a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.IMessageWsClient
    public final void setWebSocketServerTimeGap(long j) {
        if (isWsConnected()) {
            C11225an.f26870a = j;
        }
    }

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.IMessageWsClient
    public final void determineMessageStrategy(Map<String, String> map) {
        if (!this.f20372s || LiveMessageForceHttpSetting.INSTANCE.getValue()) {
            m16322a(map, false, false);
        } else {
            m16322a(map, true, false);
        }
    }

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.IMessageWsClient
    public final void decodeHostWebSocketPayload(PayloadItem payloadItem) {
        try {
            ProtoApiResult a = m16318a(C2726d.m7876a(C6773al.m14561a(payloadItem)), false, true, 2);
            a.payloadType = payloadItem.getPayloadType();
            a.logId = payloadItem.getLogId();
            IMessageWsClient.Callback callback = this.f20355a;
            if (callback != null) {
                callback.onHostWebSocketPayloadDecoded(a);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.IMessageWsClient
    public final void decodeWebSocketPayload(PayloadItem payloadItem) {
        try {
            ProtoApiResult a = m16318a(C2726d.m7876a(C6773al.m14561a(payloadItem)), false, true, 1);
            a.payloadType = payloadItem.getPayloadType();
            a.logId = payloadItem.getLogId();
            IMessageWsClient.Callback callback = this.f20355a;
            if (callback != null) {
                callback.onWebSocketPayloadDecoded(a);
            }
            if (LiveWsMessageDecodeUploadLarkCloudSetting.INSTANCE.getValue()) {
                C89219l.m154721d(a, "");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private void m16320a(Map<String, String> map) {
        String language;
        Context context = this.f20361h;
        if (context == null) {
            language = "";
        } else {
            language = context.getResources().getConfiguration().locale.getLanguage();
        }
        map.put("app_language", language);
        map.put("live_id", String.valueOf(((IHostContext) C6193a.m13435a(IHostContext.class)).liveId()));
        map.remove("fetch_time");
        map.remove("ack_ids");
        map.put("identity", this.f20364k);
        map.put("last_rtt", String.valueOf(this.f20366m));
        map.put("recv_cnt", String.valueOf(this.f20367n));
        map.put("parse_cnt", String.valueOf(this.f20368o));
        if (!TextUtils.isEmpty(this.f20365l)) {
            map.put("internal_ext", this.f20365l);
        }
    }

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.IMessageWsClient
    public final void disconnectFromWebSocket(String str) {
        this.f20373t.f20919a = null;
        AbstractC11884a aVar = this.f20359e;
        if (aVar != null) {
            aVar.mo19044b();
        }
        if (TextUtils.equals(str, "ws_connect_timeout")) {
            this.f20358d.mo12965a(this.f20356b, -1, str, this.f20374u, null);
        } else if (TextUtils.equals(str, "retry_count_over")) {
            this.f20358d.mo12966a(this.f20356b, str, this.f20374u);
        } else if (TextUtils.equals(str, "service_close_cmd")) {
            this.f20358d.mo12966a(this.f20356b, str, this.f20374u);
        }
    }

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.IMessageWsClient
    public final void sendUplinkPacket(PayloadItem payloadItem) {
        AbstractC11884a aVar = this.f20359e;
        if (aVar != null && aVar.mo19043a() && "uplink_im_gateway".equals(payloadItem.getPayloadType())) {
            LiveWsMessage.C11883a a = LiveWsMessage.C11883a.m20974a();
            a.f28434b = payloadItem.getLogId();
            a.f28440h = payloadItem.getSeqId();
            a.f28435c = 20045;
            a.f28436d = 1;
            a.f28437e = payloadItem.getPayload();
            a.f28438f = payloadItem.getPayloadType();
            a.f28439g = payloadItem.getPayloadEncoding();
            this.f20359e.mo19042a(a.mo19041b());
        }
    }

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.IMessageWsClient
    public final void apiCall(Map<String, String> map, boolean z) {
        m16322a(map, false, z);
    }

    public C8206c(boolean z, long j) {
        String str;
        if (z) {
            str = "anchor";
        } else {
            str = "audience";
        }
        this.f20364k = str;
        this.f20360g = j;
        this.f20379z = (C6860as) C6193a.m13435a(IMessageService.class);
    }

    /* renamed from: a */
    public final void mo14445a(long j, Context context) {
        Context applicationContext;
        this.f20356b = j;
        if (context != null) {
            applicationContext = m16317a(context);
        } else {
            applicationContext = GlobalContext.getApplicationContext();
        }
        this.f20361h = applicationContext;
    }

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.IMessageWsClient
    public final void connectToWebSocket(Map<String, String> map, String str) {
        String str2 = this.f20374u;
        if (TextUtils.isEmpty(str2)) {
            this.f20355a.onWebSocketDisconnected();
            return;
        }
        String uri = Uri.parse(str2).buildUpon().appendQueryParameter("live_region", (String) DataChannelGlobal.f42558d.mo28324b(C9095dg.class)).build().toString();
        HashMap hashMap = new HashMap(C5809h.m12739a().mo11588b());
        hashMap.put("room_id", String.valueOf(this.f20356b));
        hashMap.put("rid", String.valueOf(this.f20356b));
        hashMap.put("aid", String.valueOf(((IHostContext) C6193a.m13435a(IHostContext.class)).appId()));
        hashMap.put("identity", this.f20364k);
        hashMap.put("live_id", String.valueOf(((IHostContext) C6193a.m13435a(IHostContext.class)).liveId()));
        hashMap.put("compress", "gzip");
        HashMap hashMap2 = new HashMap(hashMap);
        if (map != null) {
            hashMap2.putAll(map);
        }
        hashMap2.put("cursor", str);
        this.f20358d.mo12964a();
        this.f20373t.f20919a = new AbstractC11887d(uri, hashMap2) {
            /* class com.bytedance.android.livesdk.client.C8206c.C82071 */

            /* renamed from: a */
            final HashMap<String, String> f20380a;

            /* renamed from: b */
            final /* synthetic */ String f20381b;

            /* renamed from: c */
            final /* synthetic */ HashMap f20382c;

            /* renamed from: e */
            private boolean f20384e;

            /* renamed from: f */
            private String f20385f;

            static {
                Covode.recordClassIndex(9031);
            }

            /* JADX WARNING: Removed duplicated region for block: B:17:0x0038  */
            @Override // com.bytedance.android.livesdkapi.p702ws.AbstractC11887d
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void mo14461a(com.bytedance.android.livesdkapi.p702ws.LiveWsMessage r13) {
                /*
                // Method dump skipped, instructions count: 149
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.client.C8206c.C82071.mo14461a(com.bytedance.android.livesdkapi.ws.LiveWsMessage):void");
            }

            @Override // com.bytedance.android.livesdkapi.p702ws.AbstractC11887d
            /* renamed from: a */
            public final void mo14462a(EnumC11885b bVar, JSONObject jSONObject) {
                String str;
                int i;
                int i2 = C82082.f20386a[bVar.ordinal()];
                if (i2 == 1) {
                    C3854a.m9453a(3, "LiveWs", "CONNECTION_UNKNOWN");
                    C3854a.m9453a(4, "LiveWs", "CONNECTION_UNKNOWN");
                } else if (i2 == 2) {
                    C3854a.m9453a(3, "LiveWs", "CONNECTING");
                    C3854a.m9453a(4, "LiveWs", "CONNECTING");
                    C8206c.this.f20358d.mo12964a();
                } else if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 == 5) {
                            C3854a.m9453a(3, "LiveWs", "CONNECTED");
                            C3854a.m9453a(4, "LiveWs", "CONNECTED");
                            if (C8206c.this.f20355a != null) {
                                this.f20384e = true;
                                if (C8206c.this.f20359e != null) {
                                    C11886c a = C11886c.m20979a();
                                    a.f28446a = new WeakReference<>(C8206c.this.f20359e);
                                    if (!(a.f28447b == null || a.f28447b.get() == null)) {
                                        a.f28447b.get();
                                    }
                                }
                                C6763ak akVar = C8206c.this.f20358d;
                                long j = C8206c.this.f20356b;
                                long b = akVar.mo12967b();
                                JSONObject jSONObject2 = new JSONObject();
                                C4017b.m9798a(jSONObject2, "room_id", j);
                                C3868c.m9490a(C6763ak.f16800a, 0, b, jSONObject2);
                                C8206c.this.f20355a.onWebSocketConnected();
                                C3854a.m9453a(3, "LiveWs", "callback.onWebSocketConnected");
                                C3854a.m9453a(4, "LiveWs", "callback.onWebSocketConnected");
                            }
                        }
                    } else if (C8206c.this.f20355a != null) {
                        if (jSONObject != null) {
                            C3854a.m9453a(3, "LiveWs", "CONNECT_CLOSED: " + jSONObject.toString());
                            C3854a.m9453a(4, "LiveWs", "CONNECT_CLOSED: " + jSONObject.toString());
                            int optInt = jSONObject.optInt("error_code", 0);
                            String jSONObject3 = jSONObject.toString();
                            if (optInt != 0) {
                                C8206c.this.f20358d.mo12965a(C8206c.this.f20356b, optInt, jSONObject3, this.f20385f, this.f20380a);
                            }
                        }
                        if (this.f20384e) {
                            C11886c.m20979a().mo19047b();
                            C8206c.this.f20355a.onWebSocketDisconnected();
                            C3854a.m9453a(3, "LiveWs", "callback.onWebSocketDisconnected");
                            C3854a.m9453a(4, "LiveWs", "callback.onWebSocketDisconnected");
                        }
                        this.f20384e = false;
                    }
                } else if (C8206c.this.f20355a != null) {
                    if (jSONObject != null) {
                        C3854a.m9453a(3, "LiveWs", "CONNECT_FAILED: " + jSONObject.toString());
                        C3854a.m9453a(4, "LiveWs", "CONNECT_FAILED: " + jSONObject.toString());
                        int optInt2 = jSONObject.optInt("channel_type");
                        int optInt3 = jSONObject.optInt(StringSet.type, 1);
                        String optString = jSONObject.optString("error", "");
                        if (optInt2 != 1 || optInt3 != 1 || !TextUtils.isEmpty(optString)) {
                            i = jSONObject.optInt("error_code", -1);
                            str = jSONObject.toString();
                        } else {
                            return;
                        }
                    } else {
                        str = "connect failed reason unknow";
                        i = -1;
                    }
                    if (TextUtils.equals(str.trim(), "internet is down, skip...")) {
                        C8206c.this.f20358d.mo12966a(C8206c.this.f20356b, "ttnet no internet check", this.f20385f);
                    } else {
                        C8206c.this.f20358d.mo12965a(C8206c.this.f20356b, i, str, this.f20385f, this.f20380a);
                    }
                    C11886c.m20979a().mo19047b();
                    C8206c.this.f20355a.onWebSocketDisconnected();
                    C3854a.m9453a(3, "LiveWs", "callback.onWebSocketDisconnected");
                    C3854a.m9453a(4, "LiveWs", "callback.onWebSocketDisconnected");
                    this.f20384e = false;
                }
            }

            {
                this.f20381b = r2;
                this.f20382c = r3;
                this.f20385f = r2;
                this.f20380a = r3;
            }
        };
        C5809h.m12739a();
        this.f20359e = ((IHostNetwork) C6193a.m13435a(IHostNetwork.class)).registerWsChannel(this.f20361h, uri, hashMap2, this.f20373t);
    }

    /* renamed from: a */
    private void m16322a(Map<String, String> map, boolean z, boolean z2) {
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("resp_content_type", "protobuf");
        m16320a(map);
        if (this.f20362i == null) {
            this.f20362i = (MessageApi) C5805e.m12718a().mo11572a(MessageApi.class);
        }
        m16321a(map, this.f20357c, z, z2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: java.util.Map<java.lang.String, java.lang.String> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private void m16321a(Map<String, String> map, String str, boolean z, boolean z2) {
        map.put("live_region", DataChannelGlobal.f42558d.mo28324b(C9095dg.class));
        map.put("room_tag", DataChannelGlobal.f42558d.mo28324b(C9100dl.class));
        int i = MessageApiConstant.FetchRule.FETCH_DATA_ONLY;
        if (this.f20372s && !LiveMessageForceHttpSetting.INSTANCE.getValue()) {
            if (z) {
                i = MessageApiConstant.FetchRule.FETCH_DATA_AND_DETERMINE_TYPE;
            } else if (z2) {
                i = MessageApiConstant.FetchRule.FETCH_DATA_FOR_WS_ALONGSIDE;
            }
        }
        AbstractC21983b<C2726d.AbstractC2728b> fetchMessagePbByteArraySource = this.f20362i.fetchMessagePbByteArraySource(this.f20356b, str, map, i, C6496aa.m13886a());
        try {
            this.f20363j = System.currentTimeMillis();
            C22099u<C2726d.AbstractC2728b> execute = fetchMessagePbByteArraySource.execute();
            if (execute.f52261a.mo35845a()) {
                try {
                    if (this.f20355a != null) {
                        ProtoApiResult a = m16318a((C2726d.AbstractC2728b) execute.f52262b, z, false, 0);
                        if (!z || !this.f20372s) {
                            this.f20355a.onApiSuccess(a, i);
                        } else {
                            this.f20355a.onDetermineMessageStrategy(a);
                        }
                    }
                    this.f20375v++;
                } catch (Exception e) {
                    C3854a.m9460b("LiveMessageClient", "Failed to parse message queue", e);
                    m16319a();
                    IMessageWsClient.Callback callback = this.f20355a;
                    if (callback != null) {
                        callback.onApiError(e, i);
                    }
                    this.f20376w++;
                    C11603z.m20415a(-10001, "ParseError", "Parse error, message:" + e.getMessage(), "");
                    C11590y.m20408a(Arrays.toString(e.getStackTrace()));
                }
            } else {
                m16319a();
                IMessageWsClient.Callback callback2 = this.f20355a;
                if (callback2 != null) {
                    callback2.onApiError(new Exception(String.valueOf(execute.f52261a.f52040b)), i);
                }
                this.f20376w++;
                C11603z.m20415a(execute.f52261a.f52040b, "ApiError", "Api error, error_code:" + execute.f52261a.f52040b, null);
                C11590y.m20408a("Api error, error code is " + execute.f52261a.f52040b + '.');
            }
        } catch (Exception e2) {
            m16319a();
            C3854a.m9459b(e2.toString());
            IMessageWsClient.Callback callback3 = this.f20355a;
            if (callback3 != null) {
                callback3.onApiError(e2, i);
            }
            StringWriter stringWriter = new StringWriter();
            e2.printStackTrace(new PrintWriter(stringWriter));
            int i2 = -10000;
            if (e2 instanceof C2963a) {
                i2 = ((C2963a) e2).statusCode;
            }
            this.f20376w++;
            C11603z.m20415a(i2, e2.getClass().getName(), e2.getMessage(), stringWriter.toString());
            C11590y.m20408a(Arrays.toString(e2.getStackTrace()));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x022b A[Catch:{ all -> 0x02c9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x02b8  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.p2082ss.ugc.live.sdk.message.data.ProtoApiResult m16318a(com.bytedance.android.p150e.p151a.p152a.C2726d.AbstractC2728b r18, boolean r19, boolean r20, int r21) {
        /*
        // Method dump skipped, instructions count: 793
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.client.C8206c.m16318a(com.bytedance.android.e.a.a.d$b, boolean, boolean, int):com.ss.ugc.live.sdk.message.data.ProtoApiResult");
    }

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.IMessageWsClient
    public final void sendWebSocketMessage(String str, String str2, byte[] bArr, long j, long j2) {
        AbstractC11884a aVar = this.f20359e;
        if (aVar != null && aVar.mo19043a()) {
            LiveWsMessage.C11883a a = LiveWsMessage.C11883a.m20974a();
            a.f28434b = j;
            a.f28435c = 1;
            a.f28436d = 1;
            a.f28437e = bArr;
            a.f28438f = str2;
            a.f28439g = str;
            this.f20359e.mo19042a(a.mo19041b());
        }
    }
}
