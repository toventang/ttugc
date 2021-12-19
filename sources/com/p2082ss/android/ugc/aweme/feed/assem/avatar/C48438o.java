package com.p2082ss.android.ugc.aweme.feed.assem.avatar;

import android.view.View;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.assem.arch.p795b.C12661l;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRoute;
import com.facebook.drawee.p1855f.C24246a;
import com.p2082ss.android.ugc.aweme.awemeservice.RequestIdService;
import com.p2082ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.p2082ss.android.ugc.aweme.base.p2379ui.SmartAvatarBorderView;
import com.p2082ss.android.ugc.aweme.feed.AvatarImageWithLive;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.LiveCircleView;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.story.C77260g;
import com.p2082ss.android.ugc.aweme.story.avatar.AbstractC76504c;
import com.p2082ss.android.ugc.aweme.story.avatar.AbstractC76506d;
import com.p2082ss.android.ugc.aweme.story.avatar.AbstractC76508e;
import com.p2082ss.android.ugc.aweme.story.avatar.EnumC76586o;
import com.p2082ss.android.ugc.aweme.tux.business.story.EnumC79475a;
import com.p2082ss.android.ugc.aweme.tux.business.story.StoryBrandView;
import java.util.HashMap;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.assem.avatar.o */
public final class C48438o {

    /* renamed from: a */
    SmartAvatarBorderView f112166a;

    /* renamed from: b */
    public StoryBrandView f112167b;

    /* renamed from: c */
    AvatarImageWithLive f112168c;

    /* renamed from: d */
    LiveCircleView f112169d;

    /* renamed from: e */
    public boolean f112170e;

    /* renamed from: f */
    public final C48383a f112171f;

    /* renamed from: g */
    private final AbstractC89244h f112172g = C89250i.m154773a((AbstractC89171a) new C48439a(this));

    static {
        Covode.recordClassIndex(57212);
    }

