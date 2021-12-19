package com.p2082ss.android.ugc.aweme.live.livehostimpl;

import android.content.Context;
import android.net.Uri;
import com.bytedance.android.live.base.model.C2959a;
import com.bytedance.android.livesdkapi.host.IHostNetwork;
import com.bytedance.android.livesdkapi.model.AbstractC11837c;
import com.bytedance.android.livesdkapi.model.C11835a;
import com.bytedance.android.livesdkapi.p702ws.AbstractC11884a;
import com.bytedance.android.livesdkapi.p702ws.AbstractC11887d;
import com.bytedance.android.livesdkapi.p702ws.EnumC11885b;
import com.bytedance.android.livesdkapi.p702ws.LiveWsMessage;
import com.bytedance.apm.C12290b;
import com.bytedance.common.wschannel.AbstractC13750h;
import com.bytedance.common.wschannel.C13642a;
import com.bytedance.common.wschannel.C13756k;
import com.bytedance.common.wschannel.app.AbstractC13651e;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.common.wschannel.p912b.C13654b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.p1469l.C20688a;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.common.applog.C29803q;
import com.p2082ss.android.deviceregister.DeviceRegisterManager;
import com.p2082ss.android.ugc.aweme.live.AbstractC58634g;
import com.p2082ss.android.ugc.aweme.live.LiveHostOuterService;
import com.p2082ss.android.ugc.aweme.ttlive.ILiveApi;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.live.livehostimpl.x */
public final class C58708x implements IHostNetwork {

    /* renamed from: a */
    private volatile ILiveApi f133629a;

    static {
        Covode.recordClassIndex(69010);
    }

    @Override // com.bytedance.android.live.base.AbstractC2953a
    public final void onInit() {
    }

    /* renamed from: com.ss.android.ugc.aweme.live.livehostimpl.x$a */
    static class C58713a implements AbstractC11837c<C11835a> {

        /* renamed from: a */
        private AbstractC21983b<TypedInput> f133640a;

        static {
            Covode.recordClassIndex(69015);
        }

