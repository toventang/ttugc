package com.p2082ss.android.ugc.aweme.upvote.publish;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.upvote.p4190d.C79718c;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import java.util.Collection;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.upvote.publish.b */
public final class C79973b {

    /* renamed from: a */
    public static final C79973b f179270a = new C79973b();

    private C79973b() {
    }

    static {
        Covode.recordClassIndex(93200);
    }

    /* renamed from: a */
    public static List<String> m138699a() {
        List<String> b = C80342dg.m139302b(Keva.getRepo("upvote_publish_cache").getString(m138702b(), ""), String[].class);
        C89219l.m154716b(b, "");
        return b;
    }

    /* renamed from: b */
    private static String m138702b() {
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        return "upvote_publish_".concat(String.valueOf(g.getCurUserId()));
    }

    /* renamed from: a */
    public static void m138700a(String str) {
        C89219l.m154721d(str, "");
        List g = C89070n.m154585g((Collection) m138699a());
        if (!g.contains(str)) {
            g.add(str);
            int size = g.size() - C79718c.m138543a();
            int a = C89070n.m154517a(g);
            if (1 <= size && a >= size) {
                g = g.subList(size, g.size());
            }
            m138701a(g);
        }
    }

    /* renamed from: b */
    public static void m138703b(String str) {
        C89219l.m154721d(str, "");
        List g = C89070n.m154585g((Collection) m138699a());
        g.remove(str);
        m138701a(g);
    }

    /* renamed from: a */
    static void m138701a(List<String> list) {
        Keva.getRepo("upvote_publish_cache").storeString(m138702b(), C80342dg.m139300a().mo46674b(list));
    }
}
