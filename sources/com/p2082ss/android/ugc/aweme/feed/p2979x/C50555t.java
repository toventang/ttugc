package com.p2082ss.android.ugc.aweme.feed.p2979x;

import android.content.Context;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.CaptionItemModel;
import com.p2082ss.android.ugc.aweme.feed.model.CaptionLanguage;
import com.p2082ss.android.ugc.aweme.feed.model.CaptionModel;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.Iterator;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.x.t */
public final class C50555t {

    /* renamed from: a */
    public static final String f116844a = "cla_crowdsourcing_onboarding_complete";

    /* renamed from: b */
    public static final C50555t f116845b = new C50555t();

    private C50555t() {
    }

    static {
        Covode.recordClassIndex(59702);
    }

    /* renamed from: a */
    public static final boolean m94782a(CaptionItemModel captionItemModel) {
        C89219l.m154721d(captionItemModel, "");
        return C89219l.m154714a((Object) captionItemModel.getVersionType(), (Object) "20");
    }

    /* renamed from: a */
    public static final CaptionItemModel m94779a(Aweme aweme) {
        Long l;
        CaptionModel captionModel;
        List<CaptionItemModel> captionList;
        CaptionModel captionModel2;
        CaptionLanguage originalCaptionLanguage;
        T t = null;
        if (aweme == null) {
            return null;
        }
        Video video = aweme.getVideo();
        if (video == null || (captionModel2 = video.getCaptionModel()) == null || (originalCaptionLanguage = captionModel2.getOriginalCaptionLanguage()) == null) {
            l = null;
            if (aweme == null) {
                return null;
            }
        } else {
            l = Long.valueOf(originalCaptionLanguage.getLanguageId());
        }
        Video video2 = aweme.getVideo();
        if (video2 == null || (captionModel = video2.getCaptionModel()) == null || (captionList = captionModel.getCaptionList()) == null) {
            return null;
        }
        Iterator<T> it = captionList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            long languageId = next.getLanguageId();
            if (l != null && l.longValue() == languageId) {
                t = next;
                break;
            }
        }
        return t;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0047 A[EDGE_INSN: B:28:0x0047->B:21:0x0047 ?: BREAK  , SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.p2082ss.android.ugc.aweme.feed.model.CaptionItemModel m94783b(com.p2082ss.android.ugc.aweme.feed.model.Aweme r9) {
        /*
            r8 = 0
            if (r9 == 0) goto L_0x0049
            com.ss.android.ugc.aweme.feed.model.Video r0 = r9.getVideo()
            if (r0 == 0) goto L_0x0053
            com.ss.android.ugc.aweme.feed.model.CaptionModel r0 = r0.getCaptionModel()
            if (r0 == 0) goto L_0x0053
            com.ss.android.ugc.aweme.feed.model.CaptionLanguage r0 = r0.getOriginalCaptionLanguage()
            if (r0 == 0) goto L_0x0053
            long r0 = r0.getLanguageId()
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
        L_0x001d:
            com.ss.android.ugc.aweme.feed.model.Video r0 = r9.getVideo()
            if (r0 == 0) goto L_0x0049
            com.ss.android.ugc.aweme.feed.model.CaptionModel r0 = r0.getCaptionModel()
            if (r0 == 0) goto L_0x0049
            java.util.List r0 = r0.getCaptionList()
            if (r0 == 0) goto L_0x0049
            java.util.Iterator r6 = r0.iterator()
        L_0x0033:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0047
            java.lang.Object r5 = r6.next()
            r0 = r5
            com.ss.android.ugc.aweme.feed.model.CaptionItemModel r0 = (com.p2082ss.android.ugc.aweme.feed.model.CaptionItemModel) r0
            long r3 = r0.getLanguageId()
            if (r7 != 0) goto L_0x004a
        L_0x0046:
            r8 = r5
        L_0x0047:
            com.ss.android.ugc.aweme.feed.model.CaptionItemModel r8 = (com.p2082ss.android.ugc.aweme.feed.model.CaptionItemModel) r8
        L_0x0049:
            return r8
        L_0x004a:
            long r1 = r7.longValue()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0033
            goto L_0x0046
        L_0x0053:
            r7 = r8
            if (r9 == 0) goto L_0x0049
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.p2979x.C50555t.m94783b(com.ss.android.ugc.aweme.feed.model.Aweme):com.ss.android.ugc.aweme.feed.model.CaptionItemModel");
    }

    /* renamed from: a */
    public static final void m94781a(Context context, String str, String str2, boolean z, Aweme aweme) {
        String str3;
        String str4;
        String str5;
        CaptionItemModel b;
        Video video;
        CaptionModel captionModel;
        CaptionLanguage originalCaptionLanguage;
        User author;
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        StringBuilder append = new StringBuilder("https://www.tiktok.com/web-inapp/cla/crowdsourcing/translation-center?enter_from=").append(str2).append("&translator_id=").append(str).append("&group_id=");
        String str6 = null;
        if (aweme != null) {
            str3 = aweme.getGroupId();
        } else {
            str3 = null;
        }
        StringBuilder append2 = append.append(str3).append("&author_id=");
        if (aweme == null || (author = aweme.getAuthor()) == null) {
            str4 = null;
        } else {
            str4 = author.getUid();
        }
        StringBuilder append3 = append2.append(str4).append("&video_lang=");
        if (aweme == null || (video = aweme.getVideo()) == null || (captionModel = video.getCaptionModel()) == null || (originalCaptionLanguage = captionModel.getOriginalCaptionLanguage()) == null) {
            str5 = null;
        } else {
            str5 = originalCaptionLanguage.getLanguageName();
        }
        StringBuilder append4 = append3.append(str5).append("&transl_lang=");
        if (!(aweme == null || (b = m94783b(aweme)) == null)) {
            str6 = b.getLanguageName();
        }
        String sb = append4.append(str6).toString();
        if (z) {
            sb = sb + "&tab=translations";
        }
        SmartRouter.buildRoute(context, "aweme://webview").withParam(Uri.parse(sb)).withParam("hide_nav_bar", true).open();
    }
}
