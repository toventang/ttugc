package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.hashtag;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63178ak;
import com.p2082ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p2082ss.android.ugc.aweme.shortvideo.C71852g;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.p3820a.AbstractC71277b;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.p3820a.AbstractC71284d;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.p3821b.C71294e;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.p3825ui.SocialTouchableEditText;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.C72621b;
import com.p2082ss.android.ugc.aweme.tools.C78099c;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.video.hashtag.C80735b;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.hashtag.HashTagStickerEditingLayout */
public final class HashTagStickerEditingLayout extends AbstractC71277b<C80735b> {

    /* renamed from: l */
    public boolean f159792l = C78099c.m136517a(getContext());

    /* renamed from: m */
    private C71313c f159793m;

    /* renamed from: n */
    private final InputFilter f159794n = C71298d.f159799a;

    /* renamed from: o */
    private final InputFilter f159795o = new C71297c(this);

    static {
        Covode.recordClassIndex(83814);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.p3820a.AbstractC71277b
    /* renamed from: a */
    public final Animator mo112712a() {
        C71313c cVar = this.f159793m;
        if (cVar == null) {
            C89219l.m154710a("mHashTagSearchListView");
        }
        return ObjectAnimator.ofFloat(cVar, "alpha", 1.0f, 0.0f);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.p3820a.AbstractC71277b
    /* renamed from: b */
    public final AbstractC71284d<C80735b> mo112718b() {
        Context context = getContext();
        C89219l.m154716b(context, "");
        C71312b bVar = new C71312b(context);
        SocialTouchableEditText mEditTextView = bVar.getMEditTextView();
        mEditTextView.setTypeface(getCustomTypeface());
        mEditTextView.setFilters(new InputFilter[]{this.f159794n, this.f159795o});
        mEditTextView.addTextChangedListener(new C71295a(this));
        return bVar;
    }

    public final void setRtlState(boolean z) {
        this.f159792l = z;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.hashtag.HashTagStickerEditingLayout$a */
    public static final class C71295a implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ HashTagStickerEditingLayout f159796a;

        static {
            Covode.recordClassIndex(83815);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C89219l.m154721d(charSequence, "");
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C89219l.m154721d(charSequence, "");
        }

        C71295a(HashTagStickerEditingLayout hashTagStickerEditingLayout) {
            this.f159796a = hashTagStickerEditingLayout;
        }

        public final void afterTextChanged(Editable editable) {
            String str;
            C80735b bVar;
            AVChallenge aVChallenge;
            boolean z;
            C89219l.m154721d(editable, "");
            String obj = editable.toString();
            if (obj.length() == 0) {
                HashTagStickerEditingLayout hashTagStickerEditingLayout = this.f159796a;
                if (C78099c.m136517a(hashTagStickerEditingLayout.getContext())) {
                    AbstractC71284d mInputView = hashTagStickerEditingLayout.getMInputView();
                    if (mInputView != null) {
                        mInputView.mo112758f();
                    }
                    z = true;
                } else {
                    AbstractC71284d mInputView2 = hashTagStickerEditingLayout.getMInputView();
                    if (mInputView2 != null) {
                        mInputView2.mo112757e();
                    }
                    z = false;
                }
                hashTagStickerEditingLayout.f159792l = z;
            } else if (C71294e.m125979a(obj)) {
                if (!this.f159796a.f159792l) {
                    AbstractC71284d mInputView3 = this.f159796a.getMInputView();
                    if (mInputView3 != null) {
                        mInputView3.mo112758f();
                    }
                    this.f159796a.setRtlState(true);
                }
            } else if (this.f159796a.f159792l) {
                AbstractC71284d mInputView4 = this.f159796a.getMInputView();
                if (mInputView4 != null) {
                    mInputView4.mo112757e();
                }
                this.f159796a.setRtlState(false);
            }
            AbstractC71284d mInputView5 = this.f159796a.getMInputView();
            if (mInputView5 != null) {
                mInputView5.mo112753a(true);
            }
            AbstractC71284d mInputView6 = this.f159796a.getMInputView();
            if (mInputView6 == null || (bVar = (C80735b) mInputView6.getCurModel()) == null || (aVChallenge = bVar.f180510a) == null) {
                str = null;
            } else {
                str = aVChallenge.challengeName;
            }
            if (!C89219l.m154714a((Object) str, (Object) obj)) {
                AVChallenge aVChallenge2 = new AVChallenge();
                aVChallenge2.challengeName = obj;
                AbstractC71284d mInputView7 = this.f159796a.getMInputView();
                if (mInputView7 != null) {
                    C71852g gVar = new C71852g();
                    gVar.f161024a = aVChallenge2;
                    mInputView7.setCurModel(C80735b.m139992a(gVar, false));
                }
                this.f159796a.mo112717a(editable.toString());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.hashtag.HashTagStickerEditingLayout$b */
    public static final class C71296b implements AbstractC71318e<C80735b> {

        /* renamed from: a */
        final /* synthetic */ HashTagStickerEditingLayout f159797a;

        static {
            Covode.recordClassIndex(83816);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C71296b(HashTagStickerEditingLayout hashTagStickerEditingLayout) {
            this.f159797a = hashTagStickerEditingLayout;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.hashtag.AbstractC71318e
        /* renamed from: a */
        public final /* synthetic */ void mo112794a(C80735b bVar) {
            AbstractC71284d mInputView = this.f159797a.getMInputView();
            if (mInputView != null) {
                mInputView.setCurModel(bVar);
            }
            AbstractC71284d mInputView2 = this.f159797a.getMInputView();
            if (mInputView2 != null) {
                mInputView2.mo112756d();
            }
            this.f159797a.mo112721e();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.hashtag.HashTagStickerEditingLayout$c */
    public static final class C71297c implements InputFilter {

        /* renamed from: a */
        final /* synthetic */ HashTagStickerEditingLayout f159798a;

        static {
            Covode.recordClassIndex(83817);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C71297c(HashTagStickerEditingLayout hashTagStickerEditingLayout) {
            this.f159798a = hashTagStickerEditingLayout;
        }

        public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            if (spanned == null) {
                C89219l.m154715b();
            }
            int length = 50 - (spanned.length() - (i4 - i3));
            int i5 = i2 - i;
            if (length < i5) {
                new C79459a(this.f159798a.getContext()).mo123050a(R.string.b09).mo123053a();
            }
            if (length <= 0) {
                return "";
            }
            if (length >= i5) {
                return null;
            }
            int i6 = length + i;
            if (charSequence == null) {
                C89219l.m154715b();
            }
            if (!Character.isHighSurrogate(charSequence.charAt(i6 - 1)) || i6 - 1 != i) {
                return charSequence.subSequence(i, i6);
            }
            return "";
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.p3820a.AbstractC71277b
    public final void setSearchListViewVisibility(int i) {
        C71313c cVar = this.f159793m;
        if (cVar == null) {
            C89219l.m154710a("mHashTagSearchListView");
        }
        cVar.setVisibility(i);
        if (i == 0) {
            C71313c cVar2 = this.f159793m;
            if (cVar2 == null) {
                C89219l.m154710a("mHashTagSearchListView");
            }
            cVar2.setAlpha(1.0f);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.p3820a.AbstractC71277b
    /* renamed from: a */
    public final void mo112714a(ViewGroup viewGroup) {
        MethodCollector.m26663i(12859);
        Context context = getContext();
        C89219l.m154716b(context, "");
        C71313c cVar = new C71313c(context);
        this.f159793m = cVar;
        cVar.setOnHashTagItemClickListener(new C71296b(this));
        if (viewGroup != null) {
            C71313c cVar2 = this.f159793m;
            if (cVar2 == null) {
                C89219l.m154710a("mHashTagSearchListView");
            }
            viewGroup.addView(cVar2, new FrameLayout.LayoutParams(-1, -2, 80));
            MethodCollector.m26664o(12859);
            return;
        }
        MethodCollector.m26664o(12859);
    }

    public final void setModel(VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(videoPublishEditModel, "");
        C71313c cVar = this.f159793m;
        if (cVar == null) {
            C89219l.m154710a("mHashTagSearchListView");
        }
        AbstractC63178ak.C63184f a = C72621b.m128091a(videoPublishEditModel);
        C89219l.m154721d(a, "");
        cVar.f159819b = a;
        AbstractC63178ak.C63184f fVar = cVar.f159819b;
        if (fVar == null) {
            C89219l.m154710a("mSearchParams");
        }
        fVar.f143527f = 2;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.p3820a.AbstractC71277b
    public final void setSearchListMarginBottom(int i) {
        C71313c cVar = this.f159793m;
        if (cVar == null) {
            C89219l.m154710a("mHashTagSearchListView");
        }
        ViewGroup.LayoutParams layoutParams = cVar.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        if (layoutParams2 != null) {
            layoutParams2.bottomMargin = i;
        }
        C71313c cVar2 = this.f159793m;
        if (cVar2 == null) {
            C89219l.m154710a("mHashTagSearchListView");
        }
        cVar2.requestLayout();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.p3820a.AbstractC71277b
    /* renamed from: a */
    public final void mo112717a(String str) {
        C71313c cVar = this.f159793m;
        if (cVar == null) {
            C89219l.m154710a("mHashTagSearchListView");
        }
        if (cVar.f159820c && cVar.f159819b != null) {
            cVar.mo101623b();
            if (str == null || str.length() == 0) {
                AbstractC63178ak.AbstractC63182d dVar = cVar.f159823f;
                if (dVar == null) {
                    C89219l.m154710a("recommendHashTagViewModel");
                }
                AbstractC63178ak.C63184f fVar = cVar.f159819b;
                if (fVar == null) {
                    C89219l.m154710a("mSearchParams");
                }
                dVar.mo93810a(fVar);
                return;
            }
            AbstractC63178ak.AbstractC63181c cVar2 = cVar.f159824g;
            if (cVar2 == null) {
                C89219l.m154710a("mChallengeSearchPresenter");
            }
            cVar2.mo93915a(str, C71313c.f159816h);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HashTagStickerEditingLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C89219l.m154721d(context, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.hashtag.HashTagStickerEditingLayout$d */
    static final class C71298d implements InputFilter {

        /* renamed from: a */
        public static final C71298d f159799a = new C71298d();

        static {
            Covode.recordClassIndex(83818);
        }

        C71298d() {
        }

        public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            CharSequence charSequence2;
            if (charSequence != null) {
                charSequence2 = C89361p.m154910b(charSequence);
            } else {
                charSequence2 = null;
            }
            if (TextUtils.isEmpty(charSequence2)) {
                return "";
            }
            String valueOf = String.valueOf(charSequence2);
            Objects.requireNonNull(valueOf, "null cannot be cast to non-null type java.lang.String");
            if (valueOf.contentEquals("\n")) {
                return "";
            }
            return null;
        }
    }
}
