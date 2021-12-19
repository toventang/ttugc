package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0945e;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.widget.DmtLoadingLayout;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.mediachoose.AbstractC59180g;
import com.p2082ss.android.ugc.aweme.mediachoose.C59164c;
import com.p2082ss.android.ugc.aweme.mediachoose.C59179f;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.p2082ss.android.ugc.aweme.p2730de.C40982q;
import com.p2082ss.android.ugc.aweme.shortvideo.C69840ar;
import com.p2082ss.android.ugc.aweme.shortvideo.C70637di;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AbstractC72055ac;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MediaRecycledViewPoolViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MultiSelectView;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.lazy.AbstractC72358a;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.C72440e;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73975b;
import com.p2082ss.android.ugc.aweme.shortvideo.util.performance.OpenAlbumPanelPerformanceMonitor;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80322d;
import com.p2082ss.android.ugc.aweme.widgetcompat.C81637b;
import com.p2082ss.android.ugc.aweme.widgetcompat.WrapGridLayoutManager;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.l */
public final class C72223l extends AbstractC72051a implements AbstractC72358a.AbstractC72359a {

    /* renamed from: v */
    public static final C72224a f161907v = new C72224a((byte) 0);

    /* renamed from: q */
    public MultiSelectView f161908q;

    /* renamed from: r */
    public MvImageChooseAdapter.AbstractC72048c f161909r;

    /* renamed from: s */
    public boolean f161910s = true;

    /* renamed from: t */
    public boolean f161911t;

    /* renamed from: u */
    public long f161912u = C70637di.m124840a();

    /* renamed from: w */
    private TextView f161913w;

    /* renamed from: x */
    private MvChoosePhotoActivity.AbstractC72041b f161914x;

    /* renamed from: y */
    private final AbstractC89244h f161915y = C89250i.m154773a((AbstractC89171a) new C72232h(this));

    /* renamed from: z */
    private HashMap f161916z;

    static {
        Covode.recordClassIndex(84888);
    }

