package com.p2082ss.videoarch.p4474a.p4477c;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.videoarch.a.c.a */
public final class C87130a {

    /* renamed from: a */
    public C87131b f196885a;

    /* renamed from: b */
    public int f196886b;

    /* renamed from: c */
    private C87132c[] f196887c;

    /* renamed from: d */
    private String[] f196888d;

    /* renamed from: e */
    private int f196889e;

    static {
        Covode.recordClassIndex(102931);
    }

    /* renamed from: a */
    public final boolean mo140896a(String str, String str2, long j) {
        C87131b bVar = this.f196885a;
        if (bVar == null) {
            return false;
        }
        return bVar.mo140919a(str, str2, j);
    }

    /* renamed from: b */
    public final String mo140897b() {
        C87131b bVar;
        if (this.f196886b != 2 || (bVar = this.f196885a) == null) {
            return null;
        }
        return bVar.mo140920b();
    }

    /* renamed from: c */
    public final String mo140902c() {
        C87131b bVar;
        if (this.f196886b != 2 || (bVar = this.f196885a) == null) {
            return null;
        }
        return bVar.mo140925c();
    }

    /* renamed from: d */
    public final Map<String, String> mo140906d() {
        C87131b bVar;
        if (this.f196886b != 2 || (bVar = this.f196885a) == null) {
            return null;
        }
        return bVar.mo140929d();
    }

    /* renamed from: f */
    public final String mo140910f() {
        this.f196889e++;
        return m150945h();
    }

    /* renamed from: g */
    public final void mo140912g() {
        this.f196889e = 0;
        this.f196888d = null;
        this.f196885a = null;
        this.f196887c = null;
    }

    /* renamed from: h */
    private String m150945h() {
        String[] strArr = this.f196888d;
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        int i = this.f196889e;
        if (i >= strArr.length) {
            i = 0;
        }
        return strArr[i];
    }

    /* renamed from: a */
    public final String mo140889a() {
        C87131b bVar;
        if (this.f196886b == 2 && (bVar = this.f196885a) != null) {
            return bVar.f196891b;
        }
        return null;
    }

    /* renamed from: e */
    public final C87132c mo140908e() {
        C87132c[] cVarArr = this.f196887c;
        if (!(cVarArr == null || cVarArr.length == 0)) {
            for (C87132c cVar : cVarArr) {
                if (cVar.f196913a != null) {
                    return cVar;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public final String mo140890a(String str) {
        if (this.f196886b != 2 || this.f196885a == null || str == null) {
            return null;
        }
        return C87131b.m150971a(str);
    }

    /* renamed from: c */
    public final boolean mo140904c(String str) {
        C87131b bVar = this.f196885a;
        if (bVar == null) {
            return false;
        }
        return bVar.mo140927c(str);
    }

    /* renamed from: d */
    public final C87132c mo140905d(String str) {
        C87132c[] cVarArr = this.f196887c;
        if (!(cVarArr == null || cVarArr.length == 0)) {
            for (C87132c cVar : cVarArr) {
                if (str.equals(cVar.mo140938a()) && cVar.f196913a != null) {
                    return cVar;
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public final void mo140900b(String str) {
        C87131b bVar;
        if (this.f196886b == 2 && (bVar = this.f196885a) != null) {
            bVar.mo140923b(str);
        }
    }

    /* renamed from: a */
    public final void mo140892a(C87131b bVar) {
        this.f196885a = bVar;
        this.f196889e = 0;
        this.f196886b = 2;
    }

    /* renamed from: a */
    public final void mo140893a(C87132c[] cVarArr) {
        this.f196887c = cVarArr;
        this.f196889e = 0;
        this.f196886b = 1;
        ArrayList arrayList = new ArrayList();
        for (C87132c cVar : cVarArr) {
            if (cVar.f196913a != null) {
                arrayList.add(cVar.f196913a);
            }
            if (cVar.f196914b != null) {
                arrayList.add(cVar.f196914b);
            }
        }
        String[] strArr = new String[arrayList.size()];
        this.f196888d = strArr;
        arrayList.toArray(strArr);
    }

    /* renamed from: a */
    public final boolean mo140894a(int i) {
        C87131b bVar = this.f196885a;
        if (bVar == null) {
            return false;
        }
        return bVar.mo140917a(i);
    }

    /* renamed from: d */
    public final void mo140907d(String str, String str2) {
        C87131b bVar = this.f196885a;
        if (bVar != null) {
            bVar.mo140915a(str, str2);
        }
    }

    /* renamed from: a */
    public final int mo140888a(String str, String str2) {
        C87131b bVar;
        if (this.f196886b != 2 || (bVar = this.f196885a) == null) {
            return -1;
        }
        return bVar.mo140924c(str, str2);
    }

    /* renamed from: e */
    public final JSONObject mo140909e(String str, String str2) {
        C87131b bVar;
        if (this.f196886b != 2 || (bVar = this.f196885a) == null) {
            return null;
        }
        return bVar.mo140935i(str, str2);
    }

    /* renamed from: b */
    public final String mo140898b(String str, String str2) {
        C87131b bVar;
        if (this.f196886b != 2 || (bVar = this.f196885a) == null) {
            return null;
        }
        return bVar.mo140937k(str, str2);
    }

    /* renamed from: c */
    public final long mo140901c(String str, String str2) {
        C87131b bVar;
        if (this.f196886b != 2 || (bVar = this.f196885a) == null) {
            return 0;
        }
        return bVar.mo140934h(str, str2);
    }

    /* renamed from: f */
    public final JSONObject mo140911f(String str, String str2) {
        C87131b bVar;
        if (this.f196886b != 2 || (bVar = this.f196885a) == null) {
            return null;
        }
        return bVar.mo140936j(str, str2);
    }

    /* renamed from: c */
    public final void mo140903c(String str, String str2, String str3) {
        C87131b bVar = this.f196885a;
        if (bVar != null) {
            bVar.mo140916a(str, str2, str3);
        }
    }

    /* renamed from: b */
    public final String mo140899b(String str, String str2, String str3) {
        C87131b bVar = this.f196885a;
        if (bVar == null) {
            return null;
        }
        return bVar.mo140926c(str, str2, str3);
    }

    /* renamed from: a */
    public final String mo140891a(String str, String str2, String str3) {
        C87131b bVar;
        if (this.f196886b != 2 || (bVar = this.f196885a) == null) {
            return null;
        }
        return bVar.mo140922b(str, str2, str3);
    }

    /* renamed from: a */
    public final boolean mo140895a(int i, int i2, float f) {
        C87131b bVar;
        if (this.f196886b != 2 || (bVar = this.f196885a) == null) {
            return false;
        }
        return bVar.mo140918a(i, i2, f);
    }
}
