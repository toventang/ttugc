package androidx.work.impl.background.systemalarm;

import android.content.Context;
import androidx.work.AbstractC1600g;
import androidx.work.impl.AbstractC1680c;
import androidx.work.impl.p073b.C1642g;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;

/* renamed from: androidx.work.impl.background.systemalarm.f */
public final class C1672f implements AbstractC1680c {

    /* renamed from: a */
    private static final String f5399a = AbstractC1600g.m5318a("SystemAlarmScheduler");

    /* renamed from: b */
    private final Context f5400b;

    static {
        Covode.recordClassIndex(1836);
    }

    @Override // androidx.work.impl.AbstractC1680c
    /* renamed from: a */
    public final void mo5443a(String str) {
        m5515a(this.f5400b, C1664b.m5499c(this.f5400b, str));
    }

    public C1672f(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        this.f5400b = applicationContext;
    }

    @Override // androidx.work.impl.AbstractC1680c
    /* renamed from: a */
    public final void mo5444a(C1642g... gVarArr) {
        for (C1642g gVar : gVarArr) {
            AbstractC1600g.m5317a();
            C1764a.m5928a("Scheduling work with workSpecId %s", new Object[]{gVar.f5306a});
            m5515a(this.f5400b, C1664b.m5494a(this.f5400b, gVar.f5306a));
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003d */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.ComponentName m5515a(android.content.Context r9, android.content.Intent r10) {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemalarm.C1672f.m5515a(android.content.Context, android.content.Intent):android.content.ComponentName");
    }
}
