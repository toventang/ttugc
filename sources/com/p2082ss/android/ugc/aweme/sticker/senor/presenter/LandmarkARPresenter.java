package com.p2082ss.android.ugc.aweme.sticker.senor.presenter;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.os.Build;
import android.os.Handler;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.sticker.senor.AbstractC75876b;
import com.p2082ss.android.ugc.aweme.sticker.senor.AbstractC75878d;
import com.p2082ss.android.ugc.aweme.sticker.senor.p3997a.AbstractC75867a;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.senor.presenter.LandmarkARPresenter */
public final class LandmarkARPresenter extends BaseSenorPresenter implements AbstractC33974au {

    /* renamed from: b */
    public final AbstractC75878d f170450b;

    /* renamed from: c */
    private final boolean f170451c;

    /* renamed from: d */
    private final AbstractC75876b f170452d;

    /* renamed from: e */
    private final Handler f170453e;

    static {
        Covode.recordClassIndex(88819);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.senor.presenter.BaseSenorPresenter, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.senor.presenter.BaseSenorPresenter, com.p2082ss.android.ugc.aweme.sticker.senor.presenter.AbstractC75884a
    public final void unRegister() {
        super.unRegister();
        this.f170450b.mo119397a(false);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.senor.presenter.BaseSenorPresenter, com.p2082ss.android.ugc.aweme.sticker.senor.presenter.AbstractC75884a
    /* renamed from: a */
    public final void mo119547a() {
        super.mo119547a();
        int i = Build.VERSION.SDK_INT;
        Sensor defaultSensor = mo119553c().getDefaultSensor(15);
        if (defaultSensor != null || (defaultSensor = mo119553c().getDefaultSensor(11)) != null) {
            this.f170450b.mo119397a(true);
            this.f170452d.mo119395a(new C75883b(this));
            C75882a aVar = new C75882a(this.f170451c, this.f170450b);
            mo119553c().registerListener(aVar, defaultSensor, mo119549a(defaultSensor.getType(), 0, false), mo119555e());
            mo119550a(aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.senor.presenter.LandmarkARPresenter$a */
    static final class C75882a extends AbstractC75867a {

        /* renamed from: c */
        private final AbstractC75878d f170454c;

        static {
            Covode.recordClassIndex(88820);
        }

        public final void onAccuracyChanged(Sensor sensor, int i) {
        }

        public final void onSensorChanged(SensorEvent sensorEvent) {
            C89219l.m154721d(sensorEvent, "");
            double a = m133041a(sensorEvent);
            if (this.f170413a) {
                this.f170454c.mo119399a(sensorEvent.values, a);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C75882a(boolean z, AbstractC75878d dVar) {
            super(z);
            C89219l.m154721d(dVar, "");
            this.f170454c = dVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.senor.presenter.LandmarkARPresenter$b */
    static final class C75883b extends AbstractC89220m implements AbstractC89172b<float[], C89391z> {

        /* renamed from: a */
        final /* synthetic */ LandmarkARPresenter f170455a;

        static {
            Covode.recordClassIndex(88821);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C75883b(LandmarkARPresenter landmarkARPresenter) {
            super(1);
            this.f170455a = landmarkARPresenter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(float[] fArr) {
            float[] fArr2 = fArr;
            C89219l.m154721d(fArr2, "");
            this.f170455a.f170450b.mo119398a(fArr2);
            return C89391z.f203057a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private LandmarkARPresenter(Context context, AbstractC1204m mVar, boolean z, AbstractC75876b bVar) {
        super(context, mVar, null);
        C89219l.m154721d(context, "");
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(bVar, "");
        this.f170451c = z;
        this.f170452d = bVar;
        this.f170453e = null;
        this.f170450b = bVar.mo119396b();
    }

    public /* synthetic */ LandmarkARPresenter(Context context, AbstractC1204m mVar, boolean z, AbstractC75876b bVar, byte b) {
        this(context, mVar, z, bVar);
    }
}
