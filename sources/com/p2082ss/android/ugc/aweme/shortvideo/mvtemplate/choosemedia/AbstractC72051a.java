package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.DmtLoadingLayout;
import com.facebook.drawee.p1857h.AbstractC24255a;
import com.p2082ss.android.ugc.aweme.p3290j.C56814b;
import com.p2082ss.android.ugc.aweme.property.C65422de;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C70455f;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C72235n;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.C72440e;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73986be;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.a */
public abstract class AbstractC72051a extends C56814b {

    /* renamed from: b */
    public int f161490b = 4;

    /* renamed from: c */
    protected MvImageChooseAdapter f161491c;

    /* renamed from: d */
    protected RecyclerView f161492d;

    /* renamed from: e */
    public MvImageChooseAdapter.AbstractC72048c f161493e;

    /* renamed from: f */
    protected View f161494f;

    /* renamed from: g */
    protected TextView f161495g;

    /* renamed from: h */
    protected DmtLoadingLayout f161496h;

    /* renamed from: i */
    protected int f161497i = C72440e.m127809a();

    /* renamed from: j */
    protected boolean f161498j;

    /* renamed from: k */
    public int f161499k;

    /* renamed from: l */
    protected List<String> f161500l = new ArrayList();

    /* renamed from: m */
    protected Long f161501m = 0L;

    /* renamed from: n */
    public boolean f161502n = false;

    /* renamed from: o */
    public int f161503o = -1;

    /* renamed from: p */
    public C72235n.AbstractC72241a f161504p;

    /* renamed from: q */
    private boolean f161505q = false;

    /* renamed from: r */
    private boolean f161506r = false;

    /* renamed from: s */
    private boolean f161507s = false;

    static {
        Covode.recordClassIndex(84716);
    }

    /* renamed from: a */
    public abstract void mo114332a(List<MvImageChooseAdapter.MyMediaModel> list, boolean z);

    /* renamed from: a */
    public void mo114333a(boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo114338c() {
        this.f161507s = true;
    }

    /* renamed from: d */
    public final void mo114341d() {
        MvImageChooseAdapter mvImageChooseAdapter = this.f161491c;
        if (mvImageChooseAdapter != null) {
            mvImageChooseAdapter.mo114283d();
        }
    }

    /* renamed from: e */
    public final void mo114342e() {
        MvImageChooseAdapter mvImageChooseAdapter = this.f161491c;
        if (mvImageChooseAdapter != null) {
            mvImageChooseAdapter.mo114284e();
        }
    }

    /* renamed from: b */
    public final int mo114334b() {
        MvImageChooseAdapter mvImageChooseAdapter = this.f161491c;
        if (mvImageChooseAdapter != null) {
            return mvImageChooseAdapter.f161438e;
        }
        return 0;
    }

    /* renamed from: f */
    public final void mo114343f() {
        C72235n nVar;
        RecyclerView recyclerView = this.f161492d;
        if ((recyclerView instanceof FastScrollRecyclerView) && (nVar = ((FastScrollRecyclerView) recyclerView).f161393O) != null && C72235n.m127437a(nVar.f161947e) && nVar.f161947e != null) {
            nVar.getHandler().removeCallbacks(nVar.f161955m);
            C72235n.m127436a(nVar.f161948f);
            nVar.f161947e.setVisibility(8);
        }
    }

    /* renamed from: g */
    public final String mo114344g() {
        String a = C72440e.m127810a(this.f161494f.getContext());
        int i = this.f161499k;
        if (i == 1 || i == 10) {
            return C1764a.m5928a(getString(R.string.b1l), new Object[]{Integer.valueOf(this.f161497i)});
        } else if (i == 16) {
            return C1764a.m5928a(getString(R.string.b1l), new Object[]{10});
        } else if (C70455f.f157420d) {
            return C72440e.m127810a(this.f161494f.getContext());
        } else {
            if (C70455f.f157420d) {
                return C70455f.m124266a(this.f161494f.getContext());
            }
            return a;
        }
    }

    /* renamed from: a */
    public final void mo114329a(MvImageChooseAdapter.MyMediaModel myMediaModel) {
        MvImageChooseAdapter mvImageChooseAdapter = this.f161491c;
        if (mvImageChooseAdapter != null) {
            mvImageChooseAdapter.mo114276a(myMediaModel);
        }
    }

    /* renamed from: a */
    public final void mo114331a(List<String> list) {
        this.f161498j = true;
        this.f161500l.addAll(list);
    }

    /* renamed from: b */
    public final void mo114335b(int i) {
        this.f161497i = i;
        MvImageChooseAdapter mvImageChooseAdapter = this.f161491c;
        if (mvImageChooseAdapter != null) {
            mvImageChooseAdapter.f161434a = i;
        }
    }

    /* renamed from: c */
    public final void mo114339c(int i) {
        RecyclerView.AbstractC1362i layoutManager;
        RecyclerView recyclerView = this.f161492d;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && layoutManager.mo4358c(i) == null) {
            layoutManager.mo4363e(i);
        }
    }

