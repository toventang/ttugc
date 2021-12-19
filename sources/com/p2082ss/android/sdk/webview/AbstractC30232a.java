package com.p2082ss.android.sdk.webview;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18137d;
import com.bytedance.ies.uikit.dialog.DialogC18267b;
import com.bytedance.ies.web.jsbridge2.C18364w;
import com.bytedance.ies.web.p1285a.AbstractC18294e;
import com.bytedance.ies.web.p1285a.AbstractC18295f;
import com.bytedance.ies.web.p1285a.C18288a;
import com.bytedance.ies.web.p1285a.C18297h;
import com.p2082ss.android.common.p2132c.C29823c;
import com.p2082ss.android.sdk.webview.C30270n;
import com.p2082ss.android.sdk.webview.p2175a.C30233a;
import com.p2082ss.android.sdk.webview.p2175a.C30235b;
import com.p2082ss.android.sdk.webview.p2175a.C30237c;
import com.p2082ss.android.sdk.webview.p2175a.C30238d;
import com.p2082ss.android.sdk.webview.p2175a.C30239e;
import com.p2082ss.android.sdk.webview.p2175a.C30242g;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.sdk.webview.a */
public abstract class AbstractC30232a implements WeakHandler.IHandler, AbstractC18295f, C30233a.AbstractC30234a, C30235b.AbstractC30236a, C30270n.AbstractC30273a {

    /* renamed from: A */
    private Handler f72116A = new WeakHandler(this);

    /* renamed from: B */
    private String f72117B;

    /* renamed from: C */
    private C18297h f72118C;

    /* renamed from: D */
    private C30274o f72119D = null;

    /* renamed from: E */
    private JSONArray f72120E = new JSONArray();

    /* renamed from: a */
    protected C30248e f72121a;

    /* renamed from: b */
    protected WeakReference<DialogC18267b> f72122b;

    /* renamed from: c */
    protected WeakReference<Context> f72123c;

    /* renamed from: d */
    protected List<String> f72124d;

    /* renamed from: e */
    protected AbstractC18294e f72125e;

    /* renamed from: f */
    protected List<String> f72126f;

    /* renamed from: g */
    protected long f72127g;

    /* renamed from: h */
    protected String f72128h;

    /* renamed from: i */
    protected int f72129i;

    /* renamed from: j */
    protected String f72130j;

    /* renamed from: k */
    protected String f72131k;

    /* renamed from: l */
    public String f72132l;

    /* renamed from: m */
    public String f72133m;

    /* renamed from: n */
    public long f72134n;

    /* renamed from: o */
    protected String f72135o;

    /* renamed from: p */
    protected String f72136p;

    /* renamed from: q */
    protected String f72137q;

    /* renamed from: r */
    protected String f72138r;

    /* renamed from: s */
    protected String f72139s;

    /* renamed from: t */
    protected String f72140t;

    /* renamed from: u */
    protected String f72141u;

    /* renamed from: v */
    protected Long f72142v = 0L;

    /* renamed from: w */
    protected String f72143w = null;

    /* renamed from: x */
    protected String f72144x = null;

    /* renamed from: y */
    public Boolean f72145y = true;

    /* renamed from: z */
    public C30239e f72146z;

    static {
        Covode.recordClassIndex(36743);
    }

