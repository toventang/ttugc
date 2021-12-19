package com.p2082ss.android.ugc.aweme.p2426bw.p2428b;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.bw.b.a */
public final class C35324a<M> {

    /* renamed from: a */
    public M f83350a;

    /* renamed from: b */
    public EnumC35325a f83351b;

    /* renamed from: c */
    public Throwable f83352c;

    static {
        Covode.recordClassIndex(42492);
    }

    /* renamed from: a */
    public static <M> C35324a<M> m72278a() {
        C35324a<M> aVar = new C35324a<>();
        aVar.f83351b = EnumC35325a.LOADING;
        return aVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.bw.b.a$a */
    public enum EnumC35325a {
        INIT,
        SUCCESS,
        ERROR,
        LOADING,
        PROGRESS;

        static {
            Covode.recordClassIndex(42493);
        }
    }

    /* renamed from: a */
    public static <M> C35324a<M> m72281a(M m) {
        C35324a<M> aVar = new C35324a<>();
        aVar.f83351b = EnumC35325a.SUCCESS;
        aVar.f83350a = m;
        return aVar;
    }

    /* renamed from: a */
    public static <T extends Throwable, M> C35324a<M> m72282a(T t) {
        C35324a<M> aVar = new C35324a<>();
        aVar.f83351b = EnumC35325a.ERROR;
        aVar.f83352c = t;
        return aVar;
    }

    /* renamed from: a */
    public static <M> C35324a<M> m72279a(EnumC35325a aVar, M m) {
        C35324a<M> aVar2 = new C35324a<>();
        aVar2.f83351b = aVar;
        aVar2.f83350a = m;
        return aVar2;
    }

    /* renamed from: a */
    public static <T extends Throwable, M> C35324a<M> m72280a(EnumC35325a aVar, T t) {
        C35324a<M> aVar2 = new C35324a<>();
        aVar2.f83351b = aVar;
        aVar2.f83352c = t;
        return aVar2;
    }
}
