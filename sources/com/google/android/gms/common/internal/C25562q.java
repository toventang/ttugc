package com.google.android.gms.common.internal;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.api.AbstractC25478k;
import com.google.android.gms.common.api.AbstractC25485p;
import com.google.android.gms.common.api.C25351e;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.p1940d.AbstractC25631h;
import com.google.android.gms.p1940d.C25632i;

/* renamed from: com.google.android.gms.common.internal.q */
public final class C25562q {

    /* renamed from: a */
    private static final AbstractC25564b f60635a = new C25576y();

    /* renamed from: com.google.android.gms.common.internal.q$a */
    public interface AbstractC25563a<R extends AbstractC25485p, T> {
        static {
            Covode.recordClassIndex(30966);
        }

        /* renamed from: a */
        T mo41368a(R r);
    }

    /* renamed from: com.google.android.gms.common.internal.q$b */
    public interface AbstractC25564b {
        static {
            Covode.recordClassIndex(30967);
        }

        /* renamed from: a */
        C25351e mo41829a(Status status);
    }

    static {
        Covode.recordClassIndex(30965);
    }

    /* renamed from: a */
    public static <R extends AbstractC25485p> AbstractC25631h<Void> m49310a(AbstractC25478k<R> kVar) {
        return m49311a(kVar, new C25509ab());
    }

    /* renamed from: a */
    public static <R extends AbstractC25485p, T> AbstractC25631h<T> m49311a(AbstractC25478k<R> kVar, AbstractC25563a<R, T> aVar) {
        AbstractC25564b bVar = f60635a;
        C25632i iVar = new C25632i();
        kVar.mo41541a(new C25508aa(kVar, iVar, aVar, bVar));
        return iVar.f60753a;
    }
}
