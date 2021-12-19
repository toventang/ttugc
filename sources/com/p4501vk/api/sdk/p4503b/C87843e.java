package com.p4501vk.api.sdk.p4503b;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.p4501vk.api.sdk.AbstractC87874e;
import com.p4501vk.api.sdk.C87860d;
import com.p4501vk.api.sdk.internal.C87901b;
import com.p4501vk.api.sdk.internal.C87902c;
import com.p4501vk.api.sdk.internal.C87905d;
import com.p4501vk.api.sdk.p4504c.C87852a;
import com.p4501vk.api.sdk.p4504c.C87854b;
import com.p4501vk.api.sdk.p4505d.C87866b;
import com.p4501vk.api.sdk.p4505d.C87871d;
import com.p4501vk.api.sdk.p4505d.C87873e;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.List;
import java.util.Map;
import okhttp3.AbstractC90025ab;
import okhttp3.C90029ac;
import okhttp3.C90047d;
import okhttp3.C90204w;
import okhttp3.Request;
import org.json.JSONArray;
import org.json.JSONObject;
import p4600h.C89387v;
import p4600h.C89388w;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89064i;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89338d;
import p4600h.p4622m.C89361p;

/* renamed from: com.vk.api.sdk.b.e */
public final class C87843e<T> extends AbstractC87840b<T> {

    /* renamed from: b */
    public final C87866b f199545b;

    /* renamed from: c */
    public final C87871d.C87872a f199546c;

    /* renamed from: d */
    public String f199547d;

    /* renamed from: e */
    public final String f199548e;

    /* renamed from: f */
    public final AbstractC87874e<T> f199549f;

    static {
        Covode.recordClassIndex(103853);
    }

