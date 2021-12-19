package com.p2082ss.android.ugc.aweme.kids.choosemusic.p3327i;

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
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3322d.AbstractC57235c;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3303a.AbstractC57079b;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3307e.C57110d;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.kids.choosemusic.i.l */
public final class C57314l extends C33937a {

    /* renamed from: b */
    TextView f130601b;

    /* renamed from: c */
    TextView f130602c;

    /* renamed from: d */
    RecyclerView f130603d;

    /* renamed from: e */
    public AbstractC57079b f130604e;

    /* renamed from: f */
    public AbstractC57235c f130605f;

    static {
        Covode.recordClassIndex(67219);
    }

    public C57314l(View view) {
        super(view);
        this.f130601b = (TextView) view.findViewById(R.id.f67);
        this.f130602c = (TextView) view.findViewById(R.id.f65);
        this.f130603d = (RecyclerView) view.findViewById(R.id.do1);
        this.f130602c.setText(view.getContext().getText(R.string.db7));
        final int b = (int) C13628n.m24520b(view.getContext(), 16.0f);
        this.f130603d.mo4402a(new RecyclerView.AbstractC1361h() {
            /* class com.p2082ss.android.ugc.aweme.kids.choosemusic.p3327i.C57314l.C573151 */

            static {
                Covode.recordClassIndex(67220);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1361h
            public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1378s sVar) {
                rect.bottom = b;
            }
        });
        this.f130601b.setOnClickListener(new View.OnClickListener() {
            /* class com.p2082ss.android.ugc.aweme.kids.choosemusic.p3327i.C57314l.View$OnClickListenerC573162 */

            static {
                Covode.recordClassIndex(67221);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                if (!C58001a.m104815a(view, 1200) && C57314l.this.f130604e != null) {
                    C57314l.this.f130604e.mo94239a(null, view, null);
                }
            }
        });
        this.f130603d.setLayoutManager(new WrapGridLayoutManager(view.getContext(), 2));
        TextView textView = this.f130601b;
        if (textView instanceof TuxTextView) {
            ((TuxTextView) textView).setTuxFont(62);
        }
    }

    /* renamed from: a */
    public final void mo94529a(final List<C57110d> list, final int i) {
        this.f130603d.setAdapter(new RecyclerView.AbstractC1350a() {
            /* class com.p2082ss.android.ugc.aweme.kids.choosemusic.p3327i.C57314l.C573173 */

            static {
                Covode.recordClassIndex(67222);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
            public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                return m103909a(this, viewGroup, i);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
            public final int getItemCount() {
                List list = list;
                if (list == null) {
                    return 0;
                }
                return list.size();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
            public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                View$OnClickListenerC57313k kVar = (View$OnClickListenerC57313k) viewHolder;
                kVar.f130598c = (C57110d) list.get(i);
                if (kVar.f130598c != null) {
                    kVar.f130596a.setText(kVar.f130598c.f130025b);
                    C34577e.m70592a(kVar.f130597b, kVar.f130598c.f130027d);
                }
            }

            /* renamed from: a */
            private static RecyclerView.ViewHolder m103909a(C573173 r5, ViewGroup viewGroup, int i) {
                boolean a;
                MethodCollector.m26663i(6735);
                View$OnClickListenerC57313k kVar = new View$OnClickListenerC57313k(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.a_w, viewGroup, false), i, C57314l.this.f130605f);
                try {
                    if (kVar.itemView.getParent() != null) {
                        try {
                            a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                        } catch (Exception unused) {
                        }
                        if (a) {
                            StringBuffer stringBuffer = new StringBuffer();
                            stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(kVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                            C22708a.m42800a(stringBuffer.toString());
                            ViewGroup viewGroup2 = (ViewGroup) kVar.itemView.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(kVar.itemView);
                            }
                        }
                    }
                } catch (Exception e) {
                    C63423ai.m115002a(e);
                    C51423a.m95786a(e);
                }
                C80493gg.f180088a = kVar.getClass().getName();
                MethodCollector.m26664o(6735);
                return kVar;
            }
        });
    }
}
