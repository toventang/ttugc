package com.bytedance.sdk.p1625a.p1643f;

import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.AbstractC22354d;
import com.bytedance.sdk.p1625a.p1626a.p1627a.AbstractC22288a;
import com.bytedance.sdk.p1625a.p1626a.p1627a.C22289b;
import com.bytedance.sdk.p1625a.p1626a.p1629c.AbstractC22309a;
import com.bytedance.sdk.p1625a.p1626a.p1629c.AbstractC22310b;
import com.bytedance.sdk.p1625a.p1626a.p1629c.AbstractC22311c;
import com.bytedance.sdk.p1625a.p1626a.p1629c.AbstractC22312d;
import com.bytedance.sdk.p1625a.p1641d.C22355a;
import com.bytedance.sdk.p1625a.p1641d.C22357b;
import com.bytedance.sdk.p1625a.p1664o.AbstractC22508a;
import com.bytedance.sdk.p1625a.p1664o.C22516h;
import com.bytedance.sdk.p1625a.p1664o.C22517i;
import com.p2082ss.android.C29910g;
import com.p2082ss.android.C29912h;
import com.p2082ss.android.account.C29349d;
import com.p2082ss.android.account.C29351f;
import com.p2082ss.android.account.p2088a.AbstractC29342b;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.a.f.h */
public abstract class AbstractC22384h<R extends C22289b> implements AbstractC22309a, AbstractC22311c {

    /* renamed from: h */
    private static AbstractC22310b f52928h = new AbstractC22310b() {
        /* class com.bytedance.sdk.p1625a.p1643f.AbstractC22384h.C223862 */

        static {
            Covode.recordClassIndex(26202);
        }

        @Override // com.bytedance.sdk.p1625a.p1626a.p1629c.AbstractC22310b
        /* renamed from: a */
        public final AbstractC22312d mo36609a(AbstractC22311c cVar) {
            C22388a aVar = new C22388a(cVar, (byte) 0);
            aVar.mo36748b();
            return aVar;
        }
    };

    /* renamed from: i */
    private static AbstractC22390j f52929i = new AbstractC22390j() {
        /* class com.bytedance.sdk.p1625a.p1643f.AbstractC22384h.C223873 */

        static {
            Covode.recordClassIndex(26203);
        }

        @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22390j
        /* renamed from: a */
        public final void mo36737a(C22391k kVar) {
            WeakHandler weakHandler = ((C22375e) C22375e.m42171a(C29351f.m58781a().mo52210b())).f52916v;
            Message obtain = Message.obtain(weakHandler, 100);
            obtain.obj = kVar;
            weakHandler.sendMessage(obtain);
        }
    };

    /* renamed from: a */
    protected Context f52930a;

    /* renamed from: b */
    protected C22355a f52931b;

    /* renamed from: c */
    public C22357b f52932c;

    /* renamed from: d */
    protected AbstractC22288a f52933d;

    /* renamed from: e */
    private String f52934e;

    /* renamed from: f */
    private AbstractC22312d f52935f;

    /* renamed from: g */
    private boolean f52936g;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract R mo36600a(boolean z, C22357b bVar);

    /* renamed from: a */
    public abstract void mo36601a(R r);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo36602a(JSONObject jSONObject, JSONObject jSONObject2);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo36603b(JSONObject jSONObject, JSONObject jSONObject2);

    /* renamed from: a */
    private boolean m42218a(JSONObject jSONObject, JSONObject jSONObject2, String str) {
        if (!"success".equals(str)) {
            m42216a(str, jSONObject, jSONObject2);
            return false;
        } else if (jSONObject2 == null) {
            return true;
        } else {
            mo36603b(jSONObject, jSONObject2);
            return true;
        }
    }

    /* renamed from: com.bytedance.sdk.a.f.h$a */
    static class C22388a extends AbstractC22508a implements AbstractC22312d {

        /* renamed from: g */
        private AbstractC22311c f52939g;

        static {
            Covode.recordClassIndex(26204);
        }

        @Override // com.bytedance.sdk.p1625a.p1650j.p1651a.AbstractRunnableC22458c
        public final void run() {
            this.f52939g.mo36610b();
        }

        private C22388a(AbstractC22311c cVar) {
            this.f52939g = cVar;
        }

        /* synthetic */ C22388a(AbstractC22311c cVar, byte b) {
            this(cVar);
        }
    }

    @Override // com.bytedance.sdk.p1625a.p1626a.p1629c.AbstractC22309a
    /* renamed from: a */
    public final void mo36608a() {
        this.f52933d = null;
    }

    @Override // com.bytedance.sdk.p1625a.p1626a.p1629c.AbstractC22312d
    /* renamed from: c */
    public final void mo36611c() {
        this.f52933d = null;
        AbstractC22312d dVar = this.f52935f;
        if (dVar != null) {
            dVar.mo36611c();
        }
    }

    /* renamed from: d */
    public final void mo36736d() {
        this.f52935f = f52928h.mo36609a(this);
    }

    static {
        Covode.recordClassIndex(26200);
    }

