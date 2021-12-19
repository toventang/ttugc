package com.bytedance.android.livesdk.livesetting;

import com.bytedance.android.live_settings.AbstractC6415g;
import com.bytedance.android.live_settings.C6411c;
import com.bytedance.android.livesettings.LiveSettingsCollector_livebase;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.livesetting.c */
public final class C9324c implements AbstractC6415g {
    static {
        Covode.recordClassIndex(10355);
    }

    @Override // com.bytedance.android.live_settings.AbstractC6415g
    /* renamed from: b */
    public final HashMap<String, C6411c> mo12562b() {
        HashMap<String, C6411c> hashMap = LiveSettingsCollector_livebase.modelMaps;
        C89219l.m154716b(hashMap, "");
        return hashMap;
    }

    @Override // com.bytedance.android.live_settings.AbstractC6415g
    /* renamed from: a */
    public final ArrayList<C6411c> mo12561a() {
        ArrayList<C6411c> liveSettingModels = LiveSettingsCollector_livebase.getLiveSettingModels();
        C89219l.m154716b(liveSettingModels, "");
        return liveSettingModels;
    }
}
