package com.p2082ss.android.ugc.aweme.shortvideo.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.model.FrameItem */
public final class FrameItem implements Serializable {
    public static final Companion Companion = new Companion(null);
    private final int index;
    @AbstractC27891c(mo46611a = "path")
    private final String path;
    @AbstractC27891c(mo46611a = "timeStamp")
    private long timeStamp;
    private final int type;

    static {
        Covode.recordClassIndex(84580);
    }

    public FrameItem(String str) {
        this(str, 0, 0, 6, null);
    }

    public FrameItem(String str, int i) {
        this(str, i, 0, 4, null);
    }

    public static /* synthetic */ FrameItem copy$default(FrameItem frameItem, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = frameItem.path;
        }
        if ((i3 & 2) != 0) {
            i = frameItem.type;
        }
        if ((i3 & 4) != 0) {
            i2 = frameItem.index;
        }
        return frameItem.copy(str, i, i2);
    }

    public final String component1() {
        return this.path;
    }

    public final int component2() {
        return this.type;
    }

    public final int component3() {
        return this.index;
    }

    public final FrameItem copy(String str, int i, int i2) {
        C89219l.m154721d(str, "");
        return new FrameItem(str, i, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FrameItem)) {
            return false;
        }
        FrameItem frameItem = (FrameItem) obj;
        return C89219l.m154714a(this.path, frameItem.path) && this.type == frameItem.type && this.index == frameItem.index;
    }

    public final int hashCode() {
        String str = this.path;
        return ((((str != null ? str.hashCode() : 0) * 31) + this.type) * 31) + this.index;
    }

    public final String toString() {
        return "FrameItem(path=" + this.path + ", type=" + this.type + ", index=" + this.index + ")";
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.model.FrameItem$Companion */
    public static final class Companion {
        static {
            Covode.recordClassIndex(84581);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(C89214g gVar) {
            this();
        }
    }

    public final int getIndex() {
        return this.index;
    }

    public final String getPath() {
        return this.path;
    }

    public final long getTimeStamp() {
        return this.timeStamp;
    }

    public final int getType() {
        return this.type;
    }

    public final void setTimeStamp(long j) {
        this.timeStamp = j;
    }

    public FrameItem(String str, int i, int i2) {
        C89219l.m154721d(str, "");
        this.path = str;
        this.type = i;
        this.index = i2;
        this.timeStamp = -1;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FrameItem(String str, int i, int i2, int i3, C89214g gVar) {
        this(str, (i3 & 2) != 0 ? 1 : i, (i3 & 4) != 0 ? -1 : i2);
    }
}
