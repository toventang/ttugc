package android.support.p010v4.p011os;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.p010v4.p011os.AbstractC0171a;
import com.bytedance.covode.number.Covode;

/* renamed from: android.support.v4.os.ResultReceiver */
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new Parcelable.Creator<ResultReceiver>() {
        /* class android.support.p010v4.p011os.ResultReceiver.C01681 */

        static {
            Covode.recordClassIndex(192);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ResultReceiver[] newArray(int i) {
            return new ResultReceiver[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ResultReceiver createFromParcel(Parcel parcel) {
            return new ResultReceiver(parcel);
        }
    };

    /* renamed from: a */
    final boolean f457a;

    /* renamed from: b */
    final Handler f458b;

    /* renamed from: c */
    AbstractC0171a f459c;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo70a(int i, Bundle bundle) {
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: android.support.v4.os.ResultReceiver$b */
    class RunnableC0170b implements Runnable {

        /* renamed from: a */
        final int f461a;

        /* renamed from: b */
        final Bundle f462b;

        static {
            Covode.recordClassIndex(194);
        }

        public final void run() {
            ResultReceiver.this.mo70a(this.f461a, this.f462b);
        }

        RunnableC0170b(int i, Bundle bundle) {
            this.f461a = i;
            this.f462b = bundle;
        }
    }

    static {
        Covode.recordClassIndex(191);
    }

    /* renamed from: android.support.v4.os.ResultReceiver$a */
    class BinderC0169a extends AbstractC0171a.AbstractBinderC0172a {
        static {
            Covode.recordClassIndex(193);
        }

        BinderC0169a() {
        }

        @Override // android.support.p010v4.p011os.AbstractC0171a
        /* renamed from: a */
        public final void mo331a(int i, Bundle bundle) {
            if (ResultReceiver.this.f458b != null) {
                ResultReceiver.this.f458b.post(new RunnableC0170b(i, bundle));
            } else {
                ResultReceiver.this.mo70a(i, bundle);
            }
        }
    }

    ResultReceiver(Parcel parcel) {
        AbstractC0171a aVar;
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            aVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC0171a)) {
                aVar = new AbstractC0171a.AbstractBinderC0172a.C0173a(readStrongBinder);
            } else {
                aVar = (AbstractC0171a) queryLocalInterface;
            }
        }
        this.f459c = aVar;
    }

    /* renamed from: b */
    public final void mo326b(int i, Bundle bundle) {
        if (this.f457a) {
            Handler handler = this.f458b;
            if (handler != null) {
                handler.post(new RunnableC0170b(i, bundle));
            } else {
                mo70a(i, bundle);
            }
        } else {
            AbstractC0171a aVar = this.f459c;
            if (aVar != null) {
                try {
                    aVar.mo331a(i, bundle);
                } catch (RemoteException unused) {
                }
            }
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.f459c == null) {
                this.f459c = new BinderC0169a();
            }
            parcel.writeStrongBinder(this.f459c.asBinder());
        }
    }
}
