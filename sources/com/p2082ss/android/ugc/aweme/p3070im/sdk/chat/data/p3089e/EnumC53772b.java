package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e;

import android.text.TextUtils;
import android.view.View;
import com.C1764a;
import com.appsflyer.BuildConfig;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.emoji.sysemoji.C46611n;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.CommentContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.EmojiContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.GroupAnnouncementContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.GroupGreetingContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.GroupInviteCardContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.GroupSystemContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.SayHelloContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.ShareAwemeContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.ShareChallengeContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.ShareCompilationContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.ShareLiveContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.ShareLiveEventContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.ShareMusicContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.ShareQnAContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.ShareSearchContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.ShareStickerContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.ShareStoryContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.ShareUserContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.ShareWebContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.SystemCardContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.SystemContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.TextContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.VideoUpdateTipsContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.p3104ui.p3106b.C54069d;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.p3090a.p3095d.p3097b.C53856d;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.AbstractC54482a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.C54486aa;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.C54487ab;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.C54488ac;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.C54489ad;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.C54490ae;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.C54491af;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.C54492ag;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.C54495aj;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.C54502al;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.C54504am;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.C54505an;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.C54506ao;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.C54507ap;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.C54508aq;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.C54509ar;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.C54510as;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.C54511at;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.C54512au;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.C54514aw;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.C54515ax;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.C54516ay;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.C54517az;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.C54520ba;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.C54521bb;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.C54522bc;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.C54523bd;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.C54524be;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.C54525bf;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.C54531bh;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.C54534bi;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.C54535bj;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.C54538bk;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.C54540bl;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.C54546h;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.C54547i;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.C54554j;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.C54555k;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.C54556l;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.C54557m;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.C54558n;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.C54559o;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.C54562q;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.C54564r;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.C54565s;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.C54570v;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.C54571w;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.C54572x;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.C54573y;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.C54575z;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.p3137a.C54485a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3170a.C55050c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3170a.C55051d;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55214j;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3221b.C55717a;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import com.p2082ss.android.ugc.playerkit.model.C84224v;
import com.p2082ss.android.ugc.trill.R;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p4600h.C89376n;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89271h;

/* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.e.b */
public class EnumC53772b extends Enum<EnumC53772b> {
    public static final EnumC53772b BIG_EMOJI_RECEIVE;
    public static final EnumC53772b BIG_EMOJI_SEND;
    public static final EnumC53772b CARD;
    public static final EnumC53772b COMMENT_RECEIVE;
    public static final EnumC53772b COMMENT_SEND;
    public static final C53814f Companion = new C53814f((byte) 0);
    public static final EnumC53772b DEFAULT_RECEIVE;
    public static final EnumC53772b DEFAULT_SEND;
    public static final EnumC53772b GROUP_ANNOUNCEMENT_RECEIVE;
    public static final EnumC53772b GROUP_ANNOUNCEMENT_SEND;
    public static final EnumC53772b GROUP_GREETING_MSG;
    public static final EnumC53772b GROUP_GREET_TIPS;
    public static final EnumC53772b GROUP_INVITE_RECEIVE;
    public static final EnumC53772b GROUP_INVITE_SEND;
    public static final EnumC53772b GROUP_SYSTEM_MSG;
    public static final EnumC53772b LOAD_MORE;
    public static final EnumC53772b NOTICE_DANGER_WARNNING_TOP;
    public static final EnumC53772b PUSH_NOTIFICATION_GUIDE;
    public static final EnumC53772b SAY_HELLO;
    public static final EnumC53772b SHARE_AWEME_RECEIVE;
    public static final EnumC53772b SHARE_AWEME_SEND;
    public static final EnumC53772b SHARE_CHALLENGE_MULTI_RECEIVE;
    public static final EnumC53772b SHARE_CHALLENGE_MULTI_SEND;
    public static final EnumC53772b SHARE_CHALLENGE_SIMPLE_RECEIVE;
    public static final EnumC53772b SHARE_CHALLENGE_SIMPLE_SEND;
    public static final EnumC53772b SHARE_COMPILATION_MULTI_RECEIVE;
    public static final EnumC53772b SHARE_COMPILATION_MULTI_SEND;
    public static final EnumC53772b SHARE_COMPILATION_SIMPLE_RECEIVE;
    public static final EnumC53772b SHARE_COMPILATION_SIMPLE_SEND;
    public static final EnumC53772b SHARE_LIVE_EVENT_RECEIVE;
    public static final EnumC53772b SHARE_LIVE_EVENT_SEND;
    public static final EnumC53772b SHARE_LIVE_RECEIVE;
    public static final EnumC53772b SHARE_LIVE_SEND;
    public static final EnumC53772b SHARE_MUSIC_MULTI_RECEIVE;
    public static final EnumC53772b SHARE_MUSIC_MULTI_SEND;
    public static final EnumC53772b SHARE_MUSIC_SIMPLE_RECEIVE;
    public static final EnumC53772b SHARE_MUSIC_SIMPLE_SEND;
    public static final EnumC53772b SHARE_QNA_MULTI_RECEIVE;
    public static final EnumC53772b SHARE_QNA_MULTI_SEND;
    public static final EnumC53772b SHARE_QNA_SIMPLE_RECEIVE;
    public static final EnumC53772b SHARE_QNA_SIMPLE_SEND;
    public static final EnumC53772b SHARE_SEARCH_RECEIVE;
    public static final EnumC53772b SHARE_SEARCH_SEND;
    public static final EnumC53772b SHARE_STICKER_MULTI_RECEIVE;
    public static final EnumC53772b SHARE_STICKER_MULTI_SEND;
    public static final EnumC53772b SHARE_STICKER_SIMPLE_RECEIVE;
    public static final EnumC53772b SHARE_STICKER_SIMPLE_SEND;
    public static final EnumC53772b SHARE_STORY_RECEIVE;
    public static final EnumC53772b SHARE_STORY_SEND;
    public static final EnumC53772b SHARE_USER_MULTI_RECEIVE;
    public static final EnumC53772b SHARE_USER_MULTI_SEND;
    public static final EnumC53772b SHARE_USER_SIMPLE_RECEIVE;
    public static final EnumC53772b SHARE_USER_SIMPLE_SEND;
    public static final EnumC53772b SHARE_WEB_FROM_THIRD_RECEIVE;
    public static final EnumC53772b SHARE_WEB_FROM_THIRD_SEND;
    public static final EnumC53772b SHARE_WEB_RECEIVE;
    public static final EnumC53772b SHARE_WEB_SEND;
    public static final EnumC53772b STRANGER_GREET_TIPS;
    public static final EnumC53772b SYSTEM_RECEIVE;
    public static final EnumC53772b TEXT_BIG_EMOJI_RECEIVE;
    public static final EnumC53772b TEXT_BIG_EMOJI_SEND;
    public static final EnumC53772b TEXT_RECEIVE;
    public static final EnumC53772b TEXT_SEND;
    public static final EnumC53772b VIDEO_UPDATE_TIPS;

    /* renamed from: a */
    private static final /* synthetic */ EnumC53772b[] f123325a;
    public static final Map<Integer, EnumC53772b> lookupMap;

    /* renamed from: b */
    private final int f123326b;

    /* renamed from: c */
    private final int f123327c;

    /* renamed from: d */
    private final Class<? extends BaseContent> f123328d;

    public static final BaseContent content(int i, String str, boolean z, long j) {
        return Companion.mo90397a(i, str, z, j);
    }

    public static final BaseContent content(C19538ai aiVar) {
        return C53814f.m99071b(aiVar);
    }

    public static final EnumC53772b valueOf(C19538ai aiVar) {
        return C53814f.m99068a(aiVar);
    }

    public static EnumC53772b valueOf(String str) {
        return (EnumC53772b) Enum.valueOf(EnumC53772b.class, str);
    }

