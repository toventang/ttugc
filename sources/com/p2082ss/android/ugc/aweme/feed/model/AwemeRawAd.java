package com.p2082ss.android.ugc.aweme.feed.model;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.p1270b.C18141a;
import com.google.gson.C27910f;
import com.google.gson.p2018a.AbstractC27889a;
import com.google.gson.p2018a.AbstractC27890b;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.commercialize.feed.p2565c.C37892a;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38211a;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38212aa;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38217ae;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38220ag;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38222ai;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38227am;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38231b;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38232c;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38240i;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38241j;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38242k;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38243l;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38244m;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38255s;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38259w;
import com.p2082ss.android.ugc.aweme.discover.model.Position;
import com.p2082ss.android.ugc.aweme.feed.model.search.AwemeSearchAdModel;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.utils.C80365dx;
import com.p2082ss.android.ugc.aweme.utils.C80582ip;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.feed.model.AwemeRawAd */
public class AwemeRawAd extends C18141a implements Serializable {
    @AbstractC27891c(mo46611a = "action_extra")
    public String actionExtra;
    @AbstractC27891c(mo46611a = "show_special_avatar_style")
    private int adAvatarLinkTagStyle = 0;
    @AbstractC27891c(mo46611a = "dislike")
    private C38232c adDislikeModel;
    @AbstractC27891c(mo46611a = "hint_data")
    private C38240i adHintData;
    @AbstractC27891c(mo46611a = "ad_id")
    Long adId;
    @AbstractC27891c(mo46611a = "interaction_data")
    AdInteractionData adInteractionData;
    @AbstractC27891c(mo46611a = "live")
    private AdLive adLive;
    @AbstractC27891c(mo46611a = "ad_more_textual")
    private String adMoreTextual;
    @AbstractC27891c(mo46611a = "play_node_track_url")
    List<C38242k> adNodeTrackUrlList;
    @AbstractC27891c(mo46611a = "ad_questionnaire")
    C38243l adQuestionnaire;
    @AbstractC27891c(mo46611a = "ad_source_type")
    private int adSourceType;
    @AbstractC27891c(mo46611a = "ad_tag_position")
    private int adTagPosition;
    @AbstractC27891c(mo46611a = "top_icon_list")
    UrlModel adTopIcon;
    @AbstractC27891c(mo46611a = "ad_type")
    int adType;
    @AbstractC27891c(mo46611a = "advertiser_id")
    private String advId;
    @AbstractC27891c(mo46611a = "aggregation_sdk")
    AggregationSdk aggregationSdk;
    @AbstractC27891c(mo46611a = "allow_dsp_autojump")
    private boolean allowDspAutoJump;
    @AbstractC27891c(mo46611a = "anchor_click_type")
    private int anchorClickType;
    @AbstractC27891c(mo46611a = "animation_type")
    private int animationType;
    @AbstractC27891c(mo46611a = "app_category")
    String appCategory;
    @AbstractC27891c(mo46611a = "app_data")
    private String appData;
    @AbstractC27891c(mo46611a = "app_install")
    String appInstall = "";
    @AbstractC27891c(mo46611a = "app_like")
    String appLike;
    @AbstractC27891c(mo46611a = "app_name")
    String appName = "";
    @AbstractC27891c(mo46611a = "author_url")
    private String authorUrl;
    @AbstractC27891c(mo46611a = "avatar_icon")
    UrlModel avatarIcon;
    @AbstractC27891c(mo46611a = "background_color")
    private String backgroundColor;
    @AbstractC27891c(mo46611a = "live_icon_url")
    private UrlModel bottomIcon;
    @AbstractC27891c(mo46611a = "button_icon_url")
    String buttonIcon;
    @AbstractC27891c(mo46611a = "button_icon_animation_repeat_times")
    private int buttonIconAnimationRepeatTimes = 0;
    @AbstractC27891c(mo46611a = "button_style")
    int buttonStyle;
    @AbstractC27891c(mo46611a = "button_text")
    String buttonText;
    @AbstractC27891c(mo46611a = "call_to_action_bar")
    private CallToActionBarInfo callToActionBarInfo;
    @AbstractC27891c(mo46611a = "card_infos")
    Map<String, CardStruct> cardInfos;
    @AbstractC27891c(mo46611a = "card_interaction_seconds")
    private int cardInteractionSeconds;
    @AbstractC27891c(mo46611a = "card_interaction_type")
    private int cardInteractionType;
    @AbstractC27889a(mo46607a = false, mo46608b = false)
    boolean cardOnceClick;
    @AbstractC27891c(mo46611a = "web_channel_name")
    private String channelName;
    @AbstractC27891c(mo46611a = "charge_type")
    private int charge_type;
    @AbstractC27891c(mo46611a = "click_track_url_list")
    UrlModel clickTrackUrlList;
    @AbstractC27891c(mo46611a = "comment_area")
    private C38255s commentArea;
    @AbstractC27891c(mo46611a = "comment_area_switch")
    private boolean commentAreaSwitch;
    @AbstractC27890b(mo46609a = C80365dx.class)
    @AbstractC27891c(mo46611a = "comment_extra")
    private String commentExtra;
    @AbstractC27891c(mo46611a = "component_type")
    private int componentType;
    @AbstractC27891c(mo46611a = "consult_url")
    String consultUrl;
    @AbstractC27891c(mo46611a = "context_track_url_list")
    private UrlModel contextTrack;
    private transient boolean contextTrackSent;
    @AbstractC27891c(mo46611a = "description")
    String description;
    @AbstractC27891c(mo46611a = "disable_show_ad_link")
    boolean disableAdLink;
    @AbstractC27891c(mo46611a = "disable_ad_show_filter")
    boolean disableAdShowFilter;
    @AbstractC27891c(mo46611a = "disable_auto_track_click")
    boolean disableAutoTrackClick;
    @AbstractC27891c(mo46611a = "disable_download_dialog")
    int disableDownloadDialog = 1;
    @AbstractC27891c(mo46611a = "disable_follow_to_click")
    private int disableFollowToClick;
    @AbstractC27891c(mo46611a = "disable_like_type")
    private boolean disableLikeType;
    @AbstractC27891c(mo46611a = "disable_show_link_label")
    public boolean disableShowLinkLabel = false;
    @AbstractC27891c(mo46611a = "disable_authorpage_button")
    private boolean disableUserprofileAdLabel;
    @AbstractC27891c(mo46611a = "disclaimer")
    C38211a disclaimer;
    @AbstractC27891c(mo46611a = "dislike_info")
    private C38231b dislikeInfo;
    @AbstractC27891c(mo46611a = "display_type")
    Long displayType;
    @AbstractC27891c(mo46611a = "link_data")
    private C38259w douPlusLinkData;
    @AbstractC27891c(mo46611a = "download_url")
    String downloadUrl;
    @AbstractC27891c(mo46611a = "dynamic_video")
    private DynamicVideo dynamicVideo;
    @AbstractC27891c(mo46611a = "e_ad_info")
    private String eAdInfo;
    @AbstractC27891c(mo46611a = "effective_play_time")
    Float effectivePlayTime;
    @AbstractC27891c(mo46611a = "effective_play_track_url_list")
    UrlModel effectivePlayTrackUrlList;
    @AbstractC27891c(mo46611a = "enable_title_click")
    int enableDescClick;
    @AbstractC27891c(mo46611a = "enable_filter_same_video")
    private boolean enableFilterSameVideo = true;
    @AbstractC27891c(mo46611a = "enable_video_resume")
    private boolean enableVideoResume;
    @AbstractC27891c(mo46611a = "enable_web_google_login")
    private boolean enableWebGoogleLogin;
    @AbstractC27891c(mo46611a = "enable_web_report")
    private boolean enableWebReport;
    @AbstractC27891c(mo46611a = "enter_from_merge")
    private String enterFromMerge;
    @AbstractC27891c(mo46611a = "expire_seconds")
    Long expireSeconds;
    @AbstractC27891c(mo46611a = "extra_effective_play_action")
    private int extraEffectivePlayAction;
    @AbstractC27891c(mo46611a = "fake_author")
    private C38212aa fakeAuthor;
    @AbstractC27891c(mo46611a = "feature_label")
    String featureLabel;
    @AbstractC27891c(mo46611a = "featured_label")
    private List<AwemeTextLabelModel> featuredLabel;
    @AbstractC27891c(mo46611a = "form_height")
    private int formHeight;
    @AbstractC27891c(mo46611a = "form_url")
    private String formUrl;
    @AbstractC27891c(mo46611a = "form_width")
    private int formWidth;
    @AbstractC27891c(mo46611a = "frontend_data")
    Object frontendData;
    @AbstractC27891c(mo46611a = "get_ad_status")
    private int getAdStatus;
    @AbstractC27891c(mo46611a = "get_ad_time")
    private int getAdTime;
    @AbstractC27891c(mo46611a = "hide_if_exists")
    int hideIfExists;
    @AbstractC27891c(mo46611a = "hide_web_button")
    boolean hideWebButton;
    @AbstractC27891c(mo46611a = "high_light_color")
    public String highLightColor;
    @AbstractC27891c(mo46611a = "high_light_position")
    public List<Position> highLightPosition;
    @AbstractC27891c(mo46611a = "homepage_bottom_textual")
    private String homepageBottomTextual;
    @AbstractC27891c(mo46611a = "icon_image_list")
    private List<UrlModel> iconImageList;
    @AbstractC27891c(mo46611a = "image_list")
    List<UrlModel> imageList;
    @AbstractC27891c(mo46611a = "image_url")
    private UrlModel imageUrl;
    @AbstractC27891c(mo46611a = "indicator_data")
    private IndicatorData indicatorData;
    @AbstractC27891c(mo46611a = "instance_phone_id")
    private long instancePhoneId;
    @AbstractC27891c(mo46611a = "interaction_seconds")
    int interactionSeconds;
    @AbstractC27891c(mo46611a = "interesting_play")
    private AwemePlayFunModel interestingPlay;
    @AbstractC27891c(mo46611a = "is_ack_action")
    private int isAckAction = 0;
    @AbstractC27891c(mo46611a = "is_dsp")
    private boolean isDsp;
    @AbstractC27891c(mo46611a = "is_open_url_support_pull_up")
    private boolean isOpenUrlSupportPullUp;
    @AbstractC27891c(mo46611a = "is_preview")
    boolean isPreview;
    @AbstractC27891c(mo46611a = "js_actlog_url")
    private String jsActLogUrl;
    @AbstractC27891c(mo46611a = "label")
    private AwemeTextLabelModel label;
    @AbstractC27891c(mo46611a = "landing_page_info")
    private String landingPageInfo;
    @AbstractC27891c(mo46611a = "learn_more_bg_color")
    private String learnMoreBgColor;
    @AbstractC27891c(mo46611a = "left_slide_click_time")
    private int leftSlideClickDuration;
    @AbstractC27891c(mo46611a = "left_slide_click_type")
    private int leftSlideClickType;
    @AbstractC27891c(mo46611a = "light_web_url")
    private String lightWebUrl;
    @AbstractC27891c(mo46611a = "link_label")
    private AwemeLinkLabel linkLabel;
    @AbstractC27891c(mo46611a = "live_ad_type")
    private int liveAdType;
    @AbstractC27891c(mo46611a = "live_room")
    public int liveRoom;
    @AbstractC27891c(mo46611a = "lynx_button_position")
    private int lynxButtonPosition;
    @AbstractC27891c(mo46611a = "template_url")
    private String lynxButtonUrl;
    @AbstractC27891c(mo46611a = "lynx_entry_data")
    C38241j lynxEntryData;
    @AbstractC27890b(mo46609a = C80365dx.class)
    @AbstractC27891c(mo46611a = "lynx_raw_data")
    private String lynxRawData;
    @AbstractC27891c(mo46611a = "download_mode")
    int mDownloadMode;
    @AbstractC27891c(mo46611a = "auto_open")
    int mLinkMode;
    @AbstractC27891c(mo46611a = "support_multiple")
    int mSupportMultiple;
    @AbstractC27891c(mo46611a = "mask_form_style")
    int maskFormStyle;
    @AbstractC27891c(mo46611a = "mp_url")
    private String microAppUrl;
    @AbstractC27891c(mo46611a = "music")
    private Music music;
    @AbstractC27891c(mo46611a = "native_author")
    private NativeAuthorInfo nativeAuthor;
    @AbstractC27891c(mo46611a = "native_card_info")
    private C38217ae nativeCardInfo;
    @AbstractC27891c(mo46611a = "native_card_type")
    int nativeCardType;
    @AbstractC27891c(mo46611a = "native_site_ad_info")
    private String nativeSiteAdInfo;
    @AbstractC27891c(mo46611a = "native_site_config")
    private C38220ag nativeSiteConfig;
    @AbstractC27891c(mo46611a = "native_site_custom_data")
    private String nativeSiteCustomData;
    @AbstractC27891c(mo46611a = "non_native_click")
    int nonNativeClick;
    @AbstractC27891c(mo46611a = "notification_config")
    private int notificationConfig;
    @AbstractC27891c(mo46611a = "vast")
    C38222ai omVast;
    @AbstractC27891c(mo46611a = "open_system_browser")
    private boolean openSystemBrowser;
    @AbstractC27891c(mo46611a = "open_url")
    String openUrl;
    @AbstractC27891c(mo46611a = "origin_price")
    String originPrice;
    @AbstractC27891c(mo46611a = "outflow_button_style")
    int outFlowButtonStyle;
    @AbstractC27891c(mo46611a = "package")
    String packageName;
    private String pageFrom = "";
    @AbstractC27891c(mo46611a = "phone_key")
    private String phoneKey;
    @AbstractC27891c(mo46611a = "phone_number")
    private String phoneNumber;
    @AbstractC27891c(mo46611a = "piv_opt")
    int pivOpt = 0;
    @AbstractC27891c(mo46611a = "playover_track_url_list")
    UrlModel playOverTrackUrlList;
    @AbstractC27891c(mo46611a = "play_track_url_list")
    UrlModel playTrackUrlList;
    @AbstractC27891c(mo46611a = "playback_seconds_track_url")
    private List<C38227am> playbackSecondsTrackList = new ArrayList();
    @AbstractC27891c(mo46611a = "pop_ups")
    private boolean popUps;
    @AbstractC27891c(mo46611a = "position")
    private int position;
    @AbstractC27891c(mo46611a = "preload_data")
    private C37892a preloadData;
    @AbstractC27891c(mo46611a = "preload_extra_web")
    private int preloadExtraWeb;
    @AbstractC27891c(mo46611a = "preload_web")
    private int preloadWeb;
    @AbstractC27891c(mo46611a = "preload_web_new")
    private int preloadWebNew;
    @AbstractC27891c(mo46611a = "price")
    String price;
    @AbstractC27891c(mo46611a = "profile_with_webview")
    private int profileWithWebview;
    @AbstractC27891c(mo46611a = "promotion_label")
    String promotionLabel;
    @AbstractC27891c(mo46611a = "quick_app_url")
    String quickAppUrl;
    @AbstractC27891c(mo46611a = "recommend_extra")
    private String recommendExtra;
    @AbstractC27891c(mo46611a = "recommend_title")
    private String recommendTitle;
    @AbstractC27891c(mo46611a = "red_mp_url")
    private String redMpUrl;
    @AbstractC27891c(mo46611a = "red_open_url")
    private String redOpenUrl;
    @AbstractC27891c(mo46611a = "red_url")
    private String redUrl;
    @AbstractC27891c(mo46611a = "report_ad_type")
    private int reportAdType;
    @AbstractC27891c(mo46611a = "report_enable")
    boolean reportEnable;
    @AbstractC27889a(mo46607a = false, mo46608b = false)
    private transient boolean reshowAd;
    @AbstractC27891c(mo46611a = "schema_name")
    String schemaName;
    @AbstractC27891c(mo46611a = "search")
    private AwemeSearchAdModel searchAdInfo;
    @AbstractC27891c(mo46611a = "shop_ad_data")
    private String shopAdData;
    @AbstractC27891c(mo46611a = "show_ad_after_interaction")
    boolean showAdAfterInteraction;
    @AbstractC27891c(mo46611a = "show_button_color_seconds")
    int showButtonColorSeconds;
    @AbstractC27891c(mo46611a = "show_button_seconds")
    private int showButtonSeconds;
    @AbstractC27891c(mo46611a = "show_label_rows")
    private int showLabelRows;
    @AbstractC27891c(mo46611a = "show_label_seconds")
    private int showLabelSeconds;
    @AbstractC27891c(mo46611a = "show_lynx_card")
    private int showLynxCard;
    @AbstractC27891c(mo46611a = "show_mask_recycle")
    public boolean showMaskRecycle;
    @AbstractC27891c(mo46611a = "show_mask_times")
    private int showMaskTimes;
    @AbstractC27891c(mo46611a = "show_outflow_mask_times")
    private int showOutflowMaskTimes;
    @AbstractC27891c(mo46611a = "show_type")
    int showType;
    @AbstractC27891c(mo46611a = "similar_animation")
    private int similarAnimation = 0;
    @AbstractC27891c(mo46611a = "skip_time")
    int skipTime;
    @AbstractC27891c(mo46611a = "slide_action")
    private int slideAction;
    @AbstractC27891c(mo46611a = "source")
    String source;
    @AbstractC27891c(mo46611a = "splash_info")
    private AwemeSplashInfo splashInfo;
    @AbstractC27891c(mo46611a = "sticker_data")
    C38244m stickerData;
    @AbstractC27891c(mo46611a = "system_origin")
    int systemOrigin;
    @AbstractC27891c(mo46611a = "tips_type")
    int tipsType;
    @AbstractC27891c(mo46611a = "title")
    String title;
    @AbstractC27891c(mo46611a = "top_title")
    String topTitle;
    @AbstractC27891c(mo46611a = "track_url_list")
    UrlModel trackUrlList;
    @AbstractC27891c(mo46611a = StringSet.type)
    String type;
    @AbstractC27891c(mo46611a = "use_default_color")
    boolean useDefaultColor;
    @AbstractC27891c(mo46611a = "use_ordinary_web")
    Boolean useOrdinaryWeb;
    @AbstractC27891c(mo46611a = "video")
    private List<Video> videoList;
    @AbstractC27891c(mo46611a = "video_transpose")
    Long videoTranspose;
    @AbstractC27891c(mo46611a = "web_title")
    String webTitle;
    @AbstractC27891c(mo46611a = "web_type")
    int webType;
    @AbstractC27891c(mo46611a = "web_url")
    String webUrl;
    @AbstractC27891c(mo46611a = "webview_pannel_style")
    private int webviewPannelStyle;
    @AbstractC27891c(mo46611a = "webview_progress_bar")
    private int webviewProgressBar;
    @AbstractC27891c(mo46611a = "webview_type")
    private int webviewType;
    @AbstractC27891c(mo46611a = "white_high_light_color")
    public String whiteHighLightColor;

