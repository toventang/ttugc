package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.common.util.C25609k;
import com.google.android.gms.p1940d.AbstractC25631h;
import com.google.android.gms.p1940d.C25635k;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.firebase.iid.b */
public final class C27786b implements AbstractC27754a {

    /* renamed from: a */
    private static final Object f65284a = new Object();

    /* renamed from: b */
    private static ServiceConnectionC27782av f65285b;

    /* renamed from: c */
    private final Context f65286c;

    /* renamed from: d */
    private final ExecutorService f65287d;

    static {
        Covode.recordClassIndex(33374);
    }

    @Override // com.google.firebase.iid.AbstractC27754a
    /* renamed from: a */
    public final AbstractC25631h<Integer> mo46406a(Intent intent) {
        boolean z;
        String a = m55569a(intent, "gcm.rawData64");
        boolean z2 = false;
        if (a != null) {
            intent.putExtra("rawData", Base64.decode(a, 0));
            intent.removeExtra("gcm.rawData64");
        }
        Context context = this.f65286c;
        if (!C25609k.m49423e() || context.getApplicationInfo().targetSdkVersion < 26) {
            z = false;
        } else {
            z = true;
        }
        if ((intent.getFlags() & 268435456) != 0) {
            z2 = true;
        }
        if (!z || z2) {
            return C25635k.m49513a(this.f65287d, new CallableC27787c(context, intent)).mo41881b(this.f65287d, new C27788d(context, intent));
        }
        return m55567a(context, intent);
    }

    public C27786b(Context context, ExecutorService executorService) {
        this.f65286c = context;
        this.f65287d = executorService;
    }

    /* renamed from: a */
    private static String m55569a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    static AbstractC25631h<Integer> m55567a(Context context, Intent intent) {
        return m55568a(context, "com.google.firebase.MESSAGING_EVENT").mo46438a(intent).mo41871a(C27791g.f65294a, C27789e.f65292a);
    }

    /* renamed from: a */
    private static ServiceConnectionC27782av m55568a(Context context, String str) {
        ServiceConnectionC27782av avVar;
        MethodCollector.m26663i(13138);
        synchronized (f65284a) {
            try {
                if (f65285b == null) {
                    f65285b = new ServiceConnectionC27782av(context, str);
                }
                avVar = f65285b;
            } finally {
                MethodCollector.m26664o(13138);
            }
        }
        return avVar;
    }
}
