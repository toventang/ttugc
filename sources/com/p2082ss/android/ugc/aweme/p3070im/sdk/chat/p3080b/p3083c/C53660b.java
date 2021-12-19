package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.p3083c;

import android.graphics.drawable.Animatable;
import android.util.LruCache;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.p1215e.C17453a;
import com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.p1399im.core.p1408d.C19672u;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.facebook.drawee.p1851c.AbstractC24203d;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.p1885j.AbstractC24457f;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.p2304af.C33429a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.AwemeDetailList;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.AwemeStatusBean;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.ShareAwemeContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.ShareStoryContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3132a.AbstractC54386c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3170a.C55048a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3172c.C55061a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.AbstractC55207e;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55231t;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.p3185c.C55198a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.api.C55257a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.api.C55262b;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.story.C77260g;
import com.p2082ss.android.ugc.aweme.tux.business.story.StoryBrandView;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89517an;
import kotlinx.coroutines.C89546bf;
import kotlinx.coroutines.C89624i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4604a.EnumC89098a;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.b.c.b */
public final class C53660b {

    /* renamed from: a */
    public static AbstractC54386c f123120a;

    /* renamed from: b */
    public static String f123121b = "";

    /* renamed from: c */
    public static String f123122c = "";

    /* renamed from: d */
    public static AbstractC89516am f123123d = C89517an.m155448a(C89546bf.f203266a);

    /* renamed from: e */
    public static final LruCache<String, C53661a> f123124e = new LruCache<>(100);

    /* renamed from: f */
    public static final C53660b f123125f = new C53660b();

    /* renamed from: g */
    private static final AbstractC89244h f123126g = C89250i.m154773a((AbstractC89171a) C53667e.f123145a);

    /* renamed from: a */
    public static Map<RemoteImageView, AbstractC89172b<Boolean, C89391z>> m98933a() {
        return (Map) f123126g.getValue();
    }

    private C53660b() {
    }

    /* renamed from: a */
    public static void m98940a(ShareAwemeContent shareAwemeContent, AwemeStatusBean awemeStatusBean, Aweme aweme) {
        f123124e.put(shareAwemeContent.getItemId(), new C53661a(awemeStatusBean, aweme));
    }

    /* renamed from: a */
    public static final boolean m98945a(C19538ai aiVar) {
        return C89219l.m154714a((Object) aiVar.getLocalExt().get("story_video_is_expired"), (Object) "1");
    }

