package com.bytedance.android.p126a.p136b.p138b.p139a;

import android.text.TextUtils;
import com.bytedance.android.p126a.p127a.p131d.C2626b;
import com.bytedance.android.p126a.p127a.p135h.C2643d;
import com.bytedance.android.p126a.p136b.p138b.C2665b;
import com.bytedance.android.p126a.p136b.p138b.C2667c;
import com.bytedance.android.p126a.p136b.p138b.p139a.AbstractC2661e;
import com.bytedance.android.p126a.p136b.p140c.C2669b;
import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.a.b.b.a.b */
public class C2658b extends AbstractC2656a {
    static {
        Covode.recordClassIndex(3046);
    }

    public C2658b() {
        super(null);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.p126a.p136b.p138b.p139a.AbstractC2656a
    /* renamed from: a */
    public final C2665b mo7175a(C2665b bVar) {
        C2626b bVar2;
        if (bVar == null) {
            return null;
        }
        String str = bVar.f7957b;
        boolean z = this instanceof C2659c;
        if (this.f7951a.f7941a.f7980k) {
            str = C2643d.m7651a(str, !z);
        }
        if (!z && (bVar2 = bVar.f7960e) != null) {
            JSONObject jSONObject = bVar2.f7886h;
            if (jSONObject == null) {
                jSONObject = new JSONObject();
                bVar2.f7886h = jSONObject;
            }
            try {
                jSONObject.putOpt("custom_net", 1);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        C2665b.C2666a aVar = bVar.f7956a;
        aVar.f7961a = str;
        return aVar.mo7182a();
    }

    @Override // com.bytedance.android.p126a.p136b.p138b.p139a.AbstractC2661e, com.bytedance.android.p126a.p136b.p138b.p139a.AbstractC2656a
    /* renamed from: a */
    public final C2667c mo7176a(AbstractC2661e.AbstractC2662a aVar) {
        int i;
        C2665b a = mo7175a(aVar.mo7178a());
        String str = a.f7957b;
        C2669b bVar = this.f7951a.f7941a;
        if (bVar != null) {
            i = bVar.f7979j;
        } else {
            i = 10000;
        }
        String a2 = C2643d.m7649a(str);
        boolean z = true;
        if (!TextUtils.isEmpty(a2) && this.f7951a.f7941a.f7981l.contains(a2)) {
            z = false;
        }
        return mo7177a(mo7180a(a, i, z));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C2667c mo7180a(C2665b bVar, int i, boolean z) {
        throw new RuntimeException("Not implemented");
    }
}
