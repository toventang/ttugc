package com.p2082ss.android.ugc.aweme.share.improve.p3755a;

import android.content.Context;
import android.content.DialogInterface;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.uikit.dialog.DialogC18267b;
import com.p2082ss.android.ugc.aweme.app.api.p2319b.C33615a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.share.improve.p3758c.C69123a;
import com.p2082ss.android.ugc.aweme.share.improve.p3758c.C69128d;
import com.p2082ss.android.ugc.aweme.share.p3763k.p3764a.C69276b;
import com.p2082ss.android.ugc.aweme.share.p3763k.p3765b.AbstractC69279b;
import com.p2082ss.android.ugc.aweme.share.p3763k.p3765b.C69281d;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.d */
public final class C69042d implements AbstractC69279b, AbstractC69693h {

    /* renamed from: a */
    public final C69281d f154429a = new C69281d(new C69276b(), this);

    /* renamed from: b */
    public final Aweme f154430b;

    /* renamed from: c */
    private final String f154431c;

    static {
        Covode.recordClassIndex(81356);
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: b */
    public final int mo61918b() {
        return R.string.a61;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: c */
    public final String mo61919c() {
        return "blacklist";
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    public final int co_() {
        return 2131233806;
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

    @Override // com.p2082ss.android.ugc.aweme.share.p3763k.p3765b.AbstractC69279b
    /* renamed from: a */
    public final void mo109525a(Exception exc) {
        C33615a.m68848a(C17867d.m33078a(), (Throwable) exc, (int) R.string.g1i);
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.d$a */
    static final class DialogInterface$OnClickListenerC69043a implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C69042d f154432a;

        static {
            Covode.recordClassIndex(81357);
        }

        DialogInterface$OnClickListenerC69043a(C69042d dVar) {
            this.f154432a = dVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f154432a.f154429a.mo109589a(this.f154432a.f154430b.getAuthorUid());
            dialogInterface.dismiss();
        }
    }

    public C69042d(Aweme aweme, String str) {
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(str, "");
        this.f154430b = aweme;
        this.f154431c = str;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: a */
    public final void mo61915a(Context context, SharePackage sharePackage) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(sharePackage, "");
        if (C69123a.m122222a(this, context, this.f154430b, this.f154431c)) {
            String string = context.getResources().getString(R.string.a61);
            C89219l.m154716b(string, "");
            String string2 = context.getResources().getString(R.string.a62);
            C89219l.m154716b(string2, "");
            String string3 = context.getResources().getString(R.string.a61);
            C89219l.m154716b(string3, "");
            DialogInterface$OnClickListenerC69043a aVar = new DialogInterface$OnClickListenerC69043a(this);
            C89219l.m154721d(context, "");
            C89219l.m154721d(string, "");
            C89219l.m154721d(string2, "");
            C89219l.m154721d(string3, "");
            C89219l.m154721d(aVar, "");
            DialogC18267b.C18268a aVar2 = new DialogC18267b.C18268a(context);
            aVar2.mo29153a(string).mo29156b(string2).mo29154a(string3, aVar);
            C69128d.DialogInterface$OnClickListenerC69129a aVar3 = C69128d.DialogInterface$OnClickListenerC69129a.f154573a;
            aVar2.f43611a.f43580k = aVar2.f43611a.f43570a.getText(R.string.a8y);
            aVar2.f43611a.f43581l = aVar3;
            aVar2.mo29157b().show();
        }
    }
}
