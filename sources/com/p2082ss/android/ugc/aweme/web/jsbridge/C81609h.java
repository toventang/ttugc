package com.p2082ss.android.ugc.aweme.web.jsbridge;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.AbstractC18293d;
import com.bytedance.ies.web.p1285a.C18288a;
import com.bytedance.ies.web.p1285a.C18297h;
import java.lang.ref.WeakReference;
import org.json.JSONObject;
import p077b.AbstractC1729g;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.h */
public final class C81609h implements AbstractC18293d {

    /* renamed from: a */
    WeakReference<Context> f182497a;

    /* renamed from: b */
    public C18288a f182498b;

    static {
        Covode.recordClassIndex(95006);
    }

    public C81609h(WeakReference<Context> weakReference, C18288a aVar) {
        this.f182497a = weakReference;
        this.f182498b = aVar;
    }

    @Override // com.bytedance.ies.web.p1285a.AbstractC18293d
    public final void call(C18297h hVar, JSONObject jSONObject) {
        if (hVar != null && hVar.f43671d != null) {
            hVar.f43676i = false;
            float scale = this.f182498b.f43654d.getScale();
            int i = (int) (((float) hVar.f43671d.getInt("width")) * scale);
            int i2 = (int) (((float) hVar.f43671d.getInt("height")) * scale);
            int i3 = (int) (((float) hVar.f43671d.getInt("left")) * scale);
            int i4 = (int) (((float) hVar.f43671d.getInt("top")) * scale);
            int optInt = hVar.f43671d.optInt("format", 0);
            final String str = hVar.f43669b;
            C18288a aVar = this.f182498b;
            if (aVar != null && aVar.f43654d != null) {
                C1731i.m5640b(new CallableC81611i(this, i, i2, i3, i4), C1731i.f5564c).mo5534a(new C81612j(this, optInt), C1731i.f5562a, null).mo5534a(new AbstractC1729g<JSONObject, Void>() {
                    /* class com.p2082ss.android.ugc.aweme.web.jsbridge.C81609h.C816101 */

                    static {
                        Covode.recordClassIndex(95007);
                    }

                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public Void then(C1731i<JSONObject> iVar) {
                        if (iVar.mo5545d() == null) {
                            return null;
                        }
                        C81609h.this.f182498b.mo29249a(str, iVar.mo5545d());
                        return null;
                    }
                }, C1731i.f5564c, null);
            }
        }
    }
}
