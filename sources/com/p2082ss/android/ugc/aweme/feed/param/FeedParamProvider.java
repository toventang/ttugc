package com.p2082ss.android.ugc.aweme.feed.param;

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

/* renamed from: com.ss.android.ugc.aweme.feed.param.FeedParamProvider */
public final class FeedParamProvider extends AbstractC1174ac {

    /* renamed from: b */
    public static final C49809a f114581b = new C49809a((byte) 0);

    /* renamed from: a */
    public C49812b f114582a;

    static {
        Covode.recordClassIndex(58914);
    }

    /* renamed from: a */
    public static final C49812b m93269a(Context context) {
        return C49809a.m93270a(context);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.param.FeedParamProvider$a */
    public static final class C49809a {
        static {
            Covode.recordClassIndex(58915);
        }

        private C49809a() {
        }

        public /* synthetic */ C49809a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C49812b m93270a(Context context) {
            C89219l.m154721d(context, "");
            Activity a = C34729o.m70950a(context);
            Objects.requireNonNull(a, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            AbstractC1174ac a2 = C1181ae.m3881a((ActivityC0945e) a, (C1175ad.AbstractC1177b) null).mo3983a(FeedParamProvider.class);
            C89219l.m154716b(a2, "");
            C49812b bVar = ((FeedParamProvider) a2).f114582a;
            if (bVar == null) {
                return new C49812b();
            }
            return bVar;
        }
    }
}
