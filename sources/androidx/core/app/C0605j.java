package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.app.C0595i;
import androidx.core.graphics.drawable.IconCompat;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.core.app.j */
final class C0605j implements AbstractC0594h {

    /* renamed from: a */
    final Notification.Builder f2559a;

    /* renamed from: b */
    final C0595i.C0600e f2560b;

    /* renamed from: c */
    RemoteViews f2561c;

    /* renamed from: d */
    RemoteViews f2562d;

    /* renamed from: e */
    final List<Bundle> f2563e = new ArrayList();

    /* renamed from: f */
    final Bundle f2564f = new Bundle();

    /* renamed from: g */
    int f2565g;

    /* renamed from: h */
    RemoteViews f2566h;

    static {
        Covode.recordClassIndex(683);
    }

    @Override // androidx.core.app.AbstractC0594h
    /* renamed from: a */
    public final Notification.Builder mo2595a() {
        return this.f2559a;
    }

    /* renamed from: a */
    static void m2283a(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -2;
        notification.defaults &= -3;
    }

    /* renamed from: a */
    private void m2284a(C0595i.C0596a aVar) {
        Notification.Action.Builder builder;
        int i;
        Bundle bundle;
        Icon icon;
        int i2 = 0;
        if (Build.VERSION.SDK_INT >= 20) {
            IconCompat a = aVar.mo2596a();
            if (Build.VERSION.SDK_INT >= 23) {
                if (a != null) {
                    icon = a.mo2734b();
                } else {
                    icon = null;
                }
                builder = new Notification.Action.Builder(icon, aVar.f2486i, aVar.f2487j);
            } else {
                if (a != null) {
                    i = a.mo2733a();
                } else {
                    i = 0;
                }
                builder = new Notification.Action.Builder(i, aVar.f2486i, aVar.f2487j);
            }
            if (aVar.f2479b != null) {
                RemoteInput[] a2 = C0616n.m2307a(aVar.f2479b);
                int length = a2.length;
                while (i2 < length) {
                    builder.addRemoteInput(a2[i2]);
                    i2++;
                }
            }
            if (aVar.f2478a != null) {
                bundle = new Bundle(aVar.f2478a);
            } else {
                bundle = new Bundle();
            }
            bundle.putBoolean("android.support.allowGeneratedReplies", aVar.f2481d);
            if (Build.VERSION.SDK_INT >= 24) {
                builder.setAllowGeneratedReplies(aVar.f2481d);
            }
            bundle.putInt("android.support.action.semanticAction", aVar.f2483f);
            if (Build.VERSION.SDK_INT >= 28) {
                builder.setSemanticAction(aVar.f2483f);
            }
            if (Build.VERSION.SDK_INT >= 29) {
                builder.setContextual(aVar.f2484g);
            }
            bundle.putBoolean("android.support.action.showsUserInterface", aVar.f2482e);
            builder.addExtras(bundle);
            this.f2559a.addAction(builder.build());
            return;
        }
        int i3 = Build.VERSION.SDK_INT;
        List<Bundle> list = this.f2563e;
        Notification.Builder builder2 = this.f2559a;
        IconCompat a3 = aVar.mo2596a();
        if (a3 != null) {
            i2 = a3.mo2733a();
        }
        builder2.addAction(i2, aVar.f2486i, aVar.f2487j);
        Bundle bundle2 = new Bundle(aVar.f2478a);
        if (aVar.f2479b != null) {
            bundle2.putParcelableArray("android.support.remoteInputs", C0606k.m2288a(aVar.f2479b));
        }
        if (aVar.f2480c != null) {
            bundle2.putParcelableArray("android.support.dataRemoteInputs", C0606k.m2288a(aVar.f2480c));
        }
        bundle2.putBoolean("android.support.allowGeneratedReplies", aVar.f2481d);
        list.add(bundle2);
    }

