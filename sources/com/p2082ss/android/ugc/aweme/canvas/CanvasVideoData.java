package com.p2082ss.android.ugc.aweme.canvas;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.canvas.CanvasVideoData */
public final class CanvasVideoData implements Serializable {
    private List<PhotoCanvasTransformFilterParam> _transformInfo;
    private final List<String> auditFrames;
    private final PhotoCanvasBackground background;
    private C35388j extra;
    private List<String> sourceInfo;

    static {
        Covode.recordClassIndex(42524);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.canvas.CanvasVideoData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CanvasVideoData copy$default(CanvasVideoData canvasVideoData, List list, List list2, PhotoCanvasBackground photoCanvasBackground, C35388j jVar, int i, Object obj) {
        if ((i & 1) != 0) {
            list = canvasVideoData.sourceInfo;
        }
        if ((i & 2) != 0) {
            list2 = canvasVideoData.auditFrames;
        }
        if ((i & 4) != 0) {
            photoCanvasBackground = canvasVideoData.background;
        }
        if ((i & 8) != 0) {
            jVar = canvasVideoData.extra;
        }
        return canvasVideoData.copy(list, list2, photoCanvasBackground, jVar);
    }

    public final List<String> component1() {
        return this.sourceInfo;
    }

    public final List<String> component2() {
        return this.auditFrames;
    }

    public final PhotoCanvasBackground component3() {
        return this.background;
    }

    public final C35388j component4() {
        return this.extra;
    }

    public final CanvasVideoData copy(List<String> list, List<String> list2, PhotoCanvasBackground photoCanvasBackground, C35388j jVar) {
        return new CanvasVideoData(list, list2, photoCanvasBackground, jVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CanvasVideoData)) {
            return false;
        }
        CanvasVideoData canvasVideoData = (CanvasVideoData) obj;
        return C89219l.m154714a(this.sourceInfo, canvasVideoData.sourceInfo) && C89219l.m154714a(this.auditFrames, canvasVideoData.auditFrames) && C89219l.m154714a(this.background, canvasVideoData.background) && C89219l.m154714a(this.extra, canvasVideoData.extra);
    }

    public final int hashCode() {
        List<String> list = this.sourceInfo;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<String> list2 = this.auditFrames;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        PhotoCanvasBackground photoCanvasBackground = this.background;
        int hashCode3 = (hashCode2 + (photoCanvasBackground != null ? photoCanvasBackground.hashCode() : 0)) * 31;
        C35388j jVar = this.extra;
        if (jVar != null) {
            i = jVar.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "CanvasVideoData(sourceInfo=" + this.sourceInfo + ", auditFrames=" + this.auditFrames + ", background=" + this.background + ", extra=" + this.extra + ")";
    }

    public final List<String> getAuditFrames() {
        return this.auditFrames;
    }

    public final PhotoCanvasBackground getBackground() {
        return this.background;
    }

    public final C35388j getExtra() {
        return this.extra;
    }

    public final List<String> getSourceInfo() {
        return this.sourceInfo;
    }

    public final List<PhotoCanvasTransformFilterParam> getTransformInfo() {
        return this._transformInfo;
    }

    public final void setExtra(C35388j jVar) {
        this.extra = jVar;
    }

    public final void setSourceInfo(List<String> list) {
        this.sourceInfo = list;
    }

    public final void putTransform(PhotoCanvasTransformFilterParam photoCanvasTransformFilterParam) {
        if (photoCanvasTransformFilterParam != null) {
            if (this._transformInfo == null) {
                this._transformInfo = new ArrayList();
            }
            List<PhotoCanvasTransformFilterParam> list = this._transformInfo;
            if (list != null) {
                list.add(photoCanvasTransformFilterParam);
            }
        }
    }

    public final PhotoCanvasTransformFilterParam getClipTransform(int i) {
        List<PhotoCanvasTransformFilterParam> transformInfo = getTransformInfo();
        T t = null;
        if (transformInfo == null) {
            return null;
        }
        Iterator<T> it = transformInfo.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (next.getClipIndex() == i) {
                t = next;
                break;
            }
        }
        return t;
    }

    public CanvasVideoData(List<String> list, List<String> list2, PhotoCanvasBackground photoCanvasBackground, C35388j jVar) {
        this.sourceInfo = list;
        this.auditFrames = list2;
        this.background = photoCanvasBackground;
        this.extra = jVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CanvasVideoData(List list, List list2, PhotoCanvasBackground photoCanvasBackground, C35388j jVar, int i, C89214g gVar) {
        this(list, list2, photoCanvasBackground, (i & 8) != 0 ? null : jVar);
    }
}
