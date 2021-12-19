package com.bytedance.sdk.bridge.p1695js;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.bridge.C22685a;
import com.bytedance.sdk.bridge.C22700c;
import com.bytedance.sdk.bridge.C22701d;
import com.bytedance.sdk.bridge.C22704g;
import com.bytedance.sdk.bridge.p1694b.C22694a;
import com.bytedance.sdk.bridge.p1694b.C22698c;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.sdk.bridge.js.a */
public final class C22706a {

    /* renamed from: a */
    public static final String f53645a = f53645a;

    /* renamed from: b */
    public static final ConcurrentHashMap<String, List<C22694a>> f53646b = new ConcurrentHashMap<>();

    /* renamed from: c */
    public static final CopyOnWriteArrayList<C22698c> f53647c = new CopyOnWriteArrayList<>();

    /* renamed from: d */
    public static final CopyOnWriteArrayList<String> f53648d = new CopyOnWriteArrayList<>();

    /* renamed from: e */
    public static final C22706a f53649e = new C22706a();

    /* renamed from: f */
    private static final ConcurrentHashMap<WeakReference<Object>, ConcurrentHashMap<String, C22694a>> f53650f = new ConcurrentHashMap<>();

    /* renamed from: g */
    private static final ConcurrentHashMap<String, C22701d> f53651g = new ConcurrentHashMap<>();

    /* renamed from: h */
    private static final ConcurrentHashMap<WeakReference<Object>, CopyOnWriteArrayList<C22698c>> f53652h = new ConcurrentHashMap<>();

    /* renamed from: i */
    private static final Handler f53653i = new Handler(Looper.getMainLooper());

    private C22706a() {
    }

    static {
        Covode.recordClassIndex(26527);
    }

    /* renamed from: a */
    public static void m42799a() {
        Boolean bool;
        C22685a aVar = C22700c.f53620a;
        if (aVar != null) {
            bool = aVar.mo36966a();
        } else {
            bool = null;
        }
        if (!(!C89219l.m154714a((Object) bool, (Object) true))) {
            StringBuilder sb = new StringBuilder("--------- Current JsBridgeMethod --------\n");
            Collection<List<C22694a>> values = f53646b.values();
            C89219l.m154709a((Object) values, "");
            for (List<C22694a> list : values) {
                C89219l.m154709a((Object) list, "");
                for (T t : list) {
                    sb.append(t.f53607a).append(":").append(t.f53608b.f53626b).append("\n");
                }
            }
            String str = f53645a;
            String sb2 = sb.toString();
            C89219l.m154709a((Object) sb2, "");
            C22704g.m42795a(str, sb2);
        }
    }
}
