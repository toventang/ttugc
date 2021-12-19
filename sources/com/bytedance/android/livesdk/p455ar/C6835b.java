package com.bytedance.android.livesdk.p455ar;

import android.util.Pair;
import com.bytedance.android.live.network.AbstractC5804d;
import com.bytedance.android.livesdk.livesetting.message.LiveUplinkStrategySetting;
import com.bytedance.android.livesdk.p455ar.C6851i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.retrofit2.C22092q;
import com.p2082ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p2082ss.ugc.live.sdk.message.interfaces.IMessageManagerV2;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.android.livesdk.ar.b */
public class C6835b {

    /* renamed from: e */
    private static C6835b f17125e;

    /* renamed from: a */
    final ConcurrentHashMap<Class<?>, Pair<IMessageManagerV2, Object>> f17126a = new ConcurrentHashMap<>();

    /* renamed from: b */
    public IMessageManager f17127b;

    /* renamed from: c */
    public final AbstractC5804d f17128c = new AbstractC5804d() {
        /* class com.bytedance.android.livesdk.p455ar.C6835b.C68361 */

        static {
            Covode.recordClassIndex(7574);
        }

        @Override // com.bytedance.android.live.network.AbstractC5804d
        /* renamed from: a */
        public final <T> boolean mo11571a(Class<T> cls) {
            return LiveUplinkStrategySetting.INSTANCE.getUplinkApiAllowedList().containsKey(C6835b.m14618a(cls));
        }

        @Override // com.bytedance.android.live.network.AbstractC5804d
        /* renamed from: a */
        public final <T> T mo11570a(Class<T> cls, T t) {
            C6835b bVar = C6835b.this;
            if (!(bVar.f17127b instanceof IMessageManagerV2)) {
                return t;
            }
            IMessageManagerV2 iMessageManagerV2 = (IMessageManagerV2) bVar.f17127b;
            if (!LiveUplinkStrategySetting.INSTANCE.supportUplink() || !iMessageManagerV2.isWsConnected()) {
                return t;
            }
            Pair<IMessageManagerV2, Object> pair = bVar.f17126a.get(cls);
            if (pair == null || pair.first != iMessageManagerV2) {
                if (!cls.isInterface()) {
                    throw new IllegalArgumentException("API declarations must be interfaces.");
                } else if (cls.getInterfaces().length <= 0) {
                    pair = new Pair<>(iMessageManagerV2, Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C6837c(bVar, iMessageManagerV2, cls, t)));
                    bVar.f17126a.put(cls, pair);
                } else {
                    throw new IllegalArgumentException("API interfaces must not extend other interfaces.");
                }
            }
            return pair.second == null ? t : (T) pair.second;
        }
    };

    /* renamed from: d */
    private final ConcurrentHashMap<Method, Pair<IMessageManagerV2, C6851i<?>>> f17129d = new ConcurrentHashMap<>();

    static {
        Covode.recordClassIndex(7573);
    }

    private C6835b() {
    }

    /* renamed from: a */
    public static C6835b m14616a() {
        MethodCollector.m26663i(10220);
        if (f17125e == null) {
            synchronized (C6835b.class) {
                try {
                    if (f17125e == null) {
                        f17125e = new C6835b();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(10220);
                    throw th;
                }
            }
        }
        C6835b bVar = f17125e;
        MethodCollector.m26664o(10220);
        return bVar;
    }

    /* renamed from: a */
    public static <T> String m14618a(Class<T> cls) {
        if (cls == null) {
            return "";
        }
        return cls.getSimpleName();
    }

    /* renamed from: a */
    private C6851i<?> m14617a(IMessageManagerV2 iMessageManagerV2, C22092q qVar, Method method) {
        Pair<IMessageManagerV2, C6851i<?>> pair;
        MethodCollector.m26663i(10372);
        synchronized (this.f17129d) {
            try {
                pair = this.f17129d.get(method);
                if (pair == null || pair.first != iMessageManagerV2) {
                    pair = new Pair<>(iMessageManagerV2, new C6851i.C6852a(qVar, method).mo13100a());
                    this.f17129d.put(method, pair);
                }
            } catch (Throwable th) {
                MethodCollector.m26664o(10372);
                throw th;
            }
        }
        C6851i<?> iVar = (C6851i) pair.second;
        MethodCollector.m26664o(10372);
        return iVar;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01a6 A[ADDED_TO_REGION] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object mo13088a(com.p2082ss.ugc.live.sdk.message.interfaces.IMessageManagerV2 r14, java.lang.Class r15, java.lang.Object r16, java.lang.Object r17, java.lang.reflect.Method r18, java.lang.Object[] r19) {
        /*
        // Method dump skipped, instructions count: 532
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.p455ar.C6835b.mo13088a(com.ss.ugc.live.sdk.message.interfaces.IMessageManagerV2, java.lang.Class, java.lang.Object, java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
    }
}
