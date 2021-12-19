package com.p2082ss.android.ugc.aweme.i18n.musically.cut;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.core.content.C0643b;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.C13617h;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.widget.DmtLoadingLayout;
import com.p2082ss.android.ugc.aweme.i18n.musically.cut.C53497n;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.C59187c;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.p2082ss.android.ugc.aweme.p2730de.C40984s;
import com.p2082ss.android.ugc.aweme.p3290j.C56815c;
import com.p2082ss.android.ugc.aweme.property.C65348ar;
import com.p2082ss.android.ugc.aweme.services.videochoose.IVideoChoose;
import com.p2082ss.android.ugc.aweme.shortvideo.C70637di;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MultiSelectView;
import com.p2082ss.android.ugc.aweme.widgetcompat.C81637b;
import com.p2082ss.android.ugc.aweme.widgetcompat.WrapGridLayoutManager;
import com.p2082ss.android.ugc.tools.utils.C84896h;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.i18n.musically.cut.t */
public final class C53506t extends C56815c implements IVideoChoose {

    /* renamed from: b */
    protected TextView f122833b;

    /* renamed from: c */
    protected DmtLoadingLayout f122834c;

    /* renamed from: d */
    protected RecyclerView f122835d;

    /* renamed from: e */
    protected C53497n f122836e;

    /* renamed from: f */
    protected C59187c f122837f;

    /* renamed from: g */
    public long f122838g = C70637di.m124840a();

    /* renamed from: h */
    protected C53497n.AbstractC53499a f122839h;

    /* renamed from: i */
    public IVideoChoose.Callback f122840i;

    /* renamed from: j */
    private MultiSelectView f122841j;

    /* renamed from: k */
    private boolean f122842k;

    /* renamed from: l */
    private C53492m f122843l;

    /* renamed from: m */
    private int f122844m;

    /* renamed from: n */
    private int f122845n;

    /* renamed from: o */
    private int f122846o;

    /* renamed from: p */
    private boolean f122847p = false;

    /* renamed from: q */
    private C59187c.AbstractC59188a f122848q = new C59187c.AbstractC59188a() {
        /* class com.p2082ss.android.ugc.aweme.i18n.musically.cut.C53506t.C535071 */

        static {
            Covode.recordClassIndex(63080);
        }

        @Override // com.p2082ss.android.ugc.aweme.mediachoose.helper.C59187c.AbstractC59188a
        /* renamed from: a */
        public final void mo90097a(boolean z) {
            if (C53506t.this.f129386a) {
                C53506t.this.f122834c.setVisibility(8);
                if (z) {
                    C53506t.this.mo90094c();
                }
            }
        }
    };

