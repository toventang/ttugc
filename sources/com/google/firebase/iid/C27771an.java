package com.google.firebase.iid;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.p1940d.AbstractC25626c;
import com.google.android.gms.p1940d.AbstractC25631h;
import java.util.concurrent.ScheduledFuture;

/* access modifiers changed from: package-private */
/* renamed from: com.google.firebase.iid.an */
public final /* synthetic */ class C27771an implements AbstractC25626c {

    /* renamed from: a */
    private final C27766aj f65249a;

    /* renamed from: b */
    private final String f65250b;

    /* renamed from: c */
    private final ScheduledFuture f65251c;

    static {
        Covode.recordClassIndex(33359);
    }

    C27771an(C27766aj ajVar, String str, ScheduledFuture scheduledFuture) {
        this.f65249a = ajVar;
        this.f65250b = str;
        this.f65251c = scheduledFuture;
    }

    @Override // com.google.android.gms.p1940d.AbstractC25626c
    /* renamed from: a */
    public final void mo36732a(AbstractC25631h hVar) {
        MethodCollector.m26663i(13482);
        C27766aj ajVar = this.f65249a;
        String str = this.f65250b;
        ScheduledFuture scheduledFuture = this.f65251c;
        synchronized (ajVar.f65237a) {
            try {
                ajVar.f65237a.remove(str);
            } catch (Throwable th) {
                MethodCollector.m26664o(13482);
                throw th;
            }
        }
        scheduledFuture.cancel(false);
        MethodCollector.m26664o(13482);
    }
}
