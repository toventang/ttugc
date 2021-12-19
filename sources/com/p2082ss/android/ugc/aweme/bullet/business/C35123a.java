package com.p2082ss.android.ugc.aweme.bullet.business;

import android.app.Activity;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.kit.web.p1160b.AbstractC16485a;
import com.bytedance.ies.bullet.service.base.AbstractC16654o;
import com.bytedance.ies.bullet.service.p1172f.p1173a.C16721b;
import com.p2082ss.android.ugc.aweme.bullet.business.BulletBusinessService;
import com.p2082ss.android.ugc.aweme.bullet.module.p2419ad.C35186c;
import java.lang.ref.WeakReference;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.business.a */
public final class C35123a implements AbstractC35125b {

    /* renamed from: a */
    public C16721b f82900a;

    /* renamed from: b */
    C35186c f82901b;

    /* renamed from: c */
    AbstractC16485a f82902c;

    /* renamed from: d */
    WebView f82903d;

    /* renamed from: e */
    AbstractC16654o f82904e;

    /* renamed from: f */
    private WeakReference<Activity> f82905f;

    /* renamed from: g */
    private boolean f82906g = true;

    /* renamed from: h */
    private final BulletBusinessService f82907h = new BulletBusinessService(this);

    static {
        Covode.recordClassIndex(42278);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.business.AbstractC35125b
    /* renamed from: c */
    public final void mo61980c() {
        this.f82906g = false;
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.business.AbstractC35125b
    /* renamed from: b */
    public final C16721b mo61979b() {
        return this.f82900a;
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.business.AbstractC35125b
    /* renamed from: d */
    public final boolean mo61981d() {
        return this.f82906g;
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.business.AbstractC35125b
    /* renamed from: a */
    public final Activity mo61971a() {
        WeakReference<Activity> weakReference = this.f82905f;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.business.AbstractC35125b
    /* renamed from: a */
    public final void mo61974a(WebView webView) {
        this.f82903d = webView;
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.business.AbstractC35125b
    /* renamed from: a */
    public final void mo61973a(Activity activity) {
        this.f82905f = new WeakReference<>(activity);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.business.AbstractC35125b
    /* renamed from: a */
    public final <T extends BulletBusinessService.Business> T mo61972a(Class<T> cls) {
        C89219l.m154721d(cls, "");
        return (T) this.f82907h.mo61948a(cls);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.business.AbstractC35125b
    /* renamed from: a */
    public final void mo61975a(AbstractC16485a aVar) {
        this.f82902c = aVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.business.AbstractC35125b
    /* renamed from: a */
    public final void mo61976a(AbstractC16654o oVar) {
        this.f82904e = oVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.business.AbstractC35125b
    /* renamed from: a */
    public final void mo61977a(C16721b bVar) {
        C89219l.m154721d(bVar, "");
        this.f82900a = bVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.business.AbstractC35125b
    /* renamed from: a */
    public final void mo61978a(C35186c cVar) {
        this.f82901b = cVar;
    }
}
