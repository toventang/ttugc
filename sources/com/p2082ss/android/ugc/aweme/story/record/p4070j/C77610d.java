package com.p2082ss.android.ugc.aweme.story.record.p4070j;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.property.C65418da;
import com.p2082ss.android.ugc.aweme.property.C65419db;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.p3854r.C72724a;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import java.lang.reflect.Field;
import java.util.Objects;
import java.util.UUID;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.record.j.d */
public final class C77610d {

    /* renamed from: a */
    public static final C77610d f174069a = new C77610d();

    /* renamed from: a */
    private static boolean m135606a(int i) {
        return i == 1 || i == 2 || i == 8;
    }

    private C77610d() {
    }

    static {
        Covode.recordClassIndex(90647);
    }

    /* renamed from: a */
    public static final int m135601a() {
        int i;
        if (C65419db.m117138a() != 1) {
            i = C65419db.m117138a();
        } else if (C65418da.m117137a() != 1) {
            i = C65418da.m117137a();
        } else {
            i = 1;
        }
        if (!m135606a(i)) {
            return 1;
        }
        return i;
    }

    /* renamed from: a */
    public static MediaPlayer m135602a(Context context) {
        C89219l.m154721d(context, "");
        if (C84902i.m145892a("file:///system/media/audio/ui/camera_click.ogg")) {
            return MediaPlayer.create(context, Uri.parse("file:///system/media/audio/ui/camera_click.ogg"));
        }
        return null;
    }

    /* renamed from: a */
    private static Object m135603a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(4550);
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
                    MethodCollector.m26664o(4550);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* renamed from: a */
    public static void m135604a(MediaPlayer mediaPlayer, Context context) {
        C89219l.m154721d(mediaPlayer, "");
        C89219l.m154721d(context, "");
        Object a = m135603a(context, DataType.AUDIO);
        Objects.requireNonNull(a, "null cannot be cast to non-null type android.media.AudioManager");
        if (((AudioManager) a).getStreamVolume(5) != 0) {
            mediaPlayer.start();
        }
    }

    /* renamed from: a */
    public static final void m135605a(Bundle bundle, Activity activity, boolean z) {
        C89219l.m154721d(activity, "");
        Intent intent = new Intent();
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        intent.putExtra("shoot_way", "story");
        if (!intent.hasExtra("creation_id")) {
            intent.putExtra("creation_id", UUID.randomUUID().toString());
        }
        C70005cr.m123611a().mo70083a((C69905c) null);
        C70005cr.m123611a().mo110456f();
        if (z || C72724a.m128203a().mo62198a((Context) activity, intent)) {
            C72724a.m128203a().mo62201c(activity, intent);
            return;
        }
        C72724a.m128203a().mo62190a(activity, intent);
        C72724a.m128203a().mo62199b(activity, intent);
    }
}
