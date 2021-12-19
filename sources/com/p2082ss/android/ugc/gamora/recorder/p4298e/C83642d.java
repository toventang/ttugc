package com.p2082ss.android.ugc.gamora.recorder.p4298e;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.app.ActivityC0218d;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.C1764a;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.als.C2559g;
import com.bytedance.als.C2560h;
import com.bytedance.als.C2563k;
import com.bytedance.bpea.basics.C13349j;
import com.bytedance.bpea.basics.C13350k;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.p878a.C13400a;
import com.bytedance.bpea.store.p878a.C13401b;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.filter.p942a.AbstractC14210a;
import com.bytedance.creativex.recorder.p938a.p939a.AbstractC14099a;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14177d;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m;
import com.bytedance.jedi.arch.AbstractC20362a;
import com.bytedance.jedi.arch.AbstractC20367ae;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.AbstractC20382b;
import com.bytedance.jedi.arch.AbstractC20477i;
import com.bytedance.jedi.arch.AbstractC20534v;
import com.bytedance.jedi.arch.C20365ac;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.C20373ak;
import com.bytedance.jedi.arch.C20374al;
import com.bytedance.jedi.arch.C20375am;
import com.bytedance.jedi.arch.C20376an;
import com.bytedance.jedi.arch.C20391d;
import com.bytedance.jedi.arch.C20531t;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.bytedance.scene.group.AbstractC22186b;
import com.bytedance.scene.ktx.C22227b;
import com.bytedance.scene.ktx.C22228c;
import com.bytedance.scene.p1621c.C22154f;
import com.bytedance.tux.tooltip.AbstractC23317a;
import com.bytedance.tux.tooltip.AbstractC23332b;
import com.bytedance.tux.tooltip.EnumC23352h;
import com.bytedance.tux.tooltip.p1727a.p1729b.C23329a;
import com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a;
import com.p2082ss.android.ugc.aweme.account.model.AbstractC32846a;
import com.p2082ss.android.ugc.aweme.beauty.C34810g;
import com.p2082ss.android.ugc.aweme.beauty.ComposerBeautyBuriedInfo;
import com.p2082ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.dependence.beauty.data.C41101a;
import com.p2082ss.android.ugc.aweme.dependence.beauty.data.ComposerBeautyBuriedInfoCopy;
import com.p2082ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p2082ss.android.ugc.aweme.mediachoose.AbstractC59174d;
import com.p2082ss.android.ugc.aweme.mediachoose.p3436a.C59154d;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.p2730de.C40973h;
import com.p2082ss.android.ugc.aweme.p2730de.C40976k;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63264v;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63253l;
import com.p2082ss.android.ugc.aweme.property.C65410ct;
import com.p2082ss.android.ugc.aweme.property.C65417d;
import com.p2082ss.android.ugc.aweme.services.IAVServiceProxy;
import com.p2082ss.android.ugc.aweme.services.superentrance.SuperEntranceEvent;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.C70629db;
import com.p2082ss.android.ugc.aweme.shortvideo.C70637di;
import com.p2082ss.android.ugc.aweme.shortvideo.C70747dv;
import com.p2082ss.android.ugc.aweme.shortvideo.C71812ep;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C70455f;
import com.p2082ss.android.ugc.aweme.shortvideo.eventtrack.C71820a;
import com.p2082ss.android.ugc.aweme.shortvideo.local.UploadButton;
import com.p2082ss.android.ugc.aweme.shortvideo.model.CommentUtils;
import com.p2082ss.android.ugc.aweme.shortvideo.model.Mission;
import com.p2082ss.android.ugc.aweme.shortvideo.model.RecordPresetResource;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ClosingChooseMediaPageState;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.OpeningChooseMediaPageState;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.C72440e;
import com.p2082ss.android.ugc.aweme.shortvideo.p3835h.AbstractC71864a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.task.FirstPhotoViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.C72847c;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73975b;
import com.p2082ss.android.ugc.aweme.shortvideo.util.performance.OpenAlbumPanelPerformanceMonitor;
import com.p2082ss.android.ugc.aweme.shortvideo.widget.TouchSensitiveRelativeLayout;
import com.p2082ss.android.ugc.aweme.specialplus.C75210e;
import com.p2082ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p2082ss.android.ugc.aweme.sticker.p3954d.AbstractC75301e;
import com.p2082ss.android.ugc.aweme.sticker.p3954d.p3956b.EnumC75295a;
import com.p2082ss.android.ugc.aweme.sticker.p3958f.C75346e;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75618a;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75621d;
import com.p2082ss.android.ugc.aweme.utils.C80322d;
import com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81441k;
import com.p2082ss.android.ugc.aweme.widgetcompat.RemoteImageView;
import com.p2082ss.android.ugc.gamora.recorder.choosemusic.p4296a.AbstractC83492a;
import com.p2082ss.android.ugc.gamora.recorder.localmedia.C83872a;
import com.p2082ss.android.ugc.gamora.recorder.localmedia.C83880c;
import com.p2082ss.android.ugc.gamora.recorder.localmedia.LocalMediaArgument;
import com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83406b;
import com.p2082ss.android.ugc.gamora.recorder.p4301h.C83725e;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84089j;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.C84015g;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.view.widget.C85041d;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.vesdk.VEListener;
import java.lang.reflect.Type;
import java.util.Objects;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.C89386u;
import p4600h.C89390y;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.gamora.recorder.e.d */
public class C83642d extends AbstractC22186b implements AbstractC20382b, AbstractC21566a {

    /* renamed from: b */
    static final /* synthetic */ AbstractC89286i[] f186729b = {new C89232y(C83642d.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0), new C89232y(C83642d.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0), new C89232y(C83642d.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0), new C89232y(C83642d.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0)};

    /* renamed from: v */
    public static final C83643a f186730v = new C83643a((byte) 0);

    /* renamed from: A */
    private boolean f186731A;

    /* renamed from: B */
    private final C21582f f186732B;

    /* renamed from: C */
    private final C2560h<Integer> f186733C;

    /* renamed from: D */
    private final C2560h<Integer> f186734D;

    /* renamed from: E */
    private final C2559g<C89391z> f186735E;

    /* renamed from: F */
    private final C2560h<Boolean> f186736F;

    /* renamed from: G */
    private final C83641c f186737G;

