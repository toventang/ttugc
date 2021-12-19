package com.p2082ss.android.ugc.aweme.compliance.privacy.utils;

import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.agilelogger.ALog;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.C34480a;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39254n;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39256o;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39258q;
import com.p2082ss.android.ugc.aweme.compliance.privacy.data.C39659b;
import com.p2082ss.android.ugc.aweme.compliance.privacy.data.C39670f;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3728a.C68348f;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import java.util.Map;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.utils.a */
public final class C40043a {
    static {
        Covode.recordClassIndex(47810);
    }

    /* renamed from: a */
    public static final void m80999a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        ALog.m59865d(str, str2);
    }

    /* renamed from: a */
    public static final Map<String, C39256o> m80997a() {
        Map<String, C39256o> account;
        C39254n b = C39670f.m80555b();
        Map<String, C39256o> map = null;
        if (!(b == null || (account = b.getAccount()) == null)) {
            map = C89041ag.m154431d(account);
        }
        C39256o a = C39659b.m80537a(0, "group_chat");
        if (!(a == null || map == null)) {
            map.put("group_chat", a);
        }
        return map;
    }

    /* renamed from: a */
    public static final String m80993a(BaseResponse baseResponse) {
        String str;
        C89219l.m154721d(baseResponse, "");
        BaseResponse.ServerTimeExtra serverTimeExtra = baseResponse.extra;
        if (serverTimeExtra == null || (str = serverTimeExtra.logid) == null) {
            return "";
        }
        return str;
    }

    /* renamed from: b */
    public static final String m81001b(Throwable th) {
        int i;
        C89219l.m154721d(th, "");
        String stackTraceString = Log.getStackTraceString(th);
        C89219l.m154716b(stackTraceString, "");
        StringBuilder sb = new StringBuilder("error_code = ");
        if (th instanceof C34480a) {
            i = ((C34480a) th).getErrorCode();
        } else {
            i = -1;
        }
        return sb.append(String.valueOf(i)).append("\n").append(th.getMessage()).append("\n").append(stackTraceString).toString();
    }

    /* renamed from: a */
    public static final String m80994a(C39258q qVar) {
        C89219l.m154721d(qVar, "");
        String b = C80342dg.m139300a().mo46674b(qVar);
        C89219l.m154716b(b, "");
        return b;
    }

    /* renamed from: a */
    public static final String m80995a(C68348f fVar) {
        C89219l.m154721d(fVar, "");
        return "{'comment':" + fVar.f152996r + ", 'duet':" + fVar.f152997s + ", 'stitch':" + fVar.f152999u + ',' + "'download_setting':" + fVar.f153000v + ", 'chat_set':" + fVar.f152940C + ", 'group_chat':" + fVar.f152943F + ", 'favorite_permission':" + fVar.f152947J + ", 'comment_filter_status':" + fVar.f152952O + ", 'comment_offensive_filter':" + fVar.f152953P + ", 'author_review_all_comments':" + fVar.f152954Q + ", 'is_show_comment_settings':" + fVar.f152955R + ", 'sug_to_contacts':" + fVar.f152972ah + ", 'sug_to_fb_friends':" + fVar.f152973ai + ", 'sug_to_mutual_connections':" + fVar.f152974aj + ", 'sug_to_who_share_link':" + fVar.f152975ak + ", 'sug_to_interested_users':" + fVar.f152976al + ", 'following_visibility':" + fVar.f152977am + "}";
    }

    /* renamed from: a */
    public static final String m80996a(Throwable th) {
        BaseResponse.ServerTimeExtra serverTimeExtra;
        String str;
        C89219l.m154721d(th, "");
        if (!(th instanceof C34485a)) {
            return "";
        }
        Object rawResponse = ((C34485a) th).getRawResponse();
        if (!(rawResponse instanceof BaseResponse)) {
            rawResponse = null;
        }
        BaseResponse baseResponse = (BaseResponse) rawResponse;
        if (baseResponse == null || (serverTimeExtra = baseResponse.extra) == null || (str = serverTimeExtra.logid) == null) {
            return "";
        }
        return str;
    }

    /* renamed from: a */
    public static final C33743c m80990a(C33743c cVar, Object obj) {
        C89219l.m154721d(cVar, "");
        return m80992a(cVar, "restriction", obj);
    }

    /* renamed from: a */
    public static final C33743c m80991a(C33743c cVar, String str) {
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(str, "");
        C33743c a = cVar.mo59976a("msg", str);
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: b */
    public static final C33743c m81000b(C33743c cVar, String str) {
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(str, "");
        C33743c a = cVar.mo59976a("logId", str);
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: a */
    public static void m80998a(String str, AbstractC89172b<? super C33743c, ? extends C33743c> bVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(bVar, "");
        C33743c cVar = new C33743c();
        C89219l.m154716b(cVar, "");
        String jSONObject = ((C33743c) bVar.invoke(cVar)).mo59977a().toString();
        C89219l.m154716b(jSONObject, "");
        m80999a(str, jSONObject);
    }

    /* renamed from: a */
    public static final C33743c m80992a(C33743c cVar, String str, Object obj) {
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(str, "");
        if (obj == null) {
            return cVar;
        }
        if (obj instanceof Integer) {
            C33743c a = cVar.mo59974a(str, (Integer) obj);
            C89219l.m154716b(a, "");
            return a;
        } else if (obj instanceof Float) {
            C33743c a2 = cVar.mo59973a(str, (Float) obj);
            C89219l.m154716b(a2, "");
            return a2;
        } else if (obj instanceof Double) {
            C33743c a3 = cVar.mo59972a(str, (Double) obj);
            C89219l.m154716b(a3, "");
            return a3;
        } else if (obj instanceof Boolean) {
            C33743c a4 = cVar.mo59971a(str, (Boolean) obj);
            C89219l.m154716b(a4, "");
            return a4;
        } else if (obj instanceof String) {
            C33743c a5 = cVar.mo59976a(str, (String) obj);
            C89219l.m154716b(a5, "");
            return a5;
        } else if (obj instanceof Long) {
            C33743c a6 = cVar.mo59975a(str, (Long) obj);
            C89219l.m154716b(a6, "");
            return a6;
        } else {
            C33743c a7 = cVar.mo59976a(str, obj.toString());
            C89219l.m154716b(a7, "");
            return a7;
        }
    }
}
