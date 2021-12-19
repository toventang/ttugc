package com.bytedance.ies.bullet.service.p1172f.p1173a.p1176c;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.p1172f.p1177b.C16857a;
import java.util.Iterator;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.ies.bullet.service.f.a.c.g */
public final class C16823g {
    static {
        Covode.recordClassIndex(19263);
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.c.g$q */
    public static final class C16840q extends AbstractC89220m implements AbstractC89183m<Uri, String, String> {

        /* renamed from: a */
        public static final C16840q f40008a = new C16840q();

        static {
            Covode.recordClassIndex(19280);
        }

        C16840q() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ String invoke(Uri uri, String str) {
            Uri uri2 = uri;
            C89219l.m154719c(uri2, "");
            C89219l.m154719c(str, "");
            return uri2.getAuthority();
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.c.g$s */
    public static final class C16842s extends AbstractC89220m implements AbstractC89183m<Uri, String, String> {

        /* renamed from: a */
        public static final C16842s f40010a = new C16842s();

        static {
            Covode.recordClassIndex(19282);
        }

        C16842s() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ String invoke(Uri uri, String str) {
            Uri uri2 = uri;
            C89219l.m154719c(uri2, "");
            C89219l.m154719c(str, "");
            return uri2.getPath();
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.c.g$u */
    public static final class C16844u extends AbstractC89220m implements AbstractC89183m<Uri, String, List<String>> {

        /* renamed from: a */
        public static final C16844u f40012a = new C16844u();

        static {
            Covode.recordClassIndex(19284);
        }

        C16844u() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ List<String> invoke(Uri uri, String str) {
            Uri uri2 = uri;
            C89219l.m154719c(uri2, "");
            C89219l.m154719c(str, "");
            return uri2.getPathSegments();
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.c.g$a */
    public static final class C16824a extends AbstractC89220m implements AbstractC89183m<Uri, String, Boolean> {
        static {
            Covode.recordClassIndex(19264);
        }

        public C16824a() {
            super(2);
        }

        public final Boolean invoke(Uri uri, String str) {
            C89219l.m154719c(uri, "");
            C89219l.m154719c(str, "");
            String a = C16857a.m31078a(uri, str);
            if (a != null) {
                return Boolean.valueOf(C89219l.m154714a((Object) a, (Object) "1"));
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.c.g$c */
    public static final class C16826c extends AbstractC89220m implements AbstractC89183m<Uri, String, String> {
        static {
            Covode.recordClassIndex(19266);
        }

        public C16826c() {
            super(2);
        }

        public final String invoke(Uri uri, String str) {
            C89219l.m154719c(uri, "");
            C89219l.m154719c(str, "");
            String a = C16857a.m31078a(uri, str);
            if (a != null) {
                return a;
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.c.g$e */
    public static final class C16828e extends AbstractC89220m implements AbstractC89183m<Uri, String, List<? extends String>> {
        static {
            Covode.recordClassIndex(19268);
        }

        public C16828e() {
            super(2);
        }

        public final List<? extends String> invoke(Uri uri, String str) {
            C89219l.m154719c(uri, "");
            C89219l.m154719c(str, "");
            String a = C16857a.m31078a(uri, str);
            if (a != null) {
                return C89361p.m154915b(a, new String[]{","});
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.c.g$g */
    public static final class C16830g extends AbstractC89220m implements AbstractC89183m<Uri, String, Uri> {
        static {
            Covode.recordClassIndex(19270);
        }

        public C16830g() {
            super(2);
        }

        public final Uri invoke(Uri uri, String str) {
            C89219l.m154719c(uri, "");
            C89219l.m154719c(str, "");
            String a = C16857a.m31078a(uri, str);
            if (a != null) {
                return Uri.parse(a);
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.c.g$j */
    public static final class C16833j extends AbstractC89220m implements AbstractC89183m<Uri, String, Integer> {
        static {
            Covode.recordClassIndex(19273);
        }

        public C16833j() {
            super(2);
        }

        public final Integer invoke(Uri uri, String str) {
            C89219l.m154719c(uri, "");
            C89219l.m154719c(str, "");
            String a = C16857a.m31078a(uri, str);
            if (a != null) {
                return C89361p.m154863e(a);
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.c.g$l */
    public static final class C16835l extends AbstractC89220m implements AbstractC89183m<Uri, String, Long> {
        static {
            Covode.recordClassIndex(19275);
        }

        public C16835l() {
            super(2);
        }

        public final Long invoke(Uri uri, String str) {
            C89219l.m154719c(uri, "");
            C89219l.m154719c(str, "");
            String a = C16857a.m31078a(uri, str);
            if (a != null) {
                return C89361p.m154865g(a);
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.c.g$n */
    public static final class C16837n extends AbstractC89220m implements AbstractC89183m<Uri, String, Float> {
        static {
            Covode.recordClassIndex(19277);
        }

        public C16837n() {
            super(2);
        }

        public final Float invoke(Uri uri, String str) {
            C89219l.m154719c(uri, "");
            C89219l.m154719c(str, "");
            String a = C16857a.m31078a(uri, str);
            if (a != null) {
                return C89361p.m154861c(a);
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.c.g$p */
    public static final class C16839p extends AbstractC89220m implements AbstractC89183m<Uri, String, Double> {
        static {
            Covode.recordClassIndex(19279);
        }

        public C16839p() {
            super(2);
        }

        public final Double invoke(Uri uri, String str) {
            C89219l.m154719c(uri, "");
            C89219l.m154719c(str, "");
            String a = C16857a.m31078a(uri, str);
            if (a != null) {
                return C89361p.m154862d(a);
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.c.g$w */
    public static final class C16846w extends AbstractC89220m implements AbstractC89183m<Uri, String, String> {

        /* renamed from: a */
        public static final C16846w f40014a = new C16846w();

        static {
            Covode.recordClassIndex(19286);
        }

        C16846w() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ String invoke(Uri uri, String str) {
            Uri uri2 = uri;
            C89219l.m154719c(uri2, "");
            C89219l.m154719c(str, "");
            List<String> pathSegments = uri2.getPathSegments();
            if (pathSegments != null) {
                return C89070n.m154583g((List) pathSegments);
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.c.g$y */
    public static final class C16848y extends AbstractC89220m implements AbstractC89183m<Uri, String, String> {

        /* renamed from: a */
        public static final C16848y f40016a = new C16848y();

        static {
            Covode.recordClassIndex(19288);
        }

        C16848y() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ String invoke(Uri uri, String str) {
            Uri uri2 = uri;
            C89219l.m154719c(uri2, "");
            C89219l.m154719c(str, "");
            List<String> pathSegments = uri2.getPathSegments();
            if (pathSegments != null) {
                return C89070n.m154588i((List) pathSegments);
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.c.g$d */
    public static final class C16827d extends AbstractC89220m implements AbstractC89187q<Uri.Builder, String, String, Uri.Builder> {
        static {
            Covode.recordClassIndex(19267);
        }

        public C16827d() {
            super(3);
        }

        public final Uri.Builder invoke(Uri.Builder builder, String str, String str2) {
            C89219l.m154719c(builder, "");
            C89219l.m154719c(str, "");
            String str3 = str2;
            if (str3 != null) {
                builder.appendQueryParameter(str, str3);
            }
            return builder;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.c.g$b */
    public static final class C16825b extends AbstractC89220m implements AbstractC89187q<Uri.Builder, String, Double, Uri.Builder> {
        static {
            Covode.recordClassIndex(19265);
        }

        public C16825b() {
            super(3);
        }

        public final Uri.Builder invoke(Uri.Builder builder, String str, Double d) {
            C89219l.m154719c(builder, "");
            C89219l.m154719c(str, "");
            String valueOf = String.valueOf(d.doubleValue());
            if (valueOf != null) {
                builder.appendQueryParameter(str, valueOf);
            }
            return builder;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.c.g$f */
    public static final class C16829f extends AbstractC89220m implements AbstractC89187q<Uri.Builder, String, List<? extends String>, Uri.Builder> {
        static {
            Covode.recordClassIndex(19269);
        }

        public C16829f() {
            super(3);
        }

        public final Uri.Builder invoke(Uri.Builder builder, String str, List<? extends String> list) {
            C89219l.m154719c(builder, "");
            C89219l.m154719c(str, "");
            String a = C89070n.m154551a(list, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (AbstractC89172b) null, 62);
            if (a != null) {
                builder.appendQueryParameter(str, a);
            }
            return builder;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.c.g$h */
    public static final class C16831h extends AbstractC89220m implements AbstractC89187q<Uri.Builder, String, Uri, Uri.Builder> {
        static {
            Covode.recordClassIndex(19271);
        }

        public C16831h() {
            super(3);
        }

        public final Uri.Builder invoke(Uri.Builder builder, String str, Uri uri) {
            C89219l.m154719c(builder, "");
            C89219l.m154719c(str, "");
            String valueOf = String.valueOf(uri);
            if (valueOf != null) {
                builder.appendQueryParameter(str, valueOf);
            }
            return builder;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.c.g$i */
    public static final class C16832i extends AbstractC89220m implements AbstractC89187q<Uri.Builder, String, Boolean, Uri.Builder> {
        static {
            Covode.recordClassIndex(19272);
        }

        public C16832i() {
            super(3);
        }

        public final Uri.Builder invoke(Uri.Builder builder, String str, Boolean bool) {
            String str2;
            C89219l.m154719c(builder, "");
            C89219l.m154719c(str, "");
            if (bool.booleanValue()) {
                str2 = "1";
            } else {
                str2 = "0";
            }
            builder.appendQueryParameter(str, str2);
            return builder;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.c.g$k */
    public static final class C16834k extends AbstractC89220m implements AbstractC89187q<Uri.Builder, String, Integer, Uri.Builder> {
        static {
            Covode.recordClassIndex(19274);
        }

        public C16834k() {
            super(3);
        }

        public final Uri.Builder invoke(Uri.Builder builder, String str, Integer num) {
            C89219l.m154719c(builder, "");
            C89219l.m154719c(str, "");
            String valueOf = String.valueOf(num.intValue());
            if (valueOf != null) {
                builder.appendQueryParameter(str, valueOf);
            }
            return builder;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.c.g$m */
    public static final class C16836m extends AbstractC89220m implements AbstractC89187q<Uri.Builder, String, Long, Uri.Builder> {
        static {
            Covode.recordClassIndex(19276);
        }

        public C16836m() {
            super(3);
        }

        public final Uri.Builder invoke(Uri.Builder builder, String str, Long l) {
            C89219l.m154719c(builder, "");
            C89219l.m154719c(str, "");
            String valueOf = String.valueOf(l.longValue());
            if (valueOf != null) {
                builder.appendQueryParameter(str, valueOf);
            }
            return builder;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.c.g$o */
    public static final class C16838o extends AbstractC89220m implements AbstractC89187q<Uri.Builder, String, Float, Uri.Builder> {
        static {
            Covode.recordClassIndex(19278);
        }

        public C16838o() {
            super(3);
        }

        public final Uri.Builder invoke(Uri.Builder builder, String str, Float f) {
            C89219l.m154719c(builder, "");
            C89219l.m154719c(str, "");
            String valueOf = String.valueOf(f.floatValue());
            if (valueOf != null) {
                builder.appendQueryParameter(str, valueOf);
            }
            return builder;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.c.g$r */
    public static final class C16841r extends AbstractC89220m implements AbstractC89187q<Uri.Builder, String, String, Uri.Builder> {

        /* renamed from: a */
        public static final C16841r f40009a = new C16841r();

        static {
            Covode.recordClassIndex(19281);
        }

        C16841r() {
            super(3);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ Uri.Builder invoke(Uri.Builder builder, String str, String str2) {
            Uri.Builder builder2 = builder;
            String str3 = str2;
            C89219l.m154719c(builder2, "");
            C89219l.m154719c(str, "");
            C89219l.m154719c(str3, "");
            builder2.authority(str3);
            return builder2;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.c.g$t */
    public static final class C16843t extends AbstractC89220m implements AbstractC89187q<Uri.Builder, String, String, Uri.Builder> {

        /* renamed from: a */
        public static final C16843t f40011a = new C16843t();

        static {
            Covode.recordClassIndex(19283);
        }

        C16843t() {
            super(3);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ Uri.Builder invoke(Uri.Builder builder, String str, String str2) {
            Uri.Builder builder2 = builder;
            String str3 = str2;
            C89219l.m154719c(builder2, "");
            C89219l.m154719c(str, "");
            C89219l.m154719c(str3, "");
            builder2.path(str3);
            return builder2;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.c.g$z */
    public static final class C16849z extends AbstractC89220m implements AbstractC89187q<Uri.Builder, String, String, Uri.Builder> {

        /* renamed from: a */
        public static final C16849z f40017a = new C16849z();

        static {
            Covode.recordClassIndex(19289);
        }

        C16849z() {
            super(3);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ Uri.Builder invoke(Uri.Builder builder, String str, String str2) {
            Uri.Builder builder2 = builder;
            String str3 = str2;
            C89219l.m154719c(builder2, "");
            C89219l.m154719c(str, "");
            C89219l.m154719c(str3, "");
            builder2.appendPath(str3);
            return builder2;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.c.g$v */
    public static final class C16845v extends AbstractC89220m implements AbstractC89187q<Uri.Builder, String, List<? extends String>, Uri.Builder> {

        /* renamed from: a */
        public static final C16845v f40013a = new C16845v();

        static {
            Covode.recordClassIndex(19285);
        }

        C16845v() {
            super(3);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ Uri.Builder invoke(Uri.Builder builder, String str, List<? extends String> list) {
            Uri.Builder builder2 = builder;
            List<? extends String> list2 = list;
            C89219l.m154719c(builder2, "");
            C89219l.m154719c(str, "");
            C89219l.m154719c(list2, "");
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                builder2.appendPath(it.next());
            }
            return builder2;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.c.g$x */
    public static final class C16847x extends AbstractC89220m implements AbstractC89187q<Uri.Builder, String, String, Uri.Builder> {

        /* renamed from: a */
        public static final C16847x f40015a = new C16847x();

        static {
            Covode.recordClassIndex(19287);
        }

        C16847x() {
            super(3);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0052, code lost:
            if (r1 != null) goto L_0x0028;
         */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ android.net.Uri.Builder invoke(android.net.Uri.Builder r7, java.lang.String r8, java.lang.String r9) {
            /*
                r6 = this;
                android.net.Uri$Builder r7 = (android.net.Uri.Builder) r7
                java.lang.String r9 = (java.lang.String) r9
                java.lang.String r5 = ""
                p4600h.p4611f.p4613b.C89219l.m154719c(r7, r5)
                p4600h.p4611f.p4613b.C89219l.m154719c(r8, r5)
                p4600h.p4611f.p4613b.C89219l.m154719c(r9, r5)
                android.net.Uri r0 = r7.build()
                r4 = 1
                r3 = 0
                r2 = 0
                if (r0 == 0) goto L_0x0027
                java.lang.String r1 = r0.getPath()
                if (r1 == 0) goto L_0x0027
                p4600h.p4611f.p4613b.C89219l.m154709a(r1, r5)
                int r0 = r1.length()
                if (r0 != 0) goto L_0x0038
            L_0x0027:
                r1 = r2
            L_0x0028:
                r7.path(r9)
                if (r1 == 0) goto L_0x0033
                int r0 = r1.length()
                if (r0 != 0) goto L_0x0034
            L_0x0033:
                return r7
            L_0x0034:
                r7.appendPath(r1)
                goto L_0x0033
            L_0x0038:
                p4600h.p4611f.p4613b.C89219l.m154709a(r1, r5)
                java.lang.String r0 = "/"
                boolean r0 = p4600h.p4622m.C89361p.m154874b(r1, r0, r3)
                if (r0 == 0) goto L_0x0027
                p4600h.p4611f.p4613b.C89219l.m154709a(r1, r5)
                int r0 = r1.length()
                h.j.g r0 = p4600h.p4619j.C89271h.m154766a(r4, r0)
                java.lang.String r1 = p4600h.p4622m.C89361p.m154898a(r1, r0)
                if (r1 == 0) goto L_0x0027
                goto L_0x0028
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.service.p1172f.p1173a.p1176c.C16823g.C16847x.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }
}
