package com.p2082ss.android.ugc.aweme.comment.adapter;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.app.ActivityC0580d;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1214u;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.widget.DmtLoadingLayout;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.comment.model.CommentReplyButtonStruct;
import com.p2082ss.android.ugc.aweme.comment.p2484a.C36176c;
import com.p2082ss.android.ugc.aweme.comment.p2490d.C36404c;
import com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36422h;
import com.p2082ss.android.ugc.aweme.comment.p2493g.AbstractC36428a;
import com.p2082ss.android.ugc.aweme.comment.p2503ui.AbstractC37056bq;
import com.p2082ss.android.ugc.aweme.comment.viewmodel.CommentBatchManagementViewModel;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.i18n.C53437b;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.comment.adapter.f */
public final class C36225f extends RecyclerView.ViewHolder implements AbstractC36422h {

    /* renamed from: a */
    View f85550a = this.itemView.findViewById(R.id.dnb);

    /* renamed from: b */
    View f85551b = this.itemView.findViewById(R.id.axs);

    /* renamed from: c */
    LinearLayout f85552c = ((LinearLayout) this.itemView.findViewById(R.id.c5r));

    /* renamed from: d */
    DmtLoadingLayout f85553d = ((DmtLoadingLayout) this.itemView.findViewById(R.id.c5s));

    /* renamed from: e */
    TextView f85554e = ((TextView) this.itemView.findViewById(R.id.f2h));

    /* renamed from: f */
    View f85555f = this.itemView.findViewById(R.id.a7j);

    /* renamed from: g */
    ImageView f85556g = ((ImageView) this.itemView.findViewById(R.id.bm5));

    /* renamed from: h */
    public CommentReplyButtonStruct f85557h;

    /* renamed from: i */
    protected CommentBatchManagementViewModel f85558i;

    /* renamed from: j */
    private AbstractC1214u<Boolean> f85559j;

