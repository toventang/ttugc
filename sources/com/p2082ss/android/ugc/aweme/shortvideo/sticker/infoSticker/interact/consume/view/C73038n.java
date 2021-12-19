package com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.p1477a.C20745e;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.tooltip.p1727a.p1728a.C23322d;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72921b;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3870f.C72931d;
import com.p2082ss.android.ugc.aweme.sticker.C75384i;
import com.p2082ss.android.ugc.aweme.sticker.C75391j;
import com.p2082ss.android.ugc.aweme.sticker.data.HashtagStruct;
import com.p2082ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p2082ss.android.ugc.aweme.sticker.data.MentionStruct;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.n */
public final class C73038n extends AbstractC72946a {

    /* renamed from: a */
    private final AbstractC89244h f163917a;

    /* renamed from: l */
    private final C72931d f163918l;

    static {
        Covode.recordClassIndex(85741);
    }

    /* renamed from: c */
    public final FrameLayout mo115474c() {
        return (FrameLayout) this.f163917a.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72923d
    /* renamed from: h */
    public final void mo115230h() {
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72923d
    /* renamed from: a */
    public final View mo115223a() {
        return mo115474c();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72924e
    /* renamed from: b */
    public final int mo115226b() {
        InteractStickerStruct interactStickerStruct = this.f163692f;
        if (interactStickerStruct != null) {
            return interactStickerStruct.getType();
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.AbstractC72946a
    /* renamed from: e */
    public final View mo115228e() {
        MethodCollector.m26663i(7986);
        View view = new View(this.f163695i);
        MethodCollector.m26664o(7986);
        return view;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.n$h */
    static final class C73049h extends AbstractC89220m implements AbstractC89171a<FrameLayout> {

        /* renamed from: a */
        final /* synthetic */ Context f163931a;

        static {
            Covode.recordClassIndex(85752);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C73049h(Context context) {
            super(0);
            this.f163931a = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ FrameLayout invoke() {
            MethodCollector.m26663i(7575);
            FrameLayout frameLayout = new FrameLayout(this.f163931a);
            frameLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            MethodCollector.m26664o(7575);
            return frameLayout;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.n$a */
    public static final class RunnableC73039a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C73038n f163919a;

        static {
            Covode.recordClassIndex(85742);
        }

        RunnableC73039a(C73038n nVar) {
            this.f163919a = nVar;
        }

        public final void run() {
            MentionStruct mentionInfo;
            InteractStickerStruct interactStickerStruct = this.f163919a.f163692f;
            if (interactStickerStruct != null && (mentionInfo = interactStickerStruct.getMentionInfo()) != null) {
                SmartRouter.buildRoute(this.f163919a.f163695i, "//user/profile").withParam("uid", mentionInfo.getUserId()).withParam("sec_user_id", mentionInfo.getSecUid()).open();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.n$b */
    public static final class RunnableC73040b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C73038n f163920a;

        static {
            Covode.recordClassIndex(85743);
        }

        RunnableC73040b(C73038n nVar) {
            this.f163920a = nVar;
        }

        public final void run() {
            HashtagStruct hashtagInfo;
            String str;
            C75384i iVar;
            InteractStickerStruct interactStickerStruct = this.f163920a.f163692f;
            if (interactStickerStruct != null && (hashtagInfo = interactStickerStruct.getHashtagInfo()) != null) {
                SmartRoute withParam = SmartRouter.buildRoute(this.f163920a.f163695i, "//challenge/detail").withParam("id", hashtagInfo.getHashtagName());
                C75391j jVar = this.f163920a.f163697k;
                if (jVar == null || (iVar = jVar.f169463r) == null) {
                    str = null;
                } else {
                    str = iVar.f169427a;
                }
                withParam.withParam("extra_challenge_from", str).withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_CHALLENGE_TYPE", 0).withParam("extra_challenge_is_hashtag", true).open(0);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.AbstractC72946a
    /* renamed from: d */
    public final void mo115227d() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        HashtagStruct hashtagInfo;
        HashtagStruct hashtagInfo2;
        C75384i iVar;
        C75384i iVar2;
        C75384i iVar3;
        C75384i iVar4;
        String str6;
        String str7;
        String str8;
        String str9;
        MentionStruct mentionInfo;
        C75384i iVar5;
        C75384i iVar6;
        C75384i iVar7;
        C75384i iVar8;
        String str10 = null;
        if (this.f163694h == 8) {
            C33744d a = new C33744d().mo59983a("enter_method", "at_prop");
            C75391j jVar = this.f163697k;
            if (jVar == null || (iVar8 = jVar.f169463r) == null) {
                str6 = null;
            } else {
                str6 = iVar8.f169427a;
            }
            C33744d a2 = a.mo59983a("enter_from", str6);
            C75391j jVar2 = this.f163697k;
            if (jVar2 == null || (iVar7 = jVar2.f169463r) == null) {
                str7 = null;
            } else {
                str7 = iVar7.f169428b;
            }
            C33744d a3 = a2.mo59983a("author_id", str7);
            C75391j jVar3 = this.f163697k;
            if (jVar3 == null || (iVar6 = jVar3.f169463r) == null) {
                str8 = null;
            } else {
                str8 = iVar6.f169429c;
            }
            C33744d a4 = a3.mo59983a("group_id", str8);
            C75391j jVar4 = this.f163697k;
            if (jVar4 == null || (iVar5 = jVar4.f169463r) == null) {
                str9 = null;
            } else {
                str9 = iVar5.f169430d;
            }
            C33744d a5 = a4.mo59983a("log_pb", str9);
            InteractStickerStruct interactStickerStruct = this.f163692f;
            if (!(interactStickerStruct == null || (mentionInfo = interactStickerStruct.getMentionInfo()) == null)) {
                str10 = mentionInfo.getUserId();
            }
            C39162r.m79460a("at_prop_click", a5.mo59983a("to_user_id", str10).f79943a);
        } else if (this.f163694h == 9) {
            C33744d dVar = new C33744d();
            C75391j jVar5 = this.f163697k;
            if (jVar5 == null || (iVar4 = jVar5.f169463r) == null) {
                str = null;
            } else {
                str = iVar4.f169427a;
            }
            C33744d a6 = dVar.mo59983a("enter_from", str);
            C75391j jVar6 = this.f163697k;
            if (jVar6 == null || (iVar3 = jVar6.f169463r) == null) {
                str2 = null;
            } else {
                str2 = iVar3.f169428b;
            }
            C33744d a7 = a6.mo59983a("author_id", str2);
            C75391j jVar7 = this.f163697k;
            if (jVar7 == null || (iVar2 = jVar7.f169463r) == null) {
                str3 = null;
            } else {
                str3 = iVar2.f169429c;
            }
            C33744d a8 = a7.mo59983a("group_id", str3);
            C75391j jVar8 = this.f163697k;
            if (jVar8 == null || (iVar = jVar8.f169463r) == null) {
                str4 = null;
            } else {
                str4 = iVar.f169430d;
            }
            C33744d a9 = a8.mo59983a("log_pb", str4);
            InteractStickerStruct interactStickerStruct2 = this.f163692f;
            if (interactStickerStruct2 == null || (hashtagInfo2 = interactStickerStruct2.getHashtagInfo()) == null) {
                str5 = null;
            } else {
                str5 = hashtagInfo2.getHashtagId();
            }
            C33744d a10 = a9.mo59983a("tag_id", str5);
            InteractStickerStruct interactStickerStruct3 = this.f163692f;
            if (!(interactStickerStruct3 == null || (hashtagInfo = interactStickerStruct3.getHashtagInfo()) == null)) {
                str10 = hashtagInfo.getHashtagName();
            }
            C39162r.m79460a("tag_prop_click", a10.mo59983a("tag_name", str10).f79943a);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.AbstractC72946a
    /* renamed from: f */
    public final void mo115229f() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        HashtagStruct hashtagInfo;
        HashtagStruct hashtagInfo2;
        C75384i iVar;
        C75384i iVar2;
        C75384i iVar3;
        C75384i iVar4;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        MentionStruct mentionInfo;
        C75384i iVar5;
        C75384i iVar6;
        C75384i iVar7;
        C75384i iVar8;
        MentionStruct mentionInfo2;
        String str12;
        C75384i iVar9;
        MentionStruct mentionInfo3;
        String str13 = null;
        if (this.f163694h == 8) {
            InteractStickerStruct interactStickerStruct = this.f163692f;
            if (interactStickerStruct == null || (mentionInfo3 = interactStickerStruct.getMentionInfo()) == null) {
                str6 = null;
            } else {
                str6 = mentionInfo3.getUserId();
            }
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            if (C89219l.m154714a((Object) str6, (Object) g.getCurUserId())) {
                C33744d dVar = new C33744d();
                C75391j jVar = this.f163697k;
                if (jVar == null || (iVar9 = jVar.f169463r) == null) {
                    str12 = null;
                } else {
                    str12 = iVar9.f169427a;
                }
                C39162r.m79460a("self_mention_click", dVar.mo59983a("enter_from", str12).f79943a);
            }
            mo115474c().postDelayed(new RunnableC73039a(this), 300);
            C33744d a = new C33744d().mo59983a("enter_method", "at_prop");
            IAccountUserService g2 = C31575b.m65865g();
            C89219l.m154716b(g2, "");
            String curUserId = g2.getCurUserId();
            InteractStickerStruct interactStickerStruct2 = this.f163692f;
            if (interactStickerStruct2 == null || (mentionInfo2 = interactStickerStruct2.getMentionInfo()) == null) {
                str7 = null;
            } else {
                str7 = mentionInfo2.getUserId();
            }
            C33744d a2 = a.mo59980a("self_click", C89219l.m154714a(curUserId, str7) ? 1 : 0);
            C75391j jVar2 = this.f163697k;
            if (jVar2 == null || (iVar8 = jVar2.f169463r) == null) {
                str8 = null;
            } else {
                str8 = iVar8.f169427a;
            }
            C33744d a3 = a2.mo59983a("enter_from", str8);
            C75391j jVar3 = this.f163697k;
            if (jVar3 == null || (iVar7 = jVar3.f169463r) == null) {
                str9 = null;
            } else {
                str9 = iVar7.f169428b;
            }
            C33744d a4 = a3.mo59983a("author_id", str9);
            C75391j jVar4 = this.f163697k;
            if (jVar4 == null || (iVar6 = jVar4.f169463r) == null) {
                str10 = null;
            } else {
                str10 = iVar6.f169429c;
            }
            C33744d a5 = a4.mo59983a("group_id", str10);
            C75391j jVar5 = this.f163697k;
            if (jVar5 == null || (iVar5 = jVar5.f169463r) == null) {
                str11 = null;
            } else {
                str11 = iVar5.f169430d;
            }
            C33744d a6 = a5.mo59983a("log_pb", str11);
            InteractStickerStruct interactStickerStruct3 = this.f163692f;
            if (!(interactStickerStruct3 == null || (mentionInfo = interactStickerStruct3.getMentionInfo()) == null)) {
                str13 = mentionInfo.getUserId();
            }
            C39162r.m79460a("enter_personal_detail", a6.mo59983a("to_user_id", str13).f79943a);
        } else if (this.f163694h == 9) {
            mo115474c().postDelayed(new RunnableC73040b(this), 300);
            C33744d a7 = new C33744d().mo59983a("enter_method", "tag_prop");
            C75391j jVar6 = this.f163697k;
            if (jVar6 == null || (iVar4 = jVar6.f169463r) == null) {
                str = null;
            } else {
                str = iVar4.f169427a;
            }
            C33744d a8 = a7.mo59983a("enter_from", str);
            C75391j jVar7 = this.f163697k;
            if (jVar7 == null || (iVar3 = jVar7.f169463r) == null) {
                str2 = null;
            } else {
                str2 = iVar3.f169428b;
            }
            C33744d a9 = a8.mo59983a("author_id", str2);
            C75391j jVar8 = this.f163697k;
            if (jVar8 == null || (iVar2 = jVar8.f169463r) == null) {
                str3 = null;
            } else {
                str3 = iVar2.f169429c;
            }
            C33744d a10 = a9.mo59983a("group_id", str3);
            C75391j jVar9 = this.f163697k;
            if (jVar9 == null || (iVar = jVar9.f169463r) == null) {
                str4 = null;
            } else {
                str4 = iVar.f169430d;
            }
            C33744d a11 = a10.mo59983a("log_pb", str4);
            InteractStickerStruct interactStickerStruct4 = this.f163692f;
            if (interactStickerStruct4 == null || (hashtagInfo2 = interactStickerStruct4.getHashtagInfo()) == null) {
                str5 = null;
            } else {
                str5 = hashtagInfo2.getHashtagId();
            }
            C33744d a12 = a11.mo59983a("tag_id", str5);
            InteractStickerStruct interactStickerStruct5 = this.f163692f;
            if (!(interactStickerStruct5 == null || (hashtagInfo = interactStickerStruct5.getHashtagInfo()) == null)) {
                str13 = hashtagInfo.getHashtagName();
            }
            C39162r.m79460a("enter_tag_detail", a12.mo59983a("tag_name", str13).f79943a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.n$c */
    public static final class View$OnClickListenerC73041c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C73038n f163921a;

        static {
            Covode.recordClassIndex(85744);
        }

        public View$OnClickListenerC73041c(C73038n nVar) {
            this.f163921a = nVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f163921a.mo115229f();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.n$d */
    public static final class View$OnClickListenerC73042d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C73038n f163922a;

        static {
            Covode.recordClassIndex(85745);
        }

        public View$OnClickListenerC73042d(C73038n nVar) {
            this.f163922a = nVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f163922a.mo115229f();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.n$g */
    public static final class View$OnClickListenerC73048g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C73038n f163930a;

        static {
            Covode.recordClassIndex(85751);
        }

        public View$OnClickListenerC73048g(C73038n nVar) {
            this.f163930a = nVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f163930a.mo115229f();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72922c, com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.AbstractC72946a
    /* renamed from: a */
    public final void mo115236a(C75391j jVar) {
        C89219l.m154721d(jVar, "");
        super.mo115236a(jVar);
        this.f163918l.mo115236a(jVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.n$e */
    public static final class C73043e extends AbstractC89220m implements AbstractC89172b<C23322d, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C73038n f163923a;

        /* renamed from: b */
        final /* synthetic */ String f163924b;

        static {
            Covode.recordClassIndex(85746);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C73043e(C73038n nVar, String str) {
            super(1);
            this.f163923a = nVar;
            this.f163924b = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23322d dVar) {
            String str;
            MentionStruct mentionInfo;
            final C23322d dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            C23322d.C23323a aVar = new C23322d.C23323a();
            InteractStickerStruct interactStickerStruct = this.f163923a.f163692f;
            if (interactStickerStruct == null || (mentionInfo = interactStickerStruct.getMentionInfo()) == null || (str = mentionInfo.getNickname()) == null) {
                str = "";
            }
            aVar.mo38016a(str);
            aVar.f55276c = new AbstractC89172b<ImageView, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C73038n.C73043e.C730441 */

                /* renamed from: a */
                final /* synthetic */ C73043e f163925a;

                static {
                    Covode.recordClassIndex(85747);
                }

                {
                    this.f163925a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(ImageView imageView) {
                    ImageView imageView2 = imageView;
                    C89219l.m154721d(imageView2, "");
                    C20766v a = C20761r.m39061a(this.f163925a.f163924b);
                    C20745e.C20746a aVar = new C20745e.C20746a();
                    aVar.f48957a = true;
                    a.f49126w = aVar.mo34169a();
                    a.f49093F = imageView2;
                    a.mo34186c();
                    ViewGroup.LayoutParams layoutParams = imageView2.getLayoutParams();
                    C89219l.m154716b(layoutParams, "");
                    layoutParams.height = (int) C13628n.m24520b(dVar2.f55273b, 24.0f);
                    layoutParams.width = (int) C13628n.m24520b(dVar2.f55273b, 24.0f);
                    imageView2.setLayoutParams(layoutParams);
                    return C89391z.f203057a;
                }
            };
            aVar.f55279f = new View.OnClickListener(this) {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C73038n.C73043e.View$OnClickListenerC730452 */

                /* renamed from: a */
                final /* synthetic */ C73043e f163927a;

                static {
                    Covode.recordClassIndex(85748);
                }

                {
                    this.f163927a = r1;
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    this.f163927a.f163923a.mo115229f();
                }
            };
            dVar2.mo38014a(aVar);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.n$f */
    public static final class C73046f extends AbstractC89220m implements AbstractC89172b<C23322d, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C73038n f163928a;

        static {
            Covode.recordClassIndex(85749);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C73046f(C73038n nVar) {
            super(1);
            this.f163928a = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23322d dVar) {
            C23322d dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            C23322d.C23323a aVar = new C23322d.C23323a();
            String string = dVar2.f55273b.getResources().getString(R.string.ca1);
            C89219l.m154716b(string, "");
            aVar.mo38016a(string);
            aVar.f55279f = new View.OnClickListener(this) {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C73038n.C73046f.View$OnClickListenerC730471 */

                /* renamed from: a */
                final /* synthetic */ C73046f f163929a;

                static {
                    Covode.recordClassIndex(85750);
                }

                {
                    this.f163929a = r1;
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    this.f163929a.f163928a.mo115229f();
                }
            };
            dVar2.mo38014a(aVar);
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72922c
    /* renamed from: a */
    public final boolean mo115224a(long j, int i, float f, float f2) {
        return this.f163918l.mo115224a(j, i, f, f2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73038n(int i, Context context, View view, InteractStickerStruct interactStickerStruct, C75391j jVar) {
        super(i, context, view, interactStickerStruct, jVar);
        C89219l.m154721d(context, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(interactStickerStruct, "");
        this.f163917a = C89250i.m154773a((AbstractC89171a) new C73049h(context));
        this.f163918l = new C72931d(context, this, interactStickerStruct, jVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72922c
    /* renamed from: a */
    public final boolean mo115225a(long j, int i, float f, float f2, AbstractC72921b bVar) {
        C89219l.m154721d(bVar, "");
        return this.f163918l.mo115225a(j, i, f, f2, bVar);
    }
}
