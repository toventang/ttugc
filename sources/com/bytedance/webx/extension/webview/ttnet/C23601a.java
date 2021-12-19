package com.bytedance.webx.extension.webview.ttnet;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.client.C22027b;
import com.bytedance.retrofit2.client.C22028c;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.ttnet.utils.RetrofitUtils;
import com.bytedance.webx.AbstractC23547a;
import com.bytedance.webx.AbstractC23568e;
import com.bytedance.webx.C23612h;
import com.bytedance.webx.p1751b.p1752a.C23556a;
import com.bytedance.webx.p1756e.p1757a.C23586c;
import com.bytedance.webx.p1756e.p1757a.p1758a.C23577b;
import com.bytedance.webx.p1756e.p1757a.p1761c.C23588a;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okhttp3.C90204w;
import p4600h.C89378p;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89271h;

/* renamed from: com.bytedance.webx.extension.webview.ttnet.a */
public final class C23601a extends AbstractC23547a<C23586c> implements AbstractC23568e.AbstractC23569a {

    /* renamed from: a */
    public static final C23602a f55861a = new C23602a((byte) 0);

    /* renamed from: b */
    private final C23603b f55862b = new C23603b();

    /* renamed from: com.bytedance.webx.extension.webview.ttnet.a$b */
    public final class C23603b extends AbstractC23547a<C23577b> {

        /* renamed from: b */
        private C23604a f55864b = new C23604a(this);

        static {
            Covode.recordClassIndex(27702);
        }

        /* renamed from: com.bytedance.webx.extension.webview.ttnet.a$b$a */
        public static final class C23604a extends C23577b.AbstractC23578a {

            /* renamed from: a */
            final /* synthetic */ C23603b f55865a;

            static {
                Covode.recordClassIndex(27703);
            }

            @Override // com.bytedance.webx.p1762f.AbstractC23606a
            /* renamed from: a */
            public final AbstractC23547a<?> mo34966a() {
                return this.f55865a;
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C23604a(C23603b bVar) {
                this.f55865a = bVar;
            }

            /* renamed from: a */
            private static List<C22027b> m44635a(Map<String, String> map) {
                if (map == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList(map.size());
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    arrayList.add(new C22027b(entry.getKey(), entry.getValue()));
                }
                return arrayList;
            }

            @Override // com.bytedance.webx.p1756e.p1757a.p1758a.C23577b.AbstractC23578a
            /* renamed from: b */
            public final WebResourceResponse mo34977b(WebView webView, WebResourceRequest webResourceRequest) {
                Uri url;
                String str;
                WebResourceResponse b = super.mo34977b(webView, webResourceRequest);
                if (b != null) {
                    return b;
                }
                if (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null || url.getHost() == null || url.getScheme() == null || (url.getScheme() + "://" + url.getHost() + "/") == null) {
                    return null;
                }
                List<C22027b> a = m44635a(webResourceRequest.getRequestHeaders());
                String uri = url.toString();
                C89219l.m154709a((Object) uri, "");
                return m44634a(str, uri, a);
            }

            /* renamed from: a */
            private static WebResourceResponse m44634a(String str, String str2, List<C22027b> list) {
                LinkedHashMap linkedHashMap;
                String str3;
                String str4;
                String str5;
                Charset a;
                C89219l.m154719c(str, "");
                C89219l.m154719c(str2, "");
                AbstractC21983b<TypedInput> streamRequest = ((TtnetRetrofitApi) RetrofitUtils.m43281a(str, TtnetRetrofitApi.class)).streamRequest(str2, list);
                if (C23612h.f55874a.f55890a) {
                    C23556a.m44304a("TtnetInterceptExtension");
                } else {
                    C23556a.m44304a("TtnetInterceptExtension");
                }
                try {
                    C22099u<TypedInput> execute = streamRequest.execute();
                    if (execute == null) {
                        return null;
                    }
                    T t = execute.f52262b;
                    InputStream in = t != null ? t.mo11577in() : null;
                    if (in == null) {
                        streamRequest.cancel();
                    }
                    C23556a.m44304a("TtnetInterceptExtension");
                    List<C22027b> list2 = execute.f52261a.f52042d;
                    if (list2 != null) {
                        linkedHashMap = new LinkedHashMap(C89271h.m154769b(C89041ag.m154411a(C89070n.m154526a((Iterable) list2, 10)), 16));
                        for (T t2 : list2) {
                            C89378p pVar = new C89378p(t2.f52037a, t2.f52038b);
                            linkedHashMap.put(pVar.getFirst(), pVar.getSecond());
                        }
                    } else {
                        linkedHashMap = null;
                    }
                    if (linkedHashMap == null || (str3 = (String) linkedHashMap.get("Content-Type")) == null) {
                        str3 = linkedHashMap != null ? (String) linkedHashMap.get("content-type") : null;
                    }
                    if (str3 == null) {
                        str3 = "text/html; charset=UTF-8";
                    }
                    C90204w b = C90204w.m156843b(str3);
                    String str6 = b == null ? "text/html" : b.f204877a + "/" + b.f204878b;
                    if (b == null || (a = b.mo145074a((Charset) null)) == null || (str4 = a.toString()) == null) {
                        str4 = "utf-8";
                    }
                    C89219l.m154709a((Object) str4, "");
                    C22028c cVar = execute.f52261a;
                    C89219l.m154709a((Object) cVar, "");
                    int i = cVar.f52040b;
                    C22028c cVar2 = execute.f52261a;
                    C89219l.m154709a((Object) cVar2, "");
                    if (TextUtils.isEmpty(cVar2.f52041c)) {
                        str5 = "OK";
                    } else {
                        C22028c cVar3 = execute.f52261a;
                        C89219l.m154709a((Object) cVar3, "");
                        str5 = cVar3.f52041c;
                    }
                    return new WebResourceResponse(str6, str4, i, str5, linkedHashMap, in);
                } catch (Exception unused) {
                    C23556a.m44304a("TtnetInterceptExtension");
                    streamRequest.cancel();
                    return null;
                }
            }
        }

        @Override // com.bytedance.webx.AbstractC23547a
        /* renamed from: a */
        public final boolean mo34965a() {
            return C23601a.this.mo34965a();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C23603b() {
        }

        @Override // com.bytedance.webx.AbstractC23547a
        /* renamed from: a */
        public final void mo34964a(AbstractC23547a.C23548a aVar) {
            mo38630a("shouldInterceptRequest", this.f55864b, 7000);
        }
    }

    static {
        Covode.recordClassIndex(27700);
    }

    /* renamed from: com.bytedance.webx.extension.webview.ttnet.a$a */
    public static final class C23602a {
        static {
            Covode.recordClassIndex(27701);
        }

        private C23602a() {
        }

        public /* synthetic */ C23602a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.webx.AbstractC23547a
    /* renamed from: a */
    public final void mo34964a(AbstractC23547a.C23548a aVar) {
        this.f55780g = "ttnet";
        if (aVar == null) {
            C89219l.m154707a();
        }
        C23588a aVar2 = (C23588a) mo38631b();
        C89219l.m154709a((Object) aVar2, "");
        AbstractC23547a.C23548a.m44294a(aVar2.getExtendableWebViewClient(), this.f55862b);
    }
}
