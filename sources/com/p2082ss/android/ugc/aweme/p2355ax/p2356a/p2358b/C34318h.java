package com.p2082ss.android.ugc.aweme.p2355ax.p2356a.p2358b;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ax.a.b.h */
public final class C34318h {

    /* renamed from: a */
    public static final C34319a f81171a = new C34319a((byte) 0);

    /* renamed from: b */
    private final List<C34312b> f81172b;

    static {
        Covode.recordClassIndex(41262);
    }

    /* renamed from: com.ss.android.ugc.aweme.ax.a.b.h$a */
    public static final class C34319a {
        static {
            Covode.recordClassIndex(41263);
        }

        private C34319a() {
        }

        public /* synthetic */ C34319a(byte b) {
            this();
        }
    }

    public C34318h(List<C34312b> list) {
        C89219l.m154721d(list, "");
        this.f81172b = list;
    }

    /* renamed from: a */
    public final C34314d mo60763a(String str, JSONObject jSONObject) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(jSONObject, "");
        Iterator<C34312b> it = this.f81172b.iterator();
        boolean z = false;
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (TextUtils.equals(it.next().f81157b, str)) {
                break;
            } else {
                i++;
            }
        }
        Integer valueOf = Integer.valueOf(i);
        if (valueOf.intValue() == -1) {
            z = true;
        }
        if (!z && valueOf != null) {
            C34312b bVar = this.f81172b.get(valueOf.intValue());
            long optLong = jSONObject.optLong(str) - jSONObject.optLong(bVar.f81156a);
            if (optLong > 0) {
                return new C34314d(bVar.f81158c, optLong);
            }
        }
        return null;
    }
}
