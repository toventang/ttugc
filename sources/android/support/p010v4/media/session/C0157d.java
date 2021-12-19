package android.support.p010v4.media.session;

import android.content.Intent;
import android.media.Rating;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: android.support.v4.media.session.d */
public final class C0157d {

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v4.media.session.d$a */
    public interface AbstractC0158a {
        static {
            Covode.recordClassIndex(181);
        }

        /* renamed from: a */
        void mo192a();

        /* renamed from: a */
        void mo193a(long j);

        /* renamed from: a */
        void mo194a(Object obj);

        /* renamed from: a */
        void mo195a(String str, Bundle bundle);

        /* renamed from: a */
        void mo196a(String str, Bundle bundle, ResultReceiver resultReceiver);

        /* renamed from: a */
        boolean mo197a(Intent intent);

        /* renamed from: b */
        void mo198b();

        /* renamed from: c */
        void mo199c();

        /* renamed from: d */
        void mo200d();

        /* renamed from: e */
        void mo201e();
    }

    static {
        Covode.recordClassIndex(LiveFeedRefreshTimeSetting.DEFAULT);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v4.media.session.d$b */
    public static class C0159b<T extends AbstractC0158a> extends MediaSession.Callback {

        /* renamed from: a */
        protected final T f456a;

        static {
            Covode.recordClassIndex(182);
        }

        public void onFastForward() {
        }

        public void onRewind() {
        }

        public void onSkipToQueueItem(long j) {
        }

        public void onPause() {
            this.f456a.mo198b();
        }

        public void onPlay() {
            this.f456a.mo192a();
        }

        public void onSkipToNext() {
            this.f456a.mo199c();
        }

        public void onSkipToPrevious() {
            this.f456a.mo200d();
        }

        public void onStop() {
            this.f456a.mo201e();
        }

        public C0159b(T t) {
            this.f456a = t;
        }

        public void onSeekTo(long j) {
            this.f456a.mo193a(j);
        }

        public void onSetRating(Rating rating) {
            this.f456a.mo194a(rating);
        }

        public boolean onMediaButtonEvent(Intent intent) {
            if (this.f456a.mo197a(intent) || super.onMediaButtonEvent(intent)) {
                return true;
            }
            return false;
        }

        public void onPlayFromMediaId(String str, Bundle bundle) {
            MediaSessionCompat.m227a(bundle);
        }

        public void onPlayFromSearch(String str, Bundle bundle) {
            MediaSessionCompat.m227a(bundle);
        }

        public void onCustomAction(String str, Bundle bundle) {
            MediaSessionCompat.m227a(bundle);
            this.f456a.mo195a(str, bundle);
        }

        public void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
            MediaSessionCompat.m227a(bundle);
            this.f456a.mo196a(str, bundle, resultReceiver);
        }
    }

    /* renamed from: a */
    public static Object m557a(Object obj) {
        if (obj instanceof MediaSession.Token) {
            return obj;
        }
        throw new IllegalArgumentException("token is not a valid MediaSession.Token object");
    }
}
