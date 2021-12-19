package com.p2082ss.android.ugc.aweme.share.qrcode.view;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.p1845a.p1846a.C24182c;
import com.facebook.drawee.p1845a.p1846a.C24185e;
import com.facebook.drawee.p1851c.C24202c;
import com.facebook.imagepipeline.p1885j.AbstractC24457f;
import com.p2082ss.android.ugc.aweme.app.api.p2319b.C33615a;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.lancet.C58030k;
import com.p2082ss.android.ugc.aweme.qrcode.p3655d.C66390a;
import com.p2082ss.android.ugc.aweme.share.api.ShareQRCodeApi;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.qrcode.view.QRCodeSquareView */
public class QRCodeSquareView extends RemoteImageView {

    /* renamed from: a */
    String f155026a;

    /* renamed from: b */
    public boolean f155027b;

    /* renamed from: c */
    public String f155028c;

    /* renamed from: d */
    private final C24202c<AbstractC24457f> f155029d;

    static {
        Covode.recordClassIndex(81737);
    }

    public QRCodeSquareView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public final C24202c<AbstractC24457f> getImageLoadListener() {
        return this.f155029d;
    }

    public final String getQrCodeUrl() {
        return this.f155028c;
    }

    @Override // com.facebook.drawee.view.C24262c
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C58030k.m104850a(this);
    }

    /* renamed from: com.ss.android.ugc.aweme.share.qrcode.view.QRCodeSquareView$a */
    public static final class C69402a implements C34577e.AbstractC34582a {

        /* renamed from: a */
        final /* synthetic */ QRCodeSquareView f155030a;

        static {
            Covode.recordClassIndex(81738);
        }

        @Override // com.p2082ss.android.ugc.aweme.base.C34577e.AbstractC34582a
        /* renamed from: a */
        public final void mo61038a(Exception exc) {
        }

        @Override // com.p2082ss.android.ugc.aweme.base.C34577e.AbstractC34582a
        /* renamed from: a */
        public final void mo61037a() {
            QRCodeSquareView qRCodeSquareView = this.f155030a;
            C24185e a = C24182c.m45843b().mo39799b(Uri.parse(this.f155030a.f155028c));
            a.f57309m = this.f155030a.getController();
            a.f57303g = this.f155030a.getImageLoadListener();
            qRCodeSquareView.setController(a.mo39827e());
            C39162r.m79460a("qr_code_generate", new C33744d().mo59983a("qr_code_type", "general").mo59983a("enter_from", this.f155030a.f155026a).f79943a);
            C89219l.m154721d(this.f155030a.f155028c, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C69402a(QRCodeSquareView qRCodeSquareView) {
            this.f155030a = qRCodeSquareView;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.qrcode.view.QRCodeSquareView$b */
    public static final class C69403b extends C24202c<AbstractC24457f> {

        /* renamed from: a */
        final /* synthetic */ QRCodeSquareView f155031a;

        static {
            Covode.recordClassIndex(81739);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C69403b(QRCodeSquareView qRCodeSquareView) {
            this.f155031a = qRCodeSquareView;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
        @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
        public final /* bridge */ /* synthetic */ void onFinalImageSet(String str, AbstractC24457f fVar, Animatable animatable) {
            this.f155031a.f155027b = true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.qrcode.view.QRCodeSquareView$c */
    public static final class C69404c implements ShareQRCodeApi.AbstractC68872a {

        /* renamed from: a */
        final /* synthetic */ QRCodeSquareView f155032a;

        static {
            Covode.recordClassIndex(81740);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C69404c(QRCodeSquareView qRCodeSquareView) {
            this.f155032a = qRCodeSquareView;
        }

        @Override // com.p2082ss.android.ugc.aweme.share.api.ShareQRCodeApi.AbstractC68872a
        /* renamed from: a */
        public final void mo109446a(Exception exc) {
            C33615a.m68848a(this.f155032a.getContext(), (Throwable) exc, (int) R.string.g1i);
        }

        @Override // com.p2082ss.android.ugc.aweme.share.api.ShareQRCodeApi.AbstractC68872a
        /* renamed from: a */
        public final void mo109445a(C66390a aVar) {
            List<String> urlList;
            if (aVar != null) {
                QRCodeSquareView qRCodeSquareView = this.f155032a;
                UrlModel urlModel = aVar.f149291a;
                String str = "";
                if (!(urlModel == null || (urlList = urlModel.getUrlList()) == null || !(!urlList.isEmpty()))) {
                    String str2 = urlList.get(0);
                    C89219l.m154716b(str2, str);
                    str = str2;
                }
                qRCodeSquareView.f155028c = str;
                C34577e.m70590a(aVar.f149291a, new C69402a(qRCodeSquareView));
            }
        }
    }

    private /* synthetic */ QRCodeSquareView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* renamed from: a */
    public final void mo109654a(int i, String str, String str2) {
        C89219l.m154721d(str2, "");
        this.f155026a = str2;
        ShareQRCodeApi.m121544a(i, str, new C69404c(this));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private QRCodeSquareView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        this.f155028c = "";
        this.f155029d = new C69403b(this);
    }
}
