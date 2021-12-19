package com.p2082ss.android.ugc.aweme.share.improve.p3755a;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.http.p2146a.p2149b.C29934d;
import com.p2082ss.android.ugc.aweme.app.api.p2319b.C33615a;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.commerce.C37437a;
import com.p2082ss.android.ugc.aweme.commercialize.event.C37840h;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.net.AbstractC61331d;
import com.p2082ss.android.ugc.aweme.net.C61305b;
import com.p2082ss.android.ugc.aweme.net.EnumC61379i;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.share.api.C68875a;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.l */
public final class C69085l implements AbstractC61331d<Object>, AbstractC69693h {

    /* renamed from: b */
    public static final C69086a f154517b = new C69086a((byte) 0);

    /* renamed from: a */
    public final Aweme f154518a;

    static {
        Covode.recordClassIndex(81399);
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: c */
    public final String mo61919c() {
        return "top";
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

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.l$a */
    public static final class C69086a {
        static {
            Covode.recordClassIndex(81400);
        }

        private C69086a() {
        }

        public /* synthetic */ C69086a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: b */
    public final int mo61918b() {
        if (this.f154518a.isTop()) {
            return R.string.dp_;
        }
        return R.string.dp8;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    public final int co_() {
        if (!this.f154518a.isTop()) {
            return R.raw.icon_2pt_pin;
        }
        return R.raw.icon_2pt_pin_fill;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: g */
    public final int mo61924g() {
        if (!this.f154518a.isTop()) {
            return R.raw.icon_pin;
        }
        return R.raw.icon_pin_fill;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: f */
    public final boolean mo61923f() {
        C37437a commerceVideoAuthInfo = this.f154518a.getCommerceVideoAuthInfo();
        if (commerceVideoAuthInfo == null || commerceVideoAuthInfo.getDarkPostStatus() != 1) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.net.AbstractC61331d
    /* renamed from: a */
    public final void mo60108a() {
        int i;
        String str;
        Aweme aweme = this.f154518a;
        aweme.setIsTop(!aweme.isTop());
        Context a = C17867d.m33078a();
        if (this.f154518a.isTop()) {
            i = R.string.dp9;
        } else {
            i = R.string.dpa;
        }
        String string = a.getString(i);
        C89219l.m154716b(string, "");
        new C79459a(a).mo123052a(string).mo123053a();
        C33744d a2 = new C33744d().mo59983a("group_id", this.f154518a.getAid());
        User author = this.f154518a.getAuthor();
        C89219l.m154716b(author, "");
        C33744d a3 = a2.mo59983a("author_id", author.getUid()).mo59983a("enter_from", "personal_homepage");
        if (this.f154518a.isTop()) {
            str = "top";
        } else {
            str = "top_cancel";
        }
        C39162r.m79460a("click_video_top", a3.mo59983a("final_status", str).f79943a);
        AbstractC81915c.m141874a(new C37840h());
    }

    public C69085l(Aweme aweme) {
        C89219l.m154721d(aweme, "");
        this.f154518a = aweme;
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

    @Override // com.p2082ss.android.ugc.aweme.net.AbstractC61331d
    /* renamed from: a */
    public final void mo60109a(Exception exc) {
        String str;
        C33615a.m68848a(C17867d.m33078a(), (Throwable) exc, (int) R.string.dcq);
        C33744d a = new C33744d().mo59983a("group_id", this.f154518a.getAid());
        User author = this.f154518a.getAuthor();
        C89219l.m154716b(author, "");
        C33744d a2 = a.mo59983a("author_id", author.getUid()).mo59983a("enter_from", "personal_homepage");
        if (this.f154518a.isTop()) {
            str = "top";
        } else {
            str = "top_cancel";
        }
        C39162r.m79460a("click_video_top", a2.mo59983a("final_status", str).f79943a);
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: a */
    public final void mo61915a(Context context, SharePackage sharePackage) {
        String str;
        C89219l.m154721d(context, "");
        C89219l.m154721d(sharePackage, "");
        if (!this.f154518a.isPrivate() || this.f154518a.isTop()) {
            C37437a commerceVideoAuthInfo = this.f154518a.getCommerceVideoAuthInfo();
            if (commerceVideoAuthInfo == null || commerceVideoAuthInfo.getDarkPostStatus() != 1 || this.f154518a.isTop()) {
                String aid = this.f154518a.getAid();
                boolean isTop = true ^ this.f154518a.isTop();
                ArrayList arrayList = new ArrayList();
                arrayList.add(new C29934d("item_id", aid));
                if (isTop) {
                    str = C68875a.f154049a;
                } else {
                    str = C68875a.f154050b;
                }
                C61305b bVar = new C61305b(str, EnumC61379i.POST, arrayList, String.class);
                bVar.f139225a = this;
                bVar.f139231g = false;
                bVar.mo98934a(C17867d.m33078a());
                return;
            }
            new C79459a(context).mo123050a(R.string.b3w).mo123053a();
            return;
        }
        new C79459a(context).mo123050a(R.string.eth).mo123053a();
    }
}
