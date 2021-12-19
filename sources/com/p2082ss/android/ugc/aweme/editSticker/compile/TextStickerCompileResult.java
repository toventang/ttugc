package com.p2082ss.android.ugc.aweme.editSticker.compile;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;

/* renamed from: com.ss.android.ugc.aweme.editSticker.compile.TextStickerCompileResult */
public class TextStickerCompileResult extends C45859b {
    public TextStickerData textStickerData;

    static {
        Covode.recordClassIndex(54381);
    }

    public TextStickerCompileResult(TextStickerData textStickerData2, C45859b bVar) {
        super(bVar);
        this.textStickerData = textStickerData2;
    }

    public TextStickerCompileResult(String str, int i, int i2) {
        super(str, i, i2);
    }

    public TextStickerCompileResult(String str, int i, int i2, TextStickerData textStickerData2) {
        super(str, i, i2);
        this.textStickerData = textStickerData2;
    }
}
