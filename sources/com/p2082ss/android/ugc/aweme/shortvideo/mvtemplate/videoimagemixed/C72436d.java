package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.recyclerview.widget.C1434i;
import androidx.recyclerview.widget.C1465n;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ttve.utils.C30745b;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C70455f;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AbstractC72051a;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.cutsame.C72271a;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.cutsame.CutSameVideoImageExtraData;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.C72440e;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.VideoImageMixedView;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.p3847a.AbstractC72423a;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.p3847a.AbstractC72424b;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.p3847a.AbstractC72425c;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.p3847a.AbstractC72430d;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.p3847a.AbstractC72431e;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.p3847a.C72432f;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73975b;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C74002bq;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d;
import com.p2082ss.android.ugc.tools.utils.C84896h;
import com.p2082ss.android.ugc.tools.utils.C84904k;
import com.p2082ss.android.ugc.tools.view.C84916a;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.d */
public final class C72436d implements AbstractC72424b {

    /* renamed from: a */
    public VideoImageMixedView f162386a;

    /* renamed from: b */
    public AbstractC72425c f162387b;

    /* renamed from: c */
    public final ArrayList<MvImageChooseAdapter.MyMediaModel> f162388c = new ArrayList<>();

    /* renamed from: d */
    public AbstractC72431e f162389d;

    /* renamed from: e */
    public AbstractC72430d f162390e;

    /* renamed from: f */
    public boolean f162391f;

    /* renamed from: g */
    public AbstractC72051a f162392g;

    /* renamed from: h */
    public AbstractC72051a f162393h;

    /* renamed from: i */
    public AbstractC72051a f162394i;

    /* renamed from: j */
    public boolean f162395j;

    /* renamed from: k */
    private String f162396k;

    /* renamed from: l */
    private String f162397l;

    /* renamed from: m */
    private String f162398m;

    /* renamed from: n */
    private Drawable f162399n;

    /* renamed from: o */
    private Drawable f162400o;

    /* renamed from: p */
    private String f162401p;

    /* renamed from: q */
    private int f162402q = -1;

    /* renamed from: r */
    private ArrayList<CutSameVideoImageExtraData> f162403r;

    /* renamed from: s */
    private int f162404s = 1;

    /* renamed from: t */
    private int f162405t = 1;

    /* renamed from: u */
    private List<String> f162406u = new ArrayList();

    /* renamed from: v */
    private int f162407v;

    /* renamed from: w */
    private ChooseMediaViewModel f162408w;

    /* renamed from: x */
    private boolean f162409x;

