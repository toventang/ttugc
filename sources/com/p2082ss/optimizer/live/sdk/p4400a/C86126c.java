package com.p2082ss.optimizer.live.sdk.p4400a;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: com.ss.optimizer.live.sdk.a.c */
public final class C86126c {

    /* renamed from: a */
    final String f192041a;

    /* renamed from: b */
    final String f192042b;

    /* renamed from: c */
    final AbstractC86125b f192043c;

    /* renamed from: d */
    final List<Pair<String, String>> f192044d;

    /* renamed from: e */
    final ThreadPoolExecutor f192045e;

    /* renamed from: f */
    final boolean f192046f;

    /* renamed from: g */
    final Map<String, Integer> f192047g;

    /* renamed from: h */
    long f192048h;

    /* renamed from: i */
    int f192049i;

    static {
        Covode.recordClassIndex(101267);
    }

    /* renamed from: com.ss.optimizer.live.sdk.a.c$b */
    static class C86128b implements AbstractC86125b {
        static {
            Covode.recordClassIndex(101269);
        }

        private C86128b() {
        }

        /* synthetic */ C86128b(byte b) {
            this();
        }

        @Override // com.p2082ss.optimizer.live.sdk.p4400a.AbstractC86125b
        /* renamed from: a */
        public final String mo16645a(String str) {
            throw new RuntimeException("no implementation");
        }

        @Override // com.p2082ss.optimizer.live.sdk.p4400a.AbstractC86125b
        /* renamed from: a */
        public final String mo16646a(String str, byte[] bArr, String str2) {
            throw new RuntimeException("no implementation");
        }
    }

    /* renamed from: com.ss.optimizer.live.sdk.a.c$a */
    public static class C86127a {

        /* renamed from: a */
        public String f192050a;

        /* renamed from: b */
        public String f192051b;

        /* renamed from: c */
        public String f192052c;

        /* renamed from: d */
        public int f192053d;

        /* renamed from: e */
        public AbstractC86125b f192054e;

        /* renamed from: f */
        public ThreadPoolExecutor f192055f;

        /* renamed from: g */
        public boolean f192056g;

        /* renamed from: h */
        public Map<String, Integer> f192057h;

        static {
            Covode.recordClassIndex(101268);
        }

        /* renamed from: a */
        public final C86126c mo136402a() {
            return new C86126c(this, (byte) 0);
        }
    }

    private C86126c(C86127a aVar) {
        this.f192048h = 10000;
        this.f192049i = 5;
        String str = aVar.f192050a;
        this.f192041a = str;
        this.f192042b = aVar.f192051b;
        if (aVar.f192054e == null) {
            this.f192043c = new C86128b((byte) 0);
        } else {
            this.f192043c = aVar.f192054e;
        }
        ArrayList arrayList = new ArrayList();
        this.f192044d = arrayList;
        if (str != null) {
            arrayList.add(Pair.create("ProjectKey", str));
        }
        if (aVar.f192052c != null) {
            arrayList.add(Pair.create("DeviceId", aVar.f192052c));
        }
        this.f192045e = aVar.f192055f;
        this.f192046f = aVar.f192056g;
        Map<String, Integer> map = aVar.f192057h;
        this.f192047g = map;
        if (map != null) {
            if (map.containsKey("request_retry_interval")) {
                this.f192048h = (long) map.get("request_retry_interval").intValue();
            }
            if (map.containsKey("request_max_retry_times")) {
                this.f192049i = map.get("request_max_retry_times").intValue();
            }
        }
    }

    /* synthetic */ C86126c(C86127a aVar, byte b) {
        this(aVar);
    }
}
