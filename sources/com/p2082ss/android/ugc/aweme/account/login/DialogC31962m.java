package com.p2082ss.android.ugc.aweme.account.login;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.status.loading.TuxDualBallView;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.account.login.m */
public final class DialogC31962m extends Dialog {

    /* renamed from: a */
    public AbstractC31963a f76326a;

    /* renamed from: com.ss.android.ugc.aweme.account.login.m$a */
    public interface AbstractC31963a {
        static {
            Covode.recordClassIndex(38708);
        }

        /* renamed from: e */
        void mo57803e();
    }

    static {
        Covode.recordClassIndex(38707);
    }

    public final void onBackPressed() {
        super.onBackPressed();
        AbstractC31963a aVar = this.f76326a;
        if (aVar != null) {
            aVar.mo57803e();
        }
    }

    public DialogC31962m(Context context) {
        super(context, R.style.ui);
        MethodCollector.m26663i(10468);
        View inflate = LayoutInflater.from(context).inflate(R.layout.fy, (ViewGroup) null);
        ((TuxDualBallView) inflate.findViewById(R.id.eqx)).mo37884b();
        setContentView(inflate);
        setCanceledOnTouchOutside(false);
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.height = (int) C13628n.m24520b(context, 57.0f);
        attributes.width = (int) C13628n.m24520b(context, 57.0f);
        window.setAttributes(attributes);
        MethodCollector.m26664o(10468);
    }
}
