package com.bytedance.retrofit2;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.client.C22027b;
import com.bytedance.retrofit2.mime.FormUrlEncodedTypedOutput;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedOutput;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okhttp3.AbstractC90025ab;
import okhttp3.C90198s;
import okhttp3.C90204w;
import okhttp3.C90205x;
import p4632k.AbstractC89425g;

public final class RequestBuilder {

    /* renamed from: q */
    private static final char[] f51974q = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    public String f51975a;

    /* renamed from: b */
    public String f51976b;

    /* renamed from: c */
    public String f51977c;

    /* renamed from: d */
    public String f51978d;

    /* renamed from: e */
    public List<C22027b> f51979e;

    /* renamed from: f */
    final MultipartTypedOutput f51980f;

    /* renamed from: g */
    public TypedOutput f51981g;

    /* renamed from: h */
    public int f51982h;

    /* renamed from: i */
    public String f51983i;

    /* renamed from: j */
    public boolean f51984j;

    /* renamed from: k */
    public int f51985k;

    /* renamed from: l */
    public boolean f51986l;

    /* renamed from: m */
    public Object f51987m;

    /* renamed from: n */
    C90205x.C90206a f51988n;

    /* renamed from: o */
    public AbstractC90025ab f51989o;

    /* renamed from: p */
    boolean f51990p;

    /* renamed from: r */
    private final AbstractC22047g f51991r;

    /* renamed from: s */
    private StringBuilder f51992s;

    /* renamed from: t */
    private String f51993t;

    /* renamed from: u */
    private final boolean f51994u;

    /* renamed from: v */
    private final FormUrlEncodedTypedOutput f51995v;

    /* renamed from: w */
    private int f51996w;

    /* renamed from: x */
    private Map<Class<?>, Object> f51997x = new LinkedHashMap();

    /* access modifiers changed from: package-private */
    public static class MimeOverridingTypedOutput implements TypedOutput {
        private final TypedOutput delegate;
        private final String mimeType;

        static {
            Covode.recordClassIndex(25655);
        }

        @Override // com.bytedance.retrofit2.mime.TypedOutput
        public String mimeType() {
            return this.mimeType;
        }

        @Override // com.bytedance.retrofit2.mime.TypedOutput
        public String fileName() {
            return this.delegate.fileName();
        }

        @Override // com.bytedance.retrofit2.mime.TypedOutput
        public long length() {
            return this.delegate.length();
        }

        @Override // com.bytedance.retrofit2.mime.TypedOutput
        public String md5Stub() {
            return this.delegate.md5Stub();
        }

        @Override // com.bytedance.retrofit2.mime.TypedOutput
        public void writeTo(OutputStream outputStream) {
            this.delegate.writeTo(outputStream);
        }

