package com.p2082ss.android.ugc.aweme.legoImp.inflate;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.C50090az;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58258q;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.p3396f.C58227a;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.legoImp.inflate.DmtStatusViewInflate */
public class DmtStatusViewInflate implements AbstractC58258q {

    /* renamed from: a */
    public DmtStatusView f132736a;

    /* renamed from: b */
    public View$OnClickListenerC58285a f132737b = new View$OnClickListenerC58285a((byte) 0);

    static {
        Covode.recordClassIndex(68362);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58258q
    /* renamed from: b */
    public final Class<? extends Activity> mo28743b() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
        return 1048575;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: g */
    public final String mo28607g() {
        return "inflate_";
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: i */
    public final boolean mo28609i() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: j */
    public final List mo28610j() {
        return null;
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.inflate.DmtStatusViewInflate$a */
    public static class View$OnClickListenerC58285a implements View.OnClickListener {

        /* renamed from: a */
        public View.OnClickListener f132738a;

        static {
            Covode.recordClassIndex(68363);
        }

        private View$OnClickListenerC58285a() {
        }

        /* synthetic */ View$OnClickListenerC58285a(byte b) {
            this();
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f132738a.onClick(view);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: f */
    public final EnumC58150ad mo28606f() {
        return EnumC58150ad.INFLATE;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: k */
    public final EnumC58148ab mo28611k() {
        return EnumC58148ab.DEFAULT;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: h */
    public final String mo28608h() {
        return getClass().getSimpleName();
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58258q
    /* renamed from: a */
    public final void mo28741a(Context context, Activity activity) {
        try {
            if (C58227a.m105170a(context)) {
                this.f132736a = m105275a(context, this.f132737b);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static DmtStatusView m105275a(Context context, View.OnClickListener onClickListener) {
        C50090az azVar = new C50090az(context);
        azVar.mo85224a(C58288a.f132746a, C58289b.f132747a, new C58290c(context, onClickListener));
        azVar.mo85226d(1);
        azVar.setUseScreenHeight(context.getResources().getDimensionPixelSize(R.dimen.n4));
        azVar.mo85225c(0);
        return azVar;
    }
}
