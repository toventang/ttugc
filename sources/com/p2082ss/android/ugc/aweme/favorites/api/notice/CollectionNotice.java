package com.p2082ss.android.ugc.aweme.favorites.api.notice;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import java.io.Serializable;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.favorites.api.notice.CollectionNotice */
public class CollectionNotice implements Serializable {
    @AbstractC27891c(mo46611a = "collect_notice")
    public ArrayList<C47199a> collectNoticeList;
    @AbstractC27891c(mo46611a = "status_code")
    public int statusCode;
    @AbstractC27891c(mo46611a = "status_msg")
    public String statusMsg;

    static {
        Covode.recordClassIndex(55809);
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.api.notice.CollectionNotice$a */
    static class C47199a implements Serializable {
        @AbstractC27891c(mo46611a = StringSet.type)

        /* renamed from: a */
        public int f109864a;
        @AbstractC27891c(mo46611a = "status")

        /* renamed from: b */
        public boolean f109865b;

        static {
            Covode.recordClassIndex(55810);
        }

        C47199a() {
        }
    }

    public boolean getMixStatus() {
        if (this.collectNoticeList == null) {
            return false;
        }
        for (int i = 0; i < this.collectNoticeList.size(); i++) {
            C47199a aVar = this.collectNoticeList.get(i);
            if (aVar.f109864a == 1) {
                return aVar.f109865b;
            }
        }
        return false;
    }
}
