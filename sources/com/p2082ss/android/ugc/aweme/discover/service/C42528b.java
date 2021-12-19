package com.p2082ss.android.ugc.aweme.discover.service;

import android.graphics.Color;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.music.model.MusicTag;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.aweme.utils.C80508gp;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.service.b */
public final class C42528b extends RecyclerView.AbstractC1350a<C42531d> {

    /* renamed from: a */
    final List<MusicTag> f99164a = new ArrayList();

    /* renamed from: b */
    public int[] f99165b = new int[2];

    /* renamed from: c */
    public final RecyclerView f99166c;

    /* renamed from: d */
    private final View.OnClickListener f99167d;

    static {
        Covode.recordClassIndex(50619);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ C42531d onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m85026a(viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f99164a.size();
    }

    public C42528b(View.OnClickListener onClickListener, RecyclerView recyclerView) {
        C89219l.m154721d(onClickListener, "");
        C89219l.m154721d(recyclerView, "");
        this.f99167d = onClickListener;
        this.f99166c = recyclerView;
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m85026a(ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(7774);
        C89219l.m154721d(viewGroup, "");
        View a2 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.aaq, viewGroup, false);
        C89219l.m154716b(a2, "");
        C42531d dVar = new C42531d(a2);
        try {
            if (dVar.itemView.getParent() != null) {
                try {
                    a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(dVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) dVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(dVar.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = dVar.getClass().getName();
        MethodCollector.m26664o(7774);
        return dVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onBindViewHolder(C42531d dVar, int i) {
        C42531d dVar2 = dVar;
        C89219l.m154721d(dVar2, "");
        MusicTag musicTag = this.f99164a.get(i);
        dVar2.itemView.setOnClickListener(this.f99167d);
        C89219l.m154721d(musicTag, "");
        if (!TextUtils.isEmpty(musicTag.getTagColor()) && !TextUtils.isEmpty(musicTag.getTagTitle())) {
            TextView textView = dVar2.f99173a;
            if (textView != null) {
                textView.setText(musicTag.getTagTitle());
            }
            try {
                TextView textView2 = dVar2.f99173a;
                if (textView2 != null) {
                    textView2.setBackgroundColor(Color.parseColor(musicTag.getTagColor()));
                }
                TextView textView3 = dVar2.f99173a;
                if (textView3 != null) {
                    textView3.setTextColor(Color.parseColor(musicTag.getTagTitleColor()));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            TextView textView4 = dVar2.f99173a;
            if (textView4 != null) {
                textView4.setLayoutParams((RecyclerView.C1367j) dVar2.f99174b.getValue());
            }
            if (dVar2.f99173a != null) {
                TextView textView5 = dVar2.f99173a;
                Objects.requireNonNull(textView5, "null cannot be cast to non-null type android.view.View");
                if (Build.VERSION.SDK_INT >= 21) {
                    textView5.setOutlineProvider(new C80508gp(textView5.getResources().getDimensionPixelOffset(R.dimen.qq)));
                    textView5.setClipToOutline(true);
                }
            }
        }
    }
}
