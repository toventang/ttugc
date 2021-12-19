package com.bytedance.android.livesdkapi.depend.model.p686b;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.bytedance.android.livesdkapi.depend.model.b.a */
public class C11688a {

    /* renamed from: a */
    public long f27930a;

    /* renamed from: b */
    public long f27931b;

    /* renamed from: c */
    public String f27932c;

    /* renamed from: d */
    public String f27933d;
    @AbstractC27891c(mo46611a = "follow_status")

    /* renamed from: e */
    public int f27934e;

    /* renamed from: f */
    public EnumC11689a f27935f = EnumC11689a.Default;

    /* renamed from: g */
    public boolean f27936g;

    static {
        Covode.recordClassIndex(13356);
    }

    /* renamed from: a */
    public final int mo18451a() {
        int i = this.f27934e;
        if (i < 0 || i > 2) {
            this.f27934e = 0;
        }
        return this.f27934e;
    }

    /* renamed from: b */
    public final boolean mo18452b() {
        int i = this.f27934e;
        if (i == 2 || i == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: com.bytedance.android.livesdkapi.depend.model.b.a$a */
    public enum EnumC11689a {
        Default,
        FromWeb;

        static {
            Covode.recordClassIndex(13357);
        }
    }
}
