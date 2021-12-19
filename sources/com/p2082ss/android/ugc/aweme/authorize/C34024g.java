package com.p2082ss.android.ugc.aweme.authorize;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.dmt.p1194ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.p1194ui.widget.setting.checkable.DmtSettingSwitch;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.openauthorize.p3539a.C62703g;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.authorize.g */
public final class C34024g extends RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> {

    /* renamed from: a */
    final List<C62703g> f80471a = new ArrayList();

    static {
        Covode.recordClassIndex(40956);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m69603a(viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f80471a.size();
    }

    /* renamed from: com.ss.android.ugc.aweme.authorize.g$b */
    public static final class C34026b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final CommonItemView f80474a;

        /* renamed from: b */
        private final View f80475b;

        static {
            Covode.recordClassIndex(40958);
        }

        /* renamed from: com.ss.android.ugc.aweme.authorize.g$b$a */
        static final class C34028a implements DmtSettingSwitch.AbstractC17285a {

            /* renamed from: a */
            final /* synthetic */ C62703g f80477a;

            static {
                Covode.recordClassIndex(40960);
            }

            C34028a(C62703g gVar) {
                this.f80477a = gVar;
            }

            @Override // com.bytedance.ies.dmt.p1194ui.widget.setting.checkable.DmtSettingSwitch.AbstractC17285a
            /* renamed from: a */
            public final void mo27515a(boolean z) {
                this.f80477a.setEnabled(Boolean.valueOf(z));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34026b(View view) {
            super(view);
            C89219l.m154721d(view, "");
            this.f80475b = view;
            View findViewById = view.findViewById(R.id.dpt);
            C89219l.m154716b(findViewById, "");
            CommonItemView commonItemView = (CommonItemView) findViewById;
            this.f80474a = commonItemView;
            commonItemView.setOnClickListener(new View.OnClickListener(this) {
                /* class com.p2082ss.android.ugc.aweme.authorize.C34024g.C34026b.View$OnClickListenerC340271 */

                /* renamed from: a */
                final /* synthetic */ C34026b f80476a;

                static {
                    Covode.recordClassIndex(40959);
                }

                {
                    this.f80476a = r1;
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    this.f80476a.f80474a.setChecked(!this.f80476a.f80474a.mo27138d());
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.authorize.g$a */
    public static final class C34025a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final TextView f80472a;

        /* renamed from: b */
        private final View f80473b;

        static {
            Covode.recordClassIndex(40957);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34025a(View view) {
            super(view);
            C89219l.m154721d(view, "");
            this.f80473b = view;
            View findViewById = view.findViewById(R.id.dpv);
            C89219l.m154716b(findViewById, "");
            this.f80472a = (TextView) findViewById;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemViewType(int i) {
        if (this.f80471a.get(i).getScopeRequired() == null || !C89219l.m154714a((Object) this.f80471a.get(i).getScopeRequired(), (Object) true)) {
            return 1;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C89219l.m154721d(viewHolder, "");
        if (viewHolder instanceof C34025a) {
            C62703g gVar = this.f80471a.get(i);
            C89219l.m154721d(gVar, "");
            ((C34025a) viewHolder).f80472a.setText(gVar.getScopeDesc());
            return;
        }
        C34026b bVar = (C34026b) viewHolder;
        C62703g gVar2 = this.f80471a.get(i);
        C89219l.m154721d(gVar2, "");
        bVar.f80474a.setLeftText(gVar2.getScopeDesc());
        if (gVar2.isEnabled() == null) {
            bVar.f80474a.setChecked(true);
        } else {
            CommonItemView commonItemView = bVar.f80474a;
            Boolean isEnabled = gVar2.isEnabled();
            if (isEnabled == null) {
                C89219l.m154715b();
            }
            commonItemView.setChecked(isEnabled.booleanValue());
        }
        DmtSettingSwitch switchRight = bVar.f80474a.getSwitchRight();
        if (switchRight != null) {
            switchRight.setOnCheckedChangeListener(new C34026b.C34028a(gVar2));
        }
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m69603a(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder viewHolder;
        boolean a;
        MethodCollector.m26663i(9408);
        C89219l.m154721d(viewGroup, "");
        if (i == 0) {
            View a2 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.atl, viewGroup, false);
            C89219l.m154716b(a2, "");
            viewHolder = new C34025a(a2);
        } else {
            View a3 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.atm, viewGroup, false);
            C89219l.m154716b(a3, "");
            viewHolder = new C34026b(a3);
        }
        try {
            if (viewHolder.itemView.getParent() != null) {
                try {
                    a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(viewHolder.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) viewHolder.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(viewHolder.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = viewHolder.getClass().getName();
        MethodCollector.m26664o(9408);
        return viewHolder;
    }
}
