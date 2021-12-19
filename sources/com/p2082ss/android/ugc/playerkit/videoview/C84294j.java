package com.p2082ss.android.ugc.playerkit.videoview;

import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.playerkit.model.C84199c;

/* renamed from: com.ss.android.ugc.playerkit.videoview.j */
public final class C84294j implements AbstractC84293i {

    /* renamed from: a */
    public AbstractC84293i f188495a;

    static {
        Covode.recordClassIndex(98209);
    }

    @Override // com.p2082ss.android.ugc.playerkit.videoview.AbstractC84293i
    /* renamed from: a */
    public final View mo129311a() {
        return this.f188495a.mo129311a();
    }

    @Override // com.p2082ss.android.ugc.playerkit.videoview.AbstractC84293i
    /* renamed from: b */
    public final Surface mo129313b() {
        return this.f188495a.mo129313b();
    }

    @Override // com.p2082ss.android.ugc.playerkit.videoview.AbstractC84293i
    /* renamed from: c */
    public final boolean mo129315c() {
        return this.f188495a.mo129315c();
    }

    @Override // com.p2082ss.android.ugc.playerkit.videoview.AbstractC84293i
    /* renamed from: d */
    public final void mo129316d() {
        this.f188495a.mo129316d();
    }

    @Override // com.p2082ss.android.ugc.playerkit.videoview.AbstractC84293i
    /* renamed from: e */
    public final int mo129317e() {
        return this.f188495a.mo129317e();
    }

    @Override // com.p2082ss.android.ugc.playerkit.videoview.AbstractC84293i
    /* renamed from: f */
    public final boolean mo129318f() {
        return this.f188495a.mo129318f();
    }

    @Override // com.p2082ss.android.ugc.playerkit.videoview.AbstractC84293i
    /* renamed from: g */
    public final void mo129319g() {
        this.f188495a.mo129319g();
    }

    @Override // com.p2082ss.android.ugc.playerkit.videoview.AbstractC84293i
    /* renamed from: h */
    public final void mo129320h() {
        this.f188495a.mo129320h();
    }

    @Override // com.p2082ss.android.ugc.playerkit.videoview.AbstractC84293i
    /* renamed from: a */
    public final void mo129312a(AbstractC84295k kVar) {
        this.f188495a.mo129312a(kVar);
    }

    @Override // com.p2082ss.android.ugc.playerkit.videoview.AbstractC84293i
    /* renamed from: b */
    public final void mo129314b(AbstractC84295k kVar) {
        this.f188495a.mo129314b(kVar);
    }

    /* renamed from: a */
    public static C84294j m144980a(ViewGroup viewGroup) {
        C84294j jVar = new C84294j();
        C84199c.f187979a.isUseSurfaceControl();
        C84199c.f187979a.isUseSurfaceView();
        jVar.f188495a = new C84289f(viewGroup);
        jVar.mo129311a().setTag(jVar);
        return jVar;
    }

    /* renamed from: a */
    public static C84294j m144981a(KeepSurfaceTextureView keepSurfaceTextureView) {
        Object tag = keepSurfaceTextureView.getTag();
        if (tag instanceof C84294j) {
            return (C84294j) tag;
        }
        C84294j jVar = new C84294j();
        jVar.f188495a = new C84289f(keepSurfaceTextureView);
        keepSurfaceTextureView.setTag(jVar);
        return jVar;
    }
}
