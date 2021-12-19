package com.google.firebase.iid;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.p1940d.AbstractC25619a;
import com.google.android.gms.p1940d.AbstractC25631h;
import java.io.IOException;

/* access modifiers changed from: package-private */
/* renamed from: com.google.firebase.iid.r */
public final /* synthetic */ class C27802r implements AbstractC25619a {

    /* renamed from: a */
    private final C27801q f65319a;

    static {
        Covode.recordClassIndex(33390);
    }

    C27802r(C27801q qVar) {
        this.f65319a = qVar;
    }

    @Override // com.google.android.gms.p1940d.AbstractC25619a
    /* renamed from: a */
    public final Object mo41863a(AbstractC25631h hVar) {
        Bundle bundle = (Bundle) hVar.mo41877a(IOException.class);
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string != null) {
                return string;
            }
            String string2 = bundle.getString("unregistered");
            if (string2 != null) {
                return string2;
            }
            String string3 = bundle.getString("error");
            if ("RST".equals(string3)) {
                throw new IOException("INSTANCE_ID_RESET");
            } else if (string3 != null) {
                throw new IOException(string3);
            } else {
                String.valueOf(String.valueOf(bundle)).length();
                new Throwable();
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
        } else {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }
}
