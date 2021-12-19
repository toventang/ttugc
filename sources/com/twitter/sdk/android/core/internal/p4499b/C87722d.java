package com.twitter.sdk.android.core.internal.p4499b;

import com.bytedance.covode.number.Covode;

/* renamed from: com.twitter.sdk.android.core.internal.b.d */
public final class C87722d<T> {

    /* renamed from: a */
    public final AbstractC87720b f199238a;

    /* renamed from: b */
    public final AbstractC87723e<T> f199239b;

    /* renamed from: c */
    public final String f199240c;

    static {
        Covode.recordClassIndex(103711);
    }

    /* renamed from: a */
    public final void mo142169a() {
        this.f199238a.mo142168b().remove(this.f199240c).commit();
    }

    /* renamed from: a */
    public final void mo142170a(T t) {
        AbstractC87720b bVar = this.f199238a;
        bVar.mo142167a(bVar.mo142168b().putString(this.f199240c, this.f199239b.mo142118a((Object) t)));
    }

    public C87722d(AbstractC87720b bVar, AbstractC87723e<T> eVar, String str) {
        this.f199238a = bVar;
        this.f199239b = eVar;
        this.f199240c = str;
    }
}
