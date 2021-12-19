package com.p2082ss.android.ugc.aweme.tools.draft.ftc.util;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.util.f */
public abstract class AbstractC78339f {
    static {
        Covode.recordClassIndex(91458);
    }

    private AbstractC78339f() {
    }

    public /* synthetic */ AbstractC78339f(byte b) {
        this();
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.util.f$a */
    public static final class C78340a extends AbstractC78339f {

        /* renamed from: a */
        public final VideoPublishEditModel f175936a;

        static {
            Covode.recordClassIndex(91459);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof C78340a) && C89219l.m154714a(this.f175936a, ((C78340a) obj).f175936a);
            }
            return true;
        }

        public final int hashCode() {
            VideoPublishEditModel videoPublishEditModel = this.f175936a;
            if (videoPublishEditModel != null) {
                return videoPublishEditModel.hashCode();
            }
            return 0;
        }

        public final String toString() {
            return "ShowMoreOption(data=" + this.f175936a + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C78340a(VideoPublishEditModel videoPublishEditModel) {
            super((byte) 0);
            C89219l.m154721d(videoPublishEditModel, "");
            this.f175936a = videoPublishEditModel;
        }
    }
}
