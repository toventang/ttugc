package com.p2082ss.android.ugc.aweme.search.ecom.p3689b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AccountService;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.search.ecom.p3688a.C67394a;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67568r;
import com.p2082ss.android.ugc.aweme.search.p3705s.C67718a;
import com.p2082ss.android.ugc.aweme.search.p3705s.C67725e;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.search.ecom.b.c */
public final class C67404c {

    /* renamed from: a */
    public static final C67404c f151007a = new C67404c();

    private C67404c() {
    }

    static {
        Covode.recordClassIndex(79037);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static Map<String, String> m119440a(Map<String, String> map) {
        String str = "";
        C89219l.m154721d(map, str);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(map);
        Object remove = linkedHashMap.remove("enter_from");
        if (remove != 0) {
            str = remove;
        }
        linkedHashMap.put("enter_from_info", str);
        linkedHashMap.remove("page_name");
        linkedHashMap.put("source_page_type", "search");
        return linkedHashMap;
    }

    /* renamed from: a */
    public static Map<String, String> m119439a(User user, C67394a aVar, C67568r rVar) {
        Map<String, String> b = m119442b(user, aVar, rVar);
        String str = b.get("enter_from");
        if (str == null) {
            str = "";
        }
        b.put("page_name", str);
        b.put("entrance_form", "user_showcase_card");
        return b;
    }

    /* renamed from: a */
    public static Map<String, String> m119438a(Aweme aweme, C67394a aVar, C67568r rVar) {
        User user;
        String str;
        String str2;
        if (aweme != null) {
            user = aweme.getAuthor();
        } else {
            user = null;
        }
        Map<String, String> b = m119442b(user, aVar, rVar);
        String a = C67725e.m119892a(b.get("enter_from"));
        if (a != null) {
            b.put("enter_from", a);
        }
        String str3 = b.get("enter_from");
        if (str3 == null) {
            str3 = "";
        }
        b.put("page_name", str3);
        b.put("entrance_form", C67718a.m119883a(aweme));
        if (aweme == null || (str = aweme.getAid()) == null) {
            str = "";
        }
        b.put("group_id", str);
        b.put("is_single_anchor", C67718a.m119885b(aweme));
        if (C37699a.m76314s(aweme)) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        b.put("is_ad", str2);
        b.put("anchor_tag", "");
        return b;
    }

    /* renamed from: b */
    public static Map<String, String> m119441b(Aweme aweme, C67394a aVar, C67568r rVar) {
        User user;
        int i;
        String str;
        User author;
        C67394a.C67396b bVar;
        Long l = null;
        if (aweme != null) {
            user = aweme.getAuthor();
        } else {
            user = null;
        }
        Map<String, String> b = m119442b(user, aVar, rVar);
        String remove = b.remove("enter_from");
        if (remove == null) {
            remove = "";
        }
        if (aVar == null || (bVar = aVar.f150997m) == null) {
            i = 0;
        } else {
            i = bVar.f151000a;
        }
        if (!(aweme == null || (author = aweme.getAuthor()) == null)) {
            l = Long.valueOf(author.roomId);
        }
        b.put("room_id", String.valueOf(l));
        b.put("is_ad", "0");
        if (rVar == null || (str = rVar.f151315j) == null) {
            str = "";
        }
        b.put("request_id", str);
        b.put("enter_method", "");
        b.put("action_type", "");
        b.put("page_name", remove);
        b.put("enter_from_merge", remove);
        b.put("entrance_form", "search_live_merge_entrance");
        b.put("card_type", String.valueOf(i));
        return b;
    }

    /* renamed from: b */
    private static Map<String, String> m119442b(User user, C67394a aVar, C67568r rVar) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        int i;
        String str9;
        Integer num;
        String str10 = "";
        if (user == null || (str = user.getUid()) == null) {
            str = str10;
        }
        IAccountUserService e = AccountService.m65215a().mo57069e();
        C89219l.m154716b(e, str10);
        String curUserId = e.getCurUserId();
        C89378p[] pVarArr = new C89378p[10];
        pVarArr[0] = C89387v.m154943a("author_id", str);
        if (aVar == null || (num = aVar.f150994j) == null || (str2 = String.valueOf(num.intValue())) == null) {
            str2 = str10;
        }
        pVarArr[1] = C89387v.m154943a("product_source", str2);
        if (aVar == null || (str3 = aVar.f150995k) == null) {
            str3 = str10;
        }
        pVarArr[2] = C89387v.m154943a("source_from", str3);
        if (aVar == null || (str4 = aVar.f150996l) == null) {
            str4 = str10;
        }
        pVarArr[3] = C89387v.m154943a("source", str4);
        if (aVar == null || (str5 = aVar.f150985a) == null) {
            str5 = str10;
        }
        pVarArr[4] = C89387v.m154943a("product_id", str5);
        if (C89219l.m154714a((Object) str, (Object) curUserId)) {
            str6 = "1";
        } else {
            str6 = "0";
        }
        pVarArr[5] = C89387v.m154943a("is_self", str6);
        if (rVar == null || (str7 = rVar.f151314i) == null) {
            str7 = str10;
        }
        pVarArr[6] = C89387v.m154943a("search_id", str7);
        if (rVar == null || (str8 = rVar.f151319n) == null) {
            str8 = str10;
        }
        pVarArr[7] = C89387v.m154943a("search_result_id", str8);
        if (!(rVar == null || (str9 = rVar.f151312g) == null)) {
            str10 = str9;
        }
        pVarArr[8] = C89387v.m154943a("enter_from", str10);
        pVarArr[9] = C89387v.m154943a("EVENT_ORIGIN_FEATURE", "TEMAI");
        Map<String, String> b = C89041ag.m154427b(pVarArr);
        if (C89361p.m154872a(b.get("is_self"), "0", false)) {
            if (user != null) {
                i = user.getFollowStatus();
            } else {
                i = -1;
            }
            b.put("follow_status", String.valueOf(i));
        }
        return b;
    }
}
