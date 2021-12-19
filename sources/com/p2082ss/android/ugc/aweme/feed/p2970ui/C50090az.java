package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.common.C17175b;
import com.bytedance.ies.dmt.p1194ui.widget.C17275e;
import com.bytedance.ies.dmt.p1194ui.widget.DmtLoadingLayout;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.az */
public final class C50090az extends DmtStatusView {

    /* renamed from: b */
    private List<View> f115620b = new ArrayList(3);

    /* renamed from: c */
    private List<AbstractC50091a> f115621c = new ArrayList(3);

    /* renamed from: d */
    private int f115622d = -1;

    /* renamed from: e */
    private int f115623e = -1;

    /* renamed from: f */
    private Integer f115624f = null;

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.az$a */
    public interface AbstractC50091a {
        static {
            Covode.recordClassIndex(59217);
        }

        /* renamed from: a */
        View mo85227a(View view);
    }

    static {
        Covode.recordClassIndex(59216);
    }

    @Override // com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView
    /* renamed from: c */
    public final DmtStatusView.C17269a mo27381c() {
        return null;
    }

    @Override // com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView
    public final void setBuilder(DmtStatusView.C17269a aVar) {
    }

    @Override // com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView
    /* renamed from: j */
    public final boolean mo27389j() {
        if (this.f115622d == 0) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView
    /* renamed from: k */
    public final boolean mo27390k() {
        if (this.f115622d == 1) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView
    /* renamed from: e */
    public final boolean mo27383e() {
        if (this.f115622d == -1) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView
    /* renamed from: l */
    public final boolean mo27391l() {
        if (this.f115622d == 2) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView
    /* renamed from: d */
    public final void mo27382d() {
        int i = this.f115622d;
        if (i != -1) {
            View view = this.f115620b.get(i);
            if (view != null) {
                view.setVisibility(8);
            }
            setVisibility(8);
            this.f115622d = -1;
        }
    }

    @Override // com.bytedance.ies.dmt.p1194ui.common.AbstractC17178d, com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView
    /* renamed from: a */
    public final void mo27128a(int i) {
        mo85226d(i);
    }

    public C50090az(Context context) {
        super(context);
    }

    @Override // com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView
    public final void setStatus(int i) {
        View view;
        int i2 = this.f115622d;
        if (i2 != i) {
            if (i2 >= 0 && (view = this.f115620b.get(i2)) != null) {
                view.setVisibility(8);
            }
            if (i >= 0) {
                setVisibility(0);
                View c = mo85225c(i);
                if (c != null) {
                    c.setVisibility(0);
                }
            } else {
                setVisibility(8);
            }
            this.f115622d = i;
        }
    }

    @Override // com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView, com.bytedance.ies.dmt.p1194ui.widget.AbstractC17279h
    public final void setUseScreenHeight(int i) {
        View view = this.f115620b.get(0);
        if (view instanceof DmtLoadingLayout) {
            ((DmtLoadingLayout) view).setUseScreenHeight(i);
        }
        View view2 = this.f115620b.get(1);
        if (view2 instanceof C17275e) {
            ((C17275e) view2).setUseScreenHeight(i);
        }
        View view3 = this.f115620b.get(2);
        if (view3 instanceof C17275e) {
            ((C17275e) view3).setUseScreenHeight(i);
        }
        this.f115624f = Integer.valueOf(i);
    }

    /* renamed from: d */
    public final void mo85226d(int i) {
        if (i >= 0 && this.f115623e != i) {
            this.f115623e = i;
            View view = this.f115620b.get(0);
            if (view instanceof DmtLoadingLayout) {
                ((DmtLoadingLayout) view).mo27128a(this.f115623e);
            }
            View view2 = this.f115620b.get(1);
            if (view2 instanceof C17275e) {
                ((C17275e) view2).mo27128a(this.f115623e);
            }
            View view3 = this.f115620b.get(2);
            if (view3 instanceof C17275e) {
                ((C17275e) view3).mo27128a(this.f115623e);
            }
        }
    }

    /* renamed from: c */
    public final View mo85225c(int i) {
        View view = this.f115620b.get(i);
        if (view == null && this.f115621c.get(i) != null) {
            this.f115621c.set(i, null);
            view = this.f115621c.get(i).mo85227a(this);
            boolean z = view instanceof C17275e;
            if (z && getForceDarkTheme().booleanValue()) {
                ((C17275e) view).mo27467a((Boolean) true);
            }
            if (view != null) {
                this.f115620b.set(i, view);
                Integer num = this.f115624f;
                if (num != null) {
                    if (i == 0) {
                        if (view instanceof DmtLoadingLayout) {
                            ((DmtLoadingLayout) view).setUseScreenHeight(num.intValue());
                        }
                    } else if (i == 1) {
                        if (z) {
                            ((C17275e) view).setUseScreenHeight(num.intValue());
                        }
                    } else if (i == 2 && z) {
                        ((C17275e) view).setUseScreenHeight(num.intValue());
                    }
                }
                int i2 = this.f115623e;
                if (i2 > 0) {
                    if (i == 0) {
                        if (view instanceof DmtLoadingLayout) {
                            ((DmtLoadingLayout) view).mo27128a(i2);
                        }
                    } else if (i == 1) {
                        if (z) {
                            ((C17275e) view).mo27128a(i2);
                        }
                    } else if (i == 2 && z) {
                        ((C17275e) view).mo27128a(i2);
                    }
                }
                view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                view.setVisibility(8);
                addView(view);
            }
        }
        return view;
    }

    /* renamed from: a */
    public final void mo85224a(AbstractC50091a aVar, AbstractC50091a aVar2, AbstractC50091a aVar3) {
        this.f115620b.add(0, null);
        this.f115620b.add(1, null);
        this.f115620b.add(2, null);
        this.f115621c.add(0, aVar);
        this.f115621c.add(1, aVar2);
        this.f115621c.add(2, aVar3);
        if (this.f115623e < 0) {
            this.f115623e = C17175b.C17176a.f40922a.f40921a;
        }
    }
}
