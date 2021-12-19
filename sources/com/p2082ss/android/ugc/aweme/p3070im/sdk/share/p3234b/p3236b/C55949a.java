package com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3234b.p3236b;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.framwork.core.p1006d.C14812a;
import com.bytedance.ies.p1208im.core.api.p1211b.C17438g;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.C48314ai;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.CommentContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.GroupInviteCardContent;
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
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.TextContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.story.C54346b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3170a.C55051d;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55082e;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55235x;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.DialogC55319a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3234b.p3235a.AbstractC55947a;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56257j;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56259l;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.EnumC56260m;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMConversation;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import com.p2082ss.android.ugc.aweme.p3070im.service.share.ImWebSharePackage;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.share.b.b.a */
public final class C55949a {

    /* renamed from: a */
    static Handler f127582a = new Handler(Looper.getMainLooper(), C55952c.f127587a);

    /* renamed from: b */
    private static C55954e f127583b;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.b.b.a$a */
    public interface AbstractC55950a {
        static {
            Covode.recordClassIndex(65743);
        }

        /* renamed from: a */
        void mo92808a(String str);
    }

    /* renamed from: a */
    public static void m101804a(List<IMContact> list, String str, SharePackage sharePackage, String str2, boolean z, AbstractC55947a aVar) {
        String str3;
        C56244a.m102190b("ShareHelper", "sendShareMsgCanUndo".concat(String.valueOf(str2)));
        boolean z2 = true;
        if (sharePackage == null || TextUtils.equals(sharePackage.f155492i.getString("enter_method"), "publish_share") || !TextUtils.equals(sharePackage.f155487d, "aweme") || z) {
            C56244a.m102190b("ShareHelper", "sendShareMsgCanUndo go direct send");
            m101802a(list, str, sharePackage, (BaseContent) null, str2, (String) null, aVar);
            return;
        }
        C55954e eVar = new C55954e(EnumC56260m.DEFAULT, UUID.randomUUID().toString(), sharePackage.f155492i.getString("aid"), list, str, sharePackage, str2, aVar);
        if (eVar.f127588a == EnumC56260m.DEFAULT) {
            C55954e eVar2 = f127583b;
            if (!(eVar2 == null || eVar2.f127589b.equals(eVar.f127589b) || (f127583b.f127588a == EnumC56260m.SENT && f127583b.f127588a == EnumC56260m.UNDO))) {
                C56244a.m102190b("ShareHelper", "realSendShareMsg because shareId not same" + eVar.f127589b);
                m101797a(f127583b);
            }
            f127583b = eVar;
            boolean z3 = eVar.f127593f.f155492i.getBoolean("is_ad");
            C56244a.m102190b("ShareHelper", "showShareSendingTips is direct".concat(String.valueOf(z3)));
            if (z3) {
                m101797a(eVar);
                return;
            }
            eVar.mo92821a(EnumC56260m.SENDING);
            Message obtainMessage = f127582a.obtainMessage(100);
            obtainMessage.obj = eVar;
            f127582a.sendMessageDelayed(obtainMessage, 3000);
            C56244a.m102190b("ShareHelper", "showShareSendingTips" + eVar.f127589b);
            String str4 = null;
            IMContact iMContact = C14812a.m27200a(eVar.f127591d) ? null : eVar.f127591d.get(0);
            if (eVar.f127591d == null || eVar.f127591d.size() <= 0) {
                z2 = false;
            } else if (C55082e.m100741a((IMContact[]) eVar.f127591d.toArray(new IMContact[0])).size() <= 1) {
                z2 = false;
            }
            SharePackage sharePackage2 = eVar.f127593f;
            if (sharePackage2 != null) {
                str4 = sharePackage2.f155492i.getString("enter_from");
                str3 = sharePackage2.f155492i.getString("enter_method");
            } else {
                str3 = null;
            }
            AbstractC81915c.m141874a(new C56259l(eVar.f127590c, eVar.f127589b, iMContact, z2, new C55951b(eVar, sharePackage2, iMContact), str4, str3));
        }
    }

