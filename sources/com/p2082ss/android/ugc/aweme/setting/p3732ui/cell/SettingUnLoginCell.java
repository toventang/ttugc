package com.p2082ss.android.ugc.aweme.setting.p3732ui.cell;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.cell.BaseCell;
import com.p2082ss.android.ugc.aweme.setting.p3732ui.p3734b.C68548c;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.cell.SettingUnLoginCell */
public final class SettingUnLoginCell extends BaseCell<C68548c> {
    static {
        Covode.recordClassIndex(80838);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: k */
    public final void mo28072k() {
        super.mo28072k();
        this.itemView.setOnClickListener(new View$OnClickListenerC68583a(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.cell.SettingUnLoginCell$a */
    static final class View$OnClickListenerC68583a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SettingUnLoginCell f153452a;

        static {
            Covode.recordClassIndex(80839);
        }

        View$OnClickListenerC68583a(SettingUnLoginCell settingUnLoginCell) {
            this.f153452a = settingUnLoginCell;
        }

        public final void onClick(View view) {
            View.OnClickListener onClickListener;
            ClickAgent.onClick(view);
            C68548c cVar = (C68548c) this.f153452a.f42160d;
            if (cVar != null && (onClickListener = cVar.f153397d) != null) {
                onClickListener.onClick(this.f153452a.itemView);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.cell.BaseCell
    /* renamed from: b */
    public final View mo62345b(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.ay7, viewGroup, false);
        C89219l.m154716b(a, "");
        return a;
    }
}
