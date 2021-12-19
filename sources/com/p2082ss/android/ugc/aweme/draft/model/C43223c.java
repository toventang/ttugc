package com.p2082ss.android.ugc.aweme.draft.model;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.p2082ss.android.ugc.aweme.editSticker.model.CoverPublishModel;
import com.p2082ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.p2082ss.android.ugc.aweme.effect.EffectListModel;
import com.p2082ss.android.ugc.aweme.infosticker.StickerChallenge;
import com.p2082ss.android.ugc.aweme.mvtheme.C61288d;
import com.p2082ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.C71872i;
import com.p2082ss.android.ugc.aweme.shortvideo.ImportVideoInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.beauty.BeautyMetadata;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C71518t;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.p2082ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.p2082ss.android.ugc.aweme.shortvideo.model.BeautyMobParam;
import com.p2082ss.android.ugc.aweme.shortvideo.model.CreativeFlowData;
import com.p2082ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.p2082ss.android.ugc.aweme.shortvideo.model.SocialModel;
import com.p2082ss.android.ugc.aweme.shortvideo.p3790ac.C69790a;
import com.p2082ss.android.ugc.aweme.shortvideo.reaction.ReactionParams;
import com.p2082ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.p2082ss.android.ugc.aweme.shoutouts.C74418d;
import com.p2082ss.android.ugc.aweme.sticker.StickerInfo;
import com.p2082ss.android.ugc.aweme.sticker.data.QaStruct;
import com.p2082ss.android.ugc.aweme.textsticker.TextStickerChallenges;
import com.p2082ss.android.ugc.aweme.utils.C80292cc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.draft.model.c */
public class C43223c {

    /* renamed from: A */
    public EnumC43224a f100878A = EnumC43224a.all;

    /* renamed from: B */
    public int f100879B = -1;

    /* renamed from: C */
    public long f100880C;

    /* renamed from: D */
    public int f100881D;

    /* renamed from: E */
    public EffectListModel f100882E;

    /* renamed from: F */
    public long f100883F;

    /* renamed from: G */
    public int f100884G;

    /* renamed from: H */
    public String f100885H;
    @AbstractC27891c(mo46611a = "time")

    /* renamed from: I */
    public long f100886I;
    @AbstractC27891c(mo46611a = "save_time")

    /* renamed from: J */
    public long f100887J;

    /* renamed from: K */
    public String f100888K;

    /* renamed from: L */
    public int f100889L;

    /* renamed from: M */
    public int f100890M;

    /* renamed from: N */
    public String f100891N;

    /* renamed from: O */
    public String f100892O;

    /* renamed from: P */
    float[] f100893P;

    /* renamed from: Q */
    public String f100894Q;

    /* renamed from: R */
    public int f100895R;

    /* renamed from: S */
    public float f100896S;

    /* renamed from: T */
    public String f100897T;

    /* renamed from: U */
    public String f100898U;

    /* renamed from: V */
    int f100899V;

    /* renamed from: W */
    public C43222b f100900W = new C43222b();
    @AbstractC27891c(mo46611a = "id")

    /* renamed from: a */
    public int f100901a;
    @AbstractC27891c(mo46611a = "aweme")

    /* renamed from: b */
    public C43221a f100902b;
    @AbstractC27891c(mo46611a = "photoMovieContext")

    /* renamed from: c */
    public PhotoMovieContext f100903c;

    /* renamed from: d */
    public transient int f100904d = -1;

    /* renamed from: e */
    public String f100905e;

    /* renamed from: f */
    public C69905c f100906f;

    /* renamed from: g */
    public String f100907g;

    /* renamed from: h */
    public String f100908h;

    /* renamed from: i */
    public String f100909i;

    /* renamed from: j */
    public int f100910j;

    /* renamed from: k */
    public int f100911k;

    /* renamed from: l */
    public int f100912l;

    /* renamed from: m */
    public int f100913m;

    /* renamed from: n */
    public int f100914n;

    /* renamed from: o */
    public int f100915o;

    /* renamed from: p */
    public int f100916p;

    /* renamed from: q */
    public String f100917q;

    /* renamed from: r */
    public String f100918r;

