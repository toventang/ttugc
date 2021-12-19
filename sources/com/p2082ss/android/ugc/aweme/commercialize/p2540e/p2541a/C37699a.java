package com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.aweme.commercialize.splash.setting.C17979c;
import com.bytedance.ies.ugc.aweme.commercialize.splash.setting.C17980d;
import com.p2082ss.android.common.applog.GlobalContext;
import com.p2082ss.android.common.util.C29843f;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.commerce.C37437a;
import com.p2082ss.android.ugc.aweme.commerce.model.C37513b;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38214ac;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38220ag;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38241j;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38243l;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38244m;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38259w;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38681bh;
import com.p2082ss.android.ugc.aweme.feed.model.AdInteractionData;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeSplashInfo;
import com.p2082ss.android.ugc.aweme.feed.model.BottomBanner;
import com.p2082ss.android.ugc.aweme.feed.model.CardStruct;
import com.p2082ss.android.ugc.aweme.feed.model.DynamicVideo;
import com.p2082ss.android.ugc.aweme.feed.model.NativeAuthorInfo;
import com.p2082ss.android.ugc.aweme.miniapp_api.C59308d;
import com.p2082ss.android.ugc.aweme.p2282ad.FeedAdServiceImpl;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.commercialize.e.a.a */
public class C37699a {

    /* renamed from: a */
    static final /* synthetic */ boolean f89058a = true;

    static {
        Covode.recordClassIndex(45134);
    }

    /* renamed from: I */
    public static String m76206I(Aweme aweme) {
        AwemeSplashInfo m = m76308m(aweme);
        if (m == null) {
            return null;
        }
        return m.getAwesomeSplashId();
    }

    /* renamed from: K */
    public static boolean m76208K(Aweme aweme) {
        if (m76209L(aweme) != null || m76210M(aweme)) {
            return true;
        }
        return false;
    }

