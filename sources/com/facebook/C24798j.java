package com.facebook;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.facebook.internal.C24759o;
import com.facebook.internal.p1894a.C24686d;
import com.facebook.internal.p1894a.p1897c.C24681a;
import java.util.Random;

/* renamed from: com.facebook.j */
public class C24798j extends RuntimeException {
    static final long serialVersionUID = 1;

    static {
        Covode.recordClassIndex(28951);
    }

    public C24798j() {
    }

    public String toString() {
        return getMessage();
    }

    public C24798j(Throwable th) {
        super(th);
    }

    public C24798j(final String str) {
        super(str);
        Random random = new Random();
        if (str != null && C24872m.m47685a() && random.nextInt(100) > 50) {
            C24759o.m47407a(C24759o.EnumC24763b.ErrorReport, new C24759o.AbstractC24762a() {
                /* class com.facebook.C24798j.C247991 */

                static {
                    Covode.recordClassIndex(28952);
                }

                @Override // com.facebook.internal.C24759o.AbstractC24762a
                /* renamed from: a */
                public final void mo39416a(boolean z) {
                    if (z) {
                        try {
                            C24681a aVar = new C24681a(str);
                            if (aVar.mo40508a()) {
                                C24686d.m47219a(aVar.f58612a, aVar.toString());
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            });
        }
    }

    public C24798j(String str, Throwable th) {
        super(str, th);
    }

    public C24798j(String str, Object... objArr) {
        this(C1764a.m5928a(str, objArr));
    }
}
