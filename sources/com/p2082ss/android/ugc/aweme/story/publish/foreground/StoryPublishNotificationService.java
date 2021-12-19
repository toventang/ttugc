package com.p2082ss.android.ugc.aweme.story.publish.foreground;

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
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.p2730de.C40963b;
import com.p2082ss.android.ugc.aweme.publish.C65682o;
import com.p2082ss.android.ugc.aweme.services.story.event.ScheduleInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72623d;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72639k;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.C72678q;
import com.p2082ss.android.ugc.aweme.story.publish.p4060a.C77390a;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.publish.foreground.StoryPublishNotificationService */
public final class StoryPublishNotificationService extends Service {

    /* renamed from: f */
    public static int f173752f = 1;

    /* renamed from: g */
    public static final C77441a f173753g = new C77441a((byte) 0);

    /* renamed from: a */
    public final Map<String, Float> f173754a = new LinkedHashMap();

    /* renamed from: b */
    public Bitmap f173755b;

    /* renamed from: c */
    public int f173756c;

    /* renamed from: d */
    public final AtomicInteger f173757d = new AtomicInteger(0);

    /* renamed from: e */
    ArrayList<ScheduleInfo> f173758e;

    /* renamed from: h */
    private final List<C89378p<String, AbstractC72639k>> f173759h = new ArrayList();

    /* renamed from: com.ss.android.ugc.aweme.story.publish.foreground.StoryPublishNotificationService$a */
    public static final class C77441a {
        static {
            Covode.recordClassIndex(90474);
        }

        private C77441a() {
        }

        /* renamed from: a */
        public static void m135395a() {
            m135397a("clear story publish foreground notification");
            Context a = C40963b.m82473a();
            m135396a(a);
            C0607l.m2289a(a).mo2638a((String) null, 1);
        }

        public /* synthetic */ C77441a(byte b) {
            this();
        }

        /* renamed from: a */
        public static void m135397a(String str) {
            C84911q.m145921a("StoryPublishNotificationService:".concat(String.valueOf(str)));
        }

        /* renamed from: a */
        public static void m135396a(Context context) {
            if (Build.VERSION.SDK_INT >= 26) {
                Object a = m135394a(context, "notification");
                Objects.requireNonNull(a, "null cannot be cast to non-null type android.app.NotificationManager");
                ((NotificationManager) a).createNotificationChannel(new NotificationChannel("com.ss.android.ugc.aweme.story.publish", "com.ss.android.ugc.aweme.story.publish", 2));
            }
        }

