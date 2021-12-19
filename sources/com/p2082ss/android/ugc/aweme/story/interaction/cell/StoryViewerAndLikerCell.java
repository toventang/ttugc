package com.p2082ss.android.ugc.aweme.story.interaction.cell;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.p1198d.C17191a;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20745e;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.base.p2379ui.SmartAvatarImageView;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.emoji.views.StoryEmojiReactionView;
import com.p2082ss.android.ugc.aweme.follow.NewFollowButton;
import com.p2082ss.android.ugc.aweme.follow.widet.C51086a;
import com.p2082ss.android.ugc.aweme.metrics.C59252q;
import com.p2082ss.android.ugc.aweme.metrics.C59256u;
import com.p2082ss.android.ugc.aweme.metrics.C59260v;
import com.p2082ss.android.ugc.aweme.notice.api.helper.IMainServiceHelper;
import com.p2082ss.android.ugc.aweme.p3070im.IIMAdapterService;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.service.IMAdapterServiceImpl;
import com.p2082ss.android.ugc.aweme.p3070im.service.IIMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56245a;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.services.MainServiceHelperImpl;
import com.p2082ss.android.ugc.aweme.story.interaction.p4057b.C77303h;
import com.p2082ss.android.ugc.aweme.story.interaction.p4057b.C77306j;
import com.p2082ss.android.ugc.aweme.story.model.C77378a;
import com.p2082ss.android.ugc.aweme.utils.C80581io;
import com.p2082ss.android.ugc.trill.R;
import java.util.Iterator;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.interaction.cell.StoryViewerAndLikerCell */
public final class StoryViewerAndLikerCell extends PowerCell<C77303h> {

    /* renamed from: a */
    public NewFollowButton f173500a;

    /* renamed from: b */
    private final AbstractC89244h f173501b = C89250i.m154773a((AbstractC89171a) new C77332a(this));

    /* renamed from: j */
    private SmartImageView f173502j;

    /* renamed from: k */
    private TuxIconView f173503k;

    /* renamed from: l */
    private TuxTextView f173504l;

    /* renamed from: m */
    private TuxTextView f173505m;

    /* renamed from: n */
    private TuxTextView f173506n;

    /* renamed from: o */
    private ImageView f173507o;

    static {
        Covode.recordClassIndex(90355);
    }

