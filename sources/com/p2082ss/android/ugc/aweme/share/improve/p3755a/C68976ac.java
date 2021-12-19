package com.p2082ss.android.ugc.aweme.share.improve.p3755a;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commerce.C37437a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2949i.AbstractC49691s;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49672ag;
import com.p2082ss.android.ugc.aweme.mix.services.MixFeedService;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80636z;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.ac */
public final class C68976ac implements AbstractC69693h {

    /* renamed from: a */
    public static final C68977a f154304a = new C68977a((byte) 0);

    /* renamed from: b */
    private final WeakReference<AbstractC49691s<C49672ag>> f154305b;

    /* renamed from: c */
    private final Aweme f154306c;

    static {
        Covode.recordClassIndex(81290);
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: c */
    public final String mo61919c() {
        return "play_list";
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: d */
    public final boolean mo61921d() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: e */
    public final boolean mo61922e() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.ac$a */
    public static final class C68977a {
        static {
            Covode.recordClassIndex(81291);
        }

        private C68977a() {
        }

        public /* synthetic */ C68977a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: b */
    public final int mo61918b() {
        if (!MixFeedService.m109435k().mo97324a(this.f154306c) || !C80636z.m139817b(this.f154306c)) {
            return R.string.pa;
        }
        return R.string.f_p;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    public final int co_() {
        if (!MixFeedService.m109435k().mo97324a(this.f154306c) || !C80636z.m139817b(this.f154306c)) {
            return R.raw.icon_2pt_playlist;
        }
        return R.raw.icon_2pt_playlist_fill;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: f */
    public final boolean mo61923f() {
        if (!C80636z.m139817b(this.f154306c) || this.f154306c.playlistBlocked) {
            return false;
        }
        C37437a commerceVideoAuthInfo = this.f154306c.getCommerceVideoAuthInfo();
        if (commerceVideoAuthInfo == null || commerceVideoAuthInfo.getDarkPostStatus() != 1) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: g */
    public final int mo61924g() {
        if (!MixFeedService.m109435k().mo97324a(this.f154306c) || !C80636z.m139817b(this.f154306c)) {
            return R.raw.icon_playlist;
        }
        return R.raw.icon_playlist_fill;
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

    public C68976ac(Aweme aweme, AbstractC49691s<C49672ag> sVar) {
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(sVar, "");
        this.f154306c = aweme;
        this.f154305b = new WeakReference<>(sVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: a */
    public final void mo61915a(Context context, SharePackage sharePackage) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(sharePackage, "");
        if (this.f154306c.playlistBlocked) {
            MixFeedService.m109435k().mo97310a(context);
            return;
        }
        C37437a commerceVideoAuthInfo = this.f154306c.getCommerceVideoAuthInfo();
        if (commerceVideoAuthInfo != null && commerceVideoAuthInfo.getDarkPostStatus() == 1) {
            new C79459a(context).mo123050a(R.string.b3x).mo123053a();
        } else if (!C80636z.m139817b(this.f154306c)) {
            new C79459a(context).mo123050a(R.string.gfy).mo123053a();
        } else if (MixFeedService.m109435k().mo97324a(this.f154306c)) {
            AbstractC49691s<C49672ag> sVar = this.f154305b.get();
            if (sVar != null) {
                sVar.mo63634a(new C49672ag(56, this.f154306c));
            }
        } else {
            AbstractC49691s<C49672ag> sVar2 = this.f154305b.get();
            if (sVar2 != null) {
                sVar2.mo63634a(new C49672ag(55, this.f154306c));
            }
        }
    }
}
