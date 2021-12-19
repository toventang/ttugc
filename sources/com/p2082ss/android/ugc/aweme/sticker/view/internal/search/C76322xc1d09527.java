package com.p2082ss.android.ugc.aweme.sticker.view.internal.search;

import androidx.recyclerview.widget.GridLayoutManager;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerViewContainer$initRecyclerView$recommendLayoutManager$1 */
public final class C76322xc1d09527 extends GridLayoutManager {

    /* renamed from: L */
    final /* synthetic */ SearchStickerViewContainer f171445L;

    static {
        Covode.recordClassIndex(89261);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: g */
    public final boolean mo4368g() {
        return this.f171445L.f171409n.invoke().booleanValue();
    }

    /* JADX WARN: Incorrect args count in method signature: ()V */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C76322xc1d09527(SearchStickerViewContainer searchStickerViewContainer) {
        super(5, 1, false);
        this.f171445L = searchStickerViewContainer;
    }
}
