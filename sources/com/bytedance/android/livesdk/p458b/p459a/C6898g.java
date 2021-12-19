package com.bytedance.android.livesdk.p458b.p459a;

import android.text.TextUtils;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.b.a.g */
public class C6898g {

    /* renamed from: d */
    private static final String f17281d = C6898g.class.getSimpleName();

    /* renamed from: a */
    public final Map<Long, String> f17282a = new HashMap();

    /* renamed from: b */
    public final Map<Integer, String> f17283b = new HashMap();

    /* renamed from: c */
    public Map<Long, Long> f17284c = new HashMap();

    /* renamed from: com.bytedance.android.livesdk.b.a.g$a */
    public static class C6899a {

        /* renamed from: a */
        public static C6898g f17285a = new C6898g();

        static {
            Covode.recordClassIndex(7637);
        }
    }

    static {
        Covode.recordClassIndex(7636);
    }

    /* renamed from: a */
    public final void mo13197a() {
        this.f17282a.clear();
        this.f17283b.clear();
        this.f17284c.clear();
    }

    /* renamed from: a */
    public final String mo13196a(long j) {
        return this.f17282a.get(Long.valueOf(j));
    }

    /* renamed from: a */
    public final long mo13195a(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        for (Long l : this.f17282a.keySet()) {
            long longValue = l.longValue();
            if (TextUtils.equals(str, this.f17282a.get(Long.valueOf(longValue)))) {
                return longValue;
            }
        }
        return 0;
    }

    /* renamed from: b */
    public final void mo13201b(long j) {
        if (this.f17284c.containsValue(Long.valueOf(j))) {
            for (Map.Entry<Long, Long> entry : this.f17284c.entrySet()) {
                if (entry.getValue().equals(Long.valueOf(j))) {
                    this.f17284c.remove(entry.getKey());
                    return;
                }
            }
        }
    }

    /* renamed from: c */
    public final long mo13202c(long j) {
        if (j <= 0) {
            return -1;
        }
        for (Map.Entry<Long, Long> entry : this.f17284c.entrySet()) {
            if (entry.getValue().equals(Long.valueOf(j))) {
                return entry.getKey().longValue();
            }
        }
        return -1;
    }

    /* renamed from: b */
    public final int mo13200b(String str) {
        if (str == null || str.isEmpty()) {
            return -1;
        }
        if (str.equals(C6894d.m14753a().f17259d)) {
            return 0;
        }
        for (Map.Entry<Integer, String> entry : this.f17283b.entrySet()) {
            if (entry.getValue().equals(str)) {
                return entry.getKey().intValue();
            }
        }
        return -1;
    }

    /* renamed from: a */
    public final void mo13198a(int i, String str) {
        if (!TextUtils.isEmpty(str)) {
            int i2 = 1;
            if (i == 0) {
                i = 1;
            }
            if (this.f17283b.containsKey(Integer.valueOf(i))) {
                while (this.f17283b.containsKey(Integer.valueOf(i2))) {
                    i2++;
                    if (i2 > 3) {
                        return;
                    }
                }
                this.f17283b.put(Integer.valueOf(i2), str);
                return;
            }
            this.f17283b.put(Integer.valueOf(i), str);
        }
    }

    /* renamed from: a */
    public final void mo13199a(long j, String str) {
        C3854a.m9453a(3, f17281d, "saveInteractId -> interactIdStr = ".concat(String.valueOf(str)));
        if (!TextUtils.isEmpty(str)) {
            this.f17282a.put(Long.valueOf(j), str);
        }
    }
}
