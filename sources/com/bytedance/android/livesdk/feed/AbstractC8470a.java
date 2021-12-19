package com.bytedance.android.livesdk.feed;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.feed.a */
public interface AbstractC8470a {
    static {
        Covode.recordClassIndex(9323);
    }

    /* renamed from: a */
    void mo14802a(EnumC8471a aVar, String str);

    /* renamed from: a */
    void mo14803a(EnumC8471a aVar, String str, Throwable th);

    /* renamed from: b */
    void mo14804b(EnumC8471a aVar, String str);

    /* renamed from: com.bytedance.android.livesdk.feed.a$a */
    public enum EnumC8471a {
        REFRESH,
        LOAD_MORE;

        static {
            Covode.recordClassIndex(9324);
        }
    }
}
