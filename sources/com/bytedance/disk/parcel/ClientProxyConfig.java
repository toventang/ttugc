package com.bytedance.disk.parcel;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import com.bytedance.covode.number.Covode;
import com.bytedance.disk.p956a.AbstractC14425b;

public class ClientProxyConfig implements Parcelable {
    public static final Parcelable.Creator<ClientProxyConfig> CREATOR = new Parcelable.Creator<ClientProxyConfig>() {
        /* class com.bytedance.disk.parcel.ClientProxyConfig.C144801 */

        static {
            Covode.recordClassIndex(16560);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ClientProxyConfig[] newArray(int i) {
            return new ClientProxyConfig[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ClientProxyConfig createFromParcel(Parcel parcel) {
            return new ClientProxyConfig(parcel);
        }
    };

    /* renamed from: a */
    public boolean f35007a;

    /* renamed from: b */
    public int f35008b;

    /* renamed from: c */
    public AbstractC14425b f35009c;

    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(16559);
    }

    public ClientProxyConfig() {
        this.f35008b = -1;
        this.f35008b = Process.myPid();
    }

    protected ClientProxyConfig(Parcel parcel) {
        AbstractC14425b aVar;
        this.f35008b = -1;
        this.f35007a = parcel.readInt() != 1 ? false : true;
        this.f35008b = parcel.readInt();
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            aVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.bytedance.disk.aidl.IProcessCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC14425b)) {
                aVar = new AbstractC14425b.AbstractBinderC14426a.C14427a(readStrongBinder);
            } else {
                aVar = (AbstractC14425b) queryLocalInterface;
            }
        }
        this.f35009c = aVar;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f35007a ? 1 : 0);
        parcel.writeInt(this.f35008b);
        parcel.writeStrongBinder(this.f35009c.asBinder());
    }
}
