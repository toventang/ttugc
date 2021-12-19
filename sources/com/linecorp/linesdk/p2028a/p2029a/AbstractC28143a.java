package com.linecorp.linesdk.p2028a.p2029a;

import com.bytedance.covode.number.Covode;
import com.linecorp.linesdk.p2028a.p2029a.p2030a.AbstractC28146c;
import com.linecorp.linesdk.p2028a.p2029a.p2030a.C28145b;
import java.io.IOException;
import java.io.InputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.linecorp.linesdk.a.a.a */
abstract class AbstractC28143a<T> implements AbstractC28146c<T> {

    /* renamed from: a */
    private final C28145b f65863a;

    static {
        Covode.recordClassIndex(34084);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract T mo48132a(JSONObject jSONObject);

    AbstractC28143a() {
        this(new C28145b());
    }

    private AbstractC28143a(C28145b bVar) {
        this.f65863a = bVar;
    }

    @Override // com.linecorp.linesdk.p2028a.p2029a.p2030a.AbstractC28146c
    /* renamed from: a */
    public final T mo48131a(InputStream inputStream) {
        try {
            return mo48132a(this.f65863a.mo48131a(inputStream));
        } catch (JSONException e) {
            throw new IOException(e);
        }
    }
}
