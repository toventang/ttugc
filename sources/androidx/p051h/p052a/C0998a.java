package androidx.p051h.p052a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* renamed from: androidx.h.a.a */
public final class C0998a {

    /* renamed from: f */
    private static final Object f3538f = new Object();

    /* renamed from: g */
    private static C0998a f3539g;

    /* renamed from: a */
    final Context f3540a;

    /* renamed from: b */
    final HashMap<BroadcastReceiver, ArrayList<C1001b>> f3541b = new HashMap<>();

    /* renamed from: c */
    final ArrayList<C1000a> f3542c = new ArrayList<>();

    /* renamed from: d */
    private final HashMap<String, ArrayList<C1001b>> f3543d = new HashMap<>();

    /* renamed from: e */
    private final Handler f3544e;

    static {
        Covode.recordClassIndex(1091);
    }

    /* renamed from: androidx.h.a.a$b */
    static final class C1001b {

        /* renamed from: a */
        final IntentFilter f3548a;

        /* renamed from: b */
        final BroadcastReceiver f3549b;

        /* renamed from: c */
        boolean f3550c;

        /* renamed from: d */
        boolean f3551d;

        static {
            Covode.recordClassIndex(1094);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.f3549b);
            sb.append(" filter=");
            sb.append(this.f3548a);
            if (this.f3551d) {
                sb.append(" DEAD");
            }
            sb.append("}");
            return sb.toString();
        }

