package com.p2082ss.android.ugc.aweme.video;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.video.d */
public final class C80718d extends BroadcastReceiver {
    static {
        Covode.recordClassIndex(94005);
    }

    public final void onReceive(Context context, Intent intent) {
        String str;
        Activity j = C17873f.m33102j();
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        if (C89219l.m154714a((Object) str, (Object) "android.media.AUDIO_BECOMING_NOISY") && (j instanceof ActivityC0945e)) {
            HomePageDataViewModel.C52942a.m97777a((ActivityC0945e) j).f121743i.postValue("on_ear_phone_unplug");
            C51423a.m95792b("EarPhoneUnplugReceiver", "Received BECOMING_NOISY Broadcast");
        }
    }
}
