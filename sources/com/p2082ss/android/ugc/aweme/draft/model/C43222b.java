package com.p2082ss.android.ugc.aweme.draft.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.p2082ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.p2082ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.p2082ss.android.ugc.aweme.common.C39053a;
import com.p2082ss.android.ugc.aweme.edit.Cut2EditTransferModel;
import com.p2082ss.android.ugc.aweme.edit.TTStoryUploadModel;
import com.p2082ss.android.ugc.aweme.editSticker.model.CoverPublishModel;
import com.p2082ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.p2082ss.android.ugc.aweme.feed.model.InteractionTagUserInfo;
import com.p2082ss.android.ugc.aweme.infosticker.StickerChallenge;
import com.p2082ss.android.ugc.aweme.mvtheme.C61288d;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.sharedar.SharedARModel;
import com.p2082ss.android.ugc.aweme.shortvideo.C71872i;
import com.p2082ss.android.ugc.aweme.shortvideo.ImportVideoInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.beauty.BeautyMetadata;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C71518t;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.LoudnessBalanceParam;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.p2082ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.p2082ss.android.ugc.aweme.shortvideo.model.BeautyMobParam;
import com.p2082ss.android.ugc.aweme.shortvideo.model.CreativeFlowData;
import com.p2082ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.p2082ss.android.ugc.aweme.shortvideo.model.GreenScreenMaterial;
import com.p2082ss.android.ugc.aweme.shortvideo.model.SocialModel;
import com.p2082ss.android.ugc.aweme.shortvideo.p3790ac.C69790a;
import com.p2082ss.android.ugc.aweme.shortvideo.reaction.ReactionParams;
import com.p2082ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.p2082ss.android.ugc.aweme.shoutouts.C74418d;
import com.p2082ss.android.ugc.aweme.status.StatusCreateVideoData;
import com.p2082ss.android.ugc.aweme.sticker.StickerInfo;
import com.p2082ss.android.ugc.aweme.sticker.data.QaStruct;
import com.p2082ss.android.ugc.aweme.textsticker.TextStickerChallenges;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.draft.model.b */
public final class C43222b {
    @AbstractC27891c(mo46611a = "selectedFilterId")

    /* renamed from: A */
    public String f100741A;
    @AbstractC27891c(mo46611a = "selectedFilterLabel")

    /* renamed from: B */
    public String f100742B;
    @AbstractC27891c(mo46611a = "selectedFilterValue")

    /* renamed from: C */
    public String f100743C;
    @AbstractC27891c(mo46611a = "uploadSaveModel")

    /* renamed from: D */
    public AVUploadSaveModel f100744D;
    @AbstractC27891c(mo46611a = "infoStickerModel")

    /* renamed from: E */
    public InfoStickerModel f100745E;
    @AbstractC27891c(mo46611a = "micro_app_info")

    /* renamed from: F */
    public C71518t f100746F;
    @AbstractC27891c(mo46611a = "video_type")

    /* renamed from: G */
    public int f100747G;
    @AbstractC27891c(mo46611a = "texts")

    /* renamed from: H */
    public List<String> f100748H;
    @AbstractC27891c(mo46611a = "usePaint")

    /* renamed from: I */
    public boolean f100749I;
    @AbstractC27891c(mo46611a = "commentSetting")

    /* renamed from: J */
    public int f100750J;
    @AbstractC27891c(mo46611a = "socialModel", mo46612b = {"E"})

    /* renamed from: K */
    public SocialModel f100751K;
    @AbstractC27891c(mo46611a = "firstStickerMusicIds")

    /* renamed from: L */
    public String f100752L;
    @AbstractC27891c(mo46611a = "mv_theme_create_video")

    /* renamed from: M */
    public C61288d f100753M;
    @AbstractC27891c(mo46611a = "status_create_video")

    /* renamed from: N */
    public StatusCreateVideoData f100754N;
    @AbstractC27891c(mo46611a = "creative_flow_data")

    /* renamed from: O */
    public CreativeFlowData f100755O;
    @AbstractC27891c(mo46611a = "av_upload_misc_struct")

    /* renamed from: P */
    public C71872i f100756P;
    @AbstractC27891c(mo46611a = "is_fast_import")

    /* renamed from: Q */
    public boolean f100757Q;
    @AbstractC27891c(mo46611a = "fast_import_resolution")

    /* renamed from: R */
    public String f100758R;
    @AbstractC27891c(mo46611a = "draft_video_path")

    /* renamed from: S */
    public String f100759S;
    @AbstractC27891c(mo46611a = "videoCoverPath")

    /* renamed from: T */
    public String f100760T;
    @AbstractC27891c(mo46611a = "cher_effect_param")

    /* renamed from: U */
    public C43231e f100761U;
    @AbstractC27891c(mo46611a = "videoOutWidth")

    /* renamed from: V */
    public int f100762V;
    @AbstractC27891c(mo46611a = "videoOutHeight")

    /* renamed from: W */
    public int f100763W;
    @AbstractC27891c(mo46611a = "videoCanvasWidth")

    /* renamed from: X */
    public int f100764X;
    @AbstractC27891c(mo46611a = "videoCanvasHeight")

    /* renamed from: Y */
    public int f100765Y;

    /* renamed from: Z */
    public int f100766Z;
    @AbstractC27891c(mo46611a = "shootMode")

    /* renamed from: a */
    public int f100767a;
    @AbstractC27891c(mo46611a = "backGroundVideoDraftDir")

    /* renamed from: aA */
    public String f100768aA;
    @AbstractC27891c(mo46611a = "sticker_info")

    /* renamed from: aB */
    public StickerInfo f100769aB;
    @AbstractC27891c(mo46611a = "comment_sticker_model")

    /* renamed from: aC */
    public CommentVideoModel f100770aC;
    @AbstractC27891c(mo46611a = "beauty_metadata")

    /* renamed from: aD */
    public ArrayList<BeautyMetadata> f100771aD;
    @AbstractC27891c(mo46611a = "update_info_stickers")

    /* renamed from: aE */
    public boolean f100772aE;
    @AbstractC27891c(mo46611a = "autoEnhanceOn")

    /* renamed from: aF */
    public boolean f100773aF;
    @AbstractC27891c(mo46611a = "autoEnhanceType")

    /* renamed from: aG */
    public int f100774aG;
    @AbstractC27891c(mo46611a = "stick_point_type")

    /* renamed from: aH */
    public int f100775aH;
    @AbstractC27891c(mo46611a = "duet_layout")

    /* renamed from: aI */
    public String f100776aI;
    @AbstractC27891c(mo46611a = "stitch_params")

    /* renamed from: aJ */
    public StitchParams f100777aJ;
    @AbstractC27891c(mo46611a = "is_commerce_music")

    /* renamed from: aK */
    public boolean f100778aK;
    @AbstractC27891c(mo46611a = "green_screen_material_list")

    /* renamed from: aL */
    public ArrayList<GreenScreenMaterial> f100779aL;
    @AbstractC27891c(mo46611a = "camera_lens_info")

    /* renamed from: aM */
    public ArrayList<String> f100780aM;
    @AbstractC27891c(mo46611a = "is_photo_mv_mode")

    /* renamed from: aN */
    public boolean f100781aN;
    @AbstractC27891c(mo46611a = "is_duet_green_srceen")

    /* renamed from: aO */
    public boolean f100782aO;
    @AbstractC27891c(mo46611a = "is_sound_loop")

    /* renamed from: aP */
    public String f100783aP;
    @AbstractC27891c(mo46611a = "cutsame_data")

    /* renamed from: aQ */
    public CutSameEditData f100784aQ;
    @AbstractC27891c(mo46611a = "cover_publish_model")

    /* renamed from: aR */
    public CoverPublishModel f100785aR;
    @AbstractC27891c(mo46611a = "geofencing_info")

    /* renamed from: aS */
    public List<String> f100786aS;
    @AbstractC27891c(mo46611a = "exclude_user_list")

    /* renamed from: aT */
    public List<? extends User> f100787aT;
    @AbstractC27891c(mo46611a = "shout_outs_data")

    /* renamed from: aU */
    public C74418d f100788aU;
    @AbstractC27891c(mo46611a = "allow_recommend")

    /* renamed from: aV */
    public int f100789aV;
    @AbstractC27891c(mo46611a = "shared_ar_model")

    /* renamed from: aW */
    public SharedARModel f100790aW;
    @AbstractC27891c(mo46611a = "message_bubble_texts")

