package com.p2082ss.android.ugc.aweme.comment.gift;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.lighten.p1477a.EnumC20767w;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.comment.model.CommentGiftStruct;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.gift.a */
public final class C36431a extends RecyclerView.AbstractC1350a<C36432a> {

    /* renamed from: a */
    public ArrayList<CommentGiftStruct> f86116a = new ArrayList<>();

    /* renamed from: b */
    public final ViewGroup f86117b;

    /* renamed from: c */
    public final Context f86118c;

    /* renamed from: d */
    private final LayoutInflater f86119d;

    /* renamed from: e */
    private final View.OnClickListener f86120e;

    static {
        Covode.recordClassIndex(43727);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ C36432a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m74204a(this, viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f86116a.size();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onBindViewHolder(C36432a aVar, int i) {
        C36432a aVar2 = aVar;
        C89219l.m154721d(aVar2, "");
        CommentGiftStruct commentGiftStruct = this.f86116a.get(i);
        SmartImageView smartImageView = (SmartImageView) aVar2.f86121a.findViewById(R.id.el7);
        if (commentGiftStruct != null && smartImageView != null) {
            smartImageView.setOnClickListener(aVar2.f86123c);
            UrlModel image = commentGiftStruct.getImage();
            if (image != null && image.getUrlList() != null) {
                UrlModel image2 = commentGiftStruct.getImage();
                if (image2 == null) {
                    C89219l.m154715b();
                }
                List<String> urlList = image2.getUrlList();
                if (urlList == null) {
                    C89219l.m154715b();
                }
                if (!urlList.isEmpty()) {
                    smartImageView.setVisibility(0);
                    C20766v a = C20761r.m39060a(C34735v.m70965a(commentGiftStruct.getImage()));
                    a.f49092E = smartImageView;
                    a.f49125v = EnumC20767w.CENTER_INSIDE;
                    a.mo34186c();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.gift.a$a */
    public static final class C36432a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final View f86121a;

        /* renamed from: b */
        public final Context f86122b;

        /* renamed from: c */
        public final View.OnClickListener f86123c;

        static {
            Covode.recordClassIndex(43728);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36432a(View view, Context context, View.OnClickListener onClickListener) {
            super(view);
            C89219l.m154721d(view, "");
            C89219l.m154721d(context, "");
            C89219l.m154721d(onClickListener, "");
            this.f86121a = view;
            this.f86122b = context;
            this.f86123c = onClickListener;
        }
    }

    public C36431a(ViewGroup viewGroup, Context context, View.OnClickListener onClickListener) {
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(context, "");
        C89219l.m154721d(onClickListener, "");
        this.f86117b = viewGroup;
        this.f86118c = context;
        this.f86120e = onClickListener;
        LayoutInflater from = LayoutInflater.from(context);
        C89219l.m154716b(from, "");
        this.f86119d = from;
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m74204a(C36431a aVar, ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(8847);
        C89219l.m154721d(viewGroup, "");
        View a2 = C1764a.m5927a(aVar.f86119d, R.layout.jt, aVar.f86117b, false);
        C89219l.m154716b(a2, "");
        C36432a aVar2 = new C36432a(a2, aVar.f86118c, aVar.f86120e);
        try {
            if (aVar2.itemView.getParent() != null) {
                try {
                    a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(aVar2.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) aVar2.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(aVar2.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = aVar2.getClass().getName();
        MethodCollector.m26664o(8847);
        return aVar2;
    }
}