    /* renamed from: c */
    public final C2563k<C89391z> f186738c;

    /* renamed from: d */
    public final C2559g<C89391z> f186739d;

    /* renamed from: e */
    public TouchSensitiveRelativeLayout f186740e;

    /* renamed from: f */
    public ViewGroup f186741f;

    /* renamed from: g */
    public final C83725e f186742g = new C83725e();

    /* renamed from: h */
    View f186743h;

    /* renamed from: i */
    public View f186744i;

    /* renamed from: j */
    public UploadButton f186745j;

    /* renamed from: k */
    public int f186746k = C71812ep.m126783a(40.0d, C63247i.f143610a);

    /* renamed from: l */
    public AbstractC23317a f186747l;

    /* renamed from: t */
    public AbstractC23317a f186748t;

    /* renamed from: u */
    public long f186749u = -1;

    /* renamed from: w */
    private final AbstractC89248d f186750w = C21572a.m40504a(getDiContainer(), ShortVideoContext.class);

    /* renamed from: x */
    private final AbstractC89248d f186751x = C21572a.m40504a(getDiContainer(), AbstractC14177d.class);

    /* renamed from: y */
    private final AbstractC89248d f186752y = C21572a.m40504a(getDiContainer(), AbstractC84089j.class);

    /* renamed from: z */
    private final AbstractC89248d f186753z = C21572a.m40504a(getDiContainer(), AbstractC14193m.class);

    static {
        Covode.recordClassIndex(97532);
    }

    /* renamed from: E */
    public final ShortVideoContext mo62771E() {
        return (ShortVideoContext) this.f186750w.mo23374a(this, f186729b[0]);
    }

    /* renamed from: F */
    public final AbstractC14177d mo128651F() {
        return (AbstractC14177d) this.f186751x.mo23374a(this, f186729b[1]);
    }

