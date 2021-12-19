package com.p2082ss.android.ugc.aweme.feed.assem.avatar;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.base.p177a.C2954a;
import com.bytedance.android.livesdk.callback.AbstractC7258b;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.extensions.C12793o;
import com.bytedance.assem.arch.extensions.C12794p;
import com.bytedance.assem.arch.extensions.C12795q;
import com.bytedance.assem.arch.extensions.C12796r;
import com.bytedance.assem.arch.p795b.C12661l;
import com.bytedance.assem.arch.viewModel.AbstractC12818f;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.C12815c;
import com.bytedance.assem.arch.viewModel.C12854k;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.C14524g;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1251d.AbstractC17897a;
import com.bytedance.ies.ugc.aweme.commercialize.scene.impl.AdSceneServiceImpl;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.C18017a;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.C18026g;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.bytedance.tiktok.proxy.AbstractC22878f;
import com.bytedance.tiktok.proxy.AbstractC22880h;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.awemeservice.RequestIdService;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2379ui.SmartAvatarBorderView;
import com.p2082ss.android.ugc.aweme.commercialize.C38000g;
import com.p2082ss.android.ugc.aweme.commercialize.live.service.C38143a;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.commercialize.utils.AbstractC38694bo;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38701br;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.AvatarImageWithLive;
import com.p2082ss.android.ugc.aweme.feed.C49907s;
import com.p2082ss.android.ugc.aweme.feed.EnumC48310af;
import com.p2082ss.android.ugc.aweme.feed.adapter.C48198ba;
import com.p2082ss.android.ugc.aweme.feed.adapter.C48200bc;
import com.p2082ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.p2082ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.p2082ss.android.ugc.aweme.feed.assem.avatar.C48383a;
import com.p2082ss.android.ugc.aweme.feed.helper.C49620f;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49672ag;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.C50196d;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.LiveCircleView;
import com.p2082ss.android.ugc.aweme.feed.param.FeedParamProvider;
import com.p2082ss.android.ugc.aweme.live.ILiveOuterService;
import com.p2082ss.android.ugc.aweme.live.LiveOuterService;
import com.p2082ss.android.ugc.aweme.live.feedpage.AbstractC58619c;
import com.p2082ss.android.ugc.aweme.live.feedpage.C58620d;
import com.p2082ss.android.ugc.aweme.login.p3424b.C58956a;
import com.p2082ss.android.ugc.aweme.metrics.AbstractC59203a;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.metrics.C59252q;
import com.p2082ss.android.ugc.aweme.metrics.C59256u;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import com.p2082ss.android.ugc.aweme.story.live.C77354d;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80397em;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.AbstractC89244h;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.feed.assem.avatar.i */
public final class C48416i implements AbstractC12818f<C48383a> {

    /* renamed from: a */
    SmartAvatarBorderView f112137a;

    /* renamed from: b */
    AvatarImageWithLive f112138b;

    /* renamed from: c */
    LiveCircleView f112139c;

    /* renamed from: d */
    public C50196d f112140d;

    /* renamed from: e */
    public boolean f112141e;

    /* renamed from: f */
    public final C48423g f112142f = new C48423g(this);

    /* renamed from: g */
    public final Context f112143g;

    /* renamed from: h */
    public final C48383a f112144h;

    /* renamed from: i */
    private final AbstractC89244h f112145i;

    /* renamed from: j */
    private final AbstractC89244h f112146j;

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.avatar.i$a */
    public static final class C48417a extends AbstractC89220m implements AbstractC89172b<C48198ba, C48198ba> {
        public static final C48417a INSTANCE = new C48417a();

        static {
            Covode.recordClassIndex(57191);
        }

        public C48417a() {
            super(1);
        }