        /* renamed from: a */
        public static boolean m135398a(List<ScheduleInfo> list) {
            C89219l.m154721d(list, "");
            m135397a("try show story publish foreground notification");
            Context a = C40963b.m82473a();
            if (C65682o.m117576a(a, StoryPublishNotificationService.class)) {
                m135397a("StoryPublishNotificationService is running,directly return");
                return false;
            }
            Intent intent = new Intent(a, StoryPublishNotificationService.class);
            intent.putExtra("extra_schedule_list", new ArrayList(list));
            if (Build.VERSION.SDK_INT >= 26) {
                a.startForegroundService(intent);
                return true;
            }
            m135393a(a, intent);
            return true;
        }

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003d */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static android.content.ComponentName m135393a(android.content.Context r9, android.content.Intent r10) {
            /*
            // Method dump skipped, instructions count: 114
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.story.publish.foreground.StoryPublishNotificationService.C77441a.m135393a(android.content.Context, android.content.Intent):android.content.ComponentName");
        }

        /* renamed from: a */
        private static Object m135394a(Context context, String str) {
            Object obj;
            MethodCollector.m26663i(5683);
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
                        MethodCollector.m26664o(5683);
                    }
                }
            } else {
                obj = context.getSystemService(str);
            }
            return obj;
        }
    }

    public final void onCreate() {
        super.onCreate();
        startForeground(1, mo121058a(this, null));
    }

    static {
        Covode.recordClassIndex(90473);
    }

    public final void onDestroy() {
        C77441a.m135397a("onDestroy");
        for (T t : this.f173759h) {
            C77390a.m135324a((AbstractC72639k) t.getSecond(), (String) t.getFirst());
        }
        this.f173759h.clear();
        super.onDestroy();
    }

    public final IBinder onBind(Intent intent) {
        C89219l.m154721d(intent, "");
        throw new UnsupportedOperationException("Not yet implemented");
    }

    /* renamed from: a */
    private final void m135391a(List<ScheduleInfo> list) {
        for (T t : list) {
            this.f173754a.put(t.getScheduleId(), Float.valueOf(0.0f));
            C77442b bVar = new C77442b(t, this);
            this.f173759h.add(C89387v.m154943a(t.getScheduleId(), bVar));
            C77390a.m135325a(bVar, t.getScheduleId(), true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.publish.foreground.StoryPublishNotificationService$b */
    public static final class C77442b extends AbstractC72639k {

        /* renamed from: a */
        final /* synthetic */ ScheduleInfo f173760a;

        /* renamed from: b */
        final /* synthetic */ StoryPublishNotificationService f173761b;

        static {
            Covode.recordClassIndex(90475);
        }

        C77442b(ScheduleInfo scheduleInfo, StoryPublishNotificationService storyPublishNotificationService) {
            this.f173760a = scheduleInfo;
            this.f173761b = storyPublishNotificationService;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72639k
        public final void onProgress(int i, Object obj) {
            this.f173761b.f173754a.put(this.f173760a.getScheduleId(), Float.valueOf(((float) i) / 100.0f));
            StoryPublishNotificationService storyPublishNotificationService = this.f173761b;
            C0607l.m2289a(this.f173761b).mo2637a(1, storyPublishNotificationService.mo121058a(storyPublishNotificationService, storyPublishNotificationService.f173755b));
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72639k
        public final void onFinish(AbstractC72623d dVar, Object obj) {
            Bitmap bitmap;
            C89219l.m154721d(dVar, "");
            if (dVar instanceof AbstractC72623d.C72626c) {
                int incrementAndGet = this.f173761b.f173757d.incrementAndGet();
                C77441a.m135397a("publishSuccess:" + this.f173760a.getScheduleId() + ",currentFinishCount:" + incrementAndGet + ",totalCount:" + this.f173761b.f173756c);
                if (incrementAndGet == this.f173761b.f173756c) {
                    this.f173761b.stopSelf();
                    StoryPublishNotificationService storyPublishNotificationService = this.f173761b;
                    Bitmap bitmap2 = storyPublishNotificationService.f173755b;
                    String string = storyPublishNotificationService.getString(R.string.h46);
                    C89219l.m154716b(string, "");
                    String string2 = storyPublishNotificationService.getString(R.string.h45);
                    C89219l.m154716b(string2, "");
                    Notification d = StoryPublishNotificationService.m135390a(storyPublishNotificationService, storyPublishNotificationService, string, string2, bitmap2).mo2622b(true).mo2626d();
                    C89219l.m154716b(d, "");
                    C0607l.m2289a(this.f173761b).mo2637a(StoryPublishNotificationService.f173752f, d);
                    StoryPublishNotificationService.f173752f++;
                }
            } else if (dVar instanceof AbstractC72623d.C72625b) {
                C77441a.m135397a("publish failed:" + this.f173760a.getScheduleId());
                this.f173761b.stopSelf();
                C72678q c = C77390a.m135331c(this.f173760a.getScheduleId());
                if (c != null) {
                    bitmap = C77390a.m135321a(c);
                } else {
                    bitmap = null;
                }
                StoryPublishNotificationService storyPublishNotificationService2 = this.f173761b;
                ScheduleInfo scheduleInfo = this.f173760a;
                ArrayList<ScheduleInfo> arrayList = storyPublishNotificationService2.f173758e;
                if (arrayList == null) {
                    arrayList = C89070n.m154525d(scheduleInfo);
                }
                C89219l.m154721d(storyPublishNotificationService2, "");
                C89219l.m154721d(arrayList, "");
                Intent intent = new Intent(storyPublishNotificationService2, StoryPublishBroadcastReceiver.class);
                intent.putExtra("extra_retry_task_list", arrayList);
                String string3 = storyPublishNotificationService2.getString(R.string.h49);
                C89219l.m154716b(string3, "");
                String string4 = storyPublishNotificationService2.getString(R.string.h4_);
                C89219l.m154716b(string4, "");
                C0595i.C0600e a = StoryPublishNotificationService.m135390a(storyPublishNotificationService2, storyPublishNotificationService2, string3, string4, bitmap);
                a.f2523f = PendingIntent.getBroadcast(storyPublishNotificationService2, 6, intent, 268435456);
                Notification d2 = a.mo2622b(true).mo2626d();
                C89219l.m154716b(d2, "");
                C0607l.m2289a(this.f173761b).mo2637a(StoryPublishNotificationService.f173752f, d2);
                StoryPublishNotificationService.f173752f++;
            } else {
                this.f173761b.stopSelf();
            }
        }
    }

    public final void onStart(Intent intent, int i) {
        super.onStart(intent, i);
        startForeground(1, mo121058a(this, this.f173755b));
    }

    /* renamed from: a */
    public final Notification mo121058a(Context context, Bitmap bitmap) {
        float f = 0.0f;
        if (!this.f173754a.isEmpty()) {
            for (Map.Entry<String, Float> entry : this.f173754a.entrySet()) {
                f += entry.getValue().floatValue() * (1.0f / ((float) this.f173754a.size()));
            }
        }
        int i = (int) (f * 100.0f);
        String string = context.getString(R.string.h48);
        C89219l.m154716b(string, "");
        Notification d = m135390a(this, context, string, new StringBuilder().append(i).append('%').toString(), bitmap).mo2619b(Math.min(100, i)).mo2626d();
        C89219l.m154716b(d, "");
        return d;
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        ArrayList<ScheduleInfo> arrayList;
        boolean z;
        ServiceLifecycle.onStartCommand(this, intent, i, i2);
        Bitmap bitmap = null;
        if (intent != null) {
            arrayList = intent.getParcelableArrayListExtra("extra_schedule_list");
        } else {
            arrayList = null;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return 2;
        }
        this.f173758e = arrayList;
        C77441a.m135397a("onStartCommand,taskSize:" + arrayList.size());
        this.f173756c = arrayList.size();
        this.f173757d.set(0);
        C77441a.m135396a(this);
        m135391a(arrayList);
        C72678q c = C77390a.m135331c(arrayList.get(0).getScheduleId());
        if (c != null) {
            bitmap = C77390a.m135321a(c);
        }
        this.f173755b = bitmap;
        return 2;
    }

    /* renamed from: a */
    static /* synthetic */ C0595i.C0600e m135390a(StoryPublishNotificationService storyPublishNotificationService, Context context, String str, String str2, Bitmap bitmap) {
        C0595i.C0600e a = new C0595i.C0600e(context, "com.ss.android.ugc.aweme.story.publish").mo2613a((CharSequence) str).mo2621b(str2).mo2608a(System.currentTimeMillis());
        a.f2523f = PendingIntent.getActivity(storyPublishNotificationService, 5, context.getPackageManager().getLaunchIntentForPackage(storyPublishNotificationService.getPackageName()), 0);
        C0595i.C0600e a2 = a.mo2605a(2131232359).mo2610a(bitmap);
        C89219l.m154716b(a2, "");
        return a2;
    }
}
