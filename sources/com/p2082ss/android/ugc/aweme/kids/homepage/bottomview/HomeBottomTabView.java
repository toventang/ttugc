package com.p2082ss.android.ugc.aweme.kids.homepage.bottomview;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.base.utils.C34723i;
import com.p2082ss.android.ugc.aweme.kids.common.p3330c.C57350b;
import com.p2082ss.android.ugc.aweme.kids.common.p3330c.C57354e;
import com.p2082ss.android.ugc.aweme.kids.experiment.abmock.C57611a;
import com.p2082ss.android.ugc.aweme.kids.experiment.abmock.p3351a.C57613a;
import com.p2082ss.android.ugc.aweme.kids.homepage.bottomview.p3354a.AbstractC57625a;
import com.p2082ss.android.ugc.aweme.kids.homepage.bottomview.p3354a.C57626b;
import com.p2082ss.android.ugc.aweme.kids.homepage.bottomview.p3354a.C57627c;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.kids.homepage.bottomview.HomeBottomTabView */
public class HomeBottomTabView extends LinearLayout {

    /* renamed from: a */
    AbstractC57625a f131515a;

    /* renamed from: b */
    String f131516b;

    /* renamed from: c */
    AbstractC57633g f131517c;

    /* renamed from: d */
    public HashMap<String, AbstractC57625a> f131518d;

    /* renamed from: e */
    private View f131519e;

    /* renamed from: f */
    private AbstractC57625a f131520f;

    /* renamed from: g */
    private AbstractC57625a f131521g;

    /* renamed from: h */
    private AbstractC57625a f131522h;

    /* renamed from: i */
    private AbstractC57625a f131523i;

    /* renamed from: j */
    private LinearLayout f131524j;

    /* renamed from: k */
    private HashMap<String, String> f131525k;

    static {
        Covode.recordClassIndex(67584);
    }

    public void setTabSelectListener(AbstractC57633g gVar) {
        this.f131517c = gVar;
    }

    private void setUpDivider(LinearLayout linearLayout) {
        MethodCollector.m26663i(4333);
        View view = new View(getContext());
        this.f131519e = view;
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, 1));
        linearLayout.addView(this.f131519e);
        MethodCollector.m26664o(4333);
    }

    private void setUpTabContainer(LinearLayout linearLayout) {
        MethodCollector.m26663i(4388);
        this.f131524j = new LinearLayout(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 1.0f;
        this.f131524j.setLayoutParams(layoutParams);
        this.f131524j.setOrientation(0);
        linearLayout.addView(this.f131524j);
        MethodCollector.m26664o(4388);
    }

    public void setCurrentTab(String str) {
        C33743c a = new C33743c().mo59976a("enter_from", "click_tab").mo59976a("previous_page", this.f131516b);
        if (TextUtils.equals("homepage_hot", this.f131516b)) {
            a.mo59976a("group_id", C57350b.f130723a).mo59976a("author_id", C57350b.f130724b);
        }
        String str2 = this.f131525k.get(str);
        if (!TextUtils.isEmpty(str2)) {
            C57354e.m103958a(str2, a.mo59977a());
        }
        post(new RunnableC57632f(this, str, this.f131516b));
    }

    /* renamed from: a */
    public final void mo94920a(String str) {
        boolean z;
        boolean z2 = false;
        if (TextUtils.equals(str, "homepage_hot") || TextUtils.equals(str, "tab_draft")) {
            z = true;
            setBackgroundColor(C0643b.m2378c(getContext(), R.color.a2));
            this.f131519e.setBackgroundColor(C0643b.m2378c(getContext(), R.color.b3));
        } else {
            z = false;
            setBackgroundColor(C0643b.m2378c(getContext(), R.color.l));
            this.f131519e.setBackgroundColor(C0643b.m2378c(getContext(), R.color.b2));
        }
        this.f131520f.setSelected(TextUtils.equals(str, "homepage_hot"));
        this.f131521g.setSelected(TextUtils.equals(str, "discovery"));
        this.f131522h.setSelected(TextUtils.equals(str, "liked"));
        AbstractC57625a aVar = this.f131523i;
        if (TextUtils.equals(str, "personal_homepage") || TextUtils.equals(str, "tab_draft")) {
            z2 = true;
        }
        aVar.setSelected(z2);
        this.f131520f.mo94925a(z);
        this.f131521g.mo94925a(z);
        this.f131515a.mo94925a(z);
        this.f131522h.mo94925a(z);
        this.f131523i.mo94925a(z);
    }

    public HomeBottomTabView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private HomeBottomTabView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(4239);
        this.f131516b = "homepage_hot";
        this.f131518d = new HashMap<>();
        this.f131525k = new HashMap<>();
        setOrientation(1);
        setUpDivider(this);
        setUpTabContainer(this);
        this.f131520f = new C57627c(getContext(), getContext().getString(R.string.crl), 2131233039, 2131233040, 2131233041, 2131233041);
        if (((Integer) C57611a.m104321a(C57613a.f131505a)).intValue() == 0) {
            this.f131521g = new C57627c(getContext(), getContext().getString(R.string.crm), 2131233032, 2131233034, 2131233037, 2131233037);
        } else {
            this.f131521g = new C57627c(getContext(), getContext().getString(R.string.crm), 2131233033, 2131233035, 2131233038, 2131233038);
        }
        this.f131515a = new C57626b(getContext());
        this.f131522h = new C57627c(getContext(), getContext().getString(R.string.crn), 2131233042, 2131233043, 2131233045, 2131233045);
        this.f131523i = new C57627c(getContext(), getContext().getString(R.string.crq), 2131233046, 2131233047, 2131233049, 2131233048);
        if (this.f131524j.getChildCount() > 0) {
            this.f131524j.removeAllViews();
        }
        this.f131520f.setOnClickListener(new View$OnClickListenerC57624a(this));
        this.f131521g.setOnClickListener(new View$OnClickListenerC57628b(this));
        this.f131515a.setOnClickListener(new View$OnClickListenerC57629c(this));
        this.f131522h.setOnClickListener(new View$OnClickListenerC57630d(this));
        this.f131523i.setOnClickListener(new View$OnClickListenerC57631e(this));
        this.f131524j.addView(this.f131520f);
        this.f131524j.addView(this.f131521g);
        this.f131524j.addView(this.f131515a);
        this.f131524j.addView(this.f131522h);
        this.f131524j.addView(this.f131523i);
        int d = (int) (((float) C34723i.m70931d(getContext())) / 5.0f);
        this.f131520f.setLayoutParams(new LinearLayout.LayoutParams(d, -1));
        this.f131521g.setLayoutParams(new LinearLayout.LayoutParams(d, -1));
        this.f131515a.setLayoutParams(new LinearLayout.LayoutParams(d, -1));
        this.f131522h.setLayoutParams(new LinearLayout.LayoutParams(d, -1));
        this.f131523i.setLayoutParams(new LinearLayout.LayoutParams(d, -1));
        this.f131518d.put("homepage_hot", this.f131520f);
        this.f131518d.put("discovery", this.f131521g);
        this.f131518d.put("tab_publish", this.f131515a);
        this.f131518d.put("liked", this.f131522h);
        this.f131518d.put("personal_homepage", this.f131523i);
        this.f131525k.put("homepage_hot", "enter_home_hot_page");
        this.f131525k.put("discovery", "enter_discovery_page");
        this.f131525k.put("liked", "enter_liked_page");
        this.f131525k.put("personal_homepage", "enter_personal_homepage");
        mo94920a(this.f131516b);
        MethodCollector.m26664o(4239);
    }
}
