package com.p2082ss.android.ugc.aweme.editSticker.compile;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.editSticker.compile.b */
public class C45859b {
    public int index;
    public String stickerPath;
    public int viewHash;

    static {
        Covode.recordClassIndex(54383);
    }

    public C45859b(C45859b bVar) {
        this(bVar.stickerPath, bVar.index, bVar.viewHash);
    }

    public C45859b(String str, int i) {
        this(str, i, 0);
    }

    public C45859b(String str, int i, int i2) {
        this.stickerPath = str;
        this.index = i;
        this.viewHash = i2;
    }
}
