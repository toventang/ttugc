package com.p2082ss.android.ugc.aweme.account.p2277p.p2278a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.AbstractC18293d;
import com.bytedance.ies.web.p1285a.C18288a;
import com.bytedance.ies.web.p1285a.C18297h;
import com.bytedance.sdk.p1625a.p1626a.p1627a.C22293f;
import com.bytedance.sdk.p1625a.p1643f.C22374d;
import com.bytedance.sdk.p1625a.p1645h.p1647b.p1648a.AbstractC22438p;
import com.p2082ss.android.ugc.aweme.C31291a;
import com.p2082ss.android.ugc.aweme.account.util.C33043l;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.account.p.a.h */
public final class C32928h implements AbstractC18293d {

    /* renamed from: a */
    protected WeakReference<Context> f78344a;

    /* renamed from: b */
    public boolean f78345b;

    /* renamed from: c */
    private C18288a f78346c;

    /* renamed from: d */
    private AbstractC22438p f78347d;

    /* renamed from: e */
    private String f78348e;

    /* renamed from: f */
    private C18297h f78349f;

    static {
        Covode.recordClassIndex(39716);
    }

    public C32928h(WeakReference<Context> weakReference, C18288a aVar) {
        this.f78344a = weakReference;
        this.f78346c = aVar;
    }

    /* renamed from: a */
    public final void mo58697a(C18297h hVar, int i) {
        int i2;
        if (hVar != null) {
            JSONObject jSONObject = new JSONObject();
            if (i == 0) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            try {
                jSONObject.put("code", i2);
                jSONObject.put("errorCode", i);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            this.f78346c.mo29249a(hVar.f43669b, jSONObject);
        }
    }

    @Override // com.bytedance.ies.web.p1285a.AbstractC18293d
    public final void call(final C18297h hVar, JSONObject jSONObject) {
        if (this.f78344a.get() != null) {
            this.f78349f = hVar;
            hVar.f43676i = false;
            this.f78348e = hVar.f43671d.getString("code");
            try {
                this.f78345b = hVar.f43671d.getBoolean("ignoreErrorToast");
            } catch (JSONException unused) {
            }
            this.f78347d = new AbstractC22438p() {
                /* class com.p2082ss.android.ugc.aweme.account.p2277p.p2278a.C32928h.C329291 */

                static {
                    Covode.recordClassIndex(39717);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
                @Override // com.bytedance.sdk.p1625a.AbstractC22346c
                /* renamed from: e */
                public final /* synthetic */ void mo36686e(C22293f fVar) {
                    C32928h.this.mo58697a(hVar, 0);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b, int] */
                @Override // com.bytedance.sdk.p1625a.AbstractC22346c
                /* renamed from: a */
                public final /* synthetic */ void mo36681a(C22293f fVar, int i) {
                    if (C32928h.this.f78344a != null && !C32928h.this.f78345b) {
                        new C79459a(C32928h.this.f78344a.get()).mo123052a(C33043l.m67677a(fVar)).mo123053a();
                    }
                    C32928h.this.mo58697a(hVar, i);
                }
            };
            C22374d.m42169a(C31291a.f74991a).mo36637a(this.f78348e, this.f78347d);
        }
    }
}
