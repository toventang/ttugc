package com.p2082ss.android.ugc.aweme.setting.p3732ui.cell;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.cell.BaseCell;
import com.p2082ss.android.ugc.aweme.p2386be.AbstractC34793a;
import com.p2082ss.android.ugc.aweme.setting.p3732ui.p3734b.C68547b;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.cell.SettingFooterCell */
public final class SettingFooterCell extends BaseCell<C68547b> {

    /* renamed from: a */
    public TuxTextView f153447a;

    /* renamed from: b */
    public TuxTextView f153448b;

    /* renamed from: j */
    private RelativeLayout f153449j;

    static {
        Covode.recordClassIndex(80835);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: k */
    public final void mo28072k() {
        TuxTextView tuxTextView;
        super.mo28072k();
        RelativeLayout relativeLayout = this.f153449j;
        TuxTextView tuxTextView2 = null;
        if (relativeLayout != null) {
            tuxTextView = (TuxTextView) relativeLayout.findViewById(R.id.f_t);
        } else {
            tuxTextView = null;
        }
        this.f153447a = tuxTextView;
        if (tuxTextView != null) {
            tuxTextView.setOnClickListener(new View$OnClickListenerC68581a(this));
        }
        RelativeLayout relativeLayout2 = this.f153449j;
        if (relativeLayout2 != null) {
            tuxTextView2 = (TuxTextView) relativeLayout2.findViewById(R.id.fbh);
        }
        this.f153448b = tuxTextView2;
        if (tuxTextView2 != null) {
            tuxTextView2.setOnClickListener(new View$OnClickListenerC68582b(this));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.cell.SettingFooterCell$a */
    static final class View$OnClickListenerC68581a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SettingFooterCell f153450a;

        static {
            Covode.recordClassIndex(80836);
        }

        View$OnClickListenerC68581a(SettingFooterCell settingFooterCell) {
            this.f153450a = settingFooterCell;
        }

        public final void onClick(View view) {
            View.OnClickListener onClickListener;
            ClickAgent.onClick(view);
            C68547b bVar = (C68547b) this.f153450a.f42160d;
            if (bVar != null && (onClickListener = bVar.f153388e) != null) {
                onClickListener.onClick(this.f153450a.f153447a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.cell.SettingFooterCell$b */
    static final class View$OnClickListenerC68582b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SettingFooterCell f153451a;

        static {
            Covode.recordClassIndex(80837);
        }

        View$OnClickListenerC68582b(SettingFooterCell settingFooterCell) {
            this.f153451a = settingFooterCell;
        }

        public final void onClick(View view) {
            View.OnClickListener onClickListener;
            ClickAgent.onClick(view);
            C68547b bVar = (C68547b) this.f153451a.f42160d;
            if (bVar != null && (onClickListener = bVar.f153389f) != null) {
                onClickListener.onClick(this.f153451a.f153448b);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo62344a(C68547b bVar) {
        C89219l.m154721d(bVar, "");
        super.mo23350a((AbstractC34793a) bVar);
        RelativeLayout relativeLayout = this.f153449j;
        if (relativeLayout != null) {
            relativeLayout.setBackgroundColor(bVar.f153387d);
        }
        TuxTextView tuxTextView = this.f153447a;
        if (tuxTextView != null) {
            tuxTextView.setVisibility(bVar.f153391h);
        }
        TuxTextView tuxTextView2 = this.f153447a;
        if (tuxTextView2 != null) {
            tuxTextView2.setText(bVar.f153392i);
        }
        TuxTextView tuxTextView3 = this.f153448b;
        if (tuxTextView3 != null) {
            tuxTextView3.setText(bVar.f153390g);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.cell.BaseCell
    /* renamed from: b */
    public final View mo62345b(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.axw, viewGroup, false);
        Objects.requireNonNull(a, "null cannot be cast to non-null type android.widget.RelativeLayout");
        this.f153449j = (RelativeLayout) a;
        C89219l.m154716b(a, "");
        return a;
    }
}
