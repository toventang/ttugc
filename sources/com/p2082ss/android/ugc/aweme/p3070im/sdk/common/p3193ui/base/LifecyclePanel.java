package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.base;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import androidx.lifecycle.C1205n;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.ui.base.LifecyclePanel */
public abstract class LifecyclePanel implements AbstractC1204m, AbstractC33974au {

    /* renamed from: a */
    private boolean f126396a;

    /* renamed from: b */
    private final AbstractC89244h f126397b = C89250i.m154773a((AbstractC89171a) new C55287a(this));

    /* renamed from: s */
    public boolean f126398s;

    /* renamed from: t */
    public final AbstractC1204m f126399t;

    static {
        Covode.recordClassIndex(65042);
    }

    /* renamed from: a */
    private final C1205n mo91153a() {
        return (C1205n) this.f126397b.getValue();
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_CREATE) {
            onCreate();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_START) {
            onStart();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_RESUME) {
            onResume();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_PAUSE) {
            onPause();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_STOP) {
            onStop();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.ui.base.LifecyclePanel$a */
    static final class C55287a extends AbstractC89220m implements AbstractC89171a<C1205n> {

        /* renamed from: a */
        final /* synthetic */ LifecyclePanel f126400a;

        static {
            Covode.recordClassIndex(65043);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55287a(LifecyclePanel lifecyclePanel) {
            super(0);
            this.f126400a = lifecyclePanel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1205n invoke() {
            return new C1205n(this.f126400a);
        }
    }

    @Override // androidx.lifecycle.AbstractC1204m
    public AbstractC1196i getLifecycle() {
        return mo91153a();
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_CREATE)
    public void onCreate() {
        this.f126396a = false;
        mo91153a().mo4016a(AbstractC1196i.EnumC1198a.ON_CREATE);
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public void onDestroy() {
        mo91153a().mo4016a(AbstractC1196i.EnumC1198a.ON_DESTROY);
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_PAUSE)
    public void onPause() {
        this.f126398s = false;
        mo91153a().mo4016a(AbstractC1196i.EnumC1198a.ON_PAUSE);
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_RESUME)
    public void onResume() {
        this.f126398s = true;
        mo91153a().mo4016a(AbstractC1196i.EnumC1198a.ON_RESUME);
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_START)
    public void onStart() {
        mo91153a().mo4016a(AbstractC1196i.EnumC1198a.ON_START);
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_STOP)
    public void onStop() {
        this.f126396a = true;
        mo91153a().mo4016a(AbstractC1196i.EnumC1198a.ON_STOP);
    }

    public LifecyclePanel(AbstractC1204m mVar) {
        C89219l.m154721d(mVar, "");
        this.f126399t = mVar;
    }
}
