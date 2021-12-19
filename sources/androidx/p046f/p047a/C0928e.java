package androidx.p046f.p047a;

import android.app.Activity;
import android.app.Application;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1175ad;
import com.bytedance.covode.number.Covode;
import dagger.p4535a.AbstractC88078c;
import dagger.p4535a.C88081f;
import java.util.Map;
import javax.p4631a.AbstractC89405a;

/* renamed from: androidx.f.a.e */
public final class C0928e implements AbstractC88078c<C1175ad.AbstractC1177b> {

    /* renamed from: a */
    private final AbstractC89405a<Activity> f3292a;

    /* renamed from: b */
    private final AbstractC89405a<Application> f3293b;

    /* renamed from: c */
    private final AbstractC89405a<Map<String, AbstractC89405a<AbstractC0924b<? extends AbstractC1174ac>>>> f3294c;

    static {
        Covode.recordClassIndex(1016);
    }

    @Override // javax.p4631a.AbstractC89405a
    public final /* synthetic */ Object get() {
        this.f3292a.get();
        return m3143a(this.f3293b.get(), this.f3294c.get());
    }

    /* renamed from: a */
    public static C1175ad.AbstractC1177b m3143a(Application application, Map<String, AbstractC89405a<AbstractC0924b<? extends AbstractC1174ac>>> map) {
        return (C1175ad.AbstractC1177b) C88081f.m153153a(new C0923a(application, new C1175ad.C1176a(application), map), "Cannot return null from a non-@Nullable @Provides method");
    }
}
