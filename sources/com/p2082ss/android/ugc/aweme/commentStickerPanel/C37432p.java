package com.p2082ss.android.ugc.aweme.commentStickerPanel;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.bytedance.tux.input.TuxEditText;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.p2082ss.android.ugc.aweme.commentStickerPanel.C37411l;
import com.p2082ss.android.ugc.aweme.commentStickerPanel.itemview.C37399a;
import com.p2082ss.android.ugc.aweme.commentStickerPanel.itemview.C37404b;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.sticker.data.QaStruct;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.tools.p4340c.C84402a;
import com.p2082ss.android.ugc.tools.view.widget.CircleImageView;
import java.util.List;
import p4600h.C89376n;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.p */
public final class C37432p extends RecyclerView.AbstractC1350a<C37434b> {

    /* renamed from: d */
    public static final C37433a f88350d = new C37433a((byte) 0);

    /* renamed from: a */
    public int f88351a;

    /* renamed from: b */
    public final List<Object> f88352b;

    /* renamed from: c */
    public final AbstractC89172b<Object, C89391z> f88353c;

    /* renamed from: e */
    private final Context f88354e;

    /* renamed from: f */
    private final C37411l.EnumC37412a f88355f;

    /* renamed from: g */
    private final CommentAndQuestionAndQuestionStickerPanelViewModel f88356g;

    static {
        Covode.recordClassIndex(44817);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ C37434b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m75476a(this, viewGroup, i);
    }

    /* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.p$a */
    public static final class C37433a {
        static {
            Covode.recordClassIndex(44818);
        }

        private C37433a() {
        }

        public /* synthetic */ C37433a(byte b) {
            this();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f88352b.size();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onViewAttachedToWindow(C37434b bVar) {
        C37434b bVar2 = bVar;
        C89219l.m154721d(bVar2, "");
        super.onViewAttachedToWindow(bVar2);
        if (this.f88355f.getCurrentTabType() == this.f88356g.f88074c) {
            int i = C37436q.f88361b[this.f88355f.ordinal()];
            QaStruct qaStruct = null;
            if (i == 1 || i == 2) {
                CommentAndQuestionAndQuestionStickerPanelViewModel commentAndQuestionAndQuestionStickerPanelViewModel = this.f88356g;
                Object obj = this.f88352b.get(bVar2.getAdapterPosition());
                if (obj instanceof CommentVideoModel) {
                    qaStruct = obj;
                }
                commentAndQuestionAndQuestionStickerPanelViewModel.mo64945b(qaStruct);
                return;
            }
            CommentAndQuestionAndQuestionStickerPanelViewModel commentAndQuestionAndQuestionStickerPanelViewModel2 = this.f88356g;
            Object obj2 = this.f88352b.get(bVar2.getAdapterPosition());
            if (obj2 instanceof QaStruct) {
                qaStruct = obj2;
            }
            commentAndQuestionAndQuestionStickerPanelViewModel2.mo64939a(qaStruct, this.f88355f);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.p$b */
    public class C37434b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final View f88357a;

        /* renamed from: b */
        final /* synthetic */ C37432p f88358b;

        static {
            Covode.recordClassIndex(44819);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C37434b(C37432p pVar, View view) {
            super(view);
            C89219l.m154721d(view, "");
            this.f88358b = pVar;
            this.f88357a = view;
            this.itemView.setOnClickListener(new View.OnClickListener(this) {
                /* class com.p2082ss.android.ugc.aweme.commentStickerPanel.C37432p.C37434b.View$OnClickListenerC374351 */

                /* renamed from: a */
                final /* synthetic */ C37434b f88359a;

                static {
                    Covode.recordClassIndex(44820);
                }

                {
                    this.f88359a = r1;
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    this.f88359a.f88358b.f88353c.invoke(this.f88359a.f88358b.f88352b.get(this.f88359a.getAdapterPosition()));
                }
            });
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onBindViewHolder(C37434b bVar, int i) {
        Object obj;
        C37434b bVar2 = bVar;
        String str = "";
        C89219l.m154721d(bVar2, str);
        Object obj2 = this.f88352b.get(i);
        View view = bVar2.f88357a;
        if (!(view instanceof C37399a)) {
            view = null;
        }
        C37399a aVar = (C37399a) view;
        if (aVar != null) {
            if (!(obj2 instanceof CommentVideoModel)) {
                obj = null;
            } else {
                obj = obj2;
            }
            aVar.setCommentStickerData((CommentVideoModel) obj);
        }
        View view2 = bVar2.f88357a;
        if (!(view2 instanceof C37404b)) {
            view2 = null;
        }
        C37404b bVar3 = (C37404b) view2;
        if (bVar3 != null) {
            if (!(obj2 instanceof QaStruct)) {
                obj2 = null;
            }
            QaStruct qaStruct = (QaStruct) obj2;
            if (qaStruct != null) {
                UrlModel avatarUrl = qaStruct.getAvatarUrl();
                if (avatarUrl != null) {
                    bVar3.f88276o = avatarUrl;
                    CircleImageView circleImageView = bVar3.f88269h;
                    if (circleImageView == null) {
                        C89219l.m154710a("avatarImage");
                    }
                    C84402a.m145169a(circleImageView, avatarUrl, -1, -1);
                }
                String questionContent = qaStruct.getQuestionContent();
                if (questionContent != null) {
                    TuxEditText tuxEditText = bVar3.f88270i;
                    if (tuxEditText == null) {
                        C89219l.m154710a("questionEditText");
                    }
                    tuxEditText.setText(questionContent);
                }
                bVar3.f88272k = qaStruct.getQuestionId();
                bVar3.f88273l = qaStruct.getUserId();
                bVar3.f88274m = qaStruct.getSecId();
                bVar3.f88271j = qaStruct.getItemId();
                String userName = qaStruct.getUserName();
                if (userName != null) {
                    str = userName;
                }
                bVar3.f88275n = str;
            }
        }
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m75476a(C37432p pVar, ViewGroup viewGroup, int i) {
        View aVar;
        MethodCollector.m26663i(5693);
        C89219l.m154721d(viewGroup, "");
        int i2 = C37436q.f88360a[pVar.f88355f.ordinal()];
        boolean z = true;
        if (i2 == 1 || i2 == 2) {
            aVar = new C37399a(pVar.f88354e);
        } else if (i2 == 3 || i2 == 4 || i2 == 5) {
            Context context = viewGroup.getContext();
            C89219l.m154716b(context, "");
            aVar = new C37404b(context, (byte) 0);
        } else {
            C89376n nVar = new C89376n();
            MethodCollector.m26664o(5693);
            throw nVar;
        }
        C37434b bVar = new C37434b(pVar, aVar);
        try {
            if (bVar.itemView.getParent() != null) {
                try {
                    z = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(bVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) bVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(bVar.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = bVar.getClass().getName();
        MethodCollector.m26664o(5693);
        return bVar;
    }

    public C37432p(Context context, C37411l.EnumC37412a aVar, CommentAndQuestionAndQuestionStickerPanelViewModel commentAndQuestionAndQuestionStickerPanelViewModel, List<? extends Object> list, AbstractC89172b<Object, C89391z> bVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(commentAndQuestionAndQuestionStickerPanelViewModel, "");
        C89219l.m154721d(list, "");
        C89219l.m154721d(bVar, "");
        this.f88354e = context;
        this.f88355f = aVar;
        this.f88356g = commentAndQuestionAndQuestionStickerPanelViewModel;
        this.f88352b = list;
        this.f88353c = bVar;
        this.f88351a = list.size();
    }
}
