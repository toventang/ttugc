package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.p025c.C0486b;
import androidx.room.AbstractC1512d;
import androidx.room.AbstractC1515e;
import androidx.room.C1519g;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.push.downgrade.C65713d;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* access modifiers changed from: package-private */
/* renamed from: androidx.room.h */
public final class C1524h {

    /* renamed from: a */
    Context f5013a;

    /* renamed from: b */
    final String f5014b;

    /* renamed from: c */
    int f5015c;

    /* renamed from: d */
    final C1519g f5016d;

    /* renamed from: e */
    final C1519g.AbstractC1522b f5017e;

    /* renamed from: f */
    AbstractC1515e f5018f;

    /* renamed from: g */
    final Executor f5019g;

    /* renamed from: h */
    final AbstractC1512d f5020h = new AbstractC1512d.AbstractBinderC1513a() {
        /* class androidx.room.C1524h.BinderC15251 */

        static {
            Covode.recordClassIndex(1664);
        }

        @Override // androidx.room.AbstractC1512d
        /* renamed from: a */
        public final void mo5060a(final String[] strArr) {
            C1524h.this.f5019g.execute(new Runnable() {
                /* class androidx.room.C1524h.BinderC15251.RunnableC15261 */

                static {
                    Covode.recordClassIndex(1665);
                }

                public final void run() {
                    C0486b bVar;
                    C1519g gVar = C1524h.this.f5016d;
                    String[] strArr = strArr;
                    synchronized (gVar.f4996g) {
                        Iterator<Map.Entry<C1519g.AbstractC1522b, C1519g.C1523c>> it = gVar.f4996g.iterator();
                        while (it.hasNext()) {
                            Map.Entry<C1519g.AbstractC1522b, C1519g.C1523c> next = it.next();
                            if (!next.getKey().mo5075a()) {
                                C1519g.C1523c value = next.getValue();
                                if (value.f5010b.length == 1) {
                                    int length = strArr.length;
                                    int i = 0;
                                    while (true) {
                                        if (i >= length) {
                                            break;
                                        } else if (strArr[i].equalsIgnoreCase(value.f5010b[0])) {
                                            Set<String> set = value.f5012d;
                                            if (set != null) {
                                                bVar = set;
                                            }
                                        } else {
                                            i++;
                                        }
                                    }
                                } else {
                                    C0486b bVar2 = new C0486b();
                                    for (String str : strArr) {
                                        String[] strArr2 = value.f5010b;
                                        int length2 = strArr2.length;
                                        int i2 = 0;
                                        while (true) {
                                            if (i2 >= length2) {
                                                break;
                                            }
                                            String str2 = strArr2[i2];
                                            if (str2.equalsIgnoreCase(str)) {
                                                bVar2.add(str2);
                                                break;
                                            }
                                            i2++;
                                        }
                                    }
                                    int size = bVar2.size();
                                    bVar = bVar2;
                                    if (size <= 0) {
                                    }
                                }
                                value.f5011c.mo5074a(bVar);
                            }
                        }
                    }
                }
            });
        }
    };

    /* renamed from: i */
    final AtomicBoolean f5021i = new AtomicBoolean(false);

    /* renamed from: j */
    final ServiceConnection f5022j;

    /* renamed from: k */
    final Runnable f5023k;

    /* renamed from: l */
    final Runnable f5024l;

    /* renamed from: m */
    private final Runnable f5025m;

    static {
        Covode.recordClassIndex(1663);
    }

    C1524h(Context context, String str, C1519g gVar, Executor executor) {
        ServiceConnectionC15272 r4 = new ServiceConnection() {
            /* class androidx.room.C1524h.ServiceConnectionC15272 */

            static {
                Covode.recordClassIndex(1666);
            }

            public final void onServiceDisconnected(ComponentName componentName) {
                C1524h.this.f5019g.execute(C1524h.this.f5024l);
                C1524h.this.f5018f = null;
                C1524h.this.f5013a = null;
            }

            public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                AbstractC1515e aVar;
                C1524h hVar = C1524h.this;
                if (iBinder == null) {
                    aVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationService");
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC1515e)) {
                        aVar = new AbstractC1515e.AbstractBinderC1516a.C1517a(iBinder);
                    } else {
                        aVar = (AbstractC1515e) queryLocalInterface;
                    }
                }
                hVar.f5018f = aVar;
                C1524h.this.f5019g.execute(C1524h.this.f5023k);
            }
        };
        this.f5022j = r4;
        this.f5023k = new Runnable() {
            /* class androidx.room.C1524h.RunnableC15283 */

            static {
                Covode.recordClassIndex(1667);
            }

            public final void run() {
                try {
                    AbstractC1515e eVar = C1524h.this.f5018f;
                    if (eVar != null) {
                        C1524h hVar = C1524h.this;
                        hVar.f5015c = eVar.mo5039a(hVar.f5020h, C1524h.this.f5014b);
                        C1524h.this.f5016d.mo5068a(C1524h.this.f5017e);
                    }
                } catch (RemoteException unused) {
                }
            }
        };
        this.f5024l = new Runnable() {
            /* class androidx.room.C1524h.RunnableC15294 */

            static {
                Covode.recordClassIndex(1668);
            }

            public final void run() {
                C1524h.this.f5016d.mo5069b(C1524h.this.f5017e);
            }
        };
        this.f5025m = new Runnable() {
            /* class androidx.room.C1524h.RunnableC15305 */

            static {
                Covode.recordClassIndex(1669);
            }

            public final void run() {
                C1524h.this.f5016d.mo5069b(C1524h.this.f5017e);
                try {
                    AbstractC1515e eVar = C1524h.this.f5018f;
                    if (eVar != null) {
                        eVar.mo5041a(C1524h.this.f5020h, C1524h.this.f5015c);
                    }
                } catch (RemoteException unused) {
                }
                if (C1524h.this.f5013a != null) {
                    C1524h.this.f5013a.unbindService(C1524h.this.f5022j);
                    C1524h.this.f5013a = null;
                }
            }
        };
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        this.f5013a = applicationContext;
        this.f5014b = str;
        this.f5016d = gVar;
        this.f5019g = executor;
        this.f5017e = new C1519g.AbstractC1522b(gVar.f4991b) {
            /* class androidx.room.C1524h.C15316 */

            static {
                Covode.recordClassIndex(1670);
            }

            /* access modifiers changed from: package-private */
            @Override // androidx.room.C1519g.AbstractC1522b
            /* renamed from: a */
            public final boolean mo5075a() {
                return true;
            }

            @Override // androidx.room.C1519g.AbstractC1522b
            /* renamed from: a */
            public final void mo5074a(Set<String> set) {
                if (!C1524h.this.f5021i.get()) {
                    try {
                        C1524h.this.f5018f.mo5040a(C1524h.this.f5015c, (String[]) set.toArray(new String[0]));
                    } catch (RemoteException unused) {
                    }
                }
            }
        };
        Intent intent = new Intent(this.f5013a, MultiInstanceInvalidationService.class);
        Context context2 = this.f5013a;
        if (context2 == null || !(context2 instanceof Context)) {
            context2.bindService(intent, r4, 1);
        } else if (!C65713d.m117625a(context2, intent)) {
            context2.bindService(intent, r4, 1);
        }
    }
}
