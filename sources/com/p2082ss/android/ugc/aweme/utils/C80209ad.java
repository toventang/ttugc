package com.p2082ss.android.ugc.aweme.utils;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.services.performance.ICrashReportService;
import com.p2082ss.android.ugc.aweme.shortvideo.model.ExtraMentionUserModel;
import com.p2082ss.android.ugc.aweme.tools.p4098c.C78102c;
import java.util.ArrayList;
import java.util.List;
import p4600h.C89378p;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.utils.ad */
public final class C80209ad {
    static {
        Covode.recordClassIndex(93477);
    }

    /* renamed from: a */
    public static final MediaModel m139032a(String str) {
        boolean z;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        int[] iArr = new int[10];
        if (C78102c.m136520a(str, iArr) != 0) {
            return null;
        }
        MediaModel mediaModel = new MediaModel(-1);
        mediaModel.f134662b = str;
        mediaModel.f134672l = iArr[0];
        mediaModel.f134673m = iArr[1];
        mediaModel.f134668h = (long) iArr[3];
        return mediaModel;
    }

    /* renamed from: a */
    public static final List<User> m139033a(ExtraMentionUserModel extraMentionUserModel) {
        C89219l.m154721d(extraMentionUserModel, "");
        List<C89378p<String, String>> userList = extraMentionUserModel.getUserList();
        if (!(!extraMentionUserModel.getUserList().isEmpty()) || userList == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) userList, 10));
        for (T t : userList) {
            User user = new User();
            user.setUid((String) t.getFirst());
            user.setNickname((String) t.getSecond());
            arrayList.add(user);
        }
        return arrayList;
    }

    /* renamed from: a */
    public static final void m139034a(Context context, String str, int i) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                ICrashReportService provideErrorReporter = AVExternalServiceImpl.m113114a().provideErrorReporter();
                if (i == 1) {
                    if (str == null) {
                        C89219l.m154715b();
                    }
                    provideErrorReporter.setEffectIdInfo("last_sticker_id", str);
                } else if (i == 2) {
                    if (str == null) {
                        C89219l.m154715b();
                    }
                    provideErrorReporter.setEffectIdInfo("last_mv_id", str);
                } else if (i == 3) {
                    if (str == null) {
                        C89219l.m154715b();
                    }
                    provideErrorReporter.setEffectIdInfo("last_filter_id", str);
                } else if (i == 4) {
                    if (str == null) {
                        C89219l.m154715b();
                    }
                    provideErrorReporter.setEffectIdInfo("last_beauty_id", str);
                } else if (i == 5) {
                    if (str == null) {
                        C89219l.m154715b();
                    }
                    provideErrorReporter.setEffectIdInfo("last_infosticker_id", str);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
