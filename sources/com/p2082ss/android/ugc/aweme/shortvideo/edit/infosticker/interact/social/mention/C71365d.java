package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.editSticker.p2883f.C45886d;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.p3820a.AbstractC71277b;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.p3820a.AbstractC71284d;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.p3820a.C71286e;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.p3825ui.SocialTouchableEditText;
import com.p2082ss.android.ugc.aweme.sticker.data.MentionStruct;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.d */
public final class C71365d extends C71286e<User> {

    /* renamed from: q */
    public static final C71366a f159943q = new C71366a((byte) 0);

    static {
        Covode.recordClassIndex(83888);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.d$a */
    public static final class C71366a {
        static {
            Covode.recordClassIndex(83889);
        }

        private C71366a() {
        }

        public /* synthetic */ C71366a(byte b) {
            this();
        }
    }

    public final MentionStruct getMentionStruct() {
        MentionStruct mentionStruct;
        AbstractC71284d mBaseView = getMBaseView();
        if (!(mBaseView instanceof C71364c)) {
            mBaseView = null;
        }
        C71364c cVar = (C71364c) mBaseView;
        if (cVar == null || (mentionStruct = cVar.getMentionStruct()) == null) {
            return new MentionStruct();
        }
        return mentionStruct;
    }

    public C71365d(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo112846a(AbstractC71277b<User> bVar, MentionStruct mentionStruct) {
        MethodCollector.m26663i(12413);
        if (getMBaseView() == null && bVar != null) {
            setMBaseView(bVar.mo112718b());
            AbstractC71284d mBaseView = getMBaseView();
            if (mBaseView != null) {
                User user = new User();
                if (mentionStruct != null) {
                    String userId = mentionStruct.getUserId();
                    if (userId == null || userId.length() == 0) {
                        user.setNickname(mentionStruct.getUsername());
                    } else {
                        user.setUid(mentionStruct.getUserId());
                        user.setSecUid(mentionStruct.getSecUid());
                        user.setNickname(mentionStruct.getUsername());
                        user.setAvatarThumb(mentionStruct.getAvatarUrl());
                    }
                }
                mBaseView.setCurModel(user);
                mBaseView.mo112756d();
                SocialTouchableEditText mEditTextView = mBaseView.getMEditTextView();
                mEditTextView.setMode(true);
                C45886d.m88529a((EditText) mEditTextView, false);
            } else {
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.MentionStickerInputView");
                MethodCollector.m26664o(12413);
                throw nullPointerException;
            }
        }
        View view = this.f106955g;
        if (view != null) {
            ((ViewGroup) view).removeAllViews();
            View view2 = this.f106955g;
            if (view2 != null) {
                ((ViewGroup) view2).addView(getMBaseView());
                MethodCollector.m26664o(12413);
                return;
            }
            NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
            MethodCollector.m26664o(12413);
            throw nullPointerException2;
        }
        NullPointerException nullPointerException3 = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        MethodCollector.m26664o(12413);
        throw nullPointerException3;
    }
}
