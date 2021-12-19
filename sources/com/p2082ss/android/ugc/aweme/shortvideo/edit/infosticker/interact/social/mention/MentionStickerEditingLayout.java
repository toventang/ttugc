package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Typeface;
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
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.C71323a;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.p3823a.C71332a;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.p3823a.C71339c;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.p3824b.C71351b;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.p3820a.AbstractC71277b;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.p3820a.AbstractC71284d;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.p3821b.C71294e;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.p3825ui.SocialTouchableEditText;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73998bn;
import com.p2082ss.android.ugc.aweme.tools.C78099c;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.MentionStickerEditingLayout */
public final class MentionStickerEditingLayout extends AbstractC71277b<User> {

    /* renamed from: l */
    public boolean f159833l = C78099c.m136517a(getContext());

    /* renamed from: m */
    public C71323a f159834m;

    /* renamed from: n */
    private final InputFilter f159835n = C71322d.f159840a;

    /* renamed from: o */
    private final InputFilter f159836o = new C71321c(this);

    static {
        Covode.recordClassIndex(83841);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.p3820a.AbstractC71277b
    /* renamed from: a */
    public final Animator mo112712a() {
        C71323a aVar = this.f159834m;
        if (aVar == null) {
            C89219l.m154710a("mMentionSearchListView");
        }
        return ObjectAnimator.ofFloat(aVar, "alpha", 1.0f, 0.0f);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.p3820a.AbstractC71277b
    /* renamed from: b */
    public final AbstractC71284d<User> mo112718b() {
        Context context = getContext();
        C89219l.m154716b(context, "");
        C71364c cVar = new C71364c(context);
        SocialTouchableEditText mEditTextView = cVar.getMEditTextView();
        Typeface customTypeface = getCustomTypeface();
        if (customTypeface != null) {
            mEditTextView.setTypeface(customTypeface);
        }
        mEditTextView.setFilters(new InputFilter[]{this.f159835n, this.f159836o});
        mEditTextView.addTextChangedListener(new C71319a(this));
        return cVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.p3820a.AbstractC71277b
    /* renamed from: c */
    public final void mo112719c() {
        User user;
        SocialTouchableEditText mEditTextView;
        AbstractC71284d mInputView = getMInputView();
        Editable editable = null;
        if (mInputView != null) {
            user = (User) mInputView.getCurModel();
        } else {
            user = null;
        }
        C71323a aVar = this.f159834m;
        if (aVar == null) {
            C89219l.m154710a("mMentionSearchListView");
        }
        aVar.setSelectedUser$tools_camera_edit_release(user);
        AbstractC71284d mInputView2 = getMInputView();
        if (!(mInputView2 == null || (mEditTextView = mInputView2.getMEditTextView()) == null)) {
            editable = mEditTextView.getText();
        }
        mo112717a(String.valueOf(editable));
    }

    public final void setRtlState(boolean z) {
        this.f159833l = z;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.MentionStickerEditingLayout$a */
    public static final class C71319a implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ MentionStickerEditingLayout f159837a;

        static {
            Covode.recordClassIndex(83842);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C89219l.m154721d(charSequence, "");
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C89219l.m154721d(charSequence, "");
        }

        C71319a(MentionStickerEditingLayout mentionStickerEditingLayout) {
            this.f159837a = mentionStickerEditingLayout;
        }

        public final void afterTextChanged(Editable editable) {
            User user;
            String str = "";
            C89219l.m154721d(editable, str);
            String obj = editable.toString();
            boolean z = false;
            if (obj.length() == 0) {
                MentionStickerEditingLayout mentionStickerEditingLayout = this.f159837a;
                if (C78099c.m136517a(mentionStickerEditingLayout.getContext())) {
                    AbstractC71284d mInputView = mentionStickerEditingLayout.getMInputView();
                    if (mInputView != null) {
                        mInputView.mo112758f();
                    }
                    z = true;
                } else {
                    AbstractC71284d mInputView2 = mentionStickerEditingLayout.getMInputView();
                    if (mInputView2 != null) {
                        mInputView2.mo112757e();
                    }
                }
                mentionStickerEditingLayout.f159833l = z;
            } else if (C71294e.m125979a(obj)) {
                if (!this.f159837a.f159833l) {
                    AbstractC71284d mInputView3 = this.f159837a.getMInputView();
                    if (mInputView3 != null) {
                        mInputView3.mo112758f();
                    }
                    this.f159837a.setRtlState(true);
                }
            } else if (this.f159837a.f159833l) {
                AbstractC71284d mInputView4 = this.f159837a.getMInputView();
                if (mInputView4 != null) {
                    mInputView4.mo112757e();
                }
                this.f159837a.setRtlState(false);
            }
            AbstractC71284d mInputView5 = this.f159837a.getMInputView();
            if (mInputView5 != null) {
                mInputView5.mo112753a(true);
            }
            AbstractC71284d mInputView6 = this.f159837a.getMInputView();
            if (mInputView6 != null) {
                user = (User) mInputView6.getCurModel();
            } else {
                user = null;
            }
            if (!C89219l.m154714a((Object) C73998bn.m130142a(user), (Object) obj)) {
                AbstractC71284d mInputView7 = this.f159837a.getMInputView();
                if (mInputView7 != null) {
                    User user2 = new User();
                    if (obj != null) {
                        str = obj;
                    }
                    user2.setUniqueId(str);
                    C71323a aVar = this.f159837a.f159834m;
                    if (aVar == null) {
                        C89219l.m154710a("mMentionSearchListView");
                    }
                    aVar.setSelectedUser$tools_camera_edit_release(user2);
                    mInputView7.setCurModel(user2);
                }
                if (this.f159837a.getMInputView() != null) {
                    this.f159837a.mo112717a(obj);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.MentionStickerEditingLayout$b */
    public static final class C71320b implements C71323a.AbstractC71325a {

        /* renamed from: a */
        final /* synthetic */ MentionStickerEditingLayout f159838a;

        static {
            Covode.recordClassIndex(83843);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C71320b(MentionStickerEditingLayout mentionStickerEditingLayout) {
            this.f159838a = mentionStickerEditingLayout;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.C71323a.AbstractC71325a
        /* renamed from: a */
        public final void mo112807a(User user) {
            AbstractC71284d mInputView = this.f159838a.getMInputView();
            if (mInputView != null) {
                mInputView.setCurModel(user);
            }
            AbstractC71284d mInputView2 = this.f159838a.getMInputView();
            if (mInputView2 != null) {
                mInputView2.mo112756d();
            }
            this.f159838a.mo112721e();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.MentionStickerEditingLayout$c */
    public static final class C71321c implements InputFilter {

        /* renamed from: a */
        final /* synthetic */ MentionStickerEditingLayout f159839a;

        static {
            Covode.recordClassIndex(83844);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C71321c(MentionStickerEditingLayout mentionStickerEditingLayout) {
            this.f159839a = mentionStickerEditingLayout;
        }

        public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            if (spanned == null) {
                C89219l.m154715b();
            }
            int length = 50 - (spanned.length() - (i4 - i3));
            int i5 = i2 - i;
            if (length < i5) {
                new C79459a(this.f159839a.getContext()).mo123050a(R.string.b09).mo123053a();
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
        C71323a aVar = this.f159834m;
        if (aVar == null) {
            C89219l.m154710a("mMentionSearchListView");
        }
        aVar.setVisibility(i);
        if (i == 0) {
            C71323a aVar2 = this.f159834m;
            if (aVar2 == null) {
                C89219l.m154710a("mMentionSearchListView");
            }
            aVar2.setAlpha(1.0f);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.p3820a.AbstractC71277b
    /* renamed from: a */
    public final void mo112714a(ViewGroup viewGroup) {
        MethodCollector.m26663i(12545);
        Context context = getContext();
        C89219l.m154716b(context, "");
        C71323a aVar = new C71323a(context, (byte) 0);
        this.f159834m = aVar;
        aVar.setCallback(new C71320b(this));
        if (viewGroup != null) {
            C71323a aVar2 = this.f159834m;
            if (aVar2 == null) {
                C89219l.m154710a("mMentionSearchListView");
            }
            viewGroup.addView(aVar2, new FrameLayout.LayoutParams(-1, -2, 80));
            MethodCollector.m26664o(12545);
            return;
        }
        MethodCollector.m26664o(12545);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.p3820a.AbstractC71277b
    public final void setSearchListMarginBottom(int i) {
        C71323a aVar = this.f159834m;
        if (aVar == null) {
            C89219l.m154710a("mMentionSearchListView");
        }
        ViewGroup.LayoutParams layoutParams = aVar.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        if (layoutParams2 != null) {
            layoutParams2.bottomMargin = i;
        }
        C71323a aVar2 = this.f159834m;
        if (aVar2 == null) {
            C89219l.m154710a("mMentionSearchListView");
        }
        aVar2.requestLayout();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.p3820a.AbstractC71277b
    /* renamed from: a */
    public final void mo112717a(String str) {
        boolean z;
        List<User> list;
        C71323a aVar = this.f159834m;
        if (aVar == null) {
            C89219l.m154710a("mMentionSearchListView");
        }
        if (!C89219l.m154714a((Object) aVar.f159845d.f159887c, (Object) str)) {
            aVar.getFetchedUidSet().clear();
        }
        aVar.mo112814b(0);
        if (str != null) {
            C71339c cVar = aVar.f159845d;
            C89219l.m154721d(str, "");
            cVar.f159887c = str;
            List<User> list2 = null;
            if (!TextUtils.isEmpty(str)) {
                if (!aVar.getMSummonFriendSearchPresenter().mo112788c()) {
                    aVar.getMSummonFriendSearchPresenter().f159791c = aVar;
                }
                if (aVar.f159844c.getItemCount() == 0) {
                    aVar.mo112814b(0);
                }
                ArrayList arrayList = new ArrayList();
                C71351b.C71352a.C71353a aVar2 = aVar.f159844c.f159866e;
                if (aVar2 != null) {
                    arrayList.addAll(aVar2.f159916a);
                    arrayList.addAll(aVar2.f159917b);
                    arrayList.addAll(aVar2.f159916a);
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    User user = (User) obj;
                    if (user.getFollowStatus() == 1 || user.getFollowStatus() == 2) {
                        arrayList2.add(obj);
                    }
                }
                aVar.f159843b.mo112837a(str, arrayList2).mo5534a(new C71323a.C71331g(aVar, str), C1731i.f5564c, null);
                return;
            }
            List<? extends User> list3 = aVar.f159844c.f159863b;
            if (list3 == null || list3.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C71351b.C71352a.C71353a aVar3 = aVar.f159844c.f159866e;
                if (aVar3 == null || (list = aVar3.f159921f) == null || list.isEmpty()) {
                    aVar.mo112814b(0);
                    aVar.mo112810a();
                    return;
                }
                C71332a aVar4 = aVar.f159844c;
                C71351b.C71352a.C71353a aVar5 = aVar.f159844c.f159866e;
                if (aVar5 != null) {
                    list2 = aVar5.f159921f;
                }
                aVar4.f159863b = list2;
                aVar.f159844c.notifyDataSetChanged();
                aVar.f159842a.mo4413b(0);
                aVar.mo112811a(-1);
                return;
            }
            aVar.mo112811a(-1);
            aVar.f159842a.mo4413b(0);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MentionStickerEditingLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C89219l.m154721d(context, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.MentionStickerEditingLayout$d */
    static final class C71322d implements InputFilter {

        /* renamed from: a */
        public static final C71322d f159840a = new C71322d();

        static {
            Covode.recordClassIndex(83845);
        }

        C71322d() {
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
