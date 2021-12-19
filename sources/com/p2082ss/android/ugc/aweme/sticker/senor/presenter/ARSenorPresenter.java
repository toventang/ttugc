package com.p2082ss.android.ugc.aweme.sticker.senor.presenter;

import android.content.Context;
import android.hardware.Sensor;
import android.os.Build;
import android.os.Handler;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.sticker.senor.AbstractC75866a;
import com.p2082ss.android.ugc.aweme.sticker.senor.AbstractC75877c;
import com.p2082ss.android.ugc.aweme.sticker.senor.p3997a.C75873b;
import com.p2082ss.android.ugc.aweme.sticker.senor.p3997a.p3998a.C75869a;
import com.p2082ss.android.ugc.aweme.sticker.senor.p3997a.p3998a.C75870b;
import com.p2082ss.android.ugc.aweme.sticker.senor.p3997a.p3998a.C75871c;
import com.p2082ss.android.ugc.aweme.sticker.senor.p3997a.p3998a.C75872d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.senor.presenter.ARSenorPresenter */
public final class ARSenorPresenter extends BaseSenorPresenter implements AbstractC33974au {

    /* renamed from: b */
    private C75873b f170429b;

    /* renamed from: c */
    private final AbstractC75877c f170430c;

    /* renamed from: d */
    private final boolean f170431d;

    /* renamed from: e */
    private final AbstractC75866a f170432e;

    /* renamed from: f */
    private final Handler f170433f;

    static {
        Covode.recordClassIndex(88814);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.senor.presenter.BaseSenorPresenter, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.senor.presenter.BaseSenorPresenter, com.p2082ss.android.ugc.aweme.sticker.senor.presenter.AbstractC75884a
    public final void unRegister() {
        super.unRegister();
        C75873b bVar = this.f170429b;
        if (bVar != null) {
            bVar.disable();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.senor.presenter.BaseSenorPresenter, com.p2082ss.android.ugc.aweme.sticker.senor.presenter.AbstractC75884a
    /* renamed from: a */
    public final void mo119547a() {
        boolean z;
        boolean z2;
        boolean z3;
        super.mo119547a();
        AbstractC75866a aVar = this.f170432e;
        boolean z4 = true;
        Sensor defaultSensor = mo119553c().getDefaultSensor(1);
        if (defaultSensor == null) {
            z = false;
        } else {
            C75869a aVar2 = new C75869a(this.f170432e, this.f170431d);
            mo119553c().registerListener(aVar2, defaultSensor, BaseSenorPresenter.m133050a(this, defaultSensor.getType()), mo119555e());
            mo119550a(aVar2);
            z = true;
        }
        Sensor defaultSensor2 = mo119553c().getDefaultSensor(4);
        if (defaultSensor2 == null) {
            z2 = false;
        } else {
            C75871c cVar = new C75871c(this.f170431d, this.f170432e);
            mo119553c().registerListener(cVar, defaultSensor2, BaseSenorPresenter.m133050a(this, defaultSensor2.getType()), mo119555e());
            mo119550a(cVar);
            z2 = true;
        }
        Sensor defaultSensor3 = mo119553c().getDefaultSensor(9);
        if (defaultSensor3 == null) {
            C75873b bVar = new C75873b(mo119554d(), this.f170430c);
            this.f170429b = bVar;
            bVar.enable();
            z3 = false;
        } else {
            C75870b bVar2 = new C75870b(this.f170432e, this.f170431d);
            mo119553c().registerListener(bVar2, defaultSensor3, BaseSenorPresenter.m133050a(this, defaultSensor3.getType()), mo119555e());
            mo119550a(bVar2);
            z3 = true;
        }
        int i = Build.VERSION.SDK_INT;
        Sensor defaultSensor4 = mo119553c().getDefaultSensor(15);
        if (defaultSensor4 == null && (defaultSensor4 = mo119553c().getDefaultSensor(11)) == null) {
            z4 = false;
        } else {
            C75872d dVar = new C75872d(this.f170430c, mo119553c(), this.f170432e, this.f170431d);
            mo119553c().registerListener(dVar, defaultSensor4, BaseSenorPresenter.m133050a(this, defaultSensor4.getType()), mo119555e());
            mo119550a(dVar);
        }
        aVar.mo119391a(z, z2, z3, z4);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ARSenorPresenter(Context context, AbstractC1204m mVar, boolean z, AbstractC75866a aVar, Handler handler) {
        super(context, mVar, handler);
        C89219l.m154721d(aVar, "");
        if (context == null) {
            C89219l.m154715b();
        }
        if (mVar == null) {
            C89219l.m154715b();
        }
        this.f170431d = z;
        this.f170432e = aVar;
        this.f170433f = handler;
        this.f170430c = aVar.mo119389a();
    }
}