    /* renamed from: aX */
    public List<String> f100791aX;
    @AbstractC27891c(mo46611a = "is_photo_mv_music")

    /* renamed from: aY */
    public boolean f100792aY;
    @AbstractC27891c(mo46611a = "is_photo_mv_mode_1080p")

    /* renamed from: aZ */
    public boolean f100793aZ;
    @AbstractC27891c(mo46611a = "draft_ve_audio_effect_param")

    /* renamed from: aa */
    public C43235i f100794aa;
    @AbstractC27891c(mo46611a = "draft_time_effect_start_point")

    /* renamed from: ab */
    public Integer f100795ab;
    @AbstractC27891c(mo46611a = "filter_local_path")

    /* renamed from: ac */
    public String f100796ac;
    @AbstractC27891c(mo46611a = "camera_ids")

    /* renamed from: ad */
    public String f100797ad;
    @AbstractC27891c(mo46611a = "beauty_type")

    /* renamed from: ae */
    public int f100798ae;
    @AbstractC27891c(mo46611a = "import_video_infos")

    /* renamed from: af */
    public ArrayList<ImportVideoInfo> f100799af;
    @AbstractC27891c(mo46611a = "sticker_challenge")

    /* renamed from: ag */
    public StickerChallenge f100800ag;
    @AbstractC27891c(mo46611a = "text_sticker_challenge")

    /* renamed from: ah */
    public TextStickerChallenges f100801ah;
    @AbstractC27891c(mo46611a = "video_part_metadata")

    /* renamed from: ai */
    public Map<String, ? extends Object> f100802ai;
    @AbstractC27891c(mo46611a = "audio_recorder_param")

    /* renamed from: aj */
    public AudioRecorderParam f100803aj;
    @AbstractC27891c(mo46611a = "is_stickpoint_mode")

    /* renamed from: ak */
    public boolean f100804ak;
    @AbstractC27891c(mo46611a = "upload_path")

    /* renamed from: al */
    public String f100805al;
    @AbstractC27891c(mo46611a = "draft_preview_configure")

    /* renamed from: am */
    public C43233g f100806am;
    @AbstractC27891c(mo46611a = "video_segments_copy")

    /* renamed from: an */
    public List<DraftVideoSegment> f100807an;
    @AbstractC27891c(mo46611a = "preview_info")

    /* renamed from: ao */
    public EditPreviewInfo f100808ao;
    @AbstractC27891c(mo46611a = "preview_video_list_copy")

    /* renamed from: ap */
    public List<? extends EditVideoSegment> f100809ap;
    @AbstractC27891c(mo46611a = "videoCount")

    /* renamed from: aq */
    public int f100810aq;
    @AbstractC27891c(mo46611a = "photoCount")

    /* renamed from: ar */
    public int f100811ar;
    @AbstractC27891c(mo46611a = "filter_intensity")

    /* renamed from: as */
    public float f100812as;
    @AbstractC27891c(mo46611a = "pic2VideoSource")

    /* renamed from: at */
    public String f100813at;
    @AbstractC27891c(mo46611a = "downloadSetting")

    /* renamed from: au */
    public int f100814au;
    @AbstractC27891c(mo46611a = "useMusicBeforeEdit")

    /* renamed from: av */
    public boolean f100815av;
    @AbstractC27891c(mo46611a = "support_retake")

    /* renamed from: aw */
    public boolean f100816aw;
    @AbstractC27891c(mo46611a = "multi_edit_video_data")

    /* renamed from: ax */
    public MultiEditVideoStatusRecordData f100817ax;
    @AbstractC27891c(mo46611a = "containBackgroundVideo")

    /* renamed from: ay */
    public boolean f100818ay;
    @AbstractC27891c(mo46611a = "stick_point_data")

    /* renamed from: az */
    public C69790a f100819az;
    @AbstractC27891c(mo46611a = "from")

    /* renamed from: b */
    public int f100820b;
    @AbstractC27891c(mo46611a = "edit_music_sync_mode")

    /* renamed from: bA */
    public boolean f100821bA;
    @AbstractC27891c(mo46611a = "cut_2_edit_transfer_model")

    /* renamed from: bB */
    public Cut2EditTransferModel f100822bB;
    @AbstractC27891c(mo46611a = "is_file_length_fixed")

    /* renamed from: bC */
    public boolean f100823bC;
    @AbstractC27891c(mo46611a = "session_id")

    /* renamed from: bD */
    public String f100824bD;
    @AbstractC27891c(mo46611a = "tt_story_upload_model")

    /* renamed from: bE */
    public TTStoryUploadModel f100825bE;
    @AbstractC27891c(mo46611a = "last_output_video_path")

    /* renamed from: bF */
    public String f100826bF;
    @AbstractC27891c(mo46611a = "is_story_draft")

    /* renamed from: bG */
    public boolean f100827bG;
    @AbstractC27891c(mo46611a = "is_draft_music_illegal")

    /* renamed from: ba */
    public boolean f100828ba;
    @AbstractC27891c(mo46611a = "publish_stage")

    /* renamed from: bb */
    public int f100829bb;
    @AbstractC27891c(mo46611a = "audio_aec_delay_time")

    /* renamed from: bc */
    public long f100830bc;
    @AbstractC27891c(mo46611a = "current_zoom_value")

    /* renamed from: bd */
    public float f100831bd;
    @AbstractC27891c(mo46611a = "multi_edit_video_size")

    /* renamed from: be */
    public Map<String, Long> f100832be;
    @AbstractC27891c(mo46611a = "mention_sticker_texts")

    /* renamed from: bf */
    public List<String> f100833bf;
    @AbstractC27891c(mo46611a = "hashtag_sticker_texts")

    /* renamed from: bg */
    public List<String> f100834bg;
    @AbstractC27891c(mo46611a = "shooted_shoot_mode")

    /* renamed from: bh */
    public int f100835bh;
    @AbstractC27891c(mo46611a = "duet_from_duet_sticker")

    /* renamed from: bi */
    public int f100836bi;
    @AbstractC27891c(mo46611a = "duet_from_duet_button")

    /* renamed from: bj */
    public int f100837bj;
    @AbstractC27891c(mo46611a = "enable_auto_caption")

    /* renamed from: bk */
    public int f100838bk;
    @AbstractC27891c(mo46611a = "duet_extra_info")

    /* renamed from: bl */
    public DuetExtraInfo f100839bl;
    @AbstractC27891c(mo46611a = "record_bgm_delay")

    /* renamed from: bm */
    public Integer f100840bm;
    @AbstractC27891c(mo46611a = "selectedFilterResId")

    /* renamed from: bn */
    public String f100841bn;
    @AbstractC27891c(mo46611a = "canvas_video_info")

    /* renamed from: bo */
    public CanvasVideoData f100842bo;
    @AbstractC27891c(mo46611a = "lightening_extra_info")

    /* renamed from: bp */
    public LighteningExtraInfo f100843bp;
    @AbstractC27891c(mo46611a = "loudness_param")

    /* renamed from: bq */
    public LoudnessBalanceParam f100844bq;
    @AbstractC27891c(mo46611a = "shootFrom")

    /* renamed from: br */
    public String f100845br;
    @AbstractC27891c(mo46611a = "save_draft_app_version")

    /* renamed from: bs */
    public long f100846bs;
    @AbstractC27891c(mo46611a = "is_west_window_exist_str")

    /* renamed from: bt */
    public String f100847bt;
    @AbstractC27891c(mo46611a = "qa_video_model")

    /* renamed from: bu */
    public QaStruct f100848bu;
    @AbstractC27891c(mo46611a = "tag_user_list")

    /* renamed from: bv */
    public ArrayList<InteractionTagUserInfo> f100849bv;
    @AbstractC27891c(mo46611a = "auto_attached_anchor")

    /* renamed from: bw */
    public C39053a f100850bw;
    @AbstractC27891c(mo46611a = "open_platform_extra")

    /* renamed from: bx */
    public String f100851bx;
    @AbstractC27891c(mo46611a = "open_platform_client_key")

    /* renamed from: by */
    public String f100852by;
    @AbstractC27891c(mo46611a = "is_audio_enhance")

    /* renamed from: bz */
    public boolean f100853bz;
    @AbstractC27891c(mo46611a = "creationId")

    /* renamed from: c */
    public String f100854c;
    @AbstractC27891c(mo46611a = "shootWay")

