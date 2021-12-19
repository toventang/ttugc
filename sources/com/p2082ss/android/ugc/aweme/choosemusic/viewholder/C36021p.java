package com.p2082ss.android.ugc.aweme.choosemusic.viewholder;

import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.arch.widgets.C33937a;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.choosemusic.p2464d.AbstractC35828c;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.music.model.MusicCollectionItem;
import com.p2082ss.android.ugc.aweme.music.p3465b.AbstractC60712b;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.p */
public final class C36021p extends C33937a {

    /* renamed from: b */
    TuxTextView f85076b;

    /* renamed from: c */
    TextView f85077c;

    /* renamed from: d */
    RecyclerView f85078d;

    /* renamed from: e */
    public AbstractC60712b f85079e;

    /* renamed from: f */
    public AbstractC35828c f85080f;

    static {
        Covode.recordClassIndex(43267);
    }

    public C36021p(View view) {
        super(view);
        this.f85076b = (TuxTextView) view.findViewById(R.id.f67);
        this.f85077c = (TextView) view.findViewById(R.id.f65);
        this.f85078d = (RecyclerView) view.findViewById(R.id.do1);
        this.f85077c.setText(view.getContext().getText(R.string.db7));
        final int b = (int) C13628n.m24520b(view.getContext(), 16.0f);
        this.f85078d.mo4402a(new RecyclerView.AbstractC1361h() {
            /* class com.p2082ss.android.ugc.aweme.choosemusic.viewholder.C36021p.C360221 */

            static {
                Covode.recordClassIndex(43268);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1361h
            public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1378s sVar) {
                rect.bottom = b;
            }
        });
        this.f85078d.setNestedScrollingEnabled(false);
        this.f85076b.setOnClickListener(new View.OnClickListener() {
            /* class com.p2082ss.android.ugc.aweme.choosemusic.viewholder.C36021p.View$OnClickListenerC360232 */

            static {
                Covode.recordClassIndex(43269);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                if (!C58001a.m104815a(view, 1200) && C36021p.this.f85079e != null) {
                    C36021p.this.f85079e.mo63222a(view);
                }
            }
        });
        this.f85078d.setLayoutManager(new WrapGridLayoutManager(view.getContext(), 2));
        this.f85076b.setTuxFont(62);
    }

    /* renamed from: a */
    public final void mo63187a(final List<MusicCollectionItem> list, final int i) {
        this.f85078d.setAdapter(new RecyclerView.AbstractC1350a<View$OnClickListenerC36020o>() {
            /* class com.p2082ss.android.ugc.aweme.choosemusic.viewholder.C36021p.C360243 */

            static {
                Covode.recordClassIndex(43270);
            }

            /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
            public final /* synthetic */ View$OnClickListenerC36020o onCreateViewHolder(ViewGroup viewGroup, int i) {
                return m73453a(this, viewGroup, i);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
            public final int getItemCount() {
                List list = list;
                if (list == null) {
                    return 0;
                }
                return list.size();
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
            public final /* synthetic */ void onBindViewHolder(View$OnClickListenerC36020o oVar, int i) {
                View$OnClickListenerC36020o oVar2 = oVar;
                oVar2.f85073c = (MusicCollectionItem) list.get(i);
                if (oVar2.f85073c != null) {
                    oVar2.f85071a.setText(oVar2.f85073c.mcName);
                    C34577e.m70592a(oVar2.f85072b, oVar2.f85073c.awemeCover);
                }
            }

            /* renamed from: a */
            private static RecyclerView.ViewHolder m73453a(C360243 r5, ViewGroup viewGroup, int i) {
                boolean a;
                MethodCollector.m26663i(4567);
                View$OnClickListenerC36020o oVar = new View$OnClickListenerC36020o(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.a_w, viewGroup, false), i, C36021p.this.f85080f);
                try {
                    if (oVar.itemView.getParent() != null) {
                        try {
                            a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                        } catch (Exception unused) {
                        }
                        if (a) {
                            StringBuffer stringBuffer = new StringBuffer();
                            stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(oVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                            C22708a.m42800a(stringBuffer.toString());
                            ViewGroup viewGroup2 = (ViewGroup) oVar.itemView.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(oVar.itemView);
                            }
                        }
                    }
                } catch (Exception e) {
                    C63423ai.m115002a(e);
                    C51423a.m95786a(e);
                }
                C80493gg.f180088a = oVar.getClass().getName();
                MethodCollector.m26664o(4567);
                return oVar;
            }
        });
    }
}
