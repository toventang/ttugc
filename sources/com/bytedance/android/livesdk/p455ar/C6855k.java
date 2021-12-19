package com.bytedance.android.livesdk.p455ar;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.live.sdk.msg.p4471b.AbstractC87077a;
import com.p2082ss.ugc.live.sdk.msg.p4471b.AbstractC87086h;
import com.p2082ss.ugc.live.sdk.msg.p4471b.EnumC87080d;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.Objects;

/* renamed from: com.bytedance.android.livesdk.ar.k */
public final class C6855k {

    /* renamed from: a */
    public EnumC87080d f17189a;

    /* renamed from: b */
    public String f17190b;

    /* renamed from: c */
    LinkedHashMap<String, String> f17191c = new LinkedHashMap<>();

    /* renamed from: d */
    LinkedHashMap<String, String> f17192d = new LinkedHashMap<>();

    /* renamed from: e */
    LinkedHashMap<String, String> f17193e = new LinkedHashMap<>();

    /* renamed from: f */
    public AbstractC87077a f17194f;

    /* renamed from: g */
    public AbstractC87086h f17195g;

    /* renamed from: h */
    private String f17196h = "";

    static {
        Covode.recordClassIndex(7593);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo13102a(Object obj) {
        Objects.requireNonNull(obj, "@Url parameter is null.");
        this.f17196h = obj.toString();
    }

    /* renamed from: a */
    public final String mo13101a(String str) {
        String str2 = this.f17196h;
        if (str2 == null || (!str2.startsWith("http://") && !this.f17196h.startsWith("https://"))) {
            return Uri.parse(str).buildUpon().encodedPath(this.f17196h).build().toString();
        }
        return this.f17196h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo13103a(String str, String str2) {
        this.f17191c.put(str, str2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo13104a(String str, String str2, boolean z) {
        if (str != null) {
            if (z) {
                try {
                    str = URLEncoder.encode(str, "UTF-8");
                    str2 = URLEncoder.encode(str2, "UTF-8");
                } catch (UnsupportedEncodingException e) {
                    throw new RuntimeException("Unable to convert query parameter \"" + str + "\" value to UTF-8: " + str2, e);
                }
            }
            if (str2 != null && !str2.isEmpty()) {
                this.f17192d.put(str, str2);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Query param name must not be null.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo13105b(String str, String str2, boolean z) {
        if (str != null) {
            if (z) {
                try {
                    str = URLEncoder.encode(str, "UTF-8");
                    str2 = URLEncoder.encode(str2, "UTF-8");
                } catch (UnsupportedEncodingException e) {
                    throw new RuntimeException("Unable to convert query parameter \"" + str + "\" value to UTF-8: " + str2, e);
                }
            }
            if (str2 != null && !str2.isEmpty()) {
                this.f17193e.put(str, str2);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("field param name must not be null.");
    }
}
