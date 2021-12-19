package com.google.firebase.iid;

import android.content.Intent;
import android.os.Binder;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.p1940d.AbstractC25631h;

/* renamed from: com.google.firebase.iid.at */
public final class BinderC27779at extends Binder {

    /* renamed from: a */
    final AbstractC27780a f65272a;

    /* renamed from: com.google.firebase.iid.at$a */
    public interface AbstractC27780a {
        static {
            Covode.recordClassIndex(33368);
        }

        /* renamed from: a */
        AbstractC25631h<Void> mo46437a(Intent intent);
    }

    static {
        Covode.recordClassIndex(33367);
    }

    public BinderC27779at(AbstractC27780a aVar) {
        this.f65272a = aVar;
    }
}
