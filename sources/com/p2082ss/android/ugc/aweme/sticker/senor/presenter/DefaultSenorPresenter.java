package com.p2082ss.android.ugc.aweme.sticker.senor.presenter;

import android.content.Context;
import android.hardware.Sensor;
import android.os.Build;
import android.os.Handler;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.sticker.senor.AbstractC75877c;
import com.p2082ss.android.ugc.aweme.sticker.senor.p3997a.C75873b;
import com.p2082ss.android.ugc.aweme.sticker.senor.p3997a.C75874c;
import com.p2082ss.android.ugc.aweme.sticker.senor.p3997a.C75875d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.senor.presenter.DefaultSenorPresenter */
public final class DefaultSenorPresenter extends BaseSenorPresenter implements AbstractC33974au {

    /* renamed from: b */
    public static final C75881a f170443b = new C75881a((byte) 0);

    /* renamed from: c */
    private C75873b f170444c;

    /* renamed from: d */
    private final boolean f170445d;

    /* renamed from: e */
    private final AbstractC75877c f170446e;

    /* renamed from: f */
    private final boolean f170447f;

    /* renamed from: g */
    private final Handler f170448g;

    /* renamed from: h */
    private final boolean f170449h;

    static {
        Covode.recordClassIndex(88817);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.senor.presenter.BaseSenorPresenter, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.senor.presenter.DefaultSenorPresenter$a */
    public static final class C75881a {
        static {
            Covode.recordClassIndex(88818);
        }

        private C75881a() {
        }

        public /* synthetic */ C75881a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.senor.presenter.BaseSenorPresenter, com.p2082ss.android.ugc.aweme.sticker.senor.presenter.AbstractC75884a
    public final void unRegister() {
        super.unRegister();
        C75873b bVar = this.f170444c;
        if (bVar != null) {
            bVar.disable();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.senor.presenter.BaseSenorPresenter, com.p2082ss.android.ugc.aweme.sticker.senor.presenter.AbstractC75884a
    /* renamed from: a */
    public final void mo119547a() {
        Sensor sensor;
        super.mo119547a();
        Sensor defaultSensor = mo119553c().getDefaultSensor(9);
        if (defaultSensor == null) {
            C75873b bVar = new C75873b(mo119554d(), this.f170446e);
            this.f170444c = bVar;
            bVar.enable();
        } else {
            C75874c cVar = new C75874c(this.f170446e, this.f170445d);
            mo119553c().registerListener(cVar, defaultSensor, mo119549a(defaultSensor.getType(), 100000, this.f170449h), mo119555e());
            mo119550a(cVar);
        }
        int i = Build.VERSION.SDK_INT;
        if ((this.f170447f && (sensor = mo119553c().getDefaultSensor(15)) != null) || (sensor = mo119553c().getDefaultSensor(11)) != null) {
            C75875d dVar = new C75875d(this.f170446e, this.f170445d);
            mo119553c().registerListener(dVar, sensor, mo119549a(sensor.getType(), 100000, this.f170449h), mo119555e());
            mo119550a(dVar);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultSenorPresenter(Context context, AbstractC1204m mVar, boolean z, AbstractC75877c cVar, boolean z2, Handler handler, boolean z3) {
        super(context, mVar, handler);
        C89219l.m154721d(cVar, "");
        if (context == null) {
            C89219l.m154715b();
        }
        if (mVar == null) {
            C89219l.m154715b();
        }
        this.f170445d = z;
        this.f170446e = cVar;
        this.f170447f = z2;
        this.f170448g = handler;
        this.f170449h = z3;
    }
}
