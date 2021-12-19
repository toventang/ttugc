package com.p2082ss.android.ugc.aweme.detail.p2742a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.detail.AbstractC41241j;
import com.p2082ss.android.ugc.aweme.p3043g.p3044a.AbstractC52856g;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.detail.a.b */
public final class C41104b implements AbstractC52856g {

    /* renamed from: a */
    public final ViewGroup f96087a;

    /* renamed from: b */
    public final AbstractC41241j f96088b;

    /* renamed from: c */
    public boolean f96089c;

    /* renamed from: d */
    public boolean f96090d;

    /* renamed from: e */
    public final Context f96091e;

    /* renamed from: f */
    public final ViewGroup f96092f;

    /* renamed from: g */
    private boolean f96093g = true;

    static {
        Covode.recordClassIndex(48979);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3043g.p3044a.AbstractC52856g
    /* renamed from: f */
    public final void mo70360f() {
        m82798g();
    }

    @Override // com.p2082ss.android.ugc.aweme.p3043g.p3044a.AbstractC52856g
    /* renamed from: b */
    public final void mo70356b() {
        AbstractC41241j.C41242a.m83125b(this.f96088b);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3043g.p3044a.AbstractC52856g
    /* renamed from: c */
    public final void mo70357c() {
        AbstractC41241j.C41242a.m83124a(this.f96088b);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3043g.p3044a.AbstractC52856g
    /* renamed from: a */
    public final void mo70355a() {
        this.f96087a.setVisibility(8);
        this.f96093g = false;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3043g.p3044a.AbstractC52856g
    /* renamed from: d */
    public final void mo70358d() {
        if (this.f96090d) {
            m82799h();
        } else {
            m82798g();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3043g.p3044a.AbstractC52856g
    /* renamed from: e */
    public final void mo70359e() {
        if (this.f96090d) {
            m82798g();
        } else {
            m82799h();
        }
    }

    /* renamed from: g */
    private void m82798g() {
        if (this.f96093g && !this.f96089c) {
            this.f96087a.setVisibility(0);
            this.f96087a.startAnimation(C41103a.m82796a());
            this.f96089c = true;
            AbstractC41241j.C41242a.m83124a(this.f96088b);
        }
    }

    /* renamed from: h */
    private void m82799h() {
        if (this.f96093g && this.f96089c) {
            AbstractC41241j.C41242a.m83125b(this.f96088b);
            this.f96087a.startAnimation(C41103a.m82797b());
            this.f96087a.setVisibility(8);
            this.f96089c = false;
        }
    }

    public C41104b(Context context, ViewGroup viewGroup) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(viewGroup, "");
        this.f96091e = context;
        this.f96092f = viewGroup;
        View findViewById = viewGroup.findViewById(R.id.e6q);
        C89219l.m154716b(findViewById, "");
        ViewGroup viewGroup2 = (ViewGroup) findViewById;
        this.f96087a = viewGroup2;
        this.f96088b = new C41105c(context, viewGroup2);
        this.f96089c = true;
    }
}
