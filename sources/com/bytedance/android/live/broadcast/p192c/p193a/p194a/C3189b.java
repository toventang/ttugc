package com.bytedance.android.live.broadcast.p192c.p193a.p194a;

import android.os.SystemClock;
import com.bytedance.android.live.broadcast.api.p184b.AbstractC3022a;
import com.bytedance.android.live.broadcast.p192c.p193a.C3195c;
import com.bytedance.android.live.broadcast.p192c.p193a.C3196d;
import com.bytedance.android.live.broadcast.p192c.p193a.C3197e;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.effect.C4217d;
import com.bytedance.android.live.effect.api.C4147a;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEnableUseEffectCheckCacheSetting;
import com.bytedance.android.livesdkapi.depend.model.C11672a;
import com.bytedance.common.utility.C13617h;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.android.live.broadcast.c.a.a.b */
public final class C3189b extends AbstractC3187a {

    /* renamed from: d */
    public final List<AbstractC3022a.AbstractC3024b> f9205d = new ArrayList();

    /* renamed from: e */
    public final Map<String, EffectChannelResponse> f9206e = new HashMap();

    /* renamed from: f */
    private final Map<String, C11672a> f9207f = new HashMap();

    static {
        Covode.recordClassIndex(3670);
    }

    /* renamed from: b */
    private static boolean m8663b() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.bytedance.android.live.broadcast.api.p184b.AbstractC3022a, com.bytedance.android.live.broadcast.p192c.p193a.p194a.AbstractC3187a
    /* renamed from: a */
    public final void mo8230a() {
        super.mo8230a();
        this.f9205d.clear();
        this.f9206e.clear();
    }

    @Override // com.bytedance.android.live.broadcast.api.p184b.AbstractC3022a
    /* renamed from: a */
    public final void mo8231a(final String str, final AbstractC3022a.AbstractC3024b bVar) {
        final C3197e eVar;
        boolean z;
        if (this.f9206e.containsKey(str)) {
            for (AbstractC3022a.AbstractC3024b bVar2 : this.f9205d) {
                if (bVar2 != null) {
                    bVar2.mo8237a(this.f9206e.get(str));
                }
            }
            if (bVar != null) {
                bVar.mo8237a(this.f9206e.get(str));
            }
        } else if (this.f9198a != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean();
            if (C4147a.f11583a.equals(str)) {
                eVar = new C3195c();
            } else if (C4147a.f11584b.equals(str)) {
                eVar = new C3196d();
            } else {
                eVar = new C3197e();
            }
            final C31901 r2 = new IFetchEffectChannelListener() {
                /* class com.bytedance.android.live.broadcast.p192c.p193a.p194a.C3189b.C31901 */

                static {
                    Covode.recordClassIndex(3671);
                }

                @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
                public final void onFail(ExceptionResult exceptionResult) {
                    if (atomicBoolean.get()) {
                        eVar.mo8549a(exceptionResult.getErrorCode(), exceptionResult.getMsg());
                    }
                    for (AbstractC3022a.AbstractC3024b bVar : C3189b.this.f9205d) {
                        if (bVar != null) {
                            bVar.mo8236a();
                        }
                    }
                    AbstractC3022a.AbstractC3024b bVar2 = bVar;
                    if (bVar2 != null) {
                        bVar2.mo8236a();
                    }
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final /* synthetic */ void onSuccess(EffectChannelResponse effectChannelResponse) {
                    EffectChannelResponse effectChannelResponse2 = effectChannelResponse;
                    if (effectChannelResponse2 == null) {
                        return;
                    }
                    if (!C13617h.m24465a(effectChannelResponse2.getCategoryResponseList()) || !C13617h.m24465a(effectChannelResponse2.getAllCategoryEffects())) {
                        C3189b.this.f9206e.put(str, effectChannelResponse2);
                        if (atomicBoolean.get()) {
                            eVar.mo8548a();
                        }
                        for (AbstractC3022a.AbstractC3024b bVar : C3189b.this.f9205d) {
                            if (bVar != null) {
                                bVar.mo8237a(C3189b.this.f9206e.get(str));
                            }
                        }
                        C4217d.m10321d().mo9856a(effectChannelResponse2);
                        AbstractC3022a.AbstractC3024b bVar2 = bVar;
                        if (bVar2 != null) {
                            bVar2.mo8237a(C3189b.this.f9206e.get(str));
                        }
                    }
                }
            };
            eVar.f9218a = SystemClock.uptimeMillis();
            C3966y.m9669e();
            if (!C58029j.f132253e || !C58029j.m104846b() || C58029j.m104847c()) {
                z = m8663b();
                C58029j.f132253e = z;
            } else {
                z = C58029j.f132253e;
            }
            if (!z) {
                mo8544a(atomicBoolean, str, r2, false);
            } else if (LiveEnableUseEffectCheckCacheSetting.INSTANCE.enable()) {
                this.f9198a.checkedEffectListUpdate(str, new ICheckChannelListener() {
                    /* class com.bytedance.android.live.broadcast.p192c.p193a.p194a.C3189b.C31912 */

                    static {
                        Covode.recordClassIndex(3672);
                    }

                    @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
                    public final void checkChannelFailed(ExceptionResult exceptionResult) {
                        C3189b.this.mo8544a(atomicBoolean, str, r2, true);
                    }

                    @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
                    public final void checkChannelSuccess(boolean z) {
                        C3189b.this.mo8544a(atomicBoolean, str, r2, z);
                    }
                });
            } else {
                mo8544a(atomicBoolean, str, r2, true);
            }
        }
    }

    /* renamed from: a */
    public final void mo8544a(AtomicBoolean atomicBoolean, String str, IFetchEffectChannelListener iFetchEffectChannelListener, boolean z) {
        atomicBoolean.set(z);
        if (z) {
            this.f9198a.fetchEffectList(str, false, iFetchEffectChannelListener);
            return;
        }
        atomicBoolean.set(false);
        this.f9198a.fetchEffectListFromCache(str, iFetchEffectChannelListener);
    }
}
