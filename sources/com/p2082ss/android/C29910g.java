package com.p2082ss.android;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.g */
public final class C29910g {

    /* renamed from: a */
    public final String f71345a;

    /* renamed from: b */
    public final String f71346b;

    static {
        Covode.recordClassIndex(36321);
    }

    public final int hashCode() {
        int i;
        String str = this.f71345a;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        String str2 = this.f71346b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.f71345a;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        StringBuilder append = sb.append(str).append(": ");
        String str3 = this.f71346b;
        if (str3 != null) {
            str2 = str3;
        }
        return append.append(str2).toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C29910g gVar = (C29910g) obj;
        String str = this.f71345a;
        if (str == null ? gVar.f71345a != null : !str.equals(gVar.f71345a)) {
            return false;
        }
        String str2 = this.f71346b;
        String str3 = gVar.f71346b;
        if (str2 == null ? str3 == null : str2.equals(str3)) {
            return true;
        }
        return false;
    }

    public C29910g(String str, String str2) {
        this.f71345a = str;
        this.f71346b = str2;
    }
}