    @Override // com.bytedance.sdk.p1625a.p1626a.p1629c.AbstractC22311c
    /* renamed from: b */
    public final void mo36610b() {
        final R e = m42219e();
        if (e != null) {
            C22357b bVar = this.f52932c;
            if (bVar != null) {
                e.f52714c = bVar.f52833d;
                e.f52712a = this.f52932c.f52835f;
            }
            if (TextUtils.isEmpty(e.f52714c)) {
                e.f52714c = this.f52934e;
            }
            mo36601a(e);
            AbstractC29342b bVar2 = C29349d.m58779a().f69668a;
            if ((this.f52932c.f52831b == 1104 || this.f52932c.f52831b == 1105) && bVar2 != null && !bVar2.mo51304a()) {
                new Object() {
                    /* class com.bytedance.sdk.p1625a.p1643f.AbstractC22384h.C223851 */

                    static {
                        Covode.recordClassIndex(26201);
                    }
                };
                return;
            }
            f52929i.mo36737a(new C22391k(this.f52933d, e));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01bc, code lost:
        if (r8 == -14) goto L_0x01be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01c2, code lost:
        if (com.bytedance.sdk.p1625a.p1664o.C22512e.m42466a(r10) == false) goto L_0x01c4;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private R m42219e() {
        /*
        // Method dump skipped, instructions count: 626
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.p1625a.p1643f.AbstractC22384h.m42219e():com.bytedance.sdk.a.a.a.b");
    }

    /* renamed from: a */
    public static String m42212a(String str) {
        String b = C22517i.m42476b(str, "passport_csrf_token");
        if (TextUtils.isEmpty(b)) {
            return C22517i.m42476b(str, "passport_csrf_token_default");
        }
        return b;
    }

    /* renamed from: a */
    private static JSONObject m42213a(JSONObject jSONObject) {
        Exception e;
        JSONObject jSONObject2 = null;
        if (jSONObject == null || !jSONObject.has("data")) {
            return null;
        }
        try {
            Object opt = jSONObject.opt("data");
            if (opt == null) {
                return null;
            }
            if (opt instanceof JSONObject) {
                return (JSONObject) opt;
            }
            if (opt instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) opt;
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("data", jSONArray);
                    jSONObject2 = jSONObject3;
                } catch (Exception e2) {
                    e = e2;
                    jSONObject2 = jSONObject3;
                }
            }
            return jSONObject2;
        } catch (Exception e3) {
            e = e3;
            e.printStackTrace();
            return jSONObject2;
        }
    }

    /* renamed from: a */
    private void m42214a(C29912h hVar) {
        Context context;
        if (hVar != null) {
            try {
                List<C29910g> list = hVar.f71349c;
                if (list != null) {
                    for (C29910g gVar : list) {
                        if ("x-tt-multi-sids".equalsIgnoreCase(gVar.f71345a)) {
                            String str = gVar.f71346b;
                            if (!TextUtils.isEmpty(str) && (context = this.f52930a) != null) {
                                C22375e.m42171a(context).mo36620b(str);
                            }
                        }
                        if ("x-tt-logid".equalsIgnoreCase(gVar.f71345a)) {
                            String str2 = gVar.f71346b;
                            if (!TextUtils.isEmpty(str2)) {
                                this.f52932c.f52835f = str2;
                            }
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    private void m42217a(List<C29910g> list) {
        String str = null;
        try {
            Context context = this.f52930a;
            if (context != null) {
                str = C22375e.m42171a(context).mo36627f();
            }
            if (!TextUtils.isEmpty(str)) {
                list.add(new C29910g("x-tt-multi-sids", str));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private C29912h m42211a(String str, Map<String, String> map) {
        C22516h hVar = new C22516h(str);
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                hVar.mo36788a(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList();
        if (C29351f.m58781a().mo52212d()) {
            hVar.mo36788a("multi_login", "1");
            m42217a(arrayList);
        }
        m42215a(str, arrayList);
        hVar.mo36788a("account_sdk_source", "app");
        hVar.mo36787a("passport-sdk-version");
        String hVar2 = hVar.toString();
        this.f52932c.f52833d = hVar2;
        AbstractC22354d c = C29351f.m58781a().mo52211c();
        if (c != null) {
            return c.mo36701a(hVar2, arrayList);
        }
        return null;
    }

    /* renamed from: a */
    private static void m42215a(String str, List<C29910g> list) {
        try {
            String a = m42212a(str);
            if (!TextUtils.isEmpty(a)) {
                list.add(new C29910g("x-tt-passport-csrf-token", a));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public AbstractC22384h(Context context, C22355a aVar, AbstractC22288a aVar2) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        this.f52930a = applicationContext;
        this.f52934e = aVar.f52819a;
        this.f52931b = aVar;
        this.f52933d = aVar2;
        if (aVar2 != null) {
            aVar2.f52853b = this;
        }
        this.f52932c = new C22357b(aVar);
    }

    /* renamed from: a */
    private void m42216a(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        if (("error".equals(str) || "exception".equals(str)) && jSONObject2 != null) {
            if (jSONObject2.has("error_code")) {
                C22357b bVar = this.f52932c;
                bVar.f52831b = jSONObject2.optInt("error_code", bVar.f52831b);
            } else if (jSONObject2.has("code")) {
                C22357b bVar2 = this.f52932c;
                bVar2.f52831b = jSONObject2.optInt("code", bVar2.f52831b);
            }
            this.f52932c.f52832c = jSONObject2.optString("description");
            C22357b bVar3 = this.f52932c;
            bVar3.f52834e = bVar3.f52832c;
            mo36602a(jSONObject2, jSONObject);
        }
    }
}
