package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3079a;

import androidx.p025c.C0484a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17420a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.MobClick;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3171b.C55058a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3171b.C55059b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55076b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.p3198a.p3199a.C55339a;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56245a;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.a.e */
public final class C53622e {

    /* renamed from: a */
    public static final C53622e f123047a = new C53622e();

    private C53622e() {
    }

    static {
        Covode.recordClassIndex(63202);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.a.e$c */
    static final /* synthetic */ class C53625c extends C89217j implements AbstractC89172b<Map<String, ? extends String>, C89391z> {
        static {
            Covode.recordClassIndex(63205);
        }

        C53625c(C53622e eVar) {
            super(1, eVar, C53622e.class, "monitorMsgSendStatus", "monitorMsgSendStatus(Ljava/util/Map;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: com.ss.android.ugc.aweme.im.service.e */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Map<String, ? extends String> map) {
            Map<String, ? extends String> map2 = map;
            C89219l.m154721d(map2, "");
            C55076b.m100723b().monitorMsgSendStatus(map2);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.a.e$a */
    public static final /* synthetic */ class C53623a extends C89217j implements AbstractC89183m<String, Map<String, String>, C89391z> {

        /* renamed from: a */
        public static final C53623a f123048a = new C53623a();

        static {
            Covode.recordClassIndex(63203);
        }

        C53623a() {
            super(2, C39162r.class, "onEventV3", "onEventV3(Ljava/lang/String;Ljava/util/Map;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(String str, Map<String, String> map) {
            C39162r.m79460a(str, map);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.a.e$b */
    public static final /* synthetic */ class C53624b extends C89217j implements AbstractC89183m<String, Map<String, String>, C89391z> {

        /* renamed from: a */
        public static final C53624b f123049a = new C53624b();

        static {
            Covode.recordClassIndex(63204);
        }

        C53624b() {
            super(2, C39162r.class, "onEventV3", "onEventV3(Ljava/lang/String;Ljava/util/Map;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(String str, Map<String, String> map) {
            C39162r.m79460a(str, map);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.a.e$d */
    static final /* synthetic */ class C53626d extends C89217j implements AbstractC89183m<String, Map<String, String>, C89391z> {

        /* renamed from: a */
        public static final C53626d f123050a = new C53626d();

        static {
            Covode.recordClassIndex(63206);
        }

        C53626d() {
            super(2, C39162r.class, "onEventV3", "onEventV3(Ljava/lang/String;Ljava/util/Map;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(String str, Map<String, String> map) {
            C39162r.m79460a(str, map);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static void m98868a(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("source_type", str2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C39162r.onEvent(MobClick.obtain().setEventName("enter_chat").setLabelName("message").setValue(str).setJsonObject(jSONObject));
    }

    /* renamed from: a */
    public static /* synthetic */ void m98865a(C56245a aVar, String str, int i) {
        String a = C55058a.m100681a();
        AbstractC17420a a2 = AbstractC17420a.C17421a.m32276a();
        C53624b bVar = C53624b.f123049a;
        String str2 = "";
        C89219l.m154721d(aVar, str2);
        C89219l.m154721d(str, str2);
        C89219l.m154721d(a, str2);
        C89219l.m154721d(a2, str2);
        C89219l.m154721d(bVar, str2);
        C0484a aVar2 = new C0484a();
        String groupId = aVar.getGroupId();
        if (groupId == null) {
            groupId = str2;
        }
        aVar2.put("group_id", groupId);
        aVar2.put("follow_status", String.valueOf(aVar.getFollowStatus()));
        String storyType = aVar.getStoryType();
        if (storyType == null) {
            storyType = str2;
        }
        aVar2.put("story_type", storyType);
        String storyCollectionId = aVar.getStoryCollectionId();
        if (storyCollectionId != null) {
            str2 = storyCollectionId;
        }
        aVar2.put("story_collection_id", str2);
        m98866a(aVar, str, i, a, aVar2, a2, bVar);
    }

    /* renamed from: a */
    public static /* synthetic */ void m98867a(C56245a aVar, String str, String str2, int i, AbstractC17420a aVar2, AbstractC89183m mVar, int i2) {
        String str3 = str2;
        int i3 = i;
        AbstractC17420a aVar3 = aVar2;
        AbstractC89183m mVar2 = mVar;
        if ((i2 & 4) != 0) {
            str3 = C55058a.m100681a();
        }
        if ((i2 & 8) != 0) {
            i3 = -1;
        }
        if ((i2 & 16) != 0) {
            aVar3 = AbstractC17420a.C17421a.m32276a();
        }
        if ((i2 & 32) != 0) {
            mVar2 = C53623a.f123048a;
        }
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(aVar3, "");
        C89219l.m154721d(mVar2, "");
        m98866a(aVar, str, i3, str3, new C0484a(), aVar3, mVar2);
    }

    /* renamed from: a */
    private static void m98866a(C56245a aVar, String str, int i, String str2, Map<String, String> map, AbstractC17420a aVar2, AbstractC89183m<? super String, ? super Map<String, String>, C89391z> mVar) {
        String userId;
        String str3;
        String sessionId = aVar.getSessionId();
        String str4 = "";
        if (sessionId == null) {
            sessionId = str4;
        }
        String enterFromForMob = aVar.getEnterFromForMob();
        if (enterFromForMob == null) {
            enterFromForMob = str4;
        }
        String enterMethodForMob = aVar.getEnterMethodForMob();
        if (enterMethodForMob == null) {
            enterMethodForMob = str4;
        }
        String enterFromSubPage = aVar.getEnterFromSubPage();
        String buttonType = aVar.getButtonType();
        map.put("conversation_id", sessionId);
        if (!C89219l.m154714a((Object) str, (Object) "group") && (userId = aVar.getUserId()) != null) {
            str4 = userId;
        }
        map.put("to_user_id", str4);
        map.put("chat_type", str);
        map.put("enter_method", enterMethodForMob);
        map.put("enter_from", enterFromForMob);
        if (enterFromSubPage != null) {
            map.put("sub_page", enterFromSubPage);
        }
        if (buttonType != null) {
            map.put("button_type", buttonType);
        }
        map.put("process_id", str2);
        map.put("relation_tag", String.valueOf(i));
        if (str == "group") {
            map.put("is_master", new StringBuilder().append(C55339a.m101155d(aVar2.mo27720a(sessionId))).toString());
        }
        C55059b.m100694b("enter_from", enterFromForMob);
        C55059b.m100694b("enter_method", enterMethodForMob);
        C55059b.m100694b("relation_tag", String.valueOf(i));
        if (aVar.isStickyTop()) {
            str3 = "1";
        } else {
            str3 = "0";
        }
        map.put("is_top", str3);
        map.put("unread_cnt", String.valueOf(aVar.getUnreadCount()));
        if (aVar.getUnreadCount() > 0) {
            map.put("notice_type", "number_dot");
        } else if (aVar.getHasUnreadDot()) {
            map.put("notice_type", "yellow_dot");
        }
        mVar.invoke("enter_chat", map);
    }
}
