package com.bytedance.android.livesdkapi;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdkapi.e */
public interface AbstractC11748e {

    /* renamed from: com.bytedance.android.livesdkapi.e$a */
    public interface AbstractC11749a {
        static {
            Covode.recordClassIndex(13439);
        }

        Object defValue();

        String key();

        boolean supportPersist();

        EnumC11750b type();
    }

    static {
        Covode.recordClassIndex(13438);
    }

    /* renamed from: a */
    void mo18707a(AbstractC11749a aVar, int i);

    /* renamed from: a */
    boolean mo18708a(AbstractC11749a aVar);

    /* renamed from: b */
    void mo18709b(AbstractC11749a aVar);

    /* renamed from: c */
    int mo18710c(AbstractC11749a aVar);

    /* renamed from: com.bytedance.android.livesdkapi.e$b */
    public enum EnumC11750b {
        Boolean,
        Integer,
        Long,
        Float,
        String,
        StrSet;

        static {
            Covode.recordClassIndex(13440);
        }
    }
}
