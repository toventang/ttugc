package android.support.p010v4.media.session;

import android.media.AudioAttributes;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: android.support.v4.media.session.c */
final class C0154c {

    /* renamed from: android.support.v4.media.session.c$a */
    public interface AbstractC0155a {
        static {
            Covode.recordClassIndex(178);
        }

        /* renamed from: a */
        void mo143a();

        /* renamed from: a */
        void mo144a(Object obj);

        /* renamed from: a */
        void mo145a(List<?> list);

        /* renamed from: b */
        void mo146b();

        /* renamed from: b */
        void mo147b(Object obj);

        /* renamed from: c */
        void mo148c();

        /* renamed from: d */
        void mo149d();

        /* renamed from: e */
        void mo150e();
    }

    static {
        Covode.recordClassIndex(177);
    }

    /* renamed from: android.support.v4.media.session.c$b */
    static class C0156b<T extends AbstractC0155a> extends MediaController.Callback {

        /* renamed from: a */
        protected final T f455a;

        static {
            Covode.recordClassIndex(179);
        }

        public final void onSessionDestroyed() {
            this.f455a.mo143a();
        }

        public C0156b(T t) {
            this.f455a = t;
        }

        public final void onMetadataChanged(MediaMetadata mediaMetadata) {
            this.f455a.mo147b(mediaMetadata);
        }

        public final void onPlaybackStateChanged(PlaybackState playbackState) {
            this.f455a.mo144a(playbackState);
        }

        @Override // android.media.session.MediaController.Callback
        public final void onQueueChanged(List<MediaSession.QueueItem> list) {
            this.f455a.mo145a(list);
        }

        public final void onQueueTitleChanged(CharSequence charSequence) {
            this.f455a.mo148c();
        }

        public final void onExtrasChanged(Bundle bundle) {
            MediaSessionCompat.m227a(bundle);
            this.f455a.mo149d();
        }

        public final void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
            T t = this.f455a;
            playbackInfo.getPlaybackType();
            AudioAttributes audioAttributes = playbackInfo.getAudioAttributes();
            if (!((audioAttributes.getFlags() & 1) == 1 || (audioAttributes.getFlags() & 4) == 4)) {
                audioAttributes.getUsage();
            }
            playbackInfo.getVolumeControl();
            playbackInfo.getMaxVolume();
            playbackInfo.getCurrentVolume();
            t.mo150e();
        }

        public final void onSessionEvent(String str, Bundle bundle) {
            MediaSessionCompat.m227a(bundle);
            this.f455a.mo146b();
        }
    }
}
