package com.p2082ss.android.ugc.aweme.profile.widgets.userId;

import android.view.View;
import android.widget.TextView;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.p797d.AbstractC12769a;
import com.bytedance.assem.arch.service.C12801d;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commerce.C37491d;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.widgets.common.AbstractC64616j;
import com.p2082ss.android.ugc.aweme.setting.p3716d.C68067b;
import com.p2082ss.android.ugc.aweme.setting.p3716d.C68070e;
import com.p2082ss.android.ugc.aweme.setting.p3716d.C68071f;
import com.p2082ss.android.ugc.aweme.utils.C80298cg;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.userId.b */
public final class C65198b extends AbstractC12769a implements AbstractC90252i, AbstractC90253j {

    /* renamed from: j */
    public User f147112j;

    /* renamed from: k */
    private TextView f147113k;

    static {
        Covode.recordClassIndex(76671);
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(205, new RunnableC90250g(C65198b.class, "onSwitchToCreatorAccount", C68071f.class, ThreadMode.MAIN, 0, false));
        hashMap.put(206, new RunnableC90250g(C65198b.class, "onSwitchToBusinessAccount", C68070e.class, ThreadMode.MAIN, 0, false));
        hashMap.put(207, new RunnableC90250g(C65198b.class, "onSwitchToPersonalAccount", C68067b.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12766p, com.bytedance.assem.arch.core.AbstractC12748a
    /* renamed from: f */
    public final void mo20518f() {
        super.mo20518f();
        C80298cg.m139204a(this);
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12766p, com.bytedance.assem.arch.core.AbstractC12748a
    /* renamed from: p */
    public final void mo20527p() {
        super.mo20527p();
        C80298cg.m139205b(this);
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onSwitchToCreatorAccount(C68071f fVar) {
        C89219l.m154721d(fVar, "");
        mo20528t().setVisibility(8);
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onSwitchToPersonalAccount(C68067b bVar) {
        C89219l.m154721d(bVar, "");
        mo20528t().setVisibility(8);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.userId.b$a */
    static final class C65199a extends AbstractC89220m implements AbstractC89172b<C12776a<? extends User>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C65198b f147114a;

        static {
            Covode.recordClassIndex(76672);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65199a(C65198b bVar) {
            super(1);
            this.f147114a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C12776a<? extends User> aVar) {
            T t;
            C12776a<? extends User> aVar2 = aVar;
            if (aVar2 != null) {
                t = aVar2.f31085a;
            } else {
                t = null;
            }
            this.f147114a.f147112j = t;
            this.f147114a.mo104368a((User) t);
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: b */
    public final void mo20630b(View view) {
        C89219l.m154721d(view, "");
        if (!(view instanceof TextView)) {
            view = null;
        }
        this.f147113k = (TextView) view;
        C12801d.m23020a(this, C89204ab.m154669a(AbstractC64616j.class), C65200c.f147115a, new C65199a(this));
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onSwitchToBusinessAccount(C68070e eVar) {
        C89219l.m154721d(eVar, "");
        mo20528t().setVisibility(0);
        mo104368a(this.f147112j);
    }

    /* renamed from: a */
    public final void mo104368a(User user) {
        if (user != null) {
            C37491d bizAccountInfo = user.getBizAccountInfo();
            if (bizAccountInfo == null || !bizAccountInfo.enableShowCategory()) {
                TextView textView = this.f147113k;
                if (textView != null) {
                    textView.setVisibility(8);
                    return;
                }
                return;
            }
            TextView textView2 = this.f147113k;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            TextView textView3 = this.f147113k;
            if (textView3 != null) {
                textView3.setText(user.getCategory());
            }
        }
    }
}
