package com.p2082ss.android.common.util;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.http.p2146a.p2147a.p2148a.C29928a;
import com.p2082ss.android.http.p2146a.p2149b.C29934d;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.common.util.g */
public final class C29844g {

    /* renamed from: a */
    public final List<C29934d> f71191a;

    /* renamed from: b */
    public String f71192b;

    /* renamed from: c */
    public String f71193c;

    static {
        Covode.recordClassIndex(36252);
    }

    public final String toString() {
        return mo52126a();
    }

    public C29844g() {
        this.f71191a = new ArrayList();
        this.f71193c = "UTF-8";
        this.f71192b = null;
    }

    /* renamed from: a */
    public final String mo52126a() {
        if (this.f71191a.isEmpty()) {
            return this.f71192b;
        }
        String a = C29928a.m60310a(this.f71191a, this.f71193c);
        String str = this.f71192b;
        if (str == null || str.length() == 0) {
            return a;
        }
        if (this.f71192b.indexOf(63) >= 0) {
            return this.f71192b + "&" + a;
        }
        return this.f71192b + "?" + a;
    }

    public C29844g(String str) {
        this.f71191a = new ArrayList();
        this.f71193c = "UTF-8";
        this.f71192b = str;
    }

    /* renamed from: a */
    public final void mo52127a(String str, double d) {
        this.f71191a.add(new C29934d(str, String.valueOf(d)));
    }

    /* renamed from: a */
    public final void mo52128a(String str, int i) {
        this.f71191a.add(new C29934d(str, String.valueOf(i)));
    }

    /* renamed from: a */
    public final void mo52129a(String str, long j) {
        this.f71191a.add(new C29934d(str, String.valueOf(j)));
    }

    /* renamed from: a */
    public final void mo52130a(String str, String str2) {
        this.f71191a.add(new C29934d(str, str2));
    }
}
