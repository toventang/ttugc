package com.p2082ss.android.ugc.aweme.notification.view.template;

import android.text.TextUtils;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.C61630e;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.p2082ss.android.ugc.aweme.notice.repo.list.p3517a.C61621c;
import com.p2082ss.android.ugc.aweme.notice.repo.list.p3517a.C61622d;
import com.p2082ss.android.ugc.aweme.notice.repo.p3515a.C61616b;
import com.p2082ss.android.ugc.aweme.notification.view.template.p3533b.C62328a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.view.template.e */
public final class C62340e {

    /* renamed from: a */
    public static final C62340e f141473a = new C62340e();

    private C62340e() {
    }

    static {
        Covode.recordClassIndex(73125);
    }

    /* renamed from: b */
    public static boolean m112764b(MusNotice musNotice) {
        Boolean bool;
        C61621c cVar;
        List<C61622d> list;
        C61630e eVar = musNotice.templateNotice;
        if (eVar == null || (cVar = eVar.f139886b) == null || (list = cVar.f139856q) == null) {
            bool = null;
        } else {
            bool = Boolean.valueOf(!list.isEmpty());
        }
        return C11279p.m20012a(bool);
    }

    /* renamed from: a */
    public static int m112762a(MusNotice musNotice) {
        String str;
        String str2 = "";
        C89219l.m154721d(musNotice, str2);
        try {
            JSONObject b = C62328a.m112750b(musNotice);
            Integer num = null;
            if (b != null) {
                str = b.optString(StringSet.type);
            } else {
                str = null;
            }
            User d = C62328a.m112752d(musNotice);
            if (d != null) {
                num = Integer.valueOf(d.getFollowStatus());
            }
            if (TextUtils.equals(str, "video_link")) {
                User d2 = C62328a.m112752d(musNotice);
                if (d2 != null) {
                    String uid = d2.getUid();
                    if (uid != null) {
                        str2 = uid;
                    }
                    C61616b.m111628a(str2, C62328a.m112749a(musNotice));
                }
                if (num != null && num.intValue() == 0) {
                    return 0;
                }
                return 8;
            } else if (TextUtils.equals(str, "video_sharer")) {
                User d3 = C62328a.m112752d(musNotice);
                if (d3 == null) {
                    return 8;
                }
                String uid2 = d3.getUid();
                if (uid2 != null) {
                    str2 = uid2;
                }
                C61616b.m111628a(str2, C62328a.m112749a(musNotice));
                return 8;
            } else if (!m112764b(musNotice)) {
                return 8;
            }
            return 0;
        } catch (Exception unused) {
            return 8;
        }
    }

    /* renamed from: a */
    public static boolean m112763a(MusNotice musNotice, String str) {
        try {
            JSONObject b = C62328a.m112750b(musNotice);
            if (b == null || !TextUtils.equals(str, b.optString(StringSet.type))) {
                return false;
            }
            return true;
        } catch (Exception unused) {
        }
    }
}
