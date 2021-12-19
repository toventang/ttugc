package com.bytedance.framwork.core.p999b.p1002c;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.framwork.core.b.c.d */
public final class C14779d {

    /* renamed from: a */
    public static final ConcurrentHashMap<String, AbstractC14778c> f36032a = new ConcurrentHashMap<>();

    /* renamed from: b */
    public static final ConcurrentHashMap<String, AbstractC14777b> f36033b = new ConcurrentHashMap<>();

    static {
        Covode.recordClassIndex(16879);
    }

    /* renamed from: a */
    public static AbstractC14778c m27144a(String str) {
        return f36032a.get(str);
    }
}
