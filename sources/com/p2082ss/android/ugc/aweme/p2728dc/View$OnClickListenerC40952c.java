package com.p2082ss.android.ugc.aweme.p2728dc;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.ActivityC0945e;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.DmtTextView;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.vcloud.mlcomponent_api.BuildConfig;
import com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.inbox.p3267b.C56318b;
import com.p2082ss.android.ugc.aweme.login.C58957c;
import com.p2082ss.android.ugc.aweme.main.TabChangeManager;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.dc.c */
public final class View$OnClickListenerC40952c extends AbstractC34586a implements View.OnClickListener, AbstractC90252i, AbstractC90253j {

    /* renamed from: b */
    public static final C40953a f95785b = new C40953a((byte) 0);

    /* renamed from: a */
    public boolean f95786a = true;

    /* renamed from: c */
    private SparseArray f95787c;

    /* renamed from: com.ss.android.ugc.aweme.dc.c$c */
    static final class View$OnTouchListenerC40955c implements View.OnTouchListener {

        /* renamed from: a */
        public static final View$OnTouchListenerC40955c f95789a = new View$OnTouchListenerC40955c();

        static {
            Covode.recordClassIndex(48807);
        }

        View$OnTouchListenerC40955c() {
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    static {
        Covode.recordClassIndex(48804);
    }

    /* renamed from: a */
    private View m82457a(int i) {
        if (this.f95787c == null) {
            this.f95787c = new SparseArray();
        }
        View view = (View) this.f95787c.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f95787c.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    /* renamed from: H */
    public final boolean mo61043H() {
        return true;
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(Integer.valueOf((int) BuildConfig.VERSION_CODE), new RunnableC90250g(View$OnClickListenerC40952c.class, "onEvent", C40949a.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    /* renamed from: com.ss.android.ugc.aweme.dc.c$a */
    public static final class C40953a {
        static {
            Covode.recordClassIndex(48805);
        }

        private C40953a() {
        }

        public /* synthetic */ C40953a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    private String m82458a() {
        if (this.f95786a) {
            return "message";
        }
        return "personal_homepage";
    }

    /* renamed from: b */
    private String m82459b() {
        if (this.f95786a) {
            return "click_message";
        }
        return "click_mine";
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f95787c;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.dc.c$b */
    static final class C40954b implements AbstractC34543f {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC40952c f95788a;

        static {
            Covode.recordClassIndex(48806);
        }

        C40954b(View$OnClickListenerC40952c cVar) {
            this.f95788a = cVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f
        /* renamed from: b */
        public final void mo57674b() {
        }

        @Override // com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f
        /* renamed from: a */
        public final void mo57673a() {
            ActivityC0945e activity = this.f95788a.getActivity();
            if (activity == null) {
                C89219l.m154715b();
            }
            TabChangeManager.C59002a.m108439a(activity).mo96533a("HOME", false);
        }
    }

    @AbstractC90264r
    public final void onEvent(C40949a aVar) {
        C89219l.m154721d(aVar, "");
        if (!this.f95786a) {
            ActivityC0945e activity = getActivity();
            if (activity == null) {
                C89219l.m154715b();
            }
            TabChangeManager.C59002a.m108439a(activity).mo96533a("HOME", false);
        }
    }

    public final void onClick(View view) {
        String str;
        ClickAgent.onClick(view);
        if (view != null && !C58001a.m104815a(view, 1200)) {
            int id = view.getId();
            if (id == R.id.yz) {
                C58957c.m108325a(this, m82458a(), m82459b(), new C40954b(this));
                C40956d.m82463a(m82458a(), m82459b());
            } else if (id == R.id.dwg) {
                ActivityC0945e activity = getActivity();
                if (C80580in.m139687c()) {
                    str = "//childrenmode/setting";
                } else {
                    str = "//setting";
                }
                SmartRouter.buildRoute(activity, str).open();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        int i;
        int i2;
        int identifier;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        view.setOnTouchListener(View$OnTouchListenerC40955c.f95789a);
        Bundle arguments = getArguments();
        if (arguments != null) {
            str = arguments.getString("tab");
        } else {
            str = null;
        }
        this.f95786a = TextUtils.equals(str, "UNLOGIN_NOTIFICATION");
        C89219l.m154721d(view, "");
        Context context = getContext();
        if (context == null || (identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android")) <= 0) {
            i = 0;
        } else {
            i = context.getResources().getDimensionPixelSize(identifier);
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i > 0) {
            View a = m82457a(R.id.b9r);
            C89219l.m154716b(a, "");
            a.getLayoutParams().height = i;
        } else {
            View a2 = m82457a(R.id.b9r);
            C89219l.m154716b(a2, "");
            a2.setVisibility(8);
        }
        if (this.f95786a) {
            DmtTextView dmtTextView = (DmtTextView) m82457a(R.id.f63);
            C89219l.m154716b(dmtTextView, "");
            Context context2 = view.getContext();
            if (C56318b.m102311b()) {
                i2 = R.string.dj0;
            } else {
                i2 = R.string.apf;
            }
            dmtTextView.setText(context2.getText(i2));
            DmtTextView dmtTextView2 = (DmtTextView) m82457a(R.id.bf2);
            C89219l.m154716b(dmtTextView2, "");
            dmtTextView2.setText(view.getContext().getText(R.string.ape));
            ((ImageView) m82457a(R.id.ble)).setImageResource(2131232130);
        } else {
            DmtTextView dmtTextView3 = (DmtTextView) m82457a(R.id.f63);
            C89219l.m154716b(dmtTextView3, "");
            dmtTextView3.setText(view.getContext().getText(R.string.ewn));
            DmtTextView dmtTextView4 = (DmtTextView) m82457a(R.id.bf2);
            C89219l.m154716b(dmtTextView4, "");
            dmtTextView4.setText(view.getContext().getText(R.string.ewm));
            ((ImageView) m82457a(R.id.ble)).setImageResource(2131232129);
            TuxIconView tuxIconView = (TuxIconView) m82457a(R.id.dwg);
            C89219l.m154716b(tuxIconView, "");
            tuxIconView.setVisibility(0);
        }
        ((DmtTextView) m82457a(R.id.yz)).setOnClickListener(this);
        ((TuxIconView) m82457a(R.id.dwg)).setOnClickListener(this);
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.a3n, viewGroup, false);
    }
}
