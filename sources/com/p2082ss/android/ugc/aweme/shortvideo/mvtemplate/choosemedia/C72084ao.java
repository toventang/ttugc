package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C0643b;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.AbstractC0976n;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.bytedance.jedi.arch.C20526p;
import com.bytedance.jedi.arch.C20531t;
import com.bytedance.scene.AbstractC22219j;
import com.bytedance.scene.group.AbstractC22186b;
import com.bytedance.scene.ktx.C22227b;
import com.bytedance.scene.ktx.C22228c;
import com.bytedance.scene.navigation.C22239d;
import com.bytedance.scene.p1617a.p1618a.C22121c;
import com.bytedance.scene.p1621c.C22154f;
import com.bytedance.services.apm.api.C22708a;
import com.bytedance.tux.sheet.sheet.C23226a;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.experiment.C46916ew;
import com.p2082ss.android.ugc.aweme.experiment.C46981gn;
import com.p2082ss.android.ugc.aweme.ftc.C51811a;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.p2082ss.android.ugc.aweme.p2730de.C40979n;
import com.p2082ss.android.ugc.aweme.photo.local.MediaTypeNavigator;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63194at;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63264v;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63269z;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63253l;
import com.p2082ss.android.ugc.aweme.property.C65401cn;
import com.p2082ss.android.ugc.aweme.property.C65417d;
import com.p2082ss.android.ugc.aweme.property.C65444e;
import com.p2082ss.android.ugc.aweme.services.upload.IServiceMusicResDownListener;
import com.p2082ss.android.ugc.aweme.setting.C68065d;
import com.p2082ss.android.ugc.aweme.shortvideo.C69892bn;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.MediaChosenResultProcessFactory;
import com.p2082ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C70455f;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AbstractC72264w;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C72235n;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ClosingChooseMediaPageState;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.OpeningChooseMediaPageState;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.View$OnClickListenerC72152av;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.p3844b.AbstractC72165c;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.p3844b.C72163a;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.p3844b.C72164b;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.cutsame.AbstractC72273b;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.cutsame.CutSameVideoImageExtraData;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.lazy.AbstractC72358a;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.preview.AbstractC72365d;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.preview.C72377f;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.C72435c;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.C72436d;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.C72440e;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.C72448f;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.p3847a.AbstractC72424b;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.p3847a.AbstractC72430d;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.p3847a.AbstractC72431e;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.NoticeView;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.VideoRecordNewActivity;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.permissionmanager.C73772f;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.permissionmanager.C73773g;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73975b;
import com.p2082ss.android.ugc.aweme.shortvideo.util.performance.OpenAlbumPanelPerformanceMonitor;
import com.p2082ss.android.ugc.aweme.sticker.p3965m.p3966a.C75419d;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80322d;
import com.p2082ss.android.ugc.aweme.utils.C80571if;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.utils.C84896h;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import com.p2082ss.android.ugc.tools.utils.C84904k;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84917a;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84918b;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84919c;
import com.p2082ss.android.ugc.tools.view.widget.ViewPagerBottomSheetBehavior;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.vesdk.C85308af;
import com.p2082ss.android.vesdk.VEImageDetectUtils;
import com.p2082ss.ugc.aweme.performance.p4431a.C86654a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88405ad;
import p4560f.p4561a.AbstractC88407af;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ao */
public final class C72084ao extends AbstractC22186b implements C72235n.AbstractC72241a, AbstractC72264w, AbstractC84917a, AbstractC84918b {

    /* renamed from: af */
    public static final C72085a f161573af = new C72085a((byte) 0);

    /* renamed from: A */
    public int f161574A = 3145728;

    /* renamed from: B */
    public ShortVideoContext f161575B;

    /* renamed from: C */
    public int f161576C;

    /* renamed from: D */
    public int f161577D = -1;

    /* renamed from: E */
    public int f161578E = -1;

    /* renamed from: F */
    public int f161579F = -1;

    /* renamed from: G */
    public int f161580G = -1;

    /* renamed from: H */
    public int f161581H;

    /* renamed from: I */
    public List<? extends MvImageChooseAdapter.MyMediaModel> f161582I;

    /* renamed from: J */
    public List<? extends MvImageChooseAdapter.MyMediaModel> f161583J;

    /* renamed from: K */
    public int f161584K;

    /* renamed from: L */
    public int f161585L;

    /* renamed from: M */
    public int f161586M;

    /* renamed from: N */
    public int f161587N;

    /* renamed from: O */
    public boolean f161588O;

    /* renamed from: P */
    public AbstractC72424b f161589P;

    /* renamed from: Q */
    public boolean f161590Q;

    /* renamed from: R */
    public final C85308af f161591R = new C85308af();

    /* renamed from: S */
    public AbstractC72263v f161592S;

    /* renamed from: T */
    public ChooseMediaViewModel f161593T;

    /* renamed from: U */
    public AbstractC72273b f161594U;

    /* renamed from: V */
    public String f161595V;

    /* renamed from: W */
    public String f161596W;

    /* renamed from: X */
    public String f161597X;

    /* renamed from: Y */
    public String f161598Y;

    /* renamed from: Z */
    public boolean f161599Z = true;

    /* renamed from: aA */
    private boolean f161600aA = true;

    /* renamed from: aB */
    private long f161601aB;

    /* renamed from: aC */
    private long f161602aC;

    /* renamed from: aD */
    private MusicModel f161603aD;

    /* renamed from: aE */
    private String f161604aE;

    /* renamed from: aF */
    private String f161605aF;

    /* renamed from: aG */
    private ArrayList<CutSameVideoImageExtraData> f161606aG;

    /* renamed from: aH */
    private AbstractC63154aa f161607aH = ((AbstractC63154aa) C63244g.m114602a().mo73291s());

    /* renamed from: aI */
    private boolean f161608aI;

    /* renamed from: aJ */
    private final AbstractC89244h f161609aJ = C89250i.m154773a((AbstractC89171a) C72093ah.f161669a);

    /* renamed from: aK */
    private final AbstractC89244h f161610aK = C89250i.m154773a((AbstractC89171a) new C72096ak(this));

    /* renamed from: aL */
    private final AbstractC89244h f161611aL = C89250i.m154773a((AbstractC89171a) new C72104ar(this));

    /* renamed from: aM */
    private final boolean f161612aM = C46981gn.m90261a();

    /* renamed from: aN */
    private boolean f161613aN;

    /* renamed from: aO */
    private boolean f161614aO;

    /* renamed from: aP */
    private boolean f161615aP;

    /* renamed from: aQ */
    private boolean f161616aQ;

    /* renamed from: aR */
    private boolean f161617aR;

    /* renamed from: aS */
    private final AbstractC89244h f161618aS = C89250i.m154773a((AbstractC89171a) C72105as.f161682a);

    /* renamed from: aa */
    public ArrayList<String> f161619aa;

    /* renamed from: ab */
    public boolean f161620ab = C65417d.m117136a();

    /* renamed from: ac */
    public AbstractC84919c f161621ac;

    /* renamed from: ad */
    public long f161622ad = 200;

    /* renamed from: ae */
    long f161623ae = -1;

    /* renamed from: ag */
    private View f161624ag;

    /* renamed from: ah */
    private View f161625ah;

    /* renamed from: ai */
    private MediaTypeNavigator f161626ai;

    /* renamed from: aj */
    private C72067ak f161627aj;

    /* renamed from: ak */
    private int f161628ak;

    /* renamed from: al */
    private int f161629al;

    /* renamed from: am */
    private int f161630am;

    /* renamed from: an */
    private int f161631an;

    /* renamed from: ao */
    private int f161632ao;

    /* renamed from: ap */
    private int f161633ap;

    /* renamed from: aq */
    private Parcelable f161634aq;

    /* renamed from: ar */
    private int f161635ar;

    /* renamed from: as */
    private boolean f161636as;

    /* renamed from: at */
    private boolean f161637at;

    /* renamed from: au */
    private int f161638au = -1;

    /* renamed from: av */
    private String f161639av;

    /* renamed from: aw */
    private String f161640aw;

    /* renamed from: ax */
    private long f161641ax;

    /* renamed from: ay */
    private long f161642ay = -1;

    /* renamed from: az */
    private AbstractC72262u f161643az;

    /* renamed from: b */
    public int f161644b;

    /* renamed from: c */
    public TextView f161645c;

    /* renamed from: d */
    public TextView f161646d;

    /* renamed from: e */
    public C72208e f161647e;

    /* renamed from: f */
    public C72080al f161648f;

    /* renamed from: g */
    public C72060ae f161649g;

    /* renamed from: h */
    public C72223l f161650h;

    /* renamed from: i */
    public NoticeView f161651i;

    /* renamed from: j */
    public ViewStub f161652j;

    /* renamed from: k */
    public ViewPager f161653k;

    /* renamed from: l */
    public int f161654l;

    /* renamed from: t */
    public int f161655t;

    /* renamed from: u */
    public int f161656u;

    /* renamed from: v */
    public int f161657v;

    /* renamed from: w */
    public String f161658w;

    /* renamed from: x */
    public String f161659x;

    /* renamed from: y */
    public final ArrayList<MediaModel> f161660y = new ArrayList<>();

    /* renamed from: z */
    public SdkExtraInfo f161661z;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ao$l */
    public static final class C72117l implements MvImageChooseAdapter.AbstractC72048c {

        /* renamed from: a */
        final /* synthetic */ C72084ao f161700a;

        /* renamed from: b */
        final /* synthetic */ C72129o f161701b;

        /* renamed from: c */
        final /* synthetic */ C72123n f161702c;

