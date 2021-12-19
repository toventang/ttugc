package com.linecorp.linesdk;

import com.bytedance.covode.number.Covode;
import java.util.NoSuchElementException;

/* renamed from: com.linecorp.linesdk.a */
public final class C28141a<R> {

    /* renamed from: a */
    public static final C28141a<?> f65856a = new C28141a<>(EnumC28179b.SUCCESS, null, LineApiError.f65847a);

    /* renamed from: b */
    public final EnumC28179b f65857b;

    /* renamed from: c */
    public final LineApiError f65858c;

    /* renamed from: d */
    private final R f65859d;

    /* renamed from: a */
    public final boolean mo48124a() {
        if (this.f65857b == EnumC28179b.SUCCESS) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final R mo48125b() {
        R r = this.f65859d;
        if (r != null) {
            return r;
        }
        throw new NoSuchElementException("response data is null. Please check result by isSuccess before.");
    }

    static {
        Covode.recordClassIndex(34082);
    }

    public final int hashCode() {
        int i;
        int hashCode = this.f65857b.hashCode() * 31;
        R r = this.f65859d;
        if (r != null) {
            i = r.hashCode();
        } else {
            i = 0;
        }
        return ((hashCode + i) * 31) + this.f65858c.hashCode();
    }

    public final String toString() {
        return "LineApiResponse{errorData=" + this.f65858c + ", responseCode=" + this.f65857b + ", responseData=" + ((Object) this.f65859d) + '}';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C28141a aVar = (C28141a) obj;
        if (this.f65857b != aVar.f65857b) {
            return false;
        }
        R r = this.f65859d;
        if (r == null ? aVar.f65859d == null : r.equals(aVar.f65859d)) {
            return this.f65858c.equals(aVar.f65858c);
        }
        return false;
    }

    /* renamed from: a */
    public static <T> C28141a<T> m56242a(EnumC28179b bVar, LineApiError lineApiError) {
        return new C28141a<>(bVar, null, lineApiError);
    }

    public C28141a(EnumC28179b bVar, R r, LineApiError lineApiError) {
        this.f65857b = bVar;
        this.f65859d = r;
        this.f65858c = lineApiError;
    }
}
