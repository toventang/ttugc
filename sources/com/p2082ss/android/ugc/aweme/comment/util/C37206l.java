package com.p2082ss.android.ugc.aweme.comment.util;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.p2082ss.android.ugc.aweme.comment.model.Comment;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.util.l */
public final class C37206l {

    /* renamed from: a */
    public static final C37207a f87729a = new C37207a((byte) 0);

    static {
        Covode.recordClassIndex(44561);
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.util.l$a */
    public static final class C37207a {
        static {
            Covode.recordClassIndex(44562);
        }

        private C37207a() {
        }

        public /* synthetic */ C37207a(byte b) {
            this();
        }

        /* renamed from: a */
        public static void m75195a(Activity activity, Comment comment, String str, int i) {
            C89219l.m154721d(activity, "");
            C89219l.m154721d(comment, "");
            m75196a(activity, comment.getCid(), Comment.getAuthorUid(comment), str, i);
        }

        /* renamed from: a */
        public static void m75196a(Activity activity, String str, String str2, String str3, int i) {
            C89219l.m154721d(activity, "");
            Uri.Builder appendQueryParameter = new Uri.Builder().appendQueryParameter("object_id", str).appendQueryParameter("comment_with_emoji", "0").appendQueryParameter("owner_id", str2).appendQueryParameter("report_type", UGCMonitor.EVENT_COMMENT);
            appendQueryParameter.appendQueryParameter("locale", SettingServiceImpl.m120782v().mo108872h());
            if (!TextUtils.isEmpty(str3)) {
                appendQueryParameter.appendQueryParameter("video_owner_id", str3);
            }
            Bundle bundle = new Bundle();
            bundle.putInt("half_screen_height", i);
            C39223a.m79587a().mo68689a(activity, appendQueryParameter, bundle);
        }
    }
}
