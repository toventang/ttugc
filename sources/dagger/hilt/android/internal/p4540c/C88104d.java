package dagger.hilt.android.internal.p4540c;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import dagger.p4535a.AbstractC88078c;
import dagger.p4535a.C88081f;

/* renamed from: dagger.hilt.android.internal.c.d */
public final class C88104d implements AbstractC88078c<Application> {

    /* renamed from: a */
    private final C88103c f199994a;

    static {
        Covode.recordClassIndex(104130);
    }

    @Override // javax.p4631a.AbstractC89405a
    public final /* synthetic */ Object get() {
        return m153176a(this.f199994a);
    }

    /* renamed from: a */
    public static Application m153176a(C88103c cVar) {
        return (Application) C88081f.m153153a(cVar.mo142625a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
