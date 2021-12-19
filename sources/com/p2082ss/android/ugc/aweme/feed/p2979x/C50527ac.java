package com.p2082ss.android.ugc.aweme.feed.p2979x;

import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.android.livesdk.chatroom.p491f.C7557c;
import com.bytedance.android.livesdk.i18n.C8983b;
import com.bytedance.android.livesdk.model.message.p579c.C9698b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.live.Text;
import com.p2082ss.android.ugc.aweme.feed.widget.WarningInfoView;

/* renamed from: com.ss.android.ugc.aweme.feed.x.ac */
public final class C50527ac {
    static {
        Covode.recordClassIndex(59674);
    }

    /* renamed from: a */
    public static void m94715a(TextView textView, Text text) {
        String str;
        if (textView != null && text != null) {
            C9698b bVar = new C9698b();
            bVar.f23645a = text.getKey();
            bVar.f23646b = text.getDefaultPattern();
            String str2 = bVar.f23646b;
            if (!TextUtils.isEmpty(bVar.f23645a)) {
                str = C8983b.m17319a().mo15219a(bVar.f23645a);
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                str2 = str;
            }
            textView.setText(C7557c.m15540a(str2, bVar, null));
        }
    }

    /* renamed from: a */
    public static void m94716a(WarningInfoView warningInfoView, Text text) {
        String str;
        if (warningInfoView != null && text != null) {
            C9698b bVar = new C9698b();
            bVar.f23645a = text.getKey();
            bVar.f23646b = text.getDefaultPattern();
            String str2 = bVar.f23646b;
            if (!TextUtils.isEmpty(bVar.f23645a)) {
                str = C8983b.m17319a().mo15219a(bVar.f23645a);
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                str2 = str;
            }
            warningInfoView.setInfoText(C7557c.m15540a(str2, bVar, null));
        }
    }
}
