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

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.ui.base.Widget */
public class Widget implements AbstractC1204m, AbstractC33974au {

    /* renamed from: a */
    private boolean f126401a;

    /* renamed from: b */
    private final AbstractC89244h f126402b = C89250i.m154773a((AbstractC89171a) new C55288a(this));

    static {
        Covode.recordClassIndex(65044);
    }

    /* renamed from: b */
    private final C1205n mo92904b() {
        return (C1205n) this.f126402b.getValue();
    }

    /* renamed from: a */
    public void mo92300a() {
        this.f126401a = true;
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_CREATE) {
            create();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_START) {
            start();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_RESUME) {
            resume();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_PAUSE) {
            pause();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_STOP) {
            stop();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            destroy();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.ui.base.Widget$a */
    static final class C55288a extends AbstractC89220m implements AbstractC89171a<C1205n> {

        /* renamed from: a */
        final /* synthetic */ Widget f126403a;

        static {
            Covode.recordClassIndex(65045);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55288a(Widget widget) {
            super(0);
            this.f126403a = widget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1205n invoke() {
            return new C1205n(this.f126403a);
        }
    }

    @Override // androidx.lifecycle.AbstractC1204m
    public AbstractC1196i getLifecycle() {
        return mo92904b();
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_CREATE)
    public final void create() {
        this.f126401a = false;
        mo92904b().mo4016a(AbstractC1196i.EnumC1198a.ON_CREATE);
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void destroy() {
        mo92300a();
        mo92904b().mo4016a(AbstractC1196i.EnumC1198a.ON_DESTROY);
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_PAUSE)
    public final void pause() {
        mo92904b().mo4016a(AbstractC1196i.EnumC1198a.ON_PAUSE);
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_RESUME)
    public final void resume() {
        mo92904b().mo4016a(AbstractC1196i.EnumC1198a.ON_RESUME);
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_START)
    public final void start() {
        mo92904b().mo4016a(AbstractC1196i.EnumC1198a.ON_START);
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_STOP)
    public final void stop() {
        mo92904b().mo4016a(AbstractC1196i.EnumC1198a.ON_STOP);
    }
}
