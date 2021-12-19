package com.p2082ss.android.ugc.gamora.editor;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.C20531t;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.AbstractC22219j;
import com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45899e;
import com.p2082ss.android.ugc.aweme.editSticker.interact.view.C45927k;
import com.p2082ss.android.ugc.aweme.shortvideo.C70636dh;
import com.p2082ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import java.util.Objects;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.w */
public final class C83386w extends AbstractC22219j implements AbstractC45899e {

    /* renamed from: c */
    public static final C83387a f186238c = new C83387a((byte) 0);

    /* renamed from: b */
    C45927k f186239b;

    /* renamed from: d */
    private EditStickerViewModel f186240d;

    static {
        Covode.recordClassIndex(97272);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.w$a */
    public static final class C83387a {
        static {
            Covode.recordClassIndex(97273);
        }

        private C83387a() {
        }

        public /* synthetic */ C83387a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45899e
    /* renamed from: b */
    public final void mo77277b() {
        C45927k kVar = this.f186239b;
        if (kVar == null) {
            C89219l.m154710a("deleteView");
        }
        kVar.mo77277b();
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.w$b */
    static final class C83388b extends AbstractC89220m implements AbstractC89171a<Rect> {

        /* renamed from: a */
        final /* synthetic */ C83386w f186241a;

        static {
            Covode.recordClassIndex(97274);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83388b(C83386w wVar) {
            super(0);
            this.f186241a = wVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Rect invoke() {
            C45927k kVar = this.f186241a.f186239b;
            if (kVar == null) {
                C89219l.m154710a("deleteView");
            }
            Rect deleteRect = kVar.getDeleteRect();
            C89219l.m154716b(deleteRect, "");
            return deleteRect;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45899e
    /* renamed from: a */
    public final void mo77276a() {
        C45927k kVar = this.f186239b;
        if (kVar == null) {
            C89219l.m154710a("deleteView");
        }
        kVar.mo77276a();
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo22704a(Bundle bundle) {
        super.mo22704a(bundle);
        Activity activity = this.f52549m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a = C20531t.m38716a((ActivityC0945e) activity).mo33800a(EditStickerViewModel.class);
        C89219l.m154716b(a, "");
        EditStickerViewModel editStickerViewModel = (EditStickerViewModel) a;
        this.f186240d = editStickerViewModel;
        if (editStickerViewModel == null) {
            C89219l.m154710a("stickerViewModel");
        }
        editStickerViewModel.f184683b = new C83388b(this);
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C45927k kVar;
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        Context context = viewGroup.getContext();
        if (context == null) {
            kVar = null;
        } else {
            kVar = new C45927k(context);
            int a = (int) C84912r.m145930a(context, 72.0f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a, a);
            layoutParams.topMargin = C70636dh.m124833c(context);
            kVar.setLayoutParams(layoutParams);
            layoutParams.gravity = 49;
            kVar.setLayoutParams(layoutParams);
        }
        C89219l.m154716b(kVar, "");
        this.f186239b = kVar;
        if (kVar == null) {
            C89219l.m154710a("deleteView");
        }
        return kVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45899e
    /* renamed from: a */
    public final int mo77275a(int i, int i2, boolean z, boolean z2) {
        C45927k kVar = this.f186239b;
        if (kVar == null) {
            C89219l.m154710a("deleteView");
        }
        return kVar.mo77275a(i, i2, z, z2);
    }
}
