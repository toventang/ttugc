package com.p2082ss.android.ugc.aweme.share.improve.pkg;

import android.app.Activity;
import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.livesdkapi.C11755f;
import com.bytedance.android.livesdkapi.depend.p683e.C11666c;
import com.bytedance.android.livesdkapi.service.AbstractC11846d;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.k */
public final class C69268k implements AbstractC69693h {

    /* renamed from: a */
    private final Activity f154820a;

    /* renamed from: b */
    private final C11666c f154821b;

    static {
        Covode.recordClassIndex(81598);
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: c */
    public final String mo61919c() {
        return "share_setting";
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
    /* renamed from: b */
    public final int mo61918b() {
        AbstractC11846d a = C11755f.m20713a();
        if (a != null) {
            return a.mo13018c("share_setting");
        }
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    public final int co_() {
        AbstractC11846d a = C11755f.m20713a();
        if (a != null) {
            return a.mo13008b("share_setting");
        }
        return 0;
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

    public C69268k(Activity activity, C11666c cVar) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(cVar, "");
        this.f154820a = activity;
        this.f154821b = cVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: a */
    public final void mo61915a(Context context, SharePackage sharePackage) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(sharePackage, "");
        AbstractC11846d a = C11755f.m20713a();
        if (a != null) {
            a.mo13016b(this.f154820a);
        }
    }
}
