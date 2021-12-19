package com.p2082ss.android.ugc.aweme.ecommerce.track;

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

/* renamed from: com.ss.android.ugc.aweme.ecommerce.track.TrackerProvider */
public final class TrackerProvider extends AbstractC1174ac {

    /* renamed from: b */
    public static final C45534a f106047b = new C45534a((byte) 0);

    /* renamed from: a */
    public Object f106048a;

    static {
        Covode.recordClassIndex(54024);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.track.TrackerProvider$a */
    public static final class C45534a {
        static {
            Covode.recordClassIndex(54025);
        }

        private C45534a() {
        }

        public /* synthetic */ C45534a(byte b) {
            this();
        }

        /* renamed from: a */
        public static <T> void m88074a(Context context, T t) {
            C89219l.m154721d(context, "");
            Activity a = C34729o.m70950a(context);
            Objects.requireNonNull(a, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            AbstractC1174ac a2 = C1181ae.m3881a((ActivityC0945e) a, (C1175ad.AbstractC1177b) null).mo3983a(TrackerProvider.class);
            C89219l.m154716b(a2, "");
            ((TrackerProvider) a2).f106048a = t;
        }
    }
}
