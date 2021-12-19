package com.p2082ss.android.ugc.aweme.specact.pendant.p3929c;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p2082ss.android.ugc.aweme.local_test.C58939a;
import com.p2082ss.android.ugc.aweme.local_test.LocalTestApi;
import com.p2082ss.android.ugc.aweme.service.AbstractC67850d;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3929c.p3930a.p3931a.C74970b;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3929c.p3932b.C74979b;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3929c.p3933c.C74988b;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3929c.p3934d.C74991a;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3929c.p3934d.C74999c;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3929c.p3935e.C75001a;
import com.p2082ss.android.ugc.aweme.specact.popup.p3942a.C75126k;
import java.util.ArrayList;
import java.util.Iterator;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.specact.pendant.c.b */
public final class C74972b {

    /* renamed from: a */
    public static ArrayList<AbstractC74981c> f168548a = C89070n.m154525d(new C74999c(), new C74979b(), new C75001a(), new C74991a(), new C74970b(), new C74988b());

    /* renamed from: b */
    public static int f168549b;

    /* renamed from: c */
    public static boolean f168550c;

    /* renamed from: d */
    public static boolean f168551d;

    /* renamed from: e */
    public static final C74972b f168552e = new C74972b();

    /* renamed from: f */
    private static AbstractC67850d f168553f;

    private C74972b() {
    }

    static {
        Covode.recordClassIndex(87844);
    }

    /* renamed from: a */
    public static void m131622a(C75126k.C75129c cVar) {
        Iterator<AbstractC74981c> it = f168548a.iterator();
        while (it.hasNext()) {
            it.next().mo118100a(cVar);
        }
    }

    /* renamed from: a */
    public static void m131623a(String str) {
        C89219l.m154721d(str, "");
        if (C58939a.m108263a()) {
            if (f168553f == null) {
                Object service = ServiceManager.get().getService(LocalTestApi.class);
                C89219l.m154716b(service, "");
                f168553f = ((LocalTestApi) service).getSpecActDebugService();
            }
            AbstractC67850d dVar = f168553f;
            if (dVar != null) {
                dVar.mo106976a("SpecBubble", str);
            }
        }
    }
}
