package net.openid.appauth;

import com.bytedance.covode.number.Covode;
import java.util.Collections;
import java.util.Map;

/* renamed from: net.openid.appauth.o */
public final class C90008o implements AbstractC89998k {

    /* renamed from: a */
    public static final C90008o f204026a = new C90008o();

    private C90008o() {
    }

    static {
        Covode.recordClassIndex(106179);
    }

    @Override // net.openid.appauth.AbstractC89998k
    /* renamed from: a */
    public final Map<String, String> mo144667a(String str) {
        return Collections.singletonMap("client_id", str);
    }
}
