package com.bytedance.bridge.magpie.impl.p888b;

import android.text.TextUtils;
import android.util.Base64;
import android.webkit.JavascriptInterface;
import com.C1764a;
import com.bytedance.bridge.magpie.C13402a;
import com.bytedance.bridge.magpie.p883b.C13428a;
import com.bytedance.bridge.magpie.p883b.C13434c;
import com.bytedance.covode.number.Covode;
import java.nio.charset.Charset;
import java.util.Arrays;
import org.json.JSONObject;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89338d;

/* renamed from: com.bytedance.bridge.magpie.impl.b.b */
public final class C13458b extends AbstractC13459c {

    /* renamed from: d */
    private final String f32791d = "JSB3BridgeImpl";

    static {
        Covode.recordClassIndex(15458);
    }

    @Override // com.bytedance.bridge.magpie.impl.p888b.AbstractC13459c
    /* renamed from: b */
    public final String mo21688b() {
        return this.f32793b;
    }

    @JavascriptInterface
    public final void invokeMethod(String str) {
        mo21690b(str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13458b(C13402a aVar) {
        super(aVar);
        C89219l.m154719c(aVar, "");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002f, code lost:
        if (r0 == null) goto L_0x0031;
     */
    @Override // com.bytedance.bridge.magpie.impl.p888b.AbstractC13459c
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bytedance.bridge.magpie.p883b.C13428a mo21686a(java.lang.String r5) {
        /*
        // Method dump skipped, instructions count: 122
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.bridge.magpie.impl.p888b.C13458b.mo21686a(java.lang.String):com.bytedance.bridge.magpie.b.a");
    }

    @Override // com.bytedance.bridge.magpie.impl.p888b.AbstractC13459c
    /* renamed from: a */
    public final String mo21687a(C13428a aVar, C13434c cVar) {
        C89219l.m154719c(cVar, "");
        JSONObject jSONObject = new JSONObject();
        if (aVar == null) {
            C89219l.m154707a();
        }
        jSONObject.put("__callback_id", aVar.f32732a);
        if (cVar.f32752a != null) {
            jSONObject.put("__params", cVar.f32752a);
        } else {
            jSONObject.put("code", cVar.f32753b);
            jSONObject.put("detail", cVar.f32754c);
        }
        jSONObject.put("__msg_type", "callback");
        if (TextUtils.isEmpty(aVar.f32739h)) {
            return "javascript:" + this.f32793b + "._handleMessageFromToutiao(" + jSONObject + ')';
        }
        String str = aVar.f32739h;
        Charset charset = C89338d.f202990a;
        if (str != null) {
            byte[] bytes = str.getBytes(charset);
            C89219l.m154709a((Object) bytes, "");
            String encodeToString = Base64.encodeToString(bytes, 2);
            C89219l.m154709a((Object) encodeToString, "");
            String a = C1764a.m5928a("iframe[src=\"%s\"", Arrays.copyOf(new Object[]{str}, 1));
            C89219l.m154709a((Object) a, "");
            Charset charset2 = C89338d.f202990a;
            if (a != null) {
                byte[] bytes2 = a.getBytes(charset2);
                C89219l.m154709a((Object) bytes2, "");
                String encodeToString2 = Base64.encodeToString(bytes2, 2);
                C89219l.m154709a((Object) encodeToString2, "");
                String a2 = C1764a.m5928a("javascript:(function(){   const iframe = document.querySelector(atob('%s'));   if (iframe && iframe.contentWindow) {        iframe.contentWindow.postMessage(%s, atob('%s'));   }})()", Arrays.copyOf(new Object[]{encodeToString2, jSONObject, encodeToString}, 3));
                C89219l.m154709a((Object) a2, "");
                return a2;
            }
            throw new C89388w("null cannot be cast to non-null type");
        }
        throw new C89388w("null cannot be cast to non-null type");
    }
}
