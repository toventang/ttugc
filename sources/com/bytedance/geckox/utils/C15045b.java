package com.bytedance.geckox.utils;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.geckox.policy.p1032v4.model.V4DeploymentModel;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.bytedance.geckox.utils.b */
public final class C15045b {
    static {
        Covode.recordClassIndex(17213);
    }

    /* renamed from: a */
    public static String m27706a(List<CheckRequestBodyModel.TargetChannel> list) {
        if (list == null || list.isEmpty()) {
            return "";
        }
        Collections.sort(list, new Comparator<CheckRequestBodyModel.TargetChannel>() {
            /* class com.bytedance.geckox.utils.C15045b.C150461 */

            static {
                Covode.recordClassIndex(17214);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(CheckRequestBodyModel.TargetChannel targetChannel, CheckRequestBodyModel.TargetChannel targetChannel2) {
                CheckRequestBodyModel.TargetChannel targetChannel3 = targetChannel;
                CheckRequestBodyModel.TargetChannel targetChannel4 = targetChannel2;
                if (targetChannel3 == null) {
                    if (targetChannel4 == null) {
                        return 0;
                    }
                    return -1;
                } else if (targetChannel4 == null) {
                    return 1;
                } else {
                    return targetChannel3.channelName.compareTo(targetChannel4.channelName);
                }
            }
        });
        StringBuffer stringBuffer = new StringBuffer();
        for (CheckRequestBodyModel.TargetChannel targetChannel : list) {
            if (targetChannel != null && !TextUtils.isEmpty(targetChannel.channelName)) {
                stringBuffer.append(targetChannel.channelName);
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: b */
    public static String m27707b(List<String> list) {
        if (list == null || list.isEmpty()) {
            return "";
        }
        Collections.sort(list);
        StringBuffer stringBuffer = new StringBuffer();
        for (String str : list) {
            if (str != null && !TextUtils.isEmpty(str)) {
                stringBuffer.append(str);
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: c */
    public static String m27708c(List<V4DeploymentModel.C15005a> list) {
        if (list == null || list.isEmpty()) {
            return "";
        }
        Collections.sort(list, new Comparator<V4DeploymentModel.C15005a>() {
            /* class com.bytedance.geckox.utils.C15045b.C150472 */

            static {
                Covode.recordClassIndex(17215);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(V4DeploymentModel.C15005a aVar, V4DeploymentModel.C15005a aVar2) {
                V4DeploymentModel.C15005a aVar3 = aVar;
                V4DeploymentModel.C15005a aVar4 = aVar2;
                if (aVar3 == null) {
                    if (aVar4 == null) {
                        return 0;
                    }
                    return -1;
                } else if (aVar4 == null) {
                    return 1;
                } else {
                    return aVar3.f36665a.compareTo(aVar4.f36665a);
                }
            }
        });
        StringBuffer stringBuffer = new StringBuffer();
        for (V4DeploymentModel.C15005a aVar : list) {
            if (aVar != null && !TextUtils.isEmpty(aVar.f36665a)) {
                stringBuffer.append(aVar.f36665a);
            }
        }
        return stringBuffer.toString();
    }
}
