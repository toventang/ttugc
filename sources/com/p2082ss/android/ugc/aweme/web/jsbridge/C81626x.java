package com.p2082ss.android.ugc.aweme.web.jsbridge;

import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.ies.web.p1285a.AbstractC18293d;
import com.bytedance.ies.web.p1285a.C18288a;
import com.bytedance.ies.web.p1285a.C18297h;
import com.p2082ss.android.sdk.webview.C30246d;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.x */
public final class C81626x implements AbstractC18293d {

    /* renamed from: a */
    protected WeakReference<Context> f182517a;

    /* renamed from: b */
    private C18288a f182518b;

    static {
        Covode.recordClassIndex(95023);
    }

    public C81626x(WeakReference<Context> weakReference, C18288a aVar) {
        this.f182517a = weakReference;
        this.f182518b = aVar;
    }

    /* renamed from: a */
    public final void mo125294a(C18297h hVar, boolean z) {
        int i;
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
        this.f182518b.mo29249a(hVar.f43669b, jSONObject);
    }

    @Override // com.bytedance.ies.web.p1285a.AbstractC18293d
    public final void call(final C18297h hVar, JSONObject jSONObject) {
        Context a;
        String str;
        WeakReference<Context> weakReference = this.f182517a;
        if (weakReference != null && weakReference.get() != null && (a = C30246d.m61213a(this.f182517a.get())) != null) {
            hVar.f43676i = false;
            String optString = hVar.f43671d.optString("content");
            String optString2 = hVar.f43671d.optString("title");
            String optString3 = hVar.f43671d.optString("confirm_text");
            String optString4 = hVar.f43671d.optString("cancel_text");
            final boolean optBoolean = hVar.f43671d.optBoolean("swap");
            C17197a.C17200a aVar = new C17197a.C17200a(a);
            aVar.f41070a = optString2;
            aVar.f41071b = optString;
            if (optBoolean) {
                str = optString4;
            } else {
                str = optString3;
            }
            C17197a.C17200a a2 = aVar.mo27192a(str, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                /* class com.p2082ss.android.ugc.aweme.web.jsbridge.C81626x.DialogInterface$OnClickListenerC816282 */

                static {
                    Covode.recordClassIndex(95025);
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    C81626x.this.mo125294a(hVar, !optBoolean);
                }
            }, false);
            if (!optBoolean) {
                optString3 = optString4;
            }
            a2.mo27196b(optString3, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                /* class com.p2082ss.android.ugc.aweme.web.jsbridge.C81626x.DialogInterface$OnClickListenerC816271 */

                static {
                    Covode.recordClassIndex(95024);
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    C81626x.this.mo125294a(hVar, optBoolean);
                }
            }, false);
            aVar.mo27193a().mo27184b().setCancelable(false);
        }
    }
}
