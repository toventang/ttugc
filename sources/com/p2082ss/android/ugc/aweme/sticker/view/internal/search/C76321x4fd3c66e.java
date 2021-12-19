package com.p2082ss.android.ugc.aweme.sticker.view.internal.search;

import androidx.recyclerview.widget.GridLayoutManager;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerViewContainer$getLayoutManager$stickerLayoutManager$2 */
public final class C76321x4fd3c66e extends GridLayoutManager {

    /* renamed from: L */
    final /* synthetic */ SearchStickerViewContainer f171444L;

    static {
        Covode.recordClassIndex(89258);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: g */
    public final boolean mo4368g() {
        return true;
    }

    /* JADX WARN: Incorrect args count in method signature: ()V */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C76321x4fd3c66e(SearchStickerViewContainer searchStickerViewContainer) {
        super(5, 1, false);
        this.f171444L = searchStickerViewContainer;
    }
}
