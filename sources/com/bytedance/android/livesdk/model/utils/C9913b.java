package com.bytedance.android.livesdk.model.utils;

import com.bytedance.android.livesdk.model.utils.p593a.C9907a;
import com.bytedance.android.livesdk.model.utils.p593a.C9910d;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.model.utils.b */
public final class C9913b {

    /* renamed from: a */
    public final List<C9907a> f24029a;

    /* renamed from: b */
    public String f24030b;

    /* renamed from: c */
    public String f24031c;

    static {
        Covode.recordClassIndex(11461);
    }

    public final String toString() {
        return mo16611a();
    }

    public C9913b() {
        this.f24029a = new ArrayList();
        this.f24031c = "UTF-8";
        this.f24030b = null;
    }

    /* renamed from: a */
    public final String mo16611a() {
        if (this.f24029a.isEmpty()) {
            return this.f24030b;
        }
        String a = C9910d.m18216a(this.f24029a, this.f24031c);
        String str = this.f24030b;
        if (str == null || str.length() == 0) {
            return a;
        }
        int indexOf = this.f24030b.indexOf(63);
        if (indexOf < 0) {
            return this.f24030b + "?" + a;
        }
        if (this.f24030b.indexOf(61, indexOf) <= 0) {
            return this.f24030b + "&" + a;
        }
        int i = indexOf + 1;
        String substring = this.f24030b.substring(0, i);
        return substring + a + "&" + this.f24030b.substring(i);
    }

    public C9913b(String str) {
        this.f24029a = new ArrayList();
        this.f24031c = "UTF-8";
        this.f24030b = str;
    }

    /* renamed from: a */
    public final void mo16612a(String str, int i) {
        this.f24029a.add(new C9907a(str, String.valueOf(i)));
    }

    /* renamed from: a */
    public final void mo16613a(String str, long j) {
        this.f24029a.add(new C9907a(str, String.valueOf(j)));
    }

    /* renamed from: a */
    public final void mo16614a(String str, String str2) {
        this.f24029a.add(new C9907a(str, str2));
    }
}
