package com.p2082ss.android.ugc.aweme.favorites.p2921c;

import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import dagger.p4535a.AbstractC88078c;
import dagger.p4535a.C88081f;
import javax.p4631a.AbstractC89405a;

/* renamed from: com.ss.android.ugc.aweme.favorites.c.c */
public final class C47204c implements AbstractC88078c<Fragment> {

    /* renamed from: a */
    private final AbstractC89405a<ActivityC0945e> f109875a;

    static {
        Covode.recordClassIndex(55817);
    }

    @Override // javax.p4631a.AbstractC89405a
    public final /* synthetic */ Object get() {
        return m90377a(this.f109875a.get());
    }

    /* renamed from: a */
    public static Fragment m90377a(ActivityC0945e eVar) {
        return (Fragment) C88081f.m153153a(C47202a.m90373a(eVar), "Cannot return null from a non-@Nullable @Provides method");
    }
}
