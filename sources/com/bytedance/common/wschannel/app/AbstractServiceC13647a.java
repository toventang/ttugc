package com.bytedance.common.wschannel.app;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.wschannel.C13752j;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.common.wschannel.app.a */
public abstract class AbstractServiceC13647a extends Service implements WeakHandler.IHandler {

    /* renamed from: a */
    protected WeakHandler f33168a;

    /* renamed from: b */
    private Messenger f33169b;

    static {
        Covode.recordClassIndex(15679);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onCreate() {
        C13752j.m24797a(getApplication(), null);
        this.f33168a = new WeakHandler(this);
        this.f33169b = new Messenger(this.f33168a);
    }

    public IBinder onBind(Intent intent) {
        return this.f33169b.getBinder();
    }

    public boolean onUnbind(Intent intent) {
        return super.onUnbind(intent);
    }
}
