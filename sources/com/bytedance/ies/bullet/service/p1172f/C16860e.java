package com.bytedance.ies.bullet.service.p1172f;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.AbstractC16599ai;
import com.bytedance.ies.bullet.service.base.AbstractC16646g;
import com.bytedance.ies.bullet.service.base.AbstractC16700z;
import com.bytedance.ies.bullet.service.base.p1163a.AbstractC16580l;
import com.bytedance.ies.bullet.service.base.p1164b.C16622e;
import com.bytedance.ies.bullet.service.p1161a.AbstractC16559e;
import com.bytedance.ies.bullet.service.p1172f.p1177b.C16857a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.ies.bullet.service.f.e */
public final class C16860e {

    /* renamed from: a */
    public static final C16860e f40074a = new C16860e();

    private C16860e() {
    }

    static {
        Covode.recordClassIndex(19300);
    }

    /* renamed from: b */
    public static Uri m31085b(Uri uri, Uri uri2, Bundle bundle, List<? extends AbstractC16646g> list) {
        C89219l.m154719c(uri, "");
        C89219l.m154719c(bundle, "");
        if (list != null) {
            for (T t : list) {
                if (t instanceof AbstractC16700z) {
                    uri = t.mo26406a(uri, bundle);
                }
            }
        }
        C89219l.m154719c(uri, "");
        String a = C16857a.m31078a(uri, "channel_name");
        String a2 = C16857a.m31078a(uri, "channel");
        if (TextUtils.isEmpty(a2)) {
            a2 = (a == null || C89361p.m154876c(a, "_android", false)) ? null : a + "_android";
        }
        C89219l.m154719c(uri, "");
        String a3 = C16857a.m31078a(uri, "bundle_name");
        String a4 = C16857a.m31078a(uri, "bundle");
        if (TextUtils.isEmpty(a4)) {
            a4 = a3 != null ? a3 + ".android.jsbundle" : null;
        }
        String a5 = C16857a.m31078a(uri, "module_name");
        String string = bundle.getString("__x_session_id");
        if (string != null) {
            AbstractC16580l a6 = C16622e.C16623a.m30858a();
            C89219l.m154709a((Object) string, "");
            AbstractC16559e<String, Object> a7 = a6.mo26339a(string);
            if (a7 != null) {
                if (a2 != null) {
                    a7.putStringIfAbsent("__x_param_channel", a2);
                }
                if (a4 != null) {
                    a7.putStringIfAbsent("__x_param_bundle", a4);
                }
                if (a5 != null) {
                    a7.putStringIfAbsent("__x_param_module", a5);
                }
            }
        }
        Uri.Builder scheme = new Uri.Builder().scheme("react-native");
        if (a2 == null) {
            a2 = "";
        }
        Uri.Builder authority = scheme.authority(a2);
        if (a4 != null) {
            authority.path(a4);
        }
        if (a5 != null) {
            authority.appendPath(a5);
        }
        if (uri2 != null) {
            authority.appendQueryParameter("fallback_url", m31084a(uri2, uri, bundle, list, true).toString());
        }
        Set<String> a8 = C16857a.m31079a(uri);
        if (a8 != null) {
            for (T t2 : a8) {
                if (t2 != null && (!C89219l.m154714a((Object) t2, (Object) "package_name")) && (!C89219l.m154714a((Object) t2, (Object) "fallback_url")) && (!C89219l.m154714a((Object) t2, (Object) "rn_schema")) && (!C89219l.m154714a((Object) t2, (Object) "lynx_schema"))) {
                    authority.appendQueryParameter(t2, C16857a.m31078a(uri, (String) t2));
                }
            }
        }
        Uri build = authority.build();
        C89219l.m154709a((Object) build, "");
        return build;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static Uri m31084a(Uri uri, Uri uri2, Bundle bundle, List<? extends AbstractC16646g> list, boolean z) {
        C89219l.m154719c(uri, "");
        C89219l.m154719c(uri2, "");
        C89219l.m154719c(bundle, "");
        if (list != null) {
            for (T t : list) {
                if (t instanceof AbstractC16599ai) {
                    uri = t.mo26406a(uri, bundle);
                }
            }
        }
        Uri.Builder buildUpon = uri.buildUpon();
        Set<String> a = C16857a.m31079a(uri);
        List c = C89070n.m154524c("package_name", "url", "surl", "fallback_url", "rn_schema", "lynx_schema");
        if (z) {
            c.add("channel");
            c.add("bundle");
            c.add("prefix");
            c.add("initial_data");
            c.add("lynx_landing_page_data");
            c.add("lynx_landing_page_title");
        }
        Set<String> a2 = C16857a.m31079a(uri2);
        if (a2 != null) {
            for (T t2 : a2) {
                if (t2 != null && ((a == null || !a.contains(t2)) && !c.contains(t2))) {
                    buildUpon.appendQueryParameter(t2, C16857a.m31078a(uri2, (String) t2));
                }
            }
        }
        Uri build = buildUpon.build();
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (T t3 : list) {
                if (t3 instanceof C16858c) {
                    arrayList.add(t3);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                it.next();
                C89219l.m154709a((Object) build, "");
                C89219l.m154719c(build, "");
                C89219l.m154719c(bundle, "");
            }
        }
        C89219l.m154709a((Object) build, "");
        return build;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0031, code lost:
        if (r11 != null) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0037, code lost:
        if (r2 == null) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0039, code lost:
        r2 = com.bytedance.ies.bullet.service.p1172f.p1177b.C16857a.m31078a(r7, "bundle");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003f, code lost:
        r1 = r9.getString("__x_session_id");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0045, code lost:
        if (r1 == null) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0047, code lost:
        r0 = com.bytedance.ies.bullet.service.base.p1164b.C16622e.C16623a.m30858a();
        p4600h.p4611f.p4613b.C89219l.m154709a((java.lang.Object) r1, "");
        r1 = r0.mo26339a(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0052, code lost:
        if (r1 == null) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0054, code lost:
        if (r3 == null) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0056, code lost:
        r1.putStringIfAbsent("__x_param_channel", r3);
        r9.putString("__x_param_channel", r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005e, code lost:
        if (r2 == null) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0060, code lost:
        r1.putStringIfAbsent("__x_param_bundle", r2);
        r9.putString("__x_param_bundle", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0068, code lost:
        r0 = new android.net.Uri.Builder().scheme("lynxview");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0073, code lost:
        if (r3 != null) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0075, code lost:
        r3 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0076, code lost:
        r3 = r0.authority(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007a, code lost:
        if (r2 == null) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007c, code lost:
        r3.path(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0082, code lost:
        if (r8 == null) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0084, code lost:
        r3.appendQueryParameter("fallback_url", m31084a(r8, r7, r9, r10, true).toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008f, code lost:
        r0 = com.bytedance.ies.bullet.service.p1172f.p1177b.C16857a.m31079a(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0093, code lost:
        if (r0 == null) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0095, code lost:
        r6 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x009d, code lost:
        if (r6.hasNext() == false) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x009f, code lost:
        r4 = r6.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a5, code lost:
        if (r4 == null) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ae, code lost:
        if ((!p4600h.p4611f.p4613b.C89219l.m154714a((java.lang.Object) r4, (java.lang.Object) "package_name")) == false) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b5, code lost:
        if ((!p4600h.p4611f.p4613b.C89219l.m154714a((java.lang.Object) r4, (java.lang.Object) "fallback_url")) == false) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00be, code lost:
        if ((!p4600h.p4611f.p4613b.C89219l.m154714a((java.lang.Object) r4, (java.lang.Object) "rn_schema")) == false) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c7, code lost:
        if ((!p4600h.p4611f.p4613b.C89219l.m154714a((java.lang.Object) r4, (java.lang.Object) "lynx_schema")) == false) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c9, code lost:
        r3.appendQueryParameter(r4, com.bytedance.ies.bullet.service.p1172f.p1177b.C16857a.m31078a(r7, (java.lang.String) r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d1, code lost:
        r4 = r3.build();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d5, code lost:
        if (r10 == null) goto L_0x010b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00d7, code lost:
        r3 = new java.util.ArrayList();
        r2 = r10.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e4, code lost:
        if (r2.hasNext() == false) goto L_0x00f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00e6, code lost:
        r1 = r2.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00ec, code lost:
        if ((r1 instanceof com.bytedance.ies.bullet.service.p1172f.C16856b) == false) goto L_0x00e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00ee, code lost:
        r3.add(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00f2, code lost:
        r1 = r3.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00fc, code lost:
        if (r1.hasNext() == false) goto L_0x010b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00fe, code lost:
        r1.next();
        p4600h.p4611f.p4613b.C89219l.m154709a((java.lang.Object) r4, "");
        p4600h.p4611f.p4613b.C89219l.m154719c(r4, "");
        p4600h.p4611f.p4613b.C89219l.m154719c(r9, "");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x010b, code lost:
        p4600h.p4611f.p4613b.C89219l.m154709a((java.lang.Object) r4, "");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x010e, code lost:
        return r4;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.net.Uri m31083a(android.net.Uri r7, android.net.Uri r8, android.os.Bundle r9, java.util.List<? extends com.bytedance.ies.bullet.service.base.AbstractC16646g> r10, com.bytedance.ies.bullet.service.base.C16630d r11) {
        /*
        // Method dump skipped, instructions count: 271
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.service.p1172f.C16860e.m31083a(android.net.Uri, android.net.Uri, android.os.Bundle, java.util.List, com.bytedance.ies.bullet.service.base.d):android.net.Uri");
    }
}
