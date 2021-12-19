package com.p2082ss.android.ugc.aweme.storagemanager;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.disk.p958c.C14429a;
import com.bytedance.disk.p961e.AbstractC14448c;
import com.bytedance.disk.p961e.C14441a;
import com.bytedance.disk.p961e.p963b.AbstractC14445b;
import com.bytedance.p1746v.AbstractC23533a;
import com.bytedance.p1746v.p1747a.C23535b;
import com.p2082ss.android.agilelogger.ALog;
import com.p2082ss.android.agilelogger.p2119c.C29721b;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import p078c.p079a.C1749a;
import p078c.p082c.AbstractC1760b;
import p078c.p082c.C1759a;

/* renamed from: com.ss.android.ugc.aweme.storagemanager.a */
public class C76422a {

    /* renamed from: a */
    public static AtomicBoolean f171670a = new AtomicBoolean(false);

    /* renamed from: b */
    public static AbstractC14448c f171671b = new AbstractC14448c() {
        /* class com.p2082ss.android.ugc.aweme.storagemanager.C76422a.C764231 */

        static {
            Covode.recordClassIndex(89387);
        }

        @Override // com.bytedance.disk.p961e.AbstractC14448c
        /* renamed from: a */
        public final void mo23277a(String str, Map<String, String> map) {
            if (TextUtils.equals("monitor", str) && !map.isEmpty()) {
                C76424a aVar = new C76424a();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    aVar.mo120132a(entry.getKey(), entry.getValue());
                }
                if (aVar.f171675a.length() > 0) {
                    C39162r.m79461a("diskmigrate", aVar.f171675a);
                }
            }
        }

        @Override // com.bytedance.disk.p961e.AbstractC14448c
        /* renamed from: a */
        public final void mo23276a(Object obj, AbstractC14445b bVar, int i) {
            C58221f.m105153e().mo95704a(new TokenResolverInit$1$1(this, bVar, obj, i)).mo95706a();
        }

        @Override // com.bytedance.disk.p961e.AbstractC14448c
        /* renamed from: a */
        public final int mo23275a(int i, String str, String str2, Throwable th) {
            if (th != null) {
                str2 = str2 + "\n" + Log.getStackTraceString(th);
            }
            ALog.println(i, str, str2, C29721b.EnumC29722a.MSG);
            return 0;
        }
    };

    /* renamed from: c */
    public static volatile AbstractC23533a f171672c = null;

    /* renamed from: d */
    private static boolean f171673d;

    /* renamed from: e */
    private static AtomicBoolean f171674e = new AtomicBoolean(false);

    private C76422a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.storagemanager.a$a */
    static class C76424a {

        /* renamed from: a */
        JSONObject f171675a = new JSONObject();

        static {
            Covode.recordClassIndex(89388);
        }

        C76424a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final C76424a mo120132a(String str, Object obj) {
            try {
                this.f171675a.put(str, obj);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return this;
        }
    }

    static {
        Covode.recordClassIndex(89386);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.storagemanager.a$b */
    public static class C76425b implements AbstractC1760b {

        /* renamed from: a */
        private Context f171676a;

        /* renamed from: b */
        private boolean f171677b;

        static {
            Covode.recordClassIndex(89389);
        }

        @Override // p078c.p082c.AbstractC1760b
        /* renamed from: a */
        public final C1759a mo5573a(AbstractC1760b.AbstractC1761a aVar) {
            String str;
            String a;
            C23535b.m44234a(this.f171676a);
            C1759a a2 = aVar.mo5564a();
            String str2 = a2.f5656b;
            if (!TextUtils.isEmpty(str2)) {
                str = new C14429a(str2, a2.f5657c).f34900a;
            } else {
                str = new C14429a(a2.f5655a).f34900a;
            }
            if (this.f171677b && C76422a.f171670a.get()) {
                C14441a a3 = C14441a.m26370a();
                a3.mo23272a(0);
                if (a3.f34946a == null) {
                    a = str;
                } else {
                    a = a3.f34946a.mo23261a(str);
                }
                if (!TextUtils.isEmpty(a)) {
                    str = a;
                }
            }
            a2.f5655a = str;
            return aVar.mo5565a(a2);
        }

        C76425b(Context context, boolean z) {
            this.f171676a = context;
            this.f171677b = z;
        }
    }

    /* renamed from: a */
    public static void m133937a(Context context, boolean z) {
        if (!f171673d) {
            C14441a.m26372a(context, f171671b);
            C1749a.C1750a.f5617a.mo5561a(new C76425b(context, z));
            f171673d = true;
        }
    }
}
