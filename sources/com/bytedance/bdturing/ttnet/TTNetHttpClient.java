package com.bytedance.bdturing.ttnet;

import android.content.Context;
import com.bytedance.bdturing.C13241a;
import com.bytedance.bdturing.p864d.AbstractC13269a;
import com.bytedance.covode.number.Covode;
import java.util.Map;

public class TTNetHttpClient implements AbstractC13269a {
    private Context context;

    static {
        Covode.recordClassIndex(15268);
    }

    public TTNetHttpClient(Context context2) {
        this.context = context2;
        if (C13241a.C13243a.f32360a.f32353a.f32397x) {
            C13305a.m23925a();
        }
    }

    @Override // com.bytedance.bdturing.p864d.AbstractC13269a
    public byte[] get(String str, Map<String, String> map) {
        C13309b.m23932a(this.context, str, map);
        return C13305a.m23927a(str, map);
    }

    @Override // com.bytedance.bdturing.p864d.AbstractC13269a
    public byte[] post(String str, Map<String, String> map, byte[] bArr) {
        C13309b.m23932a(this.context, str, map);
        return C13305a.m23928a(str, bArr, map);
    }
}
