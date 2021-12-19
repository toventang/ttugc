package com.bytedance.retrofit2.client;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.C22096s;
import com.bytedance.retrofit2.C22101w;
import com.bytedance.retrofit2.mime.FormUrlEncodedTypedOutput;
import com.bytedance.retrofit2.mime.TypedOutput;
import java.io.OutputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import okhttp3.AbstractC90025ab;
import p4632k.AbstractC89425g;
import p4632k.C89436q;

public final class Request {
    public final boolean addCommonParam;
    public final TypedOutput body;
    public Object extraInfo;
    public final List<C22027b> headers;
    public final int maxLength;
    public final String method;
    public C22096s metrics;
    public final int priorityLevel;
    private int queryFilterPriority;
    public final AbstractC90025ab requestBody;
    public final int requestPriorityLevel;
    public final boolean responseStreaming;
    public String serviceType;
    public Map<Class<?>, Object> tags;
    public final String url;

    static {
        Covode.recordClassIndex(25713);
    }

    public final Object getExtraInfo() {
        return this.extraInfo;
    }

    public final List<C22027b> getHeaders() {
        return this.headers;
    }

    public final int getMaxLength() {
        return this.maxLength;
    }

    public final String getMethod() {
        return this.method;
    }

    public final C22096s getMetrics() {
        return this.metrics;
    }

    public final int getPriorityLevel() {
        return this.priorityLevel;
    }

    public final int getQueryFilterPriority() {
        return this.queryFilterPriority;
    }

    public final AbstractC90025ab getRequestBody() {
        return this.requestBody;
    }

    public final int getRequestPriorityLevel() {
        return this.requestPriorityLevel;
    }

    public final String getServiceType() {
        return this.serviceType;
    }

    public final String getUrl() {
        return this.url;
    }

    public final boolean isAddCommonParam() {
        return this.addCommonParam;
    }

    public final boolean isResponseStreaming() {
        return this.responseStreaming;
    }

    /* renamed from: com.bytedance.retrofit2.client.Request$a */
    public static class C22024a {

        /* renamed from: a */
        String f52023a;

        /* renamed from: b */
        String f52024b;

        /* renamed from: c */
        public List<C22027b> f52025c;

        /* renamed from: d */
        TypedOutput f52026d;

        /* renamed from: e */
        AbstractC90025ab f52027e;

        /* renamed from: f */
        int f52028f;

        /* renamed from: g */
        public int f52029g;

        /* renamed from: h */
        public boolean f52030h;

        /* renamed from: i */
        public int f52031i;

        /* renamed from: j */
        boolean f52032j;

        /* renamed from: k */
        public Object f52033k;

        /* renamed from: l */
        public String f52034l;

        /* renamed from: m */
        C22096s f52035m;

        /* renamed from: n */
        Map<Class<?>, Object> f52036n;

        static {
            Covode.recordClassIndex(25714);
        }

        public C22024a() {
            this.f52023a = "GET";
        }

        /* renamed from: a */
        public final Request mo35840a() {
            if (this.f52024b != null) {
                return new Request(this);
            }
            throw new IllegalStateException("url == null");
        }

        /* renamed from: a */
        public final C22024a mo35838a(String str) {
            Objects.requireNonNull(str, "url == null");
            this.f52024b = str;
            return this;
        }

        C22024a(Request request) {
            this.f52023a = request.method;
            this.f52024b = request.url;
            LinkedList linkedList = new LinkedList();
            this.f52025c = linkedList;
            linkedList.addAll(request.headers);
            this.f52026d = request.body;
            this.f52027e = request.requestBody;
            this.f52028f = request.priorityLevel;
            this.f52029g = request.requestPriorityLevel;
            this.f52030h = request.responseStreaming;
            this.f52031i = request.maxLength;
            this.f52032j = request.addCommonParam;
            this.f52033k = request.extraInfo;
            this.f52034l = request.serviceType;
            this.f52035m = request.metrics;
            this.f52036n = request.tags;
        }

        /* renamed from: a */
        public final <T> C22024a mo35837a(Class<? super T> cls, T t) {
            Objects.requireNonNull(cls, "type == null");
            if (this.f52036n == null) {
                this.f52036n = new HashMap();
            }
            if (t == null) {
                this.f52036n.remove(cls);
            } else {
                this.f52036n.put(cls, cls.cast(t));
            }
            return this;
        }

        /* renamed from: a */
        public final C22024a mo35839a(String str, TypedOutput typedOutput) {
            FormUrlEncodedTypedOutput formUrlEncodedTypedOutput;
            Objects.requireNonNull(str, "method == null");
            if (str.length() != 0) {
                if (typedOutput != null) {
                    formUrlEncodedTypedOutput = typedOutput;
                    if (!C22101w.m41544b(str)) {
                        throw new IllegalArgumentException("method " + str + " must not have a request body.");
                    }
                } else {
                    formUrlEncodedTypedOutput = typedOutput;
                    if (C22101w.m41540a(str)) {
                        FormUrlEncodedTypedOutput formUrlEncodedTypedOutput2 = new FormUrlEncodedTypedOutput();
                        formUrlEncodedTypedOutput2.addField("body", "null");
                        formUrlEncodedTypedOutput = formUrlEncodedTypedOutput2;
                    }
                }
                this.f52023a = str;
                this.f52026d = formUrlEncodedTypedOutput;
                return this;
            }
            throw new IllegalArgumentException("method.length() == 0");
        }
    }

    public final C22024a newBuilder() {
        return new C22024a(this);
    }