    /* renamed from: G */
    public final AbstractC84089j mo128652G() {
        return (AbstractC84089j) this.f186752y.mo23374a(this, f186729b[2]);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.e.d$a */
    public static final class C83643a {
        static {
            Covode.recordClassIndex(97533);
        }

        private C83643a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.gamora.recorder.e.d$a$a */
        public static final class C83644a extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ ShortVideoContext f186754a;

            /* renamed from: b */
            final /* synthetic */ Activity f186755b;

            /* renamed from: c */
            final /* synthetic */ C21582f f186756c;

            static {
                Covode.recordClassIndex(97534);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C83644a(ShortVideoContext shortVideoContext, Activity activity, C21582f fVar) {
                super(0);
                this.f186754a = shortVideoContext;
                this.f186755b = activity;
                this.f186756c = fVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                mo128657a();
                return C89391z.f203057a;
            }

            /* renamed from: a */
            public final void mo128657a() {
                Integer num;
                C39162r.m79456a("upload_click", "shoot_page", "0", 0, new C40976k().mo70157a("enter_from", this.f186754a.f155831p).mo70158a());
                if (C63244g.m114602a().mo73255A().mo93901a()) {
                    C83643a.m143989a();
                } else {
                    C83643a.m143993b(this.f186754a);
                }
                ShortVideoContext shortVideoContext = this.f186754a;
                AbstractC31133a mediaController = ((AbstractC14177d) this.f186756c.mo35249a((Type) AbstractC14177d.class, (String) null)).mo22747A().getMediaController();
                FaceStickerBean i = ((AbstractC84089j) this.f186756c.mo35249a((Type) AbstractC84089j.class, (String) null)).mo23127i();
                T value = ((AbstractC14210a) this.f186756c.mo35249a((Type) AbstractC14210a.class, (String) null)).getCurSelectedFilter().f7727a.getValue();
                if (value != null) {
                    num = Integer.valueOf(value.getId());
                } else {
                    num = null;
                }
                C71820a.m126811a(shortVideoContext, mediaController, i, num, C83643a.m143987a(((AbstractC14099a) this.f186756c.mo35249a((Type) AbstractC14099a.class, (String) null)).mo22659i().mo121632p()), C83643a.m143988a(((AbstractC14099a) this.f186756c.mo35249a((Type) AbstractC14099a.class, (String) null)).mo22659i().mo121631o()), "click_upload", C836451.f186757a);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.gamora.recorder.e.d$a$b */
        public static final class CallableC83646b<V> implements Callable {

            /* renamed from: a */
            final /* synthetic */ C83644a f186758a;

            static {
                Covode.recordClassIndex(97536);
            }

            CallableC83646b(C83644a aVar) {
                this.f186758a = aVar;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                this.f186758a.mo128657a();
                return C89391z.f203057a;
            }
        }

        /* renamed from: a */
        public static void m143989a() {
            C80322d.m139251a("click_upload_entrance", new C84425b().mo129406a("content_type", "video/photo").f188764a);
        }

        public /* synthetic */ C83643a(byte b) {
            this();
        }

        /* renamed from: a */
        public static boolean m143992a(ShortVideoContext shortVideoContext) {
            if (!shortVideoContext.f155778aL || !shortVideoContext.f155752M) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        public static ComposerBeautyBuriedInfo m143987a(ComposerBeautyBuriedInfoCopy composerBeautyBuriedInfoCopy) {
            Object a = C40973h.m82495a(C40973h.m82494a().mo46674b(composerBeautyBuriedInfoCopy), ComposerBeautyBuriedInfo.class);
            C89219l.m154716b(a, "");
            return (ComposerBeautyBuriedInfo) a;
        }

        /* renamed from: a */
        public static C34810g m143988a(C41101a aVar) {
            Object a = C40973h.m82495a(C40973h.m82494a().mo46674b(aVar), C34810g.class);
            C89219l.m154716b(a, "");
            return (C34810g) a;
        }

        /* renamed from: b */
        public static void m143993b(ShortVideoContext shortVideoContext) {
            String str;
            String str2;
            CommentVideoModel commentVideoModel = shortVideoContext.f155825j;
            C84425b a = new C84425b().mo129406a("creation_id", shortVideoContext.f155830o).mo129406a("shoot_way", shortVideoContext.f155831p);
            String str3 = null;
            if (!CommentUtils.needMob(shortVideoContext)) {
                str = "";
            } else if (commentVideoModel != null) {
                str = commentVideoModel.getCommentId();
            } else {
                str = null;
            }
            C84425b a2 = a.mo129406a("reply_comment_id", str);
            if (!CommentUtils.needMob(shortVideoContext)) {
                str3 = "";
            } else if (commentVideoModel != null) {
                str3 = commentVideoModel.getUserId();
            }
            C84425b a3 = a2.mo129406a("reply_user_id", str3).mo129406a("enter_from", "video_shoot_page").mo129406a("from_group_id", C70747dv.m124972a());
            if (commentVideoModel == null || (str2 = commentVideoModel.getEnterMethod()) == null) {
                str2 = "";
            }
            C84425b a4 = a3.mo129406a("enter_method", str2).mo129406a("is_westwindow_exist", shortVideoContext.f155782aP);
            if (shortVideoContext.f155740A != 0) {
                a4.mo129403a("draft_id", shortVideoContext.f155740A);
            }
            String str4 = shortVideoContext.f155741B;
            C89219l.m154716b(str4, "");
            if (str4.length() > 0) {
                a4.mo129406a("new_draft_id", shortVideoContext.f155741B);
            }
            a4.mo129406a("shoot_page", "video_shoot_page");
            a4.mo129406a("shoot_tab_name", shortVideoContext.mo110042r());
            C39162r.m79460a("click_upload_entrance", a4.f188764a);
        }

        /* renamed from: a */
        public static void m143990a(Activity activity, ShortVideoContext shortVideoContext) {
            String str;
            Long l;
            String stickerId;
            C89219l.m154721d(activity, "");
            C89219l.m154721d(shortVideoContext, "");
            Mission a = C63238c.f143585l.mo93813a(shortVideoContext.f155794ad.f155707c);
            if (a != null) {
                String musicId = a.getMusicId();
                if ((musicId != null && musicId.length() != 0) || ((stickerId = a.getStickerId()) != null && stickerId.length() != 0)) {
                    String stickerId2 = a.getStickerId();
                    if (stickerId2 == null || stickerId2.length() == 0 || !a.isStickerToasted()) {
                        String musicId2 = a.getMusicId();
                        if (musicId2 == null || musicId2.length() == 0 || !a.isMusicToasted()) {
                            Integer num = null;
                            if (!a.isMusicToasted()) {
                                String musicId3 = a.getMusicId();
                                C69905c cVar = C70005cr.m123611a().f156482a;
                                if (cVar != null) {
                                    l = Long.valueOf(cVar.f156195id);
                                } else {
                                    l = null;
                                }
                                if (!TextUtils.equals(musicId3, String.valueOf(l))) {
                                    a.setMusicToasted(true);
                                    shortVideoContext.f155794ad.f155707c = C63238c.f143585l.mo93816a(shortVideoContext.f155794ad.f155707c, a);
                                    return;
                                }
                            }
                            C85041d.m146226b(activity, R.string.d3v).mo129984b();
                            C84425b a2 = new C84425b().mo129403a("reason", 4).mo129406a("mission_id", a.getMissionId()).mo129406a("page_source", a.getEnterFrom());
                            AbstractC32846a e = C63238c.f143594u.mo93906e();
                            if (e != null) {
                                num = Integer.valueOf(e.mo58670m());
                            }
                            C84425b a3 = a2.mo129405a("creator_followers", num);
                            if (C63253l.f143623a.mo73330z().mo93832j()) {
                                str = "0";
                            } else {
                                str = "1";
                            }
                            C39162r.m79460a("mission_requirement_toast", a3.mo129406a("creator_type", str).f188764a);
                        }
                    }
                }
            }
        }

        /* renamed from: a */
        public static void m143991a(Activity activity, ShortVideoContext shortVideoContext, C21582f fVar) {
            C89219l.m154721d(activity, "");
            C89219l.m154721d(shortVideoContext, "");
            C89219l.m154721d(fVar, "");
            C1731i.m5640b(new CallableC83646b(new C83644a(shortVideoContext, activity, fVar)), C1731i.f5562a);
        }
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public C21582f getDiContainer() {
        return this.f186732B;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20367ae
    public /* bridge */ /* synthetic */ AbstractC20477i getReceiver() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20534v
    public AbstractC1204m getLifecycleOwner() {
        return AbstractC20382b.C20383a.m38581a(this);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public AbstractC20534v getLifecycleOwnerHolder() {
        return AbstractC20382b.C20383a.m38601b(this);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public AbstractC20367ae<AbstractC20477i> getReceiverHolder() {
        return AbstractC20382b.C20383a.m38604c(this);
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.e.d$b */
    static final class RunnableC83647b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C83642d f186759a;

        static {
            Covode.recordClassIndex(97537);
        }

        RunnableC83647b(C83642d dVar) {
            this.f186759a = dVar;
        }

        public final void run() {
            AbstractC23317a aVar = this.f186759a.f186747l;
            if (aVar != null) {
                aVar.mo38001a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.e.d$g */
    static final class RunnableC83653g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C83642d f186765a;

        static {
            Covode.recordClassIndex(97543);
        }

        RunnableC83653g(C83642d dVar) {
            this.f186765a = dVar;
        }

        public final void run() {
            if (this.f186765a.mo36484r() != null) {
                C83642d.m143973a(this.f186765a).getLocationOnScreen(new int[2]);
            }
        }
    }

    /* renamed from: I */
    public final void mo128654I() {
        if (!this.f186731A) {
            this.f186731A = true;
            ((FirstPhotoViewModel) C1181ae.m3881a(C22228c.m41832b(this), (C1175ad.AbstractC1177b) null).mo3983a(FirstPhotoViewModel.class)).f165677a.observe(this, new C83649d(this));
            UploadButton uploadButton = this.f186745j;
            if (uploadButton == null) {
                C89219l.m154710a("uploadButton");
            }
            uploadButton.setOnClickListener(new C83650e(this));
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.e.d$f */
    static final class RunnableC83652f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C83642d f186764a;

        static {
            Covode.recordClassIndex(97542);
        }

        RunnableC83652f(C83642d dVar) {
            this.f186764a = dVar;
        }

        public final void run() {
            if (this.f186764a.mo128653H() && C83642d.m143973a(this.f186764a).getVisibility() == 0) {
                this.f186764a.f186742g.f186873a.storeBoolean("upload_tip_show", true);
                AbstractC23317a aVar = this.f186764a.f186748t;
                if (aVar != null) {
                    aVar.mo38001a();
                }
                C39162r.m79460a("photo_music_toast_show", new C84425b().mo129406a("creation_id", this.f186764a.mo62771E().f155830o).mo129406a("shoot_way", this.f186764a.mo62771E().f155831p).mo129406a("enter_from", "video_shoot_page").f188764a);
            }
        }
    }

    /* renamed from: H */
    public final boolean mo128653H() {
        if (this.f52549m == null) {
            return false;
        }
        try {
            String str = null;
            AbstractC83406b bVar = (AbstractC83406b) getDiContainer().mo35252b(AbstractC83406b.class, null);
            if (bVar != null) {
                str = bVar.getCurrentBottomTag();
            }
            Activity activity = this.f52549m;
            if (activity == null) {
                C89219l.m154715b();
            }
            if (TextUtils.equals(str, activity.getString(R.string.f7k))) {
                return true;
            }
            Activity activity2 = this.f52549m;
            if (activity2 == null) {
                C89219l.m154715b();
            }
            if (TextUtils.equals(str, activity2.getString(R.string.f7m))) {
                return true;
            }
            if (C70629db.m124816b()) {
                Activity activity3 = this.f52549m;
                if (activity3 == null) {
                    C89219l.m154715b();
                }
                if (TextUtils.equals(str, activity3.getString(R.string.f7l))) {
                    return true;
                }
            }
            Activity activity4 = this.f52549m;
            if (activity4 == null) {
                C89219l.m154715b();
            }
            if (TextUtils.equals(str, activity4.getString(R.string.f7n))) {
                return true;
            }
            return false;
        } catch (C89390y unused) {
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.e.d$e */
    public static final class C83650e extends AbstractView$OnClickListenerC81441k {

        /* renamed from: a */
        final /* synthetic */ C83642d f186762a;

        static {
            Covode.recordClassIndex(97540);
        }

        /* renamed from: com.ss.android.ugc.gamora.recorder.e.d$e$a */
        public static final class C83651a implements AbstractC63264v.AbstractC63265a {

            /* renamed from: a */
            final /* synthetic */ C83650e f186763a;

            static {
                Covode.recordClassIndex(97541);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C83651a(C83650e eVar) {
                this.f186763a = eVar;
            }

            @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63264v.AbstractC63265a
            /* renamed from: a */
            public final void mo87657a(String[] strArr, int[] iArr) {
                Activity t = this.f186763a.f186762a.mo36486t();
                C89219l.m154716b(t, "");
                C83643a.m143990a(t, this.f186763a.f186762a.mo62771E());
                C73975b.C73976a.f166071a.start(OpenAlbumPanelPerformanceMonitor.f166158a, "onClick");
                this.f186763a.f186762a.mo128655a(true);
                Activity t2 = this.f186763a.f186762a.mo36486t();
                C89219l.m154716b(t2, "");
                C83643a.m143991a(t2, this.f186763a.f186762a.mo62771E(), this.f186763a.f186762a.getDiContainer());
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83650e(C83642d dVar) {
            super(0, false, 3);
            this.f186762a = dVar;
        }

        /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
            java.lang.IndexOutOfBoundsException: Index 2 out of bounds for length 2
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            	at java.base/java.util.Objects.checkIndex(Objects.java:359)
            	at java.base/java.util.ArrayList.get(ArrayList.java:427)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
            */
        @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81441k
        /* renamed from: a */
        public final void mo78773a(android.view.View r5) {
            /*
                r4 = this;
                java.lang.String r3 = ""
                p4600h.p4611f.p4613b.C89219l.m154721d(r5, r3)
                com.ss.android.ugc.gamora.recorder.e.d r2 = r4.f186762a
                long r0 = java.lang.System.currentTimeMillis()
                r2.f186749u = r0
                boolean r0 = com.p2082ss.android.ugc.aweme.experiment.C46981gn.m90261a()
                if (r0 == 0) goto L_0x0022
                com.ss.android.ugc.gamora.recorder.e.d r0 = r4.f186762a
                androidx.fragment.app.e r1 = com.bytedance.scene.ktx.C22228c.m41832b(r0)
                com.ss.android.ugc.gamora.recorder.e.d$e$a r0 = new com.ss.android.ugc.gamora.recorder.e.d$e$a
                r0.<init>(r4)
                com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.permissionmanager.C73773g.m129832a(r1, r0)
                return
            L_0x0022:
                com.ss.android.ugc.gamora.recorder.e.d r0 = r4.f186762a
                android.app.Activity r1 = r0.mo36486t()
                p4600h.p4611f.p4613b.C89219l.m154716b(r1, r3)
                com.ss.android.ugc.gamora.recorder.e.d r0 = r4.f186762a
                com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r0.mo62771E()
                com.p2082ss.android.ugc.gamora.recorder.p4298e.C83642d.C83643a.m143990a(r1, r0)
                com.ss.android.ugc.aweme.shortvideo.util.b r2 = com.p2082ss.android.ugc.aweme.shortvideo.util.C73975b.C73976a.f166071a
                com.ss.android.ugc.aweme.shortvideo.util.performance.OpenAlbumPanelPerformanceMonitor r1 = com.p2082ss.android.ugc.aweme.shortvideo.util.performance.OpenAlbumPanelPerformanceMonitor.f166158a
                java.lang.String r0 = "onClick"
                r2.start(r1, r0)
                com.ss.android.ugc.gamora.recorder.e.d r1 = r4.f186762a
                r0 = 1
                r1.mo128655a(r0)
                com.ss.android.ugc.gamora.recorder.e.d r0 = r4.f186762a
                android.app.Activity r2 = r0.mo36486t()
                p4600h.p4611f.p4613b.C89219l.m154716b(r2, r3)
                com.ss.android.ugc.gamora.recorder.e.d r0 = r4.f186762a
                com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r1 = r0.mo62771E()
                com.ss.android.ugc.gamora.recorder.e.d r0 = r4.f186762a
                com.bytedance.o.f r0 = r0.getDiContainer()
                com.p2082ss.android.ugc.gamora.recorder.p4298e.C83642d.C83643a.m143991a(r2, r1, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.recorder.p4298e.C83642d.C83650e.mo78773a(android.view.View):void");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.e.d$t */
    public static final class C83668t implements AbstractC75301e {

        /* renamed from: a */
        final /* synthetic */ C83642d f186781a;

        static {
            Covode.recordClassIndex(97558);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C83668t(C83642d dVar) {
            this.f186781a = dVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.p3954d.AbstractC75301e
        /* renamed from: a */
        public final void mo87551a(C75618a aVar) {
            C89219l.m154721d(aVar, "");
            if (aVar.f170024c == EnumC75295a.MANUAL_SET) {
                C83642d.m143976c(this.f186781a).setVisibility(0);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.p3954d.AbstractC75301e
        /* renamed from: a */
        public final void mo87552a(C75621d dVar) {
            C89219l.m154721d(dVar, "");
            C83642d.m143976c(this.f186781a).setVisibility(8);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.e.d$o */
    static final class C83661o<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83642d f186773a;

        static {
            Covode.recordClassIndex(97551);
        }

        C83661o(C83642d dVar) {
            this.f186773a = dVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            C83642d.m143975b(this.f186773a).setNoBlockTouchListener(new TouchSensitiveRelativeLayout.AbstractC74264a(this) {
                /* class com.p2082ss.android.ugc.gamora.recorder.p4298e.C83642d.C83661o.C836621 */

                /* renamed from: a */
                final /* synthetic */ C83661o f186774a;

                static {
                    Covode.recordClassIndex(97552);
                }

                {
                    this.f186774a = r1;
                }

                @Override // com.p2082ss.android.ugc.aweme.shortvideo.widget.TouchSensitiveRelativeLayout.AbstractC74264a
                /* renamed from: a */
                public final void mo116857a() {
                    this.f186774a.f186773a.f186738c.mo6999a(C89391z.f203057a);
                }
            });
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ UploadButton m143973a(C83642d dVar) {
        UploadButton uploadButton = dVar.f186745j;
        if (uploadButton == null) {
            C89219l.m154710a("uploadButton");
        }
        return uploadButton;
    }

    /* renamed from: b */
    public static final /* synthetic */ TouchSensitiveRelativeLayout m143975b(C83642d dVar) {
        TouchSensitiveRelativeLayout touchSensitiveRelativeLayout = dVar.f186740e;
        if (touchSensitiveRelativeLayout == null) {
            C89219l.m154710a("recordTool");
        }
        return touchSensitiveRelativeLayout;
    }

    /* renamed from: c */
    public static final /* synthetic */ View m143976c(C83642d dVar) {
        View view = dVar.f186744i;
        if (view == null) {
            C89219l.m154710a("ivCrossIcon");
        }
        return view;
    }

    /* renamed from: e */
    public final void mo128656e(int i) {
        UploadButton uploadButton = this.f186745j;
        if (uploadButton == null) {
            C89219l.m154710a("uploadButton");
        }
        uploadButton.setVisibility(i);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af> S1 getState(VM1 vm1) {
        C89219l.m154721d(vm1, "");
        return (S1) AbstractC20382b.C20383a.m38582a(this, vm1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.recorder.e.d$d */
    public static final class C83649d<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C83642d f186761a;

        static {
            Covode.recordClassIndex(97539);
        }

        C83649d(C83642d dVar) {
            this.f186761a = dVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            C59154d dVar = (C59154d) obj;
            if (dVar != null) {
                C83642d.m143973a(this.f186761a).mo96652a(true, dVar.f134591a.f134593a, dVar.f134592b, AbstractC59174d.C59175a.f134652a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.e.d$j */
    static final class C83656j<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83642d f186768a;

        static {
            Covode.recordClassIndex(97546);
        }

        C83656j(C83642d dVar) {
            this.f186768a = dVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            ViewGroup viewGroup = this.f186768a.f186741f;
            if (viewGroup == null) {
                C89219l.m154710a("effectContainer");
            }
            C89219l.m154716b(num, "");
            viewGroup.setVisibility(num.intValue());
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.e.d$k */
    static final class C83657k<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83642d f186769a;

        static {
            Covode.recordClassIndex(97547);
        }

        C83657k(C83642d dVar) {
            this.f186769a = dVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            AbstractC23317a aVar;
            AbstractC23317a aVar2 = this.f186769a.f186747l;
            if (aVar2 != null && aVar2.isShowing() && (aVar = this.f186769a.f186747l) != null) {
                aVar.dismiss();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.e.d$l */
    static final class C83658l<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83642d f186770a;

        static {
            Covode.recordClassIndex(97548);
        }

        C83658l(C83642d dVar) {
            this.f186770a = dVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            AbstractC23317a aVar;
            AbstractC23317a aVar2 = this.f186770a.f186748t;
            if (aVar2 != null && aVar2.isShowing() && (aVar = this.f186770a.f186748t) != null) {
                aVar.dismiss();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.e.d$n */
    static final class C83660n<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83642d f186772a;

        static {
            Covode.recordClassIndex(97550);
        }

        C83660n(C83642d dVar) {
            this.f186772a = dVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            if (C83642d.m143976c(this.f186772a).getVisibility() == 0) {
                C83642d.m143976c(this.f186772a).setVisibility(8);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.e.d$p */
    static final class C83663p<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83642d f186775a;

        static {
            Covode.recordClassIndex(97553);
        }

        C83663p(C83642d dVar) {
            this.f186775a = dVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            if (C63244g.m114602a().mo73277e().getEnableCommerceUnlockStickerCollectTips(true)) {
                C22228c.m41830a(this.f186775a, new Runnable(this) {
                    /* class com.p2082ss.android.ugc.gamora.recorder.p4298e.C83642d.C83663p.RunnableC836641 */

                    /* renamed from: a */
                    final /* synthetic */ C83663p f186776a;

                    static {
                        Covode.recordClassIndex(97554);
                    }

                    {
                        this.f186776a = r1;
                    }

                    public final void run() {
                        C83642d dVar = this.f186776a.f186775a;
                        Activity activity = dVar.f52549m;
                        if (activity == null) {
                            C89219l.m154715b();
                        }
                        C89219l.m154716b(activity, "");
                        C23329a aVar = new C23329a(activity);
                        View view = dVar.f186743h;
                        if (view == null) {
                            C89219l.m154710a("ivTool");
                        }
                        ((C23329a) aVar.mo38041b(view).mo38034a(EnumC23352h.TOP)).mo38023e(R.string.g3y).mo38030a(3000L).mo38012d();
                        C63244g.m114602a().mo73277e().setEnableCommerceUnlockStickerCollectTips(false);
                    }
                });
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.e.d$i */
    static final class C83655i<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83642d f186767a;

        static {
            Covode.recordClassIndex(97545);
        }

        C83655i(C83642d dVar) {
            this.f186767a = dVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            Boolean bool = (Boolean) obj;
            C89219l.m154716b(bool, "");
            if (bool.booleanValue()) {
                i = C71812ep.m126783a(33.0d, C63247i.f143610a) + this.f186767a.f186746k;
            } else {
                i = this.f186767a.f186746k;
            }
            ViewGroup.LayoutParams layoutParams = C83642d.m143975b(this.f186767a).getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.bottomMargin = i;
            C83642d.m143975b(this.f186767a).setLayoutParams(layoutParams2);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.e.d$m */
    static final class C83659m<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83642d f186771a;

        static {
            Covode.recordClassIndex(97549);
        }

        C83659m(C83642d dVar) {
            this.f186771a = dVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (C83643a.m143992a(this.f186771a.mo62771E())) {
                this.f186771a.mo128656e(4);
                if (num == null) {
                    return;
                }
            } else {
                C83642d dVar = this.f186771a;
                C89219l.m154716b(num, "");
                dVar.mo128656e(num.intValue());
            }
            if (num.intValue() == 0) {
                this.f186771a.mo128654I();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.recorder.e.d$r */
    public static final class C83666r extends AbstractC89220m implements AbstractC89172b<OpeningChooseMediaPageState, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C83642d f186779a;

        static {
            Covode.recordClassIndex(97556);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83666r(C83642d dVar) {
            super(1);
            this.f186779a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(OpeningChooseMediaPageState openingChooseMediaPageState) {
            C89219l.m154721d(openingChooseMediaPageState, "");
            if (C89219l.m154714a(openingChooseMediaPageState, OpeningChooseMediaPageState.OnSceneAnimationEnded.INSTANCE)) {
                this.f186779a.mo128651F().mo22742b(false, new PrivacyCert(new C13349j("1031"), "Open the camera on the shooting page to preview and shoot the video.", new C13350k[]{C13401b.m24107a()}));
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.e.d$h */
    static final class C83654h<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83642d f186766a;

        static {
            Covode.recordClassIndex(97544);
        }

        C83654h(C83642d dVar) {
            this.f186766a = dVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            if (((Number) ((C89386u) obj).getFirst()).intValue() == 3) {
                this.f186766a.mo128651F().mo22796ad();
                if (this.f186766a.mo62771E().f155817b.f155662r != null) {
                    this.f186766a.mo128652G().mo128897E().mo119595e();
                }
                this.f186766a.mo128651F().mo22740a(false, new PrivacyCert(new C13349j("1011"), "Open the camera on the shooting page to preview and shoot the video.", new C13350k[]{C13401b.m24107a()}));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.recorder.e.d$s */
    public static final class C83667s extends AbstractC89220m implements AbstractC89172b<ClosingChooseMediaPageState, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C83642d f186780a;

        static {
            Covode.recordClassIndex(97557);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83667s(C83642d dVar) {
            super(1);
            this.f186780a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(ClosingChooseMediaPageState closingChooseMediaPageState) {
            AbstractC83406b bVar;
            C89219l.m154721d(closingChooseMediaPageState, "");
            if (C89219l.m154714a(closingChooseMediaPageState, ClosingChooseMediaPageState.Closed.INSTANCE) && (bVar = (AbstractC83406b) this.f186780a.getDiContainer().mo35252b(AbstractC83406b.class, null)) != null && bVar.isCurrentTabNeedCamera()) {
                this.f186780a.mo128651F().mo22740a(false, new PrivacyCert(new C13349j("1012"), "Open the camera on the shooting page to preview and shoot the video.", new C13350k[]{C13401b.m24107a()}));
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.e.d$c */
    static final class C83648c extends AbstractC89220m implements AbstractC89172b<String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C83642d f186760a;

        static {
            Covode.recordClassIndex(97538);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83648c(C83642d dVar) {
            super(1);
            this.f186760a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(String str) {
            RecordPresetResource recordPresetResource;
            String str2 = str;
            C89219l.m154721d(str2, "");
            C83642d dVar = this.f186760a;
            String str3 = dVar.mo62771E().f155757R;
            if (AVExternalServiceImpl.m113114a().configService().avsettingsConfig().isDuetAutoApplyEffectEnabled() && dVar.mo62771E().f155817b.mo109889b()) {
                str3 = dVar.mo62771E().f155761V;
            }
            if ((str3 == null || str3.length() == 0) && ((recordPresetResource = dVar.mo62771E().f155759T) == null || (str3 = recordPresetResource.getEffectId()) == null)) {
                str3 = dVar.mo128652G().mo128896D().mo128847c();
            }
            C39162r.m79460a(str2, new C84425b().mo129406a("creation_id", dVar.mo62771E().f155830o).mo129406a("shoot_way", dVar.mo62771E().f155831p).mo129406a("enter_from", "video_shoot_page").mo129406a("prop_id", str3).mo129406a("prop_selected_from", FaceStickerBean.sCurPropSource).f188764a);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.recorder.e.d$q */
    public static final class C83665q implements VEListener.AbstractC85241j {

        /* renamed from: a */
        final /* synthetic */ C83642d f186777a;

        /* renamed from: b */
        final /* synthetic */ boolean f186778b;

        static {
            Covode.recordClassIndex(97555);
        }

        C83665q(C83642d dVar, boolean z) {
            this.f186777a = dVar;
            this.f186778b = z;
        }

        @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85241j
        /* renamed from: a */
        public final void mo56563a(int i) {
            int i2;
            int i3;
            C83642d dVar = this.f186777a;
            boolean z = this.f186778b;
            if (!C65417d.m117136a() || C75346e.m132154a(dVar.mo128652G()) != null) {
                dVar.mo128651F().mo22747A().getEffectController().mo56802b(true);
            }
            ShortVideoContext E = dVar.mo62771E();
            C89219l.m154721d(E, "");
            if (E.f155797ag) {
                i2 = 1002;
            } else {
                i2 = 3;
            }
            if ((!E.mo110039o() || !C65410ct.m117125a()) && CommentUtils.isDataValid(E.f155825j)) {
                i3 = 4;
            } else {
                i3 = 6;
            }
            if (E.f155796af != null) {
                i3 = 4;
            }
            LocalMediaArgument localMediaArgument = new LocalMediaArgument(1, i2, i3, true, 0, C70637di.m124840a(), C83880c.f187225a, C72440e.m127809a(), C83880c.f187225a, C70455f.m124265a());
            C89219l.m154721d(localMediaArgument, "");
            Bundle bundle = new Bundle();
            bundle.putParcelable("local_media_argument", localMediaArgument);
            bundle.putBoolean("from_upload_btn_click", z);
            bundle.putLong("click_album_icon_time", dVar.f186749u);
            C22227b.m41826b(dVar).mo36533a(C83872a.class, bundle, (C22154f) null);
        }
    }

    /* renamed from: a */
    public final void mo128655a(boolean z) {
        if (C72847c.m128642h(mo128652G().mo23167t().mo119294f())) {
            mo128651F().mo22747A().mo56983h();
        } else {
            AbstractC83492a aVar = (AbstractC83492a) getDiContainer().mo35252b(AbstractC83492a.class, null);
            if (aVar != null) {
                aVar.mo128516c(null);
            }
        }
        mo128651F().mo22783a(new C83665q(this, z));
        if (mo62771E().f155817b.f155662r != null) {
            mo128652G().mo128897E().mo119594d();
        }
        if (!C65417d.m117136a() || !z || C63244g.m114602a().mo73255A().mo93901a()) {
            mo128651F().mo22742b(false, C13400a.m24097j());
            return;
        }
        JediViewModel a = C20531t.m38716a(C22228c.m41832b(this)).mo33800a(ChooseMediaViewModel.class);
        C89219l.m154716b(a, "");
        ChooseMediaViewModel chooseMediaViewModel = (ChooseMediaViewModel) a;
        AbstractC88412b unused = chooseMediaViewModel.mo33677a(this, C83669e.f186782a, new C20370ah(), new C83666r(this));
        AbstractC88412b unused2 = chooseMediaViewModel.mo33677a(this, C83670f.f186783a, new C20370ah(), new C83667s(this));
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo22704a(Bundle bundle) {
        boolean z;
        Intent intent;
        C2559g<C89386u<Integer, Integer, Intent>> e;
        super.mo22704a(bundle);
        View c = mo36475c(R.id.dlt);
        C89219l.m154716b(c, "");
        this.f186740e = (TouchSensitiveRelativeLayout) c;
        View c2 = mo36475c(R.id.asy);
        C89219l.m154716b(c2, "");
        this.f186741f = (ViewGroup) c2;
        View c3 = mo36475c(R.id.c0j);
        C89219l.m154716b(c3, "");
        this.f186743h = c3;
        View c4 = mo36475c(R.id.c0k);
        C89219l.m154716b(c4, "");
        this.f186744i = c4;
        View c5 = mo36475c(R.id.ze);
        C89219l.m154716b(c5, "");
        UploadButton uploadButton = (UploadButton) c5;
        this.f186745j = uploadButton;
        if (uploadButton == null) {
            C89219l.m154710a("uploadButton");
        }
        uploadButton.setText(R.string.h42);
        UploadButton uploadButton2 = this.f186745j;
        if (uploadButton2 == null) {
            C89219l.m154710a("uploadButton");
        }
        uploadButton2.post(new RunnableC83653g(this));
        if (!C75210e.C75211a.m131957a().isQuickPromoPlusEnabled() || !C89219l.m154714a((Object) mo62771E().f155837v, (Object) "super_entrance")) {
            z = false;
        } else {
            z = true;
        }
        Activity activity = this.f52549m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        ActivityC0218d dVar = (ActivityC0218d) activity;
        View view = this.f52550n;
        C89219l.m154716b(view, "");
        AbstractC84089j G = mo128652G();
        C21582f diContainer = getDiContainer();
        C83648c cVar = new C83648c(this);
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(this, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(G, "");
        C89219l.m154721d(diContainer, "");
        C89219l.m154721d(cVar, "");
        new C84015g(dVar, this, z, G, cVar, (ViewGroup) view.findViewById(R.id.asy), (RemoteImageView) view.findViewById(R.id.c0j), (RemoteImageView) view.findViewById(R.id.c0l), (RemoteImageView) view.findViewById(R.id.c0k), diContainer);
        ShortVideoContext E = mo62771E();
        C89219l.m154721d(E, "");
        if (E.f155817b.mo109889b() || E.f155817b.mo109890c() || E.mo110022c() || C83643a.m143992a(E)) {
            mo128656e(4);
        } else {
            mo128654I();
        }
        this.f186736F.mo7036a(this, new C83655i(this));
        this.f186733C.mo7036a(this, new C83656j(this));
        if (TextUtils.equals(mo62771E().f155831p, "upload_anchor")) {
            C73975b.C73976a.f166071a.start(OpenAlbumPanelPerformanceMonitor.f166158a, "onClick");
            mo128655a(false);
        }
        this.f186737G.f186726a.mo6997a(this, new C83657k(this));
        this.f186737G.f186727b.mo6997a(this, new C83658l(this));
        this.f186734D.mo7036a(this, new C83659m(this));
        ((AbstractC14193m) this.f186753z.mo23374a(this, f186729b[3])).mo22902i().mo6997a(this, new C83660n(this));
        this.f186735E.mo6997a(this, new C83661o(this));
        this.f186737G.f186728c.mo6997a(this, new C83663p(this));
        AbstractC71864a aVar = (AbstractC71864a) getDiContainer().mo35252b(AbstractC71864a.class, null);
        if (!(aVar == null || (e = aVar.mo113517e()) == null)) {
            e.mo6997a(this, new C83654h(this));
        }
        Activity activity2 = this.f52549m;
        if (!(activity2 == null || (intent = activity2.getIntent()) == null)) {
            String a = m143974a(intent, "extra_super_entrance_pop");
            if (!TextUtils.isEmpty(a)) {
                if (this.f186747l == null) {
                    Activity activity3 = this.f52549m;
                    if (activity3 == null) {
                        C89219l.m154715b();
                    }
                    C89219l.m154716b(activity3, "");
                    C23329a aVar2 = new C23329a(activity3);
                    if (a == null) {
                        C89219l.m154715b();
                    }
                    AbstractC23332b a2 = aVar2.mo38022a(a).mo38030a(-1001L).mo38034a(EnumC23352h.TOP);
                    View view2 = this.f186743h;
                    if (view2 == null) {
                        C89219l.m154710a("ivTool");
                    }
                    this.f186747l = a2.mo38041b(view2).mo38012d();
                }
                View view3 = this.f186743h;
                if (view3 == null) {
                    C89219l.m154710a("ivTool");
                }
                view3.postDelayed(new RunnableC83647b(this), 1000);
                new SuperEntranceEvent(1, false).post();
            }
        }
        UploadButton uploadButton3 = this.f186745j;
        if (uploadButton3 == null) {
            C89219l.m154710a("uploadButton");
        }
        if (uploadButton3.getVisibility() == 0 && !this.f186742g.f186873a.getBoolean("upload_tip_show", false) && !C89219l.m154714a((Object) mo62771E().f155831p, (Object) "duet") && !C89219l.m154714a((Object) mo62771E().f155831p, (Object) "split") && !C89219l.m154714a((Object) mo62771E().f155831p, (Object) "react")) {
            IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
            C89219l.m154716b(createIAVServiceProxybyMonsterPlugin, "");
            if (!createIAVServiceProxybyMonsterPlugin.getStoryService().mo93871e() || C63244g.m114602a().mo73255A().mo93901a()) {
                if (this.f186748t == null) {
                    Activity activity4 = this.f52549m;
                    if (activity4 == null) {
                        C89219l.m154715b();
                    }
                    C89219l.m154716b(activity4, "");
                    AbstractC23332b a3 = new C23329a(activity4).mo38023e(R.string.b05).mo38030a(-1001L).mo38034a(EnumC23352h.TOP);
                    UploadButton uploadButton4 = this.f186745j;
                    if (uploadButton4 == null) {
                        C89219l.m154710a("uploadButton");
                    }
                    this.f186748t = a3.mo38041b(uploadButton4).mo38030a(5000L).mo38012d();
                }
                UploadButton uploadButton5 = this.f186745j;
                if (uploadButton5 == null) {
                    C89219l.m154710a("uploadButton");
                }
                uploadButton5.postDelayed(new RunnableC83652f(this), 100);
            }
        }
        if (AVExternalServiceImpl.m113114a().configService().avsettingsConfig().isDuetAutoApplyEffectEnabled() && mo62771E().f155817b.mo109889b()) {
            mo128652G().mo23168u().mo118615a(new C83668t(this));
        }
    }

    /* renamed from: a */
    private static String m143974a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20382b.C20383a.m38593a(this, vm1, bVar);
    }

    @Override // com.bytedance.scene.AbstractC22219j, com.bytedance.scene.group.AbstractC22186b
    /* renamed from: a */
    public final /* synthetic */ View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return mo22702a(layoutInflater, viewGroup);
    }

    @Override // com.bytedance.scene.group.AbstractC22186b
    /* renamed from: b */
    public final ViewGroup mo36393b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.bhw, viewGroup, false);
        Objects.requireNonNull(a, "null cannot be cast to non-null type android.view.ViewGroup");
        return (ViewGroup) a;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public <S extends AbstractC20368af> AbstractC88412b subscribe(JediViewModel<S> jediViewModel, C20370ah<S> ahVar, AbstractC89183m<? super AbstractC20477i, ? super S, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20382b.C20383a.m38583a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public <S extends AbstractC20368af, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        AbstractC20382b.C20383a.m38599a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public <S extends AbstractC20368af, A> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20382b.C20383a.m38606d(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public <S extends AbstractC20368af, A> void subscribeEvent(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends C20391d<? extends A>> kVar, C20370ah<C20373ak<C20391d<A>>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        AbstractC20382b.C20383a.m38602b(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public <S extends AbstractC20368af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends C20365ac<? extends A>> kVar, C20370ah<C20373ak<C20365ac<A>>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        AbstractC20382b.C20383a.m38605c(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public <S extends AbstractC20368af, A, B> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, C20370ah<C20374al<A, B>> ahVar, AbstractC89187q<? super AbstractC20477i, ? super A, ? super B, C89391z> qVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(qVar, "");
        return AbstractC20382b.C20383a.m38585a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public <S extends AbstractC20368af, T> AbstractC88412b asyncSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends AbstractC20362a<? extends T>> kVar, C20370ah<C20373ak<AbstractC20362a<T>>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super Throwable, C89391z> mVar, AbstractC89172b<? super AbstractC20477i, C89391z> bVar, AbstractC89183m<? super AbstractC20477i, ? super T, C89391z> mVar2) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        return AbstractC20382b.C20383a.m38584a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    public C83642d(C21582f fVar, C2560h<Integer> hVar, C2560h<Integer> hVar2, C2559g<C89391z> gVar, C2560h<Boolean> hVar3, C83641c cVar) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(hVar, "");
        C89219l.m154721d(hVar2, "");
        C89219l.m154721d(gVar, "");
        C89219l.m154721d(hVar3, "");
        C89219l.m154721d(cVar, "");
        this.f186732B = fVar;
        this.f186733C = hVar;
        this.f186734D = hVar2;
        this.f186735E = gVar;
        this.f186736F = hVar3;
        this.f186737G = cVar;
        C2563k<C89391z> kVar = new C2563k<>();
        this.f186738c = kVar;
        this.f186739d = kVar;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public <S extends AbstractC20368af, A, B, C> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, C20370ah<C20375am<A, B, C>> ahVar, AbstractC89188r<? super AbstractC20477i, ? super A, ? super B, ? super C, C89391z> rVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(rVar, "");
        return AbstractC20382b.C20383a.m38586a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public <S extends AbstractC20368af, A, B, C, D> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, AbstractC89290k<S, ? extends D> kVar4, C20370ah<C20376an<A, B, C, D>> ahVar, AbstractC89189s<? super AbstractC20477i, ? super A, ? super B, ? super C, ? super D, C89391z> sVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(kVar4, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(sVar, "");
        return AbstractC20382b.C20383a.m38587a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}
