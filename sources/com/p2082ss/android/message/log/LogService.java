package com.p2082ss.android.message.log;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.ServiceLifecycle;
import com.p2082ss.android.message.C30066d;
import com.p2082ss.android.p2203ug.bus.C30980b;
import com.p2082ss.android.pushmanager.p2172a.C30209b;
import org.json.JSONArray;

/* renamed from: com.ss.android.message.log.LogService */
public class LogService extends Service implements WeakHandler.IHandler {

    /* renamed from: a */
    private Messenger f71760a;

    static {
        Covode.recordClassIndex(36562);
    }

    public void onCreate() {
        super.onCreate();
        try {
            C30209b.AbstractC30210a aVar = (C30209b.AbstractC30210a) C30980b.m63694a(C30209b.AbstractC30210a.class);
            if (aVar != null) {
                aVar.mo35465a();
            }
        } catch (Throwable unused) {
        }
        C30066d.m60817a();
        this.f71760a = new Messenger(new WeakHandler(C30066d.f71756b.getLooper(), this));
    }

    public IBinder onBind(Intent intent) {
        return this.f71760a.getBinder();
    }

    public boolean onUnbind(Intent intent) {
        return super.onUnbind(intent);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        C30067a aVar;
        try {
            aVar = C30067a.m60819a(this);
        } catch (Exception e) {
            e.printStackTrace();
            aVar = null;
        } catch (Throwable unused) {
            return;
        }
        int i = message.what;
        if (i != 0) {
            if (i == 1 && message.replyTo != null) {
                Messenger messenger = message.replyTo;
                long[] longArray = ((Bundle) message.obj).getLongArray("event_ids");
                if (longArray == null) {
                    return;
                }
                if (aVar == null) {
                    messenger.send(Message.obtain((Handler) null, 2));
                    return;
                }
                for (long j : longArray) {
                    aVar.mo53438a(j);
                }
            }
        } else if (message.replyTo != null) {
            Messenger messenger2 = message.replyTo;
            long j2 = ((Bundle) message.obj).getLong("start_id", 0);
            if (aVar == null) {
                messenger2.send(Message.obtain((Handler) null, 2));
                return;
            }
            JSONArray b = aVar.mo53439b(j2);
            if (b == null) {
                messenger2.send(Message.obtain((Handler) null, 2));
                return;
            }
            Message obtain = Message.obtain((Handler) null, 0);
            Bundle bundle = new Bundle();
            bundle.putString("events", b.toString());
            if (b.length() >= 5) {
                bundle.putBoolean("has_more", true);
            } else {
                bundle.putBoolean("has_more", false);
            }
            obtain.obj = bundle;
            messenger2.send(obtain);
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        ServiceLifecycle.onStartCommand(this, intent, i, i2);
        int onStartCommand = super.onStartCommand(intent, i, i2);
        C30209b.AbstractC30211b a = C30209b.m61099a();
        if (a == null || a.mo35474g()) {
            return 2;
        }
        return onStartCommand;
    }
}
