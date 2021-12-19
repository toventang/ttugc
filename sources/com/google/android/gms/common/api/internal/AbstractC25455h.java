package com.google.android.gms.common.api.internal;

import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p1945d.BinderC25721a;
import com.google.android.gms.internal.p1945d.C25723c;

/* renamed from: com.google.android.gms.common.api.internal.h */
public interface AbstractC25455h extends IInterface {
    static {
        Covode.recordClassIndex(30854);
    }

    /* renamed from: a */
    void mo41709a(Status status);

    /* renamed from: com.google.android.gms.common.api.internal.h$a */
    public static abstract class AbstractBinderC25456a extends BinderC25721a implements AbstractC25455h {
        static {
            Covode.recordClassIndex(30855);
        }

        public AbstractBinderC25456a() {
            super("com.google.android.gms.common.api.internal.IStatusCallback");
        }

        @Override // com.google.android.gms.internal.p1945d.BinderC25721a
        /* renamed from: a */
        public final boolean mo41710a(int i, Parcel parcel, Parcel parcel2) {
            if (i != 1) {
                return false;
            }
            mo41709a((Status) C25723c.m49674a(parcel, Status.CREATOR));
            return true;
        }
    }
}
