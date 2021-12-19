package com.p2082ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.ugc.aweme.utils.fq */
public final class C80444fq {

    /* renamed from: a */
    private ConcurrentHashMap<String, Boolean> f180025a;

    static {
        Covode.recordClassIndex(93712);
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.fq$a */
    public static class C80445a {

        /* renamed from: a */
        public static final C80444fq f180026a = new C80444fq((byte) 0);

        static {
            Covode.recordClassIndex(93713);
        }
    }

    private C80444fq() {
        this.f180025a = new ConcurrentHashMap<>();
    }

    /* synthetic */ C80444fq(byte b) {
        this();
    }

    /* renamed from: a */
    public final boolean mo123743a(EnumC80443fp fpVar) {
        if (this.f180025a.get(fpVar.getName()) != null && this.f180025a.get(fpVar.getName()).booleanValue()) {
            return false;
        }
        this.f180025a.put(fpVar.getName(), true);
        return true;
    }
}
