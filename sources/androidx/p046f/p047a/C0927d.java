package androidx.p046f.p047a;

import android.app.Activity;
import android.app.Application;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1175ad;
import androidx.p046f.p047a.C0925c;
import com.bytedance.covode.number.Covode;
import dagger.p4535a.AbstractC88078c;
import dagger.p4535a.C88081f;
import java.util.Map;
import javax.p4631a.AbstractC89405a;

/* renamed from: androidx.f.a.d */
public final class C0927d implements AbstractC88078c<C1175ad.AbstractC1177b> {

    /* renamed from: a */
    private final AbstractC89405a<Activity> f3289a;

    /* renamed from: b */
    private final AbstractC89405a<Application> f3290b;

    /* renamed from: c */
    private final AbstractC89405a<Map<String, AbstractC89405a<AbstractC0924b<? extends AbstractC1174ac>>>> f3291c;

    static {
        Covode.recordClassIndex(1015);
    }

    @Override // javax.p4631a.AbstractC89405a
    public final /* synthetic */ Object get() {
        return m3142a(this.f3289a.get(), this.f3290b.get(), this.f3291c.get());
    }

    /* renamed from: a */
    public static C1175ad.AbstractC1177b m3142a(Activity activity, Application application, Map<String, AbstractC89405a<AbstractC0924b<? extends AbstractC1174ac>>> map) {
        if (activity.getIntent() != null) {
            C0925c.AbstractC0926a.m3141a(activity.getIntent());
        }
        return (C1175ad.AbstractC1177b) C88081f.m153153a(new C0923a(application, new C1175ad.C1176a(application), map), "Cannot return null from a non-@Nullable @Provides method");
    }
}
