package com.bytedance.p1777x.p1779b;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.bytedance.x.b.a */
public final class C23682a implements Serializable, Cloneable {
    @AbstractC27891c(mo46611a = "javaScriptResource")
    public String javascriptResource;
    @AbstractC27891c(mo46611a = "vendorKey")
    public String vender;
    @AbstractC27891c(mo46611a = "verificationParameters")
    public String verificationParameters;

    static {
        Covode.recordClassIndex(27784);
    }

    public final boolean valid() {
        String str = this.javascriptResource;
        if (str == null || str.isEmpty()) {
            return false;
        }
        return true;
    }
}
