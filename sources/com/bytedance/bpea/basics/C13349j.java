package com.bytedance.bpea.basics;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.bpea.basics.j */
public final class C13349j implements Serializable {

    /* renamed from: a */
    private String f32623a;

    /* renamed from: b */
    private final String f32624b;

    static {
        Covode.recordClassIndex(15345);
    }

    public static /* synthetic */ C13349j copy$default(C13349j jVar, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = jVar.f32624b;
        }
        return jVar.copy(str);
    }

    public final String component1() {
        return this.f32624b;
    }

    public final C13349j copy(String str) {
        return new C13349j(str);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C13349j) && C89219l.m154714a(this.f32624b, ((C13349j) obj).f32624b);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f32624b;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "PrivacyPoint(id=" + this.f32624b + ")";
    }

    public final String getId() {
        return this.f32624b;
    }

    public final String getTag() {
        return this.f32623a;
    }

    public final void setTag(String str) {
        this.f32623a = str;
    }

    public C13349j(String str) {
        this.f32624b = str;
    }
}