    /* renamed from: a */
    private final C51086a m135224a() {
        return (C51086a) this.f173501b.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.story.interaction.cell.StoryViewerAndLikerCell$a */
    static final class C77332a extends AbstractC89220m implements AbstractC89171a<C51086a> {

        /* renamed from: a */
        final /* synthetic */ StoryViewerAndLikerCell f173508a;

        static {
            Covode.recordClassIndex(90356);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77332a(StoryViewerAndLikerCell storyViewerAndLikerCell) {
            super(0);
            this.f173508a = storyViewerAndLikerCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C51086a invoke() {
            return new C51086a(StoryViewerAndLikerCell.m135223a(this.f173508a), new C51086a.C51094g(this) {
                /* class com.p2082ss.android.ugc.aweme.story.interaction.cell.StoryViewerAndLikerCell.C77332a.C773331 */

                /* renamed from: a */
                final /* synthetic */ C77332a f173509a;

                static {
                    Covode.recordClassIndex(90357);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f173509a = r1;
                }

                @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.C51094g, com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51093f
                /* renamed from: a */
                public final void mo63346a(int i, User user) {
                    C77306j jVar;
                    C77303h hVar = (C77303h) this.f173509a.f173508a.f42160d;
                    String str = null;
                    if (hVar != null && (jVar = hVar.f173428c) != null) {
                        C59260v vVar = new C59260v();
                        String str2 = jVar.f173430b;
                        if (str2 == null) {
                            str2 = "";
                        }
                        C59260v a = vVar.mo96847a(str2);
                        a.f135409s = jVar.f173431c;
                        if (user != null) {
                            str = user.getUid();
                        }
                        a.f135405e = str;
                        a.f135406p = jVar.f173432d;
                        a.f135222V = jVar.f173433e;
                        a.f135223W = jVar.f173434f;
                        a.mo96752b_(jVar.f173435g).mo96792f();
                    }
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.interaction.cell.StoryViewerAndLikerCell$b */
    static final class View$OnClickListenerC77334b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ StoryViewerAndLikerCell f173510a;

        /* renamed from: b */
        final /* synthetic */ User f173511b;

        static {
            Covode.recordClassIndex(90358);
        }

        View$OnClickListenerC77334b(StoryViewerAndLikerCell storyViewerAndLikerCell, User user) {
            this.f173510a = storyViewerAndLikerCell;
            this.f173511b = user;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f173510a.mo120919a(this.f173511b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.interaction.cell.StoryViewerAndLikerCell$c */
    static final class View$OnClickListenerC77335c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ StoryViewerAndLikerCell f173512a;

        /* renamed from: b */
        final /* synthetic */ User f173513b;

        static {
            Covode.recordClassIndex(90359);
        }

        View$OnClickListenerC77335c(StoryViewerAndLikerCell storyViewerAndLikerCell, User user) {
            this.f173512a = storyViewerAndLikerCell;
            this.f173513b = user;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f173512a.mo120919a(this.f173513b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.interaction.cell.StoryViewerAndLikerCell$e */
    public static final class C77337e implements C51086a.AbstractC51091d {

        /* renamed from: a */
        final /* synthetic */ StoryViewerAndLikerCell f173516a;

        /* renamed from: b */
        final /* synthetic */ C77303h f173517b;

        static {
            Covode.recordClassIndex(90361);
        }

        @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51091d
        /* renamed from: a */
        public final void mo63342a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51091d
        /* renamed from: b */
        public final void mo63344b() {
        }

        @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51091d
        /* renamed from: a */
        public final void mo63343a(FollowStatus followStatus) {
            if (followStatus != null) {
                StoryViewerAndLikerCell.m135223a(this.f173516a).mo73175a(followStatus.followStatus, followStatus.followerStatus);
            }
        }

        C77337e(StoryViewerAndLikerCell storyViewerAndLikerCell, C77303h hVar) {
            this.f173516a = storyViewerAndLikerCell;
            this.f173517b = hVar;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ NewFollowButton m135223a(StoryViewerAndLikerCell storyViewerAndLikerCell) {
        NewFollowButton newFollowButton = storyViewerAndLikerCell.f173500a;
        if (newFollowButton == null) {
            C89219l.m154710a("followBtn");
        }
        return newFollowButton;
    }

    /* renamed from: com.ss.android.ugc.aweme.story.interaction.cell.StoryViewerAndLikerCell$f */
    static final class C77338f implements C51086a.AbstractC51092e {

        /* renamed from: a */
        final /* synthetic */ C77303h f173518a;

        static {
            Covode.recordClassIndex(90362);
        }

        C77338f(C77303h hVar) {
            this.f173518a = hVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51092e
        /* renamed from: a */
        public final void mo63345a(FollowStatus followStatus) {
            C89219l.m154716b(followStatus, "");
            String str = null;
            if (followStatus.followStatus == 0) {
                C33744d dVar = new C33744d();
                C77306j jVar = this.f173518a.f173428c;
                if (jVar != null) {
                    str = jVar.f173430b;
                }
                C39162r.m79460a("follow_cancel_finish", dVar.mo59983a("enter_from", str).mo59983a("to_user_id", followStatus.userId).f79943a);
                return;
            }
            C33744d dVar2 = new C33744d();
            C77306j jVar2 = this.f173518a.f173428c;
            if (jVar2 != null) {
                str = jVar2.f173430b;
            }
            C39162r.m79460a("follow_finish", dVar2.mo59983a("enter_from", str).mo59983a("to_user_id", followStatus.userId).f79943a);
        }
    }

    /* renamed from: a */
    public final void mo120919a(User user) {
        C77306j jVar;
        C77303h hVar = (C77303h) this.f42160d;
        if (hVar != null) {
            jVar = hVar.f173428c;
        } else {
            jVar = null;
        }
        if (jVar != null) {
            C59252q f = new C59252q().mo96749g(jVar.f173429a);
            String str = jVar.f173430b;
            if (str == null) {
                str = "";
            }
            C59252q qVar = (C59252q) f.mo96825o(str).mo96741a("click_head");
            qVar.f135285Y = "story_detail";
            qVar.f135286Z = jVar.f173431c;
            qVar.f135312e = jVar.f173432d;
            qVar.f135222V = jVar.f173433e;
            qVar.f135223W = jVar.f173434f;
            qVar.mo96752b_(jVar.f173435g).mo96792f();
        }
        View view = this.itemView;
        C89219l.m154716b(view, "");
        SmartRouter.buildRoute(view.getContext(), "aweme://user/profile/" + user.getUid()).withParam("sec_user_id", user.getSecUid()).open();
    }

    /* renamed from: com.ss.android.ugc.aweme.story.interaction.cell.StoryViewerAndLikerCell$d */
    static final class C77336d implements C51086a.AbstractC51090c {

        /* renamed from: a */
        final /* synthetic */ StoryViewerAndLikerCell f173514a;

        /* renamed from: b */
        final /* synthetic */ C77303h f173515b;

        static {
            Covode.recordClassIndex(90360);
        }

        C77336d(StoryViewerAndLikerCell storyViewerAndLikerCell, C77303h hVar) {
            this.f173514a = storyViewerAndLikerCell;
            this.f173515b = hVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51090c
        /* renamed from: a */
        public final boolean mo63341a(int i) {
            C77306j jVar;
            String str;
            String str2;
            String str3;
            int i2;
            String str4;
            if (i != 2) {
                return false;
            }
            StoryViewerAndLikerCell storyViewerAndLikerCell = this.f173514a;
            User user = this.f173515b.f173426a.getUser();
            IMainServiceHelper createIMainServiceHelperbyMonsterPlugin = MainServiceHelperImpl.createIMainServiceHelperbyMonsterPlugin(false);
            if (createIMainServiceHelperbyMonsterPlugin == null || !createIMainServiceHelperbyMonsterPlugin.shouldRedictToTipsPage() || createIMainServiceHelperbyMonsterPlugin.isChatFunOfflineUnder16()) {
                IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
                C89219l.m154716b(createIIMServicebyMonsterPlugin, "");
                IIMAdapterService d = IMAdapterServiceImpl.m101068d();
                if (!(d == null || !d.mo90129a() || createIIMServicebyMonsterPlugin == null)) {
                    C77303h hVar = (C77303h) storyViewerAndLikerCell.f42160d;
                    String str5 = null;
                    if (hVar != null) {
                        jVar = hVar.f173428c;
                        if (jVar != null) {
                            C59256u o = new C59256u().mo96834a(jVar.f173430b).mo96837o(jVar.f173431c);
                            o.f135352b = C59256u.EnumC59257a.ENTER_CHAT;
                            C59256u r = o.mo96840r(jVar.f173432d);
                            r.f135222V = jVar.f173433e;
                            r.f135223W = jVar.f173434f;
                            ((C59256u) r.mo96752b_(jVar.f173435g)).mo96832a(user).mo96792f();
                        }
                    } else {
                        jVar = null;
                    }
                    IIMService createIIMServicebyMonsterPlugin2 = IMService.createIIMServicebyMonsterPlugin(false);
                    View view = storyViewerAndLikerCell.itemView;
                    C89219l.m154716b(view, "");
                    C56245a.C56246a a = C56245a.C56247b.m102214a(view.getContext(), IMUser.fromUser(user));
                    if (jVar != null) {
                        str = jVar.f173430b;
                    } else {
                        str = null;
                    }
                    C56245a.C56246a c = a.mo93274c(str);
                    if (jVar != null) {
                        str2 = jVar.f173431c;
                    } else {
                        str2 = null;
                    }
                    C56245a.C56246a b = c.mo93271b(str2);
                    if (jVar != null) {
                        str3 = jVar.f173432d;
                    } else {
                        str3 = null;
                    }
                    C56245a.C56246a e = b.mo93277e(str3);
                    if (jVar != null) {
                        i2 = jVar.f173433e;
                    } else {
                        i2 = -1;
                    }
                    C56245a.C56246a d2 = e.mo93275d(i2);
                    if (jVar != null) {
                        str4 = jVar.f173434f;
                    } else {
                        str4 = null;
                    }
                    C56245a.C56246a f = d2.mo93278f(str4);
                    if (jVar != null) {
                        str5 = jVar.f173435g;
                    }
                    f.f128281a.setStoryCollectionId(str5);
                    createIIMServicebyMonsterPlugin2.startChat(f.f128281a);
                }
            } else {
                createIMainServiceHelperbyMonsterPlugin.goToTipsPage();
            }
            return true;
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final View mo23349a(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.b2e, viewGroup, false);
        C89219l.m154716b(a, "");
        SmartAvatarImageView smartAvatarImageView = (SmartAvatarImageView) a.findViewById(R.id.o3);
        C89219l.m154716b(smartAvatarImageView, "");
        this.f173502j = smartAvatarImageView;
        TuxIconView tuxIconView = (TuxIconView) a.findViewById(R.id.o2);
        C89219l.m154716b(tuxIconView, "");
        this.f173503k = tuxIconView;
        TuxTextView tuxTextView = (TuxTextView) a.findViewById(R.id.f_9);
        C89219l.m154716b(tuxTextView, "");
        this.f173504l = tuxTextView;
        TuxTextView tuxTextView2 = (TuxTextView) a.findViewById(R.id.dhh);
        C89219l.m154716b(tuxTextView2, "");
        this.f173505m = tuxTextView2;
        TuxTextView tuxTextView3 = (TuxTextView) a.findViewById(R.id.ajg);
        C89219l.m154716b(tuxTextView3, "");
        this.f173506n = tuxTextView3;
        TuxIconView tuxIconView2 = (TuxIconView) a.findViewById(R.id.fgl);
        C89219l.m154716b(tuxIconView2, "");
        this.f173507o = tuxIconView2;
        NewFollowButton newFollowButton = (NewFollowButton) a.findViewById(R.id.b6b);
        C89219l.m154716b(newFollowButton, "");
        this.f173500a = newFollowButton;
        if (newFollowButton == null) {
            C89219l.m154710a("followBtn");
        }
        newFollowButton.setShouldShowMessageText(true);
        return a;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final /* synthetic */ void mo23350a(C77303h hVar) {
        C77303h hVar2 = hVar;
        C89219l.m154721d(hVar2, "");
        User user = hVar2.f173426a.getUser();
        C20766v a = C20761r.m39060a(C34735v.m70965a(user.getAvatarThumb())).mo34179a("ReactionBubbleCommentCell");
        SmartImageView smartImageView = this.f173502j;
        if (smartImageView == null) {
            C89219l.m154710a("avatarIv");
        }
        a.f49092E = smartImageView;
        C20745e.C20746a aVar = new C20745e.C20746a();
        boolean z = true;
        aVar.f48957a = true;
        C20745e a2 = aVar.mo34169a();
        C89219l.m154716b(a2, "");
        a.f49126w = a2;
        a.f49106c = true;
        a.mo34186c();
        SmartImageView smartImageView2 = this.f173502j;
        if (smartImageView2 == null) {
            C89219l.m154710a("avatarIv");
        }
        smartImageView2.setOnClickListener(new View$OnClickListenerC77334b(this, user));
        this.itemView.setOnClickListener(new View$OnClickListenerC77335c(this, user));
        int i = hVar2.f173427b;
        if (i == 1) {
            TuxIconView tuxIconView = this.f173503k;
            if (tuxIconView == null) {
                C89219l.m154710a("avatarIconIv");
            }
            tuxIconView.setVisibility(4);
            List<C77378a> emojiList = hVar2.f173426a.getEmojiList();
            if (emojiList != null && !emojiList.isEmpty()) {
                z = false;
            }
            if (z) {
                ImageView imageView = this.f173507o;
                if (imageView == null) {
                    C89219l.m154710a("viewerIv");
                }
                imageView.setVisibility(0);
                TuxTextView tuxTextView = this.f173506n;
                if (tuxTextView == null) {
                    C89219l.m154710a("descTv");
                }
                tuxTextView.setVisibility(4);
            } else {
                ImageView imageView2 = this.f173507o;
                if (imageView2 == null) {
                    C89219l.m154710a("viewerIv");
                }
                imageView2.setVisibility(4);
                TuxTextView tuxTextView2 = this.f173506n;
                if (tuxTextView2 == null) {
                    C89219l.m154710a("descTv");
                }
                tuxTextView2.setVisibility(0);
                StringBuilder sb = new StringBuilder();
                Iterator<T> it = emojiList.iterator();
                while (it.hasNext()) {
                    sb.append(StoryEmojiReactionView.C46659a.m90064a(it.next().getEmojiId()));
                }
                TuxTextView tuxTextView3 = this.f173506n;
                if (tuxTextView3 == null) {
                    C89219l.m154710a("descTv");
                }
                tuxTextView3.setTextColor(-16777216);
                TuxTextView tuxTextView4 = this.f173506n;
                if (tuxTextView4 == null) {
                    C89219l.m154710a("descTv");
                }
                C17191a.C17192a aVar2 = new C17191a.C17192a();
                String sb2 = sb.toString();
                C89219l.m154716b(sb2, "");
                tuxTextView4.setText(aVar2.mo27177a(sb2).f40973a);
            }
        } else if (i == 2) {
            TuxIconView tuxIconView2 = this.f173503k;
            if (tuxIconView2 == null) {
                C89219l.m154710a("avatarIconIv");
            }
            tuxIconView2.setVisibility(0);
            TuxIconView tuxIconView3 = this.f173503k;
            if (tuxIconView3 == null) {
                C89219l.m154710a("avatarIconIv");
            }
            tuxIconView3.setIconRes(R.raw.icon_color_view_circle);
            TuxTextView tuxTextView5 = this.f173506n;
            if (tuxTextView5 == null) {
                C89219l.m154710a("descTv");
            }
            tuxTextView5.setVisibility(0);
            TuxTextView tuxTextView6 = this.f173506n;
            if (tuxTextView6 == null) {
                C89219l.m154710a("descTv");
            }
            C17191a.C17192a aVar3 = new C17191a.C17192a();
            String nickname = user.getNickname();
            C89219l.m154716b(nickname, "");
            tuxTextView6.setText(aVar3.mo27177a(nickname).f40973a);
        } else if (i == 3) {
            TuxIconView tuxIconView4 = this.f173503k;
            if (tuxIconView4 == null) {
                C89219l.m154710a("avatarIconIv");
            }
            tuxIconView4.setVisibility(0);
            TuxIconView tuxIconView5 = this.f173503k;
            if (tuxIconView5 == null) {
                C89219l.m154710a("avatarIconIv");
            }
            tuxIconView5.setIconRes(R.raw.icon_color_like_circle);
            TuxTextView tuxTextView7 = this.f173506n;
            if (tuxTextView7 == null) {
                C89219l.m154710a("descTv");
            }
            tuxTextView7.setVisibility(0);
            TuxTextView tuxTextView8 = this.f173506n;
            if (tuxTextView8 == null) {
                C89219l.m154710a("descTv");
            }
            C17191a.C17192a aVar4 = new C17191a.C17192a();
            String nickname2 = user.getNickname();
            C89219l.m154716b(nickname2, "");
            tuxTextView8.setText(aVar4.mo27177a(nickname2).f40973a);
        }
        TuxTextView tuxTextView9 = this.f173504l;
        if (tuxTextView9 == null) {
            C89219l.m154710a("userTv");
        }
        tuxTextView9.setText(user.getUniqueId());
        View view = this.itemView;
        C89219l.m154716b(view, "");
        Context context = view.getContext();
        String customVerify = user.getCustomVerify();
        String enterpriseVerifyReason = user.getEnterpriseVerifyReason();
        TuxTextView tuxTextView10 = this.f173504l;
        if (tuxTextView10 == null) {
            C89219l.m154710a("userTv");
        }
        C80581io.m139704a(context, customVerify, enterpriseVerifyReason, tuxTextView10);
        if (user.getFollowStatus() == 2) {
            TuxTextView tuxTextView11 = this.f173505m;
            if (tuxTextView11 == null) {
                C89219l.m154710a("relationTv");
            }
            tuxTextView11.setVisibility(0);
        } else {
            TuxTextView tuxTextView12 = this.f173505m;
            if (tuxTextView12 == null) {
                C89219l.m154710a("relationTv");
            }
            tuxTextView12.setVisibility(8);
        }
        m135224a().mo86508a(hVar2.f173426a.getUser());
        m135224a().f117879e = new C77336d(this, hVar2);
        m135224a().f117878d = new C77337e(this, hVar2);
        m135224a().f117880f = new C77338f(hVar2);
    }
}
