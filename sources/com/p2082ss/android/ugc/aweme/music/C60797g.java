package com.p2082ss.android.ugc.aweme.music;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.core.content.C0643b;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.base.p2372d.C34569a;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.common.AbstractC39085b;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c;
import com.p2082ss.android.ugc.aweme.common.p2633e.C39101b;
import com.p2082ss.android.ugc.aweme.favorites.p2924f.AbstractC47432f;
import com.p2082ss.android.ugc.aweme.favorites.p2924f.C47426a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.music.p3465b.C60732l;
import com.p2082ss.android.ugc.aweme.music.p3465b.RunnableC60735m;
import com.p2082ss.android.ugc.aweme.music.p3471f.C60793b;
import com.p2082ss.android.ugc.aweme.music.p3471f.C60796e;
import com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61180m;
import com.p2082ss.android.ugc.aweme.music.p3481ui.MusicDownloadPlayHelper;
import com.p2082ss.android.ugc.aweme.music.p3481ui.p3484c.C61154a;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC63985aq;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC63990as;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC64118co;
import com.p2082ss.android.ugc.aweme.services.AsyncAVService;
import com.p2082ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.RecordConfig;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.utils.C80330da;
import com.p2082ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: com.ss.android.ugc.aweme.music.g */
public class C60797g extends AbstractC64118co implements AbstractC1214u<C33942b>, AbstractC39063h.AbstractC39067a, AbstractC39102c<Music>, AbstractC47432f, AbstractC60708b, AbstractC61180m, AbstractC63990as, AbstractC63990as, AbstractC90252i, AbstractC90253j {

    /* renamed from: a */
    public RecyclerView f138156a;

    /* renamed from: b */
    DmtStatusView f138157b;

    /* renamed from: c */
    protected AbstractC63985aq.AbstractC63987b f138158c;

    /* renamed from: d */
    protected MusicDownloadPlayHelper f138159d;

    /* renamed from: e */
    public boolean f138160e = true;

    /* renamed from: j */
    public C39101b f138161j;

    /* renamed from: k */
    public String f138162k;

    /* renamed from: l */
    public String f138163l;

    /* renamed from: m */
    DataCenter f138164m;

    /* renamed from: n */
    protected ViewStub f138165n;

    /* renamed from: o */
    protected View f138166o;

    /* renamed from: p */
    protected boolean f138167p;

    /* renamed from: q */
    private String f138168q = "popular_song";

    /* renamed from: r */
    private C60732l f138169r;

    /* renamed from: s */
    private MusicModel f138170s;

    /* renamed from: t */
    private C47426a f138171t;

    /* renamed from: u */
    private int f138172u = 7;

    /* renamed from: v */
    private String f138173v = "";

    /* renamed from: w */
    private boolean f138174w = true;

    /* renamed from: y */
    private boolean f138175y;

    /* renamed from: z */
    private boolean f138176z = true;

