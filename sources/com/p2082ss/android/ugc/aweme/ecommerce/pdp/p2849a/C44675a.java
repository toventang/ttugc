package com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2849a;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20745e;
import com.bytedance.lighten.p1477a.C20758o;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.lighten.p1477a.EnumC20760q;
import com.bytedance.lighten.p1477a.EnumC20767w;
import com.bytedance.lighten.p1477a.p1480c.AbstractC20734k;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.Image;
import com.p2082ss.android.ugc.aweme.ecommerce.gallery.C44482a;
import com.p2082ss.android.ugc.aweme.ecommerce.gallery.transfer.C44503d;
import com.p2082ss.android.ugc.aweme.ecommerce.p2819ab.PDPHeaderImageExperiment;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2851c.C44766a;
import com.p2082ss.android.ugc.aweme.ecommerce.preloader.C45090c;
import com.p2082ss.android.ugc.aweme.ecommerce.preloader.C45103e;
import com.p2082ss.android.ugc.aweme.ecommerce.util.C45562g;
import com.p2082ss.android.ugc.aweme.ecommerce.util.C45563h;
import com.p2082ss.android.ugc.trill.R;
import dmt.viewpager.DmtViewPager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89546bf;
import kotlinx.coroutines.C89561bs;
import kotlinx.coroutines.C89624i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.a.a */
public final class C44675a extends PagerAdapter {

    /* renamed from: a */
    public boolean f104239a = true;

    /* renamed from: b */
    public AbstractC89172b<? super Image, C89391z> f104240b;

    /* renamed from: c */
    public AbstractC89172b<? super Boolean, C89391z> f104241c;

    /* renamed from: d */
    public AbstractC89183m<? super Boolean, ? super Integer, C89391z> f104242d;

    /* renamed from: e */
    public final List<Image> f104243e;

    /* renamed from: f */
    public final DmtViewPager f104244f;

    /* renamed from: g */
    private final String f104245g;