    static {
        Covode.recordClassIndex(63079);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.videochoose.IVideoChoose
    public final Fragment fragment() {
        return this;
    }

    /* renamed from: b */
    public final void mo90093b() {
        C53492m mVar = this.f122843l;
        if (mVar != null) {
            mVar.notifyDataSetChanged();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.videochoose.IVideoChoose
    public final void loadData() {
        if (!this.f122847p) {
            mo90094c();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        C59187c cVar = this.f122837f;
        cVar.f134698f.add(this.f122848q);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        C59187c cVar = this.f122837f;
        cVar.f134698f.remove(this.f122848q);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo90094c() {
        final ArrayList arrayList = new ArrayList();
        C59187c cVar = this.f122837f;
        if (cVar != null) {
            this.f122847p = true;
            List<MediaModel> a = m98722a(cVar.mo96690a());
            if (!a.isEmpty()) {
                this.f122834c.setVisibility(0);
            }
            final List<MediaModel> c = this.f122837f.mo96694c();
            arrayList.addAll(a);
            final ArrayList arrayList2 = new ArrayList();
            C40984s.m82526b(new Runnable() {
                /* class com.p2082ss.android.ugc.aweme.i18n.musically.cut.C53506t.RunnableC535082 */

                static {
                    Covode.recordClassIndex(63081);
                }

                public final void run() {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        MediaModel mediaModel = (MediaModel) it.next();
                        String str = mediaModel.f134662b;
                        if (!TextUtils.isEmpty(str)) {
                            C84896h.m145875h(str);
                            String h = C84896h.m145875h(str);
                            if (h == null) {
                                h = "";
                            }
                            if (!str.contains("amweme/") && !str.contains("hotsoon/") && h.endsWith("mp4")) {
                                arrayList2.add(mediaModel);
                            }
                        }
                    }
                    C40984s.m82525a(new Runnable() {
                        /* class com.p2082ss.android.ugc.aweme.i18n.musically.cut.C53506t.RunnableC535082.RunnableC535091 */

                        static {
                            Covode.recordClassIndex(63082);
                        }

                        public final void run() {
                            try {
                                C53497n nVar = C53506t.this.f122836e;
                                ArrayList arrayList = arrayList2;
                                nVar.f122795b.clear();
                                nVar.f122795b.addAll(arrayList);
                                nVar.mo90084a(nVar.f122795b.size());
                                nVar.f122804k.mo90093b();
                                C53506t.this.f122835d.setAdapter(C53506t.this.f122836e);
                                C53506t.this.f122836e.f122799f = C53506t.this.f122839h;
                                C53506t.this.f122834c.setVisibility(8);
                                if (arrayList2.size() == 0) {
                                    C53506t.this.f122833b.setText(C53506t.this.getResources().getString(R.string.dgm));
                                } else {
                                    C53506t.this.f122833b.setText((CharSequence) null);
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    });
                }
            });
        }
    }

    /* renamed from: a */
    private static List<MediaModel> m98722a(List<MediaModel> list) {
        ArrayList arrayList = new ArrayList();
        for (MediaModel mediaModel : list) {
            if (mediaModel.f134668h > 3000) {
                arrayList.add(mediaModel);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo90092a(boolean z) {
        this.f122836e.f122798e = z;
        C53497n nVar = this.f122836e;
        nVar.mo90084a(nVar.f122795b.size());
        nVar.f122804k.mo90093b();
        if (!C13617h.m24465a(nVar.f122803j)) {
            nVar.f122803j.clear();
        }
        this.f122843l.notifyDataSetChanged();
    }

    @Override // com.p2082ss.android.ugc.aweme.p3290j.C56815c, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f122844m = getArguments().getInt("ARG_NUM_COLUMNS", 4);
        this.f122845n = getArguments().getInt("ARG_TEXT_COLOR", C0643b.m2378c(getContext(), R.color.a_));
        this.f122846o = getArguments().getInt("ARG_SHADOW_COLOR", C0643b.m2378c(getContext(), R.color.a3));
        this.f122842k = getArguments().getBoolean("ARG_MULTI_VIDEO_ENABLE", true);
        this.f122839h = new C53510u(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        MethodCollector.m26663i(11200);
        super.onActivityCreated(bundle);
        if (this.f122837f == null && getActivity() != null) {
            Context applicationContext = getActivity().getApplicationContext();
            if (C58003a.f132201c && applicationContext == null) {
                applicationContext = C58003a.f132199a;
            }
            C59187c.m108691a(applicationContext, C65348ar.m117034a());
            this.f122837f = C59187c.f134693a;
        }
        if (C13617h.m24465a(this.f122837f.mo96690a())) {
            this.f122834c.setVisibility(0);
            this.f122837f.mo96691a(4, -1, -1, null);
        }
        if (this.f122836e == null) {
            this.f122836e = new C53497n(getActivity(), this, this.f122844m);
            C53492m mVar = new C53492m(this.f122836e);
            this.f122843l = mVar;
            ActivityC0945e activity = getActivity();
            C89219l.m154721d(activity, "");
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, (int) C13628n.m24520b(activity, 96.0f));
            View view = new View(activity);
            view.setLayoutParams(layoutParams);
            view.setBackgroundColor(0);
            mVar.mo90081a(view);
        }
        this.f122836e.f122801h = this.f122846o;
        this.f122836e.f122800g = this.f122845n;
        this.f122836e.f122802i = false;
        this.f122841j.setOnModeChangeListener(new C53511v(this));
        loadData();
        this.f122841j.setVisibility(8);
        this.f122835d.setPadding(0, 0, 0, 0);
        MethodCollector.m26664o(11200);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3290j.C56815c, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        MethodCollector.m26663i(11050);
        View inflate = layoutInflater.inflate(R.layout.bhj, (ViewGroup) null);
        ((ViewStub) inflate.findViewById(R.id.fg9)).inflate();
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.bbx);
        this.f122835d = recyclerView;
        recyclerView.setLayoutManager(new WrapGridLayoutManager(null, this.f122844m));
        this.f122835d.mo4402a(new C81637b(this.f122844m, (int) C13628n.m24520b(getContext(), 1.0f)));
        this.f122833b = (TextView) inflate.findViewById(R.id.ewz);
        this.f122834c = (DmtLoadingLayout) inflate.findViewById(R.id.fd1);
        MultiSelectView multiSelectView = (MultiSelectView) inflate.findViewById(R.id.cms);
        this.f122841j = multiSelectView;
        if (this.f122842k) {
            i = 0;
        } else {
            i = 8;
        }
        multiSelectView.setVisibility(i);
        MethodCollector.m26664o(11050);
        return inflate;
    }
}
