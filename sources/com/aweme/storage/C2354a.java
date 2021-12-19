package com.aweme.storage;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.Arrays;

/* renamed from: com.aweme.storage.a */
public class C2354a {
    @AbstractC27891c(mo46611a = "interval")

    /* renamed from: a */
    public int f7156a;
    @AbstractC27891c(mo46611a = "force")

    /* renamed from: b */
    public String[] f7157b;
    @AbstractC27891c(mo46611a = "file_limit")

    /* renamed from: c */
    public int f7158c;
    @AbstractC27891c(mo46611a = "dir_limit")

    /* renamed from: d */
    public int f7159d;
    @AbstractC27891c(mo46611a = "non_active_duration")

    /* renamed from: e */
    public int f7160e;
    @AbstractC27891c(mo46611a = "non_active_count")

    /* renamed from: f */
    public int f7161f;
    @AbstractC27891c(mo46611a = "non_active_times")

    /* renamed from: g */
    public int f7162g;
    @AbstractC27891c(mo46611a = "too_large_limit")

    /* renamed from: h */
    public int f7163h;
    @AbstractC27891c(mo46611a = "non_active_limit")

    /* renamed from: i */
    public int f7164i;

    static {
        Covode.recordClassIndex(2632);
    }

    public String toString() {
        return "CacheStrategy{interval=" + this.f7156a + ", forceList=" + Arrays.toString(this.f7157b) + ", fileLimit=" + this.f7158c + ", dirLimit=" + this.f7159d + ", nonActiveDuration=" + this.f7160e + ", nonActiveLimit=" + this.f7164i + '}';
    }
}
