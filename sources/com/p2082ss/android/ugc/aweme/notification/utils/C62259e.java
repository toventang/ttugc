package com.p2082ss.android.ugc.aweme.notification.utils;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.friends.service.C51648a;
import com.p2082ss.android.ugc.aweme.inbox.EnumC56508r;
import com.p2082ss.android.ugc.aweme.metrics.C59256u;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.C61630e;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.CombineLiveNotice;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.p2082ss.android.ugc.aweme.notice.repo.list.p3517a.C61621c;
import com.p2082ss.android.ugc.aweme.notice.repo.list.p3517a.C61624f;
import com.p2082ss.android.ugc.aweme.notification.bean.LiveMessage;
import com.p2082ss.android.ugc.aweme.notification.bean.LiveNoticeMessageResponse;
import com.p2082ss.android.ugc.aweme.notification.p3523e.C61994d;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.utils.C80409eu;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONObject;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.utils.e */
public final class C62259e {
    static {
        Covode.recordClassIndex(73033);
    }

    /* renamed from: a */
    public static final void m112620a(String str, EnumC56508r rVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(rVar, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", "notification_page");
        linkedHashMap.put("is_auth", "0");
        linkedHashMap.put("platform", "contact");
        String str2 = "on";
        linkedHashMap.put("did_status", C51648a.f118980a.mo87322d().mo86983b() ? str2 : "unknown");
        if (!C51648a.f118980a.mo87322d().mo86982a()) {
            str2 = "off";
        }
        linkedHashMap.put("uid_status", str2);
        linkedHashMap.put("position", rVar == EnumC56508r.TOP ? "top" : "bottom");
        C39162r.m79460a(str, linkedHashMap);
    }

    /* renamed from: a */
    public static final void m112622a(String str, String str2, String str3, User user, String str4) {
        JSONObject jSONObject;
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        if (str4 != null) {
            jSONObject = new JSONObject(str4);
        } else {
            jSONObject = new JSONObject();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> keys = jSONObject.keys();
        C89219l.m154716b(keys, "");
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                if (C89219l.m154714a((Object) next, (Object) "business_extra")) {
                    JSONObject jSONObject2 = new JSONObject(jSONObject.optString(next));
                    Iterator<String> keys2 = jSONObject2.keys();
                    C89219l.m154716b(keys2, "");
                    while (keys2.hasNext()) {
                        String next2 = keys2.next();
                        C89219l.m154716b(next2, "");
                        String optString = jSONObject2.optString(next2);
                        C89219l.m154716b(optString, "");
                        linkedHashMap.put(next2, optString);
                    }
                } else if (!linkedHashMap.containsKey(next)) {
                    C89219l.m154716b(next, "");
                    String optString2 = jSONObject.optString(next);
                    C89219l.m154716b(optString2, "");
                    linkedHashMap.put(next, optString2);
                }
                C89379q.m157068constructorimpl(C89391z.f203057a);
            } catch (Throwable th) {
                C89379q.m157068constructorimpl(C89382r.m154941a(th));
            }
        }
        m112623a(str, str2, str3, user, linkedHashMap);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0019, code lost:
        if (r7.getFollowerStatus() != 0) goto L_0x001b;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m112623a(java.lang.String r4, java.lang.String r5, java.lang.String r6, com.p2082ss.android.ugc.aweme.profile.model.User r7, java.util.Map<java.lang.String, java.lang.String> r8) {
        /*
        // Method dump skipped, instructions count: 184
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.notification.utils.C62259e.m112623a(java.lang.String, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.profile.model.User, java.util.Map):void");
    }

    /* renamed from: a */
    public static final void m112619a(String str, int i, String str2, int i2, String str3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C39162r.m79460a("notification_message_inner_message", new C33744d().mo59983a("action_type", "show").mo59983a("account_type", str).mo59983a("client_order", String.valueOf(i)).mo59983a("tab_name", C62261f.m112632a(Integer.valueOf(i2))).mo59983a("timeline", str2).mo59983a("template_id", str3).mo59983a("scene_id", "1002").f79943a);
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.utils.e$a */
    static final class C62260a extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ MusNotice f141309a;

        /* renamed from: b */
        final /* synthetic */ BaseResponse f141310b;

        /* renamed from: c */
        final /* synthetic */ Throwable f141311c;

        static {
            Covode.recordClassIndex(73034);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62260a(MusNotice musNotice, BaseResponse baseResponse, Throwable th) {
            super(0);
            this.f141309a = musNotice;
            this.f141310b = baseResponse;
            this.f141311c = th;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0073, code lost:
            if (r0 != null) goto L_0x0078;
         */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ p4600h.C89391z invoke() {
            /*
            // Method dump skipped, instructions count: 150
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.notification.utils.C62259e.C62260a.invoke():java.lang.Object");
        }
    }

    /* renamed from: a */
    public static final int m112610a(User user) {
        if (user.getFollowStatus() == 0 && user.getFollowerStatus() == 1) {
            return 3;
        }
        return user.getFollowStatus();
    }

    /* renamed from: b */
    public static final void m112625b(String str) {
        C89219l.m154721d(str, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("tab_name", str);
        C39162r.m79460a("click_notification_tab", linkedHashMap);
    }

    /* renamed from: a */
    public static final void m112611a(EnumC56508r rVar) {
        String str;
        C89219l.m154721d(rVar, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", "notification_page");
        linkedHashMap.put("platform", "contact");
        linkedHashMap.put("enter_method", "long_press");
        if (rVar == EnumC56508r.TOP) {
            str = "top";
        } else {
            str = "bottom";
        }
        linkedHashMap.put("position", str);
        C39162r.m79460a("authorize_card_close", linkedHashMap);
    }

    /* renamed from: c */
    public static final void m112629c(String str) {
        C89219l.m154721d(str, "");
        C39162r.m79460a("click_see_all_activities", new C33744d().mo59983a("enter_from", "notification_page").mo59983a("tab_name", str).mo59983a("notice_type", "all").mo59980a("show_cnt", 0).f79943a);
    }

    /* renamed from: a */
    public static final void m112612a(MusNotice musNotice) {
        User user;
        JSONObject jSONObject;
        String str;
        C61621c cVar;
        C61624f fVar;
        List<User> list;
        C89219l.m154721d(musNotice, "");
        C59256u uVar = new C59256u();
        uVar.f135352b = C59256u.EnumC59257a.CLOSE;
        C59256u a = uVar.mo96834a("notification_page");
        a.f135350a = C59256u.EnumC59259c.INBOX_NOTICE;
        C61630e eVar = musNotice.templateNotice;
        if (eVar == null || (cVar = eVar.f139886b) == null || (fVar = cVar.f139843d) == null || (list = fVar.f139866a) == null) {
            user = null;
        } else {
            user = (User) C89070n.m154583g((List) list);
        }
        C59256u a2 = a.mo96832a(user);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C61630e eVar2 = musNotice.templateNotice;
        if (eVar2 == null || (str = eVar2.f139893i) == null) {
            jSONObject = new JSONObject();
        } else {
            jSONObject = new JSONObject(str);
        }
        Iterator<String> keys = jSONObject.keys();
        C89219l.m154716b(keys, "");
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                if (C89219l.m154714a((Object) next, (Object) "business_extra")) {
                    JSONObject jSONObject2 = new JSONObject(jSONObject.optString(next));
                    Iterator<String> keys2 = jSONObject2.keys();
                    C89219l.m154716b(keys2, "");
                    while (keys2.hasNext()) {
                        String next2 = keys2.next();
                        C89219l.m154716b(next2, "");
                        String optString = jSONObject2.optString(next2);
                        C89219l.m154716b(optString, "");
                        linkedHashMap.put(next2, optString);
                    }
                } else if (!linkedHashMap.containsKey(next)) {
                    C89219l.m154716b(next, "");
                    String optString2 = jSONObject.optString(next);
                    C89219l.m154716b(optString2, "");
                    linkedHashMap.put(next, optString2);
                }
                C89379q.m157068constructorimpl(C89391z.f203057a);
            } catch (Throwable th) {
                C89379q.m157068constructorimpl(C89382r.m154941a(th));
            }
        }
        a2.mo96788a(linkedHashMap).mo96792f();
    }

    /* renamed from: a */
    public static final void m112618a(String str) {
        C89219l.m154721d(str, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("to_tab_name", str);
        C39162r.m79460a("change_notification_tab", linkedHashMap);
    }

    /* renamed from: b */
    public static final void m112627b(String str, EnumC56508r rVar) {
        String str2;
        C89219l.m154721d(str, "");
        C89219l.m154721d(rVar, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", "notification_page");
        linkedHashMap.put("platform", str);
        if (rVar == EnumC56508r.TOP) {
            str2 = "top";
        } else {
            str2 = "bottom";
        }
        linkedHashMap.put("position", str2);
        C39162r.m79460a("invitation_card_show", linkedHashMap);
    }

    /* renamed from: a */
    public static final void m112614a(LiveNoticeMessageResponse liveNoticeMessageResponse, long j) {
        int i;
        LiveMessage liveMessage;
        List<CombineLiveNotice> list;
        C33744d dVar = new C33744d();
        if (liveNoticeMessageResponse == null || (liveMessage = liveNoticeMessageResponse.liveMessage) == null || (list = liveMessage.liveNotice) == null) {
            i = 0;
        } else {
            i = list.size();
        }
        C39162r.m79460a("livesdk_live_request_response", dVar.mo59980a("room_num", i).mo59981a("duration", j).mo59983a("enter_from_merge", "message").mo59983a("enter_method", "live_cell").mo59983a("action_type", "click").mo59983a("request_api", "/aweme/janus/v1/notice/multi/feed/").f79943a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x00b1 A[Catch:{ Exception -> 0x00d6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00c5 A[Catch:{ Exception -> 0x00d6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00d2 A[Catch:{ Exception -> 0x00d6 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m112615a(com.p2082ss.android.ugc.aweme.notification.bean.C61871f r12, int r13) {
        /*
        // Method dump skipped, instructions count: 219
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.notification.utils.C62259e.m112615a(com.ss.android.ugc.aweme.notification.bean.f, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        if (r4.getFollowerStatus() != 0) goto L_0x0012;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m112617a(com.p2082ss.android.ugc.aweme.profile.model.User r4, java.util.Map<java.lang.String, java.lang.String> r5) {
        /*
        // Method dump skipped, instructions count: 157
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.notification.utils.C62259e.m112617a(com.ss.android.ugc.aweme.profile.model.User, java.util.Map):void");
    }

    /* renamed from: a */
    public static final void m112613a(MusNotice musNotice, BaseResponse baseResponse, Throwable th) {
        C89219l.m154721d(musNotice, "");
        C61994d.m112123b(new C62260a(musNotice, baseResponse, th));
    }

    /* renamed from: b */
    public static final void m112624b(User user, Integer num, String str) {
        C89219l.m154721d(user, "");
        C89219l.m154721d(str, "");
        C39162r.m79460a("close_recommend_user_cell", new C33744d().mo59983a("enter_from", "notification_page").mo59983a("rec_type", user.getRecType()).mo59983a("rec_uid", user.getUid()).mo59982a("impr_order", num).mo59983a("tab_name", str).mo59983a("relation_type", user.getFriendTypeStr()).mo59983a("req_id", user.getRequestId()).f79943a);
        C59256u a = new C59256u().mo96834a("notification_page");
        a.f135350a = C59256u.EnumC59259c.CARD;
        a.f135352b = C59256u.EnumC59257a.CLOSE;
        a.mo96832a(user).mo96841s(user.getRequestId()).mo96792f();
    }

    /* renamed from: c */
    public static final void m112628c(User user, Integer num, String str) {
        String str2;
        String str3;
        C59256u.EnumC59257a aVar;
        C89219l.m154721d(user, "");
        C89219l.m154721d(str, "");
        if (user.getFollowerStatus() == 1) {
            str2 = "mutual";
        } else {
            str2 = "single";
        }
        if (user.getFollowStatus() == 0) {
            str3 = "follow";
        } else {
            str3 = "follow_cancel";
        }
        C39162r.m79460a(str3, new C33744d().mo59983a("enter_method", "follow_button").mo59983a("enter_from", "notification_page").mo59983a("rec_type", user.getRecType()).mo59983a("to_user_id", user.getUid()).mo59982a("impr_order", num).mo59983a("tab_name", str).mo59983a("req_id", user.getRequestId()).mo59983a("relation_type", user.getFriendTypeStr()).mo59983a("follow_type", str2).f79943a);
        C59256u a = new C59256u().mo96834a("notification_page");
        a.f135350a = C59256u.EnumC59259c.CARD;
        if (user.getFollowStatus() == 0) {
            aVar = C59256u.EnumC59257a.FOLLOW;
        } else {
            aVar = C59256u.EnumC59257a.FOLLOW_CANCEL;
        }
        a.f135352b = aVar;
        a.mo96832a(user).mo96841s(user.getRequestId()).mo96792f();
    }

    /* renamed from: d */
    public static final void m112630d(User user, Integer num, String str) {
        C89219l.m154721d(user, "");
        C89219l.m154721d(str, "");
        C33744d a = new C33744d().mo59983a("enter_from", "notification_page").mo59983a("rec_type", user.getRecType()).mo59983a("to_user_id", user.getUid()).mo59982a("impr_order", num).mo59983a("tab_name", str).mo59983a("req_id", user.getRequestId()).mo59983a("impr_id", user.getUid()).mo59983a("relation_type", user.getFriendTypeStr()).mo59980a("follow_status", user.getFollowStatus());
        C89219l.m154716b(a, "");
        C39162r.m79460a("enter_personal_detail", C80409eu.m139390a(a, user).f79943a);
        C59256u a2 = new C59256u().mo96834a("notification_page");
        a2.f135350a = C59256u.EnumC59259c.CARD;
        a2.f135352b = C59256u.EnumC59257a.ENTER_PROFILE;
        a2.mo96832a(user).mo96841s(user.getRequestId()).mo96792f();
    }

    /* renamed from: a */
    public static final void m112616a(User user, Integer num, String str) {
        C89219l.m154721d(user, "");
        C89219l.m154721d(str, "");
        C39162r.m79460a("show_recommend_user_cell", new C33744d().mo59983a("enter_from", "notification_page").mo59983a("rec_type", user.getRecType()).mo59983a("rec_uid", user.getUid()).mo59982a("impr_order", num).mo59983a("tab_name", str).mo59983a("req_id", user.getRequestId()).mo59983a("button_type", C62265i.m112641a(null, user)).mo59983a("relation_type", user.getFriendTypeStr()).f79943a);
        C59256u a = new C59256u().mo96834a("notification_page");
        a.f135350a = C59256u.EnumC59259c.CARD;
        a.f135352b = C59256u.EnumC59257a.SHOW;
        a.mo96832a(user).mo96841s(user.getRequestId()).mo96792f();
    }
}
