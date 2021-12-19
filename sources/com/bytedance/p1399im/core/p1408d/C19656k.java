package com.bytedance.p1399im.core.p1408d;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.utils.C20014q;
import com.bytedance.p1399im.core.p1404a.C19483d;
import com.bytedance.p1399im.core.p1404a.C19489e;
import java.util.List;

/* renamed from: com.bytedance.im.core.d.k */
public final class C19656k extends C19534ae implements AbstractC19669r {

    /* renamed from: a */
    public String f46702a;

    /* renamed from: b */
    public AbstractC19669r f46703b;

    static {
        Covode.recordClassIndex(22500);
    }

    @Override // com.bytedance.p1399im.core.p1408d.AbstractC19669r
    /* renamed from: d */
    public final int mo28016d() {
        AbstractC19669r rVar = this.f46703b;
        if (rVar != null) {
            return rVar.mo28016d();
        }
        return 0;
    }

    @Override // com.bytedance.p1399im.core.p1408d.C19534ae
    /* renamed from: a */
    public final void mo31194a() {
        this.f46703b = null;
        C20014q a = C20014q.m37816a();
        String str = this.f46702a;
        List<AbstractC19669r> list = a.f47558d.get(str);
        if (list != null) {
            list.remove(this);
            a.f47558d.put(str, list);
        }
        super.mo31194a();
    }

    public C19656k(String str) {
        this.f46702a = str;
    }

    @Override // com.bytedance.p1399im.core.p1408d.AbstractC19669r
    /* renamed from: a */
    public final void mo28001a(C19638h hVar) {
        AbstractC19669r rVar = this.f46703b;
        if (rVar != null) {
            rVar.mo28001a(hVar);
        }
    }

    @Override // com.bytedance.p1399im.core.p1408d.AbstractC19669r
    /* renamed from: b */
    public final void mo28010b(C19638h hVar) {
        AbstractC19669r rVar = this.f46703b;
        if (rVar != null) {
            rVar.mo28010b(hVar);
        }
    }

    @Override // com.bytedance.p1399im.core.p1408d.AbstractC19669r
    /* renamed from: c */
    public final void mo28014c(C19638h hVar) {
        AbstractC19669r rVar = this.f46703b;
        if (rVar != null) {
            rVar.mo28014c(hVar);
        }
    }

    @Override // com.bytedance.p1399im.core.p1408d.AbstractC19669r
    /* renamed from: d */
    public final void mo28017d(C19638h hVar) {
        AbstractC19669r rVar = this.f46703b;
        if (rVar != null) {
            rVar.mo28017d(hVar);
        }
    }

    @Override // com.bytedance.p1399im.core.p1408d.AbstractC19669r
    /* renamed from: b */
    public final void mo28012b(List<C19537ah> list) {
        AbstractC19669r rVar = this.f46703b;
        if (rVar != null) {
            rVar.mo28012b(list);
        }
    }

    @Override // com.bytedance.p1399im.core.p1408d.AbstractC19669r
    /* renamed from: c */
    public final void mo28015c(List<C19537ah> list) {
        AbstractC19669r rVar = this.f46703b;
        if (rVar != null) {
            rVar.mo28015c(list);
        }
    }

    /* renamed from: a */
    public static long m36718a(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        String[] split = str.split(":");
        if (split.length != 4) {
            return -1;
        }
        long longValue = Long.valueOf(split[2]).longValue();
        long longValue2 = Long.valueOf(split[3]).longValue();
        long a = C19483d.m36365a().f46157b.mo27953a();
        if (a == longValue) {
            return longValue2;
        }
        if (a == longValue2) {
            return longValue;
        }
        return -1;
    }

    /* renamed from: a */
    public static String m36719a(long j) {
        StringBuilder sb = new StringBuilder();
        sb.append(Math.max(0, 0)).append(":").append(C19489e.AbstractC19490a.f46180a).append(":");
        long a = C19483d.m36365a().f46157b.mo27953a();
        if (a < j) {
            sb.append(a).append(":").append(j);
        } else {
            sb.append(j).append(":").append(a);
        }
        return sb.toString();
    }

    @Override // com.bytedance.p1399im.core.p1408d.AbstractC19669r
    /* renamed from: a */
    public final void mo28006a(List<C19537ah> list) {
        AbstractC19669r rVar = this.f46703b;
        if (rVar != null) {
            rVar.mo28006a(list);
        }
    }

    @Override // com.bytedance.p1399im.core.p1408d.AbstractC19669r
    /* renamed from: a */
    public final void mo28002a(C19638h hVar, int i) {
        AbstractC19669r rVar = this.f46703b;
        if (rVar != null) {
            rVar.mo28002a(hVar, i);
        }
    }

    @Override // com.bytedance.p1399im.core.p1408d.AbstractC19669r
    /* renamed from: a */
    public final void mo28003a(String str, int i) {
        AbstractC19669r rVar = this.f46703b;
        if (rVar != null) {
            rVar.mo28003a(str, i);
        }
    }

    @Override // com.bytedance.p1399im.core.p1408d.AbstractC19669r
    /* renamed from: a */
    public final void mo28005a(String str, List<C19537ah> list) {
        AbstractC19669r rVar = this.f46703b;
        if (rVar != null) {
            rVar.mo28005a(str, list);
        }
    }

    @Override // com.bytedance.p1399im.core.p1408d.AbstractC19669r
    /* renamed from: a */
    public final void mo28004a(String str, int i, List<Long> list) {
        AbstractC19669r rVar = this.f46703b;
        if (rVar != null) {
            rVar.mo28004a(str, i, list);
        }
    }
}
