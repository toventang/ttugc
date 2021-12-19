package com.p2082ss.android.ugc.aweme.share.improve.p3755a;

import android.content.Context;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.C18288a;
import com.p2082ss.android.ugc.aweme.crossplatform.p2706a.AbstractC40521c;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.aj */
public final class C68995aj implements AbstractC69693h {

    /* renamed from: a */
    private final AbstractC40521c f154336a;

    /* renamed from: b */
    private final C18288a f154337b;

    /* renamed from: c */
    private final WebView f154338c;

    static {
        Covode.recordClassIndex(81309);
    }

    public C68995aj() {
        this(null, null, null, 7);
    }

    public C68995aj(AbstractC40521c cVar) {
        this(cVar, null, null, 6);
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: b */
    public final int mo61918b() {
        return R.string.f96;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: c */
    public final String mo61919c() {
        return "refresh";
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    public final int co_() {
        return 2131232631;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: d */
    public final boolean mo61921d() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: e */
    public final boolean mo61922e() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: f */
    public final boolean mo61923f() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: g */
    public final int mo61924g() {
        return co_();
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: a */
    public final void mo61914a(Context context) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(context, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: a */
    public final void mo61916a(ImageView imageView) {
        C89219l.m154721d(imageView, "");
        C89219l.m154721d(imageView, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: a */
    public final void mo61917a(TextView textView) {
        C89219l.m154721d(textView, "");
        AbstractC69693h.C69694a.m123110a(this, textView);
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: a */
    public final void mo61915a(Context context, SharePackage sharePackage) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(sharePackage, "");
        AbstractC40521c cVar = this.f154336a;
        if (cVar != null) {
            cVar.mo67259g();
            return;
        }
        C18288a aVar = this.f154337b;
        if (aVar != null) {
            WebView webView = aVar.f43654d;
            if (webView != null) {
                webView.reload();
                return;
            }
            return;
        }
        WebView webView2 = this.f154338c;
        if (webView2 != null) {
            webView2.reload();
        }
    }

    private C68995aj(AbstractC40521c cVar, C18288a aVar, WebView webView) {
        this.f154336a = cVar;
        this.f154337b = aVar;
        this.f154338c = webView;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C68995aj(AbstractC40521c cVar, C18288a aVar, WebView webView, int i) {
        this((i & 1) != 0 ? null : cVar, (i & 2) != 0 ? null : aVar, (i & 4) != 0 ? null : webView);
    }
}