    static {
        Covode.recordClassIndex(71354);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    /* renamed from: H */
    public final boolean mo61043H() {
        return true;
    }

    /* renamed from: a */
    public final void mo98202a(BaseResponse baseResponse) {
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61180m
    /* renamed from: a */
    public final void mo62876a(MusicModel musicModel, long j) {
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61180m
    /* renamed from: a */
    public final void mo62878a(MusicModel musicModel, Exception exc) {
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: a */
    public final void mo59511a(Exception exc) {
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    public final void bl_() {
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61180m
    /* renamed from: c */
    public final void mo62883c(MusicModel musicModel) {
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: c */
    public final void mo59523c(List<Music> list, boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC64118co
    /* renamed from: g */
    public final void mo65254g() {
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(34, new RunnableC90250g(C60797g.class, "onAntiCrawlerEvent", C34569a.class, ThreadMode.POSTING, 0, false));
        hashMap.put(65, new RunnableC90250g(C60797g.class, "onEvent", C60796e.class, ThreadMode.POSTING, 0, false));
        hashMap.put(188, new RunnableC90250g(C60797g.class, "onMusicCollect", C60793b.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h.AbstractC39067a
    /* renamed from: l */
    public final void mo62679l() {
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61180m
    /* renamed from: r */
    public final void mo62890r() {
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3569c.AbstractC63505a
    public final boolean ci_() {
        return this.f138174w;
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61180m
    /* renamed from: h */
    public final MusicModel mo62885h() {
        return this.f138170s;
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: a */
    public final void mo59512a(List<Music> list, boolean z) {
        if (af_()) {
            this.f138176z = false;
            m110355p();
            this.f138157b.mo27382d();
            this.f138169r.aq_();
            m110352a(list);
            this.f138169r.mo67829d(true);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC64118co
    /* renamed from: a */
    public final void mo65249a(String str, String str2) {
        this.f138162k = str;
        this.f138163l = str2;
    }

    /* renamed from: q */
    private void m110356q() {
        MusicDownloadPlayHelper musicDownloadPlayHelper = this.f138159d;
        if (musicDownloadPlayHelper != null) {
            musicDownloadPlayHelper.aw_();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.favorites.p2924f.AbstractC47432f
    /* renamed from: a */
    public final void mo79703a() {
        MusicDownloadPlayHelper musicDownloadPlayHelper = this.f138159d;
        if (musicDownloadPlayHelper != null) {
            musicDownloadPlayHelper.aw_();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61180m
    public final boolean bT_() {
        return af_();
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61180m
    /* renamed from: i */
    public final Activity mo62886i() {
        return getActivity();
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        m110356q();
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        m110355p();
    }

    /* renamed from: n */
    private static boolean m110353n() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    public final void aW_() {
        if (af_()) {
            this.f138169r.ao_();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout.C39211a.AbstractC39212a
    /* renamed from: m */
    public final View mo62680m() {
        if (!af_()) {
            return null;
        }
        return this.f138156a;
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f138159d.f138618n = false;
    }

    /* renamed from: o */
    private static boolean m110354o() {
        if (C58029j.f132256h && C58029j.m104846b() && !C58029j.m104847c()) {
            return C58029j.f132256h;
        }
        boolean n = m110353n();
        C58029j.f132256h = n;
        return n;
    }

    /* renamed from: p */
    private void m110355p() {
        C60732l lVar = this.f138169r;
        if (lVar != null) {
            lVar.mo63369e();
        }
        MusicDownloadPlayHelper musicDownloadPlayHelper = this.f138159d;
        if (musicDownloadPlayHelper != null) {
            musicDownloadPlayHelper.aw_();
            this.f138159d.f138618n = true;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: b */
    public final void mo59515b() {
        if (af_()) {
            this.f138166o.setVisibility(4);
            this.f138157b.mo27384f();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3569c.AbstractC63505a
    public final void bS_() {
        DmtStatusView dmtStatusView = this.f138157b;
        if (dmtStatusView == null || !this.f138167p) {
            mo98204c();
            return;
        }
        dmtStatusView.setVisibility(4);
        this.f138166o.setVisibility(0);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC63990as
    /* renamed from: k */
    public final boolean mo98052k() {
        if (!af_()) {
            return false;
        }
        if (this.f138156a.getChildCount() > 0) {
            this.f138156a.mo4413b(0);
        }
        mo98204c();
        return true;
    }

    /* renamed from: t */
    private TuxTextView m110357t() {
        TuxTextView tuxTextView = new TuxTextView(getContext());
        tuxTextView.setTuxFont(51);
        tuxTextView.setGravity(17);
        tuxTextView.setTextColor(C0643b.m2378c(getContext(), R.color.c4));
        return tuxTextView;
    }

    @Override // com.p2082ss.android.ugc.aweme.music.AbstractC60708b, com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: f */
    public final void mo59525f() {
        if (af_()) {
            this.f138166o.setVisibility(4);
            this.f138157b.mo27385g();
            AbstractC63985aq.AbstractC63987b bVar = this.f138158c;
            if (bVar != null && this.f138176z) {
                bVar.mo103569a();
            }
            this.f138176z = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo98204c() {
        if (af_() && getActivity() != null) {
            getActivity();
            if (!m110354o()) {
                new C23144b(this).mo37640e(R.string.dcq).mo37637b();
                this.f138157b.mo27387h();
                this.f138174w = true;
            } else if (this.f138161j != null && !TextUtils.isEmpty(this.f138162k)) {
                this.f138161j.mo57616a(1, this.f138162k, this.f138163l);
                this.f138174w = false;
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.music.AbstractC60708b
    /* renamed from: b */
    public final void mo98049b(String str) {
        this.f138173v = str;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC64118co
    /* renamed from: c_ */
    public final void mo98050c_(boolean z) {
        this.f138167p = z;
    }

    /* renamed from: e_ */
    public final void mo98205e_(Exception exc) {
        C51423a.m95790a((Throwable) exc);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @AbstractC90264r
    public void onEvent(C60796e eVar) {
        m110356q();
    }

    @Override // com.p2082ss.android.ugc.aweme.music.AbstractC60708b
    /* renamed from: a */
    public final void mo98047a(AbstractC63985aq.AbstractC63987b bVar) {
        this.f138158c = bVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: c */
    public final void mo59522c(Exception exc) {
        if (af_()) {
            this.f138169r.mo67824j();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (z) {
            m110355p();
        } else {
            this.f138159d.f138618n = false;
        }
    }

    @AbstractC90264r
    public void onAntiCrawlerEvent(C34569a aVar) {
        String str = aVar.f81610a;
        if (str != null && str.contains("/aweme/v1/original/music/list/?")) {
            EventBus.m156962a().mo145397d(aVar);
            mo98204c();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (z) {
            MusicDownloadPlayHelper musicDownloadPlayHelper = this.f138159d;
            if (musicDownloadPlayHelper != null) {
                musicDownloadPlayHelper.f138618n = false;
            }
            if (this.f138175y) {
                mo98052k();
                return;
            }
            return;
        }
        m110355p();
    }

    /* renamed from: a */
    private void m110352a(List<Music> list) {
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Music music : list) {
                if (music != null) {
                    arrayList.add(music.convertToMusicModel());
                }
            }
            this.f138156a.setVisibility(0);
            this.f138169r.mo98156a(arrayList);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: b */
    public final void mo59516b(Exception exc) {
        if (af_()) {
            this.f138174w = true;
            this.f138157b.mo27387h();
            this.f138176z = false;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.AbstractC1214u
    public /* synthetic */ void onChanged(C33942b bVar) {
        C33942b bVar2 = bVar;
        if (bVar2 != null) {
            String str = bVar2.f80277a;
            str.hashCode();
            if (str.equals("music_loading")) {
                C60732l lVar = this.f138169r;
                if (lVar instanceof C60732l) {
                    boolean booleanValue = ((Boolean) this.f138164m.mo60192a("music_loading")).booleanValue();
                    if (lVar.f138012b >= 0) {
                        lVar.f138013c.post(new RunnableC60735m(lVar, booleanValue));
                    }
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.favorites.p2924f.AbstractC47432f
    /* renamed from: a */
    public final void mo79704a(MusicModel musicModel) {
        if (musicModel != null) {
            Boolean bool = false;
            this.f138159d.f138618n = bool.booleanValue();
            this.f138164m.mo60191a("music_loading", (Object) true);
            this.f138170s = musicModel;
            if (this.f138160e) {
                this.f138159d.mo63041a(musicModel, this.f138172u, false);
            } else {
                this.f138159d.mo97994b(musicModel, this.f138172u, true);
            }
        }
    }

    @AbstractC90264r
    public void onMusicCollect(C60793b bVar) {
        if (bVar != null && bVar.f138151b != null) {
            if (1 == bVar.f138150a) {
                this.f138171t.mo57616a(1, bVar.f138151b.getMusicId(), 1);
            } else if (bVar.f138150a == 0) {
                this.f138171t.mo57616a(1, bVar.f138151b.getMusicId(), 0);
            }
        }
    }

    /* renamed from: a */
    public final void mo98203a(String str) {
        new C23144b(this).mo37635a(str).mo37637b();
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: b */
    public final void mo59517b(List<Music> list, boolean z) {
        if (af_()) {
            if (z) {
                this.f138169r.aq_();
            } else {
                this.f138169r.mo67814a("");
                this.f138169r.ap_();
            }
            if (!C16048b.m29633a().mo25421a(true, "share_useNotifySingle", false)) {
                m110352a(list);
            } else if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (Music music : list) {
                    if (music != null) {
                        arrayList.add(music.convertToMusicModel());
                    }
                }
                this.f138156a.setVisibility(0);
                C60732l lVar = this.f138169r;
                lVar.f138014d.clear();
                lVar.f138014d.addAll(arrayList);
                if (lVar.f92274v) {
                    lVar.notifyItemRangeChanged(lVar.f138016f - 1, lVar.getItemCount() - lVar.f138016f);
                    lVar.notifyItemChanged(lVar.getItemCount() - 1);
                    return;
                }
                lVar.notifyItemRangeChanged(lVar.f138016f, lVar.getItemCount() - lVar.f138016f);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        TuxTextView tuxTextView;
        String string;
        String string2;
        this.f138156a = (RecyclerView) view.findViewById(R.id.doq);
        this.f138157b = (DmtStatusView) view.findViewById(R.id.e7i);
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        this.f138162k = arguments.getString("user_id");
        this.f138163l = arguments.getString("sec_user_id");
        this.f138175y = arguments.getBoolean("is_me", false);
        if (getContext() != null) {
            DmtStatusView.C17269a a = DmtStatusView.C17269a.m31905a(getContext());
            try {
                TuxTextView t = m110357t();
                t.setText(R.string.cxj);
                t.setOnClickListener(new View$OnClickListenerC60804i(this));
                boolean z = this.f138175y;
                Context context = getContext();
                if (context == null) {
                    tuxTextView = null;
                } else {
                    tuxTextView = m110357t();
                    if (z) {
                        string = getString(R.string.dc4);
                        string2 = getString(R.string.dc3);
                    } else {
                        string = getString(R.string.dm_);
                        string2 = getString(R.string.dm9, "@" + this.f138173v);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string + "\n" + string2);
                    spannableStringBuilder.setSpan(new AbsoluteSizeSpan(17, true), 0, string.length(), 18);
                    spannableStringBuilder.setSpan(new StyleSpan(1), 0, string.length(), 33);
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(C0643b.m2378c(context, R.color.bx)), 0, string.length(), 18);
                    tuxTextView.setText(spannableStringBuilder);
                    tuxTextView.setLineSpacing(C13628n.m24520b(context, 12.0f), 1.0f);
                }
                a.mo27406b(tuxTextView).mo27408c(t);
                int b = (int) C13628n.m24520b(getContext(), 24.0f);
                this.f138157b.setPadding(b, 0, b, 0);
            } catch (Exception e) {
                e.printStackTrace();
            }
            this.f138157b.setBuilder(a);
        }
        C39101b bVar = new C39101b();
        this.f138161j = bVar;
        bVar.mo67838a((AbstractC39085b) new C61154a());
        this.f138161j.mo67839a_(this);
        C47426a aVar = new C47426a();
        this.f138171t = aVar;
        aVar.mo67839a_(this);
        C60732l lVar = new C60732l(this, this.f138162k, this.f145460P);
        this.f138169r = lVar;
        lVar.mo67829d(true);
        this.f138159d.mo63043b();
        this.f138159d.f138612h = new C60801h(this);
        getActivity();
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager();
        wrapLinearLayoutManager.mo4356b(1);
        this.f138156a.setLayoutManager(wrapLinearLayoutManager);
        C80330da.C80331a.m139266a("origin_music_old_fragment").mo123698a(this.f138156a);
        this.f138169r.mo67813a(this);
        this.f138156a.setAdapter(this.f138169r);
        this.f138169r.mo98156a(new ArrayList());
        getActivity();
        if (!m110354o()) {
            new C23144b(this).mo37640e(R.string.dcq).mo37637b();
        } else if (this.f145458N) {
            mo98204c();
        }
        this.f138169r.mo67829d(true);
        this.f138169r.mo67813a(new AbstractC39063h.AbstractC39067a() {
            /* class com.p2082ss.android.ugc.aweme.music.C60797g.C607981 */

            static {
                Covode.recordClassIndex(71355);
            }

            @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h.AbstractC39067a
            /* renamed from: l */
            public final void mo62679l() {
                if (C60797g.this.f138161j != null && !TextUtils.isEmpty(C60797g.this.f138162k)) {
                    C60797g.this.f138161j.mo57616a(4, C60797g.this.f138162k, C60797g.this.f138163l);
                }
            }
        });
        DataCenter a2 = DataCenter.m69492a(C1181ae.m3879a(this, (C1175ad.AbstractC1177b) null), this);
        this.f138164m = a2;
        a2.mo60189a("music_loading", (AbstractC1214u<C33942b>) this);
    }

    @Override // com.p2082ss.android.ugc.aweme.favorites.p2924f.AbstractC47432f
    /* renamed from: a */
    public final void mo79705a(MusicModel musicModel, int i, boolean z) {
        this.f138159d.f138615k = this.f138168q;
        this.f138159d.f138617m = i;
        this.f138159d.mo97994b(musicModel, this.f138172u, true);
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        MethodCollector.m26663i(10078);
        View a = C1764a.m5927a(layoutInflater, R.layout.apa, viewGroup, false);
        this.f138159d = new MusicDownloadPlayHelper(this);
        ViewStub viewStub = (ViewStub) a.findViewById(R.id.ea0);
        this.f138165n = viewStub;
        View inflate = viewStub.inflate();
        this.f138166o = inflate;
        inflate.setVisibility(4);
        MethodCollector.m26664o(10078);
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61180m
    /* renamed from: a */
    public final void mo62880a(String str, final MusicModel musicModel, String str2) {
        final ActivityC0945e activity = getActivity();
        final RecordConfig build = new RecordConfig.Builder().musicOrigin(str2).musicPath(str).build();
        AVExternalServiceImpl.m113114a().asyncService("OriginMusic", new SimpleServiceLoadCallback() {
            /* class com.p2082ss.android.ugc.aweme.music.C60797g.C607992 */

            static {
                Covode.recordClassIndex(71356);
            }

            @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onLoad(AsyncAVService asyncAVService, long j) {
                asyncAVService.uiService().recordService().startRecord(activity, build, musicModel, true);
            }
        });
    }
}
