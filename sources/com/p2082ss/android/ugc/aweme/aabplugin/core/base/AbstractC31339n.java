package com.p2082ss.android.ugc.aweme.aabplugin.core.base;

import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.plugin.p1265a.C18115a;
import com.bytedance.ies.ugc.aweme.plugin.p1265a.C18119c;
import com.bytedance.ies.ugc.aweme.plugin.p1265a.C18121d;
import com.bytedance.ies.ugc.aweme.plugin.p1267c.AbstractC18125a;
import com.bytedance.ies.ugc.aweme.plugin.p1267c.AbstractC18126b;
import com.p2082ss.android.ugc.aweme.aabplugin.core.base.p2230a.C31317d;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.aabplugin.core.base.n */
public abstract class AbstractC31339n {

    /* renamed from: p */
    public static final C31340a f75076p = new C31340a((byte) 0);

    /* renamed from: a */
    public boolean f75077a;

    /* renamed from: b */
    public C18115a f75078b;

    /* renamed from: c */
    public C18121d f75079c;

    /* renamed from: d */
    public int f75080d;

    /* renamed from: e */
    public EnumC31342b f75081e = EnumC31342b.UNKNOWN;

    /* renamed from: f */
    public long f75082f;

    /* renamed from: g */
    public long f75083g;

    /* renamed from: h */
    public long f75084h;

    /* renamed from: i */
    long f75085i;

    /* renamed from: j */
    public final long f75086j;

    /* renamed from: k */
    public AbstractC18126b f75087k;

    /* renamed from: l */
    public final String f75088l;

    /* renamed from: m */
    public final String f75089m;

    /* renamed from: n */
    public final boolean f75090n;

    /* renamed from: o */
    AbstractC31344p f75091o;

    static {
        Covode.recordClassIndex(38039);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo57308a(Map<String, String> map);

    /* renamed from: d */
    public final void mo57344d() {
        m65541a(this, 1);
    }

    /* renamed from: com.ss.android.ugc.aweme.aabplugin.core.base.n$a */
    public static final class C31340a {
        static {
            Covode.recordClassIndex(38040);
        }

        private C31340a() {
        }

        public /* synthetic */ C31340a(byte b) {
            this();
        }

        /* renamed from: com.ss.android.ugc.aweme.aabplugin.core.base.n$a$a */
        public static final class C31341a implements AbstractC31344p {

            /* renamed from: a */
            final /* synthetic */ C18119c f75092a;

            /* renamed from: b */
            final /* synthetic */ boolean f75093b;

            static {
                Covode.recordClassIndex(38041);
            }

            @Override // com.p2082ss.android.ugc.aweme.aabplugin.core.base.AbstractC31344p
            /* renamed from: a */
            public final void mo57347a(String str) {
                AbstractC18125a aVar = this.f75092a.f43145d;
                if (aVar != null) {
                    aVar.mo28880a(str, this.f75093b);
                }
            }

            public C31341a(C18119c cVar, boolean z) {
                this.f75092a = cVar;
                this.f75093b = z;
            }

            @Override // com.p2082ss.android.ugc.aweme.aabplugin.core.base.AbstractC31344p
            /* renamed from: a */
            public final void mo57348a(String str, int i) {
                AbstractC18125a aVar = this.f75092a.f43145d;
                if (aVar != null) {
                    aVar.mo28879a(str, i);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo57338a() {
        this.f75077a = true;
        this.f75078b.f43114a = false;
        this.f75080d = 0;
    }

    /* renamed from: com.ss.android.ugc.aweme.aabplugin.core.base.n$b */
    public enum EnumC31342b {
        UNKNOWN,
        TIMEOUT,
        PENDING,
        RUNNING,
        DOWNLOADED,
        SUCCEEDED,
        FAILED,
        CANCELED;

        static {
            Covode.recordClassIndex(38042);
        }

        public final boolean isFinished() {
            if (this == SUCCEEDED || this == FAILED || this == CANCELED || this == DOWNLOADED || this == UNKNOWN) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: c */
    public final Map<String, String> mo57343c() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("task_type", String.valueOf(this.f75080d));
        mo57308a(linkedHashMap);
        return linkedHashMap;
    }

    public int hashCode() {
        return ((this.f75089m.hashCode() + 527) * 31) + this.f75088l.hashCode();
    }

    /* renamed from: b */
    public boolean mo57311b() {
        List<String> list = this.f75078b.f43121h;
        if (list == null) {
            list = C89086z.INSTANCE;
        }
        for (String str : list) {
            if (!C31343o.m65555a(str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public final void mo57340a(long j) {
        this.f75084h = j;
        this.f75085i = j + System.currentTimeMillis();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AbstractC31339n)) {
            return super.equals(obj);
        }
        AbstractC31339n nVar = (AbstractC31339n) obj;
        if (!C89219l.m154714a((Object) this.f75089m, (Object) nVar.f75089m) || !C89219l.m154714a((Object) this.f75088l, (Object) nVar.f75088l)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo57342a(EnumC31342b bVar) {
        C89219l.m154721d(bVar, "");
        this.f75081e = bVar;
    }

    /* renamed from: a */
    public static /* synthetic */ void m65541a(AbstractC31339n nVar, int i) {
        nVar.m65542b(i, nVar.f75077a);
    }

    /* renamed from: a */
    public final void mo57339a(int i, boolean z) {
        AbstractC31344p pVar;
        C31317d.m65519a(this, i);
        if ((!z || this.f75078b.f43125l) && (pVar = this.f75091o) != null) {
            pVar.mo57348a(this.f75089m, i);
        }
    }

    /* renamed from: b */
    private void m65542b(int i, boolean z) {
        AbstractC31344p pVar;
        C89219l.m154721d(this, "");
        long currentTimeMillis = System.currentTimeMillis() - this.f75086j;
        try {
            JSONObject jSONObject = new JSONObject(mo57343c());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject.put("reason", i);
            jSONObject2.put("duration", currentTimeMillis);
            C12290b.m22066a("df_install_success", jSONObject, jSONObject2, (JSONObject) null);
        } catch (Exception unused) {
        }
        if ((!z || this.f75078b.f43125l) && (pVar = this.f75091o) != null) {
            pVar.mo57347a(this.f75089m);
        }
    }

    /* renamed from: a */
    public final void mo57341a(long j, long j2) {
        this.f75083g = j;
        this.f75082f = j2;
    }

    public AbstractC31339n(String str, String str2, boolean z, boolean z2, AbstractC31344p pVar, C18115a aVar) {
        int i;
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(aVar, "");
        this.f75088l = str;
        this.f75089m = str2;
        this.f75090n = z2;
        this.f75091o = pVar;
        this.f75077a = z;
        this.f75078b = aVar;
        if (z2) {
            i = 0;
        } else if (z) {
            i = 1;
        } else {
            i = 2;
        }
        this.f75080d = i;
        this.f75086j = System.currentTimeMillis();
    }
}
