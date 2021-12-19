package com.bytedance.globalpayment.p1036a.p1037a.p1038a.p1044e.p1045a;

import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.common.utility.p907b.RunnableC13596e;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.model.AbsResult;
import com.bytedance.globalpayment.p1036a.p1037a.p1038a.C15074a;
import com.bytedance.globalpayment.p1036a.p1037a.p1038a.p1040b.C15080a;
import com.bytedance.globalpayment.p1036a.p1037a.p1038a.p1042d.C15092e;
import com.bytedance.globalpayment.p1036a.p1037a.p1038a.p1044e.p1046b.AbstractC15101b;
import com.bytedance.globalpayment.payment.common.lib.p1071a.AbstractC15235a;
import com.bytedance.globalpayment.payment.common.lib.p1078h.C15253a;
import com.bytedance.globalpayment.payment.common.lib.p1082j.C15279a;
import com.bytedance.globalpayment.payment.common.lib.p1082j.C15280b;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.bytedance.globalpayment.a.a.a.e.a.b */
public class C15096b implements AbstractC15101b {

    /* renamed from: a */
    public final String f36845a = C15096b.class.getCanonicalName();

    /* renamed from: b */
    public Map<String, String> f36846b = new ConcurrentHashMap();

    /* renamed from: c */
    public String f36847c;

    static {
        Covode.recordClassIndex(17264);
    }

    @Override // com.bytedance.globalpayment.p1036a.p1037a.p1038a.p1044e.p1046b.AbstractC15101b
    /* renamed from: a */
    public final String mo24355a(String str, String str2) {
        try {
            if (TextUtils.equals(str, this.f36847c)) {
                return this.f36846b.get(str2);
            }
            Map<String, String> a = C15280b.m28153a(new JSONObject(C15279a.m28152a(C15253a.m28071a().mo24709i().mo24713b(), "pipo_starling.json")));
            if (!TextUtils.equals(this.f36847c, str)) {
                this.f36847c = str;
                final C150971 r2 = new AbstractC15101b.AbstractC15102a() {
                    /* class com.bytedance.globalpayment.p1036a.p1037a.p1038a.p1044e.p1045a.C15096b.C150971 */

                    /* renamed from: a */
                    final /* synthetic */ AbstractC15101b.AbstractC15102a f36848a = null;

                    static {
                        Covode.recordClassIndex(17265);
                    }

                    @Override // com.bytedance.globalpayment.p1036a.p1037a.p1038a.p1044e.p1046b.AbstractC15101b.AbstractC15102a
                    /* renamed from: a */
                    public final void mo24357a(Map<String, String> map) {
                        C15096b.this.f36846b = map;
                        AbstractC15101b.AbstractC15102a aVar = this.f36848a;
                        if (aVar != null) {
                            aVar.mo24357a(map);
                        }
                    }
                };
                if (Looper.getMainLooper() == Looper.myLooper()) {
                    RunnableC13596e.m24423a(new Runnable() {
                        /* class com.bytedance.globalpayment.p1036a.p1037a.p1038a.p1044e.p1045a.C15096b.RunnableC150982 */

                        /* renamed from: b */
                        final /* synthetic */ String f36851b = null;

                        static {
                            Covode.recordClassIndex(17266);
                        }

                        public final void run() {
                            C15096b bVar = C15096b.this;
                            bVar.mo24356a(bVar.f36847c, r2, this.f36851b);
                        }
                    });
                } else {
                    mo24356a(this.f36847c, r2, null);
                }
            }
            return a.get(str2);
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: a */
    public final void mo24356a(final String str, final AbstractC15101b.AbstractC15102a aVar, String str2) {
        final HashMap hashMap = new HashMap();
        C15253a.m28071a().mo24706f();
        try {
            hashMap.putAll(C15280b.m28153a(new JSONObject(C15279a.m28152a(C15253a.m28071a().mo24709i().mo24713b(), "pipo_starling.json"))));
        } catch (Throwable unused) {
        }
        String string = C15080a.m27756a(C15253a.m28071a().mo24709i().mo24713b()).f36798a.getString("sp_key_starling_data_".concat(String.valueOf(str)), "");
        C15253a.m28071a().mo24706f();
        if (!TextUtils.isEmpty(string)) {
            try {
                hashMap.putAll(C15280b.m28153a(new JSONObject(string)));
            } catch (Throwable unused2) {
            }
        }
        C15253a.m28071a().mo24706f();
        C15074a.m27751a().mo24346b().mo24351a(C15080a.m27756a(C15253a.m28071a().mo24709i().mo24713b()).f36798a.getLong("sp_key_starling_version_".concat(String.valueOf(str)), 0), str, str2, new AbstractC15235a<C15092e>() {
            /* class com.bytedance.globalpayment.p1036a.p1037a.p1038a.p1044e.p1045a.C15096b.C150993 */

            static {
                Covode.recordClassIndex(17267);
            }

            @Override // com.bytedance.globalpayment.payment.common.lib.p1071a.AbstractC15235a
            /* renamed from: a */
            public final void mo24359a(AbsResult absResult) {
                C15096b.this.f36846b.putAll(hashMap);
                C15253a.m28071a().mo24706f();
                AbstractC15101b.AbstractC15102a aVar = aVar;
                if (aVar != null) {
                    aVar.mo24357a(C15096b.this.f36846b);
                }
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.bytedance.globalpayment.payment.common.lib.p1071a.AbstractC15235a
            /* renamed from: a */
            public final /* synthetic */ void mo24360a(C15092e eVar) {
                C15092e eVar2 = eVar;
                hashMap.putAll(eVar2.f36836c);
                C15096b.this.f36846b.putAll(hashMap);
                C15080a.m27756a(C15253a.m28071a().mo24709i().mo24713b()).f36798a.edit().putLong("sp_key_starling_version_".concat(String.valueOf(str)), Long.valueOf(eVar2.f36835b).longValue()).apply();
                C15080a a = C15080a.m27756a(C15253a.m28071a().mo24709i().mo24713b());
                String str = str;
                a.f36798a.edit().putString("sp_key_starling_data_".concat(String.valueOf(str)), eVar2.f36837d).apply();
                AbstractC15101b.AbstractC15102a aVar = aVar;
                if (aVar != null) {
                    aVar.mo24357a(C15096b.this.f36846b);
                }
                C15253a.m28071a().mo24706f();
            }
        });
    }
}
