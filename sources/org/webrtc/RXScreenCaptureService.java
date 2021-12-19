package org.webrtc;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.lang.reflect.Field;

public class RXScreenCaptureService extends Service {
    private Handler mHandler;
    private HandlerThread mHandlerThread;
    int mLargeIcon = -1;
    String mLaunchActivity;
    int mSmallIcon = -1;

    static {
        Covode.recordClassIndex(106682);
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        super.onCreate();
        HandlerThread handlerThread = new HandlerThread("RXScreenCaptureService");
        this.mHandlerThread = handlerThread;
        handlerThread.start();
        this.mHandler = new Handler(this.mHandlerThread.getLooper());
    }

    private void createNotificationChannel() {
        MethodCollector.m26663i(1052);
        try {
            Class<?> cls = Class.forName(this.mLaunchActivity);
            if (cls == null) {
                MethodCollector.m26664o(1052);
                return;
            }
            Notification.Builder builder = new Notification.Builder(m157054xd8eab104(this));
            builder.setContentIntent(PendingIntent.getActivity(this, 0, new Intent(this, cls), 0)).setLargeIcon(BitmapFactory.decodeResource(getResources(), this.mLargeIcon)).setSmallIcon(this.mSmallIcon).setContentText("screen capture is running...").setWhen(System.currentTimeMillis());
            if (Build.VERSION.SDK_INT >= 26) {
                builder.setChannelId("notification_id");
            }
            if (Build.VERSION.SDK_INT >= 26) {
                ((NotificationManager) m157052x7581a710(this, "notification")).createNotificationChannel(new NotificationChannel("notification_id", "notification_name", 2));
            }
            Notification build = builder.build();
            build.defaults = 1;
            startForeground(110, build);
            MethodCollector.m26664o(1052);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void dispose(Intent intent) {
        this.mHandler.post(RXScreenCaptureService$$Lambda$4.$instance);
    }

    private static int getCommand(Intent intent) {
        if (intent == null) {
            return -1;
        }
        return intent.getIntExtra("ACTION", -1);
    }

    private static Intent getData(Intent intent) {
        if (intent == null) {
            return null;
        }
        return (Intent) intent.getParcelableExtra("DATA");
    }

    /* renamed from: org_webrtc_RXScreenCaptureService_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext */
    public static Context m157054xd8eab104(RXScreenCaptureService rXScreenCaptureService) {
        Context applicationContext = rXScreenCaptureService.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$stopCapture$1$RXScreenCaptureService(int i) {
        ScreenCaptureAndroidManager.INSTANCE().stopCapture(i);
        stopForeground(true);
    }

    private void stopCapture(Intent intent) {
        Intent data = getData(intent);
        if (data != null) {
            this.mHandler.post(new RXScreenCaptureService$$Lambda$1(this, data.getIntExtra("hc", 0)));
        }
    }

    private void changeCaptureFormat(Intent intent) {
        Intent data = getData(intent);
        if (data != null) {
            this.mHandler.post(new RXScreenCaptureService$$Lambda$2(data.getIntExtra("w", 0), data.getIntExtra("h", 0), data.getIntExtra("if", 0)));
        }
    }

    private void onFrame(Intent intent) {
        int intExtra;
        VideoFrame removeFrame;
        Intent data = getData(intent);
        if (data != null && (intExtra = data.getIntExtra("i", -1)) != -1 && (removeFrame = ScreenCaptureAndroidManager.INSTANCE().removeFrame(intExtra)) != null) {
            this.mHandler.post(new RXScreenCaptureService$$Lambda$3(removeFrame));
        }
    }

    private void startCapture(Intent intent) {
        Intent data = getData(intent);
        if (data != null) {
            this.mHandler.post(new RXScreenCaptureService$$Lambda$0(data.getIntExtra("w", 0), data.getIntExtra("h", 0), data.getIntExtra("if", 0), data.getIntExtra("minfr", 0)));
        }
    }

    private void startLaunch(Intent intent) {
        Intent data = getData(intent);
        if (data != null) {
            this.mLargeIcon = data.getIntExtra("largei", -1);
            this.mSmallIcon = data.getIntExtra("largei", -1);
            String org_webrtc_RXScreenCaptureService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra = m157053x87859bd(data, "activity");
            this.mLaunchActivity = org_webrtc_RXScreenCaptureService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra;
            if (!TextUtils.isEmpty(org_webrtc_RXScreenCaptureService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra)) {
                int i = this.mLargeIcon;
                if (i != -1 || this.mSmallIcon != -1) {
                    if (this.mSmallIcon == -1) {
                        this.mSmallIcon = i;
                    }
                    if (i == -1) {
                        this.mLargeIcon = this.mSmallIcon;
                    }
                    createNotificationChannel();
                }
            }
        }
    }

    /* renamed from: org_webrtc_RXScreenCaptureService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra */
    public static String m157053x87859bd(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: org_webrtc_RXScreenCaptureService_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService */
    public static Object m157052x7581a710(RXScreenCaptureService rXScreenCaptureService, String str) {
        Object obj;
        MethodCollector.m26663i(1065);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = rXScreenCaptureService.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = rXScreenCaptureService.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = rXScreenCaptureService.getSystemService(str);
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
                    MethodCollector.m26664o(1065);
                }
            }
        } else {
            obj = rXScreenCaptureService.getSystemService(str);
        }
        return obj;
    }

    public static Intent getServiceIntent(Context context, int i, Intent intent) {
        Intent intent2 = new Intent(context, RXScreenCaptureService.class);
        intent2.putExtra("ACTION", i);
        if (intent != null) {
            intent2.putExtra("DATA", intent);
        }
        return intent2;
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        int command = getCommand(intent);
        if (command == 0) {
            startLaunch(intent);
        } else if (command == 1) {
            startCapture(intent);
        } else if (command == 2) {
            stopCapture(intent);
        } else if (command == 3) {
            changeCaptureFormat(intent);
        } else if (command == 4) {
            onFrame(intent);
        } else if (command == 5) {
            dispose(intent);
        }
        return super.onStartCommand(intent, i, i2);
    }
}
