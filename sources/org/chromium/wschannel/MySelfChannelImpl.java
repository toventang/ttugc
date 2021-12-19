package org.chromium.wschannel;

import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.apm.C12290b;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.common.wschannel.channel.IWsChannelClient;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import com.ttnet.org.chromium.net.AbstractC87536c;
import com.ttnet.org.chromium.net.AbstractC87674x;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.CronetClient;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

public class MySelfChannelImpl implements WeakHandler.IHandler, IWsChannelClient {
    private static String WSCHANNEL_ACTION_BACK;
    private static String WSCHANNEL_ACTION_FORE;
    private static AbstractC87536c mCronetEngine;
    private static volatile int sChannelID = -1;
    private static volatile AtomicInteger sFirstConnection = new AtomicInteger(0);
    private static String sPackageName;
    private C90233a mCallback = new C90233a();
    private Context mContext;
    private AbstractC87674x mWebsocketConnection;
    private IWsChannelClient mWsChannelClient;
    private boolean sharedConnection = true;

    public int cronetToWsStateAdapter(int i) {
        if (i == -1) {
            return 0;
        }
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i;
        }
        return 6;
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void onNetworkStateChanged(int i) {
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void openConnection(Map map, List list) {
        m156948x8103efbe(this, map, list);
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void destroy() {
        AbstractC87674x xVar = this.mWebsocketConnection;
        if (xVar != null) {
            xVar.mo141899b();
            this.mWebsocketConnection.mo141901d();
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public boolean isConnected() {
        AbstractC87674x xVar = this.mWebsocketConnection;
        if (xVar == null) {
            return false;
        }
        return xVar.mo141900c();
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void stopConnection() {
        AbstractC87674x xVar = this.mWebsocketConnection;
        if (xVar != null) {
            xVar.mo141899b();
            this.mWebsocketConnection.mo141901d();
        }
    }

    static {
        Covode.recordClassIndex(106493);
    }

    private Map<String, String> getClientKeyHeaders() {
        try {
            return (Map) Class.forName("com.bytedance.ttnet.clientkey.ClientKeyManager").getMethod("getClientKeyHeaders", new Class[0]).invoke(null, new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static void loadCronetKernel() {
        Object newInstance = Class.forName("com.bytedance.ttnet.TTNetInit").newInstance();
        Reflect.m24529on(newInstance).call("getInitCompletedLatch");
        Reflect.m24529on(newInstance).call("preInitCronetKernel");
    }

    /* renamed from: org_chromium_wschannel_MySelfChannelImpl_com_ss_android_ugc_aweme_lancet_thread_ThreadPoolLancet_newSingleThreadExecutor */
    public static ExecutorService m156947xcbbe0651() {
        C40787l.C40788a a = C40787l.m82269a(EnumC40793o.FIXED);
        a.f95505c = 1;
        return C40780g.m82242a(a.mo70028a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: org.chromium.wschannel.MySelfChannelImpl$a */
    public class C90233a extends AbstractC87674x.AbstractC87676b {
        static {
            Covode.recordClassIndex(106494);
        }

        C90233a() {
        }

        @Override // com.ttnet.org.chromium.net.AbstractC87674x.AbstractC87676b
        /* renamed from: a */
        public final void mo142100a(ByteBuffer byteBuffer, int i) {
            byte[] bArr = new byte[byteBuffer.capacity()];
            try {
                byteBuffer.get(bArr);
                MySelfChannelImpl.this.onMessage(bArr);
            } catch (Throwable unused) {
            }
        }

        @Override // com.ttnet.org.chromium.net.AbstractC87674x.AbstractC87676b
        /* renamed from: a */
        public final void mo142096a(int i, String str) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(StringSet.type, 1);
                jSONObject.put("state", MySelfChannelImpl.this.cronetToWsStateAdapter(i));
                jSONObject.put("url", str);
                MySelfChannelImpl.this.onConnection(jSONObject);
            } catch (Throwable unused) {
            }
        }

        @Override // com.ttnet.org.chromium.net.AbstractC87674x.AbstractC87676b
        /* renamed from: a */
        public final void mo142097a(int i, String str, String str2) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(StringSet.type, 0);
                jSONObject.put("state", MySelfChannelImpl.this.cronetToWsStateAdapter(i));
                jSONObject.put("url", str);
                jSONObject.put("error", str2);
                MySelfChannelImpl.this.onConnection(jSONObject);
            } catch (Throwable unused) {
            }
        }

        @Override // com.ttnet.org.chromium.net.AbstractC87674x.AbstractC87676b
        /* renamed from: a */
        public final void mo142099a(String str, long j, long j2, boolean z) {
            try {
                C90235a.m156959a().mo145283a(str, j, j2, z);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void onMessage(byte[] bArr) {
        IWsChannelClient iWsChannelClient = this.mWsChannelClient;
        if (iWsChannelClient != null) {
            iWsChannelClient.onMessage(bArr);
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void onConnection(JSONObject jSONObject) {
        if (this.mWsChannelClient != null) {
            try {
                jSONObject.put("channel_type", 1);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            this.mWsChannelClient.onConnection(jSONObject);
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public boolean sendMessage(byte[] bArr) {
        if (this.mWebsocketConnection == null) {
            return false;
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bArr.length);
        allocateDirect.put(bArr);
        this.mWebsocketConnection.mo141898a(allocateDirect);
        return true;
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void onAppStateChanged(int i) {
        Intent intent = new Intent();
        if (i == 1) {
            intent.setAction(WSCHANNEL_ACTION_FORE);
            if (!TextUtils.isEmpty(sPackageName)) {
                intent.setPackage(sPackageName);
            }
            this.mContext.sendBroadcast(intent);
        } else if (i == 2) {
            intent.setAction(WSCHANNEL_ACTION_BACK);
            if (!TextUtils.isEmpty(sPackageName)) {
                intent.setPackage(sPackageName);
            }
            this.mContext.sendBroadcast(intent);
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void onParameterChange(Map<String, Object> map, List<String> list) {
        AbstractC87674x xVar = this.mWebsocketConnection;
        if (xVar != null) {
            xVar.mo141899b();
            this.mWebsocketConnection.mo141901d();
        }
        openConnection(map, list);
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void init(Context context, IWsChannelClient iWsChannelClient) {
        if (sFirstConnection.incrementAndGet() > 1) {
            this.sharedConnection = false;
        }
        this.mContext = context;
        sPackageName = context.getPackageName();
        this.mWsChannelClient = iWsChannelClient;
        try {
            loadCronetKernel();
        } catch (Throwable unused) {
        }
        mCronetEngine = CronetClient.getCronetEngine();
        WSCHANNEL_ACTION_BACK = this.mContext.getPackageName() + ".wschannel.APP_BACKGROUND";
        WSCHANNEL_ACTION_FORE = this.mContext.getPackageName() + ".wschannel.APP_FOREGROUND";
    }

    public void MySelfChannelImpl__openConnection$___twin___(Map<String, Object> map, List<String> list) {
        int intValue;
        if (list == null || list.size() <= 0) {
            throw new IllegalArgumentException("urls size <= 0 !!!");
        } else if (map == null || map.isEmpty()) {
            throw new IllegalArgumentException("configMap is empty !!!");
        } else {
            Object obj = map.get("channel_id");
            if (obj == null) {
                intValue = -1;
            } else {
                intValue = ((Integer) obj).intValue();
            }
            if (sChannelID == -1 && intValue > 0 && sFirstConnection.get() == 1) {
                sChannelID = intValue;
            }
            AbstractC87674x.AbstractC87675a a = mCronetEngine.mo141714a(this.mCallback, m156947xcbbe0651());
            try {
                a.mo142009a(list);
                a.mo142008a(String.valueOf(map.get("app_key")));
                a.mo142013b(((Integer) map.get("fpid")).intValue());
                a.mo142018c(((Integer) map.get("app_version")).intValue());
                a.mo142006a(((Integer) map.get("aid")).intValue());
                a.mo142007a(Long.parseLong((String) map.get("device_id")));
                a.mo142014b(Long.parseLong((String) map.get("iid")));
                if (intValue > 0 && intValue == sChannelID) {
                    this.sharedConnection = true;
                }
                a.mo142011a(this.sharedConnection);
                if (map.containsKey("sid")) {
                    a.mo142015b((String) map.get("sid"));
                }
                String str = (String) map.get("extra");
                HashMap hashMap = new HashMap();
                if (!TextUtils.isEmpty(str)) {
                    String[] split = str.split("&");
                    for (String str2 : split) {
                        if (!TextUtils.isEmpty(str2)) {
                            String[] split2 = str2.split("=");
                            if (split2.length == 2) {
                                hashMap.put(split2[0], split2[1]);
                            }
                        }
                    }
                }
                a.mo142010a(hashMap);
                try {
                    HashMap hashMap2 = new HashMap();
                    Map<String, String> clientKeyHeaders = getClientKeyHeaders();
                    if (clientKeyHeaders != null && !clientKeyHeaders.isEmpty()) {
                        hashMap2.putAll(clientKeyHeaders);
                    }
                    Map map2 = (Map) map.get("custom_headers");
                    if (map2 != null && !map2.isEmpty()) {
                        hashMap2.putAll(map2);
                    }
                    if (!hashMap2.isEmpty()) {
                        a.mo142016b(hashMap2);
                    }
                } catch (Throwable unused) {
                }
                AbstractC87674x a2 = a.mo142012a();
                this.mWebsocketConnection = a2;
                a2.mo141896a();
            } catch (Throwable unused2) {
                throw new IllegalArgumentException("configMap contain err params !!!");
            }
        }
    }

    /* renamed from: org_chromium_wschannel_MySelfChannelImpl_com_ss_android_ugc_aweme_notice_api_ws_WsLancet_openConnection */
    public static void m156948x8103efbe(MySelfChannelImpl mySelfChannelImpl, Map map, List list) {
        String str = "6->openConnection configMap: " + map + ",urls:" + list;
        C51423a.m95791b(4, "WsLancet", str);
        C89219l.m154721d(str, "");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", 4);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("message", str);
            try {
                jSONObject2.put("enter_from", (String) C89361p.m154915b((CharSequence) C89361p.m154915b(str, new String[]{"em="}).get(1), new String[]{"&"}).get(0));
            } catch (Exception e) {
                C51423a.m95790a((Throwable) e);
            }
            C12290b.m22066a("aweme_long_connection_status", jSONObject, (JSONObject) null, jSONObject2);
        } catch (Exception e2) {
            C51423a.m95786a(e2);
        }
        mySelfChannelImpl.MySelfChannelImpl__openConnection$___twin___(map, list);
    }
}
