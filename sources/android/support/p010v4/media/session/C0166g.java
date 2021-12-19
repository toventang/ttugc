package android.support.p010v4.media.session;

import android.media.session.PlaybackState;
import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.List;

/* renamed from: android.support.v4.media.session.g */
final class C0166g {
    static {
        Covode.recordClassIndex(189);
    }

    /* renamed from: a */
    public static Object m569a(int i, long j, long j2, float f, long j3, CharSequence charSequence, long j4, List<Object> list, long j5) {
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
        return builder.build();
    }
}
