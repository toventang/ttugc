package com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3139a;

import android.util.ArrayMap;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import java.util.List;
import java.util.Map;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89205ac;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.a.a */
public final class C54603a {

    /* renamed from: a */
    public static String f125151a = "";

    /* renamed from: b */
    public static String f125152b = "";

    /* renamed from: c */
    public static String f125153c = "";

    /* renamed from: d */
    public static int f125154d;

    /* renamed from: e */
    public static final C54603a f125155e = new C54603a();

    private C54603a() {
    }

    /* renamed from: c */
    public static void m100112c() {
        m100105a("choose_add_member", new C89378p[0]);
    }

    static {
        Covode.recordClassIndex(64316);
    }

    /* renamed from: a */
    public static void m100100a() {
        C39162r.m79462a("click_create_group", C89387v.m154943a(f125151a, "enter_from"));
    }

    /* renamed from: b */
    public static void m100108b() {
        C39162r.m79462a("choose_group_member", C89387v.m154943a(f125151a, "previous_page"), C89387v.m154943a("member_list", "enter_from"));
    }

    /* renamed from: d */
    public static void m100114d() {
        C39162r.m79462a("click_share_group_inv", C89387v.m154943a(f125153c, "conversation_id"), C89387v.m154943a(Integer.valueOf(f125154d), "is_master"), C89387v.m154943a(f125152b, "enter_method"));
    }

    /* renamed from: a */
    public static void m100107a(boolean z) {
        f125154d = z ? 1 : 0;
    }

    /* renamed from: a */
    public static void m100103a(String str) {
        C89219l.m154721d(str, "");
        f125151a = str;
    }

    /* renamed from: b */
    public static void m100109b(String str) {
        C89219l.m154721d(str, "");
        f125152b = str;
    }

    /* renamed from: a */
    public static /* synthetic */ void m100101a(int i) {
        C54605b bVar = C54605b.f125157a;
        C89219l.m154721d(bVar, "");
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put("conversation_id", f125153c);
        arrayMap.put("is_master", String.valueOf(f125154d));
        arrayMap.put("member_number", String.valueOf(i));
        arrayMap.put("enter_from", f125152b);
        bVar.invoke("send_group_env", arrayMap);
    }

    /* renamed from: b */
    public static void m100110b(List<String> list) {
        C89219l.m154721d(list, "");
        m100105a("finish_add_member", C89387v.m154943a(m100111c(list), "to_user_id_set"));
    }

    /* renamed from: c */
    private static String m100111c(List<String> list) {
        String str = "";
        if (list != null) {
            int i = 0;
            for (T t : list) {
                str = i == 0 ? t : str + ',' + ((String) t);
                i++;
            }
        }
        return str;
    }

    /* renamed from: c */
    public static void m100113c(String str) {
        C89219l.m154721d(str, "");
        C39162r.m79462a("choose_group_inv", C89387v.m154943a(f125153c, "conversation_id"), C89387v.m154943a(Integer.valueOf(f125154d), "is_master"), C89387v.m154943a(str, "member_type"), C89387v.m154943a(f125152b, "enter_from"));
    }

    /* renamed from: a */
    public static void m100106a(List<String> list) {
        C89219l.m154721d(list, "");
        C39162r.m79462a("finish_create_group", C89387v.m154943a(m100111c(list), "to_user_id_set"), C89387v.m154943a(f125151a, "enter_from"));
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.a.a$a */
    public static final /* synthetic */ class C54604a extends C89217j implements AbstractC89183m<String, Map<String, String>, C89391z> {

        /* renamed from: a */
        public static final C54604a f125156a = new C54604a();

        static {
            Covode.recordClassIndex(64317);
        }

        C54604a() {
            super(2, C39162r.class, "onEventV3", "onEventV3(Ljava/lang/String;Ljava/util/Map;)V", 0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(String str, Map<String, String> map) {
            C39162r.m79460a(str, map);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.a.a$b */
    public static final /* synthetic */ class C54605b extends C89217j implements AbstractC89183m<String, Map<String, String>, C89391z> {

        /* renamed from: a */
        public static final C54605b f125157a = new C54605b();

        static {
            Covode.recordClassIndex(64318);
        }

        C54605b() {
            super(2, C39162r.class, "onEventV3", "onEventV3(Ljava/lang/String;Ljava/util/Map;)V", 0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(String str, Map<String, String> map) {
            C39162r.m79460a(str, map);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static void m100105a(String str, C89378p<? extends Object, String>... pVarArr) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(pVarArr, "");
        C89205ac acVar = new C89205ac(3);
        acVar.mo143594a((Object) pVarArr);
        acVar.mo143596b(C89387v.m154943a(f125153c, "conversation_id"));
        acVar.mo143596b(C89387v.m154943a(Integer.valueOf(f125154d), "is_master"));
        C39162r.m79462a(str, (C89378p[]) acVar.mo143595a((Object[]) new C89378p[acVar.f202887a.size()]));
    }

    /* renamed from: a */
    public static void m100104a(String str, String str2, String str3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        m100105a("click_report", C89387v.m154943a(str, "enter_from"), C89387v.m154943a(str2, "object_id"), C89387v.m154943a(str3, "object_type"));
    }

    /* renamed from: a */
    public static /* synthetic */ void m100102a(int i, C19638h hVar, String str, List list) {
        String str2;
        int i2;
        C54604a aVar = C54604a.f125156a;
        C89219l.m154721d(str, "");
        C89219l.m154721d(aVar, "");
        String str3 = null;
        if (list != null) {
            str2 = m100111c(list);
        } else {
            str2 = null;
        }
        if (hVar != null) {
            i2 = hVar.getMemberCount();
        } else {
            i2 = 0;
        }
        C33744d a = new C33744d().mo59983a("enter_from", f125151a).mo59980a("chat_num", i2).mo59983a(StringSet.type, str);
        if (hVar != null) {
            str3 = hVar.getConversationId();
        }
        C33744d a2 = a.mo59983a("conversation_id", str3).mo59980a("error_code", i);
        if (str2 != null) {
            a2.mo59983a("to_user_id_set", str2);
        }
        Map<String, String> map = a2.f79943a;
        C89219l.m154716b(map, "");
        aVar.invoke("create_chat", map);
    }
}
