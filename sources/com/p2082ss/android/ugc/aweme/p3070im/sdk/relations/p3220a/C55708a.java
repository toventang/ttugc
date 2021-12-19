package com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3220a;

import androidx.p025c.C0484a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17427b;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMConversation;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.aweme.utils.C80408et;
import java.util.Map;
import org.json.JSONObject;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.a */
public final class C55708a {

    /* renamed from: a */
    public static final C55708a f127082a = new C55708a();

    private C55708a() {
    }

    static {
        Covode.recordClassIndex(65494);
    }

    /* renamed from: a */
    private static String m101450a(IMContact iMContact) {
        if (iMContact instanceof IMUser) {
            return "private";
        }
        if (!(iMContact instanceof IMConversation)) {
            return "";
        }
        IMConversation iMConversation = (IMConversation) iMContact;
        if (iMConversation.getConversationType() == 1) {
            return "private";
        }
        if (iMConversation.getConversationType() == 2) {
            return "group";
        }
        return "";
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.a$a */
    public static final /* synthetic */ class C55709a extends C89217j implements AbstractC89183m<String, JSONObject, C89391z> {

        /* renamed from: a */
        public static final C55709a f127083a = new C55709a();

        static {
            Covode.recordClassIndex(65495);
        }

        C55709a() {
            super(2, C39162r.class, "onEventV3", "onEventV3(Ljava/lang/String;Lorg/json/JSONObject;)V", 0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(String str, JSONObject jSONObject) {
            C39162r.m79461a(str, jSONObject);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.a$b */
    public static final /* synthetic */ class C55710b extends C89217j implements AbstractC89183m<String, Map<String, String>, C89391z> {

        /* renamed from: a */
        public static final C55710b f127084a = new C55710b();

        static {
            Covode.recordClassIndex(65496);
        }

        C55710b() {
            super(2, C39162r.class, "onEventV3", "onEventV3(Ljava/lang/String;Ljava/util/Map;)V", 0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(String str, Map<String, String> map) {
            C39162r.m79460a(str, map);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.a$c */
    public static final /* synthetic */ class C55711c extends C89217j implements AbstractC89183m<String, Map<String, String>, C89391z> {

        /* renamed from: a */
        public static final C55711c f127085a = new C55711c();

        static {
            Covode.recordClassIndex(65497);
        }

        C55711c() {
            super(2, C39162r.class, "onEventV3", "onEventV3(Ljava/lang/String;Ljava/util/Map;)V", 0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(String str, Map<String, String> map) {
            C39162r.m79460a(str, map);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static String m101451a(String str, long j) {
        C89219l.m154721d(str, "");
        return C80408et.m139388a(str + j);
    }

    /* renamed from: a */
    private static void m101456a(Map<String, String> map, IMContact iMContact) {
        if (iMContact == null) {
            map.put("to_user_id", "null");
            map.put("conversation_id", "null");
        } else if (iMContact instanceof IMUser) {
            IMUser iMUser = (IMUser) iMContact;
            map.put("to_user_id", iMUser.getUid());
            String uid = iMUser.getUid();
            C89219l.m154716b(uid, "");
            map.put("conversation_id", AbstractC17427b.C17428a.m32309a(Long.parseLong(uid)));
        } else if (iMContact instanceof IMConversation) {
            map.put("conversation_id", ((IMConversation) iMContact).getConversationId());
            map.put("to_user_id", "null");
        }
    }

    /* renamed from: a */
    private static Map<String, String> m101452a(SharePackage sharePackage, IMContact iMContact, boolean z, long j) {
        String str;
        C0484a aVar = new C0484a();
        m101456a(aVar, iMContact);
        aVar.put("live_event_id", sharePackage.f155492i.getString("live_event_id"));
        aVar.put("author_id", sharePackage.f155492i.getString("live_event_author_id"));
        String str2 = "0";
        aVar.put("is_anchor", sharePackage.f155492i.getString("live_event_is_anchor", str2));
        aVar.put("chat_type", m101450a(iMContact));
        if (z) {
            str = "chat_merge";
        } else {
            str = "chat_head";
        }
        aVar.put("platform", str);
        aVar.put("enter_from", sharePackage.f155492i.getString("enter_from", ""));
        if (!sharePackage.f155492i.getBoolean("is_paid_event", false)) {
            str2 = "1";
        }
        aVar.put("is_free_event", str2);
        if (iMContact == null) {
            aVar.put("follow_status", "null");
        } else if (iMContact instanceof IMUser) {
            aVar.put("follow_status", String.valueOf(((IMUser) iMContact).getFollowStatus()));
        }
        aVar.put("bind_id", m101451a("livesdk_live_event_share", j));
        return aVar;
    }

    /* renamed from: a */
    public static void m101455a(String str, SharePackage sharePackage, IMContact iMContact, boolean z, long j, AbstractC89183m<? super String, ? super Map<String, String>, C89391z> mVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(sharePackage, "");
        C89219l.m154721d(mVar, "");
        mVar.invoke(str, m101452a(sharePackage, iMContact, z, j));
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x0391  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x03ae A[Catch:{ JSONException -> 0x03f1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0470 A[Catch:{ JSONException -> 0x0813 }] */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0487 A[Catch:{ JSONException -> 0x0813 }] */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x04a8 A[Catch:{ JSONException -> 0x0813 }] */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x04b7 A[Catch:{ JSONException -> 0x0813 }] */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0513 A[Catch:{ JSONException -> 0x0813 }] */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0560 A[Catch:{ JSONException -> 0x0813 }] */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0571 A[Catch:{ JSONException -> 0x0813 }] */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0582 A[Catch:{ JSONException -> 0x0813 }] */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x05a8 A[Catch:{ JSONException -> 0x0813 }] */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x05be A[Catch:{ JSONException -> 0x0813 }] */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x05c0 A[Catch:{ JSONException -> 0x0813 }] */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x0659 A[Catch:{ JSONException -> 0x0813 }] */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x065b A[Catch:{ JSONException -> 0x0813 }] */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x0663 A[Catch:{ JSONException -> 0x0813 }] */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x0674 A[Catch:{ JSONException -> 0x0813 }] */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x0685 A[Catch:{ JSONException -> 0x0813 }] */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x0696 A[Catch:{ JSONException -> 0x0813 }] */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x06a5 A[Catch:{ JSONException -> 0x0813 }] */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x06ab A[Catch:{ JSONException -> 0x0813 }] */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x06f4 A[Catch:{ JSONException -> 0x0811 }] */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x070b A[Catch:{ JSONException -> 0x0811 }] */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x0720 A[Catch:{ JSONException -> 0x0811 }] */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x0769 A[Catch:{ JSONException -> 0x0811 }] */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x078f A[Catch:{ JSONException -> 0x0811 }] */
    /* JADX WARNING: Removed duplicated region for block: B:277:0x07c6 A[Catch:{ JSONException -> 0x0811 }] */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x07e4 A[Catch:{ JSONException -> 0x0811 }] */
    /* JADX WARNING: Removed duplicated region for block: B:297:0x0825  */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x083b A[Catch:{ JSONException -> 0x0870 }] */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x084a A[Catch:{ JSONException -> 0x0870 }] */
    /* JADX WARNING: Removed duplicated region for block: B:314:0x087a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void m101453a(com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3220a.C55708a r28, com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage r29, com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact r30, boolean r31, java.lang.String r32, long r33, p4600h.p4611f.p4612a.AbstractC89183m r35, p4600h.p4611f.p4612a.AbstractC89183m r36, int r37) {
        /*
        // Method dump skipped, instructions count: 2242
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3220a.C55708a.m101453a(com.ss.android.ugc.aweme.im.sdk.relations.a.a, com.ss.android.ugc.aweme.sharer.ui.SharePackage, com.ss.android.ugc.aweme.im.service.model.IMContact, boolean, java.lang.String, long, h.f.a.m, h.f.a.m, int):void");
    }
}