        MimeOverridingTypedOutput(TypedOutput typedOutput, String str) {
            this.delegate = typedOutput;
            this.mimeType = str;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.retrofit2.RequestBuilder$a */
    public static class C21968a extends AbstractC90025ab {

        /* renamed from: a */
        private final AbstractC90025ab f51998a;

        /* renamed from: b */
        private final String f51999b;

        static {
            Covode.recordClassIndex(25656);
        }

        @Override // okhttp3.AbstractC90025ab
        public final long contentLength() {
            return this.f51998a.contentLength();
        }

        @Override // okhttp3.AbstractC90025ab
        public final C90204w contentType() {
            return C90204w.m156843b(this.f51999b);
        }

        @Override // okhttp3.AbstractC90025ab
        public final void writeTo(AbstractC89425g gVar) {
            this.f51998a.writeTo(gVar);
        }

        C21968a(AbstractC90025ab abVar, String str) {
            this.f51998a = abVar;
            this.f51999b = str;
        }
    }

    static {
        Covode.recordClassIndex(25654);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:40:0x0091 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v3, resolved type: com.bytedance.retrofit2.mime.FormUrlEncodedTypedOutput */
    /* JADX DEBUG: Multi-variable search result rejected for r5v4, resolved type: com.bytedance.retrofit2.mime.FormUrlEncodedTypedOutput */
    /* JADX DEBUG: Multi-variable search result rejected for r5v5, resolved type: com.bytedance.retrofit2.mime.FormUrlEncodedTypedOutput */
    /* JADX DEBUG: Multi-variable search result rejected for r5v6, resolved type: com.bytedance.retrofit2.mime.FormUrlEncodedTypedOutput */
    /* JADX DEBUG: Multi-variable search result rejected for r5v7, resolved type: com.bytedance.retrofit2.mime.FormUrlEncodedTypedOutput */
    /* JADX DEBUG: Multi-variable search result rejected for r5v8, resolved type: com.bytedance.retrofit2.mime.FormUrlEncodedTypedOutput */
    /* JADX DEBUG: Multi-variable search result rejected for r5v9, resolved type: com.bytedance.retrofit2.mime.FormUrlEncodedTypedOutput */
    /* JADX DEBUG: Multi-variable search result rejected for r5v10, resolved type: com.bytedance.retrofit2.mime.FormUrlEncodedTypedOutput */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0084, code lost:
        if (r1 != null) goto L_0x0086;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bytedance.retrofit2.client.Request mo35747a() {
        /*
        // Method dump skipped, instructions count: 422
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.retrofit2.RequestBuilder.mo35747a():com.bytedance.retrofit2.client.Request");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo35751a(C90198s sVar, AbstractC90025ab abVar) {
        this.f51988n.mo145080a(sVar, abVar);
    }

    /* renamed from: a */
    public final <T> void mo35748a(Class<? super T> cls, T t) {
        this.f51997x.put(cls, cls.cast(t));
    }

    /* renamed from: b */
    private static StringBuilder m41324b(String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        if (str.endsWith("/")) {
            sb.deleteCharAt(sb.length() - 1);
        }
        sb.append(str2);
        return sb;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo35749a(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("Header name must not be null.");
        } else if ("Content-Type".equalsIgnoreCase(str)) {
            this.f51993t = str2;
        } else {
            List list = this.f51979e;
            if (list == null) {
                list = new ArrayList(2);
                this.f51979e = list;
            }
            list.add(new C22027b(str, str2));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo35752b(String str, String str2, boolean z) {
        this.f51995v.addField(str, z, str2.toString(), z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo35750a(String str, String str2, boolean z) {
        char c;
        if (str != null) {
            try {
                StringBuilder sb = this.f51992s;
                if (sb == null) {
                    sb = new StringBuilder();
                    this.f51992s = sb;
                }
                if (sb.length() > 0) {
                    c = '&';
                } else {
                    c = '?';
                }
                sb.append(c);
                if (z) {
                    str = URLEncoder.encode(str, "UTF-8");
                    str2 = URLEncoder.encode(str2, "UTF-8");
                }
                if (str2 == null || str2.isEmpty()) {
                    sb.append(str);
                } else {
                    sb.append(str).append('=').append(str2);
                }
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException("Unable to convert query parameter \"" + str + "\" value to UTF-8: " + str2, e);
            }
        } else {
            throw new IllegalArgumentException("Query param name must not be null.");
        }
    }

    RequestBuilder(String str, AbstractC22047g gVar, String str2, List<C22027b> list, String str3, int i, int i2, boolean z, int i3, boolean z2, Object obj, boolean z3, boolean z4, boolean z5, String str4) {
        this.f51975a = str;
        this.f51991r = gVar;
        this.f51977c = str2;
        this.f51993t = str3;
        this.f51982h = i;
        this.f51996w = i2;
        this.f51984j = z;
        this.f51985k = i3;
        this.f51986l = z2;
        this.f51987m = obj;
        this.f51994u = z3;
        this.f51979e = list;
        this.f51983i = str4;
        if (z4) {
            FormUrlEncodedTypedOutput formUrlEncodedTypedOutput = new FormUrlEncodedTypedOutput();
            this.f51995v = formUrlEncodedTypedOutput;
            this.f51980f = null;
            this.f51981g = formUrlEncodedTypedOutput;
            this.f51988n = null;
        } else if (z5) {
            this.f51995v = null;
            MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
            this.f51980f = multipartTypedOutput;
            this.f51981g = multipartTypedOutput;
            C90205x.C90206a aVar = new C90205x.C90206a();
            this.f51988n = aVar;
            aVar.mo145081a(C90205x.f204885e);
        } else {
            this.f51995v = null;
            this.f51980f = null;
            this.f51988n = null;
        }
    }
}
