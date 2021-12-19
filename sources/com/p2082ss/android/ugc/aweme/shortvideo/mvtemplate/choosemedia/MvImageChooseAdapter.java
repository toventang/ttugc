package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.content.C0643b;
import androidx.core.p036g.C0692e;
import androidx.recyclerview.widget.C1445j;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.common.utility.C13617h;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20758o;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.lighten.p1477a.EnumC20767w;
import com.bytedance.lighten.p1477a.p1480c.AbstractC20727d;
import com.bytedance.services.apm.api.C22708a;
import com.facebook.drawee.p1845a.p1846a.C24182c;
import com.facebook.drawee.p1845a.p1846a.C24185e;
import com.facebook.drawee.p1851c.AbstractC24195a;
import com.facebook.drawee.p1855f.C24246a;
import com.facebook.drawee.p1857h.AbstractC24255a;
import com.facebook.imagepipeline.common.C24363d;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.facebook.imagepipeline.p1890o.C24639c;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.experiment.C46916ew;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.mediachoose.AbstractC59180g;
import com.p2082ss.android.ugc.aweme.mediachoose.C59164c;
import com.p2082ss.android.ugc.aweme.mediachoose.C59179f;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.p2082ss.android.ugc.aweme.p2363ba.C34412d;
import com.p2082ss.android.ugc.aweme.p2730de.C40982q;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.property.C65422de;
import com.p2082ss.android.ugc.aweme.setting.C68062ck;
import com.p2082ss.android.ugc.aweme.setting.p3721i.C68085a;
import com.p2082ss.android.ugc.aweme.shortvideo.C69840ar;
import com.p2082ss.android.ugc.aweme.shortvideo.C71812ep;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.C72002b;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C72235n;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.FastScrollRecyclerView;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.C72440e;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73975b;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73986be;
import com.p2082ss.android.ugc.aweme.shortvideo.util.performance.OpenAlbumPanelPerformanceMonitor;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80322d;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.utils.C84896h;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89391z;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter */
public final class MvImageChooseAdapter extends RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> implements FastScrollRecyclerView.AbstractC72029b, C72235n.AbstractC72243c {

    /* renamed from: A */
    private final boolean f161431A = C46916ew.m90216a();

    /* renamed from: B */
    private final boolean f161432B = C68062ck.m120368a();

    /* renamed from: C */
    private boolean f161433C;

    /* renamed from: a */
    public int f161434a = 12;

    /* renamed from: b */
    public String f161435b;

    /* renamed from: c */
    final Context f161436c;

    /* renamed from: d */
    List<MyMediaModel> f161437d = new ArrayList();

    /* renamed from: e */
    public int f161438e;

    /* renamed from: f */
    public AbstractC72049d f161439f;

    /* renamed from: g */
    public AbstractC72048c f161440g;

    /* renamed from: h */
    public boolean f161441h = true;

    /* renamed from: i */
    public boolean f161442i;

    /* renamed from: j */
    public int f161443j;

    /* renamed from: k */
    int f161444k = 1;

    /* renamed from: l */
    public RecyclerView f161445l;

    /* renamed from: m */
    List<MyMediaModel> f161446m = new ArrayList();

    /* renamed from: n */
    public int f161447n = -1;

    /* renamed from: o */
    public boolean f161448o;

    /* renamed from: p */
    public final HashSet<RecyclerView.ViewHolder> f161449p = new HashSet<>(48);

    /* renamed from: q */
    public final boolean f161450q = C65422de.m117141a();

    /* renamed from: r */
    boolean f161451r;

    /* renamed from: s */
    private int f161452s;

    /* renamed from: t */
    private int f161453t = -1;

    /* renamed from: u */
    private Map<Long, Float> f161454u = new HashMap();

    /* renamed from: v */
    private double f161455v;

    /* renamed from: w */
    private AbstractC59180g f161456w;

    /* renamed from: x */
    private final HashSet<String> f161457x = new HashSet<>();

