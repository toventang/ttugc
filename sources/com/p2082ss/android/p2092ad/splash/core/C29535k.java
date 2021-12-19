package com.p2082ss.android.p2092ad.splash.core;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.p2092ad.splash.core.p2100e.C29455b;
import com.p2082ss.android.p2092ad.splash.core.p2100e.C29464h;
import com.p2082ss.android.p2092ad.splash.core.p2100e.C29477s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.ad.splash.core.k */
public final class C29535k {

    /* renamed from: m */
    private static volatile C29535k f70367m;

    /* renamed from: a */
    public volatile List<C29455b> f70368a;

    /* renamed from: b */
    public volatile List<C29455b> f70369b;

    /* renamed from: c */
    public volatile C29464h f70370c;

    /* renamed from: d */
    public long f70371d = 1800000;

    /* renamed from: e */
    public long f70372e = 300000;

    /* renamed from: f */
    public volatile long f70373f = -1;

    /* renamed from: g */
    public volatile long f70374g = -1;

    /* renamed from: h */
    public boolean f70375h;

    /* renamed from: i */
    public long f70376i;

    /* renamed from: j */
    public int f70377j;

    /* renamed from: k */
    public volatile C29477s f70378k;

    /* renamed from: l */
    public String f70379l = "{}";

    /* renamed from: n */
    private List<String> f70380n = new ArrayList();

    static {
        Covode.recordClassIndex(35929);
    }

    /* renamed from: c */
    public final void mo51650c() {
        this.f70380n.clear();
    }

    private C29535k() {
    }

    /* renamed from: a */
    public static C29535k m59196a() {
        MethodCollector.m26663i(12607);
        if (f70367m == null) {
            synchronized (C29535k.class) {
                try {
                    if (f70367m == null) {
                        f70367m = new C29535k();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(12607);
                    throw th;
                }
            }
        }
        C29535k kVar = f70367m;
        MethodCollector.m26664o(12607);
        return kVar;
    }

    /* renamed from: b */
    public final List<String> mo51648b() {
        if (this.f70368a == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        for (C29455b bVar : new ArrayList(this.f70368a)) {
            if (bVar != null) {
                arrayList.add(String.valueOf(bVar.f70026d));
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public final String mo51651d() {
        StringBuilder sb = new StringBuilder();
        for (String str : this.f70380n) {
            sb.append(str);
            sb.append(",");
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo51646a(long j) {
        if (j > 0) {
            this.f70373f = j;
        }
    }

    /* renamed from: b */
    public final void mo51649b(long j) {
        if (j > 0) {
            this.f70374g = j;
        }
    }

    /* renamed from: a */
    public static void m59197a(String str, String str2) {
        C29537m a = C29537m.m59206a();
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
            a.f70382a.put(str2, str);
        }
    }

    /* renamed from: a */
    public final void mo51647a(long j, int i) {
        if (C29495h.m59095a().f70671s) {
            this.f70380n.add(j + ":" + i);
        }
    }
}
