package com.p2082ss.android.ugc.aweme.favorites.p2921c;

import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import dagger.p4535a.AbstractC88078c;
import dagger.p4535a.C88081f;
import javax.p4631a.AbstractC89405a;

/* renamed from: com.ss.android.ugc.aweme.favorites.c.b */
public final class C47203b implements AbstractC88078c<AbstractC0952i> {

    /* renamed from: a */
    private final AbstractC89405a<Fragment> f109874a;

    static {
        Covode.recordClassIndex(55816);
    }

    @Override // javax.p4631a.AbstractC89405a
    public final /* synthetic */ Object get() {
        return m90376a(this.f109874a.get());
    }

    /* renamed from: a */
    public static AbstractC0952i m90376a(Fragment fragment) {
        return (AbstractC0952i) C88081f.m153153a(C47202a.m90374a(fragment), "Cannot return null from a non-@Nullable @Provides method");
    }
}
