package com.p2082ss.android.common.applog;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.common.utility.C13585b;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.deviceregister.p2134a.C29866a;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.common.applog.e */
public final class C29788e {

    /* renamed from: a */
    public Context f71046a;

    /* renamed from: b */
    C29789a f71047b = new C29789a(this, (byte) 0);

    static {
        Covode.recordClassIndex(36193);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.common.applog.e$a */
    public class C29789a {

        /* renamed from: b */
        private final long[][] f71049b;

        /* renamed from: c */
        private Map<String, C29790a> f71050c;

        static {
            Covode.recordClassIndex(36194);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.common.applog.e$a$a */
        public class C29790a {

            /* renamed from: a */
            int f71051a;

            /* renamed from: b */
            int f71052b;

            /* renamed from: c */
            int f71053c;

            /* renamed from: d */
            long f71054d;

            /* renamed from: e */
            long f71055e;

            static {
                Covode.recordClassIndex(36195);
            }

            C29790a() {
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public final void mo52072a(C29790a aVar) {
                this.f71051a = aVar.f71051a;
                this.f71052b = aVar.f71052b;
                this.f71053c = aVar.f71053c;
                this.f71054d = aVar.f71054d;
                this.f71055e = aVar.f71055e;
            }
        }

        /* renamed from: b */
        public final synchronized boolean mo52071b(String str) {
            MethodCollector.m26663i(7041);
            if (!C13627m.m24498a(str) && this.f71050c.containsKey(str)) {
                C29790a aVar = this.f71050c.get(str);
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - aVar.f71054d >= this.f71049b[aVar.f71051a][0]) {
                    aVar.f71052b = 1;
                    aVar.f71054d = currentTimeMillis;
                } else if (((long) aVar.f71052b) < this.f71049b[aVar.f71051a][2]) {
                    aVar.f71052b++;
                } else {
                    MethodCollector.m26664o(7041);
                    return false;
                }
            }
            MethodCollector.m26664o(7041);
            return true;
        }

        private C29789a() {
            this.f71049b = new long[][]{new long[]{120000, 0, 12}, new long[]{120000, 5, 1}, new long[]{240000, 5, 1}, new long[]{480000, 4, 1}, new long[]{960000, 2, 1}};
            this.f71050c = new HashMap();
        }

        /* renamed from: a */
        public final synchronized void mo52070a(String str) {
            MethodCollector.m26663i(7039);
            if (!C13627m.m24498a(str) && !this.f71050c.containsKey(str)) {
                C29790a aVar = new C29790a();
                SharedPreferences a = C34822d.m71158a(C29788e.this.f71046a, C29866a.f71244a, 0);
                if (System.currentTimeMillis() - a.getLong(str + "_downgrade_time", 0) < 10800000) {
                    aVar.f71051a = a.getInt(str + "_downgrade_index", 0);
                } else {
                    a.edit().remove(str + "_downgrade_time").remove(str + "_downgrade_index").commit();
                }
                this.f71050c.put(str, aVar);
            }
            MethodCollector.m26664o(7039);
        }

        /* synthetic */ C29789a(C29788e eVar, byte b) {
            this();
        }

        /* renamed from: a */
        public final synchronized void mo52068a(int i, String[] strArr) {
            MethodCollector.m26663i(7045);
            String str = strArr[i];
            if (!C13627m.m24498a(str) && this.f71050c.containsKey(str)) {
                C29790a aVar = this.f71050c.get(str);
                long currentTimeMillis = System.currentTimeMillis();
                if (((long) aVar.f71053c) < this.f71049b[aVar.f71051a][1] && currentTimeMillis - aVar.f71055e <= 1800000) {
                    aVar.f71053c++;
                } else if (aVar.f71051a > 0) {
                    aVar.f71051a--;
                    aVar.f71052b = 1;
                    aVar.f71053c = 1;
                    aVar.f71054d = currentTimeMillis;
                    aVar.f71055e = currentTimeMillis;
                    SharedPreferences.Editor edit = C34822d.m71158a(C29788e.this.f71046a, C29866a.f71244a, 0).edit();
                    for (String str2 : strArr) {
                        if (!C13627m.m24498a(str2) && !str2.equals(str) && this.f71050c.containsKey(str2)) {
                            C29790a aVar2 = this.f71050c.get(str2);
                            aVar2.mo52072a(aVar);
                            edit.putLong(str2 + "_downgrade_time", currentTimeMillis);
                            edit.putInt(str2 + "_downgrade_index", aVar2.f71051a);
                        }
                    }
                    edit.putLong(str + "_downgrade_time", currentTimeMillis);
                    edit.putInt(str + "_downgrade_index", aVar.f71051a);
                    edit.commit();
                    MethodCollector.m26664o(7045);
                    return;
                }
            }
            MethodCollector.m26664o(7045);
        }

        /* renamed from: a */
        public final synchronized void mo52069a(int i, String[] strArr, Throwable th) {
            int responseCode;
            MethodCollector.m26663i(7043);
            if ((th instanceof C13585b) && (responseCode = ((C13585b) th).getResponseCode()) >= 500 && responseCode < 600) {
                String str = strArr[i];
                if (!C13627m.m24498a(str) && this.f71050c.containsKey(str)) {
                    C29790a aVar = this.f71050c.get(str);
                    if (aVar.f71051a < this.f71049b.length - 1) {
                        aVar.f71051a++;
                        aVar.f71052b = 1;
                        aVar.f71053c = 0;
                        long currentTimeMillis = System.currentTimeMillis();
                        aVar.f71054d = currentTimeMillis;
                        aVar.f71055e = currentTimeMillis;
                        SharedPreferences.Editor edit = C34822d.m71158a(C29788e.this.f71046a, C29866a.f71244a, 0).edit();
                        for (String str2 : strArr) {
                            if (!C13627m.m24498a(str2) && !str2.equals(str) && this.f71050c.containsKey(str2)) {
                                C29790a aVar2 = this.f71050c.get(str2);
                                aVar2.mo52072a(aVar);
                                edit.putLong(str2 + "_downgrade_time", currentTimeMillis);
                                edit.putInt(str2 + "_downgrade_index", aVar2.f71051a);
                            }
                        }
                        edit.putLong(str + "_downgrade_time", currentTimeMillis);
                        edit.putInt(str + "_downgrade_index", aVar.f71051a);
                        edit.commit();
                        MethodCollector.m26664o(7043);
                        return;
                    }
                    aVar.f71053c = 0;
                }
            }
            MethodCollector.m26664o(7043);
        }
    }

    public C29788e(Context context) {
        this.f71046a = context;
    }
}
