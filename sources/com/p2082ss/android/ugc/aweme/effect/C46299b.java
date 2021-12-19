package com.p2082ss.android.ugc.aweme.effect;

import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.services.effect.IEffectModelLoggerService;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.effectmanager.model.ModelInfo;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.utils.C84904k;
import com.p2082ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.effect.b */
public final class C46299b implements IEffectModelLoggerService {
    static {
        Covode.recordClassIndex(54876);
    }

    /* renamed from: a */
    private static String m89323a(ModelInfo modelInfo) {
        String str;
        StringBuilder append = new StringBuilder("model name:").append(modelInfo.getName()).append("; model version:").append(modelInfo.getVersion()).append("; model url:").append(modelInfo.getFile_url()).append("; model size:").append(modelInfo.getTotalSize()).append("k; model md5:");
        ExtendedUrlModel file_url = modelInfo.getFile_url();
        if (file_url != null) {
            str = file_url.getUri();
        } else {
            str = null;
        }
        return append.append(str).toString();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.effect.IEffectModelLoggerService
    public final void startDownloadEffectModelAlog(Effect effect, Object obj, String str) {
        C89219l.m154721d(obj, "");
        C89219l.m154721d(str, "");
        if ((obj instanceof ModelInfo) && effect != null) {
            StringBuilder sb = new StringBuilder();
            if (!C84904k.m145909a(effect.getRequirements())) {
                for (String str2 : effect.getRequirements()) {
                    sb.append(str2).append(",");
                }
            }
            String str3 = m89323a((ModelInfo) obj) + "; effect id:" + effect.getEffectId() + "; requirements" + sb.toString() + "; effect_sdk_version:" + str;
            C73991bj.m130128a("effect_platform::report>>>start_download_effect_model: ".concat(String.valueOf(str3)));
            C39162r.m79460a("start_download_effect_model", new C84425b().mo129406a("extra_info", str3).f188764a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.effect.IEffectModelLoggerService
    public final void reportModelListAlog(boolean z, String str, long j, String str2) {
        C89219l.m154721d(str2, "");
        String str3 = "is_success:" + z + "; error_msg:" + str + "; duration:" + j + "ms; effect_sdk_version:" + str2;
        C73991bj.m130128a("effect_platform::report>>>fetch_algorithm_model_list: ".concat(String.valueOf(str3)));
        C39162r.m79460a("fetch_algorithm_model_list", new C84425b().mo129406a("extra_info", str3).f188764a);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.effect.IEffectModelLoggerService
    public final void endDownloadEffectModelAlog(Effect effect, Object obj, long j, int i, Exception exc, String str) {
        C89219l.m154721d(obj, "");
        C89219l.m154721d(str, "");
        if ((obj instanceof ModelInfo) && effect != null) {
            StringBuilder sb = new StringBuilder();
            if (!C84904k.m145909a(effect.getRequirements())) {
                for (String str2 : effect.getRequirements()) {
                    sb.append(str2).append(",");
                }
            }
            String str3 = m89323a((ModelInfo) obj) + "; effect id:" + effect.getEffectId() + "; requirements" + sb.toString() + "; duration:" + j + "ms; effect_sdk_version:" + str;
            if (i == 0) {
                str3 = str3 + "; errorcode: 0";
            } else if (exc != null) {
                String stackTraceString = Log.getStackTraceString(exc);
                C89219l.m154716b(stackTraceString, "");
                str3 = str3 + "; errorcode:" + i + "; errormsg:" + stackTraceString;
            }
            C73991bj.m130128a("effect_platform::report>>>end_download_effect_model: ".concat(String.valueOf(str3)));
            C39162r.m79460a("end_download_effect_model", new C84425b().mo129406a("extra_info", str3).f188764a);
        }
    }
}
