package com.google.android.play.core.p1961a;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.install.C27058c;
import com.google.android.play.core.install.InstallState;
import com.google.android.play.core.p1963b.C26909b;
import com.google.android.play.core.p1964c.AbstractC26969c;

/* renamed from: com.google.android.play.core.a.e */
public final class C26743e extends AbstractC26969c<InstallState> {
    static {
        Covode.recordClassIndex(32215);
    }

    public C26743e(Context context) {
        super(new C26909b("AppUpdateListenerRegistry"), new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS"), context);
    }

    /* renamed from: a */
    private static Bundle m53109a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static String m53111a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static Object m53110a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    @Override // com.google.android.play.core.p1964c.AbstractC26969c
    /* renamed from: a */
    public final void mo44410a(Context context, Intent intent) {
        if (!context.getPackageName().equals(m53111a(intent, "package.name"))) {
            this.f63854d.mo44595a("ListenerRegistryBroadcastReceiver received broadcast for third party app: %s", m53111a(intent, "package.name"));
            return;
        }
        this.f63854d.mo44595a("List of extras in received intent:", new Object[0]);
        for (String str : m53109a(intent).keySet()) {
            this.f63854d.mo44595a("Key: %s; value: %s", str, m53110a(m53109a(intent), str));
        }
        C26909b bVar = this.f63854d;
        bVar.mo44595a("List of extras in received intent needed by fromUpdateIntent:", new Object[0]);
        bVar.mo44595a("Key: %s; value: %s", "install.status", Integer.valueOf(intent.getIntExtra("install.status", 0)));
        bVar.mo44595a("Key: %s; value: %s", "error.code", Integer.valueOf(intent.getIntExtra("error.code", 0)));
        C27058c cVar = new C27058c(intent.getIntExtra("install.status", 0), intent.getLongExtra("bytes.downloaded", 0), intent.getLongExtra("total.bytes.to.download", 0), intent.getIntExtra("error.code", 0), m53111a(intent, "package.name"));
        this.f63854d.mo44595a("ListenerRegistryBroadcastReceiver.onReceive: %s", cVar);
        mo44661a(cVar);
    }
}
