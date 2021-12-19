package com.p2082ss.android.ugc.tiktok.deeplink.impl;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.tiktok.deeplink.C84298a;
import com.p2082ss.android.ugc.tiktok.deeplink.C84299b;
import java.util.concurrent.Callable;
import java.util.regex.Pattern;
import org.json.JSONObject;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89391z;

/* renamed from: com.ss.android.ugc.tiktok.deeplink.impl.d */
public final class C84306d {

    /* renamed from: a */
    public static final C84306d f188525a = new C84306d();

    private C84306d() {
    }

    static {
        Covode.recordClassIndex(98230);
    }

    /* renamed from: com.ss.android.ugc.tiktok.deeplink.impl.d$a */
    static final class CallableC84307a<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C84298a f188526a;

        /* renamed from: b */
        final /* synthetic */ boolean f188527b;

        /* renamed from: c */
        final /* synthetic */ C84299b f188528c;

        static {
            Covode.recordClassIndex(98231);
        }

        CallableC84307a(C84298a aVar, boolean z, C84299b bVar) {
            this.f188526a = aVar;
            this.f188527b = z;
            this.f188528c = bVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C89379q<? extends C89391z> call() {
            Object obj;
            try {
                Uri uri = this.f188526a.f188498a;
                C89391z zVar = null;
                if (uri != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("scheme", uri.getScheme());
                    jSONObject.put("host", uri.getHost());
                    jSONObject.put("uri", uri);
                    if (TextUtils.isEmpty(uri.getPath())) {
                        jSONObject.put("schema", uri.getScheme() + "://" + uri.getHost());
                    } else {
                        jSONObject.put("schema", uri.getScheme() + "://" + uri.getHost() + '/' + uri.getPath());
                        jSONObject.put("path", uri.getPath());
                    }
                    jSONObject.put("intercepted", this.f188527b);
                    jSONObject.put("allow", this.f188528c.f188508i);
                    C12290b.m22066a("monitor_deeplink_intercept", jSONObject, (JSONObject) null, (JSONObject) null);
                    zVar = C89391z.f203057a;
                }
                obj = C89379q.m157068constructorimpl(zVar);
            } catch (Throwable th) {
                obj = C89379q.m157068constructorimpl(C89382r.m154941a(th));
            }
            return C89379q.m157067boximpl(obj);
        }
    }

    /* renamed from: a */
    static boolean m145004a(String str, String str2) {
        try {
            return Pattern.compile(str).matcher(str2).find();
        } catch (Exception unused) {
            return false;
        }
    }
}