    static {
        Covode.recordClassIndex(53061);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.f104243e.size();
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.a.a$c */
    static final class View$OnClickListenerC44678c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C44675a f104254a;

        /* renamed from: b */
        final /* synthetic */ int f104255b;

        /* renamed from: c */
        final /* synthetic */ ViewGroup f104256c;

        static {
            Covode.recordClassIndex(53064);
        }

        View$OnClickListenerC44678c(C44675a aVar, int i, ViewGroup viewGroup) {
            this.f104254a = aVar;
            this.f104255b = i;
            this.f104256c = viewGroup;
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.a.a$c$b */
        static final class C44680b implements C44503d.AbstractC44505b {

            /* renamed from: a */
            final /* synthetic */ View$OnClickListenerC44678c f104259a;

            /* renamed from: b */
            final /* synthetic */ List f104260b;

            static {
                Covode.recordClassIndex(53066);
            }

            C44680b(View$OnClickListenerC44678c cVar, List list) {
                this.f104259a = cVar;
                this.f104260b = list;
            }

            @Override // com.p2082ss.android.ugc.aweme.ecommerce.gallery.transfer.C44503d.AbstractC44505b
            /* renamed from: a */
            public final void mo75518a() {
                AbstractC89183m<? super Boolean, ? super Integer, C89391z> mVar = this.f104259a.f104254a.f104242d;
                if (mVar != null) {
                    mVar.invoke(false, Integer.valueOf(this.f104259a.f104255b));
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.a.a$c$a */
        static final class C44679a implements C44503d.AbstractC44506c {

            /* renamed from: a */
            final /* synthetic */ View$OnClickListenerC44678c f104257a;

            /* renamed from: b */
            final /* synthetic */ List f104258b;

            static {
                Covode.recordClassIndex(53065);
            }

            C44679a(View$OnClickListenerC44678c cVar, List list) {
                this.f104257a = cVar;
                this.f104258b = list;
            }

            @Override // com.p2082ss.android.ugc.aweme.ecommerce.gallery.transfer.C44503d.AbstractC44506c
            /* renamed from: a */
            public final void mo75519a(int i) {
                this.f104257a.f104254a.f104244f.setCurrentItem(i);
            }
        }

        public final void onClick(View view) {
            Object obj;
            ClickAgent.onClick(view);
            if (this.f104254a.f104239a) {
                AbstractC89172b<? super Image, C89391z> bVar = this.f104254a.f104240b;
                if (bVar != null) {
                    bVar.invoke(this.f104254a.f104243e.get(this.f104255b));
                }
                List<Image> list = this.f104254a.f104243e;
                ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    List<String> list2 = it.next().toImageUrlModel().f48941a;
                    if (list2 == null || (obj = C89070n.m154561b((List) list2, 0)) == null) {
                        obj = "";
                    }
                    arrayList.add(obj);
                }
                ArrayList arrayList2 = arrayList;
                Context context = this.f104256c.getContext();
                if (context != null) {
                    AbstractC89183m<? super Boolean, ? super Integer, C89391z> mVar = this.f104254a.f104242d;
                    if (mVar != null) {
                        mVar.invoke(true, Integer.valueOf(this.f104255b));
                    }
                    C44482a.m87167a(context, this.f104255b, arrayList2.size(), arrayList2, null, null, null, new C44680b(this, arrayList2), new C44679a(this, arrayList2), null, 12784);
                }
            }
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean isViewFromObject(View view, Object obj) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(obj, "");
        return C89219l.m154714a(view, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        String uri;
        List<String> urls;
        MethodCollector.m26663i(7519);
        C89219l.m154721d(viewGroup, "");
        View a = C44766a.m87492a(viewGroup.getContext(), R.layout.pq, viewGroup, false);
        if (a != null) {
            SmartImageView smartImageView = (SmartImageView) a;
            smartImageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            viewGroup.addView(smartImageView);
            C45090c cVar = new C45090c();
            cVar.mo76187a(this.f104245g);
            cVar.mo76183a(i);
            cVar.mo76186a(this.f104243e.get(i));
            C20766v a2 = C45562g.m88109a((Object) this.f104243e.get(i)).mo34179a("CommerceHeadVH");
            a2.f49125v = EnumC20767w.CENTER_CROP;
            C20745e.C20746a aVar = new C20745e.C20746a();
            float f = C45563h.f106108d;
            aVar.f48963g = new C20745e.C20747b(f, f);
            C20745e a3 = aVar.mo34169a();
            C89219l.m154716b(a3, "");
            a2.f49126w = a3;
            a2.f49092E = smartImageView;
            if (i == 0) {
                Image image = this.f104243e.get(i);
                C89219l.m154721d(smartImageView, "");
                C89219l.m154721d(image, "");
                if (!(!PDPHeaderImageExperiment.INSTANCE.isProgressiveSwitch() || (uri = image.getUri()) == null || uri.length() == 0 || (urls = image.getUrls()) == null || urls.isEmpty())) {
                    AbstractC89568bz unused = C89624i.m155555a(C89561bs.f203280a, C89546bf.f203267b, null, new C45103e.C45104a(smartImageView, image, null), 2);
                }
                a2.f49088A = EnumC20760q.HIGH;
                a2.mo34181a(new C44676a(this, i, smartImageView, cVar));
            } else {
                a2.mo34181a(new C44677b(this, i, smartImageView, cVar));
            }
            smartImageView.setOnClickListener(new View$OnClickListenerC44678c(this, i, viewGroup));
            MethodCollector.m26664o(7519);
            return smartImageView;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.bytedance.lighten.loader.SmartImageView");
        MethodCollector.m26664o(7519);
        throw nullPointerException;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.a.a$b */
    public static final class C44677b implements AbstractC20734k {

        /* renamed from: a */
        final /* synthetic */ C44675a f104250a;

        /* renamed from: b */
        final /* synthetic */ int f104251b;

        /* renamed from: c */
        final /* synthetic */ SmartImageView f104252c;

        /* renamed from: d */
        final /* synthetic */ C45090c f104253d;

        static {
            Covode.recordClassIndex(53063);
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20734k
        /* renamed from: a */
        public final void mo34146a(Uri uri) {
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20734k
        /* renamed from: a */
        public final void mo34147a(Uri uri, View view) {
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20734k
        /* renamed from: a */
        public final void mo34148a(Uri uri, C20758o oVar) {
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20734k
        /* renamed from: a */
        public final void mo34149a(Uri uri, Throwable th) {
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20734k
        /* renamed from: a */
        public final void mo34159a(Uri uri, View view, Throwable th) {
            this.f104253d.mo76188a(th);
        }

        C44677b(C44675a aVar, int i, SmartImageView smartImageView, C45090c cVar) {
            this.f104250a = aVar;
            this.f104251b = i;
            this.f104252c = smartImageView;
            this.f104253d = cVar;
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20734k
        /* renamed from: a */
        public final void mo34158a(Uri uri, View view, C20758o oVar, Animatable animatable) {
            this.f104253d.mo76185a(oVar);
        }
    }

    public C44675a(List<Image> list, DmtViewPager dmtViewPager, String str) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(dmtViewPager, "");
        C89219l.m154721d(str, "");
        this.f104243e = list;
        this.f104244f = dmtViewPager;
        this.f104245g = str;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        MethodCollector.m26663i(7696);
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(obj, "");
        if (!(obj instanceof View)) {
            obj = null;
        }
        viewGroup.removeView((View) obj);
        MethodCollector.m26664o(7696);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.a.a$a */
    public static final class C44676a implements AbstractC20734k {

        /* renamed from: a */
        final /* synthetic */ C44675a f104246a;

        /* renamed from: b */
        final /* synthetic */ int f104247b;

        /* renamed from: c */
        final /* synthetic */ SmartImageView f104248c;

        /* renamed from: d */
        final /* synthetic */ C45090c f104249d;

        static {
            Covode.recordClassIndex(53062);
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20734k
        /* renamed from: a */
        public final void mo34146a(Uri uri) {
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20734k
        /* renamed from: a */
        public final void mo34147a(Uri uri, View view) {
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20734k
        /* renamed from: a */
        public final void mo34148a(Uri uri, C20758o oVar) {
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20734k
        /* renamed from: a */
        public final void mo34149a(Uri uri, Throwable th) {
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20734k
        /* renamed from: a */
        public final void mo34159a(Uri uri, View view, Throwable th) {
            AbstractC89172b<? super Boolean, C89391z> bVar = this.f104246a.f104241c;
            if (bVar != null) {
                bVar.invoke(false);
            }
            this.f104249d.mo76188a(th);
        }

        C44676a(C44675a aVar, int i, SmartImageView smartImageView, C45090c cVar) {
            this.f104246a = aVar;
            this.f104247b = i;
            this.f104248c = smartImageView;
            this.f104249d = cVar;
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20734k
        /* renamed from: a */
        public final void mo34158a(Uri uri, View view, C20758o oVar, Animatable animatable) {
            AbstractC89172b<? super Boolean, C89391z> bVar = this.f104246a.f104241c;
            if (bVar != null) {
                bVar.invoke(true);
            }
            this.f104249d.mo76185a(oVar);
        }
    }
}
