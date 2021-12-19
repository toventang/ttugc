package com.bytedance.frameworks.baselib.network.http.p988d.p989a.p990a;

import android.os.Bundle;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: com.bytedance.frameworks.baselib.network.http.d.a.a.a */
public class C14668a {

    /* renamed from: g */
    private static final String f35605g = C14668a.class.getSimpleName();

    /* renamed from: a */
    public String f35606a;

    /* renamed from: b */
    public List<String> f35607b;

    /* renamed from: c */
    public List<String> f35608c;

    /* renamed from: d */
    public long f35609d;

    /* renamed from: e */
    public long f35610e;

    /* renamed from: f */
    final WeakHandler f35611f = new WeakHandler(C14682e.f35645l.getLooper(), C14682e.m26869a());

    /* renamed from: b */
    public final void mo23651b() {
        this.f35611f.removeMessages(13);
    }

    /* renamed from: c */
    public final void mo23652c() {
        this.f35611f.removeMessages(11);
    }

    static {
        Covode.recordClassIndex(16765);
    }

    /* renamed from: a */
    public final void mo23649a() {
        this.f35611f.removeMessages(10);
        this.f35611f.removeMessages(12);
    }

    /* renamed from: com.bytedance.frameworks.baselib.network.http.d.a.a.a$a */
    public enum EnumC14669a {
        CACHE_UNSET,
        CACHE_VALID,
        CACHE_STALE_BOTH,
        CACHE_STALE_NETCHANGED,
        CACHE_STALE_EXPIRED,
        PRELOAD_BATCH,
        REFRESH_BATCH;

        static {
            Covode.recordClassIndex(16766);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo23650a(Message message) {
        Bundle bundle = new Bundle();
        bundle.putString("dnsrecord_host", this.f35606a);
        message.setData(bundle);
    }

    public C14668a(String str, long j, List<String> list, List<String> list2, int i) {
        this.f35606a = str;
        this.f35610e = j;
        this.f35607b = list;
        this.f35608c = list2;
        this.f35609d = (long) i;
        C14682e.m26869a();
    }
}
