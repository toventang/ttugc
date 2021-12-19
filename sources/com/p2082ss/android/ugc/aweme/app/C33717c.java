package com.p2082ss.android.ugc.aweme.app;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.MobClick;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.app.c */
public final class C33717c {

    /* renamed from: a */
    public static boolean f79879a;

    /* renamed from: b */
    public static final C33718a f79880b = new C33718a((byte) 0);

    static {
        Covode.recordClassIndex(40612);
    }

    /* renamed from: com.ss.android.ugc.aweme.app.c$a */
    public static final class C33718a {
        static {
            Covode.recordClassIndex(40613);
        }

        private C33718a() {
        }

        public /* synthetic */ C33718a(byte b) {
            this();
        }

        /* renamed from: a */
        public static void m69039a(String str, Uri uri) {
            String str2;
            if (uri != null) {
                str2 = uri.getQueryParameter("gd_label");
            } else {
                str2 = null;
            }
            C33796j a = C33796j.m69147a();
            C89219l.m154716b(a, "");
            a.f80041b = false;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("land_position", str);
                C39162r.onEvent(MobClick.obtain().setEventName("launch_app").setLabelName(str2).setJsonObject(jSONObject));
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (C33717c.f79879a) {
                C39162r.m79460a("open_url", new C33744d().mo59983a("enter_to", str).mo59983a("url", String.valueOf(uri)).f79943a);
                C33717c.f79879a = false;
            }
        }
    }
}
