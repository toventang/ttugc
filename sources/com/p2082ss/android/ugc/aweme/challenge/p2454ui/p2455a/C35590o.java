package com.p2082ss.android.ugc.aweme.challenge.p2454ui.p2455a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.DynamicLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C0643b;
import androidx.core.p035f.C0671a;
import androidx.core.p037h.C0792v;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.common.C17174a;
import com.bytedance.ies.dmt.p1194ui.p1198d.C17191a;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.app.SharePrefCache;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.utils.C34722h;
import com.p2082ss.android.ugc.aweme.base.utils.C34723i;
import com.p2082ss.android.ugc.aweme.challenge.C35491b;
import com.p2082ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import com.p2082ss.android.ugc.aweme.challenge.p2454ui.C35606g;
import com.p2082ss.android.ugc.aweme.challenge.p2454ui.C35646l;
import com.p2082ss.android.ugc.aweme.challenge.p2454ui.C35670x;
import com.p2082ss.android.ugc.aweme.challenge.p2454ui.RunnableC35603d;
import com.p2082ss.android.ugc.aweme.challenge.service.ChallengeDetailProvicer;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.discover.model.Challenge;
import com.p2082ss.android.ugc.aweme.discover.model.ChallengeAnnouncement;
import com.p2082ss.android.ugc.aweme.i18n.C53437b;
import com.p2082ss.android.ugc.aweme.music.p3481ui.CheckableImageView;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.aweme.views.C81430b;
import com.p2082ss.android.ugc.trill.R;
import java.text.Bidi;
import java.util.Objects;
import p4600h.C89376n;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.a.o */
public final class C35590o extends AbstractC35558a {

    /* renamed from: h */
    public static final C35591a f83932h = new C35591a((byte) 0);

    /* renamed from: i */
    private TextView f83933i;

    /* renamed from: j */
    private TextView f83934j;

    /* renamed from: k */
    private View f83935k;

    /* renamed from: l */
    private View f83936l;

    /* renamed from: m */
    private View f83937m;

    /* renamed from: n */
    private TextView f83938n;

    /* renamed from: o */
    private ViewGroup f83939o;

    /* renamed from: p */
    private TextView f83940p;

    /* renamed from: q */
    private TextView f83941q;

    /* renamed from: r */
    private ImageView f83942r;

    /* renamed from: s */
    private View f83943s;

    /* renamed from: t */
    private C35578i f83944t;

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.a.o$b */
    final /* synthetic */ class RunnableC35592b implements Runnable {

        /* renamed from: a */
        private final /* synthetic */ AbstractC89171a f83945a;

        static {
            Covode.recordClassIndex(42816);
        }

        RunnableC35592b(AbstractC89171a aVar) {
            this.f83945a = aVar;
        }

        public final /* synthetic */ void run() {
            C89219l.m154716b(this.f83945a.invoke(), "");
        }
    }