    /* renamed from: d */
    public String f100855d;
    @AbstractC27891c(mo46611a = "draftId")

    /* renamed from: e */
    public int f100856e;
    @AbstractC27891c(mo46611a = "newDraftId")

    /* renamed from: f */
    public String f100857f;
    @AbstractC27891c(mo46611a = "isMultiVideo")

    /* renamed from: g */
    public boolean f100858g;
    @AbstractC27891c(mo46611a = "durationMode")

    /* renamed from: h */
    public boolean f100859h;
    @AbstractC27891c(mo46611a = "recordMode")

    /* renamed from: i */
    public int f100860i;
    @AbstractC27891c(mo46611a = "gameScore")

    /* renamed from: j */
    public int f100861j;
    @AbstractC27891c(mo46611a = "reactionParams")

    /* renamed from: k */
    public ReactionParams f100862k;
    @AbstractC27891c(mo46611a = "microAppId")

    /* renamed from: l */
    public String f100863l;
    @AbstractC27891c(mo46611a = "isMuted")

    /* renamed from: m */
    public boolean f100864m;
    @AbstractC27891c(mo46611a = "musicOrigin")

    /* renamed from: n */
    public String f100865n;
    @AbstractC27891c(mo46611a = "mainBusinessData")

    /* renamed from: o */
    public String f100866o;
    @AbstractC27891c(mo46611a = "socialData")

    /* renamed from: p */
    public String f100867p;
    @AbstractC27891c(mo46611a = "commerceData")

    /* renamed from: q */
    public String f100868q;
    @AbstractC27891c(mo46611a = "ugData")

    /* renamed from: r */
    public String f100869r;
    @AbstractC27891c(mo46611a = "techData")

    /* renamed from: s */
    public String f100870s;
    @AbstractC27891c(mo46611a = "globalData")

    /* renamed from: t */
    public String f100871t;
    @AbstractC27891c(mo46611a = "extractFramesModel")

    /* renamed from: u */
    public ExtractFramesModel f100872u;
    @AbstractC27891c(mo46611a = "filterId")

    /* renamed from: v */
    public String f100873v;
    @AbstractC27891c(mo46611a = "record_filter_ids")

    /* renamed from: w */
    public String f100874w;
    @AbstractC27891c(mo46611a = "record_filter_names")

    /* renamed from: x */
    public String f100875x;
    @AbstractC27891c(mo46611a = "record_filter_values")

    /* renamed from: y */
    public String f100876y;
    @AbstractC27891c(mo46611a = "record_beauty_mob_param")

    /* renamed from: z */
    public BeautyMobParam f100877z;

    static {
        Covode.recordClassIndex(51424);
    }

