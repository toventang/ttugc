package com.p2082ss.android.ugc.aweme.detail.p2749h;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.comment.CommentServiceImpl;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.detail.h.w */
public final class C41216w extends AbstractC41220y {

    /* renamed from: a */
    private final String f96319a;

    /* renamed from: bx */
    private final String f96320bx;

    /* renamed from: by */
    private final String f96321by;

    static {
        Covode.recordClassIndex(49099);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.detail.p2749h.AbstractC41220y
    /* renamed from: o */
    public final int mo70389o() {
        return R.string.f3h;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.detail.p2749h.AbstractC41220y
    /* renamed from: n */
    public final void mo70388n() {
        Aweme aD = mo81109aD();
        if (!(aD == null || aD.getInteractStickerStructs() == null)) {
            for (InteractStickerStruct interactStickerStruct : aD.getInteractStickerStructs()) {
                if (interactStickerStruct.getQaStruct() != null) {
                    try {
                        CommentServiceImpl.m73664e().mo63288a(this.f183419bv, interactStickerStruct.getQaStruct(), this.f96320bx, "click_banner", "answer");
                        return;
                    } catch (Exception e) {
                        e.printStackTrace();
                        return;
                    }
                }
            }
        }
    }

    public C41216w(Bundle bundle) {
        this.f96319a = (String) bundle.getSerializable("question_content");
        this.f96320bx = (String) bundle.getSerializable("enter_from");
        this.f96321by = (String) bundle.getSerializable("enter_method");
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.detail.p2749h.AbstractC41220y
    /* renamed from: a */
    public final View mo70386a(RelativeLayout relativeLayout) {
        int i;
        View a = C1764a.m5927a(LayoutInflater.from(this.f183419bv), R.layout.wq, relativeLayout, false);
        TuxTextView tuxTextView = (TuxTextView) a.findViewById(R.id.ak4);
        String str = this.f96319a;
        if (str != null && !str.isEmpty()) {
            tuxTextView.setText(this.f96319a);
            if (C80471gb.m139482a()) {
                i = 4;
            } else {
                i = 3;
            }
            tuxTextView.setTextDirection(i);
        }
        return a;
    }
}