    /* renamed from: a */
    public static void m101802a(List<IMContact> list, String str, SharePackage sharePackage, BaseContent baseContent, String str2, String str3, AbstractC55947a aVar) {
        BaseContent baseContent2 = baseContent;
        if (aVar != null) {
            aVar.mo92815a();
        }
        C56244a.m102190b("ShareHelper", "shareContent=".concat(String.valueOf(baseContent2)));
        m101807c(sharePackage);
        if (baseContent2 instanceof TextContent) {
            baseContent2 = TextContent.obtain((TextContent) baseContent2);
        } else if (baseContent2 == null) {
            baseContent2 = m101794a(sharePackage);
        }
        if (!TextUtils.isEmpty(str2) && baseContent2 != null) {
            String sb = new StringBuilder().append(baseContent2.hashCode()).toString();
            C55235x.m101008a(sb, "process_id", str2);
            C55235x.m101008a(sb, "enter_from", sharePackage.f155492i.getString("enter_from"));
            C55235x.m101008a(sb, "message_type", sharePackage.f155492i.getString("message_type"));
            C55235x.m101008a(sb, "enter_method", sharePackage.f155492i.getString("enter_method"));
            C55235x.m101008a(sb, "is_share_pop_up", sharePackage.f155492i.getString("is_share_pop_up"));
        }
        if (list != null && !list.isEmpty() && baseContent2 != null) {
            List<String> a = C55082e.m100741a((IMContact[]) list.toArray(new IMContact[0]));
            m101801a(a, str, baseContent2, sharePackage, list, a.size() > 1, str3);
            if (TextUtils.equals(sharePackage.f155487d, "aweme")) {
                C48314ai.m91749b("im_channel");
            }
        }
    }

    /* renamed from: a */
    private static void m101801a(List<String> list, String str, BaseContent baseContent, SharePackage sharePackage, List<IMContact> list2, boolean z, String str2) {
        m101800a(list, sharePackage, str, baseContent);
        m101799a(sharePackage, list2, z, str2);
        C55954e eVar = f127583b;
        if (eVar != null && eVar.f127589b.equals(str2)) {
            f127583b = null;
        }
        if (sharePackage.f155487d.equals(UGCMonitor.EVENT_COMMENT)) {
            m101798a(sharePackage, str, list);
        }
    }

    static {
        Covode.recordClassIndex(65742);
    }

    /* renamed from: b */
    private static ShareAwemeContent m101805b(SharePackage sharePackage) {
        if (sharePackage.f155492i.getInt("aweme_type") != 40) {
            return ShareAwemeContent.fromSharePackage(sharePackage);
        }
        return ShareStoryContent.fromSharePackage(sharePackage);
    }

    /* renamed from: a */
    private static List<IMContact> m101795a(List<IMContact> list) {
        if (C14812a.m27200a(list)) {
            return null;
        }
        if (list.size() == 1) {
            return list.subList(0, 1);
        }
        for (IMContact iMContact : list) {
            if (iMContact instanceof IMConversation) {
                return Collections.singletonList(iMContact);
            }
        }
        return list.subList(0, 2);
    }

    /* renamed from: c */
    private static void m101807c(SharePackage sharePackage) {
        C56244a.m102190b("ShareHelper", "sharePackage.itemType=" + sharePackage.f155487d);
        C56244a.m102190b("ShareHelper", "sharePackage.identifier=" + sharePackage.f155488e);
        C56244a.m102190b("ShareHelper", "sharePackage.title=" + sharePackage.f155489f);
        C56244a.m102190b("ShareHelper", "sharePackage.description=" + sharePackage.f155490g);
        C56244a.m102190b("ShareHelper", "sharePackage.url=" + sharePackage.f155491h);
        C56244a.m102190b("ShareHelper", "sharePackage.extras=" + sharePackage.f155492i);
    }

    /* renamed from: a */
    public static BaseContent m101794a(SharePackage sharePackage) {
        BaseContent a = C55953d.m101810a(sharePackage);
        if (a != null) {
            return a;
        }
        String str = sharePackage.f155487d;
        if (TextUtils.equals("aweme", str)) {
            return m101805b(sharePackage);
        }
        if (TextUtils.equals("music", str)) {
            return ShareMusicContent.fromSharePackage(sharePackage);
        }
        if (TextUtils.equals("challenge", str)) {
            return ShareChallengeContent.fromSharePackage(sharePackage);
        }
        if (TextUtils.equals("qna", str) && C55051d.m100669a()) {
            return ShareQnAContent.Companion.fromSharePackage(sharePackage);
        }
        if (TextUtils.equals("live_event", str)) {
            return ShareLiveEventContent.fromSharePackage(sharePackage);
        }
        if (TextUtils.equals("search", str)) {
            return ShareSearchContent.Companion.fromSharePackage(sharePackage);
        }
        if (TextUtils.equals("user", str)) {
            return ShareUserContent.fromSharePackage(sharePackage);
        }
        if (TextUtils.equals("live", str)) {
            return ShareLiveContent.fromSharePackage(sharePackage);
        }
        if (TextUtils.equals("mix", str)) {
            return ShareCompilationContent.fromSharePackage(sharePackage);
        }
        if (TextUtils.equals("sticker", str)) {
            return ShareStickerContent.fromSharePackage(sharePackage);
        }
        if (TextUtils.equals("group", str)) {
            return GroupInviteCardContent.fromSharePackage(sharePackage);
        }
        if (TextUtils.equals(UGCMonitor.EVENT_COMMENT, str)) {
            return CommentContent.fromSharePackage(sharePackage);
        }
        return null;
    }

