package com.bytedance.webx.p1769i.p1770a.p1771a;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.webx.p1769i.C23629a;
import com.bytedance.webx.p1769i.p1772b.C23638a;
import com.bytedance.webx.p1769i.p1774d.AbstractC23641a;
import com.bytedance.webx.p1769i.p1774d.C23642b;
import com.bytedance.webx.p1769i.p1774d.C23643c;
import com.bytedance.webx.p1769i.p1774d.C23649d;
import com.bytedance.webx.p1769i.p1775e.C23651a;
import com.bytedance.webx.p1769i.p1775e.C23655d;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.webx.i.a.a.b */
public final class C23633b extends AbstractC23632a {

    /* renamed from: a */
    public WebView f55915a;

    /* renamed from: b */
    public String f55916b;

    /* renamed from: c */
    public String f55917c;

    /* renamed from: d */
    public String f55918d;

    /* renamed from: e */
    public Handler f55919e = new Handler(Looper.getMainLooper());

    /* renamed from: f */
    public AbstractC23641a f55920f = new AbstractC23641a() {
        /* class com.bytedance.webx.p1769i.p1770a.p1771a.C23633b.C236352 */

        static {
            Covode.recordClassIndex(27734);
        }

        @Override // com.bytedance.webx.p1769i.p1774d.AbstractC23641a
        /* renamed from: a */
        public final void mo39056a(final String str, C23642b bVar) {
            if (bVar != null && bVar.f55942c) {
                C23633b.this.f55919e.post(new Runnable() {
                    /* class com.bytedance.webx.p1769i.p1770a.p1771a.C23633b.C236352.RunnableC236361 */

                    static {
                        Covode.recordClassIndex(27735);
                    }

                    public final void run() {
                        MethodCollector.m26663i(7522);
                        try {
                            if (C23633b.this.f55915a == null || C23633b.this.f55915a == null || !str.equals(C23633b.this.f55917c)) {
                                C23651a.m44724b("AsyncSecStrategy");
                                MethodCollector.m26664o(7522);
                                return;
                            }
                            C23633b.this.f55915a.loadUrl(C23655d.m44728a(str, C23633b.this.f55916b, -1));
                            MethodCollector.m26664o(7522);
                        } catch (Exception unused) {
                            C23651a.m44726d("AsyncSecStrategy");
                            MethodCollector.m26664o(7522);
                        }
                    }
                });
            }
            C23633b.this.f55918d = str;
            C23651a.m44724b("AsyncSecStrategy");
        }
    };

    /* renamed from: g */
    private boolean f55921g = true;

    /* renamed from: h */
    private String f55922h;

    static {
        Covode.recordClassIndex(27732);
    }

    @Override // com.bytedance.webx.p1769i.p1770a.AbstractC23637b
    /* renamed from: b */
    public final boolean mo39052b() {
        return m44679a(this.f55915a, true);
    }

    @Override // com.bytedance.webx.p1769i.p1770a.AbstractC23637b
    /* renamed from: a */
    public final void mo39050a() {
        this.f55921g = true;
        this.f55922h = null;
        this.f55917c = null;
        this.f55918d = null;
        C23651a.m44723a("AsyncSecStrategy");
    }

    @Override // com.bytedance.webx.p1769i.p1770a.AbstractC23637b
    /* renamed from: c */
    public final boolean mo39054c() {
        if (!m44679a(this.f55915a, false)) {
            return false;
        }
        this.f55915a.goBackOrForward(-2);
        C23651a.m44723a("AsyncSecStrategy");
        this.f55918d = null;
        return true;
    }

    /* renamed from: e */
    private int m44685e(String str) {
        if (C23655d.m44730a(this.f55922h, str)) {
            return 1;
        }
        if (!this.f55921g) {
            return 3;
        }
        this.f55921g = false;
        return 2;
    }

