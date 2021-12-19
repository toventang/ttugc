package com.bytedance.android.livesdk.p455ar;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.live.sdk.message.interfaces.IMessageManagerV2;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* renamed from: com.bytedance.android.livesdk.ar.c */
final /* synthetic */ class C6837c implements InvocationHandler {

    /* renamed from: a */
    private final C6835b f17131a;

    /* renamed from: b */
    private final IMessageManagerV2 f17132b;

    /* renamed from: c */
    private final Class f17133c;

    /* renamed from: d */
    private final Object f17134d;

    static {
        Covode.recordClassIndex(7575);
    }

    C6837c(C6835b bVar, IMessageManagerV2 iMessageManagerV2, Class cls, Object obj) {
        this.f17131a = bVar;
        this.f17132b = iMessageManagerV2;
        this.f17133c = cls;
        this.f17134d = obj;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        return this.f17131a.mo13088a(this.f17132b, this.f17133c, this.f17134d, obj, method, objArr);
    }
}
