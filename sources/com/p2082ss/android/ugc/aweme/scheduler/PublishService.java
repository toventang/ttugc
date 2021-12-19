package com.p2082ss.android.ugc.aweme.scheduler;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import androidx.core.app.C0595i;
import androidx.core.app.C0607l;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.utils.ServiceLifecycle;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.p2730de.C40963b;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.scheduler.C67296h;
import com.p2082ss.android.ugc.aweme.settings.C68747m;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72623d;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72639k;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.C72678q;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.scheduler.PublishService */
public final class PublishService extends Service {

    /* renamed from: a */
    public static final List<Integer> f150773a = new ArrayList();

    /* renamed from: b */
    public static final C67284a f150774b = new C67284a((byte) 0);

    /* renamed from: com.ss.android.ugc.aweme.scheduler.PublishService$a */
    public static final class C67284a {
        static {
            Covode.recordClassIndex(78907);
        }

        private C67284a() {
        }

        /* renamed from: a */
        public static void m119208a() {
            m119210a("clear");
            Context a = C40963b.m82473a();
            m119209a(a);
            C0607l.m2289a(a).mo2638a((String) null, 1);
            if (C68747m.m121180a()) {
                Iterator<T> it = PublishService.f150773a.iterator();
                while (it.hasNext()) {
                    C0607l.m2289a(a).mo2638a((String) null, it.next().intValue());
                }
                PublishService.f150773a.clear();
            }
        }

        public /* synthetic */ C67284a(byte b) {
            this();
        }

        /* renamed from: a */
        public static void m119210a(String str) {
            C67296h.m119243c("PublishService ".concat(String.valueOf(str)));
        }

        /* renamed from: b */
        public static void m119211b(String str) {
            C67296h.m119240b("PublishService ".concat(String.valueOf(str)));
        }

