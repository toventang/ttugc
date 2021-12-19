package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.hashtag;

import android.content.Context;
import android.graphics.Typeface;
import android.text.Editable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.p3820a.AbstractC71284d;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.p3825ui.SocialTouchableEditText;
import com.p2082ss.android.ugc.aweme.sticker.data.HashtagStruct;
import com.p2082ss.android.ugc.aweme.video.hashtag.C80735b;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.hashtag.b */
public final class C71312b extends AbstractC71284d<C80735b> {

    /* renamed from: d */
    private SocialTouchableEditText f159815d;

    static {
        Covode.recordClassIndex(83833);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.p3820a.AbstractC71284d
    public final int getLayoutResId() {
        return R.layout.afm;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.p3820a.AbstractC71284d
    /* renamed from: c */
    public final LinearLayout mo112755c() {
        View findViewById = findViewById(R.id.bdn);
        Objects.requireNonNull(findViewById, "null cannot be cast to non-null type android.widget.LinearLayout");
        return (LinearLayout) findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.p3820a.AbstractC71284d
    /* renamed from: a */
    public final SocialTouchableEditText mo112752a() {
        View findViewById = findViewById(R.id.axb);
        C89219l.m154716b(findViewById, "");
        SocialTouchableEditText socialTouchableEditText = (SocialTouchableEditText) findViewById;
        this.f159815d = socialTouchableEditText;
        if (socialTouchableEditText == null) {
            C89219l.m154710a("editText");
        }
        return socialTouchableEditText;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.p3820a.AbstractC71284d
    public final String getContent() {
        AVChallenge aVChallenge;
        C80735b bVar = (C80735b) getCurModel();
        if (bVar == null || (aVChallenge = bVar.f180510a) == null) {
            return null;
        }
        return aVChallenge.challengeName;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.p3820a.AbstractC71284d
    /* renamed from: b */
    public final TextView mo112754b() {
        TextView textView = (TextView) findViewById(R.id.ey2);
        C89219l.m154716b(textView, "");
        Context context = getContext();
        C89219l.m154716b(context, "");
        textView.setTypeface(Typeface.createFromAsset(context.getAssets(), "mention_and_hashtag.ttf"));
        textView.setText("#");
        return textView;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.p3820a.AbstractC71284d
    /* renamed from: g */
    public final void mo112759g() {
        SocialTouchableEditText socialTouchableEditText = this.f159815d;
        if (socialTouchableEditText == null) {
            C89219l.m154710a("editText");
        }
        Context context = getContext();
        C89219l.m154716b(context, "");
        socialTouchableEditText.setHint(context.getResources().getString(R.string.axb));
    }

    public final HashtagStruct getHashTagStruct() {
        String str;
        AVChallenge aVChallenge;
        if (getCurModel() == null) {
            return new HashtagStruct();
        }
        HashtagStruct hashtagStruct = new HashtagStruct();
        C80735b bVar = (C80735b) getCurModel();
        if (bVar == null || (aVChallenge = bVar.f180510a) == null || (str = aVChallenge.getChallengeName()) == null) {
            str = "";
        }
        hashtagStruct.setHashtagName(str);
        return hashtagStruct;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.p3820a.AbstractC71284d
    /* renamed from: d */
    public final void mo112756d() {
        String str;
        int i;
        String content = getContent();
        Editable text = getMEditTextView().getText();
        if (text != null) {
            str = text.toString();
        } else {
            str = null;
        }
        if (!C89219l.m154714a((Object) str, (Object) content)) {
            getMEditTextView().setText(content);
            getMEditTextView().setHint("");
            SocialTouchableEditText mEditTextView = getMEditTextView();
            if (content != null) {
                i = content.length();
            } else {
                i = 0;
            }
            mEditTextView.setSelection(Math.min(50, i));
            getMEditTextView().requestLayout();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71312b(Context context) {
        super(context);
        C89219l.m154721d(context, "");
    }
}