    /* renamed from: y */
    private final HashSet<C72050e> f161458y = new HashSet<>(48);

    /* renamed from: z */
    private final boolean f161459z = C16048b.m29633a().mo25421a(true, "creative_tools_enable_resized_image_diskcache", false);

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter$a */
    public interface AbstractC72046a {
        static {
            Covode.recordClassIndex(84703);
        }

        /* renamed from: a */
        void mo114285a();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter$c */
    public interface AbstractC72048c {
        static {
            Covode.recordClassIndex(84705);
        }

        /* renamed from: a */
        int mo114286a(MyMediaModel myMediaModel, boolean z);

        /* renamed from: a */
        void mo114287a();

        /* renamed from: a */
        void mo114288a(MediaModel mediaModel);

        /* renamed from: a */
        void mo114289a(MyMediaModel myMediaModel, View view);

        /* renamed from: a */
        void mo114290a(List<MyMediaModel> list, EnumC72047b bVar, MyMediaModel myMediaModel);

        /* renamed from: a */
        boolean mo114291a(MyMediaModel myMediaModel);

        /* renamed from: b */
        boolean mo114292b();

        /* renamed from: b */
        boolean mo114293b(MediaModel mediaModel);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter$d */
    public interface AbstractC72049d {
        static {
            Covode.recordClassIndex(84706);
        }

        /* renamed from: a */
        void mo114294a(View view, MediaModel mediaModel);
    }

    static {
        Covode.recordClassIndex(84698);
    }

