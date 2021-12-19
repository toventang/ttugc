package com.bytedance.ies.bullet.service.base.p1163a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.AbstractC16652m;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.service.base.a.j */
public interface AbstractC16576j {

    /* renamed from: G */
    public static final C16577a f39704G = C16577a.f39705a;

    static {
        Covode.recordClassIndex(19013);
    }

    C16587q getLoggerWrapper();

    void printLog(String str, EnumC16586p pVar, String str2);

    void printReject(Throwable th, String str);

    /* renamed from: com.bytedance.ies.bullet.service.base.a.j$a */
    public static final class C16577a {

        /* renamed from: a */
        static final /* synthetic */ C16577a f39705a = new C16577a();

        private C16577a() {
        }

        static {
            Covode.recordClassIndex(19014);
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.base.a.j$b */
    public static final class C16578b {
        static {
            Covode.recordClassIndex(19015);
        }

        /* renamed from: a */
        public static void m30780a(AbstractC16576j jVar, Throwable th, String str) {
            int i;
            C89219l.m154719c(th, "");
            C89219l.m154719c(str, "");
            try {
                AbstractC16652m mVar = jVar.getLoggerWrapper().f39713a;
                if (mVar == null) {
                    th.getMessage();
                    i = 0;
                } else {
                    mVar.mo25849a(th, str);
                    i = C89391z.f203057a;
                }
                C89379q.m157068constructorimpl(i);
            } catch (Throwable th2) {
                C89379q.m157068constructorimpl(C89382r.m154941a(th2));
            }
        }

        /* renamed from: a */
        public static void m30777a(AbstractC16576j jVar, String str, EnumC16586p pVar, String str2) {
            boolean z;
            int i;
            C89219l.m154719c(str, "");
            C89219l.m154719c(pVar, "");
            C89219l.m154719c(str2, "");
            try {
                AbstractC16652m mVar = jVar.getLoggerWrapper().f39713a;
                String str3 = jVar.getLoggerWrapper().f39714b;
                if (str2.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    str = "[" + str2 + "] " + str;
                } else if (str3.length() > 0) {
                    str = "[" + str3 + "] " + str;
                }
                if (mVar == null) {
                    int i2 = C16579k.f39706a[pVar.ordinal()];
                    i = 0;
                } else {
                    mVar.mo25848a(str, pVar);
                    i = C89391z.f203057a;
                }
                C89379q.m157068constructorimpl(i);
            } catch (Throwable th) {
                C89379q.m157068constructorimpl(C89382r.m154941a(th));
            }
        }

        /* renamed from: a */
        public static /* synthetic */ void m30778a(AbstractC16576j jVar, String str, EnumC16586p pVar, String str2, int i) {
            if ((i & 2) != 0) {
                pVar = EnumC16586p.I;
            }
            if ((i & 4) != 0) {
                str2 = "";
            }
            jVar.printLog(str, pVar, str2);
        }
    }
}
