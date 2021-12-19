package com.p2082ss.android.ugc.aweme.effectplatform;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.utils.C80322d;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.utils.C84904k;
import com.p2082ss.android.ugc.tools.utils.C84911q;

/* renamed from: com.ss.android.ugc.aweme.effectplatform.b */
public final class C46403b {
    static {
        Covode.recordClassIndex(54984);
    }

    /* renamed from: a */
    public static void m89552a(Effect effect, long j) {
        if (effect != null) {
            StringBuilder sb = new StringBuilder();
            if (!C84904k.m145909a(effect.getRequirements())) {
                for (String str : effect.getRequirements()) {
                    sb.append(str).append(",");
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("effect id:").append(effect.getEffectId()).append("; effect url:").append(effect.getFileUrl()).append("; effect req:").append(sb.toString()).append("; total size:").append(j / 1024).append("k");
            C84911q.m145921a("report start download effect alog: ".concat(String.valueOf(sb2)));
            C80322d.m139251a("start_download_effect", new C84425b().mo129406a("extra_info", sb2.toString()).f188764a);
        }
    }

    /* renamed from: a */
    public static void m89553a(Effect effect, long j, long j2, int i, ExceptionResult exceptionResult) {
        if (effect != null) {
            StringBuilder sb = new StringBuilder();
            if (!C84904k.m145909a(effect.getRequirements())) {
                for (String str : effect.getRequirements()) {
                    sb.append(str).append(",");
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("effect id:").append(effect.getEffectId()).append("; effect url:").append(effect.getFileUrl()).append("; effect req:").append(sb.toString()).append("; total size:").append(j / 1024).append("k; duration:").append(j2).append("ms");
            if (i == 0) {
                sb2.append("; errorcode: 0");
            } else if (exceptionResult != null) {
                sb2.append("; errorcode:").append(exceptionResult.getErrorCode()).append("; errormsg:").append(exceptionResult.getMsg());
            }
            C84911q.m145921a("report effect download alog: ".concat(String.valueOf(sb2)));
            C80322d.m139251a("end_download_effect", new C84425b().mo129406a("extra_info", sb2.toString()).f188764a);
        }
    }
}
