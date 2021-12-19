package com.bytedance.ies.bullet.service.base.p1163a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.p1163a.AbstractC16576j;
import com.bytedance.ies.bullet.service.base.p1164b.C16622e;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.service.base.a.o */
public interface AbstractC16584o extends AbstractC16576j {
    static {
        Covode.recordClassIndex(19021);
    }

    /* renamed from: a_ */
    <T> T mo25789a_(Class<T> cls);

    /* renamed from: b_ */
    <T extends AbstractC16568c> T mo25790b_(Class<T> cls);

    /* renamed from: f */
    String mo25791f();

    /* renamed from: g */
    AbstractC16582m mo25792g();

    /* renamed from: com.bytedance.ies.bullet.service.base.a.o$a */
    public static final class C16585a {
        static {
            Covode.recordClassIndex(19022);
        }

        /* renamed from: a */
        public static void m30799a(AbstractC16584o oVar, String str, EnumC16586p pVar, String str2) {
            C89219l.m154719c(str, "");
            C89219l.m154719c(pVar, "");
            C89219l.m154719c(str2, "");
            AbstractC16576j.C16578b.m30777a(oVar, str, pVar, str2);
        }

        /* renamed from: a */
        public static void m30800a(AbstractC16584o oVar, Throwable th, String str) {
            C89219l.m154719c(th, "");
            C89219l.m154719c(str, "");
            AbstractC16576j.C16578b.m30780a(oVar, th, str);
        }

        /* renamed from: b */
        public static <T> T m30801b(AbstractC16584o oVar, Class<T> cls) {
            C89219l.m154719c(cls, "");
            return (T) oVar.mo25792g().mo26325a(cls);
        }

        /* renamed from: a */
        public static <T extends AbstractC16568c> T m30798a(AbstractC16584o oVar, Class<T> cls) {
            C89219l.m154719c(cls, "");
            return (T) C16622e.C16623a.m30858a().mo26347a(oVar.mo25791f(), cls);
        }
    }
}
