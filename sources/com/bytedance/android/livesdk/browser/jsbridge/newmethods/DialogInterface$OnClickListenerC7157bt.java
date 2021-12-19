package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.android.livesdkapi.depend.model.p686b.C11688a;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.bt */
final /* synthetic */ class DialogInterface$OnClickListenerC7157bt implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final C7156bs f17837a;

    /* renamed from: b */
    private final JSONObject f17838b;

    /* renamed from: c */
    private final long f17839c;

    /* renamed from: d */
    private final String f17840d;

    /* renamed from: e */
    private final String f17841e;

    /* renamed from: f */
    private final Context f17842f;

    static {
        Covode.recordClassIndex(7903);
    }

    DialogInterface$OnClickListenerC7157bt(C7156bs bsVar, JSONObject jSONObject, long j, String str, String str2, Context context) {
        this.f17837a = bsVar;
        this.f17838b = jSONObject;
        this.f17839c = j;
        this.f17840d = str;
        this.f17841e = str2;
        this.f17842f = context;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2;
        C7156bs bsVar = this.f17837a;
        JSONObject jSONObject = this.f17838b;
        long j = this.f17839c;
        String str = this.f17840d;
        String str2 = this.f17841e;
        Context context = this.f17842f;
        try {
            i2 = jSONObject.getInt("follow_status");
        } catch (Throwable unused) {
            i2 = 0;
        }
        C11688a aVar = new C11688a();
        aVar.f27934e = i2;
        aVar.f27935f = C11688a.EnumC11689a.FromWeb;
        aVar.f27930a = j;
        aVar.f27933d = str;
        aVar.f27932c = str2;
        bsVar.mo13374a(aVar, context);
    }
}
