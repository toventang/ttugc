package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.DmtLoadingLayout;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AbstractC72055ac;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MediaRecycledViewPoolViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.lazy.AbstractC72358a;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73975b;
import com.p2082ss.android.ugc.aweme.shortvideo.util.performance.OpenAlbumPanelPerformanceMonitor;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80322d;
import com.p2082ss.android.ugc.aweme.widgetcompat.C81637b;
import com.p2082ss.android.ugc.aweme.widgetcompat.WrapGridLayoutManager;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.al */
public final class C72080al extends AbstractC72051a implements AbstractC72358a.AbstractC72359a {

    /* renamed from: q */
    public String f161564q;

    /* renamed from: r */
    private TextView f161565r;

    /* renamed from: s */
    private boolean f161566s;

    static {
        Covode.recordClassIndex(84745);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AbstractC72051a
    /* renamed from: c */
    public final void mo114338c() {
        super.mo114338c();
        C72216f.m127415a(this, AbstractC72055ac.C72057b.f161511a);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AbstractC72051a
    /* renamed from: a */
    public final void mo114333a(boolean z) {
        mo114355b(z);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3290j.C56815c, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    /* renamed from: b */
    public final void mo114355b(boolean z) {
        this.f161566s = z;
        if (this.f161491c != null) {
            this.f161491c.mo114279a(z);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AbstractC72051a, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        String g = mo114344g();
        this.f161491c = new MvImageChooseAdapter(getContext(), this.f161490b, 2, this.f161502n);
        this.f161491c.f161447n = this.f161503o;
        this.f161491c.f161440g = this.f161493e;
        this.f161491c.mo114279a(this.f161566s);
        this.f161491c.f161439f = new C72082am(this);
        final WrapGridLayoutManager wrapGridLayoutManager = new WrapGridLayoutManager(null, this.f161490b);
        wrapGridLayoutManager.mo4320a(new GridLayoutManager.AbstractC1337c() {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C72080al.C720811 */

            static {
                Covode.recordClassIndex(84746);
            }

            @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC1337c
            /* renamed from: a */
            public final int mo4342a(int i) {
                if (C72080al.this.f161491c.getItemViewType(i) == 1) {
                    return ((GridLayoutManager) wrapGridLayoutManager).f4316b;
                }
                return 1;
            }
        });
        wrapGridLayoutManager.f4345u = this.f161490b;
        this.f161492d.setHasFixedSize(true);
        this.f161492d.setLayoutManager(wrapGridLayoutManager);
        this.f161492d.mo4402a(new C81637b(this.f161490b, (int) C13628n.m24520b(getContext(), 1.0f)));
        this.f161491c.f161445l = this.f161492d;
        this.f161492d.setAdapter(this.f161491c);
        if (this.f161498j) {
            this.f161491c.mo114282c(this.f161500l);
        }
        if (this.f161491c != null) {
            this.f161491c.f161434a = this.f161497i;
            this.f161491c.f161435b = g;
        }
        if (!TextUtils.isEmpty(this.f161564q)) {
            this.f161495g.setVisibility(0);
            this.f161495g.setText(this.f161564q);
        } else {
            this.f161495g.setVisibility(8);
        }
        this.f161496h.setVisibility(0);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AbstractC72051a
    /* renamed from: a */
    public final void mo114332a(List<MvImageChooseAdapter.MyMediaModel> list, boolean z) {
        if (list != null) {
            this.f161496h.setVisibility(8);
            if (list.isEmpty()) {
                this.f161565r.setVisibility(0);
                this.f161565r.setText(R.string.cfn);
                if (this.f161502n) {
                    C73975b.C73976a.f166071a.end(OpenAlbumPanelPerformanceMonitor.f166158a, "imageLoaded");
                    this.f161502n = false;
                }
            } else {
                this.f161565r.setVisibility(8);
            }
            if (z) {
                this.f161491c.mo114278a(list);
            } else {
                this.f161491c.mo114280b(list);
            }
            C80322d.m139251a("tool_performance_fetch_album_assets", new C84425b().mo129404a("duration", System.currentTimeMillis() - this.f161501m.longValue()).mo129403a(StringSet.type, 2).mo129403a("count", list.size()).f188764a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo114354a(View view, MediaModel mediaModel, Object obj) {
        if (obj == null || !((Boolean) obj).booleanValue()) {
            new C79459a(getContext()).mo123052a(getContext().getString(R.string.doo)).mo123053a();
            return;
        }
        this.f161493e.mo114287a();
        if (this.f161491c.f161441h) {
            if (this.f161493e != null && (mediaModel instanceof MvImageChooseAdapter.MyMediaModel)) {
                this.f161493e.mo114289a((MvImageChooseAdapter.MyMediaModel) mediaModel, view);
            }
        } else if (this.f161493e != null) {
            this.f161493e.mo114288a(mediaModel);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f161494f = C1764a.m5927a(layoutInflater, R.layout.a8q, viewGroup, false);
        this.f161492d = (RecyclerView) this.f161494f.findViewById(R.id.bl6);
        this.f161492d.setRecycledViewPool(MediaRecycledViewPoolViewModel.C72033a.m127120a(getActivity()));
        this.f161495g = (TextView) this.f161494f.findViewById(R.id.bf7);
        this.f161565r = (TextView) this.f161494f.findViewById(R.id.csu);
        this.f161496h = (DmtLoadingLayout) this.f161494f.findViewById(R.id.bl9);
        if (this.f161492d instanceof FastScrollRecyclerView) {
            ((FastScrollRecyclerView) this.f161492d).setFastScrollEnabled(true);
            ((FastScrollRecyclerView) this.f161492d).setFastScrollListener(this.f161504p);
        }
        return this.f161494f;
    }
}
