package com.p2082ss.android.token;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.token.c */
public final class C30627c {

    /* renamed from: a */
    public final String f73191a;

    /* renamed from: b */
    public final String f73192b;

    static {
        Covode.recordClassIndex(37165);
    }

    public final int hashCode() {
        int i;
        String str = this.f73191a;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        String str2 = this.f73192b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.f73191a;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        StringBuilder append = sb.append(str).append(": ");
        String str3 = this.f73192b;
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
        C30627c cVar = (C30627c) obj;
        String str = this.f73191a;
        if (str == null ? cVar.f73191a != null : !str.equals(cVar.f73191a)) {
            return false;
        }
        String str2 = this.f73192b;
        String str3 = cVar.f73192b;
        if (str2 == null ? str3 == null : str2.equals(str3)) {
            return true;
        }
        return false;
    }

    public C30627c(String str, String str2) {
        this.f73191a = str;
        this.f73192b = str2;
    }
}
