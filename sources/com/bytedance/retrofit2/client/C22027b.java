package com.bytedance.retrofit2.client;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.retrofit2.client.b */
public final class C22027b {

    /* renamed from: a */
    public final String f52037a;

    /* renamed from: b */
    public final String f52038b;

    static {
        Covode.recordClassIndex(25717);
    }

    public final int hashCode() {
        int i;
        String str = this.f52037a;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        String str2 = this.f52038b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.f52037a;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        StringBuilder append = sb.append(str).append(": ");
        String str3 = this.f52038b;
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
        C22027b bVar = (C22027b) obj;
        String str = this.f52037a;
        if (str == null ? bVar.f52037a != null : !str.equals(bVar.f52037a)) {
            return false;
        }
        String str2 = this.f52038b;
        String str3 = bVar.f52038b;
        if (str2 == null ? str3 == null : str2.equals(str3)) {
            return true;
        }
        return false;
    }

    public C22027b(String str, String str2) {
        this.f52037a = str;
        this.f52038b = str2;
    }
}
