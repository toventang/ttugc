package com.bytedance.android.livesdk.util.rxutils.p651b;

import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.AbstractC0976n;
import com.bytedance.android.livesdk.util.rxutils.p651b.p652a.C11185b;
import com.bytedance.covode.number.Covode;
import java.util.Objects;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88985y;

/* renamed from: com.bytedance.android.livesdk.util.rxutils.b.c */
public final class C11187c<V> {

    /* renamed from: a */
    private final AbstractC88979t<V> f26815a;

    static {
        Covode.recordClassIndex(12814);
    }

    private C11187c(AbstractC88979t<V> tVar) {
        this.f26815a = tVar;
    }

    /* renamed from: a */
    private static <T> C11187c<T> m19829a(AbstractC88979t<T> tVar) {
        return new C11187c<>(tVar);
    }

    /* renamed from: a */
    public final <T> AbstractC88985y<T, T> mo17968a(V v) {
        m19830a(v, "event == null");
        return new C11185b(this.f26815a, v);
    }

    /* renamed from: a */
    public static C11187c<EnumC11186b> m19828a(AbstractC0952i iVar) {
        C11183a aVar = (C11183a) iVar.mo3551a("_LIFECYCLE_BINDING_FRAGMENT_");
        if (aVar == null) {
            aVar = new C11183a();
            AbstractC0976n a = iVar.mo3552a();
            a.mo3456a(aVar, "_LIFECYCLE_BINDING_FRAGMENT_");
            a.mo3473c();
        } else if (aVar.isDetached()) {
            AbstractC0976n a2 = iVar.mo3552a();
            a2.mo3477e(aVar);
            a2.mo3473c();
        }
        return m19829a((AbstractC88979t) aVar.f26810a);
    }

    /* renamed from: a */
    private static <T> T m19830a(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }
}
