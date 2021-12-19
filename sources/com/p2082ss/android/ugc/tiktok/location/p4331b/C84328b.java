package com.p2082ss.android.ugc.tiktok.location.p4331b;

import android.app.Application;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.bdlocation.p846a.C13153b;
import com.bytedance.bdlocation.p847b.AbstractC13159a;
import com.bytedance.bdlocation.p848c.C13162b;
import com.bytedance.bdlocation.p849d.AbstractC13165a;
import com.bytedance.bdlocation.p849d.C13166b;
import com.bytedance.bdlocation.p850e.AbstractC13168a;
import com.bytedance.bpea.basics.AbstractC13343d;
import com.bytedance.bpea.basics.C13340a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.retrofit2.client.C22027b;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.tiktok.location.net.TikTokLocationApi;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.tiktok.location.b.b */
public final class C84328b {

    /* renamed from: a */
    public static final C84329a f188560a = new C84329a((byte) 0);

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.tiktok.location.b.b$b */
    public static final class C84330b implements AbstractC13159a {

        /* renamed from: a */
        public static final C84330b f188561a = new C84330b();

        static {
            Covode.recordClassIndex(98260);
        }

        C84330b() {
        }
    }

    static {
        Covode.recordClassIndex(98258);
    }

    /* renamed from: com.ss.android.ugc.tiktok.location.b.b$a */
    public static final class C84329a {
        static {
            Covode.recordClassIndex(98259);
        }

        private C84329a() {
        }

        public /* synthetic */ C84329a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    private static Locale m145030a() {
        if (Build.VERSION.SDK_INT >= 24) {
            Resources resources = C17867d.m33078a().getResources();
            C89219l.m154716b(resources, "");
            Configuration configuration = resources.getConfiguration();
            C89219l.m154716b(configuration, "");
            return configuration.getLocales().get(0);
        }
        Resources resources2 = C17867d.m33078a().getResources();
        C89219l.m154716b(resources2, "");
        return resources2.getConfiguration().locale;
    }

    /* renamed from: a */
    public static void m145031a(AbstractC13343d dVar) {
        C89219l.m154721d(dVar, "");
        String str = C17867d.f42587k.f42569a;
        if (TextUtils.isEmpty(str)) {
            C51423a.m95792b("LocationInitializer", "Api host is null");
            return;
        }
        if (!C89361p.m154874b(str, "https://", false)) {
            str = "https://".concat(String.valueOf(str));
        }
        C13153b.m23673a(str);
        C13153b.f32067z = C84330b.f188561a;
        C13153b.f32066y = C84331c.f188562a;
        C13162b.m23682a(new C84327a());
        C84333c a = C84334d.m145034a();
        boolean z = true;
        if (a != null) {
            if (a.f188564a != 1) {
                z = false;
            }
            C13153b.f32046e = z;
            C13153b.f32049h = a.f188565b;
            C13153b.f32057p = a.f188566c;
            C13153b.f32051j = a.f188567d;
        } else {
            C13153b.f32046e = true;
        }
        C13153b.f32045d = false;
        C13153b.f32053l = 0;
        C13153b.f32060s = m145030a();
        try {
            C13153b.m23672a((Application) C17867d.m33078a(), dVar);
        } catch (C13340a e) {
            C51423a.m95790a((Throwable) e);
        }
        C13166b.f32099a = C84332d.f188563a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.tiktok.location.b.b$d */
    public static final class C84332d implements AbstractC13165a {

        /* renamed from: a */
        public static final C84332d f188563a = new C84332d();

        static {
            Covode.recordClassIndex(98262);
        }

        C84332d() {
        }

        @Override // com.bytedance.bdlocation.p849d.AbstractC13165a
        /* renamed from: a */
        public final void mo21273a(String str, JSONObject jSONObject) {
            try {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (jSONObject != null) {
                    String optString = jSONObject.optString("upload_source");
                    C89219l.m154716b(optString, "");
                    linkedHashMap.put("upload_source", optString);
                    String optString2 = jSONObject.optString("status");
                    C89219l.m154716b(optString2, "");
                    linkedHashMap.put("status", optString2);
                }
                C39162r.m79460a(str, linkedHashMap);
                C89379q.m157068constructorimpl(C89391z.f203057a);
            } catch (Throwable th) {
                C89379q.m157068constructorimpl(C89382r.m154941a(th));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.tiktok.location.b.b$c */
    public static final class C84331c implements AbstractC13168a {

        /* renamed from: a */
        public static final C84331c f188562a = new C84331c();

        static {
            Covode.recordClassIndex(98261);
        }

        C84331c() {
        }

        @Override // com.bytedance.bdlocation.p850e.AbstractC13168a
        /* renamed from: a */
        public final String mo21274a(String str, String str2, Map<String, String> map, TypedOutput typedOutput, List<C22027b> list, boolean z) {
            return TikTokLocationApi.f188570a.mo21274a(str, str2, map, typedOutput, list, z);
        }
    }
}