    /* renamed from: s */
    public UrlModel f100919s;

    /* renamed from: t */
    public int f100920t;

    /* renamed from: u */
    public String f100921u;

    /* renamed from: v */
    public int f100922v;

    /* renamed from: w */
    public int f100923w;

    /* renamed from: x */
    public int f100924x;

    /* renamed from: y */
    public boolean f100925y;

    /* renamed from: z */
    public boolean f100926z;

    static {
        Covode.recordClassIndex(51425);
    }

    /* renamed from: a */
    public final void mo73647a(String str) {
        this.f100900W.f100873v = str;
    }

    /* renamed from: a */
    public final void mo73637a(BeautyMobParam beautyMobParam) {
        this.f100900W.f100877z = beautyMobParam;
    }

    /* renamed from: a */
    public final boolean mo73652a() {
        int i = this.f100924x;
        return i == 0 || i == 1;
    }

    /* renamed from: a */
    public final void mo73649a(List<String> list) {
        this.f100900W.f100786aS = list;
    }

    /* renamed from: a */
    public final void mo73651a(boolean z) {
        C43222b bVar = this.f100900W;
        if (bVar != null) {
            bVar.f100815av = z;
        }
    }

    /* renamed from: a */
    public final void mo73643a(C74418d dVar) {
        this.f100900W.f100788aU = dVar;
    }

    /* renamed from: a */
    public final void mo73648a(ArrayList<BeautyMetadata> arrayList) {
        this.f100900W.f100771aD = arrayList;
    }

    /* renamed from: a */
    public final void mo73650a(Map<String, Object> map) {
        this.f100900W.f100802ai = map;
    }

    /* renamed from: a */
    public final void mo73641a(ReactionParams reactionParams) {
        this.f100900W.f100862k = reactionParams;
    }

    /* renamed from: a */
    public final void mo73639a(ExtractFramesModel extractFramesModel) {
        this.f100900W.f100872u = extractFramesModel;
    }

    /* renamed from: a */
    public final void mo73636a(AVUploadSaveModel aVUploadSaveModel) {
        this.f100900W.f100744D = aVUploadSaveModel;
    }

    /* renamed from: a */
    public final void mo73628a(InfoStickerModel infoStickerModel) {
        this.f100900W.f100745E = infoStickerModel;
    }

    /* renamed from: a */
    public final void mo73634a(C71518t tVar) {
        this.f100900W.f100746F = tVar;
    }

    /* renamed from: a */
    public final void mo73640a(SocialModel socialModel) {
        this.f100900W.f100751K = socialModel;
    }

    /* renamed from: a */
    public final void mo73638a(CreativeFlowData creativeFlowData) {
        this.f100900W.f100755O = creativeFlowData;
    }

    /* renamed from: a */
    public final void mo73630a(C61288d dVar) {
        this.f100900W.f100753M = dVar;
    }

    /* renamed from: a */
    public final void mo73635a(C71872i iVar) {
        this.f100900W.f100756P = iVar;
    }

    /* renamed from: a */
    public final void mo73632a(EditPreviewInfo editPreviewInfo) {
        this.f100900W.f100808ao = editPreviewInfo;
    }

    /* renamed from: a */
    public final void mo73645a(QaStruct qaStruct) {
        this.f100900W.f100848bu = qaStruct;
    }

    /* renamed from: a */
    public final void mo73629a(StickerChallenge stickerChallenge) {
        this.f100900W.f100800ag = stickerChallenge;
    }

    /* renamed from: a */
    public final void mo73646a(TextStickerChallenges textStickerChallenges) {
        this.f100900W.f100801ah = textStickerChallenges;
    }

    /* renamed from: a */
    public final void mo73633a(MultiEditVideoStatusRecordData multiEditVideoStatusRecordData) {
        this.f100900W.f100817ax = multiEditVideoStatusRecordData;
    }

    /* renamed from: a */
    public final void mo73631a(C69790a aVar) {
        this.f100900W.f100819az = aVar;
    }

    /* renamed from: a */
    public final void mo73644a(StickerInfo stickerInfo) {
        this.f100900W.f100769aB = stickerInfo;
    }