    public final Object tag() {
        return tag(Object.class);
    }

    public final TypedOutput getBody() {
        AbstractC90025ab abVar = this.requestBody;
        if (abVar != null) {
            return new TypedOutput(abVar) {
                /* class com.bytedance.retrofit2.C22101w.C221021 */

                /* renamed from: a */
                final /* synthetic */ AbstractC90025ab f52266a;

                static {
                    Covode.recordClassIndex(25802);
                }

                @Override // com.bytedance.retrofit2.mime.TypedOutput
                public final String fileName() {
                    return null;
                }

                @Override // com.bytedance.retrofit2.mime.TypedOutput
                public final String md5Stub() {
                    return null;
                }

                @Override // com.bytedance.retrofit2.mime.TypedOutput
                public final long length() {
                    try {
                        return this.f52266a.contentLength();
                    } catch (Throwable unused) {
                        return -1;
                    }
                }

                @Override // com.bytedance.retrofit2.mime.TypedOutput
                public final String mimeType() {
                    if (this.f52266a.contentType() != null) {
                        return this.f52266a.contentType().toString();
                    }
                    return "";
                }

                {
                    this.f52266a = r1;
                }

                @Override // com.bytedance.retrofit2.mime.TypedOutput
                public final void writeTo(OutputStream outputStream) {
                    AbstractC89425g a = C89436q.m155159a(C89436q.m155163a(outputStream));
                    this.f52266a.writeTo(a);
                    a.flush();
                    a.close();
                }
            };
        }
        return this.body;
    }

    public final String getHost() {
        URI safeCreateUri = safeCreateUri(this.url);
        if (safeCreateUri == null) {
            return null;
        }
        return safeCreateUri.getHost();
    }

    public final String getPath() {
        URI safeCreateUri = safeCreateUri(this.url);
        if (safeCreateUri == null) {
            return null;
        }
        return safeCreateUri.getPath();
    }

    public final void setExtraInfo(Object obj) {
        this.extraInfo = obj;
    }

    public final void setMetrics(C22096s sVar) {
        this.metrics = sVar;
    }

    public final void setQueryFilterPriority(int i) {
        this.queryFilterPriority = i;
    }

    public final <T> T tag(Class<? extends T> cls) {
        return (T) cls.cast(this.tags.get(cls));
    }

    private static URI createUriWithOutQuery(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        try {
            int indexOf = str.indexOf("?");
            if (indexOf > 0) {
                str = str.substring(0, indexOf);
            }
            return URI.create(str);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static URI safeCreateUri(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        try {
            return new URI(str);
        } catch (URISyntaxException unused) {
            try {
                return URI.create(str.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused2) {
                return createUriWithOutQuery(str);
            }
        }
    }

    public final C22027b getFirstHeader(String str) {
        List<C22027b> list;
        if (!(str == null || (list = this.headers) == null)) {
            for (C22027b bVar : list) {
                if (str.equalsIgnoreCase(bVar.f52037a)) {
                    return bVar;
                }
            }
        }
        return null;
    }

    public final List<C22027b> headers(String str) {
        List<C22027b> list;
        ArrayList arrayList = null;
        if (!(str == null || (list = this.headers) == null)) {
            for (C22027b bVar : list) {
                if (str.equalsIgnoreCase(bVar.f52037a)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(bVar);
                }
            }
        }
        return arrayList;
    }

    Request(C22024a aVar) {
        Objects.requireNonNull(aVar.f52024b, "URL must not be null.");
        this.url = aVar.f52024b;
        Objects.requireNonNull(aVar.f52023a, "Method must not be null.");
        this.method = aVar.f52023a;
        if (aVar.f52025c == null) {
            this.headers = Collections.emptyList();
        } else {
            this.headers = Collections.unmodifiableList(new ArrayList(aVar.f52025c));
        }
        this.body = aVar.f52026d;
        this.requestBody = aVar.f52027e;
        this.priorityLevel = aVar.f52028f;
        this.requestPriorityLevel = aVar.f52029g;
        this.responseStreaming = aVar.f52030h;
        this.maxLength = aVar.f52031i;
        this.addCommonParam = aVar.f52032j;
        this.extraInfo = aVar.f52033k;
        this.serviceType = aVar.f52034l;
        this.metrics = aVar.f52035m;
        this.tags = aVar.f52036n;
    }

    public Request(String str, String str2, List<C22027b> list, TypedOutput typedOutput, int i, boolean z, int i2, boolean z2, Object obj) {
        this(str, str2, list, typedOutput, null, i, 3, z, i2, z2, obj, "", null);
    }

    public Request(String str, String str2, List<C22027b> list, TypedOutput typedOutput, AbstractC90025ab abVar, int i, int i2, boolean z, int i3, boolean z2, Object obj, String str3, Map<Class<?>, Object> map) {
        Objects.requireNonNull(str, "Method must not be null.");
        Objects.requireNonNull(str2, "URL must not be null.");
        this.method = str;
        this.url = str2;
        if (list == null) {
            this.headers = Collections.emptyList();
        } else {
            this.headers = Collections.unmodifiableList(new ArrayList(list));
        }
        this.body = typedOutput;
        this.requestBody = abVar;
        this.priorityLevel = i;
        this.requestPriorityLevel = i2;
        this.responseStreaming = z;
        this.maxLength = i3;
        this.addCommonParam = z2;
        this.extraInfo = obj;
        this.serviceType = str3;
        this.tags = map;
    }
}