    static {
        Covode.recordClassIndex(43491);
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36422h
    /* renamed from: d */
    public final int mo63390d() {
        return this.f85557h.getButtonStatus();
    }

    /* renamed from: h */
    private void m73828h() {
        this.f85552c.setVisibility(8);
        this.f85553d.setVisibility(0);
    }

    /* renamed from: c */
    public final void mo63389c() {
        if (this.f85558i != null && (this.itemView.getContext() instanceof ActivityC0945e) && C36176c.m73729a()) {
            this.f85558i.mo64780a().removeObserver(this.f85559j);
        }
    }

    /* renamed from: g */
    private void m73827g() {
        MethodCollector.m26663i(9400);
        this.f85552c.setVisibility(0);
        this.f85553d.setVisibility(8);
        this.f85551b.setVisibility(8);
        this.f85555f.setVisibility(0);
        if (C36404c.m74106e()) {
            this.f85552c.removeView(this.f85555f);
            this.f85552c.addView(this.f85555f, 0);
        }
        MethodCollector.m26664o(9400);
    }

    /* renamed from: b */
    public final void mo63388b() {
        if (this.f85558i != null && (this.itemView.getContext() instanceof ActivityC0945e) && C36176c.m73729a()) {
            this.f85558i.mo64780a().observe((ActivityC0580d) this.itemView.getContext(), this.f85559j);
        }
    }

    /* renamed from: e */
    private void m73825e() {
        MethodCollector.m26663i(9246);
        this.f85552c.setVisibility(0);
        this.f85553d.setVisibility(8);
        TextView textView = this.f85554e;
        textView.setText(C1764a.m5928a(textView.getResources().getString(R.string.ajc), new Object[]{C53437b.m98615a(this.f85557h.getReplyCommentTotal() - ((long) this.f85557h.getExpandSize()))}));
        this.f85551b.setVisibility(0);
        this.f85555f.setVisibility(8);
        if (C36404c.m74106e()) {
            this.f85552c.removeView(this.f85555f);
            this.f85552c.addView(this.f85555f, 2);
        }
        MethodCollector.m26664o(9246);
    }

    /* renamed from: i */
    private void m73829i() {
        CommentBatchManagementViewModel commentBatchManagementViewModel;
        if (C36176c.m73729a() && (commentBatchManagementViewModel = this.f85558i) != null && commentBatchManagementViewModel.mo64780a().getValue().booleanValue()) {
            if (!TextUtils.equals(this.f85554e.getText(), this.itemView.getContext().getResources().getString(R.string.ajb))) {
                C39162r.onEventV3("comment_batch_management_view_replies_ck");
            } else {
                C39162r.onEventV3("comment_batch_management_view_more_ck");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo63386a() {
        if (this.f85557h.getReplyCommentTotal() > ((long) this.f85557h.getTopSize()) || this.f85557h.getButtonStatus() == 4) {
            int buttonStatus = this.f85557h.getButtonStatus();
            if (buttonStatus == 0) {
                m73825e();
            } else if (buttonStatus == 1) {
                m73826f();
            } else if (buttonStatus == 2) {
                m73829i();
                CommentReplyButtonStruct commentReplyButtonStruct = this.f85557h;
                if (commentReplyButtonStruct != null) {
                    int expandSize = commentReplyButtonStruct.getExpandSize();
                    this.f85557h.setReplyCommentTotal((long) expandSize);
                    if (expandSize <= this.f85557h.getTopSize()) {
                        mo63387a(4);
                        return;
                    }
                }
                m73827g();
            } else if (buttonStatus == 3) {
                m73828h();
            } else if (buttonStatus == 4) {
                this.itemView.getLayoutParams().height = 0;
                this.itemView.requestLayout();
            }
        } else {
            mo63387a(4);
        }
    }

    /* renamed from: f */
    private void m73826f() {
        m73829i();
        this.f85552c.setVisibility(0);
        this.f85553d.setVisibility(8);
        this.f85551b.setVisibility(0);
        if (C36404c.m74106e()) {
            this.f85555f.setVisibility(8);
        } else {
            this.f85555f.setVisibility(0);
        }
        if (C36404c.m74103b() || C36404c.m74104c()) {
            long replyCommentTotal = this.f85557h.getReplyCommentTotal() - ((long) this.f85557h.getExpandSize());
            if (replyCommentTotal > 0) {
                this.f85554e.setText(C1764a.m5928a(this.f85554e.getResources().getString(R.string.ajb) + " (%s)", new Object[]{C53437b.m98615a(replyCommentTotal)}));
                return;
            }
            this.f85554e.setText(R.string.ajb);
            return;
        }
        this.f85554e.setText(R.string.ajb);
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36422h
    /* renamed from: a */
    public final void mo63387a(int i) {
        CommentReplyButtonStruct commentReplyButtonStruct = this.f85557h;
        if (commentReplyButtonStruct != null) {
            commentReplyButtonStruct.setButtonStatus(i);
        }
        mo63386a();
    }

    public C36225f(ViewGroup viewGroup, final AbstractC36428a aVar) {
        super(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.it, viewGroup, false));
        this.f85551b.setOnTouchListener(new AbstractC37056bq() {
            /* class com.p2082ss.android.ugc.aweme.comment.adapter.C36225f.C362261 */

            static {
                Covode.recordClassIndex(43492);
            }

            @Override // com.p2082ss.android.ugc.aweme.comment.p2503ui.AbstractC37056bq
            /* renamed from: a */
            public final void mo63391a(View view) {
                if (C36225f.this.f85557h != null && aVar != null && C36225f.this.f85557h.getButtonStatus() != 3) {
                    aVar.mo63745a(C36225f.this.f85557h, C36225f.this);
                }
            }
        });
        this.f85555f.setOnTouchListener(new AbstractC37056bq() {
            /* class com.p2082ss.android.ugc.aweme.comment.adapter.C36225f.C362272 */

            static {
                Covode.recordClassIndex(43493);
            }

            @Override // com.p2082ss.android.ugc.aweme.comment.p2503ui.AbstractC37056bq
            /* renamed from: a */
            public final void mo63391a(View view) {
                if (C36225f.this.f85557h != null && aVar != null && C36225f.this.f85557h.getButtonStatus() != 3) {
                    C36225f.this.f85557h.setButtonStatus(2);
                    aVar.mo63745a(C36225f.this.f85557h, C36225f.this);
                }
            }
        });
        this.f85553d.setProgressBarInfo(C34728n.m70946a(28.0d));
        if (C36176c.m73729a()) {
            this.f85558i = CommentBatchManagementViewModel.C37228a.m75235a((ActivityC0945e) this.itemView.getContext());
            this.f85559j = new C36228g(this);
        }
    }
}
