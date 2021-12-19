package com.p2082ss.android.ugc.aweme;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.network.AbstractC32876a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.dr */
public class C43200dr {

    /* renamed from: a */
    static C43107dn f100693a;

    /* renamed from: b */
    public static AbstractC32876a f100694b;

    /* renamed from: c */
    static List<IAccountUserService.AbstractC31278a> f100695c = new LinkedList();

    static {
        Covode.recordClassIndex(51387);
    }

    /* renamed from: a */
    public static void m86153a(IAccountUserService.AbstractC31278a aVar) {
        MethodCollector.m26663i(10858);
        synchronized (C43200dr.class) {
            try {
                if (!f100695c.contains(aVar)) {
                    f100695c.add(aVar);
                }
            } finally {
                MethodCollector.m26664o(10858);
            }
        }
    }

    /* renamed from: a */
    public static void m86152a(int i, User user, User user2) {
        MethodCollector.m26663i(10999);
        LinkedList<IAccountUserService.AbstractC31278a> linkedList = new LinkedList();
        synchronized (C43200dr.class) {
            try {
                linkedList.addAll(f100695c);
            } finally {
                MethodCollector.m26664o(10999);
            }
        }
        for (IAccountUserService.AbstractC31278a aVar : linkedList) {
            aVar.mo57195a(i, user, user2);
        }
    }
}
