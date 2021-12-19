package com.snapchat.kit.sdk.core.networking;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import java.util.UUID;
import okhttp3.AbstractC90202u;
import okhttp3.C90029ac;
import okhttp3.C90198s;
import okhttp3.Request;

/* access modifiers changed from: package-private */
/* renamed from: com.snapchat.kit.sdk.core.networking.k */
public abstract class AbstractC29036k implements AbstractC90202u {

    /* renamed from: a */
    private final String f68601a;

    static {
        Covode.recordClassIndex(35369);
    }

    /* renamed from: a */
    private synchronized String m58024a() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    AbstractC29036k(String str) {
        this.f68601a = str;
    }

    @Override // okhttp3.AbstractC90202u
    public C90029ac intercept(AbstractC90202u.AbstractC90203a aVar) {
        return aVar.mo144857a(mo50702a(aVar).mo144698a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Request.C90016a mo50702a(AbstractC90202u.AbstractC90203a aVar) {
        return aVar.mo144856a().newBuilder().mo144696a(new C90198s.C90199a().mo145042b("User-Agent", C29030f.f68589a).mo145039a("X-Snap-SDK-OAuth-Client-Id", this.f68601a).mo145039a("X-Cloud-Trace-Context", C1764a.m5928a("%s/0;o=1", new Object[]{m58024a()})).mo145039a("X-SnapKit-Core-Version", "1.12.0").mo145040a());
    }
}
