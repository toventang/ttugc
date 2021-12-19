package com.p2082ss.android.ugc.aweme.download.component_api.p2811c;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.download.component_api.activity.DownloadDelegateActivity;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.download.component_api.c.d */
public final class C43180d {

    /* renamed from: a */
    private static Map<String, AbstractC43181a> f100661a = Collections.synchronizedMap(new HashMap());

    /* renamed from: com.ss.android.ugc.aweme.download.component_api.c.d$a */
    public interface AbstractC43181a {
        static {
            Covode.recordClassIndex(51361);
        }

        /* renamed from: a */
        void mo73420a();
    }

    static {
        Covode.recordClassIndex(51360);
    }

    /* renamed from: a */
    public static AbstractC43181a m86113a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return f100661a.remove(str);
    }

    /* renamed from: a */
    public static void m86114a(Context context, AbstractC43181a aVar) {
        if (context == null || C0643b.m2367a(context, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            String[] strArr = {"android.permission.WRITE_EXTERNAL_STORAGE"};
            if (context != null) {
                String valueOf = String.valueOf(System.currentTimeMillis());
                if (!TextUtils.isEmpty(valueOf)) {
                    f100661a.put(valueOf, aVar);
                }
                Intent intent = new Intent(context, DownloadDelegateActivity.class);
                intent.addFlags(268435456);
                intent.putExtra(StringSet.type, 1);
                intent.putExtra("permission_id_key", valueOf);
                intent.putExtra("permission_content_key", strArr);
                C84349a.m145093a(intent, context);
                context.startActivity(intent);
                return;
            }
            return;
        }
        aVar.mo73420a();
    }
}
