package com.google.android.play.core.assetpacks;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.BadParcelableCrashOptimizer;
import com.google.android.play.core.common.C26972c;
import com.google.android.play.core.p1963b.AbstractC26916bg;
import com.google.android.play.core.p1963b.C26909b;
import com.google.android.play.core.p1964c.AbstractC26969c;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.assetpacks.w */
public final class C26878w extends AbstractC26969c<AssetPackState> {

    /* renamed from: a */
    final C26806bm f63767a;

    /* renamed from: b */
    final C26788av f63768b;

    /* renamed from: c */
    final AbstractC26916bg<AbstractC26857dj> f63769c;

    /* renamed from: f */
    private final C26779am f63770f;

    /* renamed from: g */
    private final C26791ay f63771g;

    /* renamed from: h */
    private final C26972c f63772h;

    /* renamed from: i */
    private final AbstractC26916bg<Executor> f63773i;

    /* renamed from: j */
    private final AbstractC26916bg<Executor> f63774j;

    /* renamed from: k */
    private final Handler f63775k = new Handler(Looper.getMainLooper());

    static {
        Covode.recordClassIndex(32353);
    }

    C26878w(Context context, C26806bm bmVar, C26788av avVar, AbstractC26916bg<AbstractC26857dj> bgVar, C26791ay ayVar, C26779am amVar, C26972c cVar, AbstractC26916bg<Executor> bgVar2, AbstractC26916bg<Executor> bgVar3) {
        super(new C26909b("AssetPackServiceListenerRegistry"), new IntentFilter("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE"), context);
        this.f63767a = bmVar;
        this.f63768b = avVar;
        this.f63769c = bgVar;
        this.f63771g = ayVar;
        this.f63770f = amVar;
        this.f63772h = cVar;
        this.f63773i = bgVar2;
        this.f63774j = bgVar3;
    }

    @Override // com.google.android.play.core.p1964c.AbstractC26969c
    /* renamed from: a */
    public final void mo44410a(Context context, Intent intent) {
        Bundle a = m53371a(intent, "com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE");
        if (a != null) {
            ArrayList<String> stringArrayList = a.getStringArrayList("pack_names");
            if (stringArrayList == null || stringArrayList.size() != 1) {
                this.f63854d.mo44596b("Corrupt bundle received from broadcast.", new Object[0]);
                return;
            }
            Bundle a2 = m53371a(intent, "com.google.android.play.core.FLAGS");
            if (a2 != null) {
                this.f63772h.mo44673a(a2);
            }
            AssetPackState a3 = AssetPackState.m53161a(a, stringArrayList.get(0), this.f63771g, C26880y.f63785a);
            this.f63854d.mo44595a("ListenerRegistryBroadcastReceiver.onReceive: %s", a3);
            PendingIntent pendingIntent = (PendingIntent) a.getParcelable("confirmation_intent");
            if (pendingIntent != null) {
                this.f63770f.f63457a = pendingIntent;
            }
            this.f63774j.mo44603a().execute(new RunnableC26876u(this, a, a3));
            this.f63773i.mo44603a().execute(new RunnableC26877v(this, a));
            return;
        }
        this.f63854d.mo44596b("Empty bundle received from broadcast.", new Object[0]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo44561a(AssetPackState assetPackState) {
        this.f63775k.post(new RunnableC26875t(this, assetPackState));
    }

    /* renamed from: a */
    private static Bundle m53371a(Intent intent, String str) {
        Bundle bundleExtra = intent.getBundleExtra(str);
        Context context = BadParcelableCrashOptimizer.getContext();
        if (!(bundleExtra == null || context == null)) {
            bundleExtra.setClassLoader(context.getClassLoader());
        }
        return bundleExtra;
    }
}
