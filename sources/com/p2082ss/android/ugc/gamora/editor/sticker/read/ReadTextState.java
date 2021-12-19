package com.p2082ss.android.ugc.gamora.editor.sticker.read;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20362a;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.C20391d;
import com.bytedance.jedi.arch.C20524n;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.sticker.read.ReadTextState */
public final class ReadTextState implements AbstractC20368af {
    private final C20524n<String, Integer> fetchFailed;
    private final AbstractC20362a<TextStickerData> textStickerData;
    private final C20391d<TextStickerData> textStickerDataV2;

    static {
        Covode.recordClassIndex(96873);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.gamora.editor.sticker.read.ReadTextState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReadTextState copy$default(ReadTextState readTextState, AbstractC20362a aVar, C20391d dVar, C20524n nVar, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = readTextState.textStickerData;
        }
        if ((i & 2) != 0) {
            dVar = readTextState.textStickerDataV2;
        }
        if ((i & 4) != 0) {
            nVar = readTextState.fetchFailed;
        }
        return readTextState.copy(aVar, dVar, nVar);
    }

    public final AbstractC20362a<TextStickerData> component1() {
        return this.textStickerData;
    }

    public final C20391d<TextStickerData> component2() {
        return this.textStickerDataV2;
    }

    public final C20524n<String, Integer> component3() {
        return this.fetchFailed;
    }

    public final ReadTextState copy(AbstractC20362a<TextStickerData> aVar, C20391d<TextStickerData> dVar, C20524n<String, Integer> nVar) {
        C89219l.m154721d(aVar, "");
        return new ReadTextState(aVar, dVar, nVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReadTextState)) {
            return false;
        }
        ReadTextState readTextState = (ReadTextState) obj;
        return C89219l.m154714a(this.textStickerData, readTextState.textStickerData) && C89219l.m154714a(this.textStickerDataV2, readTextState.textStickerDataV2) && C89219l.m154714a(this.fetchFailed, readTextState.fetchFailed);
    }

    public final int hashCode() {
        AbstractC20362a<TextStickerData> aVar = this.textStickerData;
        int i = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        C20391d<TextStickerData> dVar = this.textStickerDataV2;
        int hashCode2 = (hashCode + (dVar != null ? dVar.hashCode() : 0)) * 31;
        C20524n<String, Integer> nVar = this.fetchFailed;
        if (nVar != null) {
            i = nVar.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "ReadTextState(textStickerData=" + this.textStickerData + ", textStickerDataV2=" + this.textStickerDataV2 + ", fetchFailed=" + this.fetchFailed + ")";
    }

    public final C20524n<String, Integer> getFetchFailed() {
        return this.fetchFailed;
    }

    public final AbstractC20362a<TextStickerData> getTextStickerData() {
        return this.textStickerData;
    }

    public final C20391d<TextStickerData> getTextStickerDataV2() {
        return this.textStickerDataV2;
    }

    public ReadTextState(AbstractC20362a<TextStickerData> aVar, C20391d<TextStickerData> dVar, C20524n<String, Integer> nVar) {
        C89219l.m154721d(aVar, "");
        this.textStickerData = aVar;
        this.textStickerDataV2 = dVar;
        this.fetchFailed = nVar;
    }
}
