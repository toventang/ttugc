package com.p2082ss.android.ugc.aweme.discover.helper;

import android.os.Handler;
import android.os.Message;
import android.util.Pair;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: com.ss.android.ugc.aweme.discover.helper.ak */
public final class C41991ak implements WeakHandler.IHandler {

    /* renamed from: a */
    final boolean f97927a;

    /* renamed from: b */
    public int f97928b;

    /* renamed from: c */
    public boolean f97929c;

    /* renamed from: d */
    ViewPager f97930d;

    /* renamed from: e */
    public boolean f97931e;

    /* renamed from: f */
    public Handler f97932f;

    /* renamed from: g */
    Method f97933g;

    /* renamed from: h */
    private long f97934h;

    /* renamed from: i */
    private View.OnTouchListener f97935i;

    static {
        Covode.recordClassIndex(49921);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
    }

    /* renamed from: b */
    public final void mo71162b() {
        if (this.f97931e) {
            this.f97931e = false;
            this.f97932f.removeCallbacksAndMessages(null);
        }
    }

    /* renamed from: a */
    public final void mo71161a() {
        if (!this.f97931e) {
            this.f97931e = true;
            this.f97932f.removeCallbacksAndMessages(null);
            this.f97932f.postDelayed(new RunnableC41994a(this, this.f97934h), this.f97934h);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.discover.helper.ak$a */
    public static class RunnableC41994a implements Runnable {

        /* renamed from: a */
        private long f97938a;

        /* renamed from: b */
        private WeakReference<C41991ak> f97939b;

        static {
            Covode.recordClassIndex(49924);
        }

        public final void run() {
            C41991ak akVar;
            int i;
            WeakReference<C41991ak> weakReference = this.f97939b;
            if (weakReference != null && weakReference.get() != null && (akVar = this.f97939b.get()) != null && akVar.f97932f != null && akVar.f97931e) {
                if (!akVar.f97931e) {
                    akVar.f97932f.removeCallbacksAndMessages(null);
                } else {
                    int currentItem = akVar.f97930d.getCurrentItem();
                    if (akVar.f97927a) {
                        i = -1;
                    } else {
                        i = 1;
                    }
                    int i2 = currentItem + i;
                    if (i2 < 0) {
                        i2 += akVar.f97928b;
                    }
                    if (akVar.f97933g != null) {
                        try {
                            Method method = akVar.f97933g;
                            ViewPager viewPager = akVar.f97930d;
                            Object[] objArr = {Integer.valueOf(i2), true, true, 1};
                            Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{viewPager, objArr}, 110000, "java.lang.Object", true, "com_ss_android_ugc_aweme_discover_helper_ViewPagerSwitchHelper_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                            if (((Boolean) a.first).booleanValue()) {
                                Object obj = a.second;
                            } else {
                                C15346a.m28242a(method.invoke(viewPager, objArr), method, new Object[]{viewPager, objArr}, "com_ss_android_ugc_aweme_discover_helper_ViewPagerSwitchHelper_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                            }
                        } catch (InvocationTargetException e) {
                            e.printStackTrace();
                        } catch (IllegalAccessException e2) {
                            e2.printStackTrace();
                        }
                    }
                    akVar.f97930d.setCurrentItem(i2, true);
                }
                if (!akVar.f97931e) {
                    akVar.f97932f.removeCallbacksAndMessages(null);
                } else {
                    akVar.f97932f.postDelayed(this, this.f97938a);
                }
            }
        }

        RunnableC41994a(C41991ak akVar, long j) {
            this.f97939b = new WeakReference<>(akVar);
            this.f97938a = j;
        }
    }

    public C41991ak(ViewPager viewPager) {
        this(viewPager, 5000);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x005f, code lost:
        if (r1.getResources().getConfiguration().getLayoutDirection() == 1) goto L_0x0061;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C41991ak(androidx.viewpager.widget.ViewPager r7, long r8) {
        /*
        // Method dump skipped, instructions count: 102
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.discover.helper.C41991ak.<init>(androidx.viewpager.widget.ViewPager, long):void");
    }
}
