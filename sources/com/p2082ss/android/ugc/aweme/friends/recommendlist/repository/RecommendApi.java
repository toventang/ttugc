package com.p2082ss.android.ugc.aweme.friends.recommendlist.repository;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.friends.model.MutualUserList;
import p4560f.p4561a.AbstractC88979t;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.friends.recommendlist.repository.RecommendApi */
public interface RecommendApi {

    /* renamed from: a */
    public static final C51599a f118905a = C51599a.f118906a;

    static {
        Covode.recordClassIndex(60940);
    }

    @AbstractC89722f(mo144276a = "/tiktok/v1/user/mutual/list/")
    AbstractC88979t<MutualUserList> getMutualList(@AbstractC89736t(mo144292a = "sec_uid") String str, @AbstractC89736t(mo144292a = "count") Integer num, @AbstractC89736t(mo144292a = "cursor") Integer num2, @AbstractC89736t(mo144292a = "mutual_type") Integer num3);

    /* renamed from: com.ss.android.ugc.aweme.friends.recommendlist.repository.RecommendApi$a */
    public static final class C51599a {

        /* renamed from: a */
        static final /* synthetic */ C51599a f118906a = new C51599a();

        private C51599a() {
        }

        static {
            Covode.recordClassIndex(60941);
        }
    }
}
