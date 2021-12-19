package com.p2082ss.android.ugc.aweme.recommend;

import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.recommend.RecommendUsersDialogViewModel */
public final class RecommendUsersDialogViewModel extends AbstractC1174ac {

    /* renamed from: c */
    public static final C66613a f149744c = new C66613a((byte) 0);

    /* renamed from: a */
    public final C1213t<Boolean> f149745a = new C1213t<>();

    /* renamed from: b */
    public final C1213t<Boolean> f149746b = new C1213t<>();

    static {
        Covode.recordClassIndex(78169);
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.RecommendUsersDialogViewModel$a */
    public static final class C66613a {
        static {
            Covode.recordClassIndex(78170);
        }

        private C66613a() {
        }

        public /* synthetic */ C66613a(byte b) {
            this();
        }

        /* renamed from: a */
        public static RecommendUsersDialogViewModel m118371a(ActivityC0945e eVar) {
            C89219l.m154721d(eVar, "");
            AbstractC1174ac a = C1181ae.m3881a(eVar, (C1175ad.AbstractC1177b) null).mo3983a(RecommendUsersDialogViewModel.class);
            C89219l.m154716b(a, "");
            return (RecommendUsersDialogViewModel) a;
        }
    }

    /* renamed from: a */
    public final boolean mo105622a() {
        Boolean value = this.f149745a.getValue();
        if (value == null || C89219l.m154714a((Object) value, (Object) true)) {
            return true;
        }
        return false;
    }
}
