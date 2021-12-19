package com.bytedance.ies.bullet.service.p1172f;

import android.net.Uri;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.AbstractC16594ae;
import com.bytedance.ies.bullet.service.base.AbstractC16595af;
import com.bytedance.ies.bullet.service.base.C16630d;
import com.bytedance.ies.bullet.service.base.p1163a.C16583n;
import com.bytedance.ies.bullet.service.base.p1164b.C16616a;
import com.bytedance.ies.bullet.service.base.p1164b.C16622e;
import com.bytedance.ies.bullet.service.p1161a.AbstractC16559e;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.EnumC16723b;
import com.bytedance.ies.bullet.service.p1172f.p1177b.C16857a;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.ies.bullet.service.f.g */
public final class C16863g extends C16616a implements AbstractC16595af {

    /* renamed from: a */
    public static final C16864a f40081a = new C16864a((byte) 0);

    /* renamed from: b */
    private final AbstractC16594ae f40082b;

    static {
        Covode.recordClassIndex(19303);
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.g$a */
    public static final class C16864a {
        static {
            Covode.recordClassIndex(19304);
        }

        private C16864a() {
        }

        public /* synthetic */ C16864a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.AbstractC16595af
    /* renamed from: b */
    public final AbstractC16594ae mo26366b() {
        return this.f40082b;
    }

    public C16863g(AbstractC16594ae aeVar) {
        C89219l.m154719c(aeVar, "");
        this.f40082b = aeVar;
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.g$b */
    public static final class C16865b {

        /* renamed from: a */
        public final Uri f40083a;

        /* renamed from: b */
        public final EnumC16723b f40084b;

        static {
            Covode.recordClassIndex(19305);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C16865b)) {
                return false;
            }
            C16865b bVar = (C16865b) obj;
            return C89219l.m154714a(this.f40083a, bVar.f40083a) && C89219l.m154714a(this.f40084b, bVar.f40084b);
        }

        public final int hashCode() {
            Uri uri = this.f40083a;
            int i = 0;
            int hashCode = (uri != null ? uri.hashCode() : 0) * 31;
            EnumC16723b bVar = this.f40084b;
            if (bVar != null) {
                i = bVar.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            return "SchemaInfo(realHostUri=" + this.f40083a + ", type=" + this.f40084b + ")";
        }

        public C16865b(Uri uri, EnumC16723b bVar) {
            C89219l.m154719c(uri, "");
            C89219l.m154719c(bVar, "");
            this.f40083a = uri;
            this.f40084b = bVar;
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.AbstractC16595af
    /* renamed from: a */
    public final C16630d mo26365a(String str, List<String> list) {
        C89219l.m154719c(str, "");
        return C16859d.m31080a(str, list);
    }

    /* renamed from: a */
    private static List<String> m31090a(Uri uri, List<String> list) {
        List<String> g = C89070n.m154585g((Collection) list);
        String a = C16857a.m31078a(uri, "package_name");
        if (a != null) {
            for (T t : C89361p.m154915b(a, new String[]{","})) {
                if (t.length() > 0 && !g.contains(t)) {
                    g.add(t);
                }
            }
        }
        return g;
    }

    /* renamed from: a */
    private static String m31089a(Uri uri, Bundle bundle) {
        Set<String> a;
        String a2;
        String string = bundle.getString("__x_session_id");
        if (string == null || string.length() == 0) {
            string = C16583n.m30793a();
            bundle.putString("__x_session_id", string);
        }
        AbstractC16559e<String, Object> a3 = C16622e.C16623a.m30858a().mo26339a(string);
        if (!(a3 == null || (a = C16857a.m31079a(uri)) == null)) {
            for (T t : a) {
                if (!(t == null || (a2 = C16857a.m31078a(uri, (String) t)) == null || a2.length() == 0)) {
                    a3.putStringIfAbsent(t, a2);
                }
            }
        }
        return string;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01a0, code lost:
        if (r11.equals("webview_page") != false) goto L_0x023c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01aa, code lost:
        if (r11.equals("lynxview_page") != false) goto L_0x0213;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01b1, code lost:
        if (r11.equals("webview") != false) goto L_0x023c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01bb, code lost:
        if (r11.equals("lynx_popup") != false) goto L_0x0213;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01c4, code lost:
        if (r11.equals("lynx_page") != false) goto L_0x0213;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01cd, code lost:
        if (r11.equals("reactnative_popup") != false) goto L_0x01ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01d6, code lost:
        if (r11.equals("lynxview_popup") != false) goto L_0x0213;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01df, code lost:
        if (r11.equals("reactnative") != false) goto L_0x01ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01e8, code lost:
        if (r11.equals("reactnative_page") != false) goto L_0x01ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01ea, code lost:
        if (r15 == null) goto L_0x01f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01f0, code lost:
        if (r15.length() != 0) goto L_0x01fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01f2, code lost:
        r11 = new com.bytedance.ies.bullet.service.p1172f.C16863g.C16865b(r1, com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.EnumC16723b.RN);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01fb, code lost:
        r1 = android.net.Uri.parse(r15);
        p4600h.p4611f.p4613b.C89219l.m154709a((java.lang.Object) r1, "");
        r11 = new com.bytedance.ies.bullet.service.p1172f.C16863g.C16865b(r1, com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.EnumC16723b.RN);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0211, code lost:
        if (r11.equals("lynxview") != false) goto L_0x0213;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0213, code lost:
        if (r13 == null) goto L_0x021b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0219, code lost:
        if (r13.length() != 0) goto L_0x0224;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x021b, code lost:
        r11 = new com.bytedance.ies.bullet.service.p1172f.C16863g.C16865b(r1, com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.EnumC16723b.LYNX);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0224, code lost:
        r1 = android.net.Uri.parse(r13);
        p4600h.p4611f.p4613b.C89219l.m154709a((java.lang.Object) r1, "");
        r11 = new com.bytedance.ies.bullet.service.p1172f.C16863g.C16865b(r1, com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.EnumC16723b.LYNX);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x023a, code lost:
        if (r11.equals("webview_popup") != false) goto L_0x023c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x023c, code lost:
        if (r13 == null) goto L_0x0244;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0242, code lost:
        if (r13.length() != 0) goto L_0x0265;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0244, code lost:
        if (r15 == null) goto L_0x024c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x024a, code lost:
        if (r15.length() != 0) goto L_0x0255;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x024c, code lost:
        r11 = new com.bytedance.ies.bullet.service.p1172f.C16863g.C16865b(r1, com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.EnumC16723b.WEB);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0255, code lost:
        r1 = android.net.Uri.parse(r15);
        p4600h.p4611f.p4613b.C89219l.m154709a((java.lang.Object) r1, "");
        r11 = new com.bytedance.ies.bullet.service.p1172f.C16863g.C16865b(r1, com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.EnumC16723b.RN);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0265, code lost:
        r1 = android.net.Uri.parse(r13);
        p4600h.p4611f.p4613b.C89219l.m154709a((java.lang.Object) r1, "");
        r11 = new com.bytedance.ies.bullet.service.p1172f.C16863g.C16865b(r1, com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.EnumC16723b.LYNX);
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0183  */
    @Override // com.bytedance.ies.bullet.service.base.AbstractC16595af
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.net.Uri mo26364a(android.net.Uri r19, android.os.Bundle r20, java.util.List<java.lang.String> r21, java.util.List<? extends com.bytedance.ies.bullet.service.base.AbstractC16646g> r22) {
        /*
        // Method dump skipped, instructions count: 682
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.service.p1172f.C16863g.mo26364a(android.net.Uri, android.os.Bundle, java.util.List, java.util.List):android.net.Uri");
    }
}
