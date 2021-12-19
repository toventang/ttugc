package com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3234b.p3236b;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17427b;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3220a.C55712b;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMConversation;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.share.b.b.g */
public final class C55956g {

    /* renamed from: a */
    public static final C55956g f127601a = new C55956g();

    /* renamed from: b */
    private static C55955f f127602b;

    /* renamed from: c */
    private static final Map<String, C55955f> f127603c = new LinkedHashMap();

    private C55956g() {
    }

    static {
        Covode.recordClassIndex(65749);
    }

    /* renamed from: a */
    public static final synchronized void m101812a(C19538ai aiVar) {
        Map<String, C55955f> map;
        C55955f fVar;
        Boolean remove;
        boolean z;
        C55955f fVar2;
        Boolean remove2;
        boolean z2;
        synchronized (C55956g.class) {
            MethodCollector.m26663i(2308);
            if (f127602b == null || aiVar == null) {
                MethodCollector.m26664o(2308);
            } else if (aiVar.getMsgStatus() == 2 || aiVar.getMsgStatus() == 3) {
                if (TextUtils.isEmpty(aiVar.getLocalExtValue("process_id")) || (fVar2 = f127603c.get(aiVar.getLocalExtValue("process_id"))) == null || !C89219l.m154714a((Object) fVar2.f127597a, (Object) "aweme") || aiVar.getMsgType() != 8) {
                    C55955f fVar3 = f127602b;
                    if (fVar3 == null) {
                        C89219l.m154715b();
                    }
                    if (C89219l.m154714a((Object) fVar3.f127597a, (Object) "aweme") && aiVar.getMsgType() == 8) {
                        C55955f fVar4 = f127602b;
                        if (fVar4 == null) {
                            C89219l.m154715b();
                        }
                        if (fVar4.f127598b.containsKey(aiVar.getConversationId()) && (remove = fVar4.f127598b.remove(aiVar.getConversationId())) != null) {
                            remove.booleanValue();
                            long c = AbstractC17427b.C17428a.m32311c(aiVar.getConversationId());
                            SharePackage sharePackage = fVar4.f127599c;
                            String conversationId = aiVar.getConversationId();
                            C89219l.m154716b(conversationId, "");
                            C55712b.m101457a(sharePackage, conversationId, c);
                            if (aiVar.getMsgStatus() == 2) {
                                z = true;
                            } else {
                                z = false;
                            }
                            SharePackage sharePackage2 = fVar4.f127599c;
                            String conversationId2 = aiVar.getConversationId();
                            C89219l.m154716b(conversationId2, "");
                            C55712b.m101458a(sharePackage2, conversationId2, c, z, aiVar.getLocalExt().get("s:err_code"));
                        }
                    }
                } else if (fVar2.f127598b.containsKey(aiVar.getConversationId()) && (remove2 = fVar2.f127598b.remove(aiVar.getConversationId())) != null) {
                    remove2.booleanValue();
                    long c2 = AbstractC17427b.C17428a.m32311c(aiVar.getConversationId());
                    SharePackage sharePackage3 = fVar2.f127599c;
                    String conversationId3 = aiVar.getConversationId();
                    C89219l.m154716b(conversationId3, "");
                    C55712b.m101457a(sharePackage3, conversationId3, c2);
                    if (aiVar.getMsgStatus() == 2) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    SharePackage sharePackage4 = fVar2.f127599c;
                    String conversationId4 = aiVar.getConversationId();
                    C89219l.m154716b(conversationId4, "");
                    C55712b.m101458a(sharePackage4, conversationId4, c2, z2, aiVar.getLocalExt().get("s:err_code"));
                }
                if (TextUtils.isEmpty(aiVar.getLocalExtValue("process_id")) || (fVar = (map = f127603c).get(aiVar.getLocalExtValue("process_id"))) == null || !fVar.f127598b.isEmpty()) {
                    C55955f fVar5 = f127602b;
                    if (fVar5 == null) {
                        C89219l.m154715b();
                    }
                    if (fVar5.f127598b.isEmpty()) {
                        f127602b = null;
                    }
                    MethodCollector.m26664o(2308);
                    return;
                }
                map.remove(aiVar.getLocalExtValue("process_id"));
                MethodCollector.m26664o(2308);
            } else {
                MethodCollector.m26664o(2308);
            }
        }
    }

    /* renamed from: a */
    public static final synchronized void m101813a(String str, SharePackage sharePackage, List<IMContact> list) {
        synchronized (C55956g.class) {
            MethodCollector.m26663i(2270);
            C89219l.m154721d(sharePackage, "");
            C89219l.m154721d(list, "");
            if (f127602b != null) {
                C56244a.m102185a("ShareStateHelper", "markShare lastShareState not null");
            }
            if (list.isEmpty()) {
                MethodCollector.m26664o(2270);
                return;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (T t : list) {
                if (t instanceof IMUser) {
                    String uid = t.getUid();
                    C89219l.m154716b(uid, "");
                    linkedHashMap.put(AbstractC17427b.C17428a.m32309a(Long.parseLong(uid)), false);
                } else if (t instanceof IMConversation) {
                    String conversationId = t.getConversationId();
                    C89219l.m154716b(conversationId, "");
                    linkedHashMap.put(conversationId, true);
                }
            }
            f127602b = new C55955f(sharePackage.f155487d, linkedHashMap, sharePackage, list);
            if (!TextUtils.isEmpty(str)) {
                Map<String, C55955f> map = f127603c;
                if (str == null) {
                    C89219l.m154715b();
                }
                map.put(str, f127602b);
            }
            MethodCollector.m26664o(2270);
        }
    }
}