    static {
        Covode.recordClassIndex(58632);
    }

    private void vastFromXml() {
    }

    public int getAdAvatarLinkTagStyle() {
        return this.adAvatarLinkTagStyle;
    }

    public C38232c getAdDislikeModel() {
        return this.adDislikeModel;
    }

    public C38240i getAdHintData() {
        return this.adHintData;
    }

    public Long getAdId() {
        return this.adId;
    }

    public AdInteractionData getAdInteractionData() {
        return this.adInteractionData;
    }

    public AdLive getAdLive() {
        return this.adLive;
    }

    public String getAdMoreTextual() {
        return this.adMoreTextual;
    }

    public List<C38242k> getAdNodeTrackUrlList() {
        return this.adNodeTrackUrlList;
    }

    public C38243l getAdQuestionnaire() {
        return this.adQuestionnaire;
    }

    public int getAdTagPosition() {
        return this.adTagPosition;
    }

    public UrlModel getAdTopIcon() {
        return this.adTopIcon;
    }

    public int getAdType() {
        return this.adType;
    }

    public String getAdvId() {
        return this.advId;
    }

    public AggregationSdk getAggregationSdk() {
        return this.aggregationSdk;
    }

    public int getAnchorClickType() {
        return this.anchorClickType;
    }

    public int getAnimationType() {
        return this.animationType;
    }

