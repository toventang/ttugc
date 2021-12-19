package com.p2082ss.android.ugc.aweme.services.upload;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import p4600h.p4611f.p4613b.C89214g;

/* renamed from: com.ss.android.ugc.aweme.services.upload.IPhotoPreDownloadMusic */
public interface IPhotoPreDownloadMusic {
    static {
        Covode.recordClassIndex(80004);
    }

    void firstMusicDownloadSuccess(MusicModel musicModel, String str);

    PhotoPreDownloadMusicData getPreDownloadMusicData();

    /* renamed from: com.ss.android.ugc.aweme.services.upload.IPhotoPreDownloadMusic$PhotoPreDownloadMusicData */
    public static final class PhotoPreDownloadMusicData {
        private String musicFile;
        private MusicModel musicModel;

        static {
            Covode.recordClassIndex(80005);
        }

        public PhotoPreDownloadMusicData() {
            this(null, null, 3, null);
        }

        public final String getMusicFile() {
            return this.musicFile;
        }

        public final MusicModel getMusicModel() {
            return this.musicModel;
        }

        public final boolean isDataValid() {
            String str;
            if (this.musicModel == null || (str = this.musicFile) == null || !C84902i.m145892a(str)) {
                return false;
            }
            return true;
        }

        public final void setMusicFile(String str) {
            this.musicFile = str;
        }

        public final void setMusicModel(MusicModel musicModel2) {
            this.musicModel = musicModel2;
        }

        public PhotoPreDownloadMusicData(MusicModel musicModel2, String str) {
            this.musicModel = musicModel2;
            this.musicFile = str;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ PhotoPreDownloadMusicData(MusicModel musicModel2, String str, int i, C89214g gVar) {
            this((i & 1) != 0 ? null : musicModel2, (i & 2) != 0 ? null : str);
        }
    }
}
