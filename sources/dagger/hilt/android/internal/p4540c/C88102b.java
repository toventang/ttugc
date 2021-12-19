package dagger.hilt.android.internal.p4540c;

import android.app.Activity;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import dagger.p4535a.AbstractC88078c;
import dagger.p4535a.C88081f;
import javax.p4631a.AbstractC89405a;

/* renamed from: dagger.hilt.android.internal.c.b */
public final class C88102b implements AbstractC88078c<ActivityC0945e> {

    /* renamed from: a */
    private final AbstractC89405a<Activity> f199992a;

    static {
        Covode.recordClassIndex(104128);
    }

    @Override // javax.p4631a.AbstractC89405a
    public final /* synthetic */ Object get() {
        return m153174a(this.f199992a.get());
    }

    /* renamed from: a */
    public static ActivityC0945e m153174a(Activity activity) {
        return (ActivityC0945e) C88081f.m153153a(AbstractC88101a.m153173a(activity), "Cannot return null from a non-@Nullable @Provides method");
    }
}