        /* renamed from: a */
        public static void m119209a(Context context) {
            if (Build.VERSION.SDK_INT >= 26) {
                Object a = m119207a(context, "notification");
                Objects.requireNonNull(a, "null cannot be cast to non-null type android.app.NotificationManager");
                ((NotificationManager) a).createNotificationChannel(new NotificationChannel("com.ss.android.ugc.trill.publish", context.getString(R.string.h48), 2));
            }
        }

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003d */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static android.content.ComponentName m119206a(android.content.Context r9, android.content.Intent r10) {
            /*
            // Method dump skipped, instructions count: 114
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.scheduler.PublishService.C67284a.m119206a(android.content.Context, android.content.Intent):android.content.ComponentName");
        }

        /* renamed from: a */
        private static Object m119207a(Context context, String str) {
            Object obj;
            MethodCollector.m26663i(7042);
            if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
                if (!C58027i.f132247b && "connectivity".equals(str)) {
                    try {
                        new C21708b().mo35361a();
                        C58027i.f132247b = true;
                        obj = context.getSystemService(str);
                    } catch (Throwable unused) {
                    }
                }
                obj = context.getSystemService(str);
            } else if (C58027i.f132246a) {
                synchronized (ClipboardManager.class) {
                    try {
                        obj = context.getSystemService(str);
                        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                            try {
                                Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                                declaredField.setAccessible(true);
                                declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                            } catch (Exception e) {
                                C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                            }
                        }
                        C58027i.f132246a = false;
                    } finally {
                        MethodCollector.m26664o(7042);
                    }
                }
            } else {
                obj = context.getSystemService(str);
            }
            return obj;
        }
    }

    static {
        Covode.recordClassIndex(78906);
    }

    public final void onCreate() {
        super.onCreate();
        C67284a.m119210a("onCreate");
        C67284a.m119209a(this);
        startForeground(1, mo106111a(this, 0.0f, (Bitmap) null));
        C67284a.m119210a("onCreate startForeground done");
    }

    public final IBinder onBind(Intent intent) {
        C89219l.m154721d(intent, "");
        throw new UnsupportedOperationException("Not yet implemented");
    }

    /* renamed from: a */
    private static String m119201a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final void mo106114a(Notification notification, int i) {
        C0607l.m2289a(this).mo2637a(i, notification);
    }

    /* renamed from: com.ss.android.ugc.aweme.scheduler.PublishService$b */
    public static final class C67285b extends AbstractC72639k {

        /* renamed from: a */
        final /* synthetic */ PublishService f150775a;

        /* renamed from: b */
        final /* synthetic */ Bitmap f150776b;

        /* renamed from: c */
        final /* synthetic */ int f150777c;

        /* renamed from: d */
        final /* synthetic */ String f150778d;

        /* renamed from: e */
        final /* synthetic */ String f150779e;

        static {
            Covode.recordClassIndex(78908);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72639k
        public final void onProgress(int i, Object obj) {
            try {
                PublishService publishService = this.f150775a;
                publishService.mo106114a(publishService.mo106111a(publishService, ((float) i) / 100.0f, this.f150776b), 1);
            } catch (Exception e) {
                C84911q.m145923a("PublishService", e);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72639k
        public final void onFinish(AbstractC72623d dVar, Object obj) {
            C89219l.m154721d(dVar, "");
            C67284a.m119210a("onFinish result:".concat(String.valueOf(dVar)));
            this.f150775a.stopSelf(this.f150777c);
            String str = this.f150778d;
            C89219l.m154721d(this, "");
            C73991bj.m130133d("PublishScheduler | removeCallback call ".concat(String.valueOf(str)));
            if (C68747m.m121180a()) {
                C67296h.f150794b.execute(new C67296h.RunnableC67306j(str, this));
            } else {
                C67296h.f150794b.execute(new C67296h.RunnableC67307k(str, this));
            }
            if (dVar instanceof AbstractC72623d.C72626c) {
                if (C68747m.m121180a()) {
                    int hashCode = this.f150779e.hashCode();
                    PublishService publishService = this.f150775a;
                    publishService.mo106114a(publishService.mo106112a(publishService, this.f150776b), hashCode);
                    PublishService.f150773a.add(Integer.valueOf(hashCode));
                } else {
                    PublishService publishService2 = this.f150775a;
                    publishService2.mo106114a(publishService2.mo106112a(publishService2, this.f150776b), 1);
                }
            } else if (dVar instanceof AbstractC72623d.C72625b) {
                if (C39223a.m79589c().mo68606a(1)) {
                    C0607l.m2289a(this.f150775a).mo2638a((String) null, 1);
                } else if (C68747m.m121180a()) {
                    int hashCode2 = this.f150779e.hashCode();
                    PublishService publishService3 = this.f150775a;
                    publishService3.mo106114a(publishService3.mo106113a(publishService3, this.f150779e, this.f150776b), hashCode2);
                    PublishService.f150773a.add(Integer.valueOf(hashCode2));
                } else {
                    PublishService publishService4 = this.f150775a;
                    publishService4.mo106114a(publishService4.mo106113a(publishService4, this.f150779e, this.f150776b), 1);
                }
            }
            Bitmap bitmap = this.f150776b;
            if (bitmap != null) {
                bitmap.recycle();
            }
        }

        C67285b(PublishService publishService, Bitmap bitmap, int i, String str, String str2) {
            this.f150775a = publishService;
            this.f150776b = bitmap;
            this.f150777c = i;
            this.f150778d = str;
            this.f150779e = str2;
        }
    }

    /* renamed from: a */
    public final Notification mo106112a(Context context, Bitmap bitmap) {
        String string = context.getString(R.string.h46);
        C89219l.m154716b(string, "");
        String string2 = context.getString(R.string.h45);
        C89219l.m154716b(string2, "");
        Notification d = m119200a(this, context, string, string2, bitmap).mo2622b(true).mo2626d();
        C89219l.m154716b(d, "");
        return d;
    }

    /* renamed from: a */
    public final Notification mo106111a(Context context, float f, Bitmap bitmap) {
        int i = (int) (f * 100.0f);
        String string = context.getString(R.string.h48);
        C89219l.m154716b(string, "");
        Notification d = m119200a(this, context, string, new StringBuilder().append(i).append('%').toString(), bitmap).mo2619b(Math.min(100, i)).mo2626d();
        C89219l.m154716b(d, "");
        return d;
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        String str;
        ServiceLifecycle.onStartCommand(this, intent, i, i2);
        super.onStartCommand(intent, i, i2);
        if (intent != null) {
            str = m119201a(intent, "PUBLISH_ID");
        } else {
            str = null;
        }
        C72678q a = C67296h.m119229a(str);
        if (a == null) {
            C67284a.m119211b("PublishService onStartCommand findPublishModel null");
            return 2;
        }
        String str2 = a.f162929b;
        C67284a.m119210a("onStartCommand findCreationId:".concat(String.valueOf(str2)));
        Bitmap b = C67296h.m119236b(a);
        if (b == null) {
            C67284a.m119211b("null cover creationId:" + a.f162929b);
        }
        C67296h.m119235a(new C67285b(this, b, i2, str, str2), str);
        return 2;
    }

    /* renamed from: a */
    public final Notification mo106113a(Context context, String str, Bitmap bitmap) {
        Intent intent = new Intent(this, PublishBroadcastReceiver.class);
        intent.putExtra("creation_id", str);
        C67284a.m119210a("putExtra creationId:".concat(String.valueOf(str)));
        new Intent(this, PublishBroadcastReceiver.class).putExtra("DEBUG_MSG", "MSG_SUCCESS");
        String string = context.getString(R.string.h49);
        C89219l.m154716b(string, "");
        String string2 = context.getString(R.string.h4_);
        C89219l.m154716b(string2, "");
        C0595i.C0600e a = m119200a(this, context, string, string2, bitmap);
        a.f2523f = PendingIntent.getBroadcast(this, 6, intent, 0);
        C63244g.m114602a();
        Notification d = a.mo2622b(true).mo2626d();
        C89219l.m154716b(d, "");
        return d;
    }

    /* renamed from: a */
    private static /* synthetic */ C0595i.C0600e m119200a(PublishService publishService, Context context, String str, String str2, Bitmap bitmap) {
        C0595i.C0600e a = new C0595i.C0600e(context, "com.ss.android.ugc.trill.publish").mo2613a((CharSequence) str).mo2621b(str2).mo2608a(System.currentTimeMillis());
        a.f2523f = PendingIntent.getActivity(publishService, 5, context.getPackageManager().getLaunchIntentForPackage(publishService.getPackageName()), 0);
        C0595i.C0600e a2 = a.mo2605a(2131232359).mo2610a(bitmap);
        C89219l.m154716b(a2, "");
        return a2;
    }
}
