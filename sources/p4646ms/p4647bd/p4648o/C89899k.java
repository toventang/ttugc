package p4646ms.p4647bd.p4648o;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.framwork.core.sdkmonitor.C14827k;
import com.p2082ss.ugc.effectplatform.p4444b.p4445a.C86745e;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ms.bd.o.k */
public final class C89899k extends AbstractC89895j {

    /* renamed from: a */
    private C14827k f203786a;

    /* renamed from: ms.bd.o.k$a */
    class C89900a implements C14827k.AbstractC14835a {

        /* renamed from: a */
        final /* synthetic */ JSONObject f203787a;

        /* renamed from: b */
        final /* synthetic */ String f203788b;

        static {
            Covode.recordClassIndex(105997);
        }

        C89900a(JSONObject jSONObject, String str) {
            this.f203787a = jSONObject;
            this.f203788b = str;
        }

        @Override // com.bytedance.framwork.core.sdkmonitor.C14827k.AbstractC14835a
        /* renamed from: a */
        public final Map<String, String> mo21830a() {
            Object obj;
            MethodCollector.m26663i(897);
            HashMap hashMap = new HashMap();
            try {
                Object a = C89889h.m155966a(16777217, 0, 0, "c9c63f", new byte[]{125, 45, 21, 80, 31, 116, 97});
                if (this.f203787a.getBoolean((String) C89889h.m155966a(16777217, 0, 0, "c21dcc", new byte[]{125, 38, 71, 2, 79, 113, 97}))) {
                    obj = C89889h.m155966a(16777217, 0, 0, "bcdf0a", new byte[]{34});
                } else {
                    obj = C89889h.m155966a(16777217, 0, 0, "6d6527", new byte[]{119});
                }
                hashMap.put(a, obj);
            } catch (JSONException unused) {
                C89889h.m155966a(16777217, 0, 0, "976f54", new byte[]{59, 48, 72, 45, C86745e.f195623b, 48});
            }
            hashMap.put(C89889h.m155966a(16777217, 0, 0, "baada6", new byte[]{123, 108, 1, 4, 97, 32, 104, 68}), this.f203788b);
            MethodCollector.m26664o(897);
            return hashMap;
        }
    }

    static {
        Covode.recordClassIndex(105996);
    }

    @Override // p4646ms.p4647bd.p4648o.AbstractC89895j
    /* renamed from: a */
    public final void mo144454a(long j, long j2, String str, String str2, String str3, int i) {
        C14827k kVar = this.f203786a;
        if (kVar != null) {
            kVar.mo23854a(j, j2, str, str2, str3, i, (JSONObject) null);
        }
    }

    @Override // p4646ms.p4647bd.p4648o.AbstractC89895j
    /* renamed from: a */
    public final void mo144455a(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        if (this.f203786a != null) {
            if (jSONObject.length() > 0 || jSONObject2.length() > 0) {
                this.f203786a.mo23859a(str, jSONObject, jSONObject2, jSONObject3);
            }
        }
    }

    @Override // p4646ms.p4647bd.p4648o.AbstractC89895j
    /* renamed from: b */
    public final void mo144457b(long j, long j2, String str, String str2, String str3, int i) {
        C14827k kVar = this.f203786a;
        if (kVar != null) {
            kVar.mo23863b(j, j2, str, str2, str3, i, (JSONObject) null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002b  */
    @Override // p4646ms.p4647bd.p4648o.AbstractC89895j
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo144456a(java.lang.String r29) {
        /*
        // Method dump skipped, instructions count: 467
        */
        throw new UnsupportedOperationException("Method not decompiled: p4646ms.p4647bd.p4648o.C89899k.mo144456a(java.lang.String):boolean");
    }
}