    public String getAppData() {
        return this.appData;
    }

    public String getAppInstall() {
        return this.appInstall;
    }

    public String getAppName() {
        return this.appName;
    }

    public String getAuthorUrl() {
        return this.authorUrl;
    }

    public UrlModel getAvatarIcon() {
        return this.avatarIcon;
    }

    public String getBackgroundColor() {
        return this.backgroundColor;
    }

    public String getButtonIcon() {
        return this.buttonIcon;
    }

    public int getButtonIconAnimationRepeatTimes() {
        return this.buttonIconAnimationRepeatTimes;
    }

    public int getButtonStyle() {
        return this.buttonStyle;
    }

    public String getButtonText() {
        return this.buttonText;
    }

    public CallToActionBarInfo getCallToActionBarInfo() {
        return this.callToActionBarInfo;
    }

    public Map<String, CardStruct> getCardInfos() {
        return this.cardInfos;
    }

    public int getCardInteractionSeconds() {
        return this.cardInteractionSeconds;
    }

    public int getCardInteractionType() {
        return this.cardInteractionType;
    }

    public String getChannelName() {
        return this.channelName;
    }

    public int getChargeType() {
        return this.charge_type;
    }

    public UrlModel getClickTrackUrlList() {
        return this.clickTrackUrlList;
    }

