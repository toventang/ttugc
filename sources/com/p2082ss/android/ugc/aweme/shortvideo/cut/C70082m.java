package com.p2082ss.android.ugc.aweme.shortvideo.cut;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Outline;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Vibrator;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.shortvideo.C70636dh;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.C70087b;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p2082ss.android.ugc.aweme.tools.EnumC78601i;
import com.p2082ss.android.ugc.tools.C84370a;
import com.p2082ss.android.ugc.tools.C84401c;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.m */
public final class C70082m {

    /* renamed from: a */
    public static int f156699a = ((int) C13628n.m24520b(C84401c.m145164a(), 60.0f));

    /* renamed from: b */
    public static int f156700b = ((int) C13628n.m24520b(C84401c.m145164a(), 30.0f));

    /* renamed from: c */
    public static int f156701c = ((int) C13628n.m24520b(C84401c.m145164a(), 64.0f));

    /* renamed from: d */
    public static int f156702d = ((int) C13628n.m24520b(C84401c.m145164a(), 12.0f));

    /* renamed from: e */
    public static int f156703e = ((int) C13628n.m24520b(C84401c.m145164a(), 4.0f));

    /* renamed from: f */
    public static int f156704f = ((int) C13628n.m24520b(C84401c.m145164a(), 5.0f));

    /* renamed from: g */
    public static int f156705g = C84401c.m145164a().getResources().getDimensionPixelSize(R.dimen.a0v);

    /* renamed from: h */
    public static int f156706h = ((int) C13628n.m24520b(C84401c.m145164a(), 20.0f));

    static {
        Covode.recordClassIndex(82502);
    }

    /* renamed from: a */
    public static void m123741a(Context context) {
        Vibrator vibrator = (Vibrator) m123740a(context, "vibrator");
        if (vibrator != null) {
            vibrator.vibrate(10);
        }
    }

    /* renamed from: a */
    public static long m123738a(long j) {
        if (C84370a.f188623l.f188635k.invoke().booleanValue()) {
            if (j > 300000) {
                return 300000;
            }
            return j;
        } else if (C84370a.f188623l.f188633i.invoke().booleanValue() || C84370a.f188623l.f188635k.invoke().booleanValue()) {
            return Math.min(j, C84370a.f188623l.f188634j.invoke().longValue());
        } else {
            if (j > 15000) {
                return 15000;
            }
            return j;
        }
    }

    /* renamed from: a */
    public static EnumC78601i m123739a(float f) {
        if (f == EnumC78601i.EPIC.value()) {
            return EnumC78601i.EPIC;
        }
        if (f == EnumC78601i.SLOW.value()) {
            return EnumC78601i.SLOW;
        }
        if (f == EnumC78601i.NORMAL.value()) {
            return EnumC78601i.NORMAL;
        }
        if (f == EnumC78601i.FAST.value()) {
            return EnumC78601i.FAST;
        }
        if (f == EnumC78601i.LAPSE.value()) {
            return EnumC78601i.LAPSE;
        }
        return null;
    }

    /* renamed from: a */
    public static void m123743a(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setOutlineProvider(new ViewOutlineProvider() {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.cut.C70082m.C700831 */

                static {
                    Covode.recordClassIndex(82503);
                }

                public final void getOutline(View view, Outline outline) {
                    outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), (float) ((int) C13628n.m24520b(C84401c.m145164a(), 2.0f)));
                }
            });
            view.setClipToOutline(true);
        }
    }

    /* renamed from: b */
    public static float m123744b(Context context, int i) {
        return (float) ((C70636dh.m124831b(context) - (i * 2)) - (f156702d * 2));
    }

    /* renamed from: a */
    private static Object m123740a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(10163);
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
                    MethodCollector.m26664o(10163);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* renamed from: a */
    public static void m123742a(Context context, int i) {
        Vibrator vibrator = (Vibrator) m123740a(context, "vibrator");
        if (vibrator != null) {
            vibrator.vibrate((long) i);
        }
    }

    /* renamed from: a */
    public static float m123737a(C70087b bVar, VideoSegment videoSegment, int i, int i2) {
        return (((((float) videoSegment.mo110578d()) * 1.0f) / (videoSegment.mo110582f() * bVar.f156738e)) + ((float) i2)) - ((float) i);
    }

    /* renamed from: a */
    public static float m123736a(Context context, C70087b bVar, float f, VideoSegment videoSegment, int i) {
        if (videoSegment.mo110580e() - videoSegment.mo110578d() == videoSegment.f156710b) {
            return (float) ((C70636dh.m124831b(context) - i) - f156702d);
        }
        return f + ((float) f156702d) + (((float) (videoSegment.mo110580e() - videoSegment.mo110578d())) / (videoSegment.mo110582f() * bVar.f156738e));
    }
}
