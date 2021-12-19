package com.bytedance.common.wschannel.channel.p916a.p917a;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.wschannel.channel.p916a.p917a.p918a.AbstractC13675b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.List;
import okhttp3.C90029ac;

/* renamed from: com.bytedance.common.wschannel.channel.a.a.c */
final class C13710c {

    /* renamed from: a */
    private final List<String> f33330a;

    /* renamed from: b */
    private AbstractC13675b f33331b;

    /* renamed from: c */
    private int f33332c;

    /* renamed from: d */
    private String f33333d;

    static {
        Covode.recordClassIndex(15744);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo22065a() {
        MethodCollector.m26663i(10767);
        this.f33331b.mo21992c();
        this.f33333d = null;
        this.f33332c = 0;
        MethodCollector.m26664o(10767);
    }

    /* renamed from: c */
    private synchronized String m24703c() {
        MethodCollector.m26663i(10625);
        int i = this.f33332c + 1;
        this.f33332c = i;
        if (this.f33330a.size() > i) {
            String str = this.f33330a.get(i);
            this.f33333d = str;
            MethodCollector.m26664o(10625);
            return str;
        }
        MethodCollector.m26664o(10625);
        return "";
    }

    /* renamed from: b */
    public final synchronized String mo22066b() {
        String str;
        int i;
        MethodCollector.m26663i(10919);
        if (C13627m.m24498a(this.f33333d) && this.f33330a.size() > (i = this.f33332c)) {
            this.f33333d = this.f33330a.get(i);
        }
        str = this.f33333d;
        MethodCollector.m26664o(10919);
        return str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized Pair<String, Long> mo22064a(C90029ac acVar) {
        Pair<String, Long> pair;
        MethodCollector.m26663i(10624);
        String b = mo22066b();
        long a = this.f33331b.mo21990a(acVar);
        if (a == -1) {
            this.f33331b.mo21992c();
            b = m24703c();
            if (!TextUtils.isEmpty(b)) {
                a = this.f33331b.mo21991b();
            }
        }
        pair = new Pair<>(b, Long.valueOf(a));
        MethodCollector.m26664o(10624);
        return pair;
    }

    C13710c(List<String> list, AbstractC13675b bVar) {
        ArrayList arrayList = new ArrayList();
        this.f33330a = arrayList;
        if (list != null) {
            arrayList.addAll(list);
        }
        this.f33331b = bVar;
        mo22065a();
    }
}