    public C38255s getCommentArea() {
        return this.commentArea;
    }

    public String getCommentExtra() {
        return this.commentExtra;
    }

    public int getComponentType() {
        return this.componentType;
    }

    public String getConsultUrl() {
        return this.consultUrl;
    }

    public UrlModel getContextTrack() {
        return this.contextTrack;
    }

    public String getDescription() {
        return this.description;
    }

    public boolean getDisableAutoTrackClick() {
        return this.disableAutoTrackClick;
    }

    public int getDisableFollowToClick() {
        return this.disableFollowToClick;
    }

    public C38211a getDisclaimer() {
        return this.disclaimer;
    }

    public C38231b getDislikeInfo() {
        return this.dislikeInfo;
    }

    public Long getDisplayType() {
        return this.displayType;
    }

    public C38259w getDouPlusLinkData() {
        return this.douPlusLinkData;
    }

    public int getDownloadMode() {
        return this.mDownloadMode;
    }

    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public DynamicVideo getDynamicVideo() {
        return this.dynamicVideo;
    }

    public String getEAdInfo() {
        return this.eAdInfo;
    }

    public UrlModel getEffectivePlayTrackUrlList() {
        return this.effectivePlayTrackUrlList;
    }

    public Long getExpireSeconds() {
        return this.expireSeconds;
    }

