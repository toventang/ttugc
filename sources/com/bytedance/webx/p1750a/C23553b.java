package com.bytedance.webx.p1750a;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.webx.AbstractC23547a;
import com.bytedance.webx.p1750a.C23549a;
import com.bytedance.webx.p1751b.p1752a.C23556a;
import com.bytedance.webx.p1755d.AbstractC23566b;
import com.bytedance.webx.p1755d.AbstractC23567c;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.webx.a.b */
public final class C23553b {

    /* renamed from: a */
    private AbstractC23566b f55791a;

    /* renamed from: b */
    private boolean f55792b;

    /* renamed from: c */
    private String f55793c;

    /* renamed from: d */
    private Uri f55794d;

    /* renamed from: e */
    private C23549a f55795e;

    /* renamed from: f */
    private C23549a f55796f;

    static {
        Covode.recordClassIndex(27651);
    }

    public C23553b(AbstractC23566b bVar) {
        this.f55791a = bVar;
    }

    /* renamed from: a */
    public final void mo38636a(String str, int i) {
        Boolean bool;
        if (str != null && str.startsWith("http") && !str.equals(this.f55793c)) {
            this.f55793c = str;
            try {
                this.f55794d = Uri.parse(str);
                String a = C23549a.m44295a(this.f55791a.mo38648d().f55884h, this.f55794d);
                if (a == null) {
                    a = this.f55794d.getQueryParameter("bdwk_extension");
                }
                if (i == 0) {
                    List<C23549a.C23550a> a2 = C23549a.m44296a(0, a);
                    if (this.f55795e == null) {
                        this.f55795e = new C23549a();
                    }
                    for (C23549a.C23550a aVar : a2) {
                        this.f55795e.mo38633a(aVar);
                    }
                }
                if (this.f55795e == null) {
                    C23556a.m44304a("AddressProcessor");
                    return;
                }
                List<C23549a.C23550a> a3 = C23549a.m44296a(1, a);
                C23549a aVar2 = this.f55796f;
                if (aVar2 == null) {
                    this.f55796f = new C23549a();
                } else {
                    aVar2.f55783a.clear();
                }
                for (C23549a.C23550a aVar3 : a3) {
                    this.f55796f.mo38633a(aVar3);
                }
                C23549a aVar4 = this.f55796f;
                for (Map.Entry<String, C23549a.C23550a> entry : this.f55795e.f55783a.entrySet()) {
                    if (!aVar4.f55783a.containsKey(entry.getKey())) {
                        aVar4.f55783a.put(entry.getKey(), entry.getValue());
                    }
                }
                C23549a aVar5 = this.f55796f;
                if (aVar5 != null && !aVar5.f55783a.isEmpty()) {
                    Iterator<AbstractC23567c> c = this.f55791a.mo38647c();
                    while (c.hasNext()) {
                        AbstractC23567c next = c.next();
                        if (next instanceof AbstractC23547a) {
                            AbstractC23547a aVar6 = (AbstractC23547a) next;
                            if (aVar6.mo38632c()) {
                                C23549a.C23550a aVar7 = aVar5.f55783a.get(aVar6.f55780g);
                                if (!(aVar7 == null || aVar7.f55785b == null)) {
                                    String str2 = aVar7.f55785b;
                                    str2.hashCode();
                                    if (str2.equals("0")) {
                                        bool = false;
                                    } else if (!str2.equals("1")) {
                                        bool = false;
                                    } else {
                                        bool = true;
                                    }
                                    if (bool != null) {
                                        aVar6.f55781h = bool.booleanValue();
                                        this.f55792b = true;
                                    }
                                }
                                aVar6.f55781h = aVar6.f55782i;
                            }
                        }
                    }
                } else if (this.f55792b) {
                    Iterator<AbstractC23567c> c2 = this.f55791a.mo38647c();
                    while (c2.hasNext()) {
                        AbstractC23567c next2 = c2.next();
                        if (next2 instanceof AbstractC23547a) {
                            AbstractC23547a aVar8 = (AbstractC23547a) next2;
                            if (aVar8.mo38632c()) {
                                aVar8.f55781h = aVar8.f55782i;
                            }
                        }
                    }
                    this.f55792b = false;
                }
            } catch (Exception unused) {
                C23556a.m44304a("AddressProcessor");
            }
        }
    }
}