        C1001b(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f3548a = intentFilter;
            this.f3549b = broadcastReceiver;
        }
    }

    private C0998a(Context context) {
        this.f3540a = context;
        this.f3544e = new Handler(context.getMainLooper()) {
            /* class androidx.p051h.p052a.C0998a.HandlerC09991 */

            static {
                Covode.recordClassIndex(1092);
            }

            /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
                r6 = 0;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:15:0x0027, code lost:
                r5 = r7[r6];
                r4 = r5.f3547b.size();
                r3 = 0;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:16:0x0030, code lost:
                if (r3 >= r4) goto L_0x004a;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:17:0x0032, code lost:
                r1 = r5.f3547b.get(r3);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:18:0x003c, code lost:
                if (r1.f3551d != false) goto L_0x0047;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:19:0x003e, code lost:
                r1.f3549b.onReceive(r9.f3540a, r5.f3546a);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:20:0x0047, code lost:
                r3 = r3 + 1;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:21:0x004a, code lost:
                r6 = r6 + 1;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:22:0x004c, code lost:
                if (r6 >= r8) goto L_0x000b;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void handleMessage(android.os.Message r11) {
                /*
                    r10 = this;
                    int r1 = r11.what
                    r0 = 1
                    if (r1 == r0) goto L_0x0009
                    super.handleMessage(r11)
                    return
                L_0x0009:
                    androidx.h.a.a r9 = androidx.p051h.p052a.C0998a.this
                L_0x000b:
                    java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<androidx.h.a.a$b>> r1 = r9.f3541b
                    monitor-enter(r1)
                    java.util.ArrayList<androidx.h.a.a$a> r0 = r9.f3542c     // Catch:{ all -> 0x0050 }
                    int r8 = r0.size()     // Catch:{ all -> 0x0050 }
                    if (r8 > 0) goto L_0x0018
                    monitor-exit(r1)     // Catch:{ all -> 0x0050 }
                    goto L_0x004f
                L_0x0018:
                    androidx.h.a.a$a[] r7 = new androidx.p051h.p052a.C0998a.C1000a[r8]     // Catch:{ all -> 0x0050 }
                    java.util.ArrayList<androidx.h.a.a$a> r0 = r9.f3542c     // Catch:{ all -> 0x0050 }
                    r0.toArray(r7)     // Catch:{ all -> 0x0050 }
                    java.util.ArrayList<androidx.h.a.a$a> r0 = r9.f3542c     // Catch:{ all -> 0x0050 }
                    r0.clear()     // Catch:{ all -> 0x0050 }
                    monitor-exit(r1)     // Catch:{ all -> 0x0050 }
                    r0 = 0
                    r6 = 0
                L_0x0027:
                    r5 = r7[r6]
                    java.util.ArrayList<androidx.h.a.a$b> r0 = r5.f3547b
                    int r4 = r0.size()
                    r3 = 0
                L_0x0030:
                    if (r3 >= r4) goto L_0x004a
                    java.util.ArrayList<androidx.h.a.a$b> r0 = r5.f3547b
                    java.lang.Object r1 = r0.get(r3)
                    androidx.h.a.a$b r1 = (androidx.p051h.p052a.C0998a.C1001b) r1
                    boolean r0 = r1.f3551d
                    if (r0 != 0) goto L_0x0047
                    android.content.BroadcastReceiver r2 = r1.f3549b
                    android.content.Context r1 = r9.f3540a
                    android.content.Intent r0 = r5.f3546a
                    r2.onReceive(r1, r0)
                L_0x0047:
                    int r3 = r3 + 1
                    goto L_0x0030
                L_0x004a:
                    int r6 = r6 + 1
                    if (r6 >= r8) goto L_0x000b
                    goto L_0x0027
                L_0x004f:
                    return
                L_0x0050:
                    r0 = move-exception
                    monitor-exit(r1)
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.p051h.p052a.C0998a.HandlerC09991.handleMessage(android.os.Message):void");
            }
        };
    }

    /* renamed from: a */
    public static C0998a m3454a(Context context) {
        C0998a aVar;
        synchronized (f3538f) {
            if (f3539g == null) {
                Context applicationContext = context.getApplicationContext();
                if (C58003a.f132201c) {
                    if (applicationContext == null) {
                        applicationContext = C58003a.f132199a;
                    }
                }
                f3539g = new C0998a(applicationContext);
            }
            aVar = f3539g;
        }
        return aVar;
    }

    /* renamed from: a */
    public final void mo3692a(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f3541b) {
            ArrayList<C1001b> remove = this.f3541b.remove(broadcastReceiver);
            if (remove != null) {
                for (int size = remove.size() - 1; size >= 0; size--) {
                    C1001b bVar = remove.get(size);
                    bVar.f3551d = true;
                    for (int i = 0; i < bVar.f3548a.countActions(); i++) {
                        String action = bVar.f3548a.getAction(i);
                        ArrayList<C1001b> arrayList = this.f3543d.get(action);
                        if (arrayList != null) {
                            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                                C1001b bVar2 = arrayList.get(size2);
                                if (bVar2.f3549b == broadcastReceiver) {
                                    bVar2.f3551d = true;
                                    arrayList.remove(size2);
                                }
                            }
                            if (arrayList.size() <= 0) {
                                this.f3543d.remove(action);
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo3694a(Intent intent) {
        boolean z;
        String str;
        String str2;
        synchronized (this.f3541b) {
            String action = intent.getAction();
            String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f3540a.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            if ((intent.getFlags() & 8) != 0) {
                z = true;
            } else {
                z = false;
            }
            ArrayList<C1001b> arrayList = this.f3543d.get(intent.getAction());
            if (arrayList != null) {
                ArrayList arrayList2 = null;
                int i = 0;
                while (i < arrayList.size()) {
                    C1001b bVar = arrayList.get(i);
                    if (bVar.f3550c) {
                        str2 = action;
                        str = resolveTypeIfNeeded;
                    } else {
                        str2 = action;
                        str = resolveTypeIfNeeded;
                        int match = bVar.f3548a.match(str2, str, scheme, data, categories, "LocalBroadcastManager");
                        if (match >= 0) {
                            if (z) {
                                Integer.toHexString(match);
                            }
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(bVar);
                            bVar.f3550c = true;
                        }
                    }
                    i++;
                    action = str2;
                    resolveTypeIfNeeded = str;
                }
                if (arrayList2 != null) {
                    for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                        ((C1001b) arrayList2.get(i2)).f3550c = false;
                    }
                    this.f3542c.add(new C1000a(intent, arrayList2));
                    if (!this.f3544e.hasMessages(1)) {
                        this.f3544e.sendEmptyMessage(1);
                    }
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: androidx.h.a.a$a */
    static final class C1000a {

        /* renamed from: a */
        final Intent f3546a;

        /* renamed from: b */
        final ArrayList<C1001b> f3547b;

        static {
            Covode.recordClassIndex(1093);
        }

        C1000a(Intent intent, ArrayList<C1001b> arrayList) {
            this.f3546a = intent;
            this.f3547b = arrayList;
        }
    }

    /* renamed from: a */
    public final void mo3693a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f3541b) {
            C1001b bVar = new C1001b(intentFilter, broadcastReceiver);
            ArrayList<C1001b> arrayList = this.f3541b.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList<>(1);
                this.f3541b.put(broadcastReceiver, arrayList);
            }
            arrayList.add(bVar);
            for (int i = 0; i < intentFilter.countActions(); i++) {
                String action = intentFilter.getAction(i);
                ArrayList<C1001b> arrayList2 = this.f3543d.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>(1);
                    this.f3543d.put(action, arrayList2);
                }
                arrayList2.add(bVar);
            }
        }
    }
}