    /* renamed from: M */
    public static boolean m76210M(Aweme aweme) {
        if (m76211N(aweme) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: P */
    public static boolean m76213P(Aweme aweme) {
        if (aweme == null || aweme.getCommerceVideoAuthInfo() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: Q */
    public static boolean m76214Q(Aweme aweme) {
        if (m76215R(aweme) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: S */
    public static boolean m76216S(Aweme aweme) {
        if (aweme == null || !m76293e(aweme.getAwemeRawAd())) {
            return false;
        }
        return true;
    }

    /* renamed from: U */
    public static boolean m76218U(Aweme aweme) {
        if (aweme == null || aweme.getAwemeType() != 34) {
            return false;
        }
        return true;
    }

    /* renamed from: aT */
    public static String m76248aT(Aweme aweme) {
        C37437a commerceVideoAuthInfo;
        if (aweme == null || (commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo()) == null) {
            return null;
        }
        return commerceVideoAuthInfo.getStudyId();
    }

    /* renamed from: ab */
    public static boolean m76256ab(Aweme aweme) {
        if (aweme == null || !aweme.isCmtSwt()) {
            return false;
        }
        return true;
    }

    /* renamed from: ac */
    public static String m76257ac(Aweme aweme) {
        AwemeSplashInfo m = m76308m(aweme);
        if (m == null) {
            return "";
        }
        return m.getSplashButtonText();
    }

    /* renamed from: af */
    public static boolean m76260af(Aweme aweme) {
        AwemeSplashInfo m = m76308m(aweme);
        if (m == null) {
            return false;
        }
        return m.isShown();
    }

    /* renamed from: aj */
    public static void m76264aj(Aweme aweme) {
        AwemeSplashInfo m = m76308m(aweme);
        if (m != null) {
            m.setShown(true);
        }
    }

    /* renamed from: b */
    public static boolean m76283b(String str) {
        if (str == null || !str.contains("__back_url__")) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static Aweme m76289d(String str) {
        IAwemeService b = AwemeService.m70060b();
        Aweme d = b.mo60690d(str);
        Aweme b2 = b.mo60684b(str);
        if (d != null) {
            return d;
        }
        return b2;
    }

    /* renamed from: i */
    public static boolean m76301i(Aweme aweme) {
        if (m76303j(aweme) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public static boolean m76307l(Aweme aweme) {
        AwemeSplashInfo m = m76308m(aweme);
        if (m == null) {
            return false;
        }
        return m.adCardShownOnce;
    }

    /* renamed from: m */
    public static AwemeSplashInfo m76308m(Aweme aweme) {
        AwemeRawAd n = m76309n(aweme);
        if (n == null) {
            return null;
        }
        return n.getSplashInfo();
    }

    /* renamed from: n */
    public static AwemeRawAd m76309n(Aweme aweme) {
        if (aweme != null && aweme.isAd()) {
            return aweme.getAwemeRawAd();
        }
        return null;
    }

    /* renamed from: o */
    public static void m76310o(Aweme aweme) {
        AwemeSplashInfo m = m76308m(aweme);
        if (m != null) {
            m.adCardShownOnce = true;
        }
    }

    /* renamed from: s */
    public static boolean m76314s(Aweme aweme) {
        if (aweme == null || !aweme.isAd()) {
            return false;
        }
        return true;
    }

    /* renamed from: B */
    public static boolean m76199B(Aweme aweme) {
        AwemeSplashInfo m = m76308m(aweme);
        if (m != null && !TextUtils.isEmpty(m.getAwesomeSplashId())) {
            return true;
        }
        return false;
    }

    /* renamed from: C */
    public static boolean m76200C(Aweme aweme) {
        AdInteractionData adInteractionData;
        if (aweme == null || !aweme.isAd() || (adInteractionData = aweme.getAwemeRawAd().getAdInteractionData()) == null || adInteractionData.getGestureGuidance() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: D */
    public static int m76201D(Aweme aweme) {
        if (aweme == null || aweme.getAwemeRawAd() == null) {
            return 0;
        }
        return aweme.getAwemeRawAd().getShowButtonSeconds() * 1000;
    }

    /* renamed from: E */
    public static boolean m76202E(Aweme aweme) {
        if (aweme == null) {
            return false;
        }
        User author = aweme.getAuthor();
        if (author == null) {
            return true;
        }
        return author.isAdFake();
    }

    /* renamed from: G */
    public static boolean m76204G(Aweme aweme) {
        AwemeSplashInfo m = m76308m(aweme);
        if (m != null && !TextUtils.isEmpty(m.getAwesomeSplashId())) {
            return true;
        }
        return false;
    }

    /* renamed from: H */
    public static boolean m76205H(Aweme aweme) {
        AwemeSplashInfo m = m76308m(aweme);
        if (m != null && ((long) m.getEndTime()) >= System.currentTimeMillis() / 1000) {
            return false;
        }
        return true;
    }

    /* renamed from: L */
    public static CardStruct m76209L(Aweme aweme) {
        CardStruct e = m76292e(aweme);
        if (e == null || e.getCardType() != 14) {
            return null;
        }
        return e;
    }

    /* renamed from: N */
    public static CardStruct m76211N(Aweme aweme) {
        CardStruct cardStruct;
        if (m76213P(aweme) && (cardStruct = aweme.getCommerceVideoAuthInfo().getCardStruct()) != null && cardStruct.getCardType() == 14) {
            return cardStruct;
        }
        return null;
    }

    /* renamed from: O */
    public static boolean m76212O(Aweme aweme) {
        if (!m76213P(aweme)) {
            return false;
        }
        return aweme.getCommerceVideoAuthInfo().isHasUserSubmittedFeedback();
    }

    /* renamed from: R */
    public static C38244m m76215R(Aweme aweme) {
        if (aweme == null || !aweme.isAd()) {
            return null;
        }
        return aweme.getAwemeRawAd().getStickerData();
    }

    /* renamed from: V */
    public static boolean m76219V(Aweme aweme) {
        if (aweme == null || aweme.getAwemeRawAd() == null || !m76202E(aweme) || aweme.getAwemeRawAd().getAdAvatarLinkTagStyle() == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: W */
    public static boolean m76220W(Aweme aweme) {
        if (aweme == null || aweme.getAwemeRawAd() == null || aweme.getAwemeRawAd().getSystemOrigin() != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: X */
    public static boolean m76221X(Aweme aweme) {
        if (aweme == null || aweme.getAwemeRawAd() == null || aweme.getAwemeRawAd().getSystemOrigin() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: Y */
    public static boolean m76222Y(Aweme aweme) {
        if (aweme == null || aweme.getAwemeRawAd() == null || aweme.getAwemeRawAd().getSystemOrigin() != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: Z */
    public static boolean m76223Z(Aweme aweme) {
        if (aweme == null || aweme.getCommerceVideoAuthInfo() == null || aweme.getCommerceVideoAuthInfo().getAdSource() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static String m76224a(Aweme aweme) {
        if (aweme == null || !aweme.isAd()) {
            return "";
        }
        return aweme.getAwemeRawAd().getFormUrl();
    }

    /* renamed from: aF */
    public static boolean m76234aF(Aweme aweme) {
        if (aweme == null || !aweme.isAd() || aweme.getAwemeRawAd().getAdLive() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: aM */
    public static boolean m76241aM(Aweme aweme) {
        if (aweme == null || !aweme.isAd() || aweme.getAwemeRawAd() == null) {
            return false;
        }
        return TextUtils.equals(aweme.getAwemeRawAd().getType(), "app");
    }

    /* renamed from: aN */
    public static boolean m76242aN(Aweme aweme) {
        if (aweme == null || !aweme.isAd() || aweme.getAwemeRawAd() == null) {
            return false;
        }
        return m76288c(aweme.getAwemeRawAd().getOpenUrl());
    }

    /* renamed from: aO */
    public static boolean m76243aO(Aweme aweme) {
        if (aweme == null || !aweme.isAd() || aweme.getAwemeRawAd() == null || TextUtils.isEmpty(aweme.getAwemeRawAd().getWebUrl())) {
            return false;
        }
        return true;
    }

    /* renamed from: aP */
    public static boolean m76244aP(Aweme aweme) {
        if (aweme == null || !aweme.isAd() || aweme.getAwemeRawAd() == null) {
            return false;
        }
        return aweme.getAwemeRawAd().allowJumpToPlayStore();
    }

    /* renamed from: aQ */
    public static boolean m76245aQ(Aweme aweme) {
        if (aweme == null || !aweme.isAd() || aweme.getAwemeRawAd() == null) {
            return false;
        }
        return TextUtils.equals(aweme.getAwemeRawAd().getType(), "web");
    }

    /* renamed from: aV */
    public static boolean m76250aV(Aweme aweme) {
        if (!m76249aU(aweme) || aweme.getAwemeRawAd().getDisclaimer().getType() != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: aX */
    public static boolean m76252aX(Aweme aweme) {
        if (aweme == null || !m76251aW(aweme) || FeedAdServiceImpl.m67808c().mo58883b().mo59083a(aweme.getAid()).f78897a != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: aY */
    public static boolean m76253aY(Aweme aweme) {
        C38241j aZ = m76254aZ(aweme);
        if (aZ == null || aZ.getEntryType() == 0 || aZ.getLynxScheme() == null || aZ.getGeckoChannel() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: aZ */
    public static C38241j m76254aZ(Aweme aweme) {
        if (aweme == null || !aweme.isAd()) {
            return null;
        }
        return aweme.getAwemeRawAd().getLynxEntryData();
    }

    /* renamed from: aa */
    public static boolean m76255aa(Aweme aweme) {
        if (!m76221X(aweme) || aweme.getAwemeRawAd().getDisableFollowToClick() != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: ad */
    public static void m76258ad(Aweme aweme) {
        AwemeSplashInfo m;
        if (m76318w(aweme) && (m = m76308m(aweme)) != null) {
            m.hasUpdateLiving = true;
        }
    }

    /* renamed from: ae */
    public static boolean m76259ae(Aweme aweme) {
        C38214ac a;
        if (aweme == null || (a = C38681bh.m78486a(aweme)) == null || a.feedShowType != 3) {
            return false;
        }
        return true;
    }

    /* renamed from: ag */
    public static boolean m76261ag(Aweme aweme) {
        if (aweme == null || aweme.getAwemeRawAd() == null || aweme.getAwemeRawAd().getAdTagPosition() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: ah */
    public static boolean m76262ah(Aweme aweme) {
        if (aweme == null || !aweme.isAd()) {
            return false;
        }
        return aweme.getAwemeRawAd().isShowAdAfterInteraction();
    }

    /* renamed from: ai */
    public static int m76263ai(Aweme aweme) {
        if (aweme == null || !aweme.isAd()) {
            return 0;
        }
        return aweme.getAwemeRawAd().getInteractionSeconds();
    }

    /* renamed from: an */
    public static boolean m76268an(Aweme aweme) {
        if (aweme != null && aweme.isAd() && !m76221X(aweme)) {
            return true;
        }
        return false;
    }

    /* renamed from: ao */
    public static boolean m76269ao(Aweme aweme) {
        if (aweme == null || !aweme.isAd() || aweme.getAwemeRawAd().getAnimationType() != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: ap */
    public static boolean m76270ap(Aweme aweme) {
        if (!m76213P(aweme)) {
            return false;
        }
        return aweme.getCommerceVideoAuthInfo().isMusicNotClickable();
    }

    /* renamed from: aq */
    public static boolean m76271aq(Aweme aweme) {
        if (!m76213P(aweme)) {
            return false;
        }
        return aweme.getCommerceVideoAuthInfo().isPersonalPageForbidden();
    }

    /* renamed from: ar */
    public static CardStruct m76272ar(Aweme aweme) {
        Map<String, CardStruct> cardInfos;
        AwemeRawAd n = m76309n(aweme);
        if (n == null || (cardInfos = n.getCardInfos()) == null) {
            return null;
        }
        return cardInfos.get("4");
    }

    /* renamed from: as */
    public static boolean m76273as(Aweme aweme) {
        if (!m76314s(aweme) || !aweme.getAwemeRawAd().isContextTrackSent()) {
            return false;
        }
        return true;
    }

    /* renamed from: at */
    public static boolean m76274at(Aweme aweme) {
        if (aweme == null || !aweme.isAd() || aweme.getAwemeRawAd().getAdType() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: aw */
    public static boolean m76277aw(Aweme aweme) {
        if (aweme == null || !aweme.isAd() || aweme.getAwemeRawAd().getAdType() != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: ax */
    public static boolean m76278ax(Aweme aweme) {
        if (aweme == null || !aweme.isAd() || !aweme.getAwemeRawAd().isDisableLikeType()) {
            return false;
        }
        return true;
    }

    /* renamed from: az */
    public static boolean m76280az(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || TextUtils.isEmpty(awemeRawAd.getOpenUrl())) {
            return false;
        }
        return awemeRawAd.isOpenUrlSupportPullUp();
    }

    /* renamed from: b */
    public static String m76281b(Aweme aweme) {
        if (aweme == null || !aweme.isAd()) {
            return "";
        }
        return aweme.getAwemeRawAd().getWebUrl();
    }

    /* renamed from: ba */
    private static String m76284ba(Aweme aweme) {
        if (aweme == null || !aweme.isAd()) {
            return "";
        }
        return aweme.getAwemeRawAd().getType();
    }

    /* renamed from: d */
    public static boolean m76290d(Aweme aweme) {
        if (m76292e(aweme) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m76293e(AwemeRawAd awemeRawAd) {
        if (awemeRawAd != null && awemeRawAd.getCardInteractionType() == 1 && !TextUtils.isEmpty(awemeRawAd.getWebUrl())) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static boolean m76296f(AwemeRawAd awemeRawAd) {
        if (awemeRawAd == null || awemeRawAd.getFakeAuthor() == null || awemeRawAd.getFakeAuthor().getFakeAuthorVersion().intValue() != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public static boolean m76297g(Aweme aweme) {
        if (aweme == null || !aweme.isAd() || aweme.getAwemeRawAd().getPlayFunModel() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public static C38259w m76303j(Aweme aweme) {
        if (aweme == null || aweme.getAwemeRawAd() == null) {
            return null;
        }
        return aweme.getAwemeRawAd().getDouPlusLinkData();
    }

    /* renamed from: k */
    public static boolean m76305k(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme == null || !aweme.isAd() || (awemeRawAd = aweme.getAwemeRawAd()) == null) {
            return false;
        }
        return TextUtils.equals(awemeRawAd.getType(), "app");
    }

    /* renamed from: p */
    public static boolean m76311p(Aweme aweme) {
        AwemeRawAd n = m76309n(aweme);
        if (n == null || !n.isPopUps()) {
            return false;
        }
        String openUrl = n.getOpenUrl();
        if (TextUtils.isEmpty(openUrl)) {
            return false;
        }
        return m76294e(openUrl);
    }

    /* renamed from: r */
    public static boolean m76313r(Aweme aweme) {
        if (aweme == null || !aweme.isAd() || !aweme.getAwemeRawAd().isOpenSystemBrowser()) {
            return false;
        }
        return true;
    }

    /* renamed from: t */
    public static String m76315t(Aweme aweme) {
        if (aweme == null || aweme.getNewLiveRoomData() == null || aweme.getNewLiveRoomData().owner == null) {
            return "";
        }
        return aweme.getNewLiveRoomData().owner.getUid();
    }

    /* renamed from: u */
    public static long m76316u(Aweme aweme) {
        if (aweme == null || aweme.getNewLiveRoomData() == null) {
            return 0;
        }
        return aweme.getNewLiveRoomData().f114485id;
    }

    /* renamed from: w */
    public static boolean m76318w(Aweme aweme) {
        AwemeSplashInfo m = m76308m(aweme);
        if (m != null && !TextUtils.isEmpty(m.getAwesomeSplashId()) && m.getSplashFeedType() == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: y */
    public static boolean m76320y(Aweme aweme) {
        AwemeSplashInfo m;
        if (m76318w(aweme) && (m = m76308m(aweme)) != null && !m.hasUpdateLiving) {
            return true;
        }
        return false;
    }

    /* renamed from: A */
    public static boolean m76198A(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (!m76199B(aweme) || (awemeRawAd = aweme.getAwemeRawAd()) == null || !TextUtils.equals(awemeRawAd.getType(), "app")) {
            return false;
        }
        String packageName = awemeRawAd.getPackageName();
        C17979c a = C17980d.m33499a();
        List arrayList = new ArrayList();
        if (!(a == null || a.f42820a == null)) {
            arrayList = Arrays.asList(a.f42820a);
        }
        if (!arrayList.contains(packageName)) {
            return true;
        }
        return false;
    }

    /* renamed from: F */
    public static boolean m76203F(Aweme aweme) {
        if (aweme == null || !aweme.isAd()) {
            return false;
        }
        if (!f89058a && aweme.getAwemeRawAd() == null) {
            throw new AssertionError();
        } else if (m76202E(aweme) && aweme.getAwemeRawAd().getFakeAuthor() != null) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: J */
    public static boolean m76207J(Aweme aweme) {
        if (aweme == null || !aweme.isAd() || !TextUtils.equals(aweme.getAwemeRawAd().getType(), "app") || aweme.getAwemeRawAd().getWebType() != 1 || TextUtils.isEmpty(aweme.getAwemeRawAd().getWebUrl())) {
            return false;
        }
        return true;
    }

    /* renamed from: T */
    public static boolean m76217T(Aweme aweme) {
        C37513b activityPendant;
        UrlModel image;
        if (!(aweme == null || aweme.getActivityPendant() == null || (image = (activityPendant = aweme.getActivityPendant()).getImage()) == null || C13603b.m24435a((Collection) image.getUrlList()))) {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            if (currentTimeMillis < activityPendant.getStartTime() || currentTimeMillis > activityPendant.getEndTime()) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: aA */
    public static boolean m76229aA(Aweme aweme) {
        NativeAuthorInfo nativeAuthorInfo;
        if (aweme == null || !aweme.isAd()) {
            return false;
        }
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        User author = aweme.getAuthor();
        if ((author != null && author.isAdFake()) || (nativeAuthorInfo = awemeRawAd.getNativeAuthorInfo()) == null || nativeAuthorInfo.getBottomBanner() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: aE */
    public static boolean m76233aE(Aweme aweme) {
        if (aweme == null || !aweme.isAd()) {
            return false;
        }
        if (aweme.isLive()) {
            return true;
        }
        User author = aweme.getAuthor();
        if (author == null || !author.isLive() || !m76234aF(aweme)) {
            return false;
        }
        return true;
    }

    /* renamed from: aH */
    public static boolean m76236aH(Aweme aweme) {
        C38243l lVar;
        if (aweme == null || !aweme.isAd()) {
            lVar = null;
        } else {
            lVar = aweme.getAwemeRawAd().getAdQuestionnaire();
        }
        if (lVar != null && !TextUtils.isEmpty(lVar.getSchema())) {
            return true;
        }
        return false;
    }

    /* renamed from: aJ */
    public static boolean m76238aJ(Aweme aweme) {
        if (aweme == null || aweme.getAwemeRawAd() == null || TextUtils.isEmpty(aweme.getAwemeRawAd().getButtonIcon()) || !aweme.getAwemeRawAd().getButtonIcon().endsWith(".webp")) {
            return false;
        }
        return true;
    }

    /* renamed from: aL */
    public static boolean m76240aL(Aweme aweme) {
        if (!(aweme == null || aweme.getAwemeRawAd() == null)) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (m76298g(awemeRawAd) || m76242aN(aweme) || TextUtils.isEmpty(awemeRawAd.getWebUrl()) || !m76304j(awemeRawAd) || !m76306k(awemeRawAd) || !m76241aM(aweme)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: aR */
    public static String m76246aR(Aweme aweme) {
        if (aweme == null || aweme.getAwemeRawAd() == null || aweme.getAwemeRawAd().getAdLive() == null || TextUtils.isEmpty(aweme.getAwemeRawAd().getAdLive().getButtonText())) {
            return "";
        }
        return aweme.getAwemeRawAd().getAdLive().getButtonText();
    }

    /* renamed from: aU */
    public static boolean m76249aU(Aweme aweme) {
        if (aweme == null || aweme.getAwemeRawAd() == null || aweme.getAwemeRawAd().getDisclaimer() == null || aweme.getAwemeRawAd().getDisclaimer().getType() == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: aW */
    public static boolean m76251aW(Aweme aweme) {
        DynamicVideo dynamicVideo;
        if (aweme == null || !aweme.isAd() || (dynamicVideo = aweme.getAwemeRawAd().getDynamicVideo()) == null || TextUtils.isEmpty(dynamicVideo.getLynxScheme())) {
            return false;
        }
        return true;
    }

    /* renamed from: ak */
    public static String m76265ak(Aweme aweme) {
        if (aweme == null || aweme.getAwemeRawAd() == null) {
            return C17867d.m33078a().getResources().getString(R.color.jq);
        }
        String learnMoreBgColor = aweme.getAwemeRawAd().getLearnMoreBgColor();
        if (TextUtils.isEmpty(learnMoreBgColor)) {
            return C17867d.m33078a().getResources().getString(R.color.jq);
        }
        return learnMoreBgColor;
    }

    /* renamed from: al */
    public static boolean m76266al(Aweme aweme) {
        if (aweme == null || !aweme.isAd()) {
            return false;
        }
        if (m76319x(aweme)) {
            return true;
        }
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (TextUtils.isEmpty(awemeRawAd.getWebUrl())) {
            return false;
        }
        if (awemeRawAd.getAnimationType() == 1 || awemeRawAd.getAnimationType() == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: am */
    public static boolean m76267am(Aweme aweme) {
        if (aweme == null || !aweme.isAd()) {
            return false;
        }
        if (aweme.getAwemeRawAd().getAnimationType() == 1 || aweme.getAwemeRawAd().getAnimationType() == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: av */
    public static boolean m76276av(Aweme aweme) {
        if (aweme == null || !aweme.isAppAd()) {
            return false;
        }
        if (!f89058a && aweme.getAwemeRawAd() == null) {
            throw new AssertionError();
        } else if (!TextUtils.isEmpty(aweme.getAwemeRawAd().getLightWebUrl())) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: ay */
    public static boolean m76279ay(Aweme aweme) {
        if (!m76229aA(aweme)) {
            return false;
        }
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        BottomBanner bottomBanner = aweme.getAwemeRawAd().getNativeAuthorInfo().getBottomBanner();
        if ((!TextUtils.isEmpty(awemeRawAd.getOpenUrl()) || TextUtils.equals(awemeRawAd.getType(), "app")) && bottomBanner.getVersion() == 1 && !awemeRawAd.isDisableUserprofileAdLabel()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m76282b(AwemeRawAd awemeRawAd) {
        AwemeSplashInfo splashInfo;
        if (awemeRawAd != null && (splashInfo = awemeRawAd.getSplashInfo()) != null && !TextUtils.isEmpty(splashInfo.getAwesomeSplashId()) && splashInfo.getSplashFeedType() == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: bb */
    private static CardStruct m76285bb(Aweme aweme) {
        if (aweme == null || !aweme.isAd() || aweme.getAwemeRawAd() == null || aweme.getAwemeRawAd().getLiveCardInfo() == null) {
            return null;
        }
        return aweme.getAwemeRawAd().getLiveCardInfo();
    }

    /* renamed from: c */
    public static String m76287c(AwemeRawAd awemeRawAd) {
        if (awemeRawAd == null) {
            return C17867d.m33078a().getResources().getString(R.color.jq);
        }
        String learnMoreBgColor = awemeRawAd.getLearnMoreBgColor();
        if (TextUtils.isEmpty(learnMoreBgColor)) {
            return C17867d.m33078a().getResources().getString(R.color.jq);
        }
        return learnMoreBgColor;
    }

    /* renamed from: d */
    public static boolean m76291d(AwemeRawAd awemeRawAd) {
        if (awemeRawAd == null) {
            return false;
        }
        return TextUtils.equals(awemeRawAd.getType(), "app");
    }

    /* renamed from: e */
    public static CardStruct m76292e(Aweme aweme) {
        if (m76285bb(aweme) != null) {
            return m76285bb(aweme);
        }
        if (m76295f(aweme) != null) {
            return m76295f(aweme);
        }
        if (aweme == null || !aweme.isAd() || aweme.getAwemeRawAd().getDefaultCardInfo() == null) {
            return null;
        }
        return aweme.getAwemeRawAd().getDefaultCardInfo();
    }

    /* renamed from: f */
    public static CardStruct m76295f(Aweme aweme) {
        if (aweme == null || !aweme.isAd() || aweme.getAwemeRawAd().getNotificationConfig() != 1 || aweme.getAwemeRawAd().getFollowCardInfo() == null) {
            return null;
        }
        return aweme.getAwemeRawAd().getFollowCardInfo();
    }

    /* renamed from: g */
    public static boolean m76298g(AwemeRawAd awemeRawAd) {
        if (awemeRawAd.getNativeSiteConfig() == null || !TextUtils.equals(awemeRawAd.getNativeSiteConfig().getRenderType(), "lynx") || TextUtils.isEmpty(awemeRawAd.getNativeSiteConfig().getLynxScheme())) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public static CardStruct m76299h(Aweme aweme) {
        if (aweme == null || !aweme.isAd() || aweme.getAwemeRawAd().getCardInfos() == null || !aweme.getAwemeRawAd().getCardInfos().containsKey("5")) {
            return null;
        }
        return aweme.getAwemeRawAd().getCardInfos().get("5");
    }

    /* renamed from: i */
    public static boolean m76302i(AwemeRawAd awemeRawAd) {
        if (awemeRawAd == null || awemeRawAd.getFakeAuthor() == null || awemeRawAd.getFakeAuthor().getJumpData() == null || TextUtils.isEmpty(awemeRawAd.getFakeAuthor().getJumpData().getOpenUrl())) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public static boolean m76304j(AwemeRawAd awemeRawAd) {
        if (awemeRawAd == null || awemeRawAd.getFakeAuthor() == null || !awemeRawAd.getFakeAuthor().getShouldShowBanner()) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public static boolean m76306k(AwemeRawAd awemeRawAd) {
        if (awemeRawAd == null || awemeRawAd.getFakeAuthor() == null || !awemeRawAd.getFakeAuthor().getAutoShowWebview().booleanValue()) {
            return false;
        }
        return true;
    }

    /* renamed from: q */
    public static boolean m76312q(Aweme aweme) {
        if (aweme == null || aweme.getAwemeRawAd() == null) {
            return false;
        }
        String openUrl = aweme.getAwemeRawAd().getOpenUrl();
        String microAppUrl = aweme.getAwemeRawAd().getMicroAppUrl();
        if (C59308d.m109008c(openUrl)) {
            return true;
        }
        if (!C59308d.m109008c(microAppUrl) || m76288c(openUrl)) {
            return false;
        }
        return true;
    }

    /* renamed from: v */
    public static boolean m76317v(Aweme aweme) {
        if (m76314s(aweme) && m76318w(aweme) && !m76319x(aweme)) {
            return TextUtils.isEmpty(aweme.getAwemeRawAd().getWebUrl());
        }
        return false;
    }

    /* renamed from: x */
    public static boolean m76319x(Aweme aweme) {
        if (aweme == null || !m76318w(aweme)) {
            return false;
        }
        if (m76320y(aweme)) {
            return true;
        }
        User author = aweme.getAuthor();
        if (author == null || !author.isLive()) {
            return false;
        }
        return true;
    }

    /* renamed from: z */
    public static boolean m76321z(Aweme aweme) {
        if (aweme == null || !aweme.isAd()) {
            return false;
        }
        String webUrl = aweme.getAwemeRawAd().getWebUrl();
        if (TextUtils.isEmpty(webUrl) || !webUrl.endsWith(".apk")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static String m76226a(AwemeRawAd awemeRawAd) {
        if (TextUtils.isEmpty(awemeRawAd.getHomepageBottomTextual())) {
            return C17867d.m33078a().getResources().getString(R.string.nn);
        }
        return awemeRawAd.getHomepageBottomTextual();
    }

    /* renamed from: aB */
    public static boolean m76230aB(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        C38220ag nativeSiteConfig;
        if (!m76229aA(aweme)) {
            return false;
        }
        AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
        if (aweme.getAwemeRawAd().getNativeAuthorInfo().getBottomBanner().getVersion() != 1 || !TextUtils.equals(awemeRawAd2.getType(), "web") || !TextUtils.isEmpty(awemeRawAd2.getOpenUrl()) || ((TextUtils.isEmpty(awemeRawAd2.getWebUrl()) && ((awemeRawAd = aweme.getAwemeRawAd()) == null || (nativeSiteConfig = awemeRawAd.getNativeSiteConfig()) == null || !TextUtils.equals(nativeSiteConfig.getRenderType(), "lynx") || TextUtils.isEmpty(nativeSiteConfig.getLynxScheme()))) || awemeRawAd2.isDisableUserprofileAdLabel())) {
            return false;
        }
        return true;
    }

    /* renamed from: aC */
    public static boolean m76231aC(Aweme aweme) {
        if (!m76229aA(aweme)) {
            return false;
        }
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (aweme.getAwemeRawAd().getNativeAuthorInfo().getBottomBanner().getVersion() != 1 || awemeRawAd.getNativeAuthorInfo().getAutoPullStyle() != 1 || !TextUtils.equals(awemeRawAd.getType(), "app") || TextUtils.isEmpty(awemeRawAd.getWebUrl()) || m76242aN(aweme) || awemeRawAd.isDisableUserprofileAdLabel()) {
            return false;
        }
        return true;
    }

    /* renamed from: aD */
    public static boolean m76232aD(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme == null || !aweme.isAd() || (awemeRawAd = aweme.getAwemeRawAd()) == null) {
            return false;
        }
        User author = aweme.getAuthor();
        if (author != null && author.isAdFake()) {
            return false;
        }
        if (m76318w(aweme)) {
            if (awemeRawAd.getCallToActionBarInfo() == null || !m76319x(aweme)) {
                return false;
            }
            return true;
        } else if (m76234aF(aweme)) {
            if (!m76233aE(aweme) || awemeRawAd.getCallToActionBarInfo() == null) {
                return false;
            }
            return true;
        } else if (awemeRawAd.getCallToActionBarInfo() == null || TextUtils.isEmpty(awemeRawAd.getWebUrl())) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: aG */
    public static boolean m76235aG(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme == null || !aweme.isAd() || (awemeRawAd = aweme.getAwemeRawAd()) == null) {
            return false;
        }
        if (m76318w(aweme) && awemeRawAd.getCallToActionBarInfo() != null) {
            return m76319x(aweme);
        }
        if (TextUtils.isEmpty(awemeRawAd.getWebUrl()) && !TextUtils.equals(awemeRawAd.getType(), "app")) {
            return false;
        }
        User author = aweme.getAuthor();
        if (author != null && author.isAdFake()) {
            return false;
        }
        if (awemeRawAd.getCallToActionBarInfo() == null && awemeRawAd.isDisableUserprofileAdLabel()) {
            return false;
        }
        return true;
    }

    /* renamed from: aI */
    public static boolean m76237aI(Aweme aweme) {
        CardStruct cardStruct;
        if (aweme == null || !aweme.isAd() || aweme.getAwemeRawAd().getCardInfos() == null || !aweme.getAwemeRawAd().getCardInfos().containsKey("5")) {
            cardStruct = null;
        } else {
            cardStruct = aweme.getAwemeRawAd().getCardInfos().get("5");
        }
        if (cardStruct != null && cardStruct.getCardType() == 13) {
            return true;
        }
        return false;
    }

    /* renamed from: aK */
    public static boolean m76239aK(Aweme aweme) {
        if (!(aweme == null || aweme.getAwemeRawAd() == null)) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (m76304j(awemeRawAd)) {
                if (!m76298g(awemeRawAd) && m76242aN(aweme)) {
                    return true;
                }
                if (!m76298g(awemeRawAd) && !m76242aN(aweme) && !m76306k(awemeRawAd) && m76241aM(aweme)) {
                    return true;
                }
                if (m76298g(awemeRawAd)) {
                    if (m76300h(awemeRawAd) && m76302i(awemeRawAd)) {
                        return true;
                    }
                    if (m76300h(awemeRawAd) || !m76241aM(aweme)) {
                        return false;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: aS */
    public static String m76247aS(Aweme aweme) {
        if (aweme == null || aweme.getAwemeRawAd() == null || aweme.getAwemeRawAd().getAdLive() == null) {
            return C17867d.m33078a().getResources().getString(R.color.bh);
        }
        String buttonBgColor = aweme.getAwemeRawAd().getAdLive().getButtonBgColor();
        if (TextUtils.isEmpty(buttonBgColor)) {
            return C17867d.m33078a().getResources().getString(R.color.bh);
        }
        return buttonBgColor;
    }

    /* renamed from: au */
    public static Boolean m76275au(Aweme aweme) {
        if (aweme == null || !aweme.isAd()) {
            return false;
        }
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (!TextUtils.isEmpty(awemeRawAd.getAuthorUrl())) {
            return false;
        }
        String openUrl = awemeRawAd.getOpenUrl();
        if (TextUtils.isEmpty(openUrl)) {
            return false;
        }
        Uri parse = Uri.parse(openUrl);
        if (parse.getScheme() == null) {
            return false;
        }
        String lowerCase = parse.getScheme().toLowerCase();
        if (("sslocal".equals(lowerCase) || "localsdk".equals(lowerCase)) && !C59308d.m109008c(parse.toString())) {
            return true;
        }
        return Boolean.valueOf(m76294e(openUrl));
    }

    /* renamed from: c */
    public static String m76286c(Aweme aweme) {
        if (m76290d(aweme)) {
            String str = null;
            if (!(aweme == null || !aweme.isAd() || aweme.getAwemeRawAd().getDefaultCardInfo() == null)) {
                str = aweme.getAwemeRawAd().getDefaultCardInfo().getCardUrl();
            }
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        if (TextUtils.equals(m76284ba(aweme), "form")) {
            return m76224a(aweme);
        }
        if (TextUtils.equals(m76284ba(aweme), "app")) {
            if (aweme == null || !aweme.isAd()) {
                return "";
            }
            return aweme.getAwemeRawAd().getDownloadUrl();
        } else if (TextUtils.equals(m76284ba(aweme), "web")) {
            return m76281b(aweme);
        } else {
            return "";
        }
    }

    /* renamed from: e */
    private static boolean m76294e(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Uri parse = Uri.parse(str);
        if (parse.getScheme() == null) {
            return false;
        }
        String lowerCase = parse.getScheme().toLowerCase();
        if (TextUtils.isEmpty(lowerCase) || m76228a(lowerCase)) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(parse);
        return C29843f.m60130a(GlobalContext.getContext(), intent);
    }

    /* renamed from: h */
    public static boolean m76300h(AwemeRawAd awemeRawAd) {
        if (awemeRawAd == null || awemeRawAd.getFakeAuthor() == null || awemeRawAd.getFakeAuthor().getJumpData() == null || !awemeRawAd.getFakeAuthor().getJumpData().getEnable()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m76227a(CardStruct cardStruct) {
        if (cardStruct == null) {
            return false;
        }
        if (cardStruct.getCardType() == 8 || cardStruct.getCardType() == 9) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m76288c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Uri parse = Uri.parse(str);
        if (parse.getScheme() == null) {
            return false;
        }
        String lowerCase = parse.getScheme().toLowerCase();
        if (TextUtils.isEmpty(lowerCase)) {
            return false;
        }
        if (m76228a(lowerCase)) {
            return true;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(parse);
        return C29843f.m60130a(GlobalContext.getContext(), intent);
    }

    /* renamed from: a */
    public static boolean m76228a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        if (TextUtils.equals("sslocal", lowerCase) || TextUtils.equals("localsdk", lowerCase)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static String m76225a(Aweme aweme, Aweme aweme2) {
        String aid;
        String str = null;
        if (aweme == null) {
            aid = null;
        } else {
            aid = aweme.getAid();
        }
        if (aweme2 != null) {
            str = aweme2.getAid();
        }
        return "itemIds=" + aid + ";" + str;
    }
}
