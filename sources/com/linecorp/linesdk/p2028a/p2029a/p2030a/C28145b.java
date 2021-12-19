package com.linecorp.linesdk.p2028a.p2029a.p2030a;

import com.bytedance.covode.number.Covode;
import java.io.IOException;
import java.io.InputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.linecorp.linesdk.a.a.a.b */
public final class C28145b implements AbstractC28146c<JSONObject> {

    /* renamed from: a */
    private final C28147d f65869a = new C28147d();

    static {
        Covode.recordClassIndex(34086);
    }

    /* renamed from: b */
    public final JSONObject mo48131a(InputStream inputStream) {
        try {
            return new JSONObject(this.f65869a.mo48131a(inputStream));
        } catch (JSONException e) {
            throw new IOException(e);
        }
    }
}
