package com.p2082ss.android.ugc.aweme.push;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.push.g */
public class C65724g {

    /* renamed from: c */
    private static volatile C65724g f148109c;

    /* renamed from: a */
    public List<C65725a> f148110a = new ArrayList();

    /* renamed from: b */
    public boolean f148111b = false;

    static {
        Covode.recordClassIndex(77223);
    }

    /* renamed from: com.ss.android.ugc.aweme.push.g$a */
    public static class C65725a {

        /* renamed from: a */
        public String f148112a;

        static {
            Covode.recordClassIndex(77224);
        }

        private C65725a() {
        }

        public /* synthetic */ C65725a(byte b) {
            this();
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C65725a) || !TextUtils.equals(((C65725a) obj).f148112a, this.f148112a)) {
                return false;
            }
            return true;
        }
    }

    private C65724g() {
    }

    /* renamed from: a */
    public static final C65724g m117661a() {
        MethodCollector.m26663i(3181);
        if (f148109c == null) {
            synchronized (C65724g.class) {
                try {
                    if (f148109c == null) {
                        f148109c = new C65724g();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(3181);
                    throw th;
                }
            }
        }
        C65724g gVar = f148109c;
        MethodCollector.m26664o(3181);
        return gVar;
    }

    /* renamed from: a */
    public final boolean mo104866a(String str) {
        MethodCollector.m26663i(3184);
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            MethodCollector.m26664o(3184);
            return false;
        }
        synchronized (this) {
            try {
                Iterator<C65725a> it = this.f148110a.iterator();
                while (true) {
                    if (it.hasNext()) {
                        C65725a next = it.next();
                        if (next != null && TextUtils.equals(next.f148112a, str)) {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            } finally {
                MethodCollector.m26664o(3184);
            }
        }
        return z;
    }
}
