package com.p2082ss.android.ugc.aweme.account.p2277p.p2278a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.AbstractC18293d;
import com.bytedance.ies.web.p1285a.C18288a;
import com.bytedance.ies.web.p1285a.C18297h;
import com.bytedance.sdk.p1625a.p1626a.p1627a.C22289b;
import com.bytedance.sdk.p1625a.p1626a.p1627a.C22291d;
import com.bytedance.sdk.p1625a.p1643f.C22374d;
import com.bytedance.sdk.p1625a.p1645h.p1646a.C22419n;
import com.bytedance.sdk.p1625a.p1645h.p1647b.p1648a.AbstractC22434l;
import com.p2082ss.android.ugc.aweme.C31291a;
import com.p2082ss.android.ugc.aweme.C36085cj;
import com.p2082ss.android.ugc.aweme.account.experiment.C31663o;
import com.p2082ss.android.ugc.aweme.account.login.p2258c.C31896b;
import com.p2082ss.android.ugc.aweme.account.util.C33043l;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.account.p.a.f */
public final class C32923f implements AbstractC18293d {

    /* renamed from: a */
    protected WeakReference<Context> f78334a;

    /* renamed from: b */
    private C18288a f78335b;

    /* renamed from: c */
    private AbstractC22434l f78336c;

    /* renamed from: d */
    private C18297h f78337d;

    static {
        Covode.recordClassIndex(39711);
    }

    public C32923f(WeakReference<Context> weakReference, C18288a aVar) {
        this.f78334a = weakReference;
        this.f78335b = aVar;
    }

    /* renamed from: a */
    public final void mo58696a(C18297h hVar, boolean z) {
        int i;
        if (hVar != null) {
            JSONObject jSONObject = new JSONObject();
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            try {
                jSONObject.put("code", i);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            this.f78335b.mo29249a(hVar.f43669b, jSONObject);
        }
    }

    @Override // com.bytedance.ies.web.p1285a.AbstractC18293d
    public final void call(final C18297h hVar, JSONObject jSONObject) {
        if (this.f78334a.get() != null) {
            if (TextUtils.isEmpty(C36085cj.f85262b.mo57069e().getCurUser().getBindPhone())) {
                new C79459a(this.f78334a.get()).mo123050a(R.string.c_7).mo123053a();
                mo58696a(hVar, false);
                return;
            }
            this.f78337d = hVar;
            hVar.f43676i = false;
            this.f78336c = new C31896b() {
                /* class com.p2082ss.android.ugc.aweme.account.p2277p.p2278a.C32923f.C329241 */

                static {
                    Covode.recordClassIndex(39712);
                }

                @Override // com.bytedance.sdk.p1625a.AbstractC22346c
                /* renamed from: a */
                public final /* bridge */ /* synthetic */ void mo36682a(C22289b bVar, String str) {
                }

                @Override // com.bytedance.sdk.p1625a.AbstractC22358e, com.p2082ss.android.ugc.aweme.account.login.p2258c.C31896b
                /* renamed from: a */
                public final void mo36686e(C22291d<C22419n> dVar) {
                    super.mo36711a(dVar);
                    C32923f.this.mo58696a(hVar, true);
                }

                @Override // com.bytedance.sdk.p1625a.AbstractC22358e, com.p2082ss.android.ugc.aweme.account.login.p2258c.C31896b
                /* renamed from: a */
                public final void mo36681a(C22291d<C22419n> dVar, int i) {
                    super.mo36712a(dVar, i);
                    if (C32923f.this.f78334a != null) {
                        new C79459a(C32923f.this.f78334a.get()).mo123052a(C33043l.m67677a(dVar)).mo123053a();
                    }
                    C32923f.this.mo58696a(hVar, false);
                }
            };
            HashMap hashMap = new HashMap();
            if (C31663o.m65975a()) {
                hashMap.put("is6Digits", "1");
            }
            C22374d.m42169a(C31291a.f74991a).mo36633a("", 22, hashMap, this.f78336c);
        }
    }
}
