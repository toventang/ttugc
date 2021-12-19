package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MediaState */
public final class MediaState implements AbstractC20368af {
    private final MvImageChooseAdapter.MyMediaModel media;
    private final long value;

    static {
        Covode.recordClassIndex(84687);
    }

    /* renamed from: com_ss_android_ugc_aweme_shortvideo_mvtemplate_choosemedia_MediaState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m127121x4ee7626a(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static /* synthetic */ MediaState copy$default(MediaState mediaState, MvImageChooseAdapter.MyMediaModel myMediaModel, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            myMediaModel = mediaState.media;
        }
        if ((i & 2) != 0) {
            j = mediaState.value;
        }
        return mediaState.copy(myMediaModel, j);
    }

    public final MvImageChooseAdapter.MyMediaModel component1() {
        return this.media;
    }

    public final long component2() {
        return this.value;
    }

    public final MediaState copy(MvImageChooseAdapter.MyMediaModel myMediaModel, long j) {
        return new MediaState(myMediaModel, j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaState)) {
            return false;
        }
        MediaState mediaState = (MediaState) obj;
        return C89219l.m154714a(this.media, mediaState.media) && this.value == mediaState.value;
    }

    public final int hashCode() {
        MvImageChooseAdapter.MyMediaModel myMediaModel = this.media;
        return ((myMediaModel != null ? myMediaModel.hashCode() : 0) * 31) + m127121x4ee7626a(this.value);
    }

    public final String toString() {
        return "MediaState(media=" + this.media + ", value=" + this.value + ")";
    }

    public final MvImageChooseAdapter.MyMediaModel getMedia() {
        return this.media;
    }

    public final long getValue() {
        return this.value;
    }

    public MediaState(MvImageChooseAdapter.MyMediaModel myMediaModel, long j) {
        this.media = myMediaModel;
        this.value = j;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MediaState(MvImageChooseAdapter.MyMediaModel myMediaModel, long j, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : myMediaModel, j);
    }
}