        static {
            Covode.recordClassIndex(84782);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.AbstractC72048c
        /* renamed from: a */
        public final boolean mo114291a(MvImageChooseAdapter.MyMediaModel myMediaModel) {
            return true;
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ao$l$a */
        static final class C72118a extends AbstractC89220m implements AbstractC89171a<View> {

            /* renamed from: a */
            final /* synthetic */ View f161703a;

            static {
                Covode.recordClassIndex(84783);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C72118a(View view) {
                super(0);
                this.f161703a = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* bridge */ /* synthetic */ View invoke() {
                return this.f161703a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ao$l$b */
        static final class C72119b extends AbstractC89220m implements AbstractC89171a<MvImageChooseAdapter.MyMediaModel> {

            /* renamed from: a */
            final /* synthetic */ MvImageChooseAdapter.MyMediaModel f161704a;

            static {
                Covode.recordClassIndex(84784);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C72119b(MvImageChooseAdapter.MyMediaModel myMediaModel) {
                super(0);
                this.f161704a = myMediaModel;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* bridge */ /* synthetic */ MvImageChooseAdapter.MyMediaModel invoke() {
                return this.f161704a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ao$l$c */
        static final class C72120c extends AbstractC89220m implements AbstractC89171a<Integer> {

            /* renamed from: a */
            public static final C72120c f161705a = new C72120c();

            static {
                Covode.recordClassIndex(84785);
            }

            C72120c() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ Integer invoke() {
                return 3;
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.AbstractC72048c
        /* renamed from: a */
        public final void mo114287a() {
            this.f161700a.mo114362L();
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.AbstractC72048c
        /* renamed from: b */
        public final boolean mo114292b() {
            List<MvImageChooseAdapter.MyMediaModel> a;
            AbstractC72424b bVar = this.f161700a.f161589P;
            if (bVar == null || (a = bVar.mo114693a()) == null || a.size() < this.f161700a.f161654l) {
                return false;
            }
            return true;
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ao$l$d */
        static final class C72121d extends AbstractC89220m implements AbstractC89171a<Boolean> {

            /* renamed from: a */
            final /* synthetic */ C72117l f161706a;

            static {
                Covode.recordClassIndex(84786);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C72121d(C72117l lVar) {
                super(0);
                this.f161706a = lVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ Boolean invoke() {
                List<MvImageChooseAdapter.MyMediaModel> a;
                AbstractC72424b bVar = this.f161706a.f161700a.f161589P;
                boolean z = false;
                if (!(bVar == null || (a = bVar.mo114693a()) == null || a.size() < this.f161706a.f161700a.f161654l)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.AbstractC72048c
        /* renamed from: a */
        public final void mo114288a(MediaModel mediaModel) {
            if (!this.f161700a.mo114360J() && !C46916ew.m90217b()) {
                return;
            }
            if (mediaModel == null || !mediaModel.mo96674b()) {
                this.f161702c.mo114288a(mediaModel);
            } else {
                this.f161701b.mo114288a(mediaModel);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.AbstractC72048c
        /* renamed from: b */
        public final boolean mo114293b(MediaModel mediaModel) {
            if (this.f161700a.f161594U == null) {
                return true;
            }
            AbstractC72273b bVar = this.f161700a.f161594U;
            if (bVar == null) {
                C89219l.m154715b();
            }
            return AbstractC72273b.C72274a.m127491a(bVar, this.f161700a.mo36483q(), this.f161700a.f161589P, mediaModel);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.AbstractC72048c
        /* renamed from: a */
        public final int mo114286a(MvImageChooseAdapter.MyMediaModel myMediaModel, boolean z) {
            this.f161700a.mo114363M();
            ChooseMediaViewModel chooseMediaViewModel = this.f161700a.f161593T;
            if (chooseMediaViewModel != null) {
                chooseMediaViewModel.mo114217a();
            }
            boolean z2 = true;
            if (myMediaModel == null || !myMediaModel.mo96674b()) {
                C72080al alVar = this.f161700a.f161648f;
                if (alVar != null) {
                    alVar.mo114330a(myMediaModel, z);
                }
            } else {
                C72223l lVar = this.f161700a.f161650h;
                if (lVar != null) {
                    lVar.mo114330a(myMediaModel, z);
                }
            }
            AbstractC72424b bVar = this.f161700a.f161589P;
            if (bVar == null) {
                C89219l.m154715b();
            }
            if (myMediaModel == null || !myMediaModel.mo96674b()) {
                z2 = false;
            }
            return bVar.mo114692a(myMediaModel, z, z2);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.AbstractC72048c
        /* renamed from: a */
        public final void mo114289a(MvImageChooseAdapter.MyMediaModel myMediaModel, View view) {
            if (myMediaModel != null && view != null) {
                ChooseMediaViewModel chooseMediaViewModel = this.f161700a.f161593T;
                if (chooseMediaViewModel != null) {
                    chooseMediaViewModel.f161364d = 1;
                    chooseMediaViewModel.mo114227b(chooseMediaViewModel.f161363c);
                }
                C72084ao aoVar = this.f161700a;
                aoVar.f161586M = aoVar.mo114364a(myMediaModel);
                this.f161700a.f161588O = false;
                this.f161700a.mo114368a(new C72118a(view), new C72119b(myMediaModel), C72120c.f161705a, new C72121d(this));
            }
        }

        C72117l(C72084ao aoVar, C72129o oVar, C72123n nVar) {
            this.f161700a = aoVar;
            this.f161701b = oVar;
            this.f161702c = nVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.AbstractC72048c
        /* renamed from: a */
        public final void mo114290a(List<MvImageChooseAdapter.MyMediaModel> list, MvImageChooseAdapter.EnumC72047b bVar, MvImageChooseAdapter.MyMediaModel myMediaModel) {
            int i;
            int i2;
            boolean z;
            int i3 = 0;
            if (list != null) {
                i = list.size();
            } else {
                i = 0;
            }
            if (this.f161700a.f161584K + this.f161700a.f161585L < i) {
                if (list != null) {
                    z = list.get(C89070n.m154517a((List) list)).mo96674b();
                } else {
                    z = false;
                }
                String str = null;
                if (z) {
                    C72084ao aoVar = this.f161700a;
                    if (myMediaModel != null) {
                        str = myMediaModel.f161473x;
                    }
                    aoVar.mo114371a(list, bVar, str);
                } else {
                    C72084ao aoVar2 = this.f161700a;
                    if (myMediaModel != null) {
                        str = myMediaModel.f161473x;
                    }
                    aoVar2.mo114367a(bVar, str);
                }
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (list != null) {
                int i4 = 0;
                for (MvImageChooseAdapter.MyMediaModel myMediaModel2 : list) {
                    if (myMediaModel2.mo96674b()) {
                        i3++;
                        arrayList2.add(myMediaModel2);
                    } else {
                        i4++;
                        arrayList.add(myMediaModel2);
                    }
                }
                i2 = i3;
                i3 = i4;
            } else {
                i2 = 0;
            }
            this.f161700a.f161584K = i3;
            this.f161700a.f161585L = i2;
            this.f161700a.f161582I = arrayList;
            this.f161700a.f161583J = arrayList2;
            this.f161700a.mo114370a(list);
            TextView textView = this.f161700a.f161645c;
            if (textView != null) {
                textView.setVisibility(8);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ao$n */
    public static final class C72123n implements MvImageChooseAdapter.AbstractC72048c {

        /* renamed from: a */
        final /* synthetic */ C72084ao f161708a;

        static {
            Covode.recordClassIndex(84788);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.AbstractC72048c
        /* renamed from: b */
        public final boolean mo114293b(MediaModel mediaModel) {
            return true;
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ao$n$b */
        static final class C72125b extends AbstractC89220m implements AbstractC89171a<View> {

            /* renamed from: a */
            final /* synthetic */ View f161714a;

            static {
                Covode.recordClassIndex(84790);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C72125b(View view) {
                super(0);
                this.f161714a = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* bridge */ /* synthetic */ View invoke() {
                return this.f161714a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ao$n$c */
        static final class C72126c extends AbstractC89220m implements AbstractC89171a<MvImageChooseAdapter.MyMediaModel> {

            /* renamed from: a */
            final /* synthetic */ MvImageChooseAdapter.MyMediaModel f161715a;

            static {
                Covode.recordClassIndex(84791);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C72126c(MvImageChooseAdapter.MyMediaModel myMediaModel) {
                super(0);
                this.f161715a = myMediaModel;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* bridge */ /* synthetic */ MvImageChooseAdapter.MyMediaModel invoke() {
                return this.f161715a;
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.AbstractC72048c
        /* renamed from: a */
        public final void mo114287a() {
            this.f161708a.mo114362L();
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ao$n$d */
        static final class C72127d extends AbstractC89220m implements AbstractC89171a<Integer> {

            /* renamed from: a */
            final /* synthetic */ C72123n f161716a;

            static {
                Covode.recordClassIndex(84792);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C72127d(C72123n nVar) {
                super(0);
                this.f161716a = nVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ Integer invoke() {
                int i;
                if (this.f161716a.f161708a.mo114361K() || C72440e.m127814a(this.f161716a.f161708a.f161644b)) {
                    i = 3;
                } else {
                    i = 2;
                }
                return Integer.valueOf(i);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.AbstractC72048c
        /* renamed from: b */
        public final boolean mo114292b() {
            List<MvImageChooseAdapter.MyMediaModel> a;
            if (C72440e.m127814a(this.f161708a.f161644b) || this.f161708a.f161644b == 11) {
                AbstractC72424b bVar = this.f161708a.f161589P;
                if (bVar == null || (a = bVar.mo114693a()) == null || !(!a.isEmpty()) || a.size() < this.f161708a.f161654l) {
                    return false;
                }
                return true;
            } else if (this.f161708a.f161584K >= this.f161708a.f161654l) {
                return true;
            }
            return false;
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ao$n$e */
        static final class C72128e extends AbstractC89220m implements AbstractC89171a<Boolean> {

            /* renamed from: a */
            final /* synthetic */ C72123n f161717a;

            static {
                Covode.recordClassIndex(84793);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C72128e(C72123n nVar) {
                super(0);
                this.f161717a = nVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ Boolean invoke() {
                AbstractC72424b bVar;
                List<MvImageChooseAdapter.MyMediaModel> a;
                boolean z = false;
                if (!C72440e.m127814a(this.f161717a.f161708a.f161644b) ? this.f161717a.f161708a.f161584K >= this.f161717a.f161708a.f161654l : !((bVar = this.f161717a.f161708a.f161589P) == null || (a = bVar.mo114693a()) == null || !(!a.isEmpty()) || a.size() < this.f161717a.f161708a.f161654l)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C72123n(C72084ao aoVar) {
            this.f161708a = aoVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:47:0x0148, code lost:
            if (r10 != null) goto L_0x014a;
         */
        /* JADX WARNING: Removed duplicated region for block: B:53:0x0163  */
        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.AbstractC72048c
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo114288a(com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel r10) {
            /*
            // Method dump skipped, instructions count: 372
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C72084ao.C72123n.mo114288a(com.ss.android.ugc.aweme.mediachoose.helper.MediaModel):void");
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.AbstractC72048c
        /* renamed from: a */
        public final boolean mo114291a(MvImageChooseAdapter.MyMediaModel myMediaModel) {
            SdkExtraInfo sdkExtraInfo;
            String mvAlgorithmHint;
            String str;
            SdkExtraInfo sdkExtraInfo2;
            PlDataBean pl;
            List<String> alg;
            if (myMediaModel == null) {
                return false;
            }
            if (this.f161708a.f161661z == null || ((sdkExtraInfo = this.f161708a.f161661z) != null && !sdkExtraInfo.isLegal())) {
                return true;
            }
            String str2 = "";
            if (myMediaModel.f134673m < this.f161708a.f161657v || myMediaModel.f134672l < this.f161708a.f161656u) {
                C79459a aVar = new C79459a(this.f161708a.mo36485s());
                String str3 = this.f161708a.f161658w;
                if (str3 != null) {
                    str2 = str3;
                }
                aVar.mo123052a(str2).mo123053a();
                return false;
            }
            AtomicBoolean atomicBoolean = new AtomicBoolean(true);
            String str4 = this.f161708a.f161659x;
            if (!(str4 == null || (str = myMediaModel.f134662b) == null || (sdkExtraInfo2 = this.f161708a.f161661z) == null || (pl = sdkExtraInfo2.getPl()) == null || (alg = pl.getAlg()) == null)) {
                this.f161708a.f161591R.mo130626a(str4, str, alg, new C72124a(str, str4, this, myMediaModel, atomicBoolean));
            }
            if (!atomicBoolean.get()) {
                C79459a aVar2 = new C79459a(this.f161708a.mo36485s());
                SdkExtraInfo sdkExtraInfo3 = this.f161708a.f161661z;
                if (!(sdkExtraInfo3 == null || (mvAlgorithmHint = sdkExtraInfo3.getMvAlgorithmHint()) == null)) {
                    str2 = mvAlgorithmHint;
                }
                aVar2.mo123052a(str2).mo123053a();
            }
            return atomicBoolean.get();
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.AbstractC72048c
        /* renamed from: a */
        public final void mo114289a(MvImageChooseAdapter.MyMediaModel myMediaModel, View view) {
            if (myMediaModel != null && view != null) {
                ChooseMediaViewModel chooseMediaViewModel = this.f161708a.f161593T;
                if (chooseMediaViewModel != null) {
                    chooseMediaViewModel.f161364d = 3;
                    chooseMediaViewModel.mo114227b(chooseMediaViewModel.f161361a);
                }
                C72084ao aoVar = this.f161708a;
                aoVar.f161586M = aoVar.mo114364a(myMediaModel);
                this.f161708a.f161588O = false;
                this.f161708a.mo114368a(new C72125b(view), new C72126c(myMediaModel), new C72127d(this), new C72128e(this));
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.AbstractC72048c
        /* renamed from: a */
        public final int mo114286a(MvImageChooseAdapter.MyMediaModel myMediaModel, boolean z) {
            this.f161708a.mo114363M();
            ChooseMediaViewModel chooseMediaViewModel = this.f161708a.f161593T;
            if (chooseMediaViewModel != null) {
                chooseMediaViewModel.mo114217a();
            }
            AbstractC72424b bVar = this.f161708a.f161589P;
            if (bVar != null) {
                if (this.f161708a.mo114361K() && myMediaModel != null) {
                    C72208e eVar = this.f161708a.f161647e;
                    if (eVar != null) {
                        eVar.mo114330a(myMediaModel, z);
                    }
                    return bVar.mo114692a(myMediaModel, z, false);
                } else if (C72440e.m127814a(this.f161708a.f161644b) && myMediaModel != null) {
                    return bVar.mo114692a(myMediaModel, z, false);
                }
            }
            List<? extends MvImageChooseAdapter.MyMediaModel> list = this.f161708a.f161582I;
            if (list == null || !(!list.isEmpty())) {
                return 1;
            }
            return list.size();
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.AbstractC72048c
        /* renamed from: a */
        public final void mo114290a(List<MvImageChooseAdapter.MyMediaModel> list, MvImageChooseAdapter.EnumC72047b bVar, MvImageChooseAdapter.MyMediaModel myMediaModel) {
            int i;
            String str;
            if (list != null) {
                i = list.size();
            } else {
                i = 0;
            }
            if (this.f161708a.f161584K < i) {
                C72084ao aoVar = this.f161708a;
                if (myMediaModel != null) {
                    str = myMediaModel.f161473x;
                } else {
                    str = null;
                }
                aoVar.mo114367a(bVar, str);
            }
            this.f161708a.f161584K = i;
            this.f161708a.f161582I = list;
            this.f161708a.mo114370a(list);
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ao$n$a */
        static final class C72124a implements VEImageDetectUtils.IDetectImageResultListener {

            /* renamed from: a */
            final /* synthetic */ String f161709a;

            /* renamed from: b */
            final /* synthetic */ String f161710b;

            /* renamed from: c */
            final /* synthetic */ C72123n f161711c;

            /* renamed from: d */
            final /* synthetic */ MvImageChooseAdapter.MyMediaModel f161712d;

            /* renamed from: e */
            final /* synthetic */ AtomicBoolean f161713e;

            static {
                Covode.recordClassIndex(84789);
            }

            C72124a(String str, String str2, C72123n nVar, MvImageChooseAdapter.MyMediaModel myMediaModel, AtomicBoolean atomicBoolean) {
                this.f161709a = str;
                this.f161710b = str2;
                this.f161711c = nVar;
                this.f161712d = myMediaModel;
                this.f161713e = atomicBoolean;
            }

            @Override // com.p2082ss.android.vesdk.VEImageDetectUtils.IDetectImageResultListener
            public final void onDetectResult(String str, String str2, String str3, boolean z) {
                this.f161713e.set(z);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ao$o */
    public static final class C72129o implements MvImageChooseAdapter.AbstractC72048c {

        /* renamed from: a */
        final /* synthetic */ C72084ao f161718a;

        static {
            Covode.recordClassIndex(84794);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.AbstractC72048c
        /* renamed from: a */
        public final boolean mo114291a(MvImageChooseAdapter.MyMediaModel myMediaModel) {
            return true;
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ao$o$a */
        static final class C72130a extends AbstractC89220m implements AbstractC89171a<View> {

            /* renamed from: a */
            final /* synthetic */ View f161719a;

            static {
                Covode.recordClassIndex(84795);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C72130a(View view) {
                super(0);
                this.f161719a = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* bridge */ /* synthetic */ View invoke() {
                return this.f161719a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ao$o$b */
        static final class C72131b extends AbstractC89220m implements AbstractC89171a<MvImageChooseAdapter.MyMediaModel> {

            /* renamed from: a */
            final /* synthetic */ MvImageChooseAdapter.MyMediaModel f161720a;

            static {
                Covode.recordClassIndex(84796);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C72131b(MvImageChooseAdapter.MyMediaModel myMediaModel) {
                super(0);
                this.f161720a = myMediaModel;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* bridge */ /* synthetic */ MvImageChooseAdapter.MyMediaModel invoke() {
                return this.f161720a;
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.AbstractC72048c
        /* renamed from: a */
        public final void mo114287a() {
            this.f161718a.mo114362L();
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ao$o$c */
        static final class C72132c extends AbstractC89220m implements AbstractC89171a<Integer> {

            /* renamed from: a */
            final /* synthetic */ C72129o f161721a;

            static {
                Covode.recordClassIndex(84797);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C72132c(C72129o oVar) {
                super(0);
                this.f161721a = oVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ Integer invoke() {
                int i;
                if (this.f161721a.f161718a.mo114361K() || C72440e.m127814a(this.f161721a.f161718a.f161644b)) {
                    i = 3;
                } else {
                    i = 1;
                }
                return Integer.valueOf(i);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.AbstractC72048c
        /* renamed from: b */
        public final boolean mo114292b() {
            List<MvImageChooseAdapter.MyMediaModel> a;
            if (C72440e.m127814a(this.f161718a.f161644b) || this.f161718a.f161644b == 11) {
                AbstractC72424b bVar = this.f161718a.f161589P;
                if (bVar == null || (a = bVar.mo114693a()) == null || !(!a.isEmpty()) || a.size() < this.f161718a.f161655t) {
                    return false;
                }
                return true;
            } else if (this.f161718a.f161585L >= this.f161718a.f161655t) {
                return true;
            }
            return false;
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ao$o$d */
        static final class C72133d extends AbstractC89220m implements AbstractC89171a<Boolean> {

            /* renamed from: a */
            final /* synthetic */ C72129o f161722a;

            static {
                Covode.recordClassIndex(84798);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C72133d(C72129o oVar) {
                super(0);
                this.f161722a = oVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ Boolean invoke() {
                AbstractC72424b bVar;
                List<MvImageChooseAdapter.MyMediaModel> a;
                boolean z = false;
                if (!C72440e.m127814a(this.f161722a.f161718a.f161644b) ? this.f161722a.f161718a.f161585L >= this.f161722a.f161718a.f161655t : !((bVar = this.f161722a.f161718a.f161589P) == null || (a = bVar.mo114693a()) == null || !(!a.isEmpty()) || a.size() < this.f161722a.f161718a.f161655t)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C72129o(C72084ao aoVar) {
            this.f161718a = aoVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.AbstractC72048c
        /* renamed from: a */
        public final void mo114288a(MediaModel mediaModel) {
            this.f161718a.f161660y.clear();
            if (mediaModel != null) {
                this.f161718a.f161660y.add(mediaModel);
            }
            this.f161718a.f161581H = 2;
            this.f161718a.mo114363M();
            this.f161718a.mo114375c(true);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.AbstractC72048c
        /* renamed from: b */
        public final boolean mo114293b(MediaModel mediaModel) {
            Context r = this.f161718a.mo36484r();
            if (r == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(r, "");
            if (C51811a.m96524a(r, C84896h.m145868b(mediaModel), "video_upload")) {
                return false;
            }
            if (this.f161718a.f161594U == null) {
                return true;
            }
            AbstractC72273b bVar = this.f161718a.f161594U;
            if (bVar == null) {
                C89219l.m154715b();
            }
            return AbstractC72273b.C72274a.m127491a(bVar, this.f161718a.mo36483q(), this.f161718a.f161589P, mediaModel);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.AbstractC72048c
        /* renamed from: a */
        public final int mo114286a(MvImageChooseAdapter.MyMediaModel myMediaModel, boolean z) {
            this.f161718a.mo114363M();
            ChooseMediaViewModel chooseMediaViewModel = this.f161718a.f161593T;
            if (chooseMediaViewModel != null) {
                chooseMediaViewModel.mo114217a();
            }
            AbstractC72424b bVar = this.f161718a.f161589P;
            if (bVar != null) {
                if (this.f161718a.mo114361K() && myMediaModel != null) {
                    C72208e eVar = this.f161718a.f161647e;
                    if (eVar != null) {
                        eVar.mo114330a(myMediaModel, z);
                    }
                    return bVar.mo114692a(myMediaModel, z, true);
                } else if (C72440e.m127814a(this.f161718a.f161644b) && myMediaModel != null) {
                    return bVar.mo114692a(myMediaModel, z, true);
                }
            }
            List<? extends MvImageChooseAdapter.MyMediaModel> list = this.f161718a.f161583J;
            if (list == null || !(!list.isEmpty())) {
                return 1;
            }
            return list.size();
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.AbstractC72048c
        /* renamed from: a */
        public final void mo114289a(MvImageChooseAdapter.MyMediaModel myMediaModel, View view) {
            if (myMediaModel != null && view != null) {
                ChooseMediaViewModel chooseMediaViewModel = this.f161718a.f161593T;
                if (chooseMediaViewModel != null) {
                    chooseMediaViewModel.f161364d = 2;
                    chooseMediaViewModel.mo114227b(chooseMediaViewModel.f161362b);
                }
                C72084ao aoVar = this.f161718a;
                aoVar.f161586M = aoVar.mo114364a(myMediaModel);
                this.f161718a.f161588O = false;
                this.f161718a.mo114368a(new C72130a(view), new C72131b(myMediaModel), new C72132c(this), new C72133d(this));
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.AbstractC72048c
        /* renamed from: a */
        public final void mo114290a(List<MvImageChooseAdapter.MyMediaModel> list, MvImageChooseAdapter.EnumC72047b bVar, MvImageChooseAdapter.MyMediaModel myMediaModel) {
            int i;
            String str;
            if (list != null) {
                i = list.size();
            } else {
                i = 0;
            }
            if (this.f161718a.f161585L < i) {
                C72084ao aoVar = this.f161718a;
                if (myMediaModel != null) {
                    str = myMediaModel.f161473x;
                } else {
                    str = null;
                }
                aoVar.mo114371a(list, bVar, str);
            }
            this.f161718a.f161585L = i;
            this.f161718a.f161583J = list;
            this.f161718a.mo114370a(list);
        }
    }

    static {
        Covode.recordClassIndex(84749);
    }

    /* renamed from: N */
    private final SafeHandler m127222N() {
        return (SafeHandler) this.f161611aL.getValue();
    }

    /* renamed from: E */
    public final AbstractC72165c mo62771E() {
        return (AbstractC72165c) this.f161609aJ.getValue();
    }

    /* renamed from: F */
    public final float mo114356F() {
        return ((Number) this.f161610aK.getValue()).floatValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AbstractC72264w
    /* renamed from: g */
    public final void mo114266g() {
        this.f161599Z = false;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ao$a */
    public static final class C72085a {
        static {
            Covode.recordClassIndex(84750);
        }

        private C72085a() {
        }

        public /* synthetic */ C72085a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AbstractC72264w
    /* renamed from: i */
    public final boolean mo114267i() {
        return this.f161599Z;
    }

    @Override // com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84918b
    /* renamed from: a */
    public final boolean mo62778a(int i, int i2, Intent intent) {
        String str;
        ChooseMediaState chooseMediaState;
        AbstractC63154aa.AbstractC63157c k;
        if (mo114359I()) {
            if (this.f161594U != null) {
                mo36486t();
            }
            return true;
        }
        if (i == this.f161633ap) {
            int i3 = this.f161644b;
            if ((i3 == 4 || i3 == 10) && i2 != -1) {
                return true;
            }
            if (!this.f161613aN) {
                mo36486t().setResult(i2, intent);
            }
            mo114358H();
        }
        int f = m127228f(this.f161660y.size());
        ShortVideoContext shortVideoContext = this.f161575B;
        Boolean bool = null;
        if (shortVideoContext != null) {
            str = shortVideoContext.f155817b.mo109893e();
        } else {
            str = null;
        }
        ShortVideoContext shortVideoContext2 = this.f161575B;
        if (shortVideoContext2 != null) {
            bool = Boolean.valueOf(shortVideoContext2.f155753N);
        }
        if (i == 12346) {
            if (C65401cn.m117102b() && ((f == 3 || f == 11) && this.f161644b != 9 && (str == null || str.length() <= 0 || bool == null || bool.booleanValue()))) {
                ChooseMediaViewModel chooseMediaViewModel = this.f161593T;
                if (!(chooseMediaViewModel == null || (chooseMediaState = (ChooseMediaState) chooseMediaViewModel.mo33676a(this)) == null || !chooseMediaState.isChangeMusicDownloadSuccess())) {
                    AbstractC63154aa aaVar = this.f161607aH;
                    if (!(aaVar == null || (k = aaVar.mo101552k()) == null)) {
                        k.mo101571d();
                    }
                    ChooseMediaViewModel chooseMediaViewModel2 = this.f161593T;
                    if (chooseMediaViewModel2 != null) {
                        chooseMediaViewModel2.mo114224a(false);
                    }
                }
                mo114374b(true);
            }
            return true;
        }
        if (i == 12345) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C72235n.AbstractC72241a
    /* renamed from: a */
    public final void mo114372a(boolean z) {
        mo62771E().mo114418a(this.f161575B, z);
    }

    /* renamed from: a */
    public final void mo114371a(List<? extends MvImageChooseAdapter.MyMediaModel> list, MvImageChooseAdapter.EnumC72047b bVar, String str) {
        mo62771E().mo114417a(this.f161575B, list, bVar, str);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AbstractC72264w
    /* renamed from: a */
    public final void mo114264a(boolean z, MusicModel musicModel, String str) {
        ChooseMediaViewModel chooseMediaViewModel = this.f161593T;
        if (chooseMediaViewModel != null) {
            chooseMediaViewModel.mo114224a(z);
        }
        ChooseMediaViewModel chooseMediaViewModel2 = this.f161593T;
        if (chooseMediaViewModel2 != null) {
            chooseMediaViewModel2.mo114225b(musicModel, str);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ao$u */
    public static final class C72139u implements AbstractC72431e {

        /* renamed from: a */
        final /* synthetic */ C72084ao f161729a;

        static {
            Covode.recordClassIndex(84804);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.p3847a.AbstractC72431e
        /* renamed from: a */
        public final void mo114399a(int i, int i2) {
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.p3847a.AbstractC72431e
        /* renamed from: a */
        public final void mo114400a(MvImageChooseAdapter.MyMediaModel myMediaModel) {
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ao$u$a */
        public static final class C72140a implements AbstractC72365d {

            /* renamed from: a */
            final /* synthetic */ MvImageChooseAdapter.MyMediaModel f161730a;

            /* renamed from: b */
            final /* synthetic */ C72139u f161731b;

            /* renamed from: c */
            final /* synthetic */ View f161732c;

            static {
                Covode.recordClassIndex(84805);
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.preview.AbstractC72365d
            /* renamed from: d */
            public final int mo114390d() {
                return 3;
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.preview.AbstractC72365d
            /* renamed from: e */
            public final boolean mo114391e() {
                return false;
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.preview.AbstractC72365d
            /* renamed from: c */
            public final int mo114389c() {
                return this.f161730a.f161471v - 1;
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.preview.AbstractC72365d
            /* renamed from: a */
            public final boolean mo114386a() {
                if (!this.f161731b.f161729a.mo114359I()) {
                    return true;
                }
                return false;
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.preview.AbstractC72365d
            /* renamed from: b */
            public final View mo114388b() {
                AbstractC72424b bVar = this.f161731b.f161729a.f161589P;
                if (bVar != null) {
                    return bVar.mo114699b(this.f161731b.f161729a.f161587N);
                }
                return null;
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.preview.AbstractC72365d
            /* renamed from: a */
            public final boolean mo114387a(MvImageChooseAdapter.MyMediaModel myMediaModel) {
                if (this.f161731b.f161729a.f161594U == null) {
                    return true;
                }
                AbstractC72273b bVar = this.f161731b.f161729a.f161594U;
                if (bVar == null) {
                    C89219l.m154715b();
                }
                return bVar.mo114503a(this.f161731b.f161729a.mo36483q(), this.f161731b.f161729a.f161589P, this.f161730a, false);
            }

            C72140a(MvImageChooseAdapter.MyMediaModel myMediaModel, C72139u uVar, View view) {
                this.f161730a = myMediaModel;
                this.f161731b = uVar;
                this.f161732c = view;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C72139u(C72084ao aoVar) {
            this.f161729a = aoVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.p3847a.AbstractC72431e
        /* renamed from: a */
        public final void mo114401a(MvImageChooseAdapter.MyMediaModel myMediaModel, View view) {
            AbstractC72424b bVar;
            List<MvImageChooseAdapter.MyMediaModel> a;
            AbstractC72424b bVar2;
            ArrayList<MvImageChooseAdapter.MyMediaModel> e;
            ChooseMediaViewModel chooseMediaViewModel;
            if (myMediaModel != null && view != null && C84902i.m145892a(myMediaModel.f134662b) && (bVar = this.f161729a.f161589P) != null && (a = bVar.mo114693a()) != null) {
                if (!(!C46916ew.m90217b() || (bVar2 = this.f161729a.f161589P) == null || (e = bVar2.mo114704e()) == null || (chooseMediaViewModel = this.f161729a.f161593T) == null)) {
                    chooseMediaViewModel.mo114223a(e);
                }
                ChooseMediaViewModel chooseMediaViewModel2 = this.f161729a.f161593T;
                if (chooseMediaViewModel2 != null) {
                    ArrayList<MvImageChooseAdapter.MyMediaModel> arrayList = new ArrayList<>(a);
                    C89219l.m154721d(arrayList, "");
                    chooseMediaViewModel2.f161364d = 0;
                    chooseMediaViewModel2.mo114227b(arrayList);
                }
                this.f161729a.f161587N = myMediaModel.f161471v - 1;
                this.f161729a.f161588O = true;
                C72377f.f162257t = new C72140a(myMediaModel, this, view);
                this.f161729a.mo114369a(C72377f.class);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ao$ai */
    static final class RunnableC72094ai implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C72084ao f161670a;

        static {
            Covode.recordClassIndex(84759);
        }

        RunnableC72094ai(C72084ao aoVar) {
            this.f161670a = aoVar;
        }

        public final void run() {
            this.f161670a.mo114374b(false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ao$ao */
    static final class C72101ao extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C23226a f161678a;

        static {
            Covode.recordClassIndex(84766);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72101ao(C23226a aVar) {
            super(0);
            this.f161678a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f161678a.dismiss();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ao$ar */
    static final class C72104ar extends AbstractC89220m implements AbstractC89171a<SafeHandler> {

        /* renamed from: a */
        final /* synthetic */ C72084ao f161681a;

        static {
            Covode.recordClassIndex(84769);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72104ar(C72084ao aoVar) {
            super(0);
            this.f161681a = aoVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SafeHandler invoke() {
            return new SafeHandler(this.f161681a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ao$as */
    static final class C72105as extends AbstractC89220m implements AbstractC89171a<C80571if> {

        /* renamed from: a */
        public static final C72105as f161682a = new C72105as();

        static {
            Covode.recordClassIndex(84770);
        }

        C72105as() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C80571if invoke() {
            return new C80571if();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ao$b */
    final class C72106b extends AbstractC72358a {

        /* renamed from: a */
        final /* synthetic */ C72084ao f161683a;

        static {
            Covode.recordClassIndex(84771);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final int getCount() {
            return this.f161683a.f161576C;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.lazy.AbstractC72360b
        /* renamed from: a */
        public final /* synthetic */ Fragment mo114382a(int i) {
            return this.f161683a.mo114377e(i);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final CharSequence getPageTitle(int i) {
            if (i == this.f161683a.f161577D) {
                return this.f161683a.mo36476c_(R.string.s8);
            }
            if (i == this.f161683a.f161579F) {
                return this.f161683a.mo36476c_(R.string.doq);
            }
            if (i == this.f161683a.f161578E) {
                return this.f161683a.mo36476c_(R.string.h6l);
            }
            if (i == this.f161683a.f161580G) {
                return this.f161683a.mo36476c_(R.string.c42);
            }
            return super.getPageTitle(i);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C72106b(C72084ao aoVar, AbstractC0952i iVar) {
            super(iVar);
            C89219l.m154721d(iVar, "");
            this.f161683a = aoVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ao$k */
    public static final class C72115k extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C72084ao f161698a;

        static {
            Covode.recordClassIndex(84780);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72115k(C72084ao aoVar) {
            super(0);
            this.f161698a = aoVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            mo114392a();
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public final void mo114392a() {
            C72060ae aeVar = this.f161698a.f161649g;
            if (aeVar != null) {
                aeVar.f161520g = new View$OnClickListenerC72152av.AbstractC72154b(this) {
                    /* class com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C72084ao.C72115k.C721161 */

                    /* renamed from: a */
                    final /* synthetic */ C72115k f161699a;

                    static {
                        Covode.recordClassIndex(84781);
                    }

                    {
                        this.f161699a = r1;
                    }

                    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.View$OnClickListenerC72152av.AbstractC72154b
                    /* renamed from: a */
                    public final void mo114348a(View$OnClickListenerC72152av.C72153a aVar, boolean z, int i, boolean z2) {
                        boolean z3;
                        boolean z4;
                        TextView textView;
                        if (aVar != null) {
                            C84911q.m145922a("MvChoosePhotoActivity", "onAlbumChooseCallback, model != null");
                            if ((i & 8) == 0 && (i & 2) == 0) {
                                z3 = false;
                            } else {
                                z3 = true;
                            }
                            int i2 = i & 16;
                            if (i2 != 0) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (this.f161699a.f161698a.f161579F != -1 && z3) {
                                C84911q.m145922a("MvChoosePhotoActivity", "onAlbumChooseCallback, refreshPhotoList");
                                ChooseMediaViewModel chooseMediaViewModel = this.f161699a.f161698a.f161593T;
                                if (chooseMediaViewModel != null) {
                                    ArrayList arrayList = new ArrayList(aVar.f161757b);
                                    C89219l.m154721d(arrayList, "");
                                    chooseMediaViewModel.mo33689c(new ChooseMediaViewModel.C72024s(arrayList, z2));
                                    chooseMediaViewModel.f161361a.clear();
                                    chooseMediaViewModel.f161361a.addAll(arrayList);
                                    if (chooseMediaViewModel.f161364d == 3) {
                                        chooseMediaViewModel.mo114227b(chooseMediaViewModel.f161361a);
                                    }
                                }
                            }
                            if (!(this.f161699a.f161698a.f161578E == -1 || i2 == 0)) {
                                C84911q.m145922a("MvChoosePhotoActivity", "onAlbumChooseCallback, refreshVideoList");
                                ChooseMediaViewModel chooseMediaViewModel2 = this.f161699a.f161698a.f161593T;
                                if (chooseMediaViewModel2 != null) {
                                    ArrayList arrayList2 = new ArrayList(aVar.f161758c);
                                    C89219l.m154721d(arrayList2, "");
                                    chooseMediaViewModel2.mo33689c(new ChooseMediaViewModel.C72026u(arrayList2, z2));
                                    chooseMediaViewModel2.f161362b.clear();
                                    chooseMediaViewModel2.f161362b.addAll(arrayList2);
                                    if (chooseMediaViewModel2.f161364d == 2) {
                                        chooseMediaViewModel2.mo114227b(chooseMediaViewModel2.f161362b);
                                    }
                                }
                            }
                            if (this.f161699a.f161698a.f161577D != -1 && z4 && z3) {
                                C84911q.m145922a("MvChoosePhotoActivity", "onAlbumChooseCallback, refreshAllList");
                                ChooseMediaViewModel chooseMediaViewModel3 = this.f161699a.f161698a.f161593T;
                                if (chooseMediaViewModel3 != null) {
                                    ArrayList arrayList3 = new ArrayList(aVar.mo114409a());
                                    C89219l.m154721d(arrayList3, "");
                                    chooseMediaViewModel3.mo33689c(new ChooseMediaViewModel.C72023r(arrayList3, z2));
                                    chooseMediaViewModel3.f161363c.clear();
                                    chooseMediaViewModel3.f161363c.addAll(arrayList3);
                                    if (chooseMediaViewModel3.f161364d == 1) {
                                        chooseMediaViewModel3.mo114227b(chooseMediaViewModel3.f161363c);
                                    }
                                }
                            }
                            if (!TextUtils.isEmpty(aVar.f161756a) && (textView = this.f161699a.f161698a.f161646d) != null) {
                                textView.setText(aVar.f161756a);
                            }
                        } else {
                            C84911q.m145922a("MvChoosePhotoActivity", "onAlbumChooseCallback, model == null");
                        }
                        if (z) {
                            this.f161699a.f161698a.mo114376d(false);
                            this.f161699a.f161698a.mo62771E().mo114411a();
                        }
                    }
                };
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ao$g */
    public static final class C72111g implements AbstractC72365d {

        /* renamed from: a */
        final /* synthetic */ C72084ao f161691a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f161692b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89171a f161693c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89171a f161694d;

        static {
            Covode.recordClassIndex(84776);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.preview.AbstractC72365d
        /* renamed from: a */
        public final boolean mo114386a() {
            if (!this.f161691a.mo114359I()) {
                return true;
            }
            return false;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.preview.AbstractC72365d
        /* renamed from: c */
        public final int mo114389c() {
            return ((MvImageChooseAdapter.MyMediaModel) this.f161692b.invoke()).f161472w;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.preview.AbstractC72365d
        /* renamed from: d */
        public final int mo114390d() {
            return ((Number) this.f161693c.invoke()).intValue();
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.preview.AbstractC72365d
        /* renamed from: e */
        public final boolean mo114391e() {
            return ((Boolean) this.f161694d.invoke()).booleanValue();
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.preview.AbstractC72365d
        /* renamed from: b */
        public final View mo114388b() {
            ViewPager viewPager = this.f161691a.f161653k;
            if (viewPager == null) {
                return null;
            }
            Fragment e = this.f161691a.mo114377e(viewPager.getCurrentItem());
            Objects.requireNonNull(e, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AVMediaChooseBaseFragment");
            AbstractC72051a aVar = (AbstractC72051a) e;
            if (aVar != null) {
                return aVar.mo114340d(this.f161691a.f161586M);
            }
            return null;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.preview.AbstractC72365d
        /* renamed from: a */
        public final boolean mo114387a(MvImageChooseAdapter.MyMediaModel myMediaModel) {
            if (this.f161691a.f161594U == null) {
                return true;
            }
            AbstractC72273b bVar = this.f161691a.f161594U;
            if (bVar == null) {
                C89219l.m154715b();
            }
            return bVar.mo114503a(this.f161691a.mo36483q(), this.f161691a.f161589P, myMediaModel, false);
        }

        C72111g(C72084ao aoVar, AbstractC89171a aVar, AbstractC89171a aVar2, AbstractC89171a aVar3) {
            this.f161691a = aoVar;
            this.f161692b = aVar;
            this.f161693c = aVar2;
            this.f161694d = aVar3;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ao$i */
    public static final class C72113i extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C72084ao f161696a;

        static {
            Covode.recordClassIndex(84778);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72113i(C72084ao aoVar) {
            super(0);
            this.f161696a = aoVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            if (this.f161696a.f161581H != 17) {
                this.f161696a.mo114358H();
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ao$j */
    public static final class C72114j extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C72084ao f161697a;

        static {
            Covode.recordClassIndex(84779);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72114j(C72084ao aoVar) {
            super(0);
            this.f161697a = aoVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            if (C73772f.m129823a("android.permission.WRITE_EXTERNAL_STORAGE")) {
                this.f161697a.mo114357G();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ao$t */
    public static final class C72138t implements AbstractC72430d {

        /* renamed from: a */
        final /* synthetic */ C72084ao f161728a;

        static {
            Covode.recordClassIndex(84803);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.p3847a.AbstractC72430d
        /* renamed from: a */
        public final void mo114397a() {
            Workspace workspace;
            ShortVideoContext shortVideoContext = this.f161728a.f161575B;
            if (shortVideoContext != null && (workspace = shortVideoContext.f155817b.f155652h) != null) {
                workspace.mo110094d();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C72138t(C72084ao aoVar) {
            this.f161728a = aoVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.p3847a.AbstractC72430d
        /* renamed from: a */
        public final void mo114398a(boolean z, ArrayList<MvImageChooseAdapter.MyMediaModel> arrayList) {
            if (z) {
                this.f161728a.f161660y.clear();
                if (arrayList != null) {
                    this.f161728a.f161660y.addAll(arrayList);
                }
                this.f161728a.mo114375c(true);
            }
        }
    }

    /* renamed from: I */
    public final boolean mo114359I() {
        if (this.f161644b == 6) {
            return true;
        }
        return false;
    }

    /* renamed from: J */
    public final boolean mo114360J() {
        if (this.f161644b == 11) {
            return true;
        }
        return false;
    }

    /* renamed from: M */
    public final void mo114363M() {
        if (this.f161600aA) {
            this.f161602aC = System.currentTimeMillis();
            this.f161600aA = false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ao$ah */
    static final class C72093ah extends AbstractC89220m implements AbstractC89171a<AbstractC72165c> {

        /* renamed from: a */
        public static final C72093ah f161669a = new C72093ah();

        static {
            Covode.recordClassIndex(84758);
        }

        C72093ah() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC72165c invoke() {
            if (C63244g.m114602a().mo73255A().mo93901a()) {
                return new C72164b();
            }
            return new C72163a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ao$ak */
    static final class C72096ak extends AbstractC89220m implements AbstractC89171a<Float> {

        /* renamed from: a */
        final /* synthetic */ C72084ao f161673a;

        static {
            Covode.recordClassIndex(84761);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72096ak(C72084ao aoVar) {
            super(0);
            this.f161673a = aoVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Float invoke() {
            View view = this.f161673a.f52550n;
            C89219l.m154716b(view, "");
            return Float.valueOf((float) C13628n.m24521b(view.getContext()));
        }
    }

    /* renamed from: K */
    public final boolean mo114361K() {
        if (mo114360J()) {
            return true;
        }
        if (!this.f161636as || !this.f161637at || !C72440e.m127818c()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: v */
    public final void mo36489v() {
        super.mo36489v();
        if (this.f161620ab && this.f161581H != 17) {
            m127223O();
        }
        if (this.f161581H == 17) {
            this.f161623ae = System.currentTimeMillis();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ao$d */
    static final class RunnableC72108d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ TextView f161687a;

        /* renamed from: b */
        final /* synthetic */ C72084ao f161688b;

        static {
            Covode.recordClassIndex(84773);
        }

        RunnableC72108d(TextView textView, C72084ao aoVar) {
            this.f161687a = textView;
            this.f161688b = aoVar;
        }

        public final void run() {
            int measuredWidth = this.f161687a.getMeasuredWidth();
            int b = C40979n.m82507b(this.f161688b.mo36485s());
            TextView textView = this.f161688b.f161646d;
            if (textView != null) {
                textView.setMaxWidth((b - (measuredWidth * 2)) - ((int) C13628n.m24520b(this.f161688b.mo36485s(), 60.0f)));
            }
            this.f161687a.setVisibility(8);
            this.f161687a.setTextSize(1, 17.0f);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ao$z */
    static final class RunnableC72145z implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C72084ao f161738a;

        /* renamed from: b */
        final /* synthetic */ View f161739b;

        static {
            Covode.recordClassIndex(84810);
        }

        RunnableC72145z(C72084ao aoVar, View view) {
            this.f161738a = aoVar;
            this.f161739b = view;
        }

        public final void run() {
            TextView textView = this.f161738a.f161646d;
            if (textView != null) {
                textView.setMaxWidth((C40979n.m82507b(this.f161738a.mo36485s()) - (this.f161739b.getMeasuredWidth() * 2)) - ((int) C13628n.m24520b(this.f161738a.mo36485s(), 60.0f)));
            }
        }
    }

    /* renamed from: O */
    private final void m127223O() {
        Activity t = mo36486t();
        Objects.requireNonNull(t, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        ActivityC0945e eVar = (ActivityC0945e) t;
        if (this.f161612aM) {
            C73773g.m129833a(eVar, new C72112h(this), new C72113i(this), new C72114j(this));
        } else {
            mo114357G();
        }
    }

    /* renamed from: H */
    public final void mo114358H() {
        if (this.f161613aN) {
            m127224P();
        } else if (this.f52549m == null) {
            C22708a.m42800a("MvChoosePhotoScene.finish: " + this.f161614aO);
        } else {
            mo36486t().finish();
        }
    }

    /* renamed from: L */
    public final void mo114362L() {
        if (mo114360J()) {
            if (!this.f161608aI && this.f161590Q) {
                m127227c(this.f161619aa);
            }
        } else if (this.f161608aI) {
        } else {
            if (mo114361K() || C72440e.m127814a(this.f161644b)) {
                m127227c(this.f161619aa);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AbstractC72264w
    /* renamed from: e */
    public final AbstractC72264w.C72265a mo114265e() {
        MusicModel musicModel;
        ChooseMediaState chooseMediaState;
        PreMusicState lastPreMusicState;
        ChooseMediaState chooseMediaState2;
        PreMusicState lastPreMusicState2;
        ChooseMediaViewModel chooseMediaViewModel = this.f161593T;
        String str = null;
        if (chooseMediaViewModel == null || (chooseMediaState2 = (ChooseMediaState) chooseMediaViewModel.mo33676a(C22228c.m41832b(this))) == null || (lastPreMusicState2 = chooseMediaState2.getLastPreMusicState()) == null) {
            musicModel = null;
        } else {
            musicModel = lastPreMusicState2.getPreMusicModel();
        }
        ChooseMediaViewModel chooseMediaViewModel2 = this.f161593T;
        if (!(chooseMediaViewModel2 == null || (chooseMediaState = (ChooseMediaState) chooseMediaViewModel2.mo33676a(C22228c.m41832b(this))) == null || (lastPreMusicState = chooseMediaState.getLastPreMusicState()) == null)) {
            str = lastPreMusicState.getPreMusicFile();
        }
        return new AbstractC72264w.C72265a(musicModel, str);
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: w */
    public final void mo36490w() {
        super.mo36490w();
        C86654a.C86655a.m150135a().mo137921a("tool_choose_media");
        Bundle bundle = this.f52554r;
        if (bundle != null) {
            long j = bundle.getLong("click_album_icon_time", 0);
            if (j != 0) {
                ((C80571if) this.f161618aS.getValue()).mo123791a("click_album", System.currentTimeMillis() - j, true);
            }
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: x */
    public final void mo36491x() {
        String str;
        super.mo36491x();
        C73975b bVar = C73975b.C73976a.f166071a;
        Context s = mo36485s();
        ShortVideoContext shortVideoContext = this.f161575B;
        String str2 = null;
        if (shortVideoContext != null) {
            str = shortVideoContext.f155831p;
        } else {
            str = null;
        }
        ShortVideoContext shortVideoContext2 = this.f161575B;
        if (shortVideoContext2 != null) {
            str2 = shortVideoContext2.f155830o;
        }
        bVar.pause(s, "album", str, str2);
        C86654a.C86655a.m150135a().mo137921a("tool_choose_media");
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ao$aj */
    public static final class ViewTreeObserver$OnPreDrawListenerC72095aj implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a */
        final /* synthetic */ C72084ao f161671a;

        /* renamed from: b */
        final /* synthetic */ View f161672b;

        static {
            Covode.recordClassIndex(84760);
        }

        public final boolean onPreDraw() {
            C72084ao aoVar = this.f161671a;
            View view = aoVar.f52550n;
            C89219l.m154716b(view, "");
            view.setTranslationY(aoVar.mo114356F());
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.setDuration(aoVar.f161622ad);
            ofFloat.addUpdateListener(new C72102ap(aoVar));
            ofFloat.addListener(new C72103aq(aoVar));
            ofFloat.start();
            this.f161672b.getViewTreeObserver().removeOnPreDrawListener(this);
            return true;
        }

        ViewTreeObserver$OnPreDrawListenerC72095aj(C72084ao aoVar, View view) {
            this.f161671a = aoVar;
            this.f161672b = view;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ao$x */
    static final class RunnableC72143x implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C72084ao f161736a;

        static {
            Covode.recordClassIndex(84808);
        }

        RunnableC72143x(C72084ao aoVar) {
            this.f161736a = aoVar;
        }

        public final void run() {
            C72084ao aoVar = this.f161736a;
            AbstractC63269z A = C63244g.m114602a().mo73255A();
            if (A.mo93903b() && C70455f.f157420d && !C63244g.m114602a().mo73255A().mo93901a()) {
                AbstractC88403ab.m153596a((AbstractC88407af) new C72097al(A)).mo142918b(C88925a.m154180b(C88946a.f201991c)).mo142909a(C88391a.m153580a(C88392a.f200660a)).mo142925c(new C72098am(aoVar)).mo142909a(C88925a.m154180b(C88946a.f201991c)).mo142929d(new C72100an(A));
            }
        }
    }

    public C72084ao() {
        C63244g.m114602a().mo73265K().mo101702a();
    }

    /* renamed from: P */
    private final void m127224P() {
        if (!(!C89219l.m154714a(((ChooseMediaState) ((BaseJediViewModel) C20531t.m38716a(C22228c.m41832b(this)).mo33800a(ChooseMediaViewModel.class)).mo33676a(this)).getClosingChooseMediaPageState(), ClosingChooseMediaPageState.Ready.INSTANCE)) && this.f161613aN) {
            ChooseMediaViewModel chooseMediaViewModel = this.f161593T;
            if (chooseMediaViewModel != null) {
                chooseMediaViewModel.mo114219a(ClosingChooseMediaPageState.Closing.INSTANCE);
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.setDuration(300L);
            ofFloat.addUpdateListener(new C72109e(this));
            ofFloat.addListener(new C72110f(this));
            ofFloat.start();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AbstractC72264w
    /* renamed from: a */
    public final AbstractC72264w.C72265a mo114263a() {
        MusicModel musicModel;
        ChooseMediaState chooseMediaState;
        PreMusicState preMusicState;
        ChooseMediaState chooseMediaState2;
        PreMusicState preMusicState2;
        ChooseMediaViewModel chooseMediaViewModel = this.f161593T;
        String str = null;
        if (chooseMediaViewModel == null || (chooseMediaState2 = (ChooseMediaState) chooseMediaViewModel.mo33676a(C22228c.m41832b(this))) == null || (preMusicState2 = chooseMediaState2.getPreMusicState()) == null) {
            musicModel = null;
        } else {
            musicModel = preMusicState2.getPreMusicModel();
        }
        ChooseMediaViewModel chooseMediaViewModel2 = this.f161593T;
        if (!(chooseMediaViewModel2 == null || (chooseMediaState = (ChooseMediaState) chooseMediaViewModel2.mo33676a(C22228c.m41832b(this))) == null || (preMusicState = chooseMediaState.getPreMusicState()) == null)) {
            str = preMusicState.getPreMusicFile();
        }
        return new AbstractC72264w.C72265a(musicModel, str);
    }

    /* renamed from: Q */
    private final boolean m127225Q() {
        C72223l lVar;
        C72080al alVar = this.f161648f;
        if (alVar != null) {
            alVar.f161564q = this.f161639av;
        }
        C72080al alVar2 = this.f161648f;
        if (alVar2 != null) {
            alVar2.mo114335b(this.f161654l);
        }
        C72080al alVar3 = this.f161648f;
        if (alVar3 != null) {
            alVar3.mo114355b(this.f161637at);
        }
        C72080al alVar4 = this.f161648f;
        if (alVar4 != null) {
            alVar4.f161499k = this.f161581H;
        }
        C72080al alVar5 = this.f161648f;
        if (alVar5 != null && this.f161579F == 0) {
            alVar5.f161502n = true;
        }
        C72223l lVar2 = this.f161650h;
        if (lVar2 != null) {
            lVar2.mo114335b(this.f161655t);
        }
        C72223l lVar3 = this.f161650h;
        if (lVar3 != null) {
            lVar3.f161910s = this.f161636as;
        }
        C72223l lVar4 = this.f161650h;
        if (lVar4 != null) {
            lVar4.f161912u = this.f161641ax;
        }
        C72223l lVar5 = this.f161650h;
        if (lVar5 != null) {
            lVar5.f161499k = this.f161581H;
        }
        C72223l lVar6 = this.f161650h;
        if (lVar6 != null && this.f161578E == 0) {
            lVar6.f161502n = true;
        }
        C72208e eVar = this.f161647e;
        if (eVar != null) {
            eVar.mo114335b(this.f161654l);
        }
        C72208e eVar2 = this.f161647e;
        if (eVar2 != null) {
            eVar2.f161499k = this.f161581H;
        }
        C72208e eVar3 = this.f161647e;
        if (eVar3 != null && this.f161577D == 0) {
            eVar3.f161502n = true;
        }
        this.f161619aa = null;
        Bundle bundle = this.f52554r;
        if (bundle != null) {
            ArrayList<String> stringArrayList = bundle.getStringArrayList("key_selected_video_path");
            if (stringArrayList == null) {
                stringArrayList = new ArrayList<>();
            }
            this.f161619aa = stringArrayList;
            if (!C84904k.m145909a(stringArrayList)) {
                C72208e eVar4 = this.f161647e;
                if (eVar4 != null) {
                    eVar4.mo114331a(this.f161619aa);
                }
                C72223l lVar7 = this.f161650h;
                if (lVar7 != null) {
                    lVar7.mo114331a(this.f161619aa);
                }
                C72080al alVar6 = this.f161648f;
                if (alVar6 != null) {
                    alVar6.mo114331a(this.f161619aa);
                }
            }
        }
        TextView textView = this.f161646d;
        if (textView != null) {
            textView.setText(mo36486t().getResources().getString(R.string.s8));
        }
        if (!this.f161620ab) {
            m127223O();
        }
        View view = this.f161625ah;
        if (view != null) {
            view.setOnClickListener(new View$OnClickListenerC72135q(this));
        }
        if (!(this.f161632ao == 2 || (lVar = this.f161650h) == null)) {
            lVar.mo114437a(new C72136r(this));
        }
        if (!mo114360J() && (mo114361K() || C72440e.m127814a(this.f161644b))) {
            mo114373b(this.f161619aa);
        }
        return true;
    }

    /* renamed from: G */
    public final void mo114357G() {
        C72115k kVar = new C72115k(this);
        boolean z = false;
        if (!this.f161612aM) {
            AbstractC0952i supportFragmentManager = C22228c.m41832b(this).getSupportFragmentManager();
            Fragment a = supportFragmentManager.mo3551a("album_Fragment");
            if (a == null) {
                this.f161649g = new C72060ae();
                kVar.mo114392a();
                C72060ae aeVar = this.f161649g;
                if (aeVar != null) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("key_support_flag", this.f161635ar);
                    if (this.f161644b == 10) {
                        z = true;
                    }
                    bundle.putBoolean("extra_show_gif", z);
                    aeVar.setArguments(bundle);
                }
                C72060ae aeVar2 = this.f161649g;
                if (aeVar2 != null) {
                    AbstractC0976n b = supportFragmentManager.mo3552a().mo3470b(R.id.b82, aeVar2, "album_Fragment");
                    b.mo3471b(aeVar2);
                    b.mo3478e();
                }
            } else {
                this.f161649g = (C72060ae) a;
                kVar.mo114392a();
            }
        } else if (!this.f161616aQ) {
            AbstractC0952i supportFragmentManager2 = C22228c.m41832b(this).getSupportFragmentManager();
            this.f161649g = new C72060ae();
            kVar.mo114392a();
            C72060ae aeVar3 = this.f161649g;
            if (aeVar3 != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putInt("key_support_flag", this.f161635ar);
                if (this.f161644b == 10) {
                    z = true;
                }
                bundle2.putBoolean("extra_show_gif", z);
                aeVar3.setArguments(bundle2);
            }
            C72060ae aeVar4 = this.f161649g;
            if (aeVar4 != null) {
                AbstractC0976n b2 = supportFragmentManager2.mo3552a().mo3470b(R.id.b82, aeVar4, "album_Fragment");
                b2.mo3471b(aeVar4);
                b2.mo3478e();
            }
        }
        this.f161616aQ = true;
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: o */
    public final void mo36481o() {
        double d;
        int valueOf;
        long j;
        AbstractC63154aa.AbstractC63157c k;
        super.mo36481o();
        C72377f.f162257t = null;
        ShortVideoContext shortVideoContext = this.f161575B;
        if (shortVideoContext != null) {
            shortVideoContext.f155753N = false;
        }
        AbstractC63154aa aaVar = this.f161607aH;
        if (!(aaVar == null || (k = aaVar.mo101552k()) == null)) {
            k.mo101566b();
        }
        if (!C72267y.f162004a.isEmpty()) {
            CopyOnWriteArrayList<Long> copyOnWriteArrayList = C72267y.f162004a;
            C89219l.m154721d(copyOnWriteArrayList, "");
            double d2 = 0.0d;
            Iterator<T> it = copyOnWriteArrayList.iterator();
            int i = 0;
            while (it.hasNext()) {
                double longValue = (double) it.next().longValue();
                Double.isNaN(longValue);
                d2 += longValue;
                i++;
                if (i < 0) {
                    C89070n.m154523b();
                }
            }
            if (i == 0) {
                d = Double.NaN;
            } else {
                double d3 = (double) i;
                Double.isNaN(d3);
                d = d2 / d3;
            }
            C84425b bVar = new C84425b();
            if (Double.isNaN(d)) {
                valueOf = -1;
            } else {
                valueOf = Double.valueOf(d);
            }
            C84425b a = bVar.mo129405a("ave_duration", valueOf);
            Long l = (Long) C89070n.m154596p(C72267y.f162004a);
            if (l != null) {
                j = l.longValue();
            } else {
                j = -1;
            }
            C80322d.m139251a("tool_performance_fetch_thumbnail", a.mo129404a("max_duration", j).f188764a);
        }
        C72267y.f162004a.clear();
        C72267y.f162005b = false;
        C72267y.f162006c = 0;
        C72267y.f162007d = 0;
        AbstractC84919c cVar = this.f161621ac;
        if (cVar != null) {
            cVar.mo87534b((AbstractC84918b) this);
            cVar.mo87535c(this);
        }
        Activity activity = this.f52549m;
        if (!(activity instanceof VideoRecordNewActivity)) {
            activity = null;
        }
        VideoRecordNewActivity videoRecordNewActivity = (VideoRecordNewActivity) activity;
        if (videoRecordNewActivity != null) {
            videoRecordNewActivity.f164827v = null;
        }
        ActivityC0945e b = C22228c.m41832b(this);
        if (this.f161620ab && !(b instanceof MvChoosePhotoActivity)) {
            AbstractC0952i supportFragmentManager = C22228c.m41832b(this).getSupportFragmentManager();
            AbstractC0976n a2 = supportFragmentManager.mo3552a();
            Fragment a3 = supportFragmentManager.mo3551a(m127229g(this.f161577D));
            if (a3 != null) {
                a2.mo3455a(a3);
            }
            Fragment a4 = supportFragmentManager.mo3551a(m127229g(this.f161579F));
            if (a4 != null) {
                a2.mo3455a(a4);
            }
            Fragment a5 = supportFragmentManager.mo3551a(m127229g(this.f161578E));
            if (a5 != null) {
                a2.mo3455a(a5);
            }
            Fragment a6 = supportFragmentManager.mo3551a(m127229g(this.f161580G));
            if (a6 != null) {
                a2.mo3455a(a6);
            }
            Fragment a7 = supportFragmentManager.mo3551a("album_Fragment");
            if (a7 != null) {
                a2.mo3455a(a7);
            }
            a2.mo3473c();
            ChooseMediaViewModel chooseMediaViewModel = this.f161593T;
            if (chooseMediaViewModel != null) {
                chooseMediaViewModel.f161361a.clear();
                chooseMediaViewModel.f161362b.clear();
                chooseMediaViewModel.f161363c.clear();
                chooseMediaViewModel.f161364d = 0;
                chooseMediaViewModel.mo33689c(ChooseMediaViewModel.C72015j.f161377a);
            }
            this.f161593T = null;
        }
        C73975b.C73976a.f166071a.leave(mo36485s(), "album");
        C75419d.f169500a = null;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ao$aa */
    public static final class C72086aa extends ViewPager.C1582h {

        /* renamed from: a */
        final /* synthetic */ C72084ao f161662a;

        static {
            Covode.recordClassIndex(84751);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C72086aa(C72084ao aoVar) {
            this.f161662a = aoVar;
        }

        @Override // androidx.viewpager.widget.ViewPager.C1582h, androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageSelected(int i) {
            String str;
            if (i == this.f161662a.f161577D) {
                this.f161662a.mo114366a(i, false, (List<? extends MvImageChooseAdapter.MyMediaModel>) null);
            } else if (i == this.f161662a.f161578E) {
                C72084ao aoVar = this.f161662a;
                aoVar.mo114366a(i, true, aoVar.f161583J);
            } else if (i == this.f161662a.f161579F) {
                C72084ao aoVar2 = this.f161662a;
                aoVar2.mo114366a(i, true, aoVar2.f161582I);
            } else if (i == this.f161662a.f161580G) {
                this.f161662a.mo114366a(i, false, (List<? extends MvImageChooseAdapter.MyMediaModel>) null);
            }
            C72084ao aoVar3 = this.f161662a;
            if (i == aoVar3.f161577D) {
                str = "all";
            } else if (i == this.f161662a.f161578E) {
                str = "video";
            } else if (i == this.f161662a.f161579F) {
                str = UGCMonitor.TYPE_PHOTO;
            } else if (i == this.f161662a.f161580G) {
                str = "giphy";
            } else {
                str = "";
            }
            aoVar3.mo62771E().mo114416a(aoVar3.f161575B, str);
            if (C89219l.m154714a((Object) str, (Object) "giphy")) {
                aoVar3.f161623ae = System.currentTimeMillis();
            } else if (aoVar3.f161623ae != -1) {
                C39162r.m79460a("gif_stay_time", new C84425b().mo129403a("duration", (int) (System.currentTimeMillis() - aoVar3.f161623ae)).mo129406a("enter_from", "video_shoot_page").f188764a);
                aoVar3.f161623ae = -1;
            }
            C72208e eVar = this.f161662a.f161647e;
            if (eVar != null) {
                eVar.mo114343f();
            }
            C72223l lVar = this.f161662a.f161650h;
            if (lVar != null) {
                lVar.mo114343f();
            }
            C72080al alVar = this.f161662a.f161648f;
            if (alVar != null) {
                alVar.mo114343f();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ao$aq */
    public static final class C72103aq extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C72084ao f161680a;

        static {
            Covode.recordClassIndex(84768);
        }

        C72103aq(C72084ao aoVar) {
            this.f161680a = aoVar;
        }

        public final void onAnimationEnd(Animator animator) {
            ChooseMediaViewModel chooseMediaViewModel = this.f161680a.f161593T;
            if (chooseMediaViewModel != null) {
                chooseMediaViewModel.mo114221a(OpeningChooseMediaPageState.OnSceneAnimationEnded.INSTANCE);
            }
            C73975b.C73976a.f166071a.end(OpenAlbumPanelPerformanceMonitor.f166158a, "animationEnded");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ao$f */
    public static final class C72110f extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C72084ao f161690a;

        static {
            Covode.recordClassIndex(84775);
        }

        C72110f(C72084ao aoVar) {
            this.f161690a = aoVar;
        }

        public final void onAnimationEnd(Animator animator) {
            ChooseMediaViewModel chooseMediaViewModel = this.f161690a.f161593T;
            if (chooseMediaViewModel != null) {
                chooseMediaViewModel.mo114219a(ClosingChooseMediaPageState.Closed.INSTANCE);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ao$h */
    public static final class C72112h implements AbstractC63264v.AbstractC63265a {

        /* renamed from: a */
        final /* synthetic */ C72084ao f161695a;

        static {
            Covode.recordClassIndex(84777);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C72112h(C72084ao aoVar) {
            this.f161695a = aoVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63264v.AbstractC63265a
        /* renamed from: a */
        public final void mo87657a(String[] strArr, int[] iArr) {
            this.f161695a.mo114357G();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ao$m */
    public static final class C72122m implements MvImageChooseAdapter.AbstractC72048c {

        /* renamed from: a */
        final /* synthetic */ C72084ao f161707a;

        static {
            Covode.recordClassIndex(84787);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.AbstractC72048c
        /* renamed from: a */
        public final int mo114286a(MvImageChooseAdapter.MyMediaModel myMediaModel, boolean z) {
            return 0;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.AbstractC72048c
        /* renamed from: a */
        public final void mo114287a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.AbstractC72048c
        /* renamed from: a */
        public final void mo114289a(MvImageChooseAdapter.MyMediaModel myMediaModel, View view) {
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.AbstractC72048c
        /* renamed from: a */
        public final void mo114290a(List<MvImageChooseAdapter.MyMediaModel> list, MvImageChooseAdapter.EnumC72047b bVar, MvImageChooseAdapter.MyMediaModel myMediaModel) {
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.AbstractC72048c
        /* renamed from: a */
        public final boolean mo114291a(MvImageChooseAdapter.MyMediaModel myMediaModel) {
            return true;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.AbstractC72048c
        /* renamed from: b */
        public final boolean mo114292b() {
            return false;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.AbstractC72048c
        /* renamed from: b */
        public final boolean mo114293b(MediaModel mediaModel) {
            return true;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C72122m(C72084ao aoVar) {
            this.f161707a = aoVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.AbstractC72048c
        /* renamed from: a */
        public final void mo114288a(MediaModel mediaModel) {
            this.f161707a.f161660y.clear();
            if (mediaModel != null) {
                this.f161707a.f161660y.add(mediaModel);
            }
            this.f161707a.f161581H = 5;
            this.f161707a.mo114363M();
            this.f161707a.mo114375c(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ao$r */
    public static final class C72136r implements MvChoosePhotoActivity.AbstractC72041b {

        /* renamed from: a */
        final /* synthetic */ C72084ao f161726a;

        static {
            Covode.recordClassIndex(84801);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C72136r(C72084ao aoVar) {
            this.f161726a = aoVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity.AbstractC72041b
        /* renamed from: a */
        public final void mo114271a(boolean z) {
            this.f161726a.mo62771E().mo114419b(this.f161726a.f161575B, z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ao$s */
    public static final class C72137s extends ViewPagerBottomSheetBehavior.AbstractC85004a {

        /* renamed from: a */
        final /* synthetic */ C72084ao f161727a;

        static {
            Covode.recordClassIndex(84802);
        }

        @Override // com.p2082ss.android.ugc.tools.view.widget.ViewPagerBottomSheetBehavior.AbstractC85004a
        /* renamed from: a */
        public final void mo114395a(View view) {
            C89219l.m154721d(view, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C72137s(C72084ao aoVar) {
            this.f161727a = aoVar;
        }

        @Override // com.p2082ss.android.ugc.tools.view.widget.ViewPagerBottomSheetBehavior.AbstractC85004a
        /* renamed from: a */
        public final void mo114396a(View view, int i) {
            C89219l.m154721d(view, "");
            if (i == 5) {
                AbstractC72263v vVar = this.f161727a.f161592S;
                if (vVar != null) {
                    vVar.mo114427a();
                }
                this.f161727a.mo114358H();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ao$w */
    static final class View$OnClickListenerC72142w implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C72084ao f161735a;

        static {
            Covode.recordClassIndex(84807);
        }

        View$OnClickListenerC72142w(C72084ao aoVar) {
            this.f161735a = aoVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f161735a.mo114375c(false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ao$y */
    static final class View$OnClickListenerC72144y implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C72084ao f161737a;

        static {
            Covode.recordClassIndex(84809);
        }

        View$OnClickListenerC72144y(C72084ao aoVar) {
            this.f161737a = aoVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f161737a.mo114375c(true);
        }
    }

    /* renamed from: g */
    private static String m127229g(int i) {
        return "android:switcher:2131370290:" + i;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ao$af */
    static final class C72091af extends AbstractC89220m implements AbstractC89172b<C20526p, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C72084ao f161667a;

        static {
            Covode.recordClassIndex(84756);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72091af(C72084ao aoVar) {
            super(1);
            this.f161667a = aoVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C20526p pVar) {
            View f;
            C89219l.m154721d(pVar, "");
            ShortVideoContext shortVideoContext = this.f161667a.f161575B;
            if (shortVideoContext != null) {
                shortVideoContext.f155768aB = true;
            }
            AbstractC72424b bVar = this.f161667a.f161589P;
            if (!(bVar == null || (f = bVar.mo114705f()) == null)) {
                f.performClick();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final AbstractC72051a mo114365a(MediaModel mediaModel) {
        AbstractC72051a aVar;
        C72208e eVar = this.f161647e;
        if (eVar != null && eVar.isVisible()) {
            aVar = this.f161647e;
        } else if (mediaModel.mo96674b()) {
            aVar = this.f161650h;
        } else {
            aVar = this.f161648f;
        }
        return aVar;
    }

    /* renamed from: e */
    public final Fragment mo114377e(int i) {
        if (i == this.f161577D) {
            return this.f161647e;
        }
        if (i == this.f161578E) {
            return this.f161650h;
        }
        if (i == this.f161579F) {
            return this.f161648f;
        }
        if (i == this.f161580G) {
            return this.f161627aj;
        }
        return null;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ao$ae */
    static final class C72090ae extends AbstractC89220m implements AbstractC89172b<PreviewSwapState, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C72084ao f161666a;

        static {
            Covode.recordClassIndex(84755);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72090ae(C72084ao aoVar) {
            super(1);
            this.f161666a = aoVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(PreviewSwapState previewSwapState) {
            AbstractC72424b bVar;
            PreviewSwapState previewSwapState2 = previewSwapState;
            C89219l.m154721d(previewSwapState2, "");
            if (!(previewSwapState2.getFrom() == null || previewSwapState2.getTo() == null || (bVar = this.f161666a.f161589P) == null)) {
                bVar.mo114701b(previewSwapState2.getFrom().intValue(), previewSwapState2.getTo().intValue());
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ao$ag */
    static final class C72092ag extends AbstractC89220m implements AbstractC89172b<MediaState, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C72084ao f161668a;

        static {
            Covode.recordClassIndex(84757);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72092ag(C72084ao aoVar) {
            super(1);
            this.f161668a = aoVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(MediaState mediaState) {
            MvImageChooseAdapter.AbstractC72048c cVar;
            MediaState mediaState2 = mediaState;
            C89219l.m154721d(mediaState2, "");
            ShortVideoContext shortVideoContext = this.f161668a.f161575B;
            if (shortVideoContext != null) {
                shortVideoContext.f155768aB = true;
            }
            C72208e eVar = this.f161668a.f161647e;
            if (!(eVar == null || (cVar = eVar.f161876r) == null)) {
                cVar.mo114288a((MediaModel) mediaState2.getMedia());
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ao$al */
    static final class C72097al<T> implements AbstractC88407af {

        /* renamed from: a */
        final /* synthetic */ AbstractC63269z f161674a;

        static {
            Covode.recordClassIndex(84762);
        }

        C72097al(AbstractC63269z zVar) {
            this.f161674a = zVar;
        }

        @Override // p4560f.p4561a.AbstractC88407af
        public final void subscribe(AbstractC88405ad<Boolean> adVar) {
            boolean z;
            C89219l.m154721d(adVar, "");
            String c = this.f161674a.mo93904c();
            C89219l.m154721d(c, "");
            if (!C72161b.f161770a) {
                z = false;
            } else {
                z = C72161b.m127332a().getBoolean(C69892bn.m123462a(c), true);
                C72161b.f161770a = z;
            }
            adVar.mo142931a(Boolean.valueOf(z));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ao$an */
    static final class C72100an<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC63269z f161677a;

        static {
            Covode.recordClassIndex(84765);
        }

        C72100an(AbstractC63269z zVar) {
            this.f161677a = zVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Boolean bool = (Boolean) obj;
            C89219l.m154716b(bool, "");
            if (bool.booleanValue()) {
                String c = this.f161677a.mo93904c();
                C89219l.m154721d(c, "");
                C72161b.m127332a().storeBoolean(C69892bn.m123462a(c), false);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ao$ap */
    static final class C72102ap implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C72084ao f161679a;

        static {
            Covode.recordClassIndex(84767);
        }

        C72102ap(C72084ao aoVar) {
            this.f161679a = aoVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C89219l.m154716b(valueAnimator, "");
            String.valueOf(valueAnimator.getAnimatedFraction());
            View view = this.f161679a.f52550n;
            if (view != null) {
                view.setTranslationY(this.f161679a.mo114356F() - (this.f161679a.mo114356F() * valueAnimator.getAnimatedFraction()));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ao$e */
    public static final class C72109e implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C72084ao f161689a;

        static {
            Covode.recordClassIndex(84774);
        }

        C72109e(C72084ao aoVar) {
            this.f161689a = aoVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C89219l.m154716b(valueAnimator, "");
            String.valueOf(valueAnimator.getAnimatedFraction());
            View view = this.f161689a.f52550n;
            if (view != null) {
                view.setTranslationY(this.f161689a.mo114356F() * valueAnimator.getAnimatedFraction());
            }
        }
    }

    /* renamed from: h */
    private final void m127230h(int i) {
        TextView textView = this.f161645c;
        if (textView != null) {
            textView.setTextSize(1, 17.0f);
        }
        String string = mo36486t().getResources().getString(R.string.f7d);
        C89219l.m154716b(string, "");
        TextView textView2 = this.f161645c;
        if (textView2 != null) {
            String a = C1764a.m5928a(string, Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
            C89219l.m154716b(a, "");
            textView2.setText(a);
        }
    }

    /* renamed from: a */
    public final int mo114364a(MvImageChooseAdapter.MyMediaModel myMediaModel) {
        C89219l.m154721d(myMediaModel, "");
        ViewPager viewPager = this.f161653k;
        if (viewPager == null) {
            return -1;
        }
        Fragment e = mo114377e(viewPager.getCurrentItem());
        Objects.requireNonNull(e, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AVMediaChooseBaseFragment");
        AbstractC72051a aVar = (AbstractC72051a) e;
        if (aVar != null) {
            return aVar.mo114337c(myMediaModel);
        }
        return -1;
    }

    /* renamed from: b */
    public final void mo114373b(List<String> list) {
        C72436d dVar = new C72436d();
        this.f161589P = dVar;
        if (!this.f161620ab || !this.f161613aN) {
            m127227c(list);
            return;
        }
        View c = mo36475c(R.id.cl0);
        C89219l.m154716b(c, "");
        dVar.mo114696a(c, this.f161639av);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ao$ab */
    static final class C72087ab extends AbstractC89220m implements AbstractC89172b<MediaState, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C72084ao f161663a;

        static {
            Covode.recordClassIndex(84752);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72087ab(C72084ao aoVar) {
            super(1);
            this.f161663a = aoVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(MediaState mediaState) {
            MediaState mediaState2 = mediaState;
            C89219l.m154721d(mediaState2, "");
            if (this.f161663a.f161588O) {
                MvImageChooseAdapter.MyMediaModel media = mediaState2.getMedia();
                if (media != null) {
                    AbstractC72051a a = this.f161663a.mo114365a((MediaModel) media);
                    if (a != null) {
                        a.mo114336b(mediaState2.getMedia());
                    }
                    this.f161663a.f161587N = media.f161471v - 1;
                }
            } else {
                ViewPager viewPager = this.f161663a.f161653k;
                if (viewPager != null) {
                    Fragment e = this.f161663a.mo114377e(viewPager.getCurrentItem());
                    Objects.requireNonNull(e, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AVMediaChooseBaseFragment");
                    AbstractC72051a aVar = (AbstractC72051a) e;
                    if (aVar != null) {
                        aVar.mo114336b(mediaState2.getMedia());
                    }
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ao$ac */
    static final class C72088ac extends AbstractC89220m implements AbstractC89172b<MediaState, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C72084ao f161664a;

        static {
            Covode.recordClassIndex(84753);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72088ac(C72084ao aoVar) {
            super(1);
            this.f161664a = aoVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(MediaState mediaState) {
            MediaState mediaState2 = mediaState;
            C89219l.m154721d(mediaState2, "");
            if (this.f161664a.f161588O) {
                MvImageChooseAdapter.MyMediaModel media = mediaState2.getMedia();
                if (media != null) {
                    AbstractC72051a a = this.f161664a.mo114365a((MediaModel) media);
                    if (a != null) {
                        a.mo114336b(mediaState2.getMedia());
                    }
                    this.f161664a.f161587N = media.f161471v - 1;
                }
            } else {
                ViewPager viewPager = this.f161664a.f161653k;
                if (viewPager != null) {
                    Fragment e = this.f161664a.mo114377e(viewPager.getCurrentItem());
                    Objects.requireNonNull(e, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AVMediaChooseBaseFragment");
                    AbstractC72051a aVar = (AbstractC72051a) e;
                    if (aVar != null) {
                        aVar.mo114336b(mediaState2.getMedia());
                    }
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ao$ad */
    static final class C72089ad extends AbstractC89220m implements AbstractC89172b<MediaState, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C72084ao f161665a;

        static {
            Covode.recordClassIndex(84754);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72089ad(C72084ao aoVar) {
            super(1);
            this.f161665a = aoVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(MediaState mediaState) {
            int i;
            int i2;
            MediaState mediaState2 = mediaState;
            C89219l.m154721d(mediaState2, "");
            if (this.f161665a.f161588O) {
                C72084ao aoVar = this.f161665a;
                MvImageChooseAdapter.MyMediaModel media = mediaState2.getMedia();
                if (media != null) {
                    i2 = media.f161471v - 1;
                } else {
                    i2 = 0;
                }
                aoVar.f161587N = i2;
                AbstractC72424b bVar = this.f161665a.f161589P;
                if (bVar != null) {
                    bVar.mo114694a(this.f161665a.f161587N);
                }
            } else {
                C72084ao aoVar2 = this.f161665a;
                MvImageChooseAdapter.MyMediaModel media2 = mediaState2.getMedia();
                if (media2 != null) {
                    i = this.f161665a.mo114364a(media2);
                } else {
                    i = -1;
                }
                aoVar2.f161586M = i;
                ViewPager viewPager = this.f161665a.f161653k;
                if (viewPager != null) {
                    Fragment e = this.f161665a.mo114377e(viewPager.getCurrentItem());
                    Objects.requireNonNull(e, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AVMediaChooseBaseFragment");
                    AbstractC72051a aVar = (AbstractC72051a) e;
                    if (aVar != null) {
                        aVar.mo114339c(this.f161665a.f161586M);
                    }
                }
            }
            this.f161665a.mo62771E().mo114413a(this.f161665a.f161575B, mediaState2);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ao$q */
    public static final class View$OnClickListenerC72135q implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C72084ao f161725a;

        static {
            Covode.recordClassIndex(84800);
        }

        View$OnClickListenerC72135q(C72084ao aoVar) {
            this.f161725a = aoVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C72060ae aeVar = this.f161725a.f161649g;
            if (aeVar != null) {
                C22228c.m41832b(this.f161725a).getSupportFragmentManager().mo3552a().mo3474c(aeVar).mo3476d();
                this.f161725a.mo114376d(!aeVar.f161525l);
            }
            ViewPager viewPager = this.f161725a.f161653k;
            if (viewPager != null) {
                Fragment e = this.f161725a.mo114377e(viewPager.getCurrentItem());
                Objects.requireNonNull(e, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AVMediaChooseBaseFragment");
                AbstractC72051a aVar = (AbstractC72051a) e;
                if (aVar != null) {
                    aVar.mo114343f();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ao$v */
    static final class View$OnClickListenerC72141v implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ImageView f161733a;

        /* renamed from: b */
        final /* synthetic */ C72084ao f161734b;

        static {
            Covode.recordClassIndex(84806);
        }

        View$OnClickListenerC72141v(ImageView imageView, C72084ao aoVar) {
            this.f161733a = imageView;
            this.f161734b = aoVar;
        }

        public final void onClick(View view) {
            int i;
            ClickAgent.onClick(view);
            C72084ao aoVar = this.f161734b;
            aoVar.f161590Q = !aoVar.f161590Q;
            ImageView imageView = this.f161733a;
            if (this.f161734b.f161590Q) {
                i = 2131232147;
            } else {
                i = 2131232146;
            }
            imageView.setImageResource(i);
            if (!this.f161734b.f161590Q) {
                AbstractC72424b bVar = this.f161734b.f161589P;
                if (bVar != null) {
                    bVar.mo114698a(false);
                }
            } else if (this.f161734b.f161589P == null) {
                C72084ao aoVar2 = this.f161734b;
                aoVar2.mo114373b(aoVar2.f161619aa);
            } else {
                AbstractC72424b bVar2 = this.f161734b.f161589P;
                if (bVar2 != null) {
                    bVar2.mo114698a(true);
                }
            }
            C72208e eVar = this.f161734b.f161647e;
            if (eVar != null) {
                eVar.mo114333a(this.f161734b.f161590Q);
            }
            C72223l lVar = this.f161734b.f161650h;
            if (lVar != null) {
                lVar.mo114333a(this.f161734b.f161590Q);
            }
            C72080al alVar = this.f161734b.f161648f;
            if (alVar != null) {
                alVar.mo114333a(this.f161734b.f161590Q);
            }
        }
    }

    /* renamed from: b */
    public static boolean m127226b(MediaModel mediaModel) {
        String h = C84896h.m145875h(mediaModel.f134662b);
        if (h == null || C89361p.m154876c(h, ".gif", true) || C89361p.m154876c(h, "/gif", true) || C89361p.m154876c(h, ".png", true) || C89361p.m154876c(h, "/png", true) || C89361p.m154876c(h, ".jpg", true) || C89361p.m154876c(h, "/jpg", true) || C89361p.m154876c(h, ".jpeg", true) || C89361p.m154876c(h, "/jpeg", true)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    private final int m127228f(int i) {
        Integer num;
        if (this.f161581H != 1) {
            ViewPager viewPager = this.f161653k;
            if (viewPager != null) {
                num = Integer.valueOf(viewPager.getCurrentItem());
            } else {
                num = null;
            }
            int i2 = this.f161578E;
            int i3 = 12;
            if (num != null && num.intValue() == i2) {
                if (this.f161632ao != 2) {
                    if (i == 1) {
                        i3 = 13;
                    } else {
                        i3 = 2;
                    }
                }
                this.f161581H = i3;
            } else {
                int i4 = this.f161579F;
                if (num != null && num.intValue() == i4) {
                    int i5 = this.f161644b;
                    int i6 = 15;
                    if (!(i5 == 10 || i5 == 12)) {
                        i6 = 3;
                    }
                    this.f161581H = i6;
                } else {
                    int i7 = this.f161580G;
                    if (num != null && num.intValue() == i7) {
                        this.f161581H = 17;
                    }
                }
            }
            if (this.f161581H == 3 && (i > 1 || (this.f161635ar & 1) == 0)) {
                this.f161581H = 11;
            }
        }
        return this.f161581H;
    }

    /* renamed from: d */
    public final void mo114376d(boolean z) {
        int i;
        float f;
        View view = this.f161624ag;
        if (view != null) {
            float[] fArr = new float[2];
            float f2 = 0.0f;
            if (z) {
                f = 0.0f;
            } else {
                f = 180.0f;
            }
            fArr[0] = f;
            if (z) {
                f2 = 180.0f;
            }
            fArr[1] = f2;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "rotation", fArr);
            C89219l.m154716b(ofFloat, "");
            ofFloat.setDuration(300L);
            ofFloat.start();
        }
        C72060ae aeVar = this.f161649g;
        if (aeVar != null) {
            aeVar.f161525l = z;
            int i2 = -1;
            if (z) {
                i = 0;
            } else {
                i = -1;
                i2 = 0;
            }
            int height = aeVar.f161519f.getHeight();
            ValueAnimator duration = ValueAnimator.ofFloat((float) i2, (float) i).setDuration(500L);
            duration.setInterpolator(new AccelerateDecelerateInterpolator());
            duration.addUpdateListener(new C72066aj(aeVar, height));
            duration.start();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ao$am */
    static final class C72098am<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ C72084ao f161675a;

        static {
            Covode.recordClassIndex(84763);
        }

        C72098am(C72084ao aoVar) {
            this.f161675a = aoVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            MethodCollector.m26663i(9795);
            Boolean bool = (Boolean) obj;
            C89219l.m154721d(bool, "");
            C70005cr a = C70005cr.m123611a();
            C89219l.m154716b(a, "");
            boolean z = true;
            if (a.f156494n.booleanValue() || !C65444e.m117163a() || C68065d.m120371a() <= 60000 || C68065d.m120371a() > 180000 || !bool.booleanValue()) {
                z = false;
            } else {
                ViewStub viewStub = this.f161675a.f161652j;
                if (!(viewStub == null || viewStub.getParent() == null || viewStub == null)) {
                    viewStub.inflate();
                }
                C72084ao aoVar = this.f161675a;
                aoVar.f161651i = (NoticeView) aoVar.mo36474b(R.id.ctx);
                NoticeView noticeView = this.f161675a.f161651i;
                if (noticeView != null) {
                    noticeView.setVisibility(0);
                }
                int a2 = (int) (C68065d.m120371a() / 60000);
                NoticeView noticeView2 = this.f161675a.f161651i;
                if (noticeView2 != null) {
                    String string = this.f161675a.mo36486t().getResources().getString(R.string.h3z, Integer.valueOf(a2));
                    C89219l.m154716b(string, "");
                    noticeView2.setTitleContent(string);
                }
                NoticeView noticeView3 = this.f161675a.f161651i;
                if (noticeView3 != null) {
                    noticeView3.setOnCloseClickListener(new AbstractC89171a<C89391z>(this) {
                        /* class com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C72084ao.C72098am.C720991 */

                        /* renamed from: a */
                        final /* synthetic */ C72098am f161676a;

                        static {
                            Covode.recordClassIndex(84764);
                        }

                        {
                            this.f161676a = r2;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        @Override // p4600h.p4611f.p4612a.AbstractC89171a
                        public final /* synthetic */ C89391z invoke() {
                            NoticeView noticeView = this.f161676a.f161675a.f161651i;
                            if (noticeView != null) {
                                noticeView.setVisibility(8);
                            }
                            return C89391z.f203057a;
                        }
                    });
                }
            }
            Boolean valueOf = Boolean.valueOf(z);
            MethodCollector.m26664o(9795);
            return valueOf;
        }
    }

    /* renamed from: c */
    private final void m127227c(List<String> list) {
        boolean z;
        C72435c cVar = new C72435c();
        if (list == null || !(!list.isEmpty())) {
            z = false;
        } else {
            z = true;
        }
        cVar.f162374d = z;
        cVar.f162373c = this.f161581H;
        cVar.f162375e = this.f161647e;
        cVar.f162377g = this.f161648f;
        cVar.f162376f = this.f161650h;
        cVar.f162378h = this.f161639av;
        cVar.f162379i = this.f161628ak;
        cVar.f162380j = this.f161629al;
        cVar.f162381k = this.f161654l;
        cVar.f162384n = this.f161593T;
        cVar.f162385o = this.f161617aR;
        if (!C84904k.m145909a(list)) {
            if (list == null) {
                C89219l.m154715b();
            }
            cVar.mo114711a(list);
        }
        if (this.f161594U != null && !C84904k.m145909a(null)) {
            if (this.f161594U == null) {
                C89219l.m154715b();
            }
            C89219l.m154715b();
            cVar.mo114710a();
        }
        ArrayList<CutSameVideoImageExtraData> arrayList = this.f161606aG;
        if (arrayList != null && (!arrayList.isEmpty())) {
            ArrayList<CutSameVideoImageExtraData> arrayList2 = cVar.f162383m;
            ArrayList<CutSameVideoImageExtraData> arrayList3 = this.f161606aG;
            if (arrayList3 == null) {
                C89219l.m154715b();
            }
            arrayList2.addAll(arrayList3);
        }
        cVar.f162372b = new C72138t(this);
        cVar.f162371a = new C72139u(this);
        AbstractC72424b bVar = this.f161589P;
        if (bVar != null) {
            bVar.mo114697a(cVar);
        }
        AbstractC72424b bVar2 = this.f161589P;
        if (bVar2 != null) {
            View c = mo36475c(R.id.cl0);
            C89219l.m154716b(c, "");
            bVar2.mo114695a(c);
        }
        this.f161608aI = true;
        this.f161636as = true;
        this.f161637at = true;
        C72080al alVar = this.f161648f;
        if (alVar != null) {
            alVar.f161564q = null;
        }
        ShortVideoContext shortVideoContext = this.f161575B;
        if (shortVideoContext != null) {
            C72448f.m127822a(shortVideoContext.f155830o, shortVideoContext.f155831p);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo114374b(boolean z) {
        String str;
        AbstractC63154aa.AbstractC63157c k;
        MusicModel musicModel = null;
        if (z) {
            ChooseMediaViewModel chooseMediaViewModel = this.f161593T;
            if (chooseMediaViewModel != null) {
                chooseMediaViewModel.mo114218a((MusicModel) null, (String) null);
            }
            AbstractC63154aa aaVar = (AbstractC63154aa) C63244g.m114602a().mo73291s();
            if (!(aaVar == null || (k = aaVar.mo101552k()) == null)) {
                musicModel = k.mo101569c();
            }
        } else {
            musicModel = this.f161603aD;
        }
        AbstractC63194at.AbstractC63195a a = C63253l.f143623a.mo73308d().mo101651a();
        ActivityC0945e b = C22228c.m41832b(this);
        C72107c cVar = new C72107c(this.f161575B, this.f161593T, this.f161644b);
        ShortVideoContext shortVideoContext = this.f161575B;
        if (shortVideoContext == null || (str = shortVideoContext.f155830o) == null) {
            str = "";
        }
        a.mo101655a(b, musicModel, cVar, str);
    }

    /* renamed from: a */
    public final void mo114369a(Class<? extends AbstractC22219j> cls) {
        C89219l.m154721d(cls, "");
        C22239d a = C22227b.m41825a(this);
        if (a != null) {
            Bundle bundle = new Bundle();
            C22154f.C22155a aVar = new C22154f.C22155a();
            aVar.f52386c = new C22121c();
            aVar.f52384a = true;
            a.mo36533a(cls, bundle, aVar.mo36338b());
        }
    }

    /* renamed from: c */
    public final void mo114375c(boolean z) {
        int i;
        Parcelable parcelable;
        Parcelable parcelable2;
        Bundle a;
        C72080al alVar;
        int i2;
        AbstractC72424b bVar;
        ArrayList<String> arrayList;
        List<MvImageChooseAdapter.MyMediaModel> a2;
        if (this.f161623ae != -1) {
            C39162r.m79460a("gif_stay_time", new C84425b().mo129403a("duration", (int) (System.currentTimeMillis() - this.f161623ae)).mo129406a("enter_from", "video_shoot_page").f188764a);
            this.f161623ae = -1;
        }
        int i3 = 0;
        if (z) {
            int f = m127228f(this.f161660y.size());
            AbstractC72424b bVar2 = this.f161589P;
            if (bVar2 != null) {
                if (mo114361K()) {
                    f = bVar2.mo114691a(this.f161581H, this.f161644b);
                } else if (C72440e.m127814a(this.f161644b)) {
                    f = bVar2.mo114691a(this.f161581H, this.f161644b);
                }
            }
            Parcelable parcelable3 = null;
            String str = "";
            if (C46916ew.m90218c() && (((bVar = this.f161589P) == null || (a2 = bVar.mo114693a()) == null || a2.isEmpty()) && this.f161660y.size() == 1)) {
                MediaModel mediaModel = this.f161660y.get(0);
                C89219l.m154716b(mediaModel, str);
                if (mediaModel.mo96674b() && ((arrayList = this.f161619aa) == null || arrayList.isEmpty())) {
                    f = 13;
                }
            }
            int i4 = 3;
            if (f != 1 || this.f161592S == null) {
                int i5 = this.f161644b;
                int i6 = 7;
                if (i5 == 3) {
                    i2 = 7;
                } else {
                    i2 = f;
                    if (i5 == 12) {
                        if (this.f161632ao == 10004) {
                            i6 = 17;
                        }
                        i2 = i6;
                    } else if (i5 == 4) {
                        i2 = 8;
                    } else if (i5 == 10) {
                        i2 = 15;
                    } else if (i5 == 11) {
                        i2 = 16;
                    }
                }
                AbstractC72263v a3 = MediaChosenResultProcessFactory.m123154a().mo109976a(C22228c.m41832b(this), i2, this.f161641ax, this.f161642ay);
                C89219l.m154716b(a3, str);
                this.f161592S = a3;
            }
            Intent intent = new Intent();
            if (f == 2 && this.f161660y.size() > 1) {
                Iterator<MediaModel> it = this.f161660y.iterator();
                boolean z2 = false;
                boolean z3 = false;
                while (true) {
                    if (it.hasNext()) {
                        MediaModel next = it.next();
                        C89219l.m154716b(next, str);
                        if (!next.mo96674b()) {
                            if (!z2) {
                                z2 = true;
                            }
                            if (!z3) {
                                continue;
                            }
                        } else if (!z3) {
                            z3 = true;
                        }
                        if (z2) {
                            break;
                        }
                    } else if (z3) {
                        if (!z2) {
                            i4 = 1;
                        }
                    } else if (!z2) {
                        i4 = 0;
                    }
                }
                i4 = 2;
                intent.putExtra("extra_stick_point_type", i4);
            }
            mo114359I();
            C72208e eVar = this.f161647e;
            if ((eVar == null || (i = eVar.mo114334b()) == 0) && ((alVar = this.f161648f) == null || (i = alVar.mo114334b()) == 0)) {
                C72223l lVar = this.f161650h;
                if (lVar != null) {
                    i3 = lVar.mo114334b();
                }
                i = i3;
            }
            intent.putExtra("key_choose_media_item_size", i);
            intent.putExtra("key_choose_media_data", this.f161660y);
            intent.putExtra("key_select_mv_data", this.f161634aq);
            intent.putExtra("extra_start_enter_edit_page", System.currentTimeMillis());
            intent.putExtra("key_choose_scene", this.f161644b);
            String str2 = this.f161595V;
            if (str2 == null) {
                str2 = str;
            }
            intent.putExtra("shoot_way", str2);
            String str3 = this.f161596W;
            if (str3 == null) {
                str3 = str;
            }
            intent.putExtra("content_source", str3);
            String str4 = this.f161597X;
            if (str4 == null) {
                str4 = str;
            }
            intent.putExtra("content_type", str4);
            String str5 = this.f161598Y;
            if (str5 != null) {
                str = str5;
            }
            intent.putExtra("creation_id", str);
            ShortVideoContext shortVideoContext = this.f161575B;
            if (shortVideoContext != null) {
                intent.putExtra("key_short_video_context", shortVideoContext);
            }
            AbstractC72262u uVar = this.f161643az;
            if (!(uVar == null || (a = uVar.mo114484a()) == null)) {
                intent.putExtra("key_extra_info", a);
            }
            Bundle bundle = this.f52554r;
            if (bundle != null && bundle.containsKey("key_custom_effect_sticker")) {
                Bundle bundle2 = this.f52554r;
                if (bundle2 != null) {
                    parcelable2 = bundle2.getParcelable("key_custom_effect_sticker");
                } else {
                    parcelable2 = null;
                }
                if (!(parcelable2 instanceof Parcelable)) {
                    parcelable2 = null;
                }
                intent.putExtra("key_custom_effect_sticker", parcelable2);
            }
            if (mo114360J()) {
                Bundle bundle3 = this.f52554r;
                if (bundle3 != null) {
                    parcelable = bundle3.getParcelable("key_story_edit_context");
                } else {
                    parcelable = null;
                }
                if (parcelable instanceof Parcelable) {
                    parcelable3 = parcelable;
                }
                intent.putExtra("key_story_edit_context", parcelable3);
            }
            AbstractC72263v vVar = this.f161592S;
            if (vVar != null) {
                vVar.mo114428a(this.f161632ao, intent);
            }
            mo62771E().mo114412a(this.f161602aC, this.f161601aB);
            return;
        }
        AbstractC72263v vVar2 = this.f161592S;
        if (vVar2 != null) {
            vVar2.mo114427a();
        }
        mo114358H();
        if (!this.f161613aN) {
            mo36486t().overridePendingTransition(0, R.anim.x);
        }
    }

    /* renamed from: a */
    public final void mo114370a(List<? extends MvImageChooseAdapter.MyMediaModel> list) {
        TextView textView;
        if (mo114361K() || C72440e.m127814a(this.f161644b) || C84904k.m145909a(list)) {
            TextView textView2 = this.f161645c;
            if (textView2 != null) {
                textView2.setVisibility(8);
                return;
            }
            return;
        }
        if (list != null) {
            Integer num = null;
            if (!list.isEmpty()) {
                int size = list.size();
                TextView textView3 = this.f161645c;
                if (textView3 != null) {
                    textView3.setVisibility(0);
                }
                m127230h(size);
                ViewPager viewPager = this.f161653k;
                if (viewPager != null) {
                    num = Integer.valueOf(viewPager.getCurrentItem());
                }
                int i = this.f161628ak;
                int i2 = this.f161578E;
                if (num != null && num.intValue() == i2) {
                    i = this.f161629al;
                }
                if (size < i) {
                    TextView textView4 = this.f161645c;
                    if (textView4 != null) {
                        textView4.setTextColor(C0643b.m2378c(textView4.getContext(), R.color.oa));
                    }
                    TextView textView5 = this.f161645c;
                    if (textView5 != null) {
                        textView5.setClickable(false);
                    }
                } else {
                    TextView textView6 = this.f161645c;
                    if (textView6 != null) {
                        textView6.setTextColor(C0643b.m2378c(textView6.getContext(), R.color.bh));
                    }
                    TextView textView7 = this.f161645c;
                    if (textView7 != null) {
                        textView7.setClickable(true);
                    }
                }
                this.f161660y.clear();
                this.f161660y.addAll(list);
                if (C72440e.m127814a(this.f161644b) && (textView = this.f161645c) != null) {
                    textView.setVisibility(8);
                    return;
                }
                return;
            }
        }
        TextView textView8 = this.f161645c;
        if (textView8 != null) {
            textView8.setVisibility(8);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ao$p */
    public static final class C72134p {

        /* renamed from: a */
        final /* synthetic */ C72084ao f161723a;

        /* renamed from: b */
        final /* synthetic */ Bundle f161724b;

        static {
            Covode.recordClassIndex(84799);
        }

        C72134p(C72084ao aoVar, Bundle bundle) {
            this.f161723a = aoVar;
            this.f161724b = bundle;
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j, com.bytedance.scene.group.AbstractC22186b
    /* renamed from: a */
    public final /* synthetic */ View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return mo22702a(layoutInflater, viewGroup);
    }

    /* renamed from: a */
    public final void mo114367a(MvImageChooseAdapter.EnumC72047b bVar, String str) {
        mo62771E().mo114415a(this.f161575B, bVar, str);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ao$c */
    public static final class C72107c implements IServiceMusicResDownListener {

        /* renamed from: a */
        private final ShortVideoContext f161684a;

        /* renamed from: b */
        private final ChooseMediaViewModel f161685b;

        /* renamed from: c */
        private final int f161686c;

        static {
            Covode.recordClassIndex(84772);
        }

        @Override // com.p2082ss.android.ugc.aweme.services.upload.IServiceMusicResDownListener
        public final void onFailed() {
        }

        @Override // com.p2082ss.android.ugc.aweme.services.upload.IServiceMusicResDownListener
        public final void onSuccess(MusicModel musicModel, String str) {
            ShortVideoContext shortVideoContext;
            Workspace workspace;
            C89219l.m154721d(musicModel, "");
            C89219l.m154721d(str, "");
            ChooseMediaViewModel chooseMediaViewModel = this.f161685b;
            if (chooseMediaViewModel != null) {
                chooseMediaViewModel.mo114224a(true);
            }
            ChooseMediaViewModel chooseMediaViewModel2 = this.f161685b;
            if (chooseMediaViewModel2 != null) {
                chooseMediaViewModel2.mo114218a(musicModel, str);
            }
            ChooseMediaViewModel chooseMediaViewModel3 = this.f161685b;
            if (chooseMediaViewModel3 != null) {
                chooseMediaViewModel3.mo114225b(musicModel, str);
            }
            if (this.f161686c == 9 && (shortVideoContext = this.f161684a) != null && (workspace = shortVideoContext.f155817b.f155652h) != null) {
                workspace.mo110090a(str);
            }
        }

        public C72107c(ShortVideoContext shortVideoContext, ChooseMediaViewModel chooseMediaViewModel, int i) {
            this.f161684a = shortVideoContext;
            this.f161685b = chooseMediaViewModel;
            this.f161686c = i;
        }
    }

    @Override // com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84917a
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return false;
        }
        this.f161614aO = true;
        AbstractC72263v vVar = this.f161592S;
        if (vVar != null) {
            vVar.mo114427a();
        }
        AbstractC22219j jVar = null;
        if (this.f161613aN) {
            C22239d a = C22227b.m41825a(this);
            if (!(a == null || a.f52597c == null)) {
                jVar = a.f52597c.mo36548b();
            }
            if (C89219l.m154714a(jVar, this)) {
                m127224P();
                return true;
            }
        }
        C22239d a2 = C22227b.m41825a(this);
        if (a2 == null || !a2.mo36524E()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.scene.group.AbstractC22186b
    /* renamed from: b */
    public final ViewGroup mo36393b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        C73975b.C73976a.f166071a.enter(mo36485s(), "album");
        VideoRecordNewActivity videoRecordNewActivity = null;
        if (this.f161621ac == null) {
            Activity t = mo36486t();
            if (!(t instanceof AbstractC84919c)) {
                t = null;
            }
            this.f161621ac = (AbstractC84919c) t;
        }
        AbstractC84919c cVar = this.f161621ac;
        if (cVar != null) {
            cVar.mo87532a((AbstractC84918b) this);
            cVar.mo87533b((AbstractC84917a) this);
        }
        Activity t2 = mo36486t();
        if (t2 instanceof VideoRecordNewActivity) {
            videoRecordNewActivity = t2;
        }
        VideoRecordNewActivity videoRecordNewActivity2 = videoRecordNewActivity;
        if (videoRecordNewActivity2 != null) {
            videoRecordNewActivity2.f164827v = this;
        }
        View a = C1764a.m5927a(layoutInflater, R.layout.at3, viewGroup, false);
        Objects.requireNonNull(a, "null cannot be cast to non-null type android.view.ViewGroup");
        return (ViewGroup) a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:362:0x083b, code lost:
        if (r15 != 6) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x083f, code lost:
        r14 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0068, code lost:
        if (r15 != 6) goto L_0x006a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x0591  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x059d  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x05ac  */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x05bf  */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x05d5  */
    /* JADX WARNING: Removed duplicated region for block: B:321:0x072f  */
    /* JADX WARNING: Removed duplicated region for block: B:366:0x084f  */
    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo36473a(android.view.View r17, android.os.Bundle r18) {
        /*
        // Method dump skipped, instructions count: 2153
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C72084ao.mo36473a(android.view.View, android.os.Bundle):void");
    }

    /* renamed from: a */
    public final void mo114366a(int i, boolean z, List<? extends MvImageChooseAdapter.MyMediaModel> list) {
        CharSequence charSequence;
        String valueOf;
        int i2;
        int i3;
        boolean z2;
        if (i != this.f161638au) {
            if (i != this.f161580G && !this.f161615aP) {
                this.f161615aP = m127225Q();
            }
            if (i != this.f161580G && !this.f161616aQ) {
                m127223O();
            }
            View view = this.f161625ah;
            int i4 = 0;
            if (view != null) {
                if (i == this.f161580G) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                view.setClickable(z2);
            }
            View view2 = this.f161624ag;
            if (view2 != null) {
                if (i == this.f161580G) {
                    i3 = 8;
                } else {
                    i3 = 0;
                }
                view2.setVisibility(i3);
            }
            TextView textView = this.f161645c;
            if (textView != null) {
                if (!z) {
                    i4 = 8;
                }
                textView.setVisibility(i4);
            }
            if (z) {
                mo114370a(list);
            }
            if (this.f161638au == this.f161580G) {
                valueOf = this.f161640aw;
                if (valueOf == null) {
                    C89219l.m154710a("lastPhotoTitleText");
                }
            } else {
                TextView textView2 = this.f161646d;
                if (textView2 != null) {
                    charSequence = textView2.getText();
                } else {
                    charSequence = null;
                }
                valueOf = String.valueOf(charSequence);
            }
            this.f161640aw = valueOf;
            TextView textView3 = this.f161646d;
            if (textView3 != null) {
                if (i == this.f161580G) {
                    valueOf = mo36486t().getResources().getString(R.string.c43);
                } else if (valueOf == null) {
                    C89219l.m154710a("lastPhotoTitleText");
                }
                textView3.setText(valueOf);
            }
            int i5 = this.f161644b;
            if (i5 == 12 || i5 == 3) {
                if (i == this.f161580G) {
                    i2 = 10004;
                } else {
                    i2 = 10001;
                }
                this.f161632ao = i2;
            }
            this.f161638au = i;
        }
    }

    /* renamed from: a */
    public final void mo114368a(AbstractC89171a<? extends View> aVar, AbstractC89171a<? extends MvImageChooseAdapter.MyMediaModel> aVar2, AbstractC89171a<Integer> aVar3, AbstractC89171a<Boolean> aVar4) {
        AbstractC72424b bVar;
        ArrayList<MvImageChooseAdapter.MyMediaModel> e;
        ChooseMediaViewModel chooseMediaViewModel;
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar2, "");
        C89219l.m154721d(aVar3, "");
        C89219l.m154721d(aVar4, "");
        if (!(!C46916ew.m90217b() || (bVar = this.f161589P) == null || (e = bVar.mo114704e()) == null || (chooseMediaViewModel = this.f161593T) == null)) {
            chooseMediaViewModel.mo114223a(e);
        }
        C72377f.f162257t = new C72111g(this, aVar2, aVar3, aVar4);
        mo114369a(C72377f.class);
        ViewPager viewPager = this.f161653k;
        if (viewPager != null) {
            Fragment e2 = mo114377e(viewPager.getCurrentItem());
            Objects.requireNonNull(e2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AVMediaChooseBaseFragment");
            AbstractC72051a aVar5 = (AbstractC72051a) e2;
            if (aVar5 != null) {
                aVar5.mo114343f();
            }
        }
        mo62771E().mo114414a(this.f161575B, (MvImageChooseAdapter.MyMediaModel) aVar2.invoke());
    }
}
