package com.p2082ss.android.ugc.aweme.qrcode.p3657f;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.p1845a.p1846a.C24182c;
import com.facebook.drawee.p1845a.p1846a.C24185e;
import com.facebook.drawee.p1854e.C24229q;
import com.facebook.drawee.p1855f.C24246a;
import com.facebook.imagepipeline.p1880e.C24428k;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.qrcode.C66414j;
import com.p2082ss.android.ugc.aweme.qrcode.p3655d.C66391b;
import com.p2082ss.android.ugc.aweme.qrcode.p3655d.C66396e;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.qrcode.f.b */
public final class C66408b extends C66407a {
    static {
        Covode.recordClassIndex(77940);
    }

    @Override // com.p2082ss.android.ugc.aweme.qrcode.view.AbstractC66469b
    /* renamed from: a */
    public final C66391b mo105326a() {
        return new C66396e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ BitmapDrawable mo105328b() {
        try {
            if (this.f149431a.mo105378a()) {
                return new BitmapDrawable(getResources(), this.f149431a.mo105379d().getAbsolutePath());
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public C66408b(Context context) {
        super(context);
    }

    @Override // com.p2082ss.android.ugc.aweme.qrcode.presenter.AbstractC66419a, com.p2082ss.android.ugc.aweme.qrcode.p3657f.C66407a
    /* renamed from: a */
    public final void mo105320a(Exception exc) {
        if (!this.f149435e) {
            super.mo105320a(exc);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ Object mo105327a(C1731i iVar) {
        if (iVar.mo5545d() == null) {
            return null;
        }
        ((C24246a) this.f149432b.getHierarchy()).mo39961b(0);
        ((C24246a) this.f149432b.getHierarchy()).mo39957a((Drawable) iVar.mo5545d(), C24229q.AbstractC24231b.f57458h);
        this.f149436f = true;
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.qrcode.p3657f.C66407a, com.p2082ss.android.ugc.aweme.qrcode.view.AbstractC66469b
    public final void setData(C66414j jVar) {
        super.setData(jVar);
        if (this.f149431a.mo105378a()) {
            this.f149435e = true;
            Uri fromFile = Uri.fromFile(this.f149431a.mo105379d());
            C24428k.m46551a().mo40247e().mo40228a(fromFile);
            RemoteImageView remoteImageView = this.f149432b;
            C24185e a = C24182c.m45843b().mo39799b(fromFile);
            a.f57309m = this.f149432b.getController();
            a.f57303g = this.f149437g;
            remoteImageView.setController(a.mo39827e());
            if (this.f149433c != null) {
                this.f149433c.mo105297c();
            }
            C1731i.m5640b(new CallableC66409c(this), C1731i.f5562a).mo5534a(new C66410d(this), C1731i.f5564c, null);
        }
    }
}
