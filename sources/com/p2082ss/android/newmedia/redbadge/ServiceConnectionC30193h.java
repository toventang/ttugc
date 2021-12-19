package com.p2082ss.android.newmedia.redbadge;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.newmedia.redbadge.h */
public final class ServiceConnectionC30193h implements ServiceConnection {

    /* renamed from: a */
    private Intent f71991a;

    /* renamed from: b */
    private boolean f71992b = true;

    /* renamed from: c */
    private Context f71993c;

    static {
        Covode.recordClassIndex(36695);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        try {
            this.f71993c.unbindService(this);
        } catch (Throwable unused) {
        }
    }

    ServiceConnectionC30193h(Intent intent, Context context) {
        this.f71991a = intent;
        this.f71993c = context;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Messenger messenger = new Messenger(iBinder);
        Message message = new Message();
        try {
            message.what = 101;
            message.getData().putParcelable("intent", this.f71991a);
            messenger.send(message);
            try {
                if (this.f71992b) {
                    this.f71993c.unbindService(this);
                }
            } catch (Throwable unused) {
            }
        } catch (Exception e) {
            e.printStackTrace();
            if (this.f71992b) {
                this.f71993c.unbindService(this);
            }
        } catch (Throwable unused2) {
        }
    }
}
