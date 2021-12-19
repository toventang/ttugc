package com.bytedance.common.wschannel.server;

import android.content.Intent;
import android.os.Message;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.common.wschannel.app.AbstractC13649c;
import com.bytedance.common.wschannel.app.AbstractC13650d;
import com.bytedance.common.wschannel.app.AbstractServiceC13647a;
import com.bytedance.common.wschannel.app.IWsApp;
import com.bytedance.common.wschannel.p920d.C13738a;
import com.bytedance.common.wschannel.p920d.C13740b;
import com.bytedance.common.wschannel.p921e.C13744a;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.ServiceLifecycle;

public class WsChannelService extends AbstractServiceC13647a {
    static {
        Covode.recordClassIndex(15817);
    }

    @Override // com.bytedance.common.wschannel.app.AbstractServiceC13647a
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.bytedance.common.wschannel.app.AbstractServiceC13647a
    public void onCreate() {
        Logger.debug();
        super.onCreate();
        C13792i.m24891a(this);
    }

    /* renamed from: a */
    static int m24833a(IWsApp iWsApp) {
        if (iWsApp == null) {
            return Integer.MIN_VALUE;
        }
        return iWsApp.mo21927a();
    }

    @Override // com.bytedance.common.wschannel.app.AbstractServiceC13647a, com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        super.handleMsg(message);
        if (message != null) {
            Logger.debug();
            C13792i.m24891a(this).handleMsg(message);
        }
    }

    /* renamed from: a */
    private static String m24834a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: com.bytedance.common.wschannel.server.WsChannelService$a */
    static class C13770a {

        /* renamed from: a */
        final int f33491a;

        /* renamed from: b */
        final byte[] f33492b;

        /* renamed from: c */
        final long f33493c;

        static {
            Covode.recordClassIndex(15818);
        }

        C13770a(int i, byte[] bArr, long j) {
            this.f33491a = i;
            this.f33492b = bArr;
            this.f33493c = j;
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        ServiceLifecycle.onStartCommand(this, intent, i, i2);
        Logger.debug();
        if (intent != null) {
            String action = intent.getAction();
            if ("com.bytedance.article.wschannel.appstate".equals(action)) {
                int intExtra = intent.getIntExtra("app_state", -1);
                Message message = new Message();
                message.what = 2;
                message.arg1 = intExtra;
                handleMsg(message);
            } else if ("com.bytedance.article.wschannel.networkstate".equals(action)) {
                int intExtra2 = intent.getIntExtra("network_state", -1);
                Message message2 = new Message();
                message2.what = 3;
                message2.arg1 = intExtra2;
                handleMsg(message2);
            }
            try {
                String a = m24834a(intent, "key_link_progress_change");
                WsConstants.setLinkProcessChangeListenerClassName(a);
                C13740b bVar = C13740b.C13741a.f33382a;
                if (a != null) {
                    try {
                        Object newInstance = Class.forName(a).newInstance();
                        if (newInstance instanceof AbstractC13650d) {
                            bVar.f33381a = (AbstractC13650d) newInstance;
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            } catch (Exception unused) {
            }
            try {
                String a2 = m24834a(intent, "key_connection_change");
                WsConstants.setConnectionChangeListenerClassName(a2);
                C13738a aVar = C13738a.C13739a.f33380a;
                if (a2 != null) {
                    try {
                        Object newInstance2 = Class.forName(a2).newInstance();
                        if (newInstance2 instanceof AbstractC13649c) {
                            aVar.f33379a = (AbstractC13649c) newInstance2;
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            } catch (Exception unused2) {
            }
        }
        if (C13744a.m24774a()) {
            return 2;
        }
        return 1;
    }
}
