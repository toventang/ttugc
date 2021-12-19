package com.p2082ss.android.ugc.aweme.services.external.ability;

import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.services.external.ability.IAVProcessService */
public interface IAVProcessService {

    /* renamed from: com.ss.android.ugc.aweme.services.external.ability.IAVProcessService$IProcessCallback */
    public interface IProcessCallback<T> {
        static {
            Covode.recordClassIndex(79826);
        }

        void finish(T t);
    }

    static {
        Covode.recordClassIndex(79823);
    }

    void compileVideo(CompileParam compileParam, AbstractC89172b<? super CompileResult, C89391z> bVar, AbstractC89172b<? super Throwable, C89391z> bVar2);

    void compressPhoto(String str, Integer num, Integer num2, IProcessCallback<String> iProcessCallback);

    void createWaterMarkImages(int i, int i2, String str, String str2, String str3, boolean z, boolean z2, String str4, boolean z3, IProcessCallback<String[]> iProcessCallback);

    void createWaterMarkImages(String str, String str2, String str3, String str4, boolean z, IProcessCallback<String[]> iProcessCallback);

    int[] getVideoFileInfo(String str);

    void muteVideo(String str, String str2, IProcessCallback<Integer> iProcessCallback);

    /* renamed from: com.ss.android.ugc.aweme.services.external.ability.IAVProcessService$CompileParam */
    public static final class CompileParam {
        private final String rawVideoPath;
        private int videoHeight;
        private int videoWidth;

        static {
            Covode.recordClassIndex(79824);
        }

        public final String getRawVideoPath() {
            return this.rawVideoPath;
        }

        public final int getVideoHeight() {
            return this.videoHeight;
        }

        public final int getVideoWidth() {
            return this.videoWidth;
        }

        public final String toString() {
            return "CompileParam{rawVideoPath=" + this.rawVideoPath + ", videoWidth=" + this.videoWidth + ", videoHeight=" + this.videoHeight + '}';
        }

        public final void setVideoHeight(int i) {
            this.videoHeight = i;
        }

        public final void setVideoWidth(int i) {
            this.videoWidth = i;
        }

        public CompileParam(String str, int i, int i2) {
            C89219l.m154721d(str, "");
            this.rawVideoPath = str;
            this.videoWidth = i;
            this.videoHeight = i2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.services.external.ability.IAVProcessService$CompileResult */
    public static final class CompileResult {
        private String checkPic;
        private String thumbnailPath;
        private int videoHeight = -1;
        private String videoMd5;
        private String videoPath;
        private int videoWidth = -1;

        static {
            Covode.recordClassIndex(79825);
        }

        public final String getCheckPic() {
            return this.checkPic;
        }

        public final String getThumbnailPath() {
            return this.thumbnailPath;
        }

        public final int getVideoHeight() {
            return this.videoHeight;
        }

        public final String getVideoMd5() {
            return this.videoMd5;
        }

        public final String getVideoPath() {
            return this.videoPath;
        }

        public final int getVideoWidth() {
            return this.videoWidth;
        }

        public final String toString() {
            return "CompileResult{videoPath=" + this.videoPath + ", videoMd5=" + this.videoMd5 + ", checkPic=" + this.checkPic + ", thumbnailPath=" + this.thumbnailPath + ", width=" + this.videoWidth + ", height=" + this.videoHeight + '}';
        }

        public final void setCheckPic(String str) {
            this.checkPic = str;
        }

        public final void setThumbnailPath(String str) {
            this.thumbnailPath = str;
        }

        public final void setVideoHeight(int i) {
            this.videoHeight = i;
        }

        public final void setVideoMd5(String str) {
            this.videoMd5 = str;
        }

        public final void setVideoPath(String str) {
            this.videoPath = str;
        }

        public final void setVideoWidth(int i) {
            this.videoWidth = i;
        }
    }
}
