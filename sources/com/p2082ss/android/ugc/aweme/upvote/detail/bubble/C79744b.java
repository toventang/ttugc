package com.p2082ss.android.ugc.aweme.upvote.detail.bubble;

import android.animation.Animator;
import android.animation.ValueAnimator;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageView;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.tux.business.upvote.UpvoteBubbleView;
import com.p2082ss.android.ugc.aweme.upvote.detail.bubble.C79736a;
import com.p2082ss.android.ugc.aweme.upvote.p4188b.C79706b;
import com.p2082ss.android.ugc.aweme.upvote.p4189c.C79714h;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.trill.R;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.upvote.detail.bubble.b */
public final class C79744b {

    /* renamed from: a */
    public static final C79744b f178927a = new C79744b();

    private C79744b() {
    }

    static {
        Covode.recordClassIndex(92967);
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.bubble.b$d */
    public static final class C79748d implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ C79736a.C79737a f178933a;

        /* renamed from: b */
        final /* synthetic */ float f178934b;

        static {
            Covode.recordClassIndex(92971);
        }

        public final void onAnimationEnd(Animator animator) {
            C89219l.m154719c(animator, "");
        }

        public final void onAnimationRepeat(Animator animator) {
            C89219l.m154719c(animator, "");
        }

        public final void onAnimationStart(Animator animator) {
            C89219l.m154719c(animator, "");
        }

        public final void onAnimationCancel(Animator animator) {
            C89219l.m154719c(animator, "");
            this.f178933a.f178920a.setAlpha(1.0f);
            this.f178933a.f178920a.setTranslationY(this.f178934b);
        }

        public C79748d(C79736a.C79737a aVar, float f) {
            this.f178933a = aVar;
            this.f178934b = f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.bubble.b$f */
    public static final class C79750f implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ C79736a.C79737a f178937a;

        /* renamed from: b */
        final /* synthetic */ float f178938b;

        static {
            Covode.recordClassIndex(92973);
        }

        public final void onAnimationEnd(Animator animator) {
            C89219l.m154719c(animator, "");
        }

        public final void onAnimationRepeat(Animator animator) {
            C89219l.m154719c(animator, "");
        }

        public final void onAnimationStart(Animator animator) {
            C89219l.m154719c(animator, "");
        }

        public final void onAnimationCancel(Animator animator) {
            C89219l.m154719c(animator, "");
            this.f178937a.f178921b.setAlpha(0.0f);
            this.f178937a.f178921b.setTranslationY(this.f178938b);
        }

        public C79750f(C79736a.C79737a aVar, float f) {
            this.f178937a = aVar;
            this.f178938b = f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.bubble.b$c */
    static final class C79747c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C79736a.C79737a f178931a;

        /* renamed from: b */
        final /* synthetic */ float f178932b;

        static {
            Covode.recordClassIndex(92970);
        }

        C79747c(C79736a.C79737a aVar, float f) {
            this.f178931a = aVar;
            this.f178932b = f;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            this.f178931a.f178920a.setAlpha(1.0f - floatValue);
            this.f178931a.f178920a.setTranslationY(this.f178932b - (floatValue * ((float) C79736a.f178908e)));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.bubble.b$e */
    static final class C79749e implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C79736a.C79737a f178935a;

        /* renamed from: b */
        final /* synthetic */ float f178936b;

        static {
            Covode.recordClassIndex(92972);
        }

        C79749e(C79736a.C79737a aVar, float f) {
            this.f178935a = aVar;
            this.f178936b = f;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            this.f178935a.f178921b.setAlpha(floatValue);
            this.f178935a.f178921b.setTranslationY(this.f178936b + ((1.0f - floatValue) * ((float) C79736a.f178908e)));
        }
    }

    /* renamed from: a */
    public static void m138588a(AvatarImageView avatarImageView, UrlModel urlModel) {
        if (urlModel != null) {
            C34577e.m70592a(avatarImageView, urlModel);
        } else {
            avatarImageView.setActualImageResource(R.raw.icon_color_default_avatar);
        }
        avatarImageView.setVisibility(0);
    }

    /* renamed from: a */
    public static void m138590a(UpvoteBubbleView upvoteBubbleView, C79714h hVar) {
        C89219l.m154721d(upvoteBubbleView, "");
        C89219l.m154721d(hVar, "");
        upvoteBubbleView.setAvatar(new C79745a(hVar));
        String text = hVar.getText();
        if (text == null || text.length() == 0) {
            m138589a(upvoteBubbleView, hVar.getUser());
        } else {
            upvoteBubbleView.mo123068a(true, hVar.getText(), null);
        }
    }

    /* renamed from: a */
    private static void m138589a(UpvoteBubbleView upvoteBubbleView, User user) {
        String a;
        String str = "";
        if (C80580in.m139694g(user)) {
            String string = upvoteBubbleView.getContext().getString(((Number) C79706b.m138537a(Integer.valueOf((int) R.string.f6q), Integer.valueOf((int) R.string.fb0))).intValue());
            C89219l.m154716b(string, str);
            upvoteBubbleView.mo123068a(false, string, null);
            return;
        }
        String string2 = upvoteBubbleView.getContext().getString(((Number) C79706b.m138537a(Integer.valueOf((int) R.string.f6p), Integer.valueOf((int) R.string.faz))).intValue());
        C89219l.m154716b(string2, str);
        if (!(user == null || (a = C80580in.m139677a(user, false)) == null)) {
            str = a;
        }
        upvoteBubbleView.mo123068a(false, string2, str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.bubble.b$a */
    public static final class C79745a extends AbstractC89220m implements AbstractC89187q<AvatarImageView, AvatarImageView, AvatarImageView, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C79714h f178928a;

        static {
            Covode.recordClassIndex(92968);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79745a(C79714h hVar) {
            super(3);
            this.f178928a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(AvatarImageView avatarImageView, AvatarImageView avatarImageView2, AvatarImageView avatarImageView3) {
            UrlModel urlModel;
            AvatarImageView avatarImageView4 = avatarImageView;
            AvatarImageView avatarImageView5 = avatarImageView2;
            AvatarImageView avatarImageView6 = avatarImageView3;
            C89219l.m154721d(avatarImageView4, "");
            C89219l.m154721d(avatarImageView5, "");
            C89219l.m154721d(avatarImageView6, "");
            avatarImageView5.setVisibility(8);
            avatarImageView6.setVisibility(8);
            User user = this.f178928a.getUser();
            if (user != null) {
                urlModel = user.getAvatarThumb();
            } else {
                urlModel = null;
            }
            C79744b.m138588a(avatarImageView4, urlModel);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.bubble.b$b */
    public static final class C79746b extends AbstractC89220m implements AbstractC89187q<AvatarImageView, AvatarImageView, AvatarImageView, C89391z> {

        /* renamed from: a */
        final /* synthetic */ int f178929a;

        /* renamed from: b */
        final /* synthetic */ List f178930b;

        static {
            Covode.recordClassIndex(92969);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79746b(int i, List list) {
            super(3);
            this.f178929a = i;
            this.f178930b = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(AvatarImageView avatarImageView, AvatarImageView avatarImageView2, AvatarImageView avatarImageView3) {
            User user;
            UrlModel urlModel;
            User user2;
            User user3;
            UrlModel urlModel2;
            UrlModel urlModel3;
            User user4;
            User user5;
            User user6;
            AvatarImageView avatarImageView4 = avatarImageView;
            AvatarImageView avatarImageView5 = avatarImageView2;
            AvatarImageView avatarImageView6 = avatarImageView3;
            C89219l.m154721d(avatarImageView4, "");
            C89219l.m154721d(avatarImageView5, "");
            C89219l.m154721d(avatarImageView6, "");
            int i = this.f178929a;
            UrlModel urlModel4 = null;
            if (i == 1) {
                avatarImageView6.setVisibility(8);
                avatarImageView5.setVisibility(8);
                C79714h hVar = (C79714h) C89070n.m154561b(this.f178930b, 0);
                if (!(hVar == null || (user = hVar.getUser()) == null)) {
                    urlModel4 = user.getAvatarThumb();
                }
                C79744b.m138588a(avatarImageView4, urlModel4);
            } else if (i != 2) {
                C79714h hVar2 = (C79714h) C89070n.m154561b(this.f178930b, 0);
                if (hVar2 == null || (user6 = hVar2.getUser()) == null) {
                    urlModel2 = null;
                } else {
                    urlModel2 = user6.getAvatarThumb();
                }
                C79744b.m138588a(avatarImageView4, urlModel2);
                C79714h hVar3 = (C79714h) C89070n.m154561b(this.f178930b, 1);
                if (hVar3 == null || (user5 = hVar3.getUser()) == null) {
                    urlModel3 = null;
                } else {
                    urlModel3 = user5.getAvatarThumb();
                }
                C79744b.m138588a(avatarImageView5, urlModel3);
                C79714h hVar4 = (C79714h) C89070n.m154561b(this.f178930b, 2);
                if (!(hVar4 == null || (user4 = hVar4.getUser()) == null)) {
                    urlModel4 = user4.getAvatarThumb();
                }
                C79744b.m138588a(avatarImageView6, urlModel4);
            } else {
                avatarImageView6.setVisibility(8);
                C79714h hVar5 = (C79714h) C89070n.m154561b(this.f178930b, 0);
                if (hVar5 == null || (user3 = hVar5.getUser()) == null) {
                    urlModel = null;
                } else {
                    urlModel = user3.getAvatarThumb();
                }
                C79744b.m138588a(avatarImageView4, urlModel);
                C79714h hVar6 = (C79714h) C89070n.m154561b(this.f178930b, 1);
                if (!(hVar6 == null || (user2 = hVar6.getUser()) == null)) {
                    urlModel4 = user2.getAvatarThumb();
                }
                C79744b.m138588a(avatarImageView5, urlModel4);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static void m138591a(UpvoteBubbleView upvoteBubbleView, List<C79714h> list, int i) {
        C89219l.m154721d(upvoteBubbleView, "");
        C89219l.m154721d(list, "");
        upvoteBubbleView.setAvatar(new C79746b(i, list));
        User user = null;
        if (i == 1) {
            C79714h hVar = (C79714h) C89070n.m154561b((List) list, 0);
            if (hVar != null) {
                user = hVar.getUser();
            }
            m138589a(upvoteBubbleView, user);
            return;
        }
        String quantityString = upvoteBubbleView.getResources().getQuantityString(((Number) C79706b.m138537a(Integer.valueOf((int) R.plurals.h6), Integer.valueOf((int) R.plurals.hc))).intValue(), i);
        C89219l.m154716b(quantityString, "");
        String a = C1764a.m5928a(quantityString, Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
        C89219l.m154716b(a, "");
        upvoteBubbleView.mo123068a(false, a, null);
    }
}