    C0605j(C0595i.C0600e eVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        Notification.BubbleMetadata build;
        int i;
        Bundle bundle;
        this.f2560b = eVar;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f2559a = new Notification.Builder(eVar.f2518a, eVar.f2508J);
        } else {
            this.f2559a = new Notification.Builder(eVar.f2518a);
        }
        Notification notification = eVar.f2515Q;
        Notification.Builder lights = this.f2559a.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, eVar.f2525h).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS);
        boolean z6 = false;
        if ((notification.flags & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        Notification.Builder ongoing = lights.setOngoing(z);
        if ((notification.flags & 8) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        Notification.Builder onlyAlertOnce = ongoing.setOnlyAlertOnce(z2);
        if ((notification.flags & 16) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        Notification.Builder deleteIntent = onlyAlertOnce.setAutoCancel(z3).setDefaults(notification.defaults).setContentTitle(eVar.f2521d).setContentText(eVar.f2522e).setContentInfo(eVar.f2527j).setContentIntent(eVar.f2523f).setDeleteIntent(notification.deleteIntent);
        PendingIntent pendingIntent = eVar.f2524g;
        if ((notification.flags & 128) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        deleteIntent.setFullScreenIntent(pendingIntent, z4).setLargeIcon(eVar.f2526i).setNumber(eVar.f2528k).setProgress(eVar.f2536s, eVar.f2537t, eVar.f2538u);
        if (Build.VERSION.SDK_INT < 21) {
            this.f2559a.setSound(notification.sound, notification.audioStreamType);
        }
        int i2 = Build.VERSION.SDK_INT;
        this.f2559a.setSubText(eVar.f2534q).setUsesChronometer(eVar.f2531n).setPriority(eVar.f2529l);
        Iterator<C0595i.C0596a> it = eVar.f2519b.iterator();
        while (it.hasNext()) {
            m2284a(it.next());
        }
        if (eVar.f2501C != null) {
            this.f2564f.putAll(eVar.f2501C);
        }
        if (Build.VERSION.SDK_INT < 20) {
            if (eVar.f2542y) {
                this.f2564f.putBoolean("android.support.localOnly", true);
            }
            if (eVar.f2539v != null) {
                this.f2564f.putString("android.support.groupKey", eVar.f2539v);
                if (eVar.f2540w) {
                    this.f2564f.putBoolean("android.support.isGroupSummary", true);
                } else {
                    this.f2564f.putBoolean("android.support.useSideChannel", true);
                }
            }
            if (eVar.f2541x != null) {
                this.f2564f.putString("android.support.sortKey", eVar.f2541x);
            }
        }
        this.f2561c = eVar.f2505G;
        this.f2562d = eVar.f2506H;
        int i3 = Build.VERSION.SDK_INT;
        this.f2559a.setShowWhen(eVar.f2530m);
        if (Build.VERSION.SDK_INT < 21 && eVar.f2517S != null && !eVar.f2517S.isEmpty()) {
            this.f2564f.putStringArray("android.people", (String[]) eVar.f2517S.toArray(new String[eVar.f2517S.size()]));
        }
        if (Build.VERSION.SDK_INT >= 20) {
            this.f2559a.setLocalOnly(eVar.f2542y).setGroup(eVar.f2539v).setGroupSummary(eVar.f2540w).setSortKey(eVar.f2541x);
            this.f2565g = eVar.f2512N;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            this.f2559a.setCategory(eVar.f2500B).setColor(eVar.f2502D).setVisibility(eVar.f2503E).setPublicVersion(eVar.f2504F).setSound(notification.sound, notification.audioAttributes);
            Iterator<String> it2 = eVar.f2517S.iterator();
            while (it2.hasNext()) {
                this.f2559a.addPerson(it2.next());
            }
            this.f2566h = eVar.f2507I;
            if (eVar.f2520c.size() > 0) {
                Bundle bundle2 = eVar.mo2618b().getBundle("android.car.EXTENSIONS");
                bundle2 = bundle2 == null ? new Bundle() : bundle2;
                Bundle bundle3 = new Bundle();
                for (int i4 = 0; i4 < eVar.f2520c.size(); i4++) {
                    String num = Integer.toString(i4);
                    C0595i.C0596a aVar = eVar.f2520c.get(i4);
                    Bundle bundle4 = new Bundle();
                    IconCompat a = aVar.mo2596a();
                    if (a != null) {
                        i = a.mo2733a();
                    } else {
                        i = 0;
                    }
                    bundle4.putInt("icon", i);
                    bundle4.putCharSequence("title", aVar.f2486i);
                    bundle4.putParcelable("actionIntent", aVar.f2487j);
                    if (aVar.f2478a != null) {
                        bundle = new Bundle(aVar.f2478a);
                    } else {
                        bundle = new Bundle();
                    }
                    bundle.putBoolean("android.support.allowGeneratedReplies", aVar.f2481d);
                    bundle4.putBundle("extras", bundle);
                    bundle4.putParcelableArray("remoteInputs", C0606k.m2288a(aVar.f2479b));
                    bundle4.putBoolean("showsUserInterface", aVar.f2482e);
                    bundle4.putInt("semanticAction", aVar.f2483f);
                    bundle3.putBundle(num, bundle4);
                }
                bundle2.putBundle("invisible_actions", bundle3);
                eVar.mo2618b().putBundle("android.car.EXTENSIONS", bundle2);
                this.f2564f.putBundle("android.car.EXTENSIONS", bundle2);
            }
        }
        if (Build.VERSION.SDK_INT >= 24) {
            this.f2559a.setExtras(eVar.f2501C).setRemoteInputHistory(eVar.f2535r);
            if (eVar.f2505G != null) {
                this.f2559a.setCustomContentView(eVar.f2505G);
            }
            if (eVar.f2506H != null) {
                this.f2559a.setCustomBigContentView(eVar.f2506H);
            }
            if (eVar.f2507I != null) {
                this.f2559a.setCustomHeadsUpContentView(eVar.f2507I);
            }
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.f2559a.setBadgeIconType(eVar.f2509K).setShortcutId(eVar.f2510L).setTimeoutAfter(eVar.f2511M).setGroupAlertBehavior(eVar.f2512N);
            if (eVar.f2499A) {
                this.f2559a.setColorized(eVar.f2543z);
            }
            if (!TextUtils.isEmpty(eVar.f2508J)) {
                this.f2559a.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f2559a.setAllowSystemGeneratedContextualActions(eVar.f2513O);
            Notification.Builder builder = this.f2559a;
            C0595i.C0599d dVar = eVar.f2514P;
            if (dVar == null) {
                build = null;
            } else {
                Notification.BubbleMetadata.Builder builder2 = new Notification.BubbleMetadata.Builder();
                if ((dVar.f2498f & 1) != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                Notification.BubbleMetadata.Builder suppressNotification = builder2.setAutoExpandBubble(z5).setDeleteIntent(dVar.f2494b).setIcon(dVar.f2495c.mo2734b()).setIntent(dVar.f2493a).setSuppressNotification((dVar.f2498f & 2) != 0 ? true : z6);
                if (dVar.f2496d != 0) {
                    suppressNotification.setDesiredHeight(dVar.f2496d);
                }
                if (dVar.f2497e != 0) {
                    suppressNotification.setDesiredHeightResId(dVar.f2497e);
                }
                build = suppressNotification.build();
            }
            builder.setBubbleMetadata(build);
        }
        if (eVar.f2516R) {
            if (this.f2560b.f2540w) {
                this.f2565g = 2;
            } else {
                this.f2565g = 1;
            }
            this.f2559a.setVibrate(null);
            this.f2559a.setSound(null);
            notification.defaults &= -2;
            notification.defaults &= -3;
            this.f2559a.setDefaults(notification.defaults);
            if (Build.VERSION.SDK_INT >= 26) {
                if (TextUtils.isEmpty(this.f2560b.f2539v)) {
                    this.f2559a.setGroup("silent");
                }
                this.f2559a.setGroupAlertBehavior(this.f2565g);
            }
        }
    }
}
