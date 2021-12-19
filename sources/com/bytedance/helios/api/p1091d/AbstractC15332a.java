package com.bytedance.helios.api.p1091d;

import com.bytedance.covode.number.Covode;
import p4600h.C89388w;

/* renamed from: com.bytedance.helios.api.d.a */
public abstract class AbstractC15332a {
    public static final C15333a Companion = new C15333a((byte) 0);
    public static AbstractC15332a INSTANCE;

    static {
        Covode.recordClassIndex(17578);
    }

    public abstract void startMonitor();

    /* renamed from: com.bytedance.helios.api.d.a$a */
    public static final class C15333a {
        static {
            Covode.recordClassIndex(17579);
        }

        private C15333a() {
        }

        /* renamed from: a */
        public static AbstractC15332a m28234a() {
            AbstractC15332a aVar;
            try {
                Object newInstance = Class.forName("com.bytedance.helios.nativeaudio.AudioMonitorImpl").getConstructor(new Class[0]).newInstance(new Object[0]);
                if (newInstance != null) {
                    aVar = (AbstractC15332a) newInstance;
                    AbstractC15332a.INSTANCE = aVar;
                    return aVar;
                }
                throw new C89388w("null cannot be cast to non-null type");
            } catch (Exception unused) {
                aVar = null;
            }
        }

        public /* synthetic */ C15333a(byte b) {
            this();
        }
    }
}
