package com.p2082ss.android.ugc.aweme.qrcode.view;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.p1845a.p1846a.C24182c;
import com.facebook.drawee.p1845a.p1846a.C24185e;
import com.facebook.drawee.p1851c.C24202c;
import com.facebook.imagepipeline.p1885j.AbstractC24457f;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.qrcode.C66414j;
import com.p2082ss.android.ugc.aweme.qrcode.p3655d.C66390a;
import com.p2082ss.android.ugc.aweme.qrcode.p3655d.C66391b;
import com.p2082ss.android.ugc.aweme.qrcode.presenter.AbstractC66419a;
import com.p2082ss.android.ugc.aweme.qrcode.presenter.C66452e;

/* renamed from: com.ss.android.ugc.aweme.qrcode.view.b */
public abstract class AbstractC66469b extends LinearLayout implements AbstractC66419a {

    /* renamed from: a */
    protected C66452e f149431a;

    /* renamed from: b */
    protected RemoteImageView f149432b;

    /* renamed from: c */
    protected AbstractC66472a f149433c;

    /* renamed from: d */
    protected C66414j f149434d;

    /* renamed from: e */
    protected boolean f149435e;

    /* renamed from: f */
    public boolean f149436f;

    /* renamed from: g */
    protected C24202c<AbstractC24457f> f149437g;

    /* renamed from: com.ss.android.ugc.aweme.qrcode.view.b$a */
    public interface AbstractC66472a {
        static {
            Covode.recordClassIndex(78008);
        }

        /* renamed from: a */
        void mo105295a();

        /* renamed from: b */
        void mo105296b();

        /* renamed from: c */
        void mo105297c();
    }

    static {
        Covode.recordClassIndex(78005);
    }

    public abstract void setData(String str);

    public abstract void setQRCodeCardSubtitleColor(int i);

    public abstract void setQRCodeCardTitleColor(int i);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C66391b mo105326a() {
        return new C66391b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo105422c() {
        AbstractC66472a aVar = this.f149433c;
        if (aVar != null) {
            aVar.mo105296b();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f149431a.mo62188b();
        this.f149433c = null;
    }

    public void setOnBindQrCodeListener(AbstractC66472a aVar) {
        this.f149433c = aVar;
    }

    public void setData(C66414j jVar) {
        this.f149434d = jVar;
        setData(jVar.objectId);
    }

    /* renamed from: a */
    public void mo105318a(Context context) {
        this.f149431a = new C66452e(mo105326a(), this);
        this.f149437g = new C24202c<AbstractC24457f>() {
            /* class com.p2082ss.android.ugc.aweme.qrcode.view.AbstractC66469b.C664701 */

            static {
                Covode.recordClassIndex(78006);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
            @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
            public final /* bridge */ /* synthetic */ void onFinalImageSet(String str, AbstractC24457f fVar, Animatable animatable) {
                AbstractC66469b.this.f149436f = true;
            }
        };
    }

    /* renamed from: a */
    public static String m118224a(UrlModel urlModel) {
        if (urlModel == null || urlModel.getUrlList() == null || urlModel.getUrlList().isEmpty()) {
            return "";
        }
        return urlModel.getUrlList().get(0);
    }

    /* renamed from: b */
    public final void mo105421b(final C66390a aVar) {
        if (aVar != null) {
            String a = m118224a(aVar.f149291a);
            if (C34577e.m70603a(Uri.parse(a))) {
                RemoteImageView remoteImageView = this.f149432b;
                C24185e a2 = C24182c.m45843b().mo39799b(Uri.parse(a));
                a2.f57309m = this.f149432b.getController();
                a2.f57303g = this.f149437g;
                remoteImageView.setController(a2.mo39827e());
                if (!this.f149431a.mo105378a()) {
                    this.f149431a.mo105377a(a);
                }
                AbstractC66472a aVar2 = this.f149433c;
                if (aVar2 != null) {
                    aVar2.mo105295a();
                    return;
                }
                return;
            }
            C34577e.m70590a(aVar.f149291a, new C34577e.AbstractC34582a() {
                /* class com.p2082ss.android.ugc.aweme.qrcode.view.AbstractC66469b.C664712 */

                static {
                    Covode.recordClassIndex(78007);
                }

                @Override // com.p2082ss.android.ugc.aweme.base.C34577e.AbstractC34582a
                /* renamed from: a */
                public final void mo61037a() {
                    RemoteImageView remoteImageView = AbstractC66469b.this.f149432b;
                    C24185e a = C24182c.m45843b().mo39799b(Uri.parse(AbstractC66469b.m118224a(aVar.f149291a)));
                    a.f57309m = AbstractC66469b.this.f149432b.getController();
                    a.f57303g = AbstractC66469b.this.f149437g;
                    remoteImageView.setController(a.mo39827e());
                    if (AbstractC66469b.this.f149433c != null) {
                        AbstractC66469b.this.f149433c.mo105295a();
                    }
                    AbstractC66469b.this.f149431a.mo105377a(AbstractC66469b.m118224a(aVar.f149291a));
                }

                @Override // com.p2082ss.android.ugc.aweme.base.C34577e.AbstractC34582a
                /* renamed from: a */
                public final void mo61038a(Exception exc) {
                    AbstractC66469b.this.mo105422c();
                }
            });
        }
    }

    public AbstractC66469b(Context context, AttributeSet attributeSet) {
        super(context, null, 0);
    }
}
