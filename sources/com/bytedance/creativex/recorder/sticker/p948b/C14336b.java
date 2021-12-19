package com.bytedance.creativex.recorder.sticker.p948b;

import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75592f;
import com.p2082ss.android.ugc.aweme.sticker.senor.presenter.ARSenorPresenter;
import com.p2082ss.android.ugc.aweme.sticker.senor.presenter.AbstractC75884a;
import com.p2082ss.android.vesdk.C85568t;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.creativex.recorder.sticker.b.b */
public final class C14336b implements AbstractC75592f {

    /* renamed from: a */
    public AbstractC75884a f34710a;

    /* renamed from: b */
    private final Handler f34711b;

    /* renamed from: c */
    private final boolean f34712c;

    /* renamed from: d */
    private final AbstractC89171a<Boolean> f34713d;

    static {
        Covode.recordClassIndex(16409);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75592f
    /* renamed from: c */
    public final Handler mo23148c() {
        return this.f34711b;
    }

    /* renamed from: d */
    private static boolean m26174d() {
        C85568t.C85573d a = C85568t.m147473a().mo131556a("enable_build_in_sensor_service");
        if (a == null) {
            return false;
        }
        Object obj = a.f191742b;
        C89219l.m154716b(obj, "");
        return ((Boolean) obj).booleanValue();
    }

    /* renamed from: a */
    public final void mo23145a() {
        AbstractC75884a aVar;
        if (!m26174d() && (aVar = this.f34710a) != null && !aVar.mo119552b()) {
            aVar.mo119547a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75592f
    /* renamed from: b */
    public final void mo23147b() {
        AbstractC75884a aVar;
        if (!m26174d()) {
            if ((!this.f34713d.invoke().booleanValue() || !(this.f34710a instanceof ARSenorPresenter)) && (aVar = this.f34710a) != null && aVar.mo119552b()) {
                aVar.unRegister();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75592f
    /* renamed from: a */
    public final void mo23146a(AbstractC75884a aVar, boolean z) {
        AbstractC75884a aVar2;
        C89219l.m154721d(aVar, "");
        AbstractC75884a aVar3 = this.f34710a;
        if (z || aVar3 == null || (!C89219l.m154714a(aVar.getClass(), aVar3.getClass())) || ((aVar2 = this.f34710a) != null && !aVar2.mo119552b())) {
            mo23147b();
            this.f34710a = aVar;
            mo23145a();
        }
    }

    public C14336b(Handler handler, boolean z, AbstractC89171a<Boolean> aVar) {
        C89219l.m154721d(aVar, "");
        this.f34711b = handler;
        this.f34712c = z;
        this.f34713d = aVar;
    }
}
