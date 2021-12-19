package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.content.C0643b;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.common.C17177c;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.account.model.AbstractC32846a;
import com.p2082ss.android.ugc.aweme.geofencing.PublishSettingItem;
import com.p2082ss.android.ugc.aweme.p2730de.C40963b;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.property.C65405cq;
import com.p2082ss.android.ugc.aweme.shortvideo.p3838k.C71912f;
import com.p2082ss.android.ugc.aweme.shortvideo.p3838k.C71918l;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73979bb;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.PermissionSettingItem */
public class PermissionSettingItem extends PublishSettingItem implements View.OnClickListener {

    /* renamed from: a */
    public boolean f164650a;

    /* renamed from: b */
    public boolean f164651b;

    /* renamed from: c */
    public boolean f164652c;

    /* renamed from: n */
    private ArrayList<View.OnClickListener> f164653n;

    /* renamed from: o */
    private int f164654o = -1;

    /* renamed from: p */
    private List<User> f164655p;

    /* renamed from: q */
    private int f164656q;

    /* renamed from: r */
    private String f164657r;

    /* renamed from: s */
    private int f164658s;

    /* renamed from: t */
    private String f164659t = "0";

    static {
        Covode.recordClassIndex(86039);
    }

    public int getAllowRecommend() {
        return this.f164656q;
    }

    public List<User> getExcludeUserList() {
        return this.f164655p;
    }

    public String getMissionId() {
        return this.f164659t;
    }

    public int getMissionStatus() {
        return this.f164658s;
    }

    public int getPermission() {
        return this.f164654o;
    }

    public String getPreventSelfSeeReason() {
        return this.f164657r;
    }

    /* renamed from: b */
    private static int m129363b() {
        if (C71912f.m126987a()) {
            return 2131232498;
        }
        return 2131230992;
    }

    /* renamed from: d */
    private static int m129364d() {
        if (C71912f.m126987a()) {
            return 2131232500;
        }
        return 2131230958;
    }

    /* renamed from: e */
    private static int m129365e() {
        if (C71912f.m126987a()) {
            return 2131232499;
        }
        return 2131232371;
    }

    /* renamed from: f */
    private static int m129366f() {
        if (C71912f.m126987a()) {
            return 2131232500;
        }
        return 2131232388;
    }

    /* renamed from: a */
    private void m129362a() {
        if (!this.f164652c) {
            Keva repo = Keva.getRepo("publish_exclude");
            if (C71918l.f161155a && !repo.getBoolean("exclude_guide_showed", false)) {
                mo88512a(true);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f121606d.getLayoutParams();
                layoutParams.bottomMargin = 0;
                this.f121606d.setLayoutParams(layoutParams);
                setSubtitle(C40963b.m82473a().getString(R.string.eyi));
                this.f121609g.postDelayed(new Runnable() {
                    /* class com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.PermissionSettingItem.RunnableC733161 */

                    static {
                        Covode.recordClassIndex(86040);
                    }

                    public final void run() {
                        PermissionSettingItem permissionSettingItem = PermissionSettingItem.this;
                        permissionSettingItem.f121609g.postDelayed(new RunnableC73449ab(permissionSettingItem), 500);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(permissionSettingItem.f121609g, "alpha", 1.0f, 0.0f, 1.0f);
                        ofFloat.setDuration(1000L);
                        ofFloat.start();
                    }
                }, 3500);
                Keva.getRepo("publish_exclude").storeBoolean("exclude_guide_showed", true);
            }
        }
    }

    public void setAdvPromotable(boolean z) {
        this.f164651b = z;
    }

    public void setAllowRecommend(int i) {
        this.f164656q = i;
    }

    public void setFromChangePrivacy(boolean z) {
        this.f164652c = z;
    }

    public void setMissionId(String str) {
        this.f164659t = str;
    }

    public void setMissionStatus(int i) {
        this.f164658s = i;
    }

    /* renamed from: a */
    public final void mo115832a(View.OnClickListener onClickListener) {
        if (this.f164653n == null) {
            this.f164653n = new ArrayList<>();
        }
        this.f164653n.add(onClickListener);
    }

    public void onClick(View view) {
        ClickAgent.onClick(view);
        mo88512a(false);
        if (!C13603b.m24435a((Collection) this.f164653n)) {
            Iterator<View.OnClickListener> it = this.f164653n.iterator();
            while (it.hasNext()) {
                it.next().onClick(view);
            }
        }
    }

    public PermissionSettingItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setDrawableLeft(C0643b.m2369a(context, m129363b()));
        setTitle(R.string.gf_);
        AbstractC32846a e = C63244g.m114602a().mo73255A().mo93906e();
        if (e == null || !e.mo58662e()) {
            setSubtitle(R.string.sc);
        } else {
            setSubtitle(R.string.exz);
        }
        this.f121610h.setBackground(C17177c.m31711c(context));
        if (!C65405cq.m117106a()) {
            setVisibility(8);
        }
        setOnClickListener(this);
    }

    /* renamed from: a */
    public final void mo115830a(int i, List<User> list, int i2) {
        String str;
        this.f164654o = i;
        this.f164655p = list;
        this.f164656q = i2;
        if (list != null) {
            str = C73979bb.m130115a(list.size(), list);
        } else {
            str = "";
        }
        setTitle(R.string.gf_);
        boolean z = true;
        if (this.f164651b) {
            if (C63238c.f143594u.mo93906e() == null || !C63238c.f143594u.mo93906e().mo58662e()) {
                z = false;
            }
            if (i != 0 || z) {
                setSubtitle(R.string.df6);
                setDrawableLeft(m129366f());
                return;
            }
            setSubtitle(R.string.exy);
            setDrawableLeft(m129363b());
            return;
        }
        if (i == -1) {
            setSubtitle(R.string.eq6);
        } else if (i == 0) {
            AbstractC32846a e = C63244g.m114602a().mo73255A().mo93906e();
            if (e == null || !e.mo58662e()) {
                setSubtitle(R.string.sc);
            } else {
                setSubtitle(R.string.exz);
            }
            setDrawableLeft(m129363b());
        } else if (i == 1) {
            setSubtitle(R.string.h83);
            setDrawableLeft(m129366f());
        } else if (i == 3) {
            setTitle(C40963b.m82473a().getString(R.string.eyc));
            setDrawableLeft(m129364d());
            setSubtitle(str);
        } else {
            setSubtitle(R.string.c0v);
            setDrawableLeft(m129365e());
        }
        m129362a();
    }

    /* renamed from: a */
    public final void mo115831a(int i, List<User> list, int i2, boolean z, String str) {
        this.f164657r = str;
        this.f164650a = z;
        this.f164656q = i2;
        mo115830a(i, list, i2);
    }
}