    public C38212aa getFakeAuthor() {
        return this.fakeAuthor;
    }

    public String getFeatureLabel() {
        return this.featureLabel;
    }

    public List<AwemeTextLabelModel> getFeaturedLabel() {
        return this.featuredLabel;
    }

    public int getFormHeight() {
        return this.formHeight;
    }

    public String getFormUrl() {
        return this.formUrl;
    }

    public int getFormWidth() {
        return this.formWidth;
    }

    public int getGetAdStatus() {
        return this.getAdStatus;
    }

    public int getGetAdTime() {
        return this.getAdTime;
    }

    public String getHomepageBottomTextual() {
        return this.homepageBottomTextual;
    }

    public List<UrlModel> getIconImageList() {
        return this.iconImageList;
    }

    public List<UrlModel> getImageList() {
        return this.imageList;
    }

    public UrlModel getImageUrl() {
        return this.imageUrl;
    }

    public IndicatorData getIndicatorData() {
        return this.indicatorData;
    }

    public long getInstancePhoneId() {
        return this.instancePhoneId;
    }

    public int getInteractionSeconds() {
        return this.interactionSeconds;
    }

    public String getJsActLogUrl() {
        return this.jsActLogUrl;
    }

    public AwemeTextLabelModel getLabel() {
        return this.label;
    }

    public String getLandingPageInfo() {
        return this.landingPageInfo;
    }

    public String getLearnMoreBgColor() {
        return this.learnMoreBgColor;
    }

    public int getLeftSlideClickDuration() {
        return this.leftSlideClickDuration;
    }

    public int getLeftSlideClickType() {
        return this.leftSlideClickType;
    }

    public String getLightWebUrl() {
        return this.lightWebUrl;
    }

    public AwemeLinkLabel getLinkLabel() {
        return this.linkLabel;
    }

    public int getLinkMode() {
        return this.mLinkMode;
    }

    public int getLiveAdType() {
        return this.liveAdType;
    }

    public String getLiveEnterFromMerge() {
        return this.enterFromMerge;
    }

    public String getLynxButtonUrl() {
        return this.lynxButtonUrl;
    }

    public C38241j getLynxEntryData() {
        return this.lynxEntryData;
    }

    public String getLynxRawData() {
        return this.lynxRawData;
    }

    public int getMaskFormStyle() {
        return this.maskFormStyle;
    }

    public String getMicroAppUrl() {
        return this.microAppUrl;
    }

    public Music getMusic() {
        return this.music;
    }

    public NativeAuthorInfo getNativeAuthorInfo() {
        return this.nativeAuthor;
    }

    public C38217ae getNativeCardInfo() {
        return this.nativeCardInfo;
    }

    public int getNativeCardType() {
        return this.nativeCardType;
    }

    public String getNativeSiteAdInfo() {
        return this.nativeSiteAdInfo;
    }

    public C38220ag getNativeSiteConfig() {
        return this.nativeSiteConfig;
    }

    public String getNativeSiteCustomData() {
        return this.nativeSiteCustomData;
    }

    public int getNonNativeClick() {
        return this.nonNativeClick;
    }

    public int getNotificationConfig() {
        return this.notificationConfig;
    }

    public C38222ai getOmVast() {
        return this.omVast;
    }

    public String getOpenUrl() {
        return this.openUrl;
    }

    public String getOriginPrice() {
        return this.originPrice;
    }

