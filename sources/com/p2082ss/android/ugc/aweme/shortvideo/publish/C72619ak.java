package com.p2082ss.android.ugc.aweme.shortvideo.publish;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.p2730de.C40982q;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.property.C65414cx;
import com.p2082ss.android.ugc.aweme.shortvideo.C69840ar;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p077b.C1731i;
import p4600h.C89391z;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.ak */
public final class C72619ak {

    /* renamed from: a */
    public static final C72619ak f162799a = new C72619ak();

    private C72619ak() {
    }

    static {
        Covode.recordClassIndex(85302);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.ak$a */
    public static final class CallableC72620a<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ boolean f162800a;

        static {
            Covode.recordClassIndex(85303);
        }

        CallableC72620a(boolean z) {
            this.f162800a = z;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            String str;
            try {
                JSONObject jSONObject = new JSONObject();
                if (this.f162800a) {
                    str = "0";
                } else {
                    str = "1";
                }
                jSONObject.put("zipUrlIsNull", str);
                C40982q.m82520a("hash_tag_zip_url", 0, C69840ar.m123402a(jSONObject).mo110191a());
            } catch (Exception e) {
                e.printStackTrace();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static void m128090a(boolean z) {
        if (C65414cx.m117133a() != 0 && !C63244g.m114602a().mo73255A().mo93901a()) {
            C1731i.m5640b(new CallableC72620a(z), C39162r.m79452a());
        }
    }
}
