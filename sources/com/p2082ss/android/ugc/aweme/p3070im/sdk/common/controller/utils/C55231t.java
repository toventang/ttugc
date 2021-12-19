package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.C17419b;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17436f;
import com.bytedance.ies.p1208im.core.api.p1216f.C17457c;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.p2082ss.android.ugc.aweme.emoji.p2906i.p2913c.C46579b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.ActionContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.CommentContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.EmojiContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.GroupGreetingContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.GroupInviteCardContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.GroupSystemContent;
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
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.SystemCompatContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.SystemContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.TextContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.VideoUpdateTipsContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55076b;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.utils.t */
public final class C55231t {
    static {
        Covode.recordClassIndex(64978);
    }

    /* renamed from: a */
    public static void m100998a() {
        C17419b.m32261a().mo27895c();
    }

    /* renamed from: a */
    public static String m100996a(BaseContent baseContent) {
        if (baseContent instanceof ShareAwemeContent) {
            return ((ShareAwemeContent) baseContent).getSendMethod();
        }
        return "";
    }

    /* renamed from: b */
    public static void m101001b(C19538ai aiVar) {
        AbstractC17436f.C17437a.m32346a().mo27771a(aiVar, (AbstractC19479b<C19538ai>) null);
    }

    /* renamed from: a */
    public static void m100999a(C19538ai aiVar) {
        if (aiVar != null) {
            AbstractC17436f.C17437a.m32346a().mo27776b(aiVar);
        }
    }

    /* renamed from: a */
    public static int m100994a(C17457c cVar) {
        String str;
        if (!(cVar instanceof BaseContent)) {
            return -1;
        }
        if (cVar instanceof TextContent) {
            return 7;
        }
        if (cVar instanceof GroupSystemContent) {
            return 1031;
        }
        if (cVar instanceof GroupGreetingContent) {
            return 1030;
        }
        if (cVar instanceof SystemContent) {
            return 1;
        }
        if (cVar instanceof SystemCompatContent) {
            return 1006;
        }
        if (cVar instanceof ShareQnAContent) {
            return 33;
        }
        if (cVar instanceof ShareMusicContent) {
            return 22;
        }
        if (cVar instanceof ShareAwemeContent) {
            if (cVar instanceof ShareStoryContent) {
                return 1025;
            }
            return 8;
        } else if (cVar instanceof EmojiContent) {
            return 5;
        } else {
            if (cVar instanceof VideoUpdateTipsContent) {
                return 14;
            }
            if (cVar instanceof CommentContent) {
                return 40;
            }
            if (cVar instanceof ShareChallengeContent) {
                return 19;
            }
            if (cVar instanceof ShareLiveContent) {
                return 1021;
            }
            if (cVar instanceof ShareLiveEventContent) {
                return 1034;
            }
            if (cVar instanceof ShareUserContent) {
                return 25;
            }
            if (cVar instanceof ShareWebContent) {
                return 26;
            }
            if (cVar instanceof ShareSearchContent) {
                return 1036;
            }
            if (cVar instanceof ShareCompilationContent) {
                return 71;
            }
            if (cVar instanceof ShareStickerContent) {
                return 72;
            }
            if (cVar instanceof ActionContent) {
                return LiveNetAdaptiveHurryTimeSetting.DEFAULT;
            }
            if (cVar instanceof GroupInviteCardContent) {
                return 1033;
            }
            if (!C55076b.f126050c.f128178a) {
                HashMap hashMap = new HashMap();
                if (cVar != null) {
                    try {
                        str = C55214j.m100958a(cVar);
                    } catch (Exception e) {
                        hashMap.put("error", e.getMessage());
                    }
                } else {
                    str = "";
                }
                hashMap.put("error", str);
                C55197c.m100916a("error_msg_content", hashMap);
                return -1;
            }
            throw new IllegalArgumentException("Message Type is NONE!!!");
        }
    }

    /* renamed from: a */
    public static String m100997a(String str) {
        if (TextUtils.equals(str, "aweme")) {
            return "video";
        }
        if (TextUtils.equals(str, "pic")) {
            return "pic";
        }
        if (TextUtils.equals(str, "gif")) {
            return "gif";
        }
        if (TextUtils.equals(str, "text")) {
            return "text";
        }
        if (TextUtils.equals(str, "music")) {
            return "music_card";
        }
        if (TextUtils.equals(str, "challenge")) {
            return "tag_card";
        }
        if (TextUtils.equals(str, "ranking")) {
            return "hot_search_card";
        }
        if (TextUtils.equals(str, "game")) {
            return "game";
        }
        if (TextUtils.equals(str, "user")) {
            return "profile";
        }
        if (TextUtils.equals(str, "live")) {
            return "live";
        }
        if (TextUtils.equals(str, "web")) {
            return "webview";
        }
        if (TextUtils.equals(str, "qna")) {
            return "question_detail";
        }
        return "";
    }

    /* renamed from: a */
    public static void m101000a(C19538ai aiVar, AbstractC19479b<C19538ai> bVar) {
        if (aiVar != null) {
            AbstractC17436f.C17437a.m32346a().mo27773a(aiVar, false, bVar);
        }
    }

    /* renamed from: b */
    public static boolean m101002b(C19538ai aiVar, BaseContent baseContent) {
        if (baseContent == null || aiVar == null || aiVar.getExt() == null || !TextUtils.equals(aiVar.getExt().get("awe:from:commerce"), "1") || aiVar.getMsgType() != 26 || !baseContent.isCard) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static String m100995a(C19538ai aiVar, BaseContent baseContent) {
        String str;
        int msgType = aiVar.getMsgType();
        if (msgType != 5) {
            if (msgType != 19) {
                if (msgType == 33) {
                    return "question_detail";
                }
                if (msgType == 40) {
                    return "share_comment";
                }
                if (msgType == 74) {
                    return "redpacket";
                }
                if (msgType != 1021) {
                    if (msgType == 1025) {
                        return "share_story";
                    }
                    if (msgType == 1034) {
                        return "live_event";
                    }
                    if (msgType == 1036) {
                        return "share_search";
                    }
                    if (msgType == 7) {
                        if (baseContent instanceof TextContent) {
                            str = ((TextContent) baseContent).getText();
                        } else {
                            str = "";
                        }
                        C17867d.m33078a();
                        int c = C46579b.m89902c(str);
                        if (c == 1) {
                            return "emoji";
                        }
                        if (c == 0) {
                            return "text";
                        }
                        if (c == 2) {
                            return "text_emoji";
                        }
                        return "";
                    } else if (msgType == 8) {
                        return "share_video";
                    } else {
                        if (msgType != 21) {
                            if (msgType != 22) {
                                if (msgType == 71) {
                                    return "share";
                                }
                                if (msgType != 72) {
                                    switch (msgType) {
                                        case 24:
                                            return "mini_app";
                                        case 25:
                                            break;
                                        case 26:
                                            String str2 = aiVar.getLocalExt().get("message_type");
                                            if (str2 != null) {
                                                return str2;
                                            }
                                            return "unknown";
                                        default:
                                            return "unknown";
                                    }
                                }
                            }
                        }
                    }
                }
                return "live_room";
            }
            return "page";
        } else if (baseContent.getType() == 501) {
            return "favoriate_emoji";
        } else {
            if (baseContent.getType() == 502) {
                return "giphy";
            }
            if (baseContent.getType() == 504) {
                return "greet_emoji";
            }
            if (!C55076b.m100725d().isMtCase()) {
                return "emoji";
            }
            return "sticker";
        }
    }
}