    /* renamed from: c */
    private final AbstractC76506d m91870c() {
        return (AbstractC76506d) this.f112172g.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.avatar.o$a */
    static final class C48439a extends AbstractC89220m implements AbstractC89171a<AbstractC76506d> {

        /* renamed from: a */
        final /* synthetic */ C48438o f112173a;

        static {
            Covode.recordClassIndex(57213);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48439a(C48438o oVar) {
            super(0);
            this.f112173a = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC76506d invoke() {
            AbstractC76506d a;
            AbstractC76504c d = C77260g.f173332a.mo120156d();
            if (d == null || (a = d.mo120228a(new AbstractC76508e(this) {
                /* class com.p2082ss.android.ugc.aweme.feed.assem.avatar.C48438o.C48439a.C484401 */

                /* renamed from: a */
                final /* synthetic */ C48439a f112174a;

                static {
                    Covode.recordClassIndex(57214);
                }

                @Override // com.p2082ss.android.ugc.aweme.story.avatar.AbstractC76508e
                /* renamed from: c */
                public final EnumC76586o mo80539c() {
                    return EnumC76586o.FEED;
                }

                @Override // com.p2082ss.android.ugc.aweme.story.avatar.AbstractC76508e
                /* renamed from: b */
                public final /* bridge */ /* synthetic */ AbstractC1204m mo80538b() {
                    return this.f112174a.f112173a.f112171f;
                }

                @Override // com.p2082ss.android.ugc.aweme.story.avatar.AbstractC76508e
                /* renamed from: a */
                public final StoryBrandView mo80534a() {
                    return C48438o.m91867a(this.f112174a.f112173a);
                }

                @Override // com.p2082ss.android.ugc.aweme.story.avatar.AbstractC76548h
                /* renamed from: d */
                public final boolean mo80540d() {
                    if (this.f112174a.f112173a.mo80532a()) {
                        return false;
                    }
                    return true;
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f112174a = r1;
                }

                @Override // com.p2082ss.android.ugc.aweme.story.avatar.AbstractC76508e
                /* renamed from: a */
                public final void mo80535a(SmartRoute smartRoute, Aweme aweme) {
                    String str = "";
                    C89219l.m154721d(smartRoute, str);
                    C89219l.m154721d(aweme, str);
                    String str2 = ((VideoItemParams) C12661l.m22797a(this.f112174a.f112173a.f112171f)).mEventType;
                    if (str2 != null) {
                        str = str2;
                    }
                    smartRoute.withParam("enter_from", str).withParam("story_req_id", this.f112174a.f112173a.mo80533b());
                }

                @Override // com.p2082ss.android.ugc.aweme.story.avatar.AbstractC76548h
                /* renamed from: a */
                public final void mo80536a(boolean z, EnumC79475a aVar) {
                    C89219l.m154721d(aVar, "");
                    int i = !z ? 1 : 0;
                    SmartAvatarBorderView smartAvatarBorderView = this.f112174a.f112173a.f112166a;
                    if (smartAvatarBorderView == null) {
                        C89219l.m154710a("avatarView");
                    }
                    smartAvatarBorderView.setBorderWidth(i);
                    C24246a aVar2 = (C24246a) smartAvatarBorderView.getHierarchy();
                    C89219l.m154716b(aVar2, "");
                    aVar2.mo39959a(aVar2.f57470a);
                }

                @Override // com.p2082ss.android.ugc.aweme.story.avatar.AbstractC76547g
                /* renamed from: a */
                public final boolean mo80537a(String str, HashMap<String, String> hashMap) {
                    String str2 = "";
                    C89219l.m154721d(str, str2);
                    C89219l.m154721d(hashMap, str2);
                    if (C89219l.m154714a((Object) str, (Object) "story_show")) {
                        if (this.f112174a.f112173a.f112170e) {
                            return false;
                        }
                        this.f112174a.f112173a.f112170e = true;
                    }
                    String str3 = ((VideoItemParams) C12661l.m22797a(this.f112174a.f112173a.f112171f)).mEventType;
                    if (str3 == null) {
                        str3 = str2;
                    }
                    hashMap.put("enter_from", str3);
                    String b = this.f112174a.f112173a.mo80533b();
                    if (b != null) {
                        str2 = b;
                    }
                    hashMap.put("req_id", str2);
                    return true;
                }
            })) == null) {
                return null;
            }
            C48438o.m91867a(this.f112173a).addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC48441a(this));
            return a;
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.assem.avatar.o$a$a */
        public static final class View$OnAttachStateChangeListenerC48441a implements View.OnAttachStateChangeListener {

            /* renamed from: a */
            final /* synthetic */ C48439a f112175a;

            static {
                Covode.recordClassIndex(57215);
            }

            public final void onViewDetachedFromWindow(View view) {
            }

            View$OnAttachStateChangeListenerC48441a(C48439a aVar) {
                this.f112175a = aVar;
            }

            public final void onViewAttachedToWindow(View view) {
                this.f112175a.f112173a.f112170e = false;
            }
        }
    }

    /* renamed from: d */
    private final boolean m91871d() {
        if (C89219l.m154714a((Object) ((VideoItemParams) C12661l.m22797a(this.f112171f)).mEventType, (Object) "homepage_hot") || C89219l.m154714a((Object) ((VideoItemParams) C12661l.m22797a(this.f112171f)).mEventType, (Object) "homepage_follow")) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final String mo80533b() {
        Aweme aweme;
        IRequestIdService a = RequestIdService.m70076a();
        VideoItemParams videoItemParams = (VideoItemParams) C12661l.m22797a(this.f112171f);
        Integer num = null;
        if (videoItemParams != null) {
            aweme = videoItemParams.mAweme;
        } else {
            aweme = null;
        }
        VideoItemParams videoItemParams2 = (VideoItemParams) C12661l.m22797a(this.f112171f);
        if (videoItemParams2 != null) {
            num = Integer.valueOf(videoItemParams2.mPageType);
        }
        return a.mo60693a(aweme, num.intValue());
    }

    /* renamed from: a */
    public final boolean mo80532a() {
        AvatarImageWithLive avatarImageWithLive = this.f112168c;
        if (avatarImageWithLive == null) {
            C89219l.m154710a("avatarLiveView");
        }
        if (avatarImageWithLive.getVisibility() == 0) {
            return true;
        }
        LiveCircleView liveCircleView = this.f112169d;
        if (liveCircleView == null) {
            C89219l.m154710a("avatarBorderView");
        }
        if (liveCircleView.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final /* synthetic */ StoryBrandView m91867a(C48438o oVar) {
        StoryBrandView storyBrandView = oVar.f112167b;
        if (storyBrandView == null) {
            C89219l.m154710a("storyBrandView");
        }
        return storyBrandView;
    }

    public C48438o(C48383a aVar) {
        C89219l.m154721d(aVar, "");
        this.f112171f = aVar;
    }

    /* renamed from: a */
    private static boolean m91869a(Aweme aweme) {
        if (aweme == null || aweme.getAwemeType() != 40) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo80531a(VideoItemParams videoItemParams) {
        C89219l.m154721d(videoItemParams, "");
        Aweme aweme = ((VideoItemParams) C12661l.m22797a(this.f112171f)).mAweme;
        C89219l.m154716b(aweme, "");
        m91868a(aweme.getAuthor(), aweme);
    }

    /* renamed from: a */
    private final void m91868a(User user, Aweme aweme) {
        boolean z = !m91869a(aweme);
        boolean a = mo80532a();
        boolean d = m91871d();
        if (!z || a || !d) {
            user = null;
        }
        AbstractC76506d c = m91870c();
        if (c != null) {
            c.mo120241a(user, true);
        }
    }
}
