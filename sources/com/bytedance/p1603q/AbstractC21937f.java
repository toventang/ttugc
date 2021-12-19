package com.bytedance.p1603q;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.q.f */
public interface AbstractC21937f {
    static {
        Covode.recordClassIndex(25603);
    }

    /* renamed from: a */
    <T> T mo35697a(Class<T> cls);

    /* renamed from: com.bytedance.q.f$a */
    public static class C21938a implements AbstractC21937f {
        static {
            Covode.recordClassIndex(25604);
        }

        @Override // com.bytedance.p1603q.AbstractC21937f
        /* renamed from: a */
        public final <T> T mo35697a(Class<T> cls) {
            try {
                return cls.newInstance();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
