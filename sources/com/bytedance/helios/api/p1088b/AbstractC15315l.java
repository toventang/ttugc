package com.bytedance.helios.api.p1088b;

import com.bytedance.covode.number.Covode;
import java.util.List;
import p4600h.C89388w;

/* renamed from: com.bytedance.helios.api.b.l */
public abstract class AbstractC15315l {
    public static final C15316a Companion = new C15316a((byte) 0);
    public static AbstractC15315l INSTANCE;

    static {
        Covode.recordClassIndex(17545);
    }

    public abstract void addJsbEvent(C15314k kVar);

    public abstract List<C15314k> getJsbEvents();

    /* renamed from: com.bytedance.helios.api.b.l$a */
    public static final class C15316a {
        static {
            Covode.recordClassIndex(17546);
        }

        private C15316a() {
        }

        /* renamed from: a */
        public static AbstractC15315l m28213a() {
            AbstractC15315l lVar;
            try {
                Object newInstance = Class.forName("com.bytedance.helios.sdk.jsb.JsbEventFetcherImpl").getConstructor(new Class[0]).newInstance(new Object[0]);
                if (newInstance != null) {
                    lVar = (AbstractC15315l) newInstance;
                    AbstractC15315l.INSTANCE = lVar;
                    return lVar;
                }
                throw new C89388w("null cannot be cast to non-null type");
            } catch (Exception unused) {
                lVar = null;
            }
        }

        public /* synthetic */ C15316a(byte b) {
            this();
        }
    }
}
