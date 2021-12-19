package com.p4501vk.api.sdk.p4507f;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.vk.api.sdk.f.d */
public final class C87889d<T> implements AbstractC87888c<T> {

    /* renamed from: a */
    public final AbstractC89171a<T> f199624a;

    /* renamed from: b */
    private final ThreadLocal<T> f199625b = new C87890a(this);

    static {
        Covode.recordClassIndex(103899);
    }

    /* renamed from: com.vk.api.sdk.f.d$a */
    public static final class C87890a extends ThreadLocal<T> {

        /* renamed from: a */
        final /* synthetic */ C87889d f199626a;

        static {
            Covode.recordClassIndex(103900);
        }

        /* access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public final T initialValue() {
            return this.f199626a.f199624a.invoke();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C87890a(C87889d dVar) {
            this.f199626a = dVar;
        }
    }

    @Override // com.p4501vk.api.sdk.p4507f.AbstractC87888c
    /* renamed from: a */
    public final T mo142367a() {
        T t = this.f199625b.get();
        if (t == null) {
            C89219l.m154707a();
        }
        return t;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.a<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    public C87889d(AbstractC89171a<? extends T> aVar) {
        C89219l.m154719c(aVar, "");
        this.f199624a = aVar;
    }
}
