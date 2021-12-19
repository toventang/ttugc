package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.runtime.p1927d.AbstractC25148a;
import java.util.Objects;

/* renamed from: com.google.android.datatransport.runtime.backends.c */
final class C25127c extends AbstractC25134h {

    /* renamed from: a */
    private final Context f59557a;

    /* renamed from: b */
    private final AbstractC25148a f59558b;

    /* renamed from: c */
    private final AbstractC25148a f59559c;

    /* renamed from: d */
    private final String f59560d;

    static {
        Covode.recordClassIndex(30493);
    }

    @Override // com.google.android.datatransport.runtime.backends.AbstractC25134h
    /* renamed from: a */
    public final Context mo41110a() {
        return this.f59557a;
    }

    @Override // com.google.android.datatransport.runtime.backends.AbstractC25134h
    /* renamed from: b */
    public final AbstractC25148a mo41111b() {
        return this.f59558b;
    }

    @Override // com.google.android.datatransport.runtime.backends.AbstractC25134h
    /* renamed from: c */
    public final AbstractC25148a mo41112c() {
        return this.f59559c;
    }

    @Override // com.google.android.datatransport.runtime.backends.AbstractC25134h
    /* renamed from: d */
    public final String mo41113d() {
        return this.f59560d;
    }

    public final int hashCode() {
        return ((((((this.f59557a.hashCode() ^ 1000003) * 1000003) ^ this.f59558b.hashCode()) * 1000003) ^ this.f59559c.hashCode()) * 1000003) ^ this.f59560d.hashCode();
    }

    public final String toString() {
        return "CreationContext{applicationContext=" + this.f59557a + ", wallClock=" + this.f59558b + ", monotonicClock=" + this.f59559c + ", backendName=" + this.f59560d + "}";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC25134h) {
            AbstractC25134h hVar = (AbstractC25134h) obj;
            if (!this.f59557a.equals(hVar.mo41110a()) || !this.f59558b.equals(hVar.mo41111b()) || !this.f59559c.equals(hVar.mo41112c()) || !this.f59560d.equals(hVar.mo41113d())) {
                return false;
            }
            return true;
        }
        return false;
    }

    C25127c(Context context, AbstractC25148a aVar, AbstractC25148a aVar2, String str) {
        Objects.requireNonNull(context, "Null applicationContext");
        this.f59557a = context;
        Objects.requireNonNull(aVar, "Null wallClock");
        this.f59558b = aVar;
        Objects.requireNonNull(aVar2, "Null monotonicClock");
        this.f59559c = aVar2;
        Objects.requireNonNull(str, "Null backendName");
        this.f59560d = str;
    }
}
