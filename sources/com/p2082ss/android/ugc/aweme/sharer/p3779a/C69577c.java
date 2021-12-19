package com.p2082ss.android.ugc.aweme.sharer.p3779a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sharer.a.c */
public final class C69577c {

    /* renamed from: b */
    public static final String f155401b = "com.nhn.android.appstore";

    /* renamed from: c */
    public static final String f155402c = "market://details?id=com.nhn.android.blog";

    /* renamed from: d */
    public static final String f155403d = "appstore://store?version=7&action=view&packageName=com.nhn.android.blog";

    /* renamed from: e */
    public static final String f155404e = "naverblog";

    /* renamed from: f */
    public static final String f155405f = "write";

    /* renamed from: g */
    public static final String f155406g = "version";

    /* renamed from: h */
    public static final String f155407h = "title";

    /* renamed from: i */
    public static final String f155408i = "content";

    /* renamed from: j */
    public static final String f155409j = "imageUrls";

    /* renamed from: k */
    public static final String f155410k = "videoUrls";

    /* renamed from: l */
    public static final String f155411l = "ogTagUrls";

    /* renamed from: m */
    public static final String f155412m = "tags";

    /* renamed from: n */
    public static final C69579b f155413n = new C69579b((byte) 0);

    /* renamed from: a */
    public final Context f155414a;

    /* renamed from: com.ss.android.ugc.aweme.sharer.a.c$a */
    public static final class C69578a {

        /* renamed from: a */
        public static final C69578a f155415a = new C69578a();

        private C69578a() {
        }

        static {
            Covode.recordClassIndex(81924);
        }

        /* renamed from: a */
        public static void m122791a(Uri.Builder builder, String str, List<String> list) {
            if (list != null) {
                builder.appendQueryParameter(str, new JSONArray((Collection) list).toString());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sharer.a.c$b */
    public static final class C69579b {
        static {
            Covode.recordClassIndex(81925);
        }

        private C69579b() {
        }

        public /* synthetic */ C69579b(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(81923);
    }

    public C69577c(Context context) {
        C89219l.m154721d(context, "");
        this.f155414a = context;
    }

    /* renamed from: a */
    public final boolean mo109797a(String str) {
        try {
            if (this.f155414a.getPackageManager().getPackageInfo(str, 0) != null) {
                return true;
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* renamed from: a */
    public static void m122789a(Context context, Intent intent) {
        C84349a.m145093a(intent, context);
        context.startActivity(intent);
    }
}
