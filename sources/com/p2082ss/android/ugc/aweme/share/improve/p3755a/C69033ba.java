package com.p2082ss.android.ugc.aweme.share.improve.p3755a;

import android.app.Activity;
import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1664o.C22515g;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.p2082ss.android.ugc.aweme.share.ShareDependService;
import com.p2082ss.android.ugc.aweme.share.improve.p3758c.C69124b;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.ba */
public final class C69033ba implements AbstractC69693h {

    /* renamed from: a */
    public static final C69034a f154411a = new C69034a((byte) 0);

    /* renamed from: b */
    private final Aweme f154412b;

    /* renamed from: c */
    private final String f154413c;

    static {
        Covode.recordClassIndex(81347);
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: b */
    public final int mo61918b() {
        return R.string.fr6;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: c */
    public final String mo61919c() {
        return "stitch";
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    public final int co_() {
        return R.raw.icon_2pt_stitch;
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
    /* renamed from: g */
    public final int mo61924g() {
        return R.raw.icon_stitch;
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.ba$a */
    public static final class C69034a {
        static {
            Covode.recordClassIndex(81348);
        }

        private C69034a() {
        }

        public /* synthetic */ C69034a(byte b) {
            this();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007e, code lost:
        if (r0.getFollowStatus() == 2) goto L_0x0080;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e  */
    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo61923f() {
        /*
        // Method dump skipped, instructions count: 131
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.share.improve.p3755a.C69033ba.mo61923f():boolean");
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

    public C69033ba(Aweme aweme, String str) {
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(str, "");
        this.f154412b = aweme;
        this.f154413c = str;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: a */
    public final void mo61915a(Context context, SharePackage sharePackage) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(sharePackage, "");
        if (MSAdaptionService.m97895c().mo89375b(context)) {
            C22515g.m42471a(context);
            return;
        }
        Activity a = C69124b.m122223a(context);
        if (a != null) {
            ShareDependService.C68822a.m121324a().mo109337a(this.f154412b, a, this.f154413c);
        }
    }
}