    /* renamed from: a */
    public final void mo73642a(StitchParams stitchParams) {
        this.f100900W.f100777aJ = stitchParams;
    }

    /* renamed from: a */
    public final void mo73627a(CoverPublishModel coverPublishModel) {
        this.f100900W.f100785aR = coverPublishModel;
    }

    /* renamed from: b */
    public final int mo73653b() {
        C43222b bVar = this.f100900W;
        if (bVar == null) {
            return 0;
        }
        return bVar.f100766Z;
    }

    /* renamed from: d */
    public final int mo73666d() {
        return this.f100900W.f100795ab.intValue();
    }

    /* renamed from: g */
    public final ReactionParams mo73681g() {
        C43222b bVar = this.f100900W;
        if (bVar != null) {
            return bVar.f100862k;
        }
        return null;
    }

    /* renamed from: i */
    public final ExtractFramesModel mo73690i() {
        if (this.f100900W.f100872u == null) {
            return null;
        }
        return this.f100900W.f100872u;
    }

    /* renamed from: j */
    public final InfoStickerModel mo73694j() {
        C43222b bVar = this.f100900W;
        if (bVar != null) {
            return bVar.f100745E;
        }
        return null;
    }

    /* renamed from: o */
    public final String mo73714o() {
        if (this.f100900W.f100753M == null) {
            return null;
        }
        return this.f100900W.f100753M.videoCoverImgPath;
    }

    /* renamed from: p */
    public final String mo73718p() {
        if (this.f100900W.f100817ax == null) {
            return null;
        }
        return this.f100900W.f100817ax.coverImagePath;
    }

    /* renamed from: q */
    public final C43235i mo73722q() {
        C43222b bVar = this.f100900W;
        if (bVar != null) {
            return bVar.f100794aa;
        }
        return null;
    }

    /* renamed from: f */
    public final String mo73676f() {
        String str = this.f100900W.f100854c;
        if (TextUtils.isEmpty(str)) {
            return UUID.randomUUID().toString();
        }
        return str;
    }

    /* renamed from: r */
    public final String mo73726r() {
        if (TextUtils.isEmpty(this.f100905e)) {
            this.f100905e = mo73676f();
        }
        return this.f100905e;
    }

    /* renamed from: s */
    public final float mo73729s() {
        if (m86197c(this.f100900W.f100812as)) {
            return -1.0f;
        }
        return this.f100900W.f100812as;
    }

