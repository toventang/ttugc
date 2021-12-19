package com.p2082ss.android.ugc.aweme.inbox;

import android.os.SystemClock;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.inbox.widget.multi.C56562b;
import com.p2082ss.android.ugc.aweme.inbox.widget.multi.EnumC56565e;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.CombineLiveNotice;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.utils.C80257bo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.inbox.i */
public final class C56463i {

    /* renamed from: a */
    public static final C56463i f128751a = new C56463i();

    private C56463i() {
    }

    static {
        Covode.recordClassIndex(66283);
    }

    /* renamed from: a */
    public static Keva m102434a() {
        String str;
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        User curUser = g.getCurUser();
        if (curUser == null || (str = curUser.getUid()) == null) {
            str = "";
        }
        String a = C1764a.m5928a("inbox_data_%s_repo_v1", Arrays.copyOf(new Object[]{str}, 1));
        C89219l.m154716b(a, "");
        Keva repo = Keva.getRepo(a);
        C89219l.m154716b(repo, "");
        return repo;
    }

    /* renamed from: a */
    public static void m102438a(String str) {
        C89219l.m154721d(str, "");
        m102434a().erase(str);
    }

    /* renamed from: a */
    public static void m102437a(C56562b bVar) {
        C89219l.m154721d(bVar, "");
        m102434a().storeString(bVar.f128963a.name(), new C27910f().mo46674b(bVar));
    }

    /* renamed from: a */
    public static C56562b m102435a(EnumC56565e eVar) {
        boolean z;
        C89219l.m154721d(eVar, "");
        String string = m102434a().getString(eVar.name(), "");
        if (string == null || string.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        try {
            C56562b bVar = (C56562b) new C27910f().mo46670a(string, C56562b.class);
            if (SystemClock.uptimeMillis() - bVar.f128971i > 86400000) {
                return null;
            }
            return bVar;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static CombineLiveNotice m102436a(List<CombineLiveNotice> list) {
        Map<String, ?> all;
        C89219l.m154721d(list, "");
        Keva a = m102434a();
        if (!C80257bo.m139107a(a.getLong("key_live_notice_cache_time", 0)) && (all = a.getAll()) != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, ?> entry : all.entrySet()) {
                String key = entry.getKey();
                C89219l.m154716b(key, "");
                if (C89361p.m154874b(key, "key_live_notice_status_", false)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                a.erase((String) entry2.getKey());
            }
        }
        a.storeLong("key_live_notice_cache_time", System.currentTimeMillis());
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            if (t.getUser() != null) {
                arrayList.add(t);
            }
        }
        ArrayList<CombineLiveNotice> arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            String str = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            StringBuilder sb = new StringBuilder("key_live_notice_status_");
            User user = ((CombineLiveNotice) next).getUser();
            if (user != null) {
                str = user.getUid();
            }
            if (a.getInt(sb.append(str).toString(), 1) != 0) {
                arrayList2.add(next);
            }
        }
        CombineLiveNotice combineLiveNotice = null;
        for (CombineLiveNotice combineLiveNotice2 : arrayList2) {
            StringBuilder sb2 = new StringBuilder("key_live_notice_status_");
            User user2 = combineLiveNotice2.getUser();
            a.storeInt(sb2.append(user2 != null ? user2.getUid() : null).toString(), 1);
            if (combineLiveNotice == null) {
                combineLiveNotice = combineLiveNotice2;
            }
        }
        return combineLiveNotice;
    }
}
