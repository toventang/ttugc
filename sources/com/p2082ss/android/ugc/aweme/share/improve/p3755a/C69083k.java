package com.p2082ss.android.ugc.aweme.share.improve.p3755a;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50556u;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3252c.C56216k;
import com.p2082ss.android.ugc.aweme.share.improve.p3758c.C69123a;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.k */
public class C69083k implements AbstractC69693h {

    /* renamed from: a */
    public static final C69084a f154513a = new C69084a((byte) 0);

    /* renamed from: b */
    private final Aweme f154514b;

    /* renamed from: c */
    private final String f154515c;

    /* renamed from: d */
    private String f154516d;

    static {
        Covode.recordClassIndex(81397);
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: c */
    public final String mo61919c() {
        return "duet";
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    public final int co_() {
        return R.raw.icon_2pt_duet;
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
        return R.raw.icon_duet;
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.k$a */
    public static final class C69084a {
        static {
            Covode.recordClassIndex(81398);
        }

        private C69084a() {
        }

        public /* synthetic */ C69084a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: b */
    public int mo61918b() {
        if (AVExternalServiceImpl.m113114a().configService().avsettingsConfig().showDuetWithReact()) {
            return R.string.bdn;
        }
        return R.string.bcz;
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0042 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0045 A[RETURN] */
    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo61923f() {
        /*
            r7 = this;
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f154514b
            boolean r6 = com.p2082ss.android.ugc.aweme.feed.p2979x.C50545m.m94762a(r0)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f154514b
            boolean r5 = com.p2082ss.android.ugc.aweme.utils.C80635y.m139808c(r0)
            boolean r0 = com.p2082ss.android.ugc.aweme.language.C58071d.m104909c()
            r4 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0043
            com.ss.android.ugc.aweme.app.s r0 = com.p2082ss.android.ugc.aweme.app.C33842s.C33843a.f80132a
            com.ss.android.ugc.aweme.app.aj r1 = r0.mo60071o()
            java.lang.String r0 = ""
            p4600h.p4611f.p4613b.C89219l.m154716b(r1, r0)
            java.lang.Object r0 = r1.mo59941c()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0043
            r2 = 1
        L_0x002c:
            com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService r1 = com.p2082ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl.m77578f()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f154514b
            com.ss.android.ugc.aweme.music.model.Music r0 = r0.getMusic()
            boolean r1 = r1.mo66514b(r0)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f154514b
            boolean r0 = com.p2082ss.android.ugc.aweme.feed.model.DuetHelperKt.setGrayForDuet(r0, r6, r5, r2, r1)
            if (r0 != 0) goto L_0x0045
            return r4
        L_0x0043:
            r2 = 0
            goto L_0x002c
        L_0x0045:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.share.improve.p3755a.C69083k.mo61923f():boolean");
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

    public /* synthetic */ C69083k(Aweme aweme, String str) {
        this(aweme, str, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: a */
    public final void mo61915a(Context context, SharePackage sharePackage) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(sharePackage, "");
        String str = this.f154516d;
        if ((str == null || str.length() == 0) && C56216k.m102133c()) {
            this.f154516d = "click_more_duet";
        }
        if (C69123a.m122222a(this, context, this.f154514b, this.f154515c)) {
            C50556u.m94784a(this.f154514b, context, this.f154516d, this.f154515c, false, 24);
        }
    }

    public C69083k(Aweme aweme, String str, String str2) {
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f154514b = aweme;
        this.f154515c = str;
        this.f154516d = str2;
    }
}
