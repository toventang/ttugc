package com.p2082ss.android.ugc.aweme.i18n.language.p3063a;

import android.content.Context;
import android.graphics.Color;
import android.os.Handler;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.p2379ui.C34692l;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.language.AbstractC58069b;
import com.p2082ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.p2082ss.android.ugc.aweme.video.C81079v;
import com.p2082ss.android.ugc.aweme.views.DialogC81459o;
import com.p2082ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.i18n.language.a.a */
public final class DialogC53439a extends DialogC81459o {

    /* renamed from: a */
    RecyclerView f122651a = ((RecyclerView) findViewById(R.id.c_b));

    /* renamed from: b */
    boolean f122652b;

    /* renamed from: c */
    private Handler f122653c;

    static {
        Covode.recordClassIndex(63008);
    }

    @Override // com.p2082ss.android.ugc.aweme.views.DialogC81459o
    public final void ar_() {
        this.f182108l = (int) C13628n.m24520b(C17867d.m33078a(), 280.0f);
    }

    public final void dismiss() {
        super.dismiss();
        if (this.f122652b) {
            C81079v.m140776O().mo123950y();
            this.f122652b = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo90005b() {
        if (C81079v.m140776O().mo123892o()) {
            C81079v.m140776O().mo123908B();
            this.f122652b = true;
            return;
        }
        this.f122653c.postDelayed(new RunnableC53442d(this), 1000);
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            mo90005b();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogC53439a(Context context, String[] strArr) {
        super(context, R.style.va, false, true);
        setContentView(R.layout.mc);
        findViewById(R.id.a0z).setOnClickListener(new View$OnClickListenerC53440b(this));
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        setOnKeyListener(DialogInterface$OnKeyListenerC53441c.f122655a);
        ArrayList arrayList = new ArrayList();
        Map<String, AbstractC58069b> j = SettingServiceImpl.m120782v().mo108874j();
        HashMap hashMap = new HashMap();
        for (AbstractC58069b bVar : j.values()) {
            hashMap.put(bVar.mo90017a(), bVar);
        }
        for (String str : strArr) {
            Object obj = hashMap.get(str);
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        this.f122651a.setLayoutManager(new WrapLinearLayoutManager());
        this.f122651a.mo4415b(new C34692l(C34728n.m70946a(0.5d), Color.parseColor("#20161823")));
        this.f122651a.setAdapter(new C53443e(context, arrayList, this));
        this.f122653c = new Handler();
        C39162r.m79460a("show_language_popup", new C33744d().mo59983a("enter_from", "homepage_hot").f79943a);
    }
}
