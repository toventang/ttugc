package com.p2082ss.android.ugc.aweme.account.login.authorize.p2256b;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1626a.p1627a.AbstractC22288a;
import com.bytedance.sdk.p1625a.p1626a.p1627a.C22292e;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.account.login.authorize.b.c */
public final class C31875c extends AbstractC22288a<C22292e> {

    /* renamed from: c */
    private final WeakReference<AbstractC31873a> f76169c;

    static {
        Covode.recordClassIndex(38619);
    }

    public C31875c(AbstractC31873a aVar) {
        this.f76169c = new WeakReference<>(aVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
    @Override // com.bytedance.sdk.p1625a.p1626a.p1627a.AbstractC22288a
    /* renamed from: a */
    public final /* synthetic */ void mo36605a(C22292e eVar) {
        C22292e eVar2 = eVar;
        if (eVar2.f52713b) {
            if (this.f76169c.get() != null) {
                this.f76169c.get().mo57798a(eVar2.f52724j);
            }
        } else if (this.f76169c.get() != null) {
            String str = eVar2.f52735u;
            if (eVar2.f52719h != null) {
                JSONObject optJSONObject = eVar2.f52719h.optJSONObject("data");
                if (TextUtils.isEmpty(str) && optJSONObject != null && optJSONObject.has("profile_key")) {
                    str = optJSONObject.optString("profile_key", "");
                }
            }
            this.f76169c.get().mo57796a(eVar2.f52715d, eVar2.f52717f, str, eVar2);
        }
    }
}
