package com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.controller.helper;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17420a;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17427b;
import com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.single.p3124a.C54315a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3132a.p3133a.AbstractC54376a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.C54542d;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.controller.p3150b.C54871c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3146b.C54839a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55080c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55085g;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55099j;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55185ag;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3261k.AbstractC56237a;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import com.p2082ss.android.ugc.aweme.utils.GsonHolder;
import com.p2082ss.android.ugc.aweme.utils.GsonProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.controller.helper.c */
public final class C54881c {

    /* renamed from: a */
    public static final C27910f f125656a;

    /* renamed from: b */
    public static final AbstractC54882d f125657b = new C54875a();

    /* renamed from: c */
    public static final C54881c f125658c = new C54881c();

    private C54881c() {
    }

    /* renamed from: b */
    public static void m100497b() {
        f125657b.mo91892a();
    }

    /* renamed from: c */
    public static boolean m100499c() {
        return f125657b.mo91896b();
    }

    static {
        Covode.recordClassIndex(64601);
        GsonProvider c = GsonHolder.m138943c();
        C89219l.m154716b(c, "");
        f125656a = c.mo123620b();
    }

    /* renamed from: a */
    public static boolean m100493a() {
        Integer mark_read;
        Long l;
        List<C19638h> a = AbstractC17420a.C17421a.m32276a().mo27721a();
        ArrayList arrayList = new ArrayList();
        for (T t : a) {
            if (C54871c.m100474b(t)) {
                arrayList.add(t);
            }
        }
        ArrayList<C19638h> arrayList2 = arrayList;
        if (!arrayList2.isEmpty()) {
            for (C19638h hVar : arrayList2) {
                C54839a c = m100498c(hVar);
                if (!(c == null || (mark_read = c.getMark_read()) == null || mark_read.intValue() != 0)) {
                    StringBuilder append = new StringBuilder("timestamp: ").append(c.getCreate_at()).append(" needShowNoticeDot : ").append(hVar.getConversationId()).append(" has unread like in message uuid ").append(c.getMessage_id()).append(" and message id ");
                    C19538ai message = c.getMessage();
                    if (message != null) {
                        l = Long.valueOf(message.getMsgId());
                    } else {
                        l = null;
                    }
                    C56244a.m102191c("DmHelper", append.append(l).toString());
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m100495a(IMUser iMUser) {
        if (iMUser == null || TextUtils.isEmpty(iMUser.getUid())) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static long m100496b(C19638h hVar) {
        Long create_at;
        long j = 0;
        if (hVar == null) {
            return 0;
        }
        C54839a c = m100498c(hVar);
        if (!(c == null || (create_at = c.getCreate_at()) == null)) {
            j = create_at.longValue();
        }
        return j * 1000;
    }

    /* renamed from: d */
    public static boolean m100500d(C19638h hVar) {
        Integer mark_read;
        C54839a c = m100498c(hVar);
        if (c == null || (mark_read = c.getMark_read()) == null || mark_read.intValue() != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static String m100490a(List<C19538ai> list) {
        if (list == null) {
            return null;
        }
        for (T t : list) {
            if (!(t.isSelf() || AbstractC54376a.f124546v.contains(EnumC53772b.C53814f.m99068a((C19538ai) t)))) {
                return t.getUuid();
            }
        }
        return null;
    }

    /* renamed from: c */
    public static C54839a m100498c(C19638h hVar) {
        Map<String, String> localExt;
        String str;
        C54839a aVar = null;
        if (hVar == null || (localExt = hVar.getLocalExt()) == null || (str = localExt.get("a:s_latest_message_property")) == null) {
            return null;
        }
        try {
            aVar = (C54839a) f125656a.mo46670a(str, C54839a.class);
            return aVar;
        } catch (Exception e) {
            C51423a.m95788a("", e);
            return aVar;
        }
    }

    /* renamed from: a */
    public static IMUser m100488a(C54315a aVar) {
        IMUser iMUser;
        String conversationId;
        if (aVar != null) {
            iMUser = aVar.getSingleChatFromUser();
        } else {
            iMUser = null;
        }
        try {
            if (!(!m100495a(iMUser) || aVar == null || (conversationId = aVar.getConversationId()) == null)) {
                long c = AbstractC17427b.C17428a.m32311c(conversationId);
                C56244a.m102191c("DmHelper", "check-ing->uidFromConversationId");
                if (c != -1) {
                    IMUser a = C55085g.m100751a(String.valueOf(c), C55080c.m100730a(conversationId));
                    if (!m100495a(a)) {
                        C56244a.m102191c("DmHelper", "Success->checkImUserInvalidForDmLike");
                        aVar.setFromUser(a);
                        return a;
                    }
                    C56244a.m102191c("DmHelper", "Failed->checkImUserInvalidForDmLike not right");
                } else {
                    C56244a.m102191c("DmHelper", "Failed->uidFromConversationId not right");
                }
            }
        } catch (Exception e) {
            C51423a.m95788a("", e);
        }
        return iMUser;
    }

    /* renamed from: e */
    public static void m100501e(C19638h hVar) {
        C54839a c;
        if (hVar != null && (c = m100498c(hVar)) != null) {
            Integer mark_read = c.getMark_read();
            if (mark_read == null || mark_read.intValue() != 1) {
                c.setMark_read(1);
                Map<String, String> localExt = hVar.getLocalExt();
                if (localExt != null) {
                    localExt.put("a:s_latest_message_property", f125656a.mo46674b(c));
                    hVar.setLocalExt(localExt);
                    String conversationId = hVar.getConversationId();
                    C56244a.m102190b("DmHelper", "markLastPropertyRead :".concat(String.valueOf(conversationId)));
                    C89219l.m154716b(conversationId, "");
                    AbstractC17427b.C17428a.m32308a(conversationId).mo27747b(localExt, (AbstractC19479b<C19638h>) null);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m100491a(String str) {
        if (!TextUtils.isEmpty(str)) {
            C55099j.f126093b.mo92008b(str);
            C54542d.m100005f().mo90196b();
            C55185ag.m100886a(str);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x0121  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.p2082ss.android.ugc.aweme.p3070im.sdk.notification.p3211a.C55670k m100487a(com.p2082ss.android.ugc.aweme.p3070im.sdk.notification.p3211a.C55667i r25) {
        /*
        // Method dump skipped, instructions count: 339
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.controller.helper.C54881c.m100487a(com.ss.android.ugc.aweme.im.sdk.notification.a.i):com.ss.android.ugc.aweme.im.sdk.notification.a.k");
    }

    /* renamed from: a */
    public static boolean m100494a(C19638h hVar) {
        C19538ai lastMessage;
        if (hVar == null || (lastMessage = hVar.getLastMessage()) == null) {
            return false;
        }
        if (m100496b(hVar) > lastMessage.getCreatedAt()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static String m100489a(AbstractC56237a aVar, C19638h hVar) {
        if (aVar.mo91860c() == 20 || aVar.mo91860c() == 0) {
            return f125657b.mo91891a(hVar);
        }
        return null;
    }

    /* renamed from: a */
    public static void m100492a(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            C55099j.f126093b.mo92008b(str);
            C54542d.m100005f().mo90196b();
            C55185ag.m100888b(str, str2);
        }
    }
}
