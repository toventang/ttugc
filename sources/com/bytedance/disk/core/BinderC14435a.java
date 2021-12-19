package com.bytedance.disk.core;

import com.bytedance.covode.number.Covode;
import com.bytedance.disk.p956a.AbstractC14425b;
import com.bytedance.disk.p961e.AbstractC14449d;
import com.bytedance.disk.parcel.MigrationItem;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.disk.core.a */
public class BinderC14435a extends AbstractC14425b.AbstractBinderC14426a {

    /* renamed from: b */
    public static AtomicBoolean f34919b = new AtomicBoolean(true);

    /* renamed from: c */
    private static volatile BinderC14435a f34920c;

    /* renamed from: a */
    public ArrayList<AbstractC14449d> f34921a = new ArrayList<>(2);

    static {
        Covode.recordClassIndex(16514);
    }

    private BinderC14435a() {
    }

    /* renamed from: a */
    public static BinderC14435a m26355a() {
        MethodCollector.m26663i(3444);
        if (f34920c == null) {
            synchronized (BinderC14435a.class) {
                try {
                    if (f34920c == null) {
                        f34920c = new BinderC14435a();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(3444);
                    throw th;
                }
            }
        }
        BinderC14435a aVar = f34920c;
        MethodCollector.m26664o(3444);
        return aVar;
    }

    @Override // com.bytedance.disk.p956a.AbstractC14425b
    /* renamed from: a */
    public final void mo23248a(MigrationItem migrationItem) {
        MethodCollector.m26663i(3450);
        synchronized (this.f34921a) {
            try {
                f34919b.set(false);
                Iterator<AbstractC14449d> it = this.f34921a.iterator();
                while (it.hasNext()) {
                    AbstractC14449d next = it.next();
                    if (next != null) {
                        next.mo23269a(migrationItem.f35012c.f35021c, migrationItem.f35015f);
                    }
                }
                f34919b.set(true);
            } finally {
                MethodCollector.m26664o(3450);
            }
        }
    }
}