    /* renamed from: h */
    private final AbstractC59180g m127417h() {
        return (AbstractC59180g) this.f161915y.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.p3290j.C56814b, com.p2082ss.android.ugc.aweme.p3290j.C56815c
    /* renamed from: a */
    public final View mo93985a(int i) {
        if (this.f161916z == null) {
            this.f161916z = new HashMap();
        }
        View view = (View) this.f161916z.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f161916z.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3290j.C56814b, com.p2082ss.android.ugc.aweme.p3290j.C56815c
    /* renamed from: a */
    public final void mo93986a() {
        HashMap hashMap = this.f161916z;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3290j.C56814b, com.p2082ss.android.ugc.aweme.p3290j.C56815c, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo93986a();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.l$a */
    public static final class C72224a {
        static {
            Covode.recordClassIndex(84889);
        }

        private C72224a() {
        }

        public /* synthetic */ C72224a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AbstractC72051a
    /* renamed from: c */
    public final void mo114338c() {
        super.mo114338c();
        C72216f.m127415a(this, AbstractC72055ac.C72058c.f161512a);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.l$g */
    static final class C72231g extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C72223l f161930a;

        /* renamed from: b */
        final /* synthetic */ MediaModel f161931b;

        /* renamed from: c */
        final /* synthetic */ View f161932c;

        static {
            Covode.recordClassIndex(84896);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72231g(C72223l lVar, MediaModel mediaModel, View view) {
            super(0);
            this.f161930a = lVar;
            this.f161931b = mediaModel;
            this.f161932c = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            MvImageChooseAdapter.AbstractC72048c cVar = this.f161930a.f161909r;
            if (cVar != null) {
                MediaModel mediaModel = this.f161931b;
                if (mediaModel instanceof MvImageChooseAdapter.MyMediaModel) {
                    cVar.mo114289a((MvImageChooseAdapter.MyMediaModel) mediaModel, this.f161932c);
                    this.f161930a.f161911t = false;
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.l$h */
    static final class C72232h extends AbstractC89220m implements AbstractC89171a<C59164c> {

        /* renamed from: a */
        final /* synthetic */ C72223l f161933a;

        static {
            Covode.recordClassIndex(84897);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72232h(C72223l lVar) {
            super(0);
            this.f161933a = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C59164c invoke() {
            ActivityC0945e activity = this.f161933a.getActivity();
            if (activity == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(activity, "");
            return new C59164c(activity);
        }
    }

    /* renamed from: i */
    private final boolean m127418i() {
        Bundle arguments = getArguments();
        if ((arguments == null || !arguments.getBoolean("forbid_init_multi_mode", false)) && ((this.f161910s && C72440e.m127818c()) || C72440e.m127814a(this.f161503o))) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.l$d */
    public static final class C72227d implements MultiSelectView.AbstractC72036a {

        /* renamed from: a */
        final /* synthetic */ C72223l f161924a;

        static {
            Covode.recordClassIndex(84892);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C72227d(C72223l lVar) {
            this.f161924a = lVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MultiSelectView.AbstractC72036a
        /* renamed from: a */
        public final void mo90100a(boolean z) {
            MvImageChooseAdapter mvImageChooseAdapter = this.f161924a.f161491c;
            C89219l.m154716b(mvImageChooseAdapter, "");
            mvImageChooseAdapter.mo114279a(z);
            if (z) {
                this.f161924a.mo114439b(true);
            } else {
                this.f161924a.mo114439b(false);
            }
        }
    }

    /* renamed from: a */
    public final void mo114437a(MvChoosePhotoActivity.AbstractC72041b bVar) {
        C89219l.m154721d(bVar, "");
        this.f161914x = bVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.l$f */
    public static final class C72230f extends GridLayoutManager.AbstractC1337c {

        /* renamed from: e */
        final /* synthetic */ C72223l f161928e;

        /* renamed from: f */
        final /* synthetic */ WrapGridLayoutManager f161929f;

        static {
            Covode.recordClassIndex(84895);
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC1337c
        /* renamed from: a */
        public final int mo4342a(int i) {
            if (this.f161928e.f161491c.getItemViewType(i) == 1) {
                return ((GridLayoutManager) this.f161929f).f4316b;
            }
            return 1;
        }

        C72230f(C72223l lVar, WrapGridLayoutManager wrapGridLayoutManager) {
            this.f161928e = lVar;
            this.f161929f = wrapGridLayoutManager;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AbstractC72051a
    /* renamed from: a */
    public final void mo114333a(boolean z) {
        String str;
        this.f161910s = z;
        MvImageChooseAdapter mvImageChooseAdapter = this.f161491c;
        if (mvImageChooseAdapter != null) {
            mvImageChooseAdapter.mo114279a(z);
        }
        this.f161498j = z;
        if (getActivity() != null) {
            AbstractC59180g h = m127417h();
            if (z) {
                str = "enter_from_multi";
            } else {
                str = "enter_from_single";
            }
            h.mo96650a(str);
        }
    }

    /* renamed from: b */
    public final void mo114439b(boolean z) {
        String str;
        AbstractC59180g h = m127417h();
        if (z) {
            str = "enter_from_multi";
        } else {
            str = "enter_from_single";
        }
        h.mo96650a(str);
        MvChoosePhotoActivity.AbstractC72041b bVar = this.f161914x;
        if (bVar != null) {
            bVar.mo114271a(z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.l$b */
    public static final class C72225b extends AbstractC89220m implements AbstractC89172b<C59179f, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C72223l f161917a;

        /* renamed from: b */
        final /* synthetic */ MediaModel f161918b;

        /* renamed from: c */
        final /* synthetic */ String f161919c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89171a f161920d;

        static {
            Covode.recordClassIndex(84890);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72225b(C72223l lVar, MediaModel mediaModel, String str, AbstractC89171a aVar) {
            super(1);
            this.f161917a = lVar;
            this.f161918b = mediaModel;
            this.f161919c = str;
            this.f161920d = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C59179f fVar) {
            C59179f fVar2 = fVar;
            C89219l.m154721d(fVar2, "");
            C72216f.m127414a(fVar2);
            C40982q.m82520a("aweme_movie_import_error_rate", 0, (JSONObject) null);
            C72223l.m127416a(this.f161918b, fVar2.f134656b, 0, 0, fVar2.f134657c, this.f161919c);
            if (this.f161917a.getActivity() == null || !this.f161917a.f129386a) {
                this.f161917a.f161911t = false;
            } else {
                this.f161920d.invoke();
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.l$c */
    public static final class C72226c extends AbstractC89220m implements AbstractC89172b<C59179f, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C72223l f161921a;

        /* renamed from: b */
        final /* synthetic */ MediaModel f161922b;

        /* renamed from: c */
        final /* synthetic */ String f161923c;

        static {
            Covode.recordClassIndex(84891);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72226c(C72223l lVar, MediaModel mediaModel, String str) {
            super(1);
            this.f161921a = lVar;
            this.f161922b = mediaModel;
            this.f161923c = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C59179f fVar) {
            C59179f fVar2 = fVar;
            C89219l.m154721d(fVar2, "");
            C72216f.m127414a(fVar2);
            this.f161921a.f161911t = false;
            C72223l lVar = this.f161921a;
            MediaModel mediaModel = this.f161922b;
            String str = fVar2.f134656b;
            int i = fVar2.f134659e;
            long j = fVar2.f134657c;
            String str2 = this.f161923c;
            String str3 = fVar2.f134660f;
            if (lVar.getActivity() != null && lVar.f129386a) {
                C72053aa.m127203a(lVar.getActivity(), i, (int) lVar.f161912u);
                C40982q.m82520a("aweme_movie_import_error_rate", 1, new C69840ar().mo110189a("errorCode", String.valueOf(i)).mo110189a("errorMsg", str3).mo110191a());
                C72223l.m127416a(mediaModel, str, 1, i, j, str2);
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AbstractC72051a, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f161491c = new MvImageChooseAdapter(getContext(), this.f161490b, 1, this.f161502n);
        this.f161491c.f161447n = this.f161503o;
        MvImageChooseAdapter mvImageChooseAdapter = this.f161491c;
        C89219l.m154716b(mvImageChooseAdapter, "");
        mvImageChooseAdapter.mo114279a(this.f161498j);
        this.f161491c.f161442i = true;
        this.f161491c.f161440g = this.f161909r;
        this.f161491c.f161439f = new C72228e(this);
        WrapGridLayoutManager wrapGridLayoutManager = new WrapGridLayoutManager(null, this.f161490b);
        wrapGridLayoutManager.mo4320a(new C72230f(this, wrapGridLayoutManager));
        this.f161492d.setHasFixedSize(true);
        this.f161492d.setItemViewCacheSize(this.f161490b);
        RecyclerView recyclerView = this.f161492d;
        C89219l.m154716b(recyclerView, "");
        recyclerView.setLayoutManager(wrapGridLayoutManager);
        this.f161492d.mo4402a(new C81637b(this.f161490b, (int) C13628n.m24520b(getContext(), 1.0f)));
        this.f161491c.f161445l = this.f161492d;
        RecyclerView recyclerView2 = this.f161492d;
        C89219l.m154716b(recyclerView2, "");
        recyclerView2.setAdapter(this.f161491c);
        this.f161491c.f161434a = this.f161497i;
        this.f161491c.f161435b = mo114344g();
        DmtLoadingLayout dmtLoadingLayout = this.f161496h;
        C89219l.m154716b(dmtLoadingLayout, "");
        dmtLoadingLayout.setVisibility(0);
        if (this.f161498j) {
            this.f161491c.mo114282c(this.f161500l);
        }
        if (m127418i()) {
            MvImageChooseAdapter mvImageChooseAdapter2 = this.f161491c;
            C89219l.m154716b(mvImageChooseAdapter2, "");
            mvImageChooseAdapter2.mo114279a(true);
            if (this.f161908q != null) {
                MultiSelectView multiSelectView = this.f161908q;
                if (multiSelectView == null) {
                    C89219l.m154710a("multiSelectView");
                }
                multiSelectView.setVisibility(8);
            }
            m127417h().mo96650a("enter_from_multi");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.l$e */
    static final class C72228e implements MvImageChooseAdapter.AbstractC72049d {

        /* renamed from: a */
        final /* synthetic */ C72223l f161925a;

        static {
            Covode.recordClassIndex(84893);
        }

        C72228e(C72223l lVar) {
            this.f161925a = lVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.AbstractC72049d
        /* renamed from: a */
        public final void mo114294a(View view, final MediaModel mediaModel) {
            String str;
            Resources resources;
            if (mediaModel != null) {
                MvImageChooseAdapter.AbstractC72048c cVar = this.f161925a.f161909r;
                if (cVar != null) {
                    cVar.mo114287a();
                }
                MvImageChooseAdapter mvImageChooseAdapter = this.f161925a.f161491c;
                C89219l.m154716b(mvImageChooseAdapter, "");
                if (mvImageChooseAdapter.f161441h) {
                    C72223l lVar = this.f161925a;
                    if (view != null && !lVar.f161911t) {
                        lVar.f161911t = true;
                        lVar.mo114438a(true, mediaModel, new C72231g(lVar, mediaModel, view));
                    }
                } else if (!C84902i.m145892a(mediaModel.f134662b)) {
                    C79459a aVar = new C79459a(this.f161925a.getActivity());
                    ActivityC0945e activity = this.f161925a.getActivity();
                    if (activity == null || (resources = activity.getResources()) == null) {
                        str = null;
                    } else {
                        str = resources.getString(R.string.cc7);
                    }
                    aVar.mo123052a(str).mo123053a();
                } else {
                    this.f161925a.mo114438a(false, mediaModel, new AbstractC89171a<C89391z>(this) {
                        /* class com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C72223l.C72228e.C722291 */

                        /* renamed from: a */
                        final /* synthetic */ C72228e f161926a;

                        static {
                            Covode.recordClassIndex(84894);
                        }

                        {
                            this.f161926a = r2;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        @Override // p4600h.p4611f.p4612a.AbstractC89171a
                        public final /* synthetic */ C89391z invoke() {
                            MvImageChooseAdapter.AbstractC72048c cVar = this.f161926a.f161925a.f161909r;
                            if (cVar != null) {
                                cVar.mo114288a(mediaModel);
                            }
                            return C89391z.f203057a;
                        }
                    });
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AbstractC72051a
    /* renamed from: a */
    public final void mo114332a(List<? extends MvImageChooseAdapter.MyMediaModel> list, boolean z) {
        if (list != null) {
            DmtLoadingLayout dmtLoadingLayout = this.f161496h;
            C89219l.m154716b(dmtLoadingLayout, "");
            dmtLoadingLayout.setVisibility(8);
            if (list.isEmpty()) {
                TextView textView = this.f161913w;
                if (textView == null) {
                    C89219l.m154710a("noVideoHintTextView");
                }
                textView.setVisibility(0);
                TextView textView2 = this.f161913w;
                if (textView2 == null) {
                    C89219l.m154710a("noVideoHintTextView");
                }
                textView2.setText(R.string.aip);
                if (this.f161502n) {
                    C73975b.C73976a.f166071a.end(OpenAlbumPanelPerformanceMonitor.f166158a, "imageLoaded");
                    this.f161502n = false;
                }
            } else {
                TextView textView3 = this.f161913w;
                if (textView3 == null) {
                    C89219l.m154710a("noVideoHintTextView");
                }
                textView3.setVisibility(8);
            }
            if (z) {
                this.f161491c.mo114278a((List<MvImageChooseAdapter.MyMediaModel>) list);
            } else {
                this.f161491c.mo114280b((List<MvImageChooseAdapter.MyMediaModel>) list);
            }
            C84425b bVar = new C84425b();
            long currentTimeMillis = System.currentTimeMillis();
            Long l = this.f161501m;
            C89219l.m154716b(l, "");
            C80322d.m139251a("tool_performance_fetch_album_assets", bVar.mo129404a("duration", currentTimeMillis - l.longValue()).mo129403a(StringSet.type, 1).mo129403a("count", list.size()).f188764a);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        char c;
        MethodCollector.m26663i(9179);
        C89219l.m154721d(layoutInflater, "");
        int i = 0;
        this.f161494f = C1764a.m5927a(layoutInflater, R.layout.bhj, viewGroup, false);
        this.f161492d = (RecyclerView) this.f161494f.findViewById(R.id.bbx);
        this.f161492d.setRecycledViewPool(MediaRecycledViewPoolViewModel.C72033a.m127120a(getActivity()));
        View findViewById = this.f161494f.findViewById(R.id.ewz);
        C89219l.m154716b(findViewById, "");
        this.f161913w = (TextView) findViewById;
        this.f161496h = (DmtLoadingLayout) this.f161494f.findViewById(R.id.fd1);
        if (!this.f161910s || this.f161498j) {
            c = '\b';
        } else {
            c = 0;
        }
        if (!m127418i() && c == 0) {
            View findViewById2 = this.f161494f.findViewById(R.id.fg9);
            if (findViewById2 != null) {
                ((ViewStub) findViewById2).inflate();
                View findViewById3 = this.f161494f.findViewById(R.id.cms);
                C89219l.m154716b(findViewById3, "");
                MultiSelectView multiSelectView = (MultiSelectView) findViewById3;
                this.f161908q = multiSelectView;
                if (multiSelectView == null) {
                    C89219l.m154710a("multiSelectView");
                }
                if (!this.f161910s || this.f161498j) {
                    i = 8;
                }
                multiSelectView.setVisibility(i);
                MultiSelectView multiSelectView2 = this.f161908q;
                if (multiSelectView2 == null) {
                    C89219l.m154710a("multiSelectView");
                }
                multiSelectView2.setOnModeChangeListener(new C72227d(this));
            } else {
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.ViewStub");
                MethodCollector.m26664o(9179);
                throw nullPointerException;
            }
        }
        if (this.f161492d instanceof FastScrollRecyclerView) {
            RecyclerView recyclerView = this.f161492d;
            if (recyclerView != null) {
                ((FastScrollRecyclerView) recyclerView).setFastScrollEnabled(true);
                RecyclerView recyclerView2 = this.f161492d;
                if (recyclerView2 != null) {
                    ((FastScrollRecyclerView) recyclerView2).setFastScrollListener(this.f161504p);
                } else {
                    NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.FastScrollRecyclerView");
                    MethodCollector.m26664o(9179);
                    throw nullPointerException2;
                }
            } else {
                NullPointerException nullPointerException3 = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.FastScrollRecyclerView");
                MethodCollector.m26664o(9179);
                throw nullPointerException3;
            }
        }
        View view = this.f161494f;
        MethodCollector.m26664o(9179);
        return view;
    }

    /* renamed from: a */
    public final void mo114438a(boolean z, MediaModel mediaModel, AbstractC89171a<C89391z> aVar) {
        String str;
        long j;
        if (z) {
            str = "preview";
            j = 0;
        } else {
            str = "select";
            j = this.f161912u;
        }
        m127417h().mo96649a(mediaModel, j, -1, new C72225b(this, mediaModel, str, aVar), new C72226c(this, mediaModel, str));
    }

    /* renamed from: a */
    public static void m127416a(MediaModel mediaModel, String str, int i, int i2, long j, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", (int) j);
            C40982q.m82523a("aweme_video_import_duration", jSONObject, new C69840ar().mo110189a("status", String.valueOf(i)).mo110189a("scene_name", str2).mo110187a("errorCode", Integer.valueOf(i2)).mo110189a(StringSet.type, str).mo110187a("width", Integer.valueOf(mediaModel.f134672l)).mo110187a("height", Integer.valueOf(mediaModel.f134673m)).mo110191a());
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
