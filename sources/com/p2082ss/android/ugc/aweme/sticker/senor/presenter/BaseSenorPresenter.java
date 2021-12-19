package com.p2082ss.android.ugc.aweme.sticker.senor.presenter;

import android.content.ClipboardManager;
import android.content.Context;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseIntArray;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13846c;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.sticker.senor.p3997a.AbstractC75867a;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.senor.presenter.BaseSenorPresenter */
public abstract class BaseSenorPresenter implements AbstractC33974au, AbstractC75884a {

    /* renamed from: a */
    public final SparseIntArray f170434a = new SparseIntArray();

    /* renamed from: b */
    private boolean f170435b;

    /* renamed from: c */
    private final SensorManager f170436c;

    /* renamed from: d */
    private final List<AbstractC75867a> f170437d = new CopyOnWriteArrayList();

    /* renamed from: e */
    private final Handler f170438e;

    /* renamed from: f */
    private final Context f170439f;

    /* renamed from: g */
    private final Handler f170440g;

    static {
        Covode.recordClassIndex(88815);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.senor.presenter.AbstractC75884a
    /* renamed from: a */
    public void mo119547a() {
        this.f170435b = true;
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            unRegister();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.senor.presenter.AbstractC75884a
    /* renamed from: b */
    public final boolean mo119552b() {
        return this.f170435b;
    }

    /* renamed from: c */
    public final SensorManager mo119553c() {
        return this.f170436c;
    }

    /* renamed from: d */
    public final Context mo119554d() {
        return this.f170439f;
    }

    /* renamed from: e */
    public final Handler mo119555e() {
        return this.f170440g;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.senor.presenter.AbstractC75884a
    public void unRegister() {
        this.f170435b = false;
        for (AbstractC75867a aVar : this.f170437d) {
            this.f170436c.unregisterListener(aVar);
        }
    }

    /* renamed from: a */
    public final void mo119550a(AbstractC75867a aVar) {
        C89219l.m154721d(aVar, "");
        this.f170437d.add(aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.senor.presenter.AbstractC75884a
    /* renamed from: a */
    public final void mo119551a(boolean z) {
        for (AbstractC75867a aVar : this.f170437d) {
            aVar.f170413a = z;
        }
    }

    /* renamed from: a */
    private static Object m133051a(Context context, String str) {
        Object systemService;
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    return context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            return context.getSystemService(str);
        } else if (!C58027i.f132246a) {
            return context.getSystemService(str);
        } else {
            synchronized (ClipboardManager.class) {
                systemService = context.getSystemService(str);
                if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                    try {
                        Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                        declaredField.setAccessible(true);
                        declaredField.set(systemService, new C58027i.HandlerC58028a((Handler) declaredField.get(systemService)));
                    } catch (Exception e) {
                        C13846c.m25011a(e, "ClipboardManager Handler Reflect Fail");
                    }
                }
                C58027i.f132246a = false;
            }
            return systemService;
        }
    }

    /* renamed from: a */
    public final int mo119549a(int i, int i2, boolean z) {
        if (!z) {
            return this.f170434a.get(i);
        }
        return this.f170434a.get(i, i2);
    }

    public BaseSenorPresenter(Context context, final AbstractC1204m mVar, Handler handler) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(mVar, "");
        this.f170439f = context;
        this.f170440g = handler;
        Object a = m133051a(context, "sensor");
        Objects.requireNonNull(a, "null cannot be cast to non-null type android.hardware.SensorManager");
        this.f170436c = (SensorManager) a;
        Handler handler2 = new Handler(Looper.getMainLooper());
        this.f170438e = handler2;
        handler2.post(new Runnable(this) {
            /* class com.p2082ss.android.ugc.aweme.sticker.senor.presenter.BaseSenorPresenter.RunnableC758801 */

            /* renamed from: a */
            final /* synthetic */ BaseSenorPresenter f170441a;

            static {
                Covode.recordClassIndex(88816);
            }

            {
                this.f170441a = r1;
            }

            public final void run() {
                mVar.getLifecycle().mo4012a(this.f170441a);
            }
        });
    }
}