    public int getOutFlowButtonStyle() {
        return this.outFlowButtonStyle;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public String getPageFrom() {
        return this.pageFrom;
    }

    public String getPhoneKey() {
        return this.phoneKey;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public int getPivOption() {
        return this.pivOpt;
    }

    public AwemePlayFunModel getPlayFunModel() {
        return this.interestingPlay;
    }

    public UrlModel getPlayOverTrackUrlList() {
        return this.playOverTrackUrlList;
    }

    public UrlModel getPlayTrackUrlList() {
        return this.playTrackUrlList;
    }

    public List<C38227am> getPlaybackSecondsTrackList() {
        return this.playbackSecondsTrackList;
    }

    public int getPosition() {
        return this.position;
    }

    public C37892a getPreloadData() {
        return this.preloadData;
    }

    public int getPreloadWeb() {
        return this.preloadWeb;
    }

    public int getPreloadWebNew() {
        return this.preloadWebNew;
    }

    public String getPrice() {
        return this.price;
    }

    public int getProfileWithWebview() {
        return this.profileWithWebview;
    }

    public String getPromotionLabel() {
        return this.promotionLabel;
    }

    public String getQuickAppUrl() {
        return this.quickAppUrl;
    }

    public String getRecommendExtra() {
        return this.recommendExtra;
    }

    public String getRedMpUrl() {
        return this.redMpUrl;
    }

    public String getRedOpenUrl() {
        return this.redOpenUrl;
    }

    public String getRedUrl() {
        return this.redUrl;
    }

    public int getReportAdType() {
        return this.reportAdType;
    }

    public String getSchemaName() {
        return this.schemaName;
    }

    public AwemeSearchAdModel getSearchAdInfo() {
        return this.searchAdInfo;
    }

    public String getShopAdData() {
        return this.shopAdData;
    }

    public int getShowButtonColorSeconds() {
        return this.showButtonColorSeconds;
    }

    public int getShowButtonSeconds() {
        return this.showButtonSeconds;
    }

    public int getShowLabelRows() {
        return this.showLabelRows;
    }

    public int getShowLabelSeconds() {
        return this.showLabelSeconds;
    }

    public int getShowMaskTimes() {
        return this.showMaskTimes;
    }

    public int getShowOutflowMaskTimes() {
        return this.showOutflowMaskTimes;
    }

    public int getSimilarAnimation() {
        return this.similarAnimation;
    }

    public int getSkipTime() {
        return this.skipTime;
    }

    public int getSlideAction() {
        return this.slideAction;
    }

    public String getSource() {
        return this.source;
    }

    public AwemeSplashInfo getSplashInfo() {
        return this.splashInfo;
    }

    public C38244m getStickerData() {
        return this.stickerData;
    }

    public int getSystemOrigin() {
        return this.systemOrigin;
    }

    public int getTipsType() {
        return this.tipsType;
    }

    public String getTitle() {
        return this.title;
    }

    public String getTopTitle() {
        return this.topTitle;
    }

    public UrlModel getTrackUrlList() {
        return this.trackUrlList;
    }

    public String getType() {
        return this.type;
    }

    public Boolean getUseOrdinaryWeb_() {
        return this.useOrdinaryWeb;
    }

    public List<Video> getVideoList() {
        return this.videoList;
    }

    public Long getVideoTranspose() {
        return this.videoTranspose;
    }

    public String getWebTitle() {
        return this.webTitle;
    }

    public int getWebType() {
        return this.webType;
    }

    public String getWebUrl() {
        return this.webUrl;
    }

    public int getWebviewPannelStyle() {
        return this.webviewPannelStyle;
    }

    public int getWebviewProgressBar() {
        return this.webviewProgressBar;
    }

    public int getWebviewType() {
        return this.webviewType;
    }

    public boolean isAllowDspAutoJump() {
        return this.allowDspAutoJump;
    }

    public boolean isCardOnceClick() {
        return this.cardOnceClick;
    }

    public boolean isCommentAreaSwitch() {
        return this.commentAreaSwitch;
    }

    public boolean isContextTrackSent() {
        return this.contextTrackSent;
    }

    public boolean isDiableAdShowFilter() {
        return this.disableAdShowFilter;
    }

    public boolean isDisableAdLink() {
        return this.disableAdLink;
    }

    public boolean isDisableLikeType() {
        return this.disableLikeType;
    }

    public boolean isDisableUserprofileAdLabel() {
        return this.disableUserprofileAdLabel;
    }

    public boolean isDsp() {
        return this.isDsp;
    }

    public boolean isEnableFilterSameVideo() {
        return this.enableFilterSameVideo;
    }

    public boolean isEnableVideoResume() {
        return this.enableVideoResume;
    }

    public boolean isEnableWebGoogleLogin() {
        return this.enableWebGoogleLogin;
    }

    public boolean isEnableWebReport() {
        return this.enableWebReport;
    }

    public boolean isHideWebButton() {
        return this.hideWebButton;
    }

    public boolean isOpenSystemBrowser() {
        return this.openSystemBrowser;
    }

    public boolean isOpenUrlSupportPullUp() {
        return this.isOpenUrlSupportPullUp;
    }

    public boolean isPopUps() {
        return this.popUps;
    }

    public boolean isPreview() {
        return this.isPreview;
    }

    public boolean isReportEnable() {
        return this.reportEnable;
    }

    public boolean isReshowAd() {
        return this.reshowAd;
    }

    public boolean isShowAdAfterInteraction() {
        return this.showAdAfterInteraction;
    }

    public boolean isUseDefaultColor() {
        return this.useDefaultColor;
    }

    public boolean allowJumpToPlayStore() {
        if (this.slideAction == 1) {
            return true;
        }
        return false;
    }

    public boolean canShowLynxBtn2CardAnim() {
        if (this.showLynxCard == 1) {
            return true;
        }
        return false;
    }

    public boolean getEnableDescClick() {
        if (this.enableDescClick != 0) {
            return true;
        }
        return false;
    }

    public boolean isAckAction() {
        if (this.isAckAction == 1) {
            return true;
        }
        return false;
    }

    public boolean isAppAd() {
        return isTypeOf("app");
    }

    public boolean isDisableDownloadDialog() {
        if (this.disableDownloadDialog == 1) {
            return true;
        }
        return false;
    }

    public boolean isHardAd() {
        if (this.adSourceType == 1) {
            return true;
        }
        return false;
    }

    public boolean isHideIfExists() {
        if (this.hideIfExists == 1) {
            return true;
        }
        return false;
    }

    public boolean isNewStyleAd() {
        if (this.showType == 1) {
            return true;
        }
        return false;
    }

    public boolean isPreloadExtraWeb() {
        if (this.preloadExtraWeb == 1) {
            return true;
        }
        return false;
    }

    public boolean isSupportMultiple() {
        if (this.mSupportMultiple > 0) {
            return true;
        }
        return false;
    }

    public boolean useEffectivePlayAction() {
        if (this.extraEffectivePlayAction == 1) {
            return true;
        }
        return false;
    }

    public boolean isImageValid() {
        List<UrlModel> list = this.imageList;
        if (list == null || list.isEmpty()) {
            return false;
        }
        return true;
    }

    public boolean isShowWebViewBottomLynxButton() {
        if ((this.lynxButtonPosition & 1) == 1) {
            return true;
        }
        return false;
    }

    public String[] getAppCategory() {
        if (TextUtils.isEmpty(this.appCategory)) {
            return new String[0];
        }
        return this.appCategory.split(" ");
    }

    public float getAppLike() {
        if (TextUtils.isEmpty(this.appLike)) {
            return 0.0f;
        }
        return Float.parseFloat(this.appLike);
    }

    public CardStruct getDefaultCardInfo() {
        Map<String, CardStruct> map = this.cardInfos;
        if (map == null || !map.containsKey("3")) {
            return null;
        }
        return this.cardInfos.get("3");
    }

    public Float getEffectivePlayTime() {
        Float f = this.effectivePlayTime;
        if (f == null || f.floatValue() <= 0.001f) {
            return Float.valueOf(3.0f);
        }
        return this.effectivePlayTime;
    }

    public CardStruct getFollowCardInfo() {
        Map<String, CardStruct> map = this.cardInfos;
        if (map == null || !map.containsKey("7")) {
            return null;
        }
        return this.cardInfos.get("7");
    }

    public JSONObject getFrontendData() {
        try {
            return new JSONObject(new C27910f().mo46674b(this.frontendData));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public CardStruct getLiveCardInfo() {
        Map<String, CardStruct> map = this.cardInfos;
        if (map == null || !map.containsKey("live_card")) {
            return null;
        }
        return this.cardInfos.get("live_card");
    }

    public UrlModel getRedImageUrl() {
        if (C80582ip.m139712a(this.iconImageList)) {
            return null;
        }
        return this.iconImageList.get(0);
    }

    public boolean isClickTrackUrlListValid() {
        UrlModel urlModel = this.clickTrackUrlList;
        if (urlModel == null || urlModel.getUrlList() == null || this.clickTrackUrlList.getUrlList().isEmpty()) {
            return false;
        }
        return true;
    }

    public boolean isRightStyle() {
        AwemeTextLabelModel awemeTextLabelModel;
        if (getAdTagPosition() != 2 || (awemeTextLabelModel = this.label) == null || TextUtils.isEmpty(awemeTextLabelModel.getLabelName())) {
            return false;
        }
        return true;
    }

    public void setAdHintData(C38240i iVar) {
        this.adHintData = iVar;
    }

    public void setAdId(Long l) {
        this.adId = l;
    }

    public void setAdLive(AdLive adLive2) {
        this.adLive = adLive2;
    }

    public void setAdMoreTextual(String str) {
        this.adMoreTextual = str;
    }

    public void setAdTagPosition(int i) {
        this.adTagPosition = i;
    }

    public void setAdTopIcon(UrlModel urlModel) {
        this.adTopIcon = urlModel;
    }

    public void setAdvId(String str) {
        this.advId = str;
    }

    public void setAllowDspAutoJump(boolean z) {
        this.allowDspAutoJump = z;
    }

    public void setAnimationType(int i) {
        this.animationType = i;
    }

    public void setAppName(String str) {
        this.appName = str;
    }

    public void setAvatarIcon(UrlModel urlModel) {
        this.avatarIcon = urlModel;
    }

    public void setButtonStyle(int i) {
        this.buttonStyle = i;
    }

    public void setButtonText(String str) {
        this.buttonText = str;
    }

    public void setCallToActionBarInfo(CallToActionBarInfo callToActionBarInfo2) {
        this.callToActionBarInfo = callToActionBarInfo2;
    }

    public void setCardOnceClick(boolean z) {
        this.cardOnceClick = z;
    }

    public void setClickTrackUrlList(UrlModel urlModel) {
        this.clickTrackUrlList = urlModel;
    }

    public void setCommentArea(C38255s sVar) {
        this.commentArea = sVar;
    }

    public void setCommentAreaSwitch(boolean z) {
        this.commentAreaSwitch = z;
    }

    public void setContextTrack(UrlModel urlModel) {
        this.contextTrack = urlModel;
    }

    public void setContextTrackSent(boolean z) {
        this.contextTrackSent = z;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setDiableAdShowFilter(boolean z) {
        this.disableAdShowFilter = z;
    }

    public void setDisableAdLink(boolean z) {
        this.disableAdLink = z;
    }

    public void setDisableDownloadDialog(int i) {
        this.disableDownloadDialog = i;
    }

    public void setDisableFollowToClick(int i) {
        this.disableFollowToClick = i;
    }

    public void setDisableUserprofileAdLabel(boolean z) {
        this.disableUserprofileAdLabel = z;
    }

    public void setDisplayType(Long l) {
        this.displayType = l;
    }

    public void setDownloadMode(int i) {
        this.mDownloadMode = i;
    }

    public void setDownloadUrl(String str) {
        this.downloadUrl = str;
    }

    public void setDsp(boolean z) {
        this.isDsp = z;
    }

    public void setDynamicVideo(DynamicVideo dynamicVideo2) {
        this.dynamicVideo = dynamicVideo2;
    }

    public void setEffectivePlayTrackUrlList(UrlModel urlModel) {
        this.effectivePlayTrackUrlList = urlModel;
    }

    public void setEnableFilterSameVideo(boolean z) {
        this.enableFilterSameVideo = z;
    }

    public void setExpireSeconds(Long l) {
        this.expireSeconds = l;
    }

    public void setFakeAuthor(C38212aa aaVar) {
        this.fakeAuthor = aaVar;
    }

    public void setFeatureLabel(String str) {
        this.featureLabel = str;
    }

    public void setFormHeight(int i) {
        this.formHeight = i;
    }

    public void setFormUrl(String str) {
        this.formUrl = str;
    }

    public void setFormWidth(int i) {
        this.formWidth = i;
    }

    public void setGetAdStatus(int i) {
        this.getAdStatus = i;
    }

    public void setGetAdTime(int i) {
        this.getAdTime = i;
    }

    public void setHideIfExists(boolean z) {
        this.hideIfExists = z ? 1 : 0;
    }

    public void setHomepageBottomTextual(String str) {
        this.homepageBottomTextual = str;
    }

    public void setIconImageList(List<UrlModel> list) {
        this.iconImageList = list;
    }

    public void setImageList(List<UrlModel> list) {
        this.imageList = list;
    }

    public void setIndicatorData(IndicatorData indicatorData2) {
        this.indicatorData = indicatorData2;
    }

    public void setJsActLogUrl(String str) {
        this.jsActLogUrl = str;
    }

    public void setLabel(AwemeTextLabelModel awemeTextLabelModel) {
        this.label = awemeTextLabelModel;
    }

    public void setLearnMoreBgColor(String str) {
        this.learnMoreBgColor = str;
    }

    public void setLightWebUrl(String str) {
        this.lightWebUrl = str;
    }

    public void setLinkMode(int i) {
        this.mLinkMode = i;
    }

    public void setMaskFormStyle(int i) {
        this.maskFormStyle = i;
    }

    public void setMicroAppUrl(String str) {
        this.microAppUrl = str;
    }

    public void setMusic(Music music2) {
        this.music = music2;
    }

    public void setOmVast(C38222ai aiVar) {
        this.omVast = aiVar;
    }

    public void setOpenSystemBrowser(boolean z) {
        this.openSystemBrowser = z;
    }

    public void setOpenUrl(String str) {
        this.openUrl = str;
    }

    public void setOriginPrice(String str) {
        this.originPrice = str;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    public void setPageFrom(String str) {
        this.pageFrom = str;
    }

    public void setPhoneNumber(String str) {
        this.phoneNumber = str;
    }

    public void setPlayOverTrackUrlList(UrlModel urlModel) {
        this.playOverTrackUrlList = urlModel;
    }

    public void setPlayTrackUrlList(UrlModel urlModel) {
        this.playTrackUrlList = urlModel;
    }

    public void setPopUps(boolean z) {
        this.popUps = z;
    }

    public void setPreloadData(C37892a aVar) {
        this.preloadData = aVar;
    }

    public void setPreloadWeb(int i) {
        this.preloadWeb = i;
    }

    public void setPreloadWebNew(int i) {
        this.preloadWebNew = i;
    }

    public void setPreview(boolean z) {
        this.isPreview = z;
    }

    public void setPrice(String str) {
        this.price = str;
    }

    public void setProfileWithWebview(int i) {
        this.profileWithWebview = i;
    }

    public void setRecommendExtra(String str) {
        this.recommendExtra = str;
    }

    public void setRedMpUrl(String str) {
        this.redMpUrl = str;
    }

    public void setRedUrl(String str) {
        this.redUrl = str;
    }

    public void setReportAdType(int i) {
        this.reportAdType = i;
    }

    public void setReshowAd(boolean z) {
        this.reshowAd = z;
    }

    public void setSearchAdInfo(AwemeSearchAdModel awemeSearchAdModel) {
        this.searchAdInfo = awemeSearchAdModel;
    }

    public void setShopAdData(String str) {
        this.shopAdData = str;
    }

    public void setShowAdAfterInteraction(boolean z) {
        this.showAdAfterInteraction = z;
    }

    public void setShowButtonSeconds(int i) {
        this.showButtonSeconds = i;
    }

    public void setShowMaskTimes(int i) {
        this.showMaskTimes = i;
    }

    public void setShowOutflowMaskTimes(int i) {
        this.showOutflowMaskTimes = i;
    }

    public void setSimilarAnimation(int i) {
        this.similarAnimation = i;
    }

    public void setSkipTime(int i) {
        this.skipTime = i;
    }

    public void setSlideAction(int i) {
        this.slideAction = i;
    }

    public void setSource(String str) {
        this.source = str;
    }

    public void setSplashInfo(AwemeSplashInfo awemeSplashInfo) {
        this.splashInfo = awemeSplashInfo;
    }

    public void setSupportMultiple(int i) {
        this.mSupportMultiple = i;
    }

    public void setSystemOrigin(int i) {
        this.systemOrigin = i;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setTrackUrlList(UrlModel urlModel) {
        this.trackUrlList = urlModel;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setVideoTranspose(Long l) {
        this.videoTranspose = l;
    }

    public void setWebTitle(String str) {
        this.webTitle = str;
    }

    public void setWebType(int i) {
        this.webType = i;
    }

    public void setWebUrl(String str) {
        this.webUrl = str;
    }

    public void setWebviewProgressBar(int i) {
        this.webviewProgressBar = i;
    }

    public void setWebviewType(int i) {
        this.webviewType = i;
    }

    public boolean isTypeOf(String str) {
        return TextUtils.equals(this.type, str);
    }

    public void setLiveCardInfo(CardStruct cardStruct) {
        if (cardStruct == null) {
            Map<String, CardStruct> map = this.cardInfos;
            if (map != null && map.containsKey("live_card")) {
                this.cardInfos.remove("live_card");
                return;
            }
            return;
        }
        if (this.cardInfos == null) {
            this.cardInfos = new HashMap();
        }
        this.cardInfos.put("live_card", cardStruct);
    }
}
