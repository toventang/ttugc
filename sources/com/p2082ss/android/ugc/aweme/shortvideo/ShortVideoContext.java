package com.p2082ss.android.ugc.aweme.shortvideo;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.p2082ss.android.ugc.aweme.common.C39053a;
import com.p2082ss.android.ugc.aweme.common.C39078ad;
import com.p2082ss.android.ugc.aweme.draft.model.DraftEditTransferModel;
import com.p2082ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p2082ss.android.ugc.aweme.p2690cr.p2704g.C40383b;
import com.p2082ss.android.ugc.aweme.photomovie.PhotoMvConfig;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.sharedar.SharedARModel;
import com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C71518t;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.LoudnessBalanceParam;
import com.p2082ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.p2082ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct;
import com.p2082ss.android.ugc.aweme.shortvideo.model.BeautyMobParam;
import com.p2082ss.android.ugc.aweme.shortvideo.model.CreativeFlowData;
import com.p2082ss.android.ugc.aweme.shortvideo.model.ExtraMentionUserModel;
import com.p2082ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.p2082ss.android.ugc.aweme.shortvideo.model.GameDuetResource;
import com.p2082ss.android.ugc.aweme.shortvideo.model.GreenScreenMaterial;
import com.p2082ss.android.ugc.aweme.shortvideo.model.RecordPresetResource;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.TimeSpeedModelExtension;
import com.p2082ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.p2082ss.android.ugc.aweme.shoutouts.C74418d;
import com.p2082ss.android.ugc.aweme.sticker.data.QaStruct;
import com.p2082ss.android.ugc.aweme.sticker.model.C75439a;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import dmt.p4542av.video.SingleImageCoverBitmapData;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ShortVideoContext */
public class ShortVideoContext implements Parcelable {
    public static final Parcelable.Creator<ShortVideoContext> CREATOR = new Parcelable.Creator<ShortVideoContext>() {
        /* class com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext.C697371 */

        static {
            Covode.recordClassIndex(82134);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ShortVideoContext[] newArray(int i) {
            return new ShortVideoContext[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ShortVideoContext createFromParcel(Parcel parcel) {
            return new ShortVideoContext(parcel, (byte) 0);
        }
    };

    /* renamed from: A */
    public int f155740A;

    /* renamed from: B */
    public String f155741B;

    /* renamed from: C */
    public AVETParameter f155742C;

    /* renamed from: D */
    public StitchContext f155743D;

    /* renamed from: E */
    public boolean f155744E;

    /* renamed from: F */
    public String f155745F;

    /* renamed from: G */
    public String f155746G;

    /* renamed from: H */
    public boolean f155747H;

    /* renamed from: I */
    public List<AVTextExtraStruct> f155748I;

    /* renamed from: J */
    public int f155749J;

    /* renamed from: K */
    public List<User> f155750K;

    /* renamed from: L */
    public int f155751L;

    /* renamed from: M */
    public boolean f155752M;

    /* renamed from: N */
    public boolean f155753N;

    /* renamed from: O */
    public boolean f155754O;

    /* renamed from: P */
    public boolean f155755P;

    /* renamed from: Q */
    public SharedARModel f155756Q;

    /* renamed from: R */
    public String f155757R;

    /* renamed from: S */
    public boolean f155758S;

    /* renamed from: T */
    public RecordPresetResource f155759T;

    /* renamed from: U */
    public Boolean f155760U;

    /* renamed from: V */
    public String f155761V;

    /* renamed from: W */
    public String f155762W;

    /* renamed from: X */
    public int f155763X;

    /* renamed from: Y */
    public int f155764Y;

    /* renamed from: Z */
    public C74418d f155765Z;

    /* renamed from: a */
    public CreativeFlowData f155766a;

    /* renamed from: aA */
    public ArrayList<String> f155767aA;

    /* renamed from: aB */
    public boolean f155768aB;

    /* renamed from: aC */
    public String f155769aC;

    /* renamed from: aD */
    public String f155770aD;

    /* renamed from: aE */
    public String f155771aE;

    /* renamed from: aF */
    public int f155772aF;

    /* renamed from: aG */
    public long f155773aG;

    /* renamed from: aH */
    public int f155774aH;

    /* renamed from: aI */
    public long f155775aI;

    /* renamed from: aJ */
    public User f155776aJ;

    /* renamed from: aK */
    public User f155777aK;

    /* renamed from: aL */
    public boolean f155778aL;

    /* renamed from: aM */
    public float f155779aM;

    /* renamed from: aN */
    public boolean f155780aN;

    /* renamed from: aO */
    public boolean f155781aO;

    /* renamed from: aP */
    public String f155782aP;

    /* renamed from: aQ */
    public PhotoMvConfig f155783aQ;

    /* renamed from: aR */
    public int f155784aR;

    /* renamed from: aS */
    public int f155785aS;

    /* renamed from: aT */
    public SingleImageCoverBitmapData f155786aT;

    /* renamed from: aU */
    public C39053a f155787aU;

    /* renamed from: aV */
    public String f155788aV;

    /* renamed from: aW */
    public String f155789aW;

    /* renamed from: aX */
    public BeautyMobParam f155790aX;

    /* renamed from: aa */
    public boolean f155791aa;

    /* renamed from: ab */
    public boolean f155792ab;

    /* renamed from: ac */
    public int f155793ac;

    /* renamed from: ad */
    public ExtraSession f155794ad;

    /* renamed from: ae */
    public String f155795ae;

    /* renamed from: af */
    public C71518t f155796af;

    /* renamed from: ag */
    public boolean f155797ag;

    /* renamed from: ah */
    public boolean f155798ah;

    /* renamed from: ai */
    public boolean f155799ai;

    /* renamed from: aj */
    public boolean f155800aj;

    /* renamed from: ak */
    public String f155801ak;

    /* renamed from: al */
    public ExtraMentionUserModel f155802al;

    /* renamed from: am */
    public UrlModel f155803am;

    /* renamed from: an */
    public int f155804an;

    /* renamed from: ao */
    public ArrayList<String> f155805ao;

    /* renamed from: ap */
    public int f155806ap;

    /* renamed from: aq */
    public LoudnessBalanceParam f155807aq;

    /* renamed from: ar */
    public ArrayList<String> f155808ar;

    /* renamed from: as */
    public C71872i f155809as;

    /* renamed from: at */
    public DraftEditTransferModel f155810at;

    /* renamed from: au */
    public C70625d f155811au;

    /* renamed from: av */
    public ArrayList<Integer> f155812av;

    /* renamed from: aw */
    public String f155813aw;

    /* renamed from: ax */
    public int f155814ax;

    /* renamed from: ay */
    public float f155815ay;

    /* renamed from: az */
    public int f155816az;

    /* renamed from: b */
    public final CameraComponentModel f155817b;

    /* renamed from: c */
    public int f155818c;

    /* renamed from: d */
    public UrlModel f155819d;

    /* renamed from: e */
    public String f155820e;

    /* renamed from: f */
    public String f155821f;

    /* renamed from: g */
    public int f155822g;

    /* renamed from: h */
    public String f155823h;

    /* renamed from: i */
    public UrlModel f155824i;

    /* renamed from: j */
    public CommentVideoModel f155825j;

    /* renamed from: k */
    public QaStruct f155826k;

    /* renamed from: l */
    public Effect f155827l;

    /* renamed from: m */
    public String f155828m;

    /* renamed from: n */
    public String f155829n;

    /* renamed from: o */
    public String f155830o;

    /* renamed from: p */
    public String f155831p;

    /* renamed from: q */
    public boolean f155832q;

    /* renamed from: r */
    public String f155833r;

    /* renamed from: s */
    public String f155834s;

    /* renamed from: t */
    public String f155835t;

    /* renamed from: u */
    public GreenScreenMaterial f155836u;

    /* renamed from: v */
    public String f155837v;

    /* renamed from: w */
    public String f155838w;

    /* renamed from: x */
    public String f155839x;

    /* renamed from: y */
    public C39078ad f155840y;

    /* renamed from: z */
    public String f155841z;

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public final boolean mo110014a() {
        return this.f155791aa && !this.f155792ab;
    }

    /* renamed from: a */
    public final void mo110013a(boolean z) {
        if (!z) {
            this.f155756Q = null;
        } else if (this.f155756Q == null) {
            this.f155756Q = new SharedARModel();
        }
    }

    /* renamed from: a */
    public final void mo110009a(StitchParams stitchParams) {
        if (stitchParams != null && stitchParams.getVideoSegment() != null && stitchParams.getVideoSegment().getVideoFileInfo() != null) {
            this.f155743D.f155846a = stitchParams;
            mo110021c(this.f155743D.f155846a.isMuted());
            this.f155743D.f155847b = new TimeSpeedModelExtension();
            this.f155743D.f155847b.setDuration((int) stitchParams.getVideoSegment().getVideoFileInfo().getDuration());
        }
    }

    /* renamed from: a */
    public final void mo110010a(C75439a aVar) {
        this.f155817b.f155662r = aVar;
    }

    /* renamed from: a */
    public final void mo110008a(GameDuetResource gameDuetResource) {
        this.f155817b.f155666v = gameDuetResource;
    }

    /* renamed from: a */
    public final void mo110011a(String str) {
        this.f155817b.f155669y = str;
    }

    /* renamed from: a */
    public final void mo110012a(Map<String, Object> map) {
        this.f155817b.f155640E = map;
    }

    /* renamed from: i */
    public final boolean mo110033i() {
        if (this.f155765Z != null) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public final boolean mo110036l() {
        return this.f155817b.mo109897i();
    }

    /* renamed from: m */
    public final void mo110037m() {
        this.f155817b.f155654j = 0;
    }

    /* renamed from: n */
    public final RetakeVideoContext mo110038n() {
        return (RetakeVideoContext) this.f155817b.f155668x;
    }

    /* renamed from: s */
    public final int mo110043s() {
        int i = this.f155764Y;
        if (i == -1) {
            return this.f155763X;
        }
        return i;
    }

    static {
        Covode.recordClassIndex(82133);
    }

    /* renamed from: j */
    public final AVETParameter mo110034j() {
        if (this.f155742C == null) {
            this.f155742C = new AVETParameter();
        }
        return this.f155742C;
    }

    /* renamed from: k */
    public final void mo110035k() {
        this.f155743D.f155846a = null;
        this.f155743D.f155847b = null;
    }

    /* renamed from: e */
    public final boolean mo110029e() {
        return TextUtils.equals(this.f155831p, "upload_anchor");
    }

    /* renamed from: h */
    public final boolean mo110032h() {
        if (this.f155743D.f155846a == null) {
            return false;
        }
        if (!this.f155743D.f155846a.isPGCMusic() || this.f155743D.f155846a.getMusic() == null) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public final boolean mo110039o() {
        if ("comment_reply".equals(this.f155831p) || "question_and_answer".equals(this.f155831p)) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public final boolean mo110040p() {
        if (this.f155817b.f155645a == 2 || this.f155817b.f155645a == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public final boolean mo110041q() {
        if (this.f155817b.f155645a == 2 || this.f155806ap == 50) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo110018b() {
        if (this.f155756Q != null) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo110022c() {
        if (this.f155743D.f155846a != null) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo110025d() {
        if (this.f155743D.f155846a != null && this.f155743D.f155846a.getMusic() != null && this.f155743D.f155846a.isPGCMusic() && this.f155743D.f155846a.getMusicStart() >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final int mo110030f() {
        int i = 0;
        for (int i2 = 0; i2 < this.f155817b.f155650f.size(); i2++) {
            if (((TimeSpeedModelExtension) this.f155817b.f155650f.get(i2)).getStickerInfo().isOriginalSticker()) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: r */
    public final String mo110042r() {
        int i = this.f155763X;
        if (i != 2) {
            if (i == 10) {
                return "video_15";
            }
            if (i == 11) {
                return "video_60";
            }
            if (i == 14) {
                return "video_180";
            }
            if (i != 15) {
                return "";
            }
            return "fast_shoot";
        } else if (AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getStoryService().mo93871e()) {
            return "fast_shoot";
        } else {
            return UGCMonitor.TYPE_PHOTO;
        }
    }

    /* renamed from: g */
    public final String mo110031g() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.f155817b.f155650f.size(); i++) {
            if (!TextUtils.isEmpty(((TimeSpeedModelExtension) this.f155817b.f155650f.get(i)).getOriginalId())) {
                sb.append(((TimeSpeedModelExtension) this.f155817b.f155650f.get(i)).getOriginalId() + ",");
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static String m123166a(ArrayList<TimeSpeedModelExtension> arrayList) {
        return C70651du.m124878a(arrayList);
    }

    /* renamed from: b */
    public final void mo110015b(int i) {
        this.f155817b.f155648d = i;
    }

    /* renamed from: c */
    public final void mo110019c(int i) {
        this.f155817b.f155649e = i;
    }

    /* renamed from: d */
    public final void mo110023d(int i) {
        this.f155817b.f155661q = i;
    }

    /* renamed from: e */
    public final void mo110027e(int i) {
        this.f155817b.f155665u = i;
    }

    /* renamed from: a */
    public final void mo110000a(int i) {
        this.f155817b.f155647c = i;
    }

    /* renamed from: b */
    public final void mo110016b(long j) {
        this.f155817b.f155651g = j;
    }

    /* renamed from: c */
    public final void mo110020c(long j) {
        this.f155817b.f155655k = j;
    }

    /* renamed from: d */
    public final void mo110024d(boolean z) {
        this.f155817b.f155664t = z;
    }

    /* renamed from: e */
    public final void mo110028e(boolean z) {
        this.f155817b.f155637B = z;
    }

    /* renamed from: a */
    public final void mo110001a(long j) {
        this.f155817b.f155646b = j;
    }

    /* renamed from: b */
    public final void mo110017b(boolean z) {
        this.f155817b.f155653i = z;
    }

    /* renamed from: c */
    public final void mo110021c(boolean z) {
        this.f155817b.f155656l = z;
    }

    /* renamed from: a */
    public final void mo110002a(ClientCherEffectParam clientCherEffectParam) {
        this.f155817b.f155658n = clientCherEffectParam;
    }

    /* renamed from: a */
    public final void mo110003a(RecordContext recordContext) {
        this.f155817b.f155642G = recordContext;
    }

    public ShortVideoContext(CameraComponentModel cameraComponentModel) {
        this.f155766a = new CreativeFlowData();
        this.f155818c = -1;
        this.f155832q = false;
        this.f155841z = "";
        this.f155741B = "";
        this.f155743D = new StitchContext((byte) 0);
        this.f155747H = false;
        this.f155749J = C40383b.m81651a();
        this.f155754O = false;
        this.f155760U = false;
        this.f155764Y = -1;
        this.f155791aa = false;
        this.f155792ab = false;
        this.f155794ad = new ExtraSession((byte) 0);
        this.f155795ae = "";
        this.f155804an = 0;
        this.f155805ao = new ArrayList<>();
        this.f155806ap = 0;
        this.f155807aq = new LoudnessBalanceParam();
        this.f155808ar = new ArrayList<>();
        this.f155809as = new C71872i();
        this.f155811au = null;
        this.f155812av = new ArrayList<>();
        this.f155814ax = 0;
        this.f155815ay = -1.0f;
        this.f155816az = 0;
        this.f155767aA = new ArrayList<>();
        this.f155768aB = false;
        this.f155771aE = "";
        this.f155772aF = 0;
        this.f155778aL = false;
        this.f155780aN = false;
        this.f155781aO = false;
        this.f155782aP = "";
        this.f155817b = cameraComponentModel;
    }

    /* renamed from: a */
    public final void mo110004a(RetakeVideoContext retakeVideoContext) {
        this.f155817b.f155668x = retakeVideoContext;
    }

    /* renamed from: a */
    public final void mo110005a(Workspace workspace) {
        this.f155817b.f155652h = workspace;
    }

    private ShortVideoContext(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        this.f155766a = new CreativeFlowData();
        this.f155818c = -1;
        boolean z10 = false;
        this.f155832q = false;
        this.f155841z = "";
        this.f155741B = "";
        this.f155743D = new StitchContext((byte) 0);
        this.f155747H = false;
        this.f155749J = C40383b.m81651a();
        this.f155754O = false;
        this.f155760U = false;
        this.f155764Y = -1;
        this.f155791aa = false;
        this.f155792ab = false;
        this.f155794ad = new ExtraSession((byte) 0);
        this.f155795ae = "";
        this.f155804an = 0;
        this.f155805ao = new ArrayList<>();
        this.f155806ap = 0;
        this.f155807aq = new LoudnessBalanceParam();
        this.f155808ar = new ArrayList<>();
        this.f155809as = new C71872i();
        this.f155811au = null;
        this.f155812av = new ArrayList<>();
        this.f155814ax = 0;
        this.f155815ay = -1.0f;
        this.f155816az = 0;
        this.f155767aA = new ArrayList<>();
        this.f155768aB = false;
        this.f155771aE = "";
        this.f155772aF = 0;
        this.f155778aL = false;
        this.f155780aN = false;
        this.f155781aO = false;
        this.f155782aP = "";
        this.f155775aI = parcel.readLong();
        this.f155817b = (CameraComponentModel) parcel.readParcelable(CameraComponentModel.class.getClassLoader());
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f155791aa = z;
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f155792ab = z2;
        this.f155819d = (UrlModel) parcel.readSerializable();
        this.f155822g = parcel.readInt();
        this.f155823h = parcel.readString();
        this.f155830o = parcel.readString();
        this.f155831p = parcel.readString();
        this.f155833r = parcel.readString();
        this.f155834s = parcel.readString();
        this.f155835t = parcel.readString();
        this.f155836u = (GreenScreenMaterial) parcel.readSerializable();
        this.f155825j = (CommentVideoModel) parcel.readSerializable();
        this.f155740A = parcel.readInt();
        this.f155741B = parcel.readString();
        this.f155757R = parcel.readString();
        this.f155761V = parcel.readString();
        this.f155762W = parcel.readString();
        this.f155763X = parcel.readInt();
        this.f155764Y = parcel.readInt();
        this.f155745F = parcel.readString();
        this.f155748I = parcel.createTypedArrayList(AVTextExtraStruct.CREATOR);
        this.f155749J = parcel.readInt();
        this.f155750K = (List) parcel.readSerializable();
        this.f155751L = parcel.readInt();
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f155752M = z3;
        this.f155793ac = parcel.readInt();
        this.f155794ad = (ExtraSession) parcel.readParcelable(ExtraSession.class.getClassLoader());
        this.f155796af = (C71518t) parcel.readSerializable();
        if (parcel.readInt() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f155797ag = z4;
        this.f155742C = (AVETParameter) parcel.readSerializable();
        this.f155802al = (ExtraMentionUserModel) parcel.readSerializable();
        this.f155805ao = parcel.createStringArrayList();
        this.f155808ar = parcel.createStringArrayList();
        this.f155809as = (C71872i) parcel.readSerializable();
        this.f155810at = (DraftEditTransferModel) parcel.readParcelable(DraftEditTransferModel.class.getClassLoader());
        this.f155803am = (UrlModel) parcel.readSerializable();
        this.f155840y = (C39078ad) parcel.readSerializable();
        this.f155801ak = parcel.readString();
        this.f155837v = parcel.readString();
        if (parcel.readByte() != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.f155744E = z5;
        this.f155814ax = parcel.readInt();
        this.f155815ay = parcel.readFloat();
        parcel.readList(this.f155812av, Integer.class.getClassLoader());
        this.f155813aw = parcel.readString();
        this.f155746G = parcel.readString();
        if (parcel.readByte() != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.f155747H = z6;
        this.f155820e = parcel.readString();
        this.f155824i = (UrlModel) parcel.readSerializable();
        this.f155783aQ = (PhotoMvConfig) parcel.readParcelable(PhotoMvConfig.class.getClassLoader());
        this.f155766a = (CreativeFlowData) parcel.readParcelable(CreativeFlowData.class.getClassLoader());
        if (parcel.readByte() != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.f155753N = z7;
        if (parcel.readByte() != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f155754O = z8;
        this.f155773aG = parcel.readLong();
        this.f155779aM = parcel.readFloat();
        this.f155818c = parcel.readInt();
        this.f155765Z = (C74418d) parcel.readSerializable();
        this.f155776aJ = (User) parcel.readSerializable();
        this.f155777aK = (User) parcel.readSerializable();
        if (parcel.readByte() != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f155768aB = z9;
        this.f155821f = parcel.readString();
        this.f155841z = parcel.readString();
        this.f155774aH = parcel.readInt();
        this.f155784aR = parcel.readInt();
        this.f155785aS = parcel.readInt();
        this.f155838w = parcel.readString();
        this.f155806ap = parcel.readInt();
        this.f155807aq = (LoudnessBalanceParam) parcel.readSerializable();
        this.f155790aX = (BeautyMobParam) parcel.readParcelable(BeautyMobParam.class.getClassLoader());
        this.f155832q = parcel.readByte() != 0 ? true : z10;
        this.f155782aP = parcel.readString();
        this.f155826k = (QaStruct) parcel.readSerializable();
        this.f155787aU = (C39053a) parcel.readSerializable();
        this.f155788aV = parcel.readString();
        this.f155786aT = (SingleImageCoverBitmapData) parcel.readParcelable(SingleImageCoverBitmapData.class.getClassLoader());
        this.f155789aW = parcel.readString();
        this.f155829n = parcel.readString();
    }

    /* renamed from: a */
    public final void mo110006a(C70650dt dtVar) {
        this.f155817b.f155650f = dtVar;
    }

    /* renamed from: a */
    public final void mo110007a(ExtractFramesModel extractFramesModel) {
        this.f155817b.f155667w = extractFramesModel;
    }

    /* synthetic */ ShortVideoContext(Parcel parcel, byte b) {
        this(parcel);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f155775aI);
        parcel.writeParcelable(this.f155817b, i);
        parcel.writeInt(this.f155791aa ? 1 : 0);
        parcel.writeInt(this.f155792ab ? 1 : 0);
        parcel.writeSerializable(this.f155819d);
        parcel.writeInt(this.f155822g);
        parcel.writeString(this.f155823h);
        parcel.writeString(this.f155830o);
        parcel.writeString(this.f155831p);
        parcel.writeString(this.f155833r);
        parcel.writeString(this.f155834s);
        parcel.writeString(this.f155835t);
        parcel.writeSerializable(this.f155836u);
        parcel.writeSerializable(this.f155825j);
        parcel.writeInt(this.f155740A);
        parcel.writeString(this.f155741B);
        parcel.writeString(this.f155757R);
        parcel.writeString(this.f155761V);
        parcel.writeString(this.f155762W);
        parcel.writeInt(this.f155763X);
        parcel.writeInt(this.f155764Y);
        parcel.writeString(this.f155745F);
        parcel.writeTypedList(this.f155748I);
        parcel.writeInt(this.f155749J);
        parcel.writeSerializable((Serializable) this.f155750K);
        parcel.writeInt(this.f155751L);
        parcel.writeByte(this.f155752M ? (byte) 1 : 0);
        parcel.writeInt(this.f155793ac);
        parcel.writeParcelable(this.f155794ad, i);
        parcel.writeSerializable(this.f155796af);
        parcel.writeInt(this.f155797ag ? 1 : 0);
        parcel.writeSerializable(this.f155742C);
        parcel.writeSerializable(this.f155802al);
        parcel.writeStringList(this.f155805ao);
        parcel.writeStringList(this.f155808ar);
        parcel.writeSerializable(this.f155809as);
        parcel.writeParcelable(this.f155810at, i);
        parcel.writeSerializable(this.f155803am);
        parcel.writeSerializable(this.f155840y);
        parcel.writeString(this.f155801ak);
        parcel.writeString(this.f155837v);
        parcel.writeByte(this.f155744E ? (byte) 1 : 0);
        parcel.writeInt(this.f155814ax);
        parcel.writeFloat(this.f155815ay);
        parcel.writeList(this.f155812av);
        parcel.writeString(this.f155813aw);
        parcel.writeString(this.f155746G);
        parcel.writeByte(this.f155747H ? (byte) 1 : 0);
        parcel.writeString(this.f155820e);
        parcel.writeSerializable(this.f155824i);
        parcel.writeParcelable(this.f155783aQ, i);
        parcel.writeParcelable(this.f155766a, i);
        parcel.writeByte(this.f155753N ? (byte) 1 : 0);
        parcel.writeByte(this.f155754O ? (byte) 1 : 0);
        parcel.writeLong(this.f155773aG);
        parcel.writeFloat(this.f155779aM);
        parcel.writeInt(this.f155818c);
        parcel.writeSerializable(this.f155765Z);
        parcel.writeSerializable(this.f155776aJ);
        parcel.writeSerializable(this.f155777aK);
        parcel.writeByte(this.f155768aB ? (byte) 1 : 0);
        parcel.writeString(this.f155821f);
        parcel.writeString(this.f155841z);
        parcel.writeInt(this.f155774aH);
        parcel.writeInt(this.f155784aR);
        parcel.writeInt(this.f155785aS);
        parcel.writeString(this.f155838w);
        parcel.writeInt(this.f155806ap);
        parcel.writeSerializable(this.f155807aq);
        parcel.writeParcelable(this.f155790aX, i);
        parcel.writeByte(this.f155832q ? (byte) 1 : 0);
        parcel.writeString(this.f155782aP);
        parcel.writeSerializable(this.f155826k);
        parcel.writeSerializable(this.f155787aU);
        parcel.writeString(this.f155788aV);
        parcel.writeParcelable(this.f155786aT, i);
        parcel.writeString(this.f155789aW);
        parcel.writeString(this.f155829n);
    }
}
