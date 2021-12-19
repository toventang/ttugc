package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0945e;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
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
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.lazy.AbstractC72358a;
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
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.e */
public final class C72208e extends AbstractC72051a implements AbstractC72358a.AbstractC72359a {

    /* renamed from: q */
    public boolean f161875q = true;

    /* renamed from: r */
    public MvImageChooseAdapter.AbstractC72048c f161876r;

    /* renamed from: s */
    public boolean f161877s;

    /* renamed from: t */
    public long f161878t = C70637di.m124840a();

    /* renamed from: u */
    private TextView f161879u;

    /* renamed from: v */
    private final AbstractC89244h f161880v = C89250i.m154773a((AbstractC89171a) new C72215f(this));

    /* renamed from: w */
    private HashMap f161881w;

    static {
        Covode.recordClassIndex(84873);
    }

    /* renamed from: h */
    private final AbstractC59180g m127404h() {
        return (AbstractC59180g) this.f161880v.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.p3290j.C56814b, com.p2082ss.android.ugc.aweme.p3290j.C56815c
    /* renamed from: a */
    public final View mo93985a(int i) {
        if (this.f161881w == null) {
            this.f161881w = new HashMap();
        }
        View view = (View) this.f161881w.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f161881w.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3290j.C56814b, com.p2082ss.android.ugc.aweme.p3290j.C56815c
    /* renamed from: a */
    public final void mo93986a() {
        HashMap hashMap = this.f161881w;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3290j.C56814b, com.p2082ss.android.ugc.aweme.p3290j.C56815c, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo93986a();
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AbstractC72051a
    /* renamed from: c */
    public final void mo114338c() {
        super.mo114338c();
        C72216f.m127415a(this, AbstractC72055ac.C72056a.f161510a);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.e$e */
    static final class C72214e extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C72208e f161894a;

        /* renamed from: b */
        final /* synthetic */ MediaModel f161895b;

        /* renamed from: c */
        final /* synthetic */ View f161896c;

        static {
            Covode.recordClassIndex(84879);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72214e(C72208e eVar, MediaModel mediaModel, View view) {
            super(0);
            this.f161894a = eVar;
            this.f161895b = mediaModel;
            this.f161896c = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            MvImageChooseAdapter.AbstractC72048c cVar = this.f161894a.f161876r;
            if (cVar != null) {
                MediaModel mediaModel = this.f161895b;
                if (mediaModel instanceof MvImageChooseAdapter.MyMediaModel) {
                    cVar.mo114289a((MvImageChooseAdapter.MyMediaModel) mediaModel, this.f161896c);
                    this.f161894a.f161877s = false;
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.e$f */
    static final class C72215f extends AbstractC89220m implements AbstractC89171a<C59164c> {

        /* renamed from: a */
        final /* synthetic */ C72208e f161897a;

        static {
            Covode.recordClassIndex(84880);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72215f(C72208e eVar) {
            super(0);
            this.f161897a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C59164c invoke() {
            ActivityC0945e activity = this.f161897a.getActivity();
            if (activity == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(activity, "");
            return new C59164c(activity);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.e$d */
    public static final class C72213d extends GridLayoutManager.AbstractC1337c {

        /* renamed from: e */
        final /* synthetic */ C72208e f161892e;

        /* renamed from: f */
        final /* synthetic */ WrapGridLayoutManager f161893f;

        static {
            Covode.recordClassIndex(84878);
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC1337c
        /* renamed from: a */
        public final int mo4342a(int i) {
            if (this.f161892e.f161491c.getItemViewType(i) == 1) {
                return ((GridLayoutManager) this.f161893f).f4316b;
            }
            return 1;
        }

        C72213d(C72208e eVar, WrapGridLayoutManager wrapGridLayoutManager) {
            this.f161892e = eVar;
            this.f161893f = wrapGridLayoutManager;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AbstractC72051a
    /* renamed from: a */
    public final void mo114333a(boolean z) {
        String str;
        this.f161875q = z;
        MvImageChooseAdapter mvImageChooseAdapter = this.f161491c;
        if (mvImageChooseAdapter != null) {
            mvImageChooseAdapter.mo114279a(z);
        }
        if (getActivity() != null) {
            AbstractC59180g h = m127404h();
            if (z) {
                str = "enter_from_multi";
            } else {
                str = "enter_from_single";
            }
            h.mo96650a(str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.e$a */
    public static final class C72209a extends AbstractC89220m implements AbstractC89172b<C59179f, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C72208e f161882a;

        /* renamed from: b */
        final /* synthetic */ MediaModel f161883b;

        /* renamed from: c */
        final /* synthetic */ String f161884c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89171a f161885d;

        static {
            Covode.recordClassIndex(84874);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72209a(C72208e eVar, MediaModel mediaModel, String str, AbstractC89171a aVar) {
            super(1);
            this.f161882a = eVar;
            this.f161883b = mediaModel;
            this.f161884c = str;
            this.f161885d = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C59179f fVar) {
            C59179f fVar2 = fVar;
            C89219l.m154721d(fVar2, "");
            C72216f.m127414a(fVar2);
            C40982q.m82520a("aweme_movie_import_error_rate", 0, (JSONObject) null);
            C72208e.m127403a(this.f161883b, fVar2.f134656b, 0, 0, fVar2.f134657c, this.f161884c);
            if (this.f161882a.getActivity() == null || !this.f161882a.f129386a) {
                this.f161882a.f161877s = false;
            } else {
                this.f161885d.invoke();
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.e$b */
    public static final class C72210b extends AbstractC89220m implements AbstractC89172b<C59179f, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C72208e f161886a;

        /* renamed from: b */
        final /* synthetic */ MediaModel f161887b;

        /* renamed from: c */
        final /* synthetic */ String f161888c;

        static {
            Covode.recordClassIndex(84875);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72210b(C72208e eVar, MediaModel mediaModel, String str) {
            super(1);
            this.f161886a = eVar;
            this.f161887b = mediaModel;
            this.f161888c = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C59179f fVar) {
            C59179f fVar2 = fVar;
            C89219l.m154721d(fVar2, "");
            C72216f.m127414a(fVar2);
            this.f161886a.f161877s = false;
            C72208e eVar = this.f161886a;
            MediaModel mediaModel = this.f161887b;
            String str = fVar2.f134656b;
            int i = fVar2.f134659e;
            long j = fVar2.f134657c;
            String str2 = this.f161888c;
            String str3 = fVar2.f134660f;
            if (eVar.getActivity() != null && eVar.f129386a) {
                C72053aa.m127203a(eVar.getActivity(), i, (int) eVar.f161878t);
                C40982q.m82520a("aweme_movie_import_error_rate", 1, new C69840ar().mo110189a("errorCode", String.valueOf(i)).mo110189a("errorMsg", str3).mo110191a());
                C72208e.m127403a(mediaModel, str, 1, i, j, str2);
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AbstractC72051a, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f161491c = new MvImageChooseAdapter(getContext(), this.f161490b, 3, this.f161502n);
        this.f161491c.f161447n = this.f161503o;
        MvImageChooseAdapter mvImageChooseAdapter = this.f161491c;
        C89219l.m154716b(mvImageChooseAdapter, "");
        mvImageChooseAdapter.mo114279a(this.f161875q);
        this.f161491c.f161442i = true;
        this.f161491c.f161440g = this.f161876r;
        this.f161491c.f161439f = new C72211c(this);
        WrapGridLayoutManager wrapGridLayoutManager = new WrapGridLayoutManager(getActivity(), this.f161490b);
        wrapGridLayoutManager.mo4320a(new C72213d(this, wrapGridLayoutManager));
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
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.e$c */
    static final class C72211c implements MvImageChooseAdapter.AbstractC72049d {

        /* renamed from: a */
        final /* synthetic */ C72208e f161889a;

        static {
            Covode.recordClassIndex(84876);
        }

        C72211c(C72208e eVar) {
            this.f161889a = eVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.AbstractC72049d
        /* renamed from: a */
        public final void mo114294a(View view, final MediaModel mediaModel) {
            String str;
            Resources resources;
            MvImageChooseAdapter.AbstractC72048c cVar = this.f161889a.f161876r;
            if (cVar != null) {
                cVar.mo114287a();
            }
            if (this.f161889a.f161875q) {
                C72208e eVar = this.f161889a;
                if (mediaModel != null && view != null) {
                    if (!mediaModel.mo96674b()) {
                        MvImageChooseAdapter.AbstractC72048c cVar2 = eVar.f161876r;
                        if (cVar2 != null && (mediaModel instanceof MvImageChooseAdapter.MyMediaModel)) {
                            cVar2.mo114289a((MvImageChooseAdapter.MyMediaModel) mediaModel, view);
                            eVar.f161877s = false;
                        }
                    } else if (!eVar.f161877s) {
                        eVar.f161877s = true;
                        eVar.mo114436a(true, mediaModel, new C72214e(eVar, mediaModel, view));
                    }
                }
            } else {
                C89219l.m154716b(mediaModel, "");
                if (mediaModel.mo96674b()) {
                    if (!C84902i.m145892a(mediaModel.f134662b)) {
                        C79459a aVar = new C79459a(this.f161889a.getActivity());
                        ActivityC0945e activity = this.f161889a.getActivity();
                        if (activity == null || (resources = activity.getResources()) == null) {
                            str = null;
                        } else {
                            str = resources.getString(R.string.cc7);
                        }
                        aVar.mo123052a(str).mo123053a();
                        return;
                    }
                    this.f161889a.mo114436a(false, mediaModel, new AbstractC89171a<C89391z>(this) {
                        /* class com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C72208e.C72211c.C722121 */

                        /* renamed from: a */
                        final /* synthetic */ C72211c f161890a;

                        static {
                            Covode.recordClassIndex(84877);
                        }

                        {
                            this.f161890a = r2;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        @Override // p4600h.p4611f.p4612a.AbstractC89171a
                        public final /* synthetic */ C89391z invoke() {
                            MvImageChooseAdapter.AbstractC72048c cVar = this.f161890a.f161889a.f161876r;
                            if (cVar != null) {
                                cVar.mo114288a(mediaModel);
                            }
                            return C89391z.f203057a;
                        }
                    });
                } else if (!C84902i.m145892a(mediaModel.f134662b)) {
                    C79459a aVar2 = new C79459a(this.f161889a.getContext());
                    Context context = this.f161889a.getContext();
                    if (context == null) {
                        C89219l.m154715b();
                    }
                    aVar2.mo123052a(context.getString(R.string.doo)).mo123053a();
                } else {
                    MvImageChooseAdapter.AbstractC72048c cVar3 = this.f161889a.f161876r;
                    if (cVar3 != null) {
                        cVar3.mo114288a(mediaModel);
                    }
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
                TextView textView = this.f161879u;
                if (textView == null) {
                    C89219l.m154710a("noVideoHintTextView");
                }
                textView.setVisibility(0);
                TextView textView2 = this.f161879u;
                if (textView2 == null) {
                    C89219l.m154710a("noVideoHintTextView");
                }
                textView2.setText(R.string.aio);
                if (this.f161502n) {
                    C73975b.C73976a.f166071a.end(OpenAlbumPanelPerformanceMonitor.f166158a, "imageLoaded");
                    this.f161502n = false;
                }
            } else {
                TextView textView3 = this.f161879u;
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
            C80322d.m139251a("tool_performance_fetch_album_assets", bVar.mo129404a("duration", currentTimeMillis - l.longValue()).mo129403a(StringSet.type, 0).mo129403a("count", list.size()).f188764a);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        this.f161494f = C1764a.m5927a(layoutInflater, R.layout.bhj, viewGroup, false);
        this.f161492d = (RecyclerView) this.f161494f.findViewById(R.id.bbx);
        this.f161492d.setRecycledViewPool(MediaRecycledViewPoolViewModel.C72033a.m127120a(getActivity()));
        View findViewById = this.f161494f.findViewById(R.id.ewz);
        C89219l.m154716b(findViewById, "");
        this.f161879u = (TextView) findViewById;
        this.f161496h = (DmtLoadingLayout) this.f161494f.findViewById(R.id.fd1);
        m127404h().mo96650a("enter_from_multi");
        if (this.f161492d instanceof FastScrollRecyclerView) {
            RecyclerView recyclerView = this.f161492d;
            Objects.requireNonNull(recyclerView, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.FastScrollRecyclerView");
            ((FastScrollRecyclerView) recyclerView).setFastScrollEnabled(true);
            RecyclerView recyclerView2 = this.f161492d;
            Objects.requireNonNull(recyclerView2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.FastScrollRecyclerView");
            ((FastScrollRecyclerView) recyclerView2).setFastScrollListener(this.f161504p);
        }
        return this.f161494f;
    }

    /* renamed from: a */
    public final void mo114436a(boolean z, MediaModel mediaModel, AbstractC89171a<C89391z> aVar) {
        String str;
        long j;
        if (z) {
            str = "preview";
            j = 0;
        } else {
            str = "select";
            j = this.f161878t;
        }
        m127404h().mo96649a(mediaModel, j, -1, new C72209a(this, mediaModel, str, aVar), new C72210b(this, mediaModel, str));
    }

    /* renamed from: a */
    public static void m127403a(MediaModel mediaModel, String str, int i, int i2, long j, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", (int) j);
            C40982q.m82523a("aweme_video_import_duration", jSONObject, new C69840ar().mo110189a("status", String.valueOf(i)).mo110189a("scene_name", str2).mo110187a("errorCode", Integer.valueOf(i2)).mo110189a(StringSet.type, str).mo110187a("width", Integer.valueOf(mediaModel.f134672l)).mo110187a("height", Integer.valueOf(mediaModel.f134673m)).mo110191a());
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
