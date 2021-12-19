package com.bytedance.common.jato.p901a.p902a;

import com.bytedance.covode.number.Covode;
import java.util.Objects;

/* renamed from: com.bytedance.common.jato.a.a.b */
public final class C13527b implements Comparable<C13527b> {

    /* renamed from: a */
    int f32919a;

    /* renamed from: b */
    String f32920b;

    /* renamed from: c */
    int f32921c;

    static {
        Covode.recordClassIndex(15537);
    }

    public final int hashCode() {
        return Objects.hash(this.f32920b);
    }

    public final String toString() {
        return this.f32919a + ",," + this.f32920b + ",," + this.f32921c;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(C13527b bVar) {
        return this.f32919a - bVar.f32919a;
    }

    /* renamed from: a */
    static C13527b m24306a(String str) {
        try {
            String[] split = str.split(",,");
            return new C13527b(Integer.parseInt(split[0]), split[1], Integer.parseInt(split[2]));
        } catch (Throwable unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f32920b, ((C13527b) obj).f32920b);
    }

    private C13527b(int i, String str, int i2) {
        this.f32919a = i;
        this.f32920b = str;
        this.f32921c = i2;
    }
}
