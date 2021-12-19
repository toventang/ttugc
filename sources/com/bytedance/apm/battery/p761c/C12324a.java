package com.bytedance.apm.battery.p761c;

import android.text.TextUtils;
import com.bytedance.apm.C12397c;
import com.bytedance.apm.battery.C12311a;
import com.bytedance.apm.battery.dao.p764a.C12347a;
import com.bytedance.apm.battery.p762d.AbstractC12343g;
import com.bytedance.apm.p772e.C12447a;
import com.bytedance.apm.p788p.C12560b;
import com.bytedance.apm.p789q.C12585h;
import com.bytedance.covode.number.Covode;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.apm.battery.c.a */
public final class C12324a {

    /* renamed from: a */
    public volatile boolean f29669a;

    /* renamed from: b */
    public String f29670b;

    /* renamed from: c */
    String f29671c;

    /* renamed from: d */
    public final LinkedList<C12447a> f29672d;

    /* renamed from: e */
    private C12347a f29673e;

    static {
        Covode.recordClassIndex(14129);
    }

    /* renamed from: com.bytedance.apm.battery.c.a$a */
    public static class C12327a {

        /* renamed from: a */
        public static final C12324a f29677a = new C12324a((byte) 0);

        static {
            Covode.recordClassIndex(14132);
        }
    }

