package android.support.p010v4.media.session;

import android.media.session.PlaybackState;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.mlcomponent_api.BuildConfig;
import java.util.Iterator;
import java.util.List;

/* renamed from: android.support.v4.media.session.h */
final class C0167h {
    static {
        Covode.recordClassIndex(BuildConfig.VERSION_CODE);
    }

    /* renamed from: a */
    public static Object m570a(int i, long j, long j2, float f, long j3, CharSequence charSequence, long j4, List<Object> list, long j5, Bundle bundle) {
        PlaybackState.Builder builder = new PlaybackState.Builder();
        builder.setState(i, j, f, j4);
        builder.setBufferedPosition(j2);
        builder.setActions(j3);
        builder.setErrorMessage(charSequence);
        Iterator<Object> it = list.iterator();
        while (it.hasNext()) {
            builder.addCustomAction((PlaybackState.CustomAction) it.next());
        }
        builder.setActiveQueueItemId(j5);
        builder.setExtras(bundle);
        return builder.build();
    }
}