    /* renamed from: a */
    public static final void m98943a(String str, String str2, View view, C19538ai aiVar, ShareAwemeContent shareAwemeContent, AbstractC89172b<? super Boolean, C89391z> bVar) {
        if (C55048a.m100666a()) {
            RemoteImageView remoteImageView = (RemoteImageView) view.findViewById(R.id.ad3);
            C89219l.m154716b(remoteImageView, "");
            remoteImageView.setVisibility(8);
            ((RemoteImageView) view.findViewById(R.id.ad7)).setBackgroundResource(R.drawable.avg);
            ((TuxIconView) view.findViewById(R.id.ez7)).setIconRes(R.raw.icon_spinner_normal);
            TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.byh);
            C89219l.m154716b(tuxIconView, "");
            tuxIconView.setVisibility(4);
            boolean z = false;
            ((RelativeLayout) view.findViewById(R.id.zi)).setBackgroundColor(0);
            boolean a = m98945a(aiVar);
            boolean z2 = !C89219l.m154714a((Object) str, (Object) "0");
            boolean b = m98949b(shareAwemeContent);
            if (ShareStoryContent.Companion.isStory(shareAwemeContent) && !C77260g.f173332a.mo120146a()) {
                z = true;
            }
            if ((!a || b) && !z2) {
                if (!z) {
                    m98948b(view, aiVar, shareAwemeContent, bVar);
                    return;
                }
            } else if (!z) {
                if (a) {
                    str2 = view.getContext().getString(R.string.h5g);
                    str = "1025";
                }
                m98942a(str, aiVar, shareAwemeContent);
                m98936a(view, str2);
                return;
            }
            str2 = view.getContext().getString(R.string.h8o);
            str = "1026";
            m98942a(str, aiVar, shareAwemeContent);
            m98936a(view, str2);
            return;
        }
        RemoteImageView remoteImageView2 = (RemoteImageView) view.findViewById(R.id.ad3);
        C89219l.m154716b(remoteImageView2, "");
        remoteImageView2.setVisibility(8);
        ((RemoteImageView) view.findViewById(R.id.ad7)).setBackgroundResource(R.drawable.avk);
        m98941a(str, view, aiVar, shareAwemeContent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0097, code lost:
        if (com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.ShareStoryContent.Companion.isStory(r15) != false) goto L_0x0060;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void m98941a(java.lang.String r12, android.view.View r13, com.bytedance.p1399im.core.p1408d.C19538ai r14, com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.ShareAwemeContent r15) {
        /*
        // Method dump skipped, instructions count: 165
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.p3083c.C53660b.m98941a(java.lang.String, android.view.View, com.bytedance.im.core.d.ai, com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareAwemeContent):void");
    }

    /* renamed from: a */
    public static final boolean m98946a(C19538ai aiVar, AwemeStatusBean awemeStatusBean, Aweme aweme) {
        boolean z;
        String valueOf = String.valueOf(awemeStatusBean.getStatus());
        String statusText = awemeStatusBean.getStatusText();
        if (m98947a(aiVar, valueOf, statusText)) {
            aiVar.addLocalExt("feed_video_status_flag", valueOf);
            if (statusText != null) {
                aiVar.addLocalExt("feed_video_status_text", statusText);
            } else {
                aiVar.clearLocalExt("feed_video_status_text");
            }
            z = true;
        } else {
            z = false;
        }
        if (aweme != null) {
            Video video = aweme.getVideo();
            C89219l.m154716b(video, "");
            UrlModel originCover = video.getOriginCover();
            C89219l.m154716b(originCover, "");
            List<String> urlList = originCover.getUrlList();
            if (urlList != null && urlList.size() > 0) {
                aiVar.addLocalExt("feed_video_origin_cover_url", urlList.get(0));
            }
            User author = aweme.getAuthor();
            C89219l.m154716b(author, "");
            if (author.isAdFake()) {
                User author2 = aweme.getAuthor();
                C89219l.m154716b(author2, "");
                aiVar.addLocalExt("feed_ad_fake_nickname", author2.getNickname());
            }
        }
        aiVar.addLocalExt("feed_video_last_query_time", String.valueOf(System.currentTimeMillis()));
        C55231t.m100999a(aiVar);
        return z;
    }

    /* renamed from: a */
    private static final boolean m98947a(C19538ai aiVar, String str, String str2) {
        String str3 = aiVar.getLocalExt().get("feed_video_status_flag");
        String str4 = aiVar.getLocalExt().get("feed_video_status_text");
        if (str3 == null && C89219l.m154714a((Object) str, (Object) "0")) {
            return false;
        }
        if (C89219l.m154714a((Object) str3, (Object) "0") && C89219l.m154714a((Object) str, (Object) "0")) {
            return false;
        }
        if (!C89219l.m154714a((Object) str3, (Object) str)) {
            return true;
        }
        return !C89219l.m154714a((Object) str4, (Object) str2);
    }

    /* renamed from: a */
    public static final void m98942a(String str, C19538ai aiVar, ShareAwemeContent shareAwemeContent) {
        if (!C89219l.m154714a((Object) aiVar.getLocalExt().get("feed_video_last_unavailable_pid"), (Object) f123121b)) {
            String itemId = shareAwemeContent.getItemId();
            m98944a(aiVar.getConversationId(), shareAwemeContent.getUser(), itemId, str);
            aiVar.addLocalExt("feed_video_last_unavailable_pid", f123121b);
            C55231t.m100999a(aiVar);
        }
    }

    /* renamed from: a */
    private static final void m98944a(String str, String str2, String str3, String str4) {
        C39162r.m79460a("chat_video_cover_failed", new C33744d().mo59983a("enter_from", "chat").mo59983a("process_id", f123121b).mo59983a("conversation_id", str).mo59983a("group_id", str3).mo59983a("to_user_id", str2).mo59983a("error_code", str4).f79943a);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.b.c.b$e */
    static final class C53667e extends AbstractC89220m implements AbstractC89171a<Map<RemoteImageView, AbstractC89172b<? super Boolean, ? extends C89391z>>> {

        /* renamed from: a */
        public static final C53667e f123145a = new C53667e();

        static {
            Covode.recordClassIndex(63247);
        }

        C53667e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Map<RemoteImageView, AbstractC89172b<? super Boolean, ? extends C89391z>> invoke() {
            return new LinkedHashMap();
        }
    }

    static {
        Covode.recordClassIndex(63240);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.b.c.b$h */
    public static final class C53673h implements AbstractC19479b<C19538ai> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89124d f123165a;

        static {
            Covode.recordClassIndex(63253);
        }

        C53673h(AbstractC89124d dVar) {
            this.f123165a = dVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
        /* renamed from: a */
        public final /* synthetic */ void mo27861a(C19538ai aiVar) {
            this.f123165a.resumeWith(C89379q.m157068constructorimpl(aiVar));
        }

        @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
        /* renamed from: a */
        public final void mo27860a(C19672u uVar) {
            Throwable th;
            AbstractC89124d dVar = this.f123165a;
            if (uVar == null || (th = uVar.f46735h) == null) {
                th = new RuntimeException("getMsgByServerId() failed without error");
            }
            dVar.resumeWith(C89379q.m157068constructorimpl(C89382r.m154941a(th)));
        }
    }

    /* renamed from: b */
    private static final boolean m98949b(ShareAwemeContent shareAwemeContent) {
        return C89219l.m154714a((Object) shareAwemeContent.getUser(), (Object) f123122c);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.b.c.b$b */
    public static final class C53662b implements AbstractC24203d<AbstractC24457f> {

        /* renamed from: a */
        final /* synthetic */ View f123130a;

        /* renamed from: b */
        final /* synthetic */ C19538ai f123131b;

        /* renamed from: c */
        final /* synthetic */ ShareAwemeContent f123132c;

        static {
            Covode.recordClassIndex(63242);
        }

        @Override // com.facebook.drawee.p1851c.AbstractC24203d
        public final void onIntermediateImageFailed(String str, Throwable th) {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object] */
        @Override // com.facebook.drawee.p1851c.AbstractC24203d
        public final /* bridge */ /* synthetic */ void onIntermediateImageSet(String str, AbstractC24457f fVar) {
        }

        @Override // com.facebook.drawee.p1851c.AbstractC24203d
        public final void onSubmit(String str, Object obj) {
        }

        @Override // com.facebook.drawee.p1851c.AbstractC24203d
        public final void onRelease(String str) {
            RemoteImageView remoteImageView = (RemoteImageView) this.f123130a.findViewById(R.id.ad7);
            C89219l.m154716b(remoteImageView, "");
            C53660b.m98937a(remoteImageView);
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.b.c.b$b$a */
        static final class C53663a extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

            /* renamed from: a */
            int f123133a;

            /* renamed from: b */
            final /* synthetic */ C53662b f123134b;

            static {
                Covode.recordClassIndex(63243);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C53663a(AbstractC89124d dVar, C53662b bVar) {
                super(2, dVar);
                this.f123134b = bVar;
            }

            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
            public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                C89219l.m154721d(dVar, "");
                return new C53663a(dVar, this.f123134b);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89183m
            public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
                return ((C53663a) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
            }

            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
            public final Object invokeSuspend(Object obj) {
                if (this.f123133a == 0) {
                    C89382r.m154942a(obj);
                    C53660b.m98935a(this.f123134b.f123130a, this.f123134b.f123131b, this.f123134b.f123132c, (AbstractC89172b<? super Boolean, C89391z>) null);
                    return C89391z.f203057a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // com.facebook.drawee.p1851c.AbstractC24203d
        public final void onFailure(String str, Throwable th) {
            C53660b.m98934a(this.f123130a, this.f123131b, this.f123132c);
        }

        C53662b(View view, C19538ai aiVar, ShareAwemeContent shareAwemeContent) {
            this.f123130a = view;
            this.f123131b = aiVar;
            this.f123132c = shareAwemeContent;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
        @Override // com.facebook.drawee.p1851c.AbstractC24203d
        public final /* synthetic */ void onFinalImageSet(String str, AbstractC24457f fVar, Animatable animatable) {
            RemoteImageView remoteImageView = (RemoteImageView) this.f123130a.findViewById(R.id.ad7);
            C89219l.m154716b(remoteImageView, "");
            C53660b.m98937a(remoteImageView);
            String str2 = this.f123131b.getLocalExt().get("feed_video_status_flag");
            if (str2 == null || !(!C89219l.m154714a((Object) str2, (Object) "0"))) {
                ((RelativeLayout) this.f123130a.findViewById(R.id.zi)).setBackgroundResource(2131232754);
                TuxIconView tuxIconView = (TuxIconView) this.f123130a.findViewById(R.id.byh);
                C89219l.m154716b(tuxIconView, "");
                tuxIconView.setVisibility(0);
                return;
            }
            AbstractC89568bz unused = C89624i.m155555a(C89517an.m155448a(C33429a.f79465a), null, null, new C53663a(null, this), 3);
        }
    }

    /* renamed from: a */
    public static final void m98937a(RemoteImageView remoteImageView) {
        AbstractC89568bz unused = C89624i.m155555a(C89517an.m155448a(C33429a.f79465a), null, null, new C53677j(remoteImageView, null), 3);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.b.c.b$c */
    public static final class C53664c implements AbstractC24203d<AbstractC24457f> {

        /* renamed from: a */
        final /* synthetic */ C19538ai f123135a;

        /* renamed from: b */
        final /* synthetic */ ShareAwemeContent f123136b;

        /* renamed from: c */
        final /* synthetic */ View f123137c;

        static {
            Covode.recordClassIndex(63244);
        }

        @Override // com.facebook.drawee.p1851c.AbstractC24203d
        public final void onIntermediateImageFailed(String str, Throwable th) {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object] */
        @Override // com.facebook.drawee.p1851c.AbstractC24203d
        public final /* bridge */ /* synthetic */ void onIntermediateImageSet(String str, AbstractC24457f fVar) {
        }

        @Override // com.facebook.drawee.p1851c.AbstractC24203d
        public final void onRelease(String str) {
        }

        @Override // com.facebook.drawee.p1851c.AbstractC24203d
        public final void onSubmit(String str, Object obj) {
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.b.c.b$c$a */
        static final class C53665a extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

            /* renamed from: a */
            int f123138a;

            /* renamed from: b */
            final /* synthetic */ C53664c f123139b;

            static {
                Covode.recordClassIndex(63245);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C53665a(AbstractC89124d dVar, C53664c cVar) {
                super(2, dVar);
                this.f123139b = cVar;
            }

            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
            public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                C89219l.m154721d(dVar, "");
                return new C53665a(dVar, this.f123139b);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89183m
            public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
                return ((C53665a) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
            }

            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
            public final Object invokeSuspend(Object obj) {
                if (this.f123138a == 0) {
                    C89382r.m154942a(obj);
                    C53660b.m98935a(this.f123139b.f123137c, this.f123139b.f123135a, this.f123139b.f123136b, (AbstractC89172b<? super Boolean, C89391z>) null);
                    return C89391z.f203057a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // com.facebook.drawee.p1851c.AbstractC24203d
        public final void onFailure(String str, Throwable th) {
            C53660b.m98942a("0", this.f123135a, this.f123136b);
        }

        C53664c(C19538ai aiVar, ShareAwemeContent shareAwemeContent, View view) {
            this.f123135a = aiVar;
            this.f123136b = shareAwemeContent;
            this.f123137c = view;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
        @Override // com.facebook.drawee.p1851c.AbstractC24203d
        public final /* synthetic */ void onFinalImageSet(String str, AbstractC24457f fVar, Animatable animatable) {
            String str2 = this.f123135a.getLocalExt().get("feed_video_status_flag");
            if (str2 != null && (!C89219l.m154714a((Object) str2, (Object) "0"))) {
                AbstractC89568bz unused = C89624i.m155555a(C89517an.m155448a(C33429a.f79465a), null, null, new C53665a(null, this), 3);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.b.c.b$j */
    public static final class C53677j extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f123179a;

        /* renamed from: b */
        final /* synthetic */ RemoteImageView f123180b;

        static {
            Covode.recordClassIndex(63257);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53677j(RemoteImageView remoteImageView, AbstractC89124d dVar) {
            super(2, dVar);
            this.f123180b = remoteImageView;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C53677j(this.f123180b, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C53677j) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            if (this.f123179a == 0) {
                C89382r.m154942a(obj);
                AbstractC89172b<Boolean, C89391z> bVar = C53660b.m98933a().get(this.f123180b);
                if (bVar != null) {
                    bVar.invoke(false);
                    C53660b.m98933a().remove(this.f123180b);
                }
                return C89391z.f203057a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: a */
    public static C89378p<AwemeStatusBean, Aweme> m98932a(ShareAwemeContent shareAwemeContent) {
        C53661a aVar = f123124e.get(shareAwemeContent.getItemId());
        if (aVar != null) {
            if (System.currentTimeMillis() - aVar.f123129c <= C55061a.m100701a()) {
                return C89387v.m154943a(aVar.f123127a, aVar.f123128b);
            }
        }
        return null;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.b.c.b$g */
    public static final class C53672g extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        Object f123161a;

        /* renamed from: b */
        Object f123162b;

        /* renamed from: c */
        int f123163c;

        /* renamed from: d */
        final /* synthetic */ List f123164d;

        static {
            Covode.recordClassIndex(63252);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53672g(List list, AbstractC89124d dVar) {
            super(2, dVar);
            this.f123164d = list;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C53672g(this.f123164d, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C53672g) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            Set set;
            ArrayList<C19538ai> arrayList;
            boolean z;
            EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
            int i = this.f123163c;
            if (i == 0) {
                C89382r.m154942a(obj);
                List list = this.f123164d;
                ArrayList arrayList2 = new ArrayList();
                Iterator it = list.iterator();
                while (true) {
                    boolean z2 = false;
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    C19538ai aiVar = (C19538ai) next;
                    if (aiVar.getMsgType() == 8 || aiVar.getMsgType() == 1025) {
                        z2 = true;
                    }
                    if (z2) {
                        arrayList2.add(next);
                    }
                }
                arrayList = arrayList2;
                if (arrayList.isEmpty()) {
                    return C89391z.f203057a;
                }
                set = new LinkedHashSet();
                for (C19538ai aiVar2 : arrayList) {
                    BaseContent b = EnumC53772b.C53814f.m99071b(aiVar2);
                    Objects.requireNonNull(b, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareAwemeContent");
                    ShareAwemeContent shareAwemeContent = (ShareAwemeContent) b;
                    String itemId = shareAwemeContent.getItemId();
                    if (itemId == null) {
                        itemId = "";
                    }
                    if (itemId.length() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z && C53660b.m98932a(shareAwemeContent) == null) {
                        set.add(itemId);
                    }
                }
                try {
                    String obj2 = set.toString();
                    this.f123161a = arrayList;
                    this.f123162b = set;
                    this.f123163c = 1;
                    obj = C55262b.m101021a(obj2, "chat", this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } catch (Exception e) {
                    C56244a.m102187a("AwemeCoverManager", e);
                }
            } else if (i == 1) {
                set = (Set) this.f123162b;
                arrayList = (List) this.f123161a;
                C89382r.m154942a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C53660b.m98939a((AwemeDetailList) obj, arrayList, set);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.b.c.b$i */
    public static final class C53674i extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        Object f123166a;

        /* renamed from: b */
        int f123167b;

        /* renamed from: c */
        final /* synthetic */ Long f123168c;

        /* renamed from: d */
        final /* synthetic */ String f123169d;

        /* renamed from: e */
        final /* synthetic */ AbstractC24203d f123170e;

        /* renamed from: f */
        final /* synthetic */ ShareAwemeContent f123171f;

        /* renamed from: g */
        final /* synthetic */ RemoteImageView f123172g;

        static {
            Covode.recordClassIndex(63254);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53674i(Long l, String str, AbstractC24203d dVar, ShareAwemeContent shareAwemeContent, RemoteImageView remoteImageView, AbstractC89124d dVar2) {
            super(2, dVar2);
            this.f123168c = l;
            this.f123169d = str;
            this.f123170e = dVar;
            this.f123171f = shareAwemeContent;
            this.f123172g = remoteImageView;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C53674i(this.f123168c, this.f123169d, this.f123170e, this.f123171f, this.f123172g, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C53674i) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:26:0x0081  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0093  */
        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
            // Method dump skipped, instructions count: 185
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.p3083c.C53660b.C53674i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.b.c.b$f */
    public static final class C53668f extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f123146a;

        /* renamed from: b */
        final /* synthetic */ ShareAwemeContent f123147b;

        /* renamed from: c */
        final /* synthetic */ C55257a.AbstractC55258a f123148c;

        /* renamed from: d */
        final /* synthetic */ View f123149d;

        /* renamed from: e */
        final /* synthetic */ C19538ai f123150e;

        /* renamed from: f */
        private /* synthetic */ Object f123151f;

        static {
            Covode.recordClassIndex(63248);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53668f(ShareAwemeContent shareAwemeContent, C55257a.AbstractC55258a aVar, View view, C19538ai aiVar, AbstractC89124d dVar) {
            super(2, dVar);
            this.f123147b = shareAwemeContent;
            this.f123148c = aVar;
            this.f123149d = view;
            this.f123150e = aiVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            C53668f fVar = new C53668f(this.f123147b, this.f123148c, this.f123149d, this.f123150e, dVar);
            fVar.f123151f = obj;
            return fVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C53668f) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x0064  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0069  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x007d  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x0082  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x008a  */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x00ba  */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x0104 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x0105  */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x010b  */
        /* JADX WARNING: Removed duplicated region for block: B:53:0x010e  */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x0114  */
        /* JADX WARNING: Removed duplicated region for block: B:56:0x0117  */
        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
            // Method dump skipped, instructions count: 316
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.p3083c.C53660b.C53668f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.b.c.b$a */
    public static final class C53661a {

        /* renamed from: a */
        public final AwemeStatusBean f123127a;

        /* renamed from: b */
        public final Aweme f123128b;

        /* renamed from: c */
        public final long f123129c;

        static {
            Covode.recordClassIndex(63241);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C53661a)) {
                return false;
            }
            C53661a aVar = (C53661a) obj;
            return C89219l.m154714a(this.f123127a, aVar.f123127a) && C89219l.m154714a(this.f123128b, aVar.f123128b) && this.f123129c == aVar.f123129c;
        }

        public final int hashCode() {
            AwemeStatusBean awemeStatusBean = this.f123127a;
            int i = 0;
            int hashCode = (awemeStatusBean != null ? awemeStatusBean.hashCode() : 0) * 31;
            Aweme aweme = this.f123128b;
            if (aweme != null) {
                i = aweme.hashCode();
            }
            long j = this.f123129c;
            return ((hashCode + i) * 31) + ((int) (j ^ (j >>> 32)));
        }

        public final String toString() {
            return "AwemeCacheItem(bean=" + this.f123127a + ", aweme=" + this.f123128b + ", cacheTimestamp=" + this.f123129c + ")";
        }

        public /* synthetic */ C53661a(AwemeStatusBean awemeStatusBean, Aweme aweme) {
            this(awemeStatusBean, aweme, System.currentTimeMillis());
        }

        private C53661a(AwemeStatusBean awemeStatusBean, Aweme aweme, long j) {
            C89219l.m154721d(awemeStatusBean, "");
            this.f123127a = awemeStatusBean;
            this.f123128b = aweme;
            this.f123129c = j;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.b.c.b$d */
    public static final class C53666d implements AbstractC55207e {

        /* renamed from: a */
        final /* synthetic */ ShareAwemeContent f123140a;

        /* renamed from: b */
        final /* synthetic */ RemoteImageView f123141b;

        /* renamed from: c */
        final /* synthetic */ Long f123142c;

        /* renamed from: d */
        final /* synthetic */ String f123143d;

        /* renamed from: e */
        final /* synthetic */ AbstractC24203d f123144e;

        static {
            Covode.recordClassIndex(63246);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.AbstractC55207e
        /* renamed from: a */
        public final void mo90228a() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
        @Override // com.facebook.drawee.p1851c.AbstractC24203d
        public final /* synthetic */ void onFinalImageSet(String str, AbstractC24457f fVar, Animatable animatable) {
            mo90228a();
        }

        @Override // com.facebook.drawee.p1851c.AbstractC24203d
        public final void onIntermediateImageFailed(String str, Throwable th) {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object] */
        @Override // com.facebook.drawee.p1851c.AbstractC24203d
        public final /* bridge */ /* synthetic */ void onIntermediateImageSet(String str, AbstractC24457f fVar) {
        }

        @Override // com.facebook.drawee.p1851c.AbstractC24203d
        public final void onRelease(String str) {
        }

        @Override // com.facebook.drawee.p1851c.AbstractC24203d
        public final void onSubmit(String str, Object obj) {
        }

        @Override // com.facebook.drawee.p1851c.AbstractC24203d
        public final void onFailure(String str, Throwable th) {
            String uri;
            StringBuilder sb = new StringBuilder("Not able to load cover url ");
            UrlModel coverUrl = this.f123140a.getCoverUrl();
            C89219l.m154716b(coverUrl, "");
            if (C17453a.m32408a((Collection<? extends Object>) coverUrl.getUrlList())) {
                UrlModel coverUrl2 = this.f123140a.getCoverUrl();
                C89219l.m154716b(coverUrl2, "");
                uri = coverUrl2.getUrlList().get(0);
            } else {
                UrlModel coverUrl3 = this.f123140a.getCoverUrl();
                C89219l.m154716b(coverUrl3, "");
                uri = coverUrl3.getUri();
            }
            C56244a.m102191c("ReplyMessageLayout", sb.append(uri).toString());
            RemoteImageView remoteImageView = this.f123141b;
            Long l = this.f123142c;
            String str2 = this.f123143d;
            ShareAwemeContent shareAwemeContent = this.f123140a;
            AbstractC89568bz unused = C89624i.m155555a(C53660b.f123123d, C89546bf.f203267b, null, new C53674i(l, str2, this.f123144e, shareAwemeContent, remoteImageView, null), 2);
        }

        C53666d(ShareAwemeContent shareAwemeContent, RemoteImageView remoteImageView, Long l, String str, AbstractC24203d dVar) {
            this.f123140a = shareAwemeContent;
            this.f123141b = remoteImageView;
            this.f123142c = l;
            this.f123143d = str;
            this.f123144e = dVar;
        }
    }

    /* renamed from: a */
    public static final UrlModel m98931a(C19538ai aiVar, ShareAwemeContent shareAwemeContent) {
        boolean z;
        String str = aiVar.getLocalExt().get("feed_video_origin_cover_url");
        if (str == null) {
            return shareAwemeContent.getCoverUrl();
        }
        if (shareAwemeContent.getCoverUrl() == null) {
            shareAwemeContent.setCoverUrl(new UrlModel());
        }
        UrlModel coverUrl = shareAwemeContent.getCoverUrl();
        List<String> urlList = coverUrl.getUrlList();
        if (urlList == null || urlList.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            coverUrl.setUrlList(C89070n.m154524c(str));
            return coverUrl;
        }
        List<String> urlList2 = coverUrl.getUrlList();
        C89219l.m154716b(urlList2, "");
        if (!(!C89219l.m154714a(C89070n.m154586h((List) urlList2), (Object) str))) {
            return coverUrl;
        }
        try {
            coverUrl.getUrlList().add(str);
            return coverUrl;
        } catch (UnsupportedOperationException unused) {
            List<String> urlList3 = coverUrl.getUrlList();
            C89219l.m154716b(urlList3, "");
            List<String> g = C89070n.m154585g((Collection) urlList3);
            g.add(str);
            coverUrl.setUrlList(g);
            return coverUrl;
        }
    }

    /* renamed from: a */
    private static final void m98936a(View view, String str) {
        ((RemoteImageView) view.findViewById(R.id.ad7)).setBackgroundResource(R.drawable.avg);
        ((SimpleDraweeView) view.findViewById(R.id.ad7)).setActualImageResource(R.drawable.avg);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.ad_);
        C89219l.m154716b(linearLayout, "");
        linearLayout.setVisibility(0);
        ((TuxTextView) view.findViewById(R.id.adk)).setTextColor(C0643b.m2378c(view.getContext(), R.color.bx));
        if (str != null) {
            TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.ad9);
            C89219l.m154716b(tuxTextView, "");
            tuxTextView.setVisibility(0);
            TuxTextView tuxTextView2 = (TuxTextView) view.findViewById(R.id.ad9);
            C89219l.m154716b(tuxTextView2, "");
            tuxTextView2.setText(str);
        } else {
            TuxTextView tuxTextView3 = (TuxTextView) view.findViewById(R.id.ad9);
            C89219l.m154716b(tuxTextView3, "");
            tuxTextView3.setVisibility(8);
        }
        StoryBrandView storyBrandView = (StoryBrandView) view.findViewById(R.id.e9t);
        C89219l.m154716b(storyBrandView, "");
        storyBrandView.setVisibility(8);
    }

    /* renamed from: a */
    public static void m98934a(View view, C19538ai aiVar, ShareAwemeContent shareAwemeContent) {
        RemoteImageView remoteImageView = (RemoteImageView) view.findViewById(R.id.ad7);
        C89219l.m154716b(remoteImageView, "");
        m98937a(remoteImageView);
        ((RemoteImageView) view.findViewById(R.id.ad7)).setBackgroundResource(R.drawable.avh);
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.byh);
        C89219l.m154716b(tuxIconView, "");
        tuxIconView.setVisibility(0);
        ((TuxTextView) view.findViewById(R.id.adk)).setTextColor(C0643b.m2378c(view.getContext(), R.color.bx));
        m98942a("0", aiVar, shareAwemeContent);
    }

    /* renamed from: a */
    public static final void m98939a(AwemeDetailList awemeDetailList, List<C19538ai> list, Set<String> set) {
        List<AwemeStatusBean> list2;
        List<Aweme> list3 = null;
        if (awemeDetailList != null) {
            list2 = awemeDetailList.getAwemeStatus();
            list3 = awemeDetailList.getAwemeList();
        } else {
            list2 = null;
        }
        if (list2 == null) {
            C56244a.m102193e("AwemeCoverManager", "server returned null list");
            return;
        }
        if (list2.size() != set.size()) {
            C56244a.m102193e("AwemeCoverManager", "server returned " + list2.size() + " aweme status info but query for " + set.size());
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (T t : list2) {
            if (t == null) {
                C56244a.m102193e("AwemeCoverManager", "returned null bean");
            } else if (t.getAwemeId() == null || t.getStatus() == null) {
                C56244a.m102193e("AwemeCoverManager", "returned bean id: " + t.getAwemeId() + " / status: " + t.getStatus());
            } else {
                String awemeId = t.getAwemeId();
                if (awemeId == null) {
                    C89219l.m154715b();
                }
                if (!set.contains(awemeId)) {
                    C56244a.m102193e("AwemeCoverManager", "returned wrong aweme id " + t.getAwemeId());
                } else {
                    String awemeId2 = t.getAwemeId();
                    if (awemeId2 == null) {
                        C89219l.m154715b();
                    }
                    linkedHashMap.put(awemeId2, t);
                    Integer status = t.getStatus();
                    int parseInt = Integer.parseInt("0");
                    if ((status == null || status.intValue() != parseInt) && t.getStatusText() == null) {
                        C56244a.m102193e("AwemeCoverManager", "returned bean id: " + t.getAwemeId() + " has status: " + t.getStatus() + " but text is null");
                    }
                }
            }
        }
        if (list3 != null) {
            for (T t2 : list3) {
                String aid = t2.getAid();
                C89219l.m154716b(aid, "");
                linkedHashMap2.put(aid, t2);
            }
        }
        for (T t3 : list) {
            BaseContent b = EnumC53772b.C53814f.m99071b(t3);
            Objects.requireNonNull(b, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareAwemeContent");
            ShareAwemeContent shareAwemeContent = (ShareAwemeContent) b;
            String itemId = shareAwemeContent.getItemId();
            AwemeStatusBean awemeStatusBean = (AwemeStatusBean) linkedHashMap.get(itemId);
            if (awemeStatusBean == null) {
                C56244a.m102193e("AwemeCoverManager", "aweme id: " + itemId + " not returned");
            } else {
                Aweme aweme = (Aweme) linkedHashMap2.get(itemId);
                if (aweme == null) {
                    Integer status2 = awemeStatusBean.getStatus();
                    int parseInt2 = Integer.parseInt("0");
                    if (status2 != null && status2.intValue() == parseInt2) {
                        C56244a.m102193e("AwemeCoverManager", "aweme id: " + itemId + " is Normal but detail not returned");
                    }
                }
                m98946a((C19538ai) t3, awemeStatusBean, aweme);
                m98940a(shareAwemeContent, awemeStatusBean, aweme);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: java.util.Map<com.ss.android.ugc.aweme.base.ui.RemoteImageView, h.f.a.b<java.lang.Boolean, h.z>> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    private static final void m98948b(View view, C19538ai aiVar, ShareAwemeContent shareAwemeContent, AbstractC89172b<? super Boolean, C89391z> bVar) {
        int i = 8;
        if (bVar != null) {
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.ad_);
            C89219l.m154716b(linearLayout, "");
            linearLayout.setVisibility(8);
            bVar.invoke(true);
            Map<RemoteImageView, AbstractC89172b<Boolean, C89391z>> a = m98933a();
            View findViewById = view.findViewById(R.id.ad7);
            C89219l.m154716b(findViewById, "");
            a.put(findViewById, bVar);
        }
        ((TuxTextView) view.findViewById(R.id.adk)).setTextColor(C0643b.m2378c(view.getContext(), R.color.a9));
        UrlModel a2 = m98931a(aiVar, shareAwemeContent);
        if (a2 == null) {
            m98934a(view, aiVar, shareAwemeContent);
            return;
        }
        C55198a.m100930a((RemoteImageView) view.findViewById(R.id.ad7), a2, new C53662b(view, aiVar, shareAwemeContent));
        StoryBrandView storyBrandView = (StoryBrandView) view.findViewById(R.id.e9t);
        C89219l.m154716b(storyBrandView, "");
        if (ShareStoryContent.Companion.isStory(shareAwemeContent)) {
            i = 0;
        }
        storyBrandView.setVisibility(i);
    }

    /* renamed from: a */
    public static final void m98935a(View view, C19538ai aiVar, ShareAwemeContent shareAwemeContent, AbstractC89172b<? super Boolean, C89391z> bVar) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(aiVar, "");
        C89219l.m154721d(shareAwemeContent, "");
        if (aiVar.getMsgType() == 1025) {
            ShareStoryContent.Companion companion = ShareStoryContent.Companion;
            Objects.requireNonNull(shareAwemeContent, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareStoryContent");
            boolean isStoryExpired = companion.isStoryExpired((ShareStoryContent) shareAwemeContent);
            boolean a = m98945a(aiVar);
            boolean b = m98949b(shareAwemeContent);
            if (isStoryExpired) {
                if (!b && !a) {
                    Map<String, String> localExt = aiVar.getLocalExt();
                    C89219l.m154716b(localExt, "");
                    localExt.put("story_video_is_expired", "1");
                }
            } else if (a) {
                aiVar.getLocalExt().remove("story_video_is_expired");
            }
        }
        String str = aiVar.getLocalExt().get("feed_video_status_flag");
        if (str == null) {
            str = "0";
        }
        m98943a(str, aiVar.getLocalExt().get("feed_video_status_text"), view, aiVar, shareAwemeContent, bVar);
    }

    /* renamed from: a */
    public static final void m98938a(RemoteImageView remoteImageView, Long l, String str, ShareAwemeContent shareAwemeContent, AbstractC24203d<AbstractC24457f> dVar) {
        C89219l.m154721d(remoteImageView, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(shareAwemeContent, "");
        C89219l.m154721d(dVar, "");
        C55198a.m100930a(remoteImageView, shareAwemeContent.getCoverUrl(), new C53666d(shareAwemeContent, remoteImageView, l, str, dVar));
    }
}