    /* renamed from: a */
    private static String m127141a(int i, int i2) {
        return i > i2 ? "horizontal" : i < i2 ? "vertical" : "square";
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final long getItemId(int i) {
        return (long) i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m127139a(this, viewGroup, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0063, code lost:
        if (r0 == null) goto L_0x0065;
     */
    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C72235n.AbstractC72243c
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.CharSequence mo114273a(int r10) {
        /*
        // Method dump skipped, instructions count: 164
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.mo114273a(int):java.lang.CharSequence");
    }

    /* renamed from: a */
    public final void mo114279a(boolean z) {
        m127150f();
        this.f161441h = z;
        if (!C13617h.m24465a(this.f161437d)) {
            this.f161437d.clear();
            AbstractC72048c cVar = this.f161440g;
            if (cVar != null) {
                cVar.mo114290a(this.f161437d, null, null);
            }
        }
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public final void mo114278a(List<MyMediaModel> list) {
        this.f161446m.clear();
        for (int i = 0; i < list.size(); i++) {
            list.get(i).f161470u = i;
            this.f161446m.add(list.get(i));
        }
        notifyDataSetChanged();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo114274a(C1445j.C1450d dVar, List<MyMediaModel> list) {
        dVar.mo4952a(new C72266x(this, this.f161445l));
        this.f161446m = list;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo114275a(MediaModel mediaModel, AbstractC72046a aVar) {
        int i = this.f161443j;
        if (3 == i) {
            if (mediaModel.mo96674b()) {
                m127149c(mediaModel, aVar);
            } else {
                m127148b(mediaModel, aVar);
            }
        } else if (1 == i) {
            m127149c(mediaModel, aVar);
        } else {
            m127148b(mediaModel, aVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.FastScrollRecyclerView.AbstractC72029b
    /* renamed from: a */
    public final void mo114232a() {
        if (!this.f161433C) {
            this.f161433C = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo114276a(MyMediaModel myMediaModel) {
        if (myMediaModel != null) {
            this.f161437d.remove(myMediaModel);
            mo114284e();
        }
    }

    /* renamed from: a */
    public final void mo114277a(final C72050e eVar, final int i) {
        double d;
        final MyMediaModel myMediaModel = eVar.f161483i;
        myMediaModel.f161473x = m127141a(myMediaModel.f134672l, myMediaModel.f134673m);
        if (C68085a.m120387a() == 1) {
            d = 0.8d;
        } else {
            d = C68085a.m120387a() == 2 ? 0.6d : 1.0d;
        }
        C720453 r2 = new AbstractC20727d() {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.C720453 */

            /* renamed from: a */
            long f161465a;

            static {
                Covode.recordClassIndex(84701);
            }

            @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20734k
            /* renamed from: a */
            public final void mo34159a(Uri uri, View view, Throwable th) {
            }

            @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20727d, com.bytedance.lighten.p1477a.p1480c.AbstractC20734k
            /* renamed from: a */
            public final void mo34147a(Uri uri, View view) {
                super.mo34147a(uri, view);
                this.f161465a = System.currentTimeMillis();
            }

            @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20734k
            /* renamed from: a */
            public final void mo34158a(Uri uri, View view, C20758o oVar, Animatable animatable) {
                boolean z;
                boolean z2;
                boolean z3;
                if (MvImageChooseAdapter.this.f161450q) {
                    MvImageChooseAdapter.this.f161449p.add(eVar);
                }
                if (!MvImageChooseAdapter.this.f161448o || i != MvImageChooseAdapter.this.mo114281c()) {
                    z = false;
                } else {
                    z = true;
                }
                long currentTimeMillis = System.currentTimeMillis() - this.f161465a;
                int i = MvImageChooseAdapter.this.f161443j;
                int i2 = i;
                Long valueOf = Long.valueOf(currentTimeMillis);
                if (valueOf.longValue() > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2 && valueOf != null) {
                    C72267y.f162004a.add(Long.valueOf(valueOf.longValue()));
                }
                if (C72267y.f162006c == 0) {
                    C72267y.f162006c = System.currentTimeMillis();
                }
                C72267y yVar = C72267y.f162009f;
                if (z && yVar != null && !C72267y.f162005b && C72267y.f162007d != 0) {
                    C84425b a = new C84425b().mo129404a("duration", System.currentTimeMillis() - C72267y.f162007d).mo129404a("time_to_first_image", C72267y.f162006c - C72267y.f162007d).mo129403a("local_media_type", i);
                    if (C72267y.f162008e) {
                        C72267y.f162008e = false;
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    C80322d.m139251a("tool_performance_loaded_thumbnail_time", a.mo129407a("cold_start", z3).mo129403a("size", i2).f188764a);
                    System.currentTimeMillis();
                    C72267y.f162005b = true;
                }
                System.currentTimeMillis();
                if (z) {
                    C73975b.C73976a.f166071a.end(OpenAlbumPanelPerformanceMonitor.f166158a, "imageLoaded");
                    MvImageChooseAdapter.this.f161448o = false;
                }
                if (MvImageChooseAdapter.this.f161451r) {
                    MvImageChooseAdapter.this.f161451r = false;
                    C39162r.m79460a("tool_performance_operation_cost_time", new C84425b().mo129406a(StringSet.type, "tool_performance_load_first_img_switching_tab").mo129404a("totaltime", System.currentTimeMillis() - this.f161465a).f188764a);
                }
            }
        };
        if (C68085a.m120387a() != 0) {
            C24639c a = C24639c.m47149a(C84896h.m145871d(myMediaModel.f134662b));
            a.f58562m = true;
            int i2 = this.f161438e;
            double d2 = (double) i2;
            Double.isNaN(d2);
            int i3 = (int) (d2 * d);
            double d3 = (double) i2;
            Double.isNaN(d3);
            a.f58553d = new C24363d(i3, (int) (d3 * d));
            a.f58555f = new ImageDecodeOptionsBuilder().setBitmapConfig(Bitmap.Config.RGB_565).mo40154a();
            C24185e b = C24182c.m45843b();
            b.f57309m = eVar.f161475a.getController();
            b.f57299c = (REQUEST) a.mo40483a();
            AbstractC24195a c = b.mo39827e();
            eVar.f161475a.setPlaceholderImage(R.drawable.q1);
            eVar.f161475a.setActualImageScaleType(EnumC20767w.CENTER_CROP);
            ((C24246a) eVar.f161475a.getHierarchy()).mo39961b(10);
            eVar.f161475a.setImageDisplayListener(r2);
            eVar.f161487m = c;
            if (this.f161433C) {
                this.f161458y.add(eVar);
            } else {
                eVar.f161475a.setController(c);
            }
        } else {
            C20766v a2 = C20761r.m39057a(C84896h.m145871d(myMediaModel.f134662b));
            a2.f49092E = eVar.f161475a;
            a2.f49124u = Bitmap.Config.RGB_565;
            a2.f49125v = EnumC20767w.CENTER_CROP;
            a2.f49115l = R.drawable.q1;
            int i4 = this.f161438e;
            C20766v a3 = a2.mo34176a(i4, i4);
            a3.f49099L = this.f161459z;
            a3.f49116m = 10;
            if (C46916ew.m90216a()) {
                a3.mo34178a(new C72002b());
            }
            a3.mo34181a(r2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f161446m.size();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter$e */
    public static class C72050e extends RecyclerView.ViewHolder {

        /* renamed from: a */
        SmartImageView f161475a;

        /* renamed from: b */
        TextView f161476b;

        /* renamed from: c */
        TextView f161477c;

        /* renamed from: d */
        View f161478d;

        /* renamed from: e */
        ViewStub f161479e;

        /* renamed from: f */
        FrameLayout f161480f;

        /* renamed from: g */
        View f161481g;

        /* renamed from: h */
        String f161482h;

        /* renamed from: i */
        MyMediaModel f161483i;

        /* renamed from: j */
        View f161484j;

        /* renamed from: k */
        int f161485k;

        /* renamed from: l */
        int f161486l;

        /* renamed from: m */
        AbstractC24255a f161487m;

        static {
            Covode.recordClassIndex(84707);
        }

        /* renamed from: c */
        private boolean m127181c() {
            if (this.f161486l == 6) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo114295a() {
            if (C68085a.m120387a() == 0 || !this.f161476b.getText().toString().equals("")) {
                this.f161476b.setText("");
            }
            this.f161476b.setBackgroundResource(R.drawable.ry);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final void mo114297b() {
            MethodCollector.m26663i(10185);
            if (this.f161479e.getParent() != null) {
                this.f161479e.inflate();
                View findViewById = this.itemView.findViewById(R.id.duz);
                this.f161484j = findViewById;
                findViewById.findViewById(R.id.dux).setVisibility(8);
            }
            MethodCollector.m26664o(10185);
        }

        public C72050e(View view) {
            super(view);
        }

        /* renamed from: a */
        public final void mo114296a(int i) {
            if (m127181c()) {
                this.f161476b.setText("");
                this.f161476b.setBackgroundResource(2131230952);
                return;
            }
            this.f161476b.setText(String.valueOf(i));
            if (C46916ew.m90216a()) {
                this.f161476b.setBackgroundResource(2131230957);
            } else {
                this.f161476b.setBackgroundResource(R.drawable.rz);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter$b */
    public enum EnumC72047b {
        PREVIEW(1),
        THUMBNAIL(0);
        
        public int value;

        static {
            Covode.recordClassIndex(84704);
        }

        private EnumC72047b(int i) {
            this.value = i;
        }
    }

    /* renamed from: f */
    private void m127150f() {
        for (MyMediaModel myMediaModel : this.f161437d) {
            myMediaModel.f161471v = -1;
        }
        for (MyMediaModel myMediaModel2 : this.f161446m) {
            myMediaModel2.f161471v = -1;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.FastScrollRecyclerView.AbstractC72029b
    /* renamed from: b */
    public final void mo114233b() {
        if (this.f161433C) {
            this.f161433C = false;
            Iterator<C72050e> it = this.f161458y.iterator();
            while (it.hasNext()) {
                C72050e next = it.next();
                it.remove();
                if (next.f161487m != null) {
                    next.f161475a.setController(next.f161487m);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo114283d() {
        C0692e<Integer, Integer> a = C34412d.m70402a(this.f161445l);
        int intValue = a.f2750a.intValue();
        notifyItemRangeChanged(intValue, (a.f2751b.intValue() - intValue) + 1, new Object());
    }

    /* renamed from: c */
    public final int mo114281c() {
        if (this.f161453t == -1) {
            this.f161453t = Math.min(this.f161446m.size() - 1, (this.f161445l.getHeight() / this.f161438e) * this.f161452s);
        }
        return this.f161453t;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo114284e() {
        int i = -1;
        for (MyMediaModel myMediaModel : this.f161446m) {
            i++;
            for (MyMediaModel myMediaModel2 : this.f161437d) {
                if (myMediaModel.f134662b.equals(myMediaModel2.f134662b)) {
                    if (this.f161457x.isEmpty()) {
                        notifyItemChanged(i, new Object());
                    } else {
                        notifyItemChanged(i);
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo114282c(List<String> list) {
        this.f161457x.addAll(list);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter$MyMediaModel */
    public static class MyMediaModel extends MediaModel {

        /* renamed from: u */
        public int f161470u = -1;

        /* renamed from: v */
        public int f161471v = -1;

        /* renamed from: w */
        public int f161472w = -1;

        /* renamed from: x */
        public String f161473x;

        static {
            Covode.recordClassIndex(84702);
        }

        public MyMediaModel(String str) {
            super(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        if (this.f161450q) {
            this.f161449p.remove(viewHolder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        if (C68085a.m120387a() == 2) {
            this.f161458y.remove(viewHolder);
        }
    }

    /* renamed from: a */
    private void m127142a(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null && layoutParams.width != this.f161438e) {
            int i = layoutParams.height;
            int i2 = this.f161438e;
            double d = (double) i2;
            double d2 = this.f161455v;
            Double.isNaN(d);
            if (i != ((int) (d * d2))) {
                layoutParams.width = i2;
                double d3 = (double) this.f161438e;
                double d4 = this.f161455v;
                Double.isNaN(d3);
                layoutParams.height = (int) (d3 * d4);
            }
        }
    }

    /* renamed from: b */
    private static String m127147b(int i) {
        int i2 = i % 60;
        int i3 = i / 60;
        int i4 = i3 / 60;
        int i5 = i3 % 60;
        if (i4 == 0) {
            return C1764a.m5929a(Locale.getDefault(), "%02d:%02d", new Object[]{Integer.valueOf(i5), Integer.valueOf(i2)});
        }
        return C1764a.m5929a(Locale.getDefault(), "%02d:%02d:%02d", new Object[]{Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i2)});
    }

    /* renamed from: b */
    public final void mo114280b(List<MyMediaModel> list) {
        AbstractC88979t a = AbstractC88979t.m154294a(new C72158ax(this, list));
        if (this.f161446m.size() != 0) {
            a = a.mo143278b(C88925a.m154160a(C88946a.f201990b)).mo143261a(C88391a.m153580a(C88392a.f200660a));
        }
        a.mo143289d(new C72159ay(this, list));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        m127144a((C72050e) viewHolder, i, false);
    }

    /* renamed from: c */
    private void m127149c(MediaModel mediaModel, AbstractC72046a aVar) {
        if (this.f161456w == null) {
            C59164c cVar = new C59164c(this.f161436c);
            this.f161456w = cVar;
            cVar.mo96650a("enter_from_multi");
        }
        this.f161456w.mo96649a(mediaModel, 1000, -1, new C72171bf(this, aVar, mediaModel), new C72172bg(this, mediaModel));
    }

    /* renamed from: a */
    static void m127143a(MediaModel mediaModel, boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(mediaModel);
        C72440e.m127812a(arrayList, new C72160az(z));
    }

    /* renamed from: a */
    private void m127145a(C72050e eVar, boolean z) {
        float f;
        float f2;
        int i;
        if (eVar.f161483i.f161471v >= 0) {
            eVar.mo114296a(eVar.f161483i.f161471v);
            f = 1.0f;
            f2 = 1.1f;
            i = 0;
        } else {
            eVar.mo114295a();
            if (this.f161440g.mo114292b()) {
                f = 0.5f;
            } else {
                f = 1.0f;
            }
            f2 = 1.0f;
            i = 4;
        }
        if (eVar.f161475a.getAlpha() != f) {
            eVar.f161475a.setAlpha(f);
        }
        if (eVar.f161475a.getScaleX() == f2) {
            return;
        }
        if (z) {
            eVar.f161475a.animate().scaleY(f2).scaleX(f2).setDuration(300).start();
            if (i == 4) {
                eVar.f161481g.animate().alpha(0.0f).setDuration(300).withEndAction(new RunnableC72168bc(eVar)).start();
                return;
            }
            eVar.f161481g.setVisibility(0);
            eVar.f161481g.animate().alpha(1.0f).setDuration(300).start();
            return;
        }
        eVar.f161475a.setScaleX(f2);
        eVar.f161475a.setScaleY(f2);
        eVar.f161481g.setVisibility(i);
    }

    /* renamed from: b */
    private void m127148b(MediaModel mediaModel, AbstractC72046a aVar) {
        double d = (double) mediaModel.f134672l;
        double d2 = (double) mediaModel.f134673m;
        Double.isNaN(d2);
        if (d <= d2 * 2.4d) {
            double d3 = (double) mediaModel.f134673m;
            double d4 = (double) mediaModel.f134672l;
            Double.isNaN(d4);
            if (d3 <= d4 * 2.4d) {
                aVar.mo114285a();
                return;
            }
        }
        C72200bs.m127398a(0, 1);
        new C79459a(this.f161436c).mo123050a(R.string.fqm).mo123053a();
        C40982q.m82520a("aweme_movie_import_error_rate", 1, new C69840ar().mo110187a("errorCode", (Integer) -9).mo110189a("errorMsg", "").mo110191a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ C89391z mo114272a(MediaModel mediaModel, C59179f fVar) {
        C72216f.m127414a(fVar);
        m127146a(fVar.f134656b, 1, fVar.f134657c, "select");
        C40982q.m82520a("aweme_movie_import_error_rate", 1, new C69840ar().mo110189a("errorCode", String.valueOf(fVar.f134659e)).mo110189a("errorMsg", fVar.f134660f).mo110189a("file_subfix", C84896h.m145874g(mediaModel.f134662b)).mo110191a());
        C72200bs.m127398a(fVar.f134659e, 0);
        C72053aa.m127203a(this.f161436c, fVar.f134659e, 1000);
        m127143a(mediaModel, false);
        return null;
    }

    /* renamed from: a */
    static /* synthetic */ C89391z m127140a(AbstractC72046a aVar, MediaModel mediaModel, C59179f fVar) {
        C72216f.m127414a(fVar);
        m127146a(fVar.f134656b, 0, fVar.f134657c, "select");
        aVar.mo114285a();
        m127143a(mediaModel, true);
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List<Object> list) {
        if (list.isEmpty()) {
            m127144a((C72050e) viewHolder, i, false);
        } else {
            m127144a((C72050e) viewHolder, i, true);
        }
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m127139a(MvImageChooseAdapter mvImageChooseAdapter, ViewGroup viewGroup, int i) {
        C72050e poll;
        boolean z;
        boolean a;
        MethodCollector.m26663i(9342);
        if (C72222k.f161905b == 0) {
            poll = null;
        } else {
            poll = C72222k.f161904a.poll();
        }
        int i2 = 0;
        if (poll == null) {
            poll = new C72050e(C1764a.m5927a(LayoutInflater.from(mvImageChooseAdapter.f161436c), R.layout.a8r, viewGroup, false));
        }
        poll.f161475a = (SmartImageView) poll.itemView.findViewById(R.id.cj3);
        poll.f161476b = (TextView) poll.itemView.findViewById(R.id.bla);
        poll.f161480f = (FrameLayout) poll.itemView.findViewById(R.id.b4o);
        poll.f161481g = poll.itemView.findViewById(R.id.dx3);
        poll.f161477c = (TextView) poll.itemView.findViewById(R.id.aqe);
        TextView textView = poll.f161477c;
        if (!mvImageChooseAdapter.f161442i) {
            i2 = 8;
        }
        textView.setVisibility(i2);
        if (C68085a.m120387a() == 0) {
            z = C68062ck.m120368a();
        } else {
            z = mvImageChooseAdapter.f161432B;
        }
        if (z) {
            float a2 = (float) C71812ep.m126783a(1.0d, C63247i.f143610a);
            poll.f161477c.setShadowLayer(a2, 0.0f, a2, C0643b.m2378c(mvImageChooseAdapter.f161436c, R.color.bo));
        }
        poll.f161478d = poll.itemView.findViewById(R.id.aqb);
        poll.f161479e = (ViewStub) poll.itemView.findViewById(R.id.fgb);
        poll.f161486l = mvImageChooseAdapter.f161447n;
        try {
            if (poll.itemView.getParent() != null) {
                try {
                    a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(poll.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) poll.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(poll.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = poll.getClass().getName();
        MethodCollector.m26664o(9342);
        return poll;
    }

    /* renamed from: a */
    private void m127144a(final C72050e eVar, int i, boolean z) {
        boolean z2;
        int i2;
        boolean z3;
        m127142a(eVar.f161475a);
        m127142a(eVar.f161481g);
        final MyMediaModel myMediaModel = this.f161446m.get(i);
        if (C68085a.m120387a() == 0) {
            z2 = C46916ew.m90216a();
        } else {
            z2 = this.f161431A;
        }
        if (z2) {
            eVar.f161476b.setBackgroundResource(R.drawable.fo);
            eVar.f161476b.setTextColor(C0643b.m2378c(this.f161436c, R.color.a9));
        }
        myMediaModel.f161470u = i;
        eVar.f161483i = myMediaModel;
        eVar.f161485k = i;
        FrameLayout frameLayout = eVar.f161480f;
        int i3 = 0;
        if (this.f161441h) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        frameLayout.setVisibility(i2);
        m127145a(eVar, z);
        if (eVar.f161484j != null) {
            eVar.f161484j.setVisibility(8);
        }
        if (this.f161457x.contains(myMediaModel.f134662b)) {
            eVar.mo114297b();
            eVar.f161484j.setVisibility(0);
        }
        if (!z) {
            String str = "file://" + myMediaModel.f134662b;
            if (!TextUtils.equals(eVar.f161482h, str)) {
                eVar.f161482h = str;
                mo114277a(eVar, i);
            }
        }
        eVar.itemView.setOnClickListener(new AbstractView$OnClickListenerC81432d() {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.C720431 */

            static {
                Covode.recordClassIndex(84699);
            }

            @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d
            /* renamed from: a */
            public final void mo77200a(View view) {
                if ((eVar.f161483i.f161471v >= 0 || !MvImageChooseAdapter.this.f161440g.mo114292b()) && MvImageChooseAdapter.this.f161439f != null) {
                    MvImageChooseAdapter.this.f161439f.mo114294a(view, myMediaModel);
                }
            }
        });
        eVar.f161480f.setOnClickListener(new AbstractView$OnClickListenerC81432d() {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.C720442 */

            static {
                Covode.recordClassIndex(84700);
            }

            @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d
            /* renamed from: a */
            public final void mo77200a(View view) {
                MvImageChooseAdapter mvImageChooseAdapter = MvImageChooseAdapter.this;
                C72050e eVar = eVar;
                if (eVar.f161483i.f161471v >= 0) {
                    C84911q.m145928d("MvImageChooseAdapter handleImageSelected unSelect originIndex " + eVar.f161483i.f161470u + " selectIndex " + eVar.f161483i.f161471v + " stack " + C73986be.m130119a());
                    int i = eVar.f161483i.f161471v;
                    int i2 = -1;
                    eVar.f161483i.f161471v = -1;
                    for (int i3 = 0; i3 < mvImageChooseAdapter.f161437d.size(); i3++) {
                        MyMediaModel myMediaModel = mvImageChooseAdapter.f161437d.get(i3);
                        if (TextUtils.equals(myMediaModel.f134661a, eVar.f161483i.f134661a)) {
                            i2 = i3;
                        }
                        if (myMediaModel.f161471v > i) {
                            myMediaModel.f161471v--;
                        }
                    }
                    if (i2 >= 0) {
                        mvImageChooseAdapter.f161437d.remove(i2);
                    }
                    if (mvImageChooseAdapter.f161437d.size() + 1 == mvImageChooseAdapter.f161434a) {
                        mvImageChooseAdapter.mo114283d();
                        mvImageChooseAdapter.notifyItemChanged(eVar.f161485k, new Object());
                    } else {
                        if (eVar.f161485k >= 0) {
                            mvImageChooseAdapter.notifyItemChanged(eVar.f161485k, new Object());
                        }
                        for (MyMediaModel myMediaModel2 : mvImageChooseAdapter.f161437d) {
                            mvImageChooseAdapter.notifyItemChanged(myMediaModel2.f161470u, new Object());
                        }
                    }
                    if (mvImageChooseAdapter.f161440g != null) {
                        mvImageChooseAdapter.f161440g.mo114290a(mvImageChooseAdapter.f161437d, EnumC72047b.THUMBNAIL, eVar.f161483i);
                        mvImageChooseAdapter.f161440g.mo114286a(eVar.f161483i, false);
                        return;
                    }
                    return;
                }
                C84911q.m145928d("MvImageChooseAdapter handleImageSelected select originIndex " + eVar.f161483i.f161470u + " selectIndex " + eVar.f161483i.f161471v);
                C84902i.m145889a(eVar.f161483i.f134662b, new C72169bd(mvImageChooseAdapter, eVar));
            }
        });
        eVar.f161476b.setOnClickListener(new View$OnClickListenerC72167bb(eVar));
        if (!myMediaModel.mo96674b() || !this.f161442i) {
            eVar.f161477c.setVisibility(8);
            eVar.f161478d.setVisibility(8);
        } else {
            eVar.f161477c.setText(m127147b(Math.round((((float) myMediaModel.f134668h) * 1.0f) / 1000.0f)));
            eVar.f161477c.setVisibility(0);
            if (C68085a.m120387a() == 0) {
                z3 = C68062ck.m120368a();
            } else {
                z3 = this.f161432B;
            }
            View view = eVar.f161478d;
            if (!z3) {
                i3 = 8;
            }
            view.setVisibility(i3);
        }
        if (i == 0 && this.f161448o) {
            C73975b.C73976a.f166071a.step(OpenAlbumPanelPerformanceMonitor.f166158a, "onBindFirst");
        } else if (i == mo114281c() && this.f161448o) {
            C73975b.C73976a.f166071a.step(OpenAlbumPanelPerformanceMonitor.f166158a, "bindAll");
        }
    }

    public MvImageChooseAdapter(Context context, int i, int i2, boolean z) {
        this.f161436c = context;
        this.f161455v = 1.0d;
        this.f161452s = i;
        this.f161448o = z;
        context.getResources().getDimensionPixelOffset(R.dimen.oj);
        this.f161438e = ((C13628n.m24504a(context) - ((i - 1) * ((int) C13628n.m24520b(context, 1.5f)))) - 0) / i;
        this.f161435b = context.getString(R.string.ad1);
        this.f161443j = i2;
    }

    /* renamed from: a */
    private static void m127146a(String str, int i, long j, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", (int) j);
            C40982q.m82523a("aweme_video_import_duration", jSONObject, new C69840ar().mo110189a("status", String.valueOf(i)).mo110189a("scene_name", str2).mo110189a(StringSet.type, str).mo110191a());
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
