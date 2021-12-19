package com.p2082ss.android.ugc.aweme.prop.p3608d;

import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.watcher.C18285c;
import com.p2082ss.android.ugc.aweme.base.C34608n;
import com.p2082ss.android.ugc.aweme.common.AbstractC39085b;
import com.p2082ss.android.ugc.aweme.common.C39088c;
import com.p2082ss.android.ugc.aweme.prop.view.AbstractC65327a;
import com.p2082ss.android.ugc.aweme.services.external.ability.IAVEffectService;
import com.p2082ss.android.ugc.aweme.sticker.model.C75446h;
import com.p2082ss.android.ugc.aweme.utils.C80580in;

/* renamed from: com.ss.android.ugc.aweme.prop.d.a */
public final class C65315a extends C39088c<AbstractC39085b<C75446h>, AbstractC65327a> {

    /* renamed from: a */
    public IAVEffectService.EffectPlatformLoader f147428a;

    static {
        Covode.recordClassIndex(76794);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c, com.p2082ss.android.ugc.aweme.common.AbstractC39159o
    /* renamed from: c */
    public final void mo57528c() {
        if (this.f92287i != null && this.f92286h != null) {
            ((AbstractC65327a) this.f92287i).mo104444a((C75446h) this.f92286h.mData);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c, com.p2082ss.android.ugc.aweme.common.AbstractC39159o
    /* renamed from: a_ */
    public final void mo57526a_(Exception exc) {
        if (this.f92287i != null) {
            ((AbstractC65327a) this.f92287i).mo104445a(exc);
        }
    }

    public C65315a(IAVEffectService.EffectPlatformLoader effectPlatformLoader, final boolean z) {
        this.f147428a = effectPlatformLoader;
        mo67838a(new AbstractC39085b<C75446h>() {
            /* class com.p2082ss.android.ugc.aweme.prop.p3608d.C65315a.C653161 */

            static {
                Covode.recordClassIndex(76795);
            }

            @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
            public final boolean checkParams(Object... objArr) {
                if (objArr == null || objArr.length != 2) {
                    return false;
                }
                return true;
            }

            @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
            public final boolean sendRequest(Object... objArr) {
                if (!super.sendRequest(objArr)) {
                    return false;
                }
                WeakHandler weakHandler = this.mHandler;
                String str = (String) objArr[0];
                ((Integer) objArr[1]).intValue();
                boolean z = z;
                if (!C80580in.m139687c()) {
                    C18285c.m34006b("sd_start_activity_to_request_net_duration");
                    if (z) {
                        C34608n.f81665a.mo61083a(weakHandler, new CallableC65319b(str), 0);
                    } else {
                        C34608n.f81665a.mo61083a(weakHandler, new CallableC65320c(str), 0);
                    }
                }
                return true;
            }
        });
    }
}
