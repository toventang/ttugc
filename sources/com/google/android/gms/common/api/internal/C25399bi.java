package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.google.android.gms.common.api.internal.bi */
public final class C25399bi extends BroadcastReceiver {

    /* renamed from: a */
    public Context f60272a;

    /* renamed from: b */
    private final AbstractC25398bh f60273b;

    static {
        Covode.recordClassIndex(30798);
    }

    /* renamed from: a */
    public final synchronized void mo41619a() {
        MethodCollector.m26663i(10098);
        Context context = this.f60272a;
        if (context != null) {
            context.unregisterReceiver(this);
        }
        this.f60272a = null;
        MethodCollector.m26664o(10098);
    }

    public C25399bi(AbstractC25398bh bhVar) {
        this.f60273b = bhVar;
    }

    public final void onReceive(Context context, Intent intent) {
        String str;
        Uri data = intent.getData();
        if (data != null) {
            str = data.getSchemeSpecificPart();
        } else {
            str = null;
        }
        if ("com.google.android.gms".equals(str)) {
            this.f60273b.mo41594a();
            mo41619a();
        }
    }
}