        @Override // com.bytedance.android.livesdkapi.model.AbstractC11837c
        /* renamed from: b */
        public final void mo18909b() {
            this.f133640a.cancel();
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x003a A[Catch:{ Exception -> 0x00b0 }] */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0055 A[Catch:{ Exception -> 0x00b0 }, LOOP:0: B:21:0x004f->B:23:0x0055, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0068 A[Catch:{ Exception -> 0x00b0 }] */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x0089 A[Catch:{ Exception -> 0x00b0 }] */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.bytedance.android.livesdkapi.model.C11835a mo18908a() {
            /*
            // Method dump skipped, instructions count: 211
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.live.livehostimpl.C58708x.C58713a.mo18908a():com.bytedance.android.livesdkapi.model.a");
        }

        C58713a(AbstractC21983b<TypedInput> bVar) {
            this.f133640a = bVar;
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final Map<String, String> getCommonParams() {
        HashMap hashMap = new HashMap();
        C29803q.m60037b(hashMap, false);
        return hashMap;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final String getHostDomain() {
        return ((AbstractC58634g) C20688a.m13435a(AbstractC58634g.class)).mo95866a();
    }

    /* renamed from: a */
    private ILiveApi m107873a() {
        if (this.f133629a == null) {
            this.f133629a = (ILiveApi) RetrofitFactory.m33635a().mo28817b("https://" + LiveHostOuterService.m107232p().mo95798a()).mo28832d().mo28858a(ILiveApi.class);
        }
        return this.f133629a;
    }

    /* renamed from: com.ss.android.ugc.aweme.live.livehostimpl.x$4 */
    static /* synthetic */ class C587124 {

        /* renamed from: a */
        static final /* synthetic */ int[] f133639a;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|(3:9|10|12)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0039 */
        static {
            /*
                r0 = 69014(0x10d96, float:9.6709E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.bytedance.common.wschannel.b.c[] r0 = com.bytedance.common.wschannel.p912b.EnumC13655c.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.p2082ss.android.ugc.aweme.live.livehostimpl.C58708x.C587124.f133639a = r2
                com.bytedance.common.wschannel.b.c r0 = com.bytedance.common.wschannel.p912b.EnumC13655c.CONNECTION_UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.p2082ss.android.ugc.aweme.live.livehostimpl.C58708x.C587124.f133639a     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.bytedance.common.wschannel.b.c r0 = com.bytedance.common.wschannel.p912b.EnumC13655c.CONNECTING     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r2 = com.p2082ss.android.ugc.aweme.live.livehostimpl.C58708x.C587124.f133639a     // Catch:{ NoSuchFieldError -> 0x002e }
                com.bytedance.common.wschannel.b.c r0 = com.bytedance.common.wschannel.p912b.EnumC13655c.CONNECT_FAILED     // Catch:{ NoSuchFieldError -> 0x002e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = com.p2082ss.android.ugc.aweme.live.livehostimpl.C58708x.C587124.f133639a     // Catch:{ NoSuchFieldError -> 0x0039 }
                com.bytedance.common.wschannel.b.c r0 = com.bytedance.common.wschannel.p912b.EnumC13655c.CONNECT_CLOSED     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r2 = com.p2082ss.android.ugc.aweme.live.livehostimpl.C58708x.C587124.f133639a     // Catch:{ NoSuchFieldError -> 0x0044 }
                com.bytedance.common.wschannel.b.c r0 = com.bytedance.common.wschannel.p912b.EnumC13655c.CONNECTED     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r0 = 5
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.live.livehostimpl.C58708x.C587124.<clinit>():void");
        }
    }

    /* renamed from: a */
    private static Map<String, String> m107874a(List<C2959a> list) {
        HashMap hashMap = new HashMap();
        if (list != null) {
            for (C2959a aVar : list) {
                hashMap.put(aVar.getName(), aVar.getValue());
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    private static void m107875a(String str) {
        if (C80580in.m139687c()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("url", str);
                jSONObject.putOpt("source", "livesdk");
            } catch (JSONException e) {
                e.printStackTrace();
            }
            C12290b.m22060a("ttlive_minor_mode_live", 1, jSONObject);
        }
    }

    /* renamed from: a */
    public static byte[] m107876a(InputStream inputStream) {
        MethodCollector.m26663i(12113);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (inputStream != null) {
            byte[] bArr = new byte[4096];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        MethodCollector.m26664o(12113);
        return byteArray;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final AbstractC11837c<C11835a> get(String str, List<C2959a> list, Object obj) {
        AbstractC21983b<TypedInput> bVar = m107873a().get(str, m107874a(list), obj);
        m107875a(str);
        return new C58713a(bVar);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final AbstractC11884a registerWsChannel(Context context, String str, Map<String, String> map, final AbstractC11887d dVar) {
        map.put("sid", AppLog.getSessionKey());
        try {
            Uri.Builder buildUpon = Uri.parse(str).buildUpon();
            for (String str2 : map.keySet()) {
                buildUpon.appendQueryParameter(str2, map.get(str2));
            }
            str = buildUpon.build().toString();
        } catch (Throwable unused) {
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        HashMap hashMap = new HashMap();
        hashMap.put("ttnet_ignore_offline", "1");
        C13642a.C13643a a = C13642a.C13643a.m24565a(10001);
        a.f33162f = "e1bd35ec9db7b8d846de66ed140b1ad9";
        a.f33160d = 9;
        a.f33159c = C17867d.f42590n;
        a.f33161e = (int) C17867d.m33084e();
        a.f33163g = DeviceRegisterManager.getDeviceId();
        a.f33164h = DeviceRegisterManager.getInstallId();
        final AbstractC13750h a2 = C13756k.m24805a(context, a.mo21922a(arrayList).mo21923a(hashMap).mo21924a(), new AbstractC13651e() {
            /* class com.p2082ss.android.ugc.aweme.live.livehostimpl.C58708x.C587102 */

            static {
                Covode.recordClassIndex(69012);
            }

            @Override // com.bytedance.common.wschannel.app.AbstractC13651e
            /* renamed from: a */
            public final void mo21945a(WsChannelMsg wsChannelMsg) {
                if (wsChannelMsg != null && wsChannelMsg.f33475m == 10001) {
                    LiveWsMessage.C11883a aVar = new LiveWsMessage.C11883a(wsChannelMsg.f33475m);
                    aVar.f28434b = wsChannelMsg.f33467e;
                    aVar.f28436d = wsChannelMsg.f33469g;
                    aVar.f28440h = wsChannelMsg.f33466d;
                    aVar.f28435c = wsChannelMsg.f33468f;
                    aVar.f28438f = wsChannelMsg.f33472j;
                    aVar.f28439g = wsChannelMsg.f33471i;
                    aVar.f28437e = wsChannelMsg.mo22159a();
                    aVar.f28441i = wsChannelMsg.f33474l;
                    if (wsChannelMsg.f33470h != null) {
                        for (WsChannelMsg.MsgHeader msgHeader : wsChannelMsg.f33470h) {
                            aVar.f28433a.put(msgHeader.f33478a, msgHeader.f33479b);
                        }
                    }
                    dVar.mo14461a(aVar.mo19041b());
                }
            }

            @Override // com.bytedance.common.wschannel.app.AbstractC13651e
            /* renamed from: a */
            public final void mo21944a(C13654b bVar, JSONObject jSONObject) {
                if (bVar != null && bVar.f33174c == 10001) {
                    EnumC11885b bVar2 = EnumC11885b.CONNECTION_UNKNOWN;
                    int i = C587124.f133639a[bVar.f33173b.ordinal()];
                    if (i == 1) {
                        bVar2 = EnumC11885b.CONNECTION_UNKNOWN;
                    } else if (i == 2) {
                        bVar2 = EnumC11885b.CONNECTING;
                    } else if (i == 3) {
                        bVar2 = EnumC11885b.CONNECT_FAILED;
                    } else if (i == 4) {
                        bVar2 = EnumC11885b.CONNECT_CLOSED;
                    } else if (i == 5) {
                        bVar2 = EnumC11885b.CONNECTED;
                    }
                    dVar.mo14462a(bVar2, jSONObject);
                }
            }
        });
        return new AbstractC11884a() {
            /* class com.p2082ss.android.ugc.aweme.live.livehostimpl.C58708x.C587113 */

            static {
                Covode.recordClassIndex(69013);
            }

            @Override // com.bytedance.android.livesdkapi.p702ws.AbstractC11884a
            /* renamed from: a */
            public final boolean mo19043a() {
                return a2.mo22107b();
            }

            @Override // com.bytedance.android.livesdkapi.p702ws.AbstractC11884a
            /* renamed from: b */
            public final void mo19044b() {
                a2.mo22104a();
            }

            @Override // com.bytedance.android.livesdkapi.p702ws.AbstractC11884a
            /* renamed from: a */
            public final void mo19042a(LiveWsMessage liveWsMessage) {
                WsChannelMsg.C13768a aVar = new WsChannelMsg.C13768a(liveWsMessage.f28430k);
                aVar.f33480a = liveWsMessage.f28422c;
                aVar.f33482c = liveWsMessage.f28424e;
                aVar.f33486g = liveWsMessage.f28421b;
                aVar.f33481b = liveWsMessage.f28423d;
                aVar.f33484e = liveWsMessage.f28427h;
                aVar.f33485f = liveWsMessage.f28426g;
                aVar.f33483d = liveWsMessage.mo19030a();
                aVar.f33487h = liveWsMessage.f28429j;
                if (liveWsMessage.f28425f != null) {
                    for (LiveWsMessage.MsgHeader msgHeader : liveWsMessage.f28425f) {
                        aVar.mo22170a(msgHeader.f28431a, msgHeader.f28432b);
                    }
                }
                a2.mo22106a(aVar.mo22171a());
            }
        };
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final AbstractC11837c<C11835a> downloadFile(boolean z, int i, String str, List<C2959a> list, Object obj) {
        AbstractC21983b<TypedInput> downloadFile = m107873a().downloadFile(z, i, str, m107874a(list), obj);
        m107875a(str);
        return new C58713a(downloadFile);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final AbstractC11837c<C11835a> post(String str, List<C2959a> list, String str2, byte[] bArr, Object obj) {
        AbstractC21983b<TypedInput> post = m107873a().post(str, new TypedByteArray(str2, bArr, new String[0]), m107874a(list), obj);
        m107875a(str);
        return new C58713a(post);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final AbstractC11837c<C11835a> uploadFile(int i, String str, List<C2959a> list, final String str2, final byte[] bArr, final long j, final String str3) {
        AbstractC21983b<TypedInput> postMultiPart = m107873a().postMultiPart(i, str, m107874a(list), new TypedOutput() {
            /* class com.p2082ss.android.ugc.aweme.live.livehostimpl.C58708x.C587091 */

            static {
                Covode.recordClassIndex(69011);
            }

            @Override // com.bytedance.retrofit2.mime.TypedOutput
            public final String fileName() {
                return null;
            }

            @Override // com.bytedance.retrofit2.mime.TypedOutput
            public final long length() {
                return j;
            }

            @Override // com.bytedance.retrofit2.mime.TypedOutput
            public final String md5Stub() {
                return str3;
            }

            @Override // com.bytedance.retrofit2.mime.TypedOutput
            public final String mimeType() {
                return str2;
            }

            @Override // com.bytedance.retrofit2.mime.TypedOutput
            public final void writeTo(OutputStream outputStream) {
                MethodCollector.m26663i(13805);
                outputStream.write(bArr);
                MethodCollector.m26664o(13805);
            }
        });
        m107875a(str);
        return new C58713a(postMultiPart);
    }
}
