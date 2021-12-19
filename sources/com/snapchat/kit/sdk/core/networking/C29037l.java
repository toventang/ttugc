package com.snapchat.kit.sdk.core.networking;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.snapchat.kit.sdk.core.p2067a.C28955c;
import java.io.IOException;
import java.util.LinkedHashMap;
import okhttp3.AbstractC90031ad;
import p4640l.AbstractC89716b;
import p4640l.AbstractC89743d;
import p4640l.C89781l;

/* renamed from: com.snapchat.kit.sdk.core.networking.l */
public final class C29037l {

    /* renamed from: b */
    private static final String f68602b = C29037l.class.getSimpleName();

    /* renamed from: a */
    final C27910f f68603a;

    /* renamed from: c */
    private final FirebaseExtensionClient f68604c;

    static {
        Covode.recordClassIndex(35370);
    }

    public C29037l(FirebaseExtensionClient firebaseExtensionClient, C27910f fVar) {
        this.f68604c = firebaseExtensionClient;
        this.f68603a = fVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo50703a(AbstractC89716b<String> bVar, C89781l<String> lVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("throws", C1764a.m5928a("HTTP %s error when hitting %s", new Object[]{Integer.valueOf(lVar.f203560a.f204107c), bVar.mo144271d().url()}));
        linkedHashMap.put("isNetworkError", Boolean.FALSE);
        String str = lVar.f203560a.f204108d;
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("responseMsg", str);
        T t = lVar.f203561b;
        if (t == null) {
            t = "";
        }
        linkedHashMap.put("responseBody", t);
        AbstractC90031ad adVar = lVar.f203562c;
        if (adVar != null) {
            try {
                linkedHashMap.put("errorBody", adVar.string());
            } catch (IOException e) {
                linkedHashMap.put("errorBody", e.getMessage());
            }
        } else {
            linkedHashMap.put("errorBody", "");
        }
        return this.f68603a.mo46674b(linkedHashMap);
    }

    /* renamed from: a */
    public final void mo50704a(String str, String str2, String str3, final CompletionCallback<String> completionCallback) {
        this.f68604c.getCustomToken(new C28955c(str, str2, str3)).mo144268a(new AbstractC89743d<String>() {
            /* class com.snapchat.kit.sdk.core.networking.C29037l.C290381 */

            static {
                Covode.recordClassIndex(35371);
            }

            @Override // p4640l.AbstractC89743d
            /* renamed from: a */
            public final void mo34286a(AbstractC89716b<String> bVar, Throwable th) {
                CompletionCallback completionCallback = completionCallback;
                boolean z = th instanceof IOException;
                C29037l lVar = C29037l.this;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("throws", C1764a.m5928a("%s when hitting %s", new Object[]{th.getMessage(), bVar.mo144271d().url()}));
                linkedHashMap.put("isNetworkError", Boolean.valueOf(z));
                completionCallback.onFailure(z, 408, lVar.f68603a.mo46674b(linkedHashMap));
            }

            @Override // p4640l.AbstractC89743d
            /* renamed from: a */
            public final void mo34287a(AbstractC89716b<String> bVar, C89781l<String> lVar) {
                if (lVar.f203560a.mo144720a()) {
                    completionCallback.onSuccess(lVar.f203561b);
                } else {
                    completionCallback.onFailure(false, lVar.f203560a.f204107c, C29037l.this.mo50703a(bVar, lVar));
                }
            }
        });
    }
}
