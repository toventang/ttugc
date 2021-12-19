package com.p2082ss.android.ugc.aweme.search.model;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.search.model.SearchResultParamProvider */
public final class SearchResultParamProvider extends AbstractC1174ac {

    /* renamed from: b */
    public static final C67672a f151606b = new C67672a((byte) 0);

    /* renamed from: a */
    public C67678d f151607a;

    static {
        Covode.recordClassIndex(79316);
    }

    /* renamed from: com.ss.android.ugc.aweme.search.model.SearchResultParamProvider$a */
    public static final class C67672a {
        static {
            Covode.recordClassIndex(79317);
        }

        private C67672a() {
        }

        public /* synthetic */ C67672a(byte b) {
            this();
        }

        /* renamed from: a */
        public static void m119824a(Context context, C67678d dVar) {
            C89219l.m154721d(context, "");
            C89219l.m154721d(dVar, "");
            Activity a = C34729o.m70950a(context);
            Objects.requireNonNull(a, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            AbstractC1174ac a2 = C1181ae.m3881a((ActivityC0945e) a, (C1175ad.AbstractC1177b) null).mo3983a(SearchResultParamProvider.class);
            C89219l.m154716b(a2, "");
            ((SearchResultParamProvider) a2).f151607a = dVar;
        }
    }
}