    static {
        Covode.recordClassIndex(85110);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.p3847a.AbstractC72424b
    /* renamed from: a */
    public final List<MvImageChooseAdapter.MyMediaModel> mo114693a() {
        return this.f162388c;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.p3847a.AbstractC72424b
    /* renamed from: a */
    public final void mo114696a(View view, String str) {
        C89219l.m154721d(view, "");
        VideoImageMixedView videoImageMixedView = (VideoImageMixedView) view;
        this.f162386a = videoImageMixedView;
        if (videoImageMixedView == null) {
            C89219l.m154710a("videoImageMixedView");
        }
        videoImageMixedView.mo114682a(str, false);
        VideoImageMixedView videoImageMixedView2 = this.f162386a;
        if (videoImageMixedView2 == null) {
            C89219l.m154710a("videoImageMixedView");
        }
        TextView sureTextView = videoImageMixedView2.getSureTextView();
        Context context = sureTextView.getContext();
        sureTextView.setText(context != null ? context.getString(R.string.dfa) : null);
        sureTextView.setTextColor(1461065763);
        Drawable a = C84916a.m145947a(0, 253106211, 0, (int) C30745b.m63132b(videoImageMixedView.getContext(), 2.0f));
        C89219l.m154716b(a, "");
        this.f162400o = a;
        if (a == null) {
            C89219l.m154710a("unClickDrawable");
        }
        sureTextView.setBackground(a);
        VideoImageMixedView videoImageMixedView3 = this.f162386a;
        if (videoImageMixedView3 == null) {
            C89219l.m154710a("videoImageMixedView");
        }
        videoImageMixedView3.setVisibility(0);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.p3847a.AbstractC72424b
    /* renamed from: a */
    public final void mo114695a(View view) {
        AbstractC72425c bVar;
        MethodCollector.m26663i(11066);
        C89219l.m154721d(view, "");
        VideoImageMixedView videoImageMixedView = (VideoImageMixedView) view;
        this.f162386a = videoImageMixedView;
        if (videoImageMixedView == null) {
            C89219l.m154710a("videoImageMixedView");
        }
        videoImageMixedView.setVisibility(0);
        if (mo114715h()) {
            bVar = new C72271a();
        } else {
            bVar = new C72434b();
        }
        this.f162387b = bVar;
        VideoImageMixedView videoImageMixedView2 = this.f162386a;
        if (videoImageMixedView2 == null) {
            C89219l.m154710a("videoImageMixedView");
        }
        ViewStub viewStub = (ViewStub) videoImageMixedView2.findViewById(R.id.fg8);
        if (viewStub != null) {
            viewStub.inflate();
        }
        View findViewById = videoImageMixedView2.findViewById(R.id.cj0);
        if (findViewById == null) {
            C89219l.m154715b();
        }
        videoImageMixedView2.f162338a = (RecyclerView) findViewById;
        RecyclerView recyclerView = videoImageMixedView2.f162338a;
        if (recyclerView == null) {
            C89219l.m154710a("mediaSelectRecyclerView");
        }
        Context context = videoImageMixedView2.getContext();
        C89219l.m154716b(context, "");
        recyclerView.setLayoutManager(new VideoImageMixedView.C72416a(videoImageMixedView2, context));
        C1434i iVar = new C1434i();
        iVar.f4467i = 0;
        iVar.f4469k = 250;
        iVar.f4468j = 0;
        iVar.f4470l = 250;
        RecyclerView recyclerView2 = videoImageMixedView2.f162338a;
        if (recyclerView2 == null) {
            C89219l.m154710a("mediaSelectRecyclerView");
        }
        recyclerView2.setItemAnimator(iVar);
        VideoImageMixedView videoImageMixedView3 = this.f162386a;
        if (videoImageMixedView3 == null) {
            C89219l.m154710a("videoImageMixedView");
        }
        RecyclerView mediaSelectRecyclerView = videoImageMixedView3.getMediaSelectRecyclerView();
        AbstractC72425c cVar = this.f162387b;
        if (cVar == null) {
            C89219l.m154710a("videoImageMixedAdapter");
        }
        mediaSelectRecyclerView.setAdapter(cVar);
        Context context2 = view.getContext();
        C89219l.m154716b(context2, "");
        String string = context2.getResources().getString(R.string.c3g);
        C89219l.m154716b(string, "");
        this.f162396k = string;
        Context context3 = view.getContext();
        C89219l.m154716b(context3, "");
        String string2 = context3.getResources().getString(R.string.dfe);
        C89219l.m154716b(string2, "");
        this.f162397l = string2;
        Context context4 = view.getContext();
        C89219l.m154716b(context4, "");
        String string3 = context4.getResources().getString(R.string.f7d);
        C89219l.m154716b(string3, "");
        this.f162398m = string3;
        Context context5 = view.getContext();
        C89219l.m154716b(context5, "");
        int color = context5.getResources().getColor(R.color.bh);
        int b = (int) C30745b.m63132b(view.getContext(), 2.0f);
        Drawable a = C84916a.m145947a(0, color, 0, b);
        C89219l.m154716b(a, "");
        this.f162399n = a;
        Drawable a2 = C84916a.m145947a(0, 253106211, 0, b);
        C89219l.m154716b(a2, "");
        this.f162400o = a2;
        VideoImageMixedView videoImageMixedView4 = this.f162386a;
        if (videoImageMixedView4 == null) {
            C89219l.m154710a("videoImageMixedView");
        }
        videoImageMixedView4.mo114682a(this.f162401p, mo114716i());
        m127783m();
        if (!this.f162391f && C70455f.f157420d) {
            C1731i.m5640b(C72440e.CallableC72443c.f162418a, C1731i.f5562a);
        }
        if (mo114715h()) {
            AbstractC72425c cVar2 = this.f162387b;
            if (cVar2 == null) {
                C89219l.m154710a("videoImageMixedAdapter");
            }
            cVar2.mo114495a(this.f162404s);
            AbstractC72425c cVar3 = this.f162387b;
            if (cVar3 == null) {
                C89219l.m154710a("videoImageMixedAdapter");
            }
            cVar3.mo114498a(this.f162403r);
            VideoImageMixedView videoImageMixedView5 = this.f162386a;
            if (videoImageMixedView5 == null) {
                C89219l.m154710a("videoImageMixedView");
            }
            videoImageMixedView5.mo114683a(true);
        } else {
            AbstractC72425c cVar4 = this.f162387b;
            if (cVar4 == null) {
                C89219l.m154710a("videoImageMixedAdapter");
            }
            C1465n nVar = new C1465n(new C72432f(cVar4));
            VideoImageMixedView videoImageMixedView6 = this.f162386a;
            if (videoImageMixedView6 == null) {
                C89219l.m154710a("videoImageMixedView");
            }
            nVar.mo4979a(videoImageMixedView6.getMediaSelectRecyclerView());
        }
        AbstractC72425c cVar5 = this.f162387b;
        if (cVar5 == null) {
            C89219l.m154710a("videoImageMixedAdapter");
        }
        cVar5.f162353f = new C72437a(this);
        VideoImageMixedView videoImageMixedView7 = this.f162386a;
        if (videoImageMixedView7 == null) {
            C89219l.m154710a("videoImageMixedView");
        }
        videoImageMixedView7.getSureTextView().setOnClickListener(new C72438b(this));
        MethodCollector.m26664o(11066);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.p3847a.AbstractC72424b
    /* renamed from: a */
    public final void mo114697a(C72435c cVar) {
        int i;
        this.f162389d = cVar.f162371a;
        this.f162390e = cVar.f162372b;
        this.f162402q = cVar.f162373c;
        this.f162391f = cVar.f162374d;
        this.f162392g = cVar.f162375e;
        this.f162393h = cVar.f162376f;
        this.f162394i = cVar.f162377g;
        this.f162405t = cVar.f162379i;
        this.f162404s = cVar.f162380j;
        this.f162401p = cVar.f162378h;
        this.f162406u = cVar.f162382l;
        this.f162403r = cVar.f162383m;
        int i2 = this.f162402q;
        if (i2 == 10 || i2 == 16) {
            i = cVar.f162381k;
        } else {
            i = C72440e.m127809a();
        }
        this.f162407v = i;
        this.f162408w = cVar.f162384n;
        this.f162409x = cVar.f162385o;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.p3847a.AbstractC72424b
    /* renamed from: a */
    public final void mo114698a(boolean z) {
        if (z) {
            VideoImageMixedView videoImageMixedView = this.f162386a;
            if (videoImageMixedView == null) {
                C89219l.m154710a("videoImageMixedView");
            }
            videoImageMixedView.setVisibility(0);
            return;
        }
        this.f162388c.clear();
        if (this.f162387b != null) {
            AbstractC72425c cVar = this.f162387b;
            if (cVar == null) {
                C89219l.m154710a("videoImageMixedAdapter");
            }
            cVar.f162349b.clear();
            AbstractC72425c cVar2 = this.f162387b;
            if (cVar2 == null) {
                C89219l.m154710a("videoImageMixedAdapter");
            }
            cVar2.notifyDataSetChanged();
            VideoImageMixedView videoImageMixedView2 = this.f162386a;
            if (videoImageMixedView2 == null) {
                C89219l.m154710a("videoImageMixedView");
            }
            videoImageMixedView2.mo114683a(false);
            VideoImageMixedView videoImageMixedView3 = this.f162386a;
            if (videoImageMixedView3 == null) {
                C89219l.m154710a("videoImageMixedView");
            }
            TextView sureTextView = videoImageMixedView3.getSureTextView();
            VideoImageMixedView videoImageMixedView4 = this.f162386a;
            if (videoImageMixedView4 == null) {
                C89219l.m154710a("videoImageMixedView");
            }
            sureTextView.setText(videoImageMixedView4.getContext().getString(R.string.dfa));
            VideoImageMixedView videoImageMixedView5 = this.f162386a;
            if (videoImageMixedView5 == null) {
                C89219l.m154710a("videoImageMixedView");
            }
            m127778a(videoImageMixedView5.getSureTextView(), false);
        }
        VideoImageMixedView videoImageMixedView6 = this.f162386a;
        if (videoImageMixedView6 == null) {
            C89219l.m154710a("videoImageMixedView");
        }
        videoImageMixedView6.setVisibility(8);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.p3847a.AbstractC72424b
    /* renamed from: e */
    public final ArrayList<MvImageChooseAdapter.MyMediaModel> mo114704e() {
        return mo114714g();
    }

    /* renamed from: i */
    public final boolean mo114716i() {
        if (this.f162402q == 1) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.p3847a.AbstractC72424b
    /* renamed from: b */
    public final CutSameVideoImageExtraData mo114700b() {
        AbstractC72425c cVar = this.f162387b;
        if (cVar == null) {
            C89219l.m154710a("videoImageMixedAdapter");
        }
        return cVar.mo114499b();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.p3847a.AbstractC72424b
    /* renamed from: f */
    public final View mo114705f() {
        VideoImageMixedView videoImageMixedView = this.f162386a;
        if (videoImageMixedView == null) {
            C89219l.m154710a("videoImageMixedView");
        }
        return videoImageMixedView.getSureTextView();
    }

    /* renamed from: h */
    public final boolean mo114715h() {
        if (this.f162402q == 10) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    private final int m127780j() {
        int size = (this.f162407v - this.f162388c.size()) - this.f162406u.size();
        if (size < 0) {
            return 0;
        }
        return size;
    }

    /* renamed from: k */
    private final void m127781k() {
        Iterator<MvImageChooseAdapter.MyMediaModel> it = this.f162388c.iterator();
        int i = 1;
        while (it.hasNext()) {
            it.next().f161471v = i;
            i++;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.p3847a.AbstractC72424b
    /* renamed from: d */
    public final void mo114703d() {
        VideoImageMixedView videoImageMixedView = this.f162386a;
        if (videoImageMixedView == null) {
            C89219l.m154710a("videoImageMixedView");
        }
        AbstractC72425c cVar = this.f162387b;
        if (cVar == null) {
            C89219l.m154710a("videoImageMixedAdapter");
        }
        videoImageMixedView.mo114681a(cVar.mo114494a());
    }

    /* renamed from: g */
    public final ArrayList<MvImageChooseAdapter.MyMediaModel> mo114714g() {
        if (!mo114715h()) {
            return this.f162388c;
        }
        AbstractC72425c cVar = this.f162387b;
        if (cVar == null) {
            C89219l.m154710a("videoImageMixedAdapter");
        }
        return cVar.f162349b;
    }

    /* renamed from: l */
    private final void m127782l() {
        Iterator<MvImageChooseAdapter.MyMediaModel> it = this.f162388c.iterator();
        while (it.hasNext()) {
            MvImageChooseAdapter.MyMediaModel next = it.next();
            C89219l.m154716b(next, "");
            if (C84896h.m145866a(next.f134662b, false)) {
                next.f134668h = 3000;
                next.f134672l = 720;
                next.f134673m = 1280;
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.p3847a.AbstractC72424b
    /* renamed from: c */
    public final View mo114702c() {
        if (!mo114715h() || this.f162386a == null || this.f162387b == null) {
            return null;
        }
        VideoImageMixedView videoImageMixedView = this.f162386a;
        if (videoImageMixedView == null) {
            C89219l.m154710a("videoImageMixedView");
        }
        RecyclerView mediaSelectRecyclerView = videoImageMixedView.getMediaSelectRecyclerView();
        AbstractC72425c cVar = this.f162387b;
        if (cVar == null) {
            C89219l.m154710a("videoImageMixedAdapter");
        }
        RecyclerView.ViewHolder f = mediaSelectRecyclerView.mo4451f(cVar.mo114494a());
        if (f == null) {
            return null;
        }
        C89219l.m154716b(f, "");
        return f.itemView;
    }

    /* renamed from: m */
    private final void m127783m() {
        VideoImageMixedView videoImageMixedView = this.f162386a;
        if (videoImageMixedView == null) {
            C89219l.m154710a("videoImageMixedView");
        }
        TextView sureTextView = videoImageMixedView.getSureTextView();
        int size = this.f162388c.size();
        boolean a = m127779a(this.f162388c);
        boolean z = false;
        if (!a && size != 1 && !mo114716i() && !this.f162391f) {
            String str = this.f162397l;
            if (str == null) {
                C89219l.m154710a("nextStepText");
            }
            String a2 = C1764a.m5928a(str, Arrays.copyOf(new Object[]{Integer.valueOf(size)}, 1));
            C89219l.m154716b(a2, "");
            sureTextView.setText(a2);
        } else if (this.f162391f) {
            if (size == 1) {
                sureTextView.setText(sureTextView.getContext().getString(R.string.b1i));
            } else {
                String str2 = this.f162398m;
                if (str2 == null) {
                    C89219l.m154710a("sureText");
                }
                String a3 = C1764a.m5928a(str2, Arrays.copyOf(new Object[]{Integer.valueOf(size)}, 1));
                C89219l.m154716b(a3, "");
                sureTextView.setText(a3);
            }
        } else if (mo114716i()) {
            String str3 = this.f162398m;
            if (str3 == null) {
                C89219l.m154710a("sureText");
            }
            String a4 = C1764a.m5928a(str3, Arrays.copyOf(new Object[]{Integer.valueOf(size)}, 1));
            C89219l.m154716b(a4, "");
            sureTextView.setText(a4);
        } else if (size == 1) {
            sureTextView.setText(sureTextView.getContext().getString(R.string.dfa));
        } else {
            String str4 = this.f162397l;
            if (str4 == null) {
                C89219l.m154710a("nextStepText");
            }
            String a5 = C1764a.m5928a(str4, Arrays.copyOf(new Object[]{Integer.valueOf(size)}, 1));
            C89219l.m154716b(a5, "");
            sureTextView.setText(a5);
        }
        if (mo114715h()) {
            sureTextView.setText(sureTextView.getContext().getString(R.string.b1i));
        }
        if (size == 0) {
            m127778a(sureTextView, false);
            if (!mo114715h()) {
                VideoImageMixedView videoImageMixedView2 = this.f162386a;
                if (videoImageMixedView2 == null) {
                    C89219l.m154710a("videoImageMixedView");
                }
                videoImageMixedView2.mo114683a(false);
            }
            if (this.f162391f || mo114716i() || mo114715h()) {
                sureTextView.setText(sureTextView.getContext().getString(R.string.b1i));
            } else {
                sureTextView.setText(sureTextView.getContext().getString(R.string.dfa));
            }
        } else {
            if (a) {
                if (size >= this.f162404s) {
                    z = true;
                }
                m127778a(sureTextView, z);
            } else {
                if (size >= this.f162405t) {
                    z = true;
                }
                m127778a(sureTextView, z);
            }
            VideoImageMixedView videoImageMixedView3 = this.f162386a;
            if (videoImageMixedView3 == null) {
                C89219l.m154710a("videoImageMixedView");
            }
            videoImageMixedView3.mo114683a(true);
        }
        ChooseMediaViewModel chooseMediaViewModel = this.f162408w;
        if (chooseMediaViewModel != null) {
            VideoImageMixedView videoImageMixedView4 = this.f162386a;
            if (videoImageMixedView4 == null) {
                C89219l.m154710a("videoImageMixedView");
            }
            chooseMediaViewModel.mo114222a(videoImageMixedView4.getSureTextView().getText().toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.d$a */
    public static final class C72437a implements AbstractC72431e {

        /* renamed from: a */
        final /* synthetic */ C72436d f162410a;

        static {
            Covode.recordClassIndex(85111);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C72437a(C72436d dVar) {
            this.f162410a = dVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.p3847a.AbstractC72431e
        /* renamed from: a */
        public final void mo114400a(MvImageChooseAdapter.MyMediaModel myMediaModel) {
            if (myMediaModel != null) {
                Iterator<MvImageChooseAdapter.MyMediaModel> it = this.f162410a.f162388c.iterator();
                int i = 1;
                while (it.hasNext()) {
                    MvImageChooseAdapter.MyMediaModel next = it.next();
                    String str = myMediaModel.f134662b;
                    C89219l.m154716b(next, "");
                    if (C89219l.m154714a((Object) str, (Object) next.f134662b)) {
                        next.f161471v = -1;
                    } else {
                        next.f161471v = i;
                        i++;
                    }
                }
                this.f162410a.f162388c.remove(myMediaModel);
                this.f162410a.mo114712a(myMediaModel);
                AbstractC72051a aVar = this.f162410a.f162392g;
                if (aVar != null) {
                    aVar.mo114329a(myMediaModel);
                }
                AbstractC72051a aVar2 = this.f162410a.f162393h;
                if (aVar2 != null) {
                    aVar2.mo114329a(myMediaModel);
                }
                AbstractC72051a aVar3 = this.f162410a.f162394i;
                if (aVar3 != null) {
                    aVar3.mo114329a(myMediaModel);
                }
                AbstractC72051a aVar4 = this.f162410a.f162392g;
                if (aVar4 != null) {
                    aVar4.mo114341d();
                }
                AbstractC72051a aVar5 = this.f162410a.f162393h;
                if (aVar5 != null) {
                    aVar5.mo114341d();
                }
                AbstractC72051a aVar6 = this.f162410a.f162394i;
                if (aVar6 != null) {
                    aVar6.mo114341d();
                }
                AbstractC72431e eVar = this.f162410a.f162389d;
                if (eVar != null) {
                    eVar.mo114400a(myMediaModel);
                }
                C39162r.m79460a("edit_clip_delete", C72448f.m127824b(myMediaModel.mo96674b()).f188764a);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.p3847a.AbstractC72431e
        /* renamed from: a */
        public final void mo114399a(int i, int i2) {
            this.f162410a.mo114713a(i, i2, false);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.p3847a.AbstractC72431e
        /* renamed from: a */
        public final void mo114401a(MvImageChooseAdapter.MyMediaModel myMediaModel, View view) {
            AbstractC72431e eVar = this.f162410a.f162389d;
            if (eVar != null) {
                eVar.mo114401a(myMediaModel, view);
            }
            if (myMediaModel != null) {
                C39162r.m79460a("edit_clip_preview", C72448f.m127824b(myMediaModel.mo96674b()).mo129406a("edit_way", "click").f188764a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.d$b */
    public static final class C72438b extends AbstractView$OnClickListenerC81432d {

        /* renamed from: a */
        final /* synthetic */ C72436d f162411a;

        static {
            Covode.recordClassIndex(85112);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72438b(C72436d dVar) {
            super(1100);
            this.f162411a = dVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.d$b$a */
        public static final class C72439a implements AbstractC72423a {

            /* renamed from: a */
            final /* synthetic */ C72438b f162412a;

            /* renamed from: b */
            final /* synthetic */ View f162413b;

            static {
                Covode.recordClassIndex(85113);
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.p3847a.AbstractC72423a
            /* renamed from: a */
            public final void mo114410a(boolean z) {
                if (!z) {
                    AbstractC72430d dVar = this.f162412a.f162411a.f162390e;
                    if (dVar != null) {
                        dVar.mo114398a(true, this.f162412a.f162411a.mo114714g());
                    }
                } else if (this.f162412a.f162411a.f162388c.size() > 1 || this.f162412a.f162411a.f162391f) {
                    View view = this.f162413b;
                    if (view != null) {
                        new C79459a(view.getContext()).mo123050a(R.string.h3a).mo123053a();
                    }
                } else if (C74002bq.m130147a()) {
                    AbstractC72430d dVar2 = this.f162412a.f162411a.f162390e;
                    if (dVar2 != null) {
                        dVar2.mo114398a(true, this.f162412a.f162411a.mo114714g());
                    }
                } else {
                    View view2 = this.f162413b;
                    if (view2 != null) {
                        new C79459a(view2.getContext()).mo123050a(R.string.h3c).mo123053a();
                    }
                }
            }

            C72439a(C72438b bVar, View view) {
                this.f162412a = bVar;
                this.f162413b = view;
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d
        /* renamed from: a */
        public final void mo77200a(View view) {
            C73975b.C73976a.f166071a.start("av_video_edit", "click onNext btn");
            if (!this.f162411a.f162395j) {
                AbstractC72430d dVar = this.f162411a.f162390e;
                if (dVar != null) {
                    dVar.mo114398a(false, this.f162411a.mo114714g());
                }
            } else if (this.f162411a.mo114715h() || this.f162411a.mo114716i()) {
                AbstractC72430d dVar2 = this.f162411a.f162390e;
                if (dVar2 != null) {
                    dVar2.mo114398a(true, this.f162411a.mo114714g());
                }
            } else if (!C72436d.m127779a(this.f162411a.f162388c)) {
                AbstractC72430d dVar3 = this.f162411a.f162390e;
                if (dVar3 != null) {
                    dVar3.mo114398a(true, this.f162411a.mo114714g());
                }
            } else {
                C70005cr a = C70005cr.m123611a();
                C89219l.m154716b(a, "");
                if (a.f156483b) {
                    C70005cr.m123611a().f156482a = null;
                    AbstractC72430d dVar4 = this.f162411a.f162390e;
                    if (dVar4 != null) {
                        dVar4.mo114397a();
                    }
                }
                C72440e.m127812a(this.f162411a.f162388c, new C72439a(this, view));
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.p3847a.AbstractC72424b
    /* renamed from: b */
    public final View mo114699b(int i) {
        View c;
        VideoImageMixedView videoImageMixedView = this.f162386a;
        if (videoImageMixedView == null) {
            C89219l.m154710a("videoImageMixedView");
        }
        RecyclerView.AbstractC1362i layoutManager = videoImageMixedView.getMediaSelectRecyclerView().getLayoutManager();
        if (layoutManager == null || (c = layoutManager.mo4358c(i)) == null) {
            return null;
        }
        return c.findViewById(R.id.fc8);
    }

    /* renamed from: a */
    public static boolean m127779a(List<? extends MvImageChooseAdapter.MyMediaModel> list) {
        if (C84904k.m145909a(list)) {
            return false;
        }
        if (list == null) {
            C89219l.m154715b();
        }
        for (MediaModel mediaModel : list) {
            if (mediaModel.mo96674b()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final int mo114712a(MvImageChooseAdapter.MyMediaModel myMediaModel) {
        if (myMediaModel == null) {
            return -1;
        }
        AbstractC72425c cVar = this.f162387b;
        if (cVar == null) {
            C89219l.m154710a("videoImageMixedAdapter");
        }
        cVar.mo114497a(myMediaModel);
        this.f162388c.remove(myMediaModel);
        ChooseMediaViewModel chooseMediaViewModel = this.f162408w;
        if (chooseMediaViewModel != null) {
            chooseMediaViewModel.mo114220a(myMediaModel);
        }
        m127781k();
        m127783m();
        if (mo114715h()) {
            VideoImageMixedView videoImageMixedView = this.f162386a;
            if (videoImageMixedView == null) {
                C89219l.m154710a("videoImageMixedView");
            }
            AbstractC72425c cVar2 = this.f162387b;
            if (cVar2 == null) {
                C89219l.m154710a("videoImageMixedAdapter");
            }
            videoImageMixedView.mo114681a(cVar2.mo114494a());
        }
        return m127780j();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.p3847a.AbstractC72424b
    /* renamed from: a */
    public final void mo114694a(int i) {
        VideoImageMixedView videoImageMixedView = this.f162386a;
        if (videoImageMixedView == null) {
            C89219l.m154710a("videoImageMixedView");
        }
        RecyclerView.AbstractC1362i layoutManager = videoImageMixedView.getMediaSelectRecyclerView().getLayoutManager();
        if (layoutManager != null && layoutManager.mo4358c(i) == null && (layoutManager instanceof LinearLayoutManager)) {
            ((LinearLayoutManager) layoutManager).mo4347a(i, 0);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.p3847a.AbstractC72424b
    /* renamed from: b */
    public final void mo114701b(int i, int i2) {
        mo114713a(i, i2, true);
    }

    /* renamed from: a */
    private final void m127778a(TextView textView, boolean z) {
        if (z) {
            if (textView != null) {
                textView.setTextColor(-1);
                Drawable drawable = this.f162399n;
                if (drawable == null) {
                    C89219l.m154710a("clickDrawable");
                }
                textView.setBackground(drawable);
            }
            this.f162395j = true;
            return;
        }
        if (textView != null) {
            textView.setTextColor(1461065763);
            Drawable drawable2 = this.f162400o;
            if (drawable2 == null) {
                C89219l.m154710a("unClickDrawable");
            }
            textView.setBackground(drawable2);
        }
        this.f162395j = false;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.p3847a.AbstractC72424b
    /* renamed from: a */
    public final int mo114691a(int i, int i2) {
        int size = this.f162388c.size();
        if (i2 == 6) {
            return 10;
        }
        if (this.f162391f) {
            m127782l();
            return 12;
        } else if (i == 1) {
            return i;
        } else {
            if (size == 1) {
                MvImageChooseAdapter.MyMediaModel myMediaModel = this.f162388c.get(0);
                C89219l.m154716b(myMediaModel, "");
                if (myMediaModel.mo96674b()) {
                    return 13;
                }
                return 11;
            } else if (!m127779a(this.f162388c)) {
                return 11;
            } else {
                m127782l();
                return 2;
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.p3847a.AbstractC72424b
    /* renamed from: a */
    public final int mo114692a(MvImageChooseAdapter.MyMediaModel myMediaModel, boolean z, boolean z2) {
        int a;
        if (!z) {
            a = mo114712a(myMediaModel);
        } else if (myMediaModel == null) {
            a = -1;
        } else {
            this.f162388c.add(myMediaModel);
            AbstractC72425c cVar = this.f162387b;
            if (cVar == null) {
                C89219l.m154710a("videoImageMixedAdapter");
            }
            cVar.mo114500b(myMediaModel);
            ChooseMediaViewModel chooseMediaViewModel = this.f162408w;
            if (chooseMediaViewModel != null) {
                chooseMediaViewModel.mo33689c(new ChooseMediaViewModel.C72012g(myMediaModel));
            }
            m127781k();
            m127783m();
            VideoImageMixedView videoImageMixedView = this.f162386a;
            if (videoImageMixedView == null) {
                C89219l.m154710a("videoImageMixedView");
            }
            AbstractC72425c cVar2 = this.f162387b;
            if (cVar2 == null) {
                C89219l.m154710a("videoImageMixedAdapter");
            }
            videoImageMixedView.mo114681a(cVar2.mo114494a());
            a = m127780j();
        }
        if (z2) {
            AbstractC72051a aVar = this.f162394i;
            if (aVar != null) {
                aVar.mo114335b(a);
            }
        } else {
            AbstractC72051a aVar2 = this.f162393h;
            if (aVar2 != null) {
                aVar2.mo114335b(a);
            }
        }
        AbstractC72051a aVar3 = this.f162392g;
        if (aVar3 != null) {
            aVar3.mo114335b(a);
        }
        if (!z) {
            AbstractC72051a aVar4 = this.f162393h;
            if (aVar4 != null) {
                aVar4.mo114341d();
            }
            AbstractC72051a aVar5 = this.f162394i;
            if (aVar5 != null) {
                aVar5.mo114341d();
            }
            AbstractC72051a aVar6 = this.f162392g;
            if (aVar6 != null) {
                aVar6.mo114341d();
            }
        } else if (a == 0) {
            AbstractC72051a aVar7 = this.f162393h;
            if (aVar7 != null) {
                aVar7.mo114341d();
            }
            AbstractC72051a aVar8 = this.f162394i;
            if (aVar8 != null) {
                aVar8.mo114341d();
            }
            AbstractC72051a aVar9 = this.f162392g;
            if (aVar9 != null) {
                aVar9.mo114341d();
            }
        }
        return this.f162388c.size();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo114713a(int i, int i2, boolean z) {
        boolean z2;
        boolean z3 = true;
        if (i < 0 || i >= this.f162388c.size()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (i2 < 0 || i2 >= this.f162388c.size()) {
            z3 = false;
        }
        if (z2 && z3) {
            MvImageChooseAdapter.MyMediaModel remove = this.f162388c.remove(i);
            C89219l.m154716b(remove, "");
            MvImageChooseAdapter.MyMediaModel myMediaModel = remove;
            this.f162388c.add(i2, myMediaModel);
            m127781k();
            AbstractC72051a aVar = this.f162392g;
            if (aVar != null) {
                aVar.mo114342e();
            }
            AbstractC72051a aVar2 = this.f162394i;
            if (aVar2 != null) {
                aVar2.mo114342e();
            }
            AbstractC72051a aVar3 = this.f162393h;
            if (aVar3 != null) {
                aVar3.mo114342e();
            }
            AbstractC72431e eVar = this.f162389d;
            if (eVar != null) {
                eVar.mo114399a(i, i2);
            }
            C72448f.m127823a(myMediaModel.mo96674b());
        }
        if (z) {
            AbstractC72425c cVar = this.f162387b;
            if (cVar == null) {
                C89219l.m154710a("videoImageMixedAdapter");
            }
            cVar.mo114706a(i, i2);
        }
    }
}
