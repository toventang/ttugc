package com.p2082ss.android.ugc.aweme.feed.param;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import java.util.HashMap;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.param.MobParamProvider */
public final class MobParamProvider extends AbstractC1174ac {

    /* renamed from: b */
    public static final C49810a f114583b = new C49810a((byte) 0);

    /* renamed from: a */
    public HashMap<String, String> f114584a = new HashMap<>();

    static {
        Covode.recordClassIndex(58916);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.param.MobParamProvider$a */
    public static final class C49810a {
        static {
            Covode.recordClassIndex(58917);
        }

        private C49810a() {
        }

        public /* synthetic */ C49810a(byte b) {
            this();
        }

        /* renamed from: a */
        public static MobParamProvider m93272a(Context context) {
            C89219l.m154721d(context, "");
            Activity a = C34729o.m70950a(context);
            Objects.requireNonNull(a, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            AbstractC1174ac a2 = C1181ae.m3881a((ActivityC0945e) a, (C1175ad.AbstractC1177b) null).mo3983a(MobParamProvider.class);
            C89219l.m154716b(a2, "");
            return (MobParamProvider) a2;
        }
    }

    /* renamed from: a */
    public final void mo84341a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f114584a.put(str, str2);
    }
}