    /* renamed from: a */
    public static String m61185a() {
        return "bytedance";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo53687b(C30248e eVar, C30245c cVar);

    /* renamed from: c */
    public boolean mo53690c() {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0079, code lost:
        if (r1 == null) goto L_0x0026;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0026 A[EDGE_INSN: B:49:0x0026->B:15:0x0026 ?: BREAK  , SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo53685a(java.lang.String r7) {
        /*
        // Method dump skipped, instructions count: 148
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.sdk.webview.AbstractC30232a.mo53685a(java.lang.String):boolean");
    }

    /* renamed from: f */
    private static boolean m61187f() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: d */
    public final void mo53691d() {
        DialogC18267b bVar;
        WeakReference<DialogC18267b> weakReference = this.f72122b;
        if (weakReference != null && (bVar = weakReference.get()) != null && bVar.isShowing()) {
            bVar.dismiss();
        }
    }

    /* renamed from: e */
    public final void mo53692e() {
        this.f72123c = null;
        C30248e eVar = this.f72121a;
        if (eVar != null) {
            C18288a aVar = eVar.f72166b;
            if (aVar != null) {
                aVar.mo29247a();
            }
            C18364w wVar = eVar.f72168d;
            if (wVar != null) {
                wVar.mo29403a();
            }
            this.f72121a = null;
        }
        C30270n a = C30270n.m61258a();
        if (a.f72206c != null && !a.f72206c.isEmpty()) {
            a.f72206c.remove(this);
        }
        this.f72125e = null;
    }

    /* renamed from: b */
    public List<String> mo53686b() {
        if (this.f72124d == null) {
            this.f72124d = new ArrayList();
        }
        this.f72124d.add("openConfig");
        this.f72124d.add("config");
        this.f72124d.add("appInfo");
        this.f72124d.add("close");
        this.f72124d.add("gallery");
        this.f72124d.add("toggleGalleryBars");
        this.f72124d.add("slideShow");
        this.f72124d.add("relatedShow");
        this.f72124d.add("toast");
        this.f72124d.add("slideDownload");
        this.f72124d.add("requestChangeOrientation");
        this.f72124d.add("adInfo");
        return this.f72124d;
    }

    /* renamed from: b */
    public final void mo53688b(String str) {
        if (str != null && str.startsWith("bytedance://")) {
            reportLocalEvent(str);
        }
    }

    /* renamed from: c */
    private static boolean mo125257c(String str) {
        if (C13627m.m24498a(str)) {
            return false;
        }
        if (str.startsWith("http://") || str.startsWith("https://")) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.sdk.webview.p2175a.C30233a.AbstractC30234a
    /* renamed from: b */
    public final void mo53689b(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                jSONObject.put("creative_id", this.f72138r);
                jSONObject.put("ad_id", this.f72139s);
                jSONObject.put("item_id", this.f72141u);
                jSONObject.put("advertiser_id", this.f72140t);
                jSONObject.put("desc", this.f72143w);
                jSONObject.put("view_time", this.f72142v);
                jSONObject.put("cover_url", this.f72144x);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    @JavascriptInterface
    public boolean reportLocalEvent(String str) {
        boolean z = false;
        if (C13627m.m24498a(str)) {
            return false;
        }
        try {
            Uri parse = Uri.parse(str);
            if (!"log_event".equals(parse.getHost())) {
                return false;
            }
            try {
                Message obtainMessage = this.f72116A.obtainMessage(1);
                obtainMessage.obj = parse;
                this.f72116A.sendMessage(obtainMessage);
                return true;
            } catch (Exception unused) {
                z = true;
            }
        } catch (Exception unused2) {
            return z;
        }
    }

    public AbstractC30232a(Context context) {
        this.f72123c = new WeakReference<>(context);
        C30270n a = C30270n.m61258a();
        if (a.f72206c == null) {
            a.f72206c = new ArrayList();
        }
        if (!a.f72206c.contains(this)) {
            a.f72206c.add(this);
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        long j;
        long parseLong;
        if (message.what == 1) {
            try {
                if (message.obj instanceof Uri) {
                    Uri uri = (Uri) message.obj;
                    if ("log_event".equals(uri.getHost())) {
                        String queryParameter = uri.getQueryParameter("category");
                        String queryParameter2 = uri.getQueryParameter("tag");
                        String queryParameter3 = uri.getQueryParameter("label");
                        try {
                            j = Long.parseLong(uri.getQueryParameter("value"));
                        } catch (Exception unused) {
                            j = 0;
                        }
                        try {
                            parseLong = Long.parseLong(uri.getQueryParameter("ext_value"));
                        } catch (Exception unused2) {
                        }
                        JSONObject jSONObject = null;
                        String queryParameter4 = uri.getQueryParameter("extra");
                        if (!C13627m.m24498a(queryParameter4)) {
                            try {
                                jSONObject = new JSONObject(queryParameter4);
                            } catch (Exception unused3) {
                            }
                        }
                        if (!(queryParameter2 == null || queryParameter3 == null)) {
                            C18129a.C18130a a = C18129a.m33747a(queryParameter2, queryParameter3, String.valueOf(j), "", String.valueOf(parseLong));
                            if (jSONObject != null) {
                                Iterator<String> keys = jSONObject.keys();
                                while (keys.hasNext()) {
                                    String next = keys.next();
                                    a.mo28900b(next, jSONObject.opt(next));
                                }
                            }
                            a.mo28902c();
                        }
                        if (C18137d.m33765b()) {
                            C29823c.m60082a(this.f72123c.get(), queryParameter, queryParameter2, queryParameter3, j, parseLong, jSONObject);
                        } else if (C18137d.m33764a()) {
                            if (jSONObject == null) {
                                try {
                                    jSONObject = new JSONObject();
                                } catch (JSONException e) {
                                    e.printStackTrace();
                                }
                            }
                            jSONObject.put("_ad_staging_flag", "1");
                            C29823c.m60082a(this.f72123c.get(), queryParameter, queryParameter2, queryParameter3, j, parseLong, jSONObject);
                        }
                    }
                }
            } catch (Exception unused4) {
            }
        }
    }

    @Override // com.p2082ss.android.sdk.webview.p2175a.C30235b.AbstractC30236a
    /* renamed from: a */
    public void mo53684a(JSONObject jSONObject) {
        int i;
        if (!TextUtils.equals(this.f72135o, "1") || TextUtils.isEmpty(this.f72136p)) {
            jSONObject.put("cid", this.f72127g);
            jSONObject.put("group_id", this.f72134n);
            jSONObject.put("ad_type", this.f72129i);
            jSONObject.put("log_extra", this.f72130j);
            jSONObject.put("download_url", this.f72131k);
            jSONObject.put("package_name", this.f72132l);
            jSONObject.put("app_name", this.f72133m);
            if (this.f72127g == 0) {
                i = 0;
            } else {
                i = 1;
            }
            jSONObject.put("code", i);
            jSONObject.put("land_page_data", this.f72137q);
            return;
        }
        JSONObject jSONObject2 = new JSONObject(this.f72136p);
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            try {
                String next = keys.next();
                jSONObject.put(next, jSONObject2.opt(next));
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
    }

    @Override // com.bytedance.ies.web.p1285a.AbstractC18295f
    /* renamed from: a */
    public final boolean mo29290a(C18297h hVar) {
        if (!"call".equals(hVar.f43668a) || !"config".equals(hVar.f43670c) || C13627m.m24498a(hVar.f43669b)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo53683a(String str, JSONObject jSONObject) {
        C30248e eVar = this.f72121a;
        if (eVar != null) {
            eVar.mo53712a(str, jSONObject);
        }
    }

    /* renamed from: a */
    public List<String> mo53678a(List<String> list, boolean z) {
        if (this.f72126f == null) {
            this.f72126f = new ArrayList();
        }
        return this.f72126f;
    }

    /* renamed from: a */
    public final void mo53680a(C30248e eVar, C30245c cVar) {
        this.f72121a = eVar;
        if (eVar != null) {
            this.f72146z = new C30239e(eVar.f72166b, this.f72123c);
            eVar.mo53711a("isAppInstalled", new C30237c(this.f72123c)).mo53711a("open", new C30242g(this.f72123c)).mo53711a("login", this.f72146z).mo53711a("copyToClipboard", new C30238d(this.f72123c)).mo53711a("adInfo", new C30235b(this)).mo53711a("getAdInfoFromAweme", new C30233a(this));
            mo53687b(this.f72121a, cVar);
        }
    }

    @Override // com.p2082ss.android.sdk.webview.C30270n.AbstractC30273a
    /* renamed from: a */
    public final void mo53681a(String str, C30274o oVar, String str2) {
        String str3;
        int i;
        List<String> list;
        WebView webView;
        if (str != null && str.equals(this.f72117B) && this.f72118C != null) {
            C30248e eVar = this.f72121a;
            if (eVar == null || (webView = eVar.f72173i) == null) {
                str3 = null;
            } else {
                str3 = webView.getUrl();
            }
            if (!C13627m.m24498a(str3) && mo125257c(str3)) {
                try {
                    String host = Uri.parse(str3).getHost();
                    if (host != null && host.equals(str2)) {
                        JSONObject jSONObject = new JSONObject();
                        if (oVar != null) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                        jSONObject.put("code", i);
                        if (oVar != null) {
                            list = oVar.f72218e;
                        } else {
                            list = null;
                        }
                        AbstractC18294e eVar2 = this.f72125e;
                        if (eVar2 != null) {
                            eVar2.mo29250a(list, this.f72118C, jSONObject);
                        }
                        this.f72119D = oVar;
                        this.f72117B = null;
                        this.f72118C = null;
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008b, code lost:
        if (r9 == null) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00f2, code lost:
        if ((r18 - r9.f72217d) < 1200000) goto L_0x010e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00f5, code lost:
        if (r17 != false) goto L_0x00f7;
     */
    @Override // com.bytedance.ies.web.p1285a.AbstractC18295f
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo29289a(com.bytedance.ies.web.p1285a.C18297h r21, org.json.JSONObject r22, java.lang.String r23, com.bytedance.ies.web.p1285a.AbstractC18294e r24) {
        /*
        // Method dump skipped, instructions count: 298
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.sdk.webview.AbstractC30232a.mo29289a(com.bytedance.ies.web.a.h, org.json.JSONObject, java.lang.String, com.bytedance.ies.web.a.e):void");
    }

    /* renamed from: a */
    public final void mo53682a(String str, String str2, String str3, String str4, String str5, long j, String str6) {
        this.f72138r = str;
        this.f72139s = str2;
        this.f72141u = str3;
        this.f72140t = str4;
        this.f72143w = str5;
        this.f72142v = Long.valueOf(j);
        this.f72144x = str6;
    }

    /* renamed from: a */
    public final void mo53679a(long j, String str, int i, String str2, String str3, String str4, String str5, String str6) {
        this.f72127g = j;
        this.f72128h = str;
        this.f72129i = i;
        this.f72130j = str2;
        this.f72131k = str3;
        this.f72135o = str4;
        this.f72136p = str5;
        this.f72137q = str6;
    }
}
