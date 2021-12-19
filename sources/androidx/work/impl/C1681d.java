package androidx.work.impl;

import android.content.Context;
import android.os.Build;
import androidx.work.AbstractC1600g;
import androidx.work.C1591b;
import androidx.work.impl.background.systemalarm.C1672f;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.background.systemjob.C1679b;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.impl.p073b.AbstractC1645h;
import androidx.work.impl.p073b.C1642g;
import androidx.work.impl.utils.C1706b;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: androidx.work.impl.d */
public final class C1681d {

    /* renamed from: a */
    private static final String f5422a = AbstractC1600g.m5318a("Schedulers");

    static {
        Covode.recordClassIndex(1846);
    }

    /* renamed from: a */
    static AbstractC1680c m5528a(Context context, C1687f fVar) {
        AbstractC1680c fVar2;
        boolean z = true;
        if (Build.VERSION.SDK_INT >= 23) {
            fVar2 = new C1679b(context, fVar);
            C1706b.m5599a(context, SystemJobService.class, true);
            AbstractC1600g.m5317a();
            z = false;
        } else {
            fVar2 = new C1672f(context);
            AbstractC1600g.m5317a();
        }
        C1706b.m5599a(context, SystemAlarmService.class, z);
        return fVar2;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static void m5529a(C1591b bVar, WorkDatabase workDatabase, List<AbstractC1680c> list) {
        int i;
        if (list != null && list.size() != 0) {
            AbstractC1645h i2 = workDatabase.mo5366i();
            workDatabase.mo5091e();
            try {
                if (Build.VERSION.SDK_INT == 23) {
                    i = bVar.f5196f / 2;
                } else {
                    i = bVar.f5196f;
                }
                List<C1642g> a = i2.mo5431a(i);
                if (a.size() > 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    for (C1642g gVar : a) {
                        i2.mo5436b(gVar.f5306a, currentTimeMillis);
                    }
                }
                workDatabase.mo5093g();
                workDatabase.mo5092f();
                if (a.size() > 0) {
                    C1642g[] gVarArr = (C1642g[]) a.toArray(new C1642g[0]);
                    for (AbstractC1680c cVar : list) {
                        cVar.mo5444a(gVarArr);
                    }
                }
            } catch (Throwable th) {
                workDatabase.mo5092f();
                throw th;
            }
        }
    }
}
