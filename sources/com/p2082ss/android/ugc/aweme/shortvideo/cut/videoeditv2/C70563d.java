package com.p2082ss.android.ugc.aweme.shortvideo.cut.videoeditv2;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Vibrator;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.property.C65390cc;
import com.p2082ss.android.ugc.aweme.property.C65391cd;
import com.p2082ss.android.ugc.aweme.setting.C68065d;
import com.p2082ss.android.ugc.aweme.shortvideo.C71812ep;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.p3810c.C70983b;
import com.p2082ss.android.ugc.aweme.utils.C80209ad;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.d */
public final class C70563d {

    /* renamed from: a */
    public static int f157829a = C71812ep.m126783a(56.0d, C63247i.f143610a);

    /* renamed from: b */
    public static int f157830b = C71812ep.m126783a(60.0d, C63247i.f143610a);

    /* renamed from: c */
    public static int f157831c = C71812ep.m126783a(30.0d, C63247i.f143610a);

    /* renamed from: d */
    public static int f157832d = C71812ep.m126783a(35.0d, C63247i.f143610a);

    /* renamed from: e */
    public static final C70563d f157833e = new C70563d();

    private C70563d() {
    }

    static {
        Covode.recordClassIndex(83026);
    }

    /* renamed from: a */
    public static final long m124624a() {
        if (C70983b.m125339a()) {
            return Math.min(C68065d.m120371a(), 900000L);
        }
        if (C65390cc.m117087a()) {
            return C65391cd.m117088a();
        }
        C63244g.m114602a().mo73256B();
        return 15000;
    }

    /* renamed from: a */
    public static final void m124628a(Context context) {
        C89219l.m154721d(context, "");
        Object a = m124626a(context, "vibrator");
        Objects.requireNonNull(a, "null cannot be cast to non-null type android.os.Vibrator");
        ((Vibrator) a).vibrate(10);
    }

    /* renamed from: a */
    public static final MediaModel m124625a(String str, CutMultiVideoViewModel cutMultiVideoViewModel) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(cutMultiVideoViewModel, "");
        if (!cutMultiVideoViewModel.f156539k) {
            return C80209ad.m139032a(str);
        }
        MediaModel mediaModel = new MediaModel(-1);
        mediaModel.f134662b = str;
        mediaModel.f134672l = 720;
        mediaModel.f134673m = 1280;
        mediaModel.f134668h = (long) cutMultiVideoViewModel.f156540l;
        return mediaModel;
    }

    /* renamed from: a */
    private static Object m124626a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(12955);
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
                    MethodCollector.m26664o(12955);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* renamed from: a */
    private static boolean m124629a(float f, boolean z) {
        if (z || !C70983b.m125339a() || f <= 60.0f) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static String m124627a(Activity activity, float f, boolean z) {
        C89219l.m154721d(activity, "");
        if (m124629a(f, z)) {
            int i = (int) f;
            StringBuilder sb = new StringBuilder();
            String a = C1764a.m5929a(Locale.getDefault(), "%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i / 60)}, 1));
            C89219l.m154716b(a, "");
            StringBuilder append = sb.append(a).append(':');
            String a2 = C1764a.m5929a(Locale.getDefault(), "%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i % 60)}, 1));
            C89219l.m154716b(a2, "");
            String string = activity.getString(R.string.czs, new Object[]{append.append(a2).toString()});
            C89219l.m154716b(string, "");
            return string;
        }
        String a3 = C1764a.m5929a(Locale.getDefault(), "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1));
        C89219l.m154716b(a3, "");
        String string2 = activity.getResources().getString(R.string.d5c, a3);
        C89219l.m154716b(string2, "");
        return string2;
    }
}