    /* renamed from: d */
    public final View mo114340d(int i) {
        RecyclerView.AbstractC1362i layoutManager;
        RecyclerView recyclerView = this.f161492d;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return null;
        }
        return layoutManager.mo4358c(i);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f161505q = true;
        if (this.f161506r && !this.f161507s) {
            mo114338c();
        }
    }

    /* renamed from: c */
    public final int mo114337c(MvImageChooseAdapter.MyMediaModel myMediaModel) {
        MvImageChooseAdapter mvImageChooseAdapter = this.f161491c;
        if (mvImageChooseAdapter != null) {
            for (int i = 0; i < mvImageChooseAdapter.f161446m.size(); i++) {
                if (TextUtils.equals(mvImageChooseAdapter.f161446m.get(i).f134661a, myMediaModel.f134661a)) {
                    return i;
                }
            }
        }
        return -1;
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        this.f161506r = z;
        if (this.f161505q && !this.f161507s) {
            mo114338c();
        }
        if (this.f161507s) {
            MvImageChooseAdapter mvImageChooseAdapter = this.f161491c;
            boolean z2 = !z;
            mvImageChooseAdapter.f161451r = true;
            if (C65422de.m117141a()) {
                for (int i = 0; i < mvImageChooseAdapter.f161445l.getChildCount(); i++) {
                    MvImageChooseAdapter.C72050e eVar = (MvImageChooseAdapter.C72050e) mvImageChooseAdapter.f161445l.mo4393a(mvImageChooseAdapter.f161445l.getChildAt(i));
                    if (!mvImageChooseAdapter.f161449p.contains(eVar)) {
                        if (z2) {
                            eVar.f161475a.setController((AbstractC24255a) null);
                        } else {
                            mvImageChooseAdapter.mo114277a(eVar, -1);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo114336b(MvImageChooseAdapter.MyMediaModel myMediaModel) {
        MvImageChooseAdapter mvImageChooseAdapter = this.f161491c;
        if (mvImageChooseAdapter == null) {
            return;
        }
        if (myMediaModel.f161471v >= 0) {
            C84911q.m145928d("MvImageChooseAdapter handleMediaSelected unSelect originIndex " + myMediaModel.f161470u + " selectIndex " + myMediaModel.f161471v + " stack " + C73986be.m130119a());
            int i = myMediaModel.f161471v;
            int i2 = -1;
            myMediaModel.f161471v = -1;
            for (int i3 = 0; i3 < mvImageChooseAdapter.f161437d.size(); i3++) {
                MvImageChooseAdapter.MyMediaModel myMediaModel2 = mvImageChooseAdapter.f161437d.get(i3);
                if (TextUtils.equals(myMediaModel2.f134661a, myMediaModel.f134661a)) {
                    i2 = i3;
                }
                if (myMediaModel2.f161471v > i) {
                    myMediaModel2.f161471v--;
                }
            }
            if (i2 >= 0) {
                mvImageChooseAdapter.f161437d.remove(i2);
            }
            mvImageChooseAdapter.notifyItemChanged(myMediaModel.f161470u);
            mvImageChooseAdapter.mo114284e();
            if (mvImageChooseAdapter.f161440g != null) {
                mvImageChooseAdapter.f161440g.mo114290a(mvImageChooseAdapter.f161437d, MvImageChooseAdapter.EnumC72047b.PREVIEW, myMediaModel);
                mvImageChooseAdapter.f161440g.mo114286a(myMediaModel, false);
                return;
            }
            return;
        }
        C84911q.m145928d("MvImageChooseAdapter handleMediaSelected select originIndex " + myMediaModel.f161470u + " selectIndex " + myMediaModel.f161471v);
        C84902i.m145889a(myMediaModel.f134662b, new C72173bh(mvImageChooseAdapter, myMediaModel));
    }

    @Override // com.p2082ss.android.ugc.aweme.p3290j.C56815c, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        this.f161501m = Long.valueOf(System.currentTimeMillis());
        super.onViewCreated(view, bundle);
    }

    /* renamed from: a */
    public final void mo114330a(MvImageChooseAdapter.MyMediaModel myMediaModel, boolean z) {
        MvImageChooseAdapter mvImageChooseAdapter = this.f161491c;
        if (mvImageChooseAdapter == null) {
            return;
        }
        if (!z) {
            mvImageChooseAdapter.mo114276a(myMediaModel);
        } else if (myMediaModel != null) {
            if (!mvImageChooseAdapter.f161437d.contains(myMediaModel)) {
                mvImageChooseAdapter.f161437d.add(myMediaModel);
            }
            mvImageChooseAdapter.mo114284e();
        }
    }
}
