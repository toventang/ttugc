package com.p2082ss.android.ugc.aweme.commentStickerPanel.itemview;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.p2082ss.android.ugc.aweme.tools.C78099c;
import com.p2082ss.android.ugc.tools.p4340c.C84402a;
import com.p2082ss.android.ugc.tools.view.widget.CircleImageView;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.itemview.a */
public final class C37399a extends LinearLayout {

    /* renamed from: a */
    public View f88256a;

    /* renamed from: b */
    private Context f88257b;

    /* renamed from: c */
    private CommentVideoModel f88258c;

    /* renamed from: d */
    private final AbstractC89244h f88259d = C89250i.m154773a((AbstractC89171a) new C37400a(this));

    /* renamed from: e */
    private final AbstractC89244h f88260e = C89250i.m154773a((AbstractC89171a) new C37401b(this));

    /* renamed from: f */
    private final AbstractC89244h f88261f = C89250i.m154773a((AbstractC89171a) new C37402c(this));

    static {
        Covode.recordClassIndex(44780);
    }

    private final CircleImageView getAvatarView() {
        return (CircleImageView) this.f88259d.getValue();
    }

    private final TuxTextView getCommentTextView() {
        return (TuxTextView) this.f88260e.getValue();
    }

    private final int getMReplyTextId() {
        return R.string.fa8;
    }

    private final TuxTextView getRepliedTextView() {
        return (TuxTextView) this.f88261f.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.itemview.a$a */
    static final class C37400a extends AbstractC89220m implements AbstractC89171a<CircleImageView> {

        /* renamed from: a */
        final /* synthetic */ C37399a f88262a;

        static {
            Covode.recordClassIndex(44781);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37400a(C37399a aVar) {
            super(0);
            this.f88262a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ CircleImageView invoke() {
            return C37399a.m75449a(this.f88262a).findViewById(R.id.a93);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.itemview.a$b */
    static final class C37401b extends AbstractC89220m implements AbstractC89171a<TuxTextView> {

        /* renamed from: a */
        final /* synthetic */ C37399a f88263a;

        static {
            Covode.recordClassIndex(44782);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37401b(C37399a aVar) {
            super(0);
            this.f88263a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxTextView invoke() {
            return C37399a.m75449a(this.f88263a).findViewById(R.id.a9y);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.itemview.a$c */
    static final class C37402c extends AbstractC89220m implements AbstractC89171a<TuxTextView> {

        /* renamed from: a */
        final /* synthetic */ C37399a f88264a;

        static {
            Covode.recordClassIndex(44783);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37402c(C37399a aVar) {
            super(0);
            this.f88264a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxTextView invoke() {
            return C37399a.m75449a(this.f88264a).findViewById(R.id.a_y);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.itemview.a$d */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC37403d implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ C37399a f88265a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f88266b;

        static {
            Covode.recordClassIndex(44784);
        }

        public final void onGlobalLayout() {
            this.f88265a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f88266b.invoke();
        }

        ViewTreeObserver$OnGlobalLayoutListenerC37403d(C37399a aVar, AbstractC89171a aVar2) {
            this.f88265a = aVar;
            this.f88266b = aVar2;
        }
    }

    public final View getRoot() {
        View view = this.f88256a;
        if (view == null) {
            C89219l.m154710a("root");
        }
        return view;
    }

    /* renamed from: a */
    public static final /* synthetic */ View m75449a(C37399a aVar) {
        View view = aVar.f88256a;
        if (view == null) {
            C89219l.m154710a("root");
        }
        return view;
    }

    private final void setAvatarImage(UrlModel urlModel) {
        if (urlModel != null) {
            C84402a.m145169a(getAvatarView(), urlModel, -1, -1);
        }
    }

    public final void setUpdateTopMarginListener(AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(aVar, "");
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC37403d(this, aVar));
    }

    private final void setAuthorName(String str) {
        if (!TextUtils.isEmpty(str)) {
            TuxTextView repliedTextView = getRepliedTextView();
            Context context = getContext();
            C89219l.m154716b(context, "");
            repliedTextView.setText(context.getResources().getString(getMReplyTextId(), str));
        }
    }

    private final void setCommentMsg(String str) {
        if (!TextUtils.isEmpty(str)) {
            Context context = this.f88257b;
            if (context == null) {
                C89219l.m154710a("mContext");
            }
            if (C78099c.m136517a(context)) {
                getCommentTextView().setGravity(5);
            }
            getCommentTextView().setText(str);
        }
    }

    public final void setCommentStickerData(CommentVideoModel commentVideoModel) {
        UrlModel urlModel;
        String str;
        this.f88258c = commentVideoModel;
        String str2 = null;
        if (commentVideoModel != null) {
            urlModel = commentVideoModel.getUserAvatar();
        } else {
            urlModel = null;
        }
        setAvatarImage(urlModel);
        CommentVideoModel commentVideoModel2 = this.f88258c;
        if (commentVideoModel2 != null) {
            str = commentVideoModel2.getCommentMsg();
        } else {
            str = null;
        }
        setCommentMsg(str);
        CommentVideoModel commentVideoModel3 = this.f88258c;
        if (commentVideoModel3 != null) {
            str2 = commentVideoModel3.getUserName();
        }
        setAuthorName(str2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37399a(Context context) {
        super(context);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(5714);
        this.f88257b = context;
        View a = C1764a.m5927a(LayoutInflater.from(context), R.layout.np, this, true);
        C89219l.m154716b(a, "");
        this.f88256a = a;
        MethodCollector.m26664o(5714);
    }
}
