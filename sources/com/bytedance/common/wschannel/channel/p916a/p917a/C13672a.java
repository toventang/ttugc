package com.bytedance.common.wschannel.channel.p916a.p917a;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.wschannel.C13752j;
import com.bytedance.common.wschannel.C13758l;
import com.bytedance.common.wschannel.WsChannelMultiProcessSharedProvider;
import com.bytedance.common.wschannel.channel.IWsChannelClient;
import com.bytedance.common.wschannel.channel.p916a.p917a.C13677b;
import com.bytedance.common.wschannel.channel.p916a.p917a.p918a.C13676c;
import com.bytedance.common.wschannel.p913c.AbstractC13658a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p4632k.C89427i;

/* renamed from: com.bytedance.common.wschannel.channel.a.a.a */
public final class C13672a implements WeakHandler.IHandler, IWsChannelClient {

    /* renamed from: a */
    public Context f33196a;

    /* renamed from: b */
    public Map<String, Object> f33197b = new HashMap();

    /* renamed from: c */
    public List<String> f33198c;

    /* renamed from: d */
    private final int f33199d;

    /* renamed from: e */
    private Handler f33200e;

    /* renamed from: f */
    private C13677b f33201f;

    /* renamed from: g */
    private boolean f33202g;

    /* renamed from: h */
    private ContentObserver f33203h;

    static {
        Covode.recordClassIndex(15706);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final void onConnection(JSONObject jSONObject) {
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final void onMessage(byte[] bArr) {
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final boolean isConnected() {
        return this.f33201f.mo22004f();
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final void stopConnection() {
        this.f33201f.mo21994a();
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final void destroy() {
        C13677b bVar = this.f33201f;
        bVar.f33211c.removeMessages(2);
        bVar.f33211c.removeMessages(1);
        bVar.f33211c.removeMessages(3);
        bVar.f33211c.removeMessages(5);
        bVar.mo21997a(new Runnable() {
            /* class com.bytedance.common.wschannel.channel.p916a.p917a.C13677b.RunnableC136825 */

            static {
                Covode.recordClassIndex(15716);
            }

            public final void run() {
                C13677b.this.mo21994a();
            }
        });
        try {
            Context context = this.f33196a;
            if (context != null) {
                context.getContentResolver().unregisterContentObserver(this.f33203h);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static boolean m24614a(Context context) {
        return C13758l.m24811a(context).f33414a.mo21919a("key_ok_impl_enable", true);
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final void onAppStateChanged(int i) {
        if (m24614a(this.f33196a)) {
            C13677b bVar = this.f33201f;
            boolean z = true;
            if (i != 1) {
                z = false;
            }
            bVar.f33211c.obtainMessage(5, Boolean.valueOf(z)).sendToTarget();
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final void onNetworkStateChanged(int i) {
        if (m24614a(this.f33196a)) {
            this.f33201f.f33211c.obtainMessage(3, Integer.valueOf(i)).sendToTarget();
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final boolean sendMessage(byte[] bArr) {
        if (!m24614a(this.f33196a)) {
            return false;
        }
        C13677b bVar = this.f33201f;
        C89427i of = C89427i.m155136of(bArr);
        if (bVar.f33213e == null || !bVar.mo22004f() || !(of instanceof C89427i)) {
            return false;
        }
        return bVar.f33213e.mo22045c(of);
    }

    public C13672a(int i, Handler handler) {
        this.f33199d = i;
        this.f33200e = handler;
        this.f33203h = new ContentObserver(this.f33200e) {
            /* class com.bytedance.common.wschannel.channel.p916a.p917a.C13672a.C136731 */

            static {
                Covode.recordClassIndex(15707);
            }

            public final void onChange(boolean z) {
                super.onChange(z);
                if (C13672a.m24614a(C13672a.this.f33196a)) {
                    C13672a aVar = C13672a.this;
                    aVar.openConnection(aVar.f33197b, C13672a.this.f33198c);
                    return;
                }
                C13672a.this.stopConnection();
            }
        };
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final void onParameterChange(Map<String, Object> map, List<String> list) {
        if (map != null) {
            this.f33197b.putAll(map);
        }
        this.f33198c = list;
        if (m24614a(this.f33196a)) {
            C13677b bVar = this.f33201f;
            if (!list.isEmpty()) {
                bVar.mo21997a(new Runnable(map, list) {
                    /* class com.bytedance.common.wschannel.channel.p916a.p917a.C13677b.RunnableC136847 */

                    /* renamed from: a */
                    final /* synthetic */ Map f33232a;

                    /* renamed from: b */
                    final /* synthetic */ List f33233b;

                    static {
                        Covode.recordClassIndex(15718);
                    }

                    public final void run() {
                        C13677b.this.mo21999a(this.f33232a);
                        C13677b bVar = C13677b.this;
                        bVar.handleMsg(bVar.f33211c.obtainMessage(7, this.f33233b));
                    }

                    {
                        this.f33232a = r2;
                        this.f33233b = r3;
                    }
                });
            }
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final void openConnection(Map<String, Object> map, List<String> list) {
        if (map != null) {
            this.f33197b.putAll(map);
        }
        this.f33198c = list;
        if (m24614a(this.f33196a)) {
            C13677b bVar = this.f33201f;
            if (!list.isEmpty()) {
                bVar.mo21997a(new Runnable(map, list) {
                    /* class com.bytedance.common.wschannel.channel.p916a.p917a.C13677b.RunnableC136814 */

                    /* renamed from: a */
                    final /* synthetic */ Map f33227a;

                    /* renamed from: b */
                    final /* synthetic */ List f33228b;

                    static {
                        Covode.recordClassIndex(15715);
                    }

                    public final void run() {
                        int e = C13677b.this.mo22003e();
                        if (e != 4 && e != 1 && e != 5) {
                            C13677b.this.mo21999a(this.f33227a);
                            C13677b bVar = C13677b.this;
                            bVar.handleMsg(bVar.f33211c.obtainMessage(2, this.f33228b));
                        }
                    }

                    {
                        this.f33227a = r2;
                        this.f33228b = r3;
                    }
                });
            }
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final void init(Context context, IWsChannelClient iWsChannelClient) {
        if (!this.f33202g) {
            this.f33202g = true;
            Context applicationContext = context.getApplicationContext();
            if (C58003a.f132201c && applicationContext == null) {
                applicationContext = C58003a.f132199a;
            }
            this.f33196a = applicationContext;
            C13677b.C13685a aVar = new C13677b.C13685a(context);
            aVar.f33238d = new C13676c(context);
            AbstractC13658a aVar2 = C13752j.f33399e.get(Integer.valueOf(this.f33199d));
            if (aVar2 != null) {
                aVar.f33239e = aVar2;
            }
            C13677b bVar = new C13677b(new C13677b.C13686b(aVar.f33235a, aVar.f33236b, aVar.f33237c, aVar.f33238d, aVar.f33239e), (byte) 0);
            this.f33201f = bVar;
            bVar.f33212d = new C13711d(this.f33196a, this.f33201f, iWsChannelClient);
            try {
                context.getContentResolver().registerContentObserver(WsChannelMultiProcessSharedProvider.m24549a(context, "key_ok_impl_enable", "boolean"), true, this.f33203h);
            } catch (Throwable unused) {
            }
        }
    }
}
