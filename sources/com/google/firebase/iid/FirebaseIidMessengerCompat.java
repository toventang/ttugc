package com.google.firebase.iid;

import android.os.Build;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.firebase.iid.AbstractC27803s;

public class FirebaseIidMessengerCompat implements Parcelable {
    public static final Parcelable.Creator<FirebaseIidMessengerCompat> CREATOR = new Parcelable.Creator<FirebaseIidMessengerCompat>() {
        /* class com.google.firebase.iid.FirebaseIidMessengerCompat.C277501 */

        static {
            Covode.recordClassIndex(33335);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ FirebaseIidMessengerCompat[] newArray(int i) {
            return new FirebaseIidMessengerCompat[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ FirebaseIidMessengerCompat createFromParcel(Parcel parcel) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                return new FirebaseIidMessengerCompat(readStrongBinder);
            }
            return null;
        }
    };

    /* renamed from: a */
    Messenger f65196a;

    /* renamed from: b */
    AbstractC27803s f65197b;

    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(33334);
    }

    /* renamed from: a */
    private IBinder m55475a() {
        Messenger messenger = this.f65196a;
        if (messenger != null) {
            return messenger.getBinder();
        }
        return this.f65197b.asBinder();
    }

    public int hashCode() {
        return m55475a().hashCode();
    }

    public FirebaseIidMessengerCompat(IBinder iBinder) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f65196a = new Messenger(iBinder);
        } else {
            this.f65197b = new AbstractC27803s.C27804a(iBinder);
        }
    }

    /* renamed from: a */
    public final void mo46383a(Message message) {
        Messenger messenger = this.f65196a;
        if (messenger != null) {
            messenger.send(message);
        } else {
            this.f65197b.mo46449a(message);
        }
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return m55475a().equals(((FirebaseIidMessengerCompat) obj).m55475a());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    /* renamed from: com.google.firebase.iid.FirebaseIidMessengerCompat$a */
    public static final class C27751a extends ClassLoader {
        static {
            Covode.recordClassIndex(33336);
        }

        /* access modifiers changed from: protected */
        @Override // java.lang.ClassLoader
        public final Class<?> loadClass(String str, boolean z) {
            if (!"com.google.android.gms.iid.MessengerCompat".equals(str)) {
                return super.loadClass(str, z);
            }
            FirebaseInstanceId.m55481f();
            return FirebaseIidMessengerCompat.class;
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        Messenger messenger = this.f65196a;
        if (messenger != null) {
            parcel.writeStrongBinder(messenger.getBinder());
        } else {
            parcel.writeStrongBinder(this.f65197b.asBinder());
        }
    }
}
