package com.bytedance.common.wschannel.client;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.wschannel.C13749g;
import com.bytedance.common.wschannel.client.C13717c;
import com.bytedance.common.wschannel.model.C13769a;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.common.wschannel.p921e.C13746c;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.common.wschannel.client.a */
public abstract class AbstractServiceC13713a extends Service implements WeakHandler.IHandler, C13717c.AbstractC13718a {

    /* renamed from: a */
    private final Handler f33345a = new WeakHandler(this);

    /* renamed from: b */
    private final C13717c f33346b = new C13717c(this);

    /* renamed from: c */
    private Messenger f33347c;

    static {
        Covode.recordClassIndex(15748);
    }

    @Override // com.bytedance.common.wschannel.client.C13717c.AbstractC13718a
    /* renamed from: a */
    public void mo22069a(WsChannelMsg wsChannelMsg) {
    }

    public void onDestroy() {
        super.onDestroy();
        Logger.debug();
    }

    public void onCreate() {
        super.onCreate();
        this.f33347c = new Messenger(this.f33345a);
    }

    public IBinder onBind(Intent intent) {
        return this.f33347c.getBinder();
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        try {
            final long a = C13746c.m24777a();
            if (message != null && message.what == 10123) {
                final Intent intent = (Intent) message.getData().getParcelable("DATA_INTENT");
                Logger.debug();
                if (intent != null) {
                    C13749g.m24785a();
                    C13749g.m24786a(new Runnable() {
                        /* class com.bytedance.common.wschannel.client.AbstractServiceC13713a.RunnableC137152 */

                        static {
                            Covode.recordClassIndex(15750);
                        }

                        public final void run() {
                            AbstractServiceC13713a.this.mo22072a(intent, a);
                        }
                    });
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo22072a(Intent intent, long j) {
        if (intent != null) {
            this.f33346b.mo22079a(intent, new C13769a(j));
        }
    }

    public int onStartCommand(final Intent intent, int i, int i2) {
        String str;
        if (Logger.debug()) {
            StringBuilder sb = new StringBuilder("onStartCommand intent = ");
            if (intent != null) {
                str = intent.toString();
            } else {
                str = "null";
            }
            Logger.m24396d("AbsWsClientService", sb.append(str).toString());
        }
        final long a = C13746c.m24777a();
        C13749g.m24785a();
        C13749g.m24786a(new Runnable() {
            /* class com.bytedance.common.wschannel.client.AbstractServiceC13713a.RunnableC137141 */

            static {
                Covode.recordClassIndex(15749);
            }

            public final void run() {
                AbstractServiceC13713a.this.mo22072a(intent, a);
            }
        });
        return 2;
    }
}
