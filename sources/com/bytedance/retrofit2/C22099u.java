package com.bytedance.retrofit2;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.client.C22027b;
import com.bytedance.retrofit2.client.C22028c;
import com.bytedance.retrofit2.mime.TypedInput;
import java.util.List;
import java.util.Objects;

/* renamed from: com.bytedance.retrofit2.u */
public final class C22099u<T> {

    /* renamed from: a */
    public final C22028c f52261a;

    /* renamed from: b */
    public final T f52262b;

    /* renamed from: c */
    public final TypedInput f52263c;

    /* renamed from: d */
    public C22096s f52264d;

    static {
        Covode.recordClassIndex(25799);
    }

    /* renamed from: a */
    public final int mo35904a() {
        return this.f52261a.f52040b;
    }

    /* renamed from: b */
    public final List<C22027b> mo35905b() {
        return this.f52261a.f52042d;
    }

    /* renamed from: a */
    public static <T> C22099u<T> m41527a(TypedInput typedInput, C22028c cVar) {
        Objects.requireNonNull(typedInput, "body == null");
        Objects.requireNonNull(cVar, "rawResponse == null");
        if (!cVar.mo35845a()) {
            return new C22099u<>(cVar, null, typedInput);
        }
        throw new IllegalArgumentException("rawResponse should not be successful response");
    }

    /* renamed from: a */
    public static <T> C22099u<T> m41528a(T t, C22028c cVar) {
        Objects.requireNonNull(cVar, "rawResponse == null");
        if (cVar.mo35845a()) {
            return new C22099u<>(cVar, t, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    private C22099u(C22028c cVar, T t, TypedInput typedInput) {
        this.f52261a = cVar;
        this.f52262b = t;
        this.f52263c = typedInput;
    }
}
