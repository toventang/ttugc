package com.p2082ss.android.ugc.aweme.utils;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.view.WindowManager;
import android.widget.Toast;
import com.bytedance.common.utility.AbstractC13615f;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import java.lang.reflect.Field;

/* renamed from: com.ss.android.ugc.aweme.utils.ic */
public final class C80567ic implements C13628n.AbstractC13632b {

    /* renamed from: a */
    private static Field f180183a;

    /* renamed from: b */
    private static Field f180184b;

    static {
        Covode.recordClassIndex(93840);
        try {
            Field declaredField = Toast.class.getDeclaredField("mTN");
            f180183a = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = f180183a.getType().getDeclaredField("mHandler");
            f180184b = declaredField2;
            declaredField2.setAccessible(true);
        } catch (Exception e) {
            C51423a.m95790a((Throwable) e);
            e.printStackTrace();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.ic$a */
    public static class HandlerC80568a extends Handler {

        /* renamed from: a */
        private Handler f180185a;

        static {
            Covode.recordClassIndex(93841);
        }

        public HandlerC80568a(Handler handler) {
            this.f180185a = handler;
        }

        public final void handleMessage(Message message) {
            this.f180185a.handleMessage(message);
        }

        public final void dispatchMessage(Message message) {
            try {
                super.dispatchMessage(message);
            } catch (WindowManager.BadTokenException e) {
                C51423a.m95790a((Throwable) e);
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m139657a(Toast toast) {
        try {
            Object obj = f180183a.get(toast);
            f180184b.set(obj, new HandlerC80568a((Handler) f180184b.get(obj)));
        } catch (Exception e) {
            C51423a.m95790a((Throwable) e);
            e.printStackTrace();
        }
    }

    @Override // com.bytedance.common.utility.C13628n.AbstractC13632b
    /* renamed from: a */
    public final boolean mo21888a(Context context, CharSequence charSequence, long j) {
        if ((context instanceof AbstractC13615f) || Build.VERSION.SDK_INT != 25) {
            return false;
        }
        Toast makeText = Toast.makeText(context, charSequence, (int) j);
        m139657a(makeText);
        if (Build.VERSION.SDK_INT == 25) {
            m139657a(makeText);
        }
        makeText.show();
        return true;
    }
}
