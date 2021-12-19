package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.AbstractC1567a;
import com.bytedance.covode.number.Covode;

public class RemoteActionCompatParcelizer {
    static {
        Covode.recordClassIndex(646);
    }

    public static RemoteActionCompat read(AbstractC1567a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f2441a = (IconCompat) aVar.mo5226c(remoteActionCompat.f2441a);
        remoteActionCompat.f2442b = aVar.mo5219b(remoteActionCompat.f2442b, 2);
        remoteActionCompat.f2443c = aVar.mo5219b(remoteActionCompat.f2443c, 3);
        remoteActionCompat.f2444d = (PendingIntent) aVar.mo5217b(remoteActionCompat.f2444d, 4);
        remoteActionCompat.f2445e = aVar.mo5224b(remoteActionCompat.f2445e, 5);
        remoteActionCompat.f2446f = aVar.mo5224b(remoteActionCompat.f2446f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC1567a aVar) {
        aVar.mo5209a(remoteActionCompat.f2441a);
        aVar.mo5211a(remoteActionCompat.f2442b, 2);
        aVar.mo5211a(remoteActionCompat.f2443c, 3);
        aVar.mo5208a(remoteActionCompat.f2444d, 4);
        aVar.mo5214a(remoteActionCompat.f2445e, 5);
        aVar.mo5214a(remoteActionCompat.f2446f, 6);
    }
}
