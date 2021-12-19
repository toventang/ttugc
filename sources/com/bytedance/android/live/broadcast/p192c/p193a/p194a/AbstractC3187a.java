package com.bytedance.android.live.broadcast.p192c.p193a.p194a;

import android.os.SystemClock;
import com.bytedance.android.live.broadcast.api.p184b.AbstractC3022a;
import com.bytedance.android.live.broadcast.p192c.p193a.C3195c;
import com.bytedance.android.live.broadcast.p192c.p193a.C3196d;
import com.bytedance.android.live.broadcast.p192c.p193a.C3197e;
import com.bytedance.android.live.broadcast.p192c.p193a.C3198f;
import com.bytedance.android.live.effect.api.C4147a;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEnableUseEffectDownloadCacheSetting;
import com.bytedance.android.livesdkapi.depend.model.C11672a;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.p2082ss.android.ugc.effectmanager.EffectManager;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.bytedance.android.live.broadcast.c.a.a.a */
public abstract class AbstractC3187a implements AbstractC3022a {

    /* renamed from: a */
    public final EffectManager f9198a = ((IHostContext) C6193a.m13435a(IHostContext.class)).getEffectManager();

    /* renamed from: b */
    public final List<AbstractC3022a.AbstractC3023a> f9199b = new ArrayList();

    /* renamed from: c */
    public final List<String> f9200c = new ArrayList();

    static {
        Covode.recordClassIndex(3668);
    }

    @Override // com.bytedance.android.live.broadcast.api.p184b.AbstractC3022a
    /* renamed from: a */
    public void mo8230a() {
        this.f9199b.clear();
    }

    @Override // com.bytedance.android.live.broadcast.api.p184b.AbstractC3022a
    /* renamed from: a */
    public final boolean mo8233a(C11672a aVar) {
        if (aVar == null) {
            return true;
        }
        if (LiveEnableUseEffectDownloadCacheSetting.INSTANCE.enable() && this.f9200c.contains(aVar.f27899g)) {
            return true;
        }
        if (DownloadableModelSupport.isInitialized()) {
            return DownloadableModelSupport.getInstance().isEffectReady(this.f9198a, C3198f.m8685a(aVar));
        }
        return this.f9198a.isEffectDownloaded(C3198f.m8685a(aVar));
    }

    @Override // com.bytedance.android.live.broadcast.api.p184b.AbstractC3022a
    /* renamed from: a */
    public final void mo8232a(final String str, C11672a aVar, final AbstractC3022a.AbstractC3023a aVar2) {
        final C3197e eVar;
        if (aVar != null && !mo8233a(aVar)) {
            if (C4147a.f11583a.equals(str)) {
                eVar = new C3195c();
            } else if (C4147a.f11584b.equals(str)) {
                eVar = new C3196d();
            } else {
                eVar = new C3197e();
            }
            eVar.f9219b = SystemClock.uptimeMillis();
            this.f9198a.fetchEffect(C3198f.m8685a(aVar), new IFetchEffectListener() {
                /* class com.bytedance.android.live.broadcast.p192c.p193a.p194a.AbstractC3187a.C31881 */

                static {
                    Covode.recordClassIndex(3669);
                }

                @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                public final void onStart(Effect effect) {
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final /* synthetic */ void onSuccess(Effect effect) {
                    Effect effect2 = effect;
                    C11672a a = C3198f.m8684a(effect2);
                    a.f27905m = false;
                    a.f27904l = true;
                    eVar.mo8550b();
                    AbstractC3187a.this.f9200c.add(effect2.getUnzipPath());
                    for (AbstractC3022a.AbstractC3023a aVar : AbstractC3187a.this.f9199b) {
                        aVar.mo8235b(str, a);
                    }
                    AbstractC3022a.AbstractC3023a aVar2 = aVar2;
                    if (aVar2 != null) {
                        aVar2.mo8235b(str, a);
                    }
                }

                @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                public final void onFail(Effect effect, ExceptionResult exceptionResult) {
                    AbstractC3187a.this.f9198a.deleteEffect(effect);
                    C11672a a = C3198f.m8684a(effect);
                    a.f27905m = false;
                    eVar.mo8551b(exceptionResult.getErrorCode(), exceptionResult.getMsg());
                    for (AbstractC3022a.AbstractC3023a aVar : AbstractC3187a.this.f9199b) {
                        aVar.mo8234a(str, a);
                    }
                    AbstractC3022a.AbstractC3023a aVar2 = aVar2;
                    if (aVar2 != null) {
                        aVar2.mo8234a(str, a);
                    }
                }
            });
            aVar.f27905m = true;
            Iterator<AbstractC3022a.AbstractC3023a> it = this.f9199b.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }
}
