package com.bytedance.android.livesdk.newvideogift.p595a;

import android.content.Context;
import android.util.SparseArray;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.livesetting.gift.GiftPlayerAutoReleaseSwitchSetting;
import com.bytedance.android.livesdkapi.depend.p680d.p681a.AbstractC11629a;
import com.bytedance.android.livesdkapi.depend.p680d.p681a.AbstractC11630b;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.android.livesdkapi.host.IHostPlugin;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;

/* renamed from: com.bytedance.android.livesdk.newvideogift.a.e */
public final class C9958e implements AbstractC11630b {

    /* renamed from: c */
    private static SparseArray<AbstractC11629a> f24131c = new SparseArray<>(2);

    /* renamed from: d */
    private static int f24132d;

    /* renamed from: e */
    private static C9958e f24133e;

    /* renamed from: a */
    private final IHostPlugin f24134a;

    /* renamed from: b */
    private Context f24135b;

    static {
        Covode.recordClassIndex(11510);
    }

    /* renamed from: b */
    public static boolean m18294b() {
        if (f24131c.get(f24132d) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static C9958e m18293a() {
        if (f24133e == null) {
            f24133e = new C9958e(((IHostContext) C6193a.m13435a(IHostContext.class)).context(), (IHostPlugin) C6193a.m13435a(IHostPlugin.class));
        }
        return f24133e;
    }

    @Override // com.bytedance.android.livesdkapi.depend.p680d.p681a.AbstractC11630b
    /* renamed from: a */
    public final AbstractC11629a mo16679a(int i) {
        return f24131c.get(i);
    }

    @Override // com.bytedance.android.livesdkapi.depend.p680d.p681a.AbstractC11630b
    /* renamed from: b */
    public final void mo16682b(int i) {
        AbstractC11629a aVar = f24131c.get(i);
        C3854a.m9453a(3, "GiftCtlManager", "manager release() called with [" + aVar + "]");
        if (aVar != null) {
            aVar.mo16671c();
            f24131c.remove(i);
            C3854a.m9453a(4, "GiftCtlManager", "release player ".concat(String.valueOf(i)));
        }
    }

    private C9958e(Context context, IHostPlugin iHostPlugin) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        this.f24135b = applicationContext;
        this.f24134a = iHostPlugin;
    }

    @Override // com.bytedance.android.livesdkapi.depend.p680d.p681a.AbstractC11630b
    /* renamed from: b */
    public final AbstractC11629a mo16681b(int i, AbstractC1204m mVar) {
        int i2 = f24132d;
        if (i == i2 && mo16679a(i2) != null) {
            return mo16679a(f24132d);
        }
        f24132d = i;
        C9954d dVar = new C9954d(this.f24135b, this.f24134a);
        dVar.mo16664a(mVar);
        f24131c.put(i, dVar);
        C3854a.m9453a(4, "GiftCtlManager", "create new player ".concat(String.valueOf(i)));
        return dVar;
    }

    @Override // com.bytedance.android.livesdkapi.depend.p680d.p681a.AbstractC11630b
    /* renamed from: a */
    public final AbstractC11629a mo16680a(int i, AbstractC1204m mVar) {
        int i2 = f24132d;
        if (i == i2 && mo16679a(i2) != null) {
            return mo16679a(f24132d);
        }
        if (GiftPlayerAutoReleaseSwitchSetting.INSTANCE.getValue().f24036a) {
            return null;
        }
        f24132d = i;
        C9954d dVar = new C9954d(this.f24135b, this.f24134a);
        dVar.mo16664a(mVar);
        f24131c.put(i, dVar);
        C3854a.m9453a(4, "GiftCtlManager", "create new player ".concat(String.valueOf(i)));
        return dVar;
    }
}