    @Override // com.p4501vk.api.sdk.p4503b.AbstractC87840b
    /* renamed from: a */
    public final T mo142304a(C87839a aVar) {
        boolean z;
        String str;
        Map map;
        List<String> queryParameters;
        String str2 = "";
        C89219l.m154719c(aVar, str2);
        if (aVar.f199538a.length() > 0 && aVar.f199539b.length() > 0) {
            this.f199546c.mo142349a("captcha_sid", aVar.f199538a).mo142349a("captcha_key", aVar.f199539b);
        }
        if (aVar.f199540c) {
            this.f199546c.mo142349a("confirm", "1");
        }
        String a = this.f199546c.mo142351a("device_id");
        if (a == null) {
            a = str2;
        }
        if (C89361p.m154870a((CharSequence) a)) {
            a = this.f199547d;
        }
        C87871d.C87872a aVar2 = this.f199546c;
        if (a != null) {
            String lowerCase = a.toLowerCase();
            C89219l.m154709a((Object) lowerCase, str2);
            aVar2.mo142349a("device_id", lowerCase);
            String a2 = this.f199546c.mo142351a("lang");
            if (a2 == null) {
                a2 = str2;
            }
            if (C89361p.m154870a((CharSequence) a2)) {
                a2 = this.f199548e;
            }
            C87871d.C87872a aVar3 = this.f199546c;
            if (a2 != null) {
                String lowerCase2 = a2.toLowerCase();
                C89219l.m154709a((Object) lowerCase2, str2);
                aVar3.mo142349a("lang", lowerCase2);
                C87871d a3 = this.f199546c.mo142350a();
                C89219l.m154719c(a3, str2);
                C87866b bVar = this.f199545b;
                C89219l.m154719c(a3, str2);
                C89219l.m154719c(a3, str2);
                String str3 = bVar.f199582d;
                C89219l.m154719c(a3, str2);
                String str4 = bVar.f199583e;
                int i = bVar.f199584f.f199590a.f199516b;
                C89219l.m154719c(a3, str2);
                String str5 = a3.f199591a;
                String str6 = a3.f199592b;
                Map<String, String> map2 = a3.f199593c;
                C89219l.m154719c(str5, str2);
                C89219l.m154719c(str6, str2);
                C89219l.m154719c(map2, str2);
                if (str4 == null || str4.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    str = C87902c.m152913a(str6, map2, str3, i, true);
                } else {
                    String str7 = "/method/" + str5 + '?' + C87902c.m152913a(str6, map2, str3, i, false) + str4;
                    MessageDigest instance = MessageDigest.getInstance("MD5");
                    Charset charset = C89338d.f202990a;
                    if (str7 != null) {
                        byte[] bytes = str7.getBytes(charset);
                        C89219l.m154709a((Object) bytes, str2);
                        byte[] digest = instance.digest(bytes);
                        C89219l.m154709a((Object) digest, str2);
                        C87902c.C87903a aVar4 = C87902c.C87903a.f199648a;
                        str2 = str2;
                        C89219l.m154721d(digest, str2);
                        C89219l.m154721d(str2, str2);
                        C89219l.m154721d(str2, str2);
                        C89219l.m154721d(str2, str2);
                        C89219l.m154721d("...", str2);
                        String sb = ((StringBuilder) C89064i.m154475a(digest, new StringBuilder(), str2, str2, str2, "...", aVar4)).toString();
                        C89219l.m154716b(sb, str2);
                        str = C87902c.m152913a(str6, map2, str3, i, true) + "&sig=" + sb;
                    } else {
                        throw new C89388w("null cannot be cast to non-null type");
                    }
                }
                C90204w b = C90204w.m156843b("application/x-www-form-urlencoded; charset=utf-8");
                C89219l.m154719c(a3, str2);
                C89219l.m154719c(str, str2);
                if (C89361p.m154874b(a3.f199591a, "execute.", false)) {
                    Uri parse = Uri.parse("https://vk.com/?".concat(String.valueOf(str)));
                    if (parse.getQueryParameters("method").contains("execute") && (queryParameters = parse.getQueryParameters("code")) != null && !queryParameters.isEmpty()) {
                        throw new C87854b(15, a3.f199591a, false, "Hey dude don't execute your hacky code ;)", null, null, null, 112, null);
                    }
                }
                Request.C90016a a4 = new Request.C90016a().mo144694a(AbstractC90025ab.create(b, str)).mo144691a("https://" + bVar.f199581c + "/method/" + a3.f199591a).mo144695a(C90047d.f204177a);
                C87873e eVar = a3.f199594d;
                if (eVar != null) {
                    map = C89041ag.m154427b(C89387v.m154943a("UID", eVar.f199599a), C89387v.m154943a("AWAIT_NETWORK", eVar.f199600b), C89387v.m154943a("REASON", eVar.f199601c), C89387v.m154943a("RETRY_COUNT", eVar.f199602d));
                } else {
                    map = null;
                }
                Request a5 = a4.mo144690a(Map.class, map).mo144698a();
                C89219l.m154709a((Object) a5, str2);
                C89219l.m154719c(a5, str2);
                long j = bVar.f199584f.f199590a.f199521g;
                C89219l.m154719c(a5, str2);
                C90029ac b2 = bVar.mo142342a(j).mo144767a(a5).mo144709b();
                C89219l.m154709a((Object) b2, str2);
                String a6 = C87866b.m152861a(b2);
                String str8 = a3.f199591a;
                C89219l.m154719c(str8, str2);
                if (a6 != null) {
                    C89219l.m154719c(a6, str2);
                    C89219l.m154719c(a6, str2);
                    if (!C87901b.m152912a(a6, "error")) {
                        C89219l.m154719c(a6, str2);
                        C89219l.m154719c(a6, str2);
                        if (!C87901b.m152912a(a6, "execute_errors")) {
                            AbstractC87874e<T> eVar2 = this.f199549f;
                            if (eVar2 != null) {
                                return eVar2.mo142355a(a6);
                            }
                            return null;
                        }
                        C89219l.m154719c(a6, str2);
                        C89219l.m154719c(str8, str2);
                        C89219l.m154719c(a6, str2);
                        C89219l.m154719c(str8, str2);
                        JSONArray jSONArray = new JSONObject(a6).getJSONArray("execute_errors");
                        C89219l.m154709a((Object) jSONArray, str2);
                        throw C87905d.m152917a(jSONArray, str8);
                    }
                    C89219l.m154719c(a6, str2);
                    C89219l.m154719c(a6, str2);
                    JSONObject optJSONObject = new JSONObject(a6).optJSONObject("error");
                    C89219l.m154709a((Object) optJSONObject, str2);
                    throw C87905d.m152918a(optJSONObject, str8);
                }
                throw new C87852a("Response returned null instead of valid string response");
            }
            throw new C89388w("null cannot be cast to non-null type");
        }
        throw new C89388w("null cannot be cast to non-null type");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C87843e(C87860d dVar, C87866b bVar, C87871d.C87872a aVar, String str, String str2, AbstractC87874e<T> eVar) {
        super(dVar);
        C89219l.m154719c(dVar, "");
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        this.f199545b = bVar;
        this.f199546c = aVar;
        this.f199547d = str;
        this.f199548e = str2;
        this.f199549f = eVar;
    }
}
