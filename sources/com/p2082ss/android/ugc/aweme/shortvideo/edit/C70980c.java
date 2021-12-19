package com.p2082ss.android.ugc.aweme.shortvideo.edit;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.C69840ar;
import com.p2082ss.android.ugc.aweme.shortvideo.C70638dj;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import java.util.concurrent.Callable;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.c */
public final class C70980c {

    /* renamed from: a */
    public static final C70980c f158881a = new C70980c();

    private C70980c() {
    }

    static {
        Covode.recordClassIndex(83474);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.c$a */
    public static final class CallableC70981a<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ VideoPublishEditModel f158882a;

        static {
            Covode.recordClassIndex(83475);
        }

        CallableC70981a(VideoPublishEditModel videoPublishEditModel) {
            this.f158882a = videoPublishEditModel;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            try {
                if (!TextUtils.isEmpty(this.f158882a.mVideoSegmentsDesc) && this.f158882a.getOriginal() == 1) {
                    String f = C80720e.m139942f(C70638dj.f158102e + "data.txt");
                    C69840ar a = new C69840ar().mo110189a("videoSegmentsDesc", this.f158882a.mVideoSegmentsDesc);
                    a.mo110189a("data txt", f);
                    a.mo110185a("retake", Boolean.valueOf(this.f158882a.isRetakeVideo()));
                    a.mo110189a("creation id", this.f158882a.creationId);
                    a.mo110185a("from draft", Boolean.valueOf(this.f158882a.mIsFromDraft));
                    a.mo110187a("video list", Integer.valueOf(this.f158882a.getPreviewInfo().getVideoList().size()));
                    C84911q.m145921a("draft_restore_2130_1: " + a.mo110191a().toString());
                }
            } catch (Exception unused) {
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static final void m125333a(VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(videoPublishEditModel, "");
        if (C70934b.m125234a()) {
            try {
                if (videoPublishEditModel.getOriginal() == 1) {
                    C69840ar a = new C69840ar().mo110189a("videoSegmentsDesc", videoPublishEditModel.mVideoSegmentsDesc);
                    a.mo110185a("retake", Boolean.valueOf(videoPublishEditModel.isRetakeVideo()));
                    a.mo110189a("creation id", videoPublishEditModel.creationId);
                    a.mo110185a("from draft", Boolean.valueOf(videoPublishEditModel.mIsFromDraft));
                    a.mo110187a("video list", Integer.valueOf(videoPublishEditModel.getPreviewInfo().getVideoList().size()));
                    C84911q.m145921a("draft_restore_2130_2: " + a.mo110191a().toString());
                }
            } catch (Exception unused) {
            }
        }
    }
}