    static {
        Covode.recordClassIndex(42814);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.challenge.p2454ui.p2455a.AbstractC35558a
    public final int getLayoutResId() {
        return R.layout.n5;
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.a.o$a */
    public static final class C35591a {
        static {
            Covode.recordClassIndex(42815);
        }

        private C35591a() {
        }

        public /* synthetic */ C35591a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.a.o$d */
    static final /* synthetic */ class C35594d extends C89217j implements AbstractC89171a<C89391z> {
        static {
            Covode.recordClassIndex(42818);
        }

        C35594d(C35590o oVar) {
            super(0, oVar, C35590o.class, "relayoutButton", "relayoutButton()V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            ((C35590o) this.receiver).mo62601e();
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.challenge.p2454ui.p2455a.AbstractC35558a
    /* renamed from: a */
    public final void mo62538a() {
        AbstractC35585l a = ChallengeDetailProvicer.m72635b().mo62521a();
        C89219l.m154716b(a, "");
        mo62540a(a);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.challenge.p2454ui.p2455a.AbstractC35558a
    public final int getAttrsResId() {
        int i = C35595p.f83947a[getMHeaderParam().f83912b.ordinal()];
        if (i == 1 || i == 2) {
            return R.layout.my;
        }
        throw new C89376n();
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.challenge.p2454ui.p2455a.AbstractC35558a
    public final int getButtonResId() {
        int i = C35595p.f83948b[getMHeaderParam().f83913c.ordinal()];
        if (i == 1) {
            return R.layout.mz;
        }
        if (i == 2) {
            return R.layout.n0;
        }
        throw new C89376n();
    }

    @Override // com.p2082ss.android.ugc.aweme.challenge.p2454ui.p2455a.AbstractC35558a
    /* renamed from: b */
    public final void mo62542b() {
        MethodCollector.m26663i(183);
        View findViewById = findViewById(R.id.m6);
        C89219l.m154716b(findViewById, "");
        ViewStub viewStub = (ViewStub) findViewById;
        viewStub.setLayoutResource(getAttrsResId());
        View inflate = viewStub.inflate();
        View findViewById2 = inflate.findViewById(R.id.m9);
        C89219l.m154716b(findViewById2, "");
        this.f83933i = (TextView) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.m7);
        C89219l.m154716b(findViewById3, "");
        this.f83934j = (TextView) findViewById3;
        C89219l.m154716b(inflate, "");
        this.f83935k = inflate;
        View findViewById4 = findViewById(R.id.a06);
        C89219l.m154716b(findViewById4, "");
        ViewStub viewStub2 = (ViewStub) findViewById4;
        viewStub2.setLayoutResource(getButtonResId());
        View inflate2 = viewStub2.inflate();
        View findViewById5 = inflate2.findViewById(R.id.a7n);
        C89219l.m154716b(findViewById5, "");
        View findViewById6 = inflate2.findViewById(R.id.bu9);
        C89219l.m154716b(findViewById6, "");
        this.f83944t = new C35578i(findViewById5, (CheckableImageView) findViewById6, (TextView) inflate2.findViewById(R.id.etu), getDetailParam());
        C89219l.m154716b(inflate2, "");
        this.f83936l = inflate2;
        super.mo62542b();
        MethodCollector.m26664o(183);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0072  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo62601e() {
        /*
        // Method dump skipped, instructions count: 147
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.challenge.p2454ui.p2455a.C35590o.mo62601e():void");
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.a.o$c */
    public static final class C35593c extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ C35590o f83946a;

        static {
            Covode.recordClassIndex(42817);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C35593c(C35590o oVar) {
            this.f83946a = oVar;
        }

        public final void updateDrawState(TextPaint textPaint) {
            C89219l.m154721d(textPaint, "");
            textPaint.setUnderlineText(false);
            textPaint.setColor(C0643b.m2378c(this.f83946a.getContext(), R.color.c5));
        }

        public final void onClick(View view) {
            C89219l.m154721d(view, "");
            C33744d a = new C33744d().mo59983a("enter_from", "challenge");
            User author = this.f83946a.getMChallenge().getAuthor();
            C89219l.m154716b(author, "");
            C39162r.m79460a("click_account_button", a.mo59983a("secuid", author.getSecUid()).mo59983a("page_type", "challenge").mo59983a("tag_id", this.f83946a.getMChallenge().getCid()).f79943a);
            SmartRoute buildRoute = SmartRouter.buildRoute(C17867d.m33078a(), "aweme://user/profile/");
            User author2 = this.f83946a.getMChallenge().getAuthor();
            C89219l.m154716b(author2, "");
            SmartRoute withParam = buildRoute.withParam("uid", author2.getUid());
            User author3 = this.f83946a.getMChallenge().getAuthor();
            C89219l.m154716b(author3, "");
            withParam.withParam("sec_user_id", author3.getSecUid()).open();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.challenge.p2454ui.p2455a.AbstractC35558a
    /* renamed from: a */
    public final void mo62539a(ChallengeDetail challengeDetail) {
        int i;
        int i2;
        int i3;
        int i4;
        String replaceAll;
        int i5;
        float dimension;
        boolean z;
        String nickname;
        Integer num;
        boolean z2;
        boolean z3;
        int i6;
        int i7;
        MethodCollector.m26663i(432);
        String str = "";
        C89219l.m154721d(challengeDetail, str);
        if (challengeDetail.challenge == null) {
            MethodCollector.m26664o(432);
            return;
        }
        super.mo62539a(challengeDetail);
        String a = C53437b.m98615a(getMChallenge().getDisplayCount());
        C17191a.C17192a aVar = new C17191a.C17192a();
        Context context = getContext();
        C89219l.m154716b(context, str);
        Resources resources = context.getResources();
        C89219l.m154716b(resources, str);
        C89219l.m154716b(a, str);
        int i8 = 0;
        C17191a aVar2 = aVar.mo27176a(resources, R.string.aac, a).f40973a;
        TextView textView = this.f83934j;
        if (textView == null) {
            C89219l.m154710a("mAttrsFirst");
        }
        textView.setText(aVar2);
        TextView textView2 = this.f83933i;
        if (textView2 == null) {
            C89219l.m154710a("mAttrsLink");
        }
        textView2.setVisibility(8);
        String str2 = null;
        if (getMChallenge().isCommerce() && getMChallenge().getAuthor() != null) {
            User author = getMChallenge().getAuthor();
            C89219l.m154716b(author, str);
            String nickname2 = author.getNickname();
            if (!(nickname2 == null || nickname2.length() == 0)) {
                TextView textView3 = this.f83933i;
                if (textView3 == null) {
                    C89219l.m154710a("mAttrsLink");
                }
                textView3.setVisibility(0);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                boolean a2 = C35570b.m72676a(getMChallenge().getSponsorLabelText());
                if (!C35570b.m72676a(getMChallenge().getSponsorAdLabel()) || a2) {
                    z = false;
                } else {
                    z = true;
                }
                if (a2) {
                    nickname = getMChallenge().getSponsorLabelText();
                    C89219l.m154716b(nickname, str);
                    User author2 = getMChallenge().getAuthor();
                    C89219l.m154716b(author2, str);
                    String nickname3 = author2.getNickname();
                    C89219l.m154716b(nickname3, str);
                    num = Integer.valueOf(C89361p.m154888a((CharSequence) nickname, nickname3, 0, false, 6));
                } else {
                    if (C35570b.m72676a(getMChallenge().getSponsorAdLabel())) {
                        StringBuilder append = new StringBuilder().append(getMChallenge().getSponsorAdLabel());
                        Context context2 = getContext();
                        C89219l.m154716b(context2, str);
                        StringBuilder append2 = append.append(context2.getResources().getString(R.string.fzs));
                        Context context3 = getContext();
                        C89219l.m154716b(context3, str);
                        StringBuilder append3 = append2.append(context3.getResources().getString(R.string.fzs));
                        User author3 = getMChallenge().getAuthor();
                        C89219l.m154716b(author3, str);
                        nickname = append3.append(author3.getNickname()).toString();
                    } else {
                        User author4 = getMChallenge().getAuthor();
                        C89219l.m154716b(author4, str);
                        nickname = author4.getNickname();
                    }
                    num = null;
                }
                User author5 = getMChallenge().getAuthor();
                if (author5 != null) {
                    str2 = author5.getSecUid();
                }
                if (C35570b.m72676a(str2)) {
                    User author6 = getMChallenge().getAuthor();
                    C89219l.m154716b(author6, str);
                    if (author6.getCommerceUserLevel() == 2) {
                        StringBuilder append4 = new StringBuilder().append(nickname);
                        Context context4 = getContext();
                        C89219l.m154716b(context4, str);
                        nickname = append4.append(context4.getResources().getString(R.string.fzs)).toString();
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    z3 = true;
                } else {
                    z2 = false;
                    z3 = false;
                }
                C89219l.m154716b(nickname, str);
                if (z) {
                    i6 = 1;
                } else {
                    i6 = 2;
                }
                spannableStringBuilder.append((CharSequence) m72699a(nickname, z, z2, z3, i6));
                if (z) {
                    spannableStringBuilder.setSpan(new C81430b(getContext(), C0643b.m2378c(getContext(), R.color.g), getMChallenge().getSponsorAdLabel(), C0643b.m2378c(getContext(), R.color.c6)), 0, getMChallenge().getSponsorAdLabel().length(), 33);
                }
                if (z2) {
                    TextView textView4 = this.f83933i;
                    if (textView4 == null) {
                        C89219l.m154710a("mAttrsLink");
                    }
                    C17174a aVar3 = new C17174a(textView4.getContext(), 2131231575);
                    spannableStringBuilder.append((CharSequence) ".");
                    spannableStringBuilder.setSpan(aVar3, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                }
                if (z3) {
                    Context context5 = getContext();
                    C89219l.m154716b(context5, str);
                    Drawable drawable = context5.getResources().getDrawable(2131231576);
                    if (C80471gb.m139482a()) {
                        Context context6 = getContext();
                        C89219l.m154716b(context6, str);
                        drawable = context6.getResources().getDrawable(2131231574);
                    }
                    drawable.setBounds(0, 0, (int) C13628n.m24520b(getContext(), 10.0f), (int) C13628n.m24520b(getContext(), 10.0f));
                    C17174a aVar4 = new C17174a(drawable);
                    spannableStringBuilder.append((CharSequence) ".");
                    spannableStringBuilder.setSpan(aVar4, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                }
                if (a2 && num != null && num.intValue() >= 0) {
                    StyleSpan styleSpan = new StyleSpan(1);
                    int min = Math.min(num.intValue(), spannableStringBuilder.length() - 1);
                    int intValue = num.intValue();
                    User author7 = getMChallenge().getAuthor();
                    C89219l.m154716b(author7, str);
                    spannableStringBuilder.setSpan(styleSpan, min, Math.min(intValue + author7.getNickname().length(), spannableStringBuilder.length()), 33);
                }
                if (z3) {
                    C35593c cVar = new C35593c(this);
                    if (z) {
                        i7 = getMChallenge().getSponsorAdLabel().length() + 1;
                    } else {
                        i7 = 0;
                    }
                    spannableStringBuilder.setSpan(cVar, i7, spannableStringBuilder.length(), 33);
                    TextView textView5 = this.f83933i;
                    if (textView5 == null) {
                        C89219l.m154710a("mAttrsLink");
                    }
                    textView5.setMovementMethod(LinkMovementMethod.getInstance());
                }
                TextView textView6 = this.f83933i;
                if (textView6 == null) {
                    C89219l.m154710a("mAttrsLink");
                }
                textView6.setText(spannableStringBuilder);
            }
        }
        C35578i iVar = this.f83944t;
        if (iVar == null) {
            C89219l.m154710a("mCollectButtonBlock");
        }
        iVar.mo62588a(getMChallenge(), getMHeaderParam());
        View view = this.f83936l;
        if (view == null) {
            C89219l.m154710a("mButtonContainer");
        }
        view.post(new RunnableC35592b(new C35594d(this)));
        ChallengeAnnouncement challengeAnnouncement = getMChallenge().getChallengeAnnouncement();
        if (challengeAnnouncement != null) {
            String title = challengeAnnouncement.getTitle();
            String content = challengeAnnouncement.getContent();
            if (!TextUtils.isEmpty(title) && !TextUtils.isEmpty(content)) {
                if (this.f83937m == null) {
                    View inflate = ((ViewStub) findViewById(R.id.fh_)).inflate();
                    if (inflate != null) {
                        this.f83937m = (ViewGroup) inflate;
                        View findViewById = findViewById(R.id.a3d);
                        C89219l.m154716b(findViewById, str);
                        this.f83938n = (TextView) findViewById;
                        View findViewById2 = findViewById(R.id.a3b);
                        C89219l.m154716b(findViewById2, str);
                        this.f83939o = (ViewGroup) findViewById2;
                        View findViewById3 = findViewById(R.id.a3_);
                        C89219l.m154716b(findViewById3, str);
                        this.f83940p = (TextView) findViewById3;
                        View findViewById4 = findViewById(R.id.a3a);
                        C89219l.m154716b(findViewById4, str);
                        this.f83941q = (TextView) findViewById4;
                        View findViewById5 = findViewById(R.id.a3c);
                        C89219l.m154716b(findViewById5, str);
                        this.f83942r = (ImageView) findViewById5;
                        View findViewById6 = findViewById(R.id.c9b);
                        C89219l.m154716b(findViewById6, str);
                        this.f83943s = findViewById6;
                        ImageView imageView = this.f83942r;
                        if (imageView == null) {
                            C89219l.m154710a("mAnnounceExpandIv");
                        }
                        imageView.setImageDrawable(getResources().getDrawable(2131231573));
                    } else {
                        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                        MethodCollector.m26664o(432);
                        throw nullPointerException;
                    }
                }
                View view2 = this.f83943s;
                if (view2 == null) {
                    C89219l.m154710a("mAnnounceDivider");
                }
                if (TextUtils.isEmpty(getMChallenge().getDesc())) {
                    i = 8;
                } else {
                    i = 0;
                }
                view2.setVisibility(i);
                TextView textView7 = this.f83938n;
                if (textView7 == null) {
                    C89219l.m154710a("mAnnounceTitle");
                }
                textView7.setText(title);
                View view3 = this.f83937m;
                if (view3 == null) {
                    C89219l.m154715b();
                }
                view3.setVisibility(0);
                Challenge mChallenge = getMChallenge();
                TextView textView8 = this.f83940p;
                if (textView8 == null) {
                    C89219l.m154710a("mAnnounceContent");
                }
                ViewGroup viewGroup = this.f83939o;
                if (viewGroup == null) {
                    C89219l.m154710a("mAnnounceExpandContainer");
                }
                TextView textView9 = this.f83941q;
                if (textView9 == null) {
                    C89219l.m154710a("mAnnounceExpandTv");
                }
                ImageView imageView2 = this.f83942r;
                if (imageView2 == null) {
                    C89219l.m154710a("mAnnounceExpandIv");
                }
                if (mChallenge != null) {
                    boolean a3 = C35646l.m72756a(SharePrefCache.inst().getShowHashTagBg().mo59941c());
                    String content2 = mChallenge.getChallengeAnnouncement().getContent();
                    if (!TextUtils.isEmpty(content2)) {
                        if (C80471gb.m139483a(textView8.getContext())) {
                            i2 = -1;
                        } else {
                            i2 = -2;
                        }
                        boolean baseIsLeftToRight = new Bidi(content2, i2).baseIsLeftToRight();
                        boolean a4 = C80471gb.m139483a(viewGroup.getContext());
                        C0792v.m2759b((View) textView8.getParent(), !baseIsLeftToRight);
                        if (baseIsLeftToRight != 0) {
                            i3 = 3;
                        } else {
                            i3 = 5;
                        }
                        textView8.setGravity(i3);
                        int i9 = Build.VERSION.SDK_INT;
                        if (baseIsLeftToRight != 0) {
                            i4 = 3;
                        } else {
                            i4 = 2;
                        }
                        textView8.setTextDirection(i4);
                        viewGroup.setLayoutDirection(a4 ? 1 : 0);
                        String b = C0671a.m2408a(!baseIsLeftToRight).mo2696b(content2);
                        if (baseIsLeftToRight != 0) {
                            replaceAll = "‭" + b + (char) 8237;
                        } else {
                            replaceAll = b.replaceAll("(?<!^)(#)([a-zA-Z0-9])", "‎$1‎$2");
                        }
                        if (!TextUtils.equals(textView8.getText(), replaceAll)) {
                            if (!TextUtils.isEmpty(textView8.getText())) {
                                imageView2.setSelected(false);
                                if (textView9 != null) {
                                    textView9.setText(C34722h.m70923b(R.string.bq8));
                                }
                                imageView2.setRotation(0.0f);
                                textView8.getLayoutParams().height = -2;
                                if (a3) {
                                    dimension = C13628n.m24520b(imageView2.getContext(), 20.0f);
                                } else {
                                    dimension = imageView2.getResources().getDimension(R.dimen.ed);
                                }
                                int i10 = (int) dimension;
                                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams();
                                if (a3) {
                                    marginLayoutParams.bottomMargin = i10;
                                } else {
                                    marginLayoutParams.topMargin = i10;
                                }
                                viewGroup.setLayoutParams(marginLayoutParams);
                            }
                            int i11 = 32;
                            if (a3) {
                                i11 = 64;
                            }
                            int a5 = (int) (((float) C13628n.m24504a(textView8.getContext())) - C13628n.m24520b(textView8.getContext(), (float) i11));
                            SpannableString spannableString = new SpannableString(replaceAll);
                            if (textView9 != null) {
                                str = textView9.getText().toString();
                            }
                            C35606g gVar = new C35606g(textView8.getPaint(), a5, str);
                            C35491b bVar = new C35491b(mChallenge.getCid(), mChallenge.getChallengeName());
                            bVar.f83678a = gVar;
                            SpannableString a6 = bVar.mo62373a(spannableString);
                            boolean z4 = gVar.f83982b;
                            if (bVar.f83711d) {
                                textView8.setText(a6);
                                if (C35670x.f84156a == null) {
                                    C35670x.f84156a = new C35670x();
                                }
                                textView8.setMovementMethod(C35670x.f84156a);
                            } else {
                                textView8.setText(a6);
                            }
                            if (z4) {
                                new DynamicLayout(spannableString.toString(), textView8.getPaint(), a5, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getHeight();
                                if (!TextUtils.isEmpty(replaceAll)) {
                                    i5 = 0;
                                } else {
                                    i5 = 8;
                                }
                                textView9.setVisibility(i5);
                                if (TextUtils.isEmpty(replaceAll)) {
                                    i8 = 8;
                                }
                                imageView2.setVisibility(i8);
                                textView8.post(new RunnableC35603d(textView8, spannableString, imageView2, textView9, viewGroup, a3, a6));
                                MethodCollector.m26664o(432);
                                return;
                            }
                            imageView2.setVisibility(8);
                            textView9.setVisibility(8);
                        }
                    }
                }
                MethodCollector.m26664o(432);
                return;
            }
        }
        View view4 = this.f83937m;
        if (view4 != null) {
            view4.setVisibility(8);
            MethodCollector.m26664o(432);
            return;
        }
        MethodCollector.m26664o(432);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C35590o(Context context, C35583j jVar) {
        super(context, jVar, null);
        C89219l.m154721d(context, "");
    }

    public /* synthetic */ C35590o(Context context, C35583j jVar, byte b) {
        this(context, jVar);
    }

    /* renamed from: a */
    private static String m72698a(String str, int i, boolean z) {
        if (z) {
            StringBuilder sb = new StringBuilder();
            int max = Math.max(i - 1, 1);
            Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
            String substring = str.substring(0, max);
            C89219l.m154716b(substring, "");
            return sb.append(substring).append("... ").toString();
        }
        StringBuilder sb2 = new StringBuilder();
        int max2 = Math.max(i, 1);
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        String substring2 = str.substring(0, max2);
        C89219l.m154716b(substring2, "");
        return sb2.append(substring2).append("...").toString();
    }

    /* renamed from: a */
    private final String m72699a(String str, boolean z, boolean z2, boolean z3, int i) {
        float f;
        String str2 = str;
        int b = C34723i.m70928b(getContext()) - ((int) C13628n.m24520b(getContext(), 168.0f));
        if (z) {
            f = C13628n.m24520b(getContext(), 10.0f);
        } else {
            f = 0.0f;
        }
        if (z3) {
            f += C13628n.m24520b(getContext(), 10.0f);
            if (z2) {
                f += C13628n.m24520b(getContext(), 10.0f);
            }
        }
        TextView textView = this.f83933i;
        if (textView == null) {
            C89219l.m154710a("mAttrsLink");
        }
        DynamicLayout dynamicLayout = new DynamicLayout(str2, textView.getPaint(), b, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        int lineCount = dynamicLayout.getLineCount();
        if (lineCount >= i) {
            int i2 = i - 1;
            str2 = str2.subSequence(0, dynamicLayout.getLineEnd(i2)).toString();
            if (lineCount > i) {
                String a = m72698a(str2, str2.length() - 2, z2);
                TextView textView2 = this.f83933i;
                if (textView2 == null) {
                    C89219l.m154710a("mAttrsLink");
                }
                str2 = a;
                b = b;
                dynamicLayout = new DynamicLayout(str2, textView2.getPaint(), b, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
            while (dynamicLayout.getLineCount() > i) {
                str2 = m72698a(str2, str2.length() - 5, z2);
                TextView textView3 = this.f83933i;
                if (textView3 == null) {
                    C89219l.m154710a("mAttrsLink");
                }
                dynamicLayout = new DynamicLayout(str2, textView3.getPaint(), b, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
            float f2 = (float) b;
            TextView textView4 = this.f83933i;
            if (textView4 == null) {
                C89219l.m154710a("mAttrsLink");
            }
            float measureText = f2 - textView4.getPaint().measureText(str2, dynamicLayout.getLineStart(i2), dynamicLayout.getLineEnd(i2));
            if (dynamicLayout.getLineCount() == i && measureText < f) {
                str2 = m72698a(str2, str2.length() - 2, z2);
                TextView textView5 = this.f83933i;
                if (textView5 == null) {
                    C89219l.m154710a("mAttrsLink");
                }
                DynamicLayout dynamicLayout2 = new DynamicLayout(str2, textView5.getPaint(), b, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
                while (dynamicLayout2.getLineCount() > i) {
                    str2 = m72698a(str2, str2.length() - 5, z2);
                    TextView textView6 = this.f83933i;
                    if (textView6 == null) {
                        C89219l.m154710a("mAttrsLink");
                    }
                    dynamicLayout2 = new DynamicLayout(str2, textView6.getPaint(), b, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
                }
            }
            while (measureText < f) {
                str2 = m72698a(str2, str2.length() - 5, z2);
                TextView textView7 = this.f83933i;
                if (textView7 == null) {
                    C89219l.m154710a("mAttrsLink");
                }
                DynamicLayout dynamicLayout3 = new DynamicLayout(str2, textView7.getPaint(), b, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
                TextView textView8 = this.f83933i;
                if (textView8 == null) {
                    C89219l.m154710a("mAttrsLink");
                }
                measureText = f2 - textView8.getPaint().measureText(str2, dynamicLayout3.getLineStart(i2), dynamicLayout3.getLineEnd(i2));
            }
        }
        return str2;
    }
}
