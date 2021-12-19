package com.p2082ss.android.ugc.aweme.profile.p3576ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartCircleImageView;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1710c.C23008e;
import com.facebook.drawee.p1851c.AbstractC24203d;
import com.facebook.imagepipeline.p1880e.C24428k;
import com.facebook.imagepipeline.p1885j.AbstractC24457f;
import com.p2082ss.android.common.p2132c.C29823c;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.account.p2233a.p2235b.C31376a;
import com.p2082ss.android.ugc.aweme.app.api.p2319b.C33615a;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.C34480a;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.base.p2379ui.CircleImageView;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.base.utils.C34717d;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.profile.edit.C63517a;
import com.p2082ss.android.ugc.aweme.profile.model.AvatarUri;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3575f.C63757a;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.C64314y;
import com.p2082ss.android.ugc.aweme.services.function.FunctionSupportService;
import com.p2082ss.android.ugc.aweme.services.function.IFunctionKey;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80416ez;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.ugc.trill.p4376e.C85084a;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.az */
public final class C64004az extends C64048bm implements AbstractC63984ap {

    /* renamed from: Y */
    private C63517a f145145Y;

    /* renamed from: Z */
    private boolean f145146Z = true;

    /* renamed from: a */
    RelativeLayout f145147a;

    /* renamed from: b */
    MusAvatarImageView f145148b;

    /* renamed from: c */
    TuxIconView f145149c;

    /* renamed from: d */
    ConstraintLayout f145150d;

    /* renamed from: e */
    SmartCircleImageView f145151e;

    /* renamed from: j */
    TuxTextView f145152j;

    /* renamed from: k */
    RelativeLayout f145153k;

    /* renamed from: l */
    TuxIconView f145154l;

    /* renamed from: m */
    protected boolean f145155m;

    /* renamed from: n */
    public boolean f145156n;