    public static EnumC53772b[] values() {
        return (EnumC53772b[]) f123325a.clone();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.e.b$a */
    static final class C53773a extends EnumC53772b {

        /* renamed from: a */
        private final int f123329a = R.layout.a5a;

        /* renamed from: b */
        private final Class<EmojiContent> f123330b = EmojiContent.class;

        static {
            Covode.recordClassIndex(63353);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final int getItemLayoutId() {
            return this.f123329a;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final Class<EmojiContent> getMessageContentClazz() {
            return this.f123330b;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53773a(String str) {
            super(str, 7, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.e.b$aa */
    static final class C53774aa extends EnumC53772b {

        /* renamed from: a */
        private final int f123331a = R.layout.a5y;

        /* renamed from: b */
        private final Class<ShareCompilationContent> f123332b = ShareCompilationContent.class;

        static {
            Covode.recordClassIndex(63354);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final int getItemLayoutId() {
            return this.f123331a;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final Class<ShareCompilationContent> getMessageContentClazz() {
            return this.f123332b;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53774aa(String str) {
            super(str, 38, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.e.b$ab */
    static final class C53775ab extends EnumC53772b {

        /* renamed from: a */
        private final int f123333a = R.layout.a61;

        /* renamed from: b */
        private final Class<ShareCompilationContent> f123334b = ShareCompilationContent.class;

        static {
            Covode.recordClassIndex(63355);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final int getItemLayoutId() {
            return this.f123333a;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final Class<ShareCompilationContent> getMessageContentClazz() {
            return this.f123334b;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53775ab(String str) {
            super(str, 39, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.e.b$ac */
    static final class C53776ac extends EnumC53772b {

        /* renamed from: a */
        private final int f123335a = R.layout.a62;

        /* renamed from: b */
        private final Class<ShareCompilationContent> f123336b = ShareCompilationContent.class;

        static {
            Covode.recordClassIndex(63356);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final int getItemLayoutId() {
            return this.f123335a;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final Class<ShareCompilationContent> getMessageContentClazz() {
            return this.f123336b;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53776ac(String str) {
            super(str, 40, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.e.b$ad */
    static final class C53777ad extends EnumC53772b {

        /* renamed from: a */
        private final int f123337a = R.layout.a5r;

        /* renamed from: b */
        private final Class<ShareLiveEventContent> f123338b = ShareLiveEventContent.class;

        static {
            Covode.recordClassIndex(63357);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final int getItemLayoutId() {
            return this.f123337a;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final Class<ShareLiveEventContent> getMessageContentClazz() {
            return this.f123338b;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53777ad(String str) {
            super(str, 21, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.e.b$ae */
    static final class C53778ae extends EnumC53772b {

        /* renamed from: a */
        private final int f123339a = R.layout.a5s;

        /* renamed from: b */
        private final Class<ShareLiveEventContent> f123340b = ShareLiveEventContent.class;

        static {
            Covode.recordClassIndex(63358);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final int getItemLayoutId() {
            return this.f123339a;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final Class<ShareLiveEventContent> getMessageContentClazz() {
            return this.f123340b;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53778ae(String str) {
            super(str, 20, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.e.b$af */
    static final class C53779af extends EnumC53772b {

        /* renamed from: a */
        private final int f123341a = R.layout.a5u;

        /* renamed from: b */
        private final Class<ShareLiveContent> f123342b = ShareLiveContent.class;

        static {
            Covode.recordClassIndex(63359);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final int getItemLayoutId() {
            return this.f123341a;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final Class<ShareLiveContent> getMessageContentClazz() {
            return this.f123342b;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53779af(String str) {
            super(str, 35, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.e.b$ag */
    static final class C53780ag extends EnumC53772b {

        /* renamed from: a */
        private final int f123343a = R.layout.a5v;

        /* renamed from: b */
        private final Class<ShareLiveContent> f123344b = ShareLiveContent.class;

        static {
            Covode.recordClassIndex(63360);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final int getItemLayoutId() {
            return this.f123343a;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final Class<ShareLiveContent> getMessageContentClazz() {
            return this.f123344b;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53780ag(String str) {
            super(str, 34, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.e.b$ah */
    static final class C53781ah extends EnumC53772b {

        /* renamed from: a */
        private final int f123345a = R.layout.a5x;

        /* renamed from: b */
        private final Class<ShareMusicContent> f123346b = ShareMusicContent.class;

        static {
            Covode.recordClassIndex(63361);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final int getItemLayoutId() {
            return this.f123345a;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final Class<ShareMusicContent> getMessageContentClazz() {
            return this.f123346b;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53781ah(String str) {
            super(str, 17, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.e.b$ai */
    static final class C53782ai extends EnumC53772b {

        /* renamed from: a */
        private final int f123347a = R.layout.a5y;

        /* renamed from: b */
        private final Class<ShareMusicContent> f123348b = ShareMusicContent.class;

        static {
            Covode.recordClassIndex(63362);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final int getItemLayoutId() {
            return this.f123347a;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final Class<ShareMusicContent> getMessageContentClazz() {
            return this.f123348b;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53782ai(String str) {
            super(str, 16, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.e.b$aj */
    static final class C53783aj extends EnumC53772b {

        /* renamed from: a */
        private final int f123349a = R.layout.a61;

        /* renamed from: b */
        private final Class<ShareMusicContent> f123350b = ShareMusicContent.class;

        static {
            Covode.recordClassIndex(63363);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final int getItemLayoutId() {
            return this.f123349a;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final Class<ShareMusicContent> getMessageContentClazz() {
            return this.f123350b;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53783aj(String str) {
            super(str, 19, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.e.b$ak */
    static final class C53784ak extends EnumC53772b {

        /* renamed from: a */
        private final int f123351a = R.layout.a62;

        /* renamed from: b */
        private final Class<ShareMusicContent> f123352b = ShareMusicContent.class;

        static {
            Covode.recordClassIndex(63364);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final int getItemLayoutId() {
            return this.f123351a;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final Class<ShareMusicContent> getMessageContentClazz() {
            return this.f123352b;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53784ak(String str) {
            super(str, 18, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.e.b$al */
    static final class C53785al extends EnumC53772b {

        /* renamed from: a */
        private final int f123353a = R.layout.a5x;

        /* renamed from: b */
        private final Class<ShareQnAContent> f123354b = ShareQnAContent.class;

        static {
            Covode.recordClassIndex(63365);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final int getItemLayoutId() {
            return this.f123353a;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final Class<ShareQnAContent> getMessageContentClazz() {
            return this.f123354b;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53785al(String str) {
            super(str, 58, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.e.b$am */
    static final class C53786am extends EnumC53772b {

        /* renamed from: a */
        private final int f123355a = R.layout.a5y;

        /* renamed from: b */
        private final Class<ShareQnAContent> f123356b = ShareQnAContent.class;

        static {
            Covode.recordClassIndex(63366);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final int getItemLayoutId() {
            return this.f123355a;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final Class<ShareQnAContent> getMessageContentClazz() {
            return this.f123356b;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53786am(String str) {
            super(str, 57, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.e.b$an */
    static final class C53787an extends EnumC53772b {

        /* renamed from: a */
        private final int f123357a = R.layout.a61;

        /* renamed from: b */
        private final Class<ShareQnAContent> f123358b = ShareQnAContent.class;

        static {
            Covode.recordClassIndex(63367);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final int getItemLayoutId() {
            return this.f123357a;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final Class<ShareQnAContent> getMessageContentClazz() {
            return this.f123358b;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53787an(String str) {
            super(str, 60, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.e.b$ao */
    static final class C53788ao extends EnumC53772b {

        /* renamed from: a */
        private final int f123359a = R.layout.a62;

        /* renamed from: b */
        private final Class<ShareQnAContent> f123360b = ShareQnAContent.class;

        static {
            Covode.recordClassIndex(63368);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final int getItemLayoutId() {
            return this.f123359a;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final Class<ShareQnAContent> getMessageContentClazz() {
            return this.f123360b;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53788ao(String str) {
            super(str, 59, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.e.b$ap */
    static final class C53789ap extends EnumC53772b {

        /* renamed from: a */
        private final int f123361a = R.layout.a61;

        /* renamed from: b */
        private final Class<ShareSearchContent> f123362b = ShareSearchContent.class;

        static {
            Covode.recordClassIndex(63369);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final int getItemLayoutId() {
            return this.f123361a;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final Class<ShareSearchContent> getMessageContentClazz() {
            return this.f123362b;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53789ap(String str) {
            super(str, 23, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.e.b$aq */
    static final class C53790aq extends EnumC53772b {

        /* renamed from: a */
        private final int f123363a = R.layout.a62;

        /* renamed from: b */
        private final Class<ShareSearchContent> f123364b = ShareSearchContent.class;

        static {
            Covode.recordClassIndex(63370);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final int getItemLayoutId() {
            return this.f123363a;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final Class<ShareSearchContent> getMessageContentClazz() {
            return this.f123364b;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53790aq(String str) {
            super(str, 22, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.e.b$ar */
    static final class C53791ar extends EnumC53772b {

        /* renamed from: a */
        private final int f123365a = R.layout.a5x;

        /* renamed from: b */
        private final Class<ShareStickerContent> f123366b = ShareStickerContent.class;

        static {
            Covode.recordClassIndex(63371);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final int getItemLayoutId() {
            return this.f123365a;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final Class<ShareStickerContent> getMessageContentClazz() {
            return this.f123366b;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53791ar(String str) {
            super(str, 41, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.e.b$as */
    static final class C53792as extends EnumC53772b {

        /* renamed from: a */
        private final int f123367a = R.layout.a5y;

        /* renamed from: b */
        private final Class<ShareStickerContent> f123368b = ShareStickerContent.class;

        static {
            Covode.recordClassIndex(63372);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final int getItemLayoutId() {
            return this.f123367a;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final Class<ShareStickerContent> getMessageContentClazz() {
            return this.f123368b;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53792as(String str) {
            super(str, 42, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.e.b$at */
    static final class C53793at extends EnumC53772b {

        /* renamed from: a */
        private final int f123369a = R.layout.a61;

        /* renamed from: b */
        private final Class<ShareStickerContent> f123370b = ShareStickerContent.class;

        static {
            Covode.recordClassIndex(63373);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final int getItemLayoutId() {
            return this.f123369a;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final Class<ShareStickerContent> getMessageContentClazz() {
            return this.f123370b;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53793at(String str) {
            super(str, 43, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.e.b$au */
    static final class C53794au extends EnumC53772b {

        /* renamed from: a */
        private final int f123371a = R.layout.a62;

        /* renamed from: b */
        private final Class<ShareStickerContent> f123372b = ShareStickerContent.class;

        static {
            Covode.recordClassIndex(63374);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final int getItemLayoutId() {
            return this.f123371a;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final Class<ShareStickerContent> getMessageContentClazz() {
            return this.f123372b;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53794au(String str) {
            super(str, 44, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.e.b$av */
    static final class C53795av extends EnumC53772b {

        /* renamed from: a */
        private final int f123373a = R.layout.a63;

        /* renamed from: b */
        private final Class<ShareStoryContent> f123374b = ShareStoryContent.class;

        static {
            Covode.recordClassIndex(63375);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final int getItemLayoutId() {
            return this.f123373a;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final Class<ShareStoryContent> getMessageContentClazz() {
            return this.f123374b;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53795av(String str) {
            super(str, 5, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.e.b$aw */
    static final class C53796aw extends EnumC53772b {

        /* renamed from: a */
        private final int f123375a = R.layout.a64;

        /* renamed from: b */
        private final Class<ShareStoryContent> f123376b = ShareStoryContent.class;

        static {
            Covode.recordClassIndex(63376);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final int getItemLayoutId() {
            return this.f123375a;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final Class<ShareStoryContent> getMessageContentClazz() {
            return this.f123376b;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53796aw(String str) {
            super(str, 6, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.e.b$ax */
    static final class C53797ax extends EnumC53772b {

        /* renamed from: a */
        private final int f123377a = R.layout.a5x;

        /* renamed from: b */
        private final Class<ShareUserContent> f123378b = ShareUserContent.class;

        static {
            Covode.recordClassIndex(63377);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final int getItemLayoutId() {
            return this.f123377a;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final Class<ShareUserContent> getMessageContentClazz() {
            return this.f123378b;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53797ax(String str) {
            super(str, 29, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.e.b$ay */
    static final class C53798ay extends EnumC53772b {

        /* renamed from: a */
        private final int f123379a = R.layout.a5y;

        /* renamed from: b */
        private final Class<ShareUserContent> f123380b = ShareUserContent.class;

        static {
            Covode.recordClassIndex(63378);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final int getItemLayoutId() {
            return this.f123379a;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final Class<ShareUserContent> getMessageContentClazz() {
            return this.f123380b;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53798ay(String str) {
            super(str, 28, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.e.b$az */
    static final class C53799az extends EnumC53772b {

        /* renamed from: a */
        private final int f123381a = R.layout.a61;

        /* renamed from: b */
        private final Class<ShareUserContent> f123382b = ShareUserContent.class;

        static {
            Covode.recordClassIndex(63379);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final int getItemLayoutId() {
            return this.f123381a;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final Class<ShareUserContent> getMessageContentClazz() {
            return this.f123382b;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53799az(String str) {
            super(str, 31, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.e.b$b */
    static final class C53800b extends EnumC53772b {

        /* renamed from: a */
        private final int f123383a = R.layout.a5b;

        /* renamed from: b */
        private final Class<EmojiContent> f123384b = EmojiContent.class;

        static {
            Covode.recordClassIndex(63380);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final int getItemLayoutId() {
            return this.f123383a;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final Class<EmojiContent> getMessageContentClazz() {
            return this.f123384b;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53800b(String str) {
            super(str, 8, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.e.b$ba */
    static final class C53801ba extends EnumC53772b {

        /* renamed from: a */
        private final int f123385a = R.layout.a62;

        /* renamed from: b */
        private final Class<ShareUserContent> f123386b = ShareUserContent.class;

        static {
            Covode.recordClassIndex(63381);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final int getItemLayoutId() {
            return this.f123385a;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final Class<ShareUserContent> getMessageContentClazz() {
            return this.f123386b;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53801ba(String str) {
            super(str, 30, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.e.b$bb */
    static final class C53802bb extends EnumC53772b {

        /* renamed from: a */
        private final int f123387a = R.layout.a61;

        /* renamed from: b */
        private final Class<ShareWebContent> f123388b = ShareWebContent.class;

        static {
            Covode.recordClassIndex(63382);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final int getItemLayoutId() {
            return this.f123387a;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final Class<ShareWebContent> getMessageContentClazz() {
            return this.f123388b;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53802bb(String str) {
            super(str, 33, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.e.b$bc */
    static final class C53803bc extends EnumC53772b {

        /* renamed from: a */
        private final int f123389a = R.layout.a62;

        /* renamed from: b */
        private final Class<ShareWebContent> f123390b = ShareWebContent.class;

        static {
            Covode.recordClassIndex(63383);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final int getItemLayoutId() {
            return this.f123389a;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final Class<ShareWebContent> getMessageContentClazz() {
            return this.f123390b;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53803bc(String str) {
            super(str, 32, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.e.b$bd */
    static final class C53804bd extends EnumC53772b {

        /* renamed from: a */
        private final int f123391a = R.layout.a5f;

        /* renamed from: b */
        private final Class<SayHelloContent> f123392b = SayHelloContent.class;

        static {
            Covode.recordClassIndex(63384);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final int getItemLayoutId() {
            return this.f123391a;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final Class<SayHelloContent> getMessageContentClazz() {
            return this.f123392b;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53804bd(String str) {
            super(str, 53, null);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final BaseContent parse(C19538ai aiVar) {
            C89219l.m154721d(aiVar, "");
            BaseContent parse = EnumC53772b.super.parse(aiVar);
            if (!(parse instanceof SayHelloContent)) {
                parse = null;
            }
            SayHelloContent sayHelloContent = (SayHelloContent) parse;
            if (sayHelloContent == null) {
                return null;
            }
            sayHelloContent.setMsgHint("[" + C17867d.m33078a().getString(R.string.cdj) + ']');
            sayHelloContent.optimise();
            return sayHelloContent;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.e.b$be */
    static final class C53805be extends EnumC53772b {

        /* renamed from: a */
        private final int f123393a = R.layout.a66;

        /* renamed from: b */
        private final Class<SystemContent> f123394b = SystemContent.class;

        static {
            Covode.recordClassIndex(63385);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final int getItemLayoutId() {
            return this.f123393a;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final Class<SystemContent> getMessageContentClazz() {
            return this.f123394b;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53805be(String str) {
            super(str, 0, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.e.b$bf */
    static final class C53806bf extends EnumC53772b {

        /* renamed from: a */
        private final int f123395a = R.layout.a67;

        /* renamed from: b */
        private final Class<TextContent> f123396b = TextContent.class;

        static {
            Covode.recordClassIndex(63386);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final int getItemLayoutId() {
            return this.f123395a;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final Class<TextContent> getMessageContentClazz() {
            return this.f123396b;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53806bf(String str) {
            super(str, 52, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.e.b$bg */
    static final class C53807bg extends EnumC53772b {

        /* renamed from: a */
        private final int f123397a = R.layout.a68;

        /* renamed from: b */
        private final Class<TextContent> f123398b = TextContent.class;

        static {
            Covode.recordClassIndex(63387);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final int getItemLayoutId() {
            return this.f123397a;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final Class<TextContent> getMessageContentClazz() {
            return this.f123398b;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53807bg(String str) {
            super(str, 51, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.e.b$bh */
    static final class C53808bh extends EnumC53772b {

        /* renamed from: a */
        private final int f123399a = R.layout.a69;

        /* renamed from: b */
        private final Class<TextContent> f123400b = TextContent.class;

        static {
            Covode.recordClassIndex(63388);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final int getItemLayoutId() {
            return this.f123399a;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final Class<TextContent> getMessageContentClazz() {
            return this.f123400b;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53808bh(String str) {
            super(str, 1, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.e.b$bi */
    static final class C53809bi extends EnumC53772b {

        /* renamed from: a */
        private final int f123401a = R.layout.a6_;

        /* renamed from: b */
        private final Class<TextContent> f123402b = TextContent.class;

        static {
            Covode.recordClassIndex(63389);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final int getItemLayoutId() {
            return this.f123401a;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final Class<TextContent> getMessageContentClazz() {
            return this.f123402b;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53809bi(String str) {
            super(str, 2, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.e.b$bj */
    static final class C53810bj extends EnumC53772b {

        /* renamed from: a */
        private final int f123403a = R.layout.a6b;

        /* renamed from: b */
        private final Class<VideoUpdateTipsContent> f123404b = VideoUpdateTipsContent.class;

        static {
            Covode.recordClassIndex(63390);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final int getItemLayoutId() {
            return this.f123403a;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final Class<VideoUpdateTipsContent> getMessageContentClazz() {
            return this.f123404b;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53810bj(String str) {
            super(str, 14, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.e.b$c */
    static final class C53811c extends EnumC53772b {

        /* renamed from: a */
        private final int f123405a = R.layout.a65;

        /* renamed from: b */
        private final Class<SystemCardContent> f123406b = SystemCardContent.class;

        static {
            Covode.recordClassIndex(63391);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final int getItemLayoutId() {
            return this.f123405a;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final Class<SystemCardContent> getMessageContentClazz() {
            return this.f123406b;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53811c(String str) {
            super(str, 54, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.e.b$d */
    static final class C53812d extends EnumC53772b {

        /* renamed from: a */
        private final int f123407a = R.layout.a5c;

        /* renamed from: b */
        private final Class<CommentContent> f123408b = CommentContent.class;

        static {
            Covode.recordClassIndex(63392);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final int getItemLayoutId() {
            return this.f123407a;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final Class<CommentContent> getMessageContentClazz() {
            return this.f123408b;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53812d(String str) {
            super(str, 9, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.e.b$e */
    static final class C53813e extends EnumC53772b {

        /* renamed from: a */
        private final int f123409a = R.layout.a5d;

        /* renamed from: b */
        private final Class<CommentContent> f123410b = CommentContent.class;

        static {
            Covode.recordClassIndex(63393);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final int getItemLayoutId() {
            return this.f123409a;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final Class<CommentContent> getMessageContentClazz() {
            return this.f123410b;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53813e(String str) {
            super(str, 10, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.e.b$f */
    public static final class C53814f {
        static {
            Covode.recordClassIndex(63394);
        }

        private C53814f() {
        }

        public /* synthetic */ C53814f(byte b) {
            this();
        }

        /* renamed from: a */
        private static boolean m99070a(Integer num) {
            if (num == null || num.intValue() < 3) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public static BaseContent m99071b(C19538ai aiVar) {
            C89219l.m154721d(aiVar, "");
            if (C55050c.m100668a()) {
                Object localCache = aiVar.getLocalCache(1);
                if (!(localCache instanceof BaseContent)) {
                    localCache = null;
                }
                BaseContent baseContent = (BaseContent) localCache;
                if (baseContent != null) {
                    return baseContent;
                }
            }
            BaseContent parse = m99068a(aiVar).parse(aiVar);
            if (C55050c.m100668a()) {
                aiVar.putLocalCache(1, parse);
            }
            return parse;
        }

        /* renamed from: a */
        public static String m99069a(boolean z) {
            String string;
            if (z) {
                string = C17867d.m33078a().getString(R.string.cfk);
            } else if (!z) {
                string = C17867d.m33078a().getString(R.string.cfj);
            } else {
                throw new C89376n();
            }
            C89219l.m154716b(string, "");
            String string2 = C17867d.m33078a().getString(R.string.cdi);
            C89219l.m154716b(string2, "");
            return string + ' ' + string2;
        }

        /* renamed from: a */
        public static EnumC53772b m99068a(C19538ai aiVar) {
            List<UrlModel> coverUrl;
            List<UrlModel> awemeCoverList;
            List<UrlModel> awemeCoverList2;
            List<UrlModel> awemeCoverList3;
            List<UrlModel> awemeCoverList4;
            List<UrlModel> awemeCoverList5;
            C89219l.m154721d(aiVar, "");
            if (!TextUtils.isEmpty(aiVar.getContent()) && !aiVar.isRecalled()) {
                int msgType = aiVar.getMsgType();
                if (msgType != 1) {
                    if (msgType != 5) {
                        Integer num = null;
                        if (msgType == 19) {
                            BaseContent parse = EnumC53772b.SHARE_CHALLENGE_MULTI_RECEIVE.parse(aiVar);
                            if (!(parse instanceof ShareChallengeContent)) {
                                parse = null;
                            }
                            ShareChallengeContent shareChallengeContent = (ShareChallengeContent) parse;
                            if (!(shareChallengeContent == null || (coverUrl = shareChallengeContent.getCoverUrl()) == null)) {
                                num = Integer.valueOf(coverUrl.size());
                            }
                            if (m99070a(num)) {
                                if (aiVar.isSelf()) {
                                    return EnumC53772b.SHARE_CHALLENGE_SIMPLE_SEND;
                                }
                                return EnumC53772b.SHARE_CHALLENGE_SIMPLE_RECEIVE;
                            } else if (aiVar.isSelf()) {
                                return EnumC53772b.SHARE_CHALLENGE_MULTI_SEND;
                            } else {
                                return EnumC53772b.SHARE_CHALLENGE_MULTI_RECEIVE;
                            }
                        } else if (msgType != 33) {
                            if (msgType != 40) {
                                if (msgType == 1002) {
                                    return EnumC53772b.GROUP_GREET_TIPS;
                                }
                                if (msgType == 1010) {
                                    return EnumC53772b.STRANGER_GREET_TIPS;
                                }
                                if (msgType != 1021) {
                                    if (msgType != 1025) {
                                        if (msgType != 1036) {
                                            if (msgType == 7) {
                                                BaseContent parse2 = EnumC53772b.TEXT_RECEIVE.parse(aiVar);
                                                if (parse2 instanceof TextContent) {
                                                    num = parse2;
                                                }
                                                TextContent textContent = (TextContent) num;
                                                if (textContent != null && aiVar.getReferenceInfo() == null && C46611n.m89950e()) {
                                                    C17867d.m33078a();
                                                    if (C55717a.m101464b(textContent.getText())) {
                                                        if (aiVar.isSelf()) {
                                                            return EnumC53772b.TEXT_BIG_EMOJI_SEND;
                                                        }
                                                        return EnumC53772b.TEXT_BIG_EMOJI_RECEIVE;
                                                    }
                                                }
                                                if (aiVar.isSelf()) {
                                                    return EnumC53772b.TEXT_SEND;
                                                }
                                                return EnumC53772b.TEXT_RECEIVE;
                                            } else if (msgType != 8) {
                                                if (msgType == 9) {
                                                    return EnumC53772b.LOAD_MORE;
                                                }
                                                if (msgType == 14) {
                                                    return EnumC53772b.VIDEO_UPDATE_TIPS;
                                                }
                                                if (msgType == 15) {
                                                    return EnumC53772b.SAY_HELLO;
                                                }
                                                if (msgType != 21) {
                                                    if (msgType == 22) {
                                                        BaseContent parse3 = EnumC53772b.SHARE_MUSIC_MULTI_RECEIVE.parse(aiVar);
                                                        if (!(parse3 instanceof ShareMusicContent)) {
                                                            parse3 = null;
                                                        }
                                                        ShareMusicContent shareMusicContent = (ShareMusicContent) parse3;
                                                        if (!(shareMusicContent == null || (awemeCoverList2 = shareMusicContent.getAwemeCoverList()) == null)) {
                                                            num = Integer.valueOf(awemeCoverList2.size());
                                                        }
                                                        if (m99070a(num)) {
                                                            if (aiVar.isSelf()) {
                                                                return EnumC53772b.SHARE_MUSIC_SIMPLE_SEND;
                                                            }
                                                            return EnumC53772b.SHARE_MUSIC_SIMPLE_RECEIVE;
                                                        } else if (aiVar.isSelf()) {
                                                            return EnumC53772b.SHARE_MUSIC_MULTI_SEND;
                                                        } else {
                                                            return EnumC53772b.SHARE_MUSIC_MULTI_RECEIVE;
                                                        }
                                                    } else if (msgType == 25) {
                                                        BaseContent parse4 = EnumC53772b.SHARE_USER_MULTI_RECEIVE.parse(aiVar);
                                                        if (!(parse4 instanceof ShareUserContent)) {
                                                            parse4 = null;
                                                        }
                                                        ShareUserContent shareUserContent = (ShareUserContent) parse4;
                                                        if (!(shareUserContent == null || (awemeCoverList3 = shareUserContent.getAwemeCoverList()) == null)) {
                                                            num = Integer.valueOf(awemeCoverList3.size());
                                                        }
                                                        if (m99070a(num)) {
                                                            if (aiVar.isSelf()) {
                                                                return EnumC53772b.SHARE_USER_SIMPLE_SEND;
                                                            }
                                                            return EnumC53772b.SHARE_USER_SIMPLE_RECEIVE;
                                                        } else if (aiVar.isSelf()) {
                                                            return EnumC53772b.SHARE_USER_MULTI_SEND;
                                                        } else {
                                                            return EnumC53772b.SHARE_USER_MULTI_RECEIVE;
                                                        }
                                                    } else if (msgType != 26) {
                                                        if (msgType == 71) {
                                                            BaseContent parse5 = EnumC53772b.SHARE_COMPILATION_MULTI_RECEIVE.parse(aiVar);
                                                            if (!(parse5 instanceof ShareCompilationContent)) {
                                                                parse5 = null;
                                                            }
                                                            ShareCompilationContent shareCompilationContent = (ShareCompilationContent) parse5;
                                                            if (!(shareCompilationContent == null || (awemeCoverList4 = shareCompilationContent.getAwemeCoverList()) == null)) {
                                                                num = Integer.valueOf(awemeCoverList4.size());
                                                            }
                                                            if (m99070a(num)) {
                                                                if (aiVar.isSelf()) {
                                                                    return EnumC53772b.SHARE_COMPILATION_SIMPLE_SEND;
                                                                }
                                                                return EnumC53772b.SHARE_COMPILATION_SIMPLE_RECEIVE;
                                                            } else if (aiVar.isSelf()) {
                                                                return EnumC53772b.SHARE_COMPILATION_MULTI_SEND;
                                                            } else {
                                                                return EnumC53772b.SHARE_COMPILATION_MULTI_RECEIVE;
                                                            }
                                                        } else if (msgType != 72) {
                                                            switch (msgType) {
                                                                case 1004:
                                                                    if (aiVar.isSelf()) {
                                                                        return EnumC53772b.GROUP_ANNOUNCEMENT_SEND;
                                                                    }
                                                                    return EnumC53772b.GROUP_ANNOUNCEMENT_RECEIVE;
                                                                case 1005:
                                                                    return EnumC53772b.PUSH_NOTIFICATION_GUIDE;
                                                                case 1006:
                                                                    break;
                                                                case 1007:
                                                                    return EnumC53772b.NOTICE_DANGER_WARNNING_TOP;
                                                                default:
                                                                    switch (msgType) {
                                                                        case 1030:
                                                                            return EnumC53772b.GROUP_GREETING_MSG;
                                                                        case 1031:
                                                                            return EnumC53772b.GROUP_SYSTEM_MSG;
                                                                        case 1032:
                                                                            return EnumC53772b.CARD;
                                                                        case 1033:
                                                                            if (aiVar.isSelf()) {
                                                                                return EnumC53772b.GROUP_INVITE_SEND;
                                                                            }
                                                                            return EnumC53772b.GROUP_INVITE_RECEIVE;
                                                                        case 1034:
                                                                            if (aiVar.isSelf()) {
                                                                                return EnumC53772b.SHARE_LIVE_EVENT_SEND;
                                                                            }
                                                                            return EnumC53772b.SHARE_LIVE_EVENT_RECEIVE;
                                                                        default:
                                                                            if (aiVar.isSelf()) {
                                                                                return EnumC53772b.DEFAULT_SEND;
                                                                            }
                                                                            return EnumC53772b.DEFAULT_RECEIVE;
                                                                    }
                                                            }
                                                        } else {
                                                            BaseContent parse6 = EnumC53772b.SHARE_STICKER_MULTI_RECEIVE.parse(aiVar);
                                                            if (!(parse6 instanceof ShareStickerContent)) {
                                                                parse6 = null;
                                                            }
                                                            ShareStickerContent shareStickerContent = (ShareStickerContent) parse6;
                                                            if (!(shareStickerContent == null || (awemeCoverList5 = shareStickerContent.getAwemeCoverList()) == null)) {
                                                                num = Integer.valueOf(awemeCoverList5.size());
                                                            }
                                                            if (m99070a(num)) {
                                                                if (aiVar.isSelf()) {
                                                                    return EnumC53772b.SHARE_STICKER_SIMPLE_SEND;
                                                                }
                                                                return EnumC53772b.SHARE_STICKER_SIMPLE_RECEIVE;
                                                            } else if (aiVar.isSelf()) {
                                                                return EnumC53772b.SHARE_STICKER_MULTI_SEND;
                                                            } else {
                                                                return EnumC53772b.SHARE_STICKER_MULTI_RECEIVE;
                                                            }
                                                        }
                                                    } else if (aiVar.isSelf()) {
                                                        return EnumC53772b.SHARE_WEB_SEND;
                                                    } else {
                                                        return EnumC53772b.SHARE_WEB_RECEIVE;
                                                    }
                                                } else if (aiVar.isSelf()) {
                                                    return EnumC53772b.SHARE_LIVE_SEND;
                                                } else {
                                                    return EnumC53772b.SHARE_LIVE_RECEIVE;
                                                }
                                            } else if (aiVar.isSelf()) {
                                                return EnumC53772b.SHARE_AWEME_SEND;
                                            } else {
                                                return EnumC53772b.SHARE_AWEME_RECEIVE;
                                            }
                                        } else if (aiVar.isSelf()) {
                                            return EnumC53772b.SHARE_SEARCH_SEND;
                                        } else {
                                            return EnumC53772b.SHARE_SEARCH_RECEIVE;
                                        }
                                    } else if (aiVar.isSelf()) {
                                        return EnumC53772b.SHARE_STORY_SEND;
                                    } else {
                                        return EnumC53772b.SHARE_STORY_RECEIVE;
                                    }
                                } else if (aiVar.isSelf()) {
                                    return EnumC53772b.SHARE_LIVE_SEND;
                                } else {
                                    return EnumC53772b.SHARE_LIVE_RECEIVE;
                                }
                            } else if (aiVar.isSelf()) {
                                return EnumC53772b.COMMENT_SEND;
                            } else {
                                return EnumC53772b.COMMENT_RECEIVE;
                            }
                        } else if (C55051d.m100669a()) {
                            BaseContent parse7 = EnumC53772b.SHARE_QNA_MULTI_RECEIVE.parse(aiVar);
                            if (!(parse7 instanceof ShareQnAContent)) {
                                parse7 = null;
                            }
                            ShareQnAContent shareQnAContent = (ShareQnAContent) parse7;
                            if (!(shareQnAContent == null || (awemeCoverList = shareQnAContent.getAwemeCoverList()) == null)) {
                                num = Integer.valueOf(awemeCoverList.size());
                            }
                            if (m99070a(num)) {
                                if (aiVar.isSelf()) {
                                    return EnumC53772b.SHARE_QNA_SIMPLE_SEND;
                                }
                                return EnumC53772b.SHARE_QNA_SIMPLE_RECEIVE;
                            } else if (aiVar.isSelf()) {
                                return EnumC53772b.SHARE_QNA_MULTI_SEND;
                            } else {
                                return EnumC53772b.SHARE_QNA_MULTI_RECEIVE;
                            }
                        } else if (aiVar.isSelf()) {
                            return EnumC53772b.DEFAULT_SEND;
                        } else {
                            return EnumC53772b.DEFAULT_RECEIVE;
                        }
                    } else if (aiVar.isSelf()) {
                        return EnumC53772b.BIG_EMOJI_SEND;
                    } else {
                        return EnumC53772b.BIG_EMOJI_RECEIVE;
                    }
                }
                return EnumC53772b.SYSTEM_RECEIVE;
            } else if (aiVar.isSelf()) {
                return EnumC53772b.DEFAULT_SEND;
            } else {
                return EnumC53772b.DEFAULT_RECEIVE;
            }
        }

        /* renamed from: a */
        public final BaseContent mo90397a(int i, String str, boolean z, long j) {
            if (str == null || str.length() == 0) {
                C56244a.m102185a("MessageViewType", "Content of stranger message is empty");
                return new TextContent(null, false, 3, null);
            }
            C19538ai aiVar = new C19538ai();
            Map<String, String> ext = aiVar.getExt();
            C89219l.m154716b(ext, "");
            ext.put("s:is_recalled", String.valueOf(z));
            aiVar.setContent(str);
            aiVar.setMsgType(i);
            aiVar.setSender(j);
            return m99071b(aiVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.e.b$g */
    static final class C53815g extends EnumC53772b {

        /* renamed from: a */
        private final int f123411a = EnumC53772b.TEXT_RECEIVE.getItemLayoutId();

        /* renamed from: b */
        private final Class<? extends BaseContent> f123412b = EnumC53772b.TEXT_RECEIVE.getMessageContentClazz();

        static {
            Covode.recordClassIndex(63395);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final int getItemLayoutId() {
            return this.f123411a;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final Class<? extends BaseContent> getMessageContentClazz() {
            return this.f123412b;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final String getMsgHint(BaseContent baseContent) {
            C89219l.m154721d(baseContent, "");
            return C53814f.m99069a(false);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53815g(String str) {
            super(str, 12, null);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final BaseContent parse(C19538ai aiVar) {
            C89219l.m154721d(aiVar, "");
            return new TextContent(C53814f.m99069a(false), true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.e.b$h */
    static final class C53816h extends EnumC53772b {

        /* renamed from: a */
        private final int f123413a = EnumC53772b.TEXT_SEND.getItemLayoutId();

        /* renamed from: b */
        private final Class<? extends BaseContent> f123414b = EnumC53772b.TEXT_SEND.getMessageContentClazz();

        static {
            Covode.recordClassIndex(63396);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final int getItemLayoutId() {
            return this.f123413a;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final Class<? extends BaseContent> getMessageContentClazz() {
            return this.f123414b;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final String getMsgHint(BaseContent baseContent) {
            C89219l.m154721d(baseContent, "");
            return C53814f.m99069a(true);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final BaseContent parse(C19538ai aiVar) {
            C89219l.m154721d(aiVar, "");
            return new TextContent(C53814f.m99069a(true), true);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53816h(String str) {
            super(str, 13, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.e.b$i */
    static final class C53817i extends EnumC53772b {

        /* renamed from: a */
        private final int f123415a = R.layout.a5g;

        /* renamed from: b */
        private final Class<GroupAnnouncementContent> f123416b = GroupAnnouncementContent.class;

        static {
            Covode.recordClassIndex(63397);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final int getItemLayoutId() {
            return this.f123415a;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final Class<GroupAnnouncementContent> getMessageContentClazz() {
            return this.f123416b;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53817i(String str) {
            super(str, 45, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.e.b$j */
    static final class C53818j extends EnumC53772b {

        /* renamed from: a */
        private final int f123417a = R.layout.a5h;

        /* renamed from: b */
        private final Class<GroupAnnouncementContent> f123418b = GroupAnnouncementContent.class;

        static {
            Covode.recordClassIndex(63398);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final int getItemLayoutId() {
            return this.f123417a;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final Class<GroupAnnouncementContent> getMessageContentClazz() {
            return this.f123418b;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53818j(String str) {
            super(str, 46, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.e.b$k */
    static final class C53819k extends EnumC53772b {

        /* renamed from: a */
        private final int f123419a = R.layout.a5j;

        /* renamed from: b */
        private final Class<GroupGreetingContent> f123420b = GroupGreetingContent.class;

        static {
            Covode.recordClassIndex(63399);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final int getItemLayoutId() {
            return this.f123419a;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final Class<GroupGreetingContent> getMessageContentClazz() {
            return this.f123420b;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53819k(String str) {
            super(str, 55, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.e.b$l */
    static final class C53820l extends EnumC53772b {

        /* renamed from: a */
        private final int f123421a = R.layout.a5f;

        /* renamed from: b */
        private final Class<SayHelloContent> f123422b = SayHelloContent.class;

        static {
            Covode.recordClassIndex(63400);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final int getItemLayoutId() {
            return this.f123421a;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final Class<SayHelloContent> getMessageContentClazz() {
            return this.f123422b;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53820l(String str) {
            super(str, 36, null);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final BaseContent parse(C19538ai aiVar) {
            C89219l.m154721d(aiVar, "");
            BaseContent parse = EnumC53772b.super.parse(aiVar);
            if (!(parse instanceof SayHelloContent)) {
                parse = null;
            }
            SayHelloContent sayHelloContent = (SayHelloContent) parse;
            if (sayHelloContent == null) {
                return null;
            }
            sayHelloContent.setMsgHint("[" + C17867d.m33078a().getString(R.string.cdj) + ']');
            sayHelloContent.optimise();
            return sayHelloContent;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.e.b$m */
    static final class C53821m extends EnumC53772b {

        /* renamed from: a */
        private final int f123423a = R.layout.a5k;

        /* renamed from: b */
        private final Class<GroupInviteCardContent> f123424b = GroupInviteCardContent.class;

        static {
            Covode.recordClassIndex(63401);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final int getItemLayoutId() {
            return this.f123423a;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final Class<GroupInviteCardContent> getMessageContentClazz() {
            return this.f123424b;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53821m(String str) {
            super(str, 62, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.e.b$n */
    static final class C53822n extends EnumC53772b {

        /* renamed from: a */
        private final int f123425a = R.layout.a5l;

        /* renamed from: b */
        private final Class<GroupInviteCardContent> f123426b = GroupInviteCardContent.class;

        static {
            Covode.recordClassIndex(63402);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final int getItemLayoutId() {
            return this.f123425a;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final Class<GroupInviteCardContent> getMessageContentClazz() {
            return this.f123426b;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53822n(String str) {
            super(str, 61, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.e.b$o */
    static final class C53823o extends EnumC53772b {

        /* renamed from: a */
        private final int f123427a = R.layout.a66;

        /* renamed from: b */
        private final Class<GroupSystemContent> f123428b = GroupSystemContent.class;

        static {
            Covode.recordClassIndex(63403);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final int getItemLayoutId() {
            return this.f123427a;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final Class<GroupSystemContent> getMessageContentClazz() {
            return this.f123428b;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53823o(String str) {
            super(str, 56, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.e.b$p */
    static final class C53824p extends EnumC53772b {

        /* renamed from: a */
        private final int f123429a = R.layout.a59;

        static {
            Covode.recordClassIndex(63404);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final String getMsgHint(BaseContent baseContent) {
            C89219l.m154721d(baseContent, "");
            return "";
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final int getItemLayoutId() {
            return this.f123429a;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53824p(String str) {
            super(str, 11, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.e.b$q */
    static final class C53825q extends EnumC53772b {

        /* renamed from: a */
        private final int f123430a = R.layout.a6a;

        /* renamed from: b */
        private final Class<SystemContent> f123431b = SystemContent.class;

        static {
            Covode.recordClassIndex(63405);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final int getItemLayoutId() {
            return this.f123430a;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final Class<SystemContent> getMessageContentClazz() {
            return this.f123431b;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53825q(String str) {
            super(str, 48, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.e.b$r */
    static final class C53826r extends EnumC53772b {

        /* renamed from: a */
        private final int f123432a = R.layout.a5m;

        /* renamed from: b */
        private final Class<TextContent> f123433b = TextContent.class;

        static {
            Covode.recordClassIndex(63406);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final int getItemLayoutId() {
            return this.f123432a;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final Class<TextContent> getMessageContentClazz() {
            return this.f123433b;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53826r(String str) {
            super(str, 47, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.e.b$s */
    static final class C53827s extends EnumC53772b {

        /* renamed from: a */
        private final int f123434a = R.layout.a5n;

        /* renamed from: b */
        private final Class<SayHelloContent> f123435b = SayHelloContent.class;

        static {
            Covode.recordClassIndex(63407);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final int getItemLayoutId() {
            return this.f123434a;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final Class<SayHelloContent> getMessageContentClazz() {
            return this.f123435b;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53827s(String str) {
            super(str, 15, null);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final BaseContent parse(C19538ai aiVar) {
            C89219l.m154721d(aiVar, "");
            BaseContent parse = EnumC53772b.super.parse(aiVar);
            if (!(parse instanceof SayHelloContent)) {
                parse = null;
            }
            SayHelloContent sayHelloContent = (SayHelloContent) parse;
            if (sayHelloContent == null) {
                return null;
            }
            String string = C17867d.m33078a().getResources().getString(R.string.cgr);
            C89219l.m154716b(string, "");
            String a = C1764a.m5928a(string, Arrays.copyOf(new Object[]{sayHelloContent.nickname}, 1));
            C89219l.m154716b(a, "");
            sayHelloContent.setMsgHint(a);
            sayHelloContent.optimise();
            return sayHelloContent;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.e.b$t */
    static final class C53828t extends EnumC53772b {

        /* renamed from: a */
        private final int f123436a = R.layout.a63;

        /* renamed from: b */
        private final Class<ShareAwemeContent> f123437b = ShareAwemeContent.class;

        static {
            Covode.recordClassIndex(63408);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final int getItemLayoutId() {
            return this.f123436a;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final Class<ShareAwemeContent> getMessageContentClazz() {
            return this.f123437b;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53828t(String str) {
            super(str, 3, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.e.b$u */
    static final class C53829u extends EnumC53772b {

        /* renamed from: a */
        private final int f123438a = R.layout.a64;

        /* renamed from: b */
        private final Class<ShareAwemeContent> f123439b = ShareAwemeContent.class;

        static {
            Covode.recordClassIndex(63409);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final int getItemLayoutId() {
            return this.f123438a;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final Class<ShareAwemeContent> getMessageContentClazz() {
            return this.f123439b;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53829u(String str) {
            super(str, 4, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.e.b$v */
    static final class C53830v extends EnumC53772b {

        /* renamed from: a */
        private final int f123440a = R.layout.a5x;

        /* renamed from: b */
        private final Class<ShareChallengeContent> f123441b = ShareChallengeContent.class;

        static {
            Covode.recordClassIndex(63410);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final int getItemLayoutId() {
            return this.f123440a;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final Class<ShareChallengeContent> getMessageContentClazz() {
            return this.f123441b;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53830v(String str) {
            super(str, 25, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.e.b$w */
    static final class C53831w extends EnumC53772b {

        /* renamed from: a */
        private final int f123442a = R.layout.a5y;

        /* renamed from: b */
        private final Class<ShareChallengeContent> f123443b = ShareChallengeContent.class;

        static {
            Covode.recordClassIndex(63411);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final int getItemLayoutId() {
            return this.f123442a;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final Class<ShareChallengeContent> getMessageContentClazz() {
            return this.f123443b;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53831w(String str) {
            super(str, 24, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.e.b$x */
    static final class C53832x extends EnumC53772b {

        /* renamed from: a */
        private final int f123444a = R.layout.a61;

        /* renamed from: b */
        private final Class<ShareChallengeContent> f123445b = ShareChallengeContent.class;

        static {
            Covode.recordClassIndex(63412);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final int getItemLayoutId() {
            return this.f123444a;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final Class<ShareChallengeContent> getMessageContentClazz() {
            return this.f123445b;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53832x(String str) {
            super(str, 27, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.e.b$y */
    static final class C53833y extends EnumC53772b {

        /* renamed from: a */
        private final int f123446a = R.layout.a62;

        /* renamed from: b */
        private final Class<ShareChallengeContent> f123447b = ShareChallengeContent.class;

        static {
            Covode.recordClassIndex(63413);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final int getItemLayoutId() {
            return this.f123446a;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final Class<ShareChallengeContent> getMessageContentClazz() {
            return this.f123447b;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53833y(String str) {
            super(str, 26, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.e.b$z */
    static final class C53834z extends EnumC53772b {

        /* renamed from: a */
        private final int f123448a = R.layout.a5x;

        /* renamed from: b */
        private final Class<ShareCompilationContent> f123449b = ShareCompilationContent.class;

        static {
            Covode.recordClassIndex(63414);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final int getItemLayoutId() {
            return this.f123448a;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b
        public final Class<ShareCompilationContent> getMessageContentClazz() {
            return this.f123449b;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53834z(String str) {
            super(str, 37, null);
        }
    }

    public int getItemLayoutId() {
        return this.f123327c;
    }

    public Class<? extends BaseContent> getMessageContentClazz() {
        return this.f123328d;
    }

    public final int getViewType() {
        return this.f123326b;
    }

    static {
        Covode.recordClassIndex(63352);
        C53805be beVar = new C53805be("SYSTEM_RECEIVE");
        SYSTEM_RECEIVE = beVar;
        C53808bh bhVar = new C53808bh("TEXT_RECEIVE");
        TEXT_RECEIVE = bhVar;
        C53809bi biVar = new C53809bi("TEXT_SEND");
        TEXT_SEND = biVar;
        C53828t tVar = new C53828t("SHARE_AWEME_RECEIVE");
        SHARE_AWEME_RECEIVE = tVar;
        C53829u uVar = new C53829u("SHARE_AWEME_SEND");
        SHARE_AWEME_SEND = uVar;
        C53795av avVar = new C53795av("SHARE_STORY_RECEIVE");
        SHARE_STORY_RECEIVE = avVar;
        C53796aw awVar = new C53796aw("SHARE_STORY_SEND");
        SHARE_STORY_SEND = awVar;
        C53773a aVar = new C53773a("BIG_EMOJI_RECEIVE");
        BIG_EMOJI_RECEIVE = aVar;
        C53800b bVar = new C53800b("BIG_EMOJI_SEND");
        BIG_EMOJI_SEND = bVar;
        C53812d dVar = new C53812d("COMMENT_RECEIVE");
        COMMENT_RECEIVE = dVar;
        C53813e eVar = new C53813e("COMMENT_SEND");
        COMMENT_SEND = eVar;
        C53824p pVar = new C53824p("LOAD_MORE");
        LOAD_MORE = pVar;
        C53815g gVar = new C53815g("DEFAULT_RECEIVE");
        DEFAULT_RECEIVE = gVar;
        C53816h hVar = new C53816h("DEFAULT_SEND");
        DEFAULT_SEND = hVar;
        C53810bj bjVar = new C53810bj("VIDEO_UPDATE_TIPS");
        VIDEO_UPDATE_TIPS = bjVar;
        C53827s sVar = new C53827s("SAY_HELLO");
        SAY_HELLO = sVar;
        C53782ai aiVar = new C53782ai("SHARE_MUSIC_MULTI_SEND");
        SHARE_MUSIC_MULTI_SEND = aiVar;
        C53781ah ahVar = new C53781ah("SHARE_MUSIC_MULTI_RECEIVE");
        SHARE_MUSIC_MULTI_RECEIVE = ahVar;
        C53784ak akVar = new C53784ak("SHARE_MUSIC_SIMPLE_SEND");
        SHARE_MUSIC_SIMPLE_SEND = akVar;
        C53783aj ajVar = new C53783aj("SHARE_MUSIC_SIMPLE_RECEIVE");
        SHARE_MUSIC_SIMPLE_RECEIVE = ajVar;
        C53778ae aeVar = new C53778ae("SHARE_LIVE_EVENT_SEND");
        SHARE_LIVE_EVENT_SEND = aeVar;
        C53777ad adVar = new C53777ad("SHARE_LIVE_EVENT_RECEIVE");
        SHARE_LIVE_EVENT_RECEIVE = adVar;
        C53790aq aqVar = new C53790aq("SHARE_SEARCH_SEND");
        SHARE_SEARCH_SEND = aqVar;
        C53789ap apVar = new C53789ap("SHARE_SEARCH_RECEIVE");
        SHARE_SEARCH_RECEIVE = apVar;
        C53831w wVar = new C53831w("SHARE_CHALLENGE_MULTI_SEND");
        SHARE_CHALLENGE_MULTI_SEND = wVar;
        C53830v vVar = new C53830v("SHARE_CHALLENGE_MULTI_RECEIVE");
        SHARE_CHALLENGE_MULTI_RECEIVE = vVar;
        C53833y yVar = new C53833y("SHARE_CHALLENGE_SIMPLE_SEND");
        SHARE_CHALLENGE_SIMPLE_SEND = yVar;
        C53832x xVar = new C53832x("SHARE_CHALLENGE_SIMPLE_RECEIVE");
        SHARE_CHALLENGE_SIMPLE_RECEIVE = xVar;
        C53798ay ayVar = new C53798ay("SHARE_USER_MULTI_SEND");
        SHARE_USER_MULTI_SEND = ayVar;
        C53797ax axVar = new C53797ax("SHARE_USER_MULTI_RECEIVE");
        SHARE_USER_MULTI_RECEIVE = axVar;
        C53801ba baVar = new C53801ba("SHARE_USER_SIMPLE_SEND");
        SHARE_USER_SIMPLE_SEND = baVar;
        C53799az azVar = new C53799az("SHARE_USER_SIMPLE_RECEIVE");
        SHARE_USER_SIMPLE_RECEIVE = azVar;
        C53803bc bcVar = new C53803bc("SHARE_WEB_SEND");
        SHARE_WEB_SEND = bcVar;
        C53802bb bbVar = new C53802bb("SHARE_WEB_RECEIVE");
        SHARE_WEB_RECEIVE = bbVar;
        C53780ag agVar = new C53780ag("SHARE_LIVE_SEND");
        SHARE_LIVE_SEND = agVar;
        C53779af afVar = new C53779af("SHARE_LIVE_RECEIVE");
        SHARE_LIVE_RECEIVE = afVar;
        C53820l lVar = new C53820l("GROUP_GREET_TIPS");
        GROUP_GREET_TIPS = lVar;
        C53834z zVar = new C53834z("SHARE_COMPILATION_MULTI_RECEIVE");
        SHARE_COMPILATION_MULTI_RECEIVE = zVar;
        C53774aa aaVar = new C53774aa("SHARE_COMPILATION_MULTI_SEND");
        SHARE_COMPILATION_MULTI_SEND = aaVar;
        C53775ab abVar = new C53775ab("SHARE_COMPILATION_SIMPLE_RECEIVE");
        SHARE_COMPILATION_SIMPLE_RECEIVE = abVar;
        C53776ac acVar = new C53776ac("SHARE_COMPILATION_SIMPLE_SEND");
        SHARE_COMPILATION_SIMPLE_SEND = acVar;
        C53791ar arVar = new C53791ar("SHARE_STICKER_MULTI_RECEIVE");
        SHARE_STICKER_MULTI_RECEIVE = arVar;
        C53792as asVar = new C53792as("SHARE_STICKER_MULTI_SEND");
        SHARE_STICKER_MULTI_SEND = asVar;
        C53793at atVar = new C53793at("SHARE_STICKER_SIMPLE_RECEIVE");
        SHARE_STICKER_SIMPLE_RECEIVE = atVar;
        C53794au auVar = new C53794au("SHARE_STICKER_SIMPLE_SEND");
        SHARE_STICKER_SIMPLE_SEND = auVar;
        C53817i iVar = new C53817i("GROUP_ANNOUNCEMENT_RECEIVE");
        GROUP_ANNOUNCEMENT_RECEIVE = iVar;
        C53818j jVar = new C53818j("GROUP_ANNOUNCEMENT_SEND");
        GROUP_ANNOUNCEMENT_SEND = jVar;
        C53826r rVar = new C53826r("PUSH_NOTIFICATION_GUIDE");
        PUSH_NOTIFICATION_GUIDE = rVar;
        C53825q qVar = new C53825q("NOTICE_DANGER_WARNNING_TOP");
        NOTICE_DANGER_WARNNING_TOP = qVar;
        EnumC53772b bVar2 = new EnumC53772b("SHARE_WEB_FROM_THIRD_SEND", 49);
        SHARE_WEB_FROM_THIRD_SEND = bVar2;
        EnumC53772b bVar3 = new EnumC53772b("SHARE_WEB_FROM_THIRD_RECEIVE", 50);
        SHARE_WEB_FROM_THIRD_RECEIVE = bVar3;
        C53807bg bgVar = new C53807bg("TEXT_BIG_EMOJI_SEND");
        TEXT_BIG_EMOJI_SEND = bgVar;
        C53806bf bfVar = new C53806bf("TEXT_BIG_EMOJI_RECEIVE");
        TEXT_BIG_EMOJI_RECEIVE = bfVar;
        C53804bd bdVar = new C53804bd("STRANGER_GREET_TIPS");
        STRANGER_GREET_TIPS = bdVar;
        C53811c cVar = new C53811c("CARD");
        CARD = cVar;
        C53819k kVar = new C53819k("GROUP_GREETING_MSG");
        GROUP_GREETING_MSG = kVar;
        C53823o oVar = new C53823o("GROUP_SYSTEM_MSG");
        GROUP_SYSTEM_MSG = oVar;
        C53786am amVar = new C53786am("SHARE_QNA_MULTI_SEND");
        SHARE_QNA_MULTI_SEND = amVar;
        C53785al alVar = new C53785al("SHARE_QNA_MULTI_RECEIVE");
        SHARE_QNA_MULTI_RECEIVE = alVar;
        C53788ao aoVar = new C53788ao("SHARE_QNA_SIMPLE_SEND");
        SHARE_QNA_SIMPLE_SEND = aoVar;
        C53787an anVar = new C53787an("SHARE_QNA_SIMPLE_RECEIVE");
        SHARE_QNA_SIMPLE_RECEIVE = anVar;
        C53822n nVar = new C53822n("GROUP_INVITE_SEND");
        GROUP_INVITE_SEND = nVar;
        C53821m mVar = new C53821m("GROUP_INVITE_RECEIVE");
        GROUP_INVITE_RECEIVE = mVar;
        f123325a = new EnumC53772b[]{beVar, bhVar, biVar, tVar, uVar, avVar, awVar, aVar, bVar, dVar, eVar, pVar, gVar, hVar, bjVar, sVar, aiVar, ahVar, akVar, ajVar, aeVar, adVar, aqVar, apVar, wVar, vVar, yVar, xVar, ayVar, axVar, baVar, azVar, bcVar, bbVar, agVar, afVar, lVar, zVar, aaVar, abVar, acVar, arVar, asVar, atVar, auVar, iVar, jVar, rVar, qVar, bVar2, bVar3, bgVar, bfVar, bdVar, cVar, kVar, oVar, amVar, alVar, aoVar, anVar, nVar, mVar};
        EnumC53772b[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C89271h.m154769b(C89041ag.m154411a(values.length), 16));
        for (EnumC53772b bVar4 : values) {
            linkedHashMap.put(Integer.valueOf(bVar4.f123326b), bVar4);
        }
        lookupMap = linkedHashMap;
    }

    public String getMsgHint(BaseContent baseContent) {
        C89219l.m154721d(baseContent, "");
        String msgHint = baseContent.getMsgHint();
        if (msgHint == null) {
            return "";
        }
        return msgHint;
    }

    public static final EnumC53772b valueOf(int i) {
        EnumC53772b bVar = lookupMap.get(Integer.valueOf(i));
        if (bVar == null) {
            return DEFAULT_RECEIVE;
        }
        return bVar;
    }

    public BaseContent parse(C19538ai aiVar) {
        BaseContent baseContent;
        C89219l.m154721d(aiVar, "");
        String content = aiVar.getContent();
        try {
            baseContent = (BaseContent) C55214j.m100957a(content, getMessageContentClazz());
            if (baseContent != null) {
                return baseContent;
            }
            try {
                C56244a.m102185a("MessageViewType", "MessageViewType parse: itemType:" + this.f123326b + " messageStr:" + aiVar);
                C56244a.m102185a("MessageViewType", "MessageViewType parse: itemType:" + this.f123326b + " contentStr:" + content);
                baseContent = (BaseContent) getMessageContentClazz().newInstance();
                return baseContent;
            } catch (IllegalAccessException e) {
                C56244a.m102187a("MessageViewType", e);
                return baseContent;
            } catch (InstantiationException e2) {
                C56244a.m102187a("MessageViewType", e2);
                return baseContent;
            }
        } catch (Exception e3) {
            C56244a.m102187a("MessageViewType", e3);
            baseContent = null;
        }
    }

    public final AbstractC54482a<?> getViewHolder(View view) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(this, "");
        C89219l.m154721d(view, "");
        switch (C54485a.f124833a[ordinal()]) {
            case 1:
            case 2:
                return new C54538bk(view, this);
            case 3:
            case 4:
                return new C54535bj(view, this);
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                return new C54565s(view);
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                return new C54570v(view, this);
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                return new C54562q(view);
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                return new C54534bi(view, this);
            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                return new C54538bk(view, this);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                return new C54535bj(view, this);
            case ABRConfig.ABR_SELECT_SCENE:
                return new C54555k(view);
            case 15:
                return new C54554j(view, this);
            case 16:
                return new C54540bl(view, this);
            case 17:
                return new C54546h(view, this);
            case LiveRechargeAgeThresholdSetting.DEFAULT:
                return new C54547i(view, this);
            case 19:
                return new C53856d(view, this);
            case C84224v.f188239U:
                return new C54502al(view, this);
            case 21:
                return new C54504am(view, this);
            case 22:
                return new C54505an(view, this);
            case 23:
                return new C54506ao(view, this);
            case 24:
                return new C54507ap(view, this);
            case 25:
                return new C54508aq(view, this);
            case 26:
                return new C54509ar(view, this);
            case 27:
                return new C54510as(view, this);
            case 28:
                return new C54490ae(view, this);
            case 29:
                return new C54491af(view, this);
            case 30:
                return new C54575z(view, this);
            case 31:
                return new C54571w(view, this);
            case 32:
                return new C54573y(view, this);
            case 33:
                return new C54572x(view, this);
            case 34:
                return new C54520ba(view, this);
            case 35:
                return new C54521bb(view, this);
            case 36:
                return new C54522bc(view, this);
            case 37:
                return new C54523bd(view, this);
            case 38:
                return new C54524be(view, this);
            case 39:
                return new C54525bf(view, this);
            case 40:
                return new C54511at(view, this);
            case 41:
                return new C54512au(view, this);
            case 42:
                return new C54492ag(view);
            case 43:
                return new C54495aj(view, this);
            case BuildConfig.VERSION_CODE:
                return new C54489ad(view, this);
            case 45:
                return new C54486aa(view, this);
            case 46:
                return new C54488ac(view, this);
            case 47:
                return new C54487ab(view, this);
            case 48:
                return new C54517az(view, this);
            case 49:
                return new C54514aw(view, this);
            case 50:
                return new C54516ay(view, this);
            case 51:
                return new C54515ax(view, this);
            case 52:
                return new C54557m(view, this);
            case 53:
                return new C54556l(view, this);
            case 54:
                return new C54564r(view, this);
            case 55:
                return new C54531bh(view, this);
            case 56:
                return new C54069d(view, this);
            case 57:
                return new C54559o(view, this);
            case 58:
                return new C54558n(view, this);
            default:
                return new C54538bk(view, this);
        }
    }

    private EnumC53772b(String str, int i) {
        this.f123326b = ordinal();
        this.f123327c = R.layout.a69;
        this.f123328d = TextContent.class;
    }

    public /* synthetic */ EnumC53772b(String str, int i, C89214g gVar) {
        this(str, i);
    }
}