    public C43222b() {
        this(null, null, null, null, null, false, false, null, false, null, null, null, false, -1, -1, -1, -1, 511, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43222b)) {
            return false;
        }
        C43222b bVar = (C43222b) obj;
        return this.f100767a == bVar.f100767a && this.f100820b == bVar.f100820b && C89219l.m154714a(this.f100854c, bVar.f100854c) && C89219l.m154714a(this.f100855d, bVar.f100855d) && this.f100856e == bVar.f100856e && C89219l.m154714a(this.f100857f, bVar.f100857f) && this.f100858g == bVar.f100858g && this.f100859h == bVar.f100859h && this.f100860i == bVar.f100860i && this.f100861j == bVar.f100861j && C89219l.m154714a(this.f100862k, bVar.f100862k) && C89219l.m154714a(this.f100863l, bVar.f100863l) && this.f100864m == bVar.f100864m && C89219l.m154714a(this.f100865n, bVar.f100865n) && C89219l.m154714a(this.f100866o, bVar.f100866o) && C89219l.m154714a(this.f100867p, bVar.f100867p) && C89219l.m154714a(this.f100868q, bVar.f100868q) && C89219l.m154714a(this.f100869r, bVar.f100869r) && C89219l.m154714a(this.f100870s, bVar.f100870s) && C89219l.m154714a(this.f100871t, bVar.f100871t) && C89219l.m154714a(this.f100872u, bVar.f100872u) && C89219l.m154714a(this.f100873v, bVar.f100873v) && C89219l.m154714a(this.f100874w, bVar.f100874w) && C89219l.m154714a(this.f100875x, bVar.f100875x) && C89219l.m154714a(this.f100876y, bVar.f100876y) && C89219l.m154714a(this.f100877z, bVar.f100877z) && C89219l.m154714a(this.f100741A, bVar.f100741A) && C89219l.m154714a(this.f100742B, bVar.f100742B) && C89219l.m154714a(this.f100743C, bVar.f100743C) && C89219l.m154714a(this.f100744D, bVar.f100744D) && C89219l.m154714a(this.f100745E, bVar.f100745E) && C89219l.m154714a(this.f100746F, bVar.f100746F) && this.f100747G == bVar.f100747G && C89219l.m154714a(this.f100748H, bVar.f100748H) && this.f100749I == bVar.f100749I && this.f100750J == bVar.f100750J && C89219l.m154714a(this.f100751K, bVar.f100751K) && C89219l.m154714a(this.f100752L, bVar.f100752L) && C89219l.m154714a(this.f100753M, bVar.f100753M) && C89219l.m154714a(this.f100754N, bVar.f100754N) && C89219l.m154714a(this.f100755O, bVar.f100755O) && C89219l.m154714a(this.f100756P, bVar.f100756P) && this.f100757Q == bVar.f100757Q && C89219l.m154714a(this.f100758R, bVar.f100758R) && C89219l.m154714a(this.f100759S, bVar.f100759S) && C89219l.m154714a(this.f100760T, bVar.f100760T) && C89219l.m154714a(this.f100761U, bVar.f100761U) && this.f100762V == bVar.f100762V && this.f100763W == bVar.f100763W && this.f100764X == bVar.f100764X && this.f100765Y == bVar.f100765Y && this.f100766Z == bVar.f100766Z && C89219l.m154714a(this.f100794aa, bVar.f100794aa) && C89219l.m154714a(this.f100795ab, bVar.f100795ab) && C89219l.m154714a(this.f100796ac, bVar.f100796ac) && C89219l.m154714a(this.f100797ad, bVar.f100797ad) && this.f100798ae == bVar.f100798ae && C89219l.m154714a(this.f100799af, bVar.f100799af) && C89219l.m154714a(this.f100800ag, bVar.f100800ag) && C89219l.m154714a(this.f100801ah, bVar.f100801ah) && C89219l.m154714a(this.f100802ai, bVar.f100802ai) && C89219l.m154714a(this.f100803aj, bVar.f100803aj) && this.f100804ak == bVar.f100804ak && C89219l.m154714a(this.f100805al, bVar.f100805al) && C89219l.m154714a(this.f100806am, bVar.f100806am) && C89219l.m154714a(this.f100807an, bVar.f100807an) && C89219l.m154714a(this.f100808ao, bVar.f100808ao) && C89219l.m154714a(this.f100809ap, bVar.f100809ap) && this.f100810aq == bVar.f100810aq && this.f100811ar == bVar.f100811ar && Float.compare(this.f100812as, bVar.f100812as) == 0 && C89219l.m154714a(this.f100813at, bVar.f100813at) && this.f100814au == bVar.f100814au && this.f100815av == bVar.f100815av && this.f100816aw == bVar.f100816aw && C89219l.m154714a(this.f100817ax, bVar.f100817ax) && this.f100818ay == bVar.f100818ay && C89219l.m154714a(this.f100819az, bVar.f100819az) && C89219l.m154714a(this.f100768aA, bVar.f100768aA) && C89219l.m154714a(this.f100769aB, bVar.f100769aB) && C89219l.m154714a(this.f100770aC, bVar.f100770aC) && C89219l.m154714a(this.f100771aD, bVar.f100771aD) && this.f100772aE == bVar.f100772aE && this.f100773aF == bVar.f100773aF && this.f100774aG == bVar.f100774aG && this.f100775aH == bVar.f100775aH && C89219l.m154714a(this.f100776aI, bVar.f100776aI) && C89219l.m154714a(this.f100777aJ, bVar.f100777aJ) && this.f100778aK == bVar.f100778aK && C89219l.m154714a(this.f100779aL, bVar.f100779aL) && C89219l.m154714a(this.f100780aM, bVar.f100780aM) && this.f100781aN == bVar.f100781aN && this.f100782aO == bVar.f100782aO && C89219l.m154714a(this.f100783aP, bVar.f100783aP) && C89219l.m154714a(this.f100784aQ, bVar.f100784aQ) && C89219l.m154714a(this.f100785aR, bVar.f100785aR) && C89219l.m154714a(this.f100786aS, bVar.f100786aS) && C89219l.m154714a(this.f100787aT, bVar.f100787aT) && C89219l.m154714a(this.f100788aU, bVar.f100788aU) && this.f100789aV == bVar.f100789aV && C89219l.m154714a(this.f100790aW, bVar.f100790aW) && C89219l.m154714a(this.f100791aX, bVar.f100791aX) && this.f100792aY == bVar.f100792aY && this.f100793aZ == bVar.f100793aZ && this.f100828ba == bVar.f100828ba && this.f100829bb == bVar.f100829bb && this.f100830bc == bVar.f100830bc && Float.compare(this.f100831bd, bVar.f100831bd) == 0 && C89219l.m154714a(this.f100832be, bVar.f100832be) && C89219l.m154714a(this.f100833bf, bVar.f100833bf) && C89219l.m154714a(this.f100834bg, bVar.f100834bg) && this.f100835bh == bVar.f100835bh && this.f100836bi == bVar.f100836bi && this.f100837bj == bVar.f100837bj && this.f100838bk == bVar.f100838bk && C89219l.m154714a(this.f100839bl, bVar.f100839bl) && C89219l.m154714a(this.f100840bm, bVar.f100840bm) && C89219l.m154714a(this.f100841bn, bVar.f100841bn) && C89219l.m154714a(this.f100842bo, bVar.f100842bo) && C89219l.m154714a(this.f100843bp, bVar.f100843bp) && C89219l.m154714a(this.f100844bq, bVar.f100844bq) && C89219l.m154714a(this.f100845br, bVar.f100845br) && this.f100846bs == bVar.f100846bs && C89219l.m154714a(this.f100847bt, bVar.f100847bt) && C89219l.m154714a(this.f100848bu, bVar.f100848bu) && C89219l.m154714a(this.f100849bv, bVar.f100849bv) && C89219l.m154714a(this.f100850bw, bVar.f100850bw) && C89219l.m154714a(this.f100851bx, bVar.f100851bx) && C89219l.m154714a(this.f100852by, bVar.f100852by) && this.f100853bz == bVar.f100853bz && this.f100821bA == bVar.f100821bA && C89219l.m154714a(this.f100822bB, bVar.f100822bB) && this.f100823bC == bVar.f100823bC && C89219l.m154714a(this.f100824bD, bVar.f100824bD) && C89219l.m154714a(this.f100825bE, bVar.f100825bE) && C89219l.m154714a(this.f100826bF, bVar.f100826bF) && this.f100827bG == bVar.f100827bG;
    }

    public final String toString() {
        return "AVDraftExtras(shootMode=" + this.f100767a + ", from=" + this.f100820b + ", creationId=" + this.f100854c + ", shootWay=" + this.f100855d + ", draftId=" + this.f100856e + ", newDraftId=" + this.f100857f + ", isMultiVideo=" + this.f100858g + ", durationMode=" + this.f100859h + ", recordMode=" + this.f100860i + ", gameScore=" + this.f100861j + ", reactionParams=" + this.f100862k + ", microAppId=" + this.f100863l + ", isMuted=" + this.f100864m + ", musicOrigin=" + this.f100865n + ", mainBusinessData=" + this.f100866o + ", socialData=" + this.f100867p + ", commerceData=" + this.f100868q + ", ugData=" + this.f100869r + ", techData=" + this.f100870s + ", globalData=" + this.f100871t + ", extractFramesModel=" + this.f100872u + ", filterId=" + this.f100873v + ", recordFilterIds=" + this.f100874w + ", recordFilterNames=" + this.f100875x + ", recordFilterValues=" + this.f100876y + ", recordBeautyMobParam=" + this.f100877z + ", selectedFilterId=" + this.f100741A + ", selectedFilterLabel=" + this.f100742B + ", selectedFilterValue=" + this.f100743C + ", uploadSaveModel=" + this.f100744D + ", infoStickerModel=" + this.f100745E + ", microAppInfo=" + this.f100746F + ", videoType=" + this.f100747G + ", texts=" + this.f100748H + ", usePaint=" + this.f100749I + ", commentSetting=" + this.f100750J + ", socialModel=" + this.f100751K + ", firstStickerMusicIds=" + this.f100752L + ", mvCreateVideoData=" + this.f100753M + ", statusCreateVideoData=" + this.f100754N + ", creativeFlowData=" + this.f100755O + ", avUploadMiscInfoStruct=" + this.f100756P + ", isFastImport=" + this.f100757Q + ", fastImportResolution=" + this.f100758R + ", draftVideoPath=" + this.f100759S + ", videoCoverPath=" + this.f100760T + ", draftCherEffectParam=" + this.f100761U + ", videoOutWidth=" + this.f100762V + ", videoOutHeight=" + this.f100763W + ", videoCanvasWidth=" + this.f100764X + ", videoCanvasHeight=" + this.f100765Y + ", musicEnd=" + this.f100766Z + ", draftVEAudioEffectParam=" + this.f100794aa + ", timeEffectStartPoint=" + this.f100795ab + ", filterLocalPath=" + this.f100796ac + ", cameraIds=" + this.f100797ad + ", beautyType=" + this.f100798ae + ", importVideoInfos=" + this.f100799af + ", stickerChallenge=" + this.f100800ag + ", textStickerChallenges=" + this.f100801ah + ", videoPartMetadata=" + this.f100802ai + ", audioRecorderParam=" + this.f100803aj + ", isStickPointMode=" + this.f100804ak + ", uploadPath=" + this.f100805al + ", previewConfigure=" + this.f100806am + ", videoSegmentsCopy=" + this.f100807an + ", previewInfo=" + this.f100808ao + ", previewVideoListCopy=" + this.f100809ap + ", videoCount=" + this.f100810aq + ", photoCount=" + this.f100811ar + ", filterIntensity=" + this.f100812as + ", pic2VideoSource=" + this.f100813at + ", downloadSetting=" + this.f100814au + ", useMusicBeforeEdit=" + this.f100815av + ", supportRetake=" + this.f100816aw + ", multiEditVideoData=" + this.f100817ax + ", containBackgroundVideo=" + this.f100818ay + ", stickPointData=" + this.f100819az + ", backgroundVideoDraftDir=" + this.f100768aA + ", stickerInfo=" + this.f100769aB + ", commentVideoModel=" + this.f100770aC + ", beautyMetadata=" + this.f100771aD + ", isUpdateInfoStickers=" + this.f100772aE + ", autoEnhanceOn=" + this.f100773aF + ", autoEnhanceType=" + this.f100774aG + ", stickPointType=" + this.f100775aH + ", duetLayout=" + this.f100776aI + ", stitchParams=" + this.f100777aJ + ", commerceMusic=" + this.f100778aK + ", greenScreenMaterials=" + this.f100779aL + ", cameraLensInfo=" + this.f100780aM + ", isPhotoMvMode=" + this.f100781aN + ", isDuetGreenSrceen=" + this.f100782aO + ", isSoundLoop=" + this.f100783aP + ", cutSameData=" + this.f100784aQ + ", coverPublishModel=" + this.f100785aR + ", geoFencingData=" + this.f100786aS + ", excludeUserList=" + this.f100787aT + ", shoutOutsData=" + this.f100788aU + ", allowRecommend=" + this.f100789aV + ", sharedARModel=" + this.f100790aW + ", messageBubbleTexts=" + this.f100791aX + ", isPhotoMvMusic=" + this.f100792aY + ", isPhotoMvMode1080p=" + this.f100793aZ + ", isDraftMusicIllegal=" + this.f100828ba + ", publishStage=" + this.f100829bb + ", audioAecDelayTime=" + this.f100830bc + ", currentZoomValue=" + this.f100831bd + ", multiEditVideoSize=" + this.f100832be + ", mentionTextList=" + this.f100833bf + ", hashTagTextList=" + this.f100834bg + ", shootedShootMode=" + this.f100835bh + ", duetFromDuetSticker=" + this.f100836bi + ", duetFromDuetButton=" + this.f100837bj + ", enableAutoCaption=" + this.f100838bk + ", duetExtraInfo=" + this.f100839bl + ", recordBgmDelay=" + this.f100840bm + ", selectedFilterResId=" + this.f100841bn + ", canvasVideoData=" + this.f100842bo + ", lighteningExtraInfo=" + this.f100843bp + ", loudnessParam=" + this.f100844bq + ", shootFrom=" + this.f100845br + ", saveDraftAppVersion=" + this.f100846bs + ", isWestWindowExistStr=" + this.f100847bt + ", qaStruct=" + this.f100848bu + ", tagUserList=" + this.f100849bv + ", autoAttachedAnchor=" + this.f100850bw + ", openplatformExtra=" + this.f100851bx + ", openplatformClientKey=" + this.f100852by + ", isAudioEnhance=" + this.f100853bz + ", editMusicSyncMode=" + this.f100821bA + ", cut2EditTransferModel=" + this.f100822bB + ", fileLengthFixed=" + this.f100823bC + ", sessionId=" + this.f100824bD + ", storyUploadModel=" + this.f100825bE + ", lastOutputVideoPath=" + this.f100826bF + ", isStoryDraft=" + this.f100827bG + ")";
    }

    private C43222b(String str, String str2, String str3, String str4, String str5, Integer num, String str6, C43233g gVar, List<DraftVideoSegment> list, EditPreviewInfo editPreviewInfo, List<? extends EditVideoSegment> list2, int i, int i2, float f, String str7, int i3, boolean z, boolean z2, MultiEditVideoStatusRecordData multiEditVideoStatusRecordData, boolean z3, C69790a aVar, String str8, StickerInfo stickerInfo, CommentVideoModel commentVideoModel, ArrayList<BeautyMetadata> arrayList, boolean z4, boolean z5, int i4, int i5, String str9, StitchParams stitchParams, boolean z6, ArrayList<GreenScreenMaterial> arrayList2, ArrayList<String> arrayList3, boolean z7, boolean z8, String str10, CutSameEditData cutSameEditData, CoverPublishModel coverPublishModel, List<String> list3, List<? extends User> list4, C74418d dVar, int i6, SharedARModel sharedARModel, List<String> list5, boolean z9, boolean z10, boolean z11, int i7, long j, float f2, Map<String, Long> map, List<String> list6, List<String> list7, int i8, int i9, int i10, int i11, DuetExtraInfo duetExtraInfo, Integer num2, String str11, CanvasVideoData canvasVideoData, LighteningExtraInfo lighteningExtraInfo, LoudnessBalanceParam loudnessBalanceParam, String str12, long j2, String str13, QaStruct qaStruct, ArrayList<InteractionTagUserInfo> arrayList4, C39053a aVar2, String str14, String str15, boolean z12, boolean z13, Cut2EditTransferModel cut2EditTransferModel, boolean z14, String str16, TTStoryUploadModel tTStoryUploadModel, String str17, boolean z15) {
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str7, "");
        C89219l.m154721d(duetExtraInfo, "");
        C89219l.m154721d(str13, "");
        this.f100767a = 0;
        this.f100820b = 3;
        this.f100854c = str;
        this.f100855d = str2;
        this.f100856e = 0;
        this.f100857f = str3;
        this.f100858g = false;
        this.f100859h = false;
        this.f100860i = 0;
        this.f100861j = 0;
        this.f100862k = null;
        this.f100863l = null;
        this.f100864m = false;
        this.f100865n = str4;
        this.f100866o = null;
        this.f100867p = null;
        this.f100868q = null;
        this.f100869r = null;
        this.f100870s = null;
        this.f100871t = null;
        this.f100872u = null;
        this.f100873v = null;
        this.f100874w = null;
        this.f100875x = null;
        this.f100876y = null;
        this.f100877z = null;
        this.f100741A = null;
        this.f100742B = null;
        this.f100743C = null;
        this.f100744D = null;
        this.f100745E = null;
        this.f100746F = null;
        this.f100747G = 0;
        this.f100748H = null;
        this.f100749I = false;
        this.f100750J = 0;
        this.f100751K = null;
        this.f100752L = null;
        this.f100753M = null;
        this.f100754N = null;
        this.f100755O = null;
        this.f100756P = null;
        this.f100757Q = false;
        this.f100758R = str5;
        this.f100759S = null;
        this.f100760T = null;
        this.f100761U = null;
        this.f100762V = 0;
        this.f100763W = 0;
        this.f100764X = 0;
        this.f100765Y = 0;
        this.f100766Z = 0;
        this.f100794aa = null;
        this.f100795ab = num;
        this.f100796ac = null;
        this.f100797ad = null;
        this.f100798ae = -1;
        this.f100799af = null;
        this.f100800ag = null;
        this.f100801ah = null;
        this.f100802ai = null;
        this.f100803aj = null;
        this.f100804ak = false;
        this.f100805al = null;
        this.f100806am = null;
        this.f100807an = null;
        this.f100808ao = null;
        this.f100809ap = null;
        this.f100810aq = 0;
        this.f100811ar = 0;
        this.f100812as = -1.0f;
        this.f100813at = str7;
        this.f100814au = 0;
        this.f100815av = false;
        this.f100816aw = true;
        this.f100817ax = null;
        this.f100818ay = false;
        this.f100819az = null;
        this.f100768aA = null;
        this.f100769aB = null;
        this.f100770aC = null;
        this.f100771aD = null;
        this.f100772aE = true;
        this.f100773aF = false;
        this.f100774aG = 0;
        this.f100775aH = 0;
        this.f100776aI = null;
        this.f100777aJ = null;
        this.f100778aK = false;
        this.f100779aL = null;
        this.f100780aM = null;
        this.f100781aN = false;
        this.f100782aO = false;
        this.f100783aP = null;
        this.f100784aQ = null;
        this.f100785aR = null;
        this.f100786aS = null;
        this.f100787aT = null;
        this.f100788aU = null;
        this.f100789aV = 0;
        this.f100790aW = null;
        this.f100791aX = null;
        this.f100792aY = false;
        this.f100793aZ = false;
        this.f100828ba = false;
        this.f100829bb = 0;
        this.f100830bc = 0;
        this.f100831bd = -1.0f;
        this.f100832be = null;
        this.f100833bf = null;
        this.f100834bg = null;
        this.f100835bh = -1;
        this.f100836bi = 0;
        this.f100837bj = 0;
        this.f100838bk = 0;
        this.f100839bl = duetExtraInfo;
        this.f100840bm = num2;
        this.f100841bn = null;
        this.f100842bo = null;
        this.f100843bp = null;
        this.f100844bq = loudnessBalanceParam;
        this.f100845br = str12;
        this.f100846bs = 0;
        this.f100847bt = str13;
        this.f100848bu = null;
        this.f100849bv = null;
        this.f100850bw = null;
        this.f100851bx = str14;
        this.f100852by = str15;
        this.f100853bz = false;
        this.f100821bA = false;
        this.f100822bB = null;
        this.f100823bC = false;
        this.f100824bD = null;
        this.f100825bE = null;
        this.f100826bF = null;
        this.f100827bG = false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i40;
        int i41;
        int i42;
        int i43;
        int i44;
        int i45;
        int i46;
        int i47;
        int i48;
        int i49;
        int i50;
        int i51;
        int i52;
        int i53;
        int i54;
        int i55;
        int i56;
        int i57;
        int i58;
        int i59;
        int i60;
        int i61;
        int i62;
        int i63;
        int i64;
        int i65;
        int i66;
        int i67;
        int i68;
        int i69;
        int i70;
        int i71;
        int i72;
        int i73;
        int i74;
        int i75;
        int i76;
        int i77;
        int i78;
        int i79;
        int i80;
        int i81;
        int i82;
        int i83;
        int i84;
        int i85;
        int i86;
        int i87;
        int i88 = ((this.f100767a * 31) + this.f100820b) * 31;
        String str = this.f100854c;
        int i89 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i90 = (i88 + i) * 31;
        String str2 = this.f100855d;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i91 = (((i90 + i2) * 31) + this.f100856e) * 31;
        String str3 = this.f100857f;
        if (str3 != null) {
            i3 = str3.hashCode();
        } else {
            i3 = 0;
        }
        int i92 = (i91 + i3) * 31;
        boolean z = this.f100858g;
        int i93 = 1;
        if (z) {
            z = true;
        }
        int i94 = z ? 1 : 0;
        int i95 = z ? 1 : 0;
        int i96 = z ? 1 : 0;
        int i97 = (i92 + i94) * 31;
        boolean z2 = this.f100859h;
        if (z2) {
            z2 = true;
        }
        int i98 = z2 ? 1 : 0;
        int i99 = z2 ? 1 : 0;
        int i100 = z2 ? 1 : 0;
        int i101 = (((((i97 + i98) * 31) + this.f100860i) * 31) + this.f100861j) * 31;
        ReactionParams reactionParams = this.f100862k;
        if (reactionParams != null) {
            i4 = reactionParams.hashCode();
        } else {
            i4 = 0;
        }
        int i102 = (i101 + i4) * 31;
        String str4 = this.f100863l;
        if (str4 != null) {
            i5 = str4.hashCode();
        } else {
            i5 = 0;
        }
        int i103 = (i102 + i5) * 31;
        boolean z3 = this.f100864m;
        if (z3) {
            z3 = true;
        }
        int i104 = z3 ? 1 : 0;
        int i105 = z3 ? 1 : 0;
        int i106 = z3 ? 1 : 0;
        int i107 = (i103 + i104) * 31;
        String str5 = this.f100865n;
        if (str5 != null) {
            i6 = str5.hashCode();
        } else {
            i6 = 0;
        }
        int i108 = (i107 + i6) * 31;
        String str6 = this.f100866o;
        if (str6 != null) {
            i7 = str6.hashCode();
        } else {
            i7 = 0;
        }
        int i109 = (i108 + i7) * 31;
        String str7 = this.f100867p;
        if (str7 != null) {
            i8 = str7.hashCode();
        } else {
            i8 = 0;
        }
        int i110 = (i109 + i8) * 31;
        String str8 = this.f100868q;
        if (str8 != null) {
            i9 = str8.hashCode();
        } else {
            i9 = 0;
        }
        int i111 = (i110 + i9) * 31;
        String str9 = this.f100869r;
        if (str9 != null) {
            i10 = str9.hashCode();
        } else {
            i10 = 0;
        }
        int i112 = (i111 + i10) * 31;
        String str10 = this.f100870s;
        if (str10 != null) {
            i11 = str10.hashCode();
        } else {
            i11 = 0;
        }
        int i113 = (i112 + i11) * 31;
        String str11 = this.f100871t;
        if (str11 != null) {
            i12 = str11.hashCode();
        } else {
            i12 = 0;
        }
        int i114 = (i113 + i12) * 31;
        ExtractFramesModel extractFramesModel = this.f100872u;
        if (extractFramesModel != null) {
            i13 = extractFramesModel.hashCode();
        } else {
            i13 = 0;
        }
        int i115 = (i114 + i13) * 31;
        String str12 = this.f100873v;
        if (str12 != null) {
            i14 = str12.hashCode();
        } else {
            i14 = 0;
        }
        int i116 = (i115 + i14) * 31;
        String str13 = this.f100874w;
        if (str13 != null) {
            i15 = str13.hashCode();
        } else {
            i15 = 0;
        }
        int i117 = (i116 + i15) * 31;
        String str14 = this.f100875x;
        if (str14 != null) {
            i16 = str14.hashCode();
        } else {
            i16 = 0;
        }
        int i118 = (i117 + i16) * 31;
        String str15 = this.f100876y;
        if (str15 != null) {
            i17 = str15.hashCode();
        } else {
            i17 = 0;
        }
        int i119 = (i118 + i17) * 31;
        BeautyMobParam beautyMobParam = this.f100877z;
        if (beautyMobParam != null) {
            i18 = beautyMobParam.hashCode();
        } else {
            i18 = 0;
        }
        int i120 = (i119 + i18) * 31;
        String str16 = this.f100741A;
        if (str16 != null) {
            i19 = str16.hashCode();
        } else {
            i19 = 0;
        }
        int i121 = (i120 + i19) * 31;
        String str17 = this.f100742B;
        if (str17 != null) {
            i20 = str17.hashCode();
        } else {
            i20 = 0;
        }
        int i122 = (i121 + i20) * 31;
        String str18 = this.f100743C;
        if (str18 != null) {
            i21 = str18.hashCode();
        } else {
            i21 = 0;
        }
        int i123 = (i122 + i21) * 31;
        AVUploadSaveModel aVUploadSaveModel = this.f100744D;
        if (aVUploadSaveModel != null) {
            i22 = aVUploadSaveModel.hashCode();
        } else {
            i22 = 0;
        }
        int i124 = (i123 + i22) * 31;
        InfoStickerModel infoStickerModel = this.f100745E;
        if (infoStickerModel != null) {
            i23 = infoStickerModel.hashCode();
        } else {
            i23 = 0;
        }
        int i125 = (i124 + i23) * 31;
        C71518t tVar = this.f100746F;
        if (tVar != null) {
            i24 = tVar.hashCode();
        } else {
            i24 = 0;
        }
        int i126 = (((i125 + i24) * 31) + this.f100747G) * 31;
        List<String> list = this.f100748H;
        if (list != null) {
            i25 = list.hashCode();
        } else {
            i25 = 0;
        }
        int i127 = (i126 + i25) * 31;
        boolean z4 = this.f100749I;
        if (z4) {
            z4 = true;
        }
        int i128 = z4 ? 1 : 0;
        int i129 = z4 ? 1 : 0;
        int i130 = z4 ? 1 : 0;
        int i131 = (((i127 + i128) * 31) + this.f100750J) * 31;
        SocialModel socialModel = this.f100751K;
        if (socialModel != null) {
            i26 = socialModel.hashCode();
        } else {
            i26 = 0;
        }
        int i132 = (i131 + i26) * 31;
        String str19 = this.f100752L;
        if (str19 != null) {
            i27 = str19.hashCode();
        } else {
            i27 = 0;
        }
        int i133 = (i132 + i27) * 31;
        C61288d dVar = this.f100753M;
        if (dVar != null) {
            i28 = dVar.hashCode();
        } else {
            i28 = 0;
        }
        int i134 = (i133 + i28) * 31;
        StatusCreateVideoData statusCreateVideoData = this.f100754N;
        if (statusCreateVideoData != null) {
            i29 = statusCreateVideoData.hashCode();
        } else {
            i29 = 0;
        }
        int i135 = (i134 + i29) * 31;
        CreativeFlowData creativeFlowData = this.f100755O;
        if (creativeFlowData != null) {
            i30 = creativeFlowData.hashCode();
        } else {
            i30 = 0;
        }
        int i136 = (i135 + i30) * 31;
        C71872i iVar = this.f100756P;
        if (iVar != null) {
            i31 = iVar.hashCode();
        } else {
            i31 = 0;
        }
        int i137 = (i136 + i31) * 31;
        boolean z5 = this.f100757Q;
        if (z5) {
            z5 = true;
        }
        int i138 = z5 ? 1 : 0;
        int i139 = z5 ? 1 : 0;
        int i140 = z5 ? 1 : 0;
        int i141 = (i137 + i138) * 31;
        String str20 = this.f100758R;
        if (str20 != null) {
            i32 = str20.hashCode();
        } else {
            i32 = 0;
        }
        int i142 = (i141 + i32) * 31;
        String str21 = this.f100759S;
        if (str21 != null) {
            i33 = str21.hashCode();
        } else {
            i33 = 0;
        }
        int i143 = (i142 + i33) * 31;
        String str22 = this.f100760T;
        if (str22 != null) {
            i34 = str22.hashCode();
        } else {
            i34 = 0;
        }
        int i144 = (i143 + i34) * 31;
        C43231e eVar = this.f100761U;
        if (eVar != null) {
            i35 = eVar.hashCode();
        } else {
            i35 = 0;
        }
        int i145 = (((((((((((i144 + i35) * 31) + this.f100762V) * 31) + this.f100763W) * 31) + this.f100764X) * 31) + this.f100765Y) * 31) + this.f100766Z) * 31;
        C43235i iVar2 = this.f100794aa;
        if (iVar2 != null) {
            i36 = iVar2.hashCode();
        } else {
            i36 = 0;
        }
        int i146 = (i145 + i36) * 31;
        Integer num = this.f100795ab;
        if (num != null) {
            i37 = num.hashCode();
        } else {
            i37 = 0;
        }
        int i147 = (i146 + i37) * 31;
        String str23 = this.f100796ac;
        if (str23 != null) {
            i38 = str23.hashCode();
        } else {
            i38 = 0;
        }
        int i148 = (i147 + i38) * 31;
        String str24 = this.f100797ad;
        if (str24 != null) {
            i39 = str24.hashCode();
        } else {
            i39 = 0;
        }
        int i149 = (((i148 + i39) * 31) + this.f100798ae) * 31;
        ArrayList<ImportVideoInfo> arrayList = this.f100799af;
        if (arrayList != null) {
            i40 = arrayList.hashCode();
        } else {
            i40 = 0;
        }
        int i150 = (i149 + i40) * 31;
        StickerChallenge stickerChallenge = this.f100800ag;
        if (stickerChallenge != null) {
            i41 = stickerChallenge.hashCode();
        } else {
            i41 = 0;
        }
        int i151 = (i150 + i41) * 31;
        TextStickerChallenges textStickerChallenges = this.f100801ah;
        if (textStickerChallenges != null) {
            i42 = textStickerChallenges.hashCode();
        } else {
            i42 = 0;
        }
        int i152 = (i151 + i42) * 31;
        Map<String, ? extends Object> map = this.f100802ai;
        if (map != null) {
            i43 = map.hashCode();
        } else {
            i43 = 0;
        }
        int i153 = (i152 + i43) * 31;
        AudioRecorderParam audioRecorderParam = this.f100803aj;
        if (audioRecorderParam != null) {
            i44 = audioRecorderParam.hashCode();
        } else {
            i44 = 0;
        }
        int i154 = (i153 + i44) * 31;
        boolean z6 = this.f100804ak;
        if (z6) {
            z6 = true;
        }
        int i155 = z6 ? 1 : 0;
        int i156 = z6 ? 1 : 0;
        int i157 = z6 ? 1 : 0;
        int i158 = (i154 + i155) * 31;
        String str25 = this.f100805al;
        if (str25 != null) {
            i45 = str25.hashCode();
        } else {
            i45 = 0;
        }
        int i159 = (i158 + i45) * 31;
        C43233g gVar = this.f100806am;
        if (gVar != null) {
            i46 = gVar.hashCode();
        } else {
            i46 = 0;
        }
        int i160 = (i159 + i46) * 31;
        List<DraftVideoSegment> list2 = this.f100807an;
        if (list2 != null) {
            i47 = list2.hashCode();
        } else {
            i47 = 0;
        }
        int i161 = (i160 + i47) * 31;
        EditPreviewInfo editPreviewInfo = this.f100808ao;
        if (editPreviewInfo != null) {
            i48 = editPreviewInfo.hashCode();
        } else {
            i48 = 0;
        }
        int i162 = (i161 + i48) * 31;
        List<? extends EditVideoSegment> list3 = this.f100809ap;
        if (list3 != null) {
            i49 = list3.hashCode();
        } else {
            i49 = 0;
        }
        int floatToIntBits = (((((((i162 + i49) * 31) + this.f100810aq) * 31) + this.f100811ar) * 31) + Float.floatToIntBits(this.f100812as)) * 31;
        String str26 = this.f100813at;
        if (str26 != null) {
            i50 = str26.hashCode();
        } else {
            i50 = 0;
        }
        int i163 = (((floatToIntBits + i50) * 31) + this.f100814au) * 31;
        boolean z7 = this.f100815av;
        if (z7) {
            z7 = true;
        }
        int i164 = z7 ? 1 : 0;
        int i165 = z7 ? 1 : 0;
        int i166 = z7 ? 1 : 0;
        int i167 = (i163 + i164) * 31;
        boolean z8 = this.f100816aw;
        if (z8) {
            z8 = true;
        }
        int i168 = z8 ? 1 : 0;
        int i169 = z8 ? 1 : 0;
        int i170 = z8 ? 1 : 0;
        int i171 = (i167 + i168) * 31;
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = this.f100817ax;
        if (multiEditVideoStatusRecordData != null) {
            i51 = multiEditVideoStatusRecordData.hashCode();
        } else {
            i51 = 0;
        }
        int i172 = (i171 + i51) * 31;
        boolean z9 = this.f100818ay;
        if (z9) {
            z9 = true;
        }
        int i173 = z9 ? 1 : 0;
        int i174 = z9 ? 1 : 0;
        int i175 = z9 ? 1 : 0;
        int i176 = (i172 + i173) * 31;
        C69790a aVar = this.f100819az;
        if (aVar != null) {
            i52 = aVar.hashCode();
        } else {
            i52 = 0;
        }
        int i177 = (i176 + i52) * 31;
        String str27 = this.f100768aA;
        if (str27 != null) {
            i53 = str27.hashCode();
        } else {
            i53 = 0;
        }
        int i178 = (i177 + i53) * 31;
        StickerInfo stickerInfo = this.f100769aB;
        if (stickerInfo != null) {
            i54 = stickerInfo.hashCode();
        } else {
            i54 = 0;
        }
        int i179 = (i178 + i54) * 31;
        CommentVideoModel commentVideoModel = this.f100770aC;
        if (commentVideoModel != null) {
            i55 = commentVideoModel.hashCode();
        } else {
            i55 = 0;
        }
        int i180 = (i179 + i55) * 31;
        ArrayList<BeautyMetadata> arrayList2 = this.f100771aD;
        if (arrayList2 != null) {
            i56 = arrayList2.hashCode();
        } else {
            i56 = 0;
        }
        int i181 = (i180 + i56) * 31;
        boolean z10 = this.f100772aE;
        if (z10) {
            z10 = true;
        }
        int i182 = z10 ? 1 : 0;
        int i183 = z10 ? 1 : 0;
        int i184 = z10 ? 1 : 0;
        int i185 = (i181 + i182) * 31;
        boolean z11 = this.f100773aF;
        if (z11) {
            z11 = true;
        }
        int i186 = z11 ? 1 : 0;
        int i187 = z11 ? 1 : 0;
        int i188 = z11 ? 1 : 0;
        int i189 = (((((i185 + i186) * 31) + this.f100774aG) * 31) + this.f100775aH) * 31;
        String str28 = this.f100776aI;
        if (str28 != null) {
            i57 = str28.hashCode();
        } else {
            i57 = 0;
        }
        int i190 = (i189 + i57) * 31;
        StitchParams stitchParams = this.f100777aJ;
        if (stitchParams != null) {
            i58 = stitchParams.hashCode();
        } else {
            i58 = 0;
        }
        int i191 = (i190 + i58) * 31;
        boolean z12 = this.f100778aK;
        if (z12) {
            z12 = true;
        }
        int i192 = z12 ? 1 : 0;
        int i193 = z12 ? 1 : 0;
        int i194 = z12 ? 1 : 0;
        int i195 = (i191 + i192) * 31;
        ArrayList<GreenScreenMaterial> arrayList3 = this.f100779aL;
        if (arrayList3 != null) {
            i59 = arrayList3.hashCode();
        } else {
            i59 = 0;
        }
        int i196 = (i195 + i59) * 31;
        ArrayList<String> arrayList4 = this.f100780aM;
        if (arrayList4 != null) {
            i60 = arrayList4.hashCode();
        } else {
            i60 = 0;
        }
        int i197 = (i196 + i60) * 31;
        boolean z13 = this.f100781aN;
        if (z13) {
            z13 = true;
        }
        int i198 = z13 ? 1 : 0;
        int i199 = z13 ? 1 : 0;
        int i200 = z13 ? 1 : 0;
        int i201 = (i197 + i198) * 31;
        boolean z14 = this.f100782aO;
        if (z14) {
            z14 = true;
        }
        int i202 = z14 ? 1 : 0;
        int i203 = z14 ? 1 : 0;
        int i204 = z14 ? 1 : 0;
        int i205 = (i201 + i202) * 31;
        String str29 = this.f100783aP;
        if (str29 != null) {
            i61 = str29.hashCode();
        } else {
            i61 = 0;
        }
        int i206 = (i205 + i61) * 31;
        CutSameEditData cutSameEditData = this.f100784aQ;
        if (cutSameEditData != null) {
            i62 = cutSameEditData.hashCode();
        } else {
            i62 = 0;
        }
        int i207 = (i206 + i62) * 31;
        CoverPublishModel coverPublishModel = this.f100785aR;
        if (coverPublishModel != null) {
            i63 = coverPublishModel.hashCode();
        } else {
            i63 = 0;
        }
        int i208 = (i207 + i63) * 31;
        List<String> list4 = this.f100786aS;
        if (list4 != null) {
            i64 = list4.hashCode();
        } else {
            i64 = 0;
        }
        int i209 = (i208 + i64) * 31;
        List<? extends User> list5 = this.f100787aT;
        if (list5 != null) {
            i65 = list5.hashCode();
        } else {
            i65 = 0;
        }
        int i210 = (i209 + i65) * 31;
        C74418d dVar2 = this.f100788aU;
        if (dVar2 != null) {
            i66 = dVar2.hashCode();
        } else {
            i66 = 0;
        }
        int i211 = (((i210 + i66) * 31) + this.f100789aV) * 31;
        SharedARModel sharedARModel = this.f100790aW;
        if (sharedARModel != null) {
            i67 = sharedARModel.hashCode();
        } else {
            i67 = 0;
        }
        int i212 = (i211 + i67) * 31;
        List<String> list6 = this.f100791aX;
        if (list6 != null) {
            i68 = list6.hashCode();
        } else {
            i68 = 0;
        }
        int i213 = (i212 + i68) * 31;
        boolean z15 = this.f100792aY;
        if (z15) {
            z15 = true;
        }
        int i214 = z15 ? 1 : 0;
        int i215 = z15 ? 1 : 0;
        int i216 = z15 ? 1 : 0;
        int i217 = (i213 + i214) * 31;
        boolean z16 = this.f100793aZ;
        if (z16) {
            z16 = true;
        }
        int i218 = z16 ? 1 : 0;
        int i219 = z16 ? 1 : 0;
        int i220 = z16 ? 1 : 0;
        int i221 = (i217 + i218) * 31;
        boolean z17 = this.f100828ba;
        if (z17) {
            z17 = true;
        }
        int i222 = z17 ? 1 : 0;
        int i223 = z17 ? 1 : 0;
        int i224 = z17 ? 1 : 0;
        long j = this.f100830bc;
        int floatToIntBits2 = (((((((i221 + i222) * 31) + this.f100829bb) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + Float.floatToIntBits(this.f100831bd)) * 31;
        Map<String, Long> map2 = this.f100832be;
        if (map2 != null) {
            i69 = map2.hashCode();
        } else {
            i69 = 0;
        }
        int i225 = (floatToIntBits2 + i69) * 31;
        List<String> list7 = this.f100833bf;
        if (list7 != null) {
            i70 = list7.hashCode();
        } else {
            i70 = 0;
        }
        int i226 = (i225 + i70) * 31;
        List<String> list8 = this.f100834bg;
        if (list8 != null) {
            i71 = list8.hashCode();
        } else {
            i71 = 0;
        }
        int i227 = (((((((((i226 + i71) * 31) + this.f100835bh) * 31) + this.f100836bi) * 31) + this.f100837bj) * 31) + this.f100838bk) * 31;
        DuetExtraInfo duetExtraInfo = this.f100839bl;
        if (duetExtraInfo != null) {
            i72 = duetExtraInfo.hashCode();
        } else {
            i72 = 0;
        }
        int i228 = (i227 + i72) * 31;
        Integer num2 = this.f100840bm;
        if (num2 != null) {
            i73 = num2.hashCode();
        } else {
            i73 = 0;
        }
        int i229 = (i228 + i73) * 31;
        String str30 = this.f100841bn;
        if (str30 != null) {
            i74 = str30.hashCode();
        } else {
            i74 = 0;
        }
        int i230 = (i229 + i74) * 31;
        CanvasVideoData canvasVideoData = this.f100842bo;
        if (canvasVideoData != null) {
            i75 = canvasVideoData.hashCode();
        } else {
            i75 = 0;
        }
        int i231 = (i230 + i75) * 31;
        LighteningExtraInfo lighteningExtraInfo = this.f100843bp;
        if (lighteningExtraInfo != null) {
            i76 = lighteningExtraInfo.hashCode();
        } else {
            i76 = 0;
        }
        int i232 = (i231 + i76) * 31;
        LoudnessBalanceParam loudnessBalanceParam = this.f100844bq;
        if (loudnessBalanceParam != null) {
            i77 = loudnessBalanceParam.hashCode();
        } else {
            i77 = 0;
        }
        int i233 = (i232 + i77) * 31;
        String str31 = this.f100845br;
        if (str31 != null) {
            i78 = str31.hashCode();
        } else {
            i78 = 0;
        }
        long j2 = this.f100846bs;
        int i234 = (((i233 + i78) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str32 = this.f100847bt;
        if (str32 != null) {
            i79 = str32.hashCode();
        } else {
            i79 = 0;
        }
        int i235 = (i234 + i79) * 31;
        QaStruct qaStruct = this.f100848bu;
        if (qaStruct != null) {
            i80 = qaStruct.hashCode();
        } else {
            i80 = 0;
        }
        int i236 = (i235 + i80) * 31;
        ArrayList<InteractionTagUserInfo> arrayList5 = this.f100849bv;
        if (arrayList5 != null) {
            i81 = arrayList5.hashCode();
        } else {
            i81 = 0;
        }
        int i237 = (i236 + i81) * 31;
        C39053a aVar2 = this.f100850bw;
        if (aVar2 != null) {
            i82 = aVar2.hashCode();
        } else {
            i82 = 0;
        }
        int i238 = (i237 + i82) * 31;
        String str33 = this.f100851bx;
        if (str33 != null) {
            i83 = str33.hashCode();
        } else {
            i83 = 0;
        }
        int i239 = (i238 + i83) * 31;
        String str34 = this.f100852by;
        if (str34 != null) {
            i84 = str34.hashCode();
        } else {
            i84 = 0;
        }
        int i240 = (i239 + i84) * 31;
        boolean z18 = this.f100853bz;
        if (z18) {
            z18 = true;
        }
        int i241 = z18 ? 1 : 0;
        int i242 = z18 ? 1 : 0;
        int i243 = z18 ? 1 : 0;
        int i244 = (i240 + i241) * 31;
        boolean z19 = this.f100821bA;
        if (z19) {
            z19 = true;
        }
        int i245 = z19 ? 1 : 0;
        int i246 = z19 ? 1 : 0;
        int i247 = z19 ? 1 : 0;
        int i248 = (i244 + i245) * 31;
        Cut2EditTransferModel cut2EditTransferModel = this.f100822bB;
        if (cut2EditTransferModel != null) {
            i85 = cut2EditTransferModel.hashCode();
        } else {
            i85 = 0;
        }
        int i249 = (i248 + i85) * 31;
        boolean z20 = this.f100823bC;
        if (z20) {
            z20 = true;
        }
        int i250 = z20 ? 1 : 0;
        int i251 = z20 ? 1 : 0;
        int i252 = z20 ? 1 : 0;
        int i253 = (i249 + i250) * 31;
        String str35 = this.f100824bD;
        if (str35 != null) {
            i86 = str35.hashCode();
        } else {
            i86 = 0;
        }
        int i254 = (i253 + i86) * 31;
        TTStoryUploadModel tTStoryUploadModel = this.f100825bE;
        if (tTStoryUploadModel != null) {
            i87 = tTStoryUploadModel.hashCode();
        } else {
            i87 = 0;
        }
        int i255 = (i254 + i87) * 31;
        String str36 = this.f100826bF;
        if (str36 != null) {
            i89 = str36.hashCode();
        }
        int i256 = (i255 + i89) * 31;
        if (!this.f100827bG) {
            i93 = 0;
        }
        return i256 + i93;
    }

    /* renamed from: a */
    public final void mo73614a(DuetExtraInfo duetExtraInfo) {
        C89219l.m154721d(duetExtraInfo, "");
        this.f100839bl = duetExtraInfo;
    }

    public /* synthetic */ C43222b(QaStruct qaStruct, ArrayList arrayList, C39053a aVar, String str, String str2, boolean z, boolean z2, Cut2EditTransferModel cut2EditTransferModel, boolean z3, String str3, TTStoryUploadModel tTStoryUploadModel, String str4, boolean z4, int i, int i2, int i3, int i4, int i5, C89214g gVar) {
        this(UUID.randomUUID().toString(), "", "", "original", "720*1280", 0, null, null, null, null, null, 0, 0, -1.0f, "", 0, false, true, null, false, null, null, null, null, null, true, false, 0, 0, null, null, false, null, null, false, false, null, null, null, null, null, null, 0, null, null, false, false, false, 0, 0, -1.0f, null, null, null, -1, 0, 0, 0, new DuetExtraInfo(null, null, 0, 0, null, 0, 63, null), 0, null, null, null, new LoudnessBalanceParam(0.0d, 0.0d, 0.0d, 7, null), "", 0, "", null, null, null, "", "", false, false, null, false, null, null, null, false);
    }
}
