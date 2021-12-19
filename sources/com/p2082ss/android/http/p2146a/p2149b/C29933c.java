package com.p2082ss.android.http.p2146a.p2149b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.http.p2146a.AbstractC29930b;
import com.p2082ss.android.http.p2146a.AbstractC29938c;
import com.p2082ss.android.http.p2146a.p2150c.C29939a;
import com.p2082ss.android.http.p2146a.p2151d.C29942b;
import java.util.ArrayList;

/* renamed from: com.ss.android.http.a.b.c */
public final class C29933c implements AbstractC29936f {

    /* renamed from: a */
    public static final C29933c f71417a = new C29933c();

    /* renamed from: b */
    private static final char[] f71418b = {';', ','};

    static {
        Covode.recordClassIndex(36345);
    }

    /* renamed from: a */
    private static AbstractC29938c m60321a(String str, String str2) {
        return new C29934d(str, str2);
    }

    /* renamed from: c */
    private static AbstractC29938c m60324c(C29942b bVar, C29937g gVar) {
        return m60320a(bVar, gVar, f71418b);
    }

    /* renamed from: a */
    private static boolean m60322a(char c, char[] cArr) {
        if (cArr != null) {
            for (char c2 : cArr) {
                if (c == c2) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    private AbstractC29938c[] m60323b(C29942b bVar, C29937g gVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("Char array buffer may not be null");
        } else if (gVar != null) {
            int i = gVar.f71424c;
            int i2 = gVar.f71423b;
            while (i < i2 && C29939a.m60336a(bVar.f71427a[i])) {
                i++;
            }
            gVar.mo52264a(i);
            if (gVar.mo52265a()) {
                return new AbstractC29938c[0];
            }
            ArrayList arrayList = new ArrayList();
            while (!gVar.mo52265a()) {
                arrayList.add(m60324c(bVar, gVar));
                if (bVar.f71427a[gVar.f71424c - 1] == ',') {
                    break;
                }
            }
            return (AbstractC29938c[]) arrayList.toArray(new AbstractC29938c[arrayList.size()]);
        } else {
            throw new IllegalArgumentException("Parser cursor may not be null");
        }
    }

    @Override // com.p2082ss.android.http.p2146a.p2149b.AbstractC29936f
    /* renamed from: a */
    public final AbstractC29930b[] mo52253a(C29942b bVar, C29937g gVar) {
        ArrayList arrayList = new ArrayList();
        while (!gVar.mo52265a()) {
            AbstractC29938c c = m60324c(bVar, gVar);
            AbstractC29938c[] cVarArr = null;
            if (!gVar.mo52265a()) {
                if (bVar.f71427a[gVar.f71424c - 1] != ',') {
                    cVarArr = m60323b(bVar, gVar);
                }
            }
            C29932b bVar2 = new C29932b(c.mo52254a(), c.mo52255b(), cVarArr);
            if (bVar2.mo52244a().length() != 0 || bVar2.mo52245b() != null) {
                arrayList.add(bVar2);
            }
        }
        return (AbstractC29930b[]) arrayList.toArray(new AbstractC29930b[arrayList.size()]);
    }

    /* renamed from: a */
    private static AbstractC29938c m60320a(C29942b bVar, C29937g gVar, char[] cArr) {
        boolean z;
        boolean z2;
        String b;
        char c;
        if (bVar == null) {
            throw new IllegalArgumentException("Char array buffer may not be null");
        } else if (gVar != null) {
            int i = gVar.f71424c;
            int i2 = gVar.f71424c;
            int i3 = gVar.f71423b;
            while (true) {
                z = true;
                if (i >= i3 || (c = bVar.f71427a[i]) == '=') {
                    z2 = false;
                } else if (m60322a(c, cArr)) {
                    z2 = true;
                    break;
                } else {
                    i++;
                }
            }
            z2 = false;
            if (i == i3) {
                b = bVar.mo52271b(i2, i3);
            } else {
                b = bVar.mo52271b(i2, i);
                i++;
                if (!z2) {
                    int i4 = i;
                    boolean z3 = false;
                    boolean z4 = false;
                    while (true) {
                        if (i4 >= i3) {
                            z = false;
                            break;
                        }
                        char c2 = bVar.f71427a[i4];
                        if (c2 == '\"' && !z3) {
                            z4 = !z4;
                        }
                        if (!z4) {
                            if (!z3 && m60322a(c2, cArr)) {
                                break;
                            }
                            z3 = false;
                        } else {
                            if (!z3 && z4 && c2 == '\\') {
                                z3 = true;
                            }
                            z3 = false;
                        }
                        i4++;
                    }
                    while (i < i4 && C29939a.m60336a(bVar.f71427a[i])) {
                        i++;
                    }
                    int i5 = i4;
                    while (i5 > i) {
                        if (!C29939a.m60336a(bVar.f71427a[i5 - 1])) {
                            break;
                        }
                        i5--;
                    }
                    if (i5 - i >= 2 && bVar.f71427a[i] == '\"') {
                        if (bVar.f71427a[i5 - 1] == '\"') {
                            i++;
                            i5--;
                        }
                    }
                    String a = bVar.mo52267a(i, i5);
                    if (z) {
                        i4++;
                    }
                    gVar.mo52264a(i4);
                    return m60321a(b, a);
                }
            }
            gVar.mo52264a(i);
            return m60321a(b, (String) null);
        } else {
            throw new IllegalArgumentException("Parser cursor may not be null");
        }
    }
}
