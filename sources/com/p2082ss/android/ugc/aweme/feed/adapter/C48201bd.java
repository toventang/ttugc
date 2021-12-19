package com.p2082ss.android.ugc.aweme.feed.adapter;

import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.bd */
public final class C48201bd {

    /* renamed from: a */
    public final TuxTextView f111673a;

    /* renamed from: b */
    public final View f111674b;

    /* renamed from: c */
    public final TuxIconView f111675c;

    /* renamed from: d */
    public final TuxIconView f111676d;

    /* renamed from: e */
    public final TextView f111677e;

    /* renamed from: f */
    public final FrameLayout f111678f;

    /* renamed from: g */
    public SparseArray<Integer> f111679g;

    static {
        Covode.recordClassIndex(56943);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48201bd)) {
            return false;
        }
        C48201bd bdVar = (C48201bd) obj;
        return C89219l.m154714a(this.f111673a, bdVar.f111673a) && C89219l.m154714a(this.f111674b, bdVar.f111674b) && C89219l.m154714a(this.f111675c, bdVar.f111675c) && C89219l.m154714a(this.f111676d, bdVar.f111676d) && C89219l.m154714a(this.f111677e, bdVar.f111677e) && C89219l.m154714a(this.f111678f, bdVar.f111678f) && C89219l.m154714a(this.f111679g, bdVar.f111679g);
    }

    public final int hashCode() {
        TuxTextView tuxTextView = this.f111673a;
        int i = 0;
        int hashCode = (tuxTextView != null ? tuxTextView.hashCode() : 0) * 31;
        View view = this.f111674b;
        int hashCode2 = (hashCode + (view != null ? view.hashCode() : 0)) * 31;
        TuxIconView tuxIconView = this.f111675c;
        int hashCode3 = (hashCode2 + (tuxIconView != null ? tuxIconView.hashCode() : 0)) * 31;
        TuxIconView tuxIconView2 = this.f111676d;
        int hashCode4 = (hashCode3 + (tuxIconView2 != null ? tuxIconView2.hashCode() : 0)) * 31;
        TextView textView = this.f111677e;
        int hashCode5 = (hashCode4 + (textView != null ? textView.hashCode() : 0)) * 31;
        FrameLayout frameLayout = this.f111678f;
        int hashCode6 = (hashCode5 + (frameLayout != null ? frameLayout.hashCode() : 0)) * 31;
        SparseArray<Integer> sparseArray = this.f111679g;
        if (sparseArray != null) {
            i = sparseArray.hashCode();
        }
        return hashCode6 + i;
    }

    public final String toString() {
        return "VideoShareViewProvider(shareTipsTv=" + this.f111673a + ", shareTipsRl=" + this.f111674b + ", shareLeftIcon=" + this.f111675c + ", shareRightEnter=" + this.f111676d + ", shareRightUndo=" + this.f111677e + ", bottomView=" + this.f111678f + ", bottomChildren=" + this.f111679g + ")";
    }

    /* renamed from: a */
    public final void mo80343a(SparseArray<Integer> sparseArray) {
        C89219l.m154721d(sparseArray, "");
        this.f111679g = sparseArray;
    }

    public /* synthetic */ C48201bd(TuxTextView tuxTextView, View view, TuxIconView tuxIconView, TuxIconView tuxIconView2, TextView textView) {
        this(tuxTextView, view, tuxIconView, tuxIconView2, textView, null, new SparseArray());
    }

    public C48201bd(TuxTextView tuxTextView, View view, TuxIconView tuxIconView, TuxIconView tuxIconView2, TextView textView, FrameLayout frameLayout, SparseArray<Integer> sparseArray) {
        C89219l.m154721d(sparseArray, "");
        this.f111673a = tuxTextView;
        this.f111674b = view;
        this.f111675c = tuxIconView;
        this.f111676d = tuxIconView2;
        this.f111677e = textView;
        this.f111678f = frameLayout;
        this.f111679g = sparseArray;
    }
}
