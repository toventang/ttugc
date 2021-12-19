package com.p2082ss.android.ugc.aweme.account.login.trusted;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.google.gson.C28027t;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.trusted.i */
public final class C32106i {

    /* renamed from: a */
    public static final C32106i f76608a = new C32106i();

    private C32106i() {
    }

    static {
        Covode.recordClassIndex(38865);
    }

    /* renamed from: a */
    static Keva m66489a() {
        Keva repo = Keva.getRepo("aweme_trusted_users_repo");
        C89219l.m154716b(repo, "");
        return repo;
    }

    /* renamed from: b */
    public static List<C32105h> m66491b() {
        boolean z;
        String string = m66489a().getString("users_list_json", "");
        C89219l.m154716b(string, "");
        if (string.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new ArrayList();
        }
        try {
            List<C32105h> b = C80342dg.m139302b(string, C32105h[].class);
            C89219l.m154716b(b, "");
            return b;
        } catch (C28027t unused) {
            return new ArrayList();
        }
    }

    /* renamed from: a */
    public static void m66490a(List<C32105h> list) {
        if (list != null) {
            m66489a().storeString("users_list_json", C80342dg.m139300a().mo46674b(list));
        }
    }
}