    private C12324a() {
        this.f29670b = "";
        this.f29672d = new LinkedList<>();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C12347a mo20055b() {
        if (this.f29673e == null) {
            this.f29673e = C12347a.m22182c();
        }
        return this.f29673e;
    }

    /* renamed from: a */
    public final void mo20052a() {
        C12560b.C12564a.f30567a.mo20387a(new Runnable() {
            /* class com.bytedance.apm.battery.p761c.C12324a.RunnableC123262 */

            static {
                Covode.recordClassIndex(14131);
            }

            public final void run() {
                LinkedList linkedList;
                boolean z;
                C12324a aVar = C12324a.this;
                if (C12397c.m22285b()) {
                    C12328b bVar = new C12328b();
                    List<C12447a> a = aVar.mo20051a(true, 0L);
                    if (!C12585h.m22682a(a)) {
                        try {
                            z = C12324a.m22103a(bVar, a);
                        } catch (Exception unused) {
                            z = false;
                        }
                        C12447a aVar2 = a.get(a.size() - 1);
                        long j = aVar2.f30224a;
                        long j2 = aVar2.f30226c;
                        if (!z) {
                            if (C12397c.m22288e()) {
                                new String[]{"report main process data failed, clean data and stop calc data of other process"};
                            }
                            aVar.mo20053a(j);
                        } else {
                            if (C12397c.m22288e()) {
                                new String[]{"report main process data over, begin handle other process data"};
                            }
                            List<C12447a> a2 = aVar.mo20051a(false, j2);
                            HashMap hashMap = new HashMap(4);
                            for (C12447a aVar3 : a2) {
                                String str = aVar3.f30233j;
                                List list = (List) hashMap.get(str);
                                if (list != null) {
                                    list.add(aVar3);
                                } else {
                                    LinkedList linkedList2 = new LinkedList();
                                    linkedList2.add(aVar3);
                                    hashMap.put(str, linkedList2);
                                }
                            }
                            try {
                                for (List list2 : hashMap.values()) {
                                    C12324a.m22103a(bVar, list2);
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            bVar.f29684f = (long) bVar.f29696r;
                            bVar.f29681c = (long) bVar.f29699u;
                            bVar.f29682d = (long) bVar.f29697s;
                            bVar.f29685g = bVar.f29700v;
                            bVar.f29683e = (long) bVar.f29698t;
                            bVar.f29679a = bVar.f29694p;
                            bVar.f29689k = (long) bVar.f29701w;
                            bVar.f29686h = (long) bVar.f29704z;
                            bVar.f29687i = (long) bVar.f29702x;
                            bVar.f29690l = bVar.f29678A;
                            bVar.f29688j = (long) bVar.f29703y;
                            bVar.f29680b = bVar.f29695q;
                            bVar.f29691m = false;
                            bVar.f29692n = "all_process";
                            try {
                                bVar.mo20059a(false);
                            } catch (Exception unused2) {
                            }
                            aVar.mo20053a(j);
                        }
                    }
                }
                C12324a.this.f29669a = true;
                synchronized (C12324a.this.f29672d) {
                    linkedList = new LinkedList(C12324a.this.f29672d);
                    C12324a.this.f29672d.clear();
                }
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    C12324a.this.mo20054a((C12447a) it.next());
                }
            }
        });
    }

    /* synthetic */ C12324a(byte b) {
        this();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo20053a(long j) {
        try {
            mo20055b().mo20102a(j);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo20054a(final C12447a aVar) {
        if (aVar != null) {
            if (C12397c.m22288e()) {
                String[] strArr = new String[1];
                String str = "record batteryLog: " + aVar.toString();
            }
            C12560b.C12564a.f30567a.mo20387a(new Runnable() {
                /* class com.bytedance.apm.battery.p761c.C12324a.RunnableC123251 */

                static {
                    Covode.recordClassIndex(14130);
                }

                public final void run() {
                    C12324a aVar = C12324a.this;
                    C12447a aVar2 = aVar;
                    if (C12397c.m22288e()) {
                        String[] strArr = new String[1];
                        String str = "record batteryLog: " + aVar2.toString() + " , mReportedInMainProcess: " + aVar.f29669a;
                    }
                    if (aVar.f29669a || !C12397c.m22285b()) {
                        if (TextUtils.isEmpty(aVar.f29671c)) {
                            aVar.f29671c = String.valueOf(System.currentTimeMillis());
                        }
                        aVar2.f30234k = C12397c.m22285b();
                        aVar2.f30233j = C12397c.m22278a();
                        aVar2.f30235l = aVar.f29671c;
                        if (TextUtils.isEmpty(aVar2.f30229f)) {
                            aVar2.f30229f = aVar.f29670b;
                        }
                        try {
                            if (C12397c.m22288e()) {
                                String[] strArr2 = new String[1];
                                "saveBatteryLog into db: ".concat(String.valueOf(aVar2));
                            }
                            aVar.mo20055b().mo20100a(aVar2);
                        } catch (Exception unused) {
                        }
                    } else {
                        aVar2.f30229f = aVar.f29670b;
                        synchronized (aVar.f29672d) {
                            if (aVar.f29672d.size() > 100) {
                                aVar.f29672d.poll();
                            }
                            aVar.f29672d.add(aVar2);
                        }
                    }
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final List<C12447a> mo20051a(boolean z, long j) {
        try {
            return mo20055b().mo20101a(z, j);
        } catch (Exception unused) {
            return Collections.emptyList();
        }
    }

    /* renamed from: a */
    static boolean m22103a(C12328b bVar, List<C12447a> list) {
        Map<String, AbstractC12343g> map = C12311a.C12312a.f29626a.f29621a;
        StringBuilder sb = new StringBuilder();
        String str = null;
        for (C12447a aVar : list) {
            if (str == null || !str.equals(aVar.f30235l)) {
                str = aVar.f30235l;
                sb.append(str);
            }
            if (!"ground_record".equals(aVar.f30227d)) {
                AbstractC12343g gVar = map.get(aVar.f30227d);
                if (gVar != null) {
                    gVar.mo20083a(bVar, aVar);
                }
            } else if (aVar.f30225b) {
                bVar.f29679a += aVar.f30230g;
            } else {
                bVar.f29680b += aVar.f30230g;
            }
        }
        C12447a aVar2 = list.get(0);
        bVar.f29691m = aVar2.f30234k;
        if (!bVar.f29691m || (bVar.mo20060b() && bVar.mo20061c())) {
            bVar.f29692n = aVar2.f30233j;
            bVar.f29693o = sb.toString();
            return bVar.mo20059a(true);
        }
        bVar.mo20058a();
        if (C12397c.m22288e()) {
            new String[]{"main process front or back duration is not valid, stop report "};
        }
        return false;
    }
}