    /* renamed from: a */
    public static void m101797a(C55954e eVar) {
        if (eVar.f127588a != EnumC56260m.SENT && eVar.f127588a != EnumC56260m.UNDO) {
            eVar.mo92821a(EnumC56260m.SENT);
            f127582a.removeMessages(100);
            m101802a(eVar.f127591d, eVar.f127592e, eVar.f127593f, eVar.f127594g, eVar.f127595h, eVar.f127589b, eVar.f127596i);
        }
    }

    /* renamed from: a */
    private static void m101798a(SharePackage sharePackage, String str, List<String> list) {
        String str2;
        HashMap hashMap = new HashMap();
        Bundle bundle = sharePackage.f155492i;
        hashMap.put("author_id", bundle.getString("comment_author_id"));
        hashMap.put("enter_from", "comment_panel");
        hashMap.put("enter_method", "icon");
        hashMap.put("group_id", bundle.getString("aweme_id"));
        hashMap.put("comment_id", bundle.getString("comment_id"));
        hashMap.put("comment_author_id", bundle.getString("comment_author_id"));
        String str3 = "1";
        if (!str.isEmpty()) {
            str2 = str3;
        } else {
            str2 = "0";
        }
        hashMap.put("is_with_text", str2);
        if (list.size() <= 1) {
            str3 = "0";
        }
        hashMap.put("is_multi", str3);
        hashMap.put("conversation_id", list.toString());
        C39162r.m79460a("share_comment", hashMap);
    }

    /* renamed from: a */
    public static void m101803a(List<IMContact> list, String str, SharePackage sharePackage, String str2) {
        m101802a(list, str, sharePackage, (BaseContent) null, str2, (String) null, (AbstractC55947a) null);
    }

    /* renamed from: b */
    private static void m101806b(SharePackage sharePackage, List<IMContact> list, boolean z, String str) {
        IMContact iMContact;
        if (!TextUtils.equals(sharePackage.f155492i.getString("enter_method"), "publish_share")) {
            String string = sharePackage.f155492i.getString("aid");
            if (C14812a.m27200a(list)) {
                iMContact = null;
            } else {
                iMContact = list.get(0);
            }
            C56257j jVar = new C56257j(m101795a(list), iMContact, list.size(), z, sharePackage.f155487d, sharePackage.f155492i.getString("enter_from"), sharePackage.f155492i.getString("enter_method"), string, str, sharePackage.f155492i.getBoolean("is_new_group", false));
            jVar.f128328k = sharePackage.f155492i.getBoolean("show_tips_until_cancel", false);
            AbstractC81915c.m141874a(jVar);
        }
    }

    /* renamed from: a */
    private static void m101799a(SharePackage sharePackage, List<IMContact> list, boolean z, String str) {
        if (TextUtils.equals(sharePackage.f155487d, "game")) {
            C13628n.m24506a(C17867d.m33078a(), (int) R.string.ch9);
        } else if (!TextUtils.equals(sharePackage.f155487d, "web") || !(sharePackage instanceof ImWebSharePackage) || ((ImWebSharePackage) sharePackage).f128342b) {
            m101806b(sharePackage, list, z, str);
        }
    }

    /* renamed from: a */
    private static void m101800a(List<String> list, SharePackage sharePackage, String str, BaseContent baseContent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(baseContent);
        if (!TextUtils.isEmpty(str)) {
            TextContent obtain = TextContent.obtain(str);
            arrayList.add(obtain);
            if (baseContent != null) {
                String a = C55235x.m101007a(new StringBuilder().append(baseContent.hashCode()).toString(), "process_id");
                if (!TextUtils.isEmpty(a)) {
                    String sb = new StringBuilder().append(obtain.hashCode()).toString();
                    C55235x.m101008a(sb, "process_id", a);
                    C55235x.m101008a(sb, "is_share_pop_up", sharePackage.f155492i.getString("is_share_pop_up"));
                }
            }
        }
        for (String str2 : list) {
            C54346b.m99660a(str2, "");
            C17438g.C17439a.m32347a().mo27820b(str2).mo27816a(arrayList).mo27818a();
        }
    }

    /* renamed from: a */
    public static void m101796a(Context context, SharePackage sharePackage, IMContact[] iMContactArr, String str, AbstractC55950a aVar, AbstractC55950a aVar2) {
        DialogC55319a.C55324a a = new DialogC55319a.C55324a(context).mo92392a(iMContactArr);
        a.f126505d = sharePackage;
        a.f126506e = aVar2;
        a.f126507f = aVar;
        a.mo92390a().mo92393b().mo92391a(str).mo92394c().show();
    }
}
