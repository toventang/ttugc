package com.bytedance.push.p1598i;

import com.bytedance.common.utility.AbstractC13621j;
import com.bytedance.covode.number.Covode;
import com.bytedance.push.C21798f;
import com.bytedance.push.PushBody;
import com.p2082ss.android.message.p2159a.C30062a;
import com.p2082ss.android.pushmanager.C30205a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.push.i.c */
public final class C21840c extends AbstractRunnableC21836a {

    /* renamed from: a */
    private final int f51742a;

    /* renamed from: b */
    private final PushBody f51743b;

    static {
        Covode.recordClassIndex(25492);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.push.p1598i.AbstractRunnableC21836a
    /* renamed from: a */
    public final void mo35513a() {
        byte[] bArr;
        Map<String, String> e = C21798f.f51646a.mo35448e();
        String a = C30062a.m60802a(C30205a.m61093a("/cloudpush/callback/client_show/"), e);
        String str = e.get("device_id");
        String str2 = e.get("aid");
        try {
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("client_time", String.valueOf(System.currentTimeMillis() / 1000));
            jSONObject.put("did", str);
            jSONObject.put("aid", str2);
            jSONObject.put("sender", String.valueOf(this.f51742a));
            jSONObject.put("group_id", String.valueOf(this.f51743b.f51544c));
            jSONObject.put("rid", String.valueOf(this.f51743b.f51542a));
            jSONObject.put("rid64", String.valueOf(this.f51743b.f51543b));
            jSONArray.put(jSONObject);
            bArr = jSONArray.toString().getBytes("UTF-8");
        } catch (Throwable unused) {
            bArr = null;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("Content-Type", "application/json; charset=utf-8");
            AbstractC13621j.f33100a.mo21871a(a, bArr, hashMap);
        } catch (Throwable unused2) {
        }
    }

    public C21840c(int i, PushBody pushBody) {
        this.f51742a = i;
        this.f51743b = pushBody;
    }
}
