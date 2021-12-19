package com.p2082ss.android.ugc.aweme.share.improve.p3755a;

import android.content.Context;
import android.content.DialogInterface;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.app.api.p2319b.C33615a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.share.improve.p3758c.C69123a;
import com.p2082ss.android.ugc.aweme.share.p3763k.p3764a.C69274a;
import com.p2082ss.android.ugc.aweme.share.p3763k.p3765b.AbstractC69278a;
import com.p2082ss.android.ugc.aweme.share.p3763k.p3765b.C69280c;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.as */
public final class C69006as implements AbstractC69278a, AbstractC69693h {

    /* renamed from: a */
    public final C69280c f154351a = new C69280c(new C69274a(), this);

    /* renamed from: b */
    public final Aweme f154352b;

    /* renamed from: c */
    private final String f154353c;

    static {
        Covode.recordClassIndex(81320);
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: b */
    public final int mo61918b() {
        return R.string.fbx;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: c */
    public final String mo61919c() {
        return "restrict";
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    public final int co_() {
        return 2131233811;
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

    @Override // com.p2082ss.android.ugc.aweme.share.p3763k.p3765b.AbstractC69278a
    /* renamed from: h */
    public final void mo109516h() {
        C13628n.m24506a(C17867d.m33078a(), (int) R.string.fc0);
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

    @Override // com.p2082ss.android.ugc.aweme.share.p3763k.p3765b.AbstractC69278a
    /* renamed from: a */
    public final void mo109515a(Exception exc) {
        C33615a.m68848a(C17867d.m33078a(), (Throwable) exc, (int) R.string.g1i);
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.as$b */
    static final class DialogInterface$OnClickListenerC69008b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC69008b f154355a = new DialogInterface$OnClickListenerC69008b();

        static {
            Covode.recordClassIndex(81322);
        }

        DialogInterface$OnClickListenerC69008b() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.as$a */
    static final class DialogInterface$OnClickListenerC69007a implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C69006as f154354a;

        static {
            Covode.recordClassIndex(81321);
        }

        DialogInterface$OnClickListenerC69007a(C69006as asVar) {
            this.f154354a = asVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f154354a.f154351a.mo109588a(this.f154354a.f154352b.getAid());
            dialogInterface.dismiss();
        }
    }

    public C69006as(Aweme aweme, String str) {
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(str, "");
        this.f154352b = aweme;
        this.f154353c = str;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: a */
    public final void mo61915a(Context context, SharePackage sharePackage) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(sharePackage, "");
        if (C69123a.m122222a(this, context, this.f154352b, this.f154353c)) {
            new C17197a.C17200a(context).mo27189a(R.string.fbw).mo27190a(R.string.fbv, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC69007a(this), false).mo27195b(R.string.a8y, (DialogInterface.OnClickListener) DialogInterface$OnClickListenerC69008b.f154355a, false).mo27193a().mo27184b();
        }
    }
}
