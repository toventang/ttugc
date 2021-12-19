package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.bytedance.covode.number.Covode;

/* renamed from: com.facebook.internal.z */
public abstract class AbstractServiceConnectionC24795z implements ServiceConnection {

    /* renamed from: a */
    public final Context f58827a;

    /* renamed from: b */
    public AbstractC24797a f58828b;

    /* renamed from: c */
    public boolean f58829c;

    /* renamed from: d */
    int f58830d;

    /* renamed from: e */
    public final int f58831e;

    /* renamed from: f */
    private final Handler f58832f;

    /* renamed from: g */
    private Messenger f58833g;

    /* renamed from: h */
    private int f58834h;

    /* renamed from: i */
    private final String f58835i;

    /* renamed from: com.facebook.internal.z$a */
    public interface AbstractC24797a {
        static {
            Covode.recordClassIndex(28950);
        }

        /* renamed from: a */
        void mo40609a(Bundle bundle);
    }

    static {
        Covode.recordClassIndex(28948);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo40605a(Bundle bundle) {
        if (this.f58829c) {
            this.f58829c = false;
            AbstractC24797a aVar = this.f58828b;
            if (aVar != null) {
                aVar.mo40609a(bundle);
            }
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        this.f58833g = null;
        try {
            this.f58827a.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        mo40605a(null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        if (r1 != null) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AbstractServiceConnectionC24795z(android.content.Context r3, java.lang.String r4) {
        /*
            r2 = this;
            r2.<init>()
            android.content.Context r1 = r3.getApplicationContext()
            boolean r0 = com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a.f132201c
            if (r0 != 0) goto L_0x0028
        L_0x000b:
            if (r1 == 0) goto L_0x000e
        L_0x000d:
            r3 = r1
        L_0x000e:
            r2.f58827a = r3
            r0 = 65536(0x10000, float:9.18355E-41)
            r2.f58834h = r0
            r0 = 65537(0x10001, float:9.1837E-41)
            r2.f58830d = r0
            r2.f58835i = r4
            r0 = 20121101(0x133060d, float:3.288145E-38)
            r2.f58831e = r0
            com.facebook.internal.z$1 r0 = new com.facebook.internal.z$1
            r0.<init>()
            r2.f58832f = r0
            return
        L_0x0028:
            if (r1 == 0) goto L_0x002b
            goto L_0x000d
        L_0x002b:
            android.app.Application r1 = com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a.f132199a
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.AbstractServiceConnectionC24795z.<init>(android.content.Context, java.lang.String):void");
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f58833g = new Messenger(iBinder);
        Bundle bundle = new Bundle();
        bundle.putString("com.facebook.platform.extra.APPLICATION_ID", this.f58835i);
        Message obtain = Message.obtain((Handler) null, this.f58834h);
        obtain.arg1 = this.f58831e;
        obtain.setData(bundle);
        obtain.replyTo = new Messenger(this.f58832f);
        try {
            this.f58833g.send(obtain);
        } catch (RemoteException unused) {
            mo40605a(null);
        }
    }
}
