package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.C17419b;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17427b;
import com.bytedance.ies.p1208im.core.api.p1218h.AbstractC17467b;
import com.bytedance.p1399im.core.p1404a.C19489e;
import com.bytedance.p1399im.core.p1408d.AbstractC19670s;
import com.bytedance.p1399im.core.p1408d.C19537ah;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.e.j */
public final class C55099j {

    /* renamed from: a */
    static ConcurrentHashMap<String, String> f126092a = new ConcurrentHashMap<>();

    /* renamed from: b */
    public static final C55099j f126093b = new C55099j();

    /* renamed from: c */
    private static AbstractC19670s f126094c;

    private C55099j() {
    }

    static {
        Covode.recordClassIndex(64827);
    }

    /* renamed from: b */
    public static void m100779b() {
        if (f126094c != null) {
            AbstractC17467b a = C17419b.m32261a();
            AbstractC19670s sVar = f126094c;
            if (sVar == null) {
                C89219l.m154715b();
            }
            a.mo27892b(sVar);
            f126094c = null;
        }
    }

    /* renamed from: a */
    public static void m100778a() {
        if (f126094c == null) {
            f126094c = C55100a.f126095a;
        }
        AbstractC17467b a = C17419b.m32261a();
        AbstractC19670s sVar = f126094c;
        if (sVar == null) {
            C89219l.m154715b();
        }
        a.mo27888a(sVar);
    }

    /* renamed from: a */
    public static String m100777a(String str) {
        String c = m100780c(str);
        if (c != null && c.length() != 0) {
            return c;
        }
        IMUser b = C55085g.m100757b(str, null);
        if (b != null) {
            return b.getSecUid();
        }
        return null;
    }

    /* renamed from: c */
    private static String m100780c(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String str2 = f126092a.get(str);
        if (TextUtils.isEmpty(str2)) {
            return "";
        }
        return str2;
    }

    /* renamed from: b */
    public final void mo92008b(String str) {
        if (!TextUtils.isEmpty(str)) {
            C55076b.m100723b().putSecUidToMap(str, m100776a(C55085g.m100757b(str, null), str));
        }
    }

    /* renamed from: a */
    public static String m100775a(IMUser iMUser) {
        if (iMUser == null || TextUtils.isEmpty(iMUser.getUid())) {
            return "";
        }
        if (!TextUtils.isEmpty(iMUser.getSecUid())) {
            return iMUser.getSecUid();
        }
        IMUser b = C55085g.m100757b(iMUser.getUid(), null);
        if (b == null || TextUtils.isEmpty(b.getSecUid())) {
            return m100780c(iMUser.getUid());
        }
        return b.getSecUid();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.e.j$a */
    static final class C55100a implements AbstractC19670s {

        /* renamed from: a */
        public static final C55100a f126095a = new C55100a();

        static {
            Covode.recordClassIndex(64828);
        }

        C55100a() {
        }

        @Override // com.bytedance.p1399im.core.p1408d.AbstractC19670s
        /* renamed from: a */
        public final void mo31626a(List<C19537ah> list) {
            C89219l.m154716b(list, "");
            for (T t : list) {
                C89219l.m154716b(t, "");
                if (t.getUid() > 0 && !TextUtils.isEmpty(t.getSecUid()) && t.getConversationType() != C19489e.AbstractC19490a.f46181b) {
                    IMUser a = C55085g.m100751a(String.valueOf(t.getUid()), t.getSecUid());
                    if (a != null) {
                        if (TextUtils.isEmpty(a.getSecUid())) {
                            a.setSecUid(t.getSecUid());
                            C55085g.m100752a(a);
                        }
                        String uid = a.getUid();
                        C89219l.m154716b(uid, "");
                        String a2 = AbstractC17427b.C17428a.m32309a(Long.parseLong(uid));
                        if (!TextUtils.isEmpty(a2)) {
                            C89219l.m154721d(a2, "");
                            List<String> list2 = C55097i.f126089a;
                            if (list2 != null && list2.contains(a2)) {
                                List<String> list3 = C55097i.f126089a;
                                if (list3 == null) {
                                    C89219l.m154715b();
                                }
                                list3.remove(a2);
                            }
                        }
                    } else {
                        ConcurrentHashMap<String, String> concurrentHashMap = C55099j.f126092a;
                        String valueOf = String.valueOf(t.getUid());
                        String secUid = t.getSecUid();
                        C89219l.m154716b(secUid, "");
                        concurrentHashMap.put(valueOf, secUid);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static String m100776a(IMUser iMUser, String str) {
        if (iMUser == null) {
            return m100780c(str);
        }
        return m100775a(iMUser);
    }
}
