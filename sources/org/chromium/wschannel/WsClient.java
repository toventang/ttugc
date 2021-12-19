package org.chromium.wschannel;

import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.cronet.websocket.IMessageReceiveListener;
import com.bytedance.frameworks.baselib.network.http.cronet.websocket.IWsClient;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import com.ttnet.org.chromium.net.AbstractC87536c;
import com.ttnet.org.chromium.net.AbstractC87674x;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.chromium.CronetClient;
import org.json.JSONObject;

public class WsClient implements IWsClient {
    private static AbstractC87536c mCronetEngine;
    private C90234a mCallback = new C90234a();
    public IMessageReceiveListener mListener;
    private AbstractC87674x mWebsocketConnection;

    static {
        Covode.recordClassIndex(106495);
    }

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
        return 5;
    }

    private AbstractC87536c getCronetEngine() {
        try {
            loadCronetKernel();
        } catch (Throwable unused) {
        }
        return CronetClient.getCronetEngine();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.websocket.IWsClient
    public boolean isConnected() {
        AbstractC87674x xVar = this.mWebsocketConnection;
        if (xVar == null) {
            return false;
        }
        return xVar.mo141900c();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.websocket.IWsClient
    public void stopConnection() {
        AbstractC87674x xVar = this.mWebsocketConnection;
        if (xVar != null) {
            xVar.mo141899b();
            this.mWebsocketConnection.mo141901d();
        }
    }

    private static void loadCronetKernel() {
        Object newInstance = Class.forName("com.bytedance.ttnet.TTNetInit").newInstance();
        Reflect.m24529on(newInstance).call("getInitCompletedLatch");
        Reflect.m24529on(newInstance).call("preInitCronetKernel");
    }

    /* renamed from: org_chromium_wschannel_WsClient_com_ss_android_ugc_aweme_lancet_thread_ThreadPoolLancet_newSingleThreadExecutor */
    public static ExecutorService m156953xa9969019() {
        C40787l.C40788a a = C40787l.m82269a(EnumC40793o.FIXED);
        a.f95505c = 1;
        return C40780g.m82242a(a.mo70028a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: org.chromium.wschannel.WsClient$a */
    public class C90234a extends AbstractC87674x.AbstractC87676b {
        static {
            Covode.recordClassIndex(106496);
        }

        C90234a() {
        }

        @Override // com.ttnet.org.chromium.net.AbstractC87674x.AbstractC87676b
        /* renamed from: a */
        public final void mo142098a(String str) {
            if (WsClient.this.mListener != null) {
                WsClient.this.mListener.onFeedBackLog(str);
            }
        }

        @Override // com.ttnet.org.chromium.net.AbstractC87674x.AbstractC87676b
        /* renamed from: a */
        public final void mo142096a(int i, String str) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("state", WsClient.this.cronetToWsStateAdapter(i));
                jSONObject.put("url", str);
                if (WsClient.this.mListener != null) {
                    WsClient.this.mListener.onConnection(i, str, jSONObject);
                }
            } catch (Throwable unused) {
            }
        }

        @Override // com.ttnet.org.chromium.net.AbstractC87674x.AbstractC87676b
        /* renamed from: a */
        public final void mo142100a(ByteBuffer byteBuffer, int i) {
            byte[] bArr = new byte[byteBuffer.capacity()];
            if (!(i == 1 || i == 2)) {
                i = 0;
            }
            try {
                byteBuffer.get(bArr);
                if (WsClient.this.mListener != null) {
                    WsClient.this.mListener.onMessage(bArr, i);
                }
            } catch (Throwable unused) {
            }
        }

        @Override // com.ttnet.org.chromium.net.AbstractC87674x.AbstractC87676b
        /* renamed from: a */
        public final void mo142097a(int i, String str, String str2) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("url", str);
                jSONObject.put("error", str2);
                if (WsClient.this.mListener != null) {
                    WsClient.this.mListener.onConnection(i, str, jSONObject);
                }
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

    public WsClient(IMessageReceiveListener iMessageReceiveListener) {
        if (mCronetEngine == null) {
            mCronetEngine = getCronetEngine();
        }
        this.mListener = iMessageReceiveListener;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.websocket.IWsClient
    public boolean sendMessage(byte[] bArr, int i) {
        if (this.mWebsocketConnection == null) {
            return false;
        }
        if (i == 2) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bArr.length);
            allocateDirect.put(bArr);
            this.mWebsocketConnection.mo141898a(allocateDirect);
        } else if (i == 1) {
            this.mWebsocketConnection.mo141897a(new String(bArr, "UTF-8"));
        } else {
            throw new IllegalArgumentException("Unsupported message type: ".concat(String.valueOf(i)));
        }
        return true;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.websocket.IWsClient
    public void onParameterChange(Map<String, String> map, Map<String, String> map2, List<String> list, boolean z, boolean z2) {
        AbstractC87674x xVar = this.mWebsocketConnection;
        if (xVar != null) {
            xVar.mo141899b();
            this.mWebsocketConnection.mo141901d();
        }
        openConnection(map, map2, list, z, z2);
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.websocket.IWsClient
    public void openConnection(Map<String, String> map, Map<String, String> map2, List<String> list, boolean z, boolean z2) {
        if (list == null || list.size() <= 0) {
            throw new IllegalArgumentException("urls size <= 0 !!!");
        }
        AbstractC87674x.AbstractC87675a a = mCronetEngine.mo141714a(this.mCallback, m156953xa9969019());
        a.mo142009a(list);
        if (map != null && !map.isEmpty()) {
            a.mo142010a(map);
        }
        if (map2 != null && !map2.isEmpty()) {
            a.mo142016b(map2);
        }
        a.mo142011a(z);
        a.mo142017b(z2);
        AbstractC87674x a2 = a.mo142012a();
        this.mWebsocketConnection = a2;
        a2.mo141896a();
    }
}
