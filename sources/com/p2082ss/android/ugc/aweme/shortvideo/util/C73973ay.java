package com.p2082ss.android.ugc.aweme.shortvideo.util;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.C1764a;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.model.TextExtraStruct;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63253l;
import com.p2082ss.android.ugc.aweme.profile.model.TagBAUser;
import com.p2082ss.android.ugc.aweme.shortvideo.model.BcAdModel;
import com.p2082ss.android.ugc.aweme.shortvideo.view.MentionEditText;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.ay */
public final class C73973ay {

    /* renamed from: a */
    public static final C73973ay f166066a = new C73973ay();

    private C73973ay() {
    }

    static {
        Covode.recordClassIndex(86723);
    }

    /* renamed from: a */
    public static final void m130100a(Context context, MentionEditText mentionEditText) {
        String str;
        ArrayList<TextExtraStruct> arrayList;
        Resources resources;
        BcAdModel c = C63253l.f143623a.mo73330z().mo93825c();
        String str2 = null;
        if (c != null) {
            str = c.f161313ad;
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            if (mentionEditText != null) {
                arrayList = mentionEditText.getStarAtlasExtraList();
            } else {
                arrayList = null;
            }
            if (C13603b.m24435a((Collection) arrayList)) {
                if (context != null && (resources = context.getResources()) != null) {
                    int color = resources.getColor(R.color.a2);
                    if (mentionEditText != null) {
                        mentionEditText.setStarAtlasMentionTextColor(color);
                    } else {
                        return;
                    }
                } else if (mentionEditText == null) {
                    return;
                }
                if (str != null) {
                    str2 = C89361p.m154869a(str, "#", "", false);
                }
                mentionEditText.addMentionText(1, str2, "", "", true);
            }
        }
    }

    /* renamed from: a */
    public static final void m130101a(Context context, MentionEditText mentionEditText, boolean z) {
        String str;
        TagBAUser tagBAUser;
        BcAdModel c = C63253l.f143623a.mo73330z().mo93825c();
        String str2 = null;
        if (c == null || (tagBAUser = c.baUser) == null) {
            str = null;
        } else {
            str = tagBAUser.getHandleName();
        }
        BcAdModel c2 = C63253l.f143623a.mo73330z().mo93825c();
        if (c2 != null) {
            str2 = c2.partnerWith;
        }
        if (!TextUtils.isEmpty(str) && mentionEditText != null) {
            StringBuilder sb = new StringBuilder();
            if (str2 == null) {
                str2 = "";
            }
            String a = C1764a.m5928a(str2, Arrays.copyOf(new Object[]{"@".concat(String.valueOf(str))}, 1));
            C89219l.m154716b(a, "");
            mentionEditText.mo116542d(sb.append(a).append(" ").toString());
            if (z) {
                m130100a(context, mentionEditText);
            }
        }
    }
}
