package com.google.firebase.p2008a.p2009a;

import android.util.Base64;
import android.util.JsonWriter;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.google.firebase.p2008a.AbstractC27682d;
import com.google.firebase.p2008a.AbstractC27683e;
import com.google.firebase.p2008a.AbstractC27684f;
import com.google.firebase.p2008a.AbstractC27685g;
import com.google.firebase.p2008a.C27681c;
import java.io.Writer;
import java.util.Collection;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.google.firebase.a.a.d */
public final class C27679d implements AbstractC27683e, AbstractC27685g {

    /* renamed from: a */
    final JsonWriter f65075a;

    /* renamed from: b */
    private C27679d f65076b;

    /* renamed from: c */
    private boolean f65077c = true;

    /* renamed from: d */
    private final Map<Class<?>, AbstractC27682d<?>> f65078d;

    /* renamed from: e */
    private final Map<Class<?>, AbstractC27684f<?>> f65079e;

    static {
        Covode.recordClassIndex(33259);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo46308a() {
        if (this.f65077c) {
            C27679d dVar = this.f65076b;
            if (dVar != null) {
                dVar.mo46308a();
                this.f65076b.f65077c = false;
                this.f65076b = null;
                this.f65075a.endObject();
                return;
            }
            return;
        }
        throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
    }

    /* renamed from: a */
    private C27679d m55330a(long j) {
        mo46308a();
        this.f65075a.value(j);
        return this;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C27679d mo46306a(String str) {
        mo46308a();
        this.f65075a.value(str);
        return this;
    }

    @Override // com.google.firebase.p2008a.AbstractC27685g
    /* renamed from: a */
    public final /* synthetic */ AbstractC27685g mo46307a(boolean z) {
        mo46308a();
        this.f65075a.value(z);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C27679d mo46302a(Object obj) {
        if (obj == null) {
            this.f65075a.nullValue();
            return this;
        } else if (obj instanceof Number) {
            this.f65075a.value((Number) obj);
            return this;
        } else {
            int i = 0;
            if (obj.getClass().isArray()) {
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    mo46308a();
                    if (bArr == null) {
                        this.f65075a.nullValue();
                    } else {
                        this.f65075a.value(Base64.encodeToString(bArr, 2));
                    }
                    return this;
                }
                this.f65075a.beginArray();
                if (obj instanceof int[]) {
                    int[] iArr = (int[]) obj;
                    int length = iArr.length;
                    while (i < length) {
                        this.f65075a.value((long) iArr[i]);
                        i++;
                    }
                } else if (obj instanceof long[]) {
                    long[] jArr = (long[]) obj;
                    int length2 = jArr.length;
                    while (i < length2) {
                        m55330a(jArr[i]);
                        i++;
                    }
                } else if (obj instanceof double[]) {
                    double[] dArr = (double[]) obj;
                    int length3 = dArr.length;
                    while (i < length3) {
                        this.f65075a.value(dArr[i]);
                        i++;
                    }
                } else if (obj instanceof boolean[]) {
                    boolean[] zArr = (boolean[]) obj;
                    int length4 = zArr.length;
                    while (i < length4) {
                        this.f65075a.value(zArr[i]);
                        i++;
                    }
                } else if (obj instanceof Number[]) {
                    Number[] numberArr = (Number[]) obj;
                    int length5 = numberArr.length;
                    while (i < length5) {
                        mo46302a(numberArr[i]);
                        i++;
                    }
                } else {
                    Object[] objArr = (Object[]) obj;
                    int length6 = objArr.length;
                    while (i < length6) {
                        mo46302a(objArr[i]);
                        i++;
                    }
                }
                this.f65075a.endArray();
                return this;
            } else if (obj instanceof Collection) {
                this.f65075a.beginArray();
                for (Object obj2 : (Collection) obj) {
                    mo46302a(obj2);
                }
                this.f65075a.endArray();
                return this;
            } else if (obj instanceof Map) {
                this.f65075a.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        mo46305a((String) key, entry.getValue());
                    } catch (ClassCastException e) {
                        throw new C27681c(C1764a.m5928a("Only String keys are currently supported in maps, got %s of type %s instead.", new Object[]{key, key.getClass()}), e);
                    }
                }
                this.f65075a.endObject();
                return this;
            } else {
                AbstractC27682d<?> dVar = this.f65078d.get(obj.getClass());
                if (dVar != null) {
                    this.f65075a.beginObject();
                    dVar.mo41005a(obj, this);
                    this.f65075a.endObject();
                    return this;
                }
                AbstractC27684f<?> fVar = this.f65079e.get(obj.getClass());
                if (fVar != null) {
                    fVar.mo41005a(obj, this);
                    return this;
                } else if (obj instanceof Enum) {
                    mo46306a(((Enum) obj).name());
                    return this;
                } else {
                    throw new C27681c("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C27679d mo46305a(String str, Object obj) {
        mo46308a();
        this.f65075a.name(str);
        if (obj != null) {
            return mo46302a(obj);
        }
        this.f65075a.nullValue();
        return this;
    }

    @Override // com.google.firebase.p2008a.AbstractC27683e
    /* renamed from: a */
    public final /* synthetic */ AbstractC27683e mo46303a(String str, int i) {
        mo46308a();
        this.f65075a.name(str);
        mo46308a();
        this.f65075a.value((long) i);
        return this;
    }

    @Override // com.google.firebase.p2008a.AbstractC27683e
    /* renamed from: a */
    public final /* synthetic */ AbstractC27683e mo46304a(String str, long j) {
        mo46308a();
        this.f65075a.name(str);
        return m55330a(j);
    }

    C27679d(Writer writer, Map<Class<?>, AbstractC27682d<?>> map, Map<Class<?>, AbstractC27684f<?>> map2) {
        this.f65075a = new JsonWriter(writer);
        this.f65078d = map;
        this.f65079e = map2;
    }
}
