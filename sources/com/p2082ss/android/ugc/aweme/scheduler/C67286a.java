package com.p2082ss.android.ugc.aweme.scheduler;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C71521v;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.C72678q;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.scheduler.a */
public final class C67286a {
    static {
        Covode.recordClassIndex(78909);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.scheduler.a$a */
    public static final class CallableC67287a<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ Object f150780a;

        /* renamed from: b */
        final /* synthetic */ String f150781b;

        static {
            Covode.recordClassIndex(78910);
        }

        CallableC67287a(Object obj, String str) {
            this.f150780a = obj;
            this.f150781b = str;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            String str;
            if (((VideoPublishEditModel) this.f150780a).isMvThemeVideoType()) {
                str = ((VideoPublishEditModel) this.f150780a).mvCreateVideoData.videoCoverImgPath;
            } else {
                str = ((VideoPublishEditModel) this.f150780a).multiEditVideoRecordData.coverImagePath;
            }
            C80720e.m139932c(str, this.f150781b);
            return null;
        }
    }

    /* renamed from: a */
    public static final C72678q m119212a(Bundle bundle) {
        String uuid;
        C89219l.m154721d(bundle, "");
        String string = bundle.getString("shoot_way", "");
        boolean z = bundle.getBoolean("publish_retry", false);
        boolean z2 = bundle.getBoolean("review_video_fast_publish", false);
        boolean z3 = bundle.getBoolean("shoutouts_video_fast_publish", false);
        int i = bundle.getInt("publish_permission", -1);
        if (bundle.containsKey("extra_video_publish_args")) {
            Serializable serializable = bundle.getSerializable("extra_video_publish_args");
            Objects.requireNonNull(serializable, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel");
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) serializable;
            int i2 = bundle.getInt("pre_publish_type", 0);
            boolean z4 = videoPublishEditModel instanceof VideoPublishEditModel;
            if (z4) {
                VideoPublishEditModel videoPublishEditModel2 = videoPublishEditModel;
                String str = videoPublishEditModel2.creationId;
                if (str == null || str.length() == 0) {
                    C67296h.m119240b("VideoPublishEditModel NullCreationId shootWay:" + videoPublishEditModel.mShootWay);
                    videoPublishEditModel2.creationId = UUID.randomUUID().toString();
                }
                uuid = videoPublishEditModel2.creationId;
            } else {
                C67296h.m119240b("Error editModel");
                C63244g.m114602a().mo73287o().mo104789i().mo104813a("publish data converter", new IllegalArgumentException("Edit model type not supported yet, actual=" + videoPublishEditModel.getClass().getSimpleName()));
                uuid = UUID.randomUUID().toString();
            }
            C89219l.m154716b(string, "");
            C89219l.m154716b(uuid, "");
            C89219l.m154721d(videoPublishEditModel, "");
            List a = C89070n.m154516a("");
            if (z4) {
                VideoPublishEditModel videoPublishEditModel3 = videoPublishEditModel;
                if (videoPublishEditModel3.isMvThemeVideoType() || videoPublishEditModel3.isMultiVideoEdit()) {
                    String a2 = C71521v.C71522a.m126402a();
                    a = C89070n.m154516a(a2);
                    C1731i.m5640b(new CallableC67287a(videoPublishEditModel, a2), C1731i.f5562a);
                } else {
                    String validVideoCoverPath = videoPublishEditModel3.getValidVideoCoverPath();
                    if (validVideoCoverPath != null) {
                        a = C89070n.m154516a(validVideoCoverPath);
                    }
                }
            }
            return new C72678q(string, uuid, i2, z, z2, z3, i, a, videoPublishEditModel, bundle.getBoolean("publish_story_mode", false));
        }
        throw new AssertionError("publish service not supported this publish");
    }
}
