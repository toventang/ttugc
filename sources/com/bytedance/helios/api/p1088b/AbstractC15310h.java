package com.bytedance.helios.api.p1088b;

import com.bytedance.covode.number.Covode;
import p4600h.C89388w;

/* renamed from: com.bytedance.helios.api.b.h */
public abstract class AbstractC15310h implements AbstractC15305c {

    /* renamed from: a */
    public static AbstractC15310h f37335a;

    /* renamed from: b */
    public static final C15311a f37336b = new C15311a((byte) 0);

    static {
        Covode.recordClassIndex(17540);
    }

    /* renamed from: com.bytedance.helios.api.b.h$a */
    public static final class C15311a {
        static {
            Covode.recordClassIndex(17541);
        }

        private C15311a() {
        }

        /* renamed from: a */
        public static AbstractC15310h m28212a() {
            AbstractC15310h hVar;
            try {
                Object newInstance = Class.forName("com.bytedance.helios.tools.skyeye.SkyEyeConsumer").getConstructor(new Class[0]).newInstance(new Object[0]);
                if (newInstance != null) {
                    hVar = (AbstractC15310h) newInstance;
                    AbstractC15310h.f37335a = hVar;
                    return hVar;
                }
                throw new C89388w("null cannot be cast to non-null type");
            } catch (Exception unused) {
                hVar = null;
            }
        }

        public /* synthetic */ C15311a(byte b) {
            this();
        }
    }
}
