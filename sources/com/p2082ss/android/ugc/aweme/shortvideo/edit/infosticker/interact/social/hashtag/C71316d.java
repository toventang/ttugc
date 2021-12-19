package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.hashtag;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.editSticker.p2883f.C45886d;
import com.p2082ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p2082ss.android.ugc.aweme.shortvideo.C71852g;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.p3820a.AbstractC71277b;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.p3820a.AbstractC71284d;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.p3820a.C71286e;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.p3825ui.SocialTouchableEditText;
import com.p2082ss.android.ugc.aweme.sticker.data.HashtagStruct;
import com.p2082ss.android.ugc.aweme.video.hashtag.C80735b;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.hashtag.d */
public final class C71316d extends C71286e<C80735b> {

    /* renamed from: q */
    public static final C71317a f159830q = new C71317a((byte) 0);

    static {
        Covode.recordClassIndex(83837);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.hashtag.d$a */
    public static final class C71317a {
        static {
            Covode.recordClassIndex(83838);
        }

        private C71317a() {
        }

        public /* synthetic */ C71317a(byte b) {
            this();
        }
    }

    public final HashtagStruct getHashTagStruct() {
        HashtagStruct hashTagStruct;
        AbstractC71284d mBaseView = getMBaseView();
        if (!(mBaseView instanceof C71312b)) {
            mBaseView = null;
        }
        C71312b bVar = (C71312b) mBaseView;
        if (bVar == null || (hashTagStruct = bVar.getHashTagStruct()) == null) {
            return new HashtagStruct();
        }
        return hashTagStruct;
    }

    public C71316d(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo112801a(AbstractC71277b<C80735b> bVar, HashtagStruct hashtagStruct) {
        MethodCollector.m26663i(12771);
        if (getMBaseView() == null && bVar != null) {
            setMBaseView(bVar.mo112718b());
            AbstractC71284d mBaseView = getMBaseView();
            if (mBaseView != null) {
                AVChallenge aVChallenge = new AVChallenge();
                if (hashtagStruct != null) {
                    aVChallenge.challengeName = hashtagStruct.getHashtagName();
                }
                C71852g gVar = new C71852g();
                gVar.f161024a = aVChallenge;
                mBaseView.setCurModel(C80735b.m139992a(gVar, false));
                mBaseView.mo112756d();
                SocialTouchableEditText mEditTextView = mBaseView.getMEditTextView();
                mEditTextView.setMode(true);
                C45886d.m88529a((EditText) mEditTextView, false);
            } else {
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.hashtag.HashTagStickerInputView");
                MethodCollector.m26664o(12771);
                throw nullPointerException;
            }
        }
        View view = this.f106955g;
        if (view != null) {
            ((ViewGroup) view).removeAllViews();
            View view2 = this.f106955g;
            if (view2 != null) {
                ((ViewGroup) view2).addView(getMBaseView());
                MethodCollector.m26664o(12771);
                return;
            }
            NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
            MethodCollector.m26664o(12771);
            throw nullPointerException2;
        }
        NullPointerException nullPointerException3 = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        MethodCollector.m26664o(12771);
        throw nullPointerException3;
    }
}
