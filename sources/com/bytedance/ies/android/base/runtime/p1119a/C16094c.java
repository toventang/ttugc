package com.bytedance.ies.android.base.runtime.p1119a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.android.base.runtime.depend.INetworkDepend;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.android.base.runtime.a.c */
public final class C16094c {

    /* renamed from: l */
    public static INetworkDepend f38753l;

    /* renamed from: m */
    public static final C16095a f38754m = new C16095a((byte) 0);

    /* renamed from: a */
    public LinkedHashMap<String, String> f38755a;

    /* renamed from: b */
    public boolean f38756b;

    /* renamed from: c */
    public Map<String, String> f38757c;

    /* renamed from: d */
    public byte[] f38758d;

    /* renamed from: e */
    public String f38759e;

    /* renamed from: f */
    public String f38760f;

    /* renamed from: g */
    public long f38761g;

    /* renamed from: h */
    public long f38762h;

    /* renamed from: i */
    public long f38763i;

    /* renamed from: j */
    public LinkedHashMap<String, File> f38764j;

    /* renamed from: k */
    public String f38765k;

    static {
        Covode.recordClassIndex(18372);
    }

    /* renamed from: com.bytedance.ies.android.base.runtime.a.c$a */
    public static final class C16095a {
        static {
            Covode.recordClassIndex(18373);
        }

        private C16095a() {
        }

        public /* synthetic */ C16095a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final AbstractC16093b mo25547a() {
        String str;
        Map<String, String> map = this.f38757c;
        if (map != null && (!map.isEmpty())) {
            C16096d dVar = new C16096d(this.f38765k);
            for (String str2 : map.keySet()) {
                if (!TextUtils.isEmpty(str2) && (str = map.get(str2)) != null) {
                    C89219l.m154719c(str2, "");
                    C89219l.m154719c(str, "");
                    dVar.f38767a.put(str2, str);
                }
            }
            this.f38765k = dVar.mo25548a();
        }
        EnumC16098e eVar = EnumC16098e.GET;
        C89219l.m154719c(eVar, "");
        C89219l.m154719c(this, "");
        INetworkDepend iNetworkDepend = f38753l;
        if (iNetworkDepend != null) {
            return iNetworkDepend.requestForString(eVar, this);
        }
        return null;
    }

    public C16094c(String str) {
        C89219l.m154719c(str, "");
        this.f38765k = str;
    }
}
