package com.p4501vk.api.sdk.internal;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p4501vk.api.sdk.p4507f.AbstractC87888c;
import com.p4501vk.api.sdk.p4507f.C87891e;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.Map;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.vk.api.sdk.internal.c */
public final class C87902c {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f199645a = {new C89232y(C89204ab.m154669a(C87902c.class), "strBuilder", "getStrBuilder()Ljava/lang/StringBuilder;")};

    /* renamed from: b */
    public static final C87902c f199646b = new C87902c();

    /* renamed from: c */
    private static final AbstractC87888c f199647c = C87891e.m152893a(C87904b.f199649a);

    /* renamed from: a */
    private static StringBuilder m152915a() {
        return (StringBuilder) C87891e.m152894a(f199647c, f199645a[0]);
    }

    private C87902c() {
    }

    /* renamed from: com.vk.api.sdk.internal.c$b */
    static final class C87904b extends AbstractC89220m implements AbstractC89171a<StringBuilder> {

        /* renamed from: a */
        public static final C87904b f199649a = new C87904b();

        static {
            Covode.recordClassIndex(103915);
        }

        C87904b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ StringBuilder invoke() {
            return new StringBuilder();
        }
    }

    static {
        Covode.recordClassIndex(103913);
    }

    /* renamed from: com.vk.api.sdk.internal.c$a */
    public static final class C87903a extends AbstractC89220m implements AbstractC89172b<Byte, String> {

        /* renamed from: a */
        public static final C87903a f199648a = new C87903a();

        static {
            Covode.recordClassIndex(103914);
        }

        C87903a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ String invoke(Byte b) {
            String a = C1764a.m5928a("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b.byteValue())}, 1));
            C89219l.m154709a((Object) a, "");
            return a;
        }
    }

    /* renamed from: a */
    private static String m152914a(String str, boolean z) {
        if (!z) {
            return str;
        }
        try {
            String encode = URLEncoder.encode(str, "UTF-8");
            C89219l.m154709a((Object) encode, "");
            return encode;
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    private static StringBuilder m152916a(StringBuilder sb, String str) {
        C89219l.m154719c(sb, "");
        StringBuilder append = sb.append(str);
        C89219l.m154709a((Object) append, "");
        return append;
    }

    /* renamed from: a */
    public static String m152913a(String str, Map<String, String> map, String str2, int i, boolean z) {
        StringBuilder sb;
        m152915a().setLength(0);
        StringBuilder a = m152916a(m152916a(m152916a(m152915a(), "v="), str), "&https=1&");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if ((!C89219l.m154714a((Object) key, (Object) "v")) && (!C89219l.m154714a((Object) key, (Object) "access_token")) && (true ^ C89219l.m154714a((Object) key, (Object) "api_id"))) {
                a = m152916a(m152916a(m152916a(m152916a(a, key), "="), m152914a(value, z)), "&");
            }
        }
        if (str2 != null && str2.length() != 0) {
            sb = m152916a(m152916a(m152916a(a, "access_token="), str2), "&");
        } else if (i != 0) {
            sb = m152916a(m152916a(m152916a(a, "api_id="), String.valueOf(i)), "&");
        } else {
            sb = m152916a(a, "&");
        }
        sb.setLength(sb.length() - 1);
        String sb2 = sb.toString();
        C89219l.m154709a((Object) sb2, "");
        return sb2;
    }
}
