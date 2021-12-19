package com.bytedance.ies.bullet.service.base.p1163a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.p1164b.C16624f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.service.base.a.l */
public interface AbstractC16580l extends AbstractC16573g {
    static {
        Covode.recordClassIndex(19017);
    }

    /* renamed from: a */
    <T extends AbstractC16568c> T mo26346a(Class<T> cls);

    /* renamed from: a */
    <T extends AbstractC16568c> T mo26347a(String str, Class<T> cls);

    /* renamed from: a */
    <T extends AbstractC16568c> AbstractC16580l mo26348a(Class<T> cls, T t);

    /* renamed from: a */
    AbstractC16580l mo26349a(String str, C16624f fVar);

    /* renamed from: a */
    <T extends AbstractC16568c> AbstractC16580l mo26350a(String str, Class<T> cls, T t);

    /* renamed from: com.bytedance.ies.bullet.service.base.a.l$a */
    public static final class C16581a {
        static {
            Covode.recordClassIndex(19018);
        }

        /* renamed from: a */
        public static <T extends AbstractC16568c> T m30786a(AbstractC16580l lVar, Class<T> cls) {
            C89219l.m154719c(cls, "");
            return (T) lVar.mo26347a("default_bid", cls);
        }

        /* renamed from: a */
        public static <T extends AbstractC16568c> AbstractC16580l m30787a(AbstractC16580l lVar, Class<T> cls, T t) {
            C89219l.m154719c(cls, "");
            C89219l.m154719c(t, "");
            return lVar.mo26350a("default_bid", cls, t);
        }
    }
}
