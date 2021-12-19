package com.p2082ss.android.ugc.aweme.autoplay.player.live;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b;
import com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51043a;
import com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51044b;
import com.p2082ss.android.ugc.aweme.flowfeed.utils.AbstractC51064i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.autoplay.player.live.i */
public final class C34222i implements AbstractC34186b.AbstractC34189c {

    /* renamed from: a */
    public C34205d f80913a;

    /* renamed from: b */
    public AbstractC34186b.AbstractC34189c f80914b;

    static {
        Covode.recordClassIndex(41157);
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34189c
    public final void an_() {
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34189c
    public final void bg_() {
        AbstractC34186b.AbstractC34189c cVar = this.f80914b;
        if (cVar != null) {
            cVar.bg_();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34189c
    public final void bi_() {
        AbstractC34186b.AbstractC34189c cVar = this.f80914b;
        if (cVar != null) {
            cVar.bi_();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34189c
    /* renamed from: e */
    public final void mo60344e() {
        AbstractC34186b.AbstractC34189c cVar = this.f80914b;
        if (cVar != null) {
            cVar.mo60344e();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34189c
    public final boolean aZ_() {
        AbstractC34186b.AbstractC34189c cVar = this.f80914b;
        if (cVar != null) {
            return cVar.aZ_();
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34189c
    /* renamed from: a */
    public final void mo60340a(long j) {
        AbstractC34186b.AbstractC34189c cVar = this.f80914b;
        if (cVar != null) {
            cVar.mo60340a(j);
        }
    }

    /* renamed from: a */
    public final void mo60580a(AbstractC89171a<C34205d> aVar) {
        C89219l.m154721d(aVar, "");
        C34205d invoke = aVar.invoke();
        this.f80913a = invoke;
        this.f80914b = new C34223j(this.f80913a, invoke.getDataProvider());
    }

    /* renamed from: b */
    public final void mo60581b(AbstractC89171a<? extends AbstractC51043a> aVar) {
        C34215e dataProvider;
        C89219l.m154721d(aVar, "");
        C34205d dVar = this.f80913a;
        if (dVar != null && (dataProvider = dVar.getDataProvider()) != null) {
            dataProvider.f80892a = (AbstractC51043a) aVar.invoke();
        }
    }

    /* renamed from: c */
    public final void mo60582c(AbstractC89171a<? extends AbstractC51044b> aVar) {
        C34215e dataProvider;
        C89219l.m154721d(aVar, "");
        C34205d dVar = this.f80913a;
        if (dVar != null && (dataProvider = dVar.getDataProvider()) != null) {
            dataProvider.f80893b = (AbstractC51044b) aVar.invoke();
        }
    }

    /* renamed from: d */
    public final void mo60583d(AbstractC89171a<? extends AbstractC51064i> aVar) {
        C34215e dataProvider;
        C89219l.m154721d(aVar, "");
        C34205d dVar = this.f80913a;
        if (dVar != null && (dataProvider = dVar.getDataProvider()) != null) {
            dataProvider.f80895d = (AbstractC51064i) aVar.invoke();
        }
    }
}
