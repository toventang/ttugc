package com.p2082ss.android.ugc.aweme.utils;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.utils.gt */
public final class C80512gt {

    /* renamed from: b */
    public static C80512gt f180111b;

    /* renamed from: c */
    public static final C80513a f180112c = new C80513a((byte) 0);

    /* renamed from: a */
    public List<? extends Object> f180113a;

    static {
        Covode.recordClassIndex(93785);
    }

    /* renamed from: b */
    public static final synchronized C80512gt m139552b() {
        C80512gt a;
        synchronized (C80512gt.class) {
            MethodCollector.m26663i(9974);
            a = f180112c.mo123769a();
            MethodCollector.m26664o(9974);
        }
        return a;
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.gt$a */
    public static final class C80513a {
        static {
            Covode.recordClassIndex(93786);
        }

        private C80513a() {
        }

        /* renamed from: a */
        public final synchronized C80512gt mo123769a() {
            C80512gt gtVar;
            MethodCollector.m26663i(9976);
            if (C80512gt.f180111b == null) {
                C80512gt.f180111b = new C80512gt((byte) 0);
            }
            gtVar = C80512gt.f180111b;
            if (gtVar == null) {
                C89219l.m154715b();
            }
            MethodCollector.m26664o(9976);
            return gtVar;
        }

        public /* synthetic */ C80513a(byte b) {
            this();
        }
    }

    private C80512gt() {
    }

    /* renamed from: a */
    public final String mo123767a() {
        JSONArray jSONArray = new JSONArray();
        List<? extends Object> list = this.f180113a;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().toString());
            }
        }
        String encode = Uri.encode(jSONArray.toString());
        C89219l.m154716b(encode, "");
        return encode;
    }

    public /* synthetic */ C80512gt(byte b) {
        this();
    }

    /* renamed from: a */
    public final void mo123768a(List<? extends Object> list) {
        C89219l.m154721d(list, "");
        this.f180113a = list;
    }
}
