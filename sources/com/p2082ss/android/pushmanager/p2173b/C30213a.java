package com.p2082ss.android.pushmanager.p2173b;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.common.util.C29843f;
import com.p2082ss.android.message.C30066d;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.push.downgrade.C65713d;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.pushmanager.b.a */
public final class C30213a implements WeakHandler.IHandler {

    /* renamed from: f */
    private static C30213a f72054f;

    /* renamed from: a */
    public Messenger f72055a;

    /* renamed from: b */
    private WeakReference<Context> f72056b;

    /* renamed from: c */
    private Handler f72057c;

    /* renamed from: d */
    private Messenger f72058d;

    /* renamed from: e */
    private long f72059e;

    /* renamed from: g */
    private ServiceConnection f72060g = new ServiceConnection() {
        /* class com.p2082ss.android.pushmanager.p2173b.C30213a.ServiceConnectionC302141 */

        static {
            Covode.recordClassIndex(36720);
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            C30213a.this.f72055a = null;
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C30213a.this.f72055a = new Messenger(iBinder);
            C30213a.this.mo53643a();
        }
    };

    static {
        Covode.recordClassIndex(36719);
    }

    /* renamed from: c */
    private void m61116c() {
        Logger.debug();
        if (this.f72055a != null) {
            try {
                if (this.f72056b.get() != null) {
                    this.f72056b.get().unbindService(this.f72060g);
                }
            } catch (Throwable unused) {
            }
            try {
                this.f72055a = null;
            } catch (Exception unused2) {
            }
        }
    }

    /* renamed from: b */
    private void m61115b() {
        WeakReference<Context> weakReference = this.f72056b;
        if (weakReference != null && weakReference.get() != null) {
            try {
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(this.f72056b.get(), "com.ss.android.message.log.LogService"));
                m61114a(this.f72056b.get(), intent, this.f72060g);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo53643a() {
        try {
            Message obtain = Message.obtain((Handler) null, 0);
            obtain.replyTo = this.f72058d;
            Bundle bundle = new Bundle();
            bundle.putLong("start_id", this.f72059e);
            Logger.debug();
            obtain.obj = bundle;
            this.f72055a.send(obtain);
        } catch (Throwable unused) {
            m61116c();
        }
    }

    /* renamed from: a */
    public static void m61113a(Context context) {
        if (C29843f.m60129a(context) && context != null) {
            C30213a aVar = f72054f;
            if (aVar == null) {
                f72054f = new C30213a(context);
            } else if (aVar.f72055a == null) {
                aVar.m61115b();
            }
        }
    }

    private C30213a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        this.f72056b = new WeakReference<>(applicationContext);
        C30066d.m60817a();
        Looper looper = C30066d.f71756b.getLooper();
        this.f72057c = new WeakHandler(looper == null ? Looper.getMainLooper() : looper, this);
        this.f72058d = new Messenger(this.f72057c);
        m61115b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x009f  */
    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMsg(android.os.Message r22) {
        /*
        // Method dump skipped, instructions count: 230
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.pushmanager.p2173b.C30213a.handleMsg(android.os.Message):void");
    }

    /* renamed from: a */
    private static boolean m61114a(Context context, Intent intent, ServiceConnection serviceConnection) {
        if (context == null || !(context instanceof Context)) {
            return context.bindService(intent, serviceConnection, 1);
        }
        if (C65713d.m117625a(context, intent)) {
            return true;
        }
        return context.bindService(intent, serviceConnection, 1);
    }
}