    @Override // com.bytedance.webx.p1769i.p1770a.AbstractC23637b
    /* renamed from: b */
    public final boolean mo39053b(String str) {
        try {
            m44684d(str);
            if (!C23655d.m44730a(this.f55918d, str)) {
                return m44682a(str, m44685e(str), true);
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: d */
    private void m44684d(String str) {
        if (C23655d.m44730a(this.f55918d, str) && C23655d.m44730a(this.f55922h, str)) {
            C23642b bVar = new C23642b();
            bVar.f55942c = false;
            bVar.f55941b = 0;
            C23638a.m44697a().mo39058a(str, bVar);
            "handleLoadUrl save first check in cache :".concat(String.valueOf(str));
            C23651a.m44723a("AsyncSecStrategy");
        }
        if (C23655d.m44731b(str)) {
            this.f55917c = str;
        }
    }

    @Override // com.bytedance.webx.p1769i.p1770a.AbstractC23637b
    /* renamed from: a */
    public final void mo39051a(String str) {
        "handleOverrideUrlLoading :".concat(String.valueOf(str));
        C23651a.m44723a("AsyncSecStrategy");
        try {
            m44684d(str);
            if (!C23655d.m44730a(this.f55918d, str)) {
                m44682a(str, m44685e(str), false);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    private void m44683b(final String str, final int i) {
        this.f55919e.postDelayed(new Runnable() {
            /* class com.bytedance.webx.p1769i.p1770a.p1771a.C23633b.RunnableC236341 */

            static {
                Covode.recordClassIndex(27733);
            }

            public final void run() {
                if (str == null || C23633b.this.f55915a == null || !str.equals(C23633b.this.f55917c)) {
                    C23651a.m44724b("AsyncSecStrategy");
                    return;
                }
                C23651a.m44723a("AsyncSecStrategy");
                String str = str;
                String str2 = C23633b.this.f55916b;
                int i = i;
                AbstractC23641a aVar = C23633b.this.f55920f;
                C23649d.C23650a aVar2 = new C23649d.C23650a();
                aVar2.f55967a = C23629a.f55913b.f55935a;
                aVar2.f55970d = C23629a.f55913b.f55936b;
                aVar2.f55969c = str;
                aVar2.f55968b = str2;
                aVar2.f55972f = aVar;
                aVar2.f55973g = i;
                C23649d a = aVar2.mo39069a();
                C23643c a2 = C23643c.m44704a();
                String str3 = a.f55960c;
                if (TextUtils.isEmpty(str3)) {
                    C23651a.m44725c("CheckUrlSecManager");
                } else if (C23655d.m44729a(str3)) {
                    C23651a.m44725c("CheckUrlSecManager");
                } else if (C23638a.m44697a().mo39059a(a.f55960c)) {
                    C23651a.m44725c("CheckUrlSecManager");
                } else {
                    a2.mo39062a(a);
                }
            }
        }, 100);
    }

    public C23633b(WebView webView, String str) {
        this.f55915a = webView;
        this.f55916b = str;
    }

    /* renamed from: a */
    private boolean m44681a(String str, int i) {
        MethodCollector.m26663i(6943);
        String str2 = this.f55916b;
        C23649d.C23650a aVar = new C23649d.C23650a();
        aVar.f55967a = C23629a.f55913b.f55935a;
        aVar.f55970d = C23629a.f55913b.f55936b;
        aVar.f55969c = str;
        aVar.f55968b = str2;
        aVar.f55973g = i;
        aVar.f55971e = true;
        try {
            C23642b bVar = C23643c.m44704a().mo39063b(aVar.mo39069a()).get(C23629a.f55913b.f55939e, TimeUnit.MILLISECONDS);
            if (!bVar.f55940a || !bVar.f55942c) {
                "onFail url : ".concat(String.valueOf(str));
                C23651a.m44725c("AsyncSecStrategy");
                MethodCollector.m26664o(6943);
                return false;
            }
            this.f55915a.loadUrl(C23655d.m44728a(str, this.f55916b, bVar.f55941b));
            this.f55918d = str;
            C23651a.m44724b("AsyncSecStrategy");
            MethodCollector.m26664o(6943);
            return true;
        } catch (Exception unused) {
            MethodCollector.m26664o(6943);
            return false;
        }
    }

    /* renamed from: a */
    private boolean m44682a(String str, int i, boolean z) {
        MethodCollector.m26663i(6945);
        C23642b b = C23638a.m44697a().mo39060b(str);
        if (b == null) {
            if (!m44680c(str)) {
                MethodCollector.m26664o(6945);
                return false;
            } else if (z) {
                boolean a = m44681a(str, i);
                MethodCollector.m26664o(6945);
                return a;
            } else {
                m44683b(str, i);
                MethodCollector.m26664o(6945);
                return false;
            }
        } else if (b.f55942c) {
            "checkUrlSafely : jump seclink page directly : ".concat(String.valueOf(str));
            C23651a.m44723a("AsyncSecStrategy");
            this.f55915a.loadUrl(C23655d.m44728a(str, this.f55916b, -1));
            MethodCollector.m26664o(6945);
            return true;
        } else {
            "checkUrlSafely : safe url : ".concat(String.valueOf(str));
            C23651a.m44723a("AsyncSecStrategy");
            MethodCollector.m26664o(6945);
            return false;
        }
    }
}