    /* renamed from: t */
    public final boolean mo73734t() {
        if (this.f100900W.f100843bp != null) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.draft.model.c$a */
    public enum EnumC43224a {
        all,
        half,
        none;

        static {
            Covode.recordClassIndex(51426);
        }
    }

    /* renamed from: h */
    public final boolean mo73689h() {
        C43222b bVar = this.f100900W;
        if (bVar != null) {
            return bVar.f100864m;
        }
        return false;
    }

    /* renamed from: k */
    public final boolean mo73701k() {
        if (this.f100900W.f100753M != null) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public final boolean mo73705l() {
        if (this.f100900W.f100754N != null) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public final boolean mo73709m() {
        if (this.f100903c != null) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public final boolean mo73713n() {
        if (this.f100900W.f100817ax == null || !this.f100900W.f100817ax.isSupportMultiEdit) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final boolean mo73675e() {
        if (!TextUtils.isEmpty(this.f100897T)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo73665c() {
        C43222b bVar = this.f100900W;
        if (bVar == null || !bVar.f100815av) {
            return false;
        }
        return true;
    }

    public String toString() {
        String str;
        StringBuilder append = new StringBuilder("AwemeDraft{id=").append(this.f100901a).append("creationId=").append(this.f100900W.f100854c).append("previewInfo=");
        EditPreviewInfo editPreviewInfo = this.f100900W.f100808ao;
        if (editPreviewInfo == null) {
            str = null;
        } else {
            str = "[" + editPreviewInfo.getVideoList().size() + ']' + "[videoFileInfo:" + C89070n.m154551a(editPreviewInfo.getVideoList(), (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C80292cc.C80293a.f179814a, 31) + ']' + "[videoCutInfo:" + C89070n.m154551a(editPreviewInfo.getVideoList(), (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C80292cc.C80294b.f179815a, 31) + ']';
        }
        return append.append(str).append(", aweme=").append(this.f100902b).append(", photoMovieContext=").append(this.f100903c).append(", musicModel=").append(this.f100906f).append(", videoPath='").append(this.f100907g).append('\'').append(", musicPath='").append(this.f100908h).append('\'').append(", voicePath='").append(this.f100909i).append('\'').append(", videoVolume=").append(this.f100910j).append(", musicVolume=").append(this.f100911k).append(", filter=").append(this.f100913m).append(", musicStart=").append(this.f100914n).append(", effect=").append(this.f100915o).append(", origin=").append(this.f100916p).append(", mReversePath='").append(this.f100917q).append('\'').append(", videoSpeed='").append(this.f100918r).append('\'').append(", audioTrack=").append(this.f100919s).append(", fiterLabel='").append(this.f100921u).append('\'').append(", cameraPos=").append(this.f100922v).append(", useBeauty=").append(this.f100923w).append(", type=").append(this.f100924x).append(", isWidthDivider=").append(this.f100926z).append(", privateVideo=").append(this.f100881D).append(", mEffectListModel=").append(this.f100882E).append(", maxDuration=").append(this.f100883F).append(", faceBeauty=").append(this.f100884G).append(", userId='").append(this.f100885H).append('\'').append(", time=").append(this.f100886I).append(", videoSegmentsDesc='").append(this.f100888K).append('\'').append(", hardEncode=").append(this.f100889L).append(", specialPoints=").append(this.f100890M).append(", stickerPath='").append(this.f100891N).append('\'').append(", stickerID='").append(this.f100892O).append('\'').append(", volumeTaps=").append(Arrays.toString(this.f100893P)).append(", musicEffectSegments='").append(this.f100894Q).append('\'').append(", newVersion=").append(this.f100895R).append(", customCoverStart=").append(this.f100896S).append(", duetFrom='").append(this.f100897T).append('\'').append(", syncPlatforms='").append(this.f100898U).append('\'').append(", from='").append(this.f100899V).append('\'').append(", extras=").append(this.f100900W).append('}').toString();
    }

    /* renamed from: a */
    public final void mo73619a(int i) {
        this.f100900W.f100838bk = i;
    }

    /* renamed from: b */
    public final void mo73654b(float f) {
        this.f100900W.f100831bd = f;
    }

    /* renamed from: c */
    public final void mo73660c(int i) {
        this.f100900W.f100837bj = i;
    }

    /* renamed from: d */
    public final void mo73667d(int i) {
        this.f100900W.f100762V = i;
    }

    /* renamed from: e */
    public final void mo73671e(int i) {
        this.f100900W.f100763W = i;
    }

    /* renamed from: f */
    public final void mo73677f(int i) {
        this.f100900W.f100764X = i;
    }

    /* renamed from: g */
    public final void mo73682g(int i) {
        this.f100900W.f100765Y = i;
    }

    /* renamed from: h */
    public final void mo73686h(int i) {
        C43222b bVar = this.f100900W;
        if (bVar != null) {
            bVar.f100766Z = i;
        }
    }

    /* renamed from: i */
    public final void mo73692i(String str) {
        this.f100900W.f100760T = str;
    }

    /* renamed from: j */
    public final void mo73695j(int i) {
        this.f100900W.f100789aV = i;
    }

    /* renamed from: k */
    public final void mo73698k(int i) {
        this.f100900W.f100750J = i;
    }

    /* renamed from: l */
    public final void mo73702l(int i) {
        this.f100900W.f100798ae = i;
    }

    /* renamed from: m */
    public final void mo73706m(int i) {
        this.f100900W.f100810aq = i;
    }

    /* renamed from: n */
    public final void mo73710n(int i) {
        this.f100900W.f100811ar = i;
    }

    /* renamed from: o */
    public final void mo73715o(int i) {
        this.f100900W.f100820b = i;
    }

    /* renamed from: p */
    public final void mo73719p(int i) {
        this.f100900W.f100767a = i;
    }

    /* renamed from: q */
    public final void mo73723q(int i) {
        this.f100900W.f100860i = i;
    }

    /* renamed from: r */
    public final void mo73727r(int i) {
        this.f100900W.f100861j = i;
    }

    /* renamed from: s */
    public final void mo73730s(int i) {
        this.f100900W.f100856e = i;
    }

    /* renamed from: t */
    public final void mo73732t(int i) {
        this.f100900W.f100829bb = i;
    }

    /* renamed from: u */
    public final void mo73736u(int i) {
        this.f100900W.f100747G = i;
    }

    /* renamed from: v */
    public final void mo73738v(int i) {
        this.f100900W.f100774aG = i;
    }

    /* renamed from: w */
    public final void mo73740w(int i) {
        this.f100900W.f100814au = i;
    }

    /* renamed from: x */
    public final void mo73742x(String str) {
        this.f100900W.f100783aP = str;
    }

    /* renamed from: a */
    public final void mo73618a(float f) {
        if (!m86197c(f)) {
            this.f100900W.f100812as = f;
        }
    }

    /* renamed from: c */
    public final void mo73661c(String str) {
        this.f100900W.f100875x = str;
    }

    /* renamed from: e */
    public final void mo73672e(String str) {
        this.f100900W.f100741A = str;
    }

    /* renamed from: f */
    public final void mo73678f(String str) {
        this.f100900W.f100742B = str;
    }

    /* renamed from: h */
    public final void mo73687h(String str) {
        this.f100900W.f100805al = str;
    }

    /* renamed from: k */
    public final void mo73699k(String str) {
        this.f100900W.f100865n = str;
    }

    /* renamed from: l */
    public final void mo73703l(String str) {
        this.f100900W.f100854c = str;
    }

    /* renamed from: m */
    public final void mo73707m(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "edit_draft";
        }
        this.f100900W.f100855d = str;
    }

    /* renamed from: n */
    public final void mo73711n(String str) {
        this.f100900W.f100845br = str;
    }

    /* renamed from: s */
    public final void mo73731s(String str) {
        this.f100900W.f100796ac = str;
    }

    /* renamed from: t */
    public final void mo73733t(String str) {
        if (str != null) {
            C43222b bVar = this.f100900W;
            C89219l.m154721d(str, "");
            bVar.f100847bt = str;
        }
    }

    /* renamed from: u */
    public final void mo73737u(String str) {
        this.f100900W.f100768aA = str;
    }

    /* renamed from: v */
    public final void mo73739v(String str) {
        this.f100900W.f100866o = str;
    }

    /* renamed from: w */
    public final void mo73741w(String str) {
        this.f100900W.f100776aI = str;
    }

    /* renamed from: c */
    private static boolean m86197c(float f) {
        double d = (double) f;
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo73620a(long j) {
        this.f100900W.f100830bc = j;
    }

    /* renamed from: b */
    public final void mo73655b(int i) {
        this.f100900W.f100836bi = i;
    }

    /* renamed from: d */
    public final void mo73668d(String str) {
        this.f100900W.f100876y = str;
    }

    /* renamed from: e */
    public final void mo73673e(List<String> list) {
        this.f100900W.f100748H = list;
    }

    /* renamed from: g */
    public final void mo73683g(String str) {
        this.f100900W.f100841bn = str;
    }

    /* renamed from: h */
    public final void mo73688h(boolean z) {
        this.f100900W.f100818ay = z;
    }

    /* renamed from: i */
    public final void mo73691i(int i) {
        this.f100900W.f100795ab = Integer.valueOf(i);
    }

    /* renamed from: j */
    public final void mo73696j(String str) {
        this.f100900W.f100797ad = str;
    }

    /* renamed from: k */
    public final void mo73700k(boolean z) {
        this.f100900W.f100816aw = z;
    }

    /* renamed from: l */
    public final void mo73704l(boolean z) {
        this.f100900W.f100778aK = z;
    }

    /* renamed from: m */
    public final void mo73708m(boolean z) {
        this.f100900W.f100781aN = z;
    }

    /* renamed from: n */
    public final void mo73712n(boolean z) {
        this.f100900W.f100782aO = z;
    }

    /* renamed from: o */
    public final void mo73716o(String str) {
        C43222b bVar = this.f100900W;
        C89219l.m154721d(str, "");
        bVar.f100857f = str;
    }

    /* renamed from: p */
    public final void mo73720p(String str) {
        this.f100900W.f100863l = str;
    }

    /* renamed from: q */
    public final void mo73724q(String str) {
        this.f100900W.f100868q = str;
    }

    /* renamed from: a */
    public final void mo73621a(CommentVideoModel commentVideoModel) {
        this.f100900W.f100770aC = commentVideoModel;
    }

    /* renamed from: b */
    public final void mo73656b(String str) {
        this.f100900W.f100874w = str;
    }

    /* renamed from: c */
    public final void mo73662c(ArrayList<String> arrayList) {
        this.f100900W.f100780aM = arrayList;
    }

    /* renamed from: d */
    public final void mo73669d(List<String> list) {
        this.f100900W.f100834bg = list;
    }

    /* renamed from: e */
    public final void mo73674e(boolean z) {
        this.f100900W.f100864m = z;
    }

    /* renamed from: f */
    public final void mo73679f(List<EditVideoSegment> list) {
        this.f100900W.f100809ap = list;
    }

    /* renamed from: g */
    public final void mo73684g(List<String> list) {
        this.f100900W.f100791aX = list;
    }

    /* renamed from: i */
    public final void mo73693i(boolean z) {
        this.f100900W.f100757Q = z;
    }

    /* renamed from: j */
    public final void mo73697j(boolean z) {
        this.f100900W.f100773aF = z;
    }

    /* renamed from: o */
    public final void mo73717o(boolean z) {
        this.f100900W.f100792aY = z;
    }

    /* renamed from: p */
    public final void mo73721p(boolean z) {
        this.f100900W.f100793aZ = z;
    }

    /* renamed from: q */
    public final void mo73725q(boolean z) {
        this.f100900W.f100828ba = z;
    }

    /* renamed from: r */
    public final void mo73728r(String str) {
        C43222b bVar = this.f100900W;
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        C89219l.m154721d(str, "");
        bVar.f100813at = str;
    }

    /* renamed from: a */
    public final void mo73622a(CutSameEditData cutSameEditData) {
        this.f100900W.f100784aQ = cutSameEditData;
    }

    /* renamed from: b */
    public final void mo73657b(ArrayList<ImportVideoInfo> arrayList) {
        this.f100900W.f100799af = arrayList;
    }

    /* renamed from: c */
    public final void mo73663c(List<String> list) {
        this.f100900W.f100833bf = list;
    }

    /* renamed from: d */
    public final void mo73670d(boolean z) {
        this.f100900W.f100858g = z;
    }

    /* renamed from: f */
    public final void mo73680f(boolean z) {
        this.f100900W.f100749I = z;
    }

    /* renamed from: g */
    public final void mo73685g(boolean z) {
        this.f100900W.f100804ak = z;
    }

    /* renamed from: a */
    public final void mo73623a(DuetExtraInfo duetExtraInfo) {
        this.f100900W.mo73614a(duetExtraInfo);
    }

    /* renamed from: b */
    public final void mo73658b(List<User> list) {
        this.f100900W.f100787aT = list;
    }

    /* renamed from: c */
    public final void mo73664c(boolean z) {
        this.f100900W.f100859h = z;
    }

    /* renamed from: a */
    public final void mo73624a(C43222b bVar) {
        this.f100900W = bVar;
        if (bVar != null && !TextUtils.isEmpty(bVar.f100759S)) {
            this.f100907g = this.f100900W.f100759S;
        }
    }

    /* renamed from: b */
    public final void mo73659b(boolean z) {
        this.f100900W.f100853bz = z;
    }

    /* renamed from: a */
    public final void mo73625a(C43231e eVar) {
        this.f100900W.f100761U = eVar;
    }

    /* renamed from: a */
    public final void mo73626a(C43235i iVar) {
        this.f100900W.f100794aa = iVar;
    }
}
