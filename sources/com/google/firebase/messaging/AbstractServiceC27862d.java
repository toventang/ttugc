package com.google.firebase.messaging;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.util.p1939a.ThreadFactoryC25597b;
import com.google.android.gms.internal.p1948g.C25740a;
import com.google.android.gms.p1940d.AbstractC25631h;
import com.google.android.gms.p1940d.C25632i;
import com.google.android.gms.p1940d.C25635k;
import com.google.firebase.iid.BinderC27779at;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.firebase.messaging.d */
public abstract class AbstractServiceC27862d extends Service {
    private Binder binder;
    final ExecutorService executor = C25740a.f60862a.mo41969a(new ThreadFactoryC25597b("Firebase-Messaging-Intent-Handle"));
    private int lastStartId;
    private final Object lock = new Object();
    private int runningTasks = 0;

    static {
        Covode.recordClassIndex(33455);
    }

    /* renamed from: com_google_firebase_messaging_EnhancedIntentService_com_ss_android_ugc_aweme_lancet_LogLancet_d */
    public static int m55777x6cee906c(String str, String str2) {
        return 0;
    }

    /* access modifiers changed from: protected */
    public Intent getStartCommandIntent(Intent intent) {
        return intent;
    }

    public abstract void handleIntent(Intent intent);

    public boolean handleIntentOnMainThread(Intent intent) {
        return false;
    }

    public void onDestroy() {
        this.executor.shutdown();
        super.onDestroy();
    }

    /* access modifiers changed from: package-private */
    public boolean stopSelfResultHook(int i) {
        return stopSelfResult(i);
    }

    public AbstractC25631h<Void> processIntent(Intent intent) {
        if (handleIntentOnMainThread(intent)) {
            return C25635k.m49512a((Object) null);
        }
        C25632i iVar = new C25632i();
        this.executor.execute(new RunnableC27864e(this, intent, iVar));
        return iVar.f60753a;
    }

    public final synchronized IBinder onBind(Intent intent) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            m55777x6cee906c("EnhancedIntentService", "Service received bind request");
        }
        if (this.binder == null) {
            this.binder = new BinderC27779at(new BinderC27779at.AbstractC27780a() {
                /* class com.google.firebase.messaging.AbstractServiceC27862d.C278631 */

                static {
                    Covode.recordClassIndex(33456);
                }

                @Override // com.google.firebase.iid.BinderC27779at.AbstractC27780a
                /* renamed from: a */
                public final AbstractC25631h<Void> mo46437a(Intent intent) {
                    return AbstractServiceC27862d.this.processIntent(intent);
                }
            });
        }
        return this.binder;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0048, code lost:
        if (r3.f60074h == 1) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void finishTask(android.content.Intent r17) {
        /*
        // Method dump skipped, instructions count: 165
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.AbstractServiceC27862d.finishTask(android.content.Intent):void");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$onStartCommand$1$EnhancedIntentService(Intent intent, AbstractC25631h hVar) {
        finishTask(intent);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$processIntent$0$EnhancedIntentService(Intent intent, C25632i iVar) {
        try {
            handleIntent(intent);
        } finally {
            iVar.mo41894a((Object) null);
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.lock) {
            this.lastStartId = i2;
            this.runningTasks++;
        }
        Intent startCommandIntent = getStartCommandIntent(intent);
        if (startCommandIntent == null) {
            finishTask(intent);
            return 2;
        }
        AbstractC25631h<Void> processIntent = processIntent(startCommandIntent);
        if (processIntent.mo41880a()) {
            finishTask(intent);
            return 2;
        }
        processIntent.mo41873a(ExecutorC27865f.f65447a, new C27866g(this, intent));
        return 3;
    }
}
