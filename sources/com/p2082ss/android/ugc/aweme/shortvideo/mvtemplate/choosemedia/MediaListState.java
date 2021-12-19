package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter;
import java.util.ArrayList;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MediaListState */
public final class MediaListState implements AbstractC20368af {
    private final ArrayList<MvImageChooseAdapter.MyMediaModel> mediaList;
    private final long value;

    static {
        Covode.recordClassIndex(84683);
    }

    /* renamed from: com_ss_android_ugc_aweme_shortvideo_mvtemplate_choosemedia_MediaListState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m127118x78d95dec(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MediaListState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MediaListState copy$default(MediaListState mediaListState, ArrayList arrayList, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = mediaListState.mediaList;
        }
        if ((i & 2) != 0) {
            j = mediaListState.value;
        }
        return mediaListState.copy(arrayList, j);
    }

    public final ArrayList<MvImageChooseAdapter.MyMediaModel> component1() {
        return this.mediaList;
    }

    public final long component2() {
        return this.value;
    }

    public final MediaListState copy(ArrayList<MvImageChooseAdapter.MyMediaModel> arrayList, long j) {
        C89219l.m154721d(arrayList, "");
        return new MediaListState(arrayList, j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaListState)) {
            return false;
        }
        MediaListState mediaListState = (MediaListState) obj;
        return C89219l.m154714a(this.mediaList, mediaListState.mediaList) && this.value == mediaListState.value;
    }

    public final int hashCode() {
        ArrayList<MvImageChooseAdapter.MyMediaModel> arrayList = this.mediaList;
        return ((arrayList != null ? arrayList.hashCode() : 0) * 31) + m127118x78d95dec(this.value);
    }

    public final String toString() {
        return "MediaListState(mediaList=" + this.mediaList + ", value=" + this.value + ")";
    }

    public final ArrayList<MvImageChooseAdapter.MyMediaModel> getMediaList() {
        return this.mediaList;
    }

    public final long getValue() {
        return this.value;
    }

    public MediaListState(ArrayList<MvImageChooseAdapter.MyMediaModel> arrayList, long j) {
        C89219l.m154721d(arrayList, "");
        this.mediaList = arrayList;
        this.value = j;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MediaListState(ArrayList arrayList, long j, int i, C89214g gVar) {
        this((i & 1) != 0 ? new ArrayList() : arrayList, j);
    }
}