        public final C48198ba invoke(C48198ba baVar) {
            C89219l.m154719c(baVar, "");
            return baVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.avatar.i$d */
    public static final class C48420d extends AbstractC89220m implements AbstractC89172b<C48200bc, C48200bc> {
        public static final C48420d INSTANCE = new C48420d();

        static {
            Covode.recordClassIndex(57194);
        }

        public C48420d() {
            super(1);
        }

        public final C48200bc invoke(C48200bc bcVar) {
            C89219l.m154719c(bcVar, "");
            return bcVar;
        }
    }

    static {
        Covode.recordClassIndex(57190);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final VideoEventDispatchViewModel mo80525a() {
        return (VideoEventDispatchViewModel) this.f112145i.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    /* renamed from: a */
    public final <S extends AbstractC12853j> void mo20508a(AssemViewModel<S> assemViewModel, C12854k<S> kVar, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89183m<? super C48383a, ? super S, C89391z> mVar) {
        C89219l.m154721d(assemViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(mVar, "");
        this.f112144h.mo20508a(assemViewModel, kVar, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    /* renamed from: a */
    public final <S extends AbstractC12853j, A> void mo20509a(AssemViewModel<S> assemViewModel, AbstractC89290k<S, ? extends A> kVar, C12854k<C12793o<A>> kVar2, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89183m<? super C48383a, ? super A, C89391z> mVar) {
        C89219l.m154721d(assemViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(mVar, "");
        this.f112144h.mo20509a(assemViewModel, kVar, kVar2, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    /* renamed from: a */
    public final <S extends AbstractC12853j, A, B> void mo20510a(AssemViewModel<S> assemViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, C12854k<C12794p<A, B>> kVar3, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89187q<? super C48383a, ? super A, ? super B, C89391z> qVar) {
        C89219l.m154721d(assemViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(qVar, "");
        this.f112144h.mo20510a(assemViewModel, kVar, kVar2, kVar3, bVar, qVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    /* renamed from: a */
    public final <S extends AbstractC12853j, A, B, C> void mo20511a(AssemViewModel<S> assemViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, C12854k<C12795q<A, B, C>> kVar4, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89188r<? super C48383a, ? super A, ? super B, ? super C, C89391z> rVar) {
        C89219l.m154721d(assemViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(kVar4, "");
        C89219l.m154721d(rVar, "");
        this.f112144h.mo20511a(assemViewModel, kVar, kVar2, kVar3, kVar4, bVar, rVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    /* renamed from: a */
    public final <S extends AbstractC12853j, A, B, C, D> void mo20512a(AssemViewModel<S> assemViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, AbstractC89290k<S, ? extends D> kVar4, C12854k<C12796r<A, B, C, D>> kVar5, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89189s<? super C48383a, ? super A, ? super B, ? super C, ? super D, C89391z> sVar) {
        C89219l.m154721d(assemViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(kVar4, "");
        C89219l.m154721d(kVar5, "");
        C89219l.m154721d(sVar, "");
        this.f112144h.mo20512a(assemViewModel, kVar, kVar2, kVar3, kVar4, kVar5, bVar, sVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final VideoPlayViewModel mo80527b() {
        return (VideoPlayViewModel) this.f112146j.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    /* renamed from: b */
    public final <S extends AbstractC12853j, A> void mo20515b(AssemViewModel<S> assemViewModel, AbstractC89290k<S, ? extends A> kVar, C12854k<C12793o<A>> kVar2, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89183m<? super C48383a, ? super A, C89391z> mVar) {
        C89219l.m154721d(assemViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(mVar, "");
        this.f112144h.mo20515b(assemViewModel, kVar, kVar2, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public final AbstractC22878f getActualLifecycleOwnerHolder() {
        return this.f112144h.getActualLifecycleOwnerHolder();
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public final AbstractC22880h<C48383a> getActualReceiverHolder() {
        return this.f112144h.getActualReceiverHolder();
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public final boolean getHasSubscribedForReused() {
        return this.f112144h.getHasSubscribedForReused();
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public final AbstractC1204m getHostLifecycleOwner() {
        return this.f112144h.getHostLifecycleOwner();
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public final boolean getUniqueOnlyDefault() {
        return this.f112144h.getUniqueOnlyDefault();
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.avatar.i$b */
    public static final class C48418b extends AbstractC89220m implements AbstractC89171a<C12874b<C48198ba>> {
        public static final C48418b INSTANCE = new C48418b();

        static {
            Covode.recordClassIndex(57192);
        }

        public C48418b() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C48198ba> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.avatar.i$c */
    public static final class C48419c extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C48419c INSTANCE = new C48419c();

        static {
            Covode.recordClassIndex(57193);
        }

        public C48419c() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.avatar.i$e */
    public static final class C48421e extends AbstractC89220m implements AbstractC89171a<C12874b<C48200bc>> {
        public static final C48421e INSTANCE = new C48421e();

        static {
            Covode.recordClassIndex(57195);
        }

        public C48421e() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C48200bc> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.avatar.i$f */
    public static final class C48422f extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C48422f INSTANCE = new C48422f();

        static {
            Covode.recordClassIndex(57196);
        }

        public C48422f() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* Return type fixed from 'com.bytedance.tiktok.proxy.d' to match base method */
    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public final /* bridge */ /* synthetic */ C48383a getReceiverForHostVM() {
        return (C48383a) this.f112144h.getReceiverForHostVM();
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.avatar.i$g */
    public static final class C48423g implements AbstractC88433f<C58620d> {

        /* renamed from: a */
        final /* synthetic */ C48416i f112147a;

        static {
            Covode.recordClassIndex(57197);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C48423g(C48416i iVar) {
            this.f112147a = iVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(C58620d dVar) {
            VideoItemParams videoItemParams;
            Aweme aweme;
            C58620d dVar2 = dVar;
            if (dVar2 != null && (videoItemParams = (VideoItemParams) C12661l.m22797a(this.f112147a.f112144h)) != null && (aweme = videoItemParams.mAweme) != null && !(!C89219l.m154714a((Object) String.valueOf(dVar2.f133501a), (Object) aweme.getAuthorUid()))) {
                aweme.getAuthor().roomId = dVar2.f133502b;
                if (!C48383a.C48384a.m91840b(aweme)) {
                    C48416i.m91854a(this.f112147a).mo85360a(aweme.getAuthor(), getClass(), this, aweme);
                }
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C50196d m91854a(C48416i iVar) {
        C50196d dVar = iVar.f112140d;
        if (dVar == null) {
            C89219l.m154710a("avatarBorderViewController");
        }
        return dVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.avatar.i$h */
    public static final class C48424h extends AbstractC7258b {

        /* renamed from: b */
        final /* synthetic */ String f112148b;

        /* renamed from: c */
        final /* synthetic */ long f112149c;

        static {
            Covode.recordClassIndex(57198);
        }

        @Override // com.bytedance.android.livesdk.callback.AbstractC7258b
        /* renamed from: a */
        public final void mo13461a(Map<String, Object> map) {
            Object obj;
            String str;
            String str2;
            HashMap<String, String> hashMap = null;
            if (map != null) {
                obj = map.get("audience_live_play_enter_room_config");
            } else {
                obj = null;
            }
            if (!(obj instanceof EnterRoomConfig)) {
                obj = null;
            }
            EnterRoomConfig enterRoomConfig = (EnterRoomConfig) obj;
            if (enterRoomConfig != null) {
                EnterRoomConfig.RoomsData roomsData = enterRoomConfig.f28233c;
                if (roomsData != null) {
                    hashMap = roomsData.f28356l;
                }
                EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig.f28233c;
                if (roomsData2 != null && roomsData2.f28359o) {
                    String str3 = this.f112148b;
                    String str4 = "";
                    if (hashMap == null || (str = hashMap.get("value")) == null) {
                        str = str4;
                    }
                    C89219l.m154716b(str, str4);
                    if (!(hashMap == null || (str2 = hashMap.get("log_extra")) == null)) {
                        str4 = str2;
                    }
                    C18129a.m33747a("live_ad", str3, str, str4, "0").mo28897a("room_id", map.get("audience_live_play_room_id")).mo28901b();
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48424h(String str, long j, long j2) {
            super(j2);
            this.f112148b = str;
            this.f112149c = j;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.assem.avatar.i$i */
    public static final class View$OnClickListenerC48425i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C48416i f112150a;

        /* renamed from: b */
        final /* synthetic */ VideoItemParams f112151b;

        static {
            Covode.recordClassIndex(57199);
        }

        View$OnClickListenerC48425i(C48416i iVar, VideoItemParams videoItemParams) {
            this.f112150a = iVar;
            this.f112151b = videoItemParams;
        }

        public final void onClick(View view) {
            int i;
            String str;
            AbstractC17897a c;
            ClickAgent.onClick(view);
            final Aweme aweme = ((VideoItemParams) C12661l.m22797a(this.f112150a.f112144h)).mAweme;
            final DataCenter dataCenter = ((VideoItemParams) C12661l.m22797a(this.f112150a.f112144h)).dataCenter;
            if (!C80580in.m139687c() && !C58956a.m108315a(aweme)) {
                if ((!C89219l.m154714a((Object) ((VideoItemParams) C12661l.m22797a(this.f112150a.f112144h)).mEventType, (Object) "new_ad_fake_user")) && C37699a.m76202E(aweme)) {
                    C89219l.m154716b(aweme, "");
                    if (!aweme.isAd()) {
                        return;
                    }
                }
                C89219l.m154716b(aweme, "");
                if (!aweme.isCanPlay() || aweme.isDelete()) {
                    C79459a aVar = new C79459a(this.f112150a.f112143g);
                    if (aweme.isImage()) {
                        i = R.string.civ;
                    } else {
                        i = R.string.h8k;
                    }
                    aVar.mo123050a(i).mo123053a();
                    return;
                }
                IAdSceneService f = AdSceneServiceImpl.m33210f();
                if (!(f == null || (c = f.mo28466c()) == null)) {
                    c.mo28503a(aweme, this.f112150a.f112143g);
                }
                C59256u a = new C59256u().mo96834a("homepage_hot");
                a.f135350a = C59256u.EnumC59259c.ITEM;
                a.f135352b = C59256u.EnumC59257a.ENTER_PROFILE;
                C59256u a2 = a.mo96749g(aweme).mo96832a(aweme.getAuthor());
                User author = aweme.getAuthor();
                C89219l.m154716b(author, "");
                a2.mo96841s(author.getRequestId()).mo96835b();
                C49907s.m93686a(EnumC48310af.PROFILE);
                JSONObject jSONObject = ((VideoItemParams) C12661l.m22797a(this.f112150a.f112144h)).mRequestId;
                if (jSONObject == null || (str = jSONObject.optString("request_id")) == null) {
                    str = aweme.getRequestId();
                }
                aweme.setRequestId(str);
                if (dataCenter != null) {
                    dataCenter.mo60191a("feed_internal_event", new C49672ag(19, aweme));
                }
                if (C37699a.m76318w(aweme)) {
                    C38000g.m77052c().mo65915a(this.f112150a.f112143g, aweme, new AbstractC38694bo(this) {
                        /* class com.p2082ss.android.ugc.aweme.feed.assem.avatar.C48416i.View$OnClickListenerC48425i.C484261 */

                        /* renamed from: a */
                        final /* synthetic */ View$OnClickListenerC48425i f112152a;

                        static {
                            Covode.recordClassIndex(57200);
                        }

                        @Override // com.p2082ss.android.ugc.aweme.commercialize.utils.AbstractC38694bo
                        /* renamed from: a */
                        public final void mo67267a() {
                            String str;
                            String str2;
                            String str3;
                            DataCenter dataCenter = dataCenter;
                            if (dataCenter != null) {
                                dataCenter.mo60191a("to_profile", "");
                            }
                            C59252q c = new C59252q().mo96823c(aweme, this.f112152a.f112151b.mPageType);
                            String str4 = this.f112152a.f112151b.mEventType;
                            if (str4 == null) {
                                str4 = "";
                            }
                            C59252q qVar = (C59252q) c.mo96825o(str4).mo96740a(this.f112152a.f112150a.f112143g);
                            DataCenter dataCenter2 = dataCenter;
                            String str5 = null;
                            if (dataCenter2 != null) {
                                str = (String) dataCenter2.mo60195b("playlist_type", "");
                            } else {
                                str = null;
                            }
                            qVar.f135317t = str;
                            DataCenter dataCenter3 = dataCenter;
                            if (dataCenter3 != null) {
                                str2 = (String) dataCenter3.mo60195b("playlist_id", "");
                            } else {
                                str2 = null;
                            }
                            qVar.f135319v = str2;
                            DataCenter dataCenter4 = dataCenter;
                            if (dataCenter4 != null) {
                                str3 = (String) dataCenter4.mo60195b("playlist_id_key", "");
                            } else {
                                str3 = null;
                            }
                            qVar.f135318u = str3;
                            DataCenter dataCenter5 = dataCenter;
                            if (dataCenter5 != null) {
                                str5 = (String) dataCenter5.mo60195b("tab_name", "");
                            }
                            ((AbstractC59203a) qVar.mo96801c(str5).mo96802d(C59208ac.m108764b(aweme, this.f112152a.f112151b.mPageType))).mo96741a("click_head").mo96810l(FeedParamProvider.C49809a.m93270a(this.f112152a.f112150a.f112143g).getSearchId()).mo96804f(FeedParamProvider.C49809a.m93270a(this.f112152a.f112150a.f112143g).getSearchResultId()).mo96792f();
                        }

                        {
                            this.f112152a = r1;
                        }
                    });
                    return;
                }
                String a3 = RequestIdService.m70076a().mo60693a(aweme, this.f112151b.mPageType);
                if (TextUtils.equals(this.f112151b.mEventType, "homepage_hot")) {
                    User author2 = aweme.getAuthor();
                    C89219l.m154716b(author2, "");
                    C77354d.m135265b(a3, author2.getUid(), aweme.getAuthor().roomId, aweme.getAid());
                } else if (TextUtils.equals(this.f112151b.mEventType, "homepage_follow")) {
                    User author3 = aweme.getAuthor();
                    C89219l.m154716b(author3, "");
                    C77354d.m135262a(a3, author3.getUid(), aweme.getAuthor().roomId, aweme.getAid());
                } else {
                    String a4 = C49620f.m93062a(this.f112151b.mEventType, this.f112151b.isMyProfile);
                    User author4 = aweme.getAuthor();
                    C89219l.m154716b(author4, "");
                    C77354d.m135257a(1, a4, a3, author4.getUid(), aweme.getAuthor().roomId);
                }
                EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
                enterRoomConfig.f28232b.f28259c = aweme.getAid();
                if (C37699a.m76314s(aweme)) {
                    C38143a.m77301a(aweme, enterRoomConfig, 52);
                }
                enterRoomConfig.f28233c.f28293J = this.f112151b.mEventType;
                enterRoomConfig.f28233c.f28295L = "video_head";
                enterRoomConfig.f28232b.f28260d = aweme.getAid();
                enterRoomConfig.f28232b.f28261e = "video";
                ILiveOuterService s = LiveOuterService.m107269s();
                C89219l.m154716b(s, "");
                s.mo95835i().mo105593a(this.f112150a.f112143g, aweme.getAuthor(), enterRoomConfig);
                C48416i.m91855a(10000, "live_duration_10s");
                C48416i.m91855a(30000, "live_duration_30s");
                C48416i.m91855a(60000, "live_duration_60s");
            }
        }
    }

    /* renamed from: a */
    public final void mo80526a(VideoItemParams videoItemParams) {
        boolean z;
        UrlModel urlModel;
        User author;
        C89219l.m154721d(videoItemParams, "");
        Aweme aweme = videoItemParams.mAweme;
        C89219l.m154716b(aweme, "");
        boolean a = C48383a.C48384a.m91839a(aweme);
        boolean b = C48383a.C48384a.m91840b(videoItemParams.mAweme);
        AvatarImageWithLive avatarImageWithLive = this.f112138b;
        if (avatarImageWithLive == null) {
            C89219l.m154710a("avatarLiveView");
        }
        if (a || !b) {
            z = false;
        } else {
            z = true;
        }
        avatarImageWithLive.mo80035a(z);
        StringBuilder sb = new StringBuilder("FeedAvatarView_");
        Aweme aweme2 = videoItemParams.mAweme;
        C89219l.m154716b(aweme2, "");
        String sb2 = sb.append(aweme2.getAid()).toString();
        int dimension = (int) this.f112143g.getResources().getDimension(R.dimen.fw);
        Aweme aweme3 = videoItemParams.mAweme;
        AvatarImageWithLive avatarImageWithLive2 = this.f112138b;
        if (avatarImageWithLive2 == null) {
            C89219l.m154710a("avatarLiveView");
        }
        if (C38701br.m78513a(aweme3, avatarImageWithLive2.getAvatarImageView())) {
            C38000g.m77057h().mo67246a(C38701br.m78515b(videoItemParams.mAweme));
        } else {
            AvatarImageWithLive avatarImageWithLive3 = this.f112138b;
            if (avatarImageWithLive3 == null) {
                C89219l.m154710a("avatarLiveView");
            }
            SmartAvatarBorderView avatarImageView = avatarImageWithLive3.getAvatarImageView();
            Aweme aweme4 = videoItemParams.mAweme;
            if (aweme4 == null || (author = aweme4.getAuthor()) == null) {
                urlModel = null;
            } else {
                urlModel = author.getAvatarThumb();
            }
            avatarImageView.mo61310a(urlModel, C80397em.m139369a(101), dimension, dimension, sb2);
        }
        AvatarImageWithLive avatarImageWithLive4 = this.f112138b;
        if (avatarImageWithLive4 == null) {
            C89219l.m154710a("avatarLiveView");
        }
        avatarImageWithLive4.setOnClickListener(new View$OnClickListenerC48425i(this, videoItemParams));
        C50196d dVar = this.f112140d;
        if (dVar == null) {
            C89219l.m154710a("avatarBorderViewController");
        }
        Aweme aweme5 = videoItemParams.mAweme;
        C89219l.m154716b(aweme5, "");
        dVar.mo85360a(aweme5.getAuthor(), getClass(), this.f112142f, videoItemParams.mAweme);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.avatar.i$j */
    static final class C48427j extends AbstractC89220m implements AbstractC89183m<C48383a, C12776a<? extends Boolean>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C48416i f112155a;

        static {
            Covode.recordClassIndex(57201);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48427j(C48416i iVar) {
            super(2);
            this.f112155a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C48383a aVar, C12776a<? extends Boolean> aVar2) {
            C89219l.m154721d(aVar, "");
            C89219l.m154721d(aVar2, "");
            if (this.f112155a.f112141e) {
                C48416i.m91854a(this.f112155a).mo85363d();
                this.f112155a.f112141e = false;
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static void m91855a(long j, String str) {
        ILiveOuterService s = LiveOuterService.m107269s();
        C89219l.m154716b(s, "");
        s.mo95830d().mo12995a(AbstractC7258b.EnumC7259a.AUDIENCE_LIVE_PLAY_DURATION, new C48424h(str, j, j));
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.avatar.i$n */
    static final class C48432n extends AbstractC89220m implements AbstractC89183m<C48383a, C12776a<? extends Boolean>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C48416i f112160a;

        static {
            Covode.recordClassIndex(57206);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48432n(C48416i iVar) {
            super(2);
            this.f112160a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C48383a aVar, C12776a<? extends Boolean> aVar2) {
            Aweme aweme;
            C48383a aVar3 = aVar;
            C89219l.m154721d(aVar3, "");
            C89219l.m154721d(aVar2, "");
            VideoItemParams videoItemParams = (VideoItemParams) C12661l.m22797a(aVar3);
            if (!(videoItemParams == null || (aweme = videoItemParams.mAweme) == null || (!aweme.isLive() && aweme.getStreamUrlModel() == null))) {
                C48416i.m91854a(this.f112160a).mo85362c();
                this.f112160a.f112141e = true;
            }
            return C89391z.f203057a;
        }
    }

    public C48416i(Context context, C48383a aVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(aVar, "");
        this.f112143g = context;
        this.f112144h = aVar;
        this.f112145i = new C14524g(C89204ab.m154669a(VideoEventDispatchViewModel.class), aVar, C48418b.INSTANCE, C48419c.INSTANCE, C48417a.INSTANCE);
        this.f112146j = new C14524g(C89204ab.m154669a(VideoPlayViewModel.class), aVar, C48421e.INSTANCE, C48422f.INSTANCE, C48420d.INSTANCE);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.avatar.i$l */
    static final class C48430l extends AbstractC89220m implements AbstractC89183m<C48383a, C18017a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C48416i f112158a;

        static {
            Covode.recordClassIndex(57204);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48430l(C48416i iVar) {
            super(2);
            this.f112158a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C48383a aVar, C18017a aVar2) {
            Aweme aweme;
            User author;
            C48383a aVar3 = aVar;
            C18017a aVar4 = aVar2;
            C89219l.m154721d(aVar3, "");
            VideoItemParams videoItemParams = (VideoItemParams) C12661l.m22797a(aVar3);
            if (!(videoItemParams == null || (aweme = videoItemParams.mAweme) == null || (author = aweme.getAuthor()) == null || aVar4 == null || aVar4.f42891a != 3 || !C37699a.m76318w(aweme) || C37699a.m76319x(aweme))) {
                C48416i.m91854a(this.f112158a).mo85360a(author, aVar3.getClass(), this.f112158a.f112142f, aweme);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.avatar.i$m */
    static final class C48431m extends AbstractC89220m implements AbstractC89183m<C48383a, C18026g, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C48416i f112159a;

        static {
            Covode.recordClassIndex(57205);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48431m(C48416i iVar) {
            super(2);
            this.f112159a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C48383a aVar, C18026g gVar) {
            Aweme aweme;
            User author;
            String str;
            C48383a aVar2 = aVar;
            C18026g gVar2 = gVar;
            C89219l.m154721d(aVar2, "");
            VideoItemParams videoItemParams = (VideoItemParams) C12661l.m22797a(aVar2);
            if (!(videoItemParams == null || (aweme = videoItemParams.mAweme) == null || (author = aweme.getAuthor()) == null)) {
                if (gVar2 != null) {
                    str = gVar2.f42904a;
                } else {
                    str = null;
                }
                if (C89219l.m154714a((Object) str, (Object) aweme.getAid())) {
                    C48416i.m91854a(this.f112159a).mo85360a(author, aVar2.getClass(), this.f112159a.f112142f, aweme);
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.avatar.i$k */
    static final class C48428k extends AbstractC89220m implements AbstractC89183m<C48383a, C2954a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C48416i f112156a;

        static {
            Covode.recordClassIndex(57202);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48428k(C48416i iVar) {
            super(2);
            this.f112156a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C48383a aVar, C2954a aVar2) {
            VideoItemParams videoItemParams;
            Aweme aweme;
            User author;
            C48383a aVar3 = aVar;
            C2954a aVar4 = aVar2;
            C89219l.m154721d(aVar3, "");
            if (!(aVar4 == null || (videoItemParams = (VideoItemParams) C12661l.m22797a(aVar3)) == null || (aweme = videoItemParams.mAweme) == null || (author = aweme.getAuthor()) == null || (!C89219l.m154714a((Object) String.valueOf(aVar4.f8697b), (Object) author.getUid())))) {
                C48429a aVar5 = C48429a.f112157a;
                if (aVar4.f8698c) {
                    if (author.roomId != 0) {
                        AbstractC58619c liveStateManager = BusinessComponentServiceUtils.getLiveStateManager();
                        String uid = author.getUid();
                        C89219l.m154716b(uid, "");
                        liveStateManager.mo96083a(Long.parseLong(uid));
                        String uid2 = author.getUid();
                        C89219l.m154716b(uid2, "");
                        aVar5.invoke(false, 0L, uid2);
                    }
                    author.roomId = 0;
                } else if (aVar4.f8696a != 0) {
                    if (author.roomId == 0) {
                        AbstractC58619c liveStateManager2 = BusinessComponentServiceUtils.getLiveStateManager();
                        String uid3 = author.getUid();
                        C89219l.m154716b(uid3, "");
                        liveStateManager2.mo96083a(Long.parseLong(uid3));
                        Long valueOf = Long.valueOf(aVar4.f8696a);
                        String uid4 = author.getUid();
                        C89219l.m154716b(uid4, "");
                        aVar5.invoke(true, valueOf, uid4);
                    }
                    author.roomId = aVar4.f8696a;
                }
                C37699a.m76258ad(aweme);
                C48416i.m91854a(this.f112156a).mo85360a(author, aVar3.getClass(), this.f112156a.f112142f, aweme);
            }
            return C89391z.f203057a;
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.assem.avatar.i$k$a */
        static final class C48429a extends AbstractC89220m implements AbstractC89187q<Boolean, Long, String, C89391z> {

            /* renamed from: a */
            public static final C48429a f112157a = new C48429a();

            static {
                Covode.recordClassIndex(57203);
            }

            C48429a() {
                super(3);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89187q
            public final /* synthetic */ C89391z invoke(Boolean bool, Long l, String str) {
                String str2;
                boolean booleanValue = bool.booleanValue();
                long longValue = l.longValue();
                String str3 = str;
                C89219l.m154721d(str3, "");
                C33744d a = new C33744d().mo59983a("action_type", "click").mo59983a("anchor_id", str3.toString()).mo59983a("room_id", String.valueOf(longValue)).mo59983a("enter_from_merge", "homepage_hot").mo59983a("enter_method", "video_head");
                if (booleanValue) {
                    str2 = "live_on";
                } else {
                    str2 = "live_off";
                }
                C39162r.m79460a("livesdk_live_status_change", a.mo59983a("status", str2).f79943a);
                return C89391z.f203057a;
            }
        }
    }
}
