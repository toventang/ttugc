package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention;

import android.content.Context;
import android.graphics.Typeface;
import android.text.Editable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.p3820a.AbstractC71284d;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.p3825ui.SocialTouchableEditText;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73998bn;
import com.p2082ss.android.ugc.aweme.sticker.data.MentionStruct;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.c */
public final class C71364c extends AbstractC71284d<User> {

    /* renamed from: d */
    private SocialTouchableEditText f159941d;

    /* renamed from: e */
    private TextView f159942e;

    static {
        Covode.recordClassIndex(83887);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.p3820a.AbstractC71284d
    public final int getLayoutResId() {
        return R.layout.ag9;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.p3820a.AbstractC71284d
    /* renamed from: c */
    public final LinearLayout mo112755c() {
        View findViewById = findViewById(R.id.cj8);
        Objects.requireNonNull(findViewById, "null cannot be cast to non-null type android.widget.LinearLayout");
        return (LinearLayout) findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.p3820a.AbstractC71284d
    public final String getContent() {
        return C73998bn.m130142a((User) getCurModel());
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.p3820a.AbstractC71284d
    /* renamed from: a */
    public final SocialTouchableEditText mo112752a() {
        View findViewById = findViewById(R.id.axc);
        C89219l.m154716b(findViewById, "");
        SocialTouchableEditText socialTouchableEditText = (SocialTouchableEditText) findViewById;
        this.f159941d = socialTouchableEditText;
        if (socialTouchableEditText == null) {
            C89219l.m154710a("editText");
        }
        return socialTouchableEditText;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.p3820a.AbstractC71284d
    /* renamed from: b */
    public final TextView mo112754b() {
        View findViewById = findViewById(R.id.ey5);
        C89219l.m154716b(findViewById, "");
        TextView textView = (TextView) findViewById;
        this.f159942e = textView;
        if (textView == null) {
            C89219l.m154710a("iconView");
        }
        Context context = getContext();
        C89219l.m154716b(context, "");
        textView.setTypeface(Typeface.createFromAsset(context.getAssets(), "mention_and_hashtag.ttf"));
        TextView textView2 = this.f159942e;
        if (textView2 == null) {
            C89219l.m154710a("iconView");
        }
        textView2.setText("@");
        TextView textView3 = this.f159942e;
        if (textView3 == null) {
            C89219l.m154710a("iconView");
        }
        return textView3;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.p3820a.AbstractC71284d
    /* renamed from: g */
    public final void mo112759g() {
        SocialTouchableEditText socialTouchableEditText = this.f159941d;
        if (socialTouchableEditText == null) {
            C89219l.m154710a("editText");
        }
        Context context = getContext();
        C89219l.m154716b(context, "");
        socialTouchableEditText.setHint(context.getResources().getString(R.string.axe));
    }

    public final MentionStruct getMentionStruct() {
        User user = (User) getCurModel();
        if (user == null) {
            return new MentionStruct();
        }
        String uid = user.getUid();
        String str = "";
        if (uid == null) {
            uid = str;
        }
        String secUid = user.getSecUid();
        if (secUid != null) {
            str = secUid;
        }
        String a = C73998bn.m130142a(user);
        String a2 = C73998bn.m130142a(user);
        UrlModel avatarThumb = user.getAvatarThumb();
        if (avatarThumb == null) {
            avatarThumb = null;
        }
        return new MentionStruct(uid, str, a, a2, avatarThumb);
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
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71364c(Context context) {
        super(context);
        C89219l.m154721d(context, "");
    }
}
