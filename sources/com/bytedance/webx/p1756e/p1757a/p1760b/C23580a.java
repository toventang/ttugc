package com.bytedance.webx.p1756e.p1757a.p1760b;

import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.webx.AbstractC23547a;
import com.bytedance.webx.AbstractC23568e;
import com.bytedance.webx.p1750a.C23553b;
import com.bytedance.webx.p1756e.p1757a.C23586c;
import com.bytedance.webx.p1756e.p1757a.p1758a.C23573a;
import com.bytedance.webx.p1756e.p1757a.p1758a.C23577b;
import com.bytedance.webx.p1756e.p1757a.p1761c.C23588a;
import java.util.Map;

/* renamed from: com.bytedance.webx.e.a.b.a */
public class C23580a extends AbstractC23547a<C23586c> implements AbstractC23568e.AbstractC23569a {

    /* renamed from: a */
    public boolean f55834a;

    /* renamed from: b */
    public boolean f55835b;

    /* renamed from: j */
    public boolean f55836j;

    /* renamed from: k */
    public boolean f55837k;

    /* renamed from: l */
    private C23586c.AbstractC23587a f55838l = new C23586c.AbstractC23587a() {
        /* class com.bytedance.webx.p1756e.p1757a.p1760b.C23580a.C235811 */

        static {
            Covode.recordClassIndex(27679);
        }

        @Override // com.bytedance.webx.p1762f.AbstractC23606a
        /* renamed from: a */
        public final AbstractC23547a mo34966a() {
            return C23580a.this;
        }

        @Override // com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a
        /* renamed from: a */
        public final void mo38788a(String str) {
            boolean z;
            if (C23580a.this.f55834a || C23580a.this.f55835b) {
                z = false;
            } else {
                z = true;
            }
            C23580a.this.f55834a = true;
            if (z) {
                try {
                    C23580a.this.mo38786a(str);
                } catch (Throwable th) {
                    C23580a.this.f55834a = false;
                    throw th;
                }
            }
            super.mo38788a(str);
            C23580a.this.f55834a = false;
        }

        @Override // com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a
        /* renamed from: a */
        public final void mo38789a(String str, Map<String, String> map) {
            boolean z;
            if (C23580a.this.f55834a || C23580a.this.f55835b) {
                z = false;
            } else {
                z = true;
            }
            C23580a.this.f55835b = true;
            if (z) {
                try {
                    C23580a.this.mo38786a(str);
                } catch (Throwable th) {
                    C23580a.this.f55835b = false;
                    throw th;
                }
            }
            super.mo38789a(str, map);
            C23580a.this.f55835b = false;
        }
    };

    /* renamed from: m */
    private C23553b f55839m;

    static {
        Covode.recordClassIndex(27678);
    }

    /* renamed from: com.bytedance.webx.e.a.b.a$a */
    public class C23582a extends AbstractC23547a {

        /* renamed from: b */
        private C23573a.AbstractC23574a f55842b = new C23573a.AbstractC23574a() {
            /* class com.bytedance.webx.p1756e.p1757a.p1760b.C23580a.C23582a.C235831 */

            static {
                Covode.recordClassIndex(27681);
            }

            @Override // com.bytedance.webx.p1762f.AbstractC23606a
            /* renamed from: a */
            public final AbstractC23547a mo34966a() {
                return C23582a.this;
            }

            @Override // com.bytedance.webx.p1756e.p1757a.p1758a.C23573a.AbstractC23574a
            /* renamed from: a */
            public final void mo34967a(WebView webView, int i) {
                super.mo34967a(webView, i);
            }
        };

        static {
            Covode.recordClassIndex(27680);
        }

        public C23582a() {
        }

        @Override // com.bytedance.webx.AbstractC23547a
        /* renamed from: a */
        public final void mo34964a(AbstractC23547a.C23548a aVar) {
            mo38630a("onProgressChanged", this.f55842b, 500);
        }
    }

    /* renamed from: com.bytedance.webx.e.a.b.a$b */
    public class C23584b extends AbstractC23547a {

        /* renamed from: b */
        private C23577b.AbstractC23578a f55845b = new C23577b.AbstractC23578a() {
            /* class com.bytedance.webx.p1756e.p1757a.p1760b.C23580a.C23584b.C235851 */

            static {
                Covode.recordClassIndex(27683);
            }

            @Override // com.bytedance.webx.p1762f.AbstractC23606a
            /* renamed from: a */
            public final AbstractC23547a mo34966a() {
                return C23584b.this;
            }

            @Override // com.bytedance.webx.p1756e.p1757a.p1758a.C23577b.AbstractC23578a
            /* renamed from: b */
            public final boolean mo34978b(WebView webView, String str) {
                boolean z;
                if (C23580a.this.f55836j || C23580a.this.f55837k) {
                    z = false;
                } else {
                    z = true;
                }
                C23580a.this.f55836j = true;
                try {
                    boolean b = super.mo34978b(webView, str);
                    if (z && !b) {
                        C23580a.this.mo38787b(str);
                    }
                    return b;
                } finally {
                    C23580a.this.f55836j = false;
                }
            }

            @Override // com.bytedance.webx.p1756e.p1757a.p1758a.C23577b.AbstractC23578a
            /* renamed from: a */
            public final boolean mo34976a(WebView webView, WebResourceRequest webResourceRequest) {
                boolean z;
                if (C23580a.this.f55836j || C23580a.this.f55837k) {
                    z = false;
                } else {
                    z = true;
                }
                C23580a.this.f55837k = true;
                try {
                    boolean a = super.mo34976a(webView, webResourceRequest);
                    if (z && !a) {
                        C23580a.this.mo38787b(webResourceRequest.getUrl().toString());
                    }
                    return a;
                } finally {
                    C23580a.this.f55837k = false;
                }
            }

            @Override // com.bytedance.webx.p1756e.p1757a.p1758a.C23577b.AbstractC23578a
            /* renamed from: a */
            public final void mo38781a(WebView webView, String str, boolean z) {
                C23580a.this.mo38787b(str);
                super.mo38781a(webView, str, z);
            }
        };

        static {
            Covode.recordClassIndex(27682);
        }

        public C23584b() {
        }

        @Override // com.bytedance.webx.AbstractC23547a
        /* renamed from: a */
        public final void mo34964a(AbstractC23547a.C23548a aVar) {
            mo38630a("shouldOverrideUrlLoading", this.f55845b, 500);
            mo38630a("doUpdateVisitedHistory", this.f55845b, 500);
        }
    }

    /* renamed from: b */
    public final void mo38787b(String str) {
        C23553b bVar = this.f55839m;
        if (bVar != null) {
            bVar.mo38636a(str, 1);
        }
    }

    /* renamed from: a */
    public final void mo38786a(String str) {
        C23553b bVar = this.f55839m;
        if (bVar == null) {
            C23553b bVar2 = new C23553b(this.f55778e);
            this.f55839m = bVar2;
            bVar2.mo38636a(str, 0);
            return;
        }
        bVar.mo38636a(str, 1);
    }

    @Override // com.bytedance.webx.AbstractC23547a
    /* renamed from: a */
    public final void mo34964a(AbstractC23547a.C23548a aVar) {
        AbstractC23547a.C23548a.m44294a(((C23588a) mo38631b()).getExtendableWebViewClient(), new C23584b());
        AbstractC23547a.C23548a.m44294a(((C23588a) mo38631b()).getExtendableWebChromeClient(), new C23582a());
        mo38630a("loadUrl", this.f55838l, 500);
    }
}
