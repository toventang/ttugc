package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import androidx.p025c.C0498h;
import androidx.room.AbstractC1515e;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.ServiceLifecycle;

public class MultiInstanceInvalidationService extends Service {

    /* renamed from: a */
    int f4942a;

    /* renamed from: b */
    final C0498h<String> f4943b = new C0498h<>();

    /* renamed from: c */
    final RemoteCallbackList<AbstractC1512d> f4944c = new RemoteCallbackList<AbstractC1512d>() {
        /* class androidx.room.MultiInstanceInvalidationService.RemoteCallbackListC14981 */

        static {
            Covode.recordClassIndex(1637);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.os.IInterface, java.lang.Object] */
        @Override // android.os.RemoteCallbackList
        public final /* synthetic */ void onCallbackDied(AbstractC1512d dVar, Object obj) {
            MultiInstanceInvalidationService.this.f4943b.mo2185b(((Integer) obj).intValue());
        }
    };

    /* renamed from: d */
    private final AbstractC1515e.AbstractBinderC1516a f4945d = new AbstractC1515e.AbstractBinderC1516a() {
        /* class androidx.room.MultiInstanceInvalidationService.BinderC14992 */

        static {
            Covode.recordClassIndex(1638);
        }

        @Override // androidx.room.AbstractC1515e
        /* renamed from: a */
        public final void mo5041a(AbstractC1512d dVar, int i) {
            synchronized (MultiInstanceInvalidationService.this.f4944c) {
                MultiInstanceInvalidationService.this.f4944c.unregister(dVar);
                MultiInstanceInvalidationService.this.f4943b.mo2185b(i);
            }
        }

        @Override // androidx.room.AbstractC1515e
        /* renamed from: a */
        public final int mo5039a(AbstractC1512d dVar, String str) {
            if (str == null) {
                return 0;
            }
            synchronized (MultiInstanceInvalidationService.this.f4944c) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
                int i = multiInstanceInvalidationService.f4942a + 1;
                multiInstanceInvalidationService.f4942a = i;
                if (MultiInstanceInvalidationService.this.f4944c.register(dVar, Integer.valueOf(i))) {
                    MultiInstanceInvalidationService.this.f4943b.mo2188c(i, str);
                    return i;
                }
                MultiInstanceInvalidationService multiInstanceInvalidationService2 = MultiInstanceInvalidationService.this;
                multiInstanceInvalidationService2.f4942a--;
                return 0;
            }
        }

        @Override // androidx.room.AbstractC1515e
        /* renamed from: a */
        public final void mo5040a(int i, String[] strArr) {
            synchronized (MultiInstanceInvalidationService.this.f4944c) {
                String a = MultiInstanceInvalidationService.this.f4943b.mo2183a(i, null);
                if (a != null) {
                    int beginBroadcast = MultiInstanceInvalidationService.this.f4944c.beginBroadcast();
                    for (int i2 = 0; i2 < beginBroadcast; i2++) {
                        try {
                            int intValue = ((Integer) MultiInstanceInvalidationService.this.f4944c.getBroadcastCookie(i2)).intValue();
                            String a2 = MultiInstanceInvalidationService.this.f4943b.mo2183a(intValue, null);
                            if (i != intValue && a.equals(a2)) {
                                try {
                                    MultiInstanceInvalidationService.this.f4944c.getBroadcastItem(i2).mo5060a(strArr);
                                } catch (RemoteException unused) {
                                }
                            }
                        } catch (Throwable th) {
                            MultiInstanceInvalidationService.this.f4944c.finishBroadcast();
                            throw th;
                        }
                    }
                    MultiInstanceInvalidationService.this.f4944c.finishBroadcast();
                }
            }
        }
    };

    static {
        Covode.recordClassIndex(1636);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        ServiceLifecycle.onStartCommand(this, intent, i, i2);
        return super.onStartCommand(intent, i, i2);
    }

    public IBinder onBind(Intent intent) {
        return this.f4945d;
    }
}