    static {
        Covode.recordClassIndex(75448);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.C64048bm
    /* renamed from: b */
    public final int mo103582b() {
        return R.layout.aoi;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.C64048bm, com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63852p
    /* renamed from: b */
    public final void mo90040b(String str) {
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, com.p2082ss.android.ugc.aweme.profile.p3576ui.C64048bm, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        m115756o();
    }

    /* renamed from: o */
    private void m115756o() {
        if (this.f145265W) {
            this.f145150d.setVisibility(0);
            this.f145152j.setTuxFont(62);
            this.f145152j.setOnClickListener(new View$OnClickListenerC64012bb(this));
            this.f145153k.setAlpha(0.34f);
            this.f145147a.setAlpha(0.34f);
            this.f145248F.setAlpha(0.34f);
            this.f145249G.setAlpha(0.34f);
            this.f145251I.setAlpha(0.34f);
            this.f145252J.setAlpha(0.34f);
            C39162r.m79460a("tns_ags_float_profile_ban", new C31376a().f75156a);
            return;
        }
        this.f145150d.setVisibility(8);
        this.f145153k.setAlpha(1.0f);
        this.f145147a.setAlpha(1.0f);
        this.f145248F.setAlpha(1.0f);
        this.f145249G.setAlpha(1.0f);
        this.f145251I.setAlpha(1.0f);
        this.f145252J.setAlpha(1.0f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo103584d() {
        User curUser;
        String uri;
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - C80416ez.f179977a;
        C80416ez.f179977a = currentTimeMillis;
        if ((j <= 0 || j >= 650) && (curUser = C31575b.m65865g().getCurUser()) != null && !this.f145265W) {
            if (curUser.getAvatarVideoUri() == null) {
                uri = null;
            } else {
                uri = curUser.getAvatarVideoUri().getUri();
            }
            if (TextUtils.isEmpty(uri)) {
                C63517a aVar = this.f145145Y;
                if (aVar.f144680b != null) {
                    ((C63757a) aVar.f144680b).mo102313a();
                    return;
                }
                return;
            }
            C63517a aVar2 = this.f145145Y;
            MusAvatarImageView musAvatarImageView = this.f145148b;
            if (aVar2.f144680b != null) {
                ((C63757a) aVar2.f144680b).mo102315a(musAvatarImageView);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC63984ap
    /* renamed from: e */
    public final void mo90043e() {
        this.f145278w = true;
        this.f145281z.mo102038a("");
        this.f145276u.mo103294a(this.f145281z.mo102037a());
        this.f145148b.setVisibility(4);
        this.f145149c.setTintColorRes(R.attr.bc);
        C20766v a = C20761r.m39056a((int) R.color.j);
        a.f49115l = R.color.j;
        a.f49092E = this.f145151e;
        a.mo34186c();
        List<String> list = C31575b.m65865g().getCurUser().boldFields;
        if (list != null) {
            if (list.size() > 0 && list.contains("video")) {
                list.remove("video");
                C31575b.m65865g().getCurUser().setBoldFields(list);
            }
            mo103620a("video", true, "blank");
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.C64048bm
    /* renamed from: c */
    public final void mo103583c() {
        int i;
        super.mo103583c();
        if (this.f145280y != null) {
            RelativeLayout relativeLayout = this.f145147a;
            User user = this.f145280y;
            if (user != null && (((user.getAvatarThumb() != null && !C34717d.m70908a(user.getAvatarThumb().getUrlList())) || ((user.getAvatarMedium() != null && !C34717d.m70908a(user.getAvatarMedium().getUrlList())) || (user.getAvatarLarger() != null && !C34717d.m70908a(user.getAvatarLarger().getUrlList())))) && ((user.getAvatarThumb() == null || C34717d.m70908a(user.getAvatarThumb().getUrlList()) || !user.getAvatarThumb().getUrlList().get(0).contains("1594805258216454")) && !FunctionSupportService.INSTANCE.notSupport(IFunctionKey.PROFILE_VIDEO_HEAD)))) {
                i = 0;
            } else {
                i = 8;
            }
            relativeLayout.setVisibility(i);
            if (this.f145148b.getVisibility() == 0) {
                C34577e.m70597a((RemoteImageView) this.f145148b, this.f145280y.getAvatarVideoUri(), (AbstractC24203d<AbstractC24457f>) null, true);
            }
            if (this.f145280y.getAvatarVideoUri() == null || this.f145280y.getAvatarVideoUri().getUrlList() == null || this.f145280y.getAvatarVideoUri().getUrlList().size() == 0) {
                this.f145149c.setTintColorRes(R.attr.bc);
                C20766v a = C20761r.m39056a((int) R.color.j);
                a.f49115l = R.color.j;
                a.f49092E = this.f145151e;
                a.mo34186c();
            } else {
                this.f145149c.setTintColorRes(R.attr.aa);
                C20766v a2 = C20761r.m39056a((int) R.color.c6);
                a2.f49115l = R.color.c6;
                a2.f49092E = this.f145151e;
                a2.mo34186c();
            }
            C23008e eVar = new C23008e();
            eVar.f54468g = C34728n.m70946a(90.0d);
            eVar.f54469h = C34728n.m70946a(90.0d);
            eVar.f54464c = Float.valueOf((float) C34728n.m70946a(45.0d));
            eVar.f54463b = Integer.valueOf((int) R.attr.bj);
            this.f145154l.setBackground(eVar.mo37389a(getContext()));
            if (this.f145271p != null && this.f145146Z) {
                this.f145146Z = false;
                C64314y.m116179a("enter", this.f145272q);
            }
            m115756o();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC63984ap
    /* renamed from: a */
    public final void mo90034a(AvatarUri avatarUri) {
        if (af_() && getActivity() != null) {
            this.f145145Y.mo103277d();
            if (this.f145276u == null || avatarUri == null) {
                new C79459a(getActivity()).mo123050a(R.string.nd).mo123053a();
            } else {
                this.f145281z.mo102038a(avatarUri.uri);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.C64048bm, com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63852p
    /* renamed from: b */
    public final void mo90039b(Exception exc) {
        mo103632k();
        if (af_() && this.f145277v != null) {
            if ((exc instanceof C34485a) && ((C34480a) exc).getErrorCode() == 20022) {
                C29823c.m60080a(getActivity(), "profile_image_setting", "review_failure");
            }
            C33615a.m68848a((Context) getActivity(), (Throwable) exc, (int) R.string.nd);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC63984ap
    /* renamed from: a */
    public final void mo90035a(Exception exc) {
        mo103632k();
        if (af_() && this.f145145Y != null) {
            if ((exc instanceof C34485a) && ((C34480a) exc).getErrorCode() == 20022) {
                C29823c.m60080a(getActivity(), "profile_image_setting", "review_failure");
            }
            C33615a.m68848a((Context) getActivity(), (Throwable) exc, (int) R.string.nd);
            C85084a.m146294a(exc.getMessage(), "avatar");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.C64048bm, com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63852p
    /* renamed from: b */
    public final void mo90038b(AvatarUri avatarUri) {
        if (this.f145276u == null || avatarUri == null || C34717d.m70908a(avatarUri.urlList) || TextUtils.isEmpty(avatarUri.urlList.get(0))) {
            this.f145277v.mo103277d();
            new C79459a(getActivity()).mo123050a(R.string.nd).mo123053a();
            return;
        }
        this.f145279x = true;
        this.f145278w = true;
        this.f145277v.mo103277d();
        this.f145281z.f143980d = avatarUri.uri;
        C34577e.m70608b(this.f145273r, avatarUri.urlList.get(0), (int) C13628n.m24520b(getContext(), 84.0f), (int) C13628n.m24520b(getContext(), 84.0f));
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.C64048bm
    /* renamed from: a */
    public final void mo103581a(View view) {
        this.f145147a = (RelativeLayout) view.findViewById(R.id.dks);
        this.f145148b = (MusAvatarImageView) view.findViewById(R.id.be_);
        this.f145149c = (TuxIconView) view.findViewById(R.id.bea);
        this.f145150d = (ConstraintLayout) view.findViewById(R.id.d7k);
        this.f145151e = (SmartCircleImageView) view.findViewById(R.id.beb);
        this.f145152j = (TuxTextView) view.findViewById(R.id.ff4);
        this.f145153k = (RelativeLayout) view.findViewById(R.id.dkr);
        this.f145154l = (TuxIconView) view.findViewById(R.id.be8);
        View findViewById = view.findViewById(R.id.dks);
        if (findViewById != null) {
            findViewById.setOnClickListener(new View$OnClickListenerC64011ba(this));
        }
        super.mo103581a(view);
        C63517a aVar = new C63517a();
        this.f145145Y = aVar;
        aVar.f144681c = this;
        this.f145145Y.mo102161a(getActivity(), this);
        ((CircleImageView) this.f145148b).f81868f = true;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC63984ap
    /* renamed from: a */
    public final void mo90036a(String str) {
        if (af_() && getActivity() != null) {
            this.f145278w = true;
            this.f145155m = true;
            this.f145148b.setVisibility(0);
            try {
                Uri parse = Uri.parse("file://".concat(String.valueOf(str)));
                C24428k.m46551a().mo40247e().mo40228a(parse);
                C34577e.m70600a(this.f145148b, parse.toString(), 0, 0);
                this.f145149c.setTintColorRes(R.attr.aa);
                C20766v a = C20761r.m39056a((int) R.color.c6);
                a.f49115l = R.color.c6;
                a.f49092E = this.f145151e;
                a.mo34186c();
                List<String> list = C31575b.m65865g().getCurUser().boldFields;
                if (list != null) {
                    if (list.size() > 0 && !list.contains("video")) {
                        list.add("video");
                        C31575b.m65865g().getCurUser().setBoldFields(list);
                    }
                    mo103620a("video", false, "is_edited");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.C64048bm, com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63860x
    /* renamed from: a */
    public final void mo61023a(User user, int i) {
        super.mo61023a(user, i);
        this.f145279x = true;
        if (i == 112) {
            this.f145280y.setAvatarVideoUri(user.getAvatarVideoUri());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.C64048bm, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 1000 && i != 1001) {
            this.f145145Y.mo102163a(i, i2, intent);
        }
    }
}
