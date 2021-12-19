package com.p2082ss.android.ugc.aweme.profile.p3576ui.profiletab;

import android.content.Context;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.common.p2132c.C29823c;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.Callable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.profiletab.a */
public final class C64166a {

    /* renamed from: a */
    public final ActivityC0945e f145535a;

    /* renamed from: b */
    public final Context f145536b;

    static {
        Covode.recordClassIndex(75611);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.profiletab.a$a */
    static final class CallableC64167a<V> implements Callable {

        /* renamed from: a */
        public static final CallableC64167a f145537a = new CallableC64167a();

        static {
            Covode.recordClassIndex(75612);
        }

        CallableC64167a() {
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            C39162r.m79460a("homepage_click", new HashMap());
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.profiletab.a$b */
    static final class CallableC64168b<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C64166a f145538a;

        static {
            Covode.recordClassIndex(75613);
        }

        CallableC64168b(C64166a aVar) {
            this.f145538a = aVar;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            C29823c.m60080a(this.f145538a.f145535a, "personal_homepage", "click");
            return null;
        }
    }

    public C64166a(Context context) {
        C89219l.m154721d(context, "");
        this.f145536b = context;
        Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        this.f145535a = (ActivityC0945e) context;
    }
}
