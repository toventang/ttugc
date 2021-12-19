package com.p2082ss.android.ugc.aweme.comment.barrage.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.barrage.view.CommentRichTagView */
public final class CommentRichTagView extends RelativeLayout {

    /* renamed from: a */
    public final Context f86017a;

    /* renamed from: b */
    private final AbstractC89244h f86018b;

    /* renamed from: c */
    private final AbstractC89244h f86019c;

    /* renamed from: d */
    private final AbstractC89244h f86020d;

    /* renamed from: e */
    private final AbstractC89244h f86021e;

    static {
        Covode.recordClassIndex(43663);
    }

    public CommentRichTagView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final int getDescId() {
        return R.id.djy;
    }

    public final int getImageId() {
        return R.id.djz;
    }

    public final RelativeLayout getMContentView() {
        return (RelativeLayout) this.f86019c.getValue();
    }

    public final TuxTextView getMDescTextView() {
        return (TuxTextView) this.f86020d.getValue();
    }

    public final ImageView getMImageView() {
        return (ImageView) this.f86021e.getValue();
    }

    public final View getMRootView() {
        return (View) this.f86018b.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.barrage.view.CommentRichTagView$a */
    static final class C36372a extends AbstractC89220m implements AbstractC89171a<RelativeLayout> {

        /* renamed from: a */
        final /* synthetic */ CommentRichTagView f86022a;

        static {
            Covode.recordClassIndex(43664);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36372a(CommentRichTagView commentRichTagView) {
            super(0);
            this.f86022a = commentRichTagView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ RelativeLayout invoke() {
            return this.f86022a.getMRootView().findViewById(R.id.dk0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.barrage.view.CommentRichTagView$b */
    static final class C36373b extends AbstractC89220m implements AbstractC89171a<TuxTextView> {

        /* renamed from: a */
        final /* synthetic */ CommentRichTagView f86023a;

        static {
            Covode.recordClassIndex(43665);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36373b(CommentRichTagView commentRichTagView) {
            super(0);
            this.f86023a = commentRichTagView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxTextView invoke() {
            return this.f86023a.getMRootView().findViewById(R.id.djy);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.barrage.view.CommentRichTagView$c */
    static final class C36374c extends AbstractC89220m implements AbstractC89171a<ImageView> {

        /* renamed from: a */
        final /* synthetic */ CommentRichTagView f86024a;

        static {
            Covode.recordClassIndex(43666);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36374c(CommentRichTagView commentRichTagView) {
            super(0);
            this.f86024a = commentRichTagView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ImageView invoke() {
            return this.f86024a.getMRootView().findViewById(R.id.djz);
        }
    }

    public final ViewGroup.LayoutParams getDescViewParams() {
        ViewGroup.LayoutParams layoutParams = getMDescTextView().getLayoutParams();
        C89219l.m154716b(layoutParams, "");
        return layoutParams;
    }

    public final ViewGroup.LayoutParams getImageViewParams() {
        ViewGroup.LayoutParams layoutParams = getMImageView().getLayoutParams();
        C89219l.m154716b(layoutParams, "");
        return layoutParams;
    }

    public final ViewGroup.LayoutParams getTagViewParams() {
        ViewGroup.LayoutParams layoutParams = getMContentView().getLayoutParams();
        C89219l.m154716b(layoutParams, "");
        return layoutParams;
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.barrage.view.CommentRichTagView$d */
    static final class C36375d extends AbstractC89220m implements AbstractC89171a<View> {

        /* renamed from: a */
        final /* synthetic */ CommentRichTagView f86025a;

        static {
            Covode.recordClassIndex(43667);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36375d(CommentRichTagView commentRichTagView) {
            super(0);
            this.f86025a = commentRichTagView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ View invoke() {
            MethodCollector.m26663i(8908);
            View inflate = View.inflate(this.f86025a.f86017a, R.layout.i5, this.f86025a);
            MethodCollector.m26664o(8908);
            return inflate;
        }
    }

    private /* synthetic */ CommentRichTagView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private CommentRichTagView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(8916);
        this.f86017a = context;
        this.f86018b = C89250i.m154773a((AbstractC89171a) new C36375d(this));
        this.f86019c = C89250i.m154773a((AbstractC89171a) new C36372a(this));
        this.f86020d = C89250i.m154773a((AbstractC89171a) new C36373b(this));
        this.f86021e = C89250i.m154773a((AbstractC89171a) new C36374c(this));
        MethodCollector.m26664o(8916);
    }
}
