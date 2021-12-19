package com.bytedance.sdk.bridge;

import androidx.lifecycle.AbstractC1196i;
import com.bytedance.covode.number.Covode;
import com.bytedance.news.common.service.manager.C21520c;
import com.bytedance.sdk.bridge.api.BridgeService;
import com.bytedance.sdk.bridge.p1694b.C22694a;
import com.bytedance.sdk.bridge.p1694b.C22698c;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.sdk.bridge.f */
public final class C22703f {

    /* renamed from: a */
    static final String f53635a = f53635a;

    /* renamed from: b */
    static final ConcurrentHashMap<String, List<C22694a>> f53636b = new ConcurrentHashMap<>();

    /* renamed from: c */
    static final CopyOnWriteArrayList<C22698c> f53637c = new CopyOnWriteArrayList<>();

    /* renamed from: d */
    public static final C22703f f53638d = new C22703f();

    /* renamed from: e */
    private static final ConcurrentHashMap<String, C22701d> f53639e = new ConcurrentHashMap<>();

    /* renamed from: f */
    private static final BridgeService f53640f = ((BridgeService) C21520c.m40424a(BridgeService.class));

    /* renamed from: g */
    private static volatile boolean f53641g = true;

    /* renamed from: h */
    private static final HashMap<String, Class<?>> f53642h = new HashMap<>();

    private C22703f() {
    }

    static {
        Covode.recordClassIndex(26524);
    }

    /* renamed from: a */
    public static C22694a m42794a(List<C22694a> list, AbstractC1196i iVar) {
        if (iVar != null || list == null || !(!list.isEmpty())) {
            T t = null;
            if (list != null) {
                for (T t2 : list) {
                    if (C89219l.m154714a(t2.f53610d, iVar)) {
                        return t2;
                    }
                    if (t2.f53610d == null) {
                        t = t2;
                    }
                }
            }
            return t;
        }
        Boolean b = C22700c.f53620a.mo36967b();
        C89219l.m154709a((Object) b, "");
        if (b.booleanValue()) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (list.get(size).f53609c) {
                    return list.get(size);
                }
            }
        }
        return (C22694a) C89070n.m154586h((List) list);
    }
}
