package com.p2082ss.android.ugc.aweme.notification.view.template.p3533b;

import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.C61630e;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.p2082ss.android.ugc.aweme.notice.repo.list.p3517a.C61621c;
import com.p2082ss.android.ugc.aweme.notice.repo.list.p3517a.C61624f;
import com.p2082ss.android.ugc.aweme.notice.repo.p3515a.C61615a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import org.json.JSONObject;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.view.template.b.a */
public final class C62328a {
    static {
        Covode.recordClassIndex(73113);
    }

    /* renamed from: d */
    public static final User m112752d(MusNotice musNotice) {
        C61624f fVar;
        List<User> list;
        C89219l.m154721d(musNotice, "");
        C61621c cVar = musNotice.templateNotice.f139886b;
        if (cVar == null || (fVar = cVar.f139843d) == null || (list = fVar.f139866a) == null) {
            return null;
        }
        return (User) C89070n.m154583g((List) list);
    }

    /* renamed from: a */
    public static final C61615a m112749a(MusNotice musNotice) {
        C89219l.m154721d(musNotice, "");
        try {
            JSONObject b = m112750b(musNotice);
            if (b != null) {
                String optString = b.optString(StringSet.type);
                C89219l.m154716b(optString, "");
                String optString2 = b.optString("link_id");
                C89219l.m154716b(optString2, "");
                String optString3 = b.optString("item_id");
                C89219l.m154716b(optString3, "");
                return new C61615a(optString, optString2, optString3);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: b */
    public static final JSONObject m112750b(MusNotice musNotice) {
        JSONObject jSONObject;
        String str;
        C89219l.m154721d(musNotice, "");
        try {
            C61630e eVar = musNotice.templateNotice;
            if (eVar == null || (str = eVar.f139893i) == null) {
                jSONObject = new JSONObject();
            } else {
                jSONObject = new JSONObject(str);
            }
            return new JSONObject(jSONObject.optString("business_extra"));
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static final String m112751c(MusNotice musNotice) {
        JSONObject jSONObject;
        String str;
        C89219l.m154721d(musNotice, "");
        try {
            C61630e eVar = musNotice.templateNotice;
            if (eVar == null || (str = eVar.f139893i) == null) {
                jSONObject = new JSONObject();
            } else {
                jSONObject = new JSONObject(str);
            }
            return jSONObject.optString("account_type");
        } catch (Exception unused) {
            return null;
        }
    }
}
